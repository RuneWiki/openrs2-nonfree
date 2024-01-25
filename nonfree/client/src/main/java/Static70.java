import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
	public static int anInt1419;

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "Lclient!ro;")
	public static Class306 aClass306_1;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_24 = new Class337(32, 6);

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "Lclient!ew;")
	public static final Class98 aClass98_8 = new Class98("", 12);

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI)Lclient!up;")
	public static Class352 method1148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class352 local7 = new Class352();
		local7.anInt9709 = -1;
		local7.anInt9703 = arg0 + 6;
		local7.anInt9711 = -1;
		local7.anInt9705 = arg1 + 1 + 5;
		local7.anIntArrayArray67 = new int[local7.anInt9705][local7.anInt9703];
		local7.method8347();
		return local7;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)Z")
	public static boolean method1149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static485.method7190(arg1)) {
			return true;
		} else {
			return !Static485.method7190(arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)V")
	public static void method1151() {
		Static78.aClass87_48.method1796();
		Static207.aClass87_105.method1796();
		Static395.aClass87_165.method1796();
		Static393.aClass87_249.method1796();
	}
}
