import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
	public static int anInt1924;

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
	public static int anInt1926;

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_654 = Static65.method1172("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "Lclient!kb;")
	public static Class46 aClass46_655 = Static65.method1172("T");

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
	public static int anInt1923 = 0;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_656 = Static65.method1172("<col=00ffff>");

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	public static final int anInt1928 = 7759444;

	@OriginalMember(owner = "client!jf", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[100];

	@OriginalMember(owner = "client!jf", name = "X", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)V")
	public static void method1278() {
		aClass46_656 = null;
		aClass46_655 = null;
		aClass46_654 = null;
		aBooleanArray10 = null;
		aShortArrayArray7 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!tb;I)V")
	public static void method1279(@OriginalArg(0) Class75 arg0) {
		Static54.aClass75_1 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IIII)I")
	public static int method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
