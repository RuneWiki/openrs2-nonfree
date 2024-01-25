import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static554 {

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!tr", name = "E", descriptor = "Lclient!bg;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
	public static int anInt9637 = 0;

	@OriginalMember(owner = "client!tr", name = "H", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_105 = new Class257(33, 8);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII)V")
	public static void method7788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static442.anIntArrayArray43 != null) {
			Static442.anIntArrayArray43[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static431.aShortArrayArray10 != null) {
			Static431.aShortArrayArray10[arg0][arg1] = (short) arg3;
		}
		if (Static117.aByteArrayArray48 != null) {
			Static117.aByteArrayArray48[arg0][arg1] = (byte) arg4;
		}
	}
}
