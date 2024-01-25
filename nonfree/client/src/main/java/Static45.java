import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!rn;")
	public static Class18 aClass18_3;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "[I")
	public static final int[] anIntArray186 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!client", name = "S", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_18 = new Class32("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_16 = new Class11(73, -1);

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method772() {
		Static80.anInt1468 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static171.anInt3311; local3++) {
			@Pc(10) Class1_Sub5_Sub1_Sub2 local10 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local3]];
			if (local10.aBoolean459 && local10.method5551() != -1) {
				@Pc(28) int local28 = (local10.method5547() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6390 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6386 - local28 >> 7;
				@Pc(49) Class1_Sub5_Sub1 local49 = Static127.method2519(local10.aByte69, local35, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6413;
					if (local49 instanceof Class1_Sub5_Sub1_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6416 == 0 && local49.method5551() != -1) {
						Static293.anIntArray1333[Static80.anInt1468] = local54;
						Static55.anIntArray226[Static80.anInt1468] = local54;
						Static80.anInt1468++;
						local49.anInt6416++;
					}
					Static293.anIntArray1333[Static80.anInt1468] = local54;
					Static55.anIntArray226[Static80.anInt1468] = local10.anInt6413 + 2048;
					Static80.anInt1468++;
					local49.anInt6416++;
				}
			}
		}
		Static33.method599(0, Static80.anInt1468 - 1, Static55.anIntArray226, Static293.anIntArray1333);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method773() {
		for (@Pc(1) int local1 = 0; local1 < Static246.anInt4374; local1++) {
			@Pc(6) int[] local6 = Static199.anIntArrayArray30[local1];
			for (@Pc(8) int local8 = 0; local8 < Static185.anInt3485; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ae;)Lclient!ae;")
	public static Class4 method774(@OriginalArg(0) Class4 arg0) {
		@Pc(4) int local4 = method784(arg0).method637();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static380.method5560(arg0.anInt88);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method775() {
		for (@Pc(1) int local1 = 0; local1 < Static104.anInt2157; local1++) {
			if (!Static196.aBooleanArray24[local1]) {
				@Pc(10) Class2_Sub17_Sub1 local10 = Static386.aClass2_Sub17_Sub1Array3[local1];
				@Pc(13) int local13 = local10.anInt2051;
				@Pc(18) int local18 = local10.anInt2043 - Static241.anInt4320;
				@Pc(26) int local26 = (local18 * 2 >> Static333.anInt5694) + 1;
				@Pc(28) int local28 = 0;
				@Pc(33) int[] local33 = new int[local26 * local26];
				@Pc(40) int local40 = local10.anInt2042 - local18 >> Static333.anInt5694;
				@Pc(47) int local47 = local10.anInt2037 - local18 >> Static333.anInt5694;
				@Pc(54) int local54 = local10.anInt2037 + local18 >> Static333.anInt5694;
				if (local47 < 0) {
					local28 = -local47;
					local47 = 0;
				}
				if (local54 >= Static341.anInt5833) {
					local54 = Static341.anInt5833 - 1;
				}
				for (@Pc(71) int local71 = local47; local71 <= local54; local71++) {
					@Pc(77) short local77 = local10.aShortArray30[local28];
					@Pc(81) int local81 = local77 >>> 8;
					@Pc(87) int local87 = local28 * local26 + local81;
					@Pc(93) int local93 = local40 + (local77 >>> 8);
					@Pc(101) int local101 = local93 + (local77 & 0xFF) - 1;
					if (local93 < 0) {
						local87 -= local93;
						local93 = 0;
					}
					if (local101 >= Static12.anInt312) {
						local101 = Static12.anInt312 - 1;
					}
					for (@Pc(118) int local118 = local93; local118 <= local101; local118++) {
						@Pc(121) byte local121 = 1;
						@Pc(134) Class1_Sub5 local134 = Static292.method4418(local13, local118, local71, wt.class);
						if (local134 != null && local134.aByte68 != 0) {
							@Pc(152) boolean local152;
							@Pc(161) boolean local161;
							@Pc(175) short local175;
							@Pc(181) int local181;
							@Pc(187) int local187;
							if (local134.aByte68 == 1) {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 + 1 <= local54) {
									local175 = local10.aShortArray30[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 - 1 >= local47) {
									local175 = local10.aShortArray30[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 4;
								} else if (local161 && !local152) {
									local121 = 2;
								}
							} else {
								local152 = local118 - 1 >= local93;
								local161 = local118 + 1 <= local101;
								if (!local152 && local71 - 1 >= local47) {
									local175 = local10.aShortArray30[local28 - 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local152 = local118 > local181 && local118 < local187;
								}
								if (!local161 && local71 + 1 <= local54) {
									local175 = local10.aShortArray30[local28 + 1];
									local181 = local40 + (local175 >>> 8);
									local187 = local181 + (local175 & 0xFF);
									local161 = local118 > local181 && local118 < local187;
								}
								if (local152 && !local161) {
									local121 = 3;
								} else if (local161 && !local152) {
									local121 = 5;
								}
							}
						}
						local33[local87++] = local121;
					}
					local28++;
				}
				Static196.aBooleanArray24[local1] = true;
				Static350.aClass107Array4[local13].method4676(local10, local33);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method780() {
		@Pc(1) int local1 = Static335.anInt5738;
		@Pc(3) int[] local3 = Static242.anIntArray933;
		@Pc(11) int local11 = Static209.aBoolean292 ? local1 : local1 + Static171.anInt3311;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub5_Sub1 local23;
			if (local13 < local1) {
				local23 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local13 - local1]];
			}
			if (local23.anInt6438 >= 0) {
				@Pc(39) int local39 = local23.method5547();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6390 & 0x7F) == 0 && (local23.anInt6386 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6390 & 0x7F) == 64 && (local23.anInt6386 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class1_Sub5_Sub1_Sub1 && local23.aClass2_Sub42_3 != null && Static253.anInt4469 >= local23.aClass2_Sub42_3.anInt6014 && Static253.anInt4469 < local23.aClass2_Sub42_3.anInt6016) {
					((Class1_Sub5_Sub1_Sub1) local23).aBoolean179 = false;
				}
				local23.anInt6387 = Static170.method3006(local23.anInt6390, local23.anInt6386, local23.aByte69);
				Static356.method5230(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method781(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static335.anInt5738;
		@Pc(3) int[] local3 = Static242.anIntArray933;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static171.anInt3311; local5++) {
			@Pc(15) Class1_Sub5_Sub1 local15;
			if (local5 < local1) {
				local15 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local5 - local1]];
			}
			if (local15.aByte69 == arg0 && local15.anInt6438 >= 0) {
				@Pc(35) int local35 = local15.method5547();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6390 & 0x7F) != 0 || (local15.anInt6386 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6390 & 0x7F) != 64 || (local15.anInt6386 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6390 >> 7;
					local76 = local15.anInt6386 >> 7;
					if (local15.anInt6438 > Static199.anIntArrayArray30[local71][local76]) {
						Static199.anIntArrayArray30[local71][local76] = local15.anInt6438;
						Static59.anIntArrayArray10[local71][local76] = 1;
					} else if (local15.anInt6438 == Static199.anIntArrayArray30[local71][local76]) {
						local112 = Static59.anIntArrayArray10[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6390 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6386 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6390 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6386 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6438 > Static199.anIntArrayArray30[local154][local157]) {
								Static199.anIntArrayArray30[local154][local157] = local15.anInt6438;
								Static59.anIntArrayArray10[local154][local157] = 1;
							} else if (local15.anInt6438 == Static199.anIntArrayArray30[local154][local157]) {
								local112 = Static59.anIntArrayArray10[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ae;IIIIIIIII)V")
	public static void method782(@OriginalArg(0) Class4[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class4 local6 = arg0[local1];
			if (local6 != null && local6.anInt88 == arg1) {
				@Pc(17) int local17 = local6.anInt71 + arg6;
				@Pc(22) int local22 = local6.anInt48 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt125 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt101;
					@Pc(45) int local45 = local22 + local6.anInt113;
					if (local6.anInt125 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt125 == 0 || local6.aBoolean5 || method784(local6).anInt750 != 0 || local6 == Static102.aClass4_11 || local6.anInt133 == Static24.anInt537) {
					if (!method788(local6)) {
						if (local6 == Static242.aClass4_22) {
							Static264.aBoolean343 = true;
							Static132.anInt2707 = local17;
							Static324.anInt5552 = local22;
						}
						if (local6.aBoolean8 || local28 < local32 && local30 < local34) {
							if (local6.anInt125 == 0 && local6.aBoolean16 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class2_Sub22 local151 = (Class2_Sub22) Static206.aClass30_29.method694(); local151 != null; local151 = (Class2_Sub22) Static206.aClass30_29.method682()) {
									if (local151.aBoolean208) {
										local151.method5617();
										local151.aClass4_15.aBoolean4 = false;
									}
								}
								if (Static254.anInt4494 == 0) {
									Static242.aClass4_22 = null;
									Static102.aClass4_11 = null;
								}
								Static6.anInt204 = 0;
								Static46.aBoolean79 = false;
								Static263.aBoolean342 = false;
								if (!Static269.aBoolean349) {
									Static123.method2499();
								}
							}
							@Pc(207) boolean local207;
							if (Static311.aClass129_1.method2997() >= local28 && Static311.aClass129_1.method2989() >= local30 && Static311.aClass129_1.method2997() < local32 && Static311.aClass129_1.method2989() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static269.aBoolean349 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static289.method4379(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(235) boolean local235 = false;
							if (Static311.aClass129_1.method2990() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static29.aClass2_Sub19_1 != null && Static29.aClass2_Sub19_1.method2379() == 0 && Static29.aClass2_Sub19_1.method2378() >= local28 && Static29.aClass2_Sub19_1.method2380() >= local30 && Static29.aClass2_Sub19_1.method2378() < local32 && Static29.aClass2_Sub19_1.method2380() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray2 != null) {
								for (local278 = 0; local278 < local6.aByteArray2.length; local278++) {
									if (Static48.aClass69_1.method2261(local6.aByteArray2[local278])) {
										if (local6.anIntArray36 == null || Static253.anInt4469 >= local6.anIntArray36[local278]) {
											@Pc(310) byte local310 = local6.aByteArray3[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static48.aClass69_1.method2261(86) && !Static48.aClass69_1.method2261(82) && !Static48.aClass69_1.method2261(81)) && ((local310 & 0x2) == 0 || Static48.aClass69_1.method2261(86)) && ((local310 & 0x1) == 0 || Static48.aClass69_1.method2261(82)) && ((local310 & 0x4) == 0 || Static48.aClass69_1.method2261(81))) {
												Static168.method2960(local6.anInt94, "", local278 + 1, -1);
												local374 = local6.anIntArray43[local278];
												if (local6.anIntArray36 == null) {
													local6.anIntArray36 = new int[local6.aByteArray2.length];
												}
												if (local374 == 0) {
													local6.anIntArray36[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray36[local278] = Static253.anInt4469 + local374;
												}
											}
										}
									} else if (local6.anIntArray36 != null) {
										local6.anIntArray36[local278] = 0;
									}
								}
							}
							if (local245) {
								Static105.method2214(local6, Static29.aClass2_Sub19_1.method2380() - local22, Static29.aClass2_Sub19_1.method2378() - local17);
							}
							if (Static242.aClass4_22 != null && Static242.aClass4_22 != local6 && local207 && method784(local6).method638()) {
								Static18.aClass4_4 = local6;
							}
							if (local6 == Static102.aClass4_11) {
								Static41.aBoolean62 = true;
								Static350.anInt3739 = local17;
								Static108.anInt5289 = local22;
							}
							if (local6.aBoolean5 || local6.anInt133 != 0) {
								@Pc(459) Class2_Sub22 local459;
								if (local207 && Static303.anInt5140 != 0 && local6.anObjectArray1 != null) {
									local459 = new Class2_Sub22();
									local459.aBoolean208 = true;
									local459.aClass4_15 = local6;
									local459.anInt2776 = Static303.anInt5140;
									local459.anObjectArray33 = local6.anObjectArray1;
									Static206.aClass30_29.method685(local459);
								}
								if (Static242.aClass4_22 != null || Static269.aBoolean349 || local6.anInt133 != Static193.anInt3623 && Static6.anInt204 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt133 != 0) {
									if (local6.anInt133 == Static150.anInt2971 || local6.anInt133 == Static280.anInt4824) {
										Static68.aClass4_8 = local6;
										if (Static103.aClass33_1 != null) {
											Static103.aClass33_1.method709(Static111.aClass63_3, local6.anInt113);
										}
										if (local6.anInt133 == Static150.anInt2971) {
											if (!Static269.aBoolean349 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static281.method4299(arg9, Static111.aClass63_3, arg8);
												for (@Pc(542) Class10_Sub4 local542 = (Class10_Sub4) Static303.aClass154_7.method3479(); local542 != null; local542 = (Class10_Sub4) Static303.aClass154_7.method3483()) {
													if (arg8 >= local542.anInt2785 && arg8 < local542.anInt2791 && arg9 >= local542.anInt2787 && arg9 < local542.anInt2788) {
														Static123.method2499();
														Static230.method3729(local542.aClass1_Sub5_Sub1_1);
													}
												}
											}
											Static270.method2995(local17, local6, local22);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt133 == Static24.anInt537) {
										if (local6.method83(Static111.aClass63_3) == null || Static233.anInt4156 != 0 && Static233.anInt4156 != 3 || Static269.aBoolean349 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray41[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray35[local614]) {
											continue;
										}
										local278 -= local6.anInt101 / 2;
										local614 -= local6.anInt113 / 2;
										if (Static79.anInt4624 == 4) {
											local653 = (int) Static127.aFloat41 & 0x3FFF;
										} else {
											local653 = (int) Static127.aFloat41 + Static190.anInt3567 & 0x3FFF;
										}
										@Pc(665) int local665 = Class177.anIntArray843[local653];
										@Pc(669) int local669 = Class177.anIntArray844[local653];
										if (Static79.anInt4624 != 4) {
											local665 = local665 * (Static30.anInt643 + 256) >> 8;
											local669 = local669 * (Static30.anInt643 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static79.anInt4624 == 4) {
											local719 = (Static290.anInt5046 >> 7) + (local698 >> 2);
											local727 = (Static295.anInt5082 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static206.aClass1_Sub5_Sub1_Sub1_1.method5547() - 1) * 64;
											local719 = (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6390 - local736 >> 7) + (local698 >> 2);
											local727 = (Static206.aClass1_Sub5_Sub1_Sub1_1.anInt6386 - local736 >> 7) - (local708 >> 2);
										}
										if (Static110.aBoolean180 && (Static33.anInt698 & 0x40) != 0) {
											@Pc(769) Class4 local769 = Static164.method2913(Static309.anInt5189, Static23.anInt501);
											if (local769 == null) {
												Static259.method4010();
											} else {
												Static137.method4192(false, " ->", true, Static391.aString68, local719, 1L, 21, local727, local6.anInt58, Static345.anInt6624);
											}
											continue;
										}
										if (Static275.aClass150_3 == Static119.aClass150_1) {
											Static137.method4192(false, "", true, Static181.aClass32_96.method701(Static107.anInt2498), local719, 1L, 51, local727, -1, -1);
										}
										Static137.method4192(false, "", true, Static82.aString17, local719, 1L, 60, local727, -1, -1);
										continue;
									}
									if (local6.anInt133 == Static193.anInt3623) {
										Static240.aClass4_18 = local6;
										if (local207) {
											Static46.aBoolean79 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static29.aClass2_Sub19_1.method2378() - local17 - local6.anInt101 / 2) * 2.0D / (double) Static338.aFloat53);
											local614 = (int) -((double) (Static29.aClass2_Sub19_1.method2380() - local22 - local6.anInt113 / 2) * 2.0D / (double) Static338.aFloat53);
											local374 = Static82.anInt1484 + local278 + Static338.anInt3305;
											local653 = Static308.anInt5181 + local614 + Static338.anInt3307;
											@Pc(883) Class2_Sub10_Sub8 local883 = Static367.method5420();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.method1858(local888, local653, local374);
											if (local888 != null) {
												if (Static48.aClass69_1.method2261(82) && Static303.anInt5133 > 0) {
													Static304.method5619(local888[1], local888[0], local888[2]);
													continue;
												}
												Static263.aBoolean342 = true;
												Static369.anInt6249 = local888[0];
												Static193.anInt3630 = local888[1];
												Static70.anInt1247 = local888[2];
											}
											Static6.anInt204 = 1;
											Static145.aBoolean397 = false;
											Static371.anInt6283 = Static311.aClass129_1.method2997();
											Static224.anInt3999 = Static311.aClass129_1.method2989();
											continue;
										}
										if (local235 && Static6.anInt204 > 0) {
											if (Static6.anInt204 == 1 && (Static371.anInt6283 != Static311.aClass129_1.method2997() || Static224.anInt3999 != Static311.aClass129_1.method2989())) {
												Static221.anInt5935 = Static82.anInt1484;
												Static27.anInt598 = Static308.anInt5181;
												Static6.anInt204 = 2;
											}
											if (Static6.anInt204 == 2) {
												Static145.aBoolean397 = true;
												Static355.method5209(Static221.anInt5935 + (int) ((double) (Static371.anInt6283 - Static311.aClass129_1.method2997()) * 2.0D / (double) Static338.aFloat52));
												Static247.method4896(Static27.anInt598 - (int) ((double) (Static224.anInt3999 - Static311.aClass129_1.method2989()) * 2.0D / (double) Static338.aFloat52));
											}
											continue;
										}
										if (Static6.anInt204 > 0 && !Static145.aBoolean397) {
											if ((Static267.anInt4642 == 1 || Static98.method1943()) && Static285.anInt4946 > 2) {
												Static93.method1857(Static224.anInt3999, Static371.anInt6283);
											} else if (Static318.method4779()) {
												Static93.method1857(Static224.anInt3999, Static371.anInt6283);
											}
										}
										Static6.anInt204 = 0;
										continue;
									}
									if (local6.anInt133 == Static228.anInt4043) {
										if (local235) {
											Static347.method5039(Static311.aClass129_1.method2997() - local17, local6.anInt113, Static311.aClass129_1.method2989() - local22, local6.anInt101);
										}
										continue;
									}
									if (local6.anInt133 == Static5.anInt196) {
										Static94.method1873(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean10 && local245) {
									local6.aBoolean10 = true;
									if (local6.anObjectArray11 != null) {
										local459 = new Class2_Sub22();
										local459.aBoolean208 = true;
										local459.aClass4_15 = local6;
										local459.anInt2778 = Static29.aClass2_Sub19_1.method2378() - local17;
										local459.anInt2776 = Static29.aClass2_Sub19_1.method2380() - local22;
										local459.anObjectArray33 = local6.anObjectArray11;
										Static206.aClass30_29.method685(local459);
									}
								}
								if (local6.aBoolean10 && local235 && local6.anObjectArray26 != null) {
									local459 = new Class2_Sub22();
									local459.aBoolean208 = true;
									local459.aClass4_15 = local6;
									local459.anInt2778 = Static311.aClass129_1.method2997() - local17;
									local459.anInt2776 = Static311.aClass129_1.method2989() - local22;
									local459.anObjectArray33 = local6.anObjectArray26;
									Static206.aClass30_29.method685(local459);
								}
								if (local6.aBoolean10 && !local235) {
									local6.aBoolean10 = false;
									if (local6.anObjectArray25 != null) {
										local459 = new Class2_Sub22();
										local459.aBoolean208 = true;
										local459.aClass4_15 = local6;
										local459.anInt2778 = Static311.aClass129_1.method2997() - local17;
										local459.anInt2776 = Static311.aClass129_1.method2989() - local22;
										local459.anObjectArray33 = local6.anObjectArray25;
										Static184.aClass30_27.method685(local459);
									}
								}
								if (local235 && local6.anObjectArray24 != null) {
									local459 = new Class2_Sub22();
									local459.aBoolean208 = true;
									local459.aClass4_15 = local6;
									local459.anInt2778 = Static311.aClass129_1.method2997() - local17;
									local459.anInt2776 = Static311.aClass129_1.method2989() - local22;
									local459.anObjectArray33 = local6.anObjectArray24;
									Static206.aClass30_29.method685(local459);
								}
								if (!local6.aBoolean4 && local207) {
									local6.aBoolean4 = true;
									if (local6.anObjectArray29 != null) {
										local459 = new Class2_Sub22();
										local459.aBoolean208 = true;
										local459.aClass4_15 = local6;
										local459.anInt2778 = Static311.aClass129_1.method2997() - local17;
										local459.anInt2776 = Static311.aClass129_1.method2989() - local22;
										local459.anObjectArray33 = local6.anObjectArray29;
										Static206.aClass30_29.method685(local459);
									}
								}
								if (local6.aBoolean4 && local207 && local6.anObjectArray6 != null) {
									local459 = new Class2_Sub22();
									local459.aBoolean208 = true;
									local459.aClass4_15 = local6;
									local459.anInt2778 = Static311.aClass129_1.method2997() - local17;
									local459.anInt2776 = Static311.aClass129_1.method2989() - local22;
									local459.anObjectArray33 = local6.anObjectArray6;
									Static206.aClass30_29.method685(local459);
								}
								if (local6.aBoolean4 && !local207) {
									local6.aBoolean4 = false;
									if (local6.anObjectArray16 != null) {
										local459 = new Class2_Sub22();
										local459.aBoolean208 = true;
										local459.aClass4_15 = local6;
										local459.anInt2778 = Static311.aClass129_1.method2997() - local17;
										local459.anInt2776 = Static311.aClass129_1.method2989() - local22;
										local459.anObjectArray33 = local6.anObjectArray16;
										Static184.aClass30_27.method685(local459);
									}
								}
								if (local6.anObjectArray3 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray3;
									Static110.aClass30_15.method685(local459);
								}
								@Pc(1427) Class2_Sub22 local1427;
								if (local6.anObjectArray9 != null && Static222.anInt3959 > local6.anInt111) {
									if (local6.anIntArray42 == null || Static222.anInt3959 - local6.anInt111 > 32) {
										local459 = new Class2_Sub22();
										local459.aClass4_15 = local6;
										local459.anObjectArray33 = local6.anObjectArray9;
										Static206.aClass30_29.method685(local459);
									} else {
										label659: for (local278 = local6.anInt111; local278 < Static222.anInt3959; local278++) {
											local614 = Static132.anIntArray559[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray42.length; local374++) {
												if (local6.anIntArray42[local374] == local614) {
													local1427 = new Class2_Sub22();
													local1427.aClass4_15 = local6;
													local1427.anObjectArray33 = local6.anObjectArray9;
													Static206.aClass30_29.method685(local1427);
													break label659;
												}
											}
										}
									}
									local6.anInt111 = Static222.anInt3959;
								}
								if (local6.anObjectArray30 != null && Static200.anInt3685 > local6.anInt108) {
									if (local6.anIntArray39 == null || Static200.anInt3685 - local6.anInt108 > 32) {
										local459 = new Class2_Sub22();
										local459.aClass4_15 = local6;
										local459.anObjectArray33 = local6.anObjectArray30;
										Static206.aClass30_29.method685(local459);
									} else {
										label635: for (local278 = local6.anInt108; local278 < Static200.anInt3685; local278++) {
											local614 = Static190.anIntArray702[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray39.length; local374++) {
												if (local6.anIntArray39[local374] == local614) {
													local1427 = new Class2_Sub22();
													local1427.aClass4_15 = local6;
													local1427.anObjectArray33 = local6.anObjectArray30;
													Static206.aClass30_29.method685(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt108 = Static200.anInt3685;
								}
								if (local6.anObjectArray13 != null && Static212.anInt3858 > local6.anInt98) {
									if (local6.anIntArray37 == null || Static212.anInt3858 - local6.anInt98 > 32) {
										local459 = new Class2_Sub22();
										local459.aClass4_15 = local6;
										local459.anObjectArray33 = local6.anObjectArray13;
										Static206.aClass30_29.method685(local459);
									} else {
										label611: for (local278 = local6.anInt98; local278 < Static212.anInt3858; local278++) {
											local614 = Static392.anIntArray1319[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray37.length; local374++) {
												if (local6.anIntArray37[local374] == local614) {
													local1427 = new Class2_Sub22();
													local1427.aClass4_15 = local6;
													local1427.anObjectArray33 = local6.anObjectArray13;
													Static206.aClass30_29.method685(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt98 = Static212.anInt3858;
								}
								if (local6.anObjectArray2 != null && Static272.anInt4721 > local6.anInt50) {
									if (local6.anIntArray40 == null || Static272.anInt4721 - local6.anInt50 > 32) {
										local459 = new Class2_Sub22();
										local459.aClass4_15 = local6;
										local459.anObjectArray33 = local6.anObjectArray2;
										Static206.aClass30_29.method685(local459);
									} else {
										label587: for (local278 = local6.anInt50; local278 < Static272.anInt4721; local278++) {
											local614 = Static159.anIntArray609[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray40.length; local374++) {
												if (local6.anIntArray40[local374] == local614) {
													local1427 = new Class2_Sub22();
													local1427.aClass4_15 = local6;
													local1427.anObjectArray33 = local6.anObjectArray2;
													Static206.aClass30_29.method685(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt50 = Static272.anInt4721;
								}
								if (local6.anObjectArray17 != null && Static28.anInt607 > local6.anInt65) {
									if (local6.anIntArray38 == null || Static28.anInt607 - local6.anInt65 > 32) {
										local459 = new Class2_Sub22();
										local459.aClass4_15 = local6;
										local459.anObjectArray33 = local6.anObjectArray17;
										Static206.aClass30_29.method685(local459);
									} else {
										label563: for (local278 = local6.anInt65; local278 < Static28.anInt607; local278++) {
											local614 = Static169.anIntArray642[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray38.length; local374++) {
												if (local6.anIntArray38[local374] == local614) {
													local1427 = new Class2_Sub22();
													local1427.aClass4_15 = local6;
													local1427.anObjectArray33 = local6.anObjectArray17;
													Static206.aClass30_29.method685(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt65 = Static28.anInt607;
								}
								if (Static253.anInt4470 > local6.anInt92 && local6.anObjectArray23 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray23;
									Static206.aClass30_29.method685(local459);
								}
								if (Static257.anInt4520 > local6.anInt92 && local6.anObjectArray20 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray20;
									Static206.aClass30_29.method685(local459);
								}
								if (Static59.anInt1119 > local6.anInt92 && local6.anObjectArray14 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray14;
									Static206.aClass30_29.method685(local459);
								}
								if (Static37.anInt782 > local6.anInt92 && local6.anObjectArray7 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray7;
									Static206.aClass30_29.method685(local459);
								}
								if (Static321.anInt5507 > local6.anInt92 && local6.anObjectArray12 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray12;
									Static206.aClass30_29.method685(local459);
								}
								local6.anInt92 = Static102.anInt2133;
								if (local6.anObjectArray4 != null) {
									for (local278 = 0; local278 < Static184.anInt3459; local278++) {
										@Pc(1895) Class2_Sub22 local1895 = new Class2_Sub22();
										local1895.aClass4_15 = local6;
										local1895.anInt2772 = Static360.aClass162Array1[local278].method4027();
										local1895.anInt2777 = Static360.aClass162Array1[local278].method4033();
										local1895.anObjectArray33 = local6.anObjectArray4;
										Static206.aClass30_29.method685(local1895);
									}
								}
								if (Static243.aBoolean331 && local6.anObjectArray21 != null) {
									local459 = new Class2_Sub22();
									local459.aClass4_15 = local6;
									local459.anObjectArray33 = local6.anObjectArray21;
									Static206.aClass30_29.method685(local459);
								}
							}
							if (local6.anInt125 == 5 && local6.anInt130 != -1) {
								local6.method76(Static341.aClass225_1, Static106.aClass98_1).method709(Static111.aClass63_3, local6.anInt113);
							}
							Static382.method5602(local6);
							if (local6.anInt125 == 0) {
								method782(arg0, local6.anInt94, local28, local30, local32, local34, local17 - local6.anInt53, local22 - local6.anInt78, arg8, arg9);
								if (local6.aClass4Array1 != null) {
									method782(local6.aClass4Array1, local6.anInt94, local28, local30, local32, local34, local17 - local6.anInt53, local22 - local6.anInt78, arg8, arg9);
								}
								@Pc(2017) Class2_Sub38 local2017 = (Class2_Sub38) Static12.aClass246_2.method5613((long) local6.anInt94);
								if (local2017 != null) {
									if (Static275.aClass150_3 == Static195.aClass150_2 && local2017.anInt4974 == 0 && !Static269.aBoolean349 && local207 && !Static226.aBoolean445) {
										Static123.method2499();
									}
									Static325.method4821(local34, arg9, local22, local17, arg8, local30, local2017.anInt4976, local28, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static382.method5602(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method783() {
		@Pc(1) int local1 = Static335.anInt5738;
		@Pc(3) int[] local3 = Static242.anIntArray933;
		@Pc(18) boolean local18 = Static116.anInt2496 == 1 && local1 > 200 || Static116.anInt2496 == 0 && local1 > 50;
		@Pc(73) int local73;
		for (@Pc(20) int local20 = 0; local20 < local1; local20++) {
			@Pc(27) Class1_Sub5_Sub1_Sub1 local27 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local3[local20]];
			if (local27.method2247()) {
				local27.method5537();
				if (local27.aShort96 >= 0 && local27.aShort97 >= 0 && local27.aShort94 < Static246.anInt4374 && local27.aShort95 < Static185.anInt3485) {
					local27.aBoolean179 = local27.aBoolean460 ? local18 : false;
					if (local27 == Static206.aClass1_Sub5_Sub1_Sub1_1) {
						local27.anInt6438 = Integer.MAX_VALUE;
					} else {
						local73 = 0;
						if (!local27.aBoolean459) {
							local73++;
						}
						if (local27.anInt6421 > Static253.anInt4469) {
							local73 += 2;
						}
						local73 += 5 - local27.method5547() << 2;
						if (Static100.anInt2068 == 0) {
							local73 += 32;
						} else {
							local73 += 128;
						}
						local73 += 256;
						local27.anInt6438 = local73 + 1;
					}
				} else {
					local27.anInt6438 = -1;
				}
			} else {
				local27.anInt6438 = -1;
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static171.anInt3311; local109++) {
			@Pc(116) Class1_Sub5_Sub1_Sub2 local116 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local109]];
			if (local116.method5563() && local116.aClass133_1.method3084(Static321.aClass211_1)) {
				local116.method5537();
				if (local116.aShort96 >= 0 && local116.aShort97 >= 0 && local116.aShort94 < Static246.anInt4374 && local116.aShort95 < Static185.anInt3485) {
					@Pc(153) int local153 = 0;
					if (!local116.aBoolean459) {
						local153++;
					}
					if (local116.anInt6421 > Static253.anInt4469) {
						local153 += 2;
					}
					local153 += 5 - local116.method5547() << 2;
					if (Static100.anInt2068 == 0) {
						if (local116.aClass133_1.aBoolean260) {
							local153 += 64;
						} else {
							local153 += 128;
						}
					} else if (Static100.anInt2068 == 1) {
						if (local116.aClass133_1.aBoolean260) {
							local153 += 32;
						} else {
							local153 += 64;
						}
					}
					if (local116.aClass133_1.aBoolean264) {
						local153 += 1024;
					} else if (!local116.aClass133_1.aBoolean259) {
						local153 += 256;
					}
					local116.anInt6438 = local153 + 1;
				} else {
					local116.anInt6438 = -1;
				}
			} else {
				local116.anInt6438 = -1;
			}
		}
		for (local73 = 0; local73 < Static335.aClass141Array1.length; local73++) {
			@Pc(219) Class141 local219 = Static335.aClass141Array1[local73];
			if (local219 != null) {
				if (local219.anInt3559 == 1) {
					@Pc(230) Class1_Sub5_Sub1_Sub2 local230 = Static299.aClass1_Sub5_Sub1_Sub2Array1[local219.anInt3561];
					if (local230 != null && local230.anInt6438 >= 0) {
						local230.anInt6438 += 2048;
					}
				} else if (local219.anInt3559 == 10) {
					@Pc(251) Class1_Sub5_Sub1_Sub1 local251 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local219.anInt3561];
					if (local251 != null && local251 != Static206.aClass1_Sub5_Sub1_Sub1_1 && local251.anInt6438 >= 0) {
						local251.anInt6438 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ae;)Lclient!cc;")
	public static Class2_Sub11 method784(@OriginalArg(0) Class4 arg0) {
		@Pc(13) Class2_Sub11 local13 = (Class2_Sub11) Static154.aClass246_8.method5613(((long) arg0.anInt94 << 32) + (long) arg0.lb);
		return local13 == null ? arg0.aClass2_Sub11_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method785(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static335.anInt5738;
		@Pc(3) int[] local3 = Static242.anIntArray933;
		@Pc(11) int local11 = Static209.aBoolean292 ? local1 : local1 + Static171.anInt3311;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub5_Sub1 local23;
			if (local13 < local1) {
				local23 = Static125.aClass1_Sub5_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static299.aClass1_Sub5_Sub1_Sub2Array1[Static143.anIntArray583[local13 - local1]];
			}
			if (local23.aByte69 == arg0) {
				local23.anInt6416 = 0;
				if (local23.anInt6438 < 0) {
					local23.aBoolean459 = false;
				} else {
					@Pc(50) int local50 = local23.method5547();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6390 & 0x7F) != 0 || (local23.anInt6386 & 0x7F) != 0) {
							local23.aBoolean459 = false;
							continue;
						}
					} else if ((local23.anInt6390 & 0x7F) != 64 || (local23.anInt6386 & 0x7F) != 64) {
						local23.aBoolean459 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6390 >> 7;
						local97 = local23.anInt6386 >> 7;
						if (local23.anInt6438 != Static199.anIntArrayArray30[local92][local97]) {
							local23.aBoolean459 = true;
							continue;
						}
						if (Static59.anIntArrayArray10[local92][local97] > 1) {
							local122 = Static59.anIntArrayArray10[local92][local97]--;
							local23.aBoolean459 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6390 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6386 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6390 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6386 + local92 >> 7;
						if (!Static265.method4087(local151, local158, local23.anInt6438, local97, local165)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6438 == Static199.anIntArrayArray30[local176][local179]) {
										local122 = Static59.anIntArrayArray10[local176][local179]--;
									}
								}
							}
							local23.aBoolean459 = true;
							continue;
						}
					}
					if (local23 instanceof Class1_Sub5_Sub1_Sub1 && local23.aClass2_Sub42_3 != null && Static253.anInt4469 >= local23.aClass2_Sub42_3.anInt6014 && Static253.anInt4469 < local23.aClass2_Sub42_3.anInt6016) {
						((Class1_Sub5_Sub1_Sub1) local23).aBoolean179 = false;
					}
					local23.aBoolean459 = false;
					local23.anInt6387 = Static170.method3006(local23.anInt6390, local23.anInt6386, local23.aByte69);
					Static356.method5230(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ae;)Z")
	public static boolean method788(@OriginalArg(0) Class4 arg0) {
		if (Static226.aBoolean445) {
			if (method784(arg0).anInt750 != 0) {
				return false;
			}
			if (arg0.anInt125 == 0) {
				return false;
			}
		}
		return arg0.aBoolean9;
	}
}
