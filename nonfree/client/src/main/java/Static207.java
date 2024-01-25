import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!de;")
	public static final Class50 aClass50_14 = new Class50(2, 4, 4, 0);

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
	public static final int anInt3363 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
	public static void method2673(@OriginalArg(0) boolean arg0) {
		Static429.anInt6930 = 0;
		Static332.anInt5613 = 0;
		Static243.method473();
		Static261.method1845(arg0);
		Static441.method5579();
		@Pc(26) boolean local26 = false;
		@Pc(34) int local34;
		for (@Pc(28) int local28 = 0; local28 < Static429.anInt6930; local28++) {
			local34 = Static146.anIntArray200[local28];
			@Pc(41) Class2_Sub28 local41 = (Class2_Sub28) Static49.aClass72_11.method1659((long) local34);
			@Pc(44) Class3_Sub4_Sub1_Sub1 local44 = local41.aClass3_Sub4_Sub1_Sub1_1;
			if (Static126.aBoolean52 && Static352.method4677(local34)) {
				Static117.method1762();
			}
			if (local44.anInt4942 != Static266.anInt4392) {
				if (local44.aClass245_1.method5204()) {
					Static192.method2588(local44);
				}
				local44.method2629(null);
				local41.method5703();
				local26 = true;
			}
		}
		if (local26) {
			Static384.anInt6329 = Static49.aClass72_11.method1652();
			Static49.aClass72_11.method1656(Static332.aClass2_Sub28Array1);
		}
		if (Static26.aClass2_Sub13_Sub2_1.anInt4347 != Static209.anInt3493) {
			throw new RuntimeException("gnp1 pos:" + Static26.aClass2_Sub13_Sub2_1.anInt4347 + " psize:" + Static209.anInt3493);
		}
		for (local34 = 0; local34 < Static351.anInt5969; local34++) {
			if (Static49.aClass72_11.method1659((long) Static40.anIntArray84[local34]) == null) {
				throw new RuntimeException("gnp2 pos:" + local34 + " size:" + Static351.anInt5969);
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method2674() {
		@Pc(9) int local9 = Static26.aClass2_Sub13_Sub2_1.method3600();
		@Pc(13) int local13 = Static26.aClass2_Sub13_Sub2_1.method3548();
		Static276.anInt4560 = Static26.aClass2_Sub13_Sub2_1.method3600();
		@Pc(28) boolean local28 = Static26.aClass2_Sub13_Sub2_1.method3580() == 1;
		@Pc(32) int local32 = Static26.aClass2_Sub13_Sub2_1.method3576();
		Static108.method1679();
		Static419.method5306(local9);
		Static26.aClass2_Sub13_Sub2_1.method3612();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static166.anInt2852 >> 3; local46++) {
				for (local50 = 0; local50 < Static426.anInt6923 >> 3; local50++) {
					local57 = Static26.aClass2_Sub13_Sub2_1.method3615(1);
					if (local57 == 1) {
						Static121.anIntArrayArrayArray1[local42][local46][local50] = Static26.aClass2_Sub13_Sub2_1.method3615(26);
					} else {
						Static121.anIntArrayArrayArray1[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static26.aClass2_Sub13_Sub2_1.method3617();
		local46 = (Static209.anInt3493 - Static26.aClass2_Sub13_Sub2_1.anInt4347) / 16;
		Static278.anIntArrayArray33 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static278.anIntArrayArray33[local50][local57] = Static26.aClass2_Sub13_Sub2_1.method3574();
			}
		}
		Static319.anIntArray478 = new int[local46];
		Static403.aByteArrayArray56 = new byte[local46][];
		Static142.aByteArrayArray19 = new byte[local46][];
		Static193.anIntArray266 = new int[local46];
		Static228.aByteArrayArray31 = null;
		Static378.aByteArrayArray51 = new byte[local46][];
		Static27.anIntArray188 = null;
		Static128.anIntArray181 = new int[local46];
		Static225.anIntArray310 = new int[local46];
		Static388.anIntArray415 = new int[local46];
		Static98.aByteArrayArray12 = new byte[local46][];
		local46 = 0;
		for (@Pc(185) int local185 = 0; local185 < 4; local185++) {
			for (@Pc(189) int local189 = 0; local189 < Static166.anInt2852 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static426.anInt6923 >> 3; local193++) {
					@Pc(203) int local203 = Static121.anIntArrayArrayArray1[local185][local189][local193];
					if (local203 != -1) {
						@Pc(213) int local213 = local203 >> 14 & 0x3FF;
						@Pc(219) int local219 = local203 >> 3 & 0x7FF;
						@Pc(229) int local229 = local219 / 8 + (local213 / 8 << 8);
						for (@Pc(231) int local231 = 0; local231 < local46; local231++) {
							if (local229 == Static225.anIntArray310[local231]) {
								local229 = -1;
								break;
							}
						}
						if (local229 != -1) {
							Static225.anIntArray310[local46] = local229;
							@Pc(267) int local267 = local229 >> 8 & 0xFF;
							@Pc(271) int local271 = local229 & 0xFF;
							Static128.anIntArray181[local46] = Static309.aClass54_84.method1102("m" + local267 + "_" + local271);
							Static193.anIntArray266[local46] = Static309.aClass54_84.method1102("l" + local267 + "_" + local271);
							Static388.anIntArray415[local46] = Static309.aClass54_84.method1102("um" + local267 + "_" + local271);
							Static319.anIntArray478[local46] = Static309.aClass54_84.method1102("ul" + local267 + "_" + local271);
							local46++;
						}
					}
				}
			}
		}
		Static359.method4735(10, local32, local28, local13);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static332.anIntArrayArrayArray12[arg0][local16][local20] == -Static201.anInt3382) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static460.anInt7074) + 1;
			@Pc(142) int local142 = (arg3 << Static460.anInt7074) + 2;
			@Pc(151) int local151 = Static345.aClass162Array3[arg0].ua(arg1, arg3) + arg5;
			if (!Static387.method4966(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static460.anInt7074) - 1;
			if (!Static387.method4966(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static460.anInt7074) - 1;
			if (!Static387.method4966(local20, local151, local177)) {
				return false;
			} else if (Static387.method4966(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static135.method1996(arg0, arg1, arg3)) {
			local16 = arg1 << Static460.anInt7074;
			local20 = arg3 << Static460.anInt7074;
			return Static387.method4966(local16 + 1, Static345.aClass162Array3[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static387.method4966(local16 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static387.method4966(local16 + Static67.anInt1221 - 1, Static345.aClass162Array3[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static67.anInt1221 - 1) && Static387.method4966(local16 + 1, Static345.aClass162Array3[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static67.anInt1221 - 1);
		} else {
			return false;
		}
	}
}
