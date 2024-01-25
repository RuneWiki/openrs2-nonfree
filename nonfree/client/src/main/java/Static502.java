import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "Z")
	public static boolean aBoolean614 = false;

	@OriginalMember(owner = "client!rq", name = "F", descriptor = "I")
	public static int anInt8458 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(19) int local19;
		if (Static64.method1061(arg4)) {
			local19 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = 0;
			if (Static80.aBoolean118) {
				local38 = Static279.anInt5374;
				local36 = Static374.anInt6010;
				local19 = Static220.anInt4532;
				local42 = Static630.anInt10046;
				local40 = Static579.anInt9459;
				Static630.anInt10046 = 1;
			}
			if (Static69.aClass344ArrayArray1[arg4] == null) {
				Static169.method2819(arg5, arg0, arg1, arg2, arg7, arg6, arg1 < 0, -1, Static319.aClass344ArrayArray2[arg4], arg3);
			} else {
				Static169.method2819(arg5, arg0, arg1, arg2, arg7, arg6, arg1 < 0, -1, Static69.aClass344ArrayArray1[arg4], arg3);
			}
			if (Static80.aBoolean118) {
				if (arg1 >= 0 && Static630.anInt10046 == 2) {
					Static304.method7235(Static279.anInt5374, Static579.anInt9459, Static220.anInt4532, Static374.anInt6010);
				}
				Static630.anInt10046 = local42;
				Static579.anInt9459 = local40;
				Static220.anInt4532 = local19;
				Static279.anInt5374 = local38;
				Static374.anInt6010 = local36;
			}
		} else if (arg1 == -1) {
			for (local19 = 0; local19 < 100; local19++) {
				Static110.aBooleanArray5[local19] = true;
			}
		} else {
			Static110.aBooleanArray5[arg1] = true;
		}
	}
}
