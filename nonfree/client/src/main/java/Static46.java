import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "Lclient!pd;")
	public static Class20 aClass20_28;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Lclient!ja;")
	private static Class39 aClass39_704 = Static28.method504("wave:");

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_700 = aClass39_704;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_701 = Static28.method504("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Z")
	public static boolean aBoolean53 = false;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_702 = Static28.method504("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_703 = Static28.method504("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_705 = Static28.method504("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!ja;")
	private static Class39 aClass39_706 = Static28.method504("Loading textures )2 ");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!ja;")
	public static Class39 aClass39_707 = aClass39_704;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_708 = aClass39_706;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!he;Z)Lclient!ja;")
	public static Class39 method767(@OriginalArg(0) Class4_Sub5 arg0) {
		if (Static65.method1151(Static20.method385(arg0)) == 0) {
			return null;
		} else if (arg0.aClass39_719 == null || arg0.aClass39_719.method957().method953() == 0) {
			return Static67.aBoolean96 ? Static7.aClass39_203 : null;
		} else {
			return arg0.aClass39_719;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	public static void method768() {
		for (@Pc(7) int local7 = 0; local7 < Static30.anInt785; local7++) {
			@Pc(13) int local13 = Static35.anIntArray101[local7];
			@Pc(17) Class4_Sub2_Sub1_Sub1_Sub1 local17 = Static44.aClass4_Sub2_Sub1_Sub1_Sub1Array1[local13];
			@Pc(23) int local23 = Static35.aClass4_Sub16_Sub1_1.method1474();
			if ((local23 & 0x40) != 0) {
				local23 += Static35.aClass4_Sub16_Sub1_1.method1474() << 8;
			}
			Static19.method342(local23, local17, local13);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!pd;)V")
	public static void method769(@OriginalArg(1) Class20 arg0) {
		Static51.aClass20_49 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method770() {
		aClass39_705 = null;
		aClass39_701 = null;
		aClass39_706 = null;
		aClass39_704 = null;
		aClass20_28 = null;
		aClass39_703 = null;
		aClass39_708 = null;
		aClass39_707 = null;
		aClass39_702 = null;
		aClass39_700 = null;
	}
}
