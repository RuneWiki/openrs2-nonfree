import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	public static int anInt2928;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public static int anInt2929;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
	public static int[] anIntArray461;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	public static int anInt2932;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!ta;")
	public static Class70 aClass70_11 = new Class70(32);

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	public static int anInt2923 = 0;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1404 = Static108.method1915(",Zffentlicher Chat");

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[Lclient!ge;")
	public static Class23[] aClass23Array2 = new Class23[4];

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "J")
	public static long aLong96 = 0L;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1405 = Static108.method1915("leuchten3:");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method2034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIB)I")
	public static int method2035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 >> 7;
		@Pc(19) int local19 = arg1 >> 7;
		if (local19 < 0 || local15 < 0 || local19 > 103 || local15 > 103) {
			return 0;
		}
		@Pc(42) int local42 = arg1 & 0x7F;
		@Pc(46) int local46 = arg2 & 0x7F;
		@Pc(48) int local48 = arg0;
		if (arg0 < 3 && (Static51.aByteArrayArrayArray3[1][local19][local15] & 0x2) == 2) {
			local48 = arg0 + 1;
		}
		@Pc(94) int local94 = (128 - local42) * Static51.anIntArrayArrayArray6[local48][local19][local15] + Static51.anIntArrayArrayArray6[local48][local19 + 1][local15] * local42 >> 7;
		@Pc(125) int local125 = local42 * Static51.anIntArrayArrayArray6[local48][local19 + 1][local15 + 1] + Static51.anIntArrayArrayArray6[local48][local19][local15 + 1] * (128 - local42) >> 7;
		return local125 * local46 + (128 - local46) * local94 >> 7;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public static void method2036() {
		anIntArray461 = null;
		aBooleanArray16 = null;
		aClass39_1405 = null;
		aClass39_1404 = null;
		aClass70_11 = null;
		aClass23Array2 = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	public static void method2037() {
		for (@Pc(6) Class1_Sub1_Sub2_Sub6 local6 = (Class1_Sub1_Sub2_Sub6) Static81.aClass31_47.method1000(); local6 != null; local6 = (Class1_Sub1_Sub2_Sub6) Static81.aClass31_47.method1003()) {
			if (local6.anInt1872 != Static9.anInt2983 || Static45.anInt1256 > local6.anInt1875) {
				local6.method2128();
			} else if (local6.anInt1856 <= Static45.anInt1256) {
				if (local6.anInt1862 > 0) {
					@Pc(53) Class1_Sub1_Sub2_Sub1_Sub1 local53 = Static114.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local6.anInt1862 - 1];
					if (local53 != null && local53.anInt2521 >= 0 && local53.anInt2521 < 13312 && local53.anInt2508 >= 0 && local53.anInt2508 < 13312) {
						local6.method1280(Static45.anInt1256, local53.anInt2508, local53.anInt2521, method2035(local6.anInt1872, local53.anInt2521, local53.anInt2508) - local6.anInt1873);
					}
				}
				if (local6.anInt1862 < 0) {
					@Pc(105) int local105 = -local6.anInt1862 - 1;
					@Pc(116) Class1_Sub1_Sub2_Sub1_Sub2 local116;
					if (local105 == Static69.anInt1770) {
						local116 = Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1;
					} else {
						local116 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local105];
					}
					if (local116 != null && local116.anInt2521 >= 0 && local116.anInt2521 < 13312 && local116.anInt2508 >= 0 && local116.anInt2508 < 13312) {
						local6.method1280(Static45.anInt1256, local116.anInt2508, local116.anInt2521, method2035(local6.anInt1872, local116.anInt2521, local116.anInt2508) - local6.anInt1873);
					}
				}
				local6.method1281(Static107.anInt2687);
				Static32.aClass5_2.method108(Static9.anInt2983, (int) local6.aDouble1, (int) local6.aDouble3, (int) local6.aDouble5, 60, local6, local6.anInt1866, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	public static void method2039() {
		if (Static119.aBoolean234) {
			Static81.method1387();
			Static119.aBoolean234 = false;
			Static113.method1975();
			Static66.aBoolean145 = true;
			Static113.aBoolean226 = true;
			Static126.aBoolean247 = true;
			Static35.aBoolean96 = true;
		}
		Static30.method600();
		if (Static13.aBoolean47 && Static46.anInt2774 == 1) {
			Static35.aBoolean96 = true;
		}
		@Pc(35) boolean local35;
		if (Static91.anInt2131 != -1) {
			local35 = Static93.method1565(Static91.anInt2131);
			if (local35) {
				Static35.aBoolean96 = true;
			}
		}
		if (Static91.anInt2127 == 2) {
			Static35.aBoolean96 = true;
		}
		if (Static77.anInt1932 == 2) {
			Static35.aBoolean96 = true;
		}
		if (Static35.aBoolean96) {
			Static35.aBoolean96 = false;
			Static66.method1192();
		}
		@Pc(109) int local109;
		if (Static110.anInt2786 == -1) {
			Static127.aClass1_Sub1_Sub1_5.anInt95 = Static87.anInt2023 - Static56.anInt1514 - 77;
			if (Static29.anInt971 > 17 && Static29.anInt971 < 560 && Static3.anInt150 > 332) {
				Static107.method1889(0, 463, 77, Static87.anInt2023, Static3.anInt150 - 357, Static29.anInt971 + -17, -1, Static127.aClass1_Sub1_Sub1_5);
			}
			local109 = Static87.anInt2023 - Static127.aClass1_Sub1_Sub1_5.anInt95 - 77;
			if (local109 < 0) {
				local109 = 0;
			}
			if (Static87.anInt2023 - 77 < local109) {
				local109 = Static87.anInt2023 - 77;
			}
			if (local109 != Static56.anInt1514) {
				Static56.anInt1514 = local109;
				Static113.aBoolean226 = true;
			}
		}
		if (Static110.anInt2786 == -1 && Static2.anInt133 == 3) {
			Static127.aClass1_Sub1_Sub1_5.anInt95 = Static16.anInt2466;
			local109 = Static59.anInt1586 * 14 + 7;
			if (Static29.anInt971 > 17 && Static29.anInt971 < 560 && Static3.anInt150 > 332) {
				Static107.method1889(0, 463, 77, local109, Static3.anInt150 - 357, Static29.anInt971 + -17, -1, Static127.aClass1_Sub1_Sub1_5);
			}
			@Pc(181) int local181 = Static127.aClass1_Sub1_Sub1_5.anInt95;
			if (local181 < 0) {
				local181 = 0;
			}
			if (local109 - 77 < local181) {
				local181 = local109 - 77;
			}
			if (local181 != Static16.anInt2466) {
				Static113.aBoolean226 = true;
				Static16.anInt2466 = local181;
			}
		}
		if (Static110.anInt2786 != -1) {
			local35 = Static93.method1565(Static110.anInt2786);
			if (local35) {
				Static113.aBoolean226 = true;
			}
		}
		if (Static91.anInt2127 == 3) {
			Static113.aBoolean226 = true;
		}
		if (Static77.anInt1932 == 3) {
			Static113.aBoolean226 = true;
		}
		if (Static122.aClass39_1434 != null) {
			Static113.aBoolean226 = true;
		}
		if (Static13.aBoolean47 && Static46.anInt2774 == 2) {
			Static113.aBoolean226 = true;
		}
		if (Static113.aBoolean226) {
			Static113.aBoolean226 = false;
			Static72.method1249();
		}
		Static122.method2063();
		if (Static129.anInt3161 != -1) {
			Static126.aBoolean247 = true;
		}
		if (Static126.aBoolean247) {
			if (Static129.anInt3161 != -1 && Static129.anInt3161 == Static120.anInt3073) {
				Static129.anInt3161 = -1;
				Static103.aClass1_Sub18_Sub1_5.method2203(189);
				Static103.aClass1_Sub18_Sub1_5.method2168(Static120.anInt3073);
			}
			Static85.aBoolean170 = true;
			Static126.aBoolean247 = false;
			Static54.method992(Static23.anIntArray117, Static91.anInt2131 == -1, Static45.anInt1256 % 20 < 10 ? -1 : Static129.anInt3161, Static120.anInt3073);
		}
		if (Static66.aBoolean145) {
			Static85.aBoolean170 = true;
			Static66.aBoolean145 = false;
			Static47.method830(Static11.anInt495, Static93.aClass1_Sub1_Sub4_Sub3_3, Static114.anInt2845, Static24.anInt816);
		}
		Static41.method2109(Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2508, Static9.anInt2983, Static65.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2521, Static107.anInt2687);
		Static107.anInt2687 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
	public static void method2040() {
		Static8.aClass33_4.method1034();
		Static9.aClass33_41.method1034();
		Static47.aClass33_16.method1034();
	}
}
