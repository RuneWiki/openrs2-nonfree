import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public static int anInt325;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
	public static boolean aBoolean26 = true;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int anInt329 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method297() {
		Static16.aClass81_1.method3035(Static292.anInt5494, Static334.aBoolean407 ? Static226.anInt4209 + 256 : -1);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ja;)V")
	public static void method298(@OriginalArg(1) Class81 arg0) {
		if (Static7.anInt149 < 0 || Static79.anInt1449 < 0 || Static327.anInt3029 == 0 || Static219.anInt4046 == 0) {
			return;
		}
		arg0.method2985(Static108.anInt2020, Static230.anInt4302, Static327.anInt3029, Static219.anInt4046);
		arg0.method3033(Static139.anInt2513, Static214.anInt3933, Static327.anInt3029, Static219.anInt4046);
		@Pc(46) Class72 local46 = arg0.method3029();
		local46.method4077(Static67.anInt1256, Static24.anInt382, Static118.anInt2260, Static334.anInt6114, Static271.anInt5040, Static159.anInt2964);
		arg0.method2954(local46);
		@Pc(80) int local80;
		@Pc(88) int local88;
		@Pc(91) int local91;
		@Pc(99) int local99;
		@Pc(108) int local108;
		if (Static14.anInt257 == 0 && Static99.aClass106Array4 != null) {
			@Pc(66) int local66 = -1;
			@Pc(68) int local68 = -1;
			@Pc(71) int local71 = arg0.method3025();
			local80 = (Static7.anInt149 - Static108.anInt2020) * local71 / Static327.anInt3029;
			local88 = local71 * (Static79.anInt1449 - Static230.anInt4302) / Static219.anInt4046;
			local91 = arg0.method2983();
			local99 = (Static7.anInt149 - Static108.anInt2020) * local91 / Static327.anInt3029;
			local108 = (Static79.anInt1449 - Static230.anInt4302) * local91 / Static219.anInt4046;
			@Pc(123) int[] local123 = new int[] { local80, local88, local71 };
			local46.method4079(local123);
			@Pc(141) int[] local141 = new int[] { local99, local108, local91 };
			local46.method4079(local141);
			@Pc(146) float local146 = 0.0F;
			@Pc(155) int local155 = local141[0] - local123[0];
			@Pc(164) int local164 = local141[1] - local123[1];
			@Pc(173) int local173 = local141[2] - local123[2];
			while (local146 < 1.0F) {
				@Pc(186) int local186 = (int) ((float) local123[0] + (float) local155 * local146);
				@Pc(190) int local190 = local186 >> 7;
				@Pc(201) int local201 = (int) (local146 * (float) local173 + (float) local123[2]);
				@Pc(205) int local205 = local201 >> 7;
				if (local190 > 0 && local205 > 0 && Static153.anInt2883 > local190 && Static246.anInt4606 > local205) {
					@Pc(228) int local228 = Static343.anInt6225;
					if (local228 < 3 && (Static265.aByteArrayArrayArray11[1][local190][local205] & 0x2) != 0) {
						local228++;
					}
					if ((float) Static99.aClass106Array4[local228].method5717(local186, local201) < (float) local123[1] + local146 * (float) local164) {
						local66 = local186 + (Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() - 1) * 64 >> 7;
						local68 = (Static253.aClass44_Sub4_Sub4_Sub1_1.method4714() - 1) * 64 + local201 >> 7;
						break;
					}
				}
				local146 = (float) ((double) local146 + 0.01D);
			}
			if (local66 != -1 && local68 != -1) {
				if (Static79.aBoolean97 && (Static288.anInt5432 & 0x40) != 0) {
					@Pc(319) Class132 local319 = Static6.method131(Static30.anInt572, Static252.anInt4705);
					if (local319 == null) {
						Static346.method5704();
					} else {
						Static52.method870(local66, Static312.aString270, 18, local68, Static1.anInt38, " ->", 0L);
					}
				} else {
					if (Static105.anInt1941 == 1) {
						Static52.method870(local66, Static1.aString1, 39, local68, -1, "", 0L);
					}
					Static52.method870(local66, Static171.aString132, 15, local68, -1, "", 0L);
				}
			}
		}
		@Pc(367) Class109 local367 = Static66.aClass109_2;
		for (@Pc(372) Class20_Sub6 local372 = (Class20_Sub6) local367.method2948(); local372 != null; local372 = (Class20_Sub6) local367.method2939()) {
			if (local372.method3213(Static7.anInt149, Static79.anInt1449, arg0) && local372.anInt3049 == Static343.anInt6225) {
				@Pc(499) int local499;
				@Pc(510) int local510;
				if (local372.aClass44_1 instanceof Class44_Sub4_Sub4_Sub1) {
					@Pc(397) Class44_Sub4_Sub4_Sub1 local397 = (Class44_Sub4_Sub4_Sub1) local372.aClass44_1;
					local80 = local397.method4714();
					if ((local80 & 0x1) == 0 && (local397.anInt6340 & 0x7F) == 0 && (local397.anInt6339 & 0x7F) == 0 || (local80 & 0x1) == 1 && (local397.anInt6340 & 0x7F) == 64 && (local397.anInt6339 & 0x7F) == 64) {
						local88 = local397.anInt6340 - (local397.method4714() - 1) * 64;
						local91 = local397.anInt6339 + 64 - local397.method4714() * 64;
						for (local99 = 0; local99 < Static149.anInt2759; local99++) {
							@Pc(472) Class44_Sub4_Sub4_Sub2 local472 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local99]];
							if (local472 != null && local472.anInt5153 != Static76.anInt2853 && local472.aBoolean359) {
								local499 = local472.anInt6340 - (local472.aClass18_1.anInt409 - 1) * 64;
								local510 = local472.anInt6339 - (local472.aClass18_1.anInt409 - 1) * 64;
								if (local499 >= local88 && local472.aClass18_1.anInt409 <= local397.method4714() - (local499 - local88 >> 7) && local510 >= local91 && local472.aClass18_1.anInt409 <= local397.method4714() - (local510 - local91 >> 7)) {
									Static117.method2380(local472);
									local472.anInt5153 = Static76.anInt2853;
								}
							}
						}
						for (local108 = 0; local108 < Static200.anInt3712; local108++) {
							@Pc(582) Class44_Sub4_Sub4_Sub1 local582 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local108]];
							if (local582 != null && local582.anInt5153 != Static76.anInt2853 && local582 != local397 && local582.aBoolean359) {
								local510 = local582.anInt6340 - (local582.method4714() - 1) * 64;
								@Pc(620) int local620 = local582.anInt6339 - (local582.method4714() - 1) * 64;
								if (local510 >= local88 && local582.method4714() <= local397.method4714() - (local510 - local88 >> 7) && local620 >= local91 && local582.method4714() <= local397.method4714() - (local620 - local91 >> 7)) {
									Static71.method1265(local582);
									local582.anInt5153 = Static76.anInt2853;
								}
							}
						}
					}
					if (local397.anInt5153 == Static76.anInt2853) {
						continue;
					}
					Static71.method1265(local397);
					local397.anInt5153 = Static76.anInt2853;
				}
				if (local372.aClass44_1 instanceof Class44_Sub4_Sub4_Sub2) {
					@Pc(682) Class44_Sub4_Sub4_Sub2 local682 = (Class44_Sub4_Sub4_Sub2) local372.aClass44_1;
					if (local682.aClass18_1 != null) {
						if ((local682.aClass18_1.anInt409 & 0x1) == 0 && (local682.anInt6340 & 0x7F) == 0 && (local682.anInt6339 & 0x7F) == 0 || (local682.aClass18_1.anInt409 & 0x1) == 1 && (local682.anInt6340 & 0x7F) == 64 && (local682.anInt6339 & 0x7F) == 64) {
							local80 = local682.anInt6340 + 64 - local682.aClass18_1.anInt409 * 64;
							local88 = local682.anInt6339 + 64 - local682.aClass18_1.anInt409 * 64;
							for (local91 = 0; local91 < Static149.anInt2759; local91++) {
								@Pc(760) Class44_Sub4_Sub4_Sub2 local760 = Static239.aClass44_Sub4_Sub4_Sub2Array8[Static191.anIntArray428[local91]];
								if (local760 != null && Static76.anInt2853 != local760.anInt5153 && local760 != local682 && local760.aBoolean359) {
									local108 = local760.anInt6340 + 64 - local760.aClass18_1.anInt409 * 64;
									local499 = local760.anInt6339 - (local760.aClass18_1.anInt409 - 1) * 64;
									if (local108 >= local80 && local682.aClass18_1.anInt409 - (local108 - local80 >> 7) >= local760.aClass18_1.anInt409 && local499 >= local88 && local760.aClass18_1.anInt409 <= local682.aClass18_1.anInt409 - (local499 - local88 >> 7)) {
										Static117.method2380(local760);
										local760.anInt5153 = Static76.anInt2853;
									}
								}
							}
							for (local99 = 0; local99 < Static200.anInt3712; local99++) {
								@Pc(860) Class44_Sub4_Sub4_Sub1 local860 = Static343.aClass44_Sub4_Sub4_Sub1Array1[Static183.anIntArray400[local99]];
								if (local860 != null && Static76.anInt2853 != local860.anInt5153 && local860.aBoolean359) {
									local499 = local860.anInt6340 + 64 - local860.method4714() * 64;
									local510 = local860.anInt6339 + 64 - local860.method4714() * 64;
									if (local80 <= local499 && local860.method4714() <= local682.aClass18_1.anInt409 - (local499 - local80 >> 7) && local510 >= local88 && local860.method4714() <= local682.aClass18_1.anInt409 - (local510 - local88 >> 7)) {
										Static71.method1265(local860);
										local860.anInt5153 = Static76.anInt2853;
									}
								}
							}
						}
						if (Static76.anInt2853 == local682.anInt5153) {
							continue;
						}
						Static117.method2380(local682);
						local682.anInt5153 = Static76.anInt2853;
					}
				}
				if (local372.aClass44_1 instanceof Class44_Sub2_Sub1) {
					@Pc(997) Class6_Sub8 local997 = (Class6_Sub8) Static33.aClass108_3.method2900((long) (local372.anInt3048 << 14 | local372.anInt3049 << 28 | local372.anInt3052));
					if (local997 != null) {
						for (@Pc(1005) Class6_Sub23 local1005 = (Class6_Sub23) local997.aClass211_4.method5590(); local1005 != null; local1005 = (Class6_Sub23) local997.aClass211_4.method5593()) {
							@Pc(1012) Class147 local1012 = Static211.method3762(local1005.anInt3151);
							if (Static14.anInt257 == 1) {
								Static52.method870(local372.anInt3052, Static165.aString287, 44, local372.anInt3048, Static71.anInt1345, Static237.aString188 + " -> <col=ff9040>" + local1012.aString170, (long) local1005.anInt3151);
							} else if (Static79.aBoolean97) {
								@Pc(1152) Class6_Sub2_Sub13 local1152 = Static221.anInt4061 == -1 ? null : Static219.method3902(Static221.anInt4061);
								if ((Static288.anInt5432 & 0x1) != 0 && (local1152 == null || local1012.method3848(Static221.anInt4061, local1152.anInt3777) != local1152.anInt3777)) {
									Static52.method870(local372.anInt3052, Static312.aString270, 32, local372.anInt3048, Static1.anInt38, Static303.aString264 + " -> <col=ff9040>" + local1012.aString170, (long) local1005.anInt3151);
								}
							} else {
								@Pc(1022) String[] local1022 = local1012.aStringArray28;
								for (local99 = 4; local99 >= 0; local99--) {
									if (local1022 != null && local1022[local99] != null) {
										@Pc(1034) byte local1034 = 0;
										local499 = Static284.anInt5376;
										if (local99 == 0) {
											local1034 = 49;
										}
										if (local99 == 1) {
											local1034 = 1;
										}
										if (local99 == 2) {
											local1034 = 26;
										}
										if (local99 == 3) {
											local1034 = 30;
										}
										if (local99 == local1012.anInt3960) {
											local499 = local1012.anInt3974;
										}
										if (local99 == 4) {
											local1034 = 4;
										}
										if (local99 == local1012.anInt3976) {
											local499 = local1012.anInt3986;
										}
										Static52.method870(local372.anInt3052, local1022[local99], local1034, local372.anInt3048, local499, "<col=ff9040>" + local1012.aString170, (long) local1005.anInt3151);
									}
								}
								Static52.method870(local372.anInt3052, Static153.aString126, 1002, local372.anInt3048, Static148.anInt2741, "<col=ff9040>" + local1012.aString170, (long) local1005.anInt3151);
							}
						}
					}
				}
				if (local372.aClass44_1 instanceof Interface7) {
					@Pc(1246) Interface7 local1246 = (Interface7) local372.aClass44_1;
					@Pc(1252) Class66 local1252 = Static196.method3622(local1246.method5799());
					if (local1252.anIntArray162 != null) {
						local1252 = local1252.method1373();
					}
					if (local1252 != null) {
						if (Static14.anInt257 == 1) {
							Static52.method870(local372.anInt3052, Static165.aString287, 41, local372.anInt3048, Static71.anInt1345, Static237.aString188 + " -> <col=00ffff>" + local1252.aString53, Static18.method292(local372.anInt3052, local1246, local372.anInt3048));
						} else if (Static79.aBoolean97) {
							@Pc(1412) Class6_Sub2_Sub13 local1412 = Static221.anInt4061 == -1 ? null : Static219.method3902(Static221.anInt4061);
							if ((Static288.anInt5432 & 0x4) != 0 && (local1412 == null || local1252.method1367(Static221.anInt4061, local1412.anInt3777) != local1412.anInt3777)) {
								Static52.method870(local372.anInt3052, Static312.aString270, 17, local372.anInt3048, Static1.anInt38, Static303.aString264 + " -> <col=00ffff>" + local1252.aString53, Static18.method292(local372.anInt3052, local1246, local372.anInt3048));
							}
						} else {
							@Pc(1271) String[] local1271 = local1252.aStringArray10;
							if (local1271 != null) {
								for (local91 = 4; local91 >= 0; local91--) {
									if (local1271[local91] != null) {
										@Pc(1283) short local1283 = 0;
										if (local91 == 0) {
											local1283 = 58;
										}
										local108 = Static284.anInt5376;
										if (local91 == 1) {
											local1283 = 47;
										}
										if (local91 == 2) {
											local1283 = 13;
										}
										if (local91 == 3) {
											local1283 = 20;
										}
										if (local91 == local1252.anInt1456) {
											local108 = local1252.anInt1462;
										}
										if (local91 == 4) {
											local1283 = 1003;
										}
										if (local91 == local1252.anInt1460) {
											local108 = local1252.anInt1485;
										}
										Static52.method870(local372.anInt3052, local1271[local91], local1283, local372.anInt3048, local108, "<col=00ffff>" + local1252.aString53, Static18.method292(local372.anInt3052, local1246, local372.anInt3048));
									}
								}
							}
							Static52.method870(local372.anInt3052, Static153.aString126, 1004, local372.anInt3048, Static148.anInt2741, "<col=00ffff>" + local1252.aString53, (long) local1252.anInt1497);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	public static void method300() {
		@Pc(5) Class70 local5 = Static184.aClass70_62;
		synchronized (Static184.aClass70_62) {
			Static184.aClass70_62.method1405();
		}
		local5 = Static80.aClass70_97;
		synchronized (Static80.aClass70_97) {
			Static80.aClass70_97.method1405();
		}
		local5 = Static206.aClass70_66;
		synchronized (Static206.aClass70_66) {
			Static206.aClass70_66.method1405();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BZ)Lclient!eq;")
	public static Class6_Sub2_Sub5 method301(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class6_Sub2_Sub5 local9 = new Class6_Sub2_Sub5();
		@Pc(14) Class6_Sub10 local14 = new Class6_Sub10(arg0);
		local14.anInt4188 = local14.aByteArray67.length - 2;
		@Pc(25) int local25 = local14.method4021();
		@Pc(36) int local36 = local14.aByteArray67.length - local25 - 12 - 2;
		local14.anInt4188 = local36;
		@Pc(43) int local43 = local14.method3979();
		local9.anInt1425 = local14.method4021();
		local9.anInt1424 = local14.method4021();
		local9.anInt1426 = local14.method4021();
		local9.anInt1419 = local14.method4021();
		@Pc(67) int local67 = local14.method3972();
		@Pc(75) int local75;
		@Pc(81) int local81;
		if (local67 > 0) {
			local9.aClass108Array1 = new Class108[local67];
			for (local75 = 0; local75 < local67; local75++) {
				local81 = local14.method4021();
				@Pc(88) Class108 local88 = new Class108(Static247.method4066(local81));
				local9.aClass108Array1[local75] = local88;
				while (local81-- > 0) {
					@Pc(99) int local99 = local14.method3979();
					@Pc(103) int local103 = local14.method3979();
					local88.method2898((long) local99, new Class6_Sub43(local103));
				}
			}
		}
		local14.anInt4188 = 0;
		local9.aString50 = local14.method3975();
		local9.anIntArray154 = new int[local43];
		local9.anIntArray153 = new int[local43];
		local9.aStringArray9 = new String[local43];
		local75 = 0;
		while (local36 > local14.anInt4188) {
			local81 = local14.method4021();
			if (local81 == 3) {
				local9.aStringArray9[local75] = local14.method4023().intern();
			} else if (local81 >= 100 || local81 == 21 || local81 == 38 || local81 == 39) {
				local9.anIntArray153[local75] = local14.method3972();
			} else {
				local9.anIntArray153[local75] = local14.method3979();
			}
			local9.anIntArray154[local75++] = local81;
		}
		return local9;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static31.method490(arg2)) {
			Static326.method5428(-1, arg7, arg4, arg3, Static81.aClass132ArrayArray1[arg2], arg0, arg1, arg5, arg6);
		} else if (arg7 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static103.aBooleanArray18[local20] = true;
			}
		} else {
			Static103.aBooleanArray18[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method303() {
		if (Static242.aBoolean316) {
			Static242.aBoolean316 = false;
			Static172.aClass40_10 = null;
			Static2.aClass40_1 = null;
		}
	}
}
