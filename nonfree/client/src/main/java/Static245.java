import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public static int anInt4527;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	public static int anInt4528;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
	public static final int[] anIntArray247 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
	public static void method3616() {
		if (Static361.aClass198_3.aBoolean402) {
			Static221.anInt4095 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static221.anInt4095 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}
}
