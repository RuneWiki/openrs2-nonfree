import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "([BIIIII)V")
	public static void method1977(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(14) int local14 = arg2 - arg1 >> 2;
		arg3 += arg1;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg2 - arg1 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
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
