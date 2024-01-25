import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
	public static int anInt6045 = -1;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(III)Z")
	public static boolean method5068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V")
	public static void method5069() {
		if (Static391.method5585(Static177.anInt2101) || Static463.method6576(Static177.anInt2101)) {
			Static556.method5642(5000, Static216.anInt4203 >> 12, Static333.anInt5940 >> 12);
		} else {
			@Pc(18) int local18 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray437[0] >> 3;
			@Pc(25) int local25 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anIntArray436[0] >> 3;
			if (local18 >= 0 && Static500.anInt6888 >> 3 > local18 && local25 >= 0 && Static573.anInt9325 >> 3 > local25) {
				Static556.method5642(5000, local25, local18);
			} else {
				Static556.method5642(0, Static573.anInt9325 >> 4, Static500.anInt6888 >> 4);
			}
		}
		Static99.method1835();
		Static318.method4844();
		Static279.method4317();
		Static129.method2211();
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(BZ)V")
	public static void method5070(@OriginalArg(1) boolean arg0) {
		if (Static400.aClass75_3 != null) {
			Static400.aClass75_3.method1850();
			Static400.aClass75_3 = null;
		}
		Static316.anInt5682 = 0;
		Static181.method2770();
		Static122.method2098();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static28.aClass94Array2[local19].method2209();
		}
		Static370.method5403(false);
		System.gc();
		Static224.method3680();
		Static525.anInt8671 = -1;
		Static571.aBoolean680 = false;
		Static96.method1809(true);
		Static376.anInt6631 = 0;
		Static360.anInt6293 = 0;
		Static246.anInt8758 = 0;
		Static24.anInt674 = 0;
		Static102.anInt2115 = 0;
		Static442.anInt7704 = 0;
		for (@Pc(66) int local66 = 0; local66 < Static276.aClass221Array1.length; local66++) {
			Static276.aClass221Array1[local66] = null;
		}
		Static169.method2581();
		for (@Pc(81) int local81 = 0; local81 < 2048; local81++) {
			Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local81] = null;
		}
		Static480.anInt8097 = 0;
		Static131.aClass356_32.method7802();
		Static491.anInt1754 = 0;
		Static186.aClass356_13.method7802();
		Static87.method1723();
		Static199.anInt4026 = 0;
		Static121.aClass148_1.method3535();
		Static485.method6797();
		Static350.method5171();
		Static473.aLong357 = 0L;
		Static299.aClass1_Sub45_2 = null;
		if (arg0) {
			Static243.method3970(12);
			return;
		}
		Static243.method3970(3);
		try {
			Static602.method5582(Static412.anApplet1, "loggedout");
		} catch (@Pc(134) Throwable local134) {
		}
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIZ)V")
	public static void method5071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(23) int local23 = arg2 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(53) int local53 = local23 * (Static381.aShort68 - Static486.aShort87) / 100 + Static486.aShort87;
		if (local53 < Static375.aShort67) {
			local53 = Static375.aShort67;
		} else if (local53 > Static412.aShort69) {
			local53 = Static412.aShort69;
		}
		@Pc(79) int local79 = local53 * 512 * arg2 / (arg3 * 334);
		@Pc(113) int local113;
		@Pc(120) int local120;
		@Pc(84) short local84;
		if (local79 < Static495.aShort96) {
			local84 = Static495.aShort96;
			local53 = local84 * 334 * arg3 / (arg2 * 512);
			if (local53 > Static412.aShort69) {
				local53 = Static412.aShort69;
				local113 = local53 * 512 * arg2 / (local84 * 334);
				local120 = (arg3 - local113) / 2;
				if (arg4) {
					Static136.aClass12_8.JA();
					Static136.aClass12_8.method6418(arg2, arg1, arg0, local120, -16777216);
					Static136.aClass12_8.method6418(arg2, arg3 + arg1 - local120, arg0, local120, -16777216);
				}
				arg3 -= local120 * 2;
				arg1 += local120;
			}
		} else if (Static200.aShort43 < local79) {
			local84 = Static200.aShort43;
			local53 = local84 * arg3 * 334 / (arg2 * 512);
			if (Static375.aShort67 > local53) {
				local53 = Static375.aShort67;
				local113 = local84 * 334 * arg3 / (local53 * 512);
				local120 = (arg2 - local113) / 2;
				if (arg4) {
					Static136.aClass12_8.JA();
					Static136.aClass12_8.method6418(local120, arg1, arg0, arg3, -16777216);
					Static136.aClass12_8.method6418(local120, arg1, arg2 + arg0 - local120, arg3, -16777216);
				}
				arg0 += local120;
				arg2 -= local120 * 2;
			}
		}
		Static528.anInt8754 = arg1;
		Static99.anInt2071 = arg0;
		Static304.anInt5528 = (short) arg3;
		Static271.anInt5044 = (short) arg2;
		Static88.anInt1972 = local53 * arg2 / 334;
	}

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5072(@OriginalArg(0) String arg0) {
		Static74.aString17 = arg0;
		if (Static412.anApplet1 == null) {
			return;
		}
		try {
			@Pc(17) String local17 = Static412.anApplet1.getParameter("cookieprefix");
			@Pc(21) String local21 = Static412.anApplet1.getParameter("cookiehost");
			@Pc(36) String local36 = local17 + "settings=" + arg0 + "; version=1; path=/; domain=" + local21;
			if (arg0.length() == 0) {
				local36 = local36 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local36 = local36 + "; Expires=" + Static327.method4958(Static255.method4035() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static602.method5580(Static412.anApplet1, "document.cookie=\"" + local36 + "\"");
		} catch (@Pc(84) Throwable local84) {
		}
	}
}
