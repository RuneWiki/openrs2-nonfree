import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
	public static int anInt8419;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
	public static int anInt8417 = -1;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_155 = new Class268(66, 20);

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_156 = new Class268(71, 6);

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	public static int anInt8420 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIII)V")
	public static void method7254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = Static530.anInt8592;
		@Pc(9) int[] local9 = Static551.anIntArray576;
		Static25.anInt440 = 0;
		@Pc(178) int local178;
		@Pc(211) int local211;
		@Pc(256) int local256;
		@Pc(332) int local332;
		@Pc(335) int local335;
		@Pc(1117) int local1117;
		@Pc(1163) int local1163;
		@Pc(1165) int local1165;
		@Pc(432) int local432;
		@Pc(1017) int local1017;
		@Pc(534) int local534;
		for (@Pc(21) int local21 = 0; local21 < local7 + Static252.anInt5066; local21++) {
			@Pc(25) Class247 local25 = null;
			@Pc(34) Class20_Sub2_Sub2_Sub1 local34;
			if (local21 < local7) {
				local34 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local9[local21]];
			} else {
				local34 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local21 - local7])).aClass20_Sub2_Sub2_Sub1_Sub2_1;
				local25 = ((Class20_Sub2_Sub2_Sub1_Sub2) local34).aClass247_1;
				if (local25.anIntArray467 != null) {
					local25 = local25.method6613(Static279.aClass294_1);
					if (local25 == null) {
						continue;
					}
				}
			}
			if (local34.anInt5564 >= 0 && (local34.anInt5496 == Static167.anInt3480 || local34.aByte131 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131)) {
				Static252.method4524(local34.method4905(), arg2 >> 1, arg0 >> 1, local34);
				if (Static258.anIntArray298[0] >= 0) {
					if (local34.aString61 != null && (local7 <= local21 || Static231.anInt4574 == 0 || Static231.anInt4574 == 3 || Static231.anInt4574 == 1 && Static312.method5230(((Class20_Sub2_Sub2_Sub1_Sub1) local34).aString12)) && Static112.anInt2203 > Static25.anInt440) {
						Static112.anIntArray151[Static25.anInt440] = Static31.aClass133_3.method3643(local34.aString61) / 2;
						Static112.anIntArray156[Static25.anInt440] = Static258.anIntArray298[0];
						Static112.anIntArray153[Static25.anInt440] = Static258.anIntArray298[1];
						Static112.anIntArray155[Static25.anInt440] = local34.anInt5506;
						Static112.anIntArray152[Static25.anInt440] = local34.anInt5510;
						Static112.anIntArray150[Static25.anInt440] = local34.anInt5552;
						Static112.aStringArray23[Static25.anInt440] = local34.aString61;
						Static25.anInt440++;
					}
					local178 = Static258.anIntArray298[1] + arg1;
					@Pc(241) Class32[] local241;
					@Pc(248) Class98[] local248;
					@Pc(304) Class32 local304;
					if (local34.aBoolean377 || local34.anInt5493 <= Static113.anInt2243) {
						local178 -= Math.max(Static31.aClass133_3.anInt4192, Static333.aClass32Array20[0].method5077());
					} else {
						@Pc(193) byte local193 = 1;
						if (local21 < local7) {
							@Pc(206) Class20_Sub2_Sub2_Sub1_Sub1 local206 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local9[local21]];
							local211 = local34.method4911().anInt6344;
							if (local206.aBoolean74) {
								local193 = 2;
							}
						} else {
							local211 = local25.anInt7670;
							if (local211 == -1) {
								local211 = local34.method4911().anInt6344;
							}
						}
						@Pc(231) Class32[] local231 = Static333.aClass32Array20;
						if (local211 != -1) {
							local241 = (Class32[]) Static137.aClass166_16.method4805((long) local211);
							if (local241 == null) {
								local248 = Static651.method2405(Static540.aClass353_110, local211);
								if (local248 != null) {
									local241 = new Class32[local248.length];
									for (local256 = 0; local256 < local248.length; local256++) {
										local241[local256] = Static162.aClass100_7.method8773(local248[local256], true);
									}
									Static137.aClass166_16.method4803(local241, (long) local211);
								}
							}
							if (local241 != null && local241.length >= 2) {
								local231 = local241;
							}
						}
						if (local193 >= local231.length) {
							local193 = 1;
						}
						@Pc(300) Class32 local300 = local231[0];
						local304 = local231[local193];
						local178 -= Math.max(Static31.aClass133_3.anInt4192, local300.method5077());
						local256 = Static258.anIntArray298[0] + arg3 - (local300.method5072() >> 1);
						local332 = local300.method5072() * local34.anInt5561 / 255;
						local335 = local300.method5077();
						if (local34.anInt5561 > 0 && local332 < 2) {
							local332 = 2;
						}
						local300.method5071(local256, local178);
						Static162.aClass100_7.T(local256, local178, local256 + local332, local335 + local178);
						local304.method5071(local256, local178);
						Static162.aClass100_7.KA(arg3, arg1, arg3 + arg0, arg1 - -arg2);
						Static347.method5621(local178 + local335, local256 + local300.method5080(), local178, local256);
					}
					local178 -= 2;
					if (!local34.aBoolean377) {
						@Pc(413) Class32 local413;
						@Pc(422) Class32 local422;
						if (local34.anInt5565 > Static113.anInt2243) {
							local413 = Static380.aClass32Array7[local34.aBoolean374 ? 2 : 0];
							local422 = Static380.aClass32Array7[local34.aBoolean374 ? 3 : 1];
							if (local34 instanceof Class20_Sub2_Sub2_Sub1_Sub2) {
								local432 = local25.anInt7674;
								if (local432 == -1) {
									local432 = local34.method4911().anInt6325;
								}
							} else {
								local432 = local34.method4911().anInt6325;
							}
							if (local432 != -1) {
								local241 = (Class32[]) Static31.aClass166_2.method4805((long) local432);
								if (local241 == null) {
									local248 = Static651.method2405(Static540.aClass353_110, local432);
									if (local248 != null) {
										local241 = new Class32[local248.length];
										for (local256 = 0; local256 < local248.length; local256++) {
											local241[local256] = Static162.aClass100_7.method8773(local248[local256], true);
										}
										Static31.aClass166_2.method4803(local241, (long) local432);
									}
								}
								if (local241 != null && local241.length == 4) {
									local413 = local241[local34.aBoolean374 ? 2 : 0];
									local422 = local241[local34.aBoolean374 ? 3 : 1];
								}
							}
							@Pc(527) int local527 = local34.anInt5565 - Static113.anInt2243;
							if (local527 <= local34.anInt5539) {
								local534 = local413.method5072();
							} else {
								local527 -= local34.anInt5539;
								local256 = local34.anInt5498 == 0 ? 0 : (local34.anInt5488 - local527) / local34.anInt5498 * local34.anInt5498;
								local534 = local256 * local413.method5072() / local34.anInt5488;
							}
							local256 = local413.method5077();
							local178 -= local256;
							local332 = arg3 + Static258.anIntArray298[0] - (local413.method5072() >> 1);
							local413.method5071(local332, local178);
							Static162.aClass100_7.T(local332, local178, local534 + local332, local256 + local178);
							local422.method5071(local332, local178);
							Static162.aClass100_7.KA(arg3, arg1, arg0 + arg3, arg1 + arg2);
							Static347.method5621(local256 + local178, local332 - -local413.method5080(), local178, local332);
							local178 -= 2;
						}
						if (local21 < local7) {
							@Pc(698) Class20_Sub2_Sub2_Sub1_Sub1 local698 = (Class20_Sub2_Sub2_Sub1_Sub1) local34;
							if (local698.anInt1221 != -1) {
								local178 -= 25;
								local422 = Static194.aClass32Array10[local698.anInt1221];
								local422.method5071(Static258.anIntArray298[0] + arg3 - 12, local178);
								Static347.method5621(local178 + local422.method5079(), Static258.anIntArray298[0] + -12 + arg3 - -local422.method5080(), local178, Static258.anIntArray298[0] + arg3 - 12);
								local178 -= 2;
							}
							if (local698.anInt1223 != -1) {
								local178 -= 25;
								local422 = Static499.aClass32Array18[local698.anInt1223];
								local422.method5071(Static258.anIntArray298[0] + arg3 - 12, local178);
								Static347.method5621(local422.method5079() + local178, arg3 - -Static258.anIntArray298[0] - (12 - local422.method5080()), local178, Static258.anIntArray298[0] + arg3 - 12);
								local178 -= 2;
							}
						} else if (local25.anInt7678 >= 0 && Static499.aClass32Array18.length > local25.anInt7678) {
							local178 -= 25;
							local413 = Static499.aClass32Array18[local25.anInt7678];
							local413.method5071(Static258.anIntArray298[0] + arg3 - (local413.method5072() >> 1), local178);
							Static347.method5621(local178 + local413.method5079(), Static258.anIntArray298[0] + (arg3 - (local413.method5072() >> 1) - -local413.method5080()), local178, Static258.anIntArray298[0] + arg3 - (local413.method5072() >> 1));
							local178 -= 2;
						}
					}
					@Pc(803) Class19[] local803;
					@Pc(811) Class19 local811;
					if (!(local34 instanceof Class20_Sub2_Sub2_Sub1_Sub1)) {
						local211 = 0;
						local803 = Static325.aClass19Array1;
						for (local432 = 0; local432 < local803.length; local432++) {
							local811 = local803[local432];
							if (local811 != null && local811.anInt332 == 1 && local811.anInt331 == Static483.anIntArray525[local21 - local7]) {
								local304 = Static30.aClass32Array11[local811.anInt334];
								if (local211 < local304.method5077()) {
									local211 = local304.method5077();
								}
								if (Static113.anInt2243 % 20 < 10) {
									local304.method5071(Static258.anIntArray298[0] + arg3 - 12, local178 - local304.method5077());
									Static347.method5621(local178 - local304.method5077() + local304.method5079(), Static258.anIntArray298[0] + arg3 - 12 + local304.method5080(), local178 - local304.method5077(), arg3 - (-Static258.anIntArray298[0] - -12));
								}
							}
						}
						if (local211 > 0) {
						}
					} else if (local21 >= 0) {
						local211 = 0;
						local803 = Static325.aClass19Array1;
						for (local432 = 0; local432 < local803.length; local432++) {
							local811 = local803[local432];
							if (local811 != null && local811.anInt332 == 10 && local9[local21] == local811.anInt331) {
								local304 = Static30.aClass32Array11[local811.anInt334];
								if (local304.method5077() > local211) {
									local211 = local304.method5077();
								}
								local304.method5071(Static258.anIntArray298[0] + arg3 - 12, local178 - local304.method5077());
								Static347.method5621(local178 - local304.method5077() + local304.method5079(), Static258.anIntArray298[0] + -12 + arg3 - -local304.method5080(), local178 - local304.method5077(), Static258.anIntArray298[0] + arg3 - 12);
							}
						}
						if (local211 > 0) {
						}
					}
					for (local211 = 0; local211 < Static637.anInt10653; local211++) {
						local1017 = local34.anIntArray333[local211];
						local432 = local34.anIntArray332[local211];
						@Pc(1024) Class145 local1024 = null;
						local534 = 0;
						if (local432 >= 0) {
							if (Static113.anInt2243 >= local1017) {
								continue;
							}
							local1024 = Static504.aClass335_6.method8110(local34.anIntArray332[local211]);
							local534 = local1024.anInt4423;
						} else if (local1017 < 0) {
							continue;
						}
						local256 = local34.anIntArray330[local211];
						@Pc(1060) Class145 local1060 = null;
						if (local256 >= 0) {
							local1060 = Static504.aClass335_6.method8110(local256);
						}
						if (local1017 - local534 <= Static113.anInt2243) {
							local335 = local34.anIntArray329[local211];
							if (local335 >= 0) {
								local34.anInt5561 = local335;
								local34.anInt5493 = Static113.anInt2243 + 300;
								local34.anIntArray329[local211] = -1;
							}
							if (local1024 == null) {
								local34.anIntArray333[local211] = -1;
							} else {
								local1117 = local34.method4905() / 2;
								Static252.method4524(local1117, arg2 >> 1, arg0 >> 1, local34);
								if (Static258.anIntArray298[0] > -1) {
									Static258.anIntArray298[0] += Static183.anIntArray225[local211];
									Static258.anIntArray298[1] += Static94.anIntArray123[local211];
									local1163 = 0;
									local1165 = 0;
									@Pc(1167) int local1167 = 0;
									@Pc(1169) int local1169 = 0;
									@Pc(1171) int local1171 = 0;
									@Pc(1173) int local1173 = 0;
									@Pc(1175) int local1175 = 0;
									@Pc(1177) int local1177 = 0;
									@Pc(1179) Class32 local1179 = null;
									@Pc(1181) Class32 local1181 = null;
									@Pc(1183) Class32 local1183 = null;
									@Pc(1185) Class32 local1185 = null;
									@Pc(1187) int local1187 = 0;
									@Pc(1189) int local1189 = 0;
									@Pc(1191) int local1191 = 0;
									@Pc(1193) int local1193 = 0;
									@Pc(1195) int local1195 = 0;
									@Pc(1197) int local1197 = 0;
									@Pc(1199) int local1199 = 0;
									@Pc(1201) int local1201 = 0;
									@Pc(1203) int local1203 = 0;
									@Pc(1208) Class32 local1208 = local1024.method3883(Static162.aClass100_7);
									@Pc(1216) int local1216;
									if (local1208 != null) {
										local1163 = local1208.method5072();
										local1216 = local1208.method5077();
										local1208.method5082(Static628.anIntArray633);
										if (local1216 > 0) {
											local1203 = local1216;
										}
										local1171 = Static628.anIntArray633[0];
									}
									@Pc(1233) Class32 local1233 = local1024.method3876(Static162.aClass100_7);
									if (local1233 != null) {
										local1165 = local1233.method5072();
										local1216 = local1233.method5077();
										if (local1203 < local1216) {
											local1203 = local1216;
										}
										local1233.method5082(Static628.anIntArray633);
										local1173 = Static628.anIntArray633[0];
									}
									@Pc(1258) Class32 local1258 = local1024.method3881(Static162.aClass100_7);
									if (local1258 != null) {
										local1167 = local1258.method5072();
										local1216 = local1258.method5077();
										local1258.method5082(Static628.anIntArray633);
										if (local1203 < local1216) {
											local1203 = local1216;
										}
										local1175 = Static628.anIntArray633[0];
									}
									@Pc(1283) Class32 local1283 = local1024.method3882(Static162.aClass100_7);
									if (local1283 != null) {
										local1169 = local1283.method5072();
										local1216 = local1283.method5077();
										local1283.method5082(Static628.anIntArray633);
										if (local1203 < local1216) {
											local1203 = local1216;
										}
										local1177 = Static628.anIntArray633[0];
									}
									if (local1060 != null) {
										local1179 = local1060.method3883(Static162.aClass100_7);
										if (local1179 != null) {
											local1187 = local1179.method5072();
											local1216 = local1179.method5077();
											if (local1216 > local1203) {
												local1203 = local1216;
											}
											local1179.method5082(Static628.anIntArray633);
											local1195 = Static628.anIntArray633[0];
										}
										local1181 = local1060.method3876(Static162.aClass100_7);
										if (local1181 != null) {
											local1189 = local1181.method5072();
											local1216 = local1181.method5077();
											local1181.method5082(Static628.anIntArray633);
											if (local1203 < local1216) {
												local1203 = local1216;
											}
											local1197 = Static628.anIntArray633[0];
										}
										local1183 = local1060.method3881(Static162.aClass100_7);
										if (local1183 != null) {
											local1191 = local1183.method5072();
											local1216 = local1183.method5077();
											if (local1216 > local1203) {
												local1203 = local1216;
											}
											local1183.method5082(Static628.anIntArray633);
											local1199 = Static628.anIntArray633[0];
										}
										local1185 = local1060.method3882(Static162.aClass100_7);
										if (local1185 != null) {
											local1193 = local1185.method5072();
											local1216 = local1185.method5077();
											local1185.method5082(Static628.anIntArray633);
											if (local1203 < local1216) {
												local1203 = local1216;
											}
											local1201 = Static628.anIntArray633[0];
										}
									}
									@Pc(1419) Class50 local1419 = Static631.aClass50_12;
									@Pc(1421) Class50 local1421 = Static631.aClass50_12;
									@Pc(1423) Class133 local1423 = Static545.aClass133_42;
									@Pc(1425) Class133 local1425 = Static545.aClass133_42;
									local1216 = local1024.anInt4432;
									@Pc(1439) Class50 local1439;
									@Pc(1444) Class133 local1444;
									if (local1216 >= 0) {
										local1439 = Static433.method6750(true, Static162.aClass100_7, local1216);
										local1444 = Static193.method3449(Static162.aClass100_7, local1216);
										if (local1439 != null && local1444 != null) {
											local1423 = local1444;
											local1419 = local1439;
										}
									}
									if (local1060 != null) {
										local1216 = local1060.anInt4432;
										if (local1216 >= 0) {
											local1439 = Static433.method6750(true, Static162.aClass100_7, local1216);
											local1444 = Static193.method3449(Static162.aClass100_7, local1216);
											if (local1439 != null && local1444 != null) {
												local1421 = local1439;
												local1425 = local1444;
											}
										}
									}
									@Pc(1485) String local1485 = null;
									@Pc(1489) int local1489 = 0;
									@Pc(1497) String local1497 = local1024.method3874(local34.anIntArray326[local211]);
									@Pc(1502) int local1502 = local1423.method3643(local1497);
									if (local1060 != null) {
										local1485 = local1060.method3874(local34.anIntArray331[local211]);
										local1489 = local1425.method3643(local1485);
									}
									@Pc(1519) int local1519 = 0;
									if (local1165 > 0) {
										local1519 = local1502 / local1165 + 1;
									}
									@Pc(1529) int local1529 = 0;
									if (local1060 != null && local1189 > 0) {
										local1529 = local1489 / local1189 + 1;
									}
									@Pc(1541) int local1541 = 0;
									if (local1163 > 0) {
										local1541 = local1163;
									}
									local1541 += 2;
									@Pc(1555) int local1555 = local1541;
									if (local1167 > 0) {
										local1541 += local1167;
									}
									@Pc(1566) int local1566 = local1541;
									@Pc(1568) int local1568 = local1541;
									@Pc(1577) int local1577;
									if (local1165 > 0) {
										local1577 = local1165 * local1519;
										local1541 += local1577;
										local1568 += (local1577 - local1502) / 2;
									} else {
										local1541 += local1502;
									}
									local1577 = local1541;
									if (local1169 > 0) {
										local1541 += local1169;
									}
									@Pc(1606) int local1606 = 0;
									@Pc(1608) int local1608 = 0;
									@Pc(1610) int local1610 = 0;
									@Pc(1612) int local1612 = 0;
									@Pc(1614) int local1614 = 0;
									@Pc(1653) int local1653;
									if (local1060 != null) {
										local1541 += 2;
										local1606 = local1541;
										if (local1187 > 0) {
											local1541 += local1187;
										}
										local1541 += 2;
										local1608 = local1541;
										if (local1191 > 0) {
											local1541 += local1191;
										}
										local1614 = local1541;
										local1610 = local1541;
										if (local1189 <= 0) {
											local1541 += local1489;
										} else {
											local1653 = local1529 * local1189;
											local1614 = local1541 + (local1653 - local1489) / 2;
											local1541 += local1653;
										}
										local1612 = local1541;
										if (local1193 > 0) {
											local1541 += local1193;
										}
									}
									local1653 = local34.anIntArray333[local211] - Static113.anInt2243;
									@Pc(1696) int local1696 = local1024.anInt4417 - local1024.anInt4417 * local1653 / local1024.anInt4423;
									@Pc(1709) int local1709 = local1024.anInt4418 * local1653 / local1024.anInt4423 - local1024.anInt4418;
									@Pc(1723) int local1723 = local1696 + arg3 + Static258.anIntArray298[0] - (local1541 >> 1);
									@Pc(1733) int local1733 = Static258.anIntArray298[1] + arg1 + local1709 - 12;
									@Pc(1735) int local1735 = local1733;
									@Pc(1739) int local1739 = local1203 + local1733;
									@Pc(1747) int local1747 = local1733 + local1024.anInt4428 + 15;
									@Pc(1752) int local1752 = local1747 - local1423.anInt4192;
									if (local1733 > local1752) {
										local1735 = local1752;
									}
									@Pc(1767) int local1767 = local1747 + local1423.anInt4190;
									if (local1739 < local1767) {
										local1739 = local1767;
									}
									@Pc(1778) int local1778 = 0;
									@Pc(1792) int local1792;
									@Pc(1797) int local1797;
									if (local1060 != null) {
										local1778 = local1060.anInt4428 + local1733 + 15;
										local1792 = local1778 - local1425.anInt4192;
										local1797 = local1425.anInt4190 + local1778;
										if (local1735 > local1792) {
											local1735 = local1792;
										}
										if (local1797 > local1739) {
											local1739 = local1797;
										}
									}
									local1792 = 255;
									if (local1024.anInt4434 >= 0) {
										local1792 = (local1653 << 8) / (local1024.anInt4423 - local1024.anInt4434);
									}
									if (local1792 >= 0 && local1792 < 255) {
										local1797 = local1792 << 24;
										@Pc(1999) int local1999 = local1797 | 0xFFFFFF;
										if (local1208 != null) {
											local1208.method5088(local1723 - local1171, local1733, 0, local1999, 1);
										}
										if (local1258 != null) {
											local1258.method5088(local1555 + local1723 - local1175, local1733, 0, local1999, 1);
										}
										@Pc(2031) int local2031;
										if (local1233 != null) {
											for (local2031 = 0; local2031 < local1519; local2031++) {
												local1233.method5088(local1566 + local1723 + local1165 * local2031 - local1173, local1733, 0, local1999, 1);
											}
										}
										if (local1283 != null) {
											local1283.method5088(local1723 + local1577 - local1177, local1733, 0, local1999, 1);
										}
										local1419.method5736(0, local1723 + local1568, local1497, local1747, local1797 | local1024.anInt4419);
										if (local1060 != null) {
											if (local1179 != null) {
												local1179.method5088(local1723 + local1606 - local1195, local1733, 0, local1999, 1);
											}
											if (local1183 != null) {
												local1183.method5088(local1723 + local1608 - local1199, local1733, 0, local1999, 1);
											}
											if (local1181 != null) {
												for (local2031 = 0; local2031 < local1529; local2031++) {
													local1181.method5088(local1723 + local1610 + local1189 * local2031 - local1197, local1733, 0, local1999, 1);
												}
											}
											if (local1185 != null) {
												local1185.method5088(local1723 + local1612 - local1201, local1733, 0, local1999, 1);
											}
											local1421.method5736(0, local1614 + local1723, local1485, local1778, local1797 | local1060.anInt4419);
										}
									} else {
										if (local1208 != null) {
											local1208.method5071(local1723 - local1171, local1733);
										}
										if (local1258 != null) {
											local1258.method5071(local1555 + local1723 - local1175, local1733);
										}
										if (local1233 != null) {
											for (local1797 = 0; local1797 < local1519; local1797++) {
												local1233.method5071(local1165 * local1797 + local1723 + local1566 - local1173, local1733);
											}
										}
										if (local1283 != null) {
											local1283.method5071(local1577 + local1723 - local1177, local1733);
										}
										local1419.method5736(0, local1723 + local1568, local1497, local1747, local1024.anInt4419 | 0xFF000000);
										if (local1060 != null) {
											if (local1179 != null) {
												local1179.method5071(local1723 + local1606 - local1195, local1733);
											}
											if (local1183 != null) {
												local1183.method5071(local1608 + local1723 - local1199, local1733);
											}
											if (local1181 != null) {
												for (local1797 = 0; local1797 < local1529; local1797++) {
													local1181.method5071(local1189 * local1797 + local1723 + local1610 - local1197, local1733);
												}
											}
											if (local1185 != null) {
												local1185.method5071(local1612 + local1723 - local1201, local1733);
											}
											local1421.method5736(0, local1723 + local1614, local1485, local1778, local1060.anInt4419 | 0xFF000000);
										}
									}
									Static347.method5621(local1739 + 1, local1541 + local1723, local1735, local1723);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2205) int local2205;
		for (@Pc(2199) int local2199 = 0; local2199 < Static233.anInt4696; local2199++) {
			local2205 = Static146.anIntArray320[local2199];
			@Pc(2214) Class20_Sub2_Sub2_Sub1 local2214;
			if (local2205 < 2048) {
				local2214 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local2205];
			} else {
				local2214 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) (local2205 - 2048))).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			}
			local211 = Static36.anIntArray42[local2199];
			@Pc(2245) Class20_Sub2_Sub2_Sub1 local2245;
			if (local211 >= 2048) {
				local2245 = ((Class6_Sub46) Static347.aClass128_23.method3560((long) (local211 - 2048))).aClass20_Sub2_Sub2_Sub1_Sub2_1;
			} else {
				local2245 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local211];
			}
			Static88.method1509(arg0, arg1, arg3, arg2, --local2214.anInt5524, local2245, local2214);
		}
		local2205 = Static31.aClass133_3.anInt4190 + Static31.aClass133_3.anInt4192 + 2;
		for (local178 = 0; local178 < Static25.anInt440; local178++) {
			local211 = Static112.anIntArray156[local178];
			local1017 = Static112.anIntArray153[local178];
			local432 = Static112.anIntArray151[local178];
			@Pc(2298) boolean local2298 = true;
			while (local2298) {
				local2298 = false;
				for (local534 = 0; local534 < local178; local534++) {
					if (Static112.anIntArray153[local534] - local2205 < local1017 + 2 && local1017 - local2205 < Static112.anIntArray153[local534] + 2 && local211 - local432 < Static112.anIntArray151[local534] + Static112.anIntArray156[local534] && Static112.anIntArray156[local534] - Static112.anIntArray151[local534] < local432 + local211 && local1017 > Static112.anIntArray153[local534] - local2205) {
						local2298 = true;
						local1017 = Static112.anIntArray153[local534] - local2205;
					}
				}
			}
			Static112.anIntArray153[local178] = local1017;
			@Pc(2393) String local2393 = Static112.aStringArray23[local178];
			local256 = Static31.aClass133_3.method3643(local2393);
			local332 = local211 + arg3;
			local335 = local1017 + arg1 - Static31.aClass133_3.anInt4192;
			local1117 = local256 + local332;
			@Pc(2423) int local2423 = arg1 + local1017 + Static31.aClass133_3.anInt4190;
			if (Static522.anInt9104 == 0) {
				@Pc(2430) int local2430 = 16776960;
				if (Static112.anIntArray155[local178] < 6) {
					local2430 = Static585.anIntArray599[Static112.anIntArray155[local178]];
				}
				if (Static112.anIntArray155[local178] == 6) {
					local2430 = Static167.anInt3480 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static112.anIntArray155[local178] == 7) {
					local2430 = Static167.anInt3480 % 20 >= 10 ? 65535 : 255;
				}
				if (Static112.anIntArray155[local178] == 8) {
					local2430 = Static167.anInt3480 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2499) int local2499;
				if (Static112.anIntArray155[local178] == 9) {
					local2499 = 150 - Static112.anIntArray150[local178];
					if (local2499 < 50) {
						local2430 = local2499 * 1280 + 16711680;
					} else if (local2499 < 100) {
						local2430 = 16776960 - (local2499 - 50) * 327680;
					} else if (local2499 < 150) {
						local2430 = (local2499 - 100) * 5 + 65280;
					}
				}
				if (Static112.anIntArray155[local178] == 10) {
					local2499 = 150 - Static112.anIntArray150[local178];
					if (local2499 < 50) {
						local2430 = local2499 * 5 + 16711680;
					} else if (local2499 < 100) {
						local2430 = 33095935 - local2499 * 327680;
					} else if (local2499 < 150) {
						local2430 = (local2499 - 100) * 327680 + 255 + 500 - local2499 * 5;
					}
				}
				if (Static112.anIntArray155[local178] == 11) {
					local2499 = 150 - Static112.anIntArray150[local178];
					if (local2499 < 50) {
						local2430 = 16777215 - local2499 * 327685;
					} else if (local2499 < 100) {
						local2430 = (local2499 - 50) * 327685 + 65280;
					} else if (local2499 < 150) {
						local2430 = 16777215 - (local2499 - 100) * 327680;
					}
				}
				local2499 = local2430 | 0xFF000000;
				if (Static112.anIntArray152[local178] == 0) {
					Static173.aClass50_5.method5734(local211 + arg3, local2393, -16777216, arg1 + local1017, local2499);
					local332 -= local256 >> 1;
					local1117 -= local256 >> 1;
				}
				if (Static112.anIntArray152[local178] == 1) {
					local2423 += 5;
					local332 -= local256 >> 1;
					local1117 -= local256 >> 1;
					Static173.aClass50_5.method5733(arg3 + local211, Static167.anInt3480, arg1 + local1017, local2393, local2499);
					local335 -= 5;
				}
				if (Static112.anIntArray152[local178] == 2) {
					local1117 -= (local256 >> 1) - 5;
					local332 -= (local256 >> 1) + 5;
					Static173.aClass50_5.method5746(local2393, local2499, arg3 + local211, local1017 + arg1, Static167.anInt3480);
					local2423 += 5;
					local335 -= 5;
				}
				if (Static112.anIntArray152[local178] == 3) {
					local2423 += 7;
					local335 -= 7;
					Static173.aClass50_5.method5747(local2499, 150 - Static112.anIntArray150[local178], local211 + arg3, local2393, Static167.anInt3480, local1017 + arg1);
					local1117 -= local256 >> 1;
					local332 -= local256 >> 1;
				}
				@Pc(2803) int local2803;
				if (Static112.anIntArray152[local178] == 4) {
					local2803 = (150 - Static112.anIntArray150[local178]) * (Static31.aClass133_3.method3643(local2393) + 100) / 150;
					Static162.aClass100_7.T(arg3 + local211 - 50, arg1, local211 + arg3 + 50, arg2 + arg1);
					local1117 += 50 - local2803;
					local332 += 50 - local2803;
					Static173.aClass50_5.method5736(-16777216, arg3 + local211 + 50 - local2803, local2393, local1017 + arg1, local2499);
					Static162.aClass100_7.KA(arg3, arg1, arg3 + arg0, arg1 - -arg2);
				}
				if (Static112.anIntArray152[local178] == 5) {
					local2803 = 150 - Static112.anIntArray150[local178];
					local1163 = 0;
					if (local2803 < 25) {
						local1163 = local2803 - 25;
					} else if (local2803 > 125) {
						local1163 = local2803 - 125;
					}
					local1165 = Static31.aClass133_3.anInt4190 + Static31.aClass133_3.anInt4192;
					Static162.aClass100_7.T(arg3, arg1 + local1017 - local1165 - 1, arg3 - -arg0, local1017 + arg1 + 5);
					local332 -= local256 >> 1;
					local2423 += local1163;
					local1117 -= local256 >> 1;
					local335 += local1163;
					Static173.aClass50_5.method5734(arg3 + local211, local2393, -16777216, arg1 + local1017 + local1163, local2499);
					Static162.aClass100_7.KA(arg3, arg1, arg3 + arg0, arg2 + arg1);
				}
			} else {
				local332 -= local256 >> 1;
				local1117 -= local256 >> 1;
				Static173.aClass50_5.method5734(local211 + arg3, local2393, -16777216, local1017 + arg1, -256);
			}
			Static347.method5621(local2423 + 1, local1117 + 1, local335, local332);
		}
	}
}
