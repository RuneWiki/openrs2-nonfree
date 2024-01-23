import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "Z")
	public static volatile boolean aBoolean337 = false;

	@OriginalMember(owner = "client!tl", name = "M", descriptor = "I")
	public static int anInt5455 = 0;

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray68 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(III)J")
	public static long method4131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass106_1 == null ? 0L : local7.aClass106_1.aLong131;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILclient!wf;II)V")
	public static void method4132(@OriginalArg(1) int arg0, @OriginalArg(2) Class191 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static294.aBoolean367) {
			Static156.method2546(arg0, arg2, arg0 + arg1.anInt6088, arg2 - -arg1.anInt6128);
		}
		if (Static221.anInt4695 < 3) {
			if (Static294.aBoolean367) {
				((Class1_Sub3_Sub13_Sub1) Static122.aClass1_Sub3_Sub13_7).method2669(arg0, arg2, arg1.anInt6088, arg1.anInt6128, Static122.aClass1_Sub3_Sub13_7.anInt5571 / 2, Static122.aClass1_Sub3_Sub13_7.anInt5573 / 2, (int) Static62.aFloat16, 256, (Class1_Sub3_Sub13_Sub1) arg1.method4674(false));
			} else {
				((Class1_Sub3_Sub13_Sub2) Static122.aClass1_Sub3_Sub13_7).method4224(arg0, arg2, arg1.anInt6088, arg1.anInt6128, Static122.aClass1_Sub3_Sub13_7.anInt5571 / 2, Static122.aClass1_Sub3_Sub13_7.anInt5573 / 2, (int) Static62.aFloat16, arg1.anIntArray557, arg1.anIntArray554);
			}
		} else if (Static294.aBoolean367) {
			@Pc(92) Class1_Sub3_Sub13 local92 = arg1.method4674(false);
			if (local92 != null) {
				local92.method4204(arg0, arg2);
			}
		} else {
			Static231.method3640(arg0, arg2, arg1.anIntArray557, arg1.anIntArray554);
		}
		Static55.aBooleanArray15[arg3] = true;
	}
}
