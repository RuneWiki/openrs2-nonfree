import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public static int anInt414;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[2][8];

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(F)F")
	public static float method332(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
