import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ow", name = "d", descriptor = "I")
	public static int anInt7768 = 500;

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method6654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14;
		if (Static80.method2326(arg1)) {
			local14 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = 0;
			if (Static487.aBoolean676) {
				local14 = Static72.anInt1758;
				local42 = Static458.anInt8431;
				local38 = Static72.anInt1756;
				local36 = Static527.anInt10839;
				local40 = Static138.anInt3391;
				Static458.anInt8431 = 1;
			}
			if (Static410.aClass24ArrayArray1[arg1] == null) {
				Static264.method4888(arg7, arg0, arg3 < 0, arg4, arg2, arg3, arg5, Static631.aClass24ArrayArray2[arg1], -1, arg6);
			} else {
				Static264.method4888(arg7, arg0, arg3 < 0, arg4, arg2, arg3, arg5, Static410.aClass24ArrayArray1[arg1], -1, arg6);
			}
			if (Static487.aBoolean676) {
				if (arg3 >= 0 && Static458.anInt8431 == 2) {
					Static113.method2842(Static72.anInt1758, Static72.anInt1756, Static527.anInt10839, Static138.anInt3391);
				}
				Static458.anInt8431 = local42;
				Static72.anInt1756 = local38;
				Static527.anInt10839 = local36;
				Static138.anInt3391 = local40;
				Static72.anInt1758 = local14;
			}
		} else if (arg3 == -1) {
			for (local14 = 0; local14 < 100; local14++) {
				Static403.aBooleanArray18[local14] = true;
			}
		} else {
			Static403.aBooleanArray18[arg3] = true;
		}
	}
}
