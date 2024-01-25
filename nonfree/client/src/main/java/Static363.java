import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[BIII)V")
	public static void method3135(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg3) {
			return;
		}
		arg0 += arg3;
		@Pc(22) int local22 = arg2 - arg3 >> 2;
		while (true) {
			local22--;
			if (local22 < 0) {
				local22 = arg2 - arg3 & 0x3;
				while (true) {
					local22--;
					if (local22 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(31) int local31 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg1[local31] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg1[local36] = 1;
			arg0 = local41 + 1;
			arg1[local41] = 1;
		}
	}
}
