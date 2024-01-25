import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!os", name = "y", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!os", name = "A", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!os", name = "N", descriptor = "F")
	public static float aFloat47;

	@OriginalMember(owner = "client!os", name = "O", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!os", name = "R", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!os", name = "ib", descriptor = "F")
	public static float aFloat50;

	@OriginalMember(owner = "client!os", name = "mb", descriptor = "[J")
	public static long[] aLongArray5;

	@OriginalMember(owner = "client!os", name = "qb", descriptor = "I")
	public static int anInt4875;

	@OriginalMember(owner = "client!os", name = "rb", descriptor = "I")
	public static int anInt4876;

	@OriginalMember(owner = "client!os", name = "wb", descriptor = "I")
	public static int anInt4877;

	@OriginalMember(owner = "client!os", name = "xb", descriptor = "Z")
	public static boolean aBoolean409;

	@OriginalMember(owner = "client!os", name = "jb", descriptor = "Lclient!hn;")
	public static Class4_Sub7_Sub2 aClass4_Sub7_Sub2_2 = new Class4_Sub7_Sub2(8192);

	@OriginalMember(owner = "client!os", name = "pb", descriptor = "[I")
	public static final int[] anIntArray400 = new int[8];

	@OriginalMember(owner = "client!os", name = "tb", descriptor = "[I")
	public static int[] anIntArray401 = new int[1];

	@OriginalMember(owner = "client!os", name = "zb", descriptor = "[I")
	public static int[] anIntArray403 = new int[1];

	@OriginalMember(owner = "client!os", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray404 = new int[8];

	@OriginalMember(owner = "client!os", name = "Hb", descriptor = "[I")
	public static final int[] anIntArray405 = new int[8];

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[FIIIIIIFB)V")
	public static void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8) {
		@Pc(3) int local3 = arg2 - arg0;
		@Pc(7) int local7 = arg3 - arg4;
		@Pc(11) int local11 = arg5 - arg7;
		@Pc(32) float local32 = arg1[2] * (float) local3 + (float) local7 * arg1[0] + (float) local11 * arg1[1];
		@Pc(53) float local53 = arg1[5] * (float) local3 + (float) local7 * arg1[3] + (float) local11 * arg1[4];
		@Pc(74) float local74 = (float) local7 * arg1[6] + arg1[7] * (float) local11 + arg1[8] * (float) local3;
		@Pc(89) float local89 = (float) Math.sqrt((double) (local74 * local74 + local53 * local53 + local32 * local32));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(122) float local122 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + arg8 + 0.5F;
		@Pc(136) float local136;
		if (arg6 == 1) {
			local136 = local100;
			local100 = -local122;
			local122 = local136;
		} else if (arg6 == 2) {
			local100 = -local100;
			local122 = -local122;
		} else if (arg6 == 3) {
			local136 = local100;
			local100 = local122;
			local122 = -local136;
		}
		aFloat49 = local100;
		aFloat47 = local122;
	}

	@OriginalMember(owner = "client!os", name = "c", descriptor = "(III)I")
	public static int method4033(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([BII)[B")
	public static byte[] method4034(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[arg1];
		Static363.method4761(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IFBIIIFF)[F")
	public static float[] method4040(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local2[8] = local13;
		local2[6] = -local21;
		local2[5] = 0.0F;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[7] = 0.0F;
		local2[4] = 1.0F;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg0 / 32767.0F;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(98) float local98 = 1.0F - local84;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
		if (local110 == 0.0F && local84 == 0.0F) {
			local5 = local2;
		} else {
			if (local110 != 0.0F) {
				local77 = (float) -arg4 / local110;
				local79 = (float) arg3 / local110;
			}
			local75[1] = local94 * local79;
			local75[0] = local84 + local98 * local77 * local77;
			local75[2] = local98 * local77 * local79;
			local75[8] = local98 * local79 * local79 + local84;
			local75[6] = local79 * local77 * local98;
			local75[4] = local84;
			local75[3] = local94 * -local79;
			local75[7] = local94 * -local77;
			local75[5] = local94 * local77;
			local5[0] = local75[3] * local2[1] + local75[0] * local2[0] + local2[2] * local75[6];
			local5[1] = local75[7] * local2[2] + local75[1] * local2[0] + local2[1] * local75[4];
			local5[2] = local75[8] * local2[2] + local2[1] * local75[5] + local2[0] * local75[2];
			local5[3] = local2[5] * local75[6] + local2[4] * local75[3] + local75[0] * local2[3];
			local5[4] = local2[4] * local75[4] + local2[3] * local75[1] + local75[7] * local2[5];
			local5[5] = local2[5] * local75[8] + local75[5] * local2[4] + local2[3] * local75[2];
			local5[6] = local75[0] * local2[6] + local2[7] * local75[3] + local75[6] * local2[8];
			local5[7] = local75[4] * local2[7] + local75[1] * local2[6] + local75[7] * local2[8];
			local5[8] = local2[7] * local75[5] + local75[2] * local2[6] + local75[8] * local2[8];
		}
		local5[4] *= arg1;
		local5[8] *= arg6;
		local5[5] *= arg1;
		local5[6] *= arg6;
		local5[2] *= arg5;
		local5[0] *= arg5;
		local5[3] *= arg1;
		local5[1] *= arg5;
		local5[7] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(II[F)[F")
	public static float[] method4041(@OriginalArg(1) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(2) float[] local2 = new float[arg0];
		Static363.method4760(arg1, 0, local2, 0, arg0);
		return local2;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([SIZ)[S")
	public static short[] method4043(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) short[] local15 = new short[arg1];
		Static363.method4756(arg0, 0, local15, 0, arg1);
		return local15;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "([FIIIIIZFIFFII)V")
	public static void method4046(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg3 - arg1;
		@Pc(7) int local7 = arg7 - arg10;
		@Pc(11) int local11 = arg4 - arg5;
		@Pc(32) float local32 = (float) local3 * arg0[2] + (float) local11 * arg0[0] + arg0[1] * (float) local7;
		@Pc(53) float local53 = (float) local3 * arg0[5] + arg0[4] * (float) local7 + (float) local11 * arg0[3];
		@Pc(74) float local74 = (float) local3 * arg0[8] + arg0[7] * (float) local7 + arg0[6] * (float) local11;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (arg2 == 0) {
			local96 = local32 + arg8 + 0.5F;
			local90 = arg9 + 0.5F - local74;
		} else if (arg2 == 1) {
			local90 = local74 + arg9 + 0.5F;
			local96 = arg8 + local32 + 0.5F;
		} else if (arg2 == 2) {
			local96 = arg8 + 0.5F - local32;
			local90 = arg6 + 0.5F - local53;
		} else if (arg2 == 3) {
			local96 = arg8 + local32 + 0.5F;
			local90 = arg6 + 0.5F - local53;
		} else if (arg2 == 4) {
			local90 = arg6 + 0.5F - local53;
			local96 = local74 + arg9 + 0.5F;
		} else {
			local90 = arg6 + 0.5F - local53;
			local96 = arg9 + 0.5F - local74;
		}
		@Pc(197) float local197;
		if (arg11 == 1) {
			local197 = local96;
			local96 = -local90;
			local90 = local197;
		} else if (arg11 == 2) {
			local90 = -local90;
			local96 = -local96;
		} else if (arg11 == 3) {
			local197 = local96;
			local96 = local90;
			local90 = -local197;
		}
		aFloat45 = local90;
		aFloat48 = local96;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIFIII[FIFII)V")
	public static void method4048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(10) int arg9) {
		@Pc(3) int local3 = arg0 - arg7;
		@Pc(7) int local7 = arg9 - arg1;
		@Pc(11) int local11 = arg3 - arg4;
		@Pc(32) float local32 = arg6[2] * (float) local7 + (float) local3 * arg6[1] + arg6[0] * (float) local11;
		@Pc(57) float local57 = arg6[5] * (float) local7 + (float) local3 * arg6[4] + (float) local11 * arg6[3];
		@Pc(78) float local78 = (float) local11 * arg6[6] + arg6[7] * (float) local3 + arg6[8] * (float) local7;
		@Pc(89) float local89 = (float) Math.atan2((double) local32, (double) local78) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local89 *= arg8;
		}
		@Pc(103) float local103 = local57 + arg2 + 0.5F;
		@Pc(108) float local108;
		if (arg5 == 1) {
			local108 = local89;
			local89 = -local103;
			local103 = local108;
		} else if (arg5 == 2) {
			local103 = -local103;
			local89 = -local89;
		} else if (arg5 == 3) {
			local108 = local89;
			local89 = local103;
			local103 = -local108;
		}
		aFloat46 = local103;
		aFloat50 = local89;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(FFIF)I")
	public static int method4049(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local26 > local17 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
