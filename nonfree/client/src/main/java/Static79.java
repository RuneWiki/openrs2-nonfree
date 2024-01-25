import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "I")
	public static int anInt1962;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
	public static int anInt1964;

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IFBFIF[BILclient!hm;FIFII)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) byte[] arg4, @OriginalArg(8) Class134 arg5, @OriginalArg(9) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg0;
			arg5.method5899(arg7 / (float) 16, arg6 / (float) 128, arg2 * 127.0F, local12, arg8, arg3 / (float) 128, 0);
			arg7 *= 2.0F;
			arg6 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg4[local18] = (byte) ((float) arg4[local18] + local12[local52]);
				local18++;
			}
			arg3 *= 2.0F;
			arg2 *= arg1;
		}
		local18 = arg0;
		for (local52 = 0; local52 < 16384; local52++) {
			arg4[local18] = (byte) (arg4[local18] + 127);
			local18++;
		}
	}
}
