import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "Lclient!hc;")
	public static Class51 aClass51_13;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
	public static int anInt999 = 0;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString50 = "wave:";

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "Lclient!se;")
	public static Class122 aClass122_2 = null;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
	public static int anInt1009 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIII)V")
	public static void method659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg0 - arg1;
		@Pc(26) int local26 = arg4 - arg1;
		@Pc(30) int local30 = arg4 * arg4;
		@Pc(34) int local34 = arg0 * arg0;
		@Pc(38) int local38 = local26 * local26;
		@Pc(42) int local42 = local21 * local21;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = local21 << 1;
		@Pc(72) int local72 = (1 - local62) * local38 + local54;
		@Pc(76) int local76 = arg0 << 1;
		@Pc(84) int local84 = local42 - (local62 - 1) * local58;
		@Pc(93) int local93 = local34 - local50 * (local76 - 1);
		@Pc(97) int local97 = local34 << 2;
		@Pc(106) int local106 = (1 - local76) * local30 + local46;
		@Pc(110) int local110 = local30 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = (local76 - 3) * local50;
		@Pc(134) int local134 = local58 * (local62 - 3);
		@Pc(138) int local138 = local54 * 3;
		@Pc(140) int local140 = local97;
		@Pc(142) int local142 = local118;
		@Pc(148) int local148 = (arg0 - 1) * local110;
		@Pc(154) int local154 = local114 * (local21 - 1);
		@Pc(158) int[] local158 = Static29.anIntArrayArray10[arg5];
		Static147.method2681(local158, arg3, arg2 - arg4, -local26 + arg2);
		Static147.method2681(local158, arg6, arg2 - local26, local26 + arg2);
		Static147.method2681(local158, arg3, local26 + arg2, arg4 + arg2);
		while (local3 > 0) {
			if (local106 < 0) {
				while (local106 < 0) {
					local106 += local122;
					local122 += local97;
					local14++;
					local93 += local140;
					local140 += local97;
				}
			}
			if (local93 < 0) {
				local106 += local122;
				local122 += local97;
				local14++;
				local93 += local140;
				local140 += local97;
			}
			@Pc(248) boolean local248 = local21 >= local3;
			local93 += -local128;
			if (local248) {
				if (local72 < 0) {
					while (local72 < 0) {
						local16++;
						local72 += local138;
						local138 += local118;
						local84 += local142;
						local142 += local118;
					}
				}
				if (local84 < 0) {
					local84 += local142;
					local142 += local118;
					local72 += local138;
					local138 += local118;
					local16++;
				}
				local84 += -local134;
				local134 -= local114;
				local72 += -local154;
				local154 -= local114;
			}
			local106 += -local148;
			local148 -= local110;
			local3--;
			@Pc(338) int local338 = arg5 - local3;
			local128 -= local110;
			@Pc(346) int local346 = local14 + arg2;
			@Pc(351) int local351 = arg5 + local3;
			@Pc(356) int local356 = arg2 - local14;
			if (local248) {
				@Pc(362) int local362 = arg2 - local16;
				Static147.method2681(Static29.anIntArrayArray10[local338], arg3, local356, local362);
				@Pc(374) int local374 = local16 + arg2;
				Static147.method2681(Static29.anIntArrayArray10[local338], arg6, local362, local374);
				Static147.method2681(Static29.anIntArrayArray10[local338], arg3, local374, local346);
				Static147.method2681(Static29.anIntArrayArray10[local351], arg3, local356, local362);
				Static147.method2681(Static29.anIntArrayArray10[local351], arg6, local362, local374);
				Static147.method2681(Static29.anIntArrayArray10[local351], arg3, local374, local346);
			} else {
				Static147.method2681(Static29.anIntArrayArray10[local338], arg3, local356, local346);
				Static147.method2681(Static29.anIntArrayArray10[local351], arg3, local356, local346);
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)V")
	public static void method662(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub18 local13 = Static13.method232(arg0, 9);
		local13.method3805();
	}
}
