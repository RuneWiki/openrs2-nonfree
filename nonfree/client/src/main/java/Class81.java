import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class81 {

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[Lclient!mf;")
	private final Class48[] aClass48Array2 = new Class48[5000];

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	private int anInt2789 = 0;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	private int anInt2792 = 0;

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray28 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray29 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	private final int anInt2784;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	private final int anInt2781;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	private final int anInt2795;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "[[[Lclient!id;")
	private final Class4_Sub13[][][] aClass4_Sub13ArrayArrayArray1;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(III[[[I)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2784 = arg0;
		this.anInt2781 = arg1;
		this.anInt2795 = arg2;
		this.aClass4_Sub13ArrayArrayArray1 = new Class4_Sub13[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray7 = arg3;
		this.method1978();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
	public void method1950() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2789; local1++) {
			@Pc(7) Class48 local7 = this.aClass48Array2[local1];
			this.method1971(local7);
			this.aClass48Array2[local1] = null;
		}
		this.anInt2789 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!sd;III)V")
	private void method1951(@OriginalArg(0) Class4_Sub4_Sub3_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class4_Sub13 local14;
		@Pc(29) Class4_Sub4_Sub3_Sub5 local29;
		if (arg2 < this.anInt2781) {
			local14 = this.aClass4_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass47_1 != null && local14.aClass47_1.aClass4_Sub4_Sub3_3 instanceof Class4_Sub4_Sub3_Sub5) {
				local29 = (Class4_Sub4_Sub3_Sub5) local14.aClass47_1.aClass4_Sub4_Sub3_3;
				Static108.method1640(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2781) {
			local14 = this.aClass4_Sub13ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass47_1 != null && local14.aClass47_1.aClass4_Sub4_Sub3_3 instanceof Class4_Sub4_Sub3_Sub5) {
				local29 = (Class4_Sub4_Sub3_Sub5) local14.aClass47_1.aClass4_Sub4_Sub3_3;
				Static108.method1640(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2781 && arg3 < this.anInt2795) {
			local14 = this.aClass4_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass47_1 != null && local14.aClass47_1.aClass4_Sub4_Sub3_3 instanceof Class4_Sub4_Sub3_Sub5) {
				local29 = (Class4_Sub4_Sub3_Sub5) local14.aClass47_1.aClass4_Sub4_Sub3_3;
				Static108.method1640(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2781 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass4_Sub13ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass47_1 != null && local14.aClass47_1.aClass4_Sub4_Sub3_3 instanceof Class4_Sub4_Sub3_Sub5) {
			local29 = (Class4_Sub4_Sub3_Sub5) local14.aClass47_1.aClass4_Sub4_Sub3_3;
			Static108.method1640(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V")
	public void method1952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class35 local14 = local8.aClass35_1;
		if (local14 != null) {
			local14.anInt1353 = local14.anInt1353 * arg3 / 16;
			local14.anInt1348 = local14.anInt1348 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	private boolean method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static131.anInt2790) {
			return false;
		} else if (local8 == Static131.anInt2790) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1961(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2], local27 + 1) && this.method1961(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local27 + 1) && this.method1961(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1961(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static131.anInt2790;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static131.anInt2790;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)I")
	public int method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass70_1 == null ? 0 : local8.aClass70_1.anInt2458;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIII)Z")
	private boolean method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1953(arg0, arg1, arg2)) {
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
				if (local11 > Static131.anInt2785) {
					if (!this.method1961(local11, local26, local15)) {
						return false;
					}
					if (!this.method1961(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1961(local11, local30, local15)) {
						return false;
					}
					if (!this.method1961(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1961(local11, local34, local15)) {
					return false;
				}
				if (!this.method1961(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static131.anInt2788) {
					if (!this.method1961(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1961(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1961(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1961(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1961(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1961(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static131.anInt2785) {
					if (!this.method1961(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1961(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1961(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1961(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1961(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1961(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static131.anInt2788) {
					if (!this.method1961(local11, local26, local15)) {
						return false;
					}
					if (!this.method1961(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1961(local11, local30, local15)) {
						return false;
					}
					if (!this.method1961(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1961(local11, local34, local15)) {
					return false;
				}
				if (!this.method1961(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1961(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1961(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1961(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1961(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1961(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static131.anInt2790) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5;
			if (!this.method1961(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1961(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1961(local21, local167, local195)) {
				return false;
			} else if (this.method1961(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1953(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1961(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1961(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1961(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1961(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!id;Z)V")
	private void method1957(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) boolean arg1) {
		Static131.aClass78_15.method1914(arg0);
		while (true) {
			@Pc(8) Class4_Sub13 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class4_Sub13[][] local31;
			@Pc(49) Class4_Sub13 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class70 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class48 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class4_Sub13 var33;
										while (true) {
											do {
												local8 = (Class4_Sub13) Static131.aClass78_15.method1919();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean77);
											local17 = local8.anInt1301;
											local20 = local8.anInt1305;
											local23 = local8.anInt1309;
											local26 = local8.anInt1306;
											local31 = this.aClass4_Sub13ArrayArrayArray1[local23];
											if (!local8.aBoolean76) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass4_Sub13ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean77) {
														continue;
													}
												}
												if (local17 <= Static131.anInt2803 && local17 > Static131.anInt2793) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean77 && (local49.aBoolean76 || (local8.anInt1302 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static131.anInt2803 && local17 < Static131.anInt2787 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean77 && (local49.aBoolean76 || (local8.anInt1302 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static131.anInt2797 && local20 > Static131.anInt2786) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean77 && (local49.aBoolean76 || (local8.anInt1302 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static131.anInt2797 && local20 < Static131.anInt2805 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean77 && (local49.aBoolean76 || (local8.anInt1302 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean76 = false;
											if (local8.aClass4_Sub13_1 != null) {
												local49 = local8.aClass4_Sub13_1;
												if (local49.aClass63_1 == null) {
													if (local49.aClass31_1 != null && !this.method1953(0, local17, local20)) {
														this.method1985(local49.aClass31_1, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local17, local20);
													}
												} else if (!this.method1953(0, local17, local20)) {
													this.method1991(local49.aClass63_1, 0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local17, local20);
												}
												@Pc(225) Class70 local225 = local49.aClass70_1;
												if (local225 != null) {
													local225.aClass4_Sub4_Sub3_8.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local225.anInt2452 - Static131.anInt2785, local225.anInt2454 - Static131.anInt2780, local225.anInt2450 - Static131.anInt2788, local225.anInt2458);
												}
												for (local251 = 0; local251 < local49.anInt1311; local251++) {
													var12 = local49.aClass48Array1[local251];
													if (var12 != null) {
														var12.aClass4_Sub4_Sub3_4.method1753(var12.anInt1898, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, var12.anInt1903 - Static131.anInt2785, var12.anInt1904 - Static131.anInt2780, var12.anInt1905 - Static131.anInt2788, var12.anInt1906);
													}
												}
											}
											var22 = false;
											if (local8.aClass63_1 == null) {
												if (local8.aClass31_1 != null && !this.method1953(local26, local17, local20)) {
													var22 = true;
													this.method1985(local8.aClass31_1, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local17, local20);
												}
											} else if (!this.method1953(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass63_1.anInt2323 != 12345678 || Static131.aBoolean159 && local23 <= Static131.anInt2796) {
													this.method1991(local8.aClass63_1, local26, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class70 local350 = local8.aClass70_1;
											@Pc(353) Class35 local353 = local8.aClass35_1;
											if (local350 != null || local353 != null) {
												if (Static131.anInt2803 == local17) {
													var21++;
												} else if (Static131.anInt2803 < local17) {
													var21 += 2;
												}
												if (Static131.anInt2797 == local20) {
													var21 += 3;
												} else if (Static131.anInt2797 > local20) {
													var21 += 6;
												}
												local251 = Static131.anIntArray399[var21];
												local8.anInt1307 = Static131.anIntArray405[var21];
											}
											if (local350 != null) {
												if ((local350.anInt2463 & Static131.anIntArray404[var21]) == 0) {
													local8.anInt1303 = 0;
												} else if (local350.anInt2463 == 16) {
													local8.anInt1303 = 3;
													local8.anInt1310 = Static131.anIntArray402[var21];
													local8.anInt1308 = 3 - local8.anInt1310;
												} else if (local350.anInt2463 == 32) {
													local8.anInt1303 = 6;
													local8.anInt1310 = Static131.anIntArray400[var21];
													local8.anInt1308 = 6 - local8.anInt1310;
												} else if (local350.anInt2463 == 64) {
													local8.anInt1303 = 12;
													local8.anInt1310 = Static131.anIntArray403[var21];
													local8.anInt1308 = 12 - local8.anInt1310;
												} else {
													local8.anInt1303 = 9;
													local8.anInt1310 = Static131.anIntArray401[var21];
													local8.anInt1308 = 9 - local8.anInt1310;
												}
												if ((local350.anInt2463 & local251) != 0 && !this.method1955(local26, local17, local20, local350.anInt2463)) {
													local350.aClass4_Sub4_Sub3_8.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local350.anInt2452 - Static131.anInt2785, local350.anInt2454 - Static131.anInt2780, local350.anInt2450 - Static131.anInt2788, local350.anInt2458);
												}
												if ((local350.anInt2464 & local251) != 0 && !this.method1955(local26, local17, local20, local350.anInt2464)) {
													local350.aClass4_Sub4_Sub3_9.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local350.anInt2452 - Static131.anInt2785, local350.anInt2454 - Static131.anInt2780, local350.anInt2450 - Static131.anInt2788, local350.anInt2458);
												}
											}
											if (local353 != null && !this.method1979(local26, local17, local20, local353.aClass4_Sub4_Sub3_2.anInt2514)) {
												if ((local353.anInt1355 & local251) != 0) {
													local353.aClass4_Sub4_Sub3_2.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local353.anInt1351 + local353.anInt1353 - Static131.anInt2785, local353.anInt1344 - Static131.anInt2780, local353.anInt1356 + local353.anInt1348 - Static131.anInt2788, local353.anInt1343);
												} else if (local353.anInt1355 == 256) {
													local592 = local353.anInt1351 - Static131.anInt2785;
													local597 = local353.anInt1344 - Static131.anInt2780;
													local602 = local353.anInt1356 - Static131.anInt2788;
													var17 = local353.anInt1347;
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
														local353.aClass4_Sub4_Sub3_2.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local592 + local353.anInt1353, local597, local602 + local353.anInt1348, local353.anInt1343);
													} else if (local353.aClass4_Sub4_Sub3_1 != null) {
														local353.aClass4_Sub4_Sub3_1.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local592, local597, local602, local353.anInt1343);
													}
												}
											}
											if (var22) {
												@Pc(673) Class47 local673 = local8.aClass47_1;
												if (local673 != null) {
													local673.aClass4_Sub4_Sub3_3.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local673.anInt1887 - Static131.anInt2785, local673.anInt1888 - Static131.anInt2780, local673.anInt1896 - Static131.anInt2788, local673.anInt1894);
												}
												@Pc(700) Class57 local700 = local8.aClass57_1;
												if (local700 != null && local700.anInt2157 == 0) {
													if (local700.aClass4_Sub4_Sub3_5 != null) {
														local700.aClass4_Sub4_Sub3_5.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local700.anInt2156 - Static131.anInt2785, local700.anInt2158 - Static131.anInt2780, local700.anInt2159 - Static131.anInt2788, local700.anInt2161);
													}
													if (local700.aClass4_Sub4_Sub3_6 != null) {
														local700.aClass4_Sub4_Sub3_6.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local700.anInt2156 - Static131.anInt2785, local700.anInt2158 - Static131.anInt2780, local700.anInt2159 - Static131.anInt2788, local700.anInt2161);
													}
													if (local700.aClass4_Sub4_Sub3_7 != null) {
														local700.aClass4_Sub4_Sub3_7.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local700.anInt2156 - Static131.anInt2785, local700.anInt2158 - Static131.anInt2780, local700.anInt2159 - Static131.anInt2788, local700.anInt2161);
													}
												}
											}
											local592 = local8.anInt1302;
											if (local592 != 0) {
												if (local17 < Static131.anInt2803 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean77) {
														Static131.aClass78_15.method1914(var33);
													}
												}
												if (local20 < Static131.anInt2797 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean77) {
														Static131.aClass78_15.method1914(var33);
													}
												}
												if (local17 > Static131.anInt2803 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean77) {
														Static131.aClass78_15.method1914(var33);
													}
												}
												if (local20 > Static131.anInt2797 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean77) {
														Static131.aClass78_15.method1914(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1303 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1311; var21++) {
												if (local8.aClass48Array1[var21].anInt1908 != Static131.anInt2790 && (local8.anIntArray163[var21] & local8.anInt1303) == local8.anInt1310) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass70_1;
												if (!this.method1955(local26, local17, local20, local919.anInt2463)) {
													local919.aClass4_Sub4_Sub3_8.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local919.anInt2452 - Static131.anInt2785, local919.anInt2454 - Static131.anInt2780, local919.anInt2450 - Static131.anInt2788, local919.anInt2458);
												}
												local8.anInt1303 = 0;
											}
										}
										if (!local8.aBoolean78) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt1311;
											local8.aBoolean78 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass48Array1[local251];
												if (var12.anInt1908 != Static131.anInt2790) {
													for (local978 = var12.anInt1910; local978 <= var12.anInt1912; local978++) {
														for (local592 = var12.anInt1900; local592 <= var12.anInt1901; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean76) {
																local8.aBoolean78 = true;
																continue label558;
															}
															if (var33.anInt1303 != 0) {
																local602 = 0;
																if (local978 > var12.anInt1910) {
																	local602++;
																}
																if (local978 < var12.anInt1912) {
																	local602 += 4;
																}
																if (local592 > var12.anInt1900) {
																	local602 += 8;
																}
																if (local592 < var12.anInt1901) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt1303) == local8.anInt1308) {
																	local8.aBoolean78 = true;
																	continue label558;
																}
															}
														}
													}
													Static131.aClass48Array3[var21++] = var12;
													local592 = Static131.anInt2803 - var12.anInt1910;
													local597 = var12.anInt1912 - Static131.anInt2803;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static131.anInt2797 - var12.anInt1900;
													var17 = var12.anInt1901 - Static131.anInt2797;
													if (var17 > local602) {
														var12.anInt1899 = local592 + var17;
													} else {
														var12.anInt1899 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class48 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static131.aClass48Array3[local592];
													if (local1102.anInt1908 != Static131.anInt2790) {
														if (local1102.anInt1899 > local1093) {
															local1093 = local1102.anInt1899;
															local978 = local592;
														} else if (local1102.anInt1899 == local1093) {
															local602 = local1102.anInt1903 - Static131.anInt2785;
															var17 = local1102.anInt1905 - Static131.anInt2788;
															var18 = Static131.aClass48Array3[local978].anInt1903 - Static131.anInt2785;
															var19 = Static131.aClass48Array3[local978].anInt1905 - Static131.anInt2788;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static131.aClass48Array3[local978];
												local1102.anInt1908 = Static131.anInt2790;
												if (!this.method1956(local26, local1102.anInt1910, local1102.anInt1912, local1102.anInt1900, local1102.anInt1901, local1102.aClass4_Sub4_Sub3_4.anInt2514)) {
													local1102.aClass4_Sub4_Sub3_4.method1753(local1102.anInt1898, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local1102.anInt1903 - Static131.anInt2785, local1102.anInt1904 - Static131.anInt2780, local1102.anInt1905 - Static131.anInt2788, local1102.anInt1906);
												}
												for (local602 = local1102.anInt1910; local602 <= local1102.anInt1912; local602++) {
													for (var17 = local1102.anInt1900; var17 <= local1102.anInt1901; var17++) {
														@Pc(1227) Class4_Sub13 local1227 = local31[local602][var17];
														if (local1227.anInt1303 != 0) {
															Static131.aClass78_15.method1914(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean77) {
															Static131.aClass78_15.method1914(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean78) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean78 = false;
											break;
										}
									}
								} while (!local8.aBoolean77);
							} while (local8.anInt1303 != 0);
							if (local17 > Static131.anInt2803 || local17 <= Static131.anInt2793) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean77);
						if (local17 < Static131.anInt2803 || local17 >= Static131.anInt2787 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean77);
					if (local20 > Static131.anInt2797 || local20 <= Static131.anInt2786) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean77);
				if (local20 < Static131.anInt2797 || local20 >= Static131.anInt2805 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean77);
			local8.aBoolean77 = false;
			Static131.anInt2778--;
			@Pc(1369) Class57 local1369 = local8.aClass57_1;
			if (local1369 != null && local1369.anInt2157 != 0) {
				if (local1369.aClass4_Sub4_Sub3_5 != null) {
					local1369.aClass4_Sub4_Sub3_5.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local1369.anInt2156 - Static131.anInt2785, local1369.anInt2158 - Static131.anInt2780 - local1369.anInt2157, local1369.anInt2159 - Static131.anInt2788, local1369.anInt2161);
				}
				if (local1369.aClass4_Sub4_Sub3_6 != null) {
					local1369.aClass4_Sub4_Sub3_6.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local1369.anInt2156 - Static131.anInt2785, local1369.anInt2158 - Static131.anInt2780 - local1369.anInt2157, local1369.anInt2159 - Static131.anInt2788, local1369.anInt2161);
				}
				if (local1369.aClass4_Sub4_Sub3_7 != null) {
					local1369.aClass4_Sub4_Sub3_7.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local1369.anInt2156 - Static131.anInt2785, local1369.anInt2158 - Static131.anInt2780 - local1369.anInt2157, local1369.anInt2159 - Static131.anInt2788, local1369.anInt2161);
				}
			}
			if (local8.anInt1307 != 0) {
				@Pc(1464) Class35 local1464 = local8.aClass35_1;
				if (local1464 != null && !this.method1979(local26, local17, local20, local1464.aClass4_Sub4_Sub3_2.anInt2514)) {
					if ((local1464.anInt1355 & local8.anInt1307) != 0) {
						local1464.aClass4_Sub4_Sub3_2.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local1464.anInt1351 + local1464.anInt1353 - Static131.anInt2785, local1464.anInt1344 - Static131.anInt2780, local1464.anInt1356 + local1464.anInt1348 - Static131.anInt2788, local1464.anInt1343);
					} else if (local1464.anInt1355 == 256) {
						local251 = local1464.anInt1351 - Static131.anInt2785;
						local1093 = local1464.anInt1344 - Static131.anInt2780;
						local978 = local1464.anInt1356 - Static131.anInt2788;
						local592 = local1464.anInt1347;
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
							local1464.aClass4_Sub4_Sub3_2.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local251 + local1464.anInt1353, local1093, local978 + local1464.anInt1348, local1464.anInt1343);
						} else if (local1464.aClass4_Sub4_Sub3_1 != null) {
							local1464.aClass4_Sub4_Sub3_1.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local251, local1093, local978, local1464.anInt1343);
						}
					}
				}
				local919 = local8.aClass70_1;
				if (local919 != null) {
					if ((local919.anInt2464 & local8.anInt1307) != 0 && !this.method1955(local26, local17, local20, local919.anInt2464)) {
						local919.aClass4_Sub4_Sub3_9.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local919.anInt2452 - Static131.anInt2785, local919.anInt2454 - Static131.anInt2780, local919.anInt2450 - Static131.anInt2788, local919.anInt2458);
					}
					if ((local919.anInt2463 & local8.anInt1307) != 0 && !this.method1955(local26, local17, local20, local919.anInt2463)) {
						local919.aClass4_Sub4_Sub3_8.method1753(0, Static131.anInt2794, Static131.anInt2801, Static131.anInt2800, Static131.anInt2799, local919.anInt2452 - Static131.anInt2785, local919.anInt2454 - Static131.anInt2780, local919.anInt2450 - Static131.anInt2788, local919.anInt2458);
					}
				}
			}
			@Pc(1689) Class4_Sub13 local1689;
			if (local23 < this.anInt2784 - 1) {
				local1689 = this.aClass4_Sub13ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean77) {
					Static131.aClass78_15.method1914(local1689);
				}
			}
			if (local17 < Static131.anInt2803) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean77) {
					Static131.aClass78_15.method1914(local1689);
				}
			}
			if (local20 < Static131.anInt2797) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean77) {
					Static131.aClass78_15.method1914(local1689);
				}
			}
			if (local17 > Static131.anInt2803) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean77) {
					Static131.aClass78_15.method1914(local1689);
				}
			}
			if (local20 > Static131.anInt2797) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean77) {
					Static131.aClass78_15.method1914(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V")
	public void method1958() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2784; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2781; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2795; local7++) {
					@Pc(17) Class4_Sub13 local17 = this.aClass4_Sub13ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class70 local22 = local17.aClass70_1;
						if (local22 != null && local22.aClass4_Sub4_Sub3_8 instanceof Class4_Sub4_Sub3_Sub5) {
							@Pc(32) Class4_Sub4_Sub3_Sub5 local32 = (Class4_Sub4_Sub3_Sub5) local22.aClass4_Sub4_Sub3_8;
							this.method1965(local32, local1, local4, local7, 1, 1);
							if (local22.aClass4_Sub4_Sub3_9 instanceof Class4_Sub4_Sub3_Sub5) {
								@Pc(48) Class4_Sub4_Sub3_Sub5 local48 = (Class4_Sub4_Sub3_Sub5) local22.aClass4_Sub4_Sub3_9;
								this.method1965(local48, local1, local4, local7, 1, 1);
								Static108.method1640(local32, local48, 0, 0, 0, false);
								local22.aClass4_Sub4_Sub3_9 = local48.method1652(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass4_Sub4_Sub3_8 = local32.method1652(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class4_Sub4_Sub3_Sub5 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1311; local87++) {
							@Pc(93) Class48 local93 = local17.aClass48Array1[local87];
							if (local93 != null && local93.aClass4_Sub4_Sub3_4 instanceof Class4_Sub4_Sub3_Sub5) {
								local103 = (Class4_Sub4_Sub3_Sub5) local93.aClass4_Sub4_Sub3_4;
								this.method1965(local103, local1, local4, local7, local93.anInt1912 + 1 - local93.anInt1910, local93.anInt1901 - local93.anInt1900 + 1);
								local93.aClass4_Sub4_Sub3_4 = local103.method1652(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class47 local142 = local17.aClass47_1;
						if (local142 != null && local142.aClass4_Sub4_Sub3_3 instanceof Class4_Sub4_Sub3_Sub5) {
							local103 = (Class4_Sub4_Sub3_Sub5) local142.aClass4_Sub4_Sub3_3;
							this.method1951(local103, local1, local4, local7);
							local142.aClass4_Sub4_Sub3_3 = local103.method1652(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIILclient!jd;III)Z")
	public boolean method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub4_Sub3 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1994(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(III)Lclient!jb;")
	public Class35 method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass35_1;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(III)Z")
	private boolean method1961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static131.anInt2798; local1++) {
			@Pc(6) Class74 local6 = Static131.aClass74Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2578 == 1) {
				local15 = local6.anInt2570 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2573 + (local6.anInt2571 * local15 >> 8);
					local37 = local6.anInt2583 + (local6.anInt2569 * local15 >> 8);
					local47 = local6.anInt2572 + (local6.anInt2567 * local15 >> 8);
					local57 = local6.anInt2588 + (local6.anInt2579 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2578 == 2) {
				local15 = arg0 - local6.anInt2570;
				if (local15 > 0) {
					local27 = local6.anInt2573 + (local6.anInt2571 * local15 >> 8);
					local37 = local6.anInt2583 + (local6.anInt2569 * local15 >> 8);
					local47 = local6.anInt2572 + (local6.anInt2567 * local15 >> 8);
					local57 = local6.anInt2588 + (local6.anInt2579 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2578 == 3) {
				local15 = local6.anInt2573 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2570 + (local6.anInt2577 * local15 >> 8);
					local37 = local6.anInt2584 + (local6.anInt2585 * local15 >> 8);
					local47 = local6.anInt2572 + (local6.anInt2567 * local15 >> 8);
					local57 = local6.anInt2588 + (local6.anInt2579 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2578 == 4) {
				local15 = arg2 - local6.anInt2573;
				if (local15 > 0) {
					local27 = local6.anInt2570 + (local6.anInt2577 * local15 >> 8);
					local37 = local6.anInt2584 + (local6.anInt2585 * local15 >> 8);
					local47 = local6.anInt2572 + (local6.anInt2567 * local15 >> 8);
					local57 = local6.anInt2588 + (local6.anInt2579 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2578 == 5) {
				local15 = arg1 - local6.anInt2572;
				if (local15 > 0) {
					local27 = local6.anInt2570 + (local6.anInt2577 * local15 >> 8);
					local37 = local6.anInt2584 + (local6.anInt2585 * local15 >> 8);
					local47 = local6.anInt2573 + (local6.anInt2571 * local15 >> 8);
					local57 = local6.anInt2583 + (local6.anInt2569 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public void method1962(@OriginalArg(0) int arg0) {
		this.anInt2792 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2781; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2795; local7++) {
				if (this.aClass4_Sub13ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass4_Sub13ArrayArrayArray1[arg0][local4][local7] = new Class4_Sub13(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!sd;IIIII)V")
	private void method1965(@OriginalArg(0) Class4_Sub4_Sub3_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2784) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2781) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2795 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class4_Sub13 local66 = this.aClass4_Sub13ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray7[local17][local24][local34] + this.anIntArrayArrayArray7[local17][local24 + 1][local34] + this.anIntArrayArrayArray7[local17][local24][local34 + 1] + this.anIntArrayArrayArray7[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray7[arg1][arg2][arg3] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class70 local163 = local66.aClass70_1;
									if (local163 != null) {
										@Pc(173) Class4_Sub4_Sub3_Sub5 local173;
										if (local163.aClass4_Sub4_Sub3_8 instanceof Class4_Sub4_Sub3_Sub5) {
											local173 = (Class4_Sub4_Sub3_Sub5) local163.aClass4_Sub4_Sub3_8;
											Static108.method1640(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass4_Sub4_Sub3_9 instanceof Class4_Sub4_Sub3_Sub5) {
											local173 = (Class4_Sub4_Sub3_Sub5) local163.aClass4_Sub4_Sub3_9;
											Static108.method1640(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1311; local237++) {
										@Pc(243) Class48 local243 = local66.aClass48Array1[local237];
										if (local243 != null && local243.aClass4_Sub4_Sub3_4 instanceof Class4_Sub4_Sub3_Sub5) {
											@Pc(253) Class4_Sub4_Sub3_Sub5 local253 = (Class4_Sub4_Sub3_Sub5) local243.aClass4_Sub4_Sub3_4;
											@Pc(261) int local261 = local243.anInt1912 + 1 - local243.anInt1910;
											@Pc(269) int local269 = local243.anInt1901 + 1 - local243.anInt1900;
											Static108.method1640(arg0, local253, (local243.anInt1910 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1900 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(III)I")
	public int method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass47_1 == null ? 0 : local8.aClass47_1.anInt1894;
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(III)V")
	public void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass47_1 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILclient!jd;Lclient!jd;IIIIII)V")
	public void method1969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub3 arg4, @OriginalArg(5) Class4_Sub4_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class35 local6 = new Class35();
		local6.anInt1343 = arg10;
		local6.anInt1345 = arg11;
		local6.anInt1351 = arg1 * 128 + 64;
		local6.anInt1356 = arg2 * 128 + 64;
		local6.anInt1344 = arg3;
		local6.aClass4_Sub4_Sub3_2 = arg4;
		local6.aClass4_Sub4_Sub3_1 = arg5;
		local6.anInt1355 = arg6;
		local6.anInt1347 = arg7;
		local6.anInt1353 = arg8;
		local6.anInt1348 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass4_Sub13ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass4_Sub13ArrayArrayArray1[local49][arg1][arg2] = new Class4_Sub13(local49, arg1, arg2);
			}
		}
		this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass35_1 = local6;
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(III)I")
	public int method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass35_1 == null ? 0 : local8.aClass35_1.anInt1343;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!mf;)V")
	private void method1971(@OriginalArg(0) Class48 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1910; local2 <= arg0.anInt1912; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1900; local6 <= arg0.anInt1901; local6++) {
				@Pc(17) Class4_Sub13 local17 = this.aClass4_Sub13ArrayArrayArray1[arg0.anInt1902][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1311; local21++) {
						if (local17.aClass48Array1[local21] == arg0) {
							local17.anInt1311--;
							for (local36 = local21; local36 < local17.anInt1311; local36++) {
								local17.aClass48Array1[local36] = local17.aClass48Array1[local36 + 1];
								local17.anIntArray163[local36] = local17.anIntArray163[local36 + 1];
							}
							local17.aClass48Array1[local17.anInt1311] = null;
							break;
						}
					}
					local17.anInt1302 = 0;
					for (local36 = 0; local36 < local17.anInt1311; local36++) {
						local17.anInt1302 |= local17.anIntArray163[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "(III)Lclient!mf;")
	public Class48 method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1311; local14++) {
			@Pc(20) Class48 local20 = local8.aClass48Array1[local14];
			if ((local20.anInt1906 >> 29 & 0x3) == 2 && local20.anInt1910 == arg1 && local20.anInt1900 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(IIII)V")
	public void method1973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].anInt1304 = arg3;
		}
	}

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "(III)V")
	public void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static131.aBoolean159 = true;
		Static131.anInt2796 = arg0;
		Static131.anInt2791 = arg1;
		Static131.anInt2783 = arg2;
		Static131.anInt2802 = -1;
		Static131.anInt2779 = -1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIILclient!jd;IIZ)Z")
	public boolean method1975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub4_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1994(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class63 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class63(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub13(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class63(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub13(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local12;
		} else {
			@Pc(140) Class31 local140 = new Class31(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub13ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub13ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub13(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local140;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIII)V")
	public void method1977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2781 * 128) {
			arg0 = this.anInt2781 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2795 * 128) {
			arg2 = this.anInt2795 * 128 - 1;
		}
		Static131.anInt2790++;
		Static131.anInt2794 = Class4_Sub4_Sub5_Sub1.anIntArray118[arg3];
		Static131.anInt2801 = Class4_Sub4_Sub5_Sub1.anIntArray119[arg3];
		Static131.anInt2800 = Class4_Sub4_Sub5_Sub1.anIntArray118[arg4];
		Static131.anInt2799 = Class4_Sub4_Sub5_Sub1.anIntArray119[arg4];
		Static131.aBooleanArrayArray1 = Static131.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static131.anInt2785 = arg0;
		Static131.anInt2780 = arg1;
		Static131.anInt2788 = arg2;
		Static131.anInt2803 = arg0 / 128;
		Static131.anInt2797 = arg2 / 128;
		Static131.anInt2804 = arg5;
		Static131.anInt2793 = Static131.anInt2803 - 25;
		if (Static131.anInt2793 < 0) {
			Static131.anInt2793 = 0;
		}
		Static131.anInt2786 = Static131.anInt2797 - 25;
		if (Static131.anInt2786 < 0) {
			Static131.anInt2786 = 0;
		}
		Static131.anInt2787 = Static131.anInt2803 + 25;
		if (Static131.anInt2787 > this.anInt2781) {
			Static131.anInt2787 = this.anInt2781;
		}
		Static131.anInt2805 = Static131.anInt2797 + 25;
		if (Static131.anInt2805 > this.anInt2795) {
			Static131.anInt2805 = this.anInt2795;
		}
		this.method1983();
		Static131.anInt2778 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2792; local128 < this.anInt2784; local128++) {
			@Pc(134) Class4_Sub13[][] local134 = this.aClass4_Sub13ArrayArrayArray1[local128];
			for (local136 = Static131.anInt2793; local136 < Static131.anInt2787; local136++) {
				for (local139 = Static131.anInt2786; local139 < Static131.anInt2805; local139++) {
					@Pc(146) Class4_Sub13 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1304 <= arg5 && (Static131.aBooleanArrayArray1[local136 + 25 - Static131.anInt2803][local139 + 25 - Static131.anInt2797] || this.anIntArrayArrayArray7[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean76 = true;
							local146.aBoolean77 = true;
							if (local146.anInt1311 > 0) {
								local146.aBoolean78 = true;
							} else {
								local146.aBoolean78 = false;
							}
							Static131.anInt2778++;
						} else {
							local146.aBoolean76 = false;
							local146.aBoolean77 = false;
							local146.anInt1303 = 0;
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
		for (@Pc(224) int local224 = this.anInt2792; local224 < this.anInt2784; local224++) {
			@Pc(230) Class4_Sub13[][] local230 = this.aClass4_Sub13ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static131.anInt2803 + local139;
				local241 = Static131.anInt2803 - local139;
				if (local237 >= Static131.anInt2793 || local241 < Static131.anInt2787) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static131.anInt2797 + local249;
						local258 = Static131.anInt2797 - local249;
						@Pc(270) Class4_Sub13 local270;
						if (local237 >= Static131.anInt2793) {
							if (local254 >= Static131.anInt2786) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean76) {
									this.method1957(local270, true);
								}
							}
							if (local258 < Static131.anInt2805) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean76) {
									this.method1957(local270, true);
								}
							}
						}
						if (local241 < Static131.anInt2787) {
							if (local254 >= Static131.anInt2786) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean76) {
									this.method1957(local270, true);
								}
							}
							if (local258 < Static131.anInt2805) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean76) {
									this.method1957(local270, true);
								}
							}
						}
						if (Static131.anInt2778 == 0) {
							Static131.aBoolean159 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2792; local136 < this.anInt2784; local136++) {
			@Pc(361) Class4_Sub13[][] local361 = this.aClass4_Sub13ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static131.anInt2803 + local237;
				local249 = Static131.anInt2803 - local237;
				if (local241 >= Static131.anInt2793 || local249 < Static131.anInt2787) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static131.anInt2797 + local254;
						@Pc(389) int local389 = Static131.anInt2797 - local254;
						@Pc(401) Class4_Sub13 local401;
						if (local241 >= Static131.anInt2793) {
							if (local258 >= Static131.anInt2786) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean76) {
									this.method1957(local401, false);
								}
							}
							if (local389 < Static131.anInt2805) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean76) {
									this.method1957(local401, false);
								}
							}
						}
						if (local249 < Static131.anInt2787) {
							if (local258 >= Static131.anInt2786) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean76) {
									this.method1957(local401, false);
								}
							}
							if (local389 < Static131.anInt2805) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean76) {
									this.method1957(local401, false);
								}
							}
						}
						if (Static131.anInt2778 == 0) {
							Static131.aBoolean159 = false;
							return;
						}
					}
				}
			}
		}
		Static131.aBoolean159 = false;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
	public void method1978() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2784; local1++) {
			for (local4 = 0; local4 < this.anInt2781; local4++) {
				for (local7 = 0; local7 < this.anInt2795; local7++) {
					this.aClass4_Sub13ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static131.anInt2782; local4++) {
			for (local7 = 0; local7 < Static131.anIntArray398[local4]; local7++) {
				Static131.aClass74ArrayArray1[local4][local7] = null;
			}
			Static131.anIntArray398[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2789; local7++) {
			this.aClass48Array2[local7] = null;
		}
		this.anInt2789 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static131.aClass48Array3.length; local76++) {
			Static131.aClass48Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(IIII)Z")
	private boolean method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1953(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1961(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1961(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1961(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1961(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public void method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class4_Sub13 local31 = this.aClass4_Sub13ArrayArrayArray1[local10][arg0][arg1] = this.aClass4_Sub13ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1309--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1311; local41++) {
					@Pc(47) Class48 local47 = local31.aClass48Array1[local41];
					if ((local47.anInt1906 >> 29 & 0x3) == 2 && local47.anInt1910 == arg0 && local47.anInt1900 == arg1) {
						local47.anInt1902--;
					}
				}
			}
		}
		if (this.aClass4_Sub13ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass4_Sub13ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub13(0, arg0, arg1);
		}
		this.aClass4_Sub13ArrayArrayArray1[0][arg0][arg1].aClass4_Sub13_1 = local8;
		this.aClass4_Sub13ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIILclient!jd;IIIIII)Z")
	public boolean method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub4_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1994(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(IIII)I")
	public int method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass70_1 != null && local8.aClass70_1.anInt2458 == arg3) {
			return local8.aClass70_1.anInt2453 & 0xFF;
		} else if (local8.aClass35_1 != null && local8.aClass35_1.anInt1343 == arg3) {
			return local8.aClass35_1.anInt1345 & 0xFF;
		} else if (local8.aClass47_1 != null && local8.aClass47_1.anInt1894 == arg3) {
			return local8.aClass47_1.anInt1890 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1311; local56++) {
				if (local8.aClass48Array1[local56].anInt1906 == arg3) {
					return local8.aClass48Array1[local56].anInt1897 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
	private void method1983() {
		@Pc(3) int local3 = Static131.anIntArray398[Static131.anInt2804];
		@Pc(7) Class74[] local7 = Static131.aClass74ArrayArray1[Static131.anInt2804];
		Static131.anInt2798 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class74 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2568 == 1) {
				local27 = local16.anInt2574 + 25 - Static131.anInt2803;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2581 + 25 - Static131.anInt2797;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2575 + 25 - Static131.anInt2797;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static131.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static131.anInt2785 - local16.anInt2570;
						if (local79 > 32) {
							local16.anInt2578 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2578 = 2;
							local79 = -local79;
						}
						local16.anInt2571 = (local16.anInt2573 - Static131.anInt2788 << 8) / local79;
						local16.anInt2569 = (local16.anInt2583 - Static131.anInt2788 << 8) / local79;
						local16.anInt2567 = (local16.anInt2572 - Static131.anInt2780 << 8) / local79;
						local16.anInt2579 = (local16.anInt2588 - Static131.anInt2780 << 8) / local79;
						Static131.aClass74Array1[Static131.anInt2798++] = local16;
					}
				}
			} else if (local16.anInt2568 == 2) {
				local27 = local16.anInt2581 + 25 - Static131.anInt2797;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2574 + 25 - Static131.anInt2803;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2576 + 25 - Static131.anInt2803;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static131.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static131.anInt2788 - local16.anInt2573;
						if (local79 > 32) {
							local16.anInt2578 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2578 = 4;
							local79 = -local79;
						}
						local16.anInt2577 = (local16.anInt2570 - Static131.anInt2785 << 8) / local79;
						local16.anInt2585 = (local16.anInt2584 - Static131.anInt2785 << 8) / local79;
						local16.anInt2567 = (local16.anInt2572 - Static131.anInt2780 << 8) / local79;
						local16.anInt2579 = (local16.anInt2588 - Static131.anInt2780 << 8) / local79;
						Static131.aClass74Array1[Static131.anInt2798++] = local16;
					}
				}
			} else if (local16.anInt2568 == 4) {
				local27 = local16.anInt2572 - Static131.anInt2780;
				if (local27 > 128) {
					local40 = local16.anInt2581 + 25 - Static131.anInt2797;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2575 + 25 - Static131.anInt2797;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2574 + 25 - Static131.anInt2803;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2576 + 25 - Static131.anInt2803;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static131.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2578 = 5;
							local16.anInt2577 = (local16.anInt2570 - Static131.anInt2785 << 8) / local27;
							local16.anInt2585 = (local16.anInt2584 - Static131.anInt2785 << 8) / local27;
							local16.anInt2571 = (local16.anInt2573 - Static131.anInt2788 << 8) / local27;
							local16.anInt2569 = (local16.anInt2583 - Static131.anInt2788 << 8) / local27;
							Static131.aClass74Array1[Static131.anInt2798++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "(III)V")
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1311; local13++) {
			@Pc(19) Class48 local19 = local8.aClass48Array1[local13];
			if ((local19.anInt1906 >> 29 & 0x3) == 2 && local19.anInt1910 == arg1 && local19.anInt1900 == arg2) {
				this.method1971(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!hd;IIIIII)V")
	private void method1985(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray144.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray144[local5] - Static131.anInt2785;
			local20 = arg0.anIntArray143[local5] - Static131.anInt2780;
			local27 = arg0.anIntArray142[local5] - Static131.anInt2788;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray138 != null) {
				Static44.anIntArray139[local5] = local37;
				Static44.anIntArray147[local5] = local59;
				Static44.anIntArray141[local5] = local69;
			}
			Static44.anIntArray137[local5] = Static37.anInt1076 + (local37 << 9) / local69;
			Static44.anIntArray140[local5] = Static37.anInt1077 + (local59 << 9) / local69;
		}
		Static37.anInt1075 = 0;
		local3 = arg0.anIntArray136.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray136[local13];
			local27 = arg0.anIntArray145[local13];
			local37 = arg0.anIntArray135[local13];
			@Pc(142) int local142 = Static44.anIntArray137[local20];
			@Pc(146) int local146 = Static44.anIntArray137[local27];
			@Pc(150) int local150 = Static44.anIntArray137[local37];
			@Pc(154) int local154 = Static44.anIntArray140[local20];
			@Pc(158) int local158 = Static44.anIntArray140[local27];
			@Pc(162) int local162 = Static44.anIntArray140[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static37.aBoolean64 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static37.anInt1073 || local146 > Static37.anInt1073 || local150 > Static37.anInt1073) {
					Static37.aBoolean64 = true;
				}
				if (Static131.aBoolean159 && this.method1987(Static131.anInt2791, Static131.anInt2783, local154, local158, local162, local142, local146, local150)) {
					Static131.anInt2802 = arg5;
					Static131.anInt2779 = arg6;
				}
				if (arg0.anIntArray138 == null || arg0.anIntArray138[local13] == -1) {
					if (arg0.anIntArray134[local13] != 12345678) {
						Static37.method721(local154, local158, local162, local142, local146, local150, arg0.anIntArray134[local13], arg0.anIntArray133[local13], arg0.anIntArray146[local13]);
					}
				} else if (Static131.aBoolean158) {
					@Pc(364) int local364 = Static37.anInterface1_1.method777(arg0.anIntArray138[local13]);
					Static37.method721(local154, local158, local162, local142, local146, local150, Static131.method1989(local364, arg0.anIntArray134[local13]), Static131.method1989(local364, arg0.anIntArray133[local13]), Static131.method1989(local364, arg0.anIntArray146[local13]));
				} else if (arg0.aBoolean71) {
					Static37.method725(local154, local158, local162, local142, local146, local150, arg0.anIntArray134[local13], arg0.anIntArray133[local13], arg0.anIntArray146[local13], Static44.anIntArray139[0], Static44.anIntArray139[1], Static44.anIntArray139[3], Static44.anIntArray147[0], Static44.anIntArray147[1], Static44.anIntArray147[3], Static44.anIntArray141[0], Static44.anIntArray141[1], Static44.anIntArray141[3], arg0.anIntArray138[local13]);
				} else {
					Static37.method725(local154, local158, local162, local142, local146, local150, arg0.anIntArray134[local13], arg0.anIntArray133[local13], arg0.anIntArray146[local13], Static44.anIntArray139[local20], Static44.anIntArray139[local27], Static44.anIntArray139[local37], Static44.anIntArray147[local20], Static44.anIntArray147[local27], Static44.anIntArray147[local37], Static44.anIntArray141[local20], Static44.anIntArray141[local27], Static44.anIntArray141[local37], arg0.anIntArray138[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILclient!jd;ILclient!jd;Lclient!jd;)V")
	public void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub4_Sub3 arg6, @OriginalArg(7) Class4_Sub4_Sub3 arg7) {
		@Pc(3) Class57 local3 = new Class57();
		local3.aClass4_Sub4_Sub3_7 = arg4;
		local3.anInt2156 = arg1 * 128 + 64;
		local3.anInt2159 = arg2 * 128 + 64;
		local3.anInt2158 = arg3;
		local3.anInt2161 = arg5;
		local3.aClass4_Sub4_Sub3_5 = arg6;
		local3.aClass4_Sub4_Sub3_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class4_Sub13 local43 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1311; local47++) {
				if ((local43.aClass48Array1[local47].anInt1897 & 0x100) == 256 && local43.aClass48Array1[local47].aClass4_Sub4_Sub3_4 instanceof Class4_Sub4_Sub3_Sub7) {
					@Pc(71) Class4_Sub4_Sub3_Sub7 local71 = (Class4_Sub4_Sub3_Sub7) local43.aClass48Array1[local47].aClass4_Sub4_Sub3_4;
					local71.method1767();
					if (local71.anInt2514 > local34) {
						local34 = local71.anInt2514;
					}
				}
			}
		}
		local3.anInt2157 = local34;
		if (this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub13(arg0, arg1, arg2);
		}
		this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass57_1 = local3;
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(III)I")
	public int method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1311; local14++) {
			@Pc(20) Class48 local20 = local8.aClass48Array1[local14];
			if ((local20.anInt1906 >> 29 & 0x3) == 2 && local20.anInt1910 == arg1 && local20.anInt1900 == arg2) {
				return local20.anInt1906;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!rf;IIIIIII)V")
	private void method1991(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static131.anInt2785;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static131.anInt2788;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray7[arg1][arg6][arg7] - Static131.anInt2780;
		@Pc(51) int local51 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static131.anInt2780;
		@Pc(66) int local66 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static131.anInt2780;
		@Pc(79) int local79 = this.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static131.anInt2780;
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
		@Pc(279) int local279 = Static37.anInt1076 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static37.anInt1077 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static37.anInt1076 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static37.anInt1077 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static37.anInt1076 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static37.anInt1077 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static37.anInt1076 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static37.anInt1077 + (local89 << 9) / local265;
		Static37.anInt1075 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static37.aBoolean64 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static37.anInt1073 || local327 > Static37.anInt1073 || local295 > Static37.anInt1073) {
				Static37.aBoolean64 = true;
			}
			if (Static131.aBoolean159 && this.method1987(Static131.anInt2791, Static131.anInt2783, local319, local335, local303, local311, local327, local295)) {
				Static131.anInt2802 = arg6;
				Static131.anInt2779 = arg7;
			}
			if (arg0.anInt2328 == -1) {
				if (arg0.anInt2323 != 12345678) {
					Static37.method721(local319, local335, local303, local311, local327, local295, arg0.anInt2323, arg0.anInt2330, arg0.anInt2335);
				}
			} else if (Static131.aBoolean158) {
				local472 = Static37.anInterface1_1.method777(arg0.anInt2328);
				Static37.method721(local319, local335, local303, local311, local327, local295, Static131.method1989(local472, arg0.anInt2323), Static131.method1989(local472, arg0.anInt2330), Static131.method1989(local472, arg0.anInt2335));
			} else if (arg0.aBoolean139) {
				Static37.method725(local319, local335, local303, local311, local327, local295, arg0.anInt2323, arg0.anInt2330, arg0.anInt2335, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2328);
			} else {
				Static37.method725(local319, local335, local303, local311, local327, local295, arg0.anInt2323, arg0.anInt2330, arg0.anInt2335, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2328);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static37.aBoolean64 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static37.anInt1073 || local295 > Static37.anInt1073 || local327 > Static37.anInt1073) {
			Static37.aBoolean64 = true;
		}
		if (Static131.aBoolean159 && this.method1987(Static131.anInt2791, Static131.anInt2783, local287, local303, local335, local279, local295, local327)) {
			Static131.anInt2802 = arg6;
			Static131.anInt2779 = arg7;
		}
		if (arg0.anInt2328 != -1) {
			if (!Static131.aBoolean158) {
				Static37.method725(local287, local303, local335, local279, local295, local327, arg0.anInt2326, arg0.anInt2335, arg0.anInt2330, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2328);
				return;
			}
			local472 = Static37.anInterface1_1.method777(arg0.anInt2328);
			Static37.method721(local287, local303, local335, local279, local295, local327, Static131.method1989(local472, arg0.anInt2326), Static131.method1989(local472, arg0.anInt2335), Static131.method1989(local472, arg0.anInt2330));
		} else if (arg0.anInt2326 != 12345678) {
			Static37.method721(local287, local303, local335, local279, local295, local327, arg0.anInt2326, arg0.anInt2335, arg0.anInt2330);
			return;
		}
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(III)Lclient!me;")
	public Class47 method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass47_1 == null ? null : local8.aClass47_1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILclient!jd;II)V")
	public void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class47 local6 = new Class47();
		local6.aClass4_Sub4_Sub3_3 = arg4;
		local6.anInt1887 = arg1 * 128 + 64;
		local6.anInt1896 = arg2 * 128 + 64;
		local6.anInt1888 = arg3;
		local6.anInt1894 = arg5;
		local6.anInt1890 = arg6;
		if (this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub13(arg0, arg1, arg2);
		}
		this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass47_1 = local6;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIILclient!jd;IZII)Z")
	private boolean method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub4_Sub3 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2781 || local4 >= this.anInt2795) {
					return false;
				}
				@Pc(28) Class4_Sub13 local28 = this.aClass4_Sub13ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1311 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class48 local52 = new Class48();
		local52.anInt1906 = arg11;
		local52.anInt1897 = arg12;
		local52.anInt1902 = arg0;
		local52.anInt1903 = arg5;
		local52.anInt1905 = arg6;
		local52.anInt1904 = arg7;
		local52.aClass4_Sub4_Sub3_4 = arg8;
		local52.anInt1898 = arg9;
		local52.anInt1910 = arg1;
		local52.anInt1900 = arg2;
		local52.anInt1912 = arg1 + arg3 - 1;
		local52.anInt1901 = arg2 + arg4 - 1;
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
					if (this.aClass4_Sub13ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass4_Sub13ArrayArrayArray1[local130][local98][local101] = new Class4_Sub13(local130, local98, local101);
					}
				}
				@Pc(166) Class4_Sub13 local166 = this.aClass4_Sub13ArrayArrayArray1[arg0][local98][local101];
				local166.aClass48Array1[local166.anInt1311] = local52;
				local166.anIntArray163[local166.anInt1311] = local104;
				local166.anInt1302 |= local104;
				local166.anInt1311++;
			}
		}
		if (arg10) {
			this.aClass48Array2[this.anInt2789++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIILclient!jd;Lclient!jd;IIII)V")
	public void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub3 arg4, @OriginalArg(5) Class4_Sub4_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class70 local8 = new Class70();
		local8.anInt2458 = arg8;
		local8.anInt2453 = arg9;
		local8.anInt2452 = arg1 * 128 + 64;
		local8.anInt2450 = arg2 * 128 + 64;
		local8.anInt2454 = arg3;
		local8.aClass4_Sub4_Sub3_8 = arg4;
		local8.aClass4_Sub4_Sub3_9 = arg5;
		local8.anInt2463 = arg6;
		local8.anInt2464 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass4_Sub13ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass4_Sub13ArrayArrayArray1[local45][arg1][arg2] = new Class4_Sub13(local45, arg1, arg2);
			}
		}
		this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2].aClass70_1 = local8;
	}

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "(III)V")
	public void method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "(III)V")
	public void method1997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass35_1 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIIIII)V")
	public void method1998(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class63 local14 = local8.aClass63_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2336;
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
		@Pc(59) Class31 local59 = local8.aClass31_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1169;
		@Pc(68) int local68 = local59.anInt1171;
		@Pc(71) int local71 = local59.anInt1168;
		@Pc(74) int local74 = local59.anInt1170;
		@Pc(79) int[] local79 = this.anIntArrayArray29[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray28[local68];
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

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "(III)V")
	public void method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass70_1 = null;
		}
	}

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "(III)Lclient!td;")
	public Class70 method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub13 local8 = this.aClass4_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass70_1;
	}
}
