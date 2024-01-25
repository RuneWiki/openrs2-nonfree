import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public static int anInt6754;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "F")
	public static float aFloat83;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[2][8];

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[2][8];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(F)F")
	public static float method5358(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
