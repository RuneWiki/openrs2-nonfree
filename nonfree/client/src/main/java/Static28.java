import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt770;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!nb;")
	public static Class24 aClass24_8;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "Lclient!nb;")
	public static Class24 aClass24_9;

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!vc;")
	private static Class71 aClass71_446 = Static38.method736("Welcome to RuneScape");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!vc;")
	public static Class71 aClass71_443 = aClass71_446;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_444 = Static38.method736("headicons_prayer");

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!qa;")
	public static Class54 aClass54_18 = new Class54(100);

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_445 = Static38.method736("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Lclient!vc;")
	private static Class71 aClass71_451 = Static38.method736("Please try again)3");

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!vc;")
	public static Class71 aClass71_447 = aClass71_451;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_448 = Static38.method736("@gre@");

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Lclient!vc;")
	private static Class71 aClass71_450 = Static38.method736("To");

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_449 = aClass71_450;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public static int anInt772 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method574() {
		Static106.aClass54_36.method1402();
		Static117.aClass54_38.method1402();
		Static6.aClass54_3.method1402();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
	public static void method575() {
		aClass71_445 = null;
		aClass71_444 = null;
		aClass71_448 = null;
		aClass71_446 = null;
		aClass24_8 = null;
		aClass71_449 = null;
		aClass71_450 = null;
		aClass71_447 = null;
		aClass71_451 = null;
		aClass54_18 = null;
		aClass24_9 = null;
		aClass71_443 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)Lclient!pd;")
	public static Class5_Sub1_Sub12 method576(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub1_Sub12 local6 = (Class5_Sub1_Sub12) Static98.aClass54_31.method1397((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static27.aClass24_6.method679(3, arg0);
		local6 = new Class5_Sub1_Sub12();
		if (local20 != null) {
			local6.method1389(new Class5_Sub11(local20));
		}
		Static98.aClass54_31.method1399(local6, (long) arg0);
		return local6;
	}
}
