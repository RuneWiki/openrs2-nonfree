import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static38 {

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "Lclient!tg;")
	public static Class81 aClass81_353 = Static120.method2057("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ea", name = "bb", descriptor = "Lclient!tg;")
	public static Class81 aClass81_354 = Static120.method2057("(Y");

	@OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
	public static int anInt1014 = 0;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
	public static void method763() {
		aClass81_353 = null;
		aClass81_354 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Lclient!tg;")
	public static Class81 method764(@OriginalArg(0) int arg0) {
		return Static127.method2169(new Class81[] { Static149.method2548(arg0 >> 24 & 0xFF), Static125.aClass81_991, Static149.method2548(arg0 >> 16 & 0xFF), Static125.aClass81_991, Static149.method2548(arg0 >> 8 & 0xFF), Static125.aClass81_991, Static149.method2548(arg0 & 0xFF) });
	}
}
