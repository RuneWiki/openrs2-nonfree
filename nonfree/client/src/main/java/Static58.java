import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dn", name = "H", descriptor = "Lclient!rh;")
	public static Class1_Sub31_Sub3 aClass1_Sub31_Sub3_1;

	@OriginalMember(owner = "client!dn", name = "A", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_4 = new Class14();

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "[I")
	public static final int[] anIntArray98 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
	public static int anInt1391 = 0;

	@OriginalMember(owner = "client!dn", name = "G", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
	public static void method1132() {
		Static48.aClass37_22.method920(5);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIII)Lclient!ep;")
	public static Class1_Sub2_Sub3 method1133(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = arg2 | arg1 << 8;
		@Pc(25) Class1_Sub2_Sub3 local25 = (Class1_Sub2_Sub3) Static191.aClass88_7.method1652((long) local14 << 16);
		if (local25 != null) {
			return local25;
		}
		@Pc(37) byte[] local37 = Static189.aClass134_135.method3014(Static189.aClass134_135.method3015(local14));
		if (local37 == null) {
			local14 = arg0 + 65536 << 8 | arg2;
			local25 = (Class1_Sub2_Sub3) Static191.aClass88_7.method1652((long) local14 << 16);
			if (local25 != null) {
				return local25;
			}
			local37 = Static189.aClass134_135.method3014(Static189.aClass134_135.method3015(local14));
			if (local37 == null) {
				local14 = arg2 | 0xFFFF00;
				local25 = (Class1_Sub2_Sub3) Static191.aClass88_7.method1652((long) local14 << 16);
				if (local25 != null) {
					return local25;
				}
				local37 = Static189.aClass134_135.method3014(Static189.aClass134_135.method3015(local14));
				if (local37 == null) {
					return null;
				} else if (local37.length <= 1) {
					return null;
				} else {
					local25 = Static305.method5285(local37);
					local25.anInt1556 = arg2;
					Static191.aClass88_7.method1651((long) local14 << 16, local25);
					return local25;
				}
			} else if (local37.length <= 1) {
				return null;
			} else {
				local25 = Static305.method5285(local37);
				local25.anInt1556 = arg2;
				Static191.aClass88_7.method1651((long) local14 << 16, local25);
				return local25;
			}
		} else if (local37.length <= 1) {
			return null;
		} else {
			local25 = Static305.method5285(local37);
			local25.anInt1556 = arg2;
			Static191.aClass88_7.method1651((long) local14 << 16, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!lm;)V")
	public static void method1135(@OriginalArg(1) Class134 arg0) {
		Static100.aClass134_45 = arg0;
		Static192.anInt3987 = Static100.aClass134_45.method3020(4);
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
	public static void method1136() {
		Static75.method1298(false);
		Static37.anInt997 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static41.aByteArrayArray4.length; local14++) {
			if (Static166.anIntArray334[local14] != -1 && Static41.aByteArrayArray4[local14] == null) {
				Static41.aByteArrayArray4[local14] = Static29.aClass134_12.method3009(0, Static166.anIntArray334[local14]);
				if (Static41.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static37.anInt997++;
				}
			}
			if (Static219.anIntArray430[local14] != -1 && Static242.aByteArrayArray15[local14] == null) {
				Static242.aByteArrayArray15[local14] = Static29.aClass134_12.method3026(0, Static281.anIntArrayArray45[local14], Static219.anIntArray430[local14]);
				if (Static242.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static37.anInt997++;
				}
			}
			if (Static287.anIntArray560[local14] != -1 && Static263.aByteArrayArray19[local14] == null) {
				Static263.aByteArrayArray19[local14] = Static29.aClass134_12.method3009(0, Static287.anIntArray560[local14]);
				if (Static263.aByteArrayArray19[local14] == null) {
					Static37.anInt997++;
					local12 = false;
				}
			}
			if (Static120.anIntArray242[local14] != -1 && Static153.aByteArrayArray8[local14] == null) {
				Static153.aByteArrayArray8[local14] = Static29.aClass134_12.method3009(0, Static120.anIntArray242[local14]);
				if (Static153.aByteArrayArray8[local14] == null) {
					local12 = false;
					Static37.anInt997++;
				}
			}
			if (Static331.anIntArray354 != null && Static274.aByteArrayArray20[local14] == null && Static331.anIntArray354[local14] != -1) {
				Static274.aByteArrayArray20[local14] = Static29.aClass134_12.method3026(0, Static281.anIntArrayArray45[local14], Static331.anIntArray354[local14]);
				if (Static274.aByteArrayArray20[local14] == null) {
					Static37.anInt997++;
					local12 = false;
				}
			}
		}
		if (Static37.aClass129_1 == null) {
			if (Static173.aClass1_Sub2_Sub8_3 == null || !Static282.aClass134_79.method3007(Static173.aClass1_Sub2_Sub8_3.aString131 + "_staticelements")) {
				Static37.aClass129_1 = new Class129(0);
			} else if (Static282.aClass134_79.method3030(Static173.aClass1_Sub2_Sub8_3.aString131 + "_staticelements")) {
				Static37.aClass129_1 = Static263.method4745(Static228.aBoolean379, Static173.aClass1_Sub2_Sub8_3.aString131 + "_staticelements", Static282.aClass134_79);
			} else {
				Static37.anInt997++;
				local12 = false;
			}
		}
		if (!local12) {
			Static38.anInt3166 = 1;
			return;
		}
		local12 = true;
		Static73.anInt957 = 0;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(252) int local252 = 0; local252 < Static41.aByteArrayArray4.length; local252++) {
			@Pc(258) byte[] local258 = Static242.aByteArrayArray15[local252];
			if (local258 != null) {
				local271 = (Static146.anIntArray446[local252] >> 8) * 64 - Static92.anInt1755;
				local282 = (Static146.anIntArray446[local252] & 0xFF) * 64 - Static98.anInt1911;
				if (Static238.aBoolean402) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static228.method4129(local271, local282, local258);
			}
			local258 = Static153.aByteArrayArray8[local252];
			if (local258 != null) {
				local271 = (Static146.anIntArray446[local252] >> 8) * 64 - Static92.anInt1755;
				local282 = (Static146.anIntArray446[local252] & 0xFF) * 64 - Static98.anInt1911;
				if (Static238.aBoolean402) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static228.method4129(local271, local282, local258);
			}
		}
		if (!local12) {
			Static38.anInt3166 = 2;
			return;
		}
		if (Static38.anInt3166 != 0) {
			Static159.method5486(true, Static101.aString78 + "<br>(100%)", Static233.aClass29_2);
		}
		Static310.method5336();
		Static14.method208();
		@Pc(368) boolean local368 = false;
		if (Static217.aClass105_5.method4235() && Static347.aBoolean550) {
			for (local271 = 0; local271 < Static41.aByteArrayArray4.length; local271++) {
				if (Static153.aByteArrayArray8[local271] != null || Static263.aByteArrayArray19[local271] != null) {
					local368 = true;
					break;
				}
			}
		}
		if (Static168.aBoolean267) {
			local271 = Static139.anIntArray272[Static187.anInt3911];
		} else {
			local271 = Static51.anIntArray78[Static187.anInt3911];
		}
		if (Static217.aClass105_5.method4216()) {
			local271++;
		}
		Static321.method5488(Static43.anInt1151, Static260.anInt5348, local271, local368, Static217.aClass105_5.method4279() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static313.aClass17Array1[local282].method333();
		}
		Static210.method3797();
		Static253.method4541(false);
		Static269.method4847();
		Static310.method5336();
		System.gc();
		Static75.method1298(true);
		Static297.method5193(false, 4);
		@Pc(471) int[][] local471 = null;
		if (!Static238.aBoolean402) {
			Static301.method5230(false);
			Static311.method5344(Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] >> 3, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] >> 3);
			method1138();
			Static151.method2631(4, null, false, Static217.aClass105_5);
			local471 = Static276.anIntArrayArrayArray12[0];
			Static75.method1298(true);
			Static293.method5137(false);
			if (Static274.aByteArrayArray20 != null) {
				Static87.method1402();
			}
		}
		if (Static238.aBoolean402) {
			Static59.method1142(false);
			Static311.method5344(Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] >> 3, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] >> 3);
			method1138();
			Static151.method2631(4, null, false, Static217.aClass105_5);
			local471 = Static276.anIntArrayArrayArray12[0];
			Static75.method1298(true);
			Static124.method1990(false);
		}
		Static14.method208();
		Static75.method1298(true);
		Static328.method441(false, Static313.aClass17Array1, null, Static217.aClass105_5, 4);
		Static315.method5401(4, Static217.aClass105_5);
		Static75.method1298(true);
		@Pc(580) int local580 = Static203.anInt4293;
		if (Static127.anInt2487 < local580) {
			local580 = Static127.anInt2487;
		}
		if (local580 < Static127.anInt2487 - 1) {
			local580 = Static127.anInt2487 - 1;
		}
		if (Static25.method408()) {
			Static283.method4989(0);
		} else {
			Static283.method4989(local580);
		}
		Static71.method1254();
		if (local368) {
			Static187.method3326(true);
			Static297.method5193(true, 1);
			if (!Static238.aBoolean402) {
				Static301.method5230(true);
				Static151.method2631(1, local471, true, Static217.aClass105_5);
				Static75.method1298(true);
				Static293.method5137(true);
				Static315.method5401(1, Static217.aClass105_5);
			}
			if (Static238.aBoolean402) {
				Static59.method1142(true);
				Static151.method2631(1, local471, true, Static217.aClass105_5);
				Static75.method1298(true);
				Static124.method1990(true);
			}
			Static14.method208();
			Static75.method1298(true);
			Static328.method441(true, Static313.aClass17Array1, Static278.aClass12Array3[0], Static217.aClass105_5, 1);
			Static315.method5401(1, Static217.aClass105_5);
			Static75.method1298(true);
			Static71.method1254();
			Static187.method3326(false);
		}
		@Pc(698) int local698;
		@Pc(702) int local702;
		for (@Pc(694) int local694 = 0; local694 < 4; local694++) {
			for (local698 = 0; local698 < Static43.anInt1151; local698++) {
				for (local702 = 0; local702 < Static260.anInt5348; local702++) {
					Static281.method4985(local702, local698, local694);
				}
			}
		}
		Static35.method683();
		Static310.method5336();
		Static312.method5358();
		Static14.method208();
		Static173.aBoolean280 = false;
		Static135.method2292();
		if (Static333.aFrame2 != null && Static81.aClass202_3 != null && Static261.anInt5376 == 25) {
			Static305.aClass1_Sub21_Sub2_3.method5757(138);
			Static305.aClass1_Sub21_Sub2_3.method5702(1057001181);
		}
		if (!Static238.aBoolean402) {
			local698 = (Static177.anInt3736 - (Static43.anInt1151 >> 4)) / 8;
			local702 = (Static177.anInt3736 + (Static43.anInt1151 >> 4)) / 8;
			@Pc(791) int local791 = (Static232.anInt4829 - (Static260.anInt5348 >> 4)) / 8;
			@Pc(800) int local800 = (Static232.anInt4829 + (Static260.anInt5348 >> 4)) / 8;
			for (@Pc(804) int local804 = local698 - 1; local804 <= local702 + 1; local804++) {
				for (@Pc(810) int local810 = local791 - 1; local810 <= local800 + 1; local810++) {
					if (local698 > local804 || local702 < local804 || local791 > local810 || local810 > local800) {
						Static29.aClass134_12.method3024("m" + local804 + "_" + local810);
						Static29.aClass134_12.method3024("l" + local804 + "_" + local810);
					}
				}
			}
		}
		if (Static261.anInt5376 == 28) {
			Static16.method298(10);
		} else {
			Static16.method298(30);
			if (Static81.aClass202_3 != null) {
				Static305.aClass1_Sub21_Sub2_3.method5757(230);
			}
		}
		Static220.method4067();
		Static310.method5336();
		Static228.method4127();
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(IIII)I")
	public static int method1137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg2) {
			return arg0;
		}
		@Pc(17) int local17 = 128 - arg1;
		@Pc(31) int local31 = (arg2 & 0x7F) * arg1 + (arg0 & 0x7F) * local17 >> 7;
		@Pc(45) int local45 = arg1 * (arg2 & 0x380) + (arg0 & 0x380) * local17 >> 7;
		@Pc(64) int local64 = arg1 * (arg2 & 0xFC00) + (arg0 & 0xFC00) * local17 >> 7;
		return local31 & 0x7F | local45 & 0x380 | local64 & 0xFC00;
	}

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
	public static void method1138() {
		if (Static261.anInt5376 == 10 || Static261.anInt5376 == 28) {
			Static35.method678(Static4.anInt41 >> 10, Static177.anInt3734 >> 10);
		} else {
			Static35.method678(Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray387[0] >> 3, Static127.aClass10_Sub1_Sub2_Sub2_1.anIntArray388[0] >> 3);
		}
		Static16.method299();
		Static54.method1096();
		Static275.method4908();
		Static135.method2292();
	}
}
