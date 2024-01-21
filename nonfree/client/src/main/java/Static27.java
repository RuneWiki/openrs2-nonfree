import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3 aClass5_Sub1_Sub10_Sub3_15;

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "Lclient!nb;")
	public static Class24 aClass24_6;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "Lclient!ie;")
	public static Class35 aClass35_1;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Lclient!nb;")
	public static Class24 aClass24_7;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_440 = Static38.method736("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "[I")
	public static int[] anIntArray94 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
	public static int[] anIntArray95 = new int[1000];

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_441 = Static38.method736("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_442 = Static38.method736("(U4");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!nb;II)[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] method568(@OriginalArg(1) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static6.method156(arg0, arg1, arg2) ? Static72.method1202() : null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BZ)V")
	public static void method569(@OriginalArg(1) boolean arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static90.anInt3005; local15++) {
			@Pc(23) Class5_Sub1_Sub1_Sub3_Sub1 local23 = Static106.aClass5_Sub1_Sub1_Sub3_Sub1Array1[Static61.anIntArray175[local15]];
			@Pc(31) int local31 = (Static61.anIntArray175[local15] << 14) + 536870912;
			if (local23 != null && local23.method1680() && local23.aClass5_Sub1_Sub16_1.aBoolean124 == arg0 && local23.aClass5_Sub1_Sub16_1.method1895()) {
				@Pc(56) int local56 = local23.anInt2474 >> 7;
				@Pc(61) int local61 = local23.anInt2452 >> 7;
				if (local56 >= 0 && local56 < 104 && local61 >= 0 && local61 < 104) {
					if (local23.anInt2475 == 1 && (local23.anInt2474 & 0x7F) == 64 && (local23.anInt2452 & 0x7F) == 64) {
						if (Static91.anInt2117 == Static2.anIntArrayArray23[local56][local61]) {
							continue;
						}
						Static2.anIntArrayArray23[local56][local61] = Static91.anInt2117;
					}
					if (!local23.aClass5_Sub1_Sub16_1.aBoolean123) {
						local31 += Integer.MIN_VALUE;
					}
					Static7.aClass43_1.method1094(Static23.anInt728, local23.anInt2474, local23.anInt2452, Static26.method989((local23.anInt2475 - 1) * 64 + local23.anInt2474, Static23.anInt728, local23.anInt2452 + (local23.anInt2475 - 1) * 64), (local23.anInt2475 - 1) * 64 + 60, local23, local23.anInt2456, local31, local23.aBoolean105);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method570(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	public static void method571(@OriginalArg(0) int arg0) {
		if (Static90.anInt3001 == arg0) {
			return;
		}
		if (Static90.anInt3001 == 0) {
			Static49.method954();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static74.anInt913 = 0;
			Static105.anInt2401 = 0;
			Static23.anInt731 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && aClass35_1 != null) {
			aClass35_1.method961();
			aClass35_1 = null;
		}
		if (Static90.anInt3001 == 25 || Static90.anInt3001 == 40) {
			Static16.method424();
			Static52.method2021();
		}
		if (Static90.anInt3001 == 25) {
			Static106.anInt2500 = 1;
			Static10.anInt304 = 0;
			Static104.anInt3010 = 1;
			Static97.anInt2317 = 0;
			Static85.anInt2048 = 0;
		}
		if (arg0 == 35) {
			Static17.method479();
			Static26.method987();
			if (Static107.aClass7_78 == null) {
				Static107.aClass7_78 = Static37.method463(765, 503, Static105.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static107.aClass7_78 = null;
			Static17.method479();
			Static42.method768(Static48.aClass24_Sub1_13, Static30.aClass24_Sub1_7, Static105.aCanvas1);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static107.aClass7_78 = null;
			Static26.method987();
			Static71.method1179(Static105.aCanvas1, Static48.aClass24_Sub1_13);
		}
		Static90.anInt3001 = arg0;
		Static73.aBoolean87 = true;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method572() {
		aClass24_7 = null;
		anIntArray95 = null;
		aClass71_441 = null;
		aClass5_Sub1_Sub10_Sub3_15 = null;
		aClass24_6 = null;
		aClass71_440 = null;
		aClass71_442 = null;
		anIntArray93 = null;
		anIntArray94 = null;
		aClass35_1 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIII)V")
	public static void method573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(15) int local15 = arg0; local15 <= arg0 + arg2; local15++) {
			for (@Pc(19) int local19 = arg3; local19 <= arg3 + arg1; local19++) {
				if (local19 >= 0 && local19 < 104 && local15 >= 0 && local15 < 104) {
					Static23.aByteArrayArrayArray1[0][local19][local15] = 127;
					if (arg3 == local19 && local19 > 0) {
						Static51.anIntArrayArrayArray3[0][local19][local15] = Static51.anIntArrayArrayArray3[0][local19 - 1][local15];
					}
					if (arg1 + arg3 == local19 && local19 < 103) {
						Static51.anIntArrayArrayArray3[0][local19][local15] = Static51.anIntArrayArrayArray3[0][local19 + 1][local15];
					}
					if (local15 == arg0 && local15 > 0) {
						Static51.anIntArrayArrayArray3[0][local19][local15] = Static51.anIntArrayArrayArray3[0][local19][local15 - 1];
					}
					if (local15 == arg0 + arg2 && local15 < 103) {
						Static51.anIntArrayArrayArray3[0][local19][local15] = Static51.anIntArrayArrayArray3[0][local19][local15 + 1];
					}
				}
			}
		}
	}
}
