import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V")
	public static void method4948() {
		for (@Pc(6) Class5_Sub4_Sub6 local6 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local6 != null; local6 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
			if (local6.anInt2325 > 1) {
				local6.anInt2325 = 0;
				Static517.aClass293_59.method6925(((Class5_Sub4_Sub14) local6.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67).aLong164, local6);
				local6.aClass80_3.method1542();
			}
		}
		Static642.anInt10370 = 0;
		Static198.anInt3547 = 0;
		Static607.aClass306_63.method7315();
		Static28.aClass81_7.method1602();
		Static616.aClass80_12.method1542();
		Static437.method6511(Static630.aClass5_Sub4_Sub14_4);
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
	public static void method4950() {
		@Pc(8) Class5_Sub33 local8 = (Class5_Sub33) Static622.aClass306_65.method7313();
		@Pc(19) boolean local19 = Static629.aClass357_15 != null || Static239.anInt4038 > 0;
		@Pc(23) int local23 = local8.method6099();
		@Pc(27) int local27 = local8.method6094();
		if (local19) {
			Static344.anInt8343 = 1;
		}
		if (local19) {
			Static552.aClass5_Sub4_Sub14_3 = Static510.aClass5_Sub4_Sub14_1;
		} else {
			Static178.method2709(local27, local23, Static510.aClass5_Sub4_Sub14_1);
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg1 && arg2 == arg7 && arg6 == arg0 && arg8 == arg5) {
			Static154.method2234(arg7, arg0, arg3, arg5, arg4);
			return;
		}
		@Pc(26) int local26 = arg4;
		@Pc(28) int local28 = arg7;
		@Pc(32) int local32 = arg4 * 3;
		@Pc(36) int local36 = arg7 * 3;
		@Pc(40) int local40 = arg1 * 3;
		@Pc(44) int local44 = arg2 * 3;
		@Pc(48) int local48 = arg6 * 3;
		@Pc(52) int local52 = arg8 * 3;
		@Pc(62) int local62 = arg0 + local40 - local48 - arg4;
		@Pc(72) int local72 = arg5 + local44 - arg7 - local52;
		@Pc(82) int local82 = local48 + local32 - local40 - local40;
		@Pc(93) int local93 = local52 + local36 - local44 - local44;
		@Pc(98) int local98 = local40 - local32;
		@Pc(103) int local103 = local44 - local36;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local113 * local105 >> 12;
			@Pc(123) int local123 = local62 * local119;
			@Pc(127) int local127 = local72 * local119;
			@Pc(131) int local131 = local82 * local113;
			@Pc(135) int local135 = local93 * local113;
			@Pc(139) int local139 = local105 * local98;
			@Pc(143) int local143 = local103 * local105;
			@Pc(153) int local153 = arg4 + (local139 + local131 + local123 >> 12);
			@Pc(164) int local164 = arg7 + (local127 + local135 + local143 >> 12);
			Static154.method2234(local28, local153, arg3, local164, local26);
			local26 = local153;
			local28 = local164;
		}
	}
}
