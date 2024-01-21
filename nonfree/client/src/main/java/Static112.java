import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt2612;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "Lclient!pc;")
	public static Class57 aClass57_3;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public static int anInt2613;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "Lclient!fd;")
	public static Class24 aClass24_30;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1410 = Static69.method1231("sl_arrows");

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public static volatile int anInt2608 = -1;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt2609 = 0;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_1411 = Static69.method1231("<col=ff9040>");

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_1412 = Static69.method1231("scrollen:");

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!je;")
	private static Class40 aClass40_1413 = Static69.method1231("Please enter your username)3");

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1414 = Static69.method1231("auf der Hautpseite)3");

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!je;")
	private static Class40 aClass40_1415 = Static69.method1231("Members object");

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
	public static int anInt2614 = 0;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_1416 = aClass40_1413;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
	public static int anInt2615 = 0;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "Lclient!je;")
	private static Class40 aClass40_1420 = Static69.method1231("yellow:");

	@OriginalMember(owner = "client!tc", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1417 = aClass40_1420;

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "[I")
	public static int[] anIntArray297 = new int[25];

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Lclient!je;")
	private static Class40 aClass40_1421 = Static69.method1231("This computers address has been blocked");

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "Lclient!je;")
	public static Class40 aClass40_1418 = aClass40_1421;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
	public static int anInt2616 = 0;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "Lclient!je;")
	public static Class40 aClass40_1419 = aClass40_1415;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Lclient!je;")
	public static Class40 aClass40_1422 = aClass40_1420;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method1872() {
		Static85.anImage3 = null;
		Static60.aFont1 = null;
		Static37.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
	public static boolean method1873(@OriginalArg(0) int arg0) {
		if (Static81.aBooleanArray20[arg0]) {
			return true;
		} else if (Static60.aClass24_17.method1913(arg0)) {
			@Pc(23) int local23 = Static60.aClass24_17.method1927(arg0);
			if (local23 == 0) {
				Static81.aBooleanArray20[arg0] = true;
				return true;
			}
			if (Static45.aClass2_Sub13ArrayArray1[arg0] == null) {
				Static45.aClass2_Sub13ArrayArray1[arg0] = new Class2_Sub13[local23];
			}
			for (@Pc(49) int local49 = 0; local49 < local23; local49++) {
				if (Static45.aClass2_Sub13ArrayArray1[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static60.aClass24_17.method1931(local49, arg0);
					if (local63 != null) {
						Static45.aClass2_Sub13ArrayArray1[arg0][local49] = new Class2_Sub13();
						Static45.aClass2_Sub13ArrayArray1[arg0][local49].anInt1560 = (arg0 << 16) + local49;
						if (local63[0] == -1) {
							Static45.aClass2_Sub13ArrayArray1[arg0][local49].method1045(new Class2_Sub9(local63));
						} else {
							Static45.aClass2_Sub13ArrayArray1[arg0][local49].method1040(new Class2_Sub9(local63));
						}
					}
				}
			}
			Static81.aBooleanArray20[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method1874() {
		aClass40_1416 = null;
		aClass40_1417 = null;
		aClass40_1410 = null;
		aClass24_30 = null;
		aClass40_1412 = null;
		aClass40_1418 = null;
		aClass40_1419 = null;
		aClass40_1411 = null;
		aClass57_3 = null;
		aClass40_1413 = null;
		aClass40_1415 = null;
		anIntArray297 = null;
		aClass40_1422 = null;
		aClass40_1414 = null;
		aClass40_1421 = null;
		aClass40_1420 = null;
	}
}
