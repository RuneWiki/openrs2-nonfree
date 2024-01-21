import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	public static int anInt1897;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray16 = new int[2][8];

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	public static void method1254() {
		aFloatArrayArray1 = null;
		anIntArrayArray16 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(F)F")
	public static float method1258(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
