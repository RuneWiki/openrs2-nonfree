import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "Z")
	public static boolean aBoolean417 = false;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V")
	public static void method4128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(12, (long) arg0);
		local9.method7286();
		local9.anInt8546 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IILclient!jba;IIILclient!ka;Lclient!ha;IIIIII)Lclient!ka;")
	public static Class153 method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class175 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class153 arg6, @OriginalArg(7) Class65 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		if (arg6 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg2 != null) {
			local11 = arg2.method4252(false, -1, arg8) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(55) long local55 = ((long) arg0 << 48) + ((long) arg9 << 32) + (long) ((arg11 << 16) + arg5 + (arg1 << 24));
		@Pc(57) Class340 local57 = Static483.aClass340_45;
		@Pc(65) Class153 local65;
		synchronized (Static483.aClass340_45) {
			local65 = (Class153) Static483.aClass340_45.method7999(local55);
		}
		if (local65 == null || arg7.method6885(local65.ua(), local11) != 0) {
			if (local65 != null) {
				local11 = arg7.method6882(local11, local65.ua());
			}
			@Pc(110) byte local110;
			if (arg5 == 1) {
				local110 = 9;
			} else if (arg5 == 2) {
				local110 = 12;
			} else if (arg5 == 3) {
				local110 = 15;
			} else if (arg5 == 4) {
				local110 = 18;
			} else {
				local110 = 21;
			}
			@Pc(139) int[] local139 = new int[] { 64, 96, 128 };
			@Pc(157) Class329 local157 = new Class329(local110 * 3 + 1, -local110 + local110 * 6, 0);
			@Pc(164) int local164 = local157.method7683(0, 0, 0);
			@Pc(168) int[][] local168 = new int[3][local110];
			@Pc(176) int local176;
			@Pc(180) int local180;
			@Pc(182) int local182;
			@Pc(206) int local206;
			for (@Pc(170) int local170 = 0; local170 < 3; local170++) {
				local176 = local139[local170];
				local180 = local139[local170];
				for (local182 = 0; local182 < local110; local182++) {
					@Pc(190) int local190 = (local182 << 14) / local110;
					@Pc(198) int local198 = Class200.anIntArray337[local190] * local176 >> 14;
					local206 = Class200.anIntArray338[local190] * local180 >> 14;
					local168[local170][local182] = local157.method7683(local198, 0, local206);
				}
			}
			for (local176 = 0; local176 < 3; local176++) {
				local180 = (local176 * 256 + 128) / 3;
				local182 = 256 - local180;
				@Pc(257) byte local257 = (byte) (local182 * arg11 + local180 * arg1 >> 8);
				@Pc(302) short local302 = (short) (((arg0 & 0xFC00) * local180 + (arg9 & 0xFC00) * local182 & 0xFC0000) + ((arg0 & 0x380) * local180 + (arg9 & 0x380) * local182 & 0x38000) + (local182 * (arg9 & 0x7F) + (arg0 & 0x7F) * local180 & 0x7F00) >> 8);
				for (local206 = 0; local206 < local110; local206++) {
					if (local176 == 0) {
						local157.method7671(local164, local257, (short) -1, (byte) 1, (byte) -1, local302, local168[0][local206], local168[0][(local206 + 1) % local110]);
					} else {
						local157.method7671(local168[local176 - 1][local206], local257, (short) -1, (byte) 1, (byte) -1, local302, local168[local176][(local206 + 1) % local110], local168[local176 - 1][(local206 + 1) % local110]);
						local157.method7671(local168[local176 - 1][local206], local257, (short) -1, (byte) 1, (byte) -1, local302, local168[local176][local206], local168[local176][(local206 + 1) % local110]);
					}
				}
			}
			local65 = arg7.method6964(local157, local11, Static463.anInt7832, 64, 768);
			@Pc(421) Class340 local421 = Static483.aClass340_45;
			synchronized (Static483.aClass340_45) {
				Static483.aClass340_45.method7986(local55, local65);
			}
		}
		@Pc(437) int local437 = arg6.V();
		@Pc(440) int local440 = arg6.RA();
		@Pc(443) int local443 = arg6.HA();
		@Pc(446) int local446 = arg6.G();
		@Pc(448) Class5_Sub3_Sub9 local448 = null;
		if (arg2 != null) {
			@Pc(455) int local455 = arg2.anIntArray288[arg8];
			local448 = Static591.aClass66_2.method1767(local455 >> 16);
			arg8 = local455 & 0xFFFF;
		}
		if (local448 == null) {
			local65 = local65.method8580((byte) 3, local11, true);
			local65.O(local440 - local437 >> 1, 128, local446 - local443 >> 1);
			local65.H(local440 + local437 >> 1, 0, local443 + local446 >> 1);
		} else {
			local65 = local65.method8580((byte) 3, local11, true);
			local65.O(local440 - local437 >> 1, 128, local446 - local443 >> 1);
			local65.H(local440 + local437 >> 1, 0, local446 + local443 >> 1);
			local65.method8583(local448, arg8);
		}
		if (arg12 != 0) {
			local65.FA(arg12);
		}
		if (arg4 != 0) {
			local65.VA(arg4);
		}
		if (arg3 != 0) {
			local65.H(0, arg3, 0);
		}
		return local65;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method4130(@OriginalArg(0) Class65 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static66.aBoolean570) {
			local7 = Static106.method2037();
			local9 = Static660.method8815();
		}
		arg0.KA(local7, local9, local7 + Static32.anInt510, 350 - -local9);
		arg0.aa(local7, local9, Static32.anInt510, 350, Static262.anInt4858 << 24 | 0x332277, 1);
		Static520.method7366(local7, local9 + 350, local9, local7 + Static32.anInt510);
		@Pc(55) int local55 = 350 / Static123.anInt2501;
		@Pc(68) int local68;
		if (Static6.anInt66 > 0) {
			local68 = 346 - Static123.anInt2501 - 4;
			@Pc(78) int local78 = local55 * local68 / (Static6.anInt66 + local55 - 1);
			@Pc(80) int local80 = 4;
			if (Static6.anInt66 > 1) {
				local80 = (local68 - local78) * (-Static151.anInt3096 + Static6.anInt66 + -1) / (Static6.anInt66 - 1) + 4;
			}
			arg0.aa(Static32.anInt510 + local7 - 16, local80 + local9, 12, local78, Static262.anInt4858 << 24 | 0x332277, 2);
			for (@Pc(120) int local120 = Static151.anInt3096; local120 < Static151.anInt3096 + local55 && local120 < Static6.anInt66; local120++) {
				@Pc(131) String[] local131 = Static147.method2668('\b', Static352.aStringArray61[local120]);
				@Pc(138) int local138 = (Static32.anInt510 - 24) / local131.length;
				for (@Pc(140) int local140 = 0; local140 < local131.length; local140++) {
					@Pc(149) int local149 = local138 * local140 + 8;
					arg0.KA(local7 + local149, local9, local149 + local7 + local138 - 8, local9 - -350);
					Static604.aClass73_15.method5773(local9 + 350 - Static123.anInt2501 * (local120 - Static151.anInt3096) - Static247.aClass247_16.anInt6966 - Static414.anInt7336 - 2, -1, Static646.method8669(local131[local140]), local149 + local7, -16777216);
				}
			}
		}
		Static431.aClass73_10.method5776(-16777216, local9 + 350 - 20, local7 + (Static32.anInt510 - 25), "Build: 647", -1);
		arg0.KA(local7, local9, local7 + Static32.anInt510, local9 - -350);
		arg0.method6948(Static32.anInt510, local7, -1, local9 + 350 - Static414.anInt7336);
		Static231.aClass73_8.method5773(local9 + 349 - Static299.aClass247_11.anInt6966, -1, "--> " + Static646.method8669(Static390.aString58), local7 + 10, -16777216);
		if (!Static391.aBoolean602) {
			return;
		}
		local68 = -1;
		if (Static26.anInt350 % 30 > 15) {
			local68 = 16777215;
		}
		arg0.method6879(local9 + 350 - Static299.aClass247_11.anInt6966 - 11, local68, 12, local7 + Static299.aClass247_11.method5759("--> " + Static646.method8669(Static390.aString58).substring(0, Static576.anInt9395)) + 10);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)I")
	public static int method4132() {
		return Static16.anIntArray14 == null ? 0 : Static16.anIntArray14.length * 2;
	}
}
