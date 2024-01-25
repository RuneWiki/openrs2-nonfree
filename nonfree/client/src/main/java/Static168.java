import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public static int anInt3612 = 2;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BZ)I")
	public static int method3364(@OriginalArg(1) boolean arg0) {
		@Pc(15) long local15 = Static162.method3252();
		for (@Pc(27) Class1_Sub12 local27 = arg0 ? (Class1_Sub12) Static192.aClass197_17.method5161() : (Class1_Sub12) Static192.aClass197_17.method5154(); local27 != null; local27 = (Class1_Sub12) Static192.aClass197_17.method5154()) {
			if ((local27.aLong55 & 0x3FFFFFFFFFFFFFFFL) < local15) {
				if ((local27.aLong55 & 0x4000000000000000L) != 0L) {
					@Pc(58) int local58 = (int) local27.aLong213;
					Static30.anIntArray104[local58] = Static91.anIntArray217[local58];
					local27.method5628();
					return local58;
				}
				local27.method5628();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIIIZ[[[Lclient!sq;)Z")
	public static boolean method3368(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class194[][][] arg4) {
		@Pc(22) byte local22 = arg3 ? 1 : (byte) (Static247.anInt5067 & 0xFF);
		if (local22 == Static304.aByteArrayArrayArray10[Static242.anInt6745][arg0][arg2]) {
			return false;
		} else if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(51) byte local51 = 0;
			Static35.anIntArray100[0] = arg0;
			@Pc(57) int local57 = 0;
			@Pc(60) int local60 = local51 + 1;
			Static228.anIntArray427[0] = arg2;
			Static304.aByteArrayArrayArray10[Static242.anInt6745][arg0][arg2] = local22;
			while (local60 != local57) {
				@Pc(78) int local78 = Static35.anIntArray100[local57] & 0xFFFF;
				@Pc(86) int local86 = Static35.anIntArray100[local57] >> 16 & 0xFF;
				@Pc(94) int local94 = Static35.anIntArray100[local57] >> 24 & 0xFF;
				@Pc(100) int local100 = Static228.anIntArray427[local57] & 0xFFFF;
				@Pc(108) int local108 = Static228.anIntArray427[local57] >> 16 & 0xFF;
				local57 = local57 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static200.aByteArrayArrayArray8[Static242.anInt6745][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(172) int local172;
				@Pc(218) int local218;
				label231: for (@Pc(134) int local134 = Static242.anInt6745 + 1; local134 <= 3; local134++) {
					if ((Static200.aByteArrayArrayArray8[local134][local78][local100] & 0x8) == 0) {
						@Pc(320) Class17_Sub1 local320;
						@Pc(330) int local330;
						@Pc(309) Class194 local309;
						@Pc(315) Class126 local315;
						if (local116 && arg4[local134][local78][local100] != null) {
							if (arg4[local134][local78][local100].aClass17_Sub4_1 != null) {
								local172 = Static195.method3775(local86);
								if (local172 == arg4[local134][local78][local100].aClass17_Sub4_1.anInt4680 || arg4[local134][local78][local100].aClass17_Sub4_2 != null && local172 == arg4[local134][local78][local100].aClass17_Sub4_2.anInt4680) {
									continue;
								}
								if (local94 != 0) {
									local218 = Static195.method3775(local94);
									if (local218 == arg4[local134][local78][local100].aClass17_Sub4_1.anInt4680 || arg4[local134][local78][local100].aClass17_Sub4_2 != null && arg4[local134][local78][local100].aClass17_Sub4_2.anInt4680 == local218) {
										continue;
									}
								}
								if (local108 != 0) {
									local218 = Static195.method3775(local108);
									if (local218 == arg4[local134][local78][local100].aClass17_Sub4_1.anInt4680 || arg4[local134][local78][local100].aClass17_Sub4_2 != null && arg4[local134][local78][local100].aClass17_Sub4_2.anInt4680 == local218) {
										continue;
									}
								}
							}
							local309 = arg4[local134][local78][local100];
							if (local309.aClass126_2 != null) {
								for (local315 = local309.aClass126_2; local315 != null; local315 = local315.aClass126_1) {
									local320 = local315.aClass17_Sub1_1;
									if (local320 instanceof Interface5) {
										@Pc(326) Interface5 local326 = (Interface5) local320;
										local330 = local326.method4794();
										@Pc(334) int local334 = local326.method4797();
										if (local330 == 21) {
											local330 = 19;
										}
										@Pc(345) int local345 = local334 << 6 | local330;
										if (local86 == local345 || local94 != 0 && local94 == local345 || local108 != 0 && local108 == local345) {
											continue label231;
										}
									}
								}
							}
						}
						local309 = arg4[local134][local78][local100];
						if (local309 != null && local309.aClass126_2 != null) {
							for (local315 = local309.aClass126_2; local315 != null; local315 = local315.aClass126_1) {
								local320 = local315.aClass17_Sub1_1;
								if (local320.aShort75 != local320.aShort74 || local320.aShort76 != local320.aShort77) {
									for (@Pc(411) int local411 = local320.aShort75; local411 <= local320.aShort74; local411++) {
										for (local330 = local320.aShort77; local330 <= local320.aShort76; local330++) {
											Static304.aByteArrayArrayArray10[local134][local411][local330] = local22;
										}
									}
								}
							}
						}
						Static304.aByteArrayArrayArray10[local134][local78][local100] = local22;
						local130 = true;
					}
				}
				if (local130) {
					local172 = Static298.aClass53Array3[Static242.anInt6745 + 1].method2785(local78, local100);
					if (Static137.anIntArray266[arg1] < local172) {
						Static137.anIntArray266[arg1] = local172;
					}
					local218 = local78 << 7;
					if (local218 < Static96.anIntArray504[arg1]) {
						Static96.anIntArray504[arg1] = local218;
					} else if (Static173.anIntArray346[arg1] < local218) {
						Static173.anIntArray346[arg1] = local218;
					}
					@Pc(509) int local509 = local100 << 7;
					if (Static352.anIntArray531[arg1] > local509) {
						Static352.anIntArray531[arg1] = local509;
					} else if (Static185.anIntArray364[arg1] < local509) {
						Static185.anIntArray364[arg1] = local509;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 - 1][local100] != local22) {
						Static35.anIntArray100[local60] = local78 - 1 | 0xD3000000 | 0x120000;
						Static228.anIntArray427[local60] = local100 | 0x130000;
						Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 - 1][local100] = local22;
						local60 = local60 + 1 & 0xFFF;
					}
					local100++;
					if (local100 < Static134.anInt2971) {
						if (local78 - 1 >= 0 && Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 - 1][local100] != local22 && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78][local100] & 0x4) == 0 && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static35.anIntArray100[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static228.anIntArray427[local60] = local100 | 0x130000;
							Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 - 1][local100] = local22;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local22 != Static304.aByteArrayArrayArray10[Static242.anInt6745][local78][local100]) {
							Static35.anIntArray100[local60] = local78 | 0x13000000 | 0x520000;
							Static228.anIntArray427[local60] = local100 | 0x530000;
							Static304.aByteArrayArrayArray10[Static242.anInt6745][local78][local100] = local22;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static233.anInt5573 > local78 + 1 && local22 != Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 + 1][local100] && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78][local100] & 0x4) == 0 && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static35.anIntArray100[local60] = 0x92000000 | 0x520000 | local78 + 1;
							Static228.anIntArray427[local60] = local100 | 0x530000;
							Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 + 1][local100] = local22;
							local60 = local60 + 1 & 0xFFF;
						}
					}
					local100--;
					if (Static233.anInt5573 > local78 + 1 && local22 != Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 + 1][local100]) {
						Static35.anIntArray100[local60] = local78 + 1 | 0x53000000 | 0x920000;
						Static228.anIntArray427[local60] = local100 | 0x930000;
						local60 = local60 + 1 & 0xFFF;
						Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 + 1][local100] = local22;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 - 1][local100] != local22 && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78][local100] & 0x4) == 0 && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static35.anIntArray100[local60] = 0x12000000 | 0xD20000 | local78 - 1;
							Static228.anIntArray427[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 - 1][local100] = local22;
						}
						if (local22 != Static304.aByteArrayArrayArray10[Static242.anInt6745][local78][local100]) {
							Static35.anIntArray100[local60] = local78 | 0x93000000 | 0xD20000;
							Static228.anIntArray427[local60] = local100 | 0xD30000;
							Static304.aByteArrayArrayArray10[Static242.anInt6745][local78][local100] = local22;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static233.anInt5573 > local78 + 1 && local22 != Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 + 1][local100] && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78][local100] & 0x4) == 0 && (Static200.aByteArrayArrayArray8[Static242.anInt6745][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static35.anIntArray100[local60] = local78 + 1 | 0x920000 | 0xD2000000;
							Static228.anIntArray427[local60] = local100 | 0x930000;
							Static304.aByteArrayArrayArray10[Static242.anInt6745][local78 + 1][local100] = local22;
							local60 = local60 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static137.anIntArray266[arg1] != -1000000) {
				Static137.anIntArray266[arg1] += 10;
				Static96.anIntArray504[arg1] -= 50;
				Static173.anIntArray346[arg1] += 50;
				Static185.anIntArray364[arg1] += 50;
				Static352.anIntArray531[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IBI)V")
	public static void method3373(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class116 local15 = Static102.method2118(arg0);
		@Pc(18) int local18 = local15.anInt3530;
		@Pc(21) int local21 = local15.anInt3529;
		@Pc(24) int local24 = local15.anInt3531;
		@Pc(30) int local30 = Class1_Sub25.anIntArray365[local24 - local21];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local21;
		Static38.method909(local30 & arg1 << local21 | ~local30 & Static30.anIntArray104[local18], local18);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(3) Class105[] local3 = Static340.aClass105Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class105 local11 = local3[local5];
			if (local11 != null && local11.anInt3081 == 2) {
				Static147.method2934(arg1 >> 1, local11.anInt3077 + (local11.anInt3083 - Static32.anInt2224 << 7), local11.anInt3088 + (local11.anInt3086 + -Static234.anInt4783 << 7), local11.anInt3079 * 2, arg3 >> 1);
				if (Static22.anIntArray444[0] > -1 && Static5.anInt208 % 20 < 10) {
					Static228.aClass5Array17[local11.anInt3080].method3621(arg2 + Static22.anIntArray444[0] - 12, Static22.anIntArray444[1] + -28 + arg0);
				}
			}
		}
	}
}
