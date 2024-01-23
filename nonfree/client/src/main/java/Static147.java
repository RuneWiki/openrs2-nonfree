import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Lclient!ah;")
	public static Class6 aClass6_13;

	@OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
	public static int anInt3278 = 0;

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	public static int anInt3280 = 0;

	@OriginalMember(owner = "client!pb", name = "R", descriptor = "Z")
	public static boolean aBoolean181 = true;

	@OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
	public static int anInt3282 = -1;

	@OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
	public static int anInt3284 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BZI[BI[Lclient!ab;)V")
	public static void method2512(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class3[] arg3) {
		@Pc(6) Class1_Sub9 local6 = new Class1_Sub9(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(24) int local24 = local6.method896();
			if (local24 == 0) {
				return;
			}
			local16 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local6.method900();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(56) int local56 = local35 >> 6 & 0x3F;
				@Pc(60) int local60 = local35 & 0x3F;
				@Pc(64) int local64 = local6.method895();
				@Pc(68) int local68 = local60 + arg0;
				@Pc(73) int local73 = local56 + arg2;
				@Pc(77) int local77 = local35 >> 12;
				@Pc(81) int local81 = local64 & 0x3;
				@Pc(85) int local85 = local64 >> 2;
				if (local73 > 0 && local68 > 0 && local73 < 103 && local68 < 103) {
					@Pc(104) Class3 local104 = null;
					@Pc(108) int local108 = local77;
					if ((Static209.aByteArrayArrayArray13[1][local73][local68] & 0x2) == 2) {
						local108 = local77 - 1;
					}
					if (local108 >= 0) {
						local104 = arg3[local108];
					}
					Static50.method1422(local104, local77, local85, Static148.aBoolean266, local77, local73, local16, true, local81, local68);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
	public static void method2513() {
		try {
			if (Static186.anInt3973 == 1) {
				@Pc(16) int local16 = Static37.aClass1_Sub7_Sub3_2.method3398();
				if (local16 > 0 && Static37.aClass1_Sub7_Sub3_2.method3410()) {
					local16 -= Static37.anInt869;
					if (local16 < 0) {
						local16 = 0;
					}
					Static37.aClass1_Sub7_Sub3_2.method3426(local16);
				} else {
					Static37.aClass1_Sub7_Sub3_2.method3404();
					Static37.aClass1_Sub7_Sub3_2.method3421();
					Static206.aClass75_1 = null;
					Static11.aClass1_Sub23_105 = null;
					if (Static190.aClass7_35 == null) {
						Static186.anInt3973 = 0;
					} else {
						Static186.anInt3973 = 2;
					}
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static37.aClass1_Sub7_Sub3_2.method3404();
			Static11.aClass1_Sub23_105 = null;
			Static186.anInt3973 = 0;
			Static206.aClass75_1 = null;
			Static190.aClass7_35 = null;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
	public static void method2514(@OriginalArg(0) byte[] arg0) {
		@Pc(9) byte[][] local9 = new byte[Static211.anInt3462][Static30.anInt724];
		@Pc(11) int local11 = 0;
		@Pc(17) int local17 = Static142.anInt3199 >> 2 << 10;
		@Pc(21) int local21 = Static19.anInt473 >> 1;
		while (true) {
			@Pc(35) int local35;
			@Pc(47) int local47;
			while (arg0.length > local11) {
				local35 = (arg0[local11++] & 0xFF) * 64 - Static73.anInt1791;
				local47 = (arg0[local11++] & 0xFF) * 64 - Static153.anInt3417;
				if (local35 > 0 && local47 > 0 && local35 + 64 < Static211.anInt3462 && Static30.anInt724 > local47 + 64) {
					for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
						@Pc(82) byte[] local82 = local9[local73 + local35];
						@Pc(89) int local89 = Static30.anInt724 - local47 - 1;
						for (@Pc(91) int local91 = -64; local91 < 0; local91++) {
							local82[local89--] = arg0[local11++];
						}
					}
				} else {
					local11 += 4096;
				}
			}
			local35 = Static211.anInt3462;
			local47 = Static30.anInt724;
			@Pc(125) int[] local125 = new int[local47];
			@Pc(133) int[] local133 = new int[local47];
			@Pc(136) int[] local136 = new int[local47];
			@Pc(139) int[] local139 = new int[local47];
			@Pc(142) int[] local142 = new int[local47];
			for (@Pc(144) int local144 = -5; local144 < local35; local144++) {
				@Pc(169) int local169;
				@Pc(230) int local230;
				for (@Pc(148) int local148 = 0; local148 < local47; local148++) {
					@Pc(154) int local154 = local144 + 5;
					@Pc(213) int local213;
					if (local35 > local154) {
						local169 = local9[local154][local148] & 0xFF;
						if (local169 > 0) {
							@Pc(177) Class1_Sub1_Sub24 local177 = Static171.method2785(local169 - 1);
							local125[local148] += local177.anInt4119;
							local133[local148] += local177.anInt4122;
							local139[local148] += local177.anInt4120;
							local136[local148] += local177.anInt4117;
							local213 = local142[local148]++;
						}
					}
					local169 = local144 - 5;
					if (local169 >= 0) {
						local230 = local9[local169][local148] & 0xFF;
						if (local230 > 0) {
							@Pc(241) Class1_Sub1_Sub24 local241 = Static171.method2785(local230 - 1);
							local125[local148] -= local241.anInt4119;
							local133[local148] -= local241.anInt4122;
							local139[local148] -= local241.anInt4120;
							local136[local148] -= local241.anInt4117;
							local213 = local142[local148]--;
						}
					}
				}
				if (local144 >= 0) {
					@Pc(296) int[][] local296 = Static155.anIntArrayArrayArray19[local144 >> 6];
					local230 = 0;
					local169 = 0;
					@Pc(302) int local302 = 0;
					@Pc(304) int local304 = 0;
					@Pc(306) int local306 = 0;
					for (@Pc(308) int local308 = -5; local308 < local47; local308++) {
						@Pc(314) int local314 = local308 + 5;
						@Pc(318) int local318 = local308 - 5;
						if (local314 < local47) {
							local306 += local136[local314];
							local302 += local139[local314];
							local169 += local125[local314];
							local304 += local142[local314];
							local230 += local133[local314];
						}
						if (local318 >= 0) {
							local306 -= local136[local318];
							local304 -= local142[local318];
							local302 -= local139[local318];
							local169 -= local125[local318];
							local230 -= local133[local318];
						}
						if (local308 >= 0 && local304 > 0) {
							@Pc(401) int local401 = local308 >> 6;
							@Pc(424) int local424 = local306 == 0 ? 0 : Static115.method1973(local230 / local304, local169 * 256 / local306, local302 / local304);
							if (local9[local144][local308] != 0) {
								if (local296[local401] == null) {
									local296[local401] = Static155.anIntArrayArrayArray19[local144 >> 6][local401] = new int[4096];
								}
								@Pc(473) int local473 = (local424 & 0x7F) + local21;
								if (local473 < 0) {
									local473 = 0;
								} else if (local473 > 127) {
									local473 = 127;
								}
								@Pc(499) int local499 = local473 + (local424 & 0x380) + (local17 + local424 & 0xFC00);
								local296[local401][(local144 & 0x3F) + ((local308 & 0x3F) << 6)] = Static81.anIntArray227[Static184.method2916(local499, 96)];
							} else if (local296[local401] != null) {
								local296[local401][(local144 & 0x3F) + ((local308 & 0x3F) << 6)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!mc;Lclient!nc;I)V")
	public static void method2515(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class1_Sub9 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1_Sub18 local13 = new Class1_Sub18();
		local13.anInt2895 = arg1.method895();
		local13.anInt2896 = arg1.method915();
		local13.anIntArray377 = new int[local13.anInt2895];
		local13.anIntArray379 = new int[local13.anInt2895];
		local13.anIntArray378 = new int[local13.anInt2895];
		local13.aClass36Array1 = new Class36[local13.anInt2895];
		local13.aByteArrayArrayArray5 = new byte[local13.anInt2895][][];
		local13.aClass36Array2 = new Class36[local13.anInt2895];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt2895; local55++) {
			try {
				@Pc(61) int local61 = arg1.method895();
				@Pc(91) String local91;
				@Pc(102) String local102;
				@Pc(106) int local106;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local91 = new String(arg1.method935().method1831());
					local102 = new String(arg1.method935().method1831());
					local106 = 0;
					if (local61 == 1) {
						local106 = arg1.method915();
					}
					local13.anIntArray377[local55] = local61;
					local13.anIntArray379[local55] = local106;
					local13.aClass36Array2[local55] = arg0.method2006(Static160.method2687(local91), local102);
				} else if (local61 == 3 || local61 == 4) {
					local91 = new String(arg1.method935().method1831());
					local102 = new String(arg1.method935().method1831());
					local106 = arg1.method895();
					@Pc(109) String[] local109 = new String[local106];
					for (@Pc(111) int local111 = 0; local111 < local106; local111++) {
						local109[local111] = new String(arg1.method935().method1831());
					}
					@Pc(135) byte[][] local135 = new byte[local106][];
					@Pc(148) int local148;
					if (local61 == 3) {
						for (@Pc(142) int local142 = 0; local142 < local106; local142++) {
							local148 = arg1.method915();
							local135[local142] = new byte[local148];
							arg1.method919(local148, local135[local142]);
						}
					}
					local13.anIntArray377[local55] = local61;
					@Pc(173) Class[] local173 = new Class[local106];
					for (local148 = 0; local148 < local106; local148++) {
						local173[local148] = Static160.method2687(local109[local148]);
					}
					local13.aClass36Array1[local55] = arg0.method2010(local173, Static160.method2687(local91), local102);
					local13.aByteArrayArrayArray5[local55] = local135;
				}
			} catch (@Pc(262) ClassNotFoundException local262) {
				local13.anIntArray378[local55] = -1;
			} catch (@Pc(269) SecurityException local269) {
				local13.anIntArray378[local55] = -2;
			} catch (@Pc(276) NullPointerException local276) {
				local13.anIntArray378[local55] = -3;
			} catch (@Pc(283) Exception local283) {
				local13.anIntArray378[local55] = -4;
			} catch (@Pc(290) Throwable local290) {
				local13.anIntArray378[local55] = -5;
			}
		}
		Static13.aClass19_1.method620(local13);
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
	public static void method2516() {
		if (Static49.aBooleanArray5[98]) {
			Static143.anInt3217 += (12 - Static143.anInt3217) / 2;
		} else if (Static49.aBooleanArray5[99]) {
			Static143.anInt3217 += (-Static143.anInt3217 - 12) / 2;
		} else {
			Static143.anInt3217 /= 2;
		}
		Static124.anInt2765 += Static143.anInt3217 / 2;
		if (Static49.aBooleanArray5[96]) {
			Static111.anInt2542 += (-Static111.anInt2542 - 24) / 2;
		} else if (Static49.aBooleanArray5[97]) {
			Static111.anInt2542 += (24 - Static111.anInt2542) / 2;
		} else {
			Static111.anInt2542 /= 2;
		}
		Static31.anInt799 += Static111.anInt2542 / 2;
		@Pc(94) int local94 = Static83.anInt1954 + Static84.aClass9_Sub4_Sub1_2.anInt3925;
		@Pc(100) int local100 = Static84.aClass9_Sub4_Sub1_2.anInt3903 + Static192.anInt4108;
		if (Static44.anInt1007 - local94 < -500 || Static44.anInt1007 - local94 > 500 || Static218.anInt4727 - local100 < -500 || Static218.anInt4727 - local100 > 500) {
			Static44.anInt1007 = local94;
			Static218.anInt4727 = local100;
		}
		if (local94 != Static44.anInt1007) {
			Static44.anInt1007 += (local94 - Static44.anInt1007) / 16;
		}
		if (Static218.anInt4727 != local100) {
			Static218.anInt4727 += (local100 - Static218.anInt4727) / 16;
		}
		Static95.method2547();
	}
}
