import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBIIIII)Z")
	public static boolean method1621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg2 + arg0;
		@Pc(17) int local17 = arg1 + arg4;
		@Pc(21) int local21 = arg3 + arg5;
		if (!Static561.method7582(local8, local21, local17, local21, arg2, local17, arg5, local17, arg2)) {
			return false;
		} else if (Static561.method7582(local8, arg5, local17, local21, arg2, local17, arg5, local17, local8)) {
			if (arg2 < Static465.anInt8057) {
				if (!Static561.method7582(arg2, arg5, local17, local21, arg2, arg1, local21, local17, arg2)) {
					return false;
				}
				if (!Static561.method7582(arg2, arg5, local17, arg5, arg2, arg1, local21, arg1, arg2)) {
					return false;
				}
			} else if (!Static561.method7582(local8, arg5, local17, local21, local8, arg1, local21, local17, local8)) {
				return false;
			} else if (!Static561.method7582(local8, arg5, local17, arg5, local8, arg1, local21, arg1, local8)) {
				return false;
			}
			if (Static525.anInt8938 > arg5) {
				if (!Static561.method7582(local8, arg5, local17, arg5, arg2, arg1, arg5, local17, arg2)) {
					return false;
				}
				if (!Static561.method7582(local8, arg5, local17, arg5, arg2, arg1, arg5, arg1, local8)) {
					return false;
				}
			} else if (!Static561.method7582(local8, local21, local17, local21, arg2, arg1, local21, local17, arg2)) {
				return false;
			} else if (!Static561.method7582(local8, local21, local17, local21, arg2, arg1, local21, arg1, local8)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
