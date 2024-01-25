import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
	public static final int anInt8183 = 1407;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)Lclient!tha;")
	public static Class41 method7110() {
		try {
			return new Class41_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class41_Sub2();
			}
		}
	}
}
