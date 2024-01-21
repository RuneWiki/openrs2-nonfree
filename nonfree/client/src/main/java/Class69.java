import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class69 {

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private int anInt2356 = 0;

	@OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
	private int anInt2365 = 0;

	@OriginalMember(owner = "client!sd", name = "T", descriptor = "[Lclient!fd;")
	private final Class25[] aClass25Array3 = new Class25[5000];

	@OriginalMember(owner = "client!sd", name = "hb", descriptor = "[[I")
	private final int[][] anIntArrayArray24 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!sd", name = "ib", descriptor = "[[I")
	private final int[][] anIntArrayArray25 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private final int anInt2349;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	private final int anInt2355;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
	private final int anInt2348;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "[[[Lclient!aa;")
	private final Class2_Sub1[][][] aClass2_Sub1ArrayArrayArray1;

	@OriginalMember(owner = "client!sd", name = "H", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(III[[[I)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2349 = arg0;
		this.anInt2355 = arg1;
		this.anInt2348 = arg2;
		this.aClass2_Sub1ArrayArrayArray1 = new Class2_Sub1[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray3 = arg3;
		this.method1636();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pb;IIIIIII)V")
	private void method1608(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static108.anInt2357;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static108.anInt2350;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray3[arg1][arg6][arg7] - Static108.anInt2367;
		@Pc(51) int local51 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static108.anInt2367;
		@Pc(66) int local66 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static108.anInt2367;
		@Pc(79) int local79 = this.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static108.anInt2367;
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
		@Pc(279) int local279 = Static44.anInt1016 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static44.anInt1014 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static44.anInt1016 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static44.anInt1014 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static44.anInt1016 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static44.anInt1014 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static44.anInt1016 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static44.anInt1014 + (local89 << 9) / local265;
		Static44.anInt1021 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static44.aBoolean40 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static44.anInt1019 || local327 > Static44.anInt1019 || local295 > Static44.anInt1019) {
				Static44.aBoolean40 = true;
			}
			if (Static108.aBoolean101 && this.method1656(Static108.anInt2353, Static108.anInt2358, local319, local335, local303, local311, local327, local295)) {
				Static108.anInt2371 = arg6;
				Static108.anInt2360 = arg7;
			}
			if (arg0.anInt1892 == -1) {
				if (arg0.anInt1897 != 12345678) {
					Static44.method720(local319, local335, local303, local311, local327, local295, arg0.anInt1897, arg0.anInt1899, arg0.anInt1891);
				}
			} else if (Static108.aBoolean102) {
				local472 = Static44.anInterface2_1.method1058(arg0.anInt1892);
				Static44.method720(local319, local335, local303, local311, local327, local295, Static108.method1634(local472, arg0.anInt1897), Static108.method1634(local472, arg0.anInt1899), Static108.method1634(local472, arg0.anInt1891));
			} else if (arg0.aBoolean75) {
				Static44.method722(local319, local335, local303, local311, local327, local295, arg0.anInt1897, arg0.anInt1899, arg0.anInt1891, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1892);
			} else {
				Static44.method722(local319, local335, local303, local311, local327, local295, arg0.anInt1897, arg0.anInt1899, arg0.anInt1891, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1892);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static44.aBoolean40 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static44.anInt1019 || local295 > Static44.anInt1019 || local327 > Static44.anInt1019) {
			Static44.aBoolean40 = true;
		}
		if (Static108.aBoolean101 && this.method1656(Static108.anInt2353, Static108.anInt2358, local287, local303, local335, local279, local295, local327)) {
			Static108.anInt2371 = arg6;
			Static108.anInt2360 = arg7;
		}
		if (arg0.anInt1892 != -1) {
			if (!Static108.aBoolean102) {
				Static44.method722(local287, local303, local335, local279, local295, local327, arg0.anInt1900, arg0.anInt1891, arg0.anInt1899, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1892);
				return;
			}
			local472 = Static44.anInterface2_1.method1058(arg0.anInt1892);
			Static44.method720(local287, local303, local335, local279, local295, local327, Static108.method1634(local472, arg0.anInt1900), Static108.method1634(local472, arg0.anInt1891), Static108.method1634(local472, arg0.anInt1899));
		} else if (arg0.anInt1900 != 12345678) {
			Static44.method720(local287, local303, local335, local279, local295, local327, arg0.anInt1900, arg0.anInt1891, arg0.anInt1899);
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	public void method1609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub1 local31 = this.aClass2_Sub1ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub1ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt33--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt31; local41++) {
					@Pc(47) Class25 local47 = local31.aClass25Array1[local41];
					if ((local47.anInt852 >> 29 & 0x3) == 2 && local47.anInt844 == arg0 && local47.anInt837 == arg1) {
						local47.anInt848--;
					}
				}
			}
		}
		if (this.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub1(0, arg0, arg1);
		}
		this.aClass2_Sub1ArrayArrayArray1[0][arg0][arg1].aClass2_Sub1_1 = local8;
		this.aClass2_Sub1ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)I")
	public int method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass17_1 == null ? 0 : local8.aClass17_1.anInt663;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2355 * 128) {
			arg0 = this.anInt2355 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2348 * 128) {
			arg2 = this.anInt2348 * 128 - 1;
		}
		Static108.anInt2373++;
		Static108.anInt2361 = Class2_Sub2_Sub1_Sub4.anIntArray122[arg3];
		Static108.anInt2359 = Class2_Sub2_Sub1_Sub4.anIntArray119[arg3];
		Static108.anInt2363 = Class2_Sub2_Sub1_Sub4.anIntArray122[arg4];
		Static108.anInt2372 = Class2_Sub2_Sub1_Sub4.anIntArray119[arg4];
		Static108.aBooleanArrayArray1 = Static108.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static108.anInt2357 = arg0;
		Static108.anInt2367 = arg1;
		Static108.anInt2350 = arg2;
		Static108.anInt2368 = arg0 / 128;
		Static108.anInt2370 = arg2 / 128;
		Static108.anInt2354 = arg5;
		Static108.anInt2352 = Static108.anInt2368 - 25;
		if (Static108.anInt2352 < 0) {
			Static108.anInt2352 = 0;
		}
		Static108.anInt2374 = Static108.anInt2370 - 25;
		if (Static108.anInt2374 < 0) {
			Static108.anInt2374 = 0;
		}
		Static108.anInt2347 = Static108.anInt2368 + 25;
		if (Static108.anInt2347 > this.anInt2355) {
			Static108.anInt2347 = this.anInt2355;
		}
		Static108.anInt2364 = Static108.anInt2370 + 25;
		if (Static108.anInt2364 > this.anInt2348) {
			Static108.anInt2364 = this.anInt2348;
		}
		this.method1652();
		Static108.anInt2362 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2356; local128 < this.anInt2349; local128++) {
			@Pc(134) Class2_Sub1[][] local134 = this.aClass2_Sub1ArrayArrayArray1[local128];
			for (local136 = Static108.anInt2352; local136 < Static108.anInt2347; local136++) {
				for (local139 = Static108.anInt2374; local139 < Static108.anInt2364; local139++) {
					@Pc(146) Class2_Sub1 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt35 <= arg5 && (Static108.aBooleanArrayArray1[local136 + 25 - Static108.anInt2368][local139 + 25 - Static108.anInt2370] || this.anIntArrayArrayArray3[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean4 = true;
							local146.aBoolean5 = true;
							if (local146.anInt31 > 0) {
								local146.aBoolean3 = true;
							} else {
								local146.aBoolean3 = false;
							}
							Static108.anInt2362++;
						} else {
							local146.aBoolean4 = false;
							local146.aBoolean5 = false;
							local146.anInt37 = 0;
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
		for (@Pc(224) int local224 = this.anInt2356; local224 < this.anInt2349; local224++) {
			@Pc(230) Class2_Sub1[][] local230 = this.aClass2_Sub1ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static108.anInt2368 + local139;
				local241 = Static108.anInt2368 - local139;
				if (local237 >= Static108.anInt2352 || local241 < Static108.anInt2347) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static108.anInt2370 + local249;
						local258 = Static108.anInt2370 - local249;
						@Pc(270) Class2_Sub1 local270;
						if (local237 >= Static108.anInt2352) {
							if (local254 >= Static108.anInt2374) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean4) {
									this.method1655(local270, true);
								}
							}
							if (local258 < Static108.anInt2364) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean4) {
									this.method1655(local270, true);
								}
							}
						}
						if (local241 < Static108.anInt2347) {
							if (local254 >= Static108.anInt2374) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean4) {
									this.method1655(local270, true);
								}
							}
							if (local258 < Static108.anInt2364) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean4) {
									this.method1655(local270, true);
								}
							}
						}
						if (Static108.anInt2362 == 0) {
							Static108.aBoolean101 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2356; local136 < this.anInt2349; local136++) {
			@Pc(361) Class2_Sub1[][] local361 = this.aClass2_Sub1ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static108.anInt2368 + local237;
				local249 = Static108.anInt2368 - local237;
				if (local241 >= Static108.anInt2352 || local249 < Static108.anInt2347) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static108.anInt2370 + local254;
						@Pc(389) int local389 = Static108.anInt2370 - local254;
						@Pc(401) Class2_Sub1 local401;
						if (local241 >= Static108.anInt2352) {
							if (local258 >= Static108.anInt2374) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean4) {
									this.method1655(local401, false);
								}
							}
							if (local389 < Static108.anInt2364) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean4) {
									this.method1655(local401, false);
								}
							}
						}
						if (local249 < Static108.anInt2347) {
							if (local258 >= Static108.anInt2374) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean4) {
									this.method1655(local401, false);
								}
							}
							if (local389 < Static108.anInt2364) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean4) {
									this.method1655(local401, false);
								}
							}
						}
						if (Static108.anInt2362 == 0) {
							Static108.aBoolean101 = false;
							return;
						}
					}
				}
			}
		}
		Static108.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
	private boolean method1612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1643(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray3[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static108.anInt2357) {
					if (!this.method1654(local11, local26, local15)) {
						return false;
					}
					if (!this.method1654(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1654(local11, local30, local15)) {
						return false;
					}
					if (!this.method1654(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1654(local11, local34, local15)) {
					return false;
				}
				if (!this.method1654(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static108.anInt2350) {
					if (!this.method1654(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1654(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1654(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1654(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1654(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1654(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static108.anInt2357) {
					if (!this.method1654(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1654(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1654(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1654(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1654(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1654(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static108.anInt2350) {
					if (!this.method1654(local11, local26, local15)) {
						return false;
					}
					if (!this.method1654(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1654(local11, local30, local15)) {
						return false;
					}
					if (!this.method1654(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1654(local11, local34, local15)) {
					return false;
				}
				if (!this.method1654(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1654(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1654(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1654(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1654(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1654(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(III)Lclient!wd;")
	public Class81 method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass81_1 == null ? null : local8.aClass81_1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static108.anInt2373) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5;
			if (!this.method1654(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1654(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1654(local21, local167, local195)) {
				return false;
			} else if (this.method1654(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1643(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1654(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1654(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1654(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1654(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(III)Lclient!ab;")
	public Class3 method1616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass3_1;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIII)I")
	public int method1617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass3_1 != null && local8.aClass3_1.anInt45 == arg3) {
			return local8.aClass3_1.anInt42 & 0xFF;
		} else if (local8.aClass17_1 != null && local8.aClass17_1.anInt663 == arg3) {
			return local8.aClass17_1.anInt659 & 0xFF;
		} else if (local8.aClass81_1 != null && local8.aClass81_1.anInt2876 == arg3) {
			return local8.aClass81_1.anInt2874 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt31; local56++) {
				if (local8.aClass25Array1[local56].anInt852 == arg3) {
					return local8.aClass25Array1[local56].anInt850 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!vb;IIIIII)V")
	public void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class17 local6 = new Class17();
		local6.anInt663 = arg9;
		local6.anInt659 = arg10;
		local6.anInt664 = arg1 * 128 + arg7 + 64;
		local6.anInt660 = arg2 * 128 + arg8 + 64;
		local6.anInt666 = arg3;
		local6.aClass2_Sub2_Sub2_3 = arg4;
		local6.anInt662 = arg5;
		local6.anInt668 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub1ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub1ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub1(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local6;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([IIIIII)V")
	public void method1619(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class60 local14 = local8.aClass60_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1895;
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
		@Pc(59) Class49 local59 = local8.aClass49_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1560;
		@Pc(68) int local68 = local59.anInt1562;
		@Pc(71) int local71 = local59.anInt1561;
		@Pc(74) int local74 = local59.anInt1563;
		@Pc(79) int[] local79 = this.anIntArrayArray25[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray24[local68];
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

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!vb;Lclient!vb;IIII)V")
	public void method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub2 arg4, @OriginalArg(5) Class2_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class3 local8 = new Class3();
		local8.anInt45 = arg8;
		local8.anInt42 = arg9;
		local8.anInt49 = arg1 * 128 + 64;
		local8.anInt46 = arg2 * 128 + 64;
		local8.anInt48 = arg3;
		local8.aClass2_Sub2_Sub2_1 = arg4;
		local8.aClass2_Sub2_Sub2_2 = arg5;
		local8.anInt50 = arg6;
		local8.anInt44 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub1ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub1ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub1(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass3_1 = local8;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	public void method1621() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2365; local1++) {
			@Pc(7) Class25 local7 = this.aClass25Array3[local1];
			this.method1642(local7);
			this.aClass25Array3[local1] = null;
		}
		this.anInt2365 = 0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
	public void method1622(@OriginalArg(0) int arg0) {
		this.anInt2356 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2355; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2348; local7++) {
				if (this.aClass2_Sub1ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub1ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub1(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pf;IIIII)V")
	private void method1623(@OriginalArg(0) Class2_Sub2_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2349) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2355) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2348 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub1 local66 = this.aClass2_Sub1ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray3[local17][local24][local34] + this.anIntArrayArrayArray3[local17][local24 + 1][local34] + this.anIntArrayArrayArray3[local17][local24][local34 + 1] + this.anIntArrayArrayArray3[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray3[arg1][arg2][arg3] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class3 local163 = local66.aClass3_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub2_Sub2_Sub7 local173;
										if (local163.aClass2_Sub2_Sub2_1 instanceof Class2_Sub2_Sub2_Sub7) {
											local173 = (Class2_Sub2_Sub2_Sub7) local163.aClass2_Sub2_Sub2_1;
											Static94.method1399(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub2_Sub2_2 instanceof Class2_Sub2_Sub2_Sub7) {
											local173 = (Class2_Sub2_Sub2_Sub7) local163.aClass2_Sub2_Sub2_2;
											Static94.method1399(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt31; local237++) {
										@Pc(243) Class25 local243 = local66.aClass25Array1[local237];
										if (local243 != null && local243.aClass2_Sub2_Sub2_4 instanceof Class2_Sub2_Sub2_Sub7) {
											@Pc(253) Class2_Sub2_Sub2_Sub7 local253 = (Class2_Sub2_Sub2_Sub7) local243.aClass2_Sub2_Sub2_4;
											@Pc(261) int local261 = local243.anInt847 + 1 - local243.anInt844;
											@Pc(269) int local269 = local243.anInt843 + 1 - local243.anInt837;
											Static94.method1399(arg0, local253, (local243.anInt844 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt837 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIILclient!vb;III)Z")
	public boolean method1624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1639(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(III)V")
	public void method1625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass3_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!me;IIIIII)V")
	private void method1626(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray201.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray201[local5] - Static108.anInt2357;
			local20 = arg0.anIntArray200[local5] - Static108.anInt2367;
			local27 = arg0.anIntArray199[local5] - Static108.anInt2350;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray196 != null) {
				Static73.anIntArray204[local5] = local37;
				Static73.anIntArray195[local5] = local59;
				Static73.anIntArray202[local5] = local69;
			}
			Static73.anIntArray207[local5] = Static44.anInt1016 + (local37 << 9) / local69;
			Static73.anIntArray198[local5] = Static44.anInt1014 + (local59 << 9) / local69;
		}
		Static44.anInt1021 = 0;
		local3 = arg0.anIntArray206.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray206[local13];
			local27 = arg0.anIntArray209[local13];
			local37 = arg0.anIntArray205[local13];
			@Pc(142) int local142 = Static73.anIntArray207[local20];
			@Pc(146) int local146 = Static73.anIntArray207[local27];
			@Pc(150) int local150 = Static73.anIntArray207[local37];
			@Pc(154) int local154 = Static73.anIntArray198[local20];
			@Pc(158) int local158 = Static73.anIntArray198[local27];
			@Pc(162) int local162 = Static73.anIntArray198[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static44.aBoolean40 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static44.anInt1019 || local146 > Static44.anInt1019 || local150 > Static44.anInt1019) {
					Static44.aBoolean40 = true;
				}
				if (Static108.aBoolean101 && this.method1656(Static108.anInt2353, Static108.anInt2358, local154, local158, local162, local142, local146, local150)) {
					Static108.anInt2371 = arg5;
					Static108.anInt2360 = arg6;
				}
				if (arg0.anIntArray196 == null || arg0.anIntArray196[local13] == -1) {
					if (arg0.anIntArray197[local13] != 12345678) {
						Static44.method720(local154, local158, local162, local142, local146, local150, arg0.anIntArray197[local13], arg0.anIntArray208[local13], arg0.anIntArray203[local13]);
					}
				} else if (Static108.aBoolean102) {
					@Pc(364) int local364 = Static44.anInterface2_1.method1058(arg0.anIntArray196[local13]);
					Static44.method720(local154, local158, local162, local142, local146, local150, Static108.method1634(local364, arg0.anIntArray197[local13]), Static108.method1634(local364, arg0.anIntArray208[local13]), Static108.method1634(local364, arg0.anIntArray203[local13]));
				} else if (arg0.aBoolean60) {
					Static44.method722(local154, local158, local162, local142, local146, local150, arg0.anIntArray197[local13], arg0.anIntArray208[local13], arg0.anIntArray203[local13], Static73.anIntArray204[0], Static73.anIntArray204[1], Static73.anIntArray204[3], Static73.anIntArray195[0], Static73.anIntArray195[1], Static73.anIntArray195[3], Static73.anIntArray202[0], Static73.anIntArray202[1], Static73.anIntArray202[3], arg0.anIntArray196[local13]);
				} else {
					Static44.method722(local154, local158, local162, local142, local146, local150, arg0.anIntArray197[local13], arg0.anIntArray208[local13], arg0.anIntArray203[local13], Static73.anIntArray204[local20], Static73.anIntArray204[local27], Static73.anIntArray204[local37], Static73.anIntArray195[local20], Static73.anIntArray195[local27], Static73.anIntArray195[local37], Static73.anIntArray202[local20], Static73.anIntArray202[local27], Static73.anIntArray202[local37], arg0.anIntArray196[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!vb;IIIIII)Z")
	public boolean method1627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1639(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(III)V")
	public void method1628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static108.aBoolean101 = true;
		Static108.anInt2351 = arg0;
		Static108.anInt2353 = arg1;
		Static108.anInt2358 = arg2;
		Static108.anInt2371 = -1;
		Static108.anInt2360 = -1;
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(III)V")
	public void method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt31; local13++) {
			@Pc(19) Class25 local19 = local8.aClass25Array1[local13];
			if ((local19.anInt852 >> 29 & 0x3) == 2 && local19.anInt844 == arg1 && local19.anInt837 == arg2) {
				this.method1642(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(III)I")
	public int method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass81_1 == null ? 0 : local8.aClass81_1.anInt2876;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(IIII)Z")
	private boolean method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1643(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1654(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1654(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1654(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1654(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "(III)I")
	public int method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt31; local14++) {
			@Pc(20) Class25 local20 = local8.aClass25Array1[local14];
			if ((local20.anInt852 >> 29 & 0x3) == 2 && local20.anInt844 == arg1 && local20.anInt837 == arg2) {
				return local20.anInt852;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "(III)V")
	public void method1633() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2349; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2355; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2348; local7++) {
					@Pc(17) Class2_Sub1 local17 = this.aClass2_Sub1ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class3 local22 = local17.aClass3_1;
						if (local22 != null && local22.aClass2_Sub2_Sub2_1 instanceof Class2_Sub2_Sub2_Sub7) {
							@Pc(32) Class2_Sub2_Sub2_Sub7 local32 = (Class2_Sub2_Sub2_Sub7) local22.aClass2_Sub2_Sub2_1;
							this.method1623(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub2_Sub2_2 instanceof Class2_Sub2_Sub2_Sub7) {
								@Pc(48) Class2_Sub2_Sub2_Sub7 local48 = (Class2_Sub2_Sub2_Sub7) local22.aClass2_Sub2_Sub2_2;
								this.method1623(local48, local1, local4, local7, 1, 1);
								Static94.method1399(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub2_Sub2_2 = local48.method1412(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass2_Sub2_Sub2_1 = local32.method1412(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class2_Sub2_Sub2_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt31; local87++) {
							@Pc(93) Class25 local93 = local17.aClass25Array1[local87];
							if (local93 != null && local93.aClass2_Sub2_Sub2_4 instanceof Class2_Sub2_Sub2_Sub7) {
								local103 = (Class2_Sub2_Sub2_Sub7) local93.aClass2_Sub2_Sub2_4;
								this.method1623(local103, local1, local4, local7, local93.anInt847 + 1 - local93.anInt844, local93.anInt843 - local93.anInt837 + 1);
								local93.aClass2_Sub2_Sub2_4 = local103.method1412(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class81 local142 = local17.aClass81_1;
						if (local142 != null && local142.aClass2_Sub2_Sub2_8 instanceof Class2_Sub2_Sub2_Sub7) {
							local103 = (Class2_Sub2_Sub2_Sub7) local142.aClass2_Sub2_Sub2_8;
							this.method1649(local103, local1, local4, local7);
							local142.aClass2_Sub2_Sub2_8 = local103.method1412(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
	public void method1636() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2349; local1++) {
			for (local4 = 0; local4 < this.anInt2355; local4++) {
				for (local7 = 0; local7 < this.anInt2348; local7++) {
					this.aClass2_Sub1ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static108.anInt2369; local4++) {
			for (local7 = 0; local7 < Static108.anIntArray332[local4]; local7++) {
				Static108.aClass64ArrayArray1[local4][local7] = null;
			}
			Static108.anIntArray332[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2365; local7++) {
			this.aClass25Array3[local7] = null;
		}
		this.anInt2365 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static108.aClass25Array2.length; local76++) {
			Static108.aClass25Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIILclient!vb;IIZ)Z")
	public boolean method1637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1639(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(III)I")
	public int method1638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass3_1 == null ? 0 : local8.aClass3_1.anInt45;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIILclient!vb;IZII)Z")
	private boolean method1639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub2_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2355 || local4 >= this.anInt2348) {
					return false;
				}
				@Pc(28) Class2_Sub1 local28 = this.aClass2_Sub1ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt31 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class25 local52 = new Class25();
		local52.anInt852 = arg11;
		local52.anInt850 = arg12;
		local52.anInt848 = arg0;
		local52.anInt839 = arg5;
		local52.anInt851 = arg6;
		local52.anInt838 = arg7;
		local52.aClass2_Sub2_Sub2_4 = arg8;
		local52.anInt842 = arg9;
		local52.anInt844 = arg1;
		local52.anInt837 = arg2;
		local52.anInt847 = arg1 + arg3 - 1;
		local52.anInt843 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub1ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub1ArrayArrayArray1[local130][local98][local101] = new Class2_Sub1(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub1 local166 = this.aClass2_Sub1ArrayArrayArray1[arg0][local98][local101];
				local166.aClass25Array1[local166.anInt31] = local52;
				local166.anIntArray5[local166.anInt31] = local104;
				local166.anInt36 |= local104;
				local166.anInt31++;
			}
		}
		if (arg10) {
			this.aClass25Array3[this.anInt2365++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(III)Lclient!ea;")
	public Class17 method1640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass17_1;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!vb;ILclient!vb;Lclient!vb;)V")
	public void method1641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub2_Sub2 arg6, @OriginalArg(7) Class2_Sub2_Sub2 arg7) {
		@Pc(3) Class71 local3 = new Class71();
		local3.aClass2_Sub2_Sub2_7 = arg4;
		local3.anInt2445 = arg1 * 128 + 64;
		local3.anInt2440 = arg2 * 128 + 64;
		local3.anInt2449 = arg3;
		local3.anInt2441 = arg5;
		local3.aClass2_Sub2_Sub2_6 = arg6;
		local3.aClass2_Sub2_Sub2_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub1 local43 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt31; local47++) {
				if ((local43.aClass25Array1[local47].anInt850 & 0x100) == 256 && local43.aClass25Array1[local47].aClass2_Sub2_Sub2_4 instanceof Class2_Sub2_Sub2_Sub5) {
					@Pc(71) Class2_Sub2_Sub2_Sub5 local71 = (Class2_Sub2_Sub2_Sub5) local43.aClass25Array1[local47].aClass2_Sub2_Sub2_4;
					local71.method1133();
					if (local71.anInt2656 > local34) {
						local34 = local71.anInt2656;
					}
				}
			}
		}
		local3.anInt2448 = local34;
		if (this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub1(arg0, arg1, arg2);
		}
		this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local3;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!fd;)V")
	private void method1642(@OriginalArg(0) Class25 arg0) {
		for (@Pc(2) int local2 = arg0.anInt844; local2 <= arg0.anInt847; local2++) {
			for (@Pc(6) int local6 = arg0.anInt837; local6 <= arg0.anInt843; local6++) {
				@Pc(17) Class2_Sub1 local17 = this.aClass2_Sub1ArrayArrayArray1[arg0.anInt848][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt31; local21++) {
						if (local17.aClass25Array1[local21] == arg0) {
							local17.anInt31--;
							for (local36 = local21; local36 < local17.anInt31; local36++) {
								local17.aClass25Array1[local36] = local17.aClass25Array1[local36 + 1];
								local17.anIntArray5[local36] = local17.anIntArray5[local36 + 1];
							}
							local17.aClass25Array1[local17.anInt31] = null;
							break;
						}
					}
					local17.anInt36 = 0;
					for (local36 = 0; local36 < local17.anInt31; local36++) {
						local17.anInt36 |= local17.anIntArray5[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "(III)Z")
	private boolean method1643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static108.anInt2373) {
			return false;
		} else if (local8 == Static108.anInt2373) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1654(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2], local27 + 1) && this.method1654(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local27 + 1) && this.method1654(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1654(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static108.anInt2373;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static108.anInt2373;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(IIII)V")
	public void method1644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class17 local14 = local8.aClass17_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt664 = local23 + (local14.anInt664 - local23) * arg3 / 16;
			local14.anInt660 = local29 + (local14.anInt660 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(IIII)V")
	public void method1645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].anInt35 = arg3;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class60 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class60(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub1(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class60(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub1(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local12;
		} else {
			@Pc(140) Class49 local140 = new Class49(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub1ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub1(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local140;
		}
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "(III)V")
	public void method1647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass17_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILclient!vb;II)V")
	public void method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class81 local6 = new Class81();
		local6.aClass2_Sub2_Sub2_8 = arg4;
		local6.anInt2872 = arg1 * 128 + 64;
		local6.anInt2877 = arg2 * 128 + 64;
		local6.anInt2878 = arg3;
		local6.anInt2876 = arg5;
		local6.anInt2874 = arg6;
		if (this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub1(arg0, arg1, arg2);
		}
		this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2].aClass81_1 = local6;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!pf;III)V")
	private void method1649(@OriginalArg(0) Class2_Sub2_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub1 local14;
		@Pc(29) Class2_Sub2_Sub2_Sub7 local29;
		if (arg2 < this.anInt2355) {
			local14 = this.aClass2_Sub1ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass81_1 != null && local14.aClass81_1.aClass2_Sub2_Sub2_8 instanceof Class2_Sub2_Sub2_Sub7) {
				local29 = (Class2_Sub2_Sub2_Sub7) local14.aClass81_1.aClass2_Sub2_Sub2_8;
				Static94.method1399(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2355) {
			local14 = this.aClass2_Sub1ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass81_1 != null && local14.aClass81_1.aClass2_Sub2_Sub2_8 instanceof Class2_Sub2_Sub2_Sub7) {
				local29 = (Class2_Sub2_Sub2_Sub7) local14.aClass81_1.aClass2_Sub2_Sub2_8;
				Static94.method1399(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2355 && arg3 < this.anInt2348) {
			local14 = this.aClass2_Sub1ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass81_1 != null && local14.aClass81_1.aClass2_Sub2_Sub2_8 instanceof Class2_Sub2_Sub2_Sub7) {
				local29 = (Class2_Sub2_Sub2_Sub7) local14.aClass81_1.aClass2_Sub2_Sub2_8;
				Static94.method1399(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2355 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub1ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass81_1 != null && local14.aClass81_1.aClass2_Sub2_Sub2_8 instanceof Class2_Sub2_Sub2_Sub7) {
			local29 = (Class2_Sub2_Sub2_Sub7) local14.aClass81_1.aClass2_Sub2_Sub2_8;
			Static94.method1399(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "(III)Lclient!fd;")
	public Class25 method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt31; local14++) {
			@Pc(20) Class25 local20 = local8.aClass25Array1[local14];
			if ((local20.anInt852 >> 29 & 0x3) == 2 && local20.anInt844 == arg1 && local20.anInt837 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()V")
	private void method1652() {
		@Pc(3) int local3 = Static108.anIntArray332[Static108.anInt2354];
		@Pc(7) Class64[] local7 = Static108.aClass64ArrayArray1[Static108.anInt2354];
		Static108.anInt2366 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class64 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2119 == 1) {
				local27 = local16.anInt2131 + 25 - Static108.anInt2368;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2129 + 25 - Static108.anInt2370;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2135 + 25 - Static108.anInt2370;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static108.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static108.anInt2357 - local16.anInt2132;
						if (local79 > 32) {
							local16.anInt2141 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2141 = 2;
							local79 = -local79;
						}
						local16.anInt2126 = (local16.anInt2134 - Static108.anInt2350 << 8) / local79;
						local16.anInt2133 = (local16.anInt2123 - Static108.anInt2350 << 8) / local79;
						local16.anInt2120 = (local16.anInt2130 - Static108.anInt2367 << 8) / local79;
						local16.anInt2142 = (local16.anInt2139 - Static108.anInt2367 << 8) / local79;
						Static108.aClass64Array1[Static108.anInt2366++] = local16;
					}
				}
			} else if (local16.anInt2119 == 2) {
				local27 = local16.anInt2129 + 25 - Static108.anInt2370;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2131 + 25 - Static108.anInt2368;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2137 + 25 - Static108.anInt2368;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static108.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static108.anInt2350 - local16.anInt2134;
						if (local79 > 32) {
							local16.anInt2141 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2141 = 4;
							local79 = -local79;
						}
						local16.anInt2128 = (local16.anInt2132 - Static108.anInt2357 << 8) / local79;
						local16.anInt2140 = (local16.anInt2124 - Static108.anInt2357 << 8) / local79;
						local16.anInt2120 = (local16.anInt2130 - Static108.anInt2367 << 8) / local79;
						local16.anInt2142 = (local16.anInt2139 - Static108.anInt2367 << 8) / local79;
						Static108.aClass64Array1[Static108.anInt2366++] = local16;
					}
				}
			} else if (local16.anInt2119 == 4) {
				local27 = local16.anInt2130 - Static108.anInt2367;
				if (local27 > 128) {
					local40 = local16.anInt2129 + 25 - Static108.anInt2370;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2135 + 25 - Static108.anInt2370;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2131 + 25 - Static108.anInt2368;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2137 + 25 - Static108.anInt2368;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static108.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2141 = 5;
							local16.anInt2128 = (local16.anInt2132 - Static108.anInt2357 << 8) / local27;
							local16.anInt2140 = (local16.anInt2124 - Static108.anInt2357 << 8) / local27;
							local16.anInt2126 = (local16.anInt2134 - Static108.anInt2350 << 8) / local27;
							local16.anInt2133 = (local16.anInt2123 - Static108.anInt2350 << 8) / local27;
							Static108.aClass64Array1[Static108.anInt2366++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(III)Z")
	private boolean method1654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static108.anInt2366; local1++) {
			@Pc(6) Class64 local6 = Static108.aClass64Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2141 == 1) {
				local15 = local6.anInt2132 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2134 + (local6.anInt2126 * local15 >> 8);
					local37 = local6.anInt2123 + (local6.anInt2133 * local15 >> 8);
					local47 = local6.anInt2130 + (local6.anInt2120 * local15 >> 8);
					local57 = local6.anInt2139 + (local6.anInt2142 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2141 == 2) {
				local15 = arg0 - local6.anInt2132;
				if (local15 > 0) {
					local27 = local6.anInt2134 + (local6.anInt2126 * local15 >> 8);
					local37 = local6.anInt2123 + (local6.anInt2133 * local15 >> 8);
					local47 = local6.anInt2130 + (local6.anInt2120 * local15 >> 8);
					local57 = local6.anInt2139 + (local6.anInt2142 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2141 == 3) {
				local15 = local6.anInt2134 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2132 + (local6.anInt2128 * local15 >> 8);
					local37 = local6.anInt2124 + (local6.anInt2140 * local15 >> 8);
					local47 = local6.anInt2130 + (local6.anInt2120 * local15 >> 8);
					local57 = local6.anInt2139 + (local6.anInt2142 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2141 == 4) {
				local15 = arg2 - local6.anInt2134;
				if (local15 > 0) {
					local27 = local6.anInt2132 + (local6.anInt2128 * local15 >> 8);
					local37 = local6.anInt2124 + (local6.anInt2140 * local15 >> 8);
					local47 = local6.anInt2130 + (local6.anInt2120 * local15 >> 8);
					local57 = local6.anInt2139 + (local6.anInt2142 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2141 == 5) {
				local15 = arg1 - local6.anInt2130;
				if (local15 > 0) {
					local27 = local6.anInt2132 + (local6.anInt2128 * local15 >> 8);
					local37 = local6.anInt2124 + (local6.anInt2140 * local15 >> 8);
					local47 = local6.anInt2134 + (local6.anInt2126 * local15 >> 8);
					local57 = local6.anInt2123 + (local6.anInt2133 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!aa;Z)V")
	private void method1655(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		Static108.aClass13_55.method418(arg0);
		while (true) {
			@Pc(8) Class2_Sub1 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub1[][] local31;
			@Pc(49) Class2_Sub1 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class3 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class25 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class2_Sub1 var35;
										while (true) {
											do {
												local8 = (Class2_Sub1) Static108.aClass13_55.method419();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean5);
											local17 = local8.anInt34;
											local20 = local8.anInt27;
											local23 = local8.anInt33;
											local26 = local8.anInt32;
											local31 = this.aClass2_Sub1ArrayArrayArray1[local23];
											if (!local8.aBoolean4) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub1ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean5) {
														continue;
													}
												}
												if (local17 <= Static108.anInt2368 && local17 > Static108.anInt2352) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean5 && (local49.aBoolean4 || (local8.anInt36 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static108.anInt2368 && local17 < Static108.anInt2347 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean5 && (local49.aBoolean4 || (local8.anInt36 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static108.anInt2370 && local20 > Static108.anInt2374) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean5 && (local49.aBoolean4 || (local8.anInt36 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static108.anInt2370 && local20 < Static108.anInt2364 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean5 && (local49.aBoolean4 || (local8.anInt36 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean4 = false;
											if (local8.aClass2_Sub1_1 != null) {
												local49 = local8.aClass2_Sub1_1;
												if (local49.aClass60_1 == null) {
													if (local49.aClass49_1 != null && !this.method1643(0, local17, local20)) {
														this.method1626(local49.aClass49_1, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local17, local20);
													}
												} else if (!this.method1643(0, local17, local20)) {
													this.method1608(local49.aClass60_1, 0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local17, local20);
												}
												@Pc(225) Class3 local225 = local49.aClass3_1;
												if (local225 != null) {
													local225.aClass2_Sub2_Sub2_1.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local225.anInt49 - Static108.anInt2357, local225.anInt48 - Static108.anInt2367, local225.anInt46 - Static108.anInt2350, local225.anInt45);
												}
												for (local251 = 0; local251 < local49.anInt31; local251++) {
													var12 = local49.aClass25Array1[local251];
													if (var12 != null) {
														var12.aClass2_Sub2_Sub2_4.method1852(var12.anInt842, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, var12.anInt839 - Static108.anInt2357, var12.anInt838 - Static108.anInt2367, var12.anInt851 - Static108.anInt2350, var12.anInt852);
													}
												}
											}
											var24 = false;
											if (local8.aClass60_1 == null) {
												if (local8.aClass49_1 != null && !this.method1643(local26, local17, local20)) {
													var24 = true;
													this.method1626(local8.aClass49_1, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local17, local20);
												}
											} else if (!this.method1643(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass60_1.anInt1897 != 12345678 || Static108.aBoolean101 && local23 <= Static108.anInt2351) {
													this.method1608(local8.aClass60_1, local26, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class3 local350 = local8.aClass3_1;
											@Pc(353) Class17 local353 = local8.aClass17_1;
											if (local350 != null || local353 != null) {
												if (Static108.anInt2368 == local17) {
													var23++;
												} else if (Static108.anInt2368 < local17) {
													var23 += 2;
												}
												if (Static108.anInt2370 == local20) {
													var23 += 3;
												} else if (Static108.anInt2370 > local20) {
													var23 += 6;
												}
												local251 = Static108.anIntArray336[var23];
												local8.anInt29 = Static108.anIntArray339[var23];
											}
											if (local350 != null) {
												if ((local350.anInt50 & Static108.anIntArray338[var23]) == 0) {
													local8.anInt37 = 0;
												} else if (local350.anInt50 == 16) {
													local8.anInt37 = 3;
													local8.anInt30 = Static108.anIntArray340[var23];
													local8.anInt28 = 3 - local8.anInt30;
												} else if (local350.anInt50 == 32) {
													local8.anInt37 = 6;
													local8.anInt30 = Static108.anIntArray335[var23];
													local8.anInt28 = 6 - local8.anInt30;
												} else if (local350.anInt50 == 64) {
													local8.anInt37 = 12;
													local8.anInt30 = Static108.anIntArray341[var23];
													local8.anInt28 = 12 - local8.anInt30;
												} else {
													local8.anInt37 = 9;
													local8.anInt30 = Static108.anIntArray337[var23];
													local8.anInt28 = 9 - local8.anInt30;
												}
												if ((local350.anInt50 & local251) != 0 && !this.method1612(local26, local17, local20, local350.anInt50)) {
													local350.aClass2_Sub2_Sub2_1.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local350.anInt49 - Static108.anInt2357, local350.anInt48 - Static108.anInt2367, local350.anInt46 - Static108.anInt2350, local350.anInt45);
												}
												if ((local350.anInt44 & local251) != 0 && !this.method1612(local26, local17, local20, local350.anInt44)) {
													local350.aClass2_Sub2_Sub2_2.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local350.anInt49 - Static108.anInt2357, local350.anInt48 - Static108.anInt2367, local350.anInt46 - Static108.anInt2350, local350.anInt45);
												}
											}
											if (local353 != null && !this.method1631(local26, local17, local20, local353.aClass2_Sub2_Sub2_3.anInt2656)) {
												if ((local353.anInt662 & local251) != 0) {
													local353.aClass2_Sub2_Sub2_3.method1852(local353.anInt668, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local353.anInt664 - Static108.anInt2357, local353.anInt666 - Static108.anInt2367, local353.anInt660 - Static108.anInt2350, local353.anInt663);
												} else if ((local353.anInt662 & 0x300) != 0) {
													local588 = local353.anInt664 - Static108.anInt2357;
													local593 = local353.anInt666 - Static108.anInt2367;
													local598 = local353.anInt660 - Static108.anInt2350;
													local601 = local353.anInt668;
													if (local601 == 1 || local601 == 2) {
														local610 = -local588;
													} else {
														local610 = local588;
													}
													if (local601 == 2 || local601 == 3) {
														var19 = -local598;
													} else {
														var19 = local598;
													}
													@Pc(639) int local639;
													@Pc(645) int local645;
													if ((local353.anInt662 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static108.anIntArray330[local601];
														local645 = local598 + Static108.anIntArray334[local601];
														local353.aClass2_Sub2_Sub2_3.method1852(local601 * 512 + 256, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local639, local593, local645, local353.anInt663);
													}
													if ((local353.anInt662 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static108.anIntArray331[local601];
														local645 = local598 + Static108.anIntArray333[local601];
														local353.aClass2_Sub2_Sub2_3.method1852(local601 * 512 + 1280 & 0x7FF, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local639, local593, local645, local353.anInt663);
													}
												}
											}
											if (var24) {
												@Pc(706) Class81 local706 = local8.aClass81_1;
												if (local706 != null) {
													local706.aClass2_Sub2_Sub2_8.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local706.anInt2872 - Static108.anInt2357, local706.anInt2878 - Static108.anInt2367, local706.anInt2877 - Static108.anInt2350, local706.anInt2876);
												}
												@Pc(733) Class71 local733 = local8.aClass71_1;
												if (local733 != null && local733.anInt2448 == 0) {
													if (local733.aClass2_Sub2_Sub2_6 != null) {
														local733.aClass2_Sub2_Sub2_6.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local733.anInt2445 - Static108.anInt2357, local733.anInt2449 - Static108.anInt2367, local733.anInt2440 - Static108.anInt2350, local733.anInt2441);
													}
													if (local733.aClass2_Sub2_Sub2_5 != null) {
														local733.aClass2_Sub2_Sub2_5.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local733.anInt2445 - Static108.anInt2357, local733.anInt2449 - Static108.anInt2367, local733.anInt2440 - Static108.anInt2350, local733.anInt2441);
													}
													if (local733.aClass2_Sub2_Sub2_7 != null) {
														local733.aClass2_Sub2_Sub2_7.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local733.anInt2445 - Static108.anInt2357, local733.anInt2449 - Static108.anInt2367, local733.anInt2440 - Static108.anInt2350, local733.anInt2441);
													}
												}
											}
											local588 = local8.anInt36;
											if (local588 != 0) {
												if (local17 < Static108.anInt2368 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean5) {
														Static108.aClass13_55.method418(var35);
													}
												}
												if (local20 < Static108.anInt2370 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean5) {
														Static108.aClass13_55.method418(var35);
													}
												}
												if (local17 > Static108.anInt2368 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean5) {
														Static108.aClass13_55.method418(var35);
													}
												}
												if (local20 > Static108.anInt2370 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean5) {
														Static108.aClass13_55.method418(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt37 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt31; var23++) {
												if (local8.aClass25Array1[var23].anInt841 != Static108.anInt2373 && (local8.anIntArray5[var23] & local8.anInt37) == local8.anInt30) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass3_1;
												if (!this.method1612(local26, local17, local20, local952.anInt50)) {
													local952.aClass2_Sub2_Sub2_1.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local952.anInt49 - Static108.anInt2357, local952.anInt48 - Static108.anInt2367, local952.anInt46 - Static108.anInt2350, local952.anInt45);
												}
												local8.anInt37 = 0;
											}
										}
										if (!local8.aBoolean3) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt31;
											local8.aBoolean3 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass25Array1[local251];
												if (var12.anInt841 != Static108.anInt2373) {
													for (local1011 = var12.anInt844; local1011 <= var12.anInt847; local1011++) {
														for (local588 = var12.anInt837; local588 <= var12.anInt843; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean4) {
																local8.aBoolean3 = true;
																continue label568;
															}
															if (var35.anInt37 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt844) {
																	local598++;
																}
																if (local1011 < var12.anInt847) {
																	local598 += 4;
																}
																if (local588 > var12.anInt837) {
																	local598 += 8;
																}
																if (local588 < var12.anInt843) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt37) == local8.anInt28) {
																	local8.aBoolean3 = true;
																	continue label568;
																}
															}
														}
													}
													Static108.aClass25Array2[var23++] = var12;
													local588 = Static108.anInt2368 - var12.anInt844;
													local593 = var12.anInt847 - Static108.anInt2368;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static108.anInt2370 - var12.anInt837;
													local601 = var12.anInt843 - Static108.anInt2370;
													if (local601 > local598) {
														var12.anInt846 = local588 + local601;
													} else {
														var12.anInt846 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class25 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static108.aClass25Array2[local588];
													if (local1135.anInt841 != Static108.anInt2373) {
														if (local1135.anInt846 > local1126) {
															local1126 = local1135.anInt846;
															local1011 = local588;
														} else if (local1135.anInt846 == local1126) {
															local598 = local1135.anInt839 - Static108.anInt2357;
															local601 = local1135.anInt851 - Static108.anInt2350;
															local610 = Static108.aClass25Array2[local1011].anInt839 - Static108.anInt2357;
															var19 = Static108.aClass25Array2[local1011].anInt851 - Static108.anInt2350;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static108.aClass25Array2[local1011];
												local1135.anInt841 = Static108.anInt2373;
												if (!this.method1615(local26, local1135.anInt844, local1135.anInt847, local1135.anInt837, local1135.anInt843, local1135.aClass2_Sub2_Sub2_4.anInt2656)) {
													local1135.aClass2_Sub2_Sub2_4.method1852(local1135.anInt842, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local1135.anInt839 - Static108.anInt2357, local1135.anInt838 - Static108.anInt2367, local1135.anInt851 - Static108.anInt2350, local1135.anInt852);
												}
												for (local598 = local1135.anInt844; local598 <= local1135.anInt847; local598++) {
													for (local601 = local1135.anInt837; local601 <= local1135.anInt843; local601++) {
														@Pc(1260) Class2_Sub1 local1260 = local31[local598][local601];
														if (local1260.anInt37 != 0) {
															Static108.aClass13_55.method418(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean5) {
															Static108.aClass13_55.method418(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean3) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean3 = false;
											break;
										}
									}
								} while (!local8.aBoolean5);
							} while (local8.anInt37 != 0);
							if (local17 > Static108.anInt2368 || local17 <= Static108.anInt2352) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean5);
						if (local17 < Static108.anInt2368 || local17 >= Static108.anInt2347 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean5);
					if (local20 > Static108.anInt2370 || local20 <= Static108.anInt2374) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean5);
				if (local20 < Static108.anInt2370 || local20 >= Static108.anInt2364 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean5);
			local8.aBoolean5 = false;
			Static108.anInt2362--;
			@Pc(1402) Class71 local1402 = local8.aClass71_1;
			if (local1402 != null && local1402.anInt2448 != 0) {
				if (local1402.aClass2_Sub2_Sub2_6 != null) {
					local1402.aClass2_Sub2_Sub2_6.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local1402.anInt2445 - Static108.anInt2357, local1402.anInt2449 - Static108.anInt2367 - local1402.anInt2448, local1402.anInt2440 - Static108.anInt2350, local1402.anInt2441);
				}
				if (local1402.aClass2_Sub2_Sub2_5 != null) {
					local1402.aClass2_Sub2_Sub2_5.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local1402.anInt2445 - Static108.anInt2357, local1402.anInt2449 - Static108.anInt2367 - local1402.anInt2448, local1402.anInt2440 - Static108.anInt2350, local1402.anInt2441);
				}
				if (local1402.aClass2_Sub2_Sub2_7 != null) {
					local1402.aClass2_Sub2_Sub2_7.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local1402.anInt2445 - Static108.anInt2357, local1402.anInt2449 - Static108.anInt2367 - local1402.anInt2448, local1402.anInt2440 - Static108.anInt2350, local1402.anInt2441);
				}
			}
			if (local8.anInt29 != 0) {
				@Pc(1497) Class17 local1497 = local8.aClass17_1;
				if (local1497 != null && !this.method1631(local26, local17, local20, local1497.aClass2_Sub2_Sub2_3.anInt2656)) {
					if ((local1497.anInt662 & local8.anInt29) != 0) {
						local1497.aClass2_Sub2_Sub2_3.method1852(local1497.anInt668, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local1497.anInt664 - Static108.anInt2357, local1497.anInt666 - Static108.anInt2367, local1497.anInt660 - Static108.anInt2350, local1497.anInt663);
					} else if ((local1497.anInt662 & 0x300) != 0) {
						local251 = local1497.anInt664 - Static108.anInt2357;
						local1126 = local1497.anInt666 - Static108.anInt2367;
						local1011 = local1497.anInt660 - Static108.anInt2350;
						local588 = local1497.anInt668;
						if (local588 == 1 || local588 == 2) {
							local593 = -local251;
						} else {
							local593 = local251;
						}
						if (local588 == 2 || local588 == 3) {
							local598 = -local1011;
						} else {
							local598 = local1011;
						}
						if ((local1497.anInt662 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static108.anIntArray330[local588];
							local610 = local1011 + Static108.anIntArray334[local588];
							local1497.aClass2_Sub2_Sub2_3.method1852(local588 * 512 + 256, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local601, local1126, local610, local1497.anInt663);
						}
						if ((local1497.anInt662 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static108.anIntArray331[local588];
							local610 = local1011 + Static108.anIntArray333[local588];
							local1497.aClass2_Sub2_Sub2_3.method1852(local588 * 512 + 1280 & 0x7FF, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local601, local1126, local610, local1497.anInt663);
						}
					}
				}
				local952 = local8.aClass3_1;
				if (local952 != null) {
					if ((local952.anInt44 & local8.anInt29) != 0 && !this.method1612(local26, local17, local20, local952.anInt44)) {
						local952.aClass2_Sub2_Sub2_2.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local952.anInt49 - Static108.anInt2357, local952.anInt48 - Static108.anInt2367, local952.anInt46 - Static108.anInt2350, local952.anInt45);
					}
					if ((local952.anInt50 & local8.anInt29) != 0 && !this.method1612(local26, local17, local20, local952.anInt50)) {
						local952.aClass2_Sub2_Sub2_1.method1852(0, Static108.anInt2361, Static108.anInt2359, Static108.anInt2363, Static108.anInt2372, local952.anInt49 - Static108.anInt2357, local952.anInt48 - Static108.anInt2367, local952.anInt46 - Static108.anInt2350, local952.anInt45);
					}
				}
			}
			@Pc(1755) Class2_Sub1 local1755;
			if (local23 < this.anInt2349 - 1) {
				local1755 = this.aClass2_Sub1ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean5) {
					Static108.aClass13_55.method418(local1755);
				}
			}
			if (local17 < Static108.anInt2368) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean5) {
					Static108.aClass13_55.method418(local1755);
				}
			}
			if (local20 < Static108.anInt2370) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean5) {
					Static108.aClass13_55.method418(local1755);
				}
			}
			if (local17 > Static108.anInt2368) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean5) {
					Static108.aClass13_55.method418(local1755);
				}
			}
			if (local20 > Static108.anInt2370) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean5) {
					Static108.aClass13_55.method418(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "(III)V")
	public void method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass81_1 = null;
		}
	}

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "(III)V")
	public void method1658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass71_1 = null;
		}
	}
}
