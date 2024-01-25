import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Lclient!mo;")
	public static Class143 aClass143_71;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString125 = "Close";

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "[S")
	public static final short[] aShortArray86 = new short[] { 2, 40, 59, 16, 11, 18, 4, 14 };

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	public static int anInt3549 = 0;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
	public static void method3333() {
		if (Static78.aString72.length() == 0) {
			return;
		}
		Static85.method2094("--> " + Static78.aString72);
		Static348.method4759(false, Static78.aString72);
		Static78.aString72 = "";
		Static67.anInt1609 = 0;
		Static237.anInt4633 = 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BJII)V")
	public static void method3334(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = (int) arg0 >> 14 & 0x1F;
		@Pc(21) int local21 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local14 != 10 && local14 != 11 && local14 != 22) {
			Static229.method4046(local14, 0, arg1, 0, true, local21, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], 0, arg2);
			return;
		}
		@Pc(41) Class59 local41 = Static232.method2200(local28);
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (local21 == 0 || local21 == 2) {
			local49 = local41.anInt1950;
			local52 = local41.anInt1912;
		} else {
			local52 = local41.anInt1950;
			local49 = local41.anInt1912;
		}
		@Pc(63) int local63 = local41.anInt1923;
		if (local21 != 0) {
			local63 = (local63 << local21 & 0xF) + (local63 >> 4 - local21);
		}
		Static229.method4046(0, local49, arg1, local63, true, 0, Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray536[0], Static173.aClass10_Sub3_Sub3_Sub2_1.anIntArray535[0], local52, arg2);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method3335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg2 && arg0 == arg8 && arg6 == arg1 && arg3 == arg7) {
			Static156.method5351(arg3, arg1, arg4, arg0, arg2);
			return;
		}
		@Pc(43) int local43 = arg2;
		@Pc(45) int local45 = arg0;
		@Pc(49) int local49 = arg2 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg5 * 3;
		@Pc(61) int local61 = arg8 * 3;
		@Pc(65) int local65 = arg6 * 3;
		@Pc(69) int local69 = arg7 * 3;
		@Pc(79) int local79 = arg1 + local57 - arg2 - local65;
		@Pc(89) int local89 = arg3 + local61 - local69 - arg0;
		@Pc(99) int local99 = local49 + local65 - local57 - local57;
		@Pc(107) int local107 = local69 + local53 - local61 - local61;
		@Pc(112) int local112 = local57 - local49;
		@Pc(117) int local117 = local61 - local53;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local119 * local127 >> 12;
			@Pc(137) int local137 = local79 * local133;
			@Pc(141) int local141 = local133 * local89;
			@Pc(145) int local145 = local99 * local127;
			@Pc(149) int local149 = local127 * local107;
			@Pc(153) int local153 = local112 * local119;
			@Pc(157) int local157 = local119 * local117;
			@Pc(167) int local167 = arg2 + (local153 + local137 + local145 >> 12);
			@Pc(178) int local178 = (local141 + local149 + local157 >> 12) + arg0;
			Static156.method5351(local178, local167, arg4, local45, local43);
			local43 = local167;
			local45 = local178;
		}
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	public static void method3336() {
		if (Static290.anInt5596 == -1 || Static334.anInt6460 == -1) {
			return;
		}
		@Pc(23) int local23 = Static194.anInt3960 + (Static106.anInt2362 * (Static272.anInt5173 - Static194.anInt3960) >> 16);
		Static106.anInt2362 += local23;
		if (Static106.anInt2362 < 65535) {
			Static265.aBoolean335 = false;
			Static104.aBoolean163 = false;
		} else {
			if (Static265.aBoolean335) {
				Static104.aBoolean163 = false;
			} else {
				Static104.aBoolean163 = true;
			}
			Static106.anInt2362 = 65535;
			Static265.aBoolean335 = true;
		}
		@Pc(67) float local67 = (float) Static106.anInt2362 / 65535.0F;
		@Pc(70) float[] local70 = new float[3];
		@Pc(74) int local74 = Static194.anInt3959 * 2;
		@Pc(100) int local100;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(144) int local144;
		@Pc(154) int local154;
		@Pc(170) int local170;
		for (@Pc(76) int local76 = 0; local76 < 3; local76++) {
			@Pc(88) int local88 = Static347.anIntArrayArrayArray14[Static290.anInt5596][local74][local76] * 3;
			local100 = Static347.anIntArrayArrayArray14[Static290.anInt5596][local74 + 1][local76] * 3;
			local132 = (Static347.anIntArrayArrayArray14[Static290.anInt5596][local74 + 2][local76] + Static347.anIntArrayArrayArray14[Static290.anInt5596][local74 + 2][local76] - Static347.anIntArrayArrayArray14[Static290.anInt5596][local74 + 3][local76]) * 3;
			local140 = Static347.anIntArrayArrayArray14[Static290.anInt5596][local74][local76];
			local144 = local100 - local88;
			local154 = local88 + local132 - local100 * 2;
			local170 = local100 + Static347.anIntArrayArrayArray14[Static290.anInt5596][local74 + 2][local76] - local140 - local132;
			local70[local76] = (float) local140 + (local67 * ((float) local170 * local67 + (float) local154) + (float) local144) * local67;
		}
		Static141.anInt2986 = (int) local70[2] - Static251.anInt3170 * 128;
		Static103.anInt2301 = (int) local70[1] * -1;
		Static124.anInt2717 = (int) local70[0] - Static151.anInt3234 * 128;
		@Pc(226) float[] local226 = new float[3];
		local100 = Static273.anInt5199 * 2;
		for (local132 = 0; local132 < 3; local132++) {
			local140 = Static347.anIntArrayArrayArray14[Static334.anInt6460][local100][local132] * 3;
			local144 = Static347.anIntArrayArrayArray14[Static334.anInt6460][local100 + 1][local132] * 3;
			local154 = (Static347.anIntArrayArrayArray14[Static334.anInt6460][local100 + 2][local132] + Static347.anIntArrayArrayArray14[Static334.anInt6460][local100 + 2][local132] - Static347.anIntArrayArrayArray14[Static334.anInt6460][local100 + 3][local132]) * 3;
			local170 = Static347.anIntArrayArrayArray14[Static334.anInt6460][local100][local132];
			@Pc(302) int local302 = local144 - local140;
			@Pc(311) int local311 = local154 + local140 - local144 * 2;
			@Pc(329) int local329 = local144 + Static347.anIntArrayArrayArray14[Static334.anInt6460][local100 + 2][local132] - local154 - local170;
			local226[local132] = (((float) local311 + (float) local329 * local67) * local67 + (float) local302) * local67 + (float) local170;
		}
		@Pc(364) float local364 = local226[0] - local70[0];
		@Pc(374) float local374 = (local226[1] - local70[1]) * -1.0F;
		@Pc(382) float local382 = local226[2] - local70[2];
		@Pc(392) double local392 = Math.sqrt((double) (local382 * local382 + local364 * local364));
		Static112.anInt2486 = (int) (Math.atan2((double) local374, local392) * 2607.5945876176133D) & 0x3FFF;
		Static249.anInt4824 = (int) (-Math.atan2((double) local364, (double) local382) * 2607.5945876176133D) & 0x3FFF;
		Static295.anInt5672 = Static347.anIntArrayArrayArray14[Static290.anInt5596][local74][3] + ((Static347.anIntArrayArrayArray14[Static290.anInt5596][local74 + 2][3] - Static347.anIntArrayArrayArray14[Static290.anInt5596][local74][3]) * Static106.anInt2362 >> 16);
	}
}
