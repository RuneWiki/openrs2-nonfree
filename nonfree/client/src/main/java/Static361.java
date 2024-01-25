import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII[B)V")
	public static void method2481(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(13) int local13 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local13--;
			if (local13 < 0) {
				local13 = arg2 - arg0 & 0x3;
				while (true) {
					local13--;
					if (local13 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(28) int local28 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(33) int local33 = local28 + 1;
			arg3[local28] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local33] = 1;
			arg1 = local38 + 1;
			arg3[local38] = 1;
		}
	}
}
