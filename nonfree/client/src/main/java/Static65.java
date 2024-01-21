import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!l", name = "u", descriptor = "Lclient!ff;")
	public static Class11 aClass11_30;

	@OriginalMember(owner = "client!l", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!l", name = "s", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array10 = new Class80[5];

	@OriginalMember(owner = "client!l", name = "w", descriptor = "Lclient!wd;")
	public static Class80 aClass80_689 = Static2.method59("title)3jpg");

	@OriginalMember(owner = "client!l", name = "x", descriptor = "I")
	public static int anInt1843 = 0;

	@OriginalMember(owner = "client!l", name = "z", descriptor = "Lclient!wd;")
	public static Class80 aClass80_690 = Static2.method59(")1p");

	@OriginalMember(owner = "client!l", name = "B", descriptor = "Lclient!wd;")
	public static Class80 aClass80_691 = Static2.method59("swe");

	@OriginalMember(owner = "client!l", name = "C", descriptor = "Lclient!wd;")
	public static Class80 aClass80_692 = Static2.method59("sl_back");

	@OriginalMember(owner = "client!l", name = "D", descriptor = "Lclient!wd;")
	private static Class80 aClass80_693 = Static2.method59("Error loading your profile)3");

	@OriginalMember(owner = "client!l", name = "E", descriptor = "Lclient!wd;")
	public static Class80 aClass80_694 = Static2.method59("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!l", name = "J", descriptor = "Lclient!wd;")
	public static Class80 aClass80_695 = Static2.method59("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!l", name = "K", descriptor = "Lclient!wd;")
	public static Class80 aClass80_696 = aClass80_693;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "Lclient!wd;")
	public static Class80 aClass80_697 = Static2.method59("Lade Texturen )2 ");

	@OriginalMember(owner = "client!l", name = "P", descriptor = "Lclient!wd;")
	public static Class80 aClass80_698 = Static2.method59("(X");

	@OriginalMember(owner = "client!l", name = "Q", descriptor = "[I")
	public static int[] anIntArray230 = new int[256];

	@OriginalMember(owner = "client!l", name = "R", descriptor = "Lclient!wd;")
	public static Class80 aClass80_699 = Static2.method59("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!l", name = "T", descriptor = "I")
	public static int anInt1848 = 0;

	@OriginalMember(owner = "client!l", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_700 = Static2.method59("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!r;")
	public static RuntimeException_Sub1 method1096(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString2 = local9.aString2 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IJ)V")
	public static void method1097(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static45.anInt2090; local17++) {
			if (Static3.aLongArray1[local17] == arg0) {
				Static70.aBoolean131 = true;
				Static45.anInt2090--;
				for (@Pc(37) int local37 = local17; local37 < Static45.anInt2090; local37++) {
					Static123.aClass80Array20[local37] = Static123.aClass80Array20[local37 + 1];
					Static29.anIntArray125[local37] = Static29.anIntArray125[local37 + 1];
					Static3.aLongArray1[local37] = Static3.aLongArray1[local37 + 1];
					Static118.anIntArray401[local37] = Static118.anIntArray401[local37 + 1];
				}
				Static106.anInt2836 = Static10.anInt300 + 1;
				Static120.aClass2_Sub17_Sub1_3.method1799(161);
				Static120.aClass2_Sub17_Sub1_3.method1772(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ILclient!ff;Lclient!ff;Z)V")
	public static void method1098(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) boolean arg2) {
		Static59.aBoolean123 = arg2;
		Static87.aClass11_37 = arg1;
		Static122.aClass11_44 = arg0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
	public static void method1099() {
		aClass80_695 = null;
		aClass80_690 = null;
		aClass11_30 = null;
		aClass80Array10 = null;
		aClass80_689 = null;
		aClass80_694 = null;
		aClass80_691 = null;
		aClass80_698 = null;
		aClass80_697 = null;
		aClass80_699 = null;
		aString1 = null;
		aClass80_693 = null;
		aClass80_692 = null;
		aClass80_700 = null;
		aClass80_696 = null;
		anIntArray230 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
	public static boolean method1100(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
