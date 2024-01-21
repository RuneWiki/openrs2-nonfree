import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
	public static int anInt3518;

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[2][8];

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(F)F")
	public static float method2672(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
