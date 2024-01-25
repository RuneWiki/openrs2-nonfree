import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!u", name = "k", descriptor = "Lclient!wv;")
	public static Class395 aClass395_5;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIB)Z")
	public static boolean method8038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(FFFIBFFF)F")
	public static float method8039(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg0 - arg2;
		@Pc(25) float local25 = arg4 - arg6;
		@Pc(29) float local29 = arg5 - arg1;
		@Pc(31) float local31 = 0.0F;
		@Pc(33) float local33 = 0.0F;
		@Pc(35) float local35 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(43) float local43 = local7 * local12 + arg2;
			@Pc(49) float local49 = arg6 + local7 * local25;
			@Pc(55) float local55 = local7 * local29 + arg1;
			@Pc(60) int local60 = (int) local43 >> 9;
			@Pc(65) int local65 = (int) local55 >> 9;
			if (local60 > 0 && local65 > 0 && Static201.anInt3834 > local60 && local65 < Static626.anInt10238) {
				@Pc(85) int local85 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145;
				if (local85 < 3 && (Static7.aByteArrayArrayArray1[1][local60][local65] & 0x2) != 0) {
					local85++;
				}
				@Pc(109) int local109 = Static605.aClass109Array5[local85].method7702((int) local43, (int) local55);
				if (local49 > (float) local109) {
					if (arg3 < 2) {
						return local7;
					}
					return method8039(local43, local35, local31, arg3 - 1, local49, local55, local33) * 0.1F + local7 - 0.1F;
				}
			}
			local7 += 0.1F;
			local35 = local55;
			local33 = local49;
			local31 = local43;
		}
		return -1.0F;
	}
}
