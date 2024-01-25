import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!w", name = "M", descriptor = "Lclient!cd;")
	public static Class48 aClass48_2;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "Lclient!it;")
	public static Class28 aClass28_34;

	@OriginalMember(owner = "client!w", name = "F", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_160 = new Class337(23, 8);

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(I)V")
	public static void method8778() {
		Static232.method3875(false);
		if (Static230.anInt4251 >= 0 && Static230.anInt4251 != 0) {
			Static638.method9004(Static230.anInt4251, false);
			Static230.anInt4251 = -1;
		}
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	public static void method8780() {
		Static33.method520(false);
		Static226.anInt10417 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static511.aByteArrayArray22.length; local14++) {
			if (Static518.anIntArray491[local14] != -1 && Static511.aByteArrayArray22[local14] == null) {
				Static511.aByteArrayArray22[local14] = Static17.aClass207_6.method4681(Static518.anIntArray491[local14], 0);
				if (Static511.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static226.anInt10417++;
				}
			}
			if (Static499.anIntArray574[local14] != -1 && Static172.aByteArrayArray8[local14] == null) {
				Static172.aByteArrayArray8[local14] = Static17.aClass207_6.method4673(Static275.anIntArrayArray30[local14], 0, Static499.anIntArray574[local14]);
				if (Static172.aByteArrayArray8[local14] == null) {
					Static226.anInt10417++;
					local12 = false;
				}
			}
			if (Static239.anIntArray219[local14] != -1 && Static499.aByteArrayArray26[local14] == null) {
				Static499.aByteArrayArray26[local14] = Static17.aClass207_6.method4681(Static239.anIntArray219[local14], 0);
				if (Static499.aByteArrayArray26[local14] == null) {
					Static226.anInt10417++;
					local12 = false;
				}
			}
			if (Static108.anIntArray127[local14] != -1 && Static641.aByteArrayArray31[local14] == null) {
				Static641.aByteArrayArray31[local14] = Static17.aClass207_6.method4681(Static108.anIntArray127[local14], 0);
				if (Static641.aByteArrayArray31[local14] == null) {
					local12 = false;
					Static226.anInt10417++;
				}
			}
			if (Static136.anIntArray144 != null && Static598.aByteArrayArray28[local14] == null && Static136.anIntArray144[local14] != -1) {
				Static598.aByteArrayArray28[local14] = Static17.aClass207_6.method4673(Static275.anIntArrayArray30[local14], 0, Static136.anIntArray144[local14]);
				if (Static598.aByteArrayArray28[local14] == null) {
					local12 = false;
					Static226.anInt10417++;
				}
			}
		}
		if (Static646.aClass378_6 == null) {
			if (Static519.aClass5_Sub5_Sub16_3 == null || !Static56.aClass207_16.method4665(Static519.aClass5_Sub5_Sub16_3.aString80 + "_staticelements")) {
				Static646.aClass378_6 = new Class378(0);
			} else if (Static56.aClass207_16.method4699(Static519.aClass5_Sub5_Sub16_3.aString80 + "_staticelements")) {
				Static646.aClass378_6 = Static576.method8349(Static56.aClass207_16, Static519.aClass5_Sub5_Sub16_3.aString80 + "_staticelements", Static283.aBoolean377);
			} else {
				local12 = false;
				Static226.anInt10417++;
			}
		}
		if (!local12) {
			Static607.anInt9468 = 1;
			return;
		}
		local12 = true;
		Static143.anInt2485 = 0;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(246) int local246 = 0; local246 < Static511.aByteArrayArray22.length; local246++) {
			@Pc(252) byte[] local252 = Static172.aByteArrayArray8[local246];
			if (local252 != null) {
				local265 = (Static312.anIntArray597[local246] >> 8) * 64 - Static565.anInt9560;
				local276 = (Static312.anIntArray597[local246] & 0xFF) * 64 - Static567.anInt9589;
				if (Static412.anInt7175 != 0) {
					local265 = 10;
					local276 = 10;
				}
				local12 &= Static608.method8683(Static448.anInt7637, local265, Static326.anInt5541, local252, local276);
			}
			local252 = Static641.aByteArrayArray31[local246];
			if (local252 != null) {
				local265 = (Static312.anIntArray597[local246] >> 8) * 64 - Static565.anInt9560;
				local276 = (Static312.anIntArray597[local246] & 0xFF) * 64 - Static567.anInt9589;
				if (Static412.anInt7175 != 0) {
					local276 = 10;
					local265 = 10;
				}
				local12 &= Static608.method8683(Static448.anInt7637, local265, Static326.anInt5541, local252, local276);
			}
		}
		if (!local12) {
			Static607.anInt9468 = 2;
			return;
		}
		if (Static607.anInt9468 != 0) {
			Static462.method6852(Static199.aClass272_7, Static174.aClass120_12.method2690(Static266.anInt4796) + "<br>(100%)", Static213.aClass133_5, Static281.aClass55_8, true);
		}
		Static229.method3856();
		Static573.method2148();
		Static406.method6286();
		@Pc(381) boolean local381 = false;
		if (Static213.aClass133_5.method7254() && Static97.aClass5_Sub25_8.aClass6_Sub25_1.method7878() == 2) {
			for (local265 = 0; local265 < Static511.aByteArrayArray22.length; local265++) {
				if (Static641.aByteArrayArray31[local265] != null || Static499.aByteArrayArray26[local265] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub2_1.method114() == 1) {
			local265 = Static212.anIntArray202[Static102.anInt1994];
		} else {
			local265 = Static86.anIntArray116[Static102.anInt1994];
		}
		if (Static213.aClass133_5.method7237()) {
			local265++;
		}
		Static421.method6389(Static213.aClass133_5, Static141.anInt2453, Static326.anInt5541, Static448.anInt7637, local265, local381, Static213.aClass133_5.method7245() > 0);
		Static134.method1988(Static452.anInt7708);
		if (Static452.anInt7708 == 0) {
			Static318.method4860(null);
		} else {
			Static318.method4860(Static602.aClass55_16);
		}
		for (local276 = 0; local276 < 4; local276++) {
			Static322.aClass352Array1[local276].method8347();
		}
		Static386.method5646();
		Static155.method1875(false);
		Static120.method1843();
		Static360.aClass64_1 = null;
		Static343.aBoolean419 = false;
		Static229.method3856();
		System.gc();
		Static33.method520(true);
		Static10.method203();
		Static268.anInt4813 = Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542();
		Static506.aBoolean649 = Static110.anInt2065 >= 96;
		Static214.aBoolean304 = Static97.aClass5_Sub25_8.aClass6_Sub25_1.method7878() == 2;
		Static513.aBoolean54 = Static97.aClass5_Sub25_8.aClass6_Sub17_1.method5097() == 1;
		Static149.anInt2602 = Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 1 ? -1 : Static173.anInt3110;
		Static589.aBoolean383 = Static97.aClass5_Sub25_8.aClass6_Sub10_1.method2365() == 1;
		Static633.aBoolean756 = Static97.aClass5_Sub25_8.aClass6_Sub16_1.method4732() == 1;
		Static294.aClass104_Sub1_1 = new Class104_Sub1(4, Static326.anInt5541, Static448.anInt7637, false);
		if (Static412.anInt7175 == 0) {
			Static613.method8741(Static511.aByteArrayArray22, Static294.aClass104_Sub1_1);
		} else {
			Static400.method5972(Static294.aClass104_Sub1_1, Static511.aByteArrayArray22);
		}
		Static226.method8861(Static448.anInt7637 >> 4, Static326.anInt5541 >> 4);
		Static293.method4587();
		if (local381) {
			Static350.method8738(true);
			Static632.aClass104_Sub1_2 = new Class104_Sub1(1, Static326.anInt5541, Static448.anInt7637, true);
			if (Static412.anInt7175 == 0) {
				Static613.method8741(Static499.aByteArrayArray26, Static632.aClass104_Sub1_2);
				Static33.method520(true);
			} else {
				Static400.method5972(Static632.aClass104_Sub1_2, Static499.aByteArrayArray26);
				Static33.method520(true);
			}
			Static632.aClass104_Sub1_2.method2159(Static294.aClass104_Sub1_1.anIntArrayArrayArray2[0]);
			Static632.aClass104_Sub1_2.method2155(Static213.aClass133_5, null, null);
			Static350.method8738(false);
		}
		Static294.aClass104_Sub1_1.method2155(Static213.aClass133_5, Static322.aClass352Array1, local381 ? Static632.aClass104_Sub1_2.anIntArrayArrayArray2 : null);
		if (Static412.anInt7175 == 0) {
			Static33.method520(true);
			Static559.method8126(Static294.aClass104_Sub1_1, Static172.aByteArrayArray8);
			if (Static598.aByteArrayArray28 != null) {
				Static458.method6827();
			}
		} else {
			Static33.method520(true);
			Static457.method6817(Static294.aClass104_Sub1_1, Static172.aByteArrayArray8);
		}
		Static573.method2148();
		if (Static110.anInt2065 < 96) {
			Static209.method3593();
		}
		Static33.method520(true);
		Static294.aClass104_Sub1_1.method2158(Static213.aClass133_5, local381 ? Static456.aClass61Array3[0] : null, null);
		Static294.aClass104_Sub1_1.method2166(false, Static213.aClass133_5);
		Static33.method520(true);
		if (local381) {
			Static350.method8738(true);
			Static33.method520(true);
			if (Static412.anInt7175 == 0) {
				Static559.method8126(Static632.aClass104_Sub1_2, Static641.aByteArrayArray31);
			} else {
				Static457.method6817(Static632.aClass104_Sub1_2, Static641.aByteArrayArray31);
			}
			Static573.method2148();
			Static33.method520(true);
			Static632.aClass104_Sub1_2.method2158(Static213.aClass133_5, null, Static20.aClass61Array2[0]);
			Static632.aClass104_Sub1_2.method2166(true, Static213.aClass133_5);
			Static33.method520(true);
			Static350.method8738(false);
		}
		Static45.method796();
		@Pc(765) int local765 = Static294.aClass104_Sub1_1.anInt2543;
		if (local765 > Static636.anInt10567) {
			local765 = Static636.anInt10567;
		}
		if (local765 < Static636.anInt10567 - 1) {
			local765 = Static636.anInt10567 - 1;
		}
		if (Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 0) {
			Static239.method3985(local765);
		} else {
			Static239.method3985(0);
		}
		@Pc(800) int local800;
		@Pc(804) int local804;
		for (@Pc(796) int local796 = 0; local796 < 4; local796++) {
			for (local800 = 0; local800 < Static326.anInt5541; local800++) {
				for (local804 = 0; local804 < Static448.anInt7637; local804++) {
					Static85.method1401(local800, local804, local796);
				}
			}
		}
		Static38.method7895();
		Static229.method3856();
		Static295.method4598();
		Static573.method2148();
		Static392.method5819();
		@Pc(853) Class5_Sub48 local853;
		if (Static190.aFrame1 != null && Static495.aClass170_2 != null && Static151.anInt2620 == 11) {
			local853 = Static16.method232(Static398.aClass46_73, Static276.aClass251_2);
			local853.aClass5_Sub22_Sub1_2.method5949(1057001181);
			Static277.method4436(local853);
		}
		if (Static412.anInt7175 == 0) {
			local800 = (Static613.anInt10268 - (Static326.anInt5541 >> 4)) / 8;
			local804 = (Static613.anInt10268 + (Static326.anInt5541 >> 4)) / 8;
			@Pc(892) int local892 = (Static233.anInt4295 - (Static448.anInt7637 >> 4)) / 8;
			@Pc(900) int local900 = (Static233.anInt4295 + (Static448.anInt7637 >> 4)) / 8;
			for (@Pc(904) int local904 = local800 - 1; local904 <= local804 + 1; local904++) {
				for (@Pc(910) int local910 = local892 - 1; local910 <= local900 + 1; local910++) {
					if (local904 < local800 || local904 > local804 || local892 > local910 || local900 < local910) {
						Static17.aClass207_6.method4679("m" + local904 + "_" + local910);
						Static17.aClass207_6.method4679("l" + local904 + "_" + local910);
					}
				}
			}
		}
		if (Static151.anInt2620 == 4) {
			Static358.method5312(3);
		} else if (Static151.anInt2620 == 8) {
			Static358.method5312(7);
		} else {
			Static358.method5312(10);
			if (Static495.aClass170_2 != null) {
				local853 = Static16.method232(Static429.aClass46_83, Static276.aClass251_2);
				Static277.method4436(local853);
			}
		}
		Static106.method1674();
		Static229.method3856();
		Static88.method1488();
		Static28.aBoolean15 = true;
		if (Static559.aBoolean674) {
			Static83.method6024("Took: " + (Static95.method1587() - Static204.aLong98) + "ms");
			Static559.aBoolean674 = false;
		}
	}
}
