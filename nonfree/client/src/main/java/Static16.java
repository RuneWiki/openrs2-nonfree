import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public static int anInt492;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "Lclient!hd;")
	public static Class3_Sub8 aClass3_Sub8_1 = new Class3_Sub8(new byte[5000]);

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Lclient!eh;")
	private static Class28 aClass28_189 = Static170.method3101(" has logged out)3");

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "Lclient!eh;")
	public static Class28 aClass28_190 = aClass28_189;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public static int anInt490 = 0;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!gf;B)V")
	public static void method534(@OriginalArg(0) Class33 arg0) {
		if (arg0.anInt1476 == Static165.anInt3995) {
			Static137.aBooleanArray15[arg0.anInt1454] = true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	public static void method535() {
		@Pc(3) int local3 = Static103.anIntArray469[Static140.anInt3583];
		@Pc(7) Class65[] local7 = Static103.aClass65ArrayArray1[Static140.anInt3583];
		Static99.anInt2644 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class65 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt3176 == 1) {
				local27 = local16.anInt3171 + Static175.anInt4185 - Static145.anInt3635;
				if (local27 >= 0 && local27 <= Static175.anInt4185 + Static175.anInt4185) {
					local42 = local16.anInt3167 + Static175.anInt4185 - Static46.anInt1291;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3161 + Static175.anInt4185 - Static46.anInt1291;
					if (local53 > Static175.anInt4185 + Static175.anInt4185) {
						local53 = Static175.anInt4185 + Static175.anInt4185;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static15.aBooleanArrayArray2[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static34.anInt1037 - local16.anInt3163;
						if (local85 > 32) {
							local16.anInt3170 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3170 = 2;
							local85 = -local85;
						}
						local16.anInt3177 = (local16.anInt3166 - Static76.anInt2272 << 8) / local85;
						local16.anInt3164 = (local16.anInt3175 - Static76.anInt2272 << 8) / local85;
						local16.anInt3181 = (local16.anInt3179 - Static125.anInt3217 << 8) / local85;
						local16.anInt3169 = (local16.anInt3180 - Static125.anInt3217 << 8) / local85;
						Static129.aClass65Array1[Static99.anInt2644++] = local16;
					}
				}
			} else if (local16.anInt3176 == 2) {
				local27 = local16.anInt3167 + Static175.anInt4185 - Static46.anInt1291;
				if (local27 >= 0 && local27 <= Static175.anInt4185 + Static175.anInt4185) {
					local42 = local16.anInt3171 + Static175.anInt4185 - Static145.anInt3635;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3172 + Static175.anInt4185 - Static145.anInt3635;
					if (local53 > Static175.anInt4185 + Static175.anInt4185) {
						local53 = Static175.anInt4185 + Static175.anInt4185;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static15.aBooleanArrayArray2[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static76.anInt2272 - local16.anInt3166;
						if (local85 > 32) {
							local16.anInt3170 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt3170 = 4;
							local85 = -local85;
						}
						local16.anInt3165 = (local16.anInt3163 - Static34.anInt1037 << 8) / local85;
						local16.anInt3174 = (local16.anInt3168 - Static34.anInt1037 << 8) / local85;
						local16.anInt3181 = (local16.anInt3179 - Static125.anInt3217 << 8) / local85;
						local16.anInt3169 = (local16.anInt3180 - Static125.anInt3217 << 8) / local85;
						Static129.aClass65Array1[Static99.anInt2644++] = local16;
					}
				}
			} else if (local16.anInt3176 == 4) {
				local27 = local16.anInt3179 - Static125.anInt3217;
				if (local27 > 128) {
					local42 = local16.anInt3167 + Static175.anInt4185 - Static46.anInt1291;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt3161 + Static175.anInt4185 - Static46.anInt1291;
					if (local53 > Static175.anInt4185 + Static175.anInt4185) {
						local53 = Static175.anInt4185 + Static175.anInt4185;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt3171 + Static175.anInt4185 - Static145.anInt3635;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt3172 + Static175.anInt4185 - Static145.anInt3635;
						if (local85 > Static175.anInt4185 + Static175.anInt4185) {
							local85 = Static175.anInt4185 + Static175.anInt4185;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static15.aBooleanArrayArray2[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt3170 = 5;
							local16.anInt3165 = (local16.anInt3163 - Static34.anInt1037 << 8) / local27;
							local16.anInt3174 = (local16.anInt3168 - Static34.anInt1037 << 8) / local27;
							local16.anInt3177 = (local16.anInt3166 - Static76.anInt2272 << 8) / local27;
							local16.anInt3164 = (local16.anInt3175 - Static76.anInt2272 << 8) / local27;
							Static129.aClass65Array1[Static99.anInt2644++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public static void method536() {
		aClass28_189 = null;
		aClass3_Sub8_1 = null;
		aClass28_190 = null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBIII)V")
	public static void method537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static95.anInt2636 == 0 && !Static67.aBoolean109) {
			Static70.method1646(Static171.aClass28_1436, arg0 - arg3, -arg2 + arg1, Static156.aClass28_1306, (short) 14, 0L);
		}
		@Pc(27) long local27 = -1L;
		for (@Pc(34) int local34 = 0; local34 < Static25.anInt218; local34++) {
			@Pc(39) long local39 = Static25.aLongArray2[local34];
			@Pc(44) int local44 = (int) local39 & 0x7F;
			@Pc(51) int local51 = (int) local39 >> 7 & 0x7F;
			@Pc(58) int local58 = (int) local39 >> 29 & 0x3;
			@Pc(65) int local65 = (int) (local39 >>> 32) & Integer.MAX_VALUE;
			if (local27 != local39) {
				local27 = local39;
				@Pc(184) int local184;
				if (local58 == 2 && Static129.method2521(Static171.anInt4109, local44, local51, local39)) {
					@Pc(88) Class3_Sub2_Sub18 local88 = Static86.method1991(local65);
					if (local88.anIntArray699 != null) {
						local88 = local88.method3185();
					}
					if (local88 == null) {
						continue;
					}
					if (Static95.anInt2636 == 1) {
						Static70.method1646(Static85.aClass28_786, local51, local44, Static4.method96(new Class28[] { Static154.aClass28_1288, Static8.aClass28_379, local88.aClass28_1479 }), (short) 49, local39);
					} else if (!Static67.aBoolean109) {
						@Pc(170) Class28[] local170 = local88.aClass28Array24;
						if (Static52.aBoolean79) {
							local170 = Static168.method3099(local170);
						}
						if (local170 != null) {
							for (local184 = 4; local184 >= 0; local184--) {
								if (local170[local184] != null) {
									@Pc(195) short local195 = 0;
									if (local184 == 0) {
										local195 = 42;
									}
									if (local184 == 1) {
										local195 = 6;
									}
									if (local184 == 2) {
										local195 = 20;
									}
									if (local184 == 3) {
										local195 = 10;
									}
									if (local184 == 4) {
										local195 = 1002;
									}
									Static70.method1646(local170[local184], local51, local44, Static4.method96(new Class28[] { Static92.aClass28_1475, local88.aClass28_1479 }), local195, local39);
								}
							}
						}
						Static70.method1646(Static110.aClass28_916, local51, local44, Static4.method96(new Class28[] { Static92.aClass28_1475, local88.aClass28_1479 }), (short) 1006, (long) local88.anInt4238);
					} else if ((Static171.anInt4101 & 0x4) == 4) {
						Static70.method1646(Static30.aClass28_313, local51, local44, Static4.method96(new Class28[] { Static101.aClass28_843, Static8.aClass28_379, local88.aClass28_1479 }), (short) 45, local39);
					}
				}
				@Pc(304) int local304;
				@Pc(311) Class3_Sub2_Sub1_Sub2_Sub2 local311;
				@Pc(355) Class3_Sub2_Sub1_Sub2_Sub1 local355;
				if (local58 == 1) {
					@Pc(283) Class3_Sub2_Sub1_Sub2_Sub2 local283 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local65];
					if (local283.aClass3_Sub2_Sub7_1.anInt1338 == 1 && (local283.anInt1800 & 0x7F) == 64 && (local283.anInt1792 & 0x7F) == 64) {
						for (local304 = 0; local304 < Static69.anInt2115; local304++) {
							local311 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static117.anIntArray523[local304]];
							if (local311 != null && local311 != local283 && local311.aClass3_Sub2_Sub7_1.anInt1338 == 1 && local311.anInt1800 == local283.anInt1800 && local283.anInt1792 == local311.anInt1792) {
								Static119.method2403(Static117.anIntArray523[local304], local311.aClass3_Sub2_Sub7_1, local44, local51);
							}
						}
						for (local184 = 0; local184 < Static112.anInt2872; local184++) {
							local355 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local184]];
							if (local355 != null && local283.anInt1800 == local355.anInt1800 && local283.anInt1792 == local355.anInt1792) {
								Static134.method2619(local355, local51, Static126.anIntArray557[local184], local44);
							}
						}
					}
					Static119.method2403(local65, local283.aClass3_Sub2_Sub7_1, local44, local51);
				}
				if (local58 == 0) {
					@Pc(392) Class3_Sub2_Sub1_Sub2_Sub1 local392 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[local65];
					if ((local392.anInt1800 & 0x7F) == 64 && (local392.anInt1792 & 0x7F) == 64) {
						for (local304 = 0; local304 < Static69.anInt2115; local304++) {
							local311 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[Static117.anIntArray523[local304]];
							if (local311 != null && local311.aClass3_Sub2_Sub7_1.anInt1338 == 1 && local311.anInt1800 == local392.anInt1800 && local392.anInt1792 == local311.anInt1792) {
								Static119.method2403(Static117.anIntArray523[local304], local311.aClass3_Sub2_Sub7_1, local44, local51);
							}
						}
						for (local184 = 0; local184 < Static112.anInt2872; local184++) {
							local355 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local184]];
							if (local355 != null && local355 != local392 && local355.anInt1800 == local392.anInt1800 && local355.anInt1792 == local392.anInt1792) {
								Static134.method2619(local355, local51, Static126.anIntArray557[local184], local44);
							}
						}
					}
					Static134.method2619(local392, local51, local65, local44);
				}
				if (local58 == 3) {
					@Pc(510) Class23 local510 = Static26.aClass23ArrayArrayArray1[Static171.anInt4109][local44][local51];
					if (local510 != null) {
						for (@Pc(517) Class3_Sub2_Sub1_Sub6 local517 = (Class3_Sub2_Sub1_Sub6) local510.method857(); local517 != null; local517 = (Class3_Sub2_Sub1_Sub6) local510.method853()) {
							@Pc(523) Class3_Sub2_Sub10 local523 = Static76.method1736(local517.anInt3483);
							if (Static95.anInt2636 == 1) {
								Static70.method1646(Static85.aClass28_786, local51, local44, Static4.method96(new Class28[] { Static154.aClass28_1288, Static7.aClass28_84, local523.aClass28_566 }), (short) 46, (long) local517.anInt3483);
							} else if (!Static67.aBoolean109) {
								@Pc(567) Class28[] local567 = local523.aClass28Array10;
								if (Static52.aBoolean79) {
									local567 = Static168.method3099(local567);
								}
								for (@Pc(579) int local579 = 4; local579 >= 0; local579--) {
									if (local567 != null && local567[local579] != null) {
										@Pc(588) byte local588 = 0;
										if (local579 == 0) {
											local588 = 16;
										}
										if (local579 == 1) {
											local588 = 36;
										}
										if (local579 == 2) {
											local588 = 26;
										}
										if (local579 == 3) {
											local588 = 39;
										}
										if (local579 == 4) {
											local588 = 28;
										}
										Static70.method1646(local567[local579], local51, local44, Static4.method96(new Class28[] { Static29.aClass28_304, local523.aClass28_566 }), local588, (long) local517.anInt3483);
									} else if (local579 == 2) {
										Static70.method1646(Static5.aClass28_44, local51, local44, Static4.method96(new Class28[] { Static29.aClass28_304, local523.aClass28_566 }), (short) 26, (long) local517.anInt3483);
									}
								}
								Static70.method1646(Static110.aClass28_916, local51, local44, Static4.method96(new Class28[] { Static29.aClass28_304, local523.aClass28_566 }), (short) 1004, (long) local517.anInt3483);
							} else if ((Static171.anInt4101 & 0x1) == 1) {
								Static70.method1646(Static30.aClass28_313, local51, local44, Static4.method96(new Class28[] { Static101.aClass28_843, Static7.aClass28_84, local523.aClass28_566 }), (short) 48, (long) local517.anInt3483);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public static void method538() {
		if (Static135.anInt3444 > 1) {
			Static135.anInt3444--;
		}
		if (Static35.anInt1047 > 0) {
			Static35.anInt1047--;
		}
		if (Static161.aBoolean186) {
			Static161.aBoolean186 = false;
			Static47.method1115();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static100.method2105(); local27++) {
		}
		if (Static137.anInt3514 != 30) {
			return;
		}
		Static79.method1831(Static51.aClass3_Sub8_Sub1_2);
		@Pc(49) Object local49 = Static12.aClass24_1.anObject2;
		@Pc(74) int local74;
		@Pc(76) int local76;
		@Pc(78) int local78;
		@Pc(92) int local92;
		@Pc(112) int local112;
		synchronized (Static12.aClass24_1.anObject2) {
			if (!Static135.aBoolean167) {
				Static12.aClass24_1.anInt1053 = 0;
			} else if (Static87.anInt2539 != 0 || Static12.aClass24_1.anInt1053 >= 40) {
				Static51.aClass3_Sub8_Sub1_2.method1559(248);
				Static51.aClass3_Sub8_Sub1_2.method1550(0);
				local74 = Static51.aClass3_Sub8_Sub1_2.anInt1948;
				local76 = 0;
				for (local78 = 0; local78 < Static12.aClass24_1.anInt1053 && Static51.aClass3_Sub8_Sub1_2.anInt1948 - local74 < 240; local78++) {
					local76++;
					local92 = Static12.aClass24_1.anIntArray190[local78];
					if (local92 < 0) {
						local92 = 0;
					} else if (local92 > 502) {
						local92 = 502;
					}
					local112 = Static12.aClass24_1.anIntArray191[local78];
					if (local112 < 0) {
						local112 = 0;
					} else if (local112 > 764) {
						local112 = 764;
					}
					@Pc(133) int local133 = local112 + local92 * 765;
					if (Static12.aClass24_1.anIntArray190[local78] == -1 && Static12.aClass24_1.anIntArray191[local78] == -1) {
						local92 = -1;
						local133 = 524287;
						local112 = -1;
					}
					if (local112 != Static48.anInt1378 || local92 != Static83.anInt2452) {
						@Pc(179) int local179 = local112 - Static48.anInt1378;
						Static48.anInt1378 = local112;
						@Pc(186) int local186 = local92 - Static83.anInt2452;
						Static83.anInt2452 = local92;
						if (Static133.anInt3379 < 8 && local179 >= -32 && local179 <= 31 && local186 >= -32 && local186 <= 31) {
							local186 += 32;
							local179 += 32;
							Static51.aClass3_Sub8_Sub1_2.method1531(local186 + (Static133.anInt3379 << 12) + (local179 << 6));
							Static133.anInt3379 = 0;
						} else if (Static133.anInt3379 < 8) {
							Static51.aClass3_Sub8_Sub1_2.method1526(local133 + (Static133.anInt3379 << 19) + 8388608);
							Static133.anInt3379 = 0;
						} else {
							Static51.aClass3_Sub8_Sub1_2.method1547((Static133.anInt3379 << 19) + local133 - 1073741824);
							Static133.anInt3379 = 0;
						}
					} else if (Static133.anInt3379 < 2047) {
						Static133.anInt3379++;
					}
				}
				Static51.aClass3_Sub8_Sub1_2.method1522(Static51.aClass3_Sub8_Sub1_2.anInt1948 - local74);
				if (local76 < Static12.aClass24_1.anInt1053) {
					Static12.aClass24_1.anInt1053 -= local76;
					for (local92 = 0; local92 < Static12.aClass24_1.anInt1053; local92++) {
						Static12.aClass24_1.anIntArray191[local92] = Static12.aClass24_1.anIntArray191[local92 + local76];
						Static12.aClass24_1.anIntArray190[local92] = Static12.aClass24_1.anIntArray190[local92 + local76];
					}
				} else {
					Static12.aClass24_1.anInt1053 = 0;
				}
			}
		}
		if (Static87.anInt2539 != 0) {
			@Pc(343) long local343 = (Static168.aLong138 - Static101.aLong90) / 50L;
			local74 = Static160.anInt3914;
			if (local343 > 4095L) {
				local343 = 4095L;
			}
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 502) {
				local74 = 502;
			}
			local76 = Static2.anInt80;
			Static101.aLong90 = Static168.aLong138;
			if (local76 < 0) {
				local76 = 0;
			} else if (local76 > 764) {
				local76 = 764;
			}
			local112 = (int) local343;
			local78 = local76 + local74 * 765;
			@Pc(392) byte local392 = 0;
			if (Static87.anInt2539 == 2) {
				local392 = 1;
			}
			Static51.aClass3_Sub8_Sub1_2.method1559(61);
			Static51.aClass3_Sub8_Sub1_2.method1547((local392 << 19) + ((local112 << 20) + local78));
		}
		if (Static78.aBooleanArray12[96] || Static78.aBooleanArray12[97] || Static78.aBooleanArray12[98] || Static78.aBooleanArray12[99]) {
			Static160.aBoolean183 = true;
		}
		if (Static141.anInt3623 > 0) {
			Static141.anInt3623--;
		}
		if (Static160.aBoolean183 && Static141.anInt3623 <= 0) {
			Static141.anInt3623 = 20;
			Static160.aBoolean183 = false;
			Static51.aClass3_Sub8_Sub1_2.method1559(213);
			Static51.aClass3_Sub8_Sub1_2.method1524(Static139.anInt3673);
			Static51.aClass3_Sub8_Sub1_2.method1503(Static126.anInt3242);
		}
		if (Static52.aBoolean85 && !Static18.aBoolean34) {
			Static18.aBoolean34 = true;
			Static51.aClass3_Sub8_Sub1_2.method1559(30);
			Static51.aClass3_Sub8_Sub1_2.method1550(1);
		}
		if (!Static52.aBoolean85 && Static18.aBoolean34) {
			Static18.aBoolean34 = false;
			Static51.aClass3_Sub8_Sub1_2.method1559(30);
			Static51.aClass3_Sub8_Sub1_2.method1550(0);
		}
		Static91.method3129();
		if (Static137.anInt3514 != 30) {
			return;
		}
		Static166.method3064();
		Static35.method865();
		Static93.anInt2607++;
		if (Static93.anInt2607 > 750) {
			Static47.method1115();
			return;
		}
		Static19.method581();
		Static35.method866();
		Static172.method3136();
		Static165.anInt3991++;
		if (Static78.anInt2324 != 0) {
			Static176.anInt4190 += 20;
			if (Static176.anInt4190 >= 400) {
				Static78.anInt2324 = 0;
			}
		}
		if (Static159.aClass33_12 != null) {
			Static153.anInt3786++;
			if (Static153.anInt3786 >= 15) {
				method534(Static159.aClass33_12);
				Static159.aClass33_12 = null;
			}
		}
		@Pc(628) Class33 local628;
		if (Static165.aClass33_13 != null) {
			method534(Static165.aClass33_13);
			Static38.anInt1097++;
			if (Static79.anInt2335 + 5 < Static73.anInt2181 || Static73.anInt2181 < Static79.anInt2335 - 5 || Static15.anInt1150 + 5 < Static35.anInt1049 || Static35.anInt1049 < Static15.anInt1150 - 5) {
				Static160.aBoolean184 = true;
			}
			if (Static136.anInt3480 == 0) {
				if (Static160.aBoolean184 && Static38.anInt1097 >= 5) {
					if (Static15.aClass33_5 == Static165.aClass33_13 && Static148.anInt1804 != Static69.anInt2118) {
						@Pc(626) byte local626 = 0;
						local628 = Static165.aClass33_13;
						if (Static7.anInt223 == 1 && local628.anInt1477 == 206) {
							local626 = 1;
						}
						if (local628.anIntArray261[Static148.anInt1804] <= 0) {
							local626 = 0;
						}
						if (Static95.method2091(Static4.method97(local628))) {
							local76 = Static148.anInt1804;
							local74 = Static69.anInt2118;
							local628.anIntArray261[local76] = local628.anIntArray261[local74];
							local628.anIntArray266[local76] = local628.anIntArray266[local74];
							local628.anIntArray261[local74] = -1;
							local628.anIntArray266[local74] = 0;
						} else if (local626 == 1) {
							local74 = Static69.anInt2118;
							local76 = Static148.anInt1804;
							while (local76 != local74) {
								if (local74 > local76) {
									local628.method1205(local74, local74 - 1);
									local74--;
								} else if (local76 > local74) {
									local628.method1205(local74, local74 + 1);
									local74++;
								}
							}
						} else {
							local628.method1205(Static69.anInt2118, Static148.anInt1804);
						}
						Static51.aClass3_Sub8_Sub1_2.method1559(229);
						Static51.aClass3_Sub8_Sub1_2.method1531(Static148.anInt1804);
						Static51.aClass3_Sub8_Sub1_2.method1504(local626);
						Static51.aClass3_Sub8_Sub1_2.method1531(Static69.anInt2118);
						Static51.aClass3_Sub8_Sub1_2.method1547(Static165.aClass33_13.anInt1471);
					}
				} else if ((Static5.anInt131 == 1 || Static38.method892(Static82.anInt2400 - 1)) && Static82.anInt2400 > 2) {
					Static73.method1680();
				} else if (Static82.anInt2400 > 0) {
					Static131.method2558(Static82.anInt2400 - 1);
				}
				Static153.anInt3786 = 10;
				Static87.anInt2539 = 0;
				Static165.aClass33_13 = null;
			}
		}
		Static176.aBoolean193 = false;
		Static148.anInt1825 = 0;
		Static108.aBoolean136 = false;
		Static75.aClass33_10 = null;
		local628 = Static57.aClass33_9;
		@Pc(802) Class33 local802 = Static51.aClass33_6;
		Static57.aClass33_9 = null;
		Static51.aClass33_6 = null;
		while (Static46.method1098() && Static148.anInt1825 < 128) {
			Static60.anIntArray304[Static148.anInt1825] = Static11.anInt409;
			Static167.anIntArray681[Static148.anInt1825] = Static169.anInt674;
			Static148.anInt1825++;
		}
		if (Static177.anInt4207 != -1) {
			Static158.method628(0, 503, 0, 0, 0, 765, Static177.anInt4207);
		}
		Static90.anInt2570++;
		while (true) {
			@Pc(847) Class3_Sub6 local847;
			@Pc(860) Class33 local860;
			@Pc(852) Class33 local852;
			do {
				local847 = (Class3_Sub6) Static33.aClass23_5.method855();
				if (local847 == null) {
					while (true) {
						do {
							local847 = (Class3_Sub6) Static24.aClass23_2.method855();
							if (local847 == null) {
								while (true) {
									do {
										local847 = (Class3_Sub6) Static110.aClass23_12.method855();
										if (local847 == null) {
											if (Static22.aClass33_2 != null) {
												Static104.method2129();
											}
											if (Static94.anInt2609 != -1) {
												local76 = Static17.anInt512;
												local74 = Static94.anInt2609;
												@Pc(1011) boolean local1011 = Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 0, 0, true, local74, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 0, local76, 0);
												Static94.anInt2609 = -1;
												if (local1011) {
													Static78.anInt2324 = 1;
													Static128.anInt3274 = Static160.anInt3914;
													Static176.anInt4190 = 0;
													Static146.anInt3647 = Static2.anInt80;
												}
											}
											Static120.method2406();
											if (Static57.aClass33_9 != local628) {
												if (local628 != null) {
													method534(local628);
												}
												if (Static57.aClass33_9 != null) {
													method534(Static57.aClass33_9);
												}
											}
											if (local802 != Static51.aClass33_6 && Static54.anInt1550 == Static112.anInt2869) {
												if (local802 != null) {
													method534(local802);
												}
												if (Static51.aClass33_6 != null) {
													method534(Static51.aClass33_6);
												}
											}
											if (Static51.aClass33_6 == null) {
												if (Static112.anInt2869 > 0) {
													Static112.anInt2869--;
												}
											} else if (Static112.anInt2869 < Static54.anInt1550) {
												Static112.anInt2869++;
												if (Static54.anInt1550 == Static112.anInt2869) {
													method534(Static51.aClass33_6);
												}
											}
											Static28.method748();
											if (Static132.aBoolean160) {
												Static134.method2617();
											}
											for (local74 = 0; local74 < 5; local74++) {
												@Pc(1089) int local1089 = Static173.anIntArray689[local74]++;
											}
											local76 = Static119.method2401();
											local78 = Static151.method2853();
											if (local76 > 4500 && local78 > 4500) {
												Static35.anInt1047 = 250;
												Static45.method1074(4000);
												Static51.aClass3_Sub8_Sub1_2.method1559(146);
											}
											Static95.anInt2630++;
											Static181.anInt4289++;
											Static33.anInt1026++;
											if (Static181.anInt4289 > 500) {
												local92 = (int) (Math.random() * 8.0D);
												if ((local92 & 0x4) == 4) {
													Static171.anInt4108 += Static52.anInt1499;
												}
												if ((local92 & 0x1) == 1) {
													Static38.anInt1096 += Static131.anInt3323;
												}
												Static181.anInt4289 = 0;
												if ((local92 & 0x2) == 2) {
													Static30.anInt956 += Static37.anInt1082;
												}
											}
											if (Static171.anInt4108 < -40) {
												Static52.anInt1499 = 1;
											}
											if (Static38.anInt1096 < -50) {
												Static131.anInt3323 = 2;
											}
											if (Static171.anInt4108 > 40) {
												Static52.anInt1499 = -1;
											}
											if (Static33.anInt1026 > 500) {
												Static33.anInt1026 = 0;
												local92 = (int) (Math.random() * 8.0D);
												if ((local92 & 0x2) == 2) {
													Static51.anInt1446 += Static26.anInt717;
												}
												if ((local92 & 0x1) == 1) {
													Static170.anInt4092 += Static22.anInt588;
												}
											}
											if (Static51.anInt1446 < -20) {
												Static26.anInt717 = 1;
											}
											if (Static38.anInt1096 > 50) {
												Static131.anInt3323 = -2;
											}
											if (Static51.anInt1446 > 10) {
												Static26.anInt717 = -1;
											}
											if (Static30.anInt956 < -55) {
												Static37.anInt1082 = 2;
											}
											if (Static30.anInt956 > 55) {
												Static37.anInt1082 = -2;
											}
											if (Static170.anInt4092 < -60) {
												Static22.anInt588 = 2;
											}
											if (Static170.anInt4092 > 60) {
												Static22.anInt588 = -2;
											}
											if (Static95.anInt2630 > 50) {
												Static51.aClass3_Sub8_Sub1_2.method1559(219);
											}
											try {
												if (Static52.aClass38_1 != null && Static51.aClass3_Sub8_Sub1_2.anInt1948 > 0) {
													Static52.aClass38_1.method1633(Static51.aClass3_Sub8_Sub1_2.anInt1948, Static51.aClass3_Sub8_Sub1_2.aByteArray19);
													Static51.aClass3_Sub8_Sub1_2.anInt1948 = 0;
													Static95.anInt2630 = 0;
													return;
												}
												return;
											} catch (@Pc(1298) IOException local1298) {
												Static47.method1115();
												return;
											}
										}
										local852 = local847.aClass33_3;
										if (local852.anInt1496 < 0) {
											break;
										}
										local860 = Static19.method576(local852.anInt1488);
									} while (local860 == null || local860.aClass33Array2 == null || local852.anInt1496 >= local860.aClass33Array2.length || local852 != local860.aClass33Array2[local852.anInt1496]);
									Static163.method3014(local847);
								}
							}
							local852 = local847.aClass33_3;
							if (local852.anInt1496 < 0) {
								break;
							}
							local860 = Static19.method576(local852.anInt1488);
						} while (local860 == null || local860.aClass33Array2 == null || local860.aClass33Array2.length <= local852.anInt1496 || local860.aClass33Array2[local852.anInt1496] != local852);
						Static163.method3014(local847);
					}
				}
				local852 = local847.aClass33_3;
				if (local852.anInt1496 < 0) {
					break;
				}
				local860 = Static19.method576(local852.anInt1488);
			} while (local860 == null || local860.aClass33Array2 == null || local860.aClass33Array2.length <= local852.anInt1496 || local852 != local860.aClass33Array2[local852.anInt1496]);
			Static163.method3014(local847);
		}
	}
}
