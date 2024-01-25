import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "F")
	public static float aFloat196;

	@OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
	public static int anInt10198;

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray22 = new float[2][8];

	@OriginalMember(owner = "client!vfa", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray63 = new int[2][8];

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(F)F")
	public static float method8237(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
