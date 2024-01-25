import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bu", name = "D", descriptor = "Lclient!eq;")
	public static Class97 aClass97_7;

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIILclient!ka;Lclient!ha;IIIIIIIILclient!hn;)Lclient!ka;")
	public static Class25 method993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class25 arg3, @OriginalArg(4) Class87 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class149 arg12) {
		if (arg3 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg12 != null) {
			local11 = arg12.method3741(-1, arg7, false) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(47) long local47 = ((long) arg1 << 32) + (long) (arg2 + (arg0 << 16) + (arg9 << 24)) + ((long) arg11 << 48);
		@Pc(54) Class233 local54 = Static522.aClass233_51;
		@Pc(62) Class25 local62;
		synchronized (Static522.aClass233_51) {
			local62 = (Class25) Static522.aClass233_51.method5669(local47);
		}
		if (local62 == null || arg4.method7950(local62.ua(), local11) != 0) {
			if (local62 != null) {
				local11 = arg4.method7952(local11, local62.ua());
			}
			@Pc(97) byte local97;
			if (arg2 == 1) {
				local97 = 9;
			} else if (arg2 == 2) {
				local97 = 12;
			} else if (arg2 == 3) {
				local97 = 15;
			} else if (arg2 == 4) {
				local97 = 18;
			} else {
				local97 = 21;
			}
			@Pc(129) int[] local129 = new int[] { 64, 96, 128 };
			@Pc(147) Class379 local147 = new Class379(local97 * 3 + 1, local97 * 6 - local97, 0);
			@Pc(154) int local154 = local147.method8589(0, 0, 0);
			@Pc(158) int[][] local158 = new int[3][local97];
			@Pc(166) int local166;
			@Pc(170) int local170;
			@Pc(172) int local172;
			@Pc(196) int local196;
			for (@Pc(160) int local160 = 0; local160 < 3; local160++) {
				local166 = local129[local160];
				local170 = local129[local160];
				for (local172 = 0; local172 < local97; local172++) {
					@Pc(180) int local180 = (local172 << 14) / local97;
					@Pc(188) int local188 = Class353.anIntArray681[local180] * local166 >> 14;
					local196 = Class353.anIntArray682[local180] * local170 >> 14;
					local158[local160][local172] = local147.method8589(local188, 0, local196);
				}
			}
			for (local166 = 0; local166 < 3; local166++) {
				local170 = (local166 * 256 + 128) / 3;
				local172 = 256 - local170;
				@Pc(242) byte local242 = (byte) (arg0 * local172 + arg9 * local170 >> 8);
				@Pc(287) short local287 = (short) (((arg11 & 0x7F) * local170 + (arg1 & 0x7F) * local172 & 0x7F00) + (local172 * (arg1 & 0xFC00) + (arg11 & 0xFC00) * local170 & 0xFC0000) + (local170 * (arg11 & 0x380) + (arg1 & 0x380) * local172 & 0x38000) >> 8);
				for (local196 = 0; local196 < local97; local196++) {
					if (local166 == 0) {
						local147.method8592(local158[0][local196], local154, (short) -1, (byte) -1, local287, local158[0][(local196 + 1) % local97], (byte) 1, local242);
					} else {
						local147.method8592(local158[local166][(local196 + 1) % local97], local158[local166 - 1][local196], (short) -1, (byte) -1, local287, local158[local166 - 1][(local196 + 1) % local97], (byte) 1, local242);
						local147.method8592(local158[local166][local196], local158[local166 - 1][local196], (short) -1, (byte) -1, local287, local158[local166][(local196 + 1) % local97], (byte) 1, local242);
					}
				}
			}
			local62 = arg4.method7975(local147, local11, Static287.anInt5401, 64, 768);
			@Pc(414) Class233 local414 = Static522.aClass233_51;
			synchronized (Static522.aClass233_51) {
				Static522.aClass233_51.method5662(local62, local47);
			}
		}
		@Pc(430) int local430 = arg3.V();
		@Pc(433) int local433 = arg3.RA();
		@Pc(436) int local436 = arg3.HA();
		@Pc(439) int local439 = arg3.G();
		@Pc(441) Class2_Sub5_Sub5 local441 = null;
		if (arg12 != null) {
			@Pc(448) int local448 = arg12.anIntArray308[arg7];
			local441 = Static185.aClass303_1.method7206(local448 >> 16);
			arg7 = local448 & 0xFFFF;
		}
		if (local441 == null) {
			local62 = local62.method7732((byte) 3, local11, true);
			local62.O(local433 - local430 >> 1, 128, local439 - local436 >> 1);
			local62.H(local433 + local430 >> 1, 0, local436 + local439 >> 1);
		} else {
			local62 = local62.method7732((byte) 3, local11, true);
			local62.O(local433 - local430 >> 1, 128, local439 - local436 >> 1);
			local62.H(local430 + local433 >> 1, 0, local439 + local436 >> 1);
			local62.method7720(local441, arg7);
		}
		if (arg8 != 0) {
			local62.FA(arg8);
		}
		if (arg10 != 0) {
			local62.VA(arg10);
		}
		if (arg6 != 0) {
			local62.H(0, arg6, 0);
		}
		return local62;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZII)I")
	public static int method996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = 0;
		while (arg1 > 0) {
			local13 = arg0 & 0x1 | local13 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local13;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)V")
	public static void method997(@OriginalArg(1) int arg0) {
		if (arg0 == Static538.anInt8985) {
			return;
		}
		if (arg0 == 13) {
			if (Static473.aString74 == null) {
				Static254.method4192(Static288.anInt5415, Static213.aString15, Static187.aString46);
			} else {
				Static93.method1624(Static288.anInt5415);
			}
		}
		if (arg0 != 13 && Static536.aClass210_2 != null) {
			Static536.aClass210_2.method8030();
			Static536.aClass210_2 = null;
		}
		if (arg0 == 3) {
			Static161.method3023(Static387.anInt6978 != Static276.anInt5310);
		}
		if (arg0 == 7) {
			Static254.method4191(Static485.anInt8300 != Static387.anInt6978);
		}
		if (arg0 == 5) {
			if (Static473.aString74 == null) {
				Static438.method6519(Static187.aString46, Static213.aString15);
			} else {
				Static603.method8367();
			}
		} else if (arg0 == 6) {
			if (Static473.aString74 == null) {
				Static254.method4192(Static288.anInt5415, Static213.aString15, Static187.aString46);
			} else {
				Static93.method1624(Static288.anInt5415);
			}
		} else if (arg0 == 9) {
			if (Static473.aString74 == null) {
				Static254.method4192(Static288.anInt5415, Static213.aString15, Static187.aString46);
			} else {
				Static93.method1624(Static288.anInt5415);
			}
		} else if (arg0 == 12) {
			if (Static473.aString74 == null) {
				Static438.method6519(Static187.aString46, Static213.aString15);
			} else {
				Static603.method8367();
			}
		}
		if (Static201.method3526(Static538.anInt8985)) {
			Static104.aClass97_26.anInt3014 = 2;
			Static410.aClass97_101.anInt3014 = 2;
			Static95.aClass97_21.anInt3014 = 2;
			Static377.aClass97_96.anInt3014 = 2;
			Static64.aClass97_12.anInt3014 = 2;
			Static328.aClass97_84.anInt3014 = 2;
			Static282.aClass97_70.anInt3014 = 2;
		}
		if (Static201.method3526(arg0)) {
			Static512.anInt8593 = 0;
			Static45.anInt6807 = 1;
			Static291.anInt5468 = 1;
			Static491.anInt8369 = 0;
			Static219.anInt4548 = 0;
			Static328.method4913(true);
			Static104.aClass97_26.anInt3014 = 1;
			Static410.aClass97_101.anInt3014 = 1;
			Static95.aClass97_21.anInt3014 = 1;
			Static377.aClass97_96.anInt3014 = 1;
			Static64.aClass97_12.anInt3014 = 1;
			Static328.aClass97_84.anInt3014 = 1;
			Static282.aClass97_70.anInt3014 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static423.method8399();
		}
		@Pc(222) boolean local222 = arg0 == 2 || Static630.method8481(arg0) || Static562.method7785(arg0);
		@Pc(237) boolean local237 = Static538.anInt8985 == 2 || Static630.method8481(Static538.anInt8985) || Static562.method7785(Static538.anInt8985);
		if (local222 != local237) {
			if (local222) {
				Static125.anInt2929 = Static80.anInt1719;
				if (Static404.aClass2_Sub13_2.aClass33_Sub1_3.method810() == 0) {
					Static1.method5545();
				} else {
					Static515.method7244(Static80.anInt1719, Static404.aClass2_Sub13_2.aClass33_Sub1_3.method810(), Static536.aClass97_133);
					Static15.method320();
				}
				Static252.aClass190_1.method4602(false);
			} else {
				Static1.method5545();
				Static252.aClass190_1.method4602(true);
			}
		}
		if (Static201.method3526(arg0) || arg0 == 13) {
			Static600.aClass87_15.method7919();
		}
		Static538.anInt8985 = arg0;
	}
}
