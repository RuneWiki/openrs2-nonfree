import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
	public static int anInt2579;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(F)F")
	public static float method1928(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
