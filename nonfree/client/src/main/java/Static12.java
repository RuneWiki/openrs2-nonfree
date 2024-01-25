import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "q", descriptor = "Lclient!hs;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!al", name = "m", descriptor = "[I")
	public static final int[] anIntArray9 = new int[128];

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString7 = "M";

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg0 + arg2 && arg3 + arg4 > arg0) {
			return arg1 + arg6 > arg7 && arg1 < arg7 + arg5;
		} else {
			return false;
		}
	}
}
