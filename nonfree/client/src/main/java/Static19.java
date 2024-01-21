import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public static int anInt660;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_349 = Static9.method266("mapdots");

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!id;")
	public static Class34 aClass34_350 = Static9.method266("<img=1>");

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	public static int anInt658 = 0;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public static int anInt659 = 1;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!id;I)V")
	public static void method393(@OriginalArg(0) Class34 arg0) {
		if (Static94.anInt2431 >= 2) {
			if (arg0.method961(Static8.aClass34_226)) {
				System.gc();
			}
			if (arg0.method961(Static115.aClass34_1407)) {
				Static85.method1457();
			}
			if (arg0.method961(Static69.aClass34_850)) {
				Static31.aBoolean48 = true;
			}
			if (arg0.method961(Static85.aClass34_1118)) {
				Static31.aBoolean48 = false;
			}
			if (arg0.method961(Static59.aClass34_768)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static114.aClass58Array1[local42].anIntArrayArray26[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method961(Static93.aClass34_1196) && Static31.anInt921 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method985(Static16.aClass34_346)) {
				Static59.anInt1635 = arg0.method956(12).method957().method959();
				Static39.method685(null, 0, Static91.method1554(new Class34[] { Static71.aClass34_905, Static85.method1456(Static59.anInt1635) }));
			}
			if (arg0.method961(Static102.aClass34_1289)) {
				Static36.aBoolean60 = true;
			}
		}
		Static21.aClass1_Sub19_Sub1_1.method2105(4);
		Static21.aClass1_Sub19_Sub1_1.method2061(arg0.method982() - 1);
		Static21.aClass1_Sub19_Sub1_1.method2050(arg0.method956(2));
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLclient!fd;)Lclient!id;")
	public static Class34 method394(@OriginalArg(1) Class1_Sub9 arg0) {
		if (Static119.method1885(Static84.method1448(arg0)) == 0) {
			return null;
		} else if (arg0.aClass34_493 == null || arg0.aClass34_493.method957().method982() == 0) {
			return Static36.aBoolean60 ? Static106.aClass34_1307 : null;
		} else {
			return arg0.aClass34_493;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method395() {
		aClass34_350 = null;
		aClass34_349 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method396() {
		Static43.aClass63_9.method1665();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)I")
	public static int method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
