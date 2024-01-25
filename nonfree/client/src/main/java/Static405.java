import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BIIII[B)V")
	public static void method4995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(11) int local11 = arg0 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local11--;
			if (local11 < 0) {
				local11 = arg0 - arg1 & 0x3;
				while (true) {
					local11--;
					if (local11 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(21) int local21 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(26) int local26 = local21 + 1;
			arg3[local21] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg3[local26] = 1;
			arg2 = local31 + 1;
			arg3[local31] = 1;
		}
	}
}
