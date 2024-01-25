import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!io", name = "g", descriptor = "I")
	public static int anInt2910;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!io", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray89 = new int[2][8];

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(F)F")
	public static float method2773(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
