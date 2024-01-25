import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nt", name = "H", descriptor = "Lclient!mf;")
	public static final Class222 aClass222_37 = new Class222(4);

	@OriginalMember(owner = "client!nt", name = "K", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg4 < 512 || arg1 < 512 || (Static71.anInt1410 - 2) * 512 < arg4 || arg1 > (Static471.anInt8012 - 2) * 512) {
			Static348.anIntArray473[0] = Static348.anIntArray473[1] = -1;
			return;
		}
		@Pc(51) int local51 = Static66.method1191(arg4, arg5, arg1) - arg3;
		Static458.aClass113_6.U(arg6, 0, 0);
		Static16.aClass134_1.method6919(Static458.aClass113_6);
		Static16.aClass134_1.AA(arg4, local51, arg1, Static348.anIntArray473);
		Static458.aClass113_6.U(-arg6, 0, 0);
		Static16.aClass134_1.method6919(Static458.aClass113_6);
	}
}
