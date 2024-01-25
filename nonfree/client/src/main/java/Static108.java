import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_21 = new Class87(64);

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method2334() {
		Static226.aClass197_22.method5155();
		Static139.aClass159_6.method4255();
		Static156.aClass159_5.method4255();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)Lclient!ok;")
	public static Class155 method2335() {
		try {
			return (Class155) Class.forName("Class155_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	public static void method2336() {
		@Pc(1) Class87 local1 = Static322.aClass87_57;
		synchronized (Static322.aClass87_57) {
			Static322.aClass87_57.method2473(5);
		}
		local1 = Static28.aClass87_5;
		synchronized (Static28.aClass87_5) {
			Static28.aClass87_5.method2473(5);
		}
	}
}
