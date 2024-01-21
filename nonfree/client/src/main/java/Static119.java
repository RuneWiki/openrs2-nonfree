import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!ie;")
	public static Class35 aClass35_30;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public static int anInt2839;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!id;")
	public static Class34 aClass34_1445 = Static9.method266(" loggt sich ein)3");

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt2832 = 0;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!id;")
	public static Class34 aClass34_1446 = Static9.method266("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Lclient!id;")
	private static Class34 aClass34_1449 = Static9.method266(" more options");

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!id;")
	public static Class34 aClass34_1447 = aClass34_1449;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
	public static int[] anIntArray352 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!id;")
	public static Class34 aClass34_1448 = Static9.method266("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
	public static int anInt2838 = -1;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
	public static int[] anIntArray353 = new int[4000];

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ie;BLclient!ie;Ljava/awt/Component;)V")
	public static void method1880(@OriginalArg(0) Class35 arg0, @OriginalArg(2) Class35 arg1, @OriginalArg(3) Component arg2) {
		if (Static67.aBoolean95) {
			return;
		}
		Static111.method1761();
		@Pc(15) byte[] local15 = arg0.method1569(Static67.aClass34_838, Static120.aClass34_1469);
		Static21.aClass1_Sub1_Sub2_Sub1_1 = new Class1_Sub1_Sub2_Sub1(local15, arg2);
		Static75.aClass1_Sub1_Sub2_Sub1_4 = Static21.aClass1_Sub1_Sub2_Sub1_1.method194();
		Static60.aClass1_Sub1_Sub2_Sub2_6 = Static43.method740(Static120.aClass34_1469, Static66.aClass34_821, arg1);
		Static105.aClass1_Sub1_Sub2_Sub2_13 = Static43.method740(Static120.aClass34_1469, Static41.aClass34_552, arg1);
		Static13.aClass1_Sub1_Sub2_Sub2_4 = Static43.method740(Static120.aClass34_1469, Static132.aClass34_1592, arg1);
		Static123.aClass1_Sub1_Sub2_Sub2Array10 = Static101.method1690(arg1, Static95.aClass34_1202, Static120.aClass34_1469);
		Static37.aClass1_Sub1_Sub2_Sub2Array3 = Static101.method1690(arg1, Static133.aClass34_1596, Static120.aClass34_1469);
		Static20.anIntArray75 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static20.anIntArray75[local59] = local59 * 262144;
		}
		for (@Pc(80) int local80 = 0; local80 < 64; local80++) {
			Static20.anIntArray75[local80 + 64] = local80 * 1024 + 16711680;
		}
		for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
			Static20.anIntArray75[local101 + 128] = local101 * 4 + 16776960;
		}
		for (@Pc(122) int local122 = 0; local122 < 64; local122++) {
			Static20.anIntArray75[local122 + 192] = 16777215;
		}
		Static23.anIntArray80 = new int[256];
		for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
			Static23.anIntArray80[local141] = local141 * 1024;
		}
		for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
			Static23.anIntArray80[local157 + 64] = local157 * 4 + 65280;
		}
		for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
			Static23.anIntArray80[local178 + 128] = local178 * 262144 + 65535;
		}
		for (@Pc(198) int local198 = 0; local198 < 64; local198++) {
			Static23.anIntArray80[local198 + 192] = 16777215;
		}
		Static47.anIntArray143 = new int[256];
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static47.anIntArray143[local217] = local217 * 4;
		}
		for (@Pc(233) int local233 = 0; local233 < 64; local233++) {
			Static47.anIntArray143[local233 + 64] = local233 * 262144 + 255;
		}
		for (@Pc(254) int local254 = 0; local254 < 64; local254++) {
			Static47.anIntArray143[local254 + 128] = local254 * 1024 + 16711935;
		}
		for (@Pc(274) int local274 = 0; local274 < 64; local274++) {
			Static47.anIntArray143[local274 + 192] = 16777215;
		}
		Static44.anIntArray126 = new int[32768];
		Static59.anIntArray176 = new int[32768];
		Static81.anIntArray262 = new int[256];
		Static97.method1643(null);
		Static110.aBoolean136 = false;
		Static120.aClass34_1468 = Static120.aClass34_1469;
		Static76.anIntArray237 = new int[32768];
		Static49.anIntArray152 = new int[32768];
		if (Static7.anInt426 == 0) {
			Static28.aBoolean178 = true;
		} else {
			Static28.aBoolean178 = false;
		}
		Static77.anInt2084 = 0;
		Static120.aClass34_1461 = Static120.aClass34_1469;
		if (Static28.aBoolean178) {
			Static70.method1197();
		} else {
			Static34.method623(Static26.aClass34_417, Static32.aClass35_Sub1_12, Static120.aClass34_1469);
		}
		Static78.method1365(false);
		Static67.aBoolean95 = true;
		Static21.aClass1_Sub1_Sub2_Sub1_1.method192(0, 0);
		Static75.aClass1_Sub1_Sub2_Sub1_4.method192(382, 0);
		Static60.aClass1_Sub1_Sub2_Sub2_6.method542(382 - Static60.aClass1_Sub1_Sub2_Sub2_6.anInt883 / 2, 18);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZLclient!a;)V")
	public static void method1881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub1_Sub1 arg2) {
		if (arg0 == arg2.anInt1388 && arg0 != -1) {
			@Pc(19) int local19 = Static40.method687(arg0).anInt1200;
			if (local19 == 1) {
				arg2.anInt1416 = arg1;
				arg2.anInt1431 = 0;
				arg2.anInt1393 = 0;
				arg2.anInt1427 = 0;
			}
			if (local19 == 2) {
				arg2.anInt1427 = 0;
			}
		} else if (arg0 == -1 || arg2.anInt1388 == -1 || Static40.method687(arg0).anInt1194 >= Static40.method687(arg2.anInt1388).anInt1194) {
			arg2.anInt1388 = arg0;
			arg2.anInt1393 = 0;
			arg2.anInt1418 = arg2.anInt1417;
			arg2.anInt1416 = arg1;
			arg2.anInt1431 = 0;
			arg2.anInt1427 = 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1882() {
		aClass34_1448 = null;
		aClass35_30 = null;
		aClass34_1446 = null;
		anIntArray353 = null;
		aClass34_1447 = null;
		aClass34_1445 = null;
		anIntArray352 = null;
		aClass34_1449 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	public static void method1883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static21.aClass1_Sub19_Sub1_1.method2105(118);
		Static21.aClass1_Sub19_Sub1_1.method2043(arg1);
		Static21.aClass1_Sub19_Sub1_1.method2077(arg0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!ie;Lclient!ie;II)Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 method1884(@OriginalArg(0) int arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) int arg3) {
		return Static69.method1193(arg3, arg0, arg2) ? Static62.method1061(arg1.method1573(arg3, arg0)) : null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
	public static int method1885(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1887() {
		for (@Pc(12) int local12 = -1; local12 < Static40.anInt1154; local12++) {
			@Pc(22) int local22;
			if (local12 == -1) {
				local22 = 2047;
			} else {
				local22 = Static102.anIntArray321[local12];
			}
			@Pc(30) Class1_Sub1_Sub1_Sub1_Sub1 local30 = Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local22];
			if (local30 != null) {
				Static121.method1919(local30, 1);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1888(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}
}
