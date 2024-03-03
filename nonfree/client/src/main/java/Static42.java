import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 6)
	public static void method1398() {
		for (@Pc(1) int local1 = 0; local1 < Class241.anInt7020; local1++) {
			@Pc(6) int[] local6 = Static296.anIntArrayArray51[local1];
			for (@Pc(8) int local8 = 0; local8 < OutputStream_Sub1.anInt4442; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 343)
	public static void method1400() {
		@Pc(1) int local1 = Class28.anInt751;
		@Pc(3) int[] local3 = Class64.anIntArray121;
		@Pc(20) boolean local20 = Static203.aClass177_Sub1_2.anInt4885 == 1 && local1 > 200 || Static203.aClass177_Sub1_2.anInt4885 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class11_Sub5_Sub2_Sub1 local29 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local3[local22]];
			if (local29.method4066()) {
				local29.method6079();
				if (local29.aShort103 >= 0 && local29.aShort101 >= 0 && local29.aShort104 < Class241.anInt7020 && local29.aShort102 < OutputStream_Sub1.anInt4442) {
					local29.aBoolean275 = local29.aBoolean317 ? local20 : false;
					if (local29 == Static17.aClass11_Sub5_Sub2_Sub1_3) {
						local29.anInt4629 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean320) {
							local75++;
						}
						if (local29.anInt4598 > Class83.anInt2345) {
							local75 += 2;
						}
						local75 += 5 - local29.method4329() << 2;
						if (Class83.anInt2341 == 0) {
							local75 += 32;
						} else {
							local75 += 128;
						}
						local75 += 256;
						local29.anInt4629 = local75 + 1;
					}
				} else {
					local29.anInt4629 = -1;
				}
			} else {
				local29.anInt4629 = -1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < Class117.anInt3183; local111++) {
			@Pc(118) Class11_Sub5_Sub2_Sub2 local118 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local111]];
			if (local118.method4337() && local118.aClass71_1.method2093(Static199.aClass226_1)) {
				local118.method6079();
				if (local118.aShort103 >= 0 && local118.aShort101 >= 0 && local118.aShort104 < Class241.anInt7020 && local118.aShort102 < OutputStream_Sub1.anInt4442) {
					@Pc(155) int local155 = 0;
					if (!local118.aBoolean320) {
						local155++;
					}
					if (local118.anInt4598 > Class83.anInt2345) {
						local155 += 2;
					}
					local155 += 5 - local118.method4329() << 2;
					if (Class83.anInt2341 == 0) {
						if (local118.aClass71_1.aBoolean148) {
							local155 += 64;
						} else {
							local155 += 128;
						}
					} else if (Class83.anInt2341 == 1) {
						if (local118.aClass71_1.aBoolean148) {
							local155 += 32;
						} else {
							local155 += 64;
						}
					}
					if (local118.aClass71_1.aBoolean149) {
						local155 += 1024;
					} else if (!local118.aClass71_1.aBoolean146) {
						local155 += 256;
					}
					local118.anInt4629 = local155 + 1;
				} else {
					local118.anInt4629 = -1;
				}
			} else {
				local118.anInt4629 = -1;
			}
		}
		for (local75 = 0; local75 < Class41.aClass84Array1.length; local75++) {
			@Pc(221) Class84 local221 = Class41.aClass84Array1[local75];
			if (local221 != null) {
				if (local221.anInt2352 == 1) {
					@Pc(232) Class11_Sub5_Sub2_Sub2 local232 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local221.anInt2351];
					if (local232 != null && local232.anInt4629 >= 0) {
						local232.anInt4629 += 2048;
					}
				} else if (local221.anInt2352 == 10) {
					@Pc(253) Class11_Sub5_Sub2_Sub1 local253 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local221.anInt2351];
					if (local253 != null && local253 != Static17.aClass11_Sub5_Sub2_Sub1_3 && local253.anInt4629 >= 0) {
						local253.anInt4629 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!nk;IIIIIIIII)V", line = 512)
	public static void method1402(@OriginalArg(0) Class161[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class161 local6 = arg0[local1];
			if (local6 != null && local6.anInt4268 == arg1) {
				@Pc(17) int local17 = local6.anInt4298 + arg6;
				@Pc(22) int local22 = local6.anInt4248 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4265 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4242;
					@Pc(45) int local45 = local22 + local6.anInt4255;
					if (local6.anInt4265 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4265 == 0 || local6.aBoolean296 || method1406(local6).anInt1756 != 0 || local6 == Class2_Sub3_Sub30.aClass161_13 || local6.anInt4266 == Class2_Sub3_Sub13.anInt2518) {
					if (!method1405(local6)) {
						if (local6 == Class243.aClass161_14) {
							Class2_Sub3_Sub30.aBoolean403 = true;
							Class2_Sub3.anInt7235 = local17;
							Class2_Sub2_Sub1.anInt61 = local22;
						}
						if (local6.aBoolean282 || local28 < local32 && local30 < local34) {
							if (local6.anInt4265 == 0 && local6.aBoolean295 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class2_Sub13 local151 = (Class2_Sub13) Class183.aClass135_30.method3552(); local151 != null; local151 = (Class2_Sub13) Class183.aClass135_30.method3553()) {
									if (local151.aBoolean157) {
										local151.method6469();
										local151.aClass161_3.aBoolean294 = false;
									}
								}
								if (Static121.anInt2455 == 0) {
									Class243.aClass161_14 = null;
									Class2_Sub3_Sub30.aClass161_13 = null;
								}
								Class229.anInt6437 = 0;
								Class144.aBoolean242 = false;
								Class6.aBoolean427 = false;
								if (!Class243.aBoolean477) {
									Static138.method2705();
								}
							}
							@Pc(207) boolean local207;
							if (Static210.aClass119_1.method3305() >= local28 && Static210.aClass119_1.method3314() >= local30 && Static210.aClass119_1.method3305() < local32 && Static210.aClass119_1.method3314() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Class243.aBoolean477 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static6.method142(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(235) boolean local235 = false;
							if (Static210.aClass119_1.method3312() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static345.aClass2_Sub24_1 != null && Static345.aClass2_Sub24_1.method5248() == 0 && Static345.aClass2_Sub24_1.method5244() >= local28 && Static345.aClass2_Sub24_1.method5243() >= local30 && Static345.aClass2_Sub24_1.method5244() < local32 && Static345.aClass2_Sub24_1.method5243() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray49 != null) {
								for (local278 = 0; local278 < local6.aByteArray49.length; local278++) {
									if (Static163.aClass123_2.method3344(local6.aByteArray49[local278])) {
										if (local6.anIntArray275 == null || Class83.anInt2345 >= local6.anIntArray275[local278]) {
											@Pc(310) byte local310 = local6.aByteArray50[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static163.aClass123_2.method3344(86) && !Static163.aClass123_2.method3344(82) && !Static163.aClass123_2.method3344(81)) && ((local310 & 0x2) == 0 || Static163.aClass123_2.method3344(86)) && ((local310 & 0x1) == 0 || Static163.aClass123_2.method3344(82)) && ((local310 & 0x4) == 0 || Static163.aClass123_2.method3344(81))) {
												Static254.method4682(local6.anInt4310, local278 + 1, "", -1);
												local374 = local6.anIntArray276[local278];
												if (local6.anIntArray275 == null) {
													local6.anIntArray275 = new int[local6.aByteArray49.length];
												}
												if (local374 == 0) {
													local6.anIntArray275[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray275[local278] = Class83.anInt2345 + local374;
												}
											}
										}
									} else if (local6.anIntArray275 != null) {
										local6.anIntArray275[local278] = 0;
									}
								}
							}
							if (local245) {
								Static354.method6336(Static345.aClass2_Sub24_1.method5244() - local17, Static345.aClass2_Sub24_1.method5243() - local22, local6);
							}
							if (Class243.aClass161_14 != null && Class243.aClass161_14 != local6 && local207 && method1406(local6).method1855()) {
								Class127.aClass161_7 = local6;
							}
							if (local6 == Class2_Sub3_Sub30.aClass161_13) {
								Class2_Sub3_Sub26.aBoolean377 = true;
								Class3_Sub1.anInt88 = local17;
								Class2_Sub13.anInt2108 = local22;
							}
							if (local6.aBoolean296 || local6.anInt4266 != 0) {
								@Pc(459) Class2_Sub13 local459;
								if (local207 && Class216_Sub1.anInt6051 != 0 && local6.anObjectArray21 != null) {
									local459 = new Class2_Sub13();
									local459.aBoolean157 = true;
									local459.aClass161_3 = local6;
									local459.anInt2114 = Class216_Sub1.anInt6051;
									local459.anObjectArray4 = local6.anObjectArray21;
									Class183.aClass135_30.method3541(local459);
								}
								if (Class243.aClass161_14 != null || Class243.aBoolean477 || local6.anInt4266 != Class67.anInt1907 && Class229.anInt6437 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt4266 != 0) {
									if (local6.anInt4266 == Class2_Sub24.anInt5743 || local6.anInt4266 == Class104.anInt2705) {
										Class17.aClass161_1 = local6;
										if (Static343.aClass43_1 != null) {
											Static343.aClass43_1.method1619(local6.anInt4255, Static177.aClass19_8);
										}
										if (local6.anInt4266 == Class2_Sub24.anInt5743) {
											if (!Class243.aBoolean477 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static304.method5575(Static177.aClass19_8, arg9, arg8);
												for (@Pc(542) Class12_Sub6 local542 = (Class12_Sub6) Class2_Sub2_Sub6_Sub2.aClass36_10.method1417(); local542 != null; local542 = (Class12_Sub6) Class2_Sub2_Sub6_Sub2.aClass36_10.method1422()) {
													if (arg8 >= local542.anInt4743 && arg8 < local542.anInt4745 && arg9 >= local542.anInt4742 && arg9 < local542.anInt4741) {
														Static138.method2705();
														Static178.method1583(local542.aClass11_Sub5_Sub2_1);
													}
												}
											}
											Static349.method6275(local22, local6, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt4266 == Class2_Sub3_Sub13.anInt2518) {
										if (local6.method4110(Static177.aClass19_8) == null || Class103.anInt2700 != 0 && Class103.anInt2700 != 3 || Class243.aBoolean477 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray282[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray280[local614]) {
											continue;
										}
										local278 -= local6.anInt4242 / 2;
										local614 -= local6.anInt4255 / 2;
										if (Static291.anInt5899 == 4) {
											local653 = (int) Class187.aFloat66 & 0x3FFF;
										} else {
											local653 = (int) Class187.aFloat66 + Class2_Sub3_Sub1.anInt158 & 0x3FFF;
										}
										@Pc(665) int local665 = Class19.anIntArray178[local653];
										@Pc(669) int local669 = Class19.anIntArray177[local653];
										if (Static291.anInt5899 != 4) {
											local665 = local665 * (Class71.anInt2003 + 256) >> 8;
											local669 = local669 * (Class71.anInt2003 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static291.anInt5899 == 4) {
											local719 = (Class2_Sub3_Sub39.anInt7251 >> 7) + (local698 >> 2);
											local727 = (Class229.anInt6436 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() - 1) * 64;
											local719 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6768 - local736 >> 7) + (local698 >> 2);
											local727 = (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt6770 - local736 >> 7) - (local708 >> 2);
										}
										if (Class2_Sub2_Sub10_Sub2.aBoolean419 && (Static108.anInt3833 & 0x40) != 0) {
											@Pc(769) Class161 local769 = Static193.method3706(Static314.anInt6305, InputStream_Sub1.anInt3788);
											if (local769 == null) {
												Static193.method3700();
											} else {
												Static1.method3(local6.anInt4293, true, local727, false, Class67.aString18, local719, 51, " ->", Static38.anInt1043, 1L);
											}
											continue;
										}
										if (Class226.aClass50_4 == Class2_Sub3_Sub12.aClass50_1) {
											Static1.method3(-1, true, local727, false, Class2_Sub41.aClass79_147.method2269(Class197.anInt5569), local719, 59, "", -1, 1L);
										}
										Static1.method3(-1, true, local727, false, Static307.aString62, local719, 22, "", -1, 1L);
										continue;
									}
									if (local6.anInt4266 == Class67.anInt1907) {
										Static211.aClass161_11 = local6;
										if (local207) {
											Class144.aBoolean242 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static345.aClass2_Sub24_1.method5244() - local17 - local6.anInt4242 / 2) * 2.0D / (double) Static321.aFloat71);
											local614 = (int) -((double) (Static345.aClass2_Sub24_1.method5243() - local22 - local6.anInt4255 / 2) * 2.0D / (double) Static321.aFloat71);
											local374 = Static142.anInt2769 + local278 + Static321.anInt6045;
											local653 = Static89.anInt2001 + local614 + Static321.anInt6043;
											@Pc(883) Class2_Sub2_Sub17 local883 = Static352.method6313();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.method6150(local888, local653, local374);
											if (local888 != null) {
												if (Static163.aClass123_2.method3344(82) && Class3_Sub1.anInt90 > 0) {
													Static6.method141(local888[0], local888[2], local888[1]);
													continue;
												}
												Class6.aBoolean427 = true;
												Static260.anInt5339 = local888[0];
												Static259.anInt5335 = local888[1];
												Static4.anInt89 = local888[2];
											}
											Class229.anInt6437 = 1;
											Class163.aBoolean299 = false;
											Class15_Sub1.anInt530 = Static210.aClass119_1.method3305();
											Class251.anInt7215 = Static210.aClass119_1.method3314();
											continue;
										}
										if (local235 && Class229.anInt6437 > 0) {
											if (Class229.anInt6437 == 1 && (Class15_Sub1.anInt530 != Static210.aClass119_1.method3305() || Class251.anInt7215 != Static210.aClass119_1.method3314())) {
												Static311.anInt6230 = Static142.anInt2769;
												Static61.anInt1591 = Static89.anInt2001;
												Class229.anInt6437 = 2;
											}
											if (Class229.anInt6437 == 2) {
												Class163.aBoolean299 = true;
												Static290.method5338(Static311.anInt6230 + (int) ((double) (Class15_Sub1.anInt530 - Static210.aClass119_1.method3305()) * 2.0D / (double) Static321.aFloat72));
												Static74.method5698(Static61.anInt1591 - (int) ((double) (Class251.anInt7215 - Static210.aClass119_1.method3314()) * 2.0D / (double) Static321.aFloat72));
											}
											continue;
										}
										if (Class229.anInt6437 > 0 && !Class163.aBoolean299) {
											if ((Class160.anInt4082 == 1 || Static194.method3711()) && Class2_Sub3_Sub24.anInt4949 > 2) {
												Static134.method2681(Class251.anInt7215, Class15_Sub1.anInt530);
											} else if (Static248.method4556()) {
												Static134.method2681(Class251.anInt7215, Class15_Sub1.anInt530);
											}
										}
										Class229.anInt6437 = 0;
										continue;
									}
									if (local6.anInt4266 == Class43.anInt1460) {
										if (local235) {
											Static187.method3647(Static210.aClass119_1.method3314() - local22, local6.anInt4242, Static210.aClass119_1.method3305() - local17, local6.anInt4255);
										}
										continue;
									}
									if (local6.anInt4266 == Class2_Sub2_Sub8.anInt2486) {
										Static61.method1737(local17, local6, local22);
										continue;
									}
								}
								if (!local6.aBoolean287 && local245) {
									local6.aBoolean287 = true;
									if (local6.anObjectArray14 != null) {
										local459 = new Class2_Sub13();
										local459.aBoolean157 = true;
										local459.aClass161_3 = local6;
										local459.anInt2113 = Static345.aClass2_Sub24_1.method5244() - local17;
										local459.anInt2114 = Static345.aClass2_Sub24_1.method5243() - local22;
										local459.anObjectArray4 = local6.anObjectArray14;
										Class183.aClass135_30.method3541(local459);
									}
								}
								if (local6.aBoolean287 && local235 && local6.anObjectArray28 != null) {
									local459 = new Class2_Sub13();
									local459.aBoolean157 = true;
									local459.aClass161_3 = local6;
									local459.anInt2113 = Static210.aClass119_1.method3305() - local17;
									local459.anInt2114 = Static210.aClass119_1.method3314() - local22;
									local459.anObjectArray4 = local6.anObjectArray28;
									Class183.aClass135_30.method3541(local459);
								}
								if (local6.aBoolean287 && !local235) {
									local6.aBoolean287 = false;
									if (local6.anObjectArray30 != null) {
										local459 = new Class2_Sub13();
										local459.aBoolean157 = true;
										local459.aClass161_3 = local6;
										local459.anInt2113 = Static210.aClass119_1.method3305() - local17;
										local459.anInt2114 = Static210.aClass119_1.method3314() - local22;
										local459.anObjectArray4 = local6.anObjectArray30;
										Class145.aClass135_25.method3541(local459);
									}
								}
								if (local235 && local6.anObjectArray16 != null) {
									local459 = new Class2_Sub13();
									local459.aBoolean157 = true;
									local459.aClass161_3 = local6;
									local459.anInt2113 = Static210.aClass119_1.method3305() - local17;
									local459.anInt2114 = Static210.aClass119_1.method3314() - local22;
									local459.anObjectArray4 = local6.anObjectArray16;
									Class183.aClass135_30.method3541(local459);
								}
								if (!local6.aBoolean294 && local207) {
									local6.aBoolean294 = true;
									if (local6.anObjectArray13 != null) {
										local459 = new Class2_Sub13();
										local459.aBoolean157 = true;
										local459.aClass161_3 = local6;
										local459.anInt2113 = Static210.aClass119_1.method3305() - local17;
										local459.anInt2114 = Static210.aClass119_1.method3314() - local22;
										local459.anObjectArray4 = local6.anObjectArray13;
										Class183.aClass135_30.method3541(local459);
									}
								}
								if (local6.aBoolean294 && local207 && local6.anObjectArray12 != null) {
									local459 = new Class2_Sub13();
									local459.aBoolean157 = true;
									local459.aClass161_3 = local6;
									local459.anInt2113 = Static210.aClass119_1.method3305() - local17;
									local459.anInt2114 = Static210.aClass119_1.method3314() - local22;
									local459.anObjectArray4 = local6.anObjectArray12;
									Class183.aClass135_30.method3541(local459);
								}
								if (local6.aBoolean294 && !local207) {
									local6.aBoolean294 = false;
									if (local6.anObjectArray9 != null) {
										local459 = new Class2_Sub13();
										local459.aBoolean157 = true;
										local459.aClass161_3 = local6;
										local459.anInt2113 = Static210.aClass119_1.method3305() - local17;
										local459.anInt2114 = Static210.aClass119_1.method3314() - local22;
										local459.anObjectArray4 = local6.anObjectArray9;
										Class145.aClass135_25.method3541(local459);
									}
								}
								if (local6.anObjectArray23 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray23;
									Class245.aClass135_43.method3541(local459);
								}
								@Pc(1427) Class2_Sub13 local1427;
								if (local6.anObjectArray19 != null && Class2_Sub2_Sub12.anInt3814 > local6.anInt4259) {
									if (local6.anIntArray278 == null || Class2_Sub2_Sub12.anInt3814 - local6.anInt4259 > 32) {
										local459 = new Class2_Sub13();
										local459.aClass161_3 = local6;
										local459.anObjectArray4 = local6.anObjectArray19;
										Class183.aClass135_30.method3541(local459);
									} else {
										label659: for (local278 = local6.anInt4259; local278 < Class2_Sub2_Sub12.anInt3814; local278++) {
											local614 = Class98.anIntArray167[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray278.length; local374++) {
												if (local6.anIntArray278[local374] == local614) {
													local1427 = new Class2_Sub13();
													local1427.aClass161_3 = local6;
													local1427.anObjectArray4 = local6.anObjectArray19;
													Class183.aClass135_30.method3541(local1427);
													break label659;
												}
											}
										}
									}
									local6.anInt4259 = Class2_Sub2_Sub12.anInt3814;
								}
								if (local6.anObjectArray7 != null && Class46.anInt1481 > local6.anInt4238) {
									if (local6.anIntArray277 == null || Class46.anInt1481 - local6.anInt4238 > 32) {
										local459 = new Class2_Sub13();
										local459.aClass161_3 = local6;
										local459.anObjectArray4 = local6.anObjectArray7;
										Class183.aClass135_30.method3541(local459);
									} else {
										label635: for (local278 = local6.anInt4238; local278 < Class46.anInt1481; local278++) {
											local614 = Class230.anIntArray444[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray277.length; local374++) {
												if (local6.anIntArray277[local374] == local614) {
													local1427 = new Class2_Sub13();
													local1427.aClass161_3 = local6;
													local1427.anObjectArray4 = local6.anObjectArray7;
													Class183.aClass135_30.method3541(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt4238 = Class46.anInt1481;
								}
								if (local6.anObjectArray10 != null && Class9.anInt269 > local6.anInt4275) {
									if (local6.anIntArray273 == null || Class9.anInt269 - local6.anInt4275 > 32) {
										local459 = new Class2_Sub13();
										local459.aClass161_3 = local6;
										local459.anObjectArray4 = local6.anObjectArray10;
										Class183.aClass135_30.method3541(local459);
									} else {
										label611: for (local278 = local6.anInt4275; local278 < Class9.anInt269; local278++) {
											local614 = Class2_Sub3_Sub6.anIntArray85[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray273.length; local374++) {
												if (local6.anIntArray273[local374] == local614) {
													local1427 = new Class2_Sub13();
													local1427.aClass161_3 = local6;
													local1427.anObjectArray4 = local6.anObjectArray10;
													Class183.aClass135_30.method3541(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt4275 = Class9.anInt269;
								}
								if (local6.anObjectArray29 != null && Class15_Sub2.anInt1415 > local6.anInt4297) {
									if (local6.anIntArray281 == null || Class15_Sub2.anInt1415 - local6.anInt4297 > 32) {
										local459 = new Class2_Sub13();
										local459.aClass161_3 = local6;
										local459.anObjectArray4 = local6.anObjectArray29;
										Class183.aClass135_30.method3541(local459);
									} else {
										label587: for (local278 = local6.anInt4297; local278 < Class15_Sub2.anInt1415; local278++) {
											local614 = Class2_Sub3_Sub12.anIntArray135[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray281.length; local374++) {
												if (local6.anIntArray281[local374] == local614) {
													local1427 = new Class2_Sub13();
													local1427.aClass161_3 = local6;
													local1427.anObjectArray4 = local6.anObjectArray29;
													Class183.aClass135_30.method3541(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt4297 = Class15_Sub2.anInt1415;
								}
								if (local6.anObjectArray5 != null && Class90_Sub1.anInt7104 > local6.anInt4305) {
									if (local6.anIntArray274 == null || Class90_Sub1.anInt7104 - local6.anInt4305 > 32) {
										local459 = new Class2_Sub13();
										local459.aClass161_3 = local6;
										local459.anObjectArray4 = local6.anObjectArray5;
										Class183.aClass135_30.method3541(local459);
									} else {
										label563: for (local278 = local6.anInt4305; local278 < Class90_Sub1.anInt7104; local278++) {
											local614 = Class146.anIntArray226[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray274.length; local374++) {
												if (local6.anIntArray274[local374] == local614) {
													local1427 = new Class2_Sub13();
													local1427.aClass161_3 = local6;
													local1427.anObjectArray4 = local6.anObjectArray5;
													Class183.aClass135_30.method3541(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt4305 = Class90_Sub1.anInt7104;
								}
								if (Class18.anInt551 > local6.anInt4307 && local6.anObjectArray26 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray26;
									Class183.aClass135_30.method3541(local459);
								}
								if (Class11_Sub4.anInt3966 > local6.anInt4307 && local6.anObjectArray25 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray25;
									Class183.aClass135_30.method3541(local459);
								}
								if (Class191.anInt5358 > local6.anInt4307 && local6.anObjectArray18 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray18;
									Class183.aClass135_30.method3541(local459);
								}
								if (Class123_Sub1.anInt3377 > local6.anInt4307 && local6.anObjectArray33 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray33;
									Class183.aClass135_30.method3541(local459);
								}
								if (Class69.anInt1948 > local6.anInt4307 && local6.anObjectArray24 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray24;
									Class183.aClass135_30.method3541(local459);
								}
								local6.anInt4307 = Class65.anInt1874;
								if (local6.anObjectArray17 != null) {
									for (local278 = 0; local278 < Class2_Sub3_Sub1.anInt159; local278++) {
										@Pc(1895) Class2_Sub13 local1895 = new Class2_Sub13();
										local1895.aClass161_3 = local6;
										local1895.anInt2111 = Class111.aClass37Array1[local278].method1463();
										local1895.anInt2112 = Class111.aClass37Array1[local278].method1458();
										local1895.anObjectArray4 = local6.anObjectArray17;
										Class183.aClass135_30.method3541(local1895);
									}
								}
								if (Class3.aBoolean9 && local6.anObjectArray20 != null) {
									local459 = new Class2_Sub13();
									local459.aClass161_3 = local6;
									local459.anObjectArray4 = local6.anObjectArray20;
									Class183.aClass135_30.method3541(local459);
								}
							}
							if (local6.anInt4265 == 5 && local6.anInt4273 != -1) {
								local6.method4112(Static9.aClass213_1, Static255.aClass160_1).method1619(local6.anInt4255, Static177.aClass19_8);
							}
							Static23.method852(local6);
							if (local6.anInt4265 == 0) {
								method1402(arg0, local6.anInt4310, local28, local30, local32, local34, local17 - local6.anInt4252, local22 - local6.anInt4253, arg8, arg9);
								if (local6.aClass161Array2 != null) {
									method1402(local6.aClass161Array2, local6.anInt4310, local28, local30, local32, local34, local17 - local6.anInt4252, local22 - local6.anInt4253, arg8, arg9);
								}
								@Pc(2017) Class2_Sub7 local2017 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local6.anInt4310);
								if (local2017 != null) {
									if (Class226.aClass50_4 == Class2_Sub26.aClass50_3 && local2017.anInt1371 == 0 && !Class243.aBoolean477 && local207 && !Class15_Sub1.aBoolean30) {
										Static138.method2705();
									}
									Static237.method3928(local17, local34, local32, local30, local22, arg8, local2017.anInt1368, arg9, local28);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static23.method852(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z", line = 1632)
	public static boolean method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static34.method1106(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static299.anInt6017;
		@Pc(14) int local14 = arg2 << Static299.anInt6017;
		@Pc(23) int local23 = Static340.aClass6Array4[arg0].method5720(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 == 1) {
			if (local10 > Static328.anInt6520) {
				if (!Static43.method1425(local10, local23, local14)) {
					return false;
				}
				if (!Static43.method1425(local10, local23, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static43.method1425(local10, local27, local14)) {
					return false;
				}
				if (!Static43.method1425(local10, local27, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
			}
			if (Static43.method1425(local10, local31, local14)) {
				return Static43.method1425(local10, local31, local14 + Class11_Sub5_Sub3.anInt4707);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static334.anInt6684) {
				if (!Static43.method1425(local10, local23, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local23, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static43.method1425(local10, local27, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local27, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
			}
			if (Static43.method1425(local10, local31, local14 + Class11_Sub5_Sub3.anInt4707)) {
				return Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local31, local14 + Class11_Sub5_Sub3.anInt4707);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static328.anInt6520) {
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local23, local14)) {
					return false;
				}
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local23, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local27, local14)) {
					return false;
				}
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local27, local14 + Class11_Sub5_Sub3.anInt4707)) {
					return false;
				}
			}
			if (Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local31, local14)) {
				return Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local31, local14 + Class11_Sub5_Sub3.anInt4707);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static334.anInt6684) {
				if (!Static43.method1425(local10, local23, local14)) {
					return false;
				}
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static43.method1425(local10, local27, local14)) {
					return false;
				}
				if (!Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local27, local14)) {
					return false;
				}
			}
			if (Static43.method1425(local10, local31, local14)) {
				return Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local31, local14);
			} else {
				return false;
			}
		} else if (!Static43.method1425(local10 + Static233.anInt4684, local35, local14 + Static233.anInt4684)) {
			return false;
		} else if (arg3 == 16) {
			return Static43.method1425(local10, local31, local14 + Class11_Sub5_Sub3.anInt4707);
		} else if (arg3 == 32) {
			return Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local31, local14 + Class11_Sub5_Sub3.anInt4707);
		} else if (arg3 == 64) {
			return Static43.method1425(local10 + Class11_Sub5_Sub3.anInt4707, local31, local14);
		} else if (arg3 == 128) {
			return Static43.method1425(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!nk;)Z", line = 2309)
	public static boolean method1405(@OriginalArg(0) Class161 arg0) {
		if (Class15_Sub1.aBoolean30) {
			if (method1406(arg0).anInt1756 != 0) {
				return false;
			}
			if (arg0.anInt4265 == 0) {
				return false;
			}
		}
		return arg0.aBoolean284;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!nk;)Lclient!eh;", line = 2327)
	public static Class2_Sub10 method1406(@OriginalArg(0) Class161 arg0) {
		@Pc(13) Class2_Sub10 local13 = (Class2_Sub10) Class219.aClass4_127.method90(((long) arg0.anInt4310 << 32) + (long) arg0.anInt4290);
		return local13 == null ? arg0.aClass2_Sub10_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2616)
	public static void method1409() {
		Class2_Sub7.anInt1367 = 0;
		for (@Pc(3) int local3 = 0; local3 < Class117.anInt3183; local3++) {
			@Pc(10) Class11_Sub5_Sub2_Sub2 local10 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local3]];
			if (local10.aBoolean320 && local10.method4325() != -1) {
				@Pc(28) int local28 = (local10.method4329() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6768 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6770 - local28 >> 7;
				@Pc(49) Class11_Sub5_Sub2 local49 = Static212.method3998(local10.aByte78, local35, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt4610;
					if (local49 instanceof Class11_Sub5_Sub2_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt4616 == 0 && local49.method4325() != -1) {
						Class2_Sub3_Sub16.anIntArray175[Class2_Sub7.anInt1367] = local54;
						Class114.anIntArray186[Class2_Sub7.anInt1367] = local54;
						Class2_Sub7.anInt1367++;
						local49.anInt4616++;
					}
					Class2_Sub3_Sub16.anIntArray175[Class2_Sub7.anInt1367] = local54;
					Class114.anIntArray186[Class2_Sub7.anInt1367] = local10.anInt4610 + 2048;
					Class2_Sub7.anInt1367++;
					local49.anInt4616++;
				}
			}
		}
		Static118.method6344(Class114.anIntArray186, Class2_Sub7.anInt1367 - 1, 0, Class2_Sub3_Sub16.anIntArray175);
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2668)
	public static void method1410(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Class28.anInt751;
		@Pc(3) int[] local3 = Class64.anIntArray121;
		for (@Pc(5) int local5 = 0; local5 < local1 + Class117.anInt3183; local5++) {
			@Pc(15) Class11_Sub5_Sub2 local15;
			if (local5 < local1) {
				local15 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local5 - local1]];
			}
			if (local15.aByte78 == arg0 && local15.anInt4629 >= 0) {
				@Pc(35) int local35 = local15.method4329();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6768 & 0x7F) != 0 || (local15.anInt6770 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6768 & 0x7F) != 64 || (local15.anInt6770 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6768 >> 7;
					local76 = local15.anInt6770 >> 7;
					if (local15.anInt4629 > Static296.anIntArrayArray51[local71][local76]) {
						Static296.anIntArrayArray51[local71][local76] = local15.anInt4629;
						Static278.anIntArrayArray50[local71][local76] = 1;
					} else if (local15.anInt4629 == Static296.anIntArrayArray51[local71][local76]) {
						local112 = Static278.anIntArrayArray50[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6768 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6770 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6768 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6770 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt4629 > Static296.anIntArrayArray51[local154][local157]) {
								Static296.anIntArrayArray51[local154][local157] = local15.anInt4629;
								Static278.anIntArrayArray50[local154][local157] = 1;
							} else if (local15.anInt4629 == Static296.anIntArrayArray51[local154][local157]) {
								local112 = Static278.anIntArrayArray50[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2770)
	public static void method1411(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Class28.anInt751;
		@Pc(3) int[] local3 = Class64.anIntArray121;
		@Pc(11) int local11 = Class37_Sub1.aBoolean102 ? local1 : local1 + Class117.anInt3183;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub5_Sub2 local23;
			if (local13 < local1) {
				local23 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local13 - local1]];
			}
			if (local23.aByte78 == arg0) {
				local23.anInt4616 = 0;
				if (local23.anInt4629 < 0) {
					local23.aBoolean320 = false;
				} else {
					@Pc(50) int local50 = local23.method4329();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6768 & 0x7F) != 0 || (local23.anInt6770 & 0x7F) != 0) {
							local23.aBoolean320 = false;
							continue;
						}
					} else if ((local23.anInt6768 & 0x7F) != 64 || (local23.anInt6770 & 0x7F) != 64) {
						local23.aBoolean320 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6768 >> 7;
						local97 = local23.anInt6770 >> 7;
						if (local23.anInt4629 != Static296.anIntArrayArray51[local92][local97]) {
							local23.aBoolean320 = true;
							continue;
						}
						if (Static278.anIntArrayArray50[local92][local97] > 1) {
							local122 = Static278.anIntArrayArray50[local92][local97]--;
							local23.aBoolean320 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6768 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6770 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6768 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6770 + local92 >> 7;
						if (!Static335.method5651(local23.anInt4629, local151, local165, local158, local97)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt4629 == Static296.anIntArrayArray51[local176][local179]) {
										local122 = Static278.anIntArrayArray50[local176][local179]--;
									}
								}
							}
							local23.aBoolean320 = true;
							continue;
						}
					}
					if (local23 instanceof Class11_Sub5_Sub2_Sub1 && local23.aClass2_Sub6_3 != null && Class83.anInt2345 >= local23.aClass2_Sub6_3.anInt1099 && Class83.anInt2345 < local23.aClass2_Sub6_3.anInt1117) {
						((Class11_Sub5_Sub2_Sub1) local23).aBoolean275 = false;
					}
					local23.aBoolean320 = false;
					local23.anInt6769 = Static360.method6033(local23.anInt6768, local23.anInt6770, local23.aByte78);
					Static306.method5631(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3004)
	public static void method1412() {
		@Pc(1) int local1 = Class28.anInt751;
		@Pc(3) int[] local3 = Class64.anIntArray121;
		@Pc(11) int local11 = Class37_Sub1.aBoolean102 ? local1 : local1 + Class117.anInt3183;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub5_Sub2 local23;
			if (local13 < local1) {
				local23 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local13 - local1]];
			}
			if (local23.anInt4629 >= 0) {
				@Pc(39) int local39 = local23.method4329();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6768 & 0x7F) == 0 && (local23.anInt6770 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6768 & 0x7F) == 64 && (local23.anInt6770 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class11_Sub5_Sub2_Sub1 && local23.aClass2_Sub6_3 != null && Class83.anInt2345 >= local23.aClass2_Sub6_3.anInt1099 && Class83.anInt2345 < local23.aClass2_Sub6_3.anInt1117) {
					((Class11_Sub5_Sub2_Sub1) local23).aBoolean275 = false;
				}
				local23.anInt6769 = Static360.method6033(local23.anInt6768, local23.anInt6770, local23.aByte78);
				Static306.method5631(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!nk;)Lclient!nk;", line = 3692)
	public static Class161 method1415(@OriginalArg(0) Class161 arg0) {
		@Pc(4) int local4 = method1406(arg0).method1852();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static6.method140(arg0.anInt4268);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
