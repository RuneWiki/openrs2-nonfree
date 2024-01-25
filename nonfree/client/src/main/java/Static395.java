import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BIII[BI)V")
	public static void method2489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = arg0 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg0 - arg1 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
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
