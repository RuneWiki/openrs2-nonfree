import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZII[BI)V")
	public static void method1700(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(12) int local12 = arg3 - arg1 >> 2;
		arg0 += arg1;
		while (true) {
			local12--;
			if (local12 < 0) {
				local12 = arg3 - arg1 & 0x3;
				while (true) {
					local12--;
					if (local12 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(25) int local25 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local30] = 1;
			arg0 = local35 + 1;
			arg2[local35] = 1;
		}
	}
}
