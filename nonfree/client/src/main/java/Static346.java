import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!me", name = "N", descriptor = "I")
	public static int anInt6385;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBII[BII)Z")
	public static boolean method5541(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg4 + 8 - 1) / 8);
		for (@Pc(44) int local44 = local32; local44 < 0; local44++) {
			for (@Pc(48) int local48 = local42; local48 < 0; local48++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local16;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V")
	public static void method5545(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(11, arg0);
		local12.method1473();
	}
}
