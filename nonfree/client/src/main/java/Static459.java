import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
	public static int anInt8403 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!naa;BI)V")
	public static void method6943(@OriginalArg(0) Class216 arg0, @OriginalArg(2) int arg1) {
		if (Static147.aBoolean272) {
			arg1 = 0;
			Static147.aBoolean272 = false;
		}
		if (Static323.aClass216_1 != null && Static323.aClass216_1.method5606(arg0)) {
			return;
		}
		Static323.aClass216_1 = arg0;
		Static37.aLong31 = Static342.method5463();
		Static211.anInt4955 = arg1;
		Static523.anInt9088 = arg1;
		if (Static523.anInt9088 != 0) {
			Static575.anInt9880 = Static540.anInt9398;
			Static165.anInt4065 = Static237.anInt5337;
			Static394.aFloat173 = Static564.aFloat190;
			Static616.aFloat197 = Static227.aFloat100;
			Static622.aFloat198 = Static623.aFloat127;
			Static300.aFloat111 = Static119.aFloat75;
			Static2.aFloat99 = Static278.aFloat109;
			Static254.anInt4211 = Static382.anInt7435;
			Static596.aFloat195 = Static111.aFloat62;
			Static220.aClass40_1 = Static291.aClass40_2;
			return;
		}
		Static51.method1419();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIII)V")
	public static void method6944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15 = Static132.method2911(Static444.anInt8258, arg3, Static188.anInt4410);
		@Pc(21) int local21 = Static132.method2911(Static444.anInt8258, arg5, Static188.anInt4410);
		@Pc(27) int local27 = Static132.method2911(Static251.anInt9634, arg4, Static366.anInt6946);
		@Pc(33) int local33 = Static132.method2911(Static251.anInt9634, arg0, Static366.anInt6946);
		@Pc(41) int local41 = Static132.method2911(Static444.anInt8258, arg2 + arg3, Static188.anInt4410);
		@Pc(50) int local50 = Static132.method2911(Static444.anInt8258, arg5 - arg2, Static188.anInt4410);
		for (@Pc(52) int local52 = local15; local52 < local41; local52++) {
			Static36.method1264(Static632.anIntArrayArray65[local52], local27, arg1, local33);
		}
		for (@Pc(72) int local72 = local21; local72 > local50; local72--) {
			Static36.method1264(Static632.anIntArrayArray65[local72], local27, arg1, local33);
		}
		@Pc(94) int local94 = Static132.method2911(Static251.anInt9634, arg2 + arg4, Static366.anInt6946);
		@Pc(103) int local103 = Static132.method2911(Static251.anInt9634, arg0 - arg2, Static366.anInt6946);
		for (@Pc(105) int local105 = local41; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static632.anIntArrayArray65[local105];
			Static36.method1264(local111, local27, arg1, local94);
			Static36.method1264(local111, local103, arg1, local33);
		}
	}
}
