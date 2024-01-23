import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	public static int anInt3561;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "F")
	public static float aFloat35;

	@OriginalMember(owner = "client!n", name = "f", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!n", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[2][8];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(F)F")
	public static float method2870(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
