import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class39 {

	@OriginalMember(owner = "client!je", name = "f", descriptor = "I")
	private int anInt1359 = 0;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "[Lclient!bc;")
	private final Class8[] aClass8Array2 = new Class8[5000];

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	private int anInt1357 = 0;

	@OriginalMember(owner = "client!je", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray9 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!je", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray8 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!je", name = "I", descriptor = "I")
	private final int anInt1380;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	private final int anInt1360;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "I")
	private final int anInt1371;

	@OriginalMember(owner = "client!je", name = "u", descriptor = "[[[Lclient!oc;")
	private final Class3_Sub15[][][] aClass3_Sub15ArrayArrayArray1;

	@OriginalMember(owner = "client!je", name = "P", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(III[[[I)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1380 = arg0;
		this.anInt1360 = arg1;
		this.anInt1371 = arg2;
		this.aClass3_Sub15ArrayArrayArray1 = new Class3_Sub15[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method995();
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILclient!sd;IIIIII)V")
	public void method963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class46 local6 = new Class46();
		local6.anInt1683 = arg9;
		local6.anInt1685 = arg10;
		local6.anInt1674 = arg1 * 128 + arg7 + 64;
		local6.anInt1676 = arg2 * 128 + arg8 + 64;
		local6.anInt1677 = arg3;
		local6.aClass3_Sub1_Sub4_6 = arg4;
		local6.anInt1680 = arg5;
		local6.anInt1672 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub15ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub15ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub15(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass46_1 = local6;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
	public void method964() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1380; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1360; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1371; local7++) {
					@Pc(17) Class3_Sub15 local17 = this.aClass3_Sub15ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class71 local22 = local17.aClass71_1;
						if (local22 != null && local22.aClass3_Sub1_Sub4_8 instanceof Class3_Sub1_Sub4_Sub5) {
							@Pc(32) Class3_Sub1_Sub4_Sub5 local32 = (Class3_Sub1_Sub4_Sub5) local22.aClass3_Sub1_Sub4_8;
							this.method970(local32, local1, local4, local7, 1, 1);
							if (local22.aClass3_Sub1_Sub4_7 instanceof Class3_Sub1_Sub4_Sub5) {
								@Pc(48) Class3_Sub1_Sub4_Sub5 local48 = (Class3_Sub1_Sub4_Sub5) local22.aClass3_Sub1_Sub4_7;
								this.method970(local48, local1, local4, local7, 1, 1);
								Static67.method1170(local32, local48, 0, 0, 0, false);
								local22.aClass3_Sub1_Sub4_7 = local48.method1156(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass3_Sub1_Sub4_8 = local32.method1156(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class3_Sub1_Sub4_Sub5 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2057; local87++) {
							@Pc(93) Class8 local93 = local17.aClass8Array3[local87];
							if (local93 != null && local93.aClass3_Sub1_Sub4_4 instanceof Class3_Sub1_Sub4_Sub5) {
								local103 = (Class3_Sub1_Sub4_Sub5) local93.aClass3_Sub1_Sub4_4;
								this.method970(local103, local1, local4, local7, local93.anInt216 + 1 - local93.anInt211, local93.anInt198 - local93.anInt203 + 1);
								local93.aClass3_Sub1_Sub4_4 = local103.method1156(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class31 local142 = local17.aClass31_1;
						if (local142 != null && local142.aClass3_Sub1_Sub4_5 instanceof Class3_Sub1_Sub4_Sub5) {
							local103 = (Class3_Sub1_Sub4_Sub5) local142.aClass3_Sub1_Sub4_5;
							this.method974(local103, local1, local4, local7);
							local142.aClass3_Sub1_Sub4_5 = local103.method1156(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public void method965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1360 * 128) {
			arg0 = this.anInt1360 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1371 * 128) {
			arg2 = this.anInt1371 * 128 - 1;
		}
		Static55.anInt1376++;
		Static55.anInt1374 = Class3_Sub1_Sub5_Sub1.anIntArray86[arg3];
		Static55.anInt1372 = Class3_Sub1_Sub5_Sub1.anIntArray84[arg3];
		Static55.anInt1363 = Class3_Sub1_Sub5_Sub1.anIntArray86[arg4];
		Static55.anInt1370 = Class3_Sub1_Sub5_Sub1.anIntArray84[arg4];
		Static55.aBooleanArrayArray1 = Static55.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static55.anInt1375 = arg0;
		Static55.anInt1378 = arg1;
		Static55.anInt1368 = arg2;
		Static55.anInt1356 = arg0 / 128;
		Static55.anInt1366 = arg2 / 128;
		Static55.anInt1358 = arg5;
		Static55.anInt1382 = Static55.anInt1356 - 25;
		if (Static55.anInt1382 < 0) {
			Static55.anInt1382 = 0;
		}
		Static55.anInt1355 = Static55.anInt1366 - 25;
		if (Static55.anInt1355 < 0) {
			Static55.anInt1355 = 0;
		}
		Static55.anInt1379 = Static55.anInt1356 + 25;
		if (Static55.anInt1379 > this.anInt1360) {
			Static55.anInt1379 = this.anInt1360;
		}
		Static55.anInt1373 = Static55.anInt1366 + 25;
		if (Static55.anInt1373 > this.anInt1371) {
			Static55.anInt1373 = this.anInt1371;
		}
		this.method967();
		Static55.anInt1364 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1359; local128 < this.anInt1380; local128++) {
			@Pc(134) Class3_Sub15[][] local134 = this.aClass3_Sub15ArrayArrayArray1[local128];
			for (local136 = Static55.anInt1382; local136 < Static55.anInt1379; local136++) {
				for (local139 = Static55.anInt1355; local139 < Static55.anInt1373; local139++) {
					@Pc(146) Class3_Sub15 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2061 <= arg5 && (Static55.aBooleanArrayArray1[local136 + 25 - Static55.anInt1356][local139 + 25 - Static55.anInt1366] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean76 = true;
							local146.aBoolean74 = true;
							if (local146.anInt2057 > 0) {
								local146.aBoolean75 = true;
							} else {
								local146.aBoolean75 = false;
							}
							Static55.anInt1364++;
						} else {
							local146.aBoolean76 = false;
							local146.aBoolean74 = false;
							local146.anInt2066 = 0;
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
		for (@Pc(224) int local224 = this.anInt1359; local224 < this.anInt1380; local224++) {
			@Pc(230) Class3_Sub15[][] local230 = this.aClass3_Sub15ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static55.anInt1356 + local139;
				local241 = Static55.anInt1356 - local139;
				if (local237 >= Static55.anInt1382 || local241 < Static55.anInt1379) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static55.anInt1366 + local249;
						local258 = Static55.anInt1366 - local249;
						@Pc(270) Class3_Sub15 local270;
						if (local237 >= Static55.anInt1382) {
							if (local254 >= Static55.anInt1355) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean76) {
									this.method1000(local270, true);
								}
							}
							if (local258 < Static55.anInt1373) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean76) {
									this.method1000(local270, true);
								}
							}
						}
						if (local241 < Static55.anInt1379) {
							if (local254 >= Static55.anInt1355) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean76) {
									this.method1000(local270, true);
								}
							}
							if (local258 < Static55.anInt1373) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean76) {
									this.method1000(local270, true);
								}
							}
						}
						if (Static55.anInt1364 == 0) {
							Static55.aBoolean53 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1359; local136 < this.anInt1380; local136++) {
			@Pc(361) Class3_Sub15[][] local361 = this.aClass3_Sub15ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static55.anInt1356 + local237;
				local249 = Static55.anInt1356 - local237;
				if (local241 >= Static55.anInt1382 || local249 < Static55.anInt1379) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static55.anInt1366 + local254;
						@Pc(389) int local389 = Static55.anInt1366 - local254;
						@Pc(401) Class3_Sub15 local401;
						if (local241 >= Static55.anInt1382) {
							if (local258 >= Static55.anInt1355) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean76) {
									this.method1000(local401, false);
								}
							}
							if (local389 < Static55.anInt1373) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean76) {
									this.method1000(local401, false);
								}
							}
						}
						if (local249 < Static55.anInt1379) {
							if (local258 >= Static55.anInt1355) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean76) {
									this.method1000(local401, false);
								}
							}
							if (local389 < Static55.anInt1373) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean76) {
									this.method1000(local401, false);
								}
							}
						}
						if (Static55.anInt1364 == 0) {
							Static55.aBoolean53 = false;
							return;
						}
					}
				}
			}
		}
		Static55.aBoolean53 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!lf;IIIIIII)V")
	private void method966(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static55.anInt1375;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static55.anInt1368;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static55.anInt1378;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static55.anInt1378;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static55.anInt1378;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static55.anInt1378;
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
		@Pc(279) int local279 = Static24.anInt786 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static24.anInt781 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static24.anInt786 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static24.anInt781 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static24.anInt786 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static24.anInt781 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static24.anInt786 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static24.anInt781 + (local89 << 9) / local265;
		Static24.anInt785 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static24.aBoolean33 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static24.anInt784 || local327 > Static24.anInt784 || local295 > Static24.anInt784) {
				Static24.aBoolean33 = true;
			}
			if (Static55.aBoolean53 && this.method969(Static55.anInt1381, Static55.anInt1367, local319, local335, local303, local311, local327, local295)) {
				Static55.anInt1361 = arg6;
				Static55.anInt1365 = arg7;
			}
			if (arg0.anInt1771 == -1) {
				if (arg0.anInt1776 != 12345678) {
					Static24.method471(local319, local335, local303, local311, local327, local295, arg0.anInt1776, arg0.anInt1772, arg0.anInt1774);
				}
			} else if (Static55.aBoolean52) {
				local472 = Static24.anInterface2_1.method491(arg0.anInt1771);
				Static24.method471(local319, local335, local303, local311, local327, local295, Static55.method988(local472, arg0.anInt1776), Static55.method988(local472, arg0.anInt1772), Static55.method988(local472, arg0.anInt1774));
			} else if (arg0.aBoolean66) {
				Static24.method460(local319, local335, local303, local311, local327, local295, arg0.anInt1776, arg0.anInt1772, arg0.anInt1774, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1771);
			} else {
				Static24.method460(local319, local335, local303, local311, local327, local295, arg0.anInt1776, arg0.anInt1772, arg0.anInt1774, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1771);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static24.aBoolean33 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static24.anInt784 || local295 > Static24.anInt784 || local327 > Static24.anInt784) {
			Static24.aBoolean33 = true;
		}
		if (Static55.aBoolean53 && this.method969(Static55.anInt1381, Static55.anInt1367, local287, local303, local335, local279, local295, local327)) {
			Static55.anInt1361 = arg6;
			Static55.anInt1365 = arg7;
		}
		if (arg0.anInt1771 != -1) {
			if (!Static55.aBoolean52) {
				Static24.method460(local287, local303, local335, local279, local295, local327, arg0.anInt1780, arg0.anInt1774, arg0.anInt1772, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1771);
				return;
			}
			local472 = Static24.anInterface2_1.method491(arg0.anInt1771);
			Static24.method471(local287, local303, local335, local279, local295, local327, Static55.method988(local472, arg0.anInt1780), Static55.method988(local472, arg0.anInt1774), Static55.method988(local472, arg0.anInt1772));
		} else if (arg0.anInt1780 != 12345678) {
			Static24.method471(local287, local303, local335, local279, local295, local327, arg0.anInt1780, arg0.anInt1774, arg0.anInt1772);
			return;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
	private void method967() {
		@Pc(3) int local3 = Static55.anIntArray166[Static55.anInt1358];
		@Pc(7) Class67[] local7 = Static55.aClass67ArrayArray1[Static55.anInt1358];
		Static55.anInt1369 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class67 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2336 == 1) {
				local27 = local16.anInt2323 + 25 - Static55.anInt1356;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2314 + 25 - Static55.anInt1366;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2313 + 25 - Static55.anInt1366;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static55.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static55.anInt1375 - local16.anInt2317;
						if (local79 > 32) {
							local16.anInt2332 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2332 = 2;
							local79 = -local79;
						}
						local16.anInt2330 = (local16.anInt2326 - Static55.anInt1368 << 8) / local79;
						local16.anInt2315 = (local16.anInt2316 - Static55.anInt1368 << 8) / local79;
						local16.anInt2328 = (local16.anInt2337 - Static55.anInt1378 << 8) / local79;
						local16.anInt2327 = (local16.anInt2329 - Static55.anInt1378 << 8) / local79;
						Static55.aClass67Array1[Static55.anInt1369++] = local16;
					}
				}
			} else if (local16.anInt2336 == 2) {
				local27 = local16.anInt2314 + 25 - Static55.anInt1366;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2323 + 25 - Static55.anInt1356;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2322 + 25 - Static55.anInt1356;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static55.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static55.anInt1368 - local16.anInt2326;
						if (local79 > 32) {
							local16.anInt2332 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2332 = 4;
							local79 = -local79;
						}
						local16.anInt2335 = (local16.anInt2317 - Static55.anInt1375 << 8) / local79;
						local16.anInt2320 = (local16.anInt2334 - Static55.anInt1375 << 8) / local79;
						local16.anInt2328 = (local16.anInt2337 - Static55.anInt1378 << 8) / local79;
						local16.anInt2327 = (local16.anInt2329 - Static55.anInt1378 << 8) / local79;
						Static55.aClass67Array1[Static55.anInt1369++] = local16;
					}
				}
			} else if (local16.anInt2336 == 4) {
				local27 = local16.anInt2337 - Static55.anInt1378;
				if (local27 > 128) {
					local40 = local16.anInt2314 + 25 - Static55.anInt1366;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2313 + 25 - Static55.anInt1366;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2323 + 25 - Static55.anInt1356;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2322 + 25 - Static55.anInt1356;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static55.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2332 = 5;
							local16.anInt2335 = (local16.anInt2317 - Static55.anInt1375 << 8) / local27;
							local16.anInt2320 = (local16.anInt2334 - Static55.anInt1375 << 8) / local27;
							local16.anInt2330 = (local16.anInt2326 - Static55.anInt1368 << 8) / local27;
							local16.anInt2315 = (local16.anInt2316 - Static55.anInt1368 << 8) / local27;
							Static55.aClass67Array1[Static55.anInt1369++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method968(@OriginalArg(0) int arg0) {
		this.anInt1359 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1360; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1371; local7++) {
				if (this.aClass3_Sub15ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub15ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub15(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!lc;IIIII)V")
	private void method970(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1380) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1360) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1371 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub15 local66 = this.aClass3_Sub15ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class71 local163 = local66.aClass71_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub4_Sub5 local173;
										if (local163.aClass3_Sub1_Sub4_8 instanceof Class3_Sub1_Sub4_Sub5) {
											local173 = (Class3_Sub1_Sub4_Sub5) local163.aClass3_Sub1_Sub4_8;
											Static67.method1170(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass3_Sub1_Sub4_7 instanceof Class3_Sub1_Sub4_Sub5) {
											local173 = (Class3_Sub1_Sub4_Sub5) local163.aClass3_Sub1_Sub4_7;
											Static67.method1170(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2057; local237++) {
										@Pc(243) Class8 local243 = local66.aClass8Array3[local237];
										if (local243 != null && local243.aClass3_Sub1_Sub4_4 instanceof Class3_Sub1_Sub4_Sub5) {
											@Pc(253) Class3_Sub1_Sub4_Sub5 local253 = (Class3_Sub1_Sub4_Sub5) local243.aClass3_Sub1_Sub4_4;
											@Pc(261) int local261 = local243.anInt216 + 1 - local243.anInt211;
											@Pc(269) int local269 = local243.anInt198 + 1 - local243.anInt203;
											Static67.method1170(arg0, local253, (local243.anInt211 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt203 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(III)I")
	public int method971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass31_1 == null ? 0 : local8.aClass31_1.anInt1204;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(III)V")
	public void method972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2057; local13++) {
			@Pc(19) Class8 local19 = local8.aClass8Array3[local13];
			if ((local19.anInt213 >> 29 & 0x3) == 2 && local19.anInt211 == arg1 && local19.anInt203 == arg2) {
				this.method1002(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(III)I")
	public int method973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2057; local14++) {
			@Pc(20) Class8 local20 = local8.aClass8Array3[local14];
			if ((local20.anInt213 >> 29 & 0x3) == 2 && local20.anInt211 == arg1 && local20.anInt203 == arg2) {
				return local20.anInt213;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!lc;III)V")
	private void method974(@OriginalArg(0) Class3_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub15 local14;
		@Pc(29) Class3_Sub1_Sub4_Sub5 local29;
		if (arg2 < this.anInt1360) {
			local14 = this.aClass3_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass3_Sub1_Sub4_5 instanceof Class3_Sub1_Sub4_Sub5) {
				local29 = (Class3_Sub1_Sub4_Sub5) local14.aClass31_1.aClass3_Sub1_Sub4_5;
				Static67.method1170(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1360) {
			local14 = this.aClass3_Sub15ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass3_Sub1_Sub4_5 instanceof Class3_Sub1_Sub4_Sub5) {
				local29 = (Class3_Sub1_Sub4_Sub5) local14.aClass31_1.aClass3_Sub1_Sub4_5;
				Static67.method1170(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1360 && arg3 < this.anInt1371) {
			local14 = this.aClass3_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass3_Sub1_Sub4_5 instanceof Class3_Sub1_Sub4_Sub5) {
				local29 = (Class3_Sub1_Sub4_Sub5) local14.aClass31_1.aClass3_Sub1_Sub4_5;
				Static67.method1170(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1360 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass3_Sub1_Sub4_5 instanceof Class3_Sub1_Sub4_Sub5) {
			local29 = (Class3_Sub1_Sub4_Sub5) local14.aClass31_1.aClass3_Sub1_Sub4_5;
			Static67.method1170(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIILclient!sd;III)Z")
	public boolean method975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method980(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "()V")
	public void method976() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1357; local1++) {
			@Pc(7) Class8 local7 = this.aClass8Array2[local1];
			this.method1002(local7);
			this.aClass8Array2[local1] = null;
		}
		this.anInt1357 = 0;
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(III)Z")
	private boolean method977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static55.anInt1369; local1++) {
			@Pc(6) Class67 local6 = Static55.aClass67Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2332 == 1) {
				local15 = local6.anInt2317 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2326 + (local6.anInt2330 * local15 >> 8);
					local37 = local6.anInt2316 + (local6.anInt2315 * local15 >> 8);
					local47 = local6.anInt2337 + (local6.anInt2328 * local15 >> 8);
					local57 = local6.anInt2329 + (local6.anInt2327 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2332 == 2) {
				local15 = arg0 - local6.anInt2317;
				if (local15 > 0) {
					local27 = local6.anInt2326 + (local6.anInt2330 * local15 >> 8);
					local37 = local6.anInt2316 + (local6.anInt2315 * local15 >> 8);
					local47 = local6.anInt2337 + (local6.anInt2328 * local15 >> 8);
					local57 = local6.anInt2329 + (local6.anInt2327 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2332 == 3) {
				local15 = local6.anInt2326 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2317 + (local6.anInt2335 * local15 >> 8);
					local37 = local6.anInt2334 + (local6.anInt2320 * local15 >> 8);
					local47 = local6.anInt2337 + (local6.anInt2328 * local15 >> 8);
					local57 = local6.anInt2329 + (local6.anInt2327 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2332 == 4) {
				local15 = arg2 - local6.anInt2326;
				if (local15 > 0) {
					local27 = local6.anInt2317 + (local6.anInt2335 * local15 >> 8);
					local37 = local6.anInt2334 + (local6.anInt2320 * local15 >> 8);
					local47 = local6.anInt2337 + (local6.anInt2328 * local15 >> 8);
					local57 = local6.anInt2329 + (local6.anInt2327 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2332 == 5) {
				local15 = arg1 - local6.anInt2337;
				if (local15 > 0) {
					local27 = local6.anInt2317 + (local6.anInt2335 * local15 >> 8);
					local37 = local6.anInt2334 + (local6.anInt2320 * local15 >> 8);
					local47 = local6.anInt2326 + (local6.anInt2330 * local15 >> 8);
					local57 = local6.anInt2316 + (local6.anInt2315 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIIII)Z")
	private boolean method978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static55.anInt1376) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method977(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method977(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method977(local21, local167, local195)) {
				return false;
			} else if (this.method977(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1005(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method977(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method977(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method977(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method977(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "(III)I")
	public int method979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass46_1 == null ? 0 : local8.aClass46_1.anInt1683;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIILclient!sd;IZII)Z")
	private boolean method980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1360 || local4 >= this.anInt1371) {
					return false;
				}
				@Pc(28) Class3_Sub15 local28 = this.aClass3_Sub15ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2057 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class8 local52 = new Class8();
		local52.anInt213 = arg11;
		local52.anInt209 = arg12;
		local52.anInt207 = arg0;
		local52.anInt204 = arg5;
		local52.anInt214 = arg6;
		local52.anInt210 = arg7;
		local52.aClass3_Sub1_Sub4_4 = arg8;
		local52.anInt201 = arg9;
		local52.anInt211 = arg1;
		local52.anInt203 = arg2;
		local52.anInt216 = arg1 + arg3 - 1;
		local52.anInt198 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub15ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub15ArrayArrayArray1[local130][local98][local101] = new Class3_Sub15(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub15 local166 = this.aClass3_Sub15ArrayArrayArray1[arg0][local98][local101];
				local166.aClass8Array3[local166.anInt2057] = local52;
				local166.anIntArray267[local166.anInt2057] = local104;
				local166.anInt2058 |= local104;
				local166.anInt2057++;
			}
		}
		if (arg10) {
			this.aClass8Array2[this.anInt1357++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)V")
	public void method981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class46 local14 = local8.aClass46_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1674 = local23 + (local14.anInt1674 - local23) * arg3 / 16;
			local14.anInt1676 = local29 + (local14.anInt1676 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!md;IIIIII)V")
	private void method982(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray245.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray245[local5] - Static55.anInt1375;
			local20 = arg0.anIntArray242[local5] - Static55.anInt1378;
			local27 = arg0.anIntArray243[local5] - Static55.anInt1368;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray235 != null) {
				Static74.anIntArray239[local5] = local37;
				Static74.anIntArray244[local5] = local59;
				Static74.anIntArray237[local5] = local69;
			}
			Static74.anIntArray236[local5] = Static24.anInt786 + (local37 << 9) / local69;
			Static74.anIntArray240[local5] = Static24.anInt781 + (local59 << 9) / local69;
		}
		Static24.anInt785 = 0;
		local3 = arg0.anIntArray247.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray247[local13];
			local27 = arg0.anIntArray246[local13];
			local37 = arg0.anIntArray248[local13];
			@Pc(142) int local142 = Static74.anIntArray236[local20];
			@Pc(146) int local146 = Static74.anIntArray236[local27];
			@Pc(150) int local150 = Static74.anIntArray236[local37];
			@Pc(154) int local154 = Static74.anIntArray240[local20];
			@Pc(158) int local158 = Static74.anIntArray240[local27];
			@Pc(162) int local162 = Static74.anIntArray240[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static24.aBoolean33 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static24.anInt784 || local146 > Static24.anInt784 || local150 > Static24.anInt784) {
					Static24.aBoolean33 = true;
				}
				if (Static55.aBoolean53 && this.method969(Static55.anInt1381, Static55.anInt1367, local154, local158, local162, local142, local146, local150)) {
					Static55.anInt1361 = arg5;
					Static55.anInt1365 = arg6;
				}
				if (arg0.anIntArray235 == null || arg0.anIntArray235[local13] == -1) {
					if (arg0.anIntArray234[local13] != 12345678) {
						Static24.method471(local154, local158, local162, local142, local146, local150, arg0.anIntArray234[local13], arg0.anIntArray238[local13], arg0.anIntArray241[local13]);
					}
				} else if (Static55.aBoolean52) {
					@Pc(364) int local364 = Static24.anInterface2_1.method491(arg0.anIntArray235[local13]);
					Static24.method471(local154, local158, local162, local142, local146, local150, Static55.method988(local364, arg0.anIntArray234[local13]), Static55.method988(local364, arg0.anIntArray238[local13]), Static55.method988(local364, arg0.anIntArray241[local13]));
				} else if (arg0.aBoolean69) {
					Static24.method460(local154, local158, local162, local142, local146, local150, arg0.anIntArray234[local13], arg0.anIntArray238[local13], arg0.anIntArray241[local13], Static74.anIntArray239[0], Static74.anIntArray239[1], Static74.anIntArray239[3], Static74.anIntArray244[0], Static74.anIntArray244[1], Static74.anIntArray244[3], Static74.anIntArray237[0], Static74.anIntArray237[1], Static74.anIntArray237[3], arg0.anIntArray235[local13]);
				} else {
					Static24.method460(local154, local158, local162, local142, local146, local150, arg0.anIntArray234[local13], arg0.anIntArray238[local13], arg0.anIntArray241[local13], Static74.anIntArray239[local20], Static74.anIntArray239[local27], Static74.anIntArray239[local37], Static74.anIntArray244[local20], Static74.anIntArray244[local27], Static74.anIntArray244[local37], Static74.anIntArray237[local20], Static74.anIntArray237[local27], Static74.anIntArray237[local37], arg0.anIntArray235[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(III)V")
	public void method983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass31_1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(IIII)I")
	public int method985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass71_1 != null && local8.aClass71_1.anInt2426 == arg3) {
			return local8.aClass71_1.anInt2429 & 0xFF;
		} else if (local8.aClass46_1 != null && local8.aClass46_1.anInt1683 == arg3) {
			return local8.aClass46_1.anInt1685 & 0xFF;
		} else if (local8.aClass31_1 != null && local8.aClass31_1.anInt1204 == arg3) {
			return local8.aClass31_1.anInt1202 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2057; local56++) {
				if (local8.aClass8Array3[local56].anInt213 == arg3) {
					return local8.aClass8Array3[local56].anInt209 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!je", name = "i", descriptor = "(III)V")
	public void method986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static55.aBoolean53 = true;
		Static55.anInt1377 = arg0;
		Static55.anInt1381 = arg1;
		Static55.anInt1367 = arg2;
		Static55.anInt1361 = -1;
		Static55.anInt1365 = -1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIILclient!sd;IIZ)Z")
	public boolean method987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method980(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!je", name = "j", descriptor = "(III)Lclient!lb;")
	public Class46 method989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass46_1;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
	public void method990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub15 local31 = this.aClass3_Sub15ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub15ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2059--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2057; local41++) {
					@Pc(47) Class8 local47 = local31.aClass8Array3[local41];
					if ((local47.anInt213 >> 29 & 0x3) == 2 && local47.anInt211 == arg0 && local47.anInt203 == arg1) {
						local47.anInt207--;
					}
				}
			}
		}
		if (this.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub15(0, arg0, arg1);
		}
		this.aClass3_Sub15ArrayArrayArray1[0][arg0][arg1].aClass3_Sub15_1 = local8;
		this.aClass3_Sub15ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILclient!sd;Lclient!sd;IIII)V")
	public void method991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) Class3_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class71 local8 = new Class71();
		local8.anInt2426 = arg8;
		local8.anInt2429 = arg9;
		local8.anInt2434 = arg1 * 128 + 64;
		local8.anInt2424 = arg2 * 128 + 64;
		local8.anInt2432 = arg3;
		local8.aClass3_Sub1_Sub4_8 = arg4;
		local8.aClass3_Sub1_Sub4_7 = arg5;
		local8.anInt2435 = arg6;
		local8.anInt2425 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub15ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub15ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub15(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local8;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(IIII)Z")
	private boolean method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1005(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method977(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method977(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method977(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method977(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILclient!sd;II)V")
	public void method993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class31 local6 = new Class31();
		local6.aClass3_Sub1_Sub4_5 = arg4;
		local6.anInt1211 = arg1 * 128 + 64;
		local6.anInt1205 = arg2 * 128 + 64;
		local6.anInt1200 = arg3;
		local6.anInt1204 = arg5;
		local6.anInt1202 = arg6;
		if (this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub15(arg0, arg1, arg2);
		}
		this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local6;
	}

	@OriginalMember(owner = "client!je", name = "k", descriptor = "(III)Lclient!bc;")
	public Class8 method994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2057; local14++) {
			@Pc(20) Class8 local20 = local8.aClass8Array3[local14];
			if ((local20.anInt213 >> 29 & 0x3) == 2 && local20.anInt211 == arg1 && local20.anInt203 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()V")
	public void method995() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1380; local1++) {
			for (local4 = 0; local4 < this.anInt1360; local4++) {
				for (local7 = 0; local7 < this.anInt1371; local7++) {
					this.aClass3_Sub15ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static55.anInt1362; local4++) {
			for (local7 = 0; local7 < Static55.anIntArray166[local4]; local7++) {
				Static55.aClass67ArrayArray1[local4][local7] = null;
			}
			Static55.anIntArray166[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1357; local7++) {
			this.aClass8Array2[local7] = null;
		}
		this.anInt1357 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static55.aClass8Array1.length; local76++) {
			Static55.aClass8Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "l", descriptor = "(III)Lclient!hc;")
	public Class31 method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass31_1 == null ? null : local8.aClass31_1;
	}

	@OriginalMember(owner = "client!je", name = "m", descriptor = "(III)V")
	public void method997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass46_1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(IIII)V")
	public void method998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].anInt2061 = arg3;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIILclient!sd;IIIIII)Z")
	public boolean method999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method980(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!oc;Z)V")
	private void method1000(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		Static55.aClass11_8.method190(arg0);
		while (true) {
			@Pc(8) Class3_Sub15 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub15[][] local31;
			@Pc(49) Class3_Sub15 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class71 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class8 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class3_Sub15 var35;
										while (true) {
											do {
												local8 = (Class3_Sub15) Static55.aClass11_8.method193();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean74);
											local17 = local8.anInt2060;
											local20 = local8.anInt2056;
											local23 = local8.anInt2059;
											local26 = local8.anInt2067;
											local31 = this.aClass3_Sub15ArrayArrayArray1[local23];
											if (!local8.aBoolean76) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub15ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean74) {
														continue;
													}
												}
												if (local17 <= Static55.anInt1356 && local17 > Static55.anInt1382) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean74 && (local49.aBoolean76 || (local8.anInt2058 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static55.anInt1356 && local17 < Static55.anInt1379 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean74 && (local49.aBoolean76 || (local8.anInt2058 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static55.anInt1366 && local20 > Static55.anInt1355) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean74 && (local49.aBoolean76 || (local8.anInt2058 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static55.anInt1366 && local20 < Static55.anInt1373 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean74 && (local49.aBoolean76 || (local8.anInt2058 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean76 = false;
											if (local8.aClass3_Sub15_1 != null) {
												local49 = local8.aClass3_Sub15_1;
												if (local49.aClass48_1 == null) {
													if (local49.aClass50_1 != null && !this.method1005(0, local17, local20)) {
														this.method982(local49.aClass50_1, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local17, local20);
													}
												} else if (!this.method1005(0, local17, local20)) {
													this.method966(local49.aClass48_1, 0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local17, local20);
												}
												@Pc(225) Class71 local225 = local49.aClass71_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub4_8.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local225.anInt2434 - Static55.anInt1375, local225.anInt2432 - Static55.anInt1378, local225.anInt2424 - Static55.anInt1368, local225.anInt2426);
												}
												for (local251 = 0; local251 < local49.anInt2057; local251++) {
													var12 = local49.aClass8Array3[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub4_4.method1753(var12.anInt201, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, var12.anInt204 - Static55.anInt1375, var12.anInt210 - Static55.anInt1378, var12.anInt214 - Static55.anInt1368, var12.anInt213);
													}
												}
											}
											var24 = false;
											if (local8.aClass48_1 == null) {
												if (local8.aClass50_1 != null && !this.method1005(local26, local17, local20)) {
													var24 = true;
													this.method982(local8.aClass50_1, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local17, local20);
												}
											} else if (!this.method1005(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass48_1.anInt1776 != 12345678 || Static55.aBoolean53 && local23 <= Static55.anInt1377) {
													this.method966(local8.aClass48_1, local26, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class71 local350 = local8.aClass71_1;
											@Pc(353) Class46 local353 = local8.aClass46_1;
											if (local350 != null || local353 != null) {
												if (Static55.anInt1356 == local17) {
													var23++;
												} else if (Static55.anInt1356 < local17) {
													var23 += 2;
												}
												if (Static55.anInt1366 == local20) {
													var23 += 3;
												} else if (Static55.anInt1366 > local20) {
													var23 += 6;
												}
												local251 = Static55.anIntArray172[var23];
												local8.anInt2063 = Static55.anIntArray171[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2435 & Static55.anIntArray173[var23]) == 0) {
													local8.anInt2066 = 0;
												} else if (local350.anInt2435 == 16) {
													local8.anInt2066 = 3;
													local8.anInt2064 = Static55.anIntArray175[var23];
													local8.anInt2065 = 3 - local8.anInt2064;
												} else if (local350.anInt2435 == 32) {
													local8.anInt2066 = 6;
													local8.anInt2064 = Static55.anIntArray177[var23];
													local8.anInt2065 = 6 - local8.anInt2064;
												} else if (local350.anInt2435 == 64) {
													local8.anInt2066 = 12;
													local8.anInt2064 = Static55.anIntArray174[var23];
													local8.anInt2065 = 12 - local8.anInt2064;
												} else {
													local8.anInt2066 = 9;
													local8.anInt2064 = Static55.anIntArray176[var23];
													local8.anInt2065 = 9 - local8.anInt2064;
												}
												if ((local350.anInt2435 & local251) != 0 && !this.method1001(local26, local17, local20, local350.anInt2435)) {
													local350.aClass3_Sub1_Sub4_8.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local350.anInt2434 - Static55.anInt1375, local350.anInt2432 - Static55.anInt1378, local350.anInt2424 - Static55.anInt1368, local350.anInt2426);
												}
												if ((local350.anInt2425 & local251) != 0 && !this.method1001(local26, local17, local20, local350.anInt2425)) {
													local350.aClass3_Sub1_Sub4_7.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local350.anInt2434 - Static55.anInt1375, local350.anInt2432 - Static55.anInt1378, local350.anInt2424 - Static55.anInt1368, local350.anInt2426);
												}
											}
											if (local353 != null && !this.method992(local26, local17, local20, local353.aClass3_Sub1_Sub4_6.anInt2525)) {
												if ((local353.anInt1680 & local251) != 0) {
													local353.aClass3_Sub1_Sub4_6.method1753(local353.anInt1672, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local353.anInt1674 - Static55.anInt1375, local353.anInt1677 - Static55.anInt1378, local353.anInt1676 - Static55.anInt1368, local353.anInt1683);
												} else if ((local353.anInt1680 & 0x300) != 0) {
													local588 = local353.anInt1674 - Static55.anInt1375;
													local593 = local353.anInt1677 - Static55.anInt1378;
													local598 = local353.anInt1676 - Static55.anInt1368;
													local601 = local353.anInt1672;
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
													if ((local353.anInt1680 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static55.anIntArray170[local601];
														local645 = local598 + Static55.anIntArray167[local601];
														local353.aClass3_Sub1_Sub4_6.method1753(local601 * 512 + 256, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local639, local593, local645, local353.anInt1683);
													}
													if ((local353.anInt1680 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static55.anIntArray169[local601];
														local645 = local598 + Static55.anIntArray168[local601];
														local353.aClass3_Sub1_Sub4_6.method1753(local601 * 512 + 1280 & 0x7FF, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local639, local593, local645, local353.anInt1683);
													}
												}
											}
											if (var24) {
												@Pc(706) Class31 local706 = local8.aClass31_1;
												if (local706 != null) {
													local706.aClass3_Sub1_Sub4_5.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local706.anInt1211 - Static55.anInt1375, local706.anInt1200 - Static55.anInt1378, local706.anInt1205 - Static55.anInt1368, local706.anInt1204);
												}
												@Pc(733) Class2 local733 = local8.aClass2_1;
												if (local733 != null && local733.anInt77 == 0) {
													if (local733.aClass3_Sub1_Sub4_2 != null) {
														local733.aClass3_Sub1_Sub4_2.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local733.anInt73 - Static55.anInt1375, local733.anInt70 - Static55.anInt1378, local733.anInt71 - Static55.anInt1368, local733.anInt76);
													}
													if (local733.aClass3_Sub1_Sub4_3 != null) {
														local733.aClass3_Sub1_Sub4_3.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local733.anInt73 - Static55.anInt1375, local733.anInt70 - Static55.anInt1378, local733.anInt71 - Static55.anInt1368, local733.anInt76);
													}
													if (local733.aClass3_Sub1_Sub4_1 != null) {
														local733.aClass3_Sub1_Sub4_1.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local733.anInt73 - Static55.anInt1375, local733.anInt70 - Static55.anInt1378, local733.anInt71 - Static55.anInt1368, local733.anInt76);
													}
												}
											}
											local588 = local8.anInt2058;
											if (local588 != 0) {
												if (local17 < Static55.anInt1356 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean74) {
														Static55.aClass11_8.method190(var35);
													}
												}
												if (local20 < Static55.anInt1366 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean74) {
														Static55.aClass11_8.method190(var35);
													}
												}
												if (local17 > Static55.anInt1356 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean74) {
														Static55.aClass11_8.method190(var35);
													}
												}
												if (local20 > Static55.anInt1366 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean74) {
														Static55.aClass11_8.method190(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2066 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2057; var23++) {
												if (local8.aClass8Array3[var23].anInt212 != Static55.anInt1376 && (local8.anIntArray267[var23] & local8.anInt2066) == local8.anInt2064) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass71_1;
												if (!this.method1001(local26, local17, local20, local952.anInt2435)) {
													local952.aClass3_Sub1_Sub4_8.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local952.anInt2434 - Static55.anInt1375, local952.anInt2432 - Static55.anInt1378, local952.anInt2424 - Static55.anInt1368, local952.anInt2426);
												}
												local8.anInt2066 = 0;
											}
										}
										if (!local8.aBoolean75) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt2057;
											local8.aBoolean75 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass8Array3[local251];
												if (var12.anInt212 != Static55.anInt1376) {
													for (local1011 = var12.anInt211; local1011 <= var12.anInt216; local1011++) {
														for (local588 = var12.anInt203; local588 <= var12.anInt198; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean76) {
																local8.aBoolean75 = true;
																continue label568;
															}
															if (var35.anInt2066 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt211) {
																	local598++;
																}
																if (local1011 < var12.anInt216) {
																	local598 += 4;
																}
																if (local588 > var12.anInt203) {
																	local598 += 8;
																}
																if (local588 < var12.anInt198) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt2066) == local8.anInt2065) {
																	local8.aBoolean75 = true;
																	continue label568;
																}
															}
														}
													}
													Static55.aClass8Array1[var23++] = var12;
													local588 = Static55.anInt1356 - var12.anInt211;
													local593 = var12.anInt216 - Static55.anInt1356;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static55.anInt1366 - var12.anInt203;
													local601 = var12.anInt198 - Static55.anInt1366;
													if (local601 > local598) {
														var12.anInt200 = local588 + local601;
													} else {
														var12.anInt200 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class8 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static55.aClass8Array1[local588];
													if (local1135.anInt212 != Static55.anInt1376) {
														if (local1135.anInt200 > local1126) {
															local1126 = local1135.anInt200;
															local1011 = local588;
														} else if (local1135.anInt200 == local1126) {
															local598 = local1135.anInt204 - Static55.anInt1375;
															local601 = local1135.anInt214 - Static55.anInt1368;
															local610 = Static55.aClass8Array1[local1011].anInt204 - Static55.anInt1375;
															var19 = Static55.aClass8Array1[local1011].anInt214 - Static55.anInt1368;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static55.aClass8Array1[local1011];
												local1135.anInt212 = Static55.anInt1376;
												if (!this.method978(local26, local1135.anInt211, local1135.anInt216, local1135.anInt203, local1135.anInt198, local1135.aClass3_Sub1_Sub4_4.anInt2525)) {
													local1135.aClass3_Sub1_Sub4_4.method1753(local1135.anInt201, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local1135.anInt204 - Static55.anInt1375, local1135.anInt210 - Static55.anInt1378, local1135.anInt214 - Static55.anInt1368, local1135.anInt213);
												}
												for (local598 = local1135.anInt211; local598 <= local1135.anInt216; local598++) {
													for (local601 = local1135.anInt203; local601 <= local1135.anInt198; local601++) {
														@Pc(1260) Class3_Sub15 local1260 = local31[local598][local601];
														if (local1260.anInt2066 != 0) {
															Static55.aClass11_8.method190(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean74) {
															Static55.aClass11_8.method190(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean75) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean75 = false;
											break;
										}
									}
								} while (!local8.aBoolean74);
							} while (local8.anInt2066 != 0);
							if (local17 > Static55.anInt1356 || local17 <= Static55.anInt1382) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean74);
						if (local17 < Static55.anInt1356 || local17 >= Static55.anInt1379 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean74);
					if (local20 > Static55.anInt1366 || local20 <= Static55.anInt1355) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean74);
				if (local20 < Static55.anInt1366 || local20 >= Static55.anInt1373 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean74);
			local8.aBoolean74 = false;
			Static55.anInt1364--;
			@Pc(1402) Class2 local1402 = local8.aClass2_1;
			if (local1402 != null && local1402.anInt77 != 0) {
				if (local1402.aClass3_Sub1_Sub4_2 != null) {
					local1402.aClass3_Sub1_Sub4_2.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local1402.anInt73 - Static55.anInt1375, local1402.anInt70 - Static55.anInt1378 - local1402.anInt77, local1402.anInt71 - Static55.anInt1368, local1402.anInt76);
				}
				if (local1402.aClass3_Sub1_Sub4_3 != null) {
					local1402.aClass3_Sub1_Sub4_3.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local1402.anInt73 - Static55.anInt1375, local1402.anInt70 - Static55.anInt1378 - local1402.anInt77, local1402.anInt71 - Static55.anInt1368, local1402.anInt76);
				}
				if (local1402.aClass3_Sub1_Sub4_1 != null) {
					local1402.aClass3_Sub1_Sub4_1.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local1402.anInt73 - Static55.anInt1375, local1402.anInt70 - Static55.anInt1378 - local1402.anInt77, local1402.anInt71 - Static55.anInt1368, local1402.anInt76);
				}
			}
			if (local8.anInt2063 != 0) {
				@Pc(1497) Class46 local1497 = local8.aClass46_1;
				if (local1497 != null && !this.method992(local26, local17, local20, local1497.aClass3_Sub1_Sub4_6.anInt2525)) {
					if ((local1497.anInt1680 & local8.anInt2063) != 0) {
						local1497.aClass3_Sub1_Sub4_6.method1753(local1497.anInt1672, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local1497.anInt1674 - Static55.anInt1375, local1497.anInt1677 - Static55.anInt1378, local1497.anInt1676 - Static55.anInt1368, local1497.anInt1683);
					} else if ((local1497.anInt1680 & 0x300) != 0) {
						local251 = local1497.anInt1674 - Static55.anInt1375;
						local1126 = local1497.anInt1677 - Static55.anInt1378;
						local1011 = local1497.anInt1676 - Static55.anInt1368;
						local588 = local1497.anInt1672;
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
						if ((local1497.anInt1680 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static55.anIntArray170[local588];
							local610 = local1011 + Static55.anIntArray167[local588];
							local1497.aClass3_Sub1_Sub4_6.method1753(local588 * 512 + 256, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local601, local1126, local610, local1497.anInt1683);
						}
						if ((local1497.anInt1680 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static55.anIntArray169[local588];
							local610 = local1011 + Static55.anIntArray168[local588];
							local1497.aClass3_Sub1_Sub4_6.method1753(local588 * 512 + 1280 & 0x7FF, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local601, local1126, local610, local1497.anInt1683);
						}
					}
				}
				local952 = local8.aClass71_1;
				if (local952 != null) {
					if ((local952.anInt2425 & local8.anInt2063) != 0 && !this.method1001(local26, local17, local20, local952.anInt2425)) {
						local952.aClass3_Sub1_Sub4_7.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local952.anInt2434 - Static55.anInt1375, local952.anInt2432 - Static55.anInt1378, local952.anInt2424 - Static55.anInt1368, local952.anInt2426);
					}
					if ((local952.anInt2435 & local8.anInt2063) != 0 && !this.method1001(local26, local17, local20, local952.anInt2435)) {
						local952.aClass3_Sub1_Sub4_8.method1753(0, Static55.anInt1374, Static55.anInt1372, Static55.anInt1363, Static55.anInt1370, local952.anInt2434 - Static55.anInt1375, local952.anInt2432 - Static55.anInt1378, local952.anInt2424 - Static55.anInt1368, local952.anInt2426);
					}
				}
			}
			@Pc(1755) Class3_Sub15 local1755;
			if (local23 < this.anInt1380 - 1) {
				local1755 = this.aClass3_Sub15ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean74) {
					Static55.aClass11_8.method190(local1755);
				}
			}
			if (local17 < Static55.anInt1356) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean74) {
					Static55.aClass11_8.method190(local1755);
				}
			}
			if (local20 < Static55.anInt1366) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean74) {
					Static55.aClass11_8.method190(local1755);
				}
			}
			if (local17 > Static55.anInt1356) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean74) {
					Static55.aClass11_8.method190(local1755);
				}
			}
			if (local20 > Static55.anInt1366) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean74) {
					Static55.aClass11_8.method190(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(IIII)Z")
	private boolean method1001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1005(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static55.anInt1375) {
					if (!this.method977(local11, local26, local15)) {
						return false;
					}
					if (!this.method977(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method977(local11, local30, local15)) {
						return false;
					}
					if (!this.method977(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method977(local11, local34, local15)) {
					return false;
				}
				if (!this.method977(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static55.anInt1368) {
					if (!this.method977(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method977(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method977(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method977(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method977(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method977(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static55.anInt1375) {
					if (!this.method977(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method977(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method977(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method977(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method977(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method977(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static55.anInt1368) {
					if (!this.method977(local11, local26, local15)) {
						return false;
					}
					if (!this.method977(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method977(local11, local30, local15)) {
						return false;
					}
					if (!this.method977(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method977(local11, local34, local15)) {
					return false;
				}
				if (!this.method977(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method977(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method977(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method977(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method977(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method977(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!bc;)V")
	private void method1002(@OriginalArg(0) Class8 arg0) {
		for (@Pc(2) int local2 = arg0.anInt211; local2 <= arg0.anInt216; local2++) {
			for (@Pc(6) int local6 = arg0.anInt203; local6 <= arg0.anInt198; local6++) {
				@Pc(17) Class3_Sub15 local17 = this.aClass3_Sub15ArrayArrayArray1[arg0.anInt207][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2057; local21++) {
						if (local17.aClass8Array3[local21] == arg0) {
							local17.anInt2057--;
							for (local36 = local21; local36 < local17.anInt2057; local36++) {
								local17.aClass8Array3[local36] = local17.aClass8Array3[local36 + 1];
								local17.anIntArray267[local36] = local17.anIntArray267[local36 + 1];
							}
							local17.aClass8Array3[local17.anInt2057] = null;
							break;
						}
					}
					local17.anInt2058 = 0;
					for (local36 = 0; local36 < local17.anInt2057; local36++) {
						local17.anInt2058 |= local17.anIntArray267[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class48 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class48(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub15ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub15ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub15(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class48(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub15ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub15ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub15(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local12;
		} else {
			@Pc(140) Class50 local140 = new Class50(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub15ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub15ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub15(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass50_1 = local140;
		}
	}

	@OriginalMember(owner = "client!je", name = "n", descriptor = "(III)V")
	public void method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass2_1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "o", descriptor = "(III)Z")
	private boolean method1005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static55.anInt1376) {
			return false;
		} else if (local8 == Static55.anInt1376) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method977(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method977(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method977(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method977(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static55.anInt1376;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static55.anInt1376;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([IIIIII)V")
	public void method1007(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class48 local14 = local8.aClass48_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1777;
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
		@Pc(59) Class50 local59 = local8.aClass50_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1838;
		@Pc(68) int local68 = local59.anInt1837;
		@Pc(71) int local71 = local59.anInt1839;
		@Pc(74) int local74 = local59.anInt1840;
		@Pc(79) int[] local79 = this.anIntArrayArray8[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray9[local68];
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

	@OriginalMember(owner = "client!je", name = "p", descriptor = "(III)V")
	public void method1008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass71_1 = null;
		}
	}

	@OriginalMember(owner = "client!je", name = "q", descriptor = "(III)Lclient!se;")
	public Class71 method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass71_1;
	}

	@OriginalMember(owner = "client!je", name = "r", descriptor = "(III)I")
	public int method1010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub15 local8 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass71_1 == null ? 0 : local8.aClass71_1.anInt2426;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIILclient!sd;ILclient!sd;Lclient!sd;)V")
	public void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub4 arg6, @OriginalArg(7) Class3_Sub1_Sub4 arg7) {
		@Pc(3) Class2 local3 = new Class2();
		local3.aClass3_Sub1_Sub4_1 = arg4;
		local3.anInt73 = arg1 * 128 + 64;
		local3.anInt71 = arg2 * 128 + 64;
		local3.anInt70 = arg3;
		local3.anInt76 = arg5;
		local3.aClass3_Sub1_Sub4_2 = arg6;
		local3.aClass3_Sub1_Sub4_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub15 local43 = this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2057; local47++) {
				if ((local43.aClass8Array3[local47].anInt209 & 0x100) == 256 && local43.aClass8Array3[local47].aClass3_Sub1_Sub4_4 instanceof Class3_Sub1_Sub4_Sub7) {
					@Pc(71) Class3_Sub1_Sub4_Sub7 local71 = (Class3_Sub1_Sub4_Sub7) local43.aClass8Array3[local47].aClass3_Sub1_Sub4_4;
					local71.method1761();
					if (local71.anInt2525 > local34) {
						local34 = local71.anInt2525;
					}
				}
			}
		}
		local3.anInt77 = local34;
		if (this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub15(arg0, arg1, arg2);
		}
		this.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass2_1 = local3;
	}
}
