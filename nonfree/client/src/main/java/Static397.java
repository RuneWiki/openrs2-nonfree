import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
	public static int anInt6999;

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
	public static int anInt6998 = 0;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "[I")
	public static final int[] anIntArray394 = new int[32];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BII[BIII)Z")
	public static boolean method5596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg0 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg1 + 8 - 1) / 8);
		@Pc(45) int local45 = -((arg0 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local28; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local45; local51 < 0; local51++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local15;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg3;
		}
		return false;
	}
}
