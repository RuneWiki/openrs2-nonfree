import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
	public static final int[] anIntArray130 = new int[4096];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[BI)V")
	public static void method805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		arg2 += arg0;
		@Pc(24) int local24 = arg1 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg2 = local39 + 1;
			arg3[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Z")
	public static boolean method807(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
	public static boolean method808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
