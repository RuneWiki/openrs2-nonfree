import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
	public static int anInt7029;

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[2][8];

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray34 = new float[2][8];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(F)F")
	public static float method5604(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
