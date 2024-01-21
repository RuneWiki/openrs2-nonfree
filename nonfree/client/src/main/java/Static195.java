import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1737 = Static120.method1824("Connecting to update server");

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1734 = aClass80_1737;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1735 = Static120.method1824("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1736 = Static120.method1824("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1740 = Static120.method1824(" seconds)3");

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1738 = aClass80_1740;

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1739 = Static120.method1824("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
	public static void method3153(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub13 local10 = (Class3_Sub13) Static32.aClass70_26.method1953(); local10 != null; local10 = (Class3_Sub13) Static32.aClass70_26.method1948()) {
			if (local10.anInt1710 != -1 || local10.anIntArray212 != null) {
				@Pc(22) int local22 = 0;
				if (arg2 > local10.anInt1722) {
					local22 = arg2 - local10.anInt1722;
				} else if (local10.anInt1713 > arg2) {
					local22 = local10.anInt1713 - arg2;
				}
				if (arg3 > local10.anInt1708) {
					local22 += arg3 - local10.anInt1708;
				} else if (local10.anInt1715 > arg3) {
					local22 += local10.anInt1715 - arg3;
				}
				if (local10.anInt1709 < local22 - 64 || Static29.anInt739 == 0 || arg0 != local10.anInt1721) {
					if (local10.aClass3_Sub4_Sub4_2 != null) {
						Static152.aClass3_Sub4_Sub2_2.method1517(local10.aClass3_Sub4_Sub4_2);
						local10.aClass3_Sub4_Sub4_2 = null;
					}
					if (local10.aClass3_Sub4_Sub4_3 != null) {
						Static152.aClass3_Sub4_Sub2_2.method1517(local10.aClass3_Sub4_Sub4_3);
						local10.aClass3_Sub4_Sub4_3 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(134) int local134 = (local10.anInt1709 - local22) * Static29.anInt739 / local10.anInt1709;
					if (local10.aClass3_Sub4_Sub4_2 != null) {
						local10.aClass3_Sub4_Sub4_2.method1985(local134);
					} else if (local10.anInt1710 >= 0) {
						@Pc(146) Class75 local146 = Static203.method2080(Static67.aClass1_Sub1_10, local10.anInt1710, 0);
						if (local146 != null) {
							@Pc(153) Class3_Sub19_Sub1 local153 = local146.method2079().method1922(Static162.aClass15_1);
							@Pc(158) Class3_Sub4_Sub4 local158 = Static202.method2005(local153, local134);
							local158.method1994(-1);
							Static152.aClass3_Sub4_Sub2_2.method1516(local158);
							local10.aClass3_Sub4_Sub4_2 = local158;
						}
					}
					if (local10.aClass3_Sub4_Sub4_3 != null) {
						local10.aClass3_Sub4_Sub4_3.method1985(local134);
						if (!local10.aClass3_Sub4_Sub4_3.method3157()) {
							local10.aClass3_Sub4_Sub4_3 = null;
						}
					} else if (local10.anIntArray212 != null && (local10.anInt1716 -= arg1) <= 0) {
						@Pc(212) int local212 = (int) (Math.random() * (double) local10.anIntArray212.length);
						@Pc(220) Class75 local220 = Static203.method2080(Static67.aClass1_Sub1_10, local10.anIntArray212[local212], 0);
						if (local220 != null) {
							@Pc(227) Class3_Sub19_Sub1 local227 = local220.method2079().method1922(Static162.aClass15_1);
							@Pc(232) Class3_Sub4_Sub4 local232 = Static202.method2005(local227, local134);
							local232.method1994(0);
							Static152.aClass3_Sub4_Sub2_2.method1516(local232);
							local10.anInt1716 = (int) (Math.random() * (double) (local10.anInt1711 - local10.anInt1723)) + local10.anInt1723;
							local10.aClass3_Sub4_Sub4_3 = local232;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ILclient!qf;)Z")
	public static boolean method3154(@OriginalArg(1) Class77 arg0) {
		if (arg0.anIntArray423 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray423.length; local17++) {
			@Pc(24) int local24 = Static133.method2039(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray422[local17];
			if (arg0.anIntArray423[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray423[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray423[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local24 != local29) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = arg1;
		@Pc(16) int local16 = arg0 - arg2;
		@Pc(21) int local21 = arg1 - arg2;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = arg1 * arg1;
		@Pc(33) int local33 = local16 * local16;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local29 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = local33 << 1;
		@Pc(62) int local62 = local21 << 1;
		@Pc(66) int local66 = arg1 << 1;
		@Pc(75) int local75 = local41 + (1 - local66) * local25;
		@Pc(84) int local84 = local49 + (1 - local62) * local33;
		@Pc(93) int local93 = local37 - local53 * (local62 - 1);
		@Pc(97) int local97 = local25 << 2;
		@Pc(101) int local101 = local33 << 2;
		@Pc(105) int local105 = local37 << 2;
		@Pc(109) int local109 = local29 << 2;
		@Pc(113) int local113 = local41 * 3;
		@Pc(122) int local122 = local29 - (local66 - 1) * local45;
		@Pc(128) int local128 = local45 * (local66 - 3);
		@Pc(134) int local134 = local53 * (local62 - 3);
		@Pc(138) int local138 = local49 * 3;
		@Pc(140) int local140 = local109;
		@Pc(146) int local146 = local97 * (arg1 - 1);
		@Pc(148) int local148 = local105;
		@Pc(154) int local154 = (local21 - 1) * local101;
		@Pc(158) int[] local158 = Static96.anIntArrayArray27[arg5];
		Static46.method726(arg4 - arg0, arg3, local158, arg4 - local16);
		Static46.method726(arg4 - local16, arg6, local158, arg4 + local16);
		Static46.method726(local16 + arg4, arg3, local158, arg4 + arg0);
		while (local7 > 0) {
			if (local75 < 0) {
				while (local75 < 0) {
					local75 += local113;
					local113 += local109;
					local3++;
					local122 += local140;
					local140 += local109;
				}
			}
			if (local122 < 0) {
				local75 += local113;
				local113 += local109;
				local122 += local140;
				local140 += local109;
				local3++;
			}
			local75 += -local146;
			local122 += -local128;
			local146 -= local97;
			@Pc(267) boolean local267 = local21 >= local7;
			local7--;
			@Pc(273) int local273 = arg5 + local7;
			local128 -= local97;
			@Pc(282) int local282 = arg5 - local7;
			if (local267) {
				if (local84 < 0) {
					while (local84 < 0) {
						local84 += local138;
						local5++;
						local138 += local105;
						local93 += local148;
						local148 += local105;
					}
				}
				if (local93 < 0) {
					local93 += local148;
					local84 += local138;
					local5++;
					local148 += local105;
					local138 += local105;
				}
				local93 += -local134;
				local134 -= local101;
				local84 += -local154;
				local154 -= local101;
			}
			@Pc(354) int local354 = arg4 + local3;
			@Pc(359) int local359 = arg4 - local3;
			if (local267) {
				@Pc(383) int local383 = arg4 + local5;
				@Pc(388) int local388 = arg4 - local5;
				Static46.method726(local359, arg3, Static96.anIntArrayArray27[local282], local388);
				Static46.method726(local388, arg6, Static96.anIntArrayArray27[local282], local383);
				Static46.method726(local383, arg3, Static96.anIntArrayArray27[local282], local354);
				Static46.method726(local359, arg3, Static96.anIntArrayArray27[local273], local388);
				Static46.method726(local388, arg6, Static96.anIntArrayArray27[local273], local383);
				Static46.method726(local383, arg3, Static96.anIntArrayArray27[local273], local354);
			} else {
				Static46.method726(local359, arg3, Static96.anIntArrayArray27[local282], local354);
				Static46.method726(local359, arg3, Static96.anIntArrayArray27[local273], local354);
			}
		}
	}
}
