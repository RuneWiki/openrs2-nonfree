import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
	public static int anInt2480;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Lclient!rk;")
	public static Class180 aClass180_31;

	@OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!rk;)V")
	public static void method2058(@OriginalArg(1) Class180 arg0) {
		Static343.aClass180_97 = arg0;
		Static266.anInt5230 = Static343.aClass180_97.method4553(15);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIIIIIIIZI)Z")
	public static boolean method2059(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static155.method2999(arg3, arg4, Static205.anIntArray561, arg7, arg1, arg2, Static327.aClass149Array1[Static168.anInt3508], arg0, arg8, Static252.aClass22_Sub2_Sub1_Sub1_4.method4421(), arg5, Static27.anIntArray85, arg6, arg9);
		if (local24 < 1) {
			return false;
		}
		Static35.anInt1025 = Static27.anIntArray85[local24 - 1];
		Static259.anInt5013 = Static205.anIntArray561[local24 - 1];
		Static35.aBoolean78 = false;
		Static118.method5348();
		return true;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILclient!gb;)V")
	public static void method2060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22_Sub3 arg4) {
		arg4.anInt1135 = (arg1 << 7) + 64;
		arg4.anInt1130 = arg3;
		arg4.anInt1129 = (arg2 << 7) + 64;
		@Pc(24) Class49 local24 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class47 local31 = local24.aClass47_3; local31 != null; local31 = local31.aClass47_2) {
				if (local31.aClass22_Sub2_1.aBoolean434) {
					@Pc(41) int local41 = local31.aClass22_Sub2_1.method5057();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt1130 += local28;
				arg4.aBoolean86 = true;
			}
		}
		if (Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2] == null) {
			Static248.method4274(arg0, arg1, arg2);
		}
		Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2].aClass22_Sub3_1 = arg4;
	}
}
