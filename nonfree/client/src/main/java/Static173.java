import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public static int anInt3537;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[2][8];

	@OriginalMember(owner = "client!k", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(F)F")
	public static float method3073(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
