import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	public static int anInt1762 = 0;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!dd;")
	private static Class13 aClass13_596 = Static161.method2971("Choose Option");

	@OriginalMember(owner = "client!g", name = "g", descriptor = "I")
	public static int anInt1767 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_597 = Static161.method2971("ams");

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public static int anInt1770 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_598 = aClass13_596;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Lclient!ta;")
	public static Class68 method1320() {
		try {
			return (Class68) Class.forName("Class68_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class68_Sub2();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method1321() {
		aClass13_596 = null;
		aClass13_597 = null;
		aClass13_598 = null;
	}
}
