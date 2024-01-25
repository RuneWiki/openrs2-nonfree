import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ip", name = "o", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_74 = new Class7("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[200];

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)Z")
	public static boolean method2758() throws IOException {
		if (Static82.aClass229_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static82.aClass229_1.method5208();
		if (local13 == 0) {
			return false;
		}
		@Pc(77) int local77;
		if (Static269.aClass107_139 == null) {
			if (Static7.aBoolean10) {
				local13--;
				Static82.aClass229_1.method5203(0, 1, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
				Static7.aBoolean10 = false;
				Static3.anInt107++;
			}
			Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
			if (Static206.aClass1_Sub5_Sub1_2.method308()) {
				if (local13 == 0) {
					return false;
				}
				Static82.aClass229_1.method5203(1, 1, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
				local13--;
				Static3.anInt107++;
			}
			Static7.aBoolean10 = true;
			@Pc(71) Class107[] local71 = Static381.method5669();
			local77 = Static206.aClass1_Sub5_Sub1_2.method314();
			if (local77 < 0 || local71.length <= local77) {
				throw new IOException("invo:" + local77 + " ip:" + Static206.aClass1_Sub5_Sub1_2.anInt6475);
			}
			Static269.aClass107_139 = local71[local77];
			Static167.anInt3076 = Static269.aClass107_139.anInt2908;
		}
		if (Static167.anInt3076 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static82.aClass229_1.method5203(0, 1, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
			local13--;
			Static3.anInt107++;
			Static167.anInt3076 = Static206.aClass1_Sub5_Sub1_2.aByteArray89[0] & 0xFF;
		}
		if (Static167.anInt3076 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static82.aClass229_1.method5203(0, 2, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
			Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
			local13 -= 2;
			Static167.anInt3076 = Static206.aClass1_Sub5_Sub1_2.method5362();
			Static3.anInt107 += 2;
		}
		if (local13 < Static167.anInt3076) {
			return false;
		}
		Static206.aClass1_Sub5_Sub1_2.anInt6475 = 0;
		Static82.aClass229_1.method5203(0, Static167.anInt3076, Static206.aClass1_Sub5_Sub1_2.aByteArray89);
		Static3.anInt107 += Static167.anInt3076;
		Static126.anInt2566 = 0;
		Static255.aClass107_135 = Static152.aClass107_95;
		Static152.aClass107_95 = Static358.aClass107_182;
		Static358.aClass107_182 = Static269.aClass107_139;
		@Pc(211) int local211;
		@Pc(203) int local203;
		if (Static269.aClass107_139 == Static411.aClass107_201) {
			local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
			local77 = Static206.aClass1_Sub5_Sub1_2.method5400();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5387();
			if (Static456.method6006(local77)) {
				Static442.method5828(local211, local203);
			}
			Static269.aClass107_139 = null;
			return true;
		}
		@Pc(242) int local242;
		@Pc(246) int local246;
		@Pc(275) int local275;
		@Pc(880) int local880;
		@Pc(886) int local886;
		@Pc(917) int local917;
		@Pc(331) int local331;
		@Pc(257) boolean local257;
		@Pc(296) int local296;
		@Pc(288) boolean local288;
		@Pc(442) int local442;
		if (Static269.aClass107_139 == Static35.aClass107_208) {
			local203 = Static206.aClass1_Sub5_Sub1_2.method5374();
			local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5398();
			local242 = Static206.aClass1_Sub5_Sub1_2.method5363();
			local246 = Static206.aClass1_Sub5_Sub1_2.method5407();
			local257 = (local203 & 0x80) != 0;
			if (local246 >> 30 == 0) {
				@Pc(315) Class38 local315;
				@Pc(361) Class38 local361;
				@Pc(328) Class223 local328;
				@Pc(376) Class223 local376;
				@Pc(382) Class223 local382;
				if (local246 >> 29 != 0) {
					local275 = local246 & 0xFFFF;
					@Pc(279) Class31_Sub2_Sub1_Sub2 local279 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local275];
					if (local279 != null) {
						if (local211 == 65535) {
							local211 = -1;
						}
						local288 = true;
						local296 = local257 ? local279.anInt7368 : local279.anInt7321;
						if (local211 != -1 && local296 != -1) {
							if (local211 == local296) {
								local315 = Static67.aClass263_2.method5782(local211);
								if (local315.aBoolean50 && local315.anInt1014 != -1) {
									local328 = Static293.aClass127_1.method2975(local315.anInt1014);
									local331 = local328.anInt6050;
									if (local331 == 0 || local331 == 2) {
										local288 = false;
									} else if (local331 == 1) {
										local288 = true;
									}
								}
							} else {
								local315 = Static67.aClass263_2.method5782(local211);
								local361 = Static67.aClass263_2.method5782(local296);
								if (local315.anInt1014 != -1 && local361.anInt1014 != -1) {
									local376 = Static293.aClass127_1.method2975(local315.anInt1014);
									local382 = Static293.aClass127_1.method2975(local361.anInt1014);
									if (local382.anInt6039 > local376.anInt6039) {
										local288 = false;
									}
								}
							}
						}
						if (local288) {
							if (local257) {
								local279.anInt7368 = local211;
								local279.anInt7318 = local203 & 0x7;
								local279.anInt7356 = 1;
								local279.anInt7342 = Static378.anInt4244 + local77;
								local279.anInt7315 = 0;
								local279.anInt7311 = local242;
								local279.anInt7371 = 0;
								if (Static378.anInt4244 < local279.anInt7342) {
									local279.anInt7371 = -1;
								}
								if (local279.anInt7368 != -1 && local279.anInt7342 == Static378.anInt4244) {
									local442 = Static67.aClass263_2.method5782(local279.anInt7368).anInt1014;
									if (local442 != -1) {
										local328 = Static293.aClass127_1.method2975(local442);
										if (local328 != null && local328.anIntArray557 != null) {
											method2762(local328, local279.anInt7300, false, 0, local279.aByte100, local279.anInt7298);
										}
									}
								}
							} else {
								local279.anInt7374 = local242;
								local279.anInt7357 = 0;
								local279.anInt7314 = 0;
								local279.anInt7316 = Static378.anInt4244 + local77;
								local279.anInt7307 = local203 & 0x7;
								local279.anInt7321 = local211;
								local279.anInt7367 = 1;
								if (Static378.anInt4244 < local279.anInt7316) {
									local279.anInt7357 = -1;
								}
								if (local279.anInt7321 != -1 && Static378.anInt4244 == local279.anInt7316) {
									local442 = Static67.aClass263_2.method5782(local279.anInt7321).anInt1014;
									if (local442 != -1) {
										local328 = Static293.aClass127_1.method2975(local442);
										if (local328 != null && local328.anIntArray557 != null) {
											method2762(local328, local279.anInt7300, false, 0, local279.aByte100, local279.anInt7298);
										}
									}
								}
							}
						}
					}
				} else if (local246 >> 28 != 0) {
					local275 = local246 & 0xFFFF;
					@Pc(565) Class31_Sub2_Sub1_Sub1 local565;
					if (Static102.anInt2165 == local275) {
						local565 = Static452.aClass31_Sub2_Sub1_Sub1_2;
					} else {
						local565 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local275];
					}
					if (local565 != null) {
						if (local211 == 65535) {
							local211 = -1;
						}
						local288 = true;
						local296 = local257 ? local565.anInt7368 : local565.anInt7321;
						if (local211 != -1 && local296 != -1) {
							if (local296 == local211) {
								local315 = Static67.aClass263_2.method5782(local211);
								if (local315.aBoolean50 && local315.anInt1014 != -1) {
									local328 = Static293.aClass127_1.method2975(local315.anInt1014);
									local331 = local328.anInt6050;
									if (local331 == 0 || local331 == 2) {
										local288 = false;
									} else if (local331 == 1) {
										local288 = true;
									}
								}
							} else {
								local315 = Static67.aClass263_2.method5782(local211);
								local361 = Static67.aClass263_2.method5782(local296);
								if (local315.anInt1014 != -1 && local361.anInt1014 != -1) {
									local376 = Static293.aClass127_1.method2975(local315.anInt1014);
									local382 = Static293.aClass127_1.method2975(local361.anInt1014);
									if (local382.anInt6039 > local376.anInt6039) {
										local288 = false;
									}
								}
							}
						}
						if (local288) {
							if (local257) {
								local565.anInt7318 = local203 & 0x7;
								local565.anInt7315 = 0;
								local565.anInt7356 = 1;
								local565.anInt7342 = Static378.anInt4244 + local77;
								local565.anInt7368 = local211;
								local565.anInt7311 = local242;
								local565.anInt7371 = 0;
								if (Static378.anInt4244 < local565.anInt7342) {
									local565.anInt7371 = -1;
								}
								if (local565.anInt7368 == 65535) {
									local565.anInt7368 = -1;
								}
								if (local565.anInt7368 != -1 && Static378.anInt4244 == local565.anInt7342) {
									local442 = Static67.aClass263_2.method5782(local565.anInt7368).anInt1014;
									if (local442 != -1) {
										local328 = Static293.aClass127_1.method2975(local442);
										if (local328 != null && local328.anIntArray557 != null) {
											method2762(local328, local565.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == local565, 0, local565.aByte100, local565.anInt7298);
										}
									}
								}
							} else {
								local565.anInt7316 = local77 + Static378.anInt4244;
								local565.anInt7321 = local211;
								local565.anInt7314 = 0;
								local565.anInt7357 = 0;
								local565.anInt7367 = 1;
								local565.anInt7374 = local242;
								local565.anInt7307 = local203 & 0x7;
								if (local565.anInt7321 == 65535) {
									local565.anInt7321 = -1;
								}
								if (local565.anInt7316 > Static378.anInt4244) {
									local565.anInt7357 = -1;
								}
								if (local565.anInt7321 != -1 && Static378.anInt4244 == local565.anInt7316) {
									local442 = Static67.aClass263_2.method5782(local565.anInt7321).anInt1014;
									if (local442 != -1) {
										local328 = Static293.aClass127_1.method2975(local442);
										if (local328 != null && local328.anIntArray557 != null) {
											method2762(local328, local565.anInt7300, Static452.aClass31_Sub2_Sub1_Sub1_2 == local565, 0, local565.aByte100, local565.anInt7298);
										}
									}
								}
							}
						}
					}
				}
			} else {
				local275 = local246 >> 28 & 0x3;
				local880 = (local246 >> 14 & 0x3FFF) - Static165.anInt3049;
				local886 = (local246 & 0x3FFF) - Static345.anInt5799;
				if (local880 >= 0 && local886 >= 0 && local880 < Static195.anInt3537 && local886 < Static118.anInt2419) {
					local296 = local880 * 128 + 64;
					local442 = local886 * 128 + 64;
					local917 = local275;
					if (local275 < 3 && Static87.method1622(local880, local886)) {
						local917 = local275 + 1;
					}
					@Pc(952) Class31_Sub2_Sub2 local952 = new Class31_Sub2_Sub2(local211, 0, Static378.anInt4244, local275, local917, local296, Static301.method4312(local275, local296, local442) - local242, local442, local880, local880, local886, local886, local203);
					Static64.aClass181_13.method4102(new Class1_Sub2_Sub12(local952));
				}
			}
			Static269.aClass107_139 = null;
			return true;
		} else if (Static82.aClass107_65 == Static269.aClass107_139) {
			local203 = Static206.aClass1_Sub5_Sub1_2.method5387();
			local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
			if (Static456.method6006(local77)) {
				Static309.method4392(local203, 5, Static102.anInt2165, 0);
			}
			Static269.aClass107_139 = null;
			return true;
		} else if (Static342.aClass107_171 == Static269.aClass107_139) {
			Static232.anInt4212 = Static206.aClass1_Sub5_Sub1_2.method5411();
			Static395.anInt6348 = Static206.aClass1_Sub5_Sub1_2.method5416() << 3;
			Static359.anInt5924 = Static206.aClass1_Sub5_Sub1_2.method5416() << 3;
			for (@Pc(1012) Class1_Sub25 local1012 = (Class1_Sub25) Static129.aClass96_24.method2342(); local1012 != null; local1012 = (Class1_Sub25) Static129.aClass96_24.method2339()) {
				local77 = (int) (local1012.aLong222 & 0x3FFFL);
				local211 = (int) (local1012.aLong222 >> 14 & 0x3FFFL);
				local242 = (int) (local1012.aLong222 >> 28 & 0x3L);
				if (local242 == Static232.anInt4212 && local77 >= Static359.anInt5924 && local77 < Static359.anInt5924 + 8 && local211 >= Static395.anInt6348 && local211 < Static395.anInt6348 + 8) {
					local1012.method6020();
					Static150.method2455(local211, Static232.anInt4212, local77);
				}
			}
			for (@Pc(1087) Class1_Sub42 local1087 = (Class1_Sub42) Static16.aClass181_4.method4112(); local1087 != null; local1087 = (Class1_Sub42) Static16.aClass181_4.method4104()) {
				if (Static359.anInt5924 <= local1087.anInt6560 && Static359.anInt5924 + 8 > local1087.anInt6560 && Static395.anInt6348 <= local1087.anInt6557 && Static395.anInt6348 + 8 > local1087.anInt6557 && local1087.anInt6553 == Static232.anInt4212) {
					local1087.anInt6551 = 0;
				}
			}
			Static269.aClass107_139 = null;
			return true;
		} else if (Static269.aClass107_139 == Static21.aClass107_20) {
			local203 = Static206.aClass1_Sub5_Sub1_2.method5398();
			local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
			local211 = Static206.aClass1_Sub5_Sub1_2.method5407();
			local242 = Static206.aClass1_Sub5_Sub1_2.method5387();
			if (Static456.method6006(local203)) {
				Static309.method4392(local211, 5, local77, local242);
			}
			Static269.aClass107_139 = null;
			return true;
		} else {
			@Pc(1185) String local1185;
			@Pc(1179) String local1179;
			if (Static269.aClass107_139 == Static360.aClass107_184) {
				local1179 = Static206.aClass1_Sub5_Sub1_2.method5401();
				local1185 = Static200.method3250(Static303.method4357(Static206.aClass1_Sub5_Sub1_2));
				Static378.method3527(local1185, 0, local1179, local1179, 6);
				Static269.aClass107_139 = null;
				return true;
			} else if (Static269.aClass107_139 == Static127.aClass107_84) {
				local203 = Static206.aClass1_Sub5_Sub1_2.method5411();
				local77 = Static206.aClass1_Sub5_Sub1_2.method5374();
				local211 = Static206.aClass1_Sub5_Sub1_2.method5363();
				if (local211 == 65535) {
					local211 = -1;
				}
				Static267.method3939(local203, local77, local211);
				Static269.aClass107_139 = null;
				return true;
			} else if (Static269.aClass107_139 == Static30.aClass107_25) {
				local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
				if (local203 == 65535) {
					local203 = -1;
				}
				local77 = Static206.aClass1_Sub5_Sub1_2.method5404();
				local211 = Static206.aClass1_Sub5_Sub1_2.method5366();
				Static344.method4826(local211, local77, local203);
				Static269.aClass107_139 = null;
				return true;
			} else {
				@Pc(1286) Class1_Sub23 local1286;
				if (Static269.aClass107_139 == Static156.aClass107_98) {
					local203 = Static206.aClass1_Sub5_Sub1_2.method5398();
					local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
					local211 = Static206.aClass1_Sub5_Sub1_2.method5407();
					local242 = Static206.aClass1_Sub5_Sub1_2.method5374();
					if (Static456.method6006(local77)) {
						local1286 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local211);
						if (local1286 != null) {
							Static441.method5820(false, local203 != local1286.anInt3059, local1286);
						}
						Static80.method1566(local203, local242, false, local211);
					}
					Static269.aClass107_139 = null;
					return true;
				} else if (Static269.aClass107_139 == Static215.aClass107_122) {
					Static343.aClass186_24 = Static413.method5637(Static206.aClass1_Sub5_Sub1_2.method5366());
					Static269.aClass107_139 = null;
					return true;
				} else if (Static361.aClass107_185 == Static269.aClass107_139) {
					Static186.method2933(Static378.aClass237_10);
					Static269.aClass107_139 = null;
					return true;
				} else if (Static443.aClass107_210 == Static269.aClass107_139) {
					local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
					local77 = Static206.aClass1_Sub5_Sub1_2.method5387();
					local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
					local242 = Static206.aClass1_Sub5_Sub1_2.method5400();
					if (Static456.method6006(local211)) {
						Static12.method350(local77, local203 + (local242 << 16));
					}
					Static269.aClass107_139 = null;
					return true;
				} else if (Static17.aClass107_17 == Static269.aClass107_139) {
					Static359.anInt5924 = Static206.aClass1_Sub5_Sub1_2.method5354() << 3;
					Static395.anInt6348 = Static206.aClass1_Sub5_Sub1_2.method5354() << 3;
					Static232.anInt4212 = Static206.aClass1_Sub5_Sub1_2.method5374();
					Static269.aClass107_139 = null;
					return true;
				} else {
					@Pc(1418) String local1418;
					if (Static283.aClass107_144 == Static269.aClass107_139) {
						local203 = Static206.aClass1_Sub5_Sub1_2.method5400();
						local77 = Static206.aClass1_Sub5_Sub1_2.method5387();
						local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
						if (Static456.method6006(local203)) {
							Static406.method5441(local77, local1418);
						}
						Static269.aClass107_139 = null;
						return true;
					} else if (Static221.aClass107_89 == Static269.aClass107_139) {
						local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
						local77 = Static206.aClass1_Sub5_Sub1_2.method5407();
						if (Static456.method6006(local203)) {
							@Pc(1456) Class1_Sub23 local1456 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local77);
							if (local1456 != null) {
								Static441.method5820(false, true, local1456);
							}
							if (Static182.aClass251_6 != null) {
								Static408.method5469(Static182.aClass251_6);
								Static182.aClass251_6 = null;
							}
						}
						Static269.aClass107_139 = null;
						return true;
					} else {
						@Pc(1510) int local1510;
						@Pc(1498) boolean local1498;
						if (Static192.aClass107_117 == Static269.aClass107_139) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
							local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
							local1498 = (local77 & 0x1) == 1;
							while (Static167.anInt3076 > Static206.aClass1_Sub5_Sub1_2.anInt6475) {
								local242 = Static206.aClass1_Sub5_Sub1_2.method5361();
								local246 = Static206.aClass1_Sub5_Sub1_2.method5362();
								local1510 = 0;
								if (local246 != 0) {
									local1510 = Static206.aClass1_Sub5_Sub1_2.method5366();
									if (local1510 == 255) {
										local1510 = Static206.aClass1_Sub5_Sub1_2.method5407();
									}
								}
								Static375.method5103(local246 - 1, local1510, local242, local1498, local203);
							}
							Static70.anIntArray112[Static422.anInt6829++ & 0x1F] = local203;
							Static269.aClass107_139 = null;
							return true;
						} else if (Static269.aClass107_139 == Static421.aClass107_71) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
							local77 = Static206.aClass1_Sub5_Sub1_2.method5362();
							local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
							local242 = Static206.aClass1_Sub5_Sub1_2.method5362();
							if (Static456.method6006(local203) && Static437.aClass251ArrayArray2[local77] != null) {
								for (local246 = local211; local246 < local242; local246++) {
									local1510 = Static206.aClass1_Sub5_Sub1_2.method5399();
									if (local246 < Static437.aClass251ArrayArray2[local77].length && Static437.aClass251ArrayArray2[local77][local246] != null) {
										Static437.aClass251ArrayArray2[local77][local246].anInt6681 = local1510;
									}
								}
							}
							Static269.aClass107_139 = null;
							return true;
						} else if (Static115.aClass107_77 == Static269.aClass107_139) {
							Static24.anInt568 = Static206.aClass1_Sub5_Sub1_2.method5380();
							Static269.aClass107_139 = null;
							Static433.anInt7017 = Static319.anInt4221;
							return true;
						} else if (Static56.aClass107_49 == Static269.aClass107_139) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
							local77 = Static206.aClass1_Sub5_Sub1_2.method5395();
							if (Static456.method6006(local203)) {
								Static309.method4392(local77, 3, -1, -1);
							}
							Static269.aClass107_139 = null;
							return true;
						} else if (Static70.aClass107_57 == Static269.aClass107_139) {
							Static232.anInt4212 = Static206.aClass1_Sub5_Sub1_2.method5411();
							Static359.anInt5924 = Static206.aClass1_Sub5_Sub1_2.method5416() << 3;
							Static395.anInt6348 = Static206.aClass1_Sub5_Sub1_2.method5414() << 3;
							while (Static167.anInt3076 > Static206.aClass1_Sub5_Sub1_2.anInt6475) {
								@Pc(1684) Class237 local1684 = Static92.method1686()[Static206.aClass1_Sub5_Sub1_2.method5366()];
								Static186.method2933(local1684);
							}
							Static269.aClass107_139 = null;
							return true;
						} else if (Static269.aClass107_139 == Static130.aClass107_85) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
							local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
							local211 = Static206.aClass1_Sub5_Sub1_2.method5366();
							local242 = Static206.aClass1_Sub5_Sub1_2.method5362() << 0;
							local246 = Static206.aClass1_Sub5_Sub1_2.method5366();
							local1510 = Static206.aClass1_Sub5_Sub1_2.method5366();
							if (Static456.method6006(local203)) {
								Static330.method4697(local242, local211, local246, local1510, local77, true);
							}
							Static269.aClass107_139 = null;
							return true;
						} else if (Static269.aClass107_139 == Static221.aClass107_88) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5383();
							local77 = Static206.aClass1_Sub5_Sub1_2.method5411();
							if (local203 == 255) {
								local203 = -1;
								local77 = -1;
							}
							Static173.method2783(local203, local77);
							Static269.aClass107_139 = null;
							return true;
						} else if (Static84.aClass107_66 == Static269.aClass107_139) {
							Static186.method2933(Static432.aClass237_20);
							Static269.aClass107_139 = null;
							return true;
						} else if (Static163.aClass107_101 == Static269.aClass107_139) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
							if (Static456.method6006(local203)) {
								Static153.method2509();
							}
							Static269.aClass107_139 = null;
							return true;
						} else if (Static88.aClass107_67 == Static269.aClass107_139) {
							local203 = Static206.aClass1_Sub5_Sub1_2.method5411();
							local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
							local1498 = (local203 & 0x1) == 1;
							Static234.method3525(local77, local1498);
							Static70.anIntArray112[Static422.anInt6829++ & 0x1F] = local77;
							Static269.aClass107_139 = null;
							return true;
						} else if (Static410.aClass107_200 == Static269.aClass107_139) {
							Static186.method2933(Static193.aClass237_9);
							Static269.aClass107_139 = null;
							return true;
						} else {
							@Pc(1905) String local1905;
							@Pc(1876) String local1876;
							@Pc(1878) String local1878;
							if (Static269.aClass107_139 == Static445.aClass107_212) {
								local203 = Static206.aClass1_Sub5_Sub1_2.method5361();
								local77 = Static206.aClass1_Sub5_Sub1_2.method5407();
								local211 = Static206.aClass1_Sub5_Sub1_2.method5366();
								local1876 = "";
								local1878 = local1876;
								if ((local211 & 0x1) != 0) {
									local1876 = Static206.aClass1_Sub5_Sub1_2.method5401();
									if ((local211 & 0x2) == 0) {
										local1878 = local1876;
									} else {
										local1878 = Static206.aClass1_Sub5_Sub1_2.method5401();
									}
								}
								local1905 = Static206.aClass1_Sub5_Sub1_2.method5401();
								if (local203 == 99) {
									Static164.method2645(local1905);
								} else if (local1878.equals("") || !Static343.method5736(local1878)) {
									Static378.method3527(local1905, local77, local1878, local1876, local203);
								} else {
									Static269.aClass107_139 = null;
									return true;
								}
								Static269.aClass107_139 = null;
								return true;
							} else if (Static269.aClass107_139 == Static158.aClass107_99) {
								Static425.anInt6874 = Static206.aClass1_Sub5_Sub1_2.method5362() * 30;
								Static433.anInt7017 = Static319.anInt4221;
								Static269.aClass107_139 = null;
								return true;
							} else if (Static269.aClass107_139 == Static263.aClass107_137) {
								local203 = Static206.aClass1_Sub5_Sub1_2.method5398();
								if (local203 == 65535) {
									local203 = -1;
								}
								local77 = Static206.aClass1_Sub5_Sub1_2.method5400();
								local211 = Static206.aClass1_Sub5_Sub1_2.method5369();
								if (Static456.method6006(local77)) {
									Static309.method4392(local211, 2, local203, -1);
								}
								Static269.aClass107_139 = null;
								return true;
							} else if (Static214.aClass107_154 == Static269.aClass107_139) {
								Static186.method2933(Static386.aClass237_14);
								Static269.aClass107_139 = null;
								return true;
							} else {
								@Pc(2023) boolean local2023;
								@Pc(2044) long local2044;
								@Pc(2039) long local2039;
								@Pc(2049) long local2049;
								if (Static14.aClass107_12 == Static269.aClass107_139) {
									local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
									local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
									local1418 = local1185;
									if (local2023) {
										local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
									}
									local2039 = Static206.aClass1_Sub5_Sub1_2.method5371();
									local2044 = Static206.aClass1_Sub5_Sub1_2.method5362();
									local2049 = Static206.aClass1_Sub5_Sub1_2.method5399();
									local296 = Static206.aClass1_Sub5_Sub1_2.method5366();
									local442 = Static206.aClass1_Sub5_Sub1_2.method5362();
									@Pc(2063) long local2063 = (local2044 << 32) + local2049;
									@Pc(2065) boolean local2065 = false;
									@Pc(2067) int local2067 = 0;
									while (true) {
										if (local2067 >= 100) {
											if (local296 <= 1 && Static343.method5736(local1418)) {
												local2065 = true;
											}
											break;
										}
										if (Static298.aLongArray8[local2067] == local2063) {
											local2065 = true;
											break;
										}
										local2067++;
									}
									if (!local2065 && Static452.anInt7259 == 0) {
										Static298.aLongArray8[Static291.anInt5088] = local2063;
										Static291.anInt5088 = (Static291.anInt5088 + 1) % 100;
										@Pc(2118) String local2118 = Static189.aClass156_1.method3582(local442).method5152(Static206.aClass1_Sub5_Sub1_2);
										if (local296 == 2) {
											Static452.method5933("<img=1>" + local1418, "<img=1>" + local1185, local2118, 20, Static235.method3561(local2039), local442, 0);
										} else if (local296 == 1) {
											Static452.method5933("<img=0>" + local1418, "<img=0>" + local1185, local2118, 20, Static235.method3561(local2039), local442, 0);
										} else {
											Static452.method5933(local1418, local1185, local2118, 20, Static235.method3561(local2039), local442, 0);
										}
									}
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static152.aClass107_94) {
									local203 = Static206.aClass1_Sub5_Sub1_2.method5366();
									if (Static206.aClass1_Sub5_Sub1_2.method5366() == 0) {
										Static61.aClass2Array1[local203] = new Class2();
									} else {
										Static206.aClass1_Sub5_Sub1_2.anInt6475--;
										Static61.aClass2Array1[local203] = new Class2(Static206.aClass1_Sub5_Sub1_2);
									}
									Static349.anInt5828 = Static319.anInt4221;
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static270.aClass107_140) {
									Static186.method2933(Static55.aClass237_19);
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static80.aClass107_64) {
									Static149.anInt6409 = Static206.aClass1_Sub5_Sub1_2.method5366();
									Static433.anInt7017 = Static319.anInt4221;
									Static269.aClass107_139 = null;
									return true;
								} else if (Static299.aClass107_27 == Static269.aClass107_139) {
									Static186.method2933(Static416.aClass237_16);
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static248.aClass107_132) {
									if (Static373.aFrame5 != null) {
										Static448.method5876(Static38.aClass135_Sub1_1.anInt5090, -1, -1, false);
									}
									@Pc(2286) byte[] local2286 = new byte[Static167.anInt3076];
									Static206.aClass1_Sub5_Sub1_2.method310(local2286, Static167.anInt3076);
									local1185 = Static98.method1759(0, Static167.anInt3076, local2286);
									Static307.method4372(Static143.anInt2766 == 1, Static77.aClass180_1, true, local1185);
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static438.aClass107_207) {
									local203 = Static206.aClass1_Sub5_Sub1_2.method5369();
									local77 = Static206.aClass1_Sub5_Sub1_2.method5400();
									local211 = Static206.aClass1_Sub5_Sub1_2.method5363();
									if (Static456.method6006(local77)) {
										Static290.method4211(local203, local211);
									}
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static104.aClass107_217) {
									local203 = Static206.aClass1_Sub5_Sub1_2.method5407();
									local77 = Static206.aClass1_Sub5_Sub1_2.method5411();
									local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
									if (Static456.method6006(local211)) {
										Static351.method4861(local203, local77);
									}
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static10.aClass107_10) {
									local203 = Static206.aClass1_Sub5_Sub1_2.method5395();
									local77 = Static206.aClass1_Sub5_Sub1_2.method5383();
									local211 = Static206.aClass1_Sub5_Sub1_2.method5383();
									Static207.anIntArray327[local211] = local203;
									Static422.anIntArray614[local211] = local77;
									Static210.anIntArray330[local211] = 1;
									local242 = Static347.anIntArray537[local211] - 1;
									for (local246 = 0; local246 < local242; local246++) {
										if (local203 >= Class46.anIntArray105[local246]) {
											Static210.anIntArray330[local211] = local246 + 2;
										}
									}
									Static22.anIntArray44[Static248.anInt4545++ & 0x1F] = local211;
									Static269.aClass107_139 = null;
									return true;
								} else if (Static115.aClass107_76 == Static269.aClass107_139) {
									local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
									local77 = Static206.aClass1_Sub5_Sub1_2.method5411();
									local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
									if (Static456.method6006(local203)) {
										if (local77 == 2) {
											Static97.method1735();
										}
										Static407.anInt6564 = local211;
										Static433.method5754(local211);
										Static292.method4245(false);
										Static13.method362(Static407.anInt6564);
										for (local242 = 0; local242 < 100; local242++) {
											Static71.aBooleanArray25[local242] = true;
										}
									}
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static121.aClass107_79) {
									Static105.method1872(true);
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static37.aClass107_31) {
									if (Static407.anInt6564 != -1) {
										Static204.method5978(Static407.anInt6564, 0);
									}
									Static269.aClass107_139 = null;
									return true;
								} else if (Static269.aClass107_139 == Static7.aClass107_8) {
									Static394.aClass23_1.method601();
									Static269.aClass107_139 = null;
									Static183.anInt3335 += 32;
									return true;
								} else if (Static269.aClass107_139 == Static42.aClass107_34) {
									local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
									local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
									local1418 = local1185;
									if (local2023) {
										local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
									}
									local2039 = Static206.aClass1_Sub5_Sub1_2.method5371();
									local2044 = Static206.aClass1_Sub5_Sub1_2.method5362();
									local2049 = Static206.aClass1_Sub5_Sub1_2.method5399();
									local296 = Static206.aClass1_Sub5_Sub1_2.method5366();
									@Pc(2597) long local2597 = (local2044 << 32) + local2049;
									@Pc(2599) boolean local2599 = false;
									@Pc(2601) int local2601 = 0;
									while (true) {
										if (local2601 >= 100) {
											if (local296 <= 1) {
												if (Static47.aBoolean48 && !Static217.aBoolean286 || Static139.aBoolean166) {
													local2599 = true;
												} else if (Static343.method5736(local1418)) {
													local2599 = true;
												}
											}
											break;
										}
										if (local2597 == Static298.aLongArray8[local2601]) {
											local2599 = true;
											break;
										}
										local2601++;
									}
									if (!local2599 && Static452.anInt7259 == 0) {
										Static298.aLongArray8[Static291.anInt5088] = local2597;
										Static291.anInt5088 = (Static291.anInt5088 + 1) % 100;
										@Pc(2667) String local2667 = Static200.method3250(Static303.method4357(Static206.aClass1_Sub5_Sub1_2));
										if (local296 == 2 || local296 == 3) {
											Static452.method5933("<img=1>" + local1418, "<img=1>" + local1185, local2667, 9, Static235.method3561(local2039), -1, 0);
										} else if (local296 == 1) {
											Static452.method5933("<img=0>" + local1418, "<img=0>" + local1185, local2667, 9, Static235.method3561(local2039), -1, 0);
										} else {
											Static452.method5933(local1418, local1185, local2667, 9, Static235.method3561(local2039), -1, 0);
										}
									}
									Static269.aClass107_139 = null;
									return true;
								} else {
									@Pc(2862) String local2862;
									@Pc(2866) Class154 local2866;
									if (Static358.aClass107_181 == Static269.aClass107_139) {
										local1179 = Static206.aClass1_Sub5_Sub1_2.method5401();
										local1498 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
										if (local1498) {
											local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
										} else {
											local1185 = local1179;
										}
										local242 = Static206.aClass1_Sub5_Sub1_2.method5362();
										@Pc(2781) byte local2781 = Static206.aClass1_Sub5_Sub1_2.method5416();
										local257 = false;
										if (local2781 == -128) {
											local257 = true;
										}
										if (local257) {
											if (Static266.anInt6939 == 0) {
												Static269.aClass107_139 = null;
												return true;
											}
											for (local275 = 0; local275 < Static266.anInt6939 && (!Static118.aClass154Array1[local275].aString36.equals(local1185) || Static118.aClass154Array1[local275].anInt4214 != local242); local275++) {
											}
											if (local275 < Static266.anInt6939) {
												while (local275 < Static266.anInt6939 - 1) {
													Static118.aClass154Array1[local275] = Static118.aClass154Array1[local275 + 1];
													local275++;
												}
												Static266.anInt6939--;
												Static118.aClass154Array1[Static266.anInt6939] = null;
											}
										} else {
											local2862 = Static206.aClass1_Sub5_Sub1_2.method5401();
											local2866 = new Class154();
											local2866.aString35 = local1179;
											local2866.aString36 = local1185;
											local2866.aString37 = Static459.method4507(local2866.aString36);
											local2866.aByte73 = local2781;
											local2866.aString38 = local2862;
											local2866.anInt4214 = local242;
											for (local886 = Static266.anInt6939 - 1; local886 >= 0; local886--) {
												local296 = Static118.aClass154Array1[local886].aString37.compareTo(local2866.aString37);
												if (local296 == 0) {
													Static118.aClass154Array1[local886].anInt4214 = local242;
													Static118.aClass154Array1[local886].aByte73 = local2781;
													Static118.aClass154Array1[local886].aString38 = local2862;
													if (local1185.equals(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10)) {
														Static215.aByte71 = local2781;
													}
													Static269.aClass107_139 = null;
													Static152.anInt2903 = Static319.anInt4221;
													return true;
												}
												if (local296 < 0) {
													break;
												}
											}
											if (Static266.anInt6939 >= Static118.aClass154Array1.length) {
												Static269.aClass107_139 = null;
												return true;
											}
											for (local296 = Static266.anInt6939 - 1; local296 > local886; local296--) {
												Static118.aClass154Array1[local296 + 1] = Static118.aClass154Array1[local296];
											}
											if (Static266.anInt6939 == 0) {
												Static118.aClass154Array1 = new Class154[100];
											}
											Static118.aClass154Array1[local886 + 1] = local2866;
											Static266.anInt6939++;
											if (local1185.equals(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10)) {
												Static215.aByte71 = local2781;
											}
										}
										Static269.aClass107_139 = null;
										Static152.anInt2903 = Static319.anInt4221;
										return true;
									} else if (Static336.aClass107_166 == Static269.aClass107_139) {
										Static186.method2933(Static240.aClass237_11);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static450.aClass107_214) {
										Static186.method2933(Static8.aClass237_1);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static363.aClass107_116 == Static269.aClass107_139) {
										Static186.method2933(Static118.aClass237_7);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static243.aClass107_129 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5400();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
										local211 = Static206.aClass1_Sub5_Sub1_2.method5387();
										if (Static456.method6006(local77)) {
											Static403.method5425(local211, local203);
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static60.aClass107_51 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
										if (local203 == 65535) {
											local203 = -1;
										}
										local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
										local211 = Static206.aClass1_Sub5_Sub1_2.method5407();
										if (Static456.method6006(local77)) {
											Static395.method5281(local211, local203);
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static66.aClass107_53 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5387();
										local211 = Static206.aClass1_Sub5_Sub1_2.method5395();
										if (Static456.method6006(local203)) {
											@Pc(3120) Class1_Sub23 local3120 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local77);
											local1286 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local211);
											if (local1286 != null) {
												Static441.method5820(false, local3120 == null || local1286.anInt3059 != local3120.anInt3059, local1286);
											}
											if (local3120 != null) {
												local3120.method6020();
												Static101.aClass96_16.method2341((long) local211, local3120);
											}
											@Pc(3158) Class251 local3158 = Static378.method3544(local77);
											if (local3158 != null) {
												Static408.method5469(local3158);
											}
											local3158 = Static378.method3544(local211);
											if (local3158 != null) {
												Static408.method5469(local3158);
												Static157.method3072(true, local3158);
											}
											if (Static407.anInt6564 != -1) {
												Static204.method5978(Static407.anInt6564, 1);
											}
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static347.aClass107_175 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5366();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5400();
										Static394.aClass23_1.method596(local203, local77);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static342.aClass107_172 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5387();
										local211 = Static206.aClass1_Sub5_Sub1_2.method5372();
										local242 = Static206.aClass1_Sub5_Sub1_2.method5372();
										if (Static456.method6006(local203)) {
											Static325.method4643(local211, local242, local77);
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static421.aClass107_72) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5407();
										Static58.aClass9_5 = Static77.aClass180_1.method4074(local203);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static397.aClass107_197) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5411();
										if (Static456.method6006(local203)) {
											Static446.anInt7154 = local77;
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static181.aClass107_112 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5398();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
										@Pc(3297) byte local3297 = Static206.aClass1_Sub5_Sub1_2.method5379();
										if (Static456.method6006(local203)) {
											Static349.method4853(local3297, local77);
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static351.aClass107_178 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5400();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5369();
										local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
										if (Static456.method6006(local203)) {
											Static349.method4853(local77, local211);
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static207.aClass107_120 == Static269.aClass107_139) {
										Static105.method1872(false);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static182.aClass107_114) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5362();
										local211 = Static206.aClass1_Sub5_Sub1_2.method5398();
										if (Static456.method6006(local203)) {
											Static339.method4785(local211, local77);
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static122.aClass107_82) {
										Static269.anInt4762 = Static206.aClass1_Sub5_Sub1_2.method5411();
										Static456.anInt7402 = Static206.aClass1_Sub5_Sub1_2.method5383();
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static197.aClass107_119) {
										local1179 = Static206.aClass1_Sub5_Sub1_2.method5401();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5362();
										local1418 = Static189.aClass156_1.method3582(local77).method5152(Static206.aClass1_Sub5_Sub1_2);
										Static452.method5933(local1179, local1179, local1418, 19, null, local77, 0);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static333.aClass107_163 == Static269.aClass107_139) {
										local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
										local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
										local1418 = local1185;
										if (local2023) {
											local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
										}
										local2039 = Static206.aClass1_Sub5_Sub1_2.method5362();
										local2044 = Static206.aClass1_Sub5_Sub1_2.method5399();
										local880 = Static206.aClass1_Sub5_Sub1_2.method5366();
										local886 = Static206.aClass1_Sub5_Sub1_2.method5362();
										@Pc(3473) long local3473 = local2044 + (local2039 << 32);
										@Pc(3475) boolean local3475 = false;
										local331 = 0;
										while (true) {
											if (local331 >= 100) {
												if (local880 <= 1 && Static343.method5736(local1418)) {
													local3475 = true;
												}
												break;
											}
											if (local3473 == Static298.aLongArray8[local331]) {
												local3475 = true;
												break;
											}
											local331++;
										}
										if (!local3475 && Static452.anInt7259 == 0) {
											Static298.aLongArray8[Static291.anInt5088] = local3473;
											Static291.anInt5088 = (Static291.anInt5088 + 1) % 100;
											@Pc(3527) String local3527 = Static189.aClass156_1.method3582(local886).method5152(Static206.aClass1_Sub5_Sub1_2);
											if (local880 == 2) {
												Static452.method5933("<img=1>" + local1418, "<img=1>" + local1185, local3527, 18, null, local886, 0);
											} else if (local880 == 1) {
												Static452.method5933("<img=0>" + local1418, "<img=0>" + local1185, local3527, 18, null, local886, 0);
											} else {
												Static452.method5933(local1418, local1185, local3527, 18, null, local886, 0);
											}
										}
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static292.aClass107_148) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5366();
										@Pc(3608) boolean local3608 = (local203 & 0x1) == 1;
										local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
										local1876 = Static206.aClass1_Sub5_Sub1_2.method5401();
										if (local1876.equals("")) {
											local1876 = local1418;
										}
										local1878 = Static206.aClass1_Sub5_Sub1_2.method5401();
										local1905 = Static206.aClass1_Sub5_Sub1_2.method5401();
										if (local1905.equals("")) {
											local1905 = local1878;
										}
										if (local3608) {
											for (local275 = 0; local275 < Static28.anInt641; local275++) {
												if (Static52.aStringArray33[local275].equals(local1905)) {
													Static214.aStringArray34[local275] = local1418;
													Static52.aStringArray33[local275] = local1876;
													Static260.aStringArray30[local275] = local1878;
													Static184.aStringArray23[local275] = local1905;
													break;
												}
											}
										} else {
											Static214.aStringArray34[Static28.anInt641] = local1418;
											Static52.aStringArray33[Static28.anInt641] = local1876;
											Static260.aStringArray30[Static28.anInt641] = local1878;
											Static184.aStringArray23[Static28.anInt641] = local1905;
											Static199.aBooleanArray28[Static28.anInt641] = (local203 & 0x2) == 2;
											Static28.anInt641++;
										}
										Static254.anInt4601 = Static319.anInt4221;
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static369.aClass107_188) {
										local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
										@Pc(3728) byte[] local3728 = new byte[Static167.anInt3076 - 1];
										Static206.aClass1_Sub5_Sub1_2.method5391(local3728, Static167.anInt3076 - 1);
										Static366.method5036(local3728, local2023);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static269.aClass107_139 == Static296.aClass107_150) {
										Static28.anInt641 = Static206.aClass1_Sub5_Sub1_2.method5366();
										for (local203 = 0; local203 < Static28.anInt641; local203++) {
											Static214.aStringArray34[local203] = Static206.aClass1_Sub5_Sub1_2.method5401();
											Static52.aStringArray33[local203] = Static206.aClass1_Sub5_Sub1_2.method5401();
											if (Static52.aStringArray33[local203].equals("")) {
												Static52.aStringArray33[local203] = Static214.aStringArray34[local203];
											}
											Static260.aStringArray30[local203] = Static206.aClass1_Sub5_Sub1_2.method5401();
											Static184.aStringArray23[local203] = Static206.aClass1_Sub5_Sub1_2.method5401();
											if (Static184.aStringArray23[local203].equals("")) {
												Static184.aStringArray23[local203] = Static260.aStringArray30[local203];
											}
											Static199.aBooleanArray28[local203] = false;
										}
										Static269.aClass107_139 = null;
										Static254.anInt4601 = Static319.anInt4221;
										return true;
									} else if (Static281.aClass107_187 == Static269.aClass107_139) {
										Static276.method4034();
										Static269.aClass107_139 = null;
										return false;
									} else if (Static269.aClass107_139 == Static339.aClass107_168) {
										Static186.method2933(Static276.aClass237_12);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static149.aClass107_198 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5369();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5362();
										Static394.aClass23_1.method597(local203, local77);
										Static269.aClass107_139 = null;
										return true;
									} else if (Static227.aClass107_127 == Static269.aClass107_139) {
										local203 = Static206.aClass1_Sub5_Sub1_2.method5387();
										local77 = Static206.aClass1_Sub5_Sub1_2.method5400();
										Static394.aClass23_1.method596(local203, local77);
										Static269.aClass107_139 = null;
										return true;
									} else {
										@Pc(3941) Class1_Sub17 local3941;
										@Pc(3935) long local3935;
										@Pc(3950) Class1_Sub17 local3950;
										if (Static26.aClass107_22 == Static269.aClass107_139) {
											local203 = Static206.aClass1_Sub5_Sub1_2.method5400();
											if (local203 == 65535) {
												local203 = -1;
											}
											local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
											if (local77 == 65535) {
												local77 = -1;
											}
											local211 = Static206.aClass1_Sub5_Sub1_2.method5395();
											local242 = Static206.aClass1_Sub5_Sub1_2.method5400();
											local246 = Static206.aClass1_Sub5_Sub1_2.method5363();
											if (Static456.method6006(local246)) {
												for (local1510 = local203; local1510 <= local77; local1510++) {
													local3935 = (long) local1510 + ((long) local211 << 32);
													local3941 = (Class1_Sub17) Static176.aClass96_20.method2335(local3935);
													if (local3941 != null) {
														local3950 = new Class1_Sub17(local3941.anInt2012, local242);
														local3941.method6020();
													} else if (local1510 == -1) {
														local3950 = new Class1_Sub17(Static378.method3544(local211).aClass1_Sub17_5.anInt2012, local242);
													} else {
														local3950 = new Class1_Sub17(0, local242);
													}
													Static176.aClass96_20.method2341(local3935, local3950);
												}
											}
											Static269.aClass107_139 = null;
											return true;
										} else if (Static269.aClass107_139 == Static251.aClass107_133) {
											Static109.method1978();
											Static269.aClass107_139 = null;
											return false;
										} else if (Static269.aClass107_139 == Static34.aClass107_28) {
											Static225.method3455(Static309.aBoolean382);
											Static269.aClass107_139 = null;
											return false;
										} else if (Static352.aClass107_179 == Static269.aClass107_139) {
											local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
											local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
											local1418 = local1185;
											if (local2023) {
												local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
											}
											local242 = Static206.aClass1_Sub5_Sub1_2.method5366();
											local246 = Static206.aClass1_Sub5_Sub1_2.method5362();
											local257 = false;
											if (local242 <= 1 && Static343.method5736(local1418)) {
												local257 = true;
											}
											if (!local257 && Static452.anInt7259 == 0) {
												local2862 = Static189.aClass156_1.method3582(local246).method5152(Static206.aClass1_Sub5_Sub1_2);
												if (local242 == 2) {
													Static452.method5933("<img=1>" + local1418, "<img=1>" + local1185, local2862, 25, null, local246, 0);
												} else if (local242 == 1) {
													Static452.method5933("<img=0>" + local1418, "<img=0>" + local1185, local2862, 25, null, local246, 0);
												} else {
													Static452.method5933(local1418, local1185, local2862, 25, null, local246, 0);
												}
											}
											Static269.aClass107_139 = null;
											return true;
										} else {
											@Pc(4324) boolean local4324;
											if (Static269.aClass107_139 == Static347.aClass107_176) {
												Static152.anInt2903 = Static319.anInt4221;
												if (Static167.anInt3076 == 0) {
													Static269.aClass107_139 = null;
													Static437.aString31 = null;
													Static266.anInt6939 = 0;
													Static118.aClass154Array1 = null;
													Static348.aString61 = null;
													return true;
												}
												Static437.aString31 = Static206.aClass1_Sub5_Sub1_2.method5401();
												local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
												if (local2023) {
													Static206.aClass1_Sub5_Sub1_2.method5401();
												}
												@Pc(4191) long local4191 = Static206.aClass1_Sub5_Sub1_2.method5371();
												Static348.aString61 = Static65.method1318(local4191);
												Static30.aByte2 = Static206.aClass1_Sub5_Sub1_2.method5416();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5366();
												if (local242 == 255) {
													Static269.aClass107_139 = null;
													return true;
												}
												Static266.anInt6939 = local242;
												@Pc(4217) Class154[] local4217 = new Class154[100];
												for (local1510 = 0; local1510 < Static266.anInt6939; local1510++) {
													local4217[local1510] = new Class154();
													local4217[local1510].aString35 = Static206.aClass1_Sub5_Sub1_2.method5401();
													local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
													if (local2023) {
														local4217[local1510].aString36 = Static206.aClass1_Sub5_Sub1_2.method5401();
													} else {
														local4217[local1510].aString36 = local4217[local1510].aString35;
													}
													local4217[local1510].aString37 = Static459.method4507(local4217[local1510].aString36);
													local4217[local1510].anInt4214 = Static206.aClass1_Sub5_Sub1_2.method5362();
													local4217[local1510].aByte73 = Static206.aClass1_Sub5_Sub1_2.method5416();
													local4217[local1510].aString38 = Static206.aClass1_Sub5_Sub1_2.method5401();
													if (local4217[local1510].aString36.equals(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10)) {
														Static215.aByte71 = local4217[local1510].aByte73;
													}
												}
												local886 = Static266.anInt6939;
												while (local886 > 0) {
													local4324 = true;
													local886--;
													for (local296 = 0; local296 < local886; local296++) {
														if (local4217[local296].aString37.compareTo(local4217[local296 + 1].aString37) > 0) {
															local2866 = local4217[local296];
															local4217[local296] = local4217[local296 + 1];
															local4324 = false;
															local4217[local296 + 1] = local2866;
														}
													}
													if (local4324) {
														break;
													}
												}
												Static118.aClass154Array1 = local4217;
												Static269.aClass107_139 = null;
												return true;
											} else if (Static136.aClass107_91 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local1498 = (local77 & 0x1) == 1;
												Static317.method4488(local1498, local203);
												local242 = Static206.aClass1_Sub5_Sub1_2.method5362();
												for (local246 = 0; local246 < local242; local246++) {
													local1510 = Static206.aClass1_Sub5_Sub1_2.method5398();
													local275 = Static206.aClass1_Sub5_Sub1_2.method5374();
													if (local275 == 255) {
														local275 = Static206.aClass1_Sub5_Sub1_2.method5387();
													}
													Static375.method5103(local1510 - 1, local275, local246, local1498, local203);
												}
												Static70.anIntArray112[Static422.anInt6829++ & 0x1F] = local203;
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static416.aClass107_203) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5398();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5387();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5398();
												if (local211 == 65535) {
													local211 = -1;
												}
												local242 = Static206.aClass1_Sub5_Sub1_2.method5369();
												if (Static456.method6006(local203)) {
													Static427.method2524(local242, local77, local211);
													@Pc(4498) Class152 local4498 = Static165.aClass19_1.method560(local211);
													Static386.method5216(local4498.anInt4198, local4498.anInt4166, local242, local4498.anInt4173);
													Static203.method4235(local4498.anInt4171, local242, local4498.anInt4167, local4498.anInt4161);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static231.aClass107_218 == Static269.aClass107_139) {
												while (Static206.aClass1_Sub5_Sub1_2.anInt6475 < Static167.anInt3076) {
													local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
													local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
													local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
													local242 = Static206.aClass1_Sub5_Sub1_2.method5362();
													local246 = Static206.aClass1_Sub5_Sub1_2.method5366();
													local1905 = "";
													local4324 = false;
													if (local242 > 0) {
														local1905 = Static206.aClass1_Sub5_Sub1_2.method5401();
														local4324 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
													}
													for (local880 = 0; local880 < Static313.anInt5409; local880++) {
														if (local2023) {
															if (local1418.equals(Static22.aStringArray6[local880])) {
																Static22.aStringArray6[local880] = local1185;
																local1185 = null;
																aStringArray22[local880] = local1418;
																break;
															}
														} else if (local1185.equals(Static22.aStringArray6[local880])) {
															if (local242 != Static83.anIntArray147[local880]) {
																local288 = true;
																for (@Pc(4621) Class4_Sub2_Sub2 local4621 = (Class4_Sub2_Sub2) Static96.aClass141_4.method3357(); local4621 != null; local4621 = (Class4_Sub2_Sub2) Static96.aClass141_4.method3360()) {
																	if (local4621.aString15.equals(local1185)) {
																		if (local242 != 0 && local4621.aShort30 == 0) {
																			local4621.method5737();
																			local288 = false;
																		} else if (local242 == 0 && local4621.aShort30 != 0) {
																			local4621.method5737();
																			local288 = false;
																		}
																	}
																}
																if (local288) {
																	Static96.aClass141_4.method3356(new Class4_Sub2_Sub2(local1185, local242));
																}
																Static83.anIntArray147[local880] = local242;
															}
															aStringArray22[local880] = local1418;
															Static356.aStringArray38[local880] = local1905;
															Static75.anIntArray128[local880] = local246;
															local1185 = null;
															Static386.aBooleanArray45[local880] = local4324;
															break;
														}
													}
													if (local1185 != null && Static313.anInt5409 < 200) {
														Static22.aStringArray6[Static313.anInt5409] = local1185;
														aStringArray22[Static313.anInt5409] = local1418;
														Static83.anIntArray147[Static313.anInt5409] = local242;
														Static356.aStringArray38[Static313.anInt5409] = local1905;
														Static75.anIntArray128[Static313.anInt5409] = local246;
														Static386.aBooleanArray45[Static313.anInt5409] = local4324;
														Static313.anInt5409++;
													}
												}
												Static432.anInt7010 = 2;
												Static254.anInt4601 = Static319.anInt4221;
												local77 = Static313.anInt5409;
												while (local77 > 0) {
													local2023 = true;
													local77--;
													for (local211 = 0; local211 < local77; local211++) {
														if (Static451.aClass209_5.anInt5815 != Static83.anIntArray147[local211] && Static451.aClass209_5.anInt5815 == Static83.anIntArray147[local211 + 1] || Static83.anIntArray147[local211] == 0 && Static83.anIntArray147[local211 + 1] != 0) {
															local242 = Static83.anIntArray147[local211];
															Static83.anIntArray147[local211] = Static83.anIntArray147[local211 + 1];
															Static83.anIntArray147[local211 + 1] = local242;
															local1878 = Static356.aStringArray38[local211];
															Static356.aStringArray38[local211] = Static356.aStringArray38[local211 + 1];
															Static356.aStringArray38[local211 + 1] = local1878;
															local1905 = Static22.aStringArray6[local211];
															Static22.aStringArray6[local211] = Static22.aStringArray6[local211 + 1];
															Static22.aStringArray6[local211 + 1] = local1905;
															local2862 = aStringArray22[local211];
															aStringArray22[local211] = aStringArray22[local211 + 1];
															aStringArray22[local211 + 1] = local2862;
															local880 = Static75.anIntArray128[local211];
															Static75.anIntArray128[local211] = Static75.anIntArray128[local211 + 1];
															Static75.anIntArray128[local211 + 1] = local880;
															local288 = Static386.aBooleanArray45[local211];
															Static386.aBooleanArray45[local211] = Static386.aBooleanArray45[local211 + 1];
															local2023 = false;
															Static386.aBooleanArray45[local211 + 1] = local288;
														}
													}
													if (local2023) {
														break;
													}
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static176.aClass107_110 == Static269.aClass107_139) {
												Static206.aClass1_Sub5_Sub1_2.anInt6475 += 28;
												if (Static206.aClass1_Sub5_Sub1_2.method5402()) {
													Static161.method2621(Static206.aClass1_Sub5_Sub1_2.anInt6475 - 28, Static206.aClass1_Sub5_Sub1_2);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static383.aClass107_192) {
												Static186.method2933(Static340.aClass237_13);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static122.aClass107_81 == Static269.aClass107_139) {
												Static186.method2933(Static180.aClass237_17);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static9.aClass107_193) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5369();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5400();
												if (local77 == 65535) {
													local77 = -1;
												}
												local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (Static456.method6006(local211)) {
													Static309.method4392(local203, 1, local77, -1);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static348.aClass107_177 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5400();
												local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (Static456.method6006(local203)) {
													Static162.method2632(local1185, local211);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static7.aClass107_7) {
												@Pc(5036) byte local5036 = Static206.aClass1_Sub5_Sub1_2.method5379();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
												Static394.aClass23_1.method597(local5036, local77);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static181.aClass107_111) {
												local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
												local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
												local1418 = local1185;
												if (local2023) {
													local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
												}
												local2039 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local2044 = Static206.aClass1_Sub5_Sub1_2.method5399();
												local880 = Static206.aClass1_Sub5_Sub1_2.method5366();
												@Pc(5097) long local5097 = local2044 + (local2039 << 32);
												@Pc(5099) boolean local5099 = false;
												local917 = 0;
												while (true) {
													if (local917 >= 100) {
														if (local880 <= 1) {
															if (Static47.aBoolean48 && !Static217.aBoolean286 || Static139.aBoolean166) {
																local5099 = true;
															} else if (Static343.method5736(local1418)) {
																local5099 = true;
															}
														}
														break;
													}
													if (Static298.aLongArray8[local917] == local5097) {
														local5099 = true;
														break;
													}
													local917++;
												}
												if (!local5099 && Static452.anInt7259 == 0) {
													Static298.aLongArray8[Static291.anInt5088] = local5097;
													Static291.anInt5088 = (Static291.anInt5088 + 1) % 100;
													@Pc(5161) String local5161 = Static200.method3250(Static303.method4357(Static206.aClass1_Sub5_Sub1_2));
													if (local880 == 2) {
														Static452.method5933("<img=1>" + local1418, "<img=1>" + local1185, local5161, 7, null, -1, 0);
													} else if (local880 == 1) {
														Static452.method5933("<img=0>" + local1418, "<img=0>" + local1185, local5161, 7, null, -1, 0);
													} else {
														Static452.method5933(local1418, local1185, local5161, 3, null, -1, 0);
													}
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static46.aClass107_37) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (Static456.method6006(local203)) {
													Static400.method5339();
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static258.aClass107_104) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
												local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
												if (Static456.method6006(local77)) {
													Static162.method2632(local1418, local203);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static415.aClass107_202 == Static269.aClass107_139) {
												Static186.method2933(Static387.aClass237_15);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static329.aClass107_161 == Static269.aClass107_139) {
												Static186.method2933(Static456.aClass237_21);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static326.aClass107_24 == Static269.aClass107_139) {
												Static305.method4362(Static167.anInt3076, Static206.aClass1_Sub5_Sub1_2);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static40.aClass107_33) {
												Static264.anInt4692 = Static206.aClass1_Sub5_Sub1_2.method5366();
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static122.aClass107_83) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local246 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local1510 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (Static456.method6006(local203)) {
													Static62.aBooleanArray8[local77] = true;
													Static121.anIntArray196[local77] = local211;
													Static458.anIntArray663[local77] = local242;
													Static321.anIntArray508[local77] = local246;
													Static297.anIntArray446[local77] = local1510;
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static371.aClass107_209 == Static269.aClass107_139) {
												Static378.method3545();
												Static269.aClass107_139 = null;
												return true;
											} else if (Static389.aClass107_194 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5374();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
												if (local77 == 65535) {
													local77 = -1;
												}
												local211 = Static206.aClass1_Sub5_Sub1_2.method5411();
												local1876 = Static206.aClass1_Sub5_Sub1_2.method5401();
												if (local211 >= 1 && local211 <= 8) {
													if (local1876.equalsIgnoreCase("null")) {
														local1876 = null;
													}
													Static401.aStringArray41[local211 - 1] = local1876;
													Static141.anIntArray212[local211 - 1] = local77;
													Static286.aBooleanArray36[local211 - 1] = local203 == 0;
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static452.aClass107_215) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
												if (local203 == 65535) {
													local203 = -1;
												}
												local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5363();
												if (local211 == 65535) {
													local211 = -1;
												}
												local242 = Static206.aClass1_Sub5_Sub1_2.method5407();
												local246 = Static206.aClass1_Sub5_Sub1_2.method5407();
												if (Static456.method6006(local77)) {
													for (local1510 = local203; local1510 <= local211; local1510++) {
														local3935 = (long) local1510 + ((long) local246 << 32);
														local3941 = (Class1_Sub17) Static176.aClass96_20.method2335(local3935);
														if (local3941 != null) {
															local3950 = new Class1_Sub17(local242, local3941.anInt2009);
															local3941.method6020();
														} else if (local1510 == -1) {
															local3950 = new Class1_Sub17(local242, Static378.method3544(local246).aClass1_Sub17_5.anInt2009);
														} else {
															local3950 = new Class1_Sub17(local242, -1);
														}
														Static176.aClass96_20.method2341(local3935, local3950);
													}
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static21.aClass107_21 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5374();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5400();
												@Pc(5585) Class31_Sub2_Sub1_Sub2 local5585 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local211];
												if (local5585 != null) {
													Static2.method64(local77, local5585, local203);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static142.aClass107_158) {
												Static186.method2933(Static428.aClass237_18);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static47.aClass107_40 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (local203 == 65535) {
													local203 = -1;
												}
												local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5366();
												Static208.method3312(local77, local203, local211, local242);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static452.aClass107_216) {
												Static420.aString70 = Static167.anInt3076 > 2 ? Static206.aClass1_Sub5_Sub1_2.method5401() : Static173.aClass7_75.method331(Static341.anInt5770);
												Static228.anInt4143 = Static167.anInt3076 <= 0 ? -1 : Static206.aClass1_Sub5_Sub1_2.method5362();
												Static269.aClass107_139 = null;
												if (Static228.anInt4143 == 65535) {
													Static228.anInt4143 = -1;
												}
												return true;
											} else if (Static328.aClass107_160 == Static269.aClass107_139) {
												Static269.aClass107_139 = null;
												Static432.anInt7010 = 1;
												Static254.anInt4601 = Static319.anInt4221;
												return true;
											} else if (Static269.aClass107_139 == Static120.aClass107_78) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5398();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5398();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5398();
												local246 = Static206.aClass1_Sub5_Sub1_2.method5395();
												if (Static456.method6006(local77)) {
													Static386.method5216(local242, local203, local246, local211);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static231.aClass107_219 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5362() << 0;
												local246 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local1510 = Static206.aClass1_Sub5_Sub1_2.method5366();
												if (Static456.method6006(local203)) {
													Static427.method2526(local77, local242, local211, local246, local1510);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static261.aClass107_136) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5363();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5363();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5369();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local246 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (Static456.method6006(local242)) {
													Static309.method4392(local211, 7, local203 | local77 << 16, local246);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static79.aClass107_61 == Static269.aClass107_139) {
												Static115.method2117(Static206.aClass1_Sub5_Sub1_2.method5401());
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static18.aClass107_118) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5407();
												local77 = Static206.aClass1_Sub5_Sub1_2.method5389();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5363();
												if (Static456.method6006(local211)) {
													Static447.method5875(local77, local203);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static340.aClass107_170) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
												@Pc(5869) Object[] local5869 = new Object[local1185.length() + 1];
												for (local242 = local1185.length() - 1; local242 >= 0; local242--) {
													if (local1185.charAt(local242) == 's') {
														local5869[local242 + 1] = Static206.aClass1_Sub5_Sub1_2.method5401();
													} else {
														local5869[local242 + 1] = Integer.valueOf(Static206.aClass1_Sub5_Sub1_2.method5407());
													}
												}
												local5869[0] = Integer.valueOf(Static206.aClass1_Sub5_Sub1_2.method5407());
												if (Static456.method6006(local203)) {
													@Pc(5925) Class1_Sub24 local5925 = new Class1_Sub24();
													local5925.anObjectArray3 = local5869;
													Static13.method366(local5925);
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static406.aClass107_199) {
												local2023 = Static206.aClass1_Sub5_Sub1_2.method5366() == 1;
												local1185 = Static206.aClass1_Sub5_Sub1_2.method5401();
												local1418 = local1185;
												if (local2023) {
													local1418 = Static206.aClass1_Sub5_Sub1_2.method5401();
												}
												local242 = Static206.aClass1_Sub5_Sub1_2.method5366();
												@Pc(5966) boolean local5966 = false;
												if (local242 <= 1) {
													if (Static47.aBoolean48 && !Static217.aBoolean286 || Static139.aBoolean166) {
														local5966 = true;
													} else if (local242 <= 1 && Static343.method5736(local1418)) {
														local5966 = true;
													}
												}
												if (!local5966 && Static452.anInt7259 == 0) {
													local1905 = Static200.method3250(Static303.method4357(Static206.aClass1_Sub5_Sub1_2));
													if (local242 == 2) {
														Static452.method5933("<img=1>" + local1418, "<img=1>" + local1185, local1905, 24, null, -1, 0);
													} else if (local242 == 1) {
														Static452.method5933("<img=0>" + local1418, "<img=0>" + local1185, local1905, 24, null, -1, 0);
													} else {
														Static452.method5933(local1418, local1185, local1905, 24, null, -1, 0);
													}
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static346.aClass107_174) {
												Static386.method5214(Static77.aClass180_1, Static206.aClass1_Sub5_Sub1_2, Static167.anInt3076);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static215.aClass107_121) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5362();
												if (local203 == 65535) {
													local203 = -1;
												}
												local77 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local211 = Static206.aClass1_Sub5_Sub1_2.method5362();
												local242 = Static206.aClass1_Sub5_Sub1_2.method5366();
												Static243.method3688(local211, local77, local203, local242);
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static110.aClass107_73) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5366();
												local77 = local203 >> 5;
												local211 = local203 & 0x1F;
												if (local211 == 0) {
													Static353.aClass83Array2[local77] = null;
													Static269.aClass107_139 = null;
													return true;
												}
												@Pc(6154) Class83 local6154 = new Class83();
												local6154.anInt2462 = local211;
												local6154.anInt2458 = Static206.aClass1_Sub5_Sub1_2.method5366();
												if (local6154.anInt2458 >= 0 && Static141.aClass143Array3.length > local6154.anInt2458) {
													if (local6154.anInt2462 == 1 || local6154.anInt2462 == 10) {
														local6154.anInt2459 = Static206.aClass1_Sub5_Sub1_2.method5362();
														Static206.aClass1_Sub5_Sub1_2.anInt6475 += 6;
													} else if (local6154.anInt2462 >= 2 && local6154.anInt2462 <= 6) {
														if (local6154.anInt2462 == 2) {
															local6154.anInt2463 = 64;
															local6154.anInt2457 = 64;
														}
														if (local6154.anInt2462 == 3) {
															local6154.anInt2457 = 0;
															local6154.anInt2463 = 64;
														}
														if (local6154.anInt2462 == 4) {
															local6154.anInt2457 = 128;
															local6154.anInt2463 = 64;
														}
														if (local6154.anInt2462 == 5) {
															local6154.anInt2463 = 0;
															local6154.anInt2457 = 64;
														}
														if (local6154.anInt2462 == 6) {
															local6154.anInt2463 = 128;
															local6154.anInt2457 = 64;
														}
														local6154.anInt2462 = 2;
														local6154.anInt2456 = Static206.aClass1_Sub5_Sub1_2.method5366();
														local6154.anInt2457 += Static206.aClass1_Sub5_Sub1_2.method5362() - Static165.anInt3049 << 7;
														local6154.anInt2463 += Static206.aClass1_Sub5_Sub1_2.method5362() - Static345.anInt5799 << 7;
														local6154.anInt2461 = Static206.aClass1_Sub5_Sub1_2.method5366() << 0;
														local6154.anInt2466 = Static206.aClass1_Sub5_Sub1_2.method5362();
													}
													local6154.anInt2465 = Static206.aClass1_Sub5_Sub1_2.method5362();
													if (local6154.anInt2465 == 65535) {
														local6154.anInt2465 = -1;
													}
													Static353.aClass83Array2[local77] = local6154;
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static269.aClass107_139 == Static114.aClass107_75) {
												for (local203 = 0; local203 < Static458.aClass31_Sub2_Sub1_Sub1Array1.length; local203++) {
													if (Static458.aClass31_Sub2_Sub1_Sub1Array1[local203] != null) {
														Static458.aClass31_Sub2_Sub1_Sub1Array1[local203].anInt7365 = -1;
													}
												}
												for (local77 = 0; local77 < Static98.aClass31_Sub2_Sub1_Sub2Array1.length; local77++) {
													if (Static98.aClass31_Sub2_Sub1_Sub2Array1[local77] != null) {
														Static98.aClass31_Sub2_Sub1_Sub2Array1[local77].anInt7365 = -1;
													}
												}
												Static269.aClass107_139 = null;
												return true;
											} else if (Static133.aClass107_90 == Static269.aClass107_139) {
												local203 = Static206.aClass1_Sub5_Sub1_2.method5411();
												local77 = local203 >> 2;
												local211 = local203 & 0x3;
												local242 = Static58.anIntArray93[local77];
												local246 = Static206.aClass1_Sub5_Sub1_2.method5400();
												if (local246 == 65535) {
													local246 = -1;
												}
												local1510 = Static206.aClass1_Sub5_Sub1_2.method5387();
												local275 = local1510 >> 28 & 0x3;
												local880 = local1510 >> 14 & 0x3FFF;
												local886 = local1510 & 0x3FFF;
												@Pc(6440) int local6440 = local880 - Static165.anInt3049;
												@Pc(6444) int local6444 = local886 - Static345.anInt5799;
												Static241.method3636(local275, local246, local211, local77, local242, local6440, local6444);
												Static269.aClass107_139 = null;
												return true;
											} else {
												Static158.method2570(null, "T1 - " + (Static269.aClass107_139 == null ? -1 : Static269.aClass107_139.method2508()) + "," + (Static152.aClass107_95 == null ? -1 : Static152.aClass107_95.method2508()) + "," + (Static255.aClass107_135 == null ? -1 : Static255.aClass107_135.method2508()) + " - " + Static167.anInt3076);
												Static225.method3455(false);
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
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method2760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg0 && arg8 == arg1 && arg4 == arg7 && arg6 == arg3) {
			Static315.method4479(arg7, arg5, arg3, arg0, arg1);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg1;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg1 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg4 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(67) int local67 = local46 + arg7 - local54 - arg0;
		@Pc(77) int local77 = arg3 + local50 - local58 - arg1;
		@Pc(86) int local86 = local38 + local54 - local46 - local46;
		@Pc(96) int local96 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(115) int local115 = local108 * local108 >> 12;
			@Pc(121) int local121 = local115 * local108 >> 12;
			@Pc(125) int local125 = local67 * local121;
			@Pc(129) int local129 = local77 * local121;
			@Pc(133) int local133 = local115 * local86;
			@Pc(137) int local137 = local115 * local96;
			@Pc(141) int local141 = local101 * local108;
			@Pc(145) int local145 = local106 * local108;
			@Pc(155) int local155 = arg0 + (local141 + local125 + local133 >> 12);
			@Pc(165) int local165 = arg1 + (local145 + local129 + local137 >> 12);
			Static315.method4479(local155, arg5, local165, local32, local34);
			local34 = local165;
			local32 = local155;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!sm;IZIIII)V")
	public static void method2762(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static259.anInt4646 >= 50 || (arg0 == null || arg0.anIntArrayArray57 == null || arg0.anIntArrayArray57.length <= arg3 || arg0.anIntArrayArray57[arg3] == null)) {
			return;
		}
		@Pc(40) int local40 = arg0.anIntArrayArray57[arg3][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(69) int local69;
		if (arg0.anIntArrayArray57[arg3].length > 1) {
			local69 = (int) (Math.random() * (double) arg0.anIntArrayArray57[arg3].length);
			if (local69 > 0) {
				local44 = arg0.anIntArrayArray57[arg3][local69];
			}
		}
		@Pc(82) int local82 = local40 & 0x1F;
		if (local82 == 0) {
			if (arg2) {
				Static243.method3688(0, local50, local44, 255);
			}
		} else if (Static38.aClass135_Sub1_1.anInt5092 != 0) {
			local69 = arg1 - 64 >> 7;
			@Pc(112) int local112 = arg5 - 64 >> 7;
			Static113.aClass74Array1[Static259.anInt4646++] = new Class74((byte) 1, local44, local50, 0, 255, (local112 << 8) + (arg4 << 24) + (local69 << 16) + local82);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(BII)Z")
	public static boolean method2764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static428.method5677(arg1, arg0) | Static24.method548(arg1, arg0)) & Static439.method5781(arg0, arg1);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	public static void method2765(@OriginalArg(0) int arg0) {
		if (Static164.anInt3043 == 1) {
			Static393.anInt6316 = arg0;
		} else if (Static164.anInt3043 == 2 || Static164.anInt3043 == 3) {
			Static285.anInt4984 = arg0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
	public static void method2767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg2);
		@Pc(17) int local17 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg3);
		@Pc(23) int local23 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg0);
		@Pc(29) int local29 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg4);
		@Pc(37) int local37 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg1 + arg2);
		@Pc(46) int local46 = Static87.method1619(Static173.anInt3208, Static108.anInt2276, arg3 - arg1);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static59.method1261(Static163.anIntArrayArray35[local48], local29, local23, arg5);
		}
		for (@Pc(72) int local72 = local17; local72 > local46; local72--) {
			Static59.method1261(Static163.anIntArrayArray35[local72], local29, local23, arg5);
		}
		@Pc(99) int local99 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg0 + arg1);
		@Pc(108) int local108 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg4 - arg1);
		for (@Pc(110) int local110 = local37; local110 <= local46; local110++) {
			@Pc(116) int[] local116 = Static163.anIntArrayArray35[local110];
			Static59.method1261(local116, local99, local23, arg5);
			Static59.method1261(local116, local29, local108, arg5);
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[SB)[S")
	public static short[] method2772(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(14) short[] local14 = new short[arg0];
		Static468.method4332(arg1, 0, local14, 0, arg0);
		return local14;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method2774(@OriginalArg(0) String arg0) {
		@Pc(9) String local9 = Static235.method3561(Static214.method4406(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}
}
