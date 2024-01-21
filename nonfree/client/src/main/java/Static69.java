import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Z")
	public static boolean aBoolean49;

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "Lclient!kb;")
	public static Class41 aClass41_11;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "Lclient!gd;")
	public static Class28 aClass28_46 = new Class28(64);

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	public static int anInt1603 = 0;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	public static int anInt1605 = 127;

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!af;")
	public static Class5 aClass5_801 = Static45.method1937("Neuer Benutzer");

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "Lclient!af;")
	public static Class5 aClass5_802 = Static45.method1937("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!af;")
	public static Class5 aClass5_803 = Static45.method1937("p11_full");

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!lb", name = "B", descriptor = "Lclient!af;")
	private static Class5 aClass5_806 = Static45.method1937("Ok");

	@OriginalMember(owner = "client!lb", name = "z", descriptor = "Lclient!af;")
	public static Class5 aClass5_804 = aClass5_806;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "Lclient!af;")
	public static Class5 aClass5_805 = Static45.method1937("(U");

	@OriginalMember(owner = "client!lb", name = "C", descriptor = "Lclient!af;")
	public static Class5 aClass5_807 = Static45.method1937("gr-Un:");

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Lclient!af;")
	public static Class5 aClass5_808 = Static45.method1937("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	public static void method1210(@OriginalArg(0) int arg0) {
		Static80.anInt2006 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!kb;IBI)[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] method1211(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static58.method1055(arg2, arg1, arg0) ? Static11.method286() : null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public static void method1212() {
		aClass5_806 = null;
		aClass5_801 = null;
		aClass28_46 = null;
		aClass5_808 = null;
		aClass41_11 = null;
		aClass5_807 = null;
		aClass5_805 = null;
		aClass5_804 = null;
		aClass5_803 = null;
		aClass5_802 = null;
	}
}
