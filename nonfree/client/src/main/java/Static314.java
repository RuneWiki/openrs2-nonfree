import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!dp;")
	public static Class53 aClass53_71;

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)V")
	public static void method2478() {
		@Pc(5) Class70 local5 = Static30.aClass70_18;
		synchronized (Static30.aClass70_18) {
			Static30.aClass70_18.method1397(5);
		}
		local5 = Static340.aClass70_19;
		synchronized (Static340.aClass70_19) {
			Static340.aClass70_19.method1397(5);
		}
		local5 = Static227.aClass70_76;
		synchronized (Static227.aClass70_76) {
			Static227.aClass70_76.method1397(5);
		}
		local5 = Static183.aClass70_61;
		synchronized (Static183.aClass70_61) {
			Static183.aClass70_61.method1397(5);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	public static void method2480() {
		Static143.anInt2818 = Static38.aClass26_3.anInt604 + Static38.aClass26_3.anInt608 + 2;
		Static117.anInt2213 = Static220.aClass26_6.anInt604 + Static220.aClass26_6.anInt608 + 2;
		Static223.aStringArray29 = new String[350 / Static143.anInt2818];
		for (@Pc(33) int local33 = 0; local33 < Static223.aStringArray29.length; local33++) {
			Static223.aStringArray29[local33] = "";
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public static void method2481() {
		@Pc(5) Class70 local5 = Static66.aClass70_27;
		synchronized (Static66.aClass70_27) {
			Static66.aClass70_27.method1399();
		}
	}
}
