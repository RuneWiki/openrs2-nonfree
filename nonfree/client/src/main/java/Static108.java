import java.awt.Component;
import java.awt.Image;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_25;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_16;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "[I")
	public static int[] anIntArray328;

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!te;")
	public static Class75 aClass75_68 = new Class75(100);

	@OriginalMember(owner = "client!te", name = "u", descriptor = "Lclient!na;")
	private static Class53 aClass53_1243 = Static109.method1737("World");

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!na;")
	public static Class53 aClass53_1240 = aClass53_1243;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "I")
	public static int anInt2484 = -1;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	public static int anInt2485 = 0;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!na;")
	private static Class53 aClass53_1246 = Static109.method1737("Private chat");

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_1241 = aClass53_1246;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_1242 = Static109.method1737("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!te", name = "v", descriptor = "[I")
	public static int[] anIntArray329 = new int[25];

	@OriginalMember(owner = "client!te", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1244 = aClass53_1243;

	@OriginalMember(owner = "client!te", name = "F", descriptor = "Lclient!na;")
	private static Class53 aClass53_1247 = Static109.method1737(" is already on your ignore list");

	@OriginalMember(owner = "client!te", name = "C", descriptor = "Lclient!na;")
	public static Class53 aClass53_1245 = aClass53_1247;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "[I")
	public static int[] anIntArray330 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!qe;B)V")
	public static void method1722(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		arg0.aBoolean54 = false;
		if (arg0.anInt1436 != -1) {
			@Pc(17) Class3_Sub1_Sub11 local17 = Static97.method1629(arg0.anInt1436);
			if (local17 == null || local17.anIntArray306 == null) {
				arg0.anInt1436 = -1;
			} else {
				arg0.anInt1472++;
				if (local17.anIntArray306.length > arg0.anInt1415 && local17.anIntArray305[arg0.anInt1415] < arg0.anInt1472) {
					arg0.anInt1472 = 1;
					arg0.anInt1415++;
					Static35.method759(local17, arg0.anInt1415, arg0.anInt1427, arg0.anInt1424);
				}
				if (local17.anIntArray306.length <= arg0.anInt1415) {
					arg0.anInt1472 = 0;
					arg0.anInt1415 = 0;
					Static35.method759(local17, arg0.anInt1415, arg0.anInt1427, arg0.anInt1424);
				}
			}
		}
		@Pc(126) Class3_Sub1_Sub11 local126;
		if (arg0.anInt1439 != -1 && arg0.anInt1469 <= Static27.anInt843) {
			if (arg0.anInt1431 < 0) {
				arg0.anInt1431 = 0;
			}
			@Pc(119) int local119 = Static89.method1461(arg0.anInt1439).anInt359;
			if (local119 == -1) {
				arg0.anInt1439 = -1;
			} else {
				local126 = Static97.method1629(local119);
				if (local126 == null || local126.anIntArray306 == null) {
					arg0.anInt1439 = -1;
				} else {
					arg0.anInt1459++;
					if (arg0.anInt1431 < local126.anIntArray306.length && local126.anIntArray305[arg0.anInt1431] < arg0.anInt1459) {
						arg0.anInt1431++;
						arg0.anInt1459 = 1;
						Static35.method759(local126, arg0.anInt1431, arg0.anInt1427, arg0.anInt1424);
					}
					if (arg0.anInt1431 >= local126.anIntArray306.length && (arg0.anInt1431 < 0 || local126.anIntArray306.length <= arg0.anInt1431)) {
						arg0.anInt1439 = -1;
					}
				}
			}
		}
		if (arg0.anInt1442 != -1 && arg0.anInt1460 <= 1) {
			local126 = Static97.method1629(arg0.anInt1442);
			if (local126.anInt2253 == 1 && arg0.anInt1420 > 0 && Static27.anInt843 >= arg0.anInt1462 && Static27.anInt843 > arg0.anInt1416) {
				arg0.anInt1460 = 1;
				return;
			}
		}
		if (arg0.anInt1442 != -1 && arg0.anInt1460 == 0) {
			local126 = Static97.method1629(arg0.anInt1442);
			if (local126 == null || local126.anIntArray306 == null) {
				arg0.anInt1442 = -1;
			} else {
				arg0.anInt1456++;
				if (local126.anIntArray306.length > arg0.anInt1422 && local126.anIntArray305[arg0.anInt1422] < arg0.anInt1456) {
					arg0.anInt1456 = 1;
					arg0.anInt1422++;
					Static35.method759(local126, arg0.anInt1422, arg0.anInt1427, arg0.anInt1424);
				}
				if (arg0.anInt1422 >= local126.anIntArray306.length) {
					arg0.anInt1422 -= local126.anInt2251;
					arg0.anInt1466++;
					if (local126.anInt2244 <= arg0.anInt1466) {
						arg0.anInt1442 = -1;
					} else if (arg0.anInt1422 >= 0 && local126.anIntArray306.length > arg0.anInt1422) {
						Static35.method759(local126, arg0.anInt1422, arg0.anInt1427, arg0.anInt1424);
					} else {
						arg0.anInt1442 = -1;
					}
				}
				arg0.aBoolean54 = local126.aBoolean92;
			}
		}
		if (arg0.anInt1460 > 0) {
			arg0.anInt1460--;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/awt/Component;)V")
	public static void method1723(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static41.aClass5_1);
		arg0.removeFocusListener(Static41.aClass5_1);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)Lclient!na;")
	public static Class53 method1725(@OriginalArg(0) int arg0) {
		return Static27.method518(arg0, false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
	public static void method1726() {
		Static119.aClass75_12.method1724();
		Static79.aClass75_56.method1724();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method1729(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyChar();
		if (local2 <= 0 || local2 >= 256) {
			local2 = -1;
		}
		return local2;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method1731() {
		aClass53_1243 = null;
		aClass53_1246 = null;
		aClass75_68 = null;
		aClass53_1240 = null;
		anIntArray328 = null;
		aClass53_1244 = null;
		aClass53_1241 = null;
		aClass62_Sub1_16 = null;
		aClass53_1247 = null;
		aClass53_1245 = null;
		anIntArray329 = null;
		aClass53_1242 = null;
		anImage4 = null;
		anIntArray330 = null;
		aClass3_Sub1_Sub5_Sub3_25 = null;
	}
}
