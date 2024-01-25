import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_96 = new Class92(43, 3);

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)I")
	public static int method4041(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(III)Z")
	public static boolean method4042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method4044(arg0, arg1) | (arg0 & 0x70000) != 0 || Static193.method3053(arg0, arg1);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	public static void method4043() {
		try {
			@Pc(20) Method local20 = Runtime.class.getMethod("availableProcessors");
			if (local20 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local20.invoke(local24, (Object[]) null);
					Static417.anInt7458 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(III)Z")
	public static boolean method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
