import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static111 {

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!bu;Z)V")
	public static void method1826(@OriginalArg(1) Class6_Sub6 arg0, @OriginalArg(2) boolean arg1) {
		if (arg0.aBoolean78) {
			if (arg0.anInt1254 < 0 || Static171.method3148(arg0.anInt1249, arg0.anInt1254)) {
				if (arg1) {
					Static125.method9038(arg0.anInt1250, arg0.anInt1247, (Class94) null, arg0.anInt1251, arg0.anInt1248);
				} else {
					Static116.method1912(arg0.anInt1248, -1, arg0.anInt1250, arg0.anInt1246, arg0.anInt1251, arg0.anInt1249, arg0.anInt1254, arg0.anInt1247);
				}
				arg0.method9043();
			}
		} else if (arg0.aBoolean79 && arg0.anInt1247 >= 1 && arg0.anInt1250 >= 1 && Static442.anInt7975 - 2 >= arg0.anInt1247 && arg0.anInt1250 <= Static284.anInt7916 - 2 && (arg0.anInt1253 < 0 || Static171.method3148(arg0.anInt1252, arg0.anInt1253))) {
			if (arg1) {
				Static125.method9038(arg0.anInt1250, arg0.anInt1247, arg0.aClass94_1, arg0.anInt1251, arg0.anInt1248);
			} else {
				Static116.method1912(arg0.anInt1248, -1, arg0.anInt1250, arg0.anInt1255, arg0.anInt1251, arg0.anInt1252, arg0.anInt1253, arg0.anInt1247);
			}
			arg0.aBoolean79 = false;
			if (!arg1 && arg0.anInt1254 == arg0.anInt1253 && arg0.anInt1254 == -1) {
				arg0.method9043();
			} else if (!arg1 && arg0.anInt1253 == arg0.anInt1254 && arg0.anInt1246 == arg0.anInt1255 && arg0.anInt1249 == arg0.anInt1252) {
				arg0.method9043();
			}
		}
	}
}
