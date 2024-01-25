import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "F")
	public static float aFloat92;

	@OriginalMember(owner = "client!qa", name = "E", descriptor = "[J")
	public static long[] aLongArray11;

	@OriginalMember(owner = "client!qa", name = "fb", descriptor = "F")
	public static float aFloat93;

	@OriginalMember(owner = "client!qa", name = "ib", descriptor = "F")
	public static float aFloat94;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "F")
	public static float aFloat95;

	@OriginalMember(owner = "client!qa", name = "rb", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!qa", name = "ub", descriptor = "Z")
	public static boolean aBoolean406;

	@OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
	public static int anInt4806;

	@OriginalMember(owner = "client!qa", name = "Ab", descriptor = "I")
	public static int anInt4807;

	@OriginalMember(owner = "client!qa", name = "Cb", descriptor = "I")
	public static int anInt4808;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "Lclient!kg;")
	public static Class1_Sub7_Sub2 aClass1_Sub7_Sub2_2 = new Class1_Sub7_Sub2(8192);

	@OriginalMember(owner = "client!qa", name = "sb", descriptor = "[I")
	public static final int[] anIntArray618 = new int[8];

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "[I")
	public static int[] anIntArray619 = new int[1];

	@OriginalMember(owner = "client!qa", name = "xb", descriptor = "[I")
	public static int[] anIntArray620 = new int[1];

	@OriginalMember(owner = "client!qa", name = "zb", descriptor = "[I")
	public static final int[] anIntArray621 = new int[8];

	@OriginalMember(owner = "client!qa", name = "Bb", descriptor = "[I")
	public static final int[] anIntArray622 = new int[8];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IFFF)I")
	public static int method4405(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(9) float local9 = arg1 < (float) 0 ? -arg1 : arg1;
		@Pc(18) float local18 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(27) float local27 = arg2 < 0.0F ? -arg2 : arg2;
		if (local18 > local9 && local27 < local18) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local27 > local9 && local27 > local18) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)I")
	public static int method4406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IFFIIIIII[FI)V")
	public static void method4407(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float[] arg9) {
		@Pc(3) int local3 = arg3 - arg6;
		@Pc(7) int local7 = arg0 - arg5;
		@Pc(11) int local11 = arg7 - arg8;
		@Pc(40) float local40 = (float) local3 * arg9[1] + (float) local11 * arg9[0] + (float) local7 * arg9[2];
		@Pc(61) float local61 = arg9[3] * (float) local11 + (float) local3 * arg9[4] + (float) local7 * arg9[5];
		@Pc(82) float local82 = arg9[8] * (float) local7 + arg9[7] * (float) local3 + arg9[6] * (float) local11;
		@Pc(93) float local93 = (float) Math.atan2((double) local40, (double) local82) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local93 *= arg1;
		}
		@Pc(107) float local107 = arg2 + local61 + 0.5F;
		@Pc(122) float local122;
		if (arg4 == 1) {
			local122 = local93;
			local93 = -local107;
			local107 = local122;
		} else if (arg4 == 2) {
			local107 = -local107;
			local93 = -local93;
		} else if (arg4 == 3) {
			local122 = local93;
			local93 = local107;
			local107 = -local122;
		}
		aFloat94 = local107;
		aFloat91 = local93;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IFFBFIII)[F")
	public static float[] method4409(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local2[4] = 1.0F;
		local2[2] = local21;
		local2[0] = local13;
		local2[3] = 0.0F;
		local2[8] = local13;
		local2[7] = 0.0F;
		local2[5] = 0.0F;
		local2[1] = 0.0F;
		local2[6] = -local21;
		@Pc(66) float[] local66 = new float[9];
		@Pc(68) float local68 = 1.0F;
		@Pc(73) float local73 = (float) arg5 / 32767.0F;
		@Pc(75) float local75 = 0.0F;
		@Pc(86) float local86 = -((float) Math.sqrt((double) (1.0F - local73 * local73)));
		@Pc(91) float local91 = 1.0F - local73;
		@Pc(102) float local102 = (float) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0));
		if (local102 == 0.0F && local73 == 0.0F) {
			local5 = local2;
		} else {
			if (local102 != 0.0F) {
				local68 = (float) -arg4 / local102;
				local75 = (float) arg0 / local102;
			}
			local66[2] = local68 * local75 * local91;
			local66[4] = local73;
			local66[7] = local86 * -local68;
			local66[0] = local73 + local68 * local68 * local91;
			local66[3] = local86 * -local75;
			local66[6] = local91 * local68 * local75;
			local66[5] = local68 * local86;
			local66[1] = local75 * local86;
			local66[8] = local75 * local75 * local91 + local73;
			local5[0] = local2[2] * local66[6] + local66[0] * local2[0] + local66[3] * local2[1];
			local5[1] = local66[7] * local2[2] + local2[0] * local66[1] + local66[4] * local2[1];
			local5[2] = local66[5] * local2[1] + local2[0] * local66[2] + local2[2] * local66[8];
			local5[3] = local2[5] * local66[6] + local2[4] * local66[3] + local2[3] * local66[0];
			local5[4] = local66[4] * local2[4] + local2[3] * local66[1] + local2[5] * local66[7];
			local5[6] = local2[7] * local66[3] + local66[0] * local2[6] + local66[6] * local2[8];
			local5[5] = local66[2] * local2[3] + local2[4] * local66[5] + local2[5] * local66[8];
			local5[7] = local2[6] * local66[1] + local2[7] * local66[4] + local66[7] * local2[8];
			local5[8] = local2[8] * local66[8] + local66[5] * local2[7] + local2[6] * local66[2];
		}
		local5[6] *= arg1;
		local5[0] *= arg3;
		local5[2] *= arg3;
		local5[5] *= arg2;
		local5[3] *= arg2;
		local5[1] *= arg3;
		local5[8] *= arg1;
		local5[7] *= arg1;
		local5[4] *= arg2;
		return local5;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([FIB)[F")
	public static float[] method4412(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float[] local8 = new float[arg1];
		Static367.method5384(arg0, 0, local8, 0, arg1);
		return local8;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([SBI)[S")
	public static short[] method4419(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(2) short[] local2 = new short[arg1];
		Static367.method5382(arg0, 0, local2, 0, arg1);
		return local2;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[FIFIIIFIFII)V")
	public static void method4422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg0 - arg1;
		@Pc(7) int local7 = arg5 - arg3;
		@Pc(11) int local11 = arg10 - arg6;
		@Pc(37) float local37 = arg2[0] * (float) local3 + (float) local11 * arg2[1] + arg2[2] * (float) local7;
		@Pc(58) float local58 = (float) local7 * arg2[5] + (float) local11 * arg2[4] + arg2[3] * (float) local3;
		@Pc(79) float local79 = arg2[8] * (float) local7 + arg2[6] * (float) local3 + arg2[7] * (float) local11;
		@Pc(103) float local103;
		@Pc(96) float local96;
		if (arg11 == 0) {
			local96 = arg4 + 0.5F - local79;
			local103 = local37 + arg9 + 0.5F;
		} else if (arg11 == 1) {
			local96 = local79 + arg4 + 0.5F;
			local103 = arg9 + local37 + 0.5F;
		} else if (arg11 == 2) {
			local96 = arg8 + 0.5F - local58;
			local103 = arg9 + 0.5F - local37;
		} else if (arg11 == 3) {
			local103 = arg9 + local37 + 0.5F;
			local96 = arg8 + 0.5F - local58;
		} else if (arg11 == 4) {
			local96 = arg8 + 0.5F - local58;
			local103 = arg4 + local79 + 0.5F;
		} else {
			local103 = arg4 + 0.5F - local79;
			local96 = arg8 + 0.5F - local58;
		}
		@Pc(186) float local186;
		if (arg7 == 1) {
			local186 = local103;
			local103 = -local96;
			local96 = local186;
		} else if (arg7 == 2) {
			local96 = -local96;
			local103 = -local103;
		} else if (arg7 == 3) {
			local186 = local103;
			local103 = local96;
			local96 = -local186;
		}
		aFloat95 = local96;
		aFloat92 = local103;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[FIIIFIIII)V")
	public static void method4423(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) int local3 = arg2 - arg4;
		@Pc(7) int local7 = arg8 - arg0;
		@Pc(11) int local11 = arg6 - arg7;
		@Pc(32) float local32 = arg1[1] * (float) local7 + (float) local11 * arg1[0] + arg1[2] * (float) local3;
		@Pc(53) float local53 = (float) local3 * arg1[5] + (float) local7 * arg1[4] + arg1[3] * (float) local11;
		@Pc(74) float local74 = (float) local3 * arg1[8] + (float) local7 * arg1[7] + (float) local11 * arg1[6];
		@Pc(93) float local93 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(104) float local104 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(117) float local117 = (float) Math.asin((double) (local53 / local93)) / 3.1415927F + arg5 + 0.5F;
		@Pc(122) float local122;
		if (arg3 == 1) {
			local122 = local104;
			local104 = -local117;
			local117 = local122;
		} else if (arg3 == 2) {
			local117 = -local117;
			local104 = -local104;
		} else if (arg3 == 3) {
			local122 = local104;
			local104 = local117;
			local117 = -local122;
		}
		aFloat96 = local104;
		aFloat93 = local117;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B[BI)[B")
	public static byte[] method4424(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(10) byte[] local10 = new byte[arg1];
		Static367.method5383(arg0, 0, local10, 0, arg1);
		return local10;
	}
}
