import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!su", name = "h", descriptor = "[[Lclient!ht;")
	private Class106[][] aClass106ArrayArray1;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "I")
	private int anInt6304;

	@OriginalMember(owner = "client!su", name = "j", descriptor = "I")
	private int anInt6305;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	private int anInt6306;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "[[Lclient!rv;")
	private Class217[][] aClass217ArrayArray1;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	private int anInt6307;

	@OriginalMember(owner = "client!su", name = "o", descriptor = "I")
	private int anInt6308;

	@OriginalMember(owner = "client!su", name = "p", descriptor = "I")
	private int anInt6309;

	@OriginalMember(owner = "client!su", name = "s", descriptor = "I")
	private int anInt6311;

	@OriginalMember(owner = "client!su", name = "t", descriptor = "I")
	private int anInt6312;

	@OriginalMember(owner = "client!su", name = "u", descriptor = "I")
	private int anInt6313;

	@OriginalMember(owner = "client!su", name = "v", descriptor = "[[Lclient!th;")
	private Class230[][] aClass230ArrayArray1;

	@OriginalMember(owner = "client!su", name = "w", descriptor = "I")
	private int anInt6314;

	@OriginalMember(owner = "client!su", name = "x", descriptor = "[[Lclient!pb;")
	private Class188[][] aClass188ArrayArray1;

	@OriginalMember(owner = "client!su", name = "z", descriptor = "I")
	private int anInt6316;

	@OriginalMember(owner = "client!su", name = "C", descriptor = "I")
	private int anInt6317;

	@OriginalMember(owner = "client!su", name = "y", descriptor = "I")
	private int anInt6315 = -1;

	@OriginalMember(owner = "client!su", name = "B", descriptor = "Lclient!qf;")
	private final Class200_Sub1 aClass200_Sub1_10;

	@OriginalMember(owner = "client!su", name = "r", descriptor = "I")
	private final int anInt6310;

	@OriginalMember(owner = "client!su", name = "l", descriptor = "[[I")
	public final int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!su", name = "q", descriptor = "[[B")
	private byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!su", name = "A", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!qf;IIII[[I[[II)V")
	public Class125_Sub2(@OriginalArg(0) Class200_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass200_Sub1_10 = arg0;
		this.anInt6310 = arg2;
		this.anIntArrayArray57 = arg5;
		this.aByteArrayArray15 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass200_Sub1_10.anInt5412 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass200_Sub1_10.anInt5403 * local92 + this.aClass200_Sub1_10.anInt5415 * local98 + this.aClass200_Sub1_10.anInt5405 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray15[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIII[[ZLclient!qh;[I[I)V")
	private void method4994(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class201 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean375 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass217ArrayArray1[local22][local25] != null) {
						@Pc(50) Class217 local50 = this.aClass217ArrayArray1[local22][local25];
						if (local50.aShort83 != -1 && (local50.aByte80 & 0x2) == 0 && local50.anInt5919 == -1) {
							local69 = this.aClass200_Sub1_10.method4321(local50.aShort83);
							arg5.method4352(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static185.method2531(local69, local50.aShort84 & 0xFFFF), Static185.method2531(local69, local50.aShort82 & 0xFFFF), Static185.method2531(local69, local50.aShort86 & 0xFFFF));
							arg5.method4352(local20, local20, local20 - 4, local16, local16 + 4, local16, Static185.method2531(local69, local50.aShort85 & 0xFFFF), Static185.method2531(local69, local50.aShort86 & 0xFFFF), Static185.method2531(local69, local50.aShort82 & 0xFFFF));
						} else if (local50.anInt5919 == -1) {
							arg5.method4352(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort84 & 0xFFFF, local50.aShort82 & 0xFFFF, local50.aShort86 & 0xFFFF);
							arg5.method4352(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort85 & 0xFFFF, local50.aShort86 & 0xFFFF, local50.aShort82 & 0xFFFF);
						} else {
							local69 = local50.anInt5919;
							arg5.method4352(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4352(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass188ArrayArray1[local22][local25] != null) {
						@Pc(249) Class188 local249 = this.aClass188ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort56; local69++) {
							arg6[local69] = local16 + local249.aShortArray88[local69] * 4 / super.anInt6303;
							arg7[local69] = local20 - local249.aShortArray83[local69] * 4 / super.anInt6303;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort57; local287++) {
							@Pc(293) short local293 = local249.aShortArray85[local287];
							@Pc(298) short local298 = local249.aShortArray86[local287];
							@Pc(303) short local303 = local249.aShortArray81[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray367 != null && local249.anIntArray367[local287] != -1) {
								local341 = local249.anIntArray367[local287];
								arg5.method4352(local319, local323, local327, local307, local311, local315, Static185.method2531(local341, local249.aShortArray87[local293]), Static185.method2531(local341, local249.aShortArray87[local298]), Static185.method2531(local341, local249.aShortArray87[local303]));
							} else if (local249.aShortArray82 == null || local249.aShortArray82[local287] == -1) {
								local341 = local249.anIntArray368[local287];
								arg5.method4352(local319, local323, local327, local307, local311, local315, Static185.method2531(local341, local249.aShortArray87[local293]), Static185.method2531(local341, local249.aShortArray87[local298]), Static185.method2531(local341, local249.aShortArray87[local303]));
							} else {
								local341 = this.aClass200_Sub1_10.method4321(local249.aShortArray82[local287]);
								arg5.method4352(local319, local323, local327, local307, local311, local315, Static185.method2531(local341, local249.aShortArray87[local293]), Static185.method2531(local341, local249.aShortArray87[local298]), Static185.method2531(local341, local249.aShortArray87[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean375 = true;
	}

	@OriginalMember(owner = "client!su", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt6300;
		@Pc(9) int local9 = arg1 >> super.anInt6300;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt6301 - 1 || local9 > super.anInt6299 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt6303 - 1;
		@Pc(41) int local41 = arg1 & super.anInt6303 - 1;
		@Pc(67) int local67 = this.anIntArrayArray57[local4][local9] * (super.anInt6303 - local34) + this.anIntArrayArray57[local4 + 1][local9] * local34 >> super.anInt6300;
		@Pc(97) int local97 = this.anIntArrayArray57[local4][local9 + 1] * (super.anInt6303 - local34) + this.anIntArrayArray57[local4 + 1][local9 + 1] * local34 >> super.anInt6300;
		return local67 * (super.anInt6303 - local41) + local97 * local41 >> super.anInt6300;
	}

	@OriginalMember(owner = "client!su", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!su", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray57[arg0][arg1];
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZLclient!qh;[I[I[I)V")
	private void method4995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class201 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class106 local6 = this.aClass106ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class230 local1452 = this.aClass230ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt6315 == -1) {
					for (local436 = 0; local436 < local1452.aShort96; local436++) {
						local24 = local1452.aShortArray107[local436] + (arg0 << super.anInt6300);
						local29 = local1452.aShortArray104[local436];
						local34 = local1452.aShortArray108[local436] + (arg1 << super.anInt6300);
						local380 = this.anInt6305 + (this.anInt6312 * local24 + this.anInt6314 * local29 + this.anInt6316 * local34 >> 15);
						if (local380 <= this.aClass200_Sub1_10.lb) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass200_Sub1_10.anInt5417;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray103[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass200_Sub1_10.aBoolean370) {
							local296 = local380 - this.aClass200_Sub1_10.anInt5417;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local29 + this.anInt6306 * local34 >> 15);
						local324 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local29 + this.anInt6309 * local34 >> 15);
						arg4[local436] = arg3.anInt5451 + local268 * this.aClass200_Sub1_10.anInt5422 / local380;
						arg5[local436] = arg3.anInt5449 + local324 * this.aClass200_Sub1_10.anInt5418 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort96; local436++) {
						local24 = local1452.aShortArray107[local436] + (arg0 << super.anInt6300);
						local29 = local1452.aShortArray104[local436];
						local34 = local1452.aShortArray108[local436] + (arg1 << super.anInt6300);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt6315 - this.aClass200_Sub1_10.anInt5417;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray103[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass200_Sub1_10.aBoolean370) {
							local296 = this.anInt6315 - this.aClass200_Sub1_10.anInt5417;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local29 + this.anInt6306 * local34 >> 15);
						local324 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local29 + this.anInt6309 * local34 >> 15);
						arg4[local436] = arg3.anInt5451 + local268 * this.aClass200_Sub1_10.anInt5422 / this.anInt6315;
						arg5[local436] = arg3.anInt5449 + local324 * this.aClass200_Sub1_10.anInt5418 / this.anInt6315;
					}
				}
				if (local1452.aShortArray106 != null) {
					local436 = this.anIntArrayArray57[arg0][arg1];
					local296 = this.anIntArrayArray57[arg0 + 1][arg1];
					local352 = this.anIntArrayArray57[arg0][arg1 + 1];
					local408 = arg0 * super.anInt6303;
					local464 = local408 + super.anInt6303;
					local257 = arg1 * super.anInt6303;
					local313 = local257 + super.anInt6303;
					local369 = this.anInt6317 + (this.anInt6313 * local408 + this.anInt6307 * local436 + this.anInt6306 * local257 >> 15);
					local425 = this.anInt6311 + (this.anInt6304 * local408 + this.anInt6308 * local436 + this.anInt6309 * local257 >> 15);
					local285 = this.anInt6305 + (this.anInt6312 * local408 + this.anInt6314 * local436 + this.anInt6316 * local257 >> 15);
					local341 = this.anInt6317 + (this.anInt6313 * local464 + this.anInt6307 * local296 + this.anInt6306 * local257 >> 15);
					local397 = this.anInt6311 + (this.anInt6304 * local464 + this.anInt6308 * local296 + this.anInt6309 * local257 >> 15);
					local453 = this.anInt6305 + (this.anInt6312 * local464 + this.anInt6314 * local296 + this.anInt6316 * local257 >> 15);
					local82 = this.anInt6317 + (this.anInt6313 * local408 + this.anInt6307 * local352 + this.anInt6306 * local313 >> 15);
					local105 = this.anInt6311 + (this.anInt6304 * local408 + this.anInt6308 * local352 + this.anInt6309 * local313 >> 15);
					local128 = this.anInt6305 + (this.anInt6312 * local408 + this.anInt6314 * local352 + this.anInt6316 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort97; local151++) {
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
							arg3.aBoolean373 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt5452 || local176 > arg3.anInt5452 || local56 > arg3.anInt5452;
							@Pc(2138) short local2138 = local1452.aShortArray106[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method4999(this.aClass200_Sub1_10.anInterface8_134.method4125(local2138).aByte55)) {
									arg3.anInt5453 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method4351(local65, local240, local501, local42, local176, local56, this.aClass200_Sub1_10.anInt5399, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray451[local36], local1452.anIntArray451[local38], local1452.anIntArray451[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray451[local36] & 0xFFFFFF) != 0) {
										arg3.method4348(local65, local240, local501, local42, local176, local56, Static93.method1317(local1452.anIntArray451[local36], arg6[local36] << 24 | this.aClass200_Sub1_10.anInt5399), Static93.method1317(local1452.anIntArray451[local38], arg6[local38] << 24 | this.aClass200_Sub1_10.anInt5399), Static93.method1317(local1452.anIntArray451[local40], arg6[local40] << 24 | this.aClass200_Sub1_10.anInt5399));
									}
								} else if (local2138 != -1) {
									arg3.method4349(local65, local240, local501, local42, local176, local56, local1452.anIntArray451[local36], local1452.anIntArray451[local38], local1452.anIntArray451[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray451[local36] & 0xFFFFFF) != 0) {
									arg3.method4348(local65, local240, local501, local42, local176, local56, local1452.anIntArray451[local36], local1452.anIntArray451[local38], local1452.anIntArray451[local40]);
								}
								arg3.anInt5453 = 0;
							} else {
								arg3.method4353(local65, local240, local501, local42, local176, local56, this.aClass200_Sub1_10.anInt5399);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort97; local436++) {
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
						arg3.aBoolean373 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt5452 || local257 > arg3.anInt5452 || local313 > arg3.anInt5452;
						if (local341 >= 765) {
							arg3.method4353(local369, local425, local285, local464, local257, local313, this.aClass200_Sub1_10.anInt5399);
						} else if (local341 > 0) {
							if ((local1452.anIntArray451[local296] & 0xFFFFFF) != 0) {
								arg3.method4348(local369, local425, local285, local464, local257, local313, Static346.method4497(arg6[local296], local1452.anIntArray451[local296], this.aClass200_Sub1_10.anInt5399), Static346.method4497(arg6[local352], local1452.anIntArray451[local352], this.aClass200_Sub1_10.anInt5399), Static346.method4497(arg6[local408], local1452.anIntArray451[local408], this.aClass200_Sub1_10.anInt5399));
							}
						} else if ((local1452.anIntArray451[local296] & 0xFFFFFF) != 0) {
							arg3.method4348(local369, local425, local285, local464, local257, local313, local1452.anIntArray451[local296], local1452.anIntArray451[local352], local1452.anIntArray451[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte26 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6303;
			local24 = local19 + super.anInt6303;
			local29 = arg1 * super.anInt6303;
			local34 = local29 + super.anInt6303;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte26 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray57[arg0][arg1];
				local65 = this.anIntArrayArray57[arg0 + 1][arg1];
				local240 = this.anIntArrayArray57[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray57[arg0][arg1 + 1];
				if (this.anInt6315 == -1) {
					local82 = this.anInt6305 + (this.anInt6312 * local19 + this.anInt6314 * local56 + this.anInt6316 * local29 >> 15);
					if (local82 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local105 = this.anInt6305 + (this.anInt6312 * local24 + this.anInt6314 * local65 + this.anInt6316 * local29 >> 15);
					if (local105 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local128 = this.anInt6305 + (this.anInt6312 * local24 + this.anInt6314 * local240 + this.anInt6316 * local34 >> 15);
					if (local128 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local151 = this.anInt6305 + (this.anInt6312 * local19 + this.anInt6314 * local501 + this.anInt6316 * local34 >> 15);
					if (local151 <= this.aClass200_Sub1_10.lb) {
						return;
					}
				} else {
					local151 = this.anInt6315;
					local128 = this.anInt6315;
					local105 = this.anInt6315;
					local82 = this.anInt6315;
				}
				if (arg2) {
					local176 = local82 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort33 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort32 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort29 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort30 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass200_Sub1_10.aBoolean370) {
					local176 = local82 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt6317 + (this.anInt6313 * local19 + this.anInt6307 * local56 + this.anInt6306 * local29 >> 15);
				local268 = arg3.anInt5451 + local257 * this.aClass200_Sub1_10.anInt5422 / local82;
				local285 = this.anInt6311 + (this.anInt6304 * local19 + this.anInt6308 * local56 + this.anInt6309 * local29 >> 15);
				local296 = arg3.anInt5449 + local285 * this.aClass200_Sub1_10.anInt5418 / local82;
				local313 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local65 + this.anInt6306 * local29 >> 15);
				local324 = arg3.anInt5451 + local313 * this.aClass200_Sub1_10.anInt5422 / local105;
				local341 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local65 + this.anInt6309 * local29 >> 15);
				local352 = arg3.anInt5449 + local341 * this.aClass200_Sub1_10.anInt5418 / local105;
				local369 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local240 + this.anInt6306 * local34 >> 15);
				local380 = arg3.anInt5451 + local369 * this.aClass200_Sub1_10.anInt5422 / local128;
				local397 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local240 + this.anInt6309 * local34 >> 15);
				local408 = arg3.anInt5449 + local397 * this.aClass200_Sub1_10.anInt5418 / local128;
				local425 = this.anInt6317 + (this.anInt6313 * local19 + this.anInt6307 * local501 + this.anInt6306 * local34 >> 15);
				local436 = arg3.anInt5451 + local425 * this.aClass200_Sub1_10.anInt5422 / local151;
				local453 = this.anInt6311 + (this.anInt6304 * local19 + this.anInt6308 * local501 + this.anInt6309 * local34 >> 15);
				local464 = arg3.anInt5449 + local453 * this.aClass200_Sub1_10.anInt5418 / local151;
			} else {
				local56 = this.anIntArrayArray57[arg0][arg1];
				if (this.anInt6315 == -1) {
					local65 = this.anInt6314 * local56;
					local82 = this.anInt6305 + (this.anInt6312 * local19 + local65 + this.anInt6316 * local29 >> 15);
					if (local82 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local105 = this.anInt6305 + (this.anInt6312 * local24 + local65 + this.anInt6316 * local29 >> 15);
					if (local105 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local128 = this.anInt6305 + (this.anInt6312 * local24 + local65 + this.anInt6316 * local34 >> 15);
					if (local128 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local151 = this.anInt6305 + (this.anInt6312 * local19 + local65 + this.anInt6316 * local34 >> 15);
					if (local151 <= this.aClass200_Sub1_10.lb) {
						return;
					}
				} else {
					local151 = this.anInt6315;
					local128 = this.anInt6315;
					local105 = this.anInt6315;
					local82 = this.anInt6315;
				}
				if (this.aClass200_Sub1_10.aBoolean370) {
					local176 = local82 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass200_Sub1_10.anInt5417;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt6307 * local56;
				local240 = this.anInt6308 * local56;
				local257 = this.anInt6317 + (this.anInt6313 * local19 + local65 + this.anInt6306 * local29 >> 15);
				local268 = arg3.anInt5451 + local257 * this.aClass200_Sub1_10.anInt5422 / local82;
				local285 = this.anInt6311 + (this.anInt6304 * local19 + local240 + this.anInt6309 * local29 >> 15);
				local296 = arg3.anInt5449 + local285 * this.aClass200_Sub1_10.anInt5418 / local82;
				local313 = this.anInt6317 + (this.anInt6313 * local24 + local65 + this.anInt6306 * local29 >> 15);
				local324 = arg3.anInt5451 + local313 * this.aClass200_Sub1_10.anInt5422 / local105;
				local341 = this.anInt6311 + (this.anInt6304 * local24 + local240 + this.anInt6309 * local29 >> 15);
				local352 = arg3.anInt5449 + local341 * this.aClass200_Sub1_10.anInt5418 / local105;
				local369 = this.anInt6317 + (this.anInt6313 * local24 + local65 + this.anInt6306 * local34 >> 15);
				local380 = arg3.anInt5451 + local369 * this.aClass200_Sub1_10.anInt5422 / local128;
				local397 = this.anInt6311 + (this.anInt6304 * local24 + local240 + this.anInt6309 * local34 >> 15);
				local408 = arg3.anInt5449 + local397 * this.aClass200_Sub1_10.anInt5418 / local128;
				local425 = this.anInt6317 + (this.anInt6313 * local19 + local65 + this.anInt6306 * local34 >> 15);
				local436 = arg3.anInt5451 + local425 * this.aClass200_Sub1_10.anInt5422 / local151;
				local453 = this.anInt6311 + (this.anInt6304 * local19 + local240 + this.anInt6309 * local34 >> 15);
				local464 = arg3.anInt5449 + local453 * this.aClass200_Sub1_10.anInt5418 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort31 != -1 && this.method4999(this.aClass200_Sub1_10.anInterface8_134.method4125(local6.aShort31).aByte55);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean373 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt5452 || local436 > arg3.anInt5452 || local324 > arg3.anInt5452;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt5453 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort31 >= 0) {
							arg3.method4351(local408, local464, local352, local380, local436, local324, this.aClass200_Sub1_10.anInt5399, local40, local42, local38, local6.anInt2842, local6.anInt2844, local6.anInt2841, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort31);
						} else {
							arg3.method4348(local408, local464, local352, local380, local436, local324, Static93.method1317(local6.anInt2842, local40 << 24 | this.aClass200_Sub1_10.anInt5399), Static93.method1317(local6.anInt2844, local42 << 24 | this.aClass200_Sub1_10.anInt5399), Static93.method1317(local6.anInt2841, local38 << 24 | this.aClass200_Sub1_10.anInt5399));
						}
					} else if (local6.aShort31 >= 0) {
						arg3.method4349(local408, local464, local352, local380, local436, local324, local6.anInt2842, local6.anInt2844, local6.anInt2841, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort31);
					} else {
						arg3.method4348(local408, local464, local352, local380, local436, local324, local6.anInt2842, local6.anInt2844, local6.anInt2841);
					}
					arg3.anInt5453 = 0;
				} else {
					arg3.method4353(local408, local464, local352, local380, local436, local324, this.aClass200_Sub1_10.anInt5399);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean373 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt5452 || local324 > arg3.anInt5452 || local436 > arg3.anInt5452;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt5453 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort31 >= 0) {
							arg3.method4351(local296, local352, local464, local268, local324, local436, this.aClass200_Sub1_10.anInt5399, local36, local38, local42, local6.anInt2840, local6.anInt2841, local6.anInt2844, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort31);
						} else {
							arg3.method4348(local296, local352, local464, local268, local324, local436, Static93.method1317(local6.anInt2840, local36 << 24 | this.aClass200_Sub1_10.anInt5399), Static93.method1317(local6.anInt2841, local38 << 24 | this.aClass200_Sub1_10.anInt5399), Static93.method1317(local6.anInt2844, local42 << 24 | this.aClass200_Sub1_10.anInt5399));
						}
					} else if (local6.aShort31 >= 0) {
						arg3.method4349(local296, local352, local464, local268, local324, local436, local6.anInt2840, local6.anInt2841, local6.anInt2844, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort31);
					} else {
						arg3.method4348(local296, local352, local464, local268, local324, local436, local6.anInt2840, local6.anInt2841, local6.anInt2844);
					}
					arg3.anInt5453 = 0;
					return;
				}
				arg3.method4353(local296, local352, local464, local268, local324, local436, this.aClass200_Sub1_10.anInt5399);
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)V")
	@Override
	public void method4993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class159 local4 = this.aClass200_Sub1_10.method4316(Thread.currentThread());
		local4.aClass201_2.anInt5453 = 0;
		if (this.aClass106ArrayArray1 != null) {
			this.method4995(arg0, arg1, this.aClass200_Sub1_10.aBoolean371, local4.aClass201_2, local4.anIntArray320, local4.anIntArray309, local4.anIntArray326);
		} else if (this.aClass217ArrayArray1 != null) {
			this.method4997(arg0, arg1, local4.aClass201_2, local4.anIntArray320, local4.anIntArray309, local4.anIntArray326);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method4991(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4988(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class159 local4 = this.aClass200_Sub1_10.method4316(Thread.currentThread());
		@Pc(7) Class201 local7 = local4.aClass201_2;
		local7.anInt5453 = 0;
		local7.aBoolean373 = false;
		if (this.aClass106ArrayArray1 != null) {
			this.method4996(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray320, local4.anIntArray309);
		} else if (this.aClass217ArrayArray1 != null) {
			this.method4994(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray320, local4.anIntArray309);
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class29_Sub2 local3 = this.aClass200_Sub1_10.aClass29_Sub2_3;
		this.anInt6315 = -1;
		this.anInt6313 = local3.anInt3839;
		this.anInt6307 = local3.anInt3845;
		this.anInt6306 = local3.anInt3842;
		this.anInt6317 = local3.anInt3841;
		this.anInt6304 = local3.anInt3836;
		this.anInt6308 = local3.anInt3837;
		this.anInt6309 = local3.anInt3835;
		this.anInt6311 = local3.anInt3843;
		this.anInt6312 = local3.anInt3846;
		this.anInt6314 = local3.anInt3844;
		this.anInt6316 = local3.anInt3840;
		this.anInt6305 = local3.anInt3838;
	}

	@OriginalMember(owner = "client!su", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class5_Sub2_Sub1 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub1 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass217ArrayArray1 == null) {
			this.aClass217ArrayArray1 = new Class217[super.anInt6301][super.anInt6299];
			this.aClass188ArrayArray1 = new Class188[super.anInt6301][super.anInt6299];
		} else if (this.aClass106ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt6303 || local70 != 0 && local70 != super.anInt6303) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class188 local95 = new Class188();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort56 = local99;
			local95.aShortArray87 = new short[local99];
			local95.aShortArray88 = new short[local99];
			local95.aShortArray80 = new short[local99];
			local95.aShortArray83 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt6303) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				} else if (local129 == super.anInt6303 && local133 == super.anInt6303) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt6303 && local133 == 0) {
					local95.aShortArray87[local124] = (short) (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt6303 - local129) + (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt6303 - local129) + (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray87[local124] = (short) (local288 * (super.anInt6303 - local133) + local335 * local133 >> super.anInt6300 * 2);
				}
				local288 = (arg0 << super.anInt6300) + local129;
				local335 = (arg1 << super.anInt6300) + local133;
				local95.aShortArray88[local124] = (short) local129;
				local95.aShortArray83[local124] = (short) local133;
				local95.aShortArray80[local124] = (short) (this.ca(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray87[local124] < 2) {
					local95.aShortArray87[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass200_Sub1_10.anInterface8_134.method4125(arg11[local288]).aBoolean321) {
					local415 = true;
				}
			}
			local95.anIntArray368 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray367 = new int[local133];
			}
			local95.aShortArray85 = new short[local133];
			local95.aShortArray86 = new short[local133];
			local95.aShortArray81 = new short[local133];
			if (local415) {
				local95.aShortArray82 = new short[local133];
				local95.aShortArray84 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray368[local95.aShort57] = Static297.method3688(arg9[local335]);
					} else {
						local95.anIntArray368[local95.aShort57] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray367[local95.aShort57] = -1;
						} else {
							local95.anIntArray367[local95.aShort57] = Static297.method3688(arg10[local335]);
						}
					}
					local95.aShortArray85[local95.aShort57] = (short) arg6[local335];
					local95.aShortArray86[local95.aShort57] = (short) arg7[local335];
					local95.aShortArray81[local95.aShort57] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass200_Sub1_10.anInterface8_134.method4125(arg11[local335]).aBoolean321) {
							local95.aShortArray82[local95.aShort57] = -1;
						} else {
							local95.aShortArray82[local95.aShort57] = (short) arg11[local335];
							local95.aShortArray84[local95.aShort57] = (short) arg12[local335];
						}
					}
					local95.aShort57++;
				}
			}
			this.aClass188ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class217 local644 = new Class217();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt5919 = Static185.method2531(Static297.method3688(arg10[0]), this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte80 = (byte) (local644.aByte80 | 0x2);
				}
			}
			if (this.anIntArrayArray57[arg0][arg1] == this.anIntArrayArray57[arg0 + 1][arg1] && this.anIntArrayArray57[arg0][arg1] == this.anIntArrayArray57[arg0 + 1][arg1 + 1] && this.anIntArrayArray57[arg0][arg1] == this.anIntArrayArray57[arg0][arg1 + 1]) {
				local644.aByte80 = (byte) (local644.aByte80 | 0x1);
			}
			if (local70 == -1 || (local644.aByte80 & 0x2) != 0 || this.aClass200_Sub1_10.anInterface8_134.method4125(local70).aBoolean321) {
				@Pc(845) short local845 = Static297.method3688(local64);
				local644.aShort85 = (short) Static185.method2531(local845, this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local644.aShort86 = (short) Static185.method2531(local845, this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local644.aShort84 = (short) Static185.method2531(local845, this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local644.aShort82 = (short) Static185.method2531(local845, this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local644.aShort83 = -1;
			} else {
				local644.aShort85 = (short) (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]);
				local644.aShort86 = (short) (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]);
				local644.aShort84 = (short) (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]);
				local644.aShort82 = (short) (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]);
				local644.aShort83 = (short) local70;
			}
			this.aClass217ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(IIIIIII[[ZLclient!qh;[I[I)V")
	private void method4996(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class201 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean375 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass106ArrayArray1[local22][local25] != null) {
						@Pc(50) Class106 local50 = this.aClass106ArrayArray1[local22][local25];
						if (local50.aShort31 != -1 && (local50.aByte26 & 0x2) == 0 && local50.anInt2843 == 0) {
							local68 = this.aClass200_Sub1_10.method4321(local50.aShort31);
							arg5.method4352(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static185.method2531(local68, local50.anInt2842), Static185.method2531(local68, local50.anInt2844), Static185.method2531(local68, local50.anInt2841));
							arg5.method4352(local20, local20, local20 - 4, local16, local16 + 4, local16, Static185.method2531(local68, local50.anInt2840), Static185.method2531(local68, local50.anInt2841), Static185.method2531(local68, local50.anInt2844));
						} else if (local50.anInt2843 == 0) {
							arg5.method4348(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt2842, local50.anInt2844, local50.anInt2841);
							arg5.method4348(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt2840, local50.anInt2841, local50.anInt2844);
						} else {
							local68 = local50.anInt2843;
							arg5.method4348(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static93.method1317(local68, local50.anInt2842 & 0xFF000000), Static93.method1317(local68, local50.anInt2844 & 0xFF000000), Static93.method1317(local68, local50.anInt2841 & 0xFF000000));
							arg5.method4348(local20, local20, local20 - 4, local16, local16 + 4, local16, Static93.method1317(local68, local50.anInt2840 & 0xFF000000), Static93.method1317(local68, local50.anInt2841 & 0xFF000000), Static93.method1317(local68, local50.anInt2844 & 0xFF000000));
						}
					} else if (this.aClass230ArrayArray1[local22][local25] != null) {
						@Pc(259) Class230 local259 = this.aClass230ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort96; local68++) {
							arg6[local68] = local16 + local259.aShortArray107[local68] * 4 / super.anInt6303;
							arg7[local68] = local20 - local259.aShortArray108[local68] * 4 / super.anInt6303;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort97; local297++) {
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
							if (local259.anIntArray450 != null && local259.anIntArray450[local297] != 0 && (local259.aShortArray106 == null || local259.aShortArray106 != null && local259.aShortArray106[local297] == -1)) {
								local359 = local259.anIntArray450[local297];
								arg5.method4348(local326, local330, local334, local314, local318, local322, Static93.method1317(local359, -(local259.anIntArray451[local302] & -16777216) - 16777216), Static93.method1317(local359, -(local259.anIntArray451[local306] & -16777216) - 16777216), Static93.method1317(local359, -(local259.anIntArray451[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray106 == null || local259.aShortArray106[local297] == -1) {
								arg5.method4348(local326, local330, local334, local314, local318, local322, local259.anIntArray451[local302], local259.anIntArray451[local306], local259.anIntArray451[local310]);
							} else {
								local359 = this.aClass200_Sub1_10.method4321(local259.aShortArray106[local297]);
								arg5.method4352(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean375 = true;
	}

	@OriginalMember(owner = "client!su", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class5_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!su", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		this.aByteArrayArray15 = null;
		this.aByteArrayArray16 = null;
	}

	@OriginalMember(owner = "client!su", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass106ArrayArray1 == null) {
			this.aClass106ArrayArray1 = new Class106[super.anInt6301][super.anInt6299];
			this.aClass230ArrayArray1 = new Class230[super.anInt6301][super.anInt6299];
		} else if (this.aClass217ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static175.anIntArray132[Static297.method3688(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static175.anIntArray132[Static297.method3688(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt6303 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt6303 && arg4[local116] == super.anInt6303) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt6303) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt6303 && arg2[local244] != arg2[0] - super.anInt6303) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt6303 && arg4[local244] != arg4[0] - super.anInt6303) {
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
			@Pc(334) Class106 local334 = new Class106();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt2843 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte26 = (byte) (local334.aByte26 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray57[arg0][arg1] == this.anIntArrayArray57[arg0 + 1][arg1] && this.anIntArrayArray57[arg0][arg1] == this.anIntArrayArray57[arg0 + 1][arg1 + 1] && this.anIntArrayArray57[arg0][arg1] == this.anIntArrayArray57[arg0][arg1 + 1]) {
				local334.aByte26 = (byte) (local334.aByte26 | 0x1);
			}
			if (local342 == -1 || (local334.aByte26 & 0x2) != 0 || this.aClass200_Sub1_10.anInterface8_134.method4125(local342).aBoolean321) {
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
				local334.anInt2840 = Static346.method4497(local527, Static473.method4998(arg6[local104] >> 8, this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]), arg10);
				if (local334.anInt2843 != 0) {
					local334.anInt2840 |= this.aByteArrayArray16[arg0][arg1] + 255 - this.aByteArrayArray15[arg0][arg1] << 25;
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
				local334.anInt2841 = Static346.method4497(local527, Static473.method4998(arg6[local106] >> 8, this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]), arg10);
				if (local334.anInt2843 != 0) {
					local334.anInt2841 |= this.aByteArrayArray16[arg0 + 1][arg1] + 255 - this.aByteArrayArray15[arg0 + 1][arg1] << 25;
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
				local334.anInt2842 = Static346.method4497(local527, Static473.method4998(arg6[local108] >> 8, this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt2843 != 0) {
					local334.anInt2842 |= this.aByteArrayArray16[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray15[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt2844 = Static346.method4497(local527, Static473.method4998(arg6[local110] >> 8, this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]), arg10);
				if (local334.anInt2843 != 0) {
					local334.anInt2844 |= this.aByteArrayArray16[arg0][arg1 + 1] + 255 - this.aByteArrayArray15[arg0][arg1 + 1] << 25;
				}
				local334.aShort31 = -1;
			} else {
				local334.anInt2840 = this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
				local334.anInt2841 = this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
				local334.anInt2842 = this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
				local334.anInt2844 = this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
				local334.aShort31 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort29 = (short) arg5[local108];
				local334.aShort30 = (short) arg5[local110];
				local334.aShort32 = (short) arg5[local106];
				local334.aShort33 = (short) arg5[local104];
			}
			this.aClass106ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class230 local888 = new Class230();
		local888.aShort96 = (short) arg2.length;
		local888.aShort97 = (short) (arg2.length / 3);
		local888.aShortArray107 = new short[local888.aShort96];
		local888.aShortArray104 = new short[local888.aShort96];
		local888.aShortArray108 = new short[local888.aShort96];
		local888.anIntArray451 = new int[local888.aShort96];
		if (arg5 != null) {
			local888.aShortArray103 = new short[local888.aShort96];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort96; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt6303) {
				local958 = this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1];
			} else if (local342 == super.anInt6303 && local527 == super.anInt6303) {
				local958 = this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt6303 && local527 == 0) {
				local958 = this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray15[arg0][arg1] - this.aByteArrayArray16[arg0][arg1]) * (super.anInt6303 - local342) + (this.aByteArrayArray15[arg0 + 1][arg1] - this.aByteArrayArray16[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray15[arg0][arg1 + 1] - this.aByteArrayArray16[arg0][arg1 + 1]) * (super.anInt6303 - local342) + (this.aByteArrayArray15[arg0 + 1][arg1 + 1] - this.aByteArrayArray16[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt6303 - local527) + local1126 * local527 >> super.anInt6300 * 2;
			}
			local1079 = (arg0 << super.anInt6300) + local342;
			local1126 = (arg1 << super.anInt6300) + local527;
			local888.aShortArray107[local244] = (short) local342;
			local888.aShortArray108[local244] = (short) local527;
			local888.aShortArray104[local244] = (short) (this.ca(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass200_Sub1_10.anInterface8_134.method4125(arg8[local244]).aBoolean321) {
				local888.anIntArray451[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray103[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray451[local244] = Static346.method4497(local1226, Static473.method4998(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray451[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray451[local244] = 0;
			} else {
				local888.anIntArray451[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort97; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass200_Sub1_10.anInterface8_134.method4125(arg8[local527 * 3]).aBoolean321) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray450 = new int[local888.aShort97];
		}
		if (local1296) {
			local888.aShortArray106 = new short[local888.aShort97];
			local888.aShortArray105 = new short[local888.aShort97];
		}
		for (local958 = 0; local958 < local888.aShort97; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray450[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aBoolean321) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aBoolean321) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aBoolean321) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray106[local958] = (short) local1384;
					local888.aShortArray105[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aBoolean321) {
							local888.anIntArray451[local1079] = Static175.anIntArray132[Static297.method3688(this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aShort54 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aBoolean321) {
							local888.anIntArray451[local1126] = Static175.anIntArray132[Static297.method3688(this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aShort54 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aBoolean321) {
							local888.anIntArray451[local1226] = Static175.anIntArray132[Static297.method3688(this.aClass200_Sub1_10.anInterface8_134.method4125(local1384).aShort54 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray106[local958] = -1;
				}
			}
		}
		this.aClass230ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILclient!qh;[I[I[I)V")
	private void method4997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class201 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class217 local6 = this.aClass217ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class188 local1022 = this.aClass188ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt6315 == -1) {
					for (local362 = 0; local362 < local1022.aShort56; local362++) {
						local24 = local1022.aShortArray88[local362] + (arg0 << super.anInt6300);
						local1046 = local1022.aShortArray80[local362];
						local34 = local1022.aShortArray83[local362] + (arg1 << super.anInt6300);
						local306 = this.anInt6305 + (this.anInt6312 * local24 + this.anInt6314 * local1046 + this.anInt6316 * local34 >> 15);
						if (local306 <= this.aClass200_Sub1_10.lb) {
							return;
						}
						local194 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local1046 + this.anInt6306 * local34 >> 15);
						local250 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local1046 + this.anInt6309 * local34 >> 15);
						arg3[local362] = arg2.anInt5451 + local194 * this.aClass200_Sub1_10.anInt5422 / local306;
						arg4[local362] = arg2.anInt5449 + local250 * this.aClass200_Sub1_10.anInt5418 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort56; local362++) {
						local24 = local1022.aShortArray88[local362] + (arg0 << super.anInt6300);
						local1046 = local1022.aShortArray80[local362];
						local34 = local1022.aShortArray83[local362] + (arg1 << super.anInt6300);
						local194 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local1046 + this.anInt6306 * local34 >> 15);
						local250 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local1046 + this.anInt6309 * local34 >> 15);
						arg3[local362] = arg2.anInt5451 + local194 * this.aClass200_Sub1_10.anInt5422 / this.anInt6315;
						arg4[local362] = arg2.anInt5449 + local250 * this.aClass200_Sub1_10.anInt5418 / this.anInt6315;
					}
				}
				if (local1022.aShortArray82 != null) {
					local362 = this.anIntArrayArray57[arg0][arg1];
					local222 = this.anIntArrayArray57[arg0 + 1][arg1];
					local278 = this.anIntArrayArray57[arg0][arg1 + 1];
					local334 = arg0 * super.anInt6303;
					local390 = local334 + super.anInt6303;
					local183 = arg1 * super.anInt6303;
					local239 = local183 + super.anInt6303;
					local295 = this.anInt6317 + (this.anInt6313 * local334 + this.anInt6307 * local362 + this.anInt6306 * local183 >> 15);
					local351 = this.anInt6311 + (this.anInt6304 * local334 + this.anInt6308 * local362 + this.anInt6309 * local183 >> 15);
					local211 = this.anInt6305 + (this.anInt6312 * local334 + this.anInt6314 * local362 + this.anInt6316 * local183 >> 15);
					local267 = this.anInt6317 + (this.anInt6313 * local390 + this.anInt6307 * local222 + this.anInt6306 * local183 >> 15);
					local323 = this.anInt6311 + (this.anInt6304 * local390 + this.anInt6308 * local222 + this.anInt6309 * local183 >> 15);
					local379 = this.anInt6305 + (this.anInt6312 * local390 + this.anInt6314 * local222 + this.anInt6316 * local183 >> 15);
					local72 = this.anInt6317 + (this.anInt6313 * local334 + this.anInt6307 * local278 + this.anInt6306 * local239 >> 15);
					local95 = this.anInt6311 + (this.anInt6304 * local334 + this.anInt6308 * local278 + this.anInt6309 * local239 >> 15);
					local118 = this.anInt6305 + (this.anInt6312 * local334 + this.anInt6314 * local278 + this.anInt6316 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort57; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray85[local141];
						@Pc(1496) short local1496 = local1022.aShortArray86[local141];
						@Pc(1501) short local1501 = local1022.aShortArray81[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean373 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt5452 || local1509 > arg2.anInt5452 || local1513 > arg2.anInt5452;
							@Pc(1569) short local1569 = local1022.aShortArray82[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray368[local141];
								if (local1624 != -1) {
									arg2.method4352(local1517, local1521, local1525, local427, local1509, local1513, Static185.method2531(local1624, local1022.aShortArray87[local1491]), Static185.method2531(local1624, local1022.aShortArray87[local1496]), Static185.method2531(local1624, local1022.aShortArray87[local1501]));
								}
							} else {
								if (this.method4999(this.aClass200_Sub1_10.anInterface8_134.method4125(local1569).aByte55)) {
									arg2.anInt5453 = 100;
								}
								arg2.method4349(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray87[local1491], local1022.aShortArray87[local1496], local1022.aShortArray87[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt5453 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort57; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray85[local362];
					@Pc(1675) short local1675 = local1022.aShortArray86[local362];
					@Pc(1680) short local1680 = local1022.aShortArray81[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray368[local362];
						if (local267 != -1) {
							arg2.aBoolean373 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt5452 || local183 > arg2.anInt5452 || local239 > arg2.anInt5452;
							arg2.method4352(local295, local351, local211, local390, local183, local239, Static185.method2531(local267, local1022.aShortArray87[local1670]), Static185.method2531(local267, local1022.aShortArray87[local1675]), Static185.method2531(local267, local1022.aShortArray87[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte80 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt6303;
			local24 = local19 + super.anInt6303;
			@Pc(29) int local29 = arg1 * super.anInt6303;
			local34 = local29 + super.anInt6303;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte80 & 0x1) == 0) {
				local46 = this.anIntArrayArray57[arg0][arg1];
				local55 = this.anIntArrayArray57[arg0 + 1][arg1];
				local166 = this.anIntArrayArray57[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray57[arg0][arg1 + 1];
				if (this.anInt6315 == -1) {
					local72 = this.anInt6305 + (this.anInt6312 * local19 + this.anInt6314 * local46 + this.anInt6316 * local29 >> 15);
					if (local72 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local95 = this.anInt6305 + (this.anInt6312 * local24 + this.anInt6314 * local55 + this.anInt6316 * local29 >> 15);
					if (local95 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local118 = this.anInt6305 + (this.anInt6312 * local24 + this.anInt6314 * local166 + this.anInt6316 * local34 >> 15);
					if (local118 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local141 = this.anInt6305 + (this.anInt6312 * local19 + this.anInt6314 * local427 + this.anInt6316 * local34 >> 15);
					if (local141 <= this.aClass200_Sub1_10.lb) {
						return;
					}
				} else {
					local141 = this.anInt6315;
					local118 = this.anInt6315;
					local95 = this.anInt6315;
					local72 = this.anInt6315;
				}
				local183 = this.anInt6317 + (this.anInt6313 * local19 + this.anInt6307 * local46 + this.anInt6306 * local29 >> 15);
				local194 = arg2.anInt5451 + local183 * this.aClass200_Sub1_10.anInt5422 / local72;
				local211 = this.anInt6311 + (this.anInt6304 * local19 + this.anInt6308 * local46 + this.anInt6309 * local29 >> 15);
				local222 = arg2.anInt5449 + local211 * this.aClass200_Sub1_10.anInt5418 / local72;
				local239 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local55 + this.anInt6306 * local29 >> 15);
				local250 = arg2.anInt5451 + local239 * this.aClass200_Sub1_10.anInt5422 / local95;
				local267 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local55 + this.anInt6309 * local29 >> 15);
				local278 = arg2.anInt5449 + local267 * this.aClass200_Sub1_10.anInt5418 / local95;
				local295 = this.anInt6317 + (this.anInt6313 * local24 + this.anInt6307 * local166 + this.anInt6306 * local34 >> 15);
				local306 = arg2.anInt5451 + local295 * this.aClass200_Sub1_10.anInt5422 / local118;
				local323 = this.anInt6311 + (this.anInt6304 * local24 + this.anInt6308 * local166 + this.anInt6309 * local34 >> 15);
				local334 = arg2.anInt5449 + local323 * this.aClass200_Sub1_10.anInt5418 / local118;
				local351 = this.anInt6317 + (this.anInt6313 * local19 + this.anInt6307 * local427 + this.anInt6306 * local34 >> 15);
				local362 = arg2.anInt5451 + local351 * this.aClass200_Sub1_10.anInt5422 / local141;
				local379 = this.anInt6311 + (this.anInt6304 * local19 + this.anInt6308 * local427 + this.anInt6309 * local34 >> 15);
				local390 = arg2.anInt5449 + local379 * this.aClass200_Sub1_10.anInt5418 / local141;
			} else {
				local46 = this.anIntArrayArray57[arg0][arg1];
				if (this.anInt6315 == -1) {
					local55 = this.anInt6314 * local46;
					local72 = this.anInt6305 + (this.anInt6312 * local19 + local55 + this.anInt6316 * local29 >> 15);
					if (local72 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local95 = this.anInt6305 + (this.anInt6312 * local24 + local55 + this.anInt6316 * local29 >> 15);
					if (local95 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local118 = this.anInt6305 + (this.anInt6312 * local24 + local55 + this.anInt6316 * local34 >> 15);
					if (local118 <= this.aClass200_Sub1_10.lb) {
						return;
					}
					local141 = this.anInt6305 + (this.anInt6312 * local19 + local55 + this.anInt6316 * local34 >> 15);
					if (local141 <= this.aClass200_Sub1_10.lb) {
						return;
					}
				} else {
					local141 = this.anInt6315;
					local118 = this.anInt6315;
					local95 = this.anInt6315;
					local72 = this.anInt6315;
				}
				local55 = this.anInt6307 * local46;
				local166 = this.anInt6308 * local46;
				local183 = this.anInt6317 + (this.anInt6313 * local19 + local55 + this.anInt6306 * local29 >> 15);
				local194 = arg2.anInt5451 + local183 * this.aClass200_Sub1_10.anInt5422 / local72;
				local211 = this.anInt6311 + (this.anInt6304 * local19 + local166 + this.anInt6309 * local29 >> 15);
				local222 = arg2.anInt5449 + local211 * this.aClass200_Sub1_10.anInt5418 / local72;
				local239 = this.anInt6317 + (this.anInt6313 * local24 + local55 + this.anInt6306 * local29 >> 15);
				local250 = arg2.anInt5451 + local239 * this.aClass200_Sub1_10.anInt5422 / local95;
				local267 = this.anInt6311 + (this.anInt6304 * local24 + local166 + this.anInt6309 * local29 >> 15);
				local278 = arg2.anInt5449 + local267 * this.aClass200_Sub1_10.anInt5418 / local95;
				local295 = this.anInt6317 + (this.anInt6313 * local24 + local55 + this.anInt6306 * local34 >> 15);
				local306 = arg2.anInt5451 + local295 * this.aClass200_Sub1_10.anInt5422 / local118;
				local323 = this.anInt6311 + (this.anInt6304 * local24 + local166 + this.anInt6309 * local34 >> 15);
				local334 = arg2.anInt5449 + local323 * this.aClass200_Sub1_10.anInt5418 / local118;
				local351 = this.anInt6317 + (this.anInt6313 * local19 + local55 + this.anInt6306 * local34 >> 15);
				local362 = arg2.anInt5451 + local351 * this.aClass200_Sub1_10.anInt5422 / local141;
				local379 = this.anInt6311 + (this.anInt6304 * local19 + local166 + this.anInt6309 * local34 >> 15);
				local390 = arg2.anInt5449 + local379 * this.aClass200_Sub1_10.anInt5418 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean373 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt5452 || local362 > arg2.anInt5452 || local250 > arg2.anInt5452;
				if (local6.aShort83 >= 0) {
					if (this.method4999(this.aClass200_Sub1_10.anInterface8_134.method4125(local6.aShort83).aByte55)) {
						arg2.anInt5453 = 100;
					}
					arg2.method4349(local334, local390, local278, local306, local362, local250, local6.aShort84 & 0xFFFF, local6.aShort82 & 0xFFFF, local6.aShort86 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort83);
					arg2.anInt5453 = 0;
				} else {
					arg2.method4352(local334, local390, local278, local306, local362, local250, local6.aShort84 & 0xFFFF, local6.aShort82 & 0xFFFF, local6.aShort86 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean373 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt5452 || local250 > arg2.anInt5452 || local362 > arg2.anInt5452;
				if (local6.aShort83 >= 0) {
					if (this.method4999(this.aClass200_Sub1_10.anInterface8_134.method4125(local6.aShort83).aByte55)) {
						arg2.anInt5453 = 100;
					}
					arg2.method4349(local222, local278, local390, local194, local250, local362, local6.aShort85 & 0xFFFF, local6.aShort86 & 0xFFFF, local6.aShort82 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort83);
					arg2.anInt5453 = 0;
					return;
				}
				arg2.method4352(local222, local278, local390, local194, local250, local362, local6.aShort85 & 0xFFFF, local6.aShort86 & 0xFFFF, local6.aShort82 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Lclient!rd;[I)V")
	@Override
	public void method4987(@OriginalArg(0) Class5_Sub19 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "(I)Z")
	private boolean method4999(@OriginalArg(0) int arg0) {
		if ((this.anInt6310 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!su", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray16[arg0][arg1] < arg2) {
			this.aByteArrayArray16[arg0][arg1] = (byte) arg2;
		}
	}
}
