import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "I")
	public static int anInt2588;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[2][8];

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	public static void method1714() {
		aFloatArrayArray2 = null;
		anIntArrayArray27 = null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(F)F")
	public static float method1718(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
