import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_13 = new Class237(45, -2);

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_18 = new Class84("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_19 = new Class84("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
	public static int anInt1070 = 0;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[I")
	public static final int[] anIntArray72 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ss;)Lclient!vt;")
	public static Class1_Sub43 method916(@OriginalArg(0) Class219 arg0) {
		@Pc(13) Class1_Sub43 local13 = (Class1_Sub43) Static427.aClass27_41.method553(((long) arg0.anInt6422 << 32) + (long) arg0.anInt6345);
		return local13 == null ? arg0.aClass1_Sub43_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method917() {
		for (@Pc(1) int local1 = 0; local1 < Static135.anInt2314; local1++) {
			@Pc(6) int[] local6 = Static93.anIntArrayArray52[local1];
			for (@Pc(8) int local8 = 0; local8 < Static352.anInt6022; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method920() {
		Static144.anInt2448 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static288.anInt5039; local3++) {
			@Pc(10) Class26_Sub2_Sub2_Sub2 local10 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local3]];
			if (local10.aBoolean459 && local10.method5530() != -1) {
				@Pc(28) int local28 = (local10.method5535() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt7068 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt7065 - local28 >> 7;
				@Pc(49) Class26_Sub2_Sub2 local49 = Static407.method5502(local42, local35, local10.aByte95);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt7097;
					if (local49 instanceof Class26_Sub2_Sub2_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt7112 == 0 && local49.method5530() != -1) {
						Static166.anIntArray491[Static144.anInt2448] = local54;
						Static412.anIntArray624[Static144.anInt2448] = local54;
						Static144.anInt2448++;
						local49.anInt7112++;
					}
					Static166.anIntArray491[Static144.anInt2448] = local54;
					Static412.anIntArray624[Static144.anInt2448] = local10.anInt7097 + 2048;
					Static144.anInt2448++;
					local49.anInt7112++;
				}
			}
		}
		Static263.method3819(0, Static412.anIntArray624, Static144.anInt2448 - 1, Static166.anIntArray491);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method921(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static187.anInt4913;
		@Pc(3) int[] local3 = Static256.anIntArray370;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static288.anInt5039; local5++) {
			@Pc(15) Class26_Sub2_Sub2 local15;
			if (local5 < local1) {
				local15 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local5 - local1]];
			}
			if (local15.aByte95 == arg0 && local15.anInt7105 >= 0) {
				@Pc(35) int local35 = local15.method5535();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt7068 & 0x7F) != 0 || (local15.anInt7065 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7068 & 0x7F) != 64 || (local15.anInt7065 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt7068 >> 7;
					local76 = local15.anInt7065 >> 7;
					if (local15.anInt7105 > Static93.anIntArrayArray52[local71][local76]) {
						Static93.anIntArrayArray52[local71][local76] = local15.anInt7105;
						Static315.anIntArrayArray171[local71][local76] = 1;
					} else if (local15.anInt7105 == Static93.anIntArrayArray52[local71][local76]) {
						local112 = Static315.anIntArrayArray171[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt7068 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt7065 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt7068 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt7065 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt7105 > Static93.anIntArrayArray52[local154][local157]) {
								Static93.anIntArrayArray52[local154][local157] = local15.anInt7105;
								Static315.anIntArrayArray171[local154][local157] = 1;
							} else if (local15.anInt7105 == Static93.anIntArrayArray52[local154][local157]) {
								local112 = Static315.anIntArrayArray171[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ss;)Lclient!ss;")
	public static Class219 method922(@OriginalArg(0) Class219 arg0) {
		@Pc(4) int local4 = method916(arg0).method5789();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static103.method1572(arg0.anInt6379);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ss;IIIIIIIII)V")
	public static void method924(@OriginalArg(0) Class219[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class219 local6 = arg0[local1];
			if (local6 != null && local6.anInt6379 == arg1) {
				@Pc(17) int local17 = local6.anInt6418 + arg6;
				@Pc(22) int local22 = local6.anInt6375 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6377 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6398;
					@Pc(45) int local45 = local22 + local6.anInt6363;
					if (local6.anInt6377 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6377 == 0 || local6.aBoolean411 || method916(local6).anInt7461 != 0 || local6 == Static207.aClass219_11 || local6.anInt6384 == Static315.anInt5852) {
					if (!method925(local6)) {
						if (local6 == Static442.aClass219_14) {
							Static168.aBoolean183 = true;
							Static317.anInt3564 = local17;
							Static25.anInt551 = local22;
						}
						if (local6.aBoolean409 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean418 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub6 local148 = (Class1_Sub6) Static59.aClass266_11.method6000(); local148 != null; local148 = (Class1_Sub6) Static59.aClass266_11.method5994()) {
									if (local148.aBoolean69) {
										local148.method6071();
										local148.aClass219_4.aBoolean407 = false;
									}
								}
								if (Static368.anInt6278 == 0) {
									Static442.aClass219_14 = null;
									Static207.aClass219_11 = null;
								}
								Static90.anInt1740 = 0;
								Static40.aBoolean26 = false;
								Static257.aBoolean317 = false;
								if (!Static108.aBoolean111) {
									Static188.method2891();
								}
							}
							@Pc(204) boolean local204;
							if (Static16.aClass228_1.method5485() >= local28 && Static16.aClass228_1.method5486() >= local30 && Static16.aClass228_1.method5485() < local32 && Static16.aClass228_1.method5486() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static138.aBoolean128 && local204) {
								if (local6.anInt6414 >= 0) {
									Static246.anInt4394 = local6.anInt6414;
								} else if (local6.aBoolean418) {
									Static246.anInt4394 = -1;
								}
							}
							if (!Static108.aBoolean111 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static12.method297(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(248) boolean local248 = false;
							if (Static16.aClass228_1.method5483() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub27 local263 = (Class1_Sub27) Static384.aClass266_45.method6000();
							if (local263 != null && local263.method4578() == 0 && local263.method4581() >= local28 && local263.method4582() >= local30 && local263.method4581() < local32 && local263.method4582() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray81 != null) {
								for (local296 = 0; local296 < local6.aByteArray81.length; local296++) {
									if (Static102.aClass163_1.method3809(local6.aByteArray81[local296])) {
										if (local6.anIntArray525 == null || Static403.anInt6978 >= local6.anIntArray525[local296]) {
											@Pc(328) byte local328 = local6.aByteArray80[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static102.aClass163_1.method3809(86) && !Static102.aClass163_1.method3809(82) && !Static102.aClass163_1.method3809(81)) && ((local328 & 0x2) == 0 || Static102.aClass163_1.method3809(86)) && ((local328 & 0x1) == 0 || Static102.aClass163_1.method3809(82)) && ((local328 & 0x4) == 0 || Static102.aClass163_1.method3809(81))) {
												if (local296 < 10) {
													Static48.method816(local296 + 1, "", -1, local6.anInt6422);
												} else if (local296 == 10) {
													Static82.method1412();
													@Pc(399) Class1_Sub43 local399 = method916(local6);
													Static389.method5312(local399.method5784(), local6, local399.anInt7463);
													Static233.aString33 = Static437.method5858(local6);
													if (Static233.aString33 == null) {
														Static233.aString33 = "Null";
													}
													Static254.aString36 = local6.aString44 + "<col=ffffff>";
												}
												local430 = local6.anIntArray527[local296];
												if (local6.anIntArray525 == null) {
													local6.anIntArray525 = new int[local6.aByteArray81.length];
												}
												if (local430 == 0) {
													local6.anIntArray525[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray525[local296] = Static403.anInt6978 + local430;
												}
											}
										}
									} else if (local6.anIntArray525 != null) {
										local6.anIntArray525[local296] = 0;
									}
								}
							}
							if (local258) {
								Static163.method2625(local6, local263.method4581() - local17, local263.method4582() - local22);
							}
							if (Static442.aClass219_14 != null && Static442.aClass219_14 != local6 && local204 && method916(local6).method5785()) {
								Static295.aClass219_15 = local6;
							}
							if (local6 == Static207.aClass219_11) {
								Static400.aBoolean448 = true;
								Static365.anInt6210 = local17;
								Static394.anInt6861 = local22;
							}
							if (local6.aBoolean411 || local6.anInt6384 != 0) {
								@Pc(515) Class1_Sub6 local515;
								if (local204 && Static257.anInt4626 != 0 && local6.anObjectArray17 != null) {
									local515 = new Class1_Sub6();
									local515.aBoolean69 = true;
									local515.aClass219_4 = local6;
									local515.anInt1462 = Static257.anInt4626;
									local515.anObjectArray3 = local6.anObjectArray17;
									Static59.aClass266_11.method5998(local515);
								}
								if (Static442.aClass219_14 != null || Static108.aBoolean111 || local6.anInt6384 != Static253.anInt4559 && Static90.anInt1740 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6384 != 0) {
									if (local6.anInt6384 == Static67.anInt1398 || local6.anInt6384 == Static353.anInt6049) {
										Static115.aClass219_8 = local6;
										if (Static58.aClass154_1 != null) {
											Static58.aClass154_1.method3597(Static276.aClass109_10, local6.anInt6363);
										}
										if (local6.anInt6384 == Static67.anInt1398) {
											if (!Static108.aBoolean111 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static32.method557(Static276.aClass109_10, arg8, arg9);
												for (@Pc(598) Class39_Sub5 local598 = (Class39_Sub5) Static47.aClass188_1.method4534(); local598 != null; local598 = (Class39_Sub5) Static47.aClass188_1.method4530()) {
													if (arg8 >= local598.anInt3263 && arg8 < local598.anInt3262 && arg9 >= local598.anInt3257 && arg9 < local598.anInt3258) {
														Static188.method2891();
														Static126.method1873(local598.aClass26_Sub2_Sub2_1);
													}
												}
											}
											Static429.method5745(local17, local22, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6384 == Static315.anInt5852) {
										if (local6.method5127(Static276.aClass109_10) == null || Static288.anInt5036 != 0 && Static288.anInt5036 != 3 || Static108.aBoolean111 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray522[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray526[local670]) {
											continue;
										}
										local296 -= local6.anInt6398 / 2;
										local670 -= local6.anInt6363 / 2;
										if (Static310.anInt5540 == 4) {
											local709 = (int) Static274.aFloat78 & 0x3FFF;
										} else {
											local709 = (int) Static274.aFloat78 + Static182.anInt7140 & 0x3FFF;
										}
										@Pc(721) int local721 = Class4.anIntArray7[local709];
										@Pc(725) int local725 = Class4.anIntArray6[local709];
										if (Static310.anInt5540 != 4) {
											local721 = local721 * (Static427.anInt7386 + 256) >> 8;
											local725 = local725 * (Static427.anInt7386 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static310.anInt5540 == 4) {
											local775 = (Static356.anInt6062 >> 7) + (local754 >> 2);
											local783 = (Static57.anInt1180 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static196.aClass26_Sub2_Sub2_Sub1_1.method5535() - 1) * 64;
											local775 = (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 - local792 >> 7) + (local754 >> 2);
											local783 = (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 - local792 >> 7) - (local764 >> 2);
										}
										if (Static138.aBoolean128 && (Static333.anInt5795 & 0x40) != 0) {
											@Pc(825) Class219 local825 = Static78.method1356(Static107.anInt1974, Static304.anInt5407);
											if (local825 == null) {
												Static82.method1412();
											} else {
												Static423.method5681(local775, local783, 1L, 19, Static370.anInt6307, local6.anInt6421, false, " ->", Static233.aString33, true);
											}
											continue;
										}
										if (Static248.aClass145_2 == Static96.aClass145_1) {
											Static423.method5681(local775, local783, 1L, 49, -1, -1, false, "", Static443.aClass84_102.method1678(Static167.anInt3118), true);
										}
										Static423.method5681(local775, local783, 1L, 8, Static188.anInt3449, -1, false, "", Static273.aString37, true);
										continue;
									}
									if (local6.anInt6384 == Static253.anInt4559) {
										Static139.aClass219_9 = local6;
										if (local204) {
											Static40.aBoolean26 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method4581() - local17 - local6.anInt6398 / 2) * 2.0D / (double) Static7.aFloat39);
											local670 = (int) -((double) (local263.method4582() - local22 - local6.anInt6363 / 2) * 2.0D / (double) Static7.aFloat39);
											local430 = Static46.anInt865 + local296 + Static7.anInt2566;
											local709 = Static151.anInt2577 + local670 + Static7.anInt2576;
											@Pc(939) Class1_Sub2_Sub12 local939 = Static287.method4054();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method2962(local944, local430, local709);
											if (local944 != null) {
												if (Static102.aClass163_1.method3809(82) && Static82.anInt1625 > 0) {
													Static363.method4978(local944[2], local944[1], local944[0]);
													continue;
												}
												Static257.aBoolean317 = true;
												Static323.anInt5665 = local944[0];
												Static429.anInt7414 = local944[1];
												Static439.anInt7578 = local944[2];
											}
											Static90.anInt1740 = 1;
											Static37.aBoolean23 = false;
											Static63.anInt1323 = Static16.aClass228_1.method5485();
											Static285.anInt7840 = Static16.aClass228_1.method5486();
											continue;
										}
										if (local248 && Static90.anInt1740 > 0) {
											if (Static90.anInt1740 == 1 && (Static63.anInt1323 != Static16.aClass228_1.method5485() || Static285.anInt7840 != Static16.aClass228_1.method5486())) {
												Static342.anInt5941 = Static46.anInt865;
												Static273.anInt4873 = Static151.anInt2577;
												Static90.anInt1740 = 2;
											}
											if (Static90.anInt1740 == 2) {
												Static37.aBoolean23 = true;
												Static16.method336(Static342.anInt5941 + (int) ((double) (Static63.anInt1323 - Static16.aClass228_1.method5485()) * 2.0D / (double) Static7.aFloat38));
												Static109.method1676(Static273.anInt4873 - (int) ((double) (Static285.anInt7840 - Static16.aClass228_1.method5486()) * 2.0D / (double) Static7.aFloat38));
											}
											continue;
										}
										if (Static90.anInt1740 > 0 && !Static37.aBoolean23) {
											if ((Static42.anInt758 == 1 || Static294.method4794()) && Static82.anInt1627 > 2) {
												Static100.method1553(Static285.anInt7840, Static63.anInt1323);
											} else if (Static269.method3929()) {
												Static100.method1553(Static285.anInt7840, Static63.anInt1323);
											}
										}
										Static90.anInt1740 = 0;
										continue;
									}
									if (local6.anInt6384 == Static399.anInt6929) {
										if (local248) {
											Static59.method1065(local6.anInt6398, local6.anInt6363, Static16.aClass228_1.method5485() - local17, Static16.aClass228_1.method5486() - local22);
										}
										continue;
									}
									if (local6.anInt6384 == Static387.anInt6756) {
										Static425.method5709(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean408 && local258) {
									local6.aBoolean408 = true;
									if (local6.anObjectArray30 != null) {
										local515 = new Class1_Sub6();
										local515.aBoolean69 = true;
										local515.aClass219_4 = local6;
										local515.anInt1463 = local263.method4581() - local17;
										local515.anInt1462 = local263.method4582() - local22;
										local515.anObjectArray3 = local6.anObjectArray30;
										Static59.aClass266_11.method5998(local515);
									}
								}
								if (local6.aBoolean408 && local248 && local6.anObjectArray12 != null) {
									local515 = new Class1_Sub6();
									local515.aBoolean69 = true;
									local515.aClass219_4 = local6;
									local515.anInt1463 = Static16.aClass228_1.method5485() - local17;
									local515.anInt1462 = Static16.aClass228_1.method5486() - local22;
									local515.anObjectArray3 = local6.anObjectArray12;
									Static59.aClass266_11.method5998(local515);
								}
								if (local6.aBoolean408 && !local248) {
									local6.aBoolean408 = false;
									if (local6.anObjectArray35 != null) {
										local515 = new Class1_Sub6();
										local515.aBoolean69 = true;
										local515.aClass219_4 = local6;
										local515.anInt1463 = Static16.aClass228_1.method5485() - local17;
										local515.anInt1462 = Static16.aClass228_1.method5486() - local22;
										local515.anObjectArray3 = local6.anObjectArray35;
										Static30.aClass266_8.method5998(local515);
									}
								}
								if (local248 && local6.anObjectArray6 != null) {
									local515 = new Class1_Sub6();
									local515.aBoolean69 = true;
									local515.aClass219_4 = local6;
									local515.anInt1463 = Static16.aClass228_1.method5485() - local17;
									local515.anInt1462 = Static16.aClass228_1.method5486() - local22;
									local515.anObjectArray3 = local6.anObjectArray6;
									Static59.aClass266_11.method5998(local515);
								}
								if (!local6.aBoolean407 && local204) {
									local6.aBoolean407 = true;
									if (local6.anObjectArray7 != null) {
										local515 = new Class1_Sub6();
										local515.aBoolean69 = true;
										local515.aClass219_4 = local6;
										local515.anInt1463 = Static16.aClass228_1.method5485() - local17;
										local515.anInt1462 = Static16.aClass228_1.method5486() - local22;
										local515.anObjectArray3 = local6.anObjectArray7;
										Static59.aClass266_11.method5998(local515);
									}
								}
								if (local6.aBoolean407 && local204 && local6.anObjectArray26 != null) {
									local515 = new Class1_Sub6();
									local515.aBoolean69 = true;
									local515.aClass219_4 = local6;
									local515.anInt1463 = Static16.aClass228_1.method5485() - local17;
									local515.anInt1462 = Static16.aClass228_1.method5486() - local22;
									local515.anObjectArray3 = local6.anObjectArray26;
									Static59.aClass266_11.method5998(local515);
								}
								if (local6.aBoolean407 && !local204) {
									local6.aBoolean407 = false;
									if (local6.anObjectArray20 != null) {
										local515 = new Class1_Sub6();
										local515.aBoolean69 = true;
										local515.aClass219_4 = local6;
										local515.anInt1463 = Static16.aClass228_1.method5485() - local17;
										local515.anInt1462 = Static16.aClass228_1.method5486() - local22;
										local515.anObjectArray3 = local6.anObjectArray20;
										Static30.aClass266_8.method5998(local515);
									}
								}
								if (local6.anObjectArray23 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray23;
									Static420.aClass266_49.method5998(local515);
								}
								@Pc(1483) Class1_Sub6 local1483;
								if (local6.anObjectArray16 != null && Static18.anInt419 > local6.anInt6407) {
									if (local6.anIntArray528 == null || Static18.anInt419 - local6.anInt6407 > 32) {
										local515 = new Class1_Sub6();
										local515.aClass219_4 = local6;
										local515.anObjectArray3 = local6.anObjectArray16;
										Static59.aClass266_11.method5998(local515);
									} else {
										label678: for (local296 = local6.anInt6407; local296 < Static18.anInt419; local296++) {
											local670 = Static442.anIntArray406[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray528.length; local430++) {
												if (local6.anIntArray528[local430] == local670) {
													local1483 = new Class1_Sub6();
													local1483.aClass219_4 = local6;
													local1483.anObjectArray3 = local6.anObjectArray16;
													Static59.aClass266_11.method5998(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6407 = Static18.anInt419;
								}
								if (local6.anObjectArray34 != null && Static451.anInt7775 > local6.anInt6386) {
									if (local6.anIntArray531 == null || Static451.anInt7775 - local6.anInt6386 > 32) {
										local515 = new Class1_Sub6();
										local515.aClass219_4 = local6;
										local515.anObjectArray3 = local6.anObjectArray34;
										Static59.aClass266_11.method5998(local515);
									} else {
										label654: for (local296 = local6.anInt6386; local296 < Static451.anInt7775; local296++) {
											local670 = Static272.anIntArray392[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray531.length; local430++) {
												if (local6.anIntArray531[local430] == local670) {
													local1483 = new Class1_Sub6();
													local1483.aClass219_4 = local6;
													local1483.anObjectArray3 = local6.anObjectArray34;
													Static59.aClass266_11.method5998(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt6386 = Static451.anInt7775;
								}
								if (local6.anObjectArray14 != null && Static193.anInt1051 > local6.anInt6408) {
									if (local6.anIntArray524 == null || Static193.anInt1051 - local6.anInt6408 > 32) {
										local515 = new Class1_Sub6();
										local515.aClass219_4 = local6;
										local515.anObjectArray3 = local6.anObjectArray14;
										Static59.aClass266_11.method5998(local515);
									} else {
										label630: for (local296 = local6.anInt6408; local296 < Static193.anInt1051; local296++) {
											local670 = Static245.anIntArray351[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray524.length; local430++) {
												if (local6.anIntArray524[local430] == local670) {
													local1483 = new Class1_Sub6();
													local1483.aClass219_4 = local6;
													local1483.anObjectArray3 = local6.anObjectArray14;
													Static59.aClass266_11.method5998(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt6408 = Static193.anInt1051;
								}
								if (local6.anObjectArray29 != null && Static51.anInt963 > local6.anInt6378) {
									if (local6.anIntArray530 == null || Static51.anInt963 - local6.anInt6378 > 32) {
										local515 = new Class1_Sub6();
										local515.aClass219_4 = local6;
										local515.anObjectArray3 = local6.anObjectArray29;
										Static59.aClass266_11.method5998(local515);
									} else {
										label606: for (local296 = local6.anInt6378; local296 < Static51.anInt963; local296++) {
											local670 = Static373.anIntArray521[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray530.length; local430++) {
												if (local6.anIntArray530[local430] == local670) {
													local1483 = new Class1_Sub6();
													local1483.aClass219_4 = local6;
													local1483.anObjectArray3 = local6.anObjectArray29;
													Static59.aClass266_11.method5998(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt6378 = Static51.anInt963;
								}
								if (local6.anObjectArray32 != null && Static113.anInt5770 > local6.anInt6372) {
									if (local6.anIntArray523 == null || Static113.anInt5770 - local6.anInt6372 > 32) {
										local515 = new Class1_Sub6();
										local515.aClass219_4 = local6;
										local515.anObjectArray3 = local6.anObjectArray32;
										Static59.aClass266_11.method5998(local515);
									} else {
										label582: for (local296 = local6.anInt6372; local296 < Static113.anInt5770; local296++) {
											local670 = Static350.anIntArray477[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray523.length; local430++) {
												if (local6.anIntArray523[local430] == local670) {
													local1483 = new Class1_Sub6();
													local1483.aClass219_4 = local6;
													local1483.anObjectArray3 = local6.anObjectArray32;
													Static59.aClass266_11.method5998(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6372 = Static113.anInt5770;
								}
								if (Static9.anInt246 > local6.anInt6349 && local6.anObjectArray27 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray27;
									Static59.aClass266_11.method5998(local515);
								}
								if (Static151.anInt2580 > local6.anInt6349 && local6.anObjectArray5 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray5;
									Static59.aClass266_11.method5998(local515);
								}
								if (Static327.anInt5733 > local6.anInt6349 && local6.anObjectArray13 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray13;
									Static59.aClass266_11.method5998(local515);
								}
								if (Static448.anInt7686 > local6.anInt6349 && local6.anObjectArray9 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray9;
									Static59.aClass266_11.method5998(local515);
								}
								if (Static367.anInt6237 > local6.anInt6349 && local6.anObjectArray11 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray11;
									Static59.aClass266_11.method5998(local515);
								}
								local6.anInt6349 = Static337.anInt7419;
								if (local6.anObjectArray24 != null) {
									for (local296 = 0; local296 < Static242.anInt4339; local296++) {
										@Pc(1951) Class1_Sub6 local1951 = new Class1_Sub6();
										local1951.aClass219_4 = local6;
										local1951.anInt1466 = Static148.aClass21Array1[local296].method3182();
										local1951.anInt1461 = Static148.aClass21Array1[local296].method3180();
										local1951.anObjectArray3 = local6.anObjectArray24;
										Static59.aClass266_11.method5998(local1951);
									}
								}
								if (Static92.aBoolean94 && local6.anObjectArray10 != null) {
									local515 = new Class1_Sub6();
									local515.aClass219_4 = local6;
									local515.anObjectArray3 = local6.anObjectArray10;
									Static59.aClass266_11.method5998(local515);
								}
							}
							if (local6.anInt6377 == 5 && local6.anInt6383 != -1) {
								local6.method5123(Static141.aClass168_1, Static199.aClass134_1).method3597(Static276.aClass109_10, local6.anInt6363);
							}
							Static395.method5369(local6);
							if (local6.anInt6377 == 0) {
								method924(arg0, local6.anInt6422, local28, local30, local32, local34, local17 - local6.anInt6368, local22 - local6.anInt6371, arg8, arg9);
								if (local6.aClass219Array3 != null) {
									method924(local6.aClass219Array3, local6.anInt6422, local28, local30, local32, local34, local17 - local6.anInt6368, local22 - local6.anInt6371, arg8, arg9);
								}
								@Pc(2073) Class1_Sub36 local2073 = (Class1_Sub36) Static445.aClass27_42.method553((long) local6.anInt6422);
								if (local2073 != null) {
									if (Static248.aClass145_2 == Static288.aClass145_3 && local2073.anInt5679 == 0 && !Static108.aBoolean111 && local204 && !Static239.aBoolean287) {
										Static188.method2891();
									}
									Static162.method2525(local30, local28, local34, local22, local17, local32, local2073.anInt5680, arg9, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static395.method5369(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ss;)Z")
	public static boolean method925(@OriginalArg(0) Class219 arg0) {
		if (Static239.aBoolean287) {
			if (method916(arg0).anInt7461 != 0) {
				return false;
			}
			if (arg0.anInt6377 == 0) {
				return false;
			}
		}
		return arg0.aBoolean417;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method927(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static187.anInt4913;
		@Pc(3) int[] local3 = Static256.anIntArray370;
		@Pc(11) int local11 = Static282.aBoolean331 ? local1 : local1 + Static288.anInt5039;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class26_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local13 - local1]];
			}
			if (local23.aByte95 == arg0) {
				local23.anInt7112 = 0;
				if (local23.anInt7105 < 0) {
					local23.aBoolean459 = false;
				} else {
					@Pc(50) int local50 = local23.method5535();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt7068 & 0x7F) != 0 || (local23.anInt7065 & 0x7F) != 0) {
							local23.aBoolean459 = false;
							continue;
						}
					} else if ((local23.anInt7068 & 0x7F) != 64 || (local23.anInt7065 & 0x7F) != 64) {
						local23.aBoolean459 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt7068 >> 7;
						local97 = local23.anInt7065 >> 7;
						if (local23.anInt7105 != Static93.anIntArrayArray52[local92][local97]) {
							local23.aBoolean459 = true;
							continue;
						}
						if (Static315.anIntArrayArray171[local92][local97] > 1) {
							local122 = Static315.anIntArrayArray171[local92][local97]--;
							local23.aBoolean459 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt7068 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt7065 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt7068 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt7065 + local92 >> 7;
						if (!Static11.method295(local97, local158, local165, local151, local23.anInt7105)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt7105 == Static93.anIntArrayArray52[local176][local179]) {
										local122 = Static315.anIntArrayArray171[local176][local179]--;
									}
								}
							}
							local23.aBoolean459 = true;
							continue;
						}
					}
					if (local23 instanceof Class26_Sub2_Sub2_Sub1 && local23.aClass1_Sub4_3 != null && Static403.anInt6978 >= local23.aClass1_Sub4_3.anInt807 && Static403.anInt6978 < local23.aClass1_Sub4_3.anInt791) {
						((Class26_Sub2_Sub2_Sub1) local23).aBoolean433 = false;
					}
					local23.aBoolean459 = false;
					local23.anInt7063 = Static289.method4078(local23.anInt7068, local23.anInt7065, local23.aByte95);
					Static176.method2753(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method928() {
		@Pc(1) int local1 = Static187.anInt4913;
		@Pc(3) int[] local3 = Static256.anIntArray370;
		@Pc(20) boolean local20 = Static389.aClass128_Sub1_1.anInt3569 == 1 && local1 > 200 || Static389.aClass128_Sub1_1.anInt3569 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class26_Sub2_Sub2_Sub1 local29 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local3[local22]];
			if (local29.method5254()) {
				local29.method5524();
				if (local29.aShort93 >= 0 && local29.aShort94 >= 0 && local29.aShort92 < Static135.anInt2314 && local29.aShort95 < Static352.anInt6022) {
					local29.aBoolean433 = local29.aBoolean458 ? local20 : false;
					if (local29 == Static196.aClass26_Sub2_Sub2_Sub1_1) {
						local29.anInt7105 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean459) {
							local75++;
						}
						if (local29.anInt7139 > Static403.anInt6978) {
							local75 += 2;
						}
						local75 += 5 - local29.method5535() << 2;
						if (local29.aBoolean432) {
							local75 += 512;
						} else {
							if (Static267.anInt4802 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7105 = local75 + 1;
					}
				} else {
					local29.anInt7105 = -1;
				}
			} else {
				local29.anInt7105 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static288.anInt5039; local116++) {
			@Pc(123) Class26_Sub2_Sub2_Sub2 local123 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local116]];
			if (local123.method5543() && local123.aClass66_1.method1450(Static51.aClass79_1)) {
				local123.method5524();
				if (local123.aShort93 >= 0 && local123.aShort94 >= 0 && local123.aShort92 < Static135.anInt2314 && local123.aShort95 < Static352.anInt6022) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean459) {
						local160++;
					}
					if (local123.anInt7139 > Static403.anInt6978) {
						local160 += 2;
					}
					local160 += 5 - local123.method5535() << 2;
					if (Static267.anInt4802 == 0) {
						if (local123.aClass66_1.aBoolean91) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static267.anInt4802 == 1) {
						if (local123.aClass66_1.aBoolean91) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass66_1.aBoolean89) {
						local160 += 1024;
					} else if (!local123.aClass66_1.aBoolean92) {
						local160 += 256;
					}
					local123.anInt7105 = local160 + 1;
				} else {
					local123.anInt7105 = -1;
				}
			} else {
				local123.anInt7105 = -1;
			}
		}
		for (local75 = 0; local75 < Static444.aClass3Array1.length; local75++) {
			@Pc(226) Class3 local226 = Static444.aClass3Array1[local75];
			if (local226 != null) {
				if (local226.anInt171 == 1) {
					@Pc(237) Class26_Sub2_Sub2_Sub2 local237 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local226.anInt164];
					if (local237 != null && local237.anInt7105 >= 0) {
						local237.anInt7105 += 2048;
					}
				} else if (local226.anInt171 == 10) {
					@Pc(258) Class26_Sub2_Sub2_Sub1 local258 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local226.anInt164];
					if (local258 != null && local258 != Static196.aClass26_Sub2_Sub2_Sub1_1 && local258.anInt7105 >= 0) {
						local258.anInt7105 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method929() {
		@Pc(1) int local1 = Static187.anInt4913;
		@Pc(3) int[] local3 = Static256.anIntArray370;
		@Pc(11) int local11 = Static282.aBoolean331 ? local1 : local1 + Static288.anInt5039;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class26_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local13 - local1]];
			}
			if (local23.anInt7105 >= 0) {
				@Pc(39) int local39 = local23.method5535();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt7068 & 0x7F) == 0 && (local23.anInt7065 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7068 & 0x7F) == 64 && (local23.anInt7065 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class26_Sub2_Sub2_Sub1 && local23.aClass1_Sub4_3 != null && Static403.anInt6978 >= local23.aClass1_Sub4_3.anInt807 && Static403.anInt6978 < local23.aClass1_Sub4_3.anInt791) {
					((Class26_Sub2_Sub2_Sub1) local23).aBoolean433 = false;
				}
				local23.anInt7063 = Static289.method4078(local23.anInt7068, local23.anInt7065, local23.aByte95);
				Static176.method2753(local23, true);
			}
		}
	}
}
