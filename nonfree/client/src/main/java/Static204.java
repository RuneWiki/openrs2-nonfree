import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!lg;")
	public static Class60 aClass60_20;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!mc;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
	public static int anInt4308;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
	public static int anInt4310;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString152 = "scroll:";

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	private static int anInt4306 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
	public static boolean method3615() throws IOException {
		if (Static131.aClass171_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static131.aClass171_3.method4638();
		if (local13 == 0) {
			return false;
		}
		if (Static94.anInt2092 == -1) {
			Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, 1, 0);
			Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
			Static94.anInt2092 = Static200.aClass4_Sub7_Sub1_2.method1238();
			Static302.anInt6099 = Static212.anIntArray369[Static94.anInt2092];
			local13--;
		}
		if (Static302.anInt6099 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, 1, 0);
			Static302.anInt6099 = Static200.aClass4_Sub7_Sub1_2.aByteArray42[0] & 0xFF;
			local13--;
		}
		if (Static302.anInt6099 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, 2, 0);
			Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
			Static302.anInt6099 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local13 -= 2;
		}
		if (local13 < Static302.anInt6099) {
			return false;
		}
		Static200.aClass4_Sub7_Sub1_2.anInt2667 = 0;
		Static131.aClass171_3.method4628(Static200.aClass4_Sub7_Sub1_2.aByteArray42, Static302.anInt6099, 0);
		Static326.anInt6408 = Static253.anInt5245;
		Static40.anInt911 = 0;
		Static253.anInt5245 = Static206.anInt4340;
		Static206.anInt4340 = Static94.anInt2092;
		@Pc(142) String local142;
		@Pc(153) long local153;
		@Pc(162) int local162;
		@Pc(136) boolean local136;
		@Pc(158) long local158;
		@Pc(140) String local140;
		@Pc(166) int local166;
		@Pc(228) String local228;
		if (Static94.anInt2092 == 65) {
			local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
			local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
			local142 = local140;
			if (local136) {
				local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
			}
			local153 = Static200.aClass4_Sub7_Sub1_2.method2404();
			local158 = Static200.aClass4_Sub7_Sub1_2.method2402();
			local162 = Static200.aClass4_Sub7_Sub1_2.method2380();
			local166 = Static200.aClass4_Sub7_Sub1_2.method2404();
			@Pc(172) long local172 = local158 + (local153 << 32);
			@Pc(174) boolean local174 = false;
			@Pc(176) int local176 = 0;
			while (true) {
				if (local176 >= 100) {
					if (local162 <= 1 && Static83.method1465(local142)) {
						local174 = true;
					}
					break;
				}
				if (local172 == Static33.aLongArray1[local176]) {
					local174 = true;
					break;
				}
				local176++;
			}
			if (!local174 && Static113.anInt6467 == 0) {
				Static33.aLongArray1[anInt4306] = local172;
				anInt4306 = (anInt4306 + 1) % 100;
				local228 = Static210.method4725(local166).method2625(Static200.aClass4_Sub7_Sub1_2);
				if (local162 == 2) {
					Static107.method5706("<img=1>" + local140, local228, 0, 18, "<img=1>" + local142, local166, null);
				} else if (local162 == 1) {
					Static107.method5706("<img=0>" + local140, local228, 0, 18, "<img=0>" + local142, local166, null);
				} else {
					Static107.method5706(local140, local228, 0, 18, local142, local166, null);
				}
			}
			Static94.anInt2092 = -1;
			return true;
		}
		@Pc(359) int local359;
		@Pc(373) int local373;
		@Pc(473) boolean local473;
		@Pc(475) int local475;
		@Pc(496) Class219 local496;
		if (Static94.anInt2092 == 60) {
			Static211.anInt4419 = Static344.anInt6736;
			if (Static302.anInt6099 == 0) {
				Static230.anInt4799 = 0;
				Static94.anInt2092 = -1;
				Static297.aClass219Array1 = null;
				Static292.aString222 = null;
				Static225.aString172 = null;
				return true;
			}
			Static292.aString222 = Static200.aClass4_Sub7_Sub1_2.method2379();
			local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
			if (local136) {
				Static200.aClass4_Sub7_Sub1_2.method2379();
			}
			@Pc(345) long local345 = Static200.aClass4_Sub7_Sub1_2.method2409();
			Static225.aString172 = Static338.method4528(local345);
			Static321.aByte71 = Static200.aClass4_Sub7_Sub1_2.method2393();
			local359 = Static200.aClass4_Sub7_Sub1_2.method2380();
			if (local359 == 255) {
				Static94.anInt2092 = -1;
				return true;
			}
			Static230.anInt4799 = local359;
			@Pc(371) Class219[] local371 = new Class219[100];
			for (local373 = 0; local373 < Static230.anInt4799; local373++) {
				local371[local373] = new Class219();
				local371[local373].aString259 = Static200.aClass4_Sub7_Sub1_2.method2379();
				local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
				if (local136) {
					local371[local373].aString257 = Static200.aClass4_Sub7_Sub1_2.method2379();
				} else {
					local371[local373].aString257 = local371[local373].aString259;
				}
				local371[local373].anInt6807 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local371[local373].aByte75 = Static200.aClass4_Sub7_Sub1_2.method2393();
				local371[local373].aString258 = Static200.aClass4_Sub7_Sub1_2.method2379();
				if (local371[local373].aString257.equals(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22)) {
					Static243.aByte65 = local371[local373].aByte75;
				}
			}
			local166 = Static230.anInt4799;
			while (local166 > 0) {
				local166--;
				local473 = true;
				for (local475 = 0; local475 < local166; local475++) {
					if (local371[local475].aString259.compareTo(local371[local475 + 1].aString259) > 0) {
						local496 = local371[local475];
						local371[local475] = local371[local475 + 1];
						local473 = false;
						local371[local475 + 1] = local496;
					}
				}
				if (local473) {
					break;
				}
			}
			Static94.anInt2092 = -1;
			Static297.aClass219Array1 = local371;
			return true;
		}
		@Pc(537) int local537;
		@Pc(543) int local543;
		@Pc(547) int local547;
		if (Static94.anInt2092 == 161) {
			local537 = Static200.aClass4_Sub7_Sub1_2.method2361();
			local543 = Static200.aClass4_Sub7_Sub1_2.method2417();
			local547 = Static200.aClass4_Sub7_Sub1_2.method2361();
			Static279.anInt5645 = local543 >> 1;
			Static110.aClass2_Sub2_Sub1_Sub1_1.method654(Static279.anInt5645, local537, (local543 & 0x1) == 1, local547);
			Static94.anInt2092 = -1;
			return true;
		} else if (Static94.anInt2092 == 153) {
			for (local537 = 0; local537 < Static103.anIntArray295.length; local537++) {
				if (Static103.anIntArray295[local537] != Static73.anIntArray161[local537]) {
					Static103.anIntArray295[local537] = Static73.anIntArray161[local537];
					Static308.method5554(local537);
					Static291.anIntArray487[Static289.anInt5852++ & 0x1F] = local537;
				}
			}
			Static94.anInt2092 = -1;
			return true;
		} else {
			@Pc(624) String local624;
			if (Static94.anInt2092 == 238) {
				local624 = Static200.aClass4_Sub7_Sub1_2.method2379();
				local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
				local142 = Static210.method4725(local543).method2625(Static200.aClass4_Sub7_Sub1_2);
				Static107.method5706(local624, local142, 0, 19, local624, local543, null);
				Static94.anInt2092 = -1;
				return true;
			} else if (Static94.anInt2092 == 180) {
				local537 = Static200.aClass4_Sub7_Sub1_2.method2380();
				local543 = Static200.aClass4_Sub7_Sub1_2.method2394();
				if (Static69.method1295(local543)) {
					Static294.anInt4001 = local537;
				}
				Static94.anInt2092 = -1;
				return true;
			} else {
				@Pc(707) int local707;
				@Pc(870) int local870;
				@Pc(905) int local905;
				@Pc(709) String local709;
				@Pc(959) String local959;
				@Pc(941) String local941;
				if (Static94.anInt2092 == 117) {
					local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
					local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
					local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
					local707 = Static200.aClass4_Sub7_Sub1_2.method2380();
					local709 = "";
					local473 = false;
					if (local359 > 0) {
						local709 = Static200.aClass4_Sub7_Sub1_2.method2379();
						local473 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
					}
					for (local162 = 0; local162 < Static164.anInt3686; local162++) {
						if (local136) {
							if (local142.equals(Static284.aStringArray41[local162])) {
								Static284.aStringArray41[local162] = local140;
								Static116.aStringArray6[local162] = local142;
								local140 = null;
								break;
							}
						} else if (local140.equals(Static284.aStringArray41[local162])) {
							if (local359 != Static218.anIntArray376[local162]) {
								Static218.anIntArray376[local162] = local359;
								if (local359 > 0) {
									Static5.method214(5, 0, local140 + Static326.aString240, "", "");
								}
								if (local359 == 0) {
									Static5.method214(5, 0, local140 + Static208.aString155, "", "");
								}
							}
							Static116.aStringArray6[local162] = local142;
							Static167.aStringArray28[local162] = local709;
							Static16.anIntArray49[local162] = local707;
							Static213.aBooleanArray22[local162] = local473;
							local140 = null;
							break;
						}
					}
					if (local140 != null && Static164.anInt3686 < 200) {
						Static284.aStringArray41[Static164.anInt3686] = local140;
						Static116.aStringArray6[Static164.anInt3686] = local142;
						Static218.anIntArray376[Static164.anInt3686] = local359;
						Static167.aStringArray28[Static164.anInt3686] = local709;
						Static16.anIntArray49[Static164.anInt3686] = local707;
						Static213.aBooleanArray22[Static164.anInt3686] = local473;
						Static164.anInt3686++;
					}
					Static345.anInt6764 = Static344.anInt6736;
					local475 = Static164.anInt3686;
					while (local475 > 0) {
						local475--;
						@Pc(868) boolean local868 = true;
						for (local870 = 0; local870 < local475; local870++) {
							if (Static218.anIntArray376[local870] != Static320.anInt6328 && Static320.anInt6328 == Static218.anIntArray376[local870 + 1] || Static218.anIntArray376[local870] == 0 && Static218.anIntArray376[local870 + 1] != 0) {
								local905 = Static218.anIntArray376[local870];
								Static218.anIntArray376[local870] = Static218.anIntArray376[local870 + 1];
								Static218.anIntArray376[local870 + 1] = local905;
								local228 = Static167.aStringArray28[local870];
								Static167.aStringArray28[local870] = Static167.aStringArray28[local870 + 1];
								Static167.aStringArray28[local870 + 1] = local228;
								local941 = Static284.aStringArray41[local870];
								Static284.aStringArray41[local870] = Static284.aStringArray41[local870 + 1];
								Static284.aStringArray41[local870 + 1] = local941;
								local959 = Static116.aStringArray6[local870];
								Static116.aStringArray6[local870] = Static116.aStringArray6[local870 + 1];
								Static116.aStringArray6[local870 + 1] = local959;
								@Pc(977) int local977 = Static16.anIntArray49[local870];
								Static16.anIntArray49[local870] = Static16.anIntArray49[local870 + 1];
								Static16.anIntArray49[local870 + 1] = local977;
								@Pc(995) boolean local995 = Static213.aBooleanArray22[local870];
								Static213.aBooleanArray22[local870] = Static213.aBooleanArray22[local870 + 1];
								Static213.aBooleanArray22[local870 + 1] = local995;
								local868 = false;
							}
						}
						if (local868) {
							break;
						}
					}
					Static94.anInt2092 = -1;
					return true;
				}
				@Pc(1056) Class72 local1056;
				@Pc(1114) int local1114;
				if (Static94.anInt2092 == 120) {
					local537 = Static200.aClass4_Sub7_Sub1_2.method2389();
					local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
					if (local537 < -70000) {
						local543 += 32768;
					}
					if (local537 < 0) {
						local1056 = null;
					} else {
						local1056 = Static66.method1243(local537);
					}
					if (local1056 != null) {
						for (local359 = 0; local359 < local1056.anIntArray179.length; local359++) {
							local1056.anIntArray179[local359] = 0;
							local1056.anIntArray181[local359] = 0;
						}
					}
					Static100.method1856(local543);
					local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
					for (local707 = 0; local707 < local359; local707++) {
						local373 = Static200.aClass4_Sub7_Sub1_2.method2361();
						if (local373 == 255) {
							local373 = Static200.aClass4_Sub7_Sub1_2.method2372();
						}
						local1114 = Static200.aClass4_Sub7_Sub1_2.method2386();
						if (local1056 != null && local707 < local1056.anIntArray179.length) {
							local1056.anIntArray179[local707] = local1114;
							local1056.anIntArray181[local707] = local373;
						}
						Static52.method982(local1114 - 1, local707, local373, local543);
					}
					if (local1056 != null) {
						Static238.method4097(local1056);
					}
					Static346.method5624();
					Static121.anIntArray256[Static2.anInt5070++ & 0x1F] = local543 & 0x7FFF;
					Static94.anInt2092 = -1;
					return true;
				} else if (Static94.anInt2092 == 20) {
					for (local537 = 0; local537 < Static253.aClass2_Sub2_Sub1_Sub1Array1.length; local537++) {
						if (Static253.aClass2_Sub2_Sub1_Sub1Array1[local537] != null) {
							Static253.aClass2_Sub2_Sub1_Sub1Array1[local537].anInt6517 = -1;
						}
					}
					for (local543 = 0; local543 < Static101.aClass2_Sub2_Sub1_Sub2Array6.length; local543++) {
						if (Static101.aClass2_Sub2_Sub1_Sub2Array6[local543] != null) {
							Static101.aClass2_Sub2_Sub1_Sub2Array6[local543].anInt6517 = -1;
						}
					}
					Static94.anInt2092 = -1;
					return true;
				} else {
					@Pc(1236) String local1236;
					@Pc(1234) String local1234;
					if (Static94.anInt2092 == 236) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2413();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2389();
						local547 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local1234 = "";
						local1236 = local1234;
						if ((local547 & 0x1) != 0) {
							local1234 = Static200.aClass4_Sub7_Sub1_2.method2379();
							if ((local547 & 0x2) == 0) {
								local1236 = local1234;
							} else {
								local1236 = Static200.aClass4_Sub7_Sub1_2.method2379();
							}
						}
						local709 = Static200.aClass4_Sub7_Sub1_2.method2379();
						if (local537 == 99) {
							Static107.method5698(local709);
						} else if (local1236.equals("") || !Static83.method1465(local1236)) {
							Static5.method214(local537, local543, local709, local1236, local1234);
						} else {
							Static94.anInt2092 = -1;
							return true;
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 162) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2394();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2378();
						local547 = Static200.aClass4_Sub7_Sub1_2.method2415();
						local359 = Static200.aClass4_Sub7_Sub1_2.method2415();
						if (Static69.method1295(local537)) {
							Static296.method5021(local359, local547, local543);
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 171) {
						local624 = Static200.aClass4_Sub7_Sub1_2.method2379();
						@Pc(1348) boolean local1348 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
						if (local1348) {
							local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
						} else {
							local140 = local624;
						}
						local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
						@Pc(1366) byte local1366 = Static200.aClass4_Sub7_Sub1_2.method2393();
						@Pc(1368) boolean local1368 = false;
						if (local1366 == -128) {
							local1368 = true;
						}
						if (local1368) {
							if (Static230.anInt4799 == 0) {
								Static94.anInt2092 = -1;
								return true;
							}
							for (local1114 = 0; local1114 < Static230.anInt4799 && (!Static297.aClass219Array1[local1114].aString257.equals(local140) || local359 != Static297.aClass219Array1[local1114].anInt6807); local1114++) {
							}
							if (local1114 < Static230.anInt4799) {
								while (local1114 < Static230.anInt4799 - 1) {
									Static297.aClass219Array1[local1114] = Static297.aClass219Array1[local1114 + 1];
									local1114++;
								}
								Static230.anInt4799--;
								Static297.aClass219Array1[Static230.anInt4799] = null;
							}
						} else {
							@Pc(1379) String local1379 = Static200.aClass4_Sub7_Sub1_2.method2379();
							local496 = new Class219();
							local496.aString258 = local1379;
							local496.aByte75 = local1366;
							local496.aString257 = local140;
							local496.aString259 = local624;
							local496.anInt6807 = local359;
							for (local166 = Static230.anInt4799 - 1; local166 >= 0; local166--) {
								local475 = Static297.aClass219Array1[local166].aString257.compareTo(local496.aString257);
								if (local475 == 0) {
									Static297.aClass219Array1[local166].anInt6807 = local359;
									Static297.aClass219Array1[local166].aByte75 = local1366;
									Static297.aClass219Array1[local166].aString258 = local1379;
									if (local140.equals(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22)) {
										Static243.aByte65 = local1366;
									}
									Static94.anInt2092 = -1;
									Static211.anInt4419 = Static344.anInt6736;
									return true;
								}
								if (local475 < 0) {
									break;
								}
							}
							if (Static230.anInt4799 >= Static297.aClass219Array1.length) {
								Static94.anInt2092 = -1;
								return true;
							}
							for (local475 = Static230.anInt4799 - 1; local475 > local166; local475--) {
								Static297.aClass219Array1[local475 + 1] = Static297.aClass219Array1[local475];
							}
							if (Static230.anInt4799 == 0) {
								Static297.aClass219Array1 = new Class219[100];
							}
							Static297.aClass219Array1[local166 + 1] = local496;
							Static230.anInt4799++;
							if (local140.equals(Static110.aClass2_Sub2_Sub1_Sub1_1.aString22)) {
								Static243.aByte65 = local1366;
							}
						}
						Static211.anInt4419 = Static344.anInt6736;
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 109) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2386();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2378();
						if (Static69.method1295(local537)) {
							Static48.method915(-1, -1, 3, local543);
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 181) {
						@Pc(1605) byte local1605 = Static200.aClass4_Sub7_Sub1_2.method2367();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2364();
						Static164.method3148(local1605, local543);
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 131) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2380();
						@Pc(1637) boolean local1637 = (local537 & 0x1) == 1;
						local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
						local1234 = Static200.aClass4_Sub7_Sub1_2.method2379();
						local1236 = Static200.aClass4_Sub7_Sub1_2.method2379();
						local709 = Static200.aClass4_Sub7_Sub1_2.method2379();
						if (local1637) {
							for (local1114 = 0; local1114 < Static173.anInt3827; local1114++) {
								if (Static36.aStringArray3[local1114].equals(local709)) {
									Static202.aStringArray33[local1114] = local142;
									if (local1234.equals("")) {
										Static36.aStringArray3[local1114] = local142;
									} else {
										Static36.aStringArray3[local1114] = local1234;
									}
									Static80.aStringArray16[local1114] = local1236;
									if (local709.equals("")) {
										Static207.aStringArray34[local1114] = local1236;
									} else {
										Static207.aStringArray34[local1114] = local709;
									}
									break;
								}
							}
						} else {
							Static202.aStringArray33[Static173.anInt3827] = local142;
							if (local1234.equals("")) {
								Static36.aStringArray3[Static173.anInt3827] = local142;
							} else {
								Static36.aStringArray3[Static173.anInt3827] = local1234;
							}
							Static80.aStringArray16[Static173.anInt3827] = local1236;
							if (local709.equals("")) {
								Static207.aStringArray34[Static173.anInt3827] = local1236;
							} else {
								Static207.aStringArray34[Static173.anInt3827] = local709;
							}
							Static41.aBooleanArray6[Static173.anInt3827] = (local537 & 0x2) == 2;
							Static173.anInt3827++;
						}
						Static345.anInt6764 = Static344.anInt6736;
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 25) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
						local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
						@Pc(1791) Object[] local1791 = new Object[local140.length() + 1];
						for (local359 = local140.length() - 1; local359 >= 0; local359--) {
							if (local140.charAt(local359) == 's') {
								local1791[local359 + 1] = Static200.aClass4_Sub7_Sub1_2.method2379();
							} else {
								local1791[local359 + 1] = Integer.valueOf(Static200.aClass4_Sub7_Sub1_2.method2389());
							}
						}
						local1791[0] = Integer.valueOf(Static200.aClass4_Sub7_Sub1_2.method2389());
						if (Static69.method1295(local537)) {
							@Pc(1853) Class4_Sub22 local1853 = new Class4_Sub22();
							local1853.anObjectArray34 = local1791;
							Static97.method1756(local1853);
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 227) {
						Static136.method2722();
						Static94.anInt2092 = -1;
						return false;
					} else if (Static94.anInt2092 == 205) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2389();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
						local547 = Static200.aClass4_Sub7_Sub1_2.method2404();
						local359 = Static200.aClass4_Sub7_Sub1_2.method2386();
						local707 = Static200.aClass4_Sub7_Sub1_2.method2386();
						if (Static69.method1295(local547)) {
							Static237.method4092(local543, local707, local537, local359);
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 140) {
						Static253.method4357(false);
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 93) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2372();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2364();
						local547 = Static200.aClass4_Sub7_Sub1_2.method2364();
						local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
						if (local537 >> 30 == 0) {
							@Pc(2010) Class156 local2010;
							@Pc(2032) Class116 local2032;
							@Pc(2068) Class116 local2068;
							@Pc(2039) Class116 local2039;
							@Pc(2015) Class156 local2015;
							if (local537 >> 29 != 0) {
								local707 = local537 & 0xFFFF;
								@Pc(2179) Class2_Sub2_Sub1_Sub2 local2179 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local707];
								if (local2179 != null) {
									if (local359 == 65535) {
										local359 = -1;
									}
									local473 = true;
									if (local359 != -1 && local2179.anInt6482 != -1) {
										if (local2179.anInt6482 == local359) {
											local2010 = Static244.method4224(local359);
											if (local2010.aBoolean432 && local2010.anInt5127 != -1) {
												local2068 = Static340.method5560(local2010.anInt5127);
												local475 = local2068.anInt3739;
												if (local475 == 0 || local475 == 2) {
													local473 = false;
												} else if (local475 == 1) {
													local473 = true;
												}
											}
										} else {
											local2010 = Static244.method4224(local359);
											local2015 = Static244.method4224(local2179.anInt6482);
											if (local2010.anInt5127 != -1 && local2015.anInt5127 != -1) {
												local2032 = Static340.method5560(local2010.anInt5127);
												local2039 = Static340.method5560(local2015.anInt5127);
												if (local2032.anInt3749 < local2039.anInt3749) {
													local473 = false;
												}
											}
										}
									}
									if (local473) {
										local2179.anInt6482 = local359;
										local2179.anInt6525 = 0;
										local2179.anInt6521 = local543 + Static342.anInt6706;
										local2179.anInt6492 = 0;
										local2179.anInt6531 = local547;
										local2179.anInt6512 = 1;
										if (Static342.anInt6706 < local2179.anInt6521) {
											local2179.anInt6492 = -1;
										}
										if (local2179.anInt6482 != -1 && Static342.anInt6706 == local2179.anInt6521) {
											local162 = Static244.method4224(local2179.anInt6482).anInt5127;
											if (local162 != -1) {
												local2068 = Static340.method5560(local162);
												if (local2068 != null && local2068.anIntArray330 != null) {
													Static291.method4975(false, local2068, 0, local2179.anInt6465, local2179.anInt6466);
												}
											}
										}
									}
								}
							} else if (local537 >> 28 != 0) {
								local707 = local537 & 0xFFFF;
								@Pc(1981) Class2_Sub2_Sub1_Sub1 local1981;
								if (local707 == Static321.anInt6343) {
									local1981 = Static110.aClass2_Sub2_Sub1_Sub1_1;
								} else {
									local1981 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local707];
								}
								if (local1981 != null) {
									if (local359 == 65535) {
										local359 = -1;
									}
									local473 = true;
									if (local359 != -1 && local1981.anInt6482 != -1) {
										if (local359 == local1981.anInt6482) {
											local2010 = Static244.method4224(local359);
											if (local2010.aBoolean432 && local2010.anInt5127 != -1) {
												local2068 = Static340.method5560(local2010.anInt5127);
												local475 = local2068.anInt3739;
												if (local475 == 0 || local475 == 2) {
													local473 = false;
												} else if (local475 == 1) {
													local473 = true;
												}
											}
										} else {
											local2010 = Static244.method4224(local359);
											local2015 = Static244.method4224(local1981.anInt6482);
											if (local2010.anInt5127 != -1 && local2015.anInt5127 != -1) {
												local2032 = Static340.method5560(local2010.anInt5127);
												local2039 = Static340.method5560(local2015.anInt5127);
												if (local2032.anInt3749 < local2039.anInt3749) {
													local473 = false;
												}
											}
										}
									}
									if (local473) {
										local1981.anInt6521 = Static342.anInt6706 + local543;
										local1981.anInt6512 = 1;
										local1981.anInt6525 = 0;
										local1981.anInt6482 = local359;
										local1981.anInt6492 = 0;
										local1981.anInt6531 = local547;
										if (local1981.anInt6482 == 65535) {
											local1981.anInt6482 = -1;
										}
										if (Static342.anInt6706 < local1981.anInt6521) {
											local1981.anInt6492 = -1;
										}
										if (local1981.anInt6482 != -1 && local1981.anInt6521 == Static342.anInt6706) {
											local162 = Static244.method4224(local1981.anInt6482).anInt5127;
											if (local162 != -1) {
												local2068 = Static340.method5560(local162);
												if (local2068 != null && local2068.anIntArray330 != null) {
													Static291.method4975(local1981 == Static110.aClass2_Sub2_Sub1_Sub1_1, local2068, 0, local1981.anInt6465, local1981.anInt6466);
												}
											}
										}
									}
								}
							}
						} else {
							local707 = local537 >> 28 & 0x3;
							local373 = (local537 >> 14 & 0x3FFF) - Static10.anInt231;
							local1114 = (local537 & 0x3FFF) - Static81.anInt1732;
							if (local373 >= 0 && local1114 >= 0 && local373 < Static92.anInt2048 && local1114 < Static290.anInt5893) {
								local162 = local373 * 128 + 64;
								local166 = local1114 * 128 + 64;
								@Pc(2413) Class2_Sub2_Sub4 local2413 = new Class2_Sub2_Sub4(local359, 0, Static342.anInt6706, local707, local162, Static119.method2125(local162, local166, local707) - local547, local166, local373, local373, local1114, local1114);
								Static108.aClass130_44.method3510(new Class4_Sub1_Sub20(local2413));
							}
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 142) {
						local624 = Static200.aClass4_Sub7_Sub1_2.method2379();
						local140 = Static150.method5471(Static82.method1449(Static194.method3529(Static200.aClass4_Sub7_Sub1_2)));
						Static5.method214(6, 0, local140, local624, local624);
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 230) {
						Static86.method1554();
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 116) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local547 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local359 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local707 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local373 = Static200.aClass4_Sub7_Sub1_2.method2404();
						if (Static69.method1295(local537)) {
							Static71.aBooleanArray11[local543] = true;
							Static64.anIntArray149[local543] = local547;
							Static59.anIntArray142[local543] = local359;
							Static56.anIntArray138[local543] = local707;
							Static130.anIntArray273[local543] = local373;
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 207) {
						local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
						local543 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local547 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
						local707 = Static200.aClass4_Sub7_Sub1_2.method2380();
						local373 = Static200.aClass4_Sub7_Sub1_2.method2380();
						if (Static69.method1295(local537)) {
							Static345.method5617(local359, local707, local543, local373, local547);
						}
						Static94.anInt2092 = -1;
						return true;
					} else if (Static94.anInt2092 == 139 || Static94.anInt2092 == 99 || Static94.anInt2092 == 203 || Static94.anInt2092 == 183 || Static94.anInt2092 == 12 || Static94.anInt2092 == 111 || Static94.anInt2092 == 17 || Static94.anInt2092 == 114 || Static94.anInt2092 == 233 || Static94.anInt2092 == 3 || Static94.anInt2092 == 101 || Static94.anInt2092 == 218 || Static94.anInt2092 == 11 || Static94.anInt2092 == 247 || Static94.anInt2092 == 40) {
						Static217.method3758();
						Static94.anInt2092 = -1;
						return true;
					} else {
						@Pc(2659) Class4_Sub8 local2659;
						if (Static94.anInt2092 == 198) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2377();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2417();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local359 = Static200.aClass4_Sub7_Sub1_2.method2364();
							if (Static69.method1295(local359)) {
								local2659 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local537);
								if (local2659 != null) {
									Static137.method2730(false, local2659, local547 != local2659.anInt1670);
								}
								Static232.method3954(local547, false, local543, local537);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 138) {
							Static38.method723(Static212.aClass120_3, Static200.aClass4_Sub7_Sub1_2, Static302.anInt6099);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 166) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2364();
							if (local537 == 65535) {
								local537 = -1;
							}
							local543 = Static200.aClass4_Sub7_Sub1_2.method2417();
							Static199.method5393(local537, local543);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 237) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2374();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2395();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2386();
							if (local547 == 65535) {
								local547 = -1;
							}
							Static206.method3640(local537, local547, local543);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 69) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2389();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
							Static286.method4908(local543, local537);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 28) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2378();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2386();
							if (Static69.method1295(local547)) {
								Static107.method5705(local537, local543);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 174) {
							Static200.aClass4_Sub7_Sub1_2.anInt2667 += 28;
							if (Static200.aClass4_Sub7_Sub1_2.method2363()) {
								Static311.method5226(Static200.aClass4_Sub7_Sub1_2, Static200.aClass4_Sub7_Sub1_2.anInt2667 - 28);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 194) {
							local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
							local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
							local142 = local140;
							if (local136) {
								local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
							}
							local153 = Static200.aClass4_Sub7_Sub1_2.method2404();
							local158 = Static200.aClass4_Sub7_Sub1_2.method2402();
							local162 = Static200.aClass4_Sub7_Sub1_2.method2380();
							@Pc(2878) long local2878 = local158 + (local153 << 32);
							@Pc(2880) boolean local2880 = false;
							local905 = 0;
							while (true) {
								if (local905 >= 100) {
									if (local162 <= 1) {
										if (Static289.aBoolean516 && !Static248.aBoolean439 || Static337.aBoolean514) {
											local2880 = true;
										} else if (Static83.method1465(local142)) {
											local2880 = true;
										}
									}
									break;
								}
								if (local2878 == Static33.aLongArray1[local905]) {
									local2880 = true;
									break;
								}
								local905++;
							}
							if (!local2880 && Static113.anInt6467 == 0) {
								Static33.aLongArray1[anInt4306] = local2878;
								anInt4306 = (anInt4306 + 1) % 100;
								@Pc(2945) String local2945 = Static150.method5471(Static82.method1449(Static194.method3529(Static200.aClass4_Sub7_Sub1_2)));
								if (local162 == 2) {
									Static107.method5706("<img=1>" + local140, local2945, 0, 7, "<img=1>" + local142, -1, null);
								} else if (local162 == 1) {
									Static107.method5706("<img=0>" + local140, local2945, 0, 7, "<img=0>" + local142, -1, null);
								} else {
									Static107.method5706(local140, local2945, 0, 3, local142, -1, null);
								}
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 150) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2389();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2386();
							if (Static69.method1295(local547)) {
								Static132.method2674(local543, local537);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 103) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2372();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2378();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local359 = Static200.aClass4_Sub7_Sub1_2.method2386();
							if (local359 == 65535) {
								local359 = -1;
							}
							if (Static69.method1295(local547)) {
								@Pc(3077) Class72 local3077 = Static66.method1243(local543);
								@Pc(3091) Class142 local3091;
								if (local3077.aBoolean159) {
									Static354.method4065(local543, local537, local359);
									local3091 = Static247.method4270(local359);
									Static237.method4092(local3091.anInt4467, local3091.anInt4472, local543, local3091.anInt4474);
									Static269.method4689(local3091.anInt4497, local3091.anInt4490, local3091.anInt4513, local543);
								} else if (local359 == -1) {
									Static94.anInt2092 = -1;
									local3077.anInt1794 = 0;
									return true;
								} else {
									local3091 = Static247.method4270(local359);
									local3077.anInt1878 = local3091.anInt4472 * 100 / local537;
									local3077.anInt1867 = local3091.anInt4467;
									local3077.anInt1817 = local3091.anInt4474;
									local3077.anInt1794 = 4;
									local3077.anInt1879 = local359;
									Static238.method4097(local3077);
								}
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 37) {
							if (Static310.anInt6220 != -1) {
								Static39.method733(Static310.anInt6220, 0);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 84) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2380();
							if (Static200.aClass4_Sub7_Sub1_2.method2380() == 0) {
								Static349.aClass190Array1[local537] = new Class190();
							} else {
								Static200.aClass4_Sub7_Sub1_2.anInt2667--;
								Static349.aClass190Array1[local537] = new Class190(Static200.aClass4_Sub7_Sub1_2);
							}
							Static3.anInt40 = Static344.anInt6736;
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 127) {
							if (Static315.aFrame2 != null) {
								Static39.method732(false, -1, -1, Static56.anInt1228);
							}
							@Pc(3226) byte[] local3226 = new byte[Static302.anInt6099];
							Static200.aClass4_Sub7_Sub1_2.method1244(local3226, Static302.anInt6099);
							local140 = Static257.method4397(Static302.anInt6099, 0, local3226);
							Static275.method4768(Static212.aClass120_3, Static6.anInt1971 == 1, local140, true);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 100) {
							Static173.anInt3827 = Static200.aClass4_Sub7_Sub1_2.method2380();
							for (local537 = 0; local537 < Static173.anInt3827; local537++) {
								Static202.aStringArray33[local537] = Static200.aClass4_Sub7_Sub1_2.method2379();
								Static36.aStringArray3[local537] = Static200.aClass4_Sub7_Sub1_2.method2379();
								if (Static36.aStringArray3[local537].equals("")) {
									Static36.aStringArray3[local537] = Static202.aStringArray33[local537];
								}
								Static80.aStringArray16[local537] = Static200.aClass4_Sub7_Sub1_2.method2379();
								Static207.aStringArray34[local537] = Static200.aClass4_Sub7_Sub1_2.method2379();
								if (Static207.aStringArray34[local537].equals("")) {
									Static207.aStringArray34[local537] = Static80.aStringArray16[local537];
								}
								Static41.aBooleanArray6[local537] = false;
							}
							Static94.anInt2092 = -1;
							Static345.anInt6764 = Static344.anInt6736;
							return true;
						} else if (Static94.anInt2092 == 221) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2364();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local359 = Static200.aClass4_Sub7_Sub1_2.method2386();
							local707 = Static200.aClass4_Sub7_Sub1_2.method2389();
							if (Static69.method1295(local547)) {
								Static48.method915(local537, local359 << 16 | local543, 7, local707);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 169) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2364();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2378();
							if (Static69.method1295(local537)) {
								Static78.method1411(local547, local543);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 58) {
							Static104.anInt6825 = Static200.aClass4_Sub7_Sub1_2.method2380();
							Static345.anInt6764 = Static344.anInt6736;
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 31) {
							Static346.method5624();
							local537 = Static200.aClass4_Sub7_Sub1_2.method2378();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2417();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2417();
							Static16.anIntArray50[local543] = local537;
							Static284.anIntArray464[local543] = local547;
							Static248.anIntArray425[local543] = 1;
							local359 = Static132.anIntArray276[local543] - 1;
							for (local707 = 0; local707 < local359; local707++) {
								if (local537 >= Class63_Sub1_Sub1.anIntArray160[local707]) {
									Static248.anIntArray425[local543] = local707 + 2;
								}
							}
							Static153.anIntArray308[Static169.anInt3755++ & 0x1F] = local543;
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 249) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2394();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2396();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2377();
							if (Static69.method1295(local537)) {
								Static82.method1450(local547, local543);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 95) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2386();
							local543 = Static200.aClass4_Sub7_Sub1_2.method2386();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2377();
							local359 = Static200.aClass4_Sub7_Sub1_2.method2389();
							if (Static69.method1295(local543)) {
								Static48.method915(local359, local537, 5, local547);
							}
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 164) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
							if (local537 == 65535) {
								local537 = -1;
							}
							local543 = Static200.aClass4_Sub7_Sub1_2.method2380();
							local547 = Static200.aClass4_Sub7_Sub1_2.method2404();
							local359 = Static200.aClass4_Sub7_Sub1_2.method2380();
							Static280.method4789(local537, local547, local359, local543);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 211) {
							local537 = Static200.aClass4_Sub7_Sub1_2.method2372();
							Static183.aClass51_6 = Static212.aClass120_3.method3236(local537);
							Static94.anInt2092 = -1;
							return true;
						} else if (Static94.anInt2092 == 136) {
							Static296.anInt5970 = Static200.aClass4_Sub7_Sub1_2.method2404() * 30;
							Static94.anInt2092 = -1;
							Static113.anInt6473 = Static344.anInt6736;
							return true;
						} else if (Static94.anInt2092 == 92) {
							Static346.method5624();
							Static85.anInt1869 = Static200.aClass4_Sub7_Sub1_2.method2396();
							Static94.anInt2092 = -1;
							Static113.anInt6473 = Static344.anInt6736;
							return true;
						} else {
							@Pc(3685) long local3685;
							if (Static94.anInt2092 == 24) {
								local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
								local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
								local142 = local140;
								if (local136) {
									local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
								}
								local153 = Static200.aClass4_Sub7_Sub1_2.method2409();
								local158 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local3685 = Static200.aClass4_Sub7_Sub1_2.method2402();
								local475 = Static200.aClass4_Sub7_Sub1_2.method2380();
								@Pc(3697) long local3697 = local3685 + (local158 << 32);
								@Pc(3699) boolean local3699 = false;
								@Pc(3701) int local3701 = 0;
								while (true) {
									if (local3701 >= 100) {
										if (local475 <= 1) {
											if (Static289.aBoolean516 && !Static248.aBoolean439 || Static337.aBoolean514) {
												local3699 = true;
											} else if (Static83.method1465(local142)) {
												local3699 = true;
											}
										}
										break;
									}
									if (local3697 == Static33.aLongArray1[local3701]) {
										local3699 = true;
										break;
									}
									local3701++;
								}
								if (!local3699 && Static113.anInt6467 == 0) {
									Static33.aLongArray1[anInt4306] = local3697;
									anInt4306 = (anInt4306 + 1) % 100;
									local941 = Static150.method5471(Static82.method1449(Static194.method3529(Static200.aClass4_Sub7_Sub1_2)));
									if (local475 == 2 || local475 == 3) {
										Static107.method5706("<img=1>" + local140, local941, 0, 9, "<img=1>" + local142, -1, Static16.method348(local153));
									} else if (local475 == 1) {
										Static107.method5706("<img=0>" + local140, local941, 0, 9, "<img=0>" + local142, -1, Static16.method348(local153));
									} else {
										Static107.method5706(local140, local941, 0, 9, local142, -1, Static16.method348(local153));
									}
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 189) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2394();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2372();
								if (Static69.method1295(local537)) {
									Static266.method4645(local543, local547);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 91) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								if (Static69.method1295(local537)) {
									Static354.method4058();
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 97) {
								Static346.method5624();
								Static107.anInt6870 = Static200.aClass4_Sub7_Sub1_2.method2380();
								Static113.anInt6473 = Static344.anInt6736;
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 177) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2378();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2386();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2386();
								if (local547 == 65535) {
									local547 = -1;
								}
								if (Static69.method1295(local543)) {
									Static48.method915(-1, local547, 2, local537);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 163) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2394();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2389();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2372();
								if (Static69.method1295(local537)) {
									@Pc(3971) Class4_Sub8 local3971 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local543);
									local2659 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local547);
									if (local2659 != null) {
										Static137.method2730(false, local2659, local3971 == null || local2659.anInt1670 != local3971.anInt1670);
									}
									if (local3971 != null) {
										local3971.method5667();
										Static38.aClass198_5.method5267((long) local547, local3971);
									}
									@Pc(4009) Class72 local4009 = Static66.method1243(local543);
									if (local4009 != null) {
										Static238.method4097(local4009);
									}
									local4009 = Static66.method1243(local547);
									if (local4009 != null) {
										Static238.method4097(local4009);
										Static124.method3067(true, local4009);
									}
									if (Static310.anInt6220 != -1) {
										Static39.method733(Static310.anInt6220, 1);
									}
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 200) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2361();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2364();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2386();
								if (Static69.method1295(local543)) {
									if (local537 == 2) {
										Static103.method2842();
									}
									Static310.anInt6220 = local547;
									Static322.method5314(local547);
									Static219.method3774(false);
									Static97.method1757(Static310.anInt6220);
									for (local359 = 0; local359 < 100; local359++) {
										Static60.aBooleanArray8[local359] = true;
									}
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 242) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2372();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2386();
								Static164.method3148(local537, local543);
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 135) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2377();
								@Pc(4124) Class72 local4124 = Static66.method1243(local537);
								for (local547 = 0; local547 < local4124.anIntArray179.length; local547++) {
									local4124.anIntArray179[local547] = -1;
									local4124.anIntArray179[local547] = 0;
								}
								Static238.method4097(local4124);
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 250) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2378();
								local543 = local537 >> 28 & 0x3;
								local547 = local537 >> 14 & 0x3FFF;
								local359 = local537 & 0x3FFF;
								local707 = Static200.aClass4_Sub7_Sub1_2.method2380();
								local373 = local707 >> 2;
								local1114 = local707 & 0x3;
								local162 = Static264.anIntArray302[local373];
								local166 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local359 -= Static81.anInt1732;
								local547 -= Static10.anInt231;
								if (local166 == 65535) {
									local166 = -1;
								}
								Static128.method2577(local359, local547, local1114, local373, local162, local543, local166);
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 55) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2389();
								if (Static69.method1295(local537)) {
									@Pc(4250) Class4_Sub8 local4250 = (Class4_Sub8) Static38.aClass198_5.method5261((long) local543);
									if (local4250 != null) {
										Static137.method2730(false, local4250, true);
									}
									if (Static251.aClass72_16 != null) {
										Static238.method4097(Static251.aClass72_16);
										Static251.aClass72_16 = null;
									}
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 219) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
								@Pc(4289) byte local4289 = Static200.aClass4_Sub7_Sub1_2.method2367();
								if (Static69.method1295(local537)) {
									Static78.method1411(local4289, local543);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 133) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2394();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
								if (Static69.method1295(local543)) {
									Static73.method1384(local142, local537);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 246) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								if (Static69.method1295(local537)) {
									Static87.method1560();
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 22) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2364();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2394();
								local359 = Static200.aClass4_Sub7_Sub1_2.method2372();
								if (Static69.method1295(local547)) {
									Static63.method1076(local359, (local543 << 16) + local537);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 81) {
								local136 = Static200.aClass4_Sub7_Sub1_2.method2380() == 1;
								local140 = Static200.aClass4_Sub7_Sub1_2.method2379();
								local142 = local140;
								if (local136) {
									local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
								}
								local153 = Static200.aClass4_Sub7_Sub1_2.method2409();
								local158 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local3685 = Static200.aClass4_Sub7_Sub1_2.method2402();
								local475 = Static200.aClass4_Sub7_Sub1_2.method2380();
								local870 = Static200.aClass4_Sub7_Sub1_2.method2404();
								@Pc(4447) long local4447 = (local158 << 32) + local3685;
								@Pc(4449) boolean local4449 = false;
								@Pc(4451) int local4451 = 0;
								while (true) {
									if (local4451 >= 100) {
										if (local475 <= 1 && Static83.method1465(local142)) {
											local4449 = true;
										}
										break;
									}
									if (local4447 == Static33.aLongArray1[local4451]) {
										local4449 = true;
										break;
									}
									local4451++;
								}
								if (!local4449 && Static113.anInt6467 == 0) {
									Static33.aLongArray1[anInt4306] = local4447;
									anInt4306 = (anInt4306 + 1) % 100;
									local959 = Static210.method4725(local870).method2625(Static200.aClass4_Sub7_Sub1_2);
									if (local475 == 2) {
										Static107.method5706("<img=1>" + local140, local959, 0, 20, "<img=1>" + local142, local870, Static16.method348(local153));
									} else if (local475 == 1) {
										Static107.method5706("<img=0>" + local140, local959, 0, 20, "<img=0>" + local142, local870, Static16.method348(local153));
									} else {
										Static107.method5706(local140, local959, 0, 20, local142, local870, Static16.method348(local153));
									}
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 85) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2378();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2361();
								if (Static69.method1295(local543)) {
									Static206.method3643(local547, local537);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 144) {
								local624 = Static200.aClass4_Sub7_Sub1_2.method2379();
								local543 = Static200.aClass4_Sub7_Sub1_2.method2386();
								local547 = Static200.aClass4_Sub7_Sub1_2.method2378();
								if (Static69.method1295(local543)) {
									Static338.method4497(local624, local547);
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 68) {
								Static37.anInt825 = Static200.aClass4_Sub7_Sub1_2.method2417();
								Static212.anInt4423 = Static200.aClass4_Sub7_Sub1_2.method2361();
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 157) {
								Static212.anInt4423 = Static200.aClass4_Sub7_Sub1_2.method2361();
								Static37.anInt825 = Static200.aClass4_Sub7_Sub1_2.method2374();
								for (@Pc(4667) Class4_Sub21 local4667 = (Class4_Sub21) Static178.aClass198_35.method5268(); local4667 != null; local4667 = (Class4_Sub21) Static178.aClass198_35.method5263()) {
									local543 = (int) (local4667.aLong259 & 0x3FFFL);
									local547 = (int) (local4667.aLong259 >> 14 & 0x3FFFL);
									local359 = (int) (local4667.aLong259 >> 28 & 0x3L);
									if (Static279.anInt5645 == local359 && Static37.anInt825 <= local543 && Static37.anInt825 + 8 > local543 && local547 >= Static212.anInt4423 && local547 < Static212.anInt4423 + 8) {
										local4667.method5667();
										Static152.method2934(local543, local547, Static279.anInt5645);
									}
								}
								for (@Pc(4734) Class4_Sub26 local4734 = (Class4_Sub26) Static332.aClass130_149.method3499(); local4734 != null; local4734 = (Class4_Sub26) Static332.aClass130_149.method3512()) {
									if (local4734.anInt3634 >= Static37.anInt825 && local4734.anInt3634 < Static37.anInt825 + 8 && local4734.anInt3641 >= Static212.anInt4423 && Static212.anInt4423 + 8 > local4734.anInt3641 && local4734.anInt3639 == Static279.anInt5645) {
										local4734.anInt3643 = 0;
									}
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 154) {
								if (Static302.anInt6099 == 0) {
									Static131.aString98 = Static169.aString123;
								} else {
									Static131.aString98 = Static200.aClass4_Sub7_Sub1_2.method2379();
								}
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 196) {
								Static135.method2712();
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 7) {
								Static27.anInt450 = Static200.aClass4_Sub7_Sub1_2.method2380();
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 148) {
								Static35.method658();
								Static346.method5624();
								Static289.anInt5852 += 32;
								Static94.anInt2092 = -1;
								return true;
							} else if (Static94.anInt2092 == 175) {
								local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
								Static23.method399(local537);
								Static121.anIntArray256[Static2.anInt5070++ & 0x1F] = local537 & 0x7FFF;
								Static94.anInt2092 = -1;
								return true;
							} else {
								@Pc(4934) long local4934;
								@Pc(4949) Class4_Sub2 local4949;
								@Pc(4940) Class4_Sub2 local4940;
								if (Static94.anInt2092 == 82) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2378();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2394();
									if (local547 == 65535) {
										local547 = -1;
									}
									local359 = Static200.aClass4_Sub7_Sub1_2.method2386();
									if (local359 == 65535) {
										local359 = -1;
									}
									local707 = Static200.aClass4_Sub7_Sub1_2.method2377();
									if (Static69.method1295(local543)) {
										for (local373 = local359; local373 <= local547; local373++) {
											local4934 = (long) local373 + ((long) local537 << 32);
											local4940 = (Class4_Sub2) Static18.aClass198_2.method5261(local4934);
											if (local4940 != null) {
												local4949 = new Class4_Sub2(local707, local4940.anInt258);
												local4940.method5667();
											} else if (local373 == -1) {
												local4949 = new Class4_Sub2(local707, Static66.method1243(local537).aClass4_Sub2_3.anInt258);
											} else {
												local4949 = new Class4_Sub2(local707, -1);
											}
											Static18.aClass198_2.method5267(local4934, local4949);
										}
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 57) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2380();
									local543 = local537 >> 5;
									local547 = local537 & 0x1F;
									if (local547 == 0) {
										Static190.aClass121Array1[local543] = null;
										Static94.anInt2092 = -1;
										return true;
									}
									@Pc(5026) Class121 local5026 = new Class121();
									local5026.anInt3844 = local547;
									local5026.anInt3848 = Static200.aClass4_Sub7_Sub1_2.method2380();
									if (local5026.anInt3848 >= 0 && Static220.aClass60Array10.length > local5026.anInt3848) {
										if (local5026.anInt3844 == 1 || local5026.anInt3844 == 10) {
											local5026.anInt3846 = Static200.aClass4_Sub7_Sub1_2.method2404();
											Static200.aClass4_Sub7_Sub1_2.anInt2667 += 5;
										} else if (local5026.anInt3844 >= 2 && local5026.anInt3844 <= 6) {
											if (local5026.anInt3844 == 2) {
												local5026.anInt3840 = 64;
												local5026.anInt3837 = 64;
											}
											if (local5026.anInt3844 == 3) {
												local5026.anInt3840 = 64;
												local5026.anInt3837 = 0;
											}
											if (local5026.anInt3844 == 4) {
												local5026.anInt3840 = 64;
												local5026.anInt3837 = 128;
											}
											if (local5026.anInt3844 == 5) {
												local5026.anInt3837 = 64;
												local5026.anInt3840 = 0;
											}
											if (local5026.anInt3844 == 6) {
												local5026.anInt3840 = 128;
												local5026.anInt3837 = 64;
											}
											local5026.anInt3844 = 2;
											local5026.anInt3841 = Static200.aClass4_Sub7_Sub1_2.method2404();
											local5026.anInt3845 = Static200.aClass4_Sub7_Sub1_2.method2404();
											local5026.anInt3838 = Static200.aClass4_Sub7_Sub1_2.method2380();
											local5026.anInt3839 = Static200.aClass4_Sub7_Sub1_2.method2404();
										}
										local5026.anInt3842 = Static200.aClass4_Sub7_Sub1_2.method2404();
										if (local5026.anInt3842 == 65535) {
											local5026.anInt3842 = -1;
										}
										Static190.aClass121Array1[local543] = local5026;
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 199) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2380();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2380();
									local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local707 = Static200.aClass4_Sub7_Sub1_2.method2380();
									local373 = Static200.aClass4_Sub7_Sub1_2.method2380();
									if (Static69.method1295(local537)) {
										Static152.method2935(true, local547, local707, local543, local373, local359);
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 192) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2386();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2394();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2386();
									if (Static69.method1295(local547)) {
										Static142.method2793(local537, local543);
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 48) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local359 = Static200.aClass4_Sub7_Sub1_2.method2404();
									if (Static69.method1295(local537) && Static158.aClass72ArrayArray1[local543] != null) {
										for (local707 = local547; local707 < local359; local707++) {
											local373 = Static200.aClass4_Sub7_Sub1_2.method2402();
											if (local707 < Static158.aClass72ArrayArray1[local543].length && Static158.aClass72ArrayArray1[local543][local707] != null) {
												Static158.aClass72ArrayArray1[local543][local707].anInt1871 = local373;
											}
										}
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 61) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2389();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2364();
									if (local543 == 65535) {
										local543 = -1;
									}
									local547 = Static200.aClass4_Sub7_Sub1_2.method2404();
									if (Static69.method1295(local547)) {
										Static48.method915(-1, local543, 1, local537);
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 185) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2372();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
									if (Static69.method1295(local543)) {
										Static48.method915(0, 2047, 5, local537);
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 106) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2380();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2380();
									if (local537 == 255) {
										local537 = -1;
										local543 = -1;
									}
									Static313.method5259(local537, local543);
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 21) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2404();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2417();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2394();
									@Pc(5438) Class2_Sub2_Sub1_Sub2 local5438 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local547];
									if (local5438 != null) {
										Static351.method5648(local537, local5438, local543);
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 213) {
									Static253.method4357(true);
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 217) {
									Static159.anInt3589 = Static200.aClass4_Sub7_Sub1_2.method2380();
									Static292.anInt5918 = Static200.aClass4_Sub7_Sub1_2.method2380();
									Static55.anInt1214 = Static200.aClass4_Sub7_Sub1_2.method2380();
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 110) {
									Static37.anInt825 = Static200.aClass4_Sub7_Sub1_2.method2417();
									Static212.anInt4423 = Static200.aClass4_Sub7_Sub1_2.method2374();
									while (Static302.anInt6099 > Static200.aClass4_Sub7_Sub1_2.anInt2667) {
										Static94.anInt2092 = Static200.aClass4_Sub7_Sub1_2.method2380();
										Static217.method3758();
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 112) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2386();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2361();
									Static286.method4908(local537, local543);
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 229) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2364();
									if (local537 == 65535) {
										local537 = -1;
									}
									local543 = Static200.aClass4_Sub7_Sub1_2.method2380();
									local142 = Static200.aClass4_Sub7_Sub1_2.method2379();
									local359 = Static200.aClass4_Sub7_Sub1_2.method2417();
									if (local359 >= 1 && local359 <= 8) {
										if (local142.equalsIgnoreCase("null")) {
											local142 = null;
										}
										Static230.aStringArray40[local359 - 1] = local142;
										Static130.anIntArray272[local359 - 1] = local537;
										Static162.aBooleanArray20[local359 - 1] = local543 == 0;
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 156) {
									local624 = Static200.aClass4_Sub7_Sub1_2.method2379();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2386();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2404();
									if (Static69.method1295(local547)) {
										Static73.method1384(local624, local543);
									}
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 176) {
									Static304.method5142(Static200.aClass4_Sub7_Sub1_2.method2379());
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 195) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2389();
									local543 = Static200.aClass4_Sub7_Sub1_2.method2404();
									if (local537 < -70000) {
										local543 += 32768;
									}
									if (local537 >= 0) {
										local1056 = Static66.method1243(local537);
									} else {
										local1056 = null;
									}
									while (Static302.anInt6099 > Static200.aClass4_Sub7_Sub1_2.anInt2667) {
										local359 = Static200.aClass4_Sub7_Sub1_2.method2413();
										local707 = Static200.aClass4_Sub7_Sub1_2.method2404();
										local373 = 0;
										if (local707 != 0) {
											local373 = Static200.aClass4_Sub7_Sub1_2.method2380();
											if (local373 == 255) {
												local373 = Static200.aClass4_Sub7_Sub1_2.method2389();
											}
										}
										if (local1056 != null && local359 >= 0 && local359 < local1056.anIntArray179.length) {
											local1056.anIntArray179[local359] = local707;
											local1056.anIntArray181[local359] = local373;
										}
										Static52.method982(local707 - 1, local359, local373, local543);
									}
									if (local1056 != null) {
										Static238.method4097(local1056);
									}
									Static346.method5624();
									Static121.anIntArray256[Static2.anInt5070++ & 0x1F] = local543 & 0x7FFF;
									Static94.anInt2092 = -1;
									return true;
								} else if (Static94.anInt2092 == 197) {
									local537 = Static200.aClass4_Sub7_Sub1_2.method2386();
									if (local537 == 65535) {
										local537 = -1;
									}
									local543 = Static200.aClass4_Sub7_Sub1_2.method2386();
									local547 = Static200.aClass4_Sub7_Sub1_2.method2389();
									local359 = Static200.aClass4_Sub7_Sub1_2.method2364();
									local707 = Static200.aClass4_Sub7_Sub1_2.method2394();
									if (local707 == 65535) {
										local707 = -1;
									}
									if (Static69.method1295(local359)) {
										for (local373 = local707; local373 <= local537; local373++) {
											local4934 = (long) local373 + ((long) local547 << 32);
											local4940 = (Class4_Sub2) Static18.aClass198_2.method5261(local4934);
											if (local4940 != null) {
												local4949 = new Class4_Sub2(local4940.anInt269, local543);
												local4940.method5667();
											} else if (local373 == -1) {
												local4949 = new Class4_Sub2(Static66.method1243(local547).aClass4_Sub2_3.anInt269, local543);
											} else {
												local4949 = new Class4_Sub2(0, local543);
											}
											Static18.aClass198_2.method5267(local4934, local4949);
										}
									}
									Static94.anInt2092 = -1;
									return true;
								} else {
									Static103.method2841(null, "T1 - " + Static94.anInt2092 + "," + Static253.anInt5245 + "," + Static326.anInt6408 + " - " + Static302.anInt6099);
									Static136.method2722();
									return true;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public static void method3617() {
		@Pc(10) int local10 = Static242.aClass106_7.method2879(Static291.aString220);
		@Pc(21) int local21;
		for (@Pc(15) Class4_Sub18 local15 = (Class4_Sub18) Static248.aClass130_112.method3499(); local15 != null; local15 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			local21 = Static57.method1021(local15);
			if (local21 > local10) {
				local10 = local21;
			}
		}
		local10 += 8;
		local21 = Static282.anInt5713 * 16 + 21;
		@Pc(47) int local47 = Static38.anInt830 - local10 / 2;
		if (local10 + local47 > Static202.anInt4258) {
			local47 = Static202.anInt4258 - local10;
		}
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(69) int local69 = Static184.anInt4055;
		if (Static38.anInt832 < local69 + local21) {
			local69 = Static38.anInt832 - local21;
		}
		Static111.anInt2449 = local47;
		if (local69 < 0) {
			local69 = 0;
		}
		Static87.anInt1931 = local69;
		Static223.anInt4637 = (Static104.aBoolean594 ? 26 : 22) + Static282.anInt5713 * 16;
		Static111.anInt2450 = local10;
		Static173.aBoolean319 = true;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)I")
	public static int method3618(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(22) int local22 = 0;
		@Pc(24) char local24 = 0;
		@Pc(26) char local26 = 0;
		while (local8 > local13 - local24 || local22 - local26 < local11) {
			if (local8 <= local13 - local24) {
				return -1;
			}
			if (local11 <= local22 - local26) {
				return 1;
			}
			@Pc(63) char local63;
			if (local24 == '\u0000') {
				local63 = arg2.charAt(local13++);
			} else {
				local63 = local24;
			}
			@Pc(76) char local76;
			if (local26 == '\u0000') {
				local76 = arg0.charAt(local22++);
			} else {
				local76 = local26;
			}
			local24 = Static226.method3892(local63);
			local26 = Static226.method3892(local76);
			local63 = Static225.method3870(arg1, local63);
			local76 = Static225.method3870(arg1, local76);
			if (local63 != local76 && Character.toUpperCase(local63) != Character.toUpperCase(local76)) {
				local63 = Character.toLowerCase(local63);
				local76 = Character.toLowerCase(local76);
				if (local76 != local63) {
					return Static38.method722(arg1, local63) - Static38.method722(arg1, local76);
				}
			}
		}
		@Pc(140) int local140 = Math.min(local8, local11);
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			if (arg1 == 2) {
				local22 = local11 - local142 - 1;
				local13 = local8 - local142 - 1;
			} else {
				local22 = local142;
				local13 = local142;
			}
			@Pc(173) char local173 = arg2.charAt(local13);
			@Pc(177) char local177 = arg0.charAt(local22);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local177 != local173) {
					return Static38.method722(arg1, local173) - Static38.method722(arg1, local177);
				}
			}
		}
		@Pc(225) int local225 = local8 - local11;
		if (local225 != 0) {
			return local225;
		}
		for (@Pc(231) int local231 = 0; local231 < local140; local231++) {
			@Pc(237) char local237 = arg2.charAt(local231);
			@Pc(241) char local241 = arg0.charAt(local231);
			if (local241 != local237) {
				return Static38.method722(arg1, local237) - Static38.method722(arg1, local241);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z")
	public static boolean method3619() {
		@Pc(5) Class141 local5 = Static183.aClass141_1;
		synchronized (Static183.aClass141_1) {
			if (Static294.anInt3995 == Static11.anInt256) {
				return false;
			} else {
				Static229.anInt4776 = Static196.anIntArray361[Static11.anInt256];
				Static306.aChar4 = Static154.aCharArray4[Static11.anInt256];
				Static11.anInt256 = Static11.anInt256 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method3620(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I")
	public static int method3621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 >>> 24;
		@Pc(18) int local18 = 255 - local13;
		@Pc(36) int local36 = ((arg0 & 0xFF00FF) * local13 & 0xFF00FF00 | (arg0 & 0xFF00) * local13 & 0xFF0000) >>> 8;
		return ((local18 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local18 & 0xFF0000) >>> 8) + local36;
	}
}
