import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "Lclient!ni;")
	public static Class223 aClass223_66;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "[I")
	public static final int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5242(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 >= Static309.anInt6227 && Static7.anInt464 >= arg0 && arg6 >= Static633.anInt10644 && Static389.anInt7300 >= arg4) {
			Static193.method2211(arg3, arg5, arg0, arg2, arg6, arg4, arg1);
		} else {
			Static480.method3505(arg3, arg4, arg2, arg5, arg0, arg6, arg1);
		}
	}
}
