import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method3289() {
		if (Static398.anInt7203 == -1 || Static458.anInt7957 == -1) {
			return;
		}
		@Pc(22) int local22 = (Static3.anInt50 * (Static89.anInt7967 - Static71.anInt1879) >> 16) + Static71.anInt1879;
		Static3.anInt50 += local22;
		if (Static3.anInt50 >= 65535) {
			if (Static21.aBoolean426) {
				Static343.aBoolean401 = false;
			} else {
				Static343.aBoolean401 = true;
			}
			Static3.anInt50 = 65535;
			Static21.aBoolean426 = true;
		} else {
			Static343.aBoolean401 = false;
			Static21.aBoolean426 = false;
		}
		@Pc(50) float local50 = (float) Static3.anInt50 / 65535.0F;
		@Pc(53) float[] local53 = new float[3];
		@Pc(57) int local57 = Static69.anInt1836 * 2;
		@Pc(82) int local82;
		@Pc(115) int local115;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(136) int local136;
		@Pc(153) int local153;
		for (@Pc(59) int local59 = 0; local59 < 3; local59++) {
			@Pc(70) int local70 = Static84.anIntArrayArrayArray2[Static398.anInt7203][local57][local59] * 3;
			local82 = Static84.anIntArrayArrayArray2[Static398.anInt7203][local57 + 1][local59] * 3;
			local115 = (Static84.anIntArrayArrayArray2[Static398.anInt7203][local57 + 2][local59] + Static84.anIntArrayArrayArray2[Static398.anInt7203][local57 + 2][local59] - Static84.anIntArrayArrayArray2[Static398.anInt7203][local57 + 3][local59]) * 3;
			local123 = Static84.anIntArrayArrayArray2[Static398.anInt7203][local57][local59];
			local128 = local82 - local70;
			local136 = local115 + local70 - local82 * 2;
			local153 = local82 + Static84.anIntArrayArrayArray2[Static398.anInt7203][local57 + 2][local59] - local123 - local115;
			local53[local59] = (float) local123 + local50 * ((float) local128 + ((float) local136 + local50 * (float) local153) * local50);
		}
		Static107.anInt2426 = (int) local53[1] * -1;
		Static378.anInt6885 = (int) local53[0] - Static278.anInt5374 * 128;
		Static78.anInt1973 = (int) local53[2] - Static380.anInt6896 * 128;
		@Pc(209) float[] local209 = new float[3];
		local82 = Static420.anInt4323 * 2;
		for (local115 = 0; local115 < 3; local115++) {
			local123 = Static84.anIntArrayArrayArray2[Static458.anInt7957][local82][local115] * 3;
			local128 = Static84.anIntArrayArrayArray2[Static458.anInt7957][local82 + 1][local115] * 3;
			local136 = (Static84.anIntArrayArrayArray2[Static458.anInt7957][local82 + 2][local115] + Static84.anIntArrayArrayArray2[Static458.anInt7957][local82 + 2][local115] - Static84.anIntArrayArrayArray2[Static458.anInt7957][local82 + 3][local115]) * 3;
			local153 = Static84.anIntArrayArrayArray2[Static458.anInt7957][local82][local115];
			@Pc(288) int local288 = local128 - local123;
			@Pc(297) int local297 = local123 + local136 - local128 * 2;
			@Pc(314) int local314 = local128 + Static84.anIntArrayArrayArray2[Static458.anInt7957][local82 + 2][local115] - local136 - local153;
			local209[local115] = local50 * (((float) local297 + (float) local314 * local50) * local50 + (float) local288) + (float) local153;
		}
		@Pc(348) float local348 = local209[0] - local53[0];
		@Pc(359) float local359 = (local209[1] - local53[1]) * -1.0F;
		@Pc(368) float local368 = local209[2] - local53[2];
		@Pc(378) double local378 = Math.sqrt((double) (local348 * local348 + local368 * local368));
		Static217.anInt4351 = (int) (Math.atan2((double) local359, local378) * 2607.5945876176133D) & 0x3FFF;
		Static147.anInt3170 = (int) (-Math.atan2((double) local348, (double) local368) * 2607.5945876176133D) & 0x3FFF;
		Static403.anInt7268 = Static84.anIntArrayArrayArray2[Static398.anInt7203][local57][3] + ((Static84.anIntArrayArrayArray2[Static398.anInt7203][local57 + 2][3] - Static84.anIntArrayArrayArray2[Static398.anInt7203][local57][3]) * Static3.anInt50 >> 16);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIII)V")
	public static void method3290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static164.method5050(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static60.anIntArrayArray14[arg5];
		@Pc(45) int local45 = arg1 - local15;
		Static228.method3480(arg1 - arg0, arg2, local40, local45);
		@Pc(57) int local57 = arg1 + local15;
		Static228.method3480(local45, arg3, local40, local57);
		Static228.method3480(local57, arg2, local40, arg1 + arg0);
		while (local10 < local24) {
			local36 += 2;
			local34 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				Static218.anIntArray425[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(114) int[] local114;
			@Pc(120) int[] local120;
			@Pc(124) int local124;
			@Pc(128) int local128;
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (local27 >= 0) {
				local24--;
				if (local24 < local15) {
					local114 = Static60.anIntArrayArray14[local24 + arg5];
					local120 = Static60.anIntArrayArray14[arg5 - local24];
					local124 = Static218.anIntArray425[local24];
					local128 = local10 + arg1;
					local133 = arg1 - local10;
					local138 = arg1 + local124;
					local143 = arg1 - local124;
					Static228.method3480(local133, arg2, local114, local143);
					Static228.method3480(local143, arg3, local114, local138);
					Static228.method3480(local138, arg2, local114, local128);
					Static228.method3480(local133, arg2, local120, local143);
					Static228.method3480(local143, arg3, local120, local138);
					Static228.method3480(local138, arg2, local120, local128);
				} else {
					local114 = Static60.anIntArrayArray14[local24 + arg5];
					local120 = Static60.anIntArrayArray14[arg5 - local24];
					local124 = arg1 + local10;
					local128 = arg1 - local10;
					Static228.method3480(local128, arg2, local114, local124);
					Static228.method3480(local128, arg2, local120, local124);
				}
				local27 -= local24 << 1;
			}
			local114 = Static60.anIntArrayArray14[arg5 + local10];
			local120 = Static60.anIntArrayArray14[arg5 - local10];
			local124 = local24 + arg1;
			local128 = arg1 - local24;
			if (local10 >= local15) {
				Static228.method3480(local128, arg2, local114, local124);
				Static228.method3480(local128, arg2, local120, local124);
			} else {
				local133 = local10 > local29 ? Static218.anIntArray425[local10] : local29;
				local138 = local133 + arg1;
				local143 = arg1 - local133;
				Static228.method3480(local128, arg2, local114, local143);
				Static228.method3480(local143, arg3, local114, local138);
				Static228.method3480(local138, arg2, local114, local124);
				Static228.method3480(local128, arg2, local120, local143);
				Static228.method3480(local143, arg3, local120, local138);
				Static228.method3480(local138, arg2, local120, local124);
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
	public static boolean method3291(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)I")
	public static int method3292(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
