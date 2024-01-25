import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIII)V")
	public static void method508(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		Static356.aByteArrayArrayArray17 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILclient!ep;I)V")
	public static void method509(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) int arg2) {
		Static361.aClass93_11 = arg1;
		Static229.anInt4757 = arg0;
		Static406.anInt9844 = arg2;
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V")
	public static void method510() {
		if (Static414.aClass246_5.aBoolean535) {
			Static205.anInt4372 = 96;
			return;
		}
		try {
			@Pc(23) Method local23 = Runtime.class.getMethod("maxMemory");
			if (local23 != null) {
				try {
					@Pc(27) Runtime local27 = Runtime.getRuntime();
					@Pc(33) Long local33 = (Long) local23.invoke(local27, (Object[]) null);
					Static205.anInt4372 = (int) (local33 / 1048576L) + 1;
				} catch (@Pc(43) Throwable local43) {
				}
			}
		} catch (@Pc(45) Exception local45) {
		}
	}
}
