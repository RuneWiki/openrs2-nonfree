import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!sp;")
	public static final Class219 aClass219_1 = new Class219("WTRC", 1);

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_4 = new Class186("", 11);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uu;)Z")
	public static boolean method895(@OriginalArg(0) Class247 arg0) {
		if (Static415.aBoolean626) {
			if (method900(arg0).anInt5105 != 0) {
				return false;
			}
			if (arg0.anInt6840 == 0) {
				return false;
			}
		}
		return arg0.aBoolean616;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method896(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static33.anInt606;
		@Pc(3) int[] local3 = Static99.anIntArray157;
		@Pc(11) int local11 = Static66.aBoolean508 ? local1 : local1 + Static12.anInt163;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class16_Sub1_Sub5 local23;
			if (local13 < local1) {
				local23 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local3[local13]];
			} else {
				local23 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local13 - local1]];
			}
			if (local23.aByte82 == arg0) {
				local23.anInt6071 = 0;
				if (local23.anInt6025 < 0) {
					local23.aBoolean561 = false;
				} else {
					@Pc(50) int local50 = local23.method4751();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6893 & 0x7F) != 0 || (local23.anInt6892 & 0x7F) != 0) {
							local23.aBoolean561 = false;
							continue;
						}
					} else if ((local23.anInt6893 & 0x7F) != 64 || (local23.anInt6892 & 0x7F) != 64) {
						local23.aBoolean561 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6893 >> 7;
						local97 = local23.anInt6892 >> 7;
						if (local23.anInt6025 != Static50.anIntArrayArray8[local92][local97]) {
							local23.aBoolean561 = true;
							continue;
						}
						if (Static44.anIntArrayArray7[local92][local97] > 1) {
							local122 = Static44.anIntArrayArray7[local92][local97]--;
							local23.aBoolean561 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6893 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6892 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6893 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6892 + local92 >> 7;
						if (!Static298.method4083(local165, local151, local158, local23.anInt6025, local97)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6025 == Static50.anIntArrayArray8[local176][local179]) {
										local122 = Static44.anIntArrayArray7[local176][local179]--;
									}
								}
							}
							local23.aBoolean561 = true;
							continue;
						}
					}
					if (local23 instanceof Class16_Sub1_Sub5_Sub1 && local23.aClass4_Sub23_3 != null && Static24.anInt5323 >= local23.aClass4_Sub23_3.anInt3191 && Static24.anInt5323 < local23.aClass4_Sub23_3.anInt3202) {
						((Class16_Sub1_Sub5_Sub1) local23).aBoolean402 = false;
					}
					local23.aBoolean561 = false;
					local23.anInt6889 = Static13.method135(local23.anInt6893, local23.aByte82, local23.anInt6892);
					Static324.method4385(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)I")
	public static int method898(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!uu;)Lclient!ns;")
	public static Class4_Sub33 method900(@OriginalArg(0) Class247 arg0) {
		@Pc(13) Class4_Sub33 local13 = (Class4_Sub33) Static211.aClass102_18.method2700(((long) arg0.anInt6809 << 32) + (long) arg0.anInt6865);
		return local13 == null ? arg0.aClass4_Sub33_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!uu;IIIIIIIII)V")
	public static void method901(@OriginalArg(0) Class247[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class247 local6 = arg0[local1];
			if (local6 != null && local6.anInt6850 == arg1) {
				@Pc(17) int local17 = local6.anInt6836 + arg6;
				@Pc(22) int local22 = local6.anInt6859 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6840 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6833;
					@Pc(45) int local45 = local22 + local6.anInt6805;
					if (local6.anInt6840 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6840 == 0 || local6.aBoolean612 || method900(local6).anInt5105 != 0 || local6 == Static57.aClass247_1 || local6.anInt6842 == Static155.anInt3645) {
					if (!method895(local6)) {
						if (local6 == Static281.aClass247_12) {
							Static361.aBoolean570 = true;
							Static247.anInt4615 = local17;
							Static374.anInt6394 = local22;
						}
						if (local6.aBoolean624 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean622 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class4_Sub34 local148 = (Class4_Sub34) Static291.aClass183_35.method4140(); local148 != null; local148 = (Class4_Sub34) Static291.aClass183_35.method4144()) {
									if (local148.aBoolean475) {
										local148.method5684();
										local148.aClass247_15.aBoolean611 = false;
									}
								}
								if (Static315.anInt5487 == 0) {
									Static281.aClass247_12 = null;
									Static57.aClass247_1 = null;
								}
								Static64.anInt1367 = 0;
								Static423.aBoolean653 = false;
								Static219.aBoolean588 = false;
								if (!Static234.aBoolean411) {
									Static314.method4198();
								}
							}
							@Pc(204) boolean local204;
							if (Static420.aClass80_1.method2234() >= local28 && Static420.aClass80_1.method2230() >= local30 && Static420.aClass80_1.method2234() < local32 && Static420.aClass80_1.method2230() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static341.aBoolean599 && local204) {
								if (local6.anInt6789 >= 0) {
									Static157.anInt3147 = local6.anInt6789;
								} else if (local6.aBoolean622) {
									Static157.anInt3147 = -1;
								}
							}
							if (!Static234.aBoolean411 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static290.method5013(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(248) boolean local248 = false;
							if (Static420.aClass80_1.method2235() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class4_Sub5 local263 = (Class4_Sub5) Static413.aClass183_47.method4140();
							if (local263 != null && local263.method515() == 0 && local263.method518() >= local28 && local263.method519() >= local30 && local263.method518() < local32 && local263.method519() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray96 != null) {
								for (local296 = 0; local296 < local6.aByteArray96.length; local296++) {
									if (Static384.aClass244_1.method5489(local6.aByteArray96[local296])) {
										if (local6.anIntArray516 == null || Static24.anInt5323 >= local6.anIntArray516[local296]) {
											@Pc(328) byte local328 = local6.aByteArray97[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static384.aClass244_1.method5489(86) && !Static384.aClass244_1.method5489(82) && !Static384.aClass244_1.method5489(81)) && ((local328 & 0x2) == 0 || Static384.aClass244_1.method5489(86)) && ((local328 & 0x1) == 0 || Static384.aClass244_1.method5489(82)) && ((local328 & 0x4) == 0 || Static384.aClass244_1.method5489(81))) {
												if (local296 < 10) {
													Static413.method5309(local296 + 1, "", local6.anInt6809, -1);
												} else if (local296 == 10) {
													Static336.method5139();
													@Pc(399) Class4_Sub33 local399 = method900(local6);
													Static286.method3975(local399.anInt5110, local399.method3911(), local6);
													Static388.aString62 = Static329.method4431(local6);
													if (Static388.aString62 == null) {
														Static388.aString62 = "Null";
													}
													Static49.aString28 = local6.aString66 + "<col=ffffff>";
												}
												local430 = local6.anIntArray523[local296];
												if (local6.anIntArray516 == null) {
													local6.anIntArray516 = new int[local6.aByteArray96.length];
												}
												if (local430 == 0) {
													local6.anIntArray516[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray516[local296] = Static24.anInt5323 + local430;
												}
											}
										}
									} else if (local6.anIntArray516 != null) {
										local6.anIntArray516[local296] = 0;
									}
								}
							}
							if (local258) {
								Static96.method1680(local263.method519() - local22, local6, local263.method518() - local17);
							}
							if (Static281.aClass247_12 != null && Static281.aClass247_12 != local6 && local204 && method900(local6).method3904()) {
								Static232.aClass247_9 = local6;
							}
							if (local6 == Static57.aClass247_1) {
								Static390.aBoolean584 = true;
								Static455.anInt5535 = local17;
								Static373.anInt6383 = local22;
							}
							if (local6.aBoolean612 || local6.anInt6842 != 0) {
								@Pc(515) Class4_Sub34 local515;
								if (local204 && Static430.anInt3862 != 0 && local6.anObjectArray24 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean475 = true;
									local515.aClass247_15 = local6;
									local515.anInt5252 = Static430.anInt3862;
									local515.anObjectArray4 = local6.anObjectArray24;
									Static291.aClass183_35.method4137(local515);
								}
								if (Static281.aClass247_12 != null || Static234.aBoolean411 || local6.anInt6842 != Static329.anInt5689 && Static64.anInt1367 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6842 != 0) {
									if (local6.anInt6842 == Static21.anInt295 || local6.anInt6842 == Static38.anInt671) {
										Static198.aClass247_7 = local6;
										if (Static10.aClass242_1 != null) {
											Static10.aClass242_1.method5248(local6.anInt6805, Static122.aClass19_16);
										}
										if (local6.anInt6842 == Static21.anInt295) {
											if (!Static234.aBoolean411 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static184.method2920(Static122.aClass19_16, arg8, arg9);
												for (@Pc(598) Class3_Sub4 local598 = (Class3_Sub4) Static101.aClass84_5.method2312(); local598 != null; local598 = (Class3_Sub4) Static101.aClass84_5.method2309()) {
													if (arg8 >= local598.anInt4019 && arg8 < local598.anInt4022 && arg9 >= local598.anInt4023 && arg9 < local598.anInt4021) {
														Static314.method4198();
														Static112.method2032(local598.aClass16_Sub1_Sub5_1);
													}
												}
											}
											Static361.method4870(local22, local6, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6842 == Static155.anInt3645) {
										if (local6.method5312(Static122.aClass19_16) == null || Static184.anInt3532 != 0 && Static184.anInt3532 != 3 || Static234.aBoolean411 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray524[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray519[local670]) {
											continue;
										}
										local296 -= local6.anInt6833 / 2;
										local670 -= local6.anInt6805 / 2;
										if (Static111.anInt2386 == 4) {
											local709 = (int) Static368.aFloat192 & 0x3FFF;
										} else {
											local709 = (int) Static368.aFloat192 + Static175.anInt3399 & 0x3FFF;
										}
										@Pc(721) int local721 = Class50_Sub1.anIntArray225[local709];
										@Pc(725) int local725 = Class50_Sub1.anIntArray224[local709];
										if (Static111.anInt2386 != 4) {
											local721 = local721 * (Static110.anInt2374 + 256) >> 8;
											local725 = local725 * (Static110.anInt2374 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static111.anInt2386 == 4) {
											local775 = (Static428.anInt7059 >> 7) + (local754 >> 2);
											local783 = (Static452.anInt7360 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() - 1) * 64;
											local775 = (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 - local792 >> 7) + (local754 >> 2);
											local783 = (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 - local792 >> 7) - (local764 >> 2);
										}
										if (Static341.aBoolean599 && (Static434.anInt7378 & 0x40) != 0) {
											@Pc(825) Class247 local825 = Static378.method3230(Static408.anInt6726, Static23.anInt350);
											if (local825 == null) {
												Static336.method5139();
											} else {
												Static380.method5017(19, false, 1L, local775, " ->", true, Static388.aString62, local783, local6.anInt6779, Static273.anInt5120);
											}
											continue;
										}
										if (Static393.aClass121_3 == Static317.aClass121_2) {
											Static380.method5017(59, false, 1L, local775, "", true, Static218.aClass83_83.method2267(Static178.anInt3423), local783, -1, -1);
										}
										Static380.method5017(44, false, 1L, local775, "", true, Static167.aString35, local783, -1, Static220.anInt4097);
										continue;
									}
									if (local6.anInt6842 == Static329.anInt5689) {
										Static81.aClass247_2 = local6;
										if (local204) {
											Static423.aBoolean653 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method518() - local17 - local6.anInt6833 / 2) * 2.0D / (double) Static148.aFloat178);
											local670 = (int) -((double) (local263.method519() - local22 - local6.anInt6805 / 2) * 2.0D / (double) Static148.aFloat178);
											local430 = Static314.anInt5471 + local296 + Static148.anInt5732;
											local709 = Static46.anInt5156 + local670 + Static148.anInt5724;
											@Pc(939) Class4_Sub1_Sub5 local939 = Static107.method1990();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method930(local430, local944, local709);
											if (local944 != null) {
												if (Static384.aClass244_1.method5489(82) && Static104.anInt2252 > 0) {
													Static200.method3168(local944[0], local944[2], local944[1]);
													continue;
												}
												Static219.aBoolean588 = true;
												Static155.anInt3644 = local944[0];
												Static263.anInt4958 = local944[1];
												Static445.anInt7274 = local944[2];
											}
											Static64.anInt1367 = 1;
											Static105.aBoolean218 = false;
											Static187.anInt3559 = Static420.aClass80_1.method2234();
											Static452.anInt7359 = Static420.aClass80_1.method2230();
											continue;
										}
										if (local248 && Static64.anInt1367 > 0) {
											if (Static64.anInt1367 == 1 && (Static187.anInt3559 != Static420.aClass80_1.method2234() || Static452.anInt7359 != Static420.aClass80_1.method2230())) {
												Static450.anInt7339 = Static314.anInt5471;
												Static96.anInt1933 = Static46.anInt5156;
												Static64.anInt1367 = 2;
											}
											if (Static64.anInt1367 == 2) {
												Static105.aBoolean218 = true;
												Static4.method4663(Static450.anInt7339 + (int) ((double) (Static187.anInt3559 - Static420.aClass80_1.method2234()) * 2.0D / (double) Static148.aFloat179));
												Static453.method5679(Static96.anInt1933 - (int) ((double) (Static452.anInt7359 - Static420.aClass80_1.method2230()) * 2.0D / (double) Static148.aFloat179));
											}
											continue;
										}
										if (Static64.anInt1367 > 0 && !Static105.aBoolean218) {
											if ((Static64.anInt1361 == 1 || Static158.method2677()) && Static407.anInt6710 > 2) {
												Static102.method1794(Static187.anInt3559, Static452.anInt7359);
											} else if (Static14.method143()) {
												Static102.method1794(Static187.anInt3559, Static452.anInt7359);
											}
										}
										Static64.anInt1367 = 0;
										continue;
									}
									if (local6.anInt6842 == Static186.anInt3548) {
										if (local248) {
											Static79.method1395(local6.anInt6833, Static420.aClass80_1.method2234() - local17, local6.anInt6805, Static420.aClass80_1.method2230() - local22);
										}
										continue;
									}
									if (local6.anInt6842 == Static266.anInt4982) {
										Static40.method697(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean617 && local258) {
									local6.aBoolean617 = true;
									if (local6.anObjectArray12 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean475 = true;
										local515.aClass247_15 = local6;
										local515.anInt5254 = local263.method518() - local17;
										local515.anInt5252 = local263.method519() - local22;
										local515.anObjectArray4 = local6.anObjectArray12;
										Static291.aClass183_35.method4137(local515);
									}
								}
								if (local6.aBoolean617 && local248 && local6.anObjectArray23 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean475 = true;
									local515.aClass247_15 = local6;
									local515.anInt5254 = Static420.aClass80_1.method2234() - local17;
									local515.anInt5252 = Static420.aClass80_1.method2230() - local22;
									local515.anObjectArray4 = local6.anObjectArray23;
									Static291.aClass183_35.method4137(local515);
								}
								if (local6.aBoolean617 && !local248) {
									local6.aBoolean617 = false;
									if (local6.anObjectArray33 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean475 = true;
										local515.aClass247_15 = local6;
										local515.anInt5254 = Static420.aClass80_1.method2234() - local17;
										local515.anInt5252 = Static420.aClass80_1.method2230() - local22;
										local515.anObjectArray4 = local6.anObjectArray33;
										Static39.aClass183_3.method4137(local515);
									}
								}
								if (local248 && local6.anObjectArray22 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean475 = true;
									local515.aClass247_15 = local6;
									local515.anInt5254 = Static420.aClass80_1.method2234() - local17;
									local515.anInt5252 = Static420.aClass80_1.method2230() - local22;
									local515.anObjectArray4 = local6.anObjectArray22;
									Static291.aClass183_35.method4137(local515);
								}
								if (!local6.aBoolean611 && local204) {
									local6.aBoolean611 = true;
									if (local6.anObjectArray32 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean475 = true;
										local515.aClass247_15 = local6;
										local515.anInt5254 = Static420.aClass80_1.method2234() - local17;
										local515.anInt5252 = Static420.aClass80_1.method2230() - local22;
										local515.anObjectArray4 = local6.anObjectArray32;
										Static291.aClass183_35.method4137(local515);
									}
								}
								if (local6.aBoolean611 && local204 && local6.anObjectArray27 != null) {
									local515 = new Class4_Sub34();
									local515.aBoolean475 = true;
									local515.aClass247_15 = local6;
									local515.anInt5254 = Static420.aClass80_1.method2234() - local17;
									local515.anInt5252 = Static420.aClass80_1.method2230() - local22;
									local515.anObjectArray4 = local6.anObjectArray27;
									Static291.aClass183_35.method4137(local515);
								}
								if (local6.aBoolean611 && !local204) {
									local6.aBoolean611 = false;
									if (local6.anObjectArray9 != null) {
										local515 = new Class4_Sub34();
										local515.aBoolean475 = true;
										local515.aClass247_15 = local6;
										local515.anInt5254 = Static420.aClass80_1.method2234() - local17;
										local515.anInt5252 = Static420.aClass80_1.method2230() - local22;
										local515.anObjectArray4 = local6.anObjectArray9;
										Static39.aClass183_3.method4137(local515);
									}
								}
								if (local6.anObjectArray8 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray8;
									Static237.aClass183_52.method4137(local515);
								}
								@Pc(1483) Class4_Sub34 local1483;
								if (local6.anObjectArray30 != null && Static314.anInt5473 > local6.anInt6827) {
									if (local6.anIntArray518 == null || Static314.anInt5473 - local6.anInt6827 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass247_15 = local6;
										local515.anObjectArray4 = local6.anObjectArray30;
										Static291.aClass183_35.method4137(local515);
									} else {
										label678: for (local296 = local6.anInt6827; local296 < Static314.anInt5473; local296++) {
											local670 = Static143.anIntArray184[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray518.length; local430++) {
												if (local6.anIntArray518[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass247_15 = local6;
													local1483.anObjectArray4 = local6.anObjectArray30;
													Static291.aClass183_35.method4137(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6827 = Static314.anInt5473;
								}
								if (local6.anObjectArray34 != null && Static218.anInt4042 > local6.anInt6806) {
									if (local6.anIntArray517 == null || Static218.anInt4042 - local6.anInt6806 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass247_15 = local6;
										local515.anObjectArray4 = local6.anObjectArray34;
										Static291.aClass183_35.method4137(local515);
									} else {
										label654: for (local296 = local6.anInt6806; local296 < Static218.anInt4042; local296++) {
											local670 = Static277.anIntArray337[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray517.length; local430++) {
												if (local6.anIntArray517[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass247_15 = local6;
													local1483.anObjectArray4 = local6.anObjectArray34;
													Static291.aClass183_35.method4137(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt6806 = Static218.anInt4042;
								}
								if (local6.anObjectArray18 != null && Static292.anInt5255 > local6.anInt6847) {
									if (local6.anIntArray515 == null || Static292.anInt5255 - local6.anInt6847 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass247_15 = local6;
										local515.anObjectArray4 = local6.anObjectArray18;
										Static291.aClass183_35.method4137(local515);
									} else {
										label630: for (local296 = local6.anInt6847; local296 < Static292.anInt5255; local296++) {
											local670 = Static8.anIntArray7[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray515.length; local430++) {
												if (local6.anIntArray515[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass247_15 = local6;
													local1483.anObjectArray4 = local6.anObjectArray18;
													Static291.aClass183_35.method4137(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt6847 = Static292.anInt5255;
								}
								if (local6.anObjectArray19 != null && Static140.anInt2841 > local6.anInt6839) {
									if (local6.anIntArray520 == null || Static140.anInt2841 - local6.anInt6839 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass247_15 = local6;
										local515.anObjectArray4 = local6.anObjectArray19;
										Static291.aClass183_35.method4137(local515);
									} else {
										label606: for (local296 = local6.anInt6839; local296 < Static140.anInt2841; local296++) {
											local670 = Static393.anIntArray500[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray520.length; local430++) {
												if (local6.anIntArray520[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass247_15 = local6;
													local1483.anObjectArray4 = local6.anObjectArray19;
													Static291.aClass183_35.method4137(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt6839 = Static140.anInt2841;
								}
								if (local6.anObjectArray36 != null && Static346.anInt5948 > local6.anInt6820) {
									if (local6.anIntArray522 == null || Static346.anInt5948 - local6.anInt6820 > 32) {
										local515 = new Class4_Sub34();
										local515.aClass247_15 = local6;
										local515.anObjectArray4 = local6.anObjectArray36;
										Static291.aClass183_35.method4137(local515);
									} else {
										label582: for (local296 = local6.anInt6820; local296 < Static346.anInt5948; local296++) {
											local670 = Static39.anIntArray40[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray522.length; local430++) {
												if (local6.anIntArray522[local430] == local670) {
													local1483 = new Class4_Sub34();
													local1483.aClass247_15 = local6;
													local1483.anObjectArray4 = local6.anObjectArray36;
													Static291.aClass183_35.method4137(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6820 = Static346.anInt5948;
								}
								if (Static296.anInt5303 > local6.anInt6824 && local6.anObjectArray11 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray11;
									Static291.aClass183_35.method4137(local515);
								}
								if (Static244.anInt3027 > local6.anInt6824 && local6.anObjectArray35 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray35;
									Static291.aClass183_35.method4137(local515);
								}
								if (Static381.anInt6418 > local6.anInt6824 && local6.anObjectArray31 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray31;
									Static291.aClass183_35.method4137(local515);
								}
								if (Static246.anInt4589 > local6.anInt6824 && local6.anObjectArray13 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray13;
									Static291.aClass183_35.method4137(local515);
								}
								if (Static308.anInt5413 > local6.anInt6824 && local6.anObjectArray14 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray14;
									Static291.aClass183_35.method4137(local515);
								}
								local6.anInt6824 = Static325.anInt5640;
								if (local6.anObjectArray20 != null) {
									for (local296 = 0; local296 < Static190.anInt3602; local296++) {
										@Pc(1951) Class4_Sub34 local1951 = new Class4_Sub34();
										local1951.aClass247_15 = local6;
										local1951.anInt5253 = Static164.aClass30Array4[local296].method746();
										local1951.anInt5251 = Static164.aClass30Array4[local296].method749();
										local1951.anObjectArray4 = local6.anObjectArray20;
										Static291.aClass183_35.method4137(local1951);
									}
								}
								if (Static344.aBoolean549 && local6.anObjectArray6 != null) {
									local515 = new Class4_Sub34();
									local515.aClass247_15 = local6;
									local515.anObjectArray4 = local6.anObjectArray6;
									Static291.aClass183_35.method4137(local515);
								}
							}
							if (local6.anInt6840 == 5 && local6.anInt6780 != -1) {
								local6.method5311(Static238.aClass226_1, Static296.aClass217_1).method5248(local6.anInt6805, Static122.aClass19_16);
							}
							Static69.method2851(local6);
							if (local6.anInt6840 == 0) {
								method901(arg0, local6.anInt6809, local28, local30, local32, local34, local17 - local6.anInt6825, local22 - local6.anInt6849, arg8, arg9);
								if (local6.aClass247Array2 != null) {
									method901(local6.aClass247Array2, local6.anInt6809, local28, local30, local32, local34, local17 - local6.anInt6825, local22 - local6.anInt6849, arg8, arg9);
								}
								@Pc(2073) Class4_Sub43 local2073 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local6.anInt6809);
								if (local2073 != null) {
									if (Static393.aClass121_3 == Static196.aClass121_1 && local2073.anInt6981 == 0 && !Static234.aBoolean411 && local204 && !Static415.aBoolean626) {
										Static314.method4198();
									}
									Static59.method988(local28, local22, local32, local2073.anInt6979, local30, local17, local34, arg9, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static69.method2851(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method902(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static33.anInt606;
		@Pc(3) int[] local3 = Static99.anIntArray157;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static12.anInt163; local5++) {
			@Pc(15) Class16_Sub1_Sub5 local15;
			if (local5 < local1) {
				local15 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local3[local5]];
			} else {
				local15 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local5 - local1]];
			}
			if (local15.aByte82 == arg0 && local15.anInt6025 >= 0) {
				@Pc(35) int local35 = local15.method4751();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6893 & 0x7F) != 0 || (local15.anInt6892 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6893 & 0x7F) != 64 || (local15.anInt6892 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6893 >> 7;
					local76 = local15.anInt6892 >> 7;
					if (local15.anInt6025 > Static50.anIntArrayArray8[local71][local76]) {
						Static50.anIntArrayArray8[local71][local76] = local15.anInt6025;
						Static44.anIntArrayArray7[local71][local76] = 1;
					} else if (local15.anInt6025 == Static50.anIntArrayArray8[local71][local76]) {
						local112 = Static44.anIntArrayArray7[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6893 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6892 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6893 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6892 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6025 > Static50.anIntArrayArray8[local154][local157]) {
								Static50.anIntArrayArray8[local154][local157] = local15.anInt6025;
								Static44.anIntArrayArray7[local154][local157] = 1;
							} else if (local15.anInt6025 == Static50.anIntArrayArray8[local154][local157]) {
								local112 = Static44.anIntArrayArray7[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method904() {
		@Pc(1) int local1 = Static33.anInt606;
		@Pc(3) int[] local3 = Static99.anIntArray157;
		@Pc(11) int local11 = Static66.aBoolean508 ? local1 : local1 + Static12.anInt163;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class16_Sub1_Sub5 local23;
			if (local13 < local1) {
				local23 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local3[local13]];
			} else {
				local23 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local13 - local1]];
			}
			if (local23.anInt6025 >= 0) {
				@Pc(39) int local39 = local23.method4751();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6893 & 0x7F) == 0 && (local23.anInt6892 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6893 & 0x7F) == 64 && (local23.anInt6892 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class16_Sub1_Sub5_Sub1 && local23.aClass4_Sub23_3 != null && Static24.anInt5323 >= local23.aClass4_Sub23_3.anInt3191 && Static24.anInt5323 < local23.aClass4_Sub23_3.anInt3202) {
					((Class16_Sub1_Sub5_Sub1) local23).aBoolean402 = false;
				}
				local23.anInt6889 = Static13.method135(local23.anInt6893, local23.aByte82, local23.anInt6892);
				Static324.method4385(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!uu;)Lclient!uu;")
	public static Class247 method906(@OriginalArg(0) Class247 arg0) {
		@Pc(4) int local4 = method900(arg0).method3910();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static392.method5121(arg0.anInt6850);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method907() {
		Static304.anInt5369 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static12.anInt163; local3++) {
			@Pc(10) Class16_Sub1_Sub5_Sub2 local10 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local3]];
			if (local10.aBoolean561 && local10.method4756() != -1) {
				@Pc(28) int local28 = (local10.method4751() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6893 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6892 - local28 >> 7;
				@Pc(49) Class16_Sub1_Sub5 local49 = Static285.method3513(local42, local35, local10.aByte82);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6037;
					if (local49 instanceof Class16_Sub1_Sub5_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6071 == 0 && local49.method4756() != -1) {
						Static225.anIntArray290[Static304.anInt5369] = local54;
						Static414.anIntArray525[Static304.anInt5369] = local54;
						Static304.anInt5369++;
						local49.anInt6071++;
					}
					Static225.anIntArray290[Static304.anInt5369] = local54;
					Static414.anIntArray525[Static304.anInt5369] = local10.anInt6037 + 2048;
					Static304.anInt5369++;
					local49.anInt6071++;
				}
			}
		}
		Static77.method1387(Static414.anIntArray525, 0, Static225.anIntArray290, Static304.anInt5369 - 1);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method909() {
		for (@Pc(1) int local1 = 0; local1 < Static326.anInt5666; local1++) {
			@Pc(6) int[] local6 = Static50.anIntArrayArray8[local1];
			for (@Pc(8) int local8 = 0; local8 < Static283.anInt5187; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method911() {
		@Pc(1) int local1 = Static33.anInt606;
		@Pc(3) int[] local3 = Static99.anIntArray157;
		@Pc(20) boolean local20 = Static323.aClass50_Sub1_1.anInt3433 == 1 && local1 > 200 || Static323.aClass50_Sub1_1.anInt3433 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class16_Sub1_Sub5_Sub1 local29 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local3[local22]];
			if (local29.method3425()) {
				local29.method5346();
				if (local29.aShort94 >= 0 && local29.aShort96 >= 0 && local29.aShort97 < Static326.anInt5666 && local29.aShort95 < Static283.anInt5187) {
					local29.aBoolean402 = local29.aBoolean562 ? local20 : false;
					if (local29 == Static1.aClass16_Sub1_Sub5_Sub1_1) {
						local29.anInt6025 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean561) {
							local75++;
						}
						if (local29.anInt6072 > Static24.anInt5323) {
							local75 += 2;
						}
						local75 += 5 - local29.method4751() << 2;
						if (local29.aBoolean400) {
							local75 += 512;
						} else {
							if (Static268.anInt4991 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6025 = local75 + 1;
					}
				} else {
					local29.anInt6025 = -1;
				}
			} else {
				local29.anInt6025 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static12.anInt163; local116++) {
			@Pc(123) Class16_Sub1_Sub5_Sub2 local123 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local116]];
			if (local123.method4762() && local123.aClass264_1.method5572(Static257.aClass114_1)) {
				local123.method5346();
				if (local123.aShort94 >= 0 && local123.aShort96 >= 0 && local123.aShort97 < Static326.anInt5666 && local123.aShort95 < Static283.anInt5187) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean561) {
						local160++;
					}
					if (local123.anInt6072 > Static24.anInt5323) {
						local160 += 2;
					}
					local160 += 5 - local123.method4751() << 2;
					if (Static268.anInt4991 == 0) {
						if (local123.aClass264_1.aBoolean685) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static268.anInt4991 == 1) {
						if (local123.aClass264_1.aBoolean685) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass264_1.aBoolean681) {
						local160 += 1024;
					} else if (!local123.aClass264_1.aBoolean680) {
						local160 += 256;
					}
					local123.anInt6025 = local160 + 1;
				} else {
					local123.anInt6025 = -1;
				}
			} else {
				local123.anInt6025 = -1;
			}
		}
		for (local75 = 0; local75 < Static306.aClass38Array1.length; local75++) {
			@Pc(226) Class38 local226 = Static306.aClass38Array1[local75];
			if (local226 != null) {
				if (local226.anInt891 == 1) {
					@Pc(237) Class16_Sub1_Sub5_Sub2 local237 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local226.anInt885];
					if (local237 != null && local237.anInt6025 >= 0) {
						local237.anInt6025 += 2048;
					}
				} else if (local226.anInt891 == 10) {
					@Pc(258) Class16_Sub1_Sub5_Sub1 local258 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local226.anInt885];
					if (local258 != null && local258 != Static1.aClass16_Sub1_Sub5_Sub1_1 && local258.anInt6025 >= 0) {
						local258.anInt6025 += 2048;
					}
				}
			}
		}
	}
}
