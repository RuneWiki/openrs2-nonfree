import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
	public static int anInt2205;

	@OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
	public static int anInt2206;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "Lclient!la;")
	public static Class17 aClass17_29;

	@OriginalMember(owner = "client!ab", name = "Q", descriptor = "Lclient!dc;")
	public static Class17_Sub1 aClass17_Sub1_17;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Lclient!ua;")
	public static Class72 aClass72_22 = new Class72(50);

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "Lclient!ua;")
	public static Class72 aClass72_23 = new Class72(100);

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "Lclient!v;")
	private static Class76 aClass76_981 = Static134.method2017("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	public static int anInt2202 = -1;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "Lclient!v;")
	public static Class76 aClass76_982 = aClass76_981;

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
	public static int anInt2204 = 0;

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "[I")
	public static int[] anIntArray310 = new int[] { 2, 0, 8, 0, 6, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, -2, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 6, 0, 0, 4, 0, 0, 6, 0, 0, 2, 0, 0, 2, 0, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, -2, 0, 11, 0, 4, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 14, 0, 0, 2, 0, 1, 0, 0, 0, 0, 0, 5, 0, -1, 0, 3, 5, 6, 0, 0, 0, -2, 4, 0, 0, -1, 0, 0, 0, -2, 0, 0, 6, 0, 6, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 4, 0, 0, 0, 0, -2, 5, 3, 0, -2, 11, 10, 0, 5, 0, 0, 0, 0, 2, 24, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 6, 7, 0, -1, 0, 0, 0, 0, 6, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 4, 0, 0, 3, 0, 0, 0, 1, -2, 0, 8, 12, 0, 0, 0, 10, -1, 0, 0, 2, 0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!ab", name = "R", descriptor = "Lclient!v;")
	public static Class76 aClass76_983 = Static134.method2017("<img=1>");

	@OriginalMember(owner = "client!ab", name = "S", descriptor = "Lclient!v;")
	public static Class76 aClass76_984 = Static134.method2017(":tradereq:");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method1518() {
		aClass76_984 = null;
		aClass17_Sub1_17 = null;
		aClass76_982 = null;
		aClass76_981 = null;
		aClass76_983 = null;
		aClass72_22 = null;
		aClass72_23 = null;
		aClass17_29 = null;
		anIntArray310 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III)V")
	public static void method1519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static32.anInt808 != 0 && arg0 != -1) {
			Static99.method1943(arg0, Static32.anInt808, 0, Static95.aClass17_Sub1_18);
			Static18.aBoolean22 = true;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(JZ)V")
	public static void method1520(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static45.anInt1192 >= 100) {
			Static21.method328(0, Static133.aClass76_1322, Static35.aClass76_417);
			return;
		}
		@Pc(27) Class76 local27 = Static56.method983(arg0).method1858();
		for (@Pc(29) int local29 = 0; local29 < Static45.anInt1192; local29++) {
			if (arg0 == Static31.aLongArray17[local29]) {
				Static21.method328(0, Static133.aClass76_1322, Static59.method1017(new Class76[] { local27, Static87.aClass76_838 }));
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static104.anInt2337; local64++) {
			if (arg0 == Static100.aLongArray55[local64]) {
				Static21.method328(0, Static133.aClass76_1322, Static59.method1017(new Class76[] { Static28.aClass76_234, local27, Static105.aClass76_1104 }));
				return;
			}
		}
		if (local27.method1878(Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass76_612)) {
			Static21.method328(0, Static133.aClass76_1322, Static92.aClass76_967);
			return;
		}
		Static31.aLongArray17[Static45.anInt1192] = arg0;
		Static75.aClass76Array20[Static45.anInt1192++] = Static56.method983(arg0);
		Static72.anInt1883 = Static36.anInt1031;
		Static69.aClass4_Sub10_Sub1_2.method611(194);
		Static69.aClass4_Sub10_Sub1_2.method555(arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!v;")
	public static Class76 method1521(@OriginalArg(0) int arg0) {
		return Static59.method1017(new Class76[] { Static63.method1092(arg0 >> 24 & 0xFF), Static33.aClass76_389, Static63.method1092(arg0 >> 16 & 0xFF), Static33.aClass76_389, Static63.method1092(arg0 >> 8 & 0xFF), Static33.aClass76_389, Static63.method1092(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
	public static void method1526(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static77.anInt1960; local7++) {
			if (arg3 < Static41.anIntArray131[local7] + Static134.anIntArray409[local7] && Static41.anIntArray131[local7] < arg3 + arg0 && arg1 < Static126.anIntArray396[local7] + Static30.anIntArray185[local7] && arg1 + arg2 > Static126.anIntArray396[local7]) {
				Static70.aBooleanArray9[local7] = true;
			}
		}
	}
}
