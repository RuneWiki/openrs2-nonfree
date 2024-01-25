import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static int anInt7525;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[2][8];

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[2][8];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(F)F")
	public static float method5912(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
