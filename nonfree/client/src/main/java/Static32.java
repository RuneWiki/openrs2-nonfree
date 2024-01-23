import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt604;

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "[Lclient!sc;")
	public static Class107[] aClass107Array3;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!sc;")
	public static Class107 aClass107_207 = Static231.method3737("<col=ffff00>");

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_208 = Static231.method3737("null");

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V")
	public static void method601() {
		while (true) {
			if (Static194.aClass1_Sub26_Sub1_3.method3008(Static24.anInt450) >= 27) {
				@Pc(23) int local23 = Static194.aClass1_Sub26_Sub1_3.method3007(15);
				if (local23 != 32767) {
					@Pc(28) boolean local28 = false;
					if (Static33.aClass5_Sub5_Sub2Array1[local23] == null) {
						Static33.aClass5_Sub5_Sub2Array1[local23] = new Class5_Sub5_Sub2();
						local28 = true;
					}
					@Pc(44) Class5_Sub5_Sub2 local44 = Static33.aClass5_Sub5_Sub2Array1[local23];
					Static37.anIntArray82[Static189.anInt4168++] = local23;
					local44.anInt3009 = Static128.anInt2802;
					@Pc(60) int local60 = Static194.aClass1_Sub26_Sub1_3.method3007(5);
					@Pc(67) int local67 = Static71.anIntArray150[Static194.aClass1_Sub26_Sub1_3.method3007(3)];
					if (local60 > 15) {
						local60 -= 32;
					}
					if (local28) {
						local44.anInt2994 = local44.anInt3040 = local67;
					}
					@Pc(86) int local86 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
					@Pc(91) int local91 = Static194.aClass1_Sub26_Sub1_3.method3007(5);
					@Pc(96) int local96 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
					if (local91 > 15) {
						local91 -= 32;
					}
					if (local96 == 1) {
						Static12.anIntArray35[Static189.anInt4167++] = local23;
					}
					local44.aClass30_1 = Static139.method2340(Static194.aClass1_Sub26_Sub1_3.method3007(14));
					local44.anInt3004 = local44.aClass30_1.anInt979;
					local44.anInt3035 = local44.aClass30_1.anInt967;
					local44.anInt3022 = local44.aClass30_1.anInt973;
					local44.anInt3052 = local44.aClass30_1.anInt992;
					local44.anInt3037 = local44.aClass30_1.anInt977;
					local44.anInt3007 = local44.aClass30_1.anInt985;
					local44.anInt3020 = local44.aClass30_1.anInt983;
					local44.anInt2997 = local44.aClass30_1.anInt961;
					local44.anInt3030 = local44.aClass30_1.anInt957;
					if (local44.anInt3004 == 0) {
						local44.anInt3040 = 0;
					}
					local44.method2311(local91 + Static204.aClass5_Sub5_Sub1_2.anIntArray256[0], local86 == 1, local60 + Static204.aClass5_Sub5_Sub1_2.anIntArray260[0]);
					if (local44.aClass30_1.method868()) {
						Static194.method3159(null, local44, null, 0, local44.anIntArray260[0], Static191.anInt4237, local44.anIntArray256[0]);
					}
					continue;
				}
			}
			Static194.aClass1_Sub26_Sub1_3.method3001();
			return;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)Lclient!d;")
	public static Class1_Sub2_Sub6 method602(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(18) Class1_Sub2_Sub6 local18 = (Class1_Sub2_Sub6) Static230.aClass120_22.method3564(); local18 != null; local18 = (Class1_Sub2_Sub6) Static230.aClass120_22.method3561()) {
			if (local18.aBoolean69 && local18.method695(arg1, arg0)) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!fa;Z)V")
	public static void method603(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) boolean arg1) {
		Static2.aClass120_1.method3567(arg0);
		while (true) {
			@Pc(8) Class1_Sub9 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub9[][] local30;
			@Pc(47) Class1_Sub9 local47;
			@Pc(270) int local270;
			@Pc(665) int local665;
			@Pc(670) int local670;
			@Pc(675) int local675;
			@Pc(999) Class97 local999;
			@Pc(1172) int local1172;
			@Pc(1057) int local1057;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class99 var11;
										@Pc(678) int var16;
										@Pc(687) int var17;
										@Pc(699) int var18;
										@Pc(421) int var21;
										@Pc(308) boolean var22;
										@Pc(880) Class1_Sub9 var33;
										while (true) {
											do {
												local8 = (Class1_Sub9) Static2.aClass120_1.method3566();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean127);
											local17 = local8.anInt1405;
											local20 = local8.anInt1408;
											local23 = local8.anInt1418;
											local26 = local8.anInt1410;
											local30 = Static174.aClass1_Sub9ArrayArrayArray2[local23];
											if (!local8.aBoolean126) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static174.aClass1_Sub9ArrayArrayArray2[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean127) {
														continue;
													}
												}
												if (local17 <= Static153.anInt3385 && local17 > Static19.anInt389) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean127 && (local47.aBoolean126 || (local8.anInt1414 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static153.anInt3385 && local17 < Static10.anInt282 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean127 && (local47.aBoolean126 || (local8.anInt1414 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static175.anInt3799 && local20 > Static194.anInt4294) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean127 && (local47.aBoolean126 || (local8.anInt1414 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static175.anInt3799 && local20 < Static178.anInt3878 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean127 && (local47.aBoolean126 || (local8.anInt1414 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean126 = false;
											if (local8.aClass1_Sub9_1 != null) {
												local47 = local8.aClass1_Sub9_1;
												if (local47.aClass117_1 == null) {
													if (local47.aClass49_1 != null) {
														if (Static178.method2833(0, local17, local20)) {
															Static63.method1197(local47.aClass49_1, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, true);
														} else {
															Static63.method1197(local47.aClass49_1, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, false);
														}
													}
												} else if (Static178.method2833(0, local17, local20)) {
													Static33.method630(local47.aClass117_1, 0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, true);
												} else {
													Static33.method630(local47.aClass117_1, 0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, false);
												}
												@Pc(244) Class97 local244 = local47.aClass97_1;
												if (local244 != null) {
													local244.aClass5_8.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local244.anInt3715 - Static95.anInt2063, local244.anInt3718 - Static156.anInt3421, local244.anInt3719 - Static15.anInt343, local244.aLong136);
												}
												for (local270 = 0; local270 < local47.anInt1416; local270++) {
													var11 = local47.aClass99Array2[local270];
													if (var11 != null) {
														var11.aClass5_10.method2300(var11.anInt3809, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, var11.anInt3803 - Static95.anInt2063, var11.anInt3802 - Static156.anInt3421, var11.anInt3815 - Static15.anInt343, var11.aLong140);
													}
												}
											}
											var22 = false;
											if (local8.aClass117_1 == null) {
												if (local8.aClass49_1 != null) {
													if (Static178.method2833(local26, local17, local20)) {
														Static63.method1197(local8.aClass49_1, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, true);
													} else {
														var22 = true;
														Static63.method1197(local8.aClass49_1, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, false);
													}
												}
											} else if (Static178.method2833(local26, local17, local20)) {
												Static33.method630(local8.aClass117_1, local26, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, true);
											} else {
												var22 = true;
												if (local8.aClass117_1.anInt4433 != 12345678 || Static231.aBoolean446 && local23 <= Static199.anInt4325) {
													Static33.method630(local8.aClass117_1, local26, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local17, local20, false);
												}
											}
											if (var22) {
												@Pc(388) Class40 local388 = local8.aClass40_1;
												if (local388 != null && (local388.aLong49 & 0x80000000L) != 0L) {
													local388.aClass5_1.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local388.anInt1529 - Static95.anInt2063, local388.anInt1526 - Static156.anInt3421, local388.anInt1528 - Static15.anInt343, local388.aLong49);
												}
											}
											var21 = 0;
											local270 = 0;
											@Pc(426) Class97 local426 = local8.aClass97_1;
											@Pc(429) Class46 local429 = local8.aClass46_1;
											if (local426 != null || local429 != null) {
												if (Static153.anInt3385 == local17) {
													var21++;
												} else if (Static153.anInt3385 < local17) {
													var21 += 2;
												}
												if (Static175.anInt3799 == local20) {
													var21 += 3;
												} else if (Static175.anInt3799 > local20) {
													var21 += 6;
												}
												local270 = Static177.anIntArray334[var21];
												local8.anInt1413 = Static188.anIntArray346[var21];
											}
											if (local426 != null) {
												if ((local426.anInt3712 & Static154.anIntArray297[var21]) == 0) {
													local8.anInt1417 = 0;
												} else if (local426.anInt3712 == 16) {
													local8.anInt1417 = 3;
													local8.anInt1411 = Static187.anIntArray344[var21];
													local8.anInt1415 = 3 - local8.anInt1411;
												} else if (local426.anInt3712 == 32) {
													local8.anInt1417 = 6;
													local8.anInt1411 = Static34.anIntArray78[var21];
													local8.anInt1415 = 6 - local8.anInt1411;
												} else if (local426.anInt3712 == 64) {
													local8.anInt1417 = 12;
													local8.anInt1411 = Static49.anIntArray123[var21];
													local8.anInt1415 = 12 - local8.anInt1411;
												} else {
													local8.anInt1417 = 9;
													local8.anInt1411 = Static177.anIntArray335[var21];
													local8.anInt1415 = 9 - local8.anInt1411;
												}
												if ((local426.anInt3712 & local270) != 0 && !Static150.method2473(local26, local17, local20, local426.anInt3712)) {
													local426.aClass5_8.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local426.anInt3715 - Static95.anInt2063, local426.anInt3718 - Static156.anInt3421, local426.anInt3719 - Static15.anInt343, local426.aLong136);
												}
												if ((local426.anInt3713 & local270) != 0 && !Static150.method2473(local26, local17, local20, local426.anInt3713)) {
													local426.aClass5_9.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local426.anInt3715 - Static95.anInt2063, local426.anInt3718 - Static156.anInt3421, local426.anInt3719 - Static15.anInt343, local426.aLong136);
												}
											}
											if (local429 != null && !Static123.method2087(local26, local17, local20, local429.aClass5_3.method2297())) {
												if ((local429.anInt1685 & local270) != 0) {
													local429.aClass5_3.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local429.anInt1688 + local429.anInt1692 - Static95.anInt2063, local429.anInt1689 - Static156.anInt3421, local429.anInt1698 + local429.anInt1697 - Static15.anInt343, local429.aLong57);
												} else if (local429.anInt1685 == 256) {
													local665 = local429.anInt1688 - Static95.anInt2063;
													local670 = local429.anInt1689 - Static156.anInt3421;
													local675 = local429.anInt1698 - Static15.anInt343;
													var16 = local429.anInt1687;
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
														local429.aClass5_3.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local665 + local429.anInt1692, local670, local675 + local429.anInt1697, local429.aLong57);
													} else if (local429.aClass5_2 != null) {
														local429.aClass5_2.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local665, local670, local675, local429.aLong57);
													}
												}
											}
											if (var22) {
												@Pc(746) Class40 local746 = local8.aClass40_1;
												if (local746 != null && (local746.aLong49 & 0x80000000L) == 0L) {
													local746.aClass5_1.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local746.anInt1529 - Static95.anInt2063, local746.anInt1526 - Static156.anInt3421, local746.anInt1528 - Static15.anInt343, local746.aLong49);
												}
												@Pc(780) Class47 local780 = local8.aClass47_1;
												if (local780 != null && local780.anInt1705 == 0) {
													if (local780.aClass5_4 != null) {
														local780.aClass5_4.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local780.anInt1708 - Static95.anInt2063, local780.anInt1712 - Static156.anInt3421, local780.anInt1700 - Static15.anInt343, local780.aLong58);
													}
													if (local780.aClass5_5 != null) {
														local780.aClass5_5.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local780.anInt1708 - Static95.anInt2063, local780.anInt1712 - Static156.anInt3421, local780.anInt1700 - Static15.anInt343, local780.aLong58);
													}
													if (local780.aClass5_6 != null) {
														local780.aClass5_6.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local780.anInt1708 - Static95.anInt2063, local780.anInt1712 - Static156.anInt3421, local780.anInt1700 - Static15.anInt343, local780.aLong58);
													}
												}
											}
											local665 = local8.anInt1414;
											if (local665 != 0) {
												if (local17 < Static153.anInt3385 && (local665 & 0x4) != 0) {
													var33 = local30[local17 + 1][local20];
													if (var33 != null && var33.aBoolean127) {
														Static2.aClass120_1.method3567(var33);
													}
												}
												if (local20 < Static175.anInt3799 && (local665 & 0x2) != 0) {
													var33 = local30[local17][local20 + 1];
													if (var33 != null && var33.aBoolean127) {
														Static2.aClass120_1.method3567(var33);
													}
												}
												if (local17 > Static153.anInt3385 && (local665 & 0x1) != 0) {
													var33 = local30[local17 - 1][local20];
													if (var33 != null && var33.aBoolean127) {
														Static2.aClass120_1.method3567(var33);
													}
												}
												if (local20 > Static175.anInt3799 && (local665 & 0x8) != 0) {
													var33 = local30[local17][local20 - 1];
													if (var33 != null && var33.aBoolean127) {
														Static2.aClass120_1.method3567(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1417 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1416; var21++) {
												if (local8.aClass99Array2[var21].anInt3820 != Static86.anInt1909 && (local8.anIntArray125[var21] & local8.anInt1417) == local8.anInt1411) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local999 = local8.aClass97_1;
												if (!Static150.method2473(local26, local17, local20, local999.anInt3712)) {
													local999.aClass5_8.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local999.anInt3715 - Static95.anInt2063, local999.anInt3718 - Static156.anInt3421, local999.anInt3719 - Static15.anInt343, local999.aLong136);
												}
												local8.anInt1417 = 0;
											}
										}
										if (!local8.aBoolean125) {
											break;
										}
										try {
											@Pc(1037) int local1037 = local8.anInt1416;
											local8.aBoolean125 = false;
											var21 = 0;
											label572: for (local270 = 0; local270 < local1037; local270++) {
												var11 = local8.aClass99Array2[local270];
												if (var11.anInt3820 != Static86.anInt1909) {
													for (local1057 = var11.anInt3819; local1057 <= var11.anInt3807; local1057++) {
														for (local665 = var11.anInt3808; local665 <= var11.anInt3811; local665++) {
															var33 = local30[local1057][local665];
															if (var33.aBoolean126) {
																local8.aBoolean125 = true;
																continue label572;
															}
															if (var33.anInt1417 != 0) {
																local675 = 0;
																if (local1057 > var11.anInt3819) {
																	local675++;
																}
																if (local1057 < var11.anInt3807) {
																	local675 += 4;
																}
																if (local665 > var11.anInt3808) {
																	local675 += 8;
																}
																if (local665 < var11.anInt3811) {
																	local675 += 2;
																}
																if ((local675 & var33.anInt1417) == local8.anInt1415) {
																	local8.aBoolean125 = true;
																	continue label572;
																}
															}
														}
													}
													Static172.aClass99Array3[var21++] = var11;
													local665 = Static153.anInt3385 - var11.anInt3819;
													local670 = var11.anInt3807 - Static153.anInt3385;
													if (local670 > local665) {
														local665 = local670;
													}
													local675 = Static175.anInt3799 - var11.anInt3808;
													var16 = var11.anInt3811 - Static175.anInt3799;
													if (var16 > local675) {
														var11.anInt3818 = local665 + var16;
													} else {
														var11.anInt3818 = local665 + local675;
													}
												}
											}
											while (var21 > 0) {
												local1172 = -50;
												local1057 = -1;
												@Pc(1181) Class99 local1181;
												for (local665 = 0; local665 < var21; local665++) {
													local1181 = Static172.aClass99Array3[local665];
													if (local1181.anInt3820 != Static86.anInt1909) {
														if (local1181.anInt3818 > local1172) {
															local1172 = local1181.anInt3818;
															local1057 = local665;
														} else if (local1181.anInt3818 == local1172) {
															local675 = local1181.anInt3803 - Static95.anInt2063;
															var16 = local1181.anInt3815 - Static15.anInt343;
															var17 = Static172.aClass99Array3[local1057].anInt3803 - Static95.anInt2063;
															var18 = Static172.aClass99Array3[local1057].anInt3815 - Static15.anInt343;
															if (local675 * local675 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1057 = local665;
															}
														}
													}
												}
												if (local1057 == -1) {
													break;
												}
												local1181 = Static172.aClass99Array3[local1057];
												local1181.anInt3820 = Static86.anInt1909;
												if (!Static23.method422(local26, local1181.anInt3819, local1181.anInt3807, local1181.anInt3808, local1181.anInt3811, local1181.aClass5_10.method2297())) {
													local1181.aClass5_10.method2300(local1181.anInt3809, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local1181.anInt3803 - Static95.anInt2063, local1181.anInt3802 - Static156.anInt3421, local1181.anInt3815 - Static15.anInt343, local1181.aLong140);
												}
												for (local675 = local1181.anInt3819; local675 <= local1181.anInt3807; local675++) {
													for (var16 = local1181.anInt3808; var16 <= local1181.anInt3811; var16++) {
														@Pc(1305) Class1_Sub9 local1305 = local30[local675][var16];
														if (local1305.anInt1417 != 0) {
															Static2.aClass120_1.method3567(local1305);
														} else if ((local675 != local17 || var16 != local20) && local1305.aBoolean127) {
															Static2.aClass120_1.method3567(local1305);
														}
													}
												}
											}
											if (!local8.aBoolean125) {
												break;
											}
										} catch (@Pc(1343) Exception local1343) {
											local8.aBoolean125 = false;
											break;
										}
									}
								} while (!local8.aBoolean127);
							} while (local8.anInt1417 != 0);
							if (local17 > Static153.anInt3385 || local17 <= Static19.anInt389) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean127);
						if (local17 < Static153.anInt3385 || local17 >= Static10.anInt282 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean127);
					if (local20 > Static175.anInt3799 || local20 <= Static194.anInt4294) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean127);
				if (local20 < Static175.anInt3799 || local20 >= Static178.anInt3878 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean127);
			local8.aBoolean127 = false;
			Static2.anInt116--;
			@Pc(1447) Class47 local1447 = local8.aClass47_1;
			if (local1447 != null && local1447.anInt1705 != 0) {
				if (local1447.aClass5_4 != null) {
					local1447.aClass5_4.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local1447.anInt1708 - Static95.anInt2063, local1447.anInt1712 - Static156.anInt3421 - local1447.anInt1705, local1447.anInt1700 - Static15.anInt343, local1447.aLong58);
				}
				if (local1447.aClass5_5 != null) {
					local1447.aClass5_5.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local1447.anInt1708 - Static95.anInt2063, local1447.anInt1712 - Static156.anInt3421 - local1447.anInt1705, local1447.anInt1700 - Static15.anInt343, local1447.aLong58);
				}
				if (local1447.aClass5_6 != null) {
					local1447.aClass5_6.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local1447.anInt1708 - Static95.anInt2063, local1447.anInt1712 - Static156.anInt3421 - local1447.anInt1705, local1447.anInt1700 - Static15.anInt343, local1447.aLong58);
				}
			}
			if (local8.anInt1413 != 0) {
				@Pc(1542) Class46 local1542 = local8.aClass46_1;
				if (local1542 != null && !Static123.method2087(local26, local17, local20, local1542.aClass5_3.method2297())) {
					if ((local1542.anInt1685 & local8.anInt1413) != 0) {
						local1542.aClass5_3.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local1542.anInt1688 + local1542.anInt1692 - Static95.anInt2063, local1542.anInt1689 - Static156.anInt3421, local1542.anInt1698 + local1542.anInt1697 - Static15.anInt343, local1542.aLong57);
					} else if (local1542.anInt1685 == 256) {
						local270 = local1542.anInt1688 - Static95.anInt2063;
						local1172 = local1542.anInt1689 - Static156.anInt3421;
						local1057 = local1542.anInt1698 - Static15.anInt343;
						local665 = local1542.anInt1687;
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
							local1542.aClass5_3.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local270 + local1542.anInt1692, local1172, local1057 + local1542.anInt1697, local1542.aLong57);
						} else if (local1542.aClass5_2 != null) {
							local1542.aClass5_2.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local270, local1172, local1057, local1542.aLong57);
						}
					}
				}
				local999 = local8.aClass97_1;
				if (local999 != null) {
					if ((local999.anInt3713 & local8.anInt1413) != 0 && !Static150.method2473(local26, local17, local20, local999.anInt3713)) {
						local999.aClass5_9.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local999.anInt3715 - Static95.anInt2063, local999.anInt3718 - Static156.anInt3421, local999.anInt3719 - Static15.anInt343, local999.aLong136);
					}
					if ((local999.anInt3712 & local8.anInt1413) != 0 && !Static150.method2473(local26, local17, local20, local999.anInt3712)) {
						local999.aClass5_8.method2300(0, Static212.anInt4563, Static92.anInt1984, Static143.anInt3147, Static51.anInt3008, local999.anInt3715 - Static95.anInt2063, local999.anInt3718 - Static156.anInt3421, local999.anInt3719 - Static15.anInt343, local999.aLong136);
					}
				}
			}
			@Pc(1762) Class1_Sub9 local1762;
			if (local23 < Static11.anInt296 - 1) {
				local1762 = Static174.aClass1_Sub9ArrayArrayArray2[local23 + 1][local17][local20];
				if (local1762 != null && local1762.aBoolean127) {
					Static2.aClass120_1.method3567(local1762);
				}
			}
			if (local17 < Static153.anInt3385) {
				local1762 = local30[local17 + 1][local20];
				if (local1762 != null && local1762.aBoolean127) {
					Static2.aClass120_1.method3567(local1762);
				}
			}
			if (local20 < Static175.anInt3799) {
				local1762 = local30[local17][local20 + 1];
				if (local1762 != null && local1762.aBoolean127) {
					Static2.aClass120_1.method3567(local1762);
				}
			}
			if (local17 > Static153.anInt3385) {
				local1762 = local30[local17 - 1][local20];
				if (local1762 != null && local1762.aBoolean127) {
					Static2.aClass120_1.method3567(local1762);
				}
			}
			if (local20 > Static175.anInt3799) {
				local1762 = local30[local17][local20 - 1];
				if (local1762 != null && local1762.aBoolean127) {
					Static2.aClass120_1.method3567(local1762);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!o;)Lclient!o;")
	public static Class86 method604(@OriginalArg(1) Class86 arg0) {
		if (arg0.anInt3225 != -1) {
			return Static13.method333(arg0.anInt3225);
		}
		@Pc(19) int local19 = arg0.anInt3239 >>> 16;
		for (@Pc(26) Class1_Sub11 local26 = (Class1_Sub11) Static154.aClass50_18.method1358(); local26 != null; local26 = (Class1_Sub11) Static154.aClass50_18.method1361()) {
			if (local19 == local26.anInt1575) {
				return Static13.method333((int) local26.aLong177);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
	public static void method605() {
		@Pc(1) Object local1 = Static113.anObject1;
		synchronized (Static113.anObject1) {
			if (Static98.anInt2145 != 0) {
				Static98.anInt2145 = 1;
				try {
					Static113.anObject1.wait();
				} catch (@Pc(14) InterruptedException local14) {
				}
			}
		}
	}
}
