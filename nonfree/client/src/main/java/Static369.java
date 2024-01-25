import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIB[BI)V")
	public static void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(14) int local14 = arg1 - arg2 >> 2;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg1 - arg2 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
						return;
					}
					arg3[arg0++] = 1;
				}
			}
			@Pc(34) int local34 = arg0 + 1;
			arg3[arg0] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			@Pc(44) int local44 = local39 + 1;
			arg3[local39] = 1;
			arg0 = local44 + 1;
			arg3[local44] = 1;
		}
	}
}
