import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "F")
	public static float aFloat10;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_68 = new Class48(24, 7);

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
	public static final int[] anIntArray257 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!o;")
	public static final Class169 aClass169_99 = new Class169(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Z")
	public static boolean method1650() throws IOException {
		if (Static6.aClass130_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static6.aClass130_1.method2675();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static186.aClass211_85 == null) {
			if (Class25_Sub1_Sub1.lb) {
				Static6.aClass130_1.method2666(1, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
				local13--;
				Static215.anInt3681++;
				Class25_Sub1_Sub1.lb = false;
			}
			Static139.aClass1_Sub33_Sub2_1.lb = 0;
			if (Static139.aClass1_Sub33_Sub2_1.method5196()) {
				if (local13 == 0) {
					return false;
				}
				local13--;
				Static6.aClass130_1.method2666(1, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 1);
				Static215.anInt3681++;
			}
			Class25_Sub1_Sub1.lb = true;
			@Pc(66) Class211[] local66 = Static129.method1894();
			local70 = Static139.aClass1_Sub33_Sub2_1.method5190();
			if (local70 < 0 || local70 >= local66.length) {
				throw new IOException("invo:" + local70);
			}
			Static186.aClass211_85 = local66[local70];
			Static121.anInt2167 = Static186.aClass211_85.anInt5432;
		}
		if (Static121.anInt2167 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static6.aClass130_1.method2666(1, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
			local13--;
			Static121.anInt2167 = Static139.aClass1_Sub33_Sub2_1.aByteArray86[0] & 0xFF;
			Static215.anInt3681++;
		}
		if (Static121.anInt2167 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static6.aClass130_1.method2666(2, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
			Static139.aClass1_Sub33_Sub2_1.lb = 0;
			Static121.anInt2167 = Static139.aClass1_Sub33_Sub2_1.method5177();
			local13 -= 2;
			Static215.anInt3681 += 2;
		}
		if (local13 < Static121.anInt2167) {
			return false;
		}
		Static139.aClass1_Sub33_Sub2_1.lb = 0;
		Static6.aClass130_1.method2666(Static121.anInt2167, Static139.aClass1_Sub33_Sub2_1.aByteArray86, 0);
		Static140.anInt6076 = 0;
		Static215.anInt3681 += Static121.anInt2167;
		Static144.aClass211_67 = Static71.aClass211_28;
		Static71.aClass211_28 = Static342.aClass211_149;
		Static342.aClass211_149 = Static186.aClass211_85;
		@Pc(203) int local203;
		@Pc(193) int local193;
		if (Static186.aClass211_85 == Static345.aClass211_151) {
			local193 = Static139.aClass1_Sub33_Sub2_1.method5144();
			local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
			local203 = Static139.aClass1_Sub33_Sub2_1.method5131();
			if (Static214.method2982(local193)) {
				Static281.method4294(local203, local70);
			}
			Static186.aClass211_85 = null;
			return true;
		} else if (Static186.aClass211_85 == Static112.aClass211_46) {
			Static158.method2159(false);
			Static186.aClass211_85 = null;
			return true;
		} else if (Static365.aClass211_153 == Static186.aClass211_85) {
			local193 = Static139.aClass1_Sub33_Sub2_1.method5172();
			local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
			if (local193 == 255) {
				local193 = -1;
				local70 = -1;
			}
			Static51.method839(local70, local193);
			Static186.aClass211_85 = null;
			return true;
		} else {
			@Pc(313) int local313;
			@Pc(327) int local327;
			@Pc(424) int local424;
			@Pc(291) boolean local291;
			@Pc(449) Class149 local449;
			@Pc(428) boolean local428;
			@Pc(431) int local431;
			if (Static31.aClass211_13 == Static186.aClass211_85) {
				Static53.anInt1107 = Static105.anInt1853;
				if (Static121.anInt2167 == 0) {
					Static313.aString59 = null;
					Static98.aString13 = null;
					Static178.aClass149Array1 = null;
					Static186.aClass211_85 = null;
					Static4.anInt54 = 0;
					return true;
				}
				Static313.aString59 = Static139.aClass1_Sub33_Sub2_1.method5128();
				local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
				if (local291) {
					Static139.aClass1_Sub33_Sub2_1.method5128();
				}
				@Pc(301) long local301 = Static139.aClass1_Sub33_Sub2_1.method5178();
				Static98.aString13 = Static73.method1168(local301);
				Static239.aByte56 = Static139.aClass1_Sub33_Sub2_1.method5188();
				local313 = Static139.aClass1_Sub33_Sub2_1.method5174();
				if (local313 == 255) {
					Static186.aClass211_85 = null;
					return true;
				}
				Static4.anInt54 = local313;
				@Pc(325) Class149[] local325 = new Class149[100];
				for (local327 = 0; local327 < Static4.anInt54; local327++) {
					local325[local327] = new Class149();
					local325[local327].aString41 = Static139.aClass1_Sub33_Sub2_1.method5128();
					local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
					if (local291) {
						local325[local327].aString42 = Static139.aClass1_Sub33_Sub2_1.method5128();
					} else {
						local325[local327].aString42 = local325[local327].aString41;
					}
					local325[local327].aString40 = Static125.method1826(local325[local327].aString42);
					local325[local327].anInt3644 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local325[local327].aByte52 = Static139.aClass1_Sub33_Sub2_1.method5188();
					local325[local327].aString43 = Static139.aClass1_Sub33_Sub2_1.method5128();
					if (local325[local327].aString42.equals(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6)) {
						Static139.aByte38 = local325[local327].aByte52;
					}
				}
				local424 = Static4.anInt54;
				while (local424 > 0) {
					local428 = true;
					local424--;
					for (local431 = 0; local431 < local424; local431++) {
						if (local325[local431].aString40.compareTo(local325[local431 + 1].aString40) > 0) {
							local449 = local325[local431];
							local325[local431] = local325[local431 + 1];
							local325[local431 + 1] = local449;
							local428 = false;
						}
					}
					if (local428) {
						break;
					}
				}
				Static178.aClass149Array1 = local325;
				Static186.aClass211_85 = null;
				return true;
			} else if (Static139.aClass211_64 == Static186.aClass211_85) {
				Static6.anInt91 = Static139.aClass1_Sub33_Sub2_1.method5166();
				Static19.anInt317 = Static139.aClass1_Sub33_Sub2_1.method5166();
				Static186.aClass211_85 = null;
				return true;
			} else {
				@Pc(526) int local526;
				if (Static62.aClass211_27 == Static186.aClass211_85) {
					local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local203 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local313 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local526 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local327 = Static139.aClass1_Sub33_Sub2_1.method5174();
					if (Static214.method2982(local193)) {
						Static265.method4064(local70, local313, true, local327, local203, local526);
					}
					Static186.aClass211_85 = null;
					return true;
				} else if (Static342.aClass211_148 == Static186.aClass211_85) {
					local193 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local70 = Static139.aClass1_Sub33_Sub2_1.method5157();
					local203 = Static139.aClass1_Sub33_Sub2_1.method5144();
					if (Static214.method2982(local203)) {
						Static55.method894(local70, local193);
					}
					Static186.aClass211_85 = null;
					return true;
				} else if (Static186.aClass211_85 == Static1.aClass211_2) {
					local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local70 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local203 = Static139.aClass1_Sub33_Sub2_1.method5162();
					@Pc(598) Class25_Sub1_Sub1_Sub2 local598 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local70];
					if (local598 != null) {
						Static357.method5243(local193, local598, local203);
					}
					Static186.aClass211_85 = null;
					return true;
				} else {
					@Pc(651) int local651;
					@Pc(631) String local631;
					@Pc(642) long local642;
					@Pc(629) String local629;
					@Pc(647) long local647;
					if (Static134.aClass211_60 == Static186.aClass211_85) {
						local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
						local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
						local631 = local629;
						if (local291) {
							local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
						}
						local642 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local647 = Static139.aClass1_Sub33_Sub2_1.method5159();
						local651 = Static139.aClass1_Sub33_Sub2_1.method5174();
						@Pc(657) long local657 = local647 + (local642 << 32);
						@Pc(659) boolean local659 = false;
						@Pc(661) int local661 = 0;
						while (true) {
							if (local661 >= 100) {
								if (local651 <= 1) {
									if (Static357.aBoolean558 && !Static201.aBoolean347 || Static54.aBoolean102) {
										local659 = true;
									} else if (Static18.method2855(local631)) {
										local659 = true;
									}
								}
								break;
							}
							if (local657 == Static379.aLongArray8[local661]) {
								local659 = true;
								break;
							}
							local661++;
						}
						if (!local659 && Static203.anInt3552 == 0) {
							Static379.aLongArray8[Static2.anInt12] = local657;
							Static2.anInt12 = (Static2.anInt12 + 1) % 100;
							@Pc(724) String local724 = Static292.method4433(Static250.method3875(Static139.aClass1_Sub33_Sub2_1));
							if (local651 == 2) {
								Static109.method1537(local724, "<img=1>" + local629, 7, "<img=1>" + local631, -1, null, 0);
							} else if (local651 == 1) {
								Static109.method1537(local724, "<img=0>" + local629, 7, "<img=0>" + local631, -1, null, 0);
							} else {
								Static109.method1537(local724, local629, 3, local631, -1, null, 0);
							}
						}
						Static186.aClass211_85 = null;
						return true;
					}
					@Pc(841) int local841;
					@Pc(827) String local827;
					@Pc(831) String local831;
					@Pc(817) String local817;
					if (Static364.aClass211_155 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5174();
						@Pc(809) boolean local809 = (local193 & 0x1) == 1;
						local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
						local817 = Static139.aClass1_Sub33_Sub2_1.method5128();
						if (local817.equals("")) {
							local817 = local631;
						}
						local827 = Static139.aClass1_Sub33_Sub2_1.method5128();
						local831 = Static139.aClass1_Sub33_Sub2_1.method5128();
						if (local831.equals("")) {
							local831 = local827;
						}
						if (local809) {
							for (local841 = 0; local841 < Static56.anInt1157; local841++) {
								if (Static262.aStringArray88[local841].equals(local831)) {
									Static250.aStringArray59[local841] = local631;
									Static262.aStringArray88[local841] = local817;
									Static256.aStringArray60[local841] = local827;
									Static267.aStringArray64[local841] = local831;
									break;
								}
							}
						} else {
							Static250.aStringArray59[Static56.anInt1157] = local631;
							Static262.aStringArray88[Static56.anInt1157] = local817;
							Static256.aStringArray60[Static56.anInt1157] = local827;
							Static267.aStringArray64[Static56.anInt1157] = local831;
							Static300.aBooleanArray27[Static56.anInt1157] = (local193 & 0x2) == 2;
							Static56.anInt1157++;
						}
						Static186.aClass211_85 = null;
						Static329.anInt3952 = Static105.anInt1853;
						return true;
					}
					@Pc(932) boolean local932;
					if (Static370.aClass211_154 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local932 = (local70 & 0x1) == 1;
						Static64.method1033(local932, local193);
						local313 = Static139.aClass1_Sub33_Sub2_1.method5177();
						for (local526 = 0; local526 < local313; local526++) {
							local327 = Static139.aClass1_Sub33_Sub2_1.method5177();
							local841 = Static139.aClass1_Sub33_Sub2_1.method5166();
							if (local841 == 255) {
								local841 = Static139.aClass1_Sub33_Sub2_1.method5157();
							}
							Static223.method3099(local327 - 1, local193, local932, local841, local526);
						}
						Static171.anIntArray365[Static289.anInt5000++ & 0x1F] = local193;
						Static186.aClass211_85 = null;
						return true;
					} else if (Static10.aClass211_4 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local932 = (local70 & 0x1) == 1;
						while (Static121.anInt2167 > Static139.aClass1_Sub33_Sub2_1.lb) {
							local313 = Static139.aClass1_Sub33_Sub2_1.method5181();
							local526 = Static139.aClass1_Sub33_Sub2_1.method5177();
							local327 = 0;
							if (local526 != 0) {
								local327 = Static139.aClass1_Sub33_Sub2_1.method5174();
								if (local327 == 255) {
									local327 = Static139.aClass1_Sub33_Sub2_1.method5150();
								}
							}
							Static223.method3099(local526 - 1, local193, local932, local327, local313);
						}
						Static171.anIntArray365[Static289.anInt5000++ & 0x1F] = local193;
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static159.aClass211_71) {
						Static280.method4287(Static139.aClass1_Sub33_Sub2_1.method5128());
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static274.aClass211_122) {
						Static391.method5547(Static327.aClass113_15);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static140.aClass211_156 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
						if (local193 == 65535) {
							local193 = -1;
						}
						local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local313 = Static139.aClass1_Sub33_Sub2_1.method5174();
						Static256.method3911(local193, local313, local203, local70);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static251.aClass211_112) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5183();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local932 = (local70 & 0x1) == 1;
						Static321.method4705(local932, local193);
						Static171.anIntArray365[Static289.anInt5000++ & 0x1F] = local193;
						Static186.aClass211_85 = null;
						return true;
					} else if (Static254.aClass211_114 == Static186.aClass211_85) {
						Static391.method5547(Static172.aClass113_5);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static218.aClass211_102) {
						Static391.method5547(Static345.aClass113_16);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static187.aClass211_86) {
						Static348.method5100(true);
						Static186.aClass211_85 = null;
						return false;
					} else if (Static278.aClass211_119 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5150();
						Static230.aClass72_3.method1339(local70, local193);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static233.aClass211_103) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local203 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local313 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local526 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local327 = Static139.aClass1_Sub33_Sub2_1.method5174();
						if (Static214.method2982(local193)) {
							Static49.method3049(local313, local70, local203, local526, local327);
						}
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static302.aClass211_131) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
						if (local193 == 65535) {
							local193 = -1;
						}
						local70 = Static139.aClass1_Sub33_Sub2_1.method5162();
						local203 = local70 >> 2;
						local313 = local70 & 0x3;
						local526 = Static140.anIntArray722[local203];
						local327 = Static139.aClass1_Sub33_Sub2_1.method5163();
						local841 = local327 >> 28 & 0x3;
						local651 = local327 >> 14 & 0x3FFF;
						local651 -= Static256.anInt4410;
						local424 = local327 & 0x3FFF;
						local424 -= Static293.anInt5053;
						Static306.method4560(local526, local203, local193, local841, local313, local424, local651);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static123.aClass211_136 == Static186.aClass211_85) {
						Static391.method5547(Static247.aClass113_11);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static232.aClass211_17) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5163();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
						local203 = Static139.aClass1_Sub33_Sub2_1.method5131();
						if (Static214.method2982(local203)) {
							Static66.method1106(local70, local193);
						}
						Static186.aClass211_85 = null;
						return true;
					} else if (Static225.aClass211_101 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5160();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5183();
						local203 = Static139.aClass1_Sub33_Sub2_1.method5144();
						if (local203 == 65535) {
							local203 = -1;
						}
						local313 = Static139.aClass1_Sub33_Sub2_1.method5150();
						if (Static214.method2982(local70)) {
							Static25.method374(local193, local203, local313);
							@Pc(1422) Class88 local1422 = Static263.aClass102_2.method2172(local203);
							Static122.method1791(local193, local1422.anInt2029, local1422.anInt2024, local1422.anInt2017);
							Static122.method1790(local1422.anInt1991, local1422.anInt2015, local193, local1422.anInt1996);
						}
						Static186.aClass211_85 = null;
						return true;
					} else if (Static301.aClass211_128 == Static186.aClass211_85) {
						Static357.anInt6083 = Static139.aClass1_Sub33_Sub2_1.method5172();
						Static121.anInt2166 = Static139.aClass1_Sub33_Sub2_1.method5162();
						Static102.anInt3167 = Static139.aClass1_Sub33_Sub2_1.method5166();
						for (@Pc(1466) Class1_Sub12 local1466 = (Class1_Sub12) Static338.aClass77_34.method1359(); local1466 != null; local1466 = (Class1_Sub12) Static338.aClass77_34.method1360()) {
							local70 = (int) (local1466.aLong207 & 0x3FFFL);
							local203 = (int) (local1466.aLong207 >> 14 & 0x3FFFL);
							local313 = (int) (local1466.aLong207 >> 28 & 0x3L);
							if (Static121.anInt2166 == local313 && Static357.anInt6083 <= local70 && Static357.anInt6083 + 8 > local70 && local203 >= Static102.anInt3167 && local203 < Static102.anInt3167 + 8) {
								local1466.method5577();
								Static80.method1208(Static121.anInt2166, local70, local203);
							}
						}
						for (@Pc(1547) Class1_Sub14 local1547 = (Class1_Sub14) Static271.aClass17_53.method202(); local1547 != null; local1547 = (Class1_Sub14) Static271.aClass17_53.method207()) {
							if (local1547.anInt1831 >= Static357.anInt6083 && Static357.anInt6083 + 8 > local1547.anInt1831 && Static102.anInt3167 <= local1547.anInt1823 && local1547.anInt1823 < Static102.anInt3167 + 8 && local1547.anInt1833 == Static121.anInt2166) {
								local1547.anInt1829 = 0;
							}
						}
						Static186.aClass211_85 = null;
						return true;
					} else if (Static369.aClass211_75 == Static186.aClass211_85) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5131();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
						if (local70 == 65535) {
							local70 = -1;
						}
						local203 = Static139.aClass1_Sub33_Sub2_1.method5157();
						if (Static214.method2982(local193)) {
							Static213.method2977(-1, local203, 1, local70);
						}
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static135.aClass211_63) {
						Static114.anInt1989 = Static139.aClass1_Sub33_Sub2_1.method5174();
						Static71.anInt1429 = Static105.anInt1853;
						Static186.aClass211_85 = null;
						return true;
					} else if (Static186.aClass211_85 == Static381.aClass211_157) {
						local193 = Static139.aClass1_Sub33_Sub2_1.method5162();
						local70 = Static139.aClass1_Sub33_Sub2_1.method5131();
						Static230.aClass72_3.method1337(local193, local70);
						Static186.aClass211_85 = null;
						return true;
					} else if (Static24.aClass211_7 == Static186.aClass211_85) {
						Static391.method5547(Static374.aClass113_18);
						Static186.aClass211_85 = null;
						return true;
					} else {
						@Pc(1702) Class1_Sub38 local1702;
						if (Static186.aClass211_85 == Static182.aClass211_81) {
							local193 = Static139.aClass1_Sub33_Sub2_1.method5144();
							local70 = Static139.aClass1_Sub33_Sub2_1.method5160();
							local203 = Static139.aClass1_Sub33_Sub2_1.method5162();
							local313 = Static139.aClass1_Sub33_Sub2_1.method5183();
							if (Static214.method2982(local313)) {
								local1702 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local70);
								if (local1702 != null) {
									Static229.method3190(false, local1702, local193 != local1702.anInt5050);
								}
								Static134.method1981(local70, local193, local203, false);
							}
							Static186.aClass211_85 = null;
							return true;
						} else if (Static186.aClass211_85 == Static325.aClass211_142) {
							local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
							if (local193 == 65535) {
								local193 = -1;
							}
							local70 = Static139.aClass1_Sub33_Sub2_1.method5150();
							local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
							if (Static214.method2982(local203)) {
								Static213.method2977(-1, local70, 2, local193);
							}
							Static186.aClass211_85 = null;
							return true;
						} else if (Static186.aClass211_85 == Static104.aClass211_42) {
							local193 = Static139.aClass1_Sub33_Sub2_1.method5174();
							if (Static139.aClass1_Sub33_Sub2_1.method5174() == 0) {
								Static303.aClass76Array1[local193] = new Class76();
							} else {
								Static139.aClass1_Sub33_Sub2_1.lb--;
								Static303.aClass76Array1[local193] = new Class76(Static139.aClass1_Sub33_Sub2_1);
							}
							Static19.anInt319 = Static105.anInt1853;
							Static186.aClass211_85 = null;
							return true;
						} else if (Static393.aClass211_164 == Static186.aClass211_85) {
							local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
							if (Static214.method2982(local193)) {
								Static238.method3299();
							}
							Static186.aClass211_85 = null;
							return true;
						} else {
							@Pc(1891) Class1_Sub22 local1891;
							@Pc(1880) Class1_Sub22 local1880;
							@Pc(1874) long local1874;
							if (Static266.aClass211_117 == Static186.aClass211_85) {
								local193 = Static139.aClass1_Sub33_Sub2_1.method5183();
								local70 = Static139.aClass1_Sub33_Sub2_1.method5183();
								if (local70 == 65535) {
									local70 = -1;
								}
								local203 = Static139.aClass1_Sub33_Sub2_1.method5183();
								local313 = Static139.aClass1_Sub33_Sub2_1.method5150();
								local526 = Static139.aClass1_Sub33_Sub2_1.method5177();
								if (local526 == 65535) {
									local526 = -1;
								}
								if (Static214.method2982(local203)) {
									for (local327 = local526; local327 <= local70; local327++) {
										local1874 = (long) local327 + ((long) local313 << 32);
										local1880 = (Class1_Sub22) Static54.aClass77_5.method1368(local1874);
										if (local1880 != null) {
											local1891 = new Class1_Sub22(local1880.anInt3451, local193);
											local1880.method5577();
										} else if (local327 == -1) {
											local1891 = new Class1_Sub22(Static13.method107(local313).aClass1_Sub22_2.anInt3451, local193);
										} else {
											local1891 = new Class1_Sub22(0, local193);
										}
										Static54.aClass77_5.method1370(local1874, local1891);
									}
								}
								Static186.aClass211_85 = null;
								return true;
							} else if (Static332.aClass211_145 == Static186.aClass211_85) {
								local193 = Static139.aClass1_Sub33_Sub2_1.method5181();
								local70 = Static139.aClass1_Sub33_Sub2_1.method5150();
								local203 = Static139.aClass1_Sub33_Sub2_1.method5174();
								local817 = "";
								local827 = local817;
								if ((local203 & 0x1) != 0) {
									local817 = Static139.aClass1_Sub33_Sub2_1.method5128();
									if ((local203 & 0x2) == 0) {
										local827 = local817;
									} else {
										local827 = Static139.aClass1_Sub33_Sub2_1.method5128();
									}
								}
								local831 = Static139.aClass1_Sub33_Sub2_1.method5128();
								if (local193 == 99) {
									Static192.method2752(local831);
								} else if (local827.equals("") || !Static18.method2855(local827)) {
									Static101.method1458(local827, local193, local70, local817, local831);
								} else {
									Static186.aClass211_85 = null;
									return true;
								}
								Static186.aClass211_85 = null;
								return true;
							} else if (Static186.aClass211_85 == Static119.aClass211_48) {
								Static11.anInt3595 = Static139.aClass1_Sub33_Sub2_1.method5177() * 30;
								Static71.anInt1429 = Static105.anInt1853;
								Static186.aClass211_85 = null;
								return true;
							} else if (Static186.aClass211_83 == Static186.aClass211_85) {
								local193 = Static139.aClass1_Sub33_Sub2_1.method5160();
								local70 = Static139.aClass1_Sub33_Sub2_1.method5131();
								if (Static214.method2982(local70)) {
									Static213.method2977(-1, local193, 3, -1);
								}
								Static186.aClass211_85 = null;
								return true;
							} else if (Static252.aClass211_113 == Static186.aClass211_85) {
								Static384.method5442();
								Static186.aClass211_85 = null;
								return false;
							} else if (Static186.aClass211_85 == Static82.aClass211_31) {
								local193 = Static139.aClass1_Sub33_Sub2_1.method5157();
								local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
								local203 = Static139.aClass1_Sub33_Sub2_1.method5131();
								if (Static214.method2982(local70)) {
									Static259.method3989(local203, local193);
								}
								Static186.aClass211_85 = null;
								return true;
							} else {
								@Pc(2128) long local2128;
								if (Static130.aClass211_57 == Static186.aClass211_85) {
									local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
									local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
									local631 = local629;
									if (local291) {
										local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
									}
									local642 = Static139.aClass1_Sub33_Sub2_1.method5178();
									local647 = Static139.aClass1_Sub33_Sub2_1.method5177();
									local2128 = Static139.aClass1_Sub33_Sub2_1.method5159();
									local431 = Static139.aClass1_Sub33_Sub2_1.method5174();
									@Pc(2140) long local2140 = local2128 + (local647 << 32);
									@Pc(2142) boolean local2142 = false;
									@Pc(2144) int local2144 = 0;
									while (true) {
										if (local2144 >= 100) {
											if (local431 <= 1) {
												if (Static357.aBoolean558 && !Static201.aBoolean347 || Static54.aBoolean102) {
													local2142 = true;
												} else if (Static18.method2855(local631)) {
													local2142 = true;
												}
											}
											break;
										}
										if (local2140 == Static379.aLongArray8[local2144]) {
											local2142 = true;
											break;
										}
										local2144++;
									}
									if (!local2142 && Static203.anInt3552 == 0) {
										Static379.aLongArray8[Static2.anInt12] = local2140;
										Static2.anInt12 = (Static2.anInt12 + 1) % 100;
										@Pc(2205) String local2205 = Static292.method4433(Static250.method3875(Static139.aClass1_Sub33_Sub2_1));
										if (local431 == 2 || local431 == 3) {
											Static109.method1537(local2205, "<img=1>" + local629, 9, "<img=1>" + local631, -1, Static373.method5218(local642), 0);
										} else if (local431 == 1) {
											Static109.method1537(local2205, "<img=0>" + local629, 9, "<img=0>" + local631, -1, Static373.method5218(local642), 0);
										} else {
											Static109.method1537(local2205, local629, 9, local631, -1, Static373.method5218(local642), 0);
										}
									}
									Static186.aClass211_85 = null;
									return true;
								} else if (Static59.aClass211_25 == Static186.aClass211_85) {
									Static348.method5100(false);
									Static186.aClass211_85 = null;
									return false;
								} else if (Static186.aClass211_85 == Static328.aClass211_143) {
									Static139.aClass1_Sub33_Sub2_1.lb += 28;
									if (Static139.aClass1_Sub33_Sub2_1.method5184()) {
										Static383.method5430(Static139.aClass1_Sub33_Sub2_1.lb - 28, Static139.aClass1_Sub33_Sub2_1);
									}
									Static186.aClass211_85 = null;
									return true;
								} else if (Static182.aClass211_82 == Static186.aClass211_85) {
									for (local193 = 0; local193 < Static225.aClass25_Sub1_Sub1_Sub1Array3.length; local193++) {
										if (Static225.aClass25_Sub1_Sub1_Sub1Array3[local193] != null) {
											Static225.aClass25_Sub1_Sub1_Sub1Array3[local193].anInt2333 = -1;
										}
									}
									for (local70 = 0; local70 < Static171.aClass25_Sub1_Sub1_Sub2Array1.length; local70++) {
										if (Static171.aClass25_Sub1_Sub1_Sub2Array1[local70] != null) {
											Static171.aClass25_Sub1_Sub1_Sub2Array1[local70].anInt2333 = -1;
										}
									}
									Static186.aClass211_85 = null;
									return true;
								} else if (Static186.aClass211_85 == Static335.aClass211_146) {
									local193 = Static139.aClass1_Sub33_Sub2_1.method5157();
									local70 = Static139.aClass1_Sub33_Sub2_1.method5160();
									local203 = Static139.aClass1_Sub33_Sub2_1.method5183();
									local313 = Static139.aClass1_Sub33_Sub2_1.method5183();
									if (local313 == 65535) {
										local313 = -1;
									}
									local526 = Static139.aClass1_Sub33_Sub2_1.method5131();
									if (local526 == 65535) {
										local526 = -1;
									}
									if (Static214.method2982(local203)) {
										for (local327 = local313; local327 <= local526; local327++) {
											local1874 = ((long) local70 << 32) + (long) local327;
											local1880 = (Class1_Sub22) Static54.aClass77_5.method1368(local1874);
											if (local1880 != null) {
												local1891 = new Class1_Sub22(local193, local1880.anInt3449);
												local1880.method5577();
											} else if (local327 == -1) {
												local1891 = new Class1_Sub22(local193, Static13.method107(local70).aClass1_Sub22_2.anInt3449);
											} else {
												local1891 = new Class1_Sub22(local193, -1);
											}
											Static54.aClass77_5.method1370(local1874, local1891);
										}
									}
									Static186.aClass211_85 = null;
									return true;
								} else {
									@Pc(2774) String local2774;
									if (Static336.aClass211_147 == Static186.aClass211_85) {
										while (Static139.aClass1_Sub33_Sub2_1.lb < Static121.anInt2167) {
											local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
											local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local526 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local831 = "";
											local428 = false;
											if (local313 > 0) {
												local831 = Static139.aClass1_Sub33_Sub2_1.method5128();
												local428 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
											}
											for (local651 = 0; local651 < Static248.anInt4157; local651++) {
												if (local291) {
													if (local631.equals(Static175.aStringArray45[local651])) {
														Static175.aStringArray45[local651] = local629;
														local629 = null;
														Static334.aStringArray78[local651] = local631;
														break;
													}
												} else if (local629.equals(Static175.aStringArray45[local651])) {
													if (Static234.anIntArray495[local651] != local313) {
														Static234.anIntArray495[local651] = local313;
														if (local313 > 0) {
															Static101.method1458("", 5, 0, "", local629 + Static100.aClass169_344.method3680(Static48.anInt952));
														}
														if (local313 == 0) {
															Static101.method1458("", 5, 0, "", local629 + Static276.aClass169_283.method3680(Static48.anInt952));
														}
													}
													Static334.aStringArray78[local651] = local631;
													Static121.aStringArray33[local651] = local831;
													Static197.anIntArray408[local651] = local526;
													Static194.aBooleanArray17[local651] = local428;
													local629 = null;
													break;
												}
											}
											if (local629 != null && Static248.anInt4157 < 200) {
												Static175.aStringArray45[Static248.anInt4157] = local629;
												Static334.aStringArray78[Static248.anInt4157] = local631;
												Static234.anIntArray495[Static248.anInt4157] = local313;
												Static121.aStringArray33[Static248.anInt4157] = local831;
												Static197.anIntArray408[Static248.anInt4157] = local526;
												Static194.aBooleanArray17[Static248.anInt4157] = local428;
												Static248.anInt4157++;
											}
										}
										Static145.anInt2705 = 2;
										Static329.anInt3952 = Static105.anInt1853;
										local70 = Static248.anInt4157;
										while (local70 > 0) {
											local70--;
											local291 = true;
											for (local203 = 0; local203 < local70; local203++) {
												if (Static234.anIntArray495[local203] != Static233.anInt3887 && Static234.anIntArray495[local203 + 1] == Static233.anInt3887 || Static234.anIntArray495[local203] == 0 && Static234.anIntArray495[local203 + 1] != 0) {
													local313 = Static234.anIntArray495[local203];
													Static234.anIntArray495[local203] = Static234.anIntArray495[local203 + 1];
													Static234.anIntArray495[local203 + 1] = local313;
													local827 = Static121.aStringArray33[local203];
													Static121.aStringArray33[local203] = Static121.aStringArray33[local203 + 1];
													Static121.aStringArray33[local203 + 1] = local827;
													local831 = Static175.aStringArray45[local203];
													Static175.aStringArray45[local203] = Static175.aStringArray45[local203 + 1];
													Static175.aStringArray45[local203 + 1] = local831;
													local2774 = Static334.aStringArray78[local203];
													Static334.aStringArray78[local203] = Static334.aStringArray78[local203 + 1];
													Static334.aStringArray78[local203 + 1] = local2774;
													local651 = Static197.anIntArray408[local203];
													Static197.anIntArray408[local203] = Static197.anIntArray408[local203 + 1];
													Static197.anIntArray408[local203 + 1] = local651;
													@Pc(2810) boolean local2810 = Static194.aBooleanArray17[local203];
													Static194.aBooleanArray17[local203] = Static194.aBooleanArray17[local203 + 1];
													local291 = false;
													Static194.aBooleanArray17[local203 + 1] = local2810;
												}
											}
											if (local291) {
												break;
											}
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static216.aClass211_94) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5131();
										if (local193 == 65535) {
											local193 = -1;
										}
										local70 = Static139.aClass1_Sub33_Sub2_1.method5166();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5172();
										Static140.method5238(local70, local193, local203);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static321.aClass211_140) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5166();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5186();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5183();
										if (local203 == 65535) {
											local203 = -1;
										}
										Static57.method5054(local203, local70, local193);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static272.aClass211_120 == Static186.aClass211_85) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5183();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5157();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5183();
										local313 = Static139.aClass1_Sub33_Sub2_1.method5160();
										if (Static214.method2982(local193)) {
											Static213.method2977(local70, local313, 5, local203);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static323.aClass211_141) {
										Static56.anInt1157 = Static139.aClass1_Sub33_Sub2_1.method5174();
										for (local193 = 0; local193 < Static56.anInt1157; local193++) {
											Static250.aStringArray59[local193] = Static139.aClass1_Sub33_Sub2_1.method5128();
											Static262.aStringArray88[local193] = Static139.aClass1_Sub33_Sub2_1.method5128();
											if (Static262.aStringArray88[local193].equals("")) {
												Static262.aStringArray88[local193] = Static250.aStringArray59[local193];
											}
											Static256.aStringArray60[local193] = Static139.aClass1_Sub33_Sub2_1.method5128();
											Static267.aStringArray64[local193] = Static139.aClass1_Sub33_Sub2_1.method5128();
											if (Static267.aStringArray64[local193].equals("")) {
												Static267.aStringArray64[local193] = Static256.aStringArray60[local193];
											}
											Static300.aBooleanArray27[local193] = false;
										}
										Static329.anInt3952 = Static105.anInt1853;
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static282.aClass211_125) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5131();
										local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
										if (Static214.method2982(local203)) {
											Static103.method1478(local629, local193);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static80.aClass211_30 == Static186.aClass211_85) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5131();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5150();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
										if (Static214.method2982(local193)) {
											Static203.method2879(local203, local70);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static88.aClass211_37 == Static186.aClass211_85) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
										if (Static214.method2982(local193)) {
											Static223.method3098();
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static104.aClass211_41) {
										Static391.method5547(Static289.aClass113_12);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static355.aClass211_110) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5150();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5183();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5144();
										local313 = Static139.aClass1_Sub33_Sub2_1.method5144();
										if (local193 >> 30 == 0) {
											@Pc(3255) Class134 local3255;
											@Pc(3304) Class134 local3304;
											@Pc(3269) Class185 local3269;
											@Pc(3325) Class185 local3325;
											@Pc(3319) Class185 local3319;
											if (local193 >> 29 != 0) {
												local526 = local193 & 0xFFFF;
												@Pc(3425) Class25_Sub1_Sub1_Sub2 local3425 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local526];
												if (local3425 != null) {
													if (local70 == 65535) {
														local70 = -1;
													}
													local428 = true;
													if (local70 != -1 && local3425.anInt2338 != -1) {
														if (local3425.anInt2338 == local70) {
															local3255 = Static10.aClass246_1.method5429(local70);
															if (local3255.aBoolean297 && local3255.anInt3346 != -1) {
																local3269 = Static25.aClass67_1.method1227(local3255.anInt3346);
																local431 = local3269.anInt4802;
																if (local431 == 0 || local431 == 2) {
																	local428 = false;
																} else if (local431 == 1) {
																	local428 = true;
																}
															}
														} else {
															local3255 = Static10.aClass246_1.method5429(local70);
															local3304 = Static10.aClass246_1.method5429(local3425.anInt2338);
															if (local3255.anInt3346 != -1 && local3304.anInt3346 != -1) {
																local3319 = Static25.aClass67_1.method1227(local3255.anInt3346);
																local3325 = Static25.aClass67_1.method1227(local3304.anInt3346);
																if (local3325.anInt4805 > local3319.anInt4805) {
																	local428 = false;
																}
															}
														}
													}
													if (local428) {
														local3425.anInt2373 = 0;
														local3425.anInt2351 = local313;
														local3425.anInt2372 = 0;
														local3425.anInt2338 = local70;
														local3425.anInt2355 = local203 + Static366.anInt5883;
														local3425.anInt2330 = 1;
														if (local3425.anInt2355 > Static366.anInt5883) {
															local3425.anInt2373 = -1;
														}
														if (local3425.anInt2338 != -1 && local3425.anInt2355 == Static366.anInt5883) {
															local651 = Static10.aClass246_1.method5429(local3425.anInt2338).anInt3346;
															if (local651 != -1) {
																local3269 = Static25.aClass67_1.method1227(local651);
																if (local3269 != null && local3269.anIntArray579 != null) {
																	Static4.method52(0, local3425.anInt6080, false, local3425.aByte70, local3269, local3425.anInt6077);
																}
															}
														}
													}
												}
											} else if (local193 >> 28 != 0) {
												local526 = local193 & 0xFFFF;
												@Pc(3219) Class25_Sub1_Sub1_Sub1 local3219;
												if (local526 == Static43.anInt861) {
													local3219 = Static321.aClass25_Sub1_Sub1_Sub1_2;
												} else {
													local3219 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local526];
												}
												if (local3219 != null) {
													if (local70 == 65535) {
														local70 = -1;
													}
													local428 = true;
													if (local70 != -1 && local3219.anInt2338 != -1) {
														if (local70 == local3219.anInt2338) {
															local3255 = Static10.aClass246_1.method5429(local70);
															if (local3255.aBoolean297 && local3255.anInt3346 != -1) {
																local3269 = Static25.aClass67_1.method1227(local3255.anInt3346);
																local431 = local3269.anInt4802;
																if (local431 == 0 || local431 == 2) {
																	local428 = false;
																} else if (local431 == 1) {
																	local428 = true;
																}
															}
														} else {
															local3255 = Static10.aClass246_1.method5429(local70);
															local3304 = Static10.aClass246_1.method5429(local3219.anInt2338);
															if (local3255.anInt3346 != -1 && local3304.anInt3346 != -1) {
																local3319 = Static25.aClass67_1.method1227(local3255.anInt3346);
																local3325 = Static25.aClass67_1.method1227(local3304.anInt3346);
																if (local3325.anInt4805 > local3319.anInt4805) {
																	local428 = false;
																}
															}
														}
													}
													if (local428) {
														local3219.anInt2373 = 0;
														local3219.anInt2372 = 0;
														local3219.anInt2351 = local313;
														local3219.anInt2330 = 1;
														local3219.anInt2338 = local70;
														local3219.anInt2355 = local203 + Static366.anInt5883;
														if (local3219.anInt2355 > Static366.anInt5883) {
															local3219.anInt2373 = -1;
														}
														if (local3219.anInt2338 == 65535) {
															local3219.anInt2338 = -1;
														}
														if (local3219.anInt2338 != -1 && Static366.anInt5883 == local3219.anInt2355) {
															local651 = Static10.aClass246_1.method5429(local3219.anInt2338).anInt3346;
															if (local651 != -1) {
																local3269 = Static25.aClass67_1.method1227(local651);
																if (local3269 != null && local3269.anIntArray579 != null) {
																	Static4.method52(0, local3219.anInt6080, local3219 == Static321.aClass25_Sub1_Sub1_Sub1_2, local3219.aByte70, local3269, local3219.anInt6077);
																}
															}
														}
													}
												}
											}
										} else {
											local526 = local193 >> 28 & 0x3;
											local327 = (local193 >> 14 & 0x3FFF) - Static256.anInt4410;
											local841 = (local193 & 0x3FFF) - Static293.anInt5053;
											if (local327 >= 0 && local841 >= 0 && local327 < Static92.anInt1675 && Static262.anInt6340 > local841) {
												local651 = local327 * 128 + 64;
												local424 = local841 * 128 + 64;
												@Pc(3186) Class25_Sub1_Sub3 local3186 = new Class25_Sub1_Sub3(local70, 0, Static366.anInt5883, local526, local651, Static236.method3260(local526, local424, local651) - local313, local424, local327, local327, local841, local841);
												Static137.aClass17_23.method199(new Class1_Sub6_Sub7(local3186));
											}
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static49.aClass211_96) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5166();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
										if (Static214.method2982(local193)) {
											if (local70 == 2) {
												Static388.method5517();
											}
											Static352.anInt5753 = local203;
											Static144.method2184(local203);
											Static195.method5584(false);
											Static387.method5494(Static352.anInt5753);
											for (local313 = 0; local313 < 100; local313++) {
												Static96.aBooleanArray9[local313] = true;
											}
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static153.aClass211_68) {
										Static388.method5518(Static121.anInt2167, Static139.aClass1_Sub33_Sub2_1, Static341.aClass162_5);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static209.aClass211_92) {
										Static145.anInt2705 = 1;
										Static329.anInt3952 = Static105.anInt1853;
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static143.aClass211_66) {
										Static357.anInt6083 = Static139.aClass1_Sub33_Sub2_1.method5172();
										Static121.anInt2166 = Static139.aClass1_Sub33_Sub2_1.method5172();
										Static102.anInt3167 = Static139.aClass1_Sub33_Sub2_1.method5166();
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static98.aClass211_40) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5174();
										local70 = local193 >> 5;
										local203 = local193 & 0x1F;
										if (local203 == 0) {
											Static274.aClass11Array1[local70] = null;
											Static186.aClass211_85 = null;
											return true;
										}
										@Pc(3738) Class11 local3738 = new Class11();
										local3738.anInt167 = local203;
										local3738.anInt173 = Static139.aClass1_Sub33_Sub2_1.method5174();
										if (local3738.anInt173 >= 0 && local3738.anInt173 < Static372.aClass51Array7.length) {
											if (local3738.anInt167 == 1 || local3738.anInt167 == 10) {
												local3738.anInt172 = Static139.aClass1_Sub33_Sub2_1.method5177();
												Static139.aClass1_Sub33_Sub2_1.lb += 6;
											} else if (local3738.anInt167 >= 2 && local3738.anInt167 <= 6) {
												if (local3738.anInt167 == 2) {
													local3738.anInt178 = 64;
													local3738.anInt180 = 64;
												}
												if (local3738.anInt167 == 3) {
													local3738.anInt178 = 64;
													local3738.anInt180 = 0;
												}
												if (local3738.anInt167 == 4) {
													local3738.anInt180 = 128;
													local3738.anInt178 = 64;
												}
												if (local3738.anInt167 == 5) {
													local3738.anInt178 = 0;
													local3738.anInt180 = 64;
												}
												if (local3738.anInt167 == 6) {
													local3738.anInt178 = 128;
													local3738.anInt180 = 64;
												}
												local3738.anInt167 = 2;
												local3738.anInt176 = Static139.aClass1_Sub33_Sub2_1.method5174();
												local3738.anInt179 = Static139.aClass1_Sub33_Sub2_1.method5177();
												local3738.anInt174 = Static139.aClass1_Sub33_Sub2_1.method5177();
												local3738.anInt168 = Static139.aClass1_Sub33_Sub2_1.method5174();
												local3738.anInt169 = Static139.aClass1_Sub33_Sub2_1.method5177();
											}
											local3738.anInt177 = Static139.aClass1_Sub33_Sub2_1.method5177();
											if (local3738.anInt177 == 65535) {
												local3738.anInt177 = -1;
											}
											Static274.aClass11Array1[local70] = local3738;
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static361.aClass211_152) {
										Static346.aClass205_3 = Static162.method2404(Static139.aClass1_Sub33_Sub2_1.method5174());
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static29.aClass211_12) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5131();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5131();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5131();
										local313 = Static139.aClass1_Sub33_Sub2_1.method5150();
										local526 = Static139.aClass1_Sub33_Sub2_1.method5144();
										if (Static214.method2982(local203)) {
											Static122.method1791(local313, local526, local193, local70);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static1.aClass211_1 == Static186.aClass211_85) {
										Static391.method5547(Static139.aClass113_4);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static240.aClass211_105 == Static186.aClass211_85) {
										if (Static352.anInt5753 != -1) {
											Static350.method4909(Static352.anInt5753, 0);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static160.aClass211_72 == Static186.aClass211_85) {
										Static121.anInt2166 = Static139.aClass1_Sub33_Sub2_1.method5174();
										Static102.anInt3167 = Static139.aClass1_Sub33_Sub2_1.method5162();
										Static357.anInt6083 = Static139.aClass1_Sub33_Sub2_1.method5162();
										while (Static139.aClass1_Sub33_Sub2_1.lb < Static121.anInt2167) {
											@Pc(4012) Class113 local4012 = Static355.method3870()[Static139.aClass1_Sub33_Sub2_1.method5174()];
											Static391.method5547(local4012);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static167.aClass211_76) {
										Static391.method5547(Static196.aClass113_8);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static163.aClass211_73 == Static186.aClass211_85) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5183();
										@Pc(4046) byte local4046 = Static139.aClass1_Sub33_Sub2_1.method5182();
										Static230.aClass72_3.method1339(local4046, local193);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static359.aClass211_161 == Static186.aClass211_85) {
										Static215.anInt3689 = Static139.aClass1_Sub33_Sub2_1.method5180();
										Static186.aClass211_85 = null;
										Static71.anInt1429 = Static105.anInt1853;
										return true;
									} else if (Static320.aClass211_138 == Static186.aClass211_85) {
										local193 = Static139.aClass1_Sub33_Sub2_1.method5167();
										local70 = Static139.aClass1_Sub33_Sub2_1.method5177();
										local203 = Static139.aClass1_Sub33_Sub2_1.method5150();
										if (Static214.method2982(local70)) {
											Static11.method2934(local203, local193);
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static180.aClass211_79) {
										Static391.method5547(Static314.aClass113_14);
										Static186.aClass211_85 = null;
										return true;
									} else if (Static320.aClass211_139 == Static186.aClass211_85) {
										local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
										local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
										local631 = local629;
										if (local291) {
											local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
										}
										local642 = Static139.aClass1_Sub33_Sub2_1.method5178();
										local647 = Static139.aClass1_Sub33_Sub2_1.method5177();
										local2128 = Static139.aClass1_Sub33_Sub2_1.method5159();
										local431 = Static139.aClass1_Sub33_Sub2_1.method5174();
										@Pc(4155) int local4155 = Static139.aClass1_Sub33_Sub2_1.method5177();
										@Pc(4161) long local4161 = (local647 << 32) + local2128;
										@Pc(4163) boolean local4163 = false;
										@Pc(4165) int local4165 = 0;
										while (true) {
											if (local4165 >= 100) {
												if (local431 <= 1 && Static18.method2855(local631)) {
													local4163 = true;
												}
												break;
											}
											if (Static379.aLongArray8[local4165] == local4161) {
												local4163 = true;
												break;
											}
											local4165++;
										}
										if (!local4163 && Static203.anInt3552 == 0) {
											Static379.aLongArray8[Static2.anInt12] = local4161;
											Static2.anInt12 = (Static2.anInt12 + 1) % 100;
											@Pc(4215) String local4215 = Static357.method5242(local4155).method4181(Static139.aClass1_Sub33_Sub2_1);
											if (local431 == 2) {
												Static109.method1537(local4215, "<img=1>" + local629, 20, "<img=1>" + local631, local4155, Static373.method5218(local642), 0);
											} else if (local431 == 1) {
												Static109.method1537(local4215, "<img=0>" + local629, 20, "<img=0>" + local631, local4155, Static373.method5218(local642), 0);
											} else {
												Static109.method1537(local4215, local629, 20, local631, local4155, Static373.method5218(local642), 0);
											}
										}
										Static186.aClass211_85 = null;
										return true;
									} else if (Static186.aClass211_85 == Static186.aClass211_84) {
										Static258.method3958(Static139.aClass1_Sub33_Sub2_1, Static121.anInt2167);
										Static186.aClass211_85 = null;
										return true;
									} else {
										@Pc(4304) String local4304;
										if (Static110.aClass211_162 == Static186.aClass211_85) {
											local4304 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local932 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
											if (local932) {
												local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
											} else {
												local629 = local4304;
											}
											local313 = Static139.aClass1_Sub33_Sub2_1.method5177();
											@Pc(4333) byte local4333 = Static139.aClass1_Sub33_Sub2_1.method5188();
											@Pc(4335) boolean local4335 = false;
											if (local4333 == -128) {
												local4335 = true;
											}
											if (local4335) {
												if (Static4.anInt54 == 0) {
													Static186.aClass211_85 = null;
													return true;
												}
												for (local841 = 0; local841 < Static4.anInt54 && (!Static178.aClass149Array1[local841].aString42.equals(local629) || local313 != Static178.aClass149Array1[local841].anInt3644); local841++) {
												}
												if (Static4.anInt54 > local841) {
													while (Static4.anInt54 - 1 > local841) {
														Static178.aClass149Array1[local841] = Static178.aClass149Array1[local841 + 1];
														local841++;
													}
													Static4.anInt54--;
													Static178.aClass149Array1[Static4.anInt54] = null;
												}
											} else {
												local2774 = Static139.aClass1_Sub33_Sub2_1.method5128();
												local449 = new Class149();
												local449.aString42 = local629;
												local449.aString41 = local4304;
												local449.aString40 = Static125.method1826(local449.aString42);
												local449.aByte52 = local4333;
												local449.anInt3644 = local313;
												local449.aString43 = local2774;
												for (local424 = Static4.anInt54 - 1; local424 >= 0; local424--) {
													local431 = Static178.aClass149Array1[local424].aString40.compareTo(local449.aString40);
													if (local431 == 0) {
														Static178.aClass149Array1[local424].anInt3644 = local313;
														Static178.aClass149Array1[local424].aByte52 = local4333;
														Static178.aClass149Array1[local424].aString43 = local2774;
														if (local629.equals(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6)) {
															Static139.aByte38 = local4333;
														}
														Static53.anInt1107 = Static105.anInt1853;
														Static186.aClass211_85 = null;
														return true;
													}
													if (local431 < 0) {
														break;
													}
												}
												if (Static4.anInt54 >= Static178.aClass149Array1.length) {
													Static186.aClass211_85 = null;
													return true;
												}
												for (local431 = Static4.anInt54 - 1; local431 > local424; local431--) {
													Static178.aClass149Array1[local431 + 1] = Static178.aClass149Array1[local431];
												}
												if (Static4.anInt54 == 0) {
													Static178.aClass149Array1 = new Class149[100];
												}
												Static178.aClass149Array1[local424 + 1] = local449;
												Static4.anInt54++;
												if (local629.equals(Static321.aClass25_Sub1_Sub1_Sub1_2.aString6)) {
													Static139.aByte38 = local4333;
												}
											}
											Static53.anInt1107 = Static105.anInt1853;
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static248.aClass211_106) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
											@Pc(4573) Object[] local4573 = new Object[local629.length() + 1];
											for (local313 = local629.length() - 1; local313 >= 0; local313--) {
												if (local629.charAt(local313) == 's') {
													local4573[local313 + 1] = Static139.aClass1_Sub33_Sub2_1.method5128();
												} else {
													local4573[local313 + 1] = Integer.valueOf(Static139.aClass1_Sub33_Sub2_1.method5150());
												}
											}
											local4573[0] = Integer.valueOf(Static139.aClass1_Sub33_Sub2_1.method5150());
											if (Static214.method2982(local193)) {
												@Pc(4633) Class1_Sub39 local4633 = new Class1_Sub39();
												local4633.anObjectArray34 = local4573;
												Static387.method5496(local4633);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static88.aClass211_36) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5144();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
											@Pc(4657) byte local4657 = Static139.aClass1_Sub33_Sub2_1.method5188();
											if (Static214.method2982(local193)) {
												Static259.method3989(local70, local4657);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static343.aClass211_150 == Static186.aClass211_85) {
											Static230.aClass72_3.method1344();
											Static345.anInt5668 += 32;
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static119.aClass211_49) {
											Static391.method5547(Static13.aClass113_1);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static310.aClass211_137 == Static186.aClass211_85) {
											Static391.method5547(Static391.aClass113_19);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static17.aClass211_6 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5144();
											if (local193 == 65535) {
												local193 = -1;
											}
											local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5163();
											if (Static214.method2982(local70)) {
												Static128.method1859(local193, local203);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static355.aClass211_109 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5162();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5163();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5162();
											Static89.anIntArray215[local193] = local70;
											Static362.anIntArray696[local193] = local203;
											Static152.anIntArray334[local193] = 1;
											local313 = Static152.anIntArray331[local193] - 1;
											for (local526 = 0; local526 < local313; local526++) {
												if (Class1_Sub6_Sub11.anIntArray455[local526] <= local70) {
													Static152.anIntArray334[local193] = local526 + 2;
												}
											}
											Static249.anIntArray532[Static205.anInt3603++ & 0x1F] = local193;
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static381.aClass211_158) {
											if (Static121.anInt2167 == 0) {
												Static133.aString24 = Static306.aClass169_289.method3680(Static48.anInt952);
											} else {
												Static133.aString24 = Static139.aClass1_Sub33_Sub2_1.method5128();
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static156.aClass211_69 == Static186.aClass211_85) {
											Static222.anInt4507 = Static139.aClass1_Sub33_Sub2_1.method5174();
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static225.aClass211_100) {
											Static391.method5547(Static84.aClass113_2);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static195.aClass211_165) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5163();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5183();
											Static230.aClass72_3.method1337(local193, local70);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static390.aClass211_163) {
											local4304 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local631 = Static357.method5242(local70).method4181(Static139.aClass1_Sub33_Sub2_1);
											Static109.method1537(local631, local4304, 19, local4304, local70, null, 0);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static40.aClass211_18 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5144();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5144();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5183();
											local526 = Static139.aClass1_Sub33_Sub2_1.method5163();
											if (Static214.method2982(local203)) {
												Static213.method2977(local313, local526, 7, local70 | local193 << 16);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static172.aClass211_78 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5150();
											Static196.aClass112_6 = Static341.aClass162_5.method3285(local193);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static133.aClass211_59) {
											Static158.method2159(true);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static2.aClass211_3) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5172();
											local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5166();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5131();
											if (local313 == 65535) {
												local313 = -1;
											}
											if (local203 >= 1 && local203 <= 8) {
												if (local629.equalsIgnoreCase("null")) {
													local629 = null;
												}
												Static134.aStringArray38[local203 - 1] = local629;
												Static303.anIntArray611[local203 - 1] = local313;
												Static90.aBooleanArray8[local203 - 1] = local193 == 0;
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static250.aClass211_111 == Static186.aClass211_85) {
											local4304 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local629 = Static292.method4433(Static250.method3875(Static139.aClass1_Sub33_Sub2_1));
											Static101.method1458(local4304, 6, 0, local4304, local629);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static79.aClass211_29) {
											Static391.method5547(Static292.aClass113_13);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static126.aClass211_55) {
											Static391.method5547(Static138.aClass113_3);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static115.aClass211_47) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5163();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5183();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5144();
											if (Static214.method2982(local203)) {
												Static101.method1464(local70, (local193 << 16) + local313);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static119.aClass211_50) {
											local291 = Static139.aClass1_Sub33_Sub2_1.method5174() == 1;
											local629 = Static139.aClass1_Sub33_Sub2_1.method5128();
											local631 = local629;
											if (local291) {
												local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
											}
											local642 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local647 = Static139.aClass1_Sub33_Sub2_1.method5159();
											local651 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local424 = Static139.aClass1_Sub33_Sub2_1.method5177();
											@Pc(5192) long local5192 = (local642 << 32) + local647;
											@Pc(5194) boolean local5194 = false;
											@Pc(5196) int local5196 = 0;
											while (true) {
												if (local5196 >= 100) {
													if (local651 <= 1 && Static18.method2855(local631)) {
														local5194 = true;
													}
													break;
												}
												if (Static379.aLongArray8[local5196] == local5192) {
													local5194 = true;
													break;
												}
												local5196++;
											}
											if (!local5194 && Static203.anInt3552 == 0) {
												Static379.aLongArray8[Static2.anInt12] = local5192;
												Static2.anInt12 = (Static2.anInt12 + 1) % 100;
												@Pc(5246) String local5246 = Static357.method5242(local424).method4181(Static139.aClass1_Sub33_Sub2_1);
												if (local651 == 2) {
													Static109.method1537(local5246, "<img=1>" + local629, 18, "<img=1>" + local631, local424, null, 0);
												} else if (local651 == 1) {
													Static109.method1537(local5246, "<img=0>" + local629, 18, "<img=0>" + local631, local424, null, 0);
												} else {
													Static109.method1537(local5246, local629, 18, local631, local424, null, 0);
												}
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static170.aClass211_77) {
											Static391.method5547(Static348.aClass113_17);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static122.aClass211_51) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5150();
											if (Static214.method2982(local193)) {
												@Pc(5349) Class1_Sub38 local5349 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local70);
												if (local5349 != null) {
													Static229.method3190(false, local5349, true);
												}
												if (Static363.aClass117_17 != null) {
													Static312.method4635(Static363.aClass117_17);
													Static363.aClass117_17 = null;
												}
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static302.aClass211_130) {
											if (Static47.aFrame1 != null) {
												Static228.method3177(-1, Static188.aClass135_Sub1_1.anInt3380, -1, false);
											}
											@Pc(5384) byte[] local5384 = new byte[Static121.anInt2167];
											Static139.aClass1_Sub33_Sub2_1.method5195(Static121.anInt2167, local5384);
											local629 = Static41.method635(Static121.anInt2167, local5384, 0);
											Static98.method1453(true, local629, Static25.anInt394 == 1, Static341.aClass162_5);
											Static186.aClass211_85 = null;
											return true;
										} else if (Static180.aClass211_80 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5144();
											if (Static214.method2982(local70)) {
												Static358.anInt5787 = local193;
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static49.aClass211_97 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5163();
											if (Static214.method2982(local193)) {
												Static213.method2977(0, local70, 5, Static43.anInt861);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static295.aClass211_127) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5157();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5160();
											if (Static214.method2982(local193)) {
												@Pc(5487) Class1_Sub38 local5487 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local70);
												local1702 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local203);
												if (local1702 != null) {
													Static229.method3190(false, local1702, local5487 == null || local1702.anInt5050 != local5487.anInt5050);
												}
												if (local5487 != null) {
													local5487.method5577();
													Static22.aClass77_29.method1370((long) local203, local5487);
												}
												@Pc(5529) Class117 local5529 = Static13.method107(local70);
												if (local5529 != null) {
													Static312.method4635(local5529);
												}
												local5529 = Static13.method107(local203);
												if (local5529 != null) {
													Static312.method4635(local5529);
													Static365.method5064(true, local5529);
												}
												if (Static352.anInt5753 != -1) {
													Static350.method4909(Static352.anInt5753, 1);
												}
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static59.aClass211_26 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5177();
											if (Static214.method2982(local193) && Static137.aClass117ArrayArray1[local70] != null) {
												for (local526 = local203; local526 < local313; local526++) {
													local327 = Static139.aClass1_Sub33_Sub2_1.method5159();
													if (Static137.aClass117ArrayArray1[local70].length > local526 && Static137.aClass117ArrayArray1[local70][local526] != null) {
														Static137.aClass117ArrayArray1[local70][local526].anInt3060 = local327;
													}
												}
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static89.aClass211_38) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5177();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local526 = Static139.aClass1_Sub33_Sub2_1.method5174();
											local327 = Static139.aClass1_Sub33_Sub2_1.method5177();
											if (Static214.method2982(local193)) {
												Static50.aBooleanArray4[local70] = true;
												Static348.anIntArray713[local70] = local203;
												Static305.anIntArray613[local70] = local313;
												Static102.anIntArray371[local70] = local526;
												Static101.anIntArray230[local70] = local327;
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static12.aClass211_5 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5146();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5180();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5144();
											local313 = Static139.aClass1_Sub33_Sub2_1.method5157();
											if (Static214.method2982(local203)) {
												Static168.method2472(local313, local193, local70);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static96.aClass211_39 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5183();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5183();
											local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
											if (Static214.method2982(local193)) {
												Static103.method1478(local631, local70);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static186.aClass211_85 == Static220.aClass211_98) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5157();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5131();
											local631 = Static139.aClass1_Sub33_Sub2_1.method5128();
											if (Static214.method2982(local70)) {
												Static104.method1485(local631, local193);
											}
											Static186.aClass211_85 = null;
											return true;
										} else if (Static214.aClass211_93 == Static186.aClass211_85) {
											local193 = Static139.aClass1_Sub33_Sub2_1.method5150();
											local70 = Static139.aClass1_Sub33_Sub2_1.method5131();
											local203 = Static139.aClass1_Sub33_Sub2_1.method5177();
											if (Static214.method2982(local70)) {
												Static388.method5515(local193, local203);
											}
											Static186.aClass211_85 = null;
											return true;
										} else {
											Static62.method1006(null, "T1 - " + (Static186.aClass211_85 == null ? -1 : Static186.aClass211_85.method4707()) + "," + (Static71.aClass211_28 == null ? -1 : Static71.aClass211_28.method4707()) + "," + (Static144.aClass211_67 == null ? -1 : Static144.aClass211_67.method4707()) + " - " + Static121.anInt2167);
											Static384.method5442();
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

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!re;)V")
	public static void method1651(@OriginalArg(1) Class1_Sub33 arg0) {
		@Pc(11) int local11 = arg0.method5181();
		Static291.aClass203Array1 = new Class203[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			Static291.aClass203Array1[local16] = new Class203();
			Static291.aClass203Array1[local16].anInt5242 = arg0.method5181();
			Static291.aClass203Array1[local16].aString58 = arg0.method5189();
		}
		Static208.anInt3626 = arg0.method5181();
		Static382.anInt6199 = arg0.method5181();
		Static391.anInt6385 = arg0.method5181();
		Static321.aClass124_Sub1Array2 = new Class124_Sub1[Static382.anInt6199 + 1 - Static208.anInt3626];
		for (@Pc(70) int local70 = 0; local70 < Static391.anInt6385; local70++) {
			@Pc(76) int local76 = arg0.method5181();
			@Pc(84) Class124_Sub1 local84 = Static321.aClass124_Sub1Array2[local76] = new Class124_Sub1();
			local84.anInt5496 = arg0.method5174();
			local84.anInt5499 = arg0.method5150();
			local84.anInt5511 = Static208.anInt3626 + local76;
			local84.aString65 = arg0.method5189();
			local84.aString64 = arg0.method5189();
		}
		Static88.anInt1641 = arg0.method5150();
		Static148.aBoolean231 = true;
	}
}
