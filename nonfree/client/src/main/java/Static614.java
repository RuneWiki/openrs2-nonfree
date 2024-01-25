import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	public static int anInt10138;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray55 = new int[2][8];

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray16 = new float[2][8];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(F)F")
	public static float method8710(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
