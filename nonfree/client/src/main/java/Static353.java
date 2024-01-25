import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "[I")
	public static final int[] anIntArray434 = new int[2];

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
	public static int anInt6121 = 765;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIFLclient!ge;FF[BIIFIFZ)V")
	public static void method4771(@OriginalArg(3) float arg0, @OriginalArg(4) Class79 arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) byte[] arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) int arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(23) int local23;
		@Pc(65) int local65;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local23 = arg7;
			arg1.method4866(0, arg3 / (float) 128, arg2 / (float) 16, arg6 / (float) 128, arg8 * 127.0F, arg5, local12);
			arg2 *= 2.0F;
			arg3 *= 2.0F;
			arg6 *= 2.0F;
			arg8 *= arg0;
			for (local65 = 0; local65 < 16384; local65++) {
				arg4[local23] = (byte) ((float) arg4[local23] + local12[local65]);
				local23++;
			}
		}
		local23 = arg7;
		for (local65 = 0; local65 < 16384; local65++) {
			arg4[local23] = (byte) (arg4[local23] + 127);
			local23++;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IZ)Z")
	public static boolean method4772(@OriginalArg(1) boolean arg0) {
		@Pc(6) boolean local6 = Static122.aClass19_16.method4301();
		if (local6 == arg0) {
			return true;
		}
		if (!arg0) {
			Static122.aClass19_16.method4236();
		} else if (!Static122.aClass19_16.method4248()) {
			arg0 = false;
		}
		if (local6 == arg0) {
			return false;
		} else {
			Static323.aClass50_Sub1_1.aBoolean300 = arg0;
			Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
			return true;
		}
	}
}
