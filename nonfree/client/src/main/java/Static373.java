import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBIII[B)V")
	public static void method4039(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(11) int local11 = arg0 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local11--;
			if (local11 < 0) {
				local11 = arg0 - arg2 & 0x3;
				while (true) {
					local11--;
					if (local11 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(25) int local25 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg3[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local30] = 1;
			arg1 = local35 + 1;
			arg3[local35] = 1;
		}
	}
}
