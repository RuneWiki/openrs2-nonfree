import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static15 {

	@OriginalMember(owner = "client!be", name = "r", descriptor = "Lclient!rf;")
	private static Class70 aClass70_155 = Static49.method1293("This computers address has been blocked");

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_152 = aClass70_155;

	@OriginalMember(owner = "client!be", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1 = new int[4][13][13];

	@OriginalMember(owner = "client!be", name = "c", descriptor = "Lclient!rf;")
	public static Class70 aClass70_153 = Static49.method1293("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
	public static int[] anIntArray30 = new int[50];

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_154 = Static49.method1293("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "I")
	public static int anInt450 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!rf;Lclient!rf;BLclient!rf;)V")
	public static void method374(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		Static179.aClass70_1567 = arg2;
		Static179.aClass70_1566 = arg1;
		Static179.aClass70_1561 = arg0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method376() {
		aClass70_153 = null;
		aClass70_154 = null;
		anIntArrayArrayArray1 = null;
		aClass70_152 = null;
		anIntArray30 = null;
		aClass70_155 = null;
	}
}
