import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
	public static int anInt1099;

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "[[F")
	public static float[][] aFloatArrayArray2 = new float[2][8];

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[2][8];

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(F)F")
	public static float method897(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
	public static void method898() {
		aFloatArrayArray2 = null;
		anIntArrayArray14 = null;
	}
}
