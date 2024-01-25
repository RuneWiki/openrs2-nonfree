import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
	public static int anInt1714;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray5 = new int[2][8];

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(F)F")
	public static float method1460(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
