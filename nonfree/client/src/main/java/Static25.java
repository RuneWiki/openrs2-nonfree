import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "[I")
	public static int[] anIntArray29;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "Lclient!vb;")
	public static Class84 aClass84_2 = new Class84();

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "Lclient!me;")
	public static Class2_Sub13 aClass2_Sub13_1 = new Class2_Sub13(8);

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
	public static int anInt672 = 0;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_181 = Static38.method685("au");

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_183 = Static38.method685("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!d", name = "db", descriptor = "Lclient!ai;")
	public static Class6 aClass6_182 = aClass6_183;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)Z")
	public static boolean method462(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)I")
	public static int method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(8) int local8 = arg0;
			arg0 = arg2;
			arg2 = local8;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg5;
		} else if (local20 == 1) {
			return 1 + 7 - arg0 - arg3;
		} else if (local20 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	public static void method464() {
		aClass6_183 = null;
		anImage1 = null;
		aClass6_181 = null;
		anIntArray29 = null;
		aClass2_Sub13_1 = null;
		aClass84_2 = null;
		aClass6_182 = null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIII)V")
	public static void method465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static143.anInt3376 == arg4 && Static104.anInt2541 == arg3 && (arg2 == Static92.anInt2291 || !Static113.aBoolean112)) {
			return;
		}
		Static92.anInt2291 = arg2;
		if (!Static113.aBoolean112) {
			Static92.anInt2291 = 0;
		}
		Static104.anInt2541 = arg3;
		Static143.anInt3376 = arg4;
		Static98.method1607(25);
		Static59.method978(true, Static117.aClass6_801);
		@Pc(40) int local40 = Static176.anInt4061;
		@Pc(42) int local42 = Static2.anInt66;
		Static2.anInt66 = arg4 * 8 - 48;
		Static176.anInt4061 = arg3 * 8 - 48;
		@Pc(59) int local59 = Static176.anInt4061 - local40;
		@Pc(66) int local66 = Static2.anInt66 - local42;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class2_Sub3_Sub5_Sub1_Sub2 local76 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray221[local80] -= local66;
					local76.anIntArray223[local80] -= local59;
				}
				local76.anInt2672 -= local59 * 128;
				local76.anInt2674 -= local66 * 128;
			}
		}
		for (@Pc(126) int local126 = 0; local126 < 2048; local126++) {
			@Pc(132) Class2_Sub3_Sub5_Sub1_Sub1 local132 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local126];
			if (local132 != null) {
				for (@Pc(136) int local136 = 0; local136 < 10; local136++) {
					local132.anIntArray221[local136] -= local66;
					local132.anIntArray223[local136] -= local59;
				}
				local132.anInt2674 -= local66 * 128;
				local132.anInt2672 -= local59 * 128;
			}
		}
		Static36.anInt1020 = arg2;
		Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.method1803(arg1, false, arg0);
		@Pc(188) byte local188 = 0;
		@Pc(190) byte local190 = 1;
		@Pc(192) byte local192 = 104;
		@Pc(194) byte local194 = 0;
		@Pc(196) byte local196 = 104;
		if (local66 < 0) {
			local190 = -1;
			local188 = 103;
			local192 = -1;
		}
		@Pc(206) byte local206 = 1;
		if (local59 < 0) {
			local194 = 103;
			local206 = -1;
			local196 = -1;
		}
		for (@Pc(216) int local216 = local188; local216 != local192; local216 += local190) {
			for (@Pc(220) int local220 = local194; local220 != local196; local220 += local206) {
				@Pc(226) int local226 = local66 + local216;
				@Pc(231) int local231 = local220 + local59;
				for (@Pc(233) int local233 = 0; local233 < 4; local233++) {
					if (local226 >= 0 && local231 >= 0 && local226 < 104 && local231 < 104) {
						Static27.aClass84ArrayArrayArray1[local233][local216][local220] = Static27.aClass84ArrayArrayArray1[local233][local226][local231];
					} else {
						Static27.aClass84ArrayArrayArray1[local233][local216][local220] = null;
					}
				}
			}
		}
		for (@Pc(310) Class2_Sub22 local310 = (Class2_Sub22) Static110.aClass84_6.method2694(); local310 != null; local310 = (Class2_Sub22) Static110.aClass84_6.method2697()) {
			local310.anInt3557 -= local59;
			local310.anInt3545 -= local66;
			if (local310.anInt3545 < 0 || local310.anInt3557 < 0 || local310.anInt3545 >= 104 || local310.anInt3557 >= 104) {
				local310.method2808();
			}
		}
		if (Static152.anInt3513 != 0) {
			Static107.anInt2564 -= local59;
			Static152.anInt3513 -= local66;
		}
		Static122.anInt2842 = 0;
		Static11.anInt284 = -1;
		Static115.aBoolean113 = false;
		Static154.aClass84_13.method2695();
		Static112.aClass84_7.method2695();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
	public static void method466(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static65.anIntArray104[arg0];
		@Pc(14) int local14 = Static134.anIntArray283[arg0];
		@Pc(18) int local18 = Static117.anIntArray238[arg0];
		@Pc(22) int local22 = Static30.anIntArray34[arg0];
		if (local10 >= 2000) {
			local10 -= 2000;
		}
		if (local10 == 35) {
			Static30.aClass44_1.method1261(Static36.anInt1020, local22, local14);
		}
		@Pc(43) Class2_Sub3_Sub5_Sub1_Sub1 local43;
		if (local10 == 57) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static73.anInt1792 = 0;
				Static66.aClass2_Sub13_Sub1_2.method1455(79);
				Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			}
		}
		if (local10 == 38) {
			Static126.method1964();
		}
		if (local10 == 42) {
			Static66.aClass2_Sub13_Sub1_2.method1455(149);
			Static66.aClass2_Sub13_Sub1_2.method1447(Static146.anInt4005);
			Static66.aClass2_Sub13_Sub1_2.method1426(local14);
			Static66.aClass2_Sub13_Sub1_2.method1431(local22);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			Static66.aClass2_Sub13_Sub1_2.method1443(Static39.anInt1129);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 21) {
			Static66.aClass2_Sub13_Sub1_2.method1455(97);
			Static66.aClass2_Sub13_Sub1_2.method1421(local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			Static66.aClass2_Sub13_Sub1_2.method1447(local22);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		@Pc(201) boolean local201;
		if (local10 == 5) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static83.anInt2045 = Static5.anInt84;
			Static73.anInt1792 = 0;
			Static17.anInt2418 = Static155.anInt3959;
			Static113.anInt2749 = 2;
			Static66.aClass2_Sub13_Sub1_2.method1455(123);
			Static66.aClass2_Sub13_Sub1_2.method1447(Static146.anInt4005);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18);
			Static66.aClass2_Sub13_Sub1_2.method1443(Static39.anInt1129);
			Static66.aClass2_Sub13_Sub1_2.method1403(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1447(Static2.anInt66 + local22);
		}
		if (local10 == 40) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static17.anInt2418 = Static155.anInt3959;
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static66.aClass2_Sub13_Sub1_2.method1455(98);
				Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			}
		}
		if (local10 == 1007) {
			Static17.anInt2418 = Static155.anInt3959;
			Static73.anInt1792 = 0;
			Static113.anInt2749 = 2;
			Static83.anInt2045 = Static5.anInt84;
			Static66.aClass2_Sub13_Sub1_2.method1455(205);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18);
		}
		if (local10 == 41 && Static124.aClass87_9 == null) {
			Static146.method2706(local22, local14);
			Static124.aClass87_9 = Static72.method1126(local14, local22);
			Static151.method2327(Static124.aClass87_9);
		}
		@Pc(368) Class87 local368;
		if (local10 == 1004) {
			local368 = Static57.method940(local14);
			if (local368 == null || local368.anIntArray399[local22] < 100000) {
				Static66.aClass2_Sub13_Sub1_2.method1455(205);
				Static66.aClass2_Sub13_Sub1_2.method1403(local18);
			} else {
				Static6.method932(0, Static58.method956(new Class6[] { Static106.method2806(local368.anIntArray399[local22]), Static136.aClass6_924, Static92.method1502(local18).aClass6_612 }), Static9.aClass6_71);
			}
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		@Pc(435) Class2_Sub3_Sub5_Sub1_Sub2 local435;
		if (local10 == 13) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static17.anInt2418 = Static155.anInt3959;
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static66.aClass2_Sub13_Sub1_2.method1455(67);
				Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			}
		}
		if (local10 == 23) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static66.aClass2_Sub13_Sub1_2.method1455(162);
				Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			}
		}
		if (local10 == 30) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static83.anInt2045 = Static5.anInt84;
				Static66.aClass2_Sub13_Sub1_2.method1455(4);
				Static66.aClass2_Sub13_Sub1_2.method1447(Static146.anInt4005);
				Static66.aClass2_Sub13_Sub1_2.method1421(Static39.anInt1129);
				Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			}
		}
		if (local10 == 29) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static73.anInt1792 = 0;
			Static83.anInt2045 = Static5.anInt84;
			Static113.anInt2749 = 2;
			Static17.anInt2418 = Static155.anInt3959;
			Static66.aClass2_Sub13_Sub1_2.method1455(48);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			Static66.aClass2_Sub13_Sub1_2.method1431(Static176.anInt4061 + local14);
			Static66.aClass2_Sub13_Sub1_2.method1431(local22 + Static2.anInt66);
		}
		if (local10 == 32) {
			Static103.method1707(local14, local18, local22);
			Static66.aClass2_Sub13_Sub1_2.method1455(114);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18 >> 14 & 0x7FFF);
			Static66.aClass2_Sub13_Sub1_2.method1431(Static176.anInt4061 + local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22 + Static2.anInt66);
		}
		if (local10 == 47) {
			local368 = Static72.method1126(local14, local22);
			if (local368 != null) {
				Static182.method2817();
				Static151.method2329(local22, local14, Static149.method2286(Static179.method2802(local368)));
				Static122.anInt2841 = 0;
				Static3.aClass6_29 = Static94.method1534(local368);
				if (Static3.aClass6_29 == null) {
					Static3.aClass6_29 = Static136.aClass6_918;
				}
				if (local368.aBoolean174) {
					Static27.aClass6_194 = Static58.method956(new Class6[] { local368.aClass6_1217, Static64.aClass6_459 });
					return;
				}
				Static27.aClass6_194 = Static58.method956(new Class6[] { Static1.aClass6_2, local368.aClass6_1232, Static64.aClass6_459 });
			}
			return;
		}
		if (local10 == 19) {
			Static66.aClass2_Sub13_Sub1_2.method1455(24);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22);
			Static66.aClass2_Sub13_Sub1_2.method1426(local14);
			Static66.aClass2_Sub13_Sub1_2.method1443(Static39.anInt1129);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static146.anInt4005);
		}
		if (local10 == 20) {
			Static182.method2817();
			local368 = Static57.method940(local14);
			Static164.anInt3857 = local14;
			Static122.anInt2841 = 1;
			Static163.anInt3838 = local22;
			Static34.anInt995 = local18;
			Static151.method2327(local368);
			Static128.aClass6_856 = Static58.method956(new Class6[] { Static103.aClass6_714, Static92.method1502(local18).aClass6_612, Static64.aClass6_459 });
			if (Static128.aClass6_856 == null) {
				Static128.aClass6_856 = Static33.aClass6_252;
			}
			return;
		}
		if (local10 == 1) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static83.anInt2045 = Static5.anInt84;
				Static17.anInt2418 = Static155.anInt3959;
				Static113.anInt2749 = 2;
				Static73.anInt1792 = 0;
				Static66.aClass2_Sub13_Sub1_2.method1455(204);
				Static66.aClass2_Sub13_Sub1_2.method1403(local18);
				Static66.aClass2_Sub13_Sub1_2.method1447(Static163.anInt3838);
				Static66.aClass2_Sub13_Sub1_2.method1431(Static34.anInt995);
				Static66.aClass2_Sub13_Sub1_2.method1437(Static164.anInt3857);
			}
		}
		if (local10 == 46) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static113.anInt2749 = 2;
			Static17.anInt2418 = Static155.anInt3959;
			Static73.anInt1792 = 0;
			Static83.anInt2045 = Static5.anInt84;
			Static66.aClass2_Sub13_Sub1_2.method1455(68);
			Static66.aClass2_Sub13_Sub1_2.method1447(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22 + Static2.anInt66);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18);
		}
		if (local10 == 25) {
			Static103.method1707(local14, local18, local22);
			Static66.aClass2_Sub13_Sub1_2.method1455(100);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18 >> 14 & 0x7FFF);
			Static66.aClass2_Sub13_Sub1_2.method1403(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1447(Static2.anInt66 + local22);
		}
		@Pc(1112) int local1112;
		if (local10 == 31) {
			Static66.aClass2_Sub13_Sub1_2.method1455(71);
			Static66.aClass2_Sub13_Sub1_2.method1421(local14);
			local368 = Static57.method940(local14);
			if (local368.anIntArrayArray73 != null && local368.anIntArrayArray73[0][0] == 5) {
				local1112 = local368.anIntArrayArray73[0][1];
				if (Static11.anIntArray9[local1112] != local368.anIntArray393[0]) {
					Static11.anIntArray9[local1112] = local368.anIntArray393[0];
					Static141.method2183(local1112);
				}
			}
		}
		if (local10 == 49) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static73.anInt1792 = 0;
				Static83.anInt2045 = Static5.anInt84;
				Static66.aClass2_Sub13_Sub1_2.method1455(143);
				Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			}
		}
		if (local10 == 34) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static73.anInt1792 = 0;
				Static66.aClass2_Sub13_Sub1_2.method1455(242);
				Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			}
		}
		if (local10 == 17) {
			Static66.aClass2_Sub13_Sub1_2.method1455(217);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18);
			Static66.aClass2_Sub13_Sub1_2.method1431(local22);
			Static66.aClass2_Sub13_Sub1_2.method1437(local14);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 44) {
			@Pc(1286) boolean local1286 = true;
			local368 = Static57.method940(local14);
			if (local368.anInt4101 > 0) {
				local1286 = Static162.method2603(local368);
			}
			if (local1286) {
				Static66.aClass2_Sub13_Sub1_2.method1455(71);
				Static66.aClass2_Sub13_Sub1_2.method1421(local14);
			}
		}
		if (local10 == 1006) {
			Static73.anInt1792 = 0;
			Static17.anInt2418 = Static155.anInt3959;
			Static113.anInt2749 = 2;
			Static83.anInt2045 = Static5.anInt84;
			Static66.aClass2_Sub13_Sub1_2.method1455(77);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18 >> 14 & 0x7FFF);
		}
		if (local10 == 43) {
			Static66.aClass2_Sub13_Sub1_2.method1455(168);
			Static66.aClass2_Sub13_Sub1_2.method1447(local22);
			Static66.aClass2_Sub13_Sub1_2.method1437(local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 4) {
			Static103.method1707(local14, local18, local22);
			Static66.aClass2_Sub13_Sub1_2.method1455(22);
			Static66.aClass2_Sub13_Sub1_2.method1403(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1403(Static2.anInt66 + local22);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18 >> 14 & 0x7FFF);
		}
		if (local10 == 8) {
			Static66.aClass2_Sub13_Sub1_2.method1455(46);
			Static66.aClass2_Sub13_Sub1_2.method1403(local22);
			Static66.aClass2_Sub13_Sub1_2.method1437(local14);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 58) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static73.anInt1792 = 0;
			Static17.anInt2418 = Static155.anInt3959;
			Static83.anInt2045 = Static5.anInt84;
			Static113.anInt2749 = 2;
			Static66.aClass2_Sub13_Sub1_2.method1455(180);
			Static66.aClass2_Sub13_Sub1_2.method1447(local22 + Static2.anInt66);
			Static66.aClass2_Sub13_Sub1_2.method1431(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18);
		}
		if (local10 == 15) {
			Static66.aClass2_Sub13_Sub1_2.method1455(101);
			Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			Static66.aClass2_Sub13_Sub1_2.method1403(Static34.anInt995);
			Static66.aClass2_Sub13_Sub1_2.method1426(local14);
			Static66.aClass2_Sub13_Sub1_2.method1443(Static164.anInt3857);
			Static66.aClass2_Sub13_Sub1_2.method1447(local22);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static163.anInt3838);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 33) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static113.anInt2749 = 2;
				Static83.anInt2045 = Static5.anInt84;
				Static73.anInt1792 = 0;
				Static17.anInt2418 = Static155.anInt3959;
				Static66.aClass2_Sub13_Sub1_2.method1455(152);
				Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			}
		}
		if (local10 == 10) {
			Static66.aClass2_Sub13_Sub1_2.method1455(137);
			Static66.aClass2_Sub13_Sub1_2.method1431(local22);
			Static66.aClass2_Sub13_Sub1_2.method1443(local14);
			Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 24) {
			Static66.aClass2_Sub13_Sub1_2.method1455(139);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			Static66.aClass2_Sub13_Sub1_2.method1443(local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 45) {
			Static66.aClass2_Sub13_Sub1_2.method1455(167);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			Static66.aClass2_Sub13_Sub1_2.method1421(local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 7) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static113.anInt2749 = 2;
				Static83.anInt2045 = Static5.anInt84;
				Static17.anInt2418 = Static155.anInt3959;
				Static66.aClass2_Sub13_Sub1_2.method1455(121);
				Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			}
		}
		if (local10 == 39) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static17.anInt2418 = Static155.anInt3959;
				Static73.anInt1792 = 0;
				Static113.anInt2749 = 2;
				Static83.anInt2045 = Static5.anInt84;
				Static66.aClass2_Sub13_Sub1_2.method1455(85);
				Static66.aClass2_Sub13_Sub1_2.method1403(Static146.anInt4005);
				Static66.aClass2_Sub13_Sub1_2.method1403(local18);
				Static66.aClass2_Sub13_Sub1_2.method1421(Static39.anInt1129);
			}
		}
		if (local10 == 48) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static83.anInt2045 = Static5.anInt84;
			Static17.anInt2418 = Static155.anInt3959;
			Static113.anInt2749 = 2;
			Static73.anInt1792 = 0;
			Static66.aClass2_Sub13_Sub1_2.method1455(158);
			Static66.aClass2_Sub13_Sub1_2.method1403(local18);
			Static66.aClass2_Sub13_Sub1_2.method1447(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1403(Static2.anInt66 + local22);
		}
		if (local10 == 18) {
			Static66.aClass2_Sub13_Sub1_2.method1455(208);
			Static66.aClass2_Sub13_Sub1_2.method1437(local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22);
			Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 3) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static17.anInt2418 = Static155.anInt3959;
				Static113.anInt2749 = 2;
				Static83.anInt2045 = Static5.anInt84;
				Static66.aClass2_Sub13_Sub1_2.method1455(102);
				Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			}
		}
		if (local10 == 22) {
			Static66.aClass2_Sub13_Sub1_2.method1455(83);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			Static66.aClass2_Sub13_Sub1_2.method1431(local22);
			Static66.aClass2_Sub13_Sub1_2.method1443(local14);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 12) {
			Static66.aClass2_Sub13_Sub1_2.method1455(175);
			Static66.aClass2_Sub13_Sub1_2.method1437(local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22);
			Static66.aClass2_Sub13_Sub1_2.method1447(local18);
			Static107.anInt2561 = 0;
			Static152.aClass87_11 = Static57.method940(local14);
			Static116.anInt2782 = local22;
		}
		if (local10 == 37) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static113.anInt2749 = 2;
				Static73.anInt1792 = 0;
				Static83.anInt2045 = Static5.anInt84;
				Static17.anInt2418 = Static155.anInt3959;
				Static66.aClass2_Sub13_Sub1_2.method1455(25);
				Static66.aClass2_Sub13_Sub1_2.method1431(Static163.anInt3838);
				Static66.aClass2_Sub13_Sub1_2.method1403(Static34.anInt995);
				Static66.aClass2_Sub13_Sub1_2.method1403(local18);
				Static66.aClass2_Sub13_Sub1_2.method1426(Static164.anInt3857);
			}
		}
		if (local10 == 1001) {
			Static83.anInt2045 = Static5.anInt84;
			Static113.anInt2749 = 2;
			Static73.anInt1792 = 0;
			Static17.anInt2418 = Static155.anInt3959;
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				@Pc(2167) Class2_Sub3_Sub17 local2167 = local435.aClass2_Sub3_Sub17_1;
				if (local2167.anIntArray382 != null) {
					local2167 = local2167.method2651();
				}
				if (local2167 != null) {
					Static66.aClass2_Sub13_Sub1_2.method1455(54);
					Static66.aClass2_Sub13_Sub1_2.method1403(local2167.anInt3918);
				}
			}
		}
		if (local10 == 1003) {
			Static103.method1707(local14, local18, local22);
			Static66.aClass2_Sub13_Sub1_2.method1455(55);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18 >> 14 & 0x7FFF);
			Static66.aClass2_Sub13_Sub1_2.method1431(local22 + Static2.anInt66);
			Static66.aClass2_Sub13_Sub1_2.method1447(local14 + Static176.anInt4061);
		}
		if (local10 == 26) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static73.anInt1792 = 0;
				Static66.aClass2_Sub13_Sub1_2.method1455(177);
				Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			}
		}
		if (local10 == 2) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static83.anInt2045 = Static5.anInt84;
				Static17.anInt2418 = Static155.anInt3959;
				Static113.anInt2749 = 2;
				Static73.anInt1792 = 0;
				Static66.aClass2_Sub13_Sub1_2.method1455(150);
				Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			}
		}
		if (local10 == 16 && Static103.method1707(local14, local18, local22)) {
			Static66.aClass2_Sub13_Sub1_2.method1455(31);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18 >> 14 & 0x7FFF);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static176.anInt4061 + local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(local22 + Static2.anInt66);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static146.anInt4005);
			Static66.aClass2_Sub13_Sub1_2.method1426(Static39.anInt1129);
		}
		if (local10 == 6) {
			local435 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local18];
			if (local435 != null) {
				Static74.method1151(local435.anIntArray221[0], 0, 1, local435.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static73.anInt1792 = 0;
				Static83.anInt2045 = Static5.anInt84;
				Static113.anInt2749 = 2;
				Static17.anInt2418 = Static155.anInt3959;
				Static66.aClass2_Sub13_Sub1_2.method1455(86);
				Static66.aClass2_Sub13_Sub1_2.method1403(local18);
			}
		}
		if (local10 == 51) {
			Static103.method1707(local14, local18, local22);
			Static66.aClass2_Sub13_Sub1_2.method1455(66);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static2.anInt66 + local22);
			Static66.aClass2_Sub13_Sub1_2.method1431(Static176.anInt4061 + local14);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18 >> 14 & 0x7FFF);
		}
		if (local10 == 9 || local10 == 1002) {
			Static97.method1573(Static134.aClass6Array17[arg0], local22, local18, local14);
		}
		if (local10 == 28 && Static103.method1707(local14, local18, local22)) {
			Static66.aClass2_Sub13_Sub1_2.method1455(140);
			Static66.aClass2_Sub13_Sub1_2.method1403(Static163.anInt3838);
			Static66.aClass2_Sub13_Sub1_2.method1403(local14 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1443(Static164.anInt3857);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static2.anInt66 + local22);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18 >> 14 & 0x7FFF);
			Static66.aClass2_Sub13_Sub1_2.method1403(Static34.anInt995);
		}
		if (local10 == 50) {
			Static66.aClass2_Sub13_Sub1_2.method1455(71);
			Static66.aClass2_Sub13_Sub1_2.method1421(local14);
			local368 = Static57.method940(local14);
			if (local368.anIntArrayArray73 != null && local368.anIntArrayArray73[0][0] == 5) {
				local1112 = local368.anIntArrayArray73[0][1];
				Static11.anIntArray9[local1112] = 1 - Static11.anIntArray9[local1112];
				Static141.method2183(local1112);
			}
		}
		if (local10 == 14) {
			local43 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local18];
			if (local43 != null) {
				Static74.method1151(local43.anIntArray221[0], 0, 1, local43.anIntArray223[0], 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
				Static17.anInt2418 = Static155.anInt3959;
				Static83.anInt2045 = Static5.anInt84;
				Static73.anInt1792 = 0;
				Static113.anInt2749 = 2;
				Static66.aClass2_Sub13_Sub1_2.method1455(212);
				Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			}
		}
		if (local10 == 11) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static73.anInt1792 = 0;
			Static83.anInt2045 = Static5.anInt84;
			Static17.anInt2418 = Static155.anInt3959;
			Static113.anInt2749 = 2;
			Static66.aClass2_Sub13_Sub1_2.method1455(61);
			Static66.aClass2_Sub13_Sub1_2.method1428(local18);
			Static66.aClass2_Sub13_Sub1_2.method1447(local22 + Static2.anInt66);
			Static66.aClass2_Sub13_Sub1_2.method1431(local14 + Static176.anInt4061);
		}
		if (local10 == 36) {
			local201 = Static74.method1151(local22, 0, 0, local14, 0, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			if (!local201) {
				Static74.method1151(local22, 0, 1, local14, 1, 2, 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray221[0], 0, Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anIntArray223[0], false);
			}
			Static73.anInt1792 = 0;
			Static113.anInt2749 = 2;
			Static17.anInt2418 = Static155.anInt3959;
			Static83.anInt2045 = Static5.anInt84;
			Static66.aClass2_Sub13_Sub1_2.method1455(38);
			Static66.aClass2_Sub13_Sub1_2.method1431(Static163.anInt3838);
			Static66.aClass2_Sub13_Sub1_2.method1431(local18);
			Static66.aClass2_Sub13_Sub1_2.method1437(Static164.anInt3857);
			Static66.aClass2_Sub13_Sub1_2.method1403(Static2.anInt66 + local22);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static176.anInt4061 + local14);
			Static66.aClass2_Sub13_Sub1_2.method1428(Static34.anInt995);
		}
		if (Static122.anInt2841 != 0) {
			Static122.anInt2841 = 0;
			Static151.method2327(Static57.method940(Static164.anInt3857));
		}
		if (Static26.aBoolean28) {
			Static182.method2817();
		}
		if (Static152.aClass87_11 != null && Static107.anInt2561 == 0) {
			Static151.method2327(Static152.aClass87_11);
		}
	}
}
