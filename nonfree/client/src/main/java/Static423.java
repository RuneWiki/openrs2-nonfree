import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "Lclient!ec;")
	public static Class68 aClass68_16;

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "[Z")
	public static final boolean[] aBooleanArray25 = new boolean[8];

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Z)Z")
	public static boolean method5735() {
		if (Static352.aBoolean417) {
			try {
				Static466.method4995("showVideoAd", Static150.aClass183_3.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method5736(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Static39.anInt1015 = -1;
		Static165.anInt3454 = 1;
		Static24.method500(arg0, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
	public static void method5738() {
		if (Static282.anInt5394 == 2) {
			Static155.anInt3339 = 96;
			return;
		}
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("maxMemory");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Long local25 = (Long) local15.invoke(local19, (Object[]) null);
					Static155.anInt3339 = (int) (local25 / 1048576L) + 1;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}
}
