import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nd", name = "D", descriptor = "[I")
	public static final int[] anIntArray341 = new int[16];

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	public static int anInt6643 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(FFIZIFILclient!wfa;IFI[BIF)V")
	public static void method5570(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) Class100 arg3, @OriginalArg(9) float arg4, @OriginalArg(10) int arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) int arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(48) int local48;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg3.method2694(arg8 * 127.0F, arg2 / (float) 128, 0, arg4 / (float) 16, arg7, arg1 / (float) 128, local12);
			local42 = arg5;
			arg8 *= arg0;
			for (local48 = 0; local48 < 16384; local48++) {
				arg6[local42] = (byte) ((float) arg6[local42] + local12[local48]);
				local42++;
			}
			arg1 *= 2.0F;
			arg2 *= 2.0F;
			arg4 *= 2.0F;
		}
		local42 = arg5;
		for (local48 = 0; local48 < 16384; local48++) {
			arg6[local42] = (byte) (arg6[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBIFIIII[FIFFI)V")
	public static void method5573(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg6;
		@Pc(13) int local13 = arg1 - arg5;
		@Pc(17) int local17 = arg0 - arg4;
		@Pc(38) float local38 = arg7[2] * (float) local17 + arg7[1] * (float) local5 + arg7[0] * (float) local13;
		@Pc(59) float local59 = arg7[5] * (float) local17 + (float) local13 * arg7[3] + arg7[4] * (float) local5;
		@Pc(85) float local85 = (float) local13 * arg7[6] + arg7[7] * (float) local5 + arg7[8] * (float) local17;
		@Pc(109) float local109;
		@Pc(102) float local102;
		if (arg11 == 0) {
			local109 = local38 + arg10 + 0.5F;
			local102 = arg2 + 0.5F - local85;
		} else if (arg11 == 1) {
			local102 = arg2 + local85 + 0.5F;
			local109 = arg10 + local38 + 0.5F;
		} else if (arg11 == 2) {
			local102 = arg9 + 0.5F - local59;
			local109 = arg10 + 0.5F - local38;
		} else if (arg11 == 3) {
			local102 = arg9 + 0.5F - local59;
			local109 = local38 + arg10 + 0.5F;
		} else if (arg11 == 4) {
			local109 = arg2 + local85 + 0.5F;
			local102 = arg9 + 0.5F - local59;
		} else {
			local102 = arg9 + 0.5F - local59;
			local109 = arg2 + 0.5F - local85;
		}
		@Pc(195) float local195;
		if (arg8 == 1) {
			local195 = local109;
			local109 = -local102;
			local102 = local195;
		} else if (arg8 == 2) {
			local109 = -local109;
			local102 = -local102;
		} else if (arg8 == 3) {
			local195 = local109;
			local109 = local102;
			local102 = -local195;
		}
		Static373.aFloat199 = local102;
		Static63.aFloat35 = local109;
	}
}
