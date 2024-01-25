import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "()V")
	public static void method4591() {
		Static605.aClass321_3 = Static605.aClass321_2;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BIIIII[B)Z")
	public static boolean method4592(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(15) int local15 = arg1 % 8;
		@Pc(24) int local24;
		if (local15 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local15;
		}
		@Pc(38) int local38 = -((arg0 + 7) / 8);
		@Pc(47) int local47 = -((arg1 + 7) / 8);
		for (@Pc(49) int local49 = local38; local49 < 0; local49++) {
			for (@Pc(55) int local55 = local47; local55 < 0; local55++) {
				if (arg4[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local24;
			if (arg4[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
