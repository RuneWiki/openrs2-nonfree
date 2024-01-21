import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "Oc", descriptor = "Lclient!bf;")
	public static Class11 aClass11_6;

	@OriginalMember(owner = "client!ab", name = "Qc", descriptor = "Lclient!bd;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!ab", name = "Tc", descriptor = "Lclient!bb;")
	public static Class3_Sub1_Sub2_Sub1 aClass3_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "ad", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!ab", name = "dd", descriptor = "[I")
	public static int[] anIntArray34;

	@OriginalMember(owner = "client!ab", name = "Hc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_81 = Static56.method972("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ab", name = "Ic", descriptor = "Lclient!ae;")
	private static Class5 aClass5_82 = Static56.method972("purple:");

	@OriginalMember(owner = "client!ab", name = "Jc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_83 = Static56.method972("redstone1");

	@OriginalMember(owner = "client!ab", name = "Nc", descriptor = "Lclient!bd;")
	public static Class9 aClass9_1 = new Class9(64);

	@OriginalMember(owner = "client!ab", name = "Sc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_84 = Static56.method972("(U5");

	@OriginalMember(owner = "client!ab", name = "Vc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_85 = aClass5_82;

	@OriginalMember(owner = "client!ab", name = "Wc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_86 = Static56.method972("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!ab", name = "Yc", descriptor = "Lclient!ae;")
	public static Class5 aClass5_87 = Static56.method972(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!ab", name = "Zc", descriptor = "Lclient!je;")
	public static Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!ab", name = "bd", descriptor = "[Lclient!de;")
	public static Class20[] aClass20Array1 = new Class20[14];

	@OriginalMember(owner = "client!ab", name = "cd", descriptor = "Lclient!ae;")
	private static Class5 aClass5_88 = Static56.method972("Accept trade");

	@OriginalMember(owner = "client!ab", name = "ed", descriptor = "Lclient!ae;")
	public static Class5 aClass5_89 = aClass5_88;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)Lclient!ae;")
	public static Class5 method106(@OriginalArg(2) int arg0) {
		return Static70.method1194(true, arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub10 local10 = (Class3_Sub10) Static5.aClass51_1.method1316(); local10 != null; local10 = (Class3_Sub10) Static5.aClass51_1.method1310()) {
			if (local10.anInt2109 != -1 || local10.anIntArray233 != null) {
				@Pc(22) int local22 = 0;
				if (local10.anInt2112 < arg1) {
					local22 = arg1 - local10.anInt2112;
				} else if (local10.anInt2108 > arg1) {
					local22 = local10.anInt2108 - arg1;
				}
				if (local10.anInt2110 < arg2) {
					local22 += arg2 - local10.anInt2110;
				} else if (local10.anInt2105 > arg2) {
					local22 += local10.anInt2105 - arg2;
				}
				if (local22 - 64 > local10.anInt2117 || Static10.anInt2842 == 0 || arg3 != local10.anInt2102) {
					if (local10.aClass3_Sub2_Sub2_1 != null) {
						Static1.aClass3_Sub2_Sub1_1.method343(local10.aClass3_Sub2_Sub2_1);
						local10.aClass3_Sub2_Sub2_1 = null;
					}
					if (local10.aClass3_Sub2_Sub2_2 != null) {
						Static1.aClass3_Sub2_Sub1_1.method343(local10.aClass3_Sub2_Sub2_2);
						local10.aClass3_Sub2_Sub2_2 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(139) int local139 = (local10.anInt2117 - local22) * Static10.anInt2842 / local10.anInt2117;
					if (local10.aClass3_Sub2_Sub2_1 != null) {
						local10.aClass3_Sub2_Sub2_1.method1398(local139);
					} else if (local10.anInt2109 >= 0) {
						@Pc(157) Class54 local157 = Static121.method1461(Static60.aClass11_Sub1_112, local10.anInt2109);
						if (local157 != null) {
							@Pc(164) Class3_Sub4_Sub1 local164 = local157.method1462().method867(Static27.aClass46_1);
							@Pc(169) Class3_Sub2_Sub2 local169 = Static119.method1399(local164, local139);
							local169.method1403(-1);
							Static1.aClass3_Sub2_Sub1_1.method340(local169);
							local10.aClass3_Sub2_Sub2_1 = local169;
						}
					}
					if (local10.aClass3_Sub2_Sub2_2 != null) {
						local10.aClass3_Sub2_Sub2_2.method1398(local139);
						if (!local10.aClass3_Sub2_Sub2_2.method1392()) {
							local10.aClass3_Sub2_Sub2_2 = null;
						}
					} else if (local10.anIntArray233 != null && (local10.anInt2115 -= arg0) <= 0) {
						@Pc(213) int local213 = (int) (Math.random() * (double) local10.anIntArray233.length);
						@Pc(221) Class54 local221 = Static121.method1461(Static60.aClass11_Sub1_112, local10.anIntArray233[local213]);
						if (local221 != null) {
							@Pc(228) Class3_Sub4_Sub1 local228 = local221.method1462().method867(Static27.aClass46_1);
							@Pc(233) Class3_Sub2_Sub2 local233 = Static119.method1399(local228, local139);
							local233.method1403(0);
							Static1.aClass3_Sub2_Sub1_1.method340(local233);
							local10.aClass3_Sub2_Sub2_2 = local233;
							local10.anInt2115 = local10.anInt2104 + (int) ((double) (local10.anInt2113 - local10.anInt2104) * Math.random());
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)Lclient!ae;")
	public static Class5 method108(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static96.method1319(arg0) : Static33.aClass5_436;
	}

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V")
	public static void method110() {
		aClass39_1 = null;
		aClass5_88 = null;
		aClass9_1 = null;
		aClass5_85 = null;
		aClass5_82 = null;
		aClass5_86 = null;
		aClass11_6 = null;
		aClass5_83 = null;
		aClass5_89 = null;
		aClass5_87 = null;
		aClass9_2 = null;
		aClass3_Sub1_Sub2_Sub4_1 = null;
		aClass5_84 = null;
		aClass20Array1 = null;
		anIntArray34 = null;
		aClass5_81 = null;
		aClass3_Sub1_Sub2_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)V")
	public static void method111() {
		Static74.aBoolean91 = true;
		Static59.aBoolean75 = true;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V")
	public static void method112() {
		if (Static82.aClass18_2 != null) {
			Static82.aClass18_2.method405();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZI)Z")
	public static boolean method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg0 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static73.aClass42_1.method1015(Static12.anInt480, arg1, arg2, arg0);
		if (local18 == -1) {
			return false;
		}
		@Pc(35) int local35 = local18 >> 6 & 0x3;
		@Pc(39) int local39 = local18 & 0x1F;
		if (local39 == 10 || local39 == 11 || local39 == 22) {
			@Pc(54) Class3_Sub1_Sub15 local54 = Static72.method1211(local11);
			@Pc(67) int local67;
			@Pc(70) int local70;
			if (local35 == 0 || local35 == 2) {
				local70 = local54.anInt2331;
				local67 = local54.anInt2312;
			} else {
				local67 = local54.anInt2331;
				local70 = local54.anInt2312;
			}
			@Pc(81) int local81 = local54.anInt2335;
			if (local35 != 0) {
				local81 = (local81 >> 4 - local35) + (local81 << local35 & 0xF);
			}
			Static37.method696(0, arg2, 0, 2, local67, local70, true, local81, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], arg1);
		} else {
			Static37.method696(local39 + 1, arg2, local35, 2, 0, 0, true, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], arg1);
		}
		Static67.anInt1779 = Static99.anInt2491;
		Static5.anInt352 = 2;
		Static37.anInt1040 = 0;
		Static31.anInt1151 = Static45.anInt1269;
		return true;
	}
}
