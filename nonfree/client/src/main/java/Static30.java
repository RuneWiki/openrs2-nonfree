import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public static int anInt553;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!ph;")
	public static Class138 aClass138_7;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZLclient!nk;III[[FBI[[FB[[II[[FII)V")
	public static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class1_Sub20 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) byte arg7, @OriginalArg(9) float[][] arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float[][] arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = (arg4 << 8) + 255;
		@Pc(17) int local17 = (arg5 << 8) + 255;
		@Pc(23) int local23 = (arg11 << 8) + 255;
		@Pc(29) int local29 = (arg0 << 8) + 255;
		@Pc(33) int[] local33 = Static114.anIntArrayArray14[arg9];
		@Pc(43) int[] local43 = null;
		@Pc(49) int[] local49 = new int[local33.length >> 1];
		@Pc(51) int local51;
		for (local51 = 0; local51 < local49.length; local51++) {
			local49[local51] = Static97.method1399(arg7, false, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, local33[local51 + local51], null, local33[local51 + local51 + 1], local17, local11, local23, arg13);
		}
		if (arg1) {
			@Pc(197) int local197;
			if (arg9 == 1) {
				local43 = new int[6];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 64, null, 128, local17, local11, local23, arg13);
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 64, local17, local11, local23, arg13);
				local43[1] = local51;
				local43[3] = local51;
				local43[0] = local197;
				local43[2] = local49[2];
				local43[5] = local49[2];
				local43[4] = local49[0];
			} else if (arg9 == 2) {
				local43 = new int[6];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 128, local17, local11, local23, arg13);
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 64, null, 0, local17, local11, local23, arg13);
				local43[3] = local51;
				local43[2] = local51;
				local43[0] = local49[0];
				local43[5] = local49[0];
				local43[1] = local197;
				local43[4] = local49[1];
			} else if (arg9 == 3) {
				local43 = new int[6];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 0, null, 128, local17, local11, local23, arg13);
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 64, null, 0, local17, local11, local23, arg13);
				local43[4] = local197;
				local43[0] = local49[2];
				local43[2] = local51;
				local43[5] = local49[2];
				local43[1] = local49[1];
				local43[3] = local51;
			} else if (arg9 == 4) {
				local43 = new int[3];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 0, null, 128, local17, local11, local23, arg13);
				local43[1] = local51;
				local43[0] = local49[3];
				local43[2] = local49[0];
			} else if (arg9 == 5) {
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 128, local17, local11, local23, arg13);
				local43 = new int[] { local49[2], local51, local49[3] };
			} else if (arg9 == 6) {
				local43 = new int[6];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 0, local17, local11, local23, arg13);
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 128, local17, local11, local23, arg13);
				local43[0] = local49[3];
				local43[4] = local49[0];
				local43[2] = local197;
				local43[1] = local51;
				local43[3] = local197;
				local43[5] = local49[3];
			} else if (arg9 == 7) {
				local43 = new int[6];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 0, null, 128, local17, local11, local23, arg13);
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 0, local17, local11, local23, arg13);
				local43[2] = local51;
				local43[0] = local49[1];
				local43[4] = local49[2];
				local43[3] = local51;
				local43[1] = local197;
				local43[5] = local49[1];
			} else if (arg9 == 8) {
				local43 = new int[3];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 0, null, 0, local17, local11, local23, arg13);
				local43[0] = local49[3];
				local43[2] = local49[4];
				local43[1] = local51;
			} else if (arg9 == 9) {
				local43 = new int[15];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 64, local17, local11, local23, arg13);
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 96, null, 32, local17, local11, local23, arg13);
				@Pc(721) int local721 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 64, null, 0, local17, local11, local23, arg13);
				local43[14] = local721;
				local43[9] = local197;
				local43[12] = local197;
				local43[1] = local51;
				local43[0] = local197;
				local43[3] = local197;
				local43[11] = local49[1];
				local43[2] = local49[4];
				local43[10] = local49[2];
				local43[5] = local49[3];
				local43[7] = local49[3];
				local43[6] = local197;
				local43[13] = local49[1];
				local43[8] = local49[2];
				local43[4] = local49[4];
			} else if (arg9 == 10) {
				local43 = new int[9];
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 0, null, 128, local17, local11, local23, arg13);
				local43[0] = local49[2];
				local43[1] = local51;
				local43[4] = local51;
				local43[2] = local49[3];
				local43[6] = local49[4];
				local43[7] = local51;
				local43[5] = local49[4];
				local43[3] = local49[3];
				local43[8] = local49[0];
			} else if (arg9 == 11) {
				local51 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 0, null, 64, local17, local11, local23, arg13);
				local43 = new int[12];
				local197 = Static97.method1399(arg7, true, arg8, arg6, 0.0F, arg2, arg12, local29, arg10, arg14, 128, null, 64, local17, local11, local23, arg13);
				local43[1] = local51;
				local43[7] = local197;
				local43[11] = local197;
				local43[0] = local49[3];
				local43[3] = local49[3];
				local43[5] = local51;
				local43[2] = local49[0];
				local43[4] = local49[2];
				local43[6] = local49[2];
				local43[10] = local49[1];
				local43[9] = local49[2];
				local43[8] = local51;
			}
		}
		arg2.method3046(arg3, arg13, arg14, local49, local43, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!hc;IIII)Lclient!hc;")
	public static Class22_Sub4 method532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) long local8 = (long) arg5;
		@Pc(14) Class22_Sub4 local14 = (Class22_Sub4) Static222.aClass169_122.method4017(local8);
		if (local14 == null) {
			@Pc(21) Class22_Sub7 local21 = Static275.method4085(Static264.aClass138_71, arg5);
			if (local21 == null) {
				return null;
			}
			local14 = local21.method4097(64, 768, -50, -10, -50);
			Static222.aClass169_122.method4016(local14, local8);
		}
		@Pc(42) int local42 = arg2.method3553();
		@Pc(45) int local45 = arg2.method3560();
		@Pc(48) int local48 = arg2.method3566();
		@Pc(59) int local59 = arg2.method3574();
		local14 = local14.method3568(true, true, true);
		if (arg1 != 0) {
			local14.method3554(arg1);
		}
		@Pc(107) int local107;
		if (Static291.aBoolean404) {
			@Pc(78) Class22_Sub4_Sub1 local78 = (Class22_Sub4_Sub1) local14;
			if (Static104.method1648(Static295.anInt5586, arg0 + local42, local48 + arg4) != arg3 || arg3 != Static104.method1648(Static295.anInt5586, local45 + arg0, local59 + arg4)) {
				for (local107 = 0; local107 < local78.anInt1917; local107++) {
					local78.anIntArray175[local107] += Static104.method1648(Static295.anInt5586, local78.anIntArray174[local107] + arg0, local78.anIntArray170[local107] + arg4) - arg3;
				}
				local78.aClass27_1.aBoolean39 = false;
				local78.aClass130_2.aBoolean277 = false;
			}
		} else {
			@Pc(157) Class22_Sub4_Sub2 local157 = (Class22_Sub4_Sub2) local14;
			if (arg3 != Static104.method1648(Static295.anInt5586, local42 + arg0, local48 + arg4) || Static104.method1648(Static295.anInt5586, arg0 + local45, local59 + arg4) != arg3) {
				for (local107 = 0; local107 < local157.anInt4462; local107++) {
					local157.anIntArray382[local107] += Static104.method1648(Static295.anInt5586, arg0 + local157.anIntArray385[local107], local157.anIntArray379[local107] + arg4) - arg3;
				}
				local157.aBoolean316 = false;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!ph;Lclient!ph;)I")
	public static int method533(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method3340(Static37.anInt758)) {
			local5++;
		}
		if (arg0.method3340(Static73.anInt1413)) {
			local5++;
		}
		if (arg0.method3340(Static177.anInt2086)) {
			local5++;
		}
		if (arg1.method3340(Static37.anInt758)) {
			local5++;
		}
		if (arg1.method3340(Static73.anInt1413)) {
			local5++;
		}
		if (arg1.method3340(Static177.anInt2086)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!qf;IIIII)V")
	public static void method534(@OriginalArg(1) int arg0, @OriginalArg(2) Class146 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = arg6 * arg6 + arg4 * arg4;
		if (arg2 < local19) {
			return;
		}
		@Pc(37) int local37 = Math.min(arg1.anInt4345 / 2, arg1.anInt4371 / 2);
		if (local37 * local37 >= local19) {
			Static287.method4260(arg1, arg3, arg4, arg0, Static297.aClass1_Sub1_Sub3Array17[arg5], arg6);
			return;
		}
		local37 -= 10;
		@Pc(67) int local67;
		if (Static101.anInt1895 == 4) {
			local67 = (int) Static2.aFloat1 & 0x7FF;
		} else {
			local67 = (int) Static2.aFloat1 + Static39.anInt794 & 0x7FF;
		}
		@Pc(81) int local81 = Class17.anIntArray24[local67];
		@Pc(85) int local85 = Class17.anIntArray22[local67];
		if (Static101.anInt1895 != 4) {
			local85 = local85 * 256 / (Static54.anInt1055 + 256);
			local81 = local81 * 256 / (Static54.anInt1055 + 256);
		}
		@Pc(114) int local114 = arg4 * local85 + local81 * arg6 >> 16;
		@Pc(125) int local125 = arg4 * local81 - arg6 * local85 >> 16;
		@Pc(131) double local131 = Math.atan2((double) local114, (double) local125);
		@Pc(138) int local138 = (int) ((double) local37 * Math.sin(local131));
		@Pc(145) int local145 = (int) (Math.cos(local131) * (double) local37);
		if (Static291.aBoolean404) {
			((Class1_Sub1_Sub3_Sub1) Static119.aClass1_Sub1_Sub3Array20[arg5]).method4641((arg1.anInt4345 / 2 + arg0 + local138) * 16, (arg1.anInt4371 / 2 + arg3 - local145) * 16, (int) (local131 * 10430.378D));
		} else {
			((Class1_Sub1_Sub3_Sub2) Static119.aClass1_Sub1_Sub3Array20[arg5]).method3478(local138 + arg1.anInt4345 / 2 + arg0 - 10, -local145 + -10 + arg3 + arg1.anInt4371 / 2, local131);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public static void method535(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub1_Sub2 local4 = Static46.method824(1, arg0);
		local4.method299();
	}
}
