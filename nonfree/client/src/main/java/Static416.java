import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public static void method5813() {
		for (@Pc(7) int local7 = 0; local7 < Static428.aByteArrayArrayArray4.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static428.aByteArrayArrayArray4[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static428.aByteArrayArrayArray4[0][0].length; local15++) {
					Static428.aByteArrayArrayArray4[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!r;IILclient!pca;I)V")
	public static void method5814(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class251 arg3) {
		@Pc(17) Class53 local17 = arg3.method5693(arg0);
		if (local17 == null) {
			return;
		}
		arg0.da(arg2, arg1, arg2 + arg3.anInt7285, arg1 - -arg3.anInt7215);
		if (Static298.anInt5561 == 2 || Static298.anInt5561 == 5 || Static544.aClass73_39 == null) {
			arg0.FA(-16777216, local17, arg2, arg1);
			return;
		}
		@Pc(67) int local67;
		@Pc(64) int local64;
		@Pc(61) int local61;
		@Pc(53) int local53;
		if (Static188.anInt4080 == 4) {
			local67 = Static357.anInt6340;
			local53 = 4096;
			local61 = (int) -Static209.aFloat229 & 0x3FFF;
			local64 = Static372.anInt6492;
		} else {
			local53 = 4096 - Static350.anInt6241 * 16;
			local61 = Static270.anInt5118 + (int) -Static209.aFloat229 & 0x3FFF;
			local64 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482;
			local67 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
		}
		@Pc(93) int local93 = local67 / 128 + 208 + 48 - Static345.anInt6228 * 2;
		@Pc(110) int local110 = Static535.anInt9341 * 4 + 48 - local64 / 128 - (Static535.anInt9341 + -104) * 2;
		Static544.aClass73_39.method7954((float) arg3.anInt7285 / 2.0F + (float) arg2, (float) arg1 + (float) arg3.anInt7215 / 2.0F, (float) local93, (float) local110, local53, local61 << 2, local17, arg2, arg1);
		@Pc(160) int local160;
		@Pc(170) int local170;
		@Pc(181) int local181;
		@Pc(192) int local192;
		for (@Pc(144) Class3_Sub2 local144 = (Class3_Sub2) Static437.aClass244_57.method5572(); local144 != null; local144 = (Class3_Sub2) Static437.aClass244_57.method5576()) {
			@Pc(149) int local149 = local144.anInt39;
			local160 = (Static425.aClass57_3.anIntArray61[local149] >> 14 & 0x3FFF) - Static321.anInt5874;
			local170 = (Static425.aClass57_3.anIntArray61[local149] & 0x3FFF) - Static137.anInt3293;
			local181 = local160 * 4 + 2 - local67 / 128;
			local192 = local170 * 4 + 2 - local64 / 128;
			Static111.method2256(local181, arg1, local17, local192, arg3, arg2, Static425.aClass57_3.anIntArray60[local149], arg0);
		}
		for (local160 = 0; local160 < Static544.anInt9502; local160++) {
			local170 = Static500.anIntArray517[local160] * 4 + 2 - local67 / 128;
			local181 = Static355.anIntArray350[local160] * 4 + 2 - local64 / 128;
			@Pc(250) Class194 local250 = Static536.aClass146_4.method3721(Static180.anIntArray161[local160]);
			if (local250.anIntArray286 != null) {
				local250 = local250.method4696(Static206.aClass143_3);
				if (local250 == null || local250.anInt5842 == -1) {
					continue;
				}
			}
			Static111.method2256(local170, arg1, local17, local181, arg3, arg2, local250.anInt5842, arg0);
		}
		@Pc(334) int local334;
		@Pc(344) int local344;
		for (@Pc(288) Class3_Sub4 local288 = (Class3_Sub4) Static537.aClass297_34.method6529(); local288 != null; local288 = (Class3_Sub4) Static537.aClass297_34.method6532()) {
			local181 = (int) (local288.aLong262 >> 28 & 0x3L);
			if (Static249.anInt8899 == local181) {
				local192 = (int) (local288.aLong262 & 0x3FFFL) - Static321.anInt5874;
				@Pc(324) int local324 = (int) (local288.aLong262 >> 14 & 0x3FFFL) - Static137.anInt3293;
				local334 = local192 * 4 + 2 - local67 / 128;
				local344 = local324 * 4 + 2 - local64 / 128;
				Static297.method6895(local17, local334, arg2, arg1, arg3, local344, Static463.aClass73Array13[0]);
			}
		}
		@Pc(430) int local430;
		for (local181 = 0; local181 < Static60.anInt1599; local181++) {
			@Pc(375) Class3_Sub39 local375 = (Class3_Sub39) Static581.aClass297_39.method6531((long) Static529.anIntArray535[local181]);
			if (local375 != null) {
				@Pc(380) Class25_Sub2_Sub2_Sub5_Sub2 local380 = local375.aClass25_Sub2_Sub2_Sub5_Sub2_2;
				if (local380.method6694() && local380.aByte117 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117) {
					@Pc(392) Class213 local392 = local380.aClass213_1;
					if (local392 != null && local392.anIntArray345 != null) {
						local392 = local392.method4998(Static206.aClass143_3);
					}
					if (local392 != null && local392.aBoolean440 && local392.aBoolean443) {
						local344 = local380.anInt8476 / 128 - local67 / 128;
						local430 = local380.anInt8482 / 128 - local64 / 128;
						if (local392.anInt6195 == -1) {
							Static297.method6895(local17, local344, arg2, arg1, arg3, local430, Static463.aClass73Array13[1]);
						} else {
							Static111.method2256(local344, arg1, local17, local430, arg3, arg2, local392.anInt6195, arg0);
						}
					}
				}
			}
		}
		local192 = Static31.anInt499;
		@Pc(470) int[] local470 = Static315.anIntArray279;
		@Pc(515) int local515;
		@Pc(519) int local519;
		@Pc(548) int local548;
		for (local334 = 0; local334 < local192; local334++) {
			@Pc(480) Class25_Sub2_Sub2_Sub5_Sub1 local480 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local470[local334]];
			if (local480 != null && local480.method5671() && !local480.aBoolean495 && local480 != Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 && local480.aByte117 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aByte117) {
				local430 = local480.anInt8476 / 128 - local67 / 128;
				local515 = local480.anInt8482 / 128 - local64 / 128;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static372.anInt6493; local519++) {
					if (local480.aString183.equals(Static437.aStringArray36[local519]) && Static383.anIntArray374[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(546) boolean local546 = false;
				for (local548 = 0; local548 < Static260.anInt5022; local548++) {
					if (local480.aString183.equals(Static131.aClass74Array1[local548].aString58)) {
						local546 = true;
						break;
					}
				}
				@Pc(568) boolean local568 = false;
				if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7145 != 0 && local480.anInt7145 != 0 && local480.anInt7145 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt7145) {
					local568 = true;
				}
				if (local480.aBoolean494) {
					Static297.method6895(local17, local430, arg2, arg1, arg3, local515, Static463.aClass73Array13[6]);
				} else if (local517) {
					Static297.method6895(local17, local430, arg2, arg1, arg3, local515, Static463.aClass73Array13[3]);
				} else if (local546) {
					Static297.method6895(local17, local430, arg2, arg1, arg3, local515, Static463.aClass73Array13[5]);
				} else if (local568) {
					Static297.method6895(local17, local430, arg2, arg1, arg3, local515, Static463.aClass73Array13[4]);
				} else {
					Static297.method6895(local17, local430, arg2, arg1, arg3, local515, Static463.aClass73Array13[2]);
				}
			}
		}
		@Pc(669) Class167[] local669 = Static98.aClass167Array1;
		@Pc(749) int local749;
		for (local430 = 0; local430 < local669.length; local430++) {
			@Pc(677) Class167 local677 = local669[local430];
			if (local677 != null && local677.anInt5096 != 0 && Static397.anInt6998 % 20 < 10) {
				@Pc(714) int local714;
				if (local677.anInt5096 == 1) {
					@Pc(699) Class3_Sub39 local699 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local677.anInt5098);
					if (local699 != null) {
						@Pc(704) Class25_Sub2_Sub2_Sub5_Sub2 local704 = local699.aClass25_Sub2_Sub2_Sub5_Sub2_2;
						local714 = local704.anInt8476 / 128 - local67 / 128;
						local548 = local704.anInt8482 / 128 - local64 / 128;
						Static3.method43(360000L, arg3, local548, arg1, arg2, local714, local677.anInt5094, local17);
					}
				}
				if (local677.anInt5096 == 2) {
					local749 = local677.anInt5104 / 128 - local67 / 128;
					local519 = local677.anInt5101 / 128 - local64 / 128;
					@Pc(765) long local765 = (long) (local677.anInt5097 << 7);
					@Pc(769) long local769 = local765 * local765;
					Static3.method43(local769, arg3, local519, arg1, arg2, local749, local677.anInt5094, local17);
				}
				if (local677.anInt5096 == 10 && local677.anInt5098 >= 0 && local677.anInt5098 < Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1.length) {
					@Pc(806) Class25_Sub2_Sub2_Sub5_Sub1 local806 = Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local677.anInt5098];
					if (local806 != null) {
						local519 = local806.anInt8476 / 128 - local67 / 128;
						local714 = local806.anInt8482 / 128 - local64 / 128;
						Static3.method43(360000L, arg3, local714, arg1, arg2, local519, local677.anInt5094, local17);
					}
				}
			}
		}
		if (Static188.anInt4080 == 4) {
			return;
		}
		if (Static349.anInt6239 != 0) {
			local515 = Static349.anInt6239 * 4 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() * 2 + 2 - local67 / 128 - 2;
			local749 = Static262.anInt5041 * 4 + Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.method6668() * 2 + 2 - local64 / 128 - 2;
			Static297.method6895(local17, local515, arg2, arg1, arg3, local749, Static340.aClass73Array9[Static46.aBoolean102 ? 1 : 0]);
		}
		if (!Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aBoolean495) {
			arg0.method8094(arg1 + arg3.anInt7215 / 2 - 1, arg2 + -1 - -(arg3.anInt7285 / 2), 3, 3, -1);
			return;
		}
	}
}
