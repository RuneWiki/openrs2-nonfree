import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
	public static int anInt6164;

	@OriginalMember(owner = "client!lia", name = "j", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_112 = new Class126(101, -2);

	@OriginalMember(owner = "client!lia", name = "d", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_87 = new Class376(62, -1);

	@OriginalMember(owner = "client!lia", name = "g", descriptor = "Lclient!im;")
	public static final Class181 aClass181_93 = new Class181("runescape", 0);

	@OriginalMember(owner = "client!lia", name = "h", descriptor = "[J")
	public static final long[] aLongArray13 = new long[32];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(Lclient!wk;Lclient!wk;I)V")
	public static void method5167(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1) {
		if (arg0.aClass3_338 != null) {
			arg0.method8770();
		}
		arg0.aClass3_337 = arg1;
		arg0.aClass3_338 = arg1.aClass3_338;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIBIIII)V")
	public static void method5168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static400.method5735(Static255.anInt4818, arg4, Static658.anInt10079);
		@Pc(22) int local22 = Static400.method5735(Static255.anInt4818, arg2, Static658.anInt10079);
		@Pc(28) int local28 = Static400.method5735(Static303.anInt9951, arg5, Static408.anInt6951);
		@Pc(34) int local34 = Static400.method5735(Static303.anInt9951, arg6, Static408.anInt6951);
		@Pc(42) int local42 = Static400.method5735(Static255.anInt4818, arg3 + arg4, Static658.anInt10079);
		@Pc(50) int local50 = Static400.method5735(Static255.anInt4818, arg2 - arg3, Static658.anInt10079);
		for (@Pc(52) int local52 = local11; local52 < local42; local52++) {
			Static526.method7369(Static299.anIntArrayArray58[local52], local34, local28, arg0);
		}
		for (@Pc(72) int local72 = local22; local72 > local50; local72--) {
			Static526.method7369(Static299.anIntArrayArray58[local72], local34, local28, arg0);
		}
		@Pc(94) int local94 = Static400.method5735(Static303.anInt9951, arg5 + arg3, Static408.anInt6951);
		@Pc(103) int local103 = Static400.method5735(Static303.anInt9951, arg6 - arg3, Static408.anInt6951);
		for (@Pc(105) int local105 = local42; local105 <= local50; local105++) {
			@Pc(111) int[] local111 = Static299.anIntArrayArray58[local105];
			Static526.method7369(local111, local94, local28, arg0);
			Static526.method7369(local111, local103, local94, arg1);
			Static526.method7369(local111, local34, local103, arg0);
		}
	}
}
