import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!vu;")
	public static Class355 aClass355_1;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!mv;Lclient!mv;)V")
	public static void method1597(@OriginalArg(2) Class229 arg0, @OriginalArg(3) Class229 arg1) {
		Static173.aClass229_35 = arg1;
		Static193.aClass229_124 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method1599() {
		if (Static169.aClass99_2.aBoolean149) {
			Static326.anInt7462 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static326.anInt7462 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}
}
