import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static652 {

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(ILclient!lea;)V")
	public static void method9568(@OriginalArg(1) Class101_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static546.anObject21 == null) {
			@Pc(5) Class12_Sub1_Sub1 local5 = new Class12_Sub1_Sub1();
			local12 = local5.method7568();
			Static546.anObject21 = Static340.method5715(local12);
		}
		if (Static346.anObject15 == null) {
			@Pc(27) Class12_Sub2_Sub1 local27 = new Class12_Sub2_Sub1();
			local12 = local27.method2044();
			Static346.anObject15 = Static340.method5715(local12);
		}
		@Pc(42) Class168 local42 = arg0.aClass168_1;
		if (local42.method4511() && Static468.anObject20 == null) {
			local12 = Static574.method8719(0.6F, 4.0F, 16.0F, 4.0F, 0.5F, new Class225_Sub1(419684));
			Static468.anObject20 = Static340.method5715(local12);
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IFBI[FIII[FII)V")
	public static void method9569(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg5;
		@Pc(9) int local9 = arg6 - arg9;
		@Pc(17) int local17 = arg2 - arg8;
		@Pc(46) float local46 = arg7[1] * (float) local5 + (float) local9 * arg7[0] + arg7[2] * (float) local17;
		@Pc(67) float local67 = arg7[4] * (float) local5 + arg7[3] * (float) local9 + arg7[5] * (float) local17;
		@Pc(88) float local88 = arg7[6] * (float) local9 + arg7[7] * (float) local5 + (float) local17 * arg7[8];
		@Pc(103) float local103 = (float) Math.sqrt((double) (local67 * local67 + local46 * local46 + local88 * local88));
		@Pc(114) float local114 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		@Pc(127) float local127 = (float) Math.asin((double) (local67 / local103)) / 3.1415927F + arg1 + 0.5F;
		@Pc(140) float local140;
		if (arg0 == 1) {
			local140 = local114;
			local114 = -local127;
			local127 = local140;
		} else if (arg0 == 2) {
			local127 = -local127;
			local114 = -local114;
		} else if (arg0 == 3) {
			local140 = local114;
			local114 = local127;
			local127 = -local140;
		}
		arg3[0] = local114;
		arg3[1] = local127;
	}
}
