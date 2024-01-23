import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!th", name = "nc", descriptor = "Lclient!ol;")
	public static Class130 aClass130_5;

	@OriginalMember(owner = "client!th", name = "sc", descriptor = "I")
	public static int anInt5384 = 0;

	@OriginalMember(owner = "client!th", name = "Wc", descriptor = "[I")
	public static int[] anIntArray520 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
	public static void method4300() {
		Static89.aClass157_19.method4027();
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	public static void method4304(@OriginalArg(1) int arg0) {
		@Pc(1) int local1 = Static192.anInt4017;
		@Pc(3) int local3 = Static162.anInt3612;
		@Pc(9) int local9 = Static80.anInt1911;
		@Pc(11) int local11 = Static151.anInt3328;
		@Pc(14) int local14 = (int) Static148.aFloat33;
		if (local14 < Static269.anInt5284 / 256) {
			local14 = Static269.anInt5284 / 256;
		}
		@Pc(30) int local30 = Static295.anInt5738;
		if (Static103.aBooleanArray8[4] && local14 < Static197.anIntArray409[4] + 128) {
			local14 = Static197.anIntArray409[4] + 128;
		}
		@Pc(58) int local58 = Static2.anInt62 + (int) Static239.aFloat51 & 0x7FF;
		Static9.method2433(local14 * 3 + 600, Static254.anInt4978, Static101.anInt2397, local14, arg0, Static234.method3798(Static22.aClass15_Sub2_Sub2_1.anInt5371, Static22.aClass15_Sub2_Sub2_1.anInt5358, Static32.anInt876) - 50, local58);
		if (Static80.anInt1911 == local9 && Static162.anInt3612 == local3 && Static192.anInt4017 == local1 && local30 == Static295.anInt5738 && Static151.anInt3328 == local11) {
			Static16.anInt342 = 1;
			return;
		}
		Static85.anInt1998 = 10;
		Static69.anInt3049 = 10;
		if (Static162.anInt3612 > local3) {
			local3 += Static85.anInt1998 + Static69.anInt3049 * (Static162.anInt3612 - local3) / 1000;
			if (local3 < Static162.anInt3612) {
				Static162.anInt3612 = local3;
			}
		}
		@Pc(153) int local153 = Static151.anInt3328 - local11;
		if (Static192.anInt4017 > local1) {
			local1 += (Static192.anInt4017 - local1) * Static69.anInt3049 / 1000 + Static85.anInt1998;
			if (Static192.anInt4017 > local1) {
				Static192.anInt4017 = local1;
			}
		}
		if (Static80.anInt1911 > local9) {
			local9 += Static69.anInt3049 * (Static80.anInt1911 - local9) / 1000 + Static85.anInt1998;
			if (Static80.anInt1911 > local9) {
				Static80.anInt1911 = local9;
			}
		}
		if (local9 > Static80.anInt1911) {
			local9 -= Static85.anInt1998 + Static69.anInt3049 * (local9 - Static80.anInt1911) / 1000;
			if (Static80.anInt1911 < local9) {
				Static80.anInt1911 = local9;
			}
		}
		if (Static162.anInt3612 < local3) {
			local3 -= (local3 - Static162.anInt3612) * Static69.anInt3049 / 1000 + Static85.anInt1998;
			if (Static162.anInt3612 < local3) {
				Static162.anInt3612 = local3;
			}
		}
		Static225.anInt5366 = 10;
		if (local153 > 1024) {
			local153 -= 2048;
		}
		if (local153 < -1024) {
			local153 += 2048;
		}
		Static84.anInt1965 = 10;
		if (Static192.anInt4017 < local1) {
			local1 -= Static85.anInt1998 + (local1 - Static192.anInt4017) * Static69.anInt3049 / 1000;
			if (Static192.anInt4017 < local1) {
				Static192.anInt4017 = local1;
			}
		}
		if (local153 > 0) {
			local11 += local153 * Static84.anInt1965 / 1000 + Static225.anInt5366;
			local11 &= 0x7FF;
		}
		if (local30 < Static295.anInt5738) {
			local30 += Static84.anInt1965 * (Static295.anInt5738 - local30) / 1000 + Static225.anInt5366;
			if (Static295.anInt5738 > local30) {
				Static295.anInt5738 = local30;
			}
		}
		if (Static295.anInt5738 < local30) {
			local30 -= Static225.anInt5366 + (local30 - Static295.anInt5738) * Static84.anInt1965 / 1000;
			if (Static295.anInt5738 < local30) {
				Static295.anInt5738 = local30;
			}
		}
		if (local153 < 0) {
			local11 -= Static84.anInt1965 * -local153 / 1000 + Static225.anInt5366;
			local11 &= 0x7FF;
		}
		@Pc(394) int local394 = Static151.anInt3328 - local11;
		if (local394 > 1024) {
			local394 -= 2048;
		}
		if (local394 < -1024) {
			local394 += 2048;
		}
		if (local394 >= 0 || local153 <= 0 || local394 > 0 && local153 < 0) {
			Static151.anInt3328 = local11;
		}
	}
}
