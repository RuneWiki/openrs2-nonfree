import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!via", name = "i", descriptor = "Lclient!daa;")
	public static final Class6_Sub15 aClass6_Sub15_1 = new Class6_Sub15(0, 0);

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)Lclient!rfa;")
	public static Class140 method8342() {
		try {
			return (Class140) Class.forName("Class140_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
