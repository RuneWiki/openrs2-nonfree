import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
	public static int[] anIntArray316;

	@OriginalMember(owner = "client!o", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_80;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "[Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array11;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "[I")
	public static int[] anIntArray317;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
	public static int[] anIntArray319;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public static volatile int anInt1906 = 0;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Lclient!hb;")
	private static Class27 aClass27_924 = Static87.method1648("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_925 = Static87.method1648("@whi@ )4 ");

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!hb;")
	private static Class27 aClass27_926 = Static87.method1648("red:");

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!hb;")
	private static Class27 aClass27_927 = Static87.method1648("Add ignore");

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_928 = Static87.method1648("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!o", name = "m", descriptor = "I")
	public static int anInt1911 = 1;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "Lclient!hb;")
	public static Class27 aClass27_929 = aClass27_926;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
	public static int[] anIntArray318 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!o", name = "v", descriptor = "Lclient!hb;")
	public static Class27 aClass27_930 = aClass27_924;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "Lclient!hb;")
	public static Class27 aClass27_931 = aClass27_927;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_932 = Static87.method1648("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!o", name = "B", descriptor = "Z")
	public static boolean aBoolean97 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public static void method1336() {
		aClass27_926 = null;
		aClass27_932 = null;
		aClass27_927 = null;
		aByteArrayArray10 = null;
		aClass27_928 = null;
		anIntArray317 = null;
		anIntArray318 = null;
		aClass27_930 = null;
		aClass27_925 = null;
		aClass27_924 = null;
		aClass3_Sub3_Sub2_Sub4_80 = null;
		aByteArrayArray9 = null;
		aClass27_931 = null;
		aClass3_Sub3_Sub2_Sub2Array11 = null;
		anIntArray319 = null;
		aClass27_929 = null;
		anIntArray316 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZBILclient!td;Lclient!td;)Lclient!ud;")
	public static Class3_Sub3_Sub15 method1337(@OriginalArg(2) int arg0, @OriginalArg(3) Class54 arg1, @OriginalArg(4) Class54 arg2) {
		@Pc(11) boolean local11 = true;
		@Pc(20) int[] local20 = arg1.method1597(arg0);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(32) byte[] local32 = arg1.method1602(local20[local22], arg0);
			if (local32 == null) {
				local11 = false;
			} else {
				@Pc(52) int local52 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(68) byte[] local68 = arg2.method1602(0, local52);
				if (local68 == null) {
					local11 = false;
				}
			}
		}
		if (!local11) {
			return null;
		}
		try {
			return new Class3_Sub3_Sub15(arg1, arg2, arg0, false);
		} catch (@Pc(90) Exception local90) {
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ee;Lclient!ee;B)V")
	public static void method1338(@OriginalArg(0) Class3_Sub3_Sub2_Sub1 arg0, @OriginalArg(1) Class3_Sub3_Sub2_Sub1 arg1) {
		Static61.aClass12_47.method674();
		if (Static59.anInt1508 == 0 || Static59.anInt1508 == 5) {
			arg0.method603(Static16.aClass27_188, 180, 54, 16777215);
			Static95.method1328(28, 62, 304, 34, 9179409);
			Static95.method1328(29, 63, 302, 32, 0);
			Static95.method1322(30, 64, Static102.anInt2658 * 3, 30, 9179409);
			Static95.method1322(Static102.anInt2658 * 3 + 30, 64, 300 - Static102.anInt2658 * 3, 30, 0);
			arg0.method603(Static76.aClass27_1012, 180, 85, 16777215);
		}
		@Pc(93) byte local93;
		@Pc(101) int local101;
		if (Static59.anInt1508 == 20) {
			Static13.aClass3_Sub3_Sub2_Sub4_35.method1332(0, 0);
			local93 = 40;
			arg0.method598(Static76.aClass27_1009, 180, 40, 16776960, true);
			local101 = local93 + 15;
			arg0.method598(Static76.aClass27_1013, 180, 55, 16776960, true);
			@Pc(109) int local109 = local101 + 15;
			arg0.method598(Static76.aClass27_1014, 180, 70, 16776960, true);
			@Pc(117) int local117 = local109 + 15;
			@Pc(118) int local118 = local117 + 10;
			arg0.method604(Static98.method1779(new Class27[] { Static25.aClass27_327, Static76.aClass27_1008 }), 90, 95, 16777215, true);
			@Pc(137) int local137 = local118 + 15;
			arg0.method604(Static98.method1779(new Class27[] { Static37.aClass27_441, Static76.aClass27_1010.method752() }), 92, 110, 16777215, true);
			@Pc(158) int local158 = local137 + 15;
		}
		if (Static59.anInt1508 == 10) {
			Static13.aClass3_Sub3_Sub2_Sub4_35.method1332(0, 0);
			if (Static65.anInt1672 == 0) {
				local93 = 80;
				arg0.method598(Static7.aClass27_90, 180, 80, 16776960, true);
				local101 = local93 + 30;
				aClass3_Sub3_Sub2_Sub4_80.method1332(27, 100);
				arg0.method596(Static102.aClass27_1286, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				aClass3_Sub3_Sub2_Sub4_80.method1332(187, 100);
				arg0.method596(Static36.aClass27_429, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static65.anInt1672 == 2) {
				local93 = 40;
				arg0.method598(Static76.aClass27_1009, 180, 40, 16776960, true);
				local101 = local93 + 15;
				arg0.method598(Static76.aClass27_1013, 180, 55, 16776960, true);
				local101 += 15;
				arg0.method598(Static76.aClass27_1014, 180, 70, 16776960, true);
				local101 += 15;
				local101 += 10;
				arg0.method604(Static98.method1779(new Class27[] { Static25.aClass27_327, Static76.aClass27_1008, Static2.anInt38 % 40 < 20 & Static2.anInt41 == 0 ? Static97.aClass27_1078 : Static76.aClass27_1011 }), 90, 95, 16777215, true);
				local101 += 15;
				arg0.method604(Static98.method1779(new Class27[] { Static37.aClass27_441, Static76.aClass27_1010.method752(), Static2.anInt41 == 1 & Static2.anInt38 % 40 < 20 ? Static97.aClass27_1078 : Static76.aClass27_1011 }), 92, 110, 16777215, true);
				local101 += 15;
				aClass3_Sub3_Sub2_Sub4_80.method1332(27, 130);
				arg0.method598(Static94.aClass27_1221, 100, 155, 16777215, true);
				aClass3_Sub3_Sub2_Sub4_80.method1332(187, 130);
				arg0.method598(Static56.aClass27_711, 260, 155, 16777215, true);
			} else if (Static65.anInt1672 == 3) {
				arg0.method598(Static17.aClass27_220, 180, 40, 16776960, true);
				local93 = 65;
				arg0.method598(Static104.aClass27_1314, 180, 65, 16777215, true);
				local101 = local93 + 15;
				arg0.method598(Static1.aClass27_1, 180, 80, 16777215, true);
				local101 += 15;
				arg0.method598(aClass27_930, 180, 95, 16777215, true);
				local101 += 15;
				arg0.method598(Static4.aClass27_1334, 180, 110, 16777215, true);
				local101 += 15;
				aClass3_Sub3_Sub2_Sub4_80.method1332(107, 130);
				arg0.method598(Static56.aClass27_711, 180, 155, 16777215, true);
			}
		}
		Static1.method8();
		try {
			@Pc(482) Graphics local482 = Static19.aCanvas1.getGraphics();
			Static61.aClass12_47.method671(202, local482, 171);
			Static8.aClass12_8.method671(0, local482, 0);
			Static41.aClass12_32.method671(637, local482, 0);
			if (Static89.aBoolean121) {
				Static89.aBoolean121 = false;
				Static109.aClass12_61.method671(128, local482, 0);
				Static73.aClass12_56.method671(202, local482, 371);
				Static36.aClass12_23.method671(0, local482, 265);
				Static39.aClass12_26.method671(562, local482, 265);
				Static41.aClass12_33.method671(128, local482, 171);
				Static47.aClass12_35.method671(562, local482, 171);
			}
		} catch (@Pc(544) Exception local544) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!jb;IILclient!wd;)V")
	public static void method1339(@OriginalArg(0) Class32 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub11 arg2) {
		@Pc(9) Class3_Sub6 local9 = new Class3_Sub6();
		local9.anInt1277 = arg2.method1421();
		local9.anInt1272 = arg2.method1444();
		local9.aByteArrayArrayArray3 = new byte[local9.anInt1277][][];
		local9.anIntArray209 = new int[local9.anInt1277];
		local9.anIntArray211 = new int[local9.anInt1277];
		local9.aClass64Array1 = new Class64[local9.anInt1277];
		local9.aClass64Array2 = new Class64[local9.anInt1277];
		local9.anIntArray210 = new int[local9.anInt1277];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt1277; local56++) {
			try {
				@Pc(62) int local62 = arg2.method1421();
				@Pc(92) String local92;
				@Pc(103) String local103;
				@Pc(107) int local107;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local92 = new String(arg2.method1426().method744());
					local103 = new String(arg2.method1426().method744());
					local107 = 0;
					if (local62 == 1) {
						local107 = arg2.method1444();
					}
					local9.anIntArray209[local56] = local62;
					local9.anIntArray210[local56] = local107;
					local9.aClass64Array1[local56] = arg0.method944(Static109.method1456(local92), local103);
				} else if (local62 == 3 || local62 == 4) {
					local92 = new String(arg2.method1426().method744());
					local103 = new String(arg2.method1426().method744());
					local107 = arg2.method1421();
					@Pc(110) String[] local110 = new String[local107];
					for (@Pc(112) int local112 = 0; local112 < local107; local112++) {
						local110[local112] = new String(arg2.method1426().method744());
					}
					@Pc(134) byte[][] local134 = new byte[local107][];
					@Pc(145) int local145;
					if (local62 == 3) {
						for (@Pc(139) int local139 = 0; local139 < local107; local139++) {
							local145 = arg2.method1444();
							local134[local139] = new byte[local145];
							arg2.method1420(local145, local134[local139]);
						}
					}
					local9.anIntArray209[local56] = local62;
					@Pc(170) Class[] local170 = new Class[local107];
					for (local145 = 0; local145 < local107; local145++) {
						local170[local145] = Static109.method1456(local110[local145]);
					}
					local9.aClass64Array2[local56] = arg0.method945(Static109.method1456(local92), local103, local170);
					local9.aByteArrayArrayArray3[local56] = local134;
				}
			} catch (@Pc(261) ClassNotFoundException local261) {
				local9.anIntArray211[local56] = -1;
			} catch (@Pc(268) SecurityException local268) {
				local9.anIntArray211[local56] = -2;
			} catch (@Pc(275) NullPointerException local275) {
				local9.anIntArray211[local56] = -3;
			} catch (@Pc(282) Exception local282) {
				local9.anIntArray211[local56] = -4;
			} catch (@Pc(289) Throwable local289) {
				local9.anIntArray211[local56] = -5;
			}
		}
		Static2.aClass28_1.method889(local9);
	}
}
