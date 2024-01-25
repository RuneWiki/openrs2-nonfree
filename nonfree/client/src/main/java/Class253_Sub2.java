import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class253_Sub2 extends Class253 {

	@OriginalMember(owner = "client!wm", name = "fb", descriptor = "Lclient!gj;")
	public Class105 aClass105_2;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class253_Sub2(@OriginalArg(0) Class9_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass105_2 = new Class105(arg0);
		super.aClass19_Sub1_51 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_58 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_55 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_60 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_52 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_54 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_59 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_53 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_56 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
		super.aClass19_Sub1_57 = new Class19_Sub1_Sub2(super.aClass9_Sub2_18);
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	@Override
	public void method7885() {
		this.aClass105_2 = new Class105((Class9_Sub2_Sub2) super.aClass9_Sub2_18);
	}
}
