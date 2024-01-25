import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "[S")
	public static short[] aShortArray23;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt1609 = 0;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt1610 = 0;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	public static int anInt1615 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!e;B)V")
	public static void method1659(@OriginalArg(0) Class46 arg0) {
		if (Static223.anInt5825 != Static219.anInt4400 && (Static98.aClass213ArrayArrayArray2 != null && Static6.method131(arg0, Static219.anInt4400))) {
			Static223.anInt5825 = Static219.anInt4400;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method1660(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static90.aBooleanArray6[arg0]) {
			return;
		}
		Static74.aClass143_99.method3744(arg0);
		if (Static182.aClass146ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static182.aClass146ArrayArray1[arg0].length; local28++) {
			if (Static182.aClass146ArrayArray1[arg0][local28] != null) {
				if (Static182.aClass146ArrayArray1[arg0][local28].anInt4135 == 2) {
					local26 = false;
				} else {
					Static182.aClass146ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static182.aClass146ArrayArray1[arg0] = null;
		}
		Static90.aBooleanArray6[arg0] = false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!mo;)V")
	public static void method1661(@OriginalArg(1) Class143 arg0) {
		Static27.aClass143_17 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void method1662(@OriginalArg(1) int arg0) {
		if (Static302.anInt5842 == arg0) {
			return;
		}
		if (Static302.anInt5842 == 0) {
			Static308.method4062();
		}
		if (arg0 == 40) {
			Static260.method4485();
		}
		if (arg0 != 40 && Static191.aClass159_4 != null) {
			Static191.aClass159_4.method4079();
			Static191.aClass159_4 = null;
		}
		if (Static302.anInt5842 == 25 || Static302.anInt5842 == 28) {
			Static185.aClass143_75.anInt4082 = 2;
			Static99.aClass143_53.anInt4082 = 2;
			Static213.aClass143_80.anInt4082 = 2;
			Static39.aClass143_25.anInt4082 = 2;
			Static272.aClass143_96.anInt4082 = 2;
			Static192.aClass143_77.anInt4082 = 2;
			Static127.aClass143_59.anInt4082 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static105.anInt2338 = 1;
			Static207.anInt4120 = 0;
			Static70.anInt1686 = 0;
			Static60.anInt1455 = 1;
			Static194.anInt3956 = 0;
			Static297.method5075(true);
			Static185.aClass143_75.anInt4082 = 1;
			Static99.aClass143_53.anInt4082 = 1;
			Static213.aClass143_80.anInt4082 = 1;
			Static39.aClass143_25.anInt4082 = 1;
			Static272.aClass143_96.anInt4082 = 1;
			Static192.aClass143_77.anInt4082 = 1;
			Static127.aClass143_59.anInt4082 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static319.method5486();
		}
		if (arg0 == 5) {
			Static92.method2160(Static348.aClass143_98, Static218.aClass46_5);
		} else {
			Static215.method3861();
		}
		@Pc(147) boolean local147 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(164) boolean local164 = Static302.anInt5842 == 5 || Static302.anInt5842 == 10 || Static302.anInt5842 == 28;
		if (local164 != local147) {
			if (local147) {
				Static313.anInt6044 = Static50.anInt1270;
				if (Static345.anInt6584 == 0) {
					Static137.method2766();
				} else {
					Static253.method1024(Static304.aClass143_106, Static50.anInt1270, 255);
				}
				Static155.aClass35_2.method1144(false);
			} else {
				Static137.method2766();
				Static155.aClass35_2.method1144(true);
				if (Static274.aClass97_1 != null) {
					Static274.aClass97_1.method2756();
					Static274.aClass97_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static218.aClass46_5.method5103();
		}
		Static302.anInt5842 = arg0;
	}
}
