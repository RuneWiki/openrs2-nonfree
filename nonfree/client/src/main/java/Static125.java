import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	public static int anInt2573;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "Lclient!s;")
	public static final Class217 aClass217_57 = new Class217(6, 5);

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
	public static void method2189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass24_Sub1_2 != null) {
			local7.aClass24_Sub1_2 = null;
		}
		if (local7.aClass24_Sub1_1 != null) {
			local7.aClass24_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BLclient!sf;)I")
	public static int method2191(@OriginalArg(1) Class24_Sub3_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt6301;
		@Pc(12) Class6 local12 = arg0.method4923();
		if (arg0.aBoolean403) {
			local8 = arg0.anInt6295;
		} else if (local12.anInt77 == arg0.anInt6238 || arg0.anInt6238 == local12.anInt65 || local12.anInt41 == arg0.anInt6238 || local12.anInt70 == arg0.anInt6238) {
			local8 = arg0.anInt6307;
		} else if (arg0.anInt6238 == local12.anInt74 || arg0.anInt6238 == local12.anInt54 || local12.anInt58 == arg0.anInt6238 || local12.anInt38 == arg0.anInt6238) {
			local8 = arg0.anInt6296;
		}
		return local8;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = arg1;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = arg4 - arg5;
		@Pc(26) int local26 = arg1 - arg5;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(34) int local34 = arg1 * arg1;
		@Pc(38) int local38 = local22 * local22;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg1 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(75) int local75 = local30 * (1 - local62) + local46;
		@Pc(84) int local84 = local34 - (local62 - 1) * local50;
		@Pc(93) int local93 = local54 + (1 - local66) * local38;
		@Pc(102) int local102 = local42 - (local66 - 1) * local58;
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = local50 * (local62 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = local58 * (local66 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg1 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local26 - 1) * local114;
		@Pc(158) int[] local158 = Class10_Sub10_Sub1.lb[arg2];
		Static212.method3267(arg6 - arg4, arg6 + -local22, arg3, local158);
		Static212.method3267(arg6 - local22, local22 + arg6, arg0, local158);
		Static212.method3267(arg6 + local22, arg6 + arg4, arg3, local158);
		while (local16 > 0) {
			@Pc(205) boolean local205 = local26 >= local16;
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local122;
					local84 += local140;
					local122 += local110;
					local140 += local110;
					local14++;
				}
			}
			if (local205) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local132 += local118;
						local18++;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local132 += local118;
					local148 += local118;
					local18++;
				}
				local93 += -local154;
				local102 += -local138;
				local154 -= local114;
				local138 -= local114;
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local122 += local110;
				local140 += local110;
				local14++;
			}
			local75 += -local146;
			local84 += -local128;
			local146 -= local106;
			local128 -= local106;
			local16--;
			@Pc(342) int local342 = arg2 - local16;
			@Pc(346) int local346 = local16 + arg2;
			@Pc(351) int local351 = arg6 + local14;
			@Pc(356) int local356 = arg6 - local14;
			if (local205) {
				@Pc(362) int local362 = local18 + arg6;
				@Pc(367) int local367 = arg6 - local18;
				Static212.method3267(local356, local367, arg3, Class10_Sub10_Sub1.lb[local342]);
				Static212.method3267(local367, local362, arg0, Class10_Sub10_Sub1.lb[local342]);
				Static212.method3267(local362, local351, arg3, Class10_Sub10_Sub1.lb[local342]);
				Static212.method3267(local356, local367, arg3, Class10_Sub10_Sub1.lb[local346]);
				Static212.method3267(local367, local362, arg0, Class10_Sub10_Sub1.lb[local346]);
				Static212.method3267(local362, local351, arg3, Class10_Sub10_Sub1.lb[local346]);
			} else {
				Static212.method3267(local356, local351, arg3, Class10_Sub10_Sub1.lb[local342]);
				Static212.method3267(local356, local351, arg3, Class10_Sub10_Sub1.lb[local346]);
			}
		}
	}
}
