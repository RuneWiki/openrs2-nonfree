import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public static volatile int anInt248 = 0;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public static int anInt252 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!ek;ILclient!ek;)V")
	public static void method229(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		Static4.aClass42_2 = arg0;
		Static98.aClass42_25 = arg1;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIII)V")
	public static void method230(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg2 * arg2;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg2 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(42) int local42 = local13 << 2;
		@Pc(51) int local51 = local17 - (local29 - 1) * local25;
		@Pc(55) int local55 = local17 << 2;
		@Pc(67) int local67 = ((arg2 << 1) - 3) * local25;
		@Pc(73) int local73 = local42 * (arg2 - 1);
		@Pc(79) int local79 = local55;
		@Pc(87) int local87 = local21 * 3;
		@Pc(106) int local106;
		@Pc(114) int local114;
		if (Static148.anInt3245 <= arg0 && Static166.anInt3675 >= arg0) {
			local106 = Static30.method572(Static53.anInt1319, arg4 + arg1, Static81.anInt1915);
			local114 = Static30.method572(Static53.anInt1319, arg4 - arg1, Static81.anInt1915);
			Static25.method486(Static275.anIntArrayArray37[arg0], local114, local106, arg3);
		}
		while (local9 > 0) {
			local9--;
			if (local38 < 0) {
				while (local38 < 0) {
					local51 += local79;
					local79 += local55;
					local38 += local87;
					local7++;
					local87 += local55;
				}
			}
			if (local51 < 0) {
				local51 += local79;
				local79 += local55;
				local38 += local87;
				local7++;
				local87 += local55;
			}
			local51 += -local67;
			local106 = arg0 - local9;
			local114 = arg0 + local9;
			local67 -= local42;
			if (local114 >= Static148.anInt3245 && Static166.anInt3675 >= local106) {
				@Pc(209) int local209 = Static30.method572(Static53.anInt1319, arg4 + local7, Static81.anInt1915);
				@Pc(217) int local217 = Static30.method572(Static53.anInt1319, arg4 - local7, Static81.anInt1915);
				if (local106 >= Static148.anInt3245) {
					Static25.method486(Static275.anIntArrayArray37[local106], local217, local209, arg3);
				}
				if (Static166.anInt3675 >= local114) {
					Static25.method486(Static275.anIntArrayArray37[local114], local217, local209, arg3);
				}
			}
			local38 += -local73;
			local73 -= local42;
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(IIIIII)V")
	public static void method231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static225.anInt5366 = arg4;
		Static274.anInt5440 = arg3;
		Static13.anInt262 = arg0;
		Static84.anInt1965 = arg2;
		Static59.anInt1482 = arg1;
		if (Static84.anInt1965 >= 100) {
			@Pc(32) int local32 = Static59.anInt1482 * 128 + 64;
			@Pc(38) int local38 = Static13.anInt262 * 128 + 64;
			@Pc(47) int local47 = Static234.method3798(local38, local32, Static32.anInt876) - Static274.anInt5440;
			@Pc(52) int local52 = local38 - Static192.anInt4017;
			@Pc(57) int local57 = local32 - Static80.anInt1911;
			@Pc(62) int local62 = local47 - Static162.anInt3612;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local52 * local52 + local57 * local57));
			Static295.anInt5738 = (int) (Math.atan2((double) local62, (double) local73) * 325.949D) & 0x7FF;
			Static151.anInt3328 = (int) (Math.atan2((double) local57, (double) local52) * -325.949D) & 0x7FF;
			if (Static295.anInt5738 < 128) {
				Static295.anInt5738 = 128;
			}
			if (Static295.anInt5738 > 383) {
				Static295.anInt5738 = 383;
			}
		}
		Static16.anInt342 = 2;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
	public static void method232(@OriginalArg(0) int arg0) {
		Static166.anInt3676 = -1;
		Static10.anInt171 = 3;
		Static225.anInt5333 = 100;
		Static122.anInt2705 = arg0;
	}
}
