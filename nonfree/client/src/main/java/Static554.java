import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "F")
	public static float aFloat234;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public static int anInt9230;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[2][8];

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray15 = new float[2][8];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(F)F")
	public static float method7518(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
