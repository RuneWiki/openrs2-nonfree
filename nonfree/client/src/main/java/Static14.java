import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZIIZII)V")
	public static void method378(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= arg2) {
			return;
		}
		@Pc(23) int local23 = (arg5 + arg2) / 2;
		@Pc(25) int local25 = arg5;
		@Pc(29) Class236_Sub1 local29 = Static588.aClass236_Sub1Array2[local23];
		Static588.aClass236_Sub1Array2[local23] = Static588.aClass236_Sub1Array2[arg2];
		Static588.aClass236_Sub1Array2[arg2] = local29;
		for (@Pc(41) int local41 = arg5; local41 < arg2; local41++) {
			if (Static606.method8258(Static588.aClass236_Sub1Array2[local41], local29, arg3, arg1, arg0, arg4) <= 0) {
				@Pc(58) Class236_Sub1 local58 = Static588.aClass236_Sub1Array2[local41];
				Static588.aClass236_Sub1Array2[local41] = Static588.aClass236_Sub1Array2[local25];
				Static588.aClass236_Sub1Array2[local25++] = local58;
			}
		}
		Static588.aClass236_Sub1Array2[arg2] = Static588.aClass236_Sub1Array2[local25];
		Static588.aClass236_Sub1Array2[local25] = local29;
		method378(arg0, arg1, local25 - 1, arg3, arg4, arg5);
		method378(arg0, arg1, arg2, arg3, arg4, local25 + 1);
	}
}
