import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class54_Sub2 extends Class54 {

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "Lclient!ft;")
	public Class107 aClass107_2;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class54_Sub2(@OriginalArg(0) Class42_Sub2_Sub2 arg0) {
		super(arg0);
		this.aClass107_2 = new Class107(arg0);
		super.aClass26_Sub1_55 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_57 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_58 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_60 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_51 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_56 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_54 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_52 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_59 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
		super.aClass26_Sub1_53 = new Class26_Sub1_Sub1(super.aClass42_Sub2_14);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public void method6537() {
		this.aClass107_2 = new Class107((Class42_Sub2_Sub2) super.aClass42_Sub2_14);
	}
}
