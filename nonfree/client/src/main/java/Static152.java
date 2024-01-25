import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public static int anInt2985;

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_49 = new Class156(131, 6);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIIBIZ)V")
	public static void method2786(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 <= arg3) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg2) / 2;
		@Pc(25) int local25 = arg3;
		@Pc(29) Class51_Sub1 local29 = Static592.aClass51_Sub1Array2[local23];
		Static592.aClass51_Sub1Array2[local23] = Static592.aClass51_Sub1Array2[arg2];
		Static592.aClass51_Sub1Array2[arg2] = local29;
		for (@Pc(41) int local41 = arg3; local41 < arg2; local41++) {
			if (Static591.method8145(arg0, arg4, Static592.aClass51_Sub1Array2[local41], arg1, local29, arg5) <= 0) {
				@Pc(63) Class51_Sub1 local63 = Static592.aClass51_Sub1Array2[local41];
				Static592.aClass51_Sub1Array2[local41] = Static592.aClass51_Sub1Array2[local25];
				Static592.aClass51_Sub1Array2[local25++] = local63;
			}
		}
		Static592.aClass51_Sub1Array2[arg2] = Static592.aClass51_Sub1Array2[local25];
		Static592.aClass51_Sub1Array2[local25] = local29;
		method2786(arg0, arg1, local25 - 1, arg3, arg4, arg5);
		method2786(arg0, arg1, arg2, local25 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIBZ)V")
	public static void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if ((arg5 ? Static577.aClass5_Sub19_25.aClass17_Sub15_1.method5251() : Static577.aClass5_Sub19_25.aClass17_Sub15_2.method5251()) != 0 && arg0 != 0 && Static65.anInt1087 < 50 && arg2 != -1) {
			Static24.aClass248Array1[Static65.anInt1087++] = new Class248((byte) (arg5 ? 3 : 2), arg2, arg0, arg3, arg4, 0, arg1, (Class4_Sub1) null);
		}
	}
}
