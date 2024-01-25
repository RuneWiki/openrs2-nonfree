import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt7473;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray14 = new float[2][8];

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray42 = new int[2][8];

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(F)F")
	public static float method6461(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
