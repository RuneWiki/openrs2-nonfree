import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class30 {

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "[Lclient!mf;")
	private final Class53[] aClass53Array1 = new Class53[5000];

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	private int anInt1130 = 0;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	private int anInt1129 = 0;

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray12 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!hb", name = "Y", descriptor = "[[I")
	private final int[][] anIntArrayArray13 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "I")
	private final int anInt1125;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	private final int anInt1117;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "I")
	private final int anInt1122;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "[[[Lclient!tb;")
	private final Class2_Sub21[][][] aClass2_Sub21ArrayArrayArray1;

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III[[[I)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1125 = arg0;
		this.anInt1117 = arg1;
		this.anInt1122 = arg2;
		this.aClass2_Sub21ArrayArrayArray1 = new Class2_Sub21[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray3 = arg3;
		this.method762();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass25_1 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V")
	public void method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class25 local14 = local8.aClass25_1;
		if (local14 != null) {
			local14.anInt805 = local14.anInt805 * arg3 / 16;
			local14.anInt814 = local14.anInt814 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIILclient!pa;Lclient!pa;IIII)V")
	public void method738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class9 local8 = new Class9();
		local8.anInt242 = arg8;
		local8.anInt250 = arg9;
		local8.anInt241 = arg1 * 128 + 64;
		local8.anInt244 = arg2 * 128 + 64;
		local8.anInt239 = arg3;
		local8.aClass2_Sub1_Sub1_2 = arg4;
		local8.aClass2_Sub1_Sub1_3 = arg5;
		local8.anInt247 = arg6;
		local8.anInt238 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub21ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub21ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub21(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass9_1 = local8;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!mf;)V")
	private void method739(@OriginalArg(0) Class53 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1911; local2 <= arg0.anInt1914; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1920; local6 <= arg0.anInt1922; local6++) {
				@Pc(17) Class2_Sub21 local17 = this.aClass2_Sub21ArrayArrayArray1[arg0.anInt1921][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2596; local21++) {
						if (local17.aClass53Array3[local21] == arg0) {
							local17.anInt2596--;
							for (local36 = local21; local36 < local17.anInt2596; local36++) {
								local17.aClass53Array3[local36] = local17.aClass53Array3[local36 + 1];
								local17.anIntArray295[local36] = local17.anIntArray295[local36 + 1];
							}
							local17.aClass53Array3[local17.anInt2596] = null;
							break;
						}
					}
					local17.anInt2594 = 0;
					for (local36 = 0; local36 < local17.anInt2596; local36++) {
						local17.anInt2594 |= local17.anIntArray295[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public void method741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub21 local31 = this.aClass2_Sub21ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub21ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2593--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2596; local41++) {
					@Pc(47) Class53 local47 = local31.aClass53Array3[local41];
					if ((local47.anInt1917 >> 29 & 0x3) == 2 && local47.anInt1911 == arg0 && local47.anInt1920 == arg1) {
						local47.anInt1921--;
					}
				}
			}
		}
		if (this.aClass2_Sub21ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub21ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub21(0, arg0, arg1);
		}
		this.aClass2_Sub21ArrayArrayArray1[0][arg0][arg1].aClass2_Sub21_1 = local8;
		this.aClass2_Sub21ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
	public void method742() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1129; local1++) {
			@Pc(7) Class53 local7 = this.aClass53Array1[local1];
			this.method739(local7);
			this.aClass53Array1[local1] = null;
		}
		this.anInt1129 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!tb;Z)V")
	private void method743(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) boolean arg1) {
		Static42.aClass3_5.method75(arg0);
		while (true) {
			@Pc(8) Class2_Sub21 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub21[][] local31;
			@Pc(49) Class2_Sub21 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class9 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class53 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class2_Sub21 var33;
										while (true) {
											do {
												local8 = (Class2_Sub21) Static42.aClass3_5.method78();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean217);
											local17 = local8.anInt2600;
											local20 = local8.anInt2598;
											local23 = local8.anInt2593;
											local26 = local8.anInt2606;
											local31 = this.aClass2_Sub21ArrayArrayArray1[local23];
											if (!local8.aBoolean216) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub21ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean217) {
														continue;
													}
												}
												if (local17 <= Static42.anInt1112 && local17 > Static42.anInt1118) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean217 && (local49.aBoolean216 || (local8.anInt2594 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static42.anInt1112 && local17 < Static42.anInt1119 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean217 && (local49.aBoolean216 || (local8.anInt2594 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static42.anInt1109 && local20 > Static42.anInt1113) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean217 && (local49.aBoolean216 || (local8.anInt2594 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static42.anInt1109 && local20 < Static42.anInt1128 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean217 && (local49.aBoolean216 || (local8.anInt2594 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean216 = false;
											if (local8.aClass2_Sub21_1 != null) {
												local49 = local8.aClass2_Sub21_1;
												if (local49.aClass38_1 == null) {
													if (local49.aClass51_1 != null && !this.method781(0, local17, local20)) {
														this.method764(local49.aClass51_1, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local17, local20);
													}
												} else if (!this.method781(0, local17, local20)) {
													this.method748(local49.aClass38_1, 0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local17, local20);
												}
												@Pc(225) Class9 local225 = local49.aClass9_1;
												if (local225 != null) {
													local225.aClass2_Sub1_Sub1_2.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local225.anInt241 - Static42.anInt1104, local225.anInt239 - Static42.anInt1114, local225.anInt244 - Static42.anInt1111, local225.anInt242);
												}
												for (local251 = 0; local251 < local49.anInt2596; local251++) {
													var12 = local49.aClass53Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub1_Sub1_6.method2169(var12.anInt1910, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, var12.anInt1919 - Static42.anInt1104, var12.anInt1923 - Static42.anInt1114, var12.anInt1913 - Static42.anInt1111, var12.anInt1917);
													}
												}
											}
											var22 = false;
											if (local8.aClass38_1 == null) {
												if (local8.aClass51_1 != null && !this.method781(local26, local17, local20)) {
													var22 = true;
													this.method764(local8.aClass51_1, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local17, local20);
												}
											} else if (!this.method781(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass38_1.anInt1407 != 12345678 || Static42.aBoolean79 && local23 <= Static42.anInt1108) {
													this.method748(local8.aClass38_1, local26, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class9 local350 = local8.aClass9_1;
											@Pc(353) Class25 local353 = local8.aClass25_1;
											if (local350 != null || local353 != null) {
												if (Static42.anInt1112 == local17) {
													var21++;
												} else if (Static42.anInt1112 < local17) {
													var21 += 2;
												}
												if (Static42.anInt1109 == local20) {
													var21 += 3;
												} else if (Static42.anInt1109 > local20) {
													var21 += 6;
												}
												local251 = Static42.anIntArray114[var21];
												local8.anInt2603 = Static42.anIntArray112[var21];
											}
											if (local350 != null) {
												if ((local350.anInt247 & Static42.anIntArray111[var21]) == 0) {
													local8.anInt2602 = 0;
												} else if (local350.anInt247 == 16) {
													local8.anInt2602 = 3;
													local8.anInt2604 = Static42.anIntArray115[var21];
													local8.anInt2599 = 3 - local8.anInt2604;
												} else if (local350.anInt247 == 32) {
													local8.anInt2602 = 6;
													local8.anInt2604 = Static42.anIntArray113[var21];
													local8.anInt2599 = 6 - local8.anInt2604;
												} else if (local350.anInt247 == 64) {
													local8.anInt2602 = 12;
													local8.anInt2604 = Static42.anIntArray116[var21];
													local8.anInt2599 = 12 - local8.anInt2604;
												} else {
													local8.anInt2602 = 9;
													local8.anInt2604 = Static42.anIntArray117[var21];
													local8.anInt2599 = 9 - local8.anInt2604;
												}
												if ((local350.anInt247 & local251) != 0 && !this.method744(local26, local17, local20, local350.anInt247)) {
													local350.aClass2_Sub1_Sub1_2.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local350.anInt241 - Static42.anInt1104, local350.anInt239 - Static42.anInt1114, local350.anInt244 - Static42.anInt1111, local350.anInt242);
												}
												if ((local350.anInt238 & local251) != 0 && !this.method744(local26, local17, local20, local350.anInt238)) {
													local350.aClass2_Sub1_Sub1_3.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local350.anInt241 - Static42.anInt1104, local350.anInt239 - Static42.anInt1114, local350.anInt244 - Static42.anInt1111, local350.anInt242);
												}
											}
											if (local353 != null && !this.method753(local26, local17, local20, local353.aClass2_Sub1_Sub1_4.anInt3029)) {
												if ((local353.anInt815 & local251) != 0) {
													local353.aClass2_Sub1_Sub1_4.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local353.anInt810 + local353.anInt805 - Static42.anInt1104, local353.anInt809 - Static42.anInt1114, local353.anInt807 + local353.anInt814 - Static42.anInt1111, local353.anInt811);
												} else if (local353.anInt815 == 256) {
													local592 = local353.anInt810 - Static42.anInt1104;
													local597 = local353.anInt809 - Static42.anInt1114;
													local602 = local353.anInt807 - Static42.anInt1111;
													var17 = local353.anInt808;
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
														local353.aClass2_Sub1_Sub1_4.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local592 + local353.anInt805, local597, local602 + local353.anInt814, local353.anInt811);
													} else if (local353.aClass2_Sub1_Sub1_5 != null) {
														local353.aClass2_Sub1_Sub1_5.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local592, local597, local602, local353.anInt811);
													}
												}
											}
											if (var22) {
												@Pc(673) Class6 local673 = local8.aClass6_1;
												if (local673 != null) {
													local673.aClass2_Sub1_Sub1_1.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local673.anInt205 - Static42.anInt1104, local673.anInt203 - Static42.anInt1114, local673.anInt202 - Static42.anInt1111, local673.anInt207);
												}
												@Pc(700) Class80 local700 = local8.aClass80_1;
												if (local700 != null && local700.anInt2879 == 0) {
													if (local700.aClass2_Sub1_Sub1_8 != null) {
														local700.aClass2_Sub1_Sub1_8.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local700.anInt2889 - Static42.anInt1104, local700.anInt2880 - Static42.anInt1114, local700.anInt2882 - Static42.anInt1111, local700.anInt2883);
													}
													if (local700.aClass2_Sub1_Sub1_9 != null) {
														local700.aClass2_Sub1_Sub1_9.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local700.anInt2889 - Static42.anInt1104, local700.anInt2880 - Static42.anInt1114, local700.anInt2882 - Static42.anInt1111, local700.anInt2883);
													}
													if (local700.aClass2_Sub1_Sub1_7 != null) {
														local700.aClass2_Sub1_Sub1_7.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local700.anInt2889 - Static42.anInt1104, local700.anInt2880 - Static42.anInt1114, local700.anInt2882 - Static42.anInt1111, local700.anInt2883);
													}
												}
											}
											local592 = local8.anInt2594;
											if (local592 != 0) {
												if (local17 < Static42.anInt1112 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean217) {
														Static42.aClass3_5.method75(var33);
													}
												}
												if (local20 < Static42.anInt1109 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean217) {
														Static42.aClass3_5.method75(var33);
													}
												}
												if (local17 > Static42.anInt1112 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean217) {
														Static42.aClass3_5.method75(var33);
													}
												}
												if (local20 > Static42.anInt1109 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean217) {
														Static42.aClass3_5.method75(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2602 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2596; var21++) {
												if (local8.aClass53Array3[var21].anInt1912 != Static42.anInt1116 && (local8.anIntArray295[var21] & local8.anInt2602) == local8.anInt2604) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass9_1;
												if (!this.method744(local26, local17, local20, local919.anInt247)) {
													local919.aClass2_Sub1_Sub1_2.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local919.anInt241 - Static42.anInt1104, local919.anInt239 - Static42.anInt1114, local919.anInt244 - Static42.anInt1111, local919.anInt242);
												}
												local8.anInt2602 = 0;
											}
										}
										if (!local8.aBoolean215) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt2596;
											local8.aBoolean215 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass53Array3[local251];
												if (var12.anInt1912 != Static42.anInt1116) {
													for (local978 = var12.anInt1911; local978 <= var12.anInt1914; local978++) {
														for (local592 = var12.anInt1920; local592 <= var12.anInt1922; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean216) {
																local8.aBoolean215 = true;
																continue label558;
															}
															if (var33.anInt2602 != 0) {
																local602 = 0;
																if (local978 > var12.anInt1911) {
																	local602++;
																}
																if (local978 < var12.anInt1914) {
																	local602 += 4;
																}
																if (local592 > var12.anInt1920) {
																	local602 += 8;
																}
																if (local592 < var12.anInt1922) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt2602) == local8.anInt2599) {
																	local8.aBoolean215 = true;
																	continue label558;
																}
															}
														}
													}
													Static42.aClass53Array2[var21++] = var12;
													local592 = Static42.anInt1112 - var12.anInt1911;
													local597 = var12.anInt1914 - Static42.anInt1112;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static42.anInt1109 - var12.anInt1920;
													var17 = var12.anInt1922 - Static42.anInt1109;
													if (var17 > local602) {
														var12.anInt1918 = local592 + var17;
													} else {
														var12.anInt1918 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class53 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static42.aClass53Array2[local592];
													if (local1102.anInt1912 != Static42.anInt1116) {
														if (local1102.anInt1918 > local1093) {
															local1093 = local1102.anInt1918;
															local978 = local592;
														} else if (local1102.anInt1918 == local1093) {
															local602 = local1102.anInt1919 - Static42.anInt1104;
															var17 = local1102.anInt1913 - Static42.anInt1111;
															var18 = Static42.aClass53Array2[local978].anInt1919 - Static42.anInt1104;
															var19 = Static42.aClass53Array2[local978].anInt1913 - Static42.anInt1111;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static42.aClass53Array2[local978];
												local1102.anInt1912 = Static42.anInt1116;
												if (!this.method785(local26, local1102.anInt1911, local1102.anInt1914, local1102.anInt1920, local1102.anInt1922, local1102.aClass2_Sub1_Sub1_6.anInt3029)) {
													local1102.aClass2_Sub1_Sub1_6.method2169(local1102.anInt1910, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local1102.anInt1919 - Static42.anInt1104, local1102.anInt1923 - Static42.anInt1114, local1102.anInt1913 - Static42.anInt1111, local1102.anInt1917);
												}
												for (local602 = local1102.anInt1911; local602 <= local1102.anInt1914; local602++) {
													for (var17 = local1102.anInt1920; var17 <= local1102.anInt1922; var17++) {
														@Pc(1227) Class2_Sub21 local1227 = local31[local602][var17];
														if (local1227.anInt2602 != 0) {
															Static42.aClass3_5.method75(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean217) {
															Static42.aClass3_5.method75(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean215) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean215 = false;
											break;
										}
									}
								} while (!local8.aBoolean217);
							} while (local8.anInt2602 != 0);
							if (local17 > Static42.anInt1112 || local17 <= Static42.anInt1118) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean217);
						if (local17 < Static42.anInt1112 || local17 >= Static42.anInt1119 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean217);
					if (local20 > Static42.anInt1109 || local20 <= Static42.anInt1113) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean217);
				if (local20 < Static42.anInt1109 || local20 >= Static42.anInt1128 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean217);
			local8.aBoolean217 = false;
			Static42.anInt1103--;
			@Pc(1369) Class80 local1369 = local8.aClass80_1;
			if (local1369 != null && local1369.anInt2879 != 0) {
				if (local1369.aClass2_Sub1_Sub1_8 != null) {
					local1369.aClass2_Sub1_Sub1_8.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local1369.anInt2889 - Static42.anInt1104, local1369.anInt2880 - Static42.anInt1114 - local1369.anInt2879, local1369.anInt2882 - Static42.anInt1111, local1369.anInt2883);
				}
				if (local1369.aClass2_Sub1_Sub1_9 != null) {
					local1369.aClass2_Sub1_Sub1_9.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local1369.anInt2889 - Static42.anInt1104, local1369.anInt2880 - Static42.anInt1114 - local1369.anInt2879, local1369.anInt2882 - Static42.anInt1111, local1369.anInt2883);
				}
				if (local1369.aClass2_Sub1_Sub1_7 != null) {
					local1369.aClass2_Sub1_Sub1_7.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local1369.anInt2889 - Static42.anInt1104, local1369.anInt2880 - Static42.anInt1114 - local1369.anInt2879, local1369.anInt2882 - Static42.anInt1111, local1369.anInt2883);
				}
			}
			if (local8.anInt2603 != 0) {
				@Pc(1464) Class25 local1464 = local8.aClass25_1;
				if (local1464 != null && !this.method753(local26, local17, local20, local1464.aClass2_Sub1_Sub1_4.anInt3029)) {
					if ((local1464.anInt815 & local8.anInt2603) != 0) {
						local1464.aClass2_Sub1_Sub1_4.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local1464.anInt810 + local1464.anInt805 - Static42.anInt1104, local1464.anInt809 - Static42.anInt1114, local1464.anInt807 + local1464.anInt814 - Static42.anInt1111, local1464.anInt811);
					} else if (local1464.anInt815 == 256) {
						local251 = local1464.anInt810 - Static42.anInt1104;
						local1093 = local1464.anInt809 - Static42.anInt1114;
						local978 = local1464.anInt807 - Static42.anInt1111;
						local592 = local1464.anInt808;
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
							local1464.aClass2_Sub1_Sub1_4.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local251 + local1464.anInt805, local1093, local978 + local1464.anInt814, local1464.anInt811);
						} else if (local1464.aClass2_Sub1_Sub1_5 != null) {
							local1464.aClass2_Sub1_Sub1_5.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local251, local1093, local978, local1464.anInt811);
						}
					}
				}
				local919 = local8.aClass9_1;
				if (local919 != null) {
					if ((local919.anInt238 & local8.anInt2603) != 0 && !this.method744(local26, local17, local20, local919.anInt238)) {
						local919.aClass2_Sub1_Sub1_3.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local919.anInt241 - Static42.anInt1104, local919.anInt239 - Static42.anInt1114, local919.anInt244 - Static42.anInt1111, local919.anInt242);
					}
					if ((local919.anInt247 & local8.anInt2603) != 0 && !this.method744(local26, local17, local20, local919.anInt247)) {
						local919.aClass2_Sub1_Sub1_2.method2169(0, Static42.anInt1105, Static42.anInt1124, Static42.anInt1120, Static42.anInt1127, local919.anInt241 - Static42.anInt1104, local919.anInt239 - Static42.anInt1114, local919.anInt244 - Static42.anInt1111, local919.anInt242);
					}
				}
			}
			@Pc(1689) Class2_Sub21 local1689;
			if (local23 < this.anInt1125 - 1) {
				local1689 = this.aClass2_Sub21ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean217) {
					Static42.aClass3_5.method75(local1689);
				}
			}
			if (local17 < Static42.anInt1112) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean217) {
					Static42.aClass3_5.method75(local1689);
				}
			}
			if (local20 < Static42.anInt1109) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean217) {
					Static42.aClass3_5.method75(local1689);
				}
			}
			if (local17 > Static42.anInt1112) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean217) {
					Static42.aClass3_5.method75(local1689);
				}
			}
			if (local20 > Static42.anInt1109) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean217) {
					Static42.aClass3_5.method75(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIII)Z")
	private boolean method744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method781(arg0, arg1, arg2)) {
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
				if (local11 > Static42.anInt1104) {
					if (!this.method783(local11, local26, local15)) {
						return false;
					}
					if (!this.method783(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method783(local11, local30, local15)) {
						return false;
					}
					if (!this.method783(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method783(local11, local34, local15)) {
					return false;
				}
				if (!this.method783(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static42.anInt1111) {
					if (!this.method783(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method783(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method783(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method783(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method783(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method783(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static42.anInt1104) {
					if (!this.method783(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method783(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method783(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method783(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method783(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method783(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static42.anInt1111) {
					if (!this.method783(local11, local26, local15)) {
						return false;
					}
					if (!this.method783(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method783(local11, local30, local15)) {
						return false;
					}
					if (!this.method783(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method783(local11, local34, local15)) {
					return false;
				}
				if (!this.method783(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method783(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method783(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method783(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method783(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method783(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)Lclient!mf;")
	public Class53 method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2596; local14++) {
			@Pc(20) Class53 local20 = local8.aClass53Array3[local14];
			if ((local20.anInt1917 >> 29 & 0x3) == 2 && local20.anInt1911 == arg1 && local20.anInt1920 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIILclient!pa;Lclient!pa;IIIIII)V")
	public void method746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class25 local6 = new Class25();
		local6.anInt811 = arg10;
		local6.anInt813 = arg11;
		local6.anInt810 = arg1 * 128 + 64;
		local6.anInt807 = arg2 * 128 + 64;
		local6.anInt809 = arg3;
		local6.aClass2_Sub1_Sub1_4 = arg4;
		local6.aClass2_Sub1_Sub1_5 = arg5;
		local6.anInt815 = arg6;
		local6.anInt808 = arg7;
		local6.anInt805 = arg8;
		local6.anInt814 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass2_Sub21ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass2_Sub21ArrayArrayArray1[local49][arg1][arg2] = new Class2_Sub21(local49, arg1, arg2);
			}
		}
		this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass25_1 = local6;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)Lclient!cb;")
	public Class9 method747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass9_1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!jc;IIIIIII)V")
	private void method748(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static42.anInt1104;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static42.anInt1111;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray3[arg1][arg6][arg7] - Static42.anInt1114;
		@Pc(51) int local51 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static42.anInt1114;
		@Pc(66) int local66 = this.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static42.anInt1114;
		@Pc(79) int local79 = this.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static42.anInt1114;
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
		@Pc(279) int local279 = Static78.anInt2059 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static78.anInt2058 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static78.anInt2059 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static78.anInt2058 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static78.anInt2059 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static78.anInt2058 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static78.anInt2059 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static78.anInt2058 + (local89 << 9) / local265;
		Static78.anInt2060 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static78.aBoolean157 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static78.anInt2061 || local327 > Static78.anInt2061 || local295 > Static78.anInt2061) {
				Static78.aBoolean157 = true;
			}
			if (Static42.aBoolean79 && this.method735(Static42.anInt1107, Static42.anInt1126, local319, local335, local303, local311, local327, local295)) {
				Static42.anInt1115 = arg6;
				Static42.anInt1121 = arg7;
			}
			if (arg0.anInt1405 == -1) {
				if (arg0.anInt1407 != 12345678) {
					Static78.method1382(local319, local335, local303, local311, local327, local295, arg0.anInt1407, arg0.anInt1404, arg0.anInt1406);
				}
			} else if (Static42.aBoolean78) {
				local472 = Static78.anInterface1_1.method1010(arg0.anInt1405);
				Static78.method1382(local319, local335, local303, local311, local327, local295, Static42.method775(local472, arg0.anInt1407), Static42.method775(local472, arg0.anInt1404), Static42.method775(local472, arg0.anInt1406));
			} else if (arg0.aBoolean101) {
				Static78.method1389(local319, local335, local303, local311, local327, local295, arg0.anInt1407, arg0.anInt1404, arg0.anInt1406, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1405);
			} else {
				Static78.method1389(local319, local335, local303, local311, local327, local295, arg0.anInt1407, arg0.anInt1404, arg0.anInt1406, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1405);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static78.aBoolean157 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static78.anInt2061 || local295 > Static78.anInt2061 || local327 > Static78.anInt2061) {
			Static78.aBoolean157 = true;
		}
		if (Static42.aBoolean79 && this.method735(Static42.anInt1107, Static42.anInt1126, local287, local303, local335, local279, local295, local327)) {
			Static42.anInt1115 = arg6;
			Static42.anInt1121 = arg7;
		}
		if (arg0.anInt1405 != -1) {
			if (!Static42.aBoolean78) {
				Static78.method1389(local287, local303, local335, local279, local295, local327, arg0.anInt1403, arg0.anInt1406, arg0.anInt1404, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1405);
				return;
			}
			local472 = Static78.anInterface1_1.method1010(arg0.anInt1405);
			Static78.method1382(local287, local303, local335, local279, local295, local327, Static42.method775(local472, arg0.anInt1403), Static42.method775(local472, arg0.anInt1406), Static42.method775(local472, arg0.anInt1404));
		} else if (arg0.anInt1403 != 12345678) {
			Static78.method1382(local287, local303, local335, local279, local295, local327, arg0.anInt1403, arg0.anInt1406, arg0.anInt1404);
			return;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIILclient!pa;III)Z")
	public boolean method749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method778(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(III)Lclient!fe;")
	public Class25 method750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass25_1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public void method751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1117 * 128) {
			arg0 = this.anInt1117 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1122 * 128) {
			arg2 = this.anInt1122 * 128 - 1;
		}
		Static42.anInt1116++;
		Static42.anInt1105 = Class2_Sub1_Sub2_Sub2.anIntArray219[arg3];
		Static42.anInt1124 = Class2_Sub1_Sub2_Sub2.anIntArray221[arg3];
		Static42.anInt1120 = Class2_Sub1_Sub2_Sub2.anIntArray219[arg4];
		Static42.anInt1127 = Class2_Sub1_Sub2_Sub2.anIntArray221[arg4];
		Static42.aBooleanArrayArray1 = Static42.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static42.anInt1104 = arg0;
		Static42.anInt1114 = arg1;
		Static42.anInt1111 = arg2;
		Static42.anInt1112 = arg0 / 128;
		Static42.anInt1109 = arg2 / 128;
		Static42.anInt1123 = arg5;
		Static42.anInt1118 = Static42.anInt1112 - 25;
		if (Static42.anInt1118 < 0) {
			Static42.anInt1118 = 0;
		}
		Static42.anInt1113 = Static42.anInt1109 - 25;
		if (Static42.anInt1113 < 0) {
			Static42.anInt1113 = 0;
		}
		Static42.anInt1119 = Static42.anInt1112 + 25;
		if (Static42.anInt1119 > this.anInt1117) {
			Static42.anInt1119 = this.anInt1117;
		}
		Static42.anInt1128 = Static42.anInt1109 + 25;
		if (Static42.anInt1128 > this.anInt1122) {
			Static42.anInt1128 = this.anInt1122;
		}
		this.method773();
		Static42.anInt1103 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1130; local128 < this.anInt1125; local128++) {
			@Pc(134) Class2_Sub21[][] local134 = this.aClass2_Sub21ArrayArrayArray1[local128];
			for (local136 = Static42.anInt1118; local136 < Static42.anInt1119; local136++) {
				for (local139 = Static42.anInt1113; local139 < Static42.anInt1128; local139++) {
					@Pc(146) Class2_Sub21 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2607 <= arg5 && (Static42.aBooleanArrayArray1[local136 + 25 - Static42.anInt1112][local139 + 25 - Static42.anInt1109] || this.anIntArrayArrayArray3[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean216 = true;
							local146.aBoolean217 = true;
							if (local146.anInt2596 > 0) {
								local146.aBoolean215 = true;
							} else {
								local146.aBoolean215 = false;
							}
							Static42.anInt1103++;
						} else {
							local146.aBoolean216 = false;
							local146.aBoolean217 = false;
							local146.anInt2602 = 0;
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
		for (@Pc(224) int local224 = this.anInt1130; local224 < this.anInt1125; local224++) {
			@Pc(230) Class2_Sub21[][] local230 = this.aClass2_Sub21ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static42.anInt1112 + local139;
				local241 = Static42.anInt1112 - local139;
				if (local237 >= Static42.anInt1118 || local241 < Static42.anInt1119) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static42.anInt1109 + local249;
						local258 = Static42.anInt1109 - local249;
						@Pc(270) Class2_Sub21 local270;
						if (local237 >= Static42.anInt1118) {
							if (local254 >= Static42.anInt1113) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean216) {
									this.method743(local270, true);
								}
							}
							if (local258 < Static42.anInt1128) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean216) {
									this.method743(local270, true);
								}
							}
						}
						if (local241 < Static42.anInt1119) {
							if (local254 >= Static42.anInt1113) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean216) {
									this.method743(local270, true);
								}
							}
							if (local258 < Static42.anInt1128) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean216) {
									this.method743(local270, true);
								}
							}
						}
						if (Static42.anInt1103 == 0) {
							Static42.aBoolean79 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1130; local136 < this.anInt1125; local136++) {
			@Pc(361) Class2_Sub21[][] local361 = this.aClass2_Sub21ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static42.anInt1112 + local237;
				local249 = Static42.anInt1112 - local237;
				if (local241 >= Static42.anInt1118 || local249 < Static42.anInt1119) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static42.anInt1109 + local254;
						@Pc(389) int local389 = Static42.anInt1109 - local254;
						@Pc(401) Class2_Sub21 local401;
						if (local241 >= Static42.anInt1118) {
							if (local258 >= Static42.anInt1113) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean216) {
									this.method743(local401, false);
								}
							}
							if (local389 < Static42.anInt1128) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean216) {
									this.method743(local401, false);
								}
							}
						}
						if (local249 < Static42.anInt1119) {
							if (local258 >= Static42.anInt1113) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean216) {
									this.method743(local401, false);
								}
							}
							if (local389 < Static42.anInt1128) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean216) {
									this.method743(local401, false);
								}
							}
						}
						if (Static42.anInt1103 == 0) {
							Static42.aBoolean79 = false;
							return;
						}
					}
				}
			}
		}
		Static42.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!wc;IIIII)V")
	private void method752(@OriginalArg(0) Class2_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1125) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1117) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1122 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub21 local66 = this.aClass2_Sub21ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray3[local17][local24][local34] + this.anIntArrayArrayArray3[local17][local24 + 1][local34] + this.anIntArrayArrayArray3[local17][local24][local34 + 1] + this.anIntArrayArrayArray3[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray3[arg1][arg2][arg3] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class9 local163 = local66.aClass9_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub1_Sub1_Sub7 local173;
										if (local163.aClass2_Sub1_Sub1_2 instanceof Class2_Sub1_Sub1_Sub7) {
											local173 = (Class2_Sub1_Sub1_Sub7) local163.aClass2_Sub1_Sub1_2;
											Static131.method2185(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub1_Sub1_3 instanceof Class2_Sub1_Sub1_Sub7) {
											local173 = (Class2_Sub1_Sub1_Sub7) local163.aClass2_Sub1_Sub1_3;
											Static131.method2185(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2596; local237++) {
										@Pc(243) Class53 local243 = local66.aClass53Array3[local237];
										if (local243 != null && local243.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub7) {
											@Pc(253) Class2_Sub1_Sub1_Sub7 local253 = (Class2_Sub1_Sub1_Sub7) local243.aClass2_Sub1_Sub1_6;
											@Pc(261) int local261 = local243.anInt1914 + 1 - local243.anInt1911;
											@Pc(269) int local269 = local243.anInt1922 + 1 - local243.anInt1920;
											Static131.method2185(arg0, local253, (local243.anInt1911 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1920 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IIII)Z")
	private boolean method753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method781(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method783(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2] - arg3, local15 + 1) && this.method783(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method783(local11 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method783(local11 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(III)Lclient!bd;")
	public Class6 method754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass6_1 == null ? null : local8.aClass6_1;
	}

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "(III)I")
	public int method755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass9_1 == null ? 0 : local8.aClass9_1.anInt242;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIILclient!pa;II)V")
	public void method757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class6 local6 = new Class6();
		local6.aClass2_Sub1_Sub1_1 = arg4;
		local6.anInt205 = arg1 * 128 + 64;
		local6.anInt202 = arg2 * 128 + 64;
		local6.anInt203 = arg3;
		local6.anInt207 = arg5;
		local6.anInt200 = arg6;
		if (this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub21(arg0, arg1, arg2);
		}
		this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass6_1 = local6;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!wc;III)V")
	private void method759(@OriginalArg(0) Class2_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub21 local14;
		@Pc(29) Class2_Sub1_Sub1_Sub7 local29;
		if (arg2 < this.anInt1117) {
			local14 = this.aClass2_Sub21ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub7) {
				local29 = (Class2_Sub1_Sub1_Sub7) local14.aClass6_1.aClass2_Sub1_Sub1_1;
				Static131.method2185(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1117) {
			local14 = this.aClass2_Sub21ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub7) {
				local29 = (Class2_Sub1_Sub1_Sub7) local14.aClass6_1.aClass2_Sub1_Sub1_1;
				Static131.method2185(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1117 && arg3 < this.anInt1122) {
			local14 = this.aClass2_Sub21ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub7) {
				local29 = (Class2_Sub1_Sub1_Sub7) local14.aClass6_1.aClass2_Sub1_Sub1_1;
				Static131.method2185(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1117 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub21ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass6_1 != null && local14.aClass6_1.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub7) {
			local29 = (Class2_Sub1_Sub1_Sub7) local14.aClass6_1.aClass2_Sub1_Sub1_1;
			Static131.method2185(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "(III)I")
	public int method760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass6_1 == null ? 0 : local8.aClass6_1.anInt207;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "()V")
	public void method762() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1125; local1++) {
			for (local4 = 0; local4 < this.anInt1117; local4++) {
				for (local7 = 0; local7 < this.anInt1122; local7++) {
					this.aClass2_Sub21ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static42.anInt1110; local4++) {
			for (local7 = 0; local7 < Static42.anIntArray110[local4]; local7++) {
				Static42.aClass35ArrayArray1[local4][local7] = null;
			}
			Static42.anIntArray110[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1129; local7++) {
			this.aClass53Array1[local7] = null;
		}
		this.anInt1129 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static42.aClass53Array2.length; local76++) {
			Static42.aClass53Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "(III)V")
	public void method763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static42.aBoolean79 = true;
		Static42.anInt1108 = arg0;
		Static42.anInt1107 = arg1;
		Static42.anInt1126 = arg2;
		Static42.anInt1115 = -1;
		Static42.anInt1121 = -1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!md;IIIIII)V")
	private void method764(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray190.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray190[local5] - Static42.anInt1104;
			local20 = arg0.anIntArray192[local5] - Static42.anInt1114;
			local27 = arg0.anIntArray195[local5] - Static42.anInt1111;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray198 != null) {
				Static71.anIntArray197[local5] = local37;
				Static71.anIntArray189[local5] = local59;
				Static71.anIntArray200[local5] = local69;
			}
			Static71.anIntArray187[local5] = Static78.anInt2059 + (local37 << 9) / local69;
			Static71.anIntArray196[local5] = Static78.anInt2058 + (local59 << 9) / local69;
		}
		Static78.anInt2060 = 0;
		local3 = arg0.anIntArray191.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray191[local13];
			local27 = arg0.anIntArray188[local13];
			local37 = arg0.anIntArray199[local13];
			@Pc(142) int local142 = Static71.anIntArray187[local20];
			@Pc(146) int local146 = Static71.anIntArray187[local27];
			@Pc(150) int local150 = Static71.anIntArray187[local37];
			@Pc(154) int local154 = Static71.anIntArray196[local20];
			@Pc(158) int local158 = Static71.anIntArray196[local27];
			@Pc(162) int local162 = Static71.anIntArray196[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static78.aBoolean157 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static78.anInt2061 || local146 > Static78.anInt2061 || local150 > Static78.anInt2061) {
					Static78.aBoolean157 = true;
				}
				if (Static42.aBoolean79 && this.method735(Static42.anInt1107, Static42.anInt1126, local154, local158, local162, local142, local146, local150)) {
					Static42.anInt1115 = arg5;
					Static42.anInt1121 = arg6;
				}
				if (arg0.anIntArray198 == null || arg0.anIntArray198[local13] == -1) {
					if (arg0.anIntArray201[local13] != 12345678) {
						Static78.method1382(local154, local158, local162, local142, local146, local150, arg0.anIntArray201[local13], arg0.anIntArray194[local13], arg0.anIntArray193[local13]);
					}
				} else if (Static42.aBoolean78) {
					@Pc(364) int local364 = Static78.anInterface1_1.method1010(arg0.anIntArray198[local13]);
					Static78.method1382(local154, local158, local162, local142, local146, local150, Static42.method775(local364, arg0.anIntArray201[local13]), Static42.method775(local364, arg0.anIntArray194[local13]), Static42.method775(local364, arg0.anIntArray193[local13]));
				} else if (arg0.aBoolean140) {
					Static78.method1389(local154, local158, local162, local142, local146, local150, arg0.anIntArray201[local13], arg0.anIntArray194[local13], arg0.anIntArray193[local13], Static71.anIntArray197[0], Static71.anIntArray197[1], Static71.anIntArray197[3], Static71.anIntArray189[0], Static71.anIntArray189[1], Static71.anIntArray189[3], Static71.anIntArray200[0], Static71.anIntArray200[1], Static71.anIntArray200[3], arg0.anIntArray198[local13]);
				} else {
					Static78.method1389(local154, local158, local162, local142, local146, local150, arg0.anIntArray201[local13], arg0.anIntArray194[local13], arg0.anIntArray193[local13], Static71.anIntArray197[local20], Static71.anIntArray197[local27], Static71.anIntArray197[local37], Static71.anIntArray189[local20], Static71.anIntArray189[local27], Static71.anIntArray189[local37], Static71.anIntArray200[local20], Static71.anIntArray200[local27], Static71.anIntArray200[local37], arg0.anIntArray198[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "(III)V")
	public void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass80_1 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIII)V")
	public void method766(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class38 local14 = local8.aClass38_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1401;
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
		@Pc(59) Class51 local59 = local8.aClass51_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1903;
		@Pc(68) int local68 = local59.anInt1901;
		@Pc(71) int local71 = local59.anInt1902;
		@Pc(74) int local74 = local59.anInt1900;
		@Pc(79) int[] local79 = this.anIntArrayArray13[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray12[local68];
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

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "(III)V")
	public void method767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass6_1 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIILclient!pa;IIZ)Z")
	public boolean method768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method778(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "(III)I")
	public int method769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass25_1 == null ? 0 : local8.aClass25_1.anInt811;
	}

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "(III)V")
	public void method770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2596; local13++) {
			@Pc(19) Class53 local19 = local8.aClass53Array3[local13];
			if ((local19.anInt1917 >> 29 & 0x3) == 2 && local19.anInt1911 == arg1 && local19.anInt1920 == arg2) {
				this.method739(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(IIII)V")
	public void method771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].anInt2607 = arg3;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIILclient!pa;ILclient!pa;Lclient!pa;)V")
	public void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub1_Sub1 arg6, @OriginalArg(7) Class2_Sub1_Sub1 arg7) {
		@Pc(3) Class80 local3 = new Class80();
		local3.aClass2_Sub1_Sub1_7 = arg4;
		local3.anInt2889 = arg1 * 128 + 64;
		local3.anInt2882 = arg2 * 128 + 64;
		local3.anInt2880 = arg3;
		local3.anInt2883 = arg5;
		local3.aClass2_Sub1_Sub1_8 = arg6;
		local3.aClass2_Sub1_Sub1_9 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class2_Sub21 local43 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2596; local47++) {
				if ((local43.aClass53Array3[local47].anInt1915 & 0x100) == 256 && local43.aClass53Array3[local47].aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub2) {
					@Pc(71) Class2_Sub1_Sub1_Sub2 local71 = (Class2_Sub1_Sub1_Sub2) local43.aClass53Array3[local47].aClass2_Sub1_Sub1_6;
					local71.method117();
					if (local71.anInt3029 > local34) {
						local34 = local71.anInt3029;
					}
				}
			}
		}
		local3.anInt2879 = local34;
		if (this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub21(arg0, arg1, arg2);
		}
		this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass80_1 = local3;
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
	private void method773() {
		@Pc(3) int local3 = Static42.anIntArray110[Static42.anInt1123];
		@Pc(7) Class35[] local7 = Static42.aClass35ArrayArray1[Static42.anInt1123];
		Static42.anInt1106 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class35 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1293 == 1) {
				local27 = local16.anInt1290 + 25 - Static42.anInt1112;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1289 + 25 - Static42.anInt1109;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1278 + 25 - Static42.anInt1109;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static42.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static42.anInt1104 - local16.anInt1284;
						if (local79 > 32) {
							local16.anInt1285 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1285 = 2;
							local79 = -local79;
						}
						local16.anInt1287 = (local16.anInt1286 - Static42.anInt1111 << 8) / local79;
						local16.anInt1270 = (local16.anInt1281 - Static42.anInt1111 << 8) / local79;
						local16.anInt1279 = (local16.anInt1267 - Static42.anInt1114 << 8) / local79;
						local16.anInt1268 = (local16.anInt1283 - Static42.anInt1114 << 8) / local79;
						Static42.aClass35Array1[Static42.anInt1106++] = local16;
					}
				}
			} else if (local16.anInt1293 == 2) {
				local27 = local16.anInt1289 + 25 - Static42.anInt1109;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1290 + 25 - Static42.anInt1112;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1276 + 25 - Static42.anInt1112;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static42.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static42.anInt1111 - local16.anInt1286;
						if (local79 > 32) {
							local16.anInt1285 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1285 = 4;
							local79 = -local79;
						}
						local16.anInt1266 = (local16.anInt1284 - Static42.anInt1104 << 8) / local79;
						local16.anInt1265 = (local16.anInt1273 - Static42.anInt1104 << 8) / local79;
						local16.anInt1279 = (local16.anInt1267 - Static42.anInt1114 << 8) / local79;
						local16.anInt1268 = (local16.anInt1283 - Static42.anInt1114 << 8) / local79;
						Static42.aClass35Array1[Static42.anInt1106++] = local16;
					}
				}
			} else if (local16.anInt1293 == 4) {
				local27 = local16.anInt1267 - Static42.anInt1114;
				if (local27 > 128) {
					local40 = local16.anInt1289 + 25 - Static42.anInt1109;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1278 + 25 - Static42.anInt1109;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1290 + 25 - Static42.anInt1112;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1276 + 25 - Static42.anInt1112;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static42.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1285 = 5;
							local16.anInt1266 = (local16.anInt1284 - Static42.anInt1104 << 8) / local27;
							local16.anInt1265 = (local16.anInt1273 - Static42.anInt1104 << 8) / local27;
							local16.anInt1287 = (local16.anInt1286 - Static42.anInt1111 << 8) / local27;
							local16.anInt1270 = (local16.anInt1281 - Static42.anInt1111 << 8) / local27;
							Static42.aClass35Array1[Static42.anInt1106++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "(III)I")
	public int method774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2596; local14++) {
			@Pc(20) Class53 local20 = local8.aClass53Array3[local14];
			if ((local20.anInt1917 >> 29 & 0x3) == 2 && local20.anInt1911 == arg1 && local20.anInt1920 == arg2) {
				return local20.anInt1917;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "(III)V")
	public void method776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass9_1 = null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIILclient!pa;IIIIII)Z")
	public boolean method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method778(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIILclient!pa;IZII)Z")
	private boolean method778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1117 || local4 >= this.anInt1122) {
					return false;
				}
				@Pc(28) Class2_Sub21 local28 = this.aClass2_Sub21ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2596 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class53 local52 = new Class53();
		local52.anInt1917 = arg11;
		local52.anInt1915 = arg12;
		local52.anInt1921 = arg0;
		local52.anInt1919 = arg5;
		local52.anInt1913 = arg6;
		local52.anInt1923 = arg7;
		local52.aClass2_Sub1_Sub1_6 = arg8;
		local52.anInt1910 = arg9;
		local52.anInt1911 = arg1;
		local52.anInt1920 = arg2;
		local52.anInt1914 = arg1 + arg3 - 1;
		local52.anInt1922 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub21ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub21ArrayArrayArray1[local130][local98][local101] = new Class2_Sub21(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub21 local166 = this.aClass2_Sub21ArrayArrayArray1[arg0][local98][local101];
				local166.aClass53Array3[local166.anInt2596] = local52;
				local166.anIntArray295[local166.anInt2596] = local104;
				local166.anInt2594 |= local104;
				local166.anInt2596++;
			}
		}
		if (arg10) {
			this.aClass53Array1[this.anInt1129++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "(IIII)I")
	public int method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub21 local8 = this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass9_1 != null && local8.aClass9_1.anInt242 == arg3) {
			return local8.aClass9_1.anInt250 & 0xFF;
		} else if (local8.aClass25_1 != null && local8.aClass25_1.anInt811 == arg3) {
			return local8.aClass25_1.anInt813 & 0xFF;
		} else if (local8.aClass6_1 != null && local8.aClass6_1.anInt207 == arg3) {
			return local8.aClass6_1.anInt200 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2596; local56++) {
				if (local8.aClass53Array3[local56].anInt1917 == arg3) {
					return local8.aClass53Array3[local56].anInt1915 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method780(@OriginalArg(0) int arg0) {
		this.anInt1130 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1117; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1122; local7++) {
				if (this.aClass2_Sub21ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub21ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub21(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "(III)Z")
	private boolean method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static42.anInt1116) {
			return false;
		} else if (local8 == Static42.anInt1116) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method783(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2], local27 + 1) && this.method783(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2], local27 + 1) && this.method783(local23 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method783(local23 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static42.anInt1116;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static42.anInt1116;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class38 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class38(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub21ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub21ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub21(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass38_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class38(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub21ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub21ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub21(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass38_1 = local12;
		} else {
			@Pc(140) Class51 local140 = new Class51(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub21ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub21ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub21(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub21ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local140;
		}
	}

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "(III)Z")
	private boolean method783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static42.anInt1106; local1++) {
			@Pc(6) Class35 local6 = Static42.aClass35Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1285 == 1) {
				local15 = local6.anInt1284 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1286 + (local6.anInt1287 * local15 >> 8);
					local37 = local6.anInt1281 + (local6.anInt1270 * local15 >> 8);
					local47 = local6.anInt1267 + (local6.anInt1279 * local15 >> 8);
					local57 = local6.anInt1283 + (local6.anInt1268 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1285 == 2) {
				local15 = arg0 - local6.anInt1284;
				if (local15 > 0) {
					local27 = local6.anInt1286 + (local6.anInt1287 * local15 >> 8);
					local37 = local6.anInt1281 + (local6.anInt1270 * local15 >> 8);
					local47 = local6.anInt1267 + (local6.anInt1279 * local15 >> 8);
					local57 = local6.anInt1283 + (local6.anInt1268 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1285 == 3) {
				local15 = local6.anInt1286 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1284 + (local6.anInt1266 * local15 >> 8);
					local37 = local6.anInt1273 + (local6.anInt1265 * local15 >> 8);
					local47 = local6.anInt1267 + (local6.anInt1279 * local15 >> 8);
					local57 = local6.anInt1283 + (local6.anInt1268 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1285 == 4) {
				local15 = arg2 - local6.anInt1286;
				if (local15 > 0) {
					local27 = local6.anInt1284 + (local6.anInt1266 * local15 >> 8);
					local37 = local6.anInt1273 + (local6.anInt1265 * local15 >> 8);
					local47 = local6.anInt1267 + (local6.anInt1279 * local15 >> 8);
					local57 = local6.anInt1283 + (local6.anInt1268 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1285 == 5) {
				local15 = arg1 - local6.anInt1267;
				if (local15 > 0) {
					local27 = local6.anInt1284 + (local6.anInt1266 * local15 >> 8);
					local37 = local6.anInt1273 + (local6.anInt1265 * local15 >> 8);
					local47 = local6.anInt1286 + (local6.anInt1287 * local15 >> 8);
					local57 = local6.anInt1281 + (local6.anInt1270 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "(III)V")
	public void method784() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1125; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1117; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1122; local7++) {
					@Pc(17) Class2_Sub21 local17 = this.aClass2_Sub21ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class9 local22 = local17.aClass9_1;
						if (local22 != null && local22.aClass2_Sub1_Sub1_2 instanceof Class2_Sub1_Sub1_Sub7) {
							@Pc(32) Class2_Sub1_Sub1_Sub7 local32 = (Class2_Sub1_Sub1_Sub7) local22.aClass2_Sub1_Sub1_2;
							this.method752(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub1_Sub1_3 instanceof Class2_Sub1_Sub1_Sub7) {
								@Pc(48) Class2_Sub1_Sub1_Sub7 local48 = (Class2_Sub1_Sub1_Sub7) local22.aClass2_Sub1_Sub1_3;
								this.method752(local48, local1, local4, local7, 1, 1);
								Static131.method2185(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub1_Sub1_3 = local48.method2176(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass2_Sub1_Sub1_2 = local32.method2176(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class2_Sub1_Sub1_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2596; local87++) {
							@Pc(93) Class53 local93 = local17.aClass53Array3[local87];
							if (local93 != null && local93.aClass2_Sub1_Sub1_6 instanceof Class2_Sub1_Sub1_Sub7) {
								local103 = (Class2_Sub1_Sub1_Sub7) local93.aClass2_Sub1_Sub1_6;
								this.method752(local103, local1, local4, local7, local93.anInt1914 + 1 - local93.anInt1911, local93.anInt1922 - local93.anInt1920 + 1);
								local93.aClass2_Sub1_Sub1_6 = local103.method2176(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class6 local142 = local17.aClass6_1;
						if (local142 != null && local142.aClass2_Sub1_Sub1_1 instanceof Class2_Sub1_Sub1_Sub7) {
							local103 = (Class2_Sub1_Sub1_Sub7) local142.aClass2_Sub1_Sub1_1;
							this.method759(local103, local1, local4, local7);
							local142.aClass2_Sub1_Sub1_1 = local103.method2176(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIII)Z")
	private boolean method785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static42.anInt1116) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5;
			if (!this.method783(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method783(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method783(local21, local167, local195)) {
				return false;
			} else if (this.method783(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method781(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method783(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3] - arg5, local21 + 1) && this.method783(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method783(local17 + 128 - 1, this.anIntArrayArrayArray3[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method783(local17 + 1, this.anIntArrayArrayArray3[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}
}
