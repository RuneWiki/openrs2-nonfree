import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	public static int anInt2046;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray5 = new float[2][8];

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(F)F")
	public static float method1656(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
