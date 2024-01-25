import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray13;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[128][128];

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
	public static void method3078() {
		Static111.method2071(false);
		Static185.anInt1069 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static28.aByteArrayArray2.length; local14++) {
			if (Static269.anIntArray658[local14] != -1 && Static28.aByteArrayArray2[local14] == null) {
				Static28.aByteArrayArray2[local14] = Static316.aClass165_94.method4508(0, Static269.anIntArray658[local14]);
				if (Static28.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static185.anInt1069++;
				}
			}
			if (Static299.anIntArray724[local14] != -1 && Static61.aByteArrayArray4[local14] == null) {
				Static61.aByteArrayArray4[local14] = Static316.aClass165_94.method4488(Static50.anIntArrayArray5[local14], 0, Static299.anIntArray724[local14]);
				if (Static61.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static185.anInt1069++;
				}
			}
			if (Static58.anIntArray145[local14] != -1 && Static343.aByteArrayArray17[local14] == null) {
				Static343.aByteArrayArray17[local14] = Static316.aClass165_94.method4508(0, Static58.anIntArray145[local14]);
				if (Static343.aByteArrayArray17[local14] == null) {
					local12 = false;
					Static185.anInt1069++;
				}
			}
			if (Static16.anIntArray43[local14] != -1 && Static203.aByteArrayArray12[local14] == null) {
				Static203.aByteArrayArray12[local14] = Static316.aClass165_94.method4508(0, Static16.anIntArray43[local14]);
				if (Static203.aByteArrayArray12[local14] == null) {
					Static185.anInt1069++;
					local12 = false;
				}
			}
			if (Static63.anIntArray153 != null && Static346.aByteArrayArray21[local14] == null && Static63.anIntArray153[local14] != -1) {
				Static346.aByteArrayArray21[local14] = Static316.aClass165_94.method4488(Static50.anIntArrayArray5[local14], 0, Static63.anIntArray153[local14]);
				if (Static346.aByteArrayArray21[local14] == null) {
					local12 = false;
					Static185.anInt1069++;
				}
			}
		}
		if (Static97.aClass6_1 == null) {
			if (Static144.aClass1_Sub1_Sub12_3 == null || !Static119.aClass165_41.method4481(Static144.aClass1_Sub1_Sub12_3.aString112 + "_staticelements")) {
				Static97.aClass6_1 = new Class6(0);
			} else if (Static119.aClass165_41.method4494(Static144.aClass1_Sub1_Sub12_3.aString112 + "_staticelements")) {
				Static97.aClass6_1 = Static300.method5116(Static220.aBoolean369, Static144.aClass1_Sub1_Sub12_3.aString112 + "_staticelements", Static119.aClass165_41);
			} else {
				local12 = false;
				Static185.anInt1069++;
			}
		}
		if (!local12) {
			Static285.anInt5517 = 1;
			return;
		}
		local12 = true;
		Static108.anInt2195 = 0;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(253) int local253 = 0; local253 < Static28.aByteArrayArray2.length; local253++) {
			@Pc(259) byte[] local259 = Static61.aByteArrayArray4[local253];
			if (local259 != null) {
				local272 = (Static80.anIntArray184[local253] >> 8) * 64 - Static182.anInt3775;
				local283 = (Static80.anIntArray184[local253] & 0xFF) * 64 - Static161.anInt3315;
				if (Static108.aBoolean187) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static138.method2664(local283, local272, local259);
			}
			local259 = Static203.aByteArrayArray12[local253];
			if (local259 != null) {
				local272 = (Static80.anIntArray184[local253] >> 8) * 64 - Static182.anInt3775;
				local283 = (Static80.anIntArray184[local253] & 0xFF) * 64 - Static161.anInt3315;
				if (Static108.aBoolean187) {
					local272 = 10;
					local283 = 10;
				}
				local12 &= Static138.method2664(local283, local272, local259);
			}
		}
		if (!local12) {
			Static285.anInt5517 = 2;
			return;
		}
		if (Static285.anInt5517 != 0) {
			Static56.method1211(Static118.aString194 + "<br>(100%)", true, Static9.aClass13_1);
		}
		Static278.method4804();
		Static328.method5502();
		@Pc(376) boolean local376 = false;
		if (Static34.aClass2_6.method3243() && Static8.aBoolean28) {
			for (local272 = 0; local272 < Static28.aByteArrayArray2.length; local272++) {
				if (Static203.aByteArrayArray12[local272] != null || Static343.aByteArrayArray17[local272] != null) {
					local376 = true;
					break;
				}
			}
		}
		if (Static41.aBoolean83) {
			local272 = Static339.anIntArray799[Static312.anInt6516];
		} else {
			local272 = Static85.anIntArray209[Static312.anInt6516];
		}
		if (Static34.aClass2_6.method3261()) {
			local272++;
		}
		Static180.method3543(Static48.anInt1107, Static337.anInt6402, local272, local376, Static34.aClass2_6.method3312() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static24.aClass91Array1[local283].method2594();
		}
		Static293.method5022();
		Static123.method2193(false);
		Static309.method5208();
		Static278.method4804();
		System.gc();
		Static111.method2071(true);
		Static265.method4612(false, 4);
		@Pc(466) int[][] local466 = null;
		if (!Static108.aBoolean187) {
			Static306.method5164(false);
			Static25.method755(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] >> 3, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] >> 3);
			Static45.method1028();
			Static323.method5413(4, Static34.aClass2_6, false, null);
			local466 = Static213.anIntArrayArrayArray10[0];
			Static111.method2071(true);
			Static227.method4122(false);
			if (Static346.aByteArrayArray21 != null) {
				Static189.method3650();
			}
		}
		if (Static108.aBoolean187) {
			Static48.method1104(false);
			Static25.method755(Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] >> 3, Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] >> 3);
			Static45.method1028();
			Static323.method5413(4, Static34.aClass2_6, false, null);
			local466 = Static213.anIntArrayArrayArray10[0];
			Static111.method2071(true);
			Static248.method4431(false);
		}
		Static328.method5502();
		Static111.method2071(true);
		Static230.method4156(4, Static34.aClass2_6, false, Static24.aClass91Array1, null);
		Static198.method3736(4, Static34.aClass2_6);
		Static111.method2071(true);
		@Pc(569) int local569 = Static341.anInt2257;
		if (Static285.anInt5511 < local569) {
			local569 = Static285.anInt5511;
		}
		if (Static285.anInt5511 - 1 > local569) {
			local569 = Static285.anInt5511 - 1;
		}
		if (Static123.method2195()) {
			Static295.method5065(0);
		} else {
			Static295.method5065(local569);
		}
		Static128.method2432();
		if (local376) {
			Static47.method1089(true);
			Static265.method4612(true, 1);
			if (!Static108.aBoolean187) {
				Static306.method5164(true);
				Static323.method5413(1, Static34.aClass2_6, true, local466);
				Static111.method2071(true);
				Static227.method4122(true);
				Static198.method3736(1, Static34.aClass2_6);
			}
			if (Static108.aBoolean187) {
				Static48.method1104(true);
				Static323.method5413(1, Static34.aClass2_6, true, local466);
				Static111.method2071(true);
				Static248.method4431(true);
			}
			Static328.method5502();
			Static111.method2071(true);
			Static230.method4156(1, Static34.aClass2_6, true, Static24.aClass91Array1, Static288.aClass41Array5[0]);
			Static198.method3736(1, Static34.aClass2_6);
			Static111.method2071(true);
			Static128.method2432();
			Static47.method1089(false);
		}
		@Pc(679) int local679;
		@Pc(683) int local683;
		for (@Pc(675) int local675 = 0; local675 < 4; local675++) {
			for (local679 = 0; local679 < Static48.anInt1107; local679++) {
				for (local683 = 0; local683 < Static337.anInt6402; local683++) {
					Static300.method5117(local679, local675, local683);
				}
			}
		}
		Static309.method5209();
		Static278.method4804();
		Static12.method318();
		Static328.method5502();
		Static100.aBoolean178 = false;
		Static288.method5418();
		if (Static232.aFrame3 != null && Static153.aClass158_2 != null && Static239.anInt4649 == 25) {
			Static248.aClass1_Sub7_Sub1_2.method728(120);
			Static248.aClass1_Sub7_Sub1_2.method3098(1057001181);
		}
		if (!Static108.aBoolean187) {
			local679 = (Static58.anInt1291 - (Static48.anInt1107 >> 4)) / 8;
			local683 = ((Static48.anInt1107 >> 4) + Static58.anInt1291) / 8;
			@Pc(770) int local770 = (Static51.anInt5042 - (Static337.anInt6402 >> 4)) / 8;
			@Pc(778) int local778 = ((Static337.anInt6402 >> 4) + Static51.anInt5042) / 8;
			for (@Pc(782) int local782 = local679 - 1; local782 <= local683 + 1; local782++) {
				for (@Pc(788) int local788 = local770 - 1; local788 <= local778 + 1; local788++) {
					if (local679 > local782 || local683 < local782 || local788 < local770 || local788 > local778) {
						Static316.aClass165_94.method4474("m" + local782 + "_" + local788);
						Static316.aClass165_94.method4474("l" + local782 + "_" + local788);
					}
				}
			}
		}
		if (Static239.anInt4649 == 28) {
			Static72.method1427(10);
		} else {
			Static72.method1427(30);
			if (Static153.aClass158_2 != null) {
				Static248.aClass1_Sub7_Sub1_2.method728(8);
			}
		}
		Static215.method3961();
		Static278.method4804();
		Static72.method1432();
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)Lclient!pb;")
	public static Class153 method3079() {
		try {
			return (Class153) Class.forName("Class153_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)V")
	public static void method3081(@OriginalArg(1) boolean arg0) {
		if (Static96.aBoolean582 != arg0) {
			Static96.aBoolean582 = arg0;
			Static270.method4722();
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
	public static int method3082(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
