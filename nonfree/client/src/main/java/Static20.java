import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
	public static int anInt578;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!jd;")
	public static Class36 aClass36_15;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!cc;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
	public static int anInt577 = 0;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_285 = Static2.method66("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Lclient!ke;")
	public static Class39 aClass39_286 = Static2.method66("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[I")
	public static int[] anIntArray64 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static int anInt580 = 0;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt581 = 10;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static int anInt586 = 1;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public static int anInt587 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "[I")
	public static int[] anIntArray65 = new int[25];

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!ke;")
	public static Class39 aClass39_287 = Static2.method66("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!g;)Lclient!ke;")
	public static Class39 method429(@OriginalArg(1) Class2_Sub5 arg0) {
		return Static66.method1382(arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!ke;Lclient!ke;Lclient!jd;)Lclient!kb;")
	public static Class2_Sub1_Sub4_Sub2 method430(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class36 arg2) {
		@Pc(8) int local8 = arg2.method1774(arg0);
		@Pc(14) int local14 = arg2.method1754(arg1, local8);
		return Static15.method2040(local8, local14, arg2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[Lclient!ke;)Lclient!ke;")
	public static Class39 method431(@OriginalArg(1) Class39[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static45.method865(arg0.length, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method432() {
		aClass39_285 = null;
		aClass39_287 = null;
		aClass12_2 = null;
		anIntArray64 = null;
		anIntArray65 = null;
		aClass39_286 = null;
		aClass36_15 = null;
	}
}
