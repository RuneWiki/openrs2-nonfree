import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dw", name = "Dc", descriptor = "I")
	public static int anInt1722;

	@OriginalMember(owner = "client!dw", name = "Oc", descriptor = "I")
	public static int anInt1732;

	@OriginalMember(owner = "client!dw", name = "Qc", descriptor = "Lclient!ju;")
	public static Class2_Sub22 aClass2_Sub22_1;

	@OriginalMember(owner = "client!dw", name = "yc", descriptor = "[I")
	public static final int[] anIntArray145 = new int[50];

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "(B)V")
	public static void method1432() {
		if (Static73.anInt1597 == 2) {
			Static7.anInt219 = 96;
			return;
		}
		try {
			@Pc(28) Method local28 = Runtime.class.getMethod("maxMemory");
			if (local28 != null) {
				try {
					@Pc(32) Runtime local32 = Runtime.getRuntime();
					@Pc(38) Long local38 = (Long) local28.invoke(local32, (Object[]) null);
					Static7.anInt219 = (int) (local38 / 1048576L) + 1;
				} catch (@Pc(48) Throwable local48) {
				}
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V")
	public static void method1434() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static229.anInt4427; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static379.anInt6422; local18++) {
				if (Static218.method3410(local12, true, local18, local14, Static440.aClass106ArrayArrayArray3)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}
}
