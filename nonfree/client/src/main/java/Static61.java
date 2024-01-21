import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt1884 = 0;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1045 = Static15.method178("K");

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1043 = aClass23_1045;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1044 = Static15.method178("und haben es deaktiviert)3 Benutzen Sie die");

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1046 = aClass23_1045;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	public static int anInt1888 = -1;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1047 = Static15.method178("(X");

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1048 = Static15.method178("Regelversto-8 melden");

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	public static int anInt1890 = 0;

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1049 = Static15.method178("Name eingeben:");

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	public static int anInt1894 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V")
	public static void method1198() {
		aClass23_1048 = null;
		aClass23_1046 = null;
		aClass23_1049 = null;
		aByteArrayArrayArray3 = null;
		aClass23_1044 = null;
		aFrame1 = null;
		aClass23_1045 = null;
		aClass23_1047 = null;
		aClass23_1043 = null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	public static void method1199() {
		@Pc(1) Object local1 = Static62.anObject1;
		synchronized (Static62.anObject1) {
			if (Static12.anInt2429 == 0) {
				Static26.aClass54_2.method1495(5, new Class36());
			}
			Static12.anInt2429 = 600;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!rb;ILclient!rb;)V")
	public static void method1200(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1) {
		Static9.aClass55_3 = arg1;
		Static79.aClass55_34 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V")
	public static void method1201() {
		@Pc(7) int local7 = Static84.anInt2351;
		@Pc(9) int local9 = Static55.anInt1713;
		@Pc(11) int local11 = Static13.anInt238;
		@Pc(15) int local15 = Static55.anInt1715;
		Static24.method1578(local7, local9, local11, local15, 6116423);
		Static24.method1578(local7 + 1, local9 + 1, local11 - 2, 16, 0);
		Static24.method1582(local7 + 1, local9 - -18, local11 - 2, local15 - 19, 0);
		Static2.aClass1_Sub1_Sub6_Sub2_13.method836(Static100.aClass23_1463, local7 + 3, local9 + 14, 6116423);
		@Pc(59) int local59 = Static110.anInt2872;
		@Pc(66) int local66 = Static32.anInt1007;
		if (Static96.anInt1798 == 0) {
			local66 -= 4;
			local59 -= 4;
		}
		if (Static96.anInt1798 == 1) {
			local59 -= 205;
			local66 -= 553;
		}
		if (Static96.anInt1798 == 2) {
			local59 -= 357;
			local66 -= 17;
		}
		for (@Pc(84) int local84 = 0; local84 < Static40.anInt1400; local84++) {
			@Pc(99) int local99 = local9 + (Static40.anInt1400 - local84 + -1) * 15 + 31;
			@Pc(101) int local101 = 16777215;
			if (local7 < local66 && local11 + local7 > local66 && local99 - 13 < local59 && local59 < local99 + 3) {
				local101 = 16776960;
			}
			Static2.aClass1_Sub1_Sub6_Sub2_13.method841(Static109.aClass23Array18[local84], local7 + 3, local99, local101, true);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method1202() {
		if (Static36.anInt1284 != 0 || Static72.aClass1_Sub1_Sub7_5 != null) {
			return;
		}
		@Pc(13) int local13 = Static65.anInt1963;
		if (Static94.anInt2487 == 1 && Static111.anInt2890 >= 516 && Static74.anInt1803 >= 160 && Static111.anInt2890 <= 765 && Static74.anInt1803 <= 205) {
			local13 = 0;
		}
		@Pc(49) int local49;
		@Pc(47) int local47;
		@Pc(124) int local124;
		if (!Static74.aBoolean90) {
			if (local13 == 1 && Static40.anInt1400 > 0) {
				local49 = Static34.anIntArray142[Static40.anInt1400 - 1];
				if (local49 == 19 || local49 == 30 || local49 == 24 || local49 == 33 || local49 == 17 || local49 == 54 || local49 == 20 || local49 == 26 || local49 == 8 || local49 == 5 || local49 == 25 || local49 == 1006) {
					local47 = Static90.anIntArray327[Static40.anInt1400 - 1];
					local124 = Static18.anIntArray66[Static40.anInt1400 - 1];
					@Pc(300) Class1_Sub1_Sub7 local300 = Static15.method174(local124);
					if (local300.aBoolean47 || local300.aBoolean51) {
						Static97.anInt2529 = Static74.anInt1803;
						Static45.aBoolean75 = false;
						Static55.anInt1717 = local47;
						Static51.anInt1624 = local124;
						Static76.anInt2084 = Static111.anInt2890;
						Static80.anInt2261 = 0;
						Static36.anInt1284 = 2;
						if (local124 >> 16 == Static109.anInt2824) {
							Static36.anInt1284 = 1;
						}
						if (local124 >> 16 == Static92.anInt2913) {
							Static36.anInt1284 = 3;
						}
						return;
					}
				}
			}
			if (local13 == 1 && (Static104.anInt2687 == 1 || Static110.method1893(Static40.anInt1400 - 1)) && Static40.anInt1400 > 2) {
				local13 = 2;
			}
			if (local13 == 1 && Static40.anInt1400 > 0) {
				Static7.method94(Static40.anInt1400 - 1);
			}
			if (local13 != 2 || Static40.anInt1400 <= 0) {
				return;
			}
			Static106.method1794();
			return;
		}
		if (local13 != 1) {
			local47 = Static110.anInt2872;
			local49 = Static32.anInt1007;
			if (Static96.anInt1798 == 0) {
				local49 -= 4;
				local47 -= 4;
			}
			if (Static96.anInt1798 == 1) {
				local49 -= 553;
				local47 -= 205;
			}
			if (Static96.anInt1798 == 2) {
				local49 -= 17;
				local47 -= 357;
			}
			if (Static84.anInt2351 - 10 > local49 || Static13.anInt238 + Static84.anInt2351 + 10 < local49 || Static55.anInt1713 - 10 > local47 || local47 > Static55.anInt1715 + Static55.anInt1713 + 10) {
				if (Static96.anInt1798 == 2) {
					Static102.aBoolean123 = true;
				}
				if (Static96.anInt1798 == 1) {
					Static34.aBoolean60 = true;
				}
				Static74.aBoolean90 = false;
			}
		}
		if (local13 != 1) {
			return;
		}
		local49 = Static84.anInt2351;
		local47 = Static55.anInt1713;
		local124 = Static13.anInt238;
		@Pc(126) int local126 = Static111.anInt2890;
		@Pc(128) int local128 = Static74.anInt1803;
		if (Static96.anInt1798 == 0) {
			local126 -= 4;
			local128 -= 4;
		}
		if (Static96.anInt1798 == 1) {
			local126 -= 553;
			local128 -= 205;
		}
		@Pc(142) int local142 = -1;
		if (Static96.anInt1798 == 2) {
			local126 -= 17;
			local128 -= 357;
		}
		for (@Pc(151) int local151 = 0; local151 < Static40.anInt1400; local151++) {
			@Pc(167) int local167 = local47 + (-local151 + Static40.anInt1400 + -1) * 15 + 31;
			if (local49 < local126 && local124 + local49 > local126 && local167 - 13 < local128 && local128 < local167 + 3) {
				local142 = local151;
			}
		}
		if (local142 != -1) {
			Static7.method94(local142);
		}
		Static74.aBoolean90 = false;
		if (Static96.anInt1798 == 1) {
			Static34.aBoolean60 = true;
		}
		if (Static96.anInt1798 == 2) {
			Static102.aBoolean123 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V")
	public static void method1203(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < Static8.anInt186; local10++) {
			if (Static88.aLongArray16[local10] == arg0) {
				Static8.anInt186--;
				Static34.aBoolean60 = true;
				for (@Pc(29) int local29 = local10; local29 < Static8.anInt186; local29++) {
					Static8.aClass23Array4[local29] = Static8.aClass23Array4[local29 + 1];
					Static63.anIntArray223[local29] = Static63.anIntArray223[local29 + 1];
					Static88.aLongArray16[local29] = Static88.aLongArray16[local29 + 1];
				}
				Static76.aClass1_Sub5_Sub1_2.method731(230);
				Static76.aClass1_Sub5_Sub1_2.method711(arg0);
				break;
			}
		}
	}
}
