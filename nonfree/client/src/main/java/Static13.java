import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
	public static int anInt429;

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
	public static int anInt432;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!ga;")
	public static Class29 aClass29_4;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!la;")
	public static Class6_Sub4_Sub1 aClass6_Sub4_Sub1_1 = new Class6_Sub4_Sub1(5000);

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!rd;")
	private static Class63 aClass63_296 = Static80.method1463("Loading game screen )2 ");

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!rd;")
	public static Class63 aClass63_290 = aClass63_296;

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!rd;")
	private static Class63 aClass63_297 = Static80.method1463("shake:");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!rd;")
	public static Class63 aClass63_291 = aClass63_297;

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
	public static int anInt430 = 0;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_292 = aClass63_297;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
	public static int anInt431 = 0;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!rd;")
	public static Class63 aClass63_293 = Static80.method1463("@or2@");

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_294 = Static80.method1463("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!ca", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_295 = Static80.method1463("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "J")
	public static long aLong18 = 0L;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
	public static int anInt433 = 255;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!rd;")
	public static Class63 aClass63_298 = Static80.method1463("mapdots");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[BI)I")
	public static int method343(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static2.method23(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method344(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method345() {
		aClass63_295 = null;
		aClass63_290 = null;
		aClass6_Sub4_Sub1_1 = null;
		aClass63_291 = null;
		aClass63_296 = null;
		aClass63_298 = null;
		aClass63_293 = null;
		aClass63_294 = null;
		aClass63_297 = null;
		aClass63_292 = null;
		aClass29_4 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method346() {
		@Pc(5) Object local5 = Static99.anObject4;
		synchronized (Static99.anObject4) {
			if (Static25.anInt849 == 0) {
				Static4.aClass8_1.method145(5, new Class27());
			}
			Static25.anInt849 = 600;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!ge;Lclient!ge;Ljava/awt/Component;B)V")
	public static void method347(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Component arg2) {
		if (Static47.aBoolean72) {
			return;
		}
		Static90.aClass29_19 = Static70.method1366(128, 265, arg2);
		Static121.method1970();
		Static74.aClass29_11 = Static70.method1366(128, 265, arg2);
		Static121.method1970();
		Static120.aClass29_23 = Static70.method1366(509, 171, arg2);
		Static121.method1970();
		Static99.aClass29_21 = Static70.method1366(360, 132, arg2);
		Static121.method1970();
		Static123.aClass29_24 = Static70.method1366(360, 200, arg2);
		Static121.method1970();
		Static119.aClass29_22 = Static70.method1366(202, 238, arg2);
		Static121.method1970();
		Static124.aClass29_26 = Static70.method1366(203, 238, arg2);
		Static121.method1970();
		Static47.aClass29_8 = Static70.method1366(74, 94, arg2);
		Static121.method1970();
		Static86.aClass29_16 = Static70.method1366(75, 94, arg2);
		Static121.method1970();
		@Pc(77) byte[] local77 = arg0.method104(Static49.aClass63_802, Static90.aClass63_1332);
		@Pc(83) Class6_Sub3_Sub3_Sub2 local83 = new Class6_Sub3_Sub3_Sub2(local77, arg2);
		Static90.aClass29_19.method1431();
		local83.method1255(0, 0);
		Static74.aClass29_11.method1431();
		local83.method1255(-637, 0);
		Static120.aClass29_23.method1431();
		local83.method1255(-128, 0);
		Static99.aClass29_21.method1431();
		local83.method1255(-202, -371);
		Static123.aClass29_24.method1431();
		local83.method1255(-202, -171);
		Static119.aClass29_22.method1431();
		local83.method1255(0, -265);
		Static124.aClass29_26.method1431();
		local83.method1255(-562, -265);
		Static47.aClass29_8.method1431();
		local83.method1255(-128, -171);
		Static86.aClass29_16.method1431();
		local83.method1255(-562, -171);
		@Pc(150) int[] local150 = new int[local83.anInt1894];
		@Pc(187) int local187;
		for (@Pc(152) int local152 = 0; local152 < local83.anInt1892; local152++) {
			for (@Pc(156) int local156 = 0; local156 < local83.anInt1894; local156++) {
				local150[local156] = local83.anIntArray221[local152 * local83.anInt1894 + local83.anInt1894 - local156 - 1];
			}
			for (local187 = 0; local187 < local83.anInt1894; local187++) {
				local83.anIntArray221[local187 + local152 * local83.anInt1894] = local150[local187];
			}
		}
		Static90.aClass29_19.method1431();
		local83.method1255(382, 0);
		Static74.aClass29_11.method1431();
		local83.method1255(-255, 0);
		Static120.aClass29_23.method1431();
		local83.method1255(254, 0);
		Static99.aClass29_21.method1431();
		local83.method1255(180, -371);
		Static123.aClass29_24.method1431();
		local83.method1255(180, -171);
		Static119.aClass29_22.method1431();
		local83.method1255(382, -265);
		Static124.aClass29_26.method1431();
		local83.method1255(-180, -265);
		Static47.aClass29_8.method1431();
		local83.method1255(254, -171);
		Static86.aClass29_16.method1431();
		local83.method1255(-180, -171);
		local83 = Static87.method1566(Static49.aClass63_802, arg1, Static44.aClass63_739);
		Static120.aClass29_23.method1431();
		local83.method1252(254 - local83.anInt1894 / 2, 18);
		Static61.aClass6_Sub3_Sub3_Sub3_12 = Static105.method1896(Static76.aClass63_1118, arg1, Static49.aClass63_802);
		Static81.aClass6_Sub3_Sub3_Sub3_20 = Static105.method1896(Static124.aClass63_1783, arg1, Static49.aClass63_802);
		Static100.aClass6_Sub3_Sub3_Sub3Array6 = Static58.method1137(Static49.aClass63_802, arg1, Static113.aClass63_400);
		Static76.aClass6_Sub3_Sub3_Sub3Array5 = Static58.method1137(Static49.aClass63_802, arg1, Static103.aClass63_1764);
		Static54.aClass6_Sub3_Sub3_Sub2_1 = new Class6_Sub3_Sub3_Sub2(128, 265);
		Static106.aClass6_Sub3_Sub3_Sub2_5 = new Class6_Sub3_Sub3_Sub2(128, 265);
		for (local187 = 0; local187 < 33920; local187++) {
			Static54.aClass6_Sub3_Sub3_Sub2_1.anIntArray221[local187] = Static90.aClass29_19.anIntArray239[local187];
		}
		for (@Pc(359) int local359 = 0; local359 < 33920; local359++) {
			Static106.aClass6_Sub3_Sub3_Sub2_5.anIntArray221[local359] = Static74.aClass29_11.anIntArray239[local359];
		}
		Static2.anIntArray2 = new int[256];
		for (@Pc(380) int local380 = 0; local380 < 64; local380++) {
			Static2.anIntArray2[local380] = local380 * 262144;
		}
		for (@Pc(396) int local396 = 0; local396 < 64; local396++) {
			Static2.anIntArray2[local396 + 64] = local396 * 1024 + 16711680;
		}
		for (@Pc(417) int local417 = 0; local417 < 64; local417++) {
			Static2.anIntArray2[local417 + 128] = local417 * 4 + 16776960;
		}
		for (@Pc(436) int local436 = 0; local436 < 64; local436++) {
			Static2.anIntArray2[local436 + 192] = 16777215;
		}
		Static37.anIntArray140 = new int[256];
		for (@Pc(455) int local455 = 0; local455 < 64; local455++) {
			Static37.anIntArray140[local455] = local455 * 1024;
		}
		for (@Pc(469) int local469 = 0; local469 < 64; local469++) {
			Static37.anIntArray140[local469 + 64] = local469 * 4 + 65280;
		}
		for (@Pc(488) int local488 = 0; local488 < 64; local488++) {
			Static37.anIntArray140[local488 + 128] = local488 * 262144 + 65535;
		}
		for (@Pc(509) int local509 = 0; local509 < 64; local509++) {
			Static37.anIntArray140[local509 + 192] = 16777215;
		}
		Static103.anIntArray360 = new int[256];
		for (@Pc(526) int local526 = 0; local526 < 64; local526++) {
			Static103.anIntArray360[local526] = local526 * 4;
		}
		for (@Pc(540) int local540 = 0; local540 < 64; local540++) {
			Static103.anIntArray360[local540 + 64] = local540 * 262144 + 255;
		}
		for (@Pc(558) int local558 = 0; local558 < 64; local558++) {
			Static103.anIntArray360[local558 + 128] = local558 * 1024 + 16711935;
		}
		for (@Pc(576) int local576 = 0; local576 < 64; local576++) {
			Static103.anIntArray360[local576 + 192] = 16777215;
		}
		Static86.anIntArray278 = new int[32768];
		Static85.anIntArray305 = new int[32768];
		Static46.anIntArray164 = new int[256];
		Static10.method268(null);
		Static86.anIntArray277 = new int[32768];
		Static49.aClass63_805 = Static49.aClass63_802;
		Static49.aClass63_796 = Static49.aClass63_802;
		Static79.anIntArray242 = new int[32768];
		if (anInt433 == 0) {
			Static65.aBoolean101 = true;
		} else {
			Static65.aBoolean101 = false;
		}
		Static97.anInt2723 = 0;
		if (Static65.aBoolean101) {
			Static36.method869();
		} else {
			Static72.method1387(Static49.aClass63_802, Static20.aClass63_414, Static64.aClass7_Sub1_10);
		}
		Static52.method1070(false);
		Static92.aBoolean135 = true;
		Static47.aBoolean72 = true;
		Static98.method1816();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class63 method348(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static118.method2114(arg0);
		} else if (arg0 < 10000000) {
			return Static15.method374(new Class63[] { Static118.method2114(arg0 / 1000), Static58.aClass63_912 });
		} else {
			return Static15.method374(new Class63[] { Static118.method2114(arg0 / 1000000), Static1.aClass63_5 });
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	public static void method349() {
		Static75.aClass29_12.method1431();
		Static23.aClass6_Sub3_Sub3_Sub3_21.method1768(0, 0);
		Static32.anIntArray137 = Static107.method1987(Static32.anIntArray137);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method350(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static65.aClass65_1);
		arg0.removeFocusListener(Static65.aClass65_1);
	}
}
