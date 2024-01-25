import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static575 {

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
	public static int anInt9701;

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "F")
	public static float aFloat267;

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray14 = new float[2][8];

	@OriginalMember(owner = "client!uia", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray98 = new int[2][8];

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(F)F")
	public static float method8011(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
