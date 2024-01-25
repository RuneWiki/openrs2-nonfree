import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "[Lclient!pk;")
	public static Interface20[] anInterface20Array1;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_119 = new Class268(50, -1);

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIZ)I")
	public static int method5757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class6_Sub16 local8 = Static148.method2357(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray173.length) {
			return local8.anIntArray173[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[BIIII)Z")
	public static boolean method5758(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(21) int local21;
		if (local9 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local9;
		}
		@Pc(35) int local35 = -((arg3 + 7) / 8);
		@Pc(44) int local44 = -((arg2 + 8 - 1) / 8);
		for (@Pc(46) int local46 = local35; local46 < 0; local46++) {
			for (@Pc(50) int local50 = local44; local50 < 0; local50++) {
				if (arg1[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local21;
			if (arg1[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg0;
		}
		return false;
	}
}
