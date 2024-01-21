import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "Lclient!gg;")
	private static Class28 aClass28_715 = Static107.method1838("Close");

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "Lclient!gg;")
	public static Class28 aClass28_716 = Static107.method1838("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_717 = Static107.method1838("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_718 = aClass28_715;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_719 = Static107.method1838("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "[I")
	public static int[] anIntArray103 = new int[50];

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public static int anInt1155 = -1;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_720 = Static107.method1838("::qa_op_test");

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_721 = Static107.method1838("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!jc;IIZ)[Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3[] method800(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static108.method1851(arg0, arg2, arg1) ? Static141.method2245() : null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method801() {
		aClass28_715 = null;
		aClass28_717 = null;
		anIntArray103 = null;
		aClass28_720 = null;
		aClass28_718 = null;
		aClass28_716 = null;
		aClass28_721 = null;
		aClass28_719 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!kf;Z)V")
	public static void method802(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		Static109.aClass65_10.method2116(arg0);
		while (true) {
			@Pc(8) Class2_Sub14 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub14[][] local30;
			@Pc(47) Class2_Sub14 local47;
			@Pc(245) int local245;
			@Pc(579) int local579;
			@Pc(584) int local584;
			@Pc(589) int local589;
			@Pc(906) Class52 local906;
			@Pc(1079) int local1079;
			@Pc(964) int local964;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(251) Class43 var11;
										@Pc(592) int var16;
										@Pc(601) int var17;
										@Pc(613) int var18;
										@Pc(335) int var20;
										@Pc(283) boolean var21;
										@Pc(787) Class2_Sub14 var32;
										while (true) {
											do {
												local8 = (Class2_Sub14) Static109.aClass65_10.method2118();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean113);
											local17 = local8.anInt2271;
											local20 = local8.anInt2272;
											local23 = local8.anInt2266;
											local26 = local8.anInt2274;
											local30 = Static133.aClass2_Sub14ArrayArrayArray1[local23];
											if (!local8.aBoolean111) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static133.aClass2_Sub14ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean113) {
														continue;
													}
												}
												if (local17 <= Static30.anInt927 && local17 > Static117.anInt2840) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean113 && (local47.aBoolean111 || (local8.anInt2277 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static30.anInt927 && local17 < Static150.anInt3362 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean113 && (local47.aBoolean111 || (local8.anInt2277 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static72.anInt1868 && local20 > Static167.anInt3743) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean113 && (local47.aBoolean111 || (local8.anInt2277 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static72.anInt1868 && local20 < Static129.anInt3029 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean113 && (local47.aBoolean111 || (local8.anInt2277 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean111 = false;
											if (local8.aClass2_Sub14_1 != null) {
												local47 = local8.aClass2_Sub14_1;
												if (local47.aClass69_1 == null) {
													if (local47.aClass73_1 != null && !Static110.method1878(0, local17, local20)) {
														Static12.method363(local47.aClass73_1, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local17, local20);
													}
												} else if (!Static110.method1878(0, local17, local20)) {
													Static116.method1945(local47.aClass69_1, 0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local17, local20);
												}
												@Pc(219) Class52 local219 = local47.aClass52_1;
												if (local219 != null) {
													local219.aClass2_Sub4_Sub1_6.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local219.anInt2608 - Static125.anInt2954, local219.anInt2611 - Static95.anInt2362, local219.anInt2612 - Static14.anInt612, local219.aLong93);
												}
												for (local245 = 0; local245 < local47.anInt2269; local245++) {
													var11 = local47.aClass43Array56[local245];
													if (var11 != null) {
														var11.aClass2_Sub4_Sub1_2.method2856(var11.anInt2323, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, var11.anInt2317 - Static125.anInt2954, var11.anInt2324 - Static95.anInt2362, var11.anInt2327 - Static14.anInt612, var11.aLong83);
													}
												}
											}
											var21 = false;
											if (local8.aClass69_1 == null) {
												if (local8.aClass73_1 != null && !Static110.method1878(local26, local17, local20)) {
													var21 = true;
													Static12.method363(local8.aClass73_1, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local17, local20);
												}
											} else if (!Static110.method1878(local26, local17, local20)) {
												var21 = true;
												if (local8.aClass69_1.anInt3118 != 12345678 || Static126.aBoolean134 && local23 <= Static130.anInt3044) {
													Static116.method1945(local8.aClass69_1, local26, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local17, local20);
												}
											}
											var20 = 0;
											local245 = 0;
											@Pc(340) Class52 local340 = local8.aClass52_1;
											@Pc(343) Class49 local343 = local8.aClass49_1;
											if (local340 != null || local343 != null) {
												if (Static30.anInt927 == local17) {
													var20++;
												} else if (Static30.anInt927 < local17) {
													var20 += 2;
												}
												if (Static72.anInt1868 == local20) {
													var20 += 3;
												} else if (Static72.anInt1868 > local20) {
													var20 += 6;
												}
												local245 = Static50.anIntArray107[var20];
												local8.anInt2267 = Static67.anIntArray179[var20];
											}
											if (local340 != null) {
												if ((local340.anInt2613 & Static74.anIntArray188[var20]) == 0) {
													local8.anInt2275 = 0;
												} else if (local340.anInt2613 == 16) {
													local8.anInt2275 = 3;
													local8.anInt2278 = Static15.anIntArray41[var20];
													local8.anInt2273 = 3 - local8.anInt2278;
												} else if (local340.anInt2613 == 32) {
													local8.anInt2275 = 6;
													local8.anInt2278 = Static29.anIntArray70[var20];
													local8.anInt2273 = 6 - local8.anInt2278;
												} else if (local340.anInt2613 == 64) {
													local8.anInt2275 = 12;
													local8.anInt2278 = Static163.anIntArray335[var20];
													local8.anInt2273 = 12 - local8.anInt2278;
												} else {
													local8.anInt2275 = 9;
													local8.anInt2278 = Static17.anIntArray44[var20];
													local8.anInt2273 = 9 - local8.anInt2278;
												}
												if ((local340.anInt2613 & local245) != 0 && !Static3.method1661(local26, local17, local20, local340.anInt2613)) {
													local340.aClass2_Sub4_Sub1_6.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local340.anInt2608 - Static125.anInt2954, local340.anInt2611 - Static95.anInt2362, local340.anInt2612 - Static14.anInt612, local340.aLong93);
												}
												if ((local340.anInt2607 & local245) != 0 && !Static3.method1661(local26, local17, local20, local340.anInt2607)) {
													local340.aClass2_Sub4_Sub1_5.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local340.anInt2608 - Static125.anInt2954, local340.anInt2611 - Static95.anInt2362, local340.anInt2612 - Static14.anInt612, local340.aLong93);
												}
											}
											if (local343 != null && !Static46.method886(local26, local17, local20, local343.aClass2_Sub4_Sub1_4.aShort36)) {
												if ((local343.anInt2504 & local245) != 0) {
													local343.aClass2_Sub4_Sub1_4.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local343.anInt2503 + local343.anInt2505 - Static125.anInt2954, local343.anInt2502 - Static95.anInt2362, local343.anInt2506 + local343.anInt2508 - Static14.anInt612, local343.aLong89);
												} else if (local343.anInt2504 == 256) {
													local579 = local343.anInt2503 - Static125.anInt2954;
													local584 = local343.anInt2502 - Static95.anInt2362;
													local589 = local343.anInt2506 - Static14.anInt612;
													var16 = local343.anInt2500;
													if (var16 == 1 || var16 == 2) {
														var17 = -local579;
													} else {
														var17 = local579;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local589;
													} else {
														var18 = local589;
													}
													if (var18 < var17) {
														local343.aClass2_Sub4_Sub1_4.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local579 + local343.anInt2505, local584, local589 + local343.anInt2508, local343.aLong89);
													} else if (local343.aClass2_Sub4_Sub1_3 != null) {
														local343.aClass2_Sub4_Sub1_3.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local579, local584, local589, local343.aLong89);
													}
												}
											}
											if (var21) {
												@Pc(660) Class19 local660 = local8.aClass19_1;
												if (local660 != null) {
													local660.aClass2_Sub4_Sub1_1.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local660.anInt1088 - Static125.anInt2954, local660.anInt1092 - Static95.anInt2362, local660.anInt1093 - Static14.anInt612, local660.aLong36);
												}
												@Pc(687) Class64 local687 = local8.aClass64_1;
												if (local687 != null && local687.anInt3082 == 0) {
													if (local687.aClass2_Sub4_Sub1_8 != null) {
														local687.aClass2_Sub4_Sub1_8.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local687.anInt3081 - Static125.anInt2954, local687.anInt3079 - Static95.anInt2362, local687.anInt3080 - Static14.anInt612, local687.aLong113);
													}
													if (local687.aClass2_Sub4_Sub1_9 != null) {
														local687.aClass2_Sub4_Sub1_9.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local687.anInt3081 - Static125.anInt2954, local687.anInt3079 - Static95.anInt2362, local687.anInt3080 - Static14.anInt612, local687.aLong113);
													}
													if (local687.aClass2_Sub4_Sub1_7 != null) {
														local687.aClass2_Sub4_Sub1_7.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local687.anInt3081 - Static125.anInt2954, local687.anInt3079 - Static95.anInt2362, local687.anInt3080 - Static14.anInt612, local687.aLong113);
													}
												}
											}
											local579 = local8.anInt2277;
											if (local579 != 0) {
												if (local17 < Static30.anInt927 && (local579 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean113) {
														Static109.aClass65_10.method2116(var32);
													}
												}
												if (local20 < Static72.anInt1868 && (local579 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean113) {
														Static109.aClass65_10.method2116(var32);
													}
												}
												if (local17 > Static30.anInt927 && (local579 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean113) {
														Static109.aClass65_10.method2116(var32);
													}
												}
												if (local20 > Static72.anInt1868 && (local579 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean113) {
														Static109.aClass65_10.method2116(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt2275 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt2269; var20++) {
												if (local8.aClass43Array56[var20].anInt2320 != Static140.anInt3211 && (local8.anIntArray220[var20] & local8.anInt2275) == local8.anInt2278) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local906 = local8.aClass52_1;
												if (!Static3.method1661(local26, local17, local20, local906.anInt2613)) {
													local906.aClass2_Sub4_Sub1_6.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local906.anInt2608 - Static125.anInt2954, local906.anInt2611 - Static95.anInt2362, local906.anInt2612 - Static14.anInt612, local906.aLong93);
												}
												local8.anInt2275 = 0;
											}
										}
										if (!local8.aBoolean112) {
											break;
										}
										try {
											@Pc(944) int local944 = local8.anInt2269;
											local8.aBoolean112 = false;
											var20 = 0;
											label558: for (local245 = 0; local245 < local944; local245++) {
												var11 = local8.aClass43Array56[local245];
												if (var11.anInt2320 != Static140.anInt3211) {
													for (local964 = var11.anInt2326; local964 <= var11.anInt2321; local964++) {
														for (local579 = var11.anInt2322; local579 <= var11.anInt2319; local579++) {
															var32 = local30[local964][local579];
															if (var32.aBoolean111) {
																local8.aBoolean112 = true;
																continue label558;
															}
															if (var32.anInt2275 != 0) {
																local589 = 0;
																if (local964 > var11.anInt2326) {
																	local589++;
																}
																if (local964 < var11.anInt2321) {
																	local589 += 4;
																}
																if (local579 > var11.anInt2322) {
																	local589 += 8;
																}
																if (local579 < var11.anInt2319) {
																	local589 += 2;
																}
																if ((local589 & var32.anInt2275) == local8.anInt2273) {
																	local8.aBoolean112 = true;
																	continue label558;
																}
															}
														}
													}
													Static159.aClass43Array105[var20++] = var11;
													local579 = Static30.anInt927 - var11.anInt2326;
													local584 = var11.anInt2321 - Static30.anInt927;
													if (local584 > local579) {
														local579 = local584;
													}
													local589 = Static72.anInt1868 - var11.anInt2322;
													var16 = var11.anInt2319 - Static72.anInt1868;
													if (var16 > local589) {
														var11.anInt2318 = local579 + var16;
													} else {
														var11.anInt2318 = local579 + local589;
													}
												}
											}
											while (var20 > 0) {
												local1079 = -50;
												local964 = -1;
												@Pc(1088) Class43 local1088;
												for (local579 = 0; local579 < var20; local579++) {
													local1088 = Static159.aClass43Array105[local579];
													if (local1088.anInt2320 != Static140.anInt3211) {
														if (local1088.anInt2318 > local1079) {
															local1079 = local1088.anInt2318;
															local964 = local579;
														} else if (local1088.anInt2318 == local1079) {
															local589 = local1088.anInt2317 - Static125.anInt2954;
															var16 = local1088.anInt2327 - Static14.anInt612;
															var17 = Static159.aClass43Array105[local964].anInt2317 - Static125.anInt2954;
															var18 = Static159.aClass43Array105[local964].anInt2327 - Static14.anInt612;
															if (local589 * local589 + var16 * var16 > var17 * var17 + var18 * var18) {
																local964 = local579;
															}
														}
													}
												}
												if (local964 == -1) {
													break;
												}
												local1088 = Static159.aClass43Array105[local964];
												local1088.anInt2320 = Static140.anInt3211;
												if (!Static70.method1296(local26, local1088.anInt2326, local1088.anInt2321, local1088.anInt2322, local1088.anInt2319, local1088.aClass2_Sub4_Sub1_2.aShort36)) {
													local1088.aClass2_Sub4_Sub1_2.method2856(local1088.anInt2323, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local1088.anInt2317 - Static125.anInt2954, local1088.anInt2324 - Static95.anInt2362, local1088.anInt2327 - Static14.anInt612, local1088.aLong83);
												}
												for (local589 = local1088.anInt2326; local589 <= local1088.anInt2321; local589++) {
													for (var16 = local1088.anInt2322; var16 <= local1088.anInt2319; var16++) {
														@Pc(1212) Class2_Sub14 local1212 = local30[local589][var16];
														if (local1212.anInt2275 != 0) {
															Static109.aClass65_10.method2116(local1212);
														} else if ((local589 != local17 || var16 != local20) && local1212.aBoolean113) {
															Static109.aClass65_10.method2116(local1212);
														}
													}
												}
											}
											if (!local8.aBoolean112) {
												break;
											}
										} catch (@Pc(1250) Exception local1250) {
											local8.aBoolean112 = false;
											break;
										}
									}
								} while (!local8.aBoolean113);
							} while (local8.anInt2275 != 0);
							if (local17 > Static30.anInt927 || local17 <= Static117.anInt2840) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean113);
						if (local17 < Static30.anInt927 || local17 >= Static150.anInt3362 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean113);
					if (local20 > Static72.anInt1868 || local20 <= Static167.anInt3743) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean113);
				if (local20 < Static72.anInt1868 || local20 >= Static129.anInt3029 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean113);
			local8.aBoolean113 = false;
			Static159.anInt4048--;
			@Pc(1354) Class64 local1354 = local8.aClass64_1;
			if (local1354 != null && local1354.anInt3082 != 0) {
				if (local1354.aClass2_Sub4_Sub1_8 != null) {
					local1354.aClass2_Sub4_Sub1_8.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local1354.anInt3081 - Static125.anInt2954, local1354.anInt3079 - Static95.anInt2362 - local1354.anInt3082, local1354.anInt3080 - Static14.anInt612, local1354.aLong113);
				}
				if (local1354.aClass2_Sub4_Sub1_9 != null) {
					local1354.aClass2_Sub4_Sub1_9.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local1354.anInt3081 - Static125.anInt2954, local1354.anInt3079 - Static95.anInt2362 - local1354.anInt3082, local1354.anInt3080 - Static14.anInt612, local1354.aLong113);
				}
				if (local1354.aClass2_Sub4_Sub1_7 != null) {
					local1354.aClass2_Sub4_Sub1_7.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local1354.anInt3081 - Static125.anInt2954, local1354.anInt3079 - Static95.anInt2362 - local1354.anInt3082, local1354.anInt3080 - Static14.anInt612, local1354.aLong113);
				}
			}
			if (local8.anInt2267 != 0) {
				@Pc(1449) Class49 local1449 = local8.aClass49_1;
				if (local1449 != null && !Static46.method886(local26, local17, local20, local1449.aClass2_Sub4_Sub1_4.aShort36)) {
					if ((local1449.anInt2504 & local8.anInt2267) != 0) {
						local1449.aClass2_Sub4_Sub1_4.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local1449.anInt2503 + local1449.anInt2505 - Static125.anInt2954, local1449.anInt2502 - Static95.anInt2362, local1449.anInt2506 + local1449.anInt2508 - Static14.anInt612, local1449.aLong89);
					} else if (local1449.anInt2504 == 256) {
						local245 = local1449.anInt2503 - Static125.anInt2954;
						local1079 = local1449.anInt2502 - Static95.anInt2362;
						local964 = local1449.anInt2506 - Static14.anInt612;
						local579 = local1449.anInt2500;
						if (local579 == 1 || local579 == 2) {
							local584 = -local245;
						} else {
							local584 = local245;
						}
						if (local579 == 2 || local579 == 3) {
							local589 = -local964;
						} else {
							local589 = local964;
						}
						if (local589 >= local584) {
							local1449.aClass2_Sub4_Sub1_4.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local245 + local1449.anInt2505, local1079, local964 + local1449.anInt2508, local1449.aLong89);
						} else if (local1449.aClass2_Sub4_Sub1_3 != null) {
							local1449.aClass2_Sub4_Sub1_3.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local245, local1079, local964, local1449.aLong89);
						}
					}
				}
				local906 = local8.aClass52_1;
				if (local906 != null) {
					if ((local906.anInt2607 & local8.anInt2267) != 0 && !Static3.method1661(local26, local17, local20, local906.anInt2607)) {
						local906.aClass2_Sub4_Sub1_5.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local906.anInt2608 - Static125.anInt2954, local906.anInt2611 - Static95.anInt2362, local906.anInt2612 - Static14.anInt612, local906.aLong93);
					}
					if ((local906.anInt2613 & local8.anInt2267) != 0 && !Static3.method1661(local26, local17, local20, local906.anInt2613)) {
						local906.aClass2_Sub4_Sub1_6.method2856(0, Static112.anInt2717, Static175.anInt3887, Static22.anInt738, Static66.anInt1786, local906.anInt2608 - Static125.anInt2954, local906.anInt2611 - Static95.anInt2362, local906.anInt2612 - Static14.anInt612, local906.aLong93);
					}
				}
			}
			@Pc(1669) Class2_Sub14 local1669;
			if (local23 < Static152.anInt3423 - 1) {
				local1669 = Static133.aClass2_Sub14ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1669 != null && local1669.aBoolean113) {
					Static109.aClass65_10.method2116(local1669);
				}
			}
			if (local17 < Static30.anInt927) {
				local1669 = local30[local17 + 1][local20];
				if (local1669 != null && local1669.aBoolean113) {
					Static109.aClass65_10.method2116(local1669);
				}
			}
			if (local20 < Static72.anInt1868) {
				local1669 = local30[local17][local20 + 1];
				if (local1669 != null && local1669.aBoolean113) {
					Static109.aClass65_10.method2116(local1669);
				}
			}
			if (local17 > Static30.anInt927) {
				local1669 = local30[local17 - 1][local20];
				if (local1669 != null && local1669.aBoolean113) {
					Static109.aClass65_10.method2116(local1669);
				}
			}
			if (local20 > Static72.anInt1868) {
				local1669 = local30[local17][local20 - 1];
				if (local1669 != null && local1669.aBoolean113) {
					Static109.aClass65_10.method2116(local1669);
				}
			}
		}
	}
}
