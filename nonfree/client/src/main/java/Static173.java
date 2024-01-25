import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "[S")
	public static short[] aShortArray46;

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
	public static int anInt3141 = 0;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "[I")
	public static final int[] anIntArray293 = new int[14];

	@OriginalMember(owner = "client!gga", name = "o", descriptor = "Lclient!dg;")
	public static final Class72 aClass72_4 = new Class72();

	@OriginalMember(owner = "client!gga", name = "p", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[200];

	@OriginalMember(owner = "client!gga", name = "q", descriptor = "I")
	public static int anInt3149 = 0;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)Z")
	public static boolean method2703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)Z")
	public static boolean method2706(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!Static266.aBoolean351) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static360.aClass97ArrayArray2[local13] == null || Static360.aClass97ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(43) Class97 local43 = Static360.aClass97ArrayArray2[local13][local17];
		@Pc(55) Class6_Sub26 local55;
		if (arg0 == -1 && local43.anInt2637 == 0) {
			for (local55 = (Class6_Sub26) Static408.aClass298_154.method6809(); local55 != null; local55 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
				if (local55.anInt5472 == 5 || local55.anInt5472 == 1012 || local55.anInt5472 == 23 || local55.anInt5472 == 60 || local55.anInt5472 == 50) {
					for (@Pc(141) Class97 local141 = Static495.method7281(local55.anInt5473); local141 != null; local141 = Static464.method6495(local141)) {
						if (local141.anInt2678 == local43.anInt2678) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class6_Sub26) Static408.aClass298_154.method6809(); local55 != null; local55 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
				if (arg0 == local55.anInt5468 && local43.anInt2678 == local55.anInt5473 && (local55.anInt5472 == 5 || local55.anInt5472 == 1012 || local55.anInt5472 == 23 || local55.anInt5472 == 60 || local55.anInt5472 == 50)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[[[Lclient!hl;ZIIB)Z")
	public static boolean method2707(@OriginalArg(0) int arg0, @OriginalArg(1) Class133[][][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static114.anInt1963 & 0xFF);
		if (local14 == Static289.aByteArrayArrayArray7[Static391.anInt7128][arg3][arg0]) {
			return false;
		} else if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(51) byte local51 = 0;
			Static380.anIntArray493[0] = arg3;
			@Pc(57) int local57 = 0;
			@Pc(60) int local60 = local51 + 1;
			Static188.anIntArray2[0] = arg0;
			Static289.aByteArrayArrayArray7[Static391.anInt7128][arg3][arg0] = local14;
			while (local60 != local57) {
				@Pc(78) int local78 = Static380.anIntArray493[local57] & 0xFFFF;
				@Pc(86) int local86 = Static380.anIntArray493[local57] >> 16 & 0xFF;
				@Pc(94) int local94 = Static380.anIntArray493[local57] >> 24 & 0xFF;
				@Pc(100) int local100 = Static188.anIntArray2[local57] & 0xFFFF;
				@Pc(108) int local108 = Static188.anIntArray2[local57] >> 16 & 0xFF;
				local57 = local57 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static267.aByteArrayArrayArray8[Static391.anInt7128][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(169) int local169;
				@Pc(219) int local219;
				label231: for (@Pc(134) int local134 = Static391.anInt7128 + 1; local134 <= 3; local134++) {
					if ((Static267.aByteArrayArrayArray8[local134][local78][local100] & 0x8) == 0) {
						@Pc(318) Class15_Sub2 local318;
						@Pc(328) int local328;
						@Pc(307) Class133 local307;
						@Pc(313) Class315 local313;
						if (local116 && arg1[local134][local78][local100] != null) {
							if (arg1[local134][local78][local100].aClass15_Sub1_2 != null) {
								local169 = Static517.method7071(local86);
								if (local169 == arg1[local134][local78][local100].aClass15_Sub1_2.anInt5701 || arg1[local134][local78][local100].aClass15_Sub1_1 != null && local169 == arg1[local134][local78][local100].aClass15_Sub1_1.anInt5701) {
									continue;
								}
								if (local94 != 0) {
									local219 = Static517.method7071(local94);
									if (local219 == arg1[local134][local78][local100].aClass15_Sub1_2.anInt5701 || arg1[local134][local78][local100].aClass15_Sub1_1 != null && arg1[local134][local78][local100].aClass15_Sub1_1.anInt5701 == local219) {
										continue;
									}
								}
								if (local108 != 0) {
									local219 = Static517.method7071(local108);
									if (arg1[local134][local78][local100].aClass15_Sub1_2.anInt5701 == local219 || arg1[local134][local78][local100].aClass15_Sub1_1 != null && arg1[local134][local78][local100].aClass15_Sub1_1.anInt5701 == local219) {
										continue;
									}
								}
							}
							local307 = arg1[local134][local78][local100];
							if (local307.aClass315_1 != null) {
								for (local313 = local307.aClass315_1; local313 != null; local313 = local313.aClass315_3) {
									local318 = local313.aClass15_Sub2_2;
									if (local318 instanceof Interface22) {
										@Pc(324) Interface22 local324 = (Interface22) local318;
										local328 = local324.method7176();
										if (local328 == 21) {
											local328 = 19;
										}
										@Pc(337) int local337 = local324.method7175();
										@Pc(343) int local343 = local337 << 6 | local328;
										if (local343 == local86 || local94 != 0 && local343 == local94 || local108 != 0 && local343 == local108) {
											continue label231;
										}
									}
								}
							}
						}
						local307 = arg1[local134][local78][local100];
						if (local307 != null && local307.aClass315_1 != null) {
							for (local313 = local307.aClass315_1; local313 != null; local313 = local313.aClass315_3) {
								local318 = local313.aClass15_Sub2_2;
								if (local318.aShort115 != local318.aShort116 || local318.aShort114 != local318.aShort117) {
									for (@Pc(415) int local415 = local318.aShort116; local415 <= local318.aShort115; local415++) {
										for (local328 = local318.aShort114; local328 <= local318.aShort117; local328++) {
											Static289.aByteArrayArrayArray7[local134][local415][local328] = local14;
										}
									}
								}
							}
						}
						Static289.aByteArrayArrayArray7[local134][local78][local100] = local14;
						local130 = true;
					}
				}
				if (local130) {
					local169 = Static205.aClass46Array1[Static391.anInt7128 + 1].JA(local78, local100);
					if (Static471.anIntArray579[arg4] < local169) {
						Static471.anIntArray579[arg4] = local169;
					}
					local219 = local78 << 9;
					if (Static443.anIntArray562[arg4] > local219) {
						Static443.anIntArray562[arg4] = local219;
					} else if (Static103.anIntArray152[arg4] < local219) {
						Static103.anIntArray152[arg4] = local219;
					}
					@Pc(521) int local521 = local100 << 9;
					if (local521 < Static435.anIntArray555[arg4]) {
						Static435.anIntArray555[arg4] = local521;
					} else if (Static249.anIntArray376[arg4] < local521) {
						Static249.anIntArray376[arg4] = local521;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 - 1][local100] != local14) {
						Static380.anIntArray493[local60] = local78 - 1 | 0xD3000000 | 0x120000;
						Static188.anIntArray2[local60] = local100 | 0x130000;
						Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 - 1][local100] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local100++;
					if (local100 < Static80.anInt1367) {
						if (local78 - 1 >= 0 && local14 != Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 - 1][local100] && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78][local100] & 0x4) == 0 && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static380.anIntArray493[local60] = local78 - 1 | 0x120000 | 0x52000000;
							Static188.anIntArray2[local60] = local100 | 0x130000;
							Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 - 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local14 != Static289.aByteArrayArrayArray7[Static391.anInt7128][local78][local100]) {
							Static380.anIntArray493[local60] = 0x13000000 | 0x520000 | local78;
							Static188.anIntArray2[local60] = local100 | 0x530000;
							Static289.aByteArrayArrayArray7[Static391.anInt7128][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (local78 + 1 < Static18.anInt5706 && local14 != Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 + 1][local100] && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78][local100] & 0x4) == 0 && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static380.anIntArray493[local60] = local78 + 1 | 0x520000 | 0x92000000;
							Static188.anIntArray2[local60] = local100 | 0x530000;
							Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 + 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
					}
					local100--;
					if (local78 + 1 < Static18.anInt5706 && local14 != Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 + 1][local100]) {
						Static380.anIntArray493[local60] = 0x53000000 | 0x920000 | local78 + 1;
						Static188.anIntArray2[local60] = local100 | 0x930000;
						local60 = local60 + 1 & 0xFFF;
						Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 + 1][local100] = local14;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && local14 != Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 - 1][local100] && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78][local100] & 0x4) == 0 && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static380.anIntArray493[local60] = local78 - 1 | 0xD20000 | 0x12000000;
							Static188.anIntArray2[local60] = local100 | 0xD30000;
							Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 - 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static289.aByteArrayArrayArray7[Static391.anInt7128][local78][local100] != local14) {
							Static380.anIntArray493[local60] = local78 | 0xD20000 | 0x93000000;
							Static188.anIntArray2[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static289.aByteArrayArrayArray7[Static391.anInt7128][local78][local100] = local14;
						}
						if (local78 + 1 < Static18.anInt5706 && Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 + 1][local100] != local14 && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78][local100] & 0x4) == 0 && (Static267.aByteArrayArrayArray8[Static391.anInt7128][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static380.anIntArray493[local60] = local78 + 1 | 0xD2000000 | 0x920000;
							Static188.anIntArray2[local60] = local100 | 0x930000;
							local60 = local60 + 1 & 0xFFF;
							Static289.aByteArrayArrayArray7[Static391.anInt7128][local78 + 1][local100] = local14;
						}
					}
				}
			}
			if (Static471.anIntArray579[arg4] != -1000000) {
				Static471.anIntArray579[arg4] += 10;
				Static443.anIntArray562[arg4] -= 50;
				Static103.anIntArray152[arg4] += 50;
				Static249.anIntArray376[arg4] += 50;
				Static435.anIntArray555[arg4] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)V")
	public static void method2710() {
		if (Static126.anInt2172 == 1 || Static126.anInt2172 == 3 || Static287.anInt5281 != Static126.anInt2172 && (Static126.anInt2172 == 0 || Static287.anInt5281 == 0)) {
			Static192.anInt3744 = 0;
			Static429.anInt7650 = 0;
			Static251.aClass234_29.method5463();
		}
		Static287.anInt5281 = Static126.anInt2172;
	}
}
