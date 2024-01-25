import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
	public static int anInt6255;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[2][8];

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray11 = new float[2][8];

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(F)F")
	public static float method5070(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
