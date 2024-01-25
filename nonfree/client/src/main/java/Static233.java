import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
	public static int anInt4616;

	@OriginalMember(owner = "client!lt", name = "o", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_145 = new Class214(26, -2);

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[S)[S")
	public static short[] method3937(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static474.method3331(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIIIIIIIIIIIII)V")
	public static void method3938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (Static389.aClass14Array3 == null) {
			return;
		}
		@Pc(8) Class11_Sub5_Sub2 local8 = null;
		@Pc(21) int local21;
		if (arg2 >= 0) {
			local21 = arg2 - 1;
			@Pc(28) Class4_Sub44 local28 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local21);
			if (local28 != null) {
				local8 = local28.aClass11_Sub5_Sub2_Sub2_2;
			}
		} else {
			local21 = -arg2 - 1;
			if (local21 == Static147.anInt3062) {
				local8 = Static52.aClass11_Sub5_Sub2_Sub1_2;
			} else {
				local8 = Static39.aClass11_Sub5_Sub2_Sub1Array1[local21];
			}
		}
		if (local8 == null) {
			return;
		}
		@Pc(61) Class139 local61 = Static146.aClass228_1.method5203(arg12);
		@Pc(70) int local70;
		@Pc(73) int local73;
		if (arg1 == 1 || arg1 == 3) {
			local70 = local61.anInt4353;
			local73 = local61.anInt4350;
		} else {
			local70 = local61.anInt4350;
			local73 = local61.anInt4353;
		}
		@Pc(87) int local87 = (local73 >> 1) + arg7;
		@Pc(95) int local95 = (local73 + 1 >> 1) + arg7;
		@Pc(101) int local101 = arg6 + (local70 >> 1);
		@Pc(109) int local109 = (local70 + 1 >> 1) + arg6;
		@Pc(113) Class14 local113 = Static389.aClass14Array3[arg8];
		@Pc(136) int local136 = local113.oa(local87, local101) + local113.oa(local95, local101) + local113.oa(local87, local109) + local113.oa(local95, local109) >> 2;
		@Pc(140) Class4_Sub46 local140 = new Class4_Sub46();
		local140.anInt7372 = arg7;
		local140.anInt7388 = arg1;
		local140.anInt7379 = Static277.anInt2834 + arg0;
		local140.anInt7380 = arg12;
		local140.anInt7373 = Static277.anInt2834 + arg3;
		local140.anInt7376 = arg6;
		@Pc(172) int local172;
		if (arg11 > arg5) {
			local172 = arg11;
			arg11 = arg5;
			arg5 = local172;
		}
		local140.anInt7382 = local8.aByte100;
		local140.anInt7371 = arg10;
		if (arg4 < arg9) {
			local172 = arg9;
			arg9 = arg4;
			arg4 = local172;
		}
		local140.anInt7386 = arg11 + arg7;
		local140.anInt7383 = arg7 + arg5;
		local140.anInt7387 = local136;
		local140.anInt7377 = arg6 + arg9;
		local140.anInt7381 = (local73 << 6) + (local140.anInt7372 << 7);
		local140.anInt7374 = (local70 << 6) + (local140.anInt7376 << 7);
		local140.anInt7384 = arg6 + arg4;
		Static317.aClass91_34.method2587(local140);
		local8.aClass4_Sub46_3 = local140;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(BII)I")
	public static int method3939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)V")
	public static void method3941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) Class4_Sub1_Sub5 local25 = Static431.method5935(5, arg1);
		local25.method521();
		local25.anInt621 = arg0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIII)I")
	public static int method3942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg1;
		} else if (local12 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(FIFIFIIIII[FII)V")
	public static void method3943(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[] arg10, @OriginalArg(11) int arg11) {
		@Pc(5) int local5 = arg1 - arg7;
		@Pc(13) int local13 = arg8 - arg5;
		@Pc(21) int local21 = arg11 - arg3;
		@Pc(42) float local42 = arg10[0] * (float) local5 + (float) local13 * arg10[1] + (float) local21 * arg10[2];
		@Pc(63) float local63 = arg10[5] * (float) local21 + (float) local5 * arg10[3] + arg10[4] * (float) local13;
		@Pc(84) float local84 = arg10[6] * (float) local5 + arg10[7] * (float) local13 + arg10[8] * (float) local21;
		@Pc(98) float local98;
		@Pc(104) float local104;
		if (arg6 == 0) {
			local98 = local42 + arg0 + 0.5F;
			local104 = arg2 + 0.5F - local84;
		} else if (arg6 == 1) {
			local98 = local42 + arg0 + 0.5F;
			local104 = local84 + arg2 + 0.5F;
		} else if (arg6 == 2) {
			local98 = arg0 + 0.5F - local42;
			local104 = arg4 + 0.5F - local63;
		} else if (arg6 == 3) {
			local98 = local42 + arg0 + 0.5F;
			local104 = arg4 + 0.5F - local63;
		} else if (arg6 == 4) {
			local98 = local84 + arg2 + 0.5F;
			local104 = arg4 + 0.5F - local63;
		} else {
			local98 = arg2 + 0.5F - local84;
			local104 = arg4 + 0.5F - local63;
		}
		@Pc(211) float local211;
		if (arg9 == 1) {
			local211 = local98;
			local98 = -local104;
			local104 = local211;
		} else if (arg9 == 2) {
			local98 = -local98;
			local104 = -local104;
		} else if (arg9 == 3) {
			local211 = local98;
			local98 = local104;
			local104 = -local211;
		}
		Static428.aFloat93 = local98;
		Static360.aFloat86 = local104;
	}
}
