import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt558 = 0;

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
	public static boolean aBoolean54 = false;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	public static void method446() {
		Static354.aClass132_55.method2713(50);
		Static264.aClass132_40.method2713(50);
		Static327.aClass132_52.method2713(50);
		Static209.aClass132_27.method2713(50);
		Static234.aClass132_30.method2713(50);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
	public static void method447() {
		if (Static293.anInt4810 == 2) {
			Static177.anInt3052 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static177.anInt3052 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}
}
