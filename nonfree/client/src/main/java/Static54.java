import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!sf;")
	public static Class5 aClass5_50;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "Lclient!sc;")
	private static Class66 aClass66_917 = Static106.method1849("wishes to duel with you)3");

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static volatile int anInt1750 = 0;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!sc;")
	private static Class66 aClass66_918 = Static106.method1849("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	public static int anInt1752 = 0;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
	public static int[] anIntArray248 = new int[32768];

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
	public static int anInt1753 = 0;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_919 = Static106.method1849("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_920 = Static106.method1849("welle:");

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_921 = aClass66_917;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_922 = aClass66_918;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "Lclient!sc;")
	public static Class66 aClass66_923 = Static106.method1849("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
	public static void method1234(@OriginalArg(0) int arg0) {
		Static55.anInt1772 += arg0 * 128;
		@Pc(20) int local20;
		if (Static6.anIntArray51.length < Static55.anInt1772) {
			local20 = (int) (Math.random() * 12.0D);
			Static55.anInt1772 -= Static6.anIntArray51.length;
			Static61.method1306(Static35.aClass1_Sub1_Sub2_Sub3Array3[local20]);
		}
		local20 = 0;
		@Pc(43) int local43 = arg0 * 128;
		@Pc(50) int local50 = (256 - arg0) * 128;
		@Pc(77) int local77;
		for (@Pc(52) int local52 = 0; local52 < local50; local52++) {
			local77 = Static123.anIntArray488[local20 + local43] - arg0 * Static6.anIntArray51[Static6.anIntArray51.length - 1 & local20 + Static55.anInt1772] / 6;
			if (local77 < 0) {
				local77 = 0;
			}
			Static123.anIntArray488[local20++] = local77;
		}
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(117) int local117;
		for (local77 = 256 - arg0; local77 < 256; local77++) {
			local108 = local77 * 128;
			for (local110 = 0; local110 < 128; local110++) {
				local117 = (int) (Math.random() * 100.0D);
				if (local117 < 50 && local110 > 10 && local110 < 118) {
					Static123.anIntArray488[local108 + local110] = 255;
				} else {
					Static123.anIntArray488[local110 + local108] = 0;
				}
			}
		}
		if (Static108.anInt180 > 0) {
			Static108.anInt180 -= arg0 * 4;
		}
		if (Static70.anInt714 > 0) {
			Static70.anInt714 -= arg0 * 4;
		}
		if (Static70.anInt714 == 0 && Static108.anInt180 == 0) {
			local108 = (int) ((double) (2000 / arg0) * Math.random());
			if (local108 == 1) {
				Static108.anInt180 = 1024;
			}
			if (local108 == 0) {
				Static70.anInt714 = 1024;
			}
		}
		for (local108 = 0; local108 < 256 - arg0; local108++) {
			Static132.anIntArray498[local108] = Static132.anIntArray498[arg0 + local108];
		}
		for (local110 = 256 - arg0; local110 < 256; local110++) {
			Static132.anIntArray498[local110] = (int) (Math.sin((double) Static48.anInt1499 / 14.0D) * 16.0D + Math.sin((double) Static48.anInt1499 / 15.0D) * 14.0D + Math.sin((double) Static48.anInt1499 / 16.0D) * 12.0D);
			Static48.anInt1499++;
		}
		Static12.anInt439 += arg0;
		local117 = (arg0 + (Static22.anInt636 & 0x1)) / 2;
		if (local117 <= 0) {
			return;
		}
		@Pc(282) int local282;
		@Pc(289) int local289;
		for (@Pc(273) int local273 = 0; local273 < Static12.anInt439 * 100; local273++) {
			local282 = (int) (Math.random() * 124.0D) + 2;
			local289 = (int) (Math.random() * 128.0D) + 128;
			Static123.anIntArray488[(local289 << 7) + local282] = 192;
		}
		Static12.anInt439 = 0;
		@Pc(315) int local315;
		@Pc(318) int local318;
		for (local282 = 0; local282 < 256; local282++) {
			local289 = 0;
			local315 = local282 * 128;
			for (local318 = -local117; local318 < 128; local318++) {
				if (local318 + local117 < 128) {
					local289 += Static123.anIntArray488[local318 + local315 + local117];
				}
				if (local318 - local117 - 1 >= 0) {
					local289 -= Static123.anIntArray488[local318 + local315 - local117 - 1];
				}
				if (local318 >= 0) {
					Static43.anIntArray198[local318 + local315] = local289 / (local117 * 2 + 1);
				}
			}
		}
		for (local289 = 0; local289 < 128; local289++) {
			local315 = 0;
			for (local318 = -local117; local318 < 256; local318++) {
				@Pc(403) int local403 = local318 * 128;
				if (local117 + local318 < 256) {
					local315 += Static43.anIntArray198[local117 * 128 + local289 + local403];
				}
				if (local318 - local117 - 1 >= 0) {
					local315 -= Static43.anIntArray198[local289 + local403 - (local117 + 1) * 128];
				}
				if (local318 >= 0) {
					Static123.anIntArray488[local289 + local403] = local315 / (local117 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
	public static void method1235() {
		anIntArray248 = null;
		aClass66_918 = null;
		aClass66_920 = null;
		aClass66_921 = null;
		aClass5_50 = null;
		aClass66_917 = null;
		aClass66_923 = null;
		aClass66_919 = null;
		aClass66_922 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)J")
	public static synchronized long method1236() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static89.aLong98) {
			Static75.aLong80 += Static89.aLong98 - local10;
		}
		Static89.aLong98 = local10;
		return Static75.aLong80 + local10;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Z")
	public static boolean method1237(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}
}
