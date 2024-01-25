import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
	public static int anInt3682;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Lclient!qh;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray32;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_82 = new Class55("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
	public static final int[] anIntArray328 = new int[250];

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method2999() {
		Static285.method3747(false);
		Static395.anInt6313 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static420.aByteArrayArray22.length; local14++) {
			if (Static253.anIntArray367[local14] != -1 && Static420.aByteArrayArray22[local14] == null) {
				Static420.aByteArrayArray22[local14] = Static402.aClass178_123.method3838(0, Static253.anIntArray367[local14]);
				if (Static420.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static395.anInt6313++;
				}
			}
			if (Static48.anIntArray70[local14] != -1 && Static66.aByteArrayArray4[local14] == null) {
				Static66.aByteArrayArray4[local14] = Static402.aClass178_123.method3818(Static48.anIntArray70[local14], 0, Static220.anIntArrayArray29[local14]);
				if (Static66.aByteArrayArray4[local14] == null) {
					Static395.anInt6313++;
					local12 = false;
				}
			}
			if (Static36.anIntArray53[local14] != -1 && Static333.aByteArrayArray14[local14] == null) {
				Static333.aByteArrayArray14[local14] = Static402.aClass178_123.method3838(0, Static36.anIntArray53[local14]);
				if (Static333.aByteArrayArray14[local14] == null) {
					Static395.anInt6313++;
					local12 = false;
				}
			}
			if (Static170.anIntArray421[local14] != -1 && Static155.aByteArrayArray12[local14] == null) {
				Static155.aByteArrayArray12[local14] = Static402.aClass178_123.method3838(0, Static170.anIntArray421[local14]);
				if (Static155.aByteArrayArray12[local14] == null) {
					local12 = false;
					Static395.anInt6313++;
				}
			}
			if (Static401.anIntArray574 != null && Static3.aByteArrayArray1[local14] == null && Static401.anIntArray574[local14] != -1) {
				Static3.aByteArrayArray1[local14] = Static402.aClass178_123.method3818(Static401.anIntArray574[local14], 0, Static220.anIntArrayArray29[local14]);
				if (Static3.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static395.anInt6313++;
				}
			}
		}
		if (Static52.aClass109_1 == null) {
			if (Static35.aClass7_Sub4_Sub9_4 == null || !Static224.aClass178_108.method3828(Static35.aClass7_Sub4_Sub9_4.aString35 + "_staticelements")) {
				Static52.aClass109_1 = new Class109(0);
			} else if (Static224.aClass178_108.method3822(Static35.aClass7_Sub4_Sub9_4.aString35 + "_staticelements")) {
				Static52.aClass109_1 = Static236.method3229(Static35.aClass7_Sub4_Sub9_4.aString35 + "_staticelements", Static87.aBoolean98, Static224.aClass178_108);
			} else {
				local12 = false;
				Static395.anInt6313++;
			}
		}
		if (!local12) {
			Static234.anInt4039 = 1;
			return;
		}
		Static214.anInt2504 = 0;
		local12 = true;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static420.aByteArrayArray22.length; local251++) {
			@Pc(257) byte[] local257 = Static66.aByteArrayArray4[local251];
			if (local257 != null) {
				local270 = (Static331.anIntArray494[local251] >> 8) * 64 - Static359.anInt5713;
				local281 = (Static331.anIntArray494[local251] & 0xFF) * 64 - Static314.anInt5181;
				if (Static97.anInt1979 != 0) {
					local281 = 10;
					local270 = 10;
				}
				local12 &= Static278.method3706(local257, local270, local281, Static102.anInt2086, Static333.anInt3375);
			}
			local257 = Static155.aByteArrayArray12[local251];
			if (local257 != null) {
				local270 = (Static331.anIntArray494[local251] >> 8) * 64 - Static359.anInt5713;
				local281 = (Static331.anIntArray494[local251] & 0xFF) * 64 - Static314.anInt5181;
				if (Static97.anInt1979 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local12 &= Static278.method3706(local257, local270, local281, Static102.anInt2086, Static333.anInt3375);
			}
		}
		if (!local12) {
			Static234.anInt4039 = 2;
			return;
		}
		if (Static234.anInt4039 != 0) {
			Static374.method4823(Static259.aClass63_7, Static10.aClass55_6.method1205(Static5.anInt20) + "<br>(100%)", true);
		}
		Static330.method4331();
		Static69.method1173();
		@Pc(387) boolean local387 = false;
		if (Static269.aClass51_9.method5348() && Static130.aClass153_Sub1_1.aBoolean341) {
			for (local270 = 0; local270 < Static420.aByteArrayArray22.length; local270++) {
				if (Static155.aByteArrayArray12[local270] != null || Static333.aByteArrayArray14[local270] != null) {
					local387 = true;
					break;
				}
			}
		}
		if (Static130.aClass153_Sub1_1.aBoolean343) {
			local270 = Static143.anIntArray242[Static124.anInt2429];
		} else {
			local270 = Static455.anIntArray569[Static124.anInt2429];
		}
		if (Static269.aClass51_9.method5301()) {
			local270++;
		}
		Static185.method2691(Static333.anInt3375, Static102.anInt2086, local270, local387, Static269.aClass51_9.method5290() > 0);
		for (local281 = 0; local281 < 4; local281++) {
			Static179.aClass70Array3[local281].method1703();
		}
		Static206.method2968();
		Static307.method4065(false);
		Static146.method5129();
		Static37.aClass196_1 = null;
		Static330.method4331();
		System.gc();
		Static285.method3747(true);
		Static422.method5378();
		Static374.anInt6086 = Static130.aClass153_Sub1_1.method4217(Static377.anInt6113);
		Static333.aBoolean201 = Static268.anInt4537 >= 96;
		Static410.aBoolean421 = Static130.aClass153_Sub1_1.aBoolean341;
		Static34.aBoolean25 = Static130.aClass153_Sub1_1.method4218(Static377.anInt6113);
		Static331.aBoolean371 = !Static130.aClass153_Sub1_1.aBoolean350;
		Static357.anInt5688 = Static130.aClass153_Sub1_1.method4229(Static377.anInt6113) ? -1 : Static179.anInt7446;
		Static73.aBoolean87 = Static130.aClass153_Sub1_1.aBoolean338;
		Static199.aBoolean214 = Static377.anInt6113 == 1 || Static130.aClass153_Sub1_1.aBoolean348;
		Static386.aClass46_Sub1_2 = new Class46_Sub1(4, Static333.anInt3375, Static102.anInt2086, false);
		if (Static97.anInt1979 == 0) {
			Static440.method5628(Static420.aByteArrayArray22, Static386.aClass46_Sub1_2);
		} else {
			Static406.method5093(Static386.aClass46_Sub1_2, Static420.aByteArrayArray22);
		}
		Static34.method469(Static102.anInt2086 >> 4, Static333.anInt3375 >> 4);
		Static422.method5410();
		if (local387) {
			Static22.method3909(true);
			Static19.aClass46_Sub1_1 = new Class46_Sub1(1, Static333.anInt3375, Static102.anInt2086, true);
			if (Static97.anInt1979 == 0) {
				Static440.method5628(Static333.aByteArrayArray14, Static19.aClass46_Sub1_1);
				Static285.method3747(true);
			} else {
				Static406.method5093(Static19.aClass46_Sub1_1, Static333.aByteArrayArray14);
				Static285.method3747(true);
			}
			Static19.aClass46_Sub1_1.method803(Static386.aClass46_Sub1_2.anIntArrayArrayArray3[0]);
			Static19.aClass46_Sub1_1.method795(null, null, Static269.aClass51_9);
			Static22.method3909(false);
		}
		Static386.aClass46_Sub1_2.method795(local387 ? Static19.aClass46_Sub1_1.anIntArrayArrayArray3 : null, Static179.aClass70Array3, Static269.aClass51_9);
		if (Static97.anInt1979 == 0) {
			Static285.method3747(true);
			Static285.method3748(Static66.aByteArrayArray4, Static386.aClass46_Sub1_2);
			if (Static3.aByteArrayArray1 != null) {
				Static3.method8();
			}
		} else {
			Static285.method3747(true);
			Static61.method855(Static386.aClass46_Sub1_2, Static66.aByteArrayArray4);
		}
		Static69.method1173();
		Static285.method3747(true);
		Static386.aClass46_Sub1_2.method802(null, Static269.aClass51_9, local387 ? Static28.aClass165Array1[0] : null);
		Static386.aClass46_Sub1_2.method815(Static269.aClass51_9);
		Static285.method3747(true);
		if (local387) {
			Static22.method3909(true);
			Static285.method3747(true);
			if (Static97.anInt1979 == 0) {
				Static285.method3748(Static155.aByteArrayArray12, Static19.aClass46_Sub1_1);
			} else {
				Static61.method855(Static19.aClass46_Sub1_1, Static155.aByteArrayArray12);
			}
			Static69.method1173();
			Static285.method3747(true);
			Static19.aClass46_Sub1_1.method802(Static149.aClass165Array7[0], Static269.aClass51_9, null);
			Static19.aClass46_Sub1_1.method815(Static269.aClass51_9);
			Static285.method3747(true);
			Static22.method3909(false);
		}
		Static423.method5440();
		@Pc(727) int local727 = Static386.aClass46_Sub1_2.anInt1050;
		if (Static268.anInt4539 < local727) {
			local727 = Static268.anInt4539;
		}
		if (local727 < Static268.anInt4539 - 1) {
			local727 = Static268.anInt4539 - 1;
		}
		if (Static130.aClass153_Sub1_1.method4229(Static377.anInt6113)) {
			Static13.method115(0);
		} else {
			Static13.method115(local727);
		}
		@Pc(762) int local762;
		@Pc(766) int local766;
		for (@Pc(758) int local758 = 0; local758 < 4; local758++) {
			for (local762 = 0; local762 < Static333.anInt3375; local762++) {
				for (local766 = 0; local766 < Static102.anInt2086; local766++) {
					Static32.method424(local762, local766, local758);
				}
			}
		}
		Static456.method5792();
		Static330.method4331();
		Static95.method1669();
		Static69.method1173();
		Static119.aBoolean133 = false;
		Static276.method3688();
		if (Static452.aFrame5 != null && Static211.aClass247_4 != null && Static206.anInt3642 == 10) {
			Static81.method1414(Static369.aClass2_96);
			Static255.aClass7_Sub14_Sub1_2.method3933(1057001181);
		}
		if (Static97.anInt1979 == 0) {
			local762 = (Static213.anInt3813 - (Static333.anInt3375 >> 4)) / 8;
			local766 = (Static213.anInt3813 + (Static333.anInt3375 >> 4)) / 8;
			@Pc(850) int local850 = (Static323.anInt5346 - (Static102.anInt2086 >> 4)) / 8;
			@Pc(858) int local858 = ((Static102.anInt2086 >> 4) + Static323.anInt5346) / 8;
			for (@Pc(862) int local862 = local762 - 1; local862 <= local766 + 1; local862++) {
				for (@Pc(868) int local868 = local850 - 1; local868 <= local858 + 1; local868++) {
					if (local762 > local862 || local862 > local766 || local868 < local850 || local858 < local868) {
						Static402.aClass178_123.method3816("m" + local862 + "_" + local868);
						Static402.aClass178_123.method3816("l" + local862 + "_" + local868);
					}
				}
			}
		}
		if (Static206.anInt3642 == 3) {
			Static138.method2151(2);
		} else if (Static206.anInt3642 == 7) {
			Static138.method2151(6);
		} else {
			Static138.method2151(9);
			if (Static211.aClass247_4 != null) {
				Static81.method1414(Static57.aClass2_19);
			}
		}
		Static371.method4757();
		Static330.method4331();
		Static309.method4075();
	}
}
