import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eda", name = "j", descriptor = "Lclient!pl;")
	public static Class259 aClass259_45;

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "Lclient!gb;")
	public static final Class119 aClass119_11 = new Class119();

	@OriginalMember(owner = "client!eda", name = "i", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_15 = new Class8();

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Lclient!kg;")
	public static Class129 method1691() {
		try {
			return (Class129) Class.forName("Class129_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
