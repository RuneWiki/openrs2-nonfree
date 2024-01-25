import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
	public static int anInt5016;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[2][8];

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray8 = new float[2][8];

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(F)F")
	public static float method4356(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
