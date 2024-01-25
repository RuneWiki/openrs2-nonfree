import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static303 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!en;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method4186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg3 > arg7 && arg5 < arg7 + arg6) {
			return arg0 < arg1 + arg4 && arg4 < arg2 + arg0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIIII)V")
	public static void method4188(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static356.anInt6389 = arg2;
		Static253.anInt4570 = arg5;
		Static251.anInt4557 = arg0;
		Static185.anInt6763 = arg3;
		Static142.anInt2688 = arg4;
		if (arg1 && Static185.anInt6763 >= 100) {
			Static30.anInt696 = Static253.anInt4570 * 128 + 64;
			Static254.anInt4614 = Static251.anInt4557 * 128 + 64;
			Static292.anInt5287 = Static222.method3109(Static254.anInt4614, Static221.anInt4855, Static30.anInt696) - Static142.anInt2688;
		}
		Static134.anInt2621 = 2;
	}
}
