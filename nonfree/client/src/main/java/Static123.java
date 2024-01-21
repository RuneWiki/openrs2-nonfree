import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!va", name = "C", descriptor = "I")
	public static int anInt3044;

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	public static int anInt3048;

	@OriginalMember(owner = "client!va", name = "z", descriptor = "I")
	public static int anInt3042 = 0;

	@OriginalMember(owner = "client!va", name = "B", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1631 = Static28.method504("va");

	@OriginalMember(owner = "client!va", name = "E", descriptor = "Z")
	public static boolean aBoolean150 = false;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1635 = Static28.method504("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!va", name = "G", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1632 = aClass39_1635;

	@OriginalMember(owner = "client!va", name = "I", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1634 = Static28.method504(" ");

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1633 = aClass39_1634;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(B)Z")
	public static boolean method2102() {
		try {
			if (Static40.anInt1002 == 2) {
				if (Static120.aClass4_Sub4_1 == null) {
					Static120.aClass4_Sub4_1 = Static132.method518(Static14.aClass20_10, Static20.anInt563, Static78.anInt1860);
					if (Static120.aClass4_Sub4_1 == null) {
						return false;
					}
				}
				if (Static7.aClass13_1 == null) {
					Static7.aClass13_1 = new Class13(Static73.aClass20_36, Static40.aClass20_24);
				}
				if (Static80.aClass4_Sub1_Sub1_2.method77(Static85.aClass20_43, Static120.aClass4_Sub4_1, Static7.aClass13_1)) {
					Static80.aClass4_Sub1_Sub1_2.method87();
					Static80.aClass4_Sub1_Sub1_2.method88(Static130.anInt3174);
					Static80.aClass4_Sub1_Sub1_2.method76(Static77.aBoolean100, Static120.aClass4_Sub4_1);
					Static14.aClass20_10 = null;
					Static7.aClass13_1 = null;
					Static40.anInt1002 = 0;
					Static120.aClass4_Sub4_1 = null;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static80.aClass4_Sub1_Sub1_2.method80();
			Static7.aClass13_1 = null;
			Static120.aClass4_Sub4_1 = null;
			Static40.anInt1002 = 0;
			Static14.aClass20_10 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
	public static void method2103() {
		aClass39_1632 = null;
		aClass39_1634 = null;
		aClass39_1635 = null;
		aClass39_1633 = null;
		aClass39_1631 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(JB)V")
	public static void method2104(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static48.anInt1254 >= 100 && Static40.anInt992 != 1 || Static48.anInt1254 >= 200) {
			Static40.method672(0, Static93.aClass39_1794, Static72.aClass39_423);
			return;
		}
		@Pc(39) Class39 local39 = Static94.method1699(arg0).method955();
		for (@Pc(41) int local41 = 0; local41 < Static48.anInt1254; local41++) {
			if (Static80.aLongArray4[local41] == arg0) {
				Static40.method672(0, Static62.method1123(new Class39[] { local39, Static45.aClass39_693 }), Static72.aClass39_423);
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static83.anInt2086; local76++) {
			if (arg0 == Static42.aLongArray3[local76]) {
				Static40.method672(0, Static62.method1123(new Class39[] { Static32.aClass39_437, local39, Static35.aClass39_459 }), Static72.aClass39_423);
				return;
			}
		}
		if (local39.method968(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass39_1279)) {
			Static40.method672(0, Static63.aClass39_866, Static72.aClass39_423);
			return;
		}
		Static131.aClass39Array23[Static48.anInt1254] = local39;
		Static80.aLongArray4[Static48.anInt1254] = arg0;
		Static114.anIntArray307[Static48.anInt1254] = 0;
		Static32.anIntArray93[Static48.anInt1254] = 0;
		Static4.anInt88 = Static129.anInt3153;
		Static48.anInt1254++;
		Static114.aClass4_Sub16_Sub1_3.method1499(50);
		Static114.aClass4_Sub16_Sub1_3.method1457(arg0);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBI)V")
	public static void method2105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static67.anInt1693 == 1) {
			Static93.aClass4_Sub2_Sub3_Sub1Array12[Static85.anInt2127 / 100].method876(Static59.anInt1568 - 8, Static84.anInt2111 + -8);
		}
		if (Static67.anInt1693 == 2) {
			Static93.aClass4_Sub2_Sub3_Sub1Array12[Static85.anInt2127 / 100 + 4].method876(Static59.anInt1568 - 8, Static84.anInt2111 + -8);
		}
		Static4.method85();
		if (!Static106.aBoolean129) {
			return;
		}
		@Pc(53) int local53 = arg1 + 512 - 5;
		@Pc(57) int local57 = arg2 + 20;
		Static71.aClass4_Sub2_Sub3_Sub3_4.method1283(Static62.method1123(new Class39[] { Static80.aClass39_1019, Static29.method510(Static73.anInt1765) }), local53, local57, 16776960, -1);
		@Pc(79) Runtime local79 = Runtime.getRuntime();
		@Pc(81) int local81 = 16776960;
		@Pc(90) int local90 = (int) ((local79.totalMemory() - local79.freeMemory()) / 1024L);
		if (local90 > 32768 && aBoolean150) {
			local81 = 16711680;
		}
		local57 += 15;
		if (local90 > 65536 && !aBoolean150) {
			local81 = 16711680;
		}
		Static71.aClass4_Sub2_Sub3_Sub3_4.method1283(Static62.method1123(new Class39[] { Static102.aClass39_1328, Static29.method510(local90), Static10.aClass39_231 }), local53, local57, local81, -1);
		local57 += 15;
	}
}
