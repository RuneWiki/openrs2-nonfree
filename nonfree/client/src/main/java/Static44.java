import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_66 = new Class159(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_67 = new Class159("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!br;)Lclient!d;")
	public static Class4_Sub12 method877(@OriginalArg(0) Class21 arg0) {
		@Pc(13) Class4_Sub12 local13 = (Class4_Sub12) Static33.aClass43_5.method1273(((long) arg0.anInt728 << 32) + (long) arg0.anInt791);
		return local13 == null ? arg0.aClass4_Sub12_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method878() {
		@Pc(7) int local7 = Static83.aBoolean170 ? Static289.anInt5643 : Static289.anInt5643 + Static145.anInt3273;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class8_Sub1_Sub2 local14;
			if (local9 < 0) {
				local14 = Static158.aClass8_Sub1_Sub2_Sub1_1;
			} else if (local9 < Static289.anInt5643) {
				local14 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local9]];
			} else {
				local14 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local9 - Static289.anInt5643]];
			}
			local14.anInt4927 = 0;
			if (local14.anInt4930 < 0) {
				local14.aBoolean373 = false;
			} else {
				@Pc(47) int local47 = local14.method4349();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt6701 & 0x7F) != 0 || (local14.anInt6702 & 0x7F) != 0) {
						local14.aBoolean373 = false;
						continue;
					}
				} else if ((local14.anInt6701 & 0x7F) != 64 || (local14.anInt6702 & 0x7F) != 64) {
					local14.aBoolean373 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt6701 >> 7;
					local94 = local14.anInt6702 >> 7;
					if (local14.anInt4930 != Static293.anIntArrayArray119[local89][local94]) {
						local14.aBoolean373 = true;
						continue;
					}
					if (Static101.anIntArrayArray185[local89][local94] > 1) {
						local119 = Static101.anIntArrayArray185[local89][local94]--;
						local14.aBoolean373 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt6701 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt6702 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt6701 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt6702 + local89 >> 7;
					if (!Static38.method754(local94, local14.anInt4930, local148, local162, local155)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt4930 == Static293.anIntArrayArray119[local173][local176]) {
									local119 = Static101.anIntArrayArray185[local173][local176]--;
								}
							}
						}
						local14.aBoolean373 = true;
						continue;
					}
				}
				if (local14 instanceof Class8_Sub1_Sub2_Sub1 && local14.anInterface7_3 != null && Static199.anInt4137 >= local14.anInt4988 && Static199.anInt4137 < local14.anInt4986) {
					((Class8_Sub1_Sub2_Sub1) local14).aBoolean169 = false;
				}
				local14.aBoolean373 = false;
				local14.anInt6697 = Static81.method2010(Static12.anInt267, local14.anInt6702, local14.anInt6701);
				Static301.method4952(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method880() {
		if (Static229.aFrame1 != null) {
			return;
		}
		@Pc(13) Container local13;
		if (Static308.aFrame2 == null) {
			local13 = Static1.aClass134_7.anApplet1;
		} else {
			local13 = Static308.aFrame2;
		}
		Static255.anInt5171 = local13.getSize().width;
		Static165.anInt3522 = local13.getSize().height;
		@Pc(35) Insets local35;
		if (Static308.aFrame2 == local13) {
			local35 = Static308.aFrame2.getInsets();
			Static165.anInt3522 -= local35.top + local35.bottom;
			Static255.anInt5171 -= local35.left + local35.right;
		}
		if (Static35.method713() == 1) {
			Static24.anInt496 = 765;
			Static179.anInt3824 = (Static255.anInt5171 - 765) / 2;
			Static140.anInt3219 = 0;
			Static23.anInt465 = 503;
		} else if (Static286.anInt6700 < 96 && Static225.anInt4568 == 0) {
			@Pc(72) int local72 = Static255.anInt5171 <= 1024 ? Static255.anInt5171 : 1024;
			Static24.anInt496 = local72;
			Static179.anInt3824 = (Static255.anInt5171 - local72) / 2;
			@Pc(88) int local88 = Static165.anInt3522 <= 768 ? Static165.anInt3522 : 768;
			Static140.anInt3219 = 0;
			Static23.anInt465 = local88;
		} else {
			Static24.anInt496 = Static255.anInt5171;
			Static23.anInt465 = Static165.anInt3522;
			Static140.anInt3219 = 0;
			Static179.anInt3824 = 0;
		}
		if (Static80.anInt2116 != 0) {
			@Pc(128) boolean local128;
			if (Static24.anInt496 < 1024 && Static23.anInt465 < 768) {
				local128 = true;
			} else {
				local128 = false;
			}
		}
		Static300.aCanvas5.setSize(Static24.anInt496, Static23.anInt465);
		if (Static274.aClass47_9 != null) {
			Static274.aClass47_9.method2691();
		}
		if (local13 == Static308.aFrame2) {
			local35 = Static308.aFrame2.getInsets();
			Static300.aCanvas5.setLocation(local35.left + Static179.anInt3824, local35.top + Static140.anInt3219);
		} else {
			Static300.aCanvas5.setLocation(Static179.anInt3824, Static140.anInt3219);
		}
		if (Static357.anInt6821 != -1) {
			Static196.method5556(true);
		}
		Static12.method241();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLjava/lang/String;ILclient!tj;)Lclient!na;")
	public static Class137 method881(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class193 arg2) {
		@Pc(16) int local16 = arg2.method5066(arg1);
		if (local16 == -1) {
			return new Class137(0);
		}
		@Pc(29) int[] local29 = arg2.method5038(local16);
		@Pc(35) Class137 local35 = new Class137(local29.length);
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		while (true) {
			while (local37 < local35.anInt4323) {
				@Pc(53) Class4_Sub11 local53 = new Class4_Sub11(arg2.method5047(local16, local29[local39++]));
				@Pc(57) int local57 = local53.method3418();
				@Pc(61) int local61 = local53.method3401();
				@Pc(65) int local65 = local53.method3440();
				if (!arg0 && local65 == 1) {
					local35.anInt4323--;
				} else {
					local35.anIntArray367[local37] = local57;
					local35.anIntArray368[local37] = local61;
					local37++;
				}
			}
			return local35;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!br;IIIIIIIII)V")
	public static void method882(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class21 local6 = arg0[local1];
			if (local6 != null && local6.anInt723 == arg1) {
				@Pc(17) int local17 = local6.anInt709 + arg6;
				@Pc(22) int local22 = local6.anInt712 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt722 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt740;
					@Pc(45) int local45 = local22 + local6.anInt758;
					if (local6.anInt722 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt722 == 0 || local6.aBoolean80 || method877(local6).anInt1386 != 0 || local6 == Static182.aClass21_11 || local6.anInt757 == 1338) {
					if (!method889(local6)) {
						if (local6 == Static103.aClass21_5) {
							Static284.aBoolean419 = true;
							Static190.anInt3975 = local17;
							Static169.anInt3600 = local22;
						}
						if (local6.aBoolean68 || local28 < local32 && local30 < local34) {
							if (local6.anInt722 == 0 && local6.aBoolean66 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class4_Sub34 local151 = (Class4_Sub34) Static318.aClass116_45.method3270(); local151 != null; local151 = (Class4_Sub34) Static318.aClass116_45.method3272()) {
									if (local151.aBoolean365) {
										local151.method5687();
										local151.aClass21_12.aBoolean73 = false;
									}
								}
								if (Static205.anInt4303 == 0) {
									Static103.aClass21_5 = null;
									Static182.aClass21_11 = null;
								}
								Static93.anInt2506 = 0;
								Static336.aBoolean469 = false;
								Static307.aBoolean442 = false;
								if (!Static272.aBoolean393) {
									Static188.method3568();
								}
							}
							@Pc(207) boolean local207;
							if (Static258.aClass127_1.method3588() >= local28 && Static258.aClass127_1.method3595() >= local30 && Static258.aClass127_1.method3588() < local32 && Static258.aClass127_1.method3595() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static272.aBoolean393 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static35.method724(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(235) boolean local235 = false;
							if (Static258.aClass127_1.method3589() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static138.aClass4_Sub28_2 != null && Static138.aClass4_Sub28_2.method5558() == 0 && Static138.aClass4_Sub28_2.method5555() >= local28 && Static138.aClass4_Sub28_2.method5559() >= local30 && Static138.aClass4_Sub28_2.method5555() < local32 && Static138.aClass4_Sub28_2.method5559() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray11 != null) {
								for (local278 = 0; local278 < local6.aByteArray11.length; local278++) {
									if (Static264.aClass92_3.method2620(local6.aByteArray11[local278])) {
										if (local6.anIntArray33 == null || Static199.anInt4137 >= local6.anIntArray33[local278]) {
											@Pc(310) byte local310 = local6.aByteArray12[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static264.aClass92_3.method2620(86) && !Static264.aClass92_3.method2620(82) && !Static264.aClass92_3.method2620(81)) && ((local310 & 0x2) == 0 || Static264.aClass92_3.method2620(86)) && ((local310 & 0x1) == 0 || Static264.aClass92_3.method2620(82)) && ((local310 & 0x4) == 0 || Static264.aClass92_3.method2620(81))) {
												Static295.method4917(-1, local278 + 1, "", local6.anInt728);
												local374 = local6.anIntArray38[local278];
												if (local6.anIntArray33 == null) {
													local6.anIntArray33 = new int[local6.aByteArray11.length];
												}
												if (local374 == 0) {
													local6.anIntArray33[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray33[local278] = Static199.anInt4137 + local374;
												}
											}
										}
									} else if (local6.anIntArray33 != null) {
										local6.anIntArray33[local278] = 0;
									}
								}
							}
							if (local245) {
								Static23.method385(Static138.aClass4_Sub28_2.method5555() - local17, Static138.aClass4_Sub28_2.method5559() - local22, local6);
							}
							if (Static103.aClass21_5 != null && Static103.aClass21_5 != local6 && local207 && method877(local6).method1027()) {
								Static181.aClass21_9 = local6;
							}
							if (local6 == Static182.aClass21_11) {
								Static211.aBoolean343 = true;
								Static320.anInt6196 = local17;
								Static241.anInt4874 = local22;
							}
							if (local6.aBoolean80 || local6.anInt757 != 0) {
								@Pc(459) Class4_Sub34 local459;
								if (local207 && Static310.anInt6021 != 0 && local6.anObjectArray22 != null) {
									local459 = new Class4_Sub34();
									local459.aBoolean365 = true;
									local459.aClass21_12 = local6;
									local459.anInt4876 = Static310.anInt6021;
									local459.anObjectArray34 = local6.anObjectArray22;
									Static318.aClass116_45.method3274(local459);
								}
								if (Static103.aClass21_5 != null || Static272.aBoolean393 || local6.anInt757 != 1400 && Static93.anInt2506 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt757 != 0) {
									if (local6.anInt757 == 1337 || local6.anInt757 == 1403) {
										Static227.aClass21_4 = local6;
										if (Static122.aClass73_1 != null) {
											Static122.aClass73_1.method2224(local6.anInt758, Static274.aClass47_9);
										}
										if (local6.anInt757 == 1337) {
											if (!Static272.aBoolean393 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static304.method4985(arg9, Static274.aClass47_9, arg8);
												for (@Pc(542) Class2_Sub6 local542 = (Class2_Sub6) Static197.aClass32_8.method850(); local542 != null; local542 = (Class2_Sub6) Static197.aClass32_8.method846()) {
													if (arg8 >= local542.anInt5750 && arg8 < local542.anInt5751 && arg9 >= local542.anInt5749 && arg9 < local542.anInt5747) {
														Static188.method3568();
														Static124.method2574(local542.aClass8_Sub1_Sub2_1);
													}
												}
											}
											Static308.method5087(local6, local22, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt757 == 1338) {
										if (local6.method545(Static274.aClass47_9) == null || Static249.anInt5064 != 0 && Static249.anInt5064 != 3 || Static272.aBoolean393 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray34[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray32[local614]) {
											continue;
										}
										local278 -= local6.anInt740 / 2;
										local614 -= local6.anInt758 / 2;
										if (Static353.anInt2640 == 4) {
											local653 = (int) Static106.aFloat31 & 0x3FFF;
										} else {
											local653 = (int) Static106.aFloat31 + Static75.anInt1928 & 0x3FFF;
										}
										@Pc(665) int local665 = Class118_Sub1.anIntArray314[local653];
										@Pc(669) int local669 = Class118_Sub1.anIntArray317[local653];
										if (Static353.anInt2640 != 4) {
											local665 = local665 * (Static255.anInt5169 + 256) >> 8;
											local669 = local669 * (Static255.anInt5169 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static353.anInt2640 == 4) {
											local719 = (Static64.anInt1662 >> 7) + (local698 >> 2);
											local727 = (Static207.anInt4327 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static158.aClass8_Sub1_Sub2_Sub1_1.method4349() - 1) * 64;
											local719 = (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 - local736 >> 7) + (local698 >> 2);
											local727 = (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 - local736 >> 7) - (local708 >> 2);
										}
										if (Static344.aBoolean219 && (Static48.anInt1288 & 0x40) != 0) {
											@Pc(769) Class21 local769 = Static156.method4515(Static255.anInt5164, Static82.anInt2376);
											if (local769 == null) {
												Static75.method1745();
											} else {
												Static138.method2617(1L, " ->", 48, Static169.anInt3596, Static171.aString34, local719, local727);
											}
											continue;
										}
										if (Static330.anInt6312 == 1) {
											Static138.method2617(1L, "", 45, -1, Static278.aClass159_363.method4311(Static180.anInt3835), local719, local727);
										}
										Static138.method2617(1L, "", 57, -1, Static333.aString63, local719, local727);
										continue;
									}
									if (local6.anInt757 == 1400) {
										Static173.aClass21_8 = local6;
										if (local207) {
											Static336.aBoolean469 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static138.aClass4_Sub28_2.method5555() - local17 - local6.anInt740 / 2) * 2.0D / (double) Static54.aFloat69);
											local614 = (int) -((double) (Static138.aClass4_Sub28_2.method5559() - local22 - local6.anInt758 / 2) * 2.0D / (double) Static54.aFloat69);
											local374 = Static8.anInt200 + local278 + Static54.anInt4745;
											local653 = Static60.anInt1574 + local614 + Static54.anInt4748;
											@Pc(873) Class4_Sub4_Sub11 local873 = Static178.method3400();
											if (local873 == null) {
												continue;
											}
											@Pc(878) int[] local878 = new int[3];
											local873.method3893(local374, local878, local653);
											if (local878 != null) {
												if (Static264.aClass92_3.method2620(82) && Static23.anInt452 > 0) {
													Static296.method4922(local878[1], local878[2], local878[0]);
													continue;
												}
												Static307.aBoolean442 = true;
												Static238.anInt5296 = local878[0];
												Static339.anInt8 = local878[1];
												Static77.anInt2070 = local878[2];
											}
											Static93.anInt2506 = 1;
											Static58.aBoolean111 = false;
											Static70.anInt1828 = Static258.aClass127_1.method3588();
											Static173.anInt3682 = Static258.aClass127_1.method3595();
											continue;
										}
										if (local235 && Static93.anInt2506 > 0) {
											if (Static93.anInt2506 == 1 && (Static70.anInt1828 != Static258.aClass127_1.method3588() || Static173.anInt3682 != Static258.aClass127_1.method3595())) {
												Static179.anInt3825 = Static8.anInt200;
												Static7.anInt190 = Static60.anInt1574;
												Static93.anInt2506 = 2;
											}
											if (Static93.anInt2506 == 2) {
												Static58.aBoolean111 = true;
												Static12.method244(Static179.anInt3825 + (int) ((double) (Static70.anInt1828 - Static258.aClass127_1.method3588()) * 2.0D / (double) Static54.aFloat70));
												Static86.method2109(Static7.anInt190 - (int) ((double) (Static173.anInt3682 - Static258.aClass127_1.method3595()) * 2.0D / (double) Static54.aFloat70));
											}
											continue;
										}
										if (Static93.anInt2506 > 0 && !Static58.aBoolean111) {
											if ((Static321.anInt4799 == 1 || Static121.method4351()) && Static105.anInt2645 > 2) {
												Static265.method4580(Static70.anInt1828, Static173.anInt3682, 2);
											} else if (Static222.method4008()) {
												Static265.method4580(Static70.anInt1828, Static173.anInt3682, 0);
											}
										}
										Static93.anInt2506 = 0;
										continue;
									}
									if (local6.anInt757 == 1401) {
										if (local235) {
											Static186.method3556(local6.anInt758, Static258.aClass127_1.method3588() - local17, Static258.aClass127_1.method3595() - local22, local6.anInt740);
										}
										continue;
									}
									if (local6.anInt757 == 1406) {
										Static290.method4876(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean82 && local245) {
									local6.aBoolean82 = true;
									if (local6.anObjectArray1 != null) {
										local459 = new Class4_Sub34();
										local459.aBoolean365 = true;
										local459.aClass21_12 = local6;
										local459.anInt4867 = Static138.aClass4_Sub28_2.method5555() - local17;
										local459.anInt4876 = Static138.aClass4_Sub28_2.method5559() - local22;
										local459.anObjectArray34 = local6.anObjectArray1;
										Static318.aClass116_45.method3274(local459);
									}
								}
								if (local6.aBoolean82 && local235 && local6.anObjectArray24 != null) {
									local459 = new Class4_Sub34();
									local459.aBoolean365 = true;
									local459.aClass21_12 = local6;
									local459.anInt4867 = Static258.aClass127_1.method3588() - local17;
									local459.anInt4876 = Static258.aClass127_1.method3595() - local22;
									local459.anObjectArray34 = local6.anObjectArray24;
									Static318.aClass116_45.method3274(local459);
								}
								if (local6.aBoolean82 && !local235) {
									local6.aBoolean82 = false;
									if (local6.anObjectArray21 != null) {
										local459 = new Class4_Sub34();
										local459.aBoolean365 = true;
										local459.aClass21_12 = local6;
										local459.anInt4867 = Static258.aClass127_1.method3588() - local17;
										local459.anInt4876 = Static258.aClass127_1.method3595() - local22;
										local459.anObjectArray34 = local6.anObjectArray21;
										Static301.aClass116_44.method3274(local459);
									}
								}
								if (local235 && local6.anObjectArray30 != null) {
									local459 = new Class4_Sub34();
									local459.aBoolean365 = true;
									local459.aClass21_12 = local6;
									local459.anInt4867 = Static258.aClass127_1.method3588() - local17;
									local459.anInt4876 = Static258.aClass127_1.method3595() - local22;
									local459.anObjectArray34 = local6.anObjectArray30;
									Static318.aClass116_45.method3274(local459);
								}
								if (!local6.aBoolean73 && local207) {
									local6.aBoolean73 = true;
									if (local6.anObjectArray28 != null) {
										local459 = new Class4_Sub34();
										local459.aBoolean365 = true;
										local459.aClass21_12 = local6;
										local459.anInt4867 = Static258.aClass127_1.method3588() - local17;
										local459.anInt4876 = Static258.aClass127_1.method3595() - local22;
										local459.anObjectArray34 = local6.anObjectArray28;
										Static318.aClass116_45.method3274(local459);
									}
								}
								if (local6.aBoolean73 && local207 && local6.anObjectArray25 != null) {
									local459 = new Class4_Sub34();
									local459.aBoolean365 = true;
									local459.aClass21_12 = local6;
									local459.anInt4867 = Static258.aClass127_1.method3588() - local17;
									local459.anInt4876 = Static258.aClass127_1.method3595() - local22;
									local459.anObjectArray34 = local6.anObjectArray25;
									Static318.aClass116_45.method3274(local459);
								}
								if (local6.aBoolean73 && !local207) {
									local6.aBoolean73 = false;
									if (local6.anObjectArray18 != null) {
										local459 = new Class4_Sub34();
										local459.aBoolean365 = true;
										local459.aClass21_12 = local6;
										local459.anInt4867 = Static258.aClass127_1.method3588() - local17;
										local459.anInt4876 = Static258.aClass127_1.method3595() - local22;
										local459.anObjectArray34 = local6.anObjectArray18;
										Static301.aClass116_44.method3274(local459);
									}
								}
								if (local6.anObjectArray2 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray2;
									Static135.aClass116_26.method3274(local459);
								}
								@Pc(1419) Class4_Sub34 local1419;
								if (local6.anObjectArray7 != null && Static263.anInt6815 > local6.anInt730) {
									if (local6.anIntArray35 == null || Static263.anInt6815 - local6.anInt730 > 32) {
										local459 = new Class4_Sub34();
										local459.aClass21_12 = local6;
										local459.anObjectArray34 = local6.anObjectArray7;
										Static318.aClass116_45.method3274(local459);
									} else {
										label657: for (local278 = local6.anInt730; local278 < Static263.anInt6815; local278++) {
											local614 = Static91.anIntArray471[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray35.length; local374++) {
												if (local6.anIntArray35[local374] == local614) {
													local1419 = new Class4_Sub34();
													local1419.aClass21_12 = local6;
													local1419.anObjectArray34 = local6.anObjectArray7;
													Static318.aClass116_45.method3274(local1419);
													break label657;
												}
											}
										}
									}
									local6.anInt730 = Static263.anInt6815;
								}
								if (local6.anObjectArray8 != null && Static182.anInt3852 > local6.anInt780) {
									if (local6.anIntArray37 == null || Static182.anInt3852 - local6.anInt780 > 32) {
										local459 = new Class4_Sub34();
										local459.aClass21_12 = local6;
										local459.anObjectArray34 = local6.anObjectArray8;
										Static318.aClass116_45.method3274(local459);
									} else {
										label633: for (local278 = local6.anInt780; local278 < Static182.anInt3852; local278++) {
											local614 = Static331.anIntArray489[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray37.length; local374++) {
												if (local6.anIntArray37[local374] == local614) {
													local1419 = new Class4_Sub34();
													local1419.aClass21_12 = local6;
													local1419.anObjectArray34 = local6.anObjectArray8;
													Static318.aClass116_45.method3274(local1419);
													break label633;
												}
											}
										}
									}
									local6.anInt780 = Static182.anInt3852;
								}
								if (local6.anObjectArray4 != null && Static2.anInt57 > local6.anInt775) {
									if (local6.anIntArray36 == null || Static2.anInt57 - local6.anInt775 > 32) {
										local459 = new Class4_Sub34();
										local459.aClass21_12 = local6;
										local459.anObjectArray34 = local6.anObjectArray4;
										Static318.aClass116_45.method3274(local459);
									} else {
										label609: for (local278 = local6.anInt775; local278 < Static2.anInt57; local278++) {
											local614 = Static269.anIntArray440[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray36.length; local374++) {
												if (local6.anIntArray36[local374] == local614) {
													local1419 = new Class4_Sub34();
													local1419.aClass21_12 = local6;
													local1419.anObjectArray34 = local6.anObjectArray4;
													Static318.aClass116_45.method3274(local1419);
													break label609;
												}
											}
										}
									}
									local6.anInt775 = Static2.anInt57;
								}
								if (local6.anObjectArray5 != null && Static278.anInt6682 > local6.anInt772) {
									if (local6.anIntArray39 == null || Static278.anInt6682 - local6.anInt772 > 32) {
										local459 = new Class4_Sub34();
										local459.aClass21_12 = local6;
										local459.anObjectArray34 = local6.anObjectArray5;
										Static318.aClass116_45.method3274(local459);
									} else {
										label585: for (local278 = local6.anInt772; local278 < Static278.anInt6682; local278++) {
											local614 = Static29.anIntArray30[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray39.length; local374++) {
												if (local6.anIntArray39[local374] == local614) {
													local1419 = new Class4_Sub34();
													local1419.aClass21_12 = local6;
													local1419.anObjectArray34 = local6.anObjectArray5;
													Static318.aClass116_45.method3274(local1419);
													break label585;
												}
											}
										}
									}
									local6.anInt772 = Static278.anInt6682;
								}
								if (local6.anObjectArray10 != null && Static305.anInt6787 > local6.anInt711) {
									if (local6.lb == null || Static305.anInt6787 - local6.anInt711 > 32) {
										local459 = new Class4_Sub34();
										local459.aClass21_12 = local6;
										local459.anObjectArray34 = local6.anObjectArray10;
										Static318.aClass116_45.method3274(local459);
									} else {
										label561: for (local278 = local6.anInt711; local278 < Static305.anInt6787; local278++) {
											local614 = Static204.anIntArray364[local278 & 0x1F];
											for (local374 = 0; local374 < local6.lb.length; local374++) {
												if (local6.lb[local374] == local614) {
													local1419 = new Class4_Sub34();
													local1419.aClass21_12 = local6;
													local1419.anObjectArray34 = local6.anObjectArray10;
													Static318.aClass116_45.method3274(local1419);
													break label561;
												}
											}
										}
									}
									local6.anInt711 = Static305.anInt6787;
								}
								if (Static144.anInt3263 > local6.anInt767 && local6.anObjectArray14 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray14;
									Static318.aClass116_45.method3274(local459);
								}
								if (Static254.anInt2746 > local6.anInt767 && local6.anObjectArray3 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray3;
									Static318.aClass116_45.method3274(local459);
								}
								if (Static1.anInt5230 > local6.anInt767 && local6.anObjectArray17 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray17;
									Static318.aClass116_45.method3274(local459);
								}
								if (Static229.anInt4617 > local6.anInt767 && local6.anObjectArray15 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray15;
									Static318.aClass116_45.method3274(local459);
								}
								if (Static248.anInt5059 > local6.anInt767 && local6.anObjectArray27 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray27;
									Static318.aClass116_45.method3274(local459);
								}
								local6.anInt767 = Static66.anInt1751;
								if (local6.anObjectArray13 != null) {
									for (local278 = 0; local278 < Static11.anInt241; local278++) {
										@Pc(1887) Class4_Sub34 local1887 = new Class4_Sub34();
										local1887.aClass21_12 = local6;
										local1887.anInt4878 = Static88.aClass157Array1[local278].method5193();
										local1887.anInt4877 = Static88.aClass157Array1[local278].method5190();
										local1887.anObjectArray34 = local6.anObjectArray13;
										Static318.aClass116_45.method3274(local1887);
									}
								}
								if (Static91.aBoolean436 && local6.anObjectArray12 != null) {
									local459 = new Class4_Sub34();
									local459.aClass21_12 = local6;
									local459.anObjectArray34 = local6.anObjectArray12;
									Static318.aClass116_45.method3274(local459);
								}
							}
							if (local6.anInt722 == 5 && local6.anInt727 != -1) {
								local6.method544().method2224(local6.anInt758, Static274.aClass47_9);
							}
							Static253.method4463(local6);
							if (local6.anInt722 == 0) {
								method882(arg0, local6.anInt728, local28, local30, local32, local34, local17 - local6.anInt790, local22 - local6.anInt736, arg8, arg9);
								if (local6.aClass21Array1 != null) {
									method882(local6.aClass21Array1, local6.anInt728, local28, local30, local32, local34, local17 - local6.anInt790, local22 - local6.anInt736, arg8, arg9);
								}
								@Pc(2007) Class4_Sub25 local2007 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local6.anInt728);
								if (local2007 != null) {
									if (local2007.anInt3697 == 0 && !Static272.aBoolean393 && local207 && !Static189.aBoolean306) {
										Static188.method3568();
									}
									Static55.method1172(local30, local32, arg9, local22, local28, arg8, local2007.anInt3695, local34, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static253.method4463(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!br;)Lclient!br;")
	public static Class21 method883(@OriginalArg(0) Class21 arg0) {
		@Pc(4) int local4 = method877(arg0).method1030();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static92.method534(arg0.anInt723);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I")
	public static int method884() {
		@Pc(10) Class198 local10 = Static88.aClass198_76;
		synchronized (Static88.aClass198_76) {
			return Static88.aClass198_76.method5203();
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method888() {
		for (@Pc(1) int local1 = 0; local1 < Static350.anInt6637; local1++) {
			@Pc(6) int[] local6 = Static293.anIntArrayArray119[local1];
			for (@Pc(8) int local8 = 0; local8 < Static105.anInt2647; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!br;)Z")
	public static boolean method889(@OriginalArg(0) Class21 arg0) {
		if (Static189.aBoolean306) {
			if (method877(arg0).anInt1386 != 0) {
				return false;
			}
			if (arg0.anInt722 == 0) {
				return false;
			}
		}
		return arg0.aBoolean79;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method890() {
		for (@Pc(1) int local1 = -1; local1 < Static289.anInt5643 + Static145.anInt3273; local1++) {
			@Pc(6) Class8_Sub1_Sub2 local6;
			if (local1 < 0) {
				local6 = Static158.aClass8_Sub1_Sub2_Sub1_1;
			} else if (local1 < Static289.anInt5643) {
				local6 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local1]];
			} else {
				local6 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local1 - Static289.anInt5643]];
			}
			if (local6.anInt4930 >= 0) {
				@Pc(32) int local32 = local6.method4349();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt6701 & 0x7F) != 0 || (local6.anInt6702 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt6701 & 0x7F) != 64 || (local6.anInt6702 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt6701 >> 7;
					local73 = local6.anInt6702 >> 7;
					if (local6.anInt4930 > Static293.anIntArrayArray119[local68][local73]) {
						Static293.anIntArrayArray119[local68][local73] = local6.anInt4930;
						Static101.anIntArrayArray185[local68][local73] = 1;
					} else if (local6.anInt4930 == Static293.anIntArrayArray119[local68][local73]) {
						local109 = Static101.anIntArrayArray185[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt6701 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt6702 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt6701 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt6702 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt4930 > Static293.anIntArrayArray119[local151][local154]) {
								Static293.anIntArrayArray119[local151][local154] = local6.anInt4930;
								Static101.anIntArrayArray185[local151][local154] = 1;
							} else if (local6.anInt4930 == Static293.anIntArrayArray119[local151][local154]) {
								local109 = Static101.anIntArrayArray185[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method892() {
		@Pc(14) boolean local14 = Static43.anInt1146 == 1 && Static289.anInt5643 > 200 || Static43.anInt1146 == 0 && Static289.anInt5643 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static289.anInt5643; local16++) {
			@Pc(23) Class8_Sub1_Sub2_Sub1 local23 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local16]];
			if (local23.method2087()) {
				local23.method5628();
				if (local23.aShort98 >= 0 && local23.aShort97 >= 0 && local23.aShort96 < Static350.anInt6637 && local23.aShort99 < Static105.anInt2647) {
					local23.aBoolean169 = local23.aBoolean371 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean373) {
						local62++;
					}
					if (local23.anInt4973 > Static199.anInt4137) {
						local62 += 2;
					}
					local62 += 5 - local23.method4349() << 2;
					if (Static317.anInt6159 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt4930 = local62 + 1;
				} else {
					local23.anInt4930 = -1;
				}
			} else {
				local23.anInt4930 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static145.anInt3273; local98++) {
			@Pc(105) Class8_Sub1_Sub2_Sub2 local105 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local98]];
			if (local105.method4357() && local105.aClass141_1.method3903()) {
				local105.method5628();
				if (local105.aShort98 >= 0 && local105.aShort97 >= 0 && local105.aShort96 < Static350.anInt6637 && local105.aShort99 < Static105.anInt2647) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean373) {
						local141++;
					}
					if (local105.anInt4973 > Static199.anInt4137) {
						local141 += 2;
					}
					local141 += 5 - local105.method4349() << 2;
					if (Static317.anInt6159 == 0) {
						if (local105.aClass141_1.aBoolean337) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static317.anInt6159 == 1) {
						if (local105.aClass141_1.aBoolean337) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass141_1.aBoolean344) {
						local141 += 512;
					} else if (!local105.aClass141_1.aBoolean339) {
						local141 += 256;
					}
					local105.anInt4930 = local141 + 1;
				} else {
					local105.anInt4930 = -1;
				}
			} else {
				local105.anInt4930 = -1;
			}
		}
		for (local62 = 0; local62 < Static116.aClass187Array1.length; local62++) {
			@Pc(207) Class187 local207 = Static116.aClass187Array1[local62];
			if (local207 != null) {
				if (local207.anInt5730 == 1) {
					@Pc(218) Class8_Sub1_Sub2_Sub2 local218 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local207.anInt5734];
					if (local218 != null && local218.anInt4930 >= 0) {
						local218.anInt4930 += 1024;
					}
				} else if (local207.anInt5730 == 10) {
					@Pc(239) Class8_Sub1_Sub2_Sub1 local239 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local207.anInt5734];
					if (local239 != null && local239.anInt4930 >= 0) {
						local239.anInt4930 += 1024;
					}
				}
			}
		}
		Static158.aClass8_Sub1_Sub2_Sub1_1.anInt4930 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method893() {
		Static81.anInt2141 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static145.anInt3273; local3++) {
			@Pc(10) Class8_Sub1_Sub2_Sub2 local10 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local3]];
			if (local10.aBoolean373 && local10.method4339() != -1) {
				@Pc(28) int local28 = (local10.method4349() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6701 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6702 - local28 >> 7;
				@Pc(48) Class8_Sub1_Sub2 local48 = Static81.method2008(Static12.anInt267, local35, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt4916;
					if (local48 instanceof Class8_Sub1_Sub2_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt4927 == 0 && local48.method4339() != -1) {
						Static136.anIntArray272[Static81.anInt2141] = local53;
						Static297.anIntArray459[Static81.anInt2141] = local53;
						Static81.anInt2141++;
						local48.anInt4927++;
					}
					Static136.anIntArray272[Static81.anInt2141] = local53;
					Static297.anIntArray459[Static81.anInt2141] = local10.anInt4916 + 2048;
					Static81.anInt2141++;
					local48.anInt4927++;
				}
			}
		}
		Static195.method3693(Static297.anIntArray459, Static136.anIntArray272, 0, Static81.anInt2141 - 1);
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method894() {
		@Pc(7) int local7 = Static83.aBoolean170 ? Static289.anInt5643 : Static289.anInt5643 + Static145.anInt3273;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class8_Sub1_Sub2 local14;
			if (local9 < 0) {
				local14 = Static158.aClass8_Sub1_Sub2_Sub1_1;
			} else if (local9 < Static289.anInt5643) {
				local14 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local9]];
			} else {
				local14 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local9 - Static289.anInt5643]];
			}
			if (local14.anInt4930 >= 0) {
				@Pc(40) int local40 = local14.method4349();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt6701 & 0x7F) == 0 && (local14.anInt6702 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt6701 & 0x7F) == 64 && (local14.anInt6702 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class8_Sub1_Sub2_Sub1 && local14.anInterface7_3 != null && Static199.anInt4137 >= local14.anInt4988 && Static199.anInt4137 < local14.anInt4986) {
					((Class8_Sub1_Sub2_Sub1) local14).aBoolean169 = false;
				}
				local14.anInt6697 = Static81.method2010(Static12.anInt267, local14.anInt6702, local14.anInt6701);
				Static301.method4952(local14, true);
			}
		}
	}
}
