import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public static int anInt2738;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!pk;")
	public static Class132 aClass132_50;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "[Z")
	public static boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
	public static int anInt2745;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt2741 = -1;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray13 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)J")
	public static long method2197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return 0L;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt4857; local13++) {
			@Pc(22) Class170 local22 = local7.aClass170Array3[local13];
			if ((local22.aLong196 >> 29 & 0x3L) == 2L && local22.anInt5463 == arg1 && local22.anInt5460 == arg2) {
				return local22.aLong196;
			}
		}
		return 0L;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!lk;I)V")
	public static void method2198(@OriginalArg(0) int arg0, @OriginalArg(1) Class36_Sub3 arg1) {
		if (Static183.anInt3590 < arg1.anInt4078) {
			Static232.method3543(arg1);
		} else if (arg1.anInt4096 >= Static183.anInt3590) {
			Static109.method1777(arg1);
		} else {
			Static23.method413(arg1);
		}
		if (arg1.anInt4117 < 128 || arg1.anInt4118 < 128 || arg1.anInt4117 >= 13184 || arg1.anInt4118 >= 13184) {
			arg1.anInt4125 = -1;
			arg1.anInt4096 = 0;
			arg1.anInt4107 = -1;
			arg1.anInt4078 = 0;
			arg1.anInt4117 = arg1.anIntArray310[0] * 128 + arg1.method3110() * 64;
			arg1.anInt4118 = arg1.anIntArray308[0] * 128 + arg1.method3110() * 64;
			arg1.method3102();
		}
		if (arg1 == Static21.aClass36_Sub3_Sub1_1 && (arg1.anInt4117 < 1536 || arg1.anInt4118 < 1536 || arg1.anInt4117 >= 11776 || arg1.anInt4118 >= 11776)) {
			arg1.anInt4107 = -1;
			arg1.anInt4125 = -1;
			arg1.anInt4078 = 0;
			arg1.anInt4096 = 0;
			arg1.anInt4117 = arg1.anIntArray310[0] * 128 + arg1.method3110() * 64;
			arg1.anInt4118 = arg1.anIntArray308[0] * 128 + arg1.method3110() * 64;
			arg1.method3102();
		}
		Static234.method3566(arg1);
		Static93.method1486(arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!aj;I)V")
	public static void method2202(@OriginalArg(0) Class8_Sub2 arg0) {
		label122: while (true) {
			if (arg0.anInt2955 < arg0.aByteArray24.length) {
				@Pc(21) boolean local21 = false;
				@Pc(23) int local23 = 0;
				@Pc(25) int local25 = 0;
				if (arg0.method2334() == 1) {
					local23 = arg0.method2334();
					local25 = arg0.method2334();
					local21 = true;
				}
				@Pc(44) int local44 = arg0.method2334();
				@Pc(48) int local48 = arg0.method2334();
				@Pc(54) int local54 = local44 * 64 - Static220.anInt4522;
				@Pc(65) int local65 = Static221.anInt4539 + Static140.anInt2782 - local48 * 64 - 1;
				@Pc(93) int local93;
				@Pc(97) int local97;
				if (local54 >= 0 && local65 - 63 >= 0 && Static156.anInt3157 > local54 + 63 && Static221.anInt4539 > local65) {
					local93 = local54 >> 6;
					local97 = local65 >> 6;
					@Pc(99) int local99 = 0;
					while (true) {
						if (local99 >= 64) {
							continue label122;
						}
						for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
							if (!local21 || local99 >= local23 * 8 && local23 * 8 + 8 > local99 && local25 * 8 <= local106 && local25 * 8 + 8 > local106) {
								@Pc(145) int local145 = arg0.method2334();
								if (local145 != 0) {
									@Pc(159) int local159;
									if ((local145 & 0x1) == 1) {
										local159 = arg0.method2334();
										if (Static141.aByteArrayArrayArray7[local93][local97] == null) {
											Static141.aByteArrayArrayArray7[local93][local97] = new byte[4096];
										}
										Static141.aByteArrayArrayArray7[local93][local97][(63 - local106 << 6) + local99] = (byte) local159;
									}
									if ((local145 & 0x2) == 2) {
										local159 = arg0.method2323();
										if (Static16.anIntArrayArrayArray8[local93][local97] == null) {
											Static16.anIntArrayArrayArray8[local93][local97] = new int[4096];
										}
										Static16.anIntArrayArrayArray8[local93][local97][(63 - local106 << 6) + local99] = local159;
									}
									if ((local145 & 0x4) == 4) {
										local159 = arg0.method2323();
										if (Static257.anIntArrayArrayArray15[local93][local97] == null) {
											Static257.anIntArrayArrayArray15[local93][local97] = new int[4096];
										}
										local159--;
										@Pc(259) Class70 local259 = Static235.method3578(local159);
										if (local259.anIntArray145 != null) {
											local259 = local259.method1575();
											if (local259 == null || local259.anInt2054 == -1) {
												continue;
											}
										}
										Static257.anIntArrayArrayArray15[local93][local97][(63 - local106 << 6) + local99] = local259.anInt2087 + 1;
										@Pc(300) Class8_Sub22 local300 = new Class8_Sub22();
										local300.anInt3445 = local65;
										local300.anInt3446 = local259.anInt2054;
										local300.anInt3441 = local54;
										Static245.aClass182_27.method4328(local300);
									}
								}
							}
						}
						local99++;
					}
				}
				local93 = 0;
				while (true) {
					if ((local21 ? 64 : 4096) <= local93) {
						continue label122;
					}
					local97 = arg0.method2334();
					if (local97 != 0) {
						if ((local97 & 0x1) == 1) {
							arg0.anInt2955++;
						}
						if ((local97 & 0x2) == 2) {
							arg0.anInt2955 += 2;
						}
						if ((local97 & 0x4) == 4) {
							arg0.anInt2955 += 3;
						}
					}
					local93++;
				}
			}
			return;
		}
	}
}
