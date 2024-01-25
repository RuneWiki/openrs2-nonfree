import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
	public static int[] anIntArray390 = new int[1];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIFILclient!qi;IFIIIFFFI)V")
	public static void method5464(@OriginalArg(0) byte[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class234 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg3.method6103(arg4, arg6 / (float) 128, arg8 / (float) 128, local12, 0, arg5 / (float) 16, arg1 * 127.0F);
			local42 = arg2;
			arg8 *= 2.0F;
			arg1 *= arg7;
			arg5 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg0[local42] = (byte) ((float) arg0[local42] + local12[local56]);
				local42++;
			}
			arg6 *= 2.0F;
		}
		local42 = arg2;
		for (local56 = 0; local56 < 16384; local56++) {
			arg0[local42] = (byte) (arg0[local42] + 127);
			local42++;
		}
	}
}
