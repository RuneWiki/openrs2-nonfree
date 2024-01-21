import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "Lclient!ih;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!fa", name = "ab", descriptor = "Lclient!c;")
	public static Class10 aClass10_49;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "I")
	public static int anInt1291;

	@OriginalMember(owner = "client!fa", name = "mb", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array1;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lclient!ai;")
	private static Class6 aClass6_340 = Static38.method685("Players");

	@OriginalMember(owner = "client!fa", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_341 = aClass6_340;

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
	public static int anInt1279 = -1;

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	public static void method832() {
		Static64.aClass2_Sub13_Sub1_1.method1454();
		@Pc(13) int local13 = Static64.aClass2_Sub13_Sub1_1.method1458(8);
		@Pc(22) int local22;
		if (Static81.anInt1985 > local13) {
			for (local22 = local13; local22 < Static81.anInt1985; local22++) {
				Static36.anIntArray57[Static96.anInt2394++] = Static149.anIntArray312[local22];
			}
		}
		if (local13 > Static81.anInt1985) {
			throw new RuntimeException("gnpov1");
		}
		Static81.anInt1985 = 0;
		for (local22 = 0; local22 < local13; local22++) {
			@Pc(65) int local65 = Static149.anIntArray312[local22];
			@Pc(69) Class2_Sub3_Sub5_Sub1_Sub2 local69 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local65];
			@Pc(74) int local74 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
			if (local74 == 0) {
				Static149.anIntArray312[Static81.anInt1985++] = local65;
				local69.anInt2662 = Static107.anInt2559;
			} else {
				@Pc(97) int local97 = Static64.aClass2_Sub13_Sub1_1.method1458(2);
				if (local97 == 0) {
					Static149.anIntArray312[Static81.anInt1985++] = local65;
					local69.anInt2662 = Static107.anInt2559;
					Static144.anIntArray300[Static28.anInt732++] = local65;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local97 == 1) {
						Static149.anIntArray312[Static81.anInt1985++] = local65;
						local69.anInt2662 = Static107.anInt2559;
						local139 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
						local69.method1798(local139, false);
						local149 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
						if (local149 == 1) {
							Static144.anIntArray300[Static28.anInt732++] = local65;
						}
					} else if (local97 == 2) {
						Static149.anIntArray312[Static81.anInt1985++] = local65;
						local69.anInt2662 = Static107.anInt2559;
						local139 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
						local69.method1798(local139, true);
						local149 = Static64.aClass2_Sub13_Sub1_1.method1458(3);
						local69.method1798(local149, true);
						@Pc(205) int local205 = Static64.aClass2_Sub13_Sub1_1.method1458(1);
						if (local205 == 1) {
							Static144.anIntArray300[Static28.anInt732++] = local65;
						}
					} else if (local97 == 3) {
						Static36.anIntArray57[Static96.anInt2394++] = local65;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)V")
	public static void method833() {
		Static81.aClass17_10.method509();
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V")
	public static void method835() {
		anIntArrayArrayArray1 = null;
		aClass6_341 = null;
		aClass36_2 = null;
		aClass10_49 = null;
		aClass2_Sub3_Sub2_Sub1Array1 = null;
		aClass6_340 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!te;Lclient!te;B)V")
	private static void method836(@OriginalArg(0) Class2_Sub3_Sub2_Sub4_Sub1 arg0, @OriginalArg(1) Class2_Sub3_Sub2_Sub4_Sub1 arg1) {
		if (Static171.aClass2_Sub3_Sub2_Sub1Array10 == null) {
			Static171.aClass2_Sub3_Sub2_Sub1Array10 = Static2.method46(Static9.aClass6_75, Static173.aClass6_1207, Static132.aClass10_Sub1_13);
		}
		if (Static137.aClass2_Sub3_Sub2_Sub3Array5 == null) {
			Static137.aClass2_Sub3_Sub2_Sub3Array5 = Static90.method2633(Static51.aClass6_389, Static9.aClass6_75, Static132.aClass10_Sub1_13);
		}
		if (Static58.aClass2_Sub3_Sub2_Sub3Array2 == null) {
			Static58.aClass2_Sub3_Sub2_Sub3Array2 = Static90.method2633(Static89.aClass6_664, Static9.aClass6_75, Static132.aClass10_Sub1_13);
		}
		if (Static140.aClass2_Sub3_Sub2_Sub3Array7 == null) {
			Static140.aClass2_Sub3_Sub2_Sub3Array7 = Static90.method2633(Static109.aClass6_1027, Static9.aClass6_75, Static132.aClass10_Sub1_13);
		}
		Static53.method2496(0, 23, 765, 480, 0);
		Static53.method2484(0, 0, 125, 23, 12425273, 9135624);
		Static53.method2484(125, 0, 640, 23, 5197647, 2697513);
		arg1.method2508(Static143.aClass6_985, 62, 15, 0, -1);
		if (Static140.aClass2_Sub3_Sub2_Sub3Array7 != null) {
			Static140.aClass2_Sub3_Sub2_Sub3Array7[1].method2398(140, 1);
			arg0.method2512(Static115.aClass6_796, 152, 10, 16777215, -1);
			Static140.aClass2_Sub3_Sub2_Sub3Array7[0].method2398(140, 12);
			arg0.method2512(Static52.aClass6_399, 152, 21, 16777215, -1);
		}
		if (Static58.aClass2_Sub3_Sub2_Sub3Array2 != null) {
			if (Static123.anIntArray248[0] == 0 && Static172.anIntArray389[0] == 0) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[2].method2398(280, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[0].method2398(280, 4);
			}
			if (Static123.anIntArray248[0] == 0 && Static172.anIntArray389[0] == 1) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[3].method2398(295, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[1].method2398(295, 4);
			}
			arg1.method2512(Static170.aClass6_1191, 312, 17, 16777215, -1);
			if (Static123.anIntArray248[0] == 1 && Static172.anIntArray389[0] == 0) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[2].method2398(390, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[0].method2398(390, 4);
			}
			if (Static123.anIntArray248[0] == 1 && Static172.anIntArray389[0] == 1) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[3].method2398(405, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[1].method2398(405, 4);
			}
			arg1.method2512(aClass6_341, 422, 17, 16777215, -1);
			if (Static123.anIntArray248[0] == 2 && Static172.anIntArray389[0] == 0) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[2].method2398(500, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[0].method2398(500, 4);
			}
			if (Static123.anIntArray248[0] == 2 && Static172.anIntArray389[0] == 1) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[3].method2398(515, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[1].method2398(515, 4);
			}
			arg1.method2512(Static108.aClass6_740, 532, 17, 16777215, -1);
			if (Static123.anIntArray248[0] == 3 && Static172.anIntArray389[0] == 0) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[2].method2398(610, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[0].method2398(610, 4);
			}
			if (Static123.anIntArray248[0] == 3 && Static172.anIntArray389[0] == 1) {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[3].method2398(625, 4);
			} else {
				Static58.aClass2_Sub3_Sub2_Sub3Array2[1].method2398(625, 4);
			}
			arg1.method2512(Static19.aClass6_143, 642, 17, 16777215, -1);
		}
		Static53.method2496(708, 4, 50, 16, 0);
		arg0.method2508(Static66.aClass6_486, 733, 16, 16777215, -1);
		Static139.anInt3249 = -1;
		if (Static171.aClass2_Sub3_Sub2_Sub1Array10 == null) {
			return;
		}
		@Pc(395) int local395 = 8;
		@Pc(401) int local401 = 24;
		@Pc(403) int local403;
		@Pc(405) int local405;
		do {
			local403 = local401;
			local405 = local395;
			if ((local395 - 1) * local401 >= Static117.anInt2796) {
				local395--;
			}
			if (Static117.anInt2796 <= local395 * (local401 - 1)) {
				local401--;
			}
			if (local395 * (local401 - 1) >= Static117.anInt2796) {
				local401--;
			}
		} while (local403 != local401 || local395 != local405);
		local405 = (480 - local401 * 19) / (local401 + 1);
		local403 = (765 - local395 * 88) / (local395 + 1);
		if (local405 > 5) {
			local405 = 5;
		}
		if (local403 > 5) {
			local403 = 5;
		}
		@Pc(496) int local496 = (765 - local395 * 88 - (local395 + -1) * local403) / 2;
		@Pc(498) int local498 = local496;
		@Pc(514) int local514 = (480 - local405 * (local401 - 1) - local401 * 19) / 2;
		@Pc(519) int local519 = local514 + 23;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < Static117.anInt2796; local523++) {
			@Pc(529) Class18 local529 = Static34.aClass18Array1[local523];
			@Pc(531) boolean local531 = true;
			@Pc(536) Class6 local536 = Static106.method2806(local529.anInt744);
			if (local529.anInt744 == -1) {
				local536 = Static36.aClass6_272;
				local531 = false;
			} else if (local529.anInt744 > 1980) {
				local536 = Static180.aClass6_1267;
				local531 = false;
			}
			if (Static69.anInt1736 >= local498 && local519 <= Static77.anInt1906 && local498 + 88 > Static69.anInt1736 && Static77.anInt1906 < local519 + 19 && local531) {
				Static139.anInt3249 = local523;
				Static171.aClass2_Sub3_Sub2_Sub1Array10[local529.aBoolean30 ? 1 : 0].method285(local498, local519);
			} else {
				Static171.aClass2_Sub3_Sub2_Sub1Array10[local529.aBoolean30 ? 1 : 0].method272(local498, local519);
			}
			if (Static137.aClass2_Sub3_Sub2_Sub3Array5 != null) {
				Static137.aClass2_Sub3_Sub2_Sub3Array5[local529.anInt740 + (local529.aBoolean30 ? 8 : 0)].method2398(local498 + 29, local519);
			}
			arg1.method2508(Static106.method2806(local529.anInt738), local498 + 15, local519 + 9 + 5, 0, -1);
			arg0.method2508(local536, local498 + 60, local519 - -14, 268435455, -1);
			local519 += local405 + 19;
			local521++;
			if (local401 <= local521) {
				local519 = local514 + 23;
				local498 += local403 + 88;
				local521 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!te;ILclient!te;)V")
	public static void method837(@OriginalArg(0) Class2_Sub3_Sub2_Sub4_Sub1 arg0, @OriginalArg(2) Class2_Sub3_Sub2_Sub4_Sub1 arg1) {
		if (Static138.aBoolean134) {
			method836(arg0, arg1);
			return;
		}
		if (Static156.anInt3638 == 0 || Static156.anInt3638 == 5) {
			arg1.method2508(Static176.aClass6_1234, 382, 225, 16777215, -1);
			Static53.method2501(230, 233, 304, 34, 9179409);
			Static53.method2501(231, 234, 302, 32, 0);
			Static53.method2496(232, 235, Static97.anInt2401 * 3, 30, 9179409);
			Static53.method2496(Static97.anInt2401 * 3 + 232, 235, 300 - Static97.anInt2401 * 3, 30, 0);
			arg1.method2508(Static9.aClass6_76, 382, 256, 16777215, -1);
		}
		@Pc(97) short local97;
		@Pc(121) int local121;
		if (Static156.anInt3638 == 20) {
			local97 = 211;
			Static171.aClass2_Sub3_Sub2_Sub3_5.method2398(382 - Static171.aClass2_Sub3_Sub2_Sub3_5.anInt3620 / 2, -(Static171.aClass2_Sub3_Sub2_Sub3_5.anInt3621 / 2) + 271);
			arg1.method2508(Static9.aClass6_78, 382, 211, 16776960, 0);
			local121 = local97 + 15;
			arg1.method2508(Static9.aClass6_80, 382, 226, 16776960, 0);
			@Pc(129) int local129 = local121 + 15;
			arg1.method2508(Static9.aClass6_73, 382, 241, 16776960, 0);
			@Pc(137) int local137 = local129 + 15;
			@Pc(138) int local138 = local137 + 10;
			arg1.method2512(Static58.method956(new Class6[] { Static176.aClass6_1241, Static175.method2510(Static9.aClass6_72) }), 272, 266, 16777215, 0);
			@Pc(158) int local158 = local138 + 15;
			arg1.method2512(Static58.method956(new Class6[] { Static40.aClass6_313, Static9.aClass6_79.method126() }), 274, 281, 16777215, 0);
			@Pc(179) int local179 = local158 + 15;
		}
		if (Static156.anInt3638 == 10) {
			Static171.aClass2_Sub3_Sub2_Sub3_5.method2398(202, 171);
			if (Static135.anInt3134 == 0) {
				local97 = 251;
				arg1.method2508(Static157.aClass6_1063, 382, 251, 16776960, 0);
				local121 = local97 + 30;
				Static152.aClass2_Sub3_Sub2_Sub3_4.method2398(229, 271);
				arg1.method2522(Static58.aClass6_422, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static152.aClass2_Sub3_Sub2_Sub3_4.method2398(389, 271);
				arg1.method2522(Static65.aClass6_474, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static135.anInt3134 == 2) {
				local97 = 211;
				arg1.method2508(Static9.aClass6_78, 382, 211, 16776960, 0);
				local121 = local97 + 15;
				arg1.method2508(Static9.aClass6_80, 382, 226, 16776960, 0);
				local121 += 15;
				arg1.method2508(Static9.aClass6_73, 382, 241, 16776960, 0);
				local121 += 15;
				local121 += 10;
				@Pc(382) boolean local382;
				if (Static107.anInt2562 == 0 && Static107.anInt2559 % 40 < 20 && Static84.aBoolean80) {
					local382 = true;
				} else {
					local382 = false;
				}
				arg1.method2512(Static58.method956(new Class6[] { Static176.aClass6_1241, Static175.method2510(Static9.aClass6_72), local382 ? Static88.aClass6_659 : Static9.aClass6_75 }), 272, 266, 16777215, 0);
				if (Static107.anInt2562 == 1 && Static107.anInt2559 % 40 < 20 && Static84.aBoolean80) {
					local382 = true;
				} else {
					local382 = false;
				}
				local121 += 15;
				arg1.method2512(Static58.method956(new Class6[] { Static40.aClass6_313, Static9.aClass6_79.method126(), local382 ? Static88.aClass6_659 : Static9.aClass6_75 }), 274, 281, 16777215, 0);
				Static152.aClass2_Sub3_Sub2_Sub3_4.method2398(229, 301);
				arg1.method2508(Static79.aClass6_600, 302, 326, 16777215, 0);
				Static152.aClass2_Sub3_Sub2_Sub3_4.method2398(389, 301);
				arg1.method2508(Static66.aClass6_486, 462, 326, 16777215, 0);
				local121 += 15;
			} else if (Static135.anInt3134 == 3) {
				arg1.method2508(Static46.aClass6_345, 382, 211, 16776960, 0);
				local97 = 236;
				arg1.method2508(Static179.aClass6_1264, 382, 236, 16777215, 0);
				local121 = local97 + 15;
				arg1.method2508(Static144.aClass6_993, 382, 251, 16777215, 0);
				local121 += 15;
				arg1.method2508(Static46.aClass6_344, 382, 266, 16777215, 0);
				local121 += 15;
				arg1.method2508(Static166.aClass6_1160, 382, 281, 16777215, 0);
				Static152.aClass2_Sub3_Sub2_Sub3_4.method2398(309, 301);
				arg1.method2508(Static66.aClass6_486, 382, 326, 16777215, 0);
				local121 += 15;
			}
		}
		if (Static63.anInt1567 != 1) {
			if (Static141.anInt3310 > 0) {
				Static41.method748(Static141.anInt3310);
				Static141.anInt3310 = 0;
			}
			Static63.method1012();
		}
		Static68.aClass2_Sub3_Sub2_Sub3Array3[Static68.aBoolean64 ? 1 : 0].method2398(725, 463);
		if (Static156.anInt3638 <= 5 || Static101.anInt2159 == 2 || Static54.anInt1438 != 0) {
			return;
		}
		if (Static1.aClass2_Sub3_Sub2_Sub3_1 == null) {
			Static1.aClass2_Sub3_Sub2_Sub3_1 = Static128.method1968(Static132.aClass10_Sub1_13, Static9.aClass6_75, Static146.aClass6_1197);
			return;
		}
		Static1.aClass2_Sub3_Sub2_Sub3_1.method2398(5, 463);
		arg1.method2508(Static58.method956(new Class6[] { Static170.aClass6_1187, Static5.aClass6_45, Static106.method2806(Static169.anInt3981) }), 55, 478, 16777215, 0);
		if (Static153.aClass32_1 == null) {
			arg0.method2508(Static159.aClass6_1119, 55, 492, 16777215, 0);
		} else {
			arg0.method2508(Static170.aClass6_1190, 55, 492, 16777215, 0);
		}
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
	public static void method839() {
		Static96.anInt2394 = 0;
		Static28.anInt732 = 0;
		Static120.method1888();
		Static92.method1501();
		Static144.method2227();
		Static155.method2674();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static96.anInt2394; local19++) {
			local25 = Static36.anIntArray57[local19];
			if (Static107.anInt2559 != Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local25].anInt2662) {
				Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static64.aClass2_Sub13_Sub1_1.anInt2154 != Static139.anInt3252) {
			throw new RuntimeException("gpp1 pos:" + Static64.aClass2_Sub13_Sub1_1.anInt2154 + " psize:" + Static139.anInt3252);
		}
		for (local25 = 0; local25 < Static167.anInt3925; local25++) {
			if (Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static167.anInt3925);
			}
		}
	}
}
