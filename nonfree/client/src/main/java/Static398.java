import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIZ[B)V")
	public static void method3360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(14) int local14 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg2 - arg0 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(30) int local30 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg3[local30] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg3[local35] = 1;
			arg1 = local40 + 1;
			arg3[local40] = 1;
		}
	}
}
