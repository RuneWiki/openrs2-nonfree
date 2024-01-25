import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public static int anInt350;

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
	public static int anInt351;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
	public static int anInt347 = 0;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "Lclient!rv;")
	public static final Class227 aClass227_1 = new Class227(1);

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method348(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg1 - arg6;
		@Pc(21) int local21 = arg3 - arg6;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = arg3 * arg3;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local21 << 1;
		@Pc(71) int local71 = local25 * (1 - local57) + local41;
		@Pc(80) int local80 = local29 - local45 * (local57 - 1);
		@Pc(89) int local89 = local49 + local33 * (1 - local61);
		@Pc(98) int local98 = local37 - (local61 - 1) * local53;
		@Pc(102) int local102 = local25 << 2;
		@Pc(106) int local106 = local29 << 2;
		@Pc(110) int local110 = local33 << 2;
		@Pc(114) int local114 = local37 << 2;
		@Pc(118) int local118 = local41 * 3;
		@Pc(124) int local124 = local45 * (local57 - 3);
		@Pc(128) int local128 = local49 * 3;
		@Pc(134) int local134 = local53 * (local61 - 3);
		@Pc(136) int local136 = local106;
		@Pc(142) int local142 = local102 * (arg3 - 1);
		@Pc(144) int local144 = local114;
		@Pc(150) int local150 = local110 * (local21 - 1);
		@Pc(154) int[] local154 = Static194.anIntArrayArray28[arg4];
		Static298.method3977(arg2 - arg1, arg5, arg2 - local16, local154);
		Static298.method3977(arg2 - local16, arg0, arg2 + local16, local154);
		Static298.method3977(arg2 + local16, arg5, arg1 + arg2, local154);
		while (local9 > 0) {
			@Pc(199) boolean local199 = local9 <= local21;
			if (local199) {
				if (local89 < 0) {
					while (local89 < 0) {
						local89 += local128;
						local98 += local144;
						local11++;
						local144 += local114;
						local128 += local114;
					}
				}
				if (local98 < 0) {
					local89 += local128;
					local98 += local144;
					local128 += local114;
					local144 += local114;
					local11++;
				}
				local98 += -local134;
				local89 += -local150;
				local134 -= local110;
				local150 -= local110;
			}
			if (local71 < 0) {
				while (local71 < 0) {
					local80 += local136;
					local71 += local118;
					local7++;
					local118 += local106;
					local136 += local106;
				}
			}
			if (local80 < 0) {
				local80 += local136;
				local71 += local118;
				local118 += local106;
				local136 += local106;
				local7++;
			}
			local71 += -local142;
			local80 += -local124;
			local142 -= local102;
			local9--;
			local124 -= local102;
			@Pc(335) int local335 = arg4 - local9;
			@Pc(339) int local339 = local9 + arg4;
			@Pc(344) int local344 = arg2 + local7;
			@Pc(349) int local349 = arg2 - local7;
			if (local199) {
				@Pc(355) int local355 = local11 + arg2;
				@Pc(360) int local360 = arg2 - local11;
				Static298.method3977(local349, arg5, local360, Static194.anIntArrayArray28[local335]);
				Static298.method3977(local360, arg0, local355, Static194.anIntArrayArray28[local335]);
				Static298.method3977(local355, arg5, local344, Static194.anIntArrayArray28[local335]);
				Static298.method3977(local349, arg5, local360, Static194.anIntArrayArray28[local339]);
				Static298.method3977(local360, arg0, local355, Static194.anIntArrayArray28[local339]);
				Static298.method3977(local355, arg5, local344, Static194.anIntArrayArray28[local339]);
			} else {
				Static298.method3977(local349, arg5, local344, Static194.anIntArrayArray28[local335]);
				Static298.method3977(local349, arg5, local344, Static194.anIntArrayArray28[local339]);
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
	public static void method349(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub3_Sub1 local13 = Static427.method5426(arg0, 7);
		local13.method385();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public static void method350() {
		Static61.anInt7291 = 0;
		Static288.anInt4834 = -1;
		Static190.anInt3500 = -1;
		Static460.anInt7364 = -1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method351() {
		Static187.aClass85_11 = null;
		Static392.aClass85_20 = null;
		Static157.aClass85_10 = null;
		Static451.aClass85_25 = null;
		Static91.aClass85Array5 = null;
		Static414.aClass85_21 = null;
		Static292.aClass85_12 = null;
		Static67.aClass85_24 = null;
		Static123.aClass85_9 = null;
	}
}
