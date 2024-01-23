import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt4568;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[2][8];

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(F)F")
	public static float method3555(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
