import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static398 {

	@OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
	public static int anInt7623;

	@OriginalMember(owner = "client!oea", name = "M", descriptor = "[I")
	public static final int[] anIntArray474 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(Z)V")
	public static void method6368() {
		if (Static537.aBoolean779) {
			return;
		}
		Static106.method2587(Static360.aClass106ArrayArrayArray3);
		if (Static185.aClass106ArrayArrayArray2 != null) {
			Static106.method2587(Static185.aClass106ArrayArrayArray2);
		}
		Static537.aBoolean779 = true;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZI)I")
	public static int method6369(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)Z")
	public static boolean method6370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
