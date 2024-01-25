import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public final class Class178_Sub2 extends Class178 {

	@OriginalMember(owner = "client!pg", name = "hb", descriptor = "Lclient!eq;")
	public Class90 aClass90_1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lclient!vda;)V")
	public Class178_Sub2(@OriginalArg(0) Class62_Sub2 arg0) {
		super(arg0);
		this.aClass90_1 = new Class90(arg0);
		super.aClass36_Sub1_48 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_43 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_46 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_41 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_47 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_44 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_42 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_50 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_45 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
		super.aClass36_Sub1_49 = new Class36_Sub1_Sub2(super.aClass62_Sub2_12);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	@Override
	public void method5644() {
		this.aClass90_1 = new Class90(super.aClass62_Sub2_12);
	}
}
