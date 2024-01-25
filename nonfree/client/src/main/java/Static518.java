import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
	public static int[] anIntArray387;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static int anInt3345 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIILclient!fa;Lclient!fca;Lclient!xa;I)V")
	public static void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) Class97 arg5, @OriginalArg(6) Class4 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static354.anInt6233 == 4) {
			local16 = (int) Static399.aFloat167 & 0x3FFF;
		} else {
			local16 = (int) Static399.aFloat167 + Static574.anInt6272 & 0x3FFF;
		}
		@Pc(41) int local41 = Math.max(arg5.anInt2340 / 2, arg5.anInt2305 / 2) + 10;
		@Pc(50) int local50 = arg1 * arg1 + arg0 * arg0;
		if (local41 * local41 < local50) {
			return;
		}
		@Pc(60) int local60 = Class138.anIntArray392[local16];
		@Pc(64) int local64 = Class138.anIntArray393[local16];
		if (Static354.anInt6233 != 4) {
			local60 = local60 * 256 / (Static291.anInt4749 + 256);
			local64 = local64 * 256 / (Static291.anInt4749 + 256);
		}
		@Pc(95) int local95 = local60 * arg0 + local64 * arg1 >> 14;
		@Pc(106) int local106 = arg0 * local64 - local60 * arg1 >> 14;
		arg6.method6510(local95 + arg5.anInt2340 / 2 + arg2 - arg6.AA() / 2, arg5.anInt2305 / 2 + (arg3 - local106) + -(arg6.a() / 2), arg4, arg2, arg3);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)I")
	public static int method2903(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIZZ)V")
	public static void method2904(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) boolean arg3, @OriginalArg(6) boolean arg4) {
		Static188.anInt3275 = 9;
		Static57.anInt953 = 0x1 << Static188.anInt3275;
		Static431.anInt7547 = Static57.anInt953 >> 1;
		Static337.anInt5989 = (int) Math.sqrt((double) (Static431.anInt7547 * Static431.anInt7547 + Static431.anInt7547 * Static431.anInt7547));
		Static350.anInt6168 = Static57.anInt953 >> 2;
		Static291.anInt4747 = Static57.anInt953;
		Static80.anInt1391 = arg0;
		Static164.anInt2881 = arg1;
		Static387.anInt6907 = arg2;
		Static144.aClass9ArrayArrayArray1 = new Class9[4][Static80.anInt1391][Static164.anInt2881];
		Static34.aClass60Array10 = new Class60[4];
		if (arg3) {
			Static284.anIntArrayArray56 = new int[Static80.anInt1391][Static164.anInt2881];
			Static151.aByteArrayArray8 = new byte[Static80.anInt1391][Static164.anInt2881];
			Static24.aShortArrayArray11 = new short[Static80.anInt1391][Static164.anInt2881];
			Static177.aClass9ArrayArrayArray2 = new Class9[1][Static80.anInt1391][Static164.anInt2881];
			Static127.aClass60Array7 = new Class60[1];
		} else {
			Static284.anIntArrayArray56 = null;
			Static151.aByteArrayArray8 = null;
			Static24.aShortArrayArray11 = null;
			Static177.aClass9ArrayArrayArray2 = null;
			Static127.aClass60Array7 = null;
		}
		if (arg4) {
			Static140.aLongArrayArrayArray1 = new long[4][arg0][arg1];
			Static149.aClass178Array1 = new Class178[65535];
			Static368.aBooleanArray35 = new boolean[65535];
			Static164.anInt2888 = 0;
		} else {
			Static140.aLongArrayArrayArray1 = null;
			Static149.aClass178Array1 = null;
			Static368.aBooleanArray35 = null;
			Static164.anInt2888 = 0;
		}
		Static137.method2053(false);
		Static175.aClass268Array2 = new Class268[1000];
		Static342.anInt9106 = 0;
		Static52.aClass268Array1 = new Class268[1000];
		Static123.anInt2132 = 0;
		Static448.anIntArrayArrayArray18 = new int[4][Static80.anInt1391 + 1][Static164.anInt2881 + 1];
		Static187.aClass29_Sub2Array3 = new Class29_Sub2[5000];
		Static402.anInt7079 = 0;
		Static6.aBooleanArrayArray3 = new boolean[Static387.anInt6907 + Static387.anInt6907 + 1][Static387.anInt6907 + Static387.anInt6907 + 1];
		Static286.aBooleanArrayArray5 = new boolean[Static387.anInt6907 + Static387.anInt6907 + 2][Static387.anInt6907 + Static387.anInt6907 + 2];
		Static325.aClass158_1 = null;
	}
}
