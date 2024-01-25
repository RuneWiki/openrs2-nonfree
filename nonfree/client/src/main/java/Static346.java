import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
	public static int[] anIntArray638;

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lclient!mo;")
	public static Class143 aClass143_116;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIZIII)V")
	public static void method5896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static6.anInt136 <= arg0 && Static275.anInt5244 >= arg4 && Static32.anInt750 <= arg1 && arg2 <= Static112.anInt2485) {
			Static345.method5874(arg1, arg3, arg0, arg2, arg4);
		} else {
			Static251.method2947(arg2, arg3, arg4, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)V")
	public static void method5897() {
		Static190.aClass11_85.method214();
		Static167.aClass11_125.method214();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIZILclient!jd;IILclient!jd;I)V")
	public static void method5898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Class10_Sub3_Sub3 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) Class10_Sub3_Sub3 arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method5358();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class2 local20 = (Class2) Static47.aClass11_25.method209((long) local7);
		if (local20 == null) {
			@Pc(27) Class207[] local27 = Static368.method5805(Static348.aClass143_98, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static218.aClass46_5.method5157(local27[0]);
			Static47.aClass11_25.method219((long) local7, local20);
		}
		Static273.method4630(arg5.method5353() * 64, arg5.anInt5908, arg0 >> 1, 0, arg5.anInt5910, arg6 >> 1);
		@Pc(76) int local76 = arg4 + Static316.anIntArray309[0] - 18;
		@Pc(84) int local84 = local76 + arg2 / 4 * 18;
		@Pc(94) int local94 = Static316.anIntArray309[1] + arg1 - 16 - 54;
		@Pc(102) int local102 = local94 + arg2 % 4 * 18;
		local20.method2642(local84, local102);
		if (arg5 == arg3) {
			Static218.aClass46_5.method5087(local102 - 1, 18, local84 - 1, -256, 18);
		}
		@Pc(124) Class1_Sub6 local124 = Static114.method2417();
		local124.anInt4110 = local102 + 16;
		local124.anInt4106 = local84;
		local124.anInt4109 = local84 + 16;
		local124.aClass10_Sub3_Sub3_1 = arg3;
		local124.anInt4114 = local102;
		Static98.aClass126_3.method3401(local124);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5900(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			Static164.aClass14_Sub4_Sub2_3.method2557(36);
			Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg0));
			Static164.aClass14_Sub4_Sub2_3.method2527(arg0);
		}
	}
}
