import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	public static int anInt3255;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[2][8];

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[2][8];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(F)F")
	public static float method2658(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
