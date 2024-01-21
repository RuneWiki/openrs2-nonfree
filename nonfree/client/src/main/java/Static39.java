import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	public static int anInt1092;

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	public static int anInt1093;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	public static int anInt1094;

	@OriginalMember(owner = "client!ga", name = "I", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Lclient!oc;")
	public static Class56 aClass56_37;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!fc;")
	public static Class25 aClass25_458 = Static78.method1313("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "Lclient!fc;")
	private static Class25 aClass25_461 = Static78.method1313(" from your ignore list first");

	@OriginalMember(owner = "client!ga", name = "D", descriptor = "Lclient!fc;")
	public static Class25 aClass25_459 = aClass25_461;

	@OriginalMember(owner = "client!ga", name = "H", descriptor = "Lclient!fc;")
	public static Class25 aClass25_460 = Static78.method1313("null");

	@OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
	public static int anInt1095 = 0;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
	public static int anInt1101 = 0;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
	public static int anInt1104 = 127;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public static void method888() {
		aClass56_37 = null;
		aClass25_458 = null;
		aClass25_459 = null;
		aByteArrayArrayArray5 = null;
		aClass25_460 = null;
		aClass25_461 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
	public static void method889(@OriginalArg(1) boolean arg0) {
		if (Static71.aClass74_2.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && Static71.aClass74_2.anEventQueue1.peekEvent() != null; local11++) {
			Static53.method1782(1L);
		}
		if (arg0) {
			Static71.aClass74_2.anEventQueue1.postEvent(new ActionEvent(Static119.aCanvas1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ob;B)Z")
	public static boolean method890(@OriginalArg(0) Class1_Sub2_Sub14 arg0) {
		if (Static34.aBoolean37) {
			if (Static77.method1300(arg0) != 0) {
				return false;
			}
			if (arg0.anInt1960 == 0) {
				return false;
			}
		}
		return arg0.aBoolean89;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!of;B)V")
	public static void method891(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static11.anInt277 != 1) {
			return;
		}
		if (Static30.anInt815 >= 280 && Static30.anInt815 <= 294 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(0, 0);
			return;
		}
		if (Static30.anInt815 >= 295 && Static30.anInt815 <= 360 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(0, 1);
			return;
		}
		if (Static30.anInt815 >= 390 && Static30.anInt815 <= 404 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(1, 0);
			return;
		}
		if (Static30.anInt815 >= 405 && Static30.anInt815 <= 470 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(1, 1);
			return;
		}
		if (Static30.anInt815 >= 500 && Static30.anInt815 <= 514 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(2, 0);
			return;
		}
		if (Static30.anInt815 >= 515 && Static30.anInt815 <= 580 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(2, 1);
			return;
		}
		if (Static30.anInt815 >= 610 && Static30.anInt815 <= 624 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(3, 0);
			return;
		}
		if (Static30.anInt815 >= 625 && Static30.anInt815 <= 690 && Static23.anInt675 >= 4 && Static23.anInt675 <= 18) {
			Static50.method988(3, 1);
			return;
		}
		if (Static30.anInt815 >= 708 && Static23.anInt675 >= 4 && Static30.anInt815 <= 758 && Static23.anInt675 <= 20) {
			Static93.aBoolean103 = false;
			Static57.aClass1_Sub2_Sub2_Sub1_13.method207(0, 0);
			Static98.aClass1_Sub2_Sub2_Sub1_16.method207(382, 0);
			Static76.aClass1_Sub2_Sub2_Sub4_12.method1953(382 - Static76.aClass1_Sub2_Sub2_Sub4_12.anInt2756 / 2, 18);
			return;
		}
		if (Static21.anInt604 == -1) {
			return;
		}
		@Pc(262) Class11 local262 = Static120.aClass11Array1[Static21.anInt604];
		if (local262.aBoolean7 == Static23.aBoolean21) {
			@Pc(282) byte[] local282 = Static116.method1859(new Class25[] { local262.aClass25_145, Static65.aClass25_669 }).method802();
			Static52.aString1 = new String(local282, 0, local282.length);
			if (Static32.anInt898 != 0) {
				Static102.anInt2365 = 43594;
				Static69.anInt1483 = 43594;
				Static32.anInt898 = 0;
				Static55.anInt1307 = 443;
			}
			Static93.aBoolean103 = false;
			Static48.anInt1226 = local262.anInt275;
			Static57.aClass1_Sub2_Sub2_Sub1_13.method207(0, 0);
			Static98.aClass1_Sub2_Sub2_Sub1_16.method207(382, 0);
			Static76.aClass1_Sub2_Sub2_Sub4_12.method1953(382 - Static76.aClass1_Sub2_Sub2_Sub4_12.anInt2756 / 2, 18);
			return;
		}
		@Pc(382) Class25 local382 = Static116.method1859(new Class25[] { Static112.aClass25_1277, local262.aClass25_145, Static65.aClass25_669, Static92.aClass25_983, Static81.aClass25_859, Static74.method1214(Static63.aBoolean55 ? 1 : 0), Static2.aClass25_31, Static74.method1214(Static81.anInt1800), Static111.aClass25_1256, Static74.method1214(Static55.anInt1314) });
		try {
			arg0.getAppletContext().showDocument(local382.method766(), "_self");
		} catch (@Pc(391) Exception local391) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method892() {
		Static119.aClass63_25.method1513();
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
	public static void method893() {
		Static121.aClass63_26.method1513();
		Static24.aClass63_2.method1513();
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
	public static void method894() {
		for (@Pc(12) int local12 = 0; local12 < Static59.anInt1356; local12++) {
			@Pc(18) int local18 = Static85.anIntArray336[local12];
			@Pc(22) Class1_Sub2_Sub3_Sub4_Sub2 local22 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local18];
			@Pc(26) int local26 = Static35.aClass1_Sub5_Sub1_1.method672();
			if ((local26 & 0x80) != 0) {
				local26 += Static35.aClass1_Sub5_Sub1_1.method672() << 8;
			}
			Static90.method1516(local22, local18, local26);
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	public static void method895() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}
}
