import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public final class Class94_Sub2 extends Class94 {

	@OriginalMember(owner = "client!p", name = "U", descriptor = "Lclient!gh;")
	public Class123 aClass123_2;

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!ega;)V")
	public Class94_Sub2(@OriginalArg(0) Class66_Sub2_Sub1 arg0) {
		super(arg0);
		this.aClass123_2 = new Class123(arg0);
		super.aClass9_Sub1_60 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_55 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_54 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_57 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_58 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_53 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_59 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_56 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_51 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
		super.aClass9_Sub1_52 = new Class9_Sub1_Sub1(super.aClass66_Sub2_15);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	@Override
	public void method5764() {
		this.aClass123_2 = new Class123((Class66_Sub2_Sub1) super.aClass66_Sub2_15);
	}
}
