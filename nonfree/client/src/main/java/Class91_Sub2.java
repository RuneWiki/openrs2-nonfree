import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class91_Sub2 extends Class91 {

	@OriginalMember(owner = "client!hda", name = "bb", descriptor = "Lclient!jb;")
	public Class165 aClass165_1;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!jfa;)V")
	public Class91_Sub2(@OriginalArg(0) Class15_Sub1_Sub2 arg0) {
		super(arg0);
		this.aClass165_1 = new Class165(arg0);
		super.aClass21_Sub1_37 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_34 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_35 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_31 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_32 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_39 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_38 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_36 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_33 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
		super.aClass21_Sub1_40 = new Class21_Sub1_Sub2(super.aClass15_Sub1_10);
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
	@Override
	public void method3266() {
		this.aClass165_1 = new Class165((Class15_Sub1_Sub2) super.aClass15_Sub1_10);
	}
}
