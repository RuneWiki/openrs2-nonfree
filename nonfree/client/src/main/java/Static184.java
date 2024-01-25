import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
	public static int anInt3731;

	@OriginalMember(owner = "client!lk", name = "R", descriptor = "I")
	public static int anInt3734;

	@OriginalMember(owner = "client!lk", name = "I", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_104 = new Class21(200);

	@OriginalMember(owner = "client!lk", name = "L", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_129 = new Class217(101, 8);

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_130 = new Class217(62, 7);

	@OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
	public static int anInt3735 = 0;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!il;B)V")
	public static void method3479(@OriginalArg(0) Class93 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(36) int local36;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(62) int local62;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(78) int local78;
		@Pc(184) Class11_Sub2_Sub4 local184;
		@Pc(42) int local42;
		@Pc(46) int local46;
		if (arg0 == Static230.aClass93_10) {
			local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
			local22 = (local12 >> 4 & 0xF) + Static35.anInt921 * 2;
			local30 = (local12 & 0xF) + Static42.anInt1017 * 2;
			local36 = local22 + Static180.aClass1_Sub7_Sub2_2.method2122();
			local42 = local30 + Static180.aClass1_Sub7_Sub2_2.method2122();
			local46 = Static180.aClass1_Sub7_Sub2_2.method2141();
			local50 = Static180.aClass1_Sub7_Sub2_2.method2161();
			local56 = Static180.aClass1_Sub7_Sub2_2.method2132() * 4;
			local62 = Static180.aClass1_Sub7_Sub2_2.method2132() * 4;
			local66 = Static180.aClass1_Sub7_Sub2_2.method2161();
			local70 = Static180.aClass1_Sub7_Sub2_2.method2161();
			local74 = Static180.aClass1_Sub7_Sub2_2.method2132();
			local78 = Static180.aClass1_Sub7_Sub2_2.method2132();
			if (local74 == 255) {
				local74 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && local22 < Static311.anInt5653 * 2 && local30 < Static311.anInt5653 * 2 && local36 >= 0 && local42 >= 0 && local36 < Static189.anInt3820 * 2 && Static189.anInt3820 * 2 > local42 && local50 != 65535) {
				local36 = local36 * 64;
				local42 = local42 * 64;
				local30 = local30 * 64;
				local22 = local22 * 64;
				local184 = new Class11_Sub2_Sub4(local50, Static338.anInt6437, local22, local30, Static8.method288(Static338.anInt6437, local22, local30) - local56, Static51.anInt1301 + local66, local70 + Static51.anInt1301, local74, local78, local46, local62);
				local184.method4319(local66 + Static51.anInt1301, local42, Static8.method288(Static338.anInt6437, local36, local42) - local62, local36);
				Static356.aClass42_46.method1549(new Class1_Sub4_Sub5(local184));
			}
		} else if (arg0 == Static138.aClass93_12) {
			local12 = Static180.aClass1_Sub7_Sub2_2.method2113();
			local22 = (local12 >> 4 & 0x7) + Static35.anInt921;
			local30 = Static42.anInt1017 + (local12 & 0x7);
			local36 = Static180.aClass1_Sub7_Sub2_2.method2135();
			local42 = local36 >> 2;
			local46 = local36 & 0x3;
			local50 = Static253.anIntArray397[local42];
			local56 = Static180.aClass1_Sub7_Sub2_2.method2130();
			if (local22 >= 0 && local30 >= 0 && local22 < Static311.anInt5653 && Static189.anInt3820 > local30) {
				Static40.method950(local22, local56, local30, local46, local50, Static338.anInt6437, local42);
			}
		} else if (arg0 == Static27.aClass93_5) {
			local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
			local22 = Static35.anInt921 + (local12 >> 4 & 0x7);
			local30 = Static42.anInt1017 + (local12 & 0x7);
			local36 = Static180.aClass1_Sub7_Sub2_2.method2161();
			if (local36 == 65535) {
				local36 = -1;
			}
			local42 = Static180.aClass1_Sub7_Sub2_2.method2132();
			local46 = local42 >> 4 & 0xF;
			local50 = local42 & 0x7;
			local56 = Static180.aClass1_Sub7_Sub2_2.method2132();
			local62 = Static180.aClass1_Sub7_Sub2_2.method2132();
			if (local22 >= 0 && local30 >= 0 && local22 < Static311.anInt5653 && Static189.anInt3820 > local30) {
				local66 = local46 + 1;
				if (local22 - local66 <= Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0] && local22 + local66 >= Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0] && local30 - local66 <= Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0] && local66 + local30 >= Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0] && Static105.anInt2415 != 0 && local50 > 0 && Static116.anInt2537 < 50 && local36 != -1) {
					Static189.anIntArray288[Static116.anInt2537] = local36;
					Static123.anIntArray198[Static116.anInt2537] = local50;
					Static38.anIntArray61[Static116.anInt2537] = local56;
					Static83.aClass65Array1[Static116.anInt2537] = null;
					Static155.anIntArray232[Static116.anInt2537] = local46 + (Static338.anInt6437 << 24) - (-(local22 << 16) - (local30 << 8));
					Static81.anIntArray144[Static116.anInt2537] = local62;
					Static116.anInt2537++;
				}
			}
		} else {
			@Pc(527) int local527;
			if (arg0 == Static306.aClass93_18) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = (local12 >> 4 & 0xF) + Static35.anInt921 * 2;
				local30 = Static42.anInt1017 * 2 + (local12 & 0xF);
				local36 = local22 + Static180.aClass1_Sub7_Sub2_2.method2122();
				local42 = local30 + Static180.aClass1_Sub7_Sub2_2.method2122();
				local46 = Static180.aClass1_Sub7_Sub2_2.method2141();
				local50 = Static180.aClass1_Sub7_Sub2_2.method2141();
				local56 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local62 = Static180.aClass1_Sub7_Sub2_2.method2122();
				local66 = Static180.aClass1_Sub7_Sub2_2.method2132() * 4;
				local70 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local74 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local78 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local527 = Static180.aClass1_Sub7_Sub2_2.method2132();
				if (local78 == 255) {
					local78 = -1;
				}
				if (local22 >= 0 && local30 >= 0 && Static311.anInt5653 * 2 > local22 && Static311.anInt5653 * 2 > local30 && local36 >= 0 && local42 >= 0 && Static189.anInt3820 * 2 > local36 && local42 < Static189.anInt3820 * 2 && local56 != 65535) {
					local36 *= 64;
					local30 *= 64;
					local22 = local22 * 64;
					local42 *= 64;
					if (local46 != 0) {
						@Pc(600) int local600;
						@Pc(615) Class11_Sub2_Sub6 local615;
						@Pc(594) int local594;
						@Pc(604) int local604;
						if (local46 < 0) {
							local594 = -local46 - 1;
							local600 = local594 >> 11 & 0xF;
							local604 = local594 & 0x7FF;
							if (Static352.anInt1802 == local604) {
								local615 = Static191.aClass11_Sub2_Sub6_Sub1_4;
							} else {
								local615 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local604];
							}
						} else {
							local594 = local46 - 1;
							local604 = local594 & 0x7FF;
							local600 = local594 >> 11 & 0xF;
							local615 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local604];
						}
						if (local615 != null) {
							@Pc(645) Class67 local645 = local615.method5898();
							if (local645.anIntArrayArray18 != null && local645.anIntArrayArray18[local600] != null) {
								local604 = local645.anIntArrayArray18[local600][0];
								@Pc(667) int local667 = local645.anIntArrayArray18[local600][2];
								@Pc(672) int local672 = local615.aClass223_7.method6057();
								@Pc(676) int local676 = Class208.anIntArray479[local672];
								@Pc(680) int local680 = Class208.anIntArray478[local672];
								@Pc(691) int local691 = local676 * local667 + local680 * local604 >> 15;
								@Pc(702) int local702 = local667 * local680 - local604 * local676 >> 15;
								local22 += local691;
								local30 += local702;
								local62 -= local645.anIntArrayArray18[local600][1];
							}
						}
					}
					@Pc(747) Class11_Sub2_Sub4 local747 = new Class11_Sub2_Sub4(local56, Static338.anInt6437, local22, local30, Static8.method288(Static338.anInt6437, local22, local30) - local62, Static51.anInt1301 + local70, Static51.anInt1301 + local74, local78, local527, local50, local66);
					local747.method4319(local70 + Static51.anInt1301, local42, Static8.method288(Static338.anInt6437, local36, local42) - local66, local36);
					Static356.aClass42_46.method1549(new Class1_Sub4_Sub5(local747));
				}
			} else if (Static260.aClass93_14 == arg0) {
				Static180.aClass1_Sub7_Sub2_2.method2132();
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = Static35.anInt921 + (local12 >> 4 & 0x7);
				local30 = Static42.anInt1017 + (local12 & 0x7);
				local36 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local42 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local46 = Static180.aClass1_Sub7_Sub2_2.method2119();
				@Pc(813) String local813 = Static180.aClass1_Sub7_Sub2_2.method2109();
				Static157.method2977(local42, local36, Static338.anInt6437, local46, local22, local813, local30);
			} else if (Static289.aClass93_16 == arg0) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = Static35.anInt921 + (local12 >> 4 & 0x7);
				local30 = (local12 & 0x7) + Static42.anInt1017;
				local36 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local42 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local46 = Static180.aClass1_Sub7_Sub2_2.method2161();
				if (Static46.aClass38_4 != null && local22 >= 0 && local30 >= 0 && Static311.anInt5653 > local22 && local30 < Static189.anInt3820) {
					@Pc(888) Class1_Sub3 local888 = (Class1_Sub3) Static46.aClass38_4.method1475((long) (Static338.anInt6437 << 28 | local30 << 14 | local22));
					if (local888 != null) {
						for (@Pc(896) Class1_Sub23 local896 = (Class1_Sub23) local888.aClass42_1.method1543(); local896 != null; local896 = (Class1_Sub23) local888.aClass42_1.method1551()) {
							if (local896.anInt2967 == (local36 & 0x7FFF) && local896.anInt2968 == local42) {
								local896.method6045();
								local896.anInt2968 = local46;
								Static90.method1925(local22, local896, local30, Static338.anInt6437);
								break;
							}
						}
						Static287.method5073(local22, local30, Static338.anInt6437);
					}
				}
			} else if (arg0 == Static25.aClass93_7) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2123();
				local22 = Static180.aClass1_Sub7_Sub2_2.method2139();
				local30 = Static180.aClass1_Sub7_Sub2_2.method2139();
				local36 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local42 = (local36 >> 4 & 0x7) + Static35.anInt921;
				local46 = (local36 & 0x7) + Static42.anInt1017;
				if (local42 >= 0 && local46 >= 0 && local42 < Static311.anInt5653 && local46 < Static189.anInt3820 && Static352.anInt1802 != local12) {
					Static90.method1925(local42, new Class1_Sub23(local22, local30), local46, Static338.anInt6437);
					Static287.method5073(local42, local46, Static338.anInt6437);
				}
			} else if (Static62.aClass93_8 == arg0) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local22 = Static180.aClass1_Sub7_Sub2_2.method2132();
				Static219.method4081(local12).method2278(local22);
			} else if (Static249.aClass93_2 == arg0) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = local12 >> 2;
				local30 = local12 & 0x3;
				local36 = Static180.aClass1_Sub7_Sub2_2.method2123();
				@Pc(1052) byte local1052 = Static180.aClass1_Sub7_Sub2_2.method2137();
				local46 = Static180.aClass1_Sub7_Sub2_2.method2135();
				local50 = Static35.anInt921 + (local46 >> 4 & 0x7);
				local56 = (local46 & 0x7) + Static42.anInt1017;
				@Pc(1075) byte local1075 = Static180.aClass1_Sub7_Sub2_2.method2154();
				local66 = Static180.aClass1_Sub7_Sub2_2.method2161();
				@Pc(1083) byte local1083 = Static180.aClass1_Sub7_Sub2_2.method2122();
				@Pc(1087) byte local1087 = Static180.aClass1_Sub7_Sub2_2.method2154();
				local78 = Static180.aClass1_Sub7_Sub2_2.method2123();
				local527 = Static180.aClass1_Sub7_Sub2_2.method2141();
				if (!Static9.aClass63_1.method4598()) {
					Static72.method1599(local30, local1087, Static338.anInt6437, local66, local36, local22, local1075, local527, local50, local1083, local56, local78, local1052);
				}
			} else if (arg0 == Static324.aClass93_19) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2139();
				local22 = Static180.aClass1_Sub7_Sub2_2.method2156();
				local30 = Static35.anInt921 + (local22 >> 4 & 0x7);
				local36 = Static42.anInt1017 + (local22 & 0x7);
				local42 = Static180.aClass1_Sub7_Sub2_2.method2139();
				if (local30 >= 0 && local36 >= 0 && Static311.anInt5653 > local30 && Static189.anInt3820 > local36) {
					Static90.method1925(local30, new Class1_Sub23(local42, local12), local36, Static338.anInt6437);
					Static287.method5073(local30, local36, Static338.anInt6437);
				}
			} else if (Static118.aClass93_11 == arg0) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = (local12 >> 4 & 0x7) + Static35.anInt921;
				local30 = (local12 & 0x7) + Static42.anInt1017;
				local36 = Static180.aClass1_Sub7_Sub2_2.method2113();
				local42 = local36 >> 2;
				local46 = local36 & 0x3;
				local50 = Static253.anIntArray397[local42];
				if (local22 >= 0 && local30 >= 0 && local22 < Static311.anInt5653 && local30 < Static189.anInt3820) {
					Static40.method950(local22, -1, local30, local46, local50, Static338.anInt6437, local42);
				}
			} else if (arg0 == Static41.aClass93_6) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2113();
				local22 = (local12 >> 4 & 0x7) + Static35.anInt921;
				local30 = (local12 & 0x7) + Static42.anInt1017;
				local36 = Static180.aClass1_Sub7_Sub2_2.method2139();
				if (local22 >= 0 && local30 >= 0 && Static311.anInt5653 > local22 && Static189.anInt3820 > local30) {
					@Pc(1303) Class1_Sub3 local1303 = (Class1_Sub3) Static46.aClass38_4.method1475((long) (local22 | local30 << 14 | Static338.anInt6437 << 28));
					if (local1303 != null) {
						for (@Pc(1311) Class1_Sub23 local1311 = (Class1_Sub23) local1303.aClass42_1.method1543(); local1311 != null; local1311 = (Class1_Sub23) local1303.aClass42_1.method1551()) {
							if (local1311.anInt2967 == (local36 & 0x7FFF)) {
								local1311.method6045();
								break;
							}
						}
						if (local1303.aClass42_1.method1538()) {
							local1303.method6045();
						}
						Static287.method5073(local22, local30, Static338.anInt6437);
					}
				}
			} else if (arg0 == Static301.aClass93_17) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = Static35.anInt921 + (local12 >> 4 & 0x7);
				local30 = Static42.anInt1017 + (local12 & 0x7);
				local36 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local42 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local46 = Static180.aClass1_Sub7_Sub2_2.method2161();
				if (local22 >= 0 && local30 >= 0 && Static311.anInt5653 > local22 && local30 < Static189.anInt3820) {
					local50 = local22 * 128 + 64;
					local56 = local30 * 128 + 64;
					@Pc(1438) Class11_Sub2_Sub2 local1438 = new Class11_Sub2_Sub2(local36, local46, Static51.anInt1301, Static338.anInt6437, local50, Static8.method288(Static338.anInt6437, local50, local56) - local42, local56, local22, local22, local30, local30);
					Static42.aClass42_3.method1549(new Class1_Sub4_Sub1(local1438));
				}
			} else if (arg0 == Static270.aClass93_15) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2156();
				local22 = Static35.anInt921 + (local12 >> 4 & 0x7);
				local30 = (local12 & 0x7) + Static42.anInt1017;
				local36 = Static180.aClass1_Sub7_Sub2_2.method2161();
				if (local36 == 65535) {
					local36 = -1;
				}
				local42 = Static180.aClass1_Sub7_Sub2_2.method2156();
				local46 = local42 >> 2;
				local50 = local42 & 0x3;
				local56 = Static253.anIntArray397[local46];
				Static56.method1387(Static338.anInt6437, local56, local30, local46, local50, local36, local22);
			} else if (arg0 == Static223.aClass93_13) {
				local12 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local22 = (local12 >> 4 & 0x7) + Static35.anInt921;
				local30 = (local12 & 0x7) + Static42.anInt1017;
				local36 = local22 + Static180.aClass1_Sub7_Sub2_2.method2122();
				local42 = local30 + Static180.aClass1_Sub7_Sub2_2.method2122();
				local46 = Static180.aClass1_Sub7_Sub2_2.method2141();
				local50 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local56 = Static180.aClass1_Sub7_Sub2_2.method2132() * 4;
				local62 = Static180.aClass1_Sub7_Sub2_2.method2132() * 4;
				local66 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local70 = Static180.aClass1_Sub7_Sub2_2.method2161();
				local74 = Static180.aClass1_Sub7_Sub2_2.method2132();
				local78 = Static180.aClass1_Sub7_Sub2_2.method2132();
				if (local74 == 255) {
					local74 = -1;
				}
				if (local22 >= 0 && local30 >= 0 && local22 < Static311.anInt5653 && local30 < Static189.anInt3820 && local36 >= 0 && local42 >= 0 && Static311.anInt5653 > local36 && local42 < Static189.anInt3820 && local50 != 65535) {
					local42 = local42 * 128 + 64;
					local22 = local22 * 128 + 64;
					local36 = local36 * 128 + 64;
					local30 = local30 * 128 + 64;
					local184 = new Class11_Sub2_Sub4(local50, Static338.anInt6437, local22, local30, Static8.method288(Static338.anInt6437, local22, local30) - local56, local66 - -Static51.anInt1301, local70 + Static51.anInt1301, local74, local78, local46, local62);
					local184.method4319(local66 + Static51.anInt1301, local42, Static8.method288(Static338.anInt6437, local36, local42) - local62, local36);
					Static356.aClass42_46.method1549(new Class1_Sub4_Sub5(local184));
				}
			} else {
				Static119.method2541("T3 - " + arg0, null);
				Static294.method5141();
			}
		}
	}
}
