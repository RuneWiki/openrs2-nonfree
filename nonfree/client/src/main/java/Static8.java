import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!af", name = "h", descriptor = "Lclient!bc;")
	public static final Class25 aClass25_1 = new Class25(8);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BIII)V")
	public static void method305(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static455.aClass3_Sub27_Sub1_1.anInt4793 * arg1 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static491.method6679(local6, Static405.aClass254_106, arg2);
			Static353.aBoolean597 = true;
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
	public static boolean method307(@OriginalArg(1) int arg0) {
		return arg0 == 15 || arg0 == 50 || arg0 == 1003 || arg0 == 5 || arg0 == 11;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(BI)V")
	public static void method309() {
		@Pc(5) Class211 local5 = Static232.aClass211_34;
		synchronized (Static232.aClass211_34) {
			Static232.aClass211_34.method5538(5);
		}
		local5 = Static204.aClass211_30;
		synchronized (Static204.aClass211_30) {
			Static204.aClass211_30.method5538(5);
		}
	}
}
