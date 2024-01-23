import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!ff", name = "R", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ff", name = "bb", descriptor = "Z")
	public static boolean aBoolean98 = true;

	@OriginalMember(owner = "client!ff", name = "cb", descriptor = "[I")
	public static int[] anIntArray186 = new int[2];

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)I")
	public static int method1360(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(47) double local47 = local14;
		if (local14 < local23) {
			local47 = local23;
		}
		if (local30 > local47) {
			local47 = local30;
		}
		@Pc(65) double local65 = (local32 + local47) / 2.0D;
		@Pc(67) double local67 = 0.0D;
		@Pc(69) double local69 = 0.0D;
		if (local32 != local47) {
			if (local47 == local14) {
				local67 = (local23 - local30) / (local47 - local32);
			} else if (local23 == local47) {
				local67 = (local30 - local14) / (-local32 + local47) + 2.0D;
			} else if (local30 == local47) {
				local67 = (local14 - local23) / (local47 - local32) + 4.0D;
			}
			if (local65 < 0.5D) {
				local69 = (local47 - local32) / (local32 + local47);
			}
			if (local65 >= 0.5D) {
				local69 = (local47 - local32) / (2.0D - local32 - local47);
			}
		}
		local67 /= 6.0D;
		@Pc(158) int local158 = (int) (local65 * 256.0D);
		@Pc(163) int local163 = (int) (local69 * 256.0D);
		if (local163 < 0) {
			local163 = 0;
		} else if (local163 > 255) {
			local163 = 255;
		}
		@Pc(184) int local184 = (int) (local67 * 256.0D);
		if (local158 < 0) {
			local158 = 0;
		} else if (local158 > 255) {
			local158 = 255;
		}
		if (local158 > 243) {
			local163 >>= 0x4;
		} else if (local158 > 217) {
			local163 >>= 0x3;
		} else if (local158 > 192) {
			local163 >>= 0x2;
		} else if (local158 > 179) {
			local163 >>= 0x1;
		}
		return (local158 >> 1) + (local163 >> 5 << 7) + (local184 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)Z")
	public static boolean method1362() throws IOException {
		if (Static22.aClass41_1 == null) {
			return false;
		}
		@Pc(14) int local14 = Static22.aClass41_1.method1067();
		if (local14 == 0) {
			return false;
		}
		if (Static80.anInt1911 == -1) {
			local14--;
			Static22.aClass41_1.method1059(1, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
			Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
			Static80.anInt1911 = Static222.aClass1_Sub16_Sub1_3.method2672();
			Static5.anInt141 = Static266.anIntArray577[Static80.anInt1911];
		}
		if (Static5.anInt141 == -1) {
			if (local14 <= 0) {
				return false;
			}
			local14--;
			Static22.aClass41_1.method1059(1, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
			Static5.anInt141 = Static222.aClass1_Sub16_Sub1_3.aByteArray39[0] & 0xFF;
		}
		if (Static5.anInt141 == -2) {
			if (local14 <= 1) {
				return false;
			}
			local14 -= 2;
			Static22.aClass41_1.method1059(2, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
			Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
			Static5.anInt141 = Static222.aClass1_Sub16_Sub1_3.method2652();
		}
		if (Static5.anInt141 > local14) {
			return false;
		}
		Static222.aClass1_Sub16_Sub1_3.anInt3328 = 0;
		Static22.aClass41_1.method1059(Static5.anInt141, Static222.aClass1_Sub16_Sub1_3.aByteArray39, 0);
		Static270.anInt5842 = 0;
		Static199.anInt4491 = Static254.anInt5398;
		Static254.anInt5398 = Static74.anInt1835;
		Static74.anInt1835 = Static80.anInt1911;
		@Pc(134) long local134;
		@Pc(141) String local141;
		if (Static80.anInt1911 == 36) {
			local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
			local141 = Static168.method3970(Static199.method3573(Static167.method3095(Static222.aClass1_Sub16_Sub1_3)));
			Static89.method1540(6, Static173.method3185(local134), local141);
			Static80.anInt1911 = -1;
			return true;
		} else if (Static80.anInt1911 == 174) {
			Static99.method1657(Static222.aClass1_Sub16_Sub1_3.method2611());
			Static80.anInt1911 = -1;
			return true;
		} else {
			@Pc(179) int local179;
			@Pc(194) int local194;
			@Pc(183) String local183;
			if (Static80.anInt1911 == 16) {
				local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
				local183 = Static222.aClass1_Sub16_Sub1_3.method2611();
				@Pc(189) Object[] local189 = new Object[local183.length() + 1];
				for (local194 = local183.length() - 1; local194 >= 0; local194--) {
					if (local183.charAt(local194) == 's') {
						local189[local194 + 1] = Static222.aClass1_Sub16_Sub1_3.method2611();
					} else {
						local189[local194 + 1] = Integer.valueOf(Static222.aClass1_Sub16_Sub1_3.method2610());
					}
				}
				local189[0] = Integer.valueOf(Static222.aClass1_Sub16_Sub1_3.method2610());
				if (Static183.method3311(local179)) {
					@Pc(246) Class1_Sub27 local246 = new Class1_Sub27();
					local246.anObjectArray32 = local189;
					Static22.method392(local246);
				}
				Static80.anInt1911 = -1;
				return true;
			}
			@Pc(269) int local269;
			if (Static80.anInt1911 == 32) {
				@Pc(265) byte local265 = Static222.aClass1_Sub16_Sub1_3.method2641();
				local269 = Static222.aClass1_Sub16_Sub1_3.method2613();
				Static229.method4002(local269, local265);
				Static80.anInt1911 = -1;
				return true;
			} else if (Static80.anInt1911 == 117) {
				Static261.anInt5718 = Static222.aClass1_Sub16_Sub1_3.method2663();
				Static268.anInt5796 = Static222.aClass1_Sub16_Sub1_3.method2649();
				for (local179 = Static268.anInt5796; local179 < Static268.anInt5796 + 8; local179++) {
					for (local269 = Static261.anInt5718; local269 < Static261.anInt5718 + 8; local269++) {
						if (Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local179][local269] != null) {
							Static240.aClass131ArrayArrayArray1[Static145.anInt3477][local179][local269] = null;
							Static117.method1923(local269, local179);
						}
					}
				}
				for (@Pc(334) Class1_Sub9 local334 = (Class1_Sub9) Static236.aClass131_17.method3791(); local334 != null; local334 = (Class1_Sub9) Static236.aClass131_17.method3792()) {
					if (local334.anInt1476 >= Static268.anInt5796 && Static268.anInt5796 + 8 > local334.anInt1476 && Static261.anInt5718 <= local334.anInt1483 && Static261.anInt5718 + 8 > local334.anInt1483 && Static145.anInt3477 == local334.anInt1470) {
						local334.anInt1485 = 0;
					}
				}
				Static80.anInt1911 = -1;
				return true;
			} else {
				@Pc(398) int local398;
				if (Static80.anInt1911 == 157) {
					local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
					local183 = Static222.aClass1_Sub16_Sub1_3.method2611();
					local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
					if (Static183.method3311(local179)) {
						Static269.method4530(local183, local398);
					}
					Static80.anInt1911 = -1;
					return true;
				} else if (Static80.anInt1911 == 183) {
					local179 = Static222.aClass1_Sub16_Sub1_3.method2616();
					Static272.aClass43_8 = Static43.aClass66_1.method1624(local179);
					Static80.anInt1911 = -1;
					return true;
				} else if (Static80.anInt1911 == 119) {
					Static267.method2725();
					Static80.anInt1911 = -1;
					return false;
				} else if (Static80.anInt1911 == 31) {
					Static218.anInt4881 = Static222.aClass1_Sub16_Sub1_3.method2655();
					Static254.anInt5408 = Static27.anInt754;
					Static80.anInt1911 = -1;
					return true;
				} else {
					@Pc(469) long local469;
					@Pc(474) long local474;
					@Pc(479) long local479;
					@Pc(487) int local487;
					@Pc(575) String local575;
					if (Static80.anInt1911 == 37) {
						local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
						Static222.aClass1_Sub16_Sub1_3.method2633();
						local469 = Static222.aClass1_Sub16_Sub1_3.method2602();
						local474 = Static222.aClass1_Sub16_Sub1_3.method2652();
						local479 = Static222.aClass1_Sub16_Sub1_3.method2634();
						@Pc(481) boolean local481 = false;
						local487 = Static222.aClass1_Sub16_Sub1_3.method2655();
						@Pc(493) long local493 = (local474 << 32) + local479;
						@Pc(495) int local495 = 0;
						label1763: while (true) {
							if (local495 >= 100) {
								if (local487 <= 1) {
									if (Static19.aBoolean25 && !Static291.aBoolean326 || Static144.aBoolean171) {
										local481 = true;
									} else {
										for (local495 = 0; local495 < Static253.anInt5514; local495++) {
											if (Static3.aLongArray1[local495] == local134) {
												local481 = true;
												break label1763;
											}
										}
									}
								}
								break;
							}
							if (Static80.aLongArray7[local495] == local493) {
								local481 = true;
								break;
							}
							local495++;
						}
						if (!local481 && Static10.anInt278 == 0) {
							Static80.aLongArray7[Static208.anInt4634] = local493;
							Static208.anInt4634 = (Static208.anInt4634 + 1) % 100;
							local575 = Static168.method3970(Static199.method3573(Static167.method3095(Static222.aClass1_Sub16_Sub1_3)));
							if (local487 == 2 || local487 == 3) {
								Static156.method2880(local575, "<img=1>" + Static173.method3185(local134), Static173.method3185(local469));
							} else if (local487 == 1) {
								Static156.method2880(local575, "<img=0>" + Static173.method3185(local134), Static173.method3185(local469));
							} else {
								Static156.method2880(local575, Static173.method3185(local134), Static173.method3185(local469));
							}
						}
						Static80.anInt1911 = -1;
						return true;
					} else if (Static80.anInt1911 == 11) {
						local179 = Static222.aClass1_Sub16_Sub1_3.method2649();
						local269 = Static222.aClass1_Sub16_Sub1_3.method2650();
						if (Static183.method3311(local269)) {
							Static11.anInt2936 = local179;
						}
						Static80.anInt1911 = -1;
						return true;
					} else if (Static80.anInt1911 == 1) {
						local179 = Static222.aClass1_Sub16_Sub1_3.method2640();
						local269 = Static222.aClass1_Sub16_Sub1_3.method2613();
						local398 = Static222.aClass1_Sub16_Sub1_3.method2659();
						if (local269 == 65535) {
							local269 = -1;
						}
						local194 = Static222.aClass1_Sub16_Sub1_3.method2610();
						if (Static183.method3311(local179)) {
							@Pc(704) Class116 local704 = Static115.method1897(local194);
							@Pc(716) Class138 local716;
							if (local704.aBoolean224) {
								Static139.method4750(local269, local398, local194);
								local716 = Static238.method4099(local269);
								Static57.method1138(local716.anInt5056, local716.anInt5043, local716.anInt5041, local194);
								Static163.method3724(local716.anInt5030, local716.anInt5049, local194, local716.anInt5029);
							} else if (local269 == -1) {
								Static80.anInt1911 = -1;
								local704.anInt4382 = 0;
								return true;
							} else {
								local716 = Static238.method4099(local269);
								local704.anInt4362 = local716.anInt5043;
								local704.anInt4291 = local716.anInt5056 * 100 / local398;
								local704.anInt4385 = local269;
								local704.anInt4361 = local716.anInt5041;
								local704.anInt4382 = 4;
								Static189.method3378(local704);
							}
						}
						Static80.anInt1911 = -1;
						return true;
					} else if (Static80.anInt1911 == 115) {
						local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
						if (local179 == 65535) {
							local179 = -1;
						}
						local269 = Static222.aClass1_Sub16_Sub1_3.method2663();
						Static101.method2283(local269, local179);
						Static80.anInt1911 = -1;
						return true;
					} else if (Static80.anInt1911 == 211) {
						local179 = Static222.aClass1_Sub16_Sub1_3.method2644();
						local269 = Static222.aClass1_Sub16_Sub1_3.method2640();
						if (local269 == 65535) {
							local269 = -1;
						}
						local398 = Static222.aClass1_Sub16_Sub1_3.method2655();
						Static250.method1412(local398, local269, local179);
						Static80.anInt1911 = -1;
						return true;
					} else {
						@Pc(865) int local865;
						if (Static80.anInt1911 == 203) {
							local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
							local269 = Static222.aClass1_Sub16_Sub1_3.method2640();
							local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
							local194 = Static222.aClass1_Sub16_Sub1_3.method2646();
							local865 = Static222.aClass1_Sub16_Sub1_3.method2650();
							if (Static183.method3311(local269)) {
								Static57.method1138(local179, local398, local865, local194);
							}
							Static80.anInt1911 = -1;
							return true;
						}
						@Pc(924) int local924;
						@Pc(950) Class1_Sub8 local950;
						@Pc(941) Class1_Sub8 local941;
						if (Static80.anInt1911 == 240) {
							local179 = Static222.aClass1_Sub16_Sub1_3.method2616();
							local269 = Static222.aClass1_Sub16_Sub1_3.method2613();
							local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
							local194 = Static222.aClass1_Sub16_Sub1_3.method2650();
							local865 = Static222.aClass1_Sub16_Sub1_3.method2640();
							if (local865 == 65535) {
								local865 = -1;
							}
							if (local194 == 65535) {
								local194 = -1;
							}
							if (Static183.method3311(local398)) {
								for (local924 = local194; local924 <= local865; local924++) {
									local479 = (long) local924 + ((long) local179 << 32);
									local941 = (Class1_Sub8) Static99.aClass117_7.method3438(local479);
									if (local941 != null) {
										local950 = new Class1_Sub8(local941.anInt1450, local269);
										local941.method4742();
									} else if (local924 == -1) {
										local950 = new Class1_Sub8(Static115.method1897(local179).aClass1_Sub8_2.anInt1450, local269);
									} else {
										local950 = new Class1_Sub8(0, local269);
									}
									Static99.aClass117_7.method3445(local950, local479);
								}
							}
							Static80.anInt1911 = -1;
							return true;
						} else if (Static80.anInt1911 == 154) {
							local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
							local269 = Static222.aClass1_Sub16_Sub1_3.method2655();
							local398 = Static222.aClass1_Sub16_Sub1_3.method2655();
							local194 = Static222.aClass1_Sub16_Sub1_3.method2652();
							local865 = Static222.aClass1_Sub16_Sub1_3.method2655();
							local924 = Static222.aClass1_Sub16_Sub1_3.method2655();
							if (Static183.method3311(local179)) {
								Static285.method4693(local924, true, local269, local865, local398, local194);
							}
							Static80.anInt1911 = -1;
							return true;
						} else if (Static80.anInt1911 == 13) {
							Static80.anInt1911 = -1;
							Static4.anInt139 = 0;
							return true;
						} else if (Static80.anInt1911 == 160) {
							for (local179 = 0; local179 < Static170.anIntArray601.length; local179++) {
								if (Static170.anIntArray601[local179] != Static265.anIntArray574[local179]) {
									Static170.anIntArray601[local179] = Static265.anIntArray574[local179];
									Static75.method1380(local179);
									Static252.anIntArray557[Static141.anInt3237++ & 0x1F] = local179;
								}
							}
							Static80.anInt1911 = -1;
							return true;
						} else {
							@Pc(1132) Class1_Sub12 local1132;
							if (Static80.anInt1911 == 54) {
								local179 = Static222.aClass1_Sub16_Sub1_3.method2653();
								local269 = Static222.aClass1_Sub16_Sub1_3.method2650();
								local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
								local194 = Static222.aClass1_Sub16_Sub1_3.method2616();
								if (Static183.method3311(local269)) {
									local1132 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local194);
									if (local1132 != null) {
										Static271.method4538(local1132, local398 != local1132.anInt2230);
									}
									Static189.method3383(local398, local194, local179);
								}
								Static80.anInt1911 = -1;
								return true;
							}
							@Pc(1244) int local1244;
							@Pc(1191) Class116 local1191;
							if (Static80.anInt1911 == 64) {
								local179 = Static222.aClass1_Sub16_Sub1_3.method2610();
								local269 = Static222.aClass1_Sub16_Sub1_3.method2652();
								if (local179 < -70000) {
									local269 += 32768;
								}
								if (local179 >= 0) {
									local1191 = Static115.method1897(local179);
								} else {
									local1191 = null;
								}
								if (local1191 != null) {
									for (local194 = 0; local194 < local1191.anIntArray404.length; local194++) {
										local1191.anIntArray404[local194] = 0;
										local1191.anIntArray397[local194] = 0;
									}
								}
								Static120.method2643(local269);
								local194 = Static222.aClass1_Sub16_Sub1_3.method2652();
								for (local865 = 0; local865 < local194; local865++) {
									local924 = Static222.aClass1_Sub16_Sub1_3.method2652();
									local1244 = Static222.aClass1_Sub16_Sub1_3.method2649();
									if (local1244 == 255) {
										local1244 = Static222.aClass1_Sub16_Sub1_3.method2646();
									}
									if (local1191 != null && local1191.anIntArray404.length > local865) {
										local1191.anIntArray404[local865] = local924;
										local1191.anIntArray397[local865] = local1244;
									}
									Static74.method1368(local924 - 1, local865, local269, local1244);
								}
								if (local1191 != null) {
									Static189.method3378(local1191);
								}
								Static96.method1647();
								Static80.anIntArray199[Static33.anInt864++ & 0x1F] = local269 & 0x7FFF;
								Static80.anInt1911 = -1;
								return true;
							} else if (Static80.anInt1911 == 232) {
								for (local179 = 0; local179 < Static271.aClass25_Sub1_Sub1Array1.length; local179++) {
									if (Static271.aClass25_Sub1_Sub1Array1[local179] != null) {
										Static271.aClass25_Sub1_Sub1Array1[local179].anInt1625 = -1;
									}
								}
								for (local179 = 0; local179 < Static27.aClass25_Sub1_Sub2Array1.length; local179++) {
									if (Static27.aClass25_Sub1_Sub2Array1[local179] != null) {
										Static27.aClass25_Sub1_Sub2Array1[local179].anInt1625 = -1;
									}
								}
								Static80.anInt1911 = -1;
								return true;
							} else if (Static80.anInt1911 == 24) {
								local179 = Static222.aClass1_Sub16_Sub1_3.method2613();
								if (local179 == 65535) {
									local179 = -1;
								}
								local269 = Static222.aClass1_Sub16_Sub1_3.method2659();
								local398 = Static222.aClass1_Sub16_Sub1_3.method2640();
								if (Static183.method3311(local398)) {
									Static240.method4144(local269, 1, local179, -1);
								}
								Static80.anInt1911 = -1;
								return true;
							} else if (Static80.anInt1911 == 201 || Static80.anInt1911 == 134 || Static80.anInt1911 == 53 || Static80.anInt1911 == 220 || Static80.anInt1911 == 40 || Static80.anInt1911 == 104 || Static80.anInt1911 == 75 || Static80.anInt1911 == 165 || Static80.anInt1911 == 239 || Static80.anInt1911 == 229 || Static80.anInt1911 == 60 || Static80.anInt1911 == 168 || Static80.anInt1911 == 99 || Static80.anInt1911 == 153) {
								Static157.method2912();
								Static80.anInt1911 = -1;
								return true;
							} else if (Static80.anInt1911 == 243) {
								Static59.anInt1532 = Static222.aClass1_Sub16_Sub1_3.method2652() * 30;
								Static80.anInt1915 = Static27.anInt754;
								Static80.anInt1911 = -1;
								return true;
							} else if (Static80.anInt1911 == 151) {
								Static253.anInt5514 = Static5.anInt141 / 8;
								for (local179 = 0; local179 < Static253.anInt5514; local179++) {
									Static3.aLongArray1[local179] = Static222.aClass1_Sub16_Sub1_3.method2602();
									Static271.aStringArray35[local179] = Static49.method1039(Static3.aLongArray1[local179]);
									Static56.aBooleanArray4[local179] = false;
								}
								Static254.anInt5408 = Static27.anInt754;
								Static80.anInt1911 = -1;
								return true;
							} else if (Static80.anInt1911 == 130) {
								local179 = Static222.aClass1_Sub16_Sub1_3.method2613();
								local183 = Static222.aClass1_Sub16_Sub1_3.method2611();
								local398 = Static222.aClass1_Sub16_Sub1_3.method2646();
								if (Static183.method3311(local179)) {
									Static273.method4572(local183, local398);
								}
								Static80.anInt1911 = -1;
								return true;
							} else {
								@Pc(1681) boolean local1681;
								@Pc(1851) int local1851;
								@Pc(1757) int local1757;
								if (Static80.anInt1911 == 25) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2646();
									local269 = Static222.aClass1_Sub16_Sub1_3.method2652();
									local398 = Static222.aClass1_Sub16_Sub1_3.method2650();
									local194 = Static222.aClass1_Sub16_Sub1_3.method2613();
									if (local179 >> 30 == 0) {
										@Pc(1728) Class163 local1728;
										@Pc(1702) Class139 local1702;
										@Pc(1707) Class139 local1707;
										@Pc(1754) Class163 local1754;
										@Pc(1723) Class163 local1723;
										if (local179 >> 29 != 0) {
											local865 = local179 & 0xFFFF;
											@Pc(1668) Class25_Sub1_Sub2 local1668 = Static27.aClass25_Sub1_Sub2Array1[local865];
											if (local1668 != null) {
												if (local398 == 65535) {
													local398 = -1;
												}
												local1681 = true;
												if (local398 != -1 && local1668.anInt1669 != -1) {
													if (local1668.anInt1669 == local398) {
														local1702 = Static43.method942(local398);
														if (local1702.aBoolean277 && local1702.anInt5107 != -1) {
															local1754 = Static115.method1895(local1702.anInt5107);
															local1757 = local1754.anInt5911;
															if (local1757 == 1) {
																local1668.anInt1645 = 0;
																local1681 = false;
																local1668.anInt1636 = 0;
																local1668.anInt1605 = local194 + Static32.anInt809;
																local1668.anInt1671 = 1;
																local1668.anInt1616 = 0;
																Static188.method3369(local1668.anInt1604, local1754, local1668.anInt1616, local1668.anInt1635, false);
															} else if (local1757 == 2) {
																local1668.anInt1670 = 0;
																local1681 = false;
															}
														}
													} else {
														local1702 = Static43.method942(local398);
														local1707 = Static43.method942(local1668.anInt1669);
														if (local1702.anInt5107 != -1 && local1707.anInt5107 != -1) {
															local1723 = Static115.method1895(local1702.anInt5107);
															local1728 = Static115.method1895(local1707.anInt5107);
															if (local1728.anInt5905 > local1723.anInt5905) {
																local1681 = false;
															}
														}
													}
												}
												if (local1681) {
													local1668.anInt1605 = Static32.anInt809 + local194;
													local1668.anInt1645 = 0;
													local1668.anInt1616 = 0;
													local1668.anInt1669 = local398;
													if (local1668.anInt1605 > Static32.anInt809) {
														local1668.anInt1616 = -1;
													}
													local1668.anInt1660 = local269;
													local1668.anInt1671 = 1;
													if (local1668.anInt1669 != -1 && Static32.anInt809 == local1668.anInt1605) {
														local1851 = Static43.method942(local1668.anInt1669).anInt5107;
														if (local1851 != -1) {
															local1754 = Static115.method1895(local1851);
															if (local1754 != null && local1754.anIntArray587 != null) {
																Static188.method3369(local1668.anInt1604, local1754, 0, local1668.anInt1635, false);
															}
														}
													}
												}
											}
										} else if (local179 >> 28 != 0) {
											local865 = local179 & 0xFFFF;
											@Pc(1893) Class25_Sub1_Sub1 local1893;
											if (Static76.anInt5427 == local865) {
												local1893 = Static239.aClass25_Sub1_Sub1_2;
											} else {
												local1893 = Static271.aClass25_Sub1_Sub1Array1[local865];
											}
											if (local1893 != null) {
												if (local398 == 65535) {
													local398 = -1;
												}
												local1681 = true;
												if (local398 != -1 && local1893.anInt1669 != -1) {
													if (local398 == local1893.anInt1669) {
														local1702 = Static43.method942(local398);
														if (local1702.aBoolean277 && local1702.anInt5107 != -1) {
															local1754 = Static115.method1895(local1702.anInt5107);
															local1757 = local1754.anInt5911;
															if (local1757 == 1) {
																local1893.anInt1636 = 0;
																local1681 = false;
																local1893.anInt1645 = 0;
																local1893.anInt1616 = 0;
																local1893.anInt1605 = Static32.anInt809 + local194;
																local1893.anInt1671 = 1;
																Static188.method3369(local1893.anInt1604, local1754, local1893.anInt1616, local1893.anInt1635, false);
															} else if (local1757 == 2) {
																local1681 = false;
																local1893.anInt1670 = 0;
															}
														}
													} else {
														local1702 = Static43.method942(local398);
														local1707 = Static43.method942(local1893.anInt1669);
														if (local1702.anInt5107 != -1 && local1707.anInt5107 != -1) {
															local1723 = Static115.method1895(local1702.anInt5107);
															local1728 = Static115.method1895(local1707.anInt5107);
															if (local1728.anInt5905 > local1723.anInt5905) {
																local1681 = false;
															}
														}
													}
												}
												if (local1681) {
													local1893.anInt1660 = local269;
													local1893.anInt1645 = 0;
													local1893.anInt1671 = 1;
													local1893.anInt1605 = local194 + Static32.anInt809;
													local1893.anInt1669 = local398;
													local1893.anInt1616 = 0;
													if (local1893.anInt1669 == 65535) {
														local1893.anInt1669 = -1;
													}
													if (Static32.anInt809 < local1893.anInt1605) {
														local1893.anInt1616 = -1;
													}
													if (local1893.anInt1669 != -1 && Static32.anInt809 == local1893.anInt1605) {
														local1851 = Static43.method942(local1893.anInt1669).anInt5107;
														if (local1851 != -1) {
															local1754 = Static115.method1895(local1851);
															if (local1754 != null && local1754.anIntArray587 != null) {
																Static188.method3369(local1893.anInt1604, local1754, 0, local1893.anInt1635, Static239.aClass25_Sub1_Sub1_2 == local1893);
															}
														}
													}
												}
											}
										}
									} else {
										local924 = (local179 >> 14 & 0x3FFF) - Static82.anInt1972;
										local865 = local179 >> 28 & 0x3;
										local1244 = (local179 & 0x3FFF) - Static266.anInt5790;
										if (local924 >= 0 && local1244 >= 0 && local924 < 104 && local1244 < 104) {
											local924 = local924 * 128 + 64;
											local1244 = local1244 * 128 + 64;
											@Pc(1644) Class25_Sub6 local1644 = new Class25_Sub6(local398, local865, local924, local1244, Static220.method3905(local924, local1244, local865) - local269, local194, Static32.anInt809);
											Static244.aClass131_24.method3799(new Class1_Sub2_Sub22(local1644));
										}
									}
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 145) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
									local269 = Static222.aClass1_Sub16_Sub1_3.method2613();
									local398 = Static222.aClass1_Sub16_Sub1_3.method2646();
									if (Static183.method3311(local179)) {
										Static284.method4681(local269, local398);
									}
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 190) {
									Static212.method3738(Static5.anInt141, Static222.aClass1_Sub16_Sub1_3, Static43.aClass66_1);
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 77) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
									local269 = Static222.aClass1_Sub16_Sub1_3.method2663();
									Static71.method1324(local179, local269);
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 108) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2616();
									local269 = Static222.aClass1_Sub16_Sub1_3.method2616();
									local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
									if (local398 == 65535) {
										local398 = -1;
									}
									local194 = Static222.aClass1_Sub16_Sub1_3.method2650();
									local865 = Static222.aClass1_Sub16_Sub1_3.method2650();
									if (local194 == 65535) {
										local194 = -1;
									}
									if (Static183.method3311(local865)) {
										for (local924 = local194; local924 <= local398; local924++) {
											local479 = ((long) local179 << 32) + (long) local924;
											local941 = (Class1_Sub8) Static99.aClass117_7.method3438(local479);
											if (local941 != null) {
												local950 = new Class1_Sub8(local269, local941.anInt1440);
												local941.method4742();
											} else if (local924 == -1) {
												local950 = new Class1_Sub8(local269, Static115.method1897(local179).aClass1_Sub8_2.anInt1440);
											} else {
												local950 = new Class1_Sub8(local269, -1);
											}
											Static99.aClass117_7.method3445(local950, local479);
										}
									}
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 163) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
									if (local179 == 65535) {
										local179 = -1;
									}
									local269 = Static222.aClass1_Sub16_Sub1_3.method2655();
									local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
									local194 = Static222.aClass1_Sub16_Sub1_3.method2655();
									Static159.method2999(local179, local269, local194, local398);
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 41) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
									Static224.method3920(local179);
									Static80.anIntArray199[Static33.anInt864++ & 0x1F] = local179 & 0x7FFF;
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 152) {
									local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
									local269 = Static222.aClass1_Sub16_Sub1_3.method2610();
									local398 = Static222.aClass1_Sub16_Sub1_3.method2650();
									if (local398 == 65535) {
										local398 = -1;
									}
									if (Static183.method3311(local179)) {
										Static240.method4144(local269, 2, local398, -1);
									}
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 202) {
									if (Static5.anInt141 == 0) {
										Static2.aString184 = Static133.aString82;
									} else {
										Static2.aString184 = Static222.aClass1_Sub16_Sub1_3.method2611();
									}
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 184) {
									Static45.method990(true);
									Static80.anInt1911 = -1;
									return true;
								} else if (Static80.anInt1911 == 59) {
									Static113.method1834();
									Static96.method1647();
									Static80.anInt1911 = -1;
									Static141.anInt3237 += 32;
									return true;
								} else {
									@Pc(2458) String local2458;
									if (Static80.anInt1911 == 245) {
										local2458 = Static222.aClass1_Sub16_Sub1_3.method2611();
										local269 = Static222.aClass1_Sub16_Sub1_3.method2650();
										local398 = Static222.aClass1_Sub16_Sub1_3.method2640();
										if (Static183.method3311(local398)) {
											Static269.method4530(local2458, local269);
										}
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 148) {
										local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
										local269 = Static222.aClass1_Sub16_Sub1_3.method2655();
										local398 = Static222.aClass1_Sub16_Sub1_3.method2655();
										local194 = Static222.aClass1_Sub16_Sub1_3.method2652();
										local865 = Static222.aClass1_Sub16_Sub1_3.method2655();
										local924 = Static222.aClass1_Sub16_Sub1_3.method2655();
										if (Static183.method3311(local179)) {
											Static228.method4000(local194, local269, local398, local865, local924);
										}
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 83) {
										local179 = Static222.aClass1_Sub16_Sub1_3.method2648();
										local269 = Static222.aClass1_Sub16_Sub1_3.method2659();
										local398 = Static222.aClass1_Sub16_Sub1_3.method2645();
										local194 = Static222.aClass1_Sub16_Sub1_3.method2650();
										if (Static183.method3311(local194)) {
											Static207.method3673(local269, local179, local398);
										}
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 66) {
										if (Static158.aFrame2 != null) {
											Static134.method2296(false, -1, Static272.anInt5852, -1);
										}
										@Pc(2571) byte[] local2571 = new byte[Static5.anInt141];
										Static222.aClass1_Sub16_Sub1_3.method2669(local2571, Static5.anInt141);
										local183 = Static74.method1369(local2571, Static5.anInt141, 0);
										if (Static48.aFrame1 == null && (Static93.anInt2149 == 3 || !Static93.aString65.startsWith("win") || Static245.aBoolean289)) {
											Static277.method4609(local183, true);
										} else {
											Static241.aString166 = local183;
											Static107.aBoolean124 = true;
											Static178.aClass43_6 = Static43.aClass66_1.method1605(local183);
										}
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 5) {
										Static267.method2724();
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 162) {
										Static268.anInt5796 = Static222.aClass1_Sub16_Sub1_3.method2649();
										Static261.anInt5718 = Static222.aClass1_Sub16_Sub1_3.method2655();
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 159) {
										local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
										local269 = Static222.aClass1_Sub16_Sub1_3.method2610();
										if (Static183.method3311(local179)) {
											@Pc(2664) Class1_Sub12 local2664 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local269);
											if (local2664 != null) {
												Static271.method4538(local2664, true);
											}
											if (Static2.aClass116_16 != null) {
												Static189.method3378(Static2.aClass116_16);
												Static2.aClass116_16 = null;
											}
										}
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 155) {
										Static96.method1647();
										Static254.anInt5401 = Static222.aClass1_Sub16_Sub1_3.method2655();
										Static80.anInt1915 = Static27.anInt754;
										Static80.anInt1911 = -1;
										return true;
									} else if (Static80.anInt1911 == 84) {
										Static268.anInt5796 = Static222.aClass1_Sub16_Sub1_3.method2653();
										Static261.anInt5718 = Static222.aClass1_Sub16_Sub1_3.method2649();
										while (Static222.aClass1_Sub16_Sub1_3.anInt3328 < Static5.anInt141) {
											Static80.anInt1911 = Static222.aClass1_Sub16_Sub1_3.method2655();
											Static157.method2912();
										}
										Static80.anInt1911 = -1;
										return true;
									} else {
										@Pc(2747) boolean local2747;
										@Pc(2801) String local2801;
										if (Static80.anInt1911 == 72) {
											local2458 = Static222.aClass1_Sub16_Sub1_3.method2611();
											if (local2458.endsWith(":tradereq:")) {
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local469 = Static94.method4774(local183);
												local2747 = false;
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (local469 == Static3.aLongArray1[local924]) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													Static89.method1540(4, local183, Static110.aString76);
												}
											} else if (local2458.endsWith(":chalreq:")) {
												local2747 = false;
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local469 = Static94.method4774(local183);
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (local469 == Static3.aLongArray1[local924]) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													local2801 = local2458.substring(local2458.indexOf(":") + 1, local2458.length() + -9);
													Static89.method1540(8, local183, local2801);
												}
											} else if (local2458.endsWith(":assistreq:")) {
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local469 = Static94.method4774(local183);
												local2747 = false;
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (Static3.aLongArray1[local924] == local469) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													Static89.method1540(10, local183, "");
												}
											} else if (local2458.endsWith(":clan:")) {
												local183 = local2458.substring(0, local2458.indexOf(":clan:"));
												Static89.method1540(11, "", local183);
											} else if (local2458.endsWith(":trade:")) {
												local183 = local2458.substring(0, local2458.indexOf(":trade:"));
												if (Static10.anInt278 == 0) {
													Static89.method1540(12, "", local183);
												}
											} else if (local2458.endsWith(":assist:")) {
												local183 = local2458.substring(0, local2458.indexOf(":assist:"));
												if (Static10.anInt278 == 0) {
													Static89.method1540(13, "", local183);
												}
											} else if (local2458.endsWith(":duelstake:")) {
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local2747 = false;
												local469 = Static94.method4774(local183);
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (local469 == Static3.aLongArray1[local924]) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													Static89.method1540(14, local183, "");
												}
											} else if (local2458.endsWith(":duelfriend:")) {
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local469 = Static94.method4774(local183);
												local2747 = false;
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (local469 == Static3.aLongArray1[local924]) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													Static89.method1540(15, local183, "");
												}
											} else if (local2458.endsWith(":clanreq:")) {
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local469 = Static94.method4774(local183);
												local2747 = false;
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (Static3.aLongArray1[local924] == local469) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													Static89.method1540(16, local183, "");
												}
											} else if (local2458.endsWith(":allyreq:")) {
												local183 = local2458.substring(0, local2458.indexOf(":"));
												local2747 = false;
												local469 = Static94.method4774(local183);
												for (local924 = 0; local924 < Static253.anInt5514; local924++) {
													if (Static3.aLongArray1[local924] == local469) {
														local2747 = true;
														break;
													}
												}
												if (!local2747 && Static10.anInt278 == 0) {
													local2801 = local2458.substring(local2458.indexOf(":") + 1, local2458.length() + -9);
													Static89.method1540(21, local183, local2801);
												}
											} else {
												Static89.method1540(0, "", local2458);
											}
											Static80.anInt1911 = -1;
											return true;
										}
										@Pc(3403) int local3403;
										@Pc(3423) String local3423;
										if (Static80.anInt1911 == 20) {
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local194 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local2747 = true;
											if (local134 < 0L) {
												local134 &= Long.MAX_VALUE;
												local2747 = false;
											}
											local2801 = "";
											if (local398 > 0) {
												local2801 = Static222.aClass1_Sub16_Sub1_3.method2611();
											}
											@Pc(3239) String local3239 = Static173.method3185(local134);
											for (local1851 = 0; local1851 < Static180.anInt4068; local1851++) {
												if (Static286.aLongArray11[local1851] == local134) {
													if (local398 != Static233.anIntArray532[local1851]) {
														Static233.anIntArray532[local1851] = local398;
														if (local398 > 0) {
															Static89.method1540(5, "", local3239 + Static231.aString173);
														}
														if (local398 == 0) {
															Static89.method1540(5, "", local3239 + Static232.aString161);
														}
													}
													local3239 = null;
													Static84.aStringArray8[local1851] = local2801;
													Static78.anIntArray197[local1851] = local194;
													Static225.aBooleanArray21[local1851] = local2747;
													break;
												}
											}
											if (local3239 != null && Static180.anInt4068 < 200) {
												Static286.aLongArray11[Static180.anInt4068] = local134;
												Static78.aStringArray6[Static180.anInt4068] = local3239;
												Static233.anIntArray532[Static180.anInt4068] = local398;
												Static84.aStringArray8[Static180.anInt4068] = local2801;
												Static78.anIntArray197[Static180.anInt4068] = local194;
												Static225.aBooleanArray21[Static180.anInt4068] = local2747;
												Static180.anInt4068++;
											}
											Static254.anInt5408 = Static27.anInt754;
											local487 = Static180.anInt4068;
											while (local487 > 0) {
												local487--;
												@Pc(3364) boolean local3364 = true;
												for (local1757 = 0; local1757 < local487; local1757++) {
													if (Static113.anInt2454 != Static233.anIntArray532[local1757] && Static113.anInt2454 == Static233.anIntArray532[local1757 + 1] || Static233.anIntArray532[local1757] == 0 && Static233.anIntArray532[local1757 + 1] != 0) {
														local3403 = Static233.anIntArray532[local1757];
														Static233.anIntArray532[local1757] = Static233.anIntArray532[local1757 + 1];
														local3364 = false;
														Static233.anIntArray532[local1757 + 1] = local3403;
														local3423 = Static84.aStringArray8[local1757];
														Static84.aStringArray8[local1757] = Static84.aStringArray8[local1757 + 1];
														Static84.aStringArray8[local1757 + 1] = local3423;
														local575 = Static78.aStringArray6[local1757];
														Static78.aStringArray6[local1757] = Static78.aStringArray6[local1757 + 1];
														Static78.aStringArray6[local1757 + 1] = local575;
														@Pc(3459) long local3459 = Static286.aLongArray11[local1757];
														Static286.aLongArray11[local1757] = Static286.aLongArray11[local1757 + 1];
														Static286.aLongArray11[local1757 + 1] = local3459;
														@Pc(3477) int local3477 = Static78.anIntArray197[local1757];
														Static78.anIntArray197[local1757] = Static78.anIntArray197[local1757 + 1];
														Static78.anIntArray197[local1757 + 1] = local3477;
														@Pc(3495) boolean local3495 = Static225.aBooleanArray21[local1757];
														Static225.aBooleanArray21[local1757] = Static225.aBooleanArray21[local1757 + 1];
														Static225.aBooleanArray21[local1757 + 1] = local3495;
													}
												}
												if (local3364) {
													break;
												}
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 144) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2610();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (Static183.method3311(local398)) {
												Static105.method4738(local269, local179);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 176) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2655();
											if (Static222.aClass1_Sub16_Sub1_3.method2655() == 0) {
												Static136.aClass15Array1[local179] = new Class15();
											} else {
												Static222.aClass1_Sub16_Sub1_3.anInt3328--;
												Static136.aClass15Array1[local179] = new Class15(Static222.aClass1_Sub16_Sub1_3);
											}
											Static154.anInt3555 = Static27.anInt754;
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 141) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2637();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2646();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (Static183.method3311(local398)) {
												Static108.method1759(local179, local269);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 179) {
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											local469 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local474 = Static222.aClass1_Sub16_Sub1_3.method2634();
											local1244 = Static222.aClass1_Sub16_Sub1_3.method2655();
											@Pc(3648) long local3648 = local474 + (local469 << 32);
											@Pc(3650) boolean local3650 = false;
											local1851 = Static222.aClass1_Sub16_Sub1_3.method2652();
											@Pc(3656) int local3656 = 0;
											label1666: while (true) {
												if (local3656 >= 100) {
													if (local1244 <= 1) {
														for (local3656 = 0; local3656 < Static253.anInt5514; local3656++) {
															if (local134 == Static3.aLongArray1[local3656]) {
																local3650 = true;
																break label1666;
															}
														}
													}
													break;
												}
												if (Static80.aLongArray7[local3656] == local3648) {
													local3650 = true;
													break;
												}
												local3656++;
											}
											if (!local3650 && Static10.anInt278 == 0) {
												Static80.aLongArray7[Static208.anInt4634] = local3648;
												Static208.anInt4634 = (Static208.anInt4634 + 1) % 100;
												local3423 = Static81.method1454(local1851).method4528(Static222.aClass1_Sub16_Sub1_3);
												if (local1244 == 2) {
													Static120.method2661(local3423, 18, null, local1851, "<img=1>" + Static173.method3185(local134));
												} else if (local1244 == 1) {
													Static120.method2661(local3423, 18, null, local1851, "<img=0>" + Static173.method3185(local134));
												} else {
													Static120.method2661(local3423, 18, null, local1851, Static173.method3185(local134));
												}
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 114) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2663();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2653();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2655();
											Static145.anInt3477 = local179 >> 1;
											Static239.aClass25_Sub1_Sub1_2.method494(local398, local269, (local179 & 0x1) == 1);
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 87) {
											Static9.anInt272 = Static27.anInt754;
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											if (local134 == 0L) {
												Static43.aString43 = null;
												Static79.aClass1_Sub29Array1 = null;
												Static246.anInt5378 = 0;
												Static6.aString74 = null;
												Static80.anInt1911 = -1;
												return true;
											}
											local469 = Static222.aClass1_Sub16_Sub1_3.method2602();
											Static43.aString43 = Static222.method3915(local469);
											Static6.aString74 = Static222.method3915(local134);
											Static88.aByte10 = Static222.aClass1_Sub16_Sub1_3.method2633();
											local865 = Static222.aClass1_Sub16_Sub1_3.method2655();
											if (local865 == 255) {
												Static80.anInt1911 = -1;
												return true;
											}
											Static246.anInt5378 = local865;
											@Pc(3884) Class1_Sub29[] local3884 = new Class1_Sub29[100];
											for (local1244 = 0; local1244 < Static246.anInt5378; local1244++) {
												local3884[local1244] = new Class1_Sub29();
												local3884[local1244].aLong201 = Static222.aClass1_Sub16_Sub1_3.method2602();
												local3884[local1244].aString157 = Static222.method3915(local3884[local1244].aLong201);
												local3884[local1244].anInt4975 = Static222.aClass1_Sub16_Sub1_3.method2652();
												local3884[local1244].aByte21 = Static222.aClass1_Sub16_Sub1_3.method2633();
												local3884[local1244].aString156 = Static222.aClass1_Sub16_Sub1_3.method2611();
												if (local3884[local1244].aLong201 == Static31.aLong36) {
													Static48.aByte6 = local3884[local1244].aByte21;
												}
											}
											local487 = Static246.anInt5378;
											while (local487 > 0) {
												local1681 = true;
												local487--;
												for (local1757 = 0; local1757 < local487; local1757++) {
													if (local3884[local1757].aString157.compareTo(local3884[local1757 + 1].aString157) > 0) {
														@Pc(3997) Class1_Sub29 local3997 = local3884[local1757];
														local1681 = false;
														local3884[local1757] = local3884[local1757 + 1];
														local3884[local1757 + 1] = local3997;
													}
												}
												if (local1681) {
													break;
												}
											}
											Static80.anInt1911 = -1;
											Static79.aClass1_Sub29Array1 = local3884;
											return true;
										} else if (Static80.anInt1911 == 122) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2650();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2640();
											local194 = Static222.aClass1_Sub16_Sub1_3.method2610();
											if (Static183.method3311(local269)) {
												Static163.method3726(local194, (local398 << 16) + local179);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 81) {
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											local469 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local474 = Static222.aClass1_Sub16_Sub1_3.method2634();
											@Pc(4090) long local4090 = (local469 << 32) + local474;
											@Pc(4092) boolean local4092 = false;
											local1244 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local3403 = 0;
											label1623: while (true) {
												if (local3403 < 100) {
													if (local4090 != Static80.aLongArray7[local3403]) {
														local3403++;
														continue;
													}
													local4092 = true;
													break;
												}
												if (local1244 <= 1) {
													if (Static19.aBoolean25 && !Static291.aBoolean326 || Static144.aBoolean171) {
														local4092 = true;
													} else {
														for (local3403 = 0; local3403 < Static253.anInt5514; local3403++) {
															if (Static3.aLongArray1[local3403] == local134) {
																local4092 = true;
																break label1623;
															}
														}
													}
												}
												break;
											}
											if (!local4092 && Static10.anInt278 == 0) {
												Static80.aLongArray7[Static208.anInt4634] = local4090;
												Static208.anInt4634 = (Static208.anInt4634 + 1) % 100;
												@Pc(4179) String local4179 = Static168.method3970(Static199.method3573(Static167.method3095(Static222.aClass1_Sub16_Sub1_3)));
												if (local1244 == 2 || local1244 == 3) {
													Static89.method1540(7, "<img=1>" + Static173.method3185(local134), local4179);
												} else if (local1244 == 1) {
													Static89.method1540(7, "<img=0>" + Static173.method3185(local134), local4179);
												} else {
													Static89.method1540(3, Static173.method3185(local134), local4179);
												}
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 214) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2613();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
											if (Static183.method3311(local269)) {
												if (local179 == 2) {
													Static144.method2675();
												}
												Static194.anInt4389 = local398;
												Static39.method885(local398);
												Static87.method1517(false);
												Static275.method4584(Static194.anInt4389);
												for (local194 = 0; local194 < 100; local194++) {
													Static165.aBooleanArray16[local194] = true;
												}
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 238) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2646();
											local269 = local179 >> 28 & 0x3;
											local398 = local179 >> 14 & 0x3FFF;
											local194 = local179 & 0x3FFF;
											local865 = Static222.aClass1_Sub16_Sub1_3.method2640();
											if (local865 == 65535) {
												local865 = -1;
											}
											local924 = Static222.aClass1_Sub16_Sub1_3.method2663();
											local1244 = local924 >> 2;
											local398 -= Static82.anInt1972;
											local487 = Static208.anIntArray471[local1244];
											local194 -= Static266.anInt5790;
											local1851 = local924 & 0x3;
											Static102.method1682(local194, local1851, local865, local269, local487, local1244, local398);
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 82) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2640();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2646();
											if (Static183.method3311(local179)) {
												local398 = 0;
												if (Static239.aClass25_Sub1_Sub1_2.aClass147_2 != null) {
													local398 = Static239.aClass25_Sub1_Sub1_2.aClass147_2.method4164();
												}
												Static240.method4144(local269, 3, local398, -1);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 43) {
											if (Static194.anInt4389 != -1) {
												Static55.method1116(Static194.anInt4389, 0);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 27) {
											Static71.anInt1777 = Static222.aClass1_Sub16_Sub1_3.method2655();
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 52) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2610();
											@Pc(4447) Class116 local4447 = Static115.method1897(local179);
											for (local398 = 0; local398 < local4447.anIntArray404.length; local398++) {
												local4447.anIntArray404[local398] = -1;
												local4447.anIntArray404[local398] = 0;
											}
											Static189.method3378(local4447);
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 253) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2649();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2653();
											local141 = Static222.aClass1_Sub16_Sub1_3.method2611();
											local194 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (local194 == 65535) {
												local194 = -1;
											}
											if (local179 >= 1 && local179 <= 8) {
												if (local141.equalsIgnoreCase("null")) {
													local141 = null;
												}
												Static122.aStringArray13[local179 - 1] = local141;
												Static204.anIntArray465[local179 - 1] = local194;
												Static148.aBooleanArray15[local179 - 1] = local269 == 0;
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 2) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2616();
											Static71.method1324(local179, local269);
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 242) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2613();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
											local194 = Static222.aClass1_Sub16_Sub1_3.method2659();
											local865 = Static222.aClass1_Sub16_Sub1_3.method2613();
											if (Static183.method3311(local179)) {
												Static240.method4144(local194, 7, local269 << 16 | local398, local865);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 217) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2613();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2659();
											if (Static183.method3311(local179)) {
												Static88.method1531(local269, local398);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 23) {
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local2747 = false;
											if ((local134 & Long.MIN_VALUE) != 0L) {
												local2747 = true;
											}
											@Pc(4669) byte local4669 = Static222.aClass1_Sub16_Sub1_3.method2633();
											if (local2747) {
												if (Static246.anInt5378 == 0) {
													Static80.anInt1911 = -1;
													return true;
												}
												local134 &= Long.MAX_VALUE;
												for (local924 = 0; local924 < Static246.anInt5378 && (Static79.aClass1_Sub29Array1[local924].aLong201 != local134 || local398 != Static79.aClass1_Sub29Array1[local924].anInt4975); local924++) {
												}
												if (local924 < Static246.anInt5378) {
													while (local924 < Static246.anInt5378 - 1) {
														Static79.aClass1_Sub29Array1[local924] = Static79.aClass1_Sub29Array1[local924 + 1];
														local924++;
													}
													Static246.anInt5378--;
													Static79.aClass1_Sub29Array1[Static246.anInt5378] = null;
												}
											} else {
												local2801 = Static222.aClass1_Sub16_Sub1_3.method2611();
												@Pc(4679) Class1_Sub29 local4679 = new Class1_Sub29();
												local4679.aLong201 = local134;
												local4679.aString157 = Static222.method3915(local4679.aLong201);
												local4679.anInt4975 = local398;
												local4679.aString156 = local2801;
												local4679.aByte21 = local4669;
												for (local1851 = Static246.anInt5378 - 1; local1851 >= 0; local1851--) {
													local487 = Static79.aClass1_Sub29Array1[local1851].aString157.compareTo(local4679.aString157);
													if (local487 == 0) {
														Static79.aClass1_Sub29Array1[local1851].anInt4975 = local398;
														Static79.aClass1_Sub29Array1[local1851].aByte21 = local4669;
														Static79.aClass1_Sub29Array1[local1851].aString156 = local2801;
														Static80.anInt1911 = -1;
														if (local134 == Static31.aLong36) {
															Static48.aByte6 = local4669;
														}
														Static9.anInt272 = Static27.anInt754;
														return true;
													}
													if (local487 < 0) {
														break;
													}
												}
												if (Static79.aClass1_Sub29Array1.length <= Static246.anInt5378) {
													Static80.anInt1911 = -1;
													return true;
												}
												for (local487 = Static246.anInt5378 - 1; local487 > local1851; local487--) {
													Static79.aClass1_Sub29Array1[local487 + 1] = Static79.aClass1_Sub29Array1[local487];
												}
												if (Static246.anInt5378 == 0) {
													Static79.aClass1_Sub29Array1 = new Class1_Sub29[100];
												}
												Static79.aClass1_Sub29Array1[local1851 + 1] = local4679;
												if (local134 == Static31.aLong36) {
													Static48.aByte6 = local4669;
												}
												Static246.anInt5378++;
											}
											Static80.anInt1911 = -1;
											Static9.anInt272 = Static27.anInt754;
											return true;
										} else if (Static80.anInt1911 == 101) {
											Static45.method990(false);
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 3) {
											Static96.method1647();
											local179 = Static222.aClass1_Sub16_Sub1_3.method2610();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2663();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2649();
											Static25.anIntArray53[local269] = local179;
											Static291.anIntArray607[local269] = local398;
											Static240.anIntArray544[local269] = 1;
											for (local194 = 0; local194 < 98; local194++) {
												if (local179 >= Class85_Sub1.anIntArray295[local194]) {
													Static240.anIntArray544[local269] = local194 + 2;
												}
											}
											Static26.anIntArray72[Static140.anInt3211++ & 0x1F] = local269;
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 231) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2610();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (local179 < -70000) {
												local269 += 32768;
											}
											if (local179 < 0) {
												local1191 = null;
											} else {
												local1191 = Static115.method1897(local179);
											}
											while (Static5.anInt141 > Static222.aClass1_Sub16_Sub1_3.anInt3328) {
												local194 = Static222.aClass1_Sub16_Sub1_3.method2618();
												local865 = Static222.aClass1_Sub16_Sub1_3.method2652();
												local924 = 0;
												if (local865 != 0) {
													local924 = Static222.aClass1_Sub16_Sub1_3.method2655();
													if (local924 == 255) {
														local924 = Static222.aClass1_Sub16_Sub1_3.method2610();
													}
												}
												if (local1191 != null && local194 >= 0 && local1191.anIntArray404.length > local194) {
													local1191.anIntArray404[local194] = local865;
													local1191.anIntArray397[local194] = local924;
												}
												Static74.method1368(local865 - 1, local194, local269, local924);
											}
											if (local1191 != null) {
												Static189.method3378(local1191);
											}
											Static96.method1647();
											Static80.anIntArray199[Static33.anInt864++ & 0x1F] = local269 & 0x7FFF;
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 246) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (Static183.method3311(local179)) {
												Static299.method4855();
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 80) {
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											Static222.aClass1_Sub16_Sub1_3.method2633();
											local469 = Static222.aClass1_Sub16_Sub1_3.method2602();
											local474 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local479 = Static222.aClass1_Sub16_Sub1_3.method2634();
											@Pc(5138) boolean local5138 = false;
											local487 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local1757 = Static222.aClass1_Sub16_Sub1_3.method2652();
											@Pc(5152) long local5152 = local479 + (local474 << 32);
											@Pc(5154) int local5154 = 0;
											label1587: while (true) {
												if (local5154 < 100) {
													if (local5152 != Static80.aLongArray7[local5154]) {
														local5154++;
														continue;
													}
													local5138 = true;
													break;
												}
												if (local487 <= 1) {
													for (local5154 = 0; local5154 < Static253.anInt5514; local5154++) {
														if (Static3.aLongArray1[local5154] == local134) {
															local5138 = true;
															break label1587;
														}
													}
												}
												break;
											}
											if (!local5138 && Static10.anInt278 == 0) {
												Static80.aLongArray7[Static208.anInt4634] = local5152;
												Static208.anInt4634 = (Static208.anInt4634 + 1) % 100;
												@Pc(5222) String local5222 = Static81.method1454(local1757).method4528(Static222.aClass1_Sub16_Sub1_3);
												if (local487 == 2 || local487 == 3) {
													Static120.method2661(local5222, 20, Static173.method3185(local469), local1757, "<img=1>" + Static173.method3185(local134));
												} else if (local487 == 1) {
													Static120.method2661(local5222, 20, Static173.method3185(local469), local1757, "<img=0>" + Static173.method3185(local134));
												} else {
													Static120.method2661(local5222, 20, Static173.method3185(local469), local1757, Static173.method3185(local134));
												}
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 105) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local269 = local179 >> 5;
											local398 = local179 & 0x1F;
											if (local398 == 0) {
												Static129.aClass81Array1[local269] = null;
												Static80.anInt1911 = -1;
												return true;
											}
											@Pc(5325) Class81 local5325 = new Class81();
											local5325.anInt3022 = local398;
											local5325.anInt3011 = Static222.aClass1_Sub16_Sub1_3.method2655();
											if (local5325.anInt3011 >= 0 && Static215.aClass1_Sub2_Sub14Array15.length > local5325.anInt3011) {
												if (local5325.anInt3022 == 1 || local5325.anInt3022 == 10) {
													local5325.anInt3010 = Static222.aClass1_Sub16_Sub1_3.method2652();
													Static222.aClass1_Sub16_Sub1_3.anInt3328 += 5;
												} else if (local5325.anInt3022 >= 2 && local5325.anInt3022 <= 6) {
													if (local5325.anInt3022 == 2) {
														local5325.anInt3007 = 64;
														local5325.anInt3006 = 64;
													}
													if (local5325.anInt3022 == 3) {
														local5325.anInt3007 = 64;
														local5325.anInt3006 = 0;
													}
													if (local5325.anInt3022 == 4) {
														local5325.anInt3006 = 128;
														local5325.anInt3007 = 64;
													}
													if (local5325.anInt3022 == 5) {
														local5325.anInt3007 = 0;
														local5325.anInt3006 = 64;
													}
													if (local5325.anInt3022 == 6) {
														local5325.anInt3006 = 64;
														local5325.anInt3007 = 128;
													}
													local5325.anInt3022 = 2;
													local5325.anInt3020 = Static222.aClass1_Sub16_Sub1_3.method2652();
													local5325.anInt3012 = Static222.aClass1_Sub16_Sub1_3.method2652();
													local5325.anInt3013 = Static222.aClass1_Sub16_Sub1_3.method2655();
													local5325.anInt3009 = Static222.aClass1_Sub16_Sub1_3.method2652();
												}
												local5325.anInt3017 = Static222.aClass1_Sub16_Sub1_3.method2652();
												if (local5325.anInt3017 == 65535) {
													local5325.anInt3017 = -1;
												}
												Static129.aClass81Array1[local269] = local5325;
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 131) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2640();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2613();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2613();
											if (Static183.method3311(local179)) {
												Static247.method4248(local269, local398);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 89) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local194 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local865 = Static222.aClass1_Sub16_Sub1_3.method2655();
											local924 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (Static183.method3311(local179)) {
												Static233.aBooleanArray22[local269] = true;
												Static188.anIntArray377[local269] = local398;
												Static255.anIntArray559[local269] = local194;
												Static183.anIntArray367[local269] = local865;
												Static261.anIntArray568[local269] = local924;
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 70) {
											Static96.method1647();
											Static202.anInt4505 = Static222.aClass1_Sub16_Sub1_3.method2645();
											Static80.anInt1915 = Static27.anInt754;
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 30) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2652();
											if (Static183.method3311(local179)) {
												Static112.method1807();
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 187) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2650();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2640();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2663();
											@Pc(5639) Class25_Sub1_Sub2 local5639 = Static27.aClass25_Sub1_Sub2Array1[local179];
											if (local5639 != null) {
												Static13.method290(local398, local269, local5639);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 6) {
											Static9.method217();
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 213) {
											Static222.aClass1_Sub16_Sub1_3.anInt3328 += 28;
											if (Static222.aClass1_Sub16_Sub1_3.method2635()) {
												Static38.method878(Static222.aClass1_Sub16_Sub1_3.anInt3328 - 28, Static222.aClass1_Sub16_Sub1_3);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 241) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2640();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2646();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2646();
											if (Static183.method3311(local179)) {
												@Pc(5720) Class1_Sub12 local5720 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local269);
												local1132 = (Class1_Sub12) Static147.aClass117_12.method3438((long) local398);
												if (local1132 != null) {
													Static271.method4538(local1132, local5720 == null || local1132.anInt2230 != local5720.anInt2230);
												}
												if (local5720 != null) {
													local5720.method4742();
													Static147.aClass117_12.method3445(local5720, (long) local398);
												}
												@Pc(5763) Class116 local5763 = Static115.method1897(local269);
												if (local5763 != null) {
													Static189.method3378(local5763);
												}
												local5763 = Static115.method1897(local398);
												if (local5763 != null) {
													Static189.method3378(local5763);
													Static23.method400(true, local5763);
												}
												if (Static194.anInt4389 != -1) {
													Static55.method1116(Static194.anInt4389, 1);
												}
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 45) {
											local134 = Static222.aClass1_Sub16_Sub1_3.method2602();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2652();
											@Pc(5821) String local5821 = Static81.method1454(local398).method4528(Static222.aClass1_Sub16_Sub1_3);
											Static120.method2661(local5821, 19, null, local398, Static173.method3185(local134));
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 147) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2653();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2652();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2616();
											if (Static183.method3311(local269)) {
												Static163.method3732(local179, local398);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 172) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2640();
											@Pc(5881) byte local5881 = Static222.aClass1_Sub16_Sub1_3.method2642();
											local398 = Static222.aClass1_Sub16_Sub1_3.method2650();
											if (Static183.method3311(local398)) {
												Static284.method4681(local179, local5881);
											}
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 180) {
											Static133.anInt3019 = Static222.aClass1_Sub16_Sub1_3.method2655();
											Static68.anInt1755 = Static222.aClass1_Sub16_Sub1_3.method2655();
											Static18.anInt460 = Static222.aClass1_Sub16_Sub1_3.method2655();
											Static80.anInt1911 = -1;
											return true;
										} else if (Static80.anInt1911 == 255) {
											local179 = Static222.aClass1_Sub16_Sub1_3.method2640();
											local269 = Static222.aClass1_Sub16_Sub1_3.method2659();
											Static229.method4002(local179, local269);
											Static80.anInt1911 = -1;
											return true;
										} else {
											Static217.method3829("T1 - " + Static80.anInt1911 + "," + Static254.anInt5398 + "," + Static199.anInt4491 + " - " + Static5.anInt141, null);
											Static267.method2725();
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILclient!h;JZ)V")
	public static void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class25 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class162 local6 = new Class162();
		local6.aClass25_7 = arg4;
		local6.anInt5858 = arg1 * 128 + 64;
		local6.anInt5856 = arg2 * 128 + 64;
		local6.anInt5850 = arg3;
		local6.aLong192 = arg5;
		local6.aBoolean309 = arg6;
		if (Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2] = new Class1_Sub14(arg0, arg1, arg2);
		}
		Static132.aClass1_Sub14ArrayArrayArray2[arg0][arg1][arg2].aClass162_1 = local6;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1364(@OriginalArg(0) String arg0) {
		if (Static79.aClass1_Sub29Array1 == null) {
			return;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) long local16 = Static94.method4774(arg0);
		if (local16 == 0L) {
			return;
		}
		while (local12 < Static79.aClass1_Sub29Array1.length && local16 != Static79.aClass1_Sub29Array1[local12].aLong201) {
			local12++;
		}
		if (local12 < Static79.aClass1_Sub29Array1.length && Static79.aClass1_Sub29Array1[local12] != null) {
			Static81.aClass1_Sub16_Sub1_1.method2676(172);
			Static81.aClass1_Sub16_Sub1_1.method2631(Static79.aClass1_Sub29Array1[local12].aLong201);
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(IBI)I")
	public static int method1365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >>> 31;
		return (local3 + arg1) / arg0 - local3;
	}
}
