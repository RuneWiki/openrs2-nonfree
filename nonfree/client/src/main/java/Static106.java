import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!tc", name = "N", descriptor = "Lclient!mc;")
	public static Class46 aClass46_4;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1216 = Static63.method1251("Wordpack geladen)3");

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
	public static int anInt2791 = 0;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1217 = Static63.method1251("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1218 = Static63.method1251("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1219 = Static63.method1251("@or1@");

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1220 = Static63.method1251("backleft2");

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "I")
	public static int anInt2794 = 0;

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1221 = Static63.method1251("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBLclient!sd;I)Z")
	public static boolean method1918(@OriginalArg(0) int arg0, @OriginalArg(2) Class29 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) byte[] local10 = arg1.method733(arg0, arg2);
		if (local10 == null) {
			return false;
		} else {
			Static84.method1593(local10);
			return true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
	public static int method1919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(40) int local40 = Static34.method691(arg1 - 1, arg0 + -1) + Static34.method691(arg1 - 1, arg0 + 1) + Static34.method691(arg1 - -1, arg0 + -1) + Static34.method691(arg1 - -1, arg0 + 1);
		@Pc(75) int local75 = Static34.method691(arg1, arg0 - 1) + Static34.method691(arg1, arg0 + 1) + Static34.method691(arg1 - 1, arg0) + Static34.method691(arg1 + 1, arg0);
		@Pc(82) int local82 = Static34.method691(arg1, arg0);
		return local82 / 4 + local40 / 16 + local75 / 8;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	public static void method1920() {
		aClass45_1217 = null;
		aClass45_1218 = null;
		aClass45_1221 = null;
		aClass45_1219 = null;
		aClass45_1220 = null;
		aClass45_1216 = null;
		aClass46_4 = null;
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public static void method1921() {
		@Pc(5) int local5 = Static4.anInt104 * 128 + 64;
		@Pc(15) int local15 = Static31.anInt925 * 128 + 64;
		@Pc(24) int local24 = Static32.method676(local5, local15, Static8.anInt262) - Static35.anInt966;
		if (local5 > Static25.anInt791) {
			Static25.anInt791 += (local5 - Static25.anInt791) * Static62.anInt1822 / 1000 + Static42.anInt801;
			if (Static25.anInt791 > local5) {
				Static25.anInt791 = local5;
			}
		}
		if (local15 > Static46.anInt1334) {
			Static46.anInt1334 += Static42.anInt801 + (local15 - Static46.anInt1334) * Static62.anInt1822 / 1000;
			if (Static46.anInt1334 > local15) {
				Static46.anInt1334 = local15;
			}
		}
		if (Static50.anInt1602 < local24) {
			Static50.anInt1602 += (local24 - Static50.anInt1602) * Static62.anInt1822 / 1000 + Static42.anInt801;
			if (local24 < Static50.anInt1602) {
				Static50.anInt1602 = local24;
			}
		}
		if (local15 < Static46.anInt1334) {
			Static46.anInt1334 -= Static42.anInt801 + (Static46.anInt1334 - local15) * Static62.anInt1822 / 1000;
			if (Static46.anInt1334 < local15) {
				Static46.anInt1334 = local15;
			}
		}
		if (Static50.anInt1602 > local24) {
			Static50.anInt1602 -= Static42.anInt801 + Static62.anInt1822 * (Static50.anInt1602 - local24) / 1000;
			if (local24 > Static50.anInt1602) {
				Static50.anInt1602 = local24;
			}
		}
		if (Static25.anInt791 > local5) {
			Static25.anInt791 -= Static62.anInt1822 * (Static25.anInt791 - local5) / 1000 + Static42.anInt801;
			if (local5 > Static25.anInt791) {
				Static25.anInt791 = local5;
			}
		}
		local15 = Static105.anInt2778 * 128 + 64;
		local5 = Static27.anInt853 * 128 + 64;
		local24 = Static32.method676(local5, local15, Static8.anInt262) - Static49.anInt1599;
		@Pc(196) int local196 = local5 - Static25.anInt791;
		@Pc(201) int local201 = local15 - Static46.anInt1334;
		@Pc(206) int local206 = local24 - Static50.anInt1602;
		@Pc(217) int local217 = (int) Math.sqrt((double) (local201 * local201 + local196 * local196));
		@Pc(228) int local228 = (int) (Math.atan2((double) local206, (double) local217) * 325.949D) & 0x7FF;
		if (local228 < 128) {
			local228 = 128;
		}
		@Pc(244) int local244 = (int) (Math.atan2((double) local196, (double) local201) * -325.949D) & 0x7FF;
		if (local228 > 383) {
			local228 = 383;
		}
		@Pc(254) int local254 = local244 - Static56.anInt1690;
		if (Static38.anInt1089 < local228) {
			Static38.anInt1089 += Static68.anInt1961 + Static91.anInt2546 * (local228 - Static38.anInt1089) / 1000;
			if (local228 < Static38.anInt1089) {
				Static38.anInt1089 = local228;
			}
		}
		if (local254 > 1024) {
			local254 -= 2048;
		}
		if (local254 < -1024) {
			local254 += 2048;
		}
		if (Static38.anInt1089 > local228) {
			Static38.anInt1089 -= Static91.anInt2546 * (Static38.anInt1089 - local228) / 1000 + Static68.anInt1961;
			if (local228 > Static38.anInt1089) {
				Static38.anInt1089 = local228;
			}
		}
		if (local254 > 0) {
			Static56.anInt1690 += Static68.anInt1961 + Static91.anInt2546 * local254 / 1000;
			Static56.anInt1690 &= 0x7FF;
		}
		if (local254 < 0) {
			Static56.anInt1690 -= Static91.anInt2546 * -local254 / 1000 + Static68.anInt1961;
			Static56.anInt1690 &= 0x7FF;
		}
		@Pc(356) int local356 = local244 - Static56.anInt1690;
		if (local356 > 1024) {
			local356 -= 2048;
		}
		if (local356 < -1024) {
			local356 += 2048;
		}
		if (local356 < 0 && local254 > 0 || local356 > 0 && local254 < 0) {
			Static56.anInt1690 = local244;
		}
	}
}
