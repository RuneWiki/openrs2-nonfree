import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "Lclient!r;")
	public static Class43 aClass43_7;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "[Lclient!qe;")
	public static final Class3_Sub39[] aClass3_Sub39Array1 = new Class3_Sub39[1024];

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_185 = new Class272(35, 0);

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	public static int anInt6021 = -1;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
	public static int anInt6022 = -1;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "[I")
	public static final int[] anIntArray470 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(FFFII)F")
	public static float method5183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(7) float[] local7 = Static275.aFloatArrayArray6[arg3];
		return local7[2] * arg2 + arg0 * local7[0] + local7[1] * arg1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	public static void method5184() {
		Static261.aClass189_2.method4444();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IILclient!ss;FFFIFIIF)[B")
	public static byte[] method5185(@OriginalArg(2) Class214 arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static26.method7432(0, arg1, arg0, local15, arg2, arg5, arg3, arg4);
		return local15;
	}
}
