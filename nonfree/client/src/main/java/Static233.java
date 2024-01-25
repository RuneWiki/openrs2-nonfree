import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	public static int anInt4178;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "[S")
	public static short[] aShortArray53;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Lclient!qa;")
	public static Class109 aClass109_7;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array10;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString33 = null;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_111 = new Class131(75, 4);

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_58 = new Class84("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "[I")
	public static final int[] anIntArray338 = new int[100];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!m;Lclient!qa;B)V")
	public static void method3449(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class109 arg1) {
		if (Static7.aClass1_Sub2_Sub12_2 == null) {
			return;
		}
		if (Static411.anInt7188 < 10) {
			if (!Static7.aClass250_29.method5656(Static7.aClass1_Sub2_Sub12_2.aString22)) {
				Static411.anInt7188 = Static243.aClass250_54.method5664(Static7.aClass1_Sub2_Sub12_2.aString22) / 10;
				return;
			}
			Static286.method4043();
			Static411.anInt7188 = 10;
		}
		if (Static411.anInt7188 == 10) {
			Static7.anInt2566 = Static7.aClass1_Sub2_Sub12_2.anInt3534 >> 6 << 6;
			Static7.anInt2576 = Static7.aClass1_Sub2_Sub12_2.anInt3523 >> 6 << 6;
			Static7.anInt2568 = (Static7.aClass1_Sub2_Sub12_2.anInt3524 >> 6 << 6) + 64 - Static7.anInt2566;
			Static7.anInt2570 = (Static7.aClass1_Sub2_Sub12_2.anInt3527 >> 6 << 6) + 64 - Static7.anInt2576;
			@Pc(82) int[] local82 = new int[3];
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static7.aClass1_Sub2_Sub12_2.method2966(Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95, Static134.anInt5502 + (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7), (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7) + Static437.anInt7555, local82)) {
				local84 = local82[1] - Static7.anInt2566;
				local86 = local82[2] - Static7.anInt2576;
			}
			if (!Static183.aBoolean196 && local84 >= 0 && Static7.anInt2568 > local84 && local86 >= 0 && Static7.anInt2570 > local86) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local86 += (int) (Math.random() * 10.0D) - 5;
				Static46.anInt865 = local84;
				Static151.anInt2577 = local86;
			} else if (Static244.anInt4358 == -1 || Static407.anInt7049 == -1) {
				Static7.aClass1_Sub2_Sub12_2.method2961(Static7.aClass1_Sub2_Sub12_2.anInt3525 >> 14 & 0x3FFF, local82, Static7.aClass1_Sub2_Sub12_2.anInt3525 & 0x3FFF);
				Static46.anInt865 = local82[1] - Static7.anInt2566;
				Static151.anInt2577 = local82[2] - Static7.anInt2576;
			} else {
				Static7.aClass1_Sub2_Sub12_2.method2961(Static244.anInt4358, local82, Static407.anInt7049);
				Static183.aBoolean196 = false;
				if (local82 != null) {
					Static46.anInt865 = local82[1] - Static7.anInt2566;
					Static151.anInt2577 = local82[2] - Static7.anInt2576;
				}
				Static407.anInt7049 = -1;
				Static244.anInt4358 = -1;
			}
			if (Static7.aClass1_Sub2_Sub12_2.anInt3531 == 37) {
				Static7.aFloat39 = 3.0F;
				Static7.aFloat38 = 3.0F;
			} else if (Static7.aClass1_Sub2_Sub12_2.anInt3531 == 50) {
				Static7.aFloat39 = 4.0F;
				Static7.aFloat38 = 4.0F;
			} else if (Static7.aClass1_Sub2_Sub12_2.anInt3531 == 75) {
				Static7.aFloat39 = 6.0F;
				Static7.aFloat38 = 6.0F;
			} else if (Static7.aClass1_Sub2_Sub12_2.anInt3531 == 100) {
				Static7.aFloat39 = 8.0F;
				Static7.aFloat38 = 8.0F;
			} else if (Static7.aClass1_Sub2_Sub12_2.anInt3531 == 200) {
				Static7.aFloat39 = 16.0F;
				Static7.aFloat38 = 16.0F;
			} else {
				Static7.aFloat39 = 8.0F;
				Static7.aFloat38 = 8.0F;
			}
			Static7.anInt2563 = (int) Static7.aFloat39 >> 1;
			Static7.aByteArrayArrayArray2 = Static248.method3660(Static7.anInt2563);
			Static144.method2162();
			Static7.method2283();
			Static67.aClass266_12 = new Class266();
			Static7.anInt2564 += (int) (Math.random() * 5.0D) - 2;
			if (Static7.anInt2564 < -8) {
				Static7.anInt2564 = -8;
			}
			if (Static7.anInt2564 > 8) {
				Static7.anInt2564 = 8;
			}
			Static7.anInt2562 += (int) (Math.random() * 5.0D) - 2;
			if (Static7.anInt2562 < -16) {
				Static7.anInt2562 = -16;
			}
			if (Static7.anInt2562 > 16) {
				Static7.anInt2562 = 16;
			}
			Static7.method2279(arg0, Static7.anInt2564 >> 2 << 10, Static7.anInt2562 >> 1);
			Static7.aClass224_3.method5304(256, 1024);
			Static7.aClass126_2.method2910(256, 256);
			Static7.aClass105_3.method2341(4096);
			Static111.aClass170_1.method3949(256);
			Static411.anInt7188 = 20;
		} else if (Static411.anInt7188 == 20) {
			Static148.method2226(true);
			Static7.method2280(arg1, Static7.anInt2564, Static7.anInt2562);
			Static411.anInt7188 = 60;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 60) {
			if (Static7.aClass250_29.method5662(Static7.aClass1_Sub2_Sub12_2.aString22 + "_staticelements")) {
				if (!Static7.aClass250_29.method5656(Static7.aClass1_Sub2_Sub12_2.aString22 + "_staticelements")) {
					return;
				}
				Static7.aClass222_2 = Static66.method1144(Static7.aClass1_Sub2_Sub12_2.aString22 + "_staticelements", Static429.aBoolean475, Static7.aClass250_29);
			} else {
				Static7.aClass222_2 = new Class222(0);
			}
			Static7.method2268();
			Static411.anInt7188 = 70;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 70) {
			Static41.aClass207_20 = new Class207(arg1, 11, true, Static299.aCanvas5);
			Static411.anInt7188 = 73;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 73) {
			Static323.aClass207_17 = new Class207(arg1, 12, true, Static299.aCanvas5);
			Static411.anInt7188 = 76;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 76) {
			Static22.aClass207_13 = new Class207(arg1, 14, true, Static299.aCanvas5);
			Static411.anInt7188 = 79;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 79) {
			Static261.aClass207_21 = new Class207(arg1, 17, true, Static299.aCanvas5);
			Static411.anInt7188 = 82;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 82) {
			Static190.aClass207_10 = new Class207(arg1, 19, true, Static299.aCanvas5);
			Static411.anInt7188 = 85;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 85) {
			Static157.aClass207_8 = new Class207(arg1, 22, true, Static299.aCanvas5);
			Static411.anInt7188 = 88;
			Static148.method2226(true);
			Static194.method2942();
		} else if (Static411.anInt7188 == 88) {
			Static244.aClass207_15 = new Class207(arg1, 26, true, Static299.aCanvas5);
			Static411.anInt7188 = 91;
			Static148.method2226(true);
			Static194.method2942();
		} else {
			Static212.aClass207_2 = new Class207(arg1, 30, true, Static299.aCanvas5);
			Static411.anInt7188 = 100;
			Static148.method2226(true);
			Static194.method2942();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
	public static int method3450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
