import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString145;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "F")
	public static float aFloat246 = 0.0F;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)Z")
	public static boolean method7672() {
		return Static484.anInt7715 > 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIBI)Z")
	public static boolean method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg2 + arg5;
		@Pc(16) int local16 = arg3 + arg1;
		@Pc(20) int local20 = arg4 + arg0;
		if (!Static523.method6730(arg0, local12, local20, arg5, arg5, local16, local16, local16, local20)) {
			return false;
		} else if (Static523.method6730(arg0, local12, local20, local12, arg5, local16, local16, local16, arg0)) {
			if (Static297.anInt4992 <= arg5) {
				if (!Static523.method6730(local20, local12, local20, local12, local12, local16, local16, arg1, arg0)) {
					return false;
				}
				if (!Static523.method6730(local20, local12, arg0, local12, local12, local16, arg1, arg1, arg0)) {
					return false;
				}
			} else if (!Static523.method6730(local20, arg5, local20, arg5, arg5, local16, local16, arg1, arg0)) {
				return false;
			} else if (!Static523.method6730(local20, arg5, arg0, arg5, arg5, local16, arg1, arg1, arg0)) {
				return false;
			}
			if (arg0 >= Static316.anInt5329) {
				if (!Static523.method6730(local20, local12, local20, arg5, arg5, local16, local16, arg1, local20)) {
					return false;
				}
				if (!Static523.method6730(local20, local12, local20, local12, arg5, local16, arg1, arg1, local20)) {
					return false;
				}
			} else if (!Static523.method6730(arg0, local12, arg0, arg5, arg5, local16, local16, arg1, arg0)) {
				return false;
			} else if (!Static523.method6730(arg0, local12, arg0, local12, arg5, local16, arg1, arg1, arg0)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
