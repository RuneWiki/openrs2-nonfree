import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Lclient!bu;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!qga;")
	public static Class290 aClass290_2;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Lclient!ni;")
	public static final Class249 aClass249_1 = new Class249("WIP", 2);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg5 + arg3;
		@Pc(17) int local17 = arg0 + arg1;
		@Pc(21) int local21 = arg2 + arg4;
		if (!Static33.method558(local21, arg2, local17, local7, arg3, arg3, local17, local17, local21)) {
			return false;
		} else if (Static33.method558(local21, arg2, local17, local7, local7, arg3, local17, local17, arg2)) {
			if (Static225.anInt3671 > arg3) {
				if (!Static33.method558(local21, local21, local17, arg3, arg3, arg3, arg0, local17, arg2)) {
					return false;
				}
				if (!Static33.method558(arg2, local21, arg0, arg3, arg3, arg3, arg0, local17, arg2)) {
					return false;
				}
			} else if (!Static33.method558(local21, local21, local17, local7, local7, local7, arg0, local17, arg2)) {
				return false;
			} else if (!Static33.method558(arg2, local21, arg0, local7, local7, local7, arg0, local17, arg2)) {
				return false;
			}
			if (Static384.anInt6573 > arg2) {
				if (!Static33.method558(arg2, arg2, local17, local7, arg3, arg3, arg0, local17, arg2)) {
					return false;
				}
				if (!Static33.method558(arg2, arg2, arg0, local7, local7, arg3, arg0, local17, arg2)) {
					return false;
				}
			} else if (!Static33.method558(local21, local21, local17, local7, arg3, arg3, arg0, local17, local21)) {
				return false;
			} else if (!Static33.method558(local21, local21, arg0, local7, local7, arg3, arg0, local17, local21)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
