import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "Lclient!ak;")
	public static Class7 aClass7_114;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
	public static int anInt2363;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!gn;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString73 = "Loaded interfaces";

	@OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI[B)I")
	public static int method1908(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static110.method1729(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = arg1 - arg5;
		@Pc(22) int local22 = arg2 - arg5;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(32) int local32 = local22 * local22;
		@Pc(36) int local36 = local18 * local18;
		@Pc(40) int local40 = arg1 * arg1;
		@Pc(44) int local44 = local40 << 1;
		@Pc(48) int local48 = local28 << 1;
		@Pc(52) int local52 = local36 << 1;
		@Pc(56) int local56 = local32 << 1;
		@Pc(60) int local60 = arg1 << 1;
		@Pc(64) int local64 = local18 << 1;
		@Pc(72) int local72 = local44 + local28 * (1 - local60);
		@Pc(81) int local81 = local40 - (local60 - 1) * local48;
		@Pc(91) int local91 = (1 - local64) * local32 + local52;
		@Pc(95) int local95 = local28 << 2;
		@Pc(99) int local99 = local40 << 2;
		@Pc(107) int local107 = local36 - (local64 - 1) * local56;
		@Pc(111) int local111 = local32 << 2;
		@Pc(115) int local115 = local36 << 2;
		@Pc(121) int local121 = (local60 - 3) * local48;
		@Pc(125) int local125 = local52 * 3;
		@Pc(129) int local129 = local44 * 3;
		@Pc(135) int local135 = (local64 - 3) * local56;
		@Pc(137) int local137 = local99;
		@Pc(143) int local143 = (arg1 - 1) * local95;
		@Pc(149) int local149 = (local18 - 1) * local111;
		@Pc(151) int local151 = local115;
		@Pc(155) int[] local155 = Static151.anIntArrayArray26[arg4];
		Static288.method4405(arg0, arg3 - local22, -arg2 + arg3, local155);
		Static288.method4405(arg6, arg3 + local22, arg3 + -local22, local155);
		Static288.method4405(arg0, arg3 + arg2, arg3 - -local22, local155);
		while (local24 > 0) {
			if (local72 < 0) {
				while (local72 < 0) {
					local72 += local129;
					local7++;
					local129 += local99;
					local81 += local137;
					local137 += local99;
				}
			}
			if (local81 < 0) {
				local72 += local129;
				local129 += local99;
				local7++;
				local81 += local137;
				local137 += local99;
			}
			local81 += -local121;
			@Pc(268) boolean local268 = local24 <= local18;
			local121 -= local95;
			local24--;
			if (local268) {
				if (local91 < 0) {
					while (local91 < 0) {
						local13++;
						local107 += local151;
						local151 += local115;
						local91 += local125;
						local125 += local115;
					}
				}
				if (local107 < 0) {
					local107 += local151;
					local91 += local125;
					local13++;
					local125 += local115;
					local151 += local115;
				}
				local91 += -local149;
				local107 += -local135;
				local135 -= local111;
				local149 -= local111;
			}
			@Pc(350) int local350 = arg4 + local24;
			local72 += -local143;
			local143 -= local95;
			@Pc(364) int local364 = arg3 - local7;
			@Pc(368) int local368 = local7 + arg3;
			@Pc(373) int local373 = arg4 - local24;
			if (local268) {
				@Pc(379) int local379 = arg3 - local13;
				@Pc(383) int local383 = local13 + arg3;
				Static288.method4405(arg0, local379, local364, Static151.anIntArrayArray26[local373]);
				Static288.method4405(arg6, local383, local379, Static151.anIntArrayArray26[local373]);
				Static288.method4405(arg0, local368, local383, Static151.anIntArrayArray26[local373]);
				Static288.method4405(arg0, local379, local364, Static151.anIntArrayArray26[local350]);
				Static288.method4405(arg6, local383, local379, Static151.anIntArrayArray26[local350]);
				Static288.method4405(arg0, local368, local383, Static151.anIntArrayArray26[local350]);
			} else {
				Static288.method4405(arg0, local368, local364, Static151.anIntArrayArray26[local373]);
				Static288.method4405(arg0, local368, local364, Static151.anIntArrayArray26[local350]);
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public static void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 8) {
			arg0 = 4;
		}
		if (arg0 == 4 && !Static160.aBoolean223) {
			arg0 = 2;
			arg1 = 2;
		}
		if (Static68.anInt4744 != arg0) {
			if (Static292.aBoolean438) {
				return;
			}
			if (Static68.anInt4744 != 0) {
				Static267.anInterface1Array1[Static68.anInt4744].method4328();
			}
			if (arg0 != 0) {
				@Pc(71) Interface1 local71 = Static267.anInterface1Array1[arg0];
				local71.method4327();
				local71.method4329(arg1);
			}
			Static68.anInt4744 = arg0;
			Static44.anInt990 = arg1;
		} else if (arg0 != 0 && arg1 != Static44.anInt990) {
			Static267.anInterface1Array1[arg0].method4329(arg1);
			Static44.anInt990 = arg1;
		}
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
	public static void method1911() {
		Static102.aClass31_17.method850();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(III)V")
	public static void method1912(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static152.aFloat81 = arg0;
		if (Static109.anInt2057 == 2) {
			Static56.anInt1177 = arg1;
			Static77.anInt1548 = arg0;
		}
		Static177.aFloat97 = arg1;
		Static62.method1041();
		Static45.aBoolean87 = true;
	}
}
