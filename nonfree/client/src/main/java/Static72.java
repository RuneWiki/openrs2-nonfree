import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!od", name = "h", descriptor = "I")
	public static int anInt1842;

	@OriginalMember(owner = "client!od", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[2][8];

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(F)F")
	public static float method1025(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public static void method1026() {
		aFloatArrayArray1 = null;
		anIntArrayArray14 = null;
	}
}
