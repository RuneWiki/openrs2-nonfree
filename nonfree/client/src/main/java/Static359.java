import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBI[BI)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 <= arg1) {
			return;
		}
		arg3 += arg1;
		@Pc(17) int local17 = arg0 - arg1 >> 2;
		while (true) {
			local17--;
			if (local17 < 0) {
				local17 = arg0 - arg1 & 0x3;
				while (true) {
					local17--;
					if (local17 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(26) int local26 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(31) int local31 = local26 + 1;
			arg2[local26] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg2[local31] = 1;
			arg3 = local36 + 1;
			arg2[local36] = 1;
		}
	}
}
