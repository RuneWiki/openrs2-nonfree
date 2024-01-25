import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
	public static int anInt6117;

	@OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
	public static int anInt6118;

	@OriginalMember(owner = "client!ss", name = "E", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_139 = new Class7("Self", "Mich", "Moi", "Eu");

	@OriginalMember(owner = "client!ss", name = "G", descriptor = "I")
	public static int anInt6113 = -1;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(B)Lclient!hs;")
	public static Class77 method5096() {
		try {
			return new Class77_Sub3();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class77) Class.forName("Class77_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class77_Sub2();
			}
		}
	}
}
