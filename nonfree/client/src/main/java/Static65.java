import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt1857;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray20 = new int[2][8];

	@OriginalMember(owner = "client!le", name = "c", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public static void method1266() {
		aFloatArrayArray2 = null;
		anIntArrayArray20 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(F)F")
	public static float method1267(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
