import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!su", name = "f", descriptor = "Lclient!tc;")
	public static Class232 aClass232_7;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "I")
	public static int anInt6356;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lclient!ct;")
	public static Class45 method4988() {
		try {
			return (Class45) Class.forName("Class45_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)V")
	public static void method4990(@OriginalArg(0) int arg0) {
		Static399.method5198();
		Static14.method228();
		Static173.method2428(true, arg0);
		Static451.method5905(Static185.aClass34_7, Static448.aClass82_104, Static332.aClass82_76);
		Static359.method4817(Static185.aClass34_7, Static448.aClass82_104);
		Static238.method3446();
		Static428.method5663(Static352.aClass6Array11);
		Static65.method1072();
		if (Static312.anInt5414 == 2) {
			Static203.method4783(3);
		} else if (Static312.anInt5414 == 6) {
			Static203.method4783(7);
		} else if (Static312.anInt5414 == 9) {
			Static203.method4783(10);
		} else if (Static312.anInt5414 == 1) {
			Static395.method5157(Static185.aClass34_7, Static448.aClass82_104);
			return;
		}
	}
}
