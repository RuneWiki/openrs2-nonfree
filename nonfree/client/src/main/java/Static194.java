import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gka", name = "k", descriptor = "Lclient!bt;")
	public static Class34 aClass34_48;

	@OriginalMember(owner = "client!gka", name = "i", descriptor = "J")
	public static long aLong106 = 20000000L;

	@OriginalMember(owner = "client!gka", name = "j", descriptor = "[I")
	public static final int[] anIntArray241 = new int[4096];

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIIIIII)V")
	public static void method3018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(15) int local15 = Static518.anInt10290;
		Static67.anInt1443 = 0;
		@Pc(19) int[] local19 = Static489.anIntArray519;
		@Pc(188) int local188;
		@Pc(205) int local205;
		@Pc(258) int local258;
		@Pc(334) int local334;
		@Pc(337) int local337;
		@Pc(1137) int local1137;
		@Pc(1183) int local1183;
		@Pc(1185) int local1185;
		@Pc(433) int local433;
		@Pc(1047) int local1047;
		@Pc(571) int local571;
		for (@Pc(21) int local21 = 0; local21 < Static105.anInt2131 + local15; local21++) {
			@Pc(25) Class345 local25 = null;
			@Pc(41) Class3_Sub1_Sub2_Sub2 local41;
			if (local21 >= local15) {
				local41 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local21 - local15])).aClass3_Sub1_Sub2_Sub2_Sub2_2;
				local25 = ((Class3_Sub1_Sub2_Sub2_Sub2) local41).aClass345_1;
				if (local25.anIntArray624 != null) {
					local25 = local25.method7529(Static526.aClass293_1);
					if (local25 == null) {
						continue;
					}
				}
			} else {
				local41 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local19[local21]];
			}
			if (local41.lb >= 0 && (Static472.anInt7502 == local41.anInt9958 || local41.aByte141 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141)) {
				Static648.method8645(arg1 >> 1, arg2 >> 1, local41, local41.method8520());
				if (Static519.anIntArray552[0] >= 0) {
					if (local41.aString119 != null && (local15 <= local21 || Static586.anInt9032 == 0 || Static586.anInt9032 == 3 || Static586.anInt9032 == 1 && Static74.method1578(((Class3_Sub1_Sub2_Sub2_Sub1) local41).aString37)) && Static67.anInt1443 < Static251.anInt1928) {
						Static251.anIntArray127[Static67.anInt1443] = Static641.aClass31_10.method1024(local41.aString119) / 2;
						Static251.anIntArray129[Static67.anInt1443] = Static519.anIntArray552[0];
						Static251.anIntArray128[Static67.anInt1443] = Static519.anIntArray552[1];
						Static251.anIntArray130[Static67.anInt1443] = local41.anInt9953;
						Static251.anIntArray125[Static67.anInt1443] = local41.anInt9990;
						Static251.anIntArray126[Static67.anInt1443] = local41.anInt9993;
						Static251.aStringArray10[Static67.anInt1443] = local41.aString119;
						Static67.anInt1443++;
					}
					local188 = arg0 + Static519.anIntArray552[1];
					@Pc(243) Class17[] local243;
					@Pc(250) Class51[] local250;
					@Pc(306) Class17 local306;
					if (local41.aBoolean773 || local41.anInt9998 <= Static177.anInt3088) {
						local188 -= Math.max(Static641.aClass31_10.anInt1098, Static169.aClass17Array5[0].method5253());
					} else {
						@Pc(199) byte local199 = 1;
						if (local21 >= local15) {
							local205 = local25.anInt8804;
							if (local205 == -1) {
								local205 = local41.method8525().anInt10061;
							}
						} else {
							@Pc(221) Class3_Sub1_Sub2_Sub2_Sub1 local221 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local19[local21]];
							local205 = local41.method8525().anInt10061;
							if (local221.aBoolean292) {
								local199 = 2;
							}
						}
						@Pc(233) Class17[] local233 = Static169.aClass17Array5;
						if (local205 != -1) {
							local243 = (Class17[]) Static307.aClass352_65.method7653((long) local205);
							if (local243 == null) {
								local250 = Static682.method1651(Static368.aClass34_80, local205);
								if (local250 != null) {
									local243 = new Class17[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static582.aClass33_13.method8147(local250[local258], true);
									}
									Static307.aClass352_65.method7655((long) local205, local243);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local233 = local243;
							}
						}
						if (local233.length <= local199) {
							local199 = 1;
						}
						@Pc(302) Class17 local302 = local233[0];
						local306 = local233[local199];
						local188 -= Math.max(Static641.aClass31_10.anInt1098, local302.method5253());
						local258 = Static519.anIntArray552[0] + arg3 - (local302.method5268() >> 1);
						local334 = local302.method5268() * local41.anInt9985 / 255;
						local337 = local302.method5253();
						if (local41.anInt9985 > 0 && local334 < 2) {
							local334 = 2;
						}
						local302.method5246(local258, local188);
						Static582.aClass33_13.T(local258, local188, local258 + local334, local188 + local337);
						local306.method5246(local258, local188);
						Static582.aClass33_13.KA(arg3, arg0, arg2 + arg3, arg0 - -arg1);
						Static100.method2025(local188, local302.method5256() + local258, local258, local337 + local188);
					}
					local188 -= 2;
					if (!local41.aBoolean773) {
						@Pc(416) Class17 local416;
						@Pc(425) Class17 local425;
						if (local41.anInt9949 > Static177.anInt3088) {
							local416 = Static275.aClass17Array7[local41.aBoolean774 ? 2 : 0];
							local425 = Static275.aClass17Array7[local41.aBoolean774 ? 3 : 1];
							if (local41 instanceof Class3_Sub1_Sub2_Sub2_Sub2) {
								local433 = local25.anInt8770;
								if (local433 == -1) {
									local433 = local41.method8525().anInt10059;
								}
							} else {
								local433 = local41.method8525().anInt10059;
							}
							if (local433 != -1) {
								local243 = (Class17[]) Static618.aClass352_70.method7653((long) local433);
								if (local243 == null) {
									local250 = Static682.method1651(Static368.aClass34_80, local433);
									if (local250 != null) {
										local243 = new Class17[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static582.aClass33_13.method8147(local250[local258], true);
										}
										Static618.aClass352_70.method7655((long) local433, local243);
									}
								}
								if (local243 != null && local243.length == 4) {
									local416 = local243[local41.aBoolean774 ? 2 : 0];
									local425 = local243[local41.aBoolean774 ? 3 : 1];
								}
							}
							@Pc(530) int local530 = local41.anInt9949 - Static177.anInt3088;
							if (local530 > local41.anInt9975) {
								local530 -= local41.anInt9975;
								local258 = local41.anInt9995 == 0 ? 0 : (local41.anInt9937 - local530) / local41.anInt9995 * local41.anInt9995;
								local571 = local416.method5268() * local258 / local41.anInt9937;
							} else {
								local571 = local416.method5268();
							}
							local258 = local416.method5253();
							local188 -= local258;
							local334 = arg3 + Static519.anIntArray552[0] - (local416.method5268() >> 1);
							local416.method5246(local334, local188);
							Static582.aClass33_13.T(local334, local188, local334 + local571, local188 - -local258);
							local425.method5246(local334, local188);
							Static582.aClass33_13.KA(arg3, arg0, arg2 + arg3, arg0 - -arg1);
							Static100.method2025(local188, local334 + local416.method5256(), local334, local188 + local258);
							local188 -= 2;
						}
						if (local21 < local15) {
							@Pc(711) Class3_Sub1_Sub2_Sub2_Sub1 local711 = (Class3_Sub1_Sub2_Sub2_Sub1) local41;
							if (local711.anInt3950 != -1) {
								local188 -= 25;
								local425 = Static404.aClass17Array15[local711.anInt3950];
								local425.method5246(Static519.anIntArray552[0] + arg3 - 12, local188);
								Static100.method2025(local188, Static519.anIntArray552[0] + arg3 + local425.method5256() - 12, arg3 + Static519.anIntArray552[0] + -12, local425.method5251() + local188);
								local188 -= 2;
							}
							if (local711.anInt3928 != -1) {
								local188 -= 25;
								local425 = Static455.aClass17Array16[local711.anInt3928];
								local425.method5246(arg3 + Static519.anIntArray552[0] - 12, local188);
								Static100.method2025(local188, arg3 + Static519.anIntArray552[0] + local425.method5256() - 12, Static519.anIntArray552[0] + -12 + arg3, local425.method5251() + local188);
								local188 -= 2;
							}
						} else if (local25.anInt8803 >= 0 && Static455.aClass17Array16.length > local25.anInt8803) {
							local188 -= 25;
							local416 = Static455.aClass17Array16[local25.anInt8803];
							local416.method5246(Static519.anIntArray552[0] + arg3 - (local416.method5268() >> 1), local188);
							Static100.method2025(local188, Static519.anIntArray552[0] + arg3 - (local416.method5268() >> 1) + local416.method5256(), arg3 + Static519.anIntArray552[0] + -(local416.method5268() >> 1), local188 + local416.method5251());
							local188 -= 2;
						}
					}
					@Pc(811) Class82[] local811;
					@Pc(819) Class82 local819;
					if (!(local41 instanceof Class3_Sub1_Sub2_Sub2_Sub1)) {
						local205 = 0;
						local811 = Static9.aClass82Array41;
						for (local433 = 0; local433 < local811.length; local433++) {
							local819 = local811[local433];
							if (local819 != null && local819.anInt2225 == 1 && Static526.anIntArray558[local21 - local15] == local819.anInt2224) {
								local306 = Static384.aClass17Array12[local819.anInt2230];
								if (local306.method5253() > local205) {
									local205 = local306.method5253();
								}
								if (Static177.anInt3088 % 20 < 10) {
									local306.method5246(arg3 + Static519.anIntArray552[0] - 12, -local306.method5253() + local188);
									Static100.method2025(local188 - local306.method5253(), Static519.anIntArray552[0] + -12 + arg3 + local306.method5256(), arg3 + Static519.anIntArray552[0] - 12, local188 + -local306.method5253() + local306.method5251());
								}
							}
						}
						if (local205 > 0) {
						}
					} else if (local21 >= 0) {
						local205 = 0;
						local811 = Static9.aClass82Array41;
						for (local433 = 0; local433 < local811.length; local433++) {
							local819 = local811[local433];
							if (local819 != null && local819.anInt2225 == 10 && local819.anInt2224 == local19[local21]) {
								local306 = Static384.aClass17Array12[local819.anInt2230];
								if (local306.method5253() > local205) {
									local205 = local306.method5253();
								}
								local306.method5246(Static519.anIntArray552[0] + arg3 - 12, local188 + -local306.method5253());
								Static100.method2025(local188 - local306.method5253(), arg3 + Static519.anIntArray552[0] + -12 + local306.method5256(), Static519.anIntArray552[0] + arg3 - 12, local188 + -local306.method5253() + local306.method5251());
							}
						}
						if (local205 > 0) {
						}
					}
					for (local205 = 0; local205 < Static621.anInt9744; local205++) {
						local1047 = local41.anIntArray685[local205];
						local433 = local41.anIntArray691[local205];
						@Pc(1054) Class155 local1054 = null;
						local571 = 0;
						if (local433 >= 0) {
							if (local1047 <= Static177.anInt3088) {
								continue;
							}
							local1054 = Static204.aClass361_1.method7871(local41.anIntArray691[local205]);
							local571 = local1054.anInt3683;
						} else if (local1047 < 0) {
							continue;
						}
						local258 = local41.anIntArray688[local205];
						@Pc(1083) Class155 local1083 = null;
						if (local258 >= 0) {
							local1083 = Static204.aClass361_1.method7871(local258);
						}
						if (Static177.anInt3088 >= local1047 - local571) {
							local337 = local41.anIntArray683[local205];
							if (local337 >= 0) {
								local41.anInt9985 = local337;
								local41.anInt9998 = Static177.anInt3088 + 300;
								local41.anIntArray683[local205] = -1;
							}
							if (local1054 == null) {
								local41.anIntArray685[local205] = -1;
							} else {
								local1137 = local41.method8520() / 2;
								Static648.method8645(arg1 >> 1, arg2 >> 1, local41, local1137);
								if (Static519.anIntArray552[0] > -1) {
									Static519.anIntArray552[0] += Static438.anIntArray473[local205];
									Static519.anIntArray552[1] += Static315.anIntArray371[local205];
									local1183 = 0;
									local1185 = 0;
									@Pc(1187) int local1187 = 0;
									@Pc(1189) int local1189 = 0;
									@Pc(1191) int local1191 = 0;
									@Pc(1193) int local1193 = 0;
									@Pc(1195) int local1195 = 0;
									@Pc(1197) int local1197 = 0;
									@Pc(1199) Class17 local1199 = null;
									@Pc(1201) Class17 local1201 = null;
									@Pc(1203) Class17 local1203 = null;
									@Pc(1205) Class17 local1205 = null;
									@Pc(1207) int local1207 = 0;
									@Pc(1209) int local1209 = 0;
									@Pc(1211) int local1211 = 0;
									@Pc(1213) int local1213 = 0;
									@Pc(1215) int local1215 = 0;
									@Pc(1217) int local1217 = 0;
									@Pc(1219) int local1219 = 0;
									@Pc(1221) int local1221 = 0;
									@Pc(1223) int local1223 = 0;
									@Pc(1228) Class17 local1228 = local1054.method3364(Static582.aClass33_13);
									@Pc(1236) int local1236;
									if (local1228 != null) {
										local1183 = local1228.method5268();
										local1236 = local1228.method5253();
										if (local1236 > 0) {
											local1223 = local1236;
										}
										local1228.method5267(Static676.anIntArray727);
										local1191 = Static676.anIntArray727[0];
									}
									@Pc(1253) Class17 local1253 = local1054.method3360(Static582.aClass33_13);
									if (local1253 != null) {
										local1185 = local1253.method5268();
										local1236 = local1253.method5253();
										if (local1223 < local1236) {
											local1223 = local1236;
										}
										local1253.method5267(Static676.anIntArray727);
										local1193 = Static676.anIntArray727[0];
									}
									@Pc(1282) Class17 local1282 = local1054.method3365(Static582.aClass33_13);
									if (local1282 != null) {
										local1187 = local1282.method5268();
										local1236 = local1282.method5253();
										local1282.method5267(Static676.anIntArray727);
										if (local1223 < local1236) {
											local1223 = local1236;
										}
										local1195 = Static676.anIntArray727[0];
									}
									@Pc(1311) Class17 local1311 = local1054.method3363(Static582.aClass33_13);
									if (local1311 != null) {
										local1189 = local1311.method5268();
										local1236 = local1311.method5253();
										local1311.method5267(Static676.anIntArray727);
										if (local1236 > local1223) {
											local1223 = local1236;
										}
										local1197 = Static676.anIntArray727[0];
									}
									if (local1083 != null) {
										local1199 = local1083.method3364(Static582.aClass33_13);
										if (local1199 != null) {
											local1207 = local1199.method5268();
											local1236 = local1199.method5253();
											local1199.method5267(Static676.anIntArray727);
											if (local1223 < local1236) {
												local1223 = local1236;
											}
											local1215 = Static676.anIntArray727[0];
										}
										local1201 = local1083.method3360(Static582.aClass33_13);
										if (local1201 != null) {
											local1209 = local1201.method5268();
											local1236 = local1201.method5253();
											if (local1223 < local1236) {
												local1223 = local1236;
											}
											local1201.method5267(Static676.anIntArray727);
											local1217 = Static676.anIntArray727[0];
										}
										local1203 = local1083.method3365(Static582.aClass33_13);
										if (local1203 != null) {
											local1211 = local1203.method5268();
											local1236 = local1203.method5253();
											if (local1223 < local1236) {
												local1223 = local1236;
											}
											local1203.method5267(Static676.anIntArray727);
											local1219 = Static676.anIntArray727[0];
										}
										local1205 = local1083.method3363(Static582.aClass33_13);
										if (local1205 != null) {
											local1213 = local1205.method5268();
											local1236 = local1205.method5253();
											if (local1236 > local1223) {
												local1223 = local1236;
											}
											local1205.method5267(Static676.anIntArray727);
											local1221 = Static676.anIntArray727[0];
										}
									}
									@Pc(1447) Class56 local1447 = Static302.aClass56_9;
									@Pc(1449) Class56 local1449 = Static302.aClass56_9;
									@Pc(1451) Class31 local1451 = Static321.aClass31_5;
									@Pc(1453) Class31 local1453 = Static321.aClass31_5;
									local1236 = local1054.anInt3674;
									@Pc(1467) Class56 local1467;
									@Pc(1472) Class31 local1472;
									if (local1236 >= 0) {
										local1467 = Static531.method7138(true, local1236, Static582.aClass33_13);
										local1472 = Static17.method323(local1236, Static582.aClass33_13);
										if (local1467 != null && local1472 != null) {
											local1451 = local1472;
											local1447 = local1467;
										}
									}
									if (local1083 != null) {
										local1236 = local1083.anInt3674;
										if (local1236 >= 0) {
											local1467 = Static531.method7138(true, local1236, Static582.aClass33_13);
											local1472 = Static17.method323(local1236, Static582.aClass33_13);
											if (local1467 != null && local1472 != null) {
												local1449 = local1467;
												local1453 = local1472;
											}
										}
									}
									@Pc(1510) String local1510 = null;
									@Pc(1514) int local1514 = 0;
									@Pc(1522) String local1522 = local1054.method3362(local41.anIntArray687[local205]);
									@Pc(1527) int local1527 = local1451.method1024(local1522);
									if (local1083 != null) {
										local1510 = local1083.method3362(local41.anIntArray689[local205]);
										local1514 = local1453.method1024(local1510);
									}
									@Pc(1544) int local1544 = 0;
									if (local1185 > 0) {
										local1544 = local1527 / local1185 + 1;
									}
									@Pc(1554) int local1554 = 0;
									if (local1083 != null && local1209 > 0) {
										local1554 = local1514 / local1209 + 1;
									}
									@Pc(1569) int local1569 = 0;
									if (local1183 > 0) {
										local1569 = local1183;
									}
									local1569 += 2;
									@Pc(1580) int local1580 = local1569;
									if (local1187 > 0) {
										local1569 += local1187;
									}
									@Pc(1591) int local1591 = local1569;
									@Pc(1593) int local1593 = local1569;
									@Pc(1602) int local1602;
									if (local1185 > 0) {
										local1602 = local1185 * local1544;
										local1593 = local1569 + (local1602 - local1527) / 2;
										local1569 += local1602;
									} else {
										local1569 += local1527;
									}
									local1602 = local1569;
									if (local1189 > 0) {
										local1569 += local1189;
									}
									@Pc(1631) int local1631 = 0;
									@Pc(1633) int local1633 = 0;
									@Pc(1635) int local1635 = 0;
									@Pc(1637) int local1637 = 0;
									@Pc(1639) int local1639 = 0;
									@Pc(1678) int local1678;
									if (local1083 != null) {
										local1569 += 2;
										local1631 = local1569;
										if (local1207 > 0) {
											local1569 += local1207;
										}
										local1569 += 2;
										local1633 = local1569;
										if (local1211 > 0) {
											local1569 += local1211;
										}
										local1635 = local1569;
										local1639 = local1569;
										if (local1209 <= 0) {
											local1569 += local1514;
										} else {
											local1678 = local1554 * local1209;
											local1639 = local1569 + (local1678 - local1514) / 2;
											local1569 += local1678;
										}
										local1637 = local1569;
										if (local1213 > 0) {
											local1569 += local1213;
										}
									}
									local1678 = local41.anIntArray685[local205] - Static177.anInt3088;
									@Pc(1722) int local1722 = local1054.anInt3686 - local1054.anInt3686 * local1678 / local1054.anInt3683;
									@Pc(1734) int local1734 = local1054.anInt3675 * local1678 / local1054.anInt3683 - local1054.anInt3675;
									@Pc(1747) int local1747 = local1722 + Static519.anIntArray552[0] + arg3 - (local1569 >> 1);
									@Pc(1757) int local1757 = local1734 + Static519.anIntArray552[1] + arg0 - 12;
									@Pc(1759) int local1759 = local1757;
									@Pc(1763) int local1763 = local1757 + local1223;
									@Pc(1770) int local1770 = local1054.anInt3672 + local1757 + 15;
									@Pc(1776) int local1776 = local1770 - local1451.anInt1098;
									@Pc(1781) int local1781 = local1451.anInt1095 + local1770;
									if (local1776 < local1757) {
										local1759 = local1776;
									}
									if (local1781 > local1763) {
										local1763 = local1781;
									}
									@Pc(1793) int local1793 = 0;
									@Pc(1808) int local1808;
									@Pc(1814) int local1814;
									if (local1083 != null) {
										local1793 = local1757 + local1083.anInt3672 + 15;
										local1808 = local1793 - local1453.anInt1098;
										local1814 = local1793 + local1453.anInt1095;
										if (local1808 < local1759) {
											local1759 = local1808;
										}
										if (local1814 > local1763) {
											local1763 = local1814;
										}
									}
									local1808 = 255;
									if (local1054.anInt3685 >= 0) {
										local1808 = (local1678 << 8) / (local1054.anInt3683 - local1054.anInt3685);
									}
									if (local1808 >= 0 && local1808 < 255) {
										local1814 = local1808 << 24;
										@Pc(1861) int local1861 = local1814 | 0xFFFFFF;
										if (local1228 != null) {
											local1228.method5260(local1747 - local1191, local1757, 0, local1861, 1);
										}
										if (local1282 != null) {
											local1282.method5260(local1580 + local1747 - local1195, local1757, 0, local1861, 1);
										}
										@Pc(1893) int local1893;
										if (local1253 != null) {
											for (local1893 = 0; local1893 < local1544; local1893++) {
												local1253.method5260(local1185 * local1893 + local1591 + local1747 - local1193, local1757, 0, local1861, 1);
											}
										}
										if (local1311 != null) {
											local1311.method5260(local1747 + local1602 - local1197, local1757, 0, local1861, 1);
										}
										local1447.method8052(local1747 + local1593, local1522, local1770, local1054.anInt3688 | local1814, 0);
										if (local1083 != null) {
											if (local1199 != null) {
												local1199.method5260(local1631 + local1747 - local1215, local1757, 0, local1861, 1);
											}
											if (local1203 != null) {
												local1203.method5260(local1633 + local1747 - local1219, local1757, 0, local1861, 1);
											}
											if (local1201 != null) {
												for (local1893 = 0; local1893 < local1554; local1893++) {
													local1201.method5260(local1747 + local1635 + local1893 * local1209 - local1217, local1757, 0, local1861, 1);
												}
											}
											if (local1205 != null) {
												local1205.method5260(local1637 + local1747 - local1221, local1757, 0, local1861, 1);
											}
											local1449.method8052(local1639 + local1747, local1510, local1793, local1814 | local1083.anInt3688, 0);
										}
									} else {
										if (local1228 != null) {
											local1228.method5246(local1747 - local1191, local1757);
										}
										if (local1282 != null) {
											local1282.method5246(local1580 + local1747 - local1195, local1757);
										}
										if (local1253 != null) {
											for (local1814 = 0; local1814 < local1544; local1814++) {
												local1253.method5246(local1185 * local1814 + local1747 + local1591 - local1193, local1757);
											}
										}
										if (local1311 != null) {
											local1311.method5246(local1747 + local1602 - local1197, local1757);
										}
										local1447.method8052(local1747 + local1593, local1522, local1770, local1054.anInt3688 | 0xFF000000, 0);
										if (local1083 != null) {
											if (local1199 != null) {
												local1199.method5246(local1747 + local1631 - local1215, local1757);
											}
											if (local1203 != null) {
												local1203.method5246(local1747 + local1633 - local1219, local1757);
											}
											if (local1201 != null) {
												for (local1814 = 0; local1814 < local1554; local1814++) {
													local1201.method5246(local1814 * local1209 + local1747 + local1635 - local1217, local1757);
												}
											}
											if (local1205 != null) {
												local1205.method5246(local1747 + local1637 - local1221, local1757);
											}
											local1449.method8052(local1747 + local1639, local1510, local1793, local1083.anInt3688 | 0xFF000000, 0);
										}
									}
									Static100.method2025(local1759, local1569 + local1747, local1747, local1763 + 1);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2215) int local2215;
		for (@Pc(2209) int local2209 = 0; local2209 < Static611.anInt9389; local2209++) {
			local2215 = Static7.anIntArray8[local2209];
			@Pc(2222) Class3_Sub1_Sub2_Sub2 local2222;
			if (local2215 < 2048) {
				local2222 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local2215];
			} else {
				local2222 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) (local2215 - 2048))).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			}
			local205 = Static118.anIntArray156[local2209];
			@Pc(2253) Class3_Sub1_Sub2_Sub2 local2253;
			if (local205 >= 2048) {
				local2253 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) (local205 - 2048))).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			} else {
				local2253 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local205];
			}
			Static216.method3227(--local2222.anInt9991, arg0, arg1, local2253, local2222, arg2, arg3);
		}
		local2215 = Static641.aClass31_10.anInt1098 + Static641.aClass31_10.anInt1095 + 2;
		for (local188 = 0; local188 < Static67.anInt1443; local188++) {
			local205 = Static251.anIntArray129[local188];
			local1047 = Static251.anIntArray128[local188];
			local433 = Static251.anIntArray127[local188];
			@Pc(2311) boolean local2311 = true;
			while (local2311) {
				local2311 = false;
				for (local571 = 0; local571 < local188; local571++) {
					if (local1047 + 2 > Static251.anIntArray128[local571] - local2215 && local1047 - local2215 < Static251.anIntArray128[local571] + 2 && local205 - local433 < Static251.anIntArray129[local571] + Static251.anIntArray127[local571] && Static251.anIntArray129[local571] - Static251.anIntArray127[local571] < local433 + local205 && local1047 > Static251.anIntArray128[local571] - local2215) {
						local1047 = Static251.anIntArray128[local571] - local2215;
						local2311 = true;
					}
				}
			}
			Static251.anIntArray128[local188] = local1047;
			@Pc(2408) String local2408 = Static251.aStringArray10[local188];
			local258 = Static641.aClass31_10.method1024(local2408);
			local334 = local205 + arg3;
			local337 = arg0 + local1047 - Static641.aClass31_10.anInt1098;
			local1137 = local258 + local334;
			@Pc(2435) int local2435 = Static641.aClass31_10.anInt1095 + local1047 + arg0;
			if (Static317.anInt4916 == 0) {
				@Pc(2442) int local2442 = 16776960;
				if (Static251.anIntArray130[local188] < 6) {
					local2442 = Static139.anIntArray720[Static251.anIntArray130[local188]];
				}
				if (Static251.anIntArray130[local188] == 6) {
					local2442 = Static472.anInt7502 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static251.anIntArray130[local188] == 7) {
					local2442 = Static472.anInt7502 % 20 < 10 ? 255 : 65535;
				}
				if (Static251.anIntArray130[local188] == 8) {
					local2442 = Static472.anInt7502 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2515) int local2515;
				if (Static251.anIntArray130[local188] == 9) {
					local2515 = 150 - Static251.anIntArray126[local188];
					if (local2515 < 50) {
						local2442 = local2515 * 1280 + 16711680;
					} else if (local2515 < 100) {
						local2442 = 16776960 - (local2515 - 50) * 327680;
					} else if (local2515 < 150) {
						local2442 = (local2515 - 100) * 5 + 65280;
					}
				}
				if (Static251.anIntArray130[local188] == 10) {
					local2515 = 150 - Static251.anIntArray126[local188];
					if (local2515 < 50) {
						local2442 = local2515 * 5 + 16711680;
					} else if (local2515 < 100) {
						local2442 = 16711935 - (local2515 - 50) * 327680;
					} else if (local2515 < 150) {
						local2442 = local2515 * 327680 + 255 - (local2515 + -100) * 5 - 32768000;
					}
				}
				if (Static251.anIntArray130[local188] == 11) {
					local2515 = 150 - Static251.anIntArray126[local188];
					if (local2515 < 50) {
						local2442 = 16777215 - local2515 * 327685;
					} else if (local2515 < 100) {
						local2442 = (local2515 - 50) * 327685 + 65280;
					} else if (local2515 < 150) {
						local2442 = 16777215 - (local2515 - 100) * 327680;
					}
				}
				local2515 = local2442 | 0xFF000000;
				if (Static251.anIntArray125[local188] == 0) {
					local334 -= local258 >> 1;
					Static344.aClass56_10.method8054(local2408, -16777216, local2515, local1047 + arg0, arg3 - -local205);
					local1137 -= local258 >> 1;
				}
				if (Static251.anIntArray125[local188] == 1) {
					local337 -= 5;
					local1137 -= local258 >> 1;
					Static344.aClass56_10.method8062(arg0 + local1047, Static472.anInt7502, arg3 + local205, local2515, local2408);
					local2435 += 5;
					local334 -= local258 >> 1;
				}
				if (Static251.anIntArray125[local188] == 2) {
					local337 -= 5;
					local2435 += 5;
					local1137 -= (local258 >> 1) - 5;
					Static344.aClass56_10.method8056(local2515, local2408, arg3 + local205, Static472.anInt7502, arg0 + local1047);
					local334 -= (local258 >> 1) + 5;
				}
				if (Static251.anIntArray125[local188] == 3) {
					Static344.aClass56_10.method8049(150 - Static251.anIntArray126[local188], local2408, arg0 + local1047, local2515, Static472.anInt7502, local205 + arg3);
					local334 -= local258 >> 1;
					local2435 += 7;
					local337 -= 7;
					local1137 -= local258 >> 1;
				}
				@Pc(2835) int local2835;
				if (Static251.anIntArray125[local188] == 4) {
					local2835 = (150 - Static251.anIntArray126[local188]) * (Static641.aClass31_10.method1024(local2408) + 100) / 150;
					Static582.aClass33_13.T(arg3 + local205 - 50, arg0, arg3 + local205 + 50, arg0 + arg1);
					local334 += 50 - local2835;
					local1137 += 50 - local2835;
					Static344.aClass56_10.method8052(local205 + arg3 + 50 - local2835, local2408, local1047 + arg0, local2515, -16777216);
					Static582.aClass33_13.KA(arg3, arg0, arg3 + arg2, arg0 + arg1);
				}
				if (Static251.anIntArray125[local188] == 5) {
					local2835 = 150 - Static251.anIntArray126[local188];
					local1183 = 0;
					if (local2835 < 25) {
						local1183 = local2835 - 25;
					} else if (local2835 > 125) {
						local1183 = local2835 - 125;
					}
					local1185 = Static641.aClass31_10.anInt1095 + Static641.aClass31_10.anInt1098;
					Static582.aClass33_13.T(arg3, local1047 + arg0 - local1185 - 1, arg3 + arg2, arg0 + local1047 + 5);
					local1137 -= local258 >> 1;
					local334 -= local258 >> 1;
					Static344.aClass56_10.method8054(local2408, -16777216, local2515, arg0 + local1047 + local1183, arg3 + local205);
					local337 += local1183;
					local2435 += local1183;
					Static582.aClass33_13.KA(arg3, arg0, arg2 + arg3, arg0 + arg1);
				}
			} else {
				Static344.aClass56_10.method8054(local2408, -16777216, -256, local1047 + arg0, local205 + arg3);
				local1137 -= local258 >> 1;
				local334 -= local258 >> 1;
			}
			Static100.method2025(local337, local1137 + 1, local334, local2435 + 1);
		}
	}

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(I)Lclient!tm;")
	public static Class176 method3020() {
		try {
			return (Class176) Class.forName("Class176_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BIZ)V")
	public static void method3021(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) Class4_Sub48 local6 = Static623.method8371();
		local6.aClass4_Sub11_Sub1_2.method8822(Static51.aClass164_6.anInt4099);
		local6.aClass4_Sub11_Sub1_2.method8838(0);
		@Pc(21) int local21 = local6.aClass4_Sub11_Sub1_2.anInt10466;
		local6.aClass4_Sub11_Sub1_2.method8838(648);
		@Pc(30) int[] local30 = Static622.method8367(local6);
		@Pc(34) int local34 = local6.aClass4_Sub11_Sub1_2.anInt10466;
		local6.aClass4_Sub11_Sub1_2.method8857(arg0);
		local6.aClass4_Sub11_Sub1_2.method8838(Static461.anInt7416);
		local6.aClass4_Sub11_Sub1_2.method8857(arg1);
		local6.aClass4_Sub11_Sub1_2.method8873(Static278.aLong133);
		local6.aClass4_Sub11_Sub1_2.method8822(Static164.anInt2984);
		local6.aClass4_Sub11_Sub1_2.method8822(Static333.aClass234_5.anInt5621);
		Static466.method6476(local6.aClass4_Sub11_Sub1_2);
		@Pc(73) String local73 = Static567.aString106;
		local6.aClass4_Sub11_Sub1_2.method8822(local73 == null ? 0 : 1);
		if (local73 != null) {
			local6.aClass4_Sub11_Sub1_2.method8857(local73);
		}
		local6.aClass4_Sub11_Sub1_2.method8822(arg2);
		local6.aClass4_Sub11_Sub1_2.method8822(arg3 ? 1 : 0);
		local6.aClass4_Sub11_Sub1_2.anInt10466 += 7;
		local6.aClass4_Sub11_Sub1_2.method8854(local34, local6.aClass4_Sub11_Sub1_2.anInt10466, local30);
		local6.aClass4_Sub11_Sub1_2.method8885(local6.aClass4_Sub11_Sub1_2.anInt10466 - local21);
		Static410.method5170(local6);
		Static87.anInt1778 = 1;
		Static393.anInt5778 = -3;
		Static105.anInt2132 = 0;
		Static373.anInt5588 = 0;
		if (arg2 < 13) {
			Static552.aBoolean666 = true;
			Static561.method7441();
		}
	}
}
