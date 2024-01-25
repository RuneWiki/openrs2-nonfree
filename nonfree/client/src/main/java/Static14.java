import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "F")
	public static float aFloat32;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	public static int anInt634;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!an", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[2][8];

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(F)F")
	public static float method654(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
