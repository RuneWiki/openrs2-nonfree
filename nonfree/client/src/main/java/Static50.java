import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_67 = new Class123(91, 2);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1137() {
		@Pc(1) int local1 = Static95.anInt2186;
		@Pc(3) int[] local3 = Static178.anIntArray542;
		@Pc(11) int local11 = Static29.aBoolean42 ? local1 : local1 + Static136.anInt2887;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local13 - local1]];
			}
			if (local23.anInt6604 >= 0) {
				@Pc(39) int local39 = local23.method5521();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7202 & 0x7F) == 0 && (local23.anInt7207 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7202 & 0x7F) == 64 && (local23.anInt7207 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class3_Sub2_Sub1_Sub2 && local23.aClass6_Sub34_3 != null && Static66.anInt1741 >= local23.aClass6_Sub34_3.anInt6222 && Static66.anInt1741 < local23.aClass6_Sub34_3.anInt6215) {
					((Class3_Sub2_Sub1_Sub2) local23).aBoolean424 = false;
				}
				local23.anInt7208 = Static221.method3331(local23.aByte103, local23.anInt7207, local23.anInt7202);
				Static411.method6066(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1141() {
		if (Static149.anInt3065 == 5) {
			Static149.anInt3065 = 6;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ts;)Lclient!ts;")
	public static Class239 method1142(@OriginalArg(0) Class239 arg0) {
		@Pc(4) int local4 = method1150(arg0).method1225();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static121.method2092(arg0.anInt6895);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ts;IIIIIIIII)V")
	public static void method1143(@OriginalArg(0) Class239[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class239 local6 = arg0[local1];
			if (local6 != null && local6.anInt6895 == arg1) {
				@Pc(17) int local17 = local6.anInt6922 + arg6;
				@Pc(22) int local22 = local6.anInt6905 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6900 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6898;
					@Pc(45) int local45 = local22 + local6.anInt6899;
					if (local6.anInt6900 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6900 == 0 || local6.aBoolean435 || method1150(local6).anInt1492 != 0 || local6 == Static97.aClass239_3 || local6.anInt6911 == Static134.anInt2828) {
					if (!method1153(local6)) {
						if (local6 == Static240.aClass239_8) {
							Static14.aBoolean19 = true;
							Static329.anInt5687 = local17;
							Static272.anInt4879 = local22;
						}
						if (local6.aBoolean449 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean443 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class6_Sub42 local148 = (Class6_Sub42) Static376.aClass244_40.method5976(); local148 != null; local148 = (Class6_Sub42) Static376.aClass244_40.method5964()) {
									if (local148.aBoolean472) {
										local148.method6525();
										local148.aClass239_13.aBoolean448 = false;
									}
								}
								if (Static414.anInt7039 == 0) {
									Static240.aClass239_8 = null;
									Static97.aClass239_3 = null;
								}
								Static378.anInt6770 = 0;
								Static442.aBoolean492 = false;
								Static339.aBoolean367 = false;
								if (!Static250.aBoolean294) {
									Static41.method963();
								}
							}
							@Pc(204) boolean local204;
							if (Static186.aClass50_1.method1436() >= local28 && Static186.aClass50_1.method1446() >= local30 && Static186.aClass50_1.method1436() < local32 && Static186.aClass50_1.method1446() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static174.aBoolean224 && local204) {
								if (local6.anInt6927 >= 0) {
									Static327.anInt5630 = local6.anInt6927;
								} else if (local6.aBoolean443) {
									Static327.anInt5630 = -1;
								}
							}
							if (!Static250.aBoolean294 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static356.method5277(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static186.aClass50_1.method1442() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class6_Sub33 local263 = (Class6_Sub33) Static124.aClass244_13.method5976();
							if (local263 != null && local263.method5293() == 0 && local263.method5290() >= local28 && local263.method5287() >= local30 && local263.method5290() < local32 && local263.method5287() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray86 != null) {
								for (local296 = 0; local296 < local6.aByteArray86.length; local296++) {
									if (Static54.aClass187_1.method4602(local6.aByteArray86[local296])) {
										if (local6.anIntArray475 == null || Static66.anInt1741 >= local6.anIntArray475[local296]) {
											@Pc(328) byte local328 = local6.aByteArray87[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static54.aClass187_1.method4602(86) && !Static54.aClass187_1.method4602(82) && !Static54.aClass187_1.method4602(81)) && ((local328 & 0x2) == 0 || Static54.aClass187_1.method4602(86)) && ((local328 & 0x1) == 0 || Static54.aClass187_1.method4602(82)) && ((local328 & 0x4) == 0 || Static54.aClass187_1.method4602(81))) {
												if (local296 < 10) {
													Static115.method2011(-1, local6.anInt6908, "", local296 + 1);
												} else if (local296 == 10) {
													Static54.method1224();
													@Pc(399) Class6_Sub8 local399 = method1150(local6);
													Static412.method6083(local6, local399.anInt1488, local399.method1216());
													Static104.aString16 = Static39.method947(local6);
													if (Static104.aString16 == null) {
														Static104.aString16 = "Null";
													}
													Static289.aString36 = local6.aString60 + "<col=ffffff>";
												}
												local430 = local6.anIntArray476[local296];
												if (local6.anIntArray475 == null) {
													local6.anIntArray475 = new int[local6.aByteArray86.length];
												}
												if (local430 == 0) {
													local6.anIntArray475[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray475[local296] = Static66.anInt1741 + local430;
												}
											}
										}
									} else if (local6.anIntArray475 != null) {
										local6.anIntArray475[local296] = 0;
									}
								}
							}
							if (local258) {
								Static235.method3636(local263.method5287() - local22, local6, local263.method5290() - local17);
							}
							if (Static240.aClass239_8 != null && Static240.aClass239_8 != local6 && local204 && method1150(local6).method1226()) {
								Static158.aClass239_5 = local6;
							}
							if (local6 == Static97.aClass239_3) {
								Static335.aBoolean364 = true;
								Static312.anInt5429 = local17;
								Static97.anInt2205 = local22;
							}
							if (local6.aBoolean435 || local6.anInt6911 != 0) {
								@Pc(515) Class6_Sub42 local515;
								if (local204 && Static43.anInt1190 != 0 && local6.anObjectArray16 != null) {
									local515 = new Class6_Sub42();
									local515.aBoolean472 = true;
									local515.aClass239_13 = local6;
									local515.anInt7474 = Static43.anInt1190;
									local515.anObjectArray36 = local6.anObjectArray16;
									Static376.aClass244_40.method5966(local515);
								}
								if (Static240.aClass239_8 != null || Static250.aBoolean294 || local6.anInt6911 != Static82.anInt5148 && Static378.anInt6770 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6911 != 0) {
									if (local6.anInt6911 == Static267.anInt4852 || local6.anInt6911 == Static71.anInt1875) {
										Static433.aClass239_15 = local6;
										if (Static249.aClass107_1 != null) {
											Static249.aClass107_1.method2643(local6.anInt6899, Static126.aClass66_5);
										}
										if (local6.anInt6911 == Static267.anInt4852) {
											if (!Static250.aBoolean294 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static171.method2817(arg8, Static126.aClass66_5, arg9);
												for (@Pc(598) Class57_Sub3 local598 = (Class57_Sub3) Static328.aClass111_6.method2688(); local598 != null; local598 = (Class57_Sub3) Static328.aClass111_6.method2690()) {
													if (arg8 >= local598.anInt3649 && arg8 < local598.anInt3648 && arg9 >= local598.anInt3650 && arg9 < local598.anInt3645) {
														Static41.method963();
														Static308.method4525(local598.aClass3_Sub2_Sub1_1);
													}
												}
											}
											Static272.method4103(local6, local17, local22);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6911 == Static134.anInt2828) {
										if (local6.method5734(Static126.aClass66_5) == null || Static420.anInt7505 != 0 && Static420.anInt7505 != 3 || Static250.aBoolean294 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray479[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray482[local670]) {
											continue;
										}
										local296 -= local6.anInt6898 / 2;
										local670 -= local6.anInt6899 / 2;
										if (Static429.anInt7656 == 4) {
											local709 = (int) Static265.aFloat51 & 0x3FFF;
										} else {
											local709 = (int) Static265.aFloat51 + Static439.anInt418 & 0x3FFF;
										}
										@Pc(721) int local721 = Class145.anIntArray279[local709];
										@Pc(725) int local725 = Class145.anIntArray280[local709];
										if (Static429.anInt7656 != 4) {
											local721 = local721 * (Static280.anInt5012 + 256) >> 8;
											local725 = local725 * (Static280.anInt5012 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static429.anInt7656 == 4) {
											local775 = (Static261.anInt4746 >> 7) + (local754 >> 2);
											local783 = (Static202.anInt3800 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static302.aClass3_Sub2_Sub1_Sub2_2.method5521() - 1) * 64;
											local775 = (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 - local792 >> 7) + (local754 >> 2);
											local783 = (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 - local792 >> 7) - (local764 >> 2);
										}
										if (Static174.aBoolean224 && (Static405.anInt7261 & 0x40) != 0) {
											@Pc(825) Class239 local825 = Static251.method5357(Static190.anInt653, Static363.anInt6463);
											if (local825 == null) {
												Static54.method1224();
											} else {
												Static114.method4751(true, 1L, 50, Static104.aString16, local775, local6.anInt6903, " ->", local783, false, Static67.anInt1750);
											}
											continue;
										}
										if (Static4.aClass36_5 == Static24.aClass36_2) {
											Static114.method4751(true, 1L, 19, Static405.aClass267_98.method6581(Static161.anInt3239), local775, -1, "", local783, false, -1);
										}
										Static114.method4751(true, 1L, 58, Static214.aString30, local775, -1, "", local783, false, Static297.anInt5269);
										continue;
									}
									if (local6.anInt6911 == Static82.anInt5148) {
										Static396.aClass239_10 = local6;
										if (local204) {
											Static442.aBoolean492 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method5290() - local17 - local6.anInt6898 / 2) * 2.0D / (double) Static7.aFloat8);
											local670 = (int) -((double) (local263.method5287() - local22 - local6.anInt6899 / 2) * 2.0D / (double) Static7.aFloat8);
											local430 = Static226.anInt5617 + local296 + Static7.anInt1139;
											local709 = Static242.anInt4490 + local670 + Static7.anInt1150;
											@Pc(939) Class6_Sub2_Sub15 local939 = Static360.method5333();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method5930(local944, local709, local430);
											if (local944 != null) {
												if (Static54.aClass187_1.method4602(82) && Static291.anInt5199 > 0) {
													Static235.method3638(local944[2], local944[1], local944[0]);
													continue;
												}
												Static339.aBoolean367 = true;
												Static110.anInt6978 = local944[0];
												Static336.anInt5846 = local944[1];
												Static289.anInt5183 = local944[2];
											}
											Static378.anInt6770 = 1;
											Static125.aBoolean170 = false;
											Static428.anInt7618 = Static186.aClass50_1.method1436();
											Static263.anInt4753 = Static186.aClass50_1.method1446();
											continue;
										}
										if (local248 && Static378.anInt6770 > 0) {
											if (Static378.anInt6770 == 1 && (Static428.anInt7618 != Static186.aClass50_1.method1436() || Static263.anInt4753 != Static186.aClass50_1.method1446())) {
												Static150.anInt3123 = Static226.anInt5617;
												Static293.anInt349 = Static242.anInt4490;
												Static378.anInt6770 = 2;
											}
											if (Static378.anInt6770 == 2) {
												Static125.aBoolean170 = true;
												Static312.method4550(Static150.anInt3123 + (int) ((double) (Static428.anInt7618 - Static186.aClass50_1.method1436()) * 2.0D / (double) Static7.aFloat7));
												Static405.method5979(Static293.anInt349 - (int) ((double) (Static263.anInt4753 - Static186.aClass50_1.method1446()) * 2.0D / (double) Static7.aFloat7));
											}
											continue;
										}
										if (Static378.anInt6770 > 0 && !Static125.aBoolean170) {
											if ((Static14.anInt440 == 1 || Static141.method1131()) && Static151.anInt3129 > 2) {
												Static437.method6337(Static263.anInt4753, Static428.anInt7618);
											} else if (Static72.method1459()) {
												Static437.method6337(Static263.anInt4753, Static428.anInt7618);
											}
										}
										Static378.anInt6770 = 0;
										continue;
									}
									if (local6.anInt6911 == Static320.anInt5537) {
										if (local248) {
											Static309.method4528(local6.anInt6898, Static186.aClass50_1.method1436() - local17, local6.anInt6899, Static186.aClass50_1.method1446() - local22);
										}
										continue;
									}
									if (local6.anInt6911 == Static44.anInt1199) {
										Static97.method1810(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean440 && local258) {
									local6.aBoolean440 = true;
									if (local6.anObjectArray12 != null) {
										local515 = new Class6_Sub42();
										local515.aBoolean472 = true;
										local515.aClass239_13 = local6;
										local515.anInt7471 = local263.method5290() - local17;
										local515.anInt7474 = local263.method5287() - local22;
										local515.anObjectArray36 = local6.anObjectArray12;
										Static376.aClass244_40.method5966(local515);
									}
								}
								if (local6.aBoolean440 && local248 && local6.anObjectArray9 != null) {
									local515 = new Class6_Sub42();
									local515.aBoolean472 = true;
									local515.aClass239_13 = local6;
									local515.anInt7471 = Static186.aClass50_1.method1436() - local17;
									local515.anInt7474 = Static186.aClass50_1.method1446() - local22;
									local515.anObjectArray36 = local6.anObjectArray9;
									Static376.aClass244_40.method5966(local515);
								}
								if (local6.aBoolean440 && !local248) {
									local6.aBoolean440 = false;
									if (local6.anObjectArray23 != null) {
										local515 = new Class6_Sub42();
										local515.aBoolean472 = true;
										local515.aClass239_13 = local6;
										local515.anInt7471 = Static186.aClass50_1.method1436() - local17;
										local515.anInt7474 = Static186.aClass50_1.method1446() - local22;
										local515.anObjectArray36 = local6.anObjectArray23;
										Static409.aClass244_44.method5966(local515);
									}
								}
								if (local248 && local6.anObjectArray20 != null) {
									local515 = new Class6_Sub42();
									local515.aBoolean472 = true;
									local515.aClass239_13 = local6;
									local515.anInt7471 = Static186.aClass50_1.method1436() - local17;
									local515.anInt7474 = Static186.aClass50_1.method1446() - local22;
									local515.anObjectArray36 = local6.anObjectArray20;
									Static376.aClass244_40.method5966(local515);
								}
								if (!local6.aBoolean448 && local204) {
									local6.aBoolean448 = true;
									if (local6.anObjectArray33 != null) {
										local515 = new Class6_Sub42();
										local515.aBoolean472 = true;
										local515.aClass239_13 = local6;
										local515.anInt7471 = Static186.aClass50_1.method1436() - local17;
										local515.anInt7474 = Static186.aClass50_1.method1446() - local22;
										local515.anObjectArray36 = local6.anObjectArray33;
										Static376.aClass244_40.method5966(local515);
									}
								}
								if (local6.aBoolean448 && local204 && local6.anObjectArray5 != null) {
									local515 = new Class6_Sub42();
									local515.aBoolean472 = true;
									local515.aClass239_13 = local6;
									local515.anInt7471 = Static186.aClass50_1.method1436() - local17;
									local515.anInt7474 = Static186.aClass50_1.method1446() - local22;
									local515.anObjectArray36 = local6.anObjectArray5;
									Static376.aClass244_40.method5966(local515);
								}
								if (local6.aBoolean448 && !local204) {
									local6.aBoolean448 = false;
									if (local6.anObjectArray18 != null) {
										local515 = new Class6_Sub42();
										local515.aBoolean472 = true;
										local515.aClass239_13 = local6;
										local515.anInt7471 = Static186.aClass50_1.method1436() - local17;
										local515.anInt7474 = Static186.aClass50_1.method1446() - local22;
										local515.anObjectArray36 = local6.anObjectArray18;
										Static409.aClass244_44.method5966(local515);
									}
								}
								if (local6.anObjectArray15 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray15;
									Static17.aClass244_5.method5966(local515);
								}
								@Pc(1483) Class6_Sub42 local1483;
								if (local6.anObjectArray6 != null && Static147.anInt2996 > local6.anInt6881) {
									if (local6.anIntArray480 == null || Static147.anInt2996 - local6.anInt6881 > 32) {
										local515 = new Class6_Sub42();
										local515.aClass239_13 = local6;
										local515.anObjectArray36 = local6.anObjectArray6;
										Static376.aClass244_40.method5966(local515);
									} else {
										label678: for (local296 = local6.anInt6881; local296 < Static147.anInt2996; local296++) {
											local670 = Static442.anIntArray547[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray480.length; local430++) {
												if (local6.anIntArray480[local430] == local670) {
													local1483 = new Class6_Sub42();
													local1483.aClass239_13 = local6;
													local1483.anObjectArray36 = local6.anObjectArray6;
													Static376.aClass244_40.method5966(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6881 = Static147.anInt2996;
								}
								if (local6.anObjectArray21 != null && Static284.anInt5109 > local6.anInt6906) {
									if (local6.anIntArray478 == null || Static284.anInt5109 - local6.anInt6906 > 32) {
										local515 = new Class6_Sub42();
										local515.aClass239_13 = local6;
										local515.anObjectArray36 = local6.anObjectArray21;
										Static376.aClass244_40.method5966(local515);
									} else {
										label654: for (local296 = local6.anInt6906; local296 < Static284.anInt5109; local296++) {
											local670 = Static33.anIntArray63[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray478.length; local430++) {
												if (local6.anIntArray478[local430] == local670) {
													local1483 = new Class6_Sub42();
													local1483.aClass239_13 = local6;
													local1483.anObjectArray36 = local6.anObjectArray21;
													Static376.aClass244_40.method5966(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt6906 = Static284.anInt5109;
								}
								if (local6.anObjectArray22 != null && Static383.anInt6834 > local6.anInt6961) {
									if (local6.anIntArray474 == null || Static383.anInt6834 - local6.anInt6961 > 32) {
										local515 = new Class6_Sub42();
										local515.aClass239_13 = local6;
										local515.anObjectArray36 = local6.anObjectArray22;
										Static376.aClass244_40.method5966(local515);
									} else {
										label630: for (local296 = local6.anInt6961; local296 < Static383.anInt6834; local296++) {
											local670 = Static334.anIntArray397[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray474.length; local430++) {
												if (local6.anIntArray474[local430] == local670) {
													local1483 = new Class6_Sub42();
													local1483.aClass239_13 = local6;
													local1483.anObjectArray36 = local6.anObjectArray22;
													Static376.aClass244_40.method5966(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt6961 = Static383.anInt6834;
								}
								if (local6.anObjectArray4 != null && Static338.anInt5882 > local6.anInt6968) {
									if (local6.anIntArray477 == null || Static338.anInt5882 - local6.anInt6968 > 32) {
										local515 = new Class6_Sub42();
										local515.aClass239_13 = local6;
										local515.anObjectArray36 = local6.anObjectArray4;
										Static376.aClass244_40.method5966(local515);
									} else {
										label606: for (local296 = local6.anInt6968; local296 < Static338.anInt5882; local296++) {
											local670 = Static235.anIntArray306[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray477.length; local430++) {
												if (local6.anIntArray477[local430] == local670) {
													local1483 = new Class6_Sub42();
													local1483.aClass239_13 = local6;
													local1483.anObjectArray36 = local6.anObjectArray4;
													Static376.aClass244_40.method5966(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt6968 = Static338.anInt5882;
								}
								if (local6.anObjectArray17 != null && Static127.anInt2704 > local6.anInt6912) {
									if (local6.anIntArray481 == null || Static127.anInt2704 - local6.anInt6912 > 32) {
										local515 = new Class6_Sub42();
										local515.aClass239_13 = local6;
										local515.anObjectArray36 = local6.anObjectArray17;
										Static376.aClass244_40.method5966(local515);
									} else {
										label582: for (local296 = local6.anInt6912; local296 < Static127.anInt2704; local296++) {
											local670 = Static30.anIntArray52[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray481.length; local430++) {
												if (local6.anIntArray481[local430] == local670) {
													local1483 = new Class6_Sub42();
													local1483.aClass239_13 = local6;
													local1483.anObjectArray36 = local6.anObjectArray17;
													Static376.aClass244_40.method5966(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6912 = Static127.anInt2704;
								}
								if (Static143.anInt2940 > local6.anInt6954 && local6.anObjectArray27 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray27;
									Static376.aClass244_40.method5966(local515);
								}
								if (Static185.anInt3634 > local6.anInt6954 && local6.anObjectArray19 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray19;
									Static376.aClass244_40.method5966(local515);
								}
								if (Static32.anInt6596 > local6.anInt6954 && local6.anObjectArray7 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray7;
									Static376.aClass244_40.method5966(local515);
								}
								if (Static326.anInt5609 > local6.anInt6954 && local6.anObjectArray29 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray29;
									Static376.aClass244_40.method5966(local515);
								}
								if (Static24.anInt781 > local6.anInt6954 && local6.anObjectArray8 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray8;
									Static376.aClass244_40.method5966(local515);
								}
								local6.anInt6954 = Static144.anInt2943;
								if (local6.anObjectArray24 != null) {
									for (local296 = 0; local296 < Static207.anInt3852; local296++) {
										@Pc(1951) Class6_Sub42 local1951 = new Class6_Sub42();
										local1951.aClass239_13 = local6;
										local1951.anInt7475 = Static196.aClass40Array1[local296].method2681();
										local1951.anInt7470 = Static196.aClass40Array1[local296].method2682();
										local1951.anObjectArray36 = local6.anObjectArray24;
										Static376.aClass244_40.method5966(local1951);
									}
								}
								if (Static378.aBoolean431 && local6.anObjectArray30 != null) {
									local515 = new Class6_Sub42();
									local515.aClass239_13 = local6;
									local515.anObjectArray36 = local6.anObjectArray30;
									Static376.aClass244_40.method5966(local515);
								}
							}
							if (local6.anInt6900 == 5 && local6.anInt6937 != -1) {
								local6.method5732(Static133.aClass133_2, Static89.aClass70_1).method2643(local6.anInt6899, Static126.aClass66_5);
							}
							Static47.method1025(local6);
							if (local6.anInt6900 == 0) {
								method1143(arg0, local6.anInt6908, local28, local30, local32, local34, local17 - local6.anInt6931, local22 - local6.anInt6887, arg8, arg9);
								if (local6.aClass239Array2 != null) {
									method1143(local6.aClass239Array2, local6.anInt6908, local28, local30, local32, local34, local17 - local6.anInt6931, local22 - local6.anInt6887, arg8, arg9);
								}
								@Pc(2073) Class6_Sub9 local2073 = (Class6_Sub9) Static432.aClass74_33.method1883((long) local6.anInt6908);
								if (local2073 != null) {
									if (Static4.aClass36_5 == Static87.aClass36_3 && local2073.anInt1506 == 0 && !Static250.aBoolean294 && local204 && !Static27.aBoolean39) {
										Static41.method963();
									}
									Static22.method650(local32, local30, arg9, local2073.anInt1505, local28, local22, local17, local34, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static47.method1025(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1144() {
		Static31.anInt886 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static136.anInt2887; local3++) {
			@Pc(10) Class3_Sub2_Sub1_Sub1 local10 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local3]];
			if (local10.aBoolean417 && local10.method5520() != -1) {
				@Pc(28) int local28 = (local10.method5521() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7202 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7207 - local28 >> 7;
				@Pc(49) Class3_Sub2_Sub1 local49 = Static56.method1266(local10.aByte103, local42, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6602;
					if (local49 instanceof Class3_Sub2_Sub1_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt6587 == 0 && local49.method5520() != -1) {
						Static202.anIntArray271[Static31.anInt886] = local54;
						Static126.anIntArray160[Static31.anInt886] = local54;
						Static31.anInt886++;
						local49.anInt6587++;
					}
					Static202.anIntArray271[Static31.anInt886] = local54;
					Static126.anIntArray160[Static31.anInt886] = local10.anInt6602 + 2048;
					Static31.anInt886++;
					local49.anInt6587++;
				}
			}
		}
		Static392.method4251(Static126.anIntArray160, Static31.anInt886 - 1, Static202.anIntArray271, 0);
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1145(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static95.anInt2186;
		@Pc(3) int[] local3 = Static178.anIntArray542;
		@Pc(11) int local11 = Static29.aBoolean42 ? local1 : local1 + Static136.anInt2887;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local3[local13]];
			} else {
				local23 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local13 - local1]];
			}
			if (local23.aByte103 == arg0) {
				local23.anInt6587 = 0;
				if (local23.anInt6604 < 0) {
					local23.aBoolean417 = false;
				} else {
					@Pc(50) int local50 = local23.method5521();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7202 & 0x7F) != 0 || (local23.anInt7207 & 0x7F) != 0) {
							local23.aBoolean417 = false;
							continue;
						}
					} else if ((local23.anInt7202 & 0x7F) != 64 || (local23.anInt7207 & 0x7F) != 64) {
						local23.aBoolean417 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7202 >> 7;
						local97 = local23.anInt7207 >> 7;
						if (local23.anInt6604 != Static320.anIntArrayArray31[local92][local97]) {
							local23.aBoolean417 = true;
							continue;
						}
						if (Static443.anIntArrayArray60[local92][local97] > 1) {
							local122 = Static443.anIntArrayArray60[local92][local97]--;
							local23.aBoolean417 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7202 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7207 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7202 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7207 + local92 >> 7;
						if (!Static96.method4993(local158, local151, local23.anInt6604, local165, local97)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6604 == Static320.anIntArrayArray31[local176][local179]) {
										local122 = Static443.anIntArrayArray60[local176][local179]--;
									}
								}
							}
							local23.aBoolean417 = true;
							continue;
						}
					}
					if (local23 instanceof Class3_Sub2_Sub1_Sub2 && local23.aClass6_Sub34_3 != null && Static66.anInt1741 >= local23.aClass6_Sub34_3.anInt6222 && Static66.anInt1741 < local23.aClass6_Sub34_3.anInt6215) {
						((Class3_Sub2_Sub1_Sub2) local23).aBoolean424 = false;
					}
					local23.aBoolean417 = false;
					local23.anInt7208 = Static221.method3331(local23.aByte103, local23.anInt7207, local23.anInt7202);
					Static411.method6066(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1146() {
		for (@Pc(1) int local1 = 0; local1 < Static181.anInt3574; local1++) {
			@Pc(6) int[] local6 = Static320.anIntArrayArray31[local1];
			for (@Pc(8) int local8 = 0; local8 < Static117.anInt2450; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
	public static int method1147(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ts;)Lclient!cp;")
	public static Class6_Sub8 method1150(@OriginalArg(0) Class239 arg0) {
		@Pc(13) Class6_Sub8 local13 = (Class6_Sub8) Static172.aClass74_18.method1883(((long) arg0.anInt6908 << 32) + (long) arg0.anInt6907);
		return local13 == null ? arg0.aClass6_Sub8_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1152(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static95.anInt2186;
		@Pc(3) int[] local3 = Static178.anIntArray542;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static136.anInt2887; local5++) {
			@Pc(15) Class3_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local3[local5]];
			} else {
				local15 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local5 - local1]];
			}
			if (local15.aByte103 == arg0 && local15.anInt6604 >= 0) {
				@Pc(35) int local35 = local15.method5521();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7202 & 0x7F) != 0 || (local15.anInt7207 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7202 & 0x7F) != 64 || (local15.anInt7207 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7202 >> 7;
					local76 = local15.anInt7207 >> 7;
					if (local15.anInt6604 > Static320.anIntArrayArray31[local71][local76]) {
						Static320.anIntArrayArray31[local71][local76] = local15.anInt6604;
						Static443.anIntArrayArray60[local71][local76] = 1;
					} else if (local15.anInt6604 == Static320.anIntArrayArray31[local71][local76]) {
						local112 = Static443.anIntArrayArray60[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7202 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7207 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7202 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7207 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6604 > Static320.anIntArrayArray31[local154][local157]) {
								Static320.anIntArrayArray31[local154][local157] = local15.anInt6604;
								Static443.anIntArrayArray60[local154][local157] = 1;
							} else if (local15.anInt6604 == Static320.anIntArrayArray31[local154][local157]) {
								local112 = Static443.anIntArrayArray60[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ts;)Z")
	public static boolean method1153(@OriginalArg(0) Class239 arg0) {
		if (Static27.aBoolean39) {
			if (method1150(arg0).anInt1492 != 0) {
				return false;
			}
			if (arg0.anInt6900 == 0) {
				return false;
			}
		}
		return arg0.aBoolean438;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1155() {
		@Pc(1) int local1 = Static95.anInt2186;
		@Pc(3) int[] local3 = Static178.anIntArray542;
		@Pc(20) boolean local20 = Static291.aClass28_Sub1_1.anInt1040 == 1 && local1 > 200 || Static291.aClass28_Sub1_1.anInt1040 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class3_Sub2_Sub1_Sub2 local29 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local3[local22]];
			if (local29.method5534()) {
				local29.method5944();
				if (local29.aShort101 >= 0 && local29.aShort102 >= 0 && local29.aShort100 < Static181.anInt3574 && local29.aShort99 < Static117.anInt2450) {
					local29.aBoolean424 = local29.aBoolean418 ? local20 : false;
					if (local29 == Static302.aClass3_Sub2_Sub1_Sub2_2) {
						local29.anInt6604 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean417) {
							local75++;
						}
						if (local29.anInt6593 > Static66.anInt1741) {
							local75 += 2;
						}
						local75 += 5 - local29.method5521() << 2;
						if (local29.aBoolean422) {
							local75 += 512;
						} else {
							if (Static421.anInt7523 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6604 = local75 + 1;
					}
				} else {
					local29.anInt6604 = -1;
				}
			} else {
				local29.anInt6604 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static136.anInt2887; local116++) {
			@Pc(123) Class3_Sub2_Sub1_Sub1 local123 = Static308.aClass3_Sub2_Sub1_Sub1Array1[Static66.anIntArray102[local116]];
			if (local123.method1325() && local123.aClass48_1.method1381(Static393.aClass207_1)) {
				local123.method5944();
				if (local123.aShort101 >= 0 && local123.aShort102 >= 0 && local123.aShort100 < Static181.anInt3574 && local123.aShort99 < Static117.anInt2450) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean417) {
						local160++;
					}
					if (local123.anInt6593 > Static66.anInt1741) {
						local160 += 2;
					}
					local160 += 5 - local123.method5521() << 2;
					if (Static421.anInt7523 == 0) {
						if (local123.aClass48_1.aBoolean130) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static421.anInt7523 == 1) {
						if (local123.aClass48_1.aBoolean130) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass48_1.aBoolean129) {
						local160 += 1024;
					} else if (!local123.aClass48_1.aBoolean132) {
						local160 += 256;
					}
					local123.anInt6604 = local160 + 1;
				} else {
					local123.anInt6604 = -1;
				}
			} else {
				local123.anInt6604 = -1;
			}
		}
		for (local75 = 0; local75 < Static122.aClass17Array1.length; local75++) {
			@Pc(226) Class17 local226 = Static122.aClass17Array1[local75];
			if (local226 != null) {
				if (local226.anInt532 == 1) {
					@Pc(237) Class3_Sub2_Sub1_Sub1 local237 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local226.anInt531];
					if (local237 != null && local237.anInt6604 >= 0) {
						local237.anInt6604 += 2048;
					}
				} else if (local226.anInt532 == 10) {
					@Pc(258) Class3_Sub2_Sub1_Sub2 local258 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local226.anInt531];
					if (local258 != null && local258 != Static302.aClass3_Sub2_Sub1_Sub2_2 && local258.anInt6604 >= 0) {
						local258.anInt6604 += 2048;
					}
				}
			}
		}
	}
}
