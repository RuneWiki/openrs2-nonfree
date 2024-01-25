import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "Lclient!ju;")
	public static Class124 aClass124_10;

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array12;

	@OriginalMember(owner = "client!kl", name = "n", descriptor = "[I")
	public static final int[] anIntArray267 = new int[2048];

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "[I")
	public static final int[] anIntArray268 = new int[16];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
	public static void method3467() {
		@Pc(5) Class268 local5 = Static232.aClass268_33;
		synchronized (Static232.aClass268_33) {
			Static232.aClass268_33.method6168();
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(Z)V")
	public static void method3472() {
		if (Static245.anInt4185 > 1) {
			Static245.anInt4185--;
			Static457.anInt7712 = Static125.anInt2284;
		}
		if (Static346.aBoolean409) {
			Static346.aBoolean409 = false;
			Static234.method3419();
			return;
		}
		if (!Static367.aBoolean425) {
			Static447.method6092();
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static230.method3352(); local27++) {
		}
		if (Static345.anInt5823 != 9) {
			return;
		}
		Static38.method612(Static361.aClass163_153.method3810(), Static243.aClass3_Sub25_Sub1_7);
		if (Static39.aClass3_Sub23_1 == null) {
			if (Static76.aLong53 <= Static354.method4966()) {
				Static39.aClass3_Sub23_1 = Static285.aClass126_1.method3160(Static367.aClass241_6.aString61);
			}
		} else if (Static39.aClass3_Sub23_1.anInt3004 != -1) {
			Static307.method4633(Static228.aClass163_99);
			Static243.aClass3_Sub25_Sub1_7.method4123(Static39.aClass3_Sub23_1.anInt3004);
			Static39.aClass3_Sub23_1 = null;
			Static76.aLong53 = Static354.method4966() + 30000L;
		}
		@Pc(93) Class3_Sub5 local93 = (Class3_Sub5) Static273.aClass193_38.method4519();
		@Pc(128) int local128;
		@Pc(152) int local152;
		@Pc(165) boolean local165;
		@Pc(210) int local210;
		@Pc(217) int local217;
		@Pc(228) int local228;
		if (local93 != null || Static354.method4966() - 2000L > Static421.aLong234) {
			@Pc(104) boolean local104 = false;
			@Pc(107) int local107 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
			for (@Pc(112) Class3_Sub5 local112 = (Class3_Sub5) Static374.aClass193_62.method4519(); local112 != null && Static243.aClass3_Sub25_Sub1_7.anInt4974 - local107 < 240; local112 = (Class3_Sub5) Static374.aClass193_62.method4525()) {
				local112.method6288();
				local128 = local112.method5406();
				if (local128 < 0) {
					local128 = 0;
				} else if (local128 > 65534) {
					local128 = 65534;
				}
				local152 = local112.method5408();
				if (local152 < 0) {
					local152 = 0;
				} else if (local152 > 65534) {
					local152 = 65534;
				}
				local165 = false;
				if (local112.method5406() == -1 && local112.method5408() == -1) {
					local165 = true;
					local128 = -1;
					local152 = -1;
				}
				if (Static242.anInt4122 != local152 || Static33.anInt607 != local128) {
					if (!local104) {
						Static307.method4633(Static294.aClass163_121);
						Static243.aClass3_Sub25_Sub1_7.method4081(0);
						local104 = true;
						local107 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
					}
					local210 = local152 - Static242.anInt4122;
					Static242.anInt4122 = local152;
					local217 = local128 - Static33.anInt607;
					Static33.anInt607 = local128;
					local228 = (int) ((local112.method5410() - Static421.aLong234) / 20L);
					if (local228 < 8 && local210 >= -32 && local210 <= 31 && local217 >= -32 && local217 <= 31) {
						local210 += 32;
						local217 += 32;
						Static243.aClass3_Sub25_Sub1_7.method4123((local210 << 6) + ((local228 << 12) + local217));
					} else if (local228 < 32 && local210 >= -128 && local210 <= 127 && local217 >= -128 && local217 <= 127) {
						local217 += 128;
						Static243.aClass3_Sub25_Sub1_7.method4081(local228 + 128);
						local210 += 128;
						Static243.aClass3_Sub25_Sub1_7.method4123(local217 + (local210 << 8));
					} else if (local228 < 32) {
						Static243.aClass3_Sub25_Sub1_7.method4081(local228 + 192);
						if (local165) {
							Static243.aClass3_Sub25_Sub1_7.method4082(Integer.MIN_VALUE);
						} else {
							Static243.aClass3_Sub25_Sub1_7.method4082(local152 | local128 << 16);
						}
					} else {
						Static243.aClass3_Sub25_Sub1_7.method4123(local228 + 57344);
						if (local165) {
							Static243.aClass3_Sub25_Sub1_7.method4082(Integer.MIN_VALUE);
						} else {
							Static243.aClass3_Sub25_Sub1_7.method4082(local128 << 16 | local152);
						}
					}
					Static421.aLong234 = local112.method5410();
				}
			}
			if (local104) {
				Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local107);
			}
		}
		@Pc(404) int local404;
		@Pc(455) int local455;
		if (local93 != null) {
			@Pc(388) long local388 = (local93.method5410() - Static443.aLong241) / 50L;
			Static443.aLong241 = local93.method5410();
			if (local388 > 32767L) {
				local388 = 32767L;
			}
			local404 = local93.method5406();
			if (local404 < 0) {
				local404 = 0;
			} else if (local404 > 65535) {
				local404 = 65535;
			}
			local128 = local93.method5408();
			if (local128 < 0) {
				local128 = 0;
			} else if (local128 > 65535) {
				local128 = 65535;
			}
			@Pc(436) byte local436 = 0;
			if (local93.method5404() == 2) {
				local436 = 1;
			}
			Static307.method4633(Static251.aClass163_161);
			local455 = (int) local388;
			Static243.aClass3_Sub25_Sub1_7.method4077(local436 << 15 | local455);
			Static243.aClass3_Sub25_Sub1_7.method4082(local404 << 16 | local128);
		}
		@Pc(491) int local491;
		if (Static49.anInt881 > 0) {
			Static307.method4633(Static22.aClass163_17);
			Static243.aClass3_Sub25_Sub1_7.method4081(Static49.anInt881 * 3);
			for (local491 = 0; local491 < Static49.anInt881; local491++) {
				@Pc(497) Interface3 local497 = Static305.anInterface3Array2[local491];
				@Pc(506) long local506 = (local497.method416() - Static340.aLong195) / 50L;
				if (local506 > 65535L) {
					local506 = 65535L;
				}
				Static340.aLong195 = local497.method416();
				Static243.aClass3_Sub25_Sub1_7.method4081(local497.method418());
				Static243.aClass3_Sub25_Sub1_7.method4123((int) local506);
			}
		}
		if (Static124.anInt2276 > 0) {
			Static124.anInt2276--;
		}
		if (Static179.aBoolean252 && Static124.anInt2276 <= 0) {
			Static179.aBoolean252 = false;
			Static124.anInt2276 = 20;
			Static307.method4633(Static110.aClass163_54);
			Static243.aClass3_Sub25_Sub1_7.method4123((int) Static19.aFloat6 >> 3);
			Static243.aClass3_Sub25_Sub1_7.method4093((int) Static275.aFloat61 >> 3);
		}
		if (Static58.aBoolean72 && !Static82.aBoolean99) {
			Static82.aBoolean99 = true;
			Static307.method4633(Static371.aClass163_159);
			Static243.aClass3_Sub25_Sub1_7.method4081(1);
		}
		if (!Static58.aBoolean72 && Static82.aBoolean99) {
			Static82.aBoolean99 = false;
			Static307.method4633(Static371.aClass163_159);
			Static243.aClass3_Sub25_Sub1_7.method4081(0);
		}
		if (!Static171.aBoolean244) {
			Static307.method4633(Static451.aClass163_194);
			Static243.aClass3_Sub25_Sub1_7.method4081(0);
			local491 = Static243.aClass3_Sub25_Sub1_7.anInt4974;
			@Pc(641) Class3_Sub25 local641 = Static39.aClass79_Sub1_1.method1947();
			Static243.aClass3_Sub25_Sub1_7.method4098(local641.aByteArray88, local641.anInt4974);
			Static243.aClass3_Sub25_Sub1_7.method4091(Static243.aClass3_Sub25_Sub1_7.anInt4974 - local491);
			Static171.aBoolean244 = true;
		}
		if (Static389.aClass227ArrayArrayArray3 != null) {
			if (Static27.anInt490 == 2) {
				Static53.method1004();
			} else if (Static27.anInt490 == 3) {
				Static4.method65();
			}
		}
		if (Static155.aBoolean216) {
			Static155.aBoolean216 = false;
		} else {
			Static292.aFloat84 /= 2.0F;
		}
		if (Static464.aBoolean522) {
			Static464.aBoolean522 = false;
		} else {
			Static313.aFloat87 /= 2.0F;
		}
		Static366.method5112();
		if (Static345.anInt5823 != 9) {
			return;
		}
		Static52.method983();
		Static265.method3694();
		Static357.method4971();
		Static5.method67();
		Static269.anInt3398++;
		if (Static269.anInt3398 > 750) {
			Static234.method3419();
			return;
		}
		Static118.method1897();
		Static278.method3847();
		Static296.method4219();
		for (local491 = Static119.aClass47_1.method1275(true); local491 != -1; local491 = Static119.aClass47_1.method1275(false)) {
			Static140.method2150(local491);
			Static284.anIntArray321[Static201.anInt3591++ & 0x1F] = local491;
		}
		@Pc(789) Class82 local789;
		for (@Pc(763) Class3_Sub3_Sub4 local763 = Static337.method4678(); local763 != null; local763 = Static337.method4678()) {
			local404 = local763.method1002();
			local128 = local763.method1005();
			if (local404 == 1) {
				Static59.anIntArray56[local128] = local763.anInt972;
				Static451.aBoolean505 |= Static322.aBooleanArray19[local128];
				Static237.anIntArray264[Static464.anInt7831++ & 0x1F] = local128;
			} else if (local404 == 2) {
				Static358.aStringArray38[local128] = local763.aString7;
				Static416.anIntArray446[Static369.anInt6266++ & 0x1F] = local128;
			} else if (local404 == 3) {
				local789 = Static180.method2857(local128);
				if (!local763.aString7.equals(local789.aString31)) {
					local789.aString31 = local763.aString7;
					Static463.method6297(local789);
				}
			} else if (local404 == 4) {
				local789 = Static180.method2857(local128);
				local455 = local763.anInt972;
				local210 = local763.anInt970;
				local217 = local763.anInt974;
				if (local789.anInt2233 != local455 || local789.anInt2238 != local210 || local789.anInt2270 != local217) {
					local789.anInt2233 = local455;
					local789.anInt2270 = local217;
					local789.anInt2238 = local210;
					Static463.method6297(local789);
				}
			} else if (local404 == 5) {
				local789 = Static180.method2857(local128);
				if (local763.anInt972 != local789.anInt2227 || local763.anInt972 == -1) {
					local789.anInt2267 = 0;
					local789.anInt2227 = local763.anInt972;
					local789.anInt2219 = 1;
					local789.anInt2202 = 0;
					Static463.method6297(local789);
				}
			} else if (local404 == 6) {
				local152 = local763.anInt972;
				local455 = local152 >> 10 & 0x1F;
				local210 = local152 >> 5 & 0x1F;
				local217 = local152 & 0x1F;
				local228 = (local210 << 11) + (local455 << 19) + (local217 << 3);
				@Pc(1246) Class82 local1246 = Static180.method2857(local128);
				if (local228 != local1246.anInt2274) {
					local1246.anInt2274 = local228;
					Static463.method6297(local1246);
				}
			} else if (local404 == 7) {
				local789 = Static180.method2857(local128);
				local165 = local763.anInt972 == 1;
				if (local789.aBoolean169 != local165) {
					local789.aBoolean169 = local165;
					Static463.method6297(local789);
				}
			} else if (local404 == 8) {
				local789 = Static180.method2857(local128);
				if (local789.anInt2232 != local763.anInt972 || local789.anInt2197 != local763.anInt970 || local763.anInt974 != local789.anInt2244) {
					local789.anInt2244 = local763.anInt974;
					local789.anInt2232 = local763.anInt972;
					local789.anInt2197 = local763.anInt970;
					if (local789.anInt2200 != -1) {
						if (local789.anInt2254 > 0) {
							local789.anInt2244 = local789.anInt2244 * 32 / local789.anInt2254;
						} else if (local789.anInt2272 > 0) {
							local789.anInt2244 = local789.anInt2244 * 32 / local789.anInt2272;
						}
					}
					Static463.method6297(local789);
				}
			} else if (local404 == 9) {
				local789 = Static180.method2857(local128);
				if (local789.anInt2200 != local763.anInt972 || local789.anInt2215 != local763.anInt970) {
					local789.anInt2215 = local763.anInt970;
					local789.anInt2200 = local763.anInt972;
					Static463.method6297(local789);
				}
			} else if (local404 == 10) {
				local789 = Static180.method2857(local128);
				if (local789.anInt2256 != local763.anInt972 || local789.anInt2230 != local763.anInt970 || local763.anInt974 != local789.anInt2193) {
					local789.anInt2193 = local763.anInt974;
					local789.anInt2230 = local763.anInt970;
					local789.anInt2256 = local763.anInt972;
					Static463.method6297(local789);
				}
			} else if (local404 == 11) {
				local789 = Static180.method2857(local128);
				local789.aByte23 = 0;
				local789.anInt2210 = local789.anInt2264 = local763.anInt972;
				local789.anInt2199 = local789.anInt2280 = local763.anInt970;
				local789.aByte20 = 0;
				Static463.method6297(local789);
			} else if (local404 == 12) {
				local789 = Static180.method2857(local128);
				local455 = local763.anInt972;
				if (local789 != null && local789.anInt2252 == 0) {
					if (local455 > local789.anInt2249 - local789.anInt2216) {
						local455 = local789.anInt2249 - local789.anInt2216;
					}
					if (local455 < 0) {
						local455 = 0;
					}
					if (local455 != local789.anInt2263) {
						local789.anInt2263 = local455;
						Static463.method6297(local789);
					}
				}
			} else if (local404 == 14) {
				local789 = Static180.method2857(local128);
				local789.anInt2253 = local763.anInt972;
			} else if (local404 == 15) {
				Static31.anInt592 = local763.anInt972;
				Static392.anInt6568 = local763.anInt970;
				Static356.aBoolean488 = true;
			} else if (local404 == 16) {
				local789 = Static180.method2857(local128);
				local789.anInt2257 = local763.anInt972;
			}
		}
		Static46.anInt814++;
		if (Static314.anInt5331 != 0) {
			Static368.anInt6235 += 20;
			if (Static368.anInt6235 >= 400) {
				Static314.anInt5331 = 0;
			}
		}
		if (Static260.aClass82_21 != null) {
			Static438.anInt2388++;
			if (Static438.anInt2388 >= 15) {
				Static463.method6297(Static260.aClass82_21);
				Static260.aClass82_21 = null;
			}
		}
		Static381.aClass82_24 = null;
		Static280.aBoolean333 = false;
		Static184.aBoolean255 = false;
		Static225.aClass82_14 = null;
		Static228.method3280(null, -1, -1);
		Static257.method3591(-1, -1, null);
		if (!Static73.aBoolean88) {
			Static302.anInt5198 = -1;
		}
		Static2.method52();
		Static125.anInt2284++;
		if (Static10.aBoolean5) {
			Static307.method4633(Static242.aClass163_107);
			Static243.aClass3_Sub25_Sub1_7.method4082(Static425.anInt2164 | Static13.anInt222 << 14 | Static63.anInt7098 << 28);
			Static10.aBoolean5 = false;
		}
		while (true) {
			@Pc(1405) Class3_Sub15 local1405;
			@Pc(1410) Class82 local1410;
			do {
				local1405 = (Class3_Sub15) Static336.aClass193_56.method4521();
				if (local1405 == null) {
					while (true) {
						do {
							local1405 = (Class3_Sub15) Static93.aClass193_20.method4521();
							if (local1405 == null) {
								while (true) {
									do {
										local1405 = (Class3_Sub15) Static458.aClass193_69.method4521();
										if (local1405 == null) {
											if (Static381.aClass82_24 == null) {
												Static20.anInt6289 = 0;
											}
											if (Static296.aClass82_16 != null) {
												Static444.method5198();
											}
											if (Static300.anInt5196 > 0 && Static137.aClass143_1.method5471(82) && Static137.aClass143_1.method5471(81) && Static461.anInt7758 != 0) {
												local404 = Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 - Static461.anInt7758;
												if (local404 < 0) {
													local404 = 0;
												} else if (local404 > 3) {
													local404 = 3;
												}
												Static365.method5103(Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray510[0] + Static59.anInt1127, Static49.anInt873 + Static203.aClass1_Sub2_Sub6_Sub2_1.anIntArray509[0], local404);
											}
											Static194.method3016();
											for (local404 = 0; local404 < 5; local404++) {
												@Pc(1607) int local1607 = Static179.anIntArray196[local404]++;
											}
											if (Static451.aBoolean505 && Static354.method4966() - 60000L > Static235.aLong139) {
												Static174.method2777();
											}
											for (@Pc(1636) Class23_Sub1_Sub1 local1636 = (Class23_Sub1_Sub1) Static268.aClass194_6.method4577(); local1636 != null; local1636 = (Class23_Sub1_Sub1) Static268.aClass194_6.method4580()) {
												if (Static354.method4966() / 1000L - 5L > (long) local1636.anInt588) {
													if (local1636.aShort9 > 0) {
														Static349.method4875(0, "", 5, "", local1636.aString3 + Static359.aClass174_176.method4208(Static300.anInt5192));
													}
													if (local1636.aShort9 == 0) {
														Static349.method4875(0, "", 5, "", local1636.aString3 + Static167.aClass174_93.method4208(Static300.anInt5192));
													}
													local1636.method5853();
												}
											}
											Static243.anInt7145++;
											if (Static243.anInt7145 > 500) {
												Static243.anInt7145 = 0;
												local152 = (int) (Math.random() * 8.0D);
												if ((local152 & 0x2) == 2) {
													Static353.anInt7448 += Static254.anInt5708;
												}
												if ((local152 & 0x4) == 4) {
													Static310.anInt5306 += Static167.anInt3016;
												}
												if ((local152 & 0x1) == 1) {
													Static193.anInt3509 += Static382.anInt6430;
												}
											}
											if (Static193.anInt3509 < -50) {
												Static382.anInt6430 = 2;
											}
											if (Static193.anInt3509 > 50) {
												Static382.anInt6430 = -2;
											}
											if (Static353.anInt7448 < -55) {
												Static254.anInt5708 = 2;
											}
											if (Static353.anInt7448 > 55) {
												Static254.anInt5708 = -2;
											}
											if (Static310.anInt5306 < -40) {
												Static167.anInt3016 = 1;
											}
											if (Static310.anInt5306 > 40) {
												Static167.anInt3016 = -1;
											}
											Static257.anInt4287++;
											if (Static257.anInt4287 > 500) {
												Static257.anInt4287 = 0;
												local152 = (int) (Math.random() * 8.0D);
												if ((local152 & 0x1) == 1) {
													Static139.anInt2475 += Static145.anInt2643;
												}
												if ((local152 & 0x2) == 2) {
													Static197.anInt3551 += Static364.anInt6183;
												}
											}
											if (Static139.anInt2475 < -60) {
												Static145.anInt2643 = 2;
											}
											if (Static197.anInt3551 < -20) {
												Static364.anInt6183 = 1;
											}
											if (Static139.anInt2475 > 60) {
												Static145.anInt2643 = -2;
											}
											if (Static197.anInt3551 > 10) {
												Static364.anInt6183 = -1;
											}
											Static15.anInt283++;
											if (Static15.anInt283 > 50) {
												Static307.method4633(Static266.aClass163_114);
											}
											if (Static124.aBoolean177) {
												Static437.method5910();
												Static124.aBoolean177 = false;
											}
											try {
												if (Static328.aClass116_1 != null && Static243.aClass3_Sub25_Sub1_7.anInt4974 > 0) {
													Static254.anInt5709 += Static243.aClass3_Sub25_Sub1_7.anInt4974;
													Static328.aClass116_1.method2918(Static243.aClass3_Sub25_Sub1_7.anInt4974, Static243.aClass3_Sub25_Sub1_7.aByteArray88);
													Static15.anInt283 = 0;
													Static243.aClass3_Sub25_Sub1_7.anInt4974 = 0;
													return;
												}
												return;
											} catch (@Pc(1883) IOException local1883) {
												Static234.method3419();
												return;
											}
										}
										local1410 = local1405.aClass82_1;
										if (local1410.anInt2209 < 0) {
											break;
										}
										local789 = Static180.method2857(local1410.anInt2259);
									} while (local789 == null || local789.aClass82Array1 == null || local789.aClass82Array1.length <= local1410.anInt2209 || local789.aClass82Array1[local1410.anInt2209] != local1410);
									Static219.method3217(local1405);
								}
							}
							local1410 = local1405.aClass82_1;
							if (local1410.anInt2209 < 0) {
								break;
							}
							local789 = Static180.method2857(local1410.anInt2259);
						} while (local789 == null || local789.aClass82Array1 == null || local789.aClass82Array1.length <= local1410.anInt2209 || local789.aClass82Array1[local1410.anInt2209] != local1410);
						Static219.method3217(local1405);
					}
				}
				local1410 = local1405.aClass82_1;
				if (local1410.anInt2209 < 0) {
					break;
				}
				local789 = Static180.method2857(local1410.anInt2259);
			} while (local789 == null || local789.aClass82Array1 == null || local789.aClass82Array1.length <= local1410.anInt2209 || local1410 != local789.aClass82Array1[local1410.anInt2209]);
			Static219.method3217(local1405);
		}
	}
}
