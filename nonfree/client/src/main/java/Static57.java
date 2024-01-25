import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
	public static int anInt1513 = 0;

	@OriginalMember(owner = "client!cca", name = "V", descriptor = "[I")
	public static final int[] anIntArray57 = new int[] { 7500, 500 };

	@OriginalMember(owner = "client!cca", name = "X", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!is;IILclient!r;I)V")
	public static void method1328(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(4) int arg3) {
		@Pc(15) Class67 local15 = arg0.method3701(arg2);
		if (local15 == null) {
			return;
		}
		arg2.da(arg1, arg3, arg0.anInt4806 + arg1, arg0.anInt4831 + arg3);
		if (Static291.anInt5976 == 2 || Static291.anInt5976 == 5 || Static441.aClass88_29 == null) {
			arg2.FA(-16777216, local15, arg1, arg3);
			return;
		}
		@Pc(63) int local63;
		@Pc(46) int local46;
		@Pc(60) int local60;
		@Pc(52) int local52;
		if (Static300.anInt6053 == 4) {
			local60 = (int) -Static189.aFloat83 & 0x3FFF;
			local52 = 4096;
			local46 = Static27.anInt4151;
			local63 = Static277.anInt5777;
		} else {
			local46 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
			local52 = 4096 - Static273.anInt5737 * 16;
			local60 = Static136.anInt3033 + (int) -Static189.aFloat83 & 0x3FFF;
			local63 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
		}
		@Pc(91) int local91 = local63 / 128 + 48 - (Static338.anInt6508 - 104) * 2;
		@Pc(109) int local109 = Static390.anInt7654 * 4 + 48 - (Static390.anInt7654 - 104) * 2 - local46 / 128;
		Static441.aClass88_29.method8052((float) arg1 + (float) arg0.anInt4806 / 2.0F, (float) arg3 + (float) arg0.anInt4831 / 2.0F, (float) local91, (float) local109, local52, local60 << 2, local15, arg1, arg3);
		@Pc(161) int local161;
		@Pc(171) int local171;
		@Pc(182) int local182;
		@Pc(192) int local192;
		for (@Pc(145) Class4_Sub27 local145 = (Class4_Sub27) Static122.aClass22_18.method895(); local145 != null; local145 = (Class4_Sub27) Static122.aClass22_18.method889()) {
			@Pc(150) int local150 = local145.anInt4968;
			local161 = (Static11.aClass42_1.anIntArray37[local150] >> 14 & 0x3FFF) - Static242.anInt10133;
			local171 = (Static11.aClass42_1.anIntArray37[local150] & 0x3FFF) - Static157.anInt3323;
			local182 = local161 * 4 + 2 - local63 / 128;
			local192 = local171 * 4 + 2 - local46 / 128;
			Static222.method3618(local182, arg1, local192, local15, arg2, arg0, Static11.aClass42_1.anIntArray36[local150], arg3);
		}
		for (local161 = 0; local161 < Static415.anInt5970; local161++) {
			local171 = Static214.anIntArray221[local161] * 4 + 2 - local63 / 128;
			local182 = Static221.anIntArray27[local161] * 4 + 2 - local46 / 128;
			@Pc(248) Class233 local248 = Static103.aClass298_1.method6822(Static438.anIntArray488[local161]);
			if (local248.anIntArray374 != null) {
				local248 = local248.method5295(Static523.aClass173_1);
				if (local248 == null || local248.anInt6674 == -1) {
					continue;
				}
			}
			Static222.method3618(local171, arg1, local182, local15, arg2, arg0, local248.anInt6674, arg3);
		}
		@Pc(333) int local333;
		@Pc(344) int local344;
		for (@Pc(286) Class4_Sub32 local286 = (Class4_Sub32) Static17.aClass221_1.method5072(); local286 != null; local286 = (Class4_Sub32) Static17.aClass221_1.method5071()) {
			local182 = (int) (local286.aLong295 >> 28 & 0x3L);
			if (local182 == Static433.anInt8342) {
				local192 = (int) (local286.aLong295 & 0x3FFFL) - Static242.anInt10133;
				@Pc(322) int local322 = (int) (local286.aLong295 >> 14 & 0x3FFFL) - Static157.anInt3323;
				local333 = local192 * 4 + 2 - local63 / 128;
				local344 = local322 * 4 + 2 - local46 / 128;
				Static327.method6515(local333, arg1, arg0, Static478.aClass88Array12[0], local344, local15, arg3);
			}
		}
		@Pc(437) int local437;
		for (local182 = 0; local182 < Static137.anInt3042; local182++) {
			@Pc(379) Class4_Sub29 local379 = (Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local182]);
			if (local379 != null) {
				@Pc(384) Class21_Sub1_Sub1_Sub1_Sub1 local384 = local379.aClass21_Sub1_Sub1_Sub1_Sub1_1;
				if (local384.method1709() && local384.aByte127 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) {
					@Pc(400) Class51 local400 = local384.aClass51_1;
					if (local400 != null && local400.anIntArray61 != null) {
						local400 = local400.method1371(Static523.aClass173_1);
					}
					if (local400 != null && local400.aBoolean130 && local400.aBoolean131) {
						local344 = local384.anInt10551 / 128 - local63 / 128;
						local437 = local384.anInt10550 / 128 - local46 / 128;
						if (local400.anInt1594 == -1) {
							Static327.method6515(local344, arg1, arg0, Static478.aClass88Array12[1], local437, local15, arg3);
						} else {
							Static222.method3618(local344, arg1, local437, local15, arg2, arg0, local400.anInt1594, arg3);
						}
					}
				}
			}
		}
		local192 = anInt1513;
		@Pc(478) int[] local478 = Static447.anIntArray571;
		@Pc(528) int local528;
		@Pc(532) int local532;
		@Pc(560) int local560;
		for (local333 = 0; local333 < local192; local333++) {
			@Pc(488) Class21_Sub1_Sub1_Sub1_Sub2 local488 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local478[local333]];
			if (local488 != null && local488.method3347() && !local488.aBoolean299 && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 != local488 && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 == local488.aByte127) {
				local437 = local488.anInt10551 / 128 - local63 / 128;
				local528 = local488.anInt10550 / 128 - local46 / 128;
				@Pc(530) boolean local530 = false;
				for (local532 = 0; local532 < Static270.anInt5671; local532++) {
					if (local488.aString87.equals(Static94.aStringArray7[local532]) && Static184.anIntArray182[local532] != 0) {
						local530 = true;
						break;
					}
				}
				@Pc(558) boolean local558 = false;
				for (local560 = 0; local560 < Static341.anInt6580; local560++) {
					if (local488.aString87.equals(Static523.aClass210Array1[local560].aString127)) {
						local558 = true;
						break;
					}
				}
				@Pc(580) boolean local580 = false;
				if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4292 != 0 && local488.anInt4292 != 0 && local488.anInt4292 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt4292) {
					local580 = true;
				}
				if (local488.aBoolean302) {
					Static327.method6515(local437, arg1, arg0, Static478.aClass88Array12[6], local528, local15, arg3);
				} else if (local530) {
					Static327.method6515(local437, arg1, arg0, Static478.aClass88Array12[3], local528, local15, arg3);
				} else if (local558) {
					Static327.method6515(local437, arg1, arg0, Static478.aClass88Array12[5], local528, local15, arg3);
				} else if (local580) {
					Static327.method6515(local437, arg1, arg0, Static478.aClass88Array12[4], local528, local15, arg3);
				} else {
					Static327.method6515(local437, arg1, arg0, Static478.aClass88Array12[2], local528, local15, arg3);
				}
			}
		}
		@Pc(680) Class292[] local680 = Static553.aClass292Array1;
		@Pc(760) int local760;
		for (local437 = 0; local437 < local680.length; local437++) {
			@Pc(688) Class292 local688 = local680[local437];
			if (local688 != null && local688.anInt8837 != 0 && Static306.anInt6122 % 20 < 10) {
				@Pc(725) int local725;
				if (local688.anInt8837 == 1) {
					@Pc(710) Class4_Sub29 local710 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local688.anInt8834);
					if (local710 != null) {
						@Pc(715) Class21_Sub1_Sub1_Sub1_Sub1 local715 = local710.aClass21_Sub1_Sub1_Sub1_Sub1_1;
						local725 = local715.anInt10551 / 128 - local63 / 128;
						local560 = local715.anInt10550 / 128 - local46 / 128;
						Static8.method671(local725, local688.anInt8830, arg1, local560, 360000L, arg0, local15, arg3);
					}
				}
				if (local688.anInt8837 == 2) {
					local760 = local688.anInt8828 / 128 - local63 / 128;
					local532 = local688.anInt8833 / 128 - local46 / 128;
					@Pc(775) long local775 = (long) (local688.anInt8835 << 7);
					@Pc(779) long local779 = local775 * local775;
					Static8.method671(local760, local688.anInt8830, arg1, local532, local779, arg0, local15, arg3);
				}
				if (local688.anInt8837 == 10 && local688.anInt8834 >= 0 && Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1.length > local688.anInt8834) {
					@Pc(809) Class21_Sub1_Sub1_Sub1_Sub2 local809 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local688.anInt8834];
					if (local809 != null) {
						local532 = local809.anInt10551 / 128 - local63 / 128;
						local725 = local809.anInt10550 / 128 - local46 / 128;
						Static8.method671(local532, local688.anInt8830, arg1, local725, 360000L, arg0, local15, arg3);
					}
				}
			}
		}
		if (Static300.anInt6053 == 4) {
			return;
		}
		if (Static384.anInt7552 != 0) {
			local528 = Static384.anInt7552 * 4 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() * 2 + 2 - local63 / 128 - 2;
			local760 = Static226.anInt4729 * 4 + Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() * 2 + 2 - local46 / 128 - 2;
			Static327.method6515(local528, arg1, arg0, Static334.aClass88Array7[Static401.aBoolean564 ? 1 : 0], local760, local15, arg3);
		}
		if (!Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aBoolean299) {
			arg2.method7825(3, 3, arg3 + arg0.anInt4831 / 2 - 1, -1, arg1 + arg0.anInt4806 / 2 - 1);
			return;
		}
	}
}
