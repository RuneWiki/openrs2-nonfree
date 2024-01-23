import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!th", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!th", name = "o", descriptor = "Lclient!dl;")
	public static Class40 aClass40_2;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "[I")
	public static int[] anIntArray469;

	@OriginalMember(owner = "client!th", name = "n", descriptor = "Lclient!th;")
	public static Class169 aClass169_143 = new Class169(64);

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	public static int anInt5176 = 0;

	@OriginalMember(owner = "client!th", name = "r", descriptor = "I")
	public static int anInt5177 = 0;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "Lclient!th;")
	public static Class169 aClass169_144 = new Class169(260);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIBIIIII)V")
	public static void method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg6 - arg2;
		@Pc(21) int local21 = arg3 - arg2;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local33 << 1;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local21 * local21;
		@Pc(49) int local49 = local21 << 1;
		@Pc(53) int local53 = local45 << 1;
		@Pc(57) int local57 = local25 << 1;
		@Pc(61) int local61 = arg3 << 1;
		@Pc(70) int local70 = local29 - (local61 - 1) * local57;
		@Pc(78) int local78 = local53 + (1 - local49) * local33;
		@Pc(86) int local86 = local41 + local25 * (1 - local61);
		@Pc(102) int local102 = local45 - local37 * (local49 - 1);
		@Pc(106) int local106 = local25 << 2;
		@Pc(110) int local110 = local29 << 2;
		@Pc(114) int local114 = local33 << 2;
		@Pc(118) int local118 = local45 << 2;
		@Pc(122) int local122 = local41 * 3;
		@Pc(128) int local128 = local57 * (local61 - 3);
		@Pc(134) int local134 = local37 * (local49 - 3);
		@Pc(138) int local138 = local53 * 3;
		@Pc(140) int local140 = local110;
		@Pc(142) int local142 = local118;
		@Pc(148) int local148 = local114 * (local21 - 1);
		@Pc(171) int local171;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (Static240.anInt1319 <= arg1 && arg1 <= Static59.anInt1155) {
			@Pc(163) int[] local163 = Static51.anIntArrayArray1[arg1];
			local171 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 - arg6);
			local180 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 + arg6);
			local189 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 - local16);
			local197 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 + local16);
			Static109.method1795(local171, local163, local189, arg4);
			Static109.method1795(local189, local163, local197, arg0);
			Static109.method1795(local197, local163, local180, arg4);
		}
		@Pc(221) int local221 = local106 * (arg3 - 1);
		while (local9 > 0) {
			if (local86 < 0) {
				while (local86 < 0) {
					local7++;
					local86 += local122;
					local122 += local110;
					local70 += local140;
					local140 += local110;
				}
			}
			if (local70 < 0) {
				local86 += local122;
				local7++;
				local70 += local140;
				local140 += local110;
				local122 += local110;
			}
			local86 += -local221;
			local221 -= local106;
			local70 += -local128;
			@Pc(296) boolean local296 = local9 <= local21;
			if (local296) {
				if (local78 < 0) {
					while (local78 < 0) {
						local78 += local138;
						local138 += local118;
						local102 += local142;
						local142 += local118;
						local11++;
					}
				}
				if (local102 < 0) {
					local102 += local142;
					local78 += local138;
					local11++;
					local138 += local118;
					local142 += local118;
				}
				local78 += -local148;
				local102 += -local134;
				local148 -= local114;
				local134 -= local114;
			}
			local9--;
			local180 = local9 + arg1;
			local128 -= local106;
			local171 = arg1 - local9;
			if (Static240.anInt1319 <= local180 && local171 <= Static59.anInt1155) {
				local189 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, local7 + arg5);
				local197 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 - local7);
				if (local296) {
					@Pc(438) int local438 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 + local11);
					@Pc(446) int local446 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg5 - local11);
					@Pc(454) int[] local454;
					if (local171 >= Static240.anInt1319) {
						local454 = Static51.anIntArrayArray1[local171];
						Static109.method1795(local197, local454, local446, arg4);
						Static109.method1795(local446, local454, local438, arg0);
						Static109.method1795(local438, local454, local189, arg4);
					}
					if (local180 <= Static59.anInt1155) {
						local454 = Static51.anIntArrayArray1[local180];
						Static109.method1795(local197, local454, local446, arg4);
						Static109.method1795(local446, local454, local438, arg0);
						Static109.method1795(local438, local454, local189, arg4);
					}
				} else {
					if (local171 >= Static240.anInt1319) {
						Static109.method1795(local197, Static51.anIntArrayArray1[local171], local189, arg4);
					}
					if (Static59.anInt1155 >= local180) {
						Static109.method1795(local197, Static51.anIntArrayArray1[local180], local189, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)I")
	public static int method4021(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
