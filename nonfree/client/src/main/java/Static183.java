import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "[I")
	public static final int[] anIntArray199 = new int[6];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
	public static void method2883(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static395.anInt6596 = 1;
		Static154.anInt2803 = -1;
		Static27.method494(arg1, arg0);
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)V")
	public static void method2884() {
		if (Static75.anInt1371 == 2) {
			Static61.anInt1155 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static61.anInt1155 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
