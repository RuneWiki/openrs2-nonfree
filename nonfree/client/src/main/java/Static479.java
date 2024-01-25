import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	public static int anInt8261;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "Lclient!fea;")
	public static final Class99 aClass99_71 = new Class99();

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_138 = new Class40("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_85 = new Class236(33, 3);

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "[I")
	public static final int[] anIntArray647 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIB[BI[B)V")
	public static void method6661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg3 >> 2);
		@Pc(19) int local19 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg6++;
				arg5[local30] = (byte) (arg5[local30] - arg7[arg4++]);
				@Pc(43) int local43 = arg6++;
				arg5[local43] = (byte) (arg5[local43] - arg7[arg4++]);
				@Pc(56) int local56 = arg6++;
				arg5[local56] = (byte) (arg5[local56] - arg7[arg4++]);
				@Pc(69) int local69 = arg6++;
				arg5[local69] = (byte) (arg5[local69] - arg7[arg4++]);
			}
			for (@Pc(85) int local85 = local19; local85 < 0; local85++) {
				local30 = arg6++;
				arg5[local30] = (byte) (arg5[local30] - arg7[arg4++]);
			}
			arg4 += arg1;
			arg6 += arg2;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
	public static void method6665() {
		Static265.method4422(false);
		Static178.anInt3484 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static124.aByteArrayArray13.length; local14++) {
			if (Static141.anIntArray237[local14] != -1 && Static124.aByteArrayArray13[local14] == null) {
				Static124.aByteArrayArray13[local14] = Static338.aClass117_151.method2962(0, Static141.anIntArray237[local14]);
				if (Static124.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static178.anInt3484++;
				}
			}
			if (Static339.anIntArray474[local14] != -1 && Static178.aByteArrayArray17[local14] == null) {
				Static178.aByteArrayArray17[local14] = Static338.aClass117_151.method2970(Static213.anIntArrayArray28[local14], 0, Static339.anIntArray474[local14]);
				if (Static178.aByteArrayArray17[local14] == null) {
					Static178.anInt3484++;
					local12 = false;
				}
			}
			if (Static339.anIntArray475[local14] != -1 && Static226.aByteArrayArray31[local14] == null) {
				Static226.aByteArrayArray31[local14] = Static338.aClass117_151.method2962(0, Static339.anIntArray475[local14]);
				if (Static226.aByteArrayArray31[local14] == null) {
					Static178.anInt3484++;
					local12 = false;
				}
			}
			if (Static254.anIntArray688[local14] != -1 && Static85.aByteArrayArray11[local14] == null) {
				Static85.aByteArrayArray11[local14] = Static338.aClass117_151.method2962(0, Static254.anIntArray688[local14]);
				if (Static85.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static178.anInt3484++;
				}
			}
			if (Static201.anIntArray274 != null && Static348.aByteArrayArray36[local14] == null && Static201.anIntArray274[local14] != -1) {
				Static348.aByteArrayArray36[local14] = Static338.aClass117_151.method2970(Static213.anIntArrayArray28[local14], 0, Static201.anIntArray274[local14]);
				if (Static348.aByteArrayArray36[local14] == null) {
					local12 = false;
					Static178.anInt3484++;
				}
			}
		}
		if (Static259.aClass197_2 == null) {
			if (Static276.aClass5_Sub2_Sub5_2 == null || !Static317.aClass117_142.method2956(Static276.aClass5_Sub2_Sub5_2.aString20 + "_staticelements")) {
				Static259.aClass197_2 = new Class197(0);
			} else if (Static317.aClass117_142.method2955(Static276.aClass5_Sub2_Sub5_2.aString20 + "_staticelements")) {
				Static259.aClass197_2 = Static329.method5208(Static433.aBoolean542, Static276.aClass5_Sub2_Sub5_2.aString20 + "_staticelements", Static317.aClass117_142);
			} else {
				Static178.anInt3484++;
				local12 = false;
			}
		}
		if (!local12) {
			Static23.anInt489 = 1;
			return;
		}
		local12 = true;
		Static246.anInt5007 = 0;
		@Pc(264) int local264;
		@Pc(274) int local274;
		for (@Pc(246) int local246 = 0; local246 < Static124.aByteArrayArray13.length; local246++) {
			@Pc(252) byte[] local252 = Static178.aByteArrayArray17[local246];
			if (local252 != null) {
				local264 = (Static103.anIntArray76[local246] >> 8) * 64 - Static515.anInt3214;
				local274 = (Static103.anIntArray76[local246] & 0xFF) * 64 - Static338.anInt6353;
				if (Static56.anInt1176 != 0) {
					local274 = 10;
					local264 = 10;
				}
				local12 &= Static446.method7434(local274, Static460.anInt7894, local264, Static235.anInt4493, local252);
			}
			local252 = Static85.aByteArrayArray11[local246];
			if (local252 != null) {
				local264 = (Static103.anIntArray76[local246] >> 8) * 64 - Static515.anInt3214;
				local274 = (Static103.anIntArray76[local246] & 0xFF) * 64 - Static338.anInt6353;
				if (Static56.anInt1176 != 0) {
					local274 = 10;
					local264 = 10;
				}
				local12 &= Static446.method7434(local274, Static460.anInt7894, local264, Static235.anInt4493, local252);
			}
		}
		if (!local12) {
			Static23.anInt489 = 2;
			return;
		}
		if (Static23.anInt489 != 0) {
			Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737) + "<br>(100%)", Static492.aClass13_3, true);
		}
		Static485.method6727();
		Static452.method6364();
		@Pc(372) boolean local372 = false;
		if (Static110.aClass62_15.method7044() && Static300.aClass5_Sub28_Sub1_1.aBoolean330) {
			for (local264 = 0; local264 < Static124.aByteArrayArray13.length; local264++) {
				if (Static85.aByteArrayArray11[local264] != null || Static226.aByteArrayArray31[local264] != null) {
					local372 = true;
					break;
				}
			}
		}
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean339) {
			local264 = Static432.anIntArray576[Static383.anInt6996];
		} else {
			local264 = Static298.anIntArray406[Static383.anInt6996];
		}
		if (Static110.aClass62_15.method7007()) {
			local264++;
		}
		Static222.method6944(Static460.anInt7894, Static235.anInt4493, local264, local372, Static110.aClass62_15.method7034() > 0);
		for (local274 = 0; local274 < 4; local274++) {
			Static71.aClass10Array3[local274].method303();
		}
		Static46.method1040();
		Static174.method3030(false);
		Static442.method6257();
		Static321.aBoolean424 = false;
		Static514.aClass82_1 = null;
		Static485.method6727();
		System.gc();
		Static265.method4422(true);
		Static438.method6228();
		Static364.anInt6809 = Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459);
		Static236.aBoolean303 = Static193.anInt3735 >= 96;
		Static532.aBoolean648 = Static300.aClass5_Sub28_Sub1_1.aBoolean330;
		Static438.aBoolean546 = Static300.aClass5_Sub28_Sub1_1.method4113(Static17.anInt459);
		Static196.aBoolean225 = !Static300.aClass5_Sub28_Sub1_1.aBoolean326;
		Static421.anInt7440 = Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459) ? -1 : Static283.anInt5784;
		Static395.aBoolean499 = Static106.method2147(Static17.anInt459) || Static300.aClass5_Sub28_Sub1_1.aBoolean328;
		Static103.aBoolean43 = Static300.aClass5_Sub28_Sub1_1.aBoolean327;
		Static111.aClass130_Sub1_1 = new Class130_Sub1(4, Static460.anInt7894, Static235.anInt4493, false);
		if (Static56.anInt1176 == 0) {
			Static153.method2802(Static111.aClass130_Sub1_1, Static124.aByteArrayArray13);
		} else {
			Static525.method7181(Static111.aClass130_Sub1_1, Static124.aByteArrayArray13);
		}
		Static452.method6363(Static235.anInt4493 >> 4, Static460.anInt7894 >> 4);
		Static167.method2981();
		if (local372) {
			Static193.method3237(true);
			Static382.aClass130_Sub1_2 = new Class130_Sub1(1, Static460.anInt7894, Static235.anInt4493, true);
			if (Static56.anInt1176 == 0) {
				Static153.method2802(Static382.aClass130_Sub1_2, Static226.aByteArrayArray31);
				Static265.method4422(true);
			} else {
				Static525.method7181(Static382.aClass130_Sub1_2, Static226.aByteArrayArray31);
				Static265.method4422(true);
			}
			Static382.aClass130_Sub1_2.method5426(Static111.aClass130_Sub1_1.anIntArrayArrayArray9[0]);
			Static382.aClass130_Sub1_2.method5421(Static110.aClass62_15, null, null);
			Static193.method3237(false);
		}
		Static111.aClass130_Sub1_1.method5421(Static110.aClass62_15, Static71.aClass10Array3, local372 ? Static382.aClass130_Sub1_2.anIntArrayArrayArray9 : null);
		if (Static56.anInt1176 == 0) {
			Static265.method4422(true);
			Static456.method6377(Static111.aClass130_Sub1_1, Static178.aByteArrayArray17);
			if (Static348.aByteArrayArray36 != null) {
				Static181.method3086();
			}
		} else {
			Static265.method4422(true);
			Static37.method833(Static111.aClass130_Sub1_1, Static178.aByteArrayArray17);
		}
		Static452.method6364();
		if (Static193.anInt3735 < 96) {
			Static225.method3576();
		}
		Static265.method4422(true);
		Static111.aClass130_Sub1_1.method5414(Static110.aClass62_15, null, local372 ? Static511.aClass131Array6[0] : null);
		Static111.aClass130_Sub1_1.method5431(Static110.aClass62_15);
		Static265.method4422(true);
		if (local372) {
			Static193.method3237(true);
			Static265.method4422(true);
			if (Static56.anInt1176 == 0) {
				Static456.method6377(Static382.aClass130_Sub1_2, Static85.aByteArrayArray11);
			} else {
				Static37.method833(Static382.aClass130_Sub1_2, Static85.aByteArrayArray11);
			}
			Static452.method6364();
			Static265.method4422(true);
			Static382.aClass130_Sub1_2.method5414(Static110.aClass62_15, Static493.aClass131Array5[0], null);
			Static382.aClass130_Sub1_2.method5431(Static110.aClass62_15);
			Static265.method4422(true);
			Static193.method3237(false);
		}
		Static76.method1380();
		@Pc(715) int local715 = Static111.aClass130_Sub1_1.anInt6556;
		if (local715 > Static367.anInt6860) {
			local715 = Static367.anInt6860;
		}
		if (Static367.anInt6860 - 1 > local715) {
			local715 = Static367.anInt6860 - 1;
		}
		if (Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459)) {
			Static329.method5209(0);
		} else {
			Static329.method5209(local715);
		}
		@Pc(758) int local758;
		@Pc(762) int local762;
		for (@Pc(754) int local754 = 0; local754 < 4; local754++) {
			for (local758 = 0; local758 < Static460.anInt7894; local758++) {
				for (local762 = 0; local762 < Static235.anInt4493; local762++) {
					Static172.method7331(local762, local758, local754);
				}
			}
		}
		Static112.method2231();
		Static485.method6727();
		Static163.method2909();
		Static452.method6364();
		Static84.method1458();
		if (Static265.aFrame25 != null && client.lb != null && Static389.anInt7024 == 10) {
			Static415.method5995(Static388.aClass236_60);
			Static164.aClass5_Sub3_Sub1_2.method4184(1057001181);
		}
		if (Static56.anInt1176 == 0) {
			local758 = (Static381.anInt6974 - (Static460.anInt7894 >> 4)) / 8;
			local762 = ((Static460.anInt7894 >> 4) + Static381.anInt6974) / 8;
			@Pc(847) int local847 = (Static100.anInt2262 - (Static235.anInt4493 >> 4)) / 8;
			@Pc(856) int local856 = (Static100.anInt2262 + (Static235.anInt4493 >> 4)) / 8;
			for (@Pc(860) int local860 = local758 - 1; local860 <= local762 + 1; local860++) {
				for (@Pc(866) int local866 = local847 - 1; local866 <= local856 + 1; local866++) {
					if (local758 > local860 || local860 > local762 || local847 > local866 || local856 < local866) {
						Static338.aClass117_151.method2966("m" + local860 + "_" + local866);
						Static338.aClass117_151.method2966("l" + local860 + "_" + local866);
					}
				}
			}
		}
		if (Static389.anInt7024 == 3) {
			Static287.method4831(2);
		} else if (Static389.anInt7024 == 7) {
			Static287.method4831(6);
		} else {
			Static287.method4831(9);
			if (client.lb != null) {
				Static415.method5995(Static199.aClass236_39);
			}
		}
		Static288.method4837();
		Static485.method6727();
		Static487.method6757();
	}
}
