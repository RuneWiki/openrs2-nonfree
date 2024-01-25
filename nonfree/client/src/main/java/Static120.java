import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "[Z")
	public static boolean[] aBooleanArray17;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
	public static int anInt2720 = 0;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
	public static int anInt2721 = 0;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I")
	public static int method2554(@OriginalArg(0) int arg0) {
		@Pc(12) double local12 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(28) double local28 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = local12;
		if (local12 > local21) {
			local30 = local21;
		}
		if (local28 < local30) {
			local30 = local28;
		}
		@Pc(44) double local44 = local12;
		if (local21 > local12) {
			local44 = local21;
		}
		if (local44 < local28) {
			local44 = local28;
		}
		@Pc(58) double local58 = 0.0D;
		@Pc(61) double local61 = (double) 0;
		@Pc(67) double local67 = (local30 + local44) / 2.0D;
		if (local44 != local30) {
			if (local67 < 0.5D) {
				local61 = (local44 - local30) / (local30 + local44);
			}
			if (local44 == local12) {
				local58 = (local21 - local28) / (local44 - local30);
			} else if (local44 == local21) {
				local58 = (local28 - local12) / (-local30 + local44) + 2.0D;
			} else if (local44 == local28) {
				local58 = (local12 - local21) / (-local30 + local44) + 4.0D;
			}
			if (local67 >= 0.5D) {
				local61 = (local44 - local30) / (2.0D - local44 - local30);
			}
		}
		local58 /= 6.0D;
		@Pc(152) int local152 = (int) (local58 * 256.0D);
		@Pc(157) int local157 = (int) (local61 * 256.0D);
		if (local157 < 0) {
			local157 = 0;
		} else if (local157 > 255) {
			local157 = 255;
		}
		@Pc(175) int local175 = (int) (local67 * 256.0D);
		if (local175 < 0) {
			local175 = 0;
		} else if (local175 > 255) {
			local175 = 255;
		}
		if (local175 > 243) {
			local157 >>= 0x4;
		} else if (local175 > 217) {
			local157 >>= 0x3;
		} else if (local175 > 192) {
			local157 >>= 0x2;
		} else if (local175 > 179) {
			local157 >>= 0x1;
		}
		return (local157 >> 5 << 7) + ((local152 & 0xFF) >> 2 << 10) + (local175 >> 1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IZZIZIII)V")
	public static void method2555(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (!arg2 && Static101.anInt2445 == arg4 && arg3 == Static237.anInt4697 && (arg5 == Static75.anInt1865 || Static105.method5089())) {
			return;
		}
		Static237.anInt4697 = arg3;
		Static101.anInt2445 = arg4;
		Static75.anInt1865 = arg5;
		if (Static105.method5089()) {
			Static75.anInt1865 = 0;
		}
		if (arg1) {
			Static82.method1759(28);
		} else {
			Static82.method1759(25);
		}
		Static227.method5321(Static341.aClass94_32, Static35.aString79, true);
		@Pc(49) int local49 = Static350.anInt6609;
		Static350.anInt6609 = (Static101.anInt2445 - (Static15.anInt287 >> 4)) * 8;
		@Pc(60) int local60 = Static237.anInt4696;
		Static237.anInt4696 = (Static237.anInt4697 - (Static325.anInt6173 >> 4)) * 8;
		Static207.aClass7_Sub1_Sub10_3 = Static306.method3059(Static101.anInt2445 * 8, Static237.anInt4697 * 8);
		Static275.aClass134_3 = null;
		@Pc(84) int local84 = Static350.anInt6609 - local49;
		@Pc(88) int local88 = Static237.anInt4696 - local60;
		@Pc(92) int local92;
		@Pc(101) int local101;
		if (arg1) {
			Static11.anInt3203 = 0;
			local92 = Static15.anInt287 * 128 - 128;
			@Pc(161) int local161 = (Static325.anInt6173 - 1) * 128;
			for (local101 = 0; local101 < 32768; local101++) {
				@Pc(168) Class22_Sub2_Sub1_Sub2 local168 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local101];
				if (local168 != null) {
					local168.anInt5973 -= local84 * 128;
					local168.anInt5967 -= local88 * 128;
					if (local168.anInt5973 >= 0 && local92 >= local168.anInt5973 && local168.anInt5967 >= 0 && local161 >= local168.anInt5967) {
						@Pc(221) boolean local221 = true;
						for (@Pc(223) int local223 = 0; local223 < 10; local223++) {
							local168.anIntArray666[local223] -= local84;
							local168.anIntArray665[local223] -= local88;
							if (local168.anIntArray666[local223] < 0 || Static15.anInt287 <= local168.anIntArray666[local223] || local168.anIntArray665[local223] < 0 || local168.anIntArray665[local223] >= Static325.anInt6173) {
								local221 = false;
							}
						}
						if (local221) {
							Static257.anIntArray649[Static11.anInt3203++] = local101;
						} else {
							Static69.aClass22_Sub2_Sub1_Sub2Array1[local101].method4426(null);
							Static69.aClass22_Sub2_Sub1_Sub2Array1[local101] = null;
						}
					} else {
						Static69.aClass22_Sub2_Sub1_Sub2Array1[local101].method4426(null);
						Static69.aClass22_Sub2_Sub1_Sub2Array1[local101] = null;
					}
				}
			}
		} else {
			for (local92 = 0; local92 < 32768; local92++) {
				@Pc(97) Class22_Sub2_Sub1_Sub2 local97 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local92];
				if (local97 != null) {
					for (local101 = 0; local101 < 10; local101++) {
						local97.anIntArray666[local101] -= local84;
						local97.anIntArray665[local101] -= local88;
					}
					local97.anInt5967 -= local88 * 128;
					local97.anInt5973 -= local84 * 128;
				}
			}
		}
		for (local92 = 0; local92 < 2048; local92++) {
			@Pc(309) Class22_Sub2_Sub1_Sub1 local309 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local92];
			if (local309 != null) {
				for (local101 = 0; local101 < 10; local101++) {
					local309.anIntArray666[local101] -= local84;
					local309.anIntArray665[local101] -= local88;
				}
				local309.anInt5967 -= local88 * 128;
				local309.anInt5973 -= local84 * 128;
			}
		}
		Static168.anInt3508 = arg5;
		Static252.aClass22_Sub2_Sub1_Sub1_4.method822(arg0, false, Static168.anInt3508, arg6);
		Static54.method1139(local84, local88);
		for (@Pc(376) Class7_Sub29 local376 = (Class7_Sub29) Static79.aClass74_9.method1793(); local376 != null; local376 = (Class7_Sub29) Static79.aClass74_9.method1798()) {
			local376.anInt4639 -= local88;
			local376.anInt4647 -= local84;
			if (local376.anInt4647 < 0 || local376.anInt4639 < 0 || Static15.anInt287 <= local376.anInt4647 || Static325.anInt6173 <= local376.anInt4639) {
				local376.method5648();
			}
		}
		Static235.anInt4675 = 0;
		if (Static35.anInt1025 != 0) {
			Static259.anInt5013 -= local88;
			Static35.anInt1025 -= local84;
		}
		if (arg1) {
			Static175.anInt3621 -= local88;
			Static24.anInt478 -= local88 * 128;
			Static318.anInt614 -= local88;
			Static121.anInt2750 -= local84;
			Static198.anInt3898 -= local84;
			Static203.anInt4014 -= local84 * 128;
			if (Math.abs(local84) > Static15.anInt287 || Math.abs(local88) > Static325.anInt6173) {
				Static198.method3548();
			}
		} else if (Static118.anInt6324 == 4) {
			Static318.anInt611 -= local88 * 128;
			Static74.anInt1848 -= local84 * 128;
			Static319.anInt6099 -= local88 * 128;
			Static98.anInt1131 -= local84 * 128;
		} else {
			Static118.anInt6324 = 1;
		}
		Static168.method3213();
		Static338.aClass74_36.method1803();
		Static192.aClass74_29.method1803();
		Static187.aClass191_4.method4865();
		Static8.method143();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = arg1; local5 <= arg0; local5++) {
			for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
				if (Static42.anIntArrayArray16[local5][local12] == arg3 && Static143.anIntArrayArray32[local5][local12] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
