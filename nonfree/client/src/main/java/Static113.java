import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "Lclient!gn;")
	public static Class119_Sub1 aClass119_Sub1_1;

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V")
	public static void method2342() {
		if (Static92.anInt2161 == 2) {
			Static458.anInt8335 = 96;
			return;
		}
		try {
			@Pc(22) Method local22 = Runtime.class.getMethod("maxMemory");
			if (local22 != null) {
				try {
					@Pc(26) Runtime local26 = Runtime.getRuntime();
					@Pc(32) Long local32 = (Long) local22.invoke(local26, (Object[]) null);
					Static458.anInt8335 = (int) (local32 / 1048576L) + 1;
				} catch (@Pc(42) Throwable local42) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	public static void method2344() {
		@Pc(3) Class149[] local3 = Class212.aClass149Array1;
		synchronized (Class212.aClass149Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class212.aClass149Array1.length; local7++) {
				Class212.aClass149Array1[local7] = new Class149();
				Static330.anIntArray435[local7] = 0;
			}
		}
	}
}
