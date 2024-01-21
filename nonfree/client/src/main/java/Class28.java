import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class28 {

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "[Lclient!qb;")
	private final Class59[] aClass59Array1 = new Class59[5000];

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
	private int anInt1135 = 0;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	private int anInt1152 = 0;

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray7 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray6 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	private final int anInt1129;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	private final int anInt1150;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	private final int anInt1143;

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "[[[Lclient!la;")
	private final Class4_Sub14[][][] aClass4_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(III[[[I)V")
	public Class28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1129 = arg0;
		this.anInt1150 = arg1;
		this.anInt1143 = arg2;
		this.aClass4_Sub14ArrayArrayArray1 = new Class4_Sub14[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray4 = arg3;
		this.method782();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
	public void method757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(III)Lclient!ae;")
	public Class6 method758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass6_1 == null ? null : local8.aClass6_1;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(III)I")
	public int method759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass6_1 == null ? 0 : local8.aClass6_1.anInt65;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)I")
	public int method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass14_1 != null && local8.aClass14_1.anInt456 == arg3) {
			return local8.aClass14_1.anInt460 & 0xFF;
		} else if (local8.aClass24_1 != null && local8.aClass24_1.anInt935 == arg3) {
			return local8.aClass24_1.anInt936 & 0xFF;
		} else if (local8.aClass6_1 != null && local8.aClass6_1.anInt65 == arg3) {
			return local8.aClass6_1.anInt64 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1717; local56++) {
				if (local8.aClass59Array3[local56].anInt2274 == arg3) {
					return local8.aClass59Array3[local56].anInt2279 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(III)Lclient!fe;")
	public Class24 method761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass24_1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!qb;)V")
	private void method762(@OriginalArg(0) Class59 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2275; local2 <= arg0.anInt2282; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2269; local6 <= arg0.anInt2277; local6++) {
				@Pc(17) Class4_Sub14 local17 = this.aClass4_Sub14ArrayArrayArray1[arg0.anInt2271][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1717; local21++) {
						if (local17.aClass59Array3[local21] == arg0) {
							local17.anInt1717--;
							for (local36 = local21; local36 < local17.anInt1717; local36++) {
								local17.aClass59Array3[local36] = local17.aClass59Array3[local36 + 1];
								local17.anIntArray177[local36] = local17.anIntArray177[local36 + 1];
							}
							local17.aClass59Array3[local17.anInt1717] = null;
							break;
						}
					}
					local17.anInt1715 = 0;
					for (local36 = 0; local36 < local17.anInt1717; local36++) {
						local17.anInt1715 |= local17.anIntArray177[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIII)Z")
	private boolean method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method791(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method799(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2] - arg3, local15 + 1) && this.method799(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method799(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method799(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "(III)Lclient!cf;")
	public Class14 method764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass14_1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!le;IIIIII)V")
	public void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class24 local6 = new Class24();
		local6.anInt935 = arg9;
		local6.anInt936 = arg10;
		local6.anInt937 = arg1 * 128 + arg7 + 64;
		local6.anInt927 = arg2 * 128 + arg8 + 64;
		local6.anInt941 = arg3;
		local6.aClass4_Sub4_Sub1_4 = arg4;
		local6.anInt925 = arg5;
		local6.anInt931 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass4_Sub14ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass4_Sub14ArrayArrayArray1[local44][arg1][arg2] = new Class4_Sub14(local44, arg1, arg2);
			}
		}
		this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local6;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Z")
	private boolean method766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static44.anInt1134) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5;
			if (!this.method799(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method799(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method799(local21, local167, local195)) {
				return false;
			} else if (this.method799(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method791(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method799(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5, local21 + 1) && this.method799(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method799(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method799(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!la;Z)V")
	private void method767(@OriginalArg(0) Class4_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		Static44.aClass70_10.method1931(arg0);
		while (true) {
			@Pc(8) Class4_Sub14 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class4_Sub14[][] local31;
			@Pc(49) Class4_Sub14 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class14 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class59 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class4_Sub14 var35;
										while (true) {
											do {
												local8 = (Class4_Sub14) Static44.aClass70_10.method1932();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean63);
											local17 = local8.anInt1716;
											local20 = local8.anInt1720;
											local23 = local8.anInt1722;
											local26 = local8.anInt1719;
											local31 = this.aClass4_Sub14ArrayArrayArray1[local23];
											if (!local8.aBoolean65) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass4_Sub14ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean63) {
														continue;
													}
												}
												if (local17 <= Static44.anInt1131 && local17 > Static44.anInt1132) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean63 && (local49.aBoolean65 || (local8.anInt1715 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static44.anInt1131 && local17 < Static44.anInt1151 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean63 && (local49.aBoolean65 || (local8.anInt1715 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static44.anInt1128 && local20 > Static44.anInt1137) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean63 && (local49.aBoolean65 || (local8.anInt1715 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static44.anInt1128 && local20 < Static44.anInt1139 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean63 && (local49.aBoolean65 || (local8.anInt1715 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean65 = false;
											if (local8.aClass4_Sub14_1 != null) {
												local49 = local8.aClass4_Sub14_1;
												if (local49.aClass55_1 == null) {
													if (local49.aClass27_1 != null && !this.method791(0, local17, local20)) {
														this.method787(local49.aClass27_1, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local17, local20);
													}
												} else if (!this.method791(0, local17, local20)) {
													this.method778(local49.aClass55_1, 0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local17, local20);
												}
												@Pc(225) Class14 local225 = local49.aClass14_1;
												if (local225 != null) {
													local225.aClass4_Sub4_Sub1_3.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local225.anInt458 - Static44.anInt1141, local225.anInt468 - Static44.anInt1149, local225.anInt461 - Static44.anInt1142, local225.anInt456);
												}
												for (local251 = 0; local251 < local49.anInt1717; local251++) {
													var12 = local49.aClass59Array3[local251];
													if (var12 != null) {
														var12.aClass4_Sub4_Sub1_8.method1983(var12.anInt2276, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, var12.anInt2273 - Static44.anInt1141, var12.anInt2278 - Static44.anInt1149, var12.anInt2270 - Static44.anInt1142, var12.anInt2274);
													}
												}
											}
											var24 = false;
											if (local8.aClass55_1 == null) {
												if (local8.aClass27_1 != null && !this.method791(local26, local17, local20)) {
													var24 = true;
													this.method787(local8.aClass27_1, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local17, local20);
												}
											} else if (!this.method791(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass55_1.anInt1970 != 12345678 || Static44.aBoolean42 && local23 <= Static44.anInt1130) {
													this.method778(local8.aClass55_1, local26, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class14 local350 = local8.aClass14_1;
											@Pc(353) Class24 local353 = local8.aClass24_1;
											if (local350 != null || local353 != null) {
												if (Static44.anInt1131 == local17) {
													var23++;
												} else if (Static44.anInt1131 < local17) {
													var23 += 2;
												}
												if (Static44.anInt1128 == local20) {
													var23 += 3;
												} else if (Static44.anInt1128 > local20) {
													var23 += 6;
												}
												local251 = Static44.anIntArray107[var23];
												local8.anInt1725 = Static44.anIntArray104[var23];
											}
											if (local350 != null) {
												if ((local350.anInt464 & Static44.anIntArray102[var23]) == 0) {
													local8.anInt1721 = 0;
												} else if (local350.anInt464 == 16) {
													local8.anInt1721 = 3;
													local8.anInt1724 = Static44.anIntArray103[var23];
													local8.anInt1723 = 3 - local8.anInt1724;
												} else if (local350.anInt464 == 32) {
													local8.anInt1721 = 6;
													local8.anInt1724 = Static44.anIntArray106[var23];
													local8.anInt1723 = 6 - local8.anInt1724;
												} else if (local350.anInt464 == 64) {
													local8.anInt1721 = 12;
													local8.anInt1724 = Static44.anIntArray108[var23];
													local8.anInt1723 = 12 - local8.anInt1724;
												} else {
													local8.anInt1721 = 9;
													local8.anInt1724 = Static44.anIntArray105[var23];
													local8.anInt1723 = 9 - local8.anInt1724;
												}
												if ((local350.anInt464 & local251) != 0 && !this.method784(local26, local17, local20, local350.anInt464)) {
													local350.aClass4_Sub4_Sub1_3.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local350.anInt458 - Static44.anInt1141, local350.anInt468 - Static44.anInt1149, local350.anInt461 - Static44.anInt1142, local350.anInt456);
												}
												if ((local350.anInt462 & local251) != 0 && !this.method784(local26, local17, local20, local350.anInt462)) {
													local350.aClass4_Sub4_Sub1_2.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local350.anInt458 - Static44.anInt1141, local350.anInt468 - Static44.anInt1149, local350.anInt461 - Static44.anInt1142, local350.anInt456);
												}
											}
											if (local353 != null && !this.method763(local26, local17, local20, local353.aClass4_Sub4_Sub1_4.anInt2816)) {
												if ((local353.anInt925 & local251) != 0) {
													local353.aClass4_Sub4_Sub1_4.method1983(local353.anInt931, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local353.anInt937 - Static44.anInt1141, local353.anInt941 - Static44.anInt1149, local353.anInt927 - Static44.anInt1142, local353.anInt935);
												} else if ((local353.anInt925 & 0x300) != 0) {
													local588 = local353.anInt937 - Static44.anInt1141;
													local593 = local353.anInt941 - Static44.anInt1149;
													local598 = local353.anInt927 - Static44.anInt1142;
													local601 = local353.anInt931;
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
													if ((local353.anInt925 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static44.anIntArray101[local601];
														local645 = local598 + Static44.anIntArray97[local601];
														local353.aClass4_Sub4_Sub1_4.method1983(local601 * 512 + 256, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local639, local593, local645, local353.anInt935);
													}
													if ((local353.anInt925 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static44.anIntArray99[local601];
														local645 = local598 + Static44.anIntArray98[local601];
														local353.aClass4_Sub4_Sub1_4.method1983(local601 * 512 + 1280 & 0x7FF, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local639, local593, local645, local353.anInt935);
													}
												}
											}
											if (var24) {
												@Pc(706) Class6 local706 = local8.aClass6_1;
												if (local706 != null) {
													local706.aClass4_Sub4_Sub1_1.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local706.anInt68 - Static44.anInt1141, local706.anInt63 - Static44.anInt1149, local706.anInt70 - Static44.anInt1142, local706.anInt65);
												}
												@Pc(733) Class46 local733 = local8.aClass46_1;
												if (local733 != null && local733.anInt1843 == 0) {
													if (local733.aClass4_Sub4_Sub1_6 != null) {
														local733.aClass4_Sub4_Sub1_6.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local733.anInt1845 - Static44.anInt1141, local733.anInt1841 - Static44.anInt1149, local733.anInt1844 - Static44.anInt1142, local733.anInt1840);
													}
													if (local733.aClass4_Sub4_Sub1_5 != null) {
														local733.aClass4_Sub4_Sub1_5.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local733.anInt1845 - Static44.anInt1141, local733.anInt1841 - Static44.anInt1149, local733.anInt1844 - Static44.anInt1142, local733.anInt1840);
													}
													if (local733.aClass4_Sub4_Sub1_7 != null) {
														local733.aClass4_Sub4_Sub1_7.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local733.anInt1845 - Static44.anInt1141, local733.anInt1841 - Static44.anInt1149, local733.anInt1844 - Static44.anInt1142, local733.anInt1840);
													}
												}
											}
											local588 = local8.anInt1715;
											if (local588 != 0) {
												if (local17 < Static44.anInt1131 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean63) {
														Static44.aClass70_10.method1931(var35);
													}
												}
												if (local20 < Static44.anInt1128 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean63) {
														Static44.aClass70_10.method1931(var35);
													}
												}
												if (local17 > Static44.anInt1131 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean63) {
														Static44.aClass70_10.method1931(var35);
													}
												}
												if (local20 > Static44.anInt1128 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean63) {
														Static44.aClass70_10.method1931(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1721 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1717; var23++) {
												if (local8.aClass59Array3[var23].anInt2281 != Static44.anInt1134 && (local8.anIntArray177[var23] & local8.anInt1721) == local8.anInt1724) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass14_1;
												if (!this.method784(local26, local17, local20, local952.anInt464)) {
													local952.aClass4_Sub4_Sub1_3.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local952.anInt458 - Static44.anInt1141, local952.anInt468 - Static44.anInt1149, local952.anInt461 - Static44.anInt1142, local952.anInt456);
												}
												local8.anInt1721 = 0;
											}
										}
										if (!local8.aBoolean64) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt1717;
											local8.aBoolean64 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass59Array3[local251];
												if (var12.anInt2281 != Static44.anInt1134) {
													for (local1011 = var12.anInt2275; local1011 <= var12.anInt2282; local1011++) {
														for (local588 = var12.anInt2269; local588 <= var12.anInt2277; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean65) {
																local8.aBoolean64 = true;
																continue label568;
															}
															if (var35.anInt1721 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt2275) {
																	local598++;
																}
																if (local1011 < var12.anInt2282) {
																	local598 += 4;
																}
																if (local588 > var12.anInt2269) {
																	local598 += 8;
																}
																if (local588 < var12.anInt2277) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt1721) == local8.anInt1723) {
																	local8.aBoolean64 = true;
																	continue label568;
																}
															}
														}
													}
													Static44.aClass59Array2[var23++] = var12;
													local588 = Static44.anInt1131 - var12.anInt2275;
													local593 = var12.anInt2282 - Static44.anInt1131;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static44.anInt1128 - var12.anInt2269;
													local601 = var12.anInt2277 - Static44.anInt1128;
													if (local601 > local598) {
														var12.anInt2280 = local588 + local601;
													} else {
														var12.anInt2280 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class59 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static44.aClass59Array2[local588];
													if (local1135.anInt2281 != Static44.anInt1134) {
														if (local1135.anInt2280 > local1126) {
															local1126 = local1135.anInt2280;
															local1011 = local588;
														} else if (local1135.anInt2280 == local1126) {
															local598 = local1135.anInt2273 - Static44.anInt1141;
															local601 = local1135.anInt2270 - Static44.anInt1142;
															local610 = Static44.aClass59Array2[local1011].anInt2273 - Static44.anInt1141;
															var19 = Static44.aClass59Array2[local1011].anInt2270 - Static44.anInt1142;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static44.aClass59Array2[local1011];
												local1135.anInt2281 = Static44.anInt1134;
												if (!this.method766(local26, local1135.anInt2275, local1135.anInt2282, local1135.anInt2269, local1135.anInt2277, local1135.aClass4_Sub4_Sub1_8.anInt2816)) {
													local1135.aClass4_Sub4_Sub1_8.method1983(local1135.anInt2276, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local1135.anInt2273 - Static44.anInt1141, local1135.anInt2278 - Static44.anInt1149, local1135.anInt2270 - Static44.anInt1142, local1135.anInt2274);
												}
												for (local598 = local1135.anInt2275; local598 <= local1135.anInt2282; local598++) {
													for (local601 = local1135.anInt2269; local601 <= local1135.anInt2277; local601++) {
														@Pc(1260) Class4_Sub14 local1260 = local31[local598][local601];
														if (local1260.anInt1721 != 0) {
															Static44.aClass70_10.method1931(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean63) {
															Static44.aClass70_10.method1931(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean64) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean64 = false;
											break;
										}
									}
								} while (!local8.aBoolean63);
							} while (local8.anInt1721 != 0);
							if (local17 > Static44.anInt1131 || local17 <= Static44.anInt1132) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean63);
						if (local17 < Static44.anInt1131 || local17 >= Static44.anInt1151 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean63);
					if (local20 > Static44.anInt1128 || local20 <= Static44.anInt1137) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean63);
				if (local20 < Static44.anInt1128 || local20 >= Static44.anInt1139 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean63);
			local8.aBoolean63 = false;
			Static44.anInt1147--;
			@Pc(1402) Class46 local1402 = local8.aClass46_1;
			if (local1402 != null && local1402.anInt1843 != 0) {
				if (local1402.aClass4_Sub4_Sub1_6 != null) {
					local1402.aClass4_Sub4_Sub1_6.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local1402.anInt1845 - Static44.anInt1141, local1402.anInt1841 - Static44.anInt1149 - local1402.anInt1843, local1402.anInt1844 - Static44.anInt1142, local1402.anInt1840);
				}
				if (local1402.aClass4_Sub4_Sub1_5 != null) {
					local1402.aClass4_Sub4_Sub1_5.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local1402.anInt1845 - Static44.anInt1141, local1402.anInt1841 - Static44.anInt1149 - local1402.anInt1843, local1402.anInt1844 - Static44.anInt1142, local1402.anInt1840);
				}
				if (local1402.aClass4_Sub4_Sub1_7 != null) {
					local1402.aClass4_Sub4_Sub1_7.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local1402.anInt1845 - Static44.anInt1141, local1402.anInt1841 - Static44.anInt1149 - local1402.anInt1843, local1402.anInt1844 - Static44.anInt1142, local1402.anInt1840);
				}
			}
			if (local8.anInt1725 != 0) {
				@Pc(1497) Class24 local1497 = local8.aClass24_1;
				if (local1497 != null && !this.method763(local26, local17, local20, local1497.aClass4_Sub4_Sub1_4.anInt2816)) {
					if ((local1497.anInt925 & local8.anInt1725) != 0) {
						local1497.aClass4_Sub4_Sub1_4.method1983(local1497.anInt931, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local1497.anInt937 - Static44.anInt1141, local1497.anInt941 - Static44.anInt1149, local1497.anInt927 - Static44.anInt1142, local1497.anInt935);
					} else if ((local1497.anInt925 & 0x300) != 0) {
						local251 = local1497.anInt937 - Static44.anInt1141;
						local1126 = local1497.anInt941 - Static44.anInt1149;
						local1011 = local1497.anInt927 - Static44.anInt1142;
						local588 = local1497.anInt931;
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
						if ((local1497.anInt925 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static44.anIntArray101[local588];
							local610 = local1011 + Static44.anIntArray97[local588];
							local1497.aClass4_Sub4_Sub1_4.method1983(local588 * 512 + 256, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local601, local1126, local610, local1497.anInt935);
						}
						if ((local1497.anInt925 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static44.anIntArray99[local588];
							local610 = local1011 + Static44.anIntArray98[local588];
							local1497.aClass4_Sub4_Sub1_4.method1983(local588 * 512 + 1280 & 0x7FF, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local601, local1126, local610, local1497.anInt935);
						}
					}
				}
				local952 = local8.aClass14_1;
				if (local952 != null) {
					if ((local952.anInt462 & local8.anInt1725) != 0 && !this.method784(local26, local17, local20, local952.anInt462)) {
						local952.aClass4_Sub4_Sub1_2.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local952.anInt458 - Static44.anInt1141, local952.anInt468 - Static44.anInt1149, local952.anInt461 - Static44.anInt1142, local952.anInt456);
					}
					if ((local952.anInt464 & local8.anInt1725) != 0 && !this.method784(local26, local17, local20, local952.anInt464)) {
						local952.aClass4_Sub4_Sub1_3.method1983(0, Static44.anInt1146, Static44.anInt1140, Static44.anInt1148, Static44.anInt1127, local952.anInt458 - Static44.anInt1141, local952.anInt468 - Static44.anInt1149, local952.anInt461 - Static44.anInt1142, local952.anInt456);
					}
				}
			}
			@Pc(1755) Class4_Sub14 local1755;
			if (local23 < this.anInt1129 - 1) {
				local1755 = this.aClass4_Sub14ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean63) {
					Static44.aClass70_10.method1931(local1755);
				}
			}
			if (local17 < Static44.anInt1131) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean63) {
					Static44.aClass70_10.method1931(local1755);
				}
			}
			if (local20 < Static44.anInt1128) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean63) {
					Static44.aClass70_10.method1931(local1755);
				}
			}
			if (local17 > Static44.anInt1131) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean63) {
					Static44.aClass70_10.method1931(local1755);
				}
			}
			if (local20 > Static44.anInt1128) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean63) {
					Static44.aClass70_10.method1931(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!u;III)V")
	private void method769(@OriginalArg(0) Class4_Sub4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class4_Sub14 local14;
		@Pc(29) Class4_Sub4_Sub1_Sub7 local29;
		if (arg2 < this.anInt1150) {
			local14 = this.aClass4_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass4_Sub4_Sub1_1 instanceof Class4_Sub4_Sub1_Sub7) {
				local29 = (Class4_Sub4_Sub1_Sub7) local14.aClass6_1.aClass4_Sub4_Sub1_1;
				Static118.method1995(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1150) {
			local14 = this.aClass4_Sub14ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass4_Sub4_Sub1_1 instanceof Class4_Sub4_Sub1_Sub7) {
				local29 = (Class4_Sub4_Sub1_Sub7) local14.aClass6_1.aClass4_Sub4_Sub1_1;
				Static118.method1995(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1150 && arg3 < this.anInt1143) {
			local14 = this.aClass4_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass4_Sub4_Sub1_1 instanceof Class4_Sub4_Sub1_Sub7) {
				local29 = (Class4_Sub4_Sub1_Sub7) local14.aClass6_1.aClass4_Sub4_Sub1_1;
				Static118.method1995(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1150 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass4_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass4_Sub4_Sub1_1 instanceof Class4_Sub4_Sub1_Sub7) {
			local29 = (Class4_Sub4_Sub1_Sub7) local14.aClass6_1.aClass4_Sub4_Sub1_1;
			Static118.method1995(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIII)V")
	public void method770(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class55 local14 = local8.aClass55_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1965;
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
		@Pc(59) Class27 local59 = local8.aClass27_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1043;
		@Pc(68) int local68 = local59.anInt1042;
		@Pc(71) int local71 = local59.anInt1044;
		@Pc(74) int local74 = local59.anInt1041;
		@Pc(79) int[] local79 = this.anIntArrayArray7[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray6[local68];
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

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(III)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass14_1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!u;IIIII)V")
	private void method772(@OriginalArg(0) Class4_Sub4_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1129) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1150) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1143 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class4_Sub14 local66 = this.aClass4_Sub14ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray4[local17][local24][local34] + this.anIntArrayArrayArray4[local17][local24 + 1][local34] + this.anIntArrayArrayArray4[local17][local24][local34 + 1] + this.anIntArrayArrayArray4[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray4[arg1][arg2][arg3] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class14 local163 = local66.aClass14_1;
									if (local163 != null) {
										@Pc(173) Class4_Sub4_Sub1_Sub7 local173;
										if (local163.aClass4_Sub4_Sub1_3 instanceof Class4_Sub4_Sub1_Sub7) {
											local173 = (Class4_Sub4_Sub1_Sub7) local163.aClass4_Sub4_Sub1_3;
											Static118.method1995(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass4_Sub4_Sub1_2 instanceof Class4_Sub4_Sub1_Sub7) {
											local173 = (Class4_Sub4_Sub1_Sub7) local163.aClass4_Sub4_Sub1_2;
											Static118.method1995(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1717; local237++) {
										@Pc(243) Class59 local243 = local66.aClass59Array3[local237];
										if (local243 != null && local243.aClass4_Sub4_Sub1_8 instanceof Class4_Sub4_Sub1_Sub7) {
											@Pc(253) Class4_Sub4_Sub1_Sub7 local253 = (Class4_Sub4_Sub1_Sub7) local243.aClass4_Sub4_Sub1_8;
											@Pc(261) int local261 = local243.anInt2282 + 1 - local243.anInt2275;
											@Pc(269) int local269 = local243.anInt2277 + 1 - local243.anInt2269;
											Static118.method1995(arg0, local253, (local243.anInt2275 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2269 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "(III)Lclient!qb;")
	public Class59 method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1717; local14++) {
			@Pc(20) Class59 local20 = local8.aClass59Array3[local14];
			if ((local20.anInt2274 >> 29 & 0x3) == 2 && local20.anInt2275 == arg1 && local20.anInt2269 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIILclient!le;IIZ)Z")
	public boolean method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub4_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method797(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
	public void method775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1150 * 128) {
			arg0 = this.anInt1150 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1143 * 128) {
			arg2 = this.anInt1143 * 128 - 1;
		}
		Static44.anInt1134++;
		Static44.anInt1146 = Class4_Sub4_Sub3_Sub3.anIntArray214[arg3];
		Static44.anInt1140 = Class4_Sub4_Sub3_Sub3.anIntArray217[arg3];
		Static44.anInt1148 = Class4_Sub4_Sub3_Sub3.anIntArray214[arg4];
		Static44.anInt1127 = Class4_Sub4_Sub3_Sub3.anIntArray217[arg4];
		Static44.aBooleanArrayArray1 = Static44.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static44.anInt1141 = arg0;
		Static44.anInt1149 = arg1;
		Static44.anInt1142 = arg2;
		Static44.anInt1131 = arg0 / 128;
		Static44.anInt1128 = arg2 / 128;
		Static44.anInt1145 = arg5;
		Static44.anInt1132 = Static44.anInt1131 - 25;
		if (Static44.anInt1132 < 0) {
			Static44.anInt1132 = 0;
		}
		Static44.anInt1137 = Static44.anInt1128 - 25;
		if (Static44.anInt1137 < 0) {
			Static44.anInt1137 = 0;
		}
		Static44.anInt1151 = Static44.anInt1131 + 25;
		if (Static44.anInt1151 > this.anInt1150) {
			Static44.anInt1151 = this.anInt1150;
		}
		Static44.anInt1139 = Static44.anInt1128 + 25;
		if (Static44.anInt1139 > this.anInt1143) {
			Static44.anInt1139 = this.anInt1143;
		}
		this.method777();
		Static44.anInt1147 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1135; local128 < this.anInt1129; local128++) {
			@Pc(134) Class4_Sub14[][] local134 = this.aClass4_Sub14ArrayArrayArray1[local128];
			for (local136 = Static44.anInt1132; local136 < Static44.anInt1151; local136++) {
				for (local139 = Static44.anInt1137; local139 < Static44.anInt1139; local139++) {
					@Pc(146) Class4_Sub14 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1718 <= arg5 && (Static44.aBooleanArrayArray1[local136 + 25 - Static44.anInt1131][local139 + 25 - Static44.anInt1128] || this.anIntArrayArrayArray4[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean65 = true;
							local146.aBoolean63 = true;
							if (local146.anInt1717 > 0) {
								local146.aBoolean64 = true;
							} else {
								local146.aBoolean64 = false;
							}
							Static44.anInt1147++;
						} else {
							local146.aBoolean65 = false;
							local146.aBoolean63 = false;
							local146.anInt1721 = 0;
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
		for (@Pc(224) int local224 = this.anInt1135; local224 < this.anInt1129; local224++) {
			@Pc(230) Class4_Sub14[][] local230 = this.aClass4_Sub14ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static44.anInt1131 + local139;
				local241 = Static44.anInt1131 - local139;
				if (local237 >= Static44.anInt1132 || local241 < Static44.anInt1151) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static44.anInt1128 + local249;
						local258 = Static44.anInt1128 - local249;
						@Pc(270) Class4_Sub14 local270;
						if (local237 >= Static44.anInt1132) {
							if (local254 >= Static44.anInt1137) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean65) {
									this.method767(local270, true);
								}
							}
							if (local258 < Static44.anInt1139) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean65) {
									this.method767(local270, true);
								}
							}
						}
						if (local241 < Static44.anInt1151) {
							if (local254 >= Static44.anInt1137) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean65) {
									this.method767(local270, true);
								}
							}
							if (local258 < Static44.anInt1139) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean65) {
									this.method767(local270, true);
								}
							}
						}
						if (Static44.anInt1147 == 0) {
							Static44.aBoolean42 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1135; local136 < this.anInt1129; local136++) {
			@Pc(361) Class4_Sub14[][] local361 = this.aClass4_Sub14ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static44.anInt1131 + local237;
				local249 = Static44.anInt1131 - local237;
				if (local241 >= Static44.anInt1132 || local249 < Static44.anInt1151) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static44.anInt1128 + local254;
						@Pc(389) int local389 = Static44.anInt1128 - local254;
						@Pc(401) Class4_Sub14 local401;
						if (local241 >= Static44.anInt1132) {
							if (local258 >= Static44.anInt1137) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean65) {
									this.method767(local401, false);
								}
							}
							if (local389 < Static44.anInt1139) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean65) {
									this.method767(local401, false);
								}
							}
						}
						if (local249 < Static44.anInt1151) {
							if (local258 >= Static44.anInt1137) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean65) {
									this.method767(local401, false);
								}
							}
							if (local389 < Static44.anInt1139) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean65) {
									this.method767(local401, false);
								}
							}
						}
						if (Static44.anInt1147 == 0) {
							Static44.aBoolean42 = false;
							return;
						}
					}
				}
			}
		}
		Static44.aBoolean42 = false;
	}

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "(III)V")
	public void method776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static44.aBoolean42 = true;
		Static44.anInt1130 = arg0;
		Static44.anInt1154 = arg1;
		Static44.anInt1138 = arg2;
		Static44.anInt1133 = -1;
		Static44.anInt1153 = -1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	private void method777() {
		@Pc(3) int local3 = Static44.anIntArray100[Static44.anInt1145];
		@Pc(7) Class25[] local7 = Static44.aClass25ArrayArray1[Static44.anInt1145];
		Static44.anInt1136 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class25 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt948 == 1) {
				local27 = local16.anInt953 + 25 - Static44.anInt1131;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt947 + 25 - Static44.anInt1128;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt950 + 25 - Static44.anInt1128;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static44.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static44.anInt1141 - local16.anInt946;
						if (local79 > 32) {
							local16.anInt957 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt957 = 2;
							local79 = -local79;
						}
						local16.anInt958 = (local16.anInt951 - Static44.anInt1142 << 8) / local79;
						local16.anInt954 = (local16.anInt959 - Static44.anInt1142 << 8) / local79;
						local16.anInt964 = (local16.anInt960 - Static44.anInt1149 << 8) / local79;
						local16.anInt942 = (local16.anInt944 - Static44.anInt1149 << 8) / local79;
						Static44.aClass25Array1[Static44.anInt1136++] = local16;
					}
				}
			} else if (local16.anInt948 == 2) {
				local27 = local16.anInt947 + 25 - Static44.anInt1128;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt953 + 25 - Static44.anInt1131;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt949 + 25 - Static44.anInt1131;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static44.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static44.anInt1142 - local16.anInt951;
						if (local79 > 32) {
							local16.anInt957 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt957 = 4;
							local79 = -local79;
						}
						local16.anInt961 = (local16.anInt946 - Static44.anInt1141 << 8) / local79;
						local16.anInt956 = (local16.anInt952 - Static44.anInt1141 << 8) / local79;
						local16.anInt964 = (local16.anInt960 - Static44.anInt1149 << 8) / local79;
						local16.anInt942 = (local16.anInt944 - Static44.anInt1149 << 8) / local79;
						Static44.aClass25Array1[Static44.anInt1136++] = local16;
					}
				}
			} else if (local16.anInt948 == 4) {
				local27 = local16.anInt960 - Static44.anInt1149;
				if (local27 > 128) {
					local40 = local16.anInt947 + 25 - Static44.anInt1128;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt950 + 25 - Static44.anInt1128;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt953 + 25 - Static44.anInt1131;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt949 + 25 - Static44.anInt1131;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static44.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt957 = 5;
							local16.anInt961 = (local16.anInt946 - Static44.anInt1141 << 8) / local27;
							local16.anInt956 = (local16.anInt952 - Static44.anInt1141 << 8) / local27;
							local16.anInt958 = (local16.anInt951 - Static44.anInt1142 << 8) / local27;
							local16.anInt954 = (local16.anInt959 - Static44.anInt1142 << 8) / local27;
							Static44.aClass25Array1[Static44.anInt1136++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ob;IIIIIII)V")
	private void method778(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static44.anInt1141;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static44.anInt1142;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray4[arg1][arg6][arg7] - Static44.anInt1149;
		@Pc(51) int local51 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static44.anInt1149;
		@Pc(66) int local66 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static44.anInt1149;
		@Pc(79) int local79 = this.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static44.anInt1149;
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
		@Pc(279) int local279 = Static91.anInt2162 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static91.anInt2164 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static91.anInt2162 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static91.anInt2164 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static91.anInt2162 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static91.anInt2164 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static91.anInt2162 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static91.anInt2164 + (local89 << 9) / local265;
		Static91.anInt2169 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static91.aBoolean91 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static91.anInt2167 || local327 > Static91.anInt2167 || local295 > Static91.anInt2167) {
				Static91.aBoolean91 = true;
			}
			if (Static44.aBoolean42 && this.method768(Static44.anInt1154, Static44.anInt1138, local319, local335, local303, local311, local327, local295)) {
				Static44.anInt1133 = arg6;
				Static44.anInt1153 = arg7;
			}
			if (arg0.anInt1966 == -1) {
				if (arg0.anInt1970 != 12345678) {
					Static91.method1599(local319, local335, local303, local311, local327, local295, arg0.anInt1970, arg0.anInt1967, arg0.anInt1963);
				}
			} else if (Static44.aBoolean41) {
				local472 = Static91.anInterface2_1.method620(arg0.anInt1966);
				Static91.method1599(local319, local335, local303, local311, local327, local295, Static44.method798(local472, arg0.anInt1970), Static44.method798(local472, arg0.anInt1967), Static44.method798(local472, arg0.anInt1963));
			} else if (arg0.aBoolean81) {
				Static91.method1596(local319, local335, local303, local311, local327, local295, arg0.anInt1970, arg0.anInt1967, arg0.anInt1963, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1966);
			} else {
				Static91.method1596(local319, local335, local303, local311, local327, local295, arg0.anInt1970, arg0.anInt1967, arg0.anInt1963, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1966);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static91.aBoolean91 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static91.anInt2167 || local295 > Static91.anInt2167 || local327 > Static91.anInt2167) {
			Static91.aBoolean91 = true;
		}
		if (Static44.aBoolean42 && this.method768(Static44.anInt1154, Static44.anInt1138, local287, local303, local335, local279, local295, local327)) {
			Static44.anInt1133 = arg6;
			Static44.anInt1153 = arg7;
		}
		if (arg0.anInt1966 != -1) {
			if (!Static44.aBoolean41) {
				Static91.method1596(local287, local303, local335, local279, local295, local327, arg0.anInt1961, arg0.anInt1963, arg0.anInt1967, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1966);
				return;
			}
			local472 = Static91.anInterface2_1.method620(arg0.anInt1966);
			Static91.method1599(local287, local303, local335, local279, local295, local327, Static44.method798(local472, arg0.anInt1961), Static44.method798(local472, arg0.anInt1963), Static44.method798(local472, arg0.anInt1967));
		} else if (arg0.anInt1961 != 12345678) {
			Static91.method1599(local287, local303, local335, local279, local295, local327, arg0.anInt1961, arg0.anInt1963, arg0.anInt1967);
			return;
		}
	}

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "(III)V")
	public void method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass46_1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!le;ILclient!le;Lclient!le;)V")
	public void method780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub4_Sub1 arg6, @OriginalArg(7) Class4_Sub4_Sub1 arg7) {
		@Pc(3) Class46 local3 = new Class46();
		local3.aClass4_Sub4_Sub1_7 = arg4;
		local3.anInt1845 = arg1 * 128 + 64;
		local3.anInt1844 = arg2 * 128 + 64;
		local3.anInt1841 = arg3;
		local3.anInt1840 = arg5;
		local3.aClass4_Sub4_Sub1_6 = arg6;
		local3.aClass4_Sub4_Sub1_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class4_Sub14 local43 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1717; local47++) {
				if ((local43.aClass59Array3[local47].anInt2279 & 0x100) == 256 && local43.aClass59Array3[local47].aClass4_Sub4_Sub1_8 instanceof Class4_Sub4_Sub1_Sub6) {
					@Pc(71) Class4_Sub4_Sub1_Sub6 local71 = (Class4_Sub4_Sub1_Sub6) local43.aClass59Array3[local47].aClass4_Sub4_Sub1_8;
					local71.method1799();
					if (local71.anInt2816 > local34) {
						local34 = local71.anInt2816;
					}
				}
			}
		}
		local3.anInt1843 = local34;
		if (this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub14(arg0, arg1, arg2);
		}
		this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass46_1 = local3;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIILclient!le;IIIIII)Z")
	public boolean method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub4_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method797(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	public void method782() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1129; local1++) {
			for (local4 = 0; local4 < this.anInt1150; local4++) {
				for (local7 = 0; local7 < this.anInt1143; local7++) {
					this.aClass4_Sub14ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static44.anInt1144; local4++) {
			for (local7 = 0; local7 < Static44.anIntArray100[local4]; local7++) {
				Static44.aClass25ArrayArray1[local4][local7] = null;
			}
			Static44.anIntArray100[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1152; local7++) {
			this.aClass59Array1[local7] = null;
		}
		this.anInt1152 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static44.aClass59Array2.length; local76++) {
			Static44.aClass59Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "k", descriptor = "(III)I")
	public int method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1717; local14++) {
			@Pc(20) Class59 local20 = local8.aClass59Array3[local14];
			if ((local20.anInt2274 >> 29 & 0x3) == 2 && local20.anInt2275 == arg1 && local20.anInt2269 == arg2) {
				return local20.anInt2274;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIII)Z")
	private boolean method784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method791(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static44.anInt1141) {
					if (!this.method799(local11, local26, local15)) {
						return false;
					}
					if (!this.method799(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method799(local11, local30, local15)) {
						return false;
					}
					if (!this.method799(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method799(local11, local34, local15)) {
					return false;
				}
				if (!this.method799(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static44.anInt1142) {
					if (!this.method799(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method799(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method799(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method799(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method799(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method799(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static44.anInt1141) {
					if (!this.method799(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method799(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method799(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method799(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method799(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method799(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static44.anInt1142) {
					if (!this.method799(local11, local26, local15)) {
						return false;
					}
					if (!this.method799(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method799(local11, local30, local15)) {
						return false;
					}
					if (!this.method799(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method799(local11, local34, local15)) {
					return false;
				}
				if (!this.method799(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method799(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method799(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method799(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method799(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method799(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILclient!le;III)Z")
	public boolean method785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub4_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method797(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!gd;IIIIII)V")
	private void method787(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray86.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray86[local5] - Static44.anInt1141;
			local20 = arg0.anIntArray83[local5] - Static44.anInt1149;
			local27 = arg0.anIntArray91[local5] - Static44.anInt1142;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray89 != null) {
				Static42.anIntArray88[local5] = local37;
				Static42.anIntArray84[local5] = local59;
				Static42.anIntArray81[local5] = local69;
			}
			Static42.anIntArray78[local5] = Static91.anInt2162 + (local37 << 9) / local69;
			Static42.anIntArray77[local5] = Static91.anInt2164 + (local59 << 9) / local69;
		}
		Static91.anInt2169 = 0;
		local3 = arg0.anIntArray85.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray85[local13];
			local27 = arg0.anIntArray90[local13];
			local37 = arg0.anIntArray87[local13];
			@Pc(142) int local142 = Static42.anIntArray78[local20];
			@Pc(146) int local146 = Static42.anIntArray78[local27];
			@Pc(150) int local150 = Static42.anIntArray78[local37];
			@Pc(154) int local154 = Static42.anIntArray77[local20];
			@Pc(158) int local158 = Static42.anIntArray77[local27];
			@Pc(162) int local162 = Static42.anIntArray77[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static91.aBoolean91 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static91.anInt2167 || local146 > Static91.anInt2167 || local150 > Static91.anInt2167) {
					Static91.aBoolean91 = true;
				}
				if (Static44.aBoolean42 && this.method768(Static44.anInt1154, Static44.anInt1138, local154, local158, local162, local142, local146, local150)) {
					Static44.anInt1133 = arg5;
					Static44.anInt1153 = arg6;
				}
				if (arg0.anIntArray89 == null || arg0.anIntArray89[local13] == -1) {
					if (arg0.anIntArray80[local13] != 12345678) {
						Static91.method1599(local154, local158, local162, local142, local146, local150, arg0.anIntArray80[local13], arg0.anIntArray82[local13], arg0.anIntArray79[local13]);
					}
				} else if (Static44.aBoolean41) {
					@Pc(364) int local364 = Static91.anInterface2_1.method620(arg0.anIntArray89[local13]);
					Static91.method1599(local154, local158, local162, local142, local146, local150, Static44.method798(local364, arg0.anIntArray80[local13]), Static44.method798(local364, arg0.anIntArray82[local13]), Static44.method798(local364, arg0.anIntArray79[local13]));
				} else if (arg0.aBoolean30) {
					Static91.method1596(local154, local158, local162, local142, local146, local150, arg0.anIntArray80[local13], arg0.anIntArray82[local13], arg0.anIntArray79[local13], Static42.anIntArray88[0], Static42.anIntArray88[1], Static42.anIntArray88[3], Static42.anIntArray84[0], Static42.anIntArray84[1], Static42.anIntArray84[3], Static42.anIntArray81[0], Static42.anIntArray81[1], Static42.anIntArray81[3], arg0.anIntArray89[local13]);
				} else {
					Static91.method1596(local154, local158, local162, local142, local146, local150, arg0.anIntArray80[local13], arg0.anIntArray82[local13], arg0.anIntArray79[local13], Static42.anIntArray88[local20], Static42.anIntArray88[local27], Static42.anIntArray88[local37], Static42.anIntArray84[local20], Static42.anIntArray84[local27], Static42.anIntArray84[local37], Static42.anIntArray81[local20], Static42.anIntArray81[local27], Static42.anIntArray81[local37], arg0.anIntArray89[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "l", descriptor = "(III)V")
	public void method788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass6_1 = null;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!le;II)V")
	public void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class6 local6 = new Class6();
		local6.aClass4_Sub4_Sub1_1 = arg4;
		local6.anInt68 = arg1 * 128 + 64;
		local6.anInt70 = arg2 * 128 + 64;
		local6.anInt63 = arg3;
		local6.anInt65 = arg5;
		local6.anInt64 = arg6;
		if (this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub14(arg0, arg1, arg2);
		}
		this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass6_1 = local6;
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(III)Z")
	private boolean method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static44.anInt1134) {
			return false;
		} else if (local8 == Static44.anInt1134) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method799(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2], local27 + 1) && this.method799(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local27 + 1) && this.method799(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method799(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static44.anInt1134;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static44.anInt1134;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIII)V")
	public void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class24 local14 = local8.aClass24_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt937 = local23 + (local14.anInt937 - local23) * arg3 / 16;
			local14.anInt927 = local29 + (local14.anInt927 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "(III)V")
	public void method793() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1129; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1150; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1143; local7++) {
					@Pc(17) Class4_Sub14 local17 = this.aClass4_Sub14ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class14 local22 = local17.aClass14_1;
						if (local22 != null && local22.aClass4_Sub4_Sub1_3 instanceof Class4_Sub4_Sub1_Sub7) {
							@Pc(32) Class4_Sub4_Sub1_Sub7 local32 = (Class4_Sub4_Sub1_Sub7) local22.aClass4_Sub4_Sub1_3;
							this.method772(local32, local1, local4, local7, 1, 1);
							if (local22.aClass4_Sub4_Sub1_2 instanceof Class4_Sub4_Sub1_Sub7) {
								@Pc(48) Class4_Sub4_Sub1_Sub7 local48 = (Class4_Sub4_Sub1_Sub7) local22.aClass4_Sub4_Sub1_2;
								this.method772(local48, local1, local4, local7, 1, 1);
								Static118.method1995(local32, local48, 0, 0, 0, false);
								local22.aClass4_Sub4_Sub1_2 = local48.method2003(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass4_Sub4_Sub1_3 = local32.method2003(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class4_Sub4_Sub1_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1717; local87++) {
							@Pc(93) Class59 local93 = local17.aClass59Array3[local87];
							if (local93 != null && local93.aClass4_Sub4_Sub1_8 instanceof Class4_Sub4_Sub1_Sub7) {
								local103 = (Class4_Sub4_Sub1_Sub7) local93.aClass4_Sub4_Sub1_8;
								this.method772(local103, local1, local4, local7, local93.anInt2282 + 1 - local93.anInt2275, local93.anInt2277 - local93.anInt2269 + 1);
								local93.aClass4_Sub4_Sub1_8 = local103.method2003(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class6 local142 = local17.aClass6_1;
						if (local142 != null && local142.aClass4_Sub4_Sub1_1 instanceof Class4_Sub4_Sub1_Sub7) {
							local103 = (Class4_Sub4_Sub1_Sub7) local142.aClass4_Sub4_Sub1_1;
							this.method769(local103, local1, local4, local7);
							local142.aClass4_Sub4_Sub1_1 = local103.method2003(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public void method794(@OriginalArg(0) int arg0) {
		this.anInt1135 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1150; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1143; local7++) {
				if (this.aClass4_Sub14ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass4_Sub14ArrayArrayArray1[arg0][local4][local7] = new Class4_Sub14(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILclient!le;Lclient!le;IIII)V")
	public void method795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub4_Sub1 arg4, @OriginalArg(5) Class4_Sub4_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class14 local8 = new Class14();
		local8.anInt456 = arg8;
		local8.anInt460 = arg9;
		local8.anInt458 = arg1 * 128 + 64;
		local8.anInt461 = arg2 * 128 + 64;
		local8.anInt468 = arg3;
		local8.aClass4_Sub4_Sub1_3 = arg4;
		local8.aClass4_Sub4_Sub1_2 = arg5;
		local8.anInt464 = arg6;
		local8.anInt462 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass4_Sub14ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass4_Sub14ArrayArrayArray1[local45][arg1][arg2] = new Class4_Sub14(local45, arg1, arg2);
			}
		}
		this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass14_1 = local8;
	}

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "(III)I")
	public int method796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass14_1 == null ? 0 : local8.aClass14_1.anInt456;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIILclient!le;IZII)Z")
	private boolean method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub4_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1150 || local4 >= this.anInt1143) {
					return false;
				}
				@Pc(28) Class4_Sub14 local28 = this.aClass4_Sub14ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1717 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class59 local52 = new Class59();
		local52.anInt2274 = arg11;
		local52.anInt2279 = arg12;
		local52.anInt2271 = arg0;
		local52.anInt2273 = arg5;
		local52.anInt2270 = arg6;
		local52.anInt2278 = arg7;
		local52.aClass4_Sub4_Sub1_8 = arg8;
		local52.anInt2276 = arg9;
		local52.anInt2275 = arg1;
		local52.anInt2269 = arg2;
		local52.anInt2282 = arg1 + arg3 - 1;
		local52.anInt2277 = arg2 + arg4 - 1;
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
					if (this.aClass4_Sub14ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass4_Sub14ArrayArrayArray1[local130][local98][local101] = new Class4_Sub14(local130, local98, local101);
					}
				}
				@Pc(166) Class4_Sub14 local166 = this.aClass4_Sub14ArrayArrayArray1[arg0][local98][local101];
				local166.aClass59Array3[local166.anInt1717] = local52;
				local166.anIntArray177[local166.anInt1717] = local104;
				local166.anInt1715 |= local104;
				local166.anInt1717++;
			}
		}
		if (arg10) {
			this.aClass59Array1[this.anInt1152++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "(III)Z")
	private boolean method799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static44.anInt1136; local1++) {
			@Pc(6) Class25 local6 = Static44.aClass25Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt957 == 1) {
				local15 = local6.anInt946 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt951 + (local6.anInt958 * local15 >> 8);
					local37 = local6.anInt959 + (local6.anInt954 * local15 >> 8);
					local47 = local6.anInt960 + (local6.anInt964 * local15 >> 8);
					local57 = local6.anInt944 + (local6.anInt942 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt957 == 2) {
				local15 = arg0 - local6.anInt946;
				if (local15 > 0) {
					local27 = local6.anInt951 + (local6.anInt958 * local15 >> 8);
					local37 = local6.anInt959 + (local6.anInt954 * local15 >> 8);
					local47 = local6.anInt960 + (local6.anInt964 * local15 >> 8);
					local57 = local6.anInt944 + (local6.anInt942 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt957 == 3) {
				local15 = local6.anInt951 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt946 + (local6.anInt961 * local15 >> 8);
					local37 = local6.anInt952 + (local6.anInt956 * local15 >> 8);
					local47 = local6.anInt960 + (local6.anInt964 * local15 >> 8);
					local57 = local6.anInt944 + (local6.anInt942 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt957 == 4) {
				local15 = arg2 - local6.anInt951;
				if (local15 > 0) {
					local27 = local6.anInt946 + (local6.anInt961 * local15 >> 8);
					local37 = local6.anInt952 + (local6.anInt956 * local15 >> 8);
					local47 = local6.anInt960 + (local6.anInt964 * local15 >> 8);
					local57 = local6.anInt944 + (local6.anInt942 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt957 == 5) {
				local15 = arg1 - local6.anInt960;
				if (local15 > 0) {
					local27 = local6.anInt946 + (local6.anInt961 * local15 >> 8);
					local37 = local6.anInt952 + (local6.anInt956 * local15 >> 8);
					local47 = local6.anInt951 + (local6.anInt958 * local15 >> 8);
					local57 = local6.anInt959 + (local6.anInt954 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	public void method801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class4_Sub14 local31 = this.aClass4_Sub14ArrayArrayArray1[local10][arg0][arg1] = this.aClass4_Sub14ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1722--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1717; local41++) {
					@Pc(47) Class59 local47 = local31.aClass59Array3[local41];
					if ((local47.anInt2274 >> 29 & 0x3) == 2 && local47.anInt2275 == arg0 && local47.anInt2269 == arg1) {
						local47.anInt2271--;
					}
				}
			}
		}
		if (this.aClass4_Sub14ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass4_Sub14ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub14(0, arg0, arg1);
		}
		this.aClass4_Sub14ArrayArrayArray1[0][arg0][arg1].aClass4_Sub14_1 = local8;
		this.aClass4_Sub14ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIII)V")
	public void method802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].anInt1718 = arg3;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class55 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class55(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class55(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local12;
		} else {
			@Pc(140) Class27 local140 = new Class27(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "(III)I")
	public int method804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass24_1 == null ? 0 : local8.aClass24_1.anInt935;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	public void method805() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1152; local1++) {
			@Pc(7) Class59 local7 = this.aClass59Array1[local1];
			this.method762(local7);
			this.aClass59Array1[local1] = null;
		}
		this.anInt1152 = 0;
	}

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "(III)V")
	public void method806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub14 local8 = this.aClass4_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1717; local13++) {
			@Pc(19) Class59 local19 = local8.aClass59Array3[local13];
			if ((local19.anInt2274 >> 29 & 0x3) == 2 && local19.anInt2275 == arg1 && local19.anInt2269 == arg2) {
				this.method762(local19);
				return;
			}
		}
	}
}
