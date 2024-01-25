import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_86 = new Class47(71, -1);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
	public static void method4674() {
		Static276.aBoolean373 = false;
		Static249.aClipboard1 = null;
		Static415.method7746();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BII)Z")
	public static boolean method4675(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ICI)I")
	public static int method4676(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			@Pc(21) char local21 = Character.toLowerCase(arg0);
			local12 = (local21 << 4) + 1;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public static void method4678() {
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("availableProcessors");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Integer local25 = (Integer) local15.invoke(local19, (Object[]) null);
					Static380.anInt6689 = local25;
				} catch (@Pc(30) Throwable local30) {
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}
}
