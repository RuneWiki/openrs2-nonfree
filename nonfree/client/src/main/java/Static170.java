import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!rj", name = "V", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!rj", name = "M", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1260 = Static161.method2452("<col=ffb000>");

	@OriginalMember(owner = "client!rj", name = "Y", descriptor = "[I")
	public static final int[] anIntArray362 = new int[500];

	@OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
	public static int anInt3428 = 0;

	@OriginalMember(owner = "client!rj", name = "cb", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1261 = Static161.method2452("<br>(X100(U(Y");

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
	public static void method2597(@OriginalArg(0) boolean arg0) {
		Static203.aBoolean181 = arg0;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(91) int local91;
		@Pc(95) int local95;
		@Pc(134) int local134;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (!Static203.aBoolean181) {
			local22 = (Static6.anInt155 - Static10.aClass5_Sub6_Sub1_1.anInt4050) / 16;
			Static17.anIntArrayArray2 = new int[local22][4];
			for (local28 = 0; local28 < local22; local28++) {
				for (local32 = 0; local32 < 4; local32++) {
					Static17.anIntArrayArray2[local28][local32] = Static10.aClass5_Sub6_Sub1_1.method3084();
				}
			}
			local32 = Static10.aClass5_Sub6_Sub1_1.method3077();
			local60 = Static10.aClass5_Sub6_Sub1_1.method3043();
			@Pc(62) boolean local62 = false;
			local66 = Static10.aClass5_Sub6_Sub1_1.method3043();
			if ((local60 / 8 == 48 || local60 / 8 == 49) && (local32 / 8) == 48) {
				local62 = true;
			}
			local91 = Static10.aClass5_Sub6_Sub1_1.method3074();
			local95 = Static10.aClass5_Sub6_Sub1_1.method3081();
			Static104.aByteArrayArray7 = new byte[local22][];
			if (local60 / 8 == 48 && local32 / 8 == 148) {
				local62 = true;
			}
			Static44.aByteArrayArray3 = new byte[local22][];
			Static132.anIntArray382 = new int[local22];
			Static125.anIntArray290 = new int[local22];
			Static174.anIntArray369 = new int[local22];
			local22 = 0;
			for (local134 = (local60 - 6) / 8; local134 <= (local60 + 6) / 8; local134++) {
				for (local142 = (local32 - 6) / 8; local142 <= (local32 + 6) / 8; local142++) {
					local151 = (local134 << 8) + local142;
					if (local62 && (local142 == 49 || local142 == 149 || local142 == 147 || local134 == 50 || local134 == 49 && local142 == 47)) {
						Static125.anIntArray290[local22] = local151;
						Static132.anIntArray382[local22] = -1;
						Static174.anIntArray369[local22] = -1;
					} else {
						Static125.anIntArray290[local22] = local151;
						Static132.anIntArray382[local22] = Static161.aClass23_Sub1_21.method734(Static70.method1166(new Class20[] { Static31.aClass20_244, Static132.method2805(local134), Static57.aClass20_448, Static132.method2805(local142) }));
						Static174.anIntArray369[local22] = Static161.aClass23_Sub1_21.method734(Static70.method1166(new Class20[] { Static84.aClass20_676, Static132.method2805(local134), Static57.aClass20_448, Static132.method2805(local142) }));
					}
					local22++;
				}
			}
			Static90.method1500(local91, local66, local95, local32, local60);
			return;
		}
		Static10.aClass5_Sub6_Sub1_1.method3088();
		for (local22 = 0; local22 < 4; local22++) {
			for (local28 = 0; local28 < 13; local28++) {
				for (local32 = 0; local32 < 13; local32++) {
					local60 = Static10.aClass5_Sub6_Sub1_1.method3090(1);
					if (local60 == 1) {
						Static188.anIntArrayArrayArray11[local22][local28][local32] = Static10.aClass5_Sub6_Sub1_1.method3090(26);
					} else {
						Static188.anIntArrayArrayArray11[local22][local28][local32] = -1;
					}
				}
			}
		}
		Static10.aClass5_Sub6_Sub1_1.method3086();
		local28 = (Static6.anInt155 - Static10.aClass5_Sub6_Sub1_1.anInt4050) / 16;
		Static17.anIntArrayArray2 = new int[local28][4];
		for (local32 = 0; local32 < local28; local32++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static17.anIntArrayArray2[local32][local60] = Static10.aClass5_Sub6_Sub1_1.method3073();
			}
		}
		local60 = Static10.aClass5_Sub6_Sub1_1.method3054();
		local66 = Static10.aClass5_Sub6_Sub1_1.method3081();
		local91 = Static10.aClass5_Sub6_Sub1_1.method3077();
		local95 = Static10.aClass5_Sub6_Sub1_1.method3054();
		@Pc(413) int local413 = Static10.aClass5_Sub6_Sub1_1.method3062();
		Static104.aByteArrayArray7 = new byte[local28][];
		Static132.anIntArray382 = new int[local28];
		Static44.aByteArrayArray3 = new byte[local28][];
		Static125.anIntArray290 = new int[local28];
		Static174.anIntArray369 = new int[local28];
		local28 = 0;
		for (local134 = 0; local134 < 4; local134++) {
			for (local142 = 0; local142 < 13; local142++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(450) int local450 = Static188.anIntArrayArrayArray11[local134][local142][local151];
					if (local450 != -1) {
						@Pc(460) int local460 = local450 >> 14 & 0x3FF;
						@Pc(466) int local466 = local450 >> 3 & 0x7FF;
						@Pc(476) int local476 = (local460 / 8 << 8) + local466 / 8;
						for (@Pc(478) int local478 = 0; local478 < local28; local478++) {
							if (local476 == Static125.anIntArray290[local478]) {
								local476 = -1;
								break;
							}
						}
						if (local476 != -1) {
							Static125.anIntArray290[local28] = local476;
							@Pc(515) int local515 = local476 >> 8 & 0xFF;
							@Pc(519) int local519 = local476 & 0xFF;
							Static132.anIntArray382[local28] = Static161.aClass23_Sub1_21.method734(Static70.method1166(new Class20[] { Static31.aClass20_244, Static132.method2805(local515), Static57.aClass20_448, Static132.method2805(local519) }));
							Static174.anIntArray369[local28] = Static161.aClass23_Sub1_21.method734(Static70.method1166(new Class20[] { Static84.aClass20_676, Static132.method2805(local515), Static57.aClass20_448, Static132.method2805(local519) }));
							local28++;
						}
					}
				}
			}
		}
		Static90.method1500(local413, local66, local60, local91, local95);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Lclient!dc;)[Lclient!dc;")
	public static Class20[] method2599(@OriginalArg(1) Class20[] arg0) {
		@Pc(8) Class20[] local8 = new Class20[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = Static70.method1166(new Class20[] { Static132.method2805(local15), Static89.aClass20_701 });
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = Static70.method1166(new Class20[] { local8[local15], arg0[local15] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(Lclient!wa;Lclient!wa;ILclient!wa;)V")
	public static void method2601(@OriginalArg(0) Class23 arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(3) Class23 arg2) {
		Static65.anInt1421 = arg1.method734(Static33.aClass20_260);
		Static73.anInt1587 = arg2.method734(Static8.aClass20_98);
		Static4.anInt108 = arg2.method734(Static173.aClass20_1274);
		Static55.anInt1159 = arg2.method734(Static7.aClass20_91);
		Static98.anInt2103 = arg2.method734(Static185.aClass20_1369);
		Static123.anInt2609 = arg2.method734(Static27.aClass20_199);
		Static4.anInt107 = arg2.method734(Static193.aClass20_1422);
		Static211.anInt4105 = arg2.method734(Static6.aClass20_77);
		Static82.anInt1813 = arg2.method734(Static3.aClass20_33);
		Static138.anInt3856 = arg2.method734(Static67.aClass20_1489);
		Static113.anInt2385 = arg2.method734(Static37.aClass20_468);
		Static8.anInt201 = arg0.method734(Static134.aClass20_1014);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "([Lclient!mf;IIIZ)V")
	public static void method2602(@OriginalArg(0) Class69[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class69 local9 = arg0[local3];
			if (local9 != null && local9.anInt2498 == arg3) {
				if (local9.aByte6 == 0) {
					local9.anInt2541 = local9.anInt2533;
				} else if (local9.aByte6 == 1) {
					local9.anInt2541 = arg2 - local9.anInt2533;
				} else if (local9.aByte6 == 2) {
					local9.anInt2541 = arg2 * local9.anInt2533 >> 14;
				} else if (local9.aByte6 == 3) {
					if (local9.anInt2474 == 2) {
						local9.anInt2541 = local9.anInt2494 * (local9.anInt2533 - 1) + local9.anInt2533 * 32;
					} else if (local9.anInt2474 == 7) {
						local9.anInt2541 = local9.anInt2533 * 115 + local9.anInt2494 * (local9.anInt2533 - 1);
					}
				}
				if (local9.aByte7 == 0) {
					local9.anInt2471 = local9.anInt2527;
				} else if (local9.aByte7 == 1) {
					local9.anInt2471 = arg1 - local9.anInt2527;
				} else if (local9.aByte7 == 2) {
					local9.anInt2471 = arg1 * local9.anInt2527 >> 14;
				} else if (local9.aByte7 == 3) {
					if (local9.anInt2474 == 2) {
						local9.anInt2471 = (local9.anInt2527 - 1) * local9.anInt2470 + local9.anInt2527 * 32;
					} else if (local9.anInt2474 == 7) {
						local9.anInt2471 = (local9.anInt2527 - 1) * local9.anInt2470 + local9.anInt2527 * 12;
					}
				}
				if (Static148.aBoolean130 && (Static94.method1538(local9) != 0 || local9.anInt2474 == 0)) {
					if (local9.anInt2471 < 5 && local9.anInt2541 < 5) {
						local9.anInt2541 = 5;
						local9.anInt2471 = 5;
					} else {
						if (local9.anInt2471 <= 0) {
							local9.anInt2471 = 5;
						}
						if (local9.anInt2541 <= 0) {
							local9.anInt2541 = 5;
						}
					}
				}
				if (local9.aByte8 == 0) {
					local9.anInt2539 = local9.anInt2522;
				} else if (local9.aByte8 == 1) {
					local9.anInt2539 = local9.anInt2522 + (arg1 - local9.anInt2471) / 2;
				} else if (local9.aByte8 == 2) {
					local9.anInt2539 = arg1 - local9.anInt2471 - local9.anInt2522;
				} else if (local9.aByte8 == 3) {
					local9.anInt2539 = local9.anInt2522 * arg1 >> 14;
				} else if (local9.aByte8 == 4) {
					local9.anInt2539 = (local9.anInt2522 * arg1 >> 14) + (arg1 - local9.anInt2471) / 2;
				} else {
					local9.anInt2539 = arg1 - local9.anInt2471 - (arg1 * local9.anInt2522 >> 14);
				}
				if (local9.aByte9 == 0) {
					local9.anInt2536 = local9.anInt2538;
				} else if (local9.aByte9 == 1) {
					local9.anInt2536 = (arg2 - local9.anInt2541) / 2 + local9.anInt2538;
				} else if (local9.aByte9 == 2) {
					local9.anInt2536 = arg2 - local9.anInt2541 - local9.anInt2538;
				} else if (local9.aByte9 == 3) {
					local9.anInt2536 = local9.anInt2538 * arg2 >> 14;
				} else if (local9.aByte9 == 4) {
					local9.anInt2536 = (arg2 * local9.anInt2538 >> 14) + (arg2 - local9.anInt2541) / 2;
				} else {
					local9.anInt2536 = arg2 - local9.anInt2541 - (local9.anInt2538 * arg2 >> 14);
				}
				if (Static148.aBoolean130 && (Static94.method1538(local9) != 0 || local9.anInt2474 == 0)) {
					if (local9.anInt2539 < 0) {
						local9.anInt2539 = 0;
					} else if (local9.anInt2471 + local9.anInt2539 > arg1) {
						local9.anInt2539 = arg1 - local9.anInt2471;
					}
					if (local9.anInt2536 < 0) {
						local9.anInt2536 = 0;
					} else if (arg2 < local9.anInt2536 + local9.anInt2541) {
						local9.anInt2536 = arg2 - local9.anInt2541;
					}
				}
				if (local9.anInt2517 - local9.anInt2471 < local9.anInt2514) {
					local9.anInt2514 = local9.anInt2517 - local9.anInt2471;
				}
				if (local9.anInt2514 < 0) {
					local9.anInt2514 = 0;
				}
				if (local9.anInt2542 - local9.anInt2541 < local9.anInt2478) {
					local9.anInt2478 = local9.anInt2542 - local9.anInt2541;
				}
				if (local9.anInt2478 < 0) {
					local9.anInt2478 = 0;
				}
				if (local9.anInt2474 == 0) {
					Static115.method1845(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I")
	public static int method2603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 256 - arg1;
		return (local3 * (arg2 & 0xFF00) + (arg0 & 0xFF00) * arg1 & 0xFF0000) + (local3 * (arg2 & 0xFF00FF) + (arg1 * (arg0 & 0xFF00FF)) & 0xFF00FF00) >> 8;
	}
}
