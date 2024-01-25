import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
	public static int anInt6249;

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "F")
	public static float aFloat76;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[2][8];

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[[F")
	public static final float[][] aFloatArrayArray7 = new float[2][8];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(F)F")
	public static float method5303(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
