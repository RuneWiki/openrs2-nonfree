import java.awt.Image;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!cq", name = "v", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!cq", name = "y", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!cq", name = "A", descriptor = "Lclient!nq;")
	public static Class144 aClass144_19;

	@OriginalMember(owner = "client!cq", name = "p", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_18 = new Class117("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!cq", name = "w", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_19 = new Class117("M", "M", "M", "M");

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!cq", name = "z", descriptor = "Lclient!wj;")
	public static final Class203 aClass203_1 = Static195.method3967();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public static void method678() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static340.anInt5690 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}
