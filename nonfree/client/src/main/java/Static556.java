import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!tga;")
	public static Class349 aClass349_4;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIBIII)V")
	public static void method7521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(27) int local27 = arg2; local27 <= arg3; local27++) {
			Static161.method2977(arg0, arg1, arg4, Static120.anIntArrayArray18[local27], -111);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([BIFIFIBIFFIFILclient!kda;)V")
	public static void method7522(@OriginalArg(0) byte[] arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) int arg7, @OriginalArg(13) Class198 arg8) {
		@Pc(19) float[] local19 = new float[16384];
		@Pc(51) int local51;
		@Pc(61) int local61;
		for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
			arg8.method6185(arg4 / (float) 16, arg1 / (float) 128, arg7, 0, local19, arg5 * 127.0F, arg2 / (float) 128);
			local51 = arg3;
			arg2 *= 2.0F;
			arg5 *= arg6;
			for (local61 = 0; local61 < 16384; local61++) {
				arg0[local51] = (byte) (int) ((float) arg0[local51] + local19[local61]);
				local51++;
			}
			arg4 *= 2.0F;
			arg1 *= 2.0F;
		}
		local51 = arg3;
		for (local61 = 0; local61 < 16384; local61++) {
			arg0[local51] -= -127;
			local51++;
		}
	}
}
