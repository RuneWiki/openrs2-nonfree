import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
	public static int anInt4357 = -1;

	@OriginalMember(owner = "client!sh", name = "S", descriptor = "J")
	public static long aLong159 = 0L;

	@OriginalMember(owner = "client!sh", name = "Y", descriptor = "Lclient!qe;")
	private static Class78 aClass78_742 = Static199.method3560("Location");

	@OriginalMember(owner = "client!sh", name = "ab", descriptor = "I")
	public static int anInt4366 = 0;

	@OriginalMember(owner = "client!sh", name = "ib", descriptor = "I")
	public static int anInt4372 = 0;

	@OriginalMember(owner = "client!sh", name = "jb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_743 = aClass78_742;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lclient!c;")
	public static Class2_Sub3_Sub3 method3447(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub3 local10 = (Class2_Sub3_Sub3) Static97.aClass110_10.method3891((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static209.aClass72_235.method3197(Static44.method591(arg0), method3450(arg0));
		local10 = new Class2_Sub3_Sub3();
		if (local24 != null) {
			local10.method321(new Class2_Sub23(local24));
		}
		local10.method331();
		Static97.aClass110_10.method3894(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!oe;)V")
	public static void method3448(@OriginalArg(1) Class72 arg0) {
		Static100.aClass72_137 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)Lclient!va;")
	public static Class104 method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass104_1;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)I")
	private static int method3450(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIBIIII)V")
	public static void method3455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(27) int local27;
		@Pc(55) int local55;
		if (Static121.anInt4906 == 0 && !Static125.aBoolean60) {
			@Pc(21) int local21 = Static226.anInt4902;
			@Pc(23) int local23 = Static149.anInt1846;
			@Pc(25) int local25 = Static210.anInt4638;
			local27 = Static14.anInt3440;
			@Pc(41) int local41 = local21 + (arg0 - arg4) * (local25 - local21) / arg5;
			local55 = local27 + (arg1 - arg3) * (local23 - local27) / arg2;
			Static188.method3487(local41, 0L, (short) 51, local55, Static73.aClass78_352, Static85.aClass78_427);
		}
		@Pc(65) long local65 = -1L;
		for (local27 = 0; local27 < Static110.anInt2438; local27++) {
			@Pc(72) long local72 = Static170.aLongArray10[local27];
			@Pc(79) int local79 = (int) local72 >> 7 & 0x7F;
			@Pc(86) int local86 = (int) local72 >> 29 & 0x3;
			@Pc(93) int local93 = (int) (local72 >>> 32) & Integer.MAX_VALUE;
			local55 = (int) local72 & 0x7F;
			if (local72 != local65) {
				local65 = local72;
				@Pc(185) int local185;
				if (local86 == 2 && Static81.method1347(Static137.anInt3136, local55, local79, local72)) {
					@Pc(123) Class2_Sub3_Sub17 local123 = Static121.method3984(local93);
					if (local123.anIntArray413 != null) {
						local123 = local123.method1867();
					}
					if (local123 == null) {
						continue;
					}
					if (Static121.anInt4906 == 1) {
						Static188.method3487(local55, local72, (short) 6, local79, Static94.method1640(new Class78[] { Static203.aClass78_808, Static128.aClass78_578, local123.aClass78_511 }), Static173.aClass78_690);
					} else if (!Static125.aBoolean60) {
						@Pc(171) Class78[] local171 = local123.aClass78Array20;
						if (Static101.aBoolean85) {
							local171 = Static129.method2339(local171);
						}
						if (local171 != null) {
							for (local185 = 4; local185 >= 0; local185--) {
								if (local171[local185] != null) {
									@Pc(196) short local196 = 0;
									if (local185 == 0) {
										local196 = 35;
									}
									if (local185 == 1) {
										local196 = 40;
									}
									if (local185 == 2) {
										local196 = 38;
									}
									if (local185 == 3) {
										local196 = 22;
									}
									if (local185 == 4) {
										local196 = 1005;
									}
									Static188.method3487(local55, local72, local196, local79, Static94.method1640(new Class78[] { Static38.aClass78_132, local123.aClass78_511 }), local171[local185]);
								}
							}
						}
						Static188.method3487(local55, (long) local123.anInt2402, (short) 1004, local79, Static94.method1640(new Class78[] { Static38.aClass78_132, local123.aClass78_511 }), Static2.aClass78_5);
					} else if ((Static29.anInt530 & 0x4) == 4) {
						Static188.method3487(local55, local72, (short) 21, local79, Static94.method1640(new Class78[] { Static19.aClass78_60, Static128.aClass78_578, local123.aClass78_511 }), Static69.aClass78_317);
					}
				}
				@Pc(337) int local337;
				@Pc(344) Class5_Sub2_Sub1 local344;
				@Pc(396) Class5_Sub2_Sub2 local396;
				if (local86 == 1) {
					@Pc(316) Class5_Sub2_Sub1 local316 = Static95.aClass5_Sub2_Sub1Array1[local93];
					if (local316.aClass2_Sub3_Sub9_1.anInt1284 == 1 && (local316.anInt1849 & 0x7F) == 64 && (local316.anInt1827 & 0x7F) == 64) {
						for (local337 = 0; local337 < Static50.anInt908; local337++) {
							local344 = Static95.aClass5_Sub2_Sub1Array1[Static79.anIntArray286[local337]];
							if (local344 != null && local316 != local344 && local344.aClass2_Sub3_Sub9_1.anInt1284 == 1 && local344.anInt1849 == local316.anInt1849 && local344.anInt1827 == local316.anInt1827) {
								Static130.method2370(local79, local55, Static79.anIntArray286[local337], local344.aClass2_Sub3_Sub9_1);
							}
						}
						for (local185 = 0; local185 < Static180.anInt4193; local185++) {
							local396 = Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local185]];
							if (local396 != null && local396.anInt1849 == local316.anInt1849 && local396.anInt1827 == local316.anInt1827) {
								Static78.method1328(local55, Static16.anIntArray792[local185], local396, local79);
							}
						}
					}
					Static130.method2370(local79, local55, local93, local316.aClass2_Sub3_Sub9_1);
				}
				if (local86 == 0) {
					@Pc(440) Class5_Sub2_Sub2 local440 = Static213.aClass5_Sub2_Sub2Array3[local93];
					if ((local440.anInt1849 & 0x7F) == 64 && (local440.anInt1827 & 0x7F) == 64) {
						for (local337 = 0; local337 < Static50.anInt908; local337++) {
							local344 = Static95.aClass5_Sub2_Sub1Array1[Static79.anIntArray286[local337]];
							if (local344 != null && local344.aClass2_Sub3_Sub9_1.anInt1284 == 1 && local344.anInt1849 == local440.anInt1849 && local440.anInt1827 == local344.anInt1827) {
								Static130.method2370(local79, local55, Static79.anIntArray286[local337], local344.aClass2_Sub3_Sub9_1);
							}
						}
						for (local185 = 0; local185 < Static180.anInt4193; local185++) {
							local396 = Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local185]];
							if (local396 != null && local396 != local440 && local440.anInt1849 == local396.anInt1849 && local396.anInt1827 == local440.anInt1827) {
								Static78.method1328(local55, Static16.anIntArray792[local185], local396, local79);
							}
						}
					}
					Static78.method1328(local55, local93, local440, local79);
				}
				if (local86 == 3) {
					@Pc(548) Class44 local548 = Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local55][local79];
					if (local548 != null) {
						for (@Pc(555) Class2_Sub3_Sub14 local555 = (Class2_Sub3_Sub14) local548.method1366(); local555 != null; local555 = (Class2_Sub3_Sub14) local548.method1360()) {
							local185 = local555.aClass5_Sub6_1.anInt3992;
							@Pc(564) Class2_Sub3_Sub23 local564 = Static32.method3209(local185);
							if (Static121.anInt4906 == 1) {
								Static188.method3487(local55, (long) local185, (short) 3, local79, Static94.method1640(new Class78[] { Static203.aClass78_808, Static152.aClass78_637, local564.aClass78_640 }), Static173.aClass78_690);
							} else if (!Static125.aBoolean60) {
								@Pc(645) Class78[] local645 = local564.aClass78Array25;
								if (Static101.aBoolean85) {
									local645 = Static129.method2339(local645);
								}
								for (@Pc(653) int local653 = 4; local653 >= 0; local653--) {
									if (local645 != null && local645[local653] != null) {
										@Pc(666) byte local666 = 0;
										if (local653 == 0) {
											local666 = 2;
										}
										if (local653 == 1) {
											local666 = 33;
										}
										if (local653 == 2) {
											local666 = 29;
										}
										if (local653 == 3) {
											local666 = 37;
										}
										if (local653 == 4) {
											local666 = 31;
										}
										Static188.method3487(local55, (long) local185, local666, local79, Static94.method1640(new Class78[] { Static113.aClass78_532, local564.aClass78_640 }), local645[local653]);
									} else if (local653 == 2) {
										Static188.method3487(local55, (long) local185, (short) 29, local79, Static94.method1640(new Class78[] { Static113.aClass78_532, local564.aClass78_640 }), Static127.aClass78_862);
									}
								}
								Static188.method3487(local55, (long) local185, (short) 1002, local79, Static94.method1640(new Class78[] { Static113.aClass78_532, local564.aClass78_640 }), Static2.aClass78_5);
							} else if ((Static29.anInt530 & 0x1) == 1) {
								Static188.method3487(local55, (long) local185, (short) 9, local79, Static94.method1640(new Class78[] { Static19.aClass78_60, Static152.aClass78_637, local564.aClass78_640 }), Static69.aClass78_317);
							}
						}
					}
				}
			}
		}
	}
}
