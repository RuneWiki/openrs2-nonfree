import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Lclient!bi;")
	public static Class3_Sub4_Sub2 aClass3_Sub4_Sub2_4;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
	public static int anInt465;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public static int anInt467;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "Lclient!rn;")
	public static Class155 aClass155_20;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString13 = "Unable to find ";

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public static void method410() {
		try {
			@Pc(21) Method local21 = Runtime.class.getMethod("maxMemory");
			if (local21 != null) {
				try {
					@Pc(25) Runtime local25 = Runtime.getRuntime();
					@Pc(32) Long local32 = (Long) local21.invoke(local25, (Object[]) null);
					Static258.anInt5304 = (int) (local32 / 1048576L) + 1;
				} catch (@Pc(42) Throwable local42) {
				}
			}
		} catch (@Pc(44) Exception local44) {
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
	public static void method414(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static297.method1844();
		} else if (arg0 == 2) {
			Static217.method3567();
		} else if (arg0 == 3) {
			Static104.method1671();
		} else {
			throw new RuntimeException();
		}
	}
}
