import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!q;")
	public static Class62 aClass62_30;

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public static int anInt2564;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!jb;")
	public static Class33 aClass33_36 = new Class33(64);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1235 = Static108.method1915("Cabbage");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
	public static int anInt2563 = 0;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method1812() {
		aClass39_1235 = null;
		aClass62_30 = null;
		aClass33_36 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IILclient!df;BI)V")
	public static void method1813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub5 arg2, @OriginalArg(4) int arg3) {
		if (Static110.anInt2795 >= 400) {
			return;
		}
		if (arg2.anIntArray130 != null) {
			arg2 = arg2.method514();
		}
		if (arg2 == null || !arg2.aBoolean76) {
			return;
		}
		@Pc(28) Class39 local28 = arg2.aClass39_434;
		if (arg2.anInt920 != 0) {
			local28 = Static30.method601(new Class39[] { local28, Static64.method1142(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2546, arg2.anInt920), Static33.aClass39_487, Static91.aClass39_1078, Static69.method1226(arg2.anInt920), Static54.aClass39_731 });
		}
		if (Static89.anInt2107 == 1) {
			Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_66, Static77.aClass39_961, local28 }), 42, Static77.aClass39_953, arg1, arg3, arg0);
		} else if (!Static46.aBoolean222) {
			@Pc(147) Class39[] local147 = arg2.aClass39Array9;
			if (Static31.aBoolean91) {
				local147 = Static122.method2059(local147);
			}
			@Pc(157) int local157;
			if (local147 != null) {
				for (local157 = 4; local157 >= 0; local157--) {
					if (local147[local157] != null && !local147[local157].method1158(Static46.aClass39_1335)) {
						@Pc(176) byte local176 = 0;
						if (local157 == 0) {
							local176 = 2;
						}
						if (local157 == 1) {
							local176 = 46;
						}
						if (local157 == 2) {
							local176 = 44;
						}
						if (local157 == 3) {
							local176 = 50;
						}
						if (local157 == 4) {
							local176 = 27;
						}
						Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_64, local28 }), local176, local147[local157], arg1, arg3, arg0);
					}
				}
			}
			if (local147 != null) {
				for (local157 = 4; local157 >= 0; local157--) {
					if (local147[local157] != null && local147[local157].method1158(Static46.aClass39_1335)) {
						@Pc(257) short local257 = 0;
						@Pc(259) int local259 = 0;
						if (Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2546 < arg2.anInt920) {
							local257 = 2000;
						}
						if (local157 == 0) {
							local259 = local257 + 2;
						}
						if (local157 == 1) {
							local259 = local257 + 46;
						}
						if (local157 == 2) {
							local259 = local257 + 44;
						}
						if (local157 == 3) {
							local259 = local257 + 50;
						}
						if (local157 == 4) {
							local259 = local257 + 27;
						}
						Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_64, local28 }), local259, local147[local157], arg1, arg3, arg0);
					}
				}
			}
			Static71.method1242(Static30.method601(new Class39[] { Static4.aClass39_64, local28 }), 1004, Static76.aClass39_940, arg1, arg3, arg0);
		} else if ((Static82.anInt1996 & 0x2) == 2) {
			Static71.method1242(Static30.method601(new Class39[] { Static103.aClass39_1273, Static77.aClass39_961, local28 }), 41, Static52.aClass39_695, arg1, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!b;[Lclient!ge;)V")
	public static void method1814(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class23[] arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static51.aByteArrayArrayArray3[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static51.aByteArrayArrayArray3[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg1[local30].method779(local11, local15);
						}
					}
				}
			}
		}
		Static8.anInt435 += (int) (Math.random() * 5.0D) - 2;
		Static47.anInt1307 += (int) (Math.random() * 5.0D) - 2;
		if (Static8.anInt435 < -16) {
			Static8.anInt435 = -16;
		}
		if (Static8.anInt435 > 16) {
			Static8.anInt435 = 16;
		}
		if (Static47.anInt1307 < -8) {
			Static47.anInt1307 = -8;
		}
		if (Static47.anInt1307 > 8) {
			Static47.anInt1307 = 8;
		}
		@Pc(130) int local130;
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(159) int local159;
		@Pc(180) int local180;
		@Pc(193) int local193;
		@Pc(205) int local205;
		@Pc(209) int local209;
		@Pc(199) int local199;
		@Pc(273) int local273;
		@Pc(257) int local257;
		@Pc(498) int local498;
		@Pc(542) int local542;
		@Pc(644) int local644;
		@Pc(654) int local654;
		@Pc(682) int local682;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(120) byte[][] local120 = Static55.aByteArrayArrayArray5[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local130 = local30 * 768 >> 8;
			for (local132 = 1; local132 < 103; local132++) {
				for (local136 = 1; local136 < 103; local136++) {
					local159 = Static51.anIntArrayArrayArray6[local11][local136 + 1][local132] - Static51.anIntArrayArrayArray6[local11][local136 - 1][local132];
					local180 = Static51.anIntArrayArrayArray6[local11][local136][local132 + 1] - Static51.anIntArrayArrayArray6[local11][local136][local132 - 1];
					local193 = (int) Math.sqrt((double) (local159 * local159 + local180 * local180 + 65536));
					local199 = (local180 << 8) / local193;
					local205 = (local159 << 8) / local193;
					local209 = 65536 / local193;
					local257 = (local120[local136][local132 + 1] >> 3) + (local120[local136][local132 - 1] >> 2) + (local120[local136 + 1][local132] >> 3) + (local120[local136 - 1][local132] >> 2) + (local120[local136][local132] >> 1);
					local273 = (local199 * -50 + local209 * -10 + local205 * -50) / local130 + 96;
					Static43.anIntArrayArray8[local136][local132] = local273 - local257;
				}
			}
			for (local136 = 0; local136 < 104; local136++) {
				Static120.anIntArray479[local136] = 0;
				Static86.anIntArray318[local136] = 0;
				Static43.anIntArray174[local136] = 0;
				Static110.anIntArray422[local136] = 0;
				Static107.anIntArray414[local136] = 0;
			}
			for (local159 = -5; local159 < 109; local159++) {
				for (local180 = 0; local180 < 104; local180++) {
					local193 = local159 + 5;
					@Pc(396) int local396;
					if (local193 >= 0 && local193 < 104) {
						local205 = Static10.aByteArrayArrayArray2[local11][local193][local180] & 0xFF;
						if (local205 > 0) {
							@Pc(360) Class1_Sub1_Sub16 local360 = Static47.method829(local205 - 1);
							Static120.anIntArray479[local180] += local360.anInt2675;
							Static86.anIntArray318[local180] += local360.anInt2681;
							Static43.anIntArray174[local180] += local360.anInt2679;
							Static110.anIntArray422[local180] += local360.anInt2678;
							local396 = Static107.anIntArray414[local180]++;
						}
					}
					local205 = local159 - 5;
					if (local205 >= 0 && local205 < 104) {
						local209 = Static10.aByteArrayArrayArray2[local11][local205][local180] & 0xFF;
						if (local209 > 0) {
							@Pc(429) Class1_Sub1_Sub16 local429 = Static47.method829(local209 - 1);
							Static120.anIntArray479[local180] -= local429.anInt2675;
							Static86.anIntArray318[local180] -= local429.anInt2681;
							Static43.anIntArray174[local180] -= local429.anInt2679;
							Static110.anIntArray422[local180] -= local429.anInt2678;
							local396 = Static107.anIntArray414[local180]--;
						}
					}
				}
				if (local159 >= 1 && local159 < 103) {
					local193 = 0;
					local199 = 0;
					local205 = 0;
					local273 = 0;
					local209 = 0;
					for (local257 = -5; local257 < 109; local257++) {
						local498 = local257 + 5;
						if (local498 >= 0 && local498 < 104) {
							local273 += Static107.anIntArray414[local498];
							local199 += Static110.anIntArray422[local498];
							local205 += Static86.anIntArray318[local498];
							local193 += Static120.anIntArray479[local498];
							local209 += Static43.anIntArray174[local498];
						}
						local542 = local257 - 5;
						if (local542 >= 0 && local542 < 104) {
							local273 -= Static107.anIntArray414[local542];
							local199 -= Static110.anIntArray422[local542];
							local193 -= Static120.anIntArray479[local542];
							local209 -= Static43.anIntArray174[local542];
							local205 -= Static86.anIntArray318[local542];
						}
						if (local257 >= 1 && local257 < 103 && (!Static68.aBoolean149 || (Static51.aByteArrayArrayArray3[0][local159][local257] & 0x2) != 0 || (Static51.aByteArrayArrayArray3[local11][local159][local257] & 0x10) == 0 && Static100.method1808(local159, local11, local257) == Static94.anInt2217)) {
							if (Static4.anInt161 > local11) {
								Static4.anInt161 = local11;
							}
							local644 = Static10.aByteArrayArrayArray2[local11][local159][local257] & 0xFF;
							local654 = Static76.aByteArrayArrayArray6[local11][local159][local257] & 0xFF;
							if (local644 > 0 || local654 > 0) {
								@Pc(674) int local674 = Static51.anIntArrayArrayArray6[local11][local159 + 1][local257];
								local682 = Static51.anIntArrayArrayArray6[local11][local159][local257];
								@Pc(694) int local694 = Static51.anIntArrayArrayArray6[local11][local159 + 1][local257 + 1];
								@Pc(704) int local704 = Static43.anIntArrayArray8[local159 + 1][local257 + 1];
								@Pc(710) int local710 = Static43.anIntArrayArray8[local159][local257];
								@Pc(720) int local720 = Static51.anIntArrayArrayArray6[local11][local159][local257 + 1];
								@Pc(728) int local728 = Static43.anIntArrayArray8[local159][local257 + 1];
								@Pc(736) int local736 = Static43.anIntArrayArray8[local159 + 1][local257];
								@Pc(738) int local738 = -1;
								@Pc(740) int local740 = -1;
								@Pc(755) int local755;
								@Pc(749) int local749;
								if (local644 > 0) {
									local749 = local205 / local273;
									local755 = local193 * 256 / local199;
									@Pc(759) int local759 = local209 / local273;
									local740 = Static63.method1138(local749, local755, local759);
									local759 += Static8.anInt435;
									@Pc(776) int local776 = local755 + Static47.anInt1307 & 0xFF;
									if (local759 < 0) {
										local759 = 0;
									} else if (local759 > 255) {
										local759 = 255;
									}
									local738 = Static63.method1138(local749, local776, local759);
								}
								if (local11 > 0) {
									@Pc(802) boolean local802 = true;
									if (local644 == 0 && Static1.aByteArrayArrayArray1[local11][local159][local257] != 0) {
										local802 = false;
									}
									if (local654 > 0 && !Static112.method1957(local654 - 1).aBoolean45) {
										local802 = false;
									}
									if (local802 && local682 == local674 && local682 == local694 && local682 == local720) {
										Static9.anIntArrayArrayArray9[local11][local159][local257] |= 0x924;
									}
								}
								local755 = 0;
								if (local738 != -1) {
									local755 = Static27.anIntArray139[Static10.method265(96, local738)];
								}
								if (local654 == 0) {
									arg0.method132(local11, local159, local257, 0, 0, -1, local682, local674, local694, local720, Static10.method265(local710, local740), Static10.method265(local736, local740), Static10.method265(local704, local740), Static10.method265(local728, local740), 0, 0, 0, 0, local755, 0);
								} else {
									local749 = Static1.aByteArrayArrayArray1[local11][local159][local257] + 1;
									@Pc(902) byte local902 = Static99.aByteArrayArrayArray7[local11][local159][local257];
									@Pc(908) Class1_Sub1_Sub3 local908 = Static112.method1957(local654 - 1);
									@Pc(911) int local911 = local908.anInt479;
									@Pc(926) int local926;
									@Pc(961) int local961;
									@Pc(933) int local933;
									@Pc(938) int local938;
									if (local911 >= 0) {
										local926 = -1;
										local961 = Static27.anInterface1_1.method1288(local911);
									} else if (local908.anInt476 == 16711935) {
										local961 = -2;
										local926 = -2;
										local911 = -1;
									} else {
										local926 = Static63.method1138(local908.anInt488, local908.anInt483, local908.anInt484);
										local933 = local908.anInt483 + Static47.anInt1307 & 0xFF;
										local938 = local908.anInt484 + Static8.anInt435;
										if (local938 < 0) {
											local938 = 0;
										} else if (local938 > 255) {
											local938 = 255;
										}
										local961 = Static63.method1138(local908.anInt488, local933, local938);
									}
									local933 = 0;
									if (local961 != -2) {
										local933 = Static27.anIntArray139[Static63.method1139(local961, 96)];
									}
									if (local908.anInt475 != -1) {
										local938 = local908.anInt492 + Static47.anInt1307 & 0xFF;
										@Pc(1009) int local1009 = local908.anInt486 + Static8.anInt435;
										if (local1009 < 0) {
											local1009 = 0;
										} else if (local1009 > 255) {
											local1009 = 255;
										}
										local961 = Static63.method1138(local908.anInt489, local938, local1009);
										local933 = Static27.anIntArray139[Static63.method1139(local961, 96)];
									}
									arg0.method132(local11, local159, local257, local749, local902, local911, local682, local674, local694, local720, Static10.method265(local710, local740), Static10.method265(local736, local740), Static10.method265(local704, local740), Static10.method265(local728, local740), Static63.method1139(local926, local710), Static63.method1139(local926, local736), Static63.method1139(local926, local704), Static63.method1139(local926, local728), local755, local933);
								}
							}
						}
					}
				}
			}
			for (local180 = 1; local180 < 103; local180++) {
				for (local193 = 1; local193 < 103; local193++) {
					arg0.method129(local11, local193, local180, Static100.method1808(local193, local11, local180));
				}
			}
			Static10.aByteArrayArrayArray2[local11] = null;
			Static76.aByteArrayArrayArray6[local11] = null;
			Static1.aByteArrayArrayArray1[local11] = null;
			Static99.aByteArrayArrayArray7[local11] = null;
			Static55.aByteArrayArrayArray5[local11] = null;
		}
		arg0.method140();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static51.aByteArrayArrayArray3[1][local15][local30] & 0x2) == 2) {
					arg0.method113(local15, local30);
				}
			}
		}
		local30 = 1;
		local132 = 4;
		local130 = 2;
		for (local136 = 0; local136 < 4; local136++) {
			if (local136 > 0) {
				local30 <<= 0x3;
				local132 <<= 0x3;
				local130 <<= 0x3;
			}
			for (local159 = 0; local159 <= local136; local159++) {
				for (local180 = 0; local180 <= 104; local180++) {
					for (local193 = 0; local193 <= 104; local193++) {
						if ((local30 & Static9.anIntArrayArrayArray9[local159][local193][local180]) != 0) {
							for (local205 = local180; local205 > 0 && (local30 & Static9.anIntArrayArrayArray9[local159][local193][local205 - 1]) != 0; local205--) {
							}
							local199 = local159;
							local273 = local159;
							for (local209 = local180; local209 < 104 && (local30 & Static9.anIntArrayArrayArray9[local159][local193][local209 + 1]) != 0; local209++) {
							}
							label347: while (local199 > 0) {
								for (local257 = local205; local257 <= local209; local257++) {
									if ((Static9.anIntArrayArrayArray9[local199 - 1][local193][local257] & local30) == 0) {
										break label347;
									}
								}
								local199--;
							}
							label336: while (local273 < local136) {
								for (local257 = local205; local257 <= local209; local257++) {
									if ((local30 & Static9.anIntArrayArrayArray9[local273 + 1][local193][local257]) == 0) {
										break label336;
									}
								}
								local273++;
							}
							local257 = (local209 + 1 - local205) * (local273 + 1 - local199);
							if (local257 >= 8) {
								local644 = Static51.anIntArrayArrayArray6[local199][local193][local205];
								local542 = Static51.anIntArrayArrayArray6[local273][local193][local205] - 240;
								Static7.method96(local136, 1, local193 * 128, local193 * 128, local205 * 128, local209 * 128 + 128, local542, local644);
								for (local654 = local199; local654 <= local273; local654++) {
									for (local682 = local205; local682 <= local209; local682++) {
										Static9.anIntArrayArrayArray9[local654][local193][local682] &= ~local30;
									}
								}
							}
						}
						if ((local130 & Static9.anIntArrayArrayArray9[local159][local193][local180]) != 0) {
							local199 = local159;
							local273 = local159;
							local205 = local193;
							local209 = local193;
							while (local205 > 0 && (Static9.anIntArrayArrayArray9[local159][local205 - 1][local180] & local130) != 0) {
								local205--;
							}
							while (local209 < 104 && (Static9.anIntArrayArrayArray9[local159][local209 + 1][local180] & local130) != 0) {
								local209++;
							}
							label401: while (local199 > 0) {
								for (local257 = local205; local257 <= local209; local257++) {
									if ((local130 & Static9.anIntArrayArrayArray9[local199 - 1][local257][local180]) == 0) {
										break label401;
									}
								}
								local199--;
							}
							label390: while (local136 > local273) {
								for (local257 = local205; local257 <= local209; local257++) {
									if ((Static9.anIntArrayArrayArray9[local273 + 1][local257][local180] & local130) == 0) {
										break label390;
									}
								}
								local273++;
							}
							local257 = (local273 + 1 - local199) * (local209 + 1 - local205);
							if (local257 >= 8) {
								local644 = Static51.anIntArrayArrayArray6[local199][local205][local180];
								local542 = Static51.anIntArrayArrayArray6[local273][local205][local180] - 240;
								Static7.method96(local136, 2, local205 * 128, local209 * 128 + 128, local180 * 128, local180 * 128, local542, local644);
								for (local654 = local199; local654 <= local273; local654++) {
									for (local682 = local205; local682 <= local209; local682++) {
										Static9.anIntArrayArrayArray9[local654][local682][local180] &= ~local130;
									}
								}
							}
						}
						if ((Static9.anIntArrayArrayArray9[local159][local193][local180] & local132) != 0) {
							local205 = local193;
							local209 = local193;
							for (local273 = local180; local273 < 104 && (local132 & Static9.anIntArrayArrayArray9[local159][local193][local273 + 1]) != 0; local273++) {
							}
							for (local199 = local180; local199 > 0 && (Static9.anIntArrayArrayArray9[local159][local193][local199 - 1] & local132) != 0; local199--) {
							}
							label454: while (local205 > 0) {
								for (local257 = local199; local257 <= local273; local257++) {
									if ((Static9.anIntArrayArrayArray9[local159][local205 - 1][local257] & local132) == 0) {
										break label454;
									}
								}
								local205--;
							}
							label443: while (local209 < 104) {
								for (local257 = local199; local257 <= local273; local257++) {
									if ((Static9.anIntArrayArrayArray9[local159][local209 + 1][local257] & local132) == 0) {
										break label443;
									}
								}
								local209++;
							}
							if ((local273 + 1 - local199) * (-local205 + 1 + local209) >= 4) {
								local257 = Static51.anIntArrayArrayArray6[local159][local205][local199];
								Static7.method96(local136, 4, local205 * 128, local209 * 128 + 128, local199 * 128, local273 * 128 + 128, local257, local257);
								for (local498 = local205; local498 <= local209; local498++) {
									for (local542 = local199; local542 <= local273; local542++) {
										Static9.anIntArrayArrayArray9[local159][local498][local542] &= ~local132;
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
