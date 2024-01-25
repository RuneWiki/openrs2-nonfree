import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
	public static int anInt8535;

	@OriginalMember(owner = "client!qb", name = "ac", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_84 = new Class341(57, 3);

	@OriginalMember(owner = "client!qb", name = "rc", descriptor = "I")
	public static int anInt8576 = 0;

	@OriginalMember(owner = "client!qb", name = "vc", descriptor = "I")
	public static int anInt8578 = 0;

	@OriginalMember(owner = "client!qb", name = "Hc", descriptor = "D")
	public static double aDouble19 = -1.0D;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZIIIIIII)Z")
	public static boolean method7598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 + arg0 > arg6 && arg7 + arg6 > arg0) {
			return arg1 + arg4 > arg2 && arg5 + arg2 > arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public static void method7603() {
		if (Static389.anInt7373 == 1 || Static389.anInt7373 == 3 || Static151.anInt2798 != Static389.anInt7373 && (Static389.anInt7373 == 0 || Static151.anInt2798 == 0)) {
			Static487.anInt8726 = 0;
			Static532.anInt9330 = 0;
			Static630.aClass335_29.method8353();
		}
		Static151.anInt2798 = Static389.anInt7373;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)I")
	public static int method7605() {
		@Pc(12) int local12 = Static11.aClass138_1.method4023();
		if (local12 < Static570.aClass138Array1.length - 1) {
			Static11.aClass138_1 = Static570.aClass138Array1[local12 + 1];
		}
		return 100;
	}
}
