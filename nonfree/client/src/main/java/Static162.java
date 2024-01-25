import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
	public static int anInt2730;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method2338(@OriginalArg(0) String arg0) {
		Static463.aString84 = arg0;
		if (Static7.anApplet1 == null) {
			return;
		}
		try {
			@Pc(25) String local25 = Static7.anApplet1.getParameter("cookieprefix");
			@Pc(29) String local29 = Static7.anApplet1.getParameter("cookiehost");
			@Pc(44) String local44 = local25 + "settings=" + arg0 + "; version=1; path=/; domain=" + local29;
			if (arg0.length() == 0) {
				local44 = local44 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local44 = local44 + "; Expires=" + Static219.method3767(Static95.method1587() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static653.method5176(Static7.anApplet1, "document.cookie=\"" + local44 + "\"");
		} catch (@Pc(95) Throwable local95) {
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2339(@OriginalArg(0) Class133 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static428.aBoolean526) {
			local7 = Static584.method8436();
			local9 = Static88.method1487();
		}
		@Pc(26) int local26 = Static346.anInt4654 + local7;
		@Pc(30) int local30 = local9 + Static612.anInt10212;
		@Pc(32) int local32 = Static115.anInt2157;
		@Pc(36) int local36 = Static644.anInt10625 - 3;
		Static38.method7898(Static612.anInt10212 + local9, Static644.anInt10625, Static174.aClass120_24.method2690(Static266.anInt4796), arg0, Static115.anInt2157, Static346.anInt4654 + local7);
		@Pc(68) int local68 = local7 + Static3.aClass3_3.method8875();
		@Pc(75) int local75 = Static3.aClass3_3.method8879() + local9;
		@Pc(79) int local79;
		@Pc(84) Class5_Sub5_Sub4 local84;
		@Pc(97) int local97;
		@Pc(200) int local200;
		@Pc(267) Class5_Sub5_Sub15 local267;
		@Pc(188) Class5_Sub5_Sub15 local188;
		if (Static266.aBoolean355) {
			local79 = 0;
			for (local84 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local84 != null; local84 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
				local97 = local79 * 16 + local30 + 13 + 20;
				local79++;
				if (local68 > local7 + Static346.anInt4654 && local68 < Static346.anInt4654 + local7 + Static115.anInt2157 && local75 > local97 - 13 && local97 + 4 > local75 && (local84.anInt2287 > 1 || ((Class5_Sub5_Sub15) local84.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66).aBoolean471)) {
					arg0.aa(Static346.anInt4654 + local7, local97 + -12, Static115.anInt2157, 16, 255 - Static508.anInt8816 << 24 | Static270.anInt4851, 1);
				}
			}
			if (Static281.aClass5_Sub5_Sub4_1 != null) {
				Static38.method7898(Static14.anInt240, Static239.anInt4414, Static281.aClass5_Sub5_Sub4_1.aString26, arg0, Static565.anInt9564, Static129.anInt2304);
				local79 = 0;
				for (local188 = (Class5_Sub5_Sub15) Static281.aClass5_Sub5_Sub4_1.aClass368_2.method8702(); local188 != null; local188 = (Class5_Sub5_Sub15) Static281.aClass5_Sub5_Sub4_1.aClass368_2.method8710()) {
					local200 = local79 * 16 + Static14.anInt240 + 20 + 13;
					local79++;
					if (Static129.anInt2304 < local68 && local68 < Static565.anInt9564 + Static129.anInt2304 && local75 > local200 - 13 && local75 < local200 + 4 && local188.aBoolean471) {
						arg0.aa(Static129.anInt2304, local200 - 12, Static565.anInt9564, 16, Static270.anInt4851 | 255 - Static508.anInt8816 << 24, 1);
					}
				}
				Static599.method8609(Static239.anInt4414, Static14.anInt240, Static565.anInt9564, Static129.anInt2304, arg0);
			}
		} else {
			local79 = 0;
			for (local267 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local267 != null; local267 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
				local97 = local30 + (Static491.anInt8293 - local79 - 1) * 16 + 13 + 20;
				local79++;
				if (local68 > local7 + Static346.anInt4654 && Static346.anInt4654 + local7 + Static115.anInt2157 > local68 && local97 - 13 < local75 && local97 + 4 > local75 && local267.aBoolean471) {
					arg0.aa(Static346.anInt4654 + local7, local97 + -12, Static115.anInt2157, 16, 255 - Static508.anInt8816 << 24 | Static270.anInt4851, 1);
				}
			}
		}
		Static599.method8609(Static644.anInt10625, local9 + Static612.anInt10212, Static115.anInt2157, Static346.anInt4654 + local7, arg0);
		if (Static266.aBoolean355) {
			local79 = 0;
			for (local84 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8702(); local84 != null; local84 = (Class5_Sub5_Sub4) Static601.aClass368_13.method8710()) {
				local97 = local79 * 16 + Static612.anInt10212 + local9 + 13 + 20;
				local79++;
				if (local84.anInt2287 == 1) {
					Static260.method4255(Static612.anInt10212 + local9, arg0, local97, local68, Static644.anInt10625, (Class5_Sub5_Sub15) local84.aClass368_2.aClass5_Sub5_64.aClass5_Sub5_66, local75, Static115.anInt2157, Static616.anInt10315 | 0xFF000000, Static346.anInt4654 + local7, Static387.anInt6410 | 0xFF000000);
				} else {
					Static554.method8071(Static616.anInt10315 | 0xFF000000, local68, local97, Static115.anInt2157, Static644.anInt10625, arg0, local75, Static346.anInt4654 + local7, Static612.anInt10212 - -local9, Static387.anInt6410 | 0xFF000000, local84);
				}
			}
			if (Static281.aClass5_Sub5_Sub4_1 != null) {
				local79 = 0;
				for (local188 = (Class5_Sub5_Sub15) Static281.aClass5_Sub5_Sub4_1.aClass368_2.method8702(); local188 != null; local188 = (Class5_Sub5_Sub15) Static281.aClass5_Sub5_Sub4_1.aClass368_2.method8710()) {
					local200 = local79 * 16 + Static14.anInt240 + 13 + 20;
					Static260.method4255(Static14.anInt240, arg0, local200, local68, Static239.anInt4414, local188, local75, Static565.anInt9564, Static616.anInt10315 | 0xFF000000, Static129.anInt2304, Static387.anInt6410 | 0xFF000000);
					local79++;
				}
				Static436.method6649(Static565.anInt9564, Static14.anInt240, Static239.anInt4414, Static129.anInt2304);
			}
		} else {
			local79 = 0;
			for (local267 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local267 != null; local267 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
				local97 = local30 + (-local79 + -1 + Static491.anInt8293) * 16 + 20 + 13;
				local79++;
				Static260.method4255(local30, arg0, local97, local68, local36, local267, local75, local32, Static616.anInt10315 | 0xFF000000, local26, Static387.anInt6410 | 0xFF000000);
			}
		}
		Static436.method6649(Static115.anInt2157, Static612.anInt10212 + local9, Static644.anInt10625, Static346.anInt4654 + local7);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!ei;)Ljava/lang/String;")
	public static String method2340(@OriginalArg(1) Class5_Sub5_Sub4 arg0) {
		return arg0.aString26 + " <col=ffffff>>";
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)Lclient!ul;")
	public static Class5_Sub1_Sub5 method2342() {
		return Static404.aClass5_Sub1_Sub5_2;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIII[BI[BI)V")
	public static void method2343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(22) int local22 = -arg7; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg3++;
				arg6[local30] += arg4[arg0++];
				@Pc(42) int local42 = arg3++;
				arg6[local42] += arg4[arg0++];
				@Pc(54) int local54 = arg3++;
				arg6[local54] += arg4[arg0++];
				@Pc(66) int local66 = arg3++;
				arg6[local66] += arg4[arg0++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local30 = arg3++;
				arg6[local30] += arg4[arg0++];
			}
			arg3 += arg2;
			arg0 += arg5;
		}
	}
}
