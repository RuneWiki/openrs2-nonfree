import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class5 {

	@OriginalMember(owner = "client!b", name = "w", descriptor = "I")
	private int anInt194 = 0;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	private int anInt187 = 0;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[Lclient!fc;")
	private final Class19[] aClass19Array1 = new Class19[5000];

	@OriginalMember(owner = "client!b", name = "P", descriptor = "[[I")
	private final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!b", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray3 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	private final int anInt185;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	private final int anInt188;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private final int anInt192;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "[[[Lclient!hf;")
	private final Class1_Sub7[][][] aClass1_Sub7ArrayArrayArray1;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(III[[[I)V")
	public Class5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt185 = arg0;
		this.anInt188 = arg1;
		this.anInt192 = arg2;
		this.aClass1_Sub7ArrayArrayArray1 = new Class1_Sub7[arg0][arg1][arg2];
		this.anIntArrayArrayArray2 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray1 = arg3;
		this.method139();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z")
	private boolean method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static7.anInt204; local1++) {
			@Pc(6) Class63 local6 = Static7.aClass63Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2275 == 1) {
				local15 = local6.anInt2274 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2269 + (local6.anInt2268 * local15 >> 8);
					local37 = local6.anInt2272 + (local6.anInt2270 * local15 >> 8);
					local47 = local6.anInt2258 + (local6.anInt2277 * local15 >> 8);
					local57 = local6.anInt2278 + (local6.anInt2266 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2275 == 2) {
				local15 = arg0 - local6.anInt2274;
				if (local15 > 0) {
					local27 = local6.anInt2269 + (local6.anInt2268 * local15 >> 8);
					local37 = local6.anInt2272 + (local6.anInt2270 * local15 >> 8);
					local47 = local6.anInt2258 + (local6.anInt2277 * local15 >> 8);
					local57 = local6.anInt2278 + (local6.anInt2266 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2275 == 3) {
				local15 = local6.anInt2269 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2274 + (local6.anInt2267 * local15 >> 8);
					local37 = local6.anInt2271 + (local6.anInt2264 * local15 >> 8);
					local47 = local6.anInt2258 + (local6.anInt2277 * local15 >> 8);
					local57 = local6.anInt2278 + (local6.anInt2266 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2275 == 4) {
				local15 = arg2 - local6.anInt2269;
				if (local15 > 0) {
					local27 = local6.anInt2274 + (local6.anInt2267 * local15 >> 8);
					local37 = local6.anInt2271 + (local6.anInt2264 * local15 >> 8);
					local47 = local6.anInt2258 + (local6.anInt2277 * local15 >> 8);
					local57 = local6.anInt2278 + (local6.anInt2266 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2275 == 5) {
				local15 = arg1 - local6.anInt2258;
				if (local15 > 0) {
					local27 = local6.anInt2274 + (local6.anInt2267 * local15 >> 8);
					local37 = local6.anInt2271 + (local6.anInt2264 * local15 >> 8);
					local47 = local6.anInt2269 + (local6.anInt2268 * local15 >> 8);
					local57 = local6.anInt2272 + (local6.anInt2270 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(III)V")
	public void method95(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass9_1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(III)Lclient!dd;")
	public Class13 method97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass13_1 == null ? null : local8.aClass13_1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!je;III)V")
	private void method98(@OriginalArg(0) Class1_Sub1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub7 local14;
		@Pc(29) Class1_Sub1_Sub2_Sub5 local29;
		if (arg2 < this.anInt188) {
			local14 = this.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass1_Sub1_Sub2_5 instanceof Class1_Sub1_Sub2_Sub5) {
				local29 = (Class1_Sub1_Sub2_Sub5) local14.aClass13_1.aClass1_Sub1_Sub2_5;
				Static60.method1098(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt188) {
			local14 = this.aClass1_Sub7ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass1_Sub1_Sub2_5 instanceof Class1_Sub1_Sub2_Sub5) {
				local29 = (Class1_Sub1_Sub2_Sub5) local14.aClass13_1.aClass1_Sub1_Sub2_5;
				Static60.method1098(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt188 && arg3 < this.anInt192) {
			local14 = this.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass1_Sub1_Sub2_5 instanceof Class1_Sub1_Sub2_Sub5) {
				local29 = (Class1_Sub1_Sub2_Sub5) local14.aClass13_1.aClass1_Sub1_Sub2_5;
				Static60.method1098(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt188 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub7ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass13_1 != null && local14.aClass13_1.aClass1_Sub1_Sub2_5 instanceof Class1_Sub1_Sub2_Sub5) {
			local29 = (Class1_Sub1_Sub2_Sub5) local14.aClass13_1.aClass1_Sub1_Sub2_5;
			Static60.method1098(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(III)Z")
	private boolean method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local8 == -Static7.anInt208) {
			return false;
		} else if (local8 == Static7.anInt208) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method94(local23 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2], local27 + 1) && this.method94(local23 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2], local27 + 1) && this.method94(local23 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method94(local23 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = Static7.anInt208;
				return true;
			} else {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static7.anInt208;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public void method100(@OriginalArg(0) int arg0) {
		this.anInt194 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt188; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt192; local7++) {
				if (this.aClass1_Sub7ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub7ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub7(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIILclient!cc;IZII)Z")
	private boolean method101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt188 || local4 >= this.anInt192) {
					return false;
				}
				@Pc(28) Class1_Sub7 local28 = this.aClass1_Sub7ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1401 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class19 local52 = new Class19();
		local52.anInt1086 = arg11;
		local52.anInt1072 = arg12;
		local52.anInt1080 = arg0;
		local52.anInt1075 = arg5;
		local52.anInt1077 = arg6;
		local52.anInt1071 = arg7;
		local52.aClass1_Sub1_Sub2_6 = arg8;
		local52.anInt1088 = arg9;
		local52.anInt1089 = arg1;
		local52.anInt1084 = arg2;
		local52.anInt1082 = arg1 + arg3 - 1;
		local52.anInt1087 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub7ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub7ArrayArrayArray1[local130][local98][local101] = new Class1_Sub7(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub7 local166 = this.aClass1_Sub7ArrayArrayArray1[arg0][local98][local101];
				local166.aClass19Array3[local166.anInt1401] = local52;
				local166.anIntArray193[local166.anInt1401] = local104;
				local166.anInt1403 |= local104;
				local166.anInt1401++;
			}
		}
		if (arg10) {
			this.aClass19Array1[this.anInt187++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(III)I")
	public int method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass13_1 == null ? 0 : local8.aClass13_1.anInt839;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII)V")
	public void method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class9 local14 = local8.aClass9_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt552 = local23 + (local14.anInt552 - local23) * arg3 / 16;
			local14.anInt537 = local29 + (local14.anInt537 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(III)V")
	public void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!fc;)V")
	private void method105(@OriginalArg(0) Class19 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1089; local2 <= arg0.anInt1082; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1084; local6 <= arg0.anInt1087; local6++) {
				@Pc(17) Class1_Sub7 local17 = this.aClass1_Sub7ArrayArrayArray1[arg0.anInt1080][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1401; local21++) {
						if (local17.aClass19Array3[local21] == arg0) {
							local17.anInt1401--;
							for (local36 = local21; local36 < local17.anInt1401; local36++) {
								local17.aClass19Array3[local36] = local17.aClass19Array3[local36 + 1];
								local17.anIntArray193[local36] = local17.anIntArray193[local36 + 1];
							}
							local17.aClass19Array3[local17.anInt1401] = null;
							break;
						}
					}
					local17.anInt1403 = 0;
					for (local36 = 0; local36 < local17.anInt1401; local36++) {
						local17.anInt1403 |= local17.anIntArray193[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!hf;Z)V")
	private void method106(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) boolean arg1) {
		Static7.aClass31_8.method1005(arg0);
		while (true) {
			@Pc(8) Class1_Sub7 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub7[][] local31;
			@Pc(49) Class1_Sub7 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class57 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class19 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class1_Sub7 var35;
										while (true) {
											do {
												local8 = (Class1_Sub7) Static7.aClass31_8.method999();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean122);
											local17 = local8.anInt1400;
											local20 = local8.anInt1405;
											local23 = local8.anInt1404;
											local26 = local8.anInt1407;
											local31 = this.aClass1_Sub7ArrayArrayArray1[local23];
											if (!local8.aBoolean120) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub7ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean122) {
														continue;
													}
												}
												if (local17 <= Static7.anInt205 && local17 > Static7.anInt184) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean122 && (local49.aBoolean120 || (local8.anInt1403 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static7.anInt205 && local17 < Static7.anInt197 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean122 && (local49.aBoolean120 || (local8.anInt1403 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static7.anInt199 && local20 > Static7.anInt183) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean122 && (local49.aBoolean120 || (local8.anInt1403 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static7.anInt199 && local20 < Static7.anInt195 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean122 && (local49.aBoolean120 || (local8.anInt1403 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean120 = false;
											if (local8.aClass1_Sub7_1 != null) {
												local49 = local8.aClass1_Sub7_1;
												if (local49.aClass15_1 == null) {
													if (local49.aClass72_1 != null && !this.method99(0, local17, local20)) {
														this.method116(local49.aClass72_1, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local17, local20);
													}
												} else if (!this.method99(0, local17, local20)) {
													this.method110(local49.aClass15_1, 0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local17, local20);
												}
												@Pc(225) Class57 local225 = local49.aClass57_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub2_8.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local225.anInt2113 - Static7.anInt206, local225.anInt2115 - Static7.anInt201, local225.anInt2110 - Static7.anInt198, local225.anInt2103);
												}
												for (local251 = 0; local251 < local49.anInt1401; local251++) {
													var12 = local49.aClass19Array3[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub2_6.method1789(var12.anInt1088, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, var12.anInt1075 - Static7.anInt206, var12.anInt1071 - Static7.anInt201, var12.anInt1077 - Static7.anInt198, var12.anInt1086);
													}
												}
											}
											var24 = false;
											if (local8.aClass15_1 == null) {
												if (local8.aClass72_1 != null && !this.method99(local26, local17, local20)) {
													var24 = true;
													this.method116(local8.aClass72_1, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local17, local20);
												}
											} else if (!this.method99(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass15_1.anInt976 != 12345678 || Static7.aBoolean28 && local23 <= Static7.anInt191) {
													this.method110(local8.aClass15_1, local26, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class57 local350 = local8.aClass57_1;
											@Pc(353) Class9 local353 = local8.aClass9_1;
											if (local350 != null || local353 != null) {
												if (Static7.anInt205 == local17) {
													var23++;
												} else if (Static7.anInt205 < local17) {
													var23 += 2;
												}
												if (Static7.anInt199 == local20) {
													var23 += 3;
												} else if (Static7.anInt199 > local20) {
													var23 += 6;
												}
												local251 = Static7.anIntArray56[var23];
												local8.anInt1406 = Static7.anIntArray53[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2112 & Static7.anIntArray55[var23]) == 0) {
													local8.anInt1396 = 0;
												} else if (local350.anInt2112 == 16) {
													local8.anInt1396 = 3;
													local8.anInt1398 = Static7.anIntArray52[var23];
													local8.anInt1399 = 3 - local8.anInt1398;
												} else if (local350.anInt2112 == 32) {
													local8.anInt1396 = 6;
													local8.anInt1398 = Static7.anIntArray57[var23];
													local8.anInt1399 = 6 - local8.anInt1398;
												} else if (local350.anInt2112 == 64) {
													local8.anInt1396 = 12;
													local8.anInt1398 = Static7.anIntArray54[var23];
													local8.anInt1399 = 12 - local8.anInt1398;
												} else {
													local8.anInt1396 = 9;
													local8.anInt1398 = Static7.anIntArray58[var23];
													local8.anInt1399 = 9 - local8.anInt1398;
												}
												if ((local350.anInt2112 & local251) != 0 && !this.method136(local26, local17, local20, local350.anInt2112)) {
													local350.aClass1_Sub1_Sub2_8.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local350.anInt2113 - Static7.anInt206, local350.anInt2115 - Static7.anInt201, local350.anInt2110 - Static7.anInt198, local350.anInt2103);
												}
												if ((local350.anInt2104 & local251) != 0 && !this.method136(local26, local17, local20, local350.anInt2104)) {
													local350.aClass1_Sub1_Sub2_7.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local350.anInt2113 - Static7.anInt206, local350.anInt2115 - Static7.anInt201, local350.anInt2110 - Static7.anInt198, local350.anInt2103);
												}
											}
											if (local353 != null && !this.method138(local26, local17, local20, local353.aClass1_Sub1_Sub2_4.anInt2467)) {
												if ((local353.anInt542 & local251) != 0) {
													local353.aClass1_Sub1_Sub2_4.method1789(local353.anInt539, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local353.anInt552 - Static7.anInt206, local353.anInt540 - Static7.anInt201, local353.anInt537 - Static7.anInt198, local353.anInt541);
												} else if ((local353.anInt542 & 0x300) != 0) {
													local588 = local353.anInt552 - Static7.anInt206;
													local593 = local353.anInt540 - Static7.anInt201;
													local598 = local353.anInt537 - Static7.anInt198;
													local601 = local353.anInt539;
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
													if ((local353.anInt542 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static7.anIntArray51[local601];
														local645 = local598 + Static7.anIntArray48[local601];
														local353.aClass1_Sub1_Sub2_4.method1789(local601 * 512 + 256, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local639, local593, local645, local353.anInt541);
													}
													if ((local353.anInt542 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static7.anIntArray50[local601];
														local645 = local598 + Static7.anIntArray47[local601];
														local353.aClass1_Sub1_Sub2_4.method1789(local601 * 512 + 1280 & 0x7FF, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local639, local593, local645, local353.anInt541);
													}
												}
											}
											if (var24) {
												@Pc(706) Class13 local706 = local8.aClass13_1;
												if (local706 != null) {
													local706.aClass1_Sub1_Sub2_5.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local706.anInt842 - Static7.anInt206, local706.anInt836 - Static7.anInt201, local706.anInt841 - Static7.anInt198, local706.anInt839);
												}
												@Pc(733) Class8 local733 = local8.aClass8_1;
												if (local733 != null && local733.anInt508 == 0) {
													if (local733.aClass1_Sub1_Sub2_3 != null) {
														local733.aClass1_Sub1_Sub2_3.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local733.anInt504 - Static7.anInt206, local733.anInt507 - Static7.anInt201, local733.anInt510 - Static7.anInt198, local733.anInt509);
													}
													if (local733.aClass1_Sub1_Sub2_1 != null) {
														local733.aClass1_Sub1_Sub2_1.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local733.anInt504 - Static7.anInt206, local733.anInt507 - Static7.anInt201, local733.anInt510 - Static7.anInt198, local733.anInt509);
													}
													if (local733.aClass1_Sub1_Sub2_2 != null) {
														local733.aClass1_Sub1_Sub2_2.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local733.anInt504 - Static7.anInt206, local733.anInt507 - Static7.anInt201, local733.anInt510 - Static7.anInt198, local733.anInt509);
													}
												}
											}
											local588 = local8.anInt1403;
											if (local588 != 0) {
												if (local17 < Static7.anInt205 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean122) {
														Static7.aClass31_8.method1005(var35);
													}
												}
												if (local20 < Static7.anInt199 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean122) {
														Static7.aClass31_8.method1005(var35);
													}
												}
												if (local17 > Static7.anInt205 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean122) {
														Static7.aClass31_8.method1005(var35);
													}
												}
												if (local20 > Static7.anInt199 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean122) {
														Static7.aClass31_8.method1005(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1396 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1401; var23++) {
												if (local8.aClass19Array3[var23].anInt1078 != Static7.anInt208 && (local8.anIntArray193[var23] & local8.anInt1396) == local8.anInt1398) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass57_1;
												if (!this.method136(local26, local17, local20, local952.anInt2112)) {
													local952.aClass1_Sub1_Sub2_8.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local952.anInt2113 - Static7.anInt206, local952.anInt2115 - Static7.anInt201, local952.anInt2110 - Static7.anInt198, local952.anInt2103);
												}
												local8.anInt1396 = 0;
											}
										}
										if (!local8.aBoolean121) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt1401;
											local8.aBoolean121 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass19Array3[local251];
												if (var12.anInt1078 != Static7.anInt208) {
													for (local1011 = var12.anInt1089; local1011 <= var12.anInt1082; local1011++) {
														for (local588 = var12.anInt1084; local588 <= var12.anInt1087; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean120) {
																local8.aBoolean121 = true;
																continue label568;
															}
															if (var35.anInt1396 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1089) {
																	local598++;
																}
																if (local1011 < var12.anInt1082) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1084) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1087) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt1396) == local8.anInt1399) {
																	local8.aBoolean121 = true;
																	continue label568;
																}
															}
														}
													}
													Static7.aClass19Array2[var23++] = var12;
													local588 = Static7.anInt205 - var12.anInt1089;
													local593 = var12.anInt1082 - Static7.anInt205;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static7.anInt199 - var12.anInt1084;
													local601 = var12.anInt1087 - Static7.anInt199;
													if (local601 > local598) {
														var12.anInt1074 = local588 + local601;
													} else {
														var12.anInt1074 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class19 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static7.aClass19Array2[local588];
													if (local1135.anInt1078 != Static7.anInt208) {
														if (local1135.anInt1074 > local1126) {
															local1126 = local1135.anInt1074;
															local1011 = local588;
														} else if (local1135.anInt1074 == local1126) {
															local598 = local1135.anInt1075 - Static7.anInt206;
															local601 = local1135.anInt1077 - Static7.anInt198;
															local610 = Static7.aClass19Array2[local1011].anInt1075 - Static7.anInt206;
															var19 = Static7.aClass19Array2[local1011].anInt1077 - Static7.anInt198;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static7.aClass19Array2[local1011];
												local1135.anInt1078 = Static7.anInt208;
												if (!this.method118(local26, local1135.anInt1089, local1135.anInt1082, local1135.anInt1084, local1135.anInt1087, local1135.aClass1_Sub1_Sub2_6.anInt2467)) {
													local1135.aClass1_Sub1_Sub2_6.method1789(local1135.anInt1088, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local1135.anInt1075 - Static7.anInt206, local1135.anInt1071 - Static7.anInt201, local1135.anInt1077 - Static7.anInt198, local1135.anInt1086);
												}
												for (local598 = local1135.anInt1089; local598 <= local1135.anInt1082; local598++) {
													for (local601 = local1135.anInt1084; local601 <= local1135.anInt1087; local601++) {
														@Pc(1260) Class1_Sub7 local1260 = local31[local598][local601];
														if (local1260.anInt1396 != 0) {
															Static7.aClass31_8.method1005(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean122) {
															Static7.aClass31_8.method1005(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean121) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean121 = false;
											break;
										}
									}
								} while (!local8.aBoolean122);
							} while (local8.anInt1396 != 0);
							if (local17 > Static7.anInt205 || local17 <= Static7.anInt184) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean122);
						if (local17 < Static7.anInt205 || local17 >= Static7.anInt197 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean122);
					if (local20 > Static7.anInt199 || local20 <= Static7.anInt183) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean122);
				if (local20 < Static7.anInt199 || local20 >= Static7.anInt195 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean122);
			local8.aBoolean122 = false;
			Static7.anInt189--;
			@Pc(1402) Class8 local1402 = local8.aClass8_1;
			if (local1402 != null && local1402.anInt508 != 0) {
				if (local1402.aClass1_Sub1_Sub2_3 != null) {
					local1402.aClass1_Sub1_Sub2_3.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local1402.anInt504 - Static7.anInt206, local1402.anInt507 - Static7.anInt201 - local1402.anInt508, local1402.anInt510 - Static7.anInt198, local1402.anInt509);
				}
				if (local1402.aClass1_Sub1_Sub2_1 != null) {
					local1402.aClass1_Sub1_Sub2_1.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local1402.anInt504 - Static7.anInt206, local1402.anInt507 - Static7.anInt201 - local1402.anInt508, local1402.anInt510 - Static7.anInt198, local1402.anInt509);
				}
				if (local1402.aClass1_Sub1_Sub2_2 != null) {
					local1402.aClass1_Sub1_Sub2_2.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local1402.anInt504 - Static7.anInt206, local1402.anInt507 - Static7.anInt201 - local1402.anInt508, local1402.anInt510 - Static7.anInt198, local1402.anInt509);
				}
			}
			if (local8.anInt1406 != 0) {
				@Pc(1497) Class9 local1497 = local8.aClass9_1;
				if (local1497 != null && !this.method138(local26, local17, local20, local1497.aClass1_Sub1_Sub2_4.anInt2467)) {
					if ((local1497.anInt542 & local8.anInt1406) != 0) {
						local1497.aClass1_Sub1_Sub2_4.method1789(local1497.anInt539, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local1497.anInt552 - Static7.anInt206, local1497.anInt540 - Static7.anInt201, local1497.anInt537 - Static7.anInt198, local1497.anInt541);
					} else if ((local1497.anInt542 & 0x300) != 0) {
						local251 = local1497.anInt552 - Static7.anInt206;
						local1126 = local1497.anInt540 - Static7.anInt201;
						local1011 = local1497.anInt537 - Static7.anInt198;
						local588 = local1497.anInt539;
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
						if ((local1497.anInt542 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static7.anIntArray51[local588];
							local610 = local1011 + Static7.anIntArray48[local588];
							local1497.aClass1_Sub1_Sub2_4.method1789(local588 * 512 + 256, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local601, local1126, local610, local1497.anInt541);
						}
						if ((local1497.anInt542 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static7.anIntArray50[local588];
							local610 = local1011 + Static7.anIntArray47[local588];
							local1497.aClass1_Sub1_Sub2_4.method1789(local588 * 512 + 1280 & 0x7FF, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local601, local1126, local610, local1497.anInt541);
						}
					}
				}
				local952 = local8.aClass57_1;
				if (local952 != null) {
					if ((local952.anInt2104 & local8.anInt1406) != 0 && !this.method136(local26, local17, local20, local952.anInt2104)) {
						local952.aClass1_Sub1_Sub2_7.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local952.anInt2113 - Static7.anInt206, local952.anInt2115 - Static7.anInt201, local952.anInt2110 - Static7.anInt198, local952.anInt2103);
					}
					if ((local952.anInt2112 & local8.anInt1406) != 0 && !this.method136(local26, local17, local20, local952.anInt2112)) {
						local952.aClass1_Sub1_Sub2_8.method1789(0, Static7.anInt207, Static7.anInt196, Static7.anInt193, Static7.anInt200, local952.anInt2113 - Static7.anInt206, local952.anInt2115 - Static7.anInt201, local952.anInt2110 - Static7.anInt198, local952.anInt2103);
					}
				}
			}
			@Pc(1755) Class1_Sub7 local1755;
			if (local23 < this.anInt185 - 1) {
				local1755 = this.aClass1_Sub7ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean122) {
					Static7.aClass31_8.method1005(local1755);
				}
			}
			if (local17 < Static7.anInt205) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean122) {
					Static7.aClass31_8.method1005(local1755);
				}
			}
			if (local20 < Static7.anInt199) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean122) {
					Static7.aClass31_8.method1005(local1755);
				}
			}
			if (local17 > Static7.anInt205) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean122) {
					Static7.aClass31_8.method1005(local1755);
				}
			}
			if (local20 > Static7.anInt199) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean122) {
					Static7.aClass31_8.method1005(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([IIIIII)V")
	public void method107(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class15 local14 = local8.aClass15_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt974;
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
		@Pc(59) Class72 local59 = local8.aClass72_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2852;
		@Pc(68) int local68 = local59.anInt2850;
		@Pc(71) int local71 = local59.anInt2849;
		@Pc(74) int local74 = local59.anInt2851;
		@Pc(79) int[] local79 = this.anIntArrayArray3[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray2[local68];
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

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIILclient!cc;IIZ)Z")
	public boolean method108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method101(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!eb;IIIIIII)V")
	private void method110(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static7.anInt206;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static7.anInt198;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray1[arg1][arg6][arg7] - Static7.anInt201;
		@Pc(51) int local51 = this.anIntArrayArrayArray1[arg1][arg6 + 1][arg7] - Static7.anInt201;
		@Pc(66) int local66 = this.anIntArrayArrayArray1[arg1][arg6 + 1][arg7 + 1] - Static7.anInt201;
		@Pc(79) int local79 = this.anIntArrayArrayArray1[arg1][arg6][arg7 + 1] - Static7.anInt201;
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
		@Pc(279) int local279 = Static27.anInt952 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static27.anInt957 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static27.anInt952 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static27.anInt957 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static27.anInt952 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static27.anInt957 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static27.anInt952 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static27.anInt957 + (local89 << 9) / local265;
		Static27.anInt958 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static27.aBoolean82 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static27.anInt953 || local327 > Static27.anInt953 || local295 > Static27.anInt953) {
				Static27.aBoolean82 = true;
			}
			if (Static7.aBoolean28 && this.method117(Static7.anInt203, Static7.anInt190, local319, local335, local303, local311, local327, local295)) {
				Static7.anInt202 = arg6;
				Static7.anInt209 = arg7;
			}
			if (arg0.anInt978 == -1) {
				if (arg0.anInt976 != 12345678) {
					Static27.method563(local319, local335, local303, local311, local327, local295, arg0.anInt976, arg0.anInt967, arg0.anInt968);
				}
			} else if (Static7.aBoolean29) {
				local472 = Static27.anInterface1_1.method1288(arg0.anInt978);
				Static27.method563(local319, local335, local303, local311, local327, local295, Static7.method130(local472, arg0.anInt976), Static7.method130(local472, arg0.anInt967), Static7.method130(local472, arg0.anInt968));
			} else if (arg0.aBoolean87) {
				Static27.method568(local319, local335, local303, local311, local327, local295, arg0.anInt976, arg0.anInt967, arg0.anInt968, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt978);
			} else {
				Static27.method568(local319, local335, local303, local311, local327, local295, arg0.anInt976, arg0.anInt967, arg0.anInt968, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt978);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static27.aBoolean82 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static27.anInt953 || local295 > Static27.anInt953 || local327 > Static27.anInt953) {
			Static27.aBoolean82 = true;
		}
		if (Static7.aBoolean28 && this.method117(Static7.anInt203, Static7.anInt190, local287, local303, local335, local279, local295, local327)) {
			Static7.anInt202 = arg6;
			Static7.anInt209 = arg7;
		}
		if (arg0.anInt978 != -1) {
			if (!Static7.aBoolean29) {
				Static27.method568(local287, local303, local335, local279, local295, local327, arg0.anInt975, arg0.anInt968, arg0.anInt967, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt978);
				return;
			}
			local472 = Static27.anInterface1_1.method1288(arg0.anInt978);
			Static27.method563(local287, local303, local335, local279, local295, local327, Static7.method130(local472, arg0.anInt975), Static7.method130(local472, arg0.anInt968), Static7.method130(local472, arg0.anInt967));
		} else if (arg0.anInt975 != 12345678) {
			Static27.method563(local287, local303, local335, local279, local295, local327, arg0.anInt975, arg0.anInt968, arg0.anInt967);
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(III)V")
	public void method111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static7.aBoolean28 = true;
		Static7.anInt191 = arg0;
		Static7.anInt203 = arg1;
		Static7.anInt190 = arg2;
		Static7.anInt202 = -1;
		Static7.anInt209 = -1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIILclient!cc;ILclient!cc;Lclient!cc;)V")
	public void method112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub2 arg6, @OriginalArg(7) Class1_Sub1_Sub2 arg7) {
		@Pc(3) Class8 local3 = new Class8();
		local3.aClass1_Sub1_Sub2_2 = arg4;
		local3.anInt504 = arg1 * 128 + 64;
		local3.anInt510 = arg2 * 128 + 64;
		local3.anInt507 = arg3;
		local3.anInt509 = arg5;
		local3.aClass1_Sub1_Sub2_3 = arg6;
		local3.aClass1_Sub1_Sub2_1 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub7 local43 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1401; local47++) {
				if ((local43.aClass19Array3[local47].anInt1072 & 0x100) == 256 && local43.aClass19Array3[local47].aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub7) {
					@Pc(71) Class1_Sub1_Sub2_Sub7 local71 = (Class1_Sub1_Sub2_Sub7) local43.aClass19Array3[local47].aClass1_Sub1_Sub2_6;
					local71.method1371();
					if (local71.anInt2467 > local34) {
						local34 = local71.anInt2467;
					}
				}
			}
		}
		local3.anInt508 = local34;
		if (this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub7(arg0, arg1, arg2);
		}
		this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass8_1 = local3;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
	public void method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub7 local31 = this.aClass1_Sub7ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub7ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1404--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1401; local41++) {
					@Pc(47) Class19 local47 = local31.aClass19Array3[local41];
					if ((local47.anInt1086 >> 29 & 0x3) == 2 && local47.anInt1089 == arg0 && local47.anInt1084 == arg1) {
						local47.anInt1080--;
					}
				}
			}
		}
		if (this.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub7(0, arg0, arg1);
		}
		this.aClass1_Sub7ArrayArrayArray1[0][arg0][arg1].aClass1_Sub7_1 = local8;
		this.aClass1_Sub7ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!b", name = "h", descriptor = "(III)V")
	public void method114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass8_1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!je;IIIII)V")
	private void method115(@OriginalArg(0) Class1_Sub1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt185) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt188) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt192 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub7 local66 = this.aClass1_Sub7ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray1[local17][local24][local34] + this.anIntArrayArrayArray1[local17][local24 + 1][local34] + this.anIntArrayArrayArray1[local17][local24][local34 + 1] + this.anIntArrayArrayArray1[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray1[arg1][arg2][arg3] + this.anIntArrayArrayArray1[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray1[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray1[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class57 local163 = local66.aClass57_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub2_Sub5 local173;
										if (local163.aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub5) {
											local173 = (Class1_Sub1_Sub2_Sub5) local163.aClass1_Sub1_Sub2_8;
											Static60.method1098(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub5) {
											local173 = (Class1_Sub1_Sub2_Sub5) local163.aClass1_Sub1_Sub2_7;
											Static60.method1098(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1401; local237++) {
										@Pc(243) Class19 local243 = local66.aClass19Array3[local237];
										if (local243 != null && local243.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub5) {
											@Pc(253) Class1_Sub1_Sub2_Sub5 local253 = (Class1_Sub1_Sub2_Sub5) local243.aClass1_Sub1_Sub2_6;
											@Pc(261) int local261 = local243.anInt1082 + 1 - local243.anInt1089;
											@Pc(269) int local269 = local243.anInt1087 + 1 - local243.anInt1084;
											Static60.method1098(arg0, local253, (local243.anInt1089 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1084 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!td;IIIIII)V")
	private void method116(@OriginalArg(0) Class72 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray446.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray446[local5] - Static7.anInt206;
			local20 = arg0.anIntArray440[local5] - Static7.anInt201;
			local27 = arg0.anIntArray450[local5] - Static7.anInt198;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray441 != null) {
				Static115.anIntArray444[local5] = local37;
				Static115.anIntArray449[local5] = local59;
				Static115.anIntArray442[local5] = local69;
			}
			Static115.anIntArray447[local5] = Static27.anInt952 + (local37 << 9) / local69;
			Static115.anIntArray438[local5] = Static27.anInt957 + (local59 << 9) / local69;
		}
		Static27.anInt958 = 0;
		local3 = arg0.anIntArray451.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray451[local13];
			local27 = arg0.anIntArray448[local13];
			local37 = arg0.anIntArray443[local13];
			@Pc(142) int local142 = Static115.anIntArray447[local20];
			@Pc(146) int local146 = Static115.anIntArray447[local27];
			@Pc(150) int local150 = Static115.anIntArray447[local37];
			@Pc(154) int local154 = Static115.anIntArray438[local20];
			@Pc(158) int local158 = Static115.anIntArray438[local27];
			@Pc(162) int local162 = Static115.anIntArray438[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static27.aBoolean82 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static27.anInt953 || local146 > Static27.anInt953 || local150 > Static27.anInt953) {
					Static27.aBoolean82 = true;
				}
				if (Static7.aBoolean28 && this.method117(Static7.anInt203, Static7.anInt190, local154, local158, local162, local142, local146, local150)) {
					Static7.anInt202 = arg5;
					Static7.anInt209 = arg6;
				}
				if (arg0.anIntArray441 == null || arg0.anIntArray441[local13] == -1) {
					if (arg0.anIntArray445[local13] != 12345678) {
						Static27.method563(local154, local158, local162, local142, local146, local150, arg0.anIntArray445[local13], arg0.anIntArray452[local13], arg0.anIntArray439[local13]);
					}
				} else if (Static7.aBoolean29) {
					@Pc(364) int local364 = Static27.anInterface1_1.method1288(arg0.anIntArray441[local13]);
					Static27.method563(local154, local158, local162, local142, local146, local150, Static7.method130(local364, arg0.anIntArray445[local13]), Static7.method130(local364, arg0.anIntArray452[local13]), Static7.method130(local364, arg0.anIntArray439[local13]));
				} else if (arg0.aBoolean227) {
					Static27.method568(local154, local158, local162, local142, local146, local150, arg0.anIntArray445[local13], arg0.anIntArray452[local13], arg0.anIntArray439[local13], Static115.anIntArray444[0], Static115.anIntArray444[1], Static115.anIntArray444[3], Static115.anIntArray449[0], Static115.anIntArray449[1], Static115.anIntArray449[3], Static115.anIntArray442[0], Static115.anIntArray442[1], Static115.anIntArray442[3], arg0.anIntArray441[local13]);
				} else {
					Static27.method568(local154, local158, local162, local142, local146, local150, arg0.anIntArray445[local13], arg0.anIntArray452[local13], arg0.anIntArray439[local13], Static115.anIntArray444[local20], Static115.anIntArray444[local27], Static115.anIntArray444[local37], Static115.anIntArray449[local20], Static115.anIntArray449[local27], Static115.anIntArray449[local37], Static115.anIntArray442[local20], Static115.anIntArray442[local27], Static115.anIntArray442[local37], arg0.anIntArray441[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIII)Z")
	private boolean method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray2[arg0][local17][local21] == -Static7.anInt208) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray1[arg0][arg1][arg3] - arg5;
			if (!this.method94(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method94(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method94(local21, local167, local195)) {
				return false;
			} else if (this.method94(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method99(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method94(local17 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg3] - arg5, local21 + 1) && this.method94(local17 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method94(local17 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method94(local17 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	public void method119() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt187; local1++) {
			@Pc(7) Class19 local7 = this.aClass19Array1[local1];
			this.method105(local7);
			this.aClass19Array1[local1] = null;
		}
		this.anInt187 = 0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IIIIII)V")
	public void method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt188 * 128) {
			arg0 = this.anInt188 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt192 * 128) {
			arg2 = this.anInt192 * 128 - 1;
		}
		Static7.anInt208++;
		Static7.anInt207 = Class1_Sub1_Sub4_Sub2.anIntArray138[arg3];
		Static7.anInt196 = Class1_Sub1_Sub4_Sub2.anIntArray142[arg3];
		Static7.anInt193 = Class1_Sub1_Sub4_Sub2.anIntArray138[arg4];
		Static7.anInt200 = Class1_Sub1_Sub4_Sub2.anIntArray142[arg4];
		Static7.aBooleanArrayArray1 = Static7.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static7.anInt206 = arg0;
		Static7.anInt201 = arg1;
		Static7.anInt198 = arg2;
		Static7.anInt205 = arg0 / 128;
		Static7.anInt199 = arg2 / 128;
		Static7.anInt186 = arg5;
		Static7.anInt184 = Static7.anInt205 - 25;
		if (Static7.anInt184 < 0) {
			Static7.anInt184 = 0;
		}
		Static7.anInt183 = Static7.anInt199 - 25;
		if (Static7.anInt183 < 0) {
			Static7.anInt183 = 0;
		}
		Static7.anInt197 = Static7.anInt205 + 25;
		if (Static7.anInt197 > this.anInt188) {
			Static7.anInt197 = this.anInt188;
		}
		Static7.anInt195 = Static7.anInt199 + 25;
		if (Static7.anInt195 > this.anInt192) {
			Static7.anInt195 = this.anInt192;
		}
		this.method124();
		Static7.anInt189 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt194; local128 < this.anInt185; local128++) {
			@Pc(134) Class1_Sub7[][] local134 = this.aClass1_Sub7ArrayArrayArray1[local128];
			for (local136 = Static7.anInt184; local136 < Static7.anInt197; local136++) {
				for (local139 = Static7.anInt183; local139 < Static7.anInt195; local139++) {
					@Pc(146) Class1_Sub7 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1402 <= arg5 && (Static7.aBooleanArrayArray1[local136 + 25 - Static7.anInt205][local139 + 25 - Static7.anInt199] || this.anIntArrayArrayArray1[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean120 = true;
							local146.aBoolean122 = true;
							if (local146.anInt1401 > 0) {
								local146.aBoolean121 = true;
							} else {
								local146.aBoolean121 = false;
							}
							Static7.anInt189++;
						} else {
							local146.aBoolean120 = false;
							local146.aBoolean122 = false;
							local146.anInt1396 = 0;
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
		for (@Pc(224) int local224 = this.anInt194; local224 < this.anInt185; local224++) {
			@Pc(230) Class1_Sub7[][] local230 = this.aClass1_Sub7ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static7.anInt205 + local139;
				local241 = Static7.anInt205 - local139;
				if (local237 >= Static7.anInt184 || local241 < Static7.anInt197) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static7.anInt199 + local249;
						local258 = Static7.anInt199 - local249;
						@Pc(270) Class1_Sub7 local270;
						if (local237 >= Static7.anInt184) {
							if (local254 >= Static7.anInt183) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean120) {
									this.method106(local270, true);
								}
							}
							if (local258 < Static7.anInt195) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean120) {
									this.method106(local270, true);
								}
							}
						}
						if (local241 < Static7.anInt197) {
							if (local254 >= Static7.anInt183) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean120) {
									this.method106(local270, true);
								}
							}
							if (local258 < Static7.anInt195) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean120) {
									this.method106(local270, true);
								}
							}
						}
						if (Static7.anInt189 == 0) {
							Static7.aBoolean28 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt194; local136 < this.anInt185; local136++) {
			@Pc(361) Class1_Sub7[][] local361 = this.aClass1_Sub7ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static7.anInt205 + local237;
				local249 = Static7.anInt205 - local237;
				if (local241 >= Static7.anInt184 || local249 < Static7.anInt197) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static7.anInt199 + local254;
						@Pc(389) int local389 = Static7.anInt199 - local254;
						@Pc(401) Class1_Sub7 local401;
						if (local241 >= Static7.anInt184) {
							if (local258 >= Static7.anInt183) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean120) {
									this.method106(local401, false);
								}
							}
							if (local389 < Static7.anInt195) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean120) {
									this.method106(local401, false);
								}
							}
						}
						if (local249 < Static7.anInt197) {
							if (local258 >= Static7.anInt183) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean120) {
									this.method106(local401, false);
								}
							}
							if (local389 < Static7.anInt195) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean120) {
									this.method106(local401, false);
								}
							}
						}
						if (Static7.anInt189 == 0) {
							Static7.aBoolean28 = false;
							return;
						}
					}
				}
			}
		}
		Static7.aBoolean28 = false;
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(III)Lclient!of;")
	public Class57 method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass57_1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(IIII)I")
	public int method122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass57_1 != null && local8.aClass57_1.anInt2103 == arg3) {
			return local8.aClass57_1.anInt2106 & 0xFF;
		} else if (local8.aClass9_1 != null && local8.aClass9_1.anInt541 == arg3) {
			return local8.aClass9_1.anInt545 & 0xFF;
		} else if (local8.aClass13_1 != null && local8.aClass13_1.anInt839 == arg3) {
			return local8.aClass13_1.anInt843 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1401; local56++) {
				if (local8.aClass19Array3[local56].anInt1086 == arg3) {
					return local8.aClass19Array3[local56].anInt1072 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!b", name = "j", descriptor = "(III)I")
	public int method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1401; local14++) {
			@Pc(20) Class19 local20 = local8.aClass19Array3[local14];
			if ((local20.anInt1086 >> 29 & 0x3) == 2 && local20.anInt1089 == arg1 && local20.anInt1084 == arg2) {
				return local20.anInt1086;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()V")
	private void method124() {
		@Pc(3) int local3 = Static7.anIntArray49[Static7.anInt186];
		@Pc(7) Class63[] local7 = Static7.aClass63ArrayArray1[Static7.anInt186];
		Static7.anInt204 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class63 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2276 == 1) {
				local27 = local16.anInt2259 + 25 - Static7.anInt205;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2265 + 25 - Static7.anInt199;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2261 + 25 - Static7.anInt199;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static7.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static7.anInt206 - local16.anInt2274;
						if (local79 > 32) {
							local16.anInt2275 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2275 = 2;
							local79 = -local79;
						}
						local16.anInt2268 = (local16.anInt2269 - Static7.anInt198 << 8) / local79;
						local16.anInt2270 = (local16.anInt2272 - Static7.anInt198 << 8) / local79;
						local16.anInt2277 = (local16.anInt2258 - Static7.anInt201 << 8) / local79;
						local16.anInt2266 = (local16.anInt2278 - Static7.anInt201 << 8) / local79;
						Static7.aClass63Array1[Static7.anInt204++] = local16;
					}
				}
			} else if (local16.anInt2276 == 2) {
				local27 = local16.anInt2265 + 25 - Static7.anInt199;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2259 + 25 - Static7.anInt205;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2257 + 25 - Static7.anInt205;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static7.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static7.anInt198 - local16.anInt2269;
						if (local79 > 32) {
							local16.anInt2275 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2275 = 4;
							local79 = -local79;
						}
						local16.anInt2267 = (local16.anInt2274 - Static7.anInt206 << 8) / local79;
						local16.anInt2264 = (local16.anInt2271 - Static7.anInt206 << 8) / local79;
						local16.anInt2277 = (local16.anInt2258 - Static7.anInt201 << 8) / local79;
						local16.anInt2266 = (local16.anInt2278 - Static7.anInt201 << 8) / local79;
						Static7.aClass63Array1[Static7.anInt204++] = local16;
					}
				}
			} else if (local16.anInt2276 == 4) {
				local27 = local16.anInt2258 - Static7.anInt201;
				if (local27 > 128) {
					local40 = local16.anInt2265 + 25 - Static7.anInt199;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2261 + 25 - Static7.anInt199;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2259 + 25 - Static7.anInt205;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2257 + 25 - Static7.anInt205;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static7.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2275 = 5;
							local16.anInt2267 = (local16.anInt2274 - Static7.anInt206 << 8) / local27;
							local16.anInt2264 = (local16.anInt2271 - Static7.anInt206 << 8) / local27;
							local16.anInt2268 = (local16.anInt2269 - Static7.anInt198 << 8) / local27;
							local16.anInt2270 = (local16.anInt2272 - Static7.anInt198 << 8) / local27;
							Static7.aClass63Array1[Static7.anInt204++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "k", descriptor = "(III)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1401; local13++) {
			@Pc(19) Class19 local19 = local8.aClass19Array3[local13];
			if ((local19.anInt1086 >> 29 & 0x3) == 2 && local19.anInt1089 == arg1 && local19.anInt1084 == arg2) {
				this.method105(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "l", descriptor = "(III)Lclient!ca;")
	public Class9 method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass9_1;
	}

	@OriginalMember(owner = "client!b", name = "m", descriptor = "(III)V")
	public void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass13_1 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIILclient!cc;III)Z")
	public boolean method128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method101(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(IIII)V")
	public void method129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].anInt1402 = arg3;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIILclient!cc;IIIIII)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class9 local6 = new Class9();
		local6.anInt541 = arg9;
		local6.anInt545 = arg10;
		local6.anInt552 = arg1 * 128 + arg7 + 64;
		local6.anInt537 = arg2 * 128 + arg8 + 64;
		local6.anInt540 = arg3;
		local6.aClass1_Sub1_Sub2_4 = arg4;
		local6.anInt542 = arg5;
		local6.anInt539 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub7ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub7ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub7(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass9_1 = local6;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class15 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class15(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass15_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class15(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass15_1 = local12;
		} else {
			@Pc(140) Class72 local140 = new Class72(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass72_1 = local140;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIILclient!cc;Lclient!cc;IIII)V")
	public void method133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) Class1_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class57 local8 = new Class57();
		local8.anInt2103 = arg8;
		local8.anInt2106 = arg9;
		local8.anInt2113 = arg1 * 128 + 64;
		local8.anInt2110 = arg2 * 128 + 64;
		local8.anInt2115 = arg3;
		local8.aClass1_Sub1_Sub2_8 = arg4;
		local8.aClass1_Sub1_Sub2_7 = arg5;
		local8.anInt2112 = arg6;
		local8.anInt2104 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub7ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub7ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub7(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass57_1 = local8;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIILclient!cc;II)V")
	public void method134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class13 local6 = new Class13();
		local6.aClass1_Sub1_Sub2_5 = arg4;
		local6.anInt842 = arg1 * 128 + 64;
		local6.anInt841 = arg2 * 128 + 64;
		local6.anInt836 = arg3;
		local6.anInt839 = arg5;
		local6.anInt843 = arg6;
		if (this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub7(arg0, arg1, arg2);
		}
		this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local6;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(IIII)Z")
	private boolean method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method99(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray1[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static7.anInt206) {
					if (!this.method94(local11, local26, local15)) {
						return false;
					}
					if (!this.method94(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method94(local11, local30, local15)) {
						return false;
					}
					if (!this.method94(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method94(local11, local34, local15)) {
					return false;
				}
				if (!this.method94(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static7.anInt198) {
					if (!this.method94(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method94(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method94(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method94(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method94(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method94(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static7.anInt206) {
					if (!this.method94(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method94(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method94(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method94(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method94(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method94(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static7.anInt198) {
					if (!this.method94(local11, local26, local15)) {
						return false;
					}
					if (!this.method94(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method94(local11, local30, local15)) {
						return false;
					}
					if (!this.method94(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method94(local11, local34, local15)) {
					return false;
				}
				if (!this.method94(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method94(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method94(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method94(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method94(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method94(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIILclient!cc;IIIIII)Z")
	public boolean method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method101(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(IIII)Z")
	private boolean method138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method99(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method94(local11 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2] - arg3, local15 + 1) && this.method94(local11 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method94(local11 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method94(local11 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()V")
	public void method139() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt185; local1++) {
			for (local4 = 0; local4 < this.anInt188; local4++) {
				for (local7 = 0; local7 < this.anInt192; local7++) {
					this.aClass1_Sub7ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static7.anInt182; local4++) {
			for (local7 = 0; local7 < Static7.anIntArray49[local4]; local7++) {
				Static7.aClass63ArrayArray1[local4][local7] = null;
			}
			Static7.anIntArray49[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt187; local7++) {
			this.aClass19Array1[local7] = null;
		}
		this.anInt187 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static7.aClass19Array2.length; local76++) {
			Static7.aClass19Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "o", descriptor = "(III)V")
	public void method140() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt185; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt188; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt192; local7++) {
					@Pc(17) Class1_Sub7 local17 = this.aClass1_Sub7ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class57 local22 = local17.aClass57_1;
						if (local22 != null && local22.aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub5) {
							@Pc(32) Class1_Sub1_Sub2_Sub5 local32 = (Class1_Sub1_Sub2_Sub5) local22.aClass1_Sub1_Sub2_8;
							this.method115(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub5) {
								@Pc(48) Class1_Sub1_Sub2_Sub5 local48 = (Class1_Sub1_Sub2_Sub5) local22.aClass1_Sub1_Sub2_7;
								this.method115(local48, local1, local4, local7, 1, 1);
								Static60.method1098(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub1_Sub2_7 = local48.method1101(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass1_Sub1_Sub2_8 = local32.method1101(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class1_Sub1_Sub2_Sub5 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1401; local87++) {
							@Pc(93) Class19 local93 = local17.aClass19Array3[local87];
							if (local93 != null && local93.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub5) {
								local103 = (Class1_Sub1_Sub2_Sub5) local93.aClass1_Sub1_Sub2_6;
								this.method115(local103, local1, local4, local7, local93.anInt1082 + 1 - local93.anInt1089, local93.anInt1087 - local93.anInt1084 + 1);
								local93.aClass1_Sub1_Sub2_6 = local103.method1101(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class13 local142 = local17.aClass13_1;
						if (local142 != null && local142.aClass1_Sub1_Sub2_5 instanceof Class1_Sub1_Sub2_Sub5) {
							local103 = (Class1_Sub1_Sub2_Sub5) local142.aClass1_Sub1_Sub2_5;
							this.method98(local103, local1, local4, local7);
							local142.aClass1_Sub1_Sub2_5 = local103.method1101(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "p", descriptor = "(III)I")
	public int method141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass57_1 == null ? 0 : local8.aClass57_1.anInt2103;
	}

	@OriginalMember(owner = "client!b", name = "q", descriptor = "(III)I")
	public int method142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass9_1 == null ? 0 : local8.aClass9_1.anInt541;
	}

	@OriginalMember(owner = "client!b", name = "r", descriptor = "(III)Lclient!fc;")
	public Class19 method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub7 local8 = this.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1401; local14++) {
			@Pc(20) Class19 local20 = local8.aClass19Array3[local14];
			if ((local20.anInt1086 >> 29 & 0x3) == 2 && local20.anInt1089 == arg1 && local20.anInt1084 == arg2) {
				return local20;
			}
		}
		return null;
	}
}
