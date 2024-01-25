import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILclient!mea;ILclient!ha;I)V")
	public static void method6920(@OriginalArg(0) int arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class137 arg3) {
		@Pc(10) Class1 local10 = arg1.method5457(arg3);
		if (local10 == null) {
			return;
		}
		arg3.KA(arg2, arg0, arg1.anInt6703 + arg2, arg0 + arg1.anInt6701);
		if (Static51.anInt1226 == 2 || Static51.anInt1226 == 5 || Static659.aClass20_37 == null) {
			arg3.A(-16777216, local10, arg2, arg0);
			return;
		}
		@Pc(69) int local69;
		@Pc(51) int local51;
		@Pc(66) int local66;
		@Pc(58) int local58;
		if (Static378.anInt6935 == 4) {
			local66 = (int) -Static543.aFloat228 & 0x3FFF;
			local58 = 4096;
			local51 = Static620.anInt10427;
			local69 = Static322.anInt6116;
		} else {
			local51 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002;
			local58 = 4096 - Static422.anInt7593 * 16;
			local66 = Static470.anInt10171 + (int) -Static543.aFloat228 & 0x3FFF;
			local69 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998;
		}
		@Pc(97) int local97 = local69 / 128 + 48 - (Static26.anInt462 - 104) * 2;
		@Pc(114) int local114 = Static445.anInt6140 * 4 + 48 + 208 - local51 / 128 - Static445.anInt6140 * 2;
		Static659.aClass20_37.method7415((float) arg2 + (float) arg1.anInt6703 / 2.0F, (float) arg1.anInt6701 / 2.0F + (float) arg0, (float) local97, (float) local114, local58, local66 << 2, local10, arg2, arg0);
		@Pc(165) int local165;
		@Pc(175) int local175;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(148) Class14_Sub18 local148 = (Class14_Sub18) Static456.aClass262_46.method6318(); local148 != null; local148 = (Class14_Sub18) Static456.aClass262_46.method6311()) {
			@Pc(153) int local153 = local148.anInt2644;
			local165 = (Static628.aClass294_3.anIntArray654[local153] >> 14 & 0x3FFF) - Static329.anInt6225;
			local175 = (Static628.aClass294_3.anIntArray654[local153] & 0x3FFF) - Static202.anInt3755;
			local185 = local165 * 4 + 2 - local69 / 128;
			local196 = local175 * 4 + 2 - local51 / 128;
			Static419.method6216(arg2, local10, arg0, local185, local196, Static628.aClass294_3.anIntArray655[local153], arg1, arg3);
		}
		for (local165 = 0; local165 < Static547.anInt9326; local165++) {
			local175 = Static609.anIntArray750[local165] * 4 + 2 - local69 / 128;
			local185 = Static673.anIntArray824[local165] * 4 + 2 - local51 / 128;
			@Pc(253) Class203 local253 = Static511.aClass13_2.method86(Static222.anIntArray328[local165]);
			if (local253.anIntArray440 != null) {
				local253 = local253.method5007(Static595.aClass241_1);
				if (local253 == null || local253.anInt6009 == -1) {
					continue;
				}
			}
			Static419.method6216(arg2, local10, arg0, local175, local185, local253.anInt6009, arg1, arg3);
		}
		@Pc(333) int local333;
		@Pc(344) int local344;
		for (@Pc(289) Class14_Sub42 local289 = (Class14_Sub42) Static568.aClass187_71.method4079(); local289 != null; local289 = (Class14_Sub42) Static568.aClass187_71.method4084()) {
			local185 = (int) (local289.aLong305 >> 28 & 0x3L);
			if (Static340.anInt9129 == local185) {
				local196 = (int) (local289.aLong305 & 0x3FFFL) - Static329.anInt6225;
				@Pc(322) int local322 = (int) (local289.aLong305 >> 14 & 0x3FFFL) - Static202.anInt3755;
				local333 = local196 * 4 + 2 - local69 / 128;
				local344 = local322 * 4 + 2 - local51 / 128;
				Static236.method3562(arg2, arg1, local333, Static246.aClass20Array6[0], local10, local344, arg0);
			}
		}
		@Pc(434) int local434;
		for (local185 = 0; local185 < Static471.anInt8216; local185++) {
			@Pc(377) Class14_Sub44 local377 = (Class14_Sub44) Static579.aClass187_73.method4078((long) Static530.anIntArray671[local185]);
			if (local377 != null) {
				@Pc(382) Class12_Sub2_Sub2_Sub1_Sub1 local382 = local377.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				if (local382.method615() && Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146 == local382.aByte146) {
					@Pc(394) Class283 local394 = local382.aClass283_1;
					if (local394 != null && local394.anIntArray638 != null) {
						local394 = local394.method7129(Static595.aClass241_1);
					}
					if (local394 != null && local394.aBoolean617 && local394.aBoolean618) {
						local344 = local382.anInt10998 / 128 - local69 / 128;
						local434 = local382.anInt11002 / 128 - local51 / 128;
						if (local394.anInt8609 == -1) {
							Static236.method3562(arg2, arg1, local344, Static246.aClass20Array6[1], local10, local434, arg0);
						} else {
							Static419.method6216(arg2, local10, arg0, local344, local434, local394.anInt8609, arg1, arg3);
						}
					}
				}
			}
		}
		local196 = Static209.anInt3954;
		@Pc(475) int[] local475 = Static457.anIntArray607;
		@Pc(523) int local523;
		@Pc(527) int local527;
		@Pc(556) int local556;
		for (local333 = 0; local333 < local196; local333++) {
			@Pc(485) Class12_Sub2_Sub2_Sub1_Sub2 local485 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local475[local333]];
			if (local485 != null && local485.method2438() && !local485.aBoolean230 && local485 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 && local485.aByte146 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146) {
				local434 = local485.anInt10998 / 128 - local69 / 128;
				local523 = local485.anInt11002 / 128 - local51 / 128;
				@Pc(525) boolean local525 = false;
				for (local527 = 0; local527 < Static592.anInt1870; local527++) {
					if (local485.aString35.equals(Static369.aStringArray24[local527]) && Static620.anIntArray765[local527] != 0) {
						local525 = true;
						break;
					}
				}
				@Pc(554) boolean local554 = false;
				for (local556 = 0; local556 < Static3.anInt23; local556++) {
					if (local485.aString35.equals(Static678.aClass111Array1[local556].aString39)) {
						local554 = true;
						break;
					}
				}
				@Pc(580) boolean local580 = false;
				if (Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2982 != 0 && local485.anInt2982 != 0 && local485.anInt2982 == Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt2982) {
					local580 = true;
				}
				if (local485.aBoolean229) {
					Static236.method3562(arg2, arg1, local434, Static246.aClass20Array6[6], local10, local523, arg0);
				} else if (local580) {
					Static236.method3562(arg2, arg1, local434, Static246.aClass20Array6[4], local10, local523, arg0);
				} else if (local485.aBoolean231) {
					Static236.method3562(arg2, arg1, local434, Static246.aClass20Array6[7], local10, local523, arg0);
				} else if (local525) {
					Static236.method3562(arg2, arg1, local434, Static246.aClass20Array6[3], local10, local523, arg0);
				} else if (local554) {
					Static236.method3562(arg2, arg1, local434, Static246.aClass20Array6[5], local10, local523, arg0);
				} else {
					Static236.method3562(arg2, arg1, local434, Static246.aClass20Array6[2], local10, local523, arg0);
				}
			}
		}
		@Pc(701) Class390[] local701 = Static590.aClass390Array1;
		@Pc(790) int local790;
		for (local434 = 0; local434 < local701.length; local434++) {
			@Pc(709) Class390 local709 = local701[local434];
			if (local709 != null && local709.anInt11100 != 0 && Static87.anInt1951 % 20 < 10) {
				@Pc(753) int local753;
				if (local709.anInt11100 == 1) {
					@Pc(738) Class14_Sub44 local738 = (Class14_Sub44) Static579.aClass187_73.method4078((long) local709.anInt11103);
					if (local738 != null) {
						@Pc(743) Class12_Sub2_Sub2_Sub1_Sub1 local743 = local738.aClass12_Sub2_Sub2_Sub1_Sub1_2;
						local753 = local743.anInt10998 / 128 - local69 / 128;
						local556 = local743.anInt11002 / 128 - local51 / 128;
						Static22.method344(local556, local10, local709.anInt11098, local753, arg1, arg2, arg0, 360000L);
					}
				}
				if (local709.anInt11100 == 2) {
					local790 = local709.anInt11107 / 128 - local69 / 128;
					local527 = local709.anInt11105 / 128 - local51 / 128;
					@Pc(806) long local806 = (long) (local709.anInt11099 << 7);
					@Pc(810) long local810 = local806 * local806;
					Static22.method344(local527, local10, local709.anInt11098, local790, arg1, arg2, arg0, local810);
				}
				if (local709.anInt11100 == 10 && local709.anInt11103 >= 0 && Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1.length > local709.anInt11103) {
					@Pc(847) Class12_Sub2_Sub2_Sub1_Sub2 local847 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local709.anInt11103];
					if (local847 != null) {
						local527 = local847.anInt10998 / 128 - local69 / 128;
						local753 = local847.anInt11002 / 128 - local51 / 128;
						Static22.method344(local753, local10, local709.anInt11098, local527, arg1, arg2, arg0, 360000L);
					}
				}
			}
		}
		if (Static378.anInt6935 == 4) {
			return;
		}
		if (Static659.anInt10975 != 0) {
			local523 = Static659.anInt10975 * 4 + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() * 2 + 2 - local69 / 128 - 2;
			local790 = Static35.anInt964 * 4 + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() * 2 + 2 - local51 / 128 - 2;
			Static236.method3562(arg2, arg1, local523, Static35.aClass20Array1[Static378.aBoolean496 ? 1 : 0], local10, local790, arg0);
		}
		if (!Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aBoolean230) {
			arg3.method7869(arg2 + arg1.anInt6703 / 2 - 1, 3, -1, arg0 + arg1.anInt6701 / 2 - 1, 3);
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBII)I")
	public static int method6922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		@Pc(30) int local30 = 255 - arg0;
		return (((arg2 & 0xFF00FF) * local30 & 0xFF00FF00 | (arg2 & 0xFF00) * local30 & 0xFF0000) >>> 8) + local21;
	}
}
