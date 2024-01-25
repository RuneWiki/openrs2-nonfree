import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIII[BI)V")
	public static void method3944(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		arg0 += arg3;
		@Pc(14) int local14 = arg1 - arg3 >> 2;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg1 - arg3 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(21) int local21 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(26) int local26 = local21 + 1;
			arg2[local21] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg2[local26] = 1;
			arg0 = local31 + 1;
			arg2[local31] = 1;
		}
	}
}
