import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "F")
	public static float aFloat203;

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "I")
	public static int anInt10089;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray62 = new int[2][8];

	@OriginalMember(owner = "client!wba", name = "g", descriptor = "[[F")
	public static final float[][] aFloatArrayArray18 = new float[2][8];

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(F)F")
	public static float method8562(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
