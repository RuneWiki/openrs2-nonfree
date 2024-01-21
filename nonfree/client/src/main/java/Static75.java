import java.awt.Component;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "[Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array3;

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "Lclient!pa;")
	public static Class51 aClass51_10;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	public static int anInt454;

	@OriginalMember(owner = "client!oc", name = "X", descriptor = "Z")
	private static boolean aBoolean22;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "Lclient!ke;")
	private static Class39 aClass39_232 = Static2.method66("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_231 = aClass39_232;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "Lclient!ke;")
	private static Class39 aClass39_233 = Static2.method66("Bad session id)3");

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "[Lclient!ke;")
	public static Class39[] aClass39Array4 = new Class39[200];

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "Lclient!ke;")
	public static Class39 aClass39_234 = Static2.method66("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "Lclient!ke;")
	private static Class39 aClass39_238 = Static2.method66("The server is being updated)3");

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!ke;")
	public static Class39 aClass39_235 = aClass39_238;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "[I")
	public static int[] anIntArray53 = new int[256];

	@OriginalMember(owner = "client!oc", name = "R", descriptor = "Lclient!ke;")
	public static Class39 aClass39_236 = Static2.method66("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!oc", name = "U", descriptor = "Lclient!ke;")
	public static Class39 aClass39_237 = aClass39_233;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method360() {
		aClass39_238 = null;
		aCRC32_2 = null;
		aClass39_232 = null;
		aClass51_10 = null;
		anIntArray53 = null;
		aClass39_236 = null;
		aClass39_237 = null;
		aClass39_233 = null;
		aClass39Array4 = null;
		aClass39_235 = null;
		aClass39_231 = null;
		aClass39_234 = null;
		aClass2_Sub1_Sub4_Sub2Array3 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
	public static void method363(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static67.method1404(Static95.aClass39_1152, Static42.aClass39_533, Static61.aClass39_745);
		} else if (arg0 == -2) {
			Static67.method1404(Static61.aClass39_757, Static58.aClass39_714, Static61.aClass39_752);
		} else if (arg0 == -1) {
			Static67.method1404(Static94.aClass39_1133, Static42.aClass39_530, Static61.aClass39_753);
		} else if (arg0 == 3) {
			Static67.method1404(Static61.aClass39_765, Static65.aClass39_840, Static61.aClass39_755);
		} else if (arg0 == 4) {
			Static67.method1404(Static23.aClass39_305, Static89.aClass39_1079, Static61.aClass39_748);
		} else if (arg0 == 5) {
			Static67.method1404(Static83.aClass39_1031, Static88.aClass39_482, Static61.aClass39_751);
		} else if (arg0 == 6) {
			Static67.method1404(Static58.aClass39_725, Static62.aClass39_787, Static61.aClass39_738);
		} else if (arg0 == 7) {
			Static67.method1404(Static4.aClass39_43, Static22.aClass39_299, Static61.aClass39_756);
		} else if (arg0 == 8) {
			Static67.method1404(Static44.aClass39_548, Static31.aClass39_780, Static61.aClass39_747);
		} else if (arg0 == 9) {
			Static67.method1404(Static26.aClass39_366, Static67.aClass39_871, Static61.aClass39_758);
		} else if (arg0 == 10) {
			Static67.method1404(Static44.aClass39_551, aClass39_237, Static61.aClass39_750);
		} else if (arg0 == 11) {
			Static67.method1404(Static17.aClass39_261, Static92.aClass39_1103, Static61.aClass39_749);
		} else if (arg0 == 12) {
			Static67.method1404(aClass39_231, Static84.aClass39_1297, Static61.aClass39_760);
		} else if (arg0 == 13) {
			Static67.method1404(Static83.aClass39_1026, Static42.aClass39_532, Static61.aClass39_763);
		} else if (arg0 == 14) {
			Static67.method1404(aClass39_235, Static80.aClass39_988, Static61.aClass39_768);
		} else if (arg0 == 16) {
			Static67.method1404(Static92.aClass39_1102, Static80.aClass39_990, Static61.aClass39_759);
		} else if (arg0 == 17) {
			Static67.method1404(Static2.aClass39_40, Static66.aClass39_849, Static61.aClass39_762);
		} else if (arg0 == 18) {
			Static67.method1404(Static46.aClass39_570, Static62.aClass39_789, Static61.aClass39_739);
		} else if (arg0 == 20) {
			Static67.method1404(Static108.aClass39_1314, Static42.aClass39_531, Static61.aClass39_742);
		} else if (arg0 == 22) {
			Static67.method1404(Static39.aClass39_507, Static15.aClass39_1293, Static61.aClass39_761);
		} else if (arg0 == 23) {
			Static67.method1404(Static17.aClass39_259, Static80.aClass39_987, Static61.aClass39_767);
		} else if (arg0 == 24) {
			Static67.method1404(Static78.aClass39_967, Static82.aClass39_1006, Static61.aClass39_741);
		} else if (arg0 == 25) {
			Static67.method1404(Static49.aClass39_621, Static42.aClass39_529, Static61.aClass39_769);
		} else if (arg0 == 26) {
			Static67.method1404(Static45.aClass39_561, Static29.aClass39_386, Static61.aClass39_754);
		} else {
			Static67.method1404(Static109.aClass39_1340, Static42.aClass39_534, Static61.aClass39_744);
		}
		Static60.method1127(10);
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
	public static void method365() {
		if (Static39.anInt1172 != 1) {
			return;
		}
		if (Static2.anInt91 >= 539 && Static2.anInt91 <= 573 && Static93.anInt2442 >= 169 && Static93.anInt2442 < 205 && Static25.anIntArray81[0] != -1) {
			Static77.anInt2108 = 0;
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
		}
		if (Static2.anInt91 >= 569 && Static2.anInt91 <= 599 && Static93.anInt2442 >= 168 && Static93.anInt2442 < 205 && Static25.anIntArray81[1] != -1) {
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 1;
		}
		if (Static2.anInt91 >= 597 && Static2.anInt91 <= 627 && Static93.anInt2442 >= 168 && Static93.anInt2442 < 205 && Static25.anIntArray81[2] != -1) {
			Static107.aBoolean121 = true;
			Static97.aBoolean120 = true;
			Static77.anInt2108 = 2;
		}
		if (Static2.anInt91 >= 625 && Static2.anInt91 <= 669 && Static93.anInt2442 >= 168 && Static93.anInt2442 < 203 && Static25.anIntArray81[3] != -1) {
			Static77.anInt2108 = 3;
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
		}
		if (Static2.anInt91 >= 666 && Static2.anInt91 <= 696 && Static93.anInt2442 >= 168 && Static93.anInt2442 < 205 && Static25.anIntArray81[4] != -1) {
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 4;
		}
		if (Static2.anInt91 >= 694 && Static2.anInt91 <= 724 && Static93.anInt2442 >= 168 && Static93.anInt2442 < 205 && Static25.anIntArray81[5] != -1) {
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 5;
			Static97.aBoolean120 = true;
		}
		if (Static2.anInt91 >= 722 && Static2.anInt91 <= 756 && Static93.anInt2442 >= 169 && Static93.anInt2442 < 205 && Static25.anIntArray81[6] != -1) {
			Static97.aBoolean120 = true;
			Static77.anInt2108 = 6;
			Static107.aBoolean121 = true;
		}
		if (Static2.anInt91 >= 540 && Static2.anInt91 <= 574 && Static93.anInt2442 >= 466 && Static93.anInt2442 < 502 && Static25.anIntArray81[7] != -1) {
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 7;
			Static97.aBoolean120 = true;
		}
		if (Static2.anInt91 >= 572 && Static2.anInt91 <= 602 && Static93.anInt2442 >= 466 && Static93.anInt2442 < 503 && Static25.anIntArray81[8] != -1) {
			Static77.anInt2108 = 8;
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
		}
		if (Static2.anInt91 >= 599 && Static2.anInt91 <= 629 && Static93.anInt2442 >= 466 && Static93.anInt2442 < 503 && Static25.anIntArray81[9] != -1) {
			Static107.aBoolean121 = true;
			Static97.aBoolean120 = true;
			Static77.anInt2108 = 9;
		}
		if (Static2.anInt91 >= 627 && Static2.anInt91 <= 671 && Static93.anInt2442 >= 467 && Static93.anInt2442 < 502 && Static25.anIntArray81[10] != -1) {
			Static77.anInt2108 = 10;
			Static107.aBoolean121 = true;
			Static97.aBoolean120 = true;
		}
		if (Static2.anInt91 >= 669 && Static2.anInt91 <= 699 && Static93.anInt2442 >= 466 && Static93.anInt2442 < 503 && Static25.anIntArray81[11] != -1) {
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 11;
		}
		if (Static2.anInt91 >= 696 && Static2.anInt91 <= 726 && Static93.anInt2442 >= 466 && Static93.anInt2442 < 503 && Static25.anIntArray81[12] != -1) {
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 12;
			Static97.aBoolean120 = true;
		}
		if (Static2.anInt91 >= 724 && Static2.anInt91 <= 758 && Static93.anInt2442 >= 466 && Static93.anInt2442 < 502 && Static25.anIntArray81[13] != -1) {
			Static97.aBoolean120 = true;
			Static107.aBoolean121 = true;
			Static77.anInt2108 = 13;
			return;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method370(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static45.aClass55_1);
		arg0.removeFocusListener(Static45.aClass55_1);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IIIII)V")
	public static void method374(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = arg3; local7 <= arg3 + arg2; local7++) {
			for (@Pc(13) int local13 = arg0; local13 <= arg0 + arg1; local13++) {
				if (local13 >= 0 && local13 < 104 && local7 >= 0 && local7 < 104) {
					Static64.aByteArrayArrayArray3[0][local13][local7] = 127;
					if (arg0 == local13 && local13 > 0) {
						Static22.anIntArrayArrayArray3[0][local13][local7] = Static22.anIntArrayArrayArray3[0][local13 - 1][local7];
					}
					if (arg0 + arg1 == local13 && local13 < 103) {
						Static22.anIntArrayArrayArray3[0][local13][local7] = Static22.anIntArrayArrayArray3[0][local13 + 1][local7];
					}
					if (local7 == arg3 && local7 > 0) {
						Static22.anIntArrayArrayArray3[0][local13][local7] = Static22.anIntArrayArrayArray3[0][local13][local7 - 1];
					}
					if (arg2 + arg3 == local7 && local7 < 103) {
						Static22.anIntArrayArrayArray3[0][local13][local7] = Static22.anIntArrayArrayArray3[0][local13][local7 + 1];
					}
				}
			}
		}
	}
}
