import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!rd", name = "S", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array11;

	@OriginalMember(owner = "client!rd", name = "V", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "Lclient!uc;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "I")
	public static int anInt4465;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "Z")
	public static boolean aBoolean219 = false;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
	public static int anInt4460 = -1;

	@OriginalMember(owner = "client!rd", name = "jb", descriptor = "J")
	public static long aLong145 = 0L;

	@OriginalMember(owner = "client!rd", name = "nb", descriptor = "Ljava/lang/String;")
	public static String aString302 = null;

	@OriginalMember(owner = "client!rd", name = "pb", descriptor = "I")
	public static int anInt4469 = 0;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)Z")
	public static boolean method3367() {
		try {
			if (Static143.anInt3473 == 2) {
				if (Static251.aClass1_Sub26_2 == null) {
					Static251.aClass1_Sub26_2 = Static277.method3545(Static39.aClass51_14, Static47.anInt1387, Static54.anInt1501);
					if (Static251.aClass1_Sub26_2 == null) {
						return false;
					}
				}
				if (Static184.aClass149_1 == null) {
					Static184.aClass149_1 = new Class149(Static82.aClass51_25, Static119.aClass51_40);
				}
				if (Static13.aClass1_Sub4_Sub2_1.method1230(Static251.aClass1_Sub26_2, Static184.aClass149_1, Static86.aClass51_30)) {
					Static13.aClass1_Sub4_Sub2_1.method1252();
					Static13.aClass1_Sub4_Sub2_1.method1239(Static194.anInt4334);
					Static13.aClass1_Sub4_Sub2_1.method1231(Static172.aBoolean196, Static251.aClass1_Sub26_2);
					Static143.anInt3473 = 0;
					Static39.aClass51_14 = null;
					Static184.aClass149_1 = null;
					Static251.aClass1_Sub26_2 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static13.aClass1_Sub4_Sub2_1.method1220();
			Static39.aClass51_14 = null;
			Static143.anInt3473 = 0;
			Static184.aClass149_1 = null;
			Static251.aClass1_Sub26_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BLjava/lang/String;)I")
	public static int method3368(@OriginalArg(1) String arg0) {
		if (Static254.aClass151_2 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < Static254.aClass151_2.anInt5555; local17++) {
			if (Static48.method983(Static254.aClass151_2.aStringArray39[local17], " ", "<br>").equals(arg0)) {
				return local17;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)V")
	public static void method3369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(39) String local39 = "::tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local39);
		Static198.method3474(local39);
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)I")
	public static int method3371(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 + arg0 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = (local15 * 15731 * local15 + 789221) * local15 + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}
}
