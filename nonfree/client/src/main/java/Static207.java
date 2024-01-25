import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "Lclient!an;")
	public static Class16 aClass16_53;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!bea;IIBI)V")
	public static void method3852(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray316[0];
		@Pc(15) int local15 = arg0.anIntArray317[0];
		if (local10 < 0 || Static37.anInt7512 <= local10 || local15 < 0 || local15 >= Static329.anInt6247 || (arg2 < 0 || Static37.anInt7512 <= arg2 || arg1 < 0 || Static329.anInt6247 <= arg1)) {
			return;
		}
		@Pc(80) int local80 = Static151.method3020(Static40.anIntArray120, Static510.aClass184Array1[arg0.aByte99], 0, arg1, local10, 0, local15, arg0.method3591(), -4, 0, Static250.anIntArray370, arg2, true, 0);
		if (local80 >= 1 && local80 <= 3) {
			for (@Pc(96) int local96 = 0; local96 < local80 - 1; local96++) {
				arg0.method783(Static40.anIntArray120[local96], (byte) 2, Static250.anIntArray370[local96]);
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg6;
		@Pc(21) int local21 = arg0 - arg6;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(34) int local34 = arg0 * arg0;
		@Pc(38) int local38 = local16 * local16;
		@Pc(42) int local42 = local21 * local21;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg0 << 1;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local30 * (1 - local62) + local46;
		@Pc(83) int local83 = local34 - (local62 - 1) * local50;
		@Pc(93) int local93 = local38 * (1 - local66) + local54;
		@Pc(102) int local102 = local42 - local58 * (local66 - 1);
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = local50 * (local62 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = local58 * (local66 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg0 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local21 - 1) * local114;
		@Pc(158) int[] local158 = Static228.anIntArrayArray46[arg4];
		Static118.method2461(local158, arg5 - local16, arg3, arg5 - arg2);
		Static118.method2461(local158, arg5 + local16, arg1, arg5 - local16);
		Static118.method2461(local158, arg5 + arg2, arg3, arg5 + local16);
		while (local9 > 0) {
			@Pc(205) boolean local205 = local9 <= local21;
			if (local205) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local132 += local118;
						local11++;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local11++;
					local132 += local118;
					local148 += local118;
				}
				local93 += -local154;
				local102 += -local138;
				local138 -= local114;
				local154 -= local114;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local122;
					local83 += local140;
					local122 += local110;
					local140 += local110;
					local7++;
				}
			}
			if (local83 < 0) {
				local83 += local140;
				local75 += local122;
				local122 += local110;
				local7++;
				local140 += local110;
			}
			local83 += -local128;
			local75 += -local146;
			local128 -= local106;
			local146 -= local106;
			local9--;
			@Pc(342) int local342 = arg4 - local9;
			@Pc(346) int local346 = local9 + arg4;
			@Pc(350) int local350 = arg5 + local7;
			@Pc(355) int local355 = arg5 - local7;
			if (local205) {
				@Pc(361) int local361 = arg5 + local11;
				@Pc(366) int local366 = arg5 - local11;
				Static118.method2461(Static228.anIntArrayArray46[local342], local366, arg3, local355);
				Static118.method2461(Static228.anIntArrayArray46[local342], local361, arg1, local366);
				Static118.method2461(Static228.anIntArrayArray46[local342], local350, arg3, local361);
				Static118.method2461(Static228.anIntArrayArray46[local346], local366, arg3, local355);
				Static118.method2461(Static228.anIntArrayArray46[local346], local361, arg1, local366);
				Static118.method2461(Static228.anIntArrayArray46[local346], local350, arg3, local361);
			} else {
				Static118.method2461(Static228.anIntArrayArray46[local342], local350, arg3, local355);
				Static118.method2461(Static228.anIntArrayArray46[local346], local350, arg3, local355);
			}
		}
	}
}
