import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_29;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "Lclient!dd;")
	public static Class16 aClass16_9;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!ea;")
	public static Class18 aClass18_601 = Static8.method128("compass");

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!ea;")
	public static Class18 aClass18_602 = Static8.method128("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!ea;")
	public static Class18 aClass18_603 = Static8.method128(":tradereq:");

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
	public static int[] anIntArray220 = new int[2048];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!ea;)I")
	public static int method1798(@OriginalArg(1) Class18 arg0) {
		if (Static139.anInt3912 == 1) {
			return 7;
		} else if (arg0.method740(Static113.aClass18_1130)) {
			return 1;
		} else if (arg0.method740(Static31.aClass18_267)) {
			return 1;
		} else if (arg0.method740(Static23.aClass18_201)) {
			return 2;
		} else if (arg0.method740(Static143.aClass18_1007)) {
			return 2;
		} else if (arg0.method740(Static11.aClass18_121)) {
			return 3;
		} else if (arg0.method740(Static64.aClass18_478)) {
			return 4;
		} else if (arg0.method740(Static111.aClass18_823)) {
			return 4;
		} else if (arg0.method740(Static171.aClass18_1204)) {
			return 5;
		} else if (arg0.method740(Static2.aClass18_55)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method1799() {
		Static177.aClass66_27.method2604();
		Static129.aClass66_16.method2604();
		Static89.aClass66_9.method2604();
		Static147.aClass66_18.method2604();
		Static122.aClass66_14.method2604();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Lclient!ea;")
	public static Class18 method1800(@OriginalArg(1) int arg0) {
		return Static144.method2735(new Class18[] { Static132.method2564(arg0 >> 24 & 0xFF), Static23.aClass18_203, Static132.method2564(arg0 >> 16 & 0xFF), Static23.aClass18_203, Static132.method2564(arg0 >> 8 & 0xFF), Static23.aClass18_203, Static132.method2564(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!hc;I)Lclient!ea;")
	public static Class18 method1801(@OriginalArg(0) Class1_Sub6 arg0) {
		return Static141.method1504(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
	public static void method1802() {
		aClass18_602 = null;
		anIntArray220 = null;
		aClass18_603 = null;
		aFrame1 = null;
		aClass16_9 = null;
		aClass16_Sub1_29 = null;
		aShortArrayArray4 = null;
		aClass18_601 = null;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Z")
	public static boolean method1803(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
