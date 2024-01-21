import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_6;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array11;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "[I")
	public static int[] anIntArray391 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1434 = Static59.method1195("No reply from loginserver)3");

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
	public static int anInt3460 = -1;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1435 = Static59.method1195("(U4");

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1436 = Static59.method1195("System)2Update in: ");

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public static volatile int anInt3463 = -1;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1437 = Static59.method1195("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1438 = Static59.method1195("glow1:");

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1439 = Static59.method1195(":0");

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1440 = aClass60_1438;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public static int anInt3467 = 0;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1441 = Static59.method1195("Spieler");

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1442 = aClass60_1438;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1443 = Static59.method1195("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1444 = Static59.method1195("<)4col> x");

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "J")
	public static long aLong108 = 0L;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1445 = aClass60_1434;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ca;ILclient!ha;B)V")
	public static void method2293(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class25_Sub1 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(9) Class5 local9 = Static28.aClass5_22;
		synchronized (Static28.aClass5_22) {
			for (@Pc(16) Class3_Sub20 local16 = (Class3_Sub20) Static28.aClass5_22.method92(); local16 != null; local16 = (Class3_Sub20) Static28.aClass5_22.method90()) {
				if (local16.aLong107 == (long) arg1 && arg0 == local16.aClass13_4 && local16.anInt2997 == 0) {
					local3 = local16.aByteArray79;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(71) byte[] local71 = arg0.method313(arg1);
			arg2.method934(arg0, true, local71, arg1);
		} else {
			arg2.method934(arg0, true, local3, arg1);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
	public static void method2294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == Static2.anInt118 && arg1 == Static77.anInt2427 && (Static54.anInt1750 == arg4 || !Static14.aBoolean15)) {
			return;
		}
		Static2.anInt118 = arg0;
		Static54.anInt1750 = arg4;
		Static77.anInt2427 = arg1;
		if (!Static14.aBoolean15) {
			Static54.anInt1750 = 0;
		}
		Static50.method1075(25);
		Static99.method1974(Static62.aClass60_857, false, null);
		@Pc(41) int local41 = Static13.anInt410;
		Static13.anInt410 = (arg1 - 6) * 8;
		@Pc(51) int local51 = Static13.anInt410 - local41;
		@Pc(53) int local53 = Static112.anInt3118;
		Static112.anInt3118 = arg0 * 8 - 48;
		@Pc(66) int local66 = Static112.anInt3118 - local53;
		for (@Pc(70) int local70 = 0; local70 < 32768; local70++) {
			@Pc(76) Class3_Sub1_Sub1_Sub3_Sub2 local76 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < 10; local80++) {
					local76.anIntArray184[local80] -= local66;
					local76.anIntArray181[local80] -= local51;
				}
				local76.anInt1524 -= local66 * 128;
				local76.anInt1494 -= local51 * 128;
			}
		}
		for (@Pc(133) int local133 = 0; local133 < 2048; local133++) {
			@Pc(139) Class3_Sub1_Sub1_Sub3_Sub1 local139 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local133];
			if (local139 != null) {
				for (@Pc(143) int local143 = 0; local143 < 10; local143++) {
					local139.anIntArray184[local143] -= local66;
					local139.anIntArray181[local143] -= local51;
				}
				local139.anInt1494 -= local51 * 128;
				local139.anInt1524 -= local66 * 128;
			}
		}
		Static119.anInt3243 = arg4;
		Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.method1015(false, arg2, arg3);
		@Pc(197) byte local197 = 0;
		@Pc(199) byte local199 = 104;
		@Pc(201) byte local201 = 1;
		@Pc(203) byte local203 = 0;
		@Pc(205) byte local205 = 1;
		@Pc(207) byte local207 = 104;
		if (local66 < 0) {
			local197 = 103;
			local201 = -1;
			local199 = -1;
		}
		if (local51 < 0) {
			local203 = 103;
			local205 = -1;
			local207 = -1;
		}
		for (@Pc(231) int local231 = local197; local231 != local199; local231 += local201) {
			for (@Pc(235) int local235 = local203; local235 != local207; local235 += local205) {
				@Pc(242) int local242 = local231 + local66;
				@Pc(246) int local246 = local235 + local51;
				for (@Pc(248) int local248 = 0; local248 < 4; local248++) {
					if (local242 >= 0 && local246 >= 0 && local242 < 104 && local246 < 104) {
						Static34.aClass5ArrayArrayArray1[local248][local231][local235] = Static34.aClass5ArrayArrayArray1[local248][local242][local246];
					} else {
						Static34.aClass5ArrayArrayArray1[local248][local231][local235] = null;
					}
				}
			}
		}
		for (@Pc(316) Class3_Sub7 local316 = (Class3_Sub7) Static80.aClass5_18.method92(); local316 != null; local316 = (Class3_Sub7) Static80.aClass5_18.method90()) {
			local316.anInt797 -= local66;
			local316.anInt792 -= local51;
			if (local316.anInt797 < 0 || local316.anInt792 < 0 || local316.anInt797 >= 104 || local316.anInt792 >= 104) {
				local316.method2264();
			}
		}
		Static58.anInt1802 = 0;
		Static55.anInt1762 = -1;
		if (Static77.anInt2428 != 0) {
			Static77.anInt2428 -= local66;
			Static31.anInt1107 -= local51;
		}
		Static62.aBoolean66 = false;
		Static108.aClass5_20.method91();
		Static112.aClass5_21.method91();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[Lclient!mf;IIIIIIB)V")
	public static void method2295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub15[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg3 > arg1 || arg10 > arg0 || arg2 <= arg1 || arg6 <= arg0) {
			return;
		}
		for (@Pc(36) int local36 = 0; local36 < arg4.length; local36++) {
			@Pc(42) Class3_Sub15 local42 = arg4[local36];
			if (local42 != null && arg9 == local42.anInt2306 && (!local42.aBoolean81 || !Static115.method2119(local42))) {
				@Pc(66) int local66 = local42.anInt2291 + arg3 - arg7;
				@Pc(73) int local73 = local42.anInt2243 + arg10 - arg8;
				if (local42.anInt2296 == 8 && arg1 >= local66 && local73 <= arg0 && arg1 < local66 + local42.anInt2304 && arg0 < local42.anInt2270 + local73) {
					Static113.anInt3149 = local36;
				}
				if ((local42.anInt2285 >= 0 || local42.anInt2305 != 0) && arg1 >= local66 && local73 <= arg0 && local66 + local42.anInt2304 > arg1 && arg0 < local42.anInt2270 + local73) {
					if (local42.anInt2285 < 0) {
						Static70.anInt2194 = local36;
					} else {
						Static70.anInt2194 = local42.anInt2285;
					}
				}
				if (local42.anInt2296 == 0) {
					if (!local42.aBoolean81 && Static115.method2119(local42) && !Static68.method1393(local36, arg5)) {
						continue;
					}
					method2295(arg0, arg1, local66 + local42.anInt2304, local66, arg4, arg5, local73 + local42.anInt2270, local42.anInt2273, local42.anInt2241, local42.anInt2286, local73);
					if (local42.aClass3_Sub15Array2 != null) {
						method2295(arg0, arg1, local66 + local42.anInt2304, local66, local42.aClass3_Sub15Array2, arg5, local42.anInt2270 + local73, local42.anInt2273, local42.anInt2241, local42.anInt2286, local73);
					}
					if (local42.anInt2284 > local42.anInt2270 && !local42.aBoolean81) {
						Static39.method878(local73, local66 + local42.anInt2304, arg0, arg1, local42, local42.anInt2270, arg5, local42.anInt2284);
					}
					if (!local42.aBoolean81) {
						continue;
					}
				}
				if (local42.anInt2269 == 1 && arg1 >= local66 && arg0 >= local73 && arg1 < local66 + local42.anInt2304 && arg0 < local73 + local42.anInt2270) {
					@Pc(283) boolean local283 = false;
					if (local42.anInt2293 != 0) {
						local283 = Static112.method2072(local42);
					}
					if (!local283) {
						Static118.method2137(0, 25, Static120.aClass60_1369, local42.anInt2286, local42.aClass60_973, 0);
					}
				}
				if (local42.anInt2269 == 2 && !Static72.aBoolean85 && local66 <= arg1 && local73 <= arg0 && arg1 < local66 + local42.anInt2304 && arg0 < local73 + local42.anInt2270) {
					@Pc(343) Class60 local343 = Static58.method1170(local42);
					if (local343 != null) {
						Static118.method2137(-1, 52, Static60.method1211(new Class60[] { Static96.aClass60_1184, local42.aClass60_970 }), local42.anInt2286, local343, 0);
					}
				}
				if (local42.anInt2269 == 3 && arg1 >= local66 && arg0 >= local73 && local42.anInt2304 + local66 > arg1 && arg0 < local73 + local42.anInt2270) {
					@Pc(411) byte local411;
					if (arg5 == 3) {
						local411 = 9;
					} else {
						local411 = 20;
					}
					Static118.method2137(0, local411, Static120.aClass60_1369, local42.anInt2286, Static96.aClass60_1187, 0);
				}
				if (local42.anInt2269 == 4 && arg1 >= local66 && local73 <= arg0 && local42.anInt2304 + local66 > arg1 && arg0 < local42.anInt2270 + local73) {
					Static118.method2137(0, 40, Static120.aClass60_1369, local42.anInt2286, local42.aClass60_973, 0);
				}
				if (local42.anInt2269 == 5 && arg1 >= local66 && arg0 >= local73 && local66 + local42.anInt2304 > arg1 && local42.anInt2270 + local73 > arg0) {
					Static118.method2137(0, 3, Static120.aClass60_1369, local42.anInt2286, local42.aClass60_973, 0);
				}
				if (local42.anInt2269 == 6 && Static96.anInt2745 == -1 && local66 <= arg1 && local73 <= arg0 && local66 + local42.anInt2304 > arg1 && local73 + local42.anInt2270 > arg0) {
					Static118.method2137(-1, 32, Static120.aClass60_1369, local42.anInt2286, local42.aClass60_973, 0);
				}
				@Pc(566) int local566;
				@Pc(560) int local560;
				if (local42.anInt2296 == 2) {
					local560 = 0;
					for (@Pc(562) int local562 = 0; local562 < local42.anInt2270; local562++) {
						for (local566 = 0; local566 < local42.anInt2304; local566++) {
							@Pc(577) int local577 = local73 + (local42.anInt2266 + 32) * local562;
							@Pc(586) int local586 = (local42.anInt2261 + 32) * local566 + local66;
							if (local560 < 20) {
								local586 += local42.anIntArray227[local560];
								local577 += local42.anIntArray233[local560];
							}
							if (arg1 >= local586 && arg0 >= local577 && arg1 < local586 + 32 && local577 + 32 > arg0) {
								Static35.anInt1193 = local560;
								Static70.anInt2202 = local42.anInt2286;
								if (local42.anIntArray235[local560] > 0) {
									@Pc(655) Class3_Sub1_Sub11 local655 = Static22.method568(local42.anIntArray235[local560] - 1);
									if (Static73.anInt2349 == 1 && Static97.method1823(Static33.method751(local42))) {
										if (Static82.anInt2568 != local42.anInt2286 || Static53.anInt1745 != local560) {
											Static118.method2137(local560, 41, Static60.method1211(new Class60[] { Static124.aClass60_1361, Static75.aClass60_1019, local655.aClass60_816 }), local42.anInt2286, Static8.aClass60_131, local655.anInt1844);
										}
									} else if (!Static72.aBoolean85 || !Static97.method1823(Static33.method751(local42))) {
										@Pc(718) Class60[] local718 = local655.aClass60Array9;
										if (Static120.aBoolean120) {
											local718 = Static28.method2224(local718);
										}
										@Pc(732) int local732;
										@Pc(782) byte local782;
										if (Static97.method1823(Static33.method751(local42))) {
											for (local732 = 4; local732 >= 3; local732--) {
												if (local718 != null && local718[local732] != null) {
													if (local732 == 3) {
														local782 = 57;
													} else {
														local782 = 58;
													}
													Static118.method2137(local560, local782, Static60.method1211(new Class60[] { Static46.aClass60_633, local655.aClass60_816 }), local42.anInt2286, local718[local732], local655.anInt1844);
												} else if (local732 == 4) {
													Static118.method2137(local560, 58, Static60.method1211(new Class60[] { Static46.aClass60_633, local655.aClass60_816 }), local42.anInt2286, Static81.aClass60_1081, local655.anInt1844);
												}
											}
										}
										if (Static24.method594(Static33.method751(local42))) {
											Static118.method2137(local560, 6, Static60.method1211(new Class60[] { Static46.aClass60_633, local655.aClass60_816 }), local42.anInt2286, Static8.aClass60_131, local655.anInt1844);
										}
										if (Static97.method1823(Static33.method751(local42)) && local718 != null) {
											for (local732 = 2; local732 >= 0; local732--) {
												if (local718[local732] != null) {
													local782 = 0;
													if (local732 == 0) {
														local782 = 50;
													}
													if (local732 == 1) {
														local782 = 39;
													}
													if (local732 == 2) {
														local782 = 54;
													}
													Static118.method2137(local560, local782, Static60.method1211(new Class60[] { Static46.aClass60_633, local655.aClass60_816 }), local42.anInt2286, local718[local732], local655.anInt1844);
												}
											}
										}
										local718 = local42.aClass60Array13;
										if (Static120.aBoolean120) {
											local718 = Static28.method2224(local718);
										}
										if (local718 != null) {
											for (local732 = 4; local732 >= 0; local732--) {
												if (local718[local732] != null) {
													local782 = 0;
													if (local732 == 0) {
														local782 = 36;
													}
													if (local732 == 1) {
														local782 = 12;
													}
													if (local732 == 2) {
														local782 = 19;
													}
													if (local732 == 3) {
														local782 = 8;
													}
													if (local732 == 4) {
														local782 = 34;
													}
													Static118.method2137(local560, local782, Static60.method1211(new Class60[] { Static46.aClass60_633, local655.aClass60_816 }), local42.anInt2286, local718[local732], local655.anInt1844);
												}
											}
										}
										Static118.method2137(local560, 1002, Static60.method1211(new Class60[] { Static46.aClass60_633, local655.aClass60_816 }), local42.anInt2286, Static39.aClass60_542, local655.anInt1844);
									} else if ((Static11.anInt335 & 0x10) == 16) {
										Static118.method2137(local560, 21, Static60.method1211(new Class60[] { Static96.aClass60_1181, Static75.aClass60_1019, local655.aClass60_816 }), local42.anInt2286, Static73.aClass60_998, local655.anInt1844);
									}
								}
							}
							local560++;
						}
					}
				}
				if (local42.aBoolean81) {
					if (Static72.aBoolean85) {
						if (Static82.method1654(Static33.method751(local42)) && (Static11.anInt335 & 0x20) == 32 && arg1 >= local66 && arg0 >= local73 && local66 + local42.anInt2304 > arg1 && local42.anInt2270 + local73 > arg0) {
							Static118.method2137(local42.anInt2283, 5, Static60.method1211(new Class60[] { Static96.aClass60_1181, Static4.aClass60_72, local42.aClass60_968 }), local42.anInt2286, Static73.aClass60_998, 0);
						}
					} else if (local66 <= arg1 && arg0 >= local73 && local42.anInt2304 + local66 > arg1 && arg0 < local42.anInt2270 + local73) {
						@Pc(1182) Class60 local1182;
						for (local560 = 9; local560 >= 5; local560--) {
							local1182 = Static82.method1658(local560, local42);
							if (local1182 != null) {
								Static118.method2137(local42.anInt2283, 1006, local42.aClass60_968, local42.anInt2286, local1182, local560 + 1);
							}
						}
						local1182 = Static58.method1170(local42);
						if (local1182 != null) {
							Static118.method2137(local42.anInt2283, 52, local42.aClass60_968, local42.anInt2286, local1182, 0);
						}
						for (local566 = 4; local566 >= 0; local566--) {
							@Pc(1237) Class60 local1237 = Static82.method1658(local566, local42);
							if (local1237 != null) {
								Static118.method2137(local42.anInt2283, 24, local42.aClass60_968, local42.anInt2286, local1237, local566 + 1);
							}
						}
						if (Static4.method84(Static33.method751(local42))) {
							Static118.method2137(local42.anInt2283, 32, Static120.aClass60_1369, local42.anInt2286, Static13.aClass60_174, 0);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!tc;IBI)V")
	public static void method2296(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub16 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static22.anInt872 >= 400) {
			return;
		}
		if (arg1.anIntArray334 != null) {
			arg1 = arg1.method2093();
		}
		if (arg1 == null || !arg1.aBoolean109) {
			return;
		}
		@Pc(33) Class60 local33 = arg1.aClass60_1327;
		if (arg1.anInt3160 != 0) {
			local33 = Static60.method1211(new Class60[] { local33, Static56.method1162(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt622, arg1.anInt3160), Static104.aClass60_1262, Static104.aClass60_1267, Static65.method1341(arg1.anInt3160), Static73.aClass60_999 });
		}
		if (Static73.anInt2349 == 1) {
			Static118.method2137(arg0, 31, Static60.method1211(new Class60[] { Static124.aClass60_1361, Static51.aClass60_593, local33 }), arg3, Static8.aClass60_131, arg2);
		} else if (!Static72.aBoolean85) {
			@Pc(85) Class60[] local85 = arg1.aClass60Array19;
			if (Static120.aBoolean120) {
				local85 = Static28.method2224(local85);
			}
			@Pc(95) int local95;
			if (local85 != null) {
				for (local95 = 4; local95 >= 0; local95--) {
					if (local85[local95] != null && !local85[local95].method1860(Static42.aClass60_612)) {
						@Pc(114) byte local114 = 0;
						if (local95 == 0) {
							local114 = 43;
						}
						if (local95 == 1) {
							local114 = 27;
						}
						if (local95 == 2) {
							local114 = 29;
						}
						if (local95 == 3) {
							local114 = 7;
						}
						if (local95 == 4) {
							local114 = 30;
						}
						Static118.method2137(arg0, local114, Static60.method1211(new Class60[] { Static72.aClass60_976, local33 }), arg3, local85[local95], arg2);
					}
				}
			}
			if (local85 != null) {
				for (local95 = 4; local95 >= 0; local95--) {
					if (local85[local95] != null && local85[local95].method1860(Static42.aClass60_612)) {
						@Pc(193) short local193 = 0;
						if (Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anInt622 < arg1.anInt3160) {
							local193 = 2000;
						}
						@Pc(202) int local202 = 0;
						if (local95 == 0) {
							local202 = local193 + 43;
						}
						if (local95 == 1) {
							local202 = local193 + 27;
						}
						if (local95 == 2) {
							local202 = local193 + 29;
						}
						if (local95 == 3) {
							local202 = local193 + 7;
						}
						if (local95 == 4) {
							local202 = local193 + 30;
						}
						Static118.method2137(arg0, local202, Static60.method1211(new Class60[] { Static72.aClass60_976, local33 }), arg3, local85[local95], arg2);
					}
				}
			}
			Static118.method2137(arg0, 1007, Static60.method1211(new Class60[] { Static72.aClass60_976, local33 }), arg3, Static39.aClass60_542, arg2);
			return;
		} else if ((Static11.anInt335 & 0x2) == 2) {
			Static118.method2137(arg0, 49, Static60.method1211(new Class60[] { Static96.aClass60_1181, Static51.aClass60_593, local33 }), arg3, Static73.aClass60_998, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	public static void method2297() {
		aClass3_Sub1_Sub2_Sub4Array11 = null;
		aClass60_1437 = null;
		aClass60_1435 = null;
		aClass60_1439 = null;
		aClass60_1434 = null;
		aClass60_1445 = null;
		aClass60_1441 = null;
		aClass60_1444 = null;
		aClass60_1436 = null;
		anIntArray391 = null;
		aClass60_1442 = null;
		aClass3_Sub1_Sub2_Sub3_6 = null;
		aClass60_1440 = null;
		aClass60_1443 = null;
		aClass60_1438 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method2298() {
		try {
			@Pc(6) Graphics local6 = Static2.aCanvas1.getGraphics();
			Static27.aClass16_24.method1664(4, 4, local6);
		} catch (@Pc(14) Exception local14) {
			Static2.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method2299(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static119.aBoolean118) {
			try {
				@Pc(20) Class31 local20 = (Class31) Class.forName("Class31_Sub1").getDeclaredConstructor().newInstance();
				local20.method1032(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static119.aBoolean118 = true;
			}
		}
		return arg0;
	}
}
