import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
	public static int anInt3992;

	@OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
	public static int anInt3996;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "Lclient!tl;")
	public static Class282 aClass282_1;

	@OriginalMember(owner = "client!hc", name = "M", descriptor = "F")
	public static float aFloat137 = 1.0F;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "[I")
	public static final int[] anIntArray382 = new int[13];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(FIFFIIII)[F")
	public static float[] method3317(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) float[] local14 = new float[9];
		@Pc(17) float[] local17 = new float[9];
		@Pc(25) float local25 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(33) float local33 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local14[5] = 0.0F;
		local14[6] = -local33;
		local14[2] = local33;
		local14[4] = 1.0F;
		local14[7] = 0.0F;
		local14[0] = local25;
		local14[1] = 0.0F;
		local14[3] = 0.0F;
		local14[8] = local25;
		@Pc(77) float[] local77 = new float[9];
		@Pc(79) float local79 = 1.0F;
		@Pc(81) float local81 = 0.0F;
		@Pc(86) float local86 = (float) arg5 / 32767.0F;
		@Pc(90) float local90 = 1.0F - local86;
		@Pc(100) float local100 = -((float) Math.sqrt((double) (1.0F - local86 * local86)));
		@Pc(112) float local112 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
		if (local112 == 0.0F && local86 == 0.0F) {
			local17 = local14;
		} else {
			if (local112 != 0.0F) {
				local79 = (float) -arg4 / local112;
				local81 = (float) arg3 / local112;
			}
			local77[3] = local100 * -local81;
			local77[8] = local90 * local81 * local81 + local86;
			local77[0] = local79 * local79 * local90 + local86;
			local77[5] = local100 * local79;
			local77[6] = local79 * local81 * local90;
			local77[4] = local86;
			local77[7] = local100 * -local79;
			local77[1] = local100 * local81;
			local77[2] = local90 * local81 * local79;
			local17[0] = local14[2] * local77[6] + local14[0] * local77[0] + local77[3] * local14[1];
			local17[1] = local14[0] * local77[1] + local14[1] * local77[4] + local14[2] * local77[7];
			local17[2] = local77[8] * local14[2] + local77[5] * local14[1] + local14[0] * local77[2];
			local17[3] = local77[0] * local14[3] + local77[3] * local14[4] + local77[6] * local14[5];
			local17[4] = local77[7] * local14[5] + local77[4] * local14[4] + local14[3] * local77[1];
			local17[6] = local77[0] * local14[6] + local77[3] * local14[7] + local77[6] * local14[8];
			local17[5] = local14[3] * local77[2] + local14[4] * local77[5] + local77[8] * local14[5];
			local17[7] = local77[4] * local14[7] + local14[6] * local77[1] + local14[8] * local77[7];
			local17[8] = local77[5] * local14[7] + local77[2] * local14[6] + local77[8] * local14[8];
		}
		local17[3] *= arg0;
		local17[0] *= arg2;
		local17[1] *= arg2;
		local17[8] *= arg1;
		local17[7] *= arg1;
		local17[2] *= arg2;
		local17[5] *= arg0;
		local17[4] *= arg0;
		local17[6] *= arg1;
		return local17;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIFII[FIIIB)V")
	public static void method3318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(9) int local9 = arg3 - arg1;
		@Pc(13) int local13 = arg8 - arg7;
		@Pc(17) int local17 = arg6 - arg0;
		@Pc(38) float local38 = arg5[0] * (float) local13 + (float) local9 * arg5[1] + arg5[2] * (float) local17;
		@Pc(59) float local59 = arg5[5] * (float) local17 + arg5[4] * (float) local9 + (float) local13 * arg5[3];
		@Pc(80) float local80 = (float) local17 * arg5[8] + arg5[7] * (float) local9 + (float) local13 * arg5[6];
		@Pc(100) float local100 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local100)) / 3.1415927F + arg2 + 0.5F;
		@Pc(145) float local145;
		if (arg4 == 1) {
			local145 = local111;
			local111 = -local124;
			local124 = local145;
		} else if (arg4 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg4 == 3) {
			local145 = local111;
			local111 = local124;
			local124 = -local145;
		}
		Static51.aFloat44 = local124;
		Static518.aFloat63 = local111;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!eca;I)V")
	public static void method3319(@OriginalArg(0) Class6_Sub1_Sub2_Sub1 arg0) {
		@Pc(16) Class3_Sub16 local16 = (Class3_Sub16) Static25.aClass267_1.method6644((long) arg0.anInt8587);
		if (local16 == null) {
			Static100.method1935(arg0.aByte100, null, arg0.anIntArray733[0], arg0.anIntArray734[0], 0, null, arg0);
		} else {
			local16.method2231();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method3320(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg3 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg1 + 7) / 8);
		@Pc(41) int local41 = -((arg3 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local16;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg2;
		}
		return false;
	}
}
