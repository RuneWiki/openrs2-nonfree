import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static75 {

	@OriginalMember(owner = "client!he", name = "N", descriptor = "I")
	public static int anInt4697;

	@OriginalMember(owner = "client!he", name = "A", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!he", name = "G", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_62 = new Class86(64);

	@OriginalMember(owner = "client!he", name = "J", descriptor = "[[S")
	public static final short[][] aShortArrayArray46 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
	public static final int[] anIntArray413 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ve;Lclient!ve;Lclient!ve;Lclient!sb;I)Z")
	public static boolean method3570(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class69 arg2, @OriginalArg(3) Class1_Sub3_Sub4 arg3) {
		Static7.aClass69_1 = arg0;
		Static46.aClass69_11 = arg1;
		Static107.aClass1_Sub3_Sub4_1 = arg3;
		Static126.aClass69_30 = arg2;
		return true;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BJ)V")
	public static void method3577(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static125.method2094(arg0 - 1L);
			Static125.method2094(1L);
		} else {
			Static125.method2094(arg0);
		}
	}
}
