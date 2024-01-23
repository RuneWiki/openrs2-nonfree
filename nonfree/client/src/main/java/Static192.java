import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
	public static int anInt4375;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "Lclient!i;")
	private static Class41 aClass41_1161 = Static184.method2923("Unable to connect)3");

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_1158 = aClass41_1161;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Lclient!i;")
	public static Class41 aClass41_1159 = aClass41_1161;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "[I")
	public static int[] anIntArray451 = new int[500];

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "[I")
	public static int[] anIntArray452 = new int[25];

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_1160 = Static184.method2923("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I")
	public static int method3028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(45) int local45 = Static41.method884(arg1 + 91923, 4, arg0 + 45365) + (Static41.method884(arg1 + 37821, 2, arg0 + 10294) - 128 >> 1) + (Static41.method884(arg1, 1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public static void method3029(@OriginalArg(0) int arg0) {
		if (Static187.method2974(arg0)) {
			Static90.method1577(-1, Static68.aClass80ArrayArray1[arg0]);
		}
	}
}
