import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public static int anInt607;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public static int anInt604 = -1;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int anInt606 = 0;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "I")
	public static int anInt609 = 0;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)Lclient!rfa;")
	public static Class3 method608() {
		try {
			return new Class3_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class3) Class.forName("Class3_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class3_Sub3();
			}
		}
	}
}
