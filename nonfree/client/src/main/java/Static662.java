import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static662 {

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "J")
	public static long aLong305;

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "Lclient!sha;")
	public static Class321 aClass321_54 = null;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_369 = new Class179(3, 12);

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!pb;")
	public static final Class265 aClass265_19 = new Class265(1);

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!of;")
	public static final Class251 aClass251_10 = new Class251(8, 1);

	@OriginalMember(owner = "client!wh", name = "t", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_151 = new Class289(26, 8);

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "[I")
	public static int[] anIntArray705 = null;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZIII)V")
	public static void method9002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static475.anInt8165;
		Static261.anInt4529 = 0;
		@Pc(11) int[] local11 = Static75.anIntArray82;
		@Pc(165) int local165;
		@Pc(202) int local202;
		@Pc(248) int local248;
		@Pc(320) int local320;
		@Pc(323) int local323;
		@Pc(1096) int local1096;
		@Pc(1141) int local1141;
		@Pc(1143) int local1143;
		@Pc(406) int local406;
		@Pc(1006) int local1006;
		@Pc(509) int local509;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static133.anInt2316; local13++) {
			@Pc(17) Class91 local17 = null;
			@Pc(33) Class2_Sub1_Sub1_Sub3 local33;
			if (local7 <= local13) {
				local33 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local13 - local7])).aClass2_Sub1_Sub1_Sub3_Sub2_2;
				local17 = ((Class2_Sub1_Sub1_Sub3_Sub2) local33).aClass91_1;
				if (local17.anIntArray140 != null) {
					local17 = local17.method2036(Static659.aClass363_3);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local33 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local11[local13]];
			}
			if (local33.anInt5113 >= 0 && (Static61.anInt1167 == local33.anInt5088 || Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.aByte140 == local33.aByte140)) {
				Static506.method7220(local33.method4324(), arg1 >> 1, local33, arg0 >> 1);
				if (Static574.anIntArray632[0] >= 0) {
					if (local33.aString66 != null && (local13 >= local7 || Static147.anInt2503 == 0 || Static147.anInt2503 == 3 || Static147.anInt2503 == 1 && Static585.method8093(((Class2_Sub1_Sub1_Sub3_Sub1) local33).aString45)) && Static261.anInt4529 < Static576.anInt9503) {
						Static576.anIntArray634[Static261.anInt4529] = Static173.aClass151_4.method3323(local33.aString66) / 2;
						Static576.anIntArray635[Static261.anInt4529] = Static574.anIntArray632[0];
						Static576.anIntArray638[Static261.anInt4529] = Static574.anIntArray632[1];
						Static576.anIntArray633[Static261.anInt4529] = local33.anInt5056;
						Static576.anIntArray637[Static261.anInt4529] = local33.anInt5098;
						Static576.anIntArray636[Static261.anInt4529] = local33.anInt5106;
						Static576.aStringArray59[Static261.anInt4529] = local33.aString66;
						Static261.anInt4529++;
					}
					local165 = arg3 + Static574.anIntArray632[1];
					@Pc(233) Class9[] local233;
					@Pc(240) Class112[] local240;
					@Pc(292) Class9 local292;
					if (local33.aBoolean329 || local33.anInt5057 <= Static90.anInt1698) {
						local165 -= Math.max(Static173.aClass151_4.anInt3921, Static272.aClass9Array82[0].method8918());
					} else {
						@Pc(188) byte local188 = 1;
						if (local7 > local13) {
							@Pc(197) Class2_Sub1_Sub1_Sub3_Sub1 local197 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local11[local13]];
							local202 = local33.method4317().anInt10735;
							if (local197.aBoolean260) {
								local188 = 2;
							}
						} else {
							local202 = local17.anInt2356;
							if (local202 == -1) {
								local202 = local33.method4317().anInt10735;
							}
						}
						@Pc(222) Class9[] local222 = Static272.aClass9Array82;
						if (local202 != -1) {
							local233 = (Class9[]) Static259.aClass10_22.method373((long) local202);
							if (local233 == null) {
								local240 = Static681.method2323(Static624.aClass8_139, local202);
								if (local240 != null) {
									local233 = new Class9[local240.length];
									for (local248 = 0; local248 < local240.length; local248++) {
										local233[local248] = Static546.aClass132_13.method7488(local240[local248], true);
									}
									Static259.aClass10_22.method366(local233, (long) local202);
								}
							}
							if (local233 != null && local233.length >= 2) {
								local222 = local233;
							}
						}
						if (local188 >= local222.length) {
							local188 = 1;
						}
						@Pc(288) Class9 local288 = local222[0];
						local292 = local222[local188];
						local165 -= Math.max(Static173.aClass151_4.anInt3921, local288.method8918());
						local248 = Static574.anIntArray632[0] + arg2 - (local288.method8938() >> 1);
						local320 = local288.method8938() * local33.anInt5078 / 255;
						local323 = local288.method8918();
						if (local33.anInt5078 > 0 && local320 < 2) {
							local320 = 2;
						}
						local288.method8920(local248, local165);
						Static546.aClass132_13.T(local248, local165, local320 + local248, local323 + local165);
						local292.method8920(local248, local165);
						Static546.aClass132_13.KA(arg2, arg3, arg2 + arg1, arg3 + arg0);
						Static629.method8681(local248 + local288.method8937(), local165, local165 + local323, local248);
					}
					local165 -= 2;
					if (!local33.aBoolean329) {
						@Pc(387) Class9 local387;
						@Pc(396) Class9 local396;
						if (Static90.anInt1698 < local33.anInt5108) {
							local387 = Static267.aClass9Array79[local33.aBoolean330 ? 2 : 0];
							local396 = Static267.aClass9Array79[local33.aBoolean330 ? 3 : 1];
							if (local33 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
								local406 = local17.anInt2362;
								if (local406 == -1) {
									local406 = local33.method4317().anInt10729;
								}
							} else {
								local406 = local33.method4317().anInt10729;
							}
							if (local406 != -1) {
								local233 = (Class9[]) Static339.aClass10_36.method373((long) local406);
								if (local233 == null) {
									local240 = Static681.method2323(Static624.aClass8_139, local406);
									if (local240 != null) {
										local233 = new Class9[local240.length];
										for (local248 = 0; local248 < local240.length; local248++) {
											local233[local248] = Static546.aClass132_13.method7488(local240[local248], true);
										}
										Static339.aClass10_36.method366(local233, (long) local406);
									}
								}
								if (local233 != null && local233.length == 4) {
									local387 = local233[local33.aBoolean330 ? 2 : 0];
									local396 = local233[local33.aBoolean330 ? 3 : 1];
								}
							}
							@Pc(498) int local498 = local33.anInt5108 - Static90.anInt1698;
							if (local498 <= local33.anInt5086) {
								local509 = local387.method8938();
							} else {
								local498 -= local33.anInt5086;
								local248 = local33.anInt5091 == 0 ? 0 : (local33.anInt5111 - local498) / local33.anInt5091 * local33.anInt5091;
								local509 = local248 * local387.method8938() / local33.anInt5111;
							}
							local248 = local387.method8918();
							local165 -= local248;
							local320 = arg2 + Static574.anIntArray632[0] - (local387.method8938() >> 1);
							local387.method8920(local320, local165);
							Static546.aClass132_13.T(local320, local165, local509 + local320, local165 + local248);
							local396.method8920(local320, local165);
							Static546.aClass132_13.KA(arg2, arg3, arg2 + arg1, arg0 + arg3);
							Static629.method8681(local387.method8937() + local320, local165, local248 + local165, local320);
							local165 -= 2;
						}
						if (local13 < local7) {
							@Pc(612) Class2_Sub1_Sub1_Sub3_Sub1 local612 = (Class2_Sub1_Sub1_Sub3_Sub1) local33;
							if (local612.anInt4193 != -1) {
								local165 -= 25;
								local396 = Static174.aClass9Array56[local612.anInt4193];
								local396.method8920(arg2 + Static574.anIntArray632[0] - 12, local165);
								Static629.method8681(Static574.anIntArray632[0] + arg2 + local396.method8937() - 12, local165, local165 + local396.method8930(), arg2 - -Static574.anIntArray632[0] + -12);
								local165 -= 2;
							}
							if (local612.anInt4194 != -1) {
								local165 -= 25;
								local396 = Static417.aClass9Array124[local612.anInt4194];
								local396.method8920(arg2 + Static574.anIntArray632[0] - 12, local165);
								Static629.method8681(arg2 + Static574.anIntArray632[0] + local396.method8937() - 12, local165, local396.method8930() + local165, arg2 + -12 + Static574.anIntArray632[0]);
								local165 -= 2;
							}
						} else if (local17.anInt2345 >= 0 && Static417.aClass9Array124.length > local17.anInt2345) {
							local387 = Static417.aClass9Array124[local17.anInt2345];
							local165 -= 25;
							local387.method8920(Static574.anIntArray632[0] + arg2 - (local387.method8938() >> 1), local165);
							Static629.method8681(Static574.anIntArray632[0] + arg2 - (local387.method8938() >> 1) + local387.method8937(), local165, local165 + local387.method8930(), Static574.anIntArray632[0] + arg2 + -(local387.method8938() >> 1));
							local165 -= 2;
						}
					}
					@Pc(781) Class167[] local781;
					@Pc(789) Class167 local789;
					if (!(local33 instanceof Class2_Sub1_Sub1_Sub3_Sub1)) {
						local202 = 0;
						local781 = Static539.aClass167Array1;
						for (local406 = 0; local406 < local781.length; local406++) {
							local789 = local781[local406];
							if (local789 != null && local789.anInt4342 == 1 && local789.anInt4346 == Static74.anIntArray80[local13 - local7]) {
								local292 = Static371.aClass9Array110[local789.anInt4341];
								if (local292.method8918() > local202) {
									local202 = local292.method8918();
								}
								if (Static90.anInt1698 % 20 < 10) {
									local292.method8920(arg2 + Static574.anIntArray632[0] - 12, local165 - local292.method8918());
									Static629.method8681(Static574.anIntArray632[0] + arg2 + local292.method8937() - 12, local165 - local292.method8918(), local165 - local292.method8918() + local292.method8930(), Static574.anIntArray632[0] + arg2 + -12);
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local781 = Static539.aClass167Array1;
						for (local406 = 0; local406 < local781.length; local406++) {
							local789 = local781[local406];
							if (local789 != null && local789.anInt4342 == 10 && local11[local13] == local789.anInt4346) {
								local292 = Static371.aClass9Array110[local789.anInt4341];
								if (local292.method8918() > local202) {
									local202 = local292.method8918();
								}
								local292.method8920(Static574.anIntArray632[0] + arg2 - 12, local165 - local292.method8918());
								Static629.method8681(arg2 + Static574.anIntArray632[0] + local292.method8937() - 12, local165 + -local292.method8918(), local165 - local292.method8918() + local292.method8930(), Static574.anIntArray632[0] + arg2 + -12);
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < Static332.anInt7618; local202++) {
						local1006 = local33.anIntArray293[local202];
						local406 = local33.anIntArray298[local202];
						@Pc(1013) Class285 local1013 = null;
						local509 = 0;
						if (local406 >= 0) {
							if (local1006 <= Static90.anInt1698) {
								continue;
							}
							local1013 = Static118.aClass55_1.method1401(local33.anIntArray298[local202]);
							local509 = local1013.anInt8196;
						} else if (local1006 < 0) {
							continue;
						}
						local248 = local33.anIntArray294[local202];
						@Pc(1045) Class285 local1045 = null;
						if (local248 >= 0) {
							local1045 = Static118.aClass55_1.method1401(local248);
						}
						if (local1006 - local509 <= Static90.anInt1698) {
							local323 = local33.anIntArray299[local202];
							if (local323 >= 0) {
								local33.anInt5078 = local323;
								local33.anInt5057 = Static90.anInt1698 + 300;
								local33.anIntArray299[local202] = -1;
							}
							if (local1013 == null) {
								local33.anIntArray293[local202] = -1;
							} else {
								local1096 = local33.method4324() / 2;
								Static506.method7220(local1096, arg1 >> 1, local33, arg0 >> 1);
								if (Static574.anIntArray632[0] > -1) {
									Static574.anIntArray632[0] += Static145.anIntArray144[local202];
									Static574.anIntArray632[1] += anIntArray705[local202];
									local1141 = 0;
									local1143 = 0;
									@Pc(1145) int local1145 = 0;
									@Pc(1147) int local1147 = 0;
									@Pc(1149) int local1149 = 0;
									@Pc(1151) int local1151 = 0;
									@Pc(1153) int local1153 = 0;
									@Pc(1155) int local1155 = 0;
									@Pc(1157) Class9 local1157 = null;
									@Pc(1159) Class9 local1159 = null;
									@Pc(1161) Class9 local1161 = null;
									@Pc(1163) Class9 local1163 = null;
									@Pc(1165) int local1165 = 0;
									@Pc(1167) int local1167 = 0;
									@Pc(1169) int local1169 = 0;
									@Pc(1171) int local1171 = 0;
									@Pc(1173) int local1173 = 0;
									@Pc(1175) int local1175 = 0;
									@Pc(1177) int local1177 = 0;
									@Pc(1179) int local1179 = 0;
									@Pc(1181) int local1181 = 0;
									@Pc(1186) Class9 local1186 = local1013.method6975(Static546.aClass132_13);
									@Pc(1194) int local1194;
									if (local1186 != null) {
										local1141 = local1186.method8938();
										local1194 = local1186.method8918();
										local1186.method8923(Static539.anIntArray614);
										if (local1194 > 0) {
											local1181 = local1194;
										}
										local1149 = Static539.anIntArray614[0];
									}
									@Pc(1211) Class9 local1211 = local1013.method6979(Static546.aClass132_13);
									if (local1211 != null) {
										local1143 = local1211.method8938();
										local1194 = local1211.method8918();
										if (local1194 > local1181) {
											local1181 = local1194;
										}
										local1211.method8923(Static539.anIntArray614);
										local1151 = Static539.anIntArray614[0];
									}
									@Pc(1240) Class9 local1240 = local1013.method6976(Static546.aClass132_13);
									if (local1240 != null) {
										local1145 = local1240.method8938();
										local1194 = local1240.method8918();
										if (local1194 > local1181) {
											local1181 = local1194;
										}
										local1240.method8923(Static539.anIntArray614);
										local1153 = Static539.anIntArray614[0];
									}
									@Pc(1265) Class9 local1265 = local1013.method6981(Static546.aClass132_13);
									if (local1265 != null) {
										local1147 = local1265.method8938();
										local1194 = local1265.method8918();
										if (local1194 > local1181) {
											local1181 = local1194;
										}
										local1265.method8923(Static539.anIntArray614);
										local1155 = Static539.anIntArray614[0];
									}
									if (local1045 != null) {
										local1157 = local1045.method6975(Static546.aClass132_13);
										if (local1157 != null) {
											local1165 = local1157.method8938();
											local1194 = local1157.method8918();
											if (local1194 > local1181) {
												local1181 = local1194;
											}
											local1157.method8923(Static539.anIntArray614);
											local1173 = Static539.anIntArray614[0];
										}
										local1159 = local1045.method6979(Static546.aClass132_13);
										if (local1159 != null) {
											local1167 = local1159.method8938();
											local1194 = local1159.method8918();
											if (local1194 > local1181) {
												local1181 = local1194;
											}
											local1159.method8923(Static539.anIntArray614);
											local1175 = Static539.anIntArray614[0];
										}
										local1161 = local1045.method6976(Static546.aClass132_13);
										if (local1161 != null) {
											local1169 = local1161.method8938();
											local1194 = local1161.method8918();
											if (local1194 > local1181) {
												local1181 = local1194;
											}
											local1161.method8923(Static539.anIntArray614);
											local1177 = Static539.anIntArray614[0];
										}
										local1163 = local1045.method6981(Static546.aClass132_13);
										if (local1163 != null) {
											local1171 = local1163.method8938();
											local1194 = local1163.method8918();
											if (local1194 > local1181) {
												local1181 = local1194;
											}
											local1163.method8923(Static539.anIntArray614);
											local1179 = Static539.anIntArray614[0];
										}
									}
									@Pc(1405) Class19 local1405 = Static494.aClass19_12;
									@Pc(1407) Class19 local1407 = Static494.aClass19_12;
									@Pc(1409) Class151 local1409 = Static393.aClass151_10;
									@Pc(1411) Class151 local1411 = Static393.aClass151_10;
									local1194 = local1013.anInt8192;
									@Pc(1425) Class19 local1425;
									@Pc(1430) Class151 local1430;
									if (local1194 >= 0) {
										local1425 = Static381.method6632(local1194, true, Static546.aClass132_13);
										local1430 = Static454.method6566(local1194, Static546.aClass132_13);
										if (local1425 != null && local1430 != null) {
											local1405 = local1425;
											local1409 = local1430;
										}
									}
									if (local1045 != null) {
										local1194 = local1045.anInt8192;
										if (local1194 >= 0) {
											local1425 = Static381.method6632(local1194, true, Static546.aClass132_13);
											local1430 = Static454.method6566(local1194, Static546.aClass132_13);
											if (local1425 != null && local1430 != null) {
												local1407 = local1425;
												local1411 = local1430;
											}
										}
									}
									@Pc(1471) String local1471 = null;
									@Pc(1481) String local1481 = local1013.method6977(local33.anIntArray291[local202]);
									@Pc(1483) int local1483 = 0;
									@Pc(1488) int local1488 = local1409.method3323(local1481);
									if (local1045 != null) {
										local1471 = local1045.method6977(local33.anIntArray292[local202]);
										local1483 = local1411.method3323(local1471);
									}
									@Pc(1505) int local1505 = 0;
									@Pc(1507) int local1507 = 0;
									if (local1143 > 0) {
										local1505 = local1488 / local1143 + 1;
									}
									if (local1045 != null && local1167 > 0) {
										local1507 = local1483 / local1167 + 1;
									}
									@Pc(1530) int local1530 = 0;
									if (local1141 > 0) {
										local1530 = local1141;
									}
									local1530 += 2;
									@Pc(1541) int local1541 = local1530;
									if (local1145 > 0) {
										local1530 += local1145;
									}
									@Pc(1552) int local1552 = local1530;
									@Pc(1554) int local1554 = local1530;
									@Pc(1560) int local1560;
									if (local1143 > 0) {
										local1560 = local1505 * local1143;
										local1530 += local1560;
										local1554 += (local1560 - local1488) / 2;
									} else {
										local1530 += local1488;
									}
									local1560 = local1530;
									if (local1147 > 0) {
										local1530 += local1147;
									}
									@Pc(1592) int local1592 = 0;
									@Pc(1594) int local1594 = 0;
									@Pc(1596) int local1596 = 0;
									@Pc(1598) int local1598 = 0;
									@Pc(1600) int local1600 = 0;
									@Pc(1642) int local1642;
									if (local1045 != null) {
										local1530 += 2;
										local1592 = local1530;
										if (local1165 > 0) {
											local1530 += local1165;
										}
										local1530 += 2;
										local1594 = local1530;
										if (local1169 > 0) {
											local1530 += local1169;
										}
										local1596 = local1530;
										local1600 = local1530;
										if (local1167 <= 0) {
											local1530 += local1483;
										} else {
											local1642 = local1507 * local1167;
											local1600 = local1530 + (local1642 - local1483) / 2;
											local1530 += local1642;
										}
										local1598 = local1530;
										if (local1171 > 0) {
											local1530 += local1171;
										}
									}
									local1642 = local33.anIntArray293[local202] - Static90.anInt1698;
									@Pc(1681) int local1681 = local1013.anInt8184 - local1642 * local1013.anInt8184 / local1013.anInt8196;
									@Pc(1693) int local1693 = local1013.anInt8182 * local1642 / local1013.anInt8196 - local1013.anInt8182;
									@Pc(1706) int local1706 = local1681 + Static574.anIntArray632[0] + arg2 - (local1530 >> 1);
									@Pc(1716) int local1716 = local1693 + Static574.anIntArray632[1] + arg3 - 12;
									@Pc(1718) int local1718 = local1716;
									@Pc(1722) int local1722 = local1181 + local1716;
									@Pc(1730) int local1730 = local1716 + local1013.anInt8180 + 15;
									@Pc(1736) int local1736 = local1730 - local1409.anInt3921;
									if (local1736 < local1716) {
										local1718 = local1736;
									}
									@Pc(1746) int local1746 = local1409.anInt3915 + local1730;
									if (local1722 < local1746) {
										local1722 = local1746;
									}
									@Pc(1753) int local1753 = 0;
									@Pc(1769) int local1769;
									@Pc(1774) int local1774;
									if (local1045 != null) {
										local1753 = local1716 + local1045.anInt8180 + 15;
										local1769 = local1753 - local1411.anInt3921;
										local1774 = local1753 + local1411.anInt3915;
										if (local1769 < local1718) {
											local1718 = local1769;
										}
										if (local1722 < local1774) {
											local1722 = local1774;
										}
									}
									local1769 = 255;
									if (local1013.anInt8177 >= 0) {
										local1769 = (local1642 << 8) / (local1013.anInt8196 - local1013.anInt8177);
									}
									if (local1769 >= 0 && local1769 < 255) {
										local1774 = local1769 << 24;
										@Pc(1961) int local1961 = local1774 | 0xFFFFFF;
										if (local1186 != null) {
											local1186.method8919(local1706 - local1149, local1716, 0, local1961, 1);
										}
										if (local1240 != null) {
											local1240.method8919(local1541 + local1706 - local1153, local1716, 0, local1961, 1);
										}
										@Pc(1992) int local1992;
										if (local1211 != null) {
											for (local1992 = 0; local1992 < local1505; local1992++) {
												local1211.method8919(local1143 * local1992 + local1706 + local1552 - local1151, local1716, 0, local1961, 1);
											}
										}
										if (local1265 != null) {
											local1265.method8919(local1706 + local1560 - local1155, local1716, 0, local1961, 1);
										}
										local1405.method6336(local1730, local1774 | local1013.anInt8185, 0, local1554 + local1706, local1481);
										if (local1045 != null) {
											if (local1157 != null) {
												local1157.method8919(local1592 + local1706 - local1173, local1716, 0, local1961, 1);
											}
											if (local1161 != null) {
												local1161.method8919(local1706 + local1594 - local1177, local1716, 0, local1961, 1);
											}
											if (local1159 != null) {
												for (local1992 = 0; local1992 < local1507; local1992++) {
													local1159.method8919(local1167 * local1992 + local1596 + local1706 - local1175, local1716, 0, local1961, 1);
												}
											}
											if (local1163 != null) {
												local1163.method8919(local1598 + local1706 - local1179, local1716, 0, local1961, 1);
											}
											local1407.method6336(local1753, local1045.anInt8185 | local1774, 0, local1600 + local1706, local1471);
										}
									} else {
										if (local1186 != null) {
											local1186.method8920(local1706 - local1149, local1716);
										}
										if (local1240 != null) {
											local1240.method8920(local1706 + local1541 - local1153, local1716);
										}
										if (local1211 != null) {
											for (local1774 = 0; local1774 < local1505; local1774++) {
												local1211.method8920(local1774 * local1143 + local1552 + local1706 - local1151, local1716);
											}
										}
										if (local1265 != null) {
											local1265.method8920(local1560 + local1706 - local1155, local1716);
										}
										local1405.method6336(local1730, local1013.anInt8185 | 0xFF000000, 0, local1706 + local1554, local1481);
										if (local1045 != null) {
											if (local1157 != null) {
												local1157.method8920(local1706 + local1592 - local1173, local1716);
											}
											if (local1161 != null) {
												local1161.method8920(local1594 + local1706 - local1177, local1716);
											}
											if (local1159 != null) {
												for (local1774 = 0; local1774 < local1507; local1774++) {
													local1159.method8920(local1706 + local1596 + local1167 * local1774 - local1175, local1716);
												}
											}
											if (local1163 != null) {
												local1163.method8920(local1598 + local1706 - local1179, local1716);
											}
											local1407.method6336(local1753, local1045.anInt8185 | 0xFF000000, 0, local1706 + local1600, local1471);
										}
									}
									Static629.method8681(local1530 + local1706, local1718, local1722 + 1, local1706);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2162) int local2162;
		for (@Pc(2156) int local2156 = 0; local2156 < Static478.anInt8214; local2156++) {
			local2162 = Static428.anIntArray459[local2156];
			@Pc(2177) Class2_Sub1_Sub1_Sub3 local2177;
			if (local2162 >= 2048) {
				local2177 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) (local2162 - 2048))).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			} else {
				local2177 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local2162];
			}
			local202 = Static524.anIntArray626[local2156];
			@Pc(2202) Class2_Sub1_Sub1_Sub3 local2202;
			if (local202 >= 2048) {
				local2202 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) (local202 - 2048))).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			} else {
				local2202 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local202];
			}
			Static546.method7765(local2177, arg3, --local2177.anInt5064, local2202, arg0, arg1, arg2);
		}
		local2162 = Static173.aClass151_4.anInt3915 + Static173.aClass151_4.anInt3921 + 2;
		for (local165 = 0; local165 < Static261.anInt4529; local165++) {
			local202 = Static576.anIntArray635[local165];
			local1006 = Static576.anIntArray638[local165];
			local406 = Static576.anIntArray634[local165];
			@Pc(2259) boolean local2259 = true;
			while (local2259) {
				local2259 = false;
				for (local509 = 0; local509 < local165; local509++) {
					if (local1006 + 2 > Static576.anIntArray638[local509] - local2162 && local1006 - local2162 < Static576.anIntArray638[local509] + 2 && local202 - local406 < Static576.anIntArray635[local509] + Static576.anIntArray634[local509] && Static576.anIntArray635[local509] - Static576.anIntArray634[local509] < local202 - -local406 && local1006 > Static576.anIntArray638[local509] - local2162) {
						local1006 = Static576.anIntArray638[local509] - local2162;
						local2259 = true;
					}
				}
			}
			Static576.anIntArray638[local165] = local1006;
			@Pc(2349) String local2349 = Static576.aStringArray59[local165];
			local248 = Static173.aClass151_4.method3323(local2349);
			local320 = arg2 + local202;
			local323 = local1006 + arg3 - Static173.aClass151_4.anInt3921;
			local1096 = local248 + local320;
			@Pc(2378) int local2378 = arg3 + local1006 + Static173.aClass151_4.anInt3915;
			if (Static232.anInt3954 == 0) {
				@Pc(2385) int local2385 = 16776960;
				if (Static576.anIntArray633[local165] < 6) {
					local2385 = Static603.anIntArray655[Static576.anIntArray633[local165]];
				}
				if (Static576.anIntArray633[local165] == 6) {
					local2385 = Static61.anInt1167 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static576.anIntArray633[local165] == 7) {
					local2385 = Static61.anInt1167 % 20 >= 10 ? 65535 : 255;
				}
				if (Static576.anIntArray633[local165] == 8) {
					local2385 = Static61.anInt1167 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2459) int local2459;
				if (Static576.anIntArray633[local165] == 9) {
					local2459 = 150 - Static576.anIntArray636[local165];
					if (local2459 < 50) {
						local2385 = local2459 * 1280 + 16711680;
					} else if (local2459 < 100) {
						local2385 = 16384000 + 16776960 - local2459 * 327680;
					} else if (local2459 < 150) {
						local2385 = local2459 * 5 + 65280 - 500;
					}
				}
				if (Static576.anIntArray633[local165] == 10) {
					local2459 = 150 - Static576.anIntArray636[local165];
					if (local2459 < 50) {
						local2385 = local2459 * 5 + 16711680;
					} else if (local2459 < 100) {
						local2385 = 16711935 - (local2459 - 50) * 327680;
					} else if (local2459 < 150) {
						local2385 = local2459 * 327680 + 255 - (local2459 + -100) * 5 - 32768000;
					}
				}
				if (Static576.anIntArray633[local165] == 11) {
					local2459 = 150 - Static576.anIntArray636[local165];
					if (local2459 < 50) {
						local2385 = 16777215 - local2459 * 327685;
					} else if (local2459 < 100) {
						local2385 = local2459 * 327685 + 65280 - 16384250;
					} else if (local2459 < 150) {
						local2385 = 49545215 - local2459 * 327680;
					}
				}
				local2459 = local2385 | 0xFF000000;
				if (Static576.anIntArray637[local165] == 0) {
					Static51.aClass19_4.method6328(arg3 + local1006, local2459, local2349, -16777216, arg2 + local202);
					local320 -= local248 >> 1;
					local1096 -= local248 >> 1;
				}
				if (Static576.anIntArray637[local165] == 1) {
					local320 -= local248 >> 1;
					local1096 -= local248 >> 1;
					local323 -= 5;
					Static51.aClass19_4.method6334(local202 + arg2, Static61.anInt1167, local1006 + arg3, local2459, local2349);
					local2378 += 5;
				}
				if (Static576.anIntArray637[local165] == 2) {
					local2378 += 5;
					local323 -= 5;
					Static51.aClass19_4.method6329(arg2 + local202, local2459, arg3 + local1006, Static61.anInt1167, local2349);
					local320 -= (local248 >> 1) + 5;
					local1096 -= (local248 >> 1) - 5;
				}
				if (Static576.anIntArray637[local165] == 3) {
					local320 -= local248 >> 1;
					local1096 -= local248 >> 1;
					local323 -= 7;
					local2378 += 7;
					Static51.aClass19_4.method6323(arg2 + local202, local2349, 150 - Static576.anIntArray636[local165], local2459, arg3 + local1006, Static61.anInt1167);
				}
				@Pc(2768) int local2768;
				if (Static576.anIntArray637[local165] == 4) {
					local2768 = (150 - Static576.anIntArray636[local165]) * (Static173.aClass151_4.method3323(local2349) + 100) / 150;
					Static546.aClass132_13.T(local202 + arg2 - 50, arg3, local202 + arg2 + 50, arg3 - -arg0);
					Static51.aClass19_4.method6336(local1006 + arg3, local2459, -16777216, local202 + arg2 + 50 - local2768, local2349);
					local320 += 50 - local2768;
					local1096 += 50 - local2768;
					Static546.aClass132_13.KA(arg2, arg3, arg2 + arg1, arg3 + arg0);
				}
				if (Static576.anIntArray637[local165] == 5) {
					local2768 = 150 - Static576.anIntArray636[local165];
					local1141 = 0;
					if (local2768 < 25) {
						local1141 = local2768 - 25;
					} else if (local2768 > 125) {
						local1141 = local2768 - 125;
					}
					local1143 = Static173.aClass151_4.anInt3921 + Static173.aClass151_4.anInt3915;
					Static546.aClass132_13.T(arg2, local1006 + arg3 - local1143 - 1, arg1 + arg2, arg3 + local1006 + 5);
					local323 += local1141;
					local2378 += local1141;
					local320 -= local248 >> 1;
					Static51.aClass19_4.method6328(local1141 + local1006 + arg3, local2459, local2349, -16777216, local202 + arg2);
					local1096 -= local248 >> 1;
					Static546.aClass132_13.KA(arg2, arg3, arg2 + arg1, arg0 + arg3);
				}
			} else {
				local320 -= local248 >> 1;
				Static51.aClass19_4.method6328(arg3 + local1006, -256, local2349, -16777216, local202 + arg2);
				local1096 -= local248 >> 1;
			}
			Static629.method8681(local1096 + 1, local323, local2378 + 1, local320);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!gs;)V")
	public static void method9005(@OriginalArg(1) Class6_Sub23_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static96.anInt1738; local9++) {
			@Pc(15) int local15 = Static224.anIntArray215[local9];
			@Pc(19) Class2_Sub1_Sub1_Sub3_Sub1 local19 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local15];
			@Pc(25) int local25 = arg0.method8374();
			if ((local25 & 0x40) != 0) {
				local25 += arg0.method8374() << 8;
			}
			if ((local25 & 0x800) != 0) {
				local25 += arg0.method8374() << 16;
			}
			Static618.method8528(local19, local25, arg0, local15);
		}
	}
}
