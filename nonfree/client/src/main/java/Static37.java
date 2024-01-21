import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static37 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!dd;")
	public static Class19 aClass19_33;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "Lclient!ma;")
	public static Class48 aClass48_5;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public static int anInt876 = 0;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public static int anInt879 = 0;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_569 = Static69.method1153("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public static int[] anIntArray135 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_570 = Static69.method1153("headicons_prayer");

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "Lclient!rd;")
	public static Class64 aClass64_571 = Static69.method1153("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!rd;")
	private static Class64 aClass64_573 = Static69.method1153("Enter name:");

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_572 = aClass64_573;

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "[I")
	public static int[] anIntArray136 = new int[50];

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
	public static int anInt882 = 0;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
	public static int anInt883 = 0;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZZ)I")
	public static int method667() {
		return Static39.anInt915 + Static121.anInt2873;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB)Z")
	public static boolean method668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0 && arg0 == Static12.anInt1942) {
			return true;
		} else if (arg1 == 1 && Static13.anInt455 == arg0) {
			return true;
		} else {
			return (arg1 == 2 || arg1 == 3) && arg0 == Static105.anInt2469;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static31.anInt803 != 0 && arg0 != -1) {
			Static65.method1103(arg0, Static44.aClass41_Sub1_9, 1, Static31.anInt803);
			Static68.anInt1536 = arg1;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method670() {
		aClass64_571 = null;
		anIntArray135 = null;
		aClass19_33 = null;
		aClass64_570 = null;
		aClass48_5 = null;
		aClass64_573 = null;
		anIntArray136 = null;
		aClass64_569 = null;
		aClass64_572 = null;
	}
}
