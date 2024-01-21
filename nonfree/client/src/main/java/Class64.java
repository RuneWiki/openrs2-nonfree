import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class64 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	private int anInt2281 = 0;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "[Lclient!cf;")
	private final Class12[] aClass12Array3 = new Class12[5000];

	@OriginalMember(owner = "client!q", name = "J", descriptor = "I")
	private int anInt2305 = 0;

	@OriginalMember(owner = "client!q", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray24 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!q", name = "X", descriptor = "[[I")
	private final int[][] anIntArrayArray25 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!q", name = "w", descriptor = "I")
	private final int anInt2295;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	private final int anInt2285;

	@OriginalMember(owner = "client!q", name = "E", descriptor = "I")
	private final int anInt2301;

	@OriginalMember(owner = "client!q", name = "F", descriptor = "[[[Lclient!ba;")
	private final Class8_Sub2[][][] aClass8_Sub2ArrayArrayArray1;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!q", name = "y", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(III[[[I)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2295 = arg0;
		this.anInt2285 = arg1;
		this.anInt2301 = arg2;
		this.aClass8_Sub2ArrayArrayArray1 = new Class8_Sub2[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray7 = arg3;
		this.method1411();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!cb;IIIIIII)V")
	private void method1385(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static98.anInt2298;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static98.anInt2307;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray7[arg1][arg6][arg7] - Static98.anInt2303;
		@Pc(51) int local51 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static98.anInt2303;
		@Pc(66) int local66 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static98.anInt2303;
		@Pc(79) int local79 = this.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static98.anInt2303;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static11.anInt289 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static11.anInt288 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static11.anInt289 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static11.anInt288 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static11.anInt289 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static11.anInt288 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static11.anInt289 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static11.anInt288 + (local89 << 9) / local265;
		Static11.anInt285 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static11.aBoolean11 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static11.anInt284 || local327 > Static11.anInt284 || local295 > Static11.anInt284) {
				Static11.aBoolean11 = true;
			}
			if (Static98.aBoolean89 && this.method1418(Static98.anInt2287, Static98.anInt2292, local319, local335, local303, local311, local327, local295)) {
				Static98.anInt2291 = arg6;
				Static98.anInt2284 = arg7;
			}
			if (arg0.anInt369 == -1) {
				if (arg0.anInt377 != 12345678) {
					Static11.method183(local319, local335, local303, local311, local327, local295, arg0.anInt377, arg0.anInt371, arg0.anInt368);
				}
			} else if (Static98.aBoolean90) {
				local472 = Static11.anInterface3_1.method616(arg0.anInt369);
				Static11.method183(local319, local335, local303, local311, local327, local295, Static98.method1386(local472, arg0.anInt377), Static98.method1386(local472, arg0.anInt371), Static98.method1386(local472, arg0.anInt368));
			} else if (arg0.aBoolean18) {
				Static11.method175(local319, local335, local303, local311, local327, local295, arg0.anInt377, arg0.anInt371, arg0.anInt368, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt369);
			} else {
				Static11.method175(local319, local335, local303, local311, local327, local295, arg0.anInt377, arg0.anInt371, arg0.anInt368, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt369);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static11.aBoolean11 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static11.anInt284 || local295 > Static11.anInt284 || local327 > Static11.anInt284) {
			Static11.aBoolean11 = true;
		}
		if (Static98.aBoolean89 && this.method1418(Static98.anInt2287, Static98.anInt2292, local287, local303, local335, local279, local295, local327)) {
			Static98.anInt2291 = arg6;
			Static98.anInt2284 = arg7;
		}
		if (arg0.anInt369 != -1) {
			if (!Static98.aBoolean90) {
				Static11.method175(local287, local303, local335, local279, local295, local327, arg0.anInt372, arg0.anInt368, arg0.anInt371, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt369);
				return;
			}
			local472 = Static11.anInterface3_1.method616(arg0.anInt369);
			Static11.method183(local287, local303, local335, local279, local295, local327, Static98.method1386(local472, arg0.anInt372), Static98.method1386(local472, arg0.anInt368), Static98.method1386(local472, arg0.anInt371));
		} else if (arg0.anInt372 != 12345678) {
			Static11.method183(local287, local303, local335, local279, local295, local327, arg0.anInt372, arg0.anInt368, arg0.anInt371);
			return;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III)Lclient!cf;")
	public Class12 method1387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt195; local14++) {
			@Pc(20) Class12 local20 = local8.aClass12Array1[local14];
			if ((local20.anInt498 >> 29 & 0x3) == 2 && local20.anInt488 == arg1 && local20.anInt489 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(III)V")
	public void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass74_1 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)I")
	public int method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass74_1 != null && local8.aClass74_1.anInt2623 == arg3) {
			return local8.aClass74_1.anInt2621 & 0xFF;
		} else if (local8.aClass67_1 != null && local8.aClass67_1.anInt2386 == arg3) {
			return local8.aClass67_1.anInt2384 & 0xFF;
		} else if (local8.aClass18_1 != null && local8.aClass18_1.anInt851 == arg3) {
			return local8.aClass18_1.anInt850 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt195; local56++) {
				if (local8.aClass12Array1[local56].anInt498 == arg3) {
					return local8.aClass12Array1[local56].anInt506 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!ka;II)V")
	public void method1392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class18 local6 = new Class18();
		local6.aClass8_Sub1_Sub1_2 = arg4;
		local6.anInt843 = arg1 * 128 + 64;
		local6.anInt849 = arg2 * 128 + 64;
		local6.anInt841 = arg3;
		local6.anInt851 = arg5;
		local6.anInt850 = arg6;
		if (this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2] = new Class8_Sub2(arg0, arg1, arg2);
		}
		this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass18_1 = local6;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([IIIIII)V")
	public void method1393(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class11 local14 = local8.aClass11_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt375;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class73 local59 = local8.aClass73_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2580;
		@Pc(68) int local68 = local59.anInt2583;
		@Pc(71) int local71 = local59.anInt2582;
		@Pc(74) int local74 = local59.anInt2581;
		@Pc(79) int[] local79 = this.anIntArrayArray24[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray25[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
	private void method1394() {
		@Pc(3) int local3 = Static98.anIntArray314[Static98.anInt2304];
		@Pc(7) Class1[] local7 = Static98.aClass1ArrayArray1[Static98.anInt2304];
		Static98.anInt2293 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class1 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt25 == 1) {
				local27 = local16.anInt1 + 25 - Static98.anInt2296;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt23 + 25 - Static98.anInt2299;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt5 + 25 - Static98.anInt2299;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static98.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static98.anInt2298 - local16.anInt11;
						if (local79 > 32) {
							local16.anInt20 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt20 = 2;
							local79 = -local79;
						}
						local16.anInt18 = (local16.anInt21 - Static98.anInt2307 << 8) / local79;
						local16.anInt19 = (local16.anInt4 - Static98.anInt2307 << 8) / local79;
						local16.anInt15 = (local16.anInt10 - Static98.anInt2303 << 8) / local79;
						local16.anInt13 = (local16.anInt22 - Static98.anInt2303 << 8) / local79;
						Static98.aClass1Array1[Static98.anInt2293++] = local16;
					}
				}
			} else if (local16.anInt25 == 2) {
				local27 = local16.anInt23 + 25 - Static98.anInt2299;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1 + 25 - Static98.anInt2296;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt17 + 25 - Static98.anInt2296;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static98.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static98.anInt2307 - local16.anInt21;
						if (local79 > 32) {
							local16.anInt20 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt20 = 4;
							local79 = -local79;
						}
						local16.anInt3 = (local16.anInt11 - Static98.anInt2298 << 8) / local79;
						local16.anInt2 = (local16.anInt9 - Static98.anInt2298 << 8) / local79;
						local16.anInt15 = (local16.anInt10 - Static98.anInt2303 << 8) / local79;
						local16.anInt13 = (local16.anInt22 - Static98.anInt2303 << 8) / local79;
						Static98.aClass1Array1[Static98.anInt2293++] = local16;
					}
				}
			} else if (local16.anInt25 == 4) {
				local27 = local16.anInt10 - Static98.anInt2303;
				if (local27 > 128) {
					local40 = local16.anInt23 + 25 - Static98.anInt2299;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt5 + 25 - Static98.anInt2299;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1 + 25 - Static98.anInt2296;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt17 + 25 - Static98.anInt2296;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static98.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt20 = 5;
							local16.anInt3 = (local16.anInt11 - Static98.anInt2298 << 8) / local27;
							local16.anInt2 = (local16.anInt9 - Static98.anInt2298 << 8) / local27;
							local16.anInt18 = (local16.anInt21 - Static98.anInt2307 << 8) / local27;
							local16.anInt19 = (local16.anInt4 - Static98.anInt2307 << 8) / local27;
							Static98.aClass1Array1[Static98.anInt2293++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIILclient!ka;III)Z")
	public boolean method1396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1403(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(III)I")
	public int method1397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass74_1 == null ? 0 : local8.aClass74_1.anInt2623;
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(III)I")
	public int method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass67_1 == null ? 0 : local8.aClass67_1.anInt2386;
	}

	@OriginalMember(owner = "client!q", name = "f", descriptor = "(III)Lclient!ec;")
	public Class18 method1399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass18_1 == null ? null : local8.aClass18_1;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(II)V")
	public void method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class8_Sub2 local31 = this.aClass8_Sub2ArrayArrayArray1[local10][arg0][arg1] = this.aClass8_Sub2ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt200--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt195; local41++) {
					@Pc(47) Class12 local47 = local31.aClass12Array1[local41];
					if ((local47.anInt498 >> 29 & 0x3) == 2 && local47.anInt488 == arg0 && local47.anInt489 == arg1) {
						local47.anInt494--;
					}
				}
			}
		}
		if (this.aClass8_Sub2ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass8_Sub2ArrayArrayArray1[0][arg0][arg1] = new Class8_Sub2(0, arg0, arg1);
		}
		this.aClass8_Sub2ArrayArrayArray1[0][arg0][arg1].aClass8_Sub2_1 = local8;
		this.aClass8_Sub2ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIILclient!ka;IIIIII)Z")
	public boolean method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class8_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1403(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()V")
	public void method1402() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2281; local1++) {
			@Pc(7) Class12 local7 = this.aClass12Array3[local1];
			this.method1409(local7);
			this.aClass12Array3[local1] = null;
		}
		this.anInt2281 = 0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIILclient!ka;IZII)Z")
	private boolean method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class8_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2285 || local4 >= this.anInt2301) {
					return false;
				}
				@Pc(28) Class8_Sub2 local28 = this.aClass8_Sub2ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt195 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class12 local52 = new Class12();
		local52.anInt498 = arg11;
		local52.anInt506 = arg12;
		local52.anInt494 = arg0;
		local52.anInt502 = arg5;
		local52.anInt508 = arg6;
		local52.anInt503 = arg7;
		local52.aClass8_Sub1_Sub1_1 = arg8;
		local52.anInt496 = arg9;
		local52.anInt488 = arg1;
		local52.anInt489 = arg2;
		local52.anInt499 = arg1 + arg3 - 1;
		local52.anInt509 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass8_Sub2ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass8_Sub2ArrayArrayArray1[local130][local98][local101] = new Class8_Sub2(local130, local98, local101);
					}
				}
				@Pc(166) Class8_Sub2 local166 = this.aClass8_Sub2ArrayArrayArray1[arg0][local98][local101];
				local166.aClass12Array1[local166.anInt195] = local52;
				local166.anIntArray22[local166.anInt195] = local104;
				local166.anInt193 |= local104;
				local166.anInt195++;
			}
		}
		if (arg10) {
			this.aClass12Array3[this.anInt2281++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(III)Z")
	private boolean method1404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static98.anInt2280) {
			return false;
		} else if (local8 == Static98.anInt2280) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1425(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2], local27 + 1) && this.method1425(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local27 + 1) && this.method1425(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1425(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static98.anInt2280;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static98.anInt2280;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "h", descriptor = "(III)V")
	public void method1405() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2295; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2285; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2301; local7++) {
					@Pc(17) Class8_Sub2 local17 = this.aClass8_Sub2ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class74 local22 = local17.aClass74_1;
						if (local22 != null && local22.aClass8_Sub1_Sub1_5 instanceof Class8_Sub1_Sub1_Sub3) {
							@Pc(32) Class8_Sub1_Sub1_Sub3 local32 = (Class8_Sub1_Sub1_Sub3) local22.aClass8_Sub1_Sub1_5;
							this.method1416(local32, local1, local4, local7, 1, 1);
							if (local22.aClass8_Sub1_Sub1_6 instanceof Class8_Sub1_Sub1_Sub3) {
								@Pc(48) Class8_Sub1_Sub1_Sub3 local48 = (Class8_Sub1_Sub1_Sub3) local22.aClass8_Sub1_Sub1_6;
								this.method1416(local48, local1, local4, local7, 1, 1);
								Static26.method489(local32, local48, 0, 0, 0, false);
								local22.aClass8_Sub1_Sub1_6 = local48.method479(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass8_Sub1_Sub1_5 = local32.method479(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class8_Sub1_Sub1_Sub3 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt195; local87++) {
							@Pc(93) Class12 local93 = local17.aClass12Array1[local87];
							if (local93 != null && local93.aClass8_Sub1_Sub1_1 instanceof Class8_Sub1_Sub1_Sub3) {
								local103 = (Class8_Sub1_Sub1_Sub3) local93.aClass8_Sub1_Sub1_1;
								this.method1416(local103, local1, local4, local7, local93.anInt499 + 1 - local93.anInt488, local93.anInt509 - local93.anInt489 + 1);
								local93.aClass8_Sub1_Sub1_1 = local103.method479(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class18 local142 = local17.aClass18_1;
						if (local142 != null && local142.aClass8_Sub1_Sub1_2 instanceof Class8_Sub1_Sub1_Sub3) {
							local103 = (Class8_Sub1_Sub1_Sub3) local142.aClass8_Sub1_Sub1_2;
							this.method1408(local103, local1, local4, local7);
							local142.aClass8_Sub1_Sub1_2 = local103.method479(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class11 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class11(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass8_Sub2ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass8_Sub2ArrayArrayArray1[local14][arg1][arg2] = new Class8_Sub2(local14, arg1, arg2);
				}
			}
			this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass11_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class11(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass8_Sub2ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass8_Sub2ArrayArrayArray1[local14][arg1][arg2] = new Class8_Sub2(local14, arg1, arg2);
				}
			}
			this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass11_1 = local12;
		} else {
			@Pc(140) Class73 local140 = new Class73(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass8_Sub2ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass8_Sub2ArrayArrayArray1[local14][arg1][arg2] = new Class8_Sub2(local14, arg1, arg2);
				}
			}
			this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass73_1 = local140;
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IIII)V")
	public void method1407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class67 local14 = local8.aClass67_1;
		if (local14 != null) {
			local14.anInt2390 = local14.anInt2390 * arg3 / 16;
			local14.anInt2394 = local14.anInt2394 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!df;III)V")
	private void method1408(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class8_Sub2 local14;
		@Pc(29) Class8_Sub1_Sub1_Sub3 local29;
		if (arg2 < this.anInt2285) {
			local14 = this.aClass8_Sub2ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass18_1 != null && local14.aClass18_1.aClass8_Sub1_Sub1_2 instanceof Class8_Sub1_Sub1_Sub3) {
				local29 = (Class8_Sub1_Sub1_Sub3) local14.aClass18_1.aClass8_Sub1_Sub1_2;
				Static26.method489(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2285) {
			local14 = this.aClass8_Sub2ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass18_1 != null && local14.aClass18_1.aClass8_Sub1_Sub1_2 instanceof Class8_Sub1_Sub1_Sub3) {
				local29 = (Class8_Sub1_Sub1_Sub3) local14.aClass18_1.aClass8_Sub1_Sub1_2;
				Static26.method489(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2285 && arg3 < this.anInt2301) {
			local14 = this.aClass8_Sub2ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass18_1 != null && local14.aClass18_1.aClass8_Sub1_Sub1_2 instanceof Class8_Sub1_Sub1_Sub3) {
				local29 = (Class8_Sub1_Sub1_Sub3) local14.aClass18_1.aClass8_Sub1_Sub1_2;
				Static26.method489(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2285 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass8_Sub2ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass18_1 != null && local14.aClass18_1.aClass8_Sub1_Sub1_2 instanceof Class8_Sub1_Sub1_Sub3) {
			local29 = (Class8_Sub1_Sub1_Sub3) local14.aClass18_1.aClass8_Sub1_Sub1_2;
			Static26.method489(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!cf;)V")
	private void method1409(@OriginalArg(0) Class12 arg0) {
		for (@Pc(2) int local2 = arg0.anInt488; local2 <= arg0.anInt499; local2++) {
			for (@Pc(6) int local6 = arg0.anInt489; local6 <= arg0.anInt509; local6++) {
				@Pc(17) Class8_Sub2 local17 = this.aClass8_Sub2ArrayArrayArray1[arg0.anInt494][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt195; local21++) {
						if (local17.aClass12Array1[local21] == arg0) {
							local17.anInt195--;
							for (local36 = local21; local36 < local17.anInt195; local36++) {
								local17.aClass12Array1[local36] = local17.aClass12Array1[local36 + 1];
								local17.anIntArray22[local36] = local17.anIntArray22[local36 + 1];
							}
							local17.aClass12Array1[local17.anInt195] = null;
							break;
						}
					}
					local17.anInt193 = 0;
					for (local36 = 0; local36 < local17.anInt195; local36++) {
						local17.anInt193 |= local17.anIntArray22[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!ka;Lclient!ka;IIII)V")
	public void method1410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1_Sub1 arg4, @OriginalArg(5) Class8_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class74 local8 = new Class74();
		local8.anInt2623 = arg8;
		local8.anInt2621 = arg9;
		local8.anInt2606 = arg1 * 128 + 64;
		local8.anInt2620 = arg2 * 128 + 64;
		local8.anInt2607 = arg3;
		local8.aClass8_Sub1_Sub1_5 = arg4;
		local8.aClass8_Sub1_Sub1_6 = arg5;
		local8.anInt2616 = arg6;
		local8.anInt2624 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass8_Sub2ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass8_Sub2ArrayArrayArray1[local45][arg1][arg2] = new Class8_Sub2(local45, arg1, arg2);
			}
		}
		this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass74_1 = local8;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
	public void method1411() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2295; local1++) {
			for (local4 = 0; local4 < this.anInt2285; local4++) {
				for (local7 = 0; local7 < this.anInt2301; local7++) {
					this.aClass8_Sub2ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static98.anInt2290; local4++) {
			for (local7 = 0; local7 < Static98.anIntArray314[local4]; local7++) {
				Static98.aClass1ArrayArray1[local4][local7] = null;
			}
			Static98.anIntArray314[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2281; local7++) {
			this.aClass12Array3[local7] = null;
		}
		this.anInt2281 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static98.aClass12Array2.length; local76++) {
			Static98.aClass12Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!tc;IIIIII)V")
	private void method1412(@OriginalArg(0) Class73 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray351.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray351[local5] - Static98.anInt2298;
			local20 = arg0.anIntArray358[local5] - Static98.anInt2303;
			local27 = arg0.anIntArray360[local5] - Static98.anInt2307;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray359 != null) {
				Static114.anIntArray357[local5] = local37;
				Static114.anIntArray354[local5] = local59;
				Static114.anIntArray349[local5] = local69;
			}
			Static114.anIntArray352[local5] = Static11.anInt289 + (local37 << 9) / local69;
			Static114.anIntArray346[local5] = Static11.anInt288 + (local59 << 9) / local69;
		}
		Static11.anInt285 = 0;
		local3 = arg0.anIntArray347.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray347[local13];
			local27 = arg0.anIntArray356[local13];
			local37 = arg0.anIntArray353[local13];
			@Pc(142) int local142 = Static114.anIntArray352[local20];
			@Pc(146) int local146 = Static114.anIntArray352[local27];
			@Pc(150) int local150 = Static114.anIntArray352[local37];
			@Pc(154) int local154 = Static114.anIntArray346[local20];
			@Pc(158) int local158 = Static114.anIntArray346[local27];
			@Pc(162) int local162 = Static114.anIntArray346[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static11.aBoolean11 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static11.anInt284 || local146 > Static11.anInt284 || local150 > Static11.anInt284) {
					Static11.aBoolean11 = true;
				}
				if (Static98.aBoolean89 && this.method1418(Static98.anInt2287, Static98.anInt2292, local154, local158, local162, local142, local146, local150)) {
					Static98.anInt2291 = arg5;
					Static98.anInt2284 = arg6;
				}
				if (arg0.anIntArray359 == null || arg0.anIntArray359[local13] == -1) {
					if (arg0.anIntArray355[local13] != 12345678) {
						Static11.method183(local154, local158, local162, local142, local146, local150, arg0.anIntArray355[local13], arg0.anIntArray350[local13], arg0.anIntArray348[local13]);
					}
				} else if (Static98.aBoolean90) {
					@Pc(364) int local364 = Static11.anInterface3_1.method616(arg0.anIntArray359[local13]);
					Static11.method183(local154, local158, local162, local142, local146, local150, Static98.method1386(local364, arg0.anIntArray355[local13]), Static98.method1386(local364, arg0.anIntArray350[local13]), Static98.method1386(local364, arg0.anIntArray348[local13]));
				} else if (arg0.aBoolean102) {
					Static11.method175(local154, local158, local162, local142, local146, local150, arg0.anIntArray355[local13], arg0.anIntArray350[local13], arg0.anIntArray348[local13], Static114.anIntArray357[0], Static114.anIntArray357[1], Static114.anIntArray357[3], Static114.anIntArray354[0], Static114.anIntArray354[1], Static114.anIntArray354[3], Static114.anIntArray349[0], Static114.anIntArray349[1], Static114.anIntArray349[3], arg0.anIntArray359[local13]);
				} else {
					Static11.method175(local154, local158, local162, local142, local146, local150, arg0.anIntArray355[local13], arg0.anIntArray350[local13], arg0.anIntArray348[local13], Static114.anIntArray357[local20], Static114.anIntArray357[local27], Static114.anIntArray357[local37], Static114.anIntArray354[local20], Static114.anIntArray354[local27], Static114.anIntArray354[local37], Static114.anIntArray349[local20], Static114.anIntArray349[local27], Static114.anIntArray349[local37], arg0.anIntArray359[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "i", descriptor = "(III)V")
	public void method1413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static98.aBoolean89 = true;
		Static98.anInt2282 = arg0;
		Static98.anInt2287 = arg1;
		Static98.anInt2292 = arg2;
		Static98.anInt2291 = -1;
		Static98.anInt2284 = -1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!ka;Lclient!ka;IIIIII)V")
	public void method1414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1_Sub1 arg4, @OriginalArg(5) Class8_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class67 local6 = new Class67();
		local6.anInt2386 = arg10;
		local6.anInt2384 = arg11;
		local6.anInt2392 = arg1 * 128 + 64;
		local6.anInt2388 = arg2 * 128 + 64;
		local6.anInt2391 = arg3;
		local6.aClass8_Sub1_Sub1_4 = arg4;
		local6.aClass8_Sub1_Sub1_3 = arg5;
		local6.anInt2387 = arg6;
		local6.anInt2383 = arg7;
		local6.anInt2390 = arg8;
		local6.anInt2394 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass8_Sub2ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass8_Sub2ArrayArrayArray1[local49][arg1][arg2] = new Class8_Sub2(local49, arg1, arg2);
			}
		}
		this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass67_1 = local6;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static98.anInt2280) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5;
			if (!this.method1425(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1425(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1425(local21, local167, local195)) {
				return false;
			} else if (this.method1425(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1404(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1425(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1425(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1425(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1425(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!df;IIIII)V")
	private void method1416(@OriginalArg(0) Class8_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2295) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2285) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2301 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class8_Sub2 local66 = this.aClass8_Sub2ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray7[local17][local24][local34] + this.anIntArrayArrayArray7[local17][local24 + 1][local34] + this.anIntArrayArrayArray7[local17][local24][local34 + 1] + this.anIntArrayArrayArray7[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray7[arg1][arg2][arg3] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class74 local163 = local66.aClass74_1;
									if (local163 != null) {
										@Pc(173) Class8_Sub1_Sub1_Sub3 local173;
										if (local163.aClass8_Sub1_Sub1_5 instanceof Class8_Sub1_Sub1_Sub3) {
											local173 = (Class8_Sub1_Sub1_Sub3) local163.aClass8_Sub1_Sub1_5;
											Static26.method489(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass8_Sub1_Sub1_6 instanceof Class8_Sub1_Sub1_Sub3) {
											local173 = (Class8_Sub1_Sub1_Sub3) local163.aClass8_Sub1_Sub1_6;
											Static26.method489(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt195; local237++) {
										@Pc(243) Class12 local243 = local66.aClass12Array1[local237];
										if (local243 != null && local243.aClass8_Sub1_Sub1_1 instanceof Class8_Sub1_Sub1_Sub3) {
											@Pc(253) Class8_Sub1_Sub1_Sub3 local253 = (Class8_Sub1_Sub1_Sub3) local243.aClass8_Sub1_Sub1_1;
											@Pc(261) int local261 = local243.anInt499 + 1 - local243.anInt488;
											@Pc(269) int local269 = local243.anInt509 + 1 - local243.anInt489;
											Static26.method489(arg0, local253, (local243.anInt488 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt489 - arg3) * 128 + (local269 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "j", descriptor = "(III)V")
	public void method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass79_1 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIILclient!ka;IIZ)Z")
	public boolean method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class8_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method1403(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(IIII)Z")
	private boolean method1420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1404(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1425(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1425(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1425(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1425(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(IIII)Z")
	private boolean method1421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1404(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static98.anInt2298) {
					if (!this.method1425(local11, local26, local15)) {
						return false;
					}
					if (!this.method1425(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1425(local11, local30, local15)) {
						return false;
					}
					if (!this.method1425(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1425(local11, local34, local15)) {
					return false;
				}
				if (!this.method1425(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static98.anInt2307) {
					if (!this.method1425(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1425(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1425(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1425(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1425(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1425(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static98.anInt2298) {
					if (!this.method1425(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1425(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1425(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1425(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1425(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1425(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static98.anInt2307) {
					if (!this.method1425(local11, local26, local15)) {
						return false;
					}
					if (!this.method1425(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1425(local11, local30, local15)) {
						return false;
					}
					if (!this.method1425(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1425(local11, local34, local15)) {
					return false;
				}
				if (!this.method1425(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1425(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1425(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1425(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1425(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1425(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!q", name = "k", descriptor = "(III)Lclient!rb;")
	public Class67 method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass67_1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ba;Z)V")
	private void method1423(@OriginalArg(0) Class8_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		Static98.aClass49_9.method1114(arg0);
		while (true) {
			@Pc(8) Class8_Sub2 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class8_Sub2[][] local31;
			@Pc(49) Class8_Sub2 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class74 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class12 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class8_Sub2 var33;
										while (true) {
											do {
												local8 = (Class8_Sub2) Static98.aClass49_9.method1116();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean7);
											local17 = local8.anInt196;
											local20 = local8.anInt191;
											local23 = local8.anInt200;
											local26 = local8.anInt199;
											local31 = this.aClass8_Sub2ArrayArrayArray1[local23];
											if (!local8.aBoolean5) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass8_Sub2ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean7) {
														continue;
													}
												}
												if (local17 <= Static98.anInt2296 && local17 > Static98.anInt2306) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean7 && (local49.aBoolean5 || (local8.anInt193 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static98.anInt2296 && local17 < Static98.anInt2283 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean7 && (local49.aBoolean5 || (local8.anInt193 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static98.anInt2299 && local20 > Static98.anInt2286) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean7 && (local49.aBoolean5 || (local8.anInt193 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static98.anInt2299 && local20 < Static98.anInt2288 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean7 && (local49.aBoolean5 || (local8.anInt193 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean5 = false;
											if (local8.aClass8_Sub2_1 != null) {
												local49 = local8.aClass8_Sub2_1;
												if (local49.aClass11_1 == null) {
													if (local49.aClass73_1 != null && !this.method1404(0, local17, local20)) {
														this.method1412(local49.aClass73_1, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local17, local20);
													}
												} else if (!this.method1404(0, local17, local20)) {
													this.method1385(local49.aClass11_1, 0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local17, local20);
												}
												@Pc(225) Class74 local225 = local49.aClass74_1;
												if (local225 != null) {
													local225.aClass8_Sub1_Sub1_5.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local225.anInt2606 - Static98.anInt2298, local225.anInt2607 - Static98.anInt2303, local225.anInt2620 - Static98.anInt2307, local225.anInt2623);
												}
												for (local251 = 0; local251 < local49.anInt195; local251++) {
													var12 = local49.aClass12Array1[local251];
													if (var12 != null) {
														var12.aClass8_Sub1_Sub1_1.method1959(var12.anInt496, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, var12.anInt502 - Static98.anInt2298, var12.anInt503 - Static98.anInt2303, var12.anInt508 - Static98.anInt2307, var12.anInt498);
													}
												}
											}
											var22 = false;
											if (local8.aClass11_1 == null) {
												if (local8.aClass73_1 != null && !this.method1404(local26, local17, local20)) {
													var22 = true;
													this.method1412(local8.aClass73_1, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local17, local20);
												}
											} else if (!this.method1404(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass11_1.anInt377 != 12345678 || Static98.aBoolean89 && local23 <= Static98.anInt2282) {
													this.method1385(local8.aClass11_1, local26, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class74 local350 = local8.aClass74_1;
											@Pc(353) Class67 local353 = local8.aClass67_1;
											if (local350 != null || local353 != null) {
												if (Static98.anInt2296 == local17) {
													var21++;
												} else if (Static98.anInt2296 < local17) {
													var21 += 2;
												}
												if (Static98.anInt2299 == local20) {
													var21 += 3;
												} else if (Static98.anInt2299 > local20) {
													var21 += 6;
												}
												local251 = Static98.anIntArray317[var21];
												local8.anInt197 = Static98.anIntArray316[var21];
											}
											if (local350 != null) {
												if ((local350.anInt2616 & Static98.anIntArray321[var21]) == 0) {
													local8.anInt202 = 0;
												} else if (local350.anInt2616 == 16) {
													local8.anInt202 = 3;
													local8.anInt198 = Static98.anIntArray320[var21];
													local8.anInt201 = 3 - local8.anInt198;
												} else if (local350.anInt2616 == 32) {
													local8.anInt202 = 6;
													local8.anInt198 = Static98.anIntArray319[var21];
													local8.anInt201 = 6 - local8.anInt198;
												} else if (local350.anInt2616 == 64) {
													local8.anInt202 = 12;
													local8.anInt198 = Static98.anIntArray315[var21];
													local8.anInt201 = 12 - local8.anInt198;
												} else {
													local8.anInt202 = 9;
													local8.anInt198 = Static98.anIntArray318[var21];
													local8.anInt201 = 9 - local8.anInt198;
												}
												if ((local350.anInt2616 & local251) != 0 && !this.method1421(local26, local17, local20, local350.anInt2616)) {
													local350.aClass8_Sub1_Sub1_5.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local350.anInt2606 - Static98.anInt2298, local350.anInt2607 - Static98.anInt2303, local350.anInt2620 - Static98.anInt2307, local350.anInt2623);
												}
												if ((local350.anInt2624 & local251) != 0 && !this.method1421(local26, local17, local20, local350.anInt2624)) {
													local350.aClass8_Sub1_Sub1_6.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local350.anInt2606 - Static98.anInt2298, local350.anInt2607 - Static98.anInt2303, local350.anInt2620 - Static98.anInt2307, local350.anInt2623);
												}
											}
											if (local353 != null && !this.method1420(local26, local17, local20, local353.aClass8_Sub1_Sub1_4.anInt2957)) {
												if ((local353.anInt2387 & local251) != 0) {
													local353.aClass8_Sub1_Sub1_4.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local353.anInt2392 + local353.anInt2390 - Static98.anInt2298, local353.anInt2391 - Static98.anInt2303, local353.anInt2388 + local353.anInt2394 - Static98.anInt2307, local353.anInt2386);
												} else if (local353.anInt2387 == 256) {
													local592 = local353.anInt2392 - Static98.anInt2298;
													local597 = local353.anInt2391 - Static98.anInt2303;
													local602 = local353.anInt2388 - Static98.anInt2307;
													var17 = local353.anInt2383;
													if (var17 == 1 || var17 == 2) {
														var18 = -local592;
													} else {
														var18 = local592;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local602;
													} else {
														var19 = local602;
													}
													if (var19 < var18) {
														local353.aClass8_Sub1_Sub1_4.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local592 + local353.anInt2390, local597, local602 + local353.anInt2394, local353.anInt2386);
													} else if (local353.aClass8_Sub1_Sub1_3 != null) {
														local353.aClass8_Sub1_Sub1_3.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local592, local597, local602, local353.anInt2386);
													}
												}
											}
											if (var22) {
												@Pc(673) Class18 local673 = local8.aClass18_1;
												if (local673 != null) {
													local673.aClass8_Sub1_Sub1_2.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local673.anInt843 - Static98.anInt2298, local673.anInt841 - Static98.anInt2303, local673.anInt849 - Static98.anInt2307, local673.anInt851);
												}
												@Pc(700) Class79 local700 = local8.aClass79_1;
												if (local700 != null && local700.anInt2927 == 0) {
													if (local700.aClass8_Sub1_Sub1_8 != null) {
														local700.aClass8_Sub1_Sub1_8.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local700.anInt2929 - Static98.anInt2298, local700.anInt2925 - Static98.anInt2303, local700.anInt2932 - Static98.anInt2307, local700.anInt2934);
													}
													if (local700.aClass8_Sub1_Sub1_7 != null) {
														local700.aClass8_Sub1_Sub1_7.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local700.anInt2929 - Static98.anInt2298, local700.anInt2925 - Static98.anInt2303, local700.anInt2932 - Static98.anInt2307, local700.anInt2934);
													}
													if (local700.aClass8_Sub1_Sub1_9 != null) {
														local700.aClass8_Sub1_Sub1_9.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local700.anInt2929 - Static98.anInt2298, local700.anInt2925 - Static98.anInt2303, local700.anInt2932 - Static98.anInt2307, local700.anInt2934);
													}
												}
											}
											local592 = local8.anInt193;
											if (local592 != 0) {
												if (local17 < Static98.anInt2296 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean7) {
														Static98.aClass49_9.method1114(var33);
													}
												}
												if (local20 < Static98.anInt2299 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean7) {
														Static98.aClass49_9.method1114(var33);
													}
												}
												if (local17 > Static98.anInt2296 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean7) {
														Static98.aClass49_9.method1114(var33);
													}
												}
												if (local20 > Static98.anInt2299 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean7) {
														Static98.aClass49_9.method1114(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt202 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt195; var21++) {
												if (local8.aClass12Array1[var21].anInt500 != Static98.anInt2280 && (local8.anIntArray22[var21] & local8.anInt202) == local8.anInt198) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass74_1;
												if (!this.method1421(local26, local17, local20, local919.anInt2616)) {
													local919.aClass8_Sub1_Sub1_5.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local919.anInt2606 - Static98.anInt2298, local919.anInt2607 - Static98.anInt2303, local919.anInt2620 - Static98.anInt2307, local919.anInt2623);
												}
												local8.anInt202 = 0;
											}
										}
										if (!local8.aBoolean6) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt195;
											local8.aBoolean6 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass12Array1[local251];
												if (var12.anInt500 != Static98.anInt2280) {
													for (local978 = var12.anInt488; local978 <= var12.anInt499; local978++) {
														for (local592 = var12.anInt489; local592 <= var12.anInt509; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean5) {
																local8.aBoolean6 = true;
																continue label558;
															}
															if (var33.anInt202 != 0) {
																local602 = 0;
																if (local978 > var12.anInt488) {
																	local602++;
																}
																if (local978 < var12.anInt499) {
																	local602 += 4;
																}
																if (local592 > var12.anInt489) {
																	local602 += 8;
																}
																if (local592 < var12.anInt509) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt202) == local8.anInt201) {
																	local8.aBoolean6 = true;
																	continue label558;
																}
															}
														}
													}
													Static98.aClass12Array2[var21++] = var12;
													local592 = Static98.anInt2296 - var12.anInt488;
													local597 = var12.anInt499 - Static98.anInt2296;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static98.anInt2299 - var12.anInt489;
													var17 = var12.anInt509 - Static98.anInt2299;
													if (var17 > local602) {
														var12.anInt490 = local592 + var17;
													} else {
														var12.anInt490 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class12 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static98.aClass12Array2[local592];
													if (local1102.anInt500 != Static98.anInt2280) {
														if (local1102.anInt490 > local1093) {
															local1093 = local1102.anInt490;
															local978 = local592;
														} else if (local1102.anInt490 == local1093) {
															local602 = local1102.anInt502 - Static98.anInt2298;
															var17 = local1102.anInt508 - Static98.anInt2307;
															var18 = Static98.aClass12Array2[local978].anInt502 - Static98.anInt2298;
															var19 = Static98.aClass12Array2[local978].anInt508 - Static98.anInt2307;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static98.aClass12Array2[local978];
												local1102.anInt500 = Static98.anInt2280;
												if (!this.method1415(local26, local1102.anInt488, local1102.anInt499, local1102.anInt489, local1102.anInt509, local1102.aClass8_Sub1_Sub1_1.anInt2957)) {
													local1102.aClass8_Sub1_Sub1_1.method1959(local1102.anInt496, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local1102.anInt502 - Static98.anInt2298, local1102.anInt503 - Static98.anInt2303, local1102.anInt508 - Static98.anInt2307, local1102.anInt498);
												}
												for (local602 = local1102.anInt488; local602 <= local1102.anInt499; local602++) {
													for (var17 = local1102.anInt489; var17 <= local1102.anInt509; var17++) {
														@Pc(1227) Class8_Sub2 local1227 = local31[local602][var17];
														if (local1227.anInt202 != 0) {
															Static98.aClass49_9.method1114(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean7) {
															Static98.aClass49_9.method1114(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean6) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean6 = false;
											break;
										}
									}
								} while (!local8.aBoolean7);
							} while (local8.anInt202 != 0);
							if (local17 > Static98.anInt2296 || local17 <= Static98.anInt2306) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean7);
						if (local17 < Static98.anInt2296 || local17 >= Static98.anInt2283 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean7);
					if (local20 > Static98.anInt2299 || local20 <= Static98.anInt2286) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean7);
				if (local20 < Static98.anInt2299 || local20 >= Static98.anInt2288 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean7);
			local8.aBoolean7 = false;
			Static98.anInt2297--;
			@Pc(1369) Class79 local1369 = local8.aClass79_1;
			if (local1369 != null && local1369.anInt2927 != 0) {
				if (local1369.aClass8_Sub1_Sub1_8 != null) {
					local1369.aClass8_Sub1_Sub1_8.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local1369.anInt2929 - Static98.anInt2298, local1369.anInt2925 - Static98.anInt2303 - local1369.anInt2927, local1369.anInt2932 - Static98.anInt2307, local1369.anInt2934);
				}
				if (local1369.aClass8_Sub1_Sub1_7 != null) {
					local1369.aClass8_Sub1_Sub1_7.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local1369.anInt2929 - Static98.anInt2298, local1369.anInt2925 - Static98.anInt2303 - local1369.anInt2927, local1369.anInt2932 - Static98.anInt2307, local1369.anInt2934);
				}
				if (local1369.aClass8_Sub1_Sub1_9 != null) {
					local1369.aClass8_Sub1_Sub1_9.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local1369.anInt2929 - Static98.anInt2298, local1369.anInt2925 - Static98.anInt2303 - local1369.anInt2927, local1369.anInt2932 - Static98.anInt2307, local1369.anInt2934);
				}
			}
			if (local8.anInt197 != 0) {
				@Pc(1464) Class67 local1464 = local8.aClass67_1;
				if (local1464 != null && !this.method1420(local26, local17, local20, local1464.aClass8_Sub1_Sub1_4.anInt2957)) {
					if ((local1464.anInt2387 & local8.anInt197) != 0) {
						local1464.aClass8_Sub1_Sub1_4.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local1464.anInt2392 + local1464.anInt2390 - Static98.anInt2298, local1464.anInt2391 - Static98.anInt2303, local1464.anInt2388 + local1464.anInt2394 - Static98.anInt2307, local1464.anInt2386);
					} else if (local1464.anInt2387 == 256) {
						local251 = local1464.anInt2392 - Static98.anInt2298;
						local1093 = local1464.anInt2391 - Static98.anInt2303;
						local978 = local1464.anInt2388 - Static98.anInt2307;
						local592 = local1464.anInt2383;
						if (local592 == 1 || local592 == 2) {
							local597 = -local251;
						} else {
							local597 = local251;
						}
						if (local592 == 2 || local592 == 3) {
							local602 = -local978;
						} else {
							local602 = local978;
						}
						if (local602 >= local597) {
							local1464.aClass8_Sub1_Sub1_4.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local251 + local1464.anInt2390, local1093, local978 + local1464.anInt2394, local1464.anInt2386);
						} else if (local1464.aClass8_Sub1_Sub1_3 != null) {
							local1464.aClass8_Sub1_Sub1_3.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local251, local1093, local978, local1464.anInt2386);
						}
					}
				}
				local919 = local8.aClass74_1;
				if (local919 != null) {
					if ((local919.anInt2624 & local8.anInt197) != 0 && !this.method1421(local26, local17, local20, local919.anInt2624)) {
						local919.aClass8_Sub1_Sub1_6.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local919.anInt2606 - Static98.anInt2298, local919.anInt2607 - Static98.anInt2303, local919.anInt2620 - Static98.anInt2307, local919.anInt2623);
					}
					if ((local919.anInt2616 & local8.anInt197) != 0 && !this.method1421(local26, local17, local20, local919.anInt2616)) {
						local919.aClass8_Sub1_Sub1_5.method1959(0, Static98.anInt2294, Static98.anInt2300, Static98.anInt2289, Static98.anInt2302, local919.anInt2606 - Static98.anInt2298, local919.anInt2607 - Static98.anInt2303, local919.anInt2620 - Static98.anInt2307, local919.anInt2623);
					}
				}
			}
			@Pc(1689) Class8_Sub2 local1689;
			if (local23 < this.anInt2295 - 1) {
				local1689 = this.aClass8_Sub2ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean7) {
					Static98.aClass49_9.method1114(local1689);
				}
			}
			if (local17 < Static98.anInt2296) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean7) {
					Static98.aClass49_9.method1114(local1689);
				}
			}
			if (local20 < Static98.anInt2299) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean7) {
					Static98.aClass49_9.method1114(local1689);
				}
			}
			if (local17 > Static98.anInt2296) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean7) {
					Static98.aClass49_9.method1114(local1689);
				}
			}
			if (local20 > Static98.anInt2299) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean7) {
					Static98.aClass49_9.method1114(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(IIIIII)V")
	public void method1424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2285 * 128) {
			arg0 = this.anInt2285 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2301 * 128) {
			arg2 = this.anInt2301 * 128 - 1;
		}
		Static98.anInt2280++;
		Static98.anInt2294 = Class8_Sub1_Sub3_Sub1.anIntArray38[arg3];
		Static98.anInt2300 = Class8_Sub1_Sub3_Sub1.anIntArray40[arg3];
		Static98.anInt2289 = Class8_Sub1_Sub3_Sub1.anIntArray38[arg4];
		Static98.anInt2302 = Class8_Sub1_Sub3_Sub1.anIntArray40[arg4];
		Static98.aBooleanArrayArray1 = Static98.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static98.anInt2298 = arg0;
		Static98.anInt2303 = arg1;
		Static98.anInt2307 = arg2;
		Static98.anInt2296 = arg0 / 128;
		Static98.anInt2299 = arg2 / 128;
		Static98.anInt2304 = arg5;
		Static98.anInt2306 = Static98.anInt2296 - 25;
		if (Static98.anInt2306 < 0) {
			Static98.anInt2306 = 0;
		}
		Static98.anInt2286 = Static98.anInt2299 - 25;
		if (Static98.anInt2286 < 0) {
			Static98.anInt2286 = 0;
		}
		Static98.anInt2283 = Static98.anInt2296 + 25;
		if (Static98.anInt2283 > this.anInt2285) {
			Static98.anInt2283 = this.anInt2285;
		}
		Static98.anInt2288 = Static98.anInt2299 + 25;
		if (Static98.anInt2288 > this.anInt2301) {
			Static98.anInt2288 = this.anInt2301;
		}
		this.method1394();
		Static98.anInt2297 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2305; local128 < this.anInt2295; local128++) {
			@Pc(134) Class8_Sub2[][] local134 = this.aClass8_Sub2ArrayArrayArray1[local128];
			for (local136 = Static98.anInt2306; local136 < Static98.anInt2283; local136++) {
				for (local139 = Static98.anInt2286; local139 < Static98.anInt2288; local139++) {
					@Pc(146) Class8_Sub2 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt190 <= arg5 && (Static98.aBooleanArrayArray1[local136 + 25 - Static98.anInt2296][local139 + 25 - Static98.anInt2299] || this.anIntArrayArrayArray7[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean5 = true;
							local146.aBoolean7 = true;
							if (local146.anInt195 > 0) {
								local146.aBoolean6 = true;
							} else {
								local146.aBoolean6 = false;
							}
							Static98.anInt2297++;
						} else {
							local146.aBoolean5 = false;
							local146.aBoolean7 = false;
							local146.anInt202 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt2305; local224 < this.anInt2295; local224++) {
			@Pc(230) Class8_Sub2[][] local230 = this.aClass8_Sub2ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static98.anInt2296 + local139;
				local241 = Static98.anInt2296 - local139;
				if (local237 >= Static98.anInt2306 || local241 < Static98.anInt2283) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static98.anInt2299 + local249;
						local258 = Static98.anInt2299 - local249;
						@Pc(270) Class8_Sub2 local270;
						if (local237 >= Static98.anInt2306) {
							if (local254 >= Static98.anInt2286) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean5) {
									this.method1423(local270, true);
								}
							}
							if (local258 < Static98.anInt2288) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean5) {
									this.method1423(local270, true);
								}
							}
						}
						if (local241 < Static98.anInt2283) {
							if (local254 >= Static98.anInt2286) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean5) {
									this.method1423(local270, true);
								}
							}
							if (local258 < Static98.anInt2288) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean5) {
									this.method1423(local270, true);
								}
							}
						}
						if (Static98.anInt2297 == 0) {
							Static98.aBoolean89 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2305; local136 < this.anInt2295; local136++) {
			@Pc(361) Class8_Sub2[][] local361 = this.aClass8_Sub2ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static98.anInt2296 + local237;
				local249 = Static98.anInt2296 - local237;
				if (local241 >= Static98.anInt2306 || local249 < Static98.anInt2283) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static98.anInt2299 + local254;
						@Pc(389) int local389 = Static98.anInt2299 - local254;
						@Pc(401) Class8_Sub2 local401;
						if (local241 >= Static98.anInt2306) {
							if (local258 >= Static98.anInt2286) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean5) {
									this.method1423(local401, false);
								}
							}
							if (local389 < Static98.anInt2288) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean5) {
									this.method1423(local401, false);
								}
							}
						}
						if (local249 < Static98.anInt2283) {
							if (local258 >= Static98.anInt2286) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean5) {
									this.method1423(local401, false);
								}
							}
							if (local389 < Static98.anInt2288) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean5) {
									this.method1423(local401, false);
								}
							}
						}
						if (Static98.anInt2297 == 0) {
							Static98.aBoolean89 = false;
							return;
						}
					}
				}
			}
		}
		Static98.aBoolean89 = false;
	}

	@OriginalMember(owner = "client!q", name = "l", descriptor = "(III)Z")
	private boolean method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static98.anInt2293; local1++) {
			@Pc(6) Class1 local6 = Static98.aClass1Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt20 == 1) {
				local15 = local6.anInt11 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt21 + (local6.anInt18 * local15 >> 8);
					local37 = local6.anInt4 + (local6.anInt19 * local15 >> 8);
					local47 = local6.anInt10 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt22 + (local6.anInt13 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt20 == 2) {
				local15 = arg0 - local6.anInt11;
				if (local15 > 0) {
					local27 = local6.anInt21 + (local6.anInt18 * local15 >> 8);
					local37 = local6.anInt4 + (local6.anInt19 * local15 >> 8);
					local47 = local6.anInt10 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt22 + (local6.anInt13 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt20 == 3) {
				local15 = local6.anInt21 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt11 + (local6.anInt3 * local15 >> 8);
					local37 = local6.anInt9 + (local6.anInt2 * local15 >> 8);
					local47 = local6.anInt10 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt22 + (local6.anInt13 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt20 == 4) {
				local15 = arg2 - local6.anInt21;
				if (local15 > 0) {
					local27 = local6.anInt11 + (local6.anInt3 * local15 >> 8);
					local37 = local6.anInt9 + (local6.anInt2 * local15 >> 8);
					local47 = local6.anInt10 + (local6.anInt15 * local15 >> 8);
					local57 = local6.anInt22 + (local6.anInt13 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt20 == 5) {
				local15 = arg1 - local6.anInt10;
				if (local15 > 0) {
					local27 = local6.anInt11 + (local6.anInt3 * local15 >> 8);
					local37 = local6.anInt9 + (local6.anInt2 * local15 >> 8);
					local47 = local6.anInt21 + (local6.anInt18 * local15 >> 8);
					local57 = local6.anInt4 + (local6.anInt19 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "m", descriptor = "(III)I")
	public int method1427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass18_1 == null ? 0 : local8.aClass18_1.anInt851;
	}

	@OriginalMember(owner = "client!q", name = "n", descriptor = "(III)V")
	public void method1428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass67_1 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(IIII)V")
	public void method1429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].anInt190 = arg3;
		}
	}

	@OriginalMember(owner = "client!q", name = "o", descriptor = "(III)Lclient!te;")
	public Class74 method1430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass74_1;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIILclient!ka;ILclient!ka;Lclient!ka;)V")
	public void method1431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class8_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub1_Sub1 arg6, @OriginalArg(7) Class8_Sub1_Sub1 arg7) {
		@Pc(3) Class79 local3 = new Class79();
		local3.aClass8_Sub1_Sub1_9 = arg4;
		local3.anInt2929 = arg1 * 128 + 64;
		local3.anInt2932 = arg2 * 128 + 64;
		local3.anInt2925 = arg3;
		local3.anInt2934 = arg5;
		local3.aClass8_Sub1_Sub1_8 = arg6;
		local3.aClass8_Sub1_Sub1_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class8_Sub2 local43 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt195; local47++) {
				if ((local43.aClass12Array1[local47].anInt506 & 0x100) == 256 && local43.aClass12Array1[local47].aClass8_Sub1_Sub1_1 instanceof Class8_Sub1_Sub1_Sub6) {
					@Pc(71) Class8_Sub1_Sub1_Sub6 local71 = (Class8_Sub1_Sub1_Sub6) local43.aClass12Array1[local47].aClass8_Sub1_Sub1_1;
					local71.method1269();
					if (local71.anInt2957 > local34) {
						local34 = local71.anInt2957;
					}
				}
			}
		}
		local3.anInt2927 = local34;
		if (this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2] = new Class8_Sub2(arg0, arg1, arg2);
		}
		this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2].aClass79_1 = local3;
	}

	@OriginalMember(owner = "client!q", name = "p", descriptor = "(III)V")
	public void method1432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt195; local13++) {
			@Pc(19) Class12 local19 = local8.aClass12Array1[local13];
			if ((local19.anInt498 >> 29 & 0x3) == 2 && local19.anInt488 == arg1 && local19.anInt489 == arg2) {
				this.method1409(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
	public void method1433(@OriginalArg(0) int arg0) {
		this.anInt2305 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2285; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2301; local7++) {
				if (this.aClass8_Sub2ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass8_Sub2ArrayArrayArray1[arg0][local4][local7] = new Class8_Sub2(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "q", descriptor = "(III)V")
	public void method1434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass18_1 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "r", descriptor = "(III)I")
	public int method1435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub2 local8 = this.aClass8_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt195; local14++) {
			@Pc(20) Class12 local20 = local8.aClass12Array1[local14];
			if ((local20.anInt498 >> 29 & 0x3) == 2 && local20.anInt488 == arg1 && local20.anInt489 == arg2) {
				return local20.anInt498;
			}
		}
		return 0;
	}
}
