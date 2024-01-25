import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!lja", name = "d", descriptor = "I")
	public static int anInt6175;

	@OriginalMember(owner = "client!lja", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[2][8];

	@OriginalMember(owner = "client!lja", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[2][8];

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(F)F")
	public static float method5188(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
