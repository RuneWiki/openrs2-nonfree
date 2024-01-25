import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static638 {

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Ljava/io/FileOutputStream;")
	public static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!wl", name = "o", descriptor = "Lclient!uu;")
	public static Class343 aClass343_270;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "[I")
	public static final int[] anIntArray661 = new int[3];

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIII)V")
	public static void method8581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static174.anInt3362;
		@Pc(9) int[] local9 = Static495.anIntArray529;
		Static142.anInt9297 = 0;
		@Pc(169) int local169;
		@Pc(202) int local202;
		@Pc(249) int local249;
		@Pc(331) int local331;
		@Pc(334) int local334;
		@Pc(1134) int local1134;
		@Pc(1180) int local1180;
		@Pc(1182) int local1182;
		@Pc(434) int local434;
		@Pc(1042) int local1042;
		@Pc(568) int local568;
		for (@Pc(13) int local13 = 0; local13 < Static596.anInt9702 + local7; local13++) {
			@Pc(17) Class309 local17 = null;
			@Pc(33) Class9_Sub2_Sub1_Sub2 local33;
			if (local13 >= local7) {
				local33 = ((Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local13 - local7])).aClass9_Sub2_Sub1_Sub2_Sub2_2;
				local17 = ((Class9_Sub2_Sub1_Sub2_Sub2) local33).aClass309_1;
				if (local17.anIntArray553 != null) {
					local17 = local17.method7594(Static183.aClass285_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local9[local13]];
			}
			if (local33.anInt10208 >= 0 && (Static609.anInt9804 == local33.anInt10209 || local33.aByte127 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127)) {
				Static354.method5705(local33.method8634(), arg3 >> 1, local33, arg1 >> 1);
				if (Static272.anIntArray292[0] >= 0) {
					if (local33.aString107 != null && (local7 <= local13 || Static589.anInt9635 == 0 || Static589.anInt9635 == 3 || Static589.anInt9635 == 1 && Static328.method5384(((Class9_Sub2_Sub1_Sub2_Sub1) local33).aString5)) && Static142.anInt9297 < Static348.anInt6496) {
						Static348.anIntArray380[Static142.anInt9297] = Static426.aClass93_11.method2315(local33.aString107) / 2;
						Static348.anIntArray377[Static142.anInt9297] = Static272.anIntArray292[0];
						Static348.anIntArray376[Static142.anInt9297] = Static272.anIntArray292[1];
						Static348.anIntArray379[Static142.anInt9297] = local33.anInt10170;
						Static348.anIntArray381[Static142.anInt9297] = local33.anInt10174;
						Static348.anIntArray378[Static142.anInt9297] = local33.anInt10187;
						Static348.aStringArray47[Static142.anInt9297] = local33.aString107;
						Static142.anInt9297++;
					}
					local169 = Static272.anIntArray292[1] + arg0;
					@Pc(234) Class103[] local234;
					@Pc(241) Class251[] local241;
					@Pc(303) Class103 local303;
					if (local33.aBoolean772 || local33.anInt10194 <= Static304.anInt8391) {
						local169 -= Math.max(Static426.aClass93_11.anInt2765, Static497.aClass103Array9[0].method7440());
					} else {
						@Pc(184) byte local184 = 1;
						if (local7 > local13) {
							@Pc(197) Class9_Sub2_Sub1_Sub2_Sub1 local197 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local9[local13]];
							local202 = local33.method8633().anInt5230;
							if (local197.aBoolean80) {
								local184 = 2;
							}
						} else {
							local202 = local17.anInt8860;
							if (local202 == -1) {
								local202 = local33.method8633().anInt5230;
							}
						}
						@Pc(223) Class103[] local223 = Static497.aClass103Array9;
						if (local202 != -1) {
							local234 = (Class103[]) Static269.aClass136_34.method3134((long) local202);
							if (local234 == null) {
								local241 = Static656.method6338(Static419.aClass343_200, local202);
								if (local241 != null) {
									local234 = new Class103[local241.length];
									for (local249 = 0; local249 < local241.length; local249++) {
										local234[local249] = Static266.aClass82_8.method6106(local241[local249], true);
									}
									Static269.aClass136_34.method3135(local234, (long) local202);
								}
							}
							if (local234 != null && local234.length >= 2) {
								local223 = local234;
							}
						}
						if (local223.length <= local184) {
							local184 = 1;
						}
						@Pc(299) Class103 local299 = local223[0];
						local303 = local223[local184];
						local169 -= Math.max(Static426.aClass93_11.anInt2765, local299.method7440());
						local249 = Static272.anIntArray292[0] + arg2 - (local299.method7445() >> 1);
						local331 = local299.method7445() * local33.anInt10228 / 255;
						local334 = local299.method7440();
						if (local33.anInt10228 > 0 && local331 < 2) {
							local331 = 2;
						}
						local299.method7462(local249, local169);
						Static266.aClass82_8.T(local249, local169, local331 + local249, local169 - -local334);
						local303.method7462(local249, local169);
						Static266.aClass82_8.KA(arg2, arg0, arg2 + arg3, arg0 + arg1);
						Static304.method7235(local249 + local299.method7454(), local169 + local334, local249, local169);
					}
					local169 -= 2;
					if (!local33.aBoolean772) {
						@Pc(415) Class103 local415;
						@Pc(424) Class103 local424;
						if (local33.anInt10169 > Static304.anInt8391) {
							local415 = Static453.aClass103Array19[local33.aBoolean774 ? 2 : 0];
							local424 = Static453.aClass103Array19[local33.aBoolean774 ? 3 : 1];
							if (local33 instanceof Class9_Sub2_Sub1_Sub2_Sub2) {
								local434 = local17.anInt8857;
								if (local434 == -1) {
									local434 = local33.method8633().anInt5224;
								}
							} else {
								local434 = local33.method8633().anInt5224;
							}
							if (local434 != -1) {
								local234 = (Class103[]) Static590.aClass136_66.method3134((long) local434);
								if (local234 == null) {
									local241 = Static656.method6338(Static419.aClass343_200, local434);
									if (local241 != null) {
										local234 = new Class103[local241.length];
										for (local249 = 0; local249 < local241.length; local249++) {
											local234[local249] = Static266.aClass82_8.method6106(local241[local249], true);
										}
										Static590.aClass136_66.method3135(local234, (long) local434);
									}
								}
								if (local234 != null && local234.length == 4) {
									local415 = local234[local33.aBoolean774 ? 2 : 0];
									local424 = local234[local33.aBoolean774 ? 3 : 1];
								}
							}
							@Pc(531) int local531 = local33.anInt10169 - Static304.anInt8391;
							if (local531 > local33.anInt10212) {
								local531 -= local33.anInt10212;
								local249 = local33.anInt10213 == 0 ? 0 : (local33.anInt10201 - local531) / local33.anInt10213 * local33.anInt10213;
								local568 = local415.method7445() * local249 / local33.anInt10201;
							} else {
								local568 = local415.method7445();
							}
							local249 = local415.method7440();
							local169 -= local249;
							local331 = arg2 + Static272.anIntArray292[0] - (local415.method7445() >> 1);
							local415.method7462(local331, local169);
							Static266.aClass82_8.T(local331, local169, local331 + local568, local169 - -local249);
							local424.method7462(local331, local169);
							Static266.aClass82_8.KA(arg2, arg0, arg2 + arg3, arg0 - -arg1);
							Static304.method7235(local415.method7454() + local331, local169 + local249, local331, local169);
							local169 -= 2;
						}
						if (local7 > local13) {
							@Pc(714) Class9_Sub2_Sub1_Sub2_Sub1 local714 = (Class9_Sub2_Sub1_Sub2_Sub1) local33;
							if (local714.anInt1325 != -1) {
								local169 -= 25;
								local424 = Static266.aClass103Array8[local714.anInt1325];
								local424.method7462(arg2 + Static272.anIntArray292[0] - 12, local169);
								Static304.method7235(arg2 + Static272.anIntArray292[0] + local424.method7454() - 12, local424.method7451() + local169, arg2 + Static272.anIntArray292[0] - 12, local169);
								local169 -= 2;
							}
							if (local714.anInt1314 != -1) {
								local169 -= 25;
								local424 = Static457.aClass103Array20[local714.anInt1314];
								local424.method7462(Static272.anIntArray292[0] + arg2 - 12, local169);
								Static304.method7235(arg2 + Static272.anIntArray292[0] + local424.method7454() - 12, local169 - -local424.method7451(), arg2 + Static272.anIntArray292[0] - 12, local169);
								local169 -= 2;
							}
						} else if (local17.anInt8840 >= 0 && Static457.aClass103Array20.length > local17.anInt8840) {
							local415 = Static457.aClass103Array20[local17.anInt8840];
							local169 -= 25;
							local415.method7462(arg2 + Static272.anIntArray292[0] - (local415.method7445() >> 1), local169);
							Static304.method7235(arg2 + Static272.anIntArray292[0] - (local415.method7445() >> 1) + local415.method7454(), local169 + local415.method7451(), Static272.anIntArray292[0] + arg2 - (local415.method7445() >> 1), local169);
							local169 -= 2;
						}
					}
					@Pc(816) Class118[] local816;
					@Pc(824) Class118 local824;
					if (!(local33 instanceof Class9_Sub2_Sub1_Sub2_Sub1)) {
						local202 = 0;
						local816 = Static16.aClass118Array1;
						for (local434 = 0; local434 < local816.length; local434++) {
							local824 = local816[local434];
							if (local824 != null && local824.anInt3289 == 1 && Static43.anIntArray50[local13 - local7] == local824.anInt3290) {
								local303 = Static205.aClass103Array22[local824.anInt3285];
								if (local202 < local303.method7440()) {
									local202 = local303.method7440();
								}
								if (Static304.anInt8391 % 20 < 10) {
									local303.method7462(arg2 + Static272.anIntArray292[0] - 12, -local303.method7440() + local169);
									Static304.method7235(Static272.anIntArray292[0] + arg2 + local303.method7454() - 12, -local303.method7440() + local169 + local303.method7451(), arg2 + Static272.anIntArray292[0] - 12, local169 - local303.method7440());
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local816 = Static16.aClass118Array1;
						for (local434 = 0; local434 < local816.length; local434++) {
							local824 = local816[local434];
							if (local824 != null && local824.anInt3289 == 10 && local9[local13] == local824.anInt3290) {
								local303 = Static205.aClass103Array22[local824.anInt3285];
								if (local202 < local303.method7440()) {
									local202 = local303.method7440();
								}
								local303.method7462(arg2 + Static272.anIntArray292[0] - 12, local169 + -local303.method7440());
								Static304.method7235(arg2 + Static272.anIntArray292[0] + local303.method7454() - 12, local169 + (-local303.method7440() - -local303.method7451()), Static272.anIntArray292[0] + arg2 - 12, -local303.method7440() + local169);
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < Static483.anInt8233; local202++) {
						local1042 = local33.anIntArray673[local202];
						local434 = local33.anIntArray668[local202];
						@Pc(1049) Class372 local1049 = null;
						local568 = 0;
						if (local434 >= 0) {
							if (local1042 <= Static304.anInt8391) {
								continue;
							}
							local1049 = Static409.aClass361_1.method8367(local33.anIntArray668[local202]);
							local568 = local1049.anInt10030;
						} else if (local1042 < 0) {
							continue;
						}
						local249 = local33.anIntArray672[local202];
						@Pc(1082) Class372 local1082 = null;
						if (local249 >= 0) {
							local1082 = Static409.aClass361_1.method8367(local249);
						}
						if (Static304.anInt8391 >= local1042 - local568) {
							local334 = local33.anIntArray674[local202];
							if (local334 >= 0) {
								local33.anInt10194 = Static304.anInt8391 + 300;
								local33.anInt10228 = local334;
								local33.anIntArray674[local202] = -1;
							}
							if (local1049 == null) {
								local33.anIntArray673[local202] = -1;
							} else {
								local1134 = local33.method8634() / 2;
								Static354.method5705(local1134, arg3 >> 1, local33, arg1 >> 1);
								if (Static272.anIntArray292[0] > -1) {
									Static272.anIntArray292[0] += Static311.anIntArray331[local202];
									Static272.anIntArray292[1] += Static510.anIntArray540[local202];
									local1180 = 0;
									local1182 = 0;
									@Pc(1184) int local1184 = 0;
									@Pc(1186) int local1186 = 0;
									@Pc(1188) int local1188 = 0;
									@Pc(1190) int local1190 = 0;
									@Pc(1192) int local1192 = 0;
									@Pc(1194) int local1194 = 0;
									@Pc(1196) Class103 local1196 = null;
									@Pc(1198) Class103 local1198 = null;
									@Pc(1200) Class103 local1200 = null;
									@Pc(1202) Class103 local1202 = null;
									@Pc(1204) int local1204 = 0;
									@Pc(1206) int local1206 = 0;
									@Pc(1208) int local1208 = 0;
									@Pc(1210) int local1210 = 0;
									@Pc(1212) int local1212 = 0;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) int local1218 = 0;
									@Pc(1223) Class103 local1223 = local1049.method8512(Static266.aClass82_8);
									@Pc(1225) int local1225 = 0;
									@Pc(1233) int local1233;
									if (local1223 != null) {
										local1180 = local1223.method7445();
										local1233 = local1223.method7440();
										if (local1233 > 0) {
											local1225 = local1233;
										}
										local1223.method7459(Static37.anIntArray45);
										local1188 = Static37.anIntArray45[0];
									}
									@Pc(1250) Class103 local1250 = local1049.method8517(Static266.aClass82_8);
									if (local1250 != null) {
										local1182 = local1250.method7445();
										local1233 = local1250.method7440();
										if (local1225 < local1233) {
											local1225 = local1233;
										}
										local1250.method7459(Static37.anIntArray45);
										local1190 = Static37.anIntArray45[0];
									}
									@Pc(1277) Class103 local1277 = local1049.method8518(Static266.aClass82_8);
									if (local1277 != null) {
										local1184 = local1277.method7445();
										local1233 = local1277.method7440();
										local1277.method7459(Static37.anIntArray45);
										if (local1225 < local1233) {
											local1225 = local1233;
										}
										local1192 = Static37.anIntArray45[0];
									}
									@Pc(1304) Class103 local1304 = local1049.method8510(Static266.aClass82_8);
									if (local1304 != null) {
										local1186 = local1304.method7445();
										local1233 = local1304.method7440();
										if (local1225 < local1233) {
											local1225 = local1233;
										}
										local1304.method7459(Static37.anIntArray45);
										local1194 = Static37.anIntArray45[0];
									}
									if (local1082 != null) {
										local1196 = local1082.method8512(Static266.aClass82_8);
										if (local1196 != null) {
											local1204 = local1196.method7445();
											local1233 = local1196.method7440();
											local1196.method7459(Static37.anIntArray45);
											if (local1233 > local1225) {
												local1225 = local1233;
											}
											local1212 = Static37.anIntArray45[0];
										}
										local1198 = local1082.method8517(Static266.aClass82_8);
										if (local1198 != null) {
											local1206 = local1198.method7445();
											local1233 = local1198.method7440();
											if (local1225 < local1233) {
												local1225 = local1233;
											}
											local1198.method7459(Static37.anIntArray45);
											local1214 = Static37.anIntArray45[0];
										}
										local1200 = local1082.method8518(Static266.aClass82_8);
										if (local1200 != null) {
											local1208 = local1200.method7445();
											local1233 = local1200.method7440();
											if (local1225 < local1233) {
												local1225 = local1233;
											}
											local1200.method7459(Static37.anIntArray45);
											local1216 = Static37.anIntArray45[0];
										}
										local1202 = local1082.method8510(Static266.aClass82_8);
										if (local1202 != null) {
											local1210 = local1202.method7445();
											local1233 = local1202.method7440();
											if (local1233 > local1225) {
												local1225 = local1233;
											}
											local1202.method7459(Static37.anIntArray45);
											local1218 = Static37.anIntArray45[0];
										}
									}
									@Pc(1442) Class63 local1442 = Static227.aClass63_5;
									@Pc(1444) Class63 local1444 = Static227.aClass63_5;
									@Pc(1446) Class93 local1446 = Static323.aClass93_7;
									@Pc(1448) Class93 local1448 = Static323.aClass93_7;
									local1233 = local1049.anInt10038;
									@Pc(1459) Class63 local1459;
									@Pc(1464) Class93 local1464;
									if (local1233 >= 0) {
										local1459 = Static198.method6115(local1233, Static266.aClass82_8, true);
										local1464 = Static54.method983(Static266.aClass82_8, local1233);
										if (local1459 != null && local1464 != null) {
											local1446 = local1464;
											local1442 = local1459;
										}
									}
									if (local1082 != null) {
										local1233 = local1082.anInt10038;
										if (local1233 >= 0) {
											local1459 = Static198.method6115(local1233, Static266.aClass82_8, true);
											local1464 = Static54.method983(Static266.aClass82_8, local1233);
											if (local1459 != null && local1464 != null) {
												local1448 = local1464;
												local1444 = local1459;
											}
										}
									}
									@Pc(1502) String local1502 = null;
									@Pc(1506) int local1506 = 0;
									@Pc(1514) String local1514 = local1049.method8511(local33.anIntArray669[local202]);
									@Pc(1519) int local1519 = local1446.method2315(local1514);
									if (local1082 != null) {
										local1502 = local1082.method8511(local33.anIntArray671[local202]);
										local1506 = local1448.method2315(local1502);
									}
									@Pc(1538) int local1538 = 0;
									@Pc(1540) int local1540 = 0;
									if (local1182 > 0) {
										local1538 = local1519 / local1182 + 1;
									}
									if (local1082 != null && local1206 > 0) {
										local1540 = local1506 / local1206 + 1;
									}
									@Pc(1563) int local1563 = 0;
									if (local1180 > 0) {
										local1563 = local1180;
									}
									local1563 += 2;
									@Pc(1574) int local1574 = local1563;
									if (local1184 > 0) {
										local1563 += local1184;
									}
									@Pc(1585) int local1585 = local1563;
									@Pc(1587) int local1587 = local1563;
									@Pc(1602) int local1602;
									if (local1182 <= 0) {
										local1563 += local1519;
									} else {
										local1602 = local1182 * local1538;
										local1563 += local1602;
										local1587 += (local1602 - local1519) / 2;
									}
									local1602 = local1563;
									if (local1186 > 0) {
										local1563 += local1186;
									}
									@Pc(1628) int local1628 = 0;
									@Pc(1630) int local1630 = 0;
									@Pc(1632) int local1632 = 0;
									@Pc(1634) int local1634 = 0;
									@Pc(1636) int local1636 = 0;
									@Pc(1675) int local1675;
									if (local1082 != null) {
										local1563 += 2;
										local1628 = local1563;
										if (local1204 > 0) {
											local1563 += local1204;
										}
										local1563 += 2;
										local1630 = local1563;
										if (local1208 > 0) {
											local1563 += local1208;
										}
										local1636 = local1563;
										local1632 = local1563;
										if (local1206 > 0) {
											local1675 = local1206 * local1540;
											local1563 += local1675;
											local1636 += (local1675 - local1506) / 2;
										} else {
											local1563 += local1506;
										}
										local1634 = local1563;
										if (local1210 > 0) {
											local1563 += local1210;
										}
									}
									local1675 = local33.anIntArray673[local202] - Static304.anInt8391;
									@Pc(1724) int local1724 = local1049.anInt10025 - local1675 * local1049.anInt10025 / local1049.anInt10030;
									@Pc(1736) int local1736 = local1675 * local1049.anInt10031 / local1049.anInt10030 - local1049.anInt10031;
									@Pc(1749) int local1749 = local1724 + arg2 + Static272.anIntArray292[0] - (local1563 >> 1);
									@Pc(1760) int local1760 = Static272.anIntArray292[1] + arg0 + local1736 - 12;
									@Pc(1762) int local1762 = local1760;
									@Pc(1767) int local1767 = local1760 + local1225;
									@Pc(1774) int local1774 = local1049.anInt10029 + local1760 + 15;
									@Pc(1780) int local1780 = local1774 - local1446.anInt2765;
									@Pc(1785) int local1785 = local1774 + local1446.anInt2767;
									if (local1760 > local1780) {
										local1762 = local1780;
									}
									if (local1767 < local1785) {
										local1767 = local1785;
									}
									@Pc(1801) int local1801 = 0;
									@Pc(1816) int local1816;
									@Pc(1821) int local1821;
									if (local1082 != null) {
										local1801 = local1082.anInt10029 + local1760 + 15;
										local1816 = local1801 - local1448.anInt2765;
										local1821 = local1801 + local1448.anInt2767;
										if (local1762 > local1816) {
											local1762 = local1816;
										}
										if (local1767 < local1821) {
											local1767 = local1821;
										}
									}
									local1816 = 255;
									if (local1049.anInt10023 >= 0) {
										local1816 = (local1675 << 8) / (local1049.anInt10030 - local1049.anInt10023);
									}
									if (local1816 >= 0 && local1816 < 255) {
										local1821 = local1816 << 24;
										@Pc(2017) int local2017 = local1821 | 0xFFFFFF;
										if (local1223 != null) {
											local1223.method7444(local1749 - local1188, local1760, 0, local2017, 1);
										}
										if (local1277 != null) {
											local1277.method7444(local1749 + local1574 - local1192, local1760, 0, local2017, 1);
										}
										@Pc(2049) int local2049;
										if (local1250 != null) {
											for (local2049 = 0; local2049 < local1538; local2049++) {
												local1250.method7444(local1749 + local1585 + local1182 * local2049 - local1190, local1760, 0, local2017, 1);
											}
										}
										if (local1304 != null) {
											local1304.method7444(local1749 + local1602 - local1194, local1760, 0, local2017, 1);
										}
										local1442.method7751(local1749 + local1587, 0, local1514, local1049.anInt10026 | local1821, local1774);
										if (local1082 != null) {
											if (local1196 != null) {
												local1196.method7444(local1628 + local1749 - local1212, local1760, 0, local2017, 1);
											}
											if (local1200 != null) {
												local1200.method7444(local1630 + local1749 - local1216, local1760, 0, local2017, 1);
											}
											if (local1198 != null) {
												for (local2049 = 0; local2049 < local1540; local2049++) {
													local1198.method7444(local2049 * local1206 + local1749 + local1632 - local1214, local1760, 0, local2017, 1);
												}
											}
											if (local1202 != null) {
												local1202.method7444(local1634 + local1749 - local1218, local1760, 0, local2017, 1);
											}
											local1444.method7751(local1636 + local1749, 0, local1502, local1082.anInt10026 | local1821, local1801);
										}
									} else {
										if (local1223 != null) {
											local1223.method7462(local1749 - local1188, local1760);
										}
										if (local1277 != null) {
											local1277.method7462(local1749 + local1574 - local1192, local1760);
										}
										if (local1250 != null) {
											for (local1821 = 0; local1821 < local1538; local1821++) {
												local1250.method7462(local1749 + local1585 + local1182 * local1821 - local1190, local1760);
											}
										}
										if (local1304 != null) {
											local1304.method7462(local1749 + local1602 - local1194, local1760);
										}
										local1442.method7751(local1587 + local1749, 0, local1514, local1049.anInt10026 | 0xFF000000, local1774);
										if (local1082 != null) {
											if (local1196 != null) {
												local1196.method7462(local1749 + local1628 - local1212, local1760);
											}
											if (local1200 != null) {
												local1200.method7462(local1749 + local1630 - local1216, local1760);
											}
											if (local1198 != null) {
												for (local1821 = 0; local1821 < local1540; local1821++) {
													local1198.method7462(local1632 + local1749 + local1821 * local1206 - local1214, local1760);
												}
											}
											if (local1202 != null) {
												local1202.method7462(local1749 + local1634 - local1218, local1760);
											}
											local1444.method7751(local1749 + local1636, 0, local1502, local1082.anInt10026 | 0xFF000000, local1801);
										}
									}
									Static304.method7235(local1749 + local1563, local1767 - -1, local1749, local1762);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2223) int local2223;
		for (@Pc(2217) int local2217 = 0; local2217 < Static260.anInt5076; local2217++) {
			local2223 = Static166.anIntArray203[local2217];
			@Pc(2232) Class9_Sub2_Sub1_Sub2 local2232;
			if (local2223 < 2048) {
				local2232 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local2223];
			} else {
				local2232 = ((Class3_Sub43) Static545.aClass25_40.method426((long) (local2223 - 2048))).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			}
			local202 = Static199.anIntArray218[local2217];
			@Pc(2261) Class9_Sub2_Sub1_Sub2 local2261;
			if (local202 >= 2048) {
				local2261 = ((Class3_Sub43) Static545.aClass25_40.method426((long) (local202 - 2048))).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			} else {
				local2261 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local202];
			}
			Static518.method7520(--local2232.anInt10176, arg1, arg2, local2232, local2261, arg0, arg3);
		}
		local2223 = Static426.aClass93_11.anInt2767 + Static426.aClass93_11.anInt2765 + 2;
		for (local169 = 0; local169 < Static142.anInt9297; local169++) {
			local202 = Static348.anIntArray377[local169];
			local1042 = Static348.anIntArray376[local169];
			local434 = Static348.anIntArray380[local169];
			@Pc(2314) boolean local2314 = true;
			while (local2314) {
				local2314 = false;
				for (local568 = 0; local568 < local169; local568++) {
					if (Static348.anIntArray376[local568] - local2223 < local1042 + 2 && Static348.anIntArray376[local568] + 2 > local1042 - local2223 && Static348.anIntArray380[local568] + Static348.anIntArray377[local568] > -local434 + local202 && Static348.anIntArray377[local568] - Static348.anIntArray380[local568] < local434 + local202 && Static348.anIntArray376[local568] - local2223 < local1042) {
						local2314 = true;
						local1042 = Static348.anIntArray376[local568] - local2223;
					}
				}
			}
			Static348.anIntArray376[local169] = local1042;
			@Pc(2402) String local2402 = Static348.aStringArray47[local169];
			local249 = Static426.aClass93_11.method2315(local2402);
			local331 = local202 + arg2;
			local334 = arg0 + local1042 - Static426.aClass93_11.anInt2765;
			local1134 = local331 + local249;
			@Pc(2432) int local2432 = arg0 + local1042 + Static426.aClass93_11.anInt2767;
			if (Static291.anInt5619 == 0) {
				@Pc(2436) int local2436 = 16776960;
				if (Static348.anIntArray379[local169] < 6) {
					local2436 = Static583.anIntArray664[Static348.anIntArray379[local169]];
				}
				if (Static348.anIntArray379[local169] == 6) {
					local2436 = Static609.anInt9804 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static348.anIntArray379[local169] == 7) {
					local2436 = Static609.anInt9804 % 20 < 10 ? 255 : 65535;
				}
				if (Static348.anIntArray379[local169] == 8) {
					local2436 = Static609.anInt9804 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2510) int local2510;
				if (Static348.anIntArray379[local169] == 9) {
					local2510 = 150 - Static348.anIntArray378[local169];
					if (local2510 < 50) {
						local2436 = local2510 * 1280 + 16711680;
					} else if (local2510 < 100) {
						local2436 = 16776960 + 16384000 - local2510 * 327680;
					} else if (local2510 < 150) {
						local2436 = local2510 * 5 + 65280 - 500;
					}
				}
				if (Static348.anIntArray379[local169] == 10) {
					local2510 = 150 - Static348.anIntArray378[local169];
					if (local2510 < 50) {
						local2436 = local2510 * 5 + 16711680;
					} else if (local2510 < 100) {
						local2436 = 16711935 - (local2510 - 50) * 327680;
					} else if (local2510 < 150) {
						local2436 = local2510 * 327680 + 255 - (local2510 + -100) * 5 - 32768000;
					}
				}
				if (Static348.anIntArray379[local169] == 11) {
					local2510 = 150 - Static348.anIntArray378[local169];
					if (local2510 < 50) {
						local2436 = 16777215 - local2510 * 327685;
					} else if (local2510 < 100) {
						local2436 = local2510 * 327685 + 65280 - 16384250;
					} else if (local2510 < 150) {
						local2436 = 32768000 + 16777215 - local2510 * 327680;
					}
				}
				local2510 = local2436 | 0xFF000000;
				if (Static348.anIntArray381[local169] == 0) {
					local331 -= local249 >> 1;
					Static374.aClass63_9.method7754(local2402, arg0 + local1042, local2510, -16777216, arg2 + local202);
					local1134 -= local249 >> 1;
				}
				if (Static348.anIntArray381[local169] == 1) {
					local1134 -= local249 >> 1;
					local2432 += 5;
					local331 -= local249 >> 1;
					Static374.aClass63_9.method7755(Static609.anInt9804, local2402, local2510, local202 + arg2, arg0 - -local1042);
					local334 -= 5;
				}
				if (Static348.anIntArray381[local169] == 2) {
					local2432 += 5;
					local331 -= (local249 >> 1) + 5;
					local334 -= 5;
					Static374.aClass63_9.method7753(local2402, local2510, arg2 + local202, local1042 + arg0, Static609.anInt9804);
					local1134 -= (local249 >> 1) - 5;
				}
				if (Static348.anIntArray381[local169] == 3) {
					local2432 += 7;
					Static374.aClass63_9.method7750(arg2 + local202, local1042 + arg0, Static609.anInt9804, 150 - Static348.anIntArray378[local169], local2402, local2510);
					local1134 -= local249 >> 1;
					local334 -= 7;
					local331 -= local249 >> 1;
				}
				@Pc(2836) int local2836;
				if (Static348.anIntArray381[local169] == 4) {
					local2836 = (150 - Static348.anIntArray378[local169]) * (Static426.aClass93_11.method2315(local2402) + 100) / 150;
					Static266.aClass82_8.T(arg2 + local202 - 50, arg0, local202 + arg2 + 50, arg0 - -arg1);
					Static374.aClass63_9.method7751(local202 + arg2 + 50 - local2836, -16777216, local2402, local2510, arg0 + local1042);
					local331 += 50 - local2836;
					local1134 += 50 - local2836;
					Static266.aClass82_8.KA(arg2, arg0, arg3 + arg2, arg0 - -arg1);
				}
				if (Static348.anIntArray381[local169] == 5) {
					local2836 = 150 - Static348.anIntArray378[local169];
					local1180 = 0;
					if (local2836 < 25) {
						local1180 = local2836 - 25;
					} else if (local2836 > 125) {
						local1180 = local2836 - 125;
					}
					local1182 = Static426.aClass93_11.anInt2767 + Static426.aClass93_11.anInt2765;
					Static266.aClass82_8.T(arg2, arg0 + local1042 - local1182 - 1, arg2 - -arg3, arg0 + local1042 + 5);
					Static374.aClass63_9.method7754(local2402, arg0 + local1042 + local1180, local2510, -16777216, arg2 + local202);
					local334 += local1180;
					local331 -= local249 >> 1;
					local2432 += local1180;
					local1134 -= local249 >> 1;
					Static266.aClass82_8.KA(arg2, arg0, arg2 + arg3, arg0 - -arg1);
				}
			} else {
				Static374.aClass63_9.method7754(local2402, arg0 + local1042, -256, -16777216, local202 + arg2);
				local1134 -= local249 >> 1;
				local331 -= local249 >> 1;
			}
			Static304.method7235(local1134 + 1, local2432 - -1, local331, local334);
		}
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V")
	public static void method8582() {
		for (@Pc(6) Class3_Sub7_Sub13 local6 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8414(); local6 != null; local6 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8415()) {
			if (local6.anInt4660 > 1) {
				local6.anInt4660 = 0;
				Static614.aClass136_70.method3135(local6, ((Class3_Sub7_Sub19) local6.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63).aLong228);
				local6.aClass363_21.method8419();
			}
		}
		Static285.anInt7798 = 0;
		Static334.anInt6266 = 0;
		Static544.aClass216_66.method5454();
		Static166.aClass25_17.method433();
		Static561.aClass363_53.method8419();
		Static378.method5963(Static233.aClass3_Sub7_Sub19_17);
	}
}
