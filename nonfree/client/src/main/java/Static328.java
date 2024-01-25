import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "I")
	public static int anInt6344;

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "[[F")
	public static final float[][] aFloatArrayArray7 = new float[2][8];

	@OriginalMember(owner = "client!uq", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray96 = new int[2][8];

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(F)F")
	public static float method5667(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
