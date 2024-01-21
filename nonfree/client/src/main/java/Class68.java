import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class68 {

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
	private int anInt2642 = 0;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "I")
	private int anInt2647 = 0;

	@OriginalMember(owner = "client!rf", name = "R", descriptor = "[Lclient!sb;")
	private final Class71[] aClass71Array2 = new Class71[5000];

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray76 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "[[I")
	private final int[][] anIntArrayArray77 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
	private final int anInt2650;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	private final int anInt2635;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	private final int anInt2639;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[[[Lclient!ta;")
	private final Class1_Sub23[][][] aClass1_Sub23ArrayArrayArray1;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III[[[I)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2650 = arg0;
		this.anInt2635 = arg1;
		this.anInt2639 = arg2;
		this.aClass1_Sub23ArrayArrayArray1 = new Class1_Sub23[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method1874();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!e;IIIIII)V")
	private void method1829(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray107.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray107[local5] - Static107.anInt2634;
			local20 = arg0.anIntArray101[local5] - Static107.anInt2624;
			local27 = arg0.anIntArray108[local5] - Static107.anInt2628;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray111 != null) {
				Static29.anIntArray110[local5] = local37;
				Static29.anIntArray105[local5] = local59;
				Static29.anIntArray112[local5] = local69;
			}
			Static29.anIntArray114[local5] = Static114.anInt2812 + (local37 << 9) / local69;
			Static29.anIntArray109[local5] = Static114.anInt2813 + (local59 << 9) / local69;
		}
		Static114.anInt2814 = 0;
		local3 = arg0.anIntArray104.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray104[local13];
			local27 = arg0.anIntArray103[local13];
			local37 = arg0.anIntArray106[local13];
			@Pc(142) int local142 = Static29.anIntArray114[local20];
			@Pc(146) int local146 = Static29.anIntArray114[local27];
			@Pc(150) int local150 = Static29.anIntArray114[local37];
			@Pc(154) int local154 = Static29.anIntArray109[local20];
			@Pc(158) int local158 = Static29.anIntArray109[local27];
			@Pc(162) int local162 = Static29.anIntArray109[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static114.aBoolean110 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static114.anInt2820 || local146 > Static114.anInt2820 || local150 > Static114.anInt2820) {
					Static114.aBoolean110 = true;
				}
				if (Static107.aBoolean104 && this.method1843(Static107.anInt2631, Static107.anInt2632, local154, local158, local162, local142, local146, local150)) {
					Static107.anInt2641 = arg5;
					Static107.anInt2649 = arg6;
				}
				if (arg0.anIntArray111 == null || arg0.anIntArray111[local13] == -1) {
					if (arg0.anIntArray102[local13] != 12345678) {
						Static114.method2002(local154, local158, local162, local142, local146, local150, arg0.anIntArray102[local13], arg0.anIntArray113[local13], arg0.anIntArray115[local13]);
					}
				} else if (Static107.aBoolean103) {
					@Pc(364) int local364 = Static114.anInterface3_1.method1034(arg0.anIntArray111[local13]);
					Static114.method2002(local154, local158, local162, local142, local146, local150, Static107.method1828(local364, arg0.anIntArray102[local13]), Static107.method1828(local364, arg0.anIntArray113[local13]), Static107.method1828(local364, arg0.anIntArray115[local13]));
				} else if (arg0.aBoolean27) {
					Static114.method1992(local154, local158, local162, local142, local146, local150, arg0.anIntArray102[local13], arg0.anIntArray113[local13], arg0.anIntArray115[local13], Static29.anIntArray110[0], Static29.anIntArray110[1], Static29.anIntArray110[3], Static29.anIntArray105[0], Static29.anIntArray105[1], Static29.anIntArray105[3], Static29.anIntArray112[0], Static29.anIntArray112[1], Static29.anIntArray112[3], arg0.anIntArray111[local13]);
				} else {
					Static114.method1992(local154, local158, local162, local142, local146, local150, arg0.anIntArray102[local13], arg0.anIntArray113[local13], arg0.anIntArray115[local13], Static29.anIntArray110[local20], Static29.anIntArray110[local27], Static29.anIntArray110[local37], Static29.anIntArray105[local20], Static29.anIntArray105[local27], Static29.anIntArray105[local37], Static29.anIntArray112[local20], Static29.anIntArray112[local27], Static29.anIntArray112[local37], arg0.anIntArray111[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ta;Z)V")
	private void method1830(@OriginalArg(0) Class1_Sub23 arg0, @OriginalArg(1) boolean arg1) {
		Static107.aClass53_13.method1449(arg0);
		while (true) {
			@Pc(8) Class1_Sub23 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub23[][] local31;
			@Pc(49) Class1_Sub23 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class63 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class71 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class1_Sub23 var35;
										while (true) {
											do {
												local8 = (Class1_Sub23) Static107.aClass53_13.method1452();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean107);
											local17 = local8.anInt2776;
											local20 = local8.anInt2774;
											local23 = local8.anInt2781;
											local26 = local8.anInt2779;
											local31 = this.aClass1_Sub23ArrayArrayArray1[local23];
											if (!local8.aBoolean108) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub23ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean107) {
														continue;
													}
												}
												if (local17 <= Static107.anInt2627 && local17 > Static107.anInt2645) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean108 || (local8.anInt2780 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static107.anInt2627 && local17 < Static107.anInt2651 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean108 || (local8.anInt2780 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static107.anInt2640 && local20 > Static107.anInt2630) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean108 || (local8.anInt2780 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static107.anInt2640 && local20 < Static107.anInt2633 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean107 && (local49.aBoolean108 || (local8.anInt2780 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean108 = false;
											if (local8.aClass1_Sub23_1 != null) {
												local49 = local8.aClass1_Sub23_1;
												if (local49.aClass13_1 == null) {
													if (local49.aClass16_1 != null && !this.method1851(0, local17, local20)) {
														this.method1829(local49.aClass16_1, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local17, local20);
													}
												} else if (!this.method1851(0, local17, local20)) {
													this.method1836(local49.aClass13_1, 0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local17, local20);
												}
												@Pc(225) Class63 local225 = local49.aClass63_1;
												if (local225 != null) {
													local225.aClass1_Sub3_Sub4_6.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local225.anInt2457 - Static107.anInt2634, local225.anInt2453 - Static107.anInt2624, local225.anInt2450 - Static107.anInt2628, local225.anInt2448);
												}
												for (local251 = 0; local251 < local49.anInt2783; local251++) {
													var12 = local49.aClass71Array3[local251];
													if (var12 != null) {
														var12.aClass1_Sub3_Sub4_8.method2143(var12.anInt2686, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, var12.anInt2673 - Static107.anInt2634, var12.anInt2677 - Static107.anInt2624, var12.anInt2690 - Static107.anInt2628, var12.anInt2681);
													}
												}
											}
											var24 = false;
											if (local8.aClass13_1 == null) {
												if (local8.aClass16_1 != null && !this.method1851(local26, local17, local20)) {
													var24 = true;
													this.method1829(local8.aClass16_1, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local17, local20);
												}
											} else if (!this.method1851(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass13_1.anInt752 != 12345678 || Static107.aBoolean104 && local23 <= Static107.anInt2638) {
													this.method1836(local8.aClass13_1, local26, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class63 local350 = local8.aClass63_1;
											@Pc(353) Class26 local353 = local8.aClass26_1;
											if (local350 != null || local353 != null) {
												if (Static107.anInt2627 == local17) {
													var23++;
												} else if (Static107.anInt2627 < local17) {
													var23 += 2;
												}
												if (Static107.anInt2640 == local20) {
													var23 += 3;
												} else if (Static107.anInt2640 > local20) {
													var23 += 6;
												}
												local251 = Static107.anIntArray404[var23];
												local8.anInt2778 = Static107.anIntArray407[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2458 & Static107.anIntArray406[var23]) == 0) {
													local8.anInt2782 = 0;
												} else if (local350.anInt2458 == 16) {
													local8.anInt2782 = 3;
													local8.anInt2777 = Static107.anIntArray408[var23];
													local8.anInt2773 = 3 - local8.anInt2777;
												} else if (local350.anInt2458 == 32) {
													local8.anInt2782 = 6;
													local8.anInt2777 = Static107.anIntArray403[var23];
													local8.anInt2773 = 6 - local8.anInt2777;
												} else if (local350.anInt2458 == 64) {
													local8.anInt2782 = 12;
													local8.anInt2777 = Static107.anIntArray402[var23];
													local8.anInt2773 = 12 - local8.anInt2777;
												} else {
													local8.anInt2782 = 9;
													local8.anInt2777 = Static107.anIntArray405[var23];
													local8.anInt2773 = 9 - local8.anInt2777;
												}
												if ((local350.anInt2458 & local251) != 0 && !this.method1866(local26, local17, local20, local350.anInt2458)) {
													local350.aClass1_Sub3_Sub4_6.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local350.anInt2457 - Static107.anInt2634, local350.anInt2453 - Static107.anInt2624, local350.anInt2450 - Static107.anInt2628, local350.anInt2448);
												}
												if ((local350.anInt2455 & local251) != 0 && !this.method1866(local26, local17, local20, local350.anInt2455)) {
													local350.aClass1_Sub3_Sub4_7.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local350.anInt2457 - Static107.anInt2634, local350.anInt2453 - Static107.anInt2624, local350.anInt2450 - Static107.anInt2628, local350.anInt2448);
												}
											}
											if (local353 != null && !this.method1852(local26, local17, local20, local353.aClass1_Sub3_Sub4_2.anInt3024)) {
												if ((local353.anInt1058 & local251) != 0) {
													local353.aClass1_Sub3_Sub4_2.method2143(local353.anInt1053, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local353.anInt1052 - Static107.anInt2634, local353.anInt1061 - Static107.anInt2624, local353.anInt1054 - Static107.anInt2628, local353.anInt1055);
												} else if ((local353.anInt1058 & 0x300) != 0) {
													local588 = local353.anInt1052 - Static107.anInt2634;
													local593 = local353.anInt1061 - Static107.anInt2624;
													local598 = local353.anInt1054 - Static107.anInt2628;
													local601 = local353.anInt1053;
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
													if ((local353.anInt1058 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static107.anIntArray398[local601];
														local645 = local598 + Static107.anIntArray397[local601];
														local353.aClass1_Sub3_Sub4_2.method2143(local601 * 512 + 256, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local639, local593, local645, local353.anInt1055);
													}
													if ((local353.anInt1058 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static107.anIntArray399[local601];
														local645 = local598 + Static107.anIntArray401[local601];
														local353.aClass1_Sub3_Sub4_2.method2143(local601 * 512 + 1280 & 0x7FF, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local639, local593, local645, local353.anInt1055);
													}
												}
											}
											if (var24) {
												@Pc(706) Class22 local706 = local8.aClass22_1;
												if (local706 != null) {
													local706.aClass1_Sub3_Sub4_1.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local706.anInt956 - Static107.anInt2634, local706.anInt955 - Static107.anInt2624, local706.anInt949 - Static107.anInt2628, local706.anInt957);
												}
												@Pc(733) Class52 local733 = local8.aClass52_1;
												if (local733 != null && local733.anInt1884 == 0) {
													if (local733.aClass1_Sub3_Sub4_3 != null) {
														local733.aClass1_Sub3_Sub4_3.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local733.anInt1886 - Static107.anInt2634, local733.anInt1890 - Static107.anInt2624, local733.anInt1892 - Static107.anInt2628, local733.anInt1883);
													}
													if (local733.aClass1_Sub3_Sub4_5 != null) {
														local733.aClass1_Sub3_Sub4_5.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local733.anInt1886 - Static107.anInt2634, local733.anInt1890 - Static107.anInt2624, local733.anInt1892 - Static107.anInt2628, local733.anInt1883);
													}
													if (local733.aClass1_Sub3_Sub4_4 != null) {
														local733.aClass1_Sub3_Sub4_4.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local733.anInt1886 - Static107.anInt2634, local733.anInt1890 - Static107.anInt2624, local733.anInt1892 - Static107.anInt2628, local733.anInt1883);
													}
												}
											}
											local588 = local8.anInt2780;
											if (local588 != 0) {
												if (local17 < Static107.anInt2627 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean107) {
														Static107.aClass53_13.method1449(var35);
													}
												}
												if (local20 < Static107.anInt2640 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean107) {
														Static107.aClass53_13.method1449(var35);
													}
												}
												if (local17 > Static107.anInt2627 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean107) {
														Static107.aClass53_13.method1449(var35);
													}
												}
												if (local20 > Static107.anInt2640 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean107) {
														Static107.aClass53_13.method1449(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2782 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2783; var23++) {
												if (local8.aClass71Array3[var23].anInt2671 != Static107.anInt2643 && (local8.anIntArray418[var23] & local8.anInt2782) == local8.anInt2777) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass63_1;
												if (!this.method1866(local26, local17, local20, local952.anInt2458)) {
													local952.aClass1_Sub3_Sub4_6.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local952.anInt2457 - Static107.anInt2634, local952.anInt2453 - Static107.anInt2624, local952.anInt2450 - Static107.anInt2628, local952.anInt2448);
												}
												local8.anInt2782 = 0;
											}
										}
										if (!local8.aBoolean109) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt2783;
											local8.aBoolean109 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass71Array3[local251];
												if (var12.anInt2671 != Static107.anInt2643) {
													for (local1011 = var12.anInt2689; local1011 <= var12.anInt2687; local1011++) {
														for (local588 = var12.anInt2691; local588 <= var12.anInt2675; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean108) {
																local8.aBoolean109 = true;
																continue label568;
															}
															if (var35.anInt2782 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt2689) {
																	local598++;
																}
																if (local1011 < var12.anInt2687) {
																	local598 += 4;
																}
																if (local588 > var12.anInt2691) {
																	local598 += 8;
																}
																if (local588 < var12.anInt2675) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt2782) == local8.anInt2773) {
																	local8.aBoolean109 = true;
																	continue label568;
																}
															}
														}
													}
													Static107.aClass71Array1[var23++] = var12;
													local588 = Static107.anInt2627 - var12.anInt2689;
													local593 = var12.anInt2687 - Static107.anInt2627;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static107.anInt2640 - var12.anInt2691;
													local601 = var12.anInt2675 - Static107.anInt2640;
													if (local601 > local598) {
														var12.anInt2679 = local588 + local601;
													} else {
														var12.anInt2679 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class71 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static107.aClass71Array1[local588];
													if (local1135.anInt2671 != Static107.anInt2643) {
														if (local1135.anInt2679 > local1126) {
															local1126 = local1135.anInt2679;
															local1011 = local588;
														} else if (local1135.anInt2679 == local1126) {
															local598 = local1135.anInt2673 - Static107.anInt2634;
															local601 = local1135.anInt2690 - Static107.anInt2628;
															local610 = Static107.aClass71Array1[local1011].anInt2673 - Static107.anInt2634;
															var19 = Static107.aClass71Array1[local1011].anInt2690 - Static107.anInt2628;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static107.aClass71Array1[local1011];
												local1135.anInt2671 = Static107.anInt2643;
												if (!this.method1837(local26, local1135.anInt2689, local1135.anInt2687, local1135.anInt2691, local1135.anInt2675, local1135.aClass1_Sub3_Sub4_8.anInt3024)) {
													local1135.aClass1_Sub3_Sub4_8.method2143(local1135.anInt2686, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local1135.anInt2673 - Static107.anInt2634, local1135.anInt2677 - Static107.anInt2624, local1135.anInt2690 - Static107.anInt2628, local1135.anInt2681);
												}
												for (local598 = local1135.anInt2689; local598 <= local1135.anInt2687; local598++) {
													for (local601 = local1135.anInt2691; local601 <= local1135.anInt2675; local601++) {
														@Pc(1260) Class1_Sub23 local1260 = local31[local598][local601];
														if (local1260.anInt2782 != 0) {
															Static107.aClass53_13.method1449(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean107) {
															Static107.aClass53_13.method1449(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean109) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean109 = false;
											break;
										}
									}
								} while (!local8.aBoolean107);
							} while (local8.anInt2782 != 0);
							if (local17 > Static107.anInt2627 || local17 <= Static107.anInt2645) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean107);
						if (local17 < Static107.anInt2627 || local17 >= Static107.anInt2651 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean107);
					if (local20 > Static107.anInt2640 || local20 <= Static107.anInt2630) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean107);
				if (local20 < Static107.anInt2640 || local20 >= Static107.anInt2633 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean107);
			local8.aBoolean107 = false;
			Static107.anInt2637--;
			@Pc(1402) Class52 local1402 = local8.aClass52_1;
			if (local1402 != null && local1402.anInt1884 != 0) {
				if (local1402.aClass1_Sub3_Sub4_3 != null) {
					local1402.aClass1_Sub3_Sub4_3.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local1402.anInt1886 - Static107.anInt2634, local1402.anInt1890 - Static107.anInt2624 - local1402.anInt1884, local1402.anInt1892 - Static107.anInt2628, local1402.anInt1883);
				}
				if (local1402.aClass1_Sub3_Sub4_5 != null) {
					local1402.aClass1_Sub3_Sub4_5.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local1402.anInt1886 - Static107.anInt2634, local1402.anInt1890 - Static107.anInt2624 - local1402.anInt1884, local1402.anInt1892 - Static107.anInt2628, local1402.anInt1883);
				}
				if (local1402.aClass1_Sub3_Sub4_4 != null) {
					local1402.aClass1_Sub3_Sub4_4.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local1402.anInt1886 - Static107.anInt2634, local1402.anInt1890 - Static107.anInt2624 - local1402.anInt1884, local1402.anInt1892 - Static107.anInt2628, local1402.anInt1883);
				}
			}
			if (local8.anInt2778 != 0) {
				@Pc(1497) Class26 local1497 = local8.aClass26_1;
				if (local1497 != null && !this.method1852(local26, local17, local20, local1497.aClass1_Sub3_Sub4_2.anInt3024)) {
					if ((local1497.anInt1058 & local8.anInt2778) != 0) {
						local1497.aClass1_Sub3_Sub4_2.method2143(local1497.anInt1053, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local1497.anInt1052 - Static107.anInt2634, local1497.anInt1061 - Static107.anInt2624, local1497.anInt1054 - Static107.anInt2628, local1497.anInt1055);
					} else if ((local1497.anInt1058 & 0x300) != 0) {
						local251 = local1497.anInt1052 - Static107.anInt2634;
						local1126 = local1497.anInt1061 - Static107.anInt2624;
						local1011 = local1497.anInt1054 - Static107.anInt2628;
						local588 = local1497.anInt1053;
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
						if ((local1497.anInt1058 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static107.anIntArray398[local588];
							local610 = local1011 + Static107.anIntArray397[local588];
							local1497.aClass1_Sub3_Sub4_2.method2143(local588 * 512 + 256, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local601, local1126, local610, local1497.anInt1055);
						}
						if ((local1497.anInt1058 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static107.anIntArray399[local588];
							local610 = local1011 + Static107.anIntArray401[local588];
							local1497.aClass1_Sub3_Sub4_2.method2143(local588 * 512 + 1280 & 0x7FF, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local601, local1126, local610, local1497.anInt1055);
						}
					}
				}
				local952 = local8.aClass63_1;
				if (local952 != null) {
					if ((local952.anInt2455 & local8.anInt2778) != 0 && !this.method1866(local26, local17, local20, local952.anInt2455)) {
						local952.aClass1_Sub3_Sub4_7.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local952.anInt2457 - Static107.anInt2634, local952.anInt2453 - Static107.anInt2624, local952.anInt2450 - Static107.anInt2628, local952.anInt2448);
					}
					if ((local952.anInt2458 & local8.anInt2778) != 0 && !this.method1866(local26, local17, local20, local952.anInt2458)) {
						local952.aClass1_Sub3_Sub4_6.method2143(0, Static107.anInt2636, Static107.anInt2644, Static107.anInt2648, Static107.anInt2626, local952.anInt2457 - Static107.anInt2634, local952.anInt2453 - Static107.anInt2624, local952.anInt2450 - Static107.anInt2628, local952.anInt2448);
					}
				}
			}
			@Pc(1755) Class1_Sub23 local1755;
			if (local23 < this.anInt2650 - 1) {
				local1755 = this.aClass1_Sub23ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean107) {
					Static107.aClass53_13.method1449(local1755);
				}
			}
			if (local17 < Static107.anInt2627) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean107) {
					Static107.aClass53_13.method1449(local1755);
				}
			}
			if (local20 < Static107.anInt2640) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean107) {
					Static107.aClass53_13.method1449(local1755);
				}
			}
			if (local17 > Static107.anInt2627) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean107) {
					Static107.aClass53_13.method1449(local1755);
				}
			}
			if (local20 > Static107.anInt2640) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean107) {
					Static107.aClass53_13.method1449(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIILclient!od;IIIIII)Z")
	public boolean method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub3_Sub4 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1870(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)V")
	public void method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].anInt2775 = arg3;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Lclient!fa;")
	public Class22 method1833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? null : local8.aClass22_1;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILclient!od;ILclient!od;Lclient!od;)V")
	public void method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub3_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub3_Sub4 arg6, @OriginalArg(7) Class1_Sub3_Sub4 arg7) {
		@Pc(3) Class52 local3 = new Class52();
		local3.aClass1_Sub3_Sub4_4 = arg4;
		local3.anInt1886 = arg1 * 128 + 64;
		local3.anInt1892 = arg2 * 128 + 64;
		local3.anInt1890 = arg3;
		local3.anInt1883 = arg5;
		local3.aClass1_Sub3_Sub4_3 = arg6;
		local3.aClass1_Sub3_Sub4_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub23 local43 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2783; local47++) {
				if ((local43.aClass71Array3[local47].anInt2672 & 0x100) == 256 && local43.aClass71Array3[local47].aClass1_Sub3_Sub4_8 instanceof Class1_Sub3_Sub4_Sub4) {
					@Pc(71) Class1_Sub3_Sub4_Sub4 local71 = (Class1_Sub3_Sub4_Sub4) local43.aClass71Array3[local47].aClass1_Sub3_Sub4_8;
					local71.method634();
					if (local71.anInt3024 > local34) {
						local34 = local71.anInt3024;
					}
				}
			}
		}
		local3.anInt1884 = local34;
		if (this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub23(arg0, arg1, arg2);
		}
		this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local3;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V")
	public void method1835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass22_1 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!da;IIIIIII)V")
	private void method1836(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static107.anInt2634;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static107.anInt2628;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static107.anInt2624;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static107.anInt2624;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static107.anInt2624;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static107.anInt2624;
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
		@Pc(279) int local279 = Static114.anInt2812 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static114.anInt2813 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static114.anInt2812 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static114.anInt2813 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static114.anInt2812 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static114.anInt2813 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static114.anInt2812 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static114.anInt2813 + (local89 << 9) / local265;
		Static114.anInt2814 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static114.aBoolean110 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static114.anInt2820 || local327 > Static114.anInt2820 || local295 > Static114.anInt2820) {
				Static114.aBoolean110 = true;
			}
			if (Static107.aBoolean104 && this.method1843(Static107.anInt2631, Static107.anInt2632, local319, local335, local303, local311, local327, local295)) {
				Static107.anInt2641 = arg6;
				Static107.anInt2649 = arg7;
			}
			if (arg0.anInt756 == -1) {
				if (arg0.anInt752 != 12345678) {
					Static114.method2002(local319, local335, local303, local311, local327, local295, arg0.anInt752, arg0.anInt751, arg0.anInt757);
				}
			} else if (Static107.aBoolean103) {
				local472 = Static114.anInterface3_1.method1034(arg0.anInt756);
				Static114.method2002(local319, local335, local303, local311, local327, local295, Static107.method1828(local472, arg0.anInt752), Static107.method1828(local472, arg0.anInt751), Static107.method1828(local472, arg0.anInt757));
			} else if (arg0.aBoolean22) {
				Static114.method1992(local319, local335, local303, local311, local327, local295, arg0.anInt752, arg0.anInt751, arg0.anInt757, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt756);
			} else {
				Static114.method1992(local319, local335, local303, local311, local327, local295, arg0.anInt752, arg0.anInt751, arg0.anInt757, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt756);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static114.aBoolean110 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static114.anInt2820 || local295 > Static114.anInt2820 || local327 > Static114.anInt2820) {
			Static114.aBoolean110 = true;
		}
		if (Static107.aBoolean104 && this.method1843(Static107.anInt2631, Static107.anInt2632, local287, local303, local335, local279, local295, local327)) {
			Static107.anInt2641 = arg6;
			Static107.anInt2649 = arg7;
		}
		if (arg0.anInt756 != -1) {
			if (!Static107.aBoolean103) {
				Static114.method1992(local287, local303, local335, local279, local295, local327, arg0.anInt758, arg0.anInt757, arg0.anInt751, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt756);
				return;
			}
			local472 = Static114.anInterface3_1.method1034(arg0.anInt756);
			Static114.method2002(local287, local303, local335, local279, local295, local327, Static107.method1828(local472, arg0.anInt758), Static107.method1828(local472, arg0.anInt757), Static107.method1828(local472, arg0.anInt751));
		} else if (arg0.anInt758 != 12345678) {
			Static114.method2002(local287, local303, local335, local279, local295, local327, arg0.anInt758, arg0.anInt757, arg0.anInt751);
			return;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static107.anInt2643) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method1856(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1856(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1856(local21, local167, local195)) {
				return false;
			} else if (this.method1856(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1851(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1856(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1856(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1856(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1856(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!c;IIIII)V")
	private void method1838(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2650) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2635) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2639 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub23 local66 = this.aClass1_Sub23ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class63 local163 = local66.aClass63_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub3_Sub4_Sub1 local173;
										if (local163.aClass1_Sub3_Sub4_6 instanceof Class1_Sub3_Sub4_Sub1) {
											local173 = (Class1_Sub3_Sub4_Sub1) local163.aClass1_Sub3_Sub4_6;
											Static14.method346(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub3_Sub4_7 instanceof Class1_Sub3_Sub4_Sub1) {
											local173 = (Class1_Sub3_Sub4_Sub1) local163.aClass1_Sub3_Sub4_7;
											Static14.method346(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2783; local237++) {
										@Pc(243) Class71 local243 = local66.aClass71Array3[local237];
										if (local243 != null && local243.aClass1_Sub3_Sub4_8 instanceof Class1_Sub3_Sub4_Sub1) {
											@Pc(253) Class1_Sub3_Sub4_Sub1 local253 = (Class1_Sub3_Sub4_Sub1) local243.aClass1_Sub3_Sub4_8;
											@Pc(261) int local261 = local243.anInt2687 + 1 - local243.anInt2689;
											@Pc(269) int local269 = local243.anInt2675 + 1 - local243.anInt2691;
											Static14.method346(arg0, local253, (local243.anInt2689 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2691 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!c;III)V")
	private void method1839(@OriginalArg(0) Class1_Sub3_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub23 local14;
		@Pc(29) Class1_Sub3_Sub4_Sub1 local29;
		if (arg2 < this.anInt2635) {
			local14 = this.aClass1_Sub23ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass1_Sub3_Sub4_1 instanceof Class1_Sub3_Sub4_Sub1) {
				local29 = (Class1_Sub3_Sub4_Sub1) local14.aClass22_1.aClass1_Sub3_Sub4_1;
				Static14.method346(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2635) {
			local14 = this.aClass1_Sub23ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass1_Sub3_Sub4_1 instanceof Class1_Sub3_Sub4_Sub1) {
				local29 = (Class1_Sub3_Sub4_Sub1) local14.aClass22_1.aClass1_Sub3_Sub4_1;
				Static14.method346(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2635 && arg3 < this.anInt2639) {
			local14 = this.aClass1_Sub23ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass1_Sub3_Sub4_1 instanceof Class1_Sub3_Sub4_Sub1) {
				local29 = (Class1_Sub3_Sub4_Sub1) local14.aClass22_1.aClass1_Sub3_Sub4_1;
				Static14.method346(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2635 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub23ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass22_1 != null && local14.aClass22_1.aClass1_Sub3_Sub4_1 instanceof Class1_Sub3_Sub4_Sub1) {
			local29 = (Class1_Sub3_Sub4_Sub1) local14.aClass22_1.aClass1_Sub3_Sub4_1;
			Static14.method346(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IIII)V")
	public void method1841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class26 local14 = local8.aClass26_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1052 = local23 + (local14.anInt1052 - local23) * arg3 / 16;
			local14.anInt1054 = local29 + (local14.anInt1054 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(III)V")
	public void method1842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass63_1 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILclient!od;Lclient!od;IIII)V")
	public void method1844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub3_Sub4 arg4, @OriginalArg(5) Class1_Sub3_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class63 local8 = new Class63();
		local8.anInt2448 = arg8;
		local8.anInt2452 = arg9;
		local8.anInt2457 = arg1 * 128 + 64;
		local8.anInt2450 = arg2 * 128 + 64;
		local8.anInt2453 = arg3;
		local8.aClass1_Sub3_Sub4_6 = arg4;
		local8.aClass1_Sub3_Sub4_7 = arg5;
		local8.anInt2458 = arg6;
		local8.anInt2455 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub23ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub23ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub23(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local8;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILclient!od;IIIIII)V")
	public void method1845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub3_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class26 local6 = new Class26();
		local6.anInt1055 = arg9;
		local6.anInt1056 = arg10;
		local6.anInt1052 = arg1 * 128 + arg7 + 64;
		local6.anInt1054 = arg2 * 128 + arg8 + 64;
		local6.anInt1061 = arg3;
		local6.aClass1_Sub3_Sub4_2 = arg4;
		local6.anInt1058 = arg5;
		local6.anInt1053 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub23ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub23ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub23(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local6;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method1846(@OriginalArg(0) int arg0) {
		this.anInt2647 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2635; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2639; local7++) {
				if (this.aClass1_Sub23ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub23ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub23(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(IIII)I")
	public int method1847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass63_1 != null && local8.aClass63_1.anInt2448 == arg3) {
			return local8.aClass63_1.anInt2452 & 0xFF;
		} else if (local8.aClass26_1 != null && local8.aClass26_1.anInt1055 == arg3) {
			return local8.aClass26_1.anInt1056 & 0xFF;
		} else if (local8.aClass22_1 != null && local8.aClass22_1.anInt957 == arg3) {
			return local8.aClass22_1.anInt951 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2783; local56++) {
				if (local8.aClass71Array3[local56].anInt2681 == arg3) {
					return local8.aClass71Array3[local56].anInt2672 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(III)I")
	public int method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2783; local14++) {
			@Pc(20) Class71 local20 = local8.aClass71Array3[local14];
			if ((local20.anInt2681 >> 29 & 0x3) == 2 && local20.anInt2689 == arg1 && local20.anInt2691 == arg2) {
				return local20.anInt2681;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIILclient!od;III)Z")
	public boolean method1849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub3_Sub4 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1870(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(III)V")
	public void method1850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2783; local13++) {
			@Pc(19) Class71 local19 = local8.aClass71Array3[local13];
			if ((local19.anInt2681 >> 29 & 0x3) == 2 && local19.anInt2689 == arg1 && local19.anInt2691 == arg2) {
				this.method1873(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(III)Z")
	private boolean method1851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static107.anInt2643) {
			return false;
		} else if (local8 == Static107.anInt2643) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1856(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method1856(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method1856(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1856(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static107.anInt2643;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static107.anInt2643;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(IIII)Z")
	private boolean method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1851(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1856(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1856(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1856(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1856(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "(III)V")
	public void method1854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static107.aBoolean104 = true;
		Static107.anInt2638 = arg0;
		Static107.anInt2631 = arg1;
		Static107.anInt2632 = arg2;
		Static107.anInt2641 = -1;
		Static107.anInt2649 = -1;
	}

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "(III)V")
	public void method1855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass52_1 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "(III)Z")
	private boolean method1856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static107.anInt2625; local1++) {
			@Pc(6) Class46 local6 = Static107.aClass46Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1594 == 1) {
				local15 = local6.anInt1589 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1599 + (local6.anInt1596 * local15 >> 8);
					local37 = local6.anInt1598 + (local6.anInt1593 * local15 >> 8);
					local47 = local6.anInt1597 + (local6.anInt1608 * local15 >> 8);
					local57 = local6.anInt1590 + (local6.anInt1600 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1594 == 2) {
				local15 = arg0 - local6.anInt1589;
				if (local15 > 0) {
					local27 = local6.anInt1599 + (local6.anInt1596 * local15 >> 8);
					local37 = local6.anInt1598 + (local6.anInt1593 * local15 >> 8);
					local47 = local6.anInt1597 + (local6.anInt1608 * local15 >> 8);
					local57 = local6.anInt1590 + (local6.anInt1600 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1594 == 3) {
				local15 = local6.anInt1599 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1589 + (local6.anInt1592 * local15 >> 8);
					local37 = local6.anInt1602 + (local6.anInt1606 * local15 >> 8);
					local47 = local6.anInt1597 + (local6.anInt1608 * local15 >> 8);
					local57 = local6.anInt1590 + (local6.anInt1600 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1594 == 4) {
				local15 = arg2 - local6.anInt1599;
				if (local15 > 0) {
					local27 = local6.anInt1589 + (local6.anInt1592 * local15 >> 8);
					local37 = local6.anInt1602 + (local6.anInt1606 * local15 >> 8);
					local47 = local6.anInt1597 + (local6.anInt1608 * local15 >> 8);
					local57 = local6.anInt1590 + (local6.anInt1600 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1594 == 5) {
				local15 = arg1 - local6.anInt1597;
				if (local15 > 0) {
					local27 = local6.anInt1589 + (local6.anInt1592 * local15 >> 8);
					local37 = local6.anInt1602 + (local6.anInt1606 * local15 >> 8);
					local47 = local6.anInt1599 + (local6.anInt1596 * local15 >> 8);
					local57 = local6.anInt1598 + (local6.anInt1593 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "(III)Lclient!qd;")
	public Class63 method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass63_1;
	}

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "(III)V")
	public void method1858() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2650; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2635; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2639; local7++) {
					@Pc(17) Class1_Sub23 local17 = this.aClass1_Sub23ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class63 local22 = local17.aClass63_1;
						if (local22 != null && local22.aClass1_Sub3_Sub4_6 instanceof Class1_Sub3_Sub4_Sub1) {
							@Pc(32) Class1_Sub3_Sub4_Sub1 local32 = (Class1_Sub3_Sub4_Sub1) local22.aClass1_Sub3_Sub4_6;
							this.method1838(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub3_Sub4_7 instanceof Class1_Sub3_Sub4_Sub1) {
								@Pc(48) Class1_Sub3_Sub4_Sub1 local48 = (Class1_Sub3_Sub4_Sub1) local22.aClass1_Sub3_Sub4_7;
								this.method1838(local48, local1, local4, local7, 1, 1);
								Static14.method346(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub3_Sub4_7 = local48.method356(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass1_Sub3_Sub4_6 = local32.method356(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class1_Sub3_Sub4_Sub1 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2783; local87++) {
							@Pc(93) Class71 local93 = local17.aClass71Array3[local87];
							if (local93 != null && local93.aClass1_Sub3_Sub4_8 instanceof Class1_Sub3_Sub4_Sub1) {
								local103 = (Class1_Sub3_Sub4_Sub1) local93.aClass1_Sub3_Sub4_8;
								this.method1838(local103, local1, local4, local7, local93.anInt2687 + 1 - local93.anInt2689, local93.anInt2675 - local93.anInt2691 + 1);
								local93.aClass1_Sub3_Sub4_8 = local103.method356(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class22 local142 = local17.aClass22_1;
						if (local142 != null && local142.aClass1_Sub3_Sub4_1 instanceof Class1_Sub3_Sub4_Sub1) {
							local103 = (Class1_Sub3_Sub4_Sub1) local142.aClass1_Sub3_Sub4_1;
							this.method1839(local103, local1, local4, local7);
							local142.aClass1_Sub3_Sub4_1 = local103.method356(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIILclient!od;II)V")
	public void method1859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub3_Sub4 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class22 local6 = new Class22();
		local6.aClass1_Sub3_Sub4_1 = arg4;
		local6.anInt956 = arg1 * 128 + 64;
		local6.anInt949 = arg2 * 128 + 64;
		local6.anInt955 = arg3;
		local6.anInt957 = arg5;
		local6.anInt951 = arg6;
		if (this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub23(arg0, arg1, arg2);
		}
		this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass22_1 = local6;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "()V")
	public void method1860() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2642; local1++) {
			@Pc(7) Class71 local7 = this.aClass71Array2[local1];
			this.method1873(local7);
			this.aClass71Array2[local1] = null;
		}
		this.anInt2642 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class13 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class13(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub23ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub23ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub23(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class13(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub23ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub23ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub23(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local12;
		} else {
			@Pc(140) Class16 local140 = new Class16(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub23ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub23ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub23(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass16_1 = local140;
		}
	}

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "(III)I")
	public int method1862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass22_1 == null ? 0 : local8.aClass22_1.anInt957;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIILclient!od;IIZ)Z")
	public boolean method1863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub3_Sub4 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1870(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([IIIIII)V")
	public void method1864(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class13 local14 = local8.aClass13_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt754;
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
		local24 = local59.anInt868;
		@Pc(68) int local68 = local59.anInt867;
		@Pc(71) int local71 = local59.anInt865;
		@Pc(74) int local74 = local59.anInt866;
		@Pc(79) int[] local79 = this.anIntArrayArray77[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray76[local68];
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

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "(III)V")
	public void method1865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass26_1 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(IIII)Z")
	private boolean method1866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1851(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static107.anInt2634) {
					if (!this.method1856(local11, local26, local15)) {
						return false;
					}
					if (!this.method1856(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1856(local11, local30, local15)) {
						return false;
					}
					if (!this.method1856(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1856(local11, local34, local15)) {
					return false;
				}
				if (!this.method1856(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static107.anInt2628) {
					if (!this.method1856(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1856(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1856(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1856(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1856(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1856(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static107.anInt2634) {
					if (!this.method1856(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1856(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1856(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1856(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1856(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1856(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static107.anInt2628) {
					if (!this.method1856(local11, local26, local15)) {
						return false;
					}
					if (!this.method1856(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1856(local11, local30, local15)) {
						return false;
					}
					if (!this.method1856(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1856(local11, local34, local15)) {
					return false;
				}
				if (!this.method1856(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1856(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1856(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1856(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1856(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1856(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IIIIII)V")
	public void method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2635 * 128) {
			arg0 = this.anInt2635 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2639 * 128) {
			arg2 = this.anInt2639 * 128 - 1;
		}
		Static107.anInt2643++;
		Static107.anInt2636 = Class1_Sub3_Sub1_Sub4.anIntArray425[arg3];
		Static107.anInt2644 = Class1_Sub3_Sub1_Sub4.anIntArray424[arg3];
		Static107.anInt2648 = Class1_Sub3_Sub1_Sub4.anIntArray425[arg4];
		Static107.anInt2626 = Class1_Sub3_Sub1_Sub4.anIntArray424[arg4];
		Static107.aBooleanArrayArray1 = Static107.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static107.anInt2634 = arg0;
		Static107.anInt2624 = arg1;
		Static107.anInt2628 = arg2;
		Static107.anInt2627 = arg0 / 128;
		Static107.anInt2640 = arg2 / 128;
		Static107.anInt2646 = arg5;
		Static107.anInt2645 = Static107.anInt2627 - 25;
		if (Static107.anInt2645 < 0) {
			Static107.anInt2645 = 0;
		}
		Static107.anInt2630 = Static107.anInt2640 - 25;
		if (Static107.anInt2630 < 0) {
			Static107.anInt2630 = 0;
		}
		Static107.anInt2651 = Static107.anInt2627 + 25;
		if (Static107.anInt2651 > this.anInt2635) {
			Static107.anInt2651 = this.anInt2635;
		}
		Static107.anInt2633 = Static107.anInt2640 + 25;
		if (Static107.anInt2633 > this.anInt2639) {
			Static107.anInt2633 = this.anInt2639;
		}
		this.method1871();
		Static107.anInt2637 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2647; local128 < this.anInt2650; local128++) {
			@Pc(134) Class1_Sub23[][] local134 = this.aClass1_Sub23ArrayArrayArray1[local128];
			for (local136 = Static107.anInt2645; local136 < Static107.anInt2651; local136++) {
				for (local139 = Static107.anInt2630; local139 < Static107.anInt2633; local139++) {
					@Pc(146) Class1_Sub23 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2775 <= arg5 && (Static107.aBooleanArrayArray1[local136 + 25 - Static107.anInt2627][local139 + 25 - Static107.anInt2640] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean108 = true;
							local146.aBoolean107 = true;
							if (local146.anInt2783 > 0) {
								local146.aBoolean109 = true;
							} else {
								local146.aBoolean109 = false;
							}
							Static107.anInt2637++;
						} else {
							local146.aBoolean108 = false;
							local146.aBoolean107 = false;
							local146.anInt2782 = 0;
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
		for (@Pc(224) int local224 = this.anInt2647; local224 < this.anInt2650; local224++) {
			@Pc(230) Class1_Sub23[][] local230 = this.aClass1_Sub23ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static107.anInt2627 + local139;
				local241 = Static107.anInt2627 - local139;
				if (local237 >= Static107.anInt2645 || local241 < Static107.anInt2651) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static107.anInt2640 + local249;
						local258 = Static107.anInt2640 - local249;
						@Pc(270) Class1_Sub23 local270;
						if (local237 >= Static107.anInt2645) {
							if (local254 >= Static107.anInt2630) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean108) {
									this.method1830(local270, true);
								}
							}
							if (local258 < Static107.anInt2633) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean108) {
									this.method1830(local270, true);
								}
							}
						}
						if (local241 < Static107.anInt2651) {
							if (local254 >= Static107.anInt2630) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean108) {
									this.method1830(local270, true);
								}
							}
							if (local258 < Static107.anInt2633) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean108) {
									this.method1830(local270, true);
								}
							}
						}
						if (Static107.anInt2637 == 0) {
							Static107.aBoolean104 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2647; local136 < this.anInt2650; local136++) {
			@Pc(361) Class1_Sub23[][] local361 = this.aClass1_Sub23ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static107.anInt2627 + local237;
				local249 = Static107.anInt2627 - local237;
				if (local241 >= Static107.anInt2645 || local249 < Static107.anInt2651) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static107.anInt2640 + local254;
						@Pc(389) int local389 = Static107.anInt2640 - local254;
						@Pc(401) Class1_Sub23 local401;
						if (local241 >= Static107.anInt2645) {
							if (local258 >= Static107.anInt2630) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean108) {
									this.method1830(local401, false);
								}
							}
							if (local389 < Static107.anInt2633) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean108) {
									this.method1830(local401, false);
								}
							}
						}
						if (local249 < Static107.anInt2651) {
							if (local258 >= Static107.anInt2630) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean108) {
									this.method1830(local401, false);
								}
							}
							if (local389 < Static107.anInt2633) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean108) {
									this.method1830(local401, false);
								}
							}
						}
						if (Static107.anInt2637 == 0) {
							Static107.aBoolean104 = false;
							return;
						}
					}
				}
			}
		}
		Static107.aBoolean104 = false;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)V")
	public void method1868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub23 local31 = this.aClass1_Sub23ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub23ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2781--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2783; local41++) {
					@Pc(47) Class71 local47 = local31.aClass71Array3[local41];
					if ((local47.anInt2681 >> 29 & 0x3) == 2 && local47.anInt2689 == arg0 && local47.anInt2691 == arg1) {
						local47.anInt2674--;
					}
				}
			}
		}
		if (this.aClass1_Sub23ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub23ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub23(0, arg0, arg1);
		}
		this.aClass1_Sub23ArrayArrayArray1[0][arg0][arg1].aClass1_Sub23_1 = local8;
		this.aClass1_Sub23ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "(III)I")
	public int method1869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass26_1 == null ? 0 : local8.aClass26_1.anInt1055;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIILclient!od;IZII)Z")
	private boolean method1870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub3_Sub4 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2635 || local4 >= this.anInt2639) {
					return false;
				}
				@Pc(28) Class1_Sub23 local28 = this.aClass1_Sub23ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2783 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class71 local52 = new Class71();
		local52.anInt2681 = arg11;
		local52.anInt2672 = arg12;
		local52.anInt2674 = arg0;
		local52.anInt2673 = arg5;
		local52.anInt2690 = arg6;
		local52.anInt2677 = arg7;
		local52.aClass1_Sub3_Sub4_8 = arg8;
		local52.anInt2686 = arg9;
		local52.anInt2689 = arg1;
		local52.anInt2691 = arg2;
		local52.anInt2687 = arg1 + arg3 - 1;
		local52.anInt2675 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub23ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub23ArrayArrayArray1[local130][local98][local101] = new Class1_Sub23(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub23 local166 = this.aClass1_Sub23ArrayArrayArray1[arg0][local98][local101];
				local166.aClass71Array3[local166.anInt2783] = local52;
				local166.anIntArray418[local166.anInt2783] = local104;
				local166.anInt2780 |= local104;
				local166.anInt2783++;
			}
		}
		if (arg10) {
			this.aClass71Array2[this.anInt2642++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
	private void method1871() {
		@Pc(3) int local3 = Static107.anIntArray400[Static107.anInt2646];
		@Pc(7) Class46[] local7 = Static107.aClass46ArrayArray1[Static107.anInt2646];
		Static107.anInt2625 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class46 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1595 == 1) {
				local27 = local16.anInt1609 + 25 - Static107.anInt2627;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1588 + 25 - Static107.anInt2640;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1591 + 25 - Static107.anInt2640;
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
						local79 = Static107.anInt2634 - local16.anInt1589;
						if (local79 > 32) {
							local16.anInt1594 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1594 = 2;
							local79 = -local79;
						}
						local16.anInt1596 = (local16.anInt1599 - Static107.anInt2628 << 8) / local79;
						local16.anInt1593 = (local16.anInt1598 - Static107.anInt2628 << 8) / local79;
						local16.anInt1608 = (local16.anInt1597 - Static107.anInt2624 << 8) / local79;
						local16.anInt1600 = (local16.anInt1590 - Static107.anInt2624 << 8) / local79;
						Static107.aClass46Array1[Static107.anInt2625++] = local16;
					}
				}
			} else if (local16.anInt1595 == 2) {
				local27 = local16.anInt1588 + 25 - Static107.anInt2640;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1609 + 25 - Static107.anInt2627;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1607 + 25 - Static107.anInt2627;
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
						local79 = Static107.anInt2628 - local16.anInt1599;
						if (local79 > 32) {
							local16.anInt1594 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1594 = 4;
							local79 = -local79;
						}
						local16.anInt1592 = (local16.anInt1589 - Static107.anInt2634 << 8) / local79;
						local16.anInt1606 = (local16.anInt1602 - Static107.anInt2634 << 8) / local79;
						local16.anInt1608 = (local16.anInt1597 - Static107.anInt2624 << 8) / local79;
						local16.anInt1600 = (local16.anInt1590 - Static107.anInt2624 << 8) / local79;
						Static107.aClass46Array1[Static107.anInt2625++] = local16;
					}
				}
			} else if (local16.anInt1595 == 4) {
				local27 = local16.anInt1597 - Static107.anInt2624;
				if (local27 > 128) {
					local40 = local16.anInt1588 + 25 - Static107.anInt2640;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1591 + 25 - Static107.anInt2640;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1609 + 25 - Static107.anInt2627;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1607 + 25 - Static107.anInt2627;
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
							local16.anInt1594 = 5;
							local16.anInt1592 = (local16.anInt1589 - Static107.anInt2634 << 8) / local27;
							local16.anInt1606 = (local16.anInt1602 - Static107.anInt2634 << 8) / local27;
							local16.anInt1596 = (local16.anInt1599 - Static107.anInt2628 << 8) / local27;
							local16.anInt1593 = (local16.anInt1598 - Static107.anInt2628 << 8) / local27;
							Static107.aClass46Array1[Static107.anInt2625++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "(III)Lclient!sb;")
	public Class71 method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2783; local14++) {
			@Pc(20) Class71 local20 = local8.aClass71Array3[local14];
			if ((local20.anInt2681 >> 29 & 0x3) == 2 && local20.anInt2689 == arg1 && local20.anInt2691 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!sb;)V")
	private void method1873(@OriginalArg(0) Class71 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2689; local2 <= arg0.anInt2687; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2691; local6 <= arg0.anInt2675; local6++) {
				@Pc(17) Class1_Sub23 local17 = this.aClass1_Sub23ArrayArrayArray1[arg0.anInt2674][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2783; local21++) {
						if (local17.aClass71Array3[local21] == arg0) {
							local17.anInt2783--;
							for (local36 = local21; local36 < local17.anInt2783; local36++) {
								local17.aClass71Array3[local36] = local17.aClass71Array3[local36 + 1];
								local17.anIntArray418[local36] = local17.anIntArray418[local36 + 1];
							}
							local17.aClass71Array3[local17.anInt2783] = null;
							break;
						}
					}
					local17.anInt2780 = 0;
					for (local36 = 0; local36 < local17.anInt2783; local36++) {
						local17.anInt2780 |= local17.anIntArray418[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "()V")
	public void method1874() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2650; local1++) {
			for (local4 = 0; local4 < this.anInt2635; local4++) {
				for (local7 = 0; local7 < this.anInt2639; local7++) {
					this.aClass1_Sub23ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static107.anInt2629; local4++) {
			for (local7 = 0; local7 < Static107.anIntArray400[local4]; local7++) {
				Static107.aClass46ArrayArray1[local4][local7] = null;
			}
			Static107.anIntArray400[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2642; local7++) {
			this.aClass71Array2[local7] = null;
		}
		this.anInt2642 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static107.aClass71Array1.length; local76++) {
			Static107.aClass71Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "(III)I")
	public int method1875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass63_1 == null ? 0 : local8.aClass63_1.anInt2448;
	}

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "(III)Lclient!ga;")
	public Class26 method1877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub23 local8 = this.aClass1_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass26_1;
	}
}
