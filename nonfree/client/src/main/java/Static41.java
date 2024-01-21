import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1538 = Static151.method2243("Checking for updates )2 ");

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1537 = aClass62_1538;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public static int anInt4503 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
	public static int anInt4504 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static64.anInt1343 < 100) {
			Static32.method563();
		}
		Static212.method3095(arg0, arg2, arg3 + arg0, arg2 + arg1);
		Static45.method700();
		Static212.method3103(arg0, arg2, arg3, arg1, 0);
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (Static64.anInt1343 < 100) {
			local36 = arg0 + arg3 / 2;
			local47 = arg1 / 2 + arg2 - 18 - 20;
			Static212.method3106(local36 - 152, local47, 304, 34, 9179409);
			Static212.method3106(local36 - 151, local47 + 1, 302, 32, 0);
			Static212.method3103(local36 - 150, local47 + 2, Static64.anInt1343 * 3, 30, 9179409);
			Static212.method3103(local36 + Static64.anInt1343 * 3 - 150, local47 + 2, 300 - Static64.anInt1343 * 3, 30, 0);
			Static47.aClass2_Sub1_Sub12_3.method1370(Static170.aClass62_1278, local36, local47 + 20, 16777215, -1);
			return;
		}
		Static216.anInt4526 = Static142.anInt3025 - (int) ((double) arg3 / Static136.aDouble113);
		Static3.anInt138 = (int) ((double) (arg1 * 2) / Static136.aDouble113);
		Static48.anInt1043 = Static50.anInt1085 - (int) ((double) arg1 / Static136.aDouble113);
		@Pc(141) int local141 = Static142.anInt3025 - (int) ((double) arg3 / Static136.aDouble113);
		local47 = (int) ((double) arg3 / Static136.aDouble113) + Static142.anInt3025;
		local36 = Static50.anInt1085 - (int) ((double) arg1 / Static136.aDouble113);
		@Pc(172) int local172 = Static50.anInt1085 + (int) ((double) arg1 / Static136.aDouble113);
		Static123.anInt4489 = (int) ((double) (arg3 * 2) / Static136.aDouble113);
		Static162.method2385(local36, arg0, arg2, local47, local141, arg1 + arg2, local172, arg3 + arg0);
		Static179.method2590(local36, arg1 + arg2, arg0, local172, local47, arg0 + arg3, local141, arg2);
		if (Static167.anInt3570 > 0) {
			Static167.anInt3570--;
		}
		if (!Static137.aBoolean126) {
			return;
		}
		@Pc(223) int local223 = arg2 + arg1 - 8;
		@Pc(225) int local225 = 16776960;
		@Pc(231) int local231 = arg0 + arg3 - 5;
		Static13.aClass2_Sub1_Sub12_2.method1374(Static169.method2460(new Class62[] { Static186.aClass62_1361, Static119.method1865(Static165.anInt3491) }), local231, local223, 16776960, -1);
		@Pc(253) Runtime local253 = Runtime.getRuntime();
		@Pc(263) int local263 = (int) ((local253.totalMemory() - local253.freeMemory()) / 1024L);
		@Pc(264) int local264 = local223 - 15;
		if (local263 > 32768 && Static60.aBoolean52) {
			local225 = 16711680;
		}
		if (local263 > 65536 && !Static60.aBoolean52) {
			local225 = 16711680;
		}
		Static13.aClass2_Sub1_Sub12_2.method1374(Static169.method2460(new Class62[] { Static1.aClass62_12, Static119.method1865(local263), Static14.aClass62_100 }), local231, local264, local225, -1);
		local223 = local264 - 15;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lclient!di;")
	public static Class2_Sub4 method3189(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class2_Sub4_Sub21();
		} else if (arg0 == 1) {
			return new Class2_Sub4_Sub2();
		} else if (arg0 == 2) {
			return new Class2_Sub4_Sub20();
		} else if (arg0 == 3) {
			return new Class2_Sub4_Sub24();
		} else if (arg0 == 4) {
			return new Class2_Sub4_Sub31();
		} else if (arg0 == 5) {
			return new Class2_Sub4_Sub29();
		} else if (arg0 == 6) {
			return new Class2_Sub4_Sub34();
		} else if (arg0 == 7) {
			return new Class2_Sub4_Sub32();
		} else if (arg0 == 8) {
			return new Class2_Sub4_Sub14();
		} else if (arg0 == 9) {
			return new Class2_Sub4_Sub13();
		} else if (arg0 == 10) {
			return new Class2_Sub4_Sub28();
		} else if (arg0 == 11) {
			return new Class2_Sub4_Sub16();
		} else if (arg0 == 12) {
			return new Class2_Sub4_Sub3();
		} else if (arg0 == 13) {
			return new Class2_Sub4_Sub1();
		} else if (arg0 == 14) {
			return new Class2_Sub4_Sub39();
		} else if (arg0 == 15) {
			return new Class2_Sub4_Sub25();
		} else if (arg0 == 16) {
			return new Class2_Sub4_Sub23();
		} else if (arg0 == 17) {
			return new Class2_Sub4_Sub27();
		} else if (arg0 == 18) {
			return new Class2_Sub4_Sub12_Sub1();
		} else if (arg0 == 19) {
			return new Class2_Sub4_Sub22();
		} else if (arg0 == 20) {
			return new Class2_Sub4_Sub18();
		} else if (arg0 == 21) {
			return new Class2_Sub4_Sub9();
		} else if (arg0 == 22) {
			return new Class2_Sub4_Sub26();
		} else if (arg0 == 23) {
			return new Class2_Sub4_Sub35();
		} else if (arg0 == 24) {
			return new Class2_Sub4_Sub10();
		} else if (arg0 == 25) {
			return new Class2_Sub4_Sub19();
		} else if (arg0 == 26) {
			return new Class2_Sub4_Sub5();
		} else if (arg0 == 27) {
			return new Class2_Sub4_Sub33();
		} else if (arg0 == 28) {
			return new Class2_Sub4_Sub37();
		} else if (arg0 == 29) {
			return new Class2_Sub4_Sub8();
		} else if (arg0 == 30) {
			return new Class2_Sub4_Sub30();
		} else if (arg0 == 31) {
			return new Class2_Sub4_Sub36();
		} else if (arg0 == 32) {
			return new Class2_Sub4_Sub7();
		} else if (arg0 == 33) {
			return new Class2_Sub4_Sub17();
		} else if (arg0 == 34) {
			return new Class2_Sub4_Sub4();
		} else if (arg0 == 35) {
			return new Class2_Sub4_Sub6();
		} else if (arg0 == 36) {
			return new Class2_Sub4_Sub38();
		} else if (arg0 == 37) {
			return new Class2_Sub4_Sub15();
		} else if (arg0 == 38) {
			return new Class2_Sub4_Sub11();
		} else if (arg0 == 39) {
			return new Class2_Sub4_Sub12();
		} else {
			return null;
		}
	}
}
