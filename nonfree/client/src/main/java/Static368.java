import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!mt", name = "H", descriptor = "[Lclient!caa;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!mt", name = "E", descriptor = "Lclient!sf;")
	public static final Class312 aClass312_4 = new Class312("", 15);

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(I)V")
	public static void method5464() {
		if (Static425.aClass319_4 == null) {
			return;
		}
		if (Static425.aClass319_4.anInt8562 == 1) {
			Static425.aClass319_4 = null;
			return;
		}
		if (Static425.aClass319_4.anInt8562 == 2) {
			Static41.method926(Static116.aString23, Static638.aClass286_6, 2);
			Static425.aClass319_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!mt", name = "c", descriptor = "(III)V")
	public static void method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static294.anInt5309 == 1) {
			Static151.method2661(Static376.aClass2_Sub7_Sub21_4, arg1, arg0);
		} else if (Static294.anInt5309 == 2) {
			if (Static148.aBoolean241) {
				Static293.method4634(Static260.method4303() + arg1, Static100.method1939() + arg0);
			} else {
				Static293.method4634(arg1, arg0);
			}
		}
		Static376.aClass2_Sub7_Sub21_4 = null;
		Static294.anInt5309 = 0;
	}
}
