import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
	public static int[] anIntArray109;

	@OriginalMember(owner = "client!aj", name = "e", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_8 = new Class158(28, 3);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public static void method635() {
		if (!Static308.method5031()) {
			return;
		}
		if (Static305.aStringArray37 == null) {
			Static48.method1023();
		}
		Static506.anInt8840 = 0;
		Static326.aBoolean396 = true;
		try {
			Static65.aClipboard1 = Static317.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(26) Exception local26) {
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)Z")
	public static boolean method637() {
		@Pc(7) Class3 local7 = Static255.aClass71_43.aClass3_73.aClass3_283;
		if (local7 == null || local7 == Static255.aClass71_43.aClass3_73) {
			return false;
		}
		@Pc(26) Class3_Sub11 local26 = (Class3_Sub11) local7;
		if (local26.anInt1419 >= 2000) {
			local26.anInt1419 -= 2000;
		}
		return local26.anInt1419 == 1003;
	}
}
