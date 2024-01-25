import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
	public static int anInt2883;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	public static int anInt2885;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_45 = new Class314(61, -1);

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
	public static final int anInt2884 = 52;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method2404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 + arg5;
		@Pc(11) int local11 = arg1 + arg4;
		@Pc(16) int local16 = arg2 + arg3;
		if (!Static556.method7897(local11, local7, local16, arg5, local11, arg2, arg5, local11, local16)) {
			return false;
		} else if (Static556.method7897(local11, local7, local16, arg5, local11, arg2, local7, local11, arg2)) {
			if (Static540.anInt9068 > arg5) {
				if (!Static556.method7897(local11, arg5, local16, arg5, arg4, local16, arg5, local11, arg2)) {
					return false;
				}
				if (!Static556.method7897(local11, arg5, arg2, arg5, arg4, local16, arg5, arg4, arg2)) {
					return false;
				}
			} else if (!Static556.method7897(local11, local7, local16, local7, arg4, local16, local7, local11, arg2)) {
				return false;
			} else if (!Static556.method7897(local11, local7, arg2, local7, arg4, local16, local7, arg4, arg2)) {
				return false;
			}
			if (arg2 >= Static536.anInt9043) {
				if (!Static556.method7897(local11, local7, local16, arg5, arg4, local16, arg5, local11, local16)) {
					return false;
				}
				if (!Static556.method7897(local11, local7, local16, arg5, arg4, local16, local7, arg4, local16)) {
					return false;
				}
			} else if (!Static556.method7897(local11, local7, arg2, arg5, arg4, arg2, arg5, local11, arg2)) {
				return false;
			} else if (!Static556.method7897(local11, local7, arg2, arg5, arg4, arg2, local7, arg4, arg2)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method2406(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static212.method3301(0, arg1, arg0, arg1.length - 1);
	}
}
