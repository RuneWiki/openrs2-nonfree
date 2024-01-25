import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_76 = new Class303(78, -1);

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "Lclient!gk;")
	public static final Class112 aClass112_51 = new Class112();

	@OriginalMember(owner = "client!qfa", name = "p", descriptor = "I")
	public static int anInt7256 = 999999;

	@OriginalMember(owner = "client!qfa", name = "r", descriptor = "[I")
	public static final int[] anIntArray448 = new int[2];

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(III)Z")
	public static boolean method6082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6083(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg2 < 512 || arg4 < 512 || arg2 > (Static54.anInt1038 - 2) * 512 || arg4 > Static140.anInt3026 * 512 - 1024) {
			Static22.anIntArray20[0] = Static22.anIntArray20[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static475.method6537(arg4, arg0, arg2) - arg5;
		Static472.aClass11_6.U(arg6, 0, 0);
		Static505.aClass45_11.method7367(Static472.aClass11_6);
		Static505.aClass45_11.AA(arg2, local45, arg4, Static22.anIntArray20);
		Static472.aClass11_6.U(-arg6, 0, 0);
		Static505.aClass45_11.method7367(Static472.aClass11_6);
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
	public static void method6085() {
		Static492.aClass6_61.method102();
	}
}
