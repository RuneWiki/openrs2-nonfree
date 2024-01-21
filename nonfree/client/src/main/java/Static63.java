import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_36;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!c;")
	public static Class12 aClass12_43 = new Class12(500);

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!ja;")
	public static Class39 aClass39_865 = Static28.method504("Registrierter Benutzer");

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	public static int[] anIntArray176 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Lclient!ja;")
	private static Class39 aClass39_868 = Static28.method504("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_866 = aClass39_868;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_867 = Static28.method504("me");

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!ja;")
	private static Class39 aClass39_869 = Static28.method504("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_870 = aClass39_869;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public static volatile int anInt1642 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!ja;)Z")
	public static boolean method1128(@OriginalArg(1) Class39 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static48.anInt1254; local11++) {
			if (arg0.method954(Static131.aClass39Array23[local11])) {
				return true;
			}
		}
		return arg0.method954(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.aClass39_1279);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)V")
	public static void method1129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static14.anInt371 != 0 && Static14.anInt371 != 3 || Static62.anInt1637 != 1) {
			return;
		}
		@Pc(27) int local27 = Static27.anInt741 - arg0 - 25;
		@Pc(34) int local34 = Static1.anInt9 - arg1 - 5;
		if (local27 < 0 || local34 < 0 || local27 >= 146 || local34 >= 151) {
			return;
		}
		local27 -= 73;
		local34 -= 75;
		@Pc(60) int local60 = Static45.anInt1164 + Static54.anInt1446 & 0x7FF;
		@Pc(64) int local64 = Class4_Sub2_Sub3_Sub2.anIntArray155[local60];
		@Pc(68) int local68 = Class4_Sub2_Sub3_Sub2.anIntArray152[local60];
		@Pc(76) int local76 = local64 * (Static105.anInt2051 + 256) >> 8;
		@Pc(84) int local84 = local68 * (Static105.anInt2051 + 256) >> 8;
		@Pc(95) int local95 = local76 * local34 - local27 * local84 >> 11;
		@Pc(105) int local105 = local76 * local27 + local34 * local84 >> 11;
		@Pc(112) int local112 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641 - local95 >> 7;
		@Pc(120) int local120 = Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643 + local105 >> 7;
		@Pc(140) boolean local140 = Static64.method1147(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray300[0], local112, local120, 0, 1, true, 0, 0, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anIntArray296[0], 0, 0);
		if (!local140) {
			return;
		}
		Static114.aClass4_Sub16_Sub1_3.method1459(local27);
		Static114.aClass4_Sub16_Sub1_3.method1459(local34);
		Static114.aClass4_Sub16_Sub1_3.method1488(Static54.anInt1446);
		Static114.aClass4_Sub16_Sub1_3.method1459(57);
		Static114.aClass4_Sub16_Sub1_3.method1459(Static45.anInt1164);
		Static114.aClass4_Sub16_Sub1_3.method1459(Static105.anInt2051);
		Static114.aClass4_Sub16_Sub1_3.method1459(89);
		Static114.aClass4_Sub16_Sub1_3.method1488(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643);
		Static114.aClass4_Sub16_Sub1_3.method1488(Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641);
		Static114.aClass4_Sub16_Sub1_3.method1459(Static40.anInt997);
		Static114.aClass4_Sub16_Sub1_3.method1459(63);
		return;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZIZ)I")
	public static int method1130() {
		return Static2.anInt16 + Static13.anInt349;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public static void method1131() {
		aClass39_869 = null;
		aClass39_868 = null;
		aClass12_43 = null;
		aClass39_866 = null;
		anIntArray176 = null;
		aClass39_865 = null;
		aClass39_870 = null;
		aClass4_Sub5_36 = null;
		aClass39_867 = null;
	}
}
