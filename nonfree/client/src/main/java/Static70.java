import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Lclient!wa;")
	public static Class23 aClass23_29;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
	public static int anInt1544 = -2;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_519 = Static161.method2452("as it was used to break our rules)3");

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
	public static int anInt1549 = 0;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "[I")
	public static final int[] anIntArray140 = new int[5];

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "[Lclient!dc;")
	public static final Class20[] aClass20Array7 = new Class20[200];

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_520 = Static161.method2452("Clientscript error in: ");

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lclient!dc;")
	public static Class20 aClass20_521 = aClass20_519;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ce;Lclient!dc;I)I")
	public static int method1165(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) Class20 arg1) {
		@Pc(6) int local6 = arg0.anInt4050;
		arg0.method3068(arg1.anInt712);
		arg0.anInt4050 += Static130.aClass107_1.method3125(0, arg1.aByteArray10, arg1.anInt712, arg0.anInt4050, arg0.aByteArray56);
		return arg0.anInt4050 - local6;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([Lclient!dc;I)Lclient!dc;")
	public static Class20 method1166(@OriginalArg(0) Class20[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static167.method2536(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(B)V")
	public static void method1167() {
		if (Static19.aString2.toLowerCase().indexOf("microsoft") != -1) {
			Static160.anIntArray350[190] = 72;
			Static160.anIntArray350[192] = 58;
			Static160.anIntArray350[219] = 42;
			Static160.anIntArray350[186] = 57;
			Static160.anIntArray350[222] = 59;
			Static160.anIntArray350[191] = 73;
			Static160.anIntArray350[223] = 28;
			Static160.anIntArray350[220] = 74;
			Static160.anIntArray350[189] = 26;
			Static160.anIntArray350[188] = 71;
			Static160.anIntArray350[221] = 43;
			Static160.anIntArray350[187] = 27;
			return;
		}
		Static160.anIntArray350[47] = 73;
		Static160.anIntArray350[46] = 72;
		Static160.anIntArray350[44] = 71;
		Static160.anIntArray350[45] = 26;
		Static160.anIntArray350[61] = 27;
		Static160.anIntArray350[59] = 57;
		Static160.anIntArray350[92] = 74;
		Static160.anIntArray350[93] = 43;
		Static160.anIntArray350[91] = 42;
		if (Static19.aMethod2 == null) {
			Static160.anIntArray350[192] = 58;
			Static160.anIntArray350[222] = 59;
		} else {
			Static160.anIntArray350[520] = 59;
			Static160.anIntArray350[222] = 58;
			Static160.anIntArray350[192] = 28;
		}
	}
}
