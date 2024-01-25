import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "Lclient!el;")
	public static final Class95 aClass95_4 = new Class95();

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
	public static final int[] anIntArray540 = new int[3];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public static void method7322() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local16.invoke(local24, (Object[]) null);
					Static22.anInt9830 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V")
	public static void method7323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class4_Sub39 local12 = Static32.method999(Static402.aClass356_1, Static513.aClass344_91);
		local12.aClass4_Sub13_Sub2_1.method7034(arg0);
		local12.aClass4_Sub13_Sub2_1.method7038(arg1);
		Static50.method1166(local12);
	}
}
