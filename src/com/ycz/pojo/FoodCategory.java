package com.ycz.pojo;

/**
 * 
 * @ClassName FoodCategory
 * @Description TODO(菜品分类信息实体)
 * @author Administrator
 * @Date 2020年4月11日 下午3:25:31
 * @version 1.0.0
 */
public class FoodCategory {
    
    private Long id;//主键ID
    private String name;//菜品分类名称
    private String remark;//备注内容
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getRemark() {
        return remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }

    
    
}
