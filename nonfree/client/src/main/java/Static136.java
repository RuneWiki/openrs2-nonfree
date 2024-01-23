import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "[Lclient!bf;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!ak;")
	public static Class7 aClass7_119;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray10 = new boolean[5];

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method2152() {
		Static45.aClass31_8.method850();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method2153(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static185.anInt3457;
		@Pc(3) int local3 = Static182.anInt3398;
		@Pc(5) int local5 = Static77.anInt1548;
		@Pc(7) int local7 = Static68.anInt4743;
		@Pc(13) int local13 = Static56.anInt1177;
		@Pc(20) int local20 = (int) Static152.aFloat81;
		@Pc(27) int local27 = Static156.anInt1708 + (int) Static177.aFloat97 & 0x7FF;
		if (Static121.anInt2349 / 256 > local20) {
			local20 = Static121.anInt2349 / 256;
		}
		if (aBooleanArray10[4] && Static206.anIntArray470[4] + 128 > local20) {
			local20 = Static206.anIntArray470[4] + 128;
		}
		Static246.method2727(Static242.anInt4995, local20 * 3 + 600, local20, local27, Static124.method1919(Static159.anInt2978, Static28.aClass6_Sub6_Sub2_1.anInt4562, Static28.aClass6_Sub6_Sub2_1.anInt4569) - 50, arg0, Static139.anInt2614);
		if (Static182.anInt3398 == local3 && local1 == Static185.anInt3457 && Static68.anInt4743 == local7 && local5 == Static77.anInt1548 && local13 == Static56.anInt1177) {
			Static109.anInt2057 = 1;
			return;
		}
		Static72.anInt1430 = 10;
		Static156.anInt1710 = 10;
		Static54.anInt1154 = 10;
		if (local3 < Static182.anInt3398) {
			local3 += Static54.anInt1154 + Static72.anInt1430 * (Static182.anInt3398 - local3) / 1000;
			if (Static182.anInt3398 > local3) {
				Static182.anInt3398 = local3;
			}
		}
		if (Static182.anInt3398 < local3) {
			local3 -= Static54.anInt1154 + Static72.anInt1430 * (local3 - Static182.anInt3398) / 1000;
			if (Static182.anInt3398 < local3) {
				Static182.anInt3398 = local3;
			}
		}
		if (local1 < Static185.anInt3457) {
			local1 += Static54.anInt1154 + Static72.anInt1430 * (Static185.anInt3457 - local1) / 1000;
			if (Static185.anInt3457 > local1) {
				Static185.anInt3457 = local1;
			}
		}
		if (Static68.anInt4743 > local7) {
			local7 += (Static68.anInt4743 - local7) * Static72.anInt1430 / 1000 + Static54.anInt1154;
			if (Static68.anInt4743 > local7) {
				Static68.anInt4743 = local7;
			}
		}
		Static174.anInt3201 = 10;
		if (Static68.anInt4743 < local7) {
			local7 -= Static72.anInt1430 * (local7 - Static68.anInt4743) / 1000 + Static54.anInt1154;
			if (Static68.anInt4743 < local7) {
				Static68.anInt4743 = local7;
			}
		}
		if (local5 < Static77.anInt1548) {
			local5 += Static156.anInt1710 + (Static77.anInt1548 - local5) * Static174.anInt3201 / 1000;
			if (local5 < Static77.anInt1548) {
				Static77.anInt1548 = local5;
			}
		}
		if (local1 > Static185.anInt3457) {
			local1 -= Static54.anInt1154 + (local1 - Static185.anInt3457) * Static72.anInt1430 / 1000;
			if (local1 > Static185.anInt3457) {
				Static185.anInt3457 = local1;
			}
		}
		@Pc(289) int local289 = Static56.anInt1177 - local13;
		if (local289 > 1024) {
			local289 -= 2048;
		}
		if (local289 < -1024) {
			local289 += 2048;
		}
		if (local5 > Static77.anInt1548) {
			local5 -= (local5 - Static77.anInt1548) * Static174.anInt3201 / 1000 + Static156.anInt1710;
			if (Static77.anInt1548 < local5) {
				Static77.anInt1548 = local5;
			}
		}
		if (local289 > 0) {
			local13 += Static156.anInt1710 + local289 * Static174.anInt3201 / 1000;
			local13 &= 0x7FF;
		}
		if (local289 < 0) {
			local13 -= Static174.anInt3201 * -local289 / 1000 + Static156.anInt1710;
			local13 &= 0x7FF;
		}
		@Pc(367) int local367 = Static56.anInt1177 - local13;
		if (local367 > 1024) {
			local367 -= 2048;
		}
		if (local367 < -1024) {
			local367 += 2048;
		}
		if (local367 >= 0 || local289 <= 0 || local367 > 0 && local289 < 0) {
			Static56.anInt1177 = local13;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!og;I)V")
	public static void method2154(@OriginalArg(0) Class127 arg0) {
		@Pc(7) Class127 local7 = Static90.method3585(arg0);
		@Pc(15) int local15;
		@Pc(12) int local12;
		if (local7 == null) {
			local15 = Static145.anInt2690;
			local12 = Static166.anInt3046;
		} else {
			local12 = local7.anInt3595;
			local15 = local7.anInt3567;
		}
		Static120.method1891(false, local12, arg0, local15);
		Static282.method4508(local12, local15, arg0);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public static void method2156(@OriginalArg(1) int arg0) {
		Static33.anInt717 = arg0;
		Static274.anInt5464 = -1;
		Static274.anInt5464 = -1;
		Static125.method1921();
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(B)I")
	public static int method2157() {
		if (aFrame1 != null) {
			return 3;
		} else if (Static240.aBoolean369 && Static294.aBoolean444) {
			return 2;
		} else if (Static240.aBoolean369 && !Static294.aBoolean444) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)J")
	public static long method2158(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(28) char local28 = arg0.charAt(local17);
			local7 *= 37L;
			if (local28 >= 'A' && local28 <= 'Z') {
				local7 += local28 + 1 - 65;
			} else if (local28 >= 'a' && local28 <= 'z') {
				local7 += local28 + 1 - 97;
			} else if (local28 >= '0' && local28 <= '9') {
				local7 += local28 + 27 - 48;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}
}
