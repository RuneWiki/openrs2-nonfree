import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII[B)V")
	public static void method5429(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		arg2 += arg0;
		@Pc(19) int local19 = arg1 - arg0 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg1 - arg0 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(30) int local30 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local35] = 1;
			arg2 = local40 + 1;
			arg3[local40] = 1;
		}
	}
}
