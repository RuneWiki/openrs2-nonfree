import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_11 = new Class312("", 17);

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_9 = new Class151(5, 1);

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIIIII)V")
	public static void method6809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(5) int local5 = Static649.anInt10495;
		@Pc(7) int[] local7 = Static426.anIntArray476;
		Static61.anInt1686 = 0;
		@Pc(170) int local170;
		@Pc(203) int local203;
		@Pc(249) int local249;
		@Pc(320) int local320;
		@Pc(323) int local323;
		@Pc(1107) int local1107;
		@Pc(1153) int local1153;
		@Pc(1155) int local1155;
		@Pc(421) int local421;
		@Pc(1018) int local1018;
		@Pc(550) int local550;
		for (@Pc(11) int local11 = 0; local11 < Static317.anInt5602 + local5; local11++) {
			@Pc(14) Class113 local14 = null;
			@Pc(27) Class16_Sub1_Sub1_Sub3 local27;
			if (local5 > local11) {
				local27 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local7[local11]];
			} else {
				local27 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) Static363.anIntArray409[local11 - local5])).aClass16_Sub1_Sub1_Sub3_Sub1_2;
				local14 = ((Class16_Sub1_Sub1_Sub3_Sub1) local27).aClass113_1;
				if (local14.anIntArray213 != null) {
					local14 = local14.method2752(Static382.aClass282_1);
					if (local14 == null) {
						continue;
					}
				}
			}
			if (local27.anInt8057 >= 0 && (Static364.anInt6282 == local27.anInt8109 || Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 == local27.aByte109)) {
				Static620.method8623(arg1 >> 1, local27.method6996(), local27, arg3 >> 1);
				if (Static197.anIntArray250[0] >= 0) {
					if (local27.aString81 != null && (local5 <= local11 || Static487.anInt7837 == 0 || Static487.anInt7837 == 3 || Static487.anInt7837 == 1 && Static222.method3605(((Class16_Sub1_Sub1_Sub3_Sub2) local27).aString82)) && Static61.anInt1686 < Static25.anInt8656) {
						Static25.anIntArray641[Static61.anInt1686] = Static551.aClass183_13.method4453(local27.aString81) / 2;
						Static25.anIntArray644[Static61.anInt1686] = Static197.anIntArray250[0];
						Static25.anIntArray640[Static61.anInt1686] = Static197.anIntArray250[1];
						Static25.anIntArray642[Static61.anInt1686] = local27.anInt8107;
						Static25.anIntArray639[Static61.anInt1686] = local27.anInt8091;
						Static25.anIntArray643[Static61.anInt1686] = local27.anInt8125;
						Static25.aStringArray47[Static61.anInt1686] = local27.aString81;
						Static61.anInt1686++;
					}
					local170 = arg2 + Static197.anIntArray250[1];
					@Pc(234) Class31[] local234;
					@Pc(241) Class139[] local241;
					@Pc(292) Class31 local292;
					if (local27.aBoolean587 || local27.anInt8119 <= Static389.anInt6694) {
						local170 -= Math.max(Static551.aClass183_13.anInt5062, Static242.aClass31Array8[0].method8789());
					} else {
						@Pc(185) byte local185 = 1;
						if (local5 > local11) {
							@Pc(198) Class16_Sub1_Sub1_Sub3_Sub2 local198 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local7[local11]];
							local203 = local27.method7007().anInt7643;
							if (local198.aBoolean592) {
								local185 = 2;
							}
						} else {
							local203 = local14.anInt3200;
							if (local203 == -1) {
								local203 = local27.method7007().anInt7643;
							}
						}
						@Pc(223) Class31[] local223 = Static242.aClass31Array8;
						if (local203 != -1) {
							local234 = (Class31[]) Static364.aClass69_35.method1919((long) local203);
							if (local234 == null) {
								local241 = Static654.method3463(Static497.aClass238_223, local203);
								if (local241 != null) {
									local234 = new Class31[local241.length];
									for (local249 = 0; local249 < local241.length; local249++) {
										local234[local249] = Static141.aClass13_27.method8141(local241[local249], true);
									}
									Static364.aClass69_35.method1917((long) local203, local234);
								}
							}
							if (local234 != null && local234.length >= 2) {
								local223 = local234;
							}
						}
						if (local223.length <= local185) {
							local185 = 1;
						}
						@Pc(288) Class31 local288 = local223[0];
						local292 = local223[local185];
						local170 -= Math.max(Static551.aClass183_13.anInt5062, local288.method8789());
						local249 = arg0 + Static197.anIntArray250[0] - (local288.method8801() >> 1);
						local320 = local288.method8801() * local27.anInt8051 / 255;
						local323 = local288.method8789();
						if (local27.anInt8051 > 0 && local320 < 2) {
							local320 = 2;
						}
						local288.method8793(local249, local170);
						Static141.aClass13_27.T(local249, local170, local249 + local320, local170 - -local323);
						local292.method8793(local249, local170);
						Static141.aClass13_27.KA(arg0, arg2, arg1 + arg0, arg2 + arg3);
						Static103.method1953(local170, local249 + local288.method8788(), local249, local323 + local170);
					}
					local170 -= 2;
					if (!local27.aBoolean587) {
						@Pc(402) Class31 local402;
						@Pc(411) Class31 local411;
						if (local27.anInt8082 > Static389.anInt6694) {
							local402 = Static272.aClass31Array9[local27.aBoolean586 ? 2 : 0];
							local411 = Static272.aClass31Array9[local27.aBoolean586 ? 3 : 1];
							if (local27 instanceof Class16_Sub1_Sub1_Sub3_Sub1) {
								local421 = local14.anInt3218;
								if (local421 == -1) {
									local421 = local27.method7007().anInt7611;
								}
							} else {
								local421 = local27.method7007().anInt7611;
							}
							if (local421 != -1) {
								local234 = (Class31[]) Static634.aClass69_73.method1919((long) local421);
								if (local234 == null) {
									local241 = Static654.method3463(Static497.aClass238_223, local421);
									if (local241 != null) {
										local234 = new Class31[local241.length];
										for (local249 = 0; local249 < local241.length; local249++) {
											local234[local249] = Static141.aClass13_27.method8141(local241[local249], true);
										}
										Static634.aClass69_73.method1917((long) local421, local234);
									}
								}
								if (local234 != null && local234.length == 4) {
									local411 = local234[local27.aBoolean586 ? 3 : 1];
									local402 = local234[local27.aBoolean586 ? 2 : 0];
								}
							}
							@Pc(513) int local513 = local27.anInt8082 - Static389.anInt6694;
							if (local513 > local27.anInt8069) {
								local513 -= local27.anInt8069;
								local249 = local27.anInt8103 == 0 ? 0 : local27.anInt8103 * ((local27.anInt8076 - local513) / local27.anInt8103);
								local550 = local249 * local402.method8801() / local27.anInt8076;
							} else {
								local550 = local402.method8801();
							}
							local249 = local402.method8789();
							local170 -= local249;
							local320 = Static197.anIntArray250[0] + arg0 - (local402.method8801() >> 1);
							local402.method8793(local320, local170);
							Static141.aClass13_27.T(local320, local170, local550 + local320, local249 + local170);
							local411.method8793(local320, local170);
							Static141.aClass13_27.KA(arg0, arg2, arg1 + arg0, arg2 - -arg3);
							Static103.method1953(local170, local320 + local402.method8788(), local320, local249 + local170);
							local170 -= 2;
						}
						if (local11 < local5) {
							@Pc(621) Class16_Sub1_Sub1_Sub3_Sub2 local621 = (Class16_Sub1_Sub1_Sub3_Sub2) local27;
							if (local621.anInt8174 != -1) {
								local170 -= 25;
								local411 = Static606.aClass31Array18[local621.anInt8174];
								local411.method8793(arg0 + Static197.anIntArray250[0] - 12, local170);
								Static103.method1953(local170, Static197.anIntArray250[0] + arg0 + local411.method8788() - 12, arg0 - (-Static197.anIntArray250[0] - -12), local411.method8807() + local170);
								local170 -= 2;
							}
							if (local621.anInt8173 != -1) {
								local170 -= 25;
								local411 = Static22.aClass31Array2[local621.anInt8173];
								local411.method8793(arg0 + Static197.anIntArray250[0] - 12, local170);
								Static103.method1953(local170, Static197.anIntArray250[0] + arg0 + local411.method8788() - 12, arg0 - (-Static197.anIntArray250[0] - -12), local170 + local411.method8807());
								local170 -= 2;
							}
						} else if (local14.anInt3225 >= 0 && Static22.aClass31Array2.length > local14.anInt3225) {
							local170 -= 25;
							local402 = Static22.aClass31Array2[local14.anInt3225];
							local402.method8793(Static197.anIntArray250[0] + arg0 - (local402.method8801() >> 1), local170);
							Static103.method1953(local170, arg0 + Static197.anIntArray250[0] - (local402.method8801() >> 1) + local402.method8788(), Static197.anIntArray250[0] + arg0 - (local402.method8801() >> 1), local402.method8807() + local170);
							local170 -= 2;
						}
					}
					@Pc(788) Class110[] local788;
					@Pc(795) Class110 local795;
					if (!(local27 instanceof Class16_Sub1_Sub1_Sub3_Sub2)) {
						local203 = 0;
						local788 = Static448.aClass110Array1;
						for (local421 = 0; local421 < local788.length; local421++) {
							local795 = local788[local421];
							if (local795 != null && local795.anInt3142 == 1 && local795.anInt3136 == Static363.anIntArray409[local11 - local5]) {
								local292 = Static435.aClass31Array13[local795.anInt3135];
								if (local292.method8789() > local203) {
									local203 = local292.method8789();
								}
								if (Static389.anInt6694 % 20 < 10) {
									local292.method8793(Static197.anIntArray250[0] + arg0 - 12, local170 + -local292.method8789());
									Static103.method1953(local170 - local292.method8789(), Static197.anIntArray250[0] + -12 + arg0 - -local292.method8788(), arg0 + Static197.anIntArray250[0] - 12, local170 - (local292.method8789() + -local292.method8807()));
								}
							}
						}
						if (local203 > 0) {
						}
					} else if (local11 >= 0) {
						local203 = 0;
						local788 = Static448.aClass110Array1;
						for (local421 = 0; local421 < local788.length; local421++) {
							local795 = local788[local421];
							if (local795 != null && local795.anInt3142 == 10 && local795.anInt3136 == local7[local11]) {
								local292 = Static435.aClass31Array13[local795.anInt3135];
								if (local292.method8789() > local203) {
									local203 = local292.method8789();
								}
								local292.method8793(arg0 + Static197.anIntArray250[0] - 12, local170 - local292.method8789());
								Static103.method1953(local170 - local292.method8789(), Static197.anIntArray250[0] + arg0 + -12 - -local292.method8788(), arg0 + Static197.anIntArray250[0] - 12, local170 - (local292.method8789() + -local292.method8807()));
							}
						}
						if (local203 > 0) {
						}
					}
					for (local203 = 0; local203 < Static6.anInt127; local203++) {
						local1018 = local27.anIntArray589[local203];
						local421 = local27.anIntArray593[local203];
						@Pc(1025) Class195 local1025 = null;
						local550 = 0;
						if (local421 >= 0) {
							if (local1018 <= Static389.anInt6694) {
								continue;
							}
							local1025 = Static333.aClass356_2.method8375(local27.anIntArray593[local203]);
							local550 = local1025.anInt5162;
						} else if (local1018 < 0) {
							continue;
						}
						local249 = local27.anIntArray591[local203];
						@Pc(1054) Class195 local1054 = null;
						if (local249 >= 0) {
							local1054 = Static333.aClass356_2.method8375(local249);
						}
						if (Static389.anInt6694 >= local1018 - local550) {
							local323 = local27.anIntArray588[local203];
							if (local323 >= 0) {
								local27.anInt8051 = local323;
								local27.anInt8119 = Static389.anInt6694 + 300;
								local27.anIntArray588[local203] = -1;
							}
							if (local1025 == null) {
								local27.anIntArray589[local203] = -1;
							} else {
								local1107 = local27.method6996() / 2;
								Static620.method8623(arg1 >> 1, local1107, local27, arg3 >> 1);
								if (Static197.anIntArray250[0] > -1) {
									Static197.anIntArray250[0] += Static229.anIntArray272[local203];
									Static197.anIntArray250[1] += Static74.anIntArray611[local203];
									local1153 = 0;
									local1155 = 0;
									@Pc(1157) int local1157 = 0;
									@Pc(1159) int local1159 = 0;
									@Pc(1161) int local1161 = 0;
									@Pc(1163) int local1163 = 0;
									@Pc(1165) int local1165 = 0;
									@Pc(1167) int local1167 = 0;
									@Pc(1169) Class31 local1169 = null;
									@Pc(1171) Class31 local1171 = null;
									@Pc(1173) Class31 local1173 = null;
									@Pc(1175) Class31 local1175 = null;
									@Pc(1177) int local1177 = 0;
									@Pc(1179) int local1179 = 0;
									@Pc(1181) int local1181 = 0;
									@Pc(1183) int local1183 = 0;
									@Pc(1185) int local1185 = 0;
									@Pc(1187) int local1187 = 0;
									@Pc(1189) int local1189 = 0;
									@Pc(1191) int local1191 = 0;
									@Pc(1196) Class31 local1196 = local1025.method4514(Static141.aClass13_27);
									@Pc(1198) int local1198 = 0;
									@Pc(1206) int local1206;
									if (local1196 != null) {
										local1153 = local1196.method8801();
										local1206 = local1196.method8789();
										local1196.method8799(Static233.anIntArray278);
										if (local1206 > 0) {
											local1198 = local1206;
										}
										local1161 = Static233.anIntArray278[0];
									}
									@Pc(1223) Class31 local1223 = local1025.method4516(Static141.aClass13_27);
									if (local1223 != null) {
										local1155 = local1223.method8801();
										local1206 = local1223.method8789();
										local1223.method8799(Static233.anIntArray278);
										if (local1198 < local1206) {
											local1198 = local1206;
										}
										local1163 = Static233.anIntArray278[0];
									}
									@Pc(1248) Class31 local1248 = local1025.method4517(Static141.aClass13_27);
									if (local1248 != null) {
										local1157 = local1248.method8801();
										local1206 = local1248.method8789();
										if (local1198 < local1206) {
											local1198 = local1206;
										}
										local1248.method8799(Static233.anIntArray278);
										local1165 = Static233.anIntArray278[0];
									}
									@Pc(1273) Class31 local1273 = local1025.method4519(Static141.aClass13_27);
									if (local1273 != null) {
										local1159 = local1273.method8801();
										local1206 = local1273.method8789();
										if (local1198 < local1206) {
											local1198 = local1206;
										}
										local1273.method8799(Static233.anIntArray278);
										local1167 = Static233.anIntArray278[0];
									}
									if (local1054 != null) {
										local1169 = local1054.method4514(Static141.aClass13_27);
										if (local1169 != null) {
											local1177 = local1169.method8801();
											local1206 = local1169.method8789();
											if (local1206 > local1198) {
												local1198 = local1206;
											}
											local1169.method8799(Static233.anIntArray278);
											local1185 = Static233.anIntArray278[0];
										}
										local1171 = local1054.method4516(Static141.aClass13_27);
										if (local1171 != null) {
											local1179 = local1171.method8801();
											local1206 = local1171.method8789();
											local1171.method8799(Static233.anIntArray278);
											if (local1198 < local1206) {
												local1198 = local1206;
											}
											local1187 = Static233.anIntArray278[0];
										}
										local1173 = local1054.method4517(Static141.aClass13_27);
										if (local1173 != null) {
											local1181 = local1173.method8801();
											local1206 = local1173.method8789();
											local1173.method8799(Static233.anIntArray278);
											if (local1206 > local1198) {
												local1198 = local1206;
											}
											local1189 = Static233.anIntArray278[0];
										}
										local1175 = local1054.method4519(Static141.aClass13_27);
										if (local1175 != null) {
											local1183 = local1175.method8801();
											local1206 = local1175.method8789();
											local1175.method8799(Static233.anIntArray278);
											if (local1198 < local1206) {
												local1198 = local1206;
											}
											local1191 = Static233.anIntArray278[0];
										}
									}
									@Pc(1417) Class37 local1417 = Static591.aClass37_12;
									@Pc(1419) Class37 local1419 = Static591.aClass37_12;
									@Pc(1421) Class183 local1421 = Static539.aClass183_11;
									@Pc(1423) Class183 local1423 = Static539.aClass183_11;
									local1206 = local1025.anInt5161;
									@Pc(1437) Class37 local1437;
									@Pc(1442) Class183 local1442;
									if (local1206 >= 0) {
										local1437 = Static10.method116(local1206, true, Static141.aClass13_27);
										local1442 = Static258.method4281(local1206, Static141.aClass13_27);
										if (local1437 != null && local1442 != null) {
											local1421 = local1442;
											local1417 = local1437;
										}
									}
									if (local1054 != null) {
										local1206 = local1054.anInt5161;
										if (local1206 >= 0) {
											local1437 = Static10.method116(local1206, true, Static141.aClass13_27);
											local1442 = Static258.method4281(local1206, Static141.aClass13_27);
											if (local1437 != null && local1442 != null) {
												local1423 = local1442;
												local1419 = local1437;
											}
										}
									}
									@Pc(1480) String local1480 = null;
									@Pc(1484) int local1484 = 0;
									@Pc(1492) String local1492 = local1025.method4518(local27.anIntArray587[local203]);
									@Pc(1497) int local1497 = local1421.method4453(local1492);
									if (local1054 != null) {
										local1480 = local1054.method4518(local27.anIntArray590[local203]);
										local1484 = local1423.method4453(local1480);
									}
									@Pc(1514) int local1514 = 0;
									if (local1155 > 0) {
										local1514 = local1497 / local1155 + 1;
									}
									@Pc(1527) int local1527 = 0;
									if (local1054 != null && local1179 > 0) {
										local1527 = local1484 / local1179 + 1;
									}
									@Pc(1539) int local1539 = 0;
									if (local1153 > 0) {
										local1539 = local1153;
									}
									local1539 += 2;
									@Pc(1553) int local1553 = local1539;
									if (local1157 > 0) {
										local1539 += local1157;
									}
									@Pc(1564) int local1564 = local1539;
									@Pc(1566) int local1566 = local1539;
									@Pc(1577) int local1577;
									if (local1155 <= 0) {
										local1539 += local1497;
									} else {
										local1577 = local1155 * local1514;
										local1566 = local1539 + (local1577 - local1497) / 2;
										local1539 += local1577;
									}
									local1577 = local1539;
									if (local1159 > 0) {
										local1539 += local1159;
									}
									@Pc(1603) int local1603 = 0;
									@Pc(1605) int local1605 = 0;
									@Pc(1607) int local1607 = 0;
									@Pc(1609) int local1609 = 0;
									@Pc(1611) int local1611 = 0;
									@Pc(1655) int local1655;
									if (local1054 != null) {
										local1539 += 2;
										local1603 = local1539;
										if (local1177 > 0) {
											local1539 += local1177;
										}
										local1539 += 2;
										local1605 = local1539;
										if (local1181 > 0) {
											local1539 += local1181;
										}
										local1611 = local1539;
										local1607 = local1539;
										if (local1179 <= 0) {
											local1539 += local1484;
										} else {
											local1655 = local1179 * local1527;
											local1539 += local1655;
											local1611 += (local1655 - local1484) / 2;
										}
										local1609 = local1539;
										if (local1183 > 0) {
											local1539 += local1183;
										}
									}
									local1655 = local27.anIntArray589[local203] - Static389.anInt6694;
									@Pc(1698) int local1698 = local1025.anInt5157 - local1025.anInt5157 * local1655 / local1025.anInt5162;
									@Pc(1710) int local1710 = local1025.anInt5160 * local1655 / local1025.anInt5162 - local1025.anInt5160;
									@Pc(1723) int local1723 = local1698 + Static197.anIntArray250[0] + arg0 - (local1539 >> 1);
									@Pc(1734) int local1734 = Static197.anIntArray250[1] + arg2 + local1710 - 12;
									@Pc(1736) int local1736 = local1734;
									@Pc(1741) int local1741 = local1734 + local1198;
									@Pc(1748) int local1748 = local1734 + local1025.anInt5159 + 15;
									@Pc(1754) int local1754 = local1748 - local1421.anInt5062;
									if (local1754 < local1734) {
										local1736 = local1754;
									}
									@Pc(1769) int local1769 = local1748 + local1421.anInt5064;
									if (local1769 > local1741) {
										local1741 = local1769;
									}
									@Pc(1776) int local1776 = 0;
									@Pc(1790) int local1790;
									@Pc(1805) int local1805;
									if (local1054 != null) {
										local1776 = local1734 + local1054.anInt5159 + 15;
										local1790 = local1776 - local1423.anInt5062;
										if (local1790 < local1736) {
											local1736 = local1790;
										}
										local1805 = local1776 + local1423.anInt5064;
										if (local1741 < local1805) {
											local1741 = local1805;
										}
									}
									local1790 = 255;
									if (local1025.anInt5150 >= 0) {
										local1790 = (local1655 << 8) / (local1025.anInt5162 - local1025.anInt5150);
									}
									if (local1790 >= 0 && local1790 < 255) {
										local1805 = local1790 << 24;
										@Pc(1988) int local1988 = local1805 | 0xFFFFFF;
										if (local1196 != null) {
											local1196.method8796(local1723 - local1161, local1734, 0, local1988, 1);
										}
										if (local1248 != null) {
											local1248.method8796(local1723 + local1553 - local1165, local1734, 0, local1988, 1);
										}
										@Pc(2020) int local2020;
										if (local1223 != null) {
											for (local2020 = 0; local2020 < local1514; local2020++) {
												local1223.method8796(local1723 + local1564 + local1155 * local2020 - local1163, local1734, 0, local1988, 1);
											}
										}
										if (local1273 != null) {
											local1273.method8796(local1577 + local1723 - local1167, local1734, 0, local1988, 1);
										}
										local1417.method6067(local1805 | local1025.anInt5142, local1492, 0, local1723 + local1566, local1748);
										if (local1054 != null) {
											if (local1169 != null) {
												local1169.method8796(local1603 + local1723 - local1185, local1734, 0, local1988, 1);
											}
											if (local1173 != null) {
												local1173.method8796(local1605 + local1723 - local1189, local1734, 0, local1988, 1);
											}
											if (local1171 != null) {
												for (local2020 = 0; local2020 < local1527; local2020++) {
													local1171.method8796(local1607 + local1723 + local2020 * local1179 - local1187, local1734, 0, local1988, 1);
												}
											}
											if (local1175 != null) {
												local1175.method8796(local1723 + local1609 - local1191, local1734, 0, local1988, 1);
											}
											local1419.method6067(local1805 | local1054.anInt5142, local1480, 0, local1723 + local1611, local1776);
										}
									} else {
										if (local1196 != null) {
											local1196.method8793(local1723 - local1161, local1734);
										}
										if (local1248 != null) {
											local1248.method8793(local1553 + local1723 - local1165, local1734);
										}
										if (local1223 != null) {
											for (local1805 = 0; local1805 < local1514; local1805++) {
												local1223.method8793(local1564 + local1723 + local1155 * local1805 - local1163, local1734);
											}
										}
										if (local1273 != null) {
											local1273.method8793(local1723 + local1577 - local1167, local1734);
										}
										local1417.method6067(local1025.anInt5142 | 0xFF000000, local1492, 0, local1723 + local1566, local1748);
										if (local1054 != null) {
											if (local1169 != null) {
												local1169.method8793(local1723 + local1603 - local1185, local1734);
											}
											if (local1173 != null) {
												local1173.method8793(local1723 + local1605 - local1189, local1734);
											}
											if (local1171 != null) {
												for (local1805 = 0; local1805 < local1527; local1805++) {
													local1171.method8793(local1805 * local1179 + local1607 + local1723 - local1187, local1734);
												}
											}
											if (local1175 != null) {
												local1175.method8793(local1609 + local1723 - local1191, local1734);
											}
											local1419.method6067(local1054.anInt5142 | 0xFF000000, local1480, 0, local1723 + local1611, local1776);
										}
									}
									Static103.method1953(local1736, local1723 + local1539, local1723, local1741 + 1);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2180) int local2180;
		for (@Pc(2175) int local2175 = 0; local2175 < Static348.anInt6055; local2175++) {
			local2180 = Static233.anIntArray279[local2175];
			@Pc(2195) Class16_Sub1_Sub1_Sub3 local2195;
			if (local2180 >= 2048) {
				local2195 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) (local2180 - 2048))).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			} else {
				local2195 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local2180];
			}
			local203 = Static70.anIntArray141[local2175];
			@Pc(2219) Class16_Sub1_Sub1_Sub3 local2219;
			if (local203 >= 2048) {
				local2219 = ((Class2_Sub32) Static514.aClass323_32.method7484((long) (local203 - 2048))).aClass16_Sub1_Sub1_Sub3_Sub1_2;
			} else {
				local2219 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local203];
			}
			Static215.method3551(local2195, arg1, local2219, arg2, arg0, arg3, --local2195.anInt8106);
		}
		local2180 = Static551.aClass183_13.anInt5064 + Static551.aClass183_13.anInt5062 + 2;
		for (local170 = 0; local170 < Static61.anInt1686; local170++) {
			local203 = Static25.anIntArray644[local170];
			local1018 = Static25.anIntArray640[local170];
			local421 = Static25.anIntArray641[local170];
			@Pc(2274) boolean local2274 = true;
			while (local2274) {
				local2274 = false;
				for (local550 = 0; local550 < local170; local550++) {
					if (Static25.anIntArray640[local550] - local2180 < local1018 - -2 && Static25.anIntArray640[local550] + 2 > -local2180 + local1018 && local203 - local421 < Static25.anIntArray641[local550] + Static25.anIntArray644[local550] && Static25.anIntArray644[local550] - Static25.anIntArray641[local550] < local203 - -local421 && Static25.anIntArray640[local550] - local2180 < local1018) {
						local1018 = Static25.anIntArray640[local550] - local2180;
						local2274 = true;
					}
				}
			}
			Static25.anIntArray640[local170] = local1018;
			@Pc(2363) String local2363 = Static25.aStringArray47[local170];
			local249 = Static551.aClass183_13.method4453(local2363);
			local320 = arg0 + local203;
			local323 = arg2 + local1018 - Static551.aClass183_13.anInt5062;
			local1107 = local320 + local249;
			@Pc(2394) int local2394 = local1018 + arg2 + Static551.aClass183_13.anInt5064;
			if (Static161.anInt3273 == 0) {
				@Pc(2398) int local2398 = 16776960;
				if (Static25.anIntArray642[local170] < 6) {
					local2398 = Static45.anIntArray74[Static25.anIntArray642[local170]];
				}
				if (Static25.anIntArray642[local170] == 6) {
					local2398 = Static364.anInt6282 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static25.anIntArray642[local170] == 7) {
					local2398 = Static364.anInt6282 % 20 < 10 ? 255 : 65535;
				}
				if (Static25.anIntArray642[local170] == 8) {
					local2398 = Static364.anInt6282 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(2471) int local2471;
				if (Static25.anIntArray642[local170] == 9) {
					local2471 = 150 - Static25.anIntArray643[local170];
					if (local2471 < 50) {
						local2398 = local2471 * 1280 + 16711680;
					} else if (local2471 < 100) {
						local2398 = 33160960 - local2471 * 327680;
					} else if (local2471 < 150) {
						local2398 = local2471 * 5 + 65280 - 500;
					}
				}
				if (Static25.anIntArray642[local170] == 10) {
					local2471 = 150 - Static25.anIntArray643[local170];
					if (local2471 < 50) {
						local2398 = local2471 * 5 + 16711680;
					} else if (local2471 < 100) {
						local2398 = 16711935 - (local2471 - 50) * 327680;
					} else if (local2471 < 150) {
						local2398 = local2471 * 327680 + 500 + 255 - local2471 * 5 - 32768000;
					}
				}
				if (Static25.anIntArray642[local170] == 11) {
					local2471 = 150 - Static25.anIntArray643[local170];
					if (local2471 < 50) {
						local2398 = 16777215 - local2471 * 327685;
					} else if (local2471 < 100) {
						local2398 = (local2471 - 50) * 327685 + 65280;
					} else if (local2471 < 150) {
						local2398 = 16777215 - (local2471 - 100) * 327680;
					}
				}
				local2471 = local2398 | 0xFF000000;
				if (Static25.anIntArray639[local170] == 0) {
					local1107 -= local249 >> 1;
					Static544.aClass37_8.method6075(arg0 + local203, -16777216, local2471, local1018 + arg2, local2363);
					local320 -= local249 >> 1;
				}
				if (Static25.anIntArray639[local170] == 1) {
					local320 -= local249 >> 1;
					local2394 += 5;
					local1107 -= local249 >> 1;
					Static544.aClass37_8.method6084(arg0 + local203, local2471, Static364.anInt6282, local2363, local1018 + arg2);
					local323 -= 5;
				}
				if (Static25.anIntArray639[local170] == 2) {
					local1107 -= (local249 >> 1) - 5;
					Static544.aClass37_8.method6079(arg2 + local1018, local2471, Static364.anInt6282, local203 + arg0, local2363);
					local323 -= 5;
					local2394 += 5;
					local320 -= (local249 >> 1) + 5;
				}
				if (Static25.anIntArray639[local170] == 3) {
					local1107 -= local249 >> 1;
					local323 -= 7;
					Static544.aClass37_8.method6081(local1018 + arg2, local2471, local2363, 150 - Static25.anIntArray643[local170], Static364.anInt6282, arg0 + local203);
					local2394 += 7;
					local320 -= local249 >> 1;
				}
				@Pc(2777) int local2777;
				if (Static25.anIntArray639[local170] == 4) {
					local2777 = (150 - Static25.anIntArray643[local170]) * (Static551.aClass183_13.method4453(local2363) + 100) / 150;
					Static141.aClass13_27.T(local203 + arg0 - 50, arg2, local203 + arg0 + 50, arg2 + arg3);
					local1107 += 50 - local2777;
					local320 += 50 - local2777;
					Static544.aClass37_8.method6067(local2471, local2363, -16777216, arg0 + local203 + 50 - local2777, local1018 + arg2);
					Static141.aClass13_27.KA(arg0, arg2, arg1 + arg0, arg2 - -arg3);
				}
				if (Static25.anIntArray639[local170] == 5) {
					local2777 = 150 - Static25.anIntArray643[local170];
					local1153 = 0;
					if (local2777 < 25) {
						local1153 = local2777 - 25;
					} else if (local2777 > 125) {
						local1153 = local2777 - 125;
					}
					local1155 = Static551.aClass183_13.anInt5062 + Static551.aClass183_13.anInt5064;
					Static141.aClass13_27.T(arg0, local1018 + arg2 - local1155 - 1, arg0 - -arg1, arg2 + local1018 + 5);
					local1107 -= local249 >> 1;
					local2394 += local1153;
					Static544.aClass37_8.method6075(arg0 + local203, -16777216, local2471, arg2 + local1018 + local1153, local2363);
					local320 -= local249 >> 1;
					local323 += local1153;
					Static141.aClass13_27.KA(arg0, arg2, arg1 + arg0, arg3 + arg2);
				}
			} else {
				local1107 -= local249 >> 1;
				local320 -= local249 >> 1;
				Static544.aClass37_8.method6075(local203 + arg0, -16777216, -256, arg2 + local1018, local2363);
			}
			Static103.method1953(local323, local1107 + 1, local320, local2394 + 1);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIBI)V")
	public static void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 - arg0 >= Static566.anInt9279 && Static392.anInt6753 >= arg0 + arg3 && Static346.anInt5494 <= arg1 - arg0 && arg0 + arg1 <= Static640.anInt10333) {
			Static446.method6383(arg3, arg1, arg2, arg0);
		} else {
			Static217.method3564(arg1, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)Z")
	public static boolean method6813(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static372.aByteArrayArrayArray3[1].length > arg1 && arg0 < Static372.aByteArrayArrayArray3[1][arg1].length) {
			return (Static372.aByteArrayArrayArray3[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
