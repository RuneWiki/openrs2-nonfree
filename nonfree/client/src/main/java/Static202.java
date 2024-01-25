import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
	public static int anInt3288;

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
	public static int anInt3291;

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_5 = new Class370(4, 16);

	@OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)Lclient!il;")
	public static Class67 method2912() {
		try {
			return new Class67_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class67) Class.forName("ch").getDeclaredConstructor().newInstance();
			} catch (@Pc(23) Throwable local23) {
				return new Class67_Sub2();
			}
		}
	}
}
