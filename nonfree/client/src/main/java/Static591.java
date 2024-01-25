import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!vc", name = "r", descriptor = "[[[Lclient!cj;")
	public static Class56[][][] aClass56ArrayArrayArray3;

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	public static int anInt10108;

	@OriginalMember(owner = "client!vc", name = "Bb", descriptor = "I")
	public static int anInt10125 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method8163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 + arg3;
		@Pc(11) int local11 = arg0 + arg4;
		@Pc(15) int local15 = arg2 + arg5;
		if (!Static97.method2223(local11, local7, arg3, local11, local15, local15, local11, arg2, arg3)) {
			return false;
		} else if (Static97.method2223(local11, local7, arg3, local11, local15, arg2, local11, arg2, local7)) {
			if (Static143.anInt3624 > arg3) {
				if (!Static97.method2223(local11, arg3, arg3, local11, local15, arg2, arg4, local15, arg3)) {
					return false;
				}
				if (!Static97.method2223(arg4, arg3, arg3, local11, arg2, arg2, arg4, local15, arg3)) {
					return false;
				}
			} else if (!Static97.method2223(local11, local7, local7, local11, local15, arg2, arg4, local15, local7)) {
				return false;
			} else if (!Static97.method2223(arg4, local7, local7, local11, arg2, arg2, arg4, local15, local7)) {
				return false;
			}
			if (arg2 < Static11.anInt160) {
				if (!Static97.method2223(local11, local7, arg3, local11, arg2, arg2, arg4, arg2, arg3)) {
					return false;
				}
				if (!Static97.method2223(arg4, local7, arg3, local11, arg2, arg2, arg4, arg2, local7)) {
					return false;
				}
			} else if (!Static97.method2223(local11, local7, arg3, local11, local15, local15, arg4, local15, arg3)) {
				return false;
			} else if (!Static97.method2223(arg4, local7, arg3, local11, local15, local15, arg4, local15, local7)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)V")
	public static void method8170() {
		if (Static277.aClass313_9 != Static253.aClass313_8) {
			try {
				Static646.method1435("tbrefresh", Static227.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
