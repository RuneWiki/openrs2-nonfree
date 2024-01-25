import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Lclient!ra;")
	public static Class170 aClass170_96;

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "Lclient!kh;")
	public static Class54 aClass54_16;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "[S")
	public static short[] aShortArray90;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "[Lclient!kh;")
	public static Class54[] aClass54Array22;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "[[S")
	public static final short[][] aShortArrayArray14 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt5540 = 0;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
	public static int anInt5541 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([BI)Z")
	public static boolean method4913(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub1 local8 = new Class5_Sub1(arg0);
		@Pc(12) int local12 = local8.method1832();
		if (local12 != 1) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method1832() == 1;
		if (local28) {
			Static226.method3912(local8);
		}
		Static147.method2741(local8);
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
	public static void method4915() {
		Static279.aClass66_93.method1944(5);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)B")
	public static byte method4916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
