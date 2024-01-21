import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!ab;")
	public static Class3 aClass3_36;

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt4246;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lclient!ab;")
	public static Class3 aClass3_37;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
	public static int anInt4258;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
	public static int anInt4260;

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1983 = Static187.method3089("Malformed login packet)3");

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1984 = aClass92_1983;

	@OriginalMember(owner = "client!vd", name = "eb", descriptor = "I")
	public static int anInt4281 = 0;

	@OriginalMember(owner = "client!vd", name = "gb", descriptor = "J")
	public static long aLong230 = 0L;

	@OriginalMember(owner = "client!vd", name = "ib", descriptor = "I")
	public static int anInt4284 = 0;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z")
	public static boolean method3212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static38.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == -Static71.anInt1617) {
			return false;
		} else if (local7 == Static71.anInt1617) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static169.method2639(local22 + 1, Static73.anIntArrayArrayArray3[arg0][arg1][arg2], local26 + 1) && Static169.method2639(local22 + 128 - 1, Static73.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local26 + 1) && Static169.method2639(local22 + 128 - 1, Static73.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local26 + 128 - 1) && Static169.method2639(local22 + 1, Static73.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local26 + 128 - 1)) {
				Static38.anIntArrayArrayArray2[arg0][arg1][arg2] = Static71.anInt1617;
				return true;
			} else {
				Static38.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static71.anInt1617;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)I")
	public static int method3214() {
		return Static165.anInt3435;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIB)V")
	public static void method3216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static74.method1123(arg3 - arg2, arg1, Static142.anIntArrayArray25[arg0], arg3 + arg2);
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg2;
		@Pc(24) int local24 = -1;
		@Pc(27) int local27 = -arg2;
		while (local22 > local20) {
			local24 += 2;
			local27 += local24;
			local20++;
			if (local27 >= 0) {
				@Pc(52) int local52 = local20 + arg3;
				local22--;
				@Pc(59) int[] local59 = Static142.anIntArrayArray25[arg0 - local22];
				local27 -= local22 << 1;
				@Pc(70) int local70 = arg3 - local20;
				@Pc(77) int[] local77 = Static142.anIntArrayArray25[arg0 + local22];
				Static74.method1123(local70, arg1, local77, local52);
				Static74.method1123(local70, arg1, local59, local52);
			}
			@Pc(93) int local93 = local22 + arg3;
			@Pc(98) int local98 = arg3 - local22;
			@Pc(104) int[] local104 = Static142.anIntArrayArray25[arg0 + local20];
			@Pc(111) int[] local111 = Static142.anIntArrayArray25[arg0 - local20];
			Static74.method1123(local98, arg1, local104, local93);
			Static74.method1123(local98, arg1, local111, local93);
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIB)V")
	public static void method3226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(12) int local12 = 0; local12 < Static89.anInt1911; local12++) {
			if (arg0 < Static111.anIntArray182[local12] + Static189.anIntArray331[local12] && arg3 + arg0 > Static111.anIntArray182[local12] && arg2 < Static110.anIntArray176[local12] + Static49.anIntArray90[local12] && arg2 + arg1 > Static49.anIntArray90[local12]) {
				Static143.aBooleanArray13[local12] = true;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(III)V")
	public static void method3236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1_Sub3_Sub7 local7 = Static71.method1102(arg1);
		@Pc(10) int local10 = local7.anInt1614;
		@Pc(19) int local19 = local7.anInt1609;
		@Pc(22) int local22 = local7.anInt1613;
		@Pc(29) int local29 = Class62.anIntArray198[local22 - local19];
		if (arg0 < 0 || local29 < arg0) {
			arg0 = 0;
		}
		local29 <<= local19;
		Static84.anIntArray156[local10] = Static84.anIntArray156[local10] & ~local29 | local29 & arg0 << local19;
	}
}
