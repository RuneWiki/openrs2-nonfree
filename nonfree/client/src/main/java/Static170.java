import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
	public static int anInt3543 = 0;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIZ[[[Lclient!og;)Z")
	public static boolean method3181(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class155[][][] arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static365.anInt7010 & 0xFF);
		if (Static341.aByteArrayArrayArray10[Static284.anInt6477][arg0][arg1] == local14) {
			return false;
		} else if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][arg0][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(51) byte local51 = 0;
			Static18.anIntArray37[0] = arg0;
			@Pc(57) int local57 = 0;
			@Pc(60) int local60 = local51 + 1;
			Static47.anIntArray78[0] = arg1;
			Static341.aByteArrayArrayArray10[Static284.anInt6477][arg0][arg1] = local14;
			while (local60 != local57) {
				@Pc(78) int local78 = Static18.anIntArray37[local57] & 0xFFFF;
				@Pc(86) int local86 = Static18.anIntArray37[local57] >> 16 & 0xFF;
				@Pc(94) int local94 = Static18.anIntArray37[local57] >> 24 & 0xFF;
				@Pc(100) int local100 = Static47.anIntArray78[local57] & 0xFFFF;
				@Pc(108) int local108 = Static47.anIntArray78[local57] >> 16 & 0xFF;
				local57 = local57 + 1 & 0xFFF;
				@Pc(116) boolean local116 = false;
				if ((Static264.aByteArrayArrayArray7[Static284.anInt6477][local78][local100] & 0x4) == 0) {
					local116 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(174) int local174;
				@Pc(220) int local220;
				label231: for (@Pc(137) int local137 = Static284.anInt6477 + 1; local137 <= 3; local137++) {
					if ((Static264.aByteArrayArrayArray7[local137][local78][local100] & 0x8) == 0) {
						@Pc(326) Class11_Sub2 local326;
						@Pc(336) int local336;
						@Pc(315) Class155 local315;
						@Pc(321) Class187 local321;
						if (local116 && arg4[local137][local78][local100] != null) {
							if (arg4[local137][local78][local100].aClass11_Sub5_2 != null) {
								local174 = Static185.method1821(local86);
								if (arg4[local137][local78][local100].aClass11_Sub5_2.anInt5144 == local174 || arg4[local137][local78][local100].aClass11_Sub5_1 != null && local174 == arg4[local137][local78][local100].aClass11_Sub5_1.anInt5144) {
									continue;
								}
								if (local94 != 0) {
									local220 = Static185.method1821(local94);
									if (arg4[local137][local78][local100].aClass11_Sub5_2.anInt5144 == local220 || arg4[local137][local78][local100].aClass11_Sub5_1 != null && local220 == arg4[local137][local78][local100].aClass11_Sub5_1.anInt5144) {
										continue;
									}
								}
								if (local108 != 0) {
									local220 = Static185.method1821(local108);
									if (arg4[local137][local78][local100].aClass11_Sub5_2.anInt5144 == local220 || arg4[local137][local78][local100].aClass11_Sub5_1 != null && arg4[local137][local78][local100].aClass11_Sub5_1.anInt5144 == local220) {
										continue;
									}
								}
							}
							local315 = arg4[local137][local78][local100];
							if (local315.aClass187_2 != null) {
								for (local321 = local315.aClass187_2; local321 != null; local321 = local321.aClass187_3) {
									local326 = local321.aClass11_Sub2_2;
									if (local326 instanceof Interface4) {
										@Pc(332) Interface4 local332 = (Interface4) local326;
										local336 = local332.method5925();
										@Pc(340) int local340 = local332.method5922();
										if (local336 == 21) {
											local336 = 19;
										}
										@Pc(351) int local351 = local340 << 6 | local336;
										if (local351 == local86 || local94 != 0 && local351 == local94 || local108 != 0 && local351 == local108) {
											continue label231;
										}
									}
								}
							}
						}
						local315 = arg4[local137][local78][local100];
						if (local315 != null && local315.aClass187_2 != null) {
							for (local321 = local315.aClass187_2; local321 != null; local321 = local321.aClass187_3) {
								local326 = local321.aClass11_Sub2_2;
								if (local326.aShort92 != local326.aShort94 || local326.aShort93 != local326.aShort91) {
									for (@Pc(420) int local420 = local326.aShort94; local420 <= local326.aShort92; local420++) {
										for (local336 = local326.aShort93; local336 <= local326.aShort91; local336++) {
											Static341.aByteArrayArrayArray10[local137][local420][local336] = local14;
										}
									}
								}
							}
						}
						local133 = true;
						Static341.aByteArrayArrayArray10[local137][local78][local100] = local14;
					}
				}
				if (local133) {
					local174 = Static258.aClass36Array2[Static284.anInt6477 + 1].method4431(local78, local100);
					if (Static198.anIntArray309[arg2] < local174) {
						Static198.anIntArray309[arg2] = local174;
					}
					local220 = local78 << 7;
					if (local220 < Static127.anIntArray207[arg2]) {
						Static127.anIntArray207[arg2] = local220;
					} else if (Static260.anIntArray406[arg2] < local220) {
						Static260.anIntArray406[arg2] = local220;
					}
					@Pc(526) int local526 = local100 << 7;
					if (local526 < Static40.anIntArray70[arg2]) {
						Static40.anIntArray70[arg2] = local526;
					} else if (Static271.anIntArray43[arg2] < local526) {
						Static271.anIntArray43[arg2] = local526;
					}
				}
				if (!local116) {
					if (local78 >= 1 && Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 - 1][local100] != local14) {
						Static18.anIntArray37[local60] = local78 - 1 | 0x120000 | 0xD3000000;
						Static47.anIntArray78[local60] = local100 | 0x130000;
						local60 = local60 + 1 & 0xFFF;
						Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 - 1][local100] = local14;
					}
					@Pc(607) int local607 = ~Static189.anInt3820;
					local100++;
					if (local607 < ~local100) {
						if (local78 - 1 >= 0 && local14 != Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 - 1][local100] && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78][local100] & 0x4) == 0 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78 - 1][local100 - 1] & 0x4) == 0) {
							Static18.anIntArray37[local60] = local78 - 1 | 0x52000000 | 0x120000;
							Static47.anIntArray78[local60] = local100 | 0x130000;
							local60 = local60 + 1 & 0xFFF;
							Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 - 1][local100] = local14;
						}
						if (Static341.aByteArrayArrayArray10[Static284.anInt6477][local78][local100] != local14) {
							Static18.anIntArray37[local60] = local78 | 0x520000 | 0x13000000;
							Static47.anIntArray78[local60] = local100 | 0x530000;
							Static341.aByteArrayArrayArray10[Static284.anInt6477][local78][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
						if (Static311.anInt5653 > local78 + 1 && Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 + 1][local100] != local14 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78][local100] & 0x4) == 0 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78 + 1][local100 - 1] & 0x4) == 0) {
							Static18.anIntArray37[local60] = local78 + 1 | 0x520000 | 0x92000000;
							Static47.anIntArray78[local60] = local100 | 0x530000;
							Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 + 1][local100] = local14;
							local60 = local60 + 1 & 0xFFF;
						}
					}
					local100--;
					if (Static311.anInt5653 > local78 + 1 && Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 + 1][local100] != local14) {
						Static18.anIntArray37[local60] = 0x53000000 | 0x920000 | local78 + 1;
						Static47.anIntArray78[local60] = local100 | 0x930000;
						Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 + 1][local100] = local14;
						local60 = local60 + 1 & 0xFFF;
					}
					local100--;
					if (local100 >= 0) {
						if (local78 - 1 >= 0 && local14 != Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 - 1][local100] && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78][local100] & 0x4) == 0 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78 - 1][local100 + 1] & 0x4) == 0) {
							Static18.anIntArray37[local60] = local78 - 1 | 0xD20000 | 0x12000000;
							Static47.anIntArray78[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 - 1][local100] = local14;
						}
						if (Static341.aByteArrayArrayArray10[Static284.anInt6477][local78][local100] != local14) {
							Static18.anIntArray37[local60] = local78 | 0x93000000 | 0xD20000;
							Static47.anIntArray78[local60] = local100 | 0xD30000;
							local60 = local60 + 1 & 0xFFF;
							Static341.aByteArrayArrayArray10[Static284.anInt6477][local78][local100] = local14;
						}
						if (Static311.anInt5653 > local78 + 1 && Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 + 1][local100] != local14 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78][local100] & 0x4) == 0 && (Static264.aByteArrayArrayArray7[Static284.anInt6477][local78 + 1][local100 + 1] & 0x4) == 0) {
							Static18.anIntArray37[local60] = local78 + 1 | 0xD2000000 | 0x920000;
							Static47.anIntArray78[local60] = local100 | 0x930000;
							local60 = local60 + 1 & 0xFFF;
							Static341.aByteArrayArrayArray10[Static284.anInt6477][local78 + 1][local100] = local14;
						}
					}
				}
			}
			if (Static198.anIntArray309[arg2] != -1000000) {
				Static198.anIntArray309[arg2] += 10;
				Static127.anIntArray207[arg2] -= 50;
				Static260.anIntArray406[arg2] += 50;
				Static271.anIntArray43[arg2] += 50;
				Static40.anIntArray70[arg2] -= 50;
			}
			return true;
		}
	}
}
