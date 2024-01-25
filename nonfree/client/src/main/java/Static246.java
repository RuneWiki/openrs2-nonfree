import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!po", name = "U", descriptor = "I")
	public static int anInt5043;

	@OriginalMember(owner = "client!po", name = "V", descriptor = "Lclient!tj;")
	public static Class193 aClass193_86;

	@OriginalMember(owner = "client!po", name = "P", descriptor = "Z")
	public static boolean aBoolean378 = false;

	@OriginalMember(owner = "client!po", name = "S", descriptor = "[I")
	public static final int[] anIntArray417 = new int[50];

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	public static void method4382() {
		Static39.anInt1027 = -1;
		Static249.anInt5064 = 0;
		Static18.anInt369 = -1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4383(@OriginalArg(1) String arg0) {
		return Static319.method5249(arg0, 10);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg1 < 1 || arg4 > Static350.anInt6637 - 2 || Static105.anInt2647 - 2 < arg1) {
			return;
		}
		if (!Static76.method1750() && !Static210.method3895(arg5, arg1, arg4, Static263.anInt6816)) {
			return;
		}
		if (Static273.aClass128ArrayArrayArray4 == null) {
			return;
		}
		@Pc(39) int local39 = arg5;
		if (arg5 < 3 && Static17.method309(arg1, arg4)) {
			local39 = arg5 + 1;
		}
		Static75.method1749(Static16.aClass170Array1[arg5], local39, arg7, Static274.aClass47_9, arg4, arg5, arg1);
		if (arg3 >= 0) {
			@Pc(68) boolean local68 = Static181.aBoolean302;
			Static181.aBoolean302 = true;
			Static55.method1173(arg0, arg3, Static16.aClass170Array1[arg5], arg1, false, arg4, arg2, arg5, Static274.aClass47_9, arg6, false, local39);
			Static181.aBoolean302 = local68;
		}
	}
}
