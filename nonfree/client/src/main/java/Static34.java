import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "Lclient!im;")
	public static final Class140 aClass140_15 = new Class140(93, 16);

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_46 = new Class296(43, -1);

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_10 = new Class306("K", "T", "K", "K");

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
	public static int anInt785 = 0;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IZ)V")
	public static void method784(@OriginalArg(0) int arg0) {
		Static238.anIntArray611 = new int[arg0];
		Static383.anIntArray578 = new int[arg0];
		Static220.anIntArray429 = new int[arg0];
		Static306.anIntArray564 = new int[arg0];
		client.lb = new int[arg0];
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
	public static void method786() {
		try {
			@Pc(17) Method local17 = Runtime.class.getMethod("availableProcessors");
			if (local17 != null) {
				try {
					@Pc(21) Runtime local21 = Runtime.getRuntime();
					@Pc(27) Integer local27 = (Integer) local17.invoke(local21, (Object[]) null);
					Static493.anInt8166 = local27;
				} catch (@Pc(32) Throwable local32) {
				}
			}
		} catch (@Pc(34) Exception local34) {
		}
	}
}
