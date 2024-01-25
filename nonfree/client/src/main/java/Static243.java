import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!iv", name = "h", descriptor = "[Lclient!ov;")
	public static Class4_Sub2[] aClass4_Sub2Array2;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "[J")
	public static long[] aLongArray3;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public static final int anInt4465 = -1;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	public static void method4021() {
		@Pc(28) Class5_Sub48 local28 = Static16.method232(Static228.aClass46_50, Static276.aClass251_2);
		local28.aClass5_Sub22_Sub1_2.method5905(Static138.method2022());
		local28.aClass5_Sub22_Sub1_2.method5918(Static345.anInt5827);
		local28.aClass5_Sub22_Sub1_2.method5918(Static408.anInt7118);
		local28.aClass5_Sub22_Sub1_2.method5905(Static97.aClass5_Sub25_8.aClass6_Sub23_2.method7627());
		Static277.method4436(local28);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static633.method8959(arg8)) {
			return;
		}
		if (Static321.aClass295ArrayArray1[arg8] == null) {
			Static75.method1293(Static519.aClass295ArrayArray2[arg8], -1, arg6, arg10, arg7, arg5, arg9, arg4, arg3, arg0, arg2, arg1);
		} else {
			Static75.method1293(Static321.aClass295ArrayArray1[arg8], -1, arg6, arg10, arg7, arg5, arg9, arg4, arg3, arg0, arg2, arg1);
		}
	}
}
