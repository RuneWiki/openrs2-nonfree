import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "F")
	public static float aFloat24;

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!lp", name = "V", descriptor = "F")
	public static float aFloat26;

	@OriginalMember(owner = "client!lp", name = "Y", descriptor = "F")
	public static float aFloat27;

	@OriginalMember(owner = "client!lp", name = "fb", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!lp", name = "ub", descriptor = "Z")
	public static boolean aBoolean237;

	@OriginalMember(owner = "client!lp", name = "yb", descriptor = "I")
	public static int anInt3709;

	@OriginalMember(owner = "client!lp", name = "zb", descriptor = "I")
	public static int anInt3710;

	@OriginalMember(owner = "client!lp", name = "Ab", descriptor = "I")
	public static int anInt3711;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "Lclient!to;")
	public static Class11_Sub25_Sub2 aClass11_Sub25_Sub2_3 = new Class11_Sub25_Sub2(8192);

	@OriginalMember(owner = "client!lp", name = "sb", descriptor = "[I")
	public static final int[] anIntArray276 = new int[8];

	@OriginalMember(owner = "client!lp", name = "tb", descriptor = "[I")
	public static int[] anIntArray277 = new int[1];

	@OriginalMember(owner = "client!lp", name = "vb", descriptor = "[I")
	public static final int[] anIntArray278 = new int[8];

	@OriginalMember(owner = "client!lp", name = "wb", descriptor = "[I")
	public static int[] anIntArray279 = new int[1];

	@OriginalMember(owner = "client!lp", name = "xb", descriptor = "[I")
	public static final int[] anIntArray280 = new int[8];

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(III)I")
	public static int method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IFIIIB[FIIIF)V")
	public static void method3166(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(3) int local3 = arg4 - arg6;
		@Pc(7) int local7 = arg7 - arg8;
		@Pc(11) int local11 = arg2 - arg3;
		@Pc(32) float local32 = (float) local11 * arg5[0] + (float) local7 * arg5[1] + (float) local3 * arg5[2];
		@Pc(61) float local61 = arg5[5] * (float) local3 + (float) local11 * arg5[3] + (float) local7 * arg5[4];
		@Pc(82) float local82 = arg5[8] * (float) local3 + arg5[6] * (float) local11 + (float) local7 * arg5[7];
		@Pc(93) float local93 = (float) Math.atan2((double) local32, (double) local82) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local93 *= arg1;
		}
		@Pc(108) float local108 = local61 + arg9 + 0.5F;
		@Pc(122) float local122;
		if (arg0 == 1) {
			local122 = local93;
			local93 = -local108;
			local108 = local122;
		} else if (arg0 == 2) {
			local93 = -local93;
			local108 = -local108;
		} else if (arg0 == 3) {
			local122 = local93;
			local93 = local108;
			local108 = -local122;
		}
		aFloat27 = local93;
		aFloat24 = local108;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[FIBIIIFIFIF)V")
	public static void method3171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(3) int local3 = arg10 - arg6;
		@Pc(7) int local7 = arg4 - arg5;
		@Pc(11) int local11 = arg1 - arg3;
		@Pc(32) float local32 = (float) local7 * arg2[2] + (float) local3 * arg2[1] + arg2[0] * (float) local11;
		@Pc(53) float local53 = (float) local11 * arg2[3] + (float) local3 * arg2[4] + (float) local7 * arg2[5];
		@Pc(92) float local92 = (float) local11 * arg2[6] + (float) local3 * arg2[7] + (float) local7 * arg2[8];
		@Pc(124) float local124;
		@Pc(118) float local118;
		if (arg0 == 0) {
			local124 = arg11 + local32 + 0.5F;
			local118 = arg9 + 0.5F - local92;
		} else if (arg0 == 1) {
			local124 = local32 + arg11 + 0.5F;
			local118 = local92 + arg9 + 0.5F;
		} else if (arg0 == 2) {
			local124 = arg11 + 0.5F - local32;
			local118 = arg7 + 0.5F - local53;
		} else if (arg0 == 3) {
			local118 = arg7 + 0.5F - local53;
			local124 = arg11 + local32 + 0.5F;
		} else if (arg0 == 4) {
			local118 = arg7 + 0.5F - local53;
			local124 = arg9 + local92 + 0.5F;
		} else {
			local118 = arg7 + 0.5F - local53;
			local124 = arg9 + 0.5F - local92;
		}
		@Pc(216) float local216;
		if (arg8 == 1) {
			local216 = local124;
			local124 = -local118;
			local118 = local216;
		} else if (arg8 == 2) {
			local118 = -local118;
			local124 = -local124;
		} else if (arg8 == 3) {
			local216 = local124;
			local124 = local118;
			local118 = -local216;
		}
		Class126_Sub2.lb = local118;
		aFloat28 = local124;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[B)[B")
	public static byte[] method3173(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(8) byte[] local8 = new byte[arg0];
		Static363.method1668(arg1, 0, local8, 0, arg0);
		return local8;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(FIIIFFII)[F")
	public static float[] method3174(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(19) float local19 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(27) float local27 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local2[0] = local19;
		local2[5] = 0.0F;
		local2[3] = 0.0F;
		local2[2] = local27;
		local2[1] = 0.0F;
		local2[8] = local19;
		local2[4] = 1.0F;
		local2[6] = -local27;
		local2[7] = 0.0F;
		@Pc(72) float[] local72 = new float[9];
		@Pc(74) float local74 = 1.0F;
		@Pc(76) float local76 = 0.0F;
		@Pc(81) float local81 = (float) arg2 / 32767.0F;
		@Pc(92) float local92 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(96) float local96 = 1.0F - local81;
		@Pc(107) float local107 = (float) Math.sqrt((double) (arg1 * arg1 + arg6 * arg6));
		if (local107 == 0.0F && local81 == 0.0F) {
			local5 = local2;
		} else {
			if (local107 != 0.0F) {
				local74 = (float) -arg1 / local107;
				local76 = (float) arg6 / local107;
			}
			local72[4] = local81;
			local72[0] = local81 + local74 * local74 * local96;
			local72[2] = local76 * local74 * local96;
			local72[3] = local92 * -local76;
			local72[1] = local76 * local92;
			local72[6] = local96 * local74 * local76;
			local72[8] = local96 * local76 * local76 + local81;
			local72[5] = local74 * local92;
			local72[7] = local92 * -local74;
			local5[0] = local2[0] * local72[0] + local72[3] * local2[1] + local2[2] * local72[6];
			local5[1] = local2[0] * local72[1] + local72[4] * local2[1] + local2[2] * local72[7];
			local5[3] = local2[4] * local72[3] + local2[3] * local72[0] + local72[6] * local2[5];
			local5[2] = local2[2] * local72[8] + local2[0] * local72[2] + local72[5] * local2[1];
			local5[4] = local72[1] * local2[3] + local72[4] * local2[4] + local72[7] * local2[5];
			local5[6] = local72[0] * local2[6] + local72[3] * local2[7] + local2[8] * local72[6];
			local5[5] = local2[4] * local72[5] + local72[2] * local2[3] + local72[8] * local2[5];
			local5[7] = local72[7] * local2[8] + local2[7] * local72[4] + local72[1] * local2[6];
			local5[8] = local72[5] * local2[7] + local2[6] * local72[2] + local2[8] * local72[8];
		}
		local5[1] *= arg4;
		local5[4] *= arg3;
		local5[8] *= arg0;
		local5[7] *= arg0;
		local5[0] *= arg4;
		local5[6] *= arg0;
		local5[3] *= arg3;
		local5[5] *= arg3;
		local5[2] *= arg4;
		return local5;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([SII)[S")
	public static short[] method3175(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) short[] local8 = new short[arg1];
		Static363.method1669(arg0, 0, local8, 0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(FFFI)I")
	public static int method3176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(44) float local44 = arg0 < 0.0F ? -arg0 : arg0;
		if (local35 > local8 && local35 > local44) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local8 < local44 && local35 < local44) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I[FI)[F")
	public static float[] method3177(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) float[] local2 = new float[arg1];
		Static363.method1671(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(FII[FIIIIII)V")
	public static void method3179(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(3) int local3 = arg4 - arg5;
		@Pc(7) int local7 = arg1 - arg7;
		@Pc(11) int local11 = arg8 - arg6;
		@Pc(32) float local32 = (float) local3 * arg3[2] + arg3[1] * (float) local7 + (float) local11 * arg3[0];
		@Pc(58) float local58 = (float) local7 * arg3[4] + (float) local11 * arg3[3] + arg3[5] * (float) local3;
		@Pc(79) float local79 = (float) local3 * arg3[8] + (float) local11 * arg3[6] + (float) local7 * arg3[7];
		@Pc(94) float local94 = (float) Math.sqrt((double) (local79 * local79 + local58 * local58 + local32 * local32));
		@Pc(105) float local105 = (float) Math.atan2((double) local32, (double) local79) / 6.2831855F + 0.5F;
		@Pc(118) float local118 = arg0 + (float) Math.asin((double) (local58 / local94)) / 3.1415927F + 0.5F;
		@Pc(132) float local132;
		if (arg2 == 1) {
			local132 = local105;
			local105 = -local118;
			local118 = local132;
		} else if (arg2 == 2) {
			local118 = -local118;
			local105 = -local105;
		} else if (arg2 == 3) {
			local132 = local105;
			local105 = local118;
			local118 = -local132;
		}
		aFloat26 = local105;
		aFloat25 = local118;
	}
}
