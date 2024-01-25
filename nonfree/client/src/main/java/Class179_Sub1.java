import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class179_Sub1 extends Class179 {

	@OriginalMember(owner = "client!kea", name = "eb", descriptor = "Lclient!tn;")
	public Class303 aClass303_1;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!af;)V")
	public Class179_Sub1(@OriginalArg(0) Class9_Sub1_Sub1 arg0) {
		super(arg0);
		this.aClass303_1 = new Class303(arg0);
		super.aClass23_Sub3_58 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_60 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_54 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_59 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_53 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_52 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_57 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_56 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_51 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
		super.aClass23_Sub3_55 = new Class23_Sub3_Sub1(super.aClass9_Sub1_16);
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
	@Override
	public void method7259() {
		this.aClass303_1 = new Class303((Class9_Sub1_Sub1) super.aClass9_Sub1_16);
	}
}
