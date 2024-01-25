import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
	public static int anInt2983;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "B")
	public static byte aByte32;

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
	public static int anInt2984 = 0;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "[I")
	public static final int[] anIntArray213 = new int[8];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method2786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg4 + arg1;
		@Pc(16) int local16 = arg2 + arg3;
		@Pc(20) int local20 = arg0 + arg5;
		if (!Static479.method6586(local16, arg4, arg5, local20, local20, local16, arg4, local12, local16)) {
			return false;
		} else if (Static479.method6586(local16, arg4, arg5, arg5, local20, local16, local12, local12, local16)) {
			if (arg4 >= Static279.anInt4497) {
				if (!Static479.method6586(arg2, local12, local20, arg5, local20, local16, local12, local12, local16)) {
					return false;
				}
				if (!Static479.method6586(arg2, local12, local20, arg5, arg5, local16, local12, local12, arg2)) {
					return false;
				}
			} else if (!Static479.method6586(arg2, arg4, local20, arg5, local20, local16, arg4, arg4, local16)) {
				return false;
			} else if (!Static479.method6586(arg2, arg4, local20, arg5, arg5, local16, arg4, arg4, arg2)) {
				return false;
			}
			if (arg5 < Static398.anInt5802) {
				if (!Static479.method6586(arg2, arg4, arg5, arg5, arg5, local16, arg4, local12, local16)) {
					return false;
				}
				if (!Static479.method6586(arg2, arg4, arg5, arg5, arg5, local16, local12, local12, arg2)) {
					return false;
				}
			} else if (!Static479.method6586(arg2, arg4, local20, local20, local20, local16, arg4, local12, local16)) {
				return false;
			} else if (!Static479.method6586(arg2, arg4, local20, local20, local20, local16, local12, local12, arg2)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
