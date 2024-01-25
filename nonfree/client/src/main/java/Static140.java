import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
	public static volatile int anInt2707 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)I")
	public static int method2314(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static203.aShort68 + local7 * (Static11.aShort89 - Static203.aShort68) / 100;
		@Pc(35) int local35 = arg1 * local29 >> 8;
		@Pc(42) int local42 = 16384 - arg0 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg3 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local35;
		if (local42 != 0) {
			local53 = Class1_Sub5_Sub15.anIntArray335[local42] * -local35 >> 15;
			local55 = Class1_Sub5_Sub15.anIntArray333[local42] * local35 >> 15;
		}
		if (local49 != 0) {
			local51 = Class1_Sub5_Sub15.anIntArray335[local49] * local55 >> 15;
			local55 = local55 * Class1_Sub5_Sub15.anIntArray333[local49] >> 15;
		}
		Static296.anInt5982 = arg3;
		Static338.anInt6530 = arg0;
		Static177.anInt3734 = arg5 - local55;
		Static117.anInt2244 = arg4 - local53;
		Static4.anInt41 = arg6 - local51;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZZZLclient!mj;)V")
	public static void method2316(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub26 arg2) {
		@Pc(16) int local16 = arg2.anInt3825;
		@Pc(20) int local20 = (int) arg2.aLong214;
		arg2.method5796();
		if (arg1) {
			Static24.method401(local16);
		}
		Static205.method3696(local16);
		@Pc(35) Class163 local35 = Static248.method22(local20);
		if (local35 != null) {
			Static340.method5639(local35);
		}
		Static269.method4852();
		if (!arg0 && Static129.anInt2569 != -1) {
			Static125.method2001(1, Static129.anInt2569);
		}
		@Pc(56) Class103 local56 = new Class103(Static298.aClass207_35);
		for (@Pc(61) Class1_Sub26 local61 = (Class1_Sub26) local56.method2002(); local61 != null; local61 = (Class1_Sub26) local56.method2003()) {
			if (!local61.method5797()) {
				local61 = (Class1_Sub26) local56.method2002();
				if (local61 == null) {
					return;
				}
			}
			if (local61.anInt3826 == 3) {
				@Pc(85) int local85 = (int) local61.aLong214;
				if (local85 >>> 16 == local16) {
					method2316(arg0, true, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method2317() {
		if (Static67.anInt1458 > 1) {
			Static67.anInt1458--;
			Static342.anInt2475 = Static244.anInt6207;
		}
		if (Static251.anInt5188 > 0) {
			Static251.anInt5188--;
		}
		if (Static355.aBoolean556) {
			Static355.aBoolean556 = false;
			Static287.method5029();
			return;
		}
		if (!Static308.aBoolean499) {
			Static10.method166();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static174.method5048(); local36++) {
		}
		if (Static261.anInt5376 != 30) {
			return;
		}
		Static338.method5608(Static305.aClass1_Sub21_Sub2_3);
		@Pc(60) Object local60 = Static287.aClass48_1.anObject1;
		@Pc(90) int local90;
		@Pc(92) int local92;
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(130) int local130;
		@Pc(186) int local186;
		@Pc(193) int local193;
		synchronized (Static287.aClass48_1.anObject1) {
			if (!Static93.aBoolean126) {
				Static287.aClass48_1.anInt1354 = 0;
			} else if (Static171.anInt3612 != 0 || Static287.aClass48_1.anInt1354 >= 40) {
				Static305.aClass1_Sub21_Sub2_3.method5757(219);
				Static305.aClass1_Sub21_Sub2_3.method5718(0);
				local90 = Static305.aClass1_Sub21_Sub2_3.anInt6611;
				local92 = 0;
				for (local94 = 0; local94 < Static287.aClass48_1.anInt1354 && Static305.aClass1_Sub21_Sub2_3.anInt6611 - local90 < 240; local94++) {
					local92++;
					local111 = Static287.aClass48_1.anIntArray96[local94];
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 65534) {
						local111 = 65534;
					}
					local130 = Static287.aClass48_1.anIntArray97[local94];
					if (local130 < 0) {
						local130 = 0;
					} else if (local130 > 65534) {
						local130 = 65534;
					}
					@Pc(148) boolean local148 = false;
					if (Static287.aClass48_1.anIntArray96[local94] == -1 && Static287.aClass48_1.anIntArray97[local94] == -1) {
						local130 = -1;
						local111 = -1;
						local148 = true;
					}
					if (Static168.anInt3461 != local130 || local111 != Static229.anInt4787) {
						local186 = local130 - Static168.anInt3461;
						Static168.anInt3461 = local130;
						local193 = local111 - Static229.anInt4787;
						Static229.anInt4787 = local111;
						if (Static302.anInt6037 < 8 && local186 >= -32 && local186 <= 31 && local193 >= -32 && local193 <= 31) {
							local186 += 32;
							local193 += 32;
							Static305.aClass1_Sub21_Sub2_3.method5698((Static302.anInt6037 << 12) + (local186 << 6) + local193);
							Static302.anInt6037 = 0;
						} else if (Static302.anInt6037 < 32 && local186 >= -128 && local186 <= 127 && local193 >= -128 && local193 <= 127) {
							local193 += 128;
							Static305.aClass1_Sub21_Sub2_3.method5718(Static302.anInt6037 + 128);
							local186 += 128;
							Static305.aClass1_Sub21_Sub2_3.method5698(local193 + (local186 << 8));
							Static302.anInt6037 = 0;
						} else if (Static302.anInt6037 < 32) {
							Static305.aClass1_Sub21_Sub2_3.method5718(Static302.anInt6037 + 192);
							if (local148) {
								Static305.aClass1_Sub21_Sub2_3.method5702(Integer.MIN_VALUE);
							} else {
								Static305.aClass1_Sub21_Sub2_3.method5702(local111 << 16 | local130);
							}
							Static302.anInt6037 = 0;
						} else {
							Static305.aClass1_Sub21_Sub2_3.method5698(Static302.anInt6037 + 57344);
							if (local148) {
								Static305.aClass1_Sub21_Sub2_3.method5702(Integer.MIN_VALUE);
							} else {
								Static305.aClass1_Sub21_Sub2_3.method5702(local111 << 16 | local130);
							}
							Static302.anInt6037 = 0;
						}
					} else if (Static302.anInt6037 < 2047) {
						Static302.anInt6037++;
					}
				}
				Static305.aClass1_Sub21_Sub2_3.method5750(Static305.aClass1_Sub21_Sub2_3.anInt6611 - local90);
				if (Static287.aClass48_1.anInt1354 > local92) {
					Static287.aClass48_1.anInt1354 -= local92;
					for (local111 = 0; local111 < Static287.aClass48_1.anInt1354; local111++) {
						Static287.aClass48_1.anIntArray97[local111] = Static287.aClass48_1.anIntArray97[local111 + local92];
						Static287.aClass48_1.anIntArray96[local111] = Static287.aClass48_1.anIntArray96[local92 + local111];
					}
				} else {
					Static287.aClass48_1.anInt1354 = 0;
				}
			}
		}
		if (Static171.anInt3612 != 0) {
			@Pc(405) long local405 = (Static250.aLong153 - Static182.aLong106) / 50L;
			if (local405 > 32767L) {
				local405 = 32767L;
			}
			Static182.aLong106 = Static250.aLong153;
			local90 = Static27.anInt4213;
			if (local90 < 0) {
				local90 = 0;
			} else if (local90 > 65535) {
				local90 = 65535;
			}
			local92 = Static289.anInt5796;
			if (local92 < 0) {
				local92 = 0;
			} else if (local92 > 65535) {
				local92 = 65535;
			}
			@Pc(448) byte local448 = 0;
			if (Static171.anInt3612 == 2) {
				local448 = 1;
			}
			Static305.aClass1_Sub21_Sub2_3.method5757(152);
			local111 = (int) local405;
			Static305.aClass1_Sub21_Sub2_3.method5698(local111 | local448 << 15);
			Static305.aClass1_Sub21_Sub2_3.method5724(local90 << 16 | local92);
		}
		if (Static40.anInt1099 > 0) {
			Static40.anInt1099--;
		}
		if (Static209.aBoolean344 && Static40.anInt1099 <= 0) {
			Static209.aBoolean344 = false;
			Static40.anInt1099 = 20;
			Static305.aClass1_Sub21_Sub2_3.method5757(226);
			Static305.aClass1_Sub21_Sub2_3.method5696((int) Static143.aFloat21 >> 3);
			Static305.aClass1_Sub21_Sub2_3.method5751((int) Static318.aFloat77 >> 3);
		}
		if (Static167.aBoolean266 && !Static54.aBoolean93) {
			Static54.aBoolean93 = true;
			Static305.aClass1_Sub21_Sub2_3.method5757(58);
			Static305.aClass1_Sub21_Sub2_3.method5718(1);
		}
		if (!Static167.aBoolean266 && Static54.aBoolean93) {
			Static54.aBoolean93 = false;
			Static305.aClass1_Sub21_Sub2_3.method5757(58);
			Static305.aClass1_Sub21_Sub2_3.method5718(0);
		}
		if (!Static275.aBoolean465) {
			Static305.aClass1_Sub21_Sub2_3.method5757(180);
			Static305.aClass1_Sub21_Sub2_3.method5724(Static245.method827());
			Static275.aBoolean465 = true;
		}
		if (Static347.aClass83ArrayArrayArray3 != null) {
			if (Static246.anInt5156 == 2) {
				Static86.method1392();
			} else if (Static246.anInt5156 == 3) {
				Static355.method5867();
			}
		}
		if (Static244.aBoolean511) {
			Static244.aBoolean511 = false;
		} else {
			Static81.aFloat8 /= 2.0F;
		}
		if (Static124.aBoolean197) {
			Static124.aBoolean197 = false;
		} else {
			Static93.aFloat9 /= 2.0F;
		}
		Static176.method3149();
		if (Static261.anInt5376 != 30) {
			return;
		}
		Static261.method4723();
		Static8.method113();
		Static38.method2697();
		Static321.anInt6389++;
		if (Static321.anInt6389 > 750) {
			Static287.method5029();
			return;
		}
		Static264.method4762();
		Static327.method5521();
		Static131.method2206();
		for (@Pc(661) int local661 = Static239.method2416(true); local661 != -1; local661 = Static239.method2416(false)) {
			Static131.method2205(local661);
			Static341.anIntArray663[Static204.anInt6781++ & 0x1F] = local661;
		}
		@Pc(751) Class163 local751;
		@Pc(1151) int local1151;
		for (@Pc(686) Class1_Sub2_Sub15 local686 = Static86.method1390(); local686 != null; local686 = Static86.method1390()) {
			local92 = local686.method4785();
			local94 = local686.method4784();
			if (local92 == 1) {
				Static35.anIntArray51[local94] = local686.anInt5461;
				Static216.aBoolean367 |= Static254.aBooleanArray21[local94];
				Static173.anIntArray347[Static330.anInt6442++ & 0x1F] = local94;
			} else if (local92 == 2) {
				Static20.aStringArray3[local94] = local686.aString211;
				Static117.anIntArray195[Static126.anInt2453++ & 0x1F] = local94;
			} else if (local92 == 3) {
				local751 = Static248.method22(local94);
				if (!local686.aString211.equals(local751.aString193)) {
					local751.aString193 = local686.aString211;
					Static340.method5639(local751);
				}
			} else if (local92 == 4) {
				local751 = Static248.method22(local94);
				local130 = local686.anInt5461;
				local1151 = local686.anInt5467;
				local186 = local686.anInt5458;
				if (local751.anInt4975 != local130 || local751.anInt4979 != local1151 || local751.anInt4940 != local186) {
					local751.anInt4979 = local1151;
					local751.anInt4975 = local130;
					local751.anInt4940 = local186;
					Static340.method5639(local751);
				}
			} else if (local92 == 5) {
				local751 = Static248.method22(local94);
				if (local686.anInt5461 != local751.anInt4920 || local686.anInt5461 == -1) {
					local751.anInt4965 = 0;
					local751.anInt4920 = local686.anInt5461;
					local751.anInt4950 = 1;
					local751.anInt4922 = 0;
					Static340.method5639(local751);
				}
			} else if (local92 == 6) {
				local111 = local686.anInt5461;
				local130 = local111 >> 10 & 0x1F;
				local1151 = local111 >> 5 & 0x1F;
				local186 = local111 & 0x1F;
				local193 = (local186 << 3) + (local1151 << 11) + (local130 << 19);
				@Pc(1171) Class163 local1171 = Static248.method22(local94);
				if (local1171.anInt4948 != local193) {
					local1171.anInt4948 = local193;
					Static340.method5639(local1171);
				}
			} else if (local92 == 7) {
				local751 = Static248.method22(local94);
				@Pc(1120) boolean local1120 = local686.anInt5461 == 1;
				if (local1120 != local751.aBoolean412) {
					local751.aBoolean412 = local1120;
					Static340.method5639(local751);
				}
			} else if (local92 == 8) {
				local751 = Static248.method22(local94);
				if (local751.anInt4931 != local686.anInt5461 || local686.anInt5467 != local751.anInt5000 || local686.anInt5458 != local751.anInt4929) {
					local751.anInt4929 = local686.anInt5458;
					local751.anInt5000 = local686.anInt5467;
					local751.anInt4931 = local686.anInt5461;
					if (local751.anInt4924 != -1) {
						if (local751.anInt4921 > 0) {
							local751.anInt4929 = local751.anInt4929 * 32 / local751.anInt4921;
						} else if (local751.anInt5009 > 0) {
							local751.anInt4929 = local751.anInt4929 * 32 / local751.anInt5009;
						}
					}
					Static340.method5639(local751);
				}
			} else if (local92 == 9) {
				local751 = Static248.method22(local94);
				if (local686.anInt5461 != local751.anInt4924 || local751.anInt5006 != local686.anInt5467) {
					local751.anInt5006 = local686.anInt5467;
					local751.anInt4924 = local686.anInt5461;
					Static340.method5639(local751);
				}
			} else if (local92 == 10) {
				local751 = Static248.method22(local94);
				if (local686.anInt5461 != local751.anInt4966 || local751.anInt4960 != local686.anInt5467 || local686.anInt5458 != local751.anInt4945) {
					local751.anInt4960 = local686.anInt5467;
					local751.anInt4966 = local686.anInt5461;
					local751.anInt4945 = local686.anInt5458;
					Static340.method5639(local751);
				}
			} else if (local92 == 11) {
				local751 = Static248.method22(local94);
				local751.aByte66 = 0;
				local751.anInt5012 = local751.anInt4957 = local686.anInt5461;
				local751.aByte67 = 0;
				local751.anInt4993 = local751.anInt4946 = local686.anInt5467;
				Static340.method5639(local751);
			} else if (local92 == 12) {
				local751 = Static248.method22(local94);
				local130 = local686.anInt5461;
				if (local751 != null && local751.anInt4934 == 0) {
					if (local130 > local751.anInt4990 - local751.anInt4935) {
						local130 = local751.anInt4990 - local751.anInt4935;
					}
					if (local130 < 0) {
						local130 = 0;
					}
					if (local751.anInt4985 != local130) {
						local751.anInt4985 = local130;
						Static340.method5639(local751);
					}
				}
			} else if (local92 == 13) {
				local751 = Static248.method22(local94);
				local751.anInt4937 = local686.anInt5461;
			} else if (local92 == 14) {
				local751 = Static248.method22(local94);
				local751.anInt4944 = local686.anInt5461;
			} else if (local92 == 15) {
				Static307.anInt6146 = local686.anInt5461;
				Static324.aBoolean528 = true;
				Static14.anInt229 = local686.anInt5467;
			}
		}
		if (Static319.anInt3288 != 0) {
			Static166.anInt3452 += 20;
			if (Static166.anInt3452 >= 400) {
				Static319.anInt3288 = 0;
			}
		}
		Static41.anInt1126++;
		if (Static90.aClass163_6 != null) {
			Static111.anInt2150++;
			if (Static111.anInt2150 >= 15) {
				Static340.method5639(Static90.aClass163_6);
				Static90.aClass163_6 = null;
			}
		}
		@Pc(1273) Class163 local1273 = Static139.aClass163_10;
		@Pc(1275) Class163 local1275 = Static10.aClass163_1;
		Static139.aClass163_10 = null;
		Static102.anInt1950 = 0;
		Static10.aClass163_1 = null;
		Static144.aBoolean232 = false;
		Static152.aBoolean242 = false;
		Static269.aClass163_17 = null;
		while (Static283.method4992() && Static102.anInt1950 < 128) {
			if (!Static134.method2266() || Static276.aChar4 != '`' && Static276.aChar4 != '§') {
				Static43.anIntArray67[Static102.anInt1950] = Static136.anInt2694;
				Static12.anIntArray9[Static102.anInt1950] = Static276.aChar4;
				Static102.anInt1950++;
			} else if (Static256.method4565()) {
				Static86.method1389();
			} else {
				Static92.method1451();
			}
		}
		if (Static256.method4565()) {
			Static172.method3083();
		}
		Static105.aClass163_7 = null;
		Static63.method2281(null, -1, -1);
		Static237.method4325(null, -1, -1);
		if (Static129.anInt2569 != -1) {
			Static291.method5101(0, 0, 0, Static129.anInt2569, Static26.anInt476, Static321.anInt6388, 0);
		}
		Static244.anInt6207++;
		if (Static105.aClass163_7 != null) {
			Static306.method5296();
		}
		if (Static205.aBoolean340) {
			Static305.aClass1_Sub21_Sub2_3.method5757(169);
			Static305.aClass1_Sub21_Sub2_3.method5738(Static308.anInt6034 << 14 | Static317.anInt6310 << 28 | Static142.anInt2787);
			Static205.aBoolean340 = false;
		}
		while (true) {
			@Pc(1413) Class163 local1413;
			@Pc(1402) Class163 local1402;
			@Pc(1397) Class1_Sub8 local1397;
			do {
				local1397 = (Class1_Sub8) Static229.aClass14_23.method310();
				if (local1397 == null) {
					while (true) {
						do {
							local1397 = (Class1_Sub8) Static276.aClass14_30.method310();
							if (local1397 == null) {
								while (true) {
									do {
										local1397 = (Class1_Sub8) Static339.aClass14_37.method310();
										if (local1397 == null) {
											if (Static105.aClass163_7 == null) {
												Static148.anInt3053 = 0;
											}
											if (Static157.aClass163_11 != null) {
												Static344.method5754();
											}
											if (Static305.anInt6104 > 0 && Static112.aBooleanArray11[82] && Static112.aBooleanArray11[81] && Static94.anInt1786 != 0) {
												local111 = Static127.anInt2487 - Static94.anInt1786;
												if (local111 < 0) {
													local111 = 0;
												} else if (local111 > 3) {
													local111 = 3;
												}
												Static180.method3194(Static92.anInt1755 + Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0], Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] + Static98.anInt1911, local111);
											}
											Static196.method3452();
											if (Static43.aClass163_4 != null) {
												Static340.method5639(Static43.aClass163_4);
												Static63.anInt2653++;
												if (Static69.anInt1476 + 5 < Static208.anInt4358 || Static208.anInt4358 < Static69.anInt1476 - 5 || Static351.anInt4024 + 5 < Static28.anInt538 || Static351.anInt4024 - 5 > Static28.anInt538) {
													Static57.aBoolean95 = true;
												}
												if (Static9.anInt116 == 0) {
													if (Static57.aBoolean95 && Static63.anInt2653 >= 5) {
														if (Static242.aClass163_16 == Static43.aClass163_4 && Static228.anInt4756 != Static35.anInt870) {
															local751 = Static43.aClass163_4;
															@Pc(1653) byte local1653 = 0;
															if (Static265.anInt5466 == 1 && local751.anInt4926 == 206) {
																local1653 = 1;
															}
															if (local751.anIntArray461[Static228.anInt4756] <= 0) {
																local1653 = 0;
															}
															if (local1653 == 1) {
																local1151 = Static35.anInt870;
																local186 = Static228.anInt4756;
																while (local1151 != local186) {
																	if (local186 < local1151) {
																		local751.method4345(local1151, local1151 - 1);
																		local1151--;
																	} else if (local186 > local1151) {
																		local751.method4345(local1151, local1151 + 1);
																		local1151++;
																	}
																}
															} else {
																local751.method4345(Static35.anInt870, Static228.anInt4756);
															}
															Static305.aClass1_Sub21_Sub2_3.method5757(236);
															Static305.aClass1_Sub21_Sub2_3.method5702(Static43.aClass163_4.anInt4947);
															Static305.aClass1_Sub21_Sub2_3.method5718(local1653);
															Static305.aClass1_Sub21_Sub2_3.method5696(Static35.anInt870);
															Static305.aClass1_Sub21_Sub2_3.method5696(Static228.anInt4756);
														}
													} else if ((Static120.anInt2335 == 1 || Static82.method1316()) && Static61.anInt1413 > 2) {
														method2319();
													} else if (Static325.method2372()) {
														Static344.method5762();
													}
													Static43.aClass163_4 = null;
													Static171.anInt3612 = 0;
													Static111.anInt2150 = 10;
												}
											}
											if (Static139.aClass163_10 != local1273) {
												if (local1273 != null) {
													Static340.method5639(local1273);
												}
												if (Static139.aClass163_10 != null) {
													Static340.method5639(Static139.aClass163_10);
												}
											}
											if (Static10.aClass163_1 != local1275 && Static319.anInt3291 == Static306.anInt6117) {
												if (local1275 != null) {
													Static340.method5639(local1275);
												}
												if (Static10.aClass163_1 != null) {
													Static340.method5639(Static10.aClass163_1);
												}
											}
											if (Static10.aClass163_1 == null) {
												if (Static306.anInt6117 > 0) {
													Static306.anInt6117--;
												}
											} else if (Static306.anInt6117 < Static319.anInt3291) {
												Static306.anInt6117++;
												if (Static306.anInt6117 == Static319.anInt3291) {
													Static340.method5639(Static10.aClass163_1);
												}
											}
											for (local111 = 0; local111 < 5; local111++) {
												@Pc(1848) int local1848 = Static121.anIntArray393[local111]++;
											}
											local130 = Static42.method889();
											local1151 = Static274.method4903();
											if (local130 > 15000 && local1151 > 15000) {
												Static251.anInt5188 = 250;
												Static237.method4322(14500);
												Static305.aClass1_Sub21_Sub2_3.method5757(101);
											}
											if (Static216.aBoolean367 && Static292.method5114() - 60000L > Static222.aLong137) {
												Static250.method4491();
											}
											Static206.anInt4323++;
											if (Static206.anInt4323 > 500) {
												Static206.anInt4323 = 0;
												local186 = (int) (Math.random() * 8.0D);
												if ((local186 & 0x4) == 4) {
													Static175.anInt3715 += Static212.anInt4526;
												}
												if ((local186 & 0x2) == 2) {
													Static86.anInt1656 += Static28.anInt536;
												}
												if ((local186 & 0x1) == 1) {
													Static178.anInt3745 += Static74.anInt1562;
												}
											}
											if (Static178.anInt3745 < -50) {
												Static74.anInt1562 = 2;
											}
											if (Static178.anInt3745 > 50) {
												Static74.anInt1562 = -2;
											}
											if (Static86.anInt1656 < -55) {
												Static28.anInt536 = 2;
											}
											if (Static175.anInt3715 < -40) {
												Static212.anInt4526 = 1;
											}
											if (Static86.anInt1656 > 55) {
												Static28.anInt536 = -2;
											}
											Static335.anInt6499++;
											if (Static175.anInt3715 > 40) {
												Static212.anInt4526 = -1;
											}
											if (Static335.anInt6499 > 500) {
												Static335.anInt6499 = 0;
												local186 = (int) (Math.random() * 8.0D);
												if ((local186 & 0x1) == 1) {
													Static86.anInt1648 += Static234.anInt4840;
												}
												if ((local186 & 0x2) == 2) {
													Static260.anInt5347 += Static236.anInt4849;
												}
											}
											if (Static86.anInt1648 < -60) {
												Static234.anInt4840 = 2;
											}
											if (Static86.anInt1648 > 60) {
												Static234.anInt4840 = -2;
											}
											if (Static260.anInt5347 < -20) {
												Static236.anInt4849 = 1;
											}
											Static32.anInt567++;
											if (Static260.anInt5347 > 10) {
												Static236.anInt4849 = -1;
											}
											if (Static32.anInt567 > 50) {
												Static305.aClass1_Sub21_Sub2_3.method5757(133);
											}
											if (Static106.aBoolean164) {
												Static332.method5549();
												Static106.aBoolean164 = false;
											}
											try {
												if (Static81.aClass202_3 != null && Static305.aClass1_Sub21_Sub2_3.anInt6611 > 0) {
													Static81.aClass202_3.method5480(Static305.aClass1_Sub21_Sub2_3.anInt6611, Static305.aClass1_Sub21_Sub2_3.aByteArray82);
													Static305.aClass1_Sub21_Sub2_3.anInt6611 = 0;
													Static32.anInt567 = 0;
													return;
												}
												return;
											} catch (@Pc(2079) IOException local2079) {
												Static287.method5029();
												return;
											}
										}
										local1402 = local1397.aClass163_3;
										if (local1402.anInt4923 < 0) {
											break;
										}
										local1413 = Static248.method22(local1402.anInt4918);
									} while (local1413 == null || local1413.aClass163Array3 == null || local1402.anInt4923 >= local1413.aClass163Array3.length || local1413.aClass163Array3[local1402.anInt4923] != local1402);
									Static122.method1972(local1397);
								}
							}
							local1402 = local1397.aClass163_3;
							if (local1402.anInt4923 < 0) {
								break;
							}
							local1413 = Static248.method22(local1402.anInt4918);
						} while (local1413 == null || local1413.aClass163Array3 == null || local1402.anInt4923 >= local1413.aClass163Array3.length || local1402 != local1413.aClass163Array3[local1402.anInt4923]);
						Static122.method1972(local1397);
					}
				}
				local1402 = local1397.aClass163_3;
				if (local1402.anInt4923 < 0) {
					break;
				}
				local1413 = Static248.method22(local1402.anInt4918);
			} while (local1413 == null || local1413.aClass163Array3 == null || local1402.anInt4923 >= local1413.aClass163Array3.length || local1402 != local1413.aClass163Array3[local1402.anInt4923]);
			Static122.method1972(local1397);
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
	public static void method2318() {
		Static329.aClass37_105.method919();
		Static57.aClass37_27.method919();
		Static250.aClass37_82.method919();
		Static333.aClass37_106.method919();
		Static11.aClass37_95.method919();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method2319() {
		@Pc(10) int local10 = Static81.aClass34_4.method796(Static148.aString111);
		@Pc(26) int local26;
		for (@Pc(20) Class1_Sub12 local20 = (Class1_Sub12) Static58.aClass14_4.method302(); local20 != null; local20 = (Class1_Sub12) Static58.aClass14_4.method313()) {
			local26 = Static250.method4493(local20);
			if (local10 < local26) {
				local10 = local26;
			}
		}
		local10 += 8;
		local26 = Static61.anInt1413 * 16 + 21;
		@Pc(51) int local51 = Static208.anInt4358 - local10 / 2;
		if (local10 + local51 > Static26.anInt476) {
			local51 = Static26.anInt476 - local10;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		@Pc(66) int local66 = Static28.anInt538;
		if (Static321.anInt6388 < local66 + local26) {
			local66 = Static321.anInt6388 - local26;
		}
		if (local66 < 0) {
			local66 = 0;
		}
		Static298.anInt6013 = local51;
		Static308.aBoolean499 = true;
		Static228.anInt4754 = local10;
		Static148.anInt3051 = local66;
		Static145.anInt3038 = (Static345.aBoolean548 ? 26 : 22) + Static61.anInt1413 * 16;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILclient!lm;)Lclient!cl;")
	public static Class34 method2320(@OriginalArg(1) int arg0, @OriginalArg(3) Class134 arg1) {
		@Pc(14) byte[] local14 = arg1.method3009(0, arg0);
		return local14 == null ? null : new Class34(local14);
	}
}
