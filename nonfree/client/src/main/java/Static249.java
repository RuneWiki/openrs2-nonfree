import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!hka", name = "c", descriptor = "I")
	public static int anInt3895;

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[2][8];

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[2][8];

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(F)F")
	public static float method3515(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
