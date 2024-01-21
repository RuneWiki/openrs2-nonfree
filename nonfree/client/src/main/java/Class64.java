import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class64 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	private int anInt2804 = 0;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "[Lclient!bd;")
	private final Class8[] aClass8Array3 = new Class8[5000];

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	private int anInt2816 = 0;

	@OriginalMember(owner = "client!wd", name = "O", descriptor = "[I")
	private final int[] anIntArray397 = new int[10000];

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray71 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!wd", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray70 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "[I")
	private final int[] anIntArray398 = new int[10000];

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
	private int anInt2824 = 0;

	@OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
	private final int anInt2808;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	private final int anInt2814;

	@OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
	private final int anInt2822;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[[[Lclient!ce;")
	private final Class2_Sub4[][][] aClass2_Sub4ArrayArrayArray1;

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(III[[[I)V")
	public Class64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2808 = arg0;
		this.anInt2814 = arg1;
		this.anInt2822 = arg2;
		this.aClass2_Sub4ArrayArrayArray1 = new Class2_Sub4[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method1782();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!l;IIIIIII)V")
	private void method1754(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static107.anInt2819;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static107.anInt2820;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static107.anInt2813;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static107.anInt2813;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static107.anInt2813;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static107.anInt2813;
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
		@Pc(279) int local279 = Static97.anInt2641 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static97.anInt2645 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static97.anInt2641 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static97.anInt2645 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static97.anInt2641 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static97.anInt2645 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static97.anInt2641 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static97.anInt2645 + (local89 << 9) / local265;
		Static97.anInt2644 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static97.aBoolean137 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static97.anInt2638 || local327 > Static97.anInt2638 || local295 > Static97.anInt2638) {
				Static97.aBoolean137 = true;
			}
			if (Static107.aBoolean157 && this.method1764(Static107.anInt2807, Static107.anInt2802, local319, local335, local303, local311, local327, local295)) {
				Static107.anInt2823 = arg6;
				Static107.anInt2812 = arg7;
			}
			if (arg0.anInt1788 == -1) {
				if (arg0.anInt1789 != 12345678) {
					Static97.method1652(local319, local335, local303, local311, local327, local295, arg0.anInt1789, arg0.anInt1787, arg0.anInt1790);
				}
			} else if (Static107.aBoolean156) {
				local472 = Static97.anInterface1_1.method1419(arg0.anInt1788);
				Static97.method1652(local319, local335, local303, local311, local327, local295, Static107.method1789(local472, arg0.anInt1789), Static107.method1789(local472, arg0.anInt1787), Static107.method1789(local472, arg0.anInt1790));
			} else if (arg0.aBoolean91) {
				Static97.method1659(local319, local335, local303, local311, local327, local295, arg0.anInt1789, arg0.anInt1787, arg0.anInt1790, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1788);
			} else {
				Static97.method1659(local319, local335, local303, local311, local327, local295, arg0.anInt1789, arg0.anInt1787, arg0.anInt1790, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1788);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static97.aBoolean137 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static97.anInt2638 || local295 > Static97.anInt2638 || local327 > Static97.anInt2638) {
			Static97.aBoolean137 = true;
		}
		if (Static107.aBoolean157 && this.method1764(Static107.anInt2807, Static107.anInt2802, local287, local303, local335, local279, local295, local327)) {
			Static107.anInt2823 = arg6;
			Static107.anInt2812 = arg7;
		}
		if (arg0.anInt1788 != -1) {
			if (!Static107.aBoolean156) {
				Static97.method1659(local287, local303, local335, local279, local295, local327, arg0.anInt1786, arg0.anInt1790, arg0.anInt1787, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1788);
				return;
			}
			local472 = Static97.anInterface1_1.method1419(arg0.anInt1788);
			Static97.method1652(local287, local303, local335, local279, local295, local327, Static107.method1789(local472, arg0.anInt1786), Static107.method1789(local472, arg0.anInt1790), Static107.method1789(local472, arg0.anInt1787));
		} else if (arg0.anInt1786 != 12345678) {
			Static97.method1652(local287, local303, local335, local279, local295, local327, arg0.anInt1786, arg0.anInt1790, arg0.anInt1787);
			return;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
	public int method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass53_1 == null ? 0 : local8.aClass53_1.anInt2342;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)Lclient!rc;")
	public Class53 method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass53_1;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(III)I")
	public int method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass57_1 == null ? 0 : local8.aClass57_1.anInt2532;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(III)Lclient!tb;")
	public Class57 method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass57_1;
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(III)V")
	public void method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt569; local13++) {
			@Pc(19) Class8 local19 = local8.aClass8Array1[local13];
			if ((local19.anInt308 >> 29 & 0x3) == 2 && local19.anInt306 == arg1 && local19.anInt318 == arg2) {
				this.method1797(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIILclient!ea;IIIIII)Z")
	public boolean method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1799(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public void method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub4 local31 = this.aClass2_Sub4ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub4ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt568--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt569; local41++) {
					@Pc(47) Class8 local47 = local31.aClass8Array1[local41];
					if ((local47.anInt308 >> 29 & 0x3) == 2 && local47.anInt306 == arg0 && local47.anInt318 == arg1) {
						local47.anInt316--;
					}
				}
			}
		}
		if (this.aClass2_Sub4ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub4ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub4(0, arg0, arg1);
		}
		this.aClass2_Sub4ArrayArrayArray1[0][arg0][arg1].aClass2_Sub4_1 = local8;
		this.aClass2_Sub4ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ce;Z)V")
	private void method1765(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		Static107.aClass36_8.method1362(arg0);
		while (true) {
			@Pc(8) Class2_Sub4 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub4[][] local31;
			@Pc(49) Class2_Sub4 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class57 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class8 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class2_Sub4 var35;
										while (true) {
											do {
												local8 = (Class2_Sub4) Static107.aClass36_8.method1358();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean38);
											local17 = local8.anInt560;
											local20 = local8.anInt563;
											local23 = local8.anInt568;
											local26 = local8.anInt557;
											local31 = this.aClass2_Sub4ArrayArrayArray1[local23];
											if (!local8.aBoolean37) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub4ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean38) {
														continue;
													}
												}
												if (local17 <= Static107.anInt2798 && local17 > Static107.anInt2818) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean38 && (local49.aBoolean37 || (local8.anInt565 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static107.anInt2798 && local17 < Static107.anInt2805 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean38 && (local49.aBoolean37 || (local8.anInt565 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static107.anInt2803 && local20 > Static107.anInt2815) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean38 && (local49.aBoolean37 || (local8.anInt565 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static107.anInt2803 && local20 < Static107.anInt2806 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean38 && (local49.aBoolean37 || (local8.anInt565 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean37 = false;
											if (local8.aClass2_Sub4_1 != null) {
												local49 = local8.aClass2_Sub4_1;
												if (local49.aClass29_1 == null) {
													if (local49.aClass16_1 != null && !this.method1766(0, local17, local20)) {
														this.method1787(local49.aClass16_1, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local17, local20);
													}
												} else if (!this.method1766(0, local17, local20)) {
													this.method1754(local49.aClass29_1, 0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local17, local20);
												}
												@Pc(225) Class57 local225 = local49.aClass57_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub4_7.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local225.anInt2531 - Static107.anInt2819, local225.anInt2525 - Static107.anInt2813, local225.anInt2528 - Static107.anInt2820, local225.anInt2532);
												}
												for (local251 = 0; local251 < local49.anInt569; local251++) {
													var12 = local49.aClass8Array1[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub4_1.method1265(var12.anInt310, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, var12.anInt313 - Static107.anInt2819, var12.anInt315 - Static107.anInt2813, var12.anInt322 - Static107.anInt2820, var12.anInt308);
													}
												}
											}
											var24 = false;
											if (local8.aClass29_1 == null) {
												if (local8.aClass16_1 != null && !this.method1766(local26, local17, local20)) {
													var24 = true;
													this.method1787(local8.aClass16_1, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local17, local20);
												}
											} else if (!this.method1766(local26, local17, local20)) {
												var24 = true;
												this.method1754(local8.aClass29_1, local26, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class57 local340 = local8.aClass57_1;
											@Pc(343) Class53 local343 = local8.aClass53_1;
											if (local340 != null || local343 != null) {
												if (Static107.anInt2798 == local17) {
													var23++;
												} else if (Static107.anInt2798 < local17) {
													var23 += 2;
												}
												if (Static107.anInt2803 == local20) {
													var23 += 3;
												} else if (Static107.anInt2803 > local20) {
													var23 += 6;
												}
												local251 = Static107.anIntArray400[var23];
												local8.anInt559 = Static107.anIntArray403[var23];
											}
											if (local340 != null) {
												if ((local340.anInt2530 & Static107.anIntArray401[var23]) == 0) {
													local8.anInt555 = 0;
												} else if (local340.anInt2530 == 16) {
													local8.anInt555 = 3;
													local8.anInt564 = Static107.anIntArray399[var23];
													local8.anInt566 = 3 - local8.anInt564;
												} else if (local340.anInt2530 == 32) {
													local8.anInt555 = 6;
													local8.anInt564 = Static107.anIntArray405[var23];
													local8.anInt566 = 6 - local8.anInt564;
												} else if (local340.anInt2530 == 64) {
													local8.anInt555 = 12;
													local8.anInt564 = Static107.anIntArray404[var23];
													local8.anInt566 = 12 - local8.anInt564;
												} else {
													local8.anInt555 = 9;
													local8.anInt564 = Static107.anIntArray402[var23];
													local8.anInt566 = 9 - local8.anInt564;
												}
												if ((local340.anInt2530 & local251) != 0 && !this.method1771(local26, local17, local20, local340.anInt2530)) {
													local340.aClass2_Sub1_Sub4_7.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local340.anInt2531 - Static107.anInt2819, local340.anInt2525 - Static107.anInt2813, local340.anInt2528 - Static107.anInt2820, local340.anInt2532);
												}
												if ((local340.anInt2527 & local251) != 0 && !this.method1771(local26, local17, local20, local340.anInt2527)) {
													local340.aClass2_Sub1_Sub4_8.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local340.anInt2531 - Static107.anInt2819, local340.anInt2525 - Static107.anInt2813, local340.anInt2528 - Static107.anInt2820, local340.anInt2532);
												}
											}
											if (local343 != null && !this.method1803(local26, local17, local20, local343.aClass2_Sub1_Sub4_6.anInt1974)) {
												if ((local343.anInt2345 & local251) != 0) {
													local343.aClass2_Sub1_Sub4_6.method1265(local343.anInt2337, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local343.anInt2336 - Static107.anInt2819, local343.anInt2338 - Static107.anInt2813, local343.anInt2340 - Static107.anInt2820, local343.anInt2342);
												} else if ((local343.anInt2345 & 0x300) != 0) {
													local578 = local343.anInt2336 - Static107.anInt2819;
													local583 = local343.anInt2338 - Static107.anInt2813;
													local588 = local343.anInt2340 - Static107.anInt2820;
													local591 = local343.anInt2337;
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
													if ((local343.anInt2345 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static107.anIntArray393[local591];
														local635 = local588 + Static107.anIntArray392[local591];
														local343.aClass2_Sub1_Sub4_6.method1265(local591 * 512 + 256, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local629, local583, local635, local343.anInt2342);
													}
													if ((local343.anInt2345 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static107.anIntArray394[local591];
														local635 = local588 + Static107.anIntArray396[local591];
														local343.aClass2_Sub1_Sub4_6.method1265(local591 * 512 + 1280 & 0x7FF, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local629, local583, local635, local343.anInt2342);
													}
												}
											}
											if (var24) {
												@Pc(696) Class13 local696 = local8.aClass13_1;
												if (local696 != null) {
													local696.aClass2_Sub1_Sub4_2.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local696.anInt657 - Static107.anInt2819, local696.anInt648 - Static107.anInt2813, local696.anInt653 - Static107.anInt2820, local696.anInt647);
												}
												@Pc(723) Class32 local723 = local8.aClass32_1;
												if (local723 != null && local723.anInt2056 == 0) {
													if (local723.aClass2_Sub1_Sub4_5 != null) {
														local723.aClass2_Sub1_Sub4_5.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local723.anInt2055 - Static107.anInt2819, local723.anInt2061 - Static107.anInt2813, local723.anInt2059 - Static107.anInt2820, local723.anInt2057);
													}
													if (local723.aClass2_Sub1_Sub4_4 != null) {
														local723.aClass2_Sub1_Sub4_4.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local723.anInt2055 - Static107.anInt2819, local723.anInt2061 - Static107.anInt2813, local723.anInt2059 - Static107.anInt2820, local723.anInt2057);
													}
													if (local723.aClass2_Sub1_Sub4_3 != null) {
														local723.aClass2_Sub1_Sub4_3.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local723.anInt2055 - Static107.anInt2819, local723.anInt2061 - Static107.anInt2813, local723.anInt2059 - Static107.anInt2820, local723.anInt2057);
													}
												}
											}
											local578 = local8.anInt565;
											if (local578 != 0) {
												if (local17 < Static107.anInt2798 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean38) {
														Static107.aClass36_8.method1362(var35);
													}
												}
												if (local20 < Static107.anInt2803 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean38) {
														Static107.aClass36_8.method1362(var35);
													}
												}
												if (local17 > Static107.anInt2798 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean38) {
														Static107.aClass36_8.method1362(var35);
													}
												}
												if (local20 > Static107.anInt2803 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean38) {
														Static107.aClass36_8.method1362(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt555 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt569; var23++) {
												if (local8.aClass8Array1[var23].anInt307 != Static107.anInt2800 && (local8.anIntArray80[var23] & local8.anInt555) == local8.anInt564) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass57_1;
												if (!this.method1771(local26, local17, local20, local942.anInt2530)) {
													local942.aClass2_Sub1_Sub4_7.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local942.anInt2531 - Static107.anInt2819, local942.anInt2525 - Static107.anInt2813, local942.anInt2528 - Static107.anInt2820, local942.anInt2532);
												}
												local8.anInt555 = 0;
											}
										}
										if (!local8.aBoolean40) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt569;
											local8.aBoolean40 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass8Array1[local251];
												if (var12.anInt307 != Static107.anInt2800) {
													for (local1001 = var12.anInt306; local1001 <= var12.anInt311; local1001++) {
														for (local578 = var12.anInt318; local578 <= var12.anInt317; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean37) {
																local8.aBoolean40 = true;
																continue label559;
															}
															if (var35.anInt555 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt306) {
																	local588++;
																}
																if (local1001 < var12.anInt311) {
																	local588 += 4;
																}
																if (local578 > var12.anInt318) {
																	local588 += 8;
																}
																if (local578 < var12.anInt317) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt555) == local8.anInt566) {
																	local8.aBoolean40 = true;
																	continue label559;
																}
															}
														}
													}
													Static107.aClass8Array2[var23++] = var12;
													local578 = Static107.anInt2798 - var12.anInt306;
													local583 = var12.anInt311 - Static107.anInt2798;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static107.anInt2803 - var12.anInt318;
													local591 = var12.anInt317 - Static107.anInt2803;
													if (local591 > local588) {
														var12.anInt314 = local578 + local591;
													} else {
														var12.anInt314 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class8 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static107.aClass8Array2[local578];
													if (local1125.anInt307 != Static107.anInt2800) {
														if (local1125.anInt314 > local1116) {
															local1116 = local1125.anInt314;
															local1001 = local578;
														} else if (local1125.anInt314 == local1116) {
															local588 = local1125.anInt313 - Static107.anInt2819;
															local591 = local1125.anInt322 - Static107.anInt2820;
															local600 = Static107.aClass8Array2[local1001].anInt313 - Static107.anInt2819;
															var19 = Static107.aClass8Array2[local1001].anInt322 - Static107.anInt2820;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static107.aClass8Array2[local1001];
												local1125.anInt307 = Static107.anInt2800;
												if (!this.method1788(local26, local1125.anInt306, local1125.anInt311, local1125.anInt318, local1125.anInt317, local1125.aClass2_Sub1_Sub4_1.anInt1974)) {
													local1125.aClass2_Sub1_Sub4_1.method1265(local1125.anInt310, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local1125.anInt313 - Static107.anInt2819, local1125.anInt315 - Static107.anInt2813, local1125.anInt322 - Static107.anInt2820, local1125.anInt308);
												}
												for (local588 = local1125.anInt306; local588 <= local1125.anInt311; local588++) {
													for (local591 = local1125.anInt318; local591 <= local1125.anInt317; local591++) {
														@Pc(1250) Class2_Sub4 local1250 = local31[local588][local591];
														if (local1250.anInt555 != 0) {
															Static107.aClass36_8.method1362(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean38) {
															Static107.aClass36_8.method1362(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean40) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean40 = false;
											break;
										}
									}
								} while (!local8.aBoolean38);
							} while (local8.anInt555 != 0);
							if (local17 > Static107.anInt2798 || local17 <= Static107.anInt2818) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean38);
						if (local17 < Static107.anInt2798 || local17 >= Static107.anInt2805 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean38);
					if (local20 > Static107.anInt2803 || local20 <= Static107.anInt2815) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean38);
				if (local20 < Static107.anInt2803 || local20 >= Static107.anInt2806 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean38);
			local8.aBoolean38 = false;
			Static107.anInt2821--;
			@Pc(1392) Class32 local1392 = local8.aClass32_1;
			if (local1392 != null && local1392.anInt2056 != 0) {
				if (local1392.aClass2_Sub1_Sub4_5 != null) {
					local1392.aClass2_Sub1_Sub4_5.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local1392.anInt2055 - Static107.anInt2819, local1392.anInt2061 - Static107.anInt2813 - local1392.anInt2056, local1392.anInt2059 - Static107.anInt2820, local1392.anInt2057);
				}
				if (local1392.aClass2_Sub1_Sub4_4 != null) {
					local1392.aClass2_Sub1_Sub4_4.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local1392.anInt2055 - Static107.anInt2819, local1392.anInt2061 - Static107.anInt2813 - local1392.anInt2056, local1392.anInt2059 - Static107.anInt2820, local1392.anInt2057);
				}
				if (local1392.aClass2_Sub1_Sub4_3 != null) {
					local1392.aClass2_Sub1_Sub4_3.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local1392.anInt2055 - Static107.anInt2819, local1392.anInt2061 - Static107.anInt2813 - local1392.anInt2056, local1392.anInt2059 - Static107.anInt2820, local1392.anInt2057);
				}
			}
			if (local8.anInt559 != 0) {
				@Pc(1487) Class53 local1487 = local8.aClass53_1;
				if (local1487 != null && !this.method1803(local26, local17, local20, local1487.aClass2_Sub1_Sub4_6.anInt1974)) {
					if ((local1487.anInt2345 & local8.anInt559) != 0) {
						local1487.aClass2_Sub1_Sub4_6.method1265(local1487.anInt2337, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local1487.anInt2336 - Static107.anInt2819, local1487.anInt2338 - Static107.anInt2813, local1487.anInt2340 - Static107.anInt2820, local1487.anInt2342);
					} else if ((local1487.anInt2345 & 0x300) != 0) {
						local251 = local1487.anInt2336 - Static107.anInt2819;
						local1116 = local1487.anInt2338 - Static107.anInt2813;
						local1001 = local1487.anInt2340 - Static107.anInt2820;
						local578 = local1487.anInt2337;
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
						if ((local1487.anInt2345 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static107.anIntArray393[local578];
							local600 = local1001 + Static107.anIntArray392[local578];
							local1487.aClass2_Sub1_Sub4_6.method1265(local578 * 512 + 256, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local591, local1116, local600, local1487.anInt2342);
						}
						if ((local1487.anInt2345 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static107.anIntArray394[local578];
							local600 = local1001 + Static107.anIntArray396[local578];
							local1487.aClass2_Sub1_Sub4_6.method1265(local578 * 512 + 1280 & 0x7FF, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local591, local1116, local600, local1487.anInt2342);
						}
					}
				}
				local942 = local8.aClass57_1;
				if (local942 != null) {
					if ((local942.anInt2527 & local8.anInt559) != 0 && !this.method1771(local26, local17, local20, local942.anInt2527)) {
						local942.aClass2_Sub1_Sub4_8.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local942.anInt2531 - Static107.anInt2819, local942.anInt2525 - Static107.anInt2813, local942.anInt2528 - Static107.anInt2820, local942.anInt2532);
					}
					if ((local942.anInt2530 & local8.anInt559) != 0 && !this.method1771(local26, local17, local20, local942.anInt2530)) {
						local942.aClass2_Sub1_Sub4_7.method1265(0, Static107.anInt2799, Static107.anInt2801, Static107.anInt2809, Static107.anInt2811, local942.anInt2531 - Static107.anInt2819, local942.anInt2525 - Static107.anInt2813, local942.anInt2528 - Static107.anInt2820, local942.anInt2532);
					}
				}
			}
			@Pc(1745) Class2_Sub4 local1745;
			if (local23 < this.anInt2808 - 1) {
				local1745 = this.aClass2_Sub4ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean38) {
					Static107.aClass36_8.method1362(local1745);
				}
			}
			if (local17 < Static107.anInt2798) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean38) {
					Static107.aClass36_8.method1362(local1745);
				}
			}
			if (local20 < Static107.anInt2803) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean38) {
					Static107.aClass36_8.method1362(local1745);
				}
			}
			if (local17 > Static107.anInt2798) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean38) {
					Static107.aClass36_8.method1362(local1745);
				}
			}
			if (local20 > Static107.anInt2803) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean38) {
					Static107.aClass36_8.method1362(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(III)Z")
	private boolean method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static107.anInt2800) {
			return false;
		} else if (local8 == Static107.anInt2800) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1778(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method1778(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method1778(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1778(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static107.anInt2800;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static107.anInt2800;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!ea;Lclient!ea;IIII)V")
	public void method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) Class2_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class57 local8 = new Class57();
		local8.anInt2532 = arg8;
		local8.anInt2526 = arg9;
		local8.anInt2531 = arg1 * 128 + 64;
		local8.anInt2528 = arg2 * 128 + 64;
		local8.anInt2525 = arg3;
		local8.aClass2_Sub1_Sub4_7 = arg4;
		local8.aClass2_Sub1_Sub4_8 = arg5;
		local8.anInt2530 = arg6;
		local8.anInt2527 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub4ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub4ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub4(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass57_1 = local8;
	}

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "(III)I")
	public int method1768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass13_1 == null ? 0 : local8.aClass13_1.anInt647;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!ea;ILclient!ea;Lclient!ea;)V")
	public void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub4 arg6, @OriginalArg(7) Class2_Sub1_Sub4 arg7) {
		@Pc(3) Class32 local3 = new Class32();
		local3.aClass2_Sub1_Sub4_3 = arg4;
		local3.anInt2055 = arg1 * 128 + 64;
		local3.anInt2059 = arg2 * 128 + 64;
		local3.anInt2061 = arg3;
		local3.anInt2057 = arg5;
		local3.aClass2_Sub1_Sub4_5 = arg6;
		local3.aClass2_Sub1_Sub4_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub4 local43 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt569; local47++) {
				if ((local43.aClass8Array1[local47].anInt312 & 0x100) == 256 && local43.aClass8Array1[local47].aClass2_Sub1_Sub4_1 instanceof Class2_Sub1_Sub4_Sub5) {
					@Pc(71) Class2_Sub1_Sub4_Sub5 local71 = (Class2_Sub1_Sub4_Sub5) local43.aClass8Array1[local47].aClass2_Sub1_Sub4_1;
					local71.method920();
					if (local71.anInt1974 > local34) {
						local34 = local71.anInt1974;
					}
				}
			}
		}
		local3.anInt2056 = local34;
		if (this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub4(arg0, arg1, arg2);
		}
		this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass32_1 = local3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hb;Lclient!hb;IIIZ)V")
	private void method1770(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) Class2_Sub1_Sub4_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method909();
		this.anInt2824++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray180;
		@Pc(15) int local15 = arg1.anInt1353;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1353; local17++) {
			@Pc(23) Class52 local23 = arg0.aClass52Array2[local17];
			@Pc(28) Class52 local28 = arg0.aClass52Array1[local17];
			if (local28.anInt2330 != 0) {
				@Pc(38) int local38 = arg0.anIntArray190[local17] - arg3;
				if (local38 <= arg1.anInt1347) {
					@Pc(49) int local49 = arg0.anIntArray180[local17] - arg2;
					if (local49 >= arg1.anInt1355 && local49 <= arg1.anInt1349) {
						@Pc(65) int local65 = arg0.anIntArray177[local17] - arg4;
						if (local65 >= arg1.anInt1352 && local65 <= arg1.anInt1348) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class52 local82 = arg1.aClass52Array2[local76];
								@Pc(87) Class52 local87 = arg1.aClass52Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray177[local76] && local38 == arg1.anIntArray190[local76] && local87.anInt2330 != 0) {
									local23.anInt2327 += local87.anInt2327;
									local23.anInt2331 += local87.anInt2331;
									local23.anInt2329 += local87.anInt2329;
									local23.anInt2330 += local87.anInt2330;
									local82.anInt2327 += local28.anInt2327;
									local82.anInt2331 += local28.anInt2331;
									local82.anInt2329 += local28.anInt2329;
									local82.anInt2330 += local28.anInt2330;
									local9++;
									this.anIntArray398[local17] = this.anInt2824;
									this.anIntArray397[local76] = this.anInt2824;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt1354; local193++) {
			if (this.anIntArray398[arg0.anIntArray178[local193]] == this.anInt2824 && this.anIntArray398[arg0.anIntArray189[local193]] == this.anInt2824 && this.anIntArray398[arg0.anIntArray197[local193]] == this.anInt2824) {
				arg0.anIntArray182[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt1354; local236++) {
			if (this.anIntArray397[arg1.anIntArray178[local236]] == this.anInt2824 && this.anIntArray397[arg1.anIntArray189[local236]] == this.anInt2824 && this.anIntArray397[arg1.anIntArray197[local236]] == this.anInt2824) {
				arg1.anIntArray182[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIII)Z")
	private boolean method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1766(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray6[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static107.anInt2819) {
					if (!this.method1778(local11, local26, local15)) {
						return false;
					}
					if (!this.method1778(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1778(local11, local30, local15)) {
						return false;
					}
					if (!this.method1778(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1778(local11, local34, local15)) {
					return false;
				}
				if (!this.method1778(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static107.anInt2820) {
					if (!this.method1778(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1778(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1778(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1778(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1778(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1778(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static107.anInt2819) {
					if (!this.method1778(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1778(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1778(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1778(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1778(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1778(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static107.anInt2820) {
					if (!this.method1778(local11, local26, local15)) {
						return false;
					}
					if (!this.method1778(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1778(local11, local30, local15)) {
						return false;
					}
					if (!this.method1778(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1778(local11, local34, local15)) {
					return false;
				}
				if (!this.method1778(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1778(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1778(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1778(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1778(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1778(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "(III)V")
	public void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass53_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
	public void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static107.aBoolean157 = true;
		Static107.anInt2807 = arg0;
		Static107.anInt2802 = arg1;
		Static107.anInt2823 = -1;
		Static107.anInt2812 = -1;
	}

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "(III)V")
	public void method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass13_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class29 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class29(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub4ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub4ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub4(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass29_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class29(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub4ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub4ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub4(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass29_1 = local12;
		} else {
			@Pc(140) Class16 local140 = new Class16(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub4ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub4ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub4(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass16_1 = local140;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method1776(@OriginalArg(0) int arg0) {
		this.anInt2816 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2814; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2822; local7++) {
				if (this.aClass2_Sub4ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub4ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub4(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "(III)Lclient!d;")
	public Class13 method1777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass13_1 == null ? null : local8.aClass13_1;
	}

	@OriginalMember(owner = "client!wd", name = "k", descriptor = "(III)Z")
	private boolean method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static107.anInt2797; local1++) {
			@Pc(6) Class54 local6 = Static107.aClass54Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2373 == 1) {
				local15 = local6.anInt2374 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2365 + (local6.anInt2366 * local15 >> 8);
					local37 = local6.anInt2371 + (local6.anInt2363 * local15 >> 8);
					local47 = local6.anInt2349 + (local6.anInt2372 * local15 >> 8);
					local57 = local6.anInt2359 + (local6.anInt2355 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2373 == 2) {
				local15 = arg0 - local6.anInt2374;
				if (local15 > 0) {
					local27 = local6.anInt2365 + (local6.anInt2366 * local15 >> 8);
					local37 = local6.anInt2371 + (local6.anInt2363 * local15 >> 8);
					local47 = local6.anInt2349 + (local6.anInt2372 * local15 >> 8);
					local57 = local6.anInt2359 + (local6.anInt2355 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2373 == 3) {
				local15 = local6.anInt2365 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2374 + (local6.anInt2364 * local15 >> 8);
					local37 = local6.anInt2368 + (local6.anInt2362 * local15 >> 8);
					local47 = local6.anInt2349 + (local6.anInt2372 * local15 >> 8);
					local57 = local6.anInt2359 + (local6.anInt2355 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2373 == 4) {
				local15 = arg2 - local6.anInt2365;
				if (local15 > 0) {
					local27 = local6.anInt2374 + (local6.anInt2364 * local15 >> 8);
					local37 = local6.anInt2368 + (local6.anInt2362 * local15 >> 8);
					local47 = local6.anInt2349 + (local6.anInt2372 * local15 >> 8);
					local57 = local6.anInt2359 + (local6.anInt2355 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2373 == 5) {
				local15 = arg1 - local6.anInt2349;
				if (local15 > 0) {
					local27 = local6.anInt2374 + (local6.anInt2364 * local15 >> 8);
					local37 = local6.anInt2368 + (local6.anInt2362 * local15 >> 8);
					local47 = local6.anInt2365 + (local6.anInt2366 * local15 >> 8);
					local57 = local6.anInt2371 + (local6.anInt2363 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIILclient!ea;III)Z")
	public boolean method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1799(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIII)V")
	public void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class53 local14 = local8.aClass53_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt2336 = local23 + (local14.anInt2336 - local23) * arg3 / 16;
			local14.anInt2340 = local29 + (local14.anInt2340 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hb;III)V")
	private void method1781(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub4 local14;
		@Pc(29) Class2_Sub1_Sub4_Sub5 local29;
		if (arg2 < this.anInt2814) {
			local14 = this.aClass2_Sub4ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass2_Sub1_Sub4_2 instanceof Class2_Sub1_Sub4_Sub5) {
				local29 = (Class2_Sub1_Sub4_Sub5) local14.aClass13_1.aClass2_Sub1_Sub4_2;
				if (local29.aClass52Array2 != null) {
					this.method1770(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt2814) {
			local14 = this.aClass2_Sub4ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass2_Sub1_Sub4_2 instanceof Class2_Sub1_Sub4_Sub5) {
				local29 = (Class2_Sub1_Sub4_Sub5) local14.aClass13_1.aClass2_Sub1_Sub4_2;
				if (local29.aClass52Array2 != null) {
					this.method1770(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt2814 && arg3 < this.anInt2822) {
			local14 = this.aClass2_Sub4ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass2_Sub1_Sub4_2 instanceof Class2_Sub1_Sub4_Sub5) {
				local29 = (Class2_Sub1_Sub4_Sub5) local14.aClass13_1.aClass2_Sub1_Sub4_2;
				if (local29.aClass52Array2 != null) {
					this.method1770(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt2814 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub4ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass2_Sub1_Sub4_2 instanceof Class2_Sub1_Sub4_Sub5) {
			local29 = (Class2_Sub1_Sub4_Sub5) local14.aClass13_1.aClass2_Sub1_Sub4_2;
			if (local29.aClass52Array2 != null) {
				this.method1770(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()V")
	public void method1782() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2808; local1++) {
			for (local4 = 0; local4 < this.anInt2814; local4++) {
				for (local7 = 0; local7 < this.anInt2822; local7++) {
					this.aClass2_Sub4ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static107.anInt2810; local4++) {
			for (local7 = 0; local7 < Static107.anIntArray395[local4]; local7++) {
				Static107.aClass54ArrayArray1[local4][local7] = null;
			}
			Static107.anIntArray395[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2804; local7++) {
			this.aClass8Array3[local7] = null;
		}
		this.anInt2804 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static107.aClass8Array2.length; local76++) {
			Static107.aClass8Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()V")
	public void method1783() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2804; local1++) {
			@Pc(7) Class8 local7 = this.aClass8Array3[local1];
			this.method1797(local7);
			this.aClass8Array3[local1] = null;
		}
		this.anInt2804 = 0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!hb;IIIII)V")
	private void method1784(@OriginalArg(0) Class2_Sub1_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2808) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2814) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2822 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub4 local66 = this.aClass2_Sub4ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class57 local163 = local66.aClass57_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub4_Sub5 local173;
										if (local163.aClass2_Sub1_Sub4_7 instanceof Class2_Sub1_Sub4_Sub5) {
											local173 = (Class2_Sub1_Sub4_Sub5) local163.aClass2_Sub1_Sub4_7;
											if (local173.aClass52Array2 != null) {
												this.method1770(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub5) {
											local173 = (Class2_Sub1_Sub4_Sub5) local163.aClass2_Sub1_Sub4_8;
											if (local173.aClass52Array2 != null) {
												this.method1770(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt569; local245++) {
										@Pc(251) Class8 local251 = local66.aClass8Array1[local245];
										if (local251 != null && local251.aClass2_Sub1_Sub4_1 instanceof Class2_Sub1_Sub4_Sub5) {
											@Pc(261) Class2_Sub1_Sub4_Sub5 local261 = (Class2_Sub1_Sub4_Sub5) local251.aClass2_Sub1_Sub4_1;
											if (local261.aClass52Array2 != null) {
												@Pc(272) int local272 = local251.anInt311 + 1 - local251.anInt306;
												@Pc(280) int local280 = local251.anInt317 + 1 - local251.anInt318;
												this.method1770(arg0, local261, (local251.anInt306 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt318 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "(III)Lclient!bd;")
	public Class8 method1785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt569; local14++) {
			@Pc(20) Class8 local20 = local8.aClass8Array1[local14];
			if ((local20.anInt308 >> 29 & 0x3) == 2 && local20.anInt306 == arg1 && local20.anInt318 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!fc;IIIIII)V")
	private void method1787(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray131.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray131[local5] - Static107.anInt2819;
			local20 = arg0.anIntArray129[local5] - Static107.anInt2813;
			local27 = arg0.anIntArray132[local5] - Static107.anInt2820;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray135 != null) {
				Static26.anIntArray130[local5] = local37;
				Static26.anIntArray124[local5] = local59;
				Static26.anIntArray133[local5] = local69;
			}
			Static26.anIntArray138[local5] = Static97.anInt2641 + (local37 << 9) / local69;
			Static26.anIntArray136[local5] = Static97.anInt2645 + (local59 << 9) / local69;
		}
		Static97.anInt2644 = 0;
		local3 = arg0.anIntArray127.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray127[local13];
			local27 = arg0.anIntArray134[local13];
			local37 = arg0.anIntArray125[local13];
			@Pc(142) int local142 = Static26.anIntArray138[local20];
			@Pc(146) int local146 = Static26.anIntArray138[local27];
			@Pc(150) int local150 = Static26.anIntArray138[local37];
			@Pc(154) int local154 = Static26.anIntArray136[local20];
			@Pc(158) int local158 = Static26.anIntArray136[local27];
			@Pc(162) int local162 = Static26.anIntArray136[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static97.aBoolean137 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static97.anInt2638 || local146 > Static97.anInt2638 || local150 > Static97.anInt2638) {
					Static97.aBoolean137 = true;
				}
				if (Static107.aBoolean157 && this.method1764(Static107.anInt2807, Static107.anInt2802, local154, local158, local162, local142, local146, local150)) {
					Static107.anInt2823 = arg5;
					Static107.anInt2812 = arg6;
				}
				if (arg0.anIntArray135 == null || arg0.anIntArray135[local13] == -1) {
					if (arg0.anIntArray128[local13] != 12345678) {
						Static97.method1652(local154, local158, local162, local142, local146, local150, arg0.anIntArray128[local13], arg0.anIntArray137[local13], arg0.anIntArray126[local13]);
					}
				} else if (Static107.aBoolean156) {
					@Pc(364) int local364 = Static97.anInterface1_1.method1419(arg0.anIntArray135[local13]);
					Static97.method1652(local154, local158, local162, local142, local146, local150, Static107.method1789(local364, arg0.anIntArray128[local13]), Static107.method1789(local364, arg0.anIntArray137[local13]), Static107.method1789(local364, arg0.anIntArray126[local13]));
				} else if (arg0.aBoolean63) {
					Static97.method1659(local154, local158, local162, local142, local146, local150, arg0.anIntArray128[local13], arg0.anIntArray137[local13], arg0.anIntArray126[local13], Static26.anIntArray130[0], Static26.anIntArray130[1], Static26.anIntArray130[3], Static26.anIntArray124[0], Static26.anIntArray124[1], Static26.anIntArray124[3], Static26.anIntArray133[0], Static26.anIntArray133[1], Static26.anIntArray133[3], arg0.anIntArray135[local13]);
				} else {
					Static97.method1659(local154, local158, local162, local142, local146, local150, arg0.anIntArray128[local13], arg0.anIntArray137[local13], arg0.anIntArray126[local13], Static26.anIntArray130[local20], Static26.anIntArray130[local27], Static26.anIntArray130[local37], Static26.anIntArray124[local20], Static26.anIntArray124[local27], Static26.anIntArray124[local37], Static26.anIntArray133[local20], Static26.anIntArray133[local27], Static26.anIntArray133[local37], arg0.anIntArray135[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static107.anInt2800) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
			if (!this.method1778(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1778(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1778(local21, local167, local195)) {
				return false;
			} else if (this.method1778(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1766(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1778(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1778(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1778(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1778(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "(III)V")
	public void method1790() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2808; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2814; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2822; local7++) {
					@Pc(17) Class2_Sub4 local17 = this.aClass2_Sub4ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class57 local22 = local17.aClass57_1;
						if (local22 != null && local22.aClass2_Sub1_Sub4_7 instanceof Class2_Sub1_Sub4_Sub5) {
							@Pc(32) Class2_Sub1_Sub4_Sub5 local32 = (Class2_Sub1_Sub4_Sub5) local22.aClass2_Sub1_Sub4_7;
							if (local32.aClass52Array2 != null) {
								this.method1784(local32, local1, local4, local7, 1, 1);
								if (local22.aClass2_Sub1_Sub4_8 instanceof Class2_Sub1_Sub4_Sub5) {
									@Pc(51) Class2_Sub1_Sub4_Sub5 local51 = (Class2_Sub1_Sub4_Sub5) local22.aClass2_Sub1_Sub4_8;
									if (local51.aClass52Array2 != null) {
										this.method1784(local51, local1, local4, local7, 1, 1);
										this.method1770(local32, local51, 0, 0, 0, false);
										local51.method894();
									}
								}
								local32.method894();
							}
						}
						@Pc(98) Class2_Sub1_Sub4_Sub5 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt569; local82++) {
							@Pc(88) Class8 local88 = local17.aClass8Array1[local82];
							if (local88 != null && local88.aClass2_Sub1_Sub4_1 instanceof Class2_Sub1_Sub4_Sub5) {
								local98 = (Class2_Sub1_Sub4_Sub5) local88.aClass2_Sub1_Sub4_1;
								if (local98.aClass52Array2 != null) {
									this.method1784(local98, local1, local4, local7, local88.anInt311 + 1 - local88.anInt306, local88.anInt317 - local88.anInt318 + 1);
									local98.method894();
								}
							}
						}
						@Pc(134) Class13 local134 = local17.aClass13_1;
						if (local134 != null && local134.aClass2_Sub1_Sub4_2 instanceof Class2_Sub1_Sub4_Sub5) {
							local98 = (Class2_Sub1_Sub4_Sub5) local134.aClass2_Sub1_Sub4_2;
							if (local98.aClass52Array2 != null) {
								this.method1781(local98, local1, local4, local7);
								local98.method894();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIILclient!ea;IIZ)Z")
	public boolean method1791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1799(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(IIIIII)V")
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2814 * 128) {
			arg0 = this.anInt2814 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2822 * 128) {
			arg2 = this.anInt2822 * 128 - 1;
		}
		Static107.anInt2800++;
		Static107.anInt2799 = Static35.anIntArray200[arg3];
		Static107.anInt2801 = Static35.anIntArray205[arg3];
		Static107.anInt2809 = Static35.anIntArray200[arg4];
		Static107.anInt2811 = Static35.anIntArray205[arg4];
		Static107.aBooleanArrayArray1 = Static107.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static107.anInt2819 = arg0;
		Static107.anInt2813 = arg1;
		Static107.anInt2820 = arg2;
		Static107.anInt2798 = arg0 / 128;
		Static107.anInt2803 = arg2 / 128;
		Static107.anInt2817 = arg5;
		Static107.anInt2818 = Static107.anInt2798 - 25;
		if (Static107.anInt2818 < 0) {
			Static107.anInt2818 = 0;
		}
		Static107.anInt2815 = Static107.anInt2803 - 25;
		if (Static107.anInt2815 < 0) {
			Static107.anInt2815 = 0;
		}
		Static107.anInt2805 = Static107.anInt2798 + 25;
		if (Static107.anInt2805 > this.anInt2814) {
			Static107.anInt2805 = this.anInt2814;
		}
		Static107.anInt2806 = Static107.anInt2803 + 25;
		if (Static107.anInt2806 > this.anInt2822) {
			Static107.anInt2806 = this.anInt2822;
		}
		this.method1801();
		Static107.anInt2821 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2816; local128 < this.anInt2808; local128++) {
			@Pc(134) Class2_Sub4[][] local134 = this.aClass2_Sub4ArrayArrayArray1[local128];
			for (local136 = Static107.anInt2818; local136 < Static107.anInt2805; local136++) {
				for (local139 = Static107.anInt2815; local139 < Static107.anInt2806; local139++) {
					@Pc(146) Class2_Sub4 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt570 <= arg5 && (Static107.aBooleanArrayArray1[local136 + 25 - Static107.anInt2798][local139 + 25 - Static107.anInt2803] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean37 = true;
							local146.aBoolean38 = true;
							if (local146.anInt569 > 0) {
								local146.aBoolean40 = true;
							} else {
								local146.aBoolean40 = false;
							}
							Static107.anInt2821++;
						} else {
							local146.aBoolean37 = false;
							local146.aBoolean38 = false;
							local146.anInt555 = 0;
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
		for (@Pc(224) int local224 = this.anInt2816; local224 < this.anInt2808; local224++) {
			@Pc(230) Class2_Sub4[][] local230 = this.aClass2_Sub4ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static107.anInt2798 + local139;
				local241 = Static107.anInt2798 - local139;
				if (local237 >= Static107.anInt2818 || local241 < Static107.anInt2805) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static107.anInt2803 + local249;
						local258 = Static107.anInt2803 - local249;
						@Pc(270) Class2_Sub4 local270;
						if (local237 >= Static107.anInt2818) {
							if (local254 >= Static107.anInt2815) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean37) {
									this.method1765(local270, true);
								}
							}
							if (local258 < Static107.anInt2806) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean37) {
									this.method1765(local270, true);
								}
							}
						}
						if (local241 < Static107.anInt2805) {
							if (local254 >= Static107.anInt2815) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean37) {
									this.method1765(local270, true);
								}
							}
							if (local258 < Static107.anInt2806) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean37) {
									this.method1765(local270, true);
								}
							}
						}
						if (Static107.anInt2821 == 0) {
							Static107.aBoolean157 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2816; local136 < this.anInt2808; local136++) {
			@Pc(361) Class2_Sub4[][] local361 = this.aClass2_Sub4ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static107.anInt2798 + local237;
				local249 = Static107.anInt2798 - local237;
				if (local241 >= Static107.anInt2818 || local249 < Static107.anInt2805) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static107.anInt2803 + local254;
						@Pc(389) int local389 = Static107.anInt2803 - local254;
						@Pc(401) Class2_Sub4 local401;
						if (local241 >= Static107.anInt2818) {
							if (local258 >= Static107.anInt2815) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean37) {
									this.method1765(local401, false);
								}
							}
							if (local389 < Static107.anInt2806) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean37) {
									this.method1765(local401, false);
								}
							}
						}
						if (local249 < Static107.anInt2805) {
							if (local258 >= Static107.anInt2815) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean37) {
									this.method1765(local401, false);
								}
							}
							if (local389 < Static107.anInt2806) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean37) {
									this.method1765(local401, false);
								}
							}
						}
						if (Static107.anInt2821 == 0) {
							Static107.aBoolean157 = false;
							return;
						}
					}
				}
			}
		}
		Static107.aBoolean157 = false;
	}

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "(III)V")
	public void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "(III)I")
	public int method1795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt569; local14++) {
			@Pc(20) Class8 local20 = local8.aClass8Array1[local14];
			if ((local20.anInt308 >> 29 & 0x3) == 2 && local20.anInt306 == arg1 && local20.anInt318 == arg2) {
				return local20.anInt308;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(IIII)V")
	public void method1796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].anInt570 = arg3;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!bd;)V")
	private void method1797(@OriginalArg(0) Class8 arg0) {
		for (@Pc(2) int local2 = arg0.anInt306; local2 <= arg0.anInt311; local2++) {
			for (@Pc(6) int local6 = arg0.anInt318; local6 <= arg0.anInt317; local6++) {
				@Pc(17) Class2_Sub4 local17 = this.aClass2_Sub4ArrayArrayArray1[arg0.anInt316][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt569; local21++) {
						if (local17.aClass8Array1[local21] == arg0) {
							local17.anInt569--;
							for (local36 = local21; local36 < local17.anInt569; local36++) {
								local17.aClass8Array1[local36] = local17.aClass8Array1[local36 + 1];
								local17.anIntArray80[local36] = local17.anIntArray80[local36 + 1];
							}
							local17.aClass8Array1[local17.anInt569] = null;
							break;
						}
					}
					local17.anInt565 = 0;
					for (local36 = 0; local36 < local17.anInt569; local36++) {
						local17.anInt565 |= local17.anIntArray80[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!ea;II)V")
	public void method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class13 local6 = new Class13();
		local6.aClass2_Sub1_Sub4_2 = arg4;
		local6.anInt657 = arg1 * 128 + 64;
		local6.anInt653 = arg2 * 128 + 64;
		local6.anInt648 = arg3;
		local6.anInt647 = arg5;
		local6.anInt656 = arg6;
		if (this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub4(arg0, arg1, arg2);
		}
		this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local6;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIIIILclient!ea;IZII)Z")
	private boolean method1799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2814 || local4 >= this.anInt2822) {
					return false;
				}
				@Pc(28) Class2_Sub4 local28 = this.aClass2_Sub4ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt569 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class8 local52 = new Class8();
		local52.anInt308 = arg11;
		local52.anInt312 = arg12;
		local52.anInt316 = arg0;
		local52.anInt313 = arg5;
		local52.anInt322 = arg6;
		local52.anInt315 = arg7;
		local52.aClass2_Sub1_Sub4_1 = arg8;
		local52.anInt310 = arg9;
		local52.anInt306 = arg1;
		local52.anInt318 = arg2;
		local52.anInt311 = arg1 + arg3 - 1;
		local52.anInt317 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub4ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub4ArrayArrayArray1[local130][local98][local101] = new Class2_Sub4(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub4 local166 = this.aClass2_Sub4ArrayArrayArray1[arg0][local98][local101];
				local166.aClass8Array1[local166.anInt569] = local52;
				local166.anIntArray80[local166.anInt569] = local104;
				local166.anInt565 |= local104;
				local166.anInt569++;
			}
		}
		if (arg10) {
			this.aClass8Array3[this.anInt2804++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([IIIIII)V")
	public void method1800(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class29 local14 = local8.aClass29_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1794;
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
		@Pc(59) Class16 local59 = local8.aClass16_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1116;
		@Pc(68) int local68 = local59.anInt1115;
		@Pc(71) int local71 = local59.anInt1117;
		@Pc(74) int local74 = local59.anInt1118;
		@Pc(79) int[] local79 = this.anIntArrayArray70[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray71[local68];
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

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()V")
	private void method1801() {
		@Pc(3) int local3 = Static107.anIntArray395[Static107.anInt2817];
		@Pc(7) Class54[] local7 = Static107.aClass54ArrayArray1[Static107.anInt2817];
		Static107.anInt2797 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class54 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2358 == 1) {
				local27 = local16.anInt2354 + 25 - Static107.anInt2798;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2352 + 25 - Static107.anInt2803;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2369 + 25 - Static107.anInt2803;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static107.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static107.anInt2819 - local16.anInt2374;
						if (local79 > 32) {
							local16.anInt2373 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2373 = 2;
							local79 = -local79;
						}
						local16.anInt2366 = (local16.anInt2365 - Static107.anInt2820 << 8) / local79;
						local16.anInt2363 = (local16.anInt2371 - Static107.anInt2820 << 8) / local79;
						local16.anInt2372 = (local16.anInt2349 - Static107.anInt2813 << 8) / local79;
						local16.anInt2355 = (local16.anInt2359 - Static107.anInt2813 << 8) / local79;
						Static107.aClass54Array1[Static107.anInt2797++] = local16;
					}
				}
			} else if (local16.anInt2358 == 2) {
				local27 = local16.anInt2352 + 25 - Static107.anInt2803;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2354 + 25 - Static107.anInt2798;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2356 + 25 - Static107.anInt2798;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static107.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static107.anInt2820 - local16.anInt2365;
						if (local79 > 32) {
							local16.anInt2373 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2373 = 4;
							local79 = -local79;
						}
						local16.anInt2364 = (local16.anInt2374 - Static107.anInt2819 << 8) / local79;
						local16.anInt2362 = (local16.anInt2368 - Static107.anInt2819 << 8) / local79;
						local16.anInt2372 = (local16.anInt2349 - Static107.anInt2813 << 8) / local79;
						local16.anInt2355 = (local16.anInt2359 - Static107.anInt2813 << 8) / local79;
						Static107.aClass54Array1[Static107.anInt2797++] = local16;
					}
				}
			} else if (local16.anInt2358 == 4) {
				local27 = local16.anInt2349 - Static107.anInt2813;
				if (local27 > 128) {
					local40 = local16.anInt2352 + 25 - Static107.anInt2803;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2369 + 25 - Static107.anInt2803;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2354 + 25 - Static107.anInt2798;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2356 + 25 - Static107.anInt2798;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static107.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2373 = 5;
							local16.anInt2364 = (local16.anInt2374 - Static107.anInt2819 << 8) / local27;
							local16.anInt2362 = (local16.anInt2368 - Static107.anInt2819 << 8) / local27;
							local16.anInt2366 = (local16.anInt2365 - Static107.anInt2820 << 8) / local27;
							local16.anInt2363 = (local16.anInt2371 - Static107.anInt2820 << 8) / local27;
							Static107.aClass54Array1[Static107.anInt2797++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(IIII)I")
	public int method1802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass57_1 != null && local8.aClass57_1.anInt2532 == arg3) {
			return local8.aClass57_1.anInt2526 & 0xFF;
		} else if (local8.aClass53_1 != null && local8.aClass53_1.anInt2342 == arg3) {
			return local8.aClass53_1.anInt2347 & 0xFF;
		} else if (local8.aClass13_1 != null && local8.aClass13_1.anInt647 == arg3) {
			return local8.aClass13_1.anInt656 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt569; local56++) {
				if (local8.aClass8Array1[local56].anInt308 == arg3) {
					return local8.aClass8Array1[local56].anInt312 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(IIII)Z")
	private boolean method1803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1766(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1778(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1778(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1778(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1778(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "(III)V")
	public void method1804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub4 local8 = this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass32_1 = null;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILclient!ea;IIIIII)V")
	public void method1805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class53 local6 = new Class53();
		local6.anInt2342 = arg9;
		local6.anInt2347 = arg10;
		local6.anInt2336 = arg1 * 128 + arg7 + 64;
		local6.anInt2340 = arg2 * 128 + arg8 + 64;
		local6.anInt2338 = arg3;
		local6.aClass2_Sub1_Sub4_6 = arg4;
		local6.anInt2345 = arg5;
		local6.anInt2337 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass2_Sub4ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass2_Sub4ArrayArrayArray1[local44][arg1][arg2] = new Class2_Sub4(local44, arg1, arg2);
			}
		}
		this.aClass2_Sub4ArrayArrayArray1[arg0][arg1][arg2].aClass53_1 = local6;
	}
}
