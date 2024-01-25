import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
	public static int anInt3944;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Lclient!pc;")
	public static Class188 aClass188_55;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "[I")
	public static final int[] anIntArray260 = new int[32];

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "F")
	public static float aFloat130 = 0.0F;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray17 = new String[100];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ok;Z)V")
	public static void method3162(@OriginalArg(0) Class180 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(37) int local37;
		@Pc(44) int local44;
		if (Static401.aClass180_14 == arg0) {
			local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
			local16 = local12 >> 2;
			local20 = local12 & 0x3;
			local24 = Static104.anIntArray128[local16];
			local28 = Static426.aClass2_Sub20_Sub1_2.method3737();
			local37 = Static198.anInt3847 + (local28 >> 4 & 0x7);
			local44 = Static240.anInt4514 + (local28 & 0x7);
			if (Static22.method294(Static200.anInt7590) || local37 >= 0 && local44 >= 0 && local37 < Static81.anInt1950 && local44 < Static171.anInt3288) {
				Static149.method2214(-1, Static97.anInt2178, local20, local24, local44, local37, local16);
			}
		} else if (Static205.aClass180_8 == arg0) {
			Static426.aClass2_Sub20_Sub1_2.method3737();
			local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
			local16 = Static198.anInt3847 + (local12 >> 4 & 0x7);
			local20 = Static240.anInt4514 + (local12 & 0x7);
			local24 = Static426.aClass2_Sub20_Sub1_2.method3711();
			local28 = Static426.aClass2_Sub20_Sub1_2.method3737();
			local37 = Static426.aClass2_Sub20_Sub1_2.method3748();
			@Pc(121) String local121 = Static426.aClass2_Sub20_Sub1_2.method3717();
			Static132.method1916(local121, local20, local16, local28, local37, Static97.anInt2178, local24);
		} else {
			@Pc(181) int local181;
			@Pc(185) int local185;
			@Pc(199) int local199;
			if (arg0 == Static389.aClass180_13) {
				local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
				local16 = (local12 >> 4 & 0x7) + Static198.anInt3847;
				local20 = (local12 & 0x7) + Static240.anInt4514;
				local24 = Static426.aClass2_Sub20_Sub1_2.method3711();
				if (local24 == 65535) {
					local24 = -1;
				}
				local28 = Static426.aClass2_Sub20_Sub1_2.method3737();
				local37 = local28 >> 4 & 0xF;
				local44 = local28 & 0x7;
				local181 = Static426.aClass2_Sub20_Sub1_2.method3737();
				local185 = Static426.aClass2_Sub20_Sub1_2.method3737();
				if (local16 >= 0 && local20 >= 0 && local16 < Static81.anInt1950 && local20 < Static171.anInt3288) {
					local199 = local37 + 1;
					if (Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0] >= local16 - local199 && local199 + local16 >= Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0] && Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0] >= local20 - local199 && Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0] <= local20 + local199) {
						Static318.method4554(local181, local24, local185, local37 + (local20 << 8) + (local16 << 16) + (Static97.anInt2178 << 24), local44);
					}
				}
			} else {
				@Pc(332) int local332;
				@Pc(336) int local336;
				@Pc(340) int local340;
				@Pc(351) int local351;
				@Pc(295) boolean local295;
				@Pc(440) Class4_Sub2_Sub5 local440;
				if (arg0 == Static106.aClass180_5) {
					local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
					local16 = (local12 >> 4 & 0xF) + Static198.anInt3847 * 2;
					local20 = Static240.anInt4514 * 2 + (local12 & 0xF);
					local295 = Static426.aClass2_Sub20_Sub1_2.method3737() != 0;
					local28 = Static426.aClass2_Sub20_Sub1_2.method3693() + local16;
					local37 = local20 + Static426.aClass2_Sub20_Sub1_2.method3693();
					local44 = Static426.aClass2_Sub20_Sub1_2.method3701();
					local181 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local185 = Static426.aClass2_Sub20_Sub1_2.method3737() * 4;
					local199 = Static426.aClass2_Sub20_Sub1_2.method3737() * 4;
					local332 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local336 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local340 = Static426.aClass2_Sub20_Sub1_2.method3737();
					if (local340 == 255) {
						local340 = -1;
					}
					local351 = Static426.aClass2_Sub20_Sub1_2.method3737();
					if (local16 >= 0 && local20 >= 0 && Static81.anInt1950 * 2 > local16 && local20 < Static81.anInt1950 * 2 && local28 >= 0 && local37 >= 0 && local28 < Static171.anInt3288 * 2 && Static171.anInt3288 * 2 > local37 && local181 != 65535) {
						local20 = local20 * 64;
						local28 *= 64;
						local16 = local16 * 64;
						local199 <<= 0x0;
						local37 *= 64;
						local185 <<= 0x0;
						local440 = new Class4_Sub2_Sub5(local181, Static97.anInt2178, local16, local20, local185, Static164.anInt3206 + local332, Static164.anInt3206 + local336, local340, local351, local44, local199, local295);
						local440.method5183(Static164.anInt3206 + local332, -local199 + Static66.method1200(Static97.anInt2178, local28, local37), local37, local28);
						Static411.aClass265_50.method5999(new Class2_Sub2_Sub1(local440));
					}
				} else if (arg0 == Static233.aClass180_9) {
					local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
					local16 = (local12 >> 4 & 0x7) + Static198.anInt3847;
					local20 = Static240.anInt4514 + (local12 & 0x7);
					local24 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local28 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local37 = Static426.aClass2_Sub20_Sub1_2.method3711();
					if (Static383.aClass240_34 != null && local16 >= 0 && local20 >= 0 && local16 < Static81.anInt1950 && local20 < Static171.anInt3288) {
						@Pc(532) Class2_Sub21 local532 = (Class2_Sub21) Static383.aClass240_34.method5439((long) (Static97.anInt2178 << 28 | local20 << 14 | local16));
						if (local532 != null) {
							for (@Pc(540) Class2_Sub45 local540 = (Class2_Sub45) local532.aClass265_28.method6005(); local540 != null; local540 = (Class2_Sub45) local532.aClass265_28.method6001()) {
								if (local540.anInt7831 == (local24 & 0x7FFF) && local28 == local540.anInt7832) {
									local540.method6072();
									local540.anInt7832 = local37;
									Static452.method6083(local540, local16, local20, Static97.anInt2178);
									break;
								}
							}
							Static61.method1209(Static97.anInt2178, local16, local20);
						}
					}
				} else if (Static325.aClass180_12 == arg0) {
					local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
					local16 = (local12 >> 4 & 0x7) + Static198.anInt3847;
					local20 = Static240.anInt4514 + (local12 & 0x7);
					local24 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local28 = Static426.aClass2_Sub20_Sub1_2.method3737();
					local37 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local44 = Static426.aClass2_Sub20_Sub1_2.method3737();
					if (local16 >= 0 && local20 >= 0 && local16 < Static81.anInt1950 && Static171.anInt3288 > local20) {
						local181 = local16 * 128 + 64;
						local185 = local20 * 128 + 64;
						local199 = Static97.anInt2178;
						if (local199 < 3 && Static173.method2713(local20, local16)) {
							local199++;
						}
						@Pc(698) Class4_Sub2_Sub6 local698 = new Class4_Sub2_Sub6(local24, local37, Static164.anInt3206, Static97.anInt2178, local199, local181, Static66.method1200(Static97.anInt2178, local181, local185) - local28, local185, local16, local16, local20, local20, local44);
						Static422.aClass265_51.method5999(new Class2_Sub2_Sub5(local698));
					}
				} else if (Static303.aClass180_11 == arg0) {
					local12 = Static426.aClass2_Sub20_Sub1_2.method3739();
					local16 = Static198.anInt3847 + (local12 >> 4 & 0x7);
					local20 = Static240.anInt4514 + (local12 & 0x7);
					local24 = Static426.aClass2_Sub20_Sub1_2.method3739();
					local28 = local24 >> 2;
					local37 = local24 & 0x3;
					local44 = Static104.anIntArray128[local28];
					local181 = Static426.aClass2_Sub20_Sub1_2.method3711();
					if (local181 == 65535) {
						local181 = -1;
					}
					Static16.method238(local181, local28, local20, local16, Static97.anInt2178, local37, local44);
				} else {
					@Pc(809) byte local809;
					if (arg0 == Static120.aClass180_6) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3701();
						local16 = Static426.aClass2_Sub20_Sub1_2.method3706();
						local20 = Static426.aClass2_Sub20_Sub1_2.method3711();
						@Pc(785) byte local785 = Static426.aClass2_Sub20_Sub1_2.method3693();
						@Pc(789) byte local789 = Static426.aClass2_Sub20_Sub1_2.method3693();
						local37 = Static426.aClass2_Sub20_Sub1_2.method3739();
						local44 = local37 >> 2;
						local181 = local37 & 0x3;
						local185 = Static426.aClass2_Sub20_Sub1_2.method3744();
						local809 = Static426.aClass2_Sub20_Sub1_2.method3693();
						local332 = Static426.aClass2_Sub20_Sub1_2.method3739();
						local336 = Static198.anInt3847 + (local332 >> 4 & 0x7);
						local340 = (local332 & 0x7) + Static240.anInt4514;
						@Pc(831) byte local831 = Static426.aClass2_Sub20_Sub1_2.method3730();
						if (!Static387.aClass26_9.method2261()) {
							Static14.method227(local181, local12, local336, local185, local44, local809, local20, local789, local16, local340, local785, Static97.anInt2178, local831);
						}
					} else if (Static452.aClass180_16 == arg0) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3732();
						local16 = Static426.aClass2_Sub20_Sub1_2.method3721();
						local20 = (local16 >> 4 & 0x7) + Static198.anInt3847;
						local24 = Static240.anInt4514 + (local16 & 0x7);
						if (local20 >= 0 && local24 >= 0 && Static81.anInt1950 > local20 && Static171.anInt3288 > local24) {
							@Pc(914) Class2_Sub21 local914 = (Class2_Sub21) Static383.aClass240_34.method5439((long) (Static97.anInt2178 << 28 | local24 << 14 | local20));
							if (local914 != null) {
								for (@Pc(922) Class2_Sub45 local922 = (Class2_Sub45) local914.aClass265_28.method6005(); local922 != null; local922 = (Class2_Sub45) local914.aClass265_28.method6001()) {
									if ((local12 & 0x7FFF) == local922.anInt7831) {
										local922.method6072();
										break;
									}
								}
								if (local914.aClass265_28.method5997()) {
									local914.method6072();
								}
								Static61.method1209(Static97.anInt2178, local20, local24);
							}
						}
					} else if (Static72.aClass180_7 == arg0) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
						@Pc(975) boolean local975 = (local12 & 0x80) != 0;
						local20 = (local12 >> 3 & 0x7) + Static198.anInt3847;
						local24 = Static240.anInt4514 + (local12 & 0x7);
						local28 = Static426.aClass2_Sub20_Sub1_2.method3693() + local20;
						local37 = local24 + Static426.aClass2_Sub20_Sub1_2.method3693();
						local44 = Static426.aClass2_Sub20_Sub1_2.method3701();
						local181 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local185 = Static426.aClass2_Sub20_Sub1_2.method3737() * 4;
						local199 = Static426.aClass2_Sub20_Sub1_2.method3737() * 4;
						local332 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local336 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local340 = Static426.aClass2_Sub20_Sub1_2.method3737();
						local351 = Static426.aClass2_Sub20_Sub1_2.method3737();
						if (local340 == 255) {
							local340 = -1;
						}
						if (local20 >= 0 && local24 >= 0 && local20 < Static81.anInt1950 && Static171.anInt3288 > local24 && local28 >= 0 && local37 >= 0 && local28 < Static81.anInt1950 && local37 < Static171.anInt3288 && local181 != 65535) {
							local28 = local28 * 128 + 64;
							local199 <<= 0x0;
							local20 = local20 * 128 + 64;
							local37 = local37 * 128 + 64;
							local24 = local24 * 128 + 64;
							local185 <<= 0x0;
							local440 = new Class4_Sub2_Sub5(local181, Static97.anInt2178, local20, local24, local185, Static164.anInt3206 + local332, local336 - -Static164.anInt3206, local340, local351, local44, local199, local975);
							local440.method5183(Static164.anInt3206 + local332, -local199 + Static66.method1200(Static97.anInt2178, local28, local37), local37, local28);
							Static411.aClass265_50.method5999(new Class2_Sub2_Sub1(local440));
						}
					} else if (arg0 == Static26.aClass180_1) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3706();
						local16 = Static426.aClass2_Sub20_Sub1_2.method3744();
						local20 = Static426.aClass2_Sub20_Sub1_2.method3721();
						local24 = (local20 >> 4 & 0x7) + Static198.anInt3847;
						local28 = (local20 & 0x7) + Static240.anInt4514;
						if (local24 >= 0 && local28 >= 0 && local24 < Static81.anInt1950 && Static171.anInt3288 > local28) {
							Static452.method6083(new Class2_Sub45(local12, local16), local24, local28, Static97.anInt2178);
							Static61.method1209(Static97.anInt2178, local24, local28);
						}
					} else if (arg0 == Static444.aClass180_15) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3737();
						local16 = (local12 >> 4 & 0xF) + Static198.anInt3847 * 2;
						local20 = Static240.anInt4514 * 2 + (local12 & 0xF);
						local295 = Static426.aClass2_Sub20_Sub1_2.method3737() != 0;
						local28 = Static426.aClass2_Sub20_Sub1_2.method3693() + local16;
						local37 = Static426.aClass2_Sub20_Sub1_2.method3693() + local20;
						local44 = Static426.aClass2_Sub20_Sub1_2.method3701();
						local181 = Static426.aClass2_Sub20_Sub1_2.method3701();
						local185 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local809 = Static426.aClass2_Sub20_Sub1_2.method3693();
						local332 = Static426.aClass2_Sub20_Sub1_2.method3737() * 4;
						local336 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local340 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local351 = Static426.aClass2_Sub20_Sub1_2.method3737();
						if (local351 == 255) {
							local351 = -1;
						}
						@Pc(1311) int local1311 = Static426.aClass2_Sub20_Sub1_2.method3737();
						if (local16 >= 0 && local20 >= 0 && Static81.anInt1950 * 2 > local16 && local20 < Static81.anInt1950 * 2 && local28 >= 0 && local37 >= 0 && local28 < Static171.anInt3288 * 2 && local37 < Static171.anInt3288 * 2 && local185 != 65535) {
							local37 *= 64;
							local20 = local20 * 64;
							local332 <<= 0x0;
							local16 = local16 * 64;
							local199 = local809 << 0;
							local28 = local28 * 64;
							if (local44 != 0) {
								@Pc(1401) int local1401;
								@Pc(1416) Class4_Sub2_Sub2 local1416;
								@Pc(1395) int local1395;
								@Pc(1405) int local1405;
								if (local44 < 0) {
									local1395 = -local44 - 1;
									local1401 = local1395 >> 11 & 0xF;
									local1405 = local1395 & 0x7FF;
									if (Static393.anInt6881 == local1405) {
										local1416 = Static231.aClass4_Sub2_Sub2_Sub1_2;
									} else {
										local1416 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local1405];
									}
								} else {
									local1395 = local44 - 1;
									local1405 = local1395 & 0x7FF;
									local1401 = local1395 >> 11 & 0xF;
									local1416 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local1405];
								}
								if (local1416 != null) {
									@Pc(1446) Class12 local1446 = local1416.method5131();
									if (local1446.anIntArrayArray2 != null && local1446.anIntArrayArray2[local1401] != null) {
										local1405 = local1446.anIntArrayArray2[local1401][0];
										@Pc(1468) int local1468 = local1446.anIntArrayArray2[local1401][2];
										@Pc(1473) int local1473 = local1416.aClass157_7.method3616();
										@Pc(1477) int local1477 = Class184.anIntArray349[local1473];
										@Pc(1481) int local1481 = Class184.anIntArray350[local1473];
										@Pc(1491) int local1491 = local1405 * local1481 + local1468 * local1477 >> 15;
										@Pc(1502) int local1502 = local1481 * local1468 - local1405 * local1477 >> 15;
										local20 += local1502;
										local199 -= local1446.anIntArrayArray2[local1401][1];
										local16 += local1491;
									}
								}
							}
							@Pc(1542) Class4_Sub2_Sub5 local1542 = new Class4_Sub2_Sub5(local185, Static97.anInt2178, local16, local20, local199, local336 + Static164.anInt3206, Static164.anInt3206 + local340, local351, local1311, local181, local332, local295);
							local1542.method5183(Static164.anInt3206 + local336, Static66.method1200(Static97.anInt2178, local28, local37) + -local332, local37, local28);
							Static411.aClass265_50.method5999(new Class2_Sub2_Sub1(local1542));
						}
					} else if (Static246.aClass180_10 == arg0) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local16 = Static426.aClass2_Sub20_Sub1_2.method3737();
						Static406.aClass150_3.method3508(local12).method5586(local16);
					} else if (arg0 == Static43.aClass180_2) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3739();
						local16 = (local12 >> 4 & 0x7) + Static198.anInt3847;
						local20 = (local12 & 0x7) + Static240.anInt4514;
						local24 = Static426.aClass2_Sub20_Sub1_2.method3721();
						local28 = local24 >> 2;
						local37 = local24 & 0x3;
						local44 = Static104.anIntArray128[local28];
						local181 = Static426.aClass2_Sub20_Sub1_2.method3744();
						if (Static22.method294(Static200.anInt7590) || local16 >= 0 && local20 >= 0 && Static81.anInt1950 > local16 && Static171.anInt3288 > local20) {
							Static149.method2214(local181, Static97.anInt2178, local37, local44, local20, local16, local28);
						}
					} else if (arg0 == Static48.aClass180_3) {
						local12 = Static426.aClass2_Sub20_Sub1_2.method3739();
						local16 = (local12 >> 4 & 0x7) + Static198.anInt3847;
						local20 = (local12 & 0x7) + Static240.anInt4514;
						local24 = Static426.aClass2_Sub20_Sub1_2.method3732();
						local28 = Static426.aClass2_Sub20_Sub1_2.method3732();
						local37 = Static426.aClass2_Sub20_Sub1_2.method3706();
						if (local16 >= 0 && local20 >= 0 && Static81.anInt1950 > local16 && local20 < Static171.anInt3288 && local24 != Static393.anInt6881) {
							Static452.method6083(new Class2_Sub45(local28, local37), local16, local20, Static97.anInt2178);
							Static61.method1209(Static97.anInt2178, local16, local20);
						}
					} else {
						Static80.method1410(null, "T3 - " + arg0);
						Static89.method1492();
					}
				}
			}
		}
	}
}
