import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
	public static int anInt7333;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray18 = new float[2][8];

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[2][8];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(F)F")
	public static float method6395(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
