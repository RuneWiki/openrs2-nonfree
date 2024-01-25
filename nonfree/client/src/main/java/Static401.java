import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII[BI)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		arg1 += arg0;
		@Pc(15) int local15 = arg2 - arg0 >> 2;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg2 - arg0 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(24) int local24 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(29) int local29 = local24 + 1;
			arg3[local24] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			arg1 = local34 + 1;
			arg3[local34] = 1;
		}
	}
}
