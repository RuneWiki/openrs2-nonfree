import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "[F")
	public static final float[] aFloatArray46 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!kw", name = "B", descriptor = "I")
	public static int anInt4935 = 0;

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	public static void method4154() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static40.aClass243Array1[local3] = null;
		}
		Static255.anInt4255 = 0;
	}

	@OriginalMember(owner = "client!kw", name = "i", descriptor = "(I)V")
	public static void method4156() {
		Static333.method4776(false);
		Static455.anInt7311 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static571.aByteArrayArray23.length; local14++) {
			if (Static327.anIntArray374[local14] != -1 && Static571.aByteArrayArray23[local14] == null) {
				Static571.aByteArrayArray23[local14] = Static372.aClass229_89.method4980(Static327.anIntArray374[local14], 0);
				if (Static571.aByteArrayArray23[local14] == null) {
					local12 = false;
					Static455.anInt7311++;
				}
			}
			if (Static196.anIntArray240[local14] != -1 && Static210.aByteArrayArray9[local14] == null) {
				Static210.aByteArrayArray9[local14] = Static372.aClass229_89.method4970(Static196.anIntArray240[local14], 0, Static378.anIntArrayArray44[local14]);
				if (Static210.aByteArrayArray9[local14] == null) {
					Static455.anInt7311++;
					local12 = false;
				}
			}
			if (Static420.anIntArray479[local14] != -1 && Static396.aByteArrayArray15[local14] == null) {
				Static396.aByteArrayArray15[local14] = Static372.aClass229_89.method4980(Static420.anIntArray479[local14], 0);
				if (Static396.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static455.anInt7311++;
				}
			}
			if (Static491.anIntArray519[local14] != -1 && Static418.aByteArrayArray17[local14] == null) {
				Static418.aByteArrayArray17[local14] = Static372.aClass229_89.method4980(Static491.anIntArray519[local14], 0);
				if (Static418.aByteArrayArray17[local14] == null) {
					local12 = false;
					Static455.anInt7311++;
				}
			}
			if (Static336.anIntArray377 != null && Static26.aByteArrayArray1[local14] == null && Static336.anIntArray377[local14] != -1) {
				Static26.aByteArrayArray1[local14] = Static372.aClass229_89.method4970(Static336.anIntArray377[local14], 0, Static378.anIntArrayArray44[local14]);
				if (Static26.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static455.anInt7311++;
				}
			}
		}
		if (Static170.aClass214_1 == null) {
			if (Static367.aClass2_Sub2_Sub9_1 == null || !Static237.aClass229_52.method4951(Static367.aClass2_Sub2_Sub9_1.aString47 + "_staticelements")) {
				Static170.aClass214_1 = new Class214(0);
			} else if (Static237.aClass229_52.method4959(Static367.aClass2_Sub2_Sub9_1.aString47 + "_staticelements")) {
				Static170.aClass214_1 = Static134.method1814(Static367.aClass2_Sub2_Sub9_1.aString47 + "_staticelements", Static524.aBoolean704, Static237.aClass229_52);
			} else {
				Static455.anInt7311++;
				local12 = false;
			}
		}
		if (!local12) {
			Static422.anInt6896 = 1;
			return;
		}
		Static449.anInt7191 = 0;
		local12 = true;
		@Pc(276) int local276;
		@Pc(287) int local287;
		for (@Pc(257) int local257 = 0; local257 < Static571.aByteArrayArray23.length; local257++) {
			@Pc(263) byte[] local263 = Static210.aByteArrayArray9[local257];
			if (local263 != null) {
				local276 = (Static301.anIntArray349[local257] >> 8) * 64 - Static485.anInt7725;
				local287 = (Static301.anIntArray349[local257] & 0xFF) * 64 - Static310.anInt5129;
				if (Static386.anInt6384 != 0) {
					local276 = 10;
					local287 = 10;
				}
				local12 &= Static321.method4665(local263, Static281.anInt4822, Static29.anInt491, local287, local276);
			}
			local263 = Static418.aByteArrayArray17[local257];
			if (local263 != null) {
				local276 = (Static301.anIntArray349[local257] >> 8) * 64 - Static485.anInt7725;
				local287 = (Static301.anIntArray349[local257] & 0xFF) * 64 - Static310.anInt5129;
				if (Static386.anInt6384 != 0) {
					local287 = 10;
					local276 = 10;
				}
				local12 &= Static321.method4665(local263, Static281.anInt4822, Static29.anInt491, local287, local276);
			}
		}
		if (!local12) {
			Static422.anInt6896 = 2;
			return;
		}
		if (Static422.anInt6896 != 0) {
			Static96.method1453(Static322.aClass37_20, Static229.aClass159_14.method2776(Static261.anInt4297) + "<br>(100%)", Static417.aClass162_17, true, Static266.aClass112_7);
		}
		Static574.method7450();
		Static507.method6604();
		@Pc(394) boolean local394 = false;
		if (Static417.aClass162_17.method6837() && Static257.aClass2_Sub35_Sub1_1.aBoolean634) {
			for (local276 = 0; local276 < Static571.aByteArrayArray23.length; local276++) {
				if (Static418.aByteArrayArray17[local276] != null || Static396.aByteArrayArray15[local276] != null) {
					local394 = true;
					break;
				}
			}
		}
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean633) {
			local276 = Static492.anIntArray520[Static516.anInt8250];
		} else {
			local276 = Static552.anIntArray591[Static516.anInt8250];
		}
		if (Static417.aClass162_17.method6872()) {
			local276++;
		}
		Static392.method5402(Static417.aClass162_17, Static340.anInt5888, Static281.anInt4822, Static29.anInt491, local276, local394, Static417.aClass162_17.method6851() > 0);
		Static80.method1231(Static295.anInt4973);
		if (Static295.anInt4973 == 0) {
			Static138.method1910(null);
		} else {
			Static138.method1910(Static71.aClass37_11);
		}
		for (local287 = 0; local287 < 4; local287++) {
			Static87.aClass362Array3[local287].method7592();
		}
		Static167.method2196();
		Static458.method5947(false);
		Static88.method1302();
		Static332.aBoolean803 = false;
		Static320.aClass358_1 = null;
		Static574.method7450();
		System.gc();
		Static333.method4776(true);
		Static473.method6136();
		Static284.anInt4832 = Static257.aClass2_Sub35_Sub1_1.method6037(Static226.anInt3318);
		Static359.aBoolean228 = Static257.aClass2_Sub35_Sub1_1.aBoolean634;
		Static180.aBoolean188 = Static326.anInt7462 >= 96;
		Static343.aBoolean469 = Static257.aClass2_Sub35_Sub1_1.method6036(Static226.anInt3318);
		Static207.aBoolean217 = !Static257.aClass2_Sub35_Sub1_1.aBoolean637;
		Static238.anInt3979 = Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318) ? -1 : Static487.anInt7738;
		Static243.aBoolean302 = Static530.method6928(Static226.anInt3318) || Static257.aClass2_Sub35_Sub1_1.aBoolean629;
		Static156.aBoolean174 = Static257.aClass2_Sub35_Sub1_1.aBoolean624;
		Static370.aClass50_Sub1_1 = new Class50_Sub1(4, Static281.anInt4822, Static29.anInt491, false);
		if (Static386.anInt6384 == 0) {
			Static349.method5584(Static370.aClass50_Sub1_1, Static571.aByteArrayArray23);
		} else {
			Static252.method3606(Static370.aClass50_Sub1_1, Static571.aByteArrayArray23);
		}
		Static422.method5656(Static281.anInt4822 >> 4, Static29.anInt491 >> 4);
		Static390.method5391();
		if (local394) {
			Static128.method1758(true);
			Static481.aClass50_Sub1_2 = new Class50_Sub1(1, Static281.anInt4822, Static29.anInt491, true);
			if (Static386.anInt6384 == 0) {
				Static349.method5584(Static481.aClass50_Sub1_2, Static396.aByteArrayArray15);
				Static333.method4776(true);
			} else {
				Static252.method3606(Static481.aClass50_Sub1_2, Static396.aByteArrayArray15);
				Static333.method4776(true);
			}
			Static481.aClass50_Sub1_2.method1049(Static370.aClass50_Sub1_1.anIntArrayArrayArray3[0]);
			Static481.aClass50_Sub1_2.method1044(null, Static417.aClass162_17, null);
			Static128.method1758(false);
		}
		Static370.aClass50_Sub1_1.method1044(local394 ? Static481.aClass50_Sub1_2.anIntArrayArrayArray3 : null, Static417.aClass162_17, Static87.aClass362Array3);
		if (Static386.anInt6384 == 0) {
			Static333.method4776(true);
			Static53.method7497(Static210.aByteArrayArray9, Static370.aClass50_Sub1_1);
			if (Static26.aByteArrayArray1 != null) {
				Static18.method3527();
			}
		} else {
			Static333.method4776(true);
			Static254.method5833(Static370.aClass50_Sub1_1, Static210.aByteArrayArray9);
		}
		Static507.method6604();
		if (Static326.anInt7462 < 96) {
			Static426.method5673();
		}
		Static333.method4776(true);
		Static370.aClass50_Sub1_1.method1048(null, local394 ? Static320.aClass151Array3[0] : null, Static417.aClass162_17);
		Static370.aClass50_Sub1_1.method1060(false, Static417.aClass162_17);
		Static333.method4776(true);
		if (local394) {
			Static128.method1758(true);
			Static333.method4776(true);
			if (Static386.anInt6384 == 0) {
				Static53.method7497(Static418.aByteArrayArray17, Static481.aClass50_Sub1_2);
			} else {
				Static254.method5833(Static481.aClass50_Sub1_2, Static418.aByteArrayArray17);
			}
			Static507.method6604();
			Static333.method4776(true);
			Static481.aClass50_Sub1_2.method1048(Static261.aClass151Array2[0], null, Static417.aClass162_17);
			Static481.aClass50_Sub1_2.method1060(true, Static417.aClass162_17);
			Static333.method4776(true);
			Static128.method1758(false);
		}
		Static479.method6200();
		@Pc(750) int local750 = Static370.aClass50_Sub1_1.anInt1122;
		if (Static402.anInt6620 < local750) {
			local750 = Static402.anInt6620;
		}
		if (local750 < Static402.anInt6620 - 1) {
			local750 = Static402.anInt6620 - 1;
		}
		if (Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318)) {
			Static468.method6021(0);
		} else {
			Static468.method6021(local750);
		}
		@Pc(785) int local785;
		@Pc(789) int local789;
		for (@Pc(781) int local781 = 0; local781 < 4; local781++) {
			for (local785 = 0; local785 < Static281.anInt4822; local785++) {
				for (local789 = 0; local789 < Static29.anInt491; local789++) {
					Static570.method7436(local781, local789, local785);
				}
			}
		}
		Static498.method6450();
		Static574.method7450();
		Static105.method4641();
		Static507.method6604();
		Static344.method5011();
		@Pc(838) Class2_Sub34 local838;
		if (Static223.aFrame2 != null && Static529.aClass124_2 != null && Static540.anInt8912 == 11) {
			local838 = Static555.method7264(Static111.aClass154_21, Static551.aClass64_2);
			local838.aClass2_Sub7_Sub2_2.method4495(1057001181);
			Static100.method1508(local838);
		}
		if (Static386.anInt6384 == 0) {
			local785 = (Static434.anInt6974 - (Static281.anInt4822 >> 4)) / 8;
			local789 = (Static434.anInt6974 + (Static281.anInt4822 >> 4)) / 8;
			@Pc(877) int local877 = (Static79.anInt7835 - (Static29.anInt491 >> 4)) / 8;
			@Pc(886) int local886 = (Static79.anInt7835 + (Static29.anInt491 >> 4)) / 8;
			for (@Pc(890) int local890 = local785 - 1; local890 <= local789 + 1; local890++) {
				for (@Pc(896) int local896 = local877 - 1; local896 <= local886 + 1; local896++) {
					if (local785 > local890 || local789 < local890 || local877 > local896 || local896 > local886) {
						Static372.aClass229_89.method4971("m" + local890 + "_" + local896);
						Static372.aClass229_89.method4971("l" + local890 + "_" + local896);
					}
				}
			}
		}
		if (Static540.anInt8912 == 4) {
			Static115.method1686(3);
		} else if (Static540.anInt8912 == 8) {
			Static115.method1686(7);
		} else {
			Static115.method1686(10);
			if (Static529.aClass124_2 != null) {
				local838 = Static555.method7264(Static246.aClass154_51, Static551.aClass64_2);
				Static100.method1508(local838);
			}
		}
		Static488.method6257();
		Static574.method7450();
		Static524.method6734();
		if (Static593.aBoolean805) {
			Static144.method1990("Took: " + (Static362.method5133() - Static143.aLong204) + "ms");
			Static593.aBoolean805 = false;
		}
	}
}
