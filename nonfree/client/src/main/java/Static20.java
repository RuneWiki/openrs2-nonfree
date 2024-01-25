import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!am", name = "w", descriptor = "[I")
	public static int[] anIntArray40;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "[Lclient!laa;")
	public static final Class2_Sub12[] aClass2_Sub12Array1 = new Class2_Sub12[8];

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg5;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(20) int local20 = arg5 - arg0;
		@Pc(24) int local24 = arg2 * arg2;
		@Pc(28) int local28 = arg5 * arg5;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg5 << 1;
		@Pc(68) int local68 = local20 << 1;
		@Pc(76) int local76 = local40 + local24 * (1 - local56);
		@Pc(85) int local85 = local28 - local44 * (local56 - 1);
		@Pc(94) int local94 = local48 + local32 * (1 - local68);
		@Pc(102) int local102 = local36 - local52 * (local68 - 1);
		@Pc(106) int local106 = local24 << 2;
		@Pc(110) int local110 = local28 << 2;
		@Pc(114) int local114 = local32 << 2;
		@Pc(118) int local118 = local36 << 2;
		@Pc(122) int local122 = local40 * 3;
		@Pc(128) int local128 = local44 * (local56 - 3);
		@Pc(132) int local132 = local48 * 3;
		@Pc(138) int local138 = (local68 - 3) * local52;
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg5 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = local114 * (local20 - 1);
		@Pc(158) int[] local158 = Static349.anIntArrayArray71[arg3];
		Static188.method3208(arg6 - local15, arg4, arg6 - arg2, local158);
		Static188.method3208(local15 + arg6, arg1, arg6 - local15, local158);
		Static188.method3208(arg6 + arg2, arg4, local15 + arg6, local158);
		while (local9 > 0) {
			@Pc(200) boolean local200 = local9 <= local20;
			if (local76 < 0) {
				while (local76 < 0) {
					local85 += local140;
					local76 += local122;
					local122 += local110;
					local140 += local110;
					local7++;
				}
			}
			if (local200) {
				if (local94 < 0) {
					while (local94 < 0) {
						local102 += local148;
						local94 += local132;
						local132 += local118;
						local148 += local118;
						local11++;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local94 += local132;
					local132 += local118;
					local148 += local118;
					local11++;
				}
				local94 += -local154;
				local102 += -local138;
				local138 -= local114;
				local154 -= local114;
			}
			if (local85 < 0) {
				local85 += local140;
				local76 += local122;
				local140 += local110;
				local122 += local110;
				local7++;
			}
			local85 += -local128;
			local76 += -local146;
			local9--;
			local128 -= local106;
			local146 -= local106;
			@Pc(342) int local342 = arg3 - local9;
			@Pc(346) int local346 = local9 + arg3;
			@Pc(351) int local351 = arg6 + local7;
			@Pc(355) int local355 = arg6 - local7;
			if (local200) {
				@Pc(379) int local379 = local11 + arg6;
				@Pc(384) int local384 = arg6 - local11;
				Static188.method3208(local384, arg4, local355, Static349.anIntArrayArray71[local342]);
				Static188.method3208(local379, arg1, local384, Static349.anIntArrayArray71[local342]);
				Static188.method3208(local351, arg4, local379, Static349.anIntArrayArray71[local342]);
				Static188.method3208(local384, arg4, local355, Static349.anIntArrayArray71[local346]);
				Static188.method3208(local379, arg1, local384, Static349.anIntArrayArray71[local346]);
				Static188.method3208(local351, arg4, local379, Static349.anIntArrayArray71[local346]);
			} else {
				Static188.method3208(local351, arg4, local355, Static349.anIntArrayArray71[local342]);
				Static188.method3208(local351, arg4, local355, Static349.anIntArrayArray71[local346]);
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V")
	public static void method556() {
		if (!Static298.aBoolean398) {
			return;
		}
		while (true) {
			while (Static537.aClass362_Sub1Array1.length > Static385.anInt6641) {
				@Pc(29) Class362_Sub1 local29 = Static537.aClass362_Sub1Array1[Static385.anInt6641];
				if (local29 != null && local29.anInt10285 == -1) {
					if (Static531.aClass2_Sub47_2 == null) {
						Static531.aClass2_Sub47_2 = Static69.aClass329_1.method7528(local29.aString112);
					}
					@Pc(52) int local52 = Static531.aClass2_Sub47_2.anInt10143;
					if (local52 == -1) {
						return;
					}
					Static385.anInt6641++;
					local29.anInt10285 = local52;
					Static531.aClass2_Sub47_2 = null;
				} else {
					Static385.anInt6641++;
				}
			}
			return;
		}
	}
}
