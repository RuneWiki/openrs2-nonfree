import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
	public static int anInt2624;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray68 = new int[2][8];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public static void method1808() {
		aFloatArrayArray1 = null;
		anIntArrayArray68 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(F)F")
	public static float method1813(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
