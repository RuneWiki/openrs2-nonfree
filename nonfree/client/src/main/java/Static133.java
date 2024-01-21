import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!qh", name = "E", descriptor = "Lclient!j;")
	public static Class40 aClass40_1;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "[Lclient!va;")
	public static Class2_Sub11[] aClass2_Sub11Array1 = new Class2_Sub11[2048];

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1283 = Static51.method932("OFF");

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1284 = Static51.method932("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!qh", name = "O", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1285 = Static51.method932("au");

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
	public static int anInt2947 = 0;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1286 = aClass10_1283;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "Z")
	public static boolean aBoolean132 = false;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	public static void method2121() {
		aClass10_1283 = null;
		aClass10_1284 = null;
		aClass10_1286 = null;
		aClass10_1285 = null;
		aClass2_Sub11Array1 = null;
		aClass40_1 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!cd;B)I")
	public static int method2122(@OriginalArg(0) Class10 arg0) {
		if (Static130.anInt2891 == 1) {
			return 7;
		} else if (arg0.method341(Static108.aClass10_1080)) {
			return 1;
		} else if (arg0.method341(Static135.aClass10_1308)) {
			return 1;
		} else if (arg0.method341(Static170.aClass10_1582)) {
			return 2;
		} else if (arg0.method341(Static5.aClass10_72)) {
			return 2;
		} else if (arg0.method341(aClass10_1285)) {
			return 3;
		} else if (arg0.method341(Static102.aClass10_1546)) {
			return 4;
		} else if (arg0.method341(Static118.aClass10_1150)) {
			return 4;
		} else if (arg0.method341(Static170.aClass10_1579)) {
			return 5;
		} else if (arg0.method341(Static75.aClass10_772)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
	public static void method2123(@OriginalArg(0) boolean arg0) {
		Static155.method2390();
		Static94.anInt2230++;
		if (Static94.anInt2230 < 50 && !arg0) {
			return;
		}
		Static94.anInt2230 = 0;
		if (Static167.aBoolean86 || Static98.aClass34_5 == null) {
			return;
		}
		Static141.aClass2_Sub11_Sub1_3.method1495(120);
		try {
			Static98.aClass34_5.method1130(Static141.aClass2_Sub11_Sub1_3.anInt2077, Static141.aClass2_Sub11_Sub1_3.aByteArray24);
			Static141.aClass2_Sub11_Sub1_3.anInt2077 = 0;
		} catch (@Pc(44) IOException local44) {
			Static167.aBoolean86 = true;
		}
	}
}
