import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!vh;")
	public static Class250 aClass250_17;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!e", name = "r", descriptor = "I")
	public static int anInt1627 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BIII)V")
	public static void method1404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			Static55.method989(Static253.aClass131_119);
		}
		if (arg1 == 1) {
			Static55.method989(Static175.aClass131_88);
		}
		Static232.aClass1_Sub1_Sub1_2.method4092(arg0 + Static437.anInt7555);
		Static232.aClass1_Sub1_Sub1_2.method4101(arg2 + Static134.anInt5502);
		Static232.aClass1_Sub1_Sub1_2.method4098(Static102.aClass163_1.method3809(82) ? 1 : 0);
		Static3.anInt169 = arg2;
		Static261.aBoolean488 = false;
		Static270.anInt4850 = arg0;
		Static323.method4559();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLclient!vh;III)V")
	public static void method1407(@OriginalArg(2) Class250 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static37.anInt703 = 0;
		Static228.anInt4117 = arg2;
		Static296.aBoolean145 = false;
		Static363.anInt6199 = 10000;
		Static348.anInt5981 = arg1;
		Static144.anInt2452 = 1;
		Static32.aClass250_7 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
	public static void method1408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		@Pc(17) Class3[] local17 = Static444.aClass3Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Class3 local25 = local17[local19];
			if (local25 != null && local25.anInt171 == 2) {
				Static235.method3487(local25.anInt168, arg0 >> 1, arg3 >> 1, local25.anInt172, local25.anInt174 * 2, local25.anInt167);
				if (Static343.anIntArray470[0] > -1 && Static403.anInt6978 % 20 < 10) {
					Static233.aClass80Array10[local25.anInt165].method6099(Static343.anIntArray470[0] + arg2 - 12, arg1 - -Static343.anIntArray470[1] + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method1410() {
		Static405.aClass27_40.method566();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method1412() {
		if (!Static138.aBoolean128) {
			return;
		}
		@Pc(11) Class219 local11 = Static78.method1356(Static107.anInt1974, Static304.anInt5407);
		if (local11 != null && local11.anObjectArray25 != null) {
			@Pc(20) Class1_Sub6 local20 = new Class1_Sub6();
			local20.aClass219_4 = local11;
			local20.anObjectArray3 = local11.anObjectArray25;
			Static104.method1608(local20);
		}
		Static138.aBoolean128 = false;
		Static246.anInt4394 = -1;
		Static14.anInt338 = -1;
		if (local11 != null) {
			Static355.method4895(local11);
		}
	}
}
