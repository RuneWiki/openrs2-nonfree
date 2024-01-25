import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kw", name = "Dc", descriptor = "I")
	public static int anInt5187;

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V")
	public static void method4290() {
		if (Static174.aClass313_24.aBoolean570) {
			Static355.anInt6598 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static355.anInt6598 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIIII)V")
	public static void method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg2 <= arg1) {
			for (local10 = arg2; local10 < arg1; local10++) {
				Static155.anIntArrayArray32[local10][arg3] = arg0;
			}
		} else {
			for (local10 = arg1; local10 < arg2; local10++) {
				Static155.anIntArrayArray32[local10][arg3] = arg0;
			}
		}
	}
}
