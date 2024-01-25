import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "[S")
	public static short[] aShortArray107;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "I")
	public static int anInt8673 = 16777215;

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "Lclient!cu;")
	public static final Class60 aClass60_9 = new Class60();

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "[I")
	public static final int[] anIntArray479 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILclient!rp;FIIFI[BIFIFFI)V")
	public static void method7168(@OriginalArg(1) Class58 arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) byte[] arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6, @OriginalArg(11) float arg7, @OriginalArg(12) float arg8) {
		@Pc(20) float[] local20 = new float[16384];
		@Pc(26) int local26;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
			local26 = arg4;
			arg0.method1943(arg5 / (float) 16, arg2 * 127.0F, arg6, arg7 / (float) 128, 0, local20, arg1 / (float) 128);
			arg7 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg3[local26] = (byte) ((float) arg3[local26] + local20[local56]);
				local26++;
			}
			arg5 *= 2.0F;
			arg2 *= arg8;
			arg1 *= 2.0F;
		}
		local26 = arg4;
		for (local56 = 0; local56 < 16384; local56++) {
			arg3[local26] = (byte) (arg3[local26] + 127);
			local26++;
		}
	}
}
