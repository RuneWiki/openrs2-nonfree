import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt567;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[2][8];

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray7 = new float[2][8];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(F)F")
	public static float method533(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
