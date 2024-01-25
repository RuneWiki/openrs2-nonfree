import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
	public static int anInt4557;

	@OriginalMember(owner = "client!mo", name = "J", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_83 = new Class36(58, 6);

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "[B")
	public static final byte[] aByteArray45 = new byte[2048];

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_147 = new Class186(67, 12);

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "(B)V")
	public static void method3445() {
		if (Static159.anInt3000 == 2) {
			Static346.anInt6291 = 96;
			return;
		}
		try {
			@Pc(29) Method local29 = Runtime.class.getMethod("maxMemory");
			if (local29 != null) {
				try {
					@Pc(33) Runtime local33 = Runtime.getRuntime();
					@Pc(39) Long local39 = (Long) local29.invoke(local33, (Object[]) null);
					Static346.anInt6291 = (int) (local39 / 1048576L) + 1;
				} catch (@Pc(49) Throwable local49) {
				}
			}
		} catch (@Pc(51) Exception local51) {
		}
	}
}
