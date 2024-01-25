import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
	public static int anInt142;

	@OriginalMember(owner = "client!aha", name = "e", descriptor = "Lclient!rda;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIILclient!ha;)V")
	public static void method193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2) {
		Static654.aClass312ArrayArray1 = new Class312[arg0][arg1];
		Static90.aClass13_18 = arg2;
		if (Static272.anIntArray430 != null) {
			Static194.aClass35_1 = Static256.method3787(Static272.anIntArray430[0], Static272.anIntArray430[1], Static272.anIntArray430[3], Static272.anIntArray430[2], Static272.anIntArray430[5], Static272.anIntArray430[4]);
		}
		Static245.aClass312_1 = new Class312();
		Static264.method4357();
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIIIIII)V")
	public static void method194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static583.method8198(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg3;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static392.anIntArrayArray39[arg2];
		@Pc(45) int local45 = arg4 - local15;
		Static483.method7014(local40, arg4 - arg0, local45, arg1);
		@Pc(58) int local58 = local15 + arg4;
		Static483.method7014(local40, local45, local58, arg5);
		Static483.method7014(local40, local58, arg0 + arg4, arg1);
		while (local24 > local10) {
			local36 += 2;
			local34 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static636.anIntArray886[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(118) int[] local118;
			@Pc(125) int[] local125;
			@Pc(129) int local129;
			@Pc(134) int local134;
			@Pc(175) int local175;
			@Pc(179) int local179;
			@Pc(184) int local184;
			if (local27 >= 0) {
				local24--;
				if (local24 >= local15) {
					local118 = Static392.anIntArrayArray39[local24 + arg2];
					local125 = Static392.anIntArrayArray39[arg2 - local24];
					local129 = local10 + arg4;
					local134 = arg4 - local10;
					Static483.method7014(local118, local134, local129, arg1);
					Static483.method7014(local125, local134, local129, arg1);
				} else {
					local118 = Static392.anIntArrayArray39[local24 + arg2];
					local125 = Static392.anIntArrayArray39[arg2 - local24];
					local129 = Static636.anIntArray886[local24];
					local134 = arg4 + local10;
					local175 = arg4 - local10;
					local179 = local129 + arg4;
					local184 = arg4 - local129;
					Static483.method7014(local118, local175, local184, arg1);
					Static483.method7014(local118, local184, local179, arg5);
					Static483.method7014(local118, local179, local134, arg1);
					Static483.method7014(local125, local175, local184, arg1);
					Static483.method7014(local125, local184, local179, arg5);
					Static483.method7014(local125, local179, local134, arg1);
				}
				local27 -= local24 << 1;
			}
			local118 = Static392.anIntArrayArray39[local10 + arg2];
			local125 = Static392.anIntArrayArray39[arg2 - local10];
			local129 = local24 + arg4;
			local134 = arg4 - local24;
			if (local10 < local15) {
				local175 = local10 <= local29 ? local29 : Static636.anIntArray886[local10];
				local179 = local175 + arg4;
				local184 = arg4 - local175;
				Static483.method7014(local118, local134, local184, arg1);
				Static483.method7014(local118, local184, local179, arg5);
				Static483.method7014(local118, local179, local129, arg1);
				Static483.method7014(local125, local134, local184, arg1);
				Static483.method7014(local125, local184, local179, arg5);
				Static483.method7014(local125, local179, local129, arg1);
			} else {
				Static483.method7014(local118, local134, local129, arg1);
				Static483.method7014(local125, local134, local129, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method196(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static601.aClass346_35.method8440(Static609.anInt9834) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static601.aClass346_37.method8440(Static609.anInt9834) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(BI)Z")
	public static boolean method197(@OriginalArg(1) int arg0) {
		if (arg0 == 44 || arg0 == 3 || arg0 == 46 || arg0 == 48 || arg0 == 53) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!aha", name = "a", descriptor = "(IBI)V")
	public static void method198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static316.aClass13_10 == null) {
			return;
		}
		@Pc(17) int local17 = Static153.anInt3033;
		@Pc(19) int local19 = Static37.anInt839;
		Static508.method7196(arg0, arg1);
		if (Static76.anInt1404 == 0) {
			Static163.anInterface26_1 = null;
			Static163.anInterface26_1 = Static316.aClass13_10.method8529(Static316.aClass13_10.method8502(Static561.anInt9112, Static454.anInt5692), Static316.aClass13_10.method8509(Static561.anInt9112, Static454.anInt5692));
		} else if (Static76.anInt1404 == 1 && (Static534.anInterface26Array1 == null || local17 != Static153.anInt3033 || Static37.anInt839 != local19)) {
			Static534.anInterface26Array1 = new Interface26[Static37.anInt839 * Static153.anInt3033];
			for (@Pc(47) int local47 = 0; local47 < Static534.anInterface26Array1.length; local47++) {
				Static534.anInterface26Array1[local47] = Static316.aClass13_10.method8529(Static316.aClass13_10.method8502(Static336.anInt5533, Static9.anInt105), Static316.aClass13_10.method8509(Static336.anInt5533, Static9.anInt105));
			}
			Static9.anIntArray17 = new int[Static153.anInt3033 * Static37.anInt839];
			Static677.anInt10887 = 1;
		}
		Static27.aBoolean42 = true;
	}
}
