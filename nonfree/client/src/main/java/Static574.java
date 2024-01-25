import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	public static int anInt8715;

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "[I")
	public static int[] anIntArray632;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
	public static int anInt8718 = -1;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(III)Lclient!cja;")
	public static Class9_Sub1_Sub2 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass9_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIZIIIII)Z")
	public static boolean method7434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static156.method2538(arg0, arg5, arg3)) {
			return false;
		}
		@Pc(26) int local26 = Static464.anIntArray743[0];
		@Pc(30) int local30 = Static464.anIntArray743[2];
		@Pc(34) int local34 = Static464.anIntArray743[1];
		if (!Static156.method2538(arg7, arg4, arg2)) {
			return false;
		}
		@Pc(47) int local47 = Static464.anIntArray743[1];
		@Pc(51) int local51 = Static464.anIntArray743[0];
		@Pc(55) int local55 = Static464.anIntArray743[2];
		if (Static156.method2538(arg1, arg8, arg6)) {
			@Pc(68) int local68 = Static464.anIntArray743[2];
			@Pc(72) int local72 = Static464.anIntArray743[0];
			@Pc(76) int local76 = Static464.anIntArray743[1];
			return Static166.method2695(local51, local26, local68, local72, local34, local30, local55, local76, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z")
	public static boolean method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static510.aByteArrayArrayArray11[1].length > arg0 && Static510.aByteArrayArrayArray11[1][arg0].length > arg1) {
			return (Static510.aByteArrayArrayArray11[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
