import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "Lclient!im;")
	public static final Class140 aClass140_102 = new Class140(83, 6);

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "Lclient!im;")
	public static final Class140 aClass140_103 = new Class140(85, 20);

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2 - arg6;
		@Pc(20) int local20 = arg1 - arg6;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local40 + local24 * (1 - local56);
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(86) int local86 = local32 * (1 - local60) + local48;
		@Pc(94) int local94 = local36 - local52 * (local60 - 1);
		@Pc(98) int local98 = local24 << 2;
		@Pc(102) int local102 = local28 << 2;
		@Pc(106) int local106 = local32 << 2;
		@Pc(110) int local110 = local36 << 2;
		@Pc(114) int local114 = local40 * 3;
		@Pc(120) int local120 = local44 * (local56 - 3);
		@Pc(124) int local124 = local48 * 3;
		@Pc(130) int local130 = local52 * (local60 - 3);
		@Pc(132) int local132 = local102;
		@Pc(138) int local138 = local98 * (arg1 - 1);
		@Pc(140) int local140 = local110;
		@Pc(163) int local163;
		@Pc(171) int local171;
		@Pc(180) int local180;
		@Pc(189) int local189;
		if (Static99.anInt1988 <= arg5 && arg5 <= Static205.anInt4042) {
			@Pc(154) int[] local154 = Static447.anIntArrayArray99[arg5];
			local163 = Static400.method6041(arg4 - arg2, Static216.anInt4203, Static358.anInt8908);
			local171 = Static400.method6041(arg2 + arg4, Static216.anInt4203, Static358.anInt8908);
			local180 = Static400.method6041(arg4 - local15, Static216.anInt4203, Static358.anInt8908);
			local189 = Static400.method6041(arg4 + local15, Static216.anInt4203, Static358.anInt8908);
			Static424.method6216(local180, arg0, local163, local154);
			Static424.method6216(local189, arg3, local180, local154);
			Static424.method6216(local171, arg0, local189, local154);
		}
		@Pc(213) int local213 = local106 * (local20 - 1);
		while (local9 > 0) {
			@Pc(228) boolean local228 = local20 >= local9;
			if (local228) {
				if (local86 < 0) {
					while (local86 < 0) {
						local86 += local124;
						local94 += local140;
						local11++;
						local140 += local110;
						local124 += local110;
					}
				}
				if (local94 < 0) {
					local86 += local124;
					local94 += local140;
					local140 += local110;
					local11++;
					local124 += local110;
				}
				local86 += -local213;
				local94 += -local130;
				local213 -= local106;
				local130 -= local106;
			}
			if (local68 < 0) {
				while (local68 < 0) {
					local77 += local132;
					local68 += local114;
					local132 += local102;
					local7++;
					local114 += local102;
				}
			}
			if (local77 < 0) {
				local68 += local114;
				local77 += local132;
				local114 += local102;
				local132 += local102;
				local7++;
			}
			local77 += -local120;
			local68 += -local138;
			local120 -= local98;
			local9--;
			local138 -= local98;
			local163 = arg5 - local9;
			local171 = arg5 + local9;
			if (Static99.anInt1988 <= local171 && local163 <= Static205.anInt4042) {
				local180 = Static400.method6041(local7 + arg4, Static216.anInt4203, Static358.anInt8908);
				local189 = Static400.method6041(arg4 - local7, Static216.anInt4203, Static358.anInt8908);
				if (local228) {
					@Pc(406) int local406 = Static400.method6041(local11 + arg4, Static216.anInt4203, Static358.anInt8908);
					@Pc(414) int local414 = Static400.method6041(arg4 - local11, Static216.anInt4203, Static358.anInt8908);
					@Pc(425) int[] local425;
					if (local163 >= Static99.anInt1988) {
						local425 = Static447.anIntArrayArray99[local163];
						Static424.method6216(local414, arg0, local189, local425);
						Static424.method6216(local406, arg3, local414, local425);
						Static424.method6216(local180, arg0, local406, local425);
					}
					if (Static205.anInt4042 >= local171) {
						local425 = Static447.anIntArrayArray99[local171];
						Static424.method6216(local414, arg0, local189, local425);
						Static424.method6216(local406, arg3, local414, local425);
						Static424.method6216(local180, arg0, local406, local425);
					}
				} else {
					if (Static99.anInt1988 <= local163) {
						Static424.method6216(local180, arg0, local189, Static447.anIntArrayArray99[local163]);
					}
					if (Static205.anInt4042 >= local171) {
						Static424.method6216(local180, arg0, local189, Static447.anIntArrayArray99[local171]);
					}
				}
			}
		}
	}
}
