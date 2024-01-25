import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public static int anInt4900;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[2][8];

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray6 = new float[2][8];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(F)F")
	public static float method4225(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
