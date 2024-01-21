import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "Lclient!ge;")
	public static Class7 aClass7_44;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_18;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1108 = Static80.method1463("hitmarks");

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1109 = Static80.method1463("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1111 = Static80.method1463("Loading friend list");

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1110 = aClass63_1111;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1112 = Static80.method1463("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	public static int anInt2117 = 0;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
	public static int anInt2120 = -1;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public static int anInt2121 = 2;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1113 = Static80.method1463("Nehmen");

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method1426() {
		aClass63_1111 = null;
		aClass63_1112 = null;
		aClass63_1108 = null;
		aClass63_1110 = null;
		aClass6_Sub3_Sub3_Sub3_18 = null;
		aClass63_1113 = null;
		aClass63_1109 = null;
		aClass7_44 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z")
	public static boolean method1427(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static2.anInt31 == arg1) {
			return true;
		} else if (arg0 == 1 && arg1 == Static21.anInt678) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && arg1 == Static65.anInt1838;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)V")
	public static void method1430(@OriginalArg(1) boolean arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static22.anInt689; local15++) {
			@Pc(26) int local26 = (Static80.anIntArray247[local15] << 14) + 536870912;
			@Pc(32) Class6_Sub3_Sub1_Sub2_Sub1 local32 = Static78.aClass6_Sub3_Sub1_Sub2_Sub1Array1[Static80.anIntArray247[local15]];
			if (local32 != null && local32.method1545() && arg0 == local32.aClass6_Sub3_Sub2_1.aBoolean26 && local32.aClass6_Sub3_Sub2_1.method366()) {
				@Pc(59) int local59 = local32.anInt2347 >> 7;
				@Pc(64) int local64 = local32.anInt2319 >> 7;
				if (local64 >= 0 && local64 < 104 && local59 >= 0 && local59 < 104) {
					if (local32.anInt2296 == 1 && (local32.anInt2319 & 0x7F) == 64 && (local32.anInt2347 & 0x7F) == 64) {
						if (Static64.anIntArrayArray27[local64][local59] == Static106.anInt2958) {
							continue;
						}
						Static64.anIntArrayArray27[local64][local59] = Static106.anInt2958;
					}
					if (!local32.aClass6_Sub3_Sub2_1.aBoolean28) {
						local26 += Integer.MIN_VALUE;
					}
					Static76.aClass19_1.method657(Static101.anInt2810, local32.anInt2319, local32.anInt2347, Static110.method2038(Static101.anInt2810, local32.anInt2296 * 64 + local32.anInt2347 - 64, -64 - -(local32.anInt2296 * 64) + local32.anInt2319), local32.anInt2296 * 64 - 4, local32, local32.anInt2301, local26, local32.aBoolean119);
				}
			}
		}
	}
}
