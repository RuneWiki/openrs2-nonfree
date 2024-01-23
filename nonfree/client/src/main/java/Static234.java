import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	public static int anInt5004;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray45 = new int[2][8];

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(F)F")
	public static float method3751(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
