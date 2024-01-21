import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!kb;")
	public static Class9 aClass9_20;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!v;")
	private static Class62 aClass62_478 = Static45.method753("glow3:");

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Lclient!jb;")
	public static Class34 aClass34_13 = new Class34(30);

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!v;")
	public static Class62 aClass62_479 = aClass62_478;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!v;")
	private static Class62 aClass62_483 = Static45.method753("Accept trade");

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_480 = aClass62_483;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!v;")
	private static Class62 aClass62_481 = Static45.method753("Existing user");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_482 = Static45.method753("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!v;")
	public static Class62 aClass62_484 = aClass62_481;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!v;")
	public static Class62 aClass62_485 = aClass62_482;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method669() {
		aClass62_478 = null;
		aClass62_481 = null;
		aClass62_480 = null;
		aClass62_482 = null;
		aClass9_20 = null;
		aClass62_483 = null;
		aClass62_479 = null;
		aClass62_484 = null;
		aClass62_485 = null;
		aClass34_13 = null;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method670() {
		for (@Pc(3) int local3 = -1; local3 < Static91.anInt2431; local3++) {
			@Pc(11) int local11;
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static6.anIntArray21[local3];
			}
			@Pc(21) Class3_Sub1_Sub3_Sub1_Sub1 local21 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local11];
			if (local21 != null) {
				Static17.method1870(1, local21);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	public static void method671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << -1999515952));
		@Pc(16) Class3_Sub1_Sub10 local16 = (Class3_Sub1_Sub10) Static13.aClass43_1.method1079(local6);
		if (local16 != null) {
			Static22.aClass40_1.method981(local16);
		}
	}
}
