import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
	public static int anInt7339;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!uu;IIILclient!ya;)V")
	public static void method5661(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class19 arg3) {
		@Pc(10) Class145 local10 = arg0.method5312(arg3);
		if (local10 == null) {
			return;
		}
		arg3.OA(arg1, arg2, arg1 + arg0.anInt6833, arg0.anInt6805 + arg2);
		if (Static184.anInt3532 == 2 || Static184.anInt3532 == 5 || Static228.aClass57_11 == null) {
			arg3.ca(-16777216, local10, arg1, arg2);
			return;
		}
		@Pc(63) int local63;
		@Pc(54) int local54;
		@Pc(72) int local72;
		@Pc(60) int local60;
		if (Static111.anInt2386 == 4) {
			local60 = 4096;
			local54 = Static452.anInt7360;
			local72 = (int) -Static368.aFloat192 & 0x3FFF;
			local63 = Static428.anInt7059;
		} else {
			local54 = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892;
			local60 = 4096 - Static110.anInt2374 * 16;
			local63 = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893;
			local72 = (int) -Static368.aFloat192 + Static175.anInt3399 & 0x3FFF;
		}
		@Pc(98) int local98 = local63 / 32 + 208 + 48 - Static326.anInt5666 * 2;
		@Pc(117) int local117 = Static283.anInt5187 * 4 + 208 + 48 - Static283.anInt5187 * 2 - local54 / 32;
		Static228.aClass57_11.method5538((float) arg1 + (float) arg0.anInt6833 / 2.0F, (float) arg2 + (float) arg0.anInt6805 / 2.0F, (float) local98, (float) local117, local60, local72 << 2, local10, arg1, arg2);
		@Pc(168) int local168;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(200) int local200;
		for (@Pc(151) Class4_Sub37 local151 = (Class4_Sub37) Static181.aClass183_25.method4140(); local151 != null; local151 = (Class4_Sub37) Static181.aClass183_25.method4144()) {
			@Pc(156) int local156 = local151.anInt5426;
			local168 = (Static292.aClass195_2.anIntArray397[local156] >> 14 & 0x3FFF) - Static180.anInt3453;
			local178 = (Static292.aClass195_2.anIntArray397[local156] & 0x3FFF) - Static86.anInt1771;
			local189 = local168 * 4 + 2 - local63 / 32;
			local200 = local178 * 4 + 2 - local54 / 32;
			Static22.method294(local189, arg3, Static292.aClass195_2.anIntArray396[local156], arg0, local200, local10, arg1, arg2);
		}
		for (local168 = 0; local168 < Static180.anInt3460; local168++) {
			local178 = Static96.anIntArray156[local168] * 4 + 2 - local63 / 32;
			local189 = Static87.anIntArray146[local168] * 4 + 2 - local54 / 32;
			@Pc(257) Class202 local257 = Static267.aClass262_2.method5560(Static446.anIntArray552[local168]);
			if (local257.anIntArray407 != null) {
				local257 = local257.method4584(Static257.aClass114_1);
				if (local257 == null || local257.anInt5807 == -1) {
					continue;
				}
			}
			Static22.method294(local178, arg3, local257.anInt5807, arg0, local189, local10, arg1, arg2);
		}
		for (@Pc(293) Class4_Sub18 local293 = (Class4_Sub18) Static440.aClass102_40.method2705(); local293 != null; local293 = (Class4_Sub18) Static440.aClass102_40.method2704()) {
			local189 = (int) (local293.aLong224 >> 28 & 0x3L);
			if (Static386.anInt3967 == local189) {
				local200 = (int) (local293.aLong224 & 0x3FFFL) * 4 + 2 - local63 / 32;
				@Pc(342) int local342 = (int) (local293.aLong224 >> 14 & 0x3FFFL) * 4 + 2 - local54 / 32;
				Static442.method5585(arg1, Static126.aClass57Array7[0], arg0, local10, local342, local200, arg2);
			}
		}
		@Pc(411) int local411;
		for (local189 = 0; local189 < Static12.anInt163; local189++) {
			@Pc(370) Class16_Sub1_Sub5_Sub2 local370 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local189]];
			if (local370 != null && local370.method4762() && local370.aByte82 == Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82) {
				@Pc(384) Class264 local384 = local370.aClass264_1;
				if (local384 != null && local384.anIntArray544 != null) {
					local384 = local384.method5574(Static257.aClass114_1);
				}
				if (local384 != null && local384.aBoolean679 && local384.aBoolean682) {
					local411 = local370.anInt6893 / 32 - local63 / 32;
					@Pc(421) int local421 = local370.anInt6892 / 32 - local54 / 32;
					if (local384.anInt7239 == -1) {
						Static442.method5585(arg1, Static126.aClass57Array7[1], arg0, local10, local421, local411, arg2);
					} else {
						Static22.method294(local411, arg3, local384.anInt7239, arg0, local421, local10, arg1, arg2);
					}
				}
			}
		}
		local200 = Static33.anInt606;
		@Pc(461) int[] local461 = Static99.anIntArray157;
		@Pc(499) int local499;
		@Pc(509) int local509;
		@Pc(513) int local513;
		for (local411 = 0; local411 < local200; local411++) {
			@Pc(471) Class16_Sub1_Sub5_Sub1 local471 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local461[local411]];
			if (local471 != null && local471.method3425() && local471 != Static1.aClass16_Sub1_Sub5_Sub1_1 && Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 == local471.aByte82) {
				local499 = local471.anInt6893 / 32 - local63 / 32;
				local509 = local471.anInt6892 / 32 - local54 / 32;
				@Pc(511) boolean local511 = false;
				for (local513 = 0; local513 < Static49.anInt2346; local513++) {
					if (local471.aString44.equals(Static194.aStringArray14[local513]) && Static71.anIntArray536[local513] != 0) {
						local511 = true;
						break;
					}
				}
				@Pc(539) boolean local539 = false;
				for (@Pc(541) int local541 = 0; local541 < Static290.anInt6410; local541++) {
					if (local471.aString44.equals(Static276.aClass15Array2[local541].aString7)) {
						local539 = true;
						break;
					}
				}
				@Pc(561) boolean local561 = false;
				if (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4328 != 0 && local471.anInt4328 != 0 && local471.anInt4328 == Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4328) {
					local561 = true;
				}
				if (local471.aBoolean400) {
					Static442.method5585(arg1, Static126.aClass57Array7[6], arg0, local10, local509, local499, arg2);
				} else if (local511) {
					Static442.method5585(arg1, Static126.aClass57Array7[3], arg0, local10, local509, local499, arg2);
				} else if (local539) {
					Static442.method5585(arg1, Static126.aClass57Array7[5], arg0, local10, local509, local499, arg2);
				} else if (local561) {
					Static442.method5585(arg1, Static126.aClass57Array7[4], arg0, local10, local509, local499, arg2);
				} else {
					Static442.method5585(arg1, Static126.aClass57Array7[2], arg0, local10, local509, local499, arg2);
				}
			}
		}
		@Pc(658) Class38[] local658 = Static306.aClass38Array1;
		@Pc(754) int local754;
		for (local499 = 0; local499 < local658.length; local499++) {
			@Pc(666) Class38 local666 = local658[local499];
			if (local666 != null && local666.anInt891 != 0 && Static24.anInt5323 % 20 < 10) {
				@Pc(727) int local727;
				if (local666.anInt891 == 1 && local666.anInt885 >= 0 && Static143.aClass16_Sub1_Sub5_Sub2Array1.length > local666.anInt885) {
					@Pc(705) Class16_Sub1_Sub5_Sub2 local705 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local666.anInt885];
					if (local705 != null) {
						local513 = local705.anInt6893 / 32 - local63 / 32;
						local727 = local705.anInt6892 / 32 - local54 / 32;
						Static409.method5484(arg0, local10, local513, arg1, local666.anInt886, arg2, local727, 360000L);
					}
				}
				if (local666.anInt891 == 2) {
					local754 = local666.anInt892 / 32 - local63 / 32;
					local513 = local666.anInt894 / 32 - local54 / 32;
					@Pc(769) long local769 = (long) (local666.anInt889 << 5);
					@Pc(773) long local773 = local769 * local769;
					Static409.method5484(arg0, local10, local754, arg1, local666.anInt886, arg2, local513, local773);
				}
				if (local666.anInt891 == 10 && local666.anInt885 >= 0 && Static267.aClass16_Sub1_Sub5_Sub1Array1.length > local666.anInt885) {
					@Pc(803) Class16_Sub1_Sub5_Sub1 local803 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local666.anInt885];
					if (local803 != null) {
						local513 = local803.anInt6893 / 32 - local63 / 32;
						local727 = local803.anInt6892 / 32 - local54 / 32;
						Static409.method5484(arg0, local10, local513, arg1, local666.anInt886, arg2, local727, 360000L);
					}
				}
			}
		}
		if (Static111.anInt2386 == 4) {
			return;
		}
		if (Static343.anInt771 != 0) {
			local509 = Static343.anInt771 * 4 + Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() * 2 + 2 - local63 / 32 - 2;
			local754 = Static60.anInt1094 * 4 + (Static1.aClass16_Sub1_Sub5_Sub1_1.method4751() + -1) * 2 + 2 - local54 / 32;
			Static442.method5585(arg1, Static333.aClass57Array12[Static350.aBoolean556 ? 1 : 0], arg0, local10, local754, local509, arg2);
		}
		arg3.method4293(arg1 + arg0.anInt6833 / 2 - 1, 3, arg0.anInt6805 / 2 + arg2 - 1, -1, 3);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)I")
	public static int method5662(@OriginalArg(0) int arg0) {
		@Pc(19) int local19 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(25) int local25 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local25 * arg0 >> 12) + 40960;
		return local33 * local19 >> 12;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIII)V")
	public static void method5663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = arg2 + 1;
		Static251.method3640(arg4, arg3, arg1, Static96.anIntArrayArray21[arg2]);
		@Pc(21) int local21 = arg0 - 1;
		Static251.method3640(arg4, arg3, arg1, Static96.anIntArrayArray21[arg0]);
		for (@Pc(33) int local33 = local8; local33 <= local21; local33++) {
			@Pc(39) int[] local39 = Static96.anIntArrayArray21[local33];
			local39[arg4] = local39[arg1] = arg3;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)I")
	public static int method5664() {
		if (Static320.aFrame3 == null) {
			return Static41.aBoolean76 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
