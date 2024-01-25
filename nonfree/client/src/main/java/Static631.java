import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static631 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public static int anInt10491 = -1;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "[J")
	public static final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "Z")
	public static boolean aBoolean753 = true;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public static int anInt10493 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V")
	public static void method8920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static361.anIntArrayArray64 != null) {
			Static361.anIntArrayArray64[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static328.aShortArrayArray23 != null) {
			Static328.aShortArrayArray23[arg0][arg1] = (short) arg3;
		}
		if (Static488.aByteArrayArray18 != null) {
			Static488.aByteArrayArray18[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(FFFFIFFZ)F")
	public static float method8922(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg2 - arg6;
		@Pc(17) float local17 = arg1 - arg0;
		@Pc(22) float local22 = arg3 - arg5;
		@Pc(24) float local24 = 0.0F;
		@Pc(26) float local26 = 0.0F;
		@Pc(28) float local28 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(45) float local45 = arg6 + local7 * local12;
			@Pc(51) float local51 = local17 * local7 + arg0;
			@Pc(57) float local57 = local22 * local7 + arg5;
			@Pc(62) int local62 = (int) local45 >> 9;
			@Pc(67) int local67 = (int) local57 >> 9;
			if (local62 > 0 && local67 > 0 && Static326.anInt5541 > local62 && Static448.anInt7637 > local67) {
				@Pc(91) int local91 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132;
				if (local91 < 3 && (Static305.aByteArrayArrayArray18[1][local62][local67] & 0x2) != 0) {
					local91++;
				}
				@Pc(117) int local117 = Static20.aClass61Array2[local91].method8584((int) local57, (int) local45);
				if (local51 > (float) local117) {
					if (arg4 >= 2) {
						return method8922(local26, local51, local45, local57, arg4 - 1, local28, local24) * 0.1F + local7 - 0.1F;
					}
					return local7;
				}
			}
			local28 = local57;
			local24 = local45;
			local7 += 0.1F;
			local26 = local51;
		}
		return -1.0F;
	}
}
