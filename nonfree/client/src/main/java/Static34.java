import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Lclient!hp;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "Lclient!vf;")
	public static Class370 aClass370_1;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Lclient!jea;")
	public static final Class177 aClass177_4 = new Class177(0, -1);

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "J")
	public static long aLong27 = 0L;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
	public static final int[] anIntArray36 = new int[14];

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
	public static void method718() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static313.anInt9096 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method719() {
		if (Static339.anApplet2 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static339.anApplet2.getParameter("cookiehost");
			@Pc(22) int local22 = (int) (Static15.method380() / 86400000L) - 11745;
			@Pc(34) String local34 = "usrdob=" + local22 + "; version=1; path=/; domain=" + local14;
			Static680.method796("document.cookie=\"" + local34 + "\"", Static339.anApplet2);
		} catch (@Pc(48) Throwable local48) {
		}
	}
}
