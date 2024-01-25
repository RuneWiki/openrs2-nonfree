import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lclient!sfa;")
	public static Class338 aClass338_9;

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[I")
	public static final int[] anIntArray714 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(FFFFFFIB)F")
	public static float method8441(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg4 - arg5;
		@Pc(16) float local16 = arg2 - arg3;
		@Pc(20) float local20 = arg1 - arg0;
		@Pc(22) float local22 = 0.0F;
		@Pc(39) float local39 = 0.0F;
		@Pc(41) float local41 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(51) float local51 = local12 * local7 + arg5;
			@Pc(57) float local57 = arg3 + local7 * local16;
			@Pc(63) float local63 = arg0 + local7 * local20;
			@Pc(68) int local68 = (int) local51 >> 9;
			@Pc(73) int local73 = (int) local63 >> 9;
			if (local68 > 0 && local73 > 0 && local68 < Static497.anInt7926 && local73 < Static646.anInt9979) {
				@Pc(106) int local106 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.aByte139;
				if (local106 < 3 && (Static510.aByteArrayArrayArray11[1][local68][local73] & 0x2) != 0) {
					local106++;
				}
				@Pc(137) int local137 = Static43.aClass259Array1[local106].method9294((int) local63, (int) local51);
				if (local57 > (float) local137) {
					if (arg6 >= 2) {
						return method8441(local41, local63, local57, local39, local51, local22, arg6 - 1) * 0.1F + local7 - 0.1F;
					}
					return local7;
				}
			}
			local22 = local51;
			local7 += 0.1F;
			local39 = local57;
			local41 = local63;
		}
		return -1.0F;
	}
}
