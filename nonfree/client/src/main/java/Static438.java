import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	public static int anInt7198;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[2][8];

	@OriginalMember(owner = "client!wh", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[2][8];

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(F)F")
	public static float method5903(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
