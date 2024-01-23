import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class82 {

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "[Lclient!q;")
	private Class4_Sub2[] aClass4_Sub2Array1;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class82(@OriginalArg(0) int arg0) {
		this.aClass4_Sub2Array1 = new Class4_Sub2[arg0];
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			@Pc(23) Class4_Sub2 local23 = this.aClass4_Sub2Array1[local7] = new Class4_Sub2();
			local23.aClass4_Sub2_68 = local23;
			local23.aClass4_Sub2_69 = local23;
		}
	}
}
