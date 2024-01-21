import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_527 = Static51.method932("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public static int anInt1160 = 0;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!sa;")
	public static Class72 aClass72_12 = new Class72(30);

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Lclient!cd;")
	private static Class10 aClass10_532 = Static51.method932("Unable to find ");

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "Lclient!cd;")
	public static Class10 aClass10_528 = aClass10_532;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Lclient!cd;")
	private static Class10 aClass10_531 = Static51.method932("Loading title screen )2 ");

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!cd;")
	public static Class10 aClass10_529 = aClass10_531;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	public static int anInt1166 = 1;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "[S")
	public static short[] aShortArray12 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "Lclient!cd;")
	public static Class10 aClass10_530 = Static51.method932("blinken2:");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!cd;II)V")
	public static void method883(@OriginalArg(0) int arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(4) Class23 local4 = Static14.method222(arg2, arg3);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray25 != null) {
			@Pc(18) Class2_Sub18 local18 = new Class2_Sub18();
			local18.anInt2884 = arg0;
			local18.aClass23_9 = local4;
			local18.aClass10_1247 = arg1;
			local18.anObjectArray29 = local4.anObjectArray25;
			Static47.method881(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt1088 > 0) {
			local36 = Static36.method758(local4);
		}
		if (!local36 || !Static29.method618(arg0 - 1, Static126.method2068(local4))) {
			return;
		}
		if (arg0 == 1) {
			Static141.aClass2_Sub11_Sub1_3.method1495(145);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 2) {
			Static141.aClass2_Sub11_Sub1_3.method1495(216);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 3) {
			Static141.aClass2_Sub11_Sub1_3.method1495(181);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 4) {
			Static141.aClass2_Sub11_Sub1_3.method1495(87);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 5) {
			Static141.aClass2_Sub11_Sub1_3.method1495(226);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 6) {
			Static141.aClass2_Sub11_Sub1_3.method1495(134);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 7) {
			Static141.aClass2_Sub11_Sub1_3.method1495(172);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 8) {
			Static141.aClass2_Sub11_Sub1_3.method1495(215);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 9) {
			Static141.aClass2_Sub11_Sub1_3.method1495(26);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
		if (arg0 == 10) {
			Static141.aClass2_Sub11_Sub1_3.method1495(103);
			Static141.aClass2_Sub11_Sub1_3.method1445(arg2);
			Static141.aClass2_Sub11_Sub1_3.method1479(arg3);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method888() {
		aClass10_527 = null;
		aClass10_530 = null;
		aShortArray12 = null;
		aClass10_531 = null;
		aClass10_532 = null;
		aClass10_528 = null;
		aClass10_529 = null;
		aClass72_12 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!bb;)V")
	public static void method889(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub2 arg1) {
		if (Static14.anInt386 < arg1.anInt3461) {
			Static109.method1749(arg1);
		} else if (arg1.anInt3488 >= Static14.anInt386) {
			Static4.method50(arg1);
		} else {
			Static74.method2108(arg1);
		}
		if (arg1.anInt3454 < 128 || arg1.anInt3499 < 128 || arg1.anInt3454 >= 13184 || arg1.anInt3499 >= 13184) {
			arg1.anInt3488 = 0;
			arg1.anInt3461 = 0;
			arg1.anInt3508 = -1;
			arg1.anInt3499 = arg1.anInt3467 * 64 + arg1.anIntArray366[0] * 128;
			arg1.anInt3454 = arg1.anIntArray365[0] * 128 + arg1.anInt3467 * 64;
			arg1.anInt3509 = -1;
			arg1.method2463();
		}
		if (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1 == arg1 && (arg1.anInt3454 < 1536 || arg1.anInt3499 < 1536 || arg1.anInt3454 >= 11776 || arg1.anInt3499 >= 11776)) {
			arg1.anInt3454 = arg1.anIntArray365[0] * 128 + arg1.anInt3467 * 64;
			arg1.anInt3508 = -1;
			arg1.anInt3488 = 0;
			arg1.anInt3499 = arg1.anInt3467 * 64 + arg1.anIntArray366[0] * 128;
			arg1.anInt3509 = -1;
			arg1.anInt3461 = 0;
			arg1.method2463();
		}
		Static30.method642(arg1);
		Static4.method54(arg1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!mh;IZ)V")
	public static void method890(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(2) int local2 = arg0.anInt2387;
		@Pc(10) int local10 = (int) arg0.aLong139;
		arg0.method2705();
		if (arg1) {
			Static8.method157(local2);
		}
		Static139.method2196(local2);
		@Pc(29) Class23 local29 = Static102.method2541(local10);
		if (local29 != null) {
			Static3.method34(local29);
		}
		Static46.anInt1135 = 0;
		Static119.aBoolean119 = false;
		Static98.method1627(Static119.anInt2712, Static107.anInt2462, Static159.anInt3393, Static167.anInt2027);
		if (Static107.anInt2446 != -1) {
			Static144.method2255(Static107.anInt2446, 1);
		}
	}
}
