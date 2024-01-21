import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class34 {

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private int anInt1183 = 0;

	@OriginalMember(owner = "client!i", name = "A", descriptor = "I")
	private int anInt1199 = 0;

	@OriginalMember(owner = "client!i", name = "z", descriptor = "[Lclient!kf;")
	private final Class39[] aClass39Array2 = new Class39[5000];

	@OriginalMember(owner = "client!i", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray15 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!i", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray16 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!i", name = "w", descriptor = "I")
	private final int anInt1196;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	private final int anInt1180;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	private final int anInt1185;

	@OriginalMember(owner = "client!i", name = "B", descriptor = "[[[Lclient!uc;")
	private final Class5_Sub17[][][] aClass5_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[[I)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1196 = arg0;
		this.anInt1180 = arg1;
		this.anInt1185 = arg2;
		this.aClass5_Sub17ArrayArrayArray1 = new Class5_Sub17[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray4 = arg3;
		this.method914();
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
	public void method880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass75_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "([IIIIII)V")
	public void method881(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class42 local14 = local8.aClass42_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1847;
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
		@Pc(59) Class61 local59 = local8.aClass61_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2605;
		@Pc(68) int local68 = local59.anInt2606;
		@Pc(71) int local71 = local59.anInt2603;
		@Pc(74) int local74 = local59.anInt2604;
		@Pc(79) int[] local79 = this.anIntArrayArray15[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray16[local68];
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

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)Lclient!qc;")
	public Class60 method882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass60_1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!uc;Z)V")
	private void method883(@OriginalArg(0) Class5_Sub17 arg0, @OriginalArg(1) boolean arg1) {
		Static43.aClass10_6.method234(arg0);
		while (true) {
			@Pc(8) Class5_Sub17 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class5_Sub17[][] local31;
			@Pc(49) Class5_Sub17 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class44 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class39 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class5_Sub17 var35;
										while (true) {
											do {
												local8 = (Class5_Sub17) Static43.aClass10_6.method229();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean124);
											local17 = local8.anInt2895;
											local20 = local8.anInt2902;
											local23 = local8.anInt2900;
											local26 = local8.anInt2896;
											local31 = this.aClass5_Sub17ArrayArrayArray1[local23];
											if (!local8.aBoolean126) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass5_Sub17ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean124) {
														continue;
													}
												}
												if (local17 <= Static43.anInt1188 && local17 > Static43.anInt1190) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean124 && (local49.aBoolean126 || (local8.anInt2894 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static43.anInt1188 && local17 < Static43.anInt1193 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean124 && (local49.aBoolean126 || (local8.anInt2894 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static43.anInt1189 && local20 > Static43.anInt1181) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean124 && (local49.aBoolean126 || (local8.anInt2894 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static43.anInt1189 && local20 < Static43.anInt1191 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean124 && (local49.aBoolean126 || (local8.anInt2894 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean126 = false;
											if (local8.aClass5_Sub17_1 != null) {
												local49 = local8.aClass5_Sub17_1;
												if (local49.aClass42_1 == null) {
													if (local49.aClass61_1 != null && !this.method926(0, local17, local20)) {
														this.method896(local49.aClass61_1, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local17, local20);
													}
												} else if (!this.method926(0, local17, local20)) {
													this.method911(local49.aClass42_1, 0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local17, local20);
												}
												@Pc(225) Class44 local225 = local49.aClass44_1;
												if (local225 != null) {
													local225.aClass5_Sub2_Sub4_2.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local225.anInt1911 - Static43.anInt1194, local225.anInt1908 - Static43.anInt1206, local225.anInt1905 - Static43.anInt1202, local225.anInt1910);
												}
												for (local251 = 0; local251 < local49.anInt2892; local251++) {
													var12 = local49.aClass39Array3[local251];
													if (var12 != null) {
														var12.aClass5_Sub2_Sub4_1.method1611(var12.anInt1785, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, var12.anInt1794 - Static43.anInt1194, var12.anInt1790 - Static43.anInt1206, var12.anInt1792 - Static43.anInt1202, var12.anInt1798);
													}
												}
											}
											var24 = false;
											if (local8.aClass42_1 == null) {
												if (local8.aClass61_1 != null && !this.method926(local26, local17, local20)) {
													var24 = true;
													this.method896(local8.aClass61_1, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local17, local20);
												}
											} else if (!this.method926(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass42_1.anInt1849 != 12345678 || Static43.aBoolean58 && local23 <= Static43.anInt1186) {
													this.method911(local8.aClass42_1, local26, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class44 local350 = local8.aClass44_1;
											@Pc(353) Class60 local353 = local8.aClass60_1;
											if (local350 != null || local353 != null) {
												if (Static43.anInt1188 == local17) {
													var23++;
												} else if (Static43.anInt1188 < local17) {
													var23 += 2;
												}
												if (Static43.anInt1189 == local20) {
													var23 += 3;
												} else if (Static43.anInt1189 > local20) {
													var23 += 6;
												}
												local251 = Static43.anIntArray189[var23];
												local8.anInt2901 = Static43.anIntArray194[var23];
											}
											if (local350 != null) {
												if ((local350.anInt1903 & Static43.anIntArray192[var23]) == 0) {
													local8.anInt2898 = 0;
												} else if (local350.anInt1903 == 16) {
													local8.anInt2898 = 3;
													local8.anInt2893 = Static43.anIntArray191[var23];
													local8.anInt2897 = 3 - local8.anInt2893;
												} else if (local350.anInt1903 == 32) {
													local8.anInt2898 = 6;
													local8.anInt2893 = Static43.anIntArray188[var23];
													local8.anInt2897 = 6 - local8.anInt2893;
												} else if (local350.anInt1903 == 64) {
													local8.anInt2898 = 12;
													local8.anInt2893 = Static43.anIntArray190[var23];
													local8.anInt2897 = 12 - local8.anInt2893;
												} else {
													local8.anInt2898 = 9;
													local8.anInt2893 = Static43.anIntArray193[var23];
													local8.anInt2897 = 9 - local8.anInt2893;
												}
												if ((local350.anInt1903 & local251) != 0 && !this.method920(local26, local17, local20, local350.anInt1903)) {
													local350.aClass5_Sub2_Sub4_2.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local350.anInt1911 - Static43.anInt1194, local350.anInt1908 - Static43.anInt1206, local350.anInt1905 - Static43.anInt1202, local350.anInt1910);
												}
												if ((local350.anInt1907 & local251) != 0 && !this.method920(local26, local17, local20, local350.anInt1907)) {
													local350.aClass5_Sub2_Sub4_3.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local350.anInt1911 - Static43.anInt1194, local350.anInt1908 - Static43.anInt1206, local350.anInt1905 - Static43.anInt1202, local350.anInt1910);
												}
											}
											if (local353 != null && !this.method915(local26, local17, local20, local353.aClass5_Sub2_Sub4_7.anInt2379)) {
												if ((local353.anInt2540 & local251) != 0) {
													local353.aClass5_Sub2_Sub4_7.method1611(local353.anInt2538, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local353.anInt2539 - Static43.anInt1194, local353.anInt2543 - Static43.anInt1206, local353.anInt2534 - Static43.anInt1202, local353.anInt2537);
												} else if ((local353.anInt2540 & 0x300) != 0) {
													local588 = local353.anInt2539 - Static43.anInt1194;
													local593 = local353.anInt2543 - Static43.anInt1206;
													local598 = local353.anInt2534 - Static43.anInt1202;
													local601 = local353.anInt2538;
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
													if ((local353.anInt2540 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static43.anIntArray183[local601];
														local645 = local598 + Static43.anIntArray184[local601];
														local353.aClass5_Sub2_Sub4_7.method1611(local601 * 512 + 256, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local639, local593, local645, local353.anInt2537);
													}
													if ((local353.anInt2540 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static43.anIntArray185[local601];
														local645 = local598 + Static43.anIntArray187[local601];
														local353.aClass5_Sub2_Sub4_7.method1611(local601 * 512 + 1280 & 0x7FF, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local639, local593, local645, local353.anInt2537);
													}
												}
											}
											if (var24) {
												@Pc(706) Class75 local706 = local8.aClass75_1;
												if (local706 != null) {
													local706.aClass5_Sub2_Sub4_8.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local706.anInt3014 - Static43.anInt1194, local706.anInt3016 - Static43.anInt1206, local706.anInt3013 - Static43.anInt1202, local706.anInt3019);
												}
												@Pc(733) Class56 local733 = local8.aClass56_1;
												if (local733 != null && local733.anInt2340 == 0) {
													if (local733.aClass5_Sub2_Sub4_5 != null) {
														local733.aClass5_Sub2_Sub4_5.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local733.anInt2337 - Static43.anInt1194, local733.anInt2347 - Static43.anInt1206, local733.anInt2336 - Static43.anInt1202, local733.anInt2333);
													}
													if (local733.aClass5_Sub2_Sub4_4 != null) {
														local733.aClass5_Sub2_Sub4_4.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local733.anInt2337 - Static43.anInt1194, local733.anInt2347 - Static43.anInt1206, local733.anInt2336 - Static43.anInt1202, local733.anInt2333);
													}
													if (local733.aClass5_Sub2_Sub4_6 != null) {
														local733.aClass5_Sub2_Sub4_6.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local733.anInt2337 - Static43.anInt1194, local733.anInt2347 - Static43.anInt1206, local733.anInt2336 - Static43.anInt1202, local733.anInt2333);
													}
												}
											}
											local588 = local8.anInt2894;
											if (local588 != 0) {
												if (local17 < Static43.anInt1188 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean124) {
														Static43.aClass10_6.method234(var35);
													}
												}
												if (local20 < Static43.anInt1189 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean124) {
														Static43.aClass10_6.method234(var35);
													}
												}
												if (local17 > Static43.anInt1188 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean124) {
														Static43.aClass10_6.method234(var35);
													}
												}
												if (local20 > Static43.anInt1189 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean124) {
														Static43.aClass10_6.method234(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2898 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2892; var23++) {
												if (local8.aClass39Array3[var23].anInt1787 != Static43.anInt1197 && (local8.anIntArray439[var23] & local8.anInt2898) == local8.anInt2893) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass44_1;
												if (!this.method920(local26, local17, local20, local952.anInt1903)) {
													local952.aClass5_Sub2_Sub4_2.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local952.anInt1911 - Static43.anInt1194, local952.anInt1908 - Static43.anInt1206, local952.anInt1905 - Static43.anInt1202, local952.anInt1910);
												}
												local8.anInt2898 = 0;
											}
										}
										if (!local8.aBoolean125) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt2892;
											local8.aBoolean125 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass39Array3[local251];
												if (var12.anInt1787 != Static43.anInt1197) {
													for (local1011 = var12.anInt1799; local1011 <= var12.anInt1791; local1011++) {
														for (local588 = var12.anInt1796; local588 <= var12.anInt1789; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean126) {
																local8.aBoolean125 = true;
																continue label568;
															}
															if (var35.anInt2898 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1799) {
																	local598++;
																}
																if (local1011 < var12.anInt1791) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1796) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1789) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt2898) == local8.anInt2897) {
																	local8.aBoolean125 = true;
																	continue label568;
																}
															}
														}
													}
													Static43.aClass39Array1[var23++] = var12;
													local588 = Static43.anInt1188 - var12.anInt1799;
													local593 = var12.anInt1791 - Static43.anInt1188;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static43.anInt1189 - var12.anInt1796;
													local601 = var12.anInt1789 - Static43.anInt1189;
													if (local601 > local598) {
														var12.anInt1788 = local588 + local601;
													} else {
														var12.anInt1788 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class39 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static43.aClass39Array1[local588];
													if (local1135.anInt1787 != Static43.anInt1197) {
														if (local1135.anInt1788 > local1126) {
															local1126 = local1135.anInt1788;
															local1011 = local588;
														} else if (local1135.anInt1788 == local1126) {
															local598 = local1135.anInt1794 - Static43.anInt1194;
															local601 = local1135.anInt1792 - Static43.anInt1202;
															local610 = Static43.aClass39Array1[local1011].anInt1794 - Static43.anInt1194;
															var19 = Static43.aClass39Array1[local1011].anInt1792 - Static43.anInt1202;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static43.aClass39Array1[local1011];
												local1135.anInt1787 = Static43.anInt1197;
												if (!this.method906(local26, local1135.anInt1799, local1135.anInt1791, local1135.anInt1796, local1135.anInt1789, local1135.aClass5_Sub2_Sub4_1.anInt2379)) {
													local1135.aClass5_Sub2_Sub4_1.method1611(local1135.anInt1785, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local1135.anInt1794 - Static43.anInt1194, local1135.anInt1790 - Static43.anInt1206, local1135.anInt1792 - Static43.anInt1202, local1135.anInt1798);
												}
												for (local598 = local1135.anInt1799; local598 <= local1135.anInt1791; local598++) {
													for (local601 = local1135.anInt1796; local601 <= local1135.anInt1789; local601++) {
														@Pc(1260) Class5_Sub17 local1260 = local31[local598][local601];
														if (local1260.anInt2898 != 0) {
															Static43.aClass10_6.method234(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean124) {
															Static43.aClass10_6.method234(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean125) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean125 = false;
											break;
										}
									}
								} while (!local8.aBoolean124);
							} while (local8.anInt2898 != 0);
							if (local17 > Static43.anInt1188 || local17 <= Static43.anInt1190) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean124);
						if (local17 < Static43.anInt1188 || local17 >= Static43.anInt1193 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean124);
					if (local20 > Static43.anInt1189 || local20 <= Static43.anInt1181) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean124);
				if (local20 < Static43.anInt1189 || local20 >= Static43.anInt1191 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean124);
			local8.aBoolean124 = false;
			Static43.anInt1187--;
			@Pc(1402) Class56 local1402 = local8.aClass56_1;
			if (local1402 != null && local1402.anInt2340 != 0) {
				if (local1402.aClass5_Sub2_Sub4_5 != null) {
					local1402.aClass5_Sub2_Sub4_5.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local1402.anInt2337 - Static43.anInt1194, local1402.anInt2347 - Static43.anInt1206 - local1402.anInt2340, local1402.anInt2336 - Static43.anInt1202, local1402.anInt2333);
				}
				if (local1402.aClass5_Sub2_Sub4_4 != null) {
					local1402.aClass5_Sub2_Sub4_4.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local1402.anInt2337 - Static43.anInt1194, local1402.anInt2347 - Static43.anInt1206 - local1402.anInt2340, local1402.anInt2336 - Static43.anInt1202, local1402.anInt2333);
				}
				if (local1402.aClass5_Sub2_Sub4_6 != null) {
					local1402.aClass5_Sub2_Sub4_6.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local1402.anInt2337 - Static43.anInt1194, local1402.anInt2347 - Static43.anInt1206 - local1402.anInt2340, local1402.anInt2336 - Static43.anInt1202, local1402.anInt2333);
				}
			}
			if (local8.anInt2901 != 0) {
				@Pc(1497) Class60 local1497 = local8.aClass60_1;
				if (local1497 != null && !this.method915(local26, local17, local20, local1497.aClass5_Sub2_Sub4_7.anInt2379)) {
					if ((local1497.anInt2540 & local8.anInt2901) != 0) {
						local1497.aClass5_Sub2_Sub4_7.method1611(local1497.anInt2538, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local1497.anInt2539 - Static43.anInt1194, local1497.anInt2543 - Static43.anInt1206, local1497.anInt2534 - Static43.anInt1202, local1497.anInt2537);
					} else if ((local1497.anInt2540 & 0x300) != 0) {
						local251 = local1497.anInt2539 - Static43.anInt1194;
						local1126 = local1497.anInt2543 - Static43.anInt1206;
						local1011 = local1497.anInt2534 - Static43.anInt1202;
						local588 = local1497.anInt2538;
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
						if ((local1497.anInt2540 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static43.anIntArray183[local588];
							local610 = local1011 + Static43.anIntArray184[local588];
							local1497.aClass5_Sub2_Sub4_7.method1611(local588 * 512 + 256, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local601, local1126, local610, local1497.anInt2537);
						}
						if ((local1497.anInt2540 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static43.anIntArray185[local588];
							local610 = local1011 + Static43.anIntArray187[local588];
							local1497.aClass5_Sub2_Sub4_7.method1611(local588 * 512 + 1280 & 0x7FF, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local601, local1126, local610, local1497.anInt2537);
						}
					}
				}
				local952 = local8.aClass44_1;
				if (local952 != null) {
					if ((local952.anInt1907 & local8.anInt2901) != 0 && !this.method920(local26, local17, local20, local952.anInt1907)) {
						local952.aClass5_Sub2_Sub4_3.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local952.anInt1911 - Static43.anInt1194, local952.anInt1908 - Static43.anInt1206, local952.anInt1905 - Static43.anInt1202, local952.anInt1910);
					}
					if ((local952.anInt1903 & local8.anInt2901) != 0 && !this.method920(local26, local17, local20, local952.anInt1903)) {
						local952.aClass5_Sub2_Sub4_2.method1611(0, Static43.anInt1192, Static43.anInt1182, Static43.anInt1195, Static43.anInt1200, local952.anInt1911 - Static43.anInt1194, local952.anInt1908 - Static43.anInt1206, local952.anInt1905 - Static43.anInt1202, local952.anInt1910);
					}
				}
			}
			@Pc(1755) Class5_Sub17 local1755;
			if (local23 < this.anInt1196 - 1) {
				local1755 = this.aClass5_Sub17ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean124) {
					Static43.aClass10_6.method234(local1755);
				}
			}
			if (local17 < Static43.anInt1188) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean124) {
					Static43.aClass10_6.method234(local1755);
				}
			}
			if (local20 < Static43.anInt1189) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean124) {
					Static43.aClass10_6.method234(local1755);
				}
			}
			if (local17 > Static43.anInt1188) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean124) {
					Static43.aClass10_6.method234(local1755);
				}
			}
			if (local20 > Static43.anInt1189) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean124) {
					Static43.aClass10_6.method234(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!jf;IIIIII)V")
	public void method884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class60 local6 = new Class60();
		local6.anInt2537 = arg9;
		local6.anInt2544 = arg10;
		local6.anInt2539 = arg1 * 128 + arg7 + 64;
		local6.anInt2534 = arg2 * 128 + arg8 + 64;
		local6.anInt2543 = arg3;
		local6.aClass5_Sub2_Sub4_7 = arg4;
		local6.anInt2540 = arg5;
		local6.anInt2538 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass5_Sub17ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass5_Sub17ArrayArrayArray1[local44][arg1][arg2] = new Class5_Sub17(local44, arg1, arg2);
			}
		}
		this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local6;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class42 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class42(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub17(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class42(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub17(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local12;
		} else {
			@Pc(140) Class61 local140 = new Class61(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub17ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub17ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub17(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass61_1 = local140;
		}
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(III)I")
	public int method888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass75_1 == null ? 0 : local8.aClass75_1.anInt3019;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
	public void method890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class60 local14 = local8.aClass60_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt2539 = local23 + (local14.anInt2539 - local23) * arg3 / 16;
			local14.anInt2534 = local29 + (local14.anInt2534 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(III)V")
	public void method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass44_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pa;III)V")
	private void method892(@OriginalArg(0) Class5_Sub2_Sub4_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class5_Sub17 local14;
		@Pc(29) Class5_Sub2_Sub4_Sub7 local29;
		if (arg2 < this.anInt1180) {
			local14 = this.aClass5_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass75_1 != null && local14.aClass75_1.aClass5_Sub2_Sub4_8 instanceof Class5_Sub2_Sub4_Sub7) {
				local29 = (Class5_Sub2_Sub4_Sub7) local14.aClass75_1.aClass5_Sub2_Sub4_8;
				Static83.method1569(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1180) {
			local14 = this.aClass5_Sub17ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass75_1 != null && local14.aClass75_1.aClass5_Sub2_Sub4_8 instanceof Class5_Sub2_Sub4_Sub7) {
				local29 = (Class5_Sub2_Sub4_Sub7) local14.aClass75_1.aClass5_Sub2_Sub4_8;
				Static83.method1569(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1180 && arg3 < this.anInt1185) {
			local14 = this.aClass5_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass75_1 != null && local14.aClass75_1.aClass5_Sub2_Sub4_8 instanceof Class5_Sub2_Sub4_Sub7) {
				local29 = (Class5_Sub2_Sub4_Sub7) local14.aClass75_1.aClass5_Sub2_Sub4_8;
				Static83.method1569(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1180 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass5_Sub17ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass75_1 != null && local14.aClass75_1.aClass5_Sub2_Sub4_8 instanceof Class5_Sub2_Sub4_Sub7) {
			local29 = (Class5_Sub2_Sub4_Sub7) local14.aClass75_1.aClass5_Sub2_Sub4_8;
			Static83.method1569(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIIIILclient!jf;IZII)Z")
	private boolean method893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5_Sub2_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1180 || local4 >= this.anInt1185) {
					return false;
				}
				@Pc(28) Class5_Sub17 local28 = this.aClass5_Sub17ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2892 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class39 local52 = new Class39();
		local52.anInt1798 = arg11;
		local52.anInt1795 = arg12;
		local52.anInt1793 = arg0;
		local52.anInt1794 = arg5;
		local52.anInt1792 = arg6;
		local52.anInt1790 = arg7;
		local52.aClass5_Sub2_Sub4_1 = arg8;
		local52.anInt1785 = arg9;
		local52.anInt1799 = arg1;
		local52.anInt1796 = arg2;
		local52.anInt1791 = arg1 + arg3 - 1;
		local52.anInt1789 = arg2 + arg4 - 1;
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
					if (this.aClass5_Sub17ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass5_Sub17ArrayArrayArray1[local130][local98][local101] = new Class5_Sub17(local130, local98, local101);
					}
				}
				@Pc(166) Class5_Sub17 local166 = this.aClass5_Sub17ArrayArrayArray1[arg0][local98][local101];
				local166.aClass39Array3[local166.anInt2892] = local52;
				local166.anIntArray439[local166.anInt2892] = local104;
				local166.anInt2894 |= local104;
				local166.anInt2892++;
			}
		}
		if (arg10) {
			this.aClass39Array2[this.anInt1199++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(III)Lclient!ma;")
	public Class44 method894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass44_1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIILclient!jf;IIIIII)Z")
	public boolean method895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class5_Sub2_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method893(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ra;IIIIII)V")
	private void method896(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray387.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray387[local5] - Static43.anInt1194;
			local20 = arg0.anIntArray386[local5] - Static43.anInt1206;
			local27 = arg0.anIntArray392[local5] - Static43.anInt1202;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray378 != null) {
				Static94.anIntArray391[local5] = local37;
				Static94.anIntArray382[local5] = local59;
				Static94.anIntArray388[local5] = local69;
			}
			Static94.anIntArray384[local5] = Static86.anInt2479 + (local37 << 9) / local69;
			Static94.anIntArray380[local5] = Static86.anInt2477 + (local59 << 9) / local69;
		}
		Static86.anInt2481 = 0;
		local3 = arg0.anIntArray390.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray390[local13];
			local27 = arg0.anIntArray383[local13];
			local37 = arg0.anIntArray385[local13];
			@Pc(142) int local142 = Static94.anIntArray384[local20];
			@Pc(146) int local146 = Static94.anIntArray384[local27];
			@Pc(150) int local150 = Static94.anIntArray384[local37];
			@Pc(154) int local154 = Static94.anIntArray380[local20];
			@Pc(158) int local158 = Static94.anIntArray380[local27];
			@Pc(162) int local162 = Static94.anIntArray380[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static86.aBoolean113 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static86.anInt2476 || local146 > Static86.anInt2476 || local150 > Static86.anInt2476) {
					Static86.aBoolean113 = true;
				}
				if (Static43.aBoolean58 && this.method889(Static43.anInt1207, Static43.anInt1205, local154, local158, local162, local142, local146, local150)) {
					Static43.anInt1201 = arg5;
					Static43.anInt1203 = arg6;
				}
				if (arg0.anIntArray378 == null || arg0.anIntArray378[local13] == -1) {
					if (arg0.anIntArray379[local13] != 12345678) {
						Static86.method1660(local154, local158, local162, local142, local146, local150, arg0.anIntArray379[local13], arg0.anIntArray381[local13], arg0.anIntArray389[local13]);
					}
				} else if (Static43.aBoolean57) {
					@Pc(364) int local364 = Static86.anInterface2_1.method1676(arg0.anIntArray378[local13]);
					Static86.method1660(local154, local158, local162, local142, local146, local150, Static43.method879(local364, arg0.anIntArray379[local13]), Static43.method879(local364, arg0.anIntArray381[local13]), Static43.method879(local364, arg0.anIntArray389[local13]));
				} else if (arg0.aBoolean117) {
					Static86.method1663(local154, local158, local162, local142, local146, local150, arg0.anIntArray379[local13], arg0.anIntArray381[local13], arg0.anIntArray389[local13], Static94.anIntArray391[0], Static94.anIntArray391[1], Static94.anIntArray391[3], Static94.anIntArray382[0], Static94.anIntArray382[1], Static94.anIntArray382[3], Static94.anIntArray388[0], Static94.anIntArray388[1], Static94.anIntArray388[3], arg0.anIntArray378[local13]);
				} else {
					Static86.method1663(local154, local158, local162, local142, local146, local150, arg0.anIntArray379[local13], arg0.anIntArray381[local13], arg0.anIntArray389[local13], Static94.anIntArray391[local20], Static94.anIntArray391[local27], Static94.anIntArray391[local37], Static94.anIntArray382[local20], Static94.anIntArray382[local27], Static94.anIntArray382[local37], Static94.anIntArray388[local20], Static94.anIntArray388[local27], Static94.anIntArray388[local37], arg0.anIntArray378[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(III)Lclient!vc;")
	public Class75 method897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass75_1 == null ? null : local8.aClass75_1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!jf;II)V")
	public void method898(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class75 local6 = new Class75();
		local6.aClass5_Sub2_Sub4_8 = arg4;
		local6.anInt3014 = arg1 * 128 + 64;
		local6.anInt3013 = arg2 * 128 + 64;
		local6.anInt3016 = arg3;
		local6.anInt3019 = arg5;
		local6.anInt3015 = arg6;
		if (this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class5_Sub17(arg0, arg1, arg2);
		}
		this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass75_1 = local6;
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(III)V")
	public void method900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass60_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "i", descriptor = "(III)V")
	public void method901(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2892; local13++) {
			@Pc(19) Class39 local19 = local8.aClass39Array3[local13];
			if ((local19.anInt1798 >> 29 & 0x3) == 2 && local19.anInt1799 == arg1 && local19.anInt1796 == arg2) {
				this.method922(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "j", descriptor = "(III)V")
	public void method902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static43.aBoolean58 = true;
		Static43.anInt1186 = arg0;
		Static43.anInt1207 = arg1;
		Static43.anInt1205 = arg2;
		Static43.anInt1201 = -1;
		Static43.anInt1203 = -1;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
	public void method903() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1199; local1++) {
			@Pc(7) Class39 local7 = this.aClass39Array2[local1];
			this.method922(local7);
			this.aClass39Array2[local1] = null;
		}
		this.anInt1199 = 0;
	}

	@OriginalMember(owner = "client!i", name = "k", descriptor = "(III)Lclient!kf;")
	public Class39 method904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2892; local14++) {
			@Pc(20) Class39 local20 = local8.aClass39Array3[local14];
			if ((local20.anInt1798 >> 29 & 0x3) == 2 && local20.anInt1799 == arg1 && local20.anInt1796 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	public void method905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class5_Sub17 local31 = this.aClass5_Sub17ArrayArrayArray1[local10][arg0][arg1] = this.aClass5_Sub17ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2900--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2892; local41++) {
					@Pc(47) Class39 local47 = local31.aClass39Array3[local41];
					if ((local47.anInt1798 >> 29 & 0x3) == 2 && local47.anInt1799 == arg0 && local47.anInt1796 == arg1) {
						local47.anInt1793--;
					}
				}
			}
		}
		if (this.aClass5_Sub17ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass5_Sub17ArrayArrayArray1[0][arg0][arg1] = new Class5_Sub17(0, arg0, arg1);
		}
		this.aClass5_Sub17ArrayArrayArray1[0][arg0][arg1].aClass5_Sub17_1 = local8;
		this.aClass5_Sub17ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIII)Z")
	private boolean method906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static43.anInt1197) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5;
			if (!this.method924(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method924(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method924(local21, local167, local195)) {
				return false;
			} else if (this.method924(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method926(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method924(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3] - arg5, local21 + 1) && this.method924(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method924(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method924(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIIIII)V")
	public void method907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1180 * 128) {
			arg0 = this.anInt1180 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1185 * 128) {
			arg2 = this.anInt1185 * 128 - 1;
		}
		Static43.anInt1197++;
		Static43.anInt1192 = Class5_Sub2_Sub6_Sub2.anIntArray360[arg3];
		Static43.anInt1182 = Class5_Sub2_Sub6_Sub2.anIntArray362[arg3];
		Static43.anInt1195 = Class5_Sub2_Sub6_Sub2.anIntArray360[arg4];
		Static43.anInt1200 = Class5_Sub2_Sub6_Sub2.anIntArray362[arg4];
		Static43.aBooleanArrayArray1 = Static43.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static43.anInt1194 = arg0;
		Static43.anInt1206 = arg1;
		Static43.anInt1202 = arg2;
		Static43.anInt1188 = arg0 / 128;
		Static43.anInt1189 = arg2 / 128;
		Static43.anInt1184 = arg5;
		Static43.anInt1190 = Static43.anInt1188 - 25;
		if (Static43.anInt1190 < 0) {
			Static43.anInt1190 = 0;
		}
		Static43.anInt1181 = Static43.anInt1189 - 25;
		if (Static43.anInt1181 < 0) {
			Static43.anInt1181 = 0;
		}
		Static43.anInt1193 = Static43.anInt1188 + 25;
		if (Static43.anInt1193 > this.anInt1180) {
			Static43.anInt1193 = this.anInt1180;
		}
		Static43.anInt1191 = Static43.anInt1189 + 25;
		if (Static43.anInt1191 > this.anInt1185) {
			Static43.anInt1191 = this.anInt1185;
		}
		this.method917();
		Static43.anInt1187 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1183; local128 < this.anInt1196; local128++) {
			@Pc(134) Class5_Sub17[][] local134 = this.aClass5_Sub17ArrayArrayArray1[local128];
			for (local136 = Static43.anInt1190; local136 < Static43.anInt1193; local136++) {
				for (local139 = Static43.anInt1181; local139 < Static43.anInt1191; local139++) {
					@Pc(146) Class5_Sub17 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2899 <= arg5 && (Static43.aBooleanArrayArray1[local136 + 25 - Static43.anInt1188][local139 + 25 - Static43.anInt1189] || this.anIntArrayArrayArray4[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean126 = true;
							local146.aBoolean124 = true;
							if (local146.anInt2892 > 0) {
								local146.aBoolean125 = true;
							} else {
								local146.aBoolean125 = false;
							}
							Static43.anInt1187++;
						} else {
							local146.aBoolean126 = false;
							local146.aBoolean124 = false;
							local146.anInt2898 = 0;
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
		for (@Pc(224) int local224 = this.anInt1183; local224 < this.anInt1196; local224++) {
			@Pc(230) Class5_Sub17[][] local230 = this.aClass5_Sub17ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static43.anInt1188 + local139;
				local241 = Static43.anInt1188 - local139;
				if (local237 >= Static43.anInt1190 || local241 < Static43.anInt1193) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static43.anInt1189 + local249;
						local258 = Static43.anInt1189 - local249;
						@Pc(270) Class5_Sub17 local270;
						if (local237 >= Static43.anInt1190) {
							if (local254 >= Static43.anInt1181) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean126) {
									this.method883(local270, true);
								}
							}
							if (local258 < Static43.anInt1191) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean126) {
									this.method883(local270, true);
								}
							}
						}
						if (local241 < Static43.anInt1193) {
							if (local254 >= Static43.anInt1181) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean126) {
									this.method883(local270, true);
								}
							}
							if (local258 < Static43.anInt1191) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean126) {
									this.method883(local270, true);
								}
							}
						}
						if (Static43.anInt1187 == 0) {
							Static43.aBoolean58 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1183; local136 < this.anInt1196; local136++) {
			@Pc(361) Class5_Sub17[][] local361 = this.aClass5_Sub17ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static43.anInt1188 + local237;
				local249 = Static43.anInt1188 - local237;
				if (local241 >= Static43.anInt1190 || local249 < Static43.anInt1193) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static43.anInt1189 + local254;
						@Pc(389) int local389 = Static43.anInt1189 - local254;
						@Pc(401) Class5_Sub17 local401;
						if (local241 >= Static43.anInt1190) {
							if (local258 >= Static43.anInt1181) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean126) {
									this.method883(local401, false);
								}
							}
							if (local389 < Static43.anInt1191) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean126) {
									this.method883(local401, false);
								}
							}
						}
						if (local249 < Static43.anInt1193) {
							if (local258 >= Static43.anInt1181) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean126) {
									this.method883(local401, false);
								}
							}
							if (local389 < Static43.anInt1191) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean126) {
									this.method883(local401, false);
								}
							}
						}
						if (Static43.anInt1187 == 0) {
							Static43.aBoolean58 = false;
							return;
						}
					}
				}
			}
		}
		Static43.aBoolean58 = false;
	}

	@OriginalMember(owner = "client!i", name = "l", descriptor = "(III)I")
	public int method909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2892; local14++) {
			@Pc(20) Class39 local20 = local8.aClass39Array3[local14];
			if ((local20.anInt1798 >> 29 & 0x3) == 2 && local20.anInt1799 == arg1 && local20.anInt1796 == arg2) {
				return local20.anInt1798;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public void method910(@OriginalArg(0) int arg0) {
		this.anInt1183 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1180; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1185; local7++) {
				if (this.aClass5_Sub17ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass5_Sub17ArrayArrayArray1[arg0][local4][local7] = new Class5_Sub17(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ld;IIIIIII)V")
	private void method911(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static43.anInt1194;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static43.anInt1202;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray4[arg1][arg6][arg7] - Static43.anInt1206;
		@Pc(51) int local51 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static43.anInt1206;
		@Pc(66) int local66 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static43.anInt1206;
		@Pc(79) int local79 = this.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static43.anInt1206;
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
		@Pc(279) int local279 = Static86.anInt2479 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static86.anInt2477 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static86.anInt2479 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static86.anInt2477 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static86.anInt2479 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static86.anInt2477 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static86.anInt2479 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static86.anInt2477 + (local89 << 9) / local265;
		Static86.anInt2481 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static86.aBoolean113 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static86.anInt2476 || local327 > Static86.anInt2476 || local295 > Static86.anInt2476) {
				Static86.aBoolean113 = true;
			}
			if (Static43.aBoolean58 && this.method889(Static43.anInt1207, Static43.anInt1205, local319, local335, local303, local311, local327, local295)) {
				Static43.anInt1201 = arg6;
				Static43.anInt1203 = arg7;
			}
			if (arg0.anInt1848 == -1) {
				if (arg0.anInt1849 != 12345678) {
					Static86.method1660(local319, local335, local303, local311, local327, local295, arg0.anInt1849, arg0.anInt1846, arg0.anInt1852);
				}
			} else if (Static43.aBoolean57) {
				local472 = Static86.anInterface2_1.method1676(arg0.anInt1848);
				Static86.method1660(local319, local335, local303, local311, local327, local295, Static43.method879(local472, arg0.anInt1849), Static43.method879(local472, arg0.anInt1846), Static43.method879(local472, arg0.anInt1852));
			} else if (arg0.aBoolean89) {
				Static86.method1663(local319, local335, local303, local311, local327, local295, arg0.anInt1849, arg0.anInt1846, arg0.anInt1852, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1848);
			} else {
				Static86.method1663(local319, local335, local303, local311, local327, local295, arg0.anInt1849, arg0.anInt1846, arg0.anInt1852, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1848);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static86.aBoolean113 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static86.anInt2476 || local295 > Static86.anInt2476 || local327 > Static86.anInt2476) {
			Static86.aBoolean113 = true;
		}
		if (Static43.aBoolean58 && this.method889(Static43.anInt1207, Static43.anInt1205, local287, local303, local335, local279, local295, local327)) {
			Static43.anInt1201 = arg6;
			Static43.anInt1203 = arg7;
		}
		if (arg0.anInt1848 != -1) {
			if (!Static43.aBoolean57) {
				Static86.method1663(local287, local303, local335, local279, local295, local327, arg0.anInt1853, arg0.anInt1852, arg0.anInt1846, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1848);
				return;
			}
			local472 = Static86.anInterface2_1.method1676(arg0.anInt1848);
			Static86.method1660(local287, local303, local335, local279, local295, local327, Static43.method879(local472, arg0.anInt1853), Static43.method879(local472, arg0.anInt1852), Static43.method879(local472, arg0.anInt1846));
		} else if (arg0.anInt1853 != 12345678) {
			Static86.method1660(local287, local303, local335, local279, local295, local327, arg0.anInt1853, arg0.anInt1852, arg0.anInt1846);
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIILclient!jf;III)Z")
	public boolean method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub2_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method893(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pa;IIIII)V")
	private void method913(@OriginalArg(0) Class5_Sub2_Sub4_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1196) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1180) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1185 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class5_Sub17 local66 = this.aClass5_Sub17ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray4[local17][local24][local34] + this.anIntArrayArrayArray4[local17][local24 + 1][local34] + this.anIntArrayArrayArray4[local17][local24][local34 + 1] + this.anIntArrayArrayArray4[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray4[arg1][arg2][arg3] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class44 local163 = local66.aClass44_1;
									if (local163 != null) {
										@Pc(173) Class5_Sub2_Sub4_Sub7 local173;
										if (local163.aClass5_Sub2_Sub4_2 instanceof Class5_Sub2_Sub4_Sub7) {
											local173 = (Class5_Sub2_Sub4_Sub7) local163.aClass5_Sub2_Sub4_2;
											Static83.method1569(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass5_Sub2_Sub4_3 instanceof Class5_Sub2_Sub4_Sub7) {
											local173 = (Class5_Sub2_Sub4_Sub7) local163.aClass5_Sub2_Sub4_3;
											Static83.method1569(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2892; local237++) {
										@Pc(243) Class39 local243 = local66.aClass39Array3[local237];
										if (local243 != null && local243.aClass5_Sub2_Sub4_1 instanceof Class5_Sub2_Sub4_Sub7) {
											@Pc(253) Class5_Sub2_Sub4_Sub7 local253 = (Class5_Sub2_Sub4_Sub7) local243.aClass5_Sub2_Sub4_1;
											@Pc(261) int local261 = local243.anInt1791 + 1 - local243.anInt1799;
											@Pc(269) int local269 = local243.anInt1789 + 1 - local243.anInt1796;
											Static83.method1569(arg0, local253, (local243.anInt1799 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1796 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
	public void method914() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1196; local1++) {
			for (local4 = 0; local4 < this.anInt1180; local4++) {
				for (local7 = 0; local7 < this.anInt1185; local7++) {
					this.aClass5_Sub17ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static43.anInt1198; local4++) {
			for (local7 = 0; local7 < Static43.anIntArray186[local4]; local7++) {
				Static43.aClass47ArrayArray1[local4][local7] = null;
			}
			Static43.anIntArray186[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1199; local7++) {
			this.aClass39Array2[local7] = null;
		}
		this.anInt1199 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static43.aClass39Array1.length; local76++) {
			Static43.aClass39Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IIII)Z")
	private boolean method915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method926(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method924(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2] - arg3, local15 + 1) && this.method924(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method924(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method924(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!i", name = "m", descriptor = "(III)I")
	public int method916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass44_1 == null ? 0 : local8.aClass44_1.anInt1910;
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "()V")
	private void method917() {
		@Pc(3) int local3 = Static43.anIntArray186[Static43.anInt1184];
		@Pc(7) Class47[] local7 = Static43.aClass47ArrayArray1[Static43.anInt1184];
		Static43.anInt1204 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class47 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2007 == 1) {
				local27 = local16.anInt2013 + 25 - Static43.anInt1188;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2000 + 25 - Static43.anInt1189;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2025 + 25 - Static43.anInt1189;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static43.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static43.anInt1194 - local16.anInt2012;
						if (local79 > 32) {
							local16.anInt2026 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2026 = 2;
							local79 = -local79;
						}
						local16.anInt2005 = (local16.anInt2001 - Static43.anInt1202 << 8) / local79;
						local16.anInt2009 = (local16.anInt2017 - Static43.anInt1202 << 8) / local79;
						local16.anInt2015 = (local16.anInt2010 - Static43.anInt1206 << 8) / local79;
						local16.anInt2014 = (local16.anInt2021 - Static43.anInt1206 << 8) / local79;
						Static43.aClass47Array1[Static43.anInt1204++] = local16;
					}
				}
			} else if (local16.anInt2007 == 2) {
				local27 = local16.anInt2000 + 25 - Static43.anInt1189;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2013 + 25 - Static43.anInt1188;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2002 + 25 - Static43.anInt1188;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static43.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static43.anInt1202 - local16.anInt2001;
						if (local79 > 32) {
							local16.anInt2026 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2026 = 4;
							local79 = -local79;
						}
						local16.anInt2016 = (local16.anInt2012 - Static43.anInt1194 << 8) / local79;
						local16.anInt2011 = (local16.anInt2018 - Static43.anInt1194 << 8) / local79;
						local16.anInt2015 = (local16.anInt2010 - Static43.anInt1206 << 8) / local79;
						local16.anInt2014 = (local16.anInt2021 - Static43.anInt1206 << 8) / local79;
						Static43.aClass47Array1[Static43.anInt1204++] = local16;
					}
				}
			} else if (local16.anInt2007 == 4) {
				local27 = local16.anInt2010 - Static43.anInt1206;
				if (local27 > 128) {
					local40 = local16.anInt2000 + 25 - Static43.anInt1189;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2025 + 25 - Static43.anInt1189;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2013 + 25 - Static43.anInt1188;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2002 + 25 - Static43.anInt1188;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static43.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2026 = 5;
							local16.anInt2016 = (local16.anInt2012 - Static43.anInt1194 << 8) / local27;
							local16.anInt2011 = (local16.anInt2018 - Static43.anInt1194 << 8) / local27;
							local16.anInt2005 = (local16.anInt2001 - Static43.anInt1202 << 8) / local27;
							local16.anInt2009 = (local16.anInt2017 - Static43.anInt1202 << 8) / local27;
							Static43.aClass47Array1[Static43.anInt1204++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "n", descriptor = "(III)I")
	public int method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass60_1 == null ? 0 : local8.aClass60_1.anInt2537;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!jf;Lclient!jf;IIII)V")
	public void method919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub4 arg4, @OriginalArg(5) Class5_Sub2_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class44 local8 = new Class44();
		local8.anInt1910 = arg8;
		local8.anInt1904 = arg9;
		local8.anInt1911 = arg1 * 128 + 64;
		local8.anInt1905 = arg2 * 128 + 64;
		local8.anInt1908 = arg3;
		local8.aClass5_Sub2_Sub4_2 = arg4;
		local8.aClass5_Sub2_Sub4_3 = arg5;
		local8.anInt1903 = arg6;
		local8.anInt1907 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass5_Sub17ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass5_Sub17ArrayArrayArray1[local45][arg1][arg2] = new Class5_Sub17(local45, arg1, arg2);
			}
		}
		this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass44_1 = local8;
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(IIII)Z")
	private boolean method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method926(arg0, arg1, arg2)) {
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
				if (local11 > Static43.anInt1194) {
					if (!this.method924(local11, local26, local15)) {
						return false;
					}
					if (!this.method924(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method924(local11, local30, local15)) {
						return false;
					}
					if (!this.method924(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method924(local11, local34, local15)) {
					return false;
				}
				if (!this.method924(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static43.anInt1202) {
					if (!this.method924(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method924(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method924(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method924(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method924(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method924(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static43.anInt1194) {
					if (!this.method924(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method924(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method924(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method924(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method924(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method924(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static43.anInt1202) {
					if (!this.method924(local11, local26, local15)) {
						return false;
					}
					if (!this.method924(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method924(local11, local30, local15)) {
						return false;
					}
					if (!this.method924(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method924(local11, local34, local15)) {
					return false;
				}
				if (!this.method924(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method924(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method924(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method924(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method924(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method924(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIILclient!jf;ILclient!jf;Lclient!jf;)V")
	public void method921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub2_Sub4 arg6, @OriginalArg(7) Class5_Sub2_Sub4 arg7) {
		@Pc(3) Class56 local3 = new Class56();
		local3.aClass5_Sub2_Sub4_6 = arg4;
		local3.anInt2337 = arg1 * 128 + 64;
		local3.anInt2336 = arg2 * 128 + 64;
		local3.anInt2347 = arg3;
		local3.anInt2333 = arg5;
		local3.aClass5_Sub2_Sub4_5 = arg6;
		local3.aClass5_Sub2_Sub4_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class5_Sub17 local43 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2892; local47++) {
				if ((local43.aClass39Array3[local47].anInt1795 & 0x100) == 256 && local43.aClass39Array3[local47].aClass5_Sub2_Sub4_1 instanceof Class5_Sub2_Sub4_Sub2) {
					@Pc(71) Class5_Sub2_Sub4_Sub2 local71 = (Class5_Sub2_Sub4_Sub2) local43.aClass39Array3[local47].aClass5_Sub2_Sub4_1;
					local71.method419();
					if (local71.anInt2379 > local34) {
						local34 = local71.anInt2379;
					}
				}
			}
		}
		local3.anInt2340 = local34;
		if (this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2] = new Class5_Sub17(arg0, arg1, arg2);
		}
		this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].aClass56_1 = local3;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!kf;)V")
	private void method922(@OriginalArg(0) Class39 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1799; local2 <= arg0.anInt1791; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1796; local6 <= arg0.anInt1789; local6++) {
				@Pc(17) Class5_Sub17 local17 = this.aClass5_Sub17ArrayArrayArray1[arg0.anInt1793][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2892; local21++) {
						if (local17.aClass39Array3[local21] == arg0) {
							local17.anInt2892--;
							for (local36 = local21; local36 < local17.anInt2892; local36++) {
								local17.aClass39Array3[local36] = local17.aClass39Array3[local36 + 1];
								local17.anIntArray439[local36] = local17.anIntArray439[local36 + 1];
							}
							local17.aClass39Array3[local17.anInt2892] = null;
							break;
						}
					}
					local17.anInt2894 = 0;
					for (local36 = 0; local36 < local17.anInt2892; local36++) {
						local17.anInt2894 |= local17.anIntArray439[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIILclient!jf;IIZ)Z")
	public boolean method923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub2_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method893(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!i", name = "o", descriptor = "(III)Z")
	private boolean method924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static43.anInt1204; local1++) {
			@Pc(6) Class47 local6 = Static43.aClass47Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2026 == 1) {
				local15 = local6.anInt2012 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2001 + (local6.anInt2005 * local15 >> 8);
					local37 = local6.anInt2017 + (local6.anInt2009 * local15 >> 8);
					local47 = local6.anInt2010 + (local6.anInt2015 * local15 >> 8);
					local57 = local6.anInt2021 + (local6.anInt2014 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2026 == 2) {
				local15 = arg0 - local6.anInt2012;
				if (local15 > 0) {
					local27 = local6.anInt2001 + (local6.anInt2005 * local15 >> 8);
					local37 = local6.anInt2017 + (local6.anInt2009 * local15 >> 8);
					local47 = local6.anInt2010 + (local6.anInt2015 * local15 >> 8);
					local57 = local6.anInt2021 + (local6.anInt2014 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2026 == 3) {
				local15 = local6.anInt2001 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2012 + (local6.anInt2016 * local15 >> 8);
					local37 = local6.anInt2018 + (local6.anInt2011 * local15 >> 8);
					local47 = local6.anInt2010 + (local6.anInt2015 * local15 >> 8);
					local57 = local6.anInt2021 + (local6.anInt2014 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2026 == 4) {
				local15 = arg2 - local6.anInt2001;
				if (local15 > 0) {
					local27 = local6.anInt2012 + (local6.anInt2016 * local15 >> 8);
					local37 = local6.anInt2018 + (local6.anInt2011 * local15 >> 8);
					local47 = local6.anInt2010 + (local6.anInt2015 * local15 >> 8);
					local57 = local6.anInt2021 + (local6.anInt2014 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2026 == 5) {
				local15 = arg1 - local6.anInt2010;
				if (local15 > 0) {
					local27 = local6.anInt2012 + (local6.anInt2016 * local15 >> 8);
					local37 = local6.anInt2018 + (local6.anInt2011 * local15 >> 8);
					local47 = local6.anInt2001 + (local6.anInt2005 * local15 >> 8);
					local57 = local6.anInt2017 + (local6.anInt2009 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!i", name = "p", descriptor = "(III)V")
	public void method925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass56_1 = null;
		}
	}

	@OriginalMember(owner = "client!i", name = "q", descriptor = "(III)Z")
	private boolean method926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static43.anInt1197) {
			return false;
		} else if (local8 == Static43.anInt1197) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method924(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2], local27 + 1) && this.method924(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local27 + 1) && this.method924(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method924(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static43.anInt1197;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static43.anInt1197;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(IIII)V")
	public void method927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2].anInt2899 = arg3;
		}
	}

	@OriginalMember(owner = "client!i", name = "e", descriptor = "(IIII)I")
	public int method928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub17 local8 = this.aClass5_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass44_1 != null && local8.aClass44_1.anInt1910 == arg3) {
			return local8.aClass44_1.anInt1904 & 0xFF;
		} else if (local8.aClass60_1 != null && local8.aClass60_1.anInt2537 == arg3) {
			return local8.aClass60_1.anInt2544 & 0xFF;
		} else if (local8.aClass75_1 != null && local8.aClass75_1.anInt3019 == arg3) {
			return local8.aClass75_1.anInt3015 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2892; local56++) {
				if (local8.aClass39Array3[local56].anInt1798 == arg3) {
					return local8.aClass39Array3[local56].anInt1795 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!i", name = "r", descriptor = "(III)V")
	public void method929() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1196; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1180; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1185; local7++) {
					@Pc(17) Class5_Sub17 local17 = this.aClass5_Sub17ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class44 local22 = local17.aClass44_1;
						if (local22 != null && local22.aClass5_Sub2_Sub4_2 instanceof Class5_Sub2_Sub4_Sub7) {
							@Pc(32) Class5_Sub2_Sub4_Sub7 local32 = (Class5_Sub2_Sub4_Sub7) local22.aClass5_Sub2_Sub4_2;
							this.method913(local32, local1, local4, local7, 1, 1);
							if (local22.aClass5_Sub2_Sub4_3 instanceof Class5_Sub2_Sub4_Sub7) {
								@Pc(48) Class5_Sub2_Sub4_Sub7 local48 = (Class5_Sub2_Sub4_Sub7) local22.aClass5_Sub2_Sub4_3;
								this.method913(local48, local1, local4, local7, 1, 1);
								Static83.method1569(local32, local48, 0, 0, 0, false);
								local22.aClass5_Sub2_Sub4_3 = local48.method1579(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass5_Sub2_Sub4_2 = local32.method1579(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class5_Sub2_Sub4_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2892; local87++) {
							@Pc(93) Class39 local93 = local17.aClass39Array3[local87];
							if (local93 != null && local93.aClass5_Sub2_Sub4_1 instanceof Class5_Sub2_Sub4_Sub7) {
								local103 = (Class5_Sub2_Sub4_Sub7) local93.aClass5_Sub2_Sub4_1;
								this.method913(local103, local1, local4, local7, local93.anInt1791 + 1 - local93.anInt1799, local93.anInt1789 - local93.anInt1796 + 1);
								local93.aClass5_Sub2_Sub4_1 = local103.method1579(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class75 local142 = local17.aClass75_1;
						if (local142 != null && local142.aClass5_Sub2_Sub4_8 instanceof Class5_Sub2_Sub4_Sub7) {
							local103 = (Class5_Sub2_Sub4_Sub7) local142.aClass5_Sub2_Sub4_8;
							this.method892(local103, local1, local4, local7);
							local142.aClass5_Sub2_Sub4_8 = local103.method1579(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}
}
