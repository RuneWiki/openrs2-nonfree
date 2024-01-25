import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static467 {

	@OriginalMember(owner = "client!qo", name = "pe", descriptor = "I")
	public static int anInt8761;

	@OriginalMember(owner = "client!qo", name = "td", descriptor = "I")
	public static int anInt8715 = 503;

	@OriginalMember(owner = "client!qo", name = "qe", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_87 = new Class94(58, 4);

	@OriginalMember(owner = "client!qo", name = "xe", descriptor = "I")
	public static int anInt8766 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!db;)V")
	public static void method7330(@OriginalArg(1) Class2_Sub6_Sub3 arg0) {
		if (arg0 == null) {
			return;
		}
		Static216.aClass341_39.method8528(arg0);
		Static298.anInt6262++;
		@Pc(37) Class2_Sub6_Sub21 local37;
		if (arg0.aBoolean220 || "".equals(arg0.aString21)) {
			local37 = new Class2_Sub6_Sub21(arg0.aString21);
			Static193.anInt4507++;
		} else {
			@Pc(45) long local45 = arg0.aLong60;
			for (local37 = (Class2_Sub6_Sub21) Static89.aClass99_22.method3056(local45); local37 != null && !local37.aString106.equals(arg0.aString21); local37 = (Class2_Sub6_Sub21) Static89.aClass99_22.method3052()) {
			}
			if (local37 == null) {
				local37 = (Class2_Sub6_Sub21) Static566.aClass169_61.method5002(local45);
				if (local37 != null && !local37.aString106.equals(arg0.aString21)) {
					local37 = null;
				}
				if (local37 == null) {
					local37 = new Class2_Sub6_Sub21(arg0.aString21);
				}
				Static89.aClass99_22.method3059(local45, local37);
				Static193.anInt4507++;
			}
		}
		if (local37.method8937(arg0)) {
			Static532.method8012(local37);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIIIII)V")
	public static void method7389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static71.anInt3990;
		Static323.anInt6581 = 0;
		@Pc(11) int[] local11 = Static549.anIntArray643;
		@Pc(177) int local177;
		@Pc(202) int local202;
		@Pc(259) int local259;
		@Pc(337) int local337;
		@Pc(340) int local340;
		@Pc(1157) int local1157;
		@Pc(1202) int local1202;
		@Pc(1204) int local1204;
		@Pc(439) int local439;
		@Pc(1060) int local1060;
		@Pc(576) int local576;
		for (@Pc(13) int local13 = 0; local13 < Static398.anInt7589 + local7; local13++) {
			@Pc(17) Class27 local17 = null;
			@Pc(26) Class3_Sub1_Sub3_Sub3 local26;
			if (local7 > local13) {
				local26 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local11[local13]];
			} else {
				local26 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local13 - local7])).aClass3_Sub1_Sub3_Sub3_Sub1_2;
				local17 = ((Class3_Sub1_Sub3_Sub3_Sub1) local26).aClass27_1;
				if (local17.anIntArray43 != null) {
					local17 = local17.method727(Static286.aClass263_3);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local26.anInt6078 >= 0 && (Static438.anInt8137 == local26.anInt6092 || local26.aByte132 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132)) {
				Static236.method4451(local26.method5204(), arg3 >> 1, arg1 >> 1, local26);
				if (Static613.anIntArray690[0] >= 0) {
					if (local26.aString62 != null && (local7 <= local13 || Static645.anInt11095 == 0 || Static645.anInt11095 == 3 || Static645.anInt11095 == 1 && Static233.method4437(((Class3_Sub1_Sub3_Sub3_Sub2) local26).aString64)) && Static323.anInt6581 < Static67.anInt2176) {
						Static67.anIntArray95[Static323.anInt6581] = Static161.aClass239_14.method6482(local26.aString62) / 2;
						Static67.anIntArray96[Static323.anInt6581] = Static613.anIntArray690[0];
						Static67.anIntArray93[Static323.anInt6581] = Static613.anIntArray690[1];
						Static67.anIntArray94[Static323.anInt6581] = local26.anInt6017;
						Static67.anIntArray91[Static323.anInt6581] = local26.anInt6039;
						Static67.anIntArray92[Static323.anInt6581] = local26.anInt6061;
						Static67.aStringArray10[Static323.anInt6581] = local26.aString62;
						Static323.anInt6581++;
					}
					local177 = Static613.anIntArray690[1] + arg0;
					@Pc(244) Class46[] local244;
					@Pc(251) Class296[] local251;
					@Pc(309) Class46 local309;
					if (local26.aBoolean454 || local26.anInt6030 <= Static407.anInt7704) {
						local177 -= Math.max(Static161.aClass239_14.anInt7559, Static55.aClass46Array14[0].method6208());
					} else {
						@Pc(192) byte local192 = 1;
						if (local13 >= local7) {
							local202 = local17.anInt652;
							if (local202 == -1) {
								local202 = local26.method5200().anInt9382;
							}
						} else {
							@Pc(219) Class3_Sub1_Sub3_Sub3_Sub2 local219 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local11[local13]];
							local202 = local26.method5200().anInt9382;
							if (local219.aBoolean461) {
								local192 = 2;
							}
						}
						@Pc(231) Class46[] local231 = Static55.aClass46Array14;
						if (local202 != -1) {
							local244 = (Class46[]) Static131.aClass169_22.method5002((long) local202);
							if (local244 == null) {
								local251 = Static652.method7581(Static214.aClass157_106, local202);
								if (local251 != null) {
									local244 = new Class46[local251.length];
									for (local259 = 0; local259 < local251.length; local259++) {
										local244[local259] = Static186.aClass20_4.method7294(local251[local259], true);
									}
									Static131.aClass169_22.method5001(local244, (long) local202);
								}
							}
							if (local244 != null && local244.length >= 2) {
								local231 = local244;
							}
						}
						if (local192 >= local231.length) {
							local192 = 1;
						}
						@Pc(305) Class46 local305 = local231[0];
						local309 = local231[local192];
						local177 -= Math.max(Static161.aClass239_14.anInt7559, local305.method6208());
						local259 = Static613.anIntArray690[0] + arg2 - (local305.method6210() >> 1);
						local337 = local305.method6210() * local26.anInt6087 / 255;
						local340 = local305.method6208();
						if (local26.anInt6087 > 0 && local337 < 2) {
							local337 = 2;
						}
						local305.method6213(local259, local177);
						Static186.aClass20_4.T(local259, local177, local337 + local259, local340 + local177);
						local309.method6213(local259, local177);
						Static186.aClass20_4.KA(arg2, arg0, arg2 + arg3, arg1 + arg0);
						Static113.method2842(local259, local259 + local305.method6205(), local177, local177 + local340);
					}
					local177 -= 2;
					if (!local26.aBoolean454) {
						@Pc(422) Class46 local422;
						@Pc(431) Class46 local431;
						if (local26.anInt6080 > Static407.anInt7704) {
							local422 = Static182.aClass46Array7[local26.aBoolean452 ? 2 : 0];
							local431 = Static182.aClass46Array7[local26.aBoolean452 ? 3 : 1];
							if (local26 instanceof Class3_Sub1_Sub3_Sub3_Sub1) {
								local439 = local17.anInt656;
								if (local439 == -1) {
									local439 = local26.method5200().anInt9393;
								}
							} else {
								local439 = local26.method5200().anInt9393;
							}
							if (local439 != -1) {
								local244 = (Class46[]) Static217.aClass169_17.method5002((long) local439);
								if (local244 == null) {
									local251 = Static652.method7581(Static214.aClass157_106, local439);
									if (local251 != null) {
										local244 = new Class46[local251.length];
										for (local259 = 0; local259 < local251.length; local259++) {
											local244[local259] = Static186.aClass20_4.method7294(local251[local259], true);
										}
										Static217.aClass169_17.method5001(local244, (long) local439);
									}
								}
								if (local244 != null && local244.length == 4) {
									local431 = local244[local26.aBoolean452 ? 3 : 1];
									local422 = local244[local26.aBoolean452 ? 2 : 0];
								}
							}
							@Pc(536) int local536 = local26.anInt6080 - Static407.anInt7704;
							if (local26.anInt6033 < local536) {
								local536 -= local26.anInt6033;
								local259 = local26.anInt6066 == 0 ? 0 : local26.anInt6066 * ((local26.anInt6023 - local536) / local26.anInt6066);
								local576 = local422.method6210() * local259 / local26.anInt6023;
							} else {
								local576 = local422.method6210();
							}
							local259 = local422.method6208();
							local177 -= local259;
							local337 = Static613.anIntArray690[0] + arg2 - (local422.method6210() >> 1);
							local422.method6213(local337, local177);
							Static186.aClass20_4.T(local337, local177, local337 + local576, local177 - -local259);
							local431.method6213(local337, local177);
							Static186.aClass20_4.KA(arg2, arg0, arg3 + arg2, arg0 - -arg1);
							Static113.method2842(local337, local422.method6205() + local337, local177, local259 + local177);
							local177 -= 2;
						}
						if (local7 > local13) {
							@Pc(653) Class3_Sub1_Sub3_Sub3_Sub2 local653 = (Class3_Sub1_Sub3_Sub3_Sub2) local26;
							if (local653.anInt6124 != -1) {
								local177 -= 25;
								local431 = Static504.aClass46Array16[local653.anInt6124];
								local431.method6213(arg2 + Static613.anIntArray690[0] - 12, local177);
								Static113.method2842(arg2 + Static613.anIntArray690[0] - 12, arg2 - -Static613.anIntArray690[0] + -12 + local431.method6205(), local177, local177 + local431.method6219());
								local177 -= 2;
							}
							if (local653.anInt6110 != -1) {
								local177 -= 25;
								local431 = Static573.aClass46Array19[local653.anInt6110];
								local431.method6213(arg2 + Static613.anIntArray690[0] - 12, local177);
								Static113.method2842(Static613.anIntArray690[0] + arg2 - 12, Static613.anIntArray690[0] + arg2 - (-local431.method6205() + 12), local177, local177 + local431.method6219());
								local177 -= 2;
							}
						} else if (local17.anInt653 >= 0 && Static573.aClass46Array19.length > local17.anInt653) {
							local422 = Static573.aClass46Array19[local17.anInt653];
							local177 -= 25;
							local422.method6213(arg2 + Static613.anIntArray690[0] - (local422.method6210() >> 1), local177);
							Static113.method2842(Static613.anIntArray690[0] + arg2 - (local422.method6210() >> 1), Static613.anIntArray690[0] + (arg2 - (local422.method6210() >> 1)) + local422.method6205(), local177, local422.method6219() + local177);
							local177 -= 2;
						}
					}
					@Pc(825) Class373[] local825;
					@Pc(833) Class373 local833;
					if (!(local26 instanceof Class3_Sub1_Sub3_Sub3_Sub2)) {
						local202 = 0;
						local825 = Static351.aClass373Array1;
						for (local439 = 0; local439 < local825.length; local439++) {
							local833 = local825[local439];
							if (local833 != null && local833.anInt11021 == 1 && Static301.anIntArray367[local13 - local7] == local833.anInt11014) {
								local309 = Static352.aClass46Array11[local833.anInt11012];
								if (local202 < local309.method6208()) {
									local202 = local309.method6208();
								}
								if (Static407.anInt7704 % 20 < 10) {
									local309.method6213(arg2 + Static613.anIntArray690[0] - 12, local177 + -local309.method6208());
									Static113.method2842(arg2 + Static613.anIntArray690[0] - 12, Static613.anIntArray690[0] + arg2 + -12 - -local309.method6205(), local177 - local309.method6208(), -local309.method6208() + (local177 - -local309.method6219()));
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local825 = Static351.aClass373Array1;
						for (local439 = 0; local439 < local825.length; local439++) {
							local833 = local825[local439];
							if (local833 != null && local833.anInt11021 == 10 && local833.anInt11014 == local11[local13]) {
								local309 = Static352.aClass46Array11[local833.anInt11012];
								if (local309.method6208() > local202) {
									local202 = local309.method6208();
								}
								local309.method6213(Static613.anIntArray690[0] + arg2 - 12, local177 + -local309.method6208());
								Static113.method2842(arg2 + Static613.anIntArray690[0] - 12, arg2 + (Static613.anIntArray690[0] + -12 - -local309.method6205()), local177 - local309.method6208(), local177 + -local309.method6208() - -local309.method6219());
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < Static380.anInt7418; local202++) {
						local1060 = local26.anIntArray347[local202];
						local439 = local26.anIntArray351[local202];
						@Pc(1067) Class143 local1067 = null;
						local576 = 0;
						if (local439 >= 0) {
							if (Static407.anInt7704 >= local1060) {
								continue;
							}
							local1067 = Static298.aClass307_2.method7793(local26.anIntArray351[local202]);
							local576 = local1067.anInt5041;
						} else if (local1060 < 0) {
							continue;
						}
						local259 = local26.anIntArray356[local202];
						@Pc(1103) Class143 local1103 = null;
						if (local259 >= 0) {
							local1103 = Static298.aClass307_2.method7793(local259);
						}
						if (local1060 - local576 <= Static407.anInt7704) {
							local340 = local26.anIntArray355[local202];
							if (local340 >= 0) {
								local26.anInt6030 = Static407.anInt7704 + 300;
								local26.anInt6087 = local340;
								local26.anIntArray355[local202] = -1;
							}
							if (local1067 == null) {
								local26.anIntArray347[local202] = -1;
							} else {
								local1157 = local26.method5204() / 2;
								Static236.method4451(local1157, arg3 >> 1, arg1 >> 1, local26);
								if (Static613.anIntArray690[0] > -1) {
									Static613.anIntArray690[0] += Static367.anIntArray463[local202];
									Static613.anIntArray690[1] += Static349.anIntArray437[local202];
									local1202 = 0;
									local1204 = 0;
									@Pc(1206) int local1206 = 0;
									@Pc(1208) int local1208 = 0;
									@Pc(1210) int local1210 = 0;
									@Pc(1212) int local1212 = 0;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) Class46 local1218 = null;
									@Pc(1220) Class46 local1220 = null;
									@Pc(1222) Class46 local1222 = null;
									@Pc(1224) Class46 local1224 = null;
									@Pc(1226) int local1226 = 0;
									@Pc(1228) int local1228 = 0;
									@Pc(1230) int local1230 = 0;
									@Pc(1232) int local1232 = 0;
									@Pc(1234) int local1234 = 0;
									@Pc(1236) int local1236 = 0;
									@Pc(1238) int local1238 = 0;
									@Pc(1240) int local1240 = 0;
									@Pc(1242) int local1242 = 0;
									@Pc(1247) Class46 local1247 = local1067.method4362(Static186.aClass20_4);
									@Pc(1255) int local1255;
									if (local1247 != null) {
										local1202 = local1247.method6210();
										local1255 = local1247.method6208();
										local1247.method6223(Static402.anIntArray491);
										if (local1255 > 0) {
											local1242 = local1255;
										}
										local1210 = Static402.anIntArray491[0];
									}
									@Pc(1276) Class46 local1276 = local1067.method4366(Static186.aClass20_4);
									if (local1276 != null) {
										local1204 = local1276.method6210();
										local1255 = local1276.method6208();
										local1276.method6223(Static402.anIntArray491);
										if (local1242 < local1255) {
											local1242 = local1255;
										}
										local1212 = Static402.anIntArray491[0];
									}
									@Pc(1305) Class46 local1305 = local1067.method4359(Static186.aClass20_4);
									if (local1305 != null) {
										local1206 = local1305.method6210();
										local1255 = local1305.method6208();
										if (local1255 > local1242) {
											local1242 = local1255;
										}
										local1305.method6223(Static402.anIntArray491);
										local1214 = Static402.anIntArray491[0];
									}
									@Pc(1334) Class46 local1334 = local1067.method4360(Static186.aClass20_4);
									if (local1334 != null) {
										local1208 = local1334.method6210();
										local1255 = local1334.method6208();
										local1334.method6223(Static402.anIntArray491);
										if (local1255 > local1242) {
											local1242 = local1255;
										}
										local1216 = Static402.anIntArray491[0];
									}
									if (local1103 != null) {
										local1218 = local1103.method4362(Static186.aClass20_4);
										if (local1218 != null) {
											local1226 = local1218.method6210();
											local1255 = local1218.method6208();
											if (local1255 > local1242) {
												local1242 = local1255;
											}
											local1218.method6223(Static402.anIntArray491);
											local1234 = Static402.anIntArray491[0];
										}
										local1220 = local1103.method4366(Static186.aClass20_4);
										if (local1220 != null) {
											local1228 = local1220.method6210();
											local1255 = local1220.method6208();
											if (local1255 > local1242) {
												local1242 = local1255;
											}
											local1220.method6223(Static402.anIntArray491);
											local1236 = Static402.anIntArray491[0];
										}
										local1222 = local1103.method4359(Static186.aClass20_4);
										if (local1222 != null) {
											local1230 = local1222.method6210();
											local1255 = local1222.method6208();
											local1222.method6223(Static402.anIntArray491);
											if (local1242 < local1255) {
												local1242 = local1255;
											}
											local1238 = Static402.anIntArray491[0];
										}
										local1224 = local1103.method4360(Static186.aClass20_4);
										if (local1224 != null) {
											local1232 = local1224.method6210();
											local1255 = local1224.method6208();
											if (local1255 > local1242) {
												local1242 = local1255;
											}
											local1224.method6223(Static402.anIntArray491);
											local1240 = Static402.anIntArray491[0];
										}
									}
									@Pc(1468) Class68 local1468 = Static529.aClass68_10;
									@Pc(1470) Class68 local1470 = Static529.aClass68_10;
									@Pc(1472) Class239 local1472 = Static187.aClass239_8;
									local1255 = local1067.anInt5042;
									@Pc(1477) Class239 local1477 = Static187.aClass239_8;
									@Pc(1488) Class68 local1488;
									@Pc(1493) Class239 local1493;
									if (local1255 >= 0) {
										local1488 = Static204.method8292(Static186.aClass20_4, true, local1255);
										local1493 = Static43.method5097(Static186.aClass20_4, local1255);
										if (local1488 != null && local1493 != null) {
											local1468 = local1488;
											local1472 = local1493;
										}
									}
									if (local1103 != null) {
										local1255 = local1103.anInt5042;
										if (local1255 >= 0) {
											local1488 = Static204.method8292(Static186.aClass20_4, true, local1255);
											local1493 = Static43.method5097(Static186.aClass20_4, local1255);
											if (local1488 != null && local1493 != null) {
												local1477 = local1493;
												local1470 = local1488;
											}
										}
									}
									@Pc(1534) String local1534 = null;
									@Pc(1538) int local1538 = 0;
									@Pc(1546) String local1546 = local1067.method4368(local26.anIntArray348[local202]);
									@Pc(1551) int local1551 = local1472.method6482(local1546);
									if (local1103 != null) {
										local1534 = local1103.method4368(local26.anIntArray353[local202]);
										local1538 = local1477.method6482(local1534);
									}
									@Pc(1568) int local1568 = 0;
									if (local1204 > 0) {
										local1568 = local1551 / local1204 + 1;
									}
									@Pc(1578) int local1578 = 0;
									if (local1103 != null && local1228 > 0) {
										local1578 = local1538 / local1228 + 1;
									}
									@Pc(1590) int local1590 = 0;
									if (local1202 > 0) {
										local1590 = local1202;
									}
									local1590 += 2;
									@Pc(1601) int local1601 = local1590;
									if (local1206 > 0) {
										local1590 += local1206;
									}
									@Pc(1609) int local1609 = local1590;
									@Pc(1611) int local1611 = local1590;
									@Pc(1626) int local1626;
									if (local1204 <= 0) {
										local1590 += local1551;
									} else {
										local1626 = local1204 * local1568;
										local1611 = local1590 + (local1626 - local1551) / 2;
										local1590 += local1626;
									}
									local1626 = local1590;
									if (local1208 > 0) {
										local1590 += local1208;
									}
									@Pc(1652) int local1652 = 0;
									@Pc(1654) int local1654 = 0;
									@Pc(1656) int local1656 = 0;
									@Pc(1658) int local1658 = 0;
									@Pc(1660) int local1660 = 0;
									@Pc(1690) int local1690;
									if (local1103 != null) {
										local1590 += 2;
										local1652 = local1590;
										if (local1226 > 0) {
											local1590 += local1226;
										}
										local1590 += 2;
										local1654 = local1590;
										if (local1230 > 0) {
											local1590 += local1230;
										}
										local1660 = local1590;
										local1656 = local1590;
										if (local1228 > 0) {
											local1690 = local1578 * local1228;
											local1660 = local1590 + (local1690 - local1538) / 2;
											local1590 += local1690;
										} else {
											local1590 += local1538;
										}
										local1658 = local1590;
										if (local1232 > 0) {
											local1590 += local1232;
										}
									}
									local1690 = local26.anIntArray347[local202] - Static407.anInt7704;
									@Pc(1739) int local1739 = local1067.anInt5032 - local1067.anInt5032 * local1690 / local1067.anInt5041;
									@Pc(1751) int local1751 = local1067.anInt5031 * local1690 / local1067.anInt5041 - local1067.anInt5031;
									@Pc(1765) int local1765 = arg2 + Static613.anIntArray690[0] + local1739 - (local1590 >> 1);
									@Pc(1776) int local1776 = arg0 + Static613.anIntArray690[1] + local1751 - 12;
									@Pc(1778) int local1778 = local1776;
									@Pc(1782) int local1782 = local1776 + local1242;
									@Pc(1790) int local1790 = local1776 + local1067.anInt5029 + 15;
									@Pc(1796) int local1796 = local1790 - local1472.anInt7559;
									@Pc(1802) int local1802 = local1790 + local1472.anInt7564;
									if (local1796 < local1776) {
										local1778 = local1796;
									}
									if (local1782 < local1802) {
										local1782 = local1802;
									}
									@Pc(1818) int local1818 = 0;
									@Pc(1834) int local1834;
									@Pc(1844) int local1844;
									if (local1103 != null) {
										local1818 = local1776 + local1103.anInt5029 + 15;
										local1834 = local1818 - local1477.anInt7559;
										if (local1834 < local1778) {
											local1778 = local1834;
										}
										local1844 = local1477.anInt7564 + local1818;
										if (local1844 > local1782) {
											local1782 = local1844;
										}
									}
									local1834 = 255;
									if (local1067.anInt5034 >= 0) {
										local1834 = (local1690 << 8) / (local1067.anInt5041 - local1067.anInt5034);
									}
									if (local1834 >= 0 && local1834 < 255) {
										local1844 = local1834 << 24;
										@Pc(1884) int local1884 = local1844 | 0xFFFFFF;
										if (local1247 != null) {
											local1247.method6203(local1765 - local1210, local1776, 0, local1884, 1);
										}
										if (local1305 != null) {
											local1305.method6203(local1601 + local1765 - local1214, local1776, 0, local1884, 1);
										}
										@Pc(1916) int local1916;
										if (local1276 != null) {
											for (local1916 = 0; local1916 < local1568; local1916++) {
												local1276.method6203(local1609 + local1765 + local1204 * local1916 - local1212, local1776, 0, local1884, 1);
											}
										}
										if (local1334 != null) {
											local1334.method6203(local1626 + local1765 - local1216, local1776, 0, local1884, 1);
										}
										local1468.method8107(local1546, local1067.anInt5050 | local1844, local1790, local1611 + local1765, 0);
										if (local1103 != null) {
											if (local1218 != null) {
												local1218.method6203(local1765 + local1652 - local1234, local1776, 0, local1884, 1);
											}
											if (local1222 != null) {
												local1222.method6203(local1654 + local1765 - local1238, local1776, 0, local1884, 1);
											}
											if (local1220 != null) {
												for (local1916 = 0; local1916 < local1578; local1916++) {
													local1220.method6203(local1916 * local1228 + local1765 + local1656 - local1236, local1776, 0, local1884, 1);
												}
											}
											if (local1224 != null) {
												local1224.method6203(local1765 + local1658 - local1240, local1776, 0, local1884, 1);
											}
											local1470.method8107(local1534, local1844 | local1103.anInt5050, local1818, local1765 + local1660, 0);
										}
									} else {
										if (local1247 != null) {
											local1247.method6213(local1765 - local1210, local1776);
										}
										if (local1305 != null) {
											local1305.method6213(local1765 + local1601 - local1214, local1776);
										}
										if (local1276 != null) {
											for (local1844 = 0; local1844 < local1568; local1844++) {
												local1276.method6213(local1609 + local1765 + local1844 * local1204 - local1212, local1776);
											}
										}
										if (local1334 != null) {
											local1334.method6213(local1626 + local1765 - local1216, local1776);
										}
										local1468.method8107(local1546, local1067.anInt5050 | 0xFF000000, local1790, local1765 + local1611, 0);
										if (local1103 != null) {
											if (local1218 != null) {
												local1218.method6213(local1765 + local1652 - local1234, local1776);
											}
											if (local1222 != null) {
												local1222.method6213(local1654 + local1765 - local1238, local1776);
											}
											if (local1220 != null) {
												for (local1844 = 0; local1844 < local1578; local1844++) {
													local1220.method6213(local1844 * local1228 + local1765 + local1656 - local1236, local1776);
												}
											}
											if (local1224 != null) {
												local1224.method6213(local1658 + local1765 - local1240, local1776);
											}
											local1470.method8107(local1534, local1103.anInt5050 | 0xFF000000, local1818, local1660 + local1765, 0);
										}
									}
									Static113.method2842(local1765, local1765 + local1590, local1778, local1782 + 1);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2228) int local2228;
		for (@Pc(2222) int local2222 = 0; local2222 < Static246.anInt5332; local2222++) {
			local2228 = Static628.anIntArray707[local2222];
			@Pc(2241) Class3_Sub1_Sub3_Sub3 local2241;
			if (local2228 >= 2048) {
				local2241 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) (local2228 - 2048))).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			} else {
				local2241 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local2228];
			}
			local202 = Static60.anIntArray88[local2222];
			@Pc(2266) Class3_Sub1_Sub3_Sub3 local2266;
			if (local202 >= 2048) {
				local2266 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) (local202 - 2048))).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			} else {
				local2266 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local202];
			}
			Static463.method7186(--local2241.anInt6058, arg1, arg0, arg3, arg2, local2266, local2241);
		}
		local2228 = Static161.aClass239_14.anInt7564 + Static161.aClass239_14.anInt7559 + 2;
		for (local177 = 0; local177 < Static323.anInt6581; local177++) {
			local202 = Static67.anIntArray96[local177];
			local1060 = Static67.anIntArray93[local177];
			local439 = Static67.anIntArray95[local177];
			@Pc(2323) boolean local2323 = true;
			while (local2323) {
				local2323 = false;
				for (local576 = 0; local576 < local177; local576++) {
					if (local1060 + 2 > Static67.anIntArray93[local576] + -local2228 && local1060 - local2228 < Static67.anIntArray93[local576] + 2 && local202 - local439 < Static67.anIntArray96[local576] - -Static67.anIntArray95[local576] && Static67.anIntArray96[local576] - Static67.anIntArray95[local576] < local202 + local439 && local1060 > Static67.anIntArray93[local576] - local2228) {
						local1060 = Static67.anIntArray93[local576] - local2228;
						local2323 = true;
					}
				}
			}
			Static67.anIntArray93[local177] = local1060;
			@Pc(2415) String local2415 = Static67.aStringArray10[local177];
			local259 = Static161.aClass239_14.method6482(local2415);
			local337 = local202 + arg2;
			local340 = local1060 + arg0 - Static161.aClass239_14.anInt7559;
			local1157 = local337 + local259;
			@Pc(2445) int local2445 = local1060 + arg0 + Static161.aClass239_14.anInt7564;
			if (Static607.anInt10666 == 0) {
				@Pc(2475) int local2475 = 16776960;
				if (Static67.anIntArray94[local177] < 6) {
					local2475 = Static359.anIntArray450[Static67.anIntArray94[local177]];
				}
				if (Static67.anIntArray94[local177] == 6) {
					local2475 = Static438.anInt8137 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static67.anIntArray94[local177] == 7) {
					local2475 = Static438.anInt8137 % 20 < 10 ? 255 : 65535;
				}
				if (Static67.anIntArray94[local177] == 8) {
					local2475 = Static438.anInt8137 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2546) int local2546;
				if (Static67.anIntArray94[local177] == 9) {
					local2546 = 150 - Static67.anIntArray92[local177];
					if (local2546 < 50) {
						local2475 = local2546 * 1280 + 16711680;
					} else if (local2546 < 100) {
						local2475 = 16384000 + 16776960 - local2546 * 327680;
					} else if (local2546 < 150) {
						local2475 = (local2546 - 100) * 5 + 65280;
					}
				}
				if (Static67.anIntArray94[local177] == 10) {
					local2546 = 150 - Static67.anIntArray92[local177];
					if (local2546 < 50) {
						local2475 = local2546 * 5 + 16711680;
					} else if (local2546 < 100) {
						local2475 = 33095935 - local2546 * 327680;
					} else if (local2546 < 150) {
						local2475 = local2546 * 327680 + 500 - local2546 * 5 - 32767745;
					}
				}
				if (Static67.anIntArray94[local177] == 11) {
					local2546 = 150 - Static67.anIntArray92[local177];
					if (local2546 < 50) {
						local2475 = 16777215 - local2546 * 327685;
					} else if (local2546 < 100) {
						local2475 = (local2546 - 50) * 327685 + 65280;
					} else if (local2546 < 150) {
						local2475 = 16777215 - (local2546 - 100) * 327680;
					}
				}
				local2546 = local2475 | 0xFF000000;
				if (Static67.anIntArray91[local177] == 0) {
					Static571.aClass68_12.method8106(local202 + arg2, local2546, local2415, -16777216, local1060 + arg0);
					local337 -= local259 >> 1;
					local1157 -= local259 >> 1;
				}
				if (Static67.anIntArray91[local177] == 1) {
					local1157 -= local259 >> 1;
					local337 -= local259 >> 1;
					Static571.aClass68_12.method8105(local2546, local1060 + arg0, local2415, arg2 + local202, Static438.anInt8137);
					local2445 += 5;
					local340 -= 5;
				}
				if (Static67.anIntArray91[local177] == 2) {
					local2445 += 5;
					local1157 -= (local259 >> 1) - 5;
					Static571.aClass68_12.method8112(local2415, local2546, Static438.anInt8137, local1060 + arg0, arg2 - -local202);
					local340 -= 5;
					local337 -= (local259 >> 1) + 5;
				}
				if (Static67.anIntArray91[local177] == 3) {
					local1157 -= local259 >> 1;
					local337 -= local259 >> 1;
					local2445 += 7;
					Static571.aClass68_12.method8108(Static438.anInt8137, arg0 + local1060, local2415, local2546, 150 - Static67.anIntArray92[local177], local202 + arg2);
					local340 -= 7;
				}
				@Pc(2858) int local2858;
				if (Static67.anIntArray91[local177] == 4) {
					local2858 = (150 - Static67.anIntArray92[local177]) * (Static161.aClass239_14.method6482(local2415) + 100) / 150;
					Static186.aClass20_4.T(arg2 + local202 - 50, arg0, local202 + arg2 + 50, arg0 - -arg1);
					local337 += 50 - local2858;
					local1157 += 50 - local2858;
					Static571.aClass68_12.method8107(local2415, local2546, arg0 + local1060, arg2 - (-local202 - 50) - local2858, -16777216);
					Static186.aClass20_4.KA(arg2, arg0, arg3 + arg2, arg0 + arg1);
				}
				if (Static67.anIntArray91[local177] == 5) {
					local2858 = 150 - Static67.anIntArray92[local177];
					local1202 = 0;
					if (local2858 < 25) {
						local1202 = local2858 - 25;
					} else if (local2858 > 125) {
						local1202 = local2858 - 125;
					}
					local1204 = Static161.aClass239_14.anInt7564 + Static161.aClass239_14.anInt7559;
					Static186.aClass20_4.T(arg2, local1060 + arg0 - local1204 - 1, arg3 + arg2, local1060 + arg0 + 5);
					local337 -= local259 >> 1;
					local2445 += local1202;
					Static571.aClass68_12.method8106(local202 + arg2, local2546, local2415, -16777216, local1202 + arg0 + local1060);
					local340 += local1202;
					local1157 -= local259 >> 1;
					Static186.aClass20_4.KA(arg2, arg0, arg3 + arg2, arg1 + arg0);
				}
			} else {
				local337 -= local259 >> 1;
				local1157 -= local259 >> 1;
				Static571.aClass68_12.method8106(local202 + arg2, -256, local2415, -16777216, local1060 + arg0);
			}
			Static113.method2842(local337, local1157 + 1, local340, local2445 + 1);
		}
	}
}
