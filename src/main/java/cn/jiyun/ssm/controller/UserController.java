package cn.jiyun.ssm.controller;

import cn.jiyun.ssm.pojo.User;
import cn.jiyun.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller//表明一个控制器
@RequestMapping("user")//该模块是用户模块
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("{id}")
    @ResponseBody
    public User queryUserById(@PathVariable("id")Long id){

        return this.userService.queryUserById(id);
    }

    @GetMapping("test")
    @ResponseBody
    public String test(){
        return "Hello User";
    }
}
