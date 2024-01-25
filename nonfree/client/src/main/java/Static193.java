import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!je", name = "H", descriptor = "I")
	public static int anInt3215;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "[I")
	public static final int[] anIntArray183 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!je", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!je", name = "M", descriptor = "I")
	public static int anInt3219 = 0;

	@OriginalMember(owner = "client!je", name = "N", descriptor = "[I")
	public static final int[] anIntArray184 = new int[5];

	@OriginalMember(owner = "client!je", name = "O", descriptor = "I")
	public static int anInt3220 = -1;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method2590(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg6 < 128 || arg4 < 128 || (Static433.anInt7210 - 2) * 128 < arg6 || arg4 > (Static418.anInt6969 - 2) * 128) {
			Static205.anIntArray194[0] = Static205.anIntArray194[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static192.method2572(arg4, arg6, arg2) - arg1;
		Static43.aClass29_5.W(arg5, 0, 0);
		Static407.aClass200_9.SA(Static43.aClass29_5);
		Static407.aClass200_9.v(arg6, local45, arg4, Static205.anIntArray194);
		Static43.aClass29_5.W(-arg5, 0, 0);
		Static407.aClass200_9.SA(Static43.aClass29_5);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method2591(@OriginalArg(0) int arg0, @OriginalArg(1) Class125 arg1) {
		Static410.aClass125Array3[arg0] = arg1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
	public static int method2593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static419.anIntArrayArray62 == null ? 0 : Static419.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}
}
