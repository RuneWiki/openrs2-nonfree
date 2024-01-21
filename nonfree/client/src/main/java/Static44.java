import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_547 = Static2.method66("@yel@");

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!ke;")
	private static Class39 aClass39_558 = Static2.method66("Unable to connect)3");

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_548 = aClass39_558;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_549 = Static2.method66("Absender:");

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!ke;")
	private static Class39 aClass39_554 = Static2.method66("Close");

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_550 = aClass39_554;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!ke;")
	public static Class39 aClass39_551 = aClass39_558;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_552 = Static2.method66("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!qd;")
	public static Class54 aClass54_11 = new Class54(30);

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public static volatile int anInt1230 = 0;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Lclient!ke;")
	public static Class39 aClass39_553 = Static2.method66("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!ke;")
	private static Class39 aClass39_555 = Static2.method66("Private chat");

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!ke;")
	public static Class39 aClass39_556 = Static2.method66(" x");

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public static volatile int anInt1232 = 0;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!ke;")
	public static Class39 aClass39_557 = aClass39_555;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_559 = Static2.method66("Missbrauch melden");

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	public static void method862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			if (Static67.aClass39Array12[local13] != null) {
				@Pc(28) int local28 = Static78.anInt2158 + 74 - local11 * 14;
				@Pc(32) int local32 = Static40.anIntArray169[local13];
				if (local28 < -20) {
					break;
				}
				if (local32 == 0) {
					local11++;
				}
				@Pc(45) Class39 local45 = Static42.aClass39Array8[local13];
				if (local45 != null && local45.method1093(Static46.aClass39_575)) {
					local45 = local45.method1099(5);
				}
				if (local45 != null && local45.method1093(Static18.aClass39_279)) {
					local45 = local45.method1099(5);
				}
				if ((local32 == 1 || local32 == 2) && (local32 == 1 || Static6.anInt2870 == 0 || Static6.anInt2870 == 1 && Static35.method2069(local45))) {
					local11++;
					if (local28 - 14 < arg0 && local28 >= arg0 && !local45.method1124(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.aClass39_1182)) {
						if (Static77.anInt2111 >= 1) {
							Static84.method2048(0, Static69.aClass39_895, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 31, 0, 0);
						}
						Static84.method2048(0, Static85.aClass39_1045, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 4, 0, 0);
						Static84.method2048(0, Static47.aClass39_594, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 2, 0, 0);
					}
				}
				if ((local32 == 3 || local32 == 7) && Static38.anInt1157 == 0 && (local32 == 7 || Static96.anInt2634 == 0 || Static96.anInt2634 == 1 && Static35.method2069(local45))) {
					local11++;
					if (local28 - 14 < arg0 && local28 >= arg0) {
						if (Static77.anInt2111 >= 1) {
							Static84.method2048(0, Static69.aClass39_895, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 31, 0, 0);
						}
						Static84.method2048(0, Static85.aClass39_1045, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 4, 0, 0);
						Static84.method2048(0, Static47.aClass39_594, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 2, 0, 0);
					}
				}
				if (local32 == 4 && (Static78.anInt2150 == 0 || Static78.anInt2150 == 1 && Static35.method2069(local45))) {
					local11++;
					if (local28 - 14 < arg0 && local28 >= arg0) {
						Static84.method2048(0, Static21.aClass39_1212, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 54, 0, 0);
					}
				}
				if ((local32 == 5 || local32 == 6) && Static38.anInt1157 == 0 && Static96.anInt2634 < 2) {
					local11++;
				}
				if (local32 == 8 && (Static78.anInt2150 == 0 || Static78.anInt2150 == 1 && Static35.method2069(local45))) {
					local11++;
					if (local28 - 14 < arg0 && arg0 <= local28) {
						Static84.method2048(0, Static73.aClass39_919, Static20.method431(new Class39[] { Static79.aClass39_1261, local45 }), 17, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	public static void method863() {
		aClass39_551 = null;
		aClass39_553 = null;
		aClass39_550 = null;
		aClass39_557 = null;
		aClass39_548 = null;
		aClass39_558 = null;
		aClass39_549 = null;
		aClass39_547 = null;
		aClass39_559 = null;
		aClass39_552 = null;
		aClass39_556 = null;
		aClass39_554 = null;
		aClass39_555 = null;
		aClass54_11 = null;
	}
}
