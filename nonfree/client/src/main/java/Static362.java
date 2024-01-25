import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIIII)V")
	public static void method3439(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 <= arg2) {
			return;
		}
		arg3 += arg2;
		@Pc(18) int local18 = arg1 - arg2 >> 2;
		while (true) {
			local18--;
			if (local18 < 0) {
				local18 = arg1 - arg2 & 0x3;
				while (true) {
					local18--;
					if (local18 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			arg3 = local39 + 1;
			arg0[local39] = 1;
		}
	}
}
