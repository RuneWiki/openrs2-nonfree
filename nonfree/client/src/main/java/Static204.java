import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!gs", name = "db", descriptor = "[I")
	private static final int[] anIntArray211 = new int[4];

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method3035(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class347 local10 = Static435.method6495();
		@Pc(25) Class14_Sub54 local25 = Static72.method1195(local10.aClass197_2, Static401.aClass251_167);
		local25.aClass14_Sub21_Sub2_2.method7747(Static418.method6276(arg0) + 1);
		local25.aClass14_Sub21_Sub2_2.method7690(arg0);
		local25.aClass14_Sub21_Sub2_2.method7747(arg1);
		local10.method8308(local25);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIII)V")
	public static void method3037(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(7) int local7 = Static258.anInt4846;
		@Pc(9) int[] local9 = Static43.anIntArray35;
		Static201.anInt3493 = 0;
		@Pc(196) int local196;
		@Pc(250) int local250;
		@Pc(330) int local330;
		@Pc(333) int local333;
		@Pc(1196) int local1196;
		@Pc(1244) int local1244;
		@Pc(1246) int local1246;
		@Pc(1248) int local1248;
		@Pc(1250) int local1250;
		@Pc(165) int local165;
		@Pc(428) int local428;
		@Pc(1093) int local1093;
		@Pc(543) int local543;
		for (@Pc(13) int local13 = 0; local13 < Static662.anInt10795 + local7; local13++) {
			@Pc(25) Class362 local25 = null;
			@Pc(34) Class4_Sub3_Sub3_Sub3 local34;
			if (local7 > local13) {
				local34 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local9[local13]];
			} else {
				local34 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local13 - local7])).aClass4_Sub3_Sub3_Sub3_Sub1_2;
				local25 = ((Class4_Sub3_Sub3_Sub3_Sub1) local34).aClass362_1;
				if (local25.lb != null) {
					local25 = local25.method8641(Static188.aClass238_1);
					if (local25 == null) {
						continue;
					}
				}
			}
			if (local34.anInt3268 >= 0 && (Static688.anInt11168 == local34.anInt3262 || local34.aByte146 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146)) {
				Static240.method4039(arg3 >> 1, local34, local34.method2867(), arg0 >> 1);
				if (Static172.anIntArray151[0] >= 0) {
					if (local34.method2876()) {
						@Pc(119) Class396 local119 = local34.method2874();
						if (local119 != null && Static275.anInt5128 > Static201.anInt3493) {
							Static275.anIntArray279[Static201.anInt3493] = Static497.aClass350_9.method8356(local119.method9412()) / 2;
							Static275.anIntArray281[Static201.anInt3493] = Static172.anIntArray151[0];
							Static275.anIntArray282[Static201.anInt3493] = Static172.anIntArray151[1];
							Static275.aClass396Array1[Static201.anInt3493] = local119;
							Static201.anInt3493++;
						}
					}
					local165 = arg2 + Static172.anIntArray151[1];
					@Pc(235) Class45[] local235;
					@Pc(242) Class266[] local242;
					@Pc(302) Class45 local302;
					if (local34.aBoolean238 || local34.anInt3283 <= Static530.anInt9105) {
						local165 -= Math.max(Static497.aClass350_9.anInt9697, Static505.aClass45Array29[0].method7501());
					} else {
						@Pc(190) byte local190 = 1;
						if (local7 <= local13) {
							local196 = local25.anInt10080;
							if (local196 == -1) {
								local196 = local34.method2865().anInt3550;
							}
						} else {
							@Pc(212) Class4_Sub3_Sub3_Sub3_Sub2 local212 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local9[local13]];
							local196 = local34.method2865().anInt3550;
							if (local212.aBoolean242) {
								local190 = 2;
							}
						}
						@Pc(224) Class45[] local224 = Static505.aClass45Array29;
						if (local196 != -1) {
							local235 = (Class45[]) Static423.aClass317_44.method7882((long) local196);
							if (local235 == null) {
								local242 = Static697.method6470(Static99.aClass310_23, local196);
								if (local242 != null) {
									local235 = new Class45[local242.length];
									for (local250 = 0; local250 < local242.length; local250++) {
										local235[local250] = Static103.aClass144_3.method6964(local242[local250], true);
									}
									Static423.aClass317_44.method7875((long) local196, local235);
								}
							}
							if (local235 != null && local235.length >= 2) {
								local224 = local235;
							}
						}
						if (local224.length <= local190) {
							local190 = 1;
						}
						@Pc(298) Class45 local298 = local224[0];
						local302 = local224[local190];
						local165 -= Math.max(Static497.aClass350_9.anInt9697, local298.method7501());
						local250 = Static172.anIntArray151[0] + arg1 - (local298.method7510() >> 1);
						local330 = local298.method7510() * local34.anInt3258 / 255;
						local333 = local298.method7501();
						if (local34.anInt3258 > 0 && local330 < 2) {
							local330 = 2;
						}
						local298.method7488(local250, local165);
						Static103.aClass144_3.T(local250, local165, local330 + local250, local333 + local165);
						local302.method7488(local250, local165);
						Static103.aClass144_3.KA(arg1, arg2, arg1 + arg3, arg2 + arg0);
						Static140.method2127(local250 + local298.method7508(), local250, local333 + local165, local165);
					}
					local165 -= 2;
					if (!local34.aBoolean238) {
						@Pc(410) Class45 local410;
						@Pc(420) Class45 local420;
						if (local34.anInt3271 > Static530.anInt9105) {
							local410 = Static165.aClass45Array12[local34.aBoolean237 ? 2 : 0];
							local420 = Static165.aClass45Array12[local34.aBoolean237 ? 3 : 1];
							if (local34 instanceof Class4_Sub3_Sub3_Sub3_Sub1) {
								local428 = local25.anInt10075;
								if (local428 == -1) {
									local428 = local34.method2865().anInt3558;
								}
							} else {
								local428 = local34.method2865().anInt3558;
							}
							if (local428 != -1) {
								local235 = (Class45[]) Static214.aClass317_20.method7882((long) local428);
								if (local235 == null) {
									local242 = Static697.method6470(Static99.aClass310_23, local428);
									if (local242 != null) {
										local235 = new Class45[local242.length];
										for (local250 = 0; local250 < local242.length; local250++) {
											local235[local250] = Static103.aClass144_3.method6964(local242[local250], true);
										}
										Static214.aClass317_20.method7875((long) local428, local235);
									}
								}
								if (local235 != null && local235.length == 4) {
									local410 = local235[local34.aBoolean237 ? 2 : 0];
									local420 = local235[local34.aBoolean237 ? 3 : 1];
								}
							}
							@Pc(536) int local536 = local34.anInt3271 - Static530.anInt9105;
							if (local536 <= local34.anInt3252) {
								local543 = local410.method7510();
							} else {
								local536 -= local34.anInt3252;
								local250 = local34.anInt3264 == 0 ? 0 : local34.anInt3264 * ((local34.anInt3274 - local536) / local34.anInt3264);
								local543 = local250 * local410.method7510() / local34.anInt3274;
							}
							local250 = local410.method7501();
							local165 -= local250;
							local330 = Static172.anIntArray151[0] + arg1 - (local410.method7510() >> 1);
							local410.method7488(local330, local165);
							Static103.aClass144_3.T(local330, local165, local330 + local543, local165 + local250);
							local420.method7488(local330, local165);
							Static103.aClass144_3.KA(arg1, arg2, arg3 + arg1, arg2 + arg0);
							Static140.method2127(local330 + local410.method7508(), local330, local250 + local165, local165);
							local165 -= 2;
						}
						if (local13 < local7) {
							@Pc(644) Class4_Sub3_Sub3_Sub3_Sub2 local644 = (Class4_Sub3_Sub3_Sub3_Sub2) local34;
							if (local644.anInt3339 != -1) {
								local165 -= 25;
								local420 = Static583.aClass45Array30[local644.anInt3339];
								local420.method7488(arg1 + Static172.anIntArray151[0] - 12, local165);
								Static140.method2127(arg1 + Static172.anIntArray151[0] + local420.method7508() - 12, Static172.anIntArray151[0] + -12 + arg1, local420.method7504() + local165, local165);
								local165 -= 2;
							}
							if (local644.anInt3301 != -1) {
								local165 -= 25;
								local420 = Static318.aClass45Array18[local644.anInt3301];
								local420.method7488(Static172.anIntArray151[0] + arg1 - 12, local165);
								Static140.method2127(Static172.anIntArray151[0] + arg1 + local420.method7508() - 12, Static172.anIntArray151[0] + arg1 + -12, local165 + local420.method7504(), local165);
								local165 -= 2;
							}
						} else if (local25.anInt10072 >= 0 && Static318.aClass45Array18.length > local25.anInt10072) {
							local410 = Static318.aClass45Array18[local25.anInt10072];
							local165 -= 25;
							local410.method7488(arg1 + Static172.anIntArray151[0] - (local410.method7510() >> 1), local165);
							Static140.method2127(Static172.anIntArray151[0] + arg1 - (local410.method7510() >> 1) + local410.method7508(), arg1 + Static172.anIntArray151[0] - (local410.method7510() >> 1), local410.method7504() + local165, local165);
							local165 -= 2;
						}
					}
					@Pc(815) Class136[] local815;
					@Pc(823) Class136 local823;
					if (!(local34 instanceof Class4_Sub3_Sub3_Sub3_Sub2)) {
						local196 = 0;
						local815 = Static8.aClass136Array1;
						for (local428 = 0; local428 < local815.length; local428++) {
							local823 = local815[local428];
							if (local823 != null && local823.anInt3427 == 1 && Static253.anIntArray241[local13 - local7] == local823.anInt3419) {
								local302 = Static303.aClass45Array28[local823.anInt3429];
								if (local196 < local302.method7501()) {
									local196 = local302.method7501();
								}
								@Pc(872) boolean local872;
								if (local823.anInt3428 == 0) {
									local872 = true;
								} else {
									local330 = Static258.method4324() * 1000 / local823.anInt3428 / 2;
									local872 = local330 > Static530.anInt9105 % (local330 * 2);
								}
								if (local872) {
									local302.method7488(Static172.anIntArray151[0] + arg1 - 12, local165 - local302.method7501());
									Static140.method2127(Static172.anIntArray151[0] + arg1 + local302.method7508() - 12, arg1 + (Static172.anIntArray151[0] - 12), local165 - local302.method7501() + local302.method7504(), -local302.method7501() + local165);
								}
							}
						}
						if (local196 > 0) {
						}
					} else if (local13 >= 0) {
						local196 = 0;
						local815 = Static8.aClass136Array1;
						for (local428 = 0; local428 < local815.length; local428++) {
							local823 = local815[local428];
							if (local823 != null && local823.anInt3427 == 10 && local823.anInt3419 == local9[local13]) {
								local302 = Static303.aClass45Array28[local823.anInt3429];
								if (local196 < local302.method7501()) {
									local196 = local302.method7501();
								}
								local302.method7488(Static172.anIntArray151[0] + arg1 - 12, local165 + -local302.method7501());
								Static140.method2127(Static172.anIntArray151[0] + arg1 + local302.method7508() - 12, Static172.anIntArray151[0] + arg1 + -12, local165 - local302.method7501() + local302.method7504(), -local302.method7501() + local165);
							}
						}
						if (local196 > 0) {
						}
					}
					for (local196 = 0; local196 < Static551.aClass355_1.anInt9850; local196++) {
						local1093 = local34.anIntArray194[local196];
						local428 = local34.anIntArray195[local196];
						@Pc(1100) Class240 local1100 = null;
						local543 = 0;
						if (local428 >= 0) {
							if (local1093 <= Static530.anInt9105) {
								continue;
							}
							local1100 = Static638.aClass262_2.method6399(local34.anIntArray195[local196]);
							local543 = local1100.anInt6727;
						} else if (local1093 < 0) {
							continue;
						}
						local250 = local34.lb[local196];
						@Pc(1141) Class240 local1141 = null;
						if (local250 >= 0) {
							local1141 = Static638.aClass262_2.method6399(local250);
						}
						if (Static530.anInt9105 >= local1093 - local543) {
							local333 = local34.anIntArray197[local196];
							if (local333 >= 0) {
								local34.anInt3258 = local333;
								local34.anInt3283 = Static530.anInt9105 + 300;
								local34.anIntArray197[local196] = -1;
							}
							if (local1100 == null) {
								local34.anIntArray194[local196] = -1;
							} else {
								local1196 = local34.method2867() / 2;
								Static240.method4039(arg3 >> 1, local34, local1196, arg0 >> 1);
								if (Static172.anIntArray151[0] > -1) {
									Static172.anIntArray151[0] += Static551.aClass355_1.anIntArray532[local196];
									Static172.anIntArray151[1] += Static551.aClass355_1.anIntArray531[local196];
									local1244 = 0;
									local1246 = 0;
									local1248 = 0;
									local1250 = 0;
									@Pc(1252) int local1252 = 0;
									@Pc(1254) int local1254 = 0;
									@Pc(1256) int local1256 = 0;
									@Pc(1258) int local1258 = 0;
									@Pc(1260) Class45 local1260 = null;
									@Pc(1262) Class45 local1262 = null;
									@Pc(1264) Class45 local1264 = null;
									@Pc(1266) Class45 local1266 = null;
									@Pc(1268) int local1268 = 0;
									@Pc(1270) int local1270 = 0;
									@Pc(1272) int local1272 = 0;
									@Pc(1274) int local1274 = 0;
									@Pc(1276) int local1276 = 0;
									@Pc(1278) int local1278 = 0;
									@Pc(1280) int local1280 = 0;
									@Pc(1282) int local1282 = 0;
									@Pc(1287) Class45 local1287 = local1100.method5881(Static103.aClass144_3);
									@Pc(1289) int local1289 = 0;
									@Pc(1297) int local1297;
									if (local1287 != null) {
										local1244 = local1287.method7510();
										local1297 = local1287.method7501();
										if (local1297 > 0) {
											local1289 = local1297;
										}
										local1287.method7509(anIntArray211);
										local1252 = anIntArray211[0];
									}
									@Pc(1318) Class45 local1318 = local1100.method5884(Static103.aClass144_3);
									if (local1318 != null) {
										local1246 = local1318.method7510();
										local1297 = local1318.method7501();
										if (local1297 > local1289) {
											local1289 = local1297;
										}
										local1318.method7509(anIntArray211);
										local1254 = anIntArray211[0];
									}
									@Pc(1343) Class45 local1343 = local1100.method5878(Static103.aClass144_3);
									if (local1343 != null) {
										local1248 = local1343.method7510();
										local1297 = local1343.method7501();
										if (local1297 > local1289) {
											local1289 = local1297;
										}
										local1343.method7509(anIntArray211);
										local1256 = anIntArray211[0];
									}
									@Pc(1368) Class45 local1368 = local1100.method5880(Static103.aClass144_3);
									if (local1368 != null) {
										local1250 = local1368.method7510();
										local1297 = local1368.method7501();
										if (local1297 > local1289) {
											local1289 = local1297;
										}
										local1368.method7509(anIntArray211);
										local1258 = anIntArray211[0];
									}
									if (local1141 != null) {
										local1260 = local1141.method5881(Static103.aClass144_3);
										if (local1260 != null) {
											local1268 = local1260.method7510();
											local1297 = local1260.method7501();
											local1260.method7509(anIntArray211);
											if (local1289 < local1297) {
												local1289 = local1297;
											}
											local1276 = anIntArray211[0];
										}
										local1262 = local1141.method5884(Static103.aClass144_3);
										if (local1262 != null) {
											local1270 = local1262.method7510();
											local1297 = local1262.method7501();
											if (local1289 < local1297) {
												local1289 = local1297;
											}
											local1262.method7509(anIntArray211);
											local1278 = anIntArray211[0];
										}
										local1264 = local1141.method5878(Static103.aClass144_3);
										if (local1264 != null) {
											local1272 = local1264.method7510();
											local1297 = local1264.method7501();
											local1264.method7509(anIntArray211);
											if (local1297 > local1289) {
												local1289 = local1297;
											}
											local1280 = anIntArray211[0];
										}
										local1266 = local1141.method5880(Static103.aClass144_3);
										if (local1266 != null) {
											local1274 = local1266.method7510();
											local1297 = local1266.method7501();
											local1266.method7509(anIntArray211);
											if (local1289 < local1297) {
												local1289 = local1297;
											}
											local1282 = anIntArray211[0];
										}
									}
									@Pc(1500) Class68 local1500 = Static474.aClass68_9;
									@Pc(1502) Class68 local1502 = Static474.aClass68_9;
									@Pc(1504) Class350 local1504 = Static343.aClass350_4;
									@Pc(1506) Class350 local1506 = Static343.aClass350_4;
									local1297 = local1100.anInt6742;
									@Pc(1518) Class68 local1518;
									@Pc(1523) Class350 local1523;
									if (local1297 >= 0) {
										local1518 = Static105.method8322(true, true, local1297, Static103.aClass144_3);
										local1523 = Static607.method8543(Static103.aClass144_3, local1297);
										if (local1518 != null && local1523 != null) {
											local1504 = local1523;
											local1500 = local1518;
										}
									}
									if (local1141 != null) {
										local1297 = local1141.anInt6742;
										if (local1297 >= 0) {
											local1518 = Static105.method8322(true, true, local1297, Static103.aClass144_3);
											local1523 = Static607.method8543(Static103.aClass144_3, local1297);
											if (local1518 != null && local1523 != null) {
												local1506 = local1523;
												local1502 = local1518;
											}
										}
									}
									@Pc(1566) String local1566 = null;
									@Pc(1576) String local1576 = local1100.method5883(local34.anIntArray196[local196]);
									@Pc(1578) int local1578 = 0;
									@Pc(1583) int local1583 = local1504.method8356(local1576);
									if (local1141 != null) {
										local1566 = local1141.method5883(local34.anIntArray193[local196]);
										local1578 = local1506.method8356(local1566);
									}
									@Pc(1600) int local1600 = 0;
									if (local1246 > 0) {
										local1600 = local1583 / local1246 + 1;
									}
									@Pc(1613) int local1613 = 0;
									if (local1141 != null && local1270 > 0) {
										local1613 = local1578 / local1270 + 1;
									}
									@Pc(1627) int local1627 = 0;
									if (local1244 > 0) {
										local1627 = local1244;
									}
									local1627 += 2;
									@Pc(1641) int local1641 = local1627;
									if (local1248 > 0) {
										local1627 += local1248;
									}
									@Pc(1649) int local1649 = local1627;
									@Pc(1651) int local1651 = local1627;
									@Pc(1660) int local1660;
									if (local1246 > 0) {
										local1660 = local1600 * local1246;
										local1627 += local1660;
										local1651 += (local1660 - local1583) / 2;
									} else {
										local1627 += local1583;
									}
									local1660 = local1627;
									if (local1250 > 0) {
										local1627 += local1250;
									}
									@Pc(1689) int local1689 = 0;
									@Pc(1691) int local1691 = 0;
									@Pc(1693) int local1693 = 0;
									@Pc(1695) int local1695 = 0;
									@Pc(1697) int local1697 = 0;
									@Pc(1739) int local1739;
									if (local1141 != null) {
										local1627 += 2;
										local1689 = local1627;
										if (local1268 > 0) {
											local1627 += local1268;
										}
										local1627 += 2;
										local1691 = local1627;
										if (local1272 > 0) {
											local1627 += local1272;
										}
										local1693 = local1627;
										local1697 = local1627;
										if (local1270 <= 0) {
											local1627 += local1578;
										} else {
											local1739 = local1613 * local1270;
											local1697 = local1627 + (local1739 - local1578) / 2;
											local1627 += local1739;
										}
										local1695 = local1627;
										if (local1274 > 0) {
											local1627 += local1274;
										}
									}
									local1739 = local34.anIntArray194[local196] - Static530.anInt9105;
									@Pc(1780) int local1780 = local1100.anInt6734 - local1100.anInt6734 * local1739 / local1100.anInt6727;
									@Pc(1793) int local1793 = local1739 * local1100.anInt6741 / local1100.anInt6727 - local1100.anInt6741;
									@Pc(1806) int local1806 = local1780 + Static172.anIntArray151[0] + arg1 - (local1627 >> 1);
									@Pc(1816) int local1816 = local1793 + arg2 + Static172.anIntArray151[1] - 12;
									@Pc(1818) int local1818 = local1816;
									@Pc(1822) int local1822 = local1289 + local1816;
									@Pc(1829) int local1829 = local1100.anInt6729 + local1816 + 15;
									@Pc(1835) int local1835 = local1829 - local1504.anInt9697;
									if (local1816 > local1835) {
										local1818 = local1835;
									}
									@Pc(1845) int local1845 = local1504.anInt9699 + local1829;
									if (local1845 > local1822) {
										local1822 = local1845;
									}
									@Pc(1856) int local1856 = 0;
									@Pc(1871) int local1871;
									@Pc(1886) int local1886;
									if (local1141 != null) {
										local1856 = local1141.anInt6729 + local1816 + 15;
										local1871 = local1856 - local1506.anInt9697;
										if (local1871 < local1818) {
											local1818 = local1871;
										}
										local1886 = local1856 + local1506.anInt9699;
										if (local1822 < local1886) {
											local1822 = local1886;
										}
									}
									local1871 = 255;
									if (local1100.anInt6740 >= 0) {
										local1871 = (local1739 << 8) / (local1100.anInt6727 - local1100.anInt6740);
									}
									if (local1871 >= 0 && local1871 < 255) {
										local1886 = local1871 << 24;
										@Pc(2099) int local2099 = local1886 | 0xFFFFFF;
										if (local1287 != null) {
											local1287.method7491(local1806 - local1252, local1816, 0, local2099, 1);
										}
										if (local1343 != null) {
											local1343.method7491(local1806 + local1641 - local1256, local1816, 0, local2099, 1);
										}
										@Pc(2135) int local2135;
										if (local1318 != null) {
											for (local2135 = 0; local2135 < local1600; local2135++) {
												local1318.method7491(local1246 * local2135 + local1806 + local1649 - local1254, local1816, 0, local2099, 1);
											}
										}
										if (local1368 != null) {
											local1368.method7491(local1660 + local1806 - local1258, local1816, 0, local2099, 1);
										}
										local1500.method9422(local1576, local1829, 0, local1651 + local1806, local1100.anInt6731 | local1886);
										if (local1141 != null) {
											if (local1260 != null) {
												local1260.method7491(local1806 + local1689 - local1276, local1816, 0, local2099, 1);
											}
											if (local1264 != null) {
												local1264.method7491(local1806 + local1691 - local1280, local1816, 0, local2099, 1);
											}
											if (local1262 != null) {
												for (local2135 = 0; local2135 < local1613; local2135++) {
													local1262.method7491(local2135 * local1270 + local1693 + local1806 - local1278, local1816, 0, local2099, 1);
												}
											}
											if (local1266 != null) {
												local1266.method7491(local1806 + local1695 - local1282, local1816, 0, local2099, 1);
											}
											local1502.method9422(local1566, local1856, 0, local1806 + local1697, local1886 | local1141.anInt6731);
										}
									} else {
										if (local1287 != null) {
											local1287.method7488(local1806 - local1252, local1816);
										}
										if (local1343 != null) {
											local1343.method7488(local1641 + local1806 - local1256, local1816);
										}
										if (local1318 != null) {
											for (local1886 = 0; local1886 < local1600; local1886++) {
												local1318.method7488(local1649 + local1806 + local1886 * local1246 - local1254, local1816);
											}
										}
										if (local1368 != null) {
											local1368.method7488(local1660 + local1806 - local1258, local1816);
										}
										local1500.method9422(local1576, local1829, 0, local1806 + local1651, local1100.anInt6731 | 0xFF000000);
										if (local1141 != null) {
											if (local1260 != null) {
												local1260.method7488(local1806 + local1689 - local1276, local1816);
											}
											if (local1264 != null) {
												local1264.method7488(local1806 + local1691 - local1280, local1816);
											}
											if (local1262 != null) {
												for (local1886 = 0; local1886 < local1613; local1886++) {
													local1262.method7488(local1886 * local1270 + local1693 + local1806 - local1278, local1816);
												}
											}
											if (local1266 != null) {
												local1266.method7488(local1806 + local1695 - local1282, local1816);
											}
											local1502.method9422(local1566, local1856, 0, local1806 + local1697, local1141.anInt6731 | 0xFF000000);
										}
									}
									Static140.method2127(local1627 + local1806, local1806, local1822 + 1, local1818);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2324) int local2324;
		for (@Pc(2318) int local2318 = 0; local2318 < Static107.anInt1847; local2318++) {
			local2324 = Static250.anIntArray239[local2318];
			@Pc(2339) Class4_Sub3_Sub3_Sub3 local2339;
			if (local2324 >= 2048) {
				local2339 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) (local2324 - 2048))).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			} else {
				local2339 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local2324];
			}
			local196 = Static401.anIntArray356[local2318];
			@Pc(2358) Class4_Sub3_Sub3_Sub3 local2358;
			if (local196 < 2048) {
				local2358 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local196];
			} else {
				local2358 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) (local196 - 2048))).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			}
			Static157.method2255(local2358, local2339, arg0, arg1, --local2339.anInt3270, arg3, arg2);
		}
		local2324 = Static497.aClass350_9.anInt9697 + Static497.aClass350_9.anInt9699 + 2;
		for (local165 = 0; local165 < Static201.anInt3493; local165++) {
			local196 = Static275.anIntArray281[local165];
			local1093 = Static275.anIntArray282[local165];
			local428 = Static275.anIntArray279[local165];
			@Pc(2420) boolean local2420 = true;
			while (local2420) {
				local2420 = false;
				for (local543 = 0; local543 < local165; local543++) {
					if (Static275.anIntArray282[local543] - local2324 < local1093 + 2 && local1093 - local2324 < Static275.anIntArray282[local543] + 2 && Static275.anIntArray281[local543] + Static275.anIntArray279[local543] > local196 - local428 && local428 + local196 > -Static275.anIntArray279[local543] + Static275.anIntArray281[local543] && local1093 > Static275.anIntArray282[local543] - local2324) {
						local1093 = Static275.anIntArray282[local543] - local2324;
						local2420 = true;
					}
				}
			}
			Static275.anIntArray282[local165] = local1093;
			@Pc(2529) String local2529 = Static275.aClass396Array1[local165].method9412();
			local250 = Static497.aClass350_9.method8356(local2529);
			local330 = arg1 + local196;
			local333 = arg2 + local1093 - Static497.aClass350_9.anInt9697;
			local1196 = local250 + local330;
			@Pc(2560) int local2560 = Static497.aClass350_9.anInt9699 + arg2 + local1093;
			if (Static44.anInt756 == 0) {
				@Pc(2596) int local2596 = 16776960;
				@Pc(2602) int local2602 = Static275.aClass396Array1[local165].method9413();
				if (local2602 < 6) {
					local2596 = Static136.anIntArray137[local2602];
				}
				if (local2602 == 6) {
					local2596 = Static688.anInt11168 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local2602 == 7) {
					local2596 = Static688.anInt11168 % 20 < 10 ? 255 : 65535;
				}
				if (local2602 == 8) {
					local2596 = Static688.anInt11168 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2685) int local2685;
				if (local2602 == 9) {
					local2685 = 150 - Static275.aClass396Array1[local165].method9415() * 150 / Static275.aClass396Array1[local165].method9417();
					if (local2685 < 50) {
						local2596 = local2685 * 1280 + 16711680;
					} else if (local2685 < 100) {
						local2596 = 33160960 - local2685 * 327680;
					} else if (local2685 < 150) {
						local2596 = (local2685 - 100) * 5 + 65280;
					}
				}
				if (local2602 == 10) {
					local2685 = 150 - Static275.aClass396Array1[local165].method9415() * 150 / Static275.aClass396Array1[local165].method9417();
					if (local2685 < 50) {
						local2596 = local2685 * 5 + 16711680;
					} else if (local2685 < 100) {
						local2596 = 16711935 - (local2685 - 50) * 327680;
					} else if (local2685 < 150) {
						local2596 = local2685 * 327680 + 255 - (local2685 - 100) * 5 - 32768000;
					}
				}
				if (local2602 == 11) {
					local2685 = 150 - Static275.aClass396Array1[local165].method9415() * 150 / Static275.aClass396Array1[local165].method9417();
					if (local2685 < 50) {
						local2596 = 16777215 - local2685 * 327685;
					} else if (local2685 < 100) {
						local2596 = (local2685 - 50) * 327685 + 65280;
					} else if (local2685 < 150) {
						local2596 = 16777215 - (local2685 - 100) * 327680;
					}
				}
				local2685 = local2596 | 0xFF000000;
				local1244 = Static275.aClass396Array1[local165].method9414();
				if (local1244 == 0) {
					local1196 -= local250 >> 1;
					Static255.aClass68_4.method9441(-16777216, local2685, local2529, local1093 + arg2, local196 + arg1);
					local330 -= local250 >> 1;
				}
				if (local1244 == 1) {
					local330 -= local250 >> 1;
					local1196 -= local250 >> 1;
					local333 -= 5;
					local2560 += 5;
					Static255.aClass68_4.method9425(Static688.anInt11168, local1093 + arg2, local196 + arg1, local2529, local2685);
				}
				if (local1244 == 2) {
					local1196 -= (local250 >> 1) - 5;
					Static255.aClass68_4.method9438(local2685, Static688.anInt11168, arg1 + local196, local1093 + arg2, local2529);
					local2560 += 5;
					local333 -= 5;
					local330 -= (local250 >> 1) + 5;
				}
				if (local1244 == 3) {
					local1246 = 150 - Static275.aClass396Array1[local165].method9415() * 150 / Static275.aClass396Array1[local165].method9417();
					local1196 -= local250 >> 1;
					local2560 += 7;
					local330 -= local250 >> 1;
					local333 -= 7;
					Static255.aClass68_4.method9430(local2529, local2685, arg1 + local196, local1246, arg2 + local1093, Static688.anInt11168);
				}
				if (local1244 == 4) {
					local1246 = 150 - Static275.aClass396Array1[local165].method9415() * 150 / Static275.aClass396Array1[local165].method9417();
					local1248 = local1246 * (Static497.aClass350_9.method8356(local2529) + 100) / 150;
					Static103.aClass144_3.T(arg1 + local196 - 50, arg2, local196 + arg1 + 50, arg2 + arg0);
					Static255.aClass68_4.method9422(local2529, arg2 + local1093, -16777216, local196 + arg1 + 50 - local1248, local2685);
					local330 += 50 - local1248;
					local1196 += 50 - local1248;
					Static103.aClass144_3.KA(arg1, arg2, arg3 + arg1, arg2 - -arg0);
				}
				if (local1244 == 5) {
					local1246 = 150 - Static275.aClass396Array1[local165].method9415() * 150 / Static275.aClass396Array1[local165].method9417();
					local1248 = 0;
					if (local1246 < 25) {
						local1248 = local1246 - 25;
					} else if (local1246 > 125) {
						local1248 = local1246 - 125;
					}
					local1250 = Static497.aClass350_9.anInt9699 + Static497.aClass350_9.anInt9697;
					Static103.aClass144_3.T(arg1, arg2 + local1093 - local1250 - 1, arg1 - -arg3, local1093 + arg2 + 5);
					Static255.aClass68_4.method9441(-16777216, local2685, local2529, local1248 + arg2 + local1093, arg1 + local196);
					local333 += local1248;
					local330 -= local250 >> 1;
					local1196 -= local250 >> 1;
					local2560 += local1248;
					Static103.aClass144_3.KA(arg1, arg2, arg3 + arg1, arg2 + arg0);
				}
			} else {
				local1196 -= local250 >> 1;
				local330 -= local250 >> 1;
				Static255.aClass68_4.method9441(-16777216, -256, local2529, arg2 + local1093, arg1 - -local196);
			}
			Static140.method2127(local1196 + 1, local330, local2560 + 1, local333);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZII)I")
	public static int method3038(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
