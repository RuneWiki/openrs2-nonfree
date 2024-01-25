import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eo", name = "S", descriptor = "Lclient!oh;")
	public static Class237 aClass237_38;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg0) {
			Static57.method1620(arg3, arg6, arg2, arg5, arg1, arg4);
		} else if (arg2 - arg1 >= Static251.anInt9634 && arg1 + arg2 <= Static366.anInt6946 && Static444.anInt8258 <= arg4 - arg0 && arg4 + arg0 <= Static188.anInt4410) {
			Static627.method8457(arg1, arg3, arg5, arg2, arg6, arg0, arg4);
		} else {
			Static357.method3194(arg6, arg0, arg3, arg2, arg5, arg1, arg4);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
	public static void method2901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		@Pc(23) int local23 = -1;
		@Pc(31) int local31 = Static132.method2911(Static251.anInt9634, arg3 + arg2, Static366.anInt6946);
		@Pc(40) int local40 = Static132.method2911(Static251.anInt9634, arg2 - arg3, Static366.anInt6946);
		Static36.method1264(Static632.anIntArrayArray65[arg0], local40, arg1, local31);
		while (local9 > local7) {
			local23 += 2;
			local12 += local23;
			@Pc(72) int local72;
			@Pc(77) int local77;
			@Pc(91) int local91;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local72 = arg0 - local9;
				local77 = arg0 + local9;
				if (local77 >= Static444.anInt8258 && local72 <= Static188.anInt4410) {
					local91 = Static132.method2911(Static251.anInt9634, local7 + arg2, Static366.anInt6946);
					local100 = Static132.method2911(Static251.anInt9634, arg2 - local7, Static366.anInt6946);
					if (Static188.anInt4410 >= local77) {
						Static36.method1264(Static632.anIntArrayArray65[local77], local100, arg1, local91);
					}
					if (Static444.anInt8258 <= local72) {
						Static36.method1264(Static632.anIntArrayArray65[local72], local100, arg1, local91);
					}
				}
			}
			local7++;
			local72 = arg0 - local7;
			local77 = arg0 + local7;
			if (local77 >= Static444.anInt8258 && local72 <= Static188.anInt4410) {
				local91 = Static132.method2911(Static251.anInt9634, local9 + arg2, Static366.anInt6946);
				local100 = Static132.method2911(Static251.anInt9634, arg2 - local9, Static366.anInt6946);
				if (Static188.anInt4410 >= local77) {
					Static36.method1264(Static632.anIntArrayArray65[local77], local100, arg1, local91);
				}
				if (local72 >= Static444.anInt8258) {
					Static36.method1264(Static632.anIntArrayArray65[local72], local100, arg1, local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IZ)V")
	public static void method2902(@OriginalArg(1) boolean arg0) {
		Static209.method4021(Static235.anInt5298, arg0, Static212.anInt4965, Static313.anInt6355);
	}
}
