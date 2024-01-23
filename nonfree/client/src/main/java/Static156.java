import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt3425;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1212 = Static64.method1101("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
	public static int anInt3428 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ea;Z)V")
	public static void method2676(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		Static71.aClass105_10.method3119(arg0);
		while (true) {
			@Pc(8) Class1_Sub7 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub7[][] local30;
			@Pc(47) Class1_Sub7 local47;
			@Pc(270) int local270;
			@Pc(665) int local665;
			@Pc(670) int local670;
			@Pc(675) int local675;
			@Pc(999) Class62 local999;
			@Pc(1172) int local1172;
			@Pc(1057) int local1057;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class83 var11;
										@Pc(678) int var16;
										@Pc(687) int var17;
										@Pc(699) int var18;
										@Pc(421) int var21;
										@Pc(308) boolean var22;
										@Pc(880) Class1_Sub7 var33;
										while (true) {
											do {
												local8 = (Class1_Sub7) Static71.aClass105_10.method3117();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean55);
											local17 = local8.anInt1123;
											local20 = local8.anInt1131;
											local23 = local8.anInt1129;
											local26 = local8.anInt1130;
											local30 = Static22.aClass1_Sub7ArrayArrayArray1[local23];
											if (!local8.aBoolean53) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static22.aClass1_Sub7ArrayArrayArray1[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean55) {
														continue;
													}
												}
												if (local17 <= Static72.anInt1643 && local17 > Static163.anInt3523) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean55 && (local47.aBoolean53 || (local8.anInt1122 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static72.anInt1643 && local17 < Static41.anInt972 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean55 && (local47.aBoolean53 || (local8.anInt1122 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static220.anInt4646 && local20 > Static127.anInt2831) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean55 && (local47.aBoolean53 || (local8.anInt1122 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static220.anInt4646 && local20 < Static230.anInt4880 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean55 && (local47.aBoolean53 || (local8.anInt1122 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean53 = false;
											if (local8.aClass1_Sub7_1 != null) {
												local47 = local8.aClass1_Sub7_1;
												if (local47.aClass126_1 == null) {
													if (local47.aClass95_1 != null) {
														if (Static77.method1327(0, local17, local20)) {
															Static74.method1295(local47.aClass95_1, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, true);
														} else {
															Static74.method1295(local47.aClass95_1, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, false);
														}
													}
												} else if (Static77.method1327(0, local17, local20)) {
													Static32.method547(local47.aClass126_1, 0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, true);
												} else {
													Static32.method547(local47.aClass126_1, 0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, false);
												}
												@Pc(244) Class62 local244 = local47.aClass62_1;
												if (local244 != null) {
													local244.aClass5_2.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local244.anInt2407 - Static155.anInt3423, local244.anInt2404 - Static115.anInt2533, local244.anInt2400 - Static70.anInt1623, local244.aLong84);
												}
												for (local270 = 0; local270 < local47.anInt1124; local270++) {
													var11 = local47.aClass83Array3[local270];
													if (var11 != null) {
														var11.aClass5_5.method3679(var11.anInt3341, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, var11.anInt3344 - Static155.anInt3423, var11.anInt3338 - Static115.anInt2533, var11.anInt3343 - Static70.anInt1623, var11.aLong118);
													}
												}
											}
											var22 = false;
											if (local8.aClass126_1 == null) {
												if (local8.aClass95_1 != null) {
													if (Static77.method1327(local26, local17, local20)) {
														Static74.method1295(local8.aClass95_1, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, true);
													} else {
														var22 = true;
														Static74.method1295(local8.aClass95_1, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, false);
													}
												}
											} else if (Static77.method1327(local26, local17, local20)) {
												Static32.method547(local8.aClass126_1, local26, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, true);
											} else {
												var22 = true;
												if (local8.aClass126_1.anInt4882 != 12345678 || Static74.aBoolean75 && local23 <= Static224.anInt4695) {
													Static32.method547(local8.aClass126_1, local26, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local17, local20, false);
												}
											}
											if (var22) {
												@Pc(388) Class119 local388 = local8.aClass119_1;
												if (local388 != null && (local388.aLong163 & 0xFFFFFFFF80000000L) != 0L) {
													local388.aClass5_9.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local388.anInt4591 - Static155.anInt3423, local388.anInt4586 - Static115.anInt2533, local388.anInt4588 - Static70.anInt1623, local388.aLong163);
												}
											}
											var21 = 0;
											local270 = 0;
											@Pc(426) Class62 local426 = local8.aClass62_1;
											@Pc(429) Class65 local429 = local8.aClass65_1;
											if (local426 != null || local429 != null) {
												if (Static72.anInt1643 == local17) {
													var21++;
												} else if (Static72.anInt1643 < local17) {
													var21 += 2;
												}
												if (Static220.anInt4646 == local20) {
													var21 += 3;
												} else if (Static220.anInt4646 > local20) {
													var21 += 6;
												}
												local270 = Static139.anIntArray206[var21];
												local8.anInt1133 = Static5.anIntArray237[var21];
											}
											if (local426 != null) {
												if ((local426.anInt2403 & Static38.anIntArray55[var21]) == 0) {
													local8.anInt1128 = 0;
												} else if (local426.anInt2403 == 16) {
													local8.anInt1128 = 3;
													local8.anInt1127 = Static59.anIntArray88[var21];
													local8.anInt1121 = 3 - local8.anInt1127;
												} else if (local426.anInt2403 == 32) {
													local8.anInt1128 = 6;
													local8.anInt1127 = Static50.anIntArray68[var21];
													local8.anInt1121 = 6 - local8.anInt1127;
												} else if (local426.anInt2403 == 64) {
													local8.anInt1128 = 12;
													local8.anInt1127 = Static138.anIntArray205[var21];
													local8.anInt1121 = 12 - local8.anInt1127;
												} else {
													local8.anInt1128 = 9;
													local8.anInt1127 = Static81.anIntArray114[var21];
													local8.anInt1121 = 9 - local8.anInt1127;
												}
												if ((local426.anInt2403 & local270) != 0 && !Static114.method1907(local26, local17, local20, local426.anInt2403)) {
													local426.aClass5_2.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local426.anInt2407 - Static155.anInt3423, local426.anInt2404 - Static115.anInt2533, local426.anInt2400 - Static70.anInt1623, local426.aLong84);
												}
												if ((local426.anInt2396 & local270) != 0 && !Static114.method1907(local26, local17, local20, local426.anInt2396)) {
													local426.aClass5_1.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local426.anInt2407 - Static155.anInt3423, local426.anInt2404 - Static115.anInt2533, local426.anInt2400 - Static70.anInt1623, local426.aLong84);
												}
											}
											if (local429 != null && !Static20.method447(local26, local17, local20, local429.aClass5_3.method3680())) {
												if ((local429.anInt2433 & local270) != 0) {
													local429.aClass5_3.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local429.anInt2432 + local429.anInt2426 - Static155.anInt3423, local429.anInt2425 - Static115.anInt2533, local429.anInt2434 + local429.anInt2428 - Static70.anInt1623, local429.aLong85);
												} else if (local429.anInt2433 == 256) {
													local665 = local429.anInt2432 - Static155.anInt3423;
													local670 = local429.anInt2425 - Static115.anInt2533;
													local675 = local429.anInt2434 - Static70.anInt1623;
													var16 = local429.anInt2431;
													if (var16 == 1 || var16 == 2) {
														var17 = -local665;
													} else {
														var17 = local665;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local675;
													} else {
														var18 = local675;
													}
													if (var18 < var17) {
														local429.aClass5_3.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local665 + local429.anInt2426, local670, local675 + local429.anInt2428, local429.aLong85);
													} else if (local429.aClass5_4 != null) {
														local429.aClass5_4.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local665, local670, local675, local429.aLong85);
													}
												}
											}
											if (var22) {
												@Pc(746) Class119 local746 = local8.aClass119_1;
												if (local746 != null && (local746.aLong163 & 0xFFFFFFFF80000000L) == 0L) {
													local746.aClass5_9.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local746.anInt4591 - Static155.anInt3423, local746.anInt4586 - Static115.anInt2533, local746.anInt4588 - Static70.anInt1623, local746.aLong163);
												}
												@Pc(780) Class115 local780 = local8.aClass115_1;
												if (local780 != null && local780.anInt4452 == 0) {
													if (local780.aClass5_7 != null) {
														local780.aClass5_7.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local780.anInt4450 - Static155.anInt3423, local780.anInt4441 - Static115.anInt2533, local780.anInt4443 - Static70.anInt1623, local780.aLong161);
													}
													if (local780.aClass5_6 != null) {
														local780.aClass5_6.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local780.anInt4450 - Static155.anInt3423, local780.anInt4441 - Static115.anInt2533, local780.anInt4443 - Static70.anInt1623, local780.aLong161);
													}
													if (local780.aClass5_8 != null) {
														local780.aClass5_8.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local780.anInt4450 - Static155.anInt3423, local780.anInt4441 - Static115.anInt2533, local780.anInt4443 - Static70.anInt1623, local780.aLong161);
													}
												}
											}
											local665 = local8.anInt1122;
											if (local665 != 0) {
												if (local17 < Static72.anInt1643 && (local665 & 0x4) != 0) {
													var33 = local30[local17 + 1][local20];
													if (var33 != null && var33.aBoolean55) {
														Static71.aClass105_10.method3119(var33);
													}
												}
												if (local20 < Static220.anInt4646 && (local665 & 0x2) != 0) {
													var33 = local30[local17][local20 + 1];
													if (var33 != null && var33.aBoolean55) {
														Static71.aClass105_10.method3119(var33);
													}
												}
												if (local17 > Static72.anInt1643 && (local665 & 0x1) != 0) {
													var33 = local30[local17 - 1][local20];
													if (var33 != null && var33.aBoolean55) {
														Static71.aClass105_10.method3119(var33);
													}
												}
												if (local20 > Static220.anInt4646 && (local665 & 0x8) != 0) {
													var33 = local30[local17][local20 - 1];
													if (var33 != null && var33.aBoolean55) {
														Static71.aClass105_10.method3119(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1128 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1124; var21++) {
												if (local8.aClass83Array3[var21].anInt3348 != Static134.anInt3026 && (local8.anIntArray65[var21] & local8.anInt1128) == local8.anInt1127) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local999 = local8.aClass62_1;
												if (!Static114.method1907(local26, local17, local20, local999.anInt2403)) {
													local999.aClass5_2.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local999.anInt2407 - Static155.anInt3423, local999.anInt2404 - Static115.anInt2533, local999.anInt2400 - Static70.anInt1623, local999.aLong84);
												}
												local8.anInt1128 = 0;
											}
										}
										if (!local8.aBoolean54) {
											break;
										}
										try {
											@Pc(1037) int local1037 = local8.anInt1124;
											local8.aBoolean54 = false;
											var21 = 0;
											label572: for (local270 = 0; local270 < local1037; local270++) {
												var11 = local8.aClass83Array3[local270];
												if (var11.anInt3348 != Static134.anInt3026) {
													for (local1057 = var11.anInt3340; local1057 <= var11.anInt3342; local1057++) {
														for (local665 = var11.anInt3336; local665 <= var11.anInt3346; local665++) {
															var33 = local30[local1057][local665];
															if (var33.aBoolean53) {
																local8.aBoolean54 = true;
																continue label572;
															}
															if (var33.anInt1128 != 0) {
																local675 = 0;
																if (local1057 > var11.anInt3340) {
																	local675++;
																}
																if (local1057 < var11.anInt3342) {
																	local675 += 4;
																}
																if (local665 > var11.anInt3336) {
																	local675 += 8;
																}
																if (local665 < var11.anInt3346) {
																	local675 += 2;
																}
																if ((local675 & var33.anInt1128) == local8.anInt1121) {
																	local8.aBoolean54 = true;
																	continue label572;
																}
															}
														}
													}
													Static8.aClass83Array1[var21++] = var11;
													local665 = Static72.anInt1643 - var11.anInt3340;
													local670 = var11.anInt3342 - Static72.anInt1643;
													if (local670 > local665) {
														local665 = local670;
													}
													local675 = Static220.anInt4646 - var11.anInt3336;
													var16 = var11.anInt3346 - Static220.anInt4646;
													if (var16 > local675) {
														var11.anInt3337 = local665 + var16;
													} else {
														var11.anInt3337 = local665 + local675;
													}
												}
											}
											while (var21 > 0) {
												local1172 = -50;
												local1057 = -1;
												@Pc(1181) Class83 local1181;
												for (local665 = 0; local665 < var21; local665++) {
													local1181 = Static8.aClass83Array1[local665];
													if (local1181.anInt3348 != Static134.anInt3026) {
														if (local1181.anInt3337 > local1172) {
															local1172 = local1181.anInt3337;
															local1057 = local665;
														} else if (local1181.anInt3337 == local1172) {
															local675 = local1181.anInt3344 - Static155.anInt3423;
															var16 = local1181.anInt3343 - Static70.anInt1623;
															var17 = Static8.aClass83Array1[local1057].anInt3344 - Static155.anInt3423;
															var18 = Static8.aClass83Array1[local1057].anInt3343 - Static70.anInt1623;
															if (local675 * local675 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1057 = local665;
															}
														}
													}
												}
												if (local1057 == -1) {
													break;
												}
												local1181 = Static8.aClass83Array1[local1057];
												local1181.anInt3348 = Static134.anInt3026;
												if (!Static139.method2457(local26, local1181.anInt3340, local1181.anInt3342, local1181.anInt3336, local1181.anInt3346, local1181.aClass5_5.method3680())) {
													local1181.aClass5_5.method3679(local1181.anInt3341, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local1181.anInt3344 - Static155.anInt3423, local1181.anInt3338 - Static115.anInt2533, local1181.anInt3343 - Static70.anInt1623, local1181.aLong118);
												}
												for (local675 = local1181.anInt3340; local675 <= local1181.anInt3342; local675++) {
													for (var16 = local1181.anInt3336; var16 <= local1181.anInt3346; var16++) {
														@Pc(1305) Class1_Sub7 local1305 = local30[local675][var16];
														if (local1305.anInt1128 != 0) {
															Static71.aClass105_10.method3119(local1305);
														} else if ((local675 != local17 || var16 != local20) && local1305.aBoolean55) {
															Static71.aClass105_10.method3119(local1305);
														}
													}
												}
											}
											if (!local8.aBoolean54) {
												break;
											}
										} catch (@Pc(1343) Exception local1343) {
											local8.aBoolean54 = false;
											break;
										}
									}
								} while (!local8.aBoolean55);
							} while (local8.anInt1128 != 0);
							if (local17 > Static72.anInt1643 || local17 <= Static163.anInt3523) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean55);
						if (local17 < Static72.anInt1643 || local17 >= Static41.anInt972 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean55);
					if (local20 > Static220.anInt4646 || local20 <= Static127.anInt2831) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean55);
				if (local20 < Static220.anInt4646 || local20 >= Static230.anInt4880 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean55);
			local8.aBoolean55 = false;
			Static66.anInt1485--;
			@Pc(1447) Class115 local1447 = local8.aClass115_1;
			if (local1447 != null && local1447.anInt4452 != 0) {
				if (local1447.aClass5_7 != null) {
					local1447.aClass5_7.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local1447.anInt4450 - Static155.anInt3423, local1447.anInt4441 - Static115.anInt2533 - local1447.anInt4452, local1447.anInt4443 - Static70.anInt1623, local1447.aLong161);
				}
				if (local1447.aClass5_6 != null) {
					local1447.aClass5_6.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local1447.anInt4450 - Static155.anInt3423, local1447.anInt4441 - Static115.anInt2533 - local1447.anInt4452, local1447.anInt4443 - Static70.anInt1623, local1447.aLong161);
				}
				if (local1447.aClass5_8 != null) {
					local1447.aClass5_8.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local1447.anInt4450 - Static155.anInt3423, local1447.anInt4441 - Static115.anInt2533 - local1447.anInt4452, local1447.anInt4443 - Static70.anInt1623, local1447.aLong161);
				}
			}
			if (local8.anInt1133 != 0) {
				@Pc(1542) Class65 local1542 = local8.aClass65_1;
				if (local1542 != null && !Static20.method447(local26, local17, local20, local1542.aClass5_3.method3680())) {
					if ((local1542.anInt2433 & local8.anInt1133) != 0) {
						local1542.aClass5_3.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local1542.anInt2432 + local1542.anInt2426 - Static155.anInt3423, local1542.anInt2425 - Static115.anInt2533, local1542.anInt2434 + local1542.anInt2428 - Static70.anInt1623, local1542.aLong85);
					} else if (local1542.anInt2433 == 256) {
						local270 = local1542.anInt2432 - Static155.anInt3423;
						local1172 = local1542.anInt2425 - Static115.anInt2533;
						local1057 = local1542.anInt2434 - Static70.anInt1623;
						local665 = local1542.anInt2431;
						if (local665 == 1 || local665 == 2) {
							local670 = -local270;
						} else {
							local670 = local270;
						}
						if (local665 == 2 || local665 == 3) {
							local675 = -local1057;
						} else {
							local675 = local1057;
						}
						if (local675 >= local670) {
							local1542.aClass5_3.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local270 + local1542.anInt2426, local1172, local1057 + local1542.anInt2428, local1542.aLong85);
						} else if (local1542.aClass5_4 != null) {
							local1542.aClass5_4.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local270, local1172, local1057, local1542.aLong85);
						}
					}
				}
				local999 = local8.aClass62_1;
				if (local999 != null) {
					if ((local999.anInt2396 & local8.anInt1133) != 0 && !Static114.method1907(local26, local17, local20, local999.anInt2396)) {
						local999.aClass5_1.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local999.anInt2407 - Static155.anInt3423, local999.anInt2404 - Static115.anInt2533, local999.anInt2400 - Static70.anInt1623, local999.aLong84);
					}
					if ((local999.anInt2403 & local8.anInt1133) != 0 && !Static114.method1907(local26, local17, local20, local999.anInt2403)) {
						local999.aClass5_2.method3679(0, Static116.anInt1300, Static157.anInt3436, Static15.anInt355, Static123.anInt2715, local999.anInt2407 - Static155.anInt3423, local999.anInt2404 - Static115.anInt2533, local999.anInt2400 - Static70.anInt1623, local999.aLong84);
					}
				}
			}
			@Pc(1762) Class1_Sub7 local1762;
			if (local23 < Static174.anInt3861 - 1) {
				local1762 = Static22.aClass1_Sub7ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1762 != null && local1762.aBoolean55) {
					Static71.aClass105_10.method3119(local1762);
				}
			}
			if (local17 < Static72.anInt1643) {
				local1762 = local30[local17 + 1][local20];
				if (local1762 != null && local1762.aBoolean55) {
					Static71.aClass105_10.method3119(local1762);
				}
			}
			if (local20 < Static220.anInt4646) {
				local1762 = local30[local17][local20 + 1];
				if (local1762 != null && local1762.aBoolean55) {
					Static71.aClass105_10.method3119(local1762);
				}
			}
			if (local17 > Static72.anInt1643) {
				local1762 = local30[local17 - 1][local20];
				if (local1762 != null && local1762.aBoolean55) {
					Static71.aClass105_10.method3119(local1762);
				}
			}
			if (local20 > Static220.anInt4646) {
				local1762 = local30[local17][local20 - 1];
				if (local1762 != null && local1762.aBoolean55) {
					Static71.aClass105_10.method3119(local1762);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public static void method2677() {
		Static4.method69();
		Static60.method1055();
		Static202.method3330();
		Static79.method1380();
		Static213.method3543();
		Static65.method1117();
		Static29.method530();
		Static160.method2699();
		Static172.method2986();
		Static217.method3598();
		Static211.method3498();
		Static213.method3546();
		Static31.method542();
		Static39.method700();
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	public static void method2679() {
		Static22.aClass53_4.method1498();
		Static144.aClass53_23.method1498();
	}
}
