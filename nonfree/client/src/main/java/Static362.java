import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII[B)V")
	public static void method2605(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(19) int local19 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local19--;
			if (local19 < 0) {
				local19 = arg2 - arg0 & 0x3;
				while (true) {
					local19--;
					if (local19 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg3[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg3[local34] = 1;
			arg1 = local39 + 1;
			arg3[local39] = 1;
		}
	}
}
