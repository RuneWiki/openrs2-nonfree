import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "[Lclient!le;")
	public static Class1_Sub2_Sub8_Sub2[] aClass1_Sub2_Sub8_Sub2Array9;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "[I")
	public static final int[] anIntArray144 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIILclient!wd;JLclient!wd;Lclient!wd;)V")
	public static void method1336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class5 arg6, @OriginalArg(7) Class5 arg7) {
		@Pc(3) Class81 local3 = new Class81();
		local3.aClass5_8 = arg4;
		local3.anInt3374 = arg1 * 128 + 64;
		local3.anInt3379 = arg2 * 128 + 64;
		local3.anInt3377 = arg3;
		local3.aLong109 = arg5;
		local3.aClass5_9 = arg6;
		local3.aClass5_10 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub8 local42 = Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt1550; local46++) {
				@Pc(52) Class51 local52 = local42.aClass51Array1[local46];
				if ((local52.aLong68 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass5_6.method3163();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt3378 = -local34;
		if (Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub8(arg0, arg1, arg2);
		}
		Static29.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass81_1 = local3;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIII)V")
	public static void method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(15) int local15 = arg1 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static14.method308(arg0, arg2, arg4, arg3);
			}
		} else if (local10 == 0) {
			Static187.method3223(arg2, arg0, arg1, arg3);
		} else {
			@Pc(44) int local44 = (local10 << 12) / local15;
			@Pc(58) int local58 = arg0 - (local44 * arg3 >> 12);
			@Pc(71) int local71;
			@Pc(69) int local69;
			if (arg3 < Static63.anInt1608) {
				local69 = local58 + (Static63.anInt1608 * local44 >> 12);
				local71 = Static63.anInt1608;
			} else if (Static63.anInt1595 >= arg3) {
				local69 = arg0;
				local71 = arg3;
			} else {
				local69 = local58 + (local44 * Static63.anInt1595 >> 12);
				local71 = Static63.anInt1595;
			}
			@Pc(117) int local117;
			@Pc(115) int local115;
			if (Static63.anInt1608 > arg1) {
				local115 = local58 + (Static63.anInt1608 * local44 >> 12);
				local117 = Static63.anInt1608;
			} else if (Static63.anInt1595 < arg1) {
				local115 = local58 + (Static63.anInt1595 * local44 >> 12);
				local117 = Static63.anInt1595;
			} else {
				local117 = arg1;
				local115 = arg4;
			}
			if (local115 < Static13.anInt308) {
				local117 = (Static13.anInt308 - local58 << 12) / local44;
				local115 = Static13.anInt308;
			} else if (local115 > Static52.anInt1338) {
				local117 = (Static52.anInt1338 - local58 << 12) / local44;
				local115 = Static52.anInt1338;
			}
			if (local69 < Static13.anInt308) {
				local71 = (Static13.anInt308 - local58 << 12) / local44;
				local69 = Static13.anInt308;
			} else if (Static52.anInt1338 < local69) {
				local71 = (Static52.anInt1338 - local58 << 12) / local44;
				local69 = Static52.anInt1338;
			}
			Static117.method2008(local69, local117, local115, arg2, local71);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([BI)V")
	public static void method1338(@OriginalArg(0) byte[] arg0) {
		@Pc(5) int local5 = Static168.anInt3732 >> 2 << 10;
		@Pc(18) int local18 = Static92.anInt2144 >> 1;
		@Pc(20) int local20 = 0;
		@Pc(24) byte[][] local24 = new byte[Static146.anInt3124][Static189.anInt4212];
		while (true) {
			@Pc(37) int local37;
			@Pc(49) int local49;
			while (arg0.length > local20) {
				local37 = (arg0[local20++] & 0xFF) * 64 - Static174.anInt3876;
				local49 = (arg0[local20++] & 0xFF) * 64 - Static122.anInt2713;
				if (local37 > 0 && local49 > 0 && local37 + 64 < Static146.anInt3124 && local49 + 64 < Static189.anInt4212) {
					for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
						@Pc(75) byte[] local75 = local24[local68 + local37];
						@Pc(81) int local81 = Static189.anInt4212 - local49 - 1;
						for (@Pc(83) int local83 = -64; local83 < 0; local83++) {
							local75[local81--] = arg0[local20++];
						}
					}
				} else {
					local20 += 4096;
				}
			}
			local37 = Static146.anInt3124;
			local49 = Static189.anInt4212;
			@Pc(119) int[] local119 = new int[local49];
			@Pc(122) int[] local122 = new int[local49];
			@Pc(125) int[] local125 = new int[local49];
			@Pc(128) int[] local128 = new int[local49];
			@Pc(131) int[] local131 = new int[local49];
			for (@Pc(133) int local133 = -5; local133 < local37; local133++) {
				@Pc(156) int local156;
				@Pc(225) int local225;
				for (@Pc(136) int local136 = 0; local136 < local49; local136++) {
					@Pc(141) int local141 = local133 + 5;
					@Pc(205) int local205;
					if (local37 > local141) {
						local156 = local24[local141][local136] & 0xFF;
						if (local156 > 0) {
							@Pc(169) Class1_Sub2_Sub18 local169 = Static39.method729(local156 - 1);
							local119[local136] += local169.anInt3162;
							local125[local136] += local169.anInt3167;
							local122[local136] += local169.anInt3160;
							local128[local136] += local169.anInt3168;
							local205 = local131[local136]++;
						}
					}
					local156 = local133 - 5;
					if (local156 >= 0) {
						local225 = local24[local156][local136] & 0xFF;
						if (local225 > 0) {
							@Pc(236) Class1_Sub2_Sub18 local236 = Static39.method729(local225 - 1);
							local119[local136] -= local236.anInt3162;
							local125[local136] -= local236.anInt3167;
							local122[local136] -= local236.anInt3160;
							local128[local136] -= local236.anInt3168;
							local205 = local131[local136]--;
						}
					}
				}
				if (local133 >= 0) {
					@Pc(287) int[][] local287 = Static86.anIntArrayArrayArray5[local133 >> 6];
					local225 = 0;
					@Pc(291) int local291 = 0;
					@Pc(293) int local293 = 0;
					local156 = 0;
					@Pc(297) int local297 = 0;
					for (@Pc(299) int local299 = -5; local299 < local49; local299++) {
						@Pc(304) int local304 = local299 + 5;
						if (local49 > local304) {
							local225 += local125[local304];
							local291 += local122[local304];
							local297 += local131[local304];
							local293 += local128[local304];
							local156 += local119[local304];
						}
						@Pc(341) int local341 = local299 - 5;
						if (local341 >= 0) {
							local225 -= local125[local341];
							local291 -= local122[local341];
							local156 -= local119[local341];
							local297 -= local131[local341];
							local293 -= local128[local341];
						}
						if (local299 >= 0 && local297 > 0) {
							@Pc(384) int local384 = local299 >> 6;
							@Pc(405) int local405 = local293 == 0 ? 0 : Static24.method506(local156 * 256 / local293, local225 / local297, local291 / local297);
							if (local24[local133][local299] != 0) {
								@Pc(436) int local436 = local18 + (local405 & 0x7F);
								if (local436 < 0) {
									local436 = 0;
								} else if (local436 > 127) {
									local436 = 127;
								}
								@Pc(462) int local462 = (local405 & 0x380) + (local405 + local5 & 0xFC00) + local436;
								if (local287[local384] == null) {
									local287[local384] = Static86.anIntArrayArrayArray5[local133 >> 6][local384] = new int[4096];
								}
								local287[local384][(local133 & 0x3F) + ((local299 & 0x3F) << 6)] = Static182.anIntArray354[Static58.method1103(96, local462)];
							} else if (local287[local384] != null) {
								local287[local384][((local299 & 0x3F) << 6) + (local133 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}
}
