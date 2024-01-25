import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
	public static int anInt9278;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
	public static int anInt9279 = 0;

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_270 = new Class363(10, 3);

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "[Lclient!es;")
	public static final Class2_Sub15[] aClass2_Sub15Array1 = new Class2_Sub15[2048];

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(IIIIII)V")
	public static void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static489.method6853(arg4, Static326.anInt6028, Static80.anInt1738);
		@Pc(22) int local22 = Static489.method6853(arg1, Static326.anInt6028, Static80.anInt1738);
		@Pc(28) int local28 = Static489.method6853(arg0, Static553.anInt9074, Static249.anInt4668);
		@Pc(34) int local34 = Static489.method6853(arg2, Static553.anInt9074, Static249.anInt4668);
		for (@Pc(36) int local36 = local11; local36 <= local22; local36++) {
			Static276.method3099(local28, Static582.anIntArrayArray69[local36], arg3, local34);
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V")
	public static void method7699() {
		if (!Static25.aBoolean32) {
			return;
		}
		@Pc(15) Class196 local15 = Static217.method3485(Static514.anInt406, Static428.anInt7337);
		if (local15 != null && local15.anObjectArray3 != null) {
			@Pc(24) Class2_Sub31 local24 = new Class2_Sub31();
			local24.anObjectArray32 = local15.anObjectArray3;
			local24.aClass196_4 = local15;
			Static552.method7490(local24);
		}
		Static78.anInt9033 = -1;
		Static25.aBoolean32 = false;
		Static510.anInt8520 = -1;
		if (local15 != null) {
			Static515.method7134(local15);
		}
	}
}
