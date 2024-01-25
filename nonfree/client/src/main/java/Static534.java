import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "Lclient!ra;")
	public static Class13 aClass13_4;

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
	public static final int[] anIntArray686 = new int[200];

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
	public static final int anInt8997 = 1406;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
	public static int anInt9003 = 0;

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IBIIIIIZI)Z")
	public static boolean method7283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22 = Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray306[0];
		@Pc(27) int local27 = Static35.aClass15_Sub2_Sub1_Sub1_1.anIntArray307[0];
		if (local22 < 0 || local22 >= Static460.anInt7894 || local27 < 0 || local27 >= Static235.anInt4493) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static460.anInt7894 && arg0 >= 0 && arg0 < Static235.anInt4493) {
			@Pc(87) int local87 = Static402.method5842(arg4, arg0, Static71.aClass10Array3[Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91], Static218.anIntArray285, arg7, arg1, Static226.anIntArray321, local22, local27, arg3, Static35.aClass15_Sub2_Sub1_Sub1_1.method4035(), arg5, arg2, arg6);
			if (local87 < 1) {
				return false;
			}
			Static384.anInt7374 = Static226.anIntArray321[local87 - 1];
			Static40.anInt919 = Static218.anIntArray285[local87 - 1];
			Static415.aBoolean523 = false;
			Static111.method2212();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIZIZI)V")
	public static void method7284(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(24) int local24 = (arg1 + arg3) / 2;
		@Pc(26) int local26 = arg1;
		@Pc(30) Class35_Sub1 local30 = Static74.aClass35_Sub1Array1[local24];
		Static74.aClass35_Sub1Array1[local24] = Static74.aClass35_Sub1Array1[arg3];
		Static74.aClass35_Sub1Array1[arg3] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg3; local42++) {
			if (Static30.method698(local30, arg4, arg5, arg0, Static74.aClass35_Sub1Array1[local42], arg2) <= 0) {
				@Pc(59) Class35_Sub1 local59 = Static74.aClass35_Sub1Array1[local42];
				Static74.aClass35_Sub1Array1[local42] = Static74.aClass35_Sub1Array1[local26];
				Static74.aClass35_Sub1Array1[local26++] = local59;
			}
		}
		Static74.aClass35_Sub1Array1[arg3] = Static74.aClass35_Sub1Array1[local26];
		Static74.aClass35_Sub1Array1[local26] = local30;
		method7284(arg0, arg1, arg2, local26 - 1, arg4, arg5);
		method7284(arg0, local26 + 1, arg2, arg3, arg4, arg5);
	}
}
