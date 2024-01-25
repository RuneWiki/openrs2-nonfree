import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!tk", name = "mi", descriptor = "I")
	public static int anInt9177;

	@OriginalMember(owner = "client!tk", name = "Bh", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_161 = new Class145(20, 8);

	@OriginalMember(owner = "client!tk", name = "fi", descriptor = "[I")
	public static final int[] anIntArray660 = new int[4096];

	@OriginalMember(owner = "client!tk", name = "si", descriptor = "Lclient!bda;")
	public static final Class32 aClass32_6 = new Class32();

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7816(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static516.method7304("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIF[F[FIIIIIIF)V")
	public static void method7821(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10) {
		@Pc(5) int local5 = arg4 - arg7;
		@Pc(13) int local13 = arg8 - arg6;
		@Pc(21) int local21 = arg5 - arg0;
		@Pc(42) float local42 = (float) local13 * arg2[2] + (float) local21 * arg2[1] + arg2[0] * (float) local5;
		@Pc(63) float local63 = arg2[4] * (float) local21 + arg2[3] * (float) local5 + arg2[5] * (float) local13;
		@Pc(84) float local84 = arg2[8] * (float) local13 + (float) local21 * arg2[7] + (float) local5 * arg2[6];
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local95 *= arg1;
		}
		@Pc(109) float local109 = local63 + arg10 + 0.5F;
		@Pc(114) float local114;
		if (arg9 == 1) {
			local114 = local95;
			local95 = -local109;
			local109 = local114;
		} else if (arg9 == 2) {
			local109 = -local109;
			local95 = -local95;
		} else if (arg9 == 3) {
			local114 = local95;
			local95 = local109;
			local109 = -local114;
		}
		arg3[0] = local95;
		arg3[1] = local109;
	}
}
