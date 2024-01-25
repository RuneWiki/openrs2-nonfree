import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!he", name = "f", descriptor = "Z")
	public static boolean aBoolean300;

	@OriginalMember(owner = "client!he", name = "i", descriptor = "Lclient!vea;")
	public static Class4_Sub2_Sub1 aClass4_Sub2_Sub1_1;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "F")
	public static float aFloat90 = 0.0F;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "I")
	public static int anInt3964 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)I")
	public static int method3458() {
		return Static383.anInt6790++;
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
	public static void method3459() {
		if (Static147.aClass161_4.aBoolean345) {
			Static87.anInt2262 = 96;
			return;
		}
		try {
			@Pc(26) Method local26 = Runtime.class.getMethod("maxMemory");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Long local36 = (Long) local26.invoke(local30, (Object[]) null);
					Static87.anInt2262 = (int) (local36 / 1048576L) + 1;
				} catch (@Pc(46) Throwable local46) {
				}
			}
		} catch (@Pc(48) Exception local48) {
		}
	}
}
