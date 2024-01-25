import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_68 = new Class236(34, 8);

	@OriginalMember(owner = "client!re", name = "D", descriptor = "[S")
	public static short[] aShortArray117 = new short[256];

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	public static int anInt7440 = -1;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public static void method6048() {
		if (Static9.anInt148 == 2) {
			Static193.anInt3735 = 96;
			return;
		}
		try {
			@Pc(25) Method local25 = Runtime.class.getMethod("maxMemory");
			if (local25 != null) {
				try {
					@Pc(29) Runtime local29 = Runtime.getRuntime();
					@Pc(35) Long local35 = (Long) local25.invoke(local29, (Object[]) null);
					Static193.anInt3735 = (int) (local35 / 1048576L) + 1;
				} catch (@Pc(45) Throwable local45) {
				}
			}
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
	public static void method6051() {
		Static460.aClass288_60.method6744();
	}
}
