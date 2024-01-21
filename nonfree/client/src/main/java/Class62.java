import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class62 {

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	private int anInt2767 = 0;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "I")
	private int anInt2776 = 0;

	@OriginalMember(owner = "client!og", name = "E", descriptor = "[Lclient!cd;")
	private final Class17[] aClass17Array3 = new Class17[5000];

	@OriginalMember(owner = "client!og", name = "U", descriptor = "[[I")
	private final int[][] anIntArrayArray30 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!og", name = "eb", descriptor = "[[I")
	private final int[][] anIntArrayArray31 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	private final int anInt2787;

	@OriginalMember(owner = "client!og", name = "N", descriptor = "I")
	private final int anInt2789;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "I")
	private final int anInt2773;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "[[[Lclient!ne;")
	private final Class3_Sub16[][][] aClass3_Sub16ArrayArrayArray1;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III[[[I)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2787 = arg0;
		this.anInt2789 = arg1;
		this.anInt2773 = arg2;
		this.aClass3_Sub16ArrayArrayArray1 = new Class3_Sub16[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method1972();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;Lclient!ac;IIIIII)V")
	public void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) Class3_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class36 local6 = new Class36();
		local6.anInt1750 = arg10;
		local6.anInt1747 = arg11;
		local6.anInt1746 = arg1 * 128 + 64;
		local6.anInt1748 = arg2 * 128 + 64;
		local6.anInt1751 = arg3;
		local6.aClass3_Sub2_Sub1_5 = arg4;
		local6.aClass3_Sub2_Sub1_4 = arg5;
		local6.anInt1753 = arg6;
		local6.anInt1745 = arg7;
		local6.anInt1752 = arg8;
		local6.anInt1757 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass3_Sub16ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass3_Sub16ArrayArrayArray1[local49][arg1][arg2] = new Class3_Sub16(local49, arg1, arg2);
			}
		}
		this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass36_1 = local6;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public void method1966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass60_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIII)I")
	public int method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass2_1 != null && local8.aClass2_1.anInt26 == arg3) {
			return local8.aClass2_1.anInt18 & 0xFF;
		} else if (local8.aClass36_1 != null && local8.aClass36_1.anInt1750 == arg3) {
			return local8.aClass36_1.anInt1747 & 0xFF;
		} else if (local8.aClass60_1 != null && local8.aClass60_1.anInt2615 == arg3) {
			return local8.aClass60_1.anInt2611 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2546; local56++) {
				if (local8.aClass17Array1[local56].anInt534 == arg3) {
					return local8.aClass17Array1[local56].anInt538 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!oe;III)V")
	private void method1968(@OriginalArg(0) Class3_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub16 local14;
		@Pc(29) Class3_Sub2_Sub1_Sub6 local29;
		if (arg2 < this.anInt2789) {
			local14 = this.aClass3_Sub16ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass60_1 != null && local14.aClass60_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub6) {
				local29 = (Class3_Sub2_Sub1_Sub6) local14.aClass60_1.aClass3_Sub2_Sub1_9;
				Static115.method1955(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2789) {
			local14 = this.aClass3_Sub16ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass60_1 != null && local14.aClass60_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub6) {
				local29 = (Class3_Sub2_Sub1_Sub6) local14.aClass60_1.aClass3_Sub2_Sub1_9;
				Static115.method1955(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2789 && arg3 < this.anInt2773) {
			local14 = this.aClass3_Sub16ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass60_1 != null && local14.aClass60_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub6) {
				local29 = (Class3_Sub2_Sub1_Sub6) local14.aClass60_1.aClass3_Sub2_Sub1_9;
				Static115.method1955(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2789 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub16ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass60_1 != null && local14.aClass60_1.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub6) {
			local29 = (Class3_Sub2_Sub1_Sub6) local14.aClass60_1.aClass3_Sub2_Sub1_9;
			Static115.method1955(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([IIIIII)V")
	public void method1969(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class11 local14 = local8.aClass11_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt422;
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
		@Pc(59) Class42 local59 = local8.aClass42_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1896;
		@Pc(68) int local68 = local59.anInt1894;
		@Pc(71) int local71 = local59.anInt1895;
		@Pc(74) int local74 = local59.anInt1893;
		@Pc(79) int[] local79 = this.anIntArrayArray31[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray30[local68];
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

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;II)V")
	public void method1970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class60 local6 = new Class60();
		local6.aClass3_Sub2_Sub1_9 = arg4;
		local6.anInt2612 = arg1 * 128 + 64;
		local6.anInt2614 = arg2 * 128 + 64;
		local6.anInt2613 = arg3;
		local6.anInt2615 = arg5;
		local6.anInt2611 = arg6;
		if (this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub16(arg0, arg1, arg2);
		}
		this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass60_1 = local6;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIILclient!ac;IZII)Z")
	private boolean method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub2_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2789 || local4 >= this.anInt2773) {
					return false;
				}
				@Pc(28) Class3_Sub16 local28 = this.aClass3_Sub16ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2546 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class17 local52 = new Class17();
		local52.anInt534 = arg11;
		local52.anInt538 = arg12;
		local52.anInt544 = arg0;
		local52.anInt529 = arg5;
		local52.anInt543 = arg6;
		local52.anInt541 = arg7;
		local52.aClass3_Sub2_Sub1_3 = arg8;
		local52.anInt533 = arg9;
		local52.anInt537 = arg1;
		local52.anInt539 = arg2;
		local52.anInt528 = arg1 + arg3 - 1;
		local52.anInt530 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub16ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub16ArrayArrayArray1[local130][local98][local101] = new Class3_Sub16(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub16 local166 = this.aClass3_Sub16ArrayArrayArray1[arg0][local98][local101];
				local166.aClass17Array1[local166.anInt2546] = local52;
				local166.anIntArray252[local166.anInt2546] = local104;
				local166.anInt2541 |= local104;
				local166.anInt2546++;
			}
		}
		if (arg10) {
			this.aClass17Array3[this.anInt2767++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "()V")
	public void method1972() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2787; local1++) {
			for (local4 = 0; local4 < this.anInt2789; local4++) {
				for (local7 = 0; local7 < this.anInt2773; local7++) {
					this.aClass3_Sub16ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static117.anInt2761; local4++) {
			for (local7 = 0; local7 < Static117.anIntArray316[local4]; local7++) {
				Static117.aClass18ArrayArray1[local4][local7] = null;
			}
			Static117.anIntArray316[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2767; local7++) {
			this.aClass17Array3[local7] = null;
		}
		this.anInt2767 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static117.aClass17Array2.length; local76++) {
			Static117.aClass17Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(III)I")
	public int method1973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass60_1 == null ? 0 : local8.aClass60_1.anInt2615;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(III)V")
	public void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass55_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!ne;Z)V")
	private void method1975(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		Static117.aClass59_7.method1730(arg0);
		while (true) {
			@Pc(8) Class3_Sub16 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub16[][] local31;
			@Pc(49) Class3_Sub16 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class2 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class17 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class3_Sub16 var33;
										while (true) {
											do {
												local8 = (Class3_Sub16) Static117.aClass59_7.method1733();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean104);
											local17 = local8.anInt2543;
											local20 = local8.anInt2544;
											local23 = local8.anInt2552;
											local26 = local8.anInt2545;
											local31 = this.aClass3_Sub16ArrayArrayArray1[local23];
											if (!local8.aBoolean106) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub16ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean104) {
														continue;
													}
												}
												if (local17 <= Static117.anInt2765 && local17 > Static117.anInt2783) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2541 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static117.anInt2765 && local17 < Static117.anInt2788 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2541 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static117.anInt2762 && local20 > Static117.anInt2772) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2541 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static117.anInt2762 && local20 < Static117.anInt2775 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2541 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean106 = false;
											if (local8.aClass3_Sub16_1 != null) {
												local49 = local8.aClass3_Sub16_1;
												if (local49.aClass11_1 == null) {
													if (local49.aClass42_1 != null && !this.method1988(0, local17, local20)) {
														this.method2012(local49.aClass42_1, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local17, local20);
													}
												} else if (!this.method1988(0, local17, local20)) {
													this.method2015(local49.aClass11_1, 0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local17, local20);
												}
												@Pc(225) Class2 local225 = local49.aClass2_1;
												if (local225 != null) {
													local225.aClass3_Sub2_Sub1_1.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local225.anInt20 - Static117.anInt2768, local225.anInt17 - Static117.anInt2766, local225.anInt24 - Static117.anInt2781, local225.anInt26);
												}
												for (local251 = 0; local251 < local49.anInt2546; local251++) {
													var12 = local49.aClass17Array1[local251];
													if (var12 != null) {
														var12.aClass3_Sub2_Sub1_3.method2685(var12.anInt533, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, var12.anInt529 - Static117.anInt2768, var12.anInt541 - Static117.anInt2766, var12.anInt543 - Static117.anInt2781, var12.anInt534);
													}
												}
											}
											var22 = false;
											if (local8.aClass11_1 == null) {
												if (local8.aClass42_1 != null && !this.method1988(local26, local17, local20)) {
													var22 = true;
													this.method2012(local8.aClass42_1, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local17, local20);
												}
											} else if (!this.method1988(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass11_1.anInt421 != 12345678 || Static117.aBoolean116 && local23 <= Static117.anInt2770) {
													this.method2015(local8.aClass11_1, local26, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class2 local350 = local8.aClass2_1;
											@Pc(353) Class36 local353 = local8.aClass36_1;
											if (local350 != null || local353 != null) {
												if (Static117.anInt2765 == local17) {
													var21++;
												} else if (Static117.anInt2765 < local17) {
													var21 += 2;
												}
												if (Static117.anInt2762 == local20) {
													var21 += 3;
												} else if (Static117.anInt2762 > local20) {
													var21 += 6;
												}
												local251 = Static117.anIntArray319[var21];
												local8.anInt2551 = Static117.anIntArray323[var21];
											}
											if (local350 != null) {
												if ((local350.anInt23 & Static117.anIntArray318[var21]) == 0) {
													local8.anInt2548 = 0;
												} else if (local350.anInt23 == 16) {
													local8.anInt2548 = 3;
													local8.anInt2549 = Static117.anIntArray322[var21];
													local8.anInt2542 = 3 - local8.anInt2549;
												} else if (local350.anInt23 == 32) {
													local8.anInt2548 = 6;
													local8.anInt2549 = Static117.anIntArray317[var21];
													local8.anInt2542 = 6 - local8.anInt2549;
												} else if (local350.anInt23 == 64) {
													local8.anInt2548 = 12;
													local8.anInt2549 = Static117.anIntArray321[var21];
													local8.anInt2542 = 12 - local8.anInt2549;
												} else {
													local8.anInt2548 = 9;
													local8.anInt2549 = Static117.anIntArray320[var21];
													local8.anInt2542 = 9 - local8.anInt2549;
												}
												if ((local350.anInt23 & local251) != 0 && !this.method2003(local26, local17, local20, local350.anInt23)) {
													local350.aClass3_Sub2_Sub1_1.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local350.anInt20 - Static117.anInt2768, local350.anInt17 - Static117.anInt2766, local350.anInt24 - Static117.anInt2781, local350.anInt26);
												}
												if ((local350.anInt19 & local251) != 0 && !this.method2003(local26, local17, local20, local350.anInt19)) {
													local350.aClass3_Sub2_Sub1_2.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local350.anInt20 - Static117.anInt2768, local350.anInt17 - Static117.anInt2766, local350.anInt24 - Static117.anInt2781, local350.anInt26);
												}
											}
											if (local353 != null && !this.method1998(local26, local17, local20, local353.aClass3_Sub2_Sub1_5.aShort34)) {
												if ((local353.anInt1753 & local251) != 0) {
													local353.aClass3_Sub2_Sub1_5.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local353.anInt1746 + local353.anInt1752 - Static117.anInt2768, local353.anInt1751 - Static117.anInt2766, local353.anInt1748 + local353.anInt1757 - Static117.anInt2781, local353.anInt1750);
												} else if (local353.anInt1753 == 256) {
													local592 = local353.anInt1746 - Static117.anInt2768;
													local597 = local353.anInt1751 - Static117.anInt2766;
													local602 = local353.anInt1748 - Static117.anInt2781;
													var17 = local353.anInt1745;
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
														local353.aClass3_Sub2_Sub1_5.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local592 + local353.anInt1752, local597, local602 + local353.anInt1757, local353.anInt1750);
													} else if (local353.aClass3_Sub2_Sub1_4 != null) {
														local353.aClass3_Sub2_Sub1_4.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local592, local597, local602, local353.anInt1750);
													}
												}
											}
											if (var22) {
												@Pc(673) Class60 local673 = local8.aClass60_1;
												if (local673 != null) {
													local673.aClass3_Sub2_Sub1_9.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local673.anInt2612 - Static117.anInt2768, local673.anInt2613 - Static117.anInt2766, local673.anInt2614 - Static117.anInt2781, local673.anInt2615);
												}
												@Pc(700) Class55 local700 = local8.aClass55_1;
												if (local700 != null && local700.anInt2426 == 0) {
													if (local700.aClass3_Sub2_Sub1_7 != null) {
														local700.aClass3_Sub2_Sub1_7.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local700.anInt2428 - Static117.anInt2768, local700.anInt2430 - Static117.anInt2766, local700.anInt2433 - Static117.anInt2781, local700.anInt2431);
													}
													if (local700.aClass3_Sub2_Sub1_6 != null) {
														local700.aClass3_Sub2_Sub1_6.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local700.anInt2428 - Static117.anInt2768, local700.anInt2430 - Static117.anInt2766, local700.anInt2433 - Static117.anInt2781, local700.anInt2431);
													}
													if (local700.aClass3_Sub2_Sub1_8 != null) {
														local700.aClass3_Sub2_Sub1_8.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local700.anInt2428 - Static117.anInt2768, local700.anInt2430 - Static117.anInt2766, local700.anInt2433 - Static117.anInt2781, local700.anInt2431);
													}
												}
											}
											local592 = local8.anInt2541;
											if (local592 != 0) {
												if (local17 < Static117.anInt2765 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean104) {
														Static117.aClass59_7.method1730(var33);
													}
												}
												if (local20 < Static117.anInt2762 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean104) {
														Static117.aClass59_7.method1730(var33);
													}
												}
												if (local17 > Static117.anInt2765 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean104) {
														Static117.aClass59_7.method1730(var33);
													}
												}
												if (local20 > Static117.anInt2762 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean104) {
														Static117.aClass59_7.method1730(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2548 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2546; var21++) {
												if (local8.aClass17Array1[var21].anInt535 != Static117.anInt2785 && (local8.anIntArray252[var21] & local8.anInt2548) == local8.anInt2549) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass2_1;
												if (!this.method2003(local26, local17, local20, local919.anInt23)) {
													local919.aClass3_Sub2_Sub1_1.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local919.anInt20 - Static117.anInt2768, local919.anInt17 - Static117.anInt2766, local919.anInt24 - Static117.anInt2781, local919.anInt26);
												}
												local8.anInt2548 = 0;
											}
										}
										if (!local8.aBoolean105) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt2546;
											local8.aBoolean105 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass17Array1[local251];
												if (var12.anInt535 != Static117.anInt2785) {
													for (local978 = var12.anInt537; local978 <= var12.anInt528; local978++) {
														for (local592 = var12.anInt539; local592 <= var12.anInt530; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean106) {
																local8.aBoolean105 = true;
																continue label558;
															}
															if (var33.anInt2548 != 0) {
																local602 = 0;
																if (local978 > var12.anInt537) {
																	local602++;
																}
																if (local978 < var12.anInt528) {
																	local602 += 4;
																}
																if (local592 > var12.anInt539) {
																	local602 += 8;
																}
																if (local592 < var12.anInt530) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt2548) == local8.anInt2542) {
																	local8.aBoolean105 = true;
																	continue label558;
																}
															}
														}
													}
													Static117.aClass17Array2[var21++] = var12;
													local592 = Static117.anInt2765 - var12.anInt537;
													local597 = var12.anInt528 - Static117.anInt2765;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static117.anInt2762 - var12.anInt539;
													var17 = var12.anInt530 - Static117.anInt2762;
													if (var17 > local602) {
														var12.anInt536 = local592 + var17;
													} else {
														var12.anInt536 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class17 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static117.aClass17Array2[local592];
													if (local1102.anInt535 != Static117.anInt2785) {
														if (local1102.anInt536 > local1093) {
															local1093 = local1102.anInt536;
															local978 = local592;
														} else if (local1102.anInt536 == local1093) {
															local602 = local1102.anInt529 - Static117.anInt2768;
															var17 = local1102.anInt543 - Static117.anInt2781;
															var18 = Static117.aClass17Array2[local978].anInt529 - Static117.anInt2768;
															var19 = Static117.aClass17Array2[local978].anInt543 - Static117.anInt2781;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static117.aClass17Array2[local978];
												local1102.anInt535 = Static117.anInt2785;
												if (!this.method2009(local26, local1102.anInt537, local1102.anInt528, local1102.anInt539, local1102.anInt530, local1102.aClass3_Sub2_Sub1_3.aShort34)) {
													local1102.aClass3_Sub2_Sub1_3.method2685(local1102.anInt533, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local1102.anInt529 - Static117.anInt2768, local1102.anInt541 - Static117.anInt2766, local1102.anInt543 - Static117.anInt2781, local1102.anInt534);
												}
												for (local602 = local1102.anInt537; local602 <= local1102.anInt528; local602++) {
													for (var17 = local1102.anInt539; var17 <= local1102.anInt530; var17++) {
														@Pc(1227) Class3_Sub16 local1227 = local31[local602][var17];
														if (local1227.anInt2548 != 0) {
															Static117.aClass59_7.method1730(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean104) {
															Static117.aClass59_7.method1730(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean105) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean105 = false;
											break;
										}
									}
								} while (!local8.aBoolean104);
							} while (local8.anInt2548 != 0);
							if (local17 > Static117.anInt2765 || local17 <= Static117.anInt2783) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean104);
						if (local17 < Static117.anInt2765 || local17 >= Static117.anInt2788 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean104);
					if (local20 > Static117.anInt2762 || local20 <= Static117.anInt2772) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean104);
				if (local20 < Static117.anInt2762 || local20 >= Static117.anInt2775 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean104);
			local8.aBoolean104 = false;
			Static117.anInt2780--;
			@Pc(1369) Class55 local1369 = local8.aClass55_1;
			if (local1369 != null && local1369.anInt2426 != 0) {
				if (local1369.aClass3_Sub2_Sub1_7 != null) {
					local1369.aClass3_Sub2_Sub1_7.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local1369.anInt2428 - Static117.anInt2768, local1369.anInt2430 - Static117.anInt2766 - local1369.anInt2426, local1369.anInt2433 - Static117.anInt2781, local1369.anInt2431);
				}
				if (local1369.aClass3_Sub2_Sub1_6 != null) {
					local1369.aClass3_Sub2_Sub1_6.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local1369.anInt2428 - Static117.anInt2768, local1369.anInt2430 - Static117.anInt2766 - local1369.anInt2426, local1369.anInt2433 - Static117.anInt2781, local1369.anInt2431);
				}
				if (local1369.aClass3_Sub2_Sub1_8 != null) {
					local1369.aClass3_Sub2_Sub1_8.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local1369.anInt2428 - Static117.anInt2768, local1369.anInt2430 - Static117.anInt2766 - local1369.anInt2426, local1369.anInt2433 - Static117.anInt2781, local1369.anInt2431);
				}
			}
			if (local8.anInt2551 != 0) {
				@Pc(1464) Class36 local1464 = local8.aClass36_1;
				if (local1464 != null && !this.method1998(local26, local17, local20, local1464.aClass3_Sub2_Sub1_5.aShort34)) {
					if ((local1464.anInt1753 & local8.anInt2551) != 0) {
						local1464.aClass3_Sub2_Sub1_5.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local1464.anInt1746 + local1464.anInt1752 - Static117.anInt2768, local1464.anInt1751 - Static117.anInt2766, local1464.anInt1748 + local1464.anInt1757 - Static117.anInt2781, local1464.anInt1750);
					} else if (local1464.anInt1753 == 256) {
						local251 = local1464.anInt1746 - Static117.anInt2768;
						local1093 = local1464.anInt1751 - Static117.anInt2766;
						local978 = local1464.anInt1748 - Static117.anInt2781;
						local592 = local1464.anInt1745;
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
							local1464.aClass3_Sub2_Sub1_5.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local251 + local1464.anInt1752, local1093, local978 + local1464.anInt1757, local1464.anInt1750);
						} else if (local1464.aClass3_Sub2_Sub1_4 != null) {
							local1464.aClass3_Sub2_Sub1_4.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local251, local1093, local978, local1464.anInt1750);
						}
					}
				}
				local919 = local8.aClass2_1;
				if (local919 != null) {
					if ((local919.anInt19 & local8.anInt2551) != 0 && !this.method2003(local26, local17, local20, local919.anInt19)) {
						local919.aClass3_Sub2_Sub1_2.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local919.anInt20 - Static117.anInt2768, local919.anInt17 - Static117.anInt2766, local919.anInt24 - Static117.anInt2781, local919.anInt26);
					}
					if ((local919.anInt23 & local8.anInt2551) != 0 && !this.method2003(local26, local17, local20, local919.anInt23)) {
						local919.aClass3_Sub2_Sub1_1.method2685(0, Static117.anInt2782, Static117.anInt2779, Static117.anInt2764, Static117.anInt2769, local919.anInt20 - Static117.anInt2768, local919.anInt17 - Static117.anInt2766, local919.anInt24 - Static117.anInt2781, local919.anInt26);
					}
				}
			}
			@Pc(1689) Class3_Sub16 local1689;
			if (local23 < this.anInt2787 - 1) {
				local1689 = this.aClass3_Sub16ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean104) {
					Static117.aClass59_7.method1730(local1689);
				}
			}
			if (local17 < Static117.anInt2765) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean104) {
					Static117.aClass59_7.method1730(local1689);
				}
			}
			if (local20 < Static117.anInt2762) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean104) {
					Static117.aClass59_7.method1730(local1689);
				}
			}
			if (local17 > Static117.anInt2765) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean104) {
					Static117.aClass59_7.method1730(local1689);
				}
			}
			if (local20 > Static117.anInt2762) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean104) {
					Static117.aClass59_7.method1730(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(III)Z")
	private boolean method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static117.anInt2771; local1++) {
			@Pc(6) Class18 local6 = Static117.aClass18Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt557 == 1) {
				local15 = local6.anInt550 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt548 + (local6.anInt556 * local15 >> 8);
					local37 = local6.anInt558 + (local6.anInt553 * local15 >> 8);
					local47 = local6.anInt559 + (local6.anInt560 * local15 >> 8);
					local57 = local6.anInt551 + (local6.anInt546 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt557 == 2) {
				local15 = arg0 - local6.anInt550;
				if (local15 > 0) {
					local27 = local6.anInt548 + (local6.anInt556 * local15 >> 8);
					local37 = local6.anInt558 + (local6.anInt553 * local15 >> 8);
					local47 = local6.anInt559 + (local6.anInt560 * local15 >> 8);
					local57 = local6.anInt551 + (local6.anInt546 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt557 == 3) {
				local15 = local6.anInt548 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt550 + (local6.anInt566 * local15 >> 8);
					local37 = local6.anInt552 + (local6.anInt549 * local15 >> 8);
					local47 = local6.anInt559 + (local6.anInt560 * local15 >> 8);
					local57 = local6.anInt551 + (local6.anInt546 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt557 == 4) {
				local15 = arg2 - local6.anInt548;
				if (local15 > 0) {
					local27 = local6.anInt550 + (local6.anInt566 * local15 >> 8);
					local37 = local6.anInt552 + (local6.anInt549 * local15 >> 8);
					local47 = local6.anInt559 + (local6.anInt560 * local15 >> 8);
					local57 = local6.anInt551 + (local6.anInt546 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt557 == 5) {
				local15 = arg1 - local6.anInt559;
				if (local15 > 0) {
					local27 = local6.anInt550 + (local6.anInt566 * local15 >> 8);
					local37 = local6.anInt552 + (local6.anInt549 * local15 >> 8);
					local47 = local6.anInt548 + (local6.anInt556 * local15 >> 8);
					local57 = local6.anInt558 + (local6.anInt553 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(III)Lclient!cd;")
	public Class17 method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2546; local14++) {
			@Pc(20) Class17 local20 = local8.aClass17Array1[local14];
			if ((local20.anInt534 >> 29 & 0x3) == 2 && local20.anInt537 == arg1 && local20.anInt539 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(III)I")
	public int method1980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass36_1 == null ? 0 : local8.aClass36_1.anInt1750;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIII)V")
	public void method1981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class36 local14 = local8.aClass36_1;
		if (local14 != null) {
			local14.anInt1752 = local14.anInt1752 * arg3 / 16;
			local14.anInt1757 = local14.anInt1757 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public void method1982(@OriginalArg(0) int arg0) {
		this.anInt2776 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2789; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2773; local7++) {
				if (this.aClass3_Sub16ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub16ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub16(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!oe;IIIII)V")
	private void method1984(@OriginalArg(0) Class3_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2787) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2789) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2773 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub16 local66 = this.aClass3_Sub16ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class2 local163 = local66.aClass2_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub2_Sub1_Sub6 local173;
										if (local163.aClass3_Sub2_Sub1_1 instanceof Class3_Sub2_Sub1_Sub6) {
											local173 = (Class3_Sub2_Sub1_Sub6) local163.aClass3_Sub2_Sub1_1;
											Static115.method1955(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass3_Sub2_Sub1_2 instanceof Class3_Sub2_Sub1_Sub6) {
											local173 = (Class3_Sub2_Sub1_Sub6) local163.aClass3_Sub2_Sub1_2;
											Static115.method1955(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2546; local237++) {
										@Pc(243) Class17 local243 = local66.aClass17Array1[local237];
										if (local243 != null && local243.aClass3_Sub2_Sub1_3 instanceof Class3_Sub2_Sub1_Sub6) {
											@Pc(253) Class3_Sub2_Sub1_Sub6 local253 = (Class3_Sub2_Sub1_Sub6) local243.aClass3_Sub2_Sub1_3;
											@Pc(261) int local261 = local243.anInt528 + 1 - local243.anInt537;
											@Pc(269) int local269 = local243.anInt530 + 1 - local243.anInt539;
											Static115.method1955(arg0, local253, (local243.anInt537 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt539 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!cd;)V")
	private void method1985(@OriginalArg(0) Class17 arg0) {
		for (@Pc(2) int local2 = arg0.anInt537; local2 <= arg0.anInt528; local2++) {
			for (@Pc(6) int local6 = arg0.anInt539; local6 <= arg0.anInt530; local6++) {
				@Pc(17) Class3_Sub16 local17 = this.aClass3_Sub16ArrayArrayArray1[arg0.anInt544][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2546; local21++) {
						if (local17.aClass17Array1[local21] == arg0) {
							local17.anInt2546--;
							for (local36 = local21; local36 < local17.anInt2546; local36++) {
								local17.aClass17Array1[local36] = local17.aClass17Array1[local36 + 1];
								local17.anIntArray252[local36] = local17.anIntArray252[local36 + 1];
							}
							local17.aClass17Array1[local17.anInt2546] = null;
							break;
						}
					}
					local17.anInt2541 = 0;
					for (local36 = 0; local36 < local17.anInt2546; local36++) {
						local17.anInt2541 |= local17.anIntArray252[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "g", descriptor = "(III)Lclient!ic;")
	public Class36 method1986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass36_1;
	}

	@OriginalMember(owner = "client!og", name = "h", descriptor = "(III)V")
	public void method1987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass2_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(III)Z")
	private boolean method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static117.anInt2785) {
			return false;
		} else if (local8 == Static117.anInt2785) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1978(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method1978(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method1978(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1978(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static117.anInt2785;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static117.anInt2785;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "j", descriptor = "(III)V")
	public void method1989() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2787; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2789; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2773; local7++) {
					@Pc(17) Class3_Sub16 local17 = this.aClass3_Sub16ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class2 local22 = local17.aClass2_1;
						if (local22 != null && local22.aClass3_Sub2_Sub1_1 instanceof Class3_Sub2_Sub1_Sub6) {
							@Pc(32) Class3_Sub2_Sub1_Sub6 local32 = (Class3_Sub2_Sub1_Sub6) local22.aClass3_Sub2_Sub1_1;
							this.method1984(local32, local1, local4, local7, 1, 1);
							if (local22.aClass3_Sub2_Sub1_2 instanceof Class3_Sub2_Sub1_Sub6) {
								@Pc(48) Class3_Sub2_Sub1_Sub6 local48 = (Class3_Sub2_Sub1_Sub6) local22.aClass3_Sub2_Sub1_2;
								this.method1984(local48, local1, local4, local7, 1, 1);
								Static115.method1955(local32, local48, 0, 0, 0, false);
								local22.aClass3_Sub2_Sub1_2 = local48.method1938(local48.aShort31, local48.aShort27, -50, -10, -50, false);
							}
							local22.aClass3_Sub2_Sub1_1 = local32.method1938(local32.aShort31, local32.aShort27, -50, -10, -50, false);
						}
						@Pc(107) Class3_Sub2_Sub1_Sub6 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt2546; local91++) {
							@Pc(97) Class17 local97 = local17.aClass17Array1[local91];
							if (local97 != null && local97.aClass3_Sub2_Sub1_3 instanceof Class3_Sub2_Sub1_Sub6) {
								local107 = (Class3_Sub2_Sub1_Sub6) local97.aClass3_Sub2_Sub1_3;
								this.method1984(local107, local1, local4, local7, local97.anInt528 + 1 - local97.anInt537, local97.anInt530 - local97.anInt539 + 1);
								local97.aClass3_Sub2_Sub1_3 = local107.method1938(local107.aShort31, local107.aShort27, -50, -10, -50, false);
							}
						}
						@Pc(148) Class60 local148 = local17.aClass60_1;
						if (local148 != null && local148.aClass3_Sub2_Sub1_9 instanceof Class3_Sub2_Sub1_Sub6) {
							local107 = (Class3_Sub2_Sub1_Sub6) local148.aClass3_Sub2_Sub1_9;
							this.method1968(local107, local1, local4, local7);
							local148.aClass3_Sub2_Sub1_9 = local107.method1938(local107.aShort31, local107.aShort27, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "k", descriptor = "(III)V")
	public void method1990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2546; local13++) {
			@Pc(19) Class17 local19 = local8.aClass17Array1[local13];
			if ((local19.anInt534 >> 29 & 0x3) == 2 && local19.anInt537 == arg1 && local19.anInt539 == arg2) {
				this.method1985(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(IIII)V")
	public void method1991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].anInt2547 = arg3;
		}
	}

	@OriginalMember(owner = "client!og", name = "l", descriptor = "(III)Lclient!aa;")
	public Class2 method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass2_1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(II)V")
	public void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub16 local31 = this.aClass3_Sub16ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub16ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2552--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2546; local41++) {
					@Pc(47) Class17 local47 = local31.aClass17Array1[local41];
					if ((local47.anInt534 >> 29 & 0x3) == 2 && local47.anInt537 == arg0 && local47.anInt539 == arg1) {
						local47.anInt544--;
					}
				}
			}
		}
		if (this.aClass3_Sub16ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub16ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub16(0, arg0, arg1);
		}
		this.aClass3_Sub16ArrayArrayArray1[0][arg0][arg1].aClass3_Sub16_1 = local8;
		this.aClass3_Sub16ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "()V")
	private void method1994() {
		@Pc(3) int local3 = Static117.anIntArray316[Static117.anInt2778];
		@Pc(7) Class18[] local7 = Static117.aClass18ArrayArray1[Static117.anInt2778];
		Static117.anInt2771 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class18 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt554 == 1) {
				local27 = local16.anInt547 + Static117.anInt2763 - Static117.anInt2765;
				if (local27 >= 0 && local27 <= Static117.anInt2763 + Static117.anInt2763) {
					local42 = local16.anInt565 + Static117.anInt2763 - Static117.anInt2762;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt567 + Static117.anInt2763 - Static117.anInt2762;
					if (local53 > Static117.anInt2763 + Static117.anInt2763) {
						local53 = Static117.anInt2763 + Static117.anInt2763;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static117.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static117.anInt2768 - local16.anInt550;
						if (local85 > 32) {
							local16.anInt557 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt557 = 2;
							local85 = -local85;
						}
						local16.anInt556 = (local16.anInt548 - Static117.anInt2781 << 8) / local85;
						local16.anInt553 = (local16.anInt558 - Static117.anInt2781 << 8) / local85;
						local16.anInt560 = (local16.anInt559 - Static117.anInt2766 << 8) / local85;
						local16.anInt546 = (local16.anInt551 - Static117.anInt2766 << 8) / local85;
						Static117.aClass18Array1[Static117.anInt2771++] = local16;
					}
				}
			} else if (local16.anInt554 == 2) {
				local27 = local16.anInt565 + Static117.anInt2763 - Static117.anInt2762;
				if (local27 >= 0 && local27 <= Static117.anInt2763 + Static117.anInt2763) {
					local42 = local16.anInt547 + Static117.anInt2763 - Static117.anInt2765;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt545 + Static117.anInt2763 - Static117.anInt2765;
					if (local53 > Static117.anInt2763 + Static117.anInt2763) {
						local53 = Static117.anInt2763 + Static117.anInt2763;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static117.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static117.anInt2781 - local16.anInt548;
						if (local85 > 32) {
							local16.anInt557 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt557 = 4;
							local85 = -local85;
						}
						local16.anInt566 = (local16.anInt550 - Static117.anInt2768 << 8) / local85;
						local16.anInt549 = (local16.anInt552 - Static117.anInt2768 << 8) / local85;
						local16.anInt560 = (local16.anInt559 - Static117.anInt2766 << 8) / local85;
						local16.anInt546 = (local16.anInt551 - Static117.anInt2766 << 8) / local85;
						Static117.aClass18Array1[Static117.anInt2771++] = local16;
					}
				}
			} else if (local16.anInt554 == 4) {
				local27 = local16.anInt559 - Static117.anInt2766;
				if (local27 > 128) {
					local42 = local16.anInt565 + Static117.anInt2763 - Static117.anInt2762;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt567 + Static117.anInt2763 - Static117.anInt2762;
					if (local53 > Static117.anInt2763 + Static117.anInt2763) {
						local53 = Static117.anInt2763 + Static117.anInt2763;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt547 + Static117.anInt2763 - Static117.anInt2765;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt545 + Static117.anInt2763 - Static117.anInt2765;
						if (local85 > Static117.anInt2763 + Static117.anInt2763) {
							local85 = Static117.anInt2763 + Static117.anInt2763;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static117.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt557 = 5;
							local16.anInt566 = (local16.anInt550 - Static117.anInt2768 << 8) / local27;
							local16.anInt549 = (local16.anInt552 - Static117.anInt2768 << 8) / local27;
							local16.anInt556 = (local16.anInt548 - Static117.anInt2781 << 8) / local27;
							local16.anInt553 = (local16.anInt558 - Static117.anInt2781 << 8) / local27;
							Static117.aClass18Array1[Static117.anInt2771++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "m", descriptor = "(III)I")
	public int method1996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2546; local14++) {
			@Pc(20) Class17 local20 = local8.aClass17Array1[local14];
			if ((local20.anInt534 >> 29 & 0x3) == 2 && local20.anInt537 == arg1 && local20.anInt539 == arg2) {
				return local20.anInt534;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(IIII)Z")
	private boolean method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1988(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1978(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] + arg3, local15 + 1) && this.method1978(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] + arg3, local15 + 1) && this.method1978(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] + arg3, local15 + 128 - 1) && this.method1978(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] + arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "n", descriptor = "(III)V")
	public void method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass36_1 = null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIII)V")
	public void method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2789 * 128) {
			arg0 = this.anInt2789 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2773 * 128) {
			arg2 = this.anInt2773 * 128 - 1;
		}
		Static117.anInt2785++;
		Static117.anInt2782 = Class3_Sub2_Sub3_Sub4.anIntArray347[arg3];
		Static117.anInt2779 = Class3_Sub2_Sub3_Sub4.anIntArray346[arg3];
		Static117.anInt2764 = Class3_Sub2_Sub3_Sub4.anIntArray347[arg4];
		Static117.anInt2769 = Class3_Sub2_Sub3_Sub4.anIntArray346[arg4];
		Static117.aBooleanArrayArray1 = Static117.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static117.anInt2768 = arg0;
		Static117.anInt2766 = arg1;
		Static117.anInt2781 = arg2;
		Static117.anInt2765 = arg0 / 128;
		Static117.anInt2762 = arg2 / 128;
		Static117.anInt2778 = arg5;
		Static117.anInt2783 = Static117.anInt2765 - Static117.anInt2763;
		if (Static117.anInt2783 < 0) {
			Static117.anInt2783 = 0;
		}
		Static117.anInt2772 = Static117.anInt2762 - Static117.anInt2763;
		if (Static117.anInt2772 < 0) {
			Static117.anInt2772 = 0;
		}
		Static117.anInt2788 = Static117.anInt2765 + Static117.anInt2763;
		if (Static117.anInt2788 > this.anInt2789) {
			Static117.anInt2788 = this.anInt2789;
		}
		Static117.anInt2775 = Static117.anInt2762 + Static117.anInt2763;
		if (Static117.anInt2775 > this.anInt2773) {
			Static117.anInt2775 = this.anInt2773;
		}
		this.method1994();
		Static117.anInt2780 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2776; local128 < this.anInt2787; local128++) {
			@Pc(134) Class3_Sub16[][] local134 = this.aClass3_Sub16ArrayArrayArray1[local128];
			for (local136 = Static117.anInt2783; local136 < Static117.anInt2788; local136++) {
				for (local139 = Static117.anInt2772; local139 < Static117.anInt2775; local139++) {
					@Pc(146) Class3_Sub16 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2547 <= arg5 && (Static117.aBooleanArrayArray1[local136 + Static117.anInt2763 - Static117.anInt2765][local139 + Static117.anInt2763 - Static117.anInt2762] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean106 = true;
							local146.aBoolean104 = true;
							if (local146.anInt2546 > 0) {
								local146.aBoolean105 = true;
							} else {
								local146.aBoolean105 = false;
							}
							Static117.anInt2780++;
						} else {
							local146.aBoolean106 = false;
							local146.aBoolean104 = false;
							local146.anInt2548 = 0;
						}
					}
				}
			}
		}
		@Pc(242) int local242;
		@Pc(251) int local251;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(238) int local238;
		for (@Pc(224) int local224 = this.anInt2776; local224 < this.anInt2787; local224++) {
			@Pc(230) Class3_Sub16[][] local230 = this.aClass3_Sub16ArrayArrayArray1[local224];
			for (local139 = -Static117.anInt2763; local139 <= 0; local139++) {
				local238 = Static117.anInt2765 + local139;
				local242 = Static117.anInt2765 - local139;
				if (local238 >= Static117.anInt2783 || local242 < Static117.anInt2788) {
					for (local251 = -Static117.anInt2763; local251 <= 0; local251++) {
						local256 = Static117.anInt2762 + local251;
						local260 = Static117.anInt2762 - local251;
						@Pc(272) Class3_Sub16 local272;
						if (local238 >= Static117.anInt2783) {
							if (local256 >= Static117.anInt2772) {
								local272 = local230[local238][local256];
								if (local272 != null && local272.aBoolean106) {
									this.method1975(local272, true);
								}
							}
							if (local260 < Static117.anInt2775) {
								local272 = local230[local238][local260];
								if (local272 != null && local272.aBoolean106) {
									this.method1975(local272, true);
								}
							}
						}
						if (local242 < Static117.anInt2788) {
							if (local256 >= Static117.anInt2772) {
								local272 = local230[local242][local256];
								if (local272 != null && local272.aBoolean106) {
									this.method1975(local272, true);
								}
							}
							if (local260 < Static117.anInt2775) {
								local272 = local230[local242][local260];
								if (local272 != null && local272.aBoolean106) {
									this.method1975(local272, true);
								}
							}
						}
						if (Static117.anInt2780 == 0) {
							Static117.aBoolean116 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2776; local136 < this.anInt2787; local136++) {
			@Pc(363) Class3_Sub16[][] local363 = this.aClass3_Sub16ArrayArrayArray1[local136];
			for (local238 = -Static117.anInt2763; local238 <= 0; local238++) {
				local242 = Static117.anInt2765 + local238;
				local251 = Static117.anInt2765 - local238;
				if (local242 >= Static117.anInt2783 || local251 < Static117.anInt2788) {
					for (local256 = -Static117.anInt2763; local256 <= 0; local256++) {
						local260 = Static117.anInt2762 + local256;
						@Pc(393) int local393 = Static117.anInt2762 - local256;
						@Pc(405) Class3_Sub16 local405;
						if (local242 >= Static117.anInt2783) {
							if (local260 >= Static117.anInt2772) {
								local405 = local363[local242][local260];
								if (local405 != null && local405.aBoolean106) {
									this.method1975(local405, false);
								}
							}
							if (local393 < Static117.anInt2775) {
								local405 = local363[local242][local393];
								if (local405 != null && local405.aBoolean106) {
									this.method1975(local405, false);
								}
							}
						}
						if (local251 < Static117.anInt2788) {
							if (local260 >= Static117.anInt2772) {
								local405 = local363[local251][local260];
								if (local405 != null && local405.aBoolean106) {
									this.method1975(local405, false);
								}
							}
							if (local393 < Static117.anInt2775) {
								local405 = local363[local251][local393];
								if (local405 != null && local405.aBoolean106) {
									this.method1975(local405, false);
								}
							}
						}
						if (Static117.anInt2780 == 0) {
							Static117.aBoolean116 = false;
							return;
						}
					}
				}
			}
		}
		Static117.aBoolean116 = false;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIILclient!ac;IIIIII)Z")
	public boolean method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub2_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1971(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!og", name = "f", descriptor = "(IIII)Z")
	private boolean method2003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1988(arg0, arg1, arg2)) {
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
				if (local11 > Static117.anInt2768) {
					if (!this.method1978(local11, local26, local15)) {
						return false;
					}
					if (!this.method1978(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1978(local11, local30, local15)) {
						return false;
					}
					if (!this.method1978(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1978(local11, local34, local15)) {
					return false;
				}
				if (!this.method1978(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static117.anInt2781) {
					if (!this.method1978(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1978(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1978(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1978(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1978(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1978(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static117.anInt2768) {
					if (!this.method1978(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1978(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1978(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1978(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1978(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1978(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static117.anInt2781) {
					if (!this.method1978(local11, local26, local15)) {
						return false;
					}
					if (!this.method1978(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1978(local11, local30, local15)) {
						return false;
					}
					if (!this.method1978(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1978(local11, local34, local15)) {
					return false;
				}
				if (!this.method1978(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1978(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1978(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1978(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1978(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1978(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "()V")
	public void method2004() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2767; local1++) {
			@Pc(7) Class17 local7 = this.aClass17Array3[local1];
			this.method1985(local7);
			this.aClass17Array3[local1] = null;
		}
		this.anInt2767 = 0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIILclient!ac;IIZ)Z")
	public boolean method2005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1971(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!og", name = "o", descriptor = "(III)Lclient!nh;")
	public Class60 method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass60_1 == null ? null : local8.aClass60_1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class11 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class11(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub16ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub16ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub16(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass11_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class11(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub16ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub16ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub16(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass11_1 = local12;
		} else {
			@Pc(140) Class42 local140 = new Class42(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub16ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub16ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub16(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local140;
		}
	}

	@OriginalMember(owner = "client!og", name = "p", descriptor = "(III)I")
	public int method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub16 local8 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass2_1 == null ? 0 : local8.aClass2_1.anInt26;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(IIIIII)Z")
	private boolean method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static117.anInt2785) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] + arg5;
			if (!this.method1978(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1978(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1978(local21, local167, local195)) {
				return false;
			} else if (this.method1978(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1988(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1978(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] + arg5, local21 + 1) && this.method1978(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] + arg5, local21 + 1) && this.method1978(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] + arg5, local21 + 128 - 1) && this.method1978(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] + arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;Lclient!ac;IIII)V")
	public void method2010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) Class3_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class2 local8 = new Class2();
		local8.anInt26 = arg8;
		local8.anInt18 = arg9;
		local8.anInt20 = arg1 * 128 + 64;
		local8.anInt24 = arg2 * 128 + 64;
		local8.anInt17 = arg3;
		local8.aClass3_Sub2_Sub1_1 = arg4;
		local8.aClass3_Sub2_Sub1_2 = arg5;
		local8.anInt23 = arg6;
		local8.anInt19 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub16ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub16ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub16(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass2_1 = local8;
	}

	@OriginalMember(owner = "client!og", name = "q", descriptor = "(III)V")
	public void method2011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static117.aBoolean116 = true;
		Static117.anInt2770 = arg0;
		Static117.anInt2777 = arg1;
		Static117.anInt2784 = arg2;
		Static117.anInt2774 = -1;
		Static117.anInt2786 = -1;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!jd;IIIIII)V")
	private void method2012(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray181.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray181[local5] - Static117.anInt2768;
			local20 = arg0.anIntArray183[local5] - Static117.anInt2766;
			local27 = arg0.anIntArray182[local5] - Static117.anInt2781;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray185 != null) {
				Static75.anIntArray177[local5] = local37;
				Static75.anIntArray187[local5] = local59;
				Static75.anIntArray188[local5] = local69;
			}
			Static75.anIntArray190[local5] = Static132.anInt3101 + (local37 << 9) / local69;
			Static75.anIntArray189[local5] = Static132.anInt3099 + (local59 << 9) / local69;
		}
		Static132.anInt3098 = 0;
		local3 = arg0.anIntArray176.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray176[local13];
			local27 = arg0.anIntArray180[local13];
			local37 = arg0.anIntArray186[local13];
			@Pc(142) int local142 = Static75.anIntArray190[local20];
			@Pc(146) int local146 = Static75.anIntArray190[local27];
			@Pc(150) int local150 = Static75.anIntArray190[local37];
			@Pc(154) int local154 = Static75.anIntArray189[local20];
			@Pc(158) int local158 = Static75.anIntArray189[local27];
			@Pc(162) int local162 = Static75.anIntArray189[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static117.aBoolean116 && this.method1976(Static117.anInt2777, Static117.anInt2784, local154, local158, local162, local142, local146, local150)) {
					Static117.anInt2774 = arg5;
					Static117.anInt2786 = arg6;
				}
				Static132.aBoolean129 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static132.anInt3097 || local146 > Static132.anInt3097 || local150 > Static132.anInt3097) {
					Static132.aBoolean129 = true;
				}
				if (arg0.anIntArray185 == null || arg0.anIntArray185[local13] == -1) {
					if (arg0.anIntArray178[local13] != 12345678) {
						Static132.method2246(local154, local158, local162, local142, local146, local150, arg0.anIntArray178[local13], arg0.anIntArray184[local13], arg0.anIntArray179[local13]);
					}
				} else if (Static117.aBoolean117) {
					@Pc(364) int local364 = Static132.anInterface3_1.method2819(arg0.anIntArray185[local13]);
					Static132.method2246(local154, local158, local162, local142, local146, local150, Static117.method1977(local364, arg0.anIntArray178[local13]), Static117.method1977(local364, arg0.anIntArray184[local13]), Static117.method1977(local364, arg0.anIntArray179[local13]));
				} else if (arg0.aBoolean79) {
					Static132.method2243(local154, local158, local162, local142, local146, local150, arg0.anIntArray178[local13], arg0.anIntArray184[local13], arg0.anIntArray179[local13], Static75.anIntArray177[0], Static75.anIntArray177[1], Static75.anIntArray177[3], Static75.anIntArray187[0], Static75.anIntArray187[1], Static75.anIntArray187[3], Static75.anIntArray188[0], Static75.anIntArray188[1], Static75.anIntArray188[3], arg0.anIntArray185[local13]);
				} else {
					Static132.method2243(local154, local158, local162, local142, local146, local150, arg0.anIntArray178[local13], arg0.anIntArray184[local13], arg0.anIntArray179[local13], Static75.anIntArray177[local20], Static75.anIntArray177[local27], Static75.anIntArray177[local37], Static75.anIntArray187[local20], Static75.anIntArray187[local27], Static75.anIntArray187[local37], Static75.anIntArray188[local20], Static75.anIntArray188[local27], Static75.anIntArray188[local37], arg0.anIntArray185[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIILclient!ac;ILclient!ac;Lclient!ac;)V")
	public void method2013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub2_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub2_Sub1 arg6, @OriginalArg(7) Class3_Sub2_Sub1 arg7) {
		@Pc(3) Class55 local3 = new Class55();
		local3.aClass3_Sub2_Sub1_8 = arg4;
		local3.anInt2428 = arg1 * 128 + 64;
		local3.anInt2433 = arg2 * 128 + 64;
		local3.anInt2430 = arg3;
		local3.anInt2431 = arg5;
		local3.aClass3_Sub2_Sub1_7 = arg6;
		local3.aClass3_Sub2_Sub1_6 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(43) Class3_Sub16 local43 = this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2546; local47++) {
				if ((local43.aClass17Array1[local47].anInt538 & 0x100) == 256 && local43.aClass17Array1[local47].aClass3_Sub2_Sub1_3 instanceof Class3_Sub2_Sub1_Sub2) {
					@Pc(71) Class3_Sub2_Sub1_Sub2 local71 = (Class3_Sub2_Sub1_Sub2) local43.aClass17Array1[local47].aClass3_Sub2_Sub1_3;
					local71.method1785();
					if (local71.aShort34 < local34) {
						local34 = local71.aShort34;
					}
				}
			}
		}
		local3.anInt2426 = -local34;
		if (this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub16(arg0, arg1, arg2);
		}
		this.aClass3_Sub16ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local3;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIILclient!ac;III)Z")
	public boolean method2014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub2_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1971(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!bg;IIIIIII)V")
	private void method2015(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static117.anInt2768;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static117.anInt2781;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static117.anInt2766;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static117.anInt2766;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static117.anInt2766;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static117.anInt2766;
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
		@Pc(279) int local279 = Static132.anInt3101 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static132.anInt3099 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static132.anInt3101 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static132.anInt3099 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static132.anInt3101 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static132.anInt3099 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static132.anInt3101 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static132.anInt3099 + (local89 << 9) / local265;
		Static132.anInt3098 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static117.aBoolean116 && this.method1976(Static117.anInt2777, Static117.anInt2784, local319, local335, local303, local311, local327, local295)) {
				Static117.anInt2774 = arg6;
				Static117.anInt2786 = arg7;
			}
			Static132.aBoolean129 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static132.anInt3097 || local327 > Static132.anInt3097 || local295 > Static132.anInt3097) {
				Static132.aBoolean129 = true;
			}
			if (arg0.anInt424 == -1) {
				if (arg0.anInt421 != 12345678) {
					Static132.method2246(local319, local335, local303, local311, local327, local295, arg0.anInt421, arg0.anInt429, arg0.anInt430);
				}
			} else if (Static117.aBoolean117) {
				local472 = Static132.anInterface3_1.method2819(arg0.anInt424);
				Static132.method2246(local319, local335, local303, local311, local327, local295, Static117.method1977(local472, arg0.anInt421), Static117.method1977(local472, arg0.anInt429), Static117.method1977(local472, arg0.anInt430));
			} else if (arg0.aBoolean13) {
				Static132.method2243(local319, local335, local303, local311, local327, local295, arg0.anInt421, arg0.anInt429, arg0.anInt430, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt424);
			} else {
				Static132.method2243(local319, local335, local303, local311, local327, local295, arg0.anInt421, arg0.anInt429, arg0.anInt430, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt424);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static117.aBoolean116 && this.method1976(Static117.anInt2777, Static117.anInt2784, local287, local303, local335, local279, local295, local327)) {
			Static117.anInt2774 = arg6;
			Static117.anInt2786 = arg7;
		}
		Static132.aBoolean129 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static132.anInt3097 || local295 > Static132.anInt3097 || local327 > Static132.anInt3097) {
			Static132.aBoolean129 = true;
		}
		if (arg0.anInt424 != -1) {
			if (!Static117.aBoolean117) {
				Static132.method2243(local287, local303, local335, local279, local295, local327, arg0.anInt431, arg0.anInt430, arg0.anInt429, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt424);
				return;
			}
			local472 = Static132.anInterface3_1.method2819(arg0.anInt424);
			Static132.method2246(local287, local303, local335, local279, local295, local327, Static117.method1977(local472, arg0.anInt431), Static117.method1977(local472, arg0.anInt430), Static117.method1977(local472, arg0.anInt429));
		} else if (arg0.anInt431 != 12345678) {
			Static132.method2246(local287, local303, local335, local279, local295, local327, arg0.anInt431, arg0.anInt430, arg0.anInt429);
			return;
		}
	}
}
