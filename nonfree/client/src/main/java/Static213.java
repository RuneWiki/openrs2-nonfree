import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!iea", name = "b", descriptor = "Lclient!of;")
	public static Class247 aClass247_1;

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[BFIIFFFFIIILclient!tk;I)V")
	public static void method3334(@OriginalArg(1) byte[] arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7, @OriginalArg(12) Class230 arg8) {
		@Pc(17) float[] local17 = new float[16384];
		@Pc(47) int local47;
		@Pc(61) int local61;
		for (@Pc(19) int local19 = 0; local19 < 8; local19++) {
			arg8.method4689(arg5 * 127.0F, 0, arg2 / (float) 16, arg6, local17, arg1 / (float) 128, arg4 / (float) 128);
			local47 = arg7;
			arg4 *= 2.0F;
			arg5 *= arg3;
			arg2 *= 2.0F;
			for (local61 = 0; local61 < 16384; local61++) {
				arg0[local47] = (byte) ((float) arg0[local47] + local17[local61]);
				local47++;
			}
			arg1 *= 2.0F;
		}
		local47 = arg7;
		for (local61 = 0; local61 < 16384; local61++) {
			arg0[local47] = (byte) (arg0[local47] + 127);
			local47++;
		}
	}

	@OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lclient!rga;)V")
	public static void method3335(@OriginalArg(0) Class8_Sub3 arg0) {
		Static402.aClass134_11.MA(arg0.anInt9365, arg0.anInt9361 + (arg0.method7618() >> 1), arg0.anInt9370, Static99.anIntArray456);
		arg0.anInt9368 = Static99.anIntArray456[0];
		arg0.anInt9366 = Static99.anIntArray456[1];
		arg0.anInt9367 = Static99.anIntArray456[2];
	}
}
