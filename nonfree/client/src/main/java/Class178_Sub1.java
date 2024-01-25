import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class178_Sub1 extends Class178 {

	@OriginalMember(owner = "client!mu", name = "jb", descriptor = "Lclient!wq;")
	public Class317 aClass317_2;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class178_Sub1(@OriginalArg(0) Class62_Sub2_Sub1 arg0) {
		super(arg0);
		this.aClass317_2 = new Class317(arg0);
		super.aClass36_Sub1_48 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_43 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_46 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_41 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_47 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_44 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_42 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_50 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_45 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
		super.aClass36_Sub1_49 = new Class36_Sub1_Sub1(super.aClass62_Sub2_12);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	@Override
	public void method5644() {
		this.aClass317_2 = new Class317((Class62_Sub2_Sub1) super.aClass62_Sub2_12);
	}
}
