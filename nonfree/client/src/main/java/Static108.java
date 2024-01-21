import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ta", name = "Hb", descriptor = "Z")
	public static boolean aBoolean135;

	@OriginalMember(owner = "client!ta", name = "Wb", descriptor = "Ljava/lang/String;")
	public static String aString5;

	@OriginalMember(owner = "client!ta", name = "Z", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1492 = Static33.method650("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!ta", name = "ab", descriptor = "[Lclient!oa;")
	public static Class56[] aClass56Array11 = new Class56[5];

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1494 = Static33.method650("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "I")
	public static int anInt2715 = 0;

	@OriginalMember(owner = "client!ta", name = "rb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1495 = Static33.method650("Select a world");

	@OriginalMember(owner = "client!ta", name = "zb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1497 = Static33.method650("Drop");

	@OriginalMember(owner = "client!ta", name = "yb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1496 = aClass56_1497;

	@OriginalMember(owner = "client!ta", name = "Eb", descriptor = "Z")
	public static boolean aBoolean134 = false;

	@OriginalMember(owner = "client!ta", name = "Pb", descriptor = "[S")
	public static short[] aShortArray10 = new short[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 };

	@OriginalMember(owner = "client!ta", name = "ac", descriptor = "Lclient!ld;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ta", name = "ec", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1498 = aClass56_1495;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
	public static int method1820(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLclient!td;)Lclient!oa;")
	public static Class56 method1822(@OriginalArg(1) Class3_Sub1_Sub16 arg0) {
		if (Static126.method2013(Static34.method652(arg0)) == 0) {
			return null;
		} else if (arg0.aClass56_1538 == null || arg0.aClass56_1538.method1425().method1426() == 0) {
			return Static67.aBoolean105 ? Static30.aClass56_493 : null;
		} else {
			return arg0.aClass56_1538;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!oa;)Z")
	public static boolean method1824(@OriginalArg(1) Class56 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static42.anInt1124; local11++) {
			if (arg0.method1418(Static113.aClass56Array15[local11])) {
				return true;
			}
		}
		return arg0.method1418(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass56_764);
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public static void method1826() {
		aShortArray10 = null;
		aString5 = null;
		aClass56_1494 = null;
		aClass56_1497 = null;
		aClass56_1492 = null;
		aClass56Array11 = null;
		aClass56_1496 = null;
		aClass56_1498 = null;
		aClass56_1495 = null;
	}
}
