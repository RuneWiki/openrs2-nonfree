import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4 aClass3_Sub1_Sub3_Sub4_7;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "Lclient!f;")
	public static Class13 aClass13_7;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!ih;")
	public static Class39 aClass39_2;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
	public static int[] anIntArray77 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!sd;")
	private static Class73 aClass73_479 = Static122.method531(" has logged in)3");

	@OriginalMember(owner = "client!df", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_477 = aClass73_479;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!sd;")
	public static Class73 aClass73_478 = Static122.method531("mod_icons");

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public static int anInt820 = 0;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	public static int anInt821 = 0;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Lclient!sd;")
	public static Class73 aClass73_480 = Static122.method531("<col=ff9040>");

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!sd;")
	public static Class73 aClass73_481 = Static122.method531("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_482 = Static122.method531("::");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	public static void method600() {
		aClass73_479 = null;
		aClass73_482 = null;
		aClass39_2 = null;
		anIntArray77 = null;
		aClass13_7 = null;
		aClass73_481 = null;
		aClass73_477 = null;
		aClass73_480 = null;
		aClass73_478 = null;
		aClass3_Sub1_Sub3_Sub4_7 = null;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method601() {
		@Pc(5) Class64 local5 = Static117.aClass64_1;
		synchronized (Static117.aClass64_1) {
			Static45.anInt1056 = Static91.anInt2029;
			Static37.anInt899 = Static5.anInt108;
			Static5.anInt107 = Static176.anInt3866;
			Static2.anInt7 = Static162.anInt3536;
			Static61.anInt1463 = Static168.anInt3654;
			Static51.anInt1243 = Static65.anInt1534;
			Static126.aLong137 = Static132.aLong141;
			Static162.anInt3536 = 0;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!f;ILclient!hb;ZLclient!f;)V")
	public static void method602(@OriginalArg(0) Class13 arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub1_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class13 arg3) {
		Static175.aClass13_32 = arg3;
		Static31.aClass13_6 = arg0;
		Static45.aBoolean73 = arg2;
		Static117.anInt2799 = Static31.aClass13_6.method353(10);
		Static119.aClass3_Sub1_Sub3_Sub1_Sub1_3 = arg1;
	}
}
