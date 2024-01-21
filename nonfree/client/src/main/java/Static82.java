import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_800 = Static193.method3027("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_801 = Static193.method3027("<col=c0ff00>");

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_802 = Static193.method3027("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
	public static volatile int anInt1622 = 0;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_803 = Static193.method3027("(U(Y");

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_804 = Static193.method3027("event_opbase");

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_805 = Static193.method3027("auf der Hautpseite)3");

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_806 = Static193.method3027("Error loading your profile)3");

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_807 = Static193.method3027("blinken1:");

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	public static int anInt1626 = 0;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
	public static int anInt1628 = -1;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "Lclient!oc;")
	public static Class70 aClass70_808 = aClass70_806;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIB)I")
	public static int method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(28) int local28 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local28;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!oc;)I")
	public static int method1178(@OriginalArg(1) Class70 arg0) {
		return arg0.method2045() + 1;
	}
}
