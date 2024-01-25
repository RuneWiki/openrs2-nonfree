import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
	public static int anInt3607;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[2][8];

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "[[F")
	public static final float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(F)F")
	public static float method2862(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
