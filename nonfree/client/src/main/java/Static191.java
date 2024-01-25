import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_7 = new Class28(13, 0, 1, 0);

	@OriginalMember(owner = "client!hda", name = "n", descriptor = "[I")
	public static final int[] anIntArray225 = new int[4];

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)Z")
	public static boolean method3208() throws IOException {
		if (Static57.aClass116_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static497.aClass363_245 == null) {
			if (Static424.aBoolean564) {
				if (!Static57.aClass116_1.method2480(1)) {
					return false;
				}
				Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
				Static183.anInt3799 = 0;
				Static159.anInt3212++;
				Static424.aBoolean564 = false;
			}
			Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
			if (Static133.aClass2_Sub15_Sub2_1.method4359()) {
				if (!Static57.aClass116_1.method2480(1)) {
					return false;
				}
				Static57.aClass116_1.method2476(1, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
				Static183.anInt3799 = 0;
				Static159.anInt3212++;
			}
			Static424.aBoolean564 = true;
			@Pc(69) Class363[] local69 = Static106.method5544();
			local73 = Static133.aClass2_Sub15_Sub2_1.method4354();
			if (local73 < 0 || local73 >= local69.length) {
				throw new IOException("invo:" + local73 + " ip:" + Static133.aClass2_Sub15_Sub2_1.anInt5241);
			}
			Static497.aClass363_245 = local69[local73];
			Static65.anInt1500 = Static497.aClass363_245.anInt9573;
		}
		if (Static65.anInt1500 == -1) {
			if (!Static57.aClass116_1.method2480(1)) {
				return false;
			}
			Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 1);
			Static183.anInt3799 = 0;
			Static65.anInt1500 = Static133.aClass2_Sub15_Sub2_1.aByteArray62[0] & 0xFF;
			Static159.anInt3212++;
		}
		if (Static65.anInt1500 == -2) {
			if (!Static57.aClass116_1.method2480(2)) {
				return false;
			}
			Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, 2);
			Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
			Static65.anInt1500 = Static133.aClass2_Sub15_Sub2_1.method4294();
			Static159.anInt3212 += 2;
			Static183.anInt3799 = 0;
		}
		if (Static65.anInt1500 > 0) {
			if (!Static57.aClass116_1.method2480(Static65.anInt1500)) {
				return false;
			}
			Static133.aClass2_Sub15_Sub2_1.anInt5241 = 0;
			Static57.aClass116_1.method2476(0, Static133.aClass2_Sub15_Sub2_1.aByteArray62, Static65.anInt1500);
			Static183.anInt3799 = 0;
			Static159.anInt3212 += Static65.anInt1500;
		}
		Static261.aClass363_230 = Static329.aClass363_162;
		Static329.aClass363_162 = Static359.aClass363_174;
		Static359.aClass363_174 = Static497.aClass363_245;
		if (Static505.aClass363_251 == Static497.aClass363_245) {
			Static186.anInt3835 = Static133.aClass2_Sub15_Sub2_1.method4334();
			Static504.anInt8433 = Static500.anInt8403;
			Static497.aClass363_245 = null;
			return true;
		} else if (Static497.aClass363_245 == Static496.aClass363_243) {
			Static295.method7108(false);
			Static497.aClass363_245 = null;
			return false;
		} else {
			@Pc(235) int local235;
			@Pc(239) int local239;
			@Pc(882) int local882;
			@Pc(303) int local303;
			@Pc(684) int local684;
			@Pc(227) int local227;
			@Pc(243) int local243;
			@Pc(273) int local273;
			@Pc(875) int local875;
			@Pc(254) boolean local254;
			@Pc(461) int local461;
			@Pc(756) int local756;
			@Pc(295) boolean local295;
			@Pc(382) int local382;
			if (Static408.aClass363_202 == Static497.aClass363_245) {
				local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
				local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
				local235 = Static133.aClass2_Sub15_Sub2_1.method4306();
				local239 = Static133.aClass2_Sub15_Sub2_1.method4306();
				local243 = Static133.aClass2_Sub15_Sub2_1.method4307();
				local254 = (local73 & 0x80) != 0;
				if (local243 >> 30 == 0) {
					@Pc(328) Class167 local328;
					@Pc(345) Class84 local345;
					@Pc(351) Class84 local351;
					if (local243 >> 29 != 0) {
						local273 = local243 & 0xFFFF;
						@Pc(589) Class2_Sub32 local589 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local273);
						if (local589 != null) {
							if (local227 == 65535) {
								local227 = -1;
							}
							@Pc(599) Class6_Sub1_Sub1_Sub1_Sub1 local599 = local589.aClass6_Sub1_Sub1_Sub1_Sub1_1;
							@Pc(601) boolean local601 = true;
							local461 = local254 ? local599.anInt7356 : local599.anInt7368;
							if (local227 != -1 && local461 != -1) {
								if (local461 == local227) {
									local328 = Static215.aClass33_1.method587(local227);
									if (local328.aBoolean352 && local328.anInt4374 != -1) {
										local345 = Static116.aClass140_2.method3287(local328.anInt4374);
										local684 = local345.anInt2056;
										if (local684 == 0 || local684 == 2) {
											local601 = false;
										} else if (local684 == 1) {
											local601 = true;
										}
									}
								} else {
									local328 = Static215.aClass33_1.method587(local227);
									@Pc(633) Class167 local633 = Static215.aClass33_1.method587(local461);
									if (local328.anInt4374 != -1 && local633.anInt4374 != -1) {
										local351 = Static116.aClass140_2.method3287(local328.anInt4374);
										@Pc(653) Class84 local653 = Static116.aClass140_2.method3287(local633.anInt4374);
										if (local351.anInt2065 < local653.anInt2065) {
											local601 = false;
										}
									}
								}
							}
							if (local601) {
								if (local254) {
									local599.anInt7360 = 0;
									local599.anInt7341 = local239;
									local599.anInt7346 = Static412.anInt575 + local235;
									local599.anInt7393 = local73 & 0x7;
									local599.anInt7356 = local227;
									local599.anInt7407 = 0;
									local599.anInt7343 = 1;
									if (local599.anInt7346 > Static412.anInt575) {
										local599.anInt7360 = -1;
									}
									if (local599.anInt7356 != -1 && Static412.anInt575 == local599.anInt7346) {
										local756 = Static215.aClass33_1.method587(local599.anInt7356).anInt4374;
										if (local756 != -1) {
											local345 = Static116.aClass140_2.method3287(local756);
											if (local345 != null && local345.anIntArray108 != null) {
												Static434.method4018(local599.aByte112, local345, local599.anInt8761, local599.anInt8764, 0, false);
											}
										}
									}
								} else {
									local599.anInt7402 = 0;
									local599.anInt7354 = local73 & 0x7;
									local599.anInt7384 = local239;
									local599.anInt7368 = local227;
									local599.anInt7364 = 0;
									local599.anInt7383 = 1;
									local599.anInt7376 = local235 + Static412.anInt575;
									if (local599.anInt7376 > Static412.anInt575) {
										local599.anInt7402 = -1;
									}
									if (local599.anInt7368 != -1 && local599.anInt7376 == Static412.anInt575) {
										local756 = Static215.aClass33_1.method587(local599.anInt7368).anInt4374;
										if (local756 != -1) {
											local345 = Static116.aClass140_2.method3287(local756);
											if (local345 != null && local345.anIntArray108 != null) {
												Static434.method4018(local599.aByte112, local345, local599.anInt8761, local599.anInt8764, 0, false);
											}
										}
									}
								}
							}
						}
					} else if (local243 >> 28 != 0) {
						local273 = local243 & 0xFFFF;
						@Pc(278) Class6_Sub1_Sub1_Sub1_Sub2 local278;
						if (Static222.anInt4184 == local273) {
							local278 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2;
						} else {
							local278 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local273];
						}
						if (local278 != null) {
							if (local227 == 65535) {
								local227 = -1;
							}
							local295 = true;
							local303 = local254 ? local278.anInt7356 : local278.anInt7368;
							@Pc(379) Class84 local379;
							if (local227 != -1 && local303 != -1) {
								@Pc(323) Class167 local323;
								if (local303 == local227) {
									local323 = Static215.aClass33_1.method587(local227);
									if (local323.aBoolean352 && local323.anInt4374 != -1) {
										local379 = Static116.aClass140_2.method3287(local323.anInt4374);
										local382 = local379.anInt2056;
										if (local382 == 0 || local382 == 2) {
											local295 = false;
										} else if (local382 == 1) {
											local295 = true;
										}
									}
								} else {
									local323 = Static215.aClass33_1.method587(local227);
									local328 = Static215.aClass33_1.method587(local303);
									if (local323.anInt4374 != -1 && local328.anInt4374 != -1) {
										local345 = Static116.aClass140_2.method3287(local323.anInt4374);
										local351 = Static116.aClass140_2.method3287(local328.anInt4374);
										if (local351.anInt2065 > local345.anInt2065) {
											local295 = false;
										}
									}
								}
							}
							if (local295) {
								if (local254) {
									local278.anInt7393 = local73 & 0x7;
									local278.anInt7346 = local235 + Static412.anInt575;
									local278.anInt7360 = 0;
									local278.anInt7356 = local227;
									local278.anInt7343 = 1;
									local278.anInt7341 = local239;
									local278.anInt7407 = 0;
									if (local278.anInt7346 > Static412.anInt575) {
										local278.anInt7360 = -1;
									}
									if (local278.anInt7356 == 65535) {
										local278.anInt7356 = -1;
									}
									if (local278.anInt7356 != -1 && Static412.anInt575 == local278.anInt7346) {
										local461 = Static215.aClass33_1.method587(local278.anInt7356).anInt4374;
										if (local461 != -1) {
											local379 = Static116.aClass140_2.method3287(local461);
											if (local379 != null && local379.anIntArray108 != null) {
												Static434.method4018(local278.aByte112, local379, local278.anInt8761, local278.anInt8764, 0, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == local278);
											}
										}
									}
								} else {
									local278.anInt7364 = 0;
									local278.anInt7354 = local73 & 0x7;
									local278.anInt7383 = 1;
									local278.anInt7368 = local227;
									local278.anInt7376 = local235 + Static412.anInt575;
									local278.anInt7384 = local239;
									local278.anInt7402 = 0;
									if (local278.anInt7376 > Static412.anInt575) {
										local278.anInt7402 = -1;
									}
									if (local278.anInt7368 == 65535) {
										local278.anInt7368 = -1;
									}
									if (local278.anInt7368 != -1 && Static412.anInt575 == local278.anInt7376) {
										local461 = Static215.aClass33_1.method587(local278.anInt7368).anInt4374;
										if (local461 != -1) {
											local379 = Static116.aClass140_2.method3287(local461);
											if (local379 != null && local379.anIntArray108 != null) {
												Static434.method4018(local278.aByte112, local379, local278.anInt8761, local278.anInt8764, 0, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 == local278);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local273 = local243 >> 28 & 0x3;
					local875 = (local243 >> 14 & 0x3FFF) - Static35.anInt906;
					local882 = (local243 & 0x3FFF) - Static130.anInt5246;
					if (local875 >= 0 && local882 >= 0 && Static188.anInt3850 > local875 && Static49.anInt1174 > local882) {
						local303 = local875 * 512 + 256;
						local461 = local882 * 512 + 256;
						local756 = local273;
						if (local273 < 3 && Static551.method7475(local882, local875)) {
							local756 = local273 + 1;
						}
						@Pc(949) Class6_Sub1_Sub1_Sub5 local949 = new Class6_Sub1_Sub1_Sub5(local227, 0, Static412.anInt575, local273, local756, local303, Static524.method7217(local303, local273, local461) - local239, local461, local875, local875, local882, local882, local73 & 0x7);
						Static472.aClass8_55.method212(new Class2_Sub3_Sub17(local949));
					}
				}
				Static497.aClass363_245 = null;
				return true;
			} else if (Static197.aClass363_99 == Static497.aClass363_245) {
				Static70.aClass78_1.method1465();
				Static497.aClass363_245 = null;
				Static202.anInt3969 += 32;
				return true;
			} else if (Static95.aClass363_55 == Static497.aClass363_245) {
				Static145.method2413(Static478.aClass113_17);
				Static497.aClass363_245 = null;
				return true;
			} else if (Static497.aClass363_245 == Static379.aClass363_189) {
				Static43.method6513(false);
				Static497.aClass363_245 = null;
				return true;
			} else if (Static497.aClass363_245 == Static273.aClass363_135) {
				Static245.method3795();
				Static497.aClass363_245 = null;
				return true;
			} else if (Static497.aClass363_245 == Static487.aClass363_238) {
				Static133.aClass2_Sub15_Sub2_1.anInt5241 += 28;
				if (Static133.aClass2_Sub15_Sub2_1.method4345()) {
					Static322.method5004(Static133.aClass2_Sub15_Sub2_1, Static133.aClass2_Sub15_Sub2_1.anInt5241 - 28);
				}
				Static497.aClass363_245 = null;
				return true;
			} else if (Static461.aClass363_224 == Static497.aClass363_245) {
				Static145.method2413(Static183.aClass113_8);
				Static497.aClass363_245 = null;
				return true;
			} else if (Static330.aClass363_163 == Static497.aClass363_245) {
				local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
				if (Static51.method900(local227)) {
					Static74.method1179();
				}
				Static497.aClass363_245 = null;
				return true;
			} else if (Static497.aClass363_245 == Static134.aClass363_77) {
				local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
				local73 = Static133.aClass2_Sub15_Sub2_1.method4291();
				local235 = Static133.aClass2_Sub15_Sub2_1.method4307();
				if (Static51.method900(local227)) {
					Static302.method4545(local73, local235);
				}
				Static497.aClass363_245 = null;
				return true;
			} else {
				@Pc(1120) Class2_Sub44 local1120;
				if (Static593.aClass363_283 == Static497.aClass363_245) {
					local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
					local73 = Static133.aClass2_Sub15_Sub2_1.method4310();
					local235 = Static133.aClass2_Sub15_Sub2_1.method4298();
					if (Static51.method900(local227)) {
						@Pc(1113) Class2_Sub44 local1113 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local73);
						local1120 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local235);
						if (local1120 != null) {
							Static564.method7655(false, local1113 == null || local1113.anInt8608 != local1120.anInt8608, local1120);
						}
						if (local1113 != null) {
							local1113.method7966();
							Static217.aClass162_20.method3522(local1113, (long) local235);
						}
						@Pc(1157) Class196 local1157 = Static117.method1748(local73);
						if (local1157 != null) {
							Static515.method7134(local1157);
						}
						local1157 = Static117.method1748(local235);
						if (local1157 != null) {
							Static515.method7134(local1157);
							Static274.method4155(local1157, true);
						}
						if (Static554.anInt9121 != -1) {
							Static58.method952(Static554.anInt9121, 1);
						}
					}
					Static497.aClass363_245 = null;
					return true;
				}
				@Pc(1205) boolean local1205;
				@Pc(1211) String local1211;
				@Pc(1209) String local1209;
				@Pc(1254) String local1254;
				if (Static46.aClass363_37 == Static497.aClass363_245) {
					local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
					local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
					local1211 = local1209;
					if (local1205) {
						local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
					}
					local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local243 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local254 = false;
					if (local239 <= 1 && Static431.method6124(local1211)) {
						local254 = true;
					}
					if (!local254 && Static476.anInt8172 == 0) {
						local1254 = Static541.aClass304_2.method6809(local243).method7361(Static133.aClass2_Sub15_Sub2_1);
						if (local239 == 2) {
							Static21.method417(local1209, local1254, 25, 0, local243, "<img=1>" + local1211, null, "<img=1>" + local1209);
						} else if (local239 == 1) {
							Static21.method417(local1209, local1254, 25, 0, local243, "<img=0>" + local1211, null, "<img=0>" + local1209);
						} else {
							Static21.method417(local1209, local1254, 25, 0, local243, local1211, null, local1209);
						}
					}
					Static497.aClass363_245 = null;
					return true;
				} else if (Static497.aClass363_245 == Static394.aClass363_131) {
					local227 = Static133.aClass2_Sub15_Sub2_1.method4322();
					local73 = Static133.aClass2_Sub15_Sub2_1.method4323();
					local235 = Static133.aClass2_Sub15_Sub2_1.method4291();
					if (local235 == 65535) {
						local235 = -1;
					}
					Static18.method321(local235, local73, local227);
					Static497.aClass363_245 = null;
					return true;
				} else if (Static497.aClass363_245 == Static423.aClass363_210) {
					local227 = Static133.aClass2_Sub15_Sub2_1.method4303();
					local73 = Static133.aClass2_Sub15_Sub2_1.method4343();
					if (local73 == 65535) {
						local73 = -1;
					}
					local235 = Static133.aClass2_Sub15_Sub2_1.method4338();
					Static110.method1656(local235, local227, local73);
					Static497.aClass363_245 = null;
					return true;
				} else if (Static497.aClass363_245 == Static291.aClass363_142) {
					Static250.method3918();
					Static497.aClass363_245 = null;
					return false;
				} else if (Static497.aClass363_245 == Static487.aClass363_237) {
					local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
					local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (Static51.method900(local235)) {
						Static569.method7715(local73, local227);
					}
					Static497.aClass363_245 = null;
					return true;
				} else if (Static497.aClass363_245 == Static209.aClass363_106) {
					Static578.anInt9401 = Static133.aClass2_Sub15_Sub2_1.method4323();
					Static489.anInt8257 = Static133.aClass2_Sub15_Sub2_1.method4344() << 3;
					Static233.anInt4337 = Static133.aClass2_Sub15_Sub2_1.method4309() << 3;
					while (Static133.aClass2_Sub15_Sub2_1.anInt5241 < Static65.anInt1500) {
						@Pc(1449) Class113 local1449 = Static148.method2482()[Static133.aClass2_Sub15_Sub2_1.method4325()];
						Static145.method2413(local1449);
					}
					Static497.aClass363_245 = null;
					return true;
				} else {
					@Pc(1496) String local1496;
					@Pc(1500) String local1500;
					@Pc(1486) String local1486;
					if (Static497.aClass363_245 == Static289.aClass363_141) {
						local227 = Static133.aClass2_Sub15_Sub2_1.method4325();
						@Pc(1478) boolean local1478 = (local227 & 0x1) == 1;
						local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
						local1486 = Static133.aClass2_Sub15_Sub2_1.method4324();
						if (local1486.equals("")) {
							local1486 = local1211;
						}
						local1496 = Static133.aClass2_Sub15_Sub2_1.method4324();
						local1500 = Static133.aClass2_Sub15_Sub2_1.method4324();
						if (local1500.equals("")) {
							local1500 = local1496;
						}
						if (local1478) {
							for (local273 = 0; local273 < Static81.anInt1768; local273++) {
								if (Static461.aStringArray144[local273].equals(local1500)) {
									Static360.aStringArray115[local273] = local1211;
									Static461.aStringArray144[local273] = local1486;
									Static323.aStringArray99[local273] = local1496;
									Static408.aStringArray133[local273] = local1500;
									break;
								}
							}
						} else {
							Static360.aStringArray115[Static81.anInt1768] = local1211;
							Static461.aStringArray144[Static81.anInt1768] = local1486;
							Static323.aStringArray99[Static81.anInt1768] = local1496;
							Static408.aStringArray133[Static81.anInt1768] = local1500;
							Static128.aBooleanArray12[Static81.anInt1768] = (local227 & 0x2) == 2;
							Static81.anInt1768++;
						}
						Static455.anInt7881 = Static500.anInt8403;
						Static497.aClass363_245 = null;
						return true;
					} else if (Static497.aClass363_245 == Static3.aClass363_5) {
						if (Static407.method5922(Static201.anInt3963)) {
							Static94.anInt1996 = (int) ((float) Static133.aClass2_Sub15_Sub2_1.method4294() * 2.5F);
						} else {
							Static94.anInt1996 = Static133.aClass2_Sub15_Sub2_1.method4294() * 30;
						}
						Static497.aClass363_245 = null;
						Static504.anInt8433 = Static500.anInt8403;
						return true;
					} else {
						@Pc(1645) int local1645;
						if (Static497.aClass363_245 == Static64.aClass363_45) {
							local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
							local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local235 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local243 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local1645 = Static133.aClass2_Sub15_Sub2_1.method4294();
							if (Static51.method900(local227)) {
								Static536.aBooleanArray39[local73] = true;
								Static467.anIntArray529[local73] = local235;
								Static328.anIntArray425[local73] = local239;
								Static541.anIntArray641[local73] = local243;
								Static182.anIntArray216[local73] = local1645;
							}
							Static497.aClass363_245 = null;
							return true;
						} else if (Static574.aClass363_275 == Static497.aClass363_245) {
							local227 = Static133.aClass2_Sub15_Sub2_1.method4322();
							local73 = Static133.aClass2_Sub15_Sub2_1.method4323();
							if (local73 == 255) {
								local227 = -1;
								local73 = -1;
							}
							Static173.method2986(local73, local227);
							Static497.aClass363_245 = null;
							return true;
						} else if (Static461.aClass363_225 == Static497.aClass363_245) {
							local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
							local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local235 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local239 = Static133.aClass2_Sub15_Sub2_1.method4294() << 2;
							local243 = Static133.aClass2_Sub15_Sub2_1.method4325();
							local1645 = Static133.aClass2_Sub15_Sub2_1.method4325();
							if (Static51.method900(local227)) {
								Static233.method3627(local243, local73, local235, local239, local1645);
							}
							Static497.aClass363_245 = null;
							return true;
						} else if (Static497.aClass363_245 == Static100.aClass363_60) {
							Static290.anInt5293 = Static133.aClass2_Sub15_Sub2_1.method4348();
							Static216.aBoolean339 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
							Static497.aClass363_245 = null;
							return true;
						} else {
							@Pc(1781) String local1781;
							if (Static497.aClass363_245 == Static409.aClass363_203) {
								local1781 = Static133.aClass2_Sub15_Sub2_1.method4324();
								local1209 = Static87.method1359(Static374.method5548(Static133.aClass2_Sub15_Sub2_1));
								Static375.method5567(local1781, local1209, 6, local1781, 0, local1781);
								Static497.aClass363_245 = null;
								return true;
							} else if (Static34.aClass363_27 == Static497.aClass363_245) {
								local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
								local73 = Static133.aClass2_Sub15_Sub2_1.method4343();
								local235 = Static133.aClass2_Sub15_Sub2_1.method4307();
								local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
								if (Static51.method900(local73)) {
									local1120 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local235);
									if (local1120 != null) {
										Static564.method7655(false, local227 != local1120.anInt8608, local1120);
									}
									Static259.method4033(false, local239, local235, local227);
								}
								Static497.aClass363_245 = null;
								return true;
							} else if (Static250.aClass363_122 == Static497.aClass363_245) {
								local227 = Static133.aClass2_Sub15_Sub2_1.method4325();
								local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
								local235 = Static133.aClass2_Sub15_Sub2_1.method4343();
								if (local235 == 65535) {
									local235 = -1;
								}
								local239 = Static133.aClass2_Sub15_Sub2_1.method4338();
								if (local227 >= 1 && local227 <= 8) {
									if (local1209.equalsIgnoreCase("null")) {
										local1209 = null;
									}
									Static461.aStringArray145[local227 - 1] = local1209;
									Static282.anIntArray344[local227 - 1] = local235;
									Static421.aBooleanArray30[local227 - 1] = local239 == 0;
								}
								Static497.aClass363_245 = null;
								return true;
							} else {
								@Pc(1977) Class150 local1977;
								@Pc(1942) boolean local1942;
								if (Static207.aClass363_105 == Static497.aClass363_245) {
									local1781 = Static133.aClass2_Sub15_Sub2_1.method4324();
									local1942 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
									if (local1942) {
										local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
									} else {
										local1209 = local1781;
									}
									local239 = Static133.aClass2_Sub15_Sub2_1.method4294();
									@Pc(1960) byte local1960 = Static133.aClass2_Sub15_Sub2_1.method4304();
									local254 = false;
									if (local1960 == -128) {
										local254 = true;
									}
									if (local254) {
										if (Static584.anInt9522 == 0) {
											Static497.aClass363_245 = null;
											return true;
										}
										for (local273 = 0; Static584.anInt9522 > local273 && (!Static350.aClass150Array1[local273].aString29.equals(local1209) || local239 != Static350.aClass150Array1[local273].anInt4104); local273++) {
										}
										if (Static584.anInt9522 > local273) {
											while (Static584.anInt9522 - 1 > local273) {
												Static350.aClass150Array1[local273] = Static350.aClass150Array1[local273 + 1];
												local273++;
											}
											Static584.anInt9522--;
											Static350.aClass150Array1[Static584.anInt9522] = null;
										}
									} else {
										local1254 = Static133.aClass2_Sub15_Sub2_1.method4324();
										local1977 = new Class150();
										local1977.aString29 = local1209;
										local1977.aString26 = local1781;
										local1977.aString27 = Static281.method4201(local1977.aString29);
										local1977.anInt4104 = local239;
										local1977.aString28 = local1254;
										local1977.aByte52 = local1960;
										for (local882 = Static584.anInt9522 - 1; local882 >= 0; local882--) {
											local303 = Static350.aClass150Array1[local882].aString27.compareTo(local1977.aString27);
											if (local303 == 0) {
												Static350.aClass150Array1[local882].anInt4104 = local239;
												Static350.aClass150Array1[local882].aByte52 = local1960;
												Static350.aClass150Array1[local882].aString28 = local1254;
												if (local1209.equals(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67)) {
													Static60.aByte29 = local1960;
												}
												Static445.anInt7791 = Static500.anInt8403;
												Static497.aClass363_245 = null;
												return true;
											}
											if (local303 < 0) {
												break;
											}
										}
										if (Static584.anInt9522 >= Static350.aClass150Array1.length) {
											Static497.aClass363_245 = null;
											return true;
										}
										for (local303 = Static584.anInt9522 - 1; local303 > local882; local303--) {
											Static350.aClass150Array1[local303 + 1] = Static350.aClass150Array1[local303];
										}
										if (Static584.anInt9522 == 0) {
											Static350.aClass150Array1 = new Class150[100];
										}
										Static350.aClass150Array1[local882 + 1] = local1977;
										Static584.anInt9522++;
										if (local1209.equals(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67)) {
											Static60.aByte29 = local1960;
										}
									}
									Static497.aClass363_245 = null;
									Static445.anInt7791 = Static500.anInt8403;
									return true;
								} else if (Static95.aClass363_57 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4306();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
									local1942 = (local73 & 0x1) == 1;
									Static423.method6082(local1942, local227);
									Static217.anIntArray261[Static396.anInt4772++ & 0x1F] = local227;
									Static497.aClass363_245 = null;
									return true;
								} else if (Static117.aClass363_70 == Static497.aClass363_245) {
									Static145.method2413(Static226.aClass113_12);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static581.aClass363_278) {
									Static485.method6807(Static133.aClass2_Sub15_Sub2_1, Static65.anInt1500);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static215.aClass363_109 == Static497.aClass363_245) {
									Static145.method2413(Static175.aClass113_5);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static496.aClass363_244 == Static497.aClass363_245) {
									Static497.aClass363_245 = null;
									return false;
								} else if (Static397.aClass363_196 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4325();
									if (Static133.aClass2_Sub15_Sub2_1.method4325() == 0) {
										Static286.aClass239Array1[local227] = new Class239();
									} else {
										Static133.aClass2_Sub15_Sub2_1.anInt5241--;
										Static286.aClass239Array1[local227] = new Class239(Static133.aClass2_Sub15_Sub2_1);
									}
									Static229.anInt4293 = Static500.anInt8403;
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static99.aClass363_59) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4287();
									Static70.aClass78_1.method1462(local227, local73);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static3.aClass363_4) {
									Static145.method2413(Static505.aClass113_19);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static95.aClass363_56) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4325();
									local73 = local227 >> 5;
									local235 = local227 & 0x1F;
									if (local235 == 0) {
										Static134.aClass246Array1[local73] = null;
										Static497.aClass363_245 = null;
										return true;
									}
									@Pc(2375) Class246 local2375 = new Class246();
									local2375.anInt6838 = local235;
									local2375.anInt6839 = Static133.aClass2_Sub15_Sub2_1.method4325();
									if (local2375.anInt6839 >= 0 && local2375.anInt6839 < Static568.aClass39Array19.length) {
										if (local2375.anInt6838 == 1 || local2375.anInt6838 == 10) {
											local2375.anInt6841 = Static133.aClass2_Sub15_Sub2_1.method4294();
											Static133.aClass2_Sub15_Sub2_1.anInt5241 += 6;
										} else if (local2375.anInt6838 >= 2 && local2375.anInt6838 <= 6) {
											if (local2375.anInt6838 == 2) {
												local2375.anInt6849 = 256;
												local2375.anInt6844 = 256;
											}
											if (local2375.anInt6838 == 3) {
												local2375.anInt6844 = 256;
												local2375.anInt6849 = 0;
											}
											if (local2375.anInt6838 == 4) {
												local2375.anInt6844 = 256;
												local2375.anInt6849 = 512;
											}
											if (local2375.anInt6838 == 5) {
												local2375.anInt6849 = 256;
												local2375.anInt6844 = 0;
											}
											if (local2375.anInt6838 == 6) {
												local2375.anInt6849 = 256;
												local2375.anInt6844 = 512;
											}
											local2375.anInt6838 = 2;
											local2375.anInt6850 = Static133.aClass2_Sub15_Sub2_1.method4325();
											local2375.anInt6849 += Static133.aClass2_Sub15_Sub2_1.method4294() - Static35.anInt906 << 9;
											local2375.anInt6844 += Static133.aClass2_Sub15_Sub2_1.method4294() - Static130.anInt5246 << 9;
											local2375.anInt6840 = Static133.aClass2_Sub15_Sub2_1.method4325() << 2;
											local2375.anInt6842 = Static133.aClass2_Sub15_Sub2_1.method4294();
										}
										local2375.anInt6843 = Static133.aClass2_Sub15_Sub2_1.method4294();
										if (local2375.anInt6843 == 65535) {
											local2375.anInt6843 = -1;
										}
										Static134.aClass246Array1[local73] = local2375;
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static401.aClass363_199 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4317();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4307();
									if (Static51.method900(local227)) {
										Static476.method6770(local73, local235);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static305.aClass363_147 == Static497.aClass363_245) {
									Static138.anInt2888 = 1;
									Static497.aClass363_245 = null;
									Static455.anInt7881 = Static500.anInt8403;
									return true;
								} else if (Static525.aClass363_284 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4317();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4343();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4310();
									local239 = Static133.aClass2_Sub15_Sub2_1.method4334();
									if (Static51.method900(local73)) {
										Static579.method7830(local239, local235, local227);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static144.aClass363_81 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
									if (local227 == 65535) {
										local227 = -1;
									}
									local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
									local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
									Static385.method5669(local227, local73, local235, local239, true);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static528.aClass363_256 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
									local239 = Static133.aClass2_Sub15_Sub2_1.method4294();
									if (Static51.method900(local227) && Static2.aClass196ArrayArray1[local73] != null) {
										for (local243 = local235; local243 < local239; local243++) {
											local1645 = Static133.aClass2_Sub15_Sub2_1.method4341();
											if (Static2.aClass196ArrayArray1[local73].length > local243 && Static2.aClass196ArrayArray1[local73][local243] != null) {
												Static2.aClass196ArrayArray1[local73][local243].anInt5137 = local1645;
											}
										}
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static504.aClass363_250) {
									Static476.method6766(Static356.aClass287_5, Static65.anInt1500, Static133.aClass2_Sub15_Sub2_1);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static272.aClass363_134 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4310();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
									if (Static51.method900(local235)) {
										Static29.method543(local227, local73);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static95.aClass363_58) {
									Static81.anInt1768 = Static133.aClass2_Sub15_Sub2_1.method4325();
									for (local227 = 0; local227 < Static81.anInt1768; local227++) {
										Static360.aStringArray115[local227] = Static133.aClass2_Sub15_Sub2_1.method4324();
										Static461.aStringArray144[local227] = Static133.aClass2_Sub15_Sub2_1.method4324();
										if (Static461.aStringArray144[local227].equals("")) {
											Static461.aStringArray144[local227] = Static360.aStringArray115[local227];
										}
										Static323.aStringArray99[local227] = Static133.aClass2_Sub15_Sub2_1.method4324();
										Static408.aStringArray133[local227] = Static133.aClass2_Sub15_Sub2_1.method4324();
										if (Static408.aStringArray133[local227].equals("")) {
											Static408.aStringArray133[local227] = Static323.aStringArray99[local227];
										}
										Static128.aBooleanArray12[local227] = false;
									}
									Static455.anInt7881 = Static500.anInt8403;
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static481.aClass363_236) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
									@Pc(2864) byte local2864 = Static133.aClass2_Sub15_Sub2_1.method4344();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4343();
									if (Static51.method900(local235)) {
										Static553.method7568(local227, local2864);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static285.aClass363_172 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4307();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4306();
									if (Static51.method900(local73)) {
										Static447.method6414(5, Static222.anInt4184, local227, 0);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static34.aClass363_26) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4298();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4343();
									if (local73 == 65535) {
										local73 = -1;
									}
									local235 = Static133.aClass2_Sub15_Sub2_1.method4306();
									if (Static51.method900(local235)) {
										Static216.method3479(local227, local73);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static503.aClass363_249 == Static497.aClass363_245) {
									Static403.method5890(Static133.aClass2_Sub15_Sub2_1.method4324());
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static439.aClass363_219) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4306();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4310();
									local239 = Static133.aClass2_Sub15_Sub2_1.method4306();
									if (Static51.method900(local73)) {
										Static201.method3291(local235, (local227 << 16) + local239);
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static17.aClass363_14) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4310();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4323();
									local235 = Static133.aClass2_Sub15_Sub2_1.method4325();
									Static331.anIntArray426[local73] = local227;
									Static234.anIntArray279[local73] = local235;
									Static86.anIntArray96[local73] = 1;
									local239 = Static130.anIntArray364[local73] - 1;
									for (local243 = 0; local243 < local239; local243++) {
										if (Class2_Sub3_Sub1.anIntArray578[local243] <= local227) {
											Static86.anIntArray96[local73] = local243 + 2;
										}
									}
									Static206.anIntArray242[Static193.anInt3881++ & 0x1F] = local73;
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static365.aClass363_179) {
									Static145.method2413(Static400.aClass113_15);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static566.aClass363_270 == Static497.aClass363_245) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4322();
									local73 = Static133.aClass2_Sub15_Sub2_1.method4306();
									Static70.aClass78_1.method1462(local73, local227);
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static427.aClass363_213) {
									local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
									if (Static51.method900(local227)) {
										Static315.method7016();
									}
									Static497.aClass363_245 = null;
									return true;
								} else if (Static497.aClass363_245 == Static268.aClass363_282) {
									Static356.method5273();
									Static497.aClass363_245 = null;
									return false;
								} else {
									@Pc(3149) long local3149;
									@Pc(3154) long local3154;
									if (Static497.aClass363_245 == Static433.aClass363_214) {
										local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
										local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
										local1211 = local1209;
										if (local1205) {
											local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
										}
										local3149 = Static133.aClass2_Sub15_Sub2_1.method4294();
										local3154 = Static133.aClass2_Sub15_Sub2_1.method4341();
										local875 = Static133.aClass2_Sub15_Sub2_1.method4325();
										local882 = Static133.aClass2_Sub15_Sub2_1.method4294();
										@Pc(3169) long local3169 = (local3149 << 32) + local3154;
										@Pc(3171) boolean local3171 = false;
										local382 = 0;
										while (true) {
											if (local382 >= 100) {
												if (local875 <= 1 && Static431.method6124(local1211)) {
													local3171 = true;
												}
												break;
											}
											if (Static171.aLongArray14[local382] == local3169) {
												local3171 = true;
												break;
											}
											local382++;
										}
										if (!local3171 && Static476.anInt8172 == 0) {
											Static171.aLongArray14[Static36.anInt910] = local3169;
											Static36.anInt910 = (Static36.anInt910 + 1) % 100;
											@Pc(3227) String local3227 = Static541.aClass304_2.method6809(local882).method7361(Static133.aClass2_Sub15_Sub2_1);
											if (local875 == 2) {
												Static21.method417(local1209, local3227, 18, 0, local882, "<img=1>" + local1211, null, "<img=1>" + local1209);
											} else if (local875 == 1) {
												Static21.method417(local1209, local3227, 18, 0, local882, "<img=0>" + local1211, null, "<img=0>" + local1209);
											} else {
												Static21.method417(local1209, local3227, 18, 0, local882, local1211, null, local1209);
											}
										}
										Static497.aClass363_245 = null;
										return true;
									}
									@Pc(3352) long local3352;
									@Pc(3358) Class2_Sub35 local3358;
									@Pc(3367) Class2_Sub35 local3367;
									if (Static497.aClass363_245 == Static445.aClass363_221) {
										local227 = Static133.aClass2_Sub15_Sub2_1.method4306();
										if (local227 == 65535) {
											local227 = -1;
										}
										local73 = Static133.aClass2_Sub15_Sub2_1.method4291();
										if (local73 == 65535) {
											local73 = -1;
										}
										local235 = Static133.aClass2_Sub15_Sub2_1.method4306();
										local239 = Static133.aClass2_Sub15_Sub2_1.method4298();
										local243 = Static133.aClass2_Sub15_Sub2_1.method4291();
										if (Static51.method900(local235)) {
											for (local1645 = local227; local1645 <= local73; local1645++) {
												local3352 = (long) local1645 + ((long) local239 << 32);
												local3358 = (Class2_Sub35) Static9.aClass162_2.method3519(local3352);
												if (local3358 != null) {
													local3367 = new Class2_Sub35(local3358.anInt6464, local243);
													local3358.method7966();
												} else if (local1645 == -1) {
													local3367 = new Class2_Sub35(Static117.method1748(local239).aClass2_Sub35_1.anInt6464, local243);
												} else {
													local3367 = new Class2_Sub35(0, local243);
												}
												Static9.aClass162_2.method3522(local3367, local3352);
											}
										}
										Static497.aClass363_245 = null;
										return true;
									} else if (Static497.aClass363_245 == Static233.aClass363_116) {
										Static145.method2413(Static210.aClass113_9);
										Static497.aClass363_245 = null;
										return true;
									} else if (Static497.aClass363_245 == Static260.aClass363_128) {
										Static3.anInt12 = Static133.aClass2_Sub15_Sub2_1.method4338();
										Static138.anInt2874 = Static133.aClass2_Sub15_Sub2_1.method4322();
										Static497.aClass363_245 = null;
										return true;
									} else if (Static497.aClass363_245 == Static360.aClass363_176) {
										local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
										local73 = Static133.aClass2_Sub15_Sub2_1.method4287();
										if (Static51.method900(local227)) {
											Static447.method6414(3, -1, local73, -1);
										}
										Static497.aClass363_245 = null;
										return true;
									} else {
										@Pc(3498) boolean local3498;
										if (Static497.aClass363_245 == Static4.aClass363_272) {
											while (Static133.aClass2_Sub15_Sub2_1.anInt5241 < Static65.anInt1500) {
												local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
												local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
												local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
												local239 = Static133.aClass2_Sub15_Sub2_1.method4294();
												local243 = Static133.aClass2_Sub15_Sub2_1.method4325();
												local1500 = "";
												local3498 = false;
												if (local239 > 0) {
													local1500 = Static133.aClass2_Sub15_Sub2_1.method4324();
													local3498 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
												}
												for (local875 = 0; local875 < Static451.anInt487; local875++) {
													if (local1205) {
														if (local1211.equals(Static306.aStringArray92[local875])) {
															Static306.aStringArray92[local875] = local1209;
															Static362.aStringArray106[local875] = local1211;
															local1209 = null;
															break;
														}
													} else if (local1209.equals(Static306.aStringArray92[local875])) {
														if (Static103.anIntArray134[local875] != local239) {
															local295 = true;
															for (@Pc(3546) Class6_Sub3_Sub2 local3546 = (Class6_Sub3_Sub2) Static349.aClass109_6.method2314(); local3546 != null; local3546 = (Class6_Sub3_Sub2) Static349.aClass109_6.method2312()) {
																if (local3546.aString83.equals(local1209)) {
																	if (local239 != 0 && local3546.aShort87 == 0) {
																		local295 = false;
																		local3546.method7989();
																	} else if (local239 == 0 && local3546.aShort87 != 0) {
																		local3546.method7989();
																		local295 = false;
																	}
																}
															}
															if (local295) {
																Static349.aClass109_6.method2313(new Class6_Sub3_Sub2(local1209, local239));
															}
															Static103.anIntArray134[local875] = local239;
														}
														Static362.aStringArray106[local875] = local1211;
														Static93.aStringArray31[local875] = local1500;
														Static31.anIntArray49[local875] = local243;
														local1209 = null;
														Static88.aBooleanArray9[local875] = local3498;
														break;
													}
												}
												if (local1209 != null && Static451.anInt487 < 200) {
													Static306.aStringArray92[Static451.anInt487] = local1209;
													Static362.aStringArray106[Static451.anInt487] = local1211;
													Static103.anIntArray134[Static451.anInt487] = local239;
													Static93.aStringArray31[Static451.anInt487] = local1500;
													Static31.anIntArray49[Static451.anInt487] = local243;
													Static88.aBooleanArray9[Static451.anInt487] = local3498;
													Static451.anInt487++;
												}
											}
											Static455.anInt7881 = Static500.anInt8403;
											Static138.anInt2888 = 2;
											local73 = Static451.anInt487;
											while (local73 > 0) {
												local1205 = true;
												local73--;
												for (local235 = 0; local235 < local73; local235++) {
													if (Static103.anIntArray134[local235] != Static176.aClass170_3.anInt4548 && Static176.aClass170_3.anInt4548 == Static103.anIntArray134[local235 + 1] || Static103.anIntArray134[local235] == 0 && Static103.anIntArray134[local235 + 1] != 0) {
														local239 = Static103.anIntArray134[local235];
														Static103.anIntArray134[local235] = Static103.anIntArray134[local235 + 1];
														Static103.anIntArray134[local235 + 1] = local239;
														local1496 = Static93.aStringArray31[local235];
														Static93.aStringArray31[local235] = Static93.aStringArray31[local235 + 1];
														Static93.aStringArray31[local235 + 1] = local1496;
														local1500 = Static306.aStringArray92[local235];
														Static306.aStringArray92[local235] = Static306.aStringArray92[local235 + 1];
														Static306.aStringArray92[local235 + 1] = local1500;
														local1254 = Static362.aStringArray106[local235];
														Static362.aStringArray106[local235] = Static362.aStringArray106[local235 + 1];
														Static362.aStringArray106[local235 + 1] = local1254;
														local875 = Static31.anIntArray49[local235];
														Static31.anIntArray49[local235] = Static31.anIntArray49[local235 + 1];
														Static31.anIntArray49[local235 + 1] = local875;
														local295 = Static88.aBooleanArray9[local235];
														Static88.aBooleanArray9[local235] = Static88.aBooleanArray9[local235 + 1];
														local1205 = false;
														Static88.aBooleanArray9[local235 + 1] = local295;
													}
												}
												if (local1205) {
													break;
												}
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static217.aClass363_110) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4307();
											Static474.aClass347_8 = Static356.aClass287_5.method6535(local227);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static15.aClass363_11 == Static497.aClass363_245) {
											Static145.method2413(Static38.aClass113_1);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static146.aClass363_83 == Static497.aClass363_245) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
											local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
											local235 = Static133.aClass2_Sub15_Sub2_1.method4306();
											if (Static51.method900(local235)) {
												Static255.method3970(local1209, local227);
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static9.aClass363_10 == Static497.aClass363_245) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4323();
											local73 = local227 >> 2;
											local235 = local227 & 0x3;
											local239 = Static368.anIntArray450[local73];
											local243 = Static133.aClass2_Sub15_Sub2_1.method4306();
											if (local243 == 65535) {
												local243 = -1;
											}
											local1645 = Static133.aClass2_Sub15_Sub2_1.method4310();
											local273 = local1645 >> 28 & 0x3;
											local875 = local1645 >> 14 & 0x3FFF;
											local875 -= Static35.anInt906;
											local882 = local1645 & 0x3FFF;
											local882 -= Static130.anInt5246;
											Static584.method7921(local73, local243, local239, local273, local882, local235, local875);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static42.aClass363_33) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
											local73 = Static133.aClass2_Sub15_Sub2_1.method4307();
											if (Static51.method900(local227)) {
												@Pc(4024) Class2_Sub44 local4024 = (Class2_Sub44) Static217.aClass162_20.method3519((long) local73);
												if (local4024 != null) {
													Static564.method7655(false, true, local4024);
												}
												if (Static454.aClass196_9 != null) {
													Static515.method7134(Static454.aClass196_9);
													Static454.aClass196_9 = null;
												}
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static225.aClass363_112) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4328();
											local73 = Static133.aClass2_Sub15_Sub2_1.method4307();
											local235 = Static133.aClass2_Sub15_Sub2_1.method4325();
											local1486 = "";
											local1496 = local1486;
											if ((local235 & 0x1) != 0) {
												local1486 = Static133.aClass2_Sub15_Sub2_1.method4324();
												if ((local235 & 0x2) == 0) {
													local1496 = local1486;
												} else {
													local1496 = Static133.aClass2_Sub15_Sub2_1.method4324();
												}
											}
											local1500 = Static133.aClass2_Sub15_Sub2_1.method4324();
											if (local227 == 99) {
												Static212.method3438(local1500);
											} else if (local1496.equals("") || !Static431.method6124(local1496)) {
												Static375.method5567(local1486, local1500, local227, local1496, local73, local1486);
											} else {
												Static497.aClass363_245 = null;
												return true;
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static369.aClass363_182) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
											if (local227 == 65535) {
												local227 = -1;
											}
											local73 = Static133.aClass2_Sub15_Sub2_1.method4307();
											local235 = Static133.aClass2_Sub15_Sub2_1.method4291();
											if (local235 == 65535) {
												local235 = -1;
											}
											local239 = Static133.aClass2_Sub15_Sub2_1.method4294();
											local243 = Static133.aClass2_Sub15_Sub2_1.method4298();
											if (Static51.method900(local239)) {
												for (local1645 = local235; local1645 <= local227; local1645++) {
													local3352 = ((long) local73 << 32) + ((long) local1645);
													local3358 = (Class2_Sub35) Static9.aClass162_2.method3519(local3352);
													if (local3358 != null) {
														local3367 = new Class2_Sub35(local243, local3358.anInt6469);
														local3358.method7966();
													} else if (local1645 == -1) {
														local3367 = new Class2_Sub35(local243, Static117.method1748(local73).aClass2_Sub35_1.anInt6469);
													} else {
														local3367 = new Class2_Sub35(local243, -1);
													}
													Static9.aClass162_2.method3522(local3367, local3352);
												}
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static451.aClass363_13) {
											@Pc(4238) byte local4238 = Static133.aClass2_Sub15_Sub2_1.method4304();
											local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
											Static70.aClass78_1.method1463(local73, local4238);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static334.aClass363_166) {
											local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
											local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
											local1211 = local1209;
											if (local1205) {
												local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
											}
											local3149 = Static133.aClass2_Sub15_Sub2_1.method4294();
											local3154 = Static133.aClass2_Sub15_Sub2_1.method4341();
											local875 = Static133.aClass2_Sub15_Sub2_1.method4325();
											@Pc(4299) long local4299 = (local3149 << 32) + local3154;
											@Pc(4301) boolean local4301 = false;
											local756 = 0;
											while (true) {
												if (local756 >= 100) {
													if (local875 <= 1) {
														if (Static216.aBoolean339 && !Static500.aBoolean652 || Static532.aBoolean675) {
															local4301 = true;
														} else if (Static431.method6124(local1211)) {
															local4301 = true;
														}
													}
													break;
												}
												if (Static171.aLongArray14[local756] == local4299) {
													local4301 = true;
													break;
												}
												local756++;
											}
											if (!local4301 && Static476.anInt8172 == 0) {
												Static171.aLongArray14[Static36.anInt910] = local4299;
												Static36.anInt910 = (Static36.anInt910 + 1) % 100;
												@Pc(4366) String local4366 = Static87.method1359(Static374.method5548(Static133.aClass2_Sub15_Sub2_1));
												if (local875 == 2) {
													Static21.method417(local1209, local4366, 7, 0, -1, "<img=1>" + local1211, null, "<img=1>" + local1209);
												} else if (local875 == 1) {
													Static21.method417(local1209, local4366, 7, 0, -1, "<img=0>" + local1211, null, "<img=0>" + local1209);
												} else {
													Static21.method417(local1209, local4366, 3, 0, -1, local1211, null, local1209);
												}
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static302.aClass363_146 == Static497.aClass363_245) {
											Static145.method2413(Static394.aClass113_11);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static474.aClass363_231) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
											local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
											local235 = Static133.aClass2_Sub15_Sub2_1.method4325();
											local239 = Static133.aClass2_Sub15_Sub2_1.method4294() << 2;
											local243 = Static133.aClass2_Sub15_Sub2_1.method4325();
											local1645 = Static133.aClass2_Sub15_Sub2_1.method4325();
											if (Static51.method900(local227)) {
												Static527.method7270(local73, local243, local1645, true, local235, local239);
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static406.aClass363_201 == Static497.aClass363_245) {
											local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
											@Pc(4518) byte[] local4518 = new byte[Static65.anInt1500 - 1];
											Static133.aClass2_Sub15_Sub2_1.method4346(local4518, Static65.anInt1500 - 1);
											Static506.method7034(local4518, local1205);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static234.aClass363_117 == Static497.aClass363_245) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4291();
											local73 = Static133.aClass2_Sub15_Sub2_1.method4291();
											local235 = Static133.aClass2_Sub15_Sub2_1.method4322();
											if (Static51.method900(local227)) {
												if (local235 == 2) {
													Static533.method7646();
												}
												Static554.anInt9121 = local73;
												Static335.method5131(local73);
												Static75.method1189(false);
												Static552.method7488(Static554.anInt9121);
												for (local239 = 0; local239 < 100; local239++) {
													Static295.aBooleanArray36[local239] = true;
												}
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static52.aClass363_39) {
											local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
											local73 = Static133.aClass2_Sub15_Sub2_1.method4310();
											local235 = Static133.aClass2_Sub15_Sub2_1.method4343();
											if (Static51.method900(local235)) {
												Static516.method7142(local227, local73);
											}
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static362.aClass363_165) {
											Static145.method2413(Static410.aClass113_16);
											Static497.aClass363_245 = null;
											return true;
										} else if (Static497.aClass363_245 == Static436.aClass363_215) {
											Static320.aString49 = Static65.anInt1500 <= 2 ? Static290.aClass198_28.method4365(Static52.anInt1264) : Static133.aClass2_Sub15_Sub2_1.method4324();
											Static233.anInt4344 = Static65.anInt1500 <= 0 ? -1 : Static133.aClass2_Sub15_Sub2_1.method4294();
											Static497.aClass363_245 = null;
											if (Static233.anInt4344 == 65535) {
												Static233.anInt4344 = -1;
											}
											return true;
										} else if (Static2.aClass363_3 == Static497.aClass363_245) {
											Static422.anInt7227 = Static133.aClass2_Sub15_Sub2_1.method4325();
											Static497.aClass363_245 = null;
											return true;
										} else {
											@Pc(4705) boolean local4705;
											if (Static497.aClass363_245 == Static468.aClass363_228) {
												local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
												local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
												local1211 = local1209;
												if (local1205) {
													local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
												}
												local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
												local4705 = false;
												if (local239 <= 1) {
													if (Static216.aBoolean339 && !Static500.aBoolean652 || Static532.aBoolean675) {
														local4705 = true;
													} else if (local239 <= 1 && Static431.method6124(local1211)) {
														local4705 = true;
													}
												}
												if (!local4705 && Static476.anInt8172 == 0) {
													local1500 = Static87.method1359(Static374.method5548(Static133.aClass2_Sub15_Sub2_1));
													if (local239 == 2) {
														Static21.method417(local1209, local1500, 24, 0, -1, "<img=1>" + local1211, null, "<img=1>" + local1209);
													} else if (local239 == 1) {
														Static21.method417(local1209, local1500, 24, 0, -1, "<img=0>" + local1211, null, "<img=0>" + local1209);
													} else {
														Static21.method417(local1209, local1500, 24, 0, -1, local1211, null, local1209);
													}
												}
												Static497.aClass363_245 = null;
												return true;
											} else if (Static232.aClass363_114 == Static497.aClass363_245) {
												Static43.method6513(true);
												Static497.aClass363_245 = null;
												return true;
											} else if (Static133.aClass363_76 == Static497.aClass363_245) {
												local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
												@Pc(4836) Class6_Sub1_Sub1_Sub1_Sub2 local4836;
												if (local227 == Static222.anInt4184) {
													local4836 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2;
												} else {
													local4836 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local227];
												}
												if (local4836 == null) {
													Static497.aClass363_245 = null;
													return true;
												}
												local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
												local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
												local4705 = (local235 & 0x8000) != 0;
												if (local4836.aString67 != null && local4836.aClass194_1 != null) {
													local254 = false;
													if (local239 <= 1) {
														if (!local4705 && (Static216.aBoolean339 && !Static500.aBoolean652 || Static532.aBoolean675)) {
															local254 = true;
														} else if (Static431.method6124(local4836.aString67)) {
															local254 = true;
														}
													}
													if (!local254 && Static476.anInt8172 == 0) {
														local875 = -1;
														if (local4705) {
															local235 &= 0x7FFF;
															@Pc(4927) Class240 local4927 = Static574.method7769(Static133.aClass2_Sub15_Sub2_1);
															local875 = local4927.anInt6704;
															local1254 = local4927.aClass2_Sub3_Sub18_1.method7361(Static133.aClass2_Sub15_Sub2_1);
														} else {
															local1254 = Static87.method1359(Static374.method5548(Static133.aClass2_Sub15_Sub2_1));
														}
														local4836.aString65 = local1254.trim();
														local4836.anInt7359 = local235 >> 8;
														local4836.anInt7413 = local235 & 0xFF;
														local4836.anInt7344 = 150;
														if (local239 == 1 || local239 == 2) {
															local882 = local4705 ? 17 : 1;
														} else {
															local882 = local4705 ? 17 : 2;
														}
														if (local239 == 2) {
															Static21.method417(local4836.aString66, local1254, local882, 0, local875, "<img=1>" + local4836.method6178(), null, "<img=1>" + local4836.method6174());
														} else if (local239 == 1) {
															Static21.method417(local4836.aString66, local1254, local882, 0, local875, "<img=0>" + local4836.method6178(), null, "<img=0>" + local4836.method6174());
														} else {
															Static21.method417(local4836.aString66, local1254, local882, 0, local875, local4836.method6178(), null, local4836.method6174());
														}
													}
												}
												Static497.aClass363_245 = null;
												return true;
											} else if (Static255.aClass363_125 == Static497.aClass363_245) {
												local1781 = Static133.aClass2_Sub15_Sub2_1.method4324();
												local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
												local235 = Static133.aClass2_Sub15_Sub2_1.method4306();
												if (Static51.method900(local73)) {
													Static255.method3970(local1781, local235);
												}
												Static497.aClass363_245 = null;
												return true;
											} else if (Static93.aClass363_54 == Static497.aClass363_245) {
												Static145.method2413(Static105.aClass113_3);
												Static497.aClass363_245 = null;
												return true;
											} else if (Static497.aClass363_245 == Static116.aClass363_69) {
												local227 = Static133.aClass2_Sub15_Sub2_1.method4307();
												local73 = Static133.aClass2_Sub15_Sub2_1.method4306();
												if (Static51.method900(local73)) {
													if (local227 == -1) {
														Static94.anInt2006 = -1;
														Static238.anInt4482 = -1;
													} else {
														local235 = local227 >> 14 & 0x3FFF;
														local235 -= Static35.anInt906;
														local239 = local227 & 0x3FFF;
														if (local235 < 0) {
															local235 = 0;
														} else if (local235 >= Static188.anInt3850) {
															local235 = Static188.anInt3850;
														}
														local239 -= Static130.anInt5246;
														if (local239 < 0) {
															local239 = 0;
														} else if (local239 >= Static49.anInt1174) {
															local239 = Static49.anInt1174;
														}
														Static238.anInt4482 = (local235 << 9) + 256;
														Static94.anInt2006 = (local239 << 9) + 256;
													}
												}
												Static497.aClass363_245 = null;
												return true;
											} else if (Static308.aClass363_149 == Static497.aClass363_245) {
												local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
												local73 = Static133.aClass2_Sub15_Sub2_1.method4310();
												local235 = Static133.aClass2_Sub15_Sub2_1.method4306();
												local239 = Static133.aClass2_Sub15_Sub2_1.method4291();
												local243 = Static133.aClass2_Sub15_Sub2_1.method4306();
												if (Static51.method900(local239)) {
													Static447.method6414(7, local227 | local235 << 16, local73, local243);
												}
												Static497.aClass363_245 = null;
												return true;
											} else {
												@Pc(5279) long local5279;
												if (Static18.aClass363_18 == Static497.aClass363_245) {
													local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
													local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
													local1211 = local1209;
													if (local1205) {
														local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
													}
													local3149 = Static133.aClass2_Sub15_Sub2_1.method4351();
													local3154 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local5279 = Static133.aClass2_Sub15_Sub2_1.method4341();
													local303 = Static133.aClass2_Sub15_Sub2_1.method4325();
													local461 = Static133.aClass2_Sub15_Sub2_1.method4294();
													@Pc(5293) long local5293 = local5279 + (local3154 << 32);
													@Pc(5295) boolean local5295 = false;
													@Pc(5297) int local5297 = 0;
													while (true) {
														if (local5297 >= 100) {
															if (local303 <= 1 && Static431.method6124(local1211)) {
																local5295 = true;
															}
															break;
														}
														if (Static171.aLongArray14[local5297] == local5293) {
															local5295 = true;
															break;
														}
														local5297++;
													}
													if (!local5295 && Static476.anInt8172 == 0) {
														Static171.aLongArray14[Static36.anInt910] = local5293;
														Static36.anInt910 = (Static36.anInt910 + 1) % 100;
														@Pc(5351) String local5351 = Static541.aClass304_2.method6809(local461).method7361(Static133.aClass2_Sub15_Sub2_1);
														if (local303 == 2) {
															Static21.method417(local1209, local5351, 20, 0, local461, "<img=1>" + local1211, Static369.method5497(local3149), "<img=1>" + local1209);
														} else if (local303 == 1) {
															Static21.method417(local1209, local5351, 20, 0, local461, "<img=0>" + local1211, Static369.method5497(local3149), "<img=0>" + local1209);
														} else {
															Static21.method417(local1209, local5351, 20, 0, local461, local1211, Static369.method5497(local3149), local1209);
														}
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static420.aClass363_207) {
													local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
													local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
													local1211 = local1209;
													if (local1205) {
														local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
													}
													local3149 = Static133.aClass2_Sub15_Sub2_1.method4351();
													local3154 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local5279 = Static133.aClass2_Sub15_Sub2_1.method4341();
													local303 = Static133.aClass2_Sub15_Sub2_1.method4325();
													@Pc(5479) long local5479 = (local3154 << 32) + local5279;
													@Pc(5481) boolean local5481 = false;
													local684 = 0;
													while (true) {
														if (local684 >= 100) {
															if (local303 <= 1) {
																if (Static216.aBoolean339 && !Static500.aBoolean652 || Static532.aBoolean675) {
																	local5481 = true;
																} else if (Static431.method6124(local1211)) {
																	local5481 = true;
																}
															}
															break;
														}
														if (Static171.aLongArray14[local684] == local5479) {
															local5481 = true;
															break;
														}
														local684++;
													}
													if (!local5481 && Static476.anInt8172 == 0) {
														Static171.aLongArray14[Static36.anInt910] = local5479;
														Static36.anInt910 = (Static36.anInt910 + 1) % 100;
														@Pc(5543) String local5543 = Static87.method1359(Static374.method5548(Static133.aClass2_Sub15_Sub2_1));
														if (local303 == 2 || local303 == 3) {
															Static21.method417(local1209, local5543, 9, 0, -1, "<img=1>" + local1211, Static369.method5497(local3149), "<img=1>" + local1209);
														} else if (local303 == 1) {
															Static21.method417(local1209, local5543, 9, 0, -1, "<img=0>" + local1211, Static369.method5497(local3149), "<img=0>" + local1209);
														} else {
															Static21.method417(local1209, local5543, 9, 0, -1, local1211, Static369.method5497(local3149), local1209);
														}
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static204.aClass363_104) {
													if (Static554.anInt9121 != -1) {
														Static58.method952(Static554.anInt9121, 0);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static89.aClass363_255 == Static497.aClass363_245) {
													Static145.method2413(Static355.aClass113_14);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static422.aClass363_209) {
													Static254.anInt4709 = Static133.aClass2_Sub15_Sub2_1.method4325();
													Static504.anInt8433 = Static500.anInt8403;
													Static497.aClass363_245 = null;
													return true;
												} else if (Static508.aClass363_252 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4323();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4287();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4291();
													if (Static51.method900(local235)) {
														Static166.method2908(local73, local227);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static395.aClass363_194 == Static497.aClass363_245) {
													Static145.method2413(Static493.aClass113_18);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static219.aClass363_111 == Static497.aClass363_245) {
													for (local227 = 0; local227 < Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1.length; local227++) {
														if (Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local227] != null) {
															Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local227].anIntArray507 = null;
															Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local227].anInt7370 = -1;
														}
													}
													for (local73 = 0; local73 < Static31.anInt820; local73++) {
														Static223.aClass2_Sub32Array1[local73].aClass6_Sub1_Sub1_Sub1_Sub1_1.anIntArray507 = null;
														Static223.aClass2_Sub32Array1[local73].aClass6_Sub1_Sub1_Sub1_Sub1_1.anInt7370 = -1;
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static461.aClass363_223 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4307();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4291();
													if (local235 == 65535) {
														local235 = -1;
													}
													local239 = Static133.aClass2_Sub15_Sub2_1.method4310();
													if (Static51.method900(local73)) {
														Static320.method4952(local239, local235, local227);
														@Pc(5801) Class339 local5801 = Static296.aClass218_1.method5067(local235);
														Static470.method6600(local5801.anInt8990, local5801.anInt9001, local5801.anInt8957, local227);
														Static282.method4206(local5801.anInt8989, local5801.anInt9000, local227, local5801.anInt8975);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static377.aClass363_188) {
													@Pc(5829) int[] local5829 = new int[4];
													for (local73 = 0; local73 < 4; local73++) {
														local5829[local73] = Static133.aClass2_Sub15_Sub2_1.method4343();
													}
													local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local239 = Static133.aClass2_Sub15_Sub2_1.method4322();
													@Pc(5860) Class2_Sub32 local5860 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local235);
													if (local5860 != null) {
														Static36.method637(local5829, local5860.aClass6_Sub1_Sub1_Sub1_Sub1_1, local239);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static258.aClass363_127 == Static497.aClass363_245) {
													Static145.method2413(Static55.aClass113_4);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static312.aClass363_155 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4298();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4298();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4343();
													local239 = Static133.aClass2_Sub15_Sub2_1.method4343();
													if (Static51.method900(local239)) {
														Static447.method6414(5, local235, local73, local227);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static286.aClass363_138) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4307();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
													if (local73 == 65535) {
														local73 = -1;
													}
													local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
													if (Static51.method900(local235)) {
														Static447.method6414(1, local73, local227, -1);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static448.aClass363_217 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4310();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4291();
													if (Static51.method900(local73)) {
														Static553.method7568(local235, local227);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static478.aClass363_234) {
													if (Static125.aFrame1 != null) {
														Static273.method4136(false, -1, -1, Static72.aClass2_Sub12_Sub1_1.anInt1908);
													}
													@Pc(5997) byte[] local5997 = new byte[Static65.anInt1500];
													Static133.aClass2_Sub15_Sub2_1.method4360(Static65.anInt1500, local5997);
													local1209 = Static58.method953(Static65.anInt1500, local5997, 0);
													Static584.method7922(local1209, Static356.aClass287_5, Static391.anInt6846 == 1, true);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static317.aClass363_156 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
													if (local227 == 65535) {
														local227 = -1;
													}
													local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
													Static385.method5669(local227, local73, local235, local239, false);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static8.aClass363_9 == Static497.aClass363_245) {
													Static445.anInt7791 = Static500.anInt8403;
													if (Static65.anInt1500 == 0) {
														Static374.aString60 = null;
														Static350.aClass150Array1 = null;
														Static497.aClass363_245 = null;
														Static452.aString72 = null;
														Static584.anInt9522 = 0;
														return true;
													}
													Static374.aString60 = Static133.aClass2_Sub15_Sub2_1.method4324();
													local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
													if (local1205) {
														Static133.aClass2_Sub15_Sub2_1.method4324();
													}
													@Pc(6110) long local6110 = Static133.aClass2_Sub15_Sub2_1.method4351();
													Static452.aString72 = Static268.method7982(local6110);
													Static206.aByte49 = Static133.aClass2_Sub15_Sub2_1.method4304();
													local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
													if (local239 == 255) {
														Static497.aClass363_245 = null;
														return true;
													}
													Static584.anInt9522 = local239;
													@Pc(6136) Class150[] local6136 = new Class150[100];
													for (local1645 = 0; local1645 < Static584.anInt9522; local1645++) {
														local6136[local1645] = new Class150();
														local6136[local1645].aString26 = Static133.aClass2_Sub15_Sub2_1.method4324();
														local1205 = Static133.aClass2_Sub15_Sub2_1.method4325() == 1;
														if (local1205) {
															local6136[local1645].aString29 = Static133.aClass2_Sub15_Sub2_1.method4324();
														} else {
															local6136[local1645].aString29 = local6136[local1645].aString26;
														}
														local6136[local1645].aString27 = Static281.method4201(local6136[local1645].aString29);
														local6136[local1645].anInt4104 = Static133.aClass2_Sub15_Sub2_1.method4294();
														local6136[local1645].aByte52 = Static133.aClass2_Sub15_Sub2_1.method4304();
														local6136[local1645].aString28 = Static133.aClass2_Sub15_Sub2_1.method4324();
														if (local6136[local1645].aString29.equals(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aString67)) {
															Static60.aByte29 = local6136[local1645].aByte52;
														}
													}
													local882 = Static584.anInt9522;
													while (local882 > 0) {
														local3498 = true;
														local882--;
														for (local303 = 0; local303 < local882; local303++) {
															if (local6136[local303].aString27.compareTo(local6136[local303 + 1].aString27) > 0) {
																local1977 = local6136[local303];
																local6136[local303] = local6136[local303 + 1];
																local3498 = false;
																local6136[local303 + 1] = local1977;
															}
														}
														if (local3498) {
															break;
														}
													}
													Static497.aClass363_245 = null;
													Static350.aClass150Array1 = local6136;
													return true;
												} else if (Static38.aClass363_30 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
													if (local227 == 65535) {
														local227 = -1;
													}
													local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local239 = Static133.aClass2_Sub15_Sub2_1.method4325();
													Static228.method3557(local239, local227, local73, local235);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static360.aClass363_177 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
													local1942 = (local73 & 0x1) == 1;
													while (Static133.aClass2_Sub15_Sub2_1.anInt5241 < Static65.anInt1500) {
														local239 = Static133.aClass2_Sub15_Sub2_1.method4328();
														local243 = Static133.aClass2_Sub15_Sub2_1.method4294();
														local1645 = 0;
														if (local243 != 0) {
															local1645 = Static133.aClass2_Sub15_Sub2_1.method4325();
															if (local1645 == 255) {
																local1645 = Static133.aClass2_Sub15_Sub2_1.method4307();
															}
														}
														Static97.method1483(local1942, local243 - 1, local239, local1645, local227);
													}
													Static217.anIntArray261[Static396.anInt4772++ & 0x1F] = local227;
													Static497.aClass363_245 = null;
													return true;
												} else if (Static123.aClass363_71 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local1209 = Static133.aClass2_Sub15_Sub2_1.method4324();
													@Pc(6438) Object[] local6438 = new Object[local1209.length() + 1];
													for (local239 = local1209.length() - 1; local239 >= 0; local239--) {
														if (local1209.charAt(local239) == 's') {
															local6438[local239 + 1] = Static133.aClass2_Sub15_Sub2_1.method4324();
														} else {
															local6438[local239 + 1] = Integer.valueOf(Static133.aClass2_Sub15_Sub2_1.method4307());
														}
													}
													local6438[0] = Integer.valueOf(Static133.aClass2_Sub15_Sub2_1.method4307());
													if (Static51.method900(local227)) {
														@Pc(6495) Class2_Sub31 local6495 = new Class2_Sub31();
														local6495.anObjectArray32 = local6438;
														Static552.method7490(local6495);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static17.aClass363_15) {
													Static196.aClass315_5 = Static475.method6745(Static133.aClass2_Sub15_Sub2_1.method4325());
													Static497.aClass363_245 = null;
													return true;
												} else if (Static197.aClass363_100 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4338();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
													if (Static51.method900(local73)) {
														Static570.anInt6322 = local227;
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static415.aClass363_205) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4287();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4291();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4343();
													if (local235 == 65535) {
														local235 = -1;
													}
													if (Static51.method900(local73)) {
														Static447.method6414(2, local235, local227, -1);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static478.aClass363_235 == Static497.aClass363_245) {
													local1781 = Static133.aClass2_Sub15_Sub2_1.method4324();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local1211 = Static541.aClass304_2.method6809(local73).method7361(Static133.aClass2_Sub15_Sub2_1);
													Static21.method417(local1781, local1211, 19, 0, local73, local1781, null, local1781);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static319.aClass363_157 == Static497.aClass363_245) {
													Static578.anInt9401 = Static133.aClass2_Sub15_Sub2_1.method4325();
													Static489.anInt8257 = Static133.aClass2_Sub15_Sub2_1.method4309() << 3;
													Static233.anInt4337 = Static133.aClass2_Sub15_Sub2_1.method4309() << 3;
													for (@Pc(6635) Class2_Sub40 local6635 = (Class2_Sub40) Static261.aClass162_35.method3527(); local6635 != null; local6635 = (Class2_Sub40) Static261.aClass162_35.method3523()) {
														local73 = (int) (local6635.aLong268 >> 28 & 0x3L);
														local235 = (int) (local6635.aLong268 & 0x3FFFL);
														local239 = local235 - Static35.anInt906;
														local243 = (int) (local6635.aLong268 >> 14 & 0x3FFFL);
														local1645 = local243 - Static130.anInt5246;
														if (local73 == Static578.anInt9401 && local239 >= Static489.anInt8257 && local239 < Static489.anInt8257 + 8 && local1645 >= Static233.anInt4337 && Static233.anInt4337 + 8 > local1645) {
															local6635.method7966();
															if (local239 >= 0 && local1645 >= 0 && Static188.anInt3850 > local239 && local1645 < Static49.anInt1174) {
																Static46.method793(local1645, Static578.anInt9401, local239);
															}
														}
													}
													for (@Pc(6754) Class2_Sub36 local6754 = (Class2_Sub36) Static524.aClass8_62.method210(); local6754 != null; local6754 = (Class2_Sub36) Static524.aClass8_62.method218()) {
														if (local6754.anInt6574 >= Static489.anInt8257 && local6754.anInt6574 < Static489.anInt8257 + 8 && local6754.anInt6564 >= Static233.anInt4337 && local6754.anInt6564 < Static233.anInt4337 + 8 && Static578.anInt9401 == local6754.anInt6573) {
															local6754.anInt6567 = 0;
														}
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static549.aClass363_263 == Static497.aClass363_245) {
													Static295.method7108(Static527.aBoolean670);
													Static497.aClass363_245 = null;
													return false;
												} else if (Static497.aClass363_245 == Static77.aClass363_281) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4298();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4306();
													Static70.aClass78_1.method1463(local73, local227);
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static436.aClass363_216) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4294();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4325();
													local1942 = (local73 & 0x1) == 1;
													Static207.method3325(local227, local1942);
													local239 = Static133.aClass2_Sub15_Sub2_1.method4294();
													for (local243 = 0; local243 < local239; local243++) {
														local1645 = Static133.aClass2_Sub15_Sub2_1.method4325();
														if (local1645 == 255) {
															local1645 = Static133.aClass2_Sub15_Sub2_1.method4287();
														}
														local273 = Static133.aClass2_Sub15_Sub2_1.method4294();
														Static97.method1483(local1942, local273 - 1, local243, local1645, local227);
													}
													Static217.anIntArray261[Static396.anInt4772++ & 0x1F] = local227;
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static166.aClass363_90) {
													Static578.anInt9401 = Static133.aClass2_Sub15_Sub2_1.method4338();
													Static489.anInt8257 = Static133.aClass2_Sub15_Sub2_1.method4344() << 3;
													Static233.anInt4337 = Static133.aClass2_Sub15_Sub2_1.method4344() << 3;
													Static497.aClass363_245 = null;
													return true;
												} else if (Static38.aClass363_31 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4298();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4306();
													local1211 = Static133.aClass2_Sub15_Sub2_1.method4324();
													if (Static51.method900(local73)) {
														Static540.method7369(local1211, local227);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static49.aClass363_38 == Static497.aClass363_245) {
													local227 = Static133.aClass2_Sub15_Sub2_1.method4343();
													local73 = Static133.aClass2_Sub15_Sub2_1.method4343();
													local235 = Static133.aClass2_Sub15_Sub2_1.method4343();
													local239 = Static133.aClass2_Sub15_Sub2_1.method4306();
													local243 = Static133.aClass2_Sub15_Sub2_1.method4287();
													if (Static51.method900(local227)) {
														Static470.method6600(local73, local239, local235, local243);
													}
													Static497.aClass363_245 = null;
													return true;
												} else if (Static497.aClass363_245 == Static79.aClass363_49) {
													Static145.method2413(Static313.aClass113_13);
													Static497.aClass363_245 = null;
													return true;
												} else {
													Static58.method946("T1 - " + (Static497.aClass363_245 == null ? -1 : Static497.aClass363_245.method7961()) + "," + (Static329.aClass363_162 == null ? -1 : Static329.aClass363_162.method7961()) + "," + (Static261.aClass363_230 == null ? -1 : Static261.aClass363_230.method7961()) + " - " + Static65.anInt1500, null);
													Static295.method7108(false);
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
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BC)Z")
	public static boolean method3210(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static510.aCharArray12;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (local42 == arg0) {
					return true;
				}
			}
		}
		return false;
	}
}
