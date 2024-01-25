import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lka", name = "d", descriptor = "I")
	public static int anInt5966;

	@OriginalMember(owner = "client!lka", name = "c", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!lka", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray11 = new float[2][8];

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[2][8];

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(F)F")
	public static float method5374(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
