import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
	public static int anInt6738;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray14 = new float[2][8];

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[2][8];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(F)F")
	public static float method5793(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
