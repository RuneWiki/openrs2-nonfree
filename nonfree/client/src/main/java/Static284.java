import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "I")
	public static int anInt5497;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[2][8];

	@OriginalMember(owner = "client!si", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray56 = new int[2][8];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(F)F")
	public static float method4880(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
