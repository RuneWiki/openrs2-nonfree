import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString141 = " from your ignore list first.";

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!cc;")
	public static Class22 aClass22_18 = null;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
	public static int[] anIntArray393 = new int[2500];

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	public static void method3527() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("maxMemory");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(27) Long local27 = (Long) local16.invoke(local20, (Object[]) null);
					Static193.anInt3800 = (int) (local27 / 1048576L) + 1;
				} catch (@Pc(37) Throwable local37) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	public static void method3529() {
		anIntArray393 = null;
		aClass22_18 = null;
		aString141 = null;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIII)V")
	public static void method3531(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static211.anInt4200 <= arg3 && arg3 <= Static154.anInt3126) {
			@Pc(15) int local15 = Static142.method2311(arg0, Static141.anInt2889, Static171.anInt3392);
			@Pc(21) int local21 = Static142.method2311(arg2, Static141.anInt2889, Static171.anInt3392);
			Static98.method1588(arg1, local15, local21, arg3);
		}
	}
}
