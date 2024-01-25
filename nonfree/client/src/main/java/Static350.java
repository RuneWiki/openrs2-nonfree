import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Lclient!lk;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "Lclient!ra;")
	public static Class170 aClass170_123;

	@OriginalMember(owner = "client!wm", name = "N", descriptor = "Ljava/lang/String;")
	public static String aString377 = " from your friend list first.";

	@OriginalMember(owner = "client!wm", name = "O", descriptor = "I")
	public static int anInt6549 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg6 - arg0;
		@Pc(22) int local22 = arg2 - arg0;
		@Pc(26) int local26 = arg6 * arg6;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(34) int local34 = local17 * local17;
		@Pc(38) int local38 = local22 * local22;
		@Pc(42) int local42 = local30 << 1;
		@Pc(46) int local46 = local26 << 1;
		@Pc(50) int local50 = local38 << 1;
		@Pc(54) int local54 = local34 << 1;
		@Pc(58) int local58 = arg2 << 1;
		@Pc(62) int local62 = local22 << 1;
		@Pc(71) int local71 = local42 + (1 - local58) * local26;
		@Pc(80) int local80 = local30 - local46 * (local58 - 1);
		@Pc(89) int local89 = (1 - local62) * local34 + local50;
		@Pc(98) int local98 = local38 - (local62 - 1) * local54;
		@Pc(102) int local102 = local26 << 2;
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 * 3;
		@Pc(124) int local124 = (local58 - 3) * local46;
		@Pc(128) int local128 = local50 * 3;
		@Pc(134) int local134 = local54 * (local62 - 3);
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = local102 * (arg2 - 1);
		@Pc(144) int local144 = local114;
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (arg3 >= Static314.anInt6018 && arg3 <= Static334.anInt6315) {
			@Pc(158) int[] local158 = Static332.anIntArrayArray56[arg3];
			local167 = Static133.method5819(Static80.anInt4809, arg1 - arg6, Static184.anInt6250);
			local176 = Static133.method5819(Static80.anInt4809, arg1 + arg6, Static184.anInt6250);
			local185 = Static133.method5819(Static80.anInt4809, arg1 - local17, Static184.anInt6250);
			local193 = Static133.method5819(Static80.anInt4809, local17 + arg1, Static184.anInt6250);
			Static247.method3552(arg4, local167, local158, local185);
			Static247.method3552(arg5, local185, local158, local193);
			Static247.method3552(arg4, local193, local158, local176);
		}
		@Pc(219) int local219 = local110 * (local22 - 1);
		while (local11 > 0) {
			@Pc(227) boolean local227 = local11 <= local22;
			if (local227) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local128;
						local98 += local144;
						local13++;
						local144 += local114;
						local128 += local114;
					}
				}
				if (local98 < 0) {
					local98 += local144;
					local89 += local128;
					local13++;
					local144 += local114;
					local128 += local114;
				}
				local89 += -local219;
				local98 += -local134;
				local219 -= local110;
				local134 -= local110;
			}
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local136;
					local71 += local118;
					local136 += local106;
					local118 += local106;
					local9++;
				}
			}
			if (local80 < 0) {
				local71 += local118;
				local80 += local136;
				local136 += local106;
				local118 += local106;
				local9++;
			}
			local80 += -local124;
			local71 += -local142;
			local11--;
			local142 -= local102;
			local124 -= local102;
			local167 = arg3 - local11;
			local176 = arg3 + local11;
			if (local176 >= Static314.anInt6018 && Static334.anInt6315 >= local167) {
				local185 = Static133.method5819(Static80.anInt4809, arg1 + local9, Static184.anInt6250);
				local193 = Static133.method5819(Static80.anInt4809, arg1 - local9, Static184.anInt6250);
				if (local227) {
					@Pc(427) int local427 = Static133.method5819(Static80.anInt4809, local13 + arg1, Static184.anInt6250);
					@Pc(436) int local436 = Static133.method5819(Static80.anInt4809, arg1 - local13, Static184.anInt6250);
					@Pc(443) int[] local443;
					if (Static314.anInt6018 <= local167) {
						local443 = Static332.anIntArrayArray56[local167];
						Static247.method3552(arg4, local193, local443, local436);
						Static247.method3552(arg5, local436, local443, local427);
						Static247.method3552(arg4, local427, local443, local185);
					}
					if (local176 <= Static334.anInt6315) {
						local443 = Static332.anIntArrayArray56[local176];
						Static247.method3552(arg4, local193, local443, local436);
						Static247.method3552(arg5, local436, local443, local427);
						Static247.method3552(arg4, local427, local443, local185);
					}
				} else {
					if (local167 >= Static314.anInt6018) {
						Static247.method3552(arg4, local193, Static332.anIntArrayArray56[local167], local185);
					}
					if (Static334.anInt6315 >= local176) {
						Static247.method3552(arg4, local193, Static332.anIntArrayArray56[local176], local185);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public static void method5772() {
		@Pc(1) Class66 local1 = Static37.aClass66_10;
		synchronized (Static37.aClass66_10) {
			Static37.aClass66_10.method1942();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5775(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(52) StringBuffer local52 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(56) long local56 = arg0;
				arg0 /= 37L;
				local52.append(Static227.aCharArray22[(int) (local56 - arg0 * 37L)]);
			}
			return local52.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIIII)Lclient!bd;")
	public static Class18 method5781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 76724863L ^ (long) arg4 * 67481L ^ (long) arg0 * 97549L ^ (long) arg1 * 475427L ^ (long) arg5 * 986053L ^ (long) arg2 * 32147369L;
		@Pc(39) Class18 local39 = (Class18) Static187.aClass66_106.method1939(local33);
		if (local39 == null) {
			local39 = Static26.aClass59_2.method4879(arg4, arg0, arg1, arg5, arg2, arg3);
			Static187.aClass66_106.method1936(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
