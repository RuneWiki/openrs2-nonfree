import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Lclient!hh;")
	private static Class50 aClass50_517 = Static186.method3527("Prepared sound engine");

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[Lclient!nk;")
	public static Class20_Sub3_Sub2[] aClass20_Sub3_Sub2Array1 = new Class20_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt1572 = 0;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!hh;")
	public static Class50 aClass50_518 = aClass50_517;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	public static void method1125() {
		Static27.aClass84_11.method2585();
		Static125.aClass84_23.method2585();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIII)I")
	public static int method1129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(11) int local11 = arg2 / arg1;
		@Pc(17) int local17 = arg1 - 1 & arg0;
		@Pc(22) int local22 = Static125.method2004(local7, local11);
		@Pc(36) int local36 = Static125.method2004(local7 + 1, local11);
		@Pc(42) int local42 = arg1 - 1 & arg2;
		@Pc(49) int local49 = Static125.method2004(local7, local11 + 1);
		@Pc(58) int local58 = Static125.method2004(local7 + 1, local11 - -1);
		@Pc(65) int local65 = Static5.method78(local22, local17, arg1, local36);
		@Pc(72) int local72 = Static5.method78(local49, local17, arg1, local58);
		return Static5.method78(local65, local42, arg1, local72);
	}
}
