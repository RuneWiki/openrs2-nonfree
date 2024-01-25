import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!v", name = "m", descriptor = "[[Lclient!ni;")
	private Class141[][] aClass141ArrayArray1;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "[[Lclient!ep;")
	private Class54[][] aClass54ArrayArray1;

	@OriginalMember(owner = "client!v", name = "p", descriptor = "I")
	private int anInt6188;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "[[Lclient!da;")
	private Class34[][] aClass34ArrayArray1;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "[[Lclient!on;")
	private Class149[][] aClass149ArrayArray1;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "I")
	private int anInt6189;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "I")
	private int anInt6190;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "I")
	private int anInt6191;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	private int anInt6192;

	@OriginalMember(owner = "client!v", name = "y", descriptor = "I")
	private int anInt6194;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "I")
	private int anInt6195;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "I")
	private int anInt6196;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "I")
	private int anInt6197;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	private int anInt6198;

	@OriginalMember(owner = "client!v", name = "F", descriptor = "I")
	private int anInt6199;

	@OriginalMember(owner = "client!v", name = "J", descriptor = "I")
	private int anInt6202;

	@OriginalMember(owner = "client!v", name = "B", descriptor = "Lclient!kp;")
	private final Class2_Sub2 aClass2_Sub2_10;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	private final int anInt6193;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "[[I")
	public final int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "[[I")
	private final int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "I")
	private final int anInt6200;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	private int anInt6201;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!kp;IIII[[I[[II)V")
	public Class41_Sub2(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4);
		this.aClass2_Sub2_10 = arg0;
		this.anInt6193 = arg2;
		this.anIntArrayArray61 = arg5;
		this.anIntArrayArray62 = arg6;
		this.anInt6200 = arg7;
		this.anInt6201 = 0;
		while (arg7 > 1) {
			this.anInt6201++;
			arg7 >>= 0x1;
		}
		this.aByteArrayArray19 = new byte[arg3 + 1][arg4 + 1];
		@Pc(50) int local50 = this.aClass2_Sub2_10.anInt3530 >> 9;
		for (@Pc(52) int local52 = 1; local52 < arg4; local52++) {
			for (@Pc(55) int local55 = 1; local55 < arg3; local55++) {
				@Pc(76) int local76 = this.anIntArrayArray61[local55 + 1][local52] - this.anIntArrayArray61[local55 - 1][local52];
				@Pc(94) int local94 = this.anIntArrayArray61[local55][local52 + 1] - this.anIntArrayArray61[local55][local52 - 1];
				@Pc(107) int local107 = (int) Math.sqrt((double) (local76 * local76 + local94 * local94 + 65536));
				@Pc(113) int local113 = (local76 << 8) / local107;
				@Pc(117) int local117 = -65536 / local107;
				@Pc(123) int local123 = (local94 << 8) / local107;
				@Pc(145) int local145 = local50 + (this.aClass2_Sub2_10.anInt3531 * local113 + this.aClass2_Sub2_10.anInt3537 * local117 + this.aClass2_Sub2_10.anInt3513 * local123 >> 17);
				local145 >>= 0x1;
				if (local145 < 2) {
					local145 = 2;
				} else if (local145 > 126) {
					local145 = 126;
				}
				this.aByteArrayArray19[local55][local52] = (byte) local145;
			}
		}
		this.aByteArrayArray20 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	@Override
	public void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class109 local4 = this.aClass2_Sub2_10.method3348(Thread.currentThread());
		local4.aClass106_1.anInt3124 = 0;
		if (this.aClass141ArrayArray1 != null) {
			this.method5436(arg0, arg1, this.aClass2_Sub2_10.aBoolean298, local4.aClass106_1, local4.anIntArray383, local4.anIntArray397, local4.anIntArray392);
		} else if (this.aClass34ArrayArray1 != null) {
			this.method5437(arg0, arg1, local4.aClass106_1, local4.anIntArray383, local4.anIntArray397, local4.anIntArray392);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class21_Sub2 local3 = this.aClass2_Sub2_10.aClass21_Sub2_2;
		this.anInt6190 = local3.anInt2919;
		this.anInt6191 = local3.anInt2920;
		this.anInt6196 = local3.anInt2918;
		this.anInt6189 = local3.anInt2912;
		this.anInt6197 = local3.anInt2922;
		this.anInt6188 = local3.anInt2914;
		this.anInt6194 = local3.anInt2911;
		this.anInt6192 = local3.anInt2921;
		this.anInt6202 = local3.anInt2913;
		this.anInt6198 = local3.anInt2916;
		this.anInt6199 = local3.anInt2917;
		this.anInt6195 = local3.anInt2915;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII[[ZLclient!k;[I[I)V")
	private void method5435(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class106 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean271 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass34ArrayArray1[local22][local25] != null) {
						@Pc(50) Class34 local50 = this.aClass34ArrayArray1[local22][local25];
						if (local50.aShort8 != -1 && (local50.aByte11 & 0x2) == 0 && local50.anInt1238 == -1) {
							local69 = this.aClass2_Sub2_10.method3345(local50.aShort8);
							arg5.method2968(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static194.method3677(local69, local50.aShort12 & 0xFFFF), Static194.method3677(local69, local50.aShort11 & 0xFFFF), Static194.method3677(local69, local50.aShort9 & 0xFFFF));
							arg5.method2968(local20, local20, local20 - 4, local16, local16 + 4, local16, Static194.method3677(local69, local50.aShort10 & 0xFFFF), Static194.method3677(local69, local50.aShort9 & 0xFFFF), Static194.method3677(local69, local50.aShort11 & 0xFFFF));
						} else if (local50.anInt1238 == -1) {
							arg5.method2968(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort12 & 0xFFFF, local50.aShort11 & 0xFFFF, local50.aShort9 & 0xFFFF);
							arg5.method2968(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort10 & 0xFFFF, local50.aShort9 & 0xFFFF, local50.aShort11 & 0xFFFF);
						} else {
							local69 = local50.anInt1238;
							arg5.method2968(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2968(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass149ArrayArray1[local22][local25] != null) {
						@Pc(249) Class149 local249 = this.aClass149ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort59; local69++) {
							arg6[local69] = local16 + (local249.anIntArray575[local69] - local22 * this.anInt6200) * 4 / this.anInt6200;
							arg7[local69] = local20 - (local249.anIntArray574[local69] - local25 * this.anInt6200) * 4 / this.anInt6200;
						}
						for (@Pc(297) int local297 = 0; local297 < local249.aShort58; local297++) {
							@Pc(303) short local303 = local249.aShortArray70[local297];
							@Pc(308) short local308 = local249.aShortArray69[local297];
							@Pc(313) short local313 = local249.aShortArray74[local297];
							@Pc(317) int local317 = arg6[local303];
							@Pc(321) int local321 = arg6[local308];
							@Pc(325) int local325 = arg6[local313];
							@Pc(329) int local329 = arg7[local303];
							@Pc(333) int local333 = arg7[local308];
							@Pc(337) int local337 = arg7[local313];
							@Pc(351) int local351;
							if (local249.anIntArray572 != null && local249.anIntArray572[local297] != -1) {
								local351 = local249.anIntArray572[local297];
								arg5.method2968(local329, local333, local337, local317, local321, local325, Static194.method3677(local351, local249.aShortArray72[local303]), Static194.method3677(local351, local249.aShortArray72[local308]), Static194.method3677(local351, local249.aShortArray72[local313]));
							} else if (local249.aShortArray73 == null || local249.aShortArray73[local297] == -1) {
								local351 = local249.anIntArray571[local297];
								arg5.method2968(local329, local333, local337, local317, local321, local325, Static194.method3677(local351, local249.aShortArray72[local303]), Static194.method3677(local351, local249.aShortArray72[local308]), Static194.method3677(local351, local249.aShortArray72[local313]));
							} else {
								local351 = this.aClass2_Sub2_10.method3345(local249.aShortArray73[local297]);
								arg5.method2968(local329, local333, local337, local317, local321, local325, Static194.method3677(local351, local249.aShortArray72[local303]), Static194.method3677(local351, local249.aShortArray72[local308]), Static194.method3677(local351, local249.aShortArray72[local313]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean271 = true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZLclient!k;[I[I[I)V")
	private void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class141 local6 = this.aClass141ArrayArray1[arg0][arg1];
		@Pc(29) int local29;
		@Pc(255) int local255;
		@Pc(311) int local311;
		@Pc(367) int local367;
		@Pc(423) int local423;
		@Pc(283) int local283;
		@Pc(339) int local339;
		@Pc(395) int local395;
		@Pc(451) int local451;
		@Pc(244) int local244;
		@Pc(300) int local300;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(272) int local272;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(440) int local440;
		@Pc(78) int local78;
		@Pc(101) int local101;
		@Pc(124) int local124;
		@Pc(147) int local147;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(163) int local163;
		@Pc(56) int local56;
		@Pc(61) int local61;
		@Pc(222) int local222;
		@Pc(227) int local227;
		@Pc(620) int local620;
		if (local6 == null) {
			@Pc(1450) Class54 local1450 = this.aClass54ArrayArray1[arg0][arg1];
			if (local1450 != null) {
				for (local423 = 0; local423 < local1450.aShort13; local423++) {
					@Pc(1460) short local1460 = local1450.aShortArray24[local423];
					local29 = local1450.aShortArray25[local423];
					@Pc(1470) short local1470 = local1450.aShortArray22[local423];
					local367 = this.anInt6195 + (this.anInt6202 * local1460 + this.anInt6198 * local29 + this.anInt6199 * local1470 >> 15);
					if (local367 <= this.aClass2_Sub2_10.anInt3525) {
						return;
					}
					arg6[local423] = 0;
					if (arg2) {
						local283 = local367 - this.aClass2_Sub2_10.anInt3533;
						if (local283 > 255) {
							local283 = 255;
						}
						if (local283 > 0) {
							arg6[local423] = local283;
							local339 = local1450.aShortArray20[local423] * local283 / 255;
							if (local339 > 0) {
								local29 -= local339;
							}
						}
					} else if (this.aClass2_Sub2_10.aBoolean300) {
						local283 = local367 - this.aClass2_Sub2_10.anInt3533;
						if (local283 > 0) {
							arg6[local423] = local283;
							if (arg6[local423] > 255) {
								arg6[local423] = 255;
							}
						}
					}
					local255 = this.anInt6189 + (this.anInt6190 * local1460 + this.anInt6191 * local29 + this.anInt6196 * local1470 >> 15);
					local311 = this.anInt6192 + (this.anInt6197 * local1460 + this.anInt6188 * local29 + this.anInt6194 * local1470 >> 15);
					arg4[local423] = arg3.anInt3129 + local255 * this.aClass2_Sub2_10.anInt3538 / local367;
					arg5[local423] = arg3.anInt3126 + local311 * this.aClass2_Sub2_10.anInt3522 / local367;
				}
				if (local1450.aShortArray23 != null) {
					local283 = this.anIntArrayArray61[arg0][arg1];
					local339 = this.anIntArrayArray61[arg0 + 1][arg1];
					local395 = this.anIntArrayArray61[arg0][arg1 + 1];
					local451 = arg0 * this.anInt6200;
					local244 = local451 + this.anInt6200;
					local300 = arg1 * this.anInt6200;
					local356 = local300 + this.anInt6200;
					local412 = this.anInt6189 + (this.anInt6190 * local451 + this.anInt6191 * local283 + this.anInt6196 * local300 >> 15);
					local272 = this.anInt6192 + (this.anInt6197 * local451 + this.anInt6188 * local283 + this.anInt6194 * local300 >> 15);
					local328 = this.anInt6195 + (this.anInt6202 * local451 + this.anInt6198 * local283 + this.anInt6199 * local300 >> 15);
					local384 = this.anInt6189 + (this.anInt6190 * local244 + this.anInt6191 * local339 + this.anInt6196 * local300 >> 15);
					local440 = this.anInt6192 + (this.anInt6197 * local244 + this.anInt6188 * local339 + this.anInt6194 * local300 >> 15);
					local78 = this.anInt6195 + (this.anInt6202 * local244 + this.anInt6198 * local339 + this.anInt6199 * local300 >> 15);
					local101 = this.anInt6189 + (this.anInt6190 * local451 + this.anInt6191 * local395 + this.anInt6196 * local356 >> 15);
					local124 = this.anInt6192 + (this.anInt6197 * local451 + this.anInt6188 * local395 + this.anInt6194 * local356 >> 15);
					local147 = this.anInt6195 + (this.anInt6202 * local451 + this.anInt6198 * local395 + this.anInt6199 * local356 >> 15);
					for (local36 = 0; local36 < local1450.aShort14; local36++) {
						local38 = local36 * 3;
						local40 = local38 + 1;
						local42 = local40 + 1;
						local163 = arg4[local38];
						local56 = arg4[local40];
						local61 = arg4[local42];
						local222 = arg5[local38];
						local227 = arg5[local40];
						local620 = arg5[local42];
						@Pc(1910) int local1910 = arg6[local38] + arg6[local40] + arg6[local42];
						if ((local163 - local56) * (local620 - local227) - (local222 - local227) * (local61 - local56) > 0) {
							arg3.aBoolean272 = local163 < 0 || local56 < 0 || local61 < 0 || local163 > arg3.anInt3128 || local56 > arg3.anInt3128 || local61 > arg3.anInt3128;
							@Pc(1954) short local1954 = local1450.aShortArray23[local36];
							if (local1910 < 765) {
								if (local1954 != -1 && this.method5438(this.aClass2_Sub2_10.anInterface7_6.method2788(local1954).aByte67)) {
									arg3.anInt3124 = 100;
								}
								if (local1910 > 0) {
									if (local1954 != -1) {
										arg3.method2957(local222, local227, local620, local163, local56, local61, this.aClass2_Sub2_10.anInt3515, arg6[local38], arg6[local40], arg6[local42], local1450.anIntArray194[local38], local1450.anIntArray194[local40], local1450.anIntArray194[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
									} else if ((local1450.anIntArray194[local38] & 0xFFFFFF) != 0) {
										arg3.method2959(local222, local227, local620, local163, local56, local61, Static160.method3019(local1450.anIntArray194[local38], arg6[local38] << 24 | this.aClass2_Sub2_10.anInt3515), Static160.method3019(local1450.anIntArray194[local40], arg6[local40] << 24 | this.aClass2_Sub2_10.anInt3515), Static160.method3019(local1450.anIntArray194[local42], arg6[local42] << 24 | this.aClass2_Sub2_10.anInt3515));
									}
								} else if (local1954 != -1) {
									arg3.method2958(local222, local227, local620, local163, local56, local61, local1450.anIntArray194[local38], local1450.anIntArray194[local40], local1450.anIntArray194[local42], local412, local384, local101, local272, local440, local124, local328, local78, local147, local1954);
								} else if ((local1450.anIntArray194[local38] & 0xFFFFFF) != 0) {
									arg3.method2959(local222, local227, local620, local163, local56, local61, local1450.anIntArray194[local38], local1450.anIntArray194[local40], local1450.anIntArray194[local42]);
								}
								arg3.anInt3124 = 0;
							} else {
								arg3.method2965(local222, local227, local620, local163, local56, local61, this.aClass2_Sub2_10.anInt3515);
							}
						}
					}
					return;
				}
				for (local283 = 0; local283 < local1450.aShort14; local283++) {
					local339 = local283 * 3;
					local395 = local339 + 1;
					local451 = local395 + 1;
					local244 = arg4[local339];
					local300 = arg4[local395];
					local356 = arg4[local451];
					local412 = arg5[local339];
					local272 = arg5[local395];
					local328 = arg5[local451];
					local384 = arg6[local339] + arg6[local395] + arg6[local451];
					if ((local244 - local300) * (local328 - local272) - (local412 - local272) * (local356 - local300) > 0) {
						arg3.aBoolean272 = local244 < 0 || local300 < 0 || local356 < 0 || local244 > arg3.anInt3128 || local300 > arg3.anInt3128 || local356 > arg3.anInt3128;
						if (local384 >= 765) {
							arg3.method2965(local412, local272, local328, local244, local300, local356, this.aClass2_Sub2_10.anInt3515);
						} else if (local384 > 0) {
							if ((local1450.anIntArray194[local339] & 0xFFFFFF) != 0) {
								arg3.method2959(local412, local272, local328, local244, local300, local356, Static2.method3245(local1450.anIntArray194[local339], arg6[local339], this.aClass2_Sub2_10.anInt3515), Static2.method3245(local1450.anIntArray194[local395], arg6[local395], this.aClass2_Sub2_10.anInt3515), Static2.method3245(local1450.anIntArray194[local451], arg6[local451], this.aClass2_Sub2_10.anInt3515));
							}
						} else if ((local1450.anIntArray194[local339] & 0xFFFFFF) != 0) {
							arg3.method2959(local412, local272, local328, local244, local300, local356, local1450.anIntArray194[local339], local1450.anIntArray194[local395], local1450.anIntArray194[local451]);
						}
					}
				}
			}
		} else if ((local6.aByte41 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6200;
			@Pc(24) int local24 = local19 + this.anInt6200;
			local29 = arg1 * this.anInt6200;
			@Pc(34) int local34 = local29 + this.anInt6200;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte41 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray61[arg0][arg1];
				local61 = this.anIntArrayArray61[arg0 + 1][arg1];
				local222 = this.anIntArrayArray61[arg0 + 1][arg1 + 1];
				local227 = this.anIntArrayArray61[arg0][arg1 + 1];
				local78 = this.anInt6195 + (this.anInt6202 * local19 + this.anInt6198 * local56 + this.anInt6199 * local29 >> 15);
				if (local78 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local101 = this.anInt6195 + (this.anInt6202 * local24 + this.anInt6198 * local61 + this.anInt6199 * local29 >> 15);
				if (local101 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local124 = this.anInt6195 + (this.anInt6202 * local24 + this.anInt6198 * local222 + this.anInt6199 * local34 >> 15);
				if (local124 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local147 = this.anInt6195 + (this.anInt6202 * local19 + this.anInt6198 * local227 + this.anInt6199 * local34 >> 15);
				if (local147 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				if (arg2) {
					local163 = local78 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local36 = local163;
						local620 = this.anIntArrayArray62[arg0][arg1] * local163 / 255;
						if (local620 > 0) {
							local56 -= local620;
						}
					}
					local163 = local101 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local38 = local163;
						local620 = this.anIntArrayArray62[arg0 + 1][arg1] * local163 / 255;
						if (local620 > 0) {
							local61 -= local620;
						}
					}
					local163 = local124 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local40 = local163;
						local620 = this.anIntArrayArray62[arg0 + 1][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local222 -= local620;
						}
					}
					local163 = local147 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 255) {
						local163 = 255;
					}
					if (local163 > 0) {
						local42 = local163;
						local620 = this.anIntArrayArray62[arg0][arg1 + 1] * local163 / 255;
						if (local620 > 0) {
							local227 -= local620;
						}
					}
				} else if (this.aClass2_Sub2_10.aBoolean300) {
					local163 = local78 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local244 = this.anInt6189 + (this.anInt6190 * local19 + this.anInt6191 * local56 + this.anInt6196 * local29 >> 15);
				local255 = arg3.anInt3129 + local244 * this.aClass2_Sub2_10.anInt3538 / local78;
				local272 = this.anInt6192 + (this.anInt6197 * local19 + this.anInt6188 * local56 + this.anInt6194 * local29 >> 15);
				local283 = arg3.anInt3126 + local272 * this.aClass2_Sub2_10.anInt3522 / local78;
				local300 = this.anInt6189 + (this.anInt6190 * local24 + this.anInt6191 * local61 + this.anInt6196 * local29 >> 15);
				local311 = arg3.anInt3129 + local300 * this.aClass2_Sub2_10.anInt3538 / local101;
				local328 = this.anInt6192 + (this.anInt6197 * local24 + this.anInt6188 * local61 + this.anInt6194 * local29 >> 15);
				local339 = arg3.anInt3126 + local328 * this.aClass2_Sub2_10.anInt3522 / local101;
				local356 = this.anInt6189 + (this.anInt6190 * local24 + this.anInt6191 * local222 + this.anInt6196 * local34 >> 15);
				local367 = arg3.anInt3129 + local356 * this.aClass2_Sub2_10.anInt3538 / local124;
				local384 = this.anInt6192 + (this.anInt6197 * local24 + this.anInt6188 * local222 + this.anInt6194 * local34 >> 15);
				local395 = arg3.anInt3126 + local384 * this.aClass2_Sub2_10.anInt3522 / local124;
				local412 = this.anInt6189 + (this.anInt6190 * local19 + this.anInt6191 * local227 + this.anInt6196 * local34 >> 15);
				local423 = arg3.anInt3129 + local412 * this.aClass2_Sub2_10.anInt3538 / local147;
				local440 = this.anInt6192 + (this.anInt6197 * local19 + this.anInt6188 * local227 + this.anInt6194 * local34 >> 15);
				local451 = arg3.anInt3126 + local440 * this.aClass2_Sub2_10.anInt3522 / local147;
			} else {
				local56 = this.anIntArrayArray61[arg0][arg1];
				local61 = this.anInt6198 * local56;
				local78 = this.anInt6195 + (this.anInt6202 * local19 + local61 + this.anInt6199 * local29 >> 15);
				if (local78 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local101 = this.anInt6195 + (this.anInt6202 * local24 + local61 + this.anInt6199 * local29 >> 15);
				if (local101 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local124 = this.anInt6195 + (this.anInt6202 * local24 + local61 + this.anInt6199 * local34 >> 15);
				if (local124 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local147 = this.anInt6195 + (this.anInt6202 * local19 + local61 + this.anInt6199 * local34 >> 15);
				if (local147 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				if (this.aClass2_Sub2_10.aBoolean300) {
					local163 = local78 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local36 = local163;
						if (local163 > 255) {
							local36 = 255;
						}
					}
					local163 = local101 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local38 = local163;
						if (local163 > 255) {
							local38 = 255;
						}
					}
					local163 = local124 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local40 = local163;
						if (local163 > 255) {
							local40 = 255;
						}
					}
					local163 = local147 - this.aClass2_Sub2_10.anInt3533;
					if (local163 > 0) {
						local42 = local163;
						if (local163 > 255) {
							local42 = 255;
						}
					}
				}
				local222 = this.anInt6191 * local56;
				local227 = this.anInt6188 * local56;
				local244 = this.anInt6189 + (this.anInt6190 * local19 + local222 + this.anInt6196 * local29 >> 15);
				local255 = arg3.anInt3129 + local244 * this.aClass2_Sub2_10.anInt3538 / local78;
				local272 = this.anInt6192 + (this.anInt6197 * local19 + local227 + this.anInt6194 * local29 >> 15);
				local283 = arg3.anInt3126 + local272 * this.aClass2_Sub2_10.anInt3522 / local78;
				local300 = this.anInt6189 + (this.anInt6190 * local24 + local222 + this.anInt6196 * local29 >> 15);
				local311 = arg3.anInt3129 + local300 * this.aClass2_Sub2_10.anInt3538 / local101;
				local328 = this.anInt6192 + (this.anInt6197 * local24 + local227 + this.anInt6194 * local29 >> 15);
				local339 = arg3.anInt3126 + local328 * this.aClass2_Sub2_10.anInt3522 / local101;
				local356 = this.anInt6189 + (this.anInt6190 * local24 + local222 + this.anInt6196 * local34 >> 15);
				local367 = arg3.anInt3129 + local356 * this.aClass2_Sub2_10.anInt3538 / local124;
				local384 = this.anInt6192 + (this.anInt6197 * local24 + local227 + this.anInt6194 * local34 >> 15);
				local395 = arg3.anInt3126 + local384 * this.aClass2_Sub2_10.anInt3522 / local124;
				local412 = this.anInt6189 + (this.anInt6190 * local19 + local222 + this.anInt6196 * local34 >> 15);
				local423 = arg3.anInt3129 + local412 * this.aClass2_Sub2_10.anInt3538 / local147;
				local440 = this.anInt6192 + (this.anInt6197 * local19 + local227 + this.anInt6194 * local34 >> 15);
				local451 = arg3.anInt3126 + local440 * this.aClass2_Sub2_10.anInt3522 / local147;
			}
			@Pc(1062) boolean local1062 = local6.aShort45 != -1 && this.method5438(this.aClass2_Sub2_10.anInterface7_6.method2788(local6.aShort45).aByte67);
			local61 = local38 + local40 + local42;
			if ((local367 - local423) * (local339 - local451) - (local395 - local451) * (local311 - local423) > 0) {
				arg3.aBoolean272 = local367 < 0 || local423 < 0 || local311 < 0 || local367 > arg3.anInt3128 || local423 > arg3.anInt3128 || local311 > arg3.anInt3128;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt3124 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort45 >= 0) {
							arg3.method2957(local395, local451, local339, local367, local423, local311, this.aClass2_Sub2_10.anInt3515, local40, local42, local38, local6.anInt4153, local6.anInt4152, local6.anInt4154, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort45);
						} else {
							arg3.method2959(local395, local451, local339, local367, local423, local311, Static160.method3019(local6.anInt4153, local40 << 24 | this.aClass2_Sub2_10.anInt3515), Static160.method3019(local6.anInt4152, local42 << 24 | this.aClass2_Sub2_10.anInt3515), Static160.method3019(local6.anInt4154, local38 << 24 | this.aClass2_Sub2_10.anInt3515));
						}
					} else if (local6.aShort45 >= 0) {
						arg3.method2958(local395, local451, local339, local367, local423, local311, local6.anInt4153, local6.anInt4152, local6.anInt4154, local356, local412, local300, local384, local440, local328, local124, local147, local101, local6.aShort45);
					} else {
						arg3.method2959(local395, local451, local339, local367, local423, local311, local6.anInt4153, local6.anInt4152, local6.anInt4154);
					}
					arg3.anInt3124 = 0;
				} else {
					arg3.method2965(local395, local451, local339, local367, local423, local311, this.aClass2_Sub2_10.anInt3515);
				}
			}
			local61 = local36 + local38 + local42;
			if ((local255 - local311) * (local451 - local339) - (local283 - local339) * (local423 - local311) > 0) {
				arg3.aBoolean272 = local255 < 0 || local311 < 0 || local423 < 0 || local255 > arg3.anInt3128 || local311 > arg3.anInt3128 || local423 > arg3.anInt3128;
				if (local61 < 765) {
					if (local1062) {
						arg3.anInt3124 = 100;
					}
					if (local61 > 0) {
						if (local6.aShort45 >= 0) {
							arg3.method2957(local283, local339, local451, local255, local311, local423, this.aClass2_Sub2_10.anInt3515, local36, local38, local42, local6.anInt4151, local6.anInt4154, local6.anInt4152, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort45);
						} else {
							arg3.method2959(local283, local339, local451, local255, local311, local423, Static160.method3019(local6.anInt4151, local36 << 24 | this.aClass2_Sub2_10.anInt3515), Static160.method3019(local6.anInt4154, local38 << 24 | this.aClass2_Sub2_10.anInt3515), Static160.method3019(local6.anInt4152, local42 << 24 | this.aClass2_Sub2_10.anInt3515));
						}
					} else if (local6.aShort45 >= 0) {
						arg3.method2958(local283, local339, local451, local255, local311, local423, local6.anInt4151, local6.anInt4154, local6.anInt4152, local244, local300, local412, local272, local328, local440, local78, local101, local147, local6.aShort45);
					} else {
						arg3.method2959(local283, local339, local451, local255, local311, local423, local6.anInt4151, local6.anInt4154, local6.anInt4152);
					}
					arg3.anInt3124 = 0;
					return;
				}
				arg3.method2965(local283, local339, local451, local255, local311, local423, this.aClass2_Sub2_10.anInt3515);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!k;[I[I[I)V")
	private void method5437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class34 local6 = this.aClass34ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(181) int local181;
		@Pc(237) int local237;
		@Pc(293) int local293;
		@Pc(349) int local349;
		@Pc(209) int local209;
		@Pc(170) int local170;
		@Pc(226) int local226;
		@Pc(282) int local282;
		@Pc(338) int local338;
		@Pc(198) int local198;
		@Pc(254) int local254;
		@Pc(310) int local310;
		@Pc(366) int local366;
		@Pc(68) int local68;
		@Pc(91) int local91;
		@Pc(114) int local114;
		@Pc(137) int local137;
		@Pc(46) int local46;
		@Pc(265) int local265;
		@Pc(321) int local321;
		@Pc(377) int local377;
		if (local6 == null) {
			@Pc(996) Class149 local996 = this.aClass149ArrayArray1[arg0][arg1];
			if (local996 != null) {
				for (local349 = 0; local349 < local996.aShort59; local349++) {
					local24 = local996.anIntArray575[local349];
					local29 = local996.anIntArray573[local349];
					local34 = local996.anIntArray574[local349];
					local293 = this.anInt6195 + (this.anInt6202 * local24 + this.anInt6198 * local29 + this.anInt6199 * local34 >> 15);
					if (local293 <= this.aClass2_Sub2_10.anInt3525) {
						return;
					}
					local181 = this.anInt6189 + (this.anInt6190 * local24 + this.anInt6191 * local29 + this.anInt6196 * local34 >> 15);
					local237 = this.anInt6192 + (this.anInt6197 * local24 + this.anInt6188 * local29 + this.anInt6194 * local34 >> 15);
					arg3[local349] = arg2.anInt3129 + local181 * this.aClass2_Sub2_10.anInt3538 / local293;
					arg4[local349] = arg2.anInt3126 + local237 * this.aClass2_Sub2_10.anInt3522 / local293;
				}
				if (local996.aShortArray73 != null) {
					local209 = this.anIntArrayArray61[arg0][arg1];
					local265 = this.anIntArrayArray61[arg0 + 1][arg1];
					local321 = this.anIntArrayArray61[arg0][arg1 + 1];
					local377 = arg0 * this.anInt6200;
					local170 = local377 + this.anInt6200;
					local226 = arg1 * this.anInt6200;
					local282 = local226 + this.anInt6200;
					local338 = this.anInt6189 + (this.anInt6190 * local377 + this.anInt6191 * local209 + this.anInt6196 * local226 >> 15);
					local198 = this.anInt6192 + (this.anInt6197 * local377 + this.anInt6188 * local209 + this.anInt6194 * local226 >> 15);
					local254 = this.anInt6195 + (this.anInt6202 * local377 + this.anInt6198 * local209 + this.anInt6199 * local226 >> 15);
					local310 = this.anInt6189 + (this.anInt6190 * local170 + this.anInt6191 * local265 + this.anInt6196 * local226 >> 15);
					local366 = this.anInt6192 + (this.anInt6197 * local170 + this.anInt6188 * local265 + this.anInt6194 * local226 >> 15);
					local68 = this.anInt6195 + (this.anInt6202 * local170 + this.anInt6198 * local265 + this.anInt6199 * local226 >> 15);
					local91 = this.anInt6189 + (this.anInt6190 * local377 + this.anInt6191 * local321 + this.anInt6196 * local282 >> 15);
					local114 = this.anInt6192 + (this.anInt6197 * local377 + this.anInt6188 * local321 + this.anInt6194 * local282 >> 15);
					local137 = this.anInt6195 + (this.anInt6202 * local377 + this.anInt6198 * local321 + this.anInt6199 * local282 >> 15);
					for (local46 = 0; local46 < local996.aShort58; local46++) {
						@Pc(1349) short local1349 = local996.aShortArray70[local46];
						@Pc(1354) short local1354 = local996.aShortArray69[local46];
						@Pc(1359) short local1359 = local996.aShortArray74[local46];
						@Pc(1363) int local1363 = arg3[local1349];
						@Pc(1367) int local1367 = arg3[local1354];
						@Pc(1371) int local1371 = arg3[local1359];
						@Pc(1375) int local1375 = arg4[local1349];
						@Pc(1379) int local1379 = arg4[local1354];
						@Pc(1383) int local1383 = arg4[local1359];
						if ((local1363 - local1367) * (local1383 - local1379) - (local1375 - local1379) * (local1371 - local1367) > 0) {
							arg2.aBoolean272 = local1363 < 0 || local1367 < 0 || local1371 < 0 || local1363 > arg2.anInt3128 || local1367 > arg2.anInt3128 || local1371 > arg2.anInt3128;
							@Pc(1427) short local1427 = local996.aShortArray73[local46];
							if (local1427 == -1) {
								@Pc(1482) int local1482 = local996.anIntArray571[local46];
								if (local1482 != -1) {
									arg2.method2968(local1375, local1379, local1383, local1363, local1367, local1371, Static194.method3677(local1482, local996.aShortArray72[local1349]), Static194.method3677(local1482, local996.aShortArray72[local1354]), Static194.method3677(local1482, local996.aShortArray72[local1359]));
								}
							} else {
								if (this.method5438(this.aClass2_Sub2_10.anInterface7_6.method2788(local1427).aByte67)) {
									arg2.anInt3124 = 100;
								}
								arg2.method2958(local1375, local1379, local1383, local1363, local1367, local1371, local996.aShortArray72[local1349], local996.aShortArray72[local1354], local996.aShortArray72[local1359], local338, local310, local91, local198, local366, local114, local254, local68, local137, local1427);
								arg2.anInt3124 = 0;
							}
						}
					}
					return;
				}
				for (local209 = 0; local209 < local996.aShort58; local209++) {
					@Pc(1528) short local1528 = local996.aShortArray70[local209];
					@Pc(1533) short local1533 = local996.aShortArray69[local209];
					@Pc(1538) short local1538 = local996.aShortArray74[local209];
					local170 = arg3[local1528];
					local226 = arg3[local1533];
					local282 = arg3[local1538];
					local338 = arg4[local1528];
					local198 = arg4[local1533];
					local254 = arg4[local1538];
					if ((local170 - local226) * (local254 - local198) - (local338 - local198) * (local282 - local226) > 0) {
						local310 = local996.anIntArray571[local209];
						if (local310 != -1) {
							arg2.aBoolean272 = local170 < 0 || local226 < 0 || local282 < 0 || local170 > arg2.anInt3128 || local226 > arg2.anInt3128 || local282 > arg2.anInt3128;
							arg2.method2968(local338, local198, local254, local170, local226, local282, Static194.method3677(local310, local996.aShortArray72[local1528]), Static194.method3677(local310, local996.aShortArray72[local1533]), Static194.method3677(local310, local996.aShortArray72[local1538]));
						}
					}
				}
			}
		} else if ((local6.aByte11 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * this.anInt6200;
			local24 = local19 + this.anInt6200;
			local29 = arg1 * this.anInt6200;
			local34 = local29 + this.anInt6200;
			@Pc(51) int local51;
			@Pc(148) int local148;
			@Pc(153) int local153;
			if ((local6.aByte11 & 0x1) == 0) {
				local46 = this.anIntArrayArray61[arg0][arg1];
				local51 = this.anIntArrayArray61[arg0 + 1][arg1];
				local148 = this.anIntArrayArray61[arg0 + 1][arg1 + 1];
				local153 = this.anIntArrayArray61[arg0][arg1 + 1];
				local68 = this.anInt6195 + (this.anInt6202 * local19 + this.anInt6198 * local46 + this.anInt6199 * local29 >> 15);
				if (local68 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local91 = this.anInt6195 + (this.anInt6202 * local24 + this.anInt6198 * local51 + this.anInt6199 * local29 >> 15);
				if (local91 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local114 = this.anInt6195 + (this.anInt6202 * local24 + this.anInt6198 * local148 + this.anInt6199 * local34 >> 15);
				if (local114 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local137 = this.anInt6195 + (this.anInt6202 * local19 + this.anInt6198 * local153 + this.anInt6199 * local34 >> 15);
				if (local137 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local170 = this.anInt6189 + (this.anInt6190 * local19 + this.anInt6191 * local46 + this.anInt6196 * local29 >> 15);
				local181 = arg2.anInt3129 + local170 * this.aClass2_Sub2_10.anInt3538 / local68;
				local198 = this.anInt6192 + (this.anInt6197 * local19 + this.anInt6188 * local46 + this.anInt6194 * local29 >> 15);
				local209 = arg2.anInt3126 + local198 * this.aClass2_Sub2_10.anInt3522 / local68;
				local226 = this.anInt6189 + (this.anInt6190 * local24 + this.anInt6191 * local51 + this.anInt6196 * local29 >> 15);
				local237 = arg2.anInt3129 + local226 * this.aClass2_Sub2_10.anInt3538 / local91;
				local254 = this.anInt6192 + (this.anInt6197 * local24 + this.anInt6188 * local51 + this.anInt6194 * local29 >> 15);
				local265 = arg2.anInt3126 + local254 * this.aClass2_Sub2_10.anInt3522 / local91;
				local282 = this.anInt6189 + (this.anInt6190 * local24 + this.anInt6191 * local148 + this.anInt6196 * local34 >> 15);
				local293 = arg2.anInt3129 + local282 * this.aClass2_Sub2_10.anInt3538 / local114;
				local310 = this.anInt6192 + (this.anInt6197 * local24 + this.anInt6188 * local148 + this.anInt6194 * local34 >> 15);
				local321 = arg2.anInt3126 + local310 * this.aClass2_Sub2_10.anInt3522 / local114;
				local338 = this.anInt6189 + (this.anInt6190 * local19 + this.anInt6191 * local153 + this.anInt6196 * local34 >> 15);
				local349 = arg2.anInt3129 + local338 * this.aClass2_Sub2_10.anInt3538 / local137;
				local366 = this.anInt6192 + (this.anInt6197 * local19 + this.anInt6188 * local153 + this.anInt6194 * local34 >> 15);
				local377 = arg2.anInt3126 + local366 * this.aClass2_Sub2_10.anInt3522 / local137;
			} else {
				local46 = this.anIntArrayArray61[arg0][arg1];
				local51 = this.anInt6198 * local46;
				local68 = this.anInt6195 + (this.anInt6202 * local19 + local51 + this.anInt6199 * local29 >> 15);
				if (local68 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local91 = this.anInt6195 + (this.anInt6202 * local24 + local51 + this.anInt6199 * local29 >> 15);
				if (local91 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local114 = this.anInt6195 + (this.anInt6202 * local24 + local51 + this.anInt6199 * local34 >> 15);
				if (local114 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local137 = this.anInt6195 + (this.anInt6202 * local19 + local51 + this.anInt6199 * local34 >> 15);
				if (local137 <= this.aClass2_Sub2_10.anInt3525) {
					return;
				}
				local148 = this.anInt6191 * local46;
				local153 = this.anInt6188 * local46;
				local170 = this.anInt6189 + (this.anInt6190 * local19 + local148 + this.anInt6196 * local29 >> 15);
				local181 = arg2.anInt3129 + local170 * this.aClass2_Sub2_10.anInt3538 / local68;
				local198 = this.anInt6192 + (this.anInt6197 * local19 + local153 + this.anInt6194 * local29 >> 15);
				local209 = arg2.anInt3126 + local198 * this.aClass2_Sub2_10.anInt3522 / local68;
				local226 = this.anInt6189 + (this.anInt6190 * local24 + local148 + this.anInt6196 * local29 >> 15);
				local237 = arg2.anInt3129 + local226 * this.aClass2_Sub2_10.anInt3538 / local91;
				local254 = this.anInt6192 + (this.anInt6197 * local24 + local153 + this.anInt6194 * local29 >> 15);
				local265 = arg2.anInt3126 + local254 * this.aClass2_Sub2_10.anInt3522 / local91;
				local282 = this.anInt6189 + (this.anInt6190 * local24 + local148 + this.anInt6196 * local34 >> 15);
				local293 = arg2.anInt3129 + local282 * this.aClass2_Sub2_10.anInt3538 / local114;
				local310 = this.anInt6192 + (this.anInt6197 * local24 + local153 + this.anInt6194 * local34 >> 15);
				local321 = arg2.anInt3126 + local310 * this.aClass2_Sub2_10.anInt3522 / local114;
				local338 = this.anInt6189 + (this.anInt6190 * local19 + local148 + this.anInt6196 * local34 >> 15);
				local349 = arg2.anInt3129 + local338 * this.aClass2_Sub2_10.anInt3538 / local137;
				local366 = this.anInt6192 + (this.anInt6197 * local19 + local153 + this.anInt6194 * local34 >> 15);
				local377 = arg2.anInt3126 + local366 * this.aClass2_Sub2_10.anInt3522 / local137;
			}
			if ((local293 - local349) * (local265 - local377) - (local321 - local377) * (local237 - local349) > 0) {
				arg2.aBoolean272 = local293 < 0 || local349 < 0 || local237 < 0 || local293 > arg2.anInt3128 || local349 > arg2.anInt3128 || local237 > arg2.anInt3128;
				if (local6.aShort8 >= 0) {
					if (this.method5438(this.aClass2_Sub2_10.anInterface7_6.method2788(local6.aShort8).aByte67)) {
						arg2.anInt3124 = 100;
					}
					arg2.method2958(local321, local377, local265, local293, local349, local237, local6.aShort12 & 0xFFFF, local6.aShort11 & 0xFFFF, local6.aShort9 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort8);
					arg2.anInt3124 = 0;
				} else {
					arg2.method2968(local321, local377, local265, local293, local349, local237, local6.aShort12 & 0xFFFF, local6.aShort11 & 0xFFFF, local6.aShort9 & 0xFFFF);
				}
			}
			if ((local181 - local237) * (local377 - local265) - (local209 - local265) * (local349 - local237) > 0) {
				arg2.aBoolean272 = local181 < 0 || local237 < 0 || local349 < 0 || local181 > arg2.anInt3128 || local237 > arg2.anInt3128 || local349 > arg2.anInt3128;
				if (local6.aShort8 >= 0) {
					if (this.method5438(this.aClass2_Sub2_10.anInterface7_6.method2788(local6.aShort8).aByte67)) {
						arg2.anInt3124 = 100;
					}
					arg2.method2958(local209, local265, local377, local181, local237, local349, local6.aShort10 & 0xFFFF, local6.aShort9 & 0xFFFF, local6.aShort11 & 0xFFFF, local170, local226, local338, local198, local254, local366, local68, local91, local137, local6.aShort8);
					arg2.anInt3124 = 0;
					return;
				}
				arg2.method2968(local209, local265, local377, local181, local237, local349, local6.aShort10 & 0xFFFF, local6.aShort9 & 0xFFFF, local6.aShort11 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)Z")
	private boolean method5438(@OriginalArg(0) int arg0) {
		if ((this.anInt6193 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else {
			return arg0 == 8;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!ek;IIIIZ)Z")
	@Override
	public boolean method5419(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		if (this.aClass141ArrayArray1 == null) {
			this.aClass141ArrayArray1 = new Class141[super.anInt6179][super.anInt6185];
			this.aClass54ArrayArray1 = new Class54[super.anInt6179][super.anInt6185];
		} else if (this.aClass34ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg5.length; local32++) {
			if (arg5[local32] == -1) {
				arg5[local32] = 0;
			} else {
				arg5[local32] = Static220.anIntArray551[Static198.method3729(arg5[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg6 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg6.length; local68++) {
				if (arg6[local68] == -1) {
					arg6[local68] = 0;
				} else {
					arg6[local68] = Static220.anIntArray551[Static198.method3729(arg6[local68]) & 0xFFFF] << 8 | 0xFF;
				}
			}
		}
		@Pc(102) boolean local102 = true;
		@Pc(104) int local104 = -1;
		@Pc(106) int local106 = -1;
		@Pc(108) int local108 = -1;
		@Pc(110) int local110 = -1;
		@Pc(244) int local244;
		if (arg2.length == 6) {
			for (@Pc(116) int local116 = 0; local116 < 6; local116++) {
				if (arg2[local116] == 0 && arg4[local116] == 0) {
					if (local104 != -1 && arg5[local104] != arg5[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == this.anInt6200 && arg4[local116] == 0) {
					if (local106 != -1 && arg5[local106] != arg5[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == this.anInt6200 && arg4[local116] == this.anInt6200) {
					if (local108 != -1 && arg5[local108] != arg5[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == this.anInt6200) {
					if (local110 != -1 && arg5[local110] != arg5[local116]) {
						local102 = false;
						break;
					}
					local110 = local116;
				}
			}
			if (local104 == -1 || local106 == -1 || local108 == -1 || local110 == -1) {
				local102 = false;
			}
			if (local102) {
				if (arg3 != null) {
					for (local244 = 0; local244 < 4; local244++) {
						if (arg3[local244] != 0) {
							local102 = false;
							break;
						}
					}
				}
				if (local102) {
					for (local244 = 1; local244 < 4; local244++) {
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + this.anInt6200 && arg2[local244] != arg2[0] - this.anInt6200) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + this.anInt6200 && arg4[local244] != arg4[0] - this.anInt6200) {
							local102 = false;
							break;
						}
					}
				}
			}
		} else {
			local102 = false;
		}
		@Pc(342) int local342;
		@Pc(531) int local531;
		if (local102) {
			@Pc(334) Class141 local334 = new Class141();
			local244 = arg5[0];
			local342 = arg7[0];
			if (arg6 != null) {
				local334.anInt4155 = arg6[0] >> 8;
				if (local244 == 0) {
					local334.aByte41 = (byte) (local334.aByte41 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray61[arg0][arg1] == this.anIntArrayArray61[arg0 + 1][arg1] && this.anIntArrayArray61[arg0][arg1] == this.anIntArrayArray61[arg0 + 1][arg1 + 1] && this.anIntArrayArray61[arg0][arg1] == this.anIntArrayArray61[arg0][arg1 + 1]) {
				local334.aByte41 = (byte) (local334.aByte41 | 0x1);
			}
			if (local342 == -1 || (local334.aByte41 & 0x2) != 0 || this.aClass2_Sub2_10.anInterface7_6.method2788(local342).aBoolean570) {
				if (this.anIntArrayArray62 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray62[arg0][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4151 = Static2.method3245(Static368.method5440(arg5[local104] >> 8, this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]), local531, arg9);
				if (local334.anInt4155 != 0) {
					local334.anInt4151 |= this.aByteArrayArray20[arg0][arg1] + 255 - this.aByteArrayArray19[arg0][arg1] << 25;
				}
				if (this.anIntArrayArray62 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray62[arg0 + 1][arg1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4154 = Static2.method3245(Static368.method5440(arg5[local106] >> 8, this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]), local531, arg9);
				if (local334.anInt4155 != 0) {
					local334.anInt4154 |= this.aByteArrayArray20[arg0 + 1][arg1] + 255 - this.aByteArrayArray19[arg0 + 1][arg1] << 25;
				}
				if (this.anIntArrayArray62 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray62[arg0 + 1][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4153 = Static2.method3245(Static368.method5440(arg5[local108] >> 8, this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]), local531, arg9);
				if (local334.anInt4155 != 0) {
					local334.anInt4153 |= this.aByteArrayArray20[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray19[arg0 + 1][arg1 + 1] << 25;
				}
				if (this.anIntArrayArray62 == null || arg10 == 0) {
					local531 = 0;
				} else {
					local531 = this.anIntArrayArray62[arg0][arg1 + 1] * 255 / arg10;
					if (local531 < 0) {
						local531 = 0;
					} else if (local531 > 255) {
						local531 = 255;
					}
				}
				local334.anInt4152 = Static2.method3245(Static368.method5440(arg5[local110] >> 8, this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]), local531, arg9);
				if (local334.anInt4155 != 0) {
					local334.anInt4152 |= this.aByteArrayArray20[arg0][arg1 + 1] + 255 - this.aByteArrayArray19[arg0][arg1 + 1] << 25;
				}
				local334.aShort45 = -1;
			} else {
				local334.anInt4151 = this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1];
				local334.anInt4154 = this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1];
				local334.anInt4153 = this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1];
				local334.anInt4152 = this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1];
				local334.aShort45 = (short) local342;
			}
			this.aClass141ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(886) Class54 local886 = new Class54();
		local886.aShort13 = (short) arg2.length;
		local886.aShort14 = (short) (arg2.length / 3);
		local886.aShortArray24 = new short[local886.aShort13];
		local886.aShortArray25 = new short[local886.aShort13];
		local886.aShortArray22 = new short[local886.aShort13];
		local886.anIntArray194 = new int[local886.aShort13];
		if (this.anIntArrayArray62 != null) {
			local886.aShortArray20 = new short[local886.aShort13];
		}
		@Pc(957) int local957;
		@Pc(1078) int local1078;
		@Pc(1125) int local1125;
		@Pc(1225) int local1225;
		@Pc(1344) int local1344;
		for (local244 = 0; local244 < local886.aShort13; local244++) {
			local342 = arg2[local244];
			local531 = arg4[local244];
			if (local342 == 0 && local531 == 0) {
				local957 = this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1];
			} else if (local342 == 0 && local531 == this.anInt6200) {
				local957 = this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1];
			} else if (local342 == this.anInt6200 && local531 == this.anInt6200) {
				local957 = this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1];
			} else if (local342 == this.anInt6200 && local531 == 0) {
				local957 = this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1];
			} else {
				local1078 = (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]) * (this.anInt6200 - local342) + (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]) * local342;
				local1125 = (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]) * (this.anInt6200 - local342) + (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]) * local342;
				local957 = local1078 * (this.anInt6200 - local531) + local1125 * local531 >> this.anInt6201 * 2;
			}
			@Pc(1149) short local1149 = (short) ((arg0 << this.anInt6201) + local342);
			@Pc(1157) short local1157 = (short) ((arg1 << this.anInt6201) + local531);
			local886.aShortArray24[local244] = local1149;
			local886.aShortArray22[local244] = local1157;
			local886.aShortArray25[local244] = (short) (this.method5433(local1149, local1157) + (arg3 == null ? 0 : arg3[local244]));
			if (local957 < 0) {
				local957 = 0;
			}
			if (arg7[local244] != -1 && !this.aClass2_Sub2_10.anInterface7_6.method2788(arg7[local244]).aBoolean570) {
				local886.anIntArray194[local244] = local957;
			} else if (arg5[local244] != 0) {
				local1225 = 0;
				if (this.anIntArrayArray62 != null) {
					@Pc(1241) int local1241;
					if (local342 == 0 && local531 == 0) {
						local1241 = this.anIntArrayArray62[arg0][arg1];
					} else if (local342 == 0 && local531 == this.anInt6200) {
						local1241 = this.anIntArrayArray62[arg0][arg1 + 1];
					} else if (local342 == this.anInt6200 && local531 == this.anInt6200) {
						local1241 = this.anIntArrayArray62[arg0 + 1][arg1 + 1];
					} else if (local342 == this.anInt6200 && local531 == 0) {
						local1241 = this.anIntArrayArray62[arg0 + 1][arg1];
					} else {
						@Pc(1317) int local1317 = this.anIntArrayArray62[arg0][arg1] * (this.anInt6200 - local342) + this.anIntArrayArray62[arg0 + 1][arg1] * local342;
						local1344 = this.anIntArrayArray62[arg0][arg1 + 1] * (this.anInt6200 - local342) + this.anIntArrayArray62[arg0 + 1][arg1 + 1] * local342;
						local1241 = local1317 * (this.anInt6200 - local531) + local1344 * local531 >> this.anInt6201 * 2;
					}
					local886.aShortArray20[local244] = (short) local1241;
					if (arg10 != 0) {
						local1225 = local1241 * 255 / arg10;
						if (local1225 < 0) {
							local1225 = 0;
						} else if (local1225 > 255) {
							local1225 = 255;
						}
					}
				}
				local886.anIntArray194[local244] = Static2.method3245(Static368.method5440(arg5[local244] >> 8, local957), local1225, arg9);
				if (arg6 != null) {
					local886.anIntArray194[local244] |= local957 << 25;
				}
			} else if (arg6 == null) {
				local886.anIntArray194[local244] = 0;
			} else {
				local886.anIntArray194[local244] = local957 << 25;
			}
		}
		@Pc(1424) boolean local1424 = false;
		for (local531 = 0; local531 < local886.aShort14; local531++) {
			if (arg7[local531 * 3] != -1 && !this.aClass2_Sub2_10.anInterface7_6.method2788(arg7[local531 * 3]).aBoolean570) {
				local1424 = true;
			}
		}
		if (arg6 != null) {
			local886.anIntArray195 = new int[local886.aShort14];
		}
		if (local1424) {
			local886.aShortArray23 = new short[local886.aShort14];
			local886.aShortArray21 = new short[local886.aShort14];
		}
		for (local957 = 0; local957 < local886.aShort14; local957++) {
			local1078 = local957 * 3;
			if (arg6 != null && arg6[local1078] != 0) {
				local886.anIntArray195[local957] = arg6[local1078] >> 8;
			}
			if (local1424) {
				local1125 = local1078 + 1;
				local1225 = local1125 + 1;
				@Pc(1506) boolean local1506 = false;
				@Pc(1508) boolean local1508 = true;
				local1344 = arg7[local1078];
				if (local1344 == -1 || this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aBoolean570) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1125];
				if (local1344 == -1 || this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aBoolean570) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				local1344 = arg7[local1225];
				if (local1344 == -1 || this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aBoolean570) {
					local1508 = false;
				} else {
					local1506 = true;
				}
				if (local1508) {
					local886.aShortArray23[local957] = (short) local1344;
					local886.aShortArray21[local957] = (short) arg8[local1078];
				} else {
					if (local1506) {
						local1344 = arg7[local1078];
						if (local1344 != -1 && !this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aBoolean570) {
							local886.anIntArray194[local1078] = Static220.anIntArray551[Static198.method3729(this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aShort90 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1125];
						if (local1344 != -1 && !this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aBoolean570) {
							local886.anIntArray194[local1125] = Static220.anIntArray551[Static198.method3729(this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aShort90 & 0xFFFF) & 0xFFFF];
						}
						local1344 = arg7[local1225];
						if (local1344 != -1 && !this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aBoolean570) {
							local886.anIntArray194[local1225] = Static220.anIntArray551[Static198.method3729(this.aClass2_Sub2_10.anInterface7_6.method2788(local1344).aShort90 & 0xFFFF) & 0xFFFF];
						}
					}
					local886.aShortArray23[local957] = -1;
				}
			}
		}
		this.aClass54ArrayArray1[arg0][arg1] = local886;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!ek;IIIIZ)V")
	@Override
	public void method5417(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "()V")
	@Override
	public void method5422() {
		this.aByteArrayArray19 = null;
		this.aByteArrayArray20 = null;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I")
	@Override
	public int method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> this.anInt6201;
		@Pc(9) int local9 = arg1 >> this.anInt6201;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6179 - 1 || local9 > super.anInt6185 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & this.anInt6200 - 1;
		@Pc(41) int local41 = arg1 & this.anInt6200 - 1;
		@Pc(67) int local67 = this.anIntArrayArray61[local4][local9] * (this.anInt6200 - local34) + this.anIntArrayArray61[local4 + 1][local9] * local34 >> this.anInt6201;
		@Pc(97) int local97 = this.anIntArrayArray61[local4][local9 + 1] * (this.anInt6200 - local34) + this.anIntArrayArray61[local4 + 1][local9 + 1] * local34 >> this.anInt6201;
		return local67 * (this.anInt6200 - local41) + local97 * local41 >> this.anInt6201;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IIIIIII[[ZLclient!k;[I[I)V")
	private void method5439(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class106 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean271 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass141ArrayArray1[local22][local25] != null) {
						@Pc(50) Class141 local50 = this.aClass141ArrayArray1[local22][local25];
						if (local50.aShort45 != -1 && (local50.aByte41 & 0x2) == 0 && local50.anInt4155 == 0) {
							local68 = this.aClass2_Sub2_10.method3345(local50.aShort45);
							arg5.method2968(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static194.method3677(local68, local50.anInt4153), Static194.method3677(local68, local50.anInt4152), Static194.method3677(local68, local50.anInt4154));
							arg5.method2968(local20, local20, local20 - 4, local16, local16 + 4, local16, Static194.method3677(local68, local50.anInt4151), Static194.method3677(local68, local50.anInt4154), Static194.method3677(local68, local50.anInt4152));
						} else if (local50.anInt4155 == 0) {
							arg5.method2959(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4153, local50.anInt4152, local50.anInt4154);
							arg5.method2959(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4151, local50.anInt4154, local50.anInt4152);
						} else {
							local68 = local50.anInt4155;
							arg5.method2959(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static160.method3019(local68, local50.anInt4153 & 0xFF000000), Static160.method3019(local68, local50.anInt4152 & 0xFF000000), Static160.method3019(local68, local50.anInt4154 & 0xFF000000));
							arg5.method2959(local20, local20, local20 - 4, local16, local16 + 4, local16, Static160.method3019(local68, local50.anInt4151 & 0xFF000000), Static160.method3019(local68, local50.anInt4154 & 0xFF000000), Static160.method3019(local68, local50.anInt4152 & 0xFF000000));
						}
					} else if (this.aClass54ArrayArray1[local22][local25] != null) {
						@Pc(259) Class54 local259 = this.aClass54ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort13; local68++) {
							arg6[local68] = local16 + (local259.aShortArray24[local68] - local22 * this.anInt6200) * 4 / this.anInt6200;
							arg7[local68] = local20 - (local259.aShortArray22[local68] - local25 * this.anInt6200) * 4 / this.anInt6200;
						}
						for (@Pc(307) int local307 = 0; local307 < local259.aShort14; local307++) {
							@Pc(312) int local312 = local307 * 3;
							@Pc(316) int local316 = local312 + 1;
							@Pc(320) int local320 = local316 + 1;
							@Pc(324) int local324 = arg6[local312];
							@Pc(328) int local328 = arg6[local316];
							@Pc(332) int local332 = arg6[local320];
							@Pc(336) int local336 = arg7[local312];
							@Pc(340) int local340 = arg7[local316];
							@Pc(344) int local344 = arg7[local320];
							@Pc(369) int local369;
							if (local259.anIntArray195 != null && local259.anIntArray195[local307] != 0 && (local259.aShortArray23 == null || local259.aShortArray23 != null && local259.aShortArray23[local307] == -1)) {
								local369 = local259.anIntArray195[local307];
								arg5.method2959(local336, local340, local344, local324, local328, local332, Static160.method3019(local369, -(local259.anIntArray194[local312] & -16777216) - 16777216), Static160.method3019(local369, -(local259.anIntArray194[local316] & -16777216) - 16777216), Static160.method3019(local369, -(local259.anIntArray194[local320] & -16777216) - 16777216));
							} else if (local259.aShortArray23 == null || local259.aShortArray23[local307] == -1) {
								arg5.method2959(local336, local340, local344, local324, local328, local332, local259.anIntArray194[local312], local259.anIntArray194[local316], local259.anIntArray194[local320]);
							} else {
								local369 = this.aClass2_Sub2_10.method3345(local259.aShortArray23[local307]);
								arg5.method2968(local336, local340, local344, local324, local328, local332, local369, local369, local369);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean271 = true;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method5432(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class109 local4 = this.aClass2_Sub2_10.method3348(Thread.currentThread());
		@Pc(7) Class106 local7 = local4.aClass106_1;
		local7.anInt3124 = 0;
		local7.aBoolean272 = false;
		if (this.aClass141ArrayArray1 != null) {
			this.method5439(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray383, local4.anIntArray397);
		} else if (this.aClass34ArrayArray1 != null) {
			this.method5435(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray383, local4.anIntArray397);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!ek;)Lclient!ek;")
	@Override
	public Class1_Sub1_Sub8 method5429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub8 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I")
	@Override
	public int method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray61[arg0][arg1];
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(Lclient!ek;IIIIZ)V")
	@Override
	public void method5426(@OriginalArg(0) Class1_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
	@Override
	public void method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		if (this.aClass34ArrayArray1 == null) {
			this.aClass34ArrayArray1 = new Class34[super.anInt6179][super.anInt6185];
			this.aClass149ArrayArray1 = new Class149[super.anInt6179][super.anInt6185];
		} else if (this.aClass141ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg5[local57]];
				local70 = arg4[arg5[local57]];
				if (local64 != 0 && local64 != this.anInt6200 || local70 != 0 && local70 != this.anInt6200) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class149 local95 = new Class149();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg8.length;
			local95.aShort59 = local99;
			local95.aShortArray72 = new short[local99];
			local95.anIntArray575 = new int[local99];
			local95.anIntArray573 = new int[local99];
			local95.anIntArray574 = new int[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray72[local124] = (short) (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				} else if (local129 == 0 && local133 == this.anInt6200) {
					local95.aShortArray72[local124] = (short) (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				} else if (local129 == this.anInt6200 && local133 == this.anInt6200) {
					local95.aShortArray72[local124] = (short) (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				} else if (local129 == this.anInt6200 && local133 == 0) {
					local95.aShortArray72[local124] = (short) (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]) * (this.anInt6200 - local129) + (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]) * (this.anInt6200 - local129) + (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray72[local124] = (short) (local288 * (this.anInt6200 - local133) + local335 * local133 >> this.anInt6201 * 2);
				}
				local288 = (arg0 << this.anInt6201) + local129;
				local335 = (arg1 << this.anInt6201) + local133;
				local95.anIntArray575[local124] = local288;
				local95.anIntArray574[local124] = local335;
				local95.anIntArray573[local124] = this.method5433(local288, local335) + (arg3 == null ? 0 : arg3[local124]);
				if (local95.aShortArray72[local124] < 2) {
					local95.aShortArray72[local124] = 2;
				}
			}
			@Pc(412) boolean local412 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg8[local288] >= 0 || arg9 != null && arg9[local288] >= 0) {
					local133++;
				}
				if (arg10[local288] != -1 && !this.aClass2_Sub2_10.anInterface7_6.method2788(arg10[local288]).aBoolean570) {
					local412 = true;
				}
			}
			local95.anIntArray571 = new int[local133];
			if (arg9 != null) {
				local95.anIntArray572 = new int[local133];
			}
			local95.aShortArray70 = new short[local133];
			local95.aShortArray69 = new short[local133];
			local95.aShortArray74 = new short[local133];
			if (local412) {
				local95.aShortArray73 = new short[local133];
				local95.aShortArray71 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg8[local335] >= 0 || arg9 != null && arg9[local335] >= 0) {
					if (arg8[local335] >= 0) {
						local95.anIntArray571[local95.aShort58] = Static198.method3729(arg8[local335]);
					} else {
						local95.anIntArray571[local95.aShort58] = -1;
					}
					if (arg9 != null) {
						if (arg9[local335] == -1) {
							local95.anIntArray572[local95.aShort58] = -1;
						} else {
							local95.anIntArray572[local95.aShort58] = Static198.method3729(arg9[local335]);
						}
					}
					local95.aShortArray70[local95.aShort58] = (short) arg5[local335];
					local95.aShortArray69[local95.aShort58] = (short) arg6[local335];
					local95.aShortArray74[local95.aShort58] = (short) arg7[local335];
					if (local412) {
						if (arg10[local335] == -1 || this.aClass2_Sub2_10.anInterface7_6.method2788(arg10[local335]).aBoolean570) {
							local95.aShortArray73[local95.aShort58] = -1;
						} else {
							local95.aShortArray73[local95.aShort58] = (short) arg10[local335];
							local95.aShortArray71[local95.aShort58] = (short) arg11[local335];
						}
					}
					local95.aShort58++;
				}
			}
			this.aClass149ArrayArray1[arg0][arg1] = local95;
		} else if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
			@Pc(641) Class34 local641 = new Class34();
			local64 = arg8[0];
			local70 = arg10[0];
			if (arg9 != null) {
				local641.anInt1238 = Static194.method3677(Static198.method3729(arg9[0]), this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				if (local64 == -1) {
					local641.aByte11 = (byte) (local641.aByte11 | 0x2);
				}
			}
			if (this.anIntArrayArray61[arg0][arg1] == this.anIntArrayArray61[arg0 + 1][arg1] && this.anIntArrayArray61[arg0][arg1] == this.anIntArrayArray61[arg0 + 1][arg1 + 1] && this.anIntArrayArray61[arg0][arg1] == this.anIntArrayArray61[arg0][arg1 + 1]) {
				local641.aByte11 = (byte) (local641.aByte11 | 0x1);
			}
			if (local70 == -1 || (local641.aByte11 & 0x2) != 0 || this.aClass2_Sub2_10.anInterface7_6.method2788(local70).aBoolean570) {
				@Pc(842) short local842 = Static198.method3729(local64);
				local641.aShort10 = (short) Static194.method3677(local842, this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				local641.aShort9 = (short) Static194.method3677(local842, this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				local641.aShort12 = (short) Static194.method3677(local842, this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				local641.aShort11 = (short) Static194.method3677(local842, this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				local641.aShort8 = -1;
			} else {
				local641.aShort10 = (short) (this.aByteArrayArray19[arg0][arg1] - this.aByteArrayArray20[arg0][arg1]);
				local641.aShort9 = (short) (this.aByteArrayArray19[arg0 + 1][arg1] - this.aByteArrayArray20[arg0 + 1][arg1]);
				local641.aShort12 = (short) (this.aByteArrayArray19[arg0 + 1][arg1 + 1] - this.aByteArrayArray20[arg0 + 1][arg1 + 1]);
				local641.aShort11 = (short) (this.aByteArrayArray19[arg0][arg1 + 1] - this.aByteArrayArray20[arg0][arg1 + 1]);
				local641.aShort8 = (short) local70;
			}
			this.aClass34ArrayArray1[arg0][arg1] = local641;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!vb;[I)V")
	@Override
	public void method5423(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
	@Override
	public void method5427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray20[arg0][arg1] < arg2) {
			this.aByteArrayArray20[arg0][arg1] = (byte) arg2;
		}
	}
}
