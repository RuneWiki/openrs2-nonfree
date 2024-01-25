import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
	public static int anInt7228 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIBI)V")
	public static void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static529.anInt9806 <= arg3 && arg3 <= Static205.anInt3906) {
			@Pc(23) int local23 = Static502.method6952(Static52.anInt1226, arg0, Static133.anInt2531);
			@Pc(29) int local29 = Static502.method6952(Static52.anInt1226, arg2, Static133.anInt2531);
			Static281.method4295(arg1, local29, local23, arg3);
		}
	}
}
