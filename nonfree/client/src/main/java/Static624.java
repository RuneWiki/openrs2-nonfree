import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static624 {

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
	public static int anInt10173;

	@OriginalMember(owner = "client!vw", name = "h", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray17 = new float[2][8];

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray111 = new int[2][8];

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(F)F")
	public static float method8656(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
