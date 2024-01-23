import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Lclient!em;")
	public static Class45 aClass45_1 = new Class45();

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	public static int anInt4646 = 2;

	@OriginalMember(owner = "client!r", name = "f", descriptor = "[I")
	public static int[] anIntArray375 = new int[256];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)V")
	public static void method3632(@OriginalArg(0) int arg0) {
		Static230.anInt4619 = -1;
		Static104.anInt2092 = arg0;
		Static230.anInt4619 = -1;
		Static72.method1221();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
	public static void method3633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg1) {
			Static47.method937(arg4, arg2, arg3, arg0);
		} else if (Static173.anInt3481 <= arg3 - arg4 && Static121.anInt2460 >= arg3 + arg4 && arg2 - arg1 >= Static293.anInt5688 && Static100.anInt1982 >= arg2 + arg1) {
			Static228.method3583(arg1, arg2, arg3, arg0, arg4);
		} else {
			Static225.method3545(arg4, arg3, arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!cg;I)Z")
	public static boolean method3634(@OriginalArg(0) Class22 arg0) {
		return arg0.method656(Static266.anInt5236);
	}
}
