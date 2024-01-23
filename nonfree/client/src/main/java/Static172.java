import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "Lclient!kf;")
	public static Class90 aClass90_5;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)I")
	public static int method2905(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!sb;I)V")
	public static void method2906(@OriginalArg(1) Class1_Sub2_Sub18 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		Static273.anInt4950 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(16) int[] local16 = arg0.anIntArray402;
		@Pc(19) int[] local19 = arg0.anIntArray403;
		@Pc(21) byte local21 = -1;
		@Pc(626) int local626;
		try {
			@Pc(23) int local23 = 0;
			label4459: while (true) {
				local23++;
				if (local23 > arg1) {
					throw new RuntimeException("slow");
				}
				local13++;
				@Pc(38) int local38 = local16[local13];
				@Pc(620) int local620;
				@Pc(464) int local464;
				@Pc(418) String local418;
				if (local38 < 100) {
					if (local38 == 0) {
						Static92.anIntArray502[local3++] = local19[local13];
						continue;
					}
					@Pc(62) int local62;
					if (local38 == 1) {
						local62 = local19[local13];
						Static92.anIntArray502[local3++] = Static55.anIntArray64[local62];
						continue;
					}
					if (local38 == 2) {
						local62 = local19[local13];
						local3--;
						Static130.method2232(Static92.anIntArray502[local3], local62);
						continue;
					}
					if (local38 == 3) {
						Static191.aStringArray28[local11++] = arg0.aStringArray35[local13];
						continue;
					}
					if (local38 == 6) {
						local13 += local19[local13];
						continue;
					}
					if (local38 == 7) {
						local3 -= 2;
						if (Static92.anIntArray502[local3 + 1] != Static92.anIntArray502[local3]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local38 == 8) {
						local3 -= 2;
						if (Static92.anIntArray502[local3 + 1] == Static92.anIntArray502[local3]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local38 == 9) {
						local3 -= 2;
						if (Static92.anIntArray502[local3 + 1] > Static92.anIntArray502[local3]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local38 == 10) {
						local3 -= 2;
						if (Static92.anIntArray502[local3 + 1] < Static92.anIntArray502[local3]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local38 == 21) {
						if (Static273.anInt4950 == 0) {
							return;
						}
						@Pc(233) Class110 local233 = Static225.aClass110Array1[--Static273.anInt4950];
						local13 = local233.anInt3405;
						Static75.aStringArray7 = local233.aStringArray26;
						arg0 = local233.aClass1_Sub2_Sub18_1;
						local19 = arg0.anIntArray403;
						Static140.anIntArray464 = local233.anIntArray285;
						local16 = arg0.anIntArray402;
						continue;
					}
					if (local38 == 25) {
						local62 = local19[local13];
						Static92.anIntArray502[local3++] = Static272.method4761(local62);
						continue;
					}
					if (local38 == 27) {
						local62 = local19[local13];
						local3--;
						Static228.method3539(Static92.anIntArray502[local3], local62);
						continue;
					}
					if (local38 == 31) {
						local3 -= 2;
						if (Static92.anIntArray502[local3 + 1] >= Static92.anIntArray502[local3]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local38 == 32) {
						local3 -= 2;
						if (Static92.anIntArray502[local3 + 1] <= Static92.anIntArray502[local3]) {
							local13 += local19[local13];
						}
						continue;
					}
					if (local38 == 33) {
						Static92.anIntArray502[local3++] = Static140.anIntArray464[local19[local13]];
						continue;
					}
					@Pc(361) int local361;
					if (local38 == 34) {
						local361 = local19[local13];
						local3--;
						Static140.anIntArray464[local361] = Static92.anIntArray502[local3];
						continue;
					}
					if (local38 == 35) {
						Static191.aStringArray28[local11++] = Static75.aStringArray7[local19[local13]];
						continue;
					}
					if (local38 == 36) {
						local361 = local19[local13];
						local11--;
						Static75.aStringArray7[local361] = Static191.aStringArray28[local11];
						continue;
					}
					if (local38 == 37) {
						local62 = local19[local13];
						local11 -= local62;
						local418 = Static254.method4039(local11, Static191.aStringArray28, local62);
						Static191.aStringArray28[local11++] = local418;
						continue;
					}
					if (local38 == 38) {
						local3--;
						continue;
					}
					if (local38 == 39) {
						local11--;
						continue;
					}
					if (local38 == 40) {
						local62 = local19[local13];
						@Pc(454) Class1_Sub2_Sub18 local454 = Static266.method4192(local62);
						@Pc(458) int[] local458 = new int[local454.anInt4572];
						@Pc(462) String[] local462 = new String[local454.anInt4575];
						for (local464 = 0; local464 < local454.anInt4570; local464++) {
							local458[local464] = Static92.anIntArray502[local3 + local464 - local454.anInt4570];
						}
						for (local464 = 0; local464 < local454.anInt4574; local464++) {
							local462[local464] = Static191.aStringArray28[local11 + local464 - local454.anInt4574];
						}
						local3 -= local454.anInt4570;
						local11 -= local454.anInt4574;
						@Pc(520) Class110 local520 = new Class110();
						local520.aStringArray26 = Static75.aStringArray7;
						local520.aClass1_Sub2_Sub18_1 = arg0;
						local520.anIntArray285 = Static140.anIntArray464;
						local520.anInt3405 = local13;
						if (Static225.aClass110Array1.length <= Static273.anInt4950) {
							throw new RuntimeException();
						}
						Static225.aClass110Array1[Static273.anInt4950++] = local520;
						local13 = -1;
						arg0 = local454;
						Static140.anIntArray464 = local458;
						local19 = local454.anIntArray403;
						local16 = local454.anIntArray402;
						Static75.aStringArray7 = local462;
						continue;
					}
					if (local38 == 42) {
						Static92.anIntArray502[local3++] = Static168.anIntArray281[local19[local13]];
						continue;
					}
					if (local38 == 43) {
						local62 = local19[local13];
						local3--;
						Static168.anIntArray281[local62] = Static92.anIntArray502[local3];
						Static125.method2194(local62);
						continue;
					}
					if (local38 == 44) {
						local62 = local19[local13] >> 16;
						local3--;
						local620 = Static92.anIntArray502[local3];
						local626 = local19[local13] & 0xFFFF;
						if (local620 >= 0 && local620 <= 5000) {
							Static90.anIntArray160[local62] = local620;
							@Pc(643) byte local643 = -1;
							if (local626 == 105) {
								local643 = 0;
							}
							local464 = 0;
							while (true) {
								if (local464 >= local620) {
									continue label4459;
								}
								Static304.anIntArrayArray44[local62][local464] = local643;
								local464++;
							}
						}
						throw new RuntimeException();
					}
					if (local38 == 45) {
						local62 = local19[local13];
						local3--;
						local626 = Static92.anIntArray502[local3];
						if (local626 >= 0 && Static90.anIntArray160[local62] > local626) {
							Static92.anIntArray502[local3++] = Static304.anIntArrayArray44[local62][local626];
							continue;
						}
						throw new RuntimeException();
					}
					if (local38 == 46) {
						local62 = local19[local13];
						local3 -= 2;
						local626 = Static92.anIntArray502[local3];
						if (local626 >= 0 && Static90.anIntArray160[local62] > local626) {
							Static304.anIntArrayArray44[local62][local626] = Static92.anIntArray502[local3 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local38 == 47) {
						@Pc(753) String local753 = Static84.aStringArray12[local19[local13]];
						if (local753 == null) {
							local753 = "null";
						}
						Static191.aStringArray28[local11++] = local753;
						continue;
					}
					if (local38 == 48) {
						local62 = local19[local13];
						local11--;
						Static84.aStringArray12[local62] = Static191.aStringArray28[local11];
						Static113.method2022(local62);
						continue;
					}
					if (local38 == 51) {
						@Pc(799) Class142 local799 = arg0.aClass142Array1[local19[local13]];
						local3--;
						@Pc(809) Class1_Sub1 local809 = (Class1_Sub1) local799.method3543((long) Static92.anIntArray502[local3]);
						if (local809 != null) {
							local13 += local809.anInt12;
						}
						continue;
					}
				}
				@Pc(828) boolean local828;
				if (local19[local13] == 1) {
					local828 = true;
				} else {
					local828 = false;
				}
				@Pc(2965) Class66 local2965;
				@Pc(2943) Class66 local2943;
				@Pc(6633) int local6633;
				@Pc(885) Class66 local885;
				@Pc(1681) int local1681;
				if (local38 >= 300) {
					@Pc(12705) boolean local12705;
					if (local38 < 500) {
						if (local38 == 403) {
							local3 -= 2;
							local626 = Static92.anIntArray502[local3];
							local620 = Static92.anIntArray502[local3 + 1];
							for (local1681 = 0; local1681 < Static120.anIntArray214.length; local1681++) {
								if (local626 == Static120.anIntArray214[local1681]) {
									Static90.aClass15_Sub5_Sub2_2.aClass167_6.method4181(local1681, local620);
									continue label4459;
								}
							}
							local1681 = 0;
							while (true) {
								if (Static290.anIntArray461.length <= local1681) {
									continue label4459;
								}
								if (local626 == Static290.anIntArray461[local1681]) {
									Static90.aClass15_Sub5_Sub2_2.aClass167_6.method4181(local1681, local620);
									continue label4459;
								}
								local1681++;
							}
						}
						if (local38 == 404) {
							local3 -= 2;
							local620 = Static92.anIntArray502[local3 + 1];
							local626 = Static92.anIntArray502[local3];
							Static90.aClass15_Sub5_Sub2_2.aClass167_6.method4184(local626, local620);
							continue;
						}
						if (local38 == 410) {
							local3--;
							local12705 = Static92.anIntArray502[local3] != 0;
							Static90.aClass15_Sub5_Sub2_2.aClass167_6.method4180(local12705);
							continue;
						}
					} else {
						@Pc(5954) boolean local5954;
						if (local38 >= 1000 && local38 < 1100 || local38 >= 2000 && local38 < 2100) {
							if (local38 >= 2000) {
								local3--;
								local885 = Static53.method968(Static92.anIntArray502[local3]);
								local38 -= 1000;
							} else {
								local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
							}
							if (local38 == 1000) {
								local3 -= 4;
								local885.anInt2192 = Static92.anIntArray502[local3];
								local885.anInt2148 = Static92.anIntArray502[local3 + 1];
								local1681 = Static92.anIntArray502[local3 + 3];
								if (local1681 < 0) {
									local1681 = 0;
								} else if (local1681 > 5) {
									local1681 = 5;
								}
								local620 = Static92.anIntArray502[local3 + 2];
								local885.aByte9 = (byte) local1681;
								if (local620 < 0) {
									local620 = 0;
								} else if (local620 > 5) {
									local620 = 5;
								}
								local885.aByte12 = (byte) local620;
								Static103.method1865(local885);
								Static45.method890(local885);
								if (local885.anInt2178 == -1) {
									Static225.method3496(local885.anInt2157);
								}
								continue;
							}
							if (local38 == 1001) {
								local3 -= 4;
								local885.anInt2169 = Static92.anIntArray502[local3];
								local885.anInt2185 = Static92.anIntArray502[local3 + 1];
								local885.anInt2152 = 0;
								local885.anInt2203 = 0;
								local620 = Static92.anIntArray502[local3 + 2];
								local1681 = Static92.anIntArray502[local3 + 3];
								if (local620 < 0) {
									local620 = 0;
								} else if (local620 > 4) {
									local620 = 4;
								}
								if (local1681 < 0) {
									local1681 = 0;
								} else if (local1681 > 4) {
									local1681 = 4;
								}
								local885.aByte11 = (byte) local1681;
								local885.aByte10 = (byte) local620;
								Static103.method1865(local885);
								Static45.method890(local885);
								if (local885.anInt2176 == 0) {
									Static6.method38(false, local885);
								}
								continue;
							}
							if (local38 == 1003) {
								local3--;
								local5954 = Static92.anIntArray502[local3] == 1;
								if (local5954 != local885.aBoolean129) {
									local885.aBoolean129 = local5954;
									Static103.method1865(local885);
								}
								if (local885.anInt2178 == -1) {
									Static134.method4727(local885.anInt2157);
								}
								continue;
							}
							if (local38 == 1004) {
								local3 -= 2;
								local885.anInt2193 = Static92.anIntArray502[local3];
								local885.anInt2222 = Static92.anIntArray502[local3 + 1];
								Static103.method1865(local885);
								Static45.method890(local885);
								if (local885.anInt2176 == 0) {
									Static6.method38(false, local885);
								}
								continue;
							}
							if (local38 == 1005) {
								local3--;
								local885.aBoolean127 = Static92.anIntArray502[local3] == 1;
								continue;
							}
						} else {
							@Pc(1276) String local1276;
							if (local38 >= 1100 && local38 < 1200 || !(local38 < 2100 || local38 >= 2200)) {
								if (local38 < 2000) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
								} else {
									local38 -= 1000;
									local3--;
									local885 = Static53.method968(Static92.anIntArray502[local3]);
								}
								if (local38 == 1100) {
									local3 -= 2;
									local885.anInt2191 = Static92.anIntArray502[local3];
									if (local885.anInt2191 > local885.anInt2214 - local885.anInt2204) {
										local885.anInt2191 = local885.anInt2214 - local885.anInt2204;
									}
									if (local885.anInt2191 < 0) {
										local885.anInt2191 = 0;
									}
									local885.anInt2216 = Static92.anIntArray502[local3 + 1];
									if (local885.anInt2216 > local885.anInt2215 - local885.anInt2207) {
										local885.anInt2216 = local885.anInt2215 - local885.anInt2207;
									}
									if (local885.anInt2216 < 0) {
										local885.anInt2216 = 0;
									}
									Static103.method1865(local885);
									if (local885.anInt2178 == -1) {
										Static244.method3823(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1101) {
									local3--;
									local885.anInt2145 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									if (local885.anInt2178 == -1) {
										Static235.method4494(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1102) {
									local3--;
									local885.aBoolean124 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1103) {
									local3--;
									local885.anInt2211 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1104) {
									local3--;
									local885.anInt2177 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1105) {
									local3--;
									local885.anInt2218 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1106) {
									local3--;
									local885.anInt2201 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1107) {
									local3--;
									local885.aBoolean117 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1108) {
									local885.anInt2198 = 1;
									local3--;
									local885.anInt2130 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									if (local885.anInt2178 == -1) {
										Static279.method4317(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1109) {
									local3 -= 6;
									local885.anInt2133 = Static92.anIntArray502[local3];
									local885.anInt2163 = Static92.anIntArray502[local3 + 1];
									local885.anInt2136 = Static92.anIntArray502[local3 + 2];
									local885.anInt2156 = Static92.anIntArray502[local3 + 3];
									local885.anInt2167 = Static92.anIntArray502[local3 + 4];
									local885.anInt2181 = Static92.anIntArray502[local3 + 5];
									Static103.method1865(local885);
									if (local885.anInt2178 == -1) {
										Static116.method2096(local885.anInt2157);
										Static264.method4159(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1110) {
									local3--;
									local620 = Static92.anIntArray502[local3];
									if (local620 != local885.anInt2134) {
										local885.anInt2134 = local620;
										local885.anInt2149 = 0;
										local885.anInt2182 = 1;
										local885.anInt2131 = 0;
										Static103.method1865(local885);
									}
									if (local885.anInt2178 == -1) {
										Static239.method3681(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1111) {
									local3--;
									local885.aBoolean125 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1112) {
									local11--;
									local1276 = Static191.aStringArray28[local11];
									if (!local1276.equals(local885.aString122)) {
										local885.aString122 = local1276;
										Static103.method1865(local885);
									}
									if (local885.anInt2178 == -1) {
										Static26.method436(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1113) {
									local3--;
									local885.anInt2137 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1114) {
									local3 -= 3;
									local885.anInt2129 = Static92.anIntArray502[local3];
									local885.anInt2162 = Static92.anIntArray502[local3 + 1];
									local885.anInt2186 = Static92.anIntArray502[local3 + 2];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1115) {
									local3--;
									local885.aBoolean121 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1116) {
									local3--;
									local885.anInt2142 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1117) {
									local3--;
									local885.anInt2197 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1118) {
									local3--;
									local885.aBoolean134 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1119) {
									local3--;
									local885.aBoolean130 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1120) {
									local3 -= 2;
									local885.anInt2214 = Static92.anIntArray502[local3];
									local885.anInt2215 = Static92.anIntArray502[local3 + 1];
									Static103.method1865(local885);
									if (local885.anInt2176 == 0) {
										Static6.method38(false, local885);
									}
									continue;
								}
								if (local38 == 1121) {
									local3 -= 2;
									local885.aShort16 = (short) Static92.anIntArray502[local3];
									local885.aShort15 = (short) Static92.anIntArray502[local3 + 1];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1122) {
									local3--;
									local885.aBoolean122 = Static92.anIntArray502[local3] == 1;
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1123) {
									local3--;
									local885.anInt2181 = Static92.anIntArray502[local3];
									Static103.method1865(local885);
									if (local885.anInt2178 == -1) {
										Static116.method2096(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1124) {
									local3--;
									local620 = Static92.anIntArray502[local3];
									local885.aBoolean133 = local620 == 1;
									Static103.method1865(local885);
									continue;
								}
							} else if (local38 >= 1200 && local38 < 1300 || !(local38 < 2200 || local38 >= 2300)) {
								if (local38 < 2000) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
								} else {
									local38 -= 1000;
									local3--;
									local885 = Static53.method968(Static92.anIntArray502[local3]);
								}
								Static103.method1865(local885);
								if (local38 == 1200 || local38 == 1205 || local38 == 1208 || local38 == 1209) {
									local3 -= 2;
									local1681 = Static92.anIntArray502[local3 + 1];
									local620 = Static92.anIntArray502[local3];
									if (local885.anInt2178 == -1) {
										Static226.method3510(local885.anInt2157);
										Static116.method2096(local885.anInt2157);
										Static264.method4159(local885.anInt2157);
									}
									if (local620 == -1) {
										local885.anInt2220 = -1;
										local885.anInt2198 = 1;
										local885.anInt2130 = -1;
										continue;
									}
									local885.anInt2220 = local620;
									local885.anInt2151 = local1681;
									if (local38 == 1208 || local38 == 1209) {
										local885.aBoolean119 = true;
									} else {
										local885.aBoolean119 = false;
									}
									@Pc(14149) Class102 local14149 = Static49.method909(local620);
									local885.anInt2136 = local14149.anInt3229;
									local885.anInt2163 = local14149.anInt3186;
									local885.anInt2133 = local14149.anInt3176;
									local885.anInt2156 = local14149.anInt3191;
									local885.anInt2181 = local14149.anInt3204;
									if (local38 == 1205) {
										local885.aBoolean126 = false;
									} else {
										local885.aBoolean126 = true;
									}
									local885.anInt2167 = local14149.anInt3167;
									if (local885.anInt2203 > 0) {
										local885.anInt2181 = local885.anInt2181 * 32 / local885.anInt2203;
									} else if (local885.anInt2169 > 0) {
										local885.anInt2181 = local885.anInt2181 * 32 / local885.anInt2169;
									}
									continue;
								}
								if (local38 == 1201) {
									local885.anInt2198 = 2;
									local3--;
									local885.anInt2130 = Static92.anIntArray502[local3];
									if (local885.anInt2178 == -1) {
										Static279.method4317(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1202) {
									local885.anInt2198 = 3;
									local885.anInt2130 = Static90.aClass15_Sub5_Sub2_2.aClass167_6.method4193();
									if (local885.anInt2178 == -1) {
										Static279.method4317(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1203) {
									local885.anInt2198 = 6;
									local3--;
									local885.anInt2130 = Static92.anIntArray502[local3];
									if (local885.anInt2178 == -1) {
										Static279.method4317(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1204) {
									local885.anInt2198 = 5;
									local3--;
									local885.anInt2130 = Static92.anIntArray502[local3];
									if (local885.anInt2178 == -1) {
										Static279.method4317(local885.anInt2157);
									}
									continue;
								}
								if (local38 == 1206) {
									local3 -= 4;
									local885.anInt2212 = Static92.anIntArray502[local3];
									local885.anInt2164 = Static92.anIntArray502[local3 + 1];
									local885.anInt2190 = Static92.anIntArray502[local3 + 2];
									local885.anInt2144 = Static92.anIntArray502[local3 + 3];
									Static103.method1865(local885);
									continue;
								}
								if (local38 == 1207) {
									local3 -= 2;
									local885.anInt2195 = Static92.anIntArray502[local3];
									local885.anInt2202 = Static92.anIntArray502[local3 + 1];
									Static103.method1865(local885);
									continue;
								}
							} else if ((local38 < 1300 || local38 >= 1400) && (local38 < 2300 || local38 >= 2400)) {
								@Pc(1936) int local1936;
								if (local38 >= 1400 && local38 < 1500 || local38 >= 2400 && local38 < 2500) {
									if (local38 >= 2000) {
										local38 -= 1000;
										local3--;
										local885 = Static53.method968(Static92.anIntArray502[local3]);
									} else {
										local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
									}
									local11--;
									local1276 = Static191.aStringArray28[local11];
									@Pc(1877) int[] local1877 = null;
									if (local1276.length() > 0 && local1276.charAt(local1276.length() - 1) == 'Y') {
										local3--;
										local464 = Static92.anIntArray502[local3];
										if (local464 > 0) {
											local1877 = new int[local464];
											while (local464-- > 0) {
												local3--;
												local1877[local464] = Static92.anIntArray502[local3];
											}
										}
										local1276 = local1276.substring(0, local1276.length() - 1);
									}
									@Pc(1931) Object[] local1931 = new Object[local1276.length() + 1];
									for (local1936 = local1931.length - 1; local1936 >= 1; local1936--) {
										if (local1276.charAt(local1936 - 1) == 's') {
											local11--;
											local1931[local1936] = Static191.aStringArray28[local11];
										} else {
											local3--;
											local1931[local1936] = Integer.valueOf(Static92.anIntArray502[local3]);
										}
									}
									local3--;
									local1936 = Static92.anIntArray502[local3];
									if (local1936 == -1) {
										local1931 = null;
									} else {
										local1931[0] = Integer.valueOf(local1936);
									}
									if (local38 == 1400) {
										local885.anObjectArray15 = local1931;
									} else if (local38 == 1401) {
										local885.anObjectArray27 = local1931;
									} else if (local38 == 1402) {
										local885.anObjectArray30 = local1931;
									} else if (local38 == 1403) {
										local885.anObjectArray14 = local1931;
									} else if (local38 == 1404) {
										local885.anObjectArray5 = local1931;
									} else if (local38 == 1405) {
										local885.anObjectArray20 = local1931;
									} else if (local38 == 1406) {
										local885.anObjectArray8 = local1931;
									} else if (local38 == 1407) {
										local885.anIntArray199 = local1877;
										local885.anObjectArray19 = local1931;
									} else if (local38 == 1408) {
										local885.anObjectArray7 = local1931;
									} else if (local38 == 1409) {
										local885.anObjectArray25 = local1931;
									} else if (local38 == 1410) {
										local885.anObjectArray4 = local1931;
									} else if (local38 == 1411) {
										local885.anObjectArray11 = local1931;
									} else if (local38 == 1412) {
										local885.anObjectArray26 = local1931;
									} else if (local38 == 1414) {
										local885.anIntArray196 = local1877;
										local885.anObjectArray9 = local1931;
									} else if (local38 == 1415) {
										local885.anObjectArray16 = local1931;
										local885.anIntArray189 = local1877;
									} else if (local38 == 1416) {
										local885.anObjectArray23 = local1931;
									} else if (local38 == 1417) {
										local885.anObjectArray31 = local1931;
									} else if (local38 == 1418) {
										local885.anObjectArray28 = local1931;
									} else if (local38 == 1419) {
										local885.anObjectArray17 = local1931;
									} else if (local38 == 1420) {
										local885.anObjectArray6 = local1931;
									} else if (local38 == 1421) {
										local885.anObjectArray21 = local1931;
									} else if (local38 == 1422) {
										local885.anObjectArray3 = local1931;
									} else if (local38 == 1423) {
										local885.anObjectArray24 = local1931;
									} else if (local38 == 1424) {
										local885.anObjectArray2 = local1931;
									} else if (local38 == 1425) {
										local885.anObjectArray29 = local1931;
									} else if (local38 == 1426) {
										local885.anObjectArray13 = local1931;
									} else if (local38 == 1427) {
										local885.anObjectArray12 = local1931;
									} else if (local38 == 1428) {
										local885.anIntArray187 = local1877;
										local885.anObjectArray18 = local1931;
									} else if (local38 == 1429) {
										local885.anIntArray188 = local1877;
										local885.anObjectArray10 = local1931;
									}
									local885.aBoolean120 = true;
									continue;
								}
								if (local38 < 1600) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
									if (local38 == 1500) {
										Static92.anIntArray502[local3++] = local885.anInt2135;
										continue;
									}
									if (local38 == 1501) {
										Static92.anIntArray502[local3++] = local885.anInt2174;
										continue;
									}
									if (local38 == 1502) {
										Static92.anIntArray502[local3++] = local885.anInt2204;
										continue;
									}
									if (local38 == 1503) {
										Static92.anIntArray502[local3++] = local885.anInt2207;
										continue;
									}
									if (local38 == 1504) {
										Static92.anIntArray502[local3++] = local885.aBoolean129 ? 1 : 0;
										continue;
									}
									if (local38 == 1505) {
										Static92.anIntArray502[local3++] = local885.anInt2221;
										continue;
									}
								} else if (local38 < 1700) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
									if (local38 == 1600) {
										Static92.anIntArray502[local3++] = local885.anInt2191;
										continue;
									}
									if (local38 == 1601) {
										Static92.anIntArray502[local3++] = local885.anInt2216;
										continue;
									}
									if (local38 == 1602) {
										Static191.aStringArray28[local11++] = local885.aString122;
										continue;
									}
									if (local38 == 1603) {
										Static92.anIntArray502[local3++] = local885.anInt2214;
										continue;
									}
									if (local38 == 1604) {
										Static92.anIntArray502[local3++] = local885.anInt2215;
										continue;
									}
									if (local38 == 1605) {
										Static92.anIntArray502[local3++] = local885.anInt2181;
										continue;
									}
									if (local38 == 1606) {
										Static92.anIntArray502[local3++] = local885.anInt2136;
										continue;
									}
									if (local38 == 1607) {
										Static92.anIntArray502[local3++] = local885.anInt2167;
										continue;
									}
									if (local38 == 1608) {
										Static92.anIntArray502[local3++] = local885.anInt2156;
										continue;
									}
									if (local38 == 1609) {
										Static92.anIntArray502[local3++] = local885.anInt2211;
										continue;
									}
									if (local38 == 1610) {
										Static92.anIntArray502[local3++] = local885.anInt2133;
										continue;
									}
									if (local38 == 1611) {
										Static92.anIntArray502[local3++] = local885.anInt2163;
										continue;
									}
									if (local38 == 1612) {
										Static92.anIntArray502[local3++] = local885.anInt2218;
										continue;
									}
								} else if (local38 < 1800) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
									if (local38 == 1700) {
										Static92.anIntArray502[local3++] = local885.anInt2220;
										continue;
									}
									if (local38 == 1701) {
										if (local885.anInt2220 == -1) {
											Static92.anIntArray502[local3++] = 0;
										} else {
											Static92.anIntArray502[local3++] = local885.anInt2151;
										}
										continue;
									}
									if (local38 == 1702) {
										Static92.anIntArray502[local3++] = local885.anInt2178;
										continue;
									}
								} else if (local38 < 1900) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
									if (local38 == 1800) {
										Static92.anIntArray502[local3++] = Static37.method679(local885).method3059();
										continue;
									}
									if (local38 == 1801) {
										local3--;
										local620 = Static92.anIntArray502[local3];
										local620--;
										if (local885.aStringArray17 != null && local885.aStringArray17.length > local620 && local885.aStringArray17[local620] != null) {
											Static191.aStringArray28[local11++] = local885.aStringArray17[local620];
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 1802) {
										if (local885.aString123 == null) {
											Static191.aStringArray28[local11++] = "";
										} else {
											Static191.aStringArray28[local11++] = local885.aString123;
										}
										continue;
									}
								} else if (local38 < 2600) {
									local3--;
									local885 = Static53.method968(Static92.anIntArray502[local3]);
									if (local38 == 2500) {
										Static92.anIntArray502[local3++] = local885.anInt2135;
										continue;
									}
									if (local38 == 2501) {
										Static92.anIntArray502[local3++] = local885.anInt2174;
										continue;
									}
									if (local38 == 2502) {
										Static92.anIntArray502[local3++] = local885.anInt2204;
										continue;
									}
									if (local38 == 2503) {
										Static92.anIntArray502[local3++] = local885.anInt2207;
										continue;
									}
									if (local38 == 2504) {
										Static92.anIntArray502[local3++] = local885.aBoolean129 ? 1 : 0;
										continue;
									}
									if (local38 == 2505) {
										Static92.anIntArray502[local3++] = local885.anInt2221;
										continue;
									}
								} else if (local38 < 2700) {
									local3--;
									local885 = Static53.method968(Static92.anIntArray502[local3]);
									if (local38 == 2600) {
										Static92.anIntArray502[local3++] = local885.anInt2191;
										continue;
									}
									if (local38 == 2601) {
										Static92.anIntArray502[local3++] = local885.anInt2216;
										continue;
									}
									if (local38 == 2602) {
										Static191.aStringArray28[local11++] = local885.aString122;
										continue;
									}
									if (local38 == 2603) {
										Static92.anIntArray502[local3++] = local885.anInt2214;
										continue;
									}
									if (local38 == 2604) {
										Static92.anIntArray502[local3++] = local885.anInt2215;
										continue;
									}
									if (local38 == 2605) {
										Static92.anIntArray502[local3++] = local885.anInt2181;
										continue;
									}
									if (local38 == 2606) {
										Static92.anIntArray502[local3++] = local885.anInt2136;
										continue;
									}
									if (local38 == 2607) {
										Static92.anIntArray502[local3++] = local885.anInt2167;
										continue;
									}
									if (local38 == 2608) {
										Static92.anIntArray502[local3++] = local885.anInt2156;
										continue;
									}
									if (local38 == 2609) {
										Static92.anIntArray502[local3++] = local885.anInt2211;
										continue;
									}
									if (local38 == 2610) {
										Static92.anIntArray502[local3++] = local885.anInt2133;
										continue;
									}
									if (local38 == 2611) {
										Static92.anIntArray502[local3++] = local885.anInt2163;
										continue;
									}
									if (local38 == 2612) {
										Static92.anIntArray502[local3++] = local885.anInt2218;
										continue;
									}
								} else if (local38 < 2800) {
									if (local38 == 2700) {
										local3--;
										local885 = Static53.method968(Static92.anIntArray502[local3]);
										Static92.anIntArray502[local3++] = local885.anInt2220;
										continue;
									}
									if (local38 == 2701) {
										local3--;
										local885 = Static53.method968(Static92.anIntArray502[local3]);
										if (local885.anInt2220 == -1) {
											Static92.anIntArray502[local3++] = 0;
										} else {
											Static92.anIntArray502[local3++] = local885.anInt2151;
										}
										continue;
									}
									if (local38 == 2702) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										@Pc(2636) Class1_Sub25 local2636 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local626);
										if (local2636 == null) {
											Static92.anIntArray502[local3++] = 0;
										} else {
											Static92.anIntArray502[local3++] = 1;
										}
										continue;
									}
									if (local38 == 2703) {
										local3--;
										local885 = Static53.method968(Static92.anIntArray502[local3]);
										if (local885.aClass66Array3 == null) {
											Static92.anIntArray502[local3++] = 0;
											continue;
										}
										local620 = local885.aClass66Array3.length;
										for (local1681 = 0; local1681 < local885.aClass66Array3.length; local1681++) {
											if (local885.aClass66Array3[local1681] == null) {
												local620 = local1681;
												break;
											}
										}
										Static92.anIntArray502[local3++] = local620;
										continue;
									}
									if (local38 == 2704 || local38 == 2705) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										@Pc(2733) Class1_Sub25 local2733 = (Class1_Sub25) Static302.aClass142_26.method3543((long) local626);
										if (local2733 != null && local2733.anInt4289 == local620) {
											Static92.anIntArray502[local3++] = 1;
										} else {
											Static92.anIntArray502[local3++] = 0;
										}
										continue;
									}
								} else if (local38 < 2900) {
									local3--;
									local885 = Static53.method968(Static92.anIntArray502[local3]);
									if (local38 == 2800) {
										Static92.anIntArray502[local3++] = Static37.method679(local885).method3059();
										continue;
									}
									if (local38 == 2801) {
										local3--;
										local620 = Static92.anIntArray502[local3];
										local620--;
										if (local885.aStringArray17 != null && local885.aStringArray17.length > local620 && local885.aStringArray17[local620] != null) {
											Static191.aStringArray28[local11++] = local885.aStringArray17[local620];
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 2802) {
										if (local885.aString123 == null) {
											Static191.aStringArray28[local11++] = "";
										} else {
											Static191.aStringArray28[local11++] = local885.aString123;
										}
										continue;
									}
								} else if (local38 < 3200) {
									if (local38 == 3100) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static243.method4744(local418, 0, "");
										continue;
									}
									if (local38 == 3101) {
										local3 -= 2;
										Static299.method4547(Static90.aClass15_Sub5_Sub2_2, Static92.anIntArray502[local3], Static92.anIntArray502[local3 + 1]);
										continue;
									}
									if (local38 == 3103) {
										Static173.method2914();
										continue;
									}
									if (local38 == 3104) {
										local620 = 0;
										local11--;
										local418 = Static191.aStringArray28[local11];
										if (Static222.method3455(local418)) {
											local620 = Static110.method1981(local418);
										}
										Static127.aClass1_Sub14_Sub1_3.method1408(242);
										Static127.aClass1_Sub14_Sub1_3.method1387(local620);
										continue;
									}
									if (local38 == 3105) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static127.aClass1_Sub14_Sub1_3.method1408(37);
										Static127.aClass1_Sub14_Sub1_3.method1374(Static124.method4681(local418));
										continue;
									}
									if (local38 == 3106) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static127.aClass1_Sub14_Sub1_3.method1408(36);
										Static127.aClass1_Sub14_Sub1_3.method1390(local418.length() + 1);
										Static127.aClass1_Sub14_Sub1_3.method1385(local418);
										continue;
									}
									if (local38 == 3107) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										local11--;
										local1276 = Static191.aStringArray28[local11];
										Static273.method4256(local626, local1276);
										continue;
									}
									if (local38 == 3108) {
										local3 -= 3;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										local1681 = Static92.anIntArray502[local3 + 2];
										local2943 = Static53.method968(local1681);
										Static6.method39(local620, local626, local2943);
										continue;
									}
									if (local38 == 3109) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local2965 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
										local620 = Static92.anIntArray502[local3 + 1];
										Static6.method39(local620, local626, local2965);
										continue;
									}
									if (local38 == 3110) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static127.aClass1_Sub14_Sub1_3.method1408(25);
										Static127.aClass1_Sub14_Sub1_3.method1338(local626);
										continue;
									}
								} else if (local38 < 3300) {
									if (local38 == 3200) {
										local3 -= 3;
										Static100.method1818(Static92.anIntArray502[local3 + 1], Static92.anIntArray502[local3], Static92.anIntArray502[local3 + 2], 255);
										continue;
									}
									if (local38 == 3201) {
										local3--;
										Static50.method952(255, Static92.anIntArray502[local3]);
										continue;
									}
									if (local38 == 3202) {
										local3 -= 2;
										Static116.method2099(Static92.anIntArray502[local3], Static92.anIntArray502[local3 + 1], 255);
										continue;
									}
								} else if (local38 < 3400) {
									if (local38 == 3300) {
										Static92.anIntArray502[local3++] = Static313.anInt2966;
										continue;
									}
									if (local38 == 3301) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static47.method898(local626, local620);
										continue;
									}
									if (local38 == 3302) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = Static13.method175(local626, local620);
										continue;
									}
									if (local38 == 3303) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = Static284.method4369(local626, local620);
										continue;
									}
									if (local38 == 3304) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static53.method966(local626).anInt3999;
										continue;
									}
									if (local38 == 3305) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static11.anIntArray12[local626];
										continue;
									}
									if (local38 == 3306) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static288.anIntArray459[local626];
										continue;
									}
									if (local38 == 3307) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static199.anIntArray312[local626];
										continue;
									}
									if (local38 == 3308) {
										local626 = Static65.anInt1300;
										local1681 = (Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7) + Static192.anInt3637;
										local620 = (Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7) + Static199.anInt3817;
										Static92.anIntArray502[local3++] = local1681 + (local626 << 28) + (local620 << 14);
										continue;
									}
									if (local38 == 3309) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local626 >> 14 & 0x3FFF;
										continue;
									}
									if (local38 == 3310) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local626 >> 28;
										continue;
									}
									if (local38 == 3311) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local626 & 0x3FFF;
										continue;
									}
									if (local38 == 3312) {
										Static92.anIntArray502[local3++] = Static254.aBoolean315 ? 1 : 0;
										continue;
									}
									if (local38 == 3313) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3] + 32768;
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = Static47.method898(local626, local620);
										continue;
									}
									if (local38 == 3314) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3] + 32768;
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = Static13.method175(local626, local620);
										continue;
									}
									if (local38 == 3315) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3] + 32768;
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = Static284.method4369(local626, local620);
										continue;
									}
									if (local38 == 3316) {
										if (Static137.anInt2751 < 2) {
											Static92.anIntArray502[local3++] = 0;
										} else {
											Static92.anIntArray502[local3++] = Static137.anInt2751;
										}
										continue;
									}
									if (local38 == 3317) {
										Static92.anIntArray502[local3++] = Static163.anInt3253;
										continue;
									}
									if (local38 == 3318) {
										Static92.anIntArray502[local3++] = Static312.anInt5731;
										continue;
									}
									if (local38 == 3321) {
										Static92.anIntArray502[local3++] = Static118.anInt2474;
										continue;
									}
									if (local38 == 3322) {
										Static92.anIntArray502[local3++] = Static135.anInt2716;
										continue;
									}
									if (local38 == 3323) {
										if (Static181.anInt3484 >= 5 && Static181.anInt3484 <= 9) {
											Static92.anIntArray502[local3++] = 1;
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3324) {
										if (Static181.anInt3484 >= 5 && Static181.anInt3484 <= 9) {
											Static92.anIntArray502[local3++] = Static181.anInt3484;
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3325) {
										Static92.anIntArray502[local3++] = Static72.aBoolean364 ? 1 : 0;
										continue;
									}
									if (local38 == 3326) {
										Static92.anIntArray502[local3++] = Static90.aClass15_Sub5_Sub2_2.anInt5625;
										continue;
									}
									if (local38 == 3327) {
										Static92.anIntArray502[local3++] = Static90.aClass15_Sub5_Sub2_2.aClass167_6.aBoolean336 ? 1 : 0;
										continue;
									}
									if (local38 == 3328) {
										Static92.anIntArray502[local3++] = Static232.aBoolean293 && !Static180.aBoolean233 ? 1 : 0;
										continue;
									}
									if (local38 == 3329) {
										Static92.anIntArray502[local3++] = Static272.aBoolean387 ? 1 : 0;
										continue;
									}
									if (local38 == 3330) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static251.method3969(local626);
										continue;
									}
									if (local38 == 3331) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static26.method437(local626, false, local620);
										continue;
									}
									if (local38 == 3332) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static26.method437(local626, true, local620);
										continue;
									}
									if (local38 == 3333) {
										Static92.anIntArray502[local3++] = Static228.anInt4197;
										continue;
									}
									if (local38 == 3335) {
										Static92.anIntArray502[local3++] = Static114.anInt2371;
										continue;
									}
									if (local38 == 3336) {
										local3 -= 4;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										local626 += local620 << 14;
										local1681 = Static92.anIntArray502[local3 + 2];
										local464 = Static92.anIntArray502[local3 + 3];
										local626 += local1681 << 28;
										local626 += local464;
										Static92.anIntArray502[local3++] = local626;
										continue;
									}
									if (local38 == 3337) {
										Static92.anIntArray502[local3++] = Static71.anInt1519;
										continue;
									}
								} else if (local38 < 3500) {
									@Pc(13320) Class1_Sub2_Sub2 local13320;
									if (local38 == 3400) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										local13320 = Static181.method2988(local626);
										if (local13320.aChar1 == 's') {
										}
										Static191.aStringArray28[local11++] = local13320.method152(local620);
										continue;
									}
									if (local38 == 3408) {
										local3 -= 4;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										local1681 = Static92.anIntArray502[local3 + 2];
										local464 = Static92.anIntArray502[local3 + 3];
										@Pc(13368) Class1_Sub2_Sub2 local13368 = Static181.method2988(local1681);
										if (local13368.aChar2 == local626 && local620 == local13368.aChar1) {
											if (local620 == 115) {
												Static191.aStringArray28[local11++] = local13368.method152(local464);
											} else {
												Static92.anIntArray502[local3++] = local13368.method153(local464);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local38 == 3409) {
										local3 -= 3;
										local626 = Static92.anIntArray502[local3];
										local1681 = Static92.anIntArray502[local3 + 2];
										local620 = Static92.anIntArray502[local3 + 1];
										if (local620 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(13443) Class1_Sub2_Sub2 local13443 = Static181.method2988(local620);
										if (local626 != local13443.aChar1) {
											throw new RuntimeException("C3409-1");
										}
										Static92.anIntArray502[local3++] = local13443.method158(local1681) ? 1 : 0;
										continue;
									}
									if (local38 == 3410) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										local11--;
										local1276 = Static191.aStringArray28[local11];
										if (local626 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local13320 = Static181.method2988(local626);
										if (local13320.aChar1 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static92.anIntArray502[local3++] = local13320.method157(local1276) ? 1 : 0;
										continue;
									}
									if (local38 == 3411) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										@Pc(13537) Class1_Sub2_Sub2 local13537 = Static181.method2988(local626);
										Static92.anIntArray502[local3++] = local13537.aClass142_1.method3529();
										continue;
									}
								} else if (local38 < 3700) {
									if (local38 == 3600) {
										if (Static138.anInt2776 == 0) {
											Static92.anIntArray502[local3++] = -2;
										} else if (Static138.anInt2776 == 1) {
											Static92.anIntArray502[local3++] = -1;
										} else {
											Static92.anIntArray502[local3++] = Static120.anInt2510;
										}
										continue;
									}
									if (local38 == 3601) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static138.anInt2776 == 2 && local626 < Static120.anInt2510) {
											Static191.aStringArray28[local11++] = Static106.aStringArray16[local626];
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 3602) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static138.anInt2776 == 2 && local626 < Static120.anInt2510) {
											Static92.anIntArray502[local3++] = Static170.anIntArray283[local626];
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3603) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static138.anInt2776 == 2 && Static120.anInt2510 > local626) {
											Static92.anIntArray502[local3++] = Static63.anIntArray276[local626];
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3604) {
										local3--;
										local620 = Static92.anIntArray502[local3];
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static24.method377(local418, local620);
										continue;
									}
									if (local38 == 3605) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static224.method3482(Static124.method4681(local418));
										continue;
									}
									if (local38 == 3606) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static228.method3533(Static124.method4681(local418));
										continue;
									}
									if (local38 == 3607) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static29.method472(Static124.method4681(local418), false);
										continue;
									}
									if (local38 == 3608) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static28.method463(Static124.method4681(local418));
										continue;
									}
									if (local38 == 3609) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										if (local418.startsWith("<img=0>") || local418.startsWith("<img=1>")) {
											local418 = local418.substring(7);
										}
										Static92.anIntArray502[local3++] = Static296.method4523(local418) ? 1 : 0;
										continue;
									}
									if (local38 == 3610) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static138.anInt2776 == 2 && Static120.anInt2510 > local626) {
											Static191.aStringArray28[local11++] = Static239.aStringArray33[local626];
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 3611) {
										if (Static37.aString42 == null) {
											Static191.aStringArray28[local11++] = "";
										} else {
											Static191.aStringArray28[local11++] = Static26.method434(Static37.aString42);
										}
										continue;
									}
									if (local38 == 3612) {
										if (Static37.aString42 == null) {
											Static92.anIntArray502[local3++] = 0;
										} else {
											Static92.anIntArray502[local3++] = Static140.anInt5208;
										}
										continue;
									}
									if (local38 == 3613) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static37.aString42 != null && local626 < Static140.anInt5208) {
											Static191.aStringArray28[local11++] = Static26.method434(Static245.aClass1_Sub6Array1[local626].aString27);
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 3614) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static37.aString42 != null && local626 < Static140.anInt5208) {
											Static92.anIntArray502[local3++] = Static245.aClass1_Sub6Array1[local626].anInt394;
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3615) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static37.aString42 != null && local626 < Static140.anInt5208) {
											Static92.anIntArray502[local3++] = Static245.aClass1_Sub6Array1[local626].aByte1;
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3616) {
										Static92.anIntArray502[local3++] = Static60.aByte6;
										continue;
									}
									if (local38 == 3617) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static214.method3360(local418);
										continue;
									}
									if (local38 == 3618) {
										Static92.anIntArray502[local3++] = Static204.aByte23;
										continue;
									}
									if (local38 == 3619) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static280.method4334(Static124.method4681(local418));
										continue;
									}
									if (local38 == 3620) {
										Static233.method3603();
										continue;
									}
									if (local38 == 3621) {
										if (Static138.anInt2776 == 0) {
											Static92.anIntArray502[local3++] = -1;
										} else {
											Static92.anIntArray502[local3++] = Static72.anInt5402;
										}
										continue;
									}
									if (local38 == 3622) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static138.anInt2776 != 0 && Static72.anInt5402 > local626) {
											Static191.aStringArray28[local11++] = Static113.method2021(Static29.aLongArray3[local626]);
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 3623) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										if (local418.startsWith("<img=0>") || local418.startsWith("<img=1>")) {
											local418 = local418.substring(7);
										}
										Static92.anIntArray502[local3++] = Static118.method2111(local418) ? 1 : 0;
										continue;
									}
									if (local38 == 3624) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static245.aClass1_Sub6Array1 != null && local626 < Static140.anInt5208 && Static245.aClass1_Sub6Array1[local626].aString27.equalsIgnoreCase(Static90.aClass15_Sub5_Sub2_2.aString336)) {
											Static92.anIntArray502[local3++] = 1;
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3625) {
										if (Static98.aString116 == null) {
											Static191.aStringArray28[local11++] = "";
										} else {
											Static191.aStringArray28[local11++] = Static26.method434(Static98.aString116);
										}
										continue;
									}
									if (local38 == 3626) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static37.aString42 != null && Static140.anInt5208 > local626) {
											Static191.aStringArray28[local11++] = Static245.aClass1_Sub6Array1[local626].aString28;
											continue;
										}
										Static191.aStringArray28[local11++] = "";
										continue;
									}
									if (local38 == 3627) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										if (Static138.anInt2776 == 2 && local626 >= 0 && local626 < Static120.anInt2510) {
											Static92.anIntArray502[local3++] = Static208.aBooleanArray17[local626] ? 1 : 0;
											continue;
										}
										Static92.anIntArray502[local3++] = 0;
										continue;
									}
									if (local38 == 3628) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										if (local418.startsWith("<img=0>") || local418.startsWith("<img=1>")) {
											local418 = local418.substring(7);
										}
										Static92.anIntArray502[local3++] = Static299.method4548(local418);
										continue;
									}
									if (local38 == 3629) {
										Static92.anIntArray502[local3++] = Static212.anInt650;
										continue;
									}
									if (local38 == 3630) {
										local11--;
										local418 = Static191.aStringArray28[local11];
										Static29.method472(Static124.method4681(local418), true);
										continue;
									}
									if (local38 == 3631) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static279.aBooleanArray22[local626] ? 1 : 0;
										continue;
									}
								} else if (local38 < 4000) {
									if (local38 == 3903) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static42.aClass50Array1[local626].method1558();
										continue;
									}
									if (local38 == 3904) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static42.aClass50Array1[local626].anInt1623;
										continue;
									}
									if (local38 == 3905) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static42.aClass50Array1[local626].anInt1624;
										continue;
									}
									if (local38 == 3906) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static42.aClass50Array1[local626].anInt1622;
										continue;
									}
									if (local38 == 3907) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static42.aClass50Array1[local626].anInt1619;
										continue;
									}
									if (local38 == 3908) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = Static42.aClass50Array1[local626].anInt1618;
										continue;
									}
									if (local38 == 3910) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										local620 = Static42.aClass50Array1[local626].method1556();
										Static92.anIntArray502[local3++] = local620 == 0 ? 1 : 0;
										continue;
									}
									if (local38 == 3911) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										local620 = Static42.aClass50Array1[local626].method1556();
										Static92.anIntArray502[local3++] = local620 == 2 ? 1 : 0;
										continue;
									}
									if (local38 == 3912) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										local620 = Static42.aClass50Array1[local626].method1556();
										Static92.anIntArray502[local3++] = local620 == 5 ? 1 : 0;
										continue;
									}
									if (local38 == 3913) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										local620 = Static42.aClass50Array1[local626].method1556();
										Static92.anIntArray502[local3++] = local620 == 1 ? 1 : 0;
										continue;
									}
								} else if (local38 >= 4100) {
									@Pc(5758) boolean local5758;
									if (local38 >= 4200) {
										@Pc(5162) Class1_Sub2_Sub17 local5162;
										if (local38 < 4300) {
											if (local38 == 4200) {
												local3--;
												local626 = Static92.anIntArray502[local3];
												Static191.aStringArray28[local11++] = Static49.method909(local626).aString181;
												continue;
											}
											@Pc(4912) Class102 local4912;
											if (local38 == 4201) {
												local3 -= 2;
												local626 = Static92.anIntArray502[local3];
												local620 = Static92.anIntArray502[local3 + 1];
												local4912 = Static49.method909(local626);
												if (local620 >= 1 && local620 <= 5 && local4912.aStringArray24[local620 - 1] != null) {
													Static191.aStringArray28[local11++] = local4912.aStringArray24[local620 - 1];
													continue;
												}
												Static191.aStringArray28[local11++] = "";
												continue;
											}
											if (local38 == 4202) {
												local3 -= 2;
												local626 = Static92.anIntArray502[local3];
												local620 = Static92.anIntArray502[local3 + 1];
												local4912 = Static49.method909(local626);
												if (local620 >= 1 && local620 <= 5 && local4912.aStringArray23[local620 - 1] != null) {
													Static191.aStringArray28[local11++] = local4912.aStringArray23[local620 - 1];
													continue;
												}
												Static191.aStringArray28[local11++] = "";
												continue;
											}
											if (local38 == 4203) {
												local3--;
												local626 = Static92.anIntArray502[local3];
												Static92.anIntArray502[local3++] = Static49.method909(local626).anInt3194;
												continue;
											}
											if (local38 == 4204) {
												local3--;
												local626 = Static92.anIntArray502[local3];
												Static92.anIntArray502[local3++] = Static49.method909(local626).anInt3185 == 1 ? 1 : 0;
												continue;
											}
											@Pc(5058) Class102 local5058;
											if (local38 == 4205) {
												local3--;
												local626 = Static92.anIntArray502[local3];
												local5058 = Static49.method909(local626);
												if (local5058.anInt3224 == -1 && local5058.anInt3213 >= 0) {
													Static92.anIntArray502[local3++] = local5058.anInt3213;
													continue;
												}
												Static92.anIntArray502[local3++] = local626;
												continue;
											}
											if (local38 == 4206) {
												local3--;
												local626 = Static92.anIntArray502[local3];
												local5058 = Static49.method909(local626);
												if (local5058.anInt3224 >= 0 && local5058.anInt3213 >= 0) {
													Static92.anIntArray502[local3++] = local5058.anInt3213;
													continue;
												}
												Static92.anIntArray502[local3++] = local626;
												continue;
											}
											if (local38 == 4207) {
												local3--;
												local626 = Static92.anIntArray502[local3];
												Static92.anIntArray502[local3++] = Static49.method909(local626).aBoolean219 ? 1 : 0;
												continue;
											}
											if (local38 == 4208) {
												local3 -= 2;
												local620 = Static92.anIntArray502[local3 + 1];
												local626 = Static92.anIntArray502[local3];
												local5162 = Static30.method498(local620);
												if (local5162.method3963()) {
													Static191.aStringArray28[local11++] = Static49.method909(local626).method2787(local620, local5162.aString269);
												} else {
													Static92.anIntArray502[local3++] = Static49.method909(local626).method2783(local5162.anInt4543, local620);
												}
												continue;
											}
											if (local38 == 4210) {
												local3--;
												local620 = Static92.anIntArray502[local3];
												local11--;
												local418 = Static191.aStringArray28[local11];
												Static64.method1153(local418, local620 == 1);
												Static92.anIntArray502[local3++] = Static136.anInt2742;
												continue;
											}
											if (local38 == 4211) {
												if (Static86.aShortArray35 != null && Static136.anInt2742 > Static169.anInt3314) {
													Static92.anIntArray502[local3++] = Static86.aShortArray35[Static169.anInt3314++] & 0xFFFF;
													continue;
												}
												Static92.anIntArray502[local3++] = -1;
												continue;
											}
											if (local38 == 4212) {
												Static169.anInt3314 = 0;
												continue;
											}
										} else if (local38 >= 4400) {
											if (local38 >= 4500) {
												if (local38 >= 4600) {
													if (local38 < 5100) {
														if (local38 == 5000) {
															Static92.anIntArray502[local3++] = Static189.anInt3606;
															continue;
														}
														if (local38 == 5001) {
															local3 -= 3;
															Static189.anInt3606 = Static92.anIntArray502[local3];
															Static84.anInt1667 = Static92.anIntArray502[local3 + 1];
															Static165.anInt3259 = Static92.anIntArray502[local3 + 2];
															Static127.aClass1_Sub14_Sub1_3.method1408(8);
															Static127.aClass1_Sub14_Sub1_3.method1390(Static189.anInt3606);
															Static127.aClass1_Sub14_Sub1_3.method1390(Static84.anInt1667);
															Static127.aClass1_Sub14_Sub1_3.method1390(Static165.anInt3259);
															continue;
														}
														if (local38 == 5002) {
															local3 -= 2;
															local11--;
															local418 = Static191.aStringArray28[local11];
															local1681 = Static92.anIntArray502[local3 + 1];
															local620 = Static92.anIntArray502[local3];
															Static127.aClass1_Sub14_Sub1_3.method1408(57);
															Static127.aClass1_Sub14_Sub1_3.method1374(Static124.method4681(local418));
															Static127.aClass1_Sub14_Sub1_3.method1390(local620 - 1);
															Static127.aClass1_Sub14_Sub1_3.method1390(local1681);
															continue;
														}
														if (local38 == 5003) {
															local1276 = null;
															local3--;
															local626 = Static92.anIntArray502[local3];
															if (local626 < 100) {
																local1276 = Static191.aStringArray29[local626];
															}
															if (local1276 == null) {
																local1276 = "";
															}
															Static191.aStringArray28[local11++] = local1276;
															continue;
														}
														if (local38 == 5004) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															local620 = -1;
															if (local626 < 100 && Static191.aStringArray29[local626] != null) {
																local620 = Static188.anIntArray297[local626];
															}
															Static92.anIntArray502[local3++] = local620;
															continue;
														}
														if (local38 == 5005) {
															Static92.anIntArray502[local3++] = Static84.anInt1667;
															continue;
														}
														if (local38 == 5008) {
															local11--;
															local418 = Static191.aStringArray28[local11];
															if (local418.startsWith("::")) {
																Static40.method4536(local418);
																continue;
															}
															if (Static137.anInt2751 == 0 && (Static232.aBoolean293 && !Static180.aBoolean233 || Static272.aBoolean387)) {
																continue;
															}
															@Pc(10353) byte local10353 = 0;
															@Pc(10355) byte local10355 = 0;
															local1276 = local418.toLowerCase();
															if (local1276.startsWith(Static95.aString113)) {
																local418 = local418.substring(Static95.aString113.length());
																local10355 = 0;
															} else if (local1276.startsWith(Static80.aString97)) {
																local418 = local418.substring(Static80.aString97.length());
																local10355 = 1;
															} else if (local1276.startsWith(Static145.aString162)) {
																local418 = local418.substring(Static145.aString162.length());
																local10355 = 2;
															} else if (local1276.startsWith(Static174.aString195)) {
																local10355 = 3;
																local418 = local418.substring(Static174.aString195.length());
															} else if (local1276.startsWith(Static297.aString321)) {
																local418 = local418.substring(Static297.aString321.length());
																local10355 = 4;
															} else if (local1276.startsWith(Static27.aString33)) {
																local10355 = 5;
																local418 = local418.substring(Static27.aString33.length());
															} else if (local1276.startsWith(Static197.aString211)) {
																local10355 = 6;
																local418 = local418.substring(Static197.aString211.length());
															} else if (local1276.startsWith(Static40.aString323)) {
																local10355 = 7;
																local418 = local418.substring(Static40.aString323.length());
															} else if (local1276.startsWith(Static26.aString32)) {
																local10355 = 8;
																local418 = local418.substring(Static26.aString32.length());
															} else if (local1276.startsWith(Static280.aString299)) {
																local418 = local418.substring(Static280.aString299.length());
																local10355 = 9;
															} else if (local1276.startsWith(Static50.aString59)) {
																local418 = local418.substring(Static50.aString59.length());
																local10355 = 10;
															} else if (local1276.startsWith(Static20.aString25)) {
																local418 = local418.substring(Static20.aString25.length());
																local10355 = 11;
															} else if (Static114.anInt2371 != 0) {
																if (local1276.startsWith(Static226.aString234)) {
																	local10355 = 0;
																	local418 = local418.substring(Static226.aString234.length());
																} else if (local1276.startsWith(Static274.aString290)) {
																	local10355 = 1;
																	local418 = local418.substring(Static274.aString290.length());
																} else if (local1276.startsWith(Static20.aString24)) {
																	local418 = local418.substring(Static20.aString24.length());
																	local10355 = 2;
																} else if (local1276.startsWith(Static72.aString329)) {
																	local10355 = 3;
																	local418 = local418.substring(Static72.aString329.length());
																} else if (local1276.startsWith(Static72.aString328)) {
																	local10355 = 4;
																	local418 = local418.substring(Static72.aString328.length());
																} else if (local1276.startsWith(Static218.aString70)) {
																	local418 = local418.substring(Static218.aString70.length());
																	local10355 = 5;
																} else if (local1276.startsWith(Static126.aString109)) {
																	local10355 = 6;
																	local418 = local418.substring(Static126.aString109.length());
																} else if (local1276.startsWith(Static167.aString187)) {
																	local10355 = 7;
																	local418 = local418.substring(Static167.aString187.length());
																} else if (local1276.startsWith(Static192.aString208)) {
																	local10355 = 8;
																	local418 = local418.substring(Static192.aString208.length());
																} else if (local1276.startsWith(Static123.aString143)) {
																	local10355 = 9;
																	local418 = local418.substring(Static123.aString143.length());
																} else if (local1276.startsWith(Static131.aString150)) {
																	local418 = local418.substring(Static131.aString150.length());
																	local10355 = 10;
																} else if (local1276.startsWith(Static210.aString226)) {
																	local10355 = 11;
																	local418 = local418.substring(Static210.aString226.length());
																}
															}
															local1276 = local418.toLowerCase();
															if (local1276.startsWith(Static1.aString3)) {
																local10353 = 1;
																local418 = local418.substring(Static1.aString3.length());
															} else if (local1276.startsWith(Static206.aString219)) {
																local10353 = 2;
																local418 = local418.substring(Static206.aString219.length());
															} else if (local1276.startsWith(Static37.aString41)) {
																local418 = local418.substring(Static37.aString41.length());
																local10353 = 3;
															} else if (local1276.startsWith(Static279.aString294)) {
																local418 = local418.substring(Static279.aString294.length());
																local10353 = 4;
															} else if (local1276.startsWith(Static112.aString134)) {
																local10353 = 5;
																local418 = local418.substring(Static112.aString134.length());
															} else if (Static114.anInt2371 != 0) {
																if (local1276.startsWith(Static252.aString270)) {
																	local10353 = 1;
																	local418 = local418.substring(Static252.aString270.length());
																} else if (local1276.startsWith(Static151.aString165)) {
																	local10353 = 2;
																	local418 = local418.substring(Static151.aString165.length());
																} else if (local1276.startsWith(Static61.aString75)) {
																	local418 = local418.substring(Static61.aString75.length());
																	local10353 = 3;
																} else if (local1276.startsWith(Static170.aString192)) {
																	local10353 = 4;
																	local418 = local418.substring(Static170.aString192.length());
																} else if (local1276.startsWith(Static262.aString283)) {
																	local418 = local418.substring(Static262.aString283.length());
																	local10353 = 5;
																}
															}
															Static127.aClass1_Sub14_Sub1_3.method1408(104);
															Static127.aClass1_Sub14_Sub1_3.method1390(0);
															local1936 = Static127.aClass1_Sub14_Sub1_3.anInt1480;
															Static127.aClass1_Sub14_Sub1_3.method1390(local10355);
															Static127.aClass1_Sub14_Sub1_3.method1390(local10353);
															Static212.method615(local418, Static127.aClass1_Sub14_Sub1_3);
															Static127.aClass1_Sub14_Sub1_3.method1379(Static127.aClass1_Sub14_Sub1_3.anInt1480 - local1936);
															continue;
														}
														if (local38 == 5009) {
															local11 -= 2;
															local418 = Static191.aStringArray28[local11];
															local1276 = Static191.aStringArray28[local11 + 1];
															if (Static137.anInt2751 != 0 || (!Static232.aBoolean293 || Static180.aBoolean233) && !Static272.aBoolean387) {
																Static127.aClass1_Sub14_Sub1_3.method1408(252);
																Static127.aClass1_Sub14_Sub1_3.method1390(0);
																local1681 = Static127.aClass1_Sub14_Sub1_3.anInt1480;
																Static127.aClass1_Sub14_Sub1_3.method1374(Static124.method4681(local418));
																Static212.method615(local1276, Static127.aClass1_Sub14_Sub1_3);
																Static127.aClass1_Sub14_Sub1_3.method1379(Static127.aClass1_Sub14_Sub1_3.anInt1480 - local1681);
															}
															continue;
														}
														if (local38 == 5010) {
															local1276 = null;
															local3--;
															local626 = Static92.anIntArray502[local3];
															if (local626 < 100) {
																local1276 = Static77.aStringArray8[local626];
															}
															if (local1276 == null) {
																local1276 = "";
															}
															Static191.aStringArray28[local11++] = local1276;
															continue;
														}
														if (local38 == 5011) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															local1276 = null;
															if (local626 < 100) {
																local1276 = Static82.aStringArray11[local626];
															}
															if (local1276 == null) {
																local1276 = "";
															}
															Static191.aStringArray28[local11++] = local1276;
															continue;
														}
														if (local38 == 5012) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															local620 = -1;
															if (local626 < 100) {
																local620 = Static91.anIntArray163[local626];
															}
															Static92.anIntArray502[local3++] = local620;
															continue;
														}
														if (local38 == 5015) {
															if (Static90.aClass15_Sub5_Sub2_2 == null || Static90.aClass15_Sub5_Sub2_2.aString336 == null) {
																local418 = Static50.aString60;
															} else {
																local418 = Static90.aClass15_Sub5_Sub2_2.method4710();
															}
															Static191.aStringArray28[local11++] = local418;
															continue;
														}
														if (local38 == 5016) {
															Static92.anIntArray502[local3++] = Static165.anInt3259;
															continue;
														}
														if (local38 == 5017) {
															Static92.anIntArray502[local3++] = Static23.anInt398;
															continue;
														}
														if (local38 == 5050) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															Static191.aStringArray28[local11++] = Static97.method1794(local626).aString92;
															continue;
														}
														@Pc(11080) Class1_Sub2_Sub5 local11080;
														if (local38 == 5051) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															local11080 = Static97.method1794(local626);
															if (local11080.anIntArray122 == null) {
																Static92.anIntArray502[local3++] = 0;
															} else {
																Static92.anIntArray502[local3++] = local11080.anIntArray122.length;
															}
															continue;
														}
														if (local38 == 5052) {
															local3 -= 2;
															local626 = Static92.anIntArray502[local3];
															local620 = Static92.anIntArray502[local3 + 1];
															@Pc(11120) Class1_Sub2_Sub5 local11120 = Static97.method1794(local626);
															local464 = local11120.anIntArray122[local620];
															Static92.anIntArray502[local3++] = local464;
															continue;
														}
														if (local38 == 5053) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															local11080 = Static97.method1794(local626);
															if (local11080.anIntArray123 == null) {
																Static92.anIntArray502[local3++] = 0;
															} else {
																Static92.anIntArray502[local3++] = local11080.anIntArray123.length;
															}
															continue;
														}
														if (local38 == 5054) {
															local3 -= 2;
															local620 = Static92.anIntArray502[local3 + 1];
															local626 = Static92.anIntArray502[local3];
															Static92.anIntArray502[local3++] = Static97.method1794(local626).anIntArray123[local620];
															continue;
														}
														if (local38 == 5055) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															Static191.aStringArray28[local11++] = Static235.method4486(local626).method2223();
															continue;
														}
														if (local38 == 5056) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															@Pc(11226) Class1_Sub2_Sub7 local11226 = Static235.method4486(local626);
															if (local11226.anIntArray221 == null) {
																Static92.anIntArray502[local3++] = 0;
															} else {
																Static92.anIntArray502[local3++] = local11226.anIntArray221.length;
															}
															continue;
														}
														if (local38 == 5057) {
															local3 -= 2;
															local620 = Static92.anIntArray502[local3 + 1];
															local626 = Static92.anIntArray502[local3];
															Static92.anIntArray502[local3++] = Static235.method4486(local626).anIntArray221[local620];
															continue;
														}
														if (local38 == 5058) {
															Static188.aClass172_1 = new Class172();
															local3--;
															Static188.aClass172_1.anInt4960 = Static92.anIntArray502[local3];
															Static188.aClass172_1.aClass1_Sub2_Sub7_1 = Static235.method4486(Static188.aClass172_1.anInt4960);
															Static188.aClass172_1.anIntArray438 = new int[Static188.aClass172_1.aClass1_Sub2_Sub7_1.method2215()];
															continue;
														}
														if (local38 == 5059) {
															Static127.aClass1_Sub14_Sub1_3.method1408(106);
															Static127.aClass1_Sub14_Sub1_3.method1390(0);
															local626 = Static127.aClass1_Sub14_Sub1_3.anInt1480;
															Static127.aClass1_Sub14_Sub1_3.method1390(0);
															Static127.aClass1_Sub14_Sub1_3.method1338(Static188.aClass172_1.anInt4960);
															Static188.aClass172_1.aClass1_Sub2_Sub7_1.method2222(Static188.aClass172_1.anIntArray438, Static127.aClass1_Sub14_Sub1_3);
															Static127.aClass1_Sub14_Sub1_3.method1379(Static127.aClass1_Sub14_Sub1_3.anInt1480 - local626);
															continue;
														}
														if (local38 == 5060) {
															local11--;
															local418 = Static191.aStringArray28[local11];
															Static127.aClass1_Sub14_Sub1_3.method1408(147);
															Static127.aClass1_Sub14_Sub1_3.method1390(0);
															local620 = Static127.aClass1_Sub14_Sub1_3.anInt1480;
															Static127.aClass1_Sub14_Sub1_3.method1374(Static124.method4681(local418));
															Static127.aClass1_Sub14_Sub1_3.method1338(Static188.aClass172_1.anInt4960);
															Static188.aClass172_1.aClass1_Sub2_Sub7_1.method2222(Static188.aClass172_1.anIntArray438, Static127.aClass1_Sub14_Sub1_3);
															Static127.aClass1_Sub14_Sub1_3.method1379(Static127.aClass1_Sub14_Sub1_3.anInt1480 - local620);
															continue;
														}
														if (local38 == 5061) {
															Static127.aClass1_Sub14_Sub1_3.method1408(106);
															Static127.aClass1_Sub14_Sub1_3.method1390(0);
															local626 = Static127.aClass1_Sub14_Sub1_3.anInt1480;
															Static127.aClass1_Sub14_Sub1_3.method1390(1);
															Static127.aClass1_Sub14_Sub1_3.method1338(Static188.aClass172_1.anInt4960);
															Static188.aClass172_1.aClass1_Sub2_Sub7_1.method2222(Static188.aClass172_1.anIntArray438, Static127.aClass1_Sub14_Sub1_3);
															Static127.aClass1_Sub14_Sub1_3.method1379(Static127.aClass1_Sub14_Sub1_3.anInt1480 - local626);
															continue;
														}
														if (local38 == 5062) {
															local3 -= 2;
															local626 = Static92.anIntArray502[local3];
															local620 = Static92.anIntArray502[local3 + 1];
															Static92.anIntArray502[local3++] = Static97.method1794(local626).aCharArray2[local620];
															continue;
														}
														if (local38 == 5063) {
															local3 -= 2;
															local620 = Static92.anIntArray502[local3 + 1];
															local626 = Static92.anIntArray502[local3];
															Static92.anIntArray502[local3++] = Static97.method1794(local626).aCharArray1[local620];
															continue;
														}
														if (local38 == 5064) {
															local3 -= 2;
															local626 = Static92.anIntArray502[local3];
															local620 = Static92.anIntArray502[local3 + 1];
															if (local620 == -1) {
																Static92.anIntArray502[local3++] = -1;
															} else {
																Static92.anIntArray502[local3++] = Static97.method1794(local626).method1463((char) local620);
															}
															continue;
														}
														if (local38 == 5065) {
															local3 -= 2;
															local620 = Static92.anIntArray502[local3 + 1];
															local626 = Static92.anIntArray502[local3];
															if (local620 == -1) {
																Static92.anIntArray502[local3++] = -1;
															} else {
																Static92.anIntArray502[local3++] = Static97.method1794(local626).method1459((char) local620);
															}
															continue;
														}
														if (local38 == 5066) {
															local3--;
															local626 = Static92.anIntArray502[local3];
															Static92.anIntArray502[local3++] = Static235.method4486(local626).method2215();
															continue;
														}
														if (local38 == 5067) {
															local3 -= 2;
															local626 = Static92.anIntArray502[local3];
															local620 = Static92.anIntArray502[local3 + 1];
															local1681 = Static235.method4486(local626).method2221(local620);
															Static92.anIntArray502[local3++] = local1681;
															continue;
														}
														if (local38 == 5068) {
															local3 -= 2;
															local626 = Static92.anIntArray502[local3];
															local620 = Static92.anIntArray502[local3 + 1];
															Static188.aClass172_1.anIntArray438[local626] = local620;
															continue;
														}
														if (local38 == 5069) {
															local3 -= 2;
															local620 = Static92.anIntArray502[local3 + 1];
															local626 = Static92.anIntArray502[local3];
															Static188.aClass172_1.anIntArray438[local626] = local620;
															continue;
														}
														if (local38 == 5070) {
															local3 -= 3;
															local626 = Static92.anIntArray502[local3];
															local1681 = Static92.anIntArray502[local3 + 2];
															local620 = Static92.anIntArray502[local3 + 1];
															@Pc(11716) Class1_Sub2_Sub7 local11716 = Static235.method4486(local626);
															if (local11716.method2221(local620) != 0) {
																throw new RuntimeException("bad command");
															}
															Static92.anIntArray502[local3++] = local11716.method2220(local1681, local620);
															continue;
														}
														if (local38 == 5071) {
															local11--;
															local418 = Static191.aStringArray28[local11];
															local3--;
															local5954 = Static92.anIntArray502[local3] == 1;
															Static254.method4035(local5954, local418);
															Static92.anIntArray502[local3++] = Static136.anInt2742;
															continue;
														}
														if (local38 == 5072) {
															if (Static86.aShortArray35 != null && Static136.anInt2742 > Static169.anInt3314) {
																Static92.anIntArray502[local3++] = Static86.aShortArray35[Static169.anInt3314++] & 0xFFFF;
																continue;
															}
															Static92.anIntArray502[local3++] = -1;
															continue;
														}
														if (local38 == 5073) {
															Static169.anInt3314 = 0;
															continue;
														}
													} else if (local38 < 5200) {
														if (local38 == 5100) {
															if (Static32.aBooleanArray9[86]) {
																Static92.anIntArray502[local3++] = 1;
															} else {
																Static92.anIntArray502[local3++] = 0;
															}
															continue;
														}
														if (local38 == 5101) {
															if (Static32.aBooleanArray9[82]) {
																Static92.anIntArray502[local3++] = 1;
															} else {
																Static92.anIntArray502[local3++] = 0;
															}
															continue;
														}
														if (local38 == 5102) {
															if (Static32.aBooleanArray9[81]) {
																Static92.anIntArray502[local3++] = 1;
															} else {
																Static92.anIntArray502[local3++] = 0;
															}
															continue;
														}
													} else {
														@Pc(5790) boolean local5790;
														if (local38 < 5300) {
															if (local38 == 5200) {
																local3--;
																Static282.method4348(Static92.anIntArray502[local3]);
																continue;
															}
															if (local38 == 5201) {
																Static92.anIntArray502[local3++] = Static69.method4282();
																continue;
															}
															if (local38 == 5205) {
																local3--;
																Static257.method4074(false, Static92.anIntArray502[local3], -1, -1);
																continue;
															}
															@Pc(5422) Class1_Sub2_Sub21 local5422;
															if (local38 == 5206) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static109.method3581(local626 >> 14 & 0x3FFF, local626 & 0x3FFF);
																if (local5422 == null) {
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	Static92.anIntArray502[local3++] = local5422.anInt5071;
																}
																continue;
															}
															@Pc(5450) Class1_Sub2_Sub21 local5450;
															if (local38 == 5207) {
																local3--;
																local5450 = Static109.method3595(Static92.anIntArray502[local3]);
																if (local5450 != null && local5450.aString298 != null) {
																	Static191.aStringArray28[local11++] = local5450.aString298;
																	continue;
																}
																Static191.aStringArray28[local11++] = "";
																continue;
															}
															if (local38 == 5208) {
																Static92.anIntArray502[local3++] = Static36.anInt677;
																Static92.anIntArray502[local3++] = Static208.anInt3971;
																continue;
															}
															if (local38 == 5209) {
																Static92.anIntArray502[local3++] = Static125.anInt2557 + Static109.anInt4229;
																Static92.anIntArray502[local3++] = Static109.anInt4232 + Static109.anInt4231 - Static293.anInt5263 - 1;
																continue;
															}
															if (local38 == 5210) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static109.method3595(local626);
																if (local5422 == null) {
																	Static92.anIntArray502[local3++] = 0;
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	Static92.anIntArray502[local3++] = local5422.anInt5072 >> 14 & 0x3FFF;
																	Static92.anIntArray502[local3++] = local5422.anInt5072 & 0x3FFF;
																}
																continue;
															}
															if (local38 == 5211) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static109.method3595(local626);
																if (local5422 == null) {
																	Static92.anIntArray502[local3++] = 0;
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	Static92.anIntArray502[local3++] = local5422.anInt5079 - local5422.anInt5086;
																	Static92.anIntArray502[local3++] = local5422.anInt5074 - local5422.anInt5085;
																}
																continue;
															}
															@Pc(5618) Class1_Sub2_Sub12 local5618;
															if (local38 == 5212) {
																local5618 = Static249.method3934();
																if (local5618 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	Static92.anIntArray502[local3++] = local5618.anInt3591;
																	local620 = Static109.anInt4231 + Static109.anInt4232 - local5618.anInt3593 - 1 | Static109.anInt4229 + local5618.anInt3598 << 14 | local5618.anInt3601 << 28;
																	Static92.anIntArray502[local3++] = local620;
																}
																continue;
															}
															if (local38 == 5213) {
																local5618 = Static274.method4266();
																if (local5618 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	Static92.anIntArray502[local3++] = local5618.anInt3591;
																	local620 = Static109.anInt4232 + Static109.anInt4231 - local5618.anInt3593 - 1 | local5618.anInt3601 << 28 | local5618.anInt3598 + Static109.anInt4229 << 14;
																	Static92.anIntArray502[local3++] = local620;
																}
																continue;
															}
															if (local38 == 5214) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static204.method3265();
																if (local5422 != null) {
																	local5758 = local5422.method4333(local626 >> 28 & 0x3, local626 & 0x3FFF, Static98.anIntArray172, local626 >> 14 & 0x3FFF);
																	if (local5758) {
																		Static116.method2098(Static98.anIntArray172[1], Static98.anIntArray172[2]);
																	}
																}
																continue;
															}
															if (local38 == 5215) {
																local3 -= 2;
																local626 = Static92.anIntArray502[local3];
																local620 = Static92.anIntArray502[local3 + 1];
																local5790 = false;
																@Pc(5800) Class170 local5800 = Static109.method3586(local626 >> 14 & 0x3FFF, local626 & 0x3FFF);
																for (@Pc(5805) Class1_Sub2_Sub21 local5805 = (Class1_Sub2_Sub21) local5800.method4212(); local5805 != null; local5805 = (Class1_Sub2_Sub21) local5800.method4207()) {
																	if (local5805.anInt5071 == local620) {
																		local5790 = true;
																		break;
																	}
																}
																if (local5790) {
																	Static92.anIntArray502[local3++] = 1;
																} else {
																	Static92.anIntArray502[local3++] = 0;
																}
																continue;
															}
															if (local38 == 5218) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static109.method3595(local626);
																if (local5422 == null) {
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	Static92.anIntArray502[local3++] = local5422.anInt5084;
																}
																continue;
															}
															if (local38 == 5220) {
																Static92.anIntArray502[local3++] = Static155.anInt3037 == 100 ? 1 : 0;
																continue;
															}
															if (local38 == 5221) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																Static116.method2098(local626 >> 14 & 0x3FFF, local626 & 0x3FFF);
																continue;
															}
															if (local38 == 5222) {
																local5450 = Static204.method3265();
																if (local5450 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	local5954 = local5450.method4335(Static98.anIntArray172, Static125.anInt2557 + Static109.anInt4229, Static109.anInt4232 + (Static109.anInt4231 - (1 - -Static293.anInt5263)));
																	if (local5954) {
																		Static92.anIntArray502[local3++] = Static98.anIntArray172[1];
																		Static92.anIntArray502[local3++] = Static98.anIntArray172[2];
																	} else {
																		Static92.anIntArray502[local3++] = -1;
																		Static92.anIntArray502[local3++] = -1;
																	}
																}
																continue;
															}
															if (local38 == 5223) {
																local3 -= 2;
																local620 = Static92.anIntArray502[local3 + 1];
																local626 = Static92.anIntArray502[local3];
																Static257.method4074(false, local626, local620 & 0x3FFF, local620 >> 14 & 0x3FFF);
																continue;
															}
															if (local38 == 5224) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static204.method3265();
																if (local5422 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	local5758 = local5422.method4333(local626 >> 28 & 0x3, local626 & 0x3FFF, Static98.anIntArray172, local626 >> 14 & 0x3FFF);
																	if (local5758) {
																		Static92.anIntArray502[local3++] = Static98.anIntArray172[1];
																		Static92.anIntArray502[local3++] = Static98.anIntArray172[2];
																	} else {
																		Static92.anIntArray502[local3++] = -1;
																		Static92.anIntArray502[local3++] = -1;
																	}
																}
																continue;
															}
															if (local38 == 5225) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5422 = Static204.method3265();
																if (local5422 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = -1;
																} else {
																	local5758 = local5422.method4335(Static98.anIntArray172, local626 >> 14 & 0x3FFF, local626 & 0x3FFF);
																	if (local5758) {
																		Static92.anIntArray502[local3++] = Static98.anIntArray172[1];
																		Static92.anIntArray502[local3++] = Static98.anIntArray172[2];
																	} else {
																		Static92.anIntArray502[local3++] = -1;
																		Static92.anIntArray502[local3++] = -1;
																	}
																}
																continue;
															}
															if (local38 == 5226) {
																local3--;
																Static251.method3968(Static92.anIntArray502[local3]);
																continue;
															}
															if (local38 == 5227) {
																local3 -= 2;
																local626 = Static92.anIntArray502[local3];
																local620 = Static92.anIntArray502[local3 + 1];
																Static257.method4074(true, local626, local620 & 0x3FFF, local620 >> 14 & 0x3FFF);
																continue;
															}
															if (local38 == 5228) {
																local3--;
																Static285.aBoolean350 = Static92.anIntArray502[local3] == 1;
																continue;
															}
															if (local38 == 5229) {
																Static92.anIntArray502[local3++] = Static285.aBoolean350 ? 1 : 0;
																continue;
															}
															if (local38 == 5230) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																Static218.method1088(local626);
																continue;
															}
															@Pc(6282) Class1 local6282;
															if (local38 == 5231) {
																local3 -= 2;
																local626 = Static92.anIntArray502[local3];
																local5954 = Static92.anIntArray502[local3 + 1] == 1;
																if (Static56.aClass142_4 == null) {
																	continue;
																}
																local6282 = Static56.aClass142_4.method3543((long) local626);
																if (local6282 != null && !local5954) {
																	local6282.method4779();
																	continue;
																}
																if (local6282 == null && local5954) {
																	local6282 = new Class1();
																	Static56.aClass142_4.method3537(local6282, (long) local626);
																}
																continue;
															}
															@Pc(6325) Class1 local6325;
															if (local38 == 5232) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (Static56.aClass142_4 == null) {
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	local6325 = Static56.aClass142_4.method3543((long) local626);
																	Static92.anIntArray502[local3++] = local6325 == null ? 0 : 1;
																}
																continue;
															}
															if (local38 == 5233) {
																local3 -= 2;
																local626 = Static92.anIntArray502[local3];
																local5954 = Static92.anIntArray502[local3 + 1] == 1;
																if (Static240.aClass142_22 == null) {
																	continue;
																}
																local6282 = Static240.aClass142_22.method3543((long) local626);
																if (local6282 != null && !local5954) {
																	local6282.method4779();
																	continue;
																}
																if (local6282 == null && local5954) {
																	local6282 = new Class1();
																	Static240.aClass142_22.method3537(local6282, (long) local626);
																}
																continue;
															}
															if (local38 == 5234) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (Static240.aClass142_22 == null) {
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	local6325 = Static240.aClass142_22.method3543((long) local626);
																	Static92.anIntArray502[local3++] = local6325 == null ? 0 : 1;
																}
																continue;
															}
															if (local38 == 5235) {
																Static92.anIntArray502[local3++] = Static109.aClass1_Sub2_Sub21_3 == null ? -1 : Static109.aClass1_Sub2_Sub21_3.anInt5071;
																continue;
															}
														} else if (local38 < 5400) {
															if (local38 == 5300) {
																local3 -= 2;
																local620 = Static92.anIntArray502[local3 + 1];
																local626 = Static92.anIntArray502[local3];
																Static259.method4091(false, 3, local626, local620);
																Static92.anIntArray502[local3++] = Static275.aFrame2 == null ? 0 : 1;
																continue;
															}
															if (local38 == 5301) {
																if (Static275.aFrame2 != null) {
																	Static259.method4091(false, Static41.anInt852, -1, -1);
																}
																continue;
															}
															if (local38 == 5302) {
																@Pc(9966) Class83[] local9966 = Static154.method2640();
																Static92.anIntArray502[local3++] = local9966.length;
																continue;
															}
															if (local38 == 5303) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																@Pc(9985) Class83[] local9985 = Static154.method2640();
																Static92.anIntArray502[local3++] = local9985[local626].anInt2590;
																Static92.anIntArray502[local3++] = local9985[local626].anInt2586;
																continue;
															}
															if (local38 == 5305) {
																local620 = Static218.anInt1144;
																local626 = Static48.anInt956;
																local1681 = -1;
																@Pc(10018) Class83[] local10018 = Static154.method2640();
																for (local1936 = 0; local1936 < local10018.length; local1936++) {
																	@Pc(10032) Class83 local10032 = local10018[local1936];
																	if (local10032.anInt2590 == local626 && local10032.anInt2586 == local620) {
																		local1681 = local1936;
																		break;
																	}
																}
																Static92.anIntArray502[local3++] = local1681;
																continue;
															}
															if (local38 == 5306) {
																Static92.anIntArray502[local3++] = Static228.method3541();
																continue;
															}
															if (local38 == 5307) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0 || local626 > 2) {
																	local626 = 0;
																}
																Static259.method4091(false, local626, -1, -1);
																continue;
															}
															if (local38 == 5308) {
																Static92.anIntArray502[local3++] = Static41.anInt852;
																continue;
															}
															if (local38 == 5309) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0 || local626 > 2) {
																	local626 = 0;
																}
																Static41.anInt852 = local626;
																Static286.method4396(Static26.aClass154_1);
																continue;
															}
														} else if (local38 < 5500) {
															if (local38 == 5400) {
																local3--;
																local1681 = Static92.anIntArray502[local3];
																local11 -= 2;
																local1276 = Static191.aStringArray28[local11 + 1];
																local418 = Static191.aStringArray28[local11];
																Static127.aClass1_Sub14_Sub1_3.method1408(39);
																Static127.aClass1_Sub14_Sub1_3.method1390(Static84.method1587(local418) + Static84.method1587(local1276) + 1);
																Static127.aClass1_Sub14_Sub1_3.method1385(local418);
																Static127.aClass1_Sub14_Sub1_3.method1385(local1276);
																Static127.aClass1_Sub14_Sub1_3.method1390(local1681);
																continue;
															}
															if (local38 == 5401) {
																local3 -= 2;
																Static252.aShortArray89[Static92.anIntArray502[local3]] = (short) Static6.method40(Static92.anIntArray502[local3 + 1]);
																Static210.method3347();
																Static118.method2110();
																Static70.method1413();
																Static127.method2224();
																Static11.method155();
																continue;
															}
															if (local38 == 5405) {
																local3 -= 2;
																local620 = Static92.anIntArray502[local3 + 1];
																local626 = Static92.anIntArray502[local3];
																if (local626 >= 0 && local626 < 2) {
																	Static249.anIntArrayArrayArray14[local626] = new int[local620 << 1][4];
																}
																continue;
															}
															if (local38 == 5406) {
																local3 -= 7;
																local626 = Static92.anIntArray502[local3];
																local464 = Static92.anIntArray502[local3 + 3];
																local1681 = Static92.anIntArray502[local3 + 2];
																local1936 = Static92.anIntArray502[local3 + 4];
																local620 = Static92.anIntArray502[local3 + 1] << 1;
																local6633 = Static92.anIntArray502[local3 + 5];
																@Pc(6639) int local6639 = Static92.anIntArray502[local3 + 6];
																if (local626 >= 0 && local626 < 2 && Static249.anIntArrayArrayArray14[local626] != null && local620 >= 0 && Static249.anIntArrayArrayArray14[local626].length > local620) {
																	Static249.anIntArrayArrayArray14[local626][local620] = new int[] { (local1681 >> 14 & 0x3FFF) * 128, local464, (local1681 & 0x3FFF) * 128, local6639 };
																	Static249.anIntArrayArrayArray14[local626][local620 + 1] = new int[] { (local1936 >> 14 & 0x3FFF) * 128, local6633, (local1936 & 0x3FFF) * 128 };
																}
																continue;
															}
															if (local38 == 5407) {
																local3--;
																local626 = Static249.anIntArrayArrayArray14[Static92.anIntArray502[local3]].length >> 1;
																Static92.anIntArray502[local3++] = local626;
																continue;
															}
															if (local38 == 5411) {
																if (Static275.aFrame2 != null) {
																	Static259.method4091(false, Static41.anInt852, -1, -1);
																}
																if (Static197.aFrame1 == null) {
																	Static56.method983(Static182.method2993(), false);
																} else {
																	System.exit(0);
																}
																continue;
															}
															if (local38 == 5419) {
																local418 = "";
																if (Static98.aClass185_1 != null) {
																	if (Static98.aClass185_1.anObject6 == null) {
																		local418 = Static73.method1461(Static98.aClass185_1.anInt5277);
																	} else {
																		local418 = (String) Static98.aClass185_1.anObject6;
																	}
																}
																Static191.aStringArray28[local11++] = local418;
																continue;
															}
															if (local38 == 5420) {
																Static92.anIntArray502[local3++] = Static246.anInt4462 == 3 ? 1 : 0;
																continue;
															}
															if (local38 == 5421) {
																if (Static275.aFrame2 != null) {
																	Static259.method4091(false, Static41.anInt852, -1, -1);
																}
																local11--;
																local418 = Static191.aStringArray28[local11];
																local3--;
																local5954 = Static92.anIntArray502[local3] == 1;
																@Pc(6872) String local6872 = Static182.method2993() + local418;
																if (Static197.aFrame1 != null || local5954 && Static246.anInt4462 != 3 && Static246.aString266.startsWith("win") && !Static154.aBoolean186) {
																	Static88.aString107 = local6872;
																	Static200.aBoolean260 = local5954;
																	Static107.aClass185_2 = Static26.aClass154_1.method3895(local6872);
																	continue;
																}
																Static56.method983(local6872, local5954);
																continue;
															}
															if (local38 == 5422) {
																local11 -= 2;
																local1276 = Static191.aStringArray28[local11 + 1];
																local3--;
																local1681 = Static92.anIntArray502[local3];
																local418 = Static191.aStringArray28[local11];
																if (local418.length() > 0) {
																	if (Static88.aStringArray14 == null) {
																		Static88.aStringArray14 = new String[Static189.anIntArray299[Static118.anInt2486]];
																	}
																	Static88.aStringArray14[local1681] = local418;
																}
																if (local1276.length() > 0) {
																	if (Static80.aStringArray10 == null) {
																		Static80.aStringArray10 = new String[Static189.anIntArray299[Static118.anInt2486]];
																	}
																	Static80.aStringArray10[local1681] = local1276;
																}
																continue;
															}
															if (local38 == 5423) {
																local11--;
																System.out.println(Static191.aStringArray28[local11]);
																continue;
															}
															if (local38 == 5424) {
																local3 -= 11;
																Static300.anInt5352 = Static92.anIntArray502[local3];
																Static307.anInt5466 = Static92.anIntArray502[local3 + 1];
																Static108.anInt2246 = Static92.anIntArray502[local3 + 2];
																Static116.anInt2464 = Static92.anIntArray502[local3 + 3];
																Static155.anInt3040 = Static92.anIntArray502[local3 + 4];
																Static138.anInt2789 = Static92.anIntArray502[local3 + 5];
																Static42.anInt890 = Static92.anIntArray502[local3 + 6];
																Static62.anInt1194 = Static92.anIntArray502[local3 + 7];
																Static12.anInt179 = Static92.anIntArray502[local3 + 8];
																Static268.anInt4885 = Static92.anIntArray502[local3 + 9];
																Static166.anInt3285 = Static92.anIntArray502[local3 + 10];
																Static258.aClass121_114.method3140(Static155.anInt3040);
																Static258.aClass121_114.method3140(Static138.anInt2789);
																Static258.aClass121_114.method3140(Static42.anInt890);
																Static258.aClass121_114.method3140(Static62.anInt1194);
																Static258.aClass121_114.method3140(Static12.anInt179);
																Static41.aBoolean46 = true;
																continue;
															}
															if (local38 == 5425) {
																Static133.method2316();
																Static41.aBoolean46 = false;
																continue;
															}
															if (local38 == 5426) {
																local3--;
																Static133.anInt2677 = Static92.anIntArray502[local3];
																continue;
															}
															if (local38 == 5427) {
																local3 -= 2;
																Static280.anInt5078 = Static92.anIntArray502[local3];
																Static40.anInt5334 = Static92.anIntArray502[local3 + 1];
																continue;
															}
															if (local38 == 5428) {
																local3 -= 2;
																local626 = Static92.anIntArray502[local3];
																local620 = Static92.anIntArray502[local3 + 1];
																Static92.anIntArray502[local3++] = Static159.method2737(local626, local620) ? 1 : 0;
																continue;
															}
														} else if (local38 < 5600) {
															if (local38 == 5500) {
																local3 -= 4;
																local620 = Static92.anIntArray502[local3 + 1];
																local1681 = Static92.anIntArray502[local3 + 2];
																local626 = Static92.anIntArray502[local3];
																local464 = Static92.anIntArray502[local3 + 3];
																Static235.method4491(false, local464, (local626 >> 14 & 0x3FFF) - Static199.anInt3817, (local626 & 0x3FFF) + -Static192.anInt3637, local1681, local620);
																continue;
															}
															if (local38 == 5501) {
																local3 -= 4;
																local620 = Static92.anIntArray502[local3 + 1];
																local626 = Static92.anIntArray502[local3];
																local1681 = Static92.anIntArray502[local3 + 2];
																local464 = Static92.anIntArray502[local3 + 3];
																Static102.method1859((local626 & 0x3FFF) - Static192.anInt3637, local1681, local620, (local626 >> 14 & 0x3FFF) - Static199.anInt3817, local464);
																continue;
															}
															if (local38 == 5502) {
																local3 -= 6;
																local626 = Static92.anIntArray502[local3];
																if (local626 >= 2) {
																	throw new RuntimeException();
																}
																Static201.anInt3866 = local626;
																local620 = Static92.anIntArray502[local3 + 1];
																if (Static249.anIntArrayArrayArray14[Static201.anInt3866].length >> 1 <= local620 + 1) {
																	throw new RuntimeException();
																}
																Static54.anInt1038 = 0;
																Static148.anInt2916 = local620;
																Static139.anInt2803 = Static92.anIntArray502[local3 + 2];
																Static55.anInt1042 = Static92.anIntArray502[local3 + 3];
																local1681 = Static92.anIntArray502[local3 + 4];
																if (local1681 >= 2) {
																	throw new RuntimeException();
																}
																Static143.anInt2865 = local1681;
																local464 = Static92.anIntArray502[local3 + 5];
																if (local464 + 1 >= Static249.anIntArrayArrayArray14[Static143.anInt2865].length >> 1) {
																	throw new RuntimeException();
																}
																Static167.anInt3292 = 3;
																Static181.anInt3481 = local464;
																continue;
															}
															if (local38 == 5503) {
																Static255.method4047();
																continue;
															}
															if (local38 == 5504) {
																local3 -= 2;
																Static295.method4499(Static92.anIntArray502[local3], Static92.anIntArray502[local3 + 1]);
																continue;
															}
															if (local38 == 5505) {
																Static92.anIntArray502[local3++] = (int) Static278.aFloat154;
																continue;
															}
															if (local38 == 5506) {
																Static92.anIntArray502[local3++] = (int) Static49.aFloat32;
																continue;
															}
															if (local38 == 5507) {
																Static15.method196();
																continue;
															}
															if (local38 == 5508) {
																Static186.method3048();
																continue;
															}
															if (local38 == 5509) {
																Static116.method2093();
																continue;
															}
															if (local38 == 5510) {
																Static105.method1209();
																continue;
															}
															if (local38 == 5512) {
																Static212.method614();
																continue;
															}
														} else if (local38 < 5700) {
															if (local38 == 5600) {
																local11 -= 2;
																local418 = Static191.aStringArray28[local11];
																local1276 = Static191.aStringArray28[local11 + 1];
																local3--;
																local1681 = Static92.anIntArray502[local3];
																if (Static37.anInt773 == 10 && Static35.anInt3965 == 0 && Static197.anInt3809 == 0 && Static227.anInt4177 == 0 && Static66.anInt4307 == 0) {
																	Static97.method1797(local418, local1681, local1276);
																}
																continue;
															}
															if (local38 == 5601) {
																Static219.method3416();
																continue;
															}
															if (local38 == 5602) {
																if (Static197.anInt3809 == 0) {
																	Static201.anInt3864 = -2;
																}
																continue;
															}
															if (local38 == 5603) {
																local3 -= 4;
																if (Static37.anInt773 == 10 && Static35.anInt3965 == 0 && Static197.anInt3809 == 0 && Static227.anInt4177 == 0 && Static66.anInt4307 == 0) {
																	Static116.method2095(Static92.anIntArray502[local3], Static92.anIntArray502[local3 + 2], Static92.anIntArray502[local3 + 3], Static92.anIntArray502[local3 + 1]);
																}
																continue;
															}
															if (local38 == 5604) {
																local11--;
																if (Static37.anInt773 == 10 && Static35.anInt3965 == 0 && Static197.anInt3809 == 0 && Static227.anInt4177 == 0 && Static66.anInt4307 == 0) {
																	Static73.method1457(Static124.method4681(Static191.aStringArray28[local11]));
																}
																continue;
															}
															if (local38 == 5605) {
																local3 -= 7;
																local11 -= 3;
																if (Static37.anInt773 == 10 && Static35.anInt3965 == 0 && Static197.anInt3809 == 0 && Static227.anInt4177 == 0 && Static66.anInt4307 == 0) {
																	Static194.method3155(Static191.aStringArray28[local11 + 2], Static92.anIntArray502[local3 + 3], Static92.anIntArray502[local3 + 5] == 1, Static92.anIntArray502[local3], Static92.anIntArray502[local3 + 1], Static124.method4681(Static191.aStringArray28[local11]), Static92.anIntArray502[local3 + 4] == 1, Static92.anIntArray502[local3 + 6] == 1, Static92.anIntArray502[local3 + 2], Static191.aStringArray28[local11 + 1]);
																}
																continue;
															}
															if (local38 == 5606) {
																if (Static227.anInt4177 == 0) {
																	Static178.anInt3427 = -2;
																}
																continue;
															}
															if (local38 == 5607) {
																Static92.anIntArray502[local3++] = Static201.anInt3864;
																continue;
															}
															if (local38 == 5608) {
																Static92.anIntArray502[local3++] = Static308.anInt5497;
																continue;
															}
															if (local38 == 5609) {
																Static92.anIntArray502[local3++] = Static178.anInt3427;
																continue;
															}
															if (local38 == 5610) {
																for (local626 = 0; local626 < 5; local626++) {
																	Static191.aStringArray28[local11++] = Static282.aStringArray39.length <= local626 ? "" : Static26.method434(Static282.aStringArray39[local626]);
																}
																Static282.aStringArray39 = null;
																continue;
															}
															if (local38 == 5611) {
																Static92.anIntArray502[local3++] = Static287.anInt5142;
																continue;
															}
														} else if (local38 < 6100) {
															if (local38 == 6001) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 1) {
																	local626 = 1;
																}
																if (local626 > 4) {
																	local626 = 4;
																}
																Static184.anInt3503 = local626;
																if (!Static156.aBoolean211 || !Static311.aBoolean384) {
																	if (Static184.anInt3503 == 1) {
																		Static215.method3362(0.9F);
																	}
																	if (Static184.anInt3503 == 2) {
																		Static215.method3362(0.8F);
																	}
																	if (Static184.anInt3503 == 3) {
																		Static215.method3362(0.7F);
																	}
																	if (Static184.anInt3503 == 4) {
																		Static215.method3362(0.6F);
																	}
																}
																if (Static156.aBoolean211) {
																	Static243.method4742();
																	if (!Static311.aBoolean384) {
																		Static65.method1214();
																	}
																}
																Static118.method2110();
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6002) {
																local3--;
																Static303.method4585(Static92.anIntArray502[local3] == 1);
																Static222.method3453();
																Static65.method1214();
																Static132.method3147();
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6003) {
																local3--;
																Static249.aBoolean306 = Static92.anIntArray502[local3] == 1;
																Static132.method3147();
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6005) {
																local3--;
																Static239.aBoolean299 = Static92.anIntArray502[local3] == 1;
																Static65.method1214();
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6006) {
																local3--;
																Static310.aBoolean382 = Static92.anIntArray502[local3] == 1;
																((Class30_Sub1) Static215.anInterface5_1).method792(!Static310.aBoolean382);
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6007) {
																local3--;
																Static152.aBoolean35 = Static92.anIntArray502[local3] == 1;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6008) {
																local3--;
																Static94.aBoolean232 = Static92.anIntArray502[local3] == 1;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6009) {
																local3--;
																Static102.aBoolean113 = Static92.anIntArray502[local3] == 1;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6010) {
																local3--;
																Static123.aBoolean160 = Static92.anIntArray502[local3] == 1;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6011) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0 || local626 > 2) {
																	local626 = 0;
																}
																Static192.anInt3641 = local626;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6012) {
																if (Static156.aBoolean211) {
																	Static90.method1648(0, 0);
																}
																local3--;
																Static311.aBoolean384 = Static92.anIntArray502[local3] == 1;
																if (Static156.aBoolean211 && Static311.aBoolean384) {
																	Static215.method3362(0.7F);
																} else {
																	if (Static184.anInt3503 == 1) {
																		Static215.method3362(0.9F);
																	}
																	if (Static184.anInt3503 == 2) {
																		Static215.method3362(0.8F);
																	}
																	if (Static184.anInt3503 == 3) {
																		Static215.method3362(0.7F);
																	}
																	if (Static184.anInt3503 == 4) {
																		Static215.method3362(0.6F);
																	}
																}
																Static65.method1214();
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6014) {
																local3--;
																Static187.aBoolean243 = Static92.anIntArray502[local3] == 1;
																if (Static156.aBoolean211) {
																	Static65.method1214();
																}
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6015) {
																local3--;
																Static183.aBoolean241 = Static92.anIntArray502[local3] == 1;
																if (Static156.aBoolean211) {
																	Static243.method4742();
																}
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6016) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0 || local626 > 2) {
																	local626 = 0;
																}
																Static111.anInt2296 = local626;
																if (Static156.aBoolean211) {
																	Static270.aBoolean338 = true;
																}
																continue;
															}
															if (local38 == 6017) {
																local3--;
																Static219.aBoolean281 = Static92.anIntArray502[local3] == 1;
																Static162.method2793();
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6018) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0) {
																	local626 = 0;
																}
																if (local626 > 127) {
																	local626 = 127;
																}
																Static64.anInt1228 = local626;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6019) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0) {
																	local626 = 0;
																}
																if (local626 > 255) {
																	local626 = 255;
																}
																if (local626 != Static182.anInt3491) {
																	if (Static182.anInt3491 == 0 && Static273.anInt4944 != -1) {
																		Static189.method3084(local626, Static273.anInt4944, Static308.aClass121_135);
																		Static152.aBoolean36 = false;
																	} else if (local626 == 0) {
																		Static84.method1578();
																		Static152.aBoolean36 = false;
																	} else {
																		Static194.method3154(local626);
																	}
																	Static182.anInt3491 = local626;
																}
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6020) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0) {
																	local626 = 0;
																}
																if (local626 > 127) {
																	local626 = 127;
																}
																Static294.anInt5275 = local626;
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																continue;
															}
															if (local38 == 6021) {
																local3--;
																Static153.aBoolean184 = Static92.anIntArray502[local3] == 1;
																Static132.method3147();
																continue;
															}
															if (local38 == 6023) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0) {
																	local626 = 0;
																}
																if (local626 > 2) {
																	local626 = 2;
																}
																local5954 = false;
																if (Static207.anInt3958 < 96) {
																	local5954 = true;
																	local626 = 0;
																}
																Static158.method2721(local626);
																Static286.method4396(Static26.aClass154_1);
																Static75.aBoolean88 = false;
																Static92.anIntArray502[local3++] = local5954 ? 0 : 1;
																continue;
															}
															if (local38 == 6024) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (local626 < 0 || local626 > 2) {
																	local626 = 0;
																}
																Static37.anInt771 = local626;
																Static286.method4396(Static26.aClass154_1);
																continue;
															}
															if (local38 == 6027) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (!Static156.aBoolean211) {
																	continue;
																}
																if (local626 < 0 || local626 > 1) {
																	local626 = 0;
																}
																Static255.method4048(local626 == 1);
																continue;
															}
															if (local38 == 6028) {
																local3--;
																Static261.aBoolean326 = Static92.anIntArray502[local3] != 0;
																Static286.method4396(Static26.aClass154_1);
																continue;
															}
														} else if (local38 < 6200) {
															if (local38 == 6101) {
																Static92.anIntArray502[local3++] = Static184.anInt3503;
																continue;
															}
															if (local38 == 6102) {
																Static92.anIntArray502[local3++] = Static278.method4290() ? 1 : 0;
																continue;
															}
															if (local38 == 6103) {
																Static92.anIntArray502[local3++] = Static249.aBoolean306 ? 1 : 0;
																continue;
															}
															if (local38 == 6105) {
																Static92.anIntArray502[local3++] = Static239.aBoolean299 ? 1 : 0;
																continue;
															}
															if (local38 == 6106) {
																Static92.anIntArray502[local3++] = Static310.aBoolean382 ? 1 : 0;
																continue;
															}
															if (local38 == 6107) {
																Static92.anIntArray502[local3++] = Static152.aBoolean35 ? 1 : 0;
																continue;
															}
															if (local38 == 6108) {
																Static92.anIntArray502[local3++] = Static94.aBoolean232 ? 1 : 0;
																continue;
															}
															if (local38 == 6109) {
																Static92.anIntArray502[local3++] = Static102.aBoolean113 ? 1 : 0;
																continue;
															}
															if (local38 == 6110) {
																Static92.anIntArray502[local3++] = Static123.aBoolean160 ? 1 : 0;
																continue;
															}
															if (local38 == 6111) {
																Static92.anIntArray502[local3++] = Static192.anInt3641;
																continue;
															}
															if (local38 == 6112) {
																Static92.anIntArray502[local3++] = Static311.aBoolean384 ? 1 : 0;
																continue;
															}
															if (local38 == 6114) {
																Static92.anIntArray502[local3++] = Static187.aBoolean243 ? 1 : 0;
																continue;
															}
															if (local38 == 6115) {
																Static92.anIntArray502[local3++] = Static183.aBoolean241 ? 1 : 0;
																continue;
															}
															if (local38 == 6116) {
																Static92.anIntArray502[local3++] = Static111.anInt2296;
																continue;
															}
															if (local38 == 6117) {
																Static92.anIntArray502[local3++] = Static219.aBoolean281 ? 1 : 0;
																continue;
															}
															if (local38 == 6118) {
																Static92.anIntArray502[local3++] = Static64.anInt1228;
																continue;
															}
															if (local38 == 6119) {
																Static92.anIntArray502[local3++] = Static182.anInt3491;
																continue;
															}
															if (local38 == 6120) {
																Static92.anIntArray502[local3++] = Static294.anInt5275;
																continue;
															}
															if (local38 == 6121) {
																if (Static156.aBoolean211) {
																	Static92.anIntArray502[local3++] = Static156.aBoolean208 ? 1 : 0;
																} else {
																	Static92.anIntArray502[local3++] = 0;
																}
																continue;
															}
															if (local38 == 6123) {
																Static92.anIntArray502[local3++] = Static158.method2715();
																continue;
															}
															if (local38 == 6124) {
																Static92.anIntArray502[local3++] = Static37.anInt771;
																continue;
															}
															if (local38 == 6126) {
																if (Static156.aBoolean211) {
																	Static92.anIntArray502[local3++] = Static177.method2960() ? 1 : 0;
																} else {
																	Static92.anIntArray502[local3++] = 0;
																}
																continue;
															}
															if (local38 == 6127) {
																Static92.anIntArray502[local3++] = Static36.aBoolean28 ? 1 : 0;
																continue;
															}
															if (local38 == 6128) {
																Static92.anIntArray502[local3++] = Static261.aBoolean326 ? 1 : 0;
																continue;
															}
														} else if (local38 < 6300) {
															if (local38 == 6200) {
																local3 -= 2;
																Static2.aShort1 = (short) Static92.anIntArray502[local3];
																if (Static2.aShort1 <= 0) {
																	Static2.aShort1 = 256;
																}
																Static301.aShort54 = (short) Static92.anIntArray502[local3 + 1];
																if (Static301.aShort54 <= 0) {
																	Static301.aShort54 = 205;
																}
																continue;
															}
															if (local38 == 6201) {
																local3 -= 2;
																Static256.aShort35 = (short) Static92.anIntArray502[local3];
																if (Static256.aShort35 <= 0) {
																	Static256.aShort35 = 256;
																}
																Static306.aShort55 = (short) Static92.anIntArray502[local3 + 1];
																if (Static306.aShort55 <= 0) {
																	Static306.aShort55 = 320;
																}
																continue;
															}
															if (local38 == 6202) {
																local3 -= 4;
																Static269.aShort19 = (short) Static92.anIntArray502[local3];
																if (Static269.aShort19 <= 0) {
																	Static269.aShort19 = 1;
																}
																Static285.aShort47 = (short) Static92.anIntArray502[local3 + 1];
																if (Static285.aShort47 <= 0) {
																	Static285.aShort47 = 32767;
																} else if (Static285.aShort47 < Static269.aShort19) {
																	Static285.aShort47 = Static269.aShort19;
																}
																Static249.aShort34 = (short) Static92.anIntArray502[local3 + 2];
																if (Static249.aShort34 <= 0) {
																	Static249.aShort34 = 1;
																}
																Static38.aShort25 = (short) Static92.anIntArray502[local3 + 3];
																if (Static38.aShort25 <= 0) {
																	Static38.aShort25 = 32767;
																} else if (Static249.aShort34 > Static38.aShort25) {
																	Static38.aShort25 = Static249.aShort34;
																}
																continue;
															}
															if (local38 == 6203) {
																Static56.method989(0, Static7.aClass66_5.anInt2207, Static7.aClass66_5.anInt2204, false, 0);
																Static92.anIntArray502[local3++] = Static57.anInt1086;
																Static92.anIntArray502[local3++] = Static41.anInt848;
																continue;
															}
															if (local38 == 6204) {
																Static92.anIntArray502[local3++] = Static256.aShort35;
																Static92.anIntArray502[local3++] = Static306.aShort55;
																continue;
															}
															if (local38 == 6205) {
																Static92.anIntArray502[local3++] = Static2.aShort1;
																Static92.anIntArray502[local3++] = Static301.aShort54;
																continue;
															}
														} else if (local38 < 6400) {
															if (local38 == 6300) {
																Static92.anIntArray502[local3++] = (int) (Static298.method4535() / 60000L);
																continue;
															}
															if (local38 == 6301) {
																Static92.anIntArray502[local3++] = (int) (Static298.method4535() / 86400000L) - 11745;
																continue;
															}
															if (local38 == 6302) {
																local3 -= 3;
																local626 = Static92.anIntArray502[local3];
																local620 = Static92.anIntArray502[local3 + 1];
																local1681 = Static92.anIntArray502[local3 + 2];
																Static20.aCalendar1.clear();
																Static20.aCalendar1.set(11, 12);
																Static20.aCalendar1.set(local1681, local620, local626);
																Static92.anIntArray502[local3++] = (int) (Static20.aCalendar1.getTime().getTime() / 86400000L) - 11745;
																continue;
															}
															if (local38 == 6303) {
																Static20.aCalendar1.clear();
																Static20.aCalendar1.setTime(new Date(Static298.method4535()));
																Static92.anIntArray502[local3++] = Static20.aCalendar1.get(1);
																continue;
															}
															if (local38 == 6304) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local5954 = true;
																if (local626 < 0) {
																	local5954 = (local626 + 1) % 4 == 0;
																} else if (local626 < 1582) {
																	local5954 = local626 % 4 == 0;
																} else if (local626 % 4 != 0) {
																	local5954 = false;
																} else if (local626 % 100 != 0) {
																	local5954 = true;
																} else if (local626 % 400 != 0) {
																	local5954 = false;
																}
																Static92.anIntArray502[local3++] = local5954 ? 1 : 0;
																continue;
															}
														} else if (local38 < 6500) {
															if (local38 == 6405) {
																Static92.anIntArray502[local3++] = Static141.method2439() ? 1 : 0;
																continue;
															}
															if (local38 == 6406) {
																Static92.anIntArray502[local3++] = Static60.method1104() ? 1 : 0;
																continue;
															}
														} else if (local38 < 6600) {
															if (local38 == 6500) {
																if (Static37.anInt773 == 10 && Static35.anInt3965 == 0 && Static197.anInt3809 == 0 && Static227.anInt4177 == 0) {
																	Static92.anIntArray502[local3++] = Static229.method3544() == -1 ? 0 : 1;
																	continue;
																}
																Static92.anIntArray502[local3++] = 1;
																continue;
															}
															@Pc(8724) Class113 local8724;
															@Pc(8667) Class29_Sub1 local8667;
															if (local38 == 6501) {
																local8667 = Static251.method3959();
																if (local8667 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = 0;
																	Static191.aStringArray28[local11++] = "";
																	Static92.anIntArray502[local3++] = 0;
																	Static191.aStringArray28[local11++] = "";
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	Static92.anIntArray502[local3++] = local8667.anInt5342;
																	Static92.anIntArray502[local3++] = local8667.anInt5331;
																	Static191.aStringArray28[local11++] = local8667.aString324;
																	local8724 = local8667.method4544();
																	Static92.anIntArray502[local3++] = local8724.anInt3432;
																	Static191.aStringArray28[local11++] = local8724.aString199;
																	Static92.anIntArray502[local3++] = local8667.anInt5336;
																}
																continue;
															}
															if (local38 == 6502) {
																local8667 = Static182.method2992();
																if (local8667 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static92.anIntArray502[local3++] = 0;
																	Static191.aStringArray28[local11++] = "";
																	Static92.anIntArray502[local3++] = 0;
																	Static191.aStringArray28[local11++] = "";
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	Static92.anIntArray502[local3++] = local8667.anInt5342;
																	Static92.anIntArray502[local3++] = local8667.anInt5331;
																	Static191.aStringArray28[local11++] = local8667.aString324;
																	local8724 = local8667.method4544();
																	Static92.anIntArray502[local3++] = local8724.anInt3432;
																	Static191.aStringArray28[local11++] = local8724.aString199;
																	Static92.anIntArray502[local3++] = local8667.anInt5336;
																}
																continue;
															}
															if (local38 == 6503) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																if (Static37.anInt773 == 10 && Static35.anInt3965 == 0 && Static197.anInt3809 == 0 && Static227.anInt4177 == 0) {
																	Static92.anIntArray502[local3++] = Static189.method3087(local626) ? 1 : 0;
																	continue;
																}
																Static92.anIntArray502[local3++] = 0;
																continue;
															}
															if (local38 == 6504) {
																local3--;
																Static138.anInt2784 = Static92.anIntArray502[local3];
																Static286.method4396(Static26.aClass154_1);
																continue;
															}
															if (local38 == 6505) {
																Static92.anIntArray502[local3++] = Static138.anInt2784;
																continue;
															}
															if (local38 == 6506) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																@Pc(8909) Class29_Sub1 local8909 = Static126.method1641(local626);
																if (local8909 == null) {
																	Static92.anIntArray502[local3++] = -1;
																	Static191.aStringArray28[local11++] = "";
																	Static92.anIntArray502[local3++] = 0;
																	Static191.aStringArray28[local11++] = "";
																	Static92.anIntArray502[local3++] = 0;
																} else {
																	Static92.anIntArray502[local3++] = local8909.anInt5331;
																	Static191.aStringArray28[local11++] = local8909.aString324;
																	@Pc(8927) Class113 local8927 = local8909.method4544();
																	Static92.anIntArray502[local3++] = local8927.anInt3432;
																	Static191.aStringArray28[local11++] = local8927.aString199;
																	Static92.anIntArray502[local3++] = local8909.anInt5336;
																}
																continue;
															}
															if (local38 == 6507) {
																local3 -= 4;
																local626 = Static92.anIntArray502[local3];
																local5954 = Static92.anIntArray502[local3 + 1] == 1;
																local1681 = Static92.anIntArray502[local3 + 2];
																local5790 = Static92.anIntArray502[local3 + 3] == 1;
																Static38.method3323(local5790, local626, local1681, local5954);
																continue;
															}
														} else if (local38 < 6700) {
															if (local38 == 6600) {
																local3--;
																Static73.aBoolean87 = Static92.anIntArray502[local3] == 1;
																Static286.method4396(Static26.aClass154_1);
																continue;
															}
															if (local38 == 6601) {
																Static92.anIntArray502[local3++] = Static73.aBoolean87 ? 1 : 0;
																continue;
															}
														} else if (local38 < 6900) {
															@Pc(9079) Class175 local9079;
															if (local38 == 6800) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local9079 = Static210.method3349(local626);
																if (local9079.aString291 == null) {
																	Static191.aStringArray28[local11++] = "";
																} else {
																	Static191.aStringArray28[local11++] = local9079.aString291;
																}
																continue;
															}
															if (local38 == 6801) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local9079 = Static210.method3349(local626);
																Static92.anIntArray502[local3++] = local9079.anInt5031;
																continue;
															}
															if (local38 == 6802) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local9079 = Static210.method3349(local626);
																Static92.anIntArray502[local3++] = local9079.anInt5020;
																continue;
															}
															if (local38 == 6803) {
																local3--;
																local626 = Static92.anIntArray502[local3];
																local9079 = Static210.method3349(local626);
																Static92.anIntArray502[local3++] = local9079.anInt5011;
																continue;
															}
														}
													}
												} else if (local38 == 4500) {
													local3 -= 2;
													local620 = Static92.anIntArray502[local3 + 1];
													local626 = Static92.anIntArray502[local3];
													local5162 = Static30.method498(local620);
													if (local5162.method3963()) {
														Static191.aStringArray28[local11++] = Static1.method12(local626).method2759(local620, local5162.aString269);
													} else {
														Static92.anIntArray502[local3++] = Static1.method12(local626).method2758(local5162.anInt4543, local620);
													}
													continue;
												}
											} else if (local38 == 4400) {
												local3 -= 2;
												local620 = Static92.anIntArray502[local3 + 1];
												local626 = Static92.anIntArray502[local3];
												local5162 = Static30.method498(local620);
												if (local5162.method3963()) {
													Static191.aStringArray28[local11++] = Static255.method4052(local626).method2031(local5162.aString269, local620);
												} else {
													Static92.anIntArray502[local3++] = Static255.method4052(local626).method2036(local620, local5162.anInt4543);
												}
												continue;
											}
										} else if (local38 == 4300) {
											local3 -= 2;
											local626 = Static92.anIntArray502[local3];
											local620 = Static92.anIntArray502[local3 + 1];
											local5162 = Static30.method498(local620);
											if (local5162.method3963()) {
												Static191.aStringArray28[local11++] = Static261.method4114(local626).method2651(local5162.aString269, local620);
											} else {
												Static92.anIntArray502[local3++] = Static261.method4114(local626).method2653(local5162.anInt4543, local620);
											}
											continue;
										}
									} else {
										if (local38 == 4100) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											local3--;
											local620 = Static92.anIntArray502[local3];
											Static191.aStringArray28[local11++] = local418 + local620;
											continue;
										}
										if (local38 == 4101) {
											local11 -= 2;
											local418 = Static191.aStringArray28[local11];
											local1276 = Static191.aStringArray28[local11 + 1];
											Static191.aStringArray28[local11++] = local418 + local1276;
											continue;
										}
										if (local38 == 4102) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											local3--;
											local620 = Static92.anIntArray502[local3];
											Static191.aStringArray28[local11++] = local418 + Static221.method3450(local620);
											continue;
										}
										if (local38 == 4103) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											Static191.aStringArray28[local11++] = local418.toLowerCase();
											continue;
										}
										if (local38 == 4104) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											@Pc(12102) long local12102 = ((long) local626 + 11745L) * 86400000L;
											Static20.aCalendar1.setTime(new Date(local12102));
											local464 = Static20.aCalendar1.get(5);
											local1936 = Static20.aCalendar1.get(2);
											local6633 = Static20.aCalendar1.get(1);
											Static191.aStringArray28[local11++] = local464 + "-" + Static188.aStringArray27[local1936] + "-" + local6633;
											continue;
										}
										if (local38 == 4105) {
											local11 -= 2;
											local418 = Static191.aStringArray28[local11];
											local1276 = Static191.aStringArray28[local11 + 1];
											if (Static90.aClass15_Sub5_Sub2_2.aClass167_6 != null && Static90.aClass15_Sub5_Sub2_2.aClass167_6.aBoolean336) {
												Static191.aStringArray28[local11++] = local1276;
												continue;
											}
											Static191.aStringArray28[local11++] = local418;
											continue;
										}
										if (local38 == 4106) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static191.aStringArray28[local11++] = Integer.toString(local626);
											continue;
										}
										if (local38 == 4107) {
											local11 -= 2;
											Static92.anIntArray502[local3++] = Static207.method3317(Static233.method3610(Static114.anInt2371, Static191.aStringArray28[local11 + 1], Static191.aStringArray28[local11]));
											continue;
										}
										if (local38 == 4108) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											local3 -= 2;
											local1681 = Static92.anIntArray502[local3 + 1];
											local620 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Static152.method670(local1681).method4025(local418, local620);
											continue;
										}
										if (local38 == 4109) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											local3 -= 2;
											local1681 = Static92.anIntArray502[local3 + 1];
											local620 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Static152.method670(local1681).method4020(local418, local620);
											continue;
										}
										if (local38 == 4110) {
											local11 -= 2;
											local418 = Static191.aStringArray28[local11];
											local1276 = Static191.aStringArray28[local11 + 1];
											local3--;
											if (Static92.anIntArray502[local3] == 1) {
												Static191.aStringArray28[local11++] = local418;
											} else {
												Static191.aStringArray28[local11++] = local1276;
											}
											continue;
										}
										if (local38 == 4111) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											Static191.aStringArray28[local11++] = Static78.method4019(local418);
											continue;
										}
										if (local38 == 4112) {
											local3--;
											local620 = Static92.anIntArray502[local3];
											local11--;
											local418 = Static191.aStringArray28[local11];
											if (local620 == -1) {
												throw new RuntimeException("null char");
											}
											Static191.aStringArray28[local11++] = local418 + (char) local620;
											continue;
										}
										if (local38 == 4113) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Static143.method2467((char) local626) ? 1 : 0;
											continue;
										}
										if (local38 == 4114) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Static286.method4393((char) local626) ? 1 : 0;
											continue;
										}
										if (local38 == 4115) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Static170.method2895((char) local626) ? 1 : 0;
											continue;
										}
										if (local38 == 4116) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Static234.method3635((char) local626) ? 1 : 0;
											continue;
										}
										if (local38 == 4117) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											if (local418 == null) {
												Static92.anIntArray502[local3++] = 0;
											} else {
												Static92.anIntArray502[local3++] = local418.length();
											}
											continue;
										}
										if (local38 == 4118) {
											local3 -= 2;
											local620 = Static92.anIntArray502[local3];
											local11--;
											local418 = Static191.aStringArray28[local11];
											local1681 = Static92.anIntArray502[local3 + 1];
											Static191.aStringArray28[local11++] = local418.substring(local620, local1681);
											continue;
										}
										if (local38 == 4119) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											@Pc(12548) StringBuffer local12548 = new StringBuffer(local418.length());
											local5758 = false;
											for (local464 = 0; local464 < local418.length(); local464++) {
												@Pc(12560) char local12560 = local418.charAt(local464);
												if (local12560 == '<') {
													local5758 = true;
												} else if (local12560 == '>') {
													local5758 = false;
												} else if (!local5758) {
													local12548.append(local12560);
												}
											}
											Static191.aStringArray28[local11++] = local12548.toString();
											continue;
										}
										if (local38 == 4120) {
											local11--;
											local418 = Static191.aStringArray28[local11];
											local3 -= 2;
											local1681 = Static92.anIntArray502[local3 + 1];
											local620 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = local418.indexOf(local620, local1681);
											continue;
										}
										if (local38 == 4121) {
											local11 -= 2;
											local418 = Static191.aStringArray28[local11];
											local3--;
											local1681 = Static92.anIntArray502[local3];
											local1276 = Static191.aStringArray28[local11 + 1];
											Static92.anIntArray502[local3++] = local418.indexOf(local1276, local1681);
											continue;
										}
										if (local38 == 4122) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Character.toLowerCase((char) local626);
											continue;
										}
										if (local38 == 4123) {
											local3--;
											local626 = Static92.anIntArray502[local3];
											Static92.anIntArray502[local3++] = Character.toUpperCase((char) local626);
											continue;
										}
										if (local38 == 4124) {
											local3--;
											local12705 = Static92.anIntArray502[local3] != 0;
											local3--;
											local620 = Static92.anIntArray502[local3];
											Static191.aStringArray28[local11++] = Static307.method4662((long) local620, local12705, 0, Static114.anInt2371);
											continue;
										}
									}
								} else {
									if (local38 == 4000) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = local626 + local620;
										continue;
									}
									if (local38 == 4001) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local626 - local620;
										continue;
									}
									if (local38 == 4002) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = local626 * local620;
										continue;
									}
									if (local38 == 4003) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local626 / local620;
										continue;
									}
									if (local38 == 4004) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = (int) ((double) local626 * Math.random());
										continue;
									}
									if (local38 == 4005) {
										local3--;
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = (int) (Math.random() * (double) (local626 + 1));
										continue;
									}
									if (local38 == 4006) {
										local3 -= 5;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										local1681 = Static92.anIntArray502[local3 + 2];
										local464 = Static92.anIntArray502[local3 + 3];
										local1936 = Static92.anIntArray502[local3 + 4];
										Static92.anIntArray502[local3++] = local626 + (local1936 - local1681) * (local620 - local626) / (local464 - local1681);
										continue;
									}
									@Pc(12935) long local12935;
									@Pc(12928) long local12928;
									if (local38 == 4007) {
										local3 -= 2;
										local12928 = Static92.anIntArray502[local3];
										local12935 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = (int) (local12928 + local12928 * local12935 / 100L);
										continue;
									}
									if (local38 == 4008) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = 0x1 << local620 | local626;
										continue;
									}
									if (local38 == 4009) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = local626 & -(0x1 << local620) - 1;
										continue;
									}
									if (local38 == 4010) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = (local626 & 0x1 << local620) == 0 ? 0 : 1;
										continue;
									}
									if (local38 == 4011) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = local626 % local620;
										continue;
									}
									if (local38 == 4012) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										if (local626 == 0) {
											Static92.anIntArray502[local3++] = 0;
										} else {
											Static92.anIntArray502[local3++] = (int) Math.pow((double) local626, (double) local620);
										}
										continue;
									}
									if (local38 == 4013) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										if (local626 == 0) {
											Static92.anIntArray502[local3++] = 0;
										} else if (local620 == 0) {
											Static92.anIntArray502[local3++] = Integer.MAX_VALUE;
										} else {
											Static92.anIntArray502[local3++] = (int) Math.pow((double) local626, 1.0D / (double) local620);
										}
										continue;
									}
									if (local38 == 4014) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = local620 & local626;
										continue;
									}
									if (local38 == 4015) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local626 | local620;
										continue;
									}
									if (local38 == 4016) {
										local3 -= 2;
										local620 = Static92.anIntArray502[local3 + 1];
										local626 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = local620 <= local626 ? local620 : local626;
										continue;
									}
									if (local38 == 4017) {
										local3 -= 2;
										local626 = Static92.anIntArray502[local3];
										local620 = Static92.anIntArray502[local3 + 1];
										Static92.anIntArray502[local3++] = local620 < local626 ? local626 : local620;
										continue;
									}
									if (local38 == 4018) {
										local3 -= 3;
										@Pc(13275) long local13275 = (long) Static92.anIntArray502[local3 + 2];
										local12935 = Static92.anIntArray502[local3 + 1];
										local12928 = Static92.anIntArray502[local3];
										Static92.anIntArray502[local3++] = (int) (local13275 * local12928 / local12935);
										continue;
									}
								}
							} else {
								if (local38 < 2000) {
									local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
								} else {
									local38 -= 1000;
									local3--;
									local885 = Static53.method968(Static92.anIntArray502[local3]);
								}
								if (local38 == 1300) {
									local3--;
									local620 = Static92.anIntArray502[local3] - 1;
									if (local620 >= 0 && local620 <= 9) {
										local11--;
										local885.method1914(local620, Static191.aStringArray28[local11]);
										continue;
									}
									local11--;
									continue;
								}
								if (local38 == 1301) {
									local3 -= 2;
									local620 = Static92.anIntArray502[local3];
									local1681 = Static92.anIntArray502[local3 + 1];
									local885.aClass66_19 = Static296.method4522(local620, local1681);
									continue;
								}
								if (local38 == 1302) {
									local3--;
									local885.aBoolean118 = Static92.anIntArray502[local3] == 1;
									continue;
								}
								if (local38 == 1303) {
									local3--;
									local885.anInt2184 = Static92.anIntArray502[local3];
									continue;
								}
								if (local38 == 1304) {
									local3--;
									local885.anInt2196 = Static92.anIntArray502[local3];
									continue;
								}
								if (local38 == 1305) {
									local11--;
									local885.aString123 = Static191.aStringArray28[local11];
									continue;
								}
								if (local38 == 1306) {
									local11--;
									local885.aString124 = Static191.aStringArray28[local11];
									continue;
								}
								if (local38 == 1307) {
									local885.aStringArray17 = null;
									continue;
								}
								if (local38 == 1308) {
									local3--;
									local885.anInt2199 = Static92.anIntArray502[local3];
									local3--;
									local885.anInt2225 = Static92.anIntArray502[local3];
									continue;
								}
								if (local38 == 1309) {
									local3--;
									local620 = Static92.anIntArray502[local3];
									local3--;
									local1681 = Static92.anIntArray502[local3];
									if (local1681 >= 1 && local1681 <= 10) {
										local885.method1917(local1681 - 1, local620);
									}
									continue;
								}
								if (local38 == 1310) {
									local11--;
									local885.aString125 = Static191.aStringArray28[local11];
									continue;
								}
							}
						}
					}
				} else {
					if (local38 == 100) {
						local3 -= 3;
						local626 = Static92.anIntArray502[local3];
						local620 = Static92.anIntArray502[local3 + 1];
						local1681 = Static92.anIntArray502[local3 + 2];
						if (local620 == 0) {
							throw new RuntimeException();
						}
						local2943 = Static53.method968(local626);
						if (local2943.aClass66Array3 == null) {
							local2943.aClass66Array3 = new Class66[local1681 + 1];
						}
						if (local2943.aClass66Array3.length <= local1681) {
							@Pc(14838) Class66[] local14838 = new Class66[local1681 + 1];
							for (local6633 = 0; local6633 < local2943.aClass66Array3.length; local6633++) {
								local14838[local6633] = local2943.aClass66Array3[local6633];
							}
							local2943.aClass66Array3 = local14838;
						}
						if (local1681 > 0 && local2943.aClass66Array3[local1681 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1681 - 1));
						}
						@Pc(14890) Class66 local14890 = new Class66();
						local14890.anInt2178 = local1681;
						local14890.aBoolean132 = true;
						local14890.anInt2221 = local14890.anInt2157 = local2943.anInt2157;
						local14890.anInt2176 = local620;
						local2943.aClass66Array3[local1681] = local14890;
						if (local828) {
							Static287.aClass66_47 = local14890;
						} else {
							Static235.aClass66_49 = local14890;
						}
						Static103.method1865(local2943);
						continue;
					}
					@Pc(14958) Class66 local14958;
					if (local38 == 101) {
						local885 = local828 ? Static287.aClass66_47 : Static235.aClass66_49;
						if (local885.anInt2178 == -1) {
							if (!local828) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local14958 = Static53.method968(local885.anInt2157);
						local14958.aClass66Array3[local885.anInt2178] = null;
						Static103.method1865(local14958);
						continue;
					}
					if (local38 == 102) {
						local3--;
						local885 = Static53.method968(Static92.anIntArray502[local3]);
						local885.aClass66Array3 = null;
						Static103.method1865(local885);
						continue;
					}
					if (local38 == 200) {
						local3 -= 2;
						local626 = Static92.anIntArray502[local3];
						local620 = Static92.anIntArray502[local3 + 1];
						local2965 = Static296.method4522(local626, local620);
						if (local2965 != null && local620 != -1) {
							Static92.anIntArray502[local3++] = 1;
							if (local828) {
								Static287.aClass66_47 = local2965;
							} else {
								Static235.aClass66_49 = local2965;
							}
							continue;
						}
						Static92.anIntArray502[local3++] = 0;
						continue;
					}
					if (local38 == 201) {
						local3--;
						local626 = Static92.anIntArray502[local3];
						local14958 = Static53.method968(local626);
						if (local14958 == null) {
							Static92.anIntArray502[local3++] = 0;
						} else {
							Static92.anIntArray502[local3++] = 1;
							if (local828) {
								Static287.aClass66_47 = local14958;
							} else {
								Static235.aClass66_49 = local14958;
							}
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15086) Exception local15086) {
			if (arg0.aString273 == null) {
				if (Static85.anInt1679 != 0) {
					Static243.method4744("Clientscript error - check log for details", 0, "");
				}
				Static159.method2733(local15086, "CS2 - scr:" + arg0.aLong214 + " op:" + local21);
			} else {
				@Pc(15120) StringBuffer local15120 = new StringBuffer(30);
				local15120.append("%0a - in: ").append(arg0.aString273);
				for (local626 = Static273.anInt4950 - 1; local626 >= 0; local626--) {
					local15120.append("%0a - via: ").append(Static225.aClass110Array1[local626].aClass1_Sub2_Sub18_1.aString273);
				}
				if (local21 == 40) {
					local626 = local19[local13];
					local15120.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local626));
				}
				if (Static85.anInt1679 != 0) {
					Static243.method4744("Clientscript error in: " + arg0.aString273, 0, "");
				}
				Static159.method2733(local15086, "CS2 - scr:" + arg0.aLong214 + " op:" + local21 + local15120.toString());
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILjava/lang/String;ZI)I")
	public static int method2907(@OriginalArg(1) String arg0, @OriginalArg(3) int arg1) {
		@Pc(35) boolean local35 = false;
		@Pc(37) int local37 = 0;
		@Pc(39) boolean local39 = false;
		@Pc(42) int local42 = arg0.length();
		for (@Pc(44) int local44 = 0; local44 < local42; local44++) {
			@Pc(55) char local55 = arg0.charAt(local44);
			if (local44 == 0) {
				if (local55 == '-') {
					local35 = true;
					continue;
				}
				if (local55 == '+') {
					continue;
				}
			}
			@Pc(96) int local96;
			if (local55 >= '0' && local55 <= '9') {
				local96 = local55 - '0';
			} else if (local55 >= 'A' && local55 <= 'Z') {
				local96 = local55 - '7';
			} else if (local55 >= 'a' && local55 <= 'z') {
				local96 = local55 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local96 >= arg1) {
				throw new NumberFormatException();
			}
			if (local35) {
				local96 = -local96;
			}
			@Pc(135) int local135 = arg1 * local37 + local96;
			if (local135 / arg1 != local37) {
				throw new NumberFormatException();
			}
			local39 = true;
			local37 = local135;
		}
		if (!local39) {
			throw new NumberFormatException();
		}
		return local37;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	public static void method2908() {
		Static313.aClass187_80.method4530();
	}
}
