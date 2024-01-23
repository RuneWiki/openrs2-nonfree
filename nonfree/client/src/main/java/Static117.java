import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!ij", name = "I", descriptor = "Lclient!el;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "Lclient!ok;")
	public static Class116 aClass116_7;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	public static int anInt2572 = 0;

	@OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
	public static int anInt2575 = 3353893;

	@OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
	public static int anInt2578 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIBIIIII)V")
	public static void method1919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(18) int local18 = arg7 - arg6;
		if (arg7 < Static178.anInt4022) {
			local18++;
		}
		@Pc(26) int local26 = arg0 - arg1;
		if (arg0 < Static173.anInt3932) {
			local26++;
		}
		@Pc(32) int local32;
		@Pc(43) int local43;
		@Pc(54) int local54;
		@Pc(59) int local59;
		@Pc(68) int local68;
		@Pc(117) int local117;
		@Pc(137) int local137;
		@Pc(158) int local158;
		@Pc(162) int local162;
		@Pc(207) int local207;
		@Pc(228) int local228;
		@Pc(220) int local220;
		@Pc(249) int local249;
		@Pc(271) int local271;
		@Pc(293) int local293;
		@Pc(371) int local371;
		@Pc(387) int local387;
		@Pc(181) int[][] local181;
		for (local32 = 0; local32 < local18; local32++) {
			local43 = local32 * arg5 >> 16;
			local54 = (local32 + 1) * arg5 >> 16;
			local59 = local54 - local43;
			if (local59 > 0) {
				local68 = local32 + arg6 >> 6;
				if (local68 >= 0 && local68 <= Static92.anIntArrayArrayArray7.length - 1) {
					local54 += arg2;
					local181 = Static92.anIntArrayArrayArray7[local68];
					@Pc(185) byte[][] local185 = Static136.aByteArrayArrayArray26[local68];
					@Pc(189) byte[][] local189 = Static191.aByteArrayArrayArray38[local68];
					@Pc(193) byte[][] local193 = Static205.aByteArrayArrayArray41[local68];
					local43 += arg2;
					@Pc(201) byte[][] local201 = Static164.aByteArrayArrayArray31[local68];
					@Pc(205) byte[][] local205 = Static139.aByteArrayArrayArray54[local68];
					for (local207 = 0; local207 < local26; local207++) {
						local220 = (local207 + 1) * arg3 >> 16;
						local228 = arg3 * local207 >> 16;
						@Pc(233) int local233 = local220 - local228;
						if (local233 > 0) {
							local220 += arg4;
							local249 = local207 + arg1 >> 6;
							@Pc(255) int local255 = arg1 + local207 & 0x3F;
							local228 += arg4;
							@Pc(265) int local265 = local32 + arg6 & 0x3F;
							local271 = local265 + (local255 << 6);
							if (local249 < 0 || local249 > local181.length - 1 || local181[local249] == null) {
								if (Static176.aClass1_Sub2_Sub9_2.anInt2168 != -1) {
									local293 = Static176.aClass1_Sub2_Sub9_2.anInt2168;
								} else if ((arg6 + local32 & 0x4) == (local207 + arg1 & 0x4)) {
									local293 = Static62.anIntArray168[Static247.anInt5416 + 1];
								} else {
									local293 = 4936552;
								}
								if (local249 < 0 || local181.length - 1 < local249) {
									if (local293 == 0) {
										local293 = 1;
									}
									Static203.method3592(local43, local228, local59, local233, local293);
									continue;
								}
							} else {
								local293 = local181[local249][local271];
							}
							local371 = local201[local249] == null ? 0 : Static62.anIntArray168[local201[local249][local271] & 0xFF];
							local387 = local205[local249] == null ? 0 : Static62.anIntArray168[local205[local249][local271] & 0xFF];
							if (local293 == 0) {
								local293 = 1;
							}
							@Pc(434) int local434;
							if (local371 == 0 && local387 == 0) {
								Static203.method3592(local43, local228, local59, local233, local293);
							} else {
								@Pc(430) byte local430;
								if (local371 != 0) {
									if (local371 == -1) {
										local371 = 1;
									}
									local430 = local185[local249] == null ? 0 : local185[local249][local271];
									local434 = local430 & 0xFC;
									if (local434 == 0 || local59 <= 1 || local233 <= 1) {
										Static203.method3592(local43, local228, local59, local233, local371);
									} else {
										Static263.method4469(local371, local228, local233, local43, true, local293, local434 >> 2, local430 & 0x3, Static203.anIntArray460, local59);
									}
								}
								if (local387 != 0) {
									if (local387 == -1) {
										local387 = local293;
									}
									local430 = local193[local249][local271];
									local434 = local430 & 0xFC;
									if (local434 == 0 || local59 <= 1 || local233 <= 1) {
										Static203.method3592(local43, local228, local59, local233, local387);
									}
									Static263.method4469(local387, local228, local233, local43, local371 == 0, 0, local434 >> 2, local430 & 0x3, Static203.anIntArray460, local59);
								}
							}
							if (local189[local249] != null) {
								@Pc(547) int local547 = local189[local249][local271] & 0xFF;
								if (local547 != 0) {
									if (local59 == 1) {
										local434 = local43;
									} else {
										local434 = local54 - 1;
									}
									@Pc(567) int local567 = 13421772;
									if (local547 >= 5 && local547 <= 8 || local547 >= 13 && local547 <= 16 || local547 >= 21 && local547 <= 24 || local547 == 27 || local547 == 28) {
										local547 -= 4;
										local567 = 13369344;
									}
									@Pc(616) int local616;
									if (local233 == 1) {
										local616 = local228;
									} else {
										local616 = local220 - 1;
									}
									if (local547 == 1) {
										Static203.method3608(local43, local228, local233, local567);
									} else if (local547 == 2) {
										Static203.method3606(local43, local228, local59, local567);
									} else if (local547 == 3) {
										Static203.method3608(local434, local228, local233, local567);
									} else if (local547 == 4) {
										Static203.method3606(local43, local616, local59, local567);
									} else if (local547 == 9) {
										Static203.method3608(local43, local228, local233, 16777215);
										Static203.method3606(local43, local228, local59, local567);
									} else if (local547 == 10) {
										Static203.method3608(local434, local228, local233, 16777215);
										Static203.method3606(local43, local228, local59, local567);
									} else if (local547 == 11) {
										Static203.method3608(local434, local228, local233, 16777215);
										Static203.method3606(local43, local616, local59, local567);
									} else if (local547 == 12) {
										Static203.method3608(local43, local228, local233, 16777215);
										Static203.method3606(local43, local616, local59, local567);
									} else if (local547 == 17) {
										Static203.method3606(local43, local228, 1, local567);
									} else if (local547 == 18) {
										Static203.method3606(local434, local228, 1, local567);
									} else if (local547 == 19) {
										Static203.method3606(local434, local616, 1, local567);
									} else if (local547 == 20) {
										Static203.method3606(local43, local616, 1, local567);
									} else {
										@Pc(709) int local709;
										if (local547 == 25) {
											for (local709 = 0; local709 < local233; local709++) {
												Static203.method3606(local709 + local43, -local709 + local616, 1, local567);
											}
										} else if (local547 == 26) {
											for (local709 = 0; local709 < local233; local709++) {
												Static203.method3606(local43 + local709, local709 + local228, 1, local567);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local43 += arg2;
					for (@Pc(89) int local89 = 0; local89 < local26; local89++) {
						if (Static176.aClass1_Sub2_Sub9_2.anInt2168 != -1) {
							local117 = Static176.aClass1_Sub2_Sub9_2.anInt2168;
						} else if ((local89 + arg1 & 0x4) == (local32 + arg6 & 0x4)) {
							local117 = Static62.anIntArray168[Static247.anInt5416 + 1];
						} else {
							local117 = 4936552;
						}
						local137 = arg4 + (local89 * arg3 >> 16);
						if (local117 == 0) {
							local117 = 1;
						}
						local158 = ((local89 + 1) * arg3 >> 16) + arg4;
						local162 = local158 - local137;
						Static203.method3592(local43, local137, local59, local162, local117);
					}
				}
			}
		}
		for (local32 = -2; local32 < local18 + 2; local32++) {
			local43 = arg5 * local32 >> 16;
			local54 = arg5 * (local32 + 1) >> 16;
			local59 = local54 - local43;
			if (local59 > 0) {
				local43 += arg2;
				local68 = local32 + arg6 >> 6;
				if (local68 >= 0 && local68 <= Static76.anIntArrayArrayArray17.length - 1) {
					local181 = Static76.anIntArrayArrayArray17[local68];
					for (local117 = -2; local117 < local26 + 2; local117++) {
						local137 = arg3 * local117 >> 16;
						local158 = (local117 + 1) * arg3 >> 16;
						local162 = local158 - local137;
						if (local162 > 0) {
							local137 += arg4;
							@Pc(944) int local944 = arg1 + local117 >> 6;
							if (local944 >= 0 && local181.length - 1 >= local944) {
								local207 = ((local117 + arg1 & 0x3F) << 6) + (arg6 + local32 & 0x3F);
								if (local181[local944] != null) {
									local228 = local181[local944][local207];
									local220 = local228 & 0x1FFF;
									if (local220 != 0) {
										@Pc(1002) Class126 local1002 = Static75.method1384(local220 - 1);
										local249 = local228 >> 13 & 0x3;
										@Pc(1021) boolean local1021 = (local228 >> 15 & 0x1) == 1;
										@Pc(1027) Class7_Sub1 local1027 = local1002.method3681(local1021, local249);
										if (local1027 != null) {
											local271 = local1027.anInt5432 * local59 / 4;
											local293 = local1027.anInt5433 * local162 / 4;
											if (local1002.aBoolean244) {
												local387 = local228 >> 20 & 0xF;
												local371 = local228 >> 16 & 0xF;
												if ((local249 & 0x1) == 1) {
													local249 = local371;
													local371 = local387;
													local387 = local249;
												}
												local293 = local387 * local162;
												local271 = local371 * local59;
											}
											if (local271 != 0 && local293 != 0) {
												if (local1002.anInt4635 == 0) {
													local1027.method129(local43, local137 + local162 - local293, local271, local293);
												} else {
													local1027.method128(local43, local162 + local137 - local293, local271, local293, local1002.anInt4635);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)I")
	public static int method1920(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class131 local13 = Static240.aClass131ArrayArrayArray1[Static145.anInt3477][arg1][arg0];
		if (local13 == null) {
			Static164.method3048(Static145.anInt3477, arg1, arg0);
			return;
		}
		@Pc(23) int local23 = -99999999;
		@Pc(25) Class1_Sub2_Sub7 local25 = null;
		@Pc(30) Class1_Sub2_Sub7 local30;
		for (local30 = (Class1_Sub2_Sub7) local13.method3791(); local30 != null; local30 = (Class1_Sub2_Sub7) local13.method3792()) {
			@Pc(38) Class138 local38 = Static238.method4099(local30.aClass25_Sub5_1.anInt5784);
			@Pc(41) int local41 = local38.anInt5061;
			if (local38.anInt5053 == 1) {
				local41 *= local30.aClass25_Sub5_1.anInt5781 + 1;
			}
			if (local41 > local23) {
				local25 = local30;
				local23 = local41;
			}
		}
		if (local25 == null) {
			Static164.method3048(Static145.anInt3477, arg1, arg0);
			return;
		}
		local13.method3793(local25);
		@Pc(83) Class25_Sub5 local83 = null;
		local30 = (Class1_Sub2_Sub7) local13.method3791();
		@Pc(90) Class25_Sub5 local90 = null;
		while (local30 != null) {
			@Pc(96) Class25_Sub5 local96 = local30.aClass25_Sub5_1;
			if (local96.anInt5784 != local25.aClass25_Sub5_1.anInt5784) {
				if (local83 == null) {
					local83 = local96;
				}
				if (local96.anInt5784 != local83.anInt5784 && local90 == null) {
					local90 = local96;
				}
			}
			local30 = (Class1_Sub2_Sub7) local13.method3792();
		}
		@Pc(133) long local133 = (long) ((arg0 << 7) + arg1 + 1610612736);
		Static6.method1715(Static145.anInt3477, arg1, arg0, Static220.method3905(arg1 * 128 + 64, arg0 * 128 + 64, Static145.anInt3477), local25.aClass25_Sub5_1, local133, local83, local90);
	}
}
