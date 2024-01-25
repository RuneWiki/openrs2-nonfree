import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	public static int anInt5525;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_24 = new Class335(16);

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_174 = new Class196(48, 5);

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V")
	public static void method4769() {
		if (Static150.aClass202_2.aBoolean386) {
			Static126.anInt2180 = 96;
			return;
		}
		try {
			@Pc(30) Method local30 = Runtime.class.getMethod("maxMemory");
			if (local30 != null) {
				try {
					@Pc(34) Runtime local34 = Runtime.getRuntime();
					@Pc(40) Long local40 = (Long) local30.invoke(local34, (Object[]) null);
					Static126.anInt2180 = (int) (local40 / 1048576L) + 1;
				} catch (@Pc(50) Throwable local50) {
				}
			}
		} catch (@Pc(52) Exception local52) {
		}
	}
}
