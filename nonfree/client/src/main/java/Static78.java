import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "F")
	public static float aFloat12;

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
	public static int anInt1507;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray17 = new int[2][8];

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "()V")
	public static void method1209() {
		aFloatArrayArray1 = null;
		anIntArrayArray17 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(F)F")
	public static float method1214(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
