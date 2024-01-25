import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!aha", name = "n", descriptor = "Lclient!dga;")
	public static Class3_Sub7_Sub5 aClass3_Sub7_Sub5_1 = null;

	@OriginalMember(owner = "client!aha", name = "p", descriptor = "Lclient!bj;")
	public static final Class37 aClass37_1 = new Class37();

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IFIFBIIIILclient!dfa;F[BFF)V")
	public static void method522(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3, @OriginalArg(9) Class75 arg4, @OriginalArg(10) float arg5, @OriginalArg(11) byte[] arg6, @OriginalArg(12) float arg7, @OriginalArg(13) float arg8) {
		@Pc(19) float[] local19 = new float[16384];
		@Pc(25) int local25;
		@Pc(55) int local55;
		for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
			local25 = arg0;
			arg4.method7323(arg7 * 127.0F, arg2 / (float) 128, arg8 / (float) 128, arg3, 0, local19, arg5 / (float) 16);
			arg7 *= arg1;
			for (local55 = 0; local55 < 16384; local55++) {
				arg6[local25] = (byte) (int) ((float) arg6[local25] + local19[local55]);
				local25++;
			}
			arg8 *= 2.0F;
			arg2 *= 2.0F;
			arg5 *= 2.0F;
		}
		local25 = arg0;
		for (local55 = 0; local55 < 16384; local55++) {
			arg6[local25] = (byte) (arg6[local25] + 127);
			local25++;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V")
	public static void method523(@OriginalArg(0) int arg0) {
		Static287.anInt4418 = arg0;
		@Pc(12) Class307 local12 = Static41.aClass307_11;
		synchronized (Static41.aClass307_11) {
			Static41.aClass307_11.method7006();
		}
	}
}
