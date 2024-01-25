import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class96_Sub2 extends Class96 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
	private int anInt5781;

	@OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
	private int anInt5782;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	private int anInt5783;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
	private int anInt5784;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	private int anInt5785;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "[[Lclient!ao;")
	private Class14[][] aClass14ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	private int anInt5786;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "[[Lclient!ml;")
	private Class172[][] aClass172ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
	private int anInt5787;

	@OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
	private int anInt5788;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	private int anInt5789;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
	private int anInt5791;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	private int anInt5792;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "[[Lclient!as;")
	private Class16[][] aClass16ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	private int anInt5794;

	@OriginalMember(owner = "client!pi", name = "G", descriptor = "[[Lclient!bd;")
	private Class23[][] aClass23ArrayArray1;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
	private int anInt5790 = -1;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "Lclient!hj;")
	private final Class106_Sub1 aClass106_Sub1_8;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	private final int anInt5793;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "[[B")
	private byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "[[B")
	private byte[][] aByteArrayArray17;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!hj;IIII[[I[[II)V")
	public Class96_Sub2(@OriginalArg(0) Class106_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass106_Sub1_8 = arg0;
		this.anInt5793 = arg2;
		this.anIntArrayArray45 = arg5;
		this.aByteArrayArray16 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass106_Sub1_8.lb >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass106_Sub1_8.anInt3314 * local92 + this.aClass106_Sub1_8.anInt3299 * local98 + this.aClass106_Sub1_8.anInt3310 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray16[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray17 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method4431(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class33 local4 = this.aClass106_Sub1_8.method2586(Thread.currentThread());
		@Pc(7) Class218 local7 = local4.aClass218_1;
		local7.anInt6528 = 0;
		local7.aBoolean411 = false;
		if (this.aClass172ArrayArray1 != null) {
			this.method4442(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray92, local4.anIntArray84);
		} else if (this.aClass16ArrayArray1 != null) {
			this.method4439(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray92, local4.anIntArray84);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method4434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass16ArrayArray1 == null) {
			this.aClass16ArrayArray1 = new Class16[super.anInt5777][super.anInt5775];
			this.aClass14ArrayArray1 = new Class14[super.anInt5777][super.anInt5775];
		} else if (this.aClass172ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt5778 || local70 != 0 && local70 != super.anInt5778) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class14 local95 = new Class14();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort5 = local99;
			local95.aShortArray10 = new short[local99];
			local95.aShortArray8 = new short[local99];
			local95.aShortArray4 = new short[local99];
			local95.aShortArray5 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray10[local124] = (short) (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt5778) {
					local95.aShortArray10[local124] = (short) (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				} else if (local129 == super.anInt5778 && local133 == super.anInt5778) {
					local95.aShortArray10[local124] = (short) (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt5778 && local133 == 0) {
					local95.aShortArray10[local124] = (short) (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt5778 - local129) + (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt5778 - local129) + (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray10[local124] = (short) (local288 * (super.anInt5778 - local133) + local335 * local133 >> super.anInt5779 * 2);
				}
				local288 = (arg0 << super.anInt5779) + local129;
				local335 = (arg1 << super.anInt5779) + local133;
				local95.aShortArray8[local124] = (short) local129;
				local95.aShortArray5[local124] = (short) local133;
				local95.aShortArray4[local124] = (short) (this.ca(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray10[local124] < 2) {
					local95.aShortArray10[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass106_Sub1_8.anInterface7_10.method78(arg11[local288]).aBoolean274) {
					local415 = true;
				}
			}
			local95.anIntArray18 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray17 = new int[local133];
			}
			local95.aShortArray12 = new short[local133];
			local95.aShortArray11 = new short[local133];
			local95.aShortArray6 = new short[local133];
			if (local415) {
				local95.aShortArray7 = new short[local133];
				local95.aShortArray9 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray18[local95.aShort4] = Static285.method4173(arg9[local335]);
					} else {
						local95.anIntArray18[local95.aShort4] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray17[local95.aShort4] = -1;
						} else {
							local95.anIntArray17[local95.aShort4] = Static285.method4173(arg10[local335]);
						}
					}
					local95.aShortArray12[local95.aShort4] = (short) arg6[local335];
					local95.aShortArray11[local95.aShort4] = (short) arg7[local335];
					local95.aShortArray6[local95.aShort4] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass106_Sub1_8.anInterface7_10.method78(arg11[local335]).aBoolean274) {
							local95.aShortArray7[local95.aShort4] = -1;
						} else {
							local95.aShortArray7[local95.aShort4] = (short) arg11[local335];
							local95.aShortArray9[local95.aShort4] = (short) arg12[local335];
						}
					}
					local95.aShort4++;
				}
			}
			this.aClass14ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class16 local644 = new Class16();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt447 = Static43.method792(Static285.method4173(arg10[0]), this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte10 = (byte) (local644.aByte10 | 0x2);
				}
			}
			if (this.anIntArrayArray45[arg0][arg1] == this.anIntArrayArray45[arg0 + 1][arg1] && this.anIntArrayArray45[arg0][arg1] == this.anIntArrayArray45[arg0 + 1][arg1 + 1] && this.anIntArrayArray45[arg0][arg1] == this.anIntArrayArray45[arg0][arg1 + 1]) {
				local644.aByte10 = (byte) (local644.aByte10 | 0x1);
			}
			if (local70 == -1 || (local644.aByte10 & 0x2) != 0 || this.aClass106_Sub1_8.anInterface7_10.method78(local70).aBoolean274) {
				@Pc(845) short local845 = Static285.method4173(local64);
				local644.aShort12 = (short) Static43.method792(local845, this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				local644.aShort10 = (short) Static43.method792(local845, this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				local644.aShort8 = (short) Static43.method792(local845, this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				local644.aShort11 = (short) Static43.method792(local845, this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				local644.aShort9 = -1;
			} else {
				local644.aShort12 = (short) (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]);
				local644.aShort10 = (short) (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]);
				local644.aShort8 = (short) (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]);
				local644.aShort11 = (short) (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]);
				local644.aShort9 = (short) local70;
			}
			this.aClass16ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Z")
	private boolean method4437(@OriginalArg(0) int arg0) {
		if ((this.anInt5793 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!pi", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray17[arg0][arg1] < arg2) {
			this.aByteArrayArray17[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZLclient!rm;[I[I[I)V")
	private void method4438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class218 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class172 local6 = this.aClass172ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class23 local1452 = this.aClass23ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt5790 == -1) {
					for (local436 = 0; local436 < local1452.aShort22; local436++) {
						local24 = local1452.aShortArray27[local436] + (arg0 << super.anInt5779);
						local29 = local1452.aShortArray26[local436];
						local34 = local1452.aShortArray29[local436] + (arg1 << super.anInt5779);
						local380 = this.anInt5781 + (this.anInt5782 * local24 + this.anInt5794 * local29 + this.anInt5785 * local34 >> 15);
						if (local380 <= this.aClass106_Sub1_8.anInt3300) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass106_Sub1_8.anInt3309;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray28[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass106_Sub1_8.aBoolean198) {
							local296 = local380 - this.aClass106_Sub1_8.anInt3309;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local29 + this.anInt5791 * local34 >> 15);
						local324 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local29 + this.anInt5786 * local34 >> 15);
						arg4[local436] = arg3.anInt6531 + local268 * this.aClass106_Sub1_8.anInt3289 / local380;
						arg5[local436] = arg3.anInt6529 + local324 * this.aClass106_Sub1_8.anInt3311 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort22; local436++) {
						local24 = local1452.aShortArray27[local436] + (arg0 << super.anInt5779);
						local29 = local1452.aShortArray26[local436];
						local34 = local1452.aShortArray29[local436] + (arg1 << super.anInt5779);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt5790 - this.aClass106_Sub1_8.anInt3309;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray28[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass106_Sub1_8.aBoolean198) {
							local296 = this.anInt5790 - this.aClass106_Sub1_8.anInt3309;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local29 + this.anInt5791 * local34 >> 15);
						local324 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local29 + this.anInt5786 * local34 >> 15);
						arg4[local436] = arg3.anInt6531 + local268 * this.aClass106_Sub1_8.anInt3289 / this.anInt5790;
						arg5[local436] = arg3.anInt6529 + local324 * this.aClass106_Sub1_8.anInt3311 / this.anInt5790;
					}
				}
				if (local1452.aShortArray24 != null) {
					local436 = this.anIntArrayArray45[arg0][arg1];
					local296 = this.anIntArrayArray45[arg0 + 1][arg1];
					local352 = this.anIntArrayArray45[arg0][arg1 + 1];
					local408 = arg0 * super.anInt5778;
					local464 = local408 + super.anInt5778;
					local257 = arg1 * super.anInt5778;
					local313 = local257 + super.anInt5778;
					local369 = this.anInt5784 + (this.anInt5789 * local408 + this.anInt5792 * local436 + this.anInt5791 * local257 >> 15);
					local425 = this.anInt5787 + (this.anInt5783 * local408 + this.anInt5788 * local436 + this.anInt5786 * local257 >> 15);
					local285 = this.anInt5781 + (this.anInt5782 * local408 + this.anInt5794 * local436 + this.anInt5785 * local257 >> 15);
					local341 = this.anInt5784 + (this.anInt5789 * local464 + this.anInt5792 * local296 + this.anInt5791 * local257 >> 15);
					local397 = this.anInt5787 + (this.anInt5783 * local464 + this.anInt5788 * local296 + this.anInt5786 * local257 >> 15);
					local453 = this.anInt5781 + (this.anInt5782 * local464 + this.anInt5794 * local296 + this.anInt5785 * local257 >> 15);
					local82 = this.anInt5784 + (this.anInt5789 * local408 + this.anInt5792 * local352 + this.anInt5791 * local313 >> 15);
					local105 = this.anInt5787 + (this.anInt5783 * local408 + this.anInt5788 * local352 + this.anInt5786 * local313 >> 15);
					local128 = this.anInt5781 + (this.anInt5782 * local408 + this.anInt5794 * local352 + this.anInt5785 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort23; local151++) {
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
							arg3.aBoolean411 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt6530 || local176 > arg3.anInt6530 || local56 > arg3.anInt6530;
							@Pc(2138) short local2138 = local1452.aShortArray24[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method4437(this.aClass106_Sub1_8.anInterface7_10.method78(local2138).aByte53)) {
									arg3.anInt6528 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method4978(local65, local240, local501, local42, local176, local56, this.aClass106_Sub1_8.anInt3297, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray43[local36], local1452.anIntArray43[local38], local1452.anIntArray43[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray43[local36] & 0xFFFFFF) != 0) {
										arg3.method4979(local65, local240, local501, local42, local176, local56, Static368.method5127(arg6[local36] << 24 | this.aClass106_Sub1_8.anInt3297, local1452.anIntArray43[local36]), Static368.method5127(arg6[local38] << 24 | this.aClass106_Sub1_8.anInt3297, local1452.anIntArray43[local38]), Static368.method5127(arg6[local40] << 24 | this.aClass106_Sub1_8.anInt3297, local1452.anIntArray43[local40]));
									}
								} else if (local2138 != -1) {
									arg3.method4984(local65, local240, local501, local42, local176, local56, local1452.anIntArray43[local36], local1452.anIntArray43[local38], local1452.anIntArray43[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray43[local36] & 0xFFFFFF) != 0) {
									arg3.method4979(local65, local240, local501, local42, local176, local56, local1452.anIntArray43[local36], local1452.anIntArray43[local38], local1452.anIntArray43[local40]);
								}
								arg3.anInt6528 = 0;
							} else {
								arg3.method4982(local65, local240, local501, local42, local176, local56, this.aClass106_Sub1_8.anInt3297);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort23; local436++) {
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
						arg3.aBoolean411 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt6530 || local257 > arg3.anInt6530 || local313 > arg3.anInt6530;
						if (local341 >= 765) {
							arg3.method4982(local369, local425, local285, local464, local257, local313, this.aClass106_Sub1_8.anInt3297);
						} else if (local341 > 0) {
							if ((local1452.anIntArray43[local296] & 0xFFFFFF) != 0) {
								arg3.method4979(local369, local425, local285, local464, local257, local313, Static450.method6116(arg6[local296], this.aClass106_Sub1_8.anInt3297, local1452.anIntArray43[local296]), Static450.method6116(arg6[local352], this.aClass106_Sub1_8.anInt3297, local1452.anIntArray43[local352]), Static450.method6116(arg6[local408], this.aClass106_Sub1_8.anInt3297, local1452.anIntArray43[local408]));
							}
						} else if ((local1452.anIntArray43[local296] & 0xFFFFFF) != 0) {
							arg3.method4979(local369, local425, local285, local464, local257, local313, local1452.anIntArray43[local296], local1452.anIntArray43[local352], local1452.anIntArray43[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte66 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt5778;
			local24 = local19 + super.anInt5778;
			local29 = arg1 * super.anInt5778;
			local34 = local29 + super.anInt5778;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte66 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray45[arg0][arg1];
				local65 = this.anIntArrayArray45[arg0 + 1][arg1];
				local240 = this.anIntArrayArray45[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray45[arg0][arg1 + 1];
				if (this.anInt5790 == -1) {
					local82 = this.anInt5781 + (this.anInt5782 * local19 + this.anInt5794 * local56 + this.anInt5785 * local29 >> 15);
					if (local82 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local105 = this.anInt5781 + (this.anInt5782 * local24 + this.anInt5794 * local65 + this.anInt5785 * local29 >> 15);
					if (local105 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local128 = this.anInt5781 + (this.anInt5782 * local24 + this.anInt5794 * local240 + this.anInt5785 * local34 >> 15);
					if (local128 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local151 = this.anInt5781 + (this.anInt5782 * local19 + this.anInt5794 * local501 + this.anInt5785 * local34 >> 15);
					if (local151 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
				} else {
					local151 = this.anInt5790;
					local128 = this.anInt5790;
					local105 = this.anInt5790;
					local82 = this.anInt5790;
				}
				if (arg2) {
					local176 = local82 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort72 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort71 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort73 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass106_Sub1_8.anInt3309;
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
				} else if (this.aClass106_Sub1_8.aBoolean198) {
					local176 = local82 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt5784 + (this.anInt5789 * local19 + this.anInt5792 * local56 + this.anInt5791 * local29 >> 15);
				local268 = arg3.anInt6531 + local257 * this.aClass106_Sub1_8.anInt3289 / local82;
				local285 = this.anInt5787 + (this.anInt5783 * local19 + this.anInt5788 * local56 + this.anInt5786 * local29 >> 15);
				local296 = arg3.anInt6529 + local285 * this.aClass106_Sub1_8.anInt3311 / local82;
				local313 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local65 + this.anInt5791 * local29 >> 15);
				local324 = arg3.anInt6531 + local313 * this.aClass106_Sub1_8.anInt3289 / local105;
				local341 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local65 + this.anInt5786 * local29 >> 15);
				local352 = arg3.anInt6529 + local341 * this.aClass106_Sub1_8.anInt3311 / local105;
				local369 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local240 + this.anInt5791 * local34 >> 15);
				local380 = arg3.anInt6531 + local369 * this.aClass106_Sub1_8.anInt3289 / local128;
				local397 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local240 + this.anInt5786 * local34 >> 15);
				local408 = arg3.anInt6529 + local397 * this.aClass106_Sub1_8.anInt3311 / local128;
				local425 = this.anInt5784 + (this.anInt5789 * local19 + this.anInt5792 * local501 + this.anInt5791 * local34 >> 15);
				local436 = arg3.anInt6531 + local425 * this.aClass106_Sub1_8.anInt3289 / local151;
				local453 = this.anInt5787 + (this.anInt5783 * local19 + this.anInt5788 * local501 + this.anInt5786 * local34 >> 15);
				local464 = arg3.anInt6529 + local453 * this.aClass106_Sub1_8.anInt3311 / local151;
			} else {
				local56 = this.anIntArrayArray45[arg0][arg1];
				if (this.anInt5790 == -1) {
					local65 = this.anInt5794 * local56;
					local82 = this.anInt5781 + (this.anInt5782 * local19 + local65 + this.anInt5785 * local29 >> 15);
					if (local82 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local105 = this.anInt5781 + (this.anInt5782 * local24 + local65 + this.anInt5785 * local29 >> 15);
					if (local105 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local128 = this.anInt5781 + (this.anInt5782 * local24 + local65 + this.anInt5785 * local34 >> 15);
					if (local128 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local151 = this.anInt5781 + (this.anInt5782 * local19 + local65 + this.anInt5785 * local34 >> 15);
					if (local151 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
				} else {
					local151 = this.anInt5790;
					local128 = this.anInt5790;
					local105 = this.anInt5790;
					local82 = this.anInt5790;
				}
				if (this.aClass106_Sub1_8.aBoolean198) {
					local176 = local82 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass106_Sub1_8.anInt3309;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt5792 * local56;
				local240 = this.anInt5788 * local56;
				local257 = this.anInt5784 + (this.anInt5789 * local19 + local65 + this.anInt5791 * local29 >> 15);
				local268 = arg3.anInt6531 + local257 * this.aClass106_Sub1_8.anInt3289 / local82;
				local285 = this.anInt5787 + (this.anInt5783 * local19 + local240 + this.anInt5786 * local29 >> 15);
				local296 = arg3.anInt6529 + local285 * this.aClass106_Sub1_8.anInt3311 / local82;
				local313 = this.anInt5784 + (this.anInt5789 * local24 + local65 + this.anInt5791 * local29 >> 15);
				local324 = arg3.anInt6531 + local313 * this.aClass106_Sub1_8.anInt3289 / local105;
				local341 = this.anInt5787 + (this.anInt5783 * local24 + local240 + this.anInt5786 * local29 >> 15);
				local352 = arg3.anInt6529 + local341 * this.aClass106_Sub1_8.anInt3311 / local105;
				local369 = this.anInt5784 + (this.anInt5789 * local24 + local65 + this.anInt5791 * local34 >> 15);
				local380 = arg3.anInt6531 + local369 * this.aClass106_Sub1_8.anInt3289 / local128;
				local397 = this.anInt5787 + (this.anInt5783 * local24 + local240 + this.anInt5786 * local34 >> 15);
				local408 = arg3.anInt6529 + local397 * this.aClass106_Sub1_8.anInt3311 / local128;
				local425 = this.anInt5784 + (this.anInt5789 * local19 + local65 + this.anInt5791 * local34 >> 15);
				local436 = arg3.anInt6531 + local425 * this.aClass106_Sub1_8.anInt3289 / local151;
				local453 = this.anInt5787 + (this.anInt5783 * local19 + local240 + this.anInt5786 * local34 >> 15);
				local464 = arg3.anInt6529 + local453 * this.aClass106_Sub1_8.anInt3311 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort70 != -1 && this.method4437(this.aClass106_Sub1_8.anInterface7_10.method78(local6.aShort70).aByte53);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean411 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt6530 || local436 > arg3.anInt6530 || local324 > arg3.anInt6530;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt6528 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort70 >= 0) {
							arg3.method4978(local408, local464, local352, local380, local436, local324, this.aClass106_Sub1_8.anInt3297, local40, local42, local38, local6.anInt4894, local6.anInt4893, local6.anInt4892, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort70);
						} else {
							arg3.method4979(local408, local464, local352, local380, local436, local324, Static368.method5127(local40 << 24 | this.aClass106_Sub1_8.anInt3297, local6.anInt4894), Static368.method5127(local42 << 24 | this.aClass106_Sub1_8.anInt3297, local6.anInt4893), Static368.method5127(local38 << 24 | this.aClass106_Sub1_8.anInt3297, local6.anInt4892));
						}
					} else if (local6.aShort70 >= 0) {
						arg3.method4984(local408, local464, local352, local380, local436, local324, local6.anInt4894, local6.anInt4893, local6.anInt4892, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort70);
					} else {
						arg3.method4979(local408, local464, local352, local380, local436, local324, local6.anInt4894, local6.anInt4893, local6.anInt4892);
					}
					arg3.anInt6528 = 0;
				} else {
					arg3.method4982(local408, local464, local352, local380, local436, local324, this.aClass106_Sub1_8.anInt3297);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean411 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt6530 || local324 > arg3.anInt6530 || local436 > arg3.anInt6530;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt6528 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort70 >= 0) {
							arg3.method4978(local296, local352, local464, local268, local324, local436, this.aClass106_Sub1_8.anInt3297, local36, local38, local42, local6.anInt4895, local6.anInt4892, local6.anInt4893, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort70);
						} else {
							arg3.method4979(local296, local352, local464, local268, local324, local436, Static368.method5127(local36 << 24 | this.aClass106_Sub1_8.anInt3297, local6.anInt4895), Static368.method5127(local38 << 24 | this.aClass106_Sub1_8.anInt3297, local6.anInt4892), Static368.method5127(local42 << 24 | this.aClass106_Sub1_8.anInt3297, local6.anInt4893));
						}
					} else if (local6.aShort70 >= 0) {
						arg3.method4984(local296, local352, local464, local268, local324, local436, local6.anInt4895, local6.anInt4892, local6.anInt4893, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort70);
					} else {
						arg3.method4979(local296, local352, local464, local268, local324, local436, local6.anInt4895, local6.anInt4892, local6.anInt4893);
					}
					arg3.anInt6528 = 0;
					return;
				}
				arg3.method4982(local296, local352, local464, local268, local324, local436, this.aClass106_Sub1_8.anInt3297);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII[[ZLclient!rm;[I[I)V")
	private void method4439(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class218 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean413 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass16ArrayArray1[local22][local25] != null) {
						@Pc(50) Class16 local50 = this.aClass16ArrayArray1[local22][local25];
						if (local50.aShort9 != -1 && (local50.aByte10 & 0x2) == 0 && local50.anInt447 == -1) {
							local69 = this.aClass106_Sub1_8.method2588(local50.aShort9);
							arg5.method4990(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static43.method792(local69, local50.aShort8 & 0xFFFF), Static43.method792(local69, local50.aShort11 & 0xFFFF), Static43.method792(local69, local50.aShort10 & 0xFFFF));
							arg5.method4990(local20, local20, local20 - 4, local16, local16 + 4, local16, Static43.method792(local69, local50.aShort12 & 0xFFFF), Static43.method792(local69, local50.aShort10 & 0xFFFF), Static43.method792(local69, local50.aShort11 & 0xFFFF));
						} else if (local50.anInt447 == -1) {
							arg5.method4990(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort8 & 0xFFFF, local50.aShort11 & 0xFFFF, local50.aShort10 & 0xFFFF);
							arg5.method4990(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort12 & 0xFFFF, local50.aShort10 & 0xFFFF, local50.aShort11 & 0xFFFF);
						} else {
							local69 = local50.anInt447;
							arg5.method4990(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method4990(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass14ArrayArray1[local22][local25] != null) {
						@Pc(249) Class14 local249 = this.aClass14ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort5; local69++) {
							arg6[local69] = local16 + local249.aShortArray8[local69] * 4 / super.anInt5778;
							arg7[local69] = local20 - local249.aShortArray5[local69] * 4 / super.anInt5778;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort4; local287++) {
							@Pc(293) short local293 = local249.aShortArray12[local287];
							@Pc(298) short local298 = local249.aShortArray11[local287];
							@Pc(303) short local303 = local249.aShortArray6[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray17 != null && local249.anIntArray17[local287] != -1) {
								local341 = local249.anIntArray17[local287];
								arg5.method4990(local319, local323, local327, local307, local311, local315, Static43.method792(local341, local249.aShortArray10[local293]), Static43.method792(local341, local249.aShortArray10[local298]), Static43.method792(local341, local249.aShortArray10[local303]));
							} else if (local249.aShortArray7 == null || local249.aShortArray7[local287] == -1) {
								local341 = local249.anIntArray18[local287];
								arg5.method4990(local319, local323, local327, local307, local311, local315, Static43.method792(local341, local249.aShortArray10[local293]), Static43.method792(local341, local249.aShortArray10[local298]), Static43.method792(local341, local249.aShortArray10[local303]));
							} else {
								local341 = this.aClass106_Sub1_8.method2588(local249.aShortArray7[local287]);
								arg5.method4990(local319, local323, local327, local307, local311, local315, Static43.method792(local341, local249.aShortArray10[local293]), Static43.method792(local341, local249.aShortArray10[local298]), Static43.method792(local341, local249.aShortArray10[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method4435(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!rm;[I[I[I)V")
	private void method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class218 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class16 local6 = this.aClass16ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class14 local1022 = this.aClass14ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt5790 == -1) {
					for (local362 = 0; local362 < local1022.aShort5; local362++) {
						local24 = local1022.aShortArray8[local362] + (arg0 << super.anInt5779);
						local1046 = local1022.aShortArray4[local362];
						local34 = local1022.aShortArray5[local362] + (arg1 << super.anInt5779);
						local306 = this.anInt5781 + (this.anInt5782 * local24 + this.anInt5794 * local1046 + this.anInt5785 * local34 >> 15);
						if (local306 <= this.aClass106_Sub1_8.anInt3300) {
							return;
						}
						local194 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local1046 + this.anInt5791 * local34 >> 15);
						local250 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local1046 + this.anInt5786 * local34 >> 15);
						arg3[local362] = arg2.anInt6531 + local194 * this.aClass106_Sub1_8.anInt3289 / local306;
						arg4[local362] = arg2.anInt6529 + local250 * this.aClass106_Sub1_8.anInt3311 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort5; local362++) {
						local24 = local1022.aShortArray8[local362] + (arg0 << super.anInt5779);
						local1046 = local1022.aShortArray4[local362];
						local34 = local1022.aShortArray5[local362] + (arg1 << super.anInt5779);
						local194 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local1046 + this.anInt5791 * local34 >> 15);
						local250 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local1046 + this.anInt5786 * local34 >> 15);
						arg3[local362] = arg2.anInt6531 + local194 * this.aClass106_Sub1_8.anInt3289 / this.anInt5790;
						arg4[local362] = arg2.anInt6529 + local250 * this.aClass106_Sub1_8.anInt3311 / this.anInt5790;
					}
				}
				if (local1022.aShortArray7 != null) {
					local362 = this.anIntArrayArray45[arg0][arg1];
					local222 = this.anIntArrayArray45[arg0 + 1][arg1];
					local278 = this.anIntArrayArray45[arg0][arg1 + 1];
					local334 = arg0 * super.anInt5778;
					local390 = local334 + super.anInt5778;
					local183 = arg1 * super.anInt5778;
					local239 = local183 + super.anInt5778;
					local295 = this.anInt5784 + (this.anInt5789 * local334 + this.anInt5792 * local362 + this.anInt5791 * local183 >> 15);
					local351 = this.anInt5787 + (this.anInt5783 * local334 + this.anInt5788 * local362 + this.anInt5786 * local183 >> 15);
					local211 = this.anInt5781 + (this.anInt5782 * local334 + this.anInt5794 * local362 + this.anInt5785 * local183 >> 15);
					local267 = this.anInt5784 + (this.anInt5789 * local390 + this.anInt5792 * local222 + this.anInt5791 * local183 >> 15);
					local323 = this.anInt5787 + (this.anInt5783 * local390 + this.anInt5788 * local222 + this.anInt5786 * local183 >> 15);
					local379 = this.anInt5781 + (this.anInt5782 * local390 + this.anInt5794 * local222 + this.anInt5785 * local183 >> 15);
					local72 = this.anInt5784 + (this.anInt5789 * local334 + this.anInt5792 * local278 + this.anInt5791 * local239 >> 15);
					local95 = this.anInt5787 + (this.anInt5783 * local334 + this.anInt5788 * local278 + this.anInt5786 * local239 >> 15);
					local118 = this.anInt5781 + (this.anInt5782 * local334 + this.anInt5794 * local278 + this.anInt5785 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort4; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray12[local141];
						@Pc(1496) short local1496 = local1022.aShortArray11[local141];
						@Pc(1501) short local1501 = local1022.aShortArray6[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean411 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt6530 || local1509 > arg2.anInt6530 || local1513 > arg2.anInt6530;
							@Pc(1569) short local1569 = local1022.aShortArray7[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray18[local141];
								if (local1624 != -1) {
									arg2.method4990(local1517, local1521, local1525, local427, local1509, local1513, Static43.method792(local1624, local1022.aShortArray10[local1491]), Static43.method792(local1624, local1022.aShortArray10[local1496]), Static43.method792(local1624, local1022.aShortArray10[local1501]));
								}
							} else {
								if (this.method4437(this.aClass106_Sub1_8.anInterface7_10.method78(local1569).aByte53)) {
									arg2.anInt6528 = 100;
								}
								arg2.method4984(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray10[local1491], local1022.aShortArray10[local1496], local1022.aShortArray10[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt6528 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort4; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray12[local362];
					@Pc(1675) short local1675 = local1022.aShortArray11[local362];
					@Pc(1680) short local1680 = local1022.aShortArray6[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray18[local362];
						if (local267 != -1) {
							arg2.aBoolean411 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt6530 || local183 > arg2.anInt6530 || local239 > arg2.anInt6530;
							arg2.method4990(local295, local351, local211, local390, local183, local239, Static43.method792(local267, local1022.aShortArray10[local1670]), Static43.method792(local267, local1022.aShortArray10[local1675]), Static43.method792(local267, local1022.aShortArray10[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte10 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt5778;
			local24 = local19 + super.anInt5778;
			@Pc(29) int local29 = arg1 * super.anInt5778;
			local34 = local29 + super.anInt5778;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte10 & 0x1) == 0) {
				local46 = this.anIntArrayArray45[arg0][arg1];
				local55 = this.anIntArrayArray45[arg0 + 1][arg1];
				local166 = this.anIntArrayArray45[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray45[arg0][arg1 + 1];
				if (this.anInt5790 == -1) {
					local72 = this.anInt5781 + (this.anInt5782 * local19 + this.anInt5794 * local46 + this.anInt5785 * local29 >> 15);
					if (local72 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local95 = this.anInt5781 + (this.anInt5782 * local24 + this.anInt5794 * local55 + this.anInt5785 * local29 >> 15);
					if (local95 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local118 = this.anInt5781 + (this.anInt5782 * local24 + this.anInt5794 * local166 + this.anInt5785 * local34 >> 15);
					if (local118 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local141 = this.anInt5781 + (this.anInt5782 * local19 + this.anInt5794 * local427 + this.anInt5785 * local34 >> 15);
					if (local141 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
				} else {
					local141 = this.anInt5790;
					local118 = this.anInt5790;
					local95 = this.anInt5790;
					local72 = this.anInt5790;
				}
				local183 = this.anInt5784 + (this.anInt5789 * local19 + this.anInt5792 * local46 + this.anInt5791 * local29 >> 15);
				local194 = arg2.anInt6531 + local183 * this.aClass106_Sub1_8.anInt3289 / local72;
				local211 = this.anInt5787 + (this.anInt5783 * local19 + this.anInt5788 * local46 + this.anInt5786 * local29 >> 15);
				local222 = arg2.anInt6529 + local211 * this.aClass106_Sub1_8.anInt3311 / local72;
				local239 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local55 + this.anInt5791 * local29 >> 15);
				local250 = arg2.anInt6531 + local239 * this.aClass106_Sub1_8.anInt3289 / local95;
				local267 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local55 + this.anInt5786 * local29 >> 15);
				local278 = arg2.anInt6529 + local267 * this.aClass106_Sub1_8.anInt3311 / local95;
				local295 = this.anInt5784 + (this.anInt5789 * local24 + this.anInt5792 * local166 + this.anInt5791 * local34 >> 15);
				local306 = arg2.anInt6531 + local295 * this.aClass106_Sub1_8.anInt3289 / local118;
				local323 = this.anInt5787 + (this.anInt5783 * local24 + this.anInt5788 * local166 + this.anInt5786 * local34 >> 15);
				local334 = arg2.anInt6529 + local323 * this.aClass106_Sub1_8.anInt3311 / local118;
				local351 = this.anInt5784 + (this.anInt5789 * local19 + this.anInt5792 * local427 + this.anInt5791 * local34 >> 15);
				local362 = arg2.anInt6531 + local351 * this.aClass106_Sub1_8.anInt3289 / local141;
				local379 = this.anInt5787 + (this.anInt5783 * local19 + this.anInt5788 * local427 + this.anInt5786 * local34 >> 15);
				local390 = arg2.anInt6529 + local379 * this.aClass106_Sub1_8.anInt3311 / local141;
			} else {
				local46 = this.anIntArrayArray45[arg0][arg1];
				if (this.anInt5790 == -1) {
					local55 = this.anInt5794 * local46;
					local72 = this.anInt5781 + (this.anInt5782 * local19 + local55 + this.anInt5785 * local29 >> 15);
					if (local72 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local95 = this.anInt5781 + (this.anInt5782 * local24 + local55 + this.anInt5785 * local29 >> 15);
					if (local95 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local118 = this.anInt5781 + (this.anInt5782 * local24 + local55 + this.anInt5785 * local34 >> 15);
					if (local118 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
					local141 = this.anInt5781 + (this.anInt5782 * local19 + local55 + this.anInt5785 * local34 >> 15);
					if (local141 <= this.aClass106_Sub1_8.anInt3300) {
						return;
					}
				} else {
					local141 = this.anInt5790;
					local118 = this.anInt5790;
					local95 = this.anInt5790;
					local72 = this.anInt5790;
				}
				local55 = this.anInt5792 * local46;
				local166 = this.anInt5788 * local46;
				local183 = this.anInt5784 + (this.anInt5789 * local19 + local55 + this.anInt5791 * local29 >> 15);
				local194 = arg2.anInt6531 + local183 * this.aClass106_Sub1_8.anInt3289 / local72;
				local211 = this.anInt5787 + (this.anInt5783 * local19 + local166 + this.anInt5786 * local29 >> 15);
				local222 = arg2.anInt6529 + local211 * this.aClass106_Sub1_8.anInt3311 / local72;
				local239 = this.anInt5784 + (this.anInt5789 * local24 + local55 + this.anInt5791 * local29 >> 15);
				local250 = arg2.anInt6531 + local239 * this.aClass106_Sub1_8.anInt3289 / local95;
				local267 = this.anInt5787 + (this.anInt5783 * local24 + local166 + this.anInt5786 * local29 >> 15);
				local278 = arg2.anInt6529 + local267 * this.aClass106_Sub1_8.anInt3311 / local95;
				local295 = this.anInt5784 + (this.anInt5789 * local24 + local55 + this.anInt5791 * local34 >> 15);
				local306 = arg2.anInt6531 + local295 * this.aClass106_Sub1_8.anInt3289 / local118;
				local323 = this.anInt5787 + (this.anInt5783 * local24 + local166 + this.anInt5786 * local34 >> 15);
				local334 = arg2.anInt6529 + local323 * this.aClass106_Sub1_8.anInt3311 / local118;
				local351 = this.anInt5784 + (this.anInt5789 * local19 + local55 + this.anInt5791 * local34 >> 15);
				local362 = arg2.anInt6531 + local351 * this.aClass106_Sub1_8.anInt3289 / local141;
				local379 = this.anInt5787 + (this.anInt5783 * local19 + local166 + this.anInt5786 * local34 >> 15);
				local390 = arg2.anInt6529 + local379 * this.aClass106_Sub1_8.anInt3311 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean411 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt6530 || local362 > arg2.anInt6530 || local250 > arg2.anInt6530;
				if (local6.aShort9 >= 0) {
					if (this.method4437(this.aClass106_Sub1_8.anInterface7_10.method78(local6.aShort9).aByte53)) {
						arg2.anInt6528 = 100;
					}
					arg2.method4984(local334, local390, local278, local306, local362, local250, local6.aShort8 & 0xFFFF, local6.aShort11 & 0xFFFF, local6.aShort10 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort9);
					arg2.anInt6528 = 0;
				} else {
					arg2.method4990(local334, local390, local278, local306, local362, local250, local6.aShort8 & 0xFFFF, local6.aShort11 & 0xFFFF, local6.aShort10 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean411 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt6530 || local250 > arg2.anInt6530 || local362 > arg2.anInt6530;
				if (local6.aShort9 >= 0) {
					if (this.method4437(this.aClass106_Sub1_8.anInterface7_10.method78(local6.aShort9).aByte53)) {
						arg2.anInt6528 = 100;
					}
					arg2.method4984(local222, local278, local390, local194, local250, local362, local6.aShort12 & 0xFFFF, local6.aShort10 & 0xFFFF, local6.aShort11 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort9);
					arg2.anInt6528 = 0;
					return;
				}
				arg2.method4990(local222, local278, local390, local194, local250, local362, local6.aShort12 & 0xFFFF, local6.aShort10 & 0xFFFF, local6.aShort11 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ja;[I)V")
	@Override
	public void method4430(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!pi", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pi", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt5779;
		@Pc(9) int local9 = arg1 >> super.anInt5779;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt5777 - 1 || local9 > super.anInt5775 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt5778 - 1;
		@Pc(41) int local41 = arg1 & super.anInt5778 - 1;
		@Pc(67) int local67 = this.anIntArrayArray45[local4][local9] * (super.anInt5778 - local34) + this.anIntArrayArray45[local4 + 1][local9] * local34 >> super.anInt5779;
		@Pc(97) int local97 = this.anIntArrayArray45[local4][local9 + 1] * (super.anInt5778 - local34) + this.anIntArrayArray45[local4 + 1][local9 + 1] * local34 >> super.anInt5779;
		return local67 * (super.anInt5778 - local41) + local97 * local41 >> super.anInt5779;
	}

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!pi", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class1_Sub1_Sub10 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub10 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!pi", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray45[arg0][arg1];
	}

	@OriginalMember(owner = "client!pi", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass172ArrayArray1 == null) {
			this.aClass172ArrayArray1 = new Class172[super.anInt5777][super.anInt5775];
			this.aClass23ArrayArray1 = new Class23[super.anInt5777][super.anInt5775];
		} else if (this.aClass16ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static238.anIntArray440[Static285.method4173(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static238.anIntArray440[Static285.method4173(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt5778 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt5778 && arg4[local116] == super.anInt5778) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt5778) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt5778 && arg2[local244] != arg2[0] - super.anInt5778) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt5778 && arg4[local244] != arg4[0] - super.anInt5778) {
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
			@Pc(334) Class172 local334 = new Class172();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt4896 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte66 = (byte) (local334.aByte66 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray45[arg0][arg1] == this.anIntArrayArray45[arg0 + 1][arg1] && this.anIntArrayArray45[arg0][arg1] == this.anIntArrayArray45[arg0 + 1][arg1 + 1] && this.anIntArrayArray45[arg0][arg1] == this.anIntArrayArray45[arg0][arg1 + 1]) {
				local334.aByte66 = (byte) (local334.aByte66 | 0x1);
			}
			if (local342 == -1 || (local334.aByte66 & 0x2) != 0 || this.aClass106_Sub1_8.anInterface7_10.method78(local342).aBoolean274) {
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
				local334.anInt4895 = Static450.method6116(local527, arg10, Static464.method4441(arg6[local104] >> 8, this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]));
				if (local334.anInt4896 != 0) {
					local334.anInt4895 |= this.aByteArrayArray17[arg0][arg1] + 255 - this.aByteArrayArray16[arg0][arg1] << 25;
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
				local334.anInt4892 = Static450.method6116(local527, arg10, Static464.method4441(arg6[local106] >> 8, this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]));
				if (local334.anInt4896 != 0) {
					local334.anInt4892 |= this.aByteArrayArray17[arg0 + 1][arg1] + 255 - this.aByteArrayArray16[arg0 + 1][arg1] << 25;
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
				local334.anInt4894 = Static450.method6116(local527, arg10, Static464.method4441(arg6[local108] >> 8, this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]));
				if (local334.anInt4896 != 0) {
					local334.anInt4894 |= this.aByteArrayArray17[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray16[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt4893 = Static450.method6116(local527, arg10, Static464.method4441(arg6[local110] >> 8, this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]));
				if (local334.anInt4896 != 0) {
					local334.anInt4893 |= this.aByteArrayArray17[arg0][arg1 + 1] + 255 - this.aByteArrayArray16[arg0][arg1 + 1] << 25;
				}
				local334.aShort70 = -1;
			} else {
				local334.anInt4895 = this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1];
				local334.anInt4892 = this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1];
				local334.anInt4894 = this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1];
				local334.anInt4893 = this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1];
				local334.aShort70 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort73 = (short) arg5[local108];
				local334.aShort69 = (short) arg5[local110];
				local334.aShort71 = (short) arg5[local106];
				local334.aShort72 = (short) arg5[local104];
			}
			this.aClass172ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class23 local888 = new Class23();
		local888.aShort22 = (short) arg2.length;
		local888.aShort23 = (short) (arg2.length / 3);
		local888.aShortArray27 = new short[local888.aShort22];
		local888.aShortArray26 = new short[local888.aShort22];
		local888.aShortArray29 = new short[local888.aShort22];
		local888.anIntArray43 = new int[local888.aShort22];
		if (arg5 != null) {
			local888.aShortArray28 = new short[local888.aShort22];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort22; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt5778) {
				local958 = this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1];
			} else if (local342 == super.anInt5778 && local527 == super.anInt5778) {
				local958 = this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt5778 && local527 == 0) {
				local958 = this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray16[arg0][arg1] - this.aByteArrayArray17[arg0][arg1]) * (super.anInt5778 - local342) + (this.aByteArrayArray16[arg0 + 1][arg1] - this.aByteArrayArray17[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray16[arg0][arg1 + 1] - this.aByteArrayArray17[arg0][arg1 + 1]) * (super.anInt5778 - local342) + (this.aByteArrayArray16[arg0 + 1][arg1 + 1] - this.aByteArrayArray17[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt5778 - local527) + local1126 * local527 >> super.anInt5779 * 2;
			}
			local1079 = (arg0 << super.anInt5779) + local342;
			local1126 = (arg1 << super.anInt5779) + local527;
			local888.aShortArray27[local244] = (short) local342;
			local888.aShortArray29[local244] = (short) local527;
			local888.aShortArray26[local244] = (short) (this.ca(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass106_Sub1_8.anInterface7_10.method78(arg8[local244]).aBoolean274) {
				local888.anIntArray43[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray28[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray43[local244] = Static450.method6116(local1226, arg10, Static464.method4441(arg6[local244] >> 8, local958));
				if (arg7 != null) {
					local888.anIntArray43[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray43[local244] = 0;
			} else {
				local888.anIntArray43[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort23; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass106_Sub1_8.anInterface7_10.method78(arg8[local527 * 3]).aBoolean274) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray42 = new int[local888.aShort23];
		}
		if (local1296) {
			local888.aShortArray24 = new short[local888.aShort23];
			local888.aShortArray25 = new short[local888.aShort23];
		}
		for (local958 = 0; local958 < local888.aShort23; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray42[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aBoolean274) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aBoolean274) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aBoolean274) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray24[local958] = (short) local1384;
					local888.aShortArray25[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aBoolean274) {
							local888.anIntArray43[local1079] = Static238.anIntArray440[Static285.method4173(this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aShort59 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aBoolean274) {
							local888.anIntArray43[local1126] = Static238.anIntArray440[Static285.method4173(this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aShort59 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aBoolean274) {
							local888.anIntArray43[local1226] = Static238.anIntArray440[Static285.method4173(this.aClass106_Sub1_8.anInterface7_10.method78(local1384).aShort59 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray24[local958] = -1;
				}
			}
		}
		this.aClass23ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!pi", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		this.aByteArrayArray16 = null;
		this.aByteArrayArray17 = null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	@Override
	public void method4432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class33 local4 = this.aClass106_Sub1_8.method2586(Thread.currentThread());
		local4.aClass218_1.anInt6528 = 0;
		if (this.aClass172ArrayArray1 != null) {
			this.method4438(arg0, arg1, this.aClass106_Sub1_8.aBoolean197, local4.aClass218_1, local4.anIntArray92, local4.anIntArray84, local4.anIntArray99);
		} else if (this.aClass16ArrayArray1 != null) {
			this.method4440(arg0, arg1, local4.aClass218_1, local4.anIntArray92, local4.anIntArray84, local4.anIntArray99);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class40_Sub1 local3 = this.aClass106_Sub1_8.aClass40_Sub1_3;
		this.anInt5790 = -1;
		this.anInt5789 = local3.anInt4744;
		this.anInt5792 = local3.anInt4749;
		this.anInt5791 = local3.anInt4747;
		this.anInt5784 = local3.anInt4753;
		this.anInt5783 = local3.anInt4752;
		this.anInt5788 = local3.anInt4743;
		this.anInt5786 = local3.anInt4748;
		this.anInt5787 = local3.anInt4746;
		this.anInt5782 = local3.anInt4751;
		this.anInt5794 = local3.anInt4754;
		this.anInt5785 = local3.anInt4745;
		this.anInt5781 = local3.anInt4750;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IIIIIII[[ZLclient!rm;[I[I)V")
	private void method4442(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class218 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean413 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass172ArrayArray1[local22][local25] != null) {
						@Pc(50) Class172 local50 = this.aClass172ArrayArray1[local22][local25];
						if (local50.aShort70 != -1 && (local50.aByte66 & 0x2) == 0 && local50.anInt4896 == 0) {
							local68 = this.aClass106_Sub1_8.method2588(local50.aShort70);
							arg5.method4990(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static43.method792(local68, local50.anInt4894), Static43.method792(local68, local50.anInt4893), Static43.method792(local68, local50.anInt4892));
							arg5.method4990(local20, local20, local20 - 4, local16, local16 + 4, local16, Static43.method792(local68, local50.anInt4895), Static43.method792(local68, local50.anInt4892), Static43.method792(local68, local50.anInt4893));
						} else if (local50.anInt4896 == 0) {
							arg5.method4979(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt4894, local50.anInt4893, local50.anInt4892);
							arg5.method4979(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt4895, local50.anInt4892, local50.anInt4893);
						} else {
							local68 = local50.anInt4896;
							arg5.method4979(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static368.method5127(local50.anInt4894 & 0xFF000000, local68), Static368.method5127(local50.anInt4893 & 0xFF000000, local68), Static368.method5127(local50.anInt4892 & 0xFF000000, local68));
							arg5.method4979(local20, local20, local20 - 4, local16, local16 + 4, local16, Static368.method5127(local50.anInt4895 & 0xFF000000, local68), Static368.method5127(local50.anInt4892 & 0xFF000000, local68), Static368.method5127(local50.anInt4893 & 0xFF000000, local68));
						}
					} else if (this.aClass23ArrayArray1[local22][local25] != null) {
						@Pc(259) Class23 local259 = this.aClass23ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort22; local68++) {
							arg6[local68] = local16 + local259.aShortArray27[local68] * 4 / super.anInt5778;
							arg7[local68] = local20 - local259.aShortArray29[local68] * 4 / super.anInt5778;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort23; local297++) {
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
							if (local259.anIntArray42 != null && local259.anIntArray42[local297] != 0 && (local259.aShortArray24 == null || local259.aShortArray24 != null && local259.aShortArray24[local297] == -1)) {
								local359 = local259.anIntArray42[local297];
								arg5.method4979(local326, local330, local334, local314, local318, local322, Static368.method5127(-(local259.anIntArray43[local302] & -16777216) - 16777216, local359), Static368.method5127(-(local259.anIntArray43[local306] & -16777216) - 16777216, local359), Static368.method5127(-(local259.anIntArray43[local310] & -16777216) - 16777216, local359));
							} else if (local259.aShortArray24 == null || local259.aShortArray24[local297] == -1) {
								arg5.method4979(local326, local330, local334, local314, local318, local322, local259.anIntArray43[local302], local259.anIntArray43[local306], local259.anIntArray43[local310]);
							} else {
								local359 = this.aClass106_Sub1_8.method2588(local259.aShortArray24[local297]);
								arg5.method4990(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean413 = true;
	}
}
