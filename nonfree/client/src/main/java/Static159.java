import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
	public static int anInt3401 = 0;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ep;Lclient!ep;)V")
	public static void method3022(@OriginalArg(1) Class93 arg0, @OriginalArg(2) Class93 arg1) {
		Static298.method4854(Static92.aClass181_104);
		Static547.aClass6_Sub26_Sub2_2.method4979(arg1.anInt2790);
		Static547.aClass6_Sub26_Sub2_2.method4962(arg1.anInt2822);
		Static547.aClass6_Sub26_Sub2_2.method4991(arg1.anInt2806);
		Static547.aClass6_Sub26_Sub2_2.method4965(arg0.anInt2806);
		Static547.aClass6_Sub26_Sub2_2.method4948(arg0.anInt2790);
		Static547.aClass6_Sub26_Sub2_2.method4946(arg0.anInt2822);
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)Z")
	public static boolean method3023(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method3024(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static518.anInt9045 = arg2;
		Static49.anInt1353 = 2;
		Static482.method7331(arg1, false, arg0);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(III)Z")
	public static boolean method3025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3026(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg3 - arg5;
		@Pc(21) int local21 = arg1 - arg5;
		@Pc(25) int local25 = arg3 * arg3;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(49) int local49 = local21 * local21;
		@Pc(53) int local53 = local29 << 1;
		@Pc(57) int local57 = local25 << 1;
		@Pc(61) int local61 = local49 << 1;
		@Pc(65) int local65 = local33 << 1;
		@Pc(69) int local69 = arg1 << 1;
		@Pc(73) int local73 = local21 << 1;
		@Pc(81) int local81 = (1 - local69) * local25 + local53;
		@Pc(90) int local90 = local29 - (local69 - 1) * local57;
		@Pc(100) int local100 = (1 - local73) * local33 + local61;
		@Pc(109) int local109 = local49 - local65 * (local73 - 1);
		@Pc(113) int local113 = local25 << 2;
		@Pc(117) int local117 = local29 << 2;
		@Pc(121) int local121 = local33 << 2;
		@Pc(125) int local125 = local49 << 2;
		@Pc(129) int local129 = local53 * 3;
		@Pc(135) int local135 = (local69 - 3) * local57;
		@Pc(139) int local139 = local61 * 3;
		@Pc(145) int local145 = (local73 - 3) * local65;
		@Pc(147) int local147 = local117;
		@Pc(153) int local153 = local113 * (arg1 - 1);
		@Pc(155) int local155 = local125;
		@Pc(181) int local181;
		@Pc(189) int local189;
		@Pc(197) int local197;
		@Pc(205) int local205;
		if (Static96.anInt2302 <= arg4 && arg4 <= Static289.anInt5545) {
			@Pc(173) int[] local173 = Static183.anIntArrayArray26[arg4];
			local181 = Static501.method4264(arg0 - arg3, Class179_Sub2.lb, Static376.anInt7071);
			local189 = Static501.method4264(arg3 + arg0, Class179_Sub2.lb, Static376.anInt7071);
			local197 = Static501.method4264(arg0 - local16, Class179_Sub2.lb, Static376.anInt7071);
			local205 = Static501.method4264(arg0 + local16, Class179_Sub2.lb, Static376.anInt7071);
			Static115.method2332(local181, local197, arg2, local173);
			Static115.method2332(local197, local205, arg6, local173);
			Static115.method2332(local205, local189, arg2, local173);
		}
		@Pc(231) int local231 = local121 * (local21 - 1);
		while (local9 > 0) {
			@Pc(240) boolean local240 = local21 >= local9;
			if (local81 < 0) {
				while (local81 < 0) {
					local90 += local147;
					local81 += local129;
					local7++;
					local129 += local117;
					local147 += local117;
				}
			}
			if (local240) {
				if (local100 < 0) {
					while (local100 < 0) {
						local109 += local155;
						local100 += local139;
						local155 += local125;
						local11++;
						local139 += local125;
					}
				}
				if (local109 < 0) {
					local109 += local155;
					local100 += local139;
					local155 += local125;
					local139 += local125;
					local11++;
				}
				local100 += -local231;
				local109 += -local145;
				local231 -= local121;
				local145 -= local121;
			}
			if (local90 < 0) {
				local90 += local147;
				local81 += local129;
				local7++;
				local129 += local117;
				local147 += local117;
			}
			local81 += -local153;
			local90 += -local135;
			local135 -= local113;
			local9--;
			local153 -= local113;
			local181 = arg4 - local9;
			local189 = arg4 + local9;
			if (Static96.anInt2302 <= local189 && Static289.anInt5545 >= local181) {
				local197 = Static501.method4264(arg0 + local7, Class179_Sub2.lb, Static376.anInt7071);
				local205 = Static501.method4264(arg0 - local7, Class179_Sub2.lb, Static376.anInt7071);
				if (local240) {
					@Pc(447) int local447 = Static501.method4264(local11 + arg0, Class179_Sub2.lb, Static376.anInt7071);
					@Pc(456) int local456 = Static501.method4264(arg0 - local11, Class179_Sub2.lb, Static376.anInt7071);
					@Pc(467) int[] local467;
					if (Static96.anInt2302 <= local181) {
						local467 = Static183.anIntArrayArray26[local181];
						Static115.method2332(local205, local456, arg2, local467);
						Static115.method2332(local456, local447, arg6, local467);
						Static115.method2332(local447, local197, arg2, local467);
					}
					if (Static289.anInt5545 >= local189) {
						local467 = Static183.anIntArrayArray26[local189];
						Static115.method2332(local205, local456, arg2, local467);
						Static115.method2332(local456, local447, arg6, local467);
						Static115.method2332(local447, local197, arg2, local467);
					}
				} else {
					if (Static96.anInt2302 <= local181) {
						Static115.method2332(local205, local197, arg2, Static183.anIntArrayArray26[local181]);
					}
					if (local189 <= Static289.anInt5545) {
						Static115.method2332(local205, local197, arg2, Static183.anIntArrayArray26[local189]);
					}
				}
			}
		}
	}
}
