import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt1029;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[2][8];

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "[[F")
	public static float[][] aFloatArrayArray1 = new float[2][8];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
	public static void method720() {
		aFloatArrayArray1 = null;
		anIntArrayArray8 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(F)F")
	public static float method724(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
