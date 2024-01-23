import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!re", name = "r", descriptor = "[Lclient!bn;")
	public static Class2_Sub8_Sub1[] aClass2_Sub8_Sub1Array8;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public static int anInt4807 = 0;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	public static int anInt4808 = 0;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "[S")
	public static short[] aShortArray66 = new short[256];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method3861() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("maxMemory");
			if (local12 != null) {
				try {
					@Pc(17) Runtime local17 = Runtime.getRuntime();
					@Pc(24) Long local24 = (Long) local12.invoke(local17, (Object[]) null);
					Static167.anInt3694 = (int) (local24 / 1048576L) + 1;
				} catch (@Pc(34) Throwable local34) {
				}
			}
		} catch (@Pc(36) Exception local36) {
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ek;Z)V")
	public static void method3862(@OriginalArg(0) Class42 arg0) {
		Static229.aClass42_72 = arg0;
	}
}
