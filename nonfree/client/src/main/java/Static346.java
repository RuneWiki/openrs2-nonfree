import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public static int anInt5846;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[2][8];

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray50 = new int[2][8];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(F)F")
	public static float method5024(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
