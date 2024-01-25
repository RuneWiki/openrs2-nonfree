import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "Lclient!ds;")
	public static Class4_Sub13_Sub1 aClass4_Sub13_Sub1_1;

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_99 = new Class61(13, 8);

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
	public static int anInt7383 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	public static void method6119() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static536.anInt9062 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!oa;)V")
	public static void method6122(@OriginalArg(1) Class66 arg0) {
		if (Static325.aBoolean431) {
			Static70.method1255(arg0);
		} else {
			Static159.method3160(arg0);
		}
	}
}
