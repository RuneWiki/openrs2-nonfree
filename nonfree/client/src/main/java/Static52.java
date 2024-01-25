import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "Ljava/awt/Image;")
	public static Image anImage5;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[Lclient!aq;")
	public static Class5[] aClass5Array11;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "[J")
	public static final long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	public static int anInt3689 = 0;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static final int anInt3690 = 2;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method3352() {
		Static136.aClass154_12.method3746();
		Static118.aClass154_11.method3746();
		Static164.aClass154_19.method3746();
		Static338.aClass154_51.method3746();
		Static92.aClass154_6.method3746();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3356(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!qr;Lclient!ld;IIIILclient!cj;I)V")
	public static void method3357(@OriginalArg(0) Class12_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) Class12_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class2_Sub42 local7 = new Class2_Sub42();
		local7.anInt6534 = arg2;
		local7.anInt6536 = arg6 * 128;
		local7.anInt6542 = arg3 * 128;
		if (arg5 != null) {
			local7.aClass34_1 = arg5;
			@Pc(28) int local28 = arg5.lb;
			@Pc(31) int local31 = arg5.anInt808;
			if (arg4 == 1 || arg4 == 3) {
				local28 = arg5.anInt808;
				local31 = arg5.lb;
			}
			local7.anInt6546 = arg5.anInt782;
			local7.anInt6537 = arg5.anInt794;
			local7.anInt6543 = arg5.anInt781;
			local7.anInt6535 = arg5.anInt768 * 128;
			local7.anInt6541 = (local28 + arg3) * 128;
			local7.anInt6539 = arg5.anInt811;
			local7.anInt6545 = (local31 + arg6) * 128;
			local7.anIntArray788 = arg5.anIntArray123;
			if (arg5.anIntArray122 != null) {
				local7.aBoolean488 = true;
				local7.method5598();
			}
			if (local7.anIntArray788 != null) {
				local7.anInt6544 = (int) (Math.random() * (double) (local7.anInt6546 - local7.anInt6537)) + local7.anInt6537;
			}
			Static181.aClass210_23.method5044(local7);
		} else if (arg1 != null) {
			local7.aClass12_Sub1_Sub2_Sub1_1 = arg1;
			@Pc(170) Class240 local170 = arg1.aClass240_1;
			if (local170.anIntArray781 != null) {
				local7.aBoolean488 = true;
				local170 = local170.method5567(Static248.aClass125_1);
			}
			if (local170 != null) {
				local7.anInt6545 = (local170.anInt6483 + arg6) * 128;
				local7.anInt6541 = (local170.anInt6483 + arg3) * 128;
				local7.anInt6543 = Static234.method3820(arg1);
				local7.anInt6539 = local170.anInt6471;
				local7.anInt6535 = local170.anInt6462 * 128;
			}
			Static39.aClass210_7.method5044(local7);
		} else if (arg0 != null) {
			local7.aClass12_Sub1_Sub2_Sub2_2 = arg0;
			local7.anInt6541 = (arg0.method4706() + arg3) * 128;
			local7.anInt6545 = (arg0.method4706() + arg6) * 128;
			local7.anInt6543 = Static165.method2708(arg0);
			local7.anInt6539 = arg0.anInt5414;
			local7.anInt6535 = arg0.anInt5418 * 128;
			Static208.aClass214_22.method5065((long) arg0.anInt5365, local7);
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([[B[B[I[III[[BB)I")
	public static int method3359(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][] arg6) {
		@Pc(9) int local9 = arg2[arg5];
		@Pc(15) int local15 = arg3[arg5] + local9;
		@Pc(19) int local19 = arg2[arg4];
		@Pc(25) int local25 = arg3[arg4] + local19;
		@Pc(27) int local27 = local9;
		if (local19 > local9) {
			local27 = local19;
		}
		@Pc(34) int local34 = local15;
		if (local15 > local25) {
			local34 = local25;
		}
		@Pc(49) int local49 = arg1[arg5] & 0xFF;
		if ((arg1[arg4] & 0xFF) < local49) {
			local49 = arg1[arg4] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg0[arg5];
		@Pc(75) byte[] local75 = arg6[arg4];
		@Pc(79) int local79 = local27 - local9;
		@Pc(84) int local84 = local27 - local19;
		for (@Pc(86) int local86 = local27; local86 < local34; local86++) {
			@Pc(98) int local98 = local75[local84++] + local71[local79++];
			if (local49 > local98) {
				local49 = local98;
			}
		}
		return -local49;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIZ)V")
	public static void method3361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(arg2, 9);
		local8.method410();
		local8.anInt348 = arg1;
		local8.anInt341 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILclient!km;Lclient!ms;)V")
	public static void method3365(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class82 arg2, @OriginalArg(4) Class155 arg3) {
		@Pc(10) Class201 local10 = arg3.method3760(arg2);
		if (local10 == null) {
			return;
		}
		arg2.method4477(arg0, arg1, arg3.anInt4170 + arg0, arg3.anInt4214 + arg1);
		if (Static279.anInt4939 == 2 || Static279.anInt4939 == 5 || Static298.aClass5_9 == null) {
			arg2.method4494(local10, arg0, arg1);
			return;
		}
		@Pc(68) int local68;
		@Pc(51) int local51;
		@Pc(65) int local65;
		@Pc(57) int local57;
		if (Static283.anInt5017 == 4) {
			local68 = Static332.anInt5822;
			local65 = (int) -Static18.aFloat8 & 0x3FFF;
			local57 = 4096;
			local51 = Static290.anInt5133;
		} else {
			local51 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317;
			local57 = 4096 - Static48.anInt942 * 16;
			local65 = (int) -Static18.aFloat8 + Static232.anInt4267 & 0x3FFF;
			local68 = Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328;
		}
		@Pc(95) int local95 = local68 / 32 + 48 + 208 - Static392.anInt6751 * 2;
		@Pc(113) int local113 = Static307.anInt5484 * 4 + 48 - (Static307.anInt5484 - 104) * 2 - local51 / 32;
		Static298.aClass5_9.method4988((float) arg3.anInt4170 / 2.0F + (float) arg0, (float) arg3.anInt4214 / 2.0F + (float) arg1, (float) local95, (float) local113, local57, local65 << 2, local10, arg0, arg1);
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(185) int local185;
		@Pc(196) int local196;
		for (@Pc(147) Class2_Sub44 local147 = (Class2_Sub44) Static138.aClass210_20.method5035(); local147 != null; local147 = (Class2_Sub44) Static138.aClass210_20.method5037()) {
			@Pc(152) int local152 = local147.anInt6631;
			local164 = (Static156.aClass159_3.anIntArray519[local152] >> 14 & 0x3FFF) - Static376.anInt6607;
			local174 = (Static156.aClass159_3.anIntArray519[local152] & 0x3FFF) - Static133.anInt2474;
			local185 = local164 * 4 + 2 - local68 / 32;
			local196 = local174 * 4 + 2 - local51 / 32;
			Static283.method4369(local10, arg0, arg2, arg3, Static156.aClass159_3.anIntArray520[local152], local185, local196, arg1);
		}
		for (local164 = 0; local164 < Static216.anInt3989; local164++) {
			local174 = Static18.anIntArray84[local164] * 4 + 2 - local68 / 32;
			local185 = Static62.anIntArray163[local164] * 4 + 2 - local51 / 32;
			@Pc(253) Class34 local253 = Static11.aClass123_5.method2703(Static306.anIntArray662[local164]);
			if (local253.anIntArray122 != null) {
				local253 = local253.method831(Static248.aClass125_1);
				if (local253 == null || local253.anInt777 == -1) {
					continue;
				}
			}
			Static283.method4369(local10, arg0, arg2, arg3, local253.anInt777, local174, local185, arg1);
		}
		for (@Pc(294) Class2_Sub5 local294 = (Class2_Sub5) Static147.aClass214_14.method5060(); local294 != null; local294 = (Class2_Sub5) Static147.aClass214_14.method5064()) {
			local185 = (int) (local294.aLong208 >> 28 & 0x3L);
			if (local185 == Static345.anInt6062) {
				local196 = (int) (local294.aLong208 & 0x3FFFL) * 4 + 2 - local68 / 32;
				@Pc(342) int local342 = (int) (local294.aLong208 >> 14 & 0x3FFFL) * 4 + 2 - local51 / 32;
				Static2.method3449(local342, arg3, arg0, local196, local10, Static252.aClass5Array12[0], arg1);
			}
		}
		@Pc(418) int local418;
		for (local185 = 0; local185 < Static199.anInt3672; local185++) {
			@Pc(370) Class12_Sub1_Sub2_Sub1 local370 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local185]];
			if (local370 != null && local370.method3258() && Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 == local370.aByte74) {
				@Pc(390) Class240 local390 = local370.aClass240_1;
				if (local390 != null && local390.anIntArray781 != null) {
					local390 = local390.method5567(Static248.aClass125_1);
				}
				if (local390 != null && local390.aBoolean482 && local390.aBoolean481) {
					local418 = local370.anInt6328 / 32 - local68 / 32;
					@Pc(427) int local427 = local370.anInt6317 / 32 - local51 / 32;
					if (local390.anInt6480 == -1) {
						Static2.method3449(local427, arg3, arg0, local418, local10, Static252.aClass5Array12[1], arg1);
					} else {
						Static283.method4369(local10, arg0, arg2, arg3, local390.anInt6480, local418, local427, arg1);
					}
				}
			}
		}
		local196 = Static168.anInt3003;
		@Pc(465) int[] local465 = Static7.anIntArray24;
		@Pc(503) int local503;
		@Pc(512) int local512;
		@Pc(516) int local516;
		for (local418 = 0; local418 < local196; local418++) {
			@Pc(475) Class12_Sub1_Sub2_Sub2 local475 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local465[local418]];
			if (local475 != null && local475.method4716() && Static267.aClass12_Sub1_Sub2_Sub2_1 != local475 && local475.aByte74 == Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74) {
				local503 = local475.anInt6328 / 32 - local68 / 32;
				local512 = local475.anInt6317 / 32 - local51 / 32;
				@Pc(514) boolean local514 = false;
				for (local516 = 0; local516 < Static244.anInt1014; local516++) {
					if (local475.aString51.equals(Static340.aStringArray38[local516]) && Static249.anIntArray557[local516] != 0) {
						local514 = true;
						break;
					}
				}
				@Pc(546) boolean local546 = false;
				for (@Pc(548) int local548 = 0; local548 < Static354.anInt6211; local548++) {
					if (local475.aString51.equals(Static61.aClass195Array1[local548].aString56)) {
						local546 = true;
						break;
					}
				}
				@Pc(572) boolean local572 = false;
				if (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5385 != 0 && local475.anInt5385 != 0 && Static267.aClass12_Sub1_Sub2_Sub2_1.anInt5385 == local475.anInt5385) {
					local572 = true;
				}
				if (local514) {
					Static2.method3449(local512, arg3, arg0, local503, local10, Static252.aClass5Array12[3], arg1);
				} else if (local546) {
					Static2.method3449(local512, arg3, arg0, local503, local10, Static252.aClass5Array12[5], arg1);
				} else if (local572) {
					Static2.method3449(local512, arg3, arg0, local503, local10, Static252.aClass5Array12[4], arg1);
				} else {
					Static2.method3449(local512, arg3, arg0, local503, local10, Static252.aClass5Array12[2], arg1);
				}
			}
		}
		@Pc(654) Class97[] local654 = Static239.aClass97Array1;
		@Pc(744) int local744;
		for (local503 = 0; local503 < local654.length; local503++) {
			@Pc(662) Class97 local662 = local654[local503];
			if (local662 != null && local662.anInt2442 != 0 && Static295.anInt5281 % 20 < 10) {
				@Pc(714) int local714;
				if (local662.anInt2442 == 1 && local662.anInt2444 >= 0 && Static107.aClass12_Sub1_Sub2_Sub1Array1.length > local662.anInt2444) {
					@Pc(692) Class12_Sub1_Sub2_Sub1 local692 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local662.anInt2444];
					if (local692 != null) {
						local516 = local692.anInt6328 / 32 - local68 / 32;
						local714 = local692.anInt6317 / 32 - local51 / 32;
						Static251.method3996(local516, arg3, arg1, arg0, 360000, local714, local10, local662.anInt2456);
					}
				}
				if (local662.anInt2442 == 2) {
					local744 = (-Static376.anInt6607 + local662.anInt2445) * 4 + 2 - local68 / 32;
					local516 = (-Static133.anInt2474 + local662.anInt2443) * 4 + 2 - local51 / 32;
					local714 = local662.anInt2454 * 4;
					local714 *= local714;
					Static251.method3996(local744, arg3, arg1, arg0, local714, local516, local10, local662.anInt2456);
				}
				if (local662.anInt2442 == 10 && local662.anInt2444 >= 0 && local662.anInt2444 < Static90.aClass12_Sub1_Sub2_Sub2Array1.length) {
					@Pc(799) Class12_Sub1_Sub2_Sub2 local799 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local662.anInt2444];
					if (local799 != null) {
						local516 = local799.anInt6328 / 32 - local68 / 32;
						local714 = local799.anInt6317 / 32 - local51 / 32;
						Static251.method3996(local516, arg3, arg1, arg0, 360000, local714, local10, local662.anInt2456);
					}
				}
			}
		}
		if (Static283.anInt5017 == 4) {
			return;
		}
		if (Static292.anInt5161 != 0) {
			local512 = Static292.anInt5161 * 4 + Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() * 2 - local68 / 32;
			local744 = Static204.anInt3770 * 4 + Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() * 2 + 2 - local51 / 32 - 2;
			Static2.method3449(local744, arg3, arg0, local512, local10, Static314.aClass5Array15[Static19.aBoolean29 ? 1 : 0], arg1);
		}
		arg2.method4486(3, 3, arg3.anInt4170 / 2 + arg0 - 1, -1, arg1 + arg3.anInt4214 / 2 - 1);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIB)V")
	public static void method3367(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class2_Sub16 local18 = Static108.method2083(arg0, arg1);
		if (local18 != null) {
			for (@Pc(23) int local23 = 0; local23 < local18.anIntArray273.length; local23++) {
				local18.anIntArray273[local23] = -1;
				local18.anIntArray272[local23] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method3369() {
		if (!Static376.method5649()) {
			return;
		}
		if (Static98.aStringArray12 == null) {
			Static170.method2762();
		}
		Static166.anIntArray331 = new int[100];
		Static371.aBoolean486 = true;
		Static165.anIntArray330 = new int[100];
		Static388.anIntArray496 = new int[100];
		Static104.aBooleanArray45 = new boolean[100];
		Static40.anInt6590 = 0;
		for (@Pc(35) int local35 = 0; local35 < 100; local35++) {
			Static388.anIntArray496[local35] = (int) ((double) Static335.anInt5875 * Math.random());
			Static166.anIntArray331[local35] = (int) (Math.random() * 350.0D);
			Static165.anIntArray330[local35] = (int) (Math.random() * 102.0D);
			Static104.aBooleanArray45[local35] = Math.random() < 0.5D;
		}
		try {
			Static120.aClipboard1 = Static384.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(81) Exception local81) {
		}
	}
}
