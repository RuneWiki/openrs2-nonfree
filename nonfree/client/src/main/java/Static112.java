import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ud", name = "pb", descriptor = "I")
	public static int anInt3084 = -1;

	@OriginalMember(owner = "client!ud", name = "tb", descriptor = "I")
	public static int anInt3088 = 0;

	@OriginalMember(owner = "client!ud", name = "ub", descriptor = "[I")
	public static int[] anIntArray355 = new int[2048];

	@OriginalMember(owner = "client!ud", name = "wb", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!ud", name = "yb", descriptor = "I")
	public static int anInt3092 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!l;IBI)V")
	public static void method2066(@OriginalArg(0) Class6_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) int local13 = Static109.anInt3032 + Static84.anInt2420 & 0x7FF;
		@Pc(22) int local22 = arg1 * arg1 + arg2 * arg2;
		if (local22 > 6400) {
			return;
		}
		@Pc(30) int local30 = Class6_Sub3_Sub3_Sub4.anIntArray343[local13];
		@Pc(38) int local38 = local30 * 256 / (Static11.anInt1914 + 256);
		@Pc(42) int local42 = Class6_Sub3_Sub3_Sub4.anIntArray342[local13];
		@Pc(54) int local54 = local42 * 256 / (Static11.anInt1914 + 256);
		@Pc(64) int local64 = arg2 * local38 + arg1 * local54 >> 16;
		@Pc(75) int local75 = arg2 * local54 - local38 * arg1 >> 16;
		if (local22 > 2500) {
			arg0.method1248(Static100.aClass6_Sub3_Sub3_Sub3_24, local64 + 94 + 4 - arg0.anInt1891 / 2, 83 - (local75 - (-(arg0.anInt1890 / 2) - 4)));
		} else {
			arg0.method1252(local64 + 94 + 4 - arg0.anInt1891 / 2, -(arg0.anInt1890 / 2) + -local75 + 83 - 4);
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
	public static void method2067() {
		anIntArray355 = null;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
	public static void method2068() {
		if (Static38.anInt1235 != 0) {
			return;
		}
		Static18.anInt569 = 1;
		Static31.aClass63Array7[0] = Static67.aClass63_997;
		Static69.anIntArray225[0] = 1001;
		if (Static14.anInt480 != -1) {
			Static96.anInt2708 = -1;
			Static85.anInt2835 = -1;
			Static94.method1705(0, Static14.anInt480, Static59.anInt1768, Static102.anInt2823, 0, 503, 0, 765);
			Static81.anInt2220 = Static85.anInt2835;
			Static2.anInt31 = Static96.anInt2708;
			return;
		}
		Static82.method1501();
		@Pc(47) boolean local47 = false;
		Static85.anInt2835 = -1;
		Static96.anInt2708 = -1;
		if (Static102.anInt2823 > 4 && Static59.anInt1768 > 4 && Static102.anInt2823 < 516 && Static59.anInt1768 < 338) {
			if (Static102.anInt2833 == -1) {
				Static110.method2040();
			} else {
				Static94.method1705(0, Static102.anInt2833, Static59.anInt1768, Static102.anInt2823, 4, 338, 4, 516);
			}
		}
		Static81.anInt2220 = Static85.anInt2835;
		Static2.anInt31 = Static96.anInt2708;
		Static85.anInt2835 = -1;
		Static96.anInt2708 = -1;
		if (Static102.anInt2823 > 553 && Static59.anInt1768 > 205 && Static102.anInt2823 < 743 && Static59.anInt1768 < 466) {
			if (Static25.anInt847 != -1) {
				Static94.method1705(1, Static25.anInt847, Static59.anInt1768, Static102.anInt2823, 553, 466, 205, 743);
			} else if (Static111.anIntArray352[Static86.anInt2366] != -1) {
				Static94.method1705(1, Static111.anIntArray352[Static86.anInt2366], Static59.anInt1768, Static102.anInt2823, 553, 466, 205, 743);
			}
		}
		if (Static21.anInt678 != Static96.anInt2708) {
			Static10.aBoolean20 = true;
			Static21.anInt678 = Static96.anInt2708;
		}
		if (Static103.anInt3207 != Static85.anInt2835) {
			Static10.aBoolean20 = true;
			Static103.anInt3207 = Static85.anInt2835;
		}
		Static85.anInt2835 = -1;
		Static96.anInt2708 = -1;
		if (Static102.anInt2823 > 17 && Static59.anInt1768 > 357 && Static102.anInt2823 < 496 && Static59.anInt1768 < 453) {
			if (Static49.anInt1513 != -1) {
				Static94.method1705(2, Static49.anInt1513, Static59.anInt1768, Static102.anInt2823, 17, 453, 357, 496);
			} else if (Static79.anInt2158 != -1) {
				Static94.method1705(3, Static79.anInt2158, Static59.anInt1768, Static102.anInt2823, 17, 453, 357, 496);
			} else if (Static59.anInt1768 < 434 && Static102.anInt2823 < 426) {
				Static116.method2111(Static102.anInt2823 - 17, Static59.anInt1768 + -357);
			}
		}
		if ((Static49.anInt1513 != -1 || Static79.anInt2158 != -1) && Static65.anInt1838 != Static96.anInt2708) {
			Static65.anInt1838 = Static96.anInt2708;
			Static15.aBoolean29 = true;
		}
		if ((Static49.anInt1513 != -1 || Static79.anInt2158 != -1) && Static85.anInt2835 != Static30.anInt958) {
			Static30.anInt958 = Static85.anInt2835;
			Static15.aBoolean29 = true;
		}
		while (!local47) {
			local47 = true;
			for (@Pc(261) int local261 = 0; local261 < Static18.anInt569 - 1; local261++) {
				if (Static69.anIntArray225[local261] < 1000 && Static69.anIntArray225[local261 + 1] > 1000) {
					local47 = false;
					@Pc(285) Class63 local285 = Static31.aClass63Array7[local261];
					Static31.aClass63Array7[local261] = Static31.aClass63Array7[local261 + 1];
					Static31.aClass63Array7[local261 + 1] = local285;
					@Pc(303) int local303 = Static69.anIntArray225[local261];
					Static69.anIntArray225[local261] = Static69.anIntArray225[local261 + 1];
					Static69.anIntArray225[local261 + 1] = local303;
					@Pc(321) int local321 = Static61.anIntArray193[local261];
					Static61.anIntArray193[local261] = Static61.anIntArray193[local261 + 1];
					Static61.anIntArray193[local261 + 1] = local321;
					@Pc(339) int local339 = Static124.anIntArray372[local261];
					Static124.anIntArray372[local261] = Static124.anIntArray372[local261 + 1];
					Static124.anIntArray372[local261 + 1] = local339;
					@Pc(357) int local357 = Static79.anIntArray243[local261];
					Static79.anIntArray243[local261] = Static79.anIntArray243[local261 + 1];
					Static79.anIntArray243[local261 + 1] = local357;
				}
			}
		}
	}
}
