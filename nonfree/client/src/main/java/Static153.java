import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public static int anInt2747;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	public static int anInt2750;

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)Lclient!pl;")
	public static Class123 method2283() {
		try {
			return (Class123) Class.forName("Class123_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class123_Sub1();
		}
	}
}
