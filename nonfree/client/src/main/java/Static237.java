import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static237 {

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!jm", name = "m", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_94 = new Class40(36, 10);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg0) {
			Static69.method891(arg4, arg1, arg5, arg2, arg6, arg3);
		} else if (Static235.anInt3970 <= arg2 - arg3 && arg2 + arg3 <= Static151.anInt2683 && arg6 - arg0 >= Static134.anInt2364 && Static60.anInt971 >= arg6 + arg0) {
			Static438.method6313(arg3, arg0, arg2, arg6, arg1, arg4, arg5);
		} else {
			Static413.method6060(arg0, arg4, arg2, arg1, arg3, arg6, arg5);
		}
	}
}
