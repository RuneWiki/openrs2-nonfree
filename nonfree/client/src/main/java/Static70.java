import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
	public static int anInt1623;

	@OriginalMember(owner = "client!gj", name = "W", descriptor = "I")
	public static int anInt1624;

	@OriginalMember(owner = "client!gj", name = "ab", descriptor = "Lclient!ia;")
	private static Class51 aClass51_545 = Static64.method1101("white:");

	@OriginalMember(owner = "client!gj", name = "R", descriptor = "Lclient!ia;")
	public static Class51 aClass51_541 = aClass51_545;

	@OriginalMember(owner = "client!gj", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_542 = Static64.method1101(":duelstake:");

	@OriginalMember(owner = "client!gj", name = "U", descriptor = "Lclient!ia;")
	public static Class51 aClass51_543 = aClass51_545;

	@OriginalMember(owner = "client!gj", name = "X", descriptor = "Lclient!ia;")
	public static Class51 aClass51_544 = Static64.method1101(" loggt sich aus)3");

	@OriginalMember(owner = "client!gj", name = "db", descriptor = "Lclient!ia;")
	public static Class51 aClass51_546 = Static64.method1101("::qa_op_test");

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "(B)V")
	public static void method1252() {
		Static213.anInt4561 = 0;
		@Pc(12) int local12 = Static118.anInt2541 + (Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7);
		@Pc(19) int local19 = Static198.anInt4217 + (Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7);
		if (local19 >= 3053 && local19 <= 3156 && local12 >= 3056 && local12 <= 3136) {
			Static213.anInt4561 = 1;
		}
		if (local19 >= 3072 && local19 <= 3118 && local12 >= 9492 && local12 <= 9535) {
			Static213.anInt4561 = 1;
		}
		if (Static213.anInt4561 == 1 && local19 >= 3139 && local19 <= 3199 && local12 >= 3008 && local12 <= 3062) {
			Static213.anInt4561 = 0;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method1254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg5 - arg4;
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg0 - arg4;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(32) int local32 = local13 * local13;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local20 * local20;
		@Pc(48) int local48 = local24 << 1;
		@Pc(52) int local52 = local44 << 1;
		@Pc(56) int local56 = local32 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(64) int local64 = arg0 << 1;
		@Pc(73) int local73 = (1 - local64) * local24 + local40;
		@Pc(82) int local82 = local52 + (1 - local60) * local32;
		@Pc(91) int local91 = local28 - (local64 - 1) * local48;
		@Pc(100) int local100 = local44 - (local60 - 1) * local56;
		@Pc(104) int local104 = local28 << 2;
		@Pc(108) int local108 = local44 << 2;
		@Pc(112) int local112 = local32 << 2;
		@Pc(118) int local118 = local48 * (local64 - 3);
		@Pc(122) int local122 = local24 << 2;
		@Pc(126) int local126 = local52 * 3;
		@Pc(130) int local130 = local40 * 3;
		@Pc(136) int local136 = local56 * (local60 - 3);
		@Pc(138) int local138 = local104;
		@Pc(144) int local144 = (local20 - 1) * local112;
		@Pc(148) int[] local148 = Static113.anIntArrayArray10[arg3];
		Static71.method1261(local148, arg1 - arg5, arg2, arg1 - local13);
		Static71.method1261(local148, arg1 - local13, arg6, local13 + arg1);
		Static71.method1261(local148, arg1 + local13, arg2, arg1 + arg5);
		@Pc(187) int local187 = local122 * (arg0 - 1);
		@Pc(189) int local189 = local108;
		while (local9 > 0) {
			@Pc(198) boolean local198 = local20 >= local9;
			if (local73 < 0) {
				while (local73 < 0) {
					local7++;
					local73 += local130;
					local91 += local138;
					local138 += local104;
					local130 += local104;
				}
			}
			if (local91 < 0) {
				local7++;
				local73 += local130;
				local130 += local104;
				local91 += local138;
				local138 += local104;
			}
			local9--;
			local73 += -local187;
			local91 += -local118;
			local187 -= local122;
			@Pc(263) int local263 = arg1 + local7;
			@Pc(267) int local267 = arg1 - local7;
			if (local198) {
				if (local82 < 0) {
					while (local82 < 0) {
						local15++;
						local82 += local126;
						local126 += local108;
						local100 += local189;
						local189 += local108;
					}
				}
				if (local100 < 0) {
					local15++;
					local100 += local189;
					local189 += local108;
					local82 += local126;
					local126 += local108;
				}
				local82 += -local144;
				local100 += -local136;
				local136 -= local112;
				local144 -= local112;
			}
			@Pc(339) int local339 = local9 + arg3;
			local118 -= local122;
			@Pc(348) int local348 = arg3 - local9;
			if (local198) {
				@Pc(354) int local354 = arg1 - local15;
				@Pc(359) int local359 = arg1 + local15;
				Static71.method1261(Static113.anIntArrayArray10[local348], local267, arg2, local354);
				Static71.method1261(Static113.anIntArrayArray10[local348], local354, arg6, local359);
				Static71.method1261(Static113.anIntArrayArray10[local348], local359, arg2, local263);
				Static71.method1261(Static113.anIntArrayArray10[local339], local267, arg2, local354);
				Static71.method1261(Static113.anIntArrayArray10[local339], local354, arg6, local359);
				Static71.method1261(Static113.anIntArrayArray10[local339], local359, arg2, local263);
			} else {
				Static71.method1261(Static113.anIntArrayArray10[local348], local267, arg2, local263);
				Static71.method1261(Static113.anIntArrayArray10[local339], local267, arg2, local263);
			}
		}
	}
}
