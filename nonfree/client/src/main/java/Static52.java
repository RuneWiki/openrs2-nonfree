import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static52 {

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
	public static int anInt1205;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString59 = "wishes to trade with you.";

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
	public static int anInt1206 = 0;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean89 = false;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIILclient!mn;)V")
	public static void method1037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class115 arg2) {
		if (Static23.aClass115_3 != null || Static299.aBoolean203 || (arg2 == null || Static153.method2650(arg2) == null)) {
			return;
		}
		Static23.aClass115_3 = arg2;
		Static11.aClass115_1 = Static153.method2650(arg2);
		Static250.anInt4975 = arg1;
		Static242.aBoolean412 = false;
		Static90.anInt2002 = arg0;
		Static187.anInt3939 = 0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	public static int method1039() {
		if (Static145.aBoolean258) {
			return 0;
		} else if (Static67.method4885()) {
			return Static43.aBoolean77 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
