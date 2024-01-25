import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!u", name = "N", descriptor = "I")
	public static int anInt8648;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
	public static int anInt8650;

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Lclient!ae;")
	public static Class8 aClass8_62 = new Class8();

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IIII)I")
	public static int method7217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static421.aClass67Array7 == null) {
			return 0;
		}
		@Pc(16) int local16 = arg0 >> 9;
		@Pc(20) int local20 = arg2 >> 9;
		if (local16 < 0 || local20 < 0 || Static188.anInt3850 - 1 < local16 || local20 > Static49.anInt1174 - 1) {
			return 0;
		}
		@Pc(41) int local41 = arg1;
		if (arg1 < 3 && (Static521.aByteArrayArrayArray45[1][local16][local20] & 0x2) != 0) {
			local41 = arg1 + 1;
		}
		return Static421.aClass67Array7[local41].method6711(arg2, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)V")
	public static void method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		Static276.method3099(arg3 - arg0, Static582.anIntArrayArray69[arg1], arg2, arg3 + arg0);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(51) int[] local51 = Static582.anIntArrayArray69[arg1 + local9];
				@Pc(58) int[] local58 = Static582.anIntArrayArray69[arg1 - local9];
				@Pc(62) int local62 = local7 + arg3;
				@Pc(67) int local67 = arg3 - local7;
				Static276.method3099(local67, local51, arg2, local62);
				Static276.method3099(local67, local58, arg2, local62);
			}
			@Pc(83) int local83 = arg3 + local9;
			@Pc(88) int local88 = arg3 - local9;
			@Pc(94) int[] local94 = Static582.anIntArrayArray69[local7 + arg1];
			@Pc(101) int[] local101 = Static582.anIntArrayArray69[arg1 - local7];
			Static276.method3099(local88, local94, arg2, local83);
			Static276.method3099(local88, local101, arg2, local83);
		}
	}
}
