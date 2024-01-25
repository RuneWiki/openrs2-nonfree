import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray11;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "F")
	public static float aFloat229 = 0.0F;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!u;ZLclient!u;)V")
	public static void method7859(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class3 arg1) {
		if (arg0.aClass3_286 != null) {
			arg0.method8128();
		}
		arg0.aClass3_286 = arg1.aClass3_286;
		arg0.aClass3_285 = arg1;
		arg0.aClass3_286.aClass3_285 = arg0;
		arg0.aClass3_285.aClass3_286 = arg0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg3 - arg0;
		@Pc(18) int local18 = arg1 + arg0;
		for (@Pc(20) int local20 = arg1; local20 < local18; local20++) {
			Static504.method6755(arg4, arg2, Static570.anIntArrayArray100[local20], arg6);
		}
		for (@Pc(40) int local40 = arg3; local40 > local14; local40--) {
			Static504.method6755(arg4, arg2, Static570.anIntArrayArray100[local40], arg6);
		}
		@Pc(58) int local58 = arg0 + arg6;
		@Pc(63) int local63 = arg2 - arg0;
		for (@Pc(65) int local65 = local18; local65 <= local14; local65++) {
			@Pc(71) int[] local71 = Static570.anIntArrayArray100[local65];
			Static504.method6755(arg4, local58, local71, arg6);
			Static504.method6755(arg5, local63, local71, local58);
			Static504.method6755(arg4, arg2, local71, local63);
		}
	}
}
