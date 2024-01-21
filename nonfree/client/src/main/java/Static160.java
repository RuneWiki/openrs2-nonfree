import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
	public static int anInt3390;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[2][8];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(F)F")
	public static float method2359(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
