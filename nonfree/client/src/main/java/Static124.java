import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
	public static final int[] anIntArray181 = new int[2048];

	@OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
	public static final int anInt2132 = 1405;

	@OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
	public static int anInt2133 = 1;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "([[BILclient!op;)V")
	public static void method1930(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class238_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt6912; local7++) {
			Static262.method3999();
			for (@Pc(13) int local13 = 0; local13 < Static18.anInt5706 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static80.anInt1367 >> 3; local17++) {
					@Pc(27) int local27 = Static245.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(36) int local36 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean476 || local36 == 0) {
							@Pc(50) int local50 = local27 >> 1 & 0x3;
							@Pc(56) int local56 = local27 >> 14 & 0x3FF;
							@Pc(62) int local62 = local27 >> 3 & 0x7FF;
							@Pc(72) int local72 = local62 / 8 + (local56 / 8 << 8);
							for (@Pc(74) int local74 = 0; local74 < Static468.anIntArray577.length; local74++) {
								if (Static468.anIntArray577[local74] == local72 && arg0[local74] != null) {
									arg1.method5554(local17 * 8, Static554.aClass90_12, Static30.aClass138Array1, (local62 & 0x7) * 8, local36, local7, arg0[local74], (local56 & 0x7) * 8, local13 * 8, local50);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
