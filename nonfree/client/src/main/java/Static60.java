import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "I")
	public static int anInt1247;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "[[F")
	public static final float[][] aFloatArrayArray4 = new float[2][8];

	@OriginalMember(owner = "client!de", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray11 = new int[2][8];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(F)F")
	public static float method1072(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
