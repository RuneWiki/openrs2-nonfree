import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!pu", name = "m", descriptor = "Lclient!pj;")
	public static Class248 aClass248_77;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "Lclient!cc;")
	public static final Class45 aClass45_7 = new Class45("WTI", 5);

	@OriginalMember(owner = "client!pu", name = "t", descriptor = "I")
	public static int anInt7372 = 0;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method5885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg3 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local32; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local41; local51 < 0; local51++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
	public static void method5886() {
		Static571.aClass71_58 = null;
		Static147.aClass71_14 = null;
		Static31.aClass71_5 = null;
		Static526.aClass71_57 = null;
		Static40.aClass71_56 = null;
		Static469.aClass71_49 = null;
		Static241.aClass71Array29 = null;
		Static217.aClass71_23 = null;
		Static507.aClass71_53 = null;
	}
}
