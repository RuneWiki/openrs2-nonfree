import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_87 = new Class181(14, -1);

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "Z")
	public static boolean aBoolean764 = false;

	@OriginalMember(owner = "client!uea", name = "s", descriptor = "I")
	public static int anInt9391 = 0;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	public static void method8044() {
		Static94.aBoolean828 = true;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method8046(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(18) String local18 = arg0[arg1];
			return local18 == null ? "null" : local18.toString();
		} else {
			@Pc(29) int local29 = arg1 + arg2;
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = arg1; local33 < local29; local33++) {
				@Pc(39) String local39 = arg0[local33];
				if (local39 == null) {
					local31 += 4;
				} else {
					local31 += local39.length();
				}
			}
			@Pc(62) StringBuffer local62 = new StringBuffer(local31);
			for (@Pc(69) int local69 = arg1; local69 < local29; local69++) {
				@Pc(75) String local75 = arg0[local69];
				if (local75 == null) {
					local62.append("null");
				} else {
					local62.append(local75);
				}
			}
			return local62.toString();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZIIIIII)V")
	public static void method8047(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(13) int local13 = Static227.anInt3948;
		@Pc(15) int[] local15 = Static467.anIntArray632;
		Static53.anInt815 = 0;
		@Pc(183) int local183;
		@Pc(216) int local216;
		@Pc(262) int local262;
		@Pc(339) int local339;
		@Pc(342) int local342;
		@Pc(1144) int local1144;
		@Pc(1190) int local1190;
		@Pc(1192) int local1192;
		@Pc(442) int local442;
		@Pc(1052) int local1052;
		@Pc(569) int local569;
		for (@Pc(19) int local19 = 0; local19 < local13 + Static58.anInt926; local19++) {
			@Pc(23) Class271 local23 = null;
			@Pc(32) Class14_Sub1_Sub1_Sub3 local32;
			if (local19 < local13) {
				local32 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local15[local19]];
			} else {
				local32 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) Static191.anIntArray287[local19 - local13])).aClass14_Sub1_Sub1_Sub3_Sub2_1;
				local23 = ((Class14_Sub1_Sub1_Sub3_Sub2) local32).aClass271_1;
				if (local23.anIntArray591 != null) {
					local23 = local23.method6476(Static564.aClass304_1);
					if (local23 == null) {
						continue;
					}
				}
			}
			if (local32.anInt2906 >= 0 && (Static92.anInt9992 == local32.anInt2931 || Static593.aClass14_Sub1_Sub1_Sub3_Sub1_1.aByte125 == local32.aByte125)) {
				Static276.method7948(local32, local32.method2518(), arg2 >> 1, arg0 >> 1);
				if (Static515.anIntArray676[0] >= 0) {
					if (local32.aString50 != null && (local13 <= local19 || Static111.anInt1765 == 0 || Static111.anInt1765 == 3 || Static111.anInt1765 == 1 && Static14.method404(((Class14_Sub1_Sub1_Sub3_Sub1) local32).aString42)) && Static53.anInt815 < Static585.anInt9566) {
						Static585.anIntArray758[Static53.anInt815] = Static457.aClass298_11.method6965(local32.aString50) / 2;
						Static585.anIntArray757[Static53.anInt815] = Static515.anIntArray676[0];
						Static585.anIntArray759[Static53.anInt815] = Static515.anIntArray676[1];
						Static585.anIntArray762[Static53.anInt815] = local32.anInt2940;
						Static585.anIntArray760[Static53.anInt815] = local32.anInt2944;
						Static585.anIntArray761[Static53.anInt815] = local32.anInt2957;
						Static585.aStringArray40[Static53.anInt815] = local32.aString50;
						Static53.anInt815++;
					}
					local183 = Static515.anIntArray676[1] + arg3;
					@Pc(247) Class44[] local247;
					@Pc(254) Class176[] local254;
					@Pc(312) Class44 local312;
					if (local32.aBoolean255 || Static235.anInt3998 >= local32.anInt2910) {
						local183 -= Math.max(Static457.aClass298_11.anInt8042, Static61.aClass44Array5[0].method5320());
					} else {
						@Pc(198) byte local198 = 1;
						if (local19 < local13) {
							@Pc(211) Class14_Sub1_Sub1_Sub3_Sub1 local211 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local15[local19]];
							local216 = local32.method2519().anInt7963;
							if (local211.aBoolean238) {
								local198 = 2;
							}
						} else {
							local216 = local23.anInt7336;
							if (local216 == -1) {
								local216 = local32.method2519().anInt7963;
							}
						}
						@Pc(237) Class44[] local237 = Static61.aClass44Array5;
						if (local216 != -1) {
							local247 = (Class44[]) Static648.aClass293_78.method6921((long) local216);
							if (local247 == null) {
								local254 = Static654.method4059(Static488.aClass384_112, local216);
								if (local254 != null) {
									local247 = new Class44[local254.length];
									for (local262 = 0; local262 < local254.length; local262++) {
										local247[local262] = Static485.aClass126_17.method6994(local254[local262], true);
									}
									Static648.aClass293_78.method6925((long) local216, local247);
								}
							}
							if (local247 != null && local247.length >= 2) {
								local237 = local247;
							}
						}
						if (local237.length <= local198) {
							local198 = 1;
						}
						@Pc(308) Class44 local308 = local237[0];
						local312 = local237[local198];
						local183 -= Math.max(Static457.aClass298_11.anInt8042, local308.method5320());
						local262 = Static515.anIntArray676[0] + arg1 - (local308.method5319() >> 1);
						local339 = local308.method5319() * local32.anInt2926 / 255;
						local342 = local308.method5320();
						if (local32.anInt2926 > 0 && local339 < 2) {
							local339 = 2;
						}
						local308.method5312(local262, local183);
						Static485.aClass126_17.T(local262, local183, local262 + local339, local342 + local183);
						local312.method5312(local262, local183);
						Static485.aClass126_17.KA(arg1, arg3, arg0 + arg1, arg3 + arg2);
						Static354.method5603(local308.method5313() + local262, local262, local342 + local183, local183);
					}
					local183 -= 2;
					if (!local32.aBoolean255) {
						@Pc(423) Class44 local423;
						@Pc(432) Class44 local432;
						if (local32.anInt2965 > Static235.anInt3998) {
							local423 = Static449.aClass44Array14[local32.aBoolean256 ? 2 : 0];
							local432 = Static449.aClass44Array14[local32.aBoolean256 ? 3 : 1];
							if (local32 instanceof Class14_Sub1_Sub1_Sub3_Sub2) {
								local442 = local23.anInt7352;
								if (local442 == -1) {
									local442 = local32.method2519().anInt7998;
								}
							} else {
								local442 = local32.method2519().anInt7998;
							}
							if (local442 != -1) {
								local247 = (Class44[]) Static407.aClass293_47.method6921((long) local442);
								if (local247 == null) {
									local254 = Static654.method4059(Static488.aClass384_112, local442);
									if (local254 != null) {
										local247 = new Class44[local254.length];
										for (local262 = 0; local262 < local254.length; local262++) {
											local247[local262] = Static485.aClass126_17.method6994(local254[local262], true);
										}
										Static407.aClass293_47.method6925((long) local442, local247);
									}
								}
								if (local247 != null && local247.length == 4) {
									local432 = local247[local32.aBoolean256 ? 3 : 1];
									local423 = local247[local32.aBoolean256 ? 2 : 0];
								}
							}
							@Pc(535) int local535 = local32.anInt2965 - Static235.anInt3998;
							if (local535 > local32.anInt2908) {
								local535 -= local32.anInt2908;
								local262 = local32.anInt2934 == 0 ? 0 : (local32.anInt2927 - local535) / local32.anInt2934 * local32.anInt2934;
								local569 = local423.method5319() * local262 / local32.anInt2927;
							} else {
								local569 = local423.method5319();
							}
							local262 = local423.method5320();
							local183 -= local262;
							local339 = Static515.anIntArray676[0] + arg1 - (local423.method5319() >> 1);
							local423.method5312(local339, local183);
							Static485.aClass126_17.T(local339, local183, local569 + local339, local262 + local183);
							local432.method5312(local339, local183);
							Static485.aClass126_17.KA(arg1, arg3, arg1 + arg0, arg3 + arg2);
							Static354.method5603(local339 + local423.method5313(), local339, local183 + local262, local183);
							local183 -= 2;
						}
						if (local13 > local19) {
							@Pc(712) Class14_Sub1_Sub1_Sub3_Sub1 local712 = (Class14_Sub1_Sub1_Sub3_Sub1) local32;
							if (local712.anInt2734 != -1) {
								local183 -= 25;
								local432 = Static426.aClass44Array12[local712.anInt2734];
								local432.method5312(arg1 + Static515.anIntArray676[0] - 12, local183);
								Static354.method5603(arg1 + Static515.anIntArray676[0] + local432.method5313() - 12, arg1 - -Static515.anIntArray676[0] - 12, local183 + local432.method5325(), local183);
								local183 -= 2;
							}
							if (local712.anInt2733 != -1) {
								local183 -= 25;
								local432 = Static468.aClass44Array15[local712.anInt2733];
								local432.method5312(Static515.anIntArray676[0] + arg1 - 12, local183);
								Static354.method5603(Static515.anIntArray676[0] + arg1 + local432.method5313() - 12, Static515.anIntArray676[0] + -12 + arg1, local183 + local432.method5325(), local183);
								local183 -= 2;
							}
						} else if (local23.anInt7333 >= 0 && Static468.aClass44Array15.length > local23.anInt7333) {
							local183 -= 25;
							local423 = Static468.aClass44Array15[local23.anInt7333];
							local423.method5312(arg1 + Static515.anIntArray676[0] - (local423.method5319() >> 1), local183);
							Static354.method5603(arg1 + Static515.anIntArray676[0] - (local423.method5319() >> 1) + local423.method5313(), Static515.anIntArray676[0] + arg1 + -(local423.method5319() >> 1), local183 + local423.method5325(), local183);
							local183 -= 2;
						}
					}
					@Pc(816) Class16[] local816;
					@Pc(824) Class16 local824;
					if (!(local32 instanceof Class14_Sub1_Sub1_Sub3_Sub1)) {
						local216 = 0;
						local816 = Static568.aClass16Array1;
						for (local442 = 0; local442 < local816.length; local442++) {
							local824 = local816[local442];
							if (local824 != null && local824.anInt407 == 1 && Static191.anIntArray287[local19 - local13] == local824.anInt403) {
								local312 = Static619.aClass44Array19[local824.anInt405];
								if (local216 < local312.method5320()) {
									local216 = local312.method5320();
								}
								if (Static235.anInt3998 % 20 < 10) {
									local312.method5312(arg1 + Static515.anIntArray676[0] - 12, -local312.method5320() + local183);
									Static354.method5603(arg1 + Static515.anIntArray676[0] + local312.method5313() - 12, arg1 + -12 + Static515.anIntArray676[0], local183 - local312.method5320() + local312.method5325(), local183 - local312.method5320());
								}
							}
						}
						if (local216 > 0) {
						}
					} else if (local19 >= 0) {
						local216 = 0;
						local816 = Static568.aClass16Array1;
						for (local442 = 0; local442 < local816.length; local442++) {
							local824 = local816[local442];
							if (local824 != null && local824.anInt407 == 10 && local15[local19] == local824.anInt403) {
								local312 = Static619.aClass44Array19[local824.anInt405];
								if (local312.method5320() > local216) {
									local216 = local312.method5320();
								}
								local312.method5312(Static515.anIntArray676[0] + arg1 - 12, -local312.method5320() + local183);
								Static354.method5603(arg1 + Static515.anIntArray676[0] + local312.method5313() - 12, Static515.anIntArray676[0] + arg1 - 12, local183 - local312.method5320() + local312.method5325(), local183 + -local312.method5320());
							}
						}
						if (local216 > 0) {
						}
					}
					for (local216 = 0; local216 < Static53.anInt818; local216++) {
						local1052 = local32.anIntArray247[local216];
						local442 = local32.anIntArray250[local216];
						@Pc(1059) Class86 local1059 = null;
						local569 = 0;
						if (local442 >= 0) {
							if (local1052 <= Static235.anInt3998) {
								continue;
							}
							local1059 = Static39.aClass9_1.method169(local32.anIntArray250[local216]);
							local569 = local1059.anInt1801;
						} else if (local1052 < 0) {
							continue;
						}
						local262 = local32.anIntArray246[local216];
						@Pc(1094) Class86 local1094 = null;
						if (local262 >= 0) {
							local1094 = Static39.aClass9_1.method169(local262);
						}
						if (Static235.anInt3998 >= local1052 - local569) {
							local342 = local32.anIntArray248[local216];
							if (local342 >= 0) {
								local32.anInt2910 = Static235.anInt3998 + 300;
								local32.anInt2926 = local342;
								local32.anIntArray248[local216] = -1;
							}
							if (local1059 == null) {
								local32.anIntArray247[local216] = -1;
							} else {
								local1144 = local32.method2518() / 2;
								Static276.method7948(local32, local1144, arg2 >> 1, arg0 >> 1);
								if (Static515.anIntArray676[0] > -1) {
									Static515.anIntArray676[0] += Static318.anIntArray399[local216];
									Static515.anIntArray676[1] += Static180.anIntArray276[local216];
									local1190 = 0;
									local1192 = 0;
									@Pc(1194) int local1194 = 0;
									@Pc(1196) int local1196 = 0;
									@Pc(1198) int local1198 = 0;
									@Pc(1200) int local1200 = 0;
									@Pc(1202) int local1202 = 0;
									@Pc(1204) int local1204 = 0;
									@Pc(1206) Class44 local1206 = null;
									@Pc(1208) Class44 local1208 = null;
									@Pc(1210) Class44 local1210 = null;
									@Pc(1212) Class44 local1212 = null;
									@Pc(1214) int local1214 = 0;
									@Pc(1216) int local1216 = 0;
									@Pc(1218) int local1218 = 0;
									@Pc(1220) int local1220 = 0;
									@Pc(1222) int local1222 = 0;
									@Pc(1224) int local1224 = 0;
									@Pc(1226) int local1226 = 0;
									@Pc(1228) int local1228 = 0;
									@Pc(1230) int local1230 = 0;
									@Pc(1235) Class44 local1235 = local1059.method1662(Static485.aClass126_17);
									@Pc(1243) int local1243;
									if (local1235 != null) {
										local1190 = local1235.method5319();
										local1243 = local1235.method5320();
										local1235.method5323(Static12.anIntArray18);
										if (local1243 > 0) {
											local1230 = local1243;
										}
										local1198 = Static12.anIntArray18[0];
									}
									@Pc(1260) Class44 local1260 = local1059.method1664(Static485.aClass126_17);
									if (local1260 != null) {
										local1192 = local1260.method5319();
										local1243 = local1260.method5320();
										if (local1243 > local1230) {
											local1230 = local1243;
										}
										local1260.method5323(Static12.anIntArray18);
										local1200 = Static12.anIntArray18[0];
									}
									@Pc(1285) Class44 local1285 = local1059.method1665(Static485.aClass126_17);
									if (local1285 != null) {
										local1194 = local1285.method5319();
										local1243 = local1285.method5320();
										local1285.method5323(Static12.anIntArray18);
										if (local1230 < local1243) {
											local1230 = local1243;
										}
										local1202 = Static12.anIntArray18[0];
									}
									@Pc(1314) Class44 local1314 = local1059.method1669(Static485.aClass126_17);
									if (local1314 != null) {
										local1196 = local1314.method5319();
										local1243 = local1314.method5320();
										local1314.method5323(Static12.anIntArray18);
										if (local1230 < local1243) {
											local1230 = local1243;
										}
										local1204 = Static12.anIntArray18[0];
									}
									if (local1094 != null) {
										local1206 = local1094.method1662(Static485.aClass126_17);
										if (local1206 != null) {
											local1214 = local1206.method5319();
											local1243 = local1206.method5320();
											if (local1230 < local1243) {
												local1230 = local1243;
											}
											local1206.method5323(Static12.anIntArray18);
											local1222 = Static12.anIntArray18[0];
										}
										local1208 = local1094.method1664(Static485.aClass126_17);
										if (local1208 != null) {
											local1216 = local1208.method5319();
											local1243 = local1208.method5320();
											if (local1243 > local1230) {
												local1230 = local1243;
											}
											local1208.method5323(Static12.anIntArray18);
											local1224 = Static12.anIntArray18[0];
										}
										local1210 = local1094.method1665(Static485.aClass126_17);
										if (local1210 != null) {
											local1218 = local1210.method5319();
											local1243 = local1210.method5320();
											local1210.method5323(Static12.anIntArray18);
											if (local1243 > local1230) {
												local1230 = local1243;
											}
											local1226 = Static12.anIntArray18[0];
										}
										local1212 = local1094.method1669(Static485.aClass126_17);
										if (local1212 != null) {
											local1220 = local1212.method5319();
											local1243 = local1212.method5320();
											if (local1243 > local1230) {
												local1230 = local1243;
											}
											local1212.method5323(Static12.anIntArray18);
											local1228 = Static12.anIntArray18[0];
										}
									}
									@Pc(1454) Class6 local1454 = Static288.aClass6_8;
									@Pc(1456) Class6 local1456 = Static288.aClass6_8;
									@Pc(1458) Class298 local1458 = Static363.aClass298_7;
									local1243 = local1059.anInt1803;
									@Pc(1463) Class298 local1463 = Static363.aClass298_7;
									@Pc(1471) Class6 local1471;
									@Pc(1476) Class298 local1476;
									if (local1243 >= 0) {
										local1471 = Static330.method5145(local1243, Static485.aClass126_17, true);
										local1476 = Static220.method3394(Static485.aClass126_17, local1243);
										if (local1471 != null && local1476 != null) {
											local1454 = local1471;
											local1458 = local1476;
										}
									}
									if (local1094 != null) {
										local1243 = local1094.anInt1803;
										if (local1243 >= 0) {
											local1471 = Static330.method5145(local1243, Static485.aClass126_17, true);
											local1476 = Static220.method3394(Static485.aClass126_17, local1243);
											if (local1471 != null && local1476 != null) {
												local1456 = local1471;
												local1463 = local1476;
											}
										}
									}
									@Pc(1514) String local1514 = null;
									@Pc(1518) int local1518 = 0;
									@Pc(1526) String local1526 = local1059.method1668(local32.anIntArray251[local216]);
									@Pc(1531) int local1531 = local1458.method6965(local1526);
									if (local1094 != null) {
										local1514 = local1094.method1668(local32.anIntArray249[local216]);
										local1518 = local1463.method6965(local1514);
									}
									@Pc(1548) int local1548 = 0;
									if (local1192 > 0) {
										local1548 = local1531 / local1192 + 1;
									}
									@Pc(1558) int local1558 = 0;
									if (local1094 != null && local1216 > 0) {
										local1558 = local1518 / local1216 + 1;
									}
									@Pc(1573) int local1573 = 0;
									if (local1190 > 0) {
										local1573 = local1190;
									}
									local1573 += 2;
									@Pc(1584) int local1584 = local1573;
									if (local1194 > 0) {
										local1573 += local1194;
									}
									@Pc(1595) int local1595 = local1573;
									@Pc(1597) int local1597 = local1573;
									@Pc(1606) int local1606;
									if (local1192 > 0) {
										local1606 = local1192 * local1548;
										local1597 = local1573 + (local1606 - local1531) / 2;
										local1573 += local1606;
									} else {
										local1573 += local1531;
									}
									local1606 = local1573;
									if (local1196 > 0) {
										local1573 += local1196;
									}
									@Pc(1635) int local1635 = 0;
									@Pc(1637) int local1637 = 0;
									@Pc(1639) int local1639 = 0;
									@Pc(1641) int local1641 = 0;
									@Pc(1643) int local1643 = 0;
									@Pc(1676) int local1676;
									if (local1094 != null) {
										local1573 += 2;
										local1635 = local1573;
										if (local1214 > 0) {
											local1573 += local1214;
										}
										local1573 += 2;
										local1637 = local1573;
										if (local1218 > 0) {
											local1573 += local1218;
										}
										local1639 = local1573;
										local1643 = local1573;
										if (local1216 > 0) {
											local1676 = local1558 * local1216;
											local1643 = local1573 + (local1676 - local1518) / 2;
											local1573 += local1676;
										} else {
											local1573 += local1518;
										}
										local1641 = local1573;
										if (local1220 > 0) {
											local1573 += local1220;
										}
									}
									local1676 = local32.anIntArray247[local216] - Static235.anInt3998;
									@Pc(1725) int local1725 = local1059.anInt1807 - local1676 * local1059.anInt1807 / local1059.anInt1801;
									@Pc(1737) int local1737 = local1059.anInt1800 * local1676 / local1059.anInt1801 - local1059.anInt1800;
									@Pc(1751) int local1751 = Static515.anIntArray676[0] + arg1 + local1725 - (local1573 >> 1);
									@Pc(1761) int local1761 = local1737 + Static515.anIntArray676[1] + arg3 - 12;
									@Pc(1763) int local1763 = local1761;
									@Pc(1768) int local1768 = local1761 + local1230;
									@Pc(1776) int local1776 = local1761 + local1059.anInt1813 + 15;
									@Pc(1782) int local1782 = local1776 - local1458.anInt8042;
									@Pc(1787) int local1787 = local1458.anInt8040 + local1776;
									if (local1761 > local1782) {
										local1763 = local1782;
									}
									if (local1768 < local1787) {
										local1768 = local1787;
									}
									@Pc(1803) int local1803 = 0;
									@Pc(1818) int local1818;
									@Pc(1824) int local1824;
									if (local1094 != null) {
										local1803 = local1094.anInt1813 + local1761 + 15;
										local1818 = local1803 - local1463.anInt8042;
										local1824 = local1803 + local1463.anInt8040;
										if (local1763 > local1818) {
											local1763 = local1818;
										}
										if (local1768 < local1824) {
											local1768 = local1824;
										}
									}
									local1818 = 255;
									if (local1059.anInt1812 >= 0) {
										local1818 = (local1676 << 8) / (local1059.anInt1801 - local1059.anInt1812);
									}
									if (local1818 >= 0 && local1818 < 255) {
										local1824 = local1818 << 24;
										@Pc(1870) int local1870 = local1824 | 0xFFFFFF;
										if (local1235 != null) {
											local1235.method5322(local1751 - local1198, local1761, 0, local1870, 1);
										}
										if (local1285 != null) {
											local1285.method5322(local1751 + local1584 - local1202, local1761, 0, local1870, 1);
										}
										@Pc(1903) int local1903;
										if (local1260 != null) {
											for (local1903 = 0; local1903 < local1548; local1903++) {
												local1260.method5322(local1595 + local1751 + local1192 * local1903 - local1200, local1761, 0, local1870, 1);
											}
										}
										if (local1314 != null) {
											local1314.method5322(local1751 + local1606 - local1204, local1761, 0, local1870, 1);
										}
										local1454.method7214(local1597 + local1751, local1526, local1776, 0, local1824 | local1059.anInt1815);
										if (local1094 != null) {
											if (local1206 != null) {
												local1206.method5322(local1751 + local1635 - local1222, local1761, 0, local1870, 1);
											}
											if (local1210 != null) {
												local1210.method5322(local1637 + local1751 - local1226, local1761, 0, local1870, 1);
											}
											if (local1208 != null) {
												for (local1903 = 0; local1903 < local1558; local1903++) {
													local1208.method5322(local1216 * local1903 + local1751 + local1639 - local1224, local1761, 0, local1870, 1);
												}
											}
											if (local1212 != null) {
												local1212.method5322(local1751 + local1641 - local1228, local1761, 0, local1870, 1);
											}
											local1456.method7214(local1643 + local1751, local1514, local1803, 0, local1094.anInt1815 | local1824);
										}
									} else {
										if (local1235 != null) {
											local1235.method5312(local1751 - local1198, local1761);
										}
										if (local1285 != null) {
											local1285.method5312(local1751 + local1584 - local1202, local1761);
										}
										if (local1260 != null) {
											for (local1824 = 0; local1824 < local1548; local1824++) {
												local1260.method5312(local1192 * local1824 + local1751 + local1595 - local1200, local1761);
											}
										}
										if (local1314 != null) {
											local1314.method5312(local1606 + local1751 - local1204, local1761);
										}
										local1454.method7214(local1597 + local1751, local1526, local1776, 0, local1059.anInt1815 | 0xFF000000);
										if (local1094 != null) {
											if (local1206 != null) {
												local1206.method5312(local1635 + local1751 - local1222, local1761);
											}
											if (local1210 != null) {
												local1210.method5312(local1637 + local1751 - local1226, local1761);
											}
											if (local1208 != null) {
												for (local1824 = 0; local1824 < local1558; local1824++) {
													local1208.method5312(local1824 * local1216 + local1751 + local1639 - local1224, local1761);
												}
											}
											if (local1212 != null) {
												local1212.method5312(local1641 + local1751 - local1228, local1761);
											}
											local1456.method7214(local1751 + local1643, local1514, local1803, 0, local1094.anInt1815 | 0xFF000000);
										}
									}
									Static354.method5603(local1573 + local1751, local1751, local1768 + 1, local1763);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2228) int local2228;
		for (@Pc(2222) int local2222 = 0; local2222 < Static267.anInt4433; local2222++) {
			local2228 = Static196.anIntArray290[local2222];
			@Pc(2237) Class14_Sub1_Sub1_Sub3 local2237;
			if (local2228 < 2048) {
				local2237 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local2228];
			} else {
				local2237 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) (local2228 - 2048))).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			}
			local216 = Static390.anIntArray532[local2222];
			@Pc(2262) Class14_Sub1_Sub1_Sub3 local2262;
			if (local216 < 2048) {
				local2262 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local216];
			} else {
				local2262 = ((Class5_Sub13) Static51.aClass81_11.method1599((long) (local216 - 2048))).aClass14_Sub1_Sub1_Sub3_Sub2_1;
			}
			Static53.method849(local2262, arg0, --local2237.anInt2962, arg1, arg3, local2237, arg2);
		}
		local2228 = Static457.aClass298_11.anInt8042 + Static457.aClass298_11.anInt8040 + 2;
		for (local183 = 0; local183 < Static53.anInt815; local183++) {
			local216 = Static585.anIntArray757[local183];
			local1052 = Static585.anIntArray759[local183];
			local442 = Static585.anIntArray758[local183];
			@Pc(2325) boolean local2325 = true;
			while (local2325) {
				local2325 = false;
				for (local569 = 0; local569 < local183; local569++) {
					if (local1052 + 2 > -local2228 + Static585.anIntArray759[local569] && Static585.anIntArray759[local569] + 2 > -local2228 + local1052 && local216 - local442 < Static585.anIntArray758[local569] + Static585.anIntArray757[local569] && Static585.anIntArray757[local569] - Static585.anIntArray758[local569] < local216 + local442 && Static585.anIntArray759[local569] - local2228 < local1052) {
						local1052 = Static585.anIntArray759[local569] - local2228;
						local2325 = true;
					}
				}
			}
			Static585.anIntArray759[local183] = local1052;
			@Pc(2424) String local2424 = Static585.aStringArray40[local183];
			local262 = Static457.aClass298_11.method6965(local2424);
			local339 = local216 + arg1;
			local342 = local1052 + arg3 - Static457.aClass298_11.anInt8042;
			local1144 = local339 + local262;
			@Pc(2452) int local2452 = arg3 + local1052 + Static457.aClass298_11.anInt8040;
			if (Static122.anInt1976 == 0) {
				@Pc(2456) int local2456 = 16776960;
				if (Static585.anIntArray762[local183] < 6) {
					local2456 = Static188.anIntArray835[Static585.anIntArray762[local183]];
				}
				if (Static585.anIntArray762[local183] == 6) {
					local2456 = Static92.anInt9992 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static585.anIntArray762[local183] == 7) {
					local2456 = Static92.anInt9992 % 20 >= 10 ? 65535 : 255;
				}
				if (Static585.anIntArray762[local183] == 8) {
					local2456 = Static92.anInt9992 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2531) int local2531;
				if (Static585.anIntArray762[local183] == 9) {
					local2531 = 150 - Static585.anIntArray761[local183];
					if (local2531 < 50) {
						local2456 = local2531 * 1280 + 16711680;
					} else if (local2531 < 100) {
						local2456 = 16384000 + 16776960 - local2531 * 327680;
					} else if (local2531 < 150) {
						local2456 = (local2531 - 100) * 5 + 65280;
					}
				}
				if (Static585.anIntArray762[local183] == 10) {
					local2531 = 150 - Static585.anIntArray761[local183];
					if (local2531 < 50) {
						local2456 = local2531 * 5 + 16711680;
					} else if (local2531 < 100) {
						local2456 = 16711935 - (local2531 - 50) * 327680;
					} else if (local2531 < 150) {
						local2456 = local2531 * 327680 + 255 - (local2531 + -100) * 5 - 32768000;
					}
				}
				if (Static585.anIntArray762[local183] == 11) {
					local2531 = 150 - Static585.anIntArray761[local183];
					if (local2531 < 50) {
						local2456 = 16777215 - local2531 * 327685;
					} else if (local2531 < 100) {
						local2456 = (local2531 - 50) * 327685 + 65280;
					} else if (local2531 < 150) {
						local2456 = 49545215 - local2531 * 327680;
					}
				}
				local2531 = local2456 | 0xFF000000;
				if (Static585.anIntArray760[local183] == 0) {
					Static471.aClass6_12.method7199(arg1 + local216, local2424, arg3 + local1052, local2531, -16777216);
					local339 -= local262 >> 1;
					local1144 -= local262 >> 1;
				}
				if (Static585.anIntArray760[local183] == 1) {
					Static471.aClass6_12.method7200(Static92.anInt9992, arg1 + local216, local2424, arg3 + local1052, local2531);
					local339 -= local262 >> 1;
					local1144 -= local262 >> 1;
					local342 -= 5;
					local2452 += 5;
				}
				if (Static585.anIntArray760[local183] == 2) {
					local342 -= 5;
					Static471.aClass6_12.method7207(arg3 + local1052, local2424, arg1 + local216, local2531, Static92.anInt9992);
					local1144 -= (local262 >> 1) - 5;
					local2452 += 5;
					local339 -= (local262 >> 1) + 5;
				}
				if (Static585.anIntArray760[local183] == 3) {
					local342 -= 7;
					local339 -= local262 >> 1;
					local1144 -= local262 >> 1;
					Static471.aClass6_12.method7220(local216 + arg1, local2531, Static92.anInt9992, 150 - Static585.anIntArray761[local183], arg3 + local1052, local2424);
					local2452 += 7;
				}
				@Pc(2836) int local2836;
				if (Static585.anIntArray760[local183] == 4) {
					local2836 = (150 - Static585.anIntArray761[local183]) * (Static457.aClass298_11.method6965(local2424) + 100) / 150;
					Static485.aClass126_17.T(arg1 + local216 - 50, arg3, arg1 + local216 + 50, arg2 + arg3);
					local1144 += 50 - local2836;
					local339 += 50 - local2836;
					Static471.aClass6_12.method7214(local216 + arg1 + 50 - local2836, local2424, local1052 + arg3, -16777216, local2531);
					Static485.aClass126_17.KA(arg1, arg3, arg1 + arg0, arg2 + arg3);
				}
				if (Static585.anIntArray760[local183] == 5) {
					local2836 = 150 - Static585.anIntArray761[local183];
					local1190 = 0;
					if (local2836 < 25) {
						local1190 = local2836 - 25;
					} else if (local2836 > 125) {
						local1190 = local2836 - 125;
					}
					local1192 = Static457.aClass298_11.anInt8042 + Static457.aClass298_11.anInt8040;
					Static485.aClass126_17.T(arg1, local1052 + arg3 - local1192 - 1, arg0 + arg1, arg3 + local1052 + 5);
					local1144 -= local262 >> 1;
					local342 += local1190;
					local2452 += local1190;
					Static471.aClass6_12.method7199(local216 + arg1, local2424, local1190 + arg3 + local1052, local2531, -16777216);
					local339 -= local262 >> 1;
					Static485.aClass126_17.KA(arg1, arg3, arg0 + arg1, arg2 + arg3);
				}
			} else {
				Static471.aClass6_12.method7199(local216 + arg1, local2424, arg3 + local1052, -256, -16777216);
				local339 -= local262 >> 1;
				local1144 -= local262 >> 1;
			}
			Static354.method5603(local1144 + 1, local339, local2452 + 1, local342);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!kn;)V")
	public static void method8049(@OriginalArg(1) Class14_Sub1_Sub1_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt2912 - Static235.anInt3998;
		@Pc(21) int local21 = arg0.anInt2911 * 512 + arg0.method2509() * 256;
		@Pc(38) int local38 = arg0.anInt2920 * 512 + arg0.method2509() * 256;
		arg0.anInt9315 += (local38 - arg0.anInt9315) / local9;
		arg0.anInt9317 += (local21 - arg0.anInt9317) / local9;
		arg0.anInt2971 = 0;
		if (arg0.anInt2943 == 0) {
			arg0.method2507(8192);
		}
		if (arg0.anInt2943 == 1) {
			arg0.method2507(12288);
		}
		if (arg0.anInt2943 == 2) {
			arg0.method2507(0);
		}
		if (arg0.anInt2943 == 3) {
			arg0.method2507(4096);
		}
	}
}
