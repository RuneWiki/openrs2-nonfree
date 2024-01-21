import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!f", name = "I", descriptor = "[Lclient!bg;")
	public static Class1_Sub2_Sub1_Sub4[] aClass1_Sub2_Sub1_Sub4Array7;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "I")
	public static int anInt1493;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Lclient!ac;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!f", name = "F", descriptor = "I")
	public static int anInt1489 = -1;

	@OriginalMember(owner = "client!f", name = "N", descriptor = "Lclient!dd;")
	private static Class13 aClass13_516 = Static161.method2971("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!f", name = "K", descriptor = "Lclient!dd;")
	public static Class13 aClass13_515 = aClass13_516;

	@OriginalMember(owner = "client!f", name = "P", descriptor = "[Lclient!kd;")
	public static Class1_Sub2_Sub2_Sub2_Sub2[] aClass1_Sub2_Sub2_Sub2_Sub2Array1 = new Class1_Sub2_Sub2_Sub2_Sub2[2048];

	@OriginalMember(owner = "client!f", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_517 = Static161.method2971(":assistreq:");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!e;Ljava/lang/Object;B)V")
	public static void method1185(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static181.method2982(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(B)V")
	public static void method1186() {
		aClass1_Sub2_Sub2_Sub2_Sub2Array1 = null;
		anIntArray153 = null;
		aClass3_1 = null;
		aClass13_515 = null;
		aClass13_516 = null;
		aClass13_517 = null;
		aClass1_Sub2_Sub1_Sub4Array7 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!dd;IZ)V")
	public static void method1187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class13 arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class20 local4 = Static15.method628(arg3, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray19 != null) {
			@Pc(18) Class1_Sub23 local18 = new Class1_Sub23();
			local18.aClass20_13 = local4;
			local18.aClass13_1386 = arg2;
			local18.anObjectArray29 = local4.anObjectArray19;
			local18.anInt4017 = arg0;
			Static1.method43(local18);
		}
		@Pc(36) boolean local36 = true;
		if (local4.anInt1586 > 0) {
			local36 = Static48.method1223(local4);
		}
		if (!local36 || !Static43.method1140(arg0 - 1, Static53.method1292(local4))) {
			return;
		}
		if (arg0 == 1) {
			Static1.aClass1_Sub8_Sub1_1.method1654(57);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 2) {
			Static1.aClass1_Sub8_Sub1_1.method1654(54);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 3) {
			Static1.aClass1_Sub8_Sub1_1.method1654(219);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 4) {
			Static1.aClass1_Sub8_Sub1_1.method1654(36);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 5) {
			Static1.aClass1_Sub8_Sub1_1.method1654(215);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 6) {
			Static1.aClass1_Sub8_Sub1_1.method1654(222);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 7) {
			Static1.aClass1_Sub8_Sub1_1.method1654(24);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 8) {
			Static1.aClass1_Sub8_Sub1_1.method1654(56);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 9) {
			Static1.aClass1_Sub8_Sub1_1.method1654(218);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
		if (arg0 == 10) {
			Static1.aClass1_Sub8_Sub1_1.method1654(108);
			Static1.aClass1_Sub8_Sub1_1.method1635(arg3);
			Static1.aClass1_Sub8_Sub1_1.method1650(arg1);
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!sb;")
	public static RuntimeException_Sub1 method1188(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString5 = local9.aString5 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
