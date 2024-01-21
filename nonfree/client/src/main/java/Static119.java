import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
	public static int anInt2809;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray47 = new int[2][8];

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "()V")
	public static void method1881() {
		aFloatArrayArray2 = null;
		anIntArrayArray47 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(F)F")
	public static float method1885(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
