import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!lk;")
	public static final Class209 aClass209_32 = new Class209(64);

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
	public static int anInt5939 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method5051() {
		if (Static569.aClass380_6.aBoolean728) {
			Static549.anInt9246 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static549.anInt9246 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)Lclient!dja;")
	public static Class67 method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass67_3;
	}
}
