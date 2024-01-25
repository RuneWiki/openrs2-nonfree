import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!nba", name = "w", descriptor = "I")
	public static int anInt5693;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
	public static void method4852() {
		if (Static482.anInt8574 == 2) {
			Static78.anInt1651 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static78.anInt1651 = (int) (local29 / 1048576L) + 1;
					return;
				} catch (@Pc(39) Throwable local39) {
					return;
				}
			}
		} catch (@Pc(41) Exception local41) {
			return;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIII)V")
	public static void method4854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static381.aClass2_Sub29_Sub2_2.anInt6132 = 0;
		Static381.aClass2_Sub29_Sub2_2.method5172(Static319.aClass117_7.anInt3345);
		Static381.aClass2_Sub29_Sub2_2.method5172(arg3);
		Static381.aClass2_Sub29_Sub2_2.method5172(arg0);
		Static381.aClass2_Sub29_Sub2_2.method5217(arg2);
		Static381.aClass2_Sub29_Sub2_2.method5217(arg1);
		Static55.anInt972 = -3;
		Static378.anInt7010 = 1;
		Static527.anInt9119 = 0;
		Static520.anInt1939 = 0;
	}
}
