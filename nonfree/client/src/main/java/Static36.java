import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!ge", name = "v", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array3;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static volatile int anInt1208 = -1;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!ge", name = "g", descriptor = "Lclient!wb;")
	private static Class65 aClass65_513 = Static24.method441("Checking for updates )2 ");

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!s;")
	public static Class52 aClass52_6 = new Class52();

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_514 = aClass65_513;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Lclient!wb;")
	private static Class65 aClass65_518 = Static24.method441(" from your ignore list first");

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_515 = aClass65_518;

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
	public static int anInt1219 = 10;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!wb;")
	private static Class65 aClass65_516 = Static24.method441(" ");

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "Lclient!wb;")
	public static Class65 aClass65_517 = aClass65_516;

	@OriginalMember(owner = "client!ge", name = "y", descriptor = "Lclient!ge;")
	public static Class21 aClass21_11 = new Class21(64);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZI)I")
	public static int method741(@OriginalArg(1) int arg0) {
		@Pc(7) Class2_Sub1_Sub7 local7 = Static35.method730(arg0);
		@Pc(16) int local16 = local7.anInt1671;
		@Pc(19) int local19 = local7.anInt1677;
		@Pc(22) int local22 = local7.anInt1674;
		@Pc(29) int local29 = Class2_Sub7.anIntArray114[local19 - local22];
		return Static26.anIntArray416[local16] >> local22 & local29;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!wb;BLclient!wb;I)V")
	public static void method742(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0 && Static5.anInt237 != -1) {
			Static93.aClass65_1182 = arg1;
			Static101.anInt2793 = 0;
		}
		if (Static21.anInt2494 == -1) {
			Static107.aBoolean156 = true;
		}
		for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
			Static61.anIntArray249[local26] = Static61.anIntArray249[local26 - 1];
			Static78.aClass65Array4[local26] = Static78.aClass65Array4[local26 - 1];
			Static34.aClass65Array5[local26] = Static34.aClass65Array5[local26 - 1];
		}
		Static61.anIntArray249[0] = arg2;
		Static78.aClass65Array4[0] = arg0;
		Static34.aClass65Array5[0] = arg1;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public static void method746() {
		aClass65_517 = null;
		aClass2_Sub1_Sub4_Sub3Array3 = null;
		aClass65_516 = null;
		aClass65_518 = null;
		aClass65_513 = null;
		aClass65_515 = null;
		aClass65_514 = null;
		aClass52_6 = null;
		aClass21_11 = null;
		aByteArrayArray3 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
	public static void method748(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static27.method499(Static102.aClass65_1263, Static1.aClass65_1, Static108.aClass65_1304);
		} else if (arg0 == -2) {
			Static27.method499(Static89.aClass65_1156, Static108.aClass65_1302, Static108.aClass65_1324);
		} else if (arg0 == -1) {
			Static27.method499(Static102.aClass65_1271, Static55.aClass65_753, Static108.aClass65_1306);
		} else if (arg0 == 3) {
			Static27.method499(Static18.aClass65_1139, Static108.aClass65_1314, Static108.aClass65_1312);
		} else if (arg0 == 4) {
			Static27.method499(Static7.aClass65_138, Static41.aClass65_574, Static108.aClass65_1317);
		} else if (arg0 == 5) {
			Static27.method499(Static40.aClass65_564, Static51.aClass65_683, Static108.aClass65_1315);
		} else if (arg0 == 6) {
			Static27.method499(Static2.aClass65_63, Static62.aClass65_850, Static108.aClass65_1339);
		} else if (arg0 == 7) {
			Static27.method499(Static20.aClass65_295, Static60.aClass65_828, Static108.aClass65_1333);
		} else if (arg0 == 8) {
			Static27.method499(Static32.aClass65_462, Static24.aClass65_341, Static108.aClass65_1337);
		} else if (arg0 == 9) {
			Static27.method499(Static100.aClass65_1242, Static67.aClass65_926, Static108.aClass65_1336);
		} else if (arg0 == 10) {
			Static27.method499(Static25.aClass65_351, Static24.aClass65_337, Static108.aClass65_1318);
		} else if (arg0 == 11) {
			Static27.method499(Static82.aClass65_1058, Static108.aClass65_1301, Static108.aClass65_1323);
		} else if (arg0 == 12) {
			Static27.method499(Static110.aClass65_1378, Static90.aClass65_623, Static108.aClass65_1327);
		} else if (arg0 == 13) {
			Static27.method499(Static102.aClass65_1260, Static104.aClass65_1276, Static108.aClass65_1326);
		} else if (arg0 == 14) {
			Static27.method499(Static24.aClass65_342, Static45.aClass65_606, Static108.aClass65_1329);
		} else if (arg0 == 16) {
			Static27.method499(Static24.aClass65_344, Static84.aClass65_1083, Static108.aClass65_1332);
		} else if (arg0 == 17) {
			Static27.method499(Static98.aClass65_1233, Static87.aClass65_1128, Static108.aClass65_1305);
		} else if (arg0 == 18) {
			Static27.method499(Static79.aClass65_1030, Static54.aClass65_733, Static108.aClass65_1319);
		} else if (arg0 == 20) {
			Static27.method499(Static102.aClass65_1266, Static23.aClass65_314, Static108.aClass65_1300);
		} else if (arg0 == 22) {
			Static27.method499(Static12.aClass65_223, Static104.aClass65_1280, Static108.aClass65_1313);
		} else if (arg0 == 23) {
			Static27.method499(Static24.aClass65_339, Static7.aClass65_139, Static108.aClass65_1310);
		} else if (arg0 == 24) {
			Static27.method499(Static15.aClass65_251, Static61.aClass65_836, Static108.aClass65_1321);
		} else if (arg0 == 25) {
			Static27.method499(Static102.aClass65_1257, Static60.aClass65_832, Static108.aClass65_1335);
		} else if (arg0 == 26) {
			Static27.method499(Static67.aClass65_920, Static98.aClass65_1239, Static108.aClass65_1330);
		} else if (arg0 == 27) {
			Static27.method499(Static93.aClass65_1179, Static108.aClass65_1340, Static108.aClass65_1331);
		} else {
			Static27.method499(Static102.aClass65_1272, Static103.aClass65_1274, Static108.aClass65_1342);
		}
		Static76.method1307(10);
	}
}
