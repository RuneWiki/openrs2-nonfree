import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIZII)V")
	public static void method82(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 >= arg0) {
			return;
		}
		arg3 += arg2;
		@Pc(19) int local19 = arg0 - arg2 >> 2;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg0 - arg2 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg1[arg3++] = 1;
				}
			}
			@Pc(25) int local25 = arg3 + 1;
			arg1[arg3] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg1[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg1[local30] = 1;
			arg3 = local35 + 1;
			arg1[local35] = 1;
		}
	}
}
