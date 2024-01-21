import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!df", name = "L", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_3;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "I")
	public static int anInt725;

	@OriginalMember(owner = "client!df", name = "S", descriptor = "Lclient!mf;")
	public static Class56_Sub1 aClass56_Sub1_4;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "Lclient!aa;")
	public static Class2 aClass2_3 = new Class2();

	@OriginalMember(owner = "client!df", name = "B", descriptor = "I")
	public static int anInt719 = 0;

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Lclient!fc;")
	public static Class25 aClass25_314 = Static78.method1313("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!df", name = "M", descriptor = "Lclient!fc;")
	private static Class25 aClass25_318 = Static78.method1313("Connecting to update server");

	@OriginalMember(owner = "client!df", name = "D", descriptor = "Lclient!fc;")
	public static Class25 aClass25_315 = aClass25_318;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "Lclient!fc;")
	private static Class25 aClass25_316 = Static78.method1313("Loaded fonts");

	@OriginalMember(owner = "client!df", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_317 = aClass25_316;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	public static int anInt723 = 0;

	@OriginalMember(owner = "client!df", name = "O", descriptor = "Lclient!p;")
	public static Class63 aClass63_3 = new Class63(128);

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "Lclient!fc;")
	private static Class25 aClass25_320 = Static78.method1313("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_319 = aClass25_320;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLclient!fc;Lclient!fc;)V")
	public static void method584(@OriginalArg(0) int arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		if (arg0 == 0 && Static108.anInt2502 != -1) {
			Static53.aClass25_1240 = arg1;
			Static11.anInt277 = 0;
		}
		if (Static33.anInt916 == -1) {
			Static110.aBoolean113 = true;
		}
		for (@Pc(26) int local26 = 99; local26 > 0; local26--) {
			Static122.anIntArray495[local26] = Static122.anIntArray495[local26 - 1];
			Static118.aClass25Array23[local26] = Static118.aClass25Array23[local26 - 1];
			Static97.aClass25Array20[local26] = Static97.aClass25Array20[local26 - 1];
		}
		Static122.anIntArray495[0] = arg0;
		Static118.aClass25Array23[0] = arg2;
		Static97.aClass25Array20[0] = arg1;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Z")
	public static boolean method585() {
		@Pc(5) Class29 local5 = Static11.aClass29_1;
		synchronized (Static11.aClass29_1) {
			if (Static26.anInt728 == Static42.anInt1142) {
				return false;
			} else {
				Static15.anInt410 = Static62.anIntArray268[Static26.anInt728];
				Static94.anInt2164 = Static111.anIntArray435[Static26.anInt728];
				Static26.anInt728 = Static26.anInt728 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
	public static void method586() {
		aClass56_Sub1_4 = null;
		aClass56_Sub1_3 = null;
		aClass63_3 = null;
		aClass25_316 = null;
		aClass25_317 = null;
		aClass2_3 = null;
		aClass25_315 = null;
		aClass25_320 = null;
		aClass25_318 = null;
		aClass25_319 = null;
		aClass25_314 = null;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
	public static void method587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			Static68.aClass1_Sub5_Sub1_2.method688(197);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 2) {
			Static68.aClass1_Sub5_Sub1_2.method688(34);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 3) {
			Static68.aClass1_Sub5_Sub1_2.method688(35);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 4) {
			Static68.aClass1_Sub5_Sub1_2.method688(41);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 5) {
			Static68.aClass1_Sub5_Sub1_2.method688(165);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 6) {
			Static68.aClass1_Sub5_Sub1_2.method688(167);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 7) {
			Static68.aClass1_Sub5_Sub1_2.method688(194);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 8) {
			Static68.aClass1_Sub5_Sub1_2.method688(132);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 9) {
			Static68.aClass1_Sub5_Sub1_2.method688(150);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		if (arg2 == 10) {
			Static68.aClass1_Sub5_Sub1_2.method688(239);
			Static68.aClass1_Sub5_Sub1_2.method633(arg0);
			Static68.aClass1_Sub5_Sub1_2.method675(arg1);
		}
		@Pc(212) Class1_Sub2_Sub14 local212 = Static62.method1091(arg0, arg1);
		if (local212 != null && local212.anObjectArray18 != null) {
			Static27.method600(local212, local212.anObjectArray18, null, 0, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIII)V")
	public static void method588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static59.anInt1354 == arg1 && anInt725 == arg2 && (arg0 == Static82.anInt1812 || !Static63.aBoolean55)) {
			return;
		}
		Static59.anInt1354 = arg1;
		Static82.anInt1812 = arg0;
		if (!Static63.aBoolean55) {
			Static82.anInt1812 = 0;
		}
		anInt725 = arg2;
		Static99.method1645(25);
		Static111.method1790(null, Static2.aClass25_30, false);
		@Pc(53) int local53 = Static46.anInt1190;
		Static46.anInt1190 = (arg1 - 6) * 8;
		@Pc(64) int local64 = Static46.anInt1190 - local53;
		@Pc(66) int local66 = Static47.anInt1211;
		Static47.anInt1211 = arg2 * 8 - 48;
		@Pc(77) int local77 = Static47.anInt1211 - local66;
		for (@Pc(83) int local83 = 0; local83 < 32768; local83++) {
			@Pc(89) Class1_Sub2_Sub3_Sub4_Sub1 local89 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local83];
			if (local89 != null) {
				for (@Pc(93) int local93 = 0; local93 < 10; local93++) {
					local89.anIntArray484[local93] -= local64;
					local89.anIntArray485[local93] -= local77;
				}
				local89.anInt2827 -= local77 * 128;
				local89.anInt2832 -= local64 * 128;
			}
		}
		for (@Pc(139) int local139 = 0; local139 < 2048; local139++) {
			@Pc(145) Class1_Sub2_Sub3_Sub4_Sub2 local145 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local139];
			if (local145 != null) {
				for (@Pc(149) int local149 = 0; local149 < 10; local149++) {
					local145.anIntArray484[local149] -= local64;
					local145.anIntArray485[local149] -= local77;
				}
				local145.anInt2832 -= local64 * 128;
				local145.anInt2827 -= local77 * 128;
			}
		}
		Static21.anInt596 = arg0;
		@Pc(195) byte local195 = 104;
		Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1973(arg3, false, arg4);
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 1;
		if (local64 < 0) {
			local205 = -1;
			local203 = 103;
			local195 = -1;
		}
		@Pc(215) byte local215 = 0;
		@Pc(217) byte local217 = 104;
		@Pc(219) byte local219 = 1;
		if (local77 < 0) {
			local217 = -1;
			local219 = -1;
			local215 = 103;
		}
		for (@Pc(229) int local229 = local203; local229 != local195; local229 += local205) {
			for (@Pc(233) int local233 = local215; local233 != local217; local233 += local219) {
				@Pc(240) int local240 = local229 + local64;
				@Pc(244) int local244 = local233 + local77;
				for (@Pc(246) int local246 = 0; local246 < 4; local246++) {
					if (local240 >= 0 && local244 >= 0 && local240 < 104 && local244 < 104) {
						Static7.aClass2ArrayArrayArray1[local246][local229][local233] = Static7.aClass2ArrayArrayArray1[local246][local240][local244];
					} else {
						Static7.aClass2ArrayArrayArray1[local246][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(317) Class1_Sub16 local317 = (Class1_Sub16) Static38.aClass2_5.method22(); local317 != null; local317 = (Class1_Sub16) Static38.aClass2_5.method23()) {
			local317.anInt2579 -= local77;
			local317.anInt2584 -= local64;
			if (local317.anInt2584 < 0 || local317.anInt2579 < 0 || local317.anInt2584 >= 104 || local317.anInt2579 >= 104) {
				local317.method2024();
			}
		}
		Static122.anInt2922 = 0;
		if (Static62.anInt1391 != 0) {
			Static110.anInt2547 -= local77;
			Static62.anInt1391 -= local64;
		}
		Static84.aBoolean82 = false;
		Static118.anInt2718 = -1;
		Static100.aClass2_10.method19();
		Static119.aClass2_11.method19();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIBII)Z")
	public static boolean method589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		if (!Static57.method1727(arg0)) {
			return false;
		}
		Static66.aClass1_Sub2_Sub14Array1 = null;
		@Pc(33) boolean local33 = Static31.method715(Static56.aClass1_Sub2_Sub14ArrayArray1[arg0], arg3, -1, 0, arg1, 0, 0, arg2, 0);
		if (Static66.aClass1_Sub2_Sub14Array1 != null) {
			Static31.method715(Static66.aClass1_Sub2_Sub14Array1, arg3, -1412584499, 0, arg1, Static14.anInt408, Static105.anInt2391, arg2, 0);
		}
		return local33;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBI)V")
	public static void method590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static39.anInt1104 == 0 || arg2 == 0 || Static122.anInt2922 >= 50) {
			return;
		}
		Static78.anIntArray312[Static122.anInt2922] = arg0;
		Static122.anIntArray496[Static122.anInt2922] = arg2;
		Static1.anIntArray7[Static122.anInt2922] = arg1;
		Static22.aClass16Array2[Static122.anInt2922] = null;
		Static42.anIntArray217[Static122.anInt2922] = 0;
		Static122.anInt2922++;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
	public static void method591() {
		if (Static31.aClass42_1 != null) {
			@Pc(7) Class42 local7 = Static31.aClass42_1;
			synchronized (Static31.aClass42_1) {
				Static31.aClass42_1 = null;
			}
		}
	}
}
