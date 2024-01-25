import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!cca", name = "cb", descriptor = "Lclient!lca;")
	public Class188 aClass188_1;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!mq;)V")
	public Class44_Sub1(@OriginalArg(0) Class14_Sub1_Sub2 arg0) {
		super(arg0);
		this.aClass188_1 = new Class188(arg0);
		super.aClass20_Sub1_44 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_50 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_46 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_43 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_45 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_42 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_48 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_47 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_41 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
		super.aClass20_Sub1_49 = new Class20_Sub1_Sub1(super.aClass14_Sub1_14);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	@Override
	public void method6771() {
		this.aClass188_1 = new Class188((Class14_Sub1_Sub2) super.aClass14_Sub1_14);
	}
}
