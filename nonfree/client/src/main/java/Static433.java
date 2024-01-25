import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "[I")
	public static final int[] anIntArray424 = new int[2];

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_179 = new Class362(68, 7);

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg3 < 1 || Static428.anInt8046 - 2 < arg5 || Static119.anInt2717 - 2 < arg3) {
			return;
		}
		@Pc(29) int local29 = arg6;
		if (arg6 < 3 && Static310.method5267(arg5, arg3)) {
			local29 = arg6 + 1;
		}
		if (!Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000) && !Static560.method8056(arg5, Static223.anInt4078, local29, arg3)) {
			return;
		}
		if (Static60.aClass53ArrayArrayArray1 == null) {
			return;
		}
		Static130.aClass179_Sub1_3.method4071(arg5, Static86.aClass111Array1[arg6], arg3, arg6, arg1, Static440.aClass44_12);
		if (arg0 < 0) {
			return;
		}
		@Pc(76) boolean local76 = Static214.aClass4_Sub19_Sub1_1.aBoolean264;
		Static214.aClass4_Sub19_Sub1_1.aBoolean264 = true;
		Static130.aClass179_Sub1_3.method4077(Static86.aClass111Array1[arg6], arg7, arg5, arg2, arg0, Static440.aClass44_12, arg3, arg6, local29, arg4);
		Static214.aClass4_Sub19_Sub1_1.aBoolean264 = local76;
		return;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)I")
	public static int method6766() {
		if (Static49.aBoolean36) {
			return 6;
		} else if (Static577.aClass4_Sub39_3 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static577.aClass4_Sub39_3.anInt8541;
			if (Static150.method2826(local14)) {
				return 1;
			} else if (Static504.method7403(local14)) {
				return 2;
			} else if (Static52.method683(local14)) {
				return 3;
			} else if (Static114.method7979(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}
}
