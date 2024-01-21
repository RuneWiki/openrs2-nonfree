import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!gb;")
	public static Class20 aClass20_11;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "I")
	public static int anInt2529;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_43;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_6 = new CRC32();

	@OriginalMember(owner = "client!d", name = "g", descriptor = "I")
	public static int anInt2528 = 0;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "[J")
	public static long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1137 = Static24.method441("Enter name of friend to add to list");

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1136 = aClass65_1137;

	@OriginalMember(owner = "client!d", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false };

	@OriginalMember(owner = "client!d", name = "o", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1138 = Static24.method441(")3000");

	@OriginalMember(owner = "client!d", name = "v", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1140 = Static24.method441("Invalid username or password)3");

	@OriginalMember(owner = "client!d", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1139 = aClass65_1140;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public static final int anInt2530 = 50;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "I")
	public static int anInt2531 = 0;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	public static int anInt2532 = 0;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "[I")
	public static int[] anIntArray367 = new int[25];

	@OriginalMember(owner = "client!d", name = "x", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1142 = Static24.method441("Loading wordpack )2 ");

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1141 = aClass65_1142;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!da;")
	public static Class15 method1551(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class15_Sub1");
			@Pc(10) Class15 local10 = (Class15) local6.getDeclaredConstructor().newInstance();
			local10.method1105(arg2, arg1, arg0);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class15_Sub2 local28 = new Class15_Sub2();
			local28.method1105(arg2, arg1, arg0);
			return local28;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!k;ILclient!k;Ljava/awt/Component;)V")
	public static void method1552(@OriginalArg(0) Class33 arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) Component arg2) {
		if (Static110.aBoolean160) {
			return;
		}
		Static59.aClass15_43 = method1551(265, arg2, 128);
		Static43.method1808();
		Static50.aClass15_35 = method1551(265, arg2, 128);
		Static43.method1808();
		Static108.aClass15_70 = method1551(171, arg2, 509);
		Static43.method1808();
		Static45.aClass15_33 = method1551(132, arg2, 360);
		Static43.method1808();
		Static96.aClass15_67 = method1551(200, arg2, 360);
		Static43.method1808();
		Static92.aClass15_62 = method1551(238, arg2, 202);
		Static43.method1808();
		Static85.aClass15_58 = method1551(238, arg2, 203);
		Static43.method1808();
		Static93.aClass15_64 = method1551(94, arg2, 74);
		Static43.method1808();
		Static38.aClass15_29 = method1551(94, arg2, 75);
		Static43.method1808();
		@Pc(81) byte[] local81 = arg1.method1138(Static101.aClass65_1249, Static105.aClass65_1291);
		@Pc(87) Class2_Sub1_Sub4_Sub2 local87 = new Class2_Sub1_Sub4_Sub2(local81, arg2);
		Static59.aClass15_43.method1098();
		local87.method488(0, 0);
		Static50.aClass15_35.method1098();
		local87.method488(-637, 0);
		Static108.aClass15_70.method1098();
		local87.method488(-128, 0);
		Static45.aClass15_33.method1098();
		local87.method488(-202, -371);
		Static96.aClass15_67.method1098();
		local87.method488(-202, -171);
		Static92.aClass15_62.method1098();
		local87.method488(0, -265);
		Static85.aClass15_58.method1098();
		local87.method488(-562, -265);
		Static93.aClass15_64.method1098();
		local87.method488(-128, -171);
		Static38.aClass15_29.method1098();
		local87.method488(-562, -171);
		@Pc(162) int[] local162 = new int[local87.anInt764];
		@Pc(168) int local168;
		@Pc(200) int local200;
		for (@Pc(164) int local164 = 0; local164 < local87.anInt759; local164++) {
			for (local168 = 0; local168 < local87.anInt764; local168++) {
				local162[local168] = local87.anIntArray105[local87.anInt764 + local164 * local87.anInt764 - local168 - 1];
			}
			for (local200 = 0; local200 < local87.anInt764; local200++) {
				local87.anIntArray105[local87.anInt764 * local164 + local200] = local162[local200];
			}
		}
		Static59.aClass15_43.method1098();
		local87.method488(382, 0);
		Static50.aClass15_35.method1098();
		local87.method488(-255, 0);
		Static108.aClass15_70.method1098();
		local87.method488(254, 0);
		Static45.aClass15_33.method1098();
		local87.method488(180, -371);
		Static96.aClass15_67.method1098();
		local87.method488(180, -171);
		Static92.aClass15_62.method1098();
		local87.method488(382, -265);
		Static85.aClass15_58.method1098();
		local87.method488(-180, -265);
		Static93.aClass15_64.method1098();
		local87.method488(254, -171);
		Static38.aClass15_29.method1098();
		local87.method488(-180, -171);
		local87 = Static37.method750(arg0, Static105.aClass65_1291, Static42.aClass65_595);
		Static108.aClass15_70.method1098();
		local87.method486(382 - local87.anInt764 / 2 - 128, 18);
		Static24.aClass2_Sub1_Sub4_Sub3_10 = Static23.method421(Static105.aClass65_1291, Static95.aClass65_905, arg0);
		Static1.aClass2_Sub1_Sub4_Sub3_1 = Static23.method421(Static105.aClass65_1291, Static70.aClass65_976, arg0);
		Static29.aClass2_Sub1_Sub4_Sub3Array1 = Static90.method837(Static71.aClass65_999, Static105.aClass65_1291, arg0);
		Static38.aClass2_Sub1_Sub4_Sub2_5 = new Class2_Sub1_Sub4_Sub2(128, 265);
		Static95.aClass2_Sub1_Sub4_Sub2_12 = new Class2_Sub1_Sub4_Sub2(128, 265);
		for (local168 = 0; local168 < 33920; local168++) {
			Static38.aClass2_Sub1_Sub4_Sub2_5.anIntArray105[local168] = Static59.aClass15_43.anIntArray257[local168];
		}
		for (local200 = 0; local200 < 33920; local200++) {
			Static95.aClass2_Sub1_Sub4_Sub2_12.anIntArray105[local200] = Static50.aClass15_35.anIntArray257[local200];
		}
		Static100.anIntArray407 = new int[256];
		for (@Pc(385) int local385 = 0; local385 < 64; local385++) {
			Static100.anIntArray407[local385] = local385 * 262144;
		}
		for (@Pc(399) int local399 = 0; local399 < 64; local399++) {
			Static100.anIntArray407[local399 + 64] = local399 * 1024 + 16711680;
		}
		for (@Pc(418) int local418 = 0; local418 < 64; local418++) {
			Static100.anIntArray407[local418 + 128] = local418 * 4 + 16776960;
		}
		for (@Pc(436) int local436 = 0; local436 < 64; local436++) {
			Static100.anIntArray407[local436 + 192] = 16777215;
		}
		Static69.anIntArray279 = new int[256];
		for (@Pc(453) int local453 = 0; local453 < 64; local453++) {
			Static69.anIntArray279[local453] = local453 * 1024;
		}
		for (@Pc(467) int local467 = 0; local467 < 64; local467++) {
			Static69.anIntArray279[local467 + 64] = local467 * 4 + 65280;
		}
		for (@Pc(485) int local485 = 0; local485 < 64; local485++) {
			Static69.anIntArray279[local485 + 128] = local485 * 262144 + 65535;
		}
		for (@Pc(503) int local503 = 0; local503 < 64; local503++) {
			Static69.anIntArray279[local503 + 192] = 16777215;
		}
		Static90.anIntArray195 = new int[256];
		for (@Pc(520) int local520 = 0; local520 < 64; local520++) {
			Static90.anIntArray195[local520] = local520 * 4;
		}
		for (@Pc(536) int local536 = 0; local536 < 64; local536++) {
			Static90.anIntArray195[local536 + 64] = local536 * 262144 + 255;
		}
		for (@Pc(554) int local554 = 0; local554 < 64; local554++) {
			Static90.anIntArray195[local554 + 128] = local554 * 1024 + 16711935;
		}
		for (@Pc(572) int local572 = 0; local572 < 64; local572++) {
			Static90.anIntArray195[local572 + 192] = 16777215;
		}
		Static93.anIntArray388 = new int[32768];
		Static77.anIntArray303 = new int[32768];
		Static41.anIntArray170 = new int[256];
		Static96.method1651(null);
		Static101.anInt2794 = 0;
		Static105.aClass65_1286 = Static105.aClass65_1291;
		Static105.aClass65_1293 = Static105.aClass65_1291;
		Static37.anIntArray160 = new int[32768];
		Static83.anIntArray309 = new int[32768];
		if (Static97.anInt2711 == 0 || Static4.aBoolean16) {
			Static57.method995();
		} else {
			Static57.method999(Static105.aClass65_1291, Static97.anInt2711, Static26.aClass33_Sub1_50, Static90.aClass65_624);
		}
		Static84.method1446(false);
		Static38.aBoolean74 = true;
		Static110.aBoolean160 = true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
	public static void method1553(@OriginalArg(0) int arg0) {
		for (Static52.anInt1577 += arg0; Static52.anInt1577 >= Static42.anInt1353; Static52.anInt1577 -= Static42.anInt1353) {
			Static93.anInt2623 -= Static93.anInt2623 >> 2;
		}
		Static93.anInt2623 -= arg0 * 1000;
		if (Static93.anInt2623 < 0) {
			Static93.anInt2623 = 0;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method1556() {
		if (Static108.anInt2865 == 2) {
			Static20.method404((Static55.anInt1678 - Static107.anInt2849 << 7) + Static103.anInt2809, (Static77.anInt2245 + -Static37.anInt1220 << 7) + Static54.anInt1637, Static53.anInt1941 * 2);
			if (Static98.anInt2759 > -1 && Static108.anInt2902 % 20 < 10) {
				Static102.aClass2_Sub1_Sub4_Sub2Array9[0].method486(Static98.anInt2759 - 12, Static17.anInt575 - 28);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public static void method1558() {
		anIntArray367 = null;
		aClass65_1139 = null;
		aClass65_1137 = null;
		aClass33_Sub1_43 = null;
		aCRC32_6 = null;
		aBooleanArray25 = null;
		aClass65_1140 = null;
		aClass65_1142 = null;
		aClass20_11 = null;
		aClass65_1136 = null;
		Class14.anIntArray366 = null;
		aClass65_1141 = null;
		aLongArray10 = null;
		aClass65_1138 = null;
	}
}
