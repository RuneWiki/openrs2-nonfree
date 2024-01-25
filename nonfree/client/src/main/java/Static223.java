import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!jda", name = "H", descriptor = "Lclient!kr;")
	public static Class171 aClass171_77;

	@OriginalMember(owner = "client!jda", name = "L", descriptor = "I")
	public static int anInt4452;

	@OriginalMember(owner = "client!jda", name = "N", descriptor = "[I")
	public static final int[] anIntArray437 = new int[2];

	@OriginalMember(owner = "client!jda", name = "W", descriptor = "I")
	public static int anInt4462 = 0;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(I)V")
	public static void method3876() {
		Static409.method6080(Static513.aClass122_10, (long) Static436.anInt6850);
		if (Static170.anInt3050 != -1) {
			Static383.method4918(Static170.anInt3050);
		}
		for (@Pc(19) int local19 = 0; local19 < Static422.anInt7388; local19++) {
			if (Static3.aBooleanArray1[local19]) {
				Static236.aBooleanArray29[local19] = true;
			}
			Static389.aBooleanArray42[local19] = Static3.aBooleanArray1[local19];
			Static3.aBooleanArray1[local19] = false;
		}
		Static546.anInt2819 = Static436.anInt6850;
		if (Static513.aClass122_10.method7267()) {
			Static305.aBoolean408 = true;
		}
		if (Static170.anInt3050 != -1) {
			Static422.anInt7388 = 0;
			Static306.method4839();
		}
		Static513.aClass122_10.n();
		Static106.method1795(Static513.aClass122_10);
		@Pc(80) int local80 = Static87.method1481();
		if (local80 == -1) {
			local80 = Static108.anInt2198;
		}
		if (local80 == -1) {
			local80 = Static457.anInt7785;
		}
		Static210.method3586(local80);
		Static152.anInt2791 = 0;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method3882(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) int local14 = arg2 % 8;
		@Pc(24) int local24;
		if (local14 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local14;
		}
		@Pc(38) int local38 = -((arg3 + 7) / 8);
		@Pc(48) int local48 = -((arg2 + 8 - 1) / 8);
		for (@Pc(50) int local50 = local38; local50 < 0; local50++) {
			for (@Pc(54) int local54 = local48; local54 < 0; local54++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local24;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!na;ILclient!qa;IIIIIIIIIIILclient!r;)Lclient!r;")
	public static Class145 method3885(@OriginalArg(0) Class199 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class145 arg13) {
		if (arg13 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg0 != null) {
			local11 = arg0.method4874(arg3, false, -1) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg7 << 32) + (long) ((arg8 << 24) + (arg10 << 16) + arg4) + ((long) arg5 << 48);
		@Pc(49) Class313 local49 = Static286.aClass313_31;
		@Pc(57) Class145 local57;
		synchronized (Static286.aClass313_31) {
			local57 = (Class145) Static286.aClass313_31.method7406(local47);
		}
		@Pc(148) int local148;
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(164) int local164;
		if (local57 == null || arg2.method7225(local57.ba(), local11) != 0) {
			if (local57 != null) {
				local11 = arg2.method7241(local11, local57.ba());
			}
			@Pc(95) byte local95;
			if (arg4 == 1) {
				local95 = 9;
			} else if (arg4 == 2) {
				local95 = 12;
			} else if (arg4 == 3) {
				local95 = 15;
			} else if (arg4 == 4) {
				local95 = 18;
			} else {
				local95 = 21;
			}
			@Pc(124) int[] local124 = new int[] { 64, 96, 128 };
			@Pc(141) Class97 local141 = new Class97(local95 * 3 + 1, local95 * 2 * 3 - local95, 0);
			local148 = local141.method2307(0, 0, 0);
			@Pc(152) int[][] local152 = new int[3][local95];
			@Pc(166) int local166;
			@Pc(190) int local190;
			for (local154 = 0; local154 < 3; local154++) {
				local160 = local124[local154];
				local164 = local124[local154];
				for (local166 = 0; local166 < local95; local166++) {
					@Pc(174) int local174 = (local166 << 14) / local95;
					@Pc(182) int local182 = local160 * Class310.anIntArray827[local174] >> 14;
					local190 = Class310.anIntArray826[local174] * local164 >> 14;
					local152[local154][local166] = local141.method2307(local190, 0, local182);
				}
			}
			for (local160 = 0; local160 < 3; local160++) {
				local164 = (local160 * 256 + 128) / 3;
				local166 = 256 - local164;
				@Pc(241) byte local241 = (byte) (local166 * arg10 + local164 * arg8 >> 8);
				@Pc(286) short local286 = (short) (((arg5 & 0x7F) * local164 + (arg7 & 0x7F) * local166 & 0x7F00) + (local164 * (arg5 & 0x380) + local166 * (arg7 & 0x380) & 0x38000) + (local164 * (arg5 & 0xFC00) + local166 * (arg7 & 0xFC00) & 0xFC0000) >> 8);
				for (local190 = 0; local190 < local95; local190++) {
					if (local160 == 0) {
						local141.method2321(local152[0][(local190 + 1) % local95], local286, (byte) 1, local152[0][local190], (byte) -1, local241, (short) -1, local148);
					} else {
						local141.method2321(local152[local160 - 1][(local190 + 1) % local95], local286, (byte) 1, local152[local160][(local190 + 1) % local95], (byte) -1, local241, (short) -1, local152[local160 - 1][local190]);
						local141.method2321(local152[local160][(local190 + 1) % local95], local286, (byte) 1, local152[local160][local190], (byte) -1, local241, (short) -1, local152[local160 - 1][local190]);
					}
				}
			}
			local57 = arg2.method7280(local141, local11, Static155.anInt2827, 64, 768);
			@Pc(409) Class313 local409 = Static286.aClass313_31;
			synchronized (Static286.aClass313_31) {
				Static286.aClass313_31.method7399(local47, local57);
			}
		}
		@Pc(428) int local428 = (arg4 << 8) - 1;
		@Pc(431) int local431 = -local428;
		@Pc(434) int local434 = -local428;
		@Pc(436) int local436 = local428;
		local148 = local428;
		if (arg9 != 0) {
			if ((arg9 & 0x1) != 0) {
				local148 = local428 + 512;
			}
			if ((arg9 & 0x8) != 0) {
				local431 -= 512;
			}
			if ((arg9 & 0x4) != 0) {
				local436 = local428 + 512;
			}
			if ((arg9 & 0x2) != 0) {
				local434 -= 512;
			}
		}
		@Pc(475) int local475 = arg13.wa();
		local154 = arg13.va();
		local160 = arg13.Q();
		if (local475 < local431) {
			local475 = local431;
		}
		if (local160 < local434) {
			local160 = local434;
		}
		if (local154 > local436) {
			local154 = local436;
		}
		local164 = arg13.U();
		if (local164 > local148) {
			local164 = local148;
		}
		@Pc(518) Class1_Sub1_Sub6 local518 = null;
		if (arg0 != null) {
			@Pc(530) int local530 = arg0.anIntArray574[arg3];
			local518 = Static182.aClass218_1.method5222(local530 >> 16);
			arg3 = local530 & 0xFFFF;
		}
		if (local518 == null) {
			local57 = local57.method6672((byte) 3, local11, true);
			local57.V(local154 - local475 >> 1, 128, local164 - local160 >> 1);
			local57.ca(local154 + local475 >> 1, 0, local164 + local160 >> 1);
		} else {
			local57 = local57.method6672((byte) 3, local11, true);
			local57.V(local154 - local475 >> 1, 128, local164 - local160 >> 1);
			local57.ca(local475 + local154 >> 1, 0, local160 + local164 >> 1);
			local57.method6689(arg3, local518);
		}
		if (arg11 != 0) {
			local57.D(arg11);
		}
		if (arg12 != 0) {
			local57.b(arg12);
		}
		if (arg6 != 0) {
			local57.ca(0, arg6, 0);
		}
		return local57;
	}
}
