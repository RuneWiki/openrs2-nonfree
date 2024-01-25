import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!oda", name = "z", descriptor = "J")
	public static long aLong204;

	@OriginalMember(owner = "client!oda", name = "D", descriptor = "I")
	public static int anInt7096;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IILclient!ij;IILclient!fl;Lclient!wda;B)V")
	public static void method5992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class23_Sub2_Sub1_Sub2_Sub1 arg5, @OriginalArg(6) Class23_Sub2_Sub1_Sub2_Sub2 arg6) {
		@Pc(7) Class3_Sub32 local7 = new Class3_Sub32();
		local7.anInt6071 = arg0 << 9;
		local7.anInt6061 = arg4 << 9;
		local7.anInt6062 = arg1;
		if (arg2 != null) {
			local7.aClass178_1 = arg2;
			@Pc(32) int local32 = arg2.anInt4774;
			@Pc(35) int local35 = arg2.anInt4746;
			if (arg3 == 1 || arg3 == 3) {
				local35 = arg2.anInt4774;
				local32 = arg2.anInt4746;
			}
			local7.anInt6066 = arg2.anInt4755;
			local7.anInt6058 = arg4 + local32 << 9;
			local7.anIntArray388 = arg2.anIntArray317;
			local7.anInt6064 = arg2.anInt4763;
			local7.anInt6065 = arg2.anInt4731 << 9;
			local7.anInt6059 = arg2.anInt4771;
			local7.anInt6067 = arg2.anInt4740 << 9;
			local7.anInt6055 = arg2.anInt4741;
			local7.anInt6056 = arg2.anInt4786;
			local7.anInt6060 = arg2.anInt4753;
			local7.aBoolean470 = arg2.aBoolean382;
			local7.aBoolean471 = arg2.aBoolean383;
			local7.anInt6057 = local35 + arg0 << 9;
			if (arg2.anIntArray313 != null) {
				local7.aBoolean472 = true;
				local7.method5085();
			}
			if (local7.anIntArray388 != null) {
				local7.anInt6068 = local7.anInt6060 + (int) (Math.random() * (double) (local7.anInt6066 - local7.anInt6060));
			}
			Static497.aClass193_54.method4462(local7);
		} else if (arg6 != null) {
			local7.aClass23_Sub2_Sub1_Sub2_Sub2_2 = arg6;
			@Pc(152) Class5 local152 = arg6.aClass5_1;
			if (local152.anIntArray1 != null) {
				local7.aBoolean472 = true;
				local152 = local152.method56(Static592.aClass47_2);
			}
			if (local152 != null) {
				local7.anInt6057 = arg0 + local152.anInt66 << 9;
				local7.anInt6058 = arg4 + local152.anInt66 << 9;
				local7.anInt6055 = Static370.method5477(arg6);
				local7.anInt6067 = local152.anInt39 << 9;
				local7.anInt6059 = local152.anInt42;
				local7.aBoolean470 = local152.aBoolean5;
				local7.anInt6065 = local152.anInt48 << 9;
				local7.anInt6056 = local152.anInt62;
				local7.anInt6064 = local152.anInt72;
			}
			Static378.aClass193_33.method4462(local7);
		} else if (arg5 != null) {
			local7.aClass23_Sub2_Sub1_Sub2_Sub1_1 = arg5;
			local7.anInt6058 = arg5.method8625() + arg4 << 9;
			local7.anInt6057 = arg0 + arg5.method8625() << 9;
			local7.anInt6055 = Static7.method70(arg5);
			local7.anInt6064 = 256;
			local7.anInt6059 = arg5.anInt3276;
			local7.anInt6065 = arg5.anInt3268 << 9;
			local7.anInt6056 = 256;
			local7.aBoolean470 = arg5.aBoolean258;
			local7.anInt6067 = 0;
			Static554.aClass62_43.method1686((long) arg5.anInt10180, local7);
		}
	}

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "(IIII)V")
	public static void method5994(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 * Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741() >> 8;
		if (arg1 == -1 && !Static666.aBoolean755) {
			Static365.method3470();
		} else if (arg1 != -1 && (arg1 != Static149.anInt2812 || !Static160.method2734()) && local16 != 0 && !Static666.aBoolean755) {
			Static399.method4479(arg2, Static510.aClass143_118, local16, arg1);
			Static361.method5397();
		}
		if (Static149.anInt2812 != arg1) {
			Static344.aClass3_Sub9_Sub5_1 = null;
		}
		Static149.anInt2812 = arg1;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIFIIFI[FI[F)V")
	public static void method5995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10) {
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(13) int local13 = arg3 - arg5;
		@Pc(17) int local17 = arg6 - arg1;
		@Pc(38) float local38 = (float) local9 * arg10[2] + arg10[1] * (float) local17 + arg10[0] * (float) local13;
		@Pc(59) float local59 = (float) local17 * arg10[4] + arg10[3] * (float) local13 + arg10[5] * (float) local9;
		@Pc(80) float local80 = (float) local9 * arg10[8] + (float) local13 * arg10[6] + arg10[7] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local91 *= arg4;
		}
		@Pc(109) float local109 = arg7 + local59 + 0.5F;
		@Pc(128) float local128;
		if (arg9 == 1) {
			local128 = local91;
			local91 = -local109;
			local109 = local128;
		} else if (arg9 == 2) {
			local109 = -local109;
			local91 = -local91;
		} else if (arg9 == 3) {
			local128 = local91;
			local91 = local109;
			local109 = -local128;
		}
		arg8[1] = local109;
		arg8[0] = local91;
	}
}
