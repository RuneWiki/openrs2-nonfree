import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public final class Class2_Sub1_Sub14 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "Lclient!ko;")
	public final Class15_Sub3_Sub3_Sub5 aClass15_Sub3_Sub3_Sub5_1;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!ko;)V")
	public Class2_Sub1_Sub14(@OriginalArg(0) Class15_Sub3_Sub3_Sub5 arg0) {
		this.aClass15_Sub3_Sub3_Sub5_1 = arg0;
	}
}
