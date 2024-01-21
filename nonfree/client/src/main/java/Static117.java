import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
	public static int anInt2742;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1570 = Static106.method1849("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!q;")
	public static Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public static int anInt2749 = -1;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1571 = null;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "[I")
	public static int[] anIntArray473 = new int[1000];

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1572 = Static106.method1849("Lade Texturen )2 ");

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1573 = Static106.method1849("(Z");

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
	public static int anInt2754 = 0;

	@OriginalMember(owner = "client!ub", name = "z", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1574 = Static106.method1849(" )2> ");

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1575 = Static106.method1849("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
	public static int anInt2755 = 500;

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1576 = Static106.method1849("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method1943() {
		aClass66_1576 = null;
		aClass66_1571 = null;
		aClass56_1 = null;
		aClass66_1570 = null;
		aClass66_1572 = null;
		aClass66_1573 = null;
		aClass66_1574 = null;
		anIntArray473 = null;
		aClass66_1575 = null;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
	public static void method1944() {
		for (@Pc(14) Class1_Sub13 local14 = (Class1_Sub13) Static1.aClass61_1.method1748(); local14 != null; local14 = (Class1_Sub13) Static1.aClass61_1.method1760()) {
			if (local14.aClass1_Sub1_Sub9_1 != null) {
				local14.method1355();
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method1945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 2) {
			@Pc(20) int local20 = method1945(arg0 >> 1, arg1 * arg1);
			if ((arg0 & 0x1) != 0) {
				local20 *= arg1;
			}
			return local20;
		} else if (arg0 == 1) {
			return arg1;
		} else {
			return 1;
		}
	}
}
