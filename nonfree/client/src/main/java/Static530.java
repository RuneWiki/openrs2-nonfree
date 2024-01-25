import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Z")
	public static boolean aBoolean743 = false;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	public static int anInt8752 = 0;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg7 < 1 || arg5 > Static201.anInt3834 - 2 || Static626.anInt10238 - 2 < arg7) {
			return;
		}
		@Pc(31) int local31 = arg6;
		if (arg6 < 3 && Static599.method8200(arg7, arg5)) {
			local31 = arg6 + 1;
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 0 && !Static658.method8808(Static419.anInt7416, arg7, arg5, local31)) {
			return;
		}
		if (Static635.aClass226ArrayArrayArray3 == null) {
			return;
		}
		Static373.aClass104_Sub1_2.method2603(arg5, Static208.aClass65_7, arg0, Static275.aClass106Array1[arg6], arg7, arg6);
		if (arg2 >= 0) {
			@Pc(76) int local76 = Static172.aClass5_Sub50_14.aClass12_Sub10_1.method2365();
			Static172.aClass5_Sub50_14.method7531(1, Static172.aClass5_Sub50_14.aClass12_Sub10_1);
			Static373.aClass104_Sub1_2.method2599(local31, arg5, arg3, Static275.aClass106Array1[arg6], arg7, arg2, arg1, Static208.aClass65_7, arg4, arg6);
			Static172.aClass5_Sub50_14.method7531(local76, Static172.aClass5_Sub50_14.aClass12_Sub10_1);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!jba;)V")
	public static void method7444(@OriginalArg(0) int arg0, @OriginalArg(2) Class175 arg1) {
		if (Static204.anInt3872 >= 50 || (arg1 == null || arg1.anIntArrayArray24 == null || arg1.anIntArrayArray24.length <= arg0 || arg1.anIntArrayArray24[arg0] == null)) {
			return;
		}
		@Pc(34) int local34 = arg1.anIntArrayArray24[arg0][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(57) int local57;
		if (arg1.anIntArrayArray24[arg0].length > 1) {
			local57 = (int) (Math.random() * (double) arg1.anIntArrayArray24[arg0].length);
			if (local57 > 0) {
				local38 = arg1.anIntArrayArray24[arg0][local57];
			}
		}
		@Pc(75) int local75 = local34 >> 5 & 0x7;
		local57 = 256;
		if (arg1.anIntArray290 != null && arg1.anIntArray289 != null) {
			local57 = Static535.method7515(arg1.anIntArray290[arg0], arg1.anIntArray289[arg0]);
		}
		if (arg1.aBoolean425) {
			Static155.method446(255, local57, 0, false, local75, local38);
		} else {
			Static595.method8160(255, local75, local57, local38, 0);
		}
	}
}
