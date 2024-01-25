import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!vr", name = "ub", descriptor = "[S")
	public static short[] aShortArray132;

	@OriginalMember(owner = "client!vr", name = "R", descriptor = "I")
	public static int anInt9950 = -1;

	@OriginalMember(owner = "client!vr", name = "W", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_118 = new Class173(72, 1);

	@OriginalMember(owner = "client!vr", name = "vb", descriptor = "Z")
	public static boolean aBoolean701 = false;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)I")
	public static int method8135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = arg0 / arg1;
		@Pc(18) int local18 = arg1 - 1 & arg0;
		@Pc(22) int local22 = arg2 / arg1;
		@Pc(28) int local28 = arg1 - 1 & arg2;
		@Pc(33) int local33 = Static254.method4092(local12, local22);
		@Pc(40) int local40 = Static254.method4092(local12 + 1, local22);
		@Pc(47) int local47 = Static254.method4092(local12, local22 + 1);
		@Pc(56) int local56 = Static254.method4092(local12 + 1, local22 + 1);
		@Pc(63) int local63 = Static177.method7480(local18, local40, local33, arg1);
		@Pc(70) int local70 = Static177.method7480(local18, local56, local47, arg1);
		return Static177.method7480(local28, local70, local63, arg1);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZ)Z")
	public static boolean method8138(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIILclient!kj;)V")
	public static void method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub4_Sub4 arg3) {
		@Pc(4) Class53 local4 = Static351.method7422(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass1_Sub4_Sub4_1 = arg3;
		@Pc(16) int local16 = Static499.aClass83Array3 == Static183.aClass83Array6 ? 1 : 0;
		if (arg3.method8118()) {
			if (arg3.method8128()) {
				Static343.aClass1_Sub4ArrayArray3[local16][Static291.anIntArray291[local16]++] = arg3;
				return;
			}
			Static124.aClass1_Sub4ArrayArray4[local16][Static156.anIntArray148[local16]++] = arg3;
			return;
		}
		Static27.aClass1_Sub4ArrayArray1[local16][Static2.anIntArray3[local16]++] = arg3;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
	public static void method8140() {
		Static419.method6560(false);
		Static177.anInt9181 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static160.aByteArrayArray10.length; local14++) {
			if (Static542.anIntArray516[local14] != -1 && Static160.aByteArrayArray10[local14] == null) {
				Static160.aByteArrayArray10[local14] = Static261.aClass176_69.method3994(0, Static542.anIntArray516[local14]);
				if (Static160.aByteArrayArray10[local14] == null) {
					local12 = false;
					Static177.anInt9181++;
				}
			}
			if (Static125.anIntArray128[local14] != -1 && Static85.aByteArrayArray6[local14] == null) {
				Static85.aByteArrayArray6[local14] = Static261.aClass176_69.method3981(Static498.anIntArrayArray55[local14], 0, Static125.anIntArray128[local14]);
				if (Static85.aByteArrayArray6[local14] == null) {
					Static177.anInt9181++;
					local12 = false;
				}
			}
			if (Static407.anIntArray393[local14] != -1 && Static24.aByteArrayArray1[local14] == null) {
				Static24.aByteArrayArray1[local14] = Static261.aClass176_69.method3994(0, Static407.anIntArray393[local14]);
				if (Static24.aByteArrayArray1[local14] == null) {
					local12 = false;
					Static177.anInt9181++;
				}
			}
			if (Static172.anIntArray164[local14] != -1 && Static28.aByteArrayArray2[local14] == null) {
				Static28.aByteArrayArray2[local14] = Static261.aClass176_69.method3994(0, Static172.anIntArray164[local14]);
				if (Static28.aByteArrayArray2[local14] == null) {
					Static177.anInt9181++;
					local12 = false;
				}
			}
			if (Static83.anIntArray82 != null && Static215.aByteArrayArray13[local14] == null && Static83.anIntArray82[local14] != -1) {
				Static215.aByteArrayArray13[local14] = Static261.aClass176_69.method3981(Static498.anIntArrayArray55[local14], 0, Static83.anIntArray82[local14]);
				if (Static215.aByteArrayArray13[local14] == null) {
					Static177.anInt9181++;
					local12 = false;
				}
			}
		}
		if (Static71.aClass59_1 == null) {
			if (Static383.aClass4_Sub5_Sub8_3 == null || !Static12.aClass176_6.method4001(Static383.aClass4_Sub5_Sub8_3.aString35 + "_staticelements")) {
				Static71.aClass59_1 = new Class59(0);
			} else if (Static12.aClass176_6.method4004(Static383.aClass4_Sub5_Sub8_3.aString35 + "_staticelements")) {
				Static71.aClass59_1 = Static336.method5506(Static383.aClass4_Sub5_Sub8_3.aString35 + "_staticelements", Static475.aBoolean431, Static12.aClass176_6);
			} else {
				Static177.anInt9181++;
				local12 = false;
			}
		}
		if (!local12) {
			Static318.anInt6250 = 1;
			return;
		}
		Static149.anInt3137 = 0;
		local12 = true;
		@Pc(267) int local267;
		@Pc(277) int local277;
		for (@Pc(248) int local248 = 0; local248 < Static160.aByteArrayArray10.length; local248++) {
			@Pc(254) byte[] local254 = Static85.aByteArrayArray6[local248];
			if (local254 != null) {
				local267 = (Static75.anIntArray18[local248] >> 8) * 64 - Static552.anInt9805;
				local277 = (Static75.anIntArray18[local248] & 0xFF) * 64 - Static254.anInt4667;
				if (Static358.anInt6981 != 0) {
					local277 = 10;
					local267 = 10;
				}
				local12 &= Static503.method7395(Static119.anInt2717, local277, local254, local267, Static428.anInt8046);
			}
			local254 = Static28.aByteArrayArray2[local248];
			if (local254 != null) {
				local267 = (Static75.anIntArray18[local248] >> 8) * 64 - Static552.anInt9805;
				local277 = (Static75.anIntArray18[local248] & 0xFF) * 64 - Static254.anInt4667;
				if (Static358.anInt6981 != 0) {
					local277 = 10;
					local267 = 10;
				}
				local12 &= Static503.method7395(Static119.anInt2717, local277, local254, local267, Static428.anInt8046);
			}
		}
		if (!local12) {
			Static318.anInt6250 = 2;
			return;
		}
		if (Static318.anInt6250 != 0) {
			Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, true, Static238.aClass114_9, Static590.aClass364_16.method8334(Static154.anInt3181) + "<br>(100%)");
		}
		Static390.method6204();
		Static28.method361();
		@Pc(377) boolean local377 = false;
		if (Static440.aClass44_12.method5008() && Static214.aClass4_Sub19_Sub1_1.aBoolean261) {
			for (local267 = 0; local267 < Static160.aByteArrayArray10.length; local267++) {
				if (Static28.aByteArrayArray2[local267] != null || Static24.aByteArrayArray1[local267] != null) {
					local377 = true;
					break;
				}
			}
		}
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean266) {
			local267 = Static410.anIntArray406[Static383.anInt7366];
		} else {
			local267 = Static121.anIntArray127[Static383.anInt7366];
		}
		if (Static440.aClass44_12.method5004()) {
			local267++;
		}
		Static460.method7016(Static440.aClass44_12, Static317.anInt10277, Static428.anInt8046, Static119.anInt2717, local267, local377, Static440.aClass44_12.method4972() > 0);
		if (Static478.aBoolean620) {
			Static32.method443(Static454.aClass58_13);
		} else {
			Static32.method443(null);
		}
		for (local277 = 0; local277 < 4; local277++) {
			Static86.aClass111Array1[local277].method2855();
		}
		Static352.method5698();
		Static174.method3171(false);
		Static167.method3084();
		Static438.aBoolean569 = false;
		Static529.aClass215_1 = null;
		Static390.method6204();
		System.gc();
		Static419.method6560(true);
		Static157.method2912();
		Static332.anInt6371 = Static214.aClass4_Sub19_Sub1_1.method2774(Static495.anInt9000);
		Static188.aBoolean290 = Static214.aClass4_Sub19_Sub1_1.aBoolean261;
		Static370.aBoolean507 = Static577.anInt10067 >= 96;
		Static155.aBoolean280 = Static214.aClass4_Sub19_Sub1_1.method2771(Static495.anInt9000);
		Static515.aBoolean641 = !Static214.aClass4_Sub19_Sub1_1.aBoolean252;
		Static574.anInt10049 = Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000) ? -1 : Static223.anInt4078;
		Static44.aBoolean32 = Static314.method5296(Static495.anInt9000) || Static214.aClass4_Sub19_Sub1_1.aBoolean262;
		Static282.aBoolean332 = Static214.aClass4_Sub19_Sub1_1.aBoolean256;
		Static130.aClass179_Sub1_3 = new Class179_Sub1(4, Static428.anInt8046, Static119.anInt2717, false);
		if (Static358.anInt6981 == 0) {
			Static446.method6891(Static160.aByteArrayArray10, Static130.aClass179_Sub1_3);
		} else {
			Static122.method2551(Static160.aByteArrayArray10, Static130.aClass179_Sub1_3);
		}
		Static398.method6286(Static428.anInt8046 >> 4, Static119.anInt2717 >> 4);
		Static239.method7074();
		if (local377) {
			Static45.method566(true);
			Static75.aClass179_Sub1_2 = new Class179_Sub1(1, Static428.anInt8046, Static119.anInt2717, true);
			if (Static358.anInt6981 == 0) {
				Static446.method6891(Static24.aByteArrayArray1, Static75.aClass179_Sub1_2);
				Static419.method6560(true);
			} else {
				Static122.method2551(Static24.aByteArrayArray1, Static75.aClass179_Sub1_2);
				Static419.method6560(true);
			}
			Static75.aClass179_Sub1_2.method4061(Static130.aClass179_Sub1_3.anIntArrayArrayArray12[0]);
			Static75.aClass179_Sub1_2.method4059(null, Static440.aClass44_12, null);
			Static45.method566(false);
		}
		Static130.aClass179_Sub1_3.method4059(local377 ? Static75.aClass179_Sub1_2.anIntArrayArrayArray12 : null, Static440.aClass44_12, Static86.aClass111Array1);
		if (Static358.anInt6981 == 0) {
			Static419.method6560(true);
			Static106.method2280(Static130.aClass179_Sub1_3, Static85.aByteArrayArray6);
			if (Static215.aByteArrayArray13 != null) {
				Static376.method6005();
			}
		} else {
			Static419.method6560(true);
			Static168.method3086(Static85.aByteArrayArray6, Static130.aClass179_Sub1_3);
		}
		Static28.method361();
		if (Static577.anInt10067 < 96) {
			Static404.method6351();
		}
		Static419.method6560(true);
		Static130.aClass179_Sub1_3.method4063(null, Static440.aClass44_12, local377 ? Static183.aClass83Array6[0] : null);
		Static130.aClass179_Sub1_3.method4078(Static440.aClass44_12, false);
		Static419.method6560(true);
		if (local377) {
			Static45.method566(true);
			Static419.method6560(true);
			if (Static358.anInt6981 == 0) {
				Static106.method2280(Static75.aClass179_Sub1_2, Static28.aByteArrayArray2);
			} else {
				Static168.method3086(Static28.aByteArrayArray2, Static75.aClass179_Sub1_2);
			}
			Static28.method361();
			Static419.method6560(true);
			Static75.aClass179_Sub1_2.method4063(Static444.aClass83Array7[0], Static440.aClass44_12, null);
			Static75.aClass179_Sub1_2.method4078(Static440.aClass44_12, true);
			Static419.method6560(true);
			Static45.method566(false);
		}
		Static511.method7454();
		@Pc(727) int local727 = Static130.aClass179_Sub1_3.anInt4648;
		if (Static13.anInt231 < local727) {
			local727 = Static13.anInt231;
		}
		if (Static13.anInt231 - 1 > local727) {
			local727 = Static13.anInt231 - 1;
		}
		if (Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000)) {
			Static149.method2824(0);
		} else {
			Static149.method2824(local727);
		}
		@Pc(762) int local762;
		@Pc(766) int local766;
		for (@Pc(758) int local758 = 0; local758 < 4; local758++) {
			for (local762 = 0; local762 < Static428.anInt8046; local762++) {
				for (local766 = 0; local766 < Static119.anInt2717; local766++) {
					Static270.method4609(local762, local766, local758);
				}
			}
		}
		Static305.method5220();
		Static390.method6204();
		Static393.method6221();
		Static28.method361();
		Static333.method5937();
		@Pc(819) Class4_Sub14 local819;
		if (Static475.aFrame3 != null && Static299.aClass241_3 != null && Static203.anInt3855 == 11) {
			local819 = Static196.method3380(Static17.aClass159_1, Static542.aClass173_116);
			local819.aClass4_Sub11_Sub1_3.method4909(1057001181);
			Static353.method5712(local819);
		}
		if (Static358.anInt6981 == 0) {
			local762 = (Static541.anInt9603 - (Static428.anInt8046 >> 4)) / 8;
			local766 = ((Static428.anInt8046 >> 4) + Static541.anInt9603) / 8;
			@Pc(858) int local858 = (Static540.anInt5859 - (Static119.anInt2717 >> 4)) / 8;
			@Pc(866) int local866 = ((Static119.anInt2717 >> 4) + Static540.anInt5859) / 8;
			for (@Pc(870) int local870 = local762 - 1; local870 <= local766 + 1; local870++) {
				for (@Pc(876) int local876 = local858 - 1; local876 <= local866 + 1; local876++) {
					if (local870 < local762 || local870 > local766 || local876 < local858 || local876 > local866) {
						Static261.aClass176_69.method3993("m" + local870 + "_" + local876);
						Static261.aClass176_69.method3993("l" + local870 + "_" + local876);
					}
				}
			}
		}
		if (Static203.anInt3855 == 4) {
			Static285.method5604(3);
		} else if (Static203.anInt3855 == 8) {
			Static285.method5604(7);
		} else {
			Static285.method5604(10);
			if (Static299.aClass241_3 != null) {
				local819 = Static196.method3380(Static17.aClass159_1, Static468.aClass173_33);
				Static353.method5712(local819);
			}
		}
		Static147.method2810();
		Static390.method6204();
		Static554.method8016();
		if (Static216.aBoolean514) {
			Static82.method1376("Took: " + (Static574.method8210() - Static487.aLong229) + "ms");
			Static216.aBoolean514 = false;
		}
	}
}
