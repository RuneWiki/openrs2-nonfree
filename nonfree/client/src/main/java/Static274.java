import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "I")
	public static int anInt4207;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "Lclient!gw;")
	public static final Class147 aClass147_4 = new Class147();

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_75 = new Class397(30, 1);

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "([F[III[FII[IIIIII)V")
	public static void method3860(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(31) int local31 = arg5 * arg8 + arg9;
		@Pc(37) int local37 = arg6 + arg2 * arg3;
		@Pc(42) int local42 = arg5 - arg11;
		@Pc(47) int local47 = arg3 - arg11;
		@Pc(51) int local51;
		@Pc(58) int local58;
		if (arg1 == null) {
			for (local51 = 0; local51 < arg10; local51++) {
				local58 = local31 + arg11;
				while (local31 < local58) {
					arg4[local37++] = arg0[local31++];
				}
				local37 += local47;
				local31 += local42;
			}
		} else if (arg0 == null) {
			for (local51 = 0; local51 < arg10; local51++) {
				local58 = local31 + arg11;
				while (local58 > local31) {
					arg7[local37++] = arg1[local31++];
				}
				local31 += local42;
				local37 += local47;
			}
		} else {
			for (local51 = 0; local51 < arg10; local51++) {
				local58 = local31 + arg11;
				while (local58 > local31) {
					arg7[local37] = arg1[local31];
					arg4[local37++] = arg0[local31++];
				}
				local37 += local47;
				local31 += local42;
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IZ)V")
	public static void method3861() {
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub15_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub15_2);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub21_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub21_2);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub5_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub8_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub22_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub1_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub9_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub7_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub30_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub27_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub2_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub25_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub6_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub6_2);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub26_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub23_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub19_1);
		Static580.aClass3_Sub22_24.method2423(0, Static580.aClass3_Sub22_24.aClass21_Sub14_1);
		Static108.method2127();
		Static580.aClass3_Sub22_24.method2423(2, Static580.aClass3_Sub22_24.aClass21_Sub11_1);
		Static580.aClass3_Sub22_24.method2423(1, Static580.aClass3_Sub22_24.aClass21_Sub13_1);
		Static585.method7560();
		Static509.method6646();
		Static477.aBoolean507 = true;
	}
}
