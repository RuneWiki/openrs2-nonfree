import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public static int anInt1158;

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_1;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "[I")
	public static final int[] anIntArray58 = new int[4];

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[4];

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIILclient!ha;Lclient!ofa;)V")
	public static void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(4) Class265 arg3) {
		@Pc(17) Class1 local17 = arg3.method5906(arg2);
		if (local17 == null) {
			return;
		}
		arg2.KA(arg1, arg0, arg1 + arg3.anInt7024, arg3.anInt6997 + arg0);
		if (Static585.anInt9524 == 2 || Static585.anInt9524 == 5 || Static543.aClass6_35 == null) {
			arg2.A(-16777216, local17, arg1, arg0);
			return;
		}
		@Pc(54) int local54;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(58) int local58;
		if (Static451.anInt7263 == 4) {
			local54 = Static82.anInt1511;
			local56 = Static8.anInt108;
			local58 = 4096;
			local64 = (int) -Static318.aFloat81 & 0x3FFF;
		} else {
			local56 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619;
			local64 = Static234.anInt4142 + (int) -Static318.aFloat81 & 0x3FFF;
			local54 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
			local58 = 4096 - Static30.anInt1549 * 16;
		}
		@Pc(101) int local101 = local54 / 128 + 48 - (Static98.anInt361 - 104) * 2;
		@Pc(119) int local119 = Static438.anInt7120 * 4 + 48 - local56 / 128 - (Static438.anInt7120 + -104) * 2;
		Static543.aClass6_35.method5129((float) arg3.anInt7024 / 2.0F + (float) arg1, (float) arg3.anInt6997 / 2.0F + (float) arg0, (float) local101, (float) local119, local58, local64 << 2, local17, arg1, arg0);
		@Pc(170) int local170;
		@Pc(179) int local179;
		@Pc(190) int local190;
		@Pc(200) int local200;
		for (@Pc(153) Class3_Sub24 local153 = (Class3_Sub24) Static559.aClass302_63.method6603(); local153 != null; local153 = (Class3_Sub24) Static559.aClass302_63.method6605()) {
			@Pc(158) int local158 = local153.anInt3846;
			local170 = (Static406.aClass392_1.anIntArray629[local158] >> 14 & 0x3FFF) - Static534.anInt8358;
			local179 = (Static406.aClass392_1.anIntArray629[local158] & 0x3FFF) - Static402.anInt6661;
			local190 = local170 * 4 + 2 - local54 / 128;
			local200 = local179 * 4 + 2 - local56 / 128;
			Static419.method5773(arg3, local190, arg2, arg0, local200, arg1, local17, Static406.aClass392_1.anIntArray630[local158]);
		}
		for (local170 = 0; local170 < Static120.anInt2154; local170++) {
			local179 = Static194.anIntArray183[local170] * 4 + 2 - local54 / 128;
			local190 = Static64.anIntArray67[local170] * 4 + 2 - local56 / 128;
			@Pc(257) Class216 local257 = Static466.aClass340_6.method7665(Static623.anIntArray545[local170]);
			if (local257.anIntArray325 != null) {
				local257 = local257.method5043(Static210.aClass262_1);
				if (local257 == null || local257.anInt5966 == -1) {
					continue;
				}
			}
			Static419.method5773(arg3, local179, arg2, arg0, local190, arg1, local17, local257.anInt5966);
		}
		@Pc(341) int local341;
		@Pc(352) int local352;
		for (@Pc(298) Class3_Sub20 local298 = (Class3_Sub20) Static462.aClass333_29.method7490(); local298 != null; local298 = (Class3_Sub20) Static462.aClass333_29.method7487()) {
			local190 = (int) (local298.aLong313 >> 28 & 0x3L);
			if (Static318.anInt5310 == local190) {
				local200 = (int) (local298.aLong313 & 0x3FFFL) - Static534.anInt8358;
				@Pc(330) int local330 = (int) (local298.aLong313 >> 14 & 0x3FFFL) - Static402.anInt6661;
				local341 = local200 * 4 + 2 - local54 / 128;
				local352 = local330 * 4 + 2 - local56 / 128;
				Static429.method5923(local352, local341, arg1, arg0, arg3, local17, Static232.aClass6Array6[0]);
			}
		}
		@Pc(438) int local438;
		for (local190 = 0; local190 < Static52.anInt1140; local190++) {
			@Pc(383) Class3_Sub52 local383 = (Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local190]);
			if (local383 != null) {
				@Pc(388) Class34_Sub1_Sub1_Sub2_Sub2 local388 = local383.aClass34_Sub1_Sub1_Sub2_Sub2_2;
				if (local388.method7882() && local388.aByte132 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) {
					@Pc(400) Class261 local400 = local388.aClass261_1;
					if (local400 != null && local400.anIntArray364 != null) {
						local400 = local400.method5772(Static210.aClass262_1);
					}
					if (local400 != null && local400.aBoolean481 && local400.aBoolean478) {
						local352 = local388.anInt9614 / 128 - local54 / 128;
						local438 = local388.anInt9619 / 128 - local56 / 128;
						if (local400.anInt6827 == -1) {
							Static429.method5923(local438, local352, arg1, arg0, arg3, local17, Static232.aClass6Array6[1]);
						} else {
							Static419.method5773(arg3, local352, arg2, arg0, local438, arg1, local17, local400.anInt6827);
						}
					}
				}
			}
		}
		local200 = Static439.anInt7133;
		@Pc(475) int[] local475 = Static294.anIntArray593;
		@Pc(522) int local522;
		@Pc(526) int local526;
		@Pc(558) int local558;
		for (local341 = 0; local341 < local200; local341++) {
			@Pc(485) Class34_Sub1_Sub1_Sub2_Sub1 local485 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local475[local341]];
			if (local485 != null && local485.method1491() && !local485.aBoolean145 && local485 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1 && local485.aByte132 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) {
				local438 = local485.anInt9614 / 128 - local54 / 128;
				local522 = local485.anInt9619 / 128 - local56 / 128;
				@Pc(524) boolean local524 = false;
				for (local526 = 0; local526 < Static345.anInt5912; local526++) {
					if (local485.aString25.equals(Static651.aStringArray66[local526]) && Static639.anIntArray557[local526] != 0) {
						local524 = true;
						break;
					}
				}
				@Pc(556) boolean local556 = false;
				for (local558 = 0; local558 < Static63.anInt1316; local558++) {
					if (local485.aString25.equals(Static603.aClass24Array1[local558].aString10)) {
						local556 = true;
						break;
					}
				}
				@Pc(582) boolean local582 = false;
				if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1810 != 0 && local485.anInt1810 != 0 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt1810 == local485.anInt1810) {
					local582 = true;
				}
				if (local485.aBoolean144) {
					Static429.method5923(local522, local438, arg1, arg0, arg3, local17, Static232.aClass6Array6[6]);
				} else if (local582) {
					Static429.method5923(local522, local438, arg1, arg0, arg3, local17, Static232.aClass6Array6[4]);
				} else if (local485.aBoolean146) {
					Static429.method5923(local522, local438, arg1, arg0, arg3, local17, Static232.aClass6Array6[7]);
				} else if (local524) {
					Static429.method5923(local522, local438, arg1, arg0, arg3, local17, Static232.aClass6Array6[3]);
				} else if (local556) {
					Static429.method5923(local522, local438, arg1, arg0, arg3, local17, Static232.aClass6Array6[5]);
				} else {
					Static429.method5923(local522, local438, arg1, arg0, arg3, local17, Static232.aClass6Array6[2]);
				}
			}
		}
		@Pc(693) Class252[] local693 = Static171.aClass252Array1;
		@Pc(774) int local774;
		for (local438 = 0; local438 < local693.length; local438++) {
			@Pc(701) Class252 local701 = local693[local438];
			if (local701 != null && local701.anInt6681 != 0 && Static122.anInt2190 % 20 < 10) {
				@Pc(737) int local737;
				if (local701.anInt6681 == 1) {
					@Pc(723) Class3_Sub52 local723 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local701.anInt6678);
					if (local723 != null) {
						@Pc(728) Class34_Sub1_Sub1_Sub2_Sub2 local728 = local723.aClass34_Sub1_Sub1_Sub2_Sub2_2;
						local737 = local728.anInt9614 / 128 - local54 / 128;
						local558 = local728.anInt9619 / 128 - local56 / 128;
						Static614.method8320(local558, arg0, 360000L, local737, local17, arg3, arg1, local701.anInt6684);
					}
				}
				if (local701.anInt6681 == 2) {
					local774 = local701.anInt6674 / 128 - local54 / 128;
					local526 = local701.anInt6676 / 128 - local56 / 128;
					@Pc(789) long local789 = (long) (local701.anInt6677 << 7);
					@Pc(793) long local793 = local789 * local789;
					Static614.method8320(local526, arg0, local793, local774, local17, arg3, arg1, local701.anInt6684);
				}
				if (local701.anInt6681 == 10 && local701.anInt6678 >= 0 && local701.anInt6678 < Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1.length) {
					@Pc(825) Class34_Sub1_Sub1_Sub2_Sub1 local825 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local701.anInt6678];
					if (local825 != null) {
						local526 = local825.anInt9614 / 128 - local54 / 128;
						local737 = local825.anInt9619 / 128 - local56 / 128;
						Static614.method8320(local737, arg0, 360000L, local526, local17, arg3, arg1, local701.anInt6684);
					}
				}
			}
		}
		if (Static451.anInt7263 == 4) {
			return;
		}
		if (Static622.anInt10293 != 0) {
			local522 = Static622.anInt10293 * 4 + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() + -1) * 2 + 2 - local54 / 128;
			local774 = Static643.anInt10566 * 4 + Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() * 2 + 2 - local56 / 128 - 2;
			Static429.method5923(local774, local522, arg1, arg0, arg3, local17, Static245.aClass6Array7[Static280.aBoolean314 ? 1 : 0]);
		}
		if (!Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aBoolean145) {
			arg2.method8054(3, arg0 + arg3.anInt6997 / 2 - 1, 3, arg1 + arg3.anInt7024 / 2 - 1, -1);
			return;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(CB)Z")
	public static boolean method1046(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(34) char[] local34 = Static439.aCharArray7;
			for (@Pc(36) int local36 = 0; local36 < local34.length; local36++) {
				@Pc(42) char local42 = local34[local36];
				if (arg0 == local42) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!dt;)Lclient!ar;")
	public static Class21_Sub1_Sub1 method1047(@OriginalArg(1) Class3_Sub4 arg0) {
		@Pc(16) Class21_Sub1 local16 = Static565.method7445(arg0);
		@Pc(20) int local20 = arg0.method7918();
		return new Class21_Sub1_Sub1(local16.aClass266_12, local16.aClass131_23, local16.anInt9576, local16.anInt9573, local16.anInt9572, local16.anInt9574, local16.anInt9575, local16.anInt9570, local16.anInt9571, local16.anInt677, local16.anInt675, local16.anInt678, local16.anInt670, local16.anInt671, local16.anInt674, local20);
	}
}
