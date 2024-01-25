import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	public static int anInt461;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lclient!ufa;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!sga;")
	public static Class96 aClass96_1;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!afa;")
	public static final Class12 aClass12_2 = new Class12("LIVE", 0);

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "[I")
	public static int[] anIntArray10 = null;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
	public static int anInt462 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII[FII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5) {
		if (arg0 > 0 && !Static152.method3040(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static152.method3040(arg5)) {
			@Pc(34) int local34 = Static275.method8431(6408);
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg0 >= arg5 ? arg5 : arg0;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(63) int local63 = arg5 >> 1;
			@Pc(65) float[] local65 = arg4;
			@Pc(72) float[] local72 = new float[local63 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg0, arg5, 0, 6408, 5126, local65, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg0 * local34;
				for (@Pc(94) int local94 = 0; local94 < local34; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local63; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local51; local110++) {
							@Pc(116) float local116 = local65[local100];
							local100 += local34;
							@Pc(126) float local126 = local116 + local65[local100];
							@Pc(132) float local132 = local126 + local65[local104];
							local100 += local34;
							local104 += local34;
							@Pc(146) float local146 = local132 + local65[local104];
							local104 += local34;
							local72[local98] = local146 * 0.25F;
							local98 += local34;
						}
						local100 += local92;
						local104 += local92;
					}
				}
				@Pc(186) float[] local186 = local72;
				local72 = local65;
				arg0 = local51;
				arg5 = local63;
				local65 = local186;
				local36++;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local63 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)Z")
	public static boolean method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
