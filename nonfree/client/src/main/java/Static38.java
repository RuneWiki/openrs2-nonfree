import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bp", name = "p", descriptor = "Lclient!fj;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "Lclient!os;")
	public static final Class182 aClass182_32 = new Class182("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "[I")
	public static final int[] anIntArray57 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILclient!jv;IIILclient!za;ZLclient!e;IIIIII)Lclient!e;")
	public static Class63 method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class50 arg6, @OriginalArg(8) Class63 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		if (arg7 == null) {
			return null;
		}
		@Pc(16) int local16 = 2055;
		if (arg2 != null) {
			local16 = arg2.method3211(arg11, -1, false) | 0x807;
			local16 &= 0xFFFFFDFF;
		}
		@Pc(54) long local54 = ((long) arg9 << 48) + (long) ((arg1 << 24) + arg3 + (arg0 << 16)) + ((long) arg12 << 32);
		@Pc(56) Class267 local56 = Static412.aClass267_77;
		@Pc(64) Class63 local64;
		synchronized (Static412.aClass267_77) {
			local64 = (Class63) Static412.aClass267_77.method6014(local54);
		}
		@Pc(160) int local160;
		@Pc(166) int local166;
		@Pc(172) int local172;
		@Pc(176) int local176;
		if (local64 == null || arg6.method5856(local64.RA(), local16) != 0) {
			if (local64 != null) {
				local16 = arg6.method5822(local16, local64.RA());
			}
			@Pc(93) byte local93;
			if (arg3 == 1) {
				local93 = 9;
			} else if (arg3 == 2) {
				local93 = 12;
			} else if (arg3 == 3) {
				local93 = 15;
			} else if (arg3 == 4) {
				local93 = 18;
			} else {
				local93 = 21;
			}
			@Pc(135) int[] local135 = new int[] { 64, 96, 128 };
			@Pc(153) Class192 local153 = new Class192(local93 * 3 + 1, -local93 + local93 * 2 * 3, 0);
			local160 = local153.method4340(0, 0, 0);
			@Pc(164) int[][] local164 = new int[3][local93];
			@Pc(178) int local178;
			@Pc(202) int local202;
			for (local166 = 0; local166 < 3; local166++) {
				local172 = local135[local166];
				local176 = local135[local166];
				for (local178 = 0; local178 < local93; local178++) {
					@Pc(186) int local186 = (local178 << 14) / local93;
					@Pc(194) int local194 = local172 * Class250.anIntArray675[local186] >> 15;
					local202 = Class250.anIntArray674[local186] * local176 >> 15;
					local164[local166][local178] = local153.method4340(local194, local202, 0);
				}
			}
			for (local172 = 0; local172 < 3; local172++) {
				local176 = (local172 * 256 + 128) / 3;
				local178 = 256 - local176;
				@Pc(253) byte local253 = (byte) (local176 * arg1 + local178 * arg0 >> 8);
				@Pc(298) short local298 = (short) (((arg9 & 0x380) * local176 + local178 * (arg12 & 0x380) & 0x38000) + (local178 * (arg12 & 0xFC00) + local176 * (arg9 & 0xFC00) & 0xFC0000) + ((arg12 & 0x7F) * local178 + local176 * (arg9 & 0x7F) & 0x7F00) >> 8);
				for (local202 = 0; local202 < local93; local202++) {
					if (local172 == 0) {
						local153.method4341((byte) -1, (short) -1, local164[0][(local202 + 1) % local93], local253, (byte) 1, local164[0][local202], local160, local298);
					} else {
						local153.method4341((byte) -1, (short) -1, local164[local172 - 1][(local202 + 1) % local93], local253, (byte) 1, local164[local172][(local202 + 1) % local93], local164[local172 - 1][local202], local298);
						local153.method4341((byte) -1, (short) -1, local164[local172][(local202 + 1) % local93], local253, (byte) 1, local164[local172][local202], local164[local172 - 1][local202], local298);
					}
				}
			}
			local64 = arg6.method5864(local153, local16, Static261.anInt4649, 64, 768);
			@Pc(418) Class267 local418 = Static412.aClass267_77;
			synchronized (Static412.aClass267_77) {
				Static412.aClass267_77.method6008(local64, local54);
			}
		}
		@Pc(437) int local437 = (arg3 << 6) - 1;
		@Pc(440) int local440 = -local437;
		@Pc(443) int local443 = -local437;
		@Pc(445) int local445 = local437;
		local160 = local437;
		if (arg10 != 0) {
			if ((arg10 & 0x8) != 0) {
				local440 -= 128;
			}
			if ((arg10 & 0x4) != 0) {
				local445 = local437 + 128;
			}
			if ((arg10 & 0x1) != 0) {
				local160 = local437 + 128;
			}
			if ((arg10 & 0x2) != 0) {
				local443 -= 128;
			}
		}
		@Pc(481) int local481 = arg7.ta();
		local166 = arg7.MA();
		local172 = arg7.Z();
		local176 = arg7.S();
		if (local172 < local443) {
			local172 = local443;
		}
		if (local440 > local481) {
			local481 = local440;
		}
		if (local166 > local445) {
			local166 = local445;
		}
		if (local160 < local176) {
			local176 = local160;
		}
		@Pc(516) Class10_Sub1_Sub4 local516 = null;
		if (arg2 != null) {
			@Pc(523) int local523 = arg2.anIntArray403[arg11];
			local516 = Static281.aClass98_3.method2409(local523 >> 16);
			arg11 = local523 & 0xFFFF;
		}
		if (local516 == null) {
			local64 = local64.method6093((byte) 3, local16, true);
			local64.n(local166 - local481 >> 1, 128, local176 - local172 >> 1);
			local64.a(local481 + local166 >> 1, 0, local172 + local176 >> 1);
		} else {
			local64 = local64.method6093((byte) 3, local16, true);
			local64.n(local166 - local481 >> 1, 128, local176 - local172 >> 1);
			local64.a(local166 + local481 >> 1, 0, local176 + local172 >> 1);
			local64.method6088(local516, arg11);
		}
		if (arg8 != 0) {
			local64.W(arg8);
		}
		if (arg4 != 0) {
			local64.K(arg4);
		}
		if (arg13 != 0) {
			local64.a(0, arg13, 0);
		}
		return local64;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[I[II)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(34) int local34 = (arg0 + arg1) / 2;
		@Pc(36) int local36 = arg0;
		@Pc(40) int local40 = arg3[local34];
		arg3[local34] = arg3[arg1];
		arg3[arg1] = local40;
		@Pc(54) int local54 = arg2[local34];
		arg2[local34] = arg2[arg1];
		arg2[arg1] = local54;
		@Pc(73) int local73 = ~local40 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(75) int local75 = arg0; local75 < arg1; local75++) {
			if ((local73 & local75) + local40 > arg3[local75]) {
				@Pc(90) int local90 = arg3[local75];
				arg3[local75] = arg3[local36];
				arg3[local36] = local90;
				@Pc(104) int local104 = arg2[local75];
				arg2[local75] = arg2[local36];
				arg2[local36++] = local104;
			}
		}
		arg3[arg1] = arg3[local36];
		arg3[local36] = local40;
		arg2[arg1] = arg2[local36];
		arg2[local36] = local54;
		method528(arg0, local36 - 1, arg2, arg3);
		method528(local36 + 1, arg1, arg2, arg3);
	}
}
