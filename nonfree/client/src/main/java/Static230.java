import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ica", name = "H", descriptor = "Lclient!od;")
	public static Class233 aClass233_3;

	@OriginalMember(owner = "client!ica", name = "C", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_20 = new Class8();

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)V")
	public static void method3435() {
		Static495.anInt8598 = 0;
		@Pc(12) int local12 = (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9) + Static606.anInt8651;
		@Pc(19) int local19 = Static195.anInt3961 + (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static495.anInt8598 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static495.anInt8598 = 1;
		}
		if (Static495.anInt8598 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static495.anInt8598 = 0;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method3436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) Class51_Sub1 local20 = Static187.aClass51_Sub1Array1[local14];
		Static187.aClass51_Sub1Array1[local14] = Static187.aClass51_Sub1Array1[arg0];
		Static187.aClass51_Sub1Array1[arg0] = local20;
		for (@Pc(32) int local32 = arg1; local32 < arg0; local32++) {
			if (Static130.method2129(Static187.aClass51_Sub1Array1[local32], arg3, local20, arg4, arg2, arg5) <= 0) {
				@Pc(49) Class51_Sub1 local49 = Static187.aClass51_Sub1Array1[local32];
				Static187.aClass51_Sub1Array1[local32] = Static187.aClass51_Sub1Array1[local16];
				Static187.aClass51_Sub1Array1[local16++] = local49;
			}
		}
		Static187.aClass51_Sub1Array1[arg0] = Static187.aClass51_Sub1Array1[local16];
		Static187.aClass51_Sub1Array1[local16] = local20;
		method3436(local16 - 1, arg1, arg2, arg3, arg4, arg5);
		method3436(arg0, local16 + 1, arg2, arg3, arg4, arg5);
	}
}
