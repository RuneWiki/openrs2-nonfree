import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!je", name = "e", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "I")
	public static int anInt3154;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[2][8];

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[2][8];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(F)F")
	public static float method2933(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
