import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "[Lclient!jia;")
	public static Class182[] aClass182Array1;

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "Lclient!jl;")
	public static Class183 aClass183_8;

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "Lclient!hm;")
	public static final Class151 aClass151_8 = new Class151(0, 1);

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_91 = new Class145(3, 4);

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[100];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4785(@OriginalArg(0) String arg0) {
		return Static496.method6470(arg0, 10);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	public static void method4787() {
		if (Static107.anApplet1 == null) {
			return;
		}
		try {
			@Pc(10) String local10 = Static107.anApplet1.getParameter("cookiehost");
			@Pc(18) int local18 = (int) (Static48.method1203() / 86400000L) - 11745;
			@Pc(30) String local30 = "usrdob=" + local18 + "; version=1; path=/; domain=" + local10;
			Static655.method4699("document.cookie=\"" + local30 + "\"", Static107.anApplet1);
		} catch (@Pc(51) Throwable local51) {
		}
	}
}
