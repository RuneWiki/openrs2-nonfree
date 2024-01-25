import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	private int anInt5310;

	@OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
	private int anInt5311;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "[[Lclient!ph;")
	private Class188[][] aClass188ArrayArray1;

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
	private int anInt5313;

	@OriginalMember(owner = "client!ot", name = "s", descriptor = "[[Lclient!jt;")
	private Class125[][] aClass125ArrayArray1;

	@OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
	private int anInt5316;

	@OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
	private int anInt5317;

	@OriginalMember(owner = "client!ot", name = "x", descriptor = "I")
	private int anInt5318;

	@OriginalMember(owner = "client!ot", name = "y", descriptor = "[[Lclient!fs;")
	private Class83[][] aClass83ArrayArray1;

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "I")
	private int anInt5319;

	@OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
	private int anInt5320;

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
	private int anInt5321;

	@OriginalMember(owner = "client!ot", name = "C", descriptor = "[[Lclient!rh;")
	private Class215[][] aClass215ArrayArray1;

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
	private int anInt5323;

	@OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
	private int anInt5322 = -1;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!o;")
	private final Class172_Sub1 aClass172_Sub1_9;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
	private final int anInt5314;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "[[I")
	public final int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ot", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lclient!o;IIII[[I[[II)V")
	public Class159_Sub1(@OriginalArg(0) Class172_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass172_Sub1_9 = arg0;
		this.anInt5314 = arg2;
		this.anIntArrayArray35 = arg5;
		this.aByteArrayArray14 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass172_Sub1_9.anInt5176 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass172_Sub1_9.anInt5162 * local92 + this.aClass172_Sub1_9.anInt5171 * local98 + this.aClass172_Sub1_9.anInt5154 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray14[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray13 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIZLclient!kp;[I[I[I)V")
	private void method4158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class135 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class215 local6 = this.aClass215ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(268) int local268;
		@Pc(324) int local324;
		@Pc(380) int local380;
		@Pc(436) int local436;
		@Pc(296) int local296;
		@Pc(352) int local352;
		@Pc(408) int local408;
		@Pc(464) int local464;
		@Pc(257) int local257;
		@Pc(313) int local313;
		@Pc(369) int local369;
		@Pc(425) int local425;
		@Pc(285) int local285;
		@Pc(341) int local341;
		@Pc(397) int local397;
		@Pc(453) int local453;
		@Pc(82) int local82;
		@Pc(105) int local105;
		@Pc(128) int local128;
		@Pc(151) int local151;
		@Pc(36) int local36;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(42) int local42;
		@Pc(176) int local176;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(240) int local240;
		@Pc(501) int local501;
		@Pc(642) int local642;
		if (local6 == null) {
			@Pc(1452) Class188 local1452 = this.aClass188ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt5322 == -1) {
					for (local436 = 0; local436 < local1452.aShort81; local436++) {
						local24 = local1452.aShortArray101[local436] + (arg0 << super.anInt6193);
						local29 = local1452.aShortArray104[local436];
						local34 = local1452.aShortArray105[local436] + (arg1 << super.anInt6193);
						local380 = this.anInt5310 + (this.anInt5313 * local24 + this.anInt5316 * local29 + this.anInt5312 * local34 >> 15);
						if (local380 <= this.aClass172_Sub1_9.anInt5163) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass172_Sub1_9.anInt5166;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray100[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass172_Sub1_9.aBoolean454) {
							local296 = local380 - this.aClass172_Sub1_9.anInt5166;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local29 + this.anInt5317 * local34 >> 15);
						local324 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local29 + this.anInt5315 * local34 >> 15);
						arg4[local436] = arg3.anInt4091 + local268 * this.aClass172_Sub1_9.anInt5152 / local380;
						arg5[local436] = arg3.anInt4095 + local324 * this.aClass172_Sub1_9.anInt5167 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort81; local436++) {
						local24 = local1452.aShortArray101[local436] + (arg0 << super.anInt6193);
						local29 = local1452.aShortArray104[local436];
						local34 = local1452.aShortArray105[local436] + (arg1 << super.anInt6193);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt5322 - this.aClass172_Sub1_9.anInt5166;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray100[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass172_Sub1_9.aBoolean454) {
							local296 = this.anInt5322 - this.aClass172_Sub1_9.anInt5166;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local29 + this.anInt5317 * local34 >> 15);
						local324 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local29 + this.anInt5315 * local34 >> 15);
						arg4[local436] = arg3.anInt4091 + local268 * this.aClass172_Sub1_9.anInt5152 / this.anInt5322;
						arg5[local436] = arg3.anInt4095 + local324 * this.aClass172_Sub1_9.anInt5167 / this.anInt5322;
					}
				}
				if (local1452.aShortArray103 != null) {
					local436 = this.anIntArrayArray35[arg0][arg1];
					local296 = this.anIntArrayArray35[arg0 + 1][arg1];
					local352 = this.anIntArrayArray35[arg0][arg1 + 1];
					local408 = arg0 * super.anInt6190;
					local464 = local408 + super.anInt6190;
					local257 = arg1 * super.anInt6190;
					local313 = local257 + super.anInt6190;
					local369 = this.anInt5323 + (this.anInt5311 * local408 + this.anInt5318 * local436 + this.anInt5317 * local257 >> 15);
					local425 = this.anInt5320 + (this.anInt5319 * local408 + this.anInt5321 * local436 + this.anInt5315 * local257 >> 15);
					local285 = this.anInt5310 + (this.anInt5313 * local408 + this.anInt5316 * local436 + this.anInt5312 * local257 >> 15);
					local341 = this.anInt5323 + (this.anInt5311 * local464 + this.anInt5318 * local296 + this.anInt5317 * local257 >> 15);
					local397 = this.anInt5320 + (this.anInt5319 * local464 + this.anInt5321 * local296 + this.anInt5315 * local257 >> 15);
					local453 = this.anInt5310 + (this.anInt5313 * local464 + this.anInt5316 * local296 + this.anInt5312 * local257 >> 15);
					local82 = this.anInt5323 + (this.anInt5311 * local408 + this.anInt5318 * local352 + this.anInt5317 * local313 >> 15);
					local105 = this.anInt5320 + (this.anInt5319 * local408 + this.anInt5321 * local352 + this.anInt5315 * local313 >> 15);
					local128 = this.anInt5310 + (this.anInt5313 * local408 + this.anInt5316 * local352 + this.anInt5312 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort80; local151++) {
						local36 = local151 * 3;
						local38 = local36 + 1;
						local40 = local38 + 1;
						local42 = arg4[local36];
						local176 = arg4[local38];
						local56 = arg4[local40];
						local65 = arg5[local36];
						local240 = arg5[local38];
						local501 = arg5[local40];
						local642 = arg6[local36] + arg6[local38] + arg6[local40];
						if ((local42 - local176) * (local501 - local240) - (local65 - local240) * (local56 - local176) > 0) {
							arg3.aBoolean350 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt4093 || local176 > arg3.anInt4093 || local56 > arg3.anInt4093;
							@Pc(2138) short local2138 = local1452.aShortArray103[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method4162(this.aClass172_Sub1_9.anInterface5_8.method3918(local2138).aByte46)) {
									arg3.anInt4092 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method3273(local65, local240, local501, local42, local176, local56, this.aClass172_Sub1_9.anInt5148, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray367[local36], local1452.anIntArray367[local38], local1452.anIntArray367[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray367[local36] & 0xFFFFFF) != 0) {
										arg3.method3272(local65, local240, local501, local42, local176, local56, Static101.method5332(arg6[local36] << 24 | this.aClass172_Sub1_9.anInt5148, local1452.anIntArray367[local36]), Static101.method5332(arg6[local38] << 24 | this.aClass172_Sub1_9.anInt5148, local1452.anIntArray367[local38]), Static101.method5332(arg6[local40] << 24 | this.aClass172_Sub1_9.anInt5148, local1452.anIntArray367[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method3276(local65, local240, local501, local42, local176, local56, local1452.anIntArray367[local36], local1452.anIntArray367[local38], local1452.anIntArray367[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray367[local36] & 0xFFFFFF) != 0) {
									arg3.method3272(local65, local240, local501, local42, local176, local56, local1452.anIntArray367[local36], local1452.anIntArray367[local38], local1452.anIntArray367[local40]);
								}
								arg3.anInt4092 = 0;
							} else {
								arg3.method3278(local65, local240, local501, local42, local176, local56, this.aClass172_Sub1_9.anInt5148);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort80; local436++) {
					local296 = local436 * 3;
					local352 = local296 + 1;
					local408 = local352 + 1;
					local464 = arg4[local296];
					local257 = arg4[local352];
					local313 = arg4[local408];
					local369 = arg5[local296];
					local425 = arg5[local352];
					local285 = arg5[local408];
					local341 = arg6[local296] + arg6[local352] + arg6[local408];
					if ((local464 - local257) * (local285 - local425) - (local369 - local425) * (local313 - local257) > 0) {
						arg3.aBoolean350 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt4093 || local257 > arg3.anInt4093 || local313 > arg3.anInt4093;
						if (local341 >= 765) {
							arg3.method3278(local369, local425, local285, local464, local257, local313, this.aClass172_Sub1_9.anInt5148);
						} else if (local341 > 0) {
							if ((local1452.anIntArray367[local296] & 0xFFFFFF) != 0) {
								arg3.method3272(local369, local425, local285, local464, local257, local313, Static410.method5285(arg6[local296], local1452.anIntArray367[local296], this.aClass172_Sub1_9.anInt5148), Static410.method5285(arg6[local352], local1452.anIntArray367[local352], this.aClass172_Sub1_9.anInt5148), Static410.method5285(arg6[local408], local1452.anIntArray367[local408], this.aClass172_Sub1_9.anInt5148));
							}
						} else if ((local1452.anIntArray367[local296] & 0xFFFFFF) != 0) {
							arg3.method3272(local369, local425, local285, local464, local257, local313, local1452.anIntArray367[local296], local1452.anIntArray367[local352], local1452.anIntArray367[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte93 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6190;
			local24 = local19 + super.anInt6190;
			local29 = arg1 * super.anInt6190;
			local34 = local29 + super.anInt6190;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte93 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray35[arg0][arg1];
				local65 = this.anIntArrayArray35[arg0 + 1][arg1];
				local240 = this.anIntArrayArray35[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray35[arg0][arg1 + 1];
				if (this.anInt5322 == -1) {
					local82 = this.anInt5310 + (this.anInt5313 * local19 + this.anInt5316 * local56 + this.anInt5312 * local29 >> 15);
					if (local82 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local105 = this.anInt5310 + (this.anInt5313 * local24 + this.anInt5316 * local65 + this.anInt5312 * local29 >> 15);
					if (local105 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local128 = this.anInt5310 + (this.anInt5313 * local24 + this.anInt5316 * local240 + this.anInt5312 * local34 >> 15);
					if (local128 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local151 = this.anInt5310 + (this.anInt5313 * local19 + this.anInt5316 * local501 + this.anInt5312 * local34 >> 15);
					if (local151 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
				} else {
					local151 = this.anInt5322;
					local128 = this.anInt5322;
					local105 = this.anInt5322;
					local82 = this.anInt5322;
				}
				if (arg2) {
					local176 = local82 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort85 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort84 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort83 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort86 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass172_Sub1_9.aBoolean454) {
					local176 = local82 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt5323 + (this.anInt5311 * local19 + this.anInt5318 * local56 + this.anInt5317 * local29 >> 15);
				local268 = arg3.anInt4091 + local257 * this.aClass172_Sub1_9.anInt5152 / local82;
				local285 = this.anInt5320 + (this.anInt5319 * local19 + this.anInt5321 * local56 + this.anInt5315 * local29 >> 15);
				local296 = arg3.anInt4095 + local285 * this.aClass172_Sub1_9.anInt5167 / local82;
				local313 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local65 + this.anInt5317 * local29 >> 15);
				local324 = arg3.anInt4091 + local313 * this.aClass172_Sub1_9.anInt5152 / local105;
				local341 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local65 + this.anInt5315 * local29 >> 15);
				local352 = arg3.anInt4095 + local341 * this.aClass172_Sub1_9.anInt5167 / local105;
				local369 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local240 + this.anInt5317 * local34 >> 15);
				local380 = arg3.anInt4091 + local369 * this.aClass172_Sub1_9.anInt5152 / local128;
				local397 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local240 + this.anInt5315 * local34 >> 15);
				local408 = arg3.anInt4095 + local397 * this.aClass172_Sub1_9.anInt5167 / local128;
				local425 = this.anInt5323 + (this.anInt5311 * local19 + this.anInt5318 * local501 + this.anInt5317 * local34 >> 15);
				local436 = arg3.anInt4091 + local425 * this.aClass172_Sub1_9.anInt5152 / local151;
				local453 = this.anInt5320 + (this.anInt5319 * local19 + this.anInt5321 * local501 + this.anInt5315 * local34 >> 15);
				local464 = arg3.anInt4095 + local453 * this.aClass172_Sub1_9.anInt5167 / local151;
			} else {
				local56 = this.anIntArrayArray35[arg0][arg1];
				if (this.anInt5322 == -1) {
					local65 = this.anInt5316 * local56;
					local82 = this.anInt5310 + (this.anInt5313 * local19 + local65 + this.anInt5312 * local29 >> 15);
					if (local82 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local105 = this.anInt5310 + (this.anInt5313 * local24 + local65 + this.anInt5312 * local29 >> 15);
					if (local105 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local128 = this.anInt5310 + (this.anInt5313 * local24 + local65 + this.anInt5312 * local34 >> 15);
					if (local128 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local151 = this.anInt5310 + (this.anInt5313 * local19 + local65 + this.anInt5312 * local34 >> 15);
					if (local151 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
				} else {
					local151 = this.anInt5322;
					local128 = this.anInt5322;
					local105 = this.anInt5322;
					local82 = this.anInt5322;
				}
				if (this.aClass172_Sub1_9.aBoolean454) {
					local176 = local82 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass172_Sub1_9.anInt5166;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt5318 * local56;
				local240 = this.anInt5321 * local56;
				local257 = this.anInt5323 + (this.anInt5311 * local19 + local65 + this.anInt5317 * local29 >> 15);
				local268 = arg3.anInt4091 + local257 * this.aClass172_Sub1_9.anInt5152 / local82;
				local285 = this.anInt5320 + (this.anInt5319 * local19 + local240 + this.anInt5315 * local29 >> 15);
				local296 = arg3.anInt4095 + local285 * this.aClass172_Sub1_9.anInt5167 / local82;
				local313 = this.anInt5323 + (this.anInt5311 * local24 + local65 + this.anInt5317 * local29 >> 15);
				local324 = arg3.anInt4091 + local313 * this.aClass172_Sub1_9.anInt5152 / local105;
				local341 = this.anInt5320 + (this.anInt5319 * local24 + local240 + this.anInt5315 * local29 >> 15);
				local352 = arg3.anInt4095 + local341 * this.aClass172_Sub1_9.anInt5167 / local105;
				local369 = this.anInt5323 + (this.anInt5311 * local24 + local65 + this.anInt5317 * local34 >> 15);
				local380 = arg3.anInt4091 + local369 * this.aClass172_Sub1_9.anInt5152 / local128;
				local397 = this.anInt5320 + (this.anInt5319 * local24 + local240 + this.anInt5315 * local34 >> 15);
				local408 = arg3.anInt4095 + local397 * this.aClass172_Sub1_9.anInt5167 / local128;
				local425 = this.anInt5323 + (this.anInt5311 * local19 + local65 + this.anInt5317 * local34 >> 15);
				local436 = arg3.anInt4091 + local425 * this.aClass172_Sub1_9.anInt5152 / local151;
				local453 = this.anInt5320 + (this.anInt5319 * local19 + local240 + this.anInt5315 * local34 >> 15);
				local464 = arg3.anInt4095 + local453 * this.aClass172_Sub1_9.anInt5167 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort82 != -1 && this.method4162(this.aClass172_Sub1_9.anInterface5_8.method3918(local6.aShort82).aByte46);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean350 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt4093 || local436 > arg3.anInt4093 || local324 > arg3.anInt4093;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4092 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort82 >= 0) {
							arg3.method3273(local408, local464, local352, local380, local436, local324, this.aClass172_Sub1_9.anInt5148, local40, local42, local38, local6.anInt5902, local6.anInt5903, local6.anInt5904, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort82);
						} else {
							arg3.method3272(local408, local464, local352, local380, local436, local324, Static101.method5332(local40 << 24 | this.aClass172_Sub1_9.anInt5148, local6.anInt5902), Static101.method5332(local42 << 24 | this.aClass172_Sub1_9.anInt5148, local6.anInt5903), Static101.method5332(local38 << 24 | this.aClass172_Sub1_9.anInt5148, local6.anInt5904));
						}
					} else if (local6.aShort82 >= 0) {
						arg3.method3276(local408, local464, local352, local380, local436, local324, local6.anInt5902, local6.anInt5903, local6.anInt5904, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort82);
					} else {
						arg3.method3272(local408, local464, local352, local380, local436, local324, local6.anInt5902, local6.anInt5903, local6.anInt5904);
					}
					arg3.anInt4092 = 0;
				} else {
					arg3.method3278(local408, local464, local352, local380, local436, local324, this.aClass172_Sub1_9.anInt5148);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean350 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt4093 || local324 > arg3.anInt4093 || local436 > arg3.anInt4093;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt4092 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort82 >= 0) {
							arg3.method3273(local296, local352, local464, local268, local324, local436, this.aClass172_Sub1_9.anInt5148, local36, local38, local42, local6.anInt5906, local6.anInt5904, local6.anInt5903, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort82);
						} else {
							arg3.method3272(local296, local352, local464, local268, local324, local436, Static101.method5332(local36 << 24 | this.aClass172_Sub1_9.anInt5148, local6.anInt5906), Static101.method5332(local38 << 24 | this.aClass172_Sub1_9.anInt5148, local6.anInt5904), Static101.method5332(local42 << 24 | this.aClass172_Sub1_9.anInt5148, local6.anInt5903));
						}
					} else if (local6.aShort82 >= 0) {
						arg3.method3276(local296, local352, local464, local268, local324, local436, local6.anInt5906, local6.anInt5904, local6.anInt5903, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort82);
					} else {
						arg3.method3272(local296, local352, local464, local268, local324, local436, local6.anInt5906, local6.anInt5904, local6.anInt5903);
					}
					arg3.anInt4092 = 0;
					return;
				}
				arg3.method3278(local296, local352, local464, local268, local324, local436, this.aClass172_Sub1_9.anInt5148);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!fk;[I)V")
	@Override
	public void method4835(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!ot", name = "SA", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void SA(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ot", name = "va", descriptor = "(II)I")
	@Override
	public int va(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt6193;
		@Pc(9) int local9 = arg1 >> super.anInt6193;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6189 - 1 || local9 > super.anInt6192 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt6190 - 1;
		@Pc(41) int local41 = arg1 & super.anInt6190 - 1;
		@Pc(67) int local67 = this.anIntArrayArray35[local4][local9] * (super.anInt6190 - local34) + this.anIntArrayArray35[local4 + 1][local9] * local34 >> super.anInt6193;
		@Pc(97) int local97 = this.anIntArrayArray35[local4][local9 + 1] * (super.anInt6190 - local34) + this.anIntArrayArray35[local4 + 1][local9 + 1] * local34 >> super.anInt6193;
		return local67 * (super.anInt6190 - local41) + local97 * local41 >> super.anInt6193;
	}

	@OriginalMember(owner = "client!ot", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass215ArrayArray1 == null) {
			this.aClass215ArrayArray1 = new Class215[super.anInt6189][super.anInt6192];
			this.aClass188ArrayArray1 = new Class188[super.anInt6189][super.anInt6192];
		} else if (this.aClass83ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static300.anIntArray364[Static72.method1421(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static300.anIntArray364[Static72.method1421(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
					if (local104 != -1 && arg6[local104] != arg6[local116]) {
						local102 = false;
						break;
					}
					local104 = local116;
				} else if (arg2[local116] == super.anInt6190 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt6190 && arg4[local116] == super.anInt6190) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt6190) {
					if (local110 != -1 && arg6[local110] != arg6[local116]) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt6190 && arg2[local244] != arg2[0] - super.anInt6190) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt6190 && arg4[local244] != arg4[0] - super.anInt6190) {
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
		@Pc(527) int local527;
		if (local102) {
			@Pc(334) Class215 local334 = new Class215();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt5905 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte93 = (byte) (local334.aByte93 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray35[arg0][arg1] == this.anIntArrayArray35[arg0 + 1][arg1] && this.anIntArrayArray35[arg0][arg1] == this.anIntArrayArray35[arg0 + 1][arg1 + 1] && this.anIntArrayArray35[arg0][arg1] == this.anIntArrayArray35[arg0][arg1 + 1]) {
				local334.aByte93 = (byte) (local334.aByte93 | 0x1);
			}
			if (local342 == -1 || (local334.aByte93 & 0x2) != 0 || this.aClass172_Sub1_9.anInterface5_8.method3918(local342).aBoolean207) {
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local104] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5906 = Static410.method5285(local527, Static461.method4160(arg6[local104] >> 8, this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]), arg10);
				if (local334.anInt5905 != 0) {
					local334.anInt5906 |= this.aByteArrayArray13[arg0][arg1] + 255 - this.aByteArrayArray14[arg0][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local106] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5904 = Static410.method5285(local527, Static461.method4160(arg6[local106] >> 8, this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]), arg10);
				if (local334.anInt5905 != 0) {
					local334.anInt5904 |= this.aByteArrayArray13[arg0 + 1][arg1] + 255 - this.aByteArrayArray14[arg0 + 1][arg1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local108] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5902 = Static410.method5285(local527, Static461.method4160(arg6[local108] >> 8, this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt5905 != 0) {
					local334.anInt5902 |= this.aByteArrayArray13[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray14[arg0 + 1][arg1 + 1] << 25;
				}
				if (arg5 == null || arg11 == 0) {
					local527 = 0;
				} else {
					local527 = arg5[local110] * 255 / arg11;
					if (local527 < 0) {
						local527 = 0;
					} else if (local527 > 255) {
						local527 = 255;
					}
				}
				local334.anInt5903 = Static410.method5285(local527, Static461.method4160(arg6[local110] >> 8, this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]), arg10);
				if (local334.anInt5905 != 0) {
					local334.anInt5903 |= this.aByteArrayArray13[arg0][arg1 + 1] + 255 - this.aByteArrayArray14[arg0][arg1 + 1] << 25;
				}
				local334.aShort82 = -1;
			} else {
				local334.anInt5906 = this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1];
				local334.anInt5904 = this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1];
				local334.anInt5902 = this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1];
				local334.anInt5903 = this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1];
				local334.aShort82 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort83 = (short) arg5[local108];
				local334.aShort86 = (short) arg5[local110];
				local334.aShort84 = (short) arg5[local106];
				local334.aShort85 = (short) arg5[local104];
			}
			this.aClass215ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class188 local888 = new Class188();
		local888.aShort81 = (short) arg2.length;
		local888.aShort80 = (short) (arg2.length / 3);
		local888.aShortArray101 = new short[local888.aShort81];
		local888.aShortArray104 = new short[local888.aShort81];
		local888.aShortArray105 = new short[local888.aShort81];
		local888.anIntArray367 = new int[local888.aShort81];
		if (arg5 != null) {
			local888.aShortArray100 = new short[local888.aShort81];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort81; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt6190) {
				local958 = this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1];
			} else if (local342 == super.anInt6190 && local527 == super.anInt6190) {
				local958 = this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt6190 && local527 == 0) {
				local958 = this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]) * (super.anInt6190 - local342) + (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]) * (super.anInt6190 - local342) + (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt6190 - local527) + local1126 * local527 >> super.anInt6193 * 2;
			}
			local1079 = (arg0 << super.anInt6193) + local342;
			local1126 = (arg1 << super.anInt6193) + local527;
			local888.aShortArray101[local244] = (short) local342;
			local888.aShortArray105[local244] = (short) local527;
			local888.aShortArray104[local244] = (short) (this.va(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass172_Sub1_9.anInterface5_8.method3918(arg8[local244]).aBoolean207) {
				local888.anIntArray367[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray100[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray367[local244] = Static410.method5285(local1226, Static461.method4160(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray367[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray367[local244] = 0;
			} else {
				local888.anIntArray367[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort80; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass172_Sub1_9.anInterface5_8.method3918(arg8[local527 * 3]).aBoolean207) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray366 = new int[local888.aShort80];
		}
		if (local1296) {
			local888.aShortArray103 = new short[local888.aShort80];
			local888.aShortArray102 = new short[local888.aShort80];
		}
		for (local958 = 0; local958 < local888.aShort80; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray366[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aBoolean207) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aBoolean207) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aBoolean207) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray103[local958] = (short) local1384;
					local888.aShortArray102[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aBoolean207) {
							local888.anIntArray367[local1079] = Static300.anIntArray364[Static72.method1421(this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aShort47 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aBoolean207) {
							local888.anIntArray367[local1126] = Static300.anIntArray364[Static72.method1421(this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aShort47 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aBoolean207) {
							local888.anIntArray367[local1226] = Static300.anIntArray364[Static72.method1421(this.aClass172_Sub1_9.anInterface5_8.method3918(local1384).aShort47 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray103[local958] = -1;
				}
			}
		}
		this.aClass188ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII[[ZLclient!kp;[I[I)V")
	private void method4159(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class135 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean351 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass215ArrayArray1[local22][local25] != null) {
						@Pc(50) Class215 local50 = this.aClass215ArrayArray1[local22][local25];
						if (local50.aShort82 != -1 && (local50.aByte93 & 0x2) == 0 && local50.anInt5905 == 0) {
							local68 = this.aClass172_Sub1_9.method4029(local50.aShort82);
							arg5.method3274(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static376.method4929(local68, local50.anInt5902), Static376.method4929(local68, local50.anInt5903), Static376.method4929(local68, local50.anInt5904));
							arg5.method3274(local20, local20, local20 - 4, local16, local16 + 4, local16, Static376.method4929(local68, local50.anInt5906), Static376.method4929(local68, local50.anInt5904), Static376.method4929(local68, local50.anInt5903));
						} else if (local50.anInt5905 == 0) {
							arg5.method3272(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5902, local50.anInt5903, local50.anInt5904);
							arg5.method3272(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5906, local50.anInt5904, local50.anInt5903);
						} else {
							local68 = local50.anInt5905;
							arg5.method3272(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static101.method5332(local50.anInt5902 & 0xFF000000, local68), Static101.method5332(local50.anInt5903 & 0xFF000000, local68), Static101.method5332(local50.anInt5904 & 0xFF000000, local68));
							arg5.method3272(local20, local20, local20 - 4, local16, local16 + 4, local16, Static101.method5332(local50.anInt5906 & 0xFF000000, local68), Static101.method5332(local50.anInt5904 & 0xFF000000, local68), Static101.method5332(local50.anInt5903 & 0xFF000000, local68));
						}
					} else if (this.aClass188ArrayArray1[local22][local25] != null) {
						@Pc(259) Class188 local259 = this.aClass188ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort81; local68++) {
							arg6[local68] = local16 + local259.aShortArray101[local68] * 4 / super.anInt6190;
							arg7[local68] = local20 - local259.aShortArray105[local68] * 4 / super.anInt6190;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort80; local297++) {
							@Pc(302) int local302 = local297 * 3;
							@Pc(306) int local306 = local302 + 1;
							@Pc(310) int local310 = local306 + 1;
							@Pc(314) int local314 = arg6[local302];
							@Pc(318) int local318 = arg6[local306];
							@Pc(322) int local322 = arg6[local310];
							@Pc(326) int local326 = arg7[local302];
							@Pc(330) int local330 = arg7[local306];
							@Pc(334) int local334 = arg7[local310];
							@Pc(359) int local359;
							if (local259.anIntArray366 != null && local259.anIntArray366[local297] != 0 && (local259.aShortArray103 == null || local259.aShortArray103 != null && local259.aShortArray103[local297] == -1)) {
								local359 = local259.anIntArray366[local297];
								arg5.method3272(local326, local330, local334, local314, local318, local322, Static101.method5332(-(local259.anIntArray367[local302] & -16777216) - 16777216, local359), Static101.method5332(-(local259.anIntArray367[local306] & -16777216) - 16777216, local359), Static101.method5332(-(local259.anIntArray367[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray103 == null || local259.aShortArray103[local297] == -1) {
								arg5.method3272(local326, local330, local334, local314, local318, local322, local259.anIntArray367[local302], local259.anIntArray367[local306], local259.anIntArray367[local310]);
							} else {
								local359 = this.aClass172_Sub1_9.method4029(local259.aShortArray103[local297]);
								arg5.method3274(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean351 = true;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)V")
	@Override
	public void method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class250 local4 = this.aClass172_Sub1_9.method4030(Thread.currentThread());
		local4.aClass135_2.anInt4092 = 0;
		if (this.aClass215ArrayArray1 != null) {
			this.method4158(arg0, arg1, this.aClass172_Sub1_9.aBoolean452, local4.aClass135_2, local4.anIntArray472, local4.anIntArray477, local4.anIntArray482);
		} else if (this.aClass83ArrayArray1 != null) {
			this.method4161(arg0, arg1, local4.aClass135_2, local4.anIntArray472, local4.anIntArray477, local4.anIntArray482);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass83ArrayArray1 == null) {
			this.aClass83ArrayArray1 = new Class83[super.anInt6189][super.anInt6192];
			this.aClass125ArrayArray1 = new Class125[super.anInt6189][super.anInt6192];
		} else if (this.aClass215ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		@Pc(26) boolean local26 = false;
		@Pc(64) int local64;
		@Pc(70) int local70;
		if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
			local26 = true;
			for (@Pc(57) int local57 = 1; local57 < 2; local57++) {
				local64 = arg2[arg6[local57]];
				local70 = arg4[arg6[local57]];
				if (local64 != 0 && local64 != super.anInt6190 || local70 != 0 && local70 != super.anInt6190) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class125 local95 = new Class125();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort67 = local99;
			local95.aShortArray58 = new short[local99];
			local95.aShortArray55 = new short[local99];
			local95.aShortArray57 = new short[local99];
			local95.aShortArray62 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt6190) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]);
				} else if (local129 == super.anInt6190 && local133 == super.anInt6190) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt6190 && local133 == 0) {
					local95.aShortArray58[local124] = (short) (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]) * (super.anInt6190 - local129) + (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]) * (super.anInt6190 - local129) + (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray58[local124] = (short) (local288 * (super.anInt6190 - local133) + local335 * local133 >> super.anInt6193 * 2);
				}
				local288 = (arg0 << super.anInt6193) + local129;
				local335 = (arg1 << super.anInt6193) + local133;
				local95.aShortArray55[local124] = (short) local129;
				local95.aShortArray62[local124] = (short) local133;
				local95.aShortArray57[local124] = (short) (this.va(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray58[local124] < 2) {
					local95.aShortArray58[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass172_Sub1_9.anInterface5_8.method3918(arg11[local288]).aBoolean207) {
					local415 = true;
				}
			}
			local95.anIntArray251 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray250 = new int[local133];
			}
			local95.aShortArray56 = new short[local133];
			local95.aShortArray60 = new short[local133];
			local95.aShortArray54 = new short[local133];
			if (local415) {
				local95.aShortArray61 = new short[local133];
				local95.aShortArray59 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray251[local95.aShort66] = Static72.method1421(arg9[local335]);
					} else {
						local95.anIntArray251[local95.aShort66] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray250[local95.aShort66] = -1;
						} else {
							local95.anIntArray250[local95.aShort66] = Static72.method1421(arg10[local335]);
						}
					}
					local95.aShortArray56[local95.aShort66] = (short) arg6[local335];
					local95.aShortArray60[local95.aShort66] = (short) arg7[local335];
					local95.aShortArray54[local95.aShort66] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass172_Sub1_9.anInterface5_8.method3918(arg11[local335]).aBoolean207) {
							local95.aShortArray61[local95.aShort66] = -1;
						} else {
							local95.aShortArray61[local95.aShort66] = (short) arg11[local335];
							local95.aShortArray59[local95.aShort66] = (short) arg12[local335];
						}
					}
					local95.aShort66++;
				}
			}
			this.aClass125ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class83 local644 = new Class83();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt2587 = Static376.method4929(Static72.method1421(arg10[0]), this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte48 = (byte) (local644.aByte48 | 0x2);
				}
			}
			if (this.anIntArrayArray35[arg0][arg1] == this.anIntArrayArray35[arg0 + 1][arg1] && this.anIntArrayArray35[arg0][arg1] == this.anIntArrayArray35[arg0 + 1][arg1 + 1] && this.anIntArrayArray35[arg0][arg1] == this.anIntArrayArray35[arg0][arg1 + 1]) {
				local644.aByte48 = (byte) (local644.aByte48 | 0x1);
			}
			if (local70 == -1 || (local644.aByte48 & 0x2) != 0 || this.aClass172_Sub1_9.anInterface5_8.method3918(local70).aBoolean207) {
				@Pc(845) short local845 = Static72.method1421(local64);
				local644.aShort52 = (short) Static376.method4929(local845, this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]);
				local644.aShort51 = (short) Static376.method4929(local845, this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]);
				local644.aShort49 = (short) Static376.method4929(local845, this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]);
				local644.aShort50 = (short) Static376.method4929(local845, this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]);
				local644.aShort48 = -1;
			} else {
				local644.aShort52 = (short) (this.aByteArrayArray14[arg0][arg1] - this.aByteArrayArray13[arg0][arg1]);
				local644.aShort51 = (short) (this.aByteArrayArray14[arg0 + 1][arg1] - this.aByteArrayArray13[arg0 + 1][arg1]);
				local644.aShort49 = (short) (this.aByteArrayArray14[arg0 + 1][arg1 + 1] - this.aByteArrayArray13[arg0 + 1][arg1 + 1]);
				local644.aShort50 = (short) (this.aByteArrayArray14[arg0][arg1 + 1] - this.aByteArrayArray13[arg0][arg1 + 1]);
				local644.aShort48 = (short) local70;
			}
			this.aClass83ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!ot", name = "O", descriptor = "(IILclient!j;)Lclient!j;")
	@Override
	public Class3_Sub4_Sub4 O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub4_Sub4 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4832(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class250 local4 = this.aClass172_Sub1_9.method4030(Thread.currentThread());
		@Pc(7) Class135 local7 = local4.aClass135_2;
		local7.anInt4092 = 0;
		local7.aBoolean350 = false;
		if (this.aClass215ArrayArray1 != null) {
			this.method4159(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray472, local4.anIntArray477);
		} else if (this.aClass83ArrayArray1 != null) {
			this.method4163(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray472, local4.anIntArray477);
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!j;IIIIZ)Z")
	@Override
	public boolean method4831(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILclient!kp;[I[I[I)V")
	private void method4161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class135 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class83 local6 = this.aClass83ArrayArray1[arg0][arg1];
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(194) int local194;
		@Pc(250) int local250;
		@Pc(306) int local306;
		@Pc(362) int local362;
		@Pc(390) int local390;
		@Pc(183) int local183;
		@Pc(239) int local239;
		@Pc(295) int local295;
		@Pc(351) int local351;
		@Pc(211) int local211;
		@Pc(267) int local267;
		@Pc(323) int local323;
		@Pc(379) int local379;
		@Pc(72) int local72;
		@Pc(95) int local95;
		@Pc(118) int local118;
		@Pc(141) int local141;
		@Pc(427) int local427;
		@Pc(222) int local222;
		@Pc(278) int local278;
		@Pc(334) int local334;
		if (local6 == null) {
			@Pc(1022) Class125 local1022 = this.aClass125ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt5322 == -1) {
					for (local362 = 0; local362 < local1022.aShort67; local362++) {
						local24 = local1022.aShortArray55[local362] + (arg0 << super.anInt6193);
						local1046 = local1022.aShortArray57[local362];
						local34 = local1022.aShortArray62[local362] + (arg1 << super.anInt6193);
						local306 = this.anInt5310 + (this.anInt5313 * local24 + this.anInt5316 * local1046 + this.anInt5312 * local34 >> 15);
						if (local306 <= this.aClass172_Sub1_9.anInt5163) {
							return;
						}
						local194 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local1046 + this.anInt5317 * local34 >> 15);
						local250 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local1046 + this.anInt5315 * local34 >> 15);
						arg3[local362] = arg2.anInt4091 + local194 * this.aClass172_Sub1_9.anInt5152 / local306;
						arg4[local362] = arg2.anInt4095 + local250 * this.aClass172_Sub1_9.anInt5167 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort67; local362++) {
						local24 = local1022.aShortArray55[local362] + (arg0 << super.anInt6193);
						local1046 = local1022.aShortArray57[local362];
						local34 = local1022.aShortArray62[local362] + (arg1 << super.anInt6193);
						local194 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local1046 + this.anInt5317 * local34 >> 15);
						local250 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local1046 + this.anInt5315 * local34 >> 15);
						arg3[local362] = arg2.anInt4091 + local194 * this.aClass172_Sub1_9.anInt5152 / this.anInt5322;
						arg4[local362] = arg2.anInt4095 + local250 * this.aClass172_Sub1_9.anInt5167 / this.anInt5322;
					}
				}
				if (local1022.aShortArray61 != null) {
					local362 = this.anIntArrayArray35[arg0][arg1];
					local222 = this.anIntArrayArray35[arg0 + 1][arg1];
					local278 = this.anIntArrayArray35[arg0][arg1 + 1];
					local334 = arg0 * super.anInt6190;
					local390 = local334 + super.anInt6190;
					local183 = arg1 * super.anInt6190;
					local239 = local183 + super.anInt6190;
					local295 = this.anInt5323 + (this.anInt5311 * local334 + this.anInt5318 * local362 + this.anInt5317 * local183 >> 15);
					local351 = this.anInt5320 + (this.anInt5319 * local334 + this.anInt5321 * local362 + this.anInt5315 * local183 >> 15);
					local211 = this.anInt5310 + (this.anInt5313 * local334 + this.anInt5316 * local362 + this.anInt5312 * local183 >> 15);
					local267 = this.anInt5323 + (this.anInt5311 * local390 + this.anInt5318 * local222 + this.anInt5317 * local183 >> 15);
					local323 = this.anInt5320 + (this.anInt5319 * local390 + this.anInt5321 * local222 + this.anInt5315 * local183 >> 15);
					local379 = this.anInt5310 + (this.anInt5313 * local390 + this.anInt5316 * local222 + this.anInt5312 * local183 >> 15);
					local72 = this.anInt5323 + (this.anInt5311 * local334 + this.anInt5318 * local278 + this.anInt5317 * local239 >> 15);
					local95 = this.anInt5320 + (this.anInt5319 * local334 + this.anInt5321 * local278 + this.anInt5315 * local239 >> 15);
					local118 = this.anInt5310 + (this.anInt5313 * local334 + this.anInt5316 * local278 + this.anInt5312 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort66; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray56[local141];
						@Pc(1496) short local1496 = local1022.aShortArray60[local141];
						@Pc(1501) short local1501 = local1022.aShortArray54[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean350 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt4093 || local1509 > arg2.anInt4093 || local1513 > arg2.anInt4093;
							@Pc(1569) short local1569 = local1022.aShortArray61[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray251[local141];
								if (local1624 != -1) {
									arg2.method3274(local1517, local1521, local1525, local427, local1509, local1513, Static376.method4929(local1624, local1022.aShortArray58[local1491]), Static376.method4929(local1624, local1022.aShortArray58[local1496]), Static376.method4929(local1624, local1022.aShortArray58[local1501]));
								}
							} else {
								if (this.method4162(this.aClass172_Sub1_9.anInterface5_8.method3918(local1569).aByte46)) {
									arg2.anInt4092 = 100;
								}
								arg2.method3276(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray58[local1491], local1022.aShortArray58[local1496], local1022.aShortArray58[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt4092 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort66; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray56[local362];
					@Pc(1675) short local1675 = local1022.aShortArray60[local362];
					@Pc(1680) short local1680 = local1022.aShortArray54[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray251[local362];
						if (local267 != -1) {
							arg2.aBoolean350 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt4093 || local183 > arg2.anInt4093 || local239 > arg2.anInt4093;
							arg2.method3274(local295, local351, local211, local390, local183, local239, Static376.method4929(local267, local1022.aShortArray58[local1670]), Static376.method4929(local267, local1022.aShortArray58[local1675]), Static376.method4929(local267, local1022.aShortArray58[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte48 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6190;
			local24 = local19 + super.anInt6190;
			@Pc(29) int local29 = arg1 * super.anInt6190;
			local34 = local29 + super.anInt6190;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte48 & 0x1) == 0) {
				local46 = this.anIntArrayArray35[arg0][arg1];
				local55 = this.anIntArrayArray35[arg0 + 1][arg1];
				local166 = this.anIntArrayArray35[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray35[arg0][arg1 + 1];
				if (this.anInt5322 == -1) {
					local72 = this.anInt5310 + (this.anInt5313 * local19 + this.anInt5316 * local46 + this.anInt5312 * local29 >> 15);
					if (local72 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local95 = this.anInt5310 + (this.anInt5313 * local24 + this.anInt5316 * local55 + this.anInt5312 * local29 >> 15);
					if (local95 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local118 = this.anInt5310 + (this.anInt5313 * local24 + this.anInt5316 * local166 + this.anInt5312 * local34 >> 15);
					if (local118 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local141 = this.anInt5310 + (this.anInt5313 * local19 + this.anInt5316 * local427 + this.anInt5312 * local34 >> 15);
					if (local141 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
				} else {
					local141 = this.anInt5322;
					local118 = this.anInt5322;
					local95 = this.anInt5322;
					local72 = this.anInt5322;
				}
				local183 = this.anInt5323 + (this.anInt5311 * local19 + this.anInt5318 * local46 + this.anInt5317 * local29 >> 15);
				local194 = arg2.anInt4091 + local183 * this.aClass172_Sub1_9.anInt5152 / local72;
				local211 = this.anInt5320 + (this.anInt5319 * local19 + this.anInt5321 * local46 + this.anInt5315 * local29 >> 15);
				local222 = arg2.anInt4095 + local211 * this.aClass172_Sub1_9.anInt5167 / local72;
				local239 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local55 + this.anInt5317 * local29 >> 15);
				local250 = arg2.anInt4091 + local239 * this.aClass172_Sub1_9.anInt5152 / local95;
				local267 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local55 + this.anInt5315 * local29 >> 15);
				local278 = arg2.anInt4095 + local267 * this.aClass172_Sub1_9.anInt5167 / local95;
				local295 = this.anInt5323 + (this.anInt5311 * local24 + this.anInt5318 * local166 + this.anInt5317 * local34 >> 15);
				local306 = arg2.anInt4091 + local295 * this.aClass172_Sub1_9.anInt5152 / local118;
				local323 = this.anInt5320 + (this.anInt5319 * local24 + this.anInt5321 * local166 + this.anInt5315 * local34 >> 15);
				local334 = arg2.anInt4095 + local323 * this.aClass172_Sub1_9.anInt5167 / local118;
				local351 = this.anInt5323 + (this.anInt5311 * local19 + this.anInt5318 * local427 + this.anInt5317 * local34 >> 15);
				local362 = arg2.anInt4091 + local351 * this.aClass172_Sub1_9.anInt5152 / local141;
				local379 = this.anInt5320 + (this.anInt5319 * local19 + this.anInt5321 * local427 + this.anInt5315 * local34 >> 15);
				local390 = arg2.anInt4095 + local379 * this.aClass172_Sub1_9.anInt5167 / local141;
			} else {
				local46 = this.anIntArrayArray35[arg0][arg1];
				if (this.anInt5322 == -1) {
					local55 = this.anInt5316 * local46;
					local72 = this.anInt5310 + (this.anInt5313 * local19 + local55 + this.anInt5312 * local29 >> 15);
					if (local72 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local95 = this.anInt5310 + (this.anInt5313 * local24 + local55 + this.anInt5312 * local29 >> 15);
					if (local95 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local118 = this.anInt5310 + (this.anInt5313 * local24 + local55 + this.anInt5312 * local34 >> 15);
					if (local118 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
					local141 = this.anInt5310 + (this.anInt5313 * local19 + local55 + this.anInt5312 * local34 >> 15);
					if (local141 <= this.aClass172_Sub1_9.anInt5163) {
						return;
					}
				} else {
					local141 = this.anInt5322;
					local118 = this.anInt5322;
					local95 = this.anInt5322;
					local72 = this.anInt5322;
				}
				local55 = this.anInt5318 * local46;
				local166 = this.anInt5321 * local46;
				local183 = this.anInt5323 + (this.anInt5311 * local19 + local55 + this.anInt5317 * local29 >> 15);
				local194 = arg2.anInt4091 + local183 * this.aClass172_Sub1_9.anInt5152 / local72;
				local211 = this.anInt5320 + (this.anInt5319 * local19 + local166 + this.anInt5315 * local29 >> 15);
				local222 = arg2.anInt4095 + local211 * this.aClass172_Sub1_9.anInt5167 / local72;
				local239 = this.anInt5323 + (this.anInt5311 * local24 + local55 + this.anInt5317 * local29 >> 15);
				local250 = arg2.anInt4091 + local239 * this.aClass172_Sub1_9.anInt5152 / local95;
				local267 = this.anInt5320 + (this.anInt5319 * local24 + local166 + this.anInt5315 * local29 >> 15);
				local278 = arg2.anInt4095 + local267 * this.aClass172_Sub1_9.anInt5167 / local95;
				local295 = this.anInt5323 + (this.anInt5311 * local24 + local55 + this.anInt5317 * local34 >> 15);
				local306 = arg2.anInt4091 + local295 * this.aClass172_Sub1_9.anInt5152 / local118;
				local323 = this.anInt5320 + (this.anInt5319 * local24 + local166 + this.anInt5315 * local34 >> 15);
				local334 = arg2.anInt4095 + local323 * this.aClass172_Sub1_9.anInt5167 / local118;
				local351 = this.anInt5323 + (this.anInt5311 * local19 + local55 + this.anInt5317 * local34 >> 15);
				local362 = arg2.anInt4091 + local351 * this.aClass172_Sub1_9.anInt5152 / local141;
				local379 = this.anInt5320 + (this.anInt5319 * local19 + local166 + this.anInt5315 * local34 >> 15);
				local390 = arg2.anInt4095 + local379 * this.aClass172_Sub1_9.anInt5167 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean350 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt4093 || local362 > arg2.anInt4093 || local250 > arg2.anInt4093;
				if (local6.aShort48 >= 0) {
					if (this.method4162(this.aClass172_Sub1_9.anInterface5_8.method3918(local6.aShort48).aByte46)) {
						arg2.anInt4092 = 100;
					}
					arg2.method3276(local334, local390, local278, local306, local362, local250, local6.aShort49 & 0xFFFF, local6.aShort50 & 0xFFFF, local6.aShort51 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort48);
					arg2.anInt4092 = 0;
				} else {
					arg2.method3274(local334, local390, local278, local306, local362, local250, local6.aShort49 & 0xFFFF, local6.aShort50 & 0xFFFF, local6.aShort51 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean350 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt4093 || local250 > arg2.anInt4093 || local362 > arg2.anInt4093;
				if (local6.aShort48 >= 0) {
					if (this.method4162(this.aClass172_Sub1_9.anInterface5_8.method3918(local6.aShort48).aByte46)) {
						arg2.anInt4092 = 100;
					}
					arg2.method3276(local222, local278, local390, local194, local250, local362, local6.aShort52 & 0xFFFF, local6.aShort51 & 0xFFFF, local6.aShort50 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort48);
					arg2.anInt4092 = 0;
					return;
				}
				arg2.method3274(local222, local278, local390, local194, local250, local362, local6.aShort52 & 0xFFFF, local6.aShort51 & 0xFFFF, local6.aShort50 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!ot", name = "QA", descriptor = "(III)V")
	@Override
	public void QA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray13[arg0][arg1] < arg2) {
			this.aByteArrayArray13[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "()V")
	@Override
	public void f() {
		this.aByteArrayArray14 = null;
		this.aByteArrayArray13 = null;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class107_Sub2 local3 = this.aClass172_Sub1_9.aClass107_Sub2_2;
		this.anInt5322 = -1;
		this.anInt5311 = local3.anInt6308;
		this.anInt5318 = local3.anInt6316;
		this.anInt5317 = local3.anInt6307;
		this.anInt5323 = local3.anInt6317;
		this.anInt5319 = local3.anInt6315;
		this.anInt5321 = local3.anInt6312;
		this.anInt5315 = local3.anInt6306;
		this.anInt5320 = local3.anInt6309;
		this.anInt5313 = local3.anInt6313;
		this.anInt5316 = local3.anInt6314;
		this.anInt5312 = local3.anInt6310;
		this.anInt5310 = local3.anInt6311;
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)Z")
	private boolean method4162(@OriginalArg(0) int arg0) {
		if ((this.anInt5314 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "(Lclient!j;IIIIZ)V")
	@Override
	public void U(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!ot", name = "I", descriptor = "(II)I")
	@Override
	public int I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray35[arg0][arg1];
	}

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(IIIIIII[[ZLclient!kp;[I[I)V")
	private void method4163(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class135 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean351 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass83ArrayArray1[local22][local25] != null) {
						@Pc(50) Class83 local50 = this.aClass83ArrayArray1[local22][local25];
						if (local50.aShort48 != -1 && (local50.aByte48 & 0x2) == 0 && local50.anInt2587 == -1) {
							local69 = this.aClass172_Sub1_9.method4029(local50.aShort48);
							arg5.method3274(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static376.method4929(local69, local50.aShort49 & 0xFFFF), Static376.method4929(local69, local50.aShort50 & 0xFFFF), Static376.method4929(local69, local50.aShort51 & 0xFFFF));
							arg5.method3274(local20, local20, local20 - 4, local16, local16 + 4, local16, Static376.method4929(local69, local50.aShort52 & 0xFFFF), Static376.method4929(local69, local50.aShort51 & 0xFFFF), Static376.method4929(local69, local50.aShort50 & 0xFFFF));
						} else if (local50.anInt2587 == -1) {
							arg5.method3274(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort49 & 0xFFFF, local50.aShort50 & 0xFFFF, local50.aShort51 & 0xFFFF);
							arg5.method3274(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort52 & 0xFFFF, local50.aShort51 & 0xFFFF, local50.aShort50 & 0xFFFF);
						} else {
							local69 = local50.anInt2587;
							arg5.method3274(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method3274(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass125ArrayArray1[local22][local25] != null) {
						@Pc(249) Class125 local249 = this.aClass125ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort67; local69++) {
							arg6[local69] = local16 + local249.aShortArray55[local69] * 4 / super.anInt6190;
							arg7[local69] = local20 - local249.aShortArray62[local69] * 4 / super.anInt6190;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort66; local287++) {
							@Pc(293) short local293 = local249.aShortArray56[local287];
							@Pc(298) short local298 = local249.aShortArray60[local287];
							@Pc(303) short local303 = local249.aShortArray54[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray250 != null && local249.anIntArray250[local287] != -1) {
								local341 = local249.anIntArray250[local287];
								arg5.method3274(local319, local323, local327, local307, local311, local315, Static376.method4929(local341, local249.aShortArray58[local293]), Static376.method4929(local341, local249.aShortArray58[local298]), Static376.method4929(local341, local249.aShortArray58[local303]));
							} else if (local249.aShortArray61 == null || local249.aShortArray61[local287] == -1) {
								local341 = local249.anIntArray251[local287];
								arg5.method3274(local319, local323, local327, local307, local311, local315, Static376.method4929(local341, local249.aShortArray58[local293]), Static376.method4929(local341, local249.aShortArray58[local298]), Static376.method4929(local341, local249.aShortArray58[local303]));
							} else {
								local341 = this.aClass172_Sub1_9.method4029(local249.aShortArray61[local287]);
								arg5.method3274(local319, local323, local327, local307, local311, local315, Static376.method4929(local341, local249.aShortArray58[local293]), Static376.method4929(local341, local249.aShortArray58[local298]), Static376.method4929(local341, local249.aShortArray58[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean351 = true;
	}
}
