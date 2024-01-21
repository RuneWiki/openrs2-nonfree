import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	public static int anInt2575;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray21 = new int[2][8];

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public static void method1724() {
		aFloatArrayArray1 = null;
		anIntArrayArray21 = null;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(F)F")
	public static float method1725(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
