import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!sf;")
	public static Class5 aClass5_91;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt2909;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!rb;")
	public static Class60 aClass60_89 = new Class60(64);

	@OriginalMember(owner = "client!w", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1699 = Static106.method1849("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1700 = Static106.method1849("blinken2:");

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1702 = Static106.method1849("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!w", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1701 = aClass66_1702;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
	public static void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static124.anInt2862 != 0 && arg1 != -1) {
			Static63.method1352(0, Static121.aClass5_Sub1_28, arg1, Static124.anInt2862);
			Static53.aBoolean68 = true;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!he;)Lclient!he;")
	public static Class1_Sub10 method2033(@OriginalArg(1) Class1_Sub10 arg0) {
		@Pc(11) int local11 = Static126.method2022(Static61.method1301(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(17) int local17 = 0; local17 < local11; local17++) {
			arg0 = Static38.method2002(arg0.anInt1375);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method2034() {
		aClass60_89 = null;
		aClass66_1700 = null;
		aClass5_91 = null;
		aClass66_1702 = null;
		aClass66_1699 = null;
		aBooleanArray18 = null;
		aClass66_1701 = null;
	}
}
