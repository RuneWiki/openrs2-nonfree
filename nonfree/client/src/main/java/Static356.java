import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BBIIII)V")
	public static void method477(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1 >= arg2) {
			return;
		}
		arg3 += arg1;
		@Pc(26) int local26 = arg2 - arg1 >> 2;
		while (true) {
			local26--;
			if (local26 < 0) {
				local26 = arg2 - arg1 & 0x3;
				while (true) {
					local26--;
					if (local26 < 0) {
						return;
					}
					arg0[arg3++] = 1;
				}
			}
			@Pc(33) int local33 = arg3 + 1;
			arg0[arg3] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg3 = local43 + 1;
			arg0[local43] = 1;
		}
	}
}
