import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rfa", name = "H", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_131 = new Class287(59, 12);

	@OriginalMember(owner = "client!rfa", name = "R", descriptor = "Z")
	public static boolean aBoolean553 = false;

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Z)V")
	public static void method6302() {
		if (Static332.aClass5_3 != Static512.aClass5_9) {
			try {
				Static600.method2906("tbrefresh", Static507.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(Z)V")
	public static void method6306() {
		if (Static467.aClass168_12.aBoolean334 && Static122.aClass212_2.anInt6145 != -1) {
			Static110.method2208(Static122.aClass212_2.anInt6145, Static122.aClass212_2.aString157);
		}
	}
}
