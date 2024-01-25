import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static409 {

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!wu;")
	public static Class384 aClass384_102;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "J")
	public static long aLong193;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public static int anInt7033 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
	public static int method6257() {
		return Static73.anInt1144;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIIIIZ)Z")
	public static boolean method6259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg6 + arg5 > arg7 && arg0 + arg7 > arg6) {
			return arg3 + arg1 > arg2 && arg3 < arg4 + arg2;
		} else {
			return false;
		}
	}
}
