import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "F")
	public static float aFloat5;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public static int anInt3978;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray37 = new int[2][8];

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(F)F")
	public static float method3146(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
