import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	public static int anInt7825 = 0;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_101 = new Class173(73, -1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method6524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg5 + arg2 && arg5 < arg1 + arg6) {
			return arg7 + arg0 > arg4 && arg3 + arg4 > arg7;
		} else {
			return false;
		}
	}
}
