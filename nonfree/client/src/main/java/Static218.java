import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public static int anInt4678;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray60 = new int[2][8];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(F)F")
	public static float method3462(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
