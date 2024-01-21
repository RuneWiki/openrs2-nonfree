import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static int anInt498;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "[[[Lclient!dd;")
	public static Class20[][][] aClass20ArrayArrayArray1 = new Class20[4][104][104];

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Lclient!ad;")
	public static Class4 aClass4_255 = Static75.method1216("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
	public static int[] anIntArray38 = new int[500];

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static int anInt496 = 0;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!ad;")
	public static Class4 aClass4_256 = Static75.method1216("Name des Gegenstands eingeben:");

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_257 = Static75.method1216("Privater Chat");

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt500 = 0;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	public static int anInt501 = 1;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method298() {
		aClass20ArrayArrayArray1 = null;
		aClass4_256 = null;
		aClass4_257 = null;
		aClass4_255 = null;
		anIntArray38 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!rd;ZILclient!rd;)V")
	public static void method299(@OriginalArg(0) Class64 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class64 arg2) {
		Static89.aClass64_58 = arg2;
		Static12.aClass64_13 = arg0;
		Static38.aBoolean250 = arg1;
		Static35.anInt672 = Static12.aClass64_13.method1637(10);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public static void method300() {
		try {
			@Pc(6) Graphics local6 = Static9.aCanvas1.getGraphics();
			Static88.aClass25_104.method1161(4, local6, 0);
			Static71.aClass25_83.method1161(357, local6, 0);
			Static38.aClass25_152.method1161(4, local6, 722);
			Static25.aClass25_38.method1161(205, local6, 743);
			Static90.aClass25_153.method1161(0, local6, 0);
			Static67.aClass25_75.method1161(4, local6, 516);
			Static47.aClass25_55.method1161(205, local6, 516);
			Static67.aClass25_76.method1161(357, local6, 496);
			Static89.aClass25_106.method1161(338, local6, 0);
		} catch (@Pc(67) Exception local67) {
			Static9.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method301() {
		Static45.aClass8_15.method198();
		Static65.aClass8_21.method198();
		Static94.aClass8_27.method198();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIILclient!rc;IIB)V")
	public static void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub14 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static104.aBoolean218) {
			Static107.anInt2707 = 32;
		} else {
			Static107.anInt2707 = 0;
		}
		Static104.aBoolean218 = false;
		if (arg2 <= arg6 && arg6 < arg2 + 16 && arg3 >= arg4 && arg4 + 16 > arg3) {
			if (arg0 == 1) {
				Static39.aBoolean74 = true;
			}
			if (arg0 == 2 || arg0 == 3) {
				Static86.aBoolean153 = true;
			}
			arg5.anInt2082 -= Static8.anInt299 * 4;
		} else if (arg6 >= arg2 && arg6 < arg2 + 16 && arg3 >= arg4 + arg1 - 16 && arg4 + arg1 > arg3) {
			arg5.anInt2082 += Static8.anInt299 * 4;
			if (arg0 == 2 || arg0 == 3) {
				Static86.aBoolean153 = true;
			}
			if (arg0 == 1) {
				Static39.aBoolean74 = true;
			}
		} else if (arg2 - Static107.anInt2707 <= arg6 && arg6 < arg2 + Static107.anInt2707 + 16 && arg3 >= arg4 + 16 && arg1 + arg4 - 16 > arg3 && Static8.anInt299 > 0) {
			if (arg0 == 1) {
				Static39.aBoolean74 = true;
			}
			Static104.aBoolean218 = true;
			if (arg0 == 2 || arg0 == 3) {
				Static86.aBoolean153 = true;
			}
			@Pc(121) int local121 = arg1 * (arg1 - 32) / arg7;
			if (local121 < 8) {
				local121 = 8;
			}
			@Pc(134) int local134 = arg1 - local121 - 32;
			@Pc(146) int local146 = arg3 - arg4 - local121 / 2 - 16;
			arg5.anInt2082 = local146 * (arg7 - arg1) / local134;
		}
	}
}
