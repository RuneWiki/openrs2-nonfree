import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
	public static int anInt5811;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "F")
	public static float aFloat162;

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray52 = new int[2][8];

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray9 = new float[2][8];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(F)F")
	public static float method4488(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
