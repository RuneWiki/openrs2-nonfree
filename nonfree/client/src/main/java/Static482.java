import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "F")
	public static float aFloat210;

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
	public static int anInt8265;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray74 = new int[2][8];

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray13 = new float[2][8];

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(F)F")
	public static float method6938(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
