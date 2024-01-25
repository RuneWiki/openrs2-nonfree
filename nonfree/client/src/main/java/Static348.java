import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!m", name = "t", descriptor = "Lclient!wt;")
	public static Class5_Sub55 aClass5_Sub55_2;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_109 = new Class156(40, 8);

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Lclient!wh;")
	public static final Class392 aClass392_4 = new Class392(1, 2);

	@OriginalMember(owner = "client!m", name = "m", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_110 = new Class156(115, -1);

	@OriginalMember(owner = "client!m", name = "n", descriptor = "[I")
	public static final int[] anIntArray333 = new int[13];

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_111 = new Class156(34, -2);

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	public static int anInt5747 = 1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIZZZ)I")
	public static int method5139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class5_Sub31 local10 = Static93.method1470(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < local10.anIntArray328.length; local19++) {
			if (local10.anIntArray328[local19] >= 0 && Static82.aClass134_1.anInt3482 > local10.anIntArray328[local19]) {
				@Pc(49) Class246 local49 = Static82.aClass134_1.method3191(local10.anIntArray328[local19]);
				@Pc(59) int local59 = local49.method5691(Static612.aClass380_2.method8839(arg0).anInt336, arg0);
				if (arg2) {
					local17 += local59 * local10.anIntArray327[local19];
				} else {
					local17 += local59;
				}
			}
		}
		if (false) {
			return -60;
		} else {
			return local17;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method5140() {
		Static214.method8571(-1, 255);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg3;
		@Pc(19) int local19 = arg2 - arg3;
		@Pc(23) int local23 = arg1 * arg1;
		@Pc(27) int local27 = arg2 * arg2;
		@Pc(43) int local43 = local15 * local15;
		@Pc(47) int local47 = local19 * local19;
		@Pc(51) int local51 = local27 << 1;
		@Pc(55) int local55 = local23 << 1;
		@Pc(59) int local59 = local47 << 1;
		@Pc(63) int local63 = local43 << 1;
		@Pc(67) int local67 = arg2 << 1;
		@Pc(71) int local71 = local19 << 1;
		@Pc(80) int local80 = local51 + local23 * (1 - local67);
		@Pc(88) int local88 = local27 - (local67 - 1) * local55;
		@Pc(97) int local97 = (1 - local71) * local43 + local59;
		@Pc(106) int local106 = local47 - local63 * (local71 - 1);
		@Pc(110) int local110 = local23 << 2;
		@Pc(114) int local114 = local27 << 2;
		@Pc(118) int local118 = local43 << 2;
		@Pc(122) int local122 = local47 << 2;
		@Pc(126) int local126 = local51 * 3;
		@Pc(132) int local132 = local55 * (local67 - 3);
		@Pc(136) int local136 = local59 * 3;
		@Pc(142) int local142 = (local71 - 3) * local63;
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = (arg2 - 1) * local110;
		@Pc(152) int local152 = local122;
		@Pc(158) int local158 = (local19 - 1) * local118;
		@Pc(162) int[] local162 = Static120.anIntArrayArray18[arg0];
		Static161.method2977(arg6 - arg1, arg5, arg6 - local15, local162, -109);
		Static161.method2977(arg6 - local15, arg4, local15 + arg6, local162, -123);
		Static161.method2977(arg6 + local15, arg5, arg1 + arg6, local162, -116);
		while (local9 > 0) {
			@Pc(206) boolean local206 = local19 >= local9;
			if (local206) {
				if (local97 < 0) {
					while (local97 < 0) {
						local106 += local152;
						local97 += local136;
						local11++;
						local136 += local122;
						local152 += local122;
					}
				}
				if (local106 < 0) {
					local106 += local152;
					local97 += local136;
					local136 += local122;
					local11++;
					local152 += local122;
				}
				local106 += -local142;
				local97 += -local158;
				local142 -= local118;
				local158 -= local118;
			}
			if (local80 < 0) {
				while (local80 < 0) {
					local88 += local144;
					local80 += local126;
					local144 += local114;
					local7++;
					local126 += local114;
				}
			}
			if (local88 < 0) {
				local80 += local126;
				local88 += local144;
				local144 += local114;
				local7++;
				local126 += local114;
			}
			local80 += -local150;
			local88 += -local132;
			local9--;
			local132 -= local110;
			local150 -= local110;
			@Pc(348) int local348 = arg0 - local9;
			@Pc(352) int local352 = local9 + arg0;
			@Pc(356) int local356 = local7 + arg6;
			@Pc(361) int local361 = arg6 - local7;
			if (local206) {
				@Pc(387) int local387 = arg6 + local11;
				@Pc(392) int local392 = arg6 - local11;
				Static161.method2977(local361, arg5, local392, Static120.anIntArrayArray18[local348], -120);
				Static161.method2977(local392, arg4, local387, Static120.anIntArrayArray18[local348], -111);
				Static161.method2977(local387, arg5, local356, Static120.anIntArrayArray18[local348], -115);
				Static161.method2977(local361, arg5, local392, Static120.anIntArrayArray18[local352], -122);
				Static161.method2977(local392, arg4, local387, Static120.anIntArrayArray18[local352], -110);
				Static161.method2977(local387, arg5, local356, Static120.anIntArrayArray18[local352], -107);
			} else {
				Static161.method2977(local361, arg5, local356, Static120.anIntArrayArray18[local348], -113);
				Static161.method2977(local361, arg5, local356, Static120.anIntArrayArray18[local352], -110);
			}
		}
	}
}
