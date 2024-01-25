import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
	public static int anInt6197;

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray166;

	@OriginalMember(owner = "client!ui", name = "U", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!ui", name = "X", descriptor = "Lclient!tq;")
	public static Class191 aClass191_198;

	@OriginalMember(owner = "client!ui", name = "Y", descriptor = "Lclient!tq;")
	public static Class191 aClass191_199;

	@OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
	public static int anInt6208 = 500;

	@OriginalMember(owner = "client!ui", name = "cb", descriptor = "J")
	public static long aLong186 = 0L;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
	public static void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static108.anIntArray222[local7] = Static108.anIntArray222[local7 - 1];
			Static78.anIntArray185[local7] = Static78.anIntArray185[local7 - 1];
			Static247.aStringArray41[local7] = Static247.aStringArray41[local7 - 1];
			Static311.aStringArray58[local7] = Static311.aStringArray58[local7 - 1];
			Static207.aStringArray59[local7] = Static207.aStringArray59[local7 - 1];
			Static349.aStringArray65[local7] = Static349.aStringArray65[local7 - 1];
			Static71.anIntArray161[local7] = Static71.anIntArray161[local7 - 1];
		}
		Static108.anIntArray222[0] = arg5;
		Static247.aStringArray41[0] = arg2;
		Static78.anIntArray185[0] = arg3;
		Static311.aStringArray58[0] = arg1;
		Static207.aStringArray59[0] = arg4;
		Static148.anInt3027++;
		Static68.anInt1468 = Static157.anInt3179;
		Static349.aStringArray65[0] = arg6;
		Static71.anIntArray161[0] = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(B)V")
	public static void method5407() {
		Static126.method2619(false);
		Static97.anInt6861 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(18) int local18 = 0; local18 < Static10.aByteArrayArray2.length; local18++) {
			if (Static50.anIntArray96[local18] != -1 && Static10.aByteArrayArray2[local18] == null) {
				Static10.aByteArrayArray2[local18] = Static122.aClass191_148.method5459(Static50.anIntArray96[local18], 0);
				if (Static10.aByteArrayArray2[local18] == null) {
					local12 = false;
					Static97.anInt6861++;
				}
			}
			if (Static304.anIntArray452[local18] != -1 && Static229.aByteArrayArray7[local18] == null) {
				Static229.aByteArrayArray7[local18] = Static122.aClass191_148.method5450(Static177.anIntArrayArray107[local18], Static304.anIntArray452[local18], 0);
				if (Static229.aByteArrayArray7[local18] == null) {
					Static97.anInt6861++;
					local12 = false;
				}
			}
			if (Static251.anIntArray377[local18] != -1 && Static341.aByteArrayArray22[local18] == null) {
				Static341.aByteArrayArray22[local18] = Static122.aClass191_148.method5459(Static251.anIntArray377[local18], 0);
				if (Static341.aByteArrayArray22[local18] == null) {
					local12 = false;
					Static97.anInt6861++;
				}
			}
			if (Static279.anIntArray415[local18] != -1 && Static226.aByteArrayArray12[local18] == null) {
				Static226.aByteArrayArray12[local18] = Static122.aClass191_148.method5459(Static279.anIntArray415[local18], 0);
				if (Static226.aByteArrayArray12[local18] == null) {
					Static97.anInt6861++;
					local12 = false;
				}
			}
			if (Static266.anIntArray398 != null && Static121.aByteArrayArray8[local18] == null && Static266.anIntArray398[local18] != -1) {
				Static121.aByteArrayArray8[local18] = Static122.aClass191_148.method5450(Static177.anIntArrayArray107[local18], Static266.anIntArray398[local18], 0);
				if (Static121.aByteArrayArray8[local18] == null) {
					Static97.anInt6861++;
					local12 = false;
				}
			}
		}
		if (Static136.aClass142_3 == null) {
			if (Static194.aClass2_Sub11_Sub6_3 == null || !Static133.aClass191_84.method5433(Static194.aClass2_Sub11_Sub6_3.aString23 + "_staticelements")) {
				Static136.aClass142_3 = new Class142(0);
			} else if (Static133.aClass191_84.method5455(Static194.aClass2_Sub11_Sub6_3.aString23 + "_staticelements")) {
				Static136.aClass142_3 = Static256.method4648(Static133.aClass191_84, Static194.aClass2_Sub11_Sub6_3.aString23 + "_staticelements", Static58.aBoolean116);
			} else {
				Static97.anInt6861++;
				local12 = false;
			}
		}
		if (!local12) {
			Static203.anInt3381 = 1;
			return;
		}
		local12 = true;
		Static179.anInt3568 = 0;
		@Pc(273) int local273;
		@Pc(283) int local283;
		for (@Pc(254) int local254 = 0; local254 < Static10.aByteArrayArray2.length; local254++) {
			@Pc(260) byte[] local260 = Static229.aByteArrayArray7[local254];
			if (local260 != null) {
				local273 = (Static201.anIntArray310[local254] >> 8) * 64 - Static138.anInt2879;
				local283 = (Static201.anIntArray310[local254] & 0xFF) * 64 - Static342.anInt6864;
				if (Static108.aBoolean206) {
					local283 = 10;
					local273 = 10;
				}
				local12 &= Static357.method6003(local283, local260, local273);
			}
			local260 = Static226.aByteArrayArray12[local254];
			if (local260 != null) {
				local273 = (Static201.anIntArray310[local254] >> 8) * 64 - Static138.anInt2879;
				local283 = (Static201.anIntArray310[local254] & 0xFF) * 64 - Static342.anInt6864;
				if (Static108.aBoolean206) {
					local273 = 10;
					local283 = 10;
				}
				local12 &= Static357.method6003(local283, local260, local273);
			}
		}
		if (!local12) {
			Static203.anInt3381 = 2;
			return;
		}
		if (Static203.anInt3381 != 0) {
			Static224.method3945(true, Static111.aClass93_46.method2819(Static21.anInt455) + "<br>(100%)", Static193.aClass37_2);
		}
		Static166.method3083();
		Static224.method3940();
		@Pc(374) boolean local374 = false;
		if (Static147.aClass4_2.method4228() && Static304.aBoolean545) {
			for (local273 = 0; local273 < Static10.aByteArrayArray2.length; local273++) {
				if (Static226.aByteArrayArray12[local273] != null || Static341.aByteArrayArray22[local273] != null) {
					local374 = true;
					break;
				}
			}
		}
		if (Static209.aBoolean435) {
			local273 = Static327.anIntArray481[Static196.anInt3850];
		} else {
			local273 = Static269.anIntArray404[Static196.anInt3850];
		}
		if (Static147.aClass4_2.method4282()) {
			local273++;
		}
		Static228.method1029(Static95.anInt6381, Static237.anInt4532, local273, local374, Static147.aClass4_2.method4263() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static169.aClass151Array1[local283].method4101();
		}
		Static335.method5803();
		Static288.method5250(false);
		Static119.method2503();
		Static166.method3083();
		System.gc();
		Static126.method2619(true);
		Static58.method1349(4, false);
		@Pc(462) int[][] local462 = null;
		if (!Static108.aBoolean206) {
			Static240.method4140(false);
			Static203.method3127(Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0] >> 3, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] >> 3);
			Static215.method3811();
			Static229.method2463(null, Static147.aClass4_2, false, 4);
			local462 = Static109.anIntArrayArrayArray3[0];
			Static126.method2619(true);
			Static30.method769(false);
			if (Static121.aByteArrayArray8 != null) {
				Static236.method4074();
			}
		}
		if (Static108.aBoolean206) {
			Static61.method1389(false);
			Static203.method3127(Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0] >> 3, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] >> 3);
			Static215.method3811();
			Static229.method2463(null, Static147.aClass4_2, false, 4);
			local462 = Static109.anIntArrayArrayArray3[0];
			Static126.method2619(true);
			Static22.method700(false);
		}
		Static224.method3940();
		Static126.method2619(true);
		Static347.method3870(null, Static169.aClass151Array1, 4, false, Static147.aClass4_2);
		Static70.method1579(4, Static147.aClass4_2);
		Static126.method2619(true);
		@Pc(563) int local563 = Static284.anInt5732;
		if (local563 > Static182.anInt3603) {
			local563 = Static182.anInt3603;
		}
		if (local563 < Static182.anInt3603 - 1) {
			local563 = Static182.anInt3603 - 1;
		}
		if (Static257.method4680()) {
			Static280.method5067(0);
		} else {
			Static280.method5067(local563);
		}
		Static18.method672();
		if (local374) {
			Static187.method3377(true);
			Static58.method1349(1, true);
			if (!Static108.aBoolean206) {
				Static240.method4140(true);
				Static229.method2463(local462, Static147.aClass4_2, true, 1);
				Static126.method2619(true);
				Static30.method769(true);
				Static70.method1579(1, Static147.aClass4_2);
			}
			if (Static108.aBoolean206) {
				Static61.method1389(true);
				Static229.method2463(local462, Static147.aClass4_2, true, 1);
				Static126.method2619(true);
				Static22.method700(true);
			}
			Static224.method3940();
			Static126.method2619(true);
			Static347.method3870(Static265.aClass73Array44[0], Static169.aClass151Array1, 1, true, Static147.aClass4_2);
			Static70.method1579(1, Static147.aClass4_2);
			Static126.method2619(true);
			Static18.method672();
			Static187.method3377(false);
		}
		@Pc(673) int local673;
		@Pc(677) int local677;
		for (@Pc(669) int local669 = 0; local669 < 4; local669++) {
			for (local673 = 0; local673 < Static95.anInt6381; local673++) {
				for (local677 = 0; local677 < Static237.anInt4532; local677++) {
					Static304.method5349(local673, local677, local669);
				}
			}
		}
		Static224.method3941();
		Static166.method3083();
		Static112.method2424();
		Static224.method3940();
		Static326.aBoolean583 = false;
		Static147.method415();
		if (Static348.aFrame2 != null && Static157.aClass173_1 != null && Static263.anInt5396 == 25) {
			Static74.aClass2_Sub10_Sub1_2.method2049(6);
			Static74.aClass2_Sub10_Sub1_2.method4450(1057001181);
		}
		if (!Static108.aBoolean206) {
			local673 = (Static278.anInt5657 - (Static95.anInt6381 >> 4)) / 8;
			local677 = (Static278.anInt5657 + (Static95.anInt6381 >> 4)) / 8;
			@Pc(762) int local762 = (Static146.anInt3013 - (Static237.anInt4532 >> 4)) / 8;
			@Pc(770) int local770 = (Static146.anInt3013 + (Static237.anInt4532 >> 4)) / 8;
			for (@Pc(774) int local774 = local673 - 1; local774 <= local677 + 1; local774++) {
				for (@Pc(780) int local780 = local762 - 1; local780 <= local770 + 1; local780++) {
					if (local774 < local673 || local774 > local677 || local780 < local762 || local780 > local770) {
						Static122.aClass191_148.method5434("m" + local774 + "_" + local780);
						Static122.aClass191_148.method5434("l" + local774 + "_" + local780);
					}
				}
			}
		}
		if (Static263.anInt5396 == 28) {
			Static125.method2616(10);
		} else {
			Static125.method2616(30);
			if (Static157.aClass173_1 != null) {
				Static74.aClass2_Sub10_Sub1_2.method2049(74);
			}
		}
		Static128.method2625();
		Static166.method3083();
		Static295.method5215();
	}
}
