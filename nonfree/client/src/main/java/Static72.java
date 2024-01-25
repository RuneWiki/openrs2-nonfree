import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt1778 = 64;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_15 = new Class201(8, 0, 4, 1);

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1558(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static60.anInt1505;
		@Pc(3) int[] local3 = Static346.anIntArray413;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static480.anInt8097; local5++) {
			@Pc(15) Class20_Sub2_Sub4_Sub1 local15;
			if (local5 < local1) {
				local15 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local3[local5]];
			} else {
				local15 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local5 - local1])).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			}
			if (local15.aByte116 == arg0 && local15.anInt6424 >= 0) {
				@Pc(39) int local39 = local15.method5349();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt8796 & 0x1FF) != 0 || (local15.anInt8795 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt8796 & 0x1FF) != 256 || (local15.anInt8795 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt8796 >> 9;
					local80 = local15.anInt8795 >> 9;
					if (local15.anInt6424 > Static582.anIntArrayArray61[local75][local80]) {
						Static582.anIntArrayArray61[local75][local80] = local15.anInt6424;
						Static70.anIntArrayArray9[local75][local80] = 1;
					} else if (local15.anInt6424 == Static582.anIntArrayArray61[local75][local80]) {
						local116 = Static70.anIntArrayArray9[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt8796 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt8795 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt8796 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt8795 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6424 > Static582.anIntArrayArray61[local158][local161]) {
								Static582.anIntArrayArray61[local158][local161] = local15.anInt6424;
								Static70.anIntArrayArray9[local158][local161] = 1;
							} else if (local15.anInt6424 == Static582.anIntArrayArray61[local158][local161]) {
								local116 = Static70.anIntArrayArray9[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1559() {
		@Pc(1) int local1 = Static60.anInt1505;
		@Pc(3) int[] local3 = Static346.anIntArray413;
		@Pc(20) boolean local20 = Static479.aClass1_Sub7_Sub1_1.anInt3110 == 1 && local1 > 200 || Static479.aClass1_Sub7_Sub1_1.anInt3110 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class20_Sub2_Sub4_Sub1_Sub1 local29 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local3[local22]];
			if (local29.method4143()) {
				local29.method7202();
				if (local29.aShort100 >= 0 && local29.aShort97 >= 0 && local29.aShort98 < Static500.anInt6888 && local29.aShort99 < Static573.anInt9325) {
					local29.aBoolean379 = local29.aBoolean457 ? local20 : false;
					if (local29 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2) {
						local29.anInt6424 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean458) {
							local75++;
						}
						if (local29.anInt6425 > Static81.anInt1910) {
							local75 += 2;
						}
						local75 += 5 - local29.method5349() << 2;
						if (local29.aBoolean378) {
							local75 += 512;
						} else {
							if (Static293.anInt5405 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6424 = local75 + 1;
					}
				} else {
					local29.anInt6424 = -1;
				}
			} else {
				local29.anInt6424 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static480.anInt8097; local116++) {
			@Pc(127) Class20_Sub2_Sub4_Sub1_Sub2 local127 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local116])).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			if (local127.method5362() && local127.aClass162_1.method3800(Static121.aClass148_1)) {
				local127.method7202();
				if (local127.aShort100 >= 0 && local127.aShort97 >= 0 && local127.aShort98 < Static500.anInt6888 && local127.aShort99 < Static573.anInt9325) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean458) {
						local164++;
					}
					if (local127.anInt6425 > Static81.anInt1910) {
						local164 += 2;
					}
					local164 += 5 - local127.method5349() << 2;
					if (Static293.anInt5405 == 0) {
						if (local127.aClass162_1.aBoolean353) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static293.anInt5405 == 1) {
						if (local127.aClass162_1.aBoolean353) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass162_1.aBoolean352) {
						local164 += 1024;
					} else if (!local127.aClass162_1.aBoolean355) {
						local164 += 256;
					}
					local127.anInt6424 = local164 + 1;
				} else {
					local127.anInt6424 = -1;
				}
			} else {
				local127.anInt6424 = -1;
			}
		}
		for (local75 = 0; local75 < Static276.aClass221Array1.length; local75++) {
			@Pc(230) Class221 local230 = Static276.aClass221Array1[local75];
			if (local230 != null) {
				if (local230.anInt6039 == 1) {
					@Pc(244) Class1_Sub39 local244 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local230.anInt6044);
					if (local244 != null) {
						@Pc(249) Class20_Sub2_Sub4_Sub1_Sub2 local249 = local244.aClass20_Sub2_Sub4_Sub1_Sub2_2;
						if (local249.anInt6424 >= 0) {
							local249.anInt6424 += 2048;
						}
					}
				} else if (local230.anInt6039 == 10) {
					@Pc(268) Class20_Sub2_Sub4_Sub1_Sub1 local268 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local230.anInt6044];
					if (local268 != null && local268 != Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 && local268.anInt6424 >= 0) {
						local268.anInt6424 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1560() {
		@Pc(1) int local1 = Static60.anInt1505;
		@Pc(3) int[] local3 = Static346.anIntArray413;
		@Pc(11) int local11 = Static56.aBoolean106 ? local1 : local1 + Static480.anInt8097;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub2_Sub4_Sub1 local23;
			if (local13 < local1) {
				local23 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local3[local13]];
			} else {
				local23 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local13 - local1])).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			}
			if (local23.anInt6424 >= 0) {
				@Pc(43) int local43 = local23.method5349();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt8796 & 0x1FF) == 0 && (local23.anInt8795 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt8796 & 0x1FF) == 256 && (local23.anInt8795 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt8790 = Static122.method2103(local23.aByte116, local23.anInt8796, local23.anInt8795);
				Static567.method7645(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!wv;)Z")
	public static boolean method1562(@OriginalArg(0) Class365 arg0) {
		if (Static484.aBoolean581) {
			if (method1565(arg0).anInt5698 != 0) {
				return false;
			}
			if (arg0.anInt9595 == 0) {
				return false;
			}
		}
		return arg0.aBoolean711;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1563() {
		Static565.anInt9242 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static480.anInt8097; local3++) {
			@Pc(14) Class20_Sub2_Sub4_Sub1_Sub2 local14 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local3])).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			if (local14.aBoolean458 && local14.method5350() != -1) {
				@Pc(32) int local32 = (local14.method5349() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt8796 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt8795 - local32 >> 9;
				@Pc(53) Class20_Sub2_Sub4_Sub1 local53 = Static301.method4708(local39, local14.aByte116, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6407;
					if (local53 instanceof Class20_Sub2_Sub4_Sub1_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt6433 == 0 && local53.method5350() != -1) {
						Static63.anIntArray83[Static565.anInt9242] = local58;
						Static453.anIntArray515[Static565.anInt9242] = local58;
						Static565.anInt9242++;
						local53.anInt6433++;
					}
					Static63.anIntArray83[Static565.anInt9242] = local58;
					Static453.anIntArray515[Static565.anInt9242] = local14.anInt6407 + 2048;
					Static565.anInt9242++;
					local53.anInt6433++;
				}
			}
		}
		Static469.method6619(Static63.anIntArray83, 0, Static565.anInt9242 - 1, Static453.anIntArray515);
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1564(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static60.anInt1505;
		@Pc(3) int[] local3 = Static346.anIntArray413;
		@Pc(11) int local11 = Static56.aBoolean106 ? local1 : local1 + Static480.anInt8097;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class20_Sub2_Sub4_Sub1 local23;
			if (local13 < local1) {
				local23 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local3[local13]];
			} else {
				local23 = ((Class1_Sub39) Static131.aClass356_32.method7796((long) Static542.anIntArray599[local13 - local1])).aClass20_Sub2_Sub4_Sub1_Sub2_2;
			}
			if (local23.aByte116 == arg0) {
				local23.anInt6433 = 0;
				if (local23.anInt6424 < 0) {
					local23.aBoolean458 = false;
				} else {
					@Pc(54) int local54 = local23.method5349();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt8796 & 0x1FF) != 0 || (local23.anInt8795 & 0x1FF) != 0) {
							local23.aBoolean458 = false;
							continue;
						}
					} else if ((local23.anInt8796 & 0x1FF) != 256 || (local23.anInt8795 & 0x1FF) != 256) {
						local23.aBoolean458 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt8796 >> 9;
						local101 = local23.anInt8795 >> 9;
						if (local23.anInt6424 != Static582.anIntArrayArray61[local96][local101]) {
							local23.aBoolean458 = true;
							continue;
						}
						if (Static70.anIntArrayArray9[local96][local101] > 1) {
							local126 = Static70.anIntArrayArray9[local96][local101]--;
							local23.aBoolean458 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt8796 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt8795 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt8796 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt8795 + local96 >> 9;
						if (!Static347.method7779(local169, local101, local155, local162, local23.anInt6424)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6424 == Static582.anIntArrayArray61[local180][local183]) {
										local126 = Static70.anIntArrayArray9[local180][local183]--;
									}
								}
							}
							local23.aBoolean458 = true;
							continue;
						}
					}
					local23.aBoolean458 = false;
					local23.anInt8790 = Static122.method2103(local23.aByte116, local23.anInt8796, local23.anInt8795);
					Static567.method7645(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!wv;)Lclient!mca;")
	public static Class1_Sub28 method1565(@OriginalArg(0) Class365 arg0) {
		@Pc(13) Class1_Sub28 local13 = (Class1_Sub28) Static410.aClass356_31.method7796(((long) arg0.anInt9646 << 32) + (long) arg0.anInt9603);
		return local13 == null ? arg0.aClass1_Sub28_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!wv;IIIIIIIII)V")
	public static void method1567(@OriginalArg(0) Class365[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class365 local6 = arg0[local1];
			if (local6 != null && local6.anInt9590 == arg1) {
				@Pc(17) int local17 = local6.anInt9581 + arg6;
				@Pc(22) int local22 = local6.anInt9625 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt9595 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt9578;
					@Pc(45) int local45 = local22 + local6.anInt9638;
					if (local6.anInt9595 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9595 == 0 || local6.aBoolean706 || method1565(local6).anInt5698 != 0 || local6 == Static394.aClass365_11 || local6.anInt9607 == Static114.anInt2295 || local6.anInt9607 == Static74.anInt1833) {
					if (!method1562(local6)) {
						if (local6 == Static363.aClass365_14 && Static64.method1426(Static363.aClass365_14) != null) {
							Static484.aBoolean580 = true;
							Static452.anInt7758 = local17;
							Static129.anInt2624 = local22;
						}
						if (local6.aBoolean704 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean700 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(156) Class1_Sub2 local156 = (Class1_Sub2) Static215.aClass361_44.method7854(); local156 != null; local156 = (Class1_Sub2) Static215.aClass361_44.method7853()) {
									if (local156.aBoolean7) {
										local156.method7878();
										local156.aClass365_1.aBoolean712 = false;
									}
								}
								if (Static428.anInt4967 == 0) {
									Static363.aClass365_14 = null;
									Static394.aClass365_11 = null;
								}
								Static347.anInt9410 = 0;
								Static55.aBoolean105 = false;
								Static93.aBoolean163 = false;
								if (!Static294.aBoolean407) {
									Static593.method7895();
								}
							}
							@Pc(212) boolean local212;
							if (Static287.aClass256_8.method7558() >= local28 && Static287.aClass256_8.method7561() >= local30 && Static287.aClass256_8.method7558() < local32 && Static287.aClass256_8.method7561() < local34) {
								local212 = true;
							} else {
								local212 = false;
							}
							if (!Static22.aBoolean43 && local212) {
								if (local6.anInt9579 >= 0) {
									Static325.anInt9473 = local6.anInt9579;
								} else if (local6.aBoolean700) {
									Static325.anInt9473 = -1;
								}
							}
							if (!Static294.aBoolean407 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static52.method1232(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(256) boolean local256 = false;
							if (Static287.aClass256_8.method7562() && local212) {
								local256 = true;
							}
							@Pc(266) boolean local266 = false;
							@Pc(271) Class1_Sub13 local271 = (Class1_Sub13) Static270.aClass361_55.method7854();
							if (local271 != null && local271.method2533() == 0 && local271.method2536() >= local28 && local271.method2537() >= local30 && local271.method2536() < local32 && local271.method2537() < local34) {
								local266 = true;
							}
							@Pc(307) int local307;
							@Pc(441) int local441;
							if (local6.aByteArray104 != null && !Static112.method1973()) {
								for (local307 = 0; local307 < local6.aByteArray104.length; local307++) {
									if (Static595.aClass31_1.method985(local6.aByteArray104[local307])) {
										if (local6.anIntArray640 == null || Static81.anInt1910 >= local6.anIntArray640[local307]) {
											@Pc(339) byte local339 = local6.aByteArray105[local307];
											if (local339 == 0 || ((local339 & 0x8) == 0 || !Static595.aClass31_1.method985(86) && !Static595.aClass31_1.method985(82) && !Static595.aClass31_1.method985(81)) && ((local339 & 0x2) == 0 || Static595.aClass31_1.method985(86)) && ((local339 & 0x1) == 0 || Static595.aClass31_1.method985(82)) && ((local339 & 0x4) == 0 || Static595.aClass31_1.method985(81))) {
												if (local307 < 10) {
													Static211.method3546(local6.anInt9646, -1, "", local307 + 1);
												} else if (local307 == 10) {
													Static130.method6495();
													@Pc(410) Class1_Sub28 local410 = method1565(local6);
													Static478.method6711(local410.method4818(), local6, local410.anInt5702);
													Static559.aString92 = Static161.method2491(local6);
													if (Static559.aString92 == null) {
														Static559.aString92 = "Null";
													}
													Static264.aString51 = local6.aString98 + "<col=ffffff>";
												}
												local441 = local6.lb[local307];
												if (local6.anIntArray640 == null) {
													local6.anIntArray640 = new int[local6.aByteArray104.length];
												}
												if (local441 == 0) {
													local6.anIntArray640[local307] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray640[local307] = Static81.anInt1910 + local441;
												}
											}
										}
									} else if (local6.anIntArray640 != null) {
										local6.anIntArray640[local307] = 0;
									}
								}
							}
							if (local266) {
								Static58.method1365(local271.method2537() - local22, local6, local271.method2536() - local17);
							}
							if (Static363.aClass365_14 != null && Static363.aClass365_14 != local6 && local212 && method1565(local6).method4815()) {
								Static310.aClass365_13 = local6;
							}
							if (local6 == Static394.aClass365_11) {
								Static204.aBoolean333 = true;
								Static424.anInt7197 = local17;
								Static199.anInt4027 = local22;
							}
							if (local6.aBoolean706 || local6.anInt9607 != 0) {
								@Pc(526) Class1_Sub2 local526;
								if (local212 && Static184.anInt5415 != 0 && local6.anObjectArray13 != null) {
									local526 = new Class1_Sub2();
									local526.aBoolean7 = true;
									local526.aClass365_1 = local6;
									local526.anInt156 = Static184.anInt5415;
									local526.anObjectArray1 = local6.anObjectArray13;
									Static215.aClass361_44.method7855(local526);
								}
								if (Static363.aClass365_14 != null || Static294.aBoolean407 || local6.anInt9607 != Static275.anInt5082 && Static347.anInt9410 > 0) {
									local266 = false;
									local256 = false;
									local212 = false;
								}
								@Pc(681) int local681;
								if (local6.anInt9607 != 0) {
									if (local6.anInt9607 == Static440.anInt7395 || local6.anInt9607 == Static314.anInt5663) {
										Static399.aClass365_12 = local6;
										if (Static498.aClass224_1 != null) {
											Static498.aClass224_1.method5124(local6.anInt9638, Static136.aClass12_8);
										}
										if (local6.anInt9607 == Static440.anInt7395) {
											if (!Static294.aBoolean407 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static248.method3990(arg8, Static136.aClass12_8, arg9);
												for (@Pc(609) Class20_Sub6 local609 = (Class20_Sub6) Static334.aClass349_9.method7653(); local609 != null; local609 = (Class20_Sub6) Static334.aClass349_9.method7660()) {
													if (arg8 >= local609.anInt4673 && arg8 < local609.anInt4678 && arg9 >= local609.anInt4674 && arg9 < local609.anInt4675) {
														Static593.method7895();
														Static433.method6290(local609.aClass20_Sub2_Sub4_Sub1_1);
													}
												}
											}
											Static356.method5847(local22, local6, local17);
											continue;
										}
									}
									@Pc(720) int local720;
									if (local6.anInt9607 == Static114.anInt2295) {
										if (local6.method7902(Static136.aClass12_8) == null || Static389.anInt6778 != 0 && Static389.anInt6778 != 3 || Static294.aBoolean407 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local307 = arg8 - local17;
										local681 = arg9 - local22;
										local441 = local6.anIntArray635[local681];
										if (local307 < local441 || local307 > local441 + local6.anIntArray639[local681]) {
											continue;
										}
										local307 -= local6.anInt9578 / 2;
										local681 -= local6.anInt9638 / 2;
										if (Static585.anInt9461 == 4) {
											local720 = (int) Static143.aFloat61 & 0x3FFF;
										} else {
											local720 = (int) Static143.aFloat61 + Static368.anInt6520 & 0x3FFF;
										}
										@Pc(732) int local732 = Class151.anIntArray244[local720];
										@Pc(736) int local736 = Class151.anIntArray245[local720];
										if (Static585.anInt9461 != 4) {
											local732 = local732 * (Static536.anInt8845 + 256) >> 8;
											local736 = local736 * (Static536.anInt8845 + 256) >> 8;
										}
										@Pc(765) int local765 = local681 * local732 + local307 * local736 >> 14;
										@Pc(775) int local775 = local681 * local736 - local307 * local732 >> 14;
										@Pc(786) int local786;
										@Pc(794) int local794;
										if (Static585.anInt9461 == 4) {
											local786 = (Static116.anInt2337 >> 9) + (local765 >> 2);
											local794 = (Static260.anInt4768 >> 9) - (local775 >> 2);
										} else {
											@Pc(803) int local803 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method5349() - 1) * 256;
											local786 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 - local803 >> 9) + (local765 >> 2);
											local794 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 - local803 >> 9) - (local775 >> 2);
										}
										if (Static22.aBoolean43 && (Static434.anInt7646 & 0x40) != 0) {
											@Pc(836) Class365 local836 = Static583.method7803(Static365.anInt6484, Static39.anInt1026);
											if (local836 == null) {
												Static130.method6495();
											} else {
												Static374.method5440(true, local6.anInt9573, 20, Static559.aString92, false, 1L, Static3.anInt71, local794, local786, " ->");
											}
											continue;
										}
										if (Static275.aClass230_2 == Static353.aClass230_3) {
											Static374.method5440(true, -1, 25, Static103.aClass77_29.method1864(Static562.anInt9127), false, 1L, -1, local794, local786, "");
										}
										Static374.method5440(true, -1, 12, Static415.aString77, false, 1L, Static17.anInt562, local794, local786, "");
										continue;
									}
									if (local6.anInt9607 == Static275.anInt5082) {
										Static559.aClass365_16 = local6;
										if (local212) {
											Static55.aBoolean105 = true;
										}
										if (local266) {
											local307 = (int) ((double) (local271.method2536() - local17 - local6.anInt9578 / 2) * 2.0D / (double) Static313.aFloat105);
											local681 = (int) -((double) (local271.method2537() - local22 - local6.anInt9638 / 2) * 2.0D / (double) Static313.aFloat105);
											local441 = Static222.anInt1235 + local307 + Static313.anInt4085;
											local720 = Static536.anInt8850 + local681 + Static313.anInt4096;
											@Pc(950) Class1_Sub3_Sub17 local950 = Static361.method5266();
											if (local950 == null) {
												continue;
											}
											@Pc(955) int[] local955 = new int[3];
											local950.method6735(local441, local955, local720);
											if (local955 != null) {
												if (Static595.aClass31_1.method985(82) && Static276.anInt5092 > 0) {
													Static120.method2034(local955[0], local955[1], local955[2]);
													continue;
												}
												Static93.aBoolean163 = true;
												Static426.anInt7215 = local955[0];
												Static376.anInt6634 = local955[1];
												Static530.anInt8762 = local955[2];
											}
											Static347.anInt9410 = 1;
											Static501.aBoolean618 = false;
											Static318.anInt5733 = Static287.aClass256_8.method7558();
											Static212.anInt4159 = Static287.aClass256_8.method7561();
											continue;
										}
										if (local256 && Static347.anInt9410 > 0) {
											if (Static347.anInt9410 == 1 && (Static318.anInt5733 != Static287.aClass256_8.method7558() || Static212.anInt4159 != Static287.aClass256_8.method7561())) {
												Static126.anInt6656 = Static222.anInt1235;
												Static327.anInt5870 = Static536.anInt8850;
												Static347.anInt9410 = 2;
											}
											if (Static347.anInt9410 == 2) {
												Static501.aBoolean618 = true;
												Static67.method1438(Static126.anInt6656 + (int) ((double) (Static318.anInt5733 - Static287.aClass256_8.method7558()) * 2.0D / (double) Static313.aFloat106));
												Static433.method6289(Static327.anInt5870 - (int) ((double) (Static212.anInt4159 - Static287.aClass256_8.method7561()) * 2.0D / (double) Static313.aFloat106));
											}
											continue;
										}
										if (Static347.anInt9410 > 0 && !Static501.aBoolean618) {
											if ((Static54.anInt1401 == 1 || Static9.method136()) && Static135.anInt2684 > 2) {
												Static328.method4964(Static318.anInt5733, Static212.anInt4159);
											} else if (Static388.method5570()) {
												Static328.method4964(Static318.anInt5733, Static212.anInt4159);
											}
										}
										Static347.anInt9410 = 0;
										continue;
									}
									if (local6.anInt9607 == Static530.anInt8766) {
										if (local256) {
											Static416.method5831(Static287.aClass256_8.method7561() - local22, local6.anInt9638, Static287.aClass256_8.method7558() - local17, local6.anInt9578);
										}
										continue;
									}
									if (local6.anInt9607 == Static74.anInt1833) {
										Static456.method6393(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean701 && local266) {
									local6.aBoolean701 = true;
									if (local6.anObjectArray25 != null) {
										local526 = new Class1_Sub2();
										local526.aBoolean7 = true;
										local526.aClass365_1 = local6;
										local526.anInt157 = local271.method2536() - local17;
										local526.anInt156 = local271.method2537() - local22;
										local526.anObjectArray1 = local6.anObjectArray25;
										Static215.aClass361_44.method7855(local526);
									}
								}
								if (local6.aBoolean701 && local256 && local6.anObjectArray28 != null) {
									local526 = new Class1_Sub2();
									local526.aBoolean7 = true;
									local526.aClass365_1 = local6;
									local526.anInt157 = Static287.aClass256_8.method7558() - local17;
									local526.anInt156 = Static287.aClass256_8.method7561() - local22;
									local526.anObjectArray1 = local6.anObjectArray28;
									Static215.aClass361_44.method7855(local526);
								}
								if (local6.aBoolean701 && !local256) {
									local6.aBoolean701 = false;
									if (local6.anObjectArray5 != null) {
										local526 = new Class1_Sub2();
										local526.aBoolean7 = true;
										local526.aClass365_1 = local6;
										local526.anInt157 = Static287.aClass256_8.method7558() - local17;
										local526.anInt156 = Static287.aClass256_8.method7561() - local22;
										local526.anObjectArray1 = local6.anObjectArray5;
										Static292.aClass361_59.method7855(local526);
									}
								}
								if (local256 && local6.anObjectArray21 != null) {
									local526 = new Class1_Sub2();
									local526.aBoolean7 = true;
									local526.aClass365_1 = local6;
									local526.anInt157 = Static287.aClass256_8.method7558() - local17;
									local526.anInt156 = Static287.aClass256_8.method7561() - local22;
									local526.anObjectArray1 = local6.anObjectArray21;
									Static215.aClass361_44.method7855(local526);
								}
								if (!local6.aBoolean712 && local212) {
									local6.aBoolean712 = true;
									if (local6.anObjectArray7 != null) {
										local526 = new Class1_Sub2();
										local526.aBoolean7 = true;
										local526.aClass365_1 = local6;
										local526.anInt157 = Static287.aClass256_8.method7558() - local17;
										local526.anInt156 = Static287.aClass256_8.method7561() - local22;
										local526.anObjectArray1 = local6.anObjectArray7;
										Static215.aClass361_44.method7855(local526);
									}
								}
								if (local6.aBoolean712 && local212 && local6.anObjectArray31 != null) {
									local526 = new Class1_Sub2();
									local526.aBoolean7 = true;
									local526.aClass365_1 = local6;
									local526.anInt157 = Static287.aClass256_8.method7558() - local17;
									local526.anInt156 = Static287.aClass256_8.method7561() - local22;
									local526.anObjectArray1 = local6.anObjectArray31;
									Static215.aClass361_44.method7855(local526);
								}
								if (local6.aBoolean712 && !local212) {
									local6.aBoolean712 = false;
									if (local6.anObjectArray20 != null) {
										local526 = new Class1_Sub2();
										local526.aBoolean7 = true;
										local526.aClass365_1 = local6;
										local526.anInt157 = Static287.aClass256_8.method7558() - local17;
										local526.anInt156 = Static287.aClass256_8.method7561() - local22;
										local526.anObjectArray1 = local6.anObjectArray20;
										Static292.aClass361_59.method7855(local526);
									}
								}
								if (local6.anObjectArray9 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray9;
									Static92.aClass361_28.method7855(local526);
								}
								@Pc(1494) Class1_Sub2 local1494;
								if (local6.anObjectArray10 != null && Static117.anInt2342 > local6.anInt9656) {
									if (local6.anIntArray636 == null || Static117.anInt2342 - local6.anInt9656 > 32) {
										local526 = new Class1_Sub2();
										local526.aClass365_1 = local6;
										local526.anObjectArray1 = local6.anObjectArray10;
										Static215.aClass361_44.method7855(local526);
									} else {
										label683: for (local307 = local6.anInt9656; local307 < Static117.anInt2342; local307++) {
											local681 = Static170.anIntArray182[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray636.length; local441++) {
												if (local6.anIntArray636[local441] == local681) {
													local1494 = new Class1_Sub2();
													local1494.aClass365_1 = local6;
													local1494.anObjectArray1 = local6.anObjectArray10;
													Static215.aClass361_44.method7855(local1494);
													break label683;
												}
											}
										}
									}
									local6.anInt9656 = Static117.anInt2342;
								}
								if (local6.anObjectArray23 != null && Static151.anInt2851 > local6.anInt9626) {
									if (local6.anIntArray641 == null || Static151.anInt2851 - local6.anInt9626 > 32) {
										local526 = new Class1_Sub2();
										local526.aClass365_1 = local6;
										local526.anObjectArray1 = local6.anObjectArray23;
										Static215.aClass361_44.method7855(local526);
									} else {
										label659: for (local307 = local6.anInt9626; local307 < Static151.anInt2851; local307++) {
											local681 = Static505.anIntArray579[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray641.length; local441++) {
												if (local6.anIntArray641[local441] == local681) {
													local1494 = new Class1_Sub2();
													local1494.aClass365_1 = local6;
													local1494.anObjectArray1 = local6.anObjectArray23;
													Static215.aClass361_44.method7855(local1494);
													break label659;
												}
											}
										}
									}
									local6.anInt9626 = Static151.anInt2851;
								}
								if (local6.anObjectArray12 != null && Static34.anInt924 > local6.anInt9650) {
									if (local6.anIntArray634 == null || Static34.anInt924 - local6.anInt9650 > 32) {
										local526 = new Class1_Sub2();
										local526.aClass365_1 = local6;
										local526.anObjectArray1 = local6.anObjectArray12;
										Static215.aClass361_44.method7855(local526);
									} else {
										label635: for (local307 = local6.anInt9650; local307 < Static34.anInt924; local307++) {
											local681 = Static118.anIntArray144[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray634.length; local441++) {
												if (local6.anIntArray634[local441] == local681) {
													local1494 = new Class1_Sub2();
													local1494.aClass365_1 = local6;
													local1494.anObjectArray1 = local6.anObjectArray12;
													Static215.aClass361_44.method7855(local1494);
													break label635;
												}
											}
										}
									}
									local6.anInt9650 = Static34.anInt924;
								}
								if (local6.anObjectArray32 != null && Static415.anInt7073 > local6.anInt9659) {
									if (local6.anIntArray638 == null || Static415.anInt7073 - local6.anInt9659 > 32) {
										local526 = new Class1_Sub2();
										local526.aClass365_1 = local6;
										local526.anObjectArray1 = local6.anObjectArray32;
										Static215.aClass361_44.method7855(local526);
									} else {
										label611: for (local307 = local6.anInt9659; local307 < Static415.anInt7073; local307++) {
											local681 = Static443.anIntArray514[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray638.length; local441++) {
												if (local6.anIntArray638[local441] == local681) {
													local1494 = new Class1_Sub2();
													local1494.aClass365_1 = local6;
													local1494.anObjectArray1 = local6.anObjectArray32;
													Static215.aClass361_44.method7855(local1494);
													break label611;
												}
											}
										}
									}
									local6.anInt9659 = Static415.anInt7073;
								}
								if (local6.anObjectArray22 != null && Static221.anInt4275 > local6.anInt9640) {
									if (local6.anIntArray642 == null || Static221.anInt4275 - local6.anInt9640 > 32) {
										local526 = new Class1_Sub2();
										local526.aClass365_1 = local6;
										local526.anObjectArray1 = local6.anObjectArray22;
										Static215.aClass361_44.method7855(local526);
									} else {
										label587: for (local307 = local6.anInt9640; local307 < Static221.anInt4275; local307++) {
											local681 = Static500.anIntArray473[local307 & 0x1F];
											for (local441 = 0; local441 < local6.anIntArray642.length; local441++) {
												if (local6.anIntArray642[local441] == local681) {
													local1494 = new Class1_Sub2();
													local1494.aClass365_1 = local6;
													local1494.anObjectArray1 = local6.anObjectArray22;
													Static215.aClass361_44.method7855(local1494);
													break label587;
												}
											}
										}
									}
									local6.anInt9640 = Static221.anInt4275;
								}
								if (Static181.anInt3251 > local6.anInt9570 && local6.anObjectArray29 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray29;
									Static215.aClass361_44.method7855(local526);
								}
								if (Static18.anInt603 > local6.anInt9570 && local6.anObjectArray24 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray24;
									Static215.aClass361_44.method7855(local526);
								}
								if (Static209.anInt4135 > local6.anInt9570 && local6.anObjectArray14 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray14;
									Static215.aClass361_44.method7855(local526);
								}
								if (Static372.anInt6585 > local6.anInt9570 && local6.anObjectArray30 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray30;
									Static215.aClass361_44.method7855(local526);
								}
								if (Static384.anInt7194 > local6.anInt9570 && local6.anObjectArray26 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray26;
									Static215.aClass361_44.method7855(local526);
								}
								local6.anInt9570 = Static274.anInt5077;
								if (local6.anObjectArray16 != null) {
									for (local307 = 0; local307 < Static207.anInt7989; local307++) {
										@Pc(1962) Class1_Sub2 local1962 = new Class1_Sub2();
										local1962.aClass365_1 = local6;
										local1962.anInt158 = Static304.anInterface21Array2[local307].method6535();
										local1962.anInt149 = Static304.anInterface21Array2[local307].method6536();
										local1962.anObjectArray1 = local6.anObjectArray16;
										Static215.aClass361_44.method7855(local1962);
									}
								}
								if (Static414.aBoolean508 && local6.anObjectArray6 != null) {
									local526 = new Class1_Sub2();
									local526.aClass365_1 = local6;
									local526.anObjectArray1 = local6.anObjectArray6;
									Static215.aClass361_44.method7855(local526);
								}
							}
							if (local6.anInt9595 == 5 && local6.anInt9647 != -1) {
								local6.method7912(Static395.aClass263_1, Static117.aClass345_1).method5124(local6.anInt9638, Static136.aClass12_8);
							}
							Static534.method7301(local6);
							if (local6.anInt9595 == 0) {
								method1567(arg0, local6.anInt9646, local28, local30, local32, local34, local17 - local6.anInt9571, local22 - local6.anInt9617, arg8, arg9);
								if (local6.aClass365Array2 != null) {
									method1567(local6.aClass365Array2, local6.anInt9646, local28, local30, local32, local34, local17 - local6.anInt9571, local22 - local6.anInt9617, arg8, arg9);
								}
								@Pc(2084) Class1_Sub16 local2084 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local6.anInt9646);
								if (local2084 != null) {
									if (Static275.aClass230_2 == Static433.aClass230_4 && local2084.anInt2683 == 0 && !Static294.aBoolean407 && local212 && !Static484.aBoolean581) {
										Static593.method7895();
									}
									Static332.method4981(local22, local30, local32, arg9, local2084.anInt2681, local28, arg8, local17, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static534.method7301(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!wv;)Lclient!wv;")
	public static Class365 method1568(@OriginalArg(0) Class365 arg0) {
		@Pc(4) int local4 = method1565(arg0).method4813();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static374.method5437(arg0.anInt9590);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1570() {
		for (@Pc(1) int local1 = 0; local1 < Static500.anInt6888; local1++) {
			@Pc(6) int[] local6 = Static582.anIntArrayArray61[local1];
			for (@Pc(8) int local8 = 0; local8 < Static573.anInt9325; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
