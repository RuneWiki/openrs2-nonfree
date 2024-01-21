import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray91;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar56 = Calendar.getInstance();

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	public static int anInt3198 = 0;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1750 = Static80.method1463("Please try using a different world)3");

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1751 = Static80.method1463("Enter name of friend to add to list");

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1752 = aClass63_1750;

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
	public static int anInt3199 = 0;

	@OriginalMember(owner = "client!kd", name = "q", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1753 = aClass63_1751;

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1754 = aClass63_1750;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1755 = aClass63_1750;

	@OriginalMember(owner = "client!kd", name = "A", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1758 = Static80.method1463("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1756 = aClass63_1758;

	@OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
	public static int anInt3203 = 0;

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1757 = Static80.method1463("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1759 = aClass63_1750;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1760 = aClass63_1757;

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1761 = aClass63_1750;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1762 = aClass63_1750;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
	public static int method2121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method2122() {
		aClass63_1760 = null;
		aClass63_1754 = null;
		aClass63_1758 = null;
		aClass63_1762 = null;
		aClass63_1752 = null;
		aByteArrayArrayArray91 = null;
		aClass63_1761 = null;
		aClass63_1753 = null;
		aClass63_1751 = null;
		aClass63_1756 = null;
		aCalendar56 = null;
		aClass63_1759 = null;
		aClass63_1750 = null;
		aClass63_1755 = null;
		aClass63_1757 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method2125() {
		if (Static38.anInt1235 != 0 || Static18.aClass6_Sub3_Sub17_2 != null) {
			return;
		}
		@Pc(16) int local16 = Static19.anInt642;
		if (Static42.aBoolean63 && Static59.anInt1765 >= 516 && Static61.anInt1804 >= 160 && Static59.anInt1765 <= 765 && Static61.anInt1804 <= 205) {
			local16 = 0;
		}
		@Pc(43) int local43;
		@Pc(45) int local45;
		@Pc(116) int local116;
		if (!Static12.aBoolean23) {
			if (local16 == 1 && Static18.anInt569 > 0) {
				local43 = Static69.anIntArray225[Static18.anInt569 - 1];
				if (local43 == 28 || local43 == 13 || local43 == 9 || local43 == 54 || local43 == 25 || local43 == 45 || local43 == 37 || local43 == 20 || local43 == 4 || local43 == 33 || local43 == 55 || local43 == 1005) {
					local45 = Static61.anIntArray193[Static18.anInt569 - 1];
					local116 = Static124.anIntArray372[Static18.anInt569 - 1];
					@Pc(279) Class6_Sub3_Sub17 local279 = Static12.method339(local116);
					if (Static11.method1309(Static82.method1498(local279)) || Static105.method1900(Static82.method1498(local279))) {
						Static42.anInt1320 = Static61.anInt1804;
						Static38.anInt1235 = 2;
						Static19.anInt631 = 0;
						Static77.anInt2143 = Static59.anInt1765;
						Static36.anInt1216 = local45;
						Static7.aBoolean9 = false;
						Static24.anInt817 = local116;
						if (local116 >> 16 == Static102.anInt2833) {
							Static38.anInt1235 = 1;
						}
						if (local116 >> 16 == Static49.anInt1513) {
							Static38.anInt1235 = 3;
						}
						return;
					}
				}
			}
			if (local16 == 1 && (Static39.anInt1244 == 1 || Static53.method2061(Static18.anInt569 - 1)) && Static18.anInt569 > 2) {
				local16 = 2;
			}
			if (local16 == 1 && Static18.anInt569 > 0) {
				Static37.method874(Static18.anInt569 - 1);
			}
			if (local16 == 2 && Static18.anInt569 > 0) {
				Static10.method267();
			}
			return;
		}
		if (local16 != 1) {
			local43 = Static102.anInt2823;
			local45 = Static59.anInt1768;
			if (Static19.anInt634 == 0) {
				local43 -= 4;
				local45 -= 4;
			}
			if (Static19.anInt634 == 1) {
				local43 -= 553;
				local45 -= 205;
			}
			if (Static19.anInt634 == 2) {
				local43 -= 17;
				local45 -= 357;
			}
			if (Static115.anInt3132 - 10 > local43 || local43 > Static115.anInt3132 + Static71.anInt2035 + 10 || local45 < Static40.anInt2113 - 10 || Static40.anInt2113 + Static90.anInt2542 + 10 < local45) {
				if (Static19.anInt634 == 2) {
					Static15.aBoolean29 = true;
				}
				if (Static19.anInt634 == 1) {
					Static10.aBoolean20 = true;
				}
				Static12.aBoolean23 = false;
			}
		}
		if (local16 != 1) {
			return;
		}
		local43 = Static115.anInt3132;
		local45 = Static40.anInt2113;
		local116 = Static71.anInt2035;
		@Pc(118) int local118 = Static59.anInt1765;
		@Pc(120) int local120 = Static61.anInt1804;
		if (Static19.anInt634 == 0) {
			local120 -= 4;
			local118 -= 4;
		}
		if (Static19.anInt634 == 1) {
			local118 -= 553;
			local120 -= 205;
		}
		@Pc(131) int local131 = -1;
		if (Static19.anInt634 == 2) {
			local118 -= 17;
			local120 -= 357;
		}
		for (@Pc(138) int local138 = 0; local138 < Static18.anInt569; local138++) {
			@Pc(153) int local153 = (Static18.anInt569 - local138 - 1) * 15 + local45 + 31;
			if (local118 > local43 && local118 < local116 + local43 && local120 > local153 - 13 && local153 + 3 > local120) {
				local131 = local138;
			}
		}
		if (local131 != -1) {
			Static37.method874(local131);
		}
		Static12.aBoolean23 = false;
		if (Static19.anInt634 == 1) {
			Static10.aBoolean20 = true;
		}
		if (Static19.anInt634 == 2) {
			Static15.aBoolean29 = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!kf;)V")
	public static void method2126(@OriginalArg(1) Class6_Sub6 arg0) {
		arg0.aBoolean157 = false;
		if (arg0.aClass6_Sub11_5 != null) {
			arg0.aClass6_Sub11_5.anInt2864 = 0;
		}
		for (@Pc(18) Class6_Sub6 local18 = arg0.method1913(); local18 != null; local18 = arg0.method1918()) {
			method2126(local18);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method2127() {
		@Pc(7) Class65 local7 = Static65.aClass65_1;
		synchronized (Static65.aClass65_1) {
			Static98.anInt2755 = anInt3199;
			@Pc(23) int local23;
			if (Static44.anInt1399 < 0) {
				for (local23 = 0; local23 < 112; local23++) {
					Static44.aBooleanArray8[local23] = false;
				}
				Static44.anInt1399 = Static13.anInt430;
			} else {
				while (Static13.anInt430 != Static44.anInt1399) {
					local23 = Static37.anIntArray139[Static13.anInt430];
					Static13.anInt430 = Static13.anInt430 + 1 & 0x7F;
					if (local23 < 0) {
						Static44.aBooleanArray8[~local23] = false;
					} else {
						Static44.aBooleanArray8[local23] = true;
					}
				}
			}
			anInt3199 = Static35.anInt1174;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!ge;ILclient!ge;Lclient!ge;)V")
	public static void method2128(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class7 arg2) {
		Static78.aClass7_45 = arg0;
		Static115.aClass7_58 = arg2;
		Static75.aClass7_43 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	public static void method2129(@OriginalArg(0) int arg0) {
		Static29.method708();
		@Pc(17) int local17 = Static76.method1437(arg0).anInt2901;
		if (local17 == 0) {
			return;
		}
		@Pc(27) int local27 = Static89.anIntArray283[arg0];
		if (local17 == 1) {
			if (local27 == 1) {
				Static107.method1997(0.9D);
				((Class72) Static107.anInterface1_1).method2073(0.9D);
			}
			if (local27 == 2) {
				Static107.method1997(0.8D);
				((Class72) Static107.anInterface1_1).method2073(0.8D);
			}
			if (local27 == 3) {
				Static107.method1997(0.7D);
				((Class72) Static107.anInterface1_1).method2073(0.7D);
			}
			if (local27 == 4) {
				Static107.method1997(0.6D);
				((Class72) Static107.anInterface1_1).method2073(0.6D);
			}
			Static100.method1840();
			Static92.aBoolean135 = true;
		}
		if (local17 == 3) {
			@Pc(87) short local87 = 0;
			if (local27 == 0) {
				local87 = 255;
			}
			if (local27 == 1) {
				local87 = 192;
			}
			if (local27 == 2) {
				local87 = 128;
			}
			if (local27 == 3) {
				local87 = 64;
			}
			if (local27 == 4) {
				local87 = 0;
			}
			if (Static13.anInt433 != local87) {
				if (Static13.anInt433 == 0 && Static56.anInt1714 != -1) {
					Static47.method1028(Static64.aClass7_Sub1_10, Static56.anInt1714, 0, local87);
					Static64.aBoolean100 = false;
				} else if (local87 == 0) {
					Static118.method2115();
					Static64.aBoolean100 = false;
				} else {
					Static10.method269(local87);
				}
				Static13.anInt433 = local87;
			}
		}
		if (local17 == 9) {
			Static2.anInt27 = local27;
		}
		if (local17 == 5) {
			Static39.anInt1244 = local27;
		}
		if (local17 == 4) {
			if (local27 == 0) {
				Static65.anInt1846 = 127;
			}
			if (local27 == 1) {
				Static65.anInt1846 = 96;
			}
			if (local27 == 2) {
				Static65.anInt1846 = 64;
			}
			if (local27 == 3) {
				Static65.anInt1846 = 32;
			}
			if (local27 == 4) {
				Static65.anInt1846 = 0;
			}
		}
		if (local17 == 10) {
			if (local27 == 0) {
				Static56.anInt1713 = 127;
			}
			if (local27 == 1) {
				Static56.anInt1713 = 96;
			}
			if (local27 == 2) {
				Static56.anInt1713 = 64;
			}
			if (local27 == 3) {
				Static56.anInt1713 = 32;
			}
			if (local27 == 4) {
				Static56.anInt1713 = 0;
			}
		}
		if (local17 == 6) {
			Static51.anInt1579 = local27;
		}
		if (local17 == 8) {
			Static79.anInt2162 = local27;
			Static15.aBoolean29 = true;
		}
	}
}
