import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!rg;")
	public static Class27 aClass27_2;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Lclient!g;")
	public static Class83 aClass83_30;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	public static int[] anIntArray80;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
	public static int anInt1104 = 0;

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt1107 = 2;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt1113 = 0;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_24 = new Class208(72, 10);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method776() {
		for (@Pc(1) int local1 = 0; local1 < Static89.anInt1891; local1++) {
			@Pc(6) int[] local6 = Static250.anIntArrayArray33[local1];
			for (@Pc(8) int local8 = 0; local8 < Static85.anInt1839; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ab;)Lclient!mb;")
	public static Class2_Sub27 method778(@OriginalArg(0) Class3 arg0) {
		@Pc(13) Class2_Sub27 local13 = (Class2_Sub27) Static328.aClass243_28.method5967(((long) arg0.anInt94 << 32) + (long) arg0.anInt45);
		return local13 == null ? arg0.aClass2_Sub27_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method780(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static162.anInt3362 = 7;
		Static169.anInt5687 = 0x1 << Static162.anInt3362;
		Static291.anInt5453 = Static169.anInt5687 >> 1;
		Static279.anInt5195 = (int) Math.sqrt((double) (Static291.anInt5453 * Static291.anInt5453 + Static291.anInt5453 * Static291.anInt5453));
		Static176.anInt3742 = arg0;
		Static285.anInt5263 = arg1;
		Static113.anInt5764 = arg2;
		Static302.aClass188ArrayArrayArray4 = new Class188[4][Static176.anInt3742][Static285.anInt5263];
		Static210.aClass149Array5 = new Class149[4];
		if (arg3) {
			Static199.anIntArrayArray19 = new int[Static176.anInt3742][Static285.anInt5263];
			Static139.aByteArrayArray11 = new byte[Static176.anInt3742][Static285.anInt5263];
			Static102.aByteArrayArray8 = new byte[Static176.anInt3742][Static285.anInt5263];
			Static89.aClass188ArrayArrayArray3 = new Class188[1][Static176.anInt3742][Static285.anInt5263];
			Static248.aClass149Array3 = new Class149[1];
		} else {
			Static199.anIntArrayArray19 = null;
			Static139.aByteArrayArray11 = null;
			Static102.aByteArrayArray8 = null;
			Static89.aClass188ArrayArrayArray3 = null;
			Static248.aClass149Array3 = null;
		}
		if (arg4) {
			Static132.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static41.aClass2_Sub8_Sub1Array1 = new Class2_Sub8_Sub1[65535];
			Static160.aBooleanArray16 = new boolean[65535];
			Static184.anInt3912 = 0;
		} else {
			Static132.aLongArrayArrayArray1 = null;
			Static41.aClass2_Sub8_Sub1Array1 = null;
			Static160.aBooleanArray16 = null;
			Static184.anInt3912 = 0;
		}
		Static307.method5020(false);
		Static326.aClass153Array2 = new Class153[500];
		Static174.anInt3565 = 0;
		Static299.aClass153Array1 = new Class153[500];
		Static165.anInt3409 = 0;
		Static33.anIntArrayArrayArray2 = new int[4][Static176.anInt3742 + 1][Static285.anInt5263 + 1];
		Static313.aClass1_Sub2Array3 = new Class1_Sub2[5000];
		Static94.anInt2018 = 0;
		Static133.aBooleanArrayArray3 = new boolean[Static113.anInt5764 + Static113.anInt5764 + 1][Static113.anInt5764 + Static113.anInt5764 + 1];
		Static66.aBooleanArrayArray1 = new boolean[Static113.anInt5764 + Static113.anInt5764 + 2][Static113.anInt5764 + Static113.anInt5764 + 2];
		Static185.aClass19_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method781(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static97.anInt2139;
		@Pc(3) int[] local3 = Static321.anIntArray512;
		@Pc(11) int local11 = Static92.aBoolean145 ? local1 : local1 + Static123.anInt5933;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local13 - local1]];
			}
			if (local23.aByte73 == arg0) {
				local23.anInt5388 = 0;
				if (local23.anInt5372 < 0) {
					local23.aBoolean395 = false;
				} else {
					@Pc(50) int local50 = local23.method4792();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6800 & 0x7F) != 0 || (local23.anInt6798 & 0x7F) != 0) {
							local23.aBoolean395 = false;
							continue;
						}
					} else if ((local23.anInt6800 & 0x7F) != 64 || (local23.anInt6798 & 0x7F) != 64) {
						local23.aBoolean395 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6800 >> 7;
						local97 = local23.anInt6798 >> 7;
						if (local23.anInt5372 != Static250.anIntArrayArray33[local92][local97]) {
							local23.aBoolean395 = true;
							continue;
						}
						if (Static6.anIntArrayArray1[local92][local97] > 1) {
							local122 = Static6.anIntArrayArray1[local92][local97]--;
							local23.aBoolean395 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6800 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6798 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6800 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6798 + local92 >> 7;
						if (!Static158.method2785(local165, local151, local97, local158, local23.anInt5372)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt5372 == Static250.anIntArrayArray33[local176][local179]) {
										local122 = Static6.anIntArrayArray1[local176][local179]--;
									}
								}
							}
							local23.aBoolean395 = true;
							continue;
						}
					}
					if (local23 instanceof Class1_Sub2_Sub1_Sub1 && local23.aClass2_Sub25_3 != null && Static339.anInt6265 >= local23.aClass2_Sub25_3.anInt3734 && Static339.anInt6265 < local23.aClass2_Sub25_3.anInt3746) {
						((Class1_Sub2_Sub1_Sub1) local23).aBoolean72 = false;
					}
					local23.aBoolean395 = false;
					local23.anInt6797 = Static36.method2335(local23.anInt6798, local23.aByte73, local23.anInt6800);
					Static233.method4185(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method782(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static97.anInt2139;
		@Pc(3) int[] local3 = Static321.anIntArray512;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static123.anInt5933; local5++) {
			@Pc(15) Class1_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local5 - local1]];
			}
			if (local15.aByte73 == arg0 && local15.anInt5372 >= 0) {
				@Pc(35) int local35 = local15.method4792();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6800 & 0x7F) != 0 || (local15.anInt6798 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6800 & 0x7F) != 64 || (local15.anInt6798 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6800 >> 7;
					local76 = local15.anInt6798 >> 7;
					if (local15.anInt5372 > Static250.anIntArrayArray33[local71][local76]) {
						Static250.anIntArrayArray33[local71][local76] = local15.anInt5372;
						Static6.anIntArrayArray1[local71][local76] = 1;
					} else if (local15.anInt5372 == Static250.anIntArrayArray33[local71][local76]) {
						local112 = Static6.anIntArrayArray1[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6800 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6798 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6800 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6798 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt5372 > Static250.anIntArrayArray33[local154][local157]) {
								Static250.anIntArrayArray33[local154][local157] = local15.anInt5372;
								Static6.anIntArrayArray1[local154][local157] = 1;
							} else if (local15.anInt5372 == Static250.anIntArrayArray33[local154][local157]) {
								local112 = Static6.anIntArrayArray1[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ab;IIIIIIIII)V")
	public static void method784(@OriginalArg(0) Class3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class3 local6 = arg0[local1];
			if (local6 != null && local6.anInt87 == arg1) {
				@Pc(17) int local17 = local6.anInt114 + arg6;
				@Pc(22) int local22 = local6.anInt50 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt91 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt64;
					@Pc(45) int local45 = local22 + local6.anInt116;
					if (local6.anInt91 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt91 == 0 || local6.aBoolean4 || method778(local6).anInt4220 != 0 || local6 == Static220.aClass3_10 || local6.anInt59 == Static278.anInt5165) {
					if (!method790(local6)) {
						if (local6 == Static268.aClass3_13) {
							Static305.aBoolean492 = true;
							Static59.anInt1275 = local17;
							Static40.anInt718 = local22;
						}
						if (local6.aBoolean9 || local28 < local32 && local30 < local34) {
							if (local6.anInt91 == 0 && local6.aBoolean5 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class2_Sub5 local151 = (Class2_Sub5) Static269.aClass238_30.method5795(); local151 != null; local151 = (Class2_Sub5) Static269.aClass238_30.method5799()) {
									if (local151.aBoolean42) {
										local151.method6130();
										local151.aClass3_4.aBoolean16 = false;
									}
								}
								if (Static328.anInt6054 == 0) {
									Static268.aClass3_13 = null;
									Static220.aClass3_10 = null;
								}
								Static334.anInt6171 = 0;
								Static56.aBoolean383 = false;
								Static236.aBoolean347 = false;
								if (!Static214.aBoolean313) {
									Static41.method585();
								}
							}
							@Pc(207) boolean local207;
							if (Static136.aClass91_2.method5223() >= local28 && Static136.aClass91_2.method5224() >= local30 && Static136.aClass91_2.method5223() < local32 && Static136.aClass91_2.method5224() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static214.aBoolean313 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static246.method2545(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(235) boolean local235 = false;
							if (Static136.aClass91_2.method5222() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static248.aClass2_Sub17_1 != null && Static248.aClass2_Sub17_1.method2187() == 0 && Static248.aClass2_Sub17_1.method2189() >= local28 && Static248.aClass2_Sub17_1.method2186() >= local30 && Static248.aClass2_Sub17_1.method2189() < local32 && Static248.aClass2_Sub17_1.method2186() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray1 != null) {
								for (local278 = 0; local278 < local6.aByteArray1.length; local278++) {
									if (Static68.aClass98_1.method4517(local6.aByteArray1[local278])) {
										if (local6.anIntArray10 == null || Static339.anInt6265 >= local6.anIntArray10[local278]) {
											@Pc(310) byte local310 = local6.aByteArray2[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static68.aClass98_1.method4517(86) && !Static68.aClass98_1.method4517(82) && !Static68.aClass98_1.method4517(81)) && ((local310 & 0x2) == 0 || Static68.aClass98_1.method4517(86)) && ((local310 & 0x1) == 0 || Static68.aClass98_1.method4517(82)) && ((local310 & 0x4) == 0 || Static68.aClass98_1.method4517(81))) {
												Static389.method6109(local278 + 1, local6.anInt94, "", -1);
												local374 = local6.anIntArray7[local278];
												if (local6.anIntArray10 == null) {
													local6.anIntArray10 = new int[local6.aByteArray1.length];
												}
												if (local374 == 0) {
													local6.anIntArray10[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray10[local278] = Static339.anInt6265 + local374;
												}
											}
										}
									} else if (local6.anIntArray10 != null) {
										local6.anIntArray10[local278] = 0;
									}
								}
							}
							if (local245) {
								Static50.method732(Static248.aClass2_Sub17_1.method2186() - local22, Static248.aClass2_Sub17_1.method2189() - local17, local6);
							}
							if (Static268.aClass3_13 != null && Static268.aClass3_13 != local6 && local207 && method778(local6).method3757()) {
								Static360.aClass3_18 = local6;
							}
							if (local6 == Static220.aClass3_10) {
								Static302.aBoolean412 = true;
								Static181.anInt3816 = local17;
								Static385.anInt7008 = local22;
							}
							if (local6.aBoolean4 || local6.anInt59 != 0) {
								@Pc(459) Class2_Sub5 local459;
								if (local207 && Static256.anInt4912 != 0 && local6.anObjectArray17 != null) {
									local459 = new Class2_Sub5();
									local459.aBoolean42 = true;
									local459.aClass3_4 = local6;
									local459.anInt479 = Static256.anInt4912;
									local459.anObjectArray33 = local6.anObjectArray17;
									Static269.aClass238_30.method5796(local459);
								}
								if (Static268.aClass3_13 != null || Static214.aBoolean313 || local6.anInt59 != Static99.anInt2181 && Static334.anInt6171 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt59 != 0) {
									if (local6.anInt59 == Static168.anInt3459 || local6.anInt59 == Static349.anInt6414) {
										Static118.aClass3_14 = local6;
										if (Static251.aClass58_1 != null) {
											Static251.aClass58_1.method1289(local6.anInt116, Static383.aClass48_9);
										}
										if (local6.anInt59 == Static168.anInt3459) {
											if (!Static214.aBoolean313 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static189.method511(arg9, Static383.aClass48_9, arg8);
												for (@Pc(542) Class7_Sub2 local542 = (Class7_Sub2) Static346.aClass199_6.method4896(); local542 != null; local542 = (Class7_Sub2) Static346.aClass199_6.method4902()) {
													if (arg8 >= local542.anInt439 && arg8 < local542.anInt440 && arg9 >= local542.anInt435 && arg9 < local542.anInt436) {
														Static41.method585();
														Static29.method338(local542.aClass1_Sub2_Sub1_1);
													}
												}
											}
											Static315.method5101(local17, local22, local6);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt59 == Static278.anInt5165) {
										if (local6.method45(Static383.aClass48_9) == null || Static55.anInt1202 != 0 && Static55.anInt1202 != 3 || Static214.aBoolean313 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray4[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray8[local614]) {
											continue;
										}
										local278 -= local6.anInt64 / 2;
										local614 -= local6.anInt116 / 2;
										if (Static198.anInt4108 == 4) {
											local653 = (int) Static350.aFloat74 & 0x3FFF;
										} else {
											local653 = (int) Static350.aFloat74 + Static319.anInt5841 & 0x3FFF;
										}
										@Pc(665) int local665 = Class106.anIntArray240[local653];
										@Pc(669) int local669 = Class106.anIntArray242[local653];
										if (Static198.anInt4108 != 4) {
											local665 = local665 * (Static59.anInt1283 + 256) >> 8;
											local669 = local669 * (Static59.anInt1283 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static198.anInt4108 == 4) {
											local719 = (Static124.anInt4240 >> 7) + (local698 >> 2);
											local727 = (Static273.anInt5127 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static182.aClass1_Sub2_Sub1_Sub1_1.method4792() - 1) * 64;
											local719 = (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 - local736 >> 7) + (local698 >> 2);
											local727 = (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 - local736 >> 7) - (local708 >> 2);
										}
										if (Static45.aBoolean446 && (Static272.anInt5116 & 0x40) != 0) {
											@Pc(769) Class3 local769 = Static134.method2355(Static92.anInt1971, Static306.anInt5658);
											if (local769 == null) {
												Static49.method729();
											} else {
												method787(1L, local719, 21, local6.anInt56, Static5.anInt136, Static207.aString34, local727, false, " ->", true);
											}
											continue;
										}
										if (Static85.aClass38_1 == Static202.aClass38_2) {
											method787(1L, local719, 23, -1, -1, Static290.aClass62_193.method1389(Static200.anInt4144), local727, false, "", true);
										}
										method787(1L, local719, 9, -1, -1, Static330.aString59, local727, false, "", true);
										continue;
									}
									if (local6.anInt59 == Static99.anInt2181) {
										Static85.aClass3_8 = local6;
										if (local207) {
											Static56.aBoolean383 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static248.aClass2_Sub17_1.method2189() - local17 - local6.anInt64 / 2) * 2.0D / (double) Static20.aFloat52);
											local614 = (int) -((double) (Static248.aClass2_Sub17_1.method2186() - local22 - local6.anInt116 / 2) * 2.0D / (double) Static20.aFloat52);
											local374 = Static375.anInt6902 + local278 + Static20.anInt4606;
											local653 = Static208.anInt4249 + local614 + Static20.anInt4611;
											@Pc(883) Class2_Sub7_Sub12 local883 = Static112.method1694();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.method4262(local888, local653, local374);
											if (local888 != null) {
												if (Static68.aClass98_1.method4517(82) && Static273.anInt5130 > 0) {
													Static206.method3764(local888[2], local888[1], local888[0]);
													continue;
												}
												Static236.aBoolean347 = true;
												Static189.anInt638 = local888[0];
												Static140.anInt2986 = local888[1];
												Static224.anInt4489 = local888[2];
											}
											Static334.anInt6171 = 1;
											Static2.aBoolean497 = false;
											Static180.anInt3782 = Static136.aClass91_2.method5223();
											Static334.anInt6175 = Static136.aClass91_2.method5224();
											continue;
										}
										if (local235 && Static334.anInt6171 > 0) {
											if (Static334.anInt6171 == 1 && (Static180.anInt3782 != Static136.aClass91_2.method5223() || Static334.anInt6175 != Static136.aClass91_2.method5224())) {
												Static329.anInt6062 = Static375.anInt6902;
												Static180.anInt3783 = Static208.anInt4249;
												Static334.anInt6171 = 2;
											}
											if (Static334.anInt6171 == 2) {
												Static2.aBoolean497 = true;
												Static364.method5781(Static329.anInt6062 + (int) ((double) (Static180.anInt3782 - Static136.aClass91_2.method5223()) * 2.0D / (double) Static20.aFloat51));
												Static249.method4332(Static180.anInt3783 - (int) ((double) (Static334.anInt6175 - Static136.aClass91_2.method5224()) * 2.0D / (double) Static20.aFloat51));
											}
											continue;
										}
										if (Static334.anInt6171 > 0 && !Static2.aBoolean497) {
											if ((Static251.anInt4857 == 1 || Static15.method175()) && Static233.anInt4642 > 2) {
												Static300.method4908(Static180.anInt3782, Static334.anInt6175);
											} else if (Static1.method6022()) {
												Static300.method4908(Static180.anInt3782, Static334.anInt6175);
											}
										}
										Static334.anInt6171 = 0;
										continue;
									}
									if (local6.anInt59 == Static203.anInt3954) {
										if (local235) {
											Static1.method6017(Static136.aClass91_2.method5223() - local17, local6.anInt64, Static136.aClass91_2.method5224() - local22, local6.anInt116);
										}
										continue;
									}
									if (local6.anInt59 == Static34.anInt591) {
										Static38.method534(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean17 && local245) {
									local6.aBoolean17 = true;
									if (local6.anObjectArray27 != null) {
										local459 = new Class2_Sub5();
										local459.aBoolean42 = true;
										local459.aClass3_4 = local6;
										local459.anInt482 = Static248.aClass2_Sub17_1.method2189() - local17;
										local459.anInt479 = Static248.aClass2_Sub17_1.method2186() - local22;
										local459.anObjectArray33 = local6.anObjectArray27;
										Static269.aClass238_30.method5796(local459);
									}
								}
								if (local6.aBoolean17 && local235 && local6.anObjectArray5 != null) {
									local459 = new Class2_Sub5();
									local459.aBoolean42 = true;
									local459.aClass3_4 = local6;
									local459.anInt482 = Static136.aClass91_2.method5223() - local17;
									local459.anInt479 = Static136.aClass91_2.method5224() - local22;
									local459.anObjectArray33 = local6.anObjectArray5;
									Static269.aClass238_30.method5796(local459);
								}
								if (local6.aBoolean17 && !local235) {
									local6.aBoolean17 = false;
									if (local6.anObjectArray25 != null) {
										local459 = new Class2_Sub5();
										local459.aBoolean42 = true;
										local459.aClass3_4 = local6;
										local459.anInt482 = Static136.aClass91_2.method5223() - local17;
										local459.anInt479 = Static136.aClass91_2.method5224() - local22;
										local459.anObjectArray33 = local6.anObjectArray25;
										Static207.aClass238_18.method5796(local459);
									}
								}
								if (local235 && local6.anObjectArray20 != null) {
									local459 = new Class2_Sub5();
									local459.aBoolean42 = true;
									local459.aClass3_4 = local6;
									local459.anInt482 = Static136.aClass91_2.method5223() - local17;
									local459.anInt479 = Static136.aClass91_2.method5224() - local22;
									local459.anObjectArray33 = local6.anObjectArray20;
									Static269.aClass238_30.method5796(local459);
								}
								if (!local6.aBoolean16 && local207) {
									local6.aBoolean16 = true;
									if (local6.anObjectArray21 != null) {
										local459 = new Class2_Sub5();
										local459.aBoolean42 = true;
										local459.aClass3_4 = local6;
										local459.anInt482 = Static136.aClass91_2.method5223() - local17;
										local459.anInt479 = Static136.aClass91_2.method5224() - local22;
										local459.anObjectArray33 = local6.anObjectArray21;
										Static269.aClass238_30.method5796(local459);
									}
								}
								if (local6.aBoolean16 && local207 && local6.anObjectArray26 != null) {
									local459 = new Class2_Sub5();
									local459.aBoolean42 = true;
									local459.aClass3_4 = local6;
									local459.anInt482 = Static136.aClass91_2.method5223() - local17;
									local459.anInt479 = Static136.aClass91_2.method5224() - local22;
									local459.anObjectArray33 = local6.anObjectArray26;
									Static269.aClass238_30.method5796(local459);
								}
								if (local6.aBoolean16 && !local207) {
									local6.aBoolean16 = false;
									if (local6.anObjectArray18 != null) {
										local459 = new Class2_Sub5();
										local459.aBoolean42 = true;
										local459.aClass3_4 = local6;
										local459.anInt482 = Static136.aClass91_2.method5223() - local17;
										local459.anInt479 = Static136.aClass91_2.method5224() - local22;
										local459.anObjectArray33 = local6.anObjectArray18;
										Static207.aClass238_18.method5796(local459);
									}
								}
								if (local6.anObjectArray6 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray6;
									Static342.aClass238_41.method5796(local459);
								}
								@Pc(1427) Class2_Sub5 local1427;
								if (local6.anObjectArray16 != null && Static223.anInt4471 > local6.lb) {
									if (local6.anIntArray5 == null || Static223.anInt4471 - local6.lb > 32) {
										local459 = new Class2_Sub5();
										local459.aClass3_4 = local6;
										local459.anObjectArray33 = local6.anObjectArray16;
										Static269.aClass238_30.method5796(local459);
									} else {
										label659: for (local278 = local6.lb; local278 < Static223.anInt4471; local278++) {
											local614 = Static44.anIntArray63[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray5.length; local374++) {
												if (local6.anIntArray5[local374] == local614) {
													local1427 = new Class2_Sub5();
													local1427.aClass3_4 = local6;
													local1427.anObjectArray33 = local6.anObjectArray16;
													Static269.aClass238_30.method5796(local1427);
													break label659;
												}
											}
										}
									}
									local6.lb = Static223.anInt4471;
								}
								if (local6.anObjectArray24 != null && Static354.anInt6503 > local6.anInt62) {
									if (local6.anIntArray12 == null || Static354.anInt6503 - local6.anInt62 > 32) {
										local459 = new Class2_Sub5();
										local459.aClass3_4 = local6;
										local459.anObjectArray33 = local6.anObjectArray24;
										Static269.aClass238_30.method5796(local459);
									} else {
										label635: for (local278 = local6.anInt62; local278 < Static354.anInt6503; local278++) {
											local614 = Static75.anIntArray126[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray12.length; local374++) {
												if (local6.anIntArray12[local374] == local614) {
													local1427 = new Class2_Sub5();
													local1427.aClass3_4 = local6;
													local1427.anObjectArray33 = local6.anObjectArray24;
													Static269.aClass238_30.method5796(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt62 = Static354.anInt6503;
								}
								if (local6.anObjectArray12 != null && Static71.anInt1580 > local6.anInt90) {
									if (local6.anIntArray3 == null || Static71.anInt1580 - local6.anInt90 > 32) {
										local459 = new Class2_Sub5();
										local459.aClass3_4 = local6;
										local459.anObjectArray33 = local6.anObjectArray12;
										Static269.aClass238_30.method5796(local459);
									} else {
										label611: for (local278 = local6.anInt90; local278 < Static71.anInt1580; local278++) {
											local614 = Static235.anIntArray388[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray3.length; local374++) {
												if (local6.anIntArray3[local374] == local614) {
													local1427 = new Class2_Sub5();
													local1427.aClass3_4 = local6;
													local1427.anObjectArray33 = local6.anObjectArray12;
													Static269.aClass238_30.method5796(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt90 = Static71.anInt1580;
								}
								if (local6.anObjectArray7 != null && Static204.anInt4205 > local6.anInt78) {
									if (local6.anIntArray9 == null || Static204.anInt4205 - local6.anInt78 > 32) {
										local459 = new Class2_Sub5();
										local459.aClass3_4 = local6;
										local459.anObjectArray33 = local6.anObjectArray7;
										Static269.aClass238_30.method5796(local459);
									} else {
										label587: for (local278 = local6.anInt78; local278 < Static204.anInt4205; local278++) {
											local614 = Static167.anIntArray268[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray9.length; local374++) {
												if (local6.anIntArray9[local374] == local614) {
													local1427 = new Class2_Sub5();
													local1427.aClass3_4 = local6;
													local1427.anObjectArray33 = local6.anObjectArray7;
													Static269.aClass238_30.method5796(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt78 = Static204.anInt4205;
								}
								if (local6.anObjectArray15 != null && Static236.anInt4681 > local6.anInt104) {
									if (local6.anIntArray11 == null || Static236.anInt4681 - local6.anInt104 > 32) {
										local459 = new Class2_Sub5();
										local459.aClass3_4 = local6;
										local459.anObjectArray33 = local6.anObjectArray15;
										Static269.aClass238_30.method5796(local459);
									} else {
										label563: for (local278 = local6.anInt104; local278 < Static236.anInt4681; local278++) {
											local614 = Static228.anIntArray380[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray11.length; local374++) {
												if (local6.anIntArray11[local374] == local614) {
													local1427 = new Class2_Sub5();
													local1427.aClass3_4 = local6;
													local1427.anObjectArray33 = local6.anObjectArray15;
													Static269.aClass238_30.method5796(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt104 = Static236.anInt4681;
								}
								if (Static206.anInt4232 > local6.anInt66 && local6.anObjectArray3 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray3;
									Static269.aClass238_30.method5796(local459);
								}
								if (Static342.anInt6304 > local6.anInt66 && local6.anObjectArray4 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray4;
									Static269.aClass238_30.method5796(local459);
								}
								if (Static315.anInt5768 > local6.anInt66 && local6.anObjectArray8 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray8;
									Static269.aClass238_30.method5796(local459);
								}
								if (Static263.anInt5016 > local6.anInt66 && local6.anObjectArray1 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray1;
									Static269.aClass238_30.method5796(local459);
								}
								if (Static287.anInt5313 > local6.anInt66 && local6.anObjectArray19 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray19;
									Static269.aClass238_30.method5796(local459);
								}
								local6.anInt66 = Static245.anInt4796;
								if (local6.anObjectArray10 != null) {
									for (local278 = 0; local278 < Static154.anInt3218; local278++) {
										@Pc(1895) Class2_Sub5 local1895 = new Class2_Sub5();
										local1895.aClass3_4 = local6;
										local1895.anInt474 = Static286.aClass13Array1[local278].method122();
										local1895.anInt478 = Static286.aClass13Array1[local278].method120();
										local1895.anObjectArray33 = local6.anObjectArray10;
										Static269.aClass238_30.method5796(local1895);
									}
								}
								if (Static387.aBoolean499 && local6.anObjectArray11 != null) {
									local459 = new Class2_Sub5();
									local459.aClass3_4 = local6;
									local459.anObjectArray33 = local6.anObjectArray11;
									Static269.aClass238_30.method5796(local459);
								}
							}
							if (local6.anInt91 == 5 && local6.anInt83 != -1) {
								local6.method42(Static371.aClass162_1, Static194.aClass52_1).method1289(local6.anInt116, Static383.aClass48_9);
							}
							Static56.method4651(local6);
							if (local6.anInt91 == 0) {
								method784(arg0, local6.anInt94, local28, local30, local32, local34, local17 - local6.anInt81, local22 - local6.anInt93, arg8, arg9);
								if (local6.aClass3Array1 != null) {
									method784(local6.aClass3Array1, local6.anInt94, local28, local30, local32, local34, local17 - local6.anInt81, local22 - local6.anInt93, arg8, arg9);
								}
								@Pc(2017) Class2_Sub26 local2017 = (Class2_Sub26) Static273.aClass243_20.method5967((long) local6.anInt94);
								if (local2017 != null) {
									if (Static85.aClass38_1 == Static255.aClass38_3 && local2017.anInt4142 == 0 && !Static214.aBoolean313 && local207 && !Static119.aBoolean188) {
										Static41.method585();
									}
									Static188.method3474(local17, arg8, local28, local34, local22, local32, local2017.anInt4145, local30, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static56.method4651(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method786() {
		@Pc(1) int local1 = Static97.anInt2139;
		@Pc(3) int[] local3 = Static321.anIntArray512;
		@Pc(11) int local11 = Static92.aBoolean145 ? local1 : local1 + Static123.anInt5933;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local13 - local1]];
			}
			if (local23.anInt5372 >= 0) {
				@Pc(39) int local39 = local23.method4792();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6800 & 0x7F) == 0 && (local23.anInt6798 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6800 & 0x7F) == 64 && (local23.anInt6798 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class1_Sub2_Sub1_Sub1 && local23.aClass2_Sub25_3 != null && Static339.anInt6265 >= local23.aClass2_Sub25_3.anInt3734 && Static339.anInt6265 < local23.aClass2_Sub25_3.anInt3746) {
					((Class1_Sub2_Sub1_Sub1) local23).aBoolean72 = false;
				}
				local23.anInt6797 = Static36.method2335(local23.anInt6798, local23.aByte73, local23.anInt6800);
				Static233.method4185(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(JIIIILjava/lang/String;IZLjava/lang/String;IZ)V")
	public static void method787(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) String arg8, @OriginalArg(10) boolean arg9) {
		if (!Static214.aBoolean313 && Static233.anInt4642 < 500) {
			@Pc(19) int local19 = arg4 == -1 ? Static190.anInt3987 : arg4;
			@Pc(33) Class2_Sub43 local33 = new Class2_Sub43(arg5, arg8, local19, arg2, arg3, arg0, arg1, arg6, arg9, arg7);
			Static262.aClass238_29.method5796(local33);
			Static233.anInt4642++;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ab;)Lclient!ab;")
	public static Class3 method788(@OriginalArg(0) Class3 arg0) {
		@Pc(4) int local4 = method778(arg0).method3760();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static380.method5987(arg0.anInt87);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ab;)Z")
	public static boolean method790(@OriginalArg(0) Class3 arg0) {
		if (Static119.aBoolean188) {
			if (method778(arg0).anInt4220 != 0) {
				return false;
			}
			if (arg0.anInt91 == 0) {
				return false;
			}
		}
		return arg0.aBoolean12;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
	public static int method791(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method792() {
		Static299.anInt5582 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static123.anInt5933; local3++) {
			@Pc(10) Class1_Sub2_Sub1_Sub2 local10 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local3]];
			if (local10.aBoolean395 && local10.method4789() != -1) {
				@Pc(28) int local28 = (local10.method4792() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6800 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6798 - local28 >> 7;
				@Pc(49) Class1_Sub2_Sub1 local49 = Static340.method5460(local10.aByte73, local35, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt5374;
					if (local49 instanceof Class1_Sub2_Sub1_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt5388 == 0 && local49.method4789() != -1) {
						Static315.anIntArray506[Static299.anInt5582] = local54;
						Static372.anIntArray575[Static299.anInt5582] = local54;
						Static299.anInt5582++;
						local49.anInt5388++;
					}
					Static315.anIntArray506[Static299.anInt5582] = local54;
					Static372.anIntArray575[Static299.anInt5582] = local10.anInt5374 + 2048;
					Static299.anInt5582++;
					local49.anInt5388++;
				}
			}
		}
		Static384.method6009(Static372.anIntArray575, Static315.anIntArray506, 0, Static299.anInt5582 - 1);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method794() {
		@Pc(1) int local1 = Static97.anInt2139;
		@Pc(3) int[] local3 = Static321.anIntArray512;
		@Pc(18) boolean local18 = Static73.anInt1628 == 1 && local1 > 200 || Static73.anInt1628 == 0 && local1 > 50;
		@Pc(73) int local73;
		for (@Pc(20) int local20 = 0; local20 < local1; local20++) {
			@Pc(27) Class1_Sub2_Sub1_Sub1 local27 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local3[local20]];
			if (local27.method700()) {
				local27.method5898();
				if (local27.aShort95 >= 0 && local27.aShort96 >= 0 && local27.aShort97 < Static89.anInt1891 && local27.aShort94 < Static85.anInt1839) {
					local27.aBoolean72 = local27.aBoolean394 ? local18 : false;
					if (local27 == Static182.aClass1_Sub2_Sub1_Sub1_1) {
						local27.anInt5372 = Integer.MAX_VALUE;
					} else {
						local73 = 0;
						if (!local27.aBoolean395) {
							local73++;
						}
						if (local27.anInt5385 > Static339.anInt6265) {
							local73 += 2;
						}
						local73 += 5 - local27.method4792() << 2;
						if (Static230.anInt4626 == 0) {
							local73 += 32;
						} else {
							local73 += 128;
						}
						local73 += 256;
						local27.anInt5372 = local73 + 1;
					}
				} else {
					local27.anInt5372 = -1;
				}
			} else {
				local27.anInt5372 = -1;
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static123.anInt5933; local109++) {
			@Pc(116) Class1_Sub2_Sub1_Sub2 local116 = Static223.aClass1_Sub2_Sub1_Sub2Array1[Static373.anIntArray577[local109]];
			if (local116.method4809() && local116.aClass197_1.method4842(Static179.aClass115_1)) {
				local116.method5898();
				if (local116.aShort95 >= 0 && local116.aShort96 >= 0 && local116.aShort97 < Static89.anInt1891 && local116.aShort94 < Static85.anInt1839) {
					@Pc(153) int local153 = 0;
					if (!local116.aBoolean395) {
						local153++;
					}
					if (local116.anInt5385 > Static339.anInt6265) {
						local153 += 2;
					}
					local153 += 5 - local116.method4792() << 2;
					if (Static230.anInt4626 == 0) {
						if (local116.aClass197_1.aBoolean402) {
							local153 += 64;
						} else {
							local153 += 128;
						}
					} else if (Static230.anInt4626 == 1) {
						if (local116.aClass197_1.aBoolean402) {
							local153 += 32;
						} else {
							local153 += 64;
						}
					}
					if (local116.aClass197_1.aBoolean405) {
						local153 += 1024;
					} else if (!local116.aClass197_1.aBoolean403) {
						local153 += 256;
					}
					local116.anInt5372 = local153 + 1;
				} else {
					local116.anInt5372 = -1;
				}
			} else {
				local116.anInt5372 = -1;
			}
		}
		for (local73 = 0; local73 < Static16.aClass247Array1.length; local73++) {
			@Pc(219) Class247 local219 = Static16.aClass247Array1[local73];
			if (local219 != null) {
				if (local219.anInt6960 == 1) {
					@Pc(230) Class1_Sub2_Sub1_Sub2 local230 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local219.anInt6955];
					if (local230 != null && local230.anInt5372 >= 0) {
						local230.anInt5372 += 2048;
					}
				} else if (local219.anInt6960 == 10) {
					@Pc(251) Class1_Sub2_Sub1_Sub1 local251 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local219.anInt6955];
					if (local251 != null && local251 != Static182.aClass1_Sub2_Sub1_Sub1_1 && local251.anInt5372 >= 0) {
						local251.anInt5372 += 2048;
					}
				}
			}
		}
	}
}
