import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class253_Sub1 extends Class253 {

	@OriginalMember(owner = "client!uu", name = "kb", descriptor = "Lclient!oo;")
	public Class221 aClass221_2;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!aw;)V")
	public Class253_Sub1(@OriginalArg(0) Class9_Sub2 arg0) {
		super(arg0);
		this.aClass221_2 = new Class221(arg0);
		super.aClass19_Sub1_51 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_58 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_55 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_60 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_52 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_54 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_59 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_53 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_56 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
		super.aClass19_Sub1_57 = new Class19_Sub1_Sub1(super.aClass9_Sub2_18);
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	@Override
	public void method7885() {
		this.aClass221_2 = new Class221(super.aClass9_Sub2_18);
	}
}
