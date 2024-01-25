import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!pga", name = "o", descriptor = "Z")
	public static boolean aBoolean547 = false;

	@OriginalMember(owner = "client!pga", name = "s", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_45 = new Class262();

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(I[[[Lclient!cja;IIZI)Z")
	public static boolean method6568(@OriginalArg(0) int arg0, @OriginalArg(1) Class58[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static274.anInt4757 & 0xFF);
		if (Static539.aByteArrayArrayArray17[Static586.anInt10060][arg0][arg4] == local14) {
			return false;
		} else if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][arg0][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			Static536.anIntArray676[0] = arg0;
			@Pc(52) int local52 = 0;
			@Pc(55) int local55 = local46 + 1;
			Static369.anIntArray495[0] = arg4;
			Static539.aByteArrayArrayArray17[Static586.anInt10060][arg0][arg4] = local14;
			while (local55 != local52) {
				@Pc(81) int local81 = Static536.anIntArray676[local52] & 0xFFFF;
				@Pc(89) int local89 = Static536.anIntArray676[local52] >> 16 & 0xFF;
				@Pc(97) int local97 = Static536.anIntArray676[local52] >> 24 & 0xFF;
				@Pc(103) int local103 = Static369.anIntArray495[local52] & 0xFFFF;
				@Pc(111) int local111 = Static369.anIntArray495[local52] >> 16 & 0xFF;
				local52 = local52 + 1 & 0xFFF;
				@Pc(119) boolean local119 = false;
				if ((Static553.aByteArrayArrayArray18[Static586.anInt10060][local81][local103] & 0x4) == 0) {
					local119 = true;
				}
				@Pc(133) boolean local133 = false;
				@Pc(139) int local139;
				@Pc(178) int local178;
				@Pc(220) int local220;
				if (arg1 != null) {
					label237: for (local139 = Static586.anInt10060 + 1; local139 <= 3; local139++) {
						if (arg1[local139] != null && (Static553.aByteArrayArrayArray18[local139][local81][local103] & 0x8) == 0) {
							@Pc(322) Class12_Sub2_Sub2 local322;
							@Pc(332) int local332;
							@Pc(311) Class58 local311;
							@Pc(317) Class43 local317;
							if (local119 && arg1[local139][local81][local103] != null) {
								if (arg1[local139][local81][local103].aClass12_Sub2_Sub1_1 != null) {
									local178 = Static580.method8287(local89);
									if (local178 == arg1[local139][local81][local103].aClass12_Sub2_Sub1_1.aShort94 || arg1[local139][local81][local103].aClass12_Sub2_Sub1_2 != null && arg1[local139][local81][local103].aClass12_Sub2_Sub1_2.aShort94 == local178) {
										continue;
									}
									if (local97 != 0) {
										local220 = Static580.method8287(local97);
										if (local220 == arg1[local139][local81][local103].aClass12_Sub2_Sub1_1.aShort94 || arg1[local139][local81][local103].aClass12_Sub2_Sub1_2 != null && local220 == arg1[local139][local81][local103].aClass12_Sub2_Sub1_2.aShort94) {
											continue;
										}
									}
									if (local111 != 0) {
										local220 = Static580.method8287(local111);
										if (local220 == arg1[local139][local81][local103].aClass12_Sub2_Sub1_1.aShort94 || arg1[local139][local81][local103].aClass12_Sub2_Sub1_2 != null && arg1[local139][local81][local103].aClass12_Sub2_Sub1_2.aShort94 == local220) {
											continue;
										}
									}
								}
								local311 = arg1[local139][local81][local103];
								if (local311.aClass43_4 != null) {
									for (local317 = local311.aClass43_4; local317 != null; local317 = local317.aClass43_3) {
										local322 = local317.aClass12_Sub2_Sub2_1;
										if (local322 instanceof Interface19) {
											@Pc(328) Interface19 local328 = (Interface19) local322;
											local332 = local328.method9175();
											@Pc(336) int local336 = local328.method9174();
											if (local332 == 21) {
												local332 = 19;
											}
											@Pc(349) int local349 = local336 << 6 | local332;
											if (local349 == local89 || local97 != 0 && local97 == local349 || local111 != 0 && local111 == local349) {
												continue label237;
											}
										}
									}
								}
							}
							local311 = arg1[local139][local81][local103];
							if (local311 != null && local311.aClass43_4 != null) {
								for (local317 = local311.aClass43_4; local317 != null; local317 = local317.aClass43_3) {
									local322 = local317.aClass12_Sub2_Sub2_1;
									if (local322.aShort112 != local322.aShort111 || local322.aShort109 != local322.aShort110) {
										for (@Pc(419) int local419 = local322.aShort111; local419 <= local322.aShort112; local419++) {
											for (local332 = local322.aShort110; local332 <= local322.aShort109; local332++) {
												Static539.aByteArrayArrayArray17[local139][local419][local332] = local14;
											}
										}
									}
								}
							}
							Static539.aByteArrayArrayArray17[local139][local81][local103] = local14;
							local133 = true;
						}
					}
				}
				if (local133) {
					local139 = Static576.aClass51Array3[Static586.anInt10060 + 1].method7857(local103, local81);
					if (Static666.anIntArray821[arg2] < local139) {
						Static666.anIntArray821[arg2] = local139;
					}
					local178 = local81 << 9;
					if (Static230.anIntArray335[arg2] > local178) {
						Static230.anIntArray335[arg2] = local178;
					} else if (Static241.anIntArray343[arg2] < local178) {
						Static241.anIntArray343[arg2] = local178;
					}
					local220 = local103 << 9;
					if (Static616.anIntArray762[arg2] > local220) {
						Static616.anIntArray762[arg2] = local220;
					} else if (local220 > Static563.anIntArray705[arg2]) {
						Static563.anIntArray705[arg2] = local220;
					}
				}
				if (!local119) {
					if (local81 >= 1 && Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 - 1][local103] != local14) {
						Static536.anIntArray676[local55] = local81 - 1 | 0x120000 | 0xD3000000;
						Static369.anIntArray495[local55] = local103 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 - 1][local103] = local14;
					}
					@Pc(597) int local597 = ~Static445.anInt6140;
					local103++;
					if (local597 < ~local103) {
						if (local81 - 1 >= 0 && local14 != Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 - 1][local103] && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81][local103] & 0x4) == 0 && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81 - 1][local103 - 1] & 0x4) == 0) {
							Static536.anIntArray676[local55] = local81 - 1 | 0x52000000 | 0x120000;
							Static369.anIntArray495[local55] = local103 | 0x130000;
							local55 = local55 + 1 & 0xFFF;
							Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 - 1][local103] = local14;
						}
						if (local14 != Static539.aByteArrayArrayArray17[Static586.anInt10060][local81][local103]) {
							Static536.anIntArray676[local55] = local81 | 0x520000 | 0x13000000;
							Static369.anIntArray495[local55] = local103 | 0x530000;
							local55 = local55 + 1 & 0xFFF;
							Static539.aByteArrayArrayArray17[Static586.anInt10060][local81][local103] = local14;
						}
						if (Static26.anInt462 > local81 + 1 && Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 + 1][local103] != local14 && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81][local103] & 0x4) == 0 && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81 + 1][local103 - 1] & 0x4) == 0) {
							Static536.anIntArray676[local55] = local81 + 1 | 0x92000000 | 0x520000;
							Static369.anIntArray495[local55] = local103 | 0x530000;
							Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 + 1][local103] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
					local103--;
					if (Static26.anInt462 > local81 + 1 && local14 != Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 + 1][local103]) {
						Static536.anIntArray676[local55] = local81 + 1 | 0x53000000 | 0x920000;
						Static369.anIntArray495[local55] = local103 | 0x930000;
						Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 + 1][local103] = local14;
						local55 = local55 + 1 & 0xFFF;
					}
					local103--;
					if (local103 >= 0) {
						if (local81 - 1 >= 0 && local14 != Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 - 1][local103] && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81][local103] & 0x4) == 0 && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81 - 1][local103 + 1] & 0x4) == 0) {
							Static536.anIntArray676[local55] = 0x12000000 | 0xD20000 | local81 - 1;
							Static369.anIntArray495[local55] = local103 | 0xD30000;
							Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 - 1][local103] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static539.aByteArrayArrayArray17[Static586.anInt10060][local81][local103] != local14) {
							Static536.anIntArray676[local55] = 0x93000000 | 0xD20000 | local81;
							Static369.anIntArray495[local55] = local103 | 0xD30000;
							Static539.aByteArrayArrayArray17[Static586.anInt10060][local81][local103] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static26.anInt462 > local81 + 1 && local14 != Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 + 1][local103] && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81][local103] & 0x4) == 0 && (Static553.aByteArrayArrayArray18[Static586.anInt10060][local81 + 1][local103 + 1] & 0x4) == 0) {
							Static536.anIntArray676[local55] = local81 + 1 | 0xD2000000 | 0x920000;
							Static369.anIntArray495[local55] = local103 | 0x930000;
							Static539.aByteArrayArrayArray17[Static586.anInt10060][local81 + 1][local103] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static666.anIntArray821[arg2] != -1000000) {
				Static666.anIntArray821[arg2] += 40;
				Static230.anIntArray335[arg2] -= 512;
				Static241.anIntArray343[arg2] += 512;
				Static563.anIntArray705[arg2] += 512;
				Static616.anIntArray762[arg2] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pga", name = "b", descriptor = "(III)Z")
	public static boolean method6569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIII)V")
	public static void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class12_Sub2_Sub3 local13 = local7.aClass12_Sub2_Sub3_2;
		@Pc(16) Class12_Sub2_Sub3 local16 = local7.aClass12_Sub2_Sub3_1;
		if (local13 != null) {
			local13.aShort119 = (short) (local13.aShort119 * arg3 / (0x10 << Static579.anInt9935 - 7));
			local13.aShort120 = (short) (local13.aShort120 * arg3 / (0x10 << Static579.anInt9935 - 7));
		}
		if (local16 != null) {
			local16.aShort119 = (short) (local16.aShort119 * arg3 / (0x10 << Static579.anInt9935 - 7));
			local16.aShort120 = (short) (local16.aShort120 * arg3 / (0x10 << Static579.anInt9935 - 7));
		}
	}

	@OriginalMember(owner = "client!pga", name = "c", descriptor = "(III)I")
	public static int method6574(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}
}
