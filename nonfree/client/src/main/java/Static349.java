import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_86 = new Class244(65, 3);

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Z")
	public static boolean aBoolean449 = false;

	@OriginalMember(owner = "client!uh", name = "y", descriptor = "Z")
	public static boolean aBoolean450 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method5263(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(34) int local34 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local34++;
		}
		@Pc(58) char[] local58 = new char[local34];
		local58[0] = '+';
		for (@Pc(66) int local66 = local34 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIII[I)V")
	public static void method5265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		arg0--;
		@Pc(17) int local17 = arg1 - 1;
		@Pc(20) int local20 = local17 - 7;
		while (local20 > arg0) {
			@Pc(24) int local24 = arg0 + 1;
			arg3[local24] = arg2;
			@Pc(29) int local29 = local24 + 1;
			arg3[local29] = arg2;
			@Pc(34) int local34 = local29 + 1;
			arg3[local34] = arg2;
			@Pc(39) int local39 = local34 + 1;
			arg3[local39] = arg2;
			@Pc(44) int local44 = local39 + 1;
			arg3[local44] = arg2;
			@Pc(49) int local49 = local44 + 1;
			arg3[local49] = arg2;
			@Pc(54) int local54 = local49 + 1;
			arg3[local54] = arg2;
			arg0 = local54 + 1;
			arg3[arg0] = arg2;
		}
		while (arg0 < local17) {
			arg0++;
			arg3[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static221.anInt3917 <= arg6 && Static365.anInt6140 >= arg6 && arg0 >= Static221.anInt3917 && arg0 <= Static365.anInt6140 && arg1 >= Static221.anInt3917 && arg1 <= Static365.anInt6140 && arg3 >= Static221.anInt3917 && arg3 <= Static365.anInt6140 && arg8 >= Static26.anInt345 && Static272.anInt4750 >= arg8 && arg5 >= Static26.anInt345 && Static272.anInt4750 >= arg5 && Static26.anInt345 <= arg7 && Static272.anInt4750 >= arg7 && arg2 >= Static26.anInt345 && arg2 <= Static272.anInt4750) {
			Static221.method3680(arg0, arg6, arg8, arg2, arg4, arg5, arg7, arg3, arg1);
		} else {
			Static38.method619(arg6, arg5, arg3, arg0, arg1, arg7, arg8, arg4, arg2);
		}
	}
}
