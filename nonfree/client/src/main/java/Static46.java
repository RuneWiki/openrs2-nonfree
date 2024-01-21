import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt1447;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray15 = new int[2][8];

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(F)F")
	public static float method1024(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()V")
	public static void method1028() {
		aFloatArrayArray2 = null;
		anIntArrayArray15 = null;
	}
}
