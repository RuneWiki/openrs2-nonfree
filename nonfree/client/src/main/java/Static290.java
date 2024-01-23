import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
	public static int anInt5503;

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray44 = new int[2][8];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(F)F")
	public static float method4361(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
