import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array8;

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_11;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt1734;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public static int anInt1736;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public static int anInt1739;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "Lclient!i;")
	public static Class32 aClass32_33 = new Class32(30);

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "Lclient!wd;")
	public static Class80 aClass80_618 = Static2.method59("Fps:");

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!wd;")
	private static Class80 aClass80_622 = Static2.method59("Enter message to send to ");

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_619 = aClass80_622;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "Lclient!wd;")
	private static Class80 aClass80_620 = Static2.method59("Please try again)3");

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!wd;")
	private static Class80 aClass80_624 = Static2.method59("Enter name of friend to add to list");

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!wd;")
	public static Class80 aClass80_621 = aClass80_624;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!wd;")
	public static Class80 aClass80_623 = aClass80_620;

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "I")
	public static int anInt1735 = 0;

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Z")
	public static boolean aBoolean119 = false;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "[I")
	public static int[] anIntArray218 = new int[500];

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
	public static int anInt1737 = -1;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "I")
	public static int anInt1738 = 0;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	public static final int anInt1740 = 0;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
	public static int anInt1741 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method1025() {
		aClass80_620 = null;
		aClass2_Sub1_Sub9_Sub1Array8 = null;
		anIntArray218 = null;
		aClass80_618 = null;
		aShortArrayArray1 = null;
		aClass32_33 = null;
		aClass80_621 = null;
		aClass80_623 = null;
		aClass11_Sub1_11 = null;
		aClass80_619 = null;
		aClass80_624 = null;
		aClass80_622 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Lclient!wd;")
	public static Class80 method1026(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static110.aClass80_1099;
		} else if (local7 < -6) {
			return Static56.aClass80_614;
		} else if (local7 < -3) {
			return Static64.aClass80_681;
		} else if (local7 < 0) {
			return Static40.aClass80_459;
		} else if (local7 > 9) {
			return Static84.aClass80_824;
		} else if (local7 > 6) {
			return Static104.aClass80_1031;
		} else if (local7 > 3) {
			return Static56.aClass80_617;
		} else if (local7 > 0) {
			return Static119.aClass80_596;
		} else {
			return Static115.aClass80_1124;
		}
	}
}
