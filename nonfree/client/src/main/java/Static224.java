import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "B")
	public static byte aByte61;

	@OriginalMember(owner = "client!hea", name = "d", descriptor = "Lclient!tq;")
	public static final Class340 aClass340_23 = new Class340(64);

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "[I")
	public static final int[] anIntArray207 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "[I")
	public static final int[] anIntArray208 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILclient!fc;IIFIIFIIFF[BF)V")
	public static void method3500(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) int arg4, @OriginalArg(10) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) byte[] arg7, @OriginalArg(13) float arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(44) int local44;
		@Pc(50) int local50;
		for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
			arg0.method573(arg8 / (float) 16, arg3 / (float) 128, arg2 / (float) 128, arg4, local10, 0, arg5 * 127.0F);
			local44 = arg1;
			arg2 *= 2.0F;
			for (local50 = 0; local50 < 16384; local50++) {
				arg7[local44] = (byte) (int) ((float) arg7[local44] + local10[local50]);
				local44++;
			}
			arg8 *= 2.0F;
			arg5 *= arg6;
			arg3 *= 2.0F;
		}
		local44 = arg1;
		for (local50 = 0; local50 < 16384; local50++) {
			arg7[local44] = (byte) (arg7[local44] + 127);
			local44++;
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILclient!ka;II)Lclient!id;")
	public static Class160 method3501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class153 arg2, @OriginalArg(3) int arg3) {
		return arg2 == null ? null : new Class160(arg3, arg0, arg1, arg2.na(), arg2.V(), arg2.RA(), arg2.fa(), arg2.EA(), arg2.HA(), arg2.G());
	}
}
