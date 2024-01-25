import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!dv", name = "W", descriptor = "Lclient!gd;")
	public Class116 aClass116_2;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class77_Sub1(@OriginalArg(0) Class121_Sub1_Sub2 arg0) {
		super(arg0);
		this.aClass116_2 = new Class116(arg0);
		super.aClass22_Sub1_43 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_44 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_41 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_50 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_46 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_47 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_48 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_45 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_49 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
		super.aClass22_Sub1_42 = new Class22_Sub1_Sub1(super.aClass121_Sub1_10);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	@Override
	public void method2705() {
		this.aClass116_2 = new Class116((Class121_Sub1_Sub2) super.aClass121_Sub1_10);
	}
}
