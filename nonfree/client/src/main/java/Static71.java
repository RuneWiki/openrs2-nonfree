import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "J")
	public static long aLong52;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
	public static int[] anIntArray175 = new int[100];

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	public static int anInt1877 = 0;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "Lclient!i;")
	public static Class41 aClass41_579 = Static184.method2923("");

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ea;I)Lclient!sg;")
	public static Class28_Sub4 method1301(@OriginalArg(0) Class2_Sub3 arg0) {
		return new Class28_Sub4(arg0.method196(), arg0.method196(), arg0.method196(), arg0.method196(), arg0.method166(), arg0.method209());
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!bj;IILclient!ud;)V")
	public static void method1303(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class96 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class108 local9 = Static201.aClass108_17;
		synchronized (Static201.aClass108_17) {
			for (@Pc(16) Class2_Sub13 local16 = (Class2_Sub13) Static201.aClass108_17.method3322(); local16 != null; local16 = (Class2_Sub13) Static201.aClass108_17.method3331()) {
				if (local16.aLong150 == (long) arg1 && arg2 == local16.aClass96_3 && local16.anInt2044 == 0) {
					local7 = local16.aByteArray27;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(66) byte[] local66 = arg2.method3073(arg1);
			arg0.method426(local66, arg1, arg2, true);
		} else {
			arg0.method426(local7, arg1, arg2, true);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BBI)I")
	public static int method1304(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static205.method3165(0, arg0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eg;Z)V")
	public static void method1305(@OriginalArg(0) Class2_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		Static92.aClass108_8.method3334(arg0);
		while (true) {
			@Pc(8) Class2_Sub7 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class2_Sub7[][] local30;
			@Pc(47) Class2_Sub7 local47;
			@Pc(270) int local270;
			@Pc(629) int local629;
			@Pc(634) int local634;
			@Pc(639) int local639;
			@Pc(956) Class71 local956;
			@Pc(1129) int local1129;
			@Pc(1014) int local1014;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class51 var11;
										@Pc(642) int var16;
										@Pc(651) int var17;
										@Pc(663) int var18;
										@Pc(385) int var20;
										@Pc(308) boolean var21;
										@Pc(837) Class2_Sub7 var32;
										while (true) {
											do {
												local8 = (Class2_Sub7) Static92.aClass108_8.method3325();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean69);
											local17 = local8.anInt1381;
											local20 = local8.anInt1373;
											local23 = local8.anInt1383;
											local26 = local8.anInt1380;
											local30 = Static27.aClass2_Sub7ArrayArrayArray4[local23];
											if (!local8.aBoolean67) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static27.aClass2_Sub7ArrayArrayArray4[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean69) {
														continue;
													}
												}
												if (local17 <= Static69.anInt1824 && local17 > Static141.anInt3249) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean69 && (local47.aBoolean67 || (local8.anInt1378 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static69.anInt1824 && local17 < Static5.anInt285 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean69 && (local47.aBoolean67 || (local8.anInt1378 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static77.anInt1993 && local20 > Static89.anInt2200) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean69 && (local47.aBoolean67 || (local8.anInt1378 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static77.anInt1993 && local20 < Static204.anInt4550 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean69 && (local47.aBoolean67 || (local8.anInt1378 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean67 = false;
											if (local8.aClass2_Sub7_1 != null) {
												local47 = local8.aClass2_Sub7_1;
												if (local47.aClass45_1 == null) {
													if (local47.aClass32_1 != null) {
														if (Static212.method3258(0, local17, local20)) {
															Static141.method2226(local47.aClass32_1, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, true);
														} else {
															Static141.method2226(local47.aClass32_1, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, false);
														}
													}
												} else if (Static212.method3258(0, local17, local20)) {
													Static50.method1510(local47.aClass45_1, 0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, true);
												} else {
													Static50.method1510(local47.aClass45_1, 0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, false);
												}
												@Pc(244) Class71 local244 = local47.aClass71_1;
												if (local244 != null) {
													local244.aClass12_5.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local244.anInt3260 - Static65.anInt1729, local244.anInt3262 - Static214.anInt4717, local244.anInt3256 - Static191.anInt4374, local244.aLong100);
												}
												for (local270 = 0; local270 < local47.anInt1382; local270++) {
													var11 = local47.aClass51Array1[local270];
													if (var11 != null) {
														var11.aClass12_4.method2715(var11.anInt2311, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, var11.anInt2314 - Static65.anInt1729, var11.anInt2310 - Static214.anInt4717, var11.anInt2316 - Static191.anInt4374, var11.aLong69);
													}
												}
											}
											var21 = false;
											if (local8.aClass45_1 == null) {
												if (local8.aClass32_1 != null) {
													if (Static212.method3258(local26, local17, local20)) {
														Static141.method2226(local8.aClass32_1, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, true);
													} else {
														var21 = true;
														Static141.method2226(local8.aClass32_1, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, false);
													}
												}
											} else if (Static212.method3258(local26, local17, local20)) {
												Static50.method1510(local8.aClass45_1, local26, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, true);
											} else {
												var21 = true;
												if (local8.aClass45_1.anInt2112 != 12345678 || Static104.aBoolean136 && local23 <= Static118.anInt2857) {
													Static50.method1510(local8.aClass45_1, local26, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local17, local20, false);
												}
											}
											var20 = 0;
											local270 = 0;
											@Pc(390) Class71 local390 = local8.aClass71_1;
											@Pc(393) Class35 local393 = local8.aClass35_1;
											if (local390 != null || local393 != null) {
												if (Static69.anInt1824 == local17) {
													var20++;
												} else if (Static69.anInt1824 < local17) {
													var20 += 2;
												}
												if (Static77.anInt1993 == local20) {
													var20 += 3;
												} else if (Static77.anInt1993 > local20) {
													var20 += 6;
												}
												local270 = Static96.anIntArray237[var20];
												local8.anInt1376 = Static203.anIntArray469[var20];
											}
											if (local390 != null) {
												if ((local390.anInt3259 & Static84.anIntArray210[var20]) == 0) {
													local8.anInt1377 = 0;
												} else if (local390.anInt3259 == 16) {
													local8.anInt1377 = 3;
													local8.anInt1374 = Static48.anIntArray132[var20];
													local8.anInt1379 = 3 - local8.anInt1374;
												} else if (local390.anInt3259 == 32) {
													local8.anInt1377 = 6;
													local8.anInt1374 = Static195.anIntArray459[var20];
													local8.anInt1379 = 6 - local8.anInt1374;
												} else if (local390.anInt3259 == 64) {
													local8.anInt1377 = 12;
													local8.anInt1374 = Static90.anIntArray225[var20];
													local8.anInt1379 = 12 - local8.anInt1374;
												} else {
													local8.anInt1377 = 9;
													local8.anInt1374 = Static44.anIntArray127[var20];
													local8.anInt1379 = 9 - local8.anInt1374;
												}
												if ((local390.anInt3259 & local270) != 0 && !Static129.method393(local26, local17, local20, local390.anInt3259)) {
													local390.aClass12_5.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local390.anInt3260 - Static65.anInt1729, local390.anInt3262 - Static214.anInt4717, local390.anInt3256 - Static191.anInt4374, local390.aLong100);
												}
												if ((local390.anInt3257 & local270) != 0 && !Static129.method393(local26, local17, local20, local390.anInt3257)) {
													local390.aClass12_6.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local390.anInt3260 - Static65.anInt1729, local390.anInt3262 - Static214.anInt4717, local390.anInt3256 - Static191.anInt4374, local390.aLong100);
												}
											}
											if (local393 != null && !Static167.method2704(local26, local17, local20, local393.aClass12_1.method2718())) {
												if ((local393.anInt1611 & local270) != 0) {
													local393.aClass12_1.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local393.anInt1608 + local393.anInt1616 - Static65.anInt1729, local393.anInt1615 - Static214.anInt4717, local393.anInt1609 + local393.anInt1614 - Static191.anInt4374, local393.aLong44);
												} else if (local393.anInt1611 == 256) {
													local629 = local393.anInt1608 - Static65.anInt1729;
													local634 = local393.anInt1615 - Static214.anInt4717;
													local639 = local393.anInt1609 - Static191.anInt4374;
													var16 = local393.anInt1617;
													if (var16 == 1 || var16 == 2) {
														var17 = -local629;
													} else {
														var17 = local629;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local639;
													} else {
														var18 = local639;
													}
													if (var18 < var17) {
														local393.aClass12_1.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local629 + local393.anInt1616, local634, local639 + local393.anInt1614, local393.aLong44);
													} else if (local393.aClass12_2 != null) {
														local393.aClass12_2.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local629, local634, local639, local393.aLong44);
													}
												}
											}
											if (var21) {
												@Pc(710) Class78 local710 = local8.aClass78_1;
												if (local710 != null) {
													local710.aClass12_7.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local710.anInt3383 - Static65.anInt1729, local710.anInt3380 - Static214.anInt4717, local710.anInt3378 - Static191.anInt4374, local710.aLong103);
												}
												@Pc(737) Class103 local737 = local8.aClass103_1;
												if (local737 != null && local737.anInt4703 == 0) {
													if (local737.aClass12_10 != null) {
														local737.aClass12_10.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local737.anInt4712 - Static65.anInt1729, local737.anInt4709 - Static214.anInt4717, local737.anInt4707 - Static191.anInt4374, local737.aLong147);
													}
													if (local737.aClass12_11 != null) {
														local737.aClass12_11.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local737.anInt4712 - Static65.anInt1729, local737.anInt4709 - Static214.anInt4717, local737.anInt4707 - Static191.anInt4374, local737.aLong147);
													}
													if (local737.aClass12_9 != null) {
														local737.aClass12_9.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local737.anInt4712 - Static65.anInt1729, local737.anInt4709 - Static214.anInt4717, local737.anInt4707 - Static191.anInt4374, local737.aLong147);
													}
												}
											}
											local629 = local8.anInt1378;
											if (local629 != 0) {
												if (local17 < Static69.anInt1824 && (local629 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean69) {
														Static92.aClass108_8.method3334(var32);
													}
												}
												if (local20 < Static77.anInt1993 && (local629 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean69) {
														Static92.aClass108_8.method3334(var32);
													}
												}
												if (local17 > Static69.anInt1824 && (local629 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean69) {
														Static92.aClass108_8.method3334(var32);
													}
												}
												if (local20 > Static77.anInt1993 && (local629 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean69) {
														Static92.aClass108_8.method3334(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt1377 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt1382; var20++) {
												if (local8.aClass51Array1[var20].anInt2306 != Static128.anInt2975 && (local8.anIntArray130[var20] & local8.anInt1377) == local8.anInt1374) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local956 = local8.aClass71_1;
												if (!Static129.method393(local26, local17, local20, local956.anInt3259)) {
													local956.aClass12_5.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local956.anInt3260 - Static65.anInt1729, local956.anInt3262 - Static214.anInt4717, local956.anInt3256 - Static191.anInt4374, local956.aLong100);
												}
												local8.anInt1377 = 0;
											}
										}
										if (!local8.aBoolean68) {
											break;
										}
										try {
											@Pc(994) int local994 = local8.anInt1382;
											local8.aBoolean68 = false;
											var20 = 0;
											label562: for (local270 = 0; local270 < local994; local270++) {
												var11 = local8.aClass51Array1[local270];
												if (var11.anInt2306 != Static128.anInt2975) {
													for (local1014 = var11.anInt2305; local1014 <= var11.anInt2312; local1014++) {
														for (local629 = var11.anInt2308; local629 <= var11.anInt2307; local629++) {
															var32 = local30[local1014][local629];
															if (var32.aBoolean67) {
																local8.aBoolean68 = true;
																continue label562;
															}
															if (var32.anInt1377 != 0) {
																local639 = 0;
																if (local1014 > var11.anInt2305) {
																	local639++;
																}
																if (local1014 < var11.anInt2312) {
																	local639 += 4;
																}
																if (local629 > var11.anInt2308) {
																	local639 += 8;
																}
																if (local629 < var11.anInt2307) {
																	local639 += 2;
																}
																if ((local639 & var32.anInt1377) == local8.anInt1379) {
																	local8.aBoolean68 = true;
																	continue label562;
																}
															}
														}
													}
													Static212.aClass51Array3[var20++] = var11;
													local629 = Static69.anInt1824 - var11.anInt2305;
													local634 = var11.anInt2312 - Static69.anInt1824;
													if (local634 > local629) {
														local629 = local634;
													}
													local639 = Static77.anInt1993 - var11.anInt2308;
													var16 = var11.anInt2307 - Static77.anInt1993;
													if (var16 > local639) {
														var11.anInt2317 = local629 + var16;
													} else {
														var11.anInt2317 = local629 + local639;
													}
												}
											}
											while (var20 > 0) {
												local1129 = -50;
												local1014 = -1;
												@Pc(1138) Class51 local1138;
												for (local629 = 0; local629 < var20; local629++) {
													local1138 = Static212.aClass51Array3[local629];
													if (local1138.anInt2306 != Static128.anInt2975) {
														if (local1138.anInt2317 > local1129) {
															local1129 = local1138.anInt2317;
															local1014 = local629;
														} else if (local1138.anInt2317 == local1129) {
															local639 = local1138.anInt2314 - Static65.anInt1729;
															var16 = local1138.anInt2316 - Static191.anInt4374;
															var17 = Static212.aClass51Array3[local1014].anInt2314 - Static65.anInt1729;
															var18 = Static212.aClass51Array3[local1014].anInt2316 - Static191.anInt4374;
															if (local639 * local639 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1014 = local629;
															}
														}
													}
												}
												if (local1014 == -1) {
													break;
												}
												local1138 = Static212.aClass51Array3[local1014];
												local1138.anInt2306 = Static128.anInt2975;
												if (!Static31.method608(local26, local1138.anInt2305, local1138.anInt2312, local1138.anInt2308, local1138.anInt2307, local1138.aClass12_4.method2718())) {
													local1138.aClass12_4.method2715(local1138.anInt2311, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local1138.anInt2314 - Static65.anInt1729, local1138.anInt2310 - Static214.anInt4717, local1138.anInt2316 - Static191.anInt4374, local1138.aLong69);
												}
												for (local639 = local1138.anInt2305; local639 <= local1138.anInt2312; local639++) {
													for (var16 = local1138.anInt2308; var16 <= local1138.anInt2307; var16++) {
														@Pc(1262) Class2_Sub7 local1262 = local30[local639][var16];
														if (local1262.anInt1377 != 0) {
															Static92.aClass108_8.method3334(local1262);
														} else if ((local639 != local17 || var16 != local20) && local1262.aBoolean69) {
															Static92.aClass108_8.method3334(local1262);
														}
													}
												}
											}
											if (!local8.aBoolean68) {
												break;
											}
										} catch (@Pc(1300) Exception local1300) {
											local8.aBoolean68 = false;
											break;
										}
									}
								} while (!local8.aBoolean69);
							} while (local8.anInt1377 != 0);
							if (local17 > Static69.anInt1824 || local17 <= Static141.anInt3249) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean69);
						if (local17 < Static69.anInt1824 || local17 >= Static5.anInt285 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean69);
					if (local20 > Static77.anInt1993 || local20 <= Static89.anInt2200) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean69);
				if (local20 < Static77.anInt1993 || local20 >= Static204.anInt4550 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean69);
			local8.aBoolean69 = false;
			Static158.anInt3732--;
			@Pc(1404) Class103 local1404 = local8.aClass103_1;
			if (local1404 != null && local1404.anInt4703 != 0) {
				if (local1404.aClass12_10 != null) {
					local1404.aClass12_10.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local1404.anInt4712 - Static65.anInt1729, local1404.anInt4709 - Static214.anInt4717 - local1404.anInt4703, local1404.anInt4707 - Static191.anInt4374, local1404.aLong147);
				}
				if (local1404.aClass12_11 != null) {
					local1404.aClass12_11.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local1404.anInt4712 - Static65.anInt1729, local1404.anInt4709 - Static214.anInt4717 - local1404.anInt4703, local1404.anInt4707 - Static191.anInt4374, local1404.aLong147);
				}
				if (local1404.aClass12_9 != null) {
					local1404.aClass12_9.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local1404.anInt4712 - Static65.anInt1729, local1404.anInt4709 - Static214.anInt4717 - local1404.anInt4703, local1404.anInt4707 - Static191.anInt4374, local1404.aLong147);
				}
			}
			if (local8.anInt1376 != 0) {
				@Pc(1499) Class35 local1499 = local8.aClass35_1;
				if (local1499 != null && !Static167.method2704(local26, local17, local20, local1499.aClass12_1.method2718())) {
					if ((local1499.anInt1611 & local8.anInt1376) != 0) {
						local1499.aClass12_1.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local1499.anInt1608 + local1499.anInt1616 - Static65.anInt1729, local1499.anInt1615 - Static214.anInt4717, local1499.anInt1609 + local1499.anInt1614 - Static191.anInt4374, local1499.aLong44);
					} else if (local1499.anInt1611 == 256) {
						local270 = local1499.anInt1608 - Static65.anInt1729;
						local1129 = local1499.anInt1615 - Static214.anInt4717;
						local1014 = local1499.anInt1609 - Static191.anInt4374;
						local629 = local1499.anInt1617;
						if (local629 == 1 || local629 == 2) {
							local634 = -local270;
						} else {
							local634 = local270;
						}
						if (local629 == 2 || local629 == 3) {
							local639 = -local1014;
						} else {
							local639 = local1014;
						}
						if (local639 >= local634) {
							local1499.aClass12_1.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local270 + local1499.anInt1616, local1129, local1014 + local1499.anInt1614, local1499.aLong44);
						} else if (local1499.aClass12_2 != null) {
							local1499.aClass12_2.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local270, local1129, local1014, local1499.aLong44);
						}
					}
				}
				local956 = local8.aClass71_1;
				if (local956 != null) {
					if ((local956.anInt3257 & local8.anInt1376) != 0 && !Static129.method393(local26, local17, local20, local956.anInt3257)) {
						local956.aClass12_6.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local956.anInt3260 - Static65.anInt1729, local956.anInt3262 - Static214.anInt4717, local956.anInt3256 - Static191.anInt4374, local956.aLong100);
					}
					if ((local956.anInt3259 & local8.anInt1376) != 0 && !Static129.method393(local26, local17, local20, local956.anInt3259)) {
						local956.aClass12_5.method2715(0, Static86.anInt2170, Static177.anInt4128, Static151.anInt3441, Static144.anInt3296, local956.anInt3260 - Static65.anInt1729, local956.anInt3262 - Static214.anInt4717, local956.anInt3256 - Static191.anInt4374, local956.aLong100);
					}
				}
			}
			@Pc(1719) Class2_Sub7 local1719;
			if (local23 < Static10.anInt369 - 1) {
				local1719 = Static27.aClass2_Sub7ArrayArrayArray4[local23 + 1][local17][local20];
				if (local1719 != null && local1719.aBoolean69) {
					Static92.aClass108_8.method3334(local1719);
				}
			}
			if (local17 < Static69.anInt1824) {
				local1719 = local30[local17 + 1][local20];
				if (local1719 != null && local1719.aBoolean69) {
					Static92.aClass108_8.method3334(local1719);
				}
			}
			if (local20 < Static77.anInt1993) {
				local1719 = local30[local17][local20 + 1];
				if (local1719 != null && local1719.aBoolean69) {
					Static92.aClass108_8.method3334(local1719);
				}
			}
			if (local17 > Static69.anInt1824) {
				local1719 = local30[local17 - 1][local20];
				if (local1719 != null && local1719.aBoolean69) {
					Static92.aClass108_8.method3334(local1719);
				}
			}
			if (local20 > Static77.anInt1993) {
				local1719 = local30[local17][local20 - 1];
				if (local1719 != null && local1719.aBoolean69) {
					Static92.aClass108_8.method3334(local1719);
				}
			}
		}
	}
}
