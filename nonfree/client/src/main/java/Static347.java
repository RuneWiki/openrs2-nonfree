import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray48;

	@OriginalMember(owner = "client!rl", name = "gb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII[BIZ)Z")
	public static boolean method4485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg0 + 8 - 1) / 8);
		@Pc(42) int local42 = -((arg2 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local32; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local42; local53 < 0; local53++) {
				if (arg3[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg3[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}
}
