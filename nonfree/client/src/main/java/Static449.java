import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_264 = new Class137(70, 8);

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "Lclient!st;")
	public static final Class227 aClass227_8 = new Class227();

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "[Lclient!nm;")
	public static final Class171[] aClass171Array2 = new Class171[14];

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "[Lclient!no;")
	public static final Class173[] aClass173Array1 = new Class173[30];

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
	public static int anInt7401 = 0;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lclient!up;")
	public static Class60 method5590() {
		try {
			return (Class60) Class.forName("Class60_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
