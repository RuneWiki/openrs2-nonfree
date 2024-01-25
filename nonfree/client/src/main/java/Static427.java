import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
	public static int anInt7255;

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "I")
	public static int anInt7256;

	@OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_176 = new Class81(67, -2);

	@OriginalMember(owner = "client!qe", name = "n", descriptor = "(I)V")
	public static void method5987() {
		@Pc(17) Class1_Sub48 local17 = Static320.method4867(Static442.aClass170_2, Static347.aClass319_169);
		local17.aClass1_Sub20_Sub1_2.method4381(Static199.anInt4026);
		Static34.method813(local17);
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(Z)V")
	public static void method5988() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("availableProcessors");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(31) Integer local31 = (Integer) local21.invoke(local25, (Object[]) null);
					Static265.anInt4986 = local31;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}
}
