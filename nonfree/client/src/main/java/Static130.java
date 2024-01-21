import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public static int anInt2921;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "Lclient!he;")
	public static Class1_Sub10 aClass1_Sub10_14;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1721 = Static106.method1849("white:");

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1720 = aClass66_1721;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1722 = aClass66_1721;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1723 = Static106.method1849("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public static int anInt2924 = 0;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1724 = Static106.method1849("Untersuchen");

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Z")
	public static boolean method2042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(14) Class1_Sub1_Sub9 local14 = Static122.method1995(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local14.method1450(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public static void method2043() {
		aClass66_1724 = null;
		aClass66_1723 = null;
		aClass1_Sub10_14 = null;
		aClass66_1721 = null;
		aClass66_1722 = null;
		aClass66_1720 = null;
	}
}
