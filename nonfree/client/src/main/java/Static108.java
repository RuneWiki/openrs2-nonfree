import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!mh", name = "F", descriptor = "Lclient!vb;")
	public static Class82 aClass82_40;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "Lclient!na;")
	public static Class1_Sub2_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!mh", name = "lb", descriptor = "[S")
	public static short[] aShortArray24;

	@OriginalMember(owner = "client!mh", name = "D", descriptor = "Z")
	public static final boolean aBoolean102 = false;

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "[I")
	public static int[] anIntArray250 = new int[128];

	@OriginalMember(owner = "client!mh", name = "kb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_841 = Static120.method2057("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!mh", name = "Ab", descriptor = "I")
	public static int anInt2415 = 0;

	@OriginalMember(owner = "client!mh", name = "Hb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_842 = Static120.method2057("(Y<)4col>");

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V")
	public static void method1801() {
		Static37.anInt977 = 0;
		Static106.anInt2330 = 0;
		Static70.anInt1716 = 0;
		Static98.anInt2162 = 0;
		Static149.aBoolean145 = false;
		Static92.anInt2058 = -1;
		Static86.anInt1952 = -1;
		Static43.anInt1082 = -1;
		Static172.anInt3987 = -1;
		Static104.aClass1_Sub8_Sub1_2.anInt446 = 0;
		Static118.anInt2616 = 0;
		Static89.anInt4029 = 0;
		Static21.aClass1_Sub8_Sub1_1.anInt446 = 0;
		for (@Pc(35) int local35 = 0; local35 < Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1.length; local35++) {
			if (Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local35] != null) {
				Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local35].anInt3052 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11.length; local53++) {
			if (Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local53] != null) {
				Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local53].anInt3052 = -1;
			}
		}
		Static19.method395();
		Static142.method2392(30);
		for (@Pc(76) int local76 = 0; local76 < 100; local76++) {
			Static87.aBooleanArray11[local76] = true;
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!ud;ZI)V")
	public static void method1805(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static178.aClass1_Sub8_5 == null) {
			Static110.method1956(0, null, (byte) 0, 255, true, 255);
			Static149.aClass82_Sub1Array1[arg1] = arg0;
		} else {
			Static178.aClass1_Sub8_5.anInt446 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static178.aClass1_Sub8_5.method347();
			@Pc(20) int local20 = Static178.aClass1_Sub8_5.method347();
			arg0.method2973(local20, local16);
		}
	}

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V")
	public static void method1810() {
		anIntArray250 = null;
		aClass1_Sub2_Sub2_Sub2_Sub1_2 = null;
		aShortArray24 = null;
		aClass81_842 = null;
		aClass82_40 = null;
		aClass81_841 = null;
	}
}
