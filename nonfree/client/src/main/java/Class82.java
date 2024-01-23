import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class82 {

	@OriginalMember(owner = "client!il", name = "b", descriptor = "[Lclient!ge;")
	private Class2_Sub3[] aClass2_Sub3Array1;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.aClass2_Sub3Array1 = new Class2_Sub3[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) Class2_Sub3 local23 = this.aClass2_Sub3Array1[local7] = new Class2_Sub3();
			local23.aClass2_Sub3_69 = local23;
			local23.aClass2_Sub3_68 = local23;
		}
	}
}
