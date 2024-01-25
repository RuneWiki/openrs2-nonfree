import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static162 {

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!gp;")
	public static Class117 aClass117_88;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "Lclient!io;")
	public static final Class148 aClass148_5 = new Class148(2, 4, 4, 0);

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
	public static int anInt3280 = 0;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "J")
	public static long aLong110 = -1L;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method2906() {
		Static287.method4831(10);
		Static315.method5087();
		System.gc();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Z")
	public static boolean method2907() {
		return Static134.aClass199_4 != Static124.aClass199_3 || Static137.anInt1383 >= 2;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
	public static void method2908(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static97.anInt2211 == 1) {
			Static164.method2921(Static411.aClass5_Sub47_3, arg1, arg0);
		} else if (Static97.anInt2211 == 2) {
			Static191.method5463(arg1, arg0);
		}
		Static411.aClass5_Sub47_3 = null;
		Static97.anInt2211 = 0;
	}
}
