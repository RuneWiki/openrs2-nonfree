import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BIII)V")
	public static void method5295(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg0) {
			return;
		}
		arg3 += arg2;
		@Pc(27) int local27 = arg0 - arg2 >> 2;
		while (true) {
			local27--;
			if (local27 < 0) {
				local27 = arg0 - arg2 & 0x3;
				while (true) {
					local27--;
					if (local27 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(36) int local36 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg1[local36] = 1;
			@Pc(46) int local46 = local41 + 1;
			arg1[local41] = 1;
			arg3 = local46 + 1;
			arg1[local46] = 1;
		}
	}
}
