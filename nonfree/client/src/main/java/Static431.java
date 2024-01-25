import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static431 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array17;

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
	public static int anInt7512;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "[F")
	public static final float[] aFloatArray79 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "Lclient!gp;")
	public static Class133 aClass133_11 = null;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method6566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 >= Static474.anInt8118 && arg3 <= Static576.anInt9425 && Static474.anInt8118 <= arg6 && arg6 <= Static576.anInt9425 && arg4 >= Static474.anInt8118 && Static576.anInt9425 >= arg4 && arg8 >= Static474.anInt8118 && arg8 <= Static576.anInt9425 && arg5 >= Static298.anInt5919 && Static596.anInt9703 >= arg5 && arg0 >= Static298.anInt5919 && arg0 <= Static596.anInt9703 && arg1 >= Static298.anInt5919 && arg1 <= Static596.anInt9703 && Static298.anInt5919 <= arg2 && arg2 <= Static596.anInt9703) {
			Static256.method4298(arg1, arg6, arg0, arg7, arg5, arg8, arg4, arg3, arg2);
		} else {
			Static568.method7088(arg3, arg6, arg4, arg1, arg0, arg7, arg5, arg8, arg2);
		}
	}
}
