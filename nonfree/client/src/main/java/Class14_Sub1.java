import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	private int anInt283;

	@OriginalMember(owner = "client!aq", name = "l", descriptor = "[[Lclient!ce;")
	private Class35[][] aClass35ArrayArray1;

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "[[Lclient!lh;")
	private Class145[][] aClass145ArrayArray1;

	@OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
	private int anInt285;

	@OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
	private int anInt286;

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "[[Lclient!re;")
	private Class216[][] aClass216ArrayArray1;

	@OriginalMember(owner = "client!aq", name = "s", descriptor = "I")
	private int anInt287;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "I")
	private int anInt288;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	private int anInt289;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "[[Lclient!nh;")
	private Class170[][] aClass170ArrayArray1;

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
	private int anInt291;

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
	private int anInt292;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!aq", name = "C", descriptor = "I")
	private int anInt294;

	@OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "I")
	private int anInt290 = -1;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "Lclient!fg;")
	private final Class30_Sub2 aClass30_Sub2_3;

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "I")
	private final int anInt284;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "[[I")
	public final int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!aq", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!fg;IIII[[I[[II)V")
	public Class14_Sub1(@OriginalArg(0) Class30_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass30_Sub2_3 = arg0;
		this.anInt284 = arg2;
		this.anIntArrayArray1 = arg5;
		this.aByteArrayArray4 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass30_Sub2_3.anInt2289 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass30_Sub2_3.anInt2298 * local92 + this.aClass30_Sub2_3.anInt2307 * local98 + this.aClass30_Sub2_3.anInt2311 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray4[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray3 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIZLclient!cu;[I[I[I)V")
	private void method250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class216 local6 = this.aClass216ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class170 local1452 = this.aClass170ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt290 == -1) {
					for (local436 = 0; local436 < local1452.aShort61; local436++) {
						local24 = local1452.aShortArray83[local436] + (arg0 << super.anInt2830);
						local29 = local1452.aShortArray84[local436];
						local34 = local1452.aShortArray85[local436] + (arg1 << super.anInt2830);
						local380 = this.anInt282 + (this.anInt285 * local24 + this.anInt288 * local29 + this.anInt292 * local34 >> 15);
						if (local380 <= this.aClass30_Sub2_3.anInt2300) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass30_Sub2_3.anInt2296;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray82[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass30_Sub2_3.aBoolean158) {
							local296 = local380 - this.aClass30_Sub2_3.anInt2296;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local29 + this.anInt294 * local34 >> 15);
						local324 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local29 + this.anInt289 * local34 >> 15);
						arg4[local436] = arg3.anInt1398 + local268 * this.aClass30_Sub2_3.anInt2304 / local380;
						arg5[local436] = arg3.anInt1396 + local324 * this.aClass30_Sub2_3.anInt2306 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort61; local436++) {
						local24 = local1452.aShortArray83[local436] + (arg0 << super.anInt2830);
						local29 = local1452.aShortArray84[local436];
						local34 = local1452.aShortArray85[local436] + (arg1 << super.anInt2830);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt290 - this.aClass30_Sub2_3.anInt2296;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray82[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass30_Sub2_3.aBoolean158) {
							local296 = this.anInt290 - this.aClass30_Sub2_3.anInt2296;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local29 + this.anInt294 * local34 >> 15);
						local324 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local29 + this.anInt289 * local34 >> 15);
						arg4[local436] = arg3.anInt1398 + local268 * this.aClass30_Sub2_3.anInt2304 / this.anInt290;
						arg5[local436] = arg3.anInt1396 + local324 * this.aClass30_Sub2_3.anInt2306 / this.anInt290;
					}
				}
				if (local1452.aShortArray81 != null) {
					local436 = this.anIntArrayArray1[arg0][arg1];
					local296 = this.anIntArrayArray1[arg0 + 1][arg1];
					local352 = this.anIntArrayArray1[arg0][arg1 + 1];
					local408 = arg0 * super.anInt2831;
					local464 = local408 + super.anInt2831;
					local257 = arg1 * super.anInt2831;
					local313 = local257 + super.anInt2831;
					local369 = this.anInt295 + (this.anInt293 * local408 + this.anInt287 * local436 + this.anInt294 * local257 >> 15);
					local425 = this.anInt291 + (this.anInt286 * local408 + this.anInt283 * local436 + this.anInt289 * local257 >> 15);
					local285 = this.anInt282 + (this.anInt285 * local408 + this.anInt288 * local436 + this.anInt292 * local257 >> 15);
					local341 = this.anInt295 + (this.anInt293 * local464 + this.anInt287 * local296 + this.anInt294 * local257 >> 15);
					local397 = this.anInt291 + (this.anInt286 * local464 + this.anInt283 * local296 + this.anInt289 * local257 >> 15);
					local453 = this.anInt282 + (this.anInt285 * local464 + this.anInt288 * local296 + this.anInt292 * local257 >> 15);
					local82 = this.anInt295 + (this.anInt293 * local408 + this.anInt287 * local352 + this.anInt294 * local313 >> 15);
					local105 = this.anInt291 + (this.anInt286 * local408 + this.anInt283 * local352 + this.anInt289 * local313 >> 15);
					local128 = this.anInt282 + (this.anInt285 * local408 + this.anInt288 * local352 + this.anInt292 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort60; local151++) {
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
							arg3.aBoolean96 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt1394 || local176 > arg3.anInt1394 || local56 > arg3.anInt1394;
							@Pc(2138) short local2138 = local1452.aShortArray81[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method254(this.aClass30_Sub2_3.anInterface4_5.method5685(local2138).aByte51)) {
									arg3.anInt1399 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method1278(local65, local240, local501, local42, local176, local56, this.aClass30_Sub2_3.anInt2290, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray385[local36], local1452.anIntArray385[local38], local1452.anIntArray385[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray385[local36] & 0xFFFFFF) != 0) {
										arg3.method1282(local65, local240, local501, local42, local176, local56, Static393.method5531(arg6[local36] << 24 | this.aClass30_Sub2_3.anInt2290, local1452.anIntArray385[local36]), Static393.method5531(arg6[local38] << 24 | this.aClass30_Sub2_3.anInt2290, local1452.anIntArray385[local38]), Static393.method5531(arg6[local40] << 24 | this.aClass30_Sub2_3.anInt2290, local1452.anIntArray385[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method1273(local65, local240, local501, local42, local176, local56, local1452.anIntArray385[local36], local1452.anIntArray385[local38], local1452.anIntArray385[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray385[local36] & 0xFFFFFF) != 0) {
									arg3.method1282(local65, local240, local501, local42, local176, local56, local1452.anIntArray385[local36], local1452.anIntArray385[local38], local1452.anIntArray385[local40]);
								}
								arg3.anInt1399 = 0;
							} else {
								arg3.method1281(local65, local240, local501, local42, local176, local56, this.aClass30_Sub2_3.anInt2290);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort60; local436++) {
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
						arg3.aBoolean96 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt1394 || local257 > arg3.anInt1394 || local313 > arg3.anInt1394;
						if (local341 >= 765) {
							arg3.method1281(local369, local425, local285, local464, local257, local313, this.aClass30_Sub2_3.anInt2290);
						} else if (local341 > 0) {
							if ((local1452.anIntArray385[local296] & 0xFFFFFF) != 0) {
								arg3.method1282(local369, local425, local285, local464, local257, local313, Static385.method3422(arg6[local296], local1452.anIntArray385[local296], this.aClass30_Sub2_3.anInt2290), Static385.method3422(arg6[local352], local1452.anIntArray385[local352], this.aClass30_Sub2_3.anInt2290), Static385.method3422(arg6[local408], local1452.anIntArray385[local408], this.aClass30_Sub2_3.anInt2290));
							}
						} else if ((local1452.anIntArray385[local296] & 0xFFFFFF) != 0) {
							arg3.method1282(local369, local425, local285, local464, local257, local313, local1452.anIntArray385[local296], local1452.anIntArray385[local352], local1452.anIntArray385[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte74 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt2831;
			local24 = local19 + super.anInt2831;
			local29 = arg1 * super.anInt2831;
			local34 = local29 + super.anInt2831;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte74 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray1[arg0][arg1];
				local65 = this.anIntArrayArray1[arg0 + 1][arg1];
				local240 = this.anIntArrayArray1[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray1[arg0][arg1 + 1];
				if (this.anInt290 == -1) {
					local82 = this.anInt282 + (this.anInt285 * local19 + this.anInt288 * local56 + this.anInt292 * local29 >> 15);
					if (local82 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local105 = this.anInt282 + (this.anInt285 * local24 + this.anInt288 * local65 + this.anInt292 * local29 >> 15);
					if (local105 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local128 = this.anInt282 + (this.anInt285 * local24 + this.anInt288 * local240 + this.anInt292 * local34 >> 15);
					if (local128 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local151 = this.anInt282 + (this.anInt285 * local19 + this.anInt288 * local501 + this.anInt292 * local34 >> 15);
					if (local151 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
				} else {
					local151 = this.anInt290;
					local128 = this.anInt290;
					local105 = this.anInt290;
					local82 = this.anInt290;
				}
				if (arg2) {
					local176 = local82 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort71 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort73 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort70 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort69 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass30_Sub2_3.aBoolean158) {
					local176 = local82 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt295 + (this.anInt293 * local19 + this.anInt287 * local56 + this.anInt294 * local29 >> 15);
				local268 = arg3.anInt1398 + local257 * this.aClass30_Sub2_3.anInt2304 / local82;
				local285 = this.anInt291 + (this.anInt286 * local19 + this.anInt283 * local56 + this.anInt289 * local29 >> 15);
				local296 = arg3.anInt1396 + local285 * this.aClass30_Sub2_3.anInt2306 / local82;
				local313 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local65 + this.anInt294 * local29 >> 15);
				local324 = arg3.anInt1398 + local313 * this.aClass30_Sub2_3.anInt2304 / local105;
				local341 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local65 + this.anInt289 * local29 >> 15);
				local352 = arg3.anInt1396 + local341 * this.aClass30_Sub2_3.anInt2306 / local105;
				local369 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local240 + this.anInt294 * local34 >> 15);
				local380 = arg3.anInt1398 + local369 * this.aClass30_Sub2_3.anInt2304 / local128;
				local397 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local240 + this.anInt289 * local34 >> 15);
				local408 = arg3.anInt1396 + local397 * this.aClass30_Sub2_3.anInt2306 / local128;
				local425 = this.anInt295 + (this.anInt293 * local19 + this.anInt287 * local501 + this.anInt294 * local34 >> 15);
				local436 = arg3.anInt1398 + local425 * this.aClass30_Sub2_3.anInt2304 / local151;
				local453 = this.anInt291 + (this.anInt286 * local19 + this.anInt283 * local501 + this.anInt289 * local34 >> 15);
				local464 = arg3.anInt1396 + local453 * this.aClass30_Sub2_3.anInt2306 / local151;
			} else {
				local56 = this.anIntArrayArray1[arg0][arg1];
				if (this.anInt290 == -1) {
					local65 = this.anInt288 * local56;
					local82 = this.anInt282 + (this.anInt285 * local19 + local65 + this.anInt292 * local29 >> 15);
					if (local82 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local105 = this.anInt282 + (this.anInt285 * local24 + local65 + this.anInt292 * local29 >> 15);
					if (local105 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local128 = this.anInt282 + (this.anInt285 * local24 + local65 + this.anInt292 * local34 >> 15);
					if (local128 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local151 = this.anInt282 + (this.anInt285 * local19 + local65 + this.anInt292 * local34 >> 15);
					if (local151 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
				} else {
					local151 = this.anInt290;
					local128 = this.anInt290;
					local105 = this.anInt290;
					local82 = this.anInt290;
				}
				if (this.aClass30_Sub2_3.aBoolean158) {
					local176 = local82 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass30_Sub2_3.anInt2296;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt287 * local56;
				local240 = this.anInt283 * local56;
				local257 = this.anInt295 + (this.anInt293 * local19 + local65 + this.anInt294 * local29 >> 15);
				local268 = arg3.anInt1398 + local257 * this.aClass30_Sub2_3.anInt2304 / local82;
				local285 = this.anInt291 + (this.anInt286 * local19 + local240 + this.anInt289 * local29 >> 15);
				local296 = arg3.anInt1396 + local285 * this.aClass30_Sub2_3.anInt2306 / local82;
				local313 = this.anInt295 + (this.anInt293 * local24 + local65 + this.anInt294 * local29 >> 15);
				local324 = arg3.anInt1398 + local313 * this.aClass30_Sub2_3.anInt2304 / local105;
				local341 = this.anInt291 + (this.anInt286 * local24 + local240 + this.anInt289 * local29 >> 15);
				local352 = arg3.anInt1396 + local341 * this.aClass30_Sub2_3.anInt2306 / local105;
				local369 = this.anInt295 + (this.anInt293 * local24 + local65 + this.anInt294 * local34 >> 15);
				local380 = arg3.anInt1398 + local369 * this.aClass30_Sub2_3.anInt2304 / local128;
				local397 = this.anInt291 + (this.anInt286 * local24 + local240 + this.anInt289 * local34 >> 15);
				local408 = arg3.anInt1396 + local397 * this.aClass30_Sub2_3.anInt2306 / local128;
				local425 = this.anInt295 + (this.anInt293 * local19 + local65 + this.anInt294 * local34 >> 15);
				local436 = arg3.anInt1398 + local425 * this.aClass30_Sub2_3.anInt2304 / local151;
				local453 = this.anInt291 + (this.anInt286 * local19 + local240 + this.anInt289 * local34 >> 15);
				local464 = arg3.anInt1396 + local453 * this.aClass30_Sub2_3.anInt2306 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort72 != -1 && this.method254(this.aClass30_Sub2_3.anInterface4_5.method5685(local6.aShort72).aByte51);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean96 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt1394 || local436 > arg3.anInt1394 || local324 > arg3.anInt1394;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt1399 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort72 >= 0) {
							arg3.method1278(local408, local464, local352, local380, local436, local324, this.aClass30_Sub2_3.anInt2290, local40, local42, local38, local6.anInt6128, local6.anInt6131, local6.anInt6132, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort72);
						} else {
							arg3.method1282(local408, local464, local352, local380, local436, local324, Static393.method5531(local40 << 24 | this.aClass30_Sub2_3.anInt2290, local6.anInt6128), Static393.method5531(local42 << 24 | this.aClass30_Sub2_3.anInt2290, local6.anInt6131), Static393.method5531(local38 << 24 | this.aClass30_Sub2_3.anInt2290, local6.anInt6132));
						}
					} else if (local6.aShort72 >= 0) {
						arg3.method1273(local408, local464, local352, local380, local436, local324, local6.anInt6128, local6.anInt6131, local6.anInt6132, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort72);
					} else {
						arg3.method1282(local408, local464, local352, local380, local436, local324, local6.anInt6128, local6.anInt6131, local6.anInt6132);
					}
					arg3.anInt1399 = 0;
				} else {
					arg3.method1281(local408, local464, local352, local380, local436, local324, this.aClass30_Sub2_3.anInt2290);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean96 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt1394 || local324 > arg3.anInt1394 || local436 > arg3.anInt1394;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt1399 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort72 >= 0) {
							arg3.method1278(local296, local352, local464, local268, local324, local436, this.aClass30_Sub2_3.anInt2290, local36, local38, local42, local6.anInt6130, local6.anInt6132, local6.anInt6131, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort72);
						} else {
							arg3.method1282(local296, local352, local464, local268, local324, local436, Static393.method5531(local36 << 24 | this.aClass30_Sub2_3.anInt2290, local6.anInt6130), Static393.method5531(local38 << 24 | this.aClass30_Sub2_3.anInt2290, local6.anInt6132), Static393.method5531(local42 << 24 | this.aClass30_Sub2_3.anInt2290, local6.anInt6131));
						}
					} else if (local6.aShort72 >= 0) {
						arg3.method1273(local296, local352, local464, local268, local324, local436, local6.anInt6130, local6.anInt6132, local6.anInt6131, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort72);
					} else {
						arg3.method1282(local296, local352, local464, local268, local324, local436, local6.anInt6130, local6.anInt6132, local6.anInt6131);
					}
					arg3.anInt1399 = 0;
					return;
				}
				arg3.method1281(local296, local352, local464, local268, local324, local436, this.aClass30_Sub2_3.anInt2290);
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method2553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class72_Sub1 local3 = this.aClass30_Sub2_3.aClass72_Sub1_2;
		this.anInt290 = -1;
		this.anInt293 = local3.anInt2269;
		this.anInt287 = local3.anInt2260;
		this.anInt294 = local3.anInt2265;
		this.anInt295 = local3.anInt2270;
		this.anInt286 = local3.anInt2267;
		this.anInt283 = local3.anInt2268;
		this.anInt289 = local3.anInt2262;
		this.anInt291 = local3.anInt2264;
		this.anInt285 = local3.anInt2266;
		this.anInt288 = local3.anInt2259;
		this.anInt292 = local3.anInt2263;
		this.anInt282 = local3.anInt2261;
	}

	@OriginalMember(owner = "client!aq", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray3[arg0][arg1] < arg2) {
			this.aByteArrayArray3[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aq", name = "oa", descriptor = "(II)I")
	@Override
	public int oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray1[arg0][arg1];
	}

	@OriginalMember(owner = "client!aq", name = "ia", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void ia(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2551(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class182 local4 = this.aClass30_Sub2_3.method2116(Thread.currentThread());
		@Pc(7) Class44 local7 = local4.aClass44_2;
		local7.anInt1399 = 0;
		local7.aBoolean96 = false;
		if (this.aClass216ArrayArray1 != null) {
			this.method251(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray436, local4.anIntArray430);
		} else if (this.aClass35ArrayArray1 != null) {
			this.method253(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray436, local4.anIntArray430);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ni;[I)V")
	@Override
	public void method2555(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!aq", name = "U", descriptor = "()V")
	@Override
	public void U() {
		this.aByteArrayArray4 = null;
		this.aByteArrayArray3 = null;
	}

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "(Lclient!ia;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!aq", name = "R", descriptor = "(II)I")
	@Override
	public int R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt2830;
		@Pc(9) int local9 = arg1 >> super.anInt2830;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt2832 - 1 || local9 > super.anInt2835 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt2831 - 1;
		@Pc(41) int local41 = arg1 & super.anInt2831 - 1;
		@Pc(67) int local67 = this.anIntArrayArray1[local4][local9] * (super.anInt2831 - local34) + this.anIntArrayArray1[local4 + 1][local9] * local34 >> super.anInt2830;
		@Pc(97) int local97 = this.anIntArrayArray1[local4][local9 + 1] * (super.anInt2831 - local34) + this.anIntArrayArray1[local4 + 1][local9 + 1] * local34 >> super.anInt2830;
		return local67 * (super.anInt2831 - local41) + local97 * local41 >> super.anInt2830;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIIII[[ZLclient!cu;[I[I)V")
	private void method251(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class44 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean97 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass216ArrayArray1[local22][local25] != null) {
						@Pc(50) Class216 local50 = this.aClass216ArrayArray1[local22][local25];
						if (local50.aShort72 != -1 && (local50.aByte74 & 0x2) == 0 && local50.anInt6129 == 0) {
							local68 = this.aClass30_Sub2_3.method2119(local50.aShort72);
							arg5.method1284(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static233.method3939(local50.anInt6128, local68), Static233.method3939(local50.anInt6131, local68), Static233.method3939(local50.anInt6132, local68));
							arg5.method1284(local20, local20, local20 - 4, local16, local16 + 4, local16, Static233.method3939(local50.anInt6130, local68), Static233.method3939(local50.anInt6132, local68), Static233.method3939(local50.anInt6131, local68));
						} else if (local50.anInt6129 == 0) {
							arg5.method1282(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt6128, local50.anInt6131, local50.anInt6132);
							arg5.method1282(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt6130, local50.anInt6132, local50.anInt6131);
						} else {
							local68 = local50.anInt6129;
							arg5.method1282(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static393.method5531(local50.anInt6128 & 0xFF000000, local68), Static393.method5531(local50.anInt6131 & 0xFF000000, local68), Static393.method5531(local50.anInt6132 & 0xFF000000, local68));
							arg5.method1282(local20, local20, local20 - 4, local16, local16 + 4, local16, Static393.method5531(local50.anInt6130 & 0xFF000000, local68), Static393.method5531(local50.anInt6132 & 0xFF000000, local68), Static393.method5531(local50.anInt6131 & 0xFF000000, local68));
						}
					} else if (this.aClass170ArrayArray1[local22][local25] != null) {
						@Pc(259) Class170 local259 = this.aClass170ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort61; local68++) {
							arg6[local68] = local16 + local259.aShortArray83[local68] * 4 / super.anInt2831;
							arg7[local68] = local20 - local259.aShortArray85[local68] * 4 / super.anInt2831;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort60; local297++) {
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
							if (local259.anIntArray386 != null && local259.anIntArray386[local297] != 0 && (local259.aShortArray81 == null || local259.aShortArray81 != null && local259.aShortArray81[local297] == -1)) {
								local359 = local259.anIntArray386[local297];
								arg5.method1282(local326, local330, local334, local314, local318, local322, Static393.method5531(-(local259.anIntArray385[local302] & -16777216) - 16777216, local359), Static393.method5531(-(local259.anIntArray385[local306] & -16777216) - 16777216, local359), Static393.method5531(-(local259.anIntArray385[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray81 == null || local259.aShortArray81[local297] == -1) {
								arg5.method1282(local326, local330, local334, local314, local318, local322, local259.anIntArray385[local302], local259.anIntArray385[local306], local259.anIntArray385[local310]);
							} else {
								local359 = this.aClass30_Sub2_3.method2119(local259.aShortArray81[local297]);
								arg5.method1284(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!cu;[I[I[I)V")
	private void method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class35 local6 = this.aClass35ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class145 local1022 = this.aClass145ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt290 == -1) {
					for (local362 = 0; local362 < local1022.aShort49; local362++) {
						local24 = local1022.aShortArray58[local362] + (arg0 << super.anInt2830);
						local1046 = local1022.aShortArray61[local362];
						local34 = local1022.aShortArray63[local362] + (arg1 << super.anInt2830);
						local306 = this.anInt282 + (this.anInt285 * local24 + this.anInt288 * local1046 + this.anInt292 * local34 >> 15);
						if (local306 <= this.aClass30_Sub2_3.anInt2300) {
							return;
						}
						local194 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local1046 + this.anInt294 * local34 >> 15);
						local250 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local1046 + this.anInt289 * local34 >> 15);
						arg3[local362] = arg2.anInt1398 + local194 * this.aClass30_Sub2_3.anInt2304 / local306;
						arg4[local362] = arg2.anInt1396 + local250 * this.aClass30_Sub2_3.anInt2306 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort49; local362++) {
						local24 = local1022.aShortArray58[local362] + (arg0 << super.anInt2830);
						local1046 = local1022.aShortArray61[local362];
						local34 = local1022.aShortArray63[local362] + (arg1 << super.anInt2830);
						local194 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local1046 + this.anInt294 * local34 >> 15);
						local250 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local1046 + this.anInt289 * local34 >> 15);
						arg3[local362] = arg2.anInt1398 + local194 * this.aClass30_Sub2_3.anInt2304 / this.anInt290;
						arg4[local362] = arg2.anInt1396 + local250 * this.aClass30_Sub2_3.anInt2306 / this.anInt290;
					}
				}
				if (local1022.aShortArray59 != null) {
					local362 = this.anIntArrayArray1[arg0][arg1];
					local222 = this.anIntArrayArray1[arg0 + 1][arg1];
					local278 = this.anIntArrayArray1[arg0][arg1 + 1];
					local334 = arg0 * super.anInt2831;
					local390 = local334 + super.anInt2831;
					local183 = arg1 * super.anInt2831;
					local239 = local183 + super.anInt2831;
					local295 = this.anInt295 + (this.anInt293 * local334 + this.anInt287 * local362 + this.anInt294 * local183 >> 15);
					local351 = this.anInt291 + (this.anInt286 * local334 + this.anInt283 * local362 + this.anInt289 * local183 >> 15);
					local211 = this.anInt282 + (this.anInt285 * local334 + this.anInt288 * local362 + this.anInt292 * local183 >> 15);
					local267 = this.anInt295 + (this.anInt293 * local390 + this.anInt287 * local222 + this.anInt294 * local183 >> 15);
					local323 = this.anInt291 + (this.anInt286 * local390 + this.anInt283 * local222 + this.anInt289 * local183 >> 15);
					local379 = this.anInt282 + (this.anInt285 * local390 + this.anInt288 * local222 + this.anInt292 * local183 >> 15);
					local72 = this.anInt295 + (this.anInt293 * local334 + this.anInt287 * local278 + this.anInt294 * local239 >> 15);
					local95 = this.anInt291 + (this.anInt286 * local334 + this.anInt283 * local278 + this.anInt289 * local239 >> 15);
					local118 = this.anInt282 + (this.anInt285 * local334 + this.anInt288 * local278 + this.anInt292 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort50; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray62[local141];
						@Pc(1496) short local1496 = local1022.aShortArray60[local141];
						@Pc(1501) short local1501 = local1022.aShortArray64[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean96 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt1394 || local1509 > arg2.anInt1394 || local1513 > arg2.anInt1394;
							@Pc(1569) short local1569 = local1022.aShortArray59[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray355[local141];
								if (local1624 != -1) {
									arg2.method1284(local1517, local1521, local1525, local427, local1509, local1513, Static233.method3939(local1022.aShortArray57[local1491], local1624), Static233.method3939(local1022.aShortArray57[local1496], local1624), Static233.method3939(local1022.aShortArray57[local1501], local1624));
								}
							} else {
								if (this.method254(this.aClass30_Sub2_3.anInterface4_5.method5685(local1569).aByte51)) {
									arg2.anInt1399 = 100;
								}
								arg2.method1273(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray57[local1491], local1022.aShortArray57[local1496], local1022.aShortArray57[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt1399 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort50; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray62[local362];
					@Pc(1675) short local1675 = local1022.aShortArray60[local362];
					@Pc(1680) short local1680 = local1022.aShortArray64[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray355[local362];
						if (local267 != -1) {
							arg2.aBoolean96 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt1394 || local183 > arg2.anInt1394 || local239 > arg2.anInt1394;
							arg2.method1284(local295, local351, local211, local390, local183, local239, Static233.method3939(local1022.aShortArray57[local1670], local267), Static233.method3939(local1022.aShortArray57[local1675], local267), Static233.method3939(local1022.aShortArray57[local1680], local267));
						}
					}
				}
			}
		} else if ((local6.aByte4 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt2831;
			local24 = local19 + super.anInt2831;
			@Pc(29) int local29 = arg1 * super.anInt2831;
			local34 = local29 + super.anInt2831;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte4 & 0x1) == 0) {
				local46 = this.anIntArrayArray1[arg0][arg1];
				local55 = this.anIntArrayArray1[arg0 + 1][arg1];
				local166 = this.anIntArrayArray1[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray1[arg0][arg1 + 1];
				if (this.anInt290 == -1) {
					local72 = this.anInt282 + (this.anInt285 * local19 + this.anInt288 * local46 + this.anInt292 * local29 >> 15);
					if (local72 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local95 = this.anInt282 + (this.anInt285 * local24 + this.anInt288 * local55 + this.anInt292 * local29 >> 15);
					if (local95 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local118 = this.anInt282 + (this.anInt285 * local24 + this.anInt288 * local166 + this.anInt292 * local34 >> 15);
					if (local118 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local141 = this.anInt282 + (this.anInt285 * local19 + this.anInt288 * local427 + this.anInt292 * local34 >> 15);
					if (local141 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
				} else {
					local141 = this.anInt290;
					local118 = this.anInt290;
					local95 = this.anInt290;
					local72 = this.anInt290;
				}
				local183 = this.anInt295 + (this.anInt293 * local19 + this.anInt287 * local46 + this.anInt294 * local29 >> 15);
				local194 = arg2.anInt1398 + local183 * this.aClass30_Sub2_3.anInt2304 / local72;
				local211 = this.anInt291 + (this.anInt286 * local19 + this.anInt283 * local46 + this.anInt289 * local29 >> 15);
				local222 = arg2.anInt1396 + local211 * this.aClass30_Sub2_3.anInt2306 / local72;
				local239 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local55 + this.anInt294 * local29 >> 15);
				local250 = arg2.anInt1398 + local239 * this.aClass30_Sub2_3.anInt2304 / local95;
				local267 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local55 + this.anInt289 * local29 >> 15);
				local278 = arg2.anInt1396 + local267 * this.aClass30_Sub2_3.anInt2306 / local95;
				local295 = this.anInt295 + (this.anInt293 * local24 + this.anInt287 * local166 + this.anInt294 * local34 >> 15);
				local306 = arg2.anInt1398 + local295 * this.aClass30_Sub2_3.anInt2304 / local118;
				local323 = this.anInt291 + (this.anInt286 * local24 + this.anInt283 * local166 + this.anInt289 * local34 >> 15);
				local334 = arg2.anInt1396 + local323 * this.aClass30_Sub2_3.anInt2306 / local118;
				local351 = this.anInt295 + (this.anInt293 * local19 + this.anInt287 * local427 + this.anInt294 * local34 >> 15);
				local362 = arg2.anInt1398 + local351 * this.aClass30_Sub2_3.anInt2304 / local141;
				local379 = this.anInt291 + (this.anInt286 * local19 + this.anInt283 * local427 + this.anInt289 * local34 >> 15);
				local390 = arg2.anInt1396 + local379 * this.aClass30_Sub2_3.anInt2306 / local141;
			} else {
				local46 = this.anIntArrayArray1[arg0][arg1];
				if (this.anInt290 == -1) {
					local55 = this.anInt288 * local46;
					local72 = this.anInt282 + (this.anInt285 * local19 + local55 + this.anInt292 * local29 >> 15);
					if (local72 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local95 = this.anInt282 + (this.anInt285 * local24 + local55 + this.anInt292 * local29 >> 15);
					if (local95 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local118 = this.anInt282 + (this.anInt285 * local24 + local55 + this.anInt292 * local34 >> 15);
					if (local118 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
					local141 = this.anInt282 + (this.anInt285 * local19 + local55 + this.anInt292 * local34 >> 15);
					if (local141 <= this.aClass30_Sub2_3.anInt2300) {
						return;
					}
				} else {
					local141 = this.anInt290;
					local118 = this.anInt290;
					local95 = this.anInt290;
					local72 = this.anInt290;
				}
				local55 = this.anInt287 * local46;
				local166 = this.anInt283 * local46;
				local183 = this.anInt295 + (this.anInt293 * local19 + local55 + this.anInt294 * local29 >> 15);
				local194 = arg2.anInt1398 + local183 * this.aClass30_Sub2_3.anInt2304 / local72;
				local211 = this.anInt291 + (this.anInt286 * local19 + local166 + this.anInt289 * local29 >> 15);
				local222 = arg2.anInt1396 + local211 * this.aClass30_Sub2_3.anInt2306 / local72;
				local239 = this.anInt295 + (this.anInt293 * local24 + local55 + this.anInt294 * local29 >> 15);
				local250 = arg2.anInt1398 + local239 * this.aClass30_Sub2_3.anInt2304 / local95;
				local267 = this.anInt291 + (this.anInt286 * local24 + local166 + this.anInt289 * local29 >> 15);
				local278 = arg2.anInt1396 + local267 * this.aClass30_Sub2_3.anInt2306 / local95;
				local295 = this.anInt295 + (this.anInt293 * local24 + local55 + this.anInt294 * local34 >> 15);
				local306 = arg2.anInt1398 + local295 * this.aClass30_Sub2_3.anInt2304 / local118;
				local323 = this.anInt291 + (this.anInt286 * local24 + local166 + this.anInt289 * local34 >> 15);
				local334 = arg2.anInt1396 + local323 * this.aClass30_Sub2_3.anInt2306 / local118;
				local351 = this.anInt295 + (this.anInt293 * local19 + local55 + this.anInt294 * local34 >> 15);
				local362 = arg2.anInt1398 + local351 * this.aClass30_Sub2_3.anInt2304 / local141;
				local379 = this.anInt291 + (this.anInt286 * local19 + local166 + this.anInt289 * local34 >> 15);
				local390 = arg2.anInt1396 + local379 * this.aClass30_Sub2_3.anInt2306 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean96 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt1394 || local362 > arg2.anInt1394 || local250 > arg2.anInt1394;
				if (local6.aShort5 >= 0) {
					if (this.method254(this.aClass30_Sub2_3.anInterface4_5.method5685(local6.aShort5).aByte51)) {
						arg2.anInt1399 = 100;
					}
					arg2.method1273(local334, local390, local278, local306, local362, local250, local6.aShort7 & 0xFFFF, local6.aShort8 & 0xFFFF, local6.aShort9 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort5);
					arg2.anInt1399 = 0;
				} else {
					arg2.method1284(local334, local390, local278, local306, local362, local250, local6.aShort7 & 0xFFFF, local6.aShort8 & 0xFFFF, local6.aShort9 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean96 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt1394 || local250 > arg2.anInt1394 || local362 > arg2.anInt1394;
				if (local6.aShort5 >= 0) {
					if (this.method254(this.aClass30_Sub2_3.anInterface4_5.method5685(local6.aShort5).aByte51)) {
						arg2.anInt1399 = 100;
					}
					arg2.method1273(local222, local278, local390, local194, local250, local362, local6.aShort6 & 0xFFFF, local6.aShort9 & 0xFFFF, local6.aShort8 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort5);
					arg2.anInt1399 = 0;
					return;
				}
				arg2.method1284(local222, local278, local390, local194, local250, local362, local6.aShort6 & 0xFFFF, local6.aShort9 & 0xFFFF, local6.aShort8 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!aq", name = "ta", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass216ArrayArray1 == null) {
			this.aClass216ArrayArray1 = new Class216[super.anInt2832][super.anInt2835];
			this.aClass170ArrayArray1 = new Class170[super.anInt2832][super.anInt2835];
		} else if (this.aClass35ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static107.anIntArray200[Static126.method2377(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static107.anIntArray200[Static126.method2377(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt2831 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt2831 && arg4[local116] == super.anInt2831) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt2831) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt2831 && arg2[local244] != arg2[0] - super.anInt2831) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt2831 && arg4[local244] != arg4[0] - super.anInt2831) {
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
			@Pc(334) Class216 local334 = new Class216();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt6129 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte74 = (byte) (local334.aByte74 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray1[arg0][arg1] == this.anIntArrayArray1[arg0 + 1][arg1] && this.anIntArrayArray1[arg0][arg1] == this.anIntArrayArray1[arg0 + 1][arg1 + 1] && this.anIntArrayArray1[arg0][arg1] == this.anIntArrayArray1[arg0][arg1 + 1]) {
				local334.aByte74 = (byte) (local334.aByte74 | 0x1);
			}
			if (local342 == -1 || (local334.aByte74 & 0x2) != 0 || this.aClass30_Sub2_3.anInterface4_5.method5685(local342).aBoolean319) {
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
				local334.anInt6130 = Static385.method3422(local527, Static468.method255(arg6[local104] >> 8, this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]), arg10);
				if (local334.anInt6129 != 0) {
					local334.anInt6130 |= this.aByteArrayArray3[arg0][arg1] + 255 - this.aByteArrayArray4[arg0][arg1] << 25;
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
				local334.anInt6132 = Static385.method3422(local527, Static468.method255(arg6[local106] >> 8, this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]), arg10);
				if (local334.anInt6129 != 0) {
					local334.anInt6132 |= this.aByteArrayArray3[arg0 + 1][arg1] + 255 - this.aByteArrayArray4[arg0 + 1][arg1] << 25;
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
				local334.anInt6128 = Static385.method3422(local527, Static468.method255(arg6[local108] >> 8, this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt6129 != 0) {
					local334.anInt6128 |= this.aByteArrayArray3[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray4[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt6131 = Static385.method3422(local527, Static468.method255(arg6[local110] >> 8, this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]), arg10);
				if (local334.anInt6129 != 0) {
					local334.anInt6131 |= this.aByteArrayArray3[arg0][arg1 + 1] + 255 - this.aByteArrayArray4[arg0][arg1 + 1] << 25;
				}
				local334.aShort72 = -1;
			} else {
				local334.anInt6130 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1];
				local334.anInt6132 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1];
				local334.anInt6128 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1];
				local334.anInt6131 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1];
				local334.aShort72 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort70 = (short) arg5[local108];
				local334.aShort69 = (short) arg5[local110];
				local334.aShort73 = (short) arg5[local106];
				local334.aShort71 = (short) arg5[local104];
			}
			this.aClass216ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class170 local888 = new Class170();
		local888.aShort61 = (short) arg2.length;
		local888.aShort60 = (short) (arg2.length / 3);
		local888.aShortArray83 = new short[local888.aShort61];
		local888.aShortArray84 = new short[local888.aShort61];
		local888.aShortArray85 = new short[local888.aShort61];
		local888.anIntArray385 = new int[local888.aShort61];
		if (arg5 != null) {
			local888.aShortArray82 = new short[local888.aShort61];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort61; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt2831) {
				local958 = this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1];
			} else if (local342 == super.anInt2831 && local527 == super.anInt2831) {
				local958 = this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt2831 && local527 == 0) {
				local958 = this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]) * (super.anInt2831 - local342) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]) * (super.anInt2831 - local342) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt2831 - local527) + local1126 * local527 >> super.anInt2830 * 2;
			}
			local1079 = (arg0 << super.anInt2830) + local342;
			local1126 = (arg1 << super.anInt2830) + local527;
			local888.aShortArray83[local244] = (short) local342;
			local888.aShortArray85[local244] = (short) local527;
			local888.aShortArray84[local244] = (short) (this.R(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass30_Sub2_3.anInterface4_5.method5685(arg8[local244]).aBoolean319) {
				local888.anIntArray385[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray82[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray385[local244] = Static385.method3422(local1226, Static468.method255(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray385[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray385[local244] = 0;
			} else {
				local888.anIntArray385[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort60; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass30_Sub2_3.anInterface4_5.method5685(arg8[local527 * 3]).aBoolean319) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray386 = new int[local888.aShort60];
		}
		if (local1296) {
			local888.aShortArray81 = new short[local888.aShort60];
			local888.aShortArray80 = new short[local888.aShort60];
		}
		for (local958 = 0; local958 < local888.aShort60; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray386[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aBoolean319) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aBoolean319) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aBoolean319) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray81[local958] = (short) local1384;
					local888.aShortArray80[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aBoolean319) {
							local888.anIntArray385[local1079] = Static107.anIntArray200[Static126.method2377(this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aShort51 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aBoolean319) {
							local888.anIntArray385[local1126] = Static107.anIntArray200[Static126.method2377(this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aShort51 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aBoolean319) {
							local888.anIntArray385[local1226] = Static107.anIntArray200[Static126.method2377(this.aClass30_Sub2_3.anInterface4_5.method5685(local1384).aShort51 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray81[local958] = -1;
				}
			}
		}
		this.aClass170ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(IIIIIII[[ZLclient!cu;[I[I)V")
	private void method253(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class44 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean97 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass35ArrayArray1[local22][local25] != null) {
						@Pc(50) Class35 local50 = this.aClass35ArrayArray1[local22][local25];
						if (local50.aShort5 != -1 && (local50.aByte4 & 0x2) == 0 && local50.anInt1001 == -1) {
							local69 = this.aClass30_Sub2_3.method2119(local50.aShort5);
							arg5.method1284(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static233.method3939(local50.aShort7 & 0xFFFF, local69), Static233.method3939(local50.aShort8 & 0xFFFF, local69), Static233.method3939(local50.aShort9 & 0xFFFF, local69));
							arg5.method1284(local20, local20, local20 - 4, local16, local16 + 4, local16, Static233.method3939(local50.aShort6 & 0xFFFF, local69), Static233.method3939(local50.aShort9 & 0xFFFF, local69), Static233.method3939(local50.aShort8 & 0xFFFF, local69));
						} else if (local50.anInt1001 == -1) {
							arg5.method1284(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort7 & 0xFFFF, local50.aShort8 & 0xFFFF, local50.aShort9 & 0xFFFF);
							arg5.method1284(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort6 & 0xFFFF, local50.aShort9 & 0xFFFF, local50.aShort8 & 0xFFFF);
						} else {
							local69 = local50.anInt1001;
							arg5.method1284(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method1284(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass145ArrayArray1[local22][local25] != null) {
						@Pc(249) Class145 local249 = this.aClass145ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort49; local69++) {
							arg6[local69] = local16 + local249.aShortArray58[local69] * 4 / super.anInt2831;
							arg7[local69] = local20 - local249.aShortArray63[local69] * 4 / super.anInt2831;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort50; local287++) {
							@Pc(293) short local293 = local249.aShortArray62[local287];
							@Pc(298) short local298 = local249.aShortArray60[local287];
							@Pc(303) short local303 = local249.aShortArray64[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray354 != null && local249.anIntArray354[local287] != -1) {
								local341 = local249.anIntArray354[local287];
								arg5.method1284(local319, local323, local327, local307, local311, local315, Static233.method3939(local249.aShortArray57[local293], local341), Static233.method3939(local249.aShortArray57[local298], local341), Static233.method3939(local249.aShortArray57[local303], local341));
							} else if (local249.aShortArray59 == null || local249.aShortArray59[local287] == -1) {
								local341 = local249.anIntArray355[local287];
								arg5.method1284(local319, local323, local327, local307, local311, local315, Static233.method3939(local249.aShortArray57[local293], local341), Static233.method3939(local249.aShortArray57[local298], local341), Static233.method3939(local249.aShortArray57[local303], local341));
							} else {
								local341 = this.aClass30_Sub2_3.method2119(local249.aShortArray59[local287]);
								arg5.method1284(local319, local323, local327, local307, local311, local315, Static233.method3939(local249.aShortArray57[local293], local341), Static233.method3939(local249.aShortArray57[local298], local341), Static233.method3939(local249.aShortArray57[local303], local341));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean97 = true;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)Z")
	private boolean method254(@OriginalArg(0) int arg0) {
		if ((this.anInt284 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!ia;IIIIZ)Z")
	@Override
	public boolean method2554(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aq", name = "q", descriptor = "(IILclient!ia;)Lclient!ia;")
	@Override
	public Class4_Sub1_Sub6 q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub6 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	@Override
	public void method2549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class182 local4 = this.aClass30_Sub2_3.method2116(Thread.currentThread());
		local4.aClass44_2.anInt1399 = 0;
		if (this.aClass216ArrayArray1 != null) {
			this.method250(arg0, arg1, this.aClass30_Sub2_3.aBoolean159, local4.aClass44_2, local4.anIntArray436, local4.anIntArray430, local4.anIntArray412);
		} else if (this.aClass35ArrayArray1 != null) {
			this.method252(arg0, arg1, local4.aClass44_2, local4.anIntArray436, local4.anIntArray430, local4.anIntArray412);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method2552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass35ArrayArray1 == null) {
			this.aClass35ArrayArray1 = new Class35[super.anInt2832][super.anInt2835];
			this.aClass145ArrayArray1 = new Class145[super.anInt2832][super.anInt2835];
		} else if (this.aClass216ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt2831 || local70 != 0 && local70 != super.anInt2831) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class145 local95 = new Class145();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort49 = local99;
			local95.aShortArray57 = new short[local99];
			local95.aShortArray58 = new short[local99];
			local95.aShortArray61 = new short[local99];
			local95.aShortArray63 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray57[local124] = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt2831) {
					local95.aShortArray57[local124] = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				} else if (local129 == super.anInt2831 && local133 == super.anInt2831) {
					local95.aShortArray57[local124] = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt2831 && local133 == 0) {
					local95.aShortArray57[local124] = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]) * (super.anInt2831 - local129) + (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]) * (super.anInt2831 - local129) + (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray57[local124] = (short) (local288 * (super.anInt2831 - local133) + local335 * local133 >> super.anInt2830 * 2);
				}
				local288 = (arg0 << super.anInt2830) + local129;
				local335 = (arg1 << super.anInt2830) + local133;
				local95.aShortArray58[local124] = (short) local129;
				local95.aShortArray63[local124] = (short) local133;
				local95.aShortArray61[local124] = (short) (this.R(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray57[local124] < 2) {
					local95.aShortArray57[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass30_Sub2_3.anInterface4_5.method5685(arg11[local288]).aBoolean319) {
					local415 = true;
				}
			}
			local95.anIntArray355 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray354 = new int[local133];
			}
			local95.aShortArray62 = new short[local133];
			local95.aShortArray60 = new short[local133];
			local95.aShortArray64 = new short[local133];
			if (local415) {
				local95.aShortArray59 = new short[local133];
				local95.aShortArray65 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray355[local95.aShort50] = Static126.method2377(arg9[local335]);
					} else {
						local95.anIntArray355[local95.aShort50] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray354[local95.aShort50] = -1;
						} else {
							local95.anIntArray354[local95.aShort50] = Static126.method2377(arg10[local335]);
						}
					}
					local95.aShortArray62[local95.aShort50] = (short) arg6[local335];
					local95.aShortArray60[local95.aShort50] = (short) arg7[local335];
					local95.aShortArray64[local95.aShort50] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass30_Sub2_3.anInterface4_5.method5685(arg11[local335]).aBoolean319) {
							local95.aShortArray59[local95.aShort50] = -1;
						} else {
							local95.aShortArray59[local95.aShort50] = (short) arg11[local335];
							local95.aShortArray65[local95.aShort50] = (short) arg12[local335];
						}
					}
					local95.aShort50++;
				}
			}
			this.aClass145ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class35 local644 = new Class35();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt1001 = Static233.method3939(this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1], Static126.method2377(arg10[0]));
				if (local64 == -1) {
					local644.aByte4 = (byte) (local644.aByte4 | 0x2);
				}
			}
			if (this.anIntArrayArray1[arg0][arg1] == this.anIntArrayArray1[arg0 + 1][arg1] && this.anIntArrayArray1[arg0][arg1] == this.anIntArrayArray1[arg0 + 1][arg1 + 1] && this.anIntArrayArray1[arg0][arg1] == this.anIntArrayArray1[arg0][arg1 + 1]) {
				local644.aByte4 = (byte) (local644.aByte4 | 0x1);
			}
			if (local70 == -1 || (local644.aByte4 & 0x2) != 0 || this.aClass30_Sub2_3.anInterface4_5.method5685(local70).aBoolean319) {
				@Pc(845) short local845 = Static126.method2377(local64);
				local644.aShort6 = (short) Static233.method3939(this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1], local845);
				local644.aShort9 = (short) Static233.method3939(this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1], local845);
				local644.aShort7 = (short) Static233.method3939(this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1], local845);
				local644.aShort8 = (short) Static233.method3939(this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1], local845);
				local644.aShort5 = -1;
			} else {
				local644.aShort6 = (short) (this.aByteArrayArray4[arg0][arg1] - this.aByteArrayArray3[arg0][arg1]);
				local644.aShort9 = (short) (this.aByteArrayArray4[arg0 + 1][arg1] - this.aByteArrayArray3[arg0 + 1][arg1]);
				local644.aShort7 = (short) (this.aByteArrayArray4[arg0 + 1][arg1 + 1] - this.aByteArrayArray3[arg0 + 1][arg1 + 1]);
				local644.aShort8 = (short) (this.aByteArrayArray4[arg0][arg1 + 1] - this.aByteArrayArray3[arg0][arg1 + 1]);
				local644.aShort5 = (short) local70;
			}
			this.aClass35ArrayArray1[arg0][arg1] = local644;
		}
	}
}
