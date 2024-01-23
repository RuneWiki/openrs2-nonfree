import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!ui", name = "J", descriptor = "[S")
	public static short[] aShortArray84;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "F")
	public static float aFloat49 = 0.0F;

	@OriginalMember(owner = "client!ui", name = "M", descriptor = "J")
	public static long aLong178 = 0L;

	@OriginalMember(owner = "client!ui", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray42 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!ui", name = "T", descriptor = "[F")
	public static float[] aFloatArray30 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZIII)V")
	public static void method4034(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 * Static52.anInt1043 >> 8;
		if (local9 != 0 && arg0 != -1) {
			Static119.method2037(local9, Static28.aClass98_17, arg0);
			Static190.aBoolean244 = true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "(I)V")
	public static void method4036() {
		aFloatArray30 = null;
		anIntArrayArray42 = null;
		aShortArray84 = null;
	}
}
