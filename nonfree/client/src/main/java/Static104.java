import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public static int anInt2954;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "[S")
	public static short[] aShortArray25;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Lclient!u;")
	public static Class76 aClass76_86;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "Lclient!rf;")
	private static Class70 aClass70_953 = Static49.method1293("Attack");

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!rf;")
	public static Class70 aClass70_952 = aClass70_953;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "Lclient!rf;")
	private static Class70 aClass70_956 = Static49.method1293("Loaded title screen");

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_954 = aClass70_956;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_955 = Static49.method1293("Neuer Benutzer");

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_16 = new Class25(30);

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!rf;")
	public static Class70 aClass70_957 = Static49.method1293("(U2");

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
	public static int anInt2959 = 0;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public static int anInt2960 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
	public static void method2188() {
		aClass25_16 = null;
		aClass70_957 = null;
		aClass70_956 = null;
		aClass70_953 = null;
		aClass70_954 = null;
		aClass76_86 = null;
		aShortArray25 = null;
		aClass70_952 = null;
		aClass70_955 = null;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
	public static void method2189(@OriginalArg(1) int arg0) {
		if (Static106.method2213(arg0)) {
			Static98.method2114(Static77.aClass39ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!qh;)V")
	public static void method2190(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.aBoolean147 = false;
		if (arg0.aClass1_Sub20_5 != null) {
			arg0.aClass1_Sub20_5.anInt3735 = 0;
		}
		for (@Pc(18) Class1_Sub8 local18 = arg0.method2942(); local18 != null; local18 = arg0.method2937()) {
			method2190(local18);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ue;II)V")
	public static void method2191(@OriginalArg(0) Class76_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static119.aClass1_Sub9_2 == null) {
			Static85.method1885(255, 255, (byte) 0, true, null, 0);
			Static103.aClass76_Sub1Array1[arg1] = arg0;
		} else {
			Static119.aClass1_Sub9_2.anInt1592 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static119.aClass1_Sub9_2.method1273();
			@Pc(20) int local20 = Static119.aClass1_Sub9_2.method1273();
			arg0.method3337(local20, local16);
		}
	}
}
