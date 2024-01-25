import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray65;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "[Lclient!mn;")
	public static final Class210_Sub1[] aClass210_Sub1Array3 = new Class210_Sub1[37];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg4;
		@Pc(21) int local21 = arg1 - arg4;
		@Pc(30) int local30 = arg5 * arg5;
		@Pc(34) int local34 = arg1 * arg1;
		@Pc(38) int local38 = local16 * local16;
		@Pc(42) int local42 = local21 * local21;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg1 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(76) int local76 = local30 * (1 - local62) + local46;
		@Pc(84) int local84 = local34 - local50 * (local62 - 1);
		@Pc(92) int local92 = local38 * (1 - local66) + local54;
		@Pc(101) int local101 = local42 - local58 * (local66 - 1);
		@Pc(105) int local105 = local30 << 2;
		@Pc(109) int local109 = local34 << 2;
		@Pc(113) int local113 = local38 << 2;
		@Pc(117) int local117 = local42 << 2;
		@Pc(121) int local121 = local46 * 3;
		@Pc(127) int local127 = (local62 - 3) * local50;
		@Pc(131) int local131 = local54 * 3;
		@Pc(137) int local137 = local58 * (local66 - 3);
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg1 - 1);
		@Pc(147) int local147 = local117;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(187) int local187;
		@Pc(195) int local195;
		if (Static444.anInt8258 <= arg6 && arg6 <= Static188.anInt4410) {
			@Pc(161) int[] local161 = Static632.anIntArrayArray65[arg6];
			local170 = Static132.method2911(Static251.anInt9634, arg3 - arg5, Static366.anInt6946);
			local178 = Static132.method2911(Static251.anInt9634, arg3 + arg5, Static366.anInt6946);
			local187 = Static132.method2911(Static251.anInt9634, arg3 - local16, Static366.anInt6946);
			local195 = Static132.method2911(Static251.anInt9634, local16 + arg3, Static366.anInt6946);
			Static36.method1264(local161, local170, arg0, local187);
			Static36.method1264(local161, local187, arg2, local195);
			Static36.method1264(local161, local195, arg0, local178);
		}
		@Pc(219) int local219 = (local21 - 1) * local113;
		while (local9 > 0) {
			@Pc(232) boolean local232 = local9 <= local21;
			if (local232) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local131;
						local101 += local147;
						local11++;
						local131 += local117;
						local147 += local117;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local92 += local131;
					local11++;
					local131 += local117;
					local147 += local117;
				}
				local92 += -local219;
				local101 += -local137;
				local219 -= local113;
				local137 -= local113;
			}
			if (local76 < 0) {
				while (local76 < 0) {
					local76 += local121;
					local84 += local139;
					local7++;
					local139 += local109;
					local121 += local109;
				}
			}
			if (local84 < 0) {
				local76 += local121;
				local84 += local139;
				local139 += local109;
				local121 += local109;
				local7++;
			}
			local76 += -local145;
			local84 += -local127;
			local9--;
			local127 -= local105;
			local145 -= local105;
			local170 = arg6 - local9;
			local178 = arg6 + local9;
			if (local178 >= Static444.anInt8258 && local170 <= Static188.anInt4410) {
				local187 = Static132.method2911(Static251.anInt9634, arg3 + local7, Static366.anInt6946);
				local195 = Static132.method2911(Static251.anInt9634, arg3 - local7, Static366.anInt6946);
				if (local232) {
					@Pc(432) int local432 = Static132.method2911(Static251.anInt9634, arg3 + local11, Static366.anInt6946);
					@Pc(441) int local441 = Static132.method2911(Static251.anInt9634, arg3 - local11, Static366.anInt6946);
					@Pc(452) int[] local452;
					if (local170 >= Static444.anInt8258) {
						local452 = Static632.anIntArrayArray65[local170];
						Static36.method1264(local452, local195, arg0, local441);
						Static36.method1264(local452, local441, arg2, local432);
						Static36.method1264(local452, local432, arg0, local187);
					}
					if (local178 <= Static188.anInt4410) {
						local452 = Static632.anIntArrayArray65[local178];
						Static36.method1264(local452, local195, arg0, local441);
						Static36.method1264(local452, local441, arg2, local432);
						Static36.method1264(local452, local432, arg0, local187);
					}
				} else {
					if (Static444.anInt8258 <= local170) {
						Static36.method1264(Static632.anIntArrayArray65[local170], local195, arg0, local187);
					}
					if (local178 <= Static188.anInt4410) {
						Static36.method1264(Static632.anIntArrayArray65[local178], local195, arg0, local187);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)Z")
	public static boolean method3201() {
		return Static570.anInt9813 != 0;
	}
}
