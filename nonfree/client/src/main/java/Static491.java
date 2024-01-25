import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!uf", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString75;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "[Lclient!ji;")
	public static Class160[] aClass160Array2;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_141 = new Class40("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!bj;IIIIIIIZIIILclient!qa;Lclient!r;)Lclient!r;")
	public static Class36 method6811(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class62 arg12, @OriginalArg(14) Class36 arg13) {
		if (arg13 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg1 != null) {
			local11 = arg1.method853(false, arg10, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg6 << 32) + (long) ((arg5 << 24) + (arg9 << 16) + arg8) + ((long) arg11 << 48);
		@Pc(49) Class288 local49 = Static195.aClass288_26;
		@Pc(57) Class36 local57;
		synchronized (Static195.aClass288_26) {
			local57 = (Class36) Static195.aClass288_26.method6745(local47);
		}
		@Pc(148) int local148;
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(164) int local164;
		if (local57 == null || arg12.method7017(local57.ba(), local11) != 0) {
			if (local57 != null) {
				local11 = arg12.method7024(local11, local57.ba());
			}
			@Pc(90) byte local90;
			if (arg8 == 1) {
				local90 = 9;
			} else if (arg8 == 2) {
				local90 = 12;
			} else if (arg8 == 3) {
				local90 = 15;
			} else if (arg8 == 4) {
				local90 = 18;
			} else {
				local90 = 21;
			}
			@Pc(124) int[] local124 = new int[] { 64, 96, 128 };
			@Pc(141) Class184 local141 = new Class184(local90 * 3 + 1, local90 * 2 * 3 - local90, 0);
			local148 = local141.method4520(0, 0, 0);
			@Pc(152) int[][] local152 = new int[3][local90];
			@Pc(166) int local166;
			@Pc(190) int local190;
			for (local154 = 0; local154 < 3; local154++) {
				local160 = local124[local154];
				local164 = local124[local154];
				for (local166 = 0; local166 < local90; local166++) {
					@Pc(174) int local174 = (local166 << 14) / local90;
					@Pc(182) int local182 = Class5_Sub2_Sub16.anIntArray411[local174] * local160 >> 15;
					local190 = Class5_Sub2_Sub16.anIntArray410[local174] * local164 >> 15;
					local152[local154][local166] = local141.method4520(local190, local182, 0);
				}
			}
			for (local160 = 0; local160 < 3; local160++) {
				local164 = (local160 * 256 + 128) / 3;
				local166 = 256 - local164;
				@Pc(241) byte local241 = (byte) (arg9 * local166 + local164 * arg5 >> 8);
				@Pc(286) short local286 = (short) ((local164 * (arg11 & 0x380) + (arg6 & 0x380) * local166 & 0x38000) + ((arg11 & 0xFC00) * local164 + (arg6 & 0xFC00) * local166 & 0xFC0000) + (local164 * (arg11 & 0x7F) + (arg6 & 0x7F) * local166 & 0x7F00) >> 8);
				for (local190 = 0; local190 < local90; local190++) {
					if (local160 == 0) {
						local141.method4531((short) -1, local241, local286, (byte) 1, local152[0][(local190 + 1) % local90], local152[0][local190], local148, (byte) -1);
					} else {
						local141.method4531((short) -1, local241, local286, (byte) 1, local152[local160 - 1][(local190 + 1) % local90], local152[local160][(local190 + 1) % local90], local152[local160 - 1][local190], (byte) -1);
						local141.method4531((short) -1, local241, local286, (byte) 1, local152[local160][(local190 + 1) % local90], local152[local160][local190], local152[local160 - 1][local190], (byte) -1);
					}
				}
			}
			local57 = arg12.method7012(local141, local11, Static45.anInt1006, 64, 768);
			@Pc(410) Class288 local410 = Static195.aClass288_26;
			synchronized (Static195.aClass288_26) {
				Static195.aClass288_26.method6746(local57, local47);
			}
		}
		@Pc(429) int local429 = (arg8 << 6) - 1;
		@Pc(432) int local432 = -local429;
		@Pc(435) int local435 = -local429;
		@Pc(437) int local437 = local429;
		local148 = local429;
		if (arg0 != 0) {
			if ((arg0 & 0x8) != 0) {
				local432 -= 128;
			}
			if ((arg0 & 0x4) != 0) {
				local437 = local429 + 128;
			}
			if ((arg0 & 0x2) != 0) {
				local435 -= 128;
			}
			if ((arg0 & 0x1) != 0) {
				local148 = local429 + 128;
			}
		}
		@Pc(473) int local473 = arg13.wa();
		local154 = arg13.va();
		local160 = arg13.Q();
		if (local473 < local432) {
			local473 = local432;
		}
		if (local154 > local437) {
			local154 = local437;
		}
		local164 = arg13.U();
		if (local435 > local160) {
			local160 = local435;
		}
		if (local164 > local148) {
			local164 = local148;
		}
		@Pc(508) Class5_Sub2_Sub16 local508 = null;
		if (arg1 != null) {
			@Pc(515) int local515 = arg1.anIntArray69[arg10];
			local508 = Static155.aClass76_2.method2153(local515 >> 16);
			arg10 = local515 & 0xFFFF;
		}
		if (local508 == null) {
			local57 = local57.method7356((byte) 3, local11, true);
			local57.V(local154 - local473 >> 1, 128, local164 - local160 >> 1);
			local57.ca(local473 + local154 >> 1, 0, local160 + local164 >> 1);
		} else {
			local57 = local57.method7356((byte) 3, local11, true);
			local57.V(local154 - local473 >> 1, 128, local164 - local160 >> 1);
			local57.ca(local154 + local473 >> 1, 0, local160 + local164 >> 1);
			local57.method7344(local508, arg10);
		}
		if (arg7 != 0) {
			local57.D(arg7);
		}
		if (arg3 != 0) {
			local57.b(arg3);
		}
		if (arg4 != 0) {
			local57.ca(0, arg4, 0);
		}
		return local57;
	}
}
