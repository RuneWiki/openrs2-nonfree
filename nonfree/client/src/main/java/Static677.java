import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static677 {

	@OriginalMember(owner = "client!wt", name = "l", descriptor = "[I")
	public static final int[] anIntArray670 = new int[1];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBILclient!kh;)V")
	public static void method8740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class208 arg2) {
		if (Static503.aClass208_9 != null || Static463.aBoolean600 || (arg2 == null || Static475.method7527(arg2) == null)) {
			return;
		}
		Static503.aClass208_9 = arg2;
		Static526.aClass208_10 = Static475.method7527(arg2);
		Static149.anInt2809 = 0;
		Static514.aBoolean645 = false;
		Static67.anInt9111 = arg1;
		Static595.anInt9374 = arg0;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIIIBII)V")
	public static void method8743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg1;
		@Pc(20) int local20 = arg5 - arg1;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(72) int local72 = local20 << 1;
		@Pc(81) int local81 = local40 + local24 * (1 - local56);
		@Pc(90) int local90 = local28 - local44 * (local56 - 1);
		@Pc(99) int local99 = local32 * (1 - local72) + local48;
		@Pc(108) int local108 = local36 - local52 * (local72 - 1);
		@Pc(112) int local112 = local24 << 2;
		@Pc(116) int local116 = local28 << 2;
		@Pc(120) int local120 = local32 << 2;
		@Pc(124) int local124 = local36 << 2;
		@Pc(128) int local128 = local40 * 3;
		@Pc(134) int local134 = local44 * (local56 - 3);
		@Pc(138) int local138 = local48 * 3;
		@Pc(144) int local144 = local52 * (local72 - 3);
		@Pc(146) int local146 = local116;
		@Pc(152) int local152 = (arg5 - 1) * local112;
		@Pc(154) int local154 = local124;
		@Pc(160) int local160 = local120 * (local20 - 1);
		@Pc(164) int[] local164 = Static299.anIntArrayArray58[arg6];
		Static526.method7369(local164, arg3 - local16, -arg2 + arg3, arg4);
		Static526.method7369(local164, local16 + arg3, -local16 + arg3, arg0);
		Static526.method7369(local164, arg3 + arg2, local16 + arg3, arg4);
		while (local9 > 0) {
			@Pc(212) boolean local212 = local20 >= local9;
			if (local212) {
				if (local99 < 0) {
					while (local99 < 0) {
						local99 += local138;
						local108 += local154;
						local11++;
						local138 += local124;
						local154 += local124;
					}
				}
				if (local108 < 0) {
					local99 += local138;
					local108 += local154;
					local138 += local124;
					local11++;
					local154 += local124;
				}
				local108 += -local144;
				local99 += -local160;
				local144 -= local120;
				local160 -= local120;
			}
			if (local81 < 0) {
				while (local81 < 0) {
					local81 += local128;
					local90 += local146;
					local7++;
					local128 += local116;
					local146 += local116;
				}
			}
			if (local90 < 0) {
				local81 += local128;
				local90 += local146;
				local7++;
				local146 += local116;
				local128 += local116;
			}
			local81 += -local152;
			local90 += -local134;
			local152 -= local112;
			local134 -= local112;
			local9--;
			@Pc(349) int local349 = arg6 - local9;
			@Pc(353) int local353 = local9 + arg6;
			@Pc(357) int local357 = arg3 + local7;
			@Pc(361) int local361 = arg3 - local7;
			if (local212) {
				@Pc(367) int local367 = local11 + arg3;
				@Pc(372) int local372 = arg3 - local11;
				Static526.method7369(Static299.anIntArrayArray58[local349], local372, local361, arg4);
				Static526.method7369(Static299.anIntArrayArray58[local349], local367, local372, arg0);
				Static526.method7369(Static299.anIntArrayArray58[local349], local357, local367, arg4);
				Static526.method7369(Static299.anIntArrayArray58[local353], local372, local361, arg4);
				Static526.method7369(Static299.anIntArrayArray58[local353], local367, local372, arg0);
				Static526.method7369(Static299.anIntArrayArray58[local353], local357, local367, arg4);
			} else {
				Static526.method7369(Static299.anIntArrayArray58[local349], local357, local361, arg4);
				Static526.method7369(Static299.anIntArrayArray58[local353], local357, local361, arg4);
			}
		}
	}
}
