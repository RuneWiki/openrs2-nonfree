import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Z")
	public static boolean aBoolean287 = true;

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(II)Lclient!dea;")
	public static Class74 method3998(@OriginalArg(1) int arg0) {
		@Pc(14) Class74[] local14 = Static493.method6683();
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class74 local22 = local14[local16];
			if (local22.anInt2269 == arg0) {
				return local22;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;ZBJIIZILjava/lang/String;IJZ)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) int arg9, @OriginalArg(11) long arg10, @OriginalArg(12) boolean arg11) {
		if (!Static530.aBoolean556 && Static716.anInt11158 < 500) {
			@Pc(29) int local29 = arg5 == -1 ? Static167.anInt2966 : arg5;
			@Pc(45) Class3_Sub7_Sub10 local45 = new Class3_Sub7_Sub10(arg1, arg8, local29, arg9, arg4, arg10, arg7, arg0, arg2, arg11, arg3, arg6);
			Static190.method9220(local45);
		}
	}
}
