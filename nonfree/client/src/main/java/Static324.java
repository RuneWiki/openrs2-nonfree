import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
	public static int anInt6419;

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "J")
	public static long aLong177 = 0L;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Z")
	public static boolean method5393() {
		if (Static296.aBoolean473) {
			try {
				if ((Boolean) Static651.method5913("showingVideoAd", Static635.anApplet2)) {
					return false;
				}
				return true;
			} catch (@Pc(17) Throwable local17) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIB)Z")
	public static boolean method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static82.method2207(arg1, arg0) | (arg0 & 0x70000) != 0 || Static296.method5063(arg0, arg1);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V")
	public static void method5395(@OriginalArg(1) int arg0) {
		@Pc(14) Class6_Sub5_Sub19 local14 = Static348.method5721(arg0, 7);
		local14.method5174();
	}
}
