import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	public static int anInt354;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "Lclient!oa;")
	public static final Class75 aClass75_2 = new Class75(4096);

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_163 = Static161.method2452("Prepared sound engine");

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt352 = 0;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "Lclient!dc;")
	public static Class20 aClass20_164 = aClass20_163;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public static int anInt353 = 0;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!sg;")
	public static Class91 aClass91_3 = new Class91();

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	public static int anInt355 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!bf;Z)V")
	public static void method289(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) boolean arg1) {
		Static144.aClass91_14.method2686(arg0);
		while (true) {
			@Pc(8) Class5_Sub3 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class5_Sub3[][] local30;
			@Pc(47) Class5_Sub3 local47;
			@Pc(270) int local270;
			@Pc(629) int local629;
			@Pc(634) int local634;
			@Pc(639) int local639;
			@Pc(956) Class86 local956;
			@Pc(1129) int local1129;
			@Pc(1014) int local1014;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class43 var11;
										@Pc(642) int var16;
										@Pc(651) int var17;
										@Pc(663) int var18;
										@Pc(385) int var20;
										@Pc(308) boolean var21;
										@Pc(837) Class5_Sub3 var32;
										while (true) {
											do {
												local8 = (Class5_Sub3) Static144.aClass91_14.method2683();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean17);
											local17 = local8.anInt331;
											local20 = local8.anInt329;
											local23 = local8.anInt338;
											local26 = local8.anInt328;
											local30 = Static157.aClass5_Sub3ArrayArrayArray2[local23];
											if (!local8.aBoolean15) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static157.aClass5_Sub3ArrayArrayArray2[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean17) {
														continue;
													}
												}
												if (local17 <= Static212.anInt4111 && local17 > Static214.anInt4155) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean17 && (local47.aBoolean15 || (local8.anInt337 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static212.anInt4111 && local17 < Static38.anInt818 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean17 && (local47.aBoolean15 || (local8.anInt337 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static174.anInt3487 && local20 > Static16.anInt321) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean17 && (local47.aBoolean15 || (local8.anInt337 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static174.anInt3487 && local20 < Static157.anInt3190 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean17 && (local47.aBoolean15 || (local8.anInt337 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean15 = false;
											if (local8.aClass5_Sub3_1 != null) {
												local47 = local8.aClass5_Sub3_1;
												if (local47.aClass106_1 == null) {
													if (local47.aClass57_1 != null) {
														if (Static40.method691(0, local17, local20)) {
															Static125.method1964(local47.aClass57_1, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, true);
														} else {
															Static125.method1964(local47.aClass57_1, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, false);
														}
													}
												} else if (Static40.method691(0, local17, local20)) {
													Static43.method830(local47.aClass106_1, 0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, true);
												} else {
													Static43.method830(local47.aClass106_1, 0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, false);
												}
												@Pc(244) Class86 local244 = local47.aClass86_1;
												if (local244 != null) {
													local244.aClass1_9.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local244.anInt3232 - Static37.anInt1357, local244.anInt3238 - Static117.anInt2448, local244.anInt3235 - Static132.anInt3725, local244.aLong190);
												}
												for (local270 = 0; local270 < local47.anInt333; local270++) {
													var11 = local47.aClass43Array1[local270];
													if (var11 != null) {
														var11.aClass1_4.method2445(var11.anInt1820, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, var11.anInt1812 - Static37.anInt1357, var11.anInt1817 - Static117.anInt2448, var11.anInt1818 - Static132.anInt3725, var11.aLong102);
													}
												}
											}
											var21 = false;
											if (local8.aClass106_1 == null) {
												if (local8.aClass57_1 != null) {
													if (Static40.method691(local26, local17, local20)) {
														Static125.method1964(local8.aClass57_1, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, true);
													} else {
														var21 = true;
														Static125.method1964(local8.aClass57_1, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, false);
													}
												}
											} else if (Static40.method691(local26, local17, local20)) {
												Static43.method830(local8.aClass106_1, local26, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, true);
											} else {
												var21 = true;
												if (local8.aClass106_1.anInt4090 != 12345678 || Static85.aBoolean86 && local23 <= Static198.anInt3861) {
													Static43.method830(local8.aClass106_1, local26, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local17, local20, false);
												}
											}
											var20 = 0;
											local270 = 0;
											@Pc(390) Class86 local390 = local8.aClass86_1;
											@Pc(393) Class29 local393 = local8.aClass29_1;
											if (local390 != null || local393 != null) {
												if (Static212.anInt4111 == local17) {
													var20++;
												} else if (Static212.anInt4111 < local17) {
													var20 += 2;
												}
												if (Static174.anInt3487 == local20) {
													var20 += 3;
												} else if (Static174.anInt3487 > local20) {
													var20 += 6;
												}
												local270 = Static16.anIntArray23[var20];
												local8.anInt325 = Static50.anIntArray100[var20];
											}
											if (local390 != null) {
												if ((local390.anInt3234 & Static24.anIntArray30[var20]) == 0) {
													local8.anInt327 = 0;
												} else if (local390.anInt3234 == 16) {
													local8.anInt327 = 3;
													local8.anInt332 = Static105.anIntArray235[var20];
													local8.anInt326 = 3 - local8.anInt332;
												} else if (local390.anInt3234 == 32) {
													local8.anInt327 = 6;
													local8.anInt332 = Static138.anIntArray407[var20];
													local8.anInt326 = 6 - local8.anInt332;
												} else if (local390.anInt3234 == 64) {
													local8.anInt327 = 12;
													local8.anInt332 = Static100.anIntArray210[var20];
													local8.anInt326 = 12 - local8.anInt332;
												} else {
													local8.anInt327 = 9;
													local8.anInt332 = Static51.anIntArray102[var20];
													local8.anInt326 = 9 - local8.anInt332;
												}
												if ((local390.anInt3234 & local270) != 0 && !Static46.method847(local26, local17, local20, local390.anInt3234)) {
													local390.aClass1_9.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local390.anInt3232 - Static37.anInt1357, local390.anInt3238 - Static117.anInt2448, local390.anInt3235 - Static132.anInt3725, local390.aLong190);
												}
												if ((local390.anInt3240 & local270) != 0 && !Static46.method847(local26, local17, local20, local390.anInt3240)) {
													local390.aClass1_10.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local390.anInt3232 - Static37.anInt1357, local390.anInt3238 - Static117.anInt2448, local390.anInt3235 - Static132.anInt3725, local390.aLong190);
												}
											}
											if (local393 != null && !Static175.method2669(local26, local17, local20, local393.aClass1_2.method2449())) {
												if ((local393.anInt1079 & local270) != 0) {
													local393.aClass1_2.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local393.anInt1071 + local393.anInt1077 - Static37.anInt1357, local393.anInt1073 - Static117.anInt2448, local393.anInt1069 + local393.anInt1074 - Static132.anInt3725, local393.aLong61);
												} else if (local393.anInt1079 == 256) {
													local629 = local393.anInt1071 - Static37.anInt1357;
													local634 = local393.anInt1073 - Static117.anInt2448;
													local639 = local393.anInt1069 - Static132.anInt3725;
													var16 = local393.anInt1076;
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
														local393.aClass1_2.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local629 + local393.anInt1077, local634, local639 + local393.anInt1074, local393.aLong61);
													} else if (local393.aClass1_3 != null) {
														local393.aClass1_3.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local629, local634, local639, local393.aLong61);
													}
												}
											}
											if (var21) {
												@Pc(710) Class73 local710 = local8.aClass73_1;
												if (local710 != null) {
													local710.aClass1_8.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local710.anInt2716 - Static37.anInt1357, local710.anInt2713 - Static117.anInt2448, local710.anInt2712 - Static132.anInt3725, local710.aLong154);
												}
												@Pc(737) Class50 local737 = local8.aClass50_1;
												if (local737 != null && local737.anInt1964 == 0) {
													if (local737.aClass1_5 != null) {
														local737.aClass1_5.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local737.anInt1961 - Static37.anInt1357, local737.anInt1960 - Static117.anInt2448, local737.anInt1962 - Static132.anInt3725, local737.aLong112);
													}
													if (local737.aClass1_7 != null) {
														local737.aClass1_7.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local737.anInt1961 - Static37.anInt1357, local737.anInt1960 - Static117.anInt2448, local737.anInt1962 - Static132.anInt3725, local737.aLong112);
													}
													if (local737.aClass1_6 != null) {
														local737.aClass1_6.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local737.anInt1961 - Static37.anInt1357, local737.anInt1960 - Static117.anInt2448, local737.anInt1962 - Static132.anInt3725, local737.aLong112);
													}
												}
											}
											local629 = local8.anInt337;
											if (local629 != 0) {
												if (local17 < Static212.anInt4111 && (local629 & 0x4) != 0) {
													var32 = local30[local17 + 1][local20];
													if (var32 != null && var32.aBoolean17) {
														Static144.aClass91_14.method2686(var32);
													}
												}
												if (local20 < Static174.anInt3487 && (local629 & 0x2) != 0) {
													var32 = local30[local17][local20 + 1];
													if (var32 != null && var32.aBoolean17) {
														Static144.aClass91_14.method2686(var32);
													}
												}
												if (local17 > Static212.anInt4111 && (local629 & 0x1) != 0) {
													var32 = local30[local17 - 1][local20];
													if (var32 != null && var32.aBoolean17) {
														Static144.aClass91_14.method2686(var32);
													}
												}
												if (local20 > Static174.anInt3487 && (local629 & 0x8) != 0) {
													var32 = local30[local17][local20 - 1];
													if (var32 != null && var32.aBoolean17) {
														Static144.aClass91_14.method2686(var32);
													}
												}
											}
											break;
										}
										if (local8.anInt327 != 0) {
											var21 = true;
											for (var20 = 0; var20 < local8.anInt333; var20++) {
												if (local8.aClass43Array1[var20].anInt1822 != Static144.anInt2996 && (local8.anIntArray22[var20] & local8.anInt327) == local8.anInt332) {
													var21 = false;
													break;
												}
											}
											if (var21) {
												local956 = local8.aClass86_1;
												if (!Static46.method847(local26, local17, local20, local956.anInt3234)) {
													local956.aClass1_9.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local956.anInt3232 - Static37.anInt1357, local956.anInt3238 - Static117.anInt2448, local956.anInt3235 - Static132.anInt3725, local956.aLong190);
												}
												local8.anInt327 = 0;
											}
										}
										if (!local8.aBoolean16) {
											break;
										}
										try {
											@Pc(994) int local994 = local8.anInt333;
											local8.aBoolean16 = false;
											var20 = 0;
											label562: for (local270 = 0; local270 < local994; local270++) {
												var11 = local8.aClass43Array1[local270];
												if (var11.anInt1822 != Static144.anInt2996) {
													for (local1014 = var11.anInt1811; local1014 <= var11.anInt1821; local1014++) {
														for (local629 = var11.anInt1816; local629 <= var11.anInt1810; local629++) {
															var32 = local30[local1014][local629];
															if (var32.aBoolean15) {
																local8.aBoolean16 = true;
																continue label562;
															}
															if (var32.anInt327 != 0) {
																local639 = 0;
																if (local1014 > var11.anInt1811) {
																	local639++;
																}
																if (local1014 < var11.anInt1821) {
																	local639 += 4;
																}
																if (local629 > var11.anInt1816) {
																	local639 += 8;
																}
																if (local629 < var11.anInt1810) {
																	local639 += 2;
																}
																if ((local639 & var32.anInt327) == local8.anInt326) {
																	local8.aBoolean16 = true;
																	continue label562;
																}
															}
														}
													}
													Static103.aClass43Array2[var20++] = var11;
													local629 = Static212.anInt4111 - var11.anInt1811;
													local634 = var11.anInt1821 - Static212.anInt4111;
													if (local634 > local629) {
														local629 = local634;
													}
													local639 = Static174.anInt3487 - var11.anInt1816;
													var16 = var11.anInt1810 - Static174.anInt3487;
													if (var16 > local639) {
														var11.anInt1819 = local629 + var16;
													} else {
														var11.anInt1819 = local629 + local639;
													}
												}
											}
											while (var20 > 0) {
												local1129 = -50;
												local1014 = -1;
												@Pc(1138) Class43 local1138;
												for (local629 = 0; local629 < var20; local629++) {
													local1138 = Static103.aClass43Array2[local629];
													if (local1138.anInt1822 != Static144.anInt2996) {
														if (local1138.anInt1819 > local1129) {
															local1129 = local1138.anInt1819;
															local1014 = local629;
														} else if (local1138.anInt1819 == local1129) {
															local639 = local1138.anInt1812 - Static37.anInt1357;
															var16 = local1138.anInt1818 - Static132.anInt3725;
															var17 = Static103.aClass43Array2[local1014].anInt1812 - Static37.anInt1357;
															var18 = Static103.aClass43Array2[local1014].anInt1818 - Static132.anInt3725;
															if (local639 * local639 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1014 = local629;
															}
														}
													}
												}
												if (local1014 == -1) {
													break;
												}
												local1138 = Static103.aClass43Array2[local1014];
												local1138.anInt1822 = Static144.anInt2996;
												if (!Static74.method1216(local26, local1138.anInt1811, local1138.anInt1821, local1138.anInt1816, local1138.anInt1810, local1138.aClass1_4.method2449())) {
													local1138.aClass1_4.method2445(local1138.anInt1820, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local1138.anInt1812 - Static37.anInt1357, local1138.anInt1817 - Static117.anInt2448, local1138.anInt1818 - Static132.anInt3725, local1138.aLong102);
												}
												for (local639 = local1138.anInt1811; local639 <= local1138.anInt1821; local639++) {
													for (var16 = local1138.anInt1816; var16 <= local1138.anInt1810; var16++) {
														@Pc(1262) Class5_Sub3 local1262 = local30[local639][var16];
														if (local1262.anInt327 != 0) {
															Static144.aClass91_14.method2686(local1262);
														} else if ((local639 != local17 || var16 != local20) && local1262.aBoolean17) {
															Static144.aClass91_14.method2686(local1262);
														}
													}
												}
											}
											if (!local8.aBoolean16) {
												break;
											}
										} catch (@Pc(1300) Exception local1300) {
											local8.aBoolean16 = false;
											break;
										}
									}
								} while (!local8.aBoolean17);
							} while (local8.anInt327 != 0);
							if (local17 > Static212.anInt4111 || local17 <= Static214.anInt4155) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean17);
						if (local17 < Static212.anInt4111 || local17 >= Static38.anInt818 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean17);
					if (local20 > Static174.anInt3487 || local20 <= Static16.anInt321) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean17);
				if (local20 < Static174.anInt3487 || local20 >= Static157.anInt3190 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean17);
			local8.aBoolean17 = false;
			Static24.anInt409--;
			@Pc(1404) Class50 local1404 = local8.aClass50_1;
			if (local1404 != null && local1404.anInt1964 != 0) {
				if (local1404.aClass1_5 != null) {
					local1404.aClass1_5.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local1404.anInt1961 - Static37.anInt1357, local1404.anInt1960 - Static117.anInt2448 - local1404.anInt1964, local1404.anInt1962 - Static132.anInt3725, local1404.aLong112);
				}
				if (local1404.aClass1_7 != null) {
					local1404.aClass1_7.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local1404.anInt1961 - Static37.anInt1357, local1404.anInt1960 - Static117.anInt2448 - local1404.anInt1964, local1404.anInt1962 - Static132.anInt3725, local1404.aLong112);
				}
				if (local1404.aClass1_6 != null) {
					local1404.aClass1_6.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local1404.anInt1961 - Static37.anInt1357, local1404.anInt1960 - Static117.anInt2448 - local1404.anInt1964, local1404.anInt1962 - Static132.anInt3725, local1404.aLong112);
				}
			}
			if (local8.anInt325 != 0) {
				@Pc(1499) Class29 local1499 = local8.aClass29_1;
				if (local1499 != null && !Static175.method2669(local26, local17, local20, local1499.aClass1_2.method2449())) {
					if ((local1499.anInt1079 & local8.anInt325) != 0) {
						local1499.aClass1_2.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local1499.anInt1071 + local1499.anInt1077 - Static37.anInt1357, local1499.anInt1073 - Static117.anInt2448, local1499.anInt1069 + local1499.anInt1074 - Static132.anInt3725, local1499.aLong61);
					} else if (local1499.anInt1079 == 256) {
						local270 = local1499.anInt1071 - Static37.anInt1357;
						local1129 = local1499.anInt1073 - Static117.anInt2448;
						local1014 = local1499.anInt1069 - Static132.anInt3725;
						local629 = local1499.anInt1076;
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
							local1499.aClass1_2.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local270 + local1499.anInt1077, local1129, local1014 + local1499.anInt1074, local1499.aLong61);
						} else if (local1499.aClass1_3 != null) {
							local1499.aClass1_3.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local270, local1129, local1014, local1499.aLong61);
						}
					}
				}
				local956 = local8.aClass86_1;
				if (local956 != null) {
					if ((local956.anInt3240 & local8.anInt325) != 0 && !Static46.method847(local26, local17, local20, local956.anInt3240)) {
						local956.aClass1_10.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local956.anInt3232 - Static37.anInt1357, local956.anInt3238 - Static117.anInt2448, local956.anInt3235 - Static132.anInt3725, local956.aLong190);
					}
					if ((local956.anInt3234 & local8.anInt325) != 0 && !Static46.method847(local26, local17, local20, local956.anInt3234)) {
						local956.aClass1_9.method2445(0, Static50.anInt1081, Static36.anInt781, Static110.anInt2297, Static172.anInt3670, local956.anInt3232 - Static37.anInt1357, local956.anInt3238 - Static117.anInt2448, local956.anInt3235 - Static132.anInt3725, local956.aLong190);
					}
				}
			}
			@Pc(1719) Class5_Sub3 local1719;
			if (local23 < Static83.anInt1853 - 1) {
				local1719 = Static157.aClass5_Sub3ArrayArrayArray2[local23 + 1][local17][local20];
				if (local1719 != null && local1719.aBoolean17) {
					Static144.aClass91_14.method2686(local1719);
				}
			}
			if (local17 < Static212.anInt4111) {
				local1719 = local30[local17 + 1][local20];
				if (local1719 != null && local1719.aBoolean17) {
					Static144.aClass91_14.method2686(local1719);
				}
			}
			if (local20 < Static174.anInt3487) {
				local1719 = local30[local17][local20 + 1];
				if (local1719 != null && local1719.aBoolean17) {
					Static144.aClass91_14.method2686(local1719);
				}
			}
			if (local17 > Static212.anInt4111) {
				local1719 = local30[local17 - 1][local20];
				if (local1719 != null && local1719.aBoolean17) {
					Static144.aClass91_14.method2686(local1719);
				}
			}
			if (local20 > Static174.anInt3487) {
				local1719 = local30[local17][local20 - 1];
				if (local1719 != null && local1719.aBoolean17) {
					Static144.aClass91_14.method2686(local1719);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public static void method291() {
		for (@Pc(3) int local3 = 0; local3 < Static198.anInt3860; local3++) {
			@Pc(9) int local9 = Static103.anIntArray232[local3]--;
			if (Static103.anIntArray232[local3] >= -10) {
				@Pc(78) Class21 local78 = Static184.aClass21Array1[local3];
				if (local78 == null) {
					local78 = Static221.method619(Static60.aClass23_Sub1_9, Static110.anIntArray255[local3], 0);
					if (local78 == null) {
						continue;
					}
					Static103.anIntArray232[local3] += local78.method618();
					Static184.aClass21Array1[local3] = local78;
				}
				if (Static103.anIntArray232[local3] < 0) {
					@Pc(118) int local118;
					if (Static173.anIntArray365[local3] == 0) {
						local118 = Static6.anInt151;
					} else {
						@Pc(128) int local128 = (Static173.anIntArray365[local3] & 0xFF) * 128;
						@Pc(136) int local136 = Static173.anIntArray365[local3] >> 16 & 0xFF;
						@Pc(146) int local146 = local136 * 128 + 64 - Static210.aClass1_Sub2_Sub2_2.anInt2241;
						if (local146 < 0) {
							local146 = -local146;
						}
						@Pc(159) int local159 = Static173.anIntArray365[local3] >> 8 & 0xFF;
						@Pc(168) int local168 = local159 * 128 + 64 - Static210.aClass1_Sub2_Sub2_2.anInt2234;
						if (local168 < 0) {
							local168 = -local168;
						}
						@Pc(182) int local182 = local168 + local146 - 128;
						if (local182 > local128) {
							Static103.anIntArray232[local3] = -100;
							continue;
						}
						if (local182 < 0) {
							local182 = 0;
						}
						local118 = Static188.anInt3751 * (local128 - local182) / local128;
					}
					if (local118 > 0) {
						@Pc(221) Class5_Sub7_Sub1 local221 = local78.method620().method2004(Static160.aClass49_1);
						@Pc(226) Class5_Sub11_Sub1 local226 = Static222.method1580(local221, local118);
						local226.method1606(Static27.anIntArray34[local3] - 1);
						Static43.aClass5_Sub11_Sub4_1.method2872(local226);
					}
					Static103.anIntArray232[local3] = -100;
				}
			} else {
				Static198.anInt3860--;
				for (@Pc(25) int local25 = local3; local25 < Static198.anInt3860; local25++) {
					Static110.anIntArray255[local25] = Static110.anIntArray255[local25 + 1];
					Static184.aClass21Array1[local25] = Static184.aClass21Array1[local25 + 1];
					Static27.anIntArray34[local25] = Static27.anIntArray34[local25 + 1];
					Static103.anIntArray232[local25] = Static103.anIntArray232[local25 + 1];
					Static173.anIntArray365[local25] = Static173.anIntArray365[local25 + 1];
				}
				local3--;
			}
		}
		if (Static210.aBoolean58 && !Static90.method1501()) {
			if (Static46.anInt1037 != 0 && Static160.anInt3233 != -1) {
				Static147.method2257(Static160.anInt3233, Static59.aClass23_Sub1_7, Static46.anInt1037);
			}
			Static210.aBoolean58 = false;
		} else if (Static46.anInt1037 != 0 && Static160.anInt3233 != -1 && !Static90.method1501()) {
			Static43.aClass5_Sub6_Sub1_2.method3087(144);
			Static43.aClass5_Sub6_Sub1_2.method3030(Static160.anInt3233);
			Static160.anInt3233 = -1;
		}
	}
}
