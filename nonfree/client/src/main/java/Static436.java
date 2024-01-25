import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static436 {

	@OriginalMember(owner = "client!qi", name = "od", descriptor = "Lclient!f;")
	public static Class39 aClass39_30;

	@OriginalMember(owner = "client!qi", name = "Xc", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_135 = new Class286(69, 7);

	@OriginalMember(owner = "client!qi", name = "Nd", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_215 = new Class363(78, -1);

	@OriginalMember(owner = "client!qi", name = "Qd", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[4];

	@OriginalMember(owner = "client!qi", name = "Rd", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_216 = new Class363(70, -2);

	@OriginalMember(owner = "client!qi", name = "Sd", descriptor = "I")
	public static int anInt7464 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method6176(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static168.method2918(arg5)) {
			return;
		}
		if (Static348.aClass196ArrayArray2[arg5] == null) {
			Static67.method1089(Static2.aClass196ArrayArray1[arg5], -1, arg2, arg4, arg3, arg8, arg0, arg6, arg1, arg7);
		} else {
			Static67.method1089(Static348.aClass196ArrayArray2[arg5], -1, arg2, arg4, arg3, arg8, arg0, arg6, arg1, arg7);
		}
	}

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "(I)V")
	public static void method6181() {
		Static236.aClass196Array1 = null;
		Static393.method5766(0, Static120.anInt2371, -1, Static140.anInt2937, Static554.anInt9121, 0, 0, 0);
		if (Static236.aClass196Array1 != null) {
			Static44.method728(0, Static120.anInt2371, 0, Static249.anInt4666, Static140.anInt2937, Static453.aClass196_8.anInt5134, Static236.aClass196Array1, Static431.anInt7306, -1412584499);
			Static236.aClass196Array1 = null;
		}
	}
}
