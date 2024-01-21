import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!td", name = "l", descriptor = "I")
	public static int anInt3861;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array27 = new Class13[500];

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1329 = Static161.method2971("slide:");

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1326 = aClass13_1329;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1330 = Static161.method2971("Loading title screen )2 ");

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1327 = aClass13_1330;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1328 = Static161.method2971("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!td", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1331 = Static161.method2971("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!td", name = "q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1335 = Static161.method2971("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!td", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1332 = aClass13_1335;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "[[S")
	public static short[][] aShortArrayArray7 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!td", name = "n", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1333 = Static161.method2971(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt3862 = 0;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1334 = aClass13_1329;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IILjava/util/Random;)I")
	public static int method2805(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static41.method1067(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local34 <= local42);
			return Static184.method2992(arg0, local42);
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!ag;Z)[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] method2806(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1) {
		return Static88.method1852(arg1, arg0) ? Static61.method1411() : null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method2807() {
		aClass13_1333 = null;
		aClass13_1330 = null;
		aClass13_1328 = null;
		aClass13_1327 = null;
		aClass13Array27 = null;
		aClass13_1331 = null;
		aClass13_1334 = null;
		aShortArrayArray7 = null;
		aClass13_1329 = null;
		aClass13_1332 = null;
		aClass13_1326 = null;
		aClass13_1335 = null;
	}
}
