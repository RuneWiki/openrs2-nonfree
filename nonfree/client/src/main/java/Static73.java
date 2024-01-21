import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!n", name = "ub", descriptor = "Lclient!w;")
	public static Class34 aClass34_1;

	@OriginalMember(owner = "client!n", name = "Jb", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!n", name = "Tb", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!n", name = "Yb", descriptor = "Lclient!u;")
	public static Class74 aClass74_3;

	@OriginalMember(owner = "client!n", name = "kc", descriptor = "Lclient!fd;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!n", name = "nb", descriptor = "Lclient!eb;")
	public static Class17 aClass17_36 = new Class17(100);

	@OriginalMember(owner = "client!n", name = "Gb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_997 = Static59.method1195("System update in: ");

	@OriginalMember(owner = "client!n", name = "qb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_994 = aClass60_997;

	@OriginalMember(owner = "client!n", name = "tb", descriptor = "I")
	public static int anInt2343 = 0;

	@OriginalMember(owner = "client!n", name = "xb", descriptor = "Lclient!qf;")
	private static Class60 aClass60_995 = Static59.method1195("Loading config )2 ");

	@OriginalMember(owner = "client!n", name = "Bb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_996 = aClass60_995;

	@OriginalMember(owner = "client!n", name = "Db", descriptor = "I")
	public static int anInt2349 = 0;

	@OriginalMember(owner = "client!n", name = "Xb", descriptor = "Lclient!qf;")
	public static Class60 aClass60_998 = null;

	@OriginalMember(owner = "client!n", name = "hc", descriptor = "I")
	public static int anInt2367 = -1;

	@OriginalMember(owner = "client!n", name = "mc", descriptor = "Lclient!qf;")
	public static Class60 aClass60_999 = Static59.method1195("(Y");

	@OriginalMember(owner = "client!n", name = "nc", descriptor = "I")
	public static int anInt2370 = -1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB[I[II[Lclient!ec;)V")
	public static void method1521(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class18[] arg4) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(24) int local24 = arg0 - 1;
		@Pc(28) int local28 = arg3 + 1;
		@Pc(34) int local34 = (arg0 + arg3) / 2;
		@Pc(38) Class18 local38 = arg4[local34];
		arg4[local34] = arg4[arg0];
		arg4[arg0] = local38;
		while (local28 > local24) {
			@Pc(52) boolean local52 = true;
			@Pc(55) int local55;
			@Pc(70) int local70;
			@Pc(65) int local65;
			do {
				local28--;
				for (local55 = 0; local55 < 4; local55++) {
					if (arg1[local55] == 2) {
						local65 = local38.anInt994;
						local70 = arg4[local28].anInt994;
					} else if (arg1[local55] == 1) {
						local70 = arg4[local28].anInt996;
						local65 = local38.anInt996;
						if (local70 == -1 && arg2[local55] == 1) {
							local70 = 2001;
						}
						if (local65 == -1 && arg2[local55] == 1) {
							local65 = 2001;
						}
					} else if (arg1[local55] == 3) {
						local70 = arg4[local28].aBoolean31 ? 1 : 0;
						local65 = local38.aBoolean31 ? 1 : 0;
					} else {
						local65 = local38.anInt998;
						local70 = arg4[local28].anInt998;
					}
					if (local65 != local70) {
						if ((arg2[local55] != 1 || local70 <= local65) && (arg2[local55] != 0 || local65 <= local70)) {
							local52 = false;
						}
						break;
					}
					if (local55 == 3) {
						local52 = false;
					}
				}
			} while (local52);
			local52 = true;
			do {
				local24++;
				for (local55 = 0; local55 < 4; local55++) {
					if (arg1[local55] == 2) {
						local70 = arg4[local24].anInt994;
						local65 = local38.anInt994;
					} else if (arg1[local55] == 1) {
						local70 = arg4[local24].anInt996;
						local65 = local38.anInt996;
						if (local70 == -1 && arg2[local55] == 1) {
							local70 = 2001;
						}
						if (local65 == -1 && arg2[local55] == 1) {
							local65 = 2001;
						}
					} else if (arg1[local55] == 3) {
						local70 = arg4[local24].aBoolean31 ? 1 : 0;
						local65 = local38.aBoolean31 ? 1 : 0;
					} else {
						local70 = arg4[local24].anInt998;
						local65 = local38.anInt998;
					}
					if (local70 != local65) {
						if ((arg2[local55] != 1 || local70 >= local65) && (arg2[local55] != 0 || local70 <= local65)) {
							local52 = false;
						}
						break;
					}
					if (local55 == 3) {
						local52 = false;
					}
				}
			} while (local52);
			if (local28 > local24) {
				@Pc(319) Class18 local319 = arg4[local24];
				arg4[local24] = arg4[local28];
				arg4[local28] = local319;
			}
		}
		method1521(arg0, arg1, arg2, local28, arg4);
		method1521(local28 + 1, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!n", name = "k", descriptor = "(I)Lclient!gd;")
	public static Class3_Sub1_Sub2_Sub2 method1522() {
		@Pc(20) Class3_Sub1_Sub2_Sub2 local20 = new Class3_Sub1_Sub2_Sub2(Static32.anIntArray133, Static15.anIntArray74, Static33.anIntArray138, Static123.anIntArray378, Static2.aByteArrayArray3);
		Static60.method1206();
		return local20;
	}

	@OriginalMember(owner = "client!n", name = "l", descriptor = "(I)V")
	public static void method1524() {
		aFrame1 = null;
		aClass21_1 = null;
		aClass60_998 = null;
		aClass60_994 = null;
		aClass74_3 = null;
		aClass17_36 = null;
		aClass60_995 = null;
		aClass34_1 = null;
		aClass60_999 = null;
		anIntArray237 = null;
		aClass60_997 = null;
		aClass60_996 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!jb;ILclient!jb;Lclient!jb;)V")
	public static void method1525(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Class25 arg1, @OriginalArg(3) Class25 arg2) {
		Static59.aClass25_15 = arg2;
		Static2.aClass25_1 = arg1;
		Static26.aClass25_5 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "m", descriptor = "(I)V")
	public static void method1527() {
		@Pc(13) int local13 = Static123.aClass3_Sub1_Sub2_Sub2_4.method848(Static118.aClass60_1345);
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < Static22.anInt872; local15++) {
			local23 = Static123.aClass3_Sub1_Sub2_Sub2_4.method848(Static68.aClass60Array12[local15]);
			if (local13 < local23) {
				local13 = local23;
			}
		}
		local13 += 8;
		local23 = Static22.anInt872 * 15 + 21;
		@Pc(97) int local97;
		@Pc(88) int local88;
		if (Static114.anInt3185 != -1) {
			Static71.anInt1516 = Static22.anInt872 * 15 + 22;
			Static45.anInt1441 = local13;
			Static67.aBoolean69 = true;
			Static19.anInt3405 = 0;
			local97 = Static130.anInt3486 - local13 / 2;
			if (local13 + local97 > 765) {
				local97 = 765 - local13;
			}
			if (local97 < 0) {
				local97 = 0;
			}
			Static125.anInt3381 = local97;
			local88 = Static84.anInt2576;
			if (local23 + local88 > 503) {
				local88 = 503 - local23;
			}
			if (local88 < 0) {
				local88 = 0;
			}
			Static119.anInt3240 = local88;
			return;
		}
		if (Static130.anInt3486 > 4 && Static84.anInt2576 > 4 && Static130.anInt3486 < 516 && Static84.anInt2576 < 338) {
			Static71.anInt1516 = Static22.anInt872 * 15 + 22;
			Static19.anInt3405 = 0;
			Static67.aBoolean69 = true;
			local97 = Static130.anInt3486 - local13 / 2 - 4;
			if (local13 + local97 > 512) {
				local97 = 512 - local13;
			}
			if (local97 < 0) {
				local97 = 0;
			}
			Static125.anInt3381 = local97;
			local88 = Static84.anInt2576 - 4;
			if (local88 + local23 > 334) {
				local88 = 334 - local23;
			}
			if (local88 < 0) {
				local88 = 0;
			}
			Static45.anInt1441 = local13;
			Static119.anInt3240 = local88;
			return;
		}
		if (Static130.anInt3486 > 553 && Static84.anInt2576 > 205 && Static130.anInt3486 < 743 && Static84.anInt2576 < 466) {
			Static67.aBoolean69 = true;
			Static45.anInt1441 = local13;
			Static19.anInt3405 = 1;
			Static71.anInt1516 = Static22.anInt872 * 15 + 22;
			local88 = Static84.anInt2576 - 205;
			local97 = Static130.anInt3486 - local13 / 2 - 553;
			if (local88 < 0) {
				local88 = 0;
			} else if (local23 + local88 > 261) {
				local88 = 261 - local23;
			}
			if (local97 < 0) {
				local97 = 0;
			} else if (local13 + local97 > 190) {
				local97 = 190 - local13;
			}
			Static125.anInt3381 = local97;
			Static119.anInt3240 = local88;
			return;
		}
		if (Static130.anInt3486 <= 17 || Static84.anInt2576 <= 357 || Static130.anInt3486 >= 496 || Static84.anInt2576 >= 453) {
			return;
		}
		Static19.anInt3405 = 2;
		Static71.anInt1516 = Static22.anInt872 * 15 + 22;
		local88 = Static84.anInt2576 - 357;
		local97 = Static130.anInt3486 - local13 / 2 - 17;
		if (local97 < 0) {
			local97 = 0;
		} else if (local13 + local97 > 479) {
			local97 = 479 - local13;
		}
		Static67.aBoolean69 = true;
		Static125.anInt3381 = local97;
		Static45.anInt1441 = local13;
		if (local88 < 0) {
			local88 = 0;
		} else if (local23 + local88 > 96) {
			local88 = 96 - local23;
		}
		Static119.anInt3240 = local88;
		return;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(BI)V")
	public static void method1528(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static89.anIntArray279[arg0];
		@Pc(19) int local19 = Static115.anIntArray339[arg0];
		@Pc(23) int local23 = Static2.anIntArray22[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		@Pc(33) int local33 = Static49.anIntArray188[arg0];
		if (Static103.anInt2994 != 0 && local23 != 1001) {
			Static103.anInt2994 = 0;
			Static71.aBoolean49 = true;
		}
		if (local23 == 1005) {
			Static103.anInt2993 = Static130.anInt3486;
			Static49.anInt1594 = 2;
			Static11.anInt354 = 0;
			Static3.anInt127 = Static84.anInt2576;
			Static81.aClass3_Sub12_Sub1_2.method1980(4);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33 >> 14 & 0x7FFF);
		}
		if (local23 == 57) {
			Static81.aClass3_Sub12_Sub1_2.method1980(11);
			Static81.aClass3_Sub12_Sub1_2.method1924(local15);
			Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			Static81.aClass3_Sub12_Sub1_2.method1970(local33);
			Static32.anInt1113 = local19;
			Static28.anInt3336 = 2;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			Static93.anInt2677 = 0;
			if (local19 >> 16 == Static78.anInt2429) {
				Static28.anInt3336 = 3;
			}
			Static108.anInt3055 = local15;
		}
		if (local23 == 32 && Static96.anInt2745 == -1) {
			Static39.method882(local19, local15);
			Static130.anInt3485 = local15;
			Static96.anInt2745 = local19;
		}
		if (local23 == 24 || local23 == 1006) {
			Static56.method1155(local33, local15, local19);
		}
		@Pc(175) boolean local175;
		if (local23 == 4) {
			local175 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local175) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static11.anInt354 = 0;
			Static49.anInt1594 = 2;
			Static103.anInt2993 = Static130.anInt3486;
			Static3.anInt127 = Static84.anInt2576;
			Static81.aClass3_Sub12_Sub1_2.method1980(250);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static13.anInt410 + local19);
		}
		@Pc(238) Class3_Sub1_Sub1_Sub3_Sub2 local238;
		if (local23 == 29) {
			local238 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local238 != null) {
				Static67.method1378(local238.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local238.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static103.anInt2993 = Static130.anInt3486;
				Static11.anInt354 = 0;
				Static3.anInt127 = Static84.anInt2576;
				Static81.aClass3_Sub12_Sub1_2.method1980(138);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			}
		}
		@Pc(325) int local325;
		@Pc(307) Class3_Sub15 local307;
		if (local23 == 3) {
			Static81.aClass3_Sub12_Sub1_2.method1980(87);
			Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			local307 = Static86.method1067(local19);
			if (local307.anIntArrayArray56 != null && local307.anIntArrayArray56[0][0] == 5) {
				local325 = local307.anIntArrayArray56[0][1];
				if (local307.anIntArray229[0] != Static18.anIntArray80[local325]) {
					Static18.anIntArray80[local325] = local307.anIntArray229[0];
					Static64.method1335(local325);
					Static118.aBoolean115 = true;
				}
			}
		}
		@Pc(354) Class3_Sub1_Sub1_Sub3_Sub1 local354;
		if (local23 == 44) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static11.anInt354 = 0;
				Static103.anInt2993 = Static130.anInt3486;
				Static3.anInt127 = Static84.anInt2576;
				Static81.aClass3_Sub12_Sub1_2.method1980(173);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			}
		}
		if (local23 == 17) {
			Static78.method1573(local33, local15, local19);
			Static81.aClass3_Sub12_Sub1_2.method1980(53);
			Static81.aClass3_Sub12_Sub1_2.method1970(local33 >> 14 & 0x7FFF);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static112.anInt3118 + local15);
		}
		if (local23 == 8) {
			Static81.aClass3_Sub12_Sub1_2.method1980(212);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			Static81.aClass3_Sub12_Sub1_2.method1951(local19);
			Static93.anInt2677 = 0;
			Static32.anInt1113 = local19;
			Static108.anInt3055 = local15;
			Static28.anInt3336 = 2;
			if (local19 >> 16 == Static79.anInt2467) {
				Static28.anInt3336 = 1;
			}
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 27) {
			local238 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local238 != null) {
				Static67.method1378(local238.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local238.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static3.anInt127 = Static84.anInt2576;
				Static49.anInt1594 = 2;
				Static103.anInt2993 = Static130.anInt3486;
				Static11.anInt354 = 0;
				Static81.aClass3_Sub12_Sub1_2.method1980(241);
				Static81.aClass3_Sub12_Sub1_2.method1967(local33);
			}
		}
		if (local23 == 48) {
			local175 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local175) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static49.anInt1594 = 2;
			Static103.anInt2993 = Static130.anInt3486;
			Static11.anInt354 = 0;
			Static3.anInt127 = Static84.anInt2576;
			Static81.aClass3_Sub12_Sub1_2.method1980(182);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1970(Static103.anInt2999);
			Static81.aClass3_Sub12_Sub1_2.method1961(Static45.anInt1433);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33);
		}
		if (local23 == 53 && Static78.method1573(local33, local15, local19)) {
			Static81.aClass3_Sub12_Sub1_2.method1980(135);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33 >> 14 & 0x7FFF);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static103.anInt2999);
			Static81.aClass3_Sub12_Sub1_2.method1970(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1951(Static45.anInt1433);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static13.anInt410 + local19);
		}
		if (local23 == 50) {
			Static81.aClass3_Sub12_Sub1_2.method1980(21);
			Static81.aClass3_Sub12_Sub1_2.method1970(local33);
			Static81.aClass3_Sub12_Sub1_2.method1951(local19);
			Static81.aClass3_Sub12_Sub1_2.method1922(local15);
			Static93.anInt2677 = 0;
			Static28.anInt3336 = 2;
			if (local19 >> 16 == Static79.anInt2467) {
				Static28.anInt3336 = 1;
			}
			Static108.anInt3055 = local15;
			if (local19 >> 16 == Static78.anInt2429) {
				Static28.anInt3336 = 3;
			}
			Static32.anInt1113 = local19;
		}
		if (local23 == 9) {
			Static119.method2149(Static129.anInt3460);
			Static71.aBoolean49 = true;
			Static129.anInt3460 = -1;
		}
		if (local23 == 1007) {
			Static103.anInt2993 = Static130.anInt3486;
			Static3.anInt127 = Static84.anInt2576;
			Static11.anInt354 = 0;
			Static49.anInt1594 = 2;
			local238 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local238 != null) {
				@Pc(764) Class3_Sub1_Sub16 local764 = local238.aClass3_Sub1_Sub16_1;
				if (local764.anIntArray334 != null) {
					local764 = local764.method2093();
				}
				if (local764 != null) {
					Static81.aClass3_Sub12_Sub1_2.method1980(136);
					Static81.aClass3_Sub12_Sub1_2.method1924(local764.anInt3172);
				}
			}
		}
		if (local23 == 1002) {
			local307 = Static86.method1067(local19);
			if (local307 == null || local307.anIntArray230[local15] < 100000) {
				Static81.aClass3_Sub12_Sub1_2.method1980(7);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			} else {
				Static76.method1565(0, Static60.method1211(new Class60[] { Static65.method1341(local307.anIntArray230[local15]), Static126.aClass60_1417, Static22.method568(local33).aClass60_816 }), Static120.aClass60_1369);
			}
			Static32.anInt1113 = local19;
			Static108.anInt3055 = local15;
			Static93.anInt2677 = 0;
			Static28.anInt3336 = 2;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 37) {
			local175 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local175) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static11.anInt354 = 0;
			Static49.anInt1594 = 2;
			Static3.anInt127 = Static84.anInt2576;
			Static103.anInt2993 = Static130.anInt3486;
			Static81.aClass3_Sub12_Sub1_2.method1980(254);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static112.anInt3118 + local15);
		}
		if (local23 == 43) {
			local238 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local238 != null) {
				Static67.method1378(local238.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local238.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static3.anInt127 = Static84.anInt2576;
				Static11.anInt354 = 0;
				Static103.anInt2993 = Static130.anInt3486;
				Static81.aClass3_Sub12_Sub1_2.method1980(81);
				Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			}
		}
		@Pc(1020) boolean local1020;
		if (local23 == 25) {
			local307 = Static86.method1067(local19);
			local1020 = true;
			if (local307.anInt2293 > 0) {
				local1020 = Static22.method570(local307);
			}
			if (local1020) {
				Static81.aClass3_Sub12_Sub1_2.method1980(87);
				Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			}
		}
		if (local23 == 20) {
			Static76.method1561();
		}
		if (local23 == 26) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static103.anInt2993 = Static130.anInt3486;
				Static11.anInt354 = 0;
				Static49.anInt1594 = 2;
				Static3.anInt127 = Static84.anInt2576;
				Static81.aClass3_Sub12_Sub1_2.method1980(189);
				Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			}
		}
		if (local23 == 34) {
			Static81.aClass3_Sub12_Sub1_2.method1980(243);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15);
			Static81.aClass3_Sub12_Sub1_2.method1967(local33);
			Static81.aClass3_Sub12_Sub1_2.method1960(local19);
			Static28.anInt3336 = 2;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			Static108.anInt3055 = local15;
			Static32.anInt1113 = local19;
			Static93.anInt2677 = 0;
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 23) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static3.anInt127 = Static84.anInt2576;
				Static49.anInt1594 = 2;
				Static11.anInt354 = 0;
				Static103.anInt2993 = Static130.anInt3486;
				Static81.aClass3_Sub12_Sub1_2.method1980(153);
				Static81.aClass3_Sub12_Sub1_2.method1922(Static103.anInt2999);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
				Static81.aClass3_Sub12_Sub1_2.method1966(Static45.anInt1433);
			}
		}
		if (local23 == 2) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static11.anInt354 = 0;
				Static3.anInt127 = Static84.anInt2576;
				Static103.anInt2993 = Static130.anInt3486;
				Static81.aClass3_Sub12_Sub1_2.method1980(30);
				Static81.aClass3_Sub12_Sub1_2.method1924(Static128.anInt3453);
				Static81.aClass3_Sub12_Sub1_2.method1961(Static82.anInt2568);
				Static81.aClass3_Sub12_Sub1_2.method1922(local33);
				Static81.aClass3_Sub12_Sub1_2.method1924(Static53.anInt1745);
			}
		}
		if (local23 == 5) {
			Static81.aClass3_Sub12_Sub1_2.method1980(246);
			Static81.aClass3_Sub12_Sub1_2.method1960(local19);
			Static81.aClass3_Sub12_Sub1_2.method1951(Static45.anInt1433);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static103.anInt2999);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15);
		}
		if (local23 == 18) {
			local175 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local175) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static3.anInt127 = Static84.anInt2576;
			Static11.anInt354 = 0;
			Static103.anInt2993 = Static130.anInt3486;
			Static49.anInt1594 = 2;
			Static81.aClass3_Sub12_Sub1_2.method1980(48);
			Static81.aClass3_Sub12_Sub1_2.method1970(Static128.anInt3453);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1960(Static82.anInt2568);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15 + Static112.anInt3118);
			Static81.aClass3_Sub12_Sub1_2.method1970(local33);
			Static81.aClass3_Sub12_Sub1_2.method1970(Static53.anInt1745);
		}
		if (local23 == 7) {
			local238 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local238 != null) {
				Static67.method1378(local238.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local238.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static3.anInt127 = Static84.anInt2576;
				Static103.anInt2993 = Static130.anInt3486;
				Static11.anInt354 = 0;
				Static81.aClass3_Sub12_Sub1_2.method1980(114);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			}
		}
		@Pc(1477) Class60 local1477;
		if (local23 == 51 || local23 == 55) {
			local1477 = Static68.aClass60Array12[arg0];
			local325 = local1477.method1847(Static57.aClass60_1411);
			if (local325 != -1) {
				local1477 = local1477.method1829(local325 + 12).method1827();
				@Pc(1500) Class60 local1500 = local1477.method1854().method1866();
				@Pc(1502) boolean local1502 = false;
				for (@Pc(1504) int local1504 = 0; local1504 < Static53.anInt1744; local1504++) {
					@Pc(1512) Class3_Sub1_Sub1_Sub3_Sub1 local1512 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[Static14.anIntArray56[local1504]];
					if (local1512 != null && local1512.aClass60_245 != null && local1512.aClass60_245.method1860(local1500)) {
						Static67.method1378(local1512.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local1512.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
						local1502 = true;
						if (local23 == 51) {
							Static81.aClass3_Sub12_Sub1_2.method1980(173);
							Static81.aClass3_Sub12_Sub1_2.method1924(Static14.anIntArray56[local1504]);
						}
						if (local23 == 55) {
							Static81.aClass3_Sub12_Sub1_2.method1980(119);
							Static81.aClass3_Sub12_Sub1_2.method1970(Static14.anIntArray56[local1504]);
						}
						break;
					}
				}
				if (!local1502) {
					Static76.method1565(0, Static60.method1211(new Class60[] { Static12.aClass60_160, local1500 }), Static120.aClass60_1369);
				}
			}
		}
		if (local23 == 28) {
			Static78.method1573(local33, local15, local19);
			Static81.aClass3_Sub12_Sub1_2.method1980(58);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33 >> 14 & 0x7FFF);
			Static81.aClass3_Sub12_Sub1_2.method1970(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1970(local15 + Static112.anInt3118);
		}
		if (local23 == 16) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static103.anInt2993 = Static130.anInt3486;
				Static3.anInt127 = Static84.anInt2576;
				Static11.anInt354 = 0;
				Static81.aClass3_Sub12_Sub1_2.method1980(2);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			}
		}
		if (local23 == 30) {
			local238 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local238 != null) {
				Static67.method1378(local238.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local238.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static49.anInt1594 = 2;
				Static3.anInt127 = Static84.anInt2576;
				Static11.anInt354 = 0;
				Static103.anInt2993 = Static130.anInt3486;
				Static81.aClass3_Sub12_Sub1_2.method1980(83);
				Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			}
		}
		if (local23 == 42) {
			local175 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local175) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static11.anInt354 = 0;
			Static103.anInt2993 = Static130.anInt3486;
			Static49.anInt1594 = 2;
			Static3.anInt127 = Static84.anInt2576;
			Static81.aClass3_Sub12_Sub1_2.method1980(238);
			Static81.aClass3_Sub12_Sub1_2.method1924(local19 + Static13.anInt410);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1967(local33);
		}
		if (local23 == 21) {
			Static81.aClass3_Sub12_Sub1_2.method1980(188);
			Static81.aClass3_Sub12_Sub1_2.method1961(local19);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static103.anInt2999);
			Static81.aClass3_Sub12_Sub1_2.method1970(local33);
			Static81.aClass3_Sub12_Sub1_2.method1966(Static45.anInt1433);
			Static32.anInt1113 = local19;
			Static93.anInt2677 = 0;
			Static108.anInt3055 = local15;
			Static28.anInt3336 = 2;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 45) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static11.anInt354 = 0;
				Static49.anInt1594 = 2;
				Static103.anInt2993 = Static130.anInt3486;
				Static3.anInt127 = Static84.anInt2576;
				Static81.aClass3_Sub12_Sub1_2.method1980(24);
				Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			}
		}
		if (local23 == 39) {
			Static81.aClass3_Sub12_Sub1_2.method1980(199);
			Static81.aClass3_Sub12_Sub1_2.method1951(local19);
			Static81.aClass3_Sub12_Sub1_2.method1970(local15);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			Static93.anInt2677 = 0;
			Static108.anInt3055 = local15;
			Static28.anInt3336 = 2;
			if (local19 >> 16 == Static79.anInt2467) {
				Static28.anInt3336 = 1;
			}
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
			Static32.anInt1113 = local19;
		}
		if (local23 == 1004) {
			Static3.anInt127 = Static84.anInt2576;
			Static49.anInt1594 = 2;
			Static103.anInt2993 = Static130.anInt3486;
			Static11.anInt354 = 0;
			Static81.aClass3_Sub12_Sub1_2.method1980(7);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33);
		}
		if (local23 == 36) {
			Static81.aClass3_Sub12_Sub1_2.method1980(56);
			Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			Static81.aClass3_Sub12_Sub1_2.method1924(local15);
			Static81.aClass3_Sub12_Sub1_2.method1967(local33);
			Static108.anInt3055 = local15;
			Static93.anInt2677 = 0;
			Static32.anInt1113 = local19;
			Static28.anInt3336 = 2;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			if (local19 >> 16 == Static78.anInt2429) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 15) {
			local1477 = Static68.aClass60Array12[arg0];
			local325 = local1477.method1847(Static57.aClass60_1411);
			if (local325 != -1) {
				if (Static79.anInt2467 == -1) {
					Static76.method1561();
					if (Static68.anInt2142 != -1) {
						Static120.aClass60_1373 = local1477.method1829(local325 + 12).method1827();
						Static11.anInt346 = Static79.anInt2467 = Static68.anInt2142;
						Static3.aBoolean4 = false;
					}
				} else {
					Static76.method1565(0, Static111.aClass60_1310, Static120.aClass60_1369);
					if (Static71.aClass60_661 != null) {
						Static76.method1565(0, Static71.aClass60_661, Static120.aClass60_1369);
					}
				}
			}
		}
		if (local23 == 19) {
			Static81.aClass3_Sub12_Sub1_2.method1980(218);
			Static81.aClass3_Sub12_Sub1_2.method1967(local33);
			Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15);
			Static28.anInt3336 = 2;
			Static108.anInt3055 = local15;
			Static32.anInt1113 = local19;
			Static93.anInt2677 = 0;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 52) {
			local307 = Static68.method1390(local19, local15);
			if (local307 != null) {
				Static56.method1157();
				Static59.method1192(Static57.method2266(Static33.method751(local307)), local15, local19);
				Static118.aBoolean115 = true;
				anInt2349 = 0;
				aClass60_998 = Static58.method1170(local307);
				if (aClass60_998 == null) {
					aClass60_998 = Static124.aClass60_1357;
				}
				if (local307.aBoolean81) {
					Static96.aClass60_1181 = Static60.method1211(new Class60[] { local307.aClass60_968, Static57.aClass60_1411 });
				} else {
					Static96.aClass60_1181 = Static60.method1211(new Class60[] { Static96.aClass60_1184, local307.aClass60_970, Static57.aClass60_1411 });
				}
				if (Static11.anInt335 == 16 && !local307.aBoolean81) {
					Static45.aBoolean46 = true;
					Static118.aBoolean115 = true;
					Static51.anInt1340 = 3;
				}
			}
			return;
		}
		if (local23 == 10 || local23 == 38 || local23 == 13 || local23 == 22) {
			local1477 = Static68.aClass60Array12[arg0];
			local325 = local1477.method1847(Static57.aClass60_1411);
			if (local325 != -1) {
				@Pc(2305) long local2305 = local1477.method1829(local325 + 12).method1827().method1863();
				if (local23 == 10) {
					Static52.method1125(local2305);
				}
				if (local23 == 38) {
					Static105.method2022(local2305);
				}
				if (local23 == 13) {
					Static122.method470(local2305);
				}
				if (local23 == 22) {
					Static122.method468(local2305);
				}
			}
		}
		if (local23 == 54) {
			Static81.aClass3_Sub12_Sub1_2.method1980(91);
			Static81.aClass3_Sub12_Sub1_2.method1967(local33);
			Static81.aClass3_Sub12_Sub1_2.method1961(local19);
			Static81.aClass3_Sub12_Sub1_2.method1970(local15);
			Static93.anInt2677 = 0;
			Static32.anInt1113 = local19;
			Static28.anInt3336 = 2;
			if (Static79.anInt2467 == local19 >> 16) {
				Static28.anInt3336 = 1;
			}
			Static108.anInt3055 = local15;
			if (local19 >> 16 == Static78.anInt2429) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 56) {
			local354 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local33];
			if (local354 != null) {
				Static67.method1378(local354.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local354.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static11.anInt354 = 0;
				Static49.anInt1594 = 2;
				Static3.anInt127 = Static84.anInt2576;
				Static103.anInt2993 = Static130.anInt3486;
				Static81.aClass3_Sub12_Sub1_2.method1980(119);
				Static81.aClass3_Sub12_Sub1_2.method1970(local33);
			}
		}
		if (local23 == 41) {
			Static81.aClass3_Sub12_Sub1_2.method1980(23);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			Static81.aClass3_Sub12_Sub1_2.method1951(local19);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static128.anInt3453);
			Static81.aClass3_Sub12_Sub1_2.method1970(local15);
			Static81.aClass3_Sub12_Sub1_2.method1961(Static82.anInt2568);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static53.anInt1745);
			Static93.anInt2677 = 0;
			Static108.anInt3055 = local15;
			Static28.anInt3336 = 2;
			if (local19 >> 16 == Static79.anInt2467) {
				Static28.anInt3336 = 1;
			}
			if (Static78.anInt2429 == local19 >> 16) {
				Static28.anInt3336 = 3;
			}
			Static32.anInt1113 = local19;
		}
		if (local23 == 6) {
			Static56.method1157();
			Static53.anInt1745 = local15;
			anInt2349 = 1;
			Static128.anInt3453 = local33;
			Static82.anInt2568 = local19;
			Static118.aBoolean115 = true;
			Static124.aClass60_1361 = Static60.method1211(new Class60[] { Static46.aClass60_633, Static22.method568(local33).aClass60_816, Static57.aClass60_1411 });
			if (Static124.aClass60_1361 == null) {
				Static124.aClass60_1361 = Static95.aClass60_1172;
			}
			return;
		}
		if (local23 == 58) {
			Static81.aClass3_Sub12_Sub1_2.method1980(237);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			Static81.aClass3_Sub12_Sub1_2.method1967(local15);
			Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			Static108.anInt3055 = local15;
			Static93.anInt2677 = 0;
			Static28.anInt3336 = 2;
			if (local19 >> 16 == Static79.anInt2467) {
				Static28.anInt3336 = 1;
			}
			if (local19 >> 16 == Static78.anInt2429) {
				Static28.anInt3336 = 3;
			}
			Static32.anInt1113 = local19;
		}
		if (local23 == 35) {
			Static78.method1573(local33, local15, local19);
			Static81.aClass3_Sub12_Sub1_2.method1980(105);
			Static81.aClass3_Sub12_Sub1_2.method1970(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1922(local15 + Static112.anInt3118);
			Static81.aClass3_Sub12_Sub1_2.method1970(local33 >> 14 & 0x7FFF);
		}
		@Pc(2648) Class3_Sub1_Sub1_Sub3_Sub2 local2648;
		if (local23 == 31) {
			local2648 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local2648 != null) {
				Static67.method1378(local2648.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local2648.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static11.anInt354 = 0;
				Static3.anInt127 = Static84.anInt2576;
				Static49.anInt1594 = 2;
				Static103.anInt2993 = Static130.anInt3486;
				Static81.aClass3_Sub12_Sub1_2.method1980(139);
				Static81.aClass3_Sub12_Sub1_2.method1922(local33);
				Static81.aClass3_Sub12_Sub1_2.method1966(Static82.anInt2568);
				Static81.aClass3_Sub12_Sub1_2.method1967(Static128.anInt3453);
				Static81.aClass3_Sub12_Sub1_2.method1967(Static53.anInt1745);
			}
		}
		@Pc(2722) int local2722;
		if (local23 == 11) {
			@Pc(2717) Class60 local2717 = Static68.aClass60Array12[arg0];
			local2722 = local2717.method1847(Static57.aClass60_1411);
			if (local2722 != -1) {
				@Pc(2736) long local2736 = local2717.method1829(local2722 + 12).method1827().method1863();
				@Pc(2738) int local2738 = -1;
				for (@Pc(2740) int local2740 = 0; local2740 < Static61.anInt1946; local2740++) {
					if (Static83.aLongArray4[local2740] == local2736) {
						local2738 = local2740;
						break;
					}
				}
				if (local2738 != -1 && Static41.anIntArray159[local2738] > 0) {
					Static56.aBoolean56 = true;
					Static120.aClass60_1379 = Static120.aClass60_1369;
					Static65.anInt2069 = 3;
					Static71.aBoolean49 = true;
					Static103.anInt2994 = 0;
					Static6.aLong9 = Static83.aLongArray4[local2738];
					Static120.aClass60_1372 = Static60.method1211(new Class60[] { Static19.aClass60_1414, Static54.aClass60Array6[local2738] });
				}
			}
		}
		if (local23 == 12) {
			Static81.aClass3_Sub12_Sub1_2.method1980(96);
			Static81.aClass3_Sub12_Sub1_2.method1960(local19);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			Static81.aClass3_Sub12_Sub1_2.method1970(local15);
			Static108.anInt3055 = local15;
			Static93.anInt2677 = 0;
			Static32.anInt1113 = local19;
			Static28.anInt3336 = 2;
			if (local19 >> 16 == Static79.anInt2467) {
				Static28.anInt3336 = 1;
			}
			if (local19 >> 16 == Static78.anInt2429) {
				Static28.anInt3336 = 3;
			}
		}
		if (local23 == 1003) {
			Static78.method1573(local33, local15, local19);
			Static81.aClass3_Sub12_Sub1_2.method1980(177);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static13.anInt410 + local19);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33 >> 14 & 0x7FFF);
		}
		if (local23 == 14 && Static78.method1573(local33, local15, local19)) {
			Static81.aClass3_Sub12_Sub1_2.method1980(45);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33 >> 14 & 0x7FFF);
			Static81.aClass3_Sub12_Sub1_2.method1967(local19 + Static13.anInt410);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static128.anInt3453);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static53.anInt1745);
			Static81.aClass3_Sub12_Sub1_2.method1922(local15 + Static112.anInt3118);
			Static81.aClass3_Sub12_Sub1_2.method1960(Static82.anInt2568);
		}
		if (local23 == 47) {
			Static78.method1573(local33, local15, local19);
			Static81.aClass3_Sub12_Sub1_2.method1980(64);
			Static81.aClass3_Sub12_Sub1_2.method1970(local19 + Static13.anInt410);
			Static81.aClass3_Sub12_Sub1_2.method1922(local15 + Static112.anInt3118);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33 >> 14 & 0x7FFF);
		}
		if (local23 == 1) {
			local1020 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local1020) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static49.anInt1594 = 2;
			Static3.anInt127 = Static84.anInt2576;
			Static11.anInt354 = 0;
			Static103.anInt2993 = Static130.anInt3486;
			Static81.aClass3_Sub12_Sub1_2.method1980(146);
			Static81.aClass3_Sub12_Sub1_2.method1922(local33);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1967(Static13.anInt410 + local19);
		}
		if (local23 == 33) {
			if (Static67.aBoolean69) {
				Static13.aClass58_1.method1760(Static119.anInt3243, local15 - 4, local19 + -4);
			} else {
				Static13.aClass58_1.method1760(Static119.anInt3243, Static130.anInt3486 - 4, Static84.anInt2576 + -4);
			}
		}
		if (local23 == 40) {
			Static81.aClass3_Sub12_Sub1_2.method1980(87);
			Static81.aClass3_Sub12_Sub1_2.method1966(local19);
			@Pc(3105) Class3_Sub15 local3105 = Static86.method1067(local19);
			if (local3105.anIntArrayArray56 != null && local3105.anIntArrayArray56[0][0] == 5) {
				local2722 = local3105.anIntArrayArray56[0][1];
				Static18.anIntArray80[local2722] = 1 - Static18.anIntArray80[local2722];
				Static64.method1335(local2722);
				Static118.aBoolean115 = true;
			}
		}
		if (local23 == 46) {
			local1020 = Static67.method1378(local15, false, 0, 0, 2, 0, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			if (!local1020) {
				Static67.method1378(local15, false, 0, 1, 2, 1, 0, 0, local19, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
			}
			Static103.anInt2993 = Static130.anInt3486;
			Static11.anInt354 = 0;
			Static49.anInt1594 = 2;
			Static3.anInt127 = Static84.anInt2576;
			Static81.aClass3_Sub12_Sub1_2.method1980(22);
			Static81.aClass3_Sub12_Sub1_2.method1924(Static112.anInt3118 + local15);
			Static81.aClass3_Sub12_Sub1_2.method1924(local33);
			Static81.aClass3_Sub12_Sub1_2.method1922(Static13.anInt410 + local19);
		}
		if (local23 == 49) {
			local2648 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local33];
			if (local2648 != null) {
				Static67.method1378(local2648.anIntArray184[0], false, 0, 1, 2, 1, 0, 0, local2648.anIntArray181[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
				Static103.anInt2993 = Static130.anInt3486;
				Static3.anInt127 = Static84.anInt2576;
				Static49.anInt1594 = 2;
				Static11.anInt354 = 0;
				Static81.aClass3_Sub12_Sub1_2.method1980(170);
				Static81.aClass3_Sub12_Sub1_2.method1967(local33);
				Static81.aClass3_Sub12_Sub1_2.method1970(Static103.anInt2999);
				Static81.aClass3_Sub12_Sub1_2.method1951(Static45.anInt1433);
			}
		}
		if (anInt2349 != 0) {
			Static118.aBoolean115 = true;
			anInt2349 = 0;
		}
		if (Static72.aBoolean85) {
			Static56.method1157();
			Static118.aBoolean115 = true;
		}
	}
}
