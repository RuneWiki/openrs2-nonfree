import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class61 {

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
	private int anInt2417 = 0;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	private int anInt2431 = 0;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "[Lclient!af;")
	private final Class6[] aClass6Array2 = new Class6[5000];

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "[[I")
	private final int[][] anIntArrayArray26 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "[I")
	private final int[] anIntArray306 = new int[10000];

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "[I")
	private final int[] anIntArray308 = new int[10000];

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "[[I")
	private final int[][] anIntArrayArray27 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "I")
	private final int anInt2421;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	private final int anInt2416;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
	private final int anInt2438;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "[[[Lclient!wa;")
	private final Class2_Sub15[][][] aClass2_Sub15ArrayArrayArray1;

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(III[[[I)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2421 = arg0;
		this.anInt2416 = arg1;
		this.anInt2438 = arg2;
		this.aClass2_Sub15ArrayArrayArray1 = new Class2_Sub15[arg0][arg1][arg2];
		this.anIntArrayArrayArray8 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray7 = arg3;
		this.method1703();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILclient!db;IIZ)Z")
	public boolean method1688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1696(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray8[arg0][local17][local21] == -Static93.anInt2428) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5;
			if (!this.method1717(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1717(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1717(local21, local167, local195)) {
				return false;
			} else if (this.method1717(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1732(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1717(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1717(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1717(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1717(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!tc;IIIIIII)V")
	private void method1691(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static93.anInt2430;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static93.anInt2429;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray7[arg1][arg6][arg7] - Static93.anInt2414;
		@Pc(51) int local51 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static93.anInt2414;
		@Pc(66) int local66 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static93.anInt2414;
		@Pc(79) int local79 = this.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static93.anInt2414;
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
		@Pc(279) int local279 = Static87.anInt2268 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static87.anInt2263 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static87.anInt2268 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static87.anInt2263 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static87.anInt2268 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static87.anInt2263 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static87.anInt2268 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static87.anInt2263 + (local89 << 9) / local265;
		Static87.anInt2265 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static87.aBoolean90 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static87.anInt2266 || local327 > Static87.anInt2266 || local295 > Static87.anInt2266) {
				Static87.aBoolean90 = true;
			}
			if (Static93.aBoolean109 && this.method1724(Static93.anInt2439, Static93.anInt2425, local319, local335, local303, local311, local327, local295)) {
				Static93.anInt2420 = arg6;
				Static93.anInt2435 = arg7;
			}
			if (arg0.anInt2613 == -1) {
				if (arg0.anInt2615 != 12345678) {
					Static87.method1598(local319, local335, local303, local311, local327, local295, arg0.anInt2615, arg0.anInt2625, arg0.anInt2621);
				}
			} else if (Static93.aBoolean108) {
				local472 = Static87.anInterface3_1.method1813(arg0.anInt2613);
				Static87.method1598(local319, local335, local303, local311, local327, local295, Static93.method1719(local472, arg0.anInt2615), Static93.method1719(local472, arg0.anInt2625), Static93.method1719(local472, arg0.anInt2621));
			} else if (arg0.aBoolean117) {
				Static87.method1609(local319, local335, local303, local311, local327, local295, arg0.anInt2615, arg0.anInt2625, arg0.anInt2621, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2613);
			} else {
				Static87.method1609(local319, local335, local303, local311, local327, local295, arg0.anInt2615, arg0.anInt2625, arg0.anInt2621, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2613);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static87.aBoolean90 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static87.anInt2266 || local295 > Static87.anInt2266 || local327 > Static87.anInt2266) {
			Static87.aBoolean90 = true;
		}
		if (Static93.aBoolean109 && this.method1724(Static93.anInt2439, Static93.anInt2425, local287, local303, local335, local279, local295, local327)) {
			Static93.anInt2420 = arg6;
			Static93.anInt2435 = arg7;
		}
		if (arg0.anInt2613 != -1) {
			if (!Static93.aBoolean108) {
				Static87.method1609(local287, local303, local335, local279, local295, local327, arg0.anInt2610, arg0.anInt2621, arg0.anInt2625, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2613);
				return;
			}
			local472 = Static87.anInterface3_1.method1813(arg0.anInt2613);
			Static87.method1598(local287, local303, local335, local279, local295, local327, Static93.method1719(local472, arg0.anInt2610), Static93.method1719(local472, arg0.anInt2621), Static93.method1719(local472, arg0.anInt2625));
		} else if (arg0.anInt2610 != 12345678) {
			Static87.method1598(local287, local303, local335, local279, local295, local327, arg0.anInt2610, arg0.anInt2621, arg0.anInt2625);
			return;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!db;Lclient!db;IIII)V")
	public void method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) Class2_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class35 local8 = new Class35();
		local8.anInt1327 = arg8;
		local8.anInt1331 = arg9;
		local8.anInt1323 = arg1 * 128 + 64;
		local8.anInt1325 = arg2 * 128 + 64;
		local8.anInt1333 = arg3;
		local8.aClass2_Sub1_Sub4_4 = arg4;
		local8.aClass2_Sub1_Sub4_3 = arg5;
		local8.anInt1328 = arg6;
		local8.anInt1335 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub15ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub15ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub15(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local8;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
	public void method1693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass17_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fe;IIIIII)V")
	private void method1694(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray125.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray125[local5] - Static93.anInt2430;
			local20 = arg0.anIntArray126[local5] - Static93.anInt2414;
			local27 = arg0.anIntArray119[local5] - Static93.anInt2429;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray113 != null) {
				Static31.anIntArray117[local5] = local37;
				Static31.anIntArray120[local5] = local59;
				Static31.anIntArray114[local5] = local69;
			}
			Static31.anIntArray122[local5] = Static87.anInt2268 + (local37 << 9) / local69;
			Static31.anIntArray121[local5] = Static87.anInt2263 + (local59 << 9) / local69;
		}
		Static87.anInt2265 = 0;
		local3 = arg0.anIntArray116.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray116[local13];
			local27 = arg0.anIntArray124[local13];
			local37 = arg0.anIntArray118[local13];
			@Pc(142) int local142 = Static31.anIntArray122[local20];
			@Pc(146) int local146 = Static31.anIntArray122[local27];
			@Pc(150) int local150 = Static31.anIntArray122[local37];
			@Pc(154) int local154 = Static31.anIntArray121[local20];
			@Pc(158) int local158 = Static31.anIntArray121[local27];
			@Pc(162) int local162 = Static31.anIntArray121[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static87.aBoolean90 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static87.anInt2266 || local146 > Static87.anInt2266 || local150 > Static87.anInt2266) {
					Static87.aBoolean90 = true;
				}
				if (Static93.aBoolean109 && this.method1724(Static93.anInt2439, Static93.anInt2425, local154, local158, local162, local142, local146, local150)) {
					Static93.anInt2420 = arg5;
					Static93.anInt2435 = arg6;
				}
				if (arg0.anIntArray113 == null || arg0.anIntArray113[local13] == -1) {
					if (arg0.anIntArray123[local13] != 12345678) {
						Static87.method1598(local154, local158, local162, local142, local146, local150, arg0.anIntArray123[local13], arg0.anIntArray112[local13], arg0.anIntArray115[local13]);
					}
				} else if (Static93.aBoolean108) {
					@Pc(364) int local364 = Static87.anInterface3_1.method1813(arg0.anIntArray113[local13]);
					Static87.method1598(local154, local158, local162, local142, local146, local150, Static93.method1719(local364, arg0.anIntArray123[local13]), Static93.method1719(local364, arg0.anIntArray112[local13]), Static93.method1719(local364, arg0.anIntArray115[local13]));
				} else if (arg0.aBoolean47) {
					Static87.method1609(local154, local158, local162, local142, local146, local150, arg0.anIntArray123[local13], arg0.anIntArray112[local13], arg0.anIntArray115[local13], Static31.anIntArray117[0], Static31.anIntArray117[1], Static31.anIntArray117[3], Static31.anIntArray120[0], Static31.anIntArray120[1], Static31.anIntArray120[3], Static31.anIntArray114[0], Static31.anIntArray114[1], Static31.anIntArray114[3], arg0.anIntArray113[local13]);
				} else {
					Static87.method1609(local154, local158, local162, local142, local146, local150, arg0.anIntArray123[local13], arg0.anIntArray112[local13], arg0.anIntArray115[local13], Static31.anIntArray117[local20], Static31.anIntArray117[local27], Static31.anIntArray117[local37], Static31.anIntArray120[local20], Static31.anIntArray120[local27], Static31.anIntArray120[local37], Static31.anIntArray114[local20], Static31.anIntArray114[local27], Static31.anIntArray114[local37], arg0.anIntArray113[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIILclient!db;IZII)Z")
	private boolean method1696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2416 || local4 >= this.anInt2438) {
					return false;
				}
				@Pc(28) Class2_Sub15 local28 = this.aClass2_Sub15ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2979 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class6 local52 = new Class6();
		local52.anInt157 = arg11;
		local52.anInt164 = arg12;
		local52.anInt166 = arg0;
		local52.anInt167 = arg5;
		local52.anInt155 = arg6;
		local52.anInt151 = arg7;
		local52.aClass2_Sub1_Sub4_1 = arg8;
		local52.anInt158 = arg9;
		local52.anInt152 = arg1;
		local52.anInt150 = arg2;
		local52.anInt165 = arg1 + arg3 - 1;
		local52.anInt161 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub15ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub15ArrayArrayArray1[local130][local98][local101] = new Class2_Sub15(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub15 local166 = this.aClass2_Sub15ArrayArrayArray1[arg0][local98][local101];
				local166.aClass6Array3[local166.anInt2979] = local52;
				local166.anIntArray352[local166.anInt2979] = local104;
				local166.anInt2989 |= local104;
				local166.anInt2979++;
			}
		}
		if (arg10) {
			this.aClass6Array2[this.anInt2417++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V")
	public void method1698() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2421; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2416; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2438; local7++) {
					@Pc(17) Class2_Sub15 local17 = this.aClass2_Sub15ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class35 local22 = local17.aClass35_1;
						if (local22 != null && local22.aClass2_Sub1_Sub4_4 instanceof Class2_Sub1_Sub4_Sub1) {
							@Pc(32) Class2_Sub1_Sub4_Sub1 local32 = (Class2_Sub1_Sub4_Sub1) local22.aClass2_Sub1_Sub4_4;
							if (local32.aClass55Array1 != null) {
								this.method1700(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub1_Sub4_3 instanceof Class2_Sub1_Sub4_Sub1) {
									@Pc(51) Class2_Sub1_Sub4_Sub1 local51 = (Class2_Sub1_Sub4_Sub1) local22.aClass2_Sub1_Sub4_3;
									if (local51.aClass55Array1 != null) {
										this.method1700(local51, local1, local4, local7, 1, 1);
										this.method1721(local32, local51, 0, 0, 0, false);
										local51.method664();
									}
								}
								local32.method664();
							}
						}
						@Pc(98) Class2_Sub1_Sub4_Sub1 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt2979; local82++) {
							@Pc(88) Class6 local88 = local17.aClass6Array3[local82];
							if (local88 != null && local88.aClass2_Sub1_Sub4_1 instanceof Class2_Sub1_Sub4_Sub1) {
								local98 = (Class2_Sub1_Sub4_Sub1) local88.aClass2_Sub1_Sub4_1;
								if (local98.aClass55Array1 != null) {
									this.method1700(local98, local1, local4, local7, local88.anInt165 + 1 - local88.anInt152, local88.anInt161 - local88.anInt150 + 1);
									local98.method664();
								}
							}
						}
						@Pc(134) Class58 local134 = local17.aClass58_1;
						if (local134 != null && local134.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub1) {
							local98 = (Class2_Sub1_Sub4_Sub1) local134.aClass2_Sub1_Sub4_8;
							if (local98.aClass55Array1 != null) {
								this.method1714(local98, local1, local4, local7);
								local98.method664();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
	public int method1699(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass35_1 != null && local8.aClass35_1.anInt1327 == arg3) {
			return local8.aClass35_1.anInt1331 & 0xFF;
		} else if (local8.aClass17_1 != null && local8.aClass17_1.anInt496 == arg3) {
			return local8.aClass17_1.anInt494 & 0xFF;
		} else if (local8.aClass58_1 != null && local8.aClass58_1.anInt2339 == arg3) {
			return local8.aClass58_1.anInt2345 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2979; local56++) {
				if (local8.aClass6Array3[local56].anInt157 == arg3) {
					return local8.aClass6Array3[local56].anInt164 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fd;IIIII)V")
	private void method1700(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2421) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2416) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2438 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub15 local66 = this.aClass2_Sub15ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray7[local17][local24][local34] + this.anIntArrayArrayArray7[local17][local24 + 1][local34] + this.anIntArrayArrayArray7[local17][local24][local34 + 1] + this.anIntArrayArrayArray7[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray7[arg1][arg2][arg3] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class35 local163 = local66.aClass35_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub4_Sub1 local173;
										if (local163.aClass2_Sub1_Sub4_4 instanceof Class2_Sub1_Sub4_Sub1) {
											local173 = (Class2_Sub1_Sub4_Sub1) local163.aClass2_Sub1_Sub4_4;
											if (local173.aClass55Array1 != null) {
												this.method1721(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub1_Sub4_3 instanceof Class2_Sub1_Sub4_Sub1) {
											local173 = (Class2_Sub1_Sub4_Sub1) local163.aClass2_Sub1_Sub4_3;
											if (local173.aClass55Array1 != null) {
												this.method1721(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt2979; local245++) {
										@Pc(251) Class6 local251 = local66.aClass6Array3[local245];
										if (local251 != null && local251.aClass2_Sub1_Sub4_1 instanceof Class2_Sub1_Sub4_Sub1) {
											@Pc(261) Class2_Sub1_Sub4_Sub1 local261 = (Class2_Sub1_Sub4_Sub1) local251.aClass2_Sub1_Sub4_1;
											if (local261.aClass55Array1 != null) {
												@Pc(272) int local272 = local251.anInt165 + 1 - local251.anInt152;
												@Pc(280) int local280 = local251.anInt161 + 1 - local251.anInt150;
												this.method1721(arg0, local261, (local251.anInt152 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt150 - arg3) * 128 + (local280 - arg5) * 64, local1);
											}
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!db;IIIIII)V")
	public void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class17 local6 = new Class17();
		local6.anInt496 = arg9;
		local6.anInt494 = arg10;
		local6.anInt493 = arg1 * 128 + arg7 + 64;
		local6.anInt492 = arg2 * 128 + arg8 + 64;
		local6.anInt497 = arg3;
		local6.aClass2_Sub1_Sub4_2 = arg4;
		local6.anInt501 = arg5;
		local6.anInt490 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub15ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub15ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub15(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local6;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(III)I")
	public int method1702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2979; local14++) {
			@Pc(20) Class6 local20 = local8.aClass6Array3[local14];
			if ((local20.anInt157 >> 29 & 0x3) == 2 && local20.anInt152 == arg1 && local20.anInt150 == arg2) {
				return local20.anInt157;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	public void method1703() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2421; local1++) {
			for (local4 = 0; local4 < this.anInt2416; local4++) {
				for (local7 = 0; local7 < this.anInt2438; local7++) {
					this.aClass2_Sub15ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static93.anInt2436; local4++) {
			for (local7 = 0; local7 < Static93.anIntArray296[local4]; local7++) {
				Static93.aClass66ArrayArray1[local4][local7] = null;
			}
			Static93.anIntArray296[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2417; local7++) {
			this.aClass6Array2[local7] = null;
		}
		this.anInt2417 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static93.aClass6Array1.length; local76++) {
			Static93.aClass6Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()V")
	private void method1704() {
		@Pc(3) int local3 = Static93.anIntArray296[Static93.anInt2426];
		@Pc(7) Class66[] local7 = Static93.aClass66ArrayArray1[Static93.anInt2426];
		Static93.anInt2419 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class66 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2856 == 1) {
				local27 = local16.anInt2849 + 25 - Static93.anInt2415;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2853 + 25 - Static93.anInt2422;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2862 + 25 - Static93.anInt2422;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static93.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static93.anInt2430 - local16.anInt2852;
						if (local79 > 32) {
							local16.anInt2865 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2865 = 2;
							local79 = -local79;
						}
						local16.anInt2867 = (local16.anInt2850 - Static93.anInt2429 << 8) / local79;
						local16.anInt2851 = (local16.anInt2861 - Static93.anInt2429 << 8) / local79;
						local16.anInt2863 = (local16.anInt2846 - Static93.anInt2414 << 8) / local79;
						local16.anInt2855 = (local16.anInt2847 - Static93.anInt2414 << 8) / local79;
						Static93.aClass66Array1[Static93.anInt2419++] = local16;
					}
				}
			} else if (local16.anInt2856 == 2) {
				local27 = local16.anInt2853 + 25 - Static93.anInt2422;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2849 + 25 - Static93.anInt2415;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2858 + 25 - Static93.anInt2415;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static93.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static93.anInt2429 - local16.anInt2850;
						if (local79 > 32) {
							local16.anInt2865 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2865 = 4;
							local79 = -local79;
						}
						local16.anInt2848 = (local16.anInt2852 - Static93.anInt2430 << 8) / local79;
						local16.anInt2866 = (local16.anInt2845 - Static93.anInt2430 << 8) / local79;
						local16.anInt2863 = (local16.anInt2846 - Static93.anInt2414 << 8) / local79;
						local16.anInt2855 = (local16.anInt2847 - Static93.anInt2414 << 8) / local79;
						Static93.aClass66Array1[Static93.anInt2419++] = local16;
					}
				}
			} else if (local16.anInt2856 == 4) {
				local27 = local16.anInt2846 - Static93.anInt2414;
				if (local27 > 128) {
					local40 = local16.anInt2853 + 25 - Static93.anInt2422;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2862 + 25 - Static93.anInt2422;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2849 + 25 - Static93.anInt2415;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2858 + 25 - Static93.anInt2415;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static93.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2865 = 5;
							local16.anInt2848 = (local16.anInt2852 - Static93.anInt2430 << 8) / local27;
							local16.anInt2866 = (local16.anInt2845 - Static93.anInt2430 << 8) / local27;
							local16.anInt2867 = (local16.anInt2850 - Static93.anInt2429 << 8) / local27;
							local16.anInt2851 = (local16.anInt2861 - Static93.anInt2429 << 8) / local27;
							Static93.aClass66Array1[Static93.anInt2419++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)Z")
	private boolean method1705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1732(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1717(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1717(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1717(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1717(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!db;II)V")
	public void method1706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class58 local6 = new Class58();
		local6.aClass2_Sub1_Sub4_8 = arg4;
		local6.anInt2346 = arg1 * 128 + 64;
		local6.anInt2344 = arg2 * 128 + 64;
		local6.anInt2340 = arg3;
		local6.anInt2339 = arg5;
		local6.anInt2345 = arg6;
		if (this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub15(arg0, arg1, arg2);
		}
		this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass58_1 = local6;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIII)V")
	public void method1707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2416 * 128) {
			arg0 = this.anInt2416 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2438 * 128) {
			arg2 = this.anInt2438 * 128 - 1;
		}
		Static93.anInt2428++;
		Static93.anInt2434 = Static30.anIntArray105[arg3];
		Static93.anInt2423 = Static30.anIntArray96[arg3];
		Static93.anInt2440 = Static30.anIntArray105[arg4];
		Static93.anInt2424 = Static30.anIntArray96[arg4];
		Static93.aBooleanArrayArray1 = Static93.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static93.anInt2430 = arg0;
		Static93.anInt2414 = arg1;
		Static93.anInt2429 = arg2;
		Static93.anInt2415 = arg0 / 128;
		Static93.anInt2422 = arg2 / 128;
		Static93.anInt2426 = arg5;
		Static93.anInt2437 = Static93.anInt2415 - 25;
		if (Static93.anInt2437 < 0) {
			Static93.anInt2437 = 0;
		}
		Static93.anInt2432 = Static93.anInt2422 - 25;
		if (Static93.anInt2432 < 0) {
			Static93.anInt2432 = 0;
		}
		Static93.anInt2418 = Static93.anInt2415 + 25;
		if (Static93.anInt2418 > this.anInt2416) {
			Static93.anInt2418 = this.anInt2416;
		}
		Static93.anInt2433 = Static93.anInt2422 + 25;
		if (Static93.anInt2433 > this.anInt2438) {
			Static93.anInt2433 = this.anInt2438;
		}
		this.method1704();
		Static93.anInt2427 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2431; local128 < this.anInt2421; local128++) {
			@Pc(134) Class2_Sub15[][] local134 = this.aClass2_Sub15ArrayArrayArray1[local128];
			for (local136 = Static93.anInt2437; local136 < Static93.anInt2418; local136++) {
				for (local139 = Static93.anInt2432; local139 < Static93.anInt2433; local139++) {
					@Pc(146) Class2_Sub15 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2981 <= arg5 && (Static93.aBooleanArrayArray1[local136 + 25 - Static93.anInt2415][local139 + 25 - Static93.anInt2422] || this.anIntArrayArrayArray7[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean136 = true;
							local146.aBoolean138 = true;
							if (local146.anInt2979 > 0) {
								local146.aBoolean137 = true;
							} else {
								local146.aBoolean137 = false;
							}
							Static93.anInt2427++;
						} else {
							local146.aBoolean136 = false;
							local146.aBoolean138 = false;
							local146.anInt2983 = 0;
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
		for (@Pc(224) int local224 = this.anInt2431; local224 < this.anInt2421; local224++) {
			@Pc(230) Class2_Sub15[][] local230 = this.aClass2_Sub15ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static93.anInt2415 + local139;
				local241 = Static93.anInt2415 - local139;
				if (local237 >= Static93.anInt2437 || local241 < Static93.anInt2418) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static93.anInt2422 + local249;
						local258 = Static93.anInt2422 - local249;
						@Pc(270) Class2_Sub15 local270;
						if (local237 >= Static93.anInt2437) {
							if (local254 >= Static93.anInt2432) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean136) {
									this.method1725(local270, true);
								}
							}
							if (local258 < Static93.anInt2433) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean136) {
									this.method1725(local270, true);
								}
							}
						}
						if (local241 < Static93.anInt2418) {
							if (local254 >= Static93.anInt2432) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean136) {
									this.method1725(local270, true);
								}
							}
							if (local258 < Static93.anInt2433) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean136) {
									this.method1725(local270, true);
								}
							}
						}
						if (Static93.anInt2427 == 0) {
							Static93.aBoolean109 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2431; local136 < this.anInt2421; local136++) {
			@Pc(361) Class2_Sub15[][] local361 = this.aClass2_Sub15ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static93.anInt2415 + local237;
				local249 = Static93.anInt2415 - local237;
				if (local241 >= Static93.anInt2437 || local249 < Static93.anInt2418) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static93.anInt2422 + local254;
						@Pc(389) int local389 = Static93.anInt2422 - local254;
						@Pc(401) Class2_Sub15 local401;
						if (local241 >= Static93.anInt2437) {
							if (local258 >= Static93.anInt2432) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean136) {
									this.method1725(local401, false);
								}
							}
							if (local389 < Static93.anInt2433) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean136) {
									this.method1725(local401, false);
								}
							}
						}
						if (local249 < Static93.anInt2418) {
							if (local258 >= Static93.anInt2432) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean136) {
									this.method1725(local401, false);
								}
							}
							if (local389 < Static93.anInt2433) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean136) {
									this.method1725(local401, false);
								}
							}
						}
						if (Static93.anInt2427 == 0) {
							Static93.aBoolean109 = false;
							return;
						}
					}
				}
			}
		}
		Static93.aBoolean109 = false;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(III)V")
	public void method1709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass58_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(III)I")
	public int method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass35_1 == null ? 0 : local8.aClass35_1.anInt1327;
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(III)Lclient!dc;")
	public Class17 method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass17_1;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(IIII)V")
	public void method1712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].anInt2981 = arg3;
		}
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(III)I")
	public int method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass58_1 == null ? 0 : local8.aClass58_1.anInt2339;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fd;III)V")
	private void method1714(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub15 local14;
		@Pc(29) Class2_Sub1_Sub4_Sub1 local29;
		if (arg2 < this.anInt2416) {
			local14 = this.aClass2_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub1) {
				local29 = (Class2_Sub1_Sub4_Sub1) local14.aClass58_1.aClass2_Sub1_Sub4_8;
				if (local29.aClass55Array1 != null) {
					this.method1721(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt2416) {
			local14 = this.aClass2_Sub15ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub1) {
				local29 = (Class2_Sub1_Sub4_Sub1) local14.aClass58_1.aClass2_Sub1_Sub4_8;
				if (local29.aClass55Array1 != null) {
					this.method1721(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt2416 && arg3 < this.anInt2438) {
			local14 = this.aClass2_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub1) {
				local29 = (Class2_Sub1_Sub4_Sub1) local14.aClass58_1.aClass2_Sub1_Sub4_8;
				if (local29.aClass55Array1 != null) {
					this.method1721(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt2416 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub15ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass58_1 != null && local14.aClass58_1.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub1) {
			local29 = (Class2_Sub1_Sub4_Sub1) local14.aClass58_1.aClass2_Sub1_Sub4_8;
			if (local29.aClass55Array1 != null) {
				this.method1721(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIILclient!db;ILclient!db;Lclient!db;)V")
	public void method1715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub4 arg6, @OriginalArg(7) Class2_Sub1_Sub4 arg7) {
		@Pc(3) Class39 local3 = new Class39();
		local3.aClass2_Sub1_Sub4_7 = arg4;
		local3.anInt1591 = arg1 * 128 + 64;
		local3.anInt1595 = arg2 * 128 + 64;
		local3.anInt1598 = arg3;
		local3.anInt1596 = arg5;
		local3.aClass2_Sub1_Sub4_5 = arg6;
		local3.aClass2_Sub1_Sub4_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub15 local43 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2979; local47++) {
				if ((local43.aClass6Array3[local47].anInt164 & 0x100) == 256 && local43.aClass6Array3[local47].aClass2_Sub1_Sub4_1 instanceof Class2_Sub1_Sub4_Sub1) {
					@Pc(71) Class2_Sub1_Sub4_Sub1 local71 = (Class2_Sub1_Sub4_Sub1) local43.aClass6Array3[local47].aClass2_Sub1_Sub4_1;
					local71.method662();
					if (local71.anInt2916 > local34) {
						local34 = local71.anInt2916;
					}
				}
			}
		}
		local3.anInt1594 = local34;
		if (this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub15(arg0, arg1, arg2);
		}
		this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass39_1 = local3;
	}

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "(III)Lclient!af;")
	public Class6 method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2979; local14++) {
			@Pc(20) Class6 local20 = local8.aClass6Array3[local14];
			if ((local20.anInt157 >> 29 & 0x3) == 2 && local20.anInt152 == arg1 && local20.anInt150 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "(III)Z")
	private boolean method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static93.anInt2419; local1++) {
			@Pc(6) Class66 local6 = Static93.aClass66Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2865 == 1) {
				local15 = local6.anInt2852 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2850 + (local6.anInt2867 * local15 >> 8);
					local37 = local6.anInt2861 + (local6.anInt2851 * local15 >> 8);
					local47 = local6.anInt2846 + (local6.anInt2863 * local15 >> 8);
					local57 = local6.anInt2847 + (local6.anInt2855 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2865 == 2) {
				local15 = arg0 - local6.anInt2852;
				if (local15 > 0) {
					local27 = local6.anInt2850 + (local6.anInt2867 * local15 >> 8);
					local37 = local6.anInt2861 + (local6.anInt2851 * local15 >> 8);
					local47 = local6.anInt2846 + (local6.anInt2863 * local15 >> 8);
					local57 = local6.anInt2847 + (local6.anInt2855 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2865 == 3) {
				local15 = local6.anInt2850 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2852 + (local6.anInt2848 * local15 >> 8);
					local37 = local6.anInt2845 + (local6.anInt2866 * local15 >> 8);
					local47 = local6.anInt2846 + (local6.anInt2863 * local15 >> 8);
					local57 = local6.anInt2847 + (local6.anInt2855 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2865 == 4) {
				local15 = arg2 - local6.anInt2850;
				if (local15 > 0) {
					local27 = local6.anInt2852 + (local6.anInt2848 * local15 >> 8);
					local37 = local6.anInt2845 + (local6.anInt2866 * local15 >> 8);
					local47 = local6.anInt2846 + (local6.anInt2863 * local15 >> 8);
					local57 = local6.anInt2847 + (local6.anInt2855 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2865 == 5) {
				local15 = arg1 - local6.anInt2846;
				if (local15 > 0) {
					local27 = local6.anInt2852 + (local6.anInt2848 * local15 >> 8);
					local37 = local6.anInt2845 + (local6.anInt2866 * local15 >> 8);
					local47 = local6.anInt2850 + (local6.anInt2867 * local15 >> 8);
					local57 = local6.anInt2861 + (local6.anInt2851 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)V")
	public void method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static93.aBoolean109 = true;
		Static93.anInt2439 = arg0;
		Static93.anInt2425 = arg1;
		Static93.anInt2420 = -1;
		Static93.anInt2435 = -1;
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "(III)V")
	public void method1720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2979; local13++) {
			@Pc(19) Class6 local19 = local8.aClass6Array3[local13];
			if ((local19.anInt157 >> 29 & 0x3) == 2 && local19.anInt152 == arg1 && local19.anInt150 == arg2) {
				this.method1730(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fd;Lclient!fd;IIIZ)V")
	private void method1721(@OriginalArg(0) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method654();
		this.anInt2447++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray74;
		@Pc(15) int local15 = arg1.anInt862;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt862; local17++) {
			@Pc(23) Class55 local23 = arg0.aClass55Array1[local17];
			@Pc(28) Class55 local28 = arg0.aClass55Array2[local17];
			if (local28.anInt2092 != 0) {
				@Pc(38) int local38 = arg0.anIntArray92[local17] - arg3;
				if (local38 <= arg1.anInt869) {
					@Pc(49) int local49 = arg0.anIntArray74[local17] - arg2;
					if (local49 >= arg1.anInt857 && local49 <= arg1.anInt861) {
						@Pc(65) int local65 = arg0.anIntArray82[local17] - arg4;
						if (local65 >= arg1.anInt858 && local65 <= arg1.anInt855) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class55 local82 = arg1.aClass55Array1[local76];
								@Pc(87) Class55 local87 = arg1.aClass55Array2[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray82[local76] && local38 == arg1.anIntArray92[local76] && local87.anInt2092 != 0) {
									local23.anInt2098 += local87.anInt2098;
									local23.anInt2094 += local87.anInt2094;
									local23.anInt2093 += local87.anInt2093;
									local23.anInt2092 += local87.anInt2092;
									local82.anInt2098 += local28.anInt2098;
									local82.anInt2094 += local28.anInt2094;
									local82.anInt2093 += local28.anInt2093;
									local82.anInt2092 += local28.anInt2092;
									local9++;
									this.anIntArray306[local17] = this.anInt2447;
									this.anIntArray308[local76] = this.anInt2447;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt859; local193++) {
			if (this.anIntArray306[arg0.anIntArray80[local193]] == this.anInt2447 && this.anIntArray306[arg0.anIntArray84[local193]] == this.anInt2447 && this.anIntArray306[arg0.anIntArray75[local193]] == this.anInt2447) {
				arg0.anIntArray86[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt859; local236++) {
			if (this.anIntArray308[arg1.anIntArray80[local236]] == this.anInt2447 && this.anIntArray308[arg1.anIntArray84[local236]] == this.anInt2447 && this.anIntArray308[arg1.anIntArray75[local236]] == this.anInt2447) {
				arg1.anIntArray86[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class63 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class63(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub15ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub15ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub15(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class63(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub15ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub15ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub15(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local12;
		} else {
			@Pc(140) Class20 local140 = new Class20(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub15ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub15ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub15(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2].aClass20_1 = local140;
		}
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(IIII)V")
	public void method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class17 local14 = local8.aClass17_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt493 = local23 + (local14.anInt493 - local23) * arg3 / 16;
			local14.anInt492 = local29 + (local14.anInt492 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!wa;Z)V")
	private void method1725(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		Static93.aClass8_7.method187(arg0);
		while (true) {
			@Pc(8) Class2_Sub15 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub15[][] local31;
			@Pc(49) Class2_Sub15 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class35 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class6 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class2_Sub15 var35;
										while (true) {
											do {
												local8 = (Class2_Sub15) Static93.aClass8_7.method189();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean138);
											local17 = local8.anInt2985;
											local20 = local8.anInt2993;
											local23 = local8.anInt2984;
											local26 = local8.anInt2988;
											local31 = this.aClass2_Sub15ArrayArrayArray1[local23];
											if (!local8.aBoolean136) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub15ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean138) {
														continue;
													}
												}
												if (local17 <= Static93.anInt2415 && local17 > Static93.anInt2437) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean138 && (local49.aBoolean136 || (local8.anInt2989 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static93.anInt2415 && local17 < Static93.anInt2418 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean138 && (local49.aBoolean136 || (local8.anInt2989 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static93.anInt2422 && local20 > Static93.anInt2432) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean138 && (local49.aBoolean136 || (local8.anInt2989 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static93.anInt2422 && local20 < Static93.anInt2433 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean138 && (local49.aBoolean136 || (local8.anInt2989 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean136 = false;
											if (local8.aClass2_Sub15_1 != null) {
												local49 = local8.aClass2_Sub15_1;
												if (local49.aClass63_1 == null) {
													if (local49.aClass20_1 != null && !this.method1732(0, local17, local20)) {
														this.method1694(local49.aClass20_1, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local17, local20);
													}
												} else if (!this.method1732(0, local17, local20)) {
													this.method1691(local49.aClass63_1, 0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local17, local20);
												}
												@Pc(225) Class35 local225 = local49.aClass35_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub4_4.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local225.anInt1323 - Static93.anInt2430, local225.anInt1333 - Static93.anInt2414, local225.anInt1325 - Static93.anInt2429, local225.anInt1327);
												}
												for (local251 = 0; local251 < local49.anInt2979; local251++) {
													var12 = local49.aClass6Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub4_1.method2029(var12.anInt158, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, var12.anInt167 - Static93.anInt2430, var12.anInt151 - Static93.anInt2414, var12.anInt155 - Static93.anInt2429, var12.anInt157);
													}
												}
											}
											var24 = false;
											if (local8.aClass63_1 == null) {
												if (local8.aClass20_1 != null && !this.method1732(local26, local17, local20)) {
													var24 = true;
													this.method1694(local8.aClass20_1, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local17, local20);
												}
											} else if (!this.method1732(local26, local17, local20)) {
												var24 = true;
												this.method1691(local8.aClass63_1, local26, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class35 local340 = local8.aClass35_1;
											@Pc(343) Class17 local343 = local8.aClass17_1;
											if (local340 != null || local343 != null) {
												if (Static93.anInt2415 == local17) {
													var23++;
												} else if (Static93.anInt2415 < local17) {
													var23 += 2;
												}
												if (Static93.anInt2422 == local20) {
													var23 += 3;
												} else if (Static93.anInt2422 > local20) {
													var23 += 6;
												}
												local251 = Static93.anIntArray304[var23];
												local8.anInt2978 = Static93.anIntArray305[var23];
											}
											if (local340 != null) {
												if ((local340.anInt1328 & Static93.anIntArray300[var23]) == 0) {
													local8.anInt2983 = 0;
												} else if (local340.anInt1328 == 16) {
													local8.anInt2983 = 3;
													local8.anInt2980 = Static93.anIntArray307[var23];
													local8.anInt2992 = 3 - local8.anInt2980;
												} else if (local340.anInt1328 == 32) {
													local8.anInt2983 = 6;
													local8.anInt2980 = Static93.anIntArray303[var23];
													local8.anInt2992 = 6 - local8.anInt2980;
												} else if (local340.anInt1328 == 64) {
													local8.anInt2983 = 12;
													local8.anInt2980 = Static93.anIntArray302[var23];
													local8.anInt2992 = 12 - local8.anInt2980;
												} else {
													local8.anInt2983 = 9;
													local8.anInt2980 = Static93.anIntArray301[var23];
													local8.anInt2992 = 9 - local8.anInt2980;
												}
												if ((local340.anInt1328 & local251) != 0 && !this.method1736(local26, local17, local20, local340.anInt1328)) {
													local340.aClass2_Sub1_Sub4_4.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local340.anInt1323 - Static93.anInt2430, local340.anInt1333 - Static93.anInt2414, local340.anInt1325 - Static93.anInt2429, local340.anInt1327);
												}
												if ((local340.anInt1335 & local251) != 0 && !this.method1736(local26, local17, local20, local340.anInt1335)) {
													local340.aClass2_Sub1_Sub4_3.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local340.anInt1323 - Static93.anInt2430, local340.anInt1333 - Static93.anInt2414, local340.anInt1325 - Static93.anInt2429, local340.anInt1327);
												}
											}
											if (local343 != null && !this.method1705(local26, local17, local20, local343.aClass2_Sub1_Sub4_2.anInt2916)) {
												if ((local343.anInt501 & local251) != 0) {
													local343.aClass2_Sub1_Sub4_2.method2029(local343.anInt490, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local343.anInt493 - Static93.anInt2430, local343.anInt497 - Static93.anInt2414, local343.anInt492 - Static93.anInt2429, local343.anInt496);
												} else if ((local343.anInt501 & 0x300) != 0) {
													local578 = local343.anInt493 - Static93.anInt2430;
													local583 = local343.anInt497 - Static93.anInt2414;
													local588 = local343.anInt492 - Static93.anInt2429;
													local591 = local343.anInt490;
													if (local591 == 1 || local591 == 2) {
														local600 = -local578;
													} else {
														local600 = local578;
													}
													if (local591 == 2 || local591 == 3) {
														var19 = -local588;
													} else {
														var19 = local588;
													}
													@Pc(629) int local629;
													@Pc(635) int local635;
													if ((local343.anInt501 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static93.anIntArray297[local591];
														local635 = local588 + Static93.anIntArray295[local591];
														local343.aClass2_Sub1_Sub4_2.method2029(local591 * 512 + 256, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local629, local583, local635, local343.anInt496);
													}
													if ((local343.anInt501 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static93.anIntArray299[local591];
														local635 = local588 + Static93.anIntArray298[local591];
														local343.aClass2_Sub1_Sub4_2.method2029(local591 * 512 + 1280 & 0x7FF, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local629, local583, local635, local343.anInt496);
													}
												}
											}
											if (var24) {
												@Pc(696) Class58 local696 = local8.aClass58_1;
												if (local696 != null) {
													local696.aClass2_Sub1_Sub4_8.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local696.anInt2346 - Static93.anInt2430, local696.anInt2340 - Static93.anInt2414, local696.anInt2344 - Static93.anInt2429, local696.anInt2339);
												}
												@Pc(723) Class39 local723 = local8.aClass39_1;
												if (local723 != null && local723.anInt1594 == 0) {
													if (local723.aClass2_Sub1_Sub4_5 != null) {
														local723.aClass2_Sub1_Sub4_5.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local723.anInt1591 - Static93.anInt2430, local723.anInt1598 - Static93.anInt2414, local723.anInt1595 - Static93.anInt2429, local723.anInt1596);
													}
													if (local723.aClass2_Sub1_Sub4_6 != null) {
														local723.aClass2_Sub1_Sub4_6.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local723.anInt1591 - Static93.anInt2430, local723.anInt1598 - Static93.anInt2414, local723.anInt1595 - Static93.anInt2429, local723.anInt1596);
													}
													if (local723.aClass2_Sub1_Sub4_7 != null) {
														local723.aClass2_Sub1_Sub4_7.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local723.anInt1591 - Static93.anInt2430, local723.anInt1598 - Static93.anInt2414, local723.anInt1595 - Static93.anInt2429, local723.anInt1596);
													}
												}
											}
											local578 = local8.anInt2989;
											if (local578 != 0) {
												if (local17 < Static93.anInt2415 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean138) {
														Static93.aClass8_7.method187(var35);
													}
												}
												if (local20 < Static93.anInt2422 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean138) {
														Static93.aClass8_7.method187(var35);
													}
												}
												if (local17 > Static93.anInt2415 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean138) {
														Static93.aClass8_7.method187(var35);
													}
												}
												if (local20 > Static93.anInt2422 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean138) {
														Static93.aClass8_7.method187(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2983 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2979; var23++) {
												if (local8.aClass6Array3[var23].anInt160 != Static93.anInt2428 && (local8.anIntArray352[var23] & local8.anInt2983) == local8.anInt2980) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass35_1;
												if (!this.method1736(local26, local17, local20, local942.anInt1328)) {
													local942.aClass2_Sub1_Sub4_4.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local942.anInt1323 - Static93.anInt2430, local942.anInt1333 - Static93.anInt2414, local942.anInt1325 - Static93.anInt2429, local942.anInt1327);
												}
												local8.anInt2983 = 0;
											}
										}
										if (!local8.aBoolean137) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt2979;
											local8.aBoolean137 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass6Array3[local251];
												if (var12.anInt160 != Static93.anInt2428) {
													for (local1001 = var12.anInt152; local1001 <= var12.anInt165; local1001++) {
														for (local578 = var12.anInt150; local578 <= var12.anInt161; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean136) {
																local8.aBoolean137 = true;
																continue label559;
															}
															if (var35.anInt2983 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt152) {
																	local588++;
																}
																if (local1001 < var12.anInt165) {
																	local588 += 4;
																}
																if (local578 > var12.anInt150) {
																	local588 += 8;
																}
																if (local578 < var12.anInt161) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt2983) == local8.anInt2992) {
																	local8.aBoolean137 = true;
																	continue label559;
																}
															}
														}
													}
													Static93.aClass6Array1[var23++] = var12;
													local578 = Static93.anInt2415 - var12.anInt152;
													local583 = var12.anInt165 - Static93.anInt2415;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static93.anInt2422 - var12.anInt150;
													local591 = var12.anInt161 - Static93.anInt2422;
													if (local591 > local588) {
														var12.anInt148 = local578 + local591;
													} else {
														var12.anInt148 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class6 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static93.aClass6Array1[local578];
													if (local1125.anInt160 != Static93.anInt2428) {
														if (local1125.anInt148 > local1116) {
															local1116 = local1125.anInt148;
															local1001 = local578;
														} else if (local1125.anInt148 == local1116) {
															local588 = local1125.anInt167 - Static93.anInt2430;
															local591 = local1125.anInt155 - Static93.anInt2429;
															local600 = Static93.aClass6Array1[local1001].anInt167 - Static93.anInt2430;
															var19 = Static93.aClass6Array1[local1001].anInt155 - Static93.anInt2429;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static93.aClass6Array1[local1001];
												local1125.anInt160 = Static93.anInt2428;
												if (!this.method1690(local26, local1125.anInt152, local1125.anInt165, local1125.anInt150, local1125.anInt161, local1125.aClass2_Sub1_Sub4_1.anInt2916)) {
													local1125.aClass2_Sub1_Sub4_1.method2029(local1125.anInt158, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local1125.anInt167 - Static93.anInt2430, local1125.anInt151 - Static93.anInt2414, local1125.anInt155 - Static93.anInt2429, local1125.anInt157);
												}
												for (local588 = local1125.anInt152; local588 <= local1125.anInt165; local588++) {
													for (local591 = local1125.anInt150; local591 <= local1125.anInt161; local591++) {
														@Pc(1250) Class2_Sub15 local1250 = local31[local588][local591];
														if (local1250.anInt2983 != 0) {
															Static93.aClass8_7.method187(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean138) {
															Static93.aClass8_7.method187(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean137) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean137 = false;
											break;
										}
									}
								} while (!local8.aBoolean138);
							} while (local8.anInt2983 != 0);
							if (local17 > Static93.anInt2415 || local17 <= Static93.anInt2437) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean138);
						if (local17 < Static93.anInt2415 || local17 >= Static93.anInt2418 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean138);
					if (local20 > Static93.anInt2422 || local20 <= Static93.anInt2432) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean138);
				if (local20 < Static93.anInt2422 || local20 >= Static93.anInt2433 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean138);
			local8.aBoolean138 = false;
			Static93.anInt2427--;
			@Pc(1392) Class39 local1392 = local8.aClass39_1;
			if (local1392 != null && local1392.anInt1594 != 0) {
				if (local1392.aClass2_Sub1_Sub4_5 != null) {
					local1392.aClass2_Sub1_Sub4_5.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local1392.anInt1591 - Static93.anInt2430, local1392.anInt1598 - Static93.anInt2414 - local1392.anInt1594, local1392.anInt1595 - Static93.anInt2429, local1392.anInt1596);
				}
				if (local1392.aClass2_Sub1_Sub4_6 != null) {
					local1392.aClass2_Sub1_Sub4_6.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local1392.anInt1591 - Static93.anInt2430, local1392.anInt1598 - Static93.anInt2414 - local1392.anInt1594, local1392.anInt1595 - Static93.anInt2429, local1392.anInt1596);
				}
				if (local1392.aClass2_Sub1_Sub4_7 != null) {
					local1392.aClass2_Sub1_Sub4_7.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local1392.anInt1591 - Static93.anInt2430, local1392.anInt1598 - Static93.anInt2414 - local1392.anInt1594, local1392.anInt1595 - Static93.anInt2429, local1392.anInt1596);
				}
			}
			if (local8.anInt2978 != 0) {
				@Pc(1487) Class17 local1487 = local8.aClass17_1;
				if (local1487 != null && !this.method1705(local26, local17, local20, local1487.aClass2_Sub1_Sub4_2.anInt2916)) {
					if ((local1487.anInt501 & local8.anInt2978) != 0) {
						local1487.aClass2_Sub1_Sub4_2.method2029(local1487.anInt490, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local1487.anInt493 - Static93.anInt2430, local1487.anInt497 - Static93.anInt2414, local1487.anInt492 - Static93.anInt2429, local1487.anInt496);
					} else if ((local1487.anInt501 & 0x300) != 0) {
						local251 = local1487.anInt493 - Static93.anInt2430;
						local1116 = local1487.anInt497 - Static93.anInt2414;
						local1001 = local1487.anInt492 - Static93.anInt2429;
						local578 = local1487.anInt490;
						if (local578 == 1 || local578 == 2) {
							local583 = -local251;
						} else {
							local583 = local251;
						}
						if (local578 == 2 || local578 == 3) {
							local588 = -local1001;
						} else {
							local588 = local1001;
						}
						if ((local1487.anInt501 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static93.anIntArray297[local578];
							local600 = local1001 + Static93.anIntArray295[local578];
							local1487.aClass2_Sub1_Sub4_2.method2029(local578 * 512 + 256, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local591, local1116, local600, local1487.anInt496);
						}
						if ((local1487.anInt501 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static93.anIntArray299[local578];
							local600 = local1001 + Static93.anIntArray298[local578];
							local1487.aClass2_Sub1_Sub4_2.method2029(local578 * 512 + 1280 & 0x7FF, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local591, local1116, local600, local1487.anInt496);
						}
					}
				}
				local942 = local8.aClass35_1;
				if (local942 != null) {
					if ((local942.anInt1335 & local8.anInt2978) != 0 && !this.method1736(local26, local17, local20, local942.anInt1335)) {
						local942.aClass2_Sub1_Sub4_3.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local942.anInt1323 - Static93.anInt2430, local942.anInt1333 - Static93.anInt2414, local942.anInt1325 - Static93.anInt2429, local942.anInt1327);
					}
					if ((local942.anInt1328 & local8.anInt2978) != 0 && !this.method1736(local26, local17, local20, local942.anInt1328)) {
						local942.aClass2_Sub1_Sub4_4.method2029(0, Static93.anInt2434, Static93.anInt2423, Static93.anInt2440, Static93.anInt2424, local942.anInt1323 - Static93.anInt2430, local942.anInt1333 - Static93.anInt2414, local942.anInt1325 - Static93.anInt2429, local942.anInt1327);
					}
				}
			}
			@Pc(1745) Class2_Sub15 local1745;
			if (local23 < this.anInt2421 - 1) {
				local1745 = this.aClass2_Sub15ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean138) {
					Static93.aClass8_7.method187(local1745);
				}
			}
			if (local17 < Static93.anInt2415) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean138) {
					Static93.aClass8_7.method187(local1745);
				}
			}
			if (local20 < Static93.anInt2422) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean138) {
					Static93.aClass8_7.method187(local1745);
				}
			}
			if (local17 > Static93.anInt2415) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean138) {
					Static93.aClass8_7.method187(local1745);
				}
			}
			if (local20 > Static93.anInt2422) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean138) {
					Static93.aClass8_7.method187(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIILclient!db;IIIIII)Z")
	public boolean method1726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1696(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
	public void method1727() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2417; local1++) {
			@Pc(7) Class6 local7 = this.aClass6Array2[local1];
			this.method1730(local7);
			this.aClass6Array2[local1] = null;
		}
		this.anInt2417 = 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIIII)V")
	public void method1728(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class63 local14 = local8.aClass63_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2624;
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
		@Pc(59) Class20 local59 = local8.aClass20_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt874;
		@Pc(68) int local68 = local59.anInt873;
		@Pc(71) int local71 = local59.anInt872;
		@Pc(74) int local74 = local59.anInt871;
		@Pc(79) int[] local79 = this.anIntArrayArray27[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray26[local68];
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

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)V")
	public void method1729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub15 local31 = this.aClass2_Sub15ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub15ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2984--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2979; local41++) {
					@Pc(47) Class6 local47 = local31.aClass6Array3[local41];
					if ((local47.anInt157 >> 29 & 0x3) == 2 && local47.anInt152 == arg0 && local47.anInt150 == arg1) {
						local47.anInt166--;
					}
				}
			}
		}
		if (this.aClass2_Sub15ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub15ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub15(0, arg0, arg1);
		}
		this.aClass2_Sub15ArrayArrayArray1[0][arg0][arg1].aClass2_Sub15_1 = local8;
		this.aClass2_Sub15ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!af;)V")
	private void method1730(@OriginalArg(0) Class6 arg0) {
		for (@Pc(2) int local2 = arg0.anInt152; local2 <= arg0.anInt165; local2++) {
			for (@Pc(6) int local6 = arg0.anInt150; local6 <= arg0.anInt161; local6++) {
				@Pc(17) Class2_Sub15 local17 = this.aClass2_Sub15ArrayArrayArray1[arg0.anInt166][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2979; local21++) {
						if (local17.aClass6Array3[local21] == arg0) {
							local17.anInt2979--;
							for (local36 = local21; local36 < local17.anInt2979; local36++) {
								local17.aClass6Array3[local36] = local17.aClass6Array3[local36 + 1];
								local17.anIntArray352[local36] = local17.anIntArray352[local36 + 1];
							}
							local17.aClass6Array3[local17.anInt2979] = null;
							break;
						}
					}
					local17.anInt2989 = 0;
					for (local36 = 0; local36 < local17.anInt2979; local36++) {
						local17.anInt2989 |= local17.anIntArray352[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIILclient!db;III)Z")
	public boolean method1731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1696(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "(III)Z")
	private boolean method1732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray8[arg0][arg1][arg2];
		if (local8 == -Static93.anInt2428) {
			return false;
		} else if (local8 == Static93.anInt2428) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1717(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2], local27 + 1) && this.method1717(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local27 + 1) && this.method1717(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1717(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = Static93.anInt2428;
				return true;
			} else {
				this.anIntArrayArrayArray8[arg0][arg1][arg2] = -Static93.anInt2428;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "(III)Lclient!rc;")
	public Class58 method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass58_1 == null ? null : local8.aClass58_1;
	}

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "(III)V")
	public void method1734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass39_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "(III)Lclient!k;")
	public Class35 method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass35_1;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(IIII)Z")
	private boolean method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1732(arg0, arg1, arg2)) {
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
				if (local11 > Static93.anInt2430) {
					if (!this.method1717(local11, local26, local15)) {
						return false;
					}
					if (!this.method1717(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1717(local11, local30, local15)) {
						return false;
					}
					if (!this.method1717(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1717(local11, local34, local15)) {
					return false;
				}
				if (!this.method1717(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static93.anInt2429) {
					if (!this.method1717(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1717(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1717(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1717(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1717(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1717(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static93.anInt2430) {
					if (!this.method1717(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1717(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1717(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1717(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1717(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1717(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static93.anInt2429) {
					if (!this.method1717(local11, local26, local15)) {
						return false;
					}
					if (!this.method1717(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1717(local11, local30, local15)) {
						return false;
					}
					if (!this.method1717(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1717(local11, local34, local15)) {
					return false;
				}
				if (!this.method1717(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1717(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1717(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1717(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1717(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1717(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "(III)I")
	public int method1737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass17_1 == null ? 0 : local8.aClass17_1.anInt496;
	}

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "(III)V")
	public void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub15 local8 = this.aClass2_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass35_1 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public void method1739(@OriginalArg(0) int arg0) {
		this.anInt2431 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2416; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2438; local7++) {
				if (this.aClass2_Sub15ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub15ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub15(arg0, local4, local7);
				}
			}
		}
	}
}
