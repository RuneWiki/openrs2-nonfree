import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "Lclient!tf;")
	public static Class322 aClass322_101;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_38 = new Class6(4);

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	public static int anInt5531 = -1;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray124 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt5532 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg2 < 1 || arg6 > Static54.anInt1038 - 2 || arg2 > Static140.anInt3026 - 2) {
			return;
		}
		@Pc(29) int local29 = arg3;
		if (arg3 < 3 && Static511.method6886(arg2, arg6)) {
			local29 = arg3 + 1;
		}
		if (!Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312) && !Static161.method2957(arg6, local29, Static364.anInt645, arg2)) {
			return;
		}
		if (Static309.aClass299ArrayArrayArray3 == null) {
			return;
		}
		Static25.aClass26_Sub1_1.method7121(arg6, Static460.aClass169Array3[arg3], arg0, Static505.aClass45_11, arg3, arg2);
		if (arg5 >= 0) {
			@Pc(73) boolean local73 = Static405.aClass3_Sub3_Sub1_1.aBoolean591;
			Static405.aClass3_Sub3_Sub1_1.aBoolean591 = true;
			Static25.aClass26_Sub1_1.method7119(arg5, local29, arg7, arg4, arg1, Static505.aClass45_11, arg6, arg3, Static460.aClass169Array3[arg3], arg2);
			Static405.aClass3_Sub3_Sub1_1.aBoolean591 = local73;
		}
	}
}
