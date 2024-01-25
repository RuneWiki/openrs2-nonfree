import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIII)V")
	public static void method4338(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg3 + arg5;
		@Pc(14) int local14 = arg0 - arg5;
		for (@Pc(16) int local16 = arg3; local16 < local9; local16++) {
			Static36.method1264(Static632.anIntArrayArray65[local16], arg2, arg4, arg1);
		}
		@Pc(35) int local35 = arg1 - arg5;
		@Pc(40) int local40 = arg2 + arg5;
		for (@Pc(50) int local50 = arg0; local50 > local14; local50--) {
			Static36.method1264(Static632.anIntArrayArray65[local50], arg2, arg4, arg1);
		}
		for (@Pc(66) int local66 = local9; local66 <= local14; local66++) {
			@Pc(72) int[] local72 = Static632.anIntArrayArray65[local66];
			Static36.method1264(local72, arg2, arg4, local40);
			Static36.method1264(local72, local35, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4339(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(II)I")
	public static int method4340(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(28) int local28 = (arg0 * local19 >> 12) + 40960;
		return local28 * local13 >> 12;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IFFBFFFF)F")
	public static float method4341(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(11) float local11 = arg5 - arg6;
		@Pc(16) float local16 = arg1 - arg4;
		@Pc(20) float local20 = arg2 - arg3;
		@Pc(22) float local22 = 0.0F;
		@Pc(24) float local24 = 0.0F;
		@Pc(33) float local33 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(41) float local41 = local7 * local11 + arg6;
			@Pc(47) float local47 = local7 * local16 + arg4;
			@Pc(53) float local53 = arg3 + local20 * local7;
			@Pc(58) int local58 = (int) local41 >> 9;
			@Pc(63) int local63 = (int) local53 >> 9;
			if (local58 > 0 && local63 > 0 && local58 < Static372.anInt7082 && Static218.anInt5023 > local63) {
				@Pc(90) int local90 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124;
				if (local90 < 3 && (Static118.aByteArrayArrayArray20[1][local58][local63] & 0x2) != 0) {
					local90++;
				}
				@Pc(117) int local117 = Static86.aClass86Array2[local90].method8088((int) local53, (int) local41);
				if (local47 > (float) local117) {
					if (arg0 >= 2) {
						return method4341(arg0 - 1, local47, local53, local33, local24, local41, local22) * 0.1F + local7 - 0.1F;
					}
					return local7;
				}
			}
			local33 = local53;
			local24 = local47;
			local22 = local41;
			local7 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
	public static void method4342() {
		if (!Static317.aBoolean656) {
			Static146.aFloat76 += (12.0F - Static146.aFloat76) / 2.0F;
			Static69.aBoolean558 = true;
			Static317.aBoolean656 = true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIII)V")
	public static void method4343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 - arg3;
		@Pc(13) int local13 = arg0 - arg4;
		if (local9 == 0) {
			if (local13 != 0) {
				Static480.method7075(arg4, arg0, arg1, arg3);
			}
		} else if (local13 == 0) {
			Static500.method7263(arg4, arg2, arg1, arg3);
		} else {
			@Pc(39) int local39 = (local13 << 12) / local9;
			@Pc(48) int local48 = arg4 - (arg3 * local39 >> 12);
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (arg3 < Static251.anInt9634) {
				local57 = Static251.anInt9634;
				local65 = (local39 * Static251.anInt9634 >> 12) + local48;
			} else if (arg3 <= Static366.anInt6946) {
				local65 = arg4;
				local57 = arg3;
			} else {
				local65 = (Static366.anInt6946 * local39 >> 12) + local48;
				local57 = Static366.anInt6946;
			}
			@Pc(100) int local100;
			@Pc(98) int local98;
			if (Static251.anInt9634 > arg2) {
				local100 = Static251.anInt9634;
				local98 = (Static251.anInt9634 * local39 >> 12) + local48;
			} else if (arg2 <= Static366.anInt6946) {
				local98 = arg0;
				local100 = arg2;
			} else {
				local100 = Static366.anInt6946;
				local98 = local48 + (Static366.anInt6946 * local39 >> 12);
			}
			if (Static444.anInt8258 > local65) {
				local65 = Static444.anInt8258;
				local57 = (Static444.anInt8258 - local48 << 12) / local39;
			} else if (Static188.anInt4410 < local65) {
				local65 = Static188.anInt4410;
				local57 = (Static188.anInt4410 - local48 << 12) / local39;
			}
			if (Static444.anInt8258 > local98) {
				local100 = (Static444.anInt8258 - local48 << 12) / local39;
				local98 = Static444.anInt8258;
			} else if (Static188.anInt4410 < local98) {
				local100 = (Static188.anInt4410 - local48 << 12) / local39;
				local98 = Static188.anInt4410;
			}
			Static284.method4806(local57, arg1, local98, local100, local65);
		}
	}
}
