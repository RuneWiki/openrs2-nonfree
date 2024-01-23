import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!wd;")
	public static Class111 aClass111_9;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt953;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[I")
	public static int[] anIntArray149;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_185 = Static199.method3560(")3runescape)3com");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method684(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!rd;ILclient!t;I)V")
	public static void method686(@OriginalArg(0) Class72_Sub1 arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class44 local9 = Static202.aClass44_57;
		synchronized (Static202.aClass44_57) {
			for (@Pc(16) Class2_Sub16 local16 = (Class2_Sub16) Static202.aClass44_57.method1359(); local16 != null; local16 = (Class2_Sub16) Static202.aClass44_57.method1356()) {
				if (local16.aLong188 == (long) arg2 && local16.aClass88_1 == arg1 && local16.anInt1364 == 0) {
					local7 = local16.aByteArray22;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(70) byte[] local70 = arg1.method3495(arg2);
			arg0.method3203(local70, arg1, true, arg2);
		} else {
			arg0.method3203(local7, arg1, true, arg2);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII[[[Lclient!df;)V")
	public static void method687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub12[][][] arg3) {
		@Pc(8) byte local8 = (byte) (Static25.anInt457 & 0xFF);
		if (local8 == Static205.aByteArrayArrayArray5[Static137.anInt3136][arg1][arg0]) {
			return;
		}
		@Pc(32) byte local32 = 0;
		Static86.anIntArray341[0] = arg1;
		@Pc(38) int local38 = 0;
		@Pc(41) int local41 = local32 + 1;
		Static110.anIntArray419[0] = arg0;
		Static205.aByteArrayArrayArray5[Static137.anInt3136][arg1][arg0] = local8;
		while (local38 != local41) {
			@Pc(58) int local58 = Static86.anIntArray341[local38] & 0xFFFF;
			@Pc(66) int local66 = Static86.anIntArray341[local38] >> 16 & 0xFF;
			@Pc(74) int local74 = Static86.anIntArray341[local38] >> 24 & 0xFF;
			@Pc(80) int local80 = Static110.anIntArray419[local38] & 0xFFFF;
			@Pc(82) boolean local82 = false;
			if ((Static133.aByteArrayArrayArray10[Static137.anInt3136][local58][local80] & 0x4) == 0) {
				local82 = true;
			}
			@Pc(105) int local105 = Static110.anIntArray419[local38] >> 16 & 0xFF;
			local38 = local38 + 1 & 0xFFF;
			@Pc(113) boolean local113 = false;
			@Pc(154) int local154;
			@Pc(183) int local183;
			label214: for (@Pc(117) int local117 = Static137.anInt3136 + 1; local117 <= 3; local117++) {
				if ((Static133.aByteArrayArrayArray10[local117][local58][local80] & 0x8) == 0) {
					@Pc(296) int local296;
					if (local82 && arg3[local117][local58][local80] != null) {
						if (arg3[local117][local58][local80].aClass27_1 != null) {
							local154 = Static200.method3565(local66);
							if (arg3[local117][local58][local80].aClass27_1.anInt811 == local154 || arg3[local117][local58][local80].aClass27_1.anInt812 == local154) {
								continue;
							}
							if (local74 != 0) {
								local183 = Static200.method3565(local74);
								if (arg3[local117][local58][local80].aClass27_1.anInt811 == local183 || arg3[local117][local58][local80].aClass27_1.anInt812 == local183) {
									continue;
								}
							}
							if (local105 != 0) {
								local183 = Static200.method3565(local105);
								if (local183 == arg3[local117][local58][local80].aClass27_1.anInt811 || arg3[local117][local58][local80].aClass27_1.anInt812 == local183) {
									continue;
								}
							}
						}
						if (arg3[local117][local58][local80].aClass100Array3 != null) {
							for (local154 = 0; local154 < arg3[local117][local58][local80].anInt775; local154++) {
								local183 = (int) (arg3[local117][local58][local80].aClass100Array3[local154].aLong169 >> 14 & 0x3FL);
								@Pc(285) int local285 = (int) (arg3[local117][local58][local80].aClass100Array3[local154].aLong169 >> 20 & 0x3L);
								if (local183 == 21) {
									local183 = 19;
								}
								local296 = local285 << 6 | local183;
								if (local66 == local296 || local74 != 0 && local74 == local296 || local105 != 0 && local105 == local296) {
									continue label214;
								}
							}
						}
					}
					@Pc(340) Class2_Sub12 local340 = arg3[local117][local58][local80];
					local113 = true;
					if (local340 != null && local340.anInt775 > 0) {
						for (local183 = 0; local183 < local340.anInt775; local183++) {
							@Pc(358) Class100 local358 = local340.aClass100Array3[local183];
							if (local358.anInt4529 != local358.anInt4525 || local358.anInt4528 != local358.anInt4517) {
								for (local296 = local358.anInt4529; local296 <= local358.anInt4525; local296++) {
									for (@Pc(379) int local379 = local358.anInt4517; local379 <= local358.anInt4528; local379++) {
										Static205.aByteArrayArrayArray5[local117][local296][local379] = local8;
									}
								}
							}
						}
					}
					Static205.aByteArrayArrayArray5[local117][local58][local80] = local8;
				}
			}
			if (local113) {
				if (Static169.anIntArray646[arg2] < Static144.anIntArrayArrayArray7[Static137.anInt3136 + 1][local58][local80]) {
					Static169.anIntArray646[arg2] = Static144.anIntArrayArrayArray7[Static137.anInt3136 + 1][local58][local80];
				}
				local183 = local80 << 7;
				local154 = local58 << 7;
				if (Static122.anIntArray293[arg2] > local154) {
					Static122.anIntArray293[arg2] = local154;
				} else if (Static145.anIntArray542[arg2] < local154) {
					Static145.anIntArray542[arg2] = local154;
				}
				if (Static12.anIntArray45[arg2] > local183) {
					Static12.anIntArray45[arg2] = local183;
				} else if (Static69.anIntArray243[arg2] < local183) {
					Static69.anIntArray243[arg2] = local183;
				}
			}
			if (!local82) {
				if (local58 >= 1 && local8 != Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 - 1][local80]) {
					Static86.anIntArray341[local41] = local58 - 1 | 0x120000 | 0xD3000000;
					Static110.anIntArray419[local41] = local80 | 0x130000;
					Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 - 1][local80] = local8;
					local41 = local41 + 1 & 0xFFF;
				}
				local80++;
				if (local80 < 104) {
					if (local58 - 1 >= 0 && local8 != Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 - 1][local80] && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58][local80] & 0x4) == 0 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58 - 1][local80 - 1] & 0x4) == 0) {
						Static86.anIntArray341[local41] = local58 - 1 | 0x52000000 | 0x120000;
						Static110.anIntArray419[local41] = local80 | 0x130000;
						Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 - 1][local80] = local8;
						local41 = local41 + 1 & 0xFFF;
					}
					if (Static205.aByteArrayArrayArray5[Static137.anInt3136][local58][local80] != local8) {
						Static86.anIntArray341[local41] = local58 | 0x520000 | 0x13000000;
						Static110.anIntArray419[local41] = local80 | 0x530000;
						Static205.aByteArrayArrayArray5[Static137.anInt3136][local58][local80] = local8;
						local41 = local41 + 1 & 0xFFF;
					}
					if (local58 + 1 < 104 && Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 + 1][local80] != local8 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58][local80] & 0x4) == 0 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58 + 1][local80 - 1] & 0x4) == 0) {
						Static86.anIntArray341[local41] = 0x92000000 | 0x520000 | local58 + 1;
						Static110.anIntArray419[local41] = local80 | 0x530000;
						Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 + 1][local80] = local8;
						local41 = local41 + 1 & 0xFFF;
					}
				}
				local80--;
				if (local58 + 1 < 104 && local8 != Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 + 1][local80]) {
					Static86.anIntArray341[local41] = local58 + 1 | 0x920000 | 0x53000000;
					Static110.anIntArray419[local41] = local80 | 0x930000;
					Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 + 1][local80] = local8;
					local41 = local41 + 1 & 0xFFF;
				}
				local80--;
				if (local80 >= 0) {
					if (local58 - 1 >= 0 && Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 - 1][local80] != local8 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58][local80] & 0x4) == 0 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58 - 1][local80 + 1] & 0x4) == 0) {
						Static86.anIntArray341[local41] = local58 - 1 | 0x12000000 | 0xD20000;
						Static110.anIntArray419[local41] = local80 | 0xD30000;
						Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 - 1][local80] = local8;
						local41 = local41 + 1 & 0xFFF;
					}
					if (Static205.aByteArrayArrayArray5[Static137.anInt3136][local58][local80] != local8) {
						Static86.anIntArray341[local41] = local58 | 0xD20000 | 0x93000000;
						Static110.anIntArray419[local41] = local80 | 0xD30000;
						Static205.aByteArrayArrayArray5[Static137.anInt3136][local58][local80] = local8;
						local41 = local41 + 1 & 0xFFF;
					}
					if (local58 + 1 < 104 && local8 != Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 + 1][local80] && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58][local80] & 0x4) == 0 && (Static133.aByteArrayArrayArray10[Static137.anInt3136][local58 + 1][local80 + 1] & 0x4) == 0) {
						Static86.anIntArray341[local41] = local58 + 1 | 0x920000 | 0xD2000000;
						Static110.anIntArray419[local41] = local80 | 0x930000;
						local41 = local41 + 1 & 0xFFF;
						Static205.aByteArrayArrayArray5[Static137.anInt3136][local58 + 1][local80] = local8;
					}
				}
			}
		}
		if (Static169.anIntArray646[arg2] == -1000000) {
			return;
		}
		Static169.anIntArray646[arg2] += 10;
		Static122.anIntArray293[arg2] -= 50;
		Static145.anIntArray542[arg2] += 50;
		Static69.anIntArray243[arg2] += 50;
		Static12.anIntArray45[arg2] -= 50;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([BI)V")
	public static void method688(@OriginalArg(0) byte[] arg0) {
		@Pc(14) byte[][] local14 = new byte[Static151.anInt3457][Static30.anInt547];
		@Pc(20) int local20 = Static179.anInt4185 >> 2 << 10;
		@Pc(24) int local24 = Static40.anInt747 >> 1;
		@Pc(26) int local26 = 0;
		while (true) {
			@Pc(40) int local40;
			@Pc(51) int local51;
			while (local26 < arg0.length) {
				local40 = (arg0[local26++] & 0xFF) * 64 - Static221.anInt4795;
				local51 = (arg0[local26++] & 0xFF) * 64 - Static45.anInt815;
				if (local40 > 0 && local51 > 0 && local40 + 64 < Static151.anInt3457 && local51 + 64 < Static30.anInt547) {
					for (@Pc(84) int local84 = 0; local84 < 64; local84++) {
						@Pc(93) int local93 = Static30.anInt547 - local51 - 1;
						@Pc(100) byte[] local100 = local14[local84 + local40];
						for (@Pc(102) int local102 = -64; local102 < 0; local102++) {
							local100[local93--] = arg0[local26++];
						}
					}
				} else {
					local26 += 4096;
				}
			}
			local40 = Static151.anInt3457;
			local51 = Static30.anInt547;
			@Pc(139) int[] local139 = new int[local51];
			@Pc(142) int[] local142 = new int[local51];
			@Pc(145) int[] local145 = new int[local51];
			@Pc(148) int[] local148 = new int[local51];
			@Pc(151) int[] local151 = new int[local51];
			for (@Pc(153) int local153 = -5; local153 < local40; local153++) {
				@Pc(178) int local178;
				@Pc(242) int local242;
				for (@Pc(157) int local157 = 0; local157 < local51; local157++) {
					@Pc(163) int local163 = local153 + 5;
					@Pc(222) int local222;
					if (local40 > local163) {
						local178 = local14[local163][local157] & 0xFF;
						if (local178 > 0) {
							@Pc(186) Class2_Sub3_Sub12 local186 = Static134.method2446(local178 - 1);
							local139[local157] += local186.anInt1626;
							local142[local157] += local186.anInt1628;
							local148[local157] += local186.anInt1616;
							local145[local157] += local186.anInt1619;
							local222 = local151[local157]++;
						}
					}
					local178 = local153 - 5;
					if (local178 >= 0) {
						local242 = local14[local178][local157] & 0xFF;
						if (local242 > 0) {
							@Pc(250) Class2_Sub3_Sub12 local250 = Static134.method2446(local242 - 1);
							local139[local157] -= local250.anInt1626;
							local142[local157] -= local250.anInt1628;
							local148[local157] -= local250.anInt1616;
							local145[local157] -= local250.anInt1619;
							local222 = local151[local157]--;
						}
					}
				}
				if (local153 >= 0) {
					@Pc(304) int[][] local304 = Static159.anIntArrayArrayArray12[local153 >> 6];
					local178 = 0;
					@Pc(308) int local308 = 0;
					local242 = 0;
					@Pc(312) int local312 = 0;
					@Pc(314) int local314 = 0;
					for (@Pc(316) int local316 = -5; local316 < local51; local316++) {
						@Pc(322) int local322 = local316 + 5;
						if (local322 < local51) {
							local314 += local151[local322];
							local242 += local142[local322];
							local178 += local139[local322];
							local312 += local145[local322];
							local308 += local148[local322];
						}
						@Pc(363) int local363 = local316 - 5;
						if (local363 >= 0) {
							local242 -= local142[local363];
							local314 -= local151[local363];
							local178 -= local139[local363];
							local308 -= local148[local363];
							local312 -= local145[local363];
						}
						if (local316 >= 0 && local314 > 0) {
							@Pc(406) int local406 = local316 >> 6;
							@Pc(427) int local427 = local312 == 0 ? 0 : Static152.method2738(local242 / local314, local308 / local314, local178 * 256 / local312);
							if (local14[local153][local316] != 0) {
								if (local304[local406] == null) {
									local304[local406] = Static159.anIntArrayArrayArray12[local153 >> 6][local406] = new int[4096];
								}
								@Pc(476) int local476 = local24 + (local427 & 0x7F);
								if (local476 < 0) {
									local476 = 0;
								} else if (local476 > 127) {
									local476 = 127;
								}
								@Pc(502) int local502 = local476 + (local427 & 0x380) + (local427 + local20 & 0xFC00);
								local304[local406][((local316 & 0x3F) << 6) + (local153 & 0x3F)] = Static163.anIntArray630[Static5.method97(96, local502)];
							} else if (local304[local406] != null) {
								local304[local406][((local316 & 0x3F) << 6) + (local153 & 0x3F)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}
}
