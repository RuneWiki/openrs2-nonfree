import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public static int anInt4248;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[2][8];

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[2][8];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(F)F")
	public static float method3821(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
