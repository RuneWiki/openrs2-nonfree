import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
	public static int anInt9267;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "I")
	public static int anInt9269;

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "Lclient!fh;")
	public static final Class90 aClass90_19 = new Class90();

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray89 = new int[6][];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg2;
		@Pc(21) int local21 = arg3 - arg2;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(70) int local70 = local41 + (1 - local57) * local25;
		@Pc(79) int local79 = local29 - local45 * (local57 - 1);
		@Pc(88) int local88 = local49 + (1 - local61) * local33;
		@Pc(97) int local97 = local37 - local53 * (local61 - 1);
		@Pc(101) int local101 = local25 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 * 3;
		@Pc(123) int local123 = (local57 - 3) * local45;
		@Pc(127) int local127 = local49 * 3;
		@Pc(133) int local133 = local53 * (local61 - 3);
		@Pc(139) int local139 = local105;
		@Pc(145) int local145 = (arg3 - 1) * local101;
		@Pc(147) int local147 = local113;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(187) int local187;
		@Pc(195) int local195;
		if (arg0 >= Static269.anInt5577 && Static81.anInt1788 >= arg0) {
			@Pc(161) int[] local161 = Static68.anIntArrayArray24[arg0];
			local170 = Static73.method7829(arg1 - arg6, Static190.anInt4314, Static145.anInt2941);
			local178 = Static73.method7829(arg6 + arg1, Static190.anInt4314, Static145.anInt2941);
			local187 = Static73.method7829(arg1 - local16, Static190.anInt4314, Static145.anInt2941);
			local195 = Static73.method7829(local16 + arg1, Static190.anInt4314, Static145.anInt2941);
			Static257.method4540(local161, arg4, local170, local187);
			Static257.method4540(local161, arg5, local187, local195);
			Static257.method4540(local161, arg4, local195, local178);
		}
		@Pc(221) int local221 = local109 * (local21 - 1);
		while (local9 > 0) {
			@Pc(230) boolean local230 = local21 >= local9;
			if (local230) {
				if (local88 < 0) {
					while (local88 < 0) {
						local88 += local127;
						local97 += local147;
						local11++;
						local127 += local113;
						local147 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local147;
					local88 += local127;
					local147 += local113;
					local11++;
					local127 += local113;
				}
				local97 += -local133;
				local88 += -local221;
				local221 -= local109;
				local133 -= local109;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local70 += local117;
					local79 += local139;
					local139 += local105;
					local117 += local105;
					local7++;
				}
			}
			if (local79 < 0) {
				local70 += local117;
				local79 += local139;
				local117 += local105;
				local7++;
				local139 += local105;
			}
			local79 += -local123;
			local70 += -local145;
			local123 -= local101;
			local9--;
			local145 -= local101;
			local170 = arg0 - local9;
			local178 = arg0 + local9;
			if (Static269.anInt5577 <= local178 && Static81.anInt1788 >= local170) {
				local187 = Static73.method7829(arg1 + local7, Static190.anInt4314, Static145.anInt2941);
				local195 = Static73.method7829(arg1 - local7, Static190.anInt4314, Static145.anInt2941);
				if (local230) {
					@Pc(402) int local402 = Static73.method7829(local11 + arg1, Static190.anInt4314, Static145.anInt2941);
					@Pc(411) int local411 = Static73.method7829(arg1 - local11, Static190.anInt4314, Static145.anInt2941);
					@Pc(418) int[] local418;
					if (local170 >= Static269.anInt5577) {
						local418 = Static68.anIntArrayArray24[local170];
						Static257.method4540(local418, arg4, local195, local411);
						Static257.method4540(local418, arg5, local411, local402);
						Static257.method4540(local418, arg4, local402, local187);
					}
					if (Static81.anInt1788 >= local178) {
						local418 = Static68.anIntArrayArray24[local178];
						Static257.method4540(local418, arg4, local195, local411);
						Static257.method4540(local418, arg5, local411, local402);
						Static257.method4540(local418, arg4, local402, local187);
					}
				} else {
					if (local170 >= Static269.anInt5577) {
						Static257.method4540(Static68.anIntArrayArray24[local170], arg4, local195, local187);
					}
					if (local178 <= Static81.anInt1788) {
						Static257.method4540(Static68.anIntArrayArray24[local178], arg4, local195, local187);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ)I")
	public static int method7660(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
