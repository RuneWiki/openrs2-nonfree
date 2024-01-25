import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	public static int anInt76;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[2][8];

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(F)F")
	public static float method70(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
