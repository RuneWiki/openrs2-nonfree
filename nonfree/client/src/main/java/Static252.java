import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
	public static int anInt4850 = 0;

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_130 = new Class140(20);

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "[I")
	public static final int[] anIntArray630 = new int[50];

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
	public static int anInt4857 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method4469() {
		if (Static168.anInt3543 == 2) {
			Static157.anInt3131 = 96;
			return;
		}
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("maxMemory");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local17.invoke(local21, (Object[]) null);
					Static157.anInt3131 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
	public static void method4471() {
		Static155.anInt3113 = 0;
		@Pc(12) int local12 = (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7) + Static182.anInt3775;
		@Pc(24) int local24 = Static161.anInt3315 + (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static155.anInt3113 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static155.anInt3113 = 1;
		}
		if (Static155.anInt3113 == 1 && local12 >= 3139 && local12 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static155.anInt3113 = 0;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	public static void method4472() {
		Static310.aClass140_157.method3824(5);
	}
}
