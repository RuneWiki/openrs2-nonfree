import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB[BIII)V")
	public static void method2336(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(14) int local14 = arg1 - arg2 >> 2;
		arg3 += arg2;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg1 - arg2 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(25) int local25 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg0[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg0[local30] = 1;
			arg3 = local35 + 1;
			arg0[local35] = 1;
		}
	}
}
