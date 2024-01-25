import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hga", name = "d", descriptor = "D")
	public static double aDouble6;

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
	public static int anInt3810 = 0;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIII)V")
	public static void method3264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class351 local7 = Static567.aClass351ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class9_Sub2_Sub5 local13 = local7.aClass9_Sub2_Sub5_1;
		@Pc(16) Class9_Sub2_Sub5 local16 = local7.aClass9_Sub2_Sub5_2;
		if (local13 != null) {
			local13.aShort98 = (short) (local13.aShort98 * arg3 / (0x10 << Static485.anInt8241 - 7));
			local13.aShort97 = (short) (local13.aShort97 * arg3 / (0x10 << Static485.anInt8241 - 7));
		}
		if (local16 != null) {
			local16.aShort98 = (short) (local16.aShort98 * arg3 / (0x10 << Static485.anInt8241 - 7));
			local16.aShort97 = (short) (local16.aShort97 * arg3 / (0x10 << Static485.anInt8241 - 7));
		}
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIIZII)V")
	public static void method3268(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static32.aClass3_Sub41_3.aClass7_Sub15_2.method5663() != 0 && arg0 != 0 && Static154.anInt3152 < 50 && arg1 != -1) {
			Static110.aClass130Array1[Static154.anInt3152++] = new Class130((byte) 2, arg1, arg0, arg4, arg5, arg3, arg2, (Class9_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(IIII)V")
	public static void method3270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg1 * Static32.aClass3_Sub41_3.aClass7_Sub15_1.method5663() >> 8;
		if (local13 == 0 || arg2 == -1) {
			return;
		}
		if (!Static145.aBoolean263 && Static573.anInt6752 != -1 && Static291.method4809() && !Static556.method7889()) {
			Static267.aClass3_Sub3_Sub1_2 = Static317.method5284();
			@Pc(41) Class3_Sub3_Sub1 local41 = Static280.method4566(Static267.aClass3_Sub3_Sub1_2);
			Static378.method5965(local41);
		}
		Static471.method6966(local13, Static498.aClass343_232, arg2);
		Static250.method6648(255, -1);
		Static145.aBoolean263 = true;
	}
}
