import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!fw", name = "lb", descriptor = "Lclient!caa;")
	public Class40 lb;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!hv;)V")
	public Class99_Sub1(@OriginalArg(0) Class5_Sub2_Sub1 arg0) {
		super(arg0);
		this.lb = new Class40(arg0);
		super.aClass2_Sub1_41 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_42 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_50 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_48 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_47 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_43 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_45 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_46 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_49 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
		super.aClass2_Sub1_44 = new Class2_Sub1_Sub2(super.aClass5_Sub2_14);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.lb = new Class40((Class5_Sub2_Sub1) super.aClass5_Sub2_14);
	}
}
