import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!qn;")
	public static Class211 aClass211_86;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "Lclient!jv;")
	public static Class142 aClass142_7;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "Lclient!l;")
	public static Class95 aClass95_23;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "Lclient!ud;")
	public static final Class245 aClass245_16 = new Class245(14, 0, 4, 1);

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_239 = new Class56(54, 12);

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)Z")
	public static boolean method5257() throws IOException {
		if (Static338.aClass152_4 == null) {
			return false;
		}
		@Pc(13) int local13 = Static338.aClass152_4.method2921();
		if (local13 == 0) {
			return false;
		}
		@Pc(72) int local72;
		if (Static149.aClass56_102 == null) {
			if (Static198.aBoolean370) {
				local13--;
				Static338.aClass152_4.method2923(1, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
				Static198.aBoolean370 = false;
				Static451.anInt7551++;
			}
			Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
			if (Static56.aClass4_Sub9_Sub2_1.method5069()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static338.aClass152_4.method2923(1, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 1);
				Static451.anInt7551++;
			}
			Static198.aBoolean370 = true;
			@Pc(68) Class56[] local68 = Static192.method2790();
			local72 = Static56.aClass4_Sub9_Sub2_1.method5066();
			if (local72 < 0 || local68.length <= local72) {
				throw new IOException("invo:" + local72 + " ip:" + Static56.aClass4_Sub9_Sub2_1.anInt6207);
			}
			Static149.aClass56_102 = local68[local72];
			Static313.anInt5082 = Static149.aClass56_102.anInt1531;
		}
		if (Static313.anInt5082 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static338.aClass152_4.method2923(1, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
			Static313.anInt5082 = Static56.aClass4_Sub9_Sub2_1.aByteArray81[0] & 0xFF;
			Static451.anInt7551++;
			local13--;
		}
		if (Static313.anInt5082 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static338.aClass152_4.method2923(2, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
			Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
			Static313.anInt5082 = Static56.aClass4_Sub9_Sub2_1.method5028();
			local13 -= 2;
			Static451.anInt7551 += 2;
		}
		if (local13 < Static313.anInt5082) {
			return false;
		}
		Static56.aClass4_Sub9_Sub2_1.anInt6207 = 0;
		Static338.aClass152_4.method2923(Static313.anInt5082, Static56.aClass4_Sub9_Sub2_1.aByteArray81, 0);
		Static451.anInt7551 += Static313.anInt5082;
		Static451.aClass56_267 = Static7.aClass56_7;
		Static77.anInt1536 = 0;
		Static7.aClass56_7 = Static414.aClass56_249;
		Static414.aClass56_249 = Static149.aClass56_102;
		if (Static244.aClass56_144 == Static149.aClass56_102) {
			Static276.method3663(Static78.aClass250_6);
			Static149.aClass56_102 = null;
			return true;
		}
		@Pc(224) int local224;
		@Pc(216) int local216;
		if (Static149.aClass56_102 == Static314.aClass56_193) {
			local216 = Static56.aClass4_Sub9_Sub2_1.method5051();
			local72 = Static56.aClass4_Sub9_Sub2_1.method5036();
			local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
			if (Static182.method2532(local224)) {
				Static98.method1499(local72, local216);
			}
			Static149.aClass56_102 = null;
			return true;
		} else if (Static131.aClass56_91 == Static149.aClass56_102) {
			Static178.method2494();
			Static149.aClass56_102 = null;
			return false;
		} else {
			@Pc(258) String local258;
			@Pc(252) String local252;
			if (Static149.aClass56_102 == Static58.aClass56_46) {
				local252 = Static56.aClass4_Sub9_Sub2_1.method5038();
				local258 = Static265.method3496(Static334.method4420(Static56.aClass4_Sub9_Sub2_1));
				Static290.method3782(local252, local258, 0, local252, 6);
				Static149.aClass56_102 = null;
				return true;
			} else if (Static149.aClass56_102 == Static55.aClass56_39) {
				Static276.method3663(Static120.aClass250_8);
				Static149.aClass56_102 = null;
				return true;
			} else if (Static219.aClass56_132 == Static149.aClass56_102) {
				Static71.aString73 = Static313.anInt5082 > 2 ? Static56.aClass4_Sub9_Sub2_1.method5038() : Static418.aClass15_127.method180(Static429.anInt6999);
				Static77.anInt1542 = Static313.anInt5082 > 0 ? Static56.aClass4_Sub9_Sub2_1.method5028() : -1;
				Static149.aClass56_102 = null;
				if (Static77.anInt1542 == 65535) {
					Static77.anInt1542 = -1;
				}
				return true;
			} else {
				@Pc(338) int local338;
				if (Static189.aClass56_122 == Static149.aClass56_102) {
					local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
					local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
					@Pc(333) Object[] local333 = new Object[local258.length() + 1];
					for (local338 = local258.length() - 1; local338 >= 0; local338--) {
						if (local258.charAt(local338) == 's') {
							local333[local338 + 1] = Static56.aClass4_Sub9_Sub2_1.method5038();
						} else {
							local333[local338 + 1] = Integer.valueOf(Static56.aClass4_Sub9_Sub2_1.method4997());
						}
					}
					local333[0] = Integer.valueOf(Static56.aClass4_Sub9_Sub2_1.method4997());
					if (Static182.method2532(local216)) {
						@Pc(389) Class4_Sub34 local389 = new Class4_Sub34();
						local389.anObjectArray34 = local333;
						Static80.method1289(local389);
					}
					Static149.aClass56_102 = null;
					return true;
				} else if (Static173.aClass56_113 == Static149.aClass56_102) {
					Static360.method4757(false);
					Static149.aClass56_102 = null;
					return true;
				} else if (Static149.aClass56_102 == aClass56_239) {
					local216 = Static56.aClass4_Sub9_Sub2_1.method5007();
					local72 = local216 >> 5;
					local224 = local216 & 0x1F;
					if (local224 == 0) {
						Static62.aClass133Array1[local72] = null;
						Static149.aClass56_102 = null;
						return true;
					}
					@Pc(440) Class133 local440 = new Class133();
					local440.anInt3345 = local224;
					local440.anInt3343 = Static56.aClass4_Sub9_Sub2_1.method5007();
					if (local440.anInt3343 >= 0 && Static412.aClass95Array15.length > local440.anInt3343) {
						if (local440.anInt3345 == 1 || local440.anInt3345 == 10) {
							local440.anInt3347 = Static56.aClass4_Sub9_Sub2_1.method5028();
							Static56.aClass4_Sub9_Sub2_1.anInt6207 += 6;
						} else if (local440.anInt3345 >= 2 && local440.anInt3345 <= 6) {
							if (local440.anInt3345 == 2) {
								local440.anInt3340 = 64;
								local440.anInt3344 = 64;
							}
							if (local440.anInt3345 == 3) {
								local440.anInt3344 = 0;
								local440.anInt3340 = 64;
							}
							if (local440.anInt3345 == 4) {
								local440.anInt3344 = 128;
								local440.anInt3340 = 64;
							}
							if (local440.anInt3345 == 5) {
								local440.anInt3344 = 64;
								local440.anInt3340 = 0;
							}
							if (local440.anInt3345 == 6) {
								local440.anInt3344 = 64;
								local440.anInt3340 = 128;
							}
							local440.anInt3345 = 2;
							local440.anInt3338 = Static56.aClass4_Sub9_Sub2_1.method5007();
							local440.anInt3344 += Static56.aClass4_Sub9_Sub2_1.method5028() - Static365.anInt6047 << 7;
							local440.anInt3340 += Static56.aClass4_Sub9_Sub2_1.method5028() - Static366.anInt6052 << 7;
							local440.anInt3348 = Static56.aClass4_Sub9_Sub2_1.method5007() << 0;
							local440.anInt3341 = Static56.aClass4_Sub9_Sub2_1.method5028();
						}
						local440.anInt3336 = Static56.aClass4_Sub9_Sub2_1.method5028();
						if (local440.anInt3336 == 65535) {
							local440.anInt3336 = -1;
						}
						Static62.aClass133Array1[local72] = local440;
					}
					Static149.aClass56_102 = null;
					return true;
				} else if (Static335.aClass56_205 == Static149.aClass56_102) {
					local216 = Static56.aClass4_Sub9_Sub2_1.method5036();
					local72 = Static56.aClass4_Sub9_Sub2_1.method5028();
					if (Static182.method2532(local72)) {
						Static457.method6054(Static12.anInt187, 0, 5, local216);
					}
					Static149.aClass56_102 = null;
					return true;
				} else if (Static429.aClass56_250 == Static149.aClass56_102) {
					local252 = Static56.aClass4_Sub9_Sub2_1.method5038();
					local72 = Static56.aClass4_Sub9_Sub2_1.method5045();
					local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
					if (Static182.method2532(local72)) {
						Static162.method61(local224, local252);
					}
					Static149.aClass56_102 = null;
					return true;
				} else {
					@Pc(683) byte local683;
					if (Static218.aClass56_130 == Static149.aClass56_102) {
						local683 = Static56.aClass4_Sub9_Sub2_1.method5022();
						local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
						local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
						if (Static182.method2532(local72)) {
							Static4.method72(local224, local683);
						}
						Static149.aClass56_102 = null;
						return true;
					} else if (Static146.aClass56_97 == Static149.aClass56_102) {
						local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
						if (local216 == 65535) {
							local216 = -1;
						}
						local72 = Static56.aClass4_Sub9_Sub2_1.method5013();
						local224 = Static56.aClass4_Sub9_Sub2_1.method5012();
						Static108.method139(local216, local72, local224);
						Static149.aClass56_102 = null;
						return true;
					} else if (Static149.aClass56_102 == Static349.aClass56_210) {
						local216 = Static56.aClass4_Sub9_Sub2_1.method5031();
						local72 = Static56.aClass4_Sub9_Sub2_1.method5012();
						local224 = Static56.aClass4_Sub9_Sub2_1.method5056();
						if (local224 == 65535) {
							local224 = -1;
						}
						Static25.method342(local216, local224, local72);
						Static149.aClass56_102 = null;
						return true;
					} else {
						@Pc(817) String local817;
						@Pc(963) int local963;
						@Pc(821) Class130 local821;
						@Pc(784) boolean local784;
						@Pc(856) int local856;
						@Pc(804) boolean local804;
						@Pc(846) int local846;
						if (Static456.aClass56_273 == Static149.aClass56_102) {
							local252 = Static56.aClass4_Sub9_Sub2_1.method5038();
							local784 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
							if (local784) {
								local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
							} else {
								local258 = local252;
							}
							local338 = Static56.aClass4_Sub9_Sub2_1.method5028();
							@Pc(802) byte local802 = Static56.aClass4_Sub9_Sub2_1.method5063();
							local804 = false;
							if (local802 == -128) {
								local804 = true;
							}
							if (local804) {
								if (Static87.anInt1666 == 0) {
									Static149.aClass56_102 = null;
									return true;
								}
								for (local963 = 0; local963 < Static87.anInt1666 && (!Static404.aClass130Array1[local963].aString28.equals(local258) || local338 != Static404.aClass130Array1[local963].anInt3233); local963++) {
								}
								if (Static87.anInt1666 > local963) {
									while (local963 < Static87.anInt1666 - 1) {
										Static404.aClass130Array1[local963] = Static404.aClass130Array1[local963 + 1];
										local963++;
									}
									Static87.anInt1666--;
									Static404.aClass130Array1[Static87.anInt1666] = null;
								}
							} else {
								local817 = Static56.aClass4_Sub9_Sub2_1.method5038();
								local821 = new Class130();
								local821.aString27 = local252;
								local821.aString28 = local258;
								local821.aString29 = Static112.method1664(local821.aString28);
								local821.aString30 = local817;
								local821.anInt3233 = local338;
								local821.aByte67 = local802;
								for (local846 = Static87.anInt1666 - 1; local846 >= 0; local846--) {
									local856 = Static404.aClass130Array1[local846].aString29.compareTo(local821.aString29);
									if (local856 == 0) {
										Static404.aClass130Array1[local846].anInt3233 = local338;
										Static404.aClass130Array1[local846].aByte67 = local802;
										Static404.aClass130Array1[local846].aString30 = local817;
										if (local258.equals(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60)) {
											Static101.aByte32 = local802;
										}
										Static450.anInt7529 = Static79.anInt1568;
										Static149.aClass56_102 = null;
										return true;
									}
									if (local856 < 0) {
										break;
									}
								}
								if (Static404.aClass130Array1.length <= Static87.anInt1666) {
									Static149.aClass56_102 = null;
									return true;
								}
								for (local856 = Static87.anInt1666 - 1; local856 > local846; local856--) {
									Static404.aClass130Array1[local856 + 1] = Static404.aClass130Array1[local856];
								}
								if (Static87.anInt1666 == 0) {
									Static404.aClass130Array1 = new Class130[100];
								}
								Static404.aClass130Array1[local846 + 1] = local821;
								Static87.anInt1666++;
								if (local258.equals(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60)) {
									Static101.aByte32 = local802;
								}
							}
							Static450.anInt7529 = Static79.anInt1568;
							Static149.aClass56_102 = null;
							return true;
						}
						@Pc(1044) int local1044;
						@Pc(1050) int local1050;
						@Pc(1060) int local1060;
						if (Static414.aClass56_248 == Static149.aClass56_102) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5007();
							local72 = local216 >> 2;
							local224 = local216 & 0x3;
							local338 = Static33.anIntArray43[local72];
							local1044 = Static56.aClass4_Sub9_Sub2_1.method5036();
							local1050 = local1044 >> 28 & 0x3;
							local963 = local1044 >> 14 & 0x3FFF;
							local1060 = local1044 & 0x3FFF;
							local846 = Static56.aClass4_Sub9_Sub2_1.method5042();
							local963 -= Static365.anInt6047;
							local1060 -= Static366.anInt6052;
							if (local846 == 65535) {
								local846 = -1;
							}
							Static186.method2730(local963, local224, local1050, local846, local338, local1060, local72);
							Static149.aClass56_102 = null;
							return true;
						} else if (Static146.aClass56_98 == Static149.aClass56_102) {
							Static276.method3663(Static111.aClass250_7);
							Static149.aClass56_102 = null;
							return true;
						} else if (Static105.aClass56_79 == Static149.aClass56_102) {
							Static237.anInt5934 = Static56.aClass4_Sub9_Sub2_1.method5013();
							Static349.anInt5766 = Static56.aClass4_Sub9_Sub2_1.method5022() << 3;
							Static244.anInt4058 = Static56.aClass4_Sub9_Sub2_1.method5022() << 3;
							for (@Pc(1126) Class4_Sub6 local1126 = (Class4_Sub6) Static41.aClass67_2.method1428(); local1126 != null; local1126 = (Class4_Sub6) Static41.aClass67_2.method1424()) {
								local72 = (int) (local1126.aLong227 & 0x3FFFL);
								local224 = (int) (local1126.aLong227 >> 14 & 0x3FFFL);
								local338 = (int) (local1126.aLong227 >> 28 & 0x3L);
								if (local338 == Static237.anInt5934 && local72 >= Static349.anInt5766 && Static349.anInt5766 + 8 > local72 && local224 >= Static244.anInt4058 && local224 < Static244.anInt4058 + 8) {
									local1126.method6059();
									Static39.method546(local72, Static237.anInt5934, local224);
								}
							}
							for (@Pc(1209) Class4_Sub18 local1209 = (Class4_Sub18) Static342.aClass244_34.method5263(); local1209 != null; local1209 = (Class4_Sub18) Static342.aClass244_34.method5271()) {
								if (local1209.anInt3037 >= Static349.anInt5766 && local1209.anInt3037 < Static349.anInt5766 + 8 && Static244.anInt4058 <= local1209.anInt3031 && Static244.anInt4058 + 8 > local1209.anInt3031 && Static237.anInt5934 == local1209.anInt3036) {
									local1209.anInt3032 = 0;
								}
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static321.aClass56_197 == Static149.aClass56_102) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
							if (Static182.method2532(local216)) {
								Static296.method3846();
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static161.aClass56_108 == Static149.aClass56_102) {
							Static423.anInt7106 = 1;
							Static149.aClass56_102 = null;
							Static357.anInt5911 = Static79.anInt1568;
							return true;
						} else if (Static83.aClass56_195 == Static149.aClass56_102) {
							Static327.anInt5289 = Static56.aClass4_Sub9_Sub2_1.method5007();
							Static149.aClass56_102 = null;
							Static161.anInt2989 = Static79.anInt1568;
							return true;
						} else if (Static24.aClass56_25 == Static149.aClass56_102) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5056();
							local72 = Static56.aClass4_Sub9_Sub2_1.method4998();
							local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
							if (Static182.method2532(local216)) {
								Static277.method3666(local72, local224);
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static149.aClass56_102 == Static155.aClass56_105) {
							for (local216 = 0; local216 < Static267.aClass8_Sub3_Sub1_Sub1Array1.length; local216++) {
								if (Static267.aClass8_Sub3_Sub1_Sub1Array1[local216] != null) {
									Static267.aClass8_Sub3_Sub1_Sub1Array1[local216].anInt7365 = -1;
								}
							}
							for (local72 = 0; local72 < Static367.aClass8_Sub3_Sub1_Sub2Array1.length; local72++) {
								if (Static367.aClass8_Sub3_Sub1_Sub2Array1[local72] != null) {
									Static367.aClass8_Sub3_Sub1_Sub2Array1[local72].anInt7365 = -1;
								}
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static86.aClass56_65 == Static149.aClass56_102) {
							local252 = Static56.aClass4_Sub9_Sub2_1.method5038();
							local72 = Static56.aClass4_Sub9_Sub2_1.method5012();
							local224 = Static56.aClass4_Sub9_Sub2_1.method5046();
							local338 = Static56.aClass4_Sub9_Sub2_1.method5045();
							if (local338 == 65535) {
								local338 = -1;
							}
							if (local224 >= 1 && local224 <= 8) {
								if (local252.equalsIgnoreCase("null")) {
									local252 = null;
								}
								Static87.aStringArray11[local224 - 1] = local252;
								Static43.anIntArray271[local224 - 1] = local338;
								Static383.aBooleanArray29[local224 - 1] = local72 == 0;
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static221.aClass56_134 == Static149.aClass56_102) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5045();
							local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
							local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
							if (Static182.method2532(local224)) {
								Static162.method61(local216, local258);
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static366.aClass56_224 == Static149.aClass56_102) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5042();
							local72 = Static56.aClass4_Sub9_Sub2_1.method5056();
							local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
							local338 = Static56.aClass4_Sub9_Sub2_1.method5056();
							local1044 = Static56.aClass4_Sub9_Sub2_1.method4997();
							if (Static182.method2532(local338)) {
								Static457.method6054(local216 << 16 | local72, local224, 7, local1044);
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static149.aClass56_102 == Static256.aClass56_154) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5007();
							local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
							local224 = Static56.aClass4_Sub9_Sub2_1.method4998();
							if (Static182.method2532(local72)) {
								Static235.method3187(local224, local216);
							}
							Static149.aClass56_102 = null;
							return true;
						} else if (Static169.aClass56_112 == Static149.aClass56_102) {
							local216 = Static56.aClass4_Sub9_Sub2_1.method5046();
							local72 = Static56.aClass4_Sub9_Sub2_1.method5046();
							if (local216 == 255) {
								local216 = -1;
								local72 = -1;
							}
							Static347.method4607(local216, local72);
							Static149.aClass56_102 = null;
							return true;
						} else if (Static149.aClass56_102 == Static306.aClass56_191) {
							Static276.method3663(Static159.aClass250_12);
							Static149.aClass56_102 = null;
							return true;
						} else {
							@Pc(1607) String local1607;
							@Pc(1634) String local1634;
							@Pc(1605) String local1605;
							if (Static39.aClass56_30 == Static149.aClass56_102) {
								local216 = Static56.aClass4_Sub9_Sub2_1.method5033();
								local72 = Static56.aClass4_Sub9_Sub2_1.method4997();
								local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
								local1605 = "";
								local1607 = local1605;
								if ((local224 & 0x1) != 0) {
									local1605 = Static56.aClass4_Sub9_Sub2_1.method5038();
									if ((local224 & 0x2) == 0) {
										local1607 = local1605;
									} else {
										local1607 = Static56.aClass4_Sub9_Sub2_1.method5038();
									}
								}
								local1634 = Static56.aClass4_Sub9_Sub2_1.method5038();
								if (local216 == 99) {
									Static385.method5096(local1634);
								} else if (local1607.equals("") || !Static231.method3150(local1607)) {
									Static290.method3782(local1607, local1634, local72, local1605, local216);
								} else {
									Static149.aClass56_102 = null;
									return true;
								}
								Static149.aClass56_102 = null;
								return true;
							} else if (Static399.aClass56_240 == Static149.aClass56_102) {
								local216 = Static56.aClass4_Sub9_Sub2_1.method5042();
								local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
								local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
								if (Static182.method2532(local72)) {
									if (local224 == 2) {
										Static109.method5062();
									}
									Static182.anInt3346 = local216;
									Static9.method3941(local216);
									Static31.method434(false);
									Static80.method1283(Static182.anInt3346);
									for (local338 = 0; local338 < 100; local338++) {
										Static72.aBooleanArray7[local338] = true;
									}
								}
								Static149.aClass56_102 = null;
								return true;
							} else {
								@Pc(1745) String local1745;
								if (Static378.aClass56_245 == Static149.aClass56_102) {
									local216 = Static56.aClass4_Sub9_Sub2_1.method5007();
									@Pc(1741) boolean local1741 = (local216 & 0x1) == 1;
									local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
									local1605 = Static56.aClass4_Sub9_Sub2_1.method5038();
									if (local1605.equals("")) {
										local1605 = local1745;
									}
									local1607 = Static56.aClass4_Sub9_Sub2_1.method5038();
									local1634 = Static56.aClass4_Sub9_Sub2_1.method5038();
									if (local1634.equals("")) {
										local1634 = local1607;
									}
									if (local1741) {
										for (local963 = 0; local963 < Static66.anInt1316; local963++) {
											if (Static406.aStringArray42[local963].equals(local1634)) {
												Static93.aStringArray14[local963] = local1745;
												Static406.aStringArray42[local963] = local1605;
												Static441.aStringArray46[local963] = local1607;
												Static178.aStringArray28[local963] = local1634;
												break;
											}
										}
									} else {
										Static93.aStringArray14[Static66.anInt1316] = local1745;
										Static406.aStringArray42[Static66.anInt1316] = local1605;
										Static441.aStringArray46[Static66.anInt1316] = local1607;
										Static178.aStringArray28[Static66.anInt1316] = local1634;
										Static29.aBooleanArray3[Static66.anInt1316] = (local216 & 0x2) == 2;
										Static66.anInt1316++;
									}
									Static357.anInt5911 = Static79.anInt1568;
									Static149.aClass56_102 = null;
									return true;
								} else if (Static429.aClass56_251 == Static149.aClass56_102) {
									local216 = Static56.aClass4_Sub9_Sub2_1.method5016();
									local72 = Static56.aClass4_Sub9_Sub2_1.method5045();
									local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
									if (Static182.method2532(local224)) {
										Static170.method5840(local216, local72);
									}
									Static149.aClass56_102 = null;
									return true;
								} else if (Static183.aClass56_119 == Static149.aClass56_102) {
									local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
									local72 = Static56.aClass4_Sub9_Sub2_1.method5028();
									local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
									local338 = Static56.aClass4_Sub9_Sub2_1.method5028();
									if (Static182.method2532(local216) && Static412.aClass110ArrayArray2[local72] != null) {
										for (local1044 = local224; local1044 < local338; local1044++) {
											local1050 = Static56.aClass4_Sub9_Sub2_1.method5008();
											if (local1044 < Static412.aClass110ArrayArray2[local72].length && Static412.aClass110ArrayArray2[local72][local1044] != null) {
												Static412.aClass110ArrayArray2[local72][local1044].anInt2663 = local1050;
											}
										}
									}
									Static149.aClass56_102 = null;
									return true;
								} else {
									@Pc(1957) boolean local1957;
									if (Static60.aClass56_48 == Static149.aClass56_102) {
										local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
										local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
										local1745 = local258;
										if (local1957) {
											local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
										}
										local338 = Static56.aClass4_Sub9_Sub2_1.method5007();
										@Pc(1975) boolean local1975 = false;
										if (local338 <= 1) {
											if (Static412.aBoolean491 && !Static119.aBoolean403 || Static339.aBoolean389) {
												local1975 = true;
											} else if (local338 <= 1 && Static231.method3150(local1745)) {
												local1975 = true;
											}
										}
										if (!local1975 && Static347.anInt5749 == 0) {
											local1634 = Static265.method3496(Static334.method4420(Static56.aClass4_Sub9_Sub2_1));
											if (local338 == 2) {
												Static46.method610(null, "<img=1>" + local258, "<img=1>" + local1745, -1, local1634, 0, 24);
											} else if (local338 == 1) {
												Static46.method610(null, "<img=0>" + local258, "<img=0>" + local1745, -1, local1634, 0, 24);
											} else {
												Static46.method610(null, local258, local1745, -1, local1634, 0, 24);
											}
										}
										Static149.aClass56_102 = null;
										return true;
									} else if (Static262.aClass56_178 == Static149.aClass56_102) {
										local252 = Static56.aClass4_Sub9_Sub2_1.method5038();
										local72 = Static56.aClass4_Sub9_Sub2_1.method5028();
										local1745 = Static350.aClass66_1.method1411(local72).method5542(Static56.aClass4_Sub9_Sub2_1);
										Static46.method610(null, local252, local252, local72, local1745, 0, 19);
										Static149.aClass56_102 = null;
										return true;
									} else if (Static149.aClass56_102 == Static410.aClass56_246) {
										Static347.method4606();
										Static149.aClass56_102 = null;
										return false;
									} else if (Static108.aClass56_10 == Static149.aClass56_102) {
										local216 = Static56.aClass4_Sub9_Sub2_1.method5056();
										if (local216 == 65535) {
											local216 = -1;
										}
										local72 = Static56.aClass4_Sub9_Sub2_1.method5056();
										local224 = Static56.aClass4_Sub9_Sub2_1.method5016();
										if (Static182.method2532(local72)) {
											Static207.method2903(local224, local216);
										}
										Static149.aClass56_102 = null;
										return true;
									} else {
										@Pc(2194) long local2194;
										@Pc(2199) long local2199;
										@Pc(2204) long local2204;
										if (Static100.aClass56_75 == Static149.aClass56_102) {
											local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
											local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
											local1745 = local258;
											if (local1957) {
												local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
											}
											local2194 = Static56.aClass4_Sub9_Sub2_1.method5024();
											local2199 = Static56.aClass4_Sub9_Sub2_1.method5028();
											local2204 = Static56.aClass4_Sub9_Sub2_1.method5008();
											local856 = Static56.aClass4_Sub9_Sub2_1.method5007();
											@Pc(2214) long local2214 = (local2199 << 32) + local2204;
											@Pc(2216) boolean local2216 = false;
											@Pc(2218) int local2218 = 0;
											while (true) {
												if (local2218 >= 100) {
													if (local856 <= 1) {
														if (Static412.aBoolean491 && !Static119.aBoolean403 || Static339.aBoolean389) {
															local2216 = true;
														} else if (Static231.method3150(local1745)) {
															local2216 = true;
														}
													}
													break;
												}
												if (local2214 == Static170.aLongArray10[local2218]) {
													local2216 = true;
													break;
												}
												local2218++;
											}
											if (!local2216 && Static347.anInt5749 == 0) {
												Static170.aLongArray10[Static276.anInt4602] = local2214;
												Static276.anInt4602 = (Static276.anInt4602 + 1) % 100;
												@Pc(2281) String local2281 = Static265.method3496(Static334.method4420(Static56.aClass4_Sub9_Sub2_1));
												if (local856 == 2 || local856 == 3) {
													Static46.method610(Static265.method3494(local2194), "<img=1>" + local258, "<img=1>" + local1745, -1, local2281, 0, 9);
												} else if (local856 == 1) {
													Static46.method610(Static265.method3494(local2194), "<img=0>" + local258, "<img=0>" + local1745, -1, local2281, 0, 9);
												} else {
													Static46.method610(Static265.method3494(local2194), local258, local1745, -1, local2281, 0, 9);
												}
											}
											Static149.aClass56_102 = null;
											return true;
										} else if (Static149.aClass56_102 == Static93.aClass56_70) {
											Static56.aClass4_Sub9_Sub2_1.anInt6207 += 28;
											if (Static56.aClass4_Sub9_Sub2_1.method5054()) {
												Static336.method4436(Static56.aClass4_Sub9_Sub2_1, Static56.aClass4_Sub9_Sub2_1.anInt6207 - 28);
											}
											Static149.aClass56_102 = null;
											return true;
										} else if (Static252.aClass56_148 == Static149.aClass56_102) {
											Static10.anInt160 = Static56.aClass4_Sub9_Sub2_1.method5061();
											Static161.anInt2989 = Static79.anInt1568;
											Static149.aClass56_102 = null;
											return true;
										} else {
											@Pc(2446) int local2446;
											if (Static186.aClass56_120 == Static149.aClass56_102) {
												local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
												local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
												local1745 = local258;
												if (local1957) {
													local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
												}
												local2194 = Static56.aClass4_Sub9_Sub2_1.method5024();
												local2199 = Static56.aClass4_Sub9_Sub2_1.method5028();
												local2204 = Static56.aClass4_Sub9_Sub2_1.method5008();
												local856 = Static56.aClass4_Sub9_Sub2_1.method5007();
												local2446 = Static56.aClass4_Sub9_Sub2_1.method5028();
												@Pc(2452) long local2452 = (local2199 << 32) + local2204;
												@Pc(2454) boolean local2454 = false;
												@Pc(2456) int local2456 = 0;
												while (true) {
													if (local2456 >= 100) {
														if (local856 <= 1 && Static231.method3150(local1745)) {
															local2454 = true;
														}
														break;
													}
													if (local2452 == Static170.aLongArray10[local2456]) {
														local2454 = true;
														break;
													}
													local2456++;
												}
												if (!local2454 && Static347.anInt5749 == 0) {
													Static170.aLongArray10[Static276.anInt4602] = local2452;
													Static276.anInt4602 = (Static276.anInt4602 + 1) % 100;
													@Pc(2514) String local2514 = Static350.aClass66_1.method1411(local2446).method5542(Static56.aClass4_Sub9_Sub2_1);
													if (local856 == 2) {
														Static46.method610(Static265.method3494(local2194), "<img=1>" + local258, "<img=1>" + local1745, local2446, local2514, 0, 20);
													} else if (local856 == 1) {
														Static46.method610(Static265.method3494(local2194), "<img=0>" + local258, "<img=0>" + local1745, local2446, local2514, 0, 20);
													} else {
														Static46.method610(Static265.method3494(local2194), local258, local1745, local2446, local2514, 0, 20);
													}
												}
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static29.aClass56_13) {
												Static276.method3663(Static289.aClass250_17);
												Static149.aClass56_102 = null;
												return true;
											} else if (Static318.aClass56_196 == Static149.aClass56_102) {
												local216 = Static56.aClass4_Sub9_Sub2_1.method5007();
												if (Static56.aClass4_Sub9_Sub2_1.method5007() == 0) {
													Static92.aClass232Array1[local216] = new Class232();
												} else {
													Static56.aClass4_Sub9_Sub2_1.anInt6207--;
													Static92.aClass232Array1[local216] = new Class232(Static56.aClass4_Sub9_Sub2_1);
												}
												Static149.aClass56_102 = null;
												Static330.anInt5370 = Static79.anInt1568;
												return true;
											} else if (Static149.aClass56_102 == Static276.aClass56_169) {
												local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
												local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
												if (Static182.method2532(local72)) {
													Static457.method6054(-1, -1, 3, local216);
												}
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static115.aClass56_87) {
												local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
												local72 = Static56.aClass4_Sub9_Sub2_1.method5045();
												if (local72 == 65535) {
													local72 = -1;
												}
												local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
												local338 = Static56.aClass4_Sub9_Sub2_1.method4998();
												if (Static182.method2532(local224)) {
													Static215.method4443(local216, local338, local72);
													@Pc(2698) Class80 local2698 = Static416.aClass64_2.method1372(local72);
													Static44.method581(local2698.anInt2021, local2698.anInt2017, local338, local2698.anInt1982);
													Static423.method5700(local2698.anInt1960, local338, local2698.anInt1993, local2698.anInt1994);
												}
												Static149.aClass56_102 = null;
												return true;
											} else if (Static375.aClass56_228 == Static149.aClass56_102) {
												local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
												local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
												Static52.aClass81_1.method1669(local72, local216);
												Static149.aClass56_102 = null;
												return true;
											} else if (Static367.aClass56_225 == Static149.aClass56_102) {
												Static367.method4860(Static313.anInt5082, Static56.aClass4_Sub9_Sub2_1);
												Static149.aClass56_102 = null;
												return true;
											} else if (Static268.aClass56_161 == Static149.aClass56_102) {
												Static276.method3663(Static126.aClass250_9);
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static133.aClass56_93) {
												local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
												local72 = Static56.aClass4_Sub9_Sub2_1.method5056();
												local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
												if (local224 == 65535) {
													local224 = -1;
												}
												if (Static182.method2532(local72)) {
													Static457.method6054(local224, -1, 2, local216);
												}
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static126.aClass56_88) {
												Static356.method4708();
												Static149.aClass56_102 = null;
												return true;
											} else if (Static140.aClass56_94 == Static149.aClass56_102) {
												Static276.method3663(Static208.aClass250_21);
												Static149.aClass56_102 = null;
												return true;
											} else if (Static356.aClass56_215 == Static149.aClass56_102) {
												Static276.method3663(Static390.aClass250_23);
												Static149.aClass56_102 = null;
												return true;
											} else if (Static202.aClass56_125 == Static149.aClass56_102) {
												local216 = Static56.aClass4_Sub9_Sub2_1.method5045();
												local72 = Static56.aClass4_Sub9_Sub2_1.method5012();
												local784 = (local72 & 0x1) == 1;
												Static444.method5919(local784, local216);
												Static163.anIntArray243[Static431.anInt7347++ & 0x1F] = local216;
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static368.aClass56_226) {
												Static294.anInt4824 = Static56.aClass4_Sub9_Sub2_1.method5013();
												Static48.anInt759 = Static56.aClass4_Sub9_Sub2_1.method5007();
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static253.aClass56_150) {
												Static52.aClass81_1.method1663();
												Static307.anInt5014 += 32;
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static105.aClass56_78) {
												Static349.anInt5766 = Static56.aClass4_Sub9_Sub2_1.method5022() << 3;
												Static244.anInt4058 = Static56.aClass4_Sub9_Sub2_1.method5022() << 3;
												Static237.anInt5934 = Static56.aClass4_Sub9_Sub2_1.method5012();
												Static149.aClass56_102 = null;
												return true;
											} else if (Static149.aClass56_102 == Static210.aClass56_127) {
												Static276.method3663(Static65.aClass250_13);
												Static149.aClass56_102 = null;
												return true;
											} else {
												@Pc(2958) Class4_Sub8 local2958;
												if (Static149.aClass56_102 == Static362.aClass56_219) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method4997();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5028();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local338 = Static56.aClass4_Sub9_Sub2_1.method5028();
													if (Static182.method2532(local72)) {
														local2958 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local216);
														if (local2958 != null) {
															Static242.method3223(local2958, local2958.anInt861 != local338, false);
														}
														Static252.method3318(false, local338, local216, local224);
													}
													Static149.aClass56_102 = null;
													return true;
												}
												@Pc(3080) int local3080;
												@Pc(3193) int local3193;
												@Pc(3149) boolean local3149;
												if (Static56.aClass56_43 == Static149.aClass56_102) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5045();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5056();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local338 = Static56.aClass4_Sub9_Sub2_1.method4997();
													local1044 = Static56.aClass4_Sub9_Sub2_1.method5042();
													local804 = (local224 & 0x80) != 0;
													if (local338 >> 30 == 0) {
														@Pc(3249) Class119 local3249;
														@Pc(3176) Class172 local3176;
														@Pc(3241) Class119 local3241;
														@Pc(3223) Class172 local3223;
														@Pc(3190) Class119 local3190;
														if (local338 >> 29 != 0) {
															local963 = local338 & 0xFFFF;
															@Pc(3138) Class8_Sub3_Sub1_Sub2 local3138 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local963];
															if (local3138 != null) {
																if (local72 == 65535) {
																	local72 = -1;
																}
																local3149 = true;
																local856 = local804 ? local3138.anInt7402 : local3138.anInt7387;
																if (local72 != -1 && local856 != -1) {
																	if (local856 == local72) {
																		local3176 = Static452.aClass246_2.method5323(local72);
																		if (local3176.aBoolean302 && local3176.anInt4088 != -1) {
																			local3190 = Static170.aClass125_3.method2389(local3176.anInt4088);
																			local3193 = local3190.anInt3012;
																			if (local3193 == 0 || local3193 == 2) {
																				local3149 = false;
																			} else if (local3193 == 1) {
																				local3149 = true;
																			}
																		}
																	} else {
																		local3176 = Static452.aClass246_2.method5323(local72);
																		local3223 = Static452.aClass246_2.method5323(local856);
																		if (local3176.anInt4088 != -1 && local3223.anInt4088 != -1) {
																			local3241 = Static170.aClass125_3.method2389(local3176.anInt4088);
																			local3249 = Static170.aClass125_3.method2389(local3223.anInt4088);
																			if (local3241.anInt2999 < local3249.anInt2999) {
																				local3149 = false;
																			}
																		}
																	}
																}
																if (local3149) {
																	if (local804) {
																		local3138.anInt7397 = local216;
																		local3138.anInt7392 = local1044 + Static265.anInt4371;
																		local3138.anInt7377 = 0;
																		local3138.anInt7360 = 1;
																		local3138.anInt7384 = 0;
																		local3138.anInt7383 = local224 & 0x7;
																		local3138.anInt7402 = local72;
																		if (Static265.anInt4371 < local3138.anInt7392) {
																			local3138.anInt7384 = -1;
																		}
																		if (local3138.anInt7402 != -1 && local3138.anInt7392 == Static265.anInt4371) {
																			local2446 = Static452.aClass246_2.method5323(local3138.anInt7402).anInt4088;
																			if (local2446 != -1) {
																				local3190 = Static170.aClass125_3.method2389(local2446);
																				if (local3190 != null && local3190.anIntArray244 != null) {
																					Static334.method4419(local3138.anInt7339, local3190, local3138.aByte99, false, 0, local3138.anInt7343);
																				}
																			}
																		}
																	} else {
																		local3138.anInt7386 = 1;
																		local3138.anInt7421 = 0;
																		local3138.anInt7387 = local72;
																		local3138.anInt7380 = local216;
																		local3138.anInt7407 = Static265.anInt4371 + local1044;
																		local3138.anInt7367 = 0;
																		local3138.anInt7401 = local224 & 0x7;
																		if (Static265.anInt4371 < local3138.anInt7407) {
																			local3138.anInt7367 = -1;
																		}
																		if (local3138.anInt7387 != -1 && local3138.anInt7407 == Static265.anInt4371) {
																			local2446 = Static452.aClass246_2.method5323(local3138.anInt7387).anInt4088;
																			if (local2446 != -1) {
																				local3190 = Static170.aClass125_3.method2389(local2446);
																				if (local3190 != null && local3190.anIntArray244 != null) {
																					Static334.method4419(local3138.anInt7339, local3190, local3138.aByte99, false, 0, local3138.anInt7343);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local338 >> 28 != 0) {
															local963 = local338 & 0xFFFF;
															@Pc(3435) Class8_Sub3_Sub1_Sub1 local3435;
															if (Static12.anInt187 == local963) {
																local3435 = Static401.aClass8_Sub3_Sub1_Sub1_2;
															} else {
																local3435 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local963];
															}
															if (local3435 != null) {
																if (local72 == 65535) {
																	local72 = -1;
																}
																local3149 = true;
																local856 = local804 ? local3435.anInt7402 : local3435.anInt7387;
																if (local72 != -1 && local856 != -1) {
																	if (local72 == local856) {
																		local3176 = Static452.aClass246_2.method5323(local72);
																		if (local3176.aBoolean302 && local3176.anInt4088 != -1) {
																			local3190 = Static170.aClass125_3.method2389(local3176.anInt4088);
																			local3193 = local3190.anInt3012;
																			if (local3193 == 0 || local3193 == 2) {
																				local3149 = false;
																			} else if (local3193 == 1) {
																				local3149 = true;
																			}
																		}
																	} else {
																		local3176 = Static452.aClass246_2.method5323(local72);
																		local3223 = Static452.aClass246_2.method5323(local856);
																		if (local3176.anInt4088 != -1 && local3223.anInt4088 != -1) {
																			local3241 = Static170.aClass125_3.method2389(local3176.anInt4088);
																			local3249 = Static170.aClass125_3.method2389(local3223.anInt4088);
																			if (local3249.anInt2999 > local3241.anInt2999) {
																				local3149 = false;
																			}
																		}
																	}
																}
																if (local3149) {
																	if (local804) {
																		local3435.anInt7377 = 0;
																		local3435.anInt7402 = local72;
																		local3435.anInt7384 = 0;
																		local3435.anInt7360 = 1;
																		local3435.anInt7383 = local224 & 0x7;
																		local3435.anInt7397 = local216;
																		local3435.anInt7392 = local1044 + Static265.anInt4371;
																		if (local3435.anInt7392 > Static265.anInt4371) {
																			local3435.anInt7384 = -1;
																		}
																		if (local3435.anInt7402 == 65535) {
																			local3435.anInt7402 = -1;
																		}
																		if (local3435.anInt7402 != -1 && Static265.anInt4371 == local3435.anInt7392) {
																			local2446 = Static452.aClass246_2.method5323(local3435.anInt7402).anInt4088;
																			if (local2446 != -1) {
																				local3190 = Static170.aClass125_3.method2389(local2446);
																				if (local3190 != null && local3190.anIntArray244 != null) {
																					Static334.method4419(local3435.anInt7339, local3190, local3435.aByte99, Static401.aClass8_Sub3_Sub1_Sub1_2 == local3435, 0, local3435.anInt7343);
																				}
																			}
																		}
																	} else {
																		local3435.anInt7421 = 0;
																		local3435.anInt7387 = local72;
																		local3435.anInt7386 = 1;
																		local3435.anInt7407 = Static265.anInt4371 + local1044;
																		local3435.anInt7401 = local224 & 0x7;
																		local3435.anInt7367 = 0;
																		local3435.anInt7380 = local216;
																		if (local3435.anInt7407 > Static265.anInt4371) {
																			local3435.anInt7367 = -1;
																		}
																		if (local3435.anInt7387 == 65535) {
																			local3435.anInt7387 = -1;
																		}
																		if (local3435.anInt7387 != -1 && local3435.anInt7407 == Static265.anInt4371) {
																			local2446 = Static452.aClass246_2.method5323(local3435.anInt7387).anInt4088;
																			if (local2446 != -1) {
																				local3190 = Static170.aClass125_3.method2389(local2446);
																				if (local3190 != null && local3190.anIntArray244 != null) {
																					Static334.method4419(local3435.anInt7339, local3190, local3435.aByte99, local3435 == Static401.aClass8_Sub3_Sub1_Sub1_2, 0, local3435.anInt7343);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local963 = local338 >> 28 & 0x3;
														local1060 = (local338 >> 14 & 0x3FFF) - Static365.anInt6047;
														local846 = (local338 & 0x3FFF) - Static366.anInt6052;
														if (local1060 >= 0 && local846 >= 0 && local1060 < Static337.anInt5497 && local846 < Static282.anInt4644) {
															local856 = local1060 * 128 + 64;
															local2446 = local846 * 128 + 64;
															local3080 = local963;
															if (local963 < 3 && Static215.method4450(local1060, local846)) {
																local3080 = local963 + 1;
															}
															@Pc(3114) Class8_Sub3_Sub4 local3114 = new Class8_Sub3_Sub4(local72, 0, Static265.anInt4371, local963, local3080, local856, Static94.method4425(local2446, local963, local856) - local216, local2446, local1060, local1060, local846, local846, local224);
															Static295.aClass244_25.method5273(new Class4_Sub2_Sub9(local3114));
														}
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static236.aClass56_139) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local338 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local1044 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local1050 = Static56.aClass4_Sub9_Sub2_1.method5028();
													if (Static182.method2532(local216)) {
														Static72.aBooleanArray6[local72] = true;
														Static341.anIntArray446[local72] = local224;
														Static302.anIntArray394[local72] = local338;
														Static251.anIntArray346[local72] = local1044;
														Static63.anIntArray455[local72] = local1050;
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static211.aClass56_128 == Static149.aClass56_102) {
													Static276.method3663(Static138.aClass250_10);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static433.aClass56_258 == Static149.aClass56_102) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5056();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5046();
													Static52.aClass81_1.method1665(local72, local216);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static30.aClass56_28 == Static149.aClass56_102) {
													Static370.method4888(Static56.aClass4_Sub9_Sub2_1.method5038());
													Static149.aClass56_102 = null;
													return true;
												} else if (Static73.aClass56_58 == Static149.aClass56_102) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
													local72 = Static56.aClass4_Sub9_Sub2_1.method4998();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5045();
													if (Static182.method2532(local224)) {
														@Pc(3860) Class4_Sub8 local3860 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local72);
														local2958 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local216);
														if (local2958 != null) {
															Static242.method3223(local2958, local3860 == null || local3860.anInt861 != local2958.anInt861, false);
														}
														if (local3860 != null) {
															local3860.method6059();
															Static449.aClass67_37.method1426(local3860, (long) local216);
														}
														@Pc(3900) Class110 local3900 = Static235.method3185(local72);
														if (local3900 != null) {
															Static118.method1693(local3900);
														}
														local3900 = Static235.method3185(local216);
														if (local3900 != null) {
															Static118.method1693(local3900);
															Static453.method6005(local3900, true);
														}
														if (Static182.anInt3346 != -1) {
															Static199.method2849(Static182.anInt3346, 1);
														}
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static11.aClass56_11) {
													Static360.method4757(true);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static39.aClass56_31) {
													Static66.anInt1316 = Static56.aClass4_Sub9_Sub2_1.method5007();
													for (local216 = 0; local216 < Static66.anInt1316; local216++) {
														Static93.aStringArray14[local216] = Static56.aClass4_Sub9_Sub2_1.method5038();
														Static406.aStringArray42[local216] = Static56.aClass4_Sub9_Sub2_1.method5038();
														if (Static406.aStringArray42[local216].equals("")) {
															Static406.aStringArray42[local216] = Static93.aStringArray14[local216];
														}
														Static441.aStringArray46[local216] = Static56.aClass4_Sub9_Sub2_1.method5038();
														Static178.aStringArray28[local216] = Static56.aClass4_Sub9_Sub2_1.method5038();
														if (Static178.aStringArray28[local216].equals("")) {
															Static178.aStringArray28[local216] = Static441.aStringArray46[local216];
														}
														Static29.aBooleanArray3[local216] = false;
													}
													Static149.aClass56_102 = null;
													Static357.anInt5911 = Static79.anInt1568;
													return true;
												} else if (Static149.aClass56_102 == Static256.aClass56_153) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5045();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5056();
													if (Static182.method2532(local216)) {
														Static418.method5664(local72, local224);
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static55.aClass56_40) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
													if (local216 == 65535) {
														local216 = -1;
													}
													local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
													local338 = Static56.aClass4_Sub9_Sub2_1.method5007();
													Static380.method4989(local216, local72, local224, local338);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static22.aClass56_21) {
													local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
													local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
													local1745 = local258;
													if (local1957) {
														local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
													}
													local2194 = Static56.aClass4_Sub9_Sub2_1.method5028();
													local2199 = Static56.aClass4_Sub9_Sub2_1.method5008();
													local1060 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local846 = Static56.aClass4_Sub9_Sub2_1.method5028();
													@Pc(4137) long local4137 = local2199 + (local2194 << 32);
													@Pc(4139) boolean local4139 = false;
													local3193 = 0;
													while (true) {
														if (local3193 >= 100) {
															if (local1060 <= 1 && Static231.method3150(local1745)) {
																local4139 = true;
															}
															break;
														}
														if (Static170.aLongArray10[local3193] == local4137) {
															local4139 = true;
															break;
														}
														local3193++;
													}
													if (!local4139 && Static347.anInt5749 == 0) {
														Static170.aLongArray10[Static276.anInt4602] = local4137;
														Static276.anInt4602 = (Static276.anInt4602 + 1) % 100;
														@Pc(4201) String local4201 = Static350.aClass66_1.method1411(local846).method5542(Static56.aClass4_Sub9_Sub2_1);
														if (local1060 == 2) {
															Static46.method610(null, "<img=1>" + local258, "<img=1>" + local1745, local846, local4201, 0, 18);
														} else if (local1060 == 1) {
															Static46.method610(null, "<img=0>" + local258, "<img=0>" + local1745, local846, local4201, 0, 18);
														} else {
															Static46.method610(null, local258, local1745, local846, local4201, 0, 18);
														}
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static371.aClass56_218 == Static149.aClass56_102) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5045();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5045();
													@Pc(4285) Class8_Sub3_Sub1_Sub2 local4285 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local216];
													if (local4285 != null) {
														Static109.method5014(local224, local72, local4285);
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static147.aClass56_99) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5049();
													local224 = Static56.aClass4_Sub9_Sub2_1.method5045();
													local338 = Static56.aClass4_Sub9_Sub2_1.method5037();
													if (Static182.method2532(local224)) {
														Static372.method4896(local338, local72, local216);
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static281.aClass56_172) {
													local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
													@Pc(4347) byte[] local4347 = new byte[Static313.anInt5082 - 1];
													Static56.aClass4_Sub9_Sub2_1.method5005(local4347, Static313.anInt5082 - 1);
													Static149.method2108(local1957, local4347);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static209.aClass56_126 == Static149.aClass56_102) {
													Static33.method450(Static261.aBoolean316);
													Static149.aClass56_102 = null;
													return false;
												} else if (Static149.aClass56_102 == Static285.aClass56_175) {
													local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
													if (Static182.method2532(local216)) {
														Static425.method5718();
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static454.aClass56_270 == Static149.aClass56_102) {
													Static276.method3663(Static377.aClass250_14);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static455.aClass56_271) {
													Static276.method3663(Static265.aClass250_15);
													Static149.aClass56_102 = null;
													return true;
												} else if (Static180.aClass56_116 == Static149.aClass56_102) {
													Static385.anInt6297 = Static56.aClass4_Sub9_Sub2_1.method5028() * 30;
													Static149.aClass56_102 = null;
													Static161.anInt2989 = Static79.anInt1568;
													return true;
												} else if (Static327.aClass56_200 == Static149.aClass56_102) {
													Static237.anInt5934 = Static56.aClass4_Sub9_Sub2_1.method5012();
													Static349.anInt5766 = Static56.aClass4_Sub9_Sub2_1.method5022() << 3;
													Static244.anInt4058 = Static56.aClass4_Sub9_Sub2_1.method5063() << 3;
													while (Static313.anInt5082 > Static56.aClass4_Sub9_Sub2_1.anInt6207) {
														@Pc(4453) Class250 local4453 = Static78.method1268()[Static56.aClass4_Sub9_Sub2_1.method5007()];
														Static276.method3663(local4453);
													}
													Static149.aClass56_102 = null;
													return true;
												} else if (Static149.aClass56_102 == Static437.aClass56_260) {
													local683 = Static56.aClass4_Sub9_Sub2_1.method5026();
													local72 = Static56.aClass4_Sub9_Sub2_1.method5056();
													Static52.aClass81_1.method1669(local72, local683);
													Static149.aClass56_102 = null;
													return true;
												} else {
													@Pc(4539) long local4539;
													@Pc(4557) Class4_Sub20 local4557;
													@Pc(4545) Class4_Sub20 local4545;
													if (Static165.aClass56_109 == Static149.aClass56_102) {
														local216 = Static56.aClass4_Sub9_Sub2_1.method5016();
														local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
														local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
														if (local224 == 65535) {
															local224 = -1;
														}
														local338 = Static56.aClass4_Sub9_Sub2_1.method4997();
														local1044 = Static56.aClass4_Sub9_Sub2_1.method5045();
														if (local1044 == 65535) {
															local1044 = -1;
														}
														if (Static182.method2532(local72)) {
															for (local1050 = local224; local1050 <= local1044; local1050++) {
																local4539 = (long) local1050 + ((long) local338 << 32);
																local4545 = (Class4_Sub20) Static159.aClass67_18.method1429(local4539);
																if (local4545 != null) {
																	local4557 = new Class4_Sub20(local216, local4545.anInt3510);
																	local4545.method6059();
																} else if (local1050 == -1) {
																	local4557 = new Class4_Sub20(local216, Static235.method3185(local338).aClass4_Sub20_2.anInt3510);
																} else {
																	local4557 = new Class4_Sub20(local216, -1);
																}
																Static159.aClass67_18.method1426(local4557, local4539);
															}
														}
														Static149.aClass56_102 = null;
														return true;
													} else if (Static260.aClass56_274 == Static149.aClass56_102) {
														local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
														local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
														local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
														local338 = Static56.aClass4_Sub9_Sub2_1.method5028() << 0;
														local1044 = Static56.aClass4_Sub9_Sub2_1.method5007();
														local1050 = Static56.aClass4_Sub9_Sub2_1.method5007();
														if (Static182.method2532(local216)) {
															Static304.method3974(local72, local1044, local1050, local224, local338, true);
														}
														Static149.aClass56_102 = null;
														return true;
													} else {
														@Pc(4819) boolean local4819;
														if (Static338.aClass56_207 == Static149.aClass56_102) {
															Static450.anInt7529 = Static79.anInt1568;
															if (Static313.anInt5082 == 0) {
																Static149.aClass56_102 = null;
																Static404.aClass130Array1 = null;
																Static83.aString57 = null;
																Static87.anInt1666 = 0;
																Static272.aString37 = null;
																return true;
															}
															Static83.aString57 = Static56.aClass4_Sub9_Sub2_1.method5038();
															local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
															if (local1957) {
																Static56.aClass4_Sub9_Sub2_1.method5038();
															}
															@Pc(4688) long local4688 = Static56.aClass4_Sub9_Sub2_1.method5024();
															Static272.aString37 = Static272.method3613(local4688);
															Static403.aByte94 = Static56.aClass4_Sub9_Sub2_1.method5063();
															local338 = Static56.aClass4_Sub9_Sub2_1.method5007();
															if (local338 == 255) {
																Static149.aClass56_102 = null;
																return true;
															}
															Static87.anInt1666 = local338;
															@Pc(4714) Class130[] local4714 = new Class130[100];
															for (local1050 = 0; local1050 < Static87.anInt1666; local1050++) {
																local4714[local1050] = new Class130();
																local4714[local1050].aString27 = Static56.aClass4_Sub9_Sub2_1.method5038();
																local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
																if (local1957) {
																	local4714[local1050].aString28 = Static56.aClass4_Sub9_Sub2_1.method5038();
																} else {
																	local4714[local1050].aString28 = local4714[local1050].aString27;
																}
																local4714[local1050].aString29 = Static112.method1664(local4714[local1050].aString28);
																local4714[local1050].anInt3233 = Static56.aClass4_Sub9_Sub2_1.method5028();
																local4714[local1050].aByte67 = Static56.aClass4_Sub9_Sub2_1.method5063();
																local4714[local1050].aString30 = Static56.aClass4_Sub9_Sub2_1.method5038();
																if (local4714[local1050].aString28.equals(Static401.aClass8_Sub3_Sub1_Sub1_2.aString60)) {
																	Static101.aByte32 = local4714[local1050].aByte67;
																}
															}
															local846 = Static87.anInt1666;
															while (local846 > 0) {
																local4819 = true;
																local846--;
																for (local856 = 0; local856 < local846; local856++) {
																	if (local4714[local856].aString29.compareTo(local4714[local856 + 1].aString29) > 0) {
																		local821 = local4714[local856];
																		local4714[local856] = local4714[local856 + 1];
																		local4714[local856 + 1] = local821;
																		local4819 = false;
																	}
																}
																if (local4819) {
																	break;
																}
															}
															Static149.aClass56_102 = null;
															Static404.aClass130Array1 = local4714;
															return true;
														} else if (Static149.aClass56_102 == Static55.aClass56_41) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5042();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5046();
															if (Static182.method2532(local216)) {
																Static220.anInt3780 = local72;
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static387.aClass56_233 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															if (local216 == 65535) {
																local216 = -1;
															}
															local72 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5036();
															if (Static182.method2532(local72)) {
																Static457.method6054(local216, -1, 1, local224);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static234.aClass56_138 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5036();
															local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
															if (Static182.method2532(local216)) {
																Static322.method4262(local1745, local72);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static448.aClass56_264) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5045();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local338 = Static56.aClass4_Sub9_Sub2_1.method4997();
															local1044 = Static56.aClass4_Sub9_Sub2_1.method5028();
															if (Static182.method2532(local224)) {
																Static44.method581(local216, local72, local338, local1044);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static243.aClass56_142) {
															Static276.method3663(Static420.aClass250_22);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static79.aClass56_61) {
															local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
															local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
															local1745 = local258;
															if (local1957) {
																local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
															}
															local338 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local1044 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local804 = false;
															if (local338 <= 1 && Static231.method3150(local1745)) {
																local804 = true;
															}
															if (!local804 && Static347.anInt5749 == 0) {
																local817 = Static350.aClass66_1.method1411(local1044).method5542(Static56.aClass4_Sub9_Sub2_1);
																if (local338 == 2) {
																	Static46.method610(null, "<img=1>" + local258, "<img=1>" + local1745, local1044, local817, 0, 25);
																} else if (local338 == 1) {
																	Static46.method610(null, "<img=0>" + local258, "<img=0>" + local1745, local1044, local817, 0, 25);
																} else {
																	Static46.method610(null, local258, local1745, local1044, local817, 0, 25);
																}
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static114.aClass56_86) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local784 = (local72 & 0x1) == 1;
															Static332.method4388(local216, local784);
															local338 = Static56.aClass4_Sub9_Sub2_1.method5028();
															for (local1044 = 0; local1044 < local338; local1044++) {
																local1050 = Static56.aClass4_Sub9_Sub2_1.method5056();
																local963 = Static56.aClass4_Sub9_Sub2_1.method5046();
																if (local963 == 255) {
																	local963 = Static56.aClass4_Sub9_Sub2_1.method5016();
																}
																Static8.method100(local216, local1050 - 1, local784, local963, local1044);
															}
															Static163.anIntArray243[Static431.anInt7347++ & 0x1F] = local216;
															Static149.aClass56_102 = null;
															return true;
														} else if (Static255.aClass56_152 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local784 = (local72 & 0x1) == 1;
															while (Static313.anInt5082 > Static56.aClass4_Sub9_Sub2_1.anInt6207) {
																local338 = Static56.aClass4_Sub9_Sub2_1.method5033();
																local1044 = Static56.aClass4_Sub9_Sub2_1.method5028();
																local1050 = 0;
																if (local1044 != 0) {
																	local1050 = Static56.aClass4_Sub9_Sub2_1.method5007();
																	if (local1050 == 255) {
																		local1050 = Static56.aClass4_Sub9_Sub2_1.method4997();
																	}
																}
																Static8.method100(local216, local1044 - 1, local784, local1050, local338);
															}
															Static163.anIntArray243[Static431.anInt7347++ & 0x1F] = local216;
															Static149.aClass56_102 = null;
															return true;
														} else if (Static151.aClass56_103 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5036();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5028();
															Static52.aClass81_1.method1665(local216, local72);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static100.aClass56_74 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5042();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5036();
															if (Static182.method2532(local216)) {
																Static4.method72(local72, local224);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static1.aClass56_1) {
															while (Static313.anInt5082 > Static56.aClass4_Sub9_Sub2_1.anInt6207) {
																local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
																local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
																local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
																local338 = Static56.aClass4_Sub9_Sub2_1.method5028();
																local1044 = Static56.aClass4_Sub9_Sub2_1.method5007();
																local1634 = "";
																local4819 = false;
																if (local338 > 0) {
																	local1634 = Static56.aClass4_Sub9_Sub2_1.method5038();
																	local4819 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
																}
																for (local1060 = 0; local1060 < Static284.anInt4659; local1060++) {
																	if (local1957) {
																		if (local1745.equals(Static322.aStringArray36[local1060])) {
																			Static322.aStringArray36[local1060] = local258;
																			local258 = null;
																			Static161.aStringArray27[local1060] = local1745;
																			break;
																		}
																	} else if (local258.equals(Static322.aStringArray36[local1060])) {
																		if (Static63.anIntArray454[local1060] != local338) {
																			Static63.anIntArray454[local1060] = local338;
																			if (local338 > 0) {
																				Static290.method3782("", local258 + Static255.aClass15_73.method180(Static429.anInt6999), 0, "", 5);
																			}
																			if (local338 == 0) {
																				Static290.method3782("", local258 + Static9.aClass15_85.method180(Static429.anInt6999), 0, "", 5);
																			}
																		}
																		Static161.aStringArray27[local1060] = local1745;
																		Static114.aStringArray21[local1060] = local1634;
																		Static135.anIntArray205[local1060] = local1044;
																		Static314.aBooleanArray24[local1060] = local4819;
																		local258 = null;
																		break;
																	}
																}
																if (local258 != null && Static284.anInt4659 < 200) {
																	Static322.aStringArray36[Static284.anInt4659] = local258;
																	Static161.aStringArray27[Static284.anInt4659] = local1745;
																	Static63.anIntArray454[Static284.anInt4659] = local338;
																	Static114.aStringArray21[Static284.anInt4659] = local1634;
																	Static135.anIntArray205[Static284.anInt4659] = local1044;
																	Static314.aBooleanArray24[Static284.anInt4659] = local4819;
																	Static284.anInt4659++;
																}
															}
															Static423.anInt7106 = 2;
															Static357.anInt5911 = Static79.anInt1568;
															local72 = Static284.anInt4659;
															while (local72 > 0) {
																local1957 = true;
																local72--;
																for (local224 = 0; local224 < local72; local224++) {
																	if (Static338.aClass220_5.anInt5746 != Static63.anIntArray454[local224] && Static338.aClass220_5.anInt5746 == Static63.anIntArray454[local224 + 1] || Static63.anIntArray454[local224] == 0 && Static63.anIntArray454[local224 + 1] != 0) {
																		local338 = Static63.anIntArray454[local224];
																		Static63.anIntArray454[local224] = Static63.anIntArray454[local224 + 1];
																		Static63.anIntArray454[local224 + 1] = local338;
																		local1607 = Static114.aStringArray21[local224];
																		Static114.aStringArray21[local224] = Static114.aStringArray21[local224 + 1];
																		Static114.aStringArray21[local224 + 1] = local1607;
																		local1634 = Static322.aStringArray36[local224];
																		Static322.aStringArray36[local224] = Static322.aStringArray36[local224 + 1];
																		Static322.aStringArray36[local224 + 1] = local1634;
																		local817 = Static161.aStringArray27[local224];
																		Static161.aStringArray27[local224] = Static161.aStringArray27[local224 + 1];
																		Static161.aStringArray27[local224 + 1] = local817;
																		local1060 = Static135.anIntArray205[local224];
																		Static135.anIntArray205[local224] = Static135.anIntArray205[local224 + 1];
																		Static135.anIntArray205[local224 + 1] = local1060;
																		local3149 = Static314.aBooleanArray24[local224];
																		Static314.aBooleanArray24[local224] = Static314.aBooleanArray24[local224 + 1];
																		local1957 = false;
																		Static314.aBooleanArray24[local224 + 1] = local3149;
																	}
																}
																if (local1957) {
																	break;
																}
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static330.aClass56_203 == Static149.aClass56_102) {
															Static276.method3663(Static276.aClass250_16);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static244.aClass56_143) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local338 = Static56.aClass4_Sub9_Sub2_1.method5028() << 0;
															local1044 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local1050 = Static56.aClass4_Sub9_Sub2_1.method5007();
															if (Static182.method2532(local216)) {
																Static406.method5514(local1050, local338, local72, local1044, local224);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static280.aClass56_171 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5016();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5056();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5056();
															local338 = Static56.aClass4_Sub9_Sub2_1.method5028();
															if (Static182.method2532(local338)) {
																Static347.method4603((local72 << 16) + local224, local216);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static295.aClass56_184 == Static149.aClass56_102) {
															if (Static276.aFrame5 != null) {
																Static265.method3497(false, -1, -1, Static413.aClass49_Sub1_1.anInt3207);
															}
															@Pc(5821) byte[] local5821 = new byte[Static313.anInt5082];
															Static56.aClass4_Sub9_Sub2_1.method5077(local5821, Static313.anInt5082);
															local258 = Static383.method5080(Static313.anInt5082, 0, local5821);
															Static434.method5768(Static24.aClass196_1, Static341.anInt5549 == 1, true, local258);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static288.aClass56_181 == Static149.aClass56_102) {
															Static52.method688(Static313.anInt5082, Static24.aClass196_1, Static56.aClass4_Sub9_Sub2_1);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static440.aClass56_262 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5045();
															local72 = Static56.aClass4_Sub9_Sub2_1.method4998();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5042();
															local338 = Static56.aClass4_Sub9_Sub2_1.method5036();
															if (Static182.method2532(local216)) {
																Static457.method6054(local224, local338, 5, local72);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static362.aClass56_220) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local72 = Static56.aClass4_Sub9_Sub2_1.method4997();
															if (Static182.method2532(local216)) {
																@Pc(5921) Class4_Sub8 local5921 = (Class4_Sub8) Static449.aClass67_37.method1429((long) local72);
																if (local5921 != null) {
																	Static242.method3223(local5921, true, false);
																}
																if (Static246.aClass110_11 != null) {
																	Static118.method1693(Static246.aClass110_11);
																	Static246.aClass110_11 = null;
																}
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static85.aClass56_64) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method4998();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5046();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5012();
															Static184.anIntArray258[local224] = local216;
															Static209.anIntArray273[local224] = local72;
															Static314.anIntArray410[local224] = 1;
															local338 = Static270.anIntArray368[local224] - 1;
															for (local1044 = 0; local1044 < local338; local1044++) {
																if (Class4_Sub4_Sub3.anIntArray54[local1044] <= local216) {
																	Static314.anIntArray410[local224] = local1044 + 2;
																}
															}
															Static74.anIntArray112[Static406.anInt6844++ & 0x1F] = local224;
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static268.aClass56_162) {
															Static276.method3663(Static357.aClass250_18);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static112.aClass56_85) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5028();
															if (local216 == 65535) {
																local216 = -1;
															}
															local72 = Static56.aClass4_Sub9_Sub2_1.method5007();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local338 = Static56.aClass4_Sub9_Sub2_1.method5007();
															Static341.method4516(local224, local72, local216, local338);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static431.aClass56_263 == Static149.aClass56_102) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method4997();
															Static404.aClass45_8 = Static24.aClass196_1.method3905(local216);
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static359.aClass56_216) {
															if (Static182.anInt3346 != -1) {
																Static199.method2849(Static182.anInt3346, 0);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static274.aClass56_167) {
															local1957 = Static56.aClass4_Sub9_Sub2_1.method5007() == 1;
															local258 = Static56.aClass4_Sub9_Sub2_1.method5038();
															local1745 = local258;
															if (local1957) {
																local1745 = Static56.aClass4_Sub9_Sub2_1.method5038();
															}
															local2194 = Static56.aClass4_Sub9_Sub2_1.method5028();
															local2199 = Static56.aClass4_Sub9_Sub2_1.method5008();
															local1060 = Static56.aClass4_Sub9_Sub2_1.method5007();
															@Pc(6130) long local6130 = local2199 + (local2194 << 32);
															@Pc(6132) boolean local6132 = false;
															local3080 = 0;
															while (true) {
																if (local3080 >= 100) {
																	if (local1060 <= 1) {
																		if (Static412.aBoolean491 && !Static119.aBoolean403 || Static339.aBoolean389) {
																			local6132 = true;
																		} else if (Static231.method3150(local1745)) {
																			local6132 = true;
																		}
																	}
																	break;
																}
																if (Static170.aLongArray10[local3080] == local6130) {
																	local6132 = true;
																	break;
																}
																local3080++;
															}
															if (!local6132 && Static347.anInt5749 == 0) {
																Static170.aLongArray10[Static276.anInt4602] = local6130;
																Static276.anInt4602 = (Static276.anInt4602 + 1) % 100;
																@Pc(6199) String local6199 = Static265.method3496(Static334.method4420(Static56.aClass4_Sub9_Sub2_1));
																if (local1060 == 2) {
																	Static46.method610(null, "<img=1>" + local258, "<img=1>" + local1745, -1, local6199, 0, 7);
																} else if (local1060 == 1) {
																	Static46.method610(null, "<img=0>" + local258, "<img=0>" + local1745, -1, local6199, 0, 7);
																} else {
																	Static46.method610(null, local258, local1745, -1, local6199, 0, 3);
																}
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static96.aClass56_71) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5056();
															local72 = Static56.aClass4_Sub9_Sub2_1.method5045();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5028();
															if (local224 == 65535) {
																local224 = -1;
															}
															local338 = Static56.aClass4_Sub9_Sub2_1.method5042();
															if (local338 == 65535) {
																local338 = -1;
															}
															local1044 = Static56.aClass4_Sub9_Sub2_1.method5036();
															if (Static182.method2532(local72)) {
																for (local1050 = local224; local1050 <= local338; local1050++) {
																	local4539 = ((long) local1044 << 32) + (long) local1050;
																	local4545 = (Class4_Sub20) Static159.aClass67_18.method1429(local4539);
																	if (local4545 != null) {
																		local4557 = new Class4_Sub20(local4545.anInt3514, local216);
																		local4545.method6059();
																	} else if (local1050 == -1) {
																		local4557 = new Class4_Sub20(Static235.method3185(local1044).aClass4_Sub20_2.anInt3514, local216);
																	} else {
																		local4557 = new Class4_Sub20(0, local216);
																	}
																	Static159.aClass67_18.method1426(local4557, local4539);
																}
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static285.aClass56_176) {
															Static387.anInt6335 = Static56.aClass4_Sub9_Sub2_1.method5007();
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static408.aClass56_244) {
															local216 = Static56.aClass4_Sub9_Sub2_1.method5042();
															local72 = Static56.aClass4_Sub9_Sub2_1.method4997();
															local224 = Static56.aClass4_Sub9_Sub2_1.method5045();
															if (Static182.method2532(local224)) {
																Static268.method3534(local72, local216);
															}
															Static149.aClass56_102 = null;
															return true;
														} else if (Static149.aClass56_102 == Static157.aClass56_106) {
															Static216.aClass21_2 = Static253.method3327(Static56.aClass4_Sub9_Sub2_1.method5007());
															Static149.aClass56_102 = null;
															return true;
														} else {
															Static33.method448(null, "T1 - " + (Static149.aClass56_102 == null ? -1 : Static149.aClass56_102.method1248()) + "," + (Static7.aClass56_7 == null ? -1 : Static7.aClass56_7.method1248()) + "," + (Static451.aClass56_267 == null ? -1 : Static451.aClass56_267.method1248()) + " - " + Static313.anInt5082);
															Static33.method450(false);
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
}
