import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!oi", name = "L", descriptor = "J")
	public static long aLong199;

	@OriginalMember(owner = "client!oi", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!oi", name = "J", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_150 = new Class359(75, 3);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method6265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 + arg2;
		@Pc(11) int local11 = arg4 + arg0;
		@Pc(15) int local15 = arg3 + arg1;
		if (!Static395.method5806(local11, arg2, local11, arg3, local15, local11, arg2, local15, local7)) {
			return false;
		} else if (Static395.method5806(local11, arg2, local11, arg3, local15, local11, local7, arg3, local7)) {
			if (arg2 >= Static66.anInt6449) {
				if (!Static395.method5806(local11, local7, arg4, local15, local15, local11, local7, arg3, local7)) {
					return false;
				}
				if (!Static395.method5806(arg4, local7, arg4, local15, arg3, local11, local7, arg3, local7)) {
					return false;
				}
			} else if (!Static395.method5806(local11, arg2, arg4, local15, local15, local11, arg2, arg3, arg2)) {
				return false;
			} else if (!Static395.method5806(arg4, arg2, arg4, local15, arg3, local11, arg2, arg3, arg2)) {
				return false;
			}
			if (arg3 < Static309.anInt5881) {
				if (!Static395.method5806(local11, arg2, arg4, arg3, arg3, local11, arg2, arg3, local7)) {
					return false;
				}
				if (!Static395.method5806(arg4, arg2, arg4, arg3, arg3, local11, local7, arg3, local7)) {
					return false;
				}
			} else if (!Static395.method5806(local11, arg2, arg4, local15, local15, local11, arg2, local15, local7)) {
				return false;
			} else if (!Static395.method5806(arg4, arg2, arg4, local15, local15, local11, local7, local15, local7)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
