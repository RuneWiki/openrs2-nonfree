import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_15 = new Class94(21, 2);

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
	public static int anInt1794 = 104;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "Z")
	public static boolean aBoolean156 = false;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_16 = new Class215(105, -2);

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_17 = new Class215(96, 8);

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "Lclient!mn;")
	public static final Class211 aClass211_2 = new Class211();

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[[[Lclient!es;IIIZ)Z")
	public static boolean method1689(@OriginalArg(0) int arg0, @OriginalArg(1) Class100[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static438.anInt8137 & 0xFF);
		if (Static612.aByteArrayArrayArray18[Static12.anInt172][arg2][arg0] == local14) {
			return false;
		} else if ((Static476.aByteArrayArrayArray5[Static12.anInt172][arg2][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			@Pc(45) int local45 = 0;
			Static240.anIntArray271[0] = arg2;
			@Pc(52) int local52 = local43 + 1;
			Static635.anIntArray713[0] = arg0;
			Static612.aByteArrayArrayArray18[Static12.anInt172][arg2][arg0] = local14;
			while (local45 != local52) {
				@Pc(70) int local70 = Static240.anIntArray271[local45] & 0xFFFF;
				@Pc(78) int local78 = Static240.anIntArray271[local45] >> 16 & 0xFF;
				@Pc(86) int local86 = Static240.anIntArray271[local45] >> 24 & 0xFF;
				@Pc(92) int local92 = Static635.anIntArray713[local45] & 0xFFFF;
				@Pc(100) int local100 = Static635.anIntArray713[local45] >> 16 & 0xFF;
				local45 = local45 + 1 & 0xFFF;
				@Pc(108) boolean local108 = false;
				if ((Static476.aByteArrayArrayArray5[Static12.anInt172][local70][local92] & 0x4) == 0) {
					local108 = true;
				}
				@Pc(122) boolean local122 = false;
				@Pc(128) int local128;
				@Pc(170) int local170;
				@Pc(220) int local220;
				if (arg1 != null) {
					label237: for (local128 = Static12.anInt172 + 1; local128 <= 3; local128++) {
						if (arg1[local128] != null && (Static476.aByteArrayArrayArray5[local128][local70][local92] & 0x8) == 0) {
							@Pc(323) Class3_Sub1_Sub3 local323;
							@Pc(333) int local333;
							@Pc(312) Class100 local312;
							@Pc(318) Class243 local318;
							if (local108 && arg1[local128][local70][local92] != null) {
								if (arg1[local128][local70][local92].aClass3_Sub1_Sub5_2 != null) {
									local170 = Static141.method3125(local78);
									if (local170 == arg1[local128][local70][local92].aClass3_Sub1_Sub5_2.aShort62 || arg1[local128][local70][local92].aClass3_Sub1_Sub5_1 != null && arg1[local128][local70][local92].aClass3_Sub1_Sub5_1.aShort62 == local170) {
										continue;
									}
									if (local86 != 0) {
										local220 = Static141.method3125(local86);
										if (local220 == arg1[local128][local70][local92].aClass3_Sub1_Sub5_2.aShort62 || arg1[local128][local70][local92].aClass3_Sub1_Sub5_1 != null && local220 == arg1[local128][local70][local92].aClass3_Sub1_Sub5_1.aShort62) {
											continue;
										}
									}
									if (local100 != 0) {
										local220 = Static141.method3125(local100);
										if (arg1[local128][local70][local92].aClass3_Sub1_Sub5_2.aShort62 == local220 || arg1[local128][local70][local92].aClass3_Sub1_Sub5_1 != null && arg1[local128][local70][local92].aClass3_Sub1_Sub5_1.aShort62 == local220) {
											continue;
										}
									}
								}
								local312 = arg1[local128][local70][local92];
								if (local312.aClass243_1 != null) {
									for (local318 = local312.aClass243_1; local318 != null; local318 = local318.aClass243_3) {
										local323 = local318.aClass3_Sub1_Sub3_1;
										if (local323 instanceof Interface21) {
											@Pc(329) Interface21 local329 = (Interface21) local323;
											local333 = local329.method8622();
											@Pc(337) int local337 = local329.method8624();
											if (local333 == 21) {
												local333 = 19;
											}
											@Pc(348) int local348 = local337 << 6 | local333;
											if (local348 == local78 || local86 != 0 && local86 == local348 || local100 != 0 && local100 == local348) {
												continue label237;
											}
										}
									}
								}
							}
							local312 = arg1[local128][local70][local92];
							if (local312 != null && local312.aClass243_1 != null) {
								for (local318 = local312.aClass243_1; local318 != null; local318 = local318.aClass243_3) {
									local323 = local318.aClass3_Sub1_Sub3_1;
									if (local323.aShort118 != local323.aShort121 || local323.aShort119 != local323.aShort120) {
										for (@Pc(406) int local406 = local323.aShort118; local406 <= local323.aShort121; local406++) {
											for (local333 = local323.aShort120; local333 <= local323.aShort119; local333++) {
												Static612.aByteArrayArrayArray18[local128][local406][local333] = local14;
											}
										}
									}
								}
							}
							Static612.aByteArrayArrayArray18[local128][local70][local92] = local14;
							local122 = true;
						}
					}
				}
				if (local122) {
					local128 = Static9.aClass65Array1[Static12.anInt172 + 1].method7995(local92, local70);
					if (local128 > Static93.anIntArray130[arg3]) {
						Static93.anIntArray130[arg3] = local128;
					}
					local170 = local70 << 9;
					if (Static408.anIntArray496[arg3] > local170) {
						Static408.anIntArray496[arg3] = local170;
					} else if (local170 > Static472.anIntArray564[arg3]) {
						Static472.anIntArray564[arg3] = local170;
					}
					local220 = local92 << 9;
					if (Static279.anIntArray498[arg3] > local220) {
						Static279.anIntArray498[arg3] = local220;
					} else if (local220 > Static265.anIntArray323[arg3]) {
						Static265.anIntArray323[arg3] = local220;
					}
				}
				if (!local108) {
					if (local70 >= 1 && Static612.aByteArrayArrayArray18[Static12.anInt172][local70 - 1][local92] != local14) {
						Static240.anIntArray271[local52] = local70 - 1 | 0x120000 | 0xD3000000;
						Static635.anIntArray713[local52] = local92 | 0x130000;
						local52 = local52 + 1 & 0xFFF;
						Static612.aByteArrayArrayArray18[Static12.anInt172][local70 - 1][local92] = local14;
					}
					@Pc(592) int local592 = ~Static209.anInt4742;
					local92++;
					if (local592 < ~local92) {
						if (local70 - 1 >= 0 && Static612.aByteArrayArrayArray18[Static12.anInt172][local70 - 1][local92] != local14 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70][local92] & 0x4) == 0 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70 - 1][local92 - 1] & 0x4) == 0) {
							Static240.anIntArray271[local52] = local70 - 1 | 0x52000000 | 0x120000;
							Static635.anIntArray713[local52] = local92 | 0x130000;
							Static612.aByteArrayArrayArray18[Static12.anInt172][local70 - 1][local92] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local14 != Static612.aByteArrayArrayArray18[Static12.anInt172][local70][local92]) {
							Static240.anIntArray271[local52] = local70 | 0x13000000 | 0x520000;
							Static635.anIntArray713[local52] = local92 | 0x530000;
							Static612.aByteArrayArrayArray18[Static12.anInt172][local70][local92] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (anInt1794 > local70 + 1 && local14 != Static612.aByteArrayArrayArray18[Static12.anInt172][local70 + 1][local92] && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70][local92] & 0x4) == 0 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70 + 1][local92 - 1] & 0x4) == 0) {
							Static240.anIntArray271[local52] = local70 + 1 | 0x92000000 | 0x520000;
							Static635.anIntArray713[local52] = local92 | 0x530000;
							local52 = local52 + 1 & 0xFFF;
							Static612.aByteArrayArrayArray18[Static12.anInt172][local70 + 1][local92] = local14;
						}
					}
					local92--;
					if (anInt1794 > local70 + 1 && Static612.aByteArrayArrayArray18[Static12.anInt172][local70 + 1][local92] != local14) {
						Static240.anIntArray271[local52] = 0x53000000 | 0x920000 | local70 + 1;
						Static635.anIntArray713[local52] = local92 | 0x930000;
						local52 = local52 + 1 & 0xFFF;
						Static612.aByteArrayArrayArray18[Static12.anInt172][local70 + 1][local92] = local14;
					}
					local92--;
					if (local92 >= 0) {
						if (local70 - 1 >= 0 && Static612.aByteArrayArrayArray18[Static12.anInt172][local70 - 1][local92] != local14 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70][local92] & 0x4) == 0 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70 - 1][local92 + 1] & 0x4) == 0) {
							Static240.anIntArray271[local52] = 0x12000000 | 0xD20000 | local70 - 1;
							Static635.anIntArray713[local52] = local92 | 0xD30000;
							Static612.aByteArrayArrayArray18[Static12.anInt172][local70 - 1][local92] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local14 != Static612.aByteArrayArrayArray18[Static12.anInt172][local70][local92]) {
							Static240.anIntArray271[local52] = local70 | 0xD20000 | 0x93000000;
							Static635.anIntArray713[local52] = local92 | 0xD30000;
							Static612.aByteArrayArrayArray18[Static12.anInt172][local70][local92] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
						if (local70 + 1 < anInt1794 && Static612.aByteArrayArrayArray18[Static12.anInt172][local70 + 1][local92] != local14 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70][local92] & 0x4) == 0 && (Static476.aByteArrayArrayArray5[Static12.anInt172][local70 + 1][local92 + 1] & 0x4) == 0) {
							Static240.anIntArray271[local52] = local70 + 1 | 0xD2000000 | 0x920000;
							Static635.anIntArray713[local52] = local92 | 0x930000;
							Static612.aByteArrayArrayArray18[Static12.anInt172][local70 + 1][local92] = local14;
							local52 = local52 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static93.anIntArray130[arg3] != -1000000) {
				Static93.anIntArray130[arg3] += 40;
				Static408.anIntArray496[arg3] -= 512;
				Static472.anIntArray564[arg3] += 512;
				Static265.anIntArray323[arg3] += 512;
				Static279.anIntArray498[arg3] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
	public static void method1690() {
		Static127.aBoolean252 = false;
		Static132.method3031();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!cea;ILjava/lang/String;)I")
	public static int method1691(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt10066;
		@Pc(10) byte[] local10 = Static333.method5730(arg1);
		arg0.method8377(local10.length);
		arg0.anInt10066 += Static279.aClass369_5.method9062(local10.length, 0, arg0.anInt10066, local10, arg0.aByteArray128);
		return arg0.anInt10066 - local6;
	}
}
