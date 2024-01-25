import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sh", name = "j", descriptor = "Lclient!iq;")
	public static Class104 aClass104_177;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_210 = new Class221(39, 1);

	@OriginalMember(owner = "client!sh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString68 = null;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
	public static boolean aBoolean582 = false;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public static void method5451() {
		Static225.anInt4918 = 0;
		Static103.aClass180_24.method4917();
		Static103.aClass180_24.method4909(Static316.aClass2_Sub31_1);
		Static225.anInt4918++;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method5453(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static209.anInt6939; local16++) {
			if (arg0.equalsIgnoreCase(Static190.aStringArray42[local16])) {
				return local16;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)Z")
	public static boolean method5454() throws IOException {
		if (Static129.aClass117_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static129.aClass117_2.method3273();
		if (local13 == 0) {
			return false;
		}
		@Pc(59) int local59;
		if (Static40.aClass221_34 == null) {
			if (Static73.aBoolean128) {
				Static129.aClass117_2.method3274(0, 1, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
				local13--;
				Static73.aBoolean128 = false;
			}
			Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
			if (Static273.aClass2_Sub12_Sub2_3.method3168()) {
				if (local13 == 0) {
					return false;
				}
				Static129.aClass117_2.method3274(1, 1, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
				local13--;
			}
			Static73.aBoolean128 = true;
			@Pc(55) Class221[] local55 = Static21.method2844();
			local59 = Static273.aClass2_Sub12_Sub2_3.method3175();
			if (local59 < 0 || local55.length <= local59) {
				throw new IOException("invo:" + local59);
			}
			Static40.aClass221_34 = local55[local59];
			Static275.anInt5636 = Static40.aClass221_34.anInt6863;
		}
		if (Static275.anInt5636 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static129.aClass117_2.method3274(0, 1, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
			local13--;
			Static275.anInt5636 = Static273.aClass2_Sub12_Sub2_3.aByteArray30[0] & 0xFF;
		}
		if (Static275.anInt5636 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static129.aClass117_2.method3274(0, 2, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
			Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
			Static275.anInt5636 = Static273.aClass2_Sub12_Sub2_3.method3104();
			local13 -= 2;
		}
		if (Static275.anInt5636 > local13) {
			return false;
		}
		Static273.aClass2_Sub12_Sub2_3.anInt3606 = 0;
		Static129.aClass117_2.method3274(0, Static275.anInt5636, Static273.aClass2_Sub12_Sub2_3.aByteArray30);
		Static279.aClass221_135 = Static67.aClass221_143;
		Static201.anInt4409 = 0;
		Static67.aClass221_143 = Static139.aClass221_102;
		Static139.aClass221_102 = Static40.aClass221_34;
		if (Static40.aClass221_34 == Static163.aClass221_122) {
			Static347.method5636(true);
			Static40.aClass221_34 = null;
			return true;
		}
		@Pc(185) int local185;
		@Pc(177) int local177;
		@Pc(205) Class2_Sub40 local205;
		if (Static364.aClass221_227 == Static40.aClass221_34) {
			local177 = Static273.aClass2_Sub12_Sub2_3.method3135();
			local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
			local185 = Static273.aClass2_Sub12_Sub2_3.method3105();
			if (Static54.method1199(local59)) {
				@Pc(196) Class2_Sub40 local196 = (Class2_Sub40) Static303.aClass41_32.method902((long) local185);
				local205 = (Class2_Sub40) Static303.aClass41_32.method902((long) local177);
				if (local205 != null) {
					Static357.method5709(local196 == null || local196.anInt6092 != local205.anInt6092, false, local205);
				}
				if (local196 != null) {
					local196.method5723();
					Static303.aClass41_32.method901(local196, (long) local177);
				}
				@Pc(242) Class68 local242 = Static8.method144(local185);
				if (local242 != null) {
					Static114.method2241(local242);
				}
				local242 = Static8.method144(local177);
				if (local242 != null) {
					Static114.method2241(local242);
					Static266.method4679(local242, true);
				}
				if (Static269.anInt6658 != -1) {
					Static271.method4703(1, Static269.anInt6658);
				}
			}
			Static40.aClass221_34 = null;
			return true;
		} else if (Static40.aClass221_34 == Static317.aClass221_202) {
			Static219.method4156(Static275.anInt5636, Static273.aClass2_Sub12_Sub2_3);
			Static40.aClass221_34 = null;
			return true;
		} else if (Static173.aClass221_127 == Static40.aClass221_34) {
			local177 = Static273.aClass2_Sub12_Sub2_3.method3135();
			local59 = Static273.aClass2_Sub12_Sub2_3.method3104();
			Static146.method2840(local177, local59);
			Static40.aClass221_34 = null;
			return true;
		} else if (Static306.aClass221_136 == Static40.aClass221_34) {
			Static221.anInt4878 = Static273.aClass2_Sub12_Sub2_3.method3124();
			for (local177 = 0; local177 < Static221.anInt4878; local177++) {
				Static363.aStringArray44[local177] = Static273.aClass2_Sub12_Sub2_3.method3113();
				Static26.aStringArray25[local177] = Static273.aClass2_Sub12_Sub2_3.method3113();
				if (Static26.aStringArray25[local177].equals("")) {
					Static26.aStringArray25[local177] = Static363.aStringArray44[local177];
				}
				Static213.aStringArray31[local177] = Static273.aClass2_Sub12_Sub2_3.method3113();
				Static2.aStringArray1[local177] = Static273.aClass2_Sub12_Sub2_3.method3113();
				if (Static2.aStringArray1[local177].equals("")) {
					Static2.aStringArray1[local177] = Static213.aStringArray31[local177];
				}
				Static332.aBooleanArray28[local177] = false;
			}
			Static193.anInt4255 = Static125.anInt2664;
			Static40.aClass221_34 = null;
			return true;
		} else {
			@Pc(392) String local392;
			if (Static40.aClass221_34 == Static124.aClass221_90) {
				local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
				local59 = Static273.aClass2_Sub12_Sub2_3.method3135();
				local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
				if (Static54.method1199(local177)) {
					Static26.method3363(local392, local59);
				}
				Static40.aClass221_34 = null;
				return true;
			} else if (Static54.aClass221_44 == Static40.aClass221_34) {
				local177 = Static273.aClass2_Sub12_Sub2_3.method3124();
				local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
				Static146.method2840(local177, local59);
				Static40.aClass221_34 = null;
				return true;
			} else {
				@Pc(527) String local527;
				@Pc(441) String local441;
				@Pc(467) int local467;
				@Pc(437) boolean local437;
				@Pc(463) long local463;
				@Pc(471) int local471;
				@Pc(458) long local458;
				@Pc(453) long local453;
				if (Static40.aClass221_34 == Static205.aClass221_150) {
					local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
					local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
					local392 = local441;
					if (local437) {
						local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
					}
					local453 = Static273.aClass2_Sub12_Sub2_3.method3142();
					local458 = Static273.aClass2_Sub12_Sub2_3.method3104();
					local463 = Static273.aClass2_Sub12_Sub2_3.method3163();
					local467 = Static273.aClass2_Sub12_Sub2_3.method3124();
					local471 = Static273.aClass2_Sub12_Sub2_3.method3104();
					@Pc(477) long local477 = (local458 << 32) + local463;
					@Pc(479) boolean local479 = false;
					@Pc(481) int local481 = 0;
					while (true) {
						if (local481 >= 100) {
							if (local467 <= 1 && Static18.method269(local392)) {
								local479 = true;
							}
							break;
						}
						if (Static41.aLongArray7[local481] == local477) {
							local479 = true;
							break;
						}
						local481++;
					}
					if (!local479 && Static137.anInt2913 == 0) {
						Static41.aLongArray7[Static43.anInt2555] = local477;
						Static43.anInt2555 = (Static43.anInt2555 + 1) % 100;
						local527 = Static332.method5409(local471).method2567(Static273.aClass2_Sub12_Sub2_3);
						if (local467 == 2) {
							Static113.method2231(local527, 20, "<img=1>" + local441, "<img=1>" + local392, local471, Static323.method5332(local453), 0);
						} else if (local467 == 1) {
							Static113.method2231(local527, 20, "<img=0>" + local441, "<img=0>" + local392, local471, Static323.method5332(local453), 0);
						} else {
							Static113.method2231(local527, 20, local441, local392, local471, Static323.method5332(local453), 0);
						}
					}
					Static40.aClass221_34 = null;
					return true;
				} else if (Static270.aClass221_185 == Static40.aClass221_34) {
					if (Static275.anInt5636 == 0) {
						Static79.aString14 = Static223.aClass140_116.method4155(Static239.anInt2803);
					} else {
						Static79.aString14 = Static273.aClass2_Sub12_Sub2_3.method3113();
					}
					Static40.aClass221_34 = null;
					return true;
				} else {
					@Pc(646) int local646;
					if (Static40.aClass221_34 == Static15.aClass221_25) {
						local177 = Static273.aClass2_Sub12_Sub2_3.method3135();
						local59 = Static273.aClass2_Sub12_Sub2_3.method3149();
						local185 = Static273.aClass2_Sub12_Sub2_3.method3127();
						local646 = Static273.aClass2_Sub12_Sub2_3.method3116();
						if (Static54.method1199(local646)) {
							Static364.method5830(local185, local177, local59);
						}
						Static40.aClass221_34 = null;
						return true;
					} else if (Static260.aClass221_180 == Static40.aClass221_34) {
						Static139.method2701(Static143.aClass143_9);
						Static40.aClass221_34 = null;
						return true;
					} else if (Static306.aClass221_138 == Static40.aClass221_34) {
						local177 = Static273.aClass2_Sub12_Sub2_3.method3109();
						@Pc(682) byte local682 = Static273.aClass2_Sub12_Sub2_3.method3145();
						local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
						if (Static54.method1199(local185)) {
							Static247.method4392(local682, local177);
						}
						Static40.aClass221_34 = null;
						return true;
					} else if (Static155.aClass221_116 == Static40.aClass221_34) {
						Static333.anInt6460 = Static273.aClass2_Sub12_Sub2_3.method3124();
						Static217.anInt4817 = Static273.aClass2_Sub12_Sub2_3.method3132();
						Static189.anInt4142 = Static273.aClass2_Sub12_Sub2_3.method3140();
						Static40.aClass221_34 = null;
						return true;
					} else if (Static240.aClass221_169 == Static40.aClass221_34) {
						Static261.method4464(Static273.aClass2_Sub12_Sub2_3.method3113());
						Static40.aClass221_34 = null;
						return true;
					} else {
						@Pc(757) String local757;
						@Pc(767) String local767;
						@Pc(771) String local771;
						@Pc(814) int local814;
						if (Static40.aClass221_34 == Static335.aClass221_211) {
							local177 = Static273.aClass2_Sub12_Sub2_3.method3124();
							@Pc(749) boolean local749 = (local177 & 0x1) == 1;
							local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
							local757 = Static273.aClass2_Sub12_Sub2_3.method3113();
							if (local757.equals("")) {
								local757 = local392;
							}
							local767 = Static273.aClass2_Sub12_Sub2_3.method3113();
							local771 = Static273.aClass2_Sub12_Sub2_3.method3113();
							if (local771.equals("")) {
								local771 = local767;
							}
							if (local749) {
								for (local814 = 0; local814 < Static221.anInt4878; local814++) {
									if (Static26.aStringArray25[local814].equals(local771)) {
										Static363.aStringArray44[local814] = local392;
										Static26.aStringArray25[local814] = local757;
										Static213.aStringArray31[local814] = local767;
										Static2.aStringArray1[local814] = local771;
										break;
									}
								}
							} else {
								Static363.aStringArray44[Static221.anInt4878] = local392;
								Static26.aStringArray25[Static221.anInt4878] = local757;
								Static213.aStringArray31[Static221.anInt4878] = local767;
								Static2.aStringArray1[Static221.anInt4878] = local771;
								Static332.aBooleanArray28[Static221.anInt4878] = (local177 & 0x2) == 2;
								Static221.anInt4878++;
							}
							Static193.anInt4255 = Static125.anInt2664;
							Static40.aClass221_34 = null;
							return true;
						} else if (Static40.aClass221_34 == Static87.aClass221_71) {
							local177 = Static273.aClass2_Sub12_Sub2_3.method3124();
							if (Static273.aClass2_Sub12_Sub2_3.method3124() == 0) {
								Static187.aClass159Array1[local177] = new Class159();
							} else {
								Static273.aClass2_Sub12_Sub2_3.anInt3606--;
								Static187.aClass159Array1[local177] = new Class159(Static273.aClass2_Sub12_Sub2_3);
							}
							Static40.aClass221_34 = null;
							Static214.anInt4721 = Static125.anInt2664;
							return true;
						} else if (Static40.aClass221_34 == Static178.aClass221_225) {
							Static139.method2701(Static272.aClass143_14);
							Static40.aClass221_34 = null;
							return true;
						} else if (Static40.aClass221_34 == Static44.aClass221_222) {
							Static139.method2701(Static164.aClass143_10);
							Static40.aClass221_34 = null;
							return true;
						} else if (Static40.aClass221_34 == Static181.aClass221_133) {
							Static196.method3638(true);
							Static40.aClass221_34 = null;
							return true;
						} else if (Static40.aClass221_34 == Static214.aClass221_157) {
							local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
							local59 = Static273.aClass2_Sub12_Sub2_3.method3104();
							local185 = Static273.aClass2_Sub12_Sub2_3.method3135();
							if (Static54.method1199(local177)) {
								Static312.method5208(local59, local185);
							}
							Static40.aClass221_34 = null;
							return true;
						} else {
							@Pc(990) int local990;
							@Pc(992) int local992;
							@Pc(980) boolean local980;
							if (Static40.aClass221_34 == Static256.aClass221_176) {
								local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
								local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
								local980 = (local59 & 0x1) == 1;
								while (Static275.anInt5636 > Static273.aClass2_Sub12_Sub2_3.anInt3606) {
									local646 = Static273.aClass2_Sub12_Sub2_3.method3153();
									local990 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local992 = 0;
									if (local990 != 0) {
										local992 = Static273.aClass2_Sub12_Sub2_3.method3124();
										if (local992 == 255) {
											local992 = Static273.aClass2_Sub12_Sub2_3.method3135();
										}
									}
									Static89.method1795(local980, local646, local992, local990 - 1, local177);
								}
								Static208.anIntArray339[Static10.anInt184++ & 0x1F] = local177;
								Static40.aClass221_34 = null;
								return true;
							} else if (Static40.aClass221_34 == Static235.aClass221_166) {
								Static361.method5749(Static275.anInt5636, Static273.aClass2_Sub12_Sub2_3, Static62.aClass179_2);
								Static40.aClass221_34 = null;
								return true;
							} else if (Static40.aClass221_34 == Static63.aClass221_48) {
								local177 = Static273.aClass2_Sub12_Sub2_3.method3132();
								local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
								if (local59 == 65535) {
									local59 = -1;
								}
								Static7.method119(local177, local59);
								Static40.aClass221_34 = null;
								return true;
							} else if (Static132.aClass221_97 == Static40.aClass221_34) {
								local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
								if (local177 == 65535) {
									local177 = -1;
								}
								local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
								local185 = Static273.aClass2_Sub12_Sub2_3.method3155();
								Static361.method5751(local177, local59, local185);
								Static40.aClass221_34 = null;
								return true;
							} else if (Static40.aClass221_34 == Static111.aClass221_81) {
								Static139.method2701(Static315.aClass143_19);
								Static40.aClass221_34 = null;
								return true;
							} else {
								@Pc(1129) String local1129;
								if (Static40.aClass221_34 == Static179.aClass221_130) {
									local1129 = Static273.aClass2_Sub12_Sub2_3.method3113();
									local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
									local185 = Static273.aClass2_Sub12_Sub2_3.method3116();
									if (Static54.method1199(local185)) {
										Static333.method5428(local1129, local59);
									}
									Static40.aClass221_34 = null;
									return true;
								} else if (Static40.aClass221_34 == Static78.aClass221_61) {
									local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local59 = Static273.aClass2_Sub12_Sub2_3.method3109();
									local185 = Static273.aClass2_Sub12_Sub2_3.method3105();
									local646 = Static273.aClass2_Sub12_Sub2_3.method3116();
									local990 = Static273.aClass2_Sub12_Sub2_3.method3104();
									if (Static54.method1199(local177)) {
										Static182.method2439(local990, local646, local59, local185);
									}
									Static40.aClass221_34 = null;
									return true;
								} else if (Static164.aClass221_123 == Static40.aClass221_34) {
									local177 = Static273.aClass2_Sub12_Sub2_3.method3105();
									local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
									local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
									if (Static54.method1199(local185)) {
										Static247.method4392(local177, local59);
									}
									Static40.aClass221_34 = null;
									return true;
								} else if (Static40.aClass221_34 == Static358.aClass221_223) {
									Static333.anInt6460 = Static273.aClass2_Sub12_Sub2_3.method3140();
									Static217.anInt4817 = Static273.aClass2_Sub12_Sub2_3.method3140();
									Static189.anInt4142 = Static273.aClass2_Sub12_Sub2_3.method3124();
									while (Static275.anInt5636 > Static273.aClass2_Sub12_Sub2_3.anInt3606) {
										@Pc(1247) Class143 local1247 = Static143.method2737()[Static273.aClass2_Sub12_Sub2_3.method3124()];
										Static139.method2701(local1247);
									}
									Static40.aClass221_34 = null;
									return true;
								} else if (Static140.aClass221_103 == Static40.aClass221_34) {
									Static54.anInt971 = Static273.aClass2_Sub12_Sub2_3.method3140();
									Static63.anInt1124 = Static273.aClass2_Sub12_Sub2_3.method3132();
									Static341.anInt464 = Static273.aClass2_Sub12_Sub2_3.method3146();
									Static40.aClass221_34 = null;
									return true;
								} else if (Static40.aClass221_34 == Static263.aClass221_182) {
									local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local59 = Static273.aClass2_Sub12_Sub2_3.method3135();
									if (Static54.method1199(local177)) {
										@Pc(1305) Class2_Sub40 local1305 = (Class2_Sub40) Static303.aClass41_32.method902((long) local59);
										if (local1305 != null) {
											Static357.method5709(true, false, local1305);
										}
										if (Static91.aClass68_12 != null) {
											Static114.method2241(Static91.aClass68_12);
											Static91.aClass68_12 = null;
										}
									}
									Static40.aClass221_34 = null;
									return true;
								} else if (Static157.aClass221_119 == Static40.aClass221_34) {
									Static139.method2701(Static317.aClass143_21);
									Static40.aClass221_34 = null;
									return true;
								} else if (Static40.aClass221_34 == Static267.aClass221_184) {
									local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local59 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
									if (Static54.method1199(local177) && Static264.aClass68ArrayArray1[local59] != null) {
										for (local990 = local185; local990 < local646; local990++) {
											local992 = Static273.aClass2_Sub12_Sub2_3.method3163();
											if (local990 < Static264.aClass68ArrayArray1[local59].length && Static264.aClass68ArrayArray1[local59][local990] != null) {
												Static264.aClass68ArrayArray1[local59][local990].anInt1863 = local992;
											}
										}
									}
									Static40.aClass221_34 = null;
									return true;
								} else if (Static312.aClass221_201 == Static40.aClass221_34) {
									Static139.method2701(Static45.aClass143_2);
									Static40.aClass221_34 = null;
									return true;
								} else if (Static110.aClass221_80 == Static40.aClass221_34) {
									Static139.method2701(Static13.aClass143_1);
									Static40.aClass221_34 = null;
									return true;
								} else if (Static40.aClass221_34 == Static90.aClass221_72) {
									local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
									local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
									local185 = Static273.aClass2_Sub12_Sub2_3.method3124();
									local646 = Static273.aClass2_Sub12_Sub2_3.method3124();
									local990 = Static273.aClass2_Sub12_Sub2_3.method3124();
									local992 = Static273.aClass2_Sub12_Sub2_3.method3104();
									if (Static54.method1199(local177)) {
										Static62.aBooleanArray7[local59] = true;
										Static100.anIntArray159[local59] = local185;
										Static25.anIntArray51[local59] = local646;
										Static281.anIntArray444[local59] = local990;
										Static338.anIntArray503[local59] = local992;
									}
									Static40.aClass221_34 = null;
									return true;
								} else {
									@Pc(1625) int local1625;
									@Pc(1600) Class210 local1600;
									if (Static40.aClass221_34 == Static71.aClass221_53) {
										local1129 = Static273.aClass2_Sub12_Sub2_3.method3113();
										local980 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
										if (local980) {
											local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
										} else {
											local441 = local1129;
										}
										local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
										@Pc(1512) byte local1512 = Static273.aClass2_Sub12_Sub2_3.method3122();
										@Pc(1514) boolean local1514 = false;
										if (local1512 == -128) {
											local1514 = true;
										}
										if (local1514) {
											if (Static210.anInt4592 == 0) {
												Static40.aClass221_34 = null;
												return true;
											}
											for (local814 = 0; local814 < Static210.anInt4592 && (!Static51.aClass210Array1[local814].aString72.equals(local441) || local646 != Static51.aClass210Array1[local814].anInt6749); local814++) {
											}
											if (local814 < Static210.anInt4592) {
												while (local814 < Static210.anInt4592 - 1) {
													Static51.aClass210Array1[local814] = Static51.aClass210Array1[local814 + 1];
													local814++;
												}
												Static210.anInt4592--;
												Static51.aClass210Array1[Static210.anInt4592] = null;
											}
										} else {
											@Pc(1596) String local1596 = Static273.aClass2_Sub12_Sub2_3.method3113();
											local1600 = new Class210();
											local1600.aString71 = local1129;
											local1600.aString72 = local441;
											local1600.aString69 = Static343.method3354(local1600.aString72);
											local1600.aByte74 = local1512;
											local1600.aString70 = local1596;
											local1600.anInt6749 = local646;
											for (local1625 = Static210.anInt4592 - 1; local1625 >= 0; local1625--) {
												local467 = Static51.aClass210Array1[local1625].aString69.compareTo(local1600.aString69);
												if (local467 == 0) {
													Static51.aClass210Array1[local1625].anInt6749 = local646;
													Static51.aClass210Array1[local1625].aByte74 = local1512;
													Static51.aClass210Array1[local1625].aString70 = local1596;
													if (local441.equals(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34)) {
														Static355.aByte75 = local1512;
													}
													Static218.anInt4844 = Static125.anInt2664;
													Static40.aClass221_34 = null;
													return true;
												}
												if (local467 < 0) {
													break;
												}
											}
											if (Static51.aClass210Array1.length <= Static210.anInt4592) {
												Static40.aClass221_34 = null;
												return true;
											}
											for (local467 = Static210.anInt4592 - 1; local467 > local1625; local467--) {
												Static51.aClass210Array1[local467 + 1] = Static51.aClass210Array1[local467];
											}
											if (Static210.anInt4592 == 0) {
												Static51.aClass210Array1 = new Class210[100];
											}
											Static51.aClass210Array1[local1625 + 1] = local1600;
											Static210.anInt4592++;
											if (local441.equals(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34)) {
												Static355.aByte75 = local1512;
											}
										}
										Static40.aClass221_34 = null;
										Static218.anInt4844 = Static125.anInt2664;
										return true;
									}
									@Pc(1784) int local1784;
									@Pc(1847) String local1847;
									if (Static40.aClass221_34 == Static306.aClass221_137) {
										local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
										local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
										local392 = local441;
										if (local437) {
											local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
										}
										local453 = Static273.aClass2_Sub12_Sub2_3.method3104();
										local458 = Static273.aClass2_Sub12_Sub2_3.method3163();
										local1784 = Static273.aClass2_Sub12_Sub2_3.method3124();
										local1625 = Static273.aClass2_Sub12_Sub2_3.method3104();
										@Pc(1795) long local1795 = (local453 << 32) + local458;
										@Pc(1797) boolean local1797 = false;
										@Pc(1799) int local1799 = 0;
										while (true) {
											if (local1799 >= 100) {
												if (local1784 <= 1 && Static18.method269(local392)) {
													local1797 = true;
												}
												break;
											}
											if (Static41.aLongArray7[local1799] == local1795) {
												local1797 = true;
												break;
											}
											local1799++;
										}
										if (!local1797 && Static137.anInt2913 == 0) {
											Static41.aLongArray7[Static43.anInt2555] = local1795;
											Static43.anInt2555 = (Static43.anInt2555 + 1) % 100;
											local1847 = Static332.method5409(local1625).method2567(Static273.aClass2_Sub12_Sub2_3);
											if (local1784 == 2) {
												Static113.method2231(local1847, 18, "<img=1>" + local441, "<img=1>" + local392, local1625, null, 0);
											} else if (local1784 == 1) {
												Static113.method2231(local1847, 18, "<img=0>" + local441, "<img=0>" + local392, local1625, null, 0);
											} else {
												Static113.method2231(local1847, 18, local441, local392, local1625, null, 0);
											}
										}
										Static40.aClass221_34 = null;
										return true;
									} else if (Static40.aClass221_34 == Static2.aClass221_6) {
										Static139.method2701(Static190.aClass143_20);
										Static40.aClass221_34 = null;
										return true;
									} else if (Static283.aClass221_189 == Static40.aClass221_34) {
										Static273.aClass2_Sub12_Sub2_3.anInt3606 += 28;
										if (Static273.aClass2_Sub12_Sub2_3.method3131()) {
											Static135.method2627(Static273.aClass2_Sub12_Sub2_3, Static273.aClass2_Sub12_Sub2_3.anInt3606 - 28);
										}
										Static40.aClass221_34 = null;
										return true;
									} else {
										@Pc(2000) int local2000;
										if (Static40.aClass221_34 == Static123.aClass221_89) {
											local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
											local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
											local392 = local441;
											if (local437) {
												local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
											}
											local453 = Static273.aClass2_Sub12_Sub2_3.method3104();
											local458 = Static273.aClass2_Sub12_Sub2_3.method3163();
											local1784 = Static273.aClass2_Sub12_Sub2_3.method3124();
											@Pc(1996) long local1996 = local458 + (local453 << 32);
											@Pc(1998) boolean local1998 = false;
											local2000 = 0;
											while (true) {
												if (local2000 >= 100) {
													if (local1784 <= 1) {
														if (Static283.aBoolean505 && !Static237.aBoolean443 || Static359.aBoolean608) {
															local1998 = true;
														} else if (Static18.method269(local392)) {
															local1998 = true;
														}
													}
													break;
												}
												if (local1996 == Static41.aLongArray7[local2000]) {
													local1998 = true;
													break;
												}
												local2000++;
											}
											if (!local1998 && Static137.anInt2913 == 0) {
												Static41.aLongArray7[Static43.anInt2555] = local1996;
												Static43.anInt2555 = (Static43.anInt2555 + 1) % 100;
												@Pc(2070) String local2070 = Static313.method5191(Static272.method4036(Static355.method5673(Static273.aClass2_Sub12_Sub2_3)));
												if (local1784 == 2) {
													Static113.method2231(local2070, 7, "<img=1>" + local441, "<img=1>" + local392, -1, null, 0);
												} else if (local1784 == 1) {
													Static113.method2231(local2070, 7, "<img=0>" + local441, "<img=0>" + local392, -1, null, 0);
												} else {
													Static113.method2231(local2070, 3, local441, local392, -1, null, 0);
												}
											}
											Static40.aClass221_34 = null;
											return true;
										} else if (Static195.aClass221_140 == Static40.aClass221_34) {
											Static101.anInt2051 = Static273.aClass2_Sub12_Sub2_3.method3104() * 30;
											Static40.aClass221_34 = null;
											Static196.anInt4296 = Static125.anInt2664;
											return true;
										} else {
											@Pc(2271) String local2271;
											if (Static161.aClass221_120 == Static40.aClass221_34) {
												local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
												local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
												local392 = local441;
												if (local437) {
													local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
												}
												local453 = Static273.aClass2_Sub12_Sub2_3.method3142();
												local458 = Static273.aClass2_Sub12_Sub2_3.method3104();
												local463 = Static273.aClass2_Sub12_Sub2_3.method3163();
												local467 = Static273.aClass2_Sub12_Sub2_3.method3124();
												@Pc(2206) long local2206 = local463 + (local458 << 32);
												@Pc(2208) boolean local2208 = false;
												@Pc(2210) int local2210 = 0;
												while (true) {
													if (local2210 >= 100) {
														if (local467 <= 1) {
															if (Static283.aBoolean505 && !Static237.aBoolean443 || Static359.aBoolean608) {
																local2208 = true;
															} else if (Static18.method269(local392)) {
																local2208 = true;
															}
														}
														break;
													}
													if (local2206 == Static41.aLongArray7[local2210]) {
														local2208 = true;
														break;
													}
													local2210++;
												}
												if (!local2208 && Static137.anInt2913 == 0) {
													Static41.aLongArray7[Static43.anInt2555] = local2206;
													Static43.anInt2555 = (Static43.anInt2555 + 1) % 100;
													local2271 = Static313.method5191(Static272.method4036(Static355.method5673(Static273.aClass2_Sub12_Sub2_3)));
													if (local467 == 2 || local467 == 3) {
														Static113.method2231(local2271, 9, "<img=1>" + local441, "<img=1>" + local392, -1, Static323.method5332(local453), 0);
													} else if (local467 == 1) {
														Static113.method2231(local2271, 9, "<img=0>" + local441, "<img=0>" + local392, -1, Static323.method5332(local453), 0);
													} else {
														Static113.method2231(local2271, 9, local441, local392, -1, Static323.method5332(local453), 0);
													}
												}
												Static40.aClass221_34 = null;
												return true;
											} else if (Static40.aClass221_34 == Static60.aClass221_46) {
												local177 = Static273.aClass2_Sub12_Sub2_3.method3116();
												if (local177 == 65535) {
													local177 = -1;
												}
												local59 = Static273.aClass2_Sub12_Sub2_3.method3105();
												local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
												if (Static54.method1199(local185)) {
													Static111.method2165(local59, local177);
												}
												Static40.aClass221_34 = null;
												return true;
											} else if (Static309.aClass221_195 == Static40.aClass221_34) {
												local177 = Static273.aClass2_Sub12_Sub2_3.method3116();
												local59 = Static273.aClass2_Sub12_Sub2_3.method3109();
												local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
												if (Static54.method1199(local59)) {
													Static333.method5428(local392, local177);
												}
												Static40.aClass221_34 = null;
												return true;
											} else if (Static40.aClass221_34 == Static347.aClass221_220) {
												for (local177 = 0; local177 < Static164.aClass1_Sub2_Sub3_Sub1Array1.length; local177++) {
													if (Static164.aClass1_Sub2_Sub3_Sub1Array1[local177] != null) {
														Static164.aClass1_Sub2_Sub3_Sub1Array1[local177].anInt6915 = -1;
													}
												}
												for (local59 = 0; local59 < Static95.aClass1_Sub2_Sub3_Sub2Array1.length; local59++) {
													if (Static95.aClass1_Sub2_Sub3_Sub2Array1[local59] != null) {
														Static95.aClass1_Sub2_Sub3_Sub2Array1[local59].anInt6915 = -1;
													}
												}
												Static40.aClass221_34 = null;
												return true;
											} else if (Static138.aClass221_101 == Static40.aClass221_34) {
												local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
												local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
												@Pc(2482) Object[] local2482 = new Object[local441.length() + 1];
												for (local646 = local441.length() - 1; local646 >= 0; local646--) {
													if (local441.charAt(local646) == 's') {
														local2482[local646 + 1] = Static273.aClass2_Sub12_Sub2_3.method3113();
													} else {
														local2482[local646 + 1] = Integer.valueOf(Static273.aClass2_Sub12_Sub2_3.method3135());
													}
												}
												local2482[0] = Integer.valueOf(Static273.aClass2_Sub12_Sub2_3.method3135());
												if (Static54.method1199(local177)) {
													@Pc(2535) Class2_Sub41 local2535 = new Class2_Sub41();
													local2535.anObjectArray35 = local2482;
													Static367.method5890(local2535);
												}
												Static40.aClass221_34 = null;
												return true;
											} else if (Static40.aClass221_34 == Static216.aClass221_158) {
												local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
												if (Static54.method1199(local177)) {
													Static63.method1320();
												}
												Static40.aClass221_34 = null;
												return true;
											} else if (Static312.aClass221_200 == Static40.aClass221_34) {
												local177 = Static273.aClass2_Sub12_Sub2_3.method3132();
												local59 = Static273.aClass2_Sub12_Sub2_3.method3104();
												if (Static54.method1199(local59)) {
													Static191.anInt4211 = local177;
												}
												Static40.aClass221_34 = null;
												return true;
											} else {
												@Pc(2765) boolean local2765;
												if (Static40.aClass221_34 == Static130.aClass221_94) {
													Static218.anInt4844 = Static125.anInt2664;
													if (Static275.anInt5636 == 0) {
														Static51.aClass210Array1 = null;
														Static40.aClass221_34 = null;
														Static167.aString36 = null;
														aString68 = null;
														Static210.anInt4592 = 0;
														return true;
													}
													aString68 = Static273.aClass2_Sub12_Sub2_3.method3113();
													local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
													if (local437) {
														Static273.aClass2_Sub12_Sub2_3.method3113();
													}
													@Pc(2633) long local2633 = Static273.aClass2_Sub12_Sub2_3.method3142();
													Static167.aString36 = Static97.method1894(local2633);
													Static156.aByte46 = Static273.aClass2_Sub12_Sub2_3.method3122();
													local646 = Static273.aClass2_Sub12_Sub2_3.method3124();
													if (local646 == 255) {
														Static40.aClass221_34 = null;
														return true;
													}
													Static210.anInt4592 = local646;
													@Pc(2659) Class210[] local2659 = new Class210[100];
													for (local992 = 0; local992 < Static210.anInt4592; local992++) {
														local2659[local992] = new Class210();
														local2659[local992].aString71 = Static273.aClass2_Sub12_Sub2_3.method3113();
														local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
														if (local437) {
															local2659[local992].aString72 = Static273.aClass2_Sub12_Sub2_3.method3113();
														} else {
															local2659[local992].aString72 = local2659[local992].aString71;
														}
														local2659[local992].aString69 = Static343.method3354(local2659[local992].aString72);
														local2659[local992].anInt6749 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local2659[local992].aByte74 = Static273.aClass2_Sub12_Sub2_3.method3122();
														local2659[local992].aString70 = Static273.aClass2_Sub12_Sub2_3.method3113();
														if (local2659[local992].aString72.equals(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34)) {
															Static355.aByte75 = local2659[local992].aByte74;
														}
													}
													local1625 = Static210.anInt4592;
													while (local1625 > 0) {
														local1625--;
														local2765 = true;
														for (local467 = 0; local467 < local1625; local467++) {
															if (local2659[local467].aString69.compareTo(local2659[local467 + 1].aString69) > 0) {
																local1600 = local2659[local467];
																local2659[local467] = local2659[local467 + 1];
																local2765 = false;
																local2659[local467 + 1] = local1600;
															}
														}
														if (local2765) {
															break;
														}
													}
													Static40.aClass221_34 = null;
													Static51.aClass210Array1 = local2659;
													return true;
												} else if (Static40.aClass221_34 == Static73.aClass221_58) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
													if (Static54.method1199(local177)) {
														Static348.method2471();
													}
													Static40.aClass221_34 = null;
													return true;
												} else if (Static40.aClass221_34 == Static282.aClass221_188) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
													local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
													local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
													local646 = Static273.aClass2_Sub12_Sub2_3.method3105();
													if (Static54.method1199(local177)) {
														local205 = (Class2_Sub40) Static303.aClass41_32.method902((long) local646);
														if (local205 != null) {
															Static357.method5709(local205.anInt6092 != local185, false, local205);
														}
														Static76.method1582(local646, local185, false, local59);
													}
													Static40.aClass221_34 = null;
													return true;
												} else if (Static226.aClass221_162 == Static40.aClass221_34) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3148();
													local59 = Static273.aClass2_Sub12_Sub2_3.method3126();
													local185 = Static273.aClass2_Sub12_Sub2_3.method3099();
													local646 = Static273.aClass2_Sub12_Sub2_3.method3109();
													if (Static54.method1199(local185)) {
														Static83.method1682(5, local646, local59, local177);
													}
													Static40.aClass221_34 = null;
													return true;
												} else if (Static40.aClass221_34 == Static329.aClass221_204) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3116();
													local59 = Static273.aClass2_Sub12_Sub2_3.method3135();
													Static160.method3259(local59, local177);
													Static40.aClass221_34 = null;
													return true;
												} else if (Static40.aClass221_34 == Static295.aClass221_191) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3126();
													local59 = local177 >> 28 & 0x3;
													local185 = local177 >> 14 & 0x3FFF;
													local646 = local177 & 0x3FFF;
													local990 = Static273.aClass2_Sub12_Sub2_3.method3146();
													local992 = local990 >> 2;
													local814 = local990 & 0x3;
													local1784 = Static148.anIntArray254[local992];
													local1625 = Static273.aClass2_Sub12_Sub2_3.method3109();
													local646 -= Static287.anInt5776;
													local185 -= Static150.anInt3453;
													if (local1625 == 65535) {
														local1625 = -1;
													}
													Static8.method143(local814, local1625, local1784, local646, local59, local185, local992);
													Static40.aClass221_34 = null;
													return true;
												} else if (Static40.aClass221_34 == Static87.aClass221_70) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3146();
													local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
													local185 = Static273.aClass2_Sub12_Sub2_3.method3099();
													@Pc(3041) Class1_Sub2_Sub3_Sub2 local3041 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local59];
													if (local3041 != null) {
														Static214.method4057(local185, local3041, local177);
													}
													Static40.aClass221_34 = null;
													return true;
												} else if (Static122.aClass221_88 == Static40.aClass221_34) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3146();
													local59 = Static273.aClass2_Sub12_Sub2_3.method3105();
													local185 = Static273.aClass2_Sub12_Sub2_3.method3099();
													if (Static54.method1199(local185)) {
														Static201.method3813(local177, local59);
													}
													Static40.aClass221_34 = null;
													return true;
												} else if (Static177.aClass221_129 == Static40.aClass221_34) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3148();
													local59 = Static273.aClass2_Sub12_Sub2_3.method3132();
													local185 = Static273.aClass2_Sub12_Sub2_3.method3146();
													Static308.anIntArray470[local185] = local177;
													Static288.anIntArray453[local185] = local59;
													Static50.anIntArray72[local185] = 1;
													local646 = Static62.anIntArray99[local185] - 1;
													for (local990 = 0; local990 < local646; local990++) {
														if (Class220.anIntArray527[local990] <= local177) {
															Static50.anIntArray72[local185] = local990 + 2;
														}
													}
													Static337.anIntArray502[Static75.anInt1413++ & 0x1F] = local185;
													Static40.aClass221_34 = null;
													return true;
												} else if (Static205.aClass221_151 == Static40.aClass221_34) {
													Static307.method5138();
													Static40.aClass221_34 = null;
													Static139.anInt3006 += 32;
													return true;
												} else if (Static94.aClass221_73 == Static40.aClass221_34) {
													local177 = Static273.aClass2_Sub12_Sub2_3.method3109();
													if (local177 == 65535) {
														local177 = -1;
													}
													local59 = Static273.aClass2_Sub12_Sub2_3.method3146();
													local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
													local646 = Static273.aClass2_Sub12_Sub2_3.method3140();
													if (local646 >= 1 && local646 <= 8) {
														if (local392.equalsIgnoreCase("null")) {
															local392 = null;
														}
														Static153.aStringArray21[local646 - 1] = local392;
														Static215.anIntArray348[local646 - 1] = local177;
														Static304.aBooleanArray27[local646 - 1] = local59 == 0;
													}
													Static40.aClass221_34 = null;
													return true;
												} else {
													@Pc(3284) long local3284;
													@Pc(3305) Class2_Sub43 local3305;
													@Pc(3290) Class2_Sub43 local3290;
													if (Static178.aClass221_224 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3126();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3099();
														if (local59 == 65535) {
															local59 = -1;
														}
														local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3105();
														local990 = Static273.aClass2_Sub12_Sub2_3.method3099();
														if (local990 == 65535) {
															local990 = -1;
														}
														if (Static54.method1199(local185)) {
															for (local992 = local990; local992 <= local59; local992++) {
																local3284 = ((long) local177 << 32) + (long) local992;
																local3290 = (Class2_Sub43) Static135.aClass41_15.method902(local3284);
																if (local3290 != null) {
																	local3305 = new Class2_Sub43(local646, local3290.anInt6734);
																	local3290.method5723();
																} else if (local992 == -1) {
																	local3305 = new Class2_Sub43(local646, Static8.method144(local177).aClass2_Sub43_2.anInt6734);
																} else {
																	local3305 = new Class2_Sub43(local646, -1);
																}
																Static135.aClass41_15.method901(local3305, local3284);
															}
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static286.aClass221_190 == Static40.aClass221_34) {
														Static217.anInt4817 = Static273.aClass2_Sub12_Sub2_3.method3140();
														Static189.anInt4142 = Static273.aClass2_Sub12_Sub2_3.method3146();
														Static333.anInt6460 = Static273.aClass2_Sub12_Sub2_3.method3124();
														for (@Pc(3358) Class2_Sub20 local3358 = (Class2_Sub20) Static198.aClass41_24.method896(); local3358 != null; local3358 = (Class2_Sub20) Static198.aClass41_24.method904()) {
															local59 = (int) (local3358.aLong219 & 0x3FFFL);
															local185 = (int) (local3358.aLong219 >> 14 & 0x3FFFL);
															local646 = (int) (local3358.aLong219 >> 28 & 0x3L);
															if (Static189.anInt4142 == local646 && local59 >= Static217.anInt4817 && Static217.anInt4817 + 8 > local59 && Static333.anInt6460 <= local185 && Static333.anInt6460 + 8 > local185) {
																local3358.method5723();
																Static364.method5815(local59, local185, Static189.anInt4142);
															}
														}
														for (@Pc(3433) Class2_Sub33 local3433 = (Class2_Sub33) Static108.aClass180_15.method4919(); local3433 != null; local3433 = (Class2_Sub33) Static108.aClass180_15.method4916()) {
															if (local3433.anInt5552 >= Static217.anInt4817 && Static217.anInt4817 + 8 > local3433.anInt5552 && local3433.anInt5558 >= Static333.anInt6460 && Static333.anInt6460 + 8 > local3433.anInt5558 && Static189.anInt4142 == local3433.anInt5560) {
																local3433.anInt5553 = 0;
															}
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static212.aClass221_155) {
														Static139.method2701(Static307.aClass143_17);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static165.aClass221_124 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3140();
														if (Static54.method1199(local177)) {
															if (local185 == 2) {
																Static210.method3968();
															}
															Static269.anInt6658 = local59;
															Static364.method5821(local59);
															Static205.method3918(false);
															Static367.method5888(Static269.anInt6658);
															for (local646 = 0; local646 < 100; local646++) {
																Static269.aBooleanArray29[local646] = true;
															}
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static34.aClass221_30 == Static40.aClass221_34) {
														Static166.anInt3803 = Static273.aClass2_Sub12_Sub2_3.method3124();
														Static40.aClass221_34 = null;
														Static196.anInt4296 = Static125.anInt2664;
														return true;
													} else if (Static237.aClass221_168 == Static40.aClass221_34) {
														Static363.anInt6992 = Static273.aClass2_Sub12_Sub2_3.method3108();
														Static40.aClass221_34 = null;
														Static196.anInt4296 = Static125.anInt2664;
														return true;
													} else if (Static40.aClass221_34 == Static14.aClass221_24) {
														Static139.method2701(Static112.aClass143_6);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static43.aClass221_86 == Static40.aClass221_34) {
														@Pc(3604) byte local3604 = Static273.aClass2_Sub12_Sub2_3.method3157();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
														Static160.method3259(local3604, local59);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static197.aClass221_142) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3108();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3148();
														if (Static54.method1199(local177)) {
															Static238.method4327(local59, local185);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static180.aClass221_132 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3148();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
														if (Static54.method1199(local177)) {
															Static67.method3658(local185, local59);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static79.aClass221_62 == Static40.aClass221_34) {
														Static139.method2701(Static272.aClass143_15);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static147.aClass221_106) {
														local437 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
														local441 = Static273.aClass2_Sub12_Sub2_3.method3113();
														local392 = Static273.aClass2_Sub12_Sub2_3.method3113();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local990 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local771 = "";
														local2765 = false;
														if (local646 > 0) {
															local771 = Static273.aClass2_Sub12_Sub2_3.method3113();
															local2765 = Static273.aClass2_Sub12_Sub2_3.method3124() == 1;
														}
														for (local1784 = 0; local1784 < Static209.anInt6939; local1784++) {
															if (local437) {
																if (local392.equals(Static190.aStringArray42[local1784])) {
																	Static190.aStringArray42[local1784] = local441;
																	local441 = null;
																	Static287.aStringArray38[local1784] = local392;
																	break;
																}
															} else if (local441.equals(Static190.aStringArray42[local1784])) {
																if (Static219.anIntArray354[local1784] != local646) {
																	Static219.anIntArray354[local1784] = local646;
																	if (local646 > 0) {
																		Static67.method3711(0, "", 5, local441 + Static307.aClass140_142.method4155(Static239.anInt2803), "");
																	}
																	if (local646 == 0) {
																		Static67.method3711(0, "", 5, local441 + Static87.aClass140_37.method4155(Static239.anInt2803), "");
																	}
																}
																Static287.aStringArray38[local1784] = local392;
																Static70.aStringArray6[local1784] = local771;
																Static361.anIntArray528[local1784] = local990;
																Static197.aBooleanArray12[local1784] = local2765;
																local441 = null;
																break;
															}
														}
														if (local441 != null && Static209.anInt6939 < 200) {
															Static190.aStringArray42[Static209.anInt6939] = local441;
															Static287.aStringArray38[Static209.anInt6939] = local392;
															Static219.anIntArray354[Static209.anInt6939] = local646;
															Static70.aStringArray6[Static209.anInt6939] = local771;
															Static361.anIntArray528[Static209.anInt6939] = local990;
															Static197.aBooleanArray12[Static209.anInt6939] = local2765;
															Static209.anInt6939++;
														}
														Static193.anInt4255 = Static125.anInt2664;
														local467 = Static209.anInt6939;
														while (local467 > 0) {
															local467--;
															@Pc(3884) boolean local3884 = true;
															for (local471 = 0; local471 < local467; local471++) {
																if (Static122.anInt2591 != Static219.anIntArray354[local471] && Static122.anInt2591 == Static219.anIntArray354[local471 + 1] || Static219.anIntArray354[local471] == 0 && Static219.anIntArray354[local471 + 1] != 0) {
																	local2000 = Static219.anIntArray354[local471];
																	Static219.anIntArray354[local471] = Static219.anIntArray354[local471 + 1];
																	Static219.anIntArray354[local471 + 1] = local2000;
																	local1847 = Static70.aStringArray6[local471];
																	Static70.aStringArray6[local471] = Static70.aStringArray6[local471 + 1];
																	Static70.aStringArray6[local471 + 1] = local1847;
																	local2271 = Static190.aStringArray42[local471];
																	Static190.aStringArray42[local471] = Static190.aStringArray42[local471 + 1];
																	Static190.aStringArray42[local471 + 1] = local2271;
																	local527 = Static287.aStringArray38[local471];
																	Static287.aStringArray38[local471] = Static287.aStringArray38[local471 + 1];
																	Static287.aStringArray38[local471 + 1] = local527;
																	@Pc(3992) int local3992 = Static361.anIntArray528[local471];
																	Static361.anIntArray528[local471] = Static361.anIntArray528[local471 + 1];
																	Static361.anIntArray528[local471 + 1] = local3992;
																	@Pc(4010) boolean local4010 = Static197.aBooleanArray12[local471];
																	Static197.aBooleanArray12[local471] = Static197.aBooleanArray12[local471 + 1];
																	Static197.aBooleanArray12[local471 + 1] = local4010;
																	local3884 = false;
																}
															}
															if (local3884) {
																break;
															}
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static247.aClass221_172 == Static40.aClass221_34) {
														local1129 = Static273.aClass2_Sub12_Sub2_3.method3113();
														local441 = Static313.method5191(Static272.method4036(Static355.method5673(Static273.aClass2_Sub12_Sub2_3)));
														Static67.method3711(0, local1129, 6, local441, local1129);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static84.aClass221_67) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local990 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local992 = Static273.aClass2_Sub12_Sub2_3.method3124();
														if (Static54.method1199(local177)) {
															Static344.method5602(local185, local646, local990, local992, local59);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static153.aClass221_114 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local59 = local177 >> 5;
														local185 = local177 & 0x1F;
														if (local185 == 0) {
															Static223.aClass52Array1[local59] = null;
															Static40.aClass221_34 = null;
															return true;
														}
														@Pc(4153) Class52 local4153 = new Class52();
														local4153.anInt1018 = local185;
														local4153.anInt1017 = Static273.aClass2_Sub12_Sub2_3.method3124();
														if (local4153.anInt1017 >= 0 && Static240.aClass46Array38.length > local4153.anInt1017) {
															if (local4153.anInt1018 == 1 || local4153.anInt1018 == 10) {
																local4153.anInt1012 = Static273.aClass2_Sub12_Sub2_3.method3104();
																Static273.aClass2_Sub12_Sub2_3.anInt3606 += 6;
															} else if (local4153.anInt1018 >= 2 && local4153.anInt1018 <= 6) {
																if (local4153.anInt1018 == 2) {
																	local4153.anInt1020 = 64;
																	local4153.anInt1009 = 64;
																}
																if (local4153.anInt1018 == 3) {
																	local4153.anInt1009 = 64;
																	local4153.anInt1020 = 0;
																}
																if (local4153.anInt1018 == 4) {
																	local4153.anInt1020 = 128;
																	local4153.anInt1009 = 64;
																}
																if (local4153.anInt1018 == 5) {
																	local4153.anInt1020 = 64;
																	local4153.anInt1009 = 0;
																}
																if (local4153.anInt1018 == 6) {
																	local4153.anInt1020 = 64;
																	local4153.anInt1009 = 128;
																}
																local4153.anInt1018 = 2;
																local4153.anInt1024 = Static273.aClass2_Sub12_Sub2_3.method3124();
																local4153.anInt1011 = Static273.aClass2_Sub12_Sub2_3.method3104();
																local4153.anInt1022 = Static273.aClass2_Sub12_Sub2_3.method3104();
																local4153.anInt1021 = Static273.aClass2_Sub12_Sub2_3.method3124();
																local4153.anInt1023 = Static273.aClass2_Sub12_Sub2_3.method3104();
															}
															local4153.anInt1016 = Static273.aClass2_Sub12_Sub2_3.method3104();
															if (local4153.anInt1016 == 65535) {
																local4153.anInt1016 = -1;
															}
															Static223.aClass52Array1[local59] = local4153;
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static249.aClass221_173 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
														if (local177 == 65535) {
															local177 = -1;
														}
														local59 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3135();
														if (Static54.method1199(local59)) {
															Static83.method1682(1, local177, local185, -1);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static39.aClass221_32 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														if (local177 == 65535) {
															local177 = -1;
														}
														local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3124();
														Static197.method3643(local646, local177, local185, local59);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static233.aClass221_165 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3132();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3140();
														if (local177 == 255) {
															local177 = -1;
															local59 = -1;
														}
														Static146.method2842(local177, local59);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static60.aClass221_47 == Static40.aClass221_34) {
														Static196.method3638(false);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static10.aClass221_18) {
														local1129 = Static273.aClass2_Sub12_Sub2_3.method3113();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local392 = Static332.method5409(local59).method2567(Static273.aClass2_Sub12_Sub2_3);
														Static113.method2231(local392, 19, local1129, local1129, local59, null, 0);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static95.aClass221_74 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3126();
														if (Static54.method1199(local177)) {
															Static83.method1682(3, -1, local59, -1);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == aClass221_210) {
														Static222.anInt6838 = Static273.aClass2_Sub12_Sub2_3.method3124();
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static166.aClass221_126) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local980 = (local59 & 0x1) == 1;
														Static57.method1229(local177, local980);
														local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
														for (local990 = 0; local990 < local646; local990++) {
															local992 = Static273.aClass2_Sub12_Sub2_3.method3124();
															if (local992 == 255) {
																local992 = Static273.aClass2_Sub12_Sub2_3.method3135();
															}
															local814 = Static273.aClass2_Sub12_Sub2_3.method3099();
															Static89.method1795(local980, local990, local992, local814 - 1, local177);
														}
														Static208.anIntArray339[Static10.anInt184++ & 0x1F] = local177;
														Static40.aClass221_34 = null;
														return true;
													} else if (Static198.aClass221_156 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3116();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3126();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3109();
														if (Static54.method1199(local185)) {
															Static55.method1205((local177 << 16) + local646, local59);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static362.aClass221_226 == Static40.aClass221_34) {
														Static348.method2469();
														Static40.aClass221_34 = null;
														return false;
													} else if (Static133.aClass221_98 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3126();
														if (Static54.method1199(local177)) {
															Static83.method1682(5, Static217.anInt4819, local59, 0);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static2.aClass221_5) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3135();
														Static128.aClass26_3 = Static62.aClass179_2.method4886(local177);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static196.aClass221_141 == Static40.aClass221_34) {
														Static347.method5636(false);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static162.aClass221_121) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3148();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3116();
														if (local177 >> 30 == 0) {
															@Pc(4850) Class84 local4850;
															@Pc(4825) Class177 local4825;
															@Pc(4880) Class84 local4880;
															@Pc(4830) Class177 local4830;
															@Pc(4845) Class84 local4845;
															if (local177 >> 29 != 0) {
																local990 = local177 & 0xFFFF;
																@Pc(4795) Class1_Sub2_Sub3_Sub2 local4795 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local990];
																if (local4795 != null) {
																	if (local646 == 65535) {
																		local646 = -1;
																	}
																	local2765 = true;
																	if (local646 != -1 && local4795.anInt6902 != -1) {
																		if (local646 == local4795.anInt6902) {
																			local4825 = Static41.method4707(local646);
																			if (local4825.aBoolean516 && local4825.anInt5808 != -1) {
																				local4880 = Static91.method1822(local4825.anInt5808);
																				local467 = local4880.anInt2456;
																				if (local467 == 0 || local467 == 2) {
																					local2765 = false;
																				} else if (local467 == 1) {
																					local2765 = true;
																				}
																			}
																		} else {
																			local4825 = Static41.method4707(local646);
																			local4830 = Static41.method4707(local4795.anInt6902);
																			if (local4825.anInt5808 != -1 && local4830.anInt5808 != -1) {
																				local4845 = Static91.method1822(local4825.anInt5808);
																				local4850 = Static91.method1822(local4830.anInt5808);
																				if (local4845.anInt2459 < local4850.anInt2459) {
																					local2765 = false;
																				}
																			}
																		}
																	}
																	if (local2765) {
																		local4795.anInt6898 = 0;
																		local4795.anInt6957 = 1;
																		local4795.anInt6902 = local646;
																		local4795.anInt6945 = 0;
																		local4795.anInt6948 = Static6.anInt91 + local185;
																		local4795.anInt6946 = local59;
																		if (Static6.anInt91 < local4795.anInt6948) {
																			local4795.anInt6898 = -1;
																		}
																		if (local4795.anInt6902 != -1 && local4795.anInt6948 == Static6.anInt91) {
																			local1784 = Static41.method4707(local4795.anInt6902).anInt5808;
																			if (local1784 != -1) {
																				local4880 = Static91.method1822(local1784);
																				if (local4880 != null && local4880.anIntArray197 != null) {
																					Static41.method4705(false, 0, local4795.anInt6888, local4795.anInt6893, local4880, local4795.aByte77);
																				}
																			}
																		}
																	}
																}
															} else if (local177 >> 28 != 0) {
																local990 = local177 & 0xFFFF;
																@Pc(4996) Class1_Sub2_Sub3_Sub1 local4996;
																if (local990 == Static217.anInt4819) {
																	local4996 = Static177.aClass1_Sub2_Sub3_Sub1_1;
																} else {
																	local4996 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local990];
																}
																if (local4996 != null) {
																	if (local646 == 65535) {
																		local646 = -1;
																	}
																	local2765 = true;
																	if (local646 != -1 && local4996.anInt6902 != -1) {
																		if (local646 == local4996.anInt6902) {
																			local4825 = Static41.method4707(local646);
																			if (local4825.aBoolean516 && local4825.anInt5808 != -1) {
																				local4880 = Static91.method1822(local4825.anInt5808);
																				local467 = local4880.anInt2456;
																				if (local467 == 0 || local467 == 2) {
																					local2765 = false;
																				} else if (local467 == 1) {
																					local2765 = true;
																				}
																			}
																		} else {
																			local4825 = Static41.method4707(local646);
																			local4830 = Static41.method4707(local4996.anInt6902);
																			if (local4825.anInt5808 != -1 && local4830.anInt5808 != -1) {
																				local4845 = Static91.method1822(local4825.anInt5808);
																				local4850 = Static91.method1822(local4830.anInt5808);
																				if (local4850.anInt2459 > local4845.anInt2459) {
																					local2765 = false;
																				}
																			}
																		}
																	}
																	if (local2765) {
																		local4996.anInt6946 = local59;
																		local4996.anInt6948 = Static6.anInt91 + local185;
																		local4996.anInt6902 = local646;
																		local4996.anInt6957 = 1;
																		local4996.anInt6945 = 0;
																		local4996.anInt6898 = 0;
																		if (local4996.anInt6902 == 65535) {
																			local4996.anInt6902 = -1;
																		}
																		if (local4996.anInt6948 > Static6.anInt91) {
																			local4996.anInt6898 = -1;
																		}
																		if (local4996.anInt6902 != -1 && local4996.anInt6948 == Static6.anInt91) {
																			local1784 = Static41.method4707(local4996.anInt6902).anInt5808;
																			if (local1784 != -1) {
																				local4880 = Static91.method1822(local1784);
																				if (local4880 != null && local4880.anIntArray197 != null) {
																					Static41.method4705(Static177.aClass1_Sub2_Sub3_Sub1_1 == local4996, 0, local4996.anInt6888, local4996.anInt6893, local4880, local4996.aByte77);
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local990 = local177 >> 28 & 0x3;
															local992 = (local177 >> 14 & 0x3FFF) - Static150.anInt3453;
															local814 = (local177 & 0x3FFF) - Static287.anInt5776;
															if (local992 >= 0 && local814 >= 0 && Static66.anInt1177 > local992 && Static12.anInt213 > local814) {
																local1784 = local992 * 128 + 64;
																local1625 = local814 * 128 + 64;
																@Pc(4771) Class1_Sub2_Sub6 local4771 = new Class1_Sub2_Sub6(local646, 0, Static6.anInt91, local990, local1784, Static97.method1899(local990, local1625, local1784) - local59, local1625, local992, local992, local814, local814);
																Static30.aClass180_3.method4909(new Class2_Sub9_Sub9(local4771));
															}
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static82.aClass221_66 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3126();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
														if (local646 == 65535) {
															local646 = -1;
														}
														local990 = Static273.aClass2_Sub12_Sub2_3.method3099();
														if (local990 == 65535) {
															local990 = -1;
														}
														if (Static54.method1199(local59)) {
															for (local992 = local646; local992 <= local990; local992++) {
																local3284 = ((long) local177 << 32) + (long) local992;
																local3290 = (Class2_Sub43) Static135.aClass41_15.method902(local3284);
																if (local3290 != null) {
																	local3305 = new Class2_Sub43(local3290.anInt6736, local185);
																	local3290.method5723();
																} else if (local992 == -1) {
																	local3305 = new Class2_Sub43(Static8.method144(local177).aClass2_Sub43_2.anInt6736, local185);
																} else {
																	local3305 = new Class2_Sub43(0, local185);
																}
																Static135.aClass41_15.method901(local3305, local3284);
															}
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static225.aClass221_161) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3109();
														if (Static54.method1199(local177)) {
															Static216.method4121(local59, local185);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static39.aClass221_33) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3153();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3135();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local757 = "";
														local767 = local757;
														if ((local185 & 0x1) != 0) {
															local757 = Static273.aClass2_Sub12_Sub2_3.method3113();
															if ((local185 & 0x2) == 0) {
																local767 = local757;
															} else {
																local767 = Static273.aClass2_Sub12_Sub2_3.method3113();
															}
														}
														local771 = Static273.aClass2_Sub12_Sub2_3.method3113();
														if (local177 == 99) {
															Static35.method5764(local771);
														} else if (local767.equals("") || !Static18.method269(local767)) {
															Static67.method3711(local59, local757, local177, local771, local767);
														} else {
															Static40.aClass221_34 = null;
															return true;
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static103.aClass221_118) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local990 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local992 = Static273.aClass2_Sub12_Sub2_3.method3124();
														if (Static54.method1199(local177)) {
															Static233.method4279(local185, local992, local59, local990, local646, true);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static245.aClass221_170 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3126();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3105();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3099();
														if (local646 == 65535) {
															local646 = -1;
														}
														if (Static54.method1199(local185)) {
															Static147.method2852(local646, local177, local59);
															@Pc(5506) Class122 local5506 = Static310.aClass184_2.method5040(local646);
															Static182.method2439(local5506.anInt3936, local5506.anInt3908, local5506.anInt3916, local177);
															Static62.method1300(local5506.anInt3903, local5506.anInt3910, local5506.anInt3956, local177);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static342.aClass221_218) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														if (local177 == 65535) {
															local177 = -1;
														}
														local59 = Static273.aClass2_Sub12_Sub2_3.method3109();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3105();
														if (Static54.method1199(local59)) {
															Static83.method1682(2, local177, local185, -1);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static16.aClass221_26) {
														Static139.method2701(Static197.aClass143_11);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static270.aClass221_186 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3124();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
														local980 = (local177 & 0x1) == 1;
														Static311.method5193(local980, local59);
														Static208.anIntArray339[Static10.anInt184++ & 0x1F] = local59;
														Static40.aClass221_34 = null;
														return true;
													} else if (Static247.aClass221_171 == Static40.aClass221_34) {
														Static139.method2701(Static308.aClass143_18);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static23.aClass221_28) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3104();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3099();
														local646 = Static273.aClass2_Sub12_Sub2_3.method3126();
														local990 = Static273.aClass2_Sub12_Sub2_3.method3116();
														if (Static54.method1199(local59)) {
															Static83.method1682(7, local990 << 16 | local177, local646, local185);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static124.aClass221_91) {
														Static139.method2701(Static64.aClass143_3);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static347.aClass221_221) {
														if (Static229.aFrame3 != null) {
															Static84.method1692(-1, Static313.anInt6146, -1, false);
														}
														@Pc(5701) byte[] local5701 = new byte[Static275.anInt5636];
														Static273.aClass2_Sub12_Sub2_3.method3170(local5701, Static275.anInt5636);
														local441 = Static272.method4035(local5701, Static275.anInt5636, 0);
														Static78.method1596(true, Static62.aClass179_2, local441, Static114.anInt2421 == 1);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static116.aClass221_82 == Static40.aClass221_34) {
														Static362.anInt6988 = Static273.aClass2_Sub12_Sub2_3.method3124();
														Static193.anInt4255 = Static125.anInt2664;
														Static40.aClass221_34 = null;
														return true;
													} else if (Static338.aClass221_216 == Static40.aClass221_34) {
														local177 = Static273.aClass2_Sub12_Sub2_3.method3135();
														local59 = Static273.aClass2_Sub12_Sub2_3.method3116();
														local185 = Static273.aClass2_Sub12_Sub2_3.method3109();
														if (Static54.method1199(local185)) {
															Static182.method2434(local59, local177);
														}
														Static40.aClass221_34 = null;
														return true;
													} else if (Static12.aClass221_19 == Static40.aClass221_34) {
														Static139.method2701(Static247.aClass143_16);
														Static40.aClass221_34 = null;
														return true;
													} else if (Static40.aClass221_34 == Static223.aClass221_160) {
														if (Static269.anInt6658 != -1) {
															Static271.method4703(0, Static269.anInt6658);
														}
														Static40.aClass221_34 = null;
														return true;
													} else {
														Static40.method506("T1 - " + (Static40.aClass221_34 == null ? -1 : Static40.aClass221_34.method5737()) + "," + (Static67.aClass221_143 == null ? -1 : Static67.aClass221_143.method5737()) + "," + (Static279.aClass221_135 == null ? -1 : Static279.aClass221_135.method5737()) + " - " + Static275.anInt5636, null);
														Static348.method2469();
														return true;
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
			}
		}
	}
}
