import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "Lclient!db;")
	public static final Class64 aClass64_331 = new Class64(109, 19);

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_86 = new Class61(19, 15);

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "[S")
	public static short[] aShortArray114 = new short[256];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "([[[Lclient!fba;IIZZI)Z")
	public static boolean method5711(@OriginalArg(0) Class100[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static523.anInt8897 & 0xFF);
		if (Static567.aByteArrayArrayArray21[Static320.anInt5748][arg4][arg2] == local14) {
			return false;
		} else if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][arg4][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(46) byte local46 = 0;
			@Pc(48) int local48 = 0;
			Static447.anIntArray618[0] = arg4;
			@Pc(55) int local55 = local46 + 1;
			Static240.anIntArray423[0] = arg2;
			Static567.aByteArrayArrayArray21[Static320.anInt5748][arg4][arg2] = local14;
			while (local55 != local48) {
				@Pc(73) int local73 = Static447.anIntArray618[local48] & 0xFFFF;
				@Pc(81) int local81 = Static447.anIntArray618[local48] >> 16 & 0xFF;
				@Pc(89) int local89 = Static447.anIntArray618[local48] >> 24 & 0xFF;
				@Pc(95) int local95 = Static240.anIntArray423[local48] & 0xFFFF;
				@Pc(103) int local103 = Static240.anIntArray423[local48] >> 16 & 0xFF;
				local48 = local48 + 1 & 0xFFF;
				@Pc(111) boolean local111 = false;
				if ((Static97.aByteArrayArrayArray19[Static320.anInt5748][local73][local95] & 0x4) == 0) {
					local111 = true;
				}
				@Pc(128) boolean local128 = false;
				@Pc(167) int local167;
				@Pc(214) int local214;
				label231: for (@Pc(132) int local132 = Static320.anInt5748 + 1; local132 <= 3; local132++) {
					if ((Static97.aByteArrayArrayArray19[local132][local73][local95] & 0x8) == 0) {
						@Pc(317) Class10_Sub1 local317;
						@Pc(327) int local327;
						@Pc(306) Class100 local306;
						@Pc(312) Class35 local312;
						if (local111 && arg0[local132][local73][local95] != null) {
							if (arg0[local132][local73][local95].aClass10_Sub2_3 != null) {
								local167 = Static204.method3627(local81);
								if (local167 == arg0[local132][local73][local95].aClass10_Sub2_3.anInt8054 || arg0[local132][local73][local95].aClass10_Sub2_2 != null && local167 == arg0[local132][local73][local95].aClass10_Sub2_2.anInt8054) {
									continue;
								}
								if (local89 != 0) {
									local214 = Static204.method3627(local89);
									if (arg0[local132][local73][local95].aClass10_Sub2_3.anInt8054 == local214 || arg0[local132][local73][local95].aClass10_Sub2_2 != null && arg0[local132][local73][local95].aClass10_Sub2_2.anInt8054 == local214) {
										continue;
									}
								}
								if (local103 != 0) {
									local214 = Static204.method3627(local103);
									if (arg0[local132][local73][local95].aClass10_Sub2_3.anInt8054 == local214 || arg0[local132][local73][local95].aClass10_Sub2_2 != null && arg0[local132][local73][local95].aClass10_Sub2_2.anInt8054 == local214) {
										continue;
									}
								}
							}
							local306 = arg0[local132][local73][local95];
							if (local306.aClass35_2 != null) {
								for (local312 = local306.aClass35_2; local312 != null; local312 = local312.aClass35_1) {
									local317 = local312.aClass10_Sub1_1;
									if (local317 instanceof Interface17) {
										@Pc(323) Interface17 local323 = (Interface17) local317;
										local327 = local323.method7742();
										@Pc(335) int local335 = local323.method7744();
										if (local327 == 21) {
											local327 = 19;
										}
										@Pc(346) int local346 = local327 | local335 << 6;
										if (local346 == local81 || local89 != 0 && local89 == local346 || local103 != 0 && local346 == local103) {
											continue label231;
										}
									}
								}
							}
						}
						local306 = arg0[local132][local73][local95];
						if (local306 != null && local306.aClass35_2 != null) {
							for (local312 = local306.aClass35_2; local312 != null; local312 = local312.aClass35_1) {
								local317 = local312.aClass10_Sub1_1;
								if (local317.aShort116 != local317.aShort118 || local317.aShort117 != local317.aShort115) {
									for (@Pc(407) int local407 = local317.aShort116; local407 <= local317.aShort118; local407++) {
										for (local327 = local317.aShort117; local327 <= local317.aShort115; local327++) {
											Static567.aByteArrayArrayArray21[local132][local407][local327] = local14;
										}
									}
								}
							}
						}
						local128 = true;
						Static567.aByteArrayArrayArray21[local132][local73][local95] = local14;
					}
				}
				if (local128) {
					local167 = Static112.aClass16Array3[Static320.anInt5748 + 1].JA(local73, local95);
					if (Static8.anIntArray700[arg1] < local167) {
						Static8.anIntArray700[arg1] = local167;
					}
					local214 = local73 << 9;
					if (local214 < Static269.anIntArray445[arg1]) {
						Static269.anIntArray445[arg1] = local214;
					} else if (Static242.anIntArray425[arg1] < local214) {
						Static242.anIntArray425[arg1] = local214;
					}
					@Pc(511) int local511 = local95 << 9;
					if (local511 < Static277.anIntArray450[arg1]) {
						Static277.anIntArray450[arg1] = local511;
					} else if (local511 > Static83.anIntArray721[arg1]) {
						Static83.anIntArray721[arg1] = local511;
					}
				}
				if (!local111) {
					if (local73 >= 1 && Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 - 1][local95] != local14) {
						Static447.anIntArray618[local55] = local73 - 1 | 0xD3000000 | 0x120000;
						Static240.anIntArray423[local55] = local95 | 0x130000;
						local55 = local55 + 1 & 0xFFF;
						Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 - 1][local95] = local14;
					}
					@Pc(590) int local590 = ~Static38.anInt741;
					local95++;
					if (local590 < ~local95) {
						if (local73 - 1 >= 0 && local14 != Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 - 1][local95] && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73][local95] & 0x4) == 0 && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73 - 1][local95 - 1] & 0x4) == 0) {
							Static447.anIntArray618[local55] = local73 - 1 | 0x52000000 | 0x120000;
							Static240.anIntArray423[local55] = local95 | 0x130000;
							Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static567.aByteArrayArrayArray21[Static320.anInt5748][local73][local95]) {
							Static447.anIntArray618[local55] = local73 | 0x520000 | 0x13000000;
							Static240.anIntArray423[local55] = local95 | 0x530000;
							Static567.aByteArrayArrayArray21[Static320.anInt5748][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static38.anInt740 > local73 + 1 && Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 + 1][local95] != local14 && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73][local95] & 0x4) == 0 && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73 + 1][local95 - 1] & 0x4) == 0) {
							Static447.anIntArray618[local55] = local73 + 1 | 0x520000 | 0x92000000;
							Static240.anIntArray423[local55] = local95 | 0x530000;
							Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 + 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
					}
					local95--;
					if (local73 + 1 < Static38.anInt740 && Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 + 1][local95] != local14) {
						Static447.anIntArray618[local55] = local73 + 1 | 0x920000 | 0x53000000;
						Static240.anIntArray423[local55] = local95 | 0x930000;
						local55 = local55 + 1 & 0xFFF;
						Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 + 1][local95] = local14;
					}
					local95--;
					if (local95 >= 0) {
						if (local73 - 1 >= 0 && local14 != Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 - 1][local95] && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73][local95] & 0x4) == 0 && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73 - 1][local95 + 1] & 0x4) == 0) {
							Static447.anIntArray618[local55] = 0x12000000 | 0xD20000 | local73 - 1;
							Static240.anIntArray423[local55] = local95 | 0xD30000;
							Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 - 1][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (local14 != Static567.aByteArrayArrayArray21[Static320.anInt5748][local73][local95]) {
							Static447.anIntArray618[local55] = local73 | 0xD20000 | 0x93000000;
							Static240.anIntArray423[local55] = local95 | 0xD30000;
							Static567.aByteArrayArrayArray21[Static320.anInt5748][local73][local95] = local14;
							local55 = local55 + 1 & 0xFFF;
						}
						if (Static38.anInt740 > local73 + 1 && local14 != Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 + 1][local95] && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73][local95] & 0x4) == 0 && (Static97.aByteArrayArrayArray19[Static320.anInt5748][local73 + 1][local95 + 1] & 0x4) == 0) {
							Static447.anIntArray618[local55] = 0xD2000000 | 0x920000 | local73 + 1;
							Static240.anIntArray423[local55] = local95 | 0x930000;
							local55 = local55 + 1 & 0xFFF;
							Static567.aByteArrayArrayArray21[Static320.anInt5748][local73 + 1][local95] = local14;
						}
					}
				}
			}
			if (Static8.anIntArray700[arg1] != -1000000) {
				Static8.anIntArray700[arg1] += 10;
				Static269.anIntArray445[arg1] -= 50;
				Static242.anIntArray425[arg1] += 50;
				Static83.anIntArray721[arg1] += 50;
				Static277.anIntArray450[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)V")
	public static void method5713() {
		Static223.anInt4570 = 0;
		Static189.anInt3964 = 0;
		Static584.anInt9652 = 0;
		Static146.anInt3278 = 0;
	}
}
