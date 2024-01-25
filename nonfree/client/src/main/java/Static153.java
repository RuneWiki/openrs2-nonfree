import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "Lclient!rk;")
	public static Class180 aClass180_41;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public static int anInt3263;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_25 = new Class10(8);

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public static int anInt3265 = 1;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!pr;")
	public static final Class45 aClass45_1 = Static239.method4104();

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "J")
	public static long aLong112 = -1L;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Z")
	public static boolean method2988() throws IOException {
		if (Static193.aClass61_1 == null) {
			return false;
		}
		@Pc(13) int local13 = Static193.aClass61_1.method1372();
		if (local13 == 0) {
			return false;
		}
		if (Static127.anInt2797 == -1) {
			Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, 1);
			Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
			Static127.anInt2797 = Static200.aClass7_Sub3_Sub2_3.method2798();
			local13--;
			Static54.anInt1421 = Static319.anIntArray774[Static127.anInt2797];
		}
		if (Static54.anInt1421 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, 1);
			local13--;
			Static54.anInt1421 = Static200.aClass7_Sub3_Sub2_3.aByteArray33[0] & 0xFF;
		}
		if (Static54.anInt1421 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, 2);
			Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
			Static54.anInt1421 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local13 -= 2;
		}
		if (local13 < Static54.anInt1421) {
			return false;
		}
		Static200.aClass7_Sub3_Sub2_3.anInt3005 = 0;
		Static193.aClass61_1.method1373(0, Static200.aClass7_Sub3_Sub2_3.aByteArray33, Static54.anInt1421);
		Static229.anInt4565 = 0;
		Static196.anInt3868 = Static54.anInt1422;
		Static54.anInt1422 = Static234.anInt4651;
		Static234.anInt4651 = Static127.anInt2797;
		@Pc(160) int local160;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(162) int local162;
		if (Static127.anInt2797 == 179) {
			Static189.method3448();
			local134 = Static200.aClass7_Sub3_Sub2_3.method2743();
			local138 = Static200.aClass7_Sub3_Sub2_3.method2763();
			local142 = Static200.aClass7_Sub3_Sub2_3.method2772();
			Static212.anIntArray580[local138] = local134;
			Static204.anIntArray557[local138] = local142;
			Static145.anIntArray414[local138] = 1;
			local160 = Static278.anIntArray704[local138] - 1;
			for (local162 = 0; local162 < local160; local162++) {
				if (Class7_Sub4_Sub7.anIntArray296[local162] <= local134) {
					Static145.anIntArray414[local138] = local162 + 2;
				}
			}
			Static302.anIntArray821[Static242.anInt3403++ & 0x1F] = local138;
			Static127.anInt2797 = -1;
			return true;
		}
		@Pc(221) String local221;
		@Pc(225) String local225;
		@Pc(229) String local229;
		@Pc(233) String local233;
		@Pc(290) int local290;
		if (Static127.anInt2797 == 204) {
			local134 = Static200.aClass7_Sub3_Sub2_3.method2772();
			@Pc(217) boolean local217 = (local134 & 0x1) == 1;
			local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
			local225 = Static200.aClass7_Sub3_Sub2_3.method2782();
			local229 = Static200.aClass7_Sub3_Sub2_3.method2782();
			local233 = Static200.aClass7_Sub3_Sub2_3.method2782();
			if (local217) {
				for (local290 = 0; local290 < Static2.anInt17; local290++) {
					if (Static94.aStringArray24[local290].equals(local233)) {
						Static76.aStringArray17[local290] = local221;
						if (local225.equals("")) {
							Static94.aStringArray24[local290] = local221;
						} else {
							Static94.aStringArray24[local290] = local225;
						}
						Static77.aStringArray18[local290] = local229;
						if (local233.equals("")) {
							Static58.aStringArray12[local290] = local229;
						} else {
							Static58.aStringArray12[local290] = local233;
						}
						break;
					}
				}
			} else {
				Static76.aStringArray17[Static2.anInt17] = local221;
				if (local225.equals("")) {
					Static94.aStringArray24[Static2.anInt17] = local221;
				} else {
					Static94.aStringArray24[Static2.anInt17] = local225;
				}
				Static77.aStringArray18[Static2.anInt17] = local229;
				if (local233.equals("")) {
					Static58.aStringArray12[Static2.anInt17] = local229;
				} else {
					Static58.aStringArray12[Static2.anInt17] = local233;
				}
				Static60.aBooleanArray12[Static2.anInt17] = (local134 & 0x2) == 2;
				Static2.anInt17++;
			}
			Static55.anInt1452 = Static34.anInt776;
			Static127.anInt2797 = -1;
			return true;
		} else if (Static127.anInt2797 == 129) {
			local134 = Static200.aClass7_Sub3_Sub2_3.method2794();
			local138 = Static200.aClass7_Sub3_Sub2_3.method2784();
			if (local138 == 65535) {
				local138 = -1;
			}
			local142 = Static200.aClass7_Sub3_Sub2_3.method2739();
			if (Static256.method4311(local142)) {
				Static75.method1504(local134, 2, local138, -1);
			}
			Static127.anInt2797 = -1;
			return true;
		} else if (Static127.anInt2797 == 224) {
			Static200.aClass7_Sub3_Sub2_3.anInt3005 += 28;
			if (Static200.aClass7_Sub3_Sub2_3.method2742()) {
				Static78.method5353(Static200.aClass7_Sub3_Sub2_3.anInt3005 - 28, Static200.aClass7_Sub3_Sub2_3);
			}
			Static127.anInt2797 = -1;
			return true;
		} else if (Static127.anInt2797 == 181) {
			local134 = Static200.aClass7_Sub3_Sub2_3.method2739();
			local138 = Static200.aClass7_Sub3_Sub2_3.method2794();
			local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
			local160 = Static200.aClass7_Sub3_Sub2_3.method2767();
			if (Static256.method4311(local134)) {
				Static75.method1504(local160, 5, local142, local138);
			}
			Static127.anInt2797 = -1;
			return true;
		} else if (Static127.anInt2797 == 109) {
			local134 = Static200.aClass7_Sub3_Sub2_3.method2743();
			local138 = Static200.aClass7_Sub3_Sub2_3.method2739();
			if (Static256.method4311(local138)) {
				Static75.method1504(local134, 3, -1, -1);
			}
			Static127.anInt2797 = -1;
			return true;
		} else {
			@Pc(513) int local513;
			@Pc(525) int local525;
			@Pc(521) int local521;
			if (Static127.anInt2797 == 22) {
				local134 = Static200.aClass7_Sub3_Sub2_3.method2736();
				if (local134 == 65535) {
					local134 = -1;
				}
				local138 = Static200.aClass7_Sub3_Sub2_3.method2794();
				local142 = local138 >> 28 & 0x3;
				local160 = local138 >> 14 & 0x3FFF;
				local162 = local138 & 0x3FFF;
				local513 = Static200.aClass7_Sub3_Sub2_3.method2740();
				local290 = local513 >> 2;
				local521 = local513 & 0x3;
				local525 = Static191.anIntArray521[local290];
				local162 -= Static237.anInt4696;
				local160 -= Static350.anInt6609;
				Static171.method3237(local525, local290, local162, local134, local521, local160, local142);
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 189) {
				local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
				local138 = Static200.aClass7_Sub3_Sub2_3.method2736();
				local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
				if (Static256.method4311(local134)) {
					Static275.method4598(local221, local138);
				}
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 123) {
				Static41.method881(false);
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 0) {
				Static326.anInt6196 = Static200.aClass7_Sub3_Sub2_3.method2772();
				Static279.anInt6647 = Static200.aClass7_Sub3_Sub2_3.method2772();
				Static239.anInt4724 = Static200.aClass7_Sub3_Sub2_3.method2772();
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 214) {
				local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local138 = Static200.aClass7_Sub3_Sub2_3.method2743();
				local142 = Static200.aClass7_Sub3_Sub2_3.method2740();
				if (Static256.method4311(local134)) {
					Static323.method5193(local138, local142);
				}
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 199) {
				local134 = Static200.aClass7_Sub3_Sub2_3.method2763();
				local138 = Static200.aClass7_Sub3_Sub2_3.method2739();
				local142 = Static200.aClass7_Sub3_Sub2_3.method2784();
				if (Static256.method4311(local142)) {
					if (local134 == 2) {
						Static70.method1380();
					}
					Static161.anInt3337 = local138;
					Static173.method3247(local138);
					Static341.method5541(false);
					Static83.method1762(Static161.anInt3337);
					for (local160 = 0; local160 < 100; local160++) {
						Static276.aBooleanArray27[local160] = true;
					}
				}
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 183) {
				Static2.anInt17 = Static200.aClass7_Sub3_Sub2_3.method2772();
				for (local134 = 0; local134 < Static2.anInt17; local134++) {
					Static76.aStringArray17[local134] = Static200.aClass7_Sub3_Sub2_3.method2782();
					Static94.aStringArray24[local134] = Static200.aClass7_Sub3_Sub2_3.method2782();
					if (Static94.aStringArray24[local134].equals("")) {
						Static94.aStringArray24[local134] = Static76.aStringArray17[local134];
					}
					Static77.aStringArray18[local134] = Static200.aClass7_Sub3_Sub2_3.method2782();
					Static58.aStringArray12[local134] = Static200.aClass7_Sub3_Sub2_3.method2782();
					if (Static58.aStringArray12[local134].equals("")) {
						Static58.aStringArray12[local134] = Static77.aStringArray18[local134];
					}
					Static60.aBooleanArray12[local134] = false;
				}
				Static127.anInt2797 = -1;
				Static55.anInt1452 = Static34.anInt776;
				return true;
			} else if (Static127.anInt2797 == 107) {
				local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local138 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local142 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
				local162 = Static200.aClass7_Sub3_Sub2_3.method2772();
				local513 = Static200.aClass7_Sub3_Sub2_3.method2772();
				if (Static256.method4311(local134)) {
					Static136.method2692(local513, local142, local138, local160, local162, true);
				}
				Static127.anInt2797 = -1;
				return true;
			} else if (Static127.anInt2797 == 191) {
				Static189.method3448();
				Static182.anInt3703 = Static200.aClass7_Sub3_Sub2_3.method2744();
				Static127.anInt2797 = -1;
				Static320.anInt6129 = Static34.anInt776;
				return true;
			} else if (Static127.anInt2797 == 223) {
				Static258.method4344();
				Static127.anInt2797 = -1;
				return false;
			} else {
				@Pc(854) Class26 local854;
				if (Static127.anInt2797 == 156) {
					local134 = Static200.aClass7_Sub3_Sub2_3.method2767();
					local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
					if (local134 < -70000) {
						local138 += 32768;
					}
					if (local134 < 0) {
						local854 = null;
					} else {
						local854 = Static245.method4231(local134);
					}
					if (local854 != null) {
						for (local160 = 0; local160 < local854.anIntArray72.length; local160++) {
							local854.anIntArray72[local160] = 0;
							local854.anIntArray69[local160] = 0;
						}
					}
					Static154.method2991(local138);
					local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
					for (local162 = 0; local162 < local160; local162++) {
						local513 = Static200.aClass7_Sub3_Sub2_3.method2764();
						local290 = Static200.aClass7_Sub3_Sub2_3.method2772();
						if (local290 == 255) {
							local290 = Static200.aClass7_Sub3_Sub2_3.method2794();
						}
						if (local854 != null && local162 < local854.anIntArray72.length) {
							local854.anIntArray72[local162] = local513;
							local854.anIntArray69[local162] = local290;
						}
						Static246.method4258(local138, local162, local513 - 1, local290);
					}
					if (local854 != null) {
						Static245.method4226(local854);
					}
					Static189.method3448();
					Static151.anIntArray423[Static271.anInt5360++ & 0x1F] = local138 & 0x7FFF;
					Static127.anInt2797 = -1;
					return true;
				} else if (Static127.anInt2797 == 132) {
					local134 = Static200.aClass7_Sub3_Sub2_3.method2743();
					local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
					Static58.method1175(local138, local134);
					Static127.anInt2797 = -1;
					return true;
				} else {
					@Pc(1007) boolean local1007;
					@Pc(1037) int local1037;
					@Pc(1110) String local1110;
					@Pc(1011) String local1011;
					@Pc(1023) long local1023;
					@Pc(1028) long local1028;
					@Pc(1033) long local1033;
					if (Static127.anInt2797 == 219) {
						local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
						local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
						local221 = local1011;
						if (local1007) {
							local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
						}
						local1023 = Static200.aClass7_Sub3_Sub2_3.method2790();
						local1028 = Static200.aClass7_Sub3_Sub2_3.method2764();
						local1033 = Static200.aClass7_Sub3_Sub2_3.method2791();
						local1037 = Static200.aClass7_Sub3_Sub2_3.method2772();
						@Pc(1043) long local1043 = local1033 + (local1028 << 32);
						@Pc(1045) boolean local1045 = false;
						@Pc(1047) int local1047 = 0;
						while (true) {
							if (local1047 >= 100) {
								if (local1037 <= 1) {
									if (Static261.aBoolean371 && !Static233.aBoolean343 || Static343.aBoolean474) {
										local1045 = true;
									} else if (Static271.method4521(local221)) {
										local1045 = true;
									}
								}
								break;
							}
							if (local1043 == Static52.aLongArray2[local1047]) {
								local1045 = true;
								break;
							}
							local1047++;
						}
						if (!local1045 && Static320.anInt6124 == 0) {
							Static52.aLongArray2[Static32.anInt714] = local1043;
							Static32.anInt714 = (Static32.anInt714 + 1) % 100;
							local1110 = Static16.method2771(Static89.method1859(Static235.method4085(Static200.aClass7_Sub3_Sub2_3)));
							if (local1037 == 2 || local1037 == 3) {
								Static338.method5381("<img=1>" + local1011, local1110, 0, "<img=1>" + local221, 9, Static110.method2130(local1023), -1);
							} else if (local1037 == 1) {
								Static338.method5381("<img=0>" + local1011, local1110, 0, "<img=0>" + local221, 9, Static110.method2130(local1023), -1);
							} else {
								Static338.method5381(local1011, local1110, 0, local221, 9, Static110.method2130(local1023), -1);
							}
						}
						Static127.anInt2797 = -1;
						return true;
					} else if (Static127.anInt2797 == 187) {
						Static13.anInt265 = Static200.aClass7_Sub3_Sub2_3.method2740();
						Static305.anInt5838 = Static200.aClass7_Sub3_Sub2_3.method2751();
						for (@Pc(1204) Class7_Sub35 local1204 = (Class7_Sub35) Static185.aClass10_33.method157(); local1204 != null; local1204 = (Class7_Sub35) Static185.aClass10_33.method155()) {
							local138 = (int) (local1204.aLong232 & 0x3FFFL);
							local142 = (int) (local1204.aLong232 >> 14 & 0x3FFFL);
							local160 = (int) (local1204.aLong232 >> 28 & 0x3L);
							if (local160 == Static168.anInt3508 && Static13.anInt265 <= local138 && local138 < Static13.anInt265 + 8 && local142 >= Static305.anInt5838 && local142 < Static305.anInt5838 + 8) {
								local1204.method5648();
								Static154.method2995(local142, Static168.anInt3508, local138);
							}
						}
						for (@Pc(1275) Class7_Sub29 local1275 = (Class7_Sub29) Static79.aClass74_9.method1793(); local1275 != null; local1275 = (Class7_Sub29) Static79.aClass74_9.method1798()) {
							if (Static13.anInt265 <= local1275.anInt4647 && local1275.anInt4647 < Static13.anInt265 + 8 && local1275.anInt4639 >= Static305.anInt5838 && local1275.anInt4639 < Static305.anInt5838 + 8 && local1275.anInt4632 == Static168.anInt3508) {
								local1275.anInt4635 = 0;
							}
						}
						Static127.anInt2797 = -1;
						return true;
					} else if (Static127.anInt2797 == 244) {
						local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
						if (local134 == 65535) {
							local134 = -1;
						}
						local138 = Static200.aClass7_Sub3_Sub2_3.method2794();
						local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
						if (Static256.method4311(local142)) {
							Static75.method1504(local138, 1, local134, -1);
						}
						Static127.anInt2797 = -1;
						return true;
					} else if (Static127.anInt2797 == 148) {
						local134 = Static200.aClass7_Sub3_Sub2_3.method2736();
						local138 = Static200.aClass7_Sub3_Sub2_3.method2794();
						local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
						local160 = Static200.aClass7_Sub3_Sub2_3.method2739();
						local162 = Static200.aClass7_Sub3_Sub2_3.method2736();
						if (Static256.method4311(local134)) {
							Static65.method1319(local160, local142, local138, local162);
						}
						Static127.anInt2797 = -1;
						return true;
					} else if (Static127.anInt2797 == 50) {
						local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
						local138 = Static200.aClass7_Sub3_Sub2_3.method2743();
						local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
						if (Static256.method4311(local134)) {
							Static5.method61(local142, local138);
						}
						Static127.anInt2797 = -1;
						return true;
					} else {
						@Pc(1522) String local1522;
						@Pc(1465) int local1465;
						if (Static127.anInt2797 == 206) {
							local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
							local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
							local221 = local1011;
							if (local1007) {
								local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
							}
							local1023 = Static200.aClass7_Sub3_Sub2_3.method2790();
							local1028 = Static200.aClass7_Sub3_Sub2_3.method2764();
							local1033 = Static200.aClass7_Sub3_Sub2_3.method2791();
							local1037 = Static200.aClass7_Sub3_Sub2_3.method2772();
							local1465 = Static200.aClass7_Sub3_Sub2_3.method2764();
							@Pc(1472) long local1472 = (local1028 << 32) + local1033;
							@Pc(1474) boolean local1474 = false;
							@Pc(1476) int local1476 = 0;
							while (true) {
								if (local1476 >= 100) {
									if (local1037 <= 1 && Static271.method4521(local221)) {
										local1474 = true;
									}
									break;
								}
								if (local1472 == Static52.aLongArray2[local1476]) {
									local1474 = true;
									break;
								}
								local1476++;
							}
							if (!local1474 && Static320.anInt6124 == 0) {
								Static52.aLongArray2[Static32.anInt714] = local1472;
								Static32.anInt714 = (Static32.anInt714 + 1) % 100;
								local1522 = Static259.method4353(local1465).method98(Static200.aClass7_Sub3_Sub2_3);
								if (local1037 == 2) {
									Static338.method5381("<img=1>" + local1011, local1522, 0, "<img=1>" + local221, 20, Static110.method2130(local1023), local1465);
								} else if (local1037 == 1) {
									Static338.method5381("<img=0>" + local1011, local1522, 0, "<img=0>" + local221, 20, Static110.method2130(local1023), local1465);
								} else {
									Static338.method5381(local1011, local1522, 0, local221, 20, Static110.method2130(local1023), local1465);
								}
							}
							Static127.anInt2797 = -1;
							return true;
						} else if (Static127.anInt2797 == 177) {
							local134 = Static200.aClass7_Sub3_Sub2_3.method2740();
							local138 = Static200.aClass7_Sub3_Sub2_3.method2784();
							Static58.method1175(local138, local134);
							Static127.anInt2797 = -1;
							return true;
						} else if (Static127.anInt2797 == 90) {
							Static13.anInt265 = Static200.aClass7_Sub3_Sub2_3.method2740();
							Static305.anInt5838 = Static200.aClass7_Sub3_Sub2_3.method2751();
							while (Static54.anInt1421 > Static200.aClass7_Sub3_Sub2_3.anInt3005) {
								Static127.anInt2797 = Static200.aClass7_Sub3_Sub2_3.method2772();
								Static342.method5548();
							}
							Static127.anInt2797 = -1;
							return true;
						} else if (Static127.anInt2797 == 247) {
							local134 = Static200.aClass7_Sub3_Sub2_3.method2739();
							local138 = Static200.aClass7_Sub3_Sub2_3.method2772();
							if (Static256.method4311(local134)) {
								Static101.anInt2449 = local138;
							}
							Static127.anInt2797 = -1;
							return true;
						} else if (Static127.anInt2797 == 201) {
							for (local134 = 0; local134 < Static212.anIntArray579.length; local134++) {
								if (Static183.anIntArray506[local134] != Static212.anIntArray579[local134]) {
									Static212.anIntArray579[local134] = Static183.anIntArray506[local134];
									Static75.method1501(local134);
									Static235.anIntArray626[Static88.anInt3953++ & 0x1F] = local134;
								}
							}
							Static127.anInt2797 = -1;
							return true;
						} else if (Static127.anInt2797 == 225) {
							local134 = Static200.aClass7_Sub3_Sub2_3.method2740();
							local138 = Static200.aClass7_Sub3_Sub2_3.method2740();
							local142 = Static200.aClass7_Sub3_Sub2_3.method2772();
							Static168.anInt3508 = local142 >> 1;
							Static252.aClass22_Sub2_Sub1_Sub1_4.method822(local138, (local142 & 0x1) == 1, Static168.anInt3508, local134);
							Static127.anInt2797 = -1;
							return true;
						} else {
							@Pc(1798) Class115 local1798;
							@Pc(1752) String local1752;
							if (Static127.anInt2797 == 102) {
								local1752 = Static200.aClass7_Sub3_Sub2_3.method2782();
								@Pc(1761) boolean local1761 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
								if (local1761) {
									local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
								} else {
									local1011 = local1752;
								}
								local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
								@Pc(1779) byte local1779 = Static200.aClass7_Sub3_Sub2_3.method2779();
								@Pc(1781) boolean local1781 = false;
								if (local1779 == -128) {
									local1781 = true;
								}
								if (local1781) {
									if (Static129.anInt2833 == 0) {
										Static127.anInt2797 = -1;
										return true;
									}
									for (local290 = 0; local290 < Static129.anInt2833 && (!Static275.aClass115Array1[local290].aString213.equals(local1011) || Static275.aClass115Array1[local290].anInt3288 != local160); local290++) {
									}
									if (local290 < Static129.anInt2833) {
										while (Static129.anInt2833 - 1 > local290) {
											Static275.aClass115Array1[local290] = Static275.aClass115Array1[local290 + 1];
											local290++;
										}
										Static129.anInt2833--;
										Static275.aClass115Array1[Static129.anInt2833] = null;
									}
								} else {
									@Pc(1794) String local1794 = Static200.aClass7_Sub3_Sub2_3.method2782();
									local1798 = new Class115();
									local1798.aString214 = local1752;
									local1798.aString215 = local1794;
									local1798.aString213 = local1011;
									local1798.aByte41 = local1779;
									local1798.anInt3288 = local160;
									for (local525 = Static129.anInt2833 - 1; local525 >= 0; local525--) {
										local1037 = Static275.aClass115Array1[local525].aString213.compareTo(local1798.aString213);
										if (local1037 == 0) {
											Static275.aClass115Array1[local525].anInt3288 = local160;
											Static275.aClass115Array1[local525].aByte41 = local1779;
											Static275.aClass115Array1[local525].aString215 = local1794;
											if (local1011.equals(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78)) {
												Static21.aByte8 = local1779;
											}
											Static337.anInt6357 = Static34.anInt776;
											Static127.anInt2797 = -1;
											return true;
										}
										if (local1037 < 0) {
											break;
										}
									}
									if (Static275.aClass115Array1.length <= Static129.anInt2833) {
										Static127.anInt2797 = -1;
										return true;
									}
									for (local1037 = Static129.anInt2833 - 1; local1037 > local525; local1037--) {
										Static275.aClass115Array1[local1037 + 1] = Static275.aClass115Array1[local1037];
									}
									if (Static129.anInt2833 == 0) {
										Static275.aClass115Array1 = new Class115[100];
									}
									Static275.aClass115Array1[local525 + 1] = local1798;
									Static129.anInt2833++;
									if (local1011.equals(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78)) {
										Static21.aByte8 = local1779;
									}
								}
								Static127.anInt2797 = -1;
								Static337.anInt6357 = Static34.anInt776;
								return true;
							} else if (Static127.anInt2797 == 248) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
								local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
								local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
								local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
								if (Static256.method4311(local134) && Static298.aClass26ArrayArray1[local138] != null) {
									for (local162 = local142; local162 < local160; local162++) {
										local513 = Static200.aClass7_Sub3_Sub2_3.method2791();
										if (Static298.aClass26ArrayArray1[local138].length > local162 && Static298.aClass26ArrayArray1[local138][local162] != null) {
											Static298.aClass26ArrayArray1[local138][local162].anInt504 = local513;
										}
									}
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 235) {
								Static62.anInt1605 = Static200.aClass7_Sub3_Sub2_3.method2736() * 30;
								Static320.anInt6129 = Static34.anInt776;
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 164) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2767();
								local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
								if (local134 < -70000) {
									local138 += 32768;
								}
								if (local134 >= 0) {
									local854 = Static245.method4231(local134);
								} else {
									local854 = null;
								}
								while (Static54.anInt1421 > Static200.aClass7_Sub3_Sub2_3.anInt3005) {
									local160 = Static200.aClass7_Sub3_Sub2_3.method2732();
									local162 = Static200.aClass7_Sub3_Sub2_3.method2764();
									local513 = 0;
									if (local162 != 0) {
										local513 = Static200.aClass7_Sub3_Sub2_3.method2772();
										if (local513 == 255) {
											local513 = Static200.aClass7_Sub3_Sub2_3.method2767();
										}
									}
									if (local854 != null && local160 >= 0 && local854.anIntArray72.length > local160) {
										local854.anIntArray72[local160] = local162;
										local854.anIntArray69[local160] = local513;
									}
									Static246.method4258(local138, local160, local162 - 1, local513);
								}
								if (local854 != null) {
									Static245.method4226(local854);
								}
								Static189.method3448();
								Static151.anIntArray423[Static271.anInt5360++ & 0x1F] = local138 & 0x7FFF;
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 115) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2767();
								@Pc(2225) Class26 local2225 = Static245.method4231(local134);
								for (local142 = 0; local142 < local2225.anIntArray72.length; local142++) {
									local2225.anIntArray72[local142] = -1;
									local2225.anIntArray72[local142] = 0;
								}
								Static245.method4226(local2225);
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 119) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2736();
								Static100.method2031(local134);
								Static151.anIntArray423[Static271.anInt5360++ & 0x1F] = local134 & 0x7FFF;
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 78) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
								local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
								local142 = Static200.aClass7_Sub3_Sub2_3.method2784();
								if (Static256.method4311(local142)) {
									Static275.method4598(local1011, local134);
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 74) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
								if (local134 == 65535) {
									local134 = -1;
								}
								local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
								local142 = Static200.aClass7_Sub3_Sub2_3.method2751();
								local160 = Static200.aClass7_Sub3_Sub2_3.method2740();
								if (local160 >= 1 && local160 <= 8) {
									if (local1011.equalsIgnoreCase("null")) {
										local1011 = null;
									}
									Static135.aStringArray31[local160 - 1] = local1011;
									Static49.anIntArray204[local160 - 1] = local134;
									Static299.aBooleanArray28[local160 - 1] = local142 == 0;
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 131) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2743();
								local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
								local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
								if (Static256.method4311(local142)) {
									Static338.method5374(local134, local1011);
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 73) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
								local138 = Static200.aClass7_Sub3_Sub2_3.method2739();
								local142 = Static200.aClass7_Sub3_Sub2_3.method2731();
								if (Static256.method4311(local134)) {
									Static142.method2875(local142, local138);
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 140 || Static127.anInt2797 == 68 || Static127.anInt2797 == 142 || Static127.anInt2797 == 120 || Static127.anInt2797 == 145 || Static127.anInt2797 == 139 || Static127.anInt2797 == 121 || Static127.anInt2797 == 212 || Static127.anInt2797 == 135 || Static127.anInt2797 == 8 || Static127.anInt2797 == 190 || Static127.anInt2797 == 134 || Static127.anInt2797 == 98 || Static127.anInt2797 == 239 || Static127.anInt2797 == 84) {
								Static342.method5548();
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 168) {
								Static78.method5357();
								Static189.method3448();
								Static88.anInt3953 += 32;
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 25) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
								local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
								@Pc(2533) Object[] local2533 = new Object[local1011.length() + 1];
								for (local160 = local1011.length() - 1; local160 >= 0; local160--) {
									if (local1011.charAt(local160) == 's') {
										local2533[local160 + 1] = Static200.aClass7_Sub3_Sub2_3.method2782();
									} else {
										local2533[local160 + 1] = Integer.valueOf(Static200.aClass7_Sub3_Sub2_3.method2767());
									}
								}
								local2533[0] = Integer.valueOf(Static200.aClass7_Sub3_Sub2_3.method2767());
								if (Static256.method4311(local134)) {
									@Pc(2591) Class7_Sub25 local2591 = new Class7_Sub25();
									local2591.anObjectArray34 = local2533;
									Static83.method1766(local2591);
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 51) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2767();
								local138 = Static200.aClass7_Sub3_Sub2_3.method2736();
								local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
								if (Static256.method4311(local142)) {
									Static151.method2963(local134, local138);
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 69) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
								if (Static256.method4311(local134)) {
									Static29.method511();
								}
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 124) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
								@Pc(2659) byte local2659 = Static200.aClass7_Sub3_Sub2_3.method2779();
								Static301.method4875(local2659, local134);
								Static127.anInt2797 = -1;
								return true;
							} else if (Static127.anInt2797 == 215) {
								local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
								if (Static256.method4311(local134)) {
									Static82.method1754();
								}
								Static127.anInt2797 = -1;
								return true;
							} else {
								@Pc(2720) boolean local2720;
								@Pc(2919) int local2919;
								@Pc(2937) String local2937;
								if (Static127.anInt2797 == 158) {
									local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
									local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
									local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
									local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
									local162 = Static200.aClass7_Sub3_Sub2_3.method2772();
									local233 = "";
									local2720 = false;
									if (local160 > 0) {
										local233 = Static200.aClass7_Sub3_Sub2_3.method2782();
										local2720 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
									}
									for (local521 = 0; local521 < Static124.anInt2775; local521++) {
										if (local1007) {
											if (local221.equals(Static64.aStringArray15[local521])) {
												Static64.aStringArray15[local521] = local1011;
												local1011 = null;
												Static323.aStringArray49[local521] = local221;
												break;
											}
										} else if (local1011.equals(Static64.aStringArray15[local521])) {
											if (local160 != Static263.anIntArray667[local521]) {
												Static263.anIntArray667[local521] = local160;
												if (local160 > 0) {
													Static50.method1093("", 5, 0, "", local1011 + Static293.aString365);
												}
												if (local160 == 0) {
													Static50.method1093("", 5, 0, "", local1011 + Static271.aString337);
												}
											}
											Static323.aStringArray49[local521] = local221;
											Static107.aStringArray13[local521] = local233;
											Static299.anIntArray734[local521] = local162;
											Static44.aBooleanArray10[local521] = local2720;
											local1011 = null;
											break;
										}
									}
									if (local1011 != null && Static124.anInt2775 < 200) {
										Static64.aStringArray15[Static124.anInt2775] = local1011;
										Static323.aStringArray49[Static124.anInt2775] = local221;
										Static263.anIntArray667[Static124.anInt2775] = local160;
										Static107.aStringArray13[Static124.anInt2775] = local233;
										Static299.anIntArray734[Static124.anInt2775] = local162;
										Static44.aBooleanArray10[Static124.anInt2775] = local2720;
										Static124.anInt2775++;
									}
									Static55.anInt1452 = Static34.anInt776;
									local1037 = Static124.anInt2775;
									while (local1037 > 0) {
										local1037--;
										@Pc(2879) boolean local2879 = true;
										for (local1465 = 0; local1465 < local1037; local1465++) {
											if (Static65.anInt1630 != Static263.anIntArray667[local1465] && Static263.anIntArray667[local1465 + 1] == Static65.anInt1630 || Static263.anIntArray667[local1465] == 0 && Static263.anIntArray667[local1465 + 1] != 0) {
												local2919 = Static263.anIntArray667[local1465];
												Static263.anIntArray667[local1465] = Static263.anIntArray667[local1465 + 1];
												Static263.anIntArray667[local1465 + 1] = local2919;
												local2937 = Static107.aStringArray13[local1465];
												Static107.aStringArray13[local1465] = Static107.aStringArray13[local1465 + 1];
												Static107.aStringArray13[local1465 + 1] = local2937;
												local1110 = Static64.aStringArray15[local1465];
												Static64.aStringArray15[local1465] = Static64.aStringArray15[local1465 + 1];
												Static64.aStringArray15[local1465 + 1] = local1110;
												local1522 = Static323.aStringArray49[local1465];
												Static323.aStringArray49[local1465] = Static323.aStringArray49[local1465 + 1];
												Static323.aStringArray49[local1465 + 1] = local1522;
												@Pc(2991) int local2991 = Static299.anIntArray734[local1465];
												Static299.anIntArray734[local1465] = Static299.anIntArray734[local1465 + 1];
												Static299.anIntArray734[local1465 + 1] = local2991;
												@Pc(3009) boolean local3009 = Static44.aBooleanArray10[local1465];
												Static44.aBooleanArray10[local1465] = Static44.aBooleanArray10[local1465 + 1];
												local2879 = false;
												Static44.aBooleanArray10[local1465 + 1] = local3009;
											}
										}
										if (local2879) {
											break;
										}
									}
									Static127.anInt2797 = -1;
									return true;
								} else if (Static127.anInt2797 == 153) {
									local134 = Static200.aClass7_Sub3_Sub2_3.method2739();
									local138 = Static200.aClass7_Sub3_Sub2_3.method2784();
									local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
									if (Static256.method4311(local138)) {
										Static229.method4028(local142, local134);
									}
									Static127.anInt2797 = -1;
									return true;
								} else {
									@Pc(3104) Class7_Sub17 local3104;
									if (Static127.anInt2797 == 202) {
										local134 = Static200.aClass7_Sub3_Sub2_3.method2794();
										local138 = Static200.aClass7_Sub3_Sub2_3.method2767();
										local142 = Static200.aClass7_Sub3_Sub2_3.method2784();
										if (Static256.method4311(local142)) {
											@Pc(3097) Class7_Sub17 local3097 = (Class7_Sub17) Static247.aClass10_40.method163((long) local134);
											local3104 = (Class7_Sub17) Static247.aClass10_40.method163((long) local138);
											if (local3104 != null) {
												Static89.method1858(local3097 == null || local3104.anInt3252 != local3097.anInt3252, false, local3104);
											}
											if (local3097 != null) {
												local3097.method5648();
												Static247.aClass10_40.method161((long) local138, local3097);
											}
											@Pc(3139) Class26 local3139 = Static245.method4231(local134);
											if (local3139 != null) {
												Static245.method4226(local3139);
											}
											local3139 = Static245.method4231(local138);
											if (local3139 != null) {
												Static245.method4226(local3139);
												Static70.method1378(local3139, true);
											}
											if (Static161.anInt3337 != -1) {
												Static325.method5214(1, Static161.anInt3337);
											}
										}
										Static127.anInt2797 = -1;
										return true;
									} else if (Static127.anInt2797 == 6) {
										local134 = Static200.aClass7_Sub3_Sub2_3.method2772();
										local138 = Static200.aClass7_Sub3_Sub2_3.method2772();
										if (local134 == 255) {
											local134 = -1;
											local138 = -1;
										}
										Static111.method2158(local138, local134);
										Static127.anInt2797 = -1;
										return true;
									} else if (Static127.anInt2797 == 175) {
										Static29.method513(Static200.aClass7_Sub3_Sub2_3.method2782());
										Static127.anInt2797 = -1;
										return true;
									} else if (Static127.anInt2797 == 128) {
										Static139.anInt3024 = Static200.aClass7_Sub3_Sub2_3.method2772();
										Static127.anInt2797 = -1;
										Static55.anInt1452 = Static34.anInt776;
										return true;
									} else if (Static127.anInt2797 == 62) {
										local134 = Static200.aClass7_Sub3_Sub2_3.method2739();
										if (local134 == 65535) {
											local134 = -1;
										}
										local138 = Static200.aClass7_Sub3_Sub2_3.method2763();
										Static256.method4314(local134, local138);
										Static127.anInt2797 = -1;
										return true;
									} else if (Static127.anInt2797 == 230) {
										local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
										if (local134 == 65535) {
											local134 = -1;
										}
										local138 = Static200.aClass7_Sub3_Sub2_3.method2740();
										local142 = Static200.aClass7_Sub3_Sub2_3.method2791();
										Static302.method5506(local142, local138, local134);
										Static127.anInt2797 = -1;
										return true;
									} else if (Static127.anInt2797 == 10) {
										local134 = Static200.aClass7_Sub3_Sub2_3.method2794();
										local138 = Static200.aClass7_Sub3_Sub2_3.method2784();
										local142 = Static200.aClass7_Sub3_Sub2_3.method2740();
										local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
										if (Static256.method4311(local160)) {
											local3104 = (Class7_Sub17) Static247.aClass10_40.method163((long) local134);
											if (local3104 != null) {
												Static89.method1858(local138 != local3104.anInt3252, false, local3104);
											}
											Static9.method151(false, local142, local134, local138);
										}
										Static127.anInt2797 = -1;
										return true;
									} else {
										@Pc(3380) long local3380;
										@Pc(3401) Class7_Sub27 local3401;
										@Pc(3386) Class7_Sub27 local3386;
										if (Static127.anInt2797 == 24) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
											if (local134 == 65535) {
												local134 = -1;
											}
											local138 = Static200.aClass7_Sub3_Sub2_3.method2743();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2784();
											if (local160 == 65535) {
												local160 = -1;
											}
											local162 = Static200.aClass7_Sub3_Sub2_3.method2764();
											if (Static256.method4311(local162)) {
												for (local513 = local160; local513 <= local134; local513++) {
													local3380 = ((long) local138 << 32) + ((long) local513);
													local3386 = (Class7_Sub27) Static247.aClass10_41.method163(local3380);
													if (local3386 != null) {
														local3401 = new Class7_Sub27(local3386.anInt4221, local142);
														local3386.method5648();
													} else if (local513 == -1) {
														local3401 = new Class7_Sub27(Static245.method4231(local138).aClass7_Sub27_1.anInt4221, local142);
													} else {
														local3401 = new Class7_Sub27(0, local142);
													}
													Static247.aClass10_41.method161(local3380, local3401);
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 196) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2767();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2736();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2736();
											local162 = Static200.aClass7_Sub3_Sub2_3.method2739();
											if (Static256.method4311(local138)) {
												Static75.method1504(local134, 7, local162 << 16 | local160, local142);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 165) {
											if (Static54.anInt1421 == 0) {
												Static272.aString340 = Static272.aString341;
											} else {
												Static272.aString340 = Static200.aClass7_Sub3_Sub2_3.method2782();
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 227) {
											local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
											local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
											local221 = local1011;
											if (local1007) {
												local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
											}
											local1023 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local1028 = Static200.aClass7_Sub3_Sub2_3.method2791();
											local521 = Static200.aClass7_Sub3_Sub2_3.method2772();
											@Pc(3540) long local3540 = (local1023 << 32) + local1028;
											@Pc(3542) boolean local3542 = false;
											local2919 = 0;
											while (true) {
												if (local2919 >= 100) {
													if (local521 <= 1) {
														if (Static261.aBoolean371 && !Static233.aBoolean343 || Static343.aBoolean474) {
															local3542 = true;
														} else if (Static271.method4521(local221)) {
															local3542 = true;
														}
													}
													break;
												}
												if (local3540 == Static52.aLongArray2[local2919]) {
													local3542 = true;
													break;
												}
												local2919++;
											}
											if (!local3542 && Static320.anInt6124 == 0) {
												Static52.aLongArray2[Static32.anInt714] = local3540;
												Static32.anInt714 = (Static32.anInt714 + 1) % 100;
												@Pc(3607) String local3607 = Static16.method2771(Static89.method1859(Static235.method4085(Static200.aClass7_Sub3_Sub2_3)));
												if (local521 == 2) {
													Static338.method5381("<img=1>" + local1011, local3607, 0, "<img=1>" + local221, 7, null, -1);
												} else if (local521 == 1) {
													Static338.method5381("<img=0>" + local1011, local3607, 0, "<img=0>" + local221, 7, null, -1);
												} else {
													Static338.method5381(local1011, local3607, 0, local221, 3, null, -1);
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 111) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2731();
											Static166.aClass99_7 = Static116.aClass21_4.method378(local134);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 193) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2731();
											if (Static256.method4311(local134)) {
												Static75.method1504(local138, 5, 2047, 0);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 125) {
											Static189.method3448();
											Static152.anInt3253 = Static200.aClass7_Sub3_Sub2_3.method2772();
											Static320.anInt6129 = Static34.anInt776;
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 188) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2736();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2794();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2739();
											if (local138 >> 30 == 0) {
												@Pc(3907) Class170 local3907;
												@Pc(3883) Class197 local3883;
												@Pc(3936) Class170 local3936;
												@Pc(3888) Class197 local3888;
												@Pc(3902) Class170 local3902;
												if (local138 >> 29 != 0) {
													local162 = local138 & 0xFFFF;
													@Pc(3853) Class22_Sub2_Sub1_Sub2 local3853 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local162];
													if (local3853 != null) {
														if (local134 == 65535) {
															local134 = -1;
														}
														local2720 = true;
														if (local134 != -1 && local3853.anInt5129 != -1) {
															if (local3853.anInt5129 == local134) {
																local3883 = Static10.method162(local134);
																if (local3883.aBoolean442 && local3883.anInt6076 != -1) {
																	local3936 = Static261.method4379(local3883.anInt6076);
																	local1037 = local3936.anInt4968;
																	if (local1037 == 0 || local1037 == 2) {
																		local2720 = false;
																	} else if (local1037 == 1) {
																		local2720 = true;
																	}
																}
															} else {
																local3883 = Static10.method162(local134);
																local3888 = Static10.method162(local3853.anInt5129);
																if (local3883.anInt6076 != -1 && local3888.anInt6076 != -1) {
																	local3902 = Static261.method4379(local3883.anInt6076);
																	local3907 = Static261.method4379(local3888.anInt6076);
																	if (local3907.anInt4963 > local3902.anInt4963) {
																		local2720 = false;
																	}
																}
															}
														}
														if (local2720) {
															local3853.anInt5092 = local142 + Static212.anInt4234;
															local3853.anInt5090 = local160;
															local3853.anInt5123 = 0;
															local3853.anInt5129 = local134;
															local3853.anInt5131 = 1;
															local3853.anInt5127 = 0;
															if (local3853.anInt5092 > Static212.anInt4234) {
																local3853.anInt5123 = -1;
															}
															if (local3853.anInt5129 != -1 && local3853.anInt5092 == Static212.anInt4234) {
																local521 = Static10.method162(local3853.anInt5129).anInt6076;
																if (local521 != -1) {
																	local3936 = Static261.method4379(local521);
																	if (local3936 != null && local3936.anIntArray652 != null) {
																		Static219.method3870(local3936, local3853.anInt5967, false, 0, local3853.anInt5973);
																	}
																}
															}
														}
													}
												} else if (local138 >> 28 != 0) {
													local162 = local138 & 0xFFFF;
													@Pc(4052) Class22_Sub2_Sub1_Sub1 local4052;
													if (local162 == Static4.anInt77) {
														local4052 = Static252.aClass22_Sub2_Sub1_Sub1_4;
													} else {
														local4052 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local162];
													}
													if (local4052 != null) {
														if (local134 == 65535) {
															local134 = -1;
														}
														local2720 = true;
														if (local134 != -1 && local4052.anInt5129 != -1) {
															if (local134 == local4052.anInt5129) {
																local3883 = Static10.method162(local134);
																if (local3883.aBoolean442 && local3883.anInt6076 != -1) {
																	local3936 = Static261.method4379(local3883.anInt6076);
																	local1037 = local3936.anInt4968;
																	if (local1037 == 0 || local1037 == 2) {
																		local2720 = false;
																	} else if (local1037 == 1) {
																		local2720 = true;
																	}
																}
															} else {
																local3883 = Static10.method162(local134);
																local3888 = Static10.method162(local4052.anInt5129);
																if (local3883.anInt6076 != -1 && local3888.anInt6076 != -1) {
																	local3902 = Static261.method4379(local3883.anInt6076);
																	local3907 = Static261.method4379(local3888.anInt6076);
																	if (local3902.anInt4963 < local3907.anInt4963) {
																		local2720 = false;
																	}
																}
															}
														}
														if (local2720) {
															local4052.anInt5090 = local160;
															local4052.anInt5129 = local134;
															local4052.anInt5127 = 0;
															local4052.anInt5092 = local142 + Static212.anInt4234;
															local4052.anInt5131 = 1;
															local4052.anInt5123 = 0;
															if (local4052.anInt5129 == 65535) {
																local4052.anInt5129 = -1;
															}
															if (Static212.anInt4234 < local4052.anInt5092) {
																local4052.anInt5123 = -1;
															}
															if (local4052.anInt5129 != -1 && local4052.anInt5092 == Static212.anInt4234) {
																local521 = Static10.method162(local4052.anInt5129).anInt6076;
																if (local521 != -1) {
																	local3936 = Static261.method4379(local521);
																	if (local3936 != null && local3936.anIntArray652 != null) {
																		Static219.method3870(local3936, local4052.anInt5967, local4052 == Static252.aClass22_Sub2_Sub1_Sub1_4, 0, local4052.anInt5973);
																	}
																}
															}
														}
													}
												}
											} else {
												local162 = local138 >> 28 & 0x3;
												local513 = (local138 >> 14 & 0x3FFF) - Static350.anInt6609;
												local290 = (local138 & 0x3FFF) - Static237.anInt4696;
												if (local513 >= 0 && local290 >= 0 && Static15.anInt287 > local513 && Static325.anInt6173 > local290) {
													local521 = local513 * 128 + 64;
													local525 = local290 * 128 + 64;
													@Pc(3829) Class22_Sub2_Sub2 local3829 = new Class22_Sub2_Sub2(local134, 0, Static212.anInt4234, local162, local521, Static341.method5540(local162, local525, local521) - local160, local525, local513, local513, local290, local290);
													Static338.aClass74_36.method1802(new Class7_Sub1_Sub17(local3829));
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 171) {
											Static49.method1088();
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 95) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2736();
											if (local134 == 65535) {
												local134 = -1;
											}
											local138 = Static200.aClass7_Sub3_Sub2_3.method2743();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2794();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2784();
											if (Static256.method4311(local160)) {
												@Pc(4279) Class26 local4279 = Static245.method4231(local138);
												@Pc(4297) Class138 local4297;
												if (local4279.aBoolean36) {
													Static294.method5316(local138, local134, local142);
													local4297 = Static17.method4472(local134);
													Static65.method1319(local4297.anInt3992, local4297.anInt3977, local138, local4297.anInt3982);
													Static193.method3468(local4297.anInt4006, local4297.anInt4013, local4297.anInt4008, local138);
												} else if (local134 == -1) {
													Static127.anInt2797 = -1;
													local4279.anInt564 = 0;
													return true;
												} else {
													local4297 = Static17.method4472(local134);
													local4279.anInt564 = 4;
													local4279.anInt525 = local4297.anInt3992;
													local4279.anInt565 = local4297.anInt3977;
													local4279.anInt516 = local134;
													local4279.anInt531 = local4297.anInt3982 * 100 / local142;
													Static245.method4226(local4279);
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 232) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2776();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2762();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2731();
											if (Static256.method4311(local142)) {
												Static21.method361(local134, local160, local138);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 254) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local138 = local134 >> 5;
											local142 = local134 & 0x1F;
											if (local142 == 0) {
												Static174.aClass50Array1[local138] = null;
												Static127.anInt2797 = -1;
												return true;
											}
											@Pc(4421) Class50 local4421 = new Class50();
											local4421.anInt1480 = local142;
											local4421.anInt1485 = Static200.aClass7_Sub3_Sub2_3.method2772();
											if (local4421.anInt1485 >= 0 && Static14.aClass52Array2.length > local4421.anInt1485) {
												if (local4421.anInt1480 == 1 || local4421.anInt1480 == 10) {
													local4421.anInt1473 = Static200.aClass7_Sub3_Sub2_3.method2764();
													Static200.aClass7_Sub3_Sub2_3.anInt3005 += 5;
												} else if (local4421.anInt1480 >= 2 && local4421.anInt1480 <= 6) {
													if (local4421.anInt1480 == 2) {
														local4421.anInt1474 = 64;
														local4421.anInt1475 = 64;
													}
													if (local4421.anInt1480 == 3) {
														local4421.anInt1475 = 0;
														local4421.anInt1474 = 64;
													}
													if (local4421.anInt1480 == 4) {
														local4421.anInt1475 = 128;
														local4421.anInt1474 = 64;
													}
													if (local4421.anInt1480 == 5) {
														local4421.anInt1475 = 64;
														local4421.anInt1474 = 0;
													}
													if (local4421.anInt1480 == 6) {
														local4421.anInt1474 = 128;
														local4421.anInt1475 = 64;
													}
													local4421.anInt1480 = 2;
													local4421.anInt1481 = Static200.aClass7_Sub3_Sub2_3.method2764();
													local4421.anInt1476 = Static200.aClass7_Sub3_Sub2_3.method2764();
													local4421.anInt1477 = Static200.aClass7_Sub3_Sub2_3.method2772();
													local4421.anInt1484 = Static200.aClass7_Sub3_Sub2_3.method2764();
												}
												local4421.anInt1478 = Static200.aClass7_Sub3_Sub2_3.method2764();
												if (local4421.anInt1478 == 65535) {
													local4421.anInt1478 = -1;
												}
												Static174.aClass50Array1[local138] = local4421;
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 216) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2772();
											if (Static200.aClass7_Sub3_Sub2_3.method2772() == 0) {
												Static224.aClass125Array1[local134] = new Class125();
											} else {
												Static200.aClass7_Sub3_Sub2_3.anInt3005--;
												Static224.aClass125Array1[local134] = new Class125(Static200.aClass7_Sub3_Sub2_3);
											}
											Static69.anInt1715 = Static34.anInt776;
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 93) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local162 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local513 = Static200.aClass7_Sub3_Sub2_3.method2764();
											if (Static256.method4311(local134)) {
												Static341.aBooleanArray31[local138] = true;
												Static131.anIntArray379[local138] = local142;
												Static114.anIntArray348[local138] = local160;
												Static274.anIntArray693[local138] = local162;
												Static14.anIntArray35[local138] = local513;
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 53) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2731();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2784();
											if (Static256.method4311(local160)) {
												Static318.method468(local134, local138 + (local142 << 16));
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 97) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2767();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
											if (local138 == 65535) {
												local138 = -1;
											}
											local142 = Static200.aClass7_Sub3_Sub2_3.method2784();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2739();
											if (local160 == 65535) {
												local160 = -1;
											}
											local162 = Static200.aClass7_Sub3_Sub2_3.method2731();
											if (Static256.method4311(local142)) {
												for (local513 = local138; local513 <= local160; local513++) {
													local3380 = ((long) local162 << 32) + (long) local513;
													local3386 = (Class7_Sub27) Static247.aClass10_41.method163(local3380);
													if (local3386 != null) {
														local3401 = new Class7_Sub27(local134, local3386.anInt4220);
														local3386.method5648();
													} else if (local513 == -1) {
														local3401 = new Class7_Sub27(local134, Static245.method4231(local162).aClass7_Sub27_1.anInt4220);
													} else {
														local3401 = new Class7_Sub27(local134, -1);
													}
													Static247.aClass10_41.method161(local3380, local3401);
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 152) {
											local1752 = Static200.aClass7_Sub3_Sub2_3.method2782();
											local1011 = Static16.method2771(Static89.method1859(Static235.method4085(Static200.aClass7_Sub3_Sub2_3)));
											Static50.method1093(local1752, 6, 0, local1752, local1011);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 113) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2784();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2763();
											@Pc(4852) Class22_Sub2_Sub1_Sub2 local4852 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local134];
											if (local4852 != null) {
												Static103.method2049(local4852, local142, local138);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 238) {
											Static305.anInt5838 = Static200.aClass7_Sub3_Sub2_3.method2772();
											Static13.anInt265 = Static200.aClass7_Sub3_Sub2_3.method2763();
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 3) {
											for (local134 = 0; local134 < Static157.aClass22_Sub2_Sub1_Sub1Array1.length; local134++) {
												if (Static157.aClass22_Sub2_Sub1_Sub1Array1[local134] != null) {
													Static157.aClass22_Sub2_Sub1_Sub1Array1[local134].anInt5133 = -1;
												}
											}
											for (local138 = 0; local138 < Static69.aClass22_Sub2_Sub1_Sub2Array1.length; local138++) {
												if (Static69.aClass22_Sub2_Sub1_Sub2Array1[local138] != null) {
													Static69.aClass22_Sub2_Sub1_Sub2Array1[local138].anInt5133 = -1;
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 39) {
											Static192.method3461();
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 180) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2739();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2767();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2736();
											if (Static256.method4311(local134)) {
												Static316.method5132(local138, local142);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 163) {
											Static41.method881(true);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 60) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2739();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
											@Pc(4986) byte local4986 = Static200.aClass7_Sub3_Sub2_3.method2757();
											if (Static256.method4311(local134)) {
												Static151.method2963(local4986, local138);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 197) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2767();
											if (Static256.method4311(local134)) {
												@Pc(5020) Class7_Sub17 local5020 = (Class7_Sub17) Static247.aClass10_40.method163((long) local138);
												if (local5020 != null) {
													Static89.method1858(true, false, local5020);
												}
												if (Static165.aClass26_19 != null) {
													Static245.method4226(Static165.aClass26_19);
													Static165.aClass26_19 = null;
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 19) {
											Static348.anInt6562 = Static200.aClass7_Sub3_Sub2_3.method2772();
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 94) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local162 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local513 = Static200.aClass7_Sub3_Sub2_3.method2772();
											if (Static256.method4311(local134)) {
												Static5.method65(local162, local142, local160, local138, local513);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 198) {
											Static111.method2153(Static200.aClass7_Sub3_Sub2_3, Static54.anInt1421, Static116.aClass21_4);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 112) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2732();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2767();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local225 = "";
											local229 = local225;
											if ((local142 & 0x1) != 0) {
												local225 = Static200.aClass7_Sub3_Sub2_3.method2782();
												if ((local142 & 0x2) == 0) {
													local229 = local225;
												} else {
													local229 = Static200.aClass7_Sub3_Sub2_3.method2782();
												}
											}
											local233 = Static200.aClass7_Sub3_Sub2_3.method2782();
											if (local134 == 99) {
												Static59.method1195(local233);
											} else if (local229.equals("") || !Static271.method4521(local229)) {
												Static50.method1093(local229, local134, local138, local225, local233);
											} else {
												Static127.anInt2797 = -1;
												return true;
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 89) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2776();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2736();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2794();
											if (Static256.method4311(local138)) {
												Static78.method5349(local134, local142);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 46) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2784();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2767();
											Static301.method4875(local138, local134);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 133) {
											if (Static161.anInt3337 != -1) {
												Static325.method5214(0, Static161.anInt3337);
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 200) {
											local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
											local1011 = Static200.aClass7_Sub3_Sub2_3.method2782();
											local221 = local1011;
											if (local1007) {
												local221 = Static200.aClass7_Sub3_Sub2_3.method2782();
											}
											local1023 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local1028 = Static200.aClass7_Sub3_Sub2_3.method2791();
											local521 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local525 = Static200.aClass7_Sub3_Sub2_3.method2764();
											@Pc(5298) long local5298 = local1028 + (local1023 << 32);
											@Pc(5300) boolean local5300 = false;
											@Pc(5302) int local5302 = 0;
											while (true) {
												if (local5302 >= 100) {
													if (local521 <= 1 && Static271.method4521(local221)) {
														local5300 = true;
													}
													break;
												}
												if (Static52.aLongArray2[local5302] == local5298) {
													local5300 = true;
													break;
												}
												local5302++;
											}
											if (!local5300 && Static320.anInt6124 == 0) {
												Static52.aLongArray2[Static32.anInt714] = local5298;
												Static32.anInt714 = (Static32.anInt714 + 1) % 100;
												local2937 = Static259.method4353(local525).method98(Static200.aClass7_Sub3_Sub2_3);
												if (local521 == 2) {
													Static338.method5381("<img=1>" + local1011, local2937, 0, "<img=1>" + local221, 18, null, local525);
												} else if (local521 == 1) {
													Static338.method5381("<img=0>" + local1011, local2937, 0, "<img=0>" + local221, 18, null, local525);
												} else {
													Static338.method5381(local1011, local2937, 0, local221, 18, null, local525);
												}
											}
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 48) {
											if (Static342.aFrame2 != null) {
												Static216.method3821(false, -1, Static6.anInt126, -1);
											}
											@Pc(5434) byte[] local5434 = new byte[Static54.anInt1421];
											Static200.aClass7_Sub3_Sub2_3.method2803(Static54.anInt1421, local5434);
											local1011 = Static74.method1483(local5434, Static54.anInt1421, 0);
											Static59.method1193(local1011, true, Static329.anInt6220 == 1, Static116.aClass21_4);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 249) {
											local134 = Static200.aClass7_Sub3_Sub2_3.method2764();
											if (local134 == 65535) {
												local134 = -1;
											}
											local138 = Static200.aClass7_Sub3_Sub2_3.method2772();
											local142 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2772();
											Static72.method1408(local138, local160, local142, local134);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 170) {
											local1752 = Static200.aClass7_Sub3_Sub2_3.method2782();
											local138 = Static200.aClass7_Sub3_Sub2_3.method2764();
											local221 = Static259.method4353(local138).method98(Static200.aClass7_Sub3_Sub2_3);
											Static338.method5381(local1752, local221, 0, local1752, 19, null, local138);
											Static127.anInt2797 = -1;
											return true;
										} else if (Static127.anInt2797 == 217) {
											Static337.anInt6357 = Static34.anInt776;
											if (Static54.anInt1421 == 0) {
												Static127.anInt2797 = -1;
												Static275.aClass115Array1 = null;
												Static316.aString392 = null;
												Static228.aString286 = null;
												Static129.anInt2833 = 0;
												return true;
											}
											Static228.aString286 = Static200.aClass7_Sub3_Sub2_3.method2782();
											local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
											if (local1007) {
												Static200.aClass7_Sub3_Sub2_3.method2782();
											}
											@Pc(5572) long local5572 = Static200.aClass7_Sub3_Sub2_3.method2790();
											Static316.aString392 = Static180.method3309(local5572);
											Static277.aByte62 = Static200.aClass7_Sub3_Sub2_3.method2779();
											local160 = Static200.aClass7_Sub3_Sub2_3.method2772();
											if (local160 == 255) {
												Static127.anInt2797 = -1;
												return true;
											}
											Static129.anInt2833 = local160;
											@Pc(5598) Class115[] local5598 = new Class115[100];
											for (local513 = 0; local513 < Static129.anInt2833; local513++) {
												local5598[local513] = new Class115();
												local5598[local513].aString214 = Static200.aClass7_Sub3_Sub2_3.method2782();
												local1007 = Static200.aClass7_Sub3_Sub2_3.method2772() == 1;
												if (local1007) {
													local5598[local513].aString213 = Static200.aClass7_Sub3_Sub2_3.method2782();
												} else {
													local5598[local513].aString213 = local5598[local513].aString214;
												}
												local5598[local513].anInt3288 = Static200.aClass7_Sub3_Sub2_3.method2764();
												local5598[local513].aByte41 = Static200.aClass7_Sub3_Sub2_3.method2779();
												local5598[local513].aString215 = Static200.aClass7_Sub3_Sub2_3.method2782();
												if (local5598[local513].aString213.equals(Static252.aClass22_Sub2_Sub1_Sub1_4.aString78)) {
													Static21.aByte8 = local5598[local513].aByte41;
												}
											}
											local525 = Static129.anInt2833;
											while (local525 > 0) {
												local2720 = true;
												local525--;
												for (local1037 = 0; local1037 < local525; local1037++) {
													if (local5598[local1037].aString214.compareTo(local5598[local1037 + 1].aString214) > 0) {
														local1798 = local5598[local1037];
														local5598[local1037] = local5598[local1037 + 1];
														local2720 = false;
														local5598[local1037 + 1] = local1798;
													}
												}
												if (local2720) {
													break;
												}
											}
											Static127.anInt2797 = -1;
											Static275.aClass115Array1 = local5598;
											return true;
										} else {
											Static46.method1056("T1 - " + Static127.anInt2797 + "," + Static54.anInt1422 + "," + Static196.anInt3868 + " - " + Static54.anInt1421, null);
											Static258.method4344();
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

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILclient!bi;)V")
	public static void method2990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26 arg2) {
		Static94.anInt2318 = arg0;
		Static107.aClass26_12 = arg2;
		Static238.anInt4712 = arg1;
	}
}
