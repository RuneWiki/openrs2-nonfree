import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
	public static int anInt9791;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method8166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) int local20;
		if (Static107.method2043(arg1)) {
			local20 = 0;
			@Pc(35) int local35 = 0;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			if (Static66.aBoolean570) {
				local35 = Static30.anInt407;
				local41 = Static73.anInt1061;
				local43 = Static642.anInt10417;
				local20 = Static122.anInt9901;
				local45 = Static359.anInt6497;
				Static359.anInt6497 = 1;
			}
			if (Static212.aClass345ArrayArray1[arg1] == null) {
				Static416.method6170(arg3, arg4, arg2, arg6, -1, Static648.aClass345ArrayArray2[arg1], arg7, arg0, arg4 < 0, arg5);
			} else {
				Static416.method6170(arg3, arg4, arg2, arg6, -1, Static212.aClass345ArrayArray1[arg1], arg7, arg0, arg4 < 0, arg5);
			}
			if (Static66.aBoolean570) {
				if (arg4 >= 0 && Static359.anInt6497 == 2) {
					Static520.method7366(Static122.anInt9901, Static642.anInt10417, Static30.anInt407, Static73.anInt1061);
				}
				Static73.anInt1061 = local41;
				Static122.anInt9901 = local20;
				Static30.anInt407 = local35;
				Static642.anInt10417 = local43;
				Static359.anInt6497 = local45;
			}
		} else if (arg4 == -1) {
			for (local20 = 0; local20 < 100; local20++) {
				Static57.aBooleanArray2[local20] = true;
			}
		} else {
			Static57.aBooleanArray2[arg4] = true;
		}
	}
}
