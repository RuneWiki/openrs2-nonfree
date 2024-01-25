import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "Lclient!d;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "F")
	public static float aFloat113 = 1024.0F;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3409(@OriginalArg(1) String arg0) {
		Static220.aString35 = arg0;
		Static335.anInt8972 = Static220.aString35.length();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!mj;IIILclient!ha;)V")
	public static void method3411(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class100 arg3) {
		@Pc(12) Class1 local12 = arg0.method5323(arg3);
		if (local12 == null) {
			return;
		}
		arg3.KA(arg1, arg2, arg1 + arg0.anInt5985, arg0.anInt5973 + arg2);
		if (Static215.anInt3739 == 2 || Static215.anInt3739 == 5 || Static352.aClass155_16 == null) {
			arg3.A(-16777216, local12, arg1, arg2);
			return;
		}
		@Pc(70) int local70;
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(77) int local77;
		if (Static426.anInt7111 == 4) {
			local67 = (int) -Static243.aFloat117 & 0x3FFF;
			local77 = 4096;
			local70 = Static488.anInt7900;
			local58 = Static334.anInt9969;
		} else {
			local58 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803;
			local67 = (int) -Static243.aFloat117 + Static271.anInt4907 & 0x3FFF;
			local70 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805;
			local77 = 4096 - Static283.anInt5029 * 16;
		}
		@Pc(103) int local103 = local70 / 128 + 208 + 48 - Static271.anInt4910 * 2;
		@Pc(122) int local122 = Static613.anInt9909 * 4 + 48 - (Static613.anInt9909 - 104) * 2 - local58 / 128;
		Static352.aClass155_16.method7193((float) arg0.anInt5985 / 2.0F + (float) arg1, (float) arg0.anInt5973 / 2.0F + (float) arg2, (float) local103, (float) local122, local77, local67 << 2, local12, arg1, arg2);
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(195) int local195;
		@Pc(206) int local206;
		for (@Pc(158) Class5_Sub43 local158 = (Class5_Sub43) Static594.aClass20_62.method378(); local158 != null; local158 = (Class5_Sub43) Static594.aClass20_62.method366()) {
			@Pc(165) int local165 = local158.anInt6989;
			local176 = (Static311.aClass396_3.anIntArray622[local165] >> 14 & 0x3FFF) - Static315.anInt5380;
			local185 = (Static311.aClass396_3.anIntArray622[local165] & 0x3FFF) - Static290.anInt5128;
			local195 = local176 * 4 + 2 - local70 / 128;
			local206 = local185 * 4 + 2 - local58 / 128;
			Static425.method6181(arg0, arg1, local195, arg2, arg3, local206, Static311.aClass396_3.anIntArray621[local165], local12);
		}
		for (local176 = 0; local176 < Static220.anInt3840; local176++) {
			local185 = Static526.anIntArray479[local176] * 4 + 2 - local70 / 128;
			local195 = Static88.anIntArray76[local176] * 4 + 2 - local58 / 128;
			@Pc(269) Class354 local269 = Static528.aClass243_3.method5556(Static363.anIntArray344[local176]);
			if (local269.anIntArray526 != null) {
				local269 = local269.method8024(Static23.aClass247_1);
				if (local269 == null || local269.anInt9396 == -1) {
					continue;
				}
			}
			Static425.method6181(arg0, arg1, local185, arg2, arg3, local195, local269.anInt9396, local12);
		}
		@Pc(355) int local355;
		@Pc(365) int local365;
		for (@Pc(312) Class5_Sub53 local312 = (Class5_Sub53) Static248.aClass306_18.method6941(); local312 != null; local312 = (Class5_Sub53) Static248.aClass306_18.method6940()) {
			local195 = (int) (local312.aLong312 >> 28 & 0x3L);
			if (Static319.anInt5446 == local195) {
				local206 = (int) (local312.aLong312 & 0x3FFFL) - Static315.anInt5380;
				@Pc(345) int local345 = (int) (local312.aLong312 >> 14 & 0x3FFFL) - Static290.anInt5128;
				local355 = local206 * 4 + 2 - local70 / 128;
				local365 = local345 * 4 + 2 - local58 / 128;
				Static301.method4698(Static99.aClass155Array4[0], local365, arg1, arg2, local12, arg0, local355);
			}
		}
		@Pc(466) int local466;
		for (local195 = 0; local195 < Static438.anInt7239; local195++) {
			@Pc(398) Class5_Sub9 local398 = (Class5_Sub9) Static677.aClass306_37.method6943((long) Static558.anIntArray500[local195]);
			if (local398 != null) {
				@Pc(403) Class4_Sub1_Sub1_Sub2_Sub2 local403 = local398.aClass4_Sub1_Sub1_Sub2_Sub2_1;
				if (local403.method5942() && local403.aByte139 == Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139) {
					@Pc(421) Class105 local421 = local403.aClass105_1;
					if (local421 != null && local421.anIntArray134 != null) {
						local421 = local421.method2622(Static23.aClass247_1);
					}
					if (local421 != null && local421.aBoolean211 && local421.aBoolean206) {
						local365 = local403.anInt9805 / 128 - local70 / 128;
						local466 = local403.anInt9803 / 128 - local58 / 128;
						if (local421.anInt2819 == -1) {
							Static301.method4698(Static99.aClass155Array4[1], local466, arg1, arg2, local12, arg0, local365);
						} else {
							Static425.method6181(arg0, arg1, local365, arg2, arg3, local466, local421.anInt2819, local12);
						}
					}
				}
			}
		}
		local206 = Static274.anInt4921;
		@Pc(508) int[] local508 = Static605.anIntArray544;
		@Pc(567) int local567;
		@Pc(571) int local571;
		@Pc(604) int local604;
		for (local355 = 0; local355 < local206; local355++) {
			@Pc(518) Class4_Sub1_Sub1_Sub2_Sub1 local518 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local508[local355]];
			if (local518 != null && local518.method4088() && !local518.aBoolean300 && local518 != Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 == local518.aByte139) {
				local466 = local518.anInt9805 / 128 - local70 / 128;
				local567 = local518.anInt9803 / 128 - local58 / 128;
				@Pc(569) boolean local569 = false;
				for (local571 = 0; local571 < Static645.anInt10557; local571++) {
					if (local518.aString44.equals(Static167.aStringArray13[local571]) && Static167.anIntArray152[local571] != 0) {
						local569 = true;
						break;
					}
				}
				@Pc(602) boolean local602 = false;
				for (local604 = 0; local604 < Static480.anInt7783; local604++) {
					if (local518.aString44.equals(Static508.aClass183Array1[local604].aString49)) {
						local602 = true;
						break;
					}
				}
				@Pc(634) boolean local634 = false;
				if (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4548 != 0 && local518.anInt4548 != 0 && Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt4548 == local518.anInt4548) {
					local634 = true;
				}
				if (local518.aBoolean303) {
					Static301.method4698(Static99.aClass155Array4[6], local567, arg1, arg2, local12, arg0, local466);
				} else if (local634) {
					Static301.method4698(Static99.aClass155Array4[4], local567, arg1, arg2, local12, arg0, local466);
				} else if (local518.aBoolean304) {
					Static301.method4698(Static99.aClass155Array4[7], local567, arg1, arg2, local12, arg0, local466);
				} else if (local569) {
					Static301.method4698(Static99.aClass155Array4[3], local567, arg1, arg2, local12, arg0, local466);
				} else if (local602) {
					Static301.method4698(Static99.aClass155Array4[5], local567, arg1, arg2, local12, arg0, local466);
				} else {
					Static301.method4698(Static99.aClass155Array4[2], local567, arg1, arg2, local12, arg0, local466);
				}
			}
		}
		@Pc(777) Class212[] local777 = Static8.aClass212Array1;
		@Pc(865) int local865;
		for (local466 = 0; local466 < local777.length; local466++) {
			@Pc(785) Class212 local785 = local777[local466];
			if (local785 != null && local785.anInt5367 != 0 && Static565.anInt8921 % 20 < 10) {
				@Pc(829) int local829;
				if (local785.anInt5367 == 1) {
					@Pc(815) Class5_Sub9 local815 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local785.anInt5376);
					if (local815 != null) {
						@Pc(820) Class4_Sub1_Sub1_Sub2_Sub2 local820 = local815.aClass4_Sub1_Sub1_Sub2_Sub2_1;
						local829 = local820.anInt9805 / 128 - local70 / 128;
						local604 = local820.anInt9803 / 128 - local58 / 128;
						Static223.method3546(arg1, local785.anInt5370, local829, 360000L, arg0, arg2, local604, local12);
					}
				}
				if (local785.anInt5367 == 2) {
					local865 = local785.anInt5366 / 128 - local70 / 128;
					local571 = local785.anInt5374 / 128 - local58 / 128;
					@Pc(881) long local881 = (long) (local785.anInt5375 << 7);
					@Pc(885) long local885 = local881 * local881;
					Static223.method3546(arg1, local785.anInt5370, local865, local885, arg0, arg2, local571, local12);
				}
				if (local785.anInt5367 == 10 && local785.anInt5376 >= 0 && Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1.length > local785.anInt5376) {
					@Pc(928) Class4_Sub1_Sub1_Sub2_Sub1 local928 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local785.anInt5376];
					if (local928 != null) {
						local571 = local928.anInt9805 / 128 - local70 / 128;
						local829 = local928.anInt9803 / 128 - local58 / 128;
						Static223.method3546(arg1, local785.anInt5370, local571, 360000L, arg0, arg2, local829, local12);
					}
				}
			}
		}
		if (Static426.anInt7111 == 4) {
			return;
		}
		if (Static19.anInt250 != 0) {
			local567 = Static19.anInt250 * 4 + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() - 1) * 2 + 2 - local70 / 128;
			local865 = Static405.anInt10904 * 4 + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.method5932() * 2 + 2 - local58 / 128 - 2;
			Static301.method4698(Static170.aClass155Array10[Static286.aBoolean749 ? 1 : 0], local865, arg1, arg2, local12, arg0, local567);
		}
		if (!Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aBoolean300) {
			arg3.method8644(arg0.anInt5973 / 2 + arg2 - 1, -1, 3, arg0.anInt5985 / 2 + arg1 - 1, 3);
			return;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I")
	public static int method3413(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
