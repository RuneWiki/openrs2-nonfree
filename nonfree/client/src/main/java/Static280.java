import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!vh", name = "L", descriptor = "[I")
	public static int[] anIntArray472;

	@OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
	public static int anInt5319 = -1;

	@OriginalMember(owner = "client!vh", name = "X", descriptor = "[I")
	public static int[] anIntArray475 = new int[25];

	@OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
	public static int anInt5321 = 0;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
	public static void method4223(@OriginalArg(1) int arg0) {
		@Pc(16) Class4_Sub2_Sub21 local16 = Static39.method4121(arg0, 1);
		local16.method4361();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method4224(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg1.charAt(local17) == arg0) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
	public static void method4225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static95.anInt1961 = 0;
		@Pc(5) int local5;
		@Pc(638) int local638;
		@Pc(76) int local76;
		@Pc(262) int local262;
		@Pc(304) int local304;
		@Pc(357) int local357;
		@Pc(635) int local635;
		for (local5 = -1; local5 < Static41.anInt856 + Static68.anInt1262; local5++) {
			@Pc(23) Class12_Sub3 local23;
			if (local5 == -1) {
				local23 = Static239.aClass12_Sub3_Sub2_2;
			} else if (Static41.anInt856 > local5) {
				local23 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local5]];
			} else {
				local23 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local5 - Static41.anInt856]];
			}
			if (local23 != null && local23.method3374()) {
				@Pc(58) Class175 local58;
				if (local23 instanceof Class12_Sub3_Sub1) {
					local58 = ((Class12_Sub3_Sub1) local23).aClass175_1;
					if (local58.anIntArray462 != null) {
						local58 = local58.method4133();
					}
					if (local58 == null) {
						continue;
					}
				}
				@Pc(156) int local156;
				if (local5 >= Static41.anInt856) {
					local58 = ((Class12_Sub3_Sub1) local23).aClass175_1;
					if (local58.anIntArray462 != null) {
						local58 = local58.method4133();
					}
					if (local58.anInt5192 >= 0 && local58.anInt5192 < Static34.aClass4_Sub2_Sub1Array2.length) {
						if (local58.anInt5197 == -1) {
							local262 = local23.method3370() + 15;
						} else {
							local262 = local58.anInt5197 + 15;
						}
						Static1.method5(arg1, arg2 >> 1, local262, local23, arg5 >> 1, arg0);
						if (Static89.anInt1837 > -1) {
							Static34.aClass4_Sub2_Sub1Array2[local58.anInt5192].method3454(arg4 + Static89.anInt1837 - 12, anInt5319 + arg3 - 30);
						}
					}
					@Pc(302) Class7[] local302 = Static250.aClass7Array1;
					for (local304 = 0; local304 < local302.length; local304++) {
						@Pc(316) Class7 local316 = local302[local304];
						if (local316 != null && local316.anInt135 == 1 && Static10.anIntArray20[local5 - Static41.anInt856] == local316.anInt133 && Static104.anInt2226 % 20 < 10) {
							if (local58.anInt5197 == -1) {
								local357 = local23.method3370() + 15;
							} else {
								local357 = local58.anInt5197 + 15;
							}
							Static1.method5(arg1, arg2 >> 1, local357, local23, arg5 >> 1, arg0);
							if (Static89.anInt1837 > -1) {
								Static39.aClass4_Sub2_Sub1Array12[local316.anInt131].method3454(Static89.anInt1837 + arg4 - 12, arg3 + -28 + anInt5319);
							}
						}
					}
				} else {
					local76 = 30;
					@Pc(79) Class12_Sub3_Sub2 local79 = (Class12_Sub3_Sub2) local23;
					if (local79.anInt4218 != -1 || local79.anInt4214 != -1) {
						Static1.method5(arg1, arg2 >> 1, local23.method3370() + 15, local23, arg5 >> 1, arg0);
						if (Static89.anInt1837 > -1) {
							if (local79.anInt4218 != -1) {
								Static124.aClass4_Sub2_Sub1Array8[local79.anInt4218].method3454(Static89.anInt1837 + arg4 - 12, anInt5319 + -30 + arg3);
								local76 += 25;
							}
							if (local79.anInt4214 != -1) {
								Static34.aClass4_Sub2_Sub1Array2[local79.anInt4214].method3454(Static89.anInt1837 + arg4 - 12, anInt5319 + (arg3 - local76));
								local76 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(154) Class7[] local154 = Static250.aClass7Array1;
						for (local156 = 0; local156 < local154.length; local156++) {
							@Pc(164) Class7 local164 = local154[local156];
							if (local164 != null && local164.anInt135 == 10 && Static85.anIntArray179[local5] == local164.anInt133) {
								Static1.method5(arg1, arg2 >> 1, local23.method3370() + 15, local23, arg5 >> 1, arg0);
								if (Static89.anInt1837 > -1) {
									Static39.aClass4_Sub2_Sub1Array12[local164.anInt131].method3454(arg4 + Static89.anInt1837 - 12, -local76 + anInt5319 + arg3);
								}
							}
						}
					}
				}
				if (local23.aString130 != null && (Static41.anInt856 <= local5 || Static47.anInt952 == 0 || Static47.anInt952 == 3 || Static47.anInt952 == 1 && Static76.method1153(((Class12_Sub3_Sub2) local23).aString132))) {
					Static1.method5(arg1, arg2 >> 1, local23.method3370(), local23, arg5 >> 1, arg0);
					if (Static89.anInt1837 > -1 && Static95.anInt1961 < Static288.anInt2447) {
						Static288.anIntArray235[Static95.anInt1961] = Static289.aClass4_Sub2_Sub12_3.method4195(local23.aString130) / 2;
						Static288.anIntArray233[Static95.anInt1961] = Static289.aClass4_Sub2_Sub12_3.anInt5274;
						Static288.anIntArray230[Static95.anInt1961] = Static89.anInt1837;
						Static288.anIntArray232[Static95.anInt1961] = anInt5319;
						Static288.anIntArray234[Static95.anInt1961] = local23.anInt4148;
						Static288.anIntArray229[Static95.anInt1961] = local23.anInt4155;
						Static288.anIntArray231[Static95.anInt1961] = local23.anInt4180;
						Static288.aStringArray17[Static95.anInt1961] = local23.aString130;
						Static95.anInt1961++;
					}
				}
				if (Static104.anInt2226 < local23.anInt4186) {
					@Pc(508) Class4_Sub2_Sub1 local508 = Static278.aClass4_Sub2_Sub1Array13[0];
					@Pc(512) Class4_Sub2_Sub1 local512 = Static278.aClass4_Sub2_Sub1Array13[1];
					if (local23 instanceof Class12_Sub3_Sub1) {
						@Pc(524) Class12_Sub3_Sub1 local524 = (Class12_Sub3_Sub1) local23;
						@Pc(534) Class4_Sub2_Sub1[] local534 = (Class4_Sub2_Sub1[]) Static3.aClass33_1.method841((long) local524.aClass175_1.anInt5201);
						if (local534 == null) {
							local534 = Static275.method4101(Static288.aClass98_66, local524.aClass175_1.anInt5201);
							if (local534 != null) {
								Static3.aClass33_1.method845(local534, (long) local524.aClass175_1.anInt5201);
							}
						}
						@Pc(558) Class175 local558 = local524.aClass175_1;
						if (local534 != null && local534.length == 2) {
							local512 = local534[1];
							local508 = local534[0];
						}
						if (local558.anInt5197 == -1) {
							local304 = local23.method3370();
						} else {
							local304 = local558.anInt5197;
						}
					} else {
						local304 = local23.method3370();
					}
					Static1.method5(arg1, arg2 >> 1, local508.anInt4308 + local304 + 10, local23, arg5 >> 1, arg0);
					if (Static89.anInt1837 > -1) {
						local357 = arg3 + anInt5319 - 3;
						local156 = Static89.anInt1837 + arg4 - (local508.anInt4301 >> 1);
						local508.method3454(local156, local357);
						local635 = local508.anInt4301 * local23.anInt4166 / 255;
						local638 = local508.anInt4308;
						if (Static178.aBoolean216) {
							Static186.method2964(local156, local357, local635 + local156, local357 + local638);
						} else {
							Static166.method2617(local156, local357, local635 + local156, local638 + local357);
						}
						local512.method3454(local156, local357);
						if (Static178.aBoolean216) {
							Static186.method2963(arg4, arg3, arg4 + arg2, arg3 + arg5);
						} else {
							Static166.method2622(arg4, arg3, arg2 + arg4, arg3 + arg5);
						}
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (Static104.anInt2226 < local23.anIntArray378[local76]) {
						if (local23 instanceof Class12_Sub3_Sub1) {
							@Pc(711) Class12_Sub3_Sub1 local711 = (Class12_Sub3_Sub1) local23;
							@Pc(714) Class175 local714 = local711.aClass175_1;
							if (local714.anInt5197 == -1) {
								local262 = local23.method3370() / 2;
							} else {
								local262 = local714.anInt5197 / 2;
							}
						} else {
							local262 = local23.method3370() / 2;
						}
						Static1.method5(arg1, arg2 >> 1, local262, local23, arg5 >> 1, arg0);
						if (Static89.anInt1837 > -1) {
							if (local76 == 1) {
								anInt5319 -= 20;
							}
							if (local76 == 2) {
								anInt5319 -= 10;
								Static89.anInt1837 -= 15;
							}
							if (local76 == 3) {
								anInt5319 -= 10;
								Static89.anInt1837 += 15;
							}
							Static104.aClass4_Sub2_Sub1Array7[local23.anIntArray377[local76]].method3454(arg4 + Static89.anInt1837 - 12, arg3 - -anInt5319 + -12);
							Static79.aClass4_Sub2_Sub12_2.method4179(Integer.toString(local23.anIntArray380[local76]), Static89.anInt1837 + arg4 - 1, anInt5319 + arg3 + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (local5 = 0; local5 < Static95.anInt1961; local5++) {
			@Pc(845) int local845 = Static288.anIntArray230[local5];
			local76 = Static288.anIntArray232[local5];
			local262 = Static288.anIntArray235[local5];
			local304 = Static288.anIntArray233[local5];
			@Pc(859) boolean local859 = true;
			while (local859) {
				local859 = false;
				for (local357 = 0; local357 < local5; local357++) {
					if (local76 + 2 > Static288.anIntArray232[local357] + -Static288.anIntArray233[local357] && local76 - local304 < Static288.anIntArray232[local357] + 2 && local845 - local262 < Static288.anIntArray235[local357] + Static288.anIntArray230[local357] && local262 + local845 > Static288.anIntArray230[local357] + -Static288.anIntArray235[local357] && local76 > Static288.anIntArray232[local357] - Static288.anIntArray233[local357]) {
						local76 = Static288.anIntArray232[local357] - Static288.anIntArray233[local357];
						local859 = true;
					}
				}
			}
			Static89.anInt1837 = Static288.anIntArray230[local5];
			anInt5319 = Static288.anIntArray232[local5] = local76;
			@Pc(973) String local973 = Static288.aStringArray17[local5];
			if (Static6.anInt153 == 0) {
				local635 = 16776960;
				if (Static288.anIntArray234[local5] < 6) {
					local635 = Static21.anIntArray386[Static288.anIntArray234[local5]];
				}
				if (Static288.anIntArray234[local5] == 6) {
					local635 = Static32.anInt641 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static288.anIntArray234[local5] == 7) {
					local635 = Static32.anInt641 % 20 >= 10 ? 65535 : 255;
				}
				if (Static288.anIntArray234[local5] == 8) {
					local635 = Static32.anInt641 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static288.anIntArray234[local5] == 9) {
					local638 = 150 - Static288.anIntArray231[local5];
					if (local638 < 50) {
						local635 = local638 * 1280 + 16711680;
					} else if (local638 < 100) {
						local635 = 16384000 + 16776960 - local638 * 327680;
					} else if (local638 < 150) {
						local635 = (local638 - 100) * 5 + 65280;
					}
				}
				if (Static288.anIntArray234[local5] == 10) {
					local638 = 150 - Static288.anIntArray231[local5];
					if (local638 < 50) {
						local635 = local638 * 5 + 16711680;
					} else if (local638 < 100) {
						local635 = 16711935 + 16384000 - local638 * 327680;
					} else if (local638 < 150) {
						local635 = local638 * 327680 - (local638 + -100) * 5 - 32767745;
					}
				}
				if (Static288.anIntArray234[local5] == 11) {
					local638 = 150 - Static288.anIntArray231[local5];
					if (local638 < 50) {
						local635 = 16777215 - local638 * 327685;
					} else if (local638 < 100) {
						local635 = local638 * 327685 - 16318970;
					} else if (local638 < 150) {
						local635 = 16777215 - (local638 - 100) * 327680;
					}
				}
				if (Static288.anIntArray229[local5] == 0) {
					Static289.aClass4_Sub2_Sub12_3.method4179(local973, Static89.anInt1837 + arg4, anInt5319 + arg3, local635, 0);
				}
				if (Static288.anIntArray229[local5] == 1) {
					Static289.aClass4_Sub2_Sub12_3.method4180(local973, Static89.anInt1837 + arg4, anInt5319 + arg3, local635, Static32.anInt641);
				}
				if (Static288.anIntArray229[local5] == 2) {
					Static289.aClass4_Sub2_Sub12_3.method4196(local973, arg4 + Static89.anInt1837, arg3 - -anInt5319, local635, Static32.anInt641);
				}
				if (Static288.anIntArray229[local5] == 3) {
					Static289.aClass4_Sub2_Sub12_3.method4184(local973, Static89.anInt1837 + arg4, arg3 + anInt5319, local635, Static32.anInt641, 150 - Static288.anIntArray231[local5]);
				}
				if (Static288.anIntArray229[local5] == 4) {
					local638 = (150 - Static288.anIntArray231[local5]) * (Static289.aClass4_Sub2_Sub12_3.method4195(local973) + 100) / 150;
					if (Static178.aBoolean216) {
						Static186.method2964(Static89.anInt1837 + arg4 - 50, arg3, arg4 + Static89.anInt1837 + 50, arg3 - -arg5);
					} else {
						Static166.method2617(Static89.anInt1837 + arg4 - 50, arg3, Static89.anInt1837 + arg4 + 50, arg3 + arg5);
					}
					Static289.aClass4_Sub2_Sub12_3.method4173(local973, arg4 + Static89.anInt1837 + 50 - local638, arg3 + anInt5319, local635, 0);
					if (Static178.aBoolean216) {
						Static186.method2963(arg4, arg3, arg4 + arg2, arg3 - -arg5);
					} else {
						Static166.method2622(arg4, arg3, arg2 + arg4, arg5 + arg3);
					}
				}
				if (Static288.anIntArray229[local5] == 5) {
					local638 = 150 - Static288.anIntArray231[local5];
					if (Static178.aBoolean216) {
						Static186.method2964(arg4, arg3 + anInt5319 - Static289.aClass4_Sub2_Sub12_3.anInt5274 - 1, arg4 - -arg2, anInt5319 + arg3 + 5);
					} else {
						Static166.method2617(arg4, arg3 + anInt5319 - Static289.aClass4_Sub2_Sub12_3.anInt5274 - 1, arg2 + arg4, anInt5319 + arg3 + 5);
					}
					@Pc(1438) int local1438 = 0;
					if (local638 < 25) {
						local1438 = local638 - 25;
					} else if (local638 > 125) {
						local1438 = local638 - 125;
					}
					Static289.aClass4_Sub2_Sub12_3.method4179(local973, arg4 + Static89.anInt1837, local1438 + anInt5319 + arg3, local635, 0);
					if (Static178.aBoolean216) {
						Static186.method2963(arg4, arg3, arg2 + arg4, arg3 + arg5);
					} else {
						Static166.method2622(arg4, arg3, arg4 + arg2, arg3 - -arg5);
					}
				}
			} else {
				Static289.aClass4_Sub2_Sub12_3.method4179(local973, Static89.anInt1837 + arg4, arg3 + anInt5319, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)V")
	public static void method4226() {
		anIntArray475 = null;
		anIntArray472 = null;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLclient!hc;)V")
	public static void method4227(@OriginalArg(1) Class12_Sub3_Sub1 arg0) {
		for (@Pc(10) Class4_Sub23 local10 = (Class4_Sub23) Static118.aClass10_27.method190(); local10 != null; local10 = (Class4_Sub23) Static118.aClass10_27.method191()) {
			if (local10.aClass12_Sub3_Sub1_1 == arg0) {
				if (local10.aClass4_Sub9_Sub1_3 != null) {
					Static219.aClass4_Sub9_Sub4_2.method1470(local10.aClass4_Sub9_Sub1_3);
					local10.aClass4_Sub9_Sub1_3 = null;
				}
				local10.method4391();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)Z")
	public static boolean method4229(@OriginalArg(0) int arg0) {
		@Pc(34) int local34;
		@Pc(36) int local36;
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (Static11.aClass4_Sub2_Sub1_Sub1_1 == null) {
			if (Static178.aBoolean216 || Static116.aClass4_Sub2_Sub1_4 == null) {
				Static11.aClass4_Sub2_Sub1_Sub1_1 = new Class4_Sub2_Sub1_Sub1(512, 512);
			} else {
				Static11.aClass4_Sub2_Sub1_Sub1_1 = (Class4_Sub2_Sub1_Sub1) Static116.aClass4_Sub2_Sub1_4;
			}
			@Pc(31) int[] local31 = Static11.aClass4_Sub2_Sub1_Sub1_1.anIntArray387;
			local34 = local31.length;
			for (local36 = 0; local36 < local34; local36++) {
				local31[local36] = 1;
			}
			for (local36 = 1; local36 < 103; local36++) {
				local72 = 4 * 512 * (103 - local36) + 24628;
				for (local76 = 1; local76 < 103; local76++) {
					if ((Static46.aByteArrayArrayArray2[arg0][local76][local36] & 0x18) == 0) {
						Static268.method4005(local31, local72, arg0, local76, local36);
					}
					if (arg0 < 3 && (Static46.aByteArrayArrayArray2[arg0 + 1][local76][local36] & 0x8) != 0) {
						Static268.method4005(local31, local72, arg0 + 1, local76, local36);
					}
					local72 += 4;
				}
			}
			Static167.anInt3310 = 0;
			for (local36 = 0; local36 < 104; local36++) {
				for (local72 = 0; local72 < 104; local72++) {
					@Pc(159) long local159 = Static65.method1011(Static210.anInt4103, local36 + 0, local72);
					if (local159 != 0L) {
						@Pc(172) Class47 local172 = Static170.method2683(Integer.MAX_VALUE & (int) (local159 >>> 32));
						@Pc(175) int local175 = local172.anInt1365;
						@Pc(180) int local180;
						if (local172.anIntArray142 != null) {
							for (local180 = 0; local180 < local172.anIntArray142.length; local180++) {
								if (local172.anIntArray142[local180] != -1) {
									@Pc(201) Class47 local201 = Static170.method2683(local172.anIntArray142[local180]);
									if (local201.anInt1365 >= 0) {
										local175 = local201.anInt1365;
										break;
									}
								}
							}
						}
						if (local175 >= 0) {
							@Pc(224) int local224 = local72;
							local180 = local36;
							if (local175 != 22 && local175 != 29 && local175 != 34 && local175 != 36 && local175 != 46 && local175 != 47 && local175 != 48) {
								@Pc(259) int[][] local259 = Static121.aClass63Array1[Static210.anInt4103].anIntArrayArray21;
								for (@Pc(261) int local261 = 0; local261 < 10; local261++) {
									@Pc(271) int local271 = (int) (Math.random() * 4.0D);
									if (local271 == 0 && local180 > 0 && local180 > local36 - 3 && (local259[local180 - 1][local224] & 0x2C0108) == 0) {
										local180--;
									}
									if (local271 == 1 && local180 < 103 && local180 < local36 + 3 && (local259[local180 + 1][local224] & 0x2C0180) == 0) {
										local180++;
									}
									if (local271 == 2 && local224 > 0 && local72 - 3 < local224 && (local259[local180][local224 - 1] & 0x2C0102) == 0) {
										local224--;
									}
									if (local271 == 3 && local224 < 103 && local72 + 3 > local224 && (local259[local180][local224 + 1] & 0x2C0120) == 0) {
										local224++;
									}
								}
							}
							Static3.anIntArray5[Static167.anInt3310] = local172.anInt1366;
							Static94.anIntArray209[Static167.anInt3310] = local180;
							Static93.anIntArray207[Static167.anInt3310] = local224;
							Static167.anInt3310++;
						}
					}
				}
			}
		}
		Static11.aClass4_Sub2_Sub1_Sub1_1.method3469();
		@Pc(463) int local463 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8) + 238 - 10;
		local34 = (int) (Math.random() * 20.0D) + 228 << 16;
		for (local36 = 1; local36 < 103; local36++) {
			for (local72 = 1; local72 < 103; local72++) {
				if ((Static46.aByteArrayArrayArray2[arg0][local72][local36] & 0x18) == 0 && !Static271.method4060(local463, local72, local36, local34, arg0)) {
					if (Static178.aBoolean216) {
						Static166.anIntArray293 = null;
					} else {
						Static26.aClass119_1.method3926();
					}
					return false;
				}
				if (arg0 < 3 && (Static46.aByteArrayArrayArray2[arg0 + 1][local72][local36] & 0x8) != 0 && !Static271.method4060(local463, local72, local36, local34, arg0 + 1)) {
					if (Static178.aBoolean216) {
						Static166.anIntArray293 = null;
					} else {
						Static26.aClass119_1.method3926();
					}
					return false;
				}
			}
		}
		if (Static178.aBoolean216) {
			@Pc(577) int[] local577 = Static11.aClass4_Sub2_Sub1_Sub1_1.anIntArray387;
			local72 = local577.length;
			for (local76 = 0; local76 < local72; local76++) {
				if (local577[local76] == 0) {
					local577[local76] = 1;
				}
			}
			Static116.aClass4_Sub2_Sub1_4 = new Class4_Sub2_Sub1_Sub2(Static11.aClass4_Sub2_Sub1_Sub1_1);
		} else {
			Static116.aClass4_Sub2_Sub1_4 = Static11.aClass4_Sub2_Sub1_Sub1_1;
		}
		if (Static178.aBoolean216) {
			Static166.anIntArray293 = null;
		} else {
			Static26.aClass119_1.method3926();
		}
		Static11.aClass4_Sub2_Sub1_Sub1_1 = null;
		return true;
	}
}
