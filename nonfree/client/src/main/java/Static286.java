import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Z")
	public static boolean aBoolean352 = true;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public static void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static132.anInt3684 = -1;
		Static61.anInt1168 = -1;
		@Pc(17) float local17 = (float) Static109.anInt4231 / (float) Static109.anInt4234;
		@Pc(19) int local19 = arg1;
		@Pc(21) int local21 = arg2;
		if (local17 < 1.0F) {
			local21 = (int) (local17 * (float) arg1);
		} else {
			local19 = (int) ((float) arg2 / local17);
		}
		@Pc(48) int local48 = arg3 - (arg1 - local19) / 2;
		@Pc(57) int local57 = arg0 - (arg2 - local21) / 2;
		Static125.anInt2557 = local48 * Static109.anInt4234 / local19;
		Static293.anInt5263 = Static109.anInt4231 * local57 / local21;
		Static257.method4079();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BC)Z")
	public static boolean method4393(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "()V")
	public static void method4394() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static153.aClass1_Sub33ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static153.aClass1_Sub33ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static153.anInt3006; local9++) {
					for (local14 = 0; local14 < Static285.anInt5122; local14++) {
						Static153.aClass1_Sub33ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static297.aClass1_Sub31ArrayArray3 = null;
		if (Static229.aClass1_Sub33ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static229.aClass1_Sub33ArrayArrayArray4.length; local3++) {
				for (local9 = 0; local9 < Static153.anInt3006; local9++) {
					for (local14 = 0; local14 < Static285.anInt5122; local14++) {
						Static229.aClass1_Sub33ArrayArrayArray4[local3][local9][local14] = null;
					}
				}
			}
		}
		Static167.aClass1_Sub31ArrayArray2 = null;
		Static116.anInt2465 = 0;
		if (Static255.aClass91Array2 != null) {
			for (local3 = 0; local3 < Static116.anInt2465; local3++) {
				Static255.aClass91Array2[local3] = null;
			}
		}
		if (Static220.aClass161Array1 != null) {
			for (local3 = 0; local3 < Static95.anInt1928; local3++) {
				Static220.aClass161Array1[local3] = null;
			}
			Static95.anInt1928 = 0;
		}
		if (Static238.aClass161Array2 != null) {
			for (local3 = 0; local3 < Static238.aClass161Array2.length; local3++) {
				Static238.aClass161Array2[local3] = null;
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[F")
	public static float[] method4395(@OriginalArg(0) int arg0) {
		@Pc(7) float local7 = Static283.method4359() + Static283.method4357();
		@Pc(9) int local9 = Static283.method4355();
		Static155.aFloatArray11[3] = 1.0F;
		@Pc(27) float local27 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(36) float local36 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(43) float local43 = (float) (local9 & 0xFF) / 255.0F;
		@Pc(45) float local45 = 0.58823526F;
		Static155.aFloatArray11[2] = local43 * ((float) (arg0 & 0xFF) / 255.0F) * local45 * local7;
		Static155.aFloatArray11[0] = local7 * local27 * ((float) (arg0 >> 16 & 0xFF) / 255.0F) * local45;
		Static155.aFloatArray11[1] = local7 * (float) (arg0 >> 8 & 0xFF) / 255.0F * local36 * local45;
		return Static155.aFloatArray11;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!rj;B)V")
	public static void method4396(@OriginalArg(0) Class154 arg0) {
		@Pc(3) Class132 local3 = null;
		try {
			@Pc(12) Class185 local12 = arg0.method3893("runescape");
			while (local12.anInt5276 == 0) {
				Static282.method4345(1L);
			}
			if (local12.anInt5276 == 1) {
				local3 = (Class132) local12.anObject6;
				@Pc(34) Class1_Sub14 local34 = Static75.method1474();
				local3.method3352(local34.aByteArray17, local34.anInt1480, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local3 != null) {
				local3.method3356();
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIIILclient!ro;IIZLclient!bf;)Lclient!bf;")
	public static Class15_Sub2 method4397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class157 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) Class15_Sub2 arg12) {
		@Pc(23) long local23 = ((long) arg1 << 48) + ((long) arg9 << 32) + (long) ((arg0 << 16) + (arg3 - -(arg2 << 24)));
		@Pc(33) Class15_Sub2 local33 = (Class15_Sub2) Static11.aClass187_7.method4527(local23);
		@Pc(119) int local119;
		@Pc(121) int local121;
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(172) int local172;
		if (local33 == null) {
			@Pc(42) byte local42;
			if (arg3 == 1) {
				local42 = 9;
			} else if (arg3 == 2) {
				local42 = 12;
			} else if (arg3 == 3) {
				local42 = 15;
			} else if (arg3 == 4) {
				local42 = 18;
			} else {
				local42 = 21;
			}
			@Pc(90) int[] local90 = new int[] { 64, 96, 128 };
			@Pc(94) int[][] local94 = new int[3][local42];
			@Pc(113) Class15_Sub6 local113 = new Class15_Sub6(local42 * 3 + 1, -local42 + local42 * 2 * 3, 0);
			local119 = local113.method3774(0, 0);
			for (local121 = 0; local121 < 3; local121++) {
				local132 = local90[local121];
				local136 = local90[local121];
				for (@Pc(138) int local138 = 0; local138 < local42; local138++) {
					@Pc(151) int local151 = (local138 << 11) / local42;
					@Pc(161) int local161 = local136 * Class135.anIntArray338[local151] + arg10 >> 16;
					local172 = arg6 + local132 * Class135.anIntArray335[local151] >> 16;
					local94[local121][local138] = local113.method3774(local172, local161);
				}
			}
			for (local121 = 0; local121 < 3; local121++) {
				local132 = (local121 * 256 + 128) / 3;
				local136 = 256 - local132;
				@Pc(250) short local250 = (short) (((arg1 & 0xFC00) * local132 + local136 * (arg9 & 0xFC00) & 0xFC0000) + ((arg1 & 0x380) * local132 + (arg9 & 0x380) * local136 & 0x38000) + (local132 * (arg1 & 0x7F) + local136 * (arg9 & 0x7F) & 0x7F00) >> 8);
				@Pc(261) byte local261 = (byte) (local136 * arg0 + arg2 * local132 >> 8);
				for (local172 = 0; local172 < local42; local172++) {
					if (local121 == 0) {
						local113.method3761(local119, local94[0][(local172 + 1) % local42], local94[0][local172], local250, local261);
					} else {
						local113.method3761(local94[local121 - 1][local172], local94[local121 - 1][(local172 + 1) % local42], local94[local121][(local172 + 1) % local42], local250, local261);
						local113.method3761(local94[local121 - 1][local172], local94[local121][(local172 + 1) % local42], local94[local121][local172], local250, local261);
					}
				}
			}
			local33 = local113.method3760(64, 768, -50, -10, -50);
			Static11.aClass187_7.method4524(local23, local33);
		}
		@Pc(381) int local381 = arg3 * 64 - 1;
		@Pc(384) int local384 = -local381;
		@Pc(387) int local387 = -local381;
		@Pc(389) int local389 = local381;
		local119 = local381;
		if (arg11) {
			if (arg7 > 1664 || arg7 < 384) {
				local387 -= 128;
			}
			if (arg7 > 128 && arg7 < 896) {
				local384 -= 128;
			}
			if (arg7 > 1152 && arg7 < 1920) {
				local389 = local381 + 128;
			}
			if (arg7 > 640 && arg7 < 1408) {
				local119 = local381 + 128;
			}
		}
		@Pc(439) int local439 = arg12.method1039();
		local121 = arg12.method1033();
		local132 = arg12.method1031();
		if (local387 > local132) {
			local132 = local387;
		}
		if (local439 < local384) {
			local439 = local384;
		}
		if (local121 > local389) {
			local121 = local389;
		}
		local136 = arg12.method1018();
		if (local119 < local136) {
			local136 = local119;
		}
		@Pc(484) Class1_Sub2_Sub22 local484 = null;
		if (arg8 != null) {
			@Pc(493) int local493 = arg8.anIntArray396[arg4];
			local484 = Static48.method901(local493 >> 16);
			arg4 = local493 & 0xFFFF;
		}
		if (local484 == null) {
			local33 = local33.method1032(true, true, true);
			local33.method1040((local121 - local439) / 2, 128, (local136 - local132) / 2);
			local33.method1028((local121 + local439) / 2, 0, (local132 + local136) / 2);
		} else {
			local33 = local33.method1032(!local484.method4391(arg4), !local484.method4388(arg4), true);
			local33.method1040((local121 - local439) / 2, 128, (local136 - local132) / 2);
			local33.method1028((local439 + local121) / 2, 0, (local132 + local136) / 2);
			local33.method1026(local484, arg4);
		}
		if (arg7 != 0) {
			local33.method1034(arg7);
		}
		if (Static156.aBoolean211) {
			@Pc(681) Class15_Sub2_Sub1 local681 = (Class15_Sub2_Sub1) local33;
			if (Static69.method4275(arg10 + local132, Static65.anInt1300, local439 + arg6) != arg5 || arg5 != Static69.method4275(arg10 + local136, Static65.anInt1300, arg6 + local121)) {
				for (local172 = 0; local172 < local681.anInt923; local172++) {
					local681.anIntArray51[local172] += Static69.method4275(arg10 + local681.anIntArray49[local172], Static65.anInt1300, local681.anIntArray53[local172] + arg6) - arg5;
				}
				local681.aClass33_2.aBoolean52 = false;
				local681.aClass171_1.aBoolean339 = false;
			}
		} else {
			@Pc(606) Class15_Sub2_Sub2 local606 = (Class15_Sub2_Sub2) local33;
			if (Static69.method4275(arg10 + local132, Static65.anInt1300, arg6 + local439) != arg5 || arg5 != Static69.method4275(arg10 + local136, Static65.anInt1300, local121 + arg6)) {
				for (local172 = 0; local172 < local606.anInt1114; local172++) {
					local606.anIntArray69[local172] += Static69.method4275(local606.anIntArray71[local172] + arg10, Static65.anInt1300, local606.anIntArray70[local172] + arg6) - arg5;
				}
				local606.aBoolean63 = false;
			}
		}
		return local33;
	}
}
