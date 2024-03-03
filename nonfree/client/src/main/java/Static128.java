import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array13;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "Lclient!r;")
	public static Class197 aClass197_33;

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 5)
	public static void method2551() {
		if (Class11_Sub3_Sub1.anInt1868 > 0) {
			Class11_Sub3_Sub1.anInt1868--;
		}
		if (Class2_Sub2_Sub9.anInt2770 > 1) {
			Class2_Sub2_Sub9.anInt2770--;
			Class69.anInt1948 = Class65.anInt1874;
		}
		if (Class73.aBoolean158) {
			Class73.aBoolean158 = false;
			Static197.method3726();
			return;
		}
		if (!Class243.aBoolean477) {
			Static138.method2705();
		}
		for (@Pc(36) int local36 = 0; local36 < 100 && Static218.method3342(); local36++) {
		}
		if (Class2_Sub3_Sub35.anInt6430 != 30) {
			return;
		}
		Static5.method88(Class14.aClass2_Sub4_Sub2_4, Class2_Sub2_Sub10_Sub1.aClass145_116.method3703());
		if (Static359.aClass2_Sub16_2 == null) {
			if (Static190.method3686() >= Static350.aLong222) {
				Static359.aClass2_Sub16_2 = Class3_Sub1.aClass162_1.method4115(Static201.aString36);
			}
		} else if (Static359.aClass2_Sub16_2.anInt2416 != -1) {
			Static85.method1962(Class2_Sub3.aClass145_268);
			Class14.aClass2_Sub4_Sub2_4.method4844(Static359.aClass2_Sub16_2.anInt2416);
			Static359.aClass2_Sub16_2 = null;
			Static350.aLong222 = Static190.method3686() + 30000L;
		}
		@Pc(112) int local112;
		@Pc(135) int local135;
		@Pc(153) int local153;
		@Pc(169) boolean local169;
		@Pc(219) int local219;
		@Pc(225) int local225;
		@Pc(236) int local236;
		if (Static345.aClass2_Sub24_1 != null || Class2_Sub3_Sub36.aLong217 < Static190.method3686() - 2000L) {
			@Pc(109) boolean local109 = false;
			local112 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
			for (@Pc(117) Class2_Sub24 local117 = (Class2_Sub24) Class187.aClass135_31.method3552(); local117 != null && Class14.aClass2_Sub4_Sub2_4.anInt5289 - local112 < 240; local117 = (Class2_Sub24) Class187.aClass135_31.method3553()) {
				local117.method6469();
				local135 = local117.method5243();
				if (local135 < 0) {
					local135 = 0;
				} else if (local135 > 65534) {
					local135 = 65534;
				}
				local153 = local117.method5244();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				local169 = false;
				if (local117.method5243() == -1 && local117.method5244() == -1) {
					local153 = -1;
					local169 = true;
					local135 = -1;
				}
				if (Class193.anInt5483 != local153 || local135 != Class85.anInt2373) {
					if (!local109) {
						Static85.method1962(Class67.aClass145_69);
						Class14.aClass2_Sub4_Sub2_4.method4843(0);
						local112 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
						local109 = true;
					}
					local219 = local153 - Class193.anInt5483;
					Class193.anInt5483 = local153;
					local225 = local135 - Class85.anInt2373;
					Class85.anInt2373 = local135;
					local236 = (int) ((local117.method5249() - Class2_Sub3_Sub36.aLong217) / 20L);
					if (local236 < 8 && local219 >= -32 && local219 <= 31 && local225 >= -32 && local225 <= 31) {
						local219 += 32;
						local225 += 32;
						Class14.aClass2_Sub4_Sub2_4.method4844((local219 << 6) + (local236 << 12) + local225);
					} else if (local236 < 32 && local219 >= -128 && local219 <= 127 && local225 >= -128 && local225 <= 127) {
						local225 += 128;
						local219 += 128;
						Class14.aClass2_Sub4_Sub2_4.method4843(local236 + 128);
						Class14.aClass2_Sub4_Sub2_4.method4844((local219 << 8) + local225);
					} else if (local236 >= 32) {
						Class14.aClass2_Sub4_Sub2_4.method4844(local236 + 57344);
						if (local169) {
							Class14.aClass2_Sub4_Sub2_4.method4814(Integer.MIN_VALUE);
						} else {
							Class14.aClass2_Sub4_Sub2_4.method4814(local153 | local135 << 16);
						}
					} else {
						Class14.aClass2_Sub4_Sub2_4.method4843(local236 + 192);
						if (local169) {
							Class14.aClass2_Sub4_Sub2_4.method4814(Integer.MIN_VALUE);
						} else {
							Class14.aClass2_Sub4_Sub2_4.method4814(local135 << 16 | local153);
						}
					}
					Class2_Sub3_Sub36.aLong217 = local117.method5249();
				}
			}
			if (local109) {
				Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local112);
			}
		}
		@Pc(410) int local410;
		@Pc(463) int local463;
		if (Static345.aClass2_Sub24_1 != null) {
			@Pc(394) long local394 = (Static345.aClass2_Sub24_1.method5249() - Class2_Sub28.aLong146) / 50L;
			if (local394 > 32767L) {
				local394 = 32767L;
			}
			Class2_Sub28.aLong146 = Static345.aClass2_Sub24_1.method5249();
			local410 = Static345.aClass2_Sub24_1.method5243();
			if (local410 < 0) {
				local410 = 0;
			} else if (local410 > 65535) {
				local410 = 65535;
			}
			local135 = Static345.aClass2_Sub24_1.method5244();
			if (local135 < 0) {
				local135 = 0;
			} else if (local135 > 65535) {
				local135 = 65535;
			}
			@Pc(446) byte local446 = 0;
			if (Static345.aClass2_Sub24_1.method5248() == 2) {
				local446 = 1;
			}
			Static85.method1962(Class11_Sub5_Sub6.aClass145_240);
			local463 = (int) local394;
			Class14.aClass2_Sub4_Sub2_4.method4844(local446 << 15 | local463);
			Class14.aClass2_Sub4_Sub2_4.method4849(local135 | local410 << 16);
		}
		@Pc(483) int local483;
		if (Class2_Sub3_Sub1.anInt159 > 0) {
			local483 = 0;
			for (local112 = 0; local112 < Class2_Sub3_Sub1.anInt159; local112++) {
				if (Class111.aClass37Array1[local112].method1461()) {
					local483++;
				}
			}
			if (local483 > 0) {
				Static85.method1962(Class248.aClass145_266);
				if (local483 > 75) {
					local483 = 75;
				}
				Class14.aClass2_Sub4_Sub2_4.method4843(local483 * 3);
				for (local410 = 0; local410 < Class2_Sub3_Sub1.anInt159; local410++) {
					@Pc(531) Class37 local531 = Class111.aClass37Array1[local410];
					if (local531.method1461()) {
						@Pc(544) long local544 = (local531.method1459() - Class11_Sub5_Sub4.aLong202) / 50L;
						Class11_Sub5_Sub4.aLong202 = local531.method1459();
						if (local544 > 65535L) {
							local544 = 65535L;
						}
						Class14.aClass2_Sub4_Sub2_4.method4843(local531.method1463());
						Class14.aClass2_Sub4_Sub2_4.method4844((int) local544);
					}
				}
			}
		}
		if (Class2_Sub42.anInt7140 > 0) {
			Class2_Sub42.anInt7140--;
		}
		if (Class2_Sub13.aBoolean156 && Class2_Sub42.anInt7140 <= 0) {
			Class2_Sub13.aBoolean156 = false;
			Class2_Sub42.anInt7140 = 20;
			Static85.method1962(Class205.aClass145_200);
			Class14.aClass2_Sub4_Sub2_4.method4844((int) Class187.aFloat66 >> 3);
			Class14.aClass2_Sub4_Sub2_4.method4831((int) Class28.aFloat27 >> 3);
		}
		if (Static225.aBoolean306 && !Class226.aBoolean431) {
			Class226.aBoolean431 = true;
			Static85.method1962(OutputStream_Sub1.aClass145_159);
			Class14.aClass2_Sub4_Sub2_4.method4843(1);
		}
		if (!Static225.aBoolean306 && Class226.aBoolean431) {
			Class226.aBoolean431 = false;
			Static85.method1962(OutputStream_Sub1.aClass145_159);
			Class14.aClass2_Sub4_Sub2_4.method4843(0);
		}
		if (!Class161.aBoolean288) {
			Static85.method1962(Class170.aClass145_166);
			Class14.aClass2_Sub4_Sub2_4.method4843(0);
			local483 = Class14.aClass2_Sub4_Sub2_4.anInt5289;
			@Pc(672) Class2_Sub4 local672 = Static203.aClass177_Sub1_2.method4495();
			Class14.aClass2_Sub4_Sub2_4.method4858(local672.aByteArray73, local672.anInt5289);
			Class14.aClass2_Sub4_Sub2_4.method4862(Class14.aClass2_Sub4_Sub2_4.anInt5289 - local483);
			Class161.aBoolean288 = true;
		}
		if (Static307.aClass67ArrayArrayArray3 != null) {
			if (Static291.anInt5899 == 2) {
				Static207.method3918();
			} else if (Static291.anInt5899 == 3) {
				Static186.method5250();
			}
		}
		if (Class98.aBoolean187) {
			Class98.aBoolean187 = false;
		} else {
			Class198.aFloat67 /= 2.0F;
		}
		if (Class2_Sub3_Sub37.aBoolean471) {
			Class2_Sub3_Sub37.aBoolean471 = false;
		} else {
			Class128.aFloat38 /= 2.0F;
		}
		Static171.method68();
		if (Class2_Sub3_Sub35.anInt6430 != 30) {
			return;
		}
		Static52.method1613();
		Static285.method5275();
		Static104.method2276();
		Static201.method3778();
		Class2_Sub3_Sub24.anInt4945++;
		if (Class2_Sub3_Sub24.anInt4945 > 750) {
			Static197.method3726();
			return;
		}
		Static360.method6030();
		Static57.method1675();
		Static280.method5211();
		for (local483 = Static199.aClass226_1.method5784(true); local483 != -1; local483 = Static199.aClass226_1.method5784(false)) {
			Static71.method1837(local483);
			Class2_Sub3_Sub6.anIntArray85[Class9.anInt269++ & 0x1F] = local483;
		}
		@Pc(830) Class161 local830;
		for (@Pc(790) Class2_Sub2_Sub7 local790 = Static121.method2439(); local790 != null; local790 = Static121.method2439()) {
			local410 = local790.method2309();
			local135 = local790.method2311();
			if (local410 == 1) {
				Static71.anIntArray117[local135] = local790.anInt2286;
				Class2_Sub2_Sub2_Sub2.aBoolean374 |= Static83.aBooleanArray18[local135];
				Class98.anIntArray167[Class2_Sub2_Sub12.anInt3814++ & 0x1F] = local135;
			} else if (local410 == 2) {
				Static71.aStringArray11[local135] = local790.aString21;
				Class230.anIntArray444[Class46.anInt1481++ & 0x1F] = local135;
			} else if (local410 == 3) {
				local830 = Static6.method140(local135);
				if (!local790.aString21.equals(local830.aString47)) {
					local830.aString47 = local790.aString21;
					Static187.method3646(local830);
				}
			} else if (local410 == 4) {
				local830 = Static6.method140(local135);
				local463 = local790.anInt2286;
				local219 = local790.anInt2287;
				local225 = local790.anInt2281;
				if (local830.anInt4281 != local463 || local219 != local830.anInt4306 || local830.anInt4230 != local225) {
					local830.anInt4306 = local219;
					local830.anInt4230 = local225;
					local830.anInt4281 = local463;
					Static187.method3646(local830);
				}
			} else if (local410 == 5) {
				local830 = Static6.method140(local135);
				if (local790.anInt2286 != local830.anInt4292 || local790.anInt2286 == -1) {
					local830.anInt4309 = 1;
					local830.anInt4241 = 0;
					local830.anInt4292 = local790.anInt2286;
					local830.anInt4276 = 0;
					Static187.method3646(local830);
				}
			} else if (local410 == 6) {
				local153 = local790.anInt2286;
				local463 = local153 >> 10 & 0x1F;
				local219 = local153 >> 5 & 0x1F;
				local225 = local153 & 0x1F;
				local236 = (local463 << 19) + ((local219 << 11) + (local225 << 3));
				@Pc(1214) Class161 local1214 = Static6.method140(local135);
				if (local1214.anInt4283 != local236) {
					local1214.anInt4283 = local236;
					Static187.method3646(local1214);
				}
			} else if (local410 == 7) {
				local830 = Static6.method140(local135);
				local169 = local790.anInt2286 == 1;
				if (local830.aBoolean284 != local169) {
					local830.aBoolean284 = local169;
					Static187.method3646(local830);
				}
			} else if (local410 == 8) {
				local830 = Static6.method140(local135);
				if (local790.anInt2286 != local830.anInt4313 || local830.anInt4267 != local790.anInt2287 || local790.anInt2281 != local830.anInt4249) {
					local830.anInt4249 = local790.anInt2281;
					local830.anInt4267 = local790.anInt2287;
					local830.anInt4313 = local790.anInt2286;
					if (local830.anInt4293 != -1) {
						if (local830.anInt4245 > 0) {
							local830.anInt4249 = local830.anInt4249 * 32 / local830.anInt4245;
						} else if (local830.anInt4287 > 0) {
							local830.anInt4249 = local830.anInt4249 * 32 / local830.anInt4287;
						}
					}
					Static187.method3646(local830);
				}
			} else if (local410 == 9) {
				local830 = Static6.method140(local135);
				if (local830.anInt4293 != local790.anInt2286 || local830.anInt4234 != local790.anInt2287) {
					local830.anInt4234 = local790.anInt2287;
					local830.anInt4293 = local790.anInt2286;
					Static187.method3646(local830);
				}
			} else if (local410 == 10) {
				local830 = Static6.method140(local135);
				if (local790.anInt2286 != local830.anInt4271 || local790.anInt2287 != local830.anInt4244 || local830.anInt4312 != local790.anInt2281) {
					local830.anInt4312 = local790.anInt2281;
					local830.anInt4271 = local790.anInt2286;
					local830.anInt4244 = local790.anInt2287;
					Static187.method3646(local830);
				}
			} else if (local410 == 11) {
				local830 = Static6.method140(local135);
				local830.aByte46 = 0;
				local830.aByte45 = 0;
				local830.anInt4248 = local830.anInt4243 = local790.anInt2287;
				local830.anInt4298 = local830.anInt4235 = local790.anInt2286;
				Static187.method3646(local830);
			} else if (local410 == 12) {
				local830 = Static6.method140(local135);
				local463 = local790.anInt2286;
				if (local830 != null && local830.anInt4265 == 0) {
					if (local463 > local830.anInt4260 - local830.anInt4255) {
						local463 = local830.anInt4260 - local830.anInt4255;
					}
					if (local463 < 0) {
						local463 = 0;
					}
					if (local463 != local830.anInt4253) {
						local830.anInt4253 = local463;
						Static187.method3646(local830);
					}
				}
			} else if (local410 == 14) {
				local830 = Static6.method140(local135);
				local830.anInt4288 = local790.anInt2286;
			} else if (local410 == 15) {
				Class2_Sub3_Sub31.anInt5832 = local790.anInt2287;
				Class2_Sub3_Sub38.aBoolean474 = true;
				Class130.anInt6538 = local790.anInt2286;
			} else if (local410 == 16) {
				local830 = Static6.method140(local135);
				local830.anInt4311 = local790.anInt2286;
			}
		}
		if (Class69.anInt1949 != 0) {
			Class2_Sub3_Sub32.anInt5866 += 20;
			if (Class2_Sub3_Sub32.anInt5866 >= 400) {
				Class69.anInt1949 = 0;
			}
		}
		Class116.anInt3144++;
		if (Static60.aClass161_2 != null) {
			Class2_Sub2_Sub7.anInt2290++;
			if (Class2_Sub2_Sub7.anInt2290 >= 15) {
				Static187.method3646(Static60.aClass161_2);
				Static60.aClass161_2 = null;
			}
		}
		Static211.aClass161_11 = null;
		Class127.aClass161_7 = null;
		Class2_Sub3_Sub26.aBoolean377 = false;
		Class2_Sub3_Sub30.aBoolean403 = false;
		Static349.method6275(-1, null, -1);
		Static61.method1737(-1, null, -1);
		Static286.method5279();
		Class65.anInt1874++;
		if (Class6.aBoolean427) {
			Static85.method1962(Class240.aClass145_252);
			Class14.aClass2_Sub4_Sub2_4.method4849(Static260.anInt5339 << 28 | Static259.anInt5335 << 14 | Static4.anInt89);
			Class6.aBoolean427 = false;
		}
		while (true) {
			@Pc(1416) Class2_Sub13 local1416;
			@Pc(1421) Class161 local1421;
			do {
				local1416 = (Class2_Sub13) Class245.aClass135_43.method3550();
				if (local1416 == null) {
					while (true) {
						do {
							local1416 = (Class2_Sub13) Class145.aClass135_25.method3550();
							if (local1416 == null) {
								while (true) {
									do {
										local1416 = (Class2_Sub13) Class183.aClass135_30.method3550();
										if (local1416 == null) {
											if (Static211.aClass161_11 == null) {
												Class229.anInt6437 = 0;
											}
											if (Class243.aClass161_14 != null) {
												Static115.method2400();
											}
											if (Class3_Sub1.anInt90 > 0 && Static163.aClass123_2.method3344(82) && Static163.aClass123_2.method3344(81) && Class216_Sub1.anInt6051 != 0) {
												local410 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 - Class216_Sub1.anInt6051;
												if (local410 < 0) {
													local410 = 0;
												} else if (local410 > 3) {
													local410 = 3;
												}
												Static6.method141(local410, Static139.anInt2716 + Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0], Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] + Static154.anInt3136);
											}
											Static292.method5382();
											for (local410 = 0; local410 < 5; local410++) {
												@Pc(1612) int local1612 = Class84.anIntArray149[local410]++;
											}
											if (Class2_Sub2_Sub2_Sub2.aBoolean374 && Class243.aLong221 < Static190.method3686() - 60000L) {
												Static317.method5766();
											}
											Class2_Sub1.anInt28++;
											if (Class2_Sub1.anInt28 > 500) {
												Class2_Sub1.anInt28 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x4) == 4) {
													Class11_Sub4.anInt3961 += Class2_Sub3_Sub2.anInt213;
												}
												if ((local135 & 0x1) == 1) {
													Class21.anInt642 += Class103.anInt2702;
												}
												if ((local135 & 0x2) == 2) {
													Class11_Sub1_Sub2.anInt327 += Class177.anInt4887;
												}
											}
											if (Class21.anInt642 < -50) {
												Class103.anInt2702 = 2;
											}
											if (Class11_Sub1_Sub2.anInt327 < -55) {
												Class177.anInt4887 = 2;
											}
											if (Class21.anInt642 > 50) {
												Class103.anInt2702 = -2;
											}
											if (Class11_Sub4.anInt3961 < -40) {
												Class2_Sub3_Sub2.anInt213 = 1;
											}
											if (Class11_Sub1_Sub2.anInt327 > 55) {
												Class177.anInt4887 = -2;
											}
											Class191.anInt5363++;
											if (Class11_Sub4.anInt3961 > 40) {
												Class2_Sub3_Sub2.anInt213 = -1;
											}
											if (Class191.anInt5363 > 500) {
												Class191.anInt5363 = 0;
												local135 = (int) (Math.random() * 8.0D);
												if ((local135 & 0x1) == 1) {
													Class2_Sub3_Sub1.anInt158 += Class173.anInt6986;
												}
												if ((local135 & 0x2) == 2) {
													Class71.anInt2003 += Class11_Sub2_Sub2.anInt948;
												}
											}
											if (Class2_Sub3_Sub1.anInt158 < -60) {
												Class173.anInt6986 = 2;
											}
											if (Class2_Sub3_Sub1.anInt158 > 60) {
												Class173.anInt6986 = -2;
											}
											if (Class71.anInt2003 < -20) {
												Class11_Sub2_Sub2.anInt948 = 1;
											}
											Class2_Sub2_Sub17.anInt6863++;
											if (Class71.anInt2003 > 10) {
												Class11_Sub2_Sub2.anInt948 = -1;
											}
											if (Class2_Sub2_Sub17.anInt6863 > 50) {
												Static85.method1962(Class12.aClass145_228);
											}
											if (Class1.aBoolean1) {
												Static120.method2434();
												Class1.aBoolean1 = false;
											}
											try {
												if (Static312.aClass111_4 != null && Class14.aClass2_Sub4_Sub2_4.anInt5289 > 0) {
													Static164.anInt3344 += Class14.aClass2_Sub4_Sub2_4.anInt5289;
													Static312.aClass111_4.method2799(Class14.aClass2_Sub4_Sub2_4.anInt5289, Class14.aClass2_Sub4_Sub2_4.aByteArray73);
													Class2_Sub2_Sub17.anInt6863 = 0;
													Class14.aClass2_Sub4_Sub2_4.anInt5289 = 0;
													return;
												}
												return;
											} catch (@Pc(1823) IOException local1823) {
												Static197.method3726();
												return;
											}
										}
										local1421 = local1416.aClass161_3;
										if (local1421.anInt4290 < 0) {
											break;
										}
										local830 = Static6.method140(local1421.anInt4268);
									} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4290 || local1421 != local830.aClass161Array2[local1421.anInt4290]);
									Static185.method3592(local1416);
								}
							}
							local1421 = local1416.aClass161_3;
							if (local1421.anInt4290 < 0) {
								break;
							}
							local830 = Static6.method140(local1421.anInt4268);
						} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4290 || local1421 != local830.aClass161Array2[local1421.anInt4290]);
						Static185.method3592(local1416);
					}
				}
				local1421 = local1416.aClass161_3;
				if (local1421.anInt4290 < 0) {
					break;
				}
				local830 = Static6.method140(local1421.anInt4268);
			} while (local830 == null || local830.aClass161Array2 == null || local830.aClass161Array2.length <= local1421.anInt4290 || local1421 != local830.aClass161Array2[local1421.anInt4290]);
			Static185.method3592(local1416);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILclient!ed;I)V", line = 858)
	public static void method2552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub8 arg2, @OriginalArg(4) int arg3) {
		@Pc(25) long local25 = (long) (arg1 | arg3 << 28 | arg0 << 14);
		@Pc(31) Class2_Sub32 local31 = (Class2_Sub32) Class87.aClass4_49.method90(local25);
		if (local31 == null) {
			local31 = new Class2_Sub32();
			Class87.aClass4_49.method87(local31, local25);
			local31.aClass135_34.method3541(arg2);
			return;
		}
		@Pc(54) Class188 local54 = Static290.aClass107_2.method2761(arg2.anInt1715);
		@Pc(57) int local57 = local54.anInt5210;
		if (local54.lb == 1) {
			local57 *= arg2.anInt1717 + 1;
		}
		for (@Pc(76) Class2_Sub8 local76 = (Class2_Sub8) local31.aClass135_34.method3552(); local76 != null; local76 = (Class2_Sub8) local31.aClass135_34.method3553()) {
			local54 = Static290.aClass107_2.method2761(local76.anInt1715);
			@Pc(87) int local87 = local54.anInt5210;
			if (local54.lb == 1) {
				local87 *= local76.anInt1717 + 1;
			}
			if (local57 > local87) {
				Static90.method2102(arg2, local76);
				return;
			}
		}
		local31.aClass135_34.method3541(arg2);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V", line = 923)
	public static void method2554(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub2_Sub7 local8 = Static293.method5414(14, arg0);
		local8.method2314();
	}
}
