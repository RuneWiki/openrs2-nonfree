import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BIIII[B)V")
	public static void method5399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(14) int local14 = arg1 - arg0 >> 2;
		arg2 += arg0;
		while (true) {
			local14--;
			if (local14 < 0) {
				local14 = arg1 - arg0 & 0x3;
				while (true) {
					local14--;
					if (local14 < 0) {
						return;
					}
					arg3[arg2++] = 1;
				}
			}
			@Pc(31) int local31 = arg2 + 1;
			arg3[arg2] = 1;
			@Pc(36) int local36 = local31 + 1;
			arg3[local31] = 1;
			@Pc(41) int local41 = local36 + 1;
			arg3[local36] = 1;
			arg2 = local41 + 1;
			arg3[local41] = 1;
		}
	}
}
