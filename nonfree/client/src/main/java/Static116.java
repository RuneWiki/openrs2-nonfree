import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!dr", name = "x", descriptor = "Lclient!pm;")
	public static Class284 aClass284_1;

	@OriginalMember(owner = "client!dr", name = "y", descriptor = "I")
	public static int anInt2119;

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "[B")
	public static byte[] aByteArray12;

	@OriginalMember(owner = "client!dr", name = "A", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "Lclient!ed;")
	public static final Class93 aClass93_3 = new Class93(6, 0, 4, 2);

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
	public static int anInt2120 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BI)V")
	public static void method1791(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub5_Sub20 local17 = Static447.method6065((long) arg0, 5);
		local17.method8834();
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static300.anInt5091 <= arg1 && Static629.anInt10412 >= arg5 && arg0 >= Static617.anInt6260 && arg2 <= Static229.anInt4089) {
			Static234.method3525(arg4, arg3, arg5, arg6, arg0, arg2, arg1);
		} else {
			Static78.method1309(arg5, arg6, arg0, arg4, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!ha;Lclient!mu;IIIIIILclient!ka;IIII)Lclient!ka;")
	public static Class149 method1793(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class149 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		if (arg8 == null) {
			return null;
		}
		@Pc(11) int local11 = 2055;
		if (arg2 != null) {
			local11 = arg2.method5383(false, -1, arg11) | 0x807;
			local11 &= 0xFFFFFDFF;
		}
		@Pc(54) long local54 = ((long) arg9 << 32) + (long) ((arg5 << 16) + arg3 + (arg4 << 24)) + ((long) arg12 << 48);
		@Pc(56) Class295 local56 = Static582.aClass295_66;
		@Pc(64) Class149 local64;
		synchronized (Static582.aClass295_66) {
			local64 = (Class149) Static582.aClass295_66.method6470(local54);
		}
		if (local64 == null || arg1.method8047(local64.ua(), local11) != 0) {
			if (local64 != null) {
				local11 = arg1.method8012(local11, local64.ua());
			}
			@Pc(104) byte local104;
			if (arg3 == 1) {
				local104 = 9;
			} else if (arg3 == 2) {
				local104 = 12;
			} else if (arg3 == 3) {
				local104 = 15;
			} else if (arg3 == 4) {
				local104 = 18;
			} else {
				local104 = 21;
			}
			@Pc(138) int[] local138 = new int[] { 64, 96, 128 };
			@Pc(156) Class134 local156 = new Class134(local104 * 3 + 1, 2 * 3 * local104 + -local104, 0);
			@Pc(163) int local163 = local156.method3061(0, 0, 0);
			@Pc(167) int[][] local167 = new int[3][local104];
			@Pc(175) int local175;
			@Pc(179) int local179;
			@Pc(181) int local181;
			@Pc(205) int local205;
			for (@Pc(169) int local169 = 0; local169 < 3; local169++) {
				local175 = local138[local169];
				local179 = local138[local169];
				for (local181 = 0; local181 < local104; local181++) {
					@Pc(189) int local189 = (local181 << 14) / local104;
					@Pc(197) int local197 = Class94.anIntArray561[local189] * local175 >> 14;
					local205 = Class94.anIntArray560[local189] * local179 >> 14;
					local167[local169][local181] = local156.method3061(local205, 0, local197);
				}
			}
			for (local175 = 0; local175 < 3; local175++) {
				local179 = (local175 * 256 + 128) / 3;
				local181 = 256 - local179;
				@Pc(256) byte local256 = (byte) (local179 * arg4 + arg5 * local181 >> 8);
				@Pc(301) short local301 = (short) (((arg9 & 0x7F) * local181 + local179 * (arg12 & 0x7F) & 0x7F00) + ((arg12 & 0xFC00) * local179 + local181 * (arg9 & 0xFC00) & 0xFC0000) + (local179 * (arg12 & 0x380) + local181 * (arg9 & 0x380) & 0x38000) >> 8);
				for (local205 = 0; local205 < local104; local205++) {
					if (local175 == 0) {
						local156.method3054((byte) -1, (byte) 1, local256, (short) -1, local301, local163, local167[0][local205], local167[0][(local205 + 1) % local104]);
					} else {
						local156.method3054((byte) -1, (byte) 1, local256, (short) -1, local301, local167[local175 - 1][local205], local167[local175][(local205 + 1) % local104], local167[local175 - 1][(local205 + 1) % local104]);
						local156.method3054((byte) -1, (byte) 1, local256, (short) -1, local301, local167[local175 - 1][local205], local167[local175][local205], local167[local175][(local205 + 1) % local104]);
					}
				}
			}
			local64 = arg1.method8021(local156, local11, Static599.anInt7771, 64, 768);
			@Pc(425) Class295 local425 = Static582.aClass295_66;
			synchronized (Static582.aClass295_66) {
				Static582.aClass295_66.method6469(local54, local64);
			}
		}
		@Pc(443) int local443 = arg8.V();
		@Pc(446) int local446 = arg8.RA();
		@Pc(449) int local449 = arg8.HA();
		@Pc(452) int local452 = arg8.G();
		@Pc(454) Class3_Sub5_Sub3 local454 = null;
		if (arg2 != null) {
			@Pc(461) int local461 = arg2.anIntArray339[arg11];
			local454 = Static13.aClass213_1.method5001(local461 >> 16);
			arg11 = local461 & 0xFFFF;
		}
		if (local454 == null) {
			local64 = local64.method8858((byte) 3, local11, true);
			local64.O(local446 - local443 >> 1, 128, local452 - local449 >> 1);
			local64.H(local443 + local446 >> 1, 0, local449 + local452 >> 1);
		} else {
			local64 = local64.method8858((byte) 3, local11, true);
			local64.O(local446 - local443 >> 1, 128, local452 - local449 >> 1);
			local64.H(local443 + local446 >> 1, 0, local452 + local449 >> 1);
			local64.method8863(local454, arg11);
		}
		if (arg10 != 0) {
			local64.FA(arg10);
		}
		if (arg6 != 0) {
			local64.VA(arg6);
		}
		if (arg7 != 0) {
			local64.H(0, arg7, 0);
		}
		return local64;
	}
}
