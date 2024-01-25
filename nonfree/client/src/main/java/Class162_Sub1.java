import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class162_Sub1 extends Class162 {

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
	private int anInt4120;

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
	private int anInt4121;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "[[Lclient!nl;")
	private Class171[][] aClass171ArrayArray1;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	private int anInt4122;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
	private int anInt4123;

	@OriginalMember(owner = "client!mq", name = "o", descriptor = "[[Lclient!sl;")
	private Class224[][] aClass224ArrayArray1;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
	private int anInt4124;

	@OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
	private int anInt4125;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
	private int anInt4127;

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
	private int anInt4128;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "[[Lclient!sk;")
	private Class223[][] aClass223ArrayArray1;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
	private int anInt4130;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "[[Lclient!r;")
	private Class210[][] aClass210ArrayArray1;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
	private int anInt4131;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	private int anInt4132;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
	private int anInt4133;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	private int anInt4129 = -1;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "Lclient!ms;")
	private final Class163_Sub1 aClass163_Sub1_6;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
	private final int anInt4126;

	@OriginalMember(owner = "client!mq", name = "q", descriptor = "[[I")
	public final int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "[[B")
	private byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "[[B")
	private byte[][] aByteArrayArray33;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!ms;IIII[[I[[II)V")
	public Class162_Sub1(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7);
		this.aClass163_Sub1_6 = arg0;
		this.anInt4126 = arg2;
		this.anIntArrayArray29 = arg5;
		this.aByteArrayArray34 = new byte[arg3 + 1][arg4 + 1];
		@Pc(31) int local31 = this.aClass163_Sub1_6.anInt4201 >> 9;
		for (@Pc(33) int local33 = 1; local33 < arg4; local33++) {
			for (@Pc(36) int local36 = 1; local36 < arg3; local36++) {
				@Pc(55) int local55 = arg6[local36 + 1][local33] - arg6[local36 - 1][local33];
				@Pc(71) int local71 = arg6[local36][local33 + 1] - arg6[local36][local33 - 1];
				@Pc(86) int local86 = (int) Math.sqrt((double) (local55 * local55 + arg7 * 512 + local71 * local71));
				@Pc(92) int local92 = (local55 << 8) / local86;
				@Pc(98) int local98 = arg7 * -512 / local86;
				@Pc(104) int local104 = (local71 << 8) / local86;
				@Pc(126) int local126 = local31 + (this.aClass163_Sub1_6.lb * local92 + this.aClass163_Sub1_6.anInt4211 * local98 + this.aClass163_Sub1_6.anInt4197 * local104 >> 17);
				local126 >>= 0x1;
				if (local126 < 2) {
					local126 = 2;
				} else if (local126 > 126) {
					local126 = 126;
				}
				this.aByteArrayArray34[local36][local33] = (byte) local126;
			}
		}
		this.aByteArrayArray33 = new byte[arg3 + 1][arg4 + 1];
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method3278(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(4) Class195 local4 = this.aClass163_Sub1_6.method3442(Thread.currentThread());
		@Pc(7) Class107 local7 = local4.aClass107_1;
		local7.anInt2704 = 0;
		local7.aBoolean173 = false;
		if (this.aClass210ArrayArray1 != null) {
			this.method3267(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray459, local4.anIntArray451);
		} else if (this.aClass224ArrayArray1 != null) {
			this.method3269(arg0, arg1, arg2, arg3, arg4, local7, local4.anIntArray459, local4.anIntArray451);
		}
	}

	@OriginalMember(owner = "client!mq", name = "OA", descriptor = "(IILclient!i;)Lclient!i;")
	@Override
	public Class2_Sub5_Sub7 OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub5_Sub7 arg2) {
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "ba", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void ba(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIZLclient!hp;[I[I[I)V")
	private void method3265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class107 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(6) Class210 local6 = this.aClass210ArrayArray1[arg0][arg1];
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
			@Pc(1452) Class171 local1452 = this.aClass171ArrayArray1[arg0][arg1];
			if (local1452 != null) {
				if (this.anInt4129 == -1) {
					for (local436 = 0; local436 < local1452.aShort39; local436++) {
						local24 = local1452.aShortArray35[local436] + (arg0 << super.anInt4139);
						local29 = local1452.aShortArray33[local436];
						local34 = local1452.aShortArray38[local436] + (arg1 << super.anInt4139);
						local380 = this.anInt4132 + (this.anInt4123 * local24 + this.anInt4125 * local29 + this.anInt4131 * local34 >> 15);
						if (local380 <= this.aClass163_Sub1_6.anInt4221) {
							return;
						}
						arg6[local436] = 0;
						if (arg2) {
							local296 = local380 - this.aClass163_Sub1_6.anInt4212;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray34[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass163_Sub1_6.aBoolean297) {
							local296 = local380 - this.aClass163_Sub1_6.anInt4212;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local29 + this.anInt4127 * local34 >> 15);
						local324 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local29 + this.anInt4121 * local34 >> 15);
						arg4[local436] = arg3.anInt2702 + local268 * this.aClass163_Sub1_6.anInt4209 / local380;
						arg5[local436] = arg3.anInt2701 + local324 * this.aClass163_Sub1_6.anInt4207 / local380;
					}
				} else {
					for (local436 = 0; local436 < local1452.aShort39; local436++) {
						local24 = local1452.aShortArray35[local436] + (arg0 << super.anInt4139);
						local29 = local1452.aShortArray33[local436];
						local34 = local1452.aShortArray38[local436] + (arg1 << super.anInt4139);
						arg6[local436] = 0;
						if (arg2) {
							local296 = this.anInt4129 - this.aClass163_Sub1_6.anInt4212;
							if (local296 > 255) {
								local296 = 255;
							}
							if (local296 > 0) {
								arg6[local436] = local296;
								local352 = local1452.aShortArray34[local436] * local296 / 255;
								if (local352 > 0) {
									local29 -= local352;
								}
							}
						} else if (this.aClass163_Sub1_6.aBoolean297) {
							local296 = this.anInt4129 - this.aClass163_Sub1_6.anInt4212;
							if (local296 > 0) {
								arg6[local436] = local296;
								if (arg6[local436] > 255) {
									arg6[local436] = 255;
								}
							}
						}
						local268 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local29 + this.anInt4127 * local34 >> 15);
						local324 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local29 + this.anInt4121 * local34 >> 15);
						arg4[local436] = arg3.anInt2702 + local268 * this.aClass163_Sub1_6.anInt4209 / this.anInt4129;
						arg5[local436] = arg3.anInt2701 + local324 * this.aClass163_Sub1_6.anInt4207 / this.anInt4129;
					}
				}
				if (local1452.aShortArray37 != null) {
					local436 = this.anIntArrayArray29[arg0][arg1];
					local296 = this.anIntArrayArray29[arg0 + 1][arg1];
					local352 = this.anIntArrayArray29[arg0][arg1 + 1];
					local408 = arg0 * super.anInt4134;
					local464 = local408 + super.anInt4134;
					local257 = arg1 * super.anInt4134;
					local313 = local257 + super.anInt4134;
					local369 = this.anInt4120 + (this.anInt4122 * local408 + this.anInt4133 * local436 + this.anInt4127 * local257 >> 15);
					local425 = this.anInt4124 + (this.anInt4130 * local408 + this.anInt4128 * local436 + this.anInt4121 * local257 >> 15);
					local285 = this.anInt4132 + (this.anInt4123 * local408 + this.anInt4125 * local436 + this.anInt4131 * local257 >> 15);
					local341 = this.anInt4120 + (this.anInt4122 * local464 + this.anInt4133 * local296 + this.anInt4127 * local257 >> 15);
					local397 = this.anInt4124 + (this.anInt4130 * local464 + this.anInt4128 * local296 + this.anInt4121 * local257 >> 15);
					local453 = this.anInt4132 + (this.anInt4123 * local464 + this.anInt4125 * local296 + this.anInt4131 * local257 >> 15);
					local82 = this.anInt4120 + (this.anInt4122 * local408 + this.anInt4133 * local352 + this.anInt4127 * local313 >> 15);
					local105 = this.anInt4124 + (this.anInt4130 * local408 + this.anInt4128 * local352 + this.anInt4121 * local313 >> 15);
					local128 = this.anInt4132 + (this.anInt4123 * local408 + this.anInt4125 * local352 + this.anInt4131 * local313 >> 15);
					for (local151 = 0; local151 < local1452.aShort40; local151++) {
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
							arg3.aBoolean173 = local42 < 0 || local176 < 0 || local56 < 0 || local42 > arg3.anInt2703 || local176 > arg3.anInt2703 || local56 > arg3.anInt2703;
							@Pc(2138) short local2138 = local1452.aShortArray37[local151];
							if (local642 < 765) {
								if (local2138 != -1 && this.method3266(this.aClass163_Sub1_6.anInterface9_12.method1769(local2138).aByte43)) {
									arg3.anInt2704 = 100;
								}
								if (local642 > 0) {
									if (local2138 != -1) {
										arg3.method2221(local65, local240, local501, local42, local176, local56, this.aClass163_Sub1_6.anInt4205, arg6[local36], arg6[local38], arg6[local40], local1452.anIntArray377[local36], local1452.anIntArray377[local38], local1452.anIntArray377[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
									} else if ((local1452.anIntArray377[local36] & 0xFFFFFF) != 0) {
										arg3.method2220(local65, local240, local501, local42, local176, local56, Static418.method5304(local1452.anIntArray377[local36], arg6[local36] << 24 | this.aClass163_Sub1_6.anInt4205), Static418.method5304(local1452.anIntArray377[local38], arg6[local38] << 24 | this.aClass163_Sub1_6.anInt4205), Static418.method5304(local1452.anIntArray377[local40], arg6[local40] << 24 | this.aClass163_Sub1_6.anInt4205));
									}
								} else if (local2138 != -1) {
									arg3.method2222(local65, local240, local501, local42, local176, local56, local1452.anIntArray377[local36], local1452.anIntArray377[local38], local1452.anIntArray377[local40], local369, local341, local82, local425, local397, local105, local285, local453, local128, local2138);
								} else if ((local1452.anIntArray377[local36] & 0xFFFFFF) != 0) {
									arg3.method2220(local65, local240, local501, local42, local176, local56, local1452.anIntArray377[local36], local1452.anIntArray377[local38], local1452.anIntArray377[local40]);
								}
								arg3.anInt2704 = 0;
							} else {
								arg3.method2219(local65, local240, local501, local42, local176, local56, this.aClass163_Sub1_6.anInt4205);
							}
						}
					}
					return;
				}
				for (local436 = 0; local436 < local1452.aShort40; local436++) {
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
						arg3.aBoolean173 = local464 < 0 || local257 < 0 || local313 < 0 || local464 > arg3.anInt2703 || local257 > arg3.anInt2703 || local313 > arg3.anInt2703;
						if (local341 >= 765) {
							arg3.method2219(local369, local425, local285, local464, local257, local313, this.aClass163_Sub1_6.anInt4205);
						} else if (local341 > 0) {
							if ((local1452.anIntArray377[local296] & 0xFFFFFF) != 0) {
								arg3.method2220(local369, local425, local285, local464, local257, local313, Static438.method5488(arg6[local296], local1452.anIntArray377[local296], this.aClass163_Sub1_6.anInt4205), Static438.method5488(arg6[local352], local1452.anIntArray377[local352], this.aClass163_Sub1_6.anInt4205), Static438.method5488(arg6[local408], local1452.anIntArray377[local408], this.aClass163_Sub1_6.anInt4205));
							}
						} else if ((local1452.anIntArray377[local296] & 0xFFFFFF) != 0) {
							arg3.method2220(local369, local425, local285, local464, local257, local313, local1452.anIntArray377[local296], local1452.anIntArray377[local352], local1452.anIntArray377[local408]);
						}
					}
				}
			}
		} else if ((local6.aByte74 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4134;
			local24 = local19 + super.anInt4134;
			local29 = arg1 * super.anInt4134;
			local34 = local29 + super.anInt4134;
			local36 = 0;
			local38 = 0;
			local40 = 0;
			local42 = 0;
			if ((local6.aByte74 & 0x1) == 0 || arg2) {
				local56 = this.anIntArrayArray29[arg0][arg1];
				local65 = this.anIntArrayArray29[arg0 + 1][arg1];
				local240 = this.anIntArrayArray29[arg0 + 1][arg1 + 1];
				local501 = this.anIntArrayArray29[arg0][arg1 + 1];
				if (this.anInt4129 == -1) {
					local82 = this.anInt4132 + (this.anInt4123 * local19 + this.anInt4125 * local56 + this.anInt4131 * local29 >> 15);
					if (local82 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local105 = this.anInt4132 + (this.anInt4123 * local24 + this.anInt4125 * local65 + this.anInt4131 * local29 >> 15);
					if (local105 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local128 = this.anInt4132 + (this.anInt4123 * local24 + this.anInt4125 * local240 + this.anInt4131 * local34 >> 15);
					if (local128 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local151 = this.anInt4132 + (this.anInt4123 * local19 + this.anInt4125 * local501 + this.anInt4131 * local34 >> 15);
					if (local151 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
				} else {
					local151 = this.anInt4129;
					local128 = this.anInt4129;
					local105 = this.anInt4129;
					local82 = this.anInt4129;
				}
				if (arg2) {
					local176 = local82 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local36 = local176;
						local642 = local6.aShort65 * local176 / 255;
						if (local642 > 0) {
							local56 -= local642;
						}
					}
					local176 = local105 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local38 = local176;
						local642 = local6.aShort66 * local176 / 255;
						if (local642 > 0) {
							local65 -= local642;
						}
					}
					local176 = local128 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local40 = local176;
						local642 = local6.aShort68 * local176 / 255;
						if (local642 > 0) {
							local240 -= local642;
						}
					}
					local176 = local151 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 255) {
						local176 = 255;
					}
					if (local176 > 0) {
						local42 = local176;
						local642 = local6.aShort67 * local176 / 255;
						if (local642 > 0) {
							local501 -= local642;
						}
					}
				} else if (this.aClass163_Sub1_6.aBoolean297) {
					local176 = local82 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local257 = this.anInt4120 + (this.anInt4122 * local19 + this.anInt4133 * local56 + this.anInt4127 * local29 >> 15);
				local268 = arg3.anInt2702 + local257 * this.aClass163_Sub1_6.anInt4209 / local82;
				local285 = this.anInt4124 + (this.anInt4130 * local19 + this.anInt4128 * local56 + this.anInt4121 * local29 >> 15);
				local296 = arg3.anInt2701 + local285 * this.aClass163_Sub1_6.anInt4207 / local82;
				local313 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local65 + this.anInt4127 * local29 >> 15);
				local324 = arg3.anInt2702 + local313 * this.aClass163_Sub1_6.anInt4209 / local105;
				local341 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local65 + this.anInt4121 * local29 >> 15);
				local352 = arg3.anInt2701 + local341 * this.aClass163_Sub1_6.anInt4207 / local105;
				local369 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local240 + this.anInt4127 * local34 >> 15);
				local380 = arg3.anInt2702 + local369 * this.aClass163_Sub1_6.anInt4209 / local128;
				local397 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local240 + this.anInt4121 * local34 >> 15);
				local408 = arg3.anInt2701 + local397 * this.aClass163_Sub1_6.anInt4207 / local128;
				local425 = this.anInt4120 + (this.anInt4122 * local19 + this.anInt4133 * local501 + this.anInt4127 * local34 >> 15);
				local436 = arg3.anInt2702 + local425 * this.aClass163_Sub1_6.anInt4209 / local151;
				local453 = this.anInt4124 + (this.anInt4130 * local19 + this.anInt4128 * local501 + this.anInt4121 * local34 >> 15);
				local464 = arg3.anInt2701 + local453 * this.aClass163_Sub1_6.anInt4207 / local151;
			} else {
				local56 = this.anIntArrayArray29[arg0][arg1];
				if (this.anInt4129 == -1) {
					local65 = this.anInt4125 * local56;
					local82 = this.anInt4132 + (this.anInt4123 * local19 + local65 + this.anInt4131 * local29 >> 15);
					if (local82 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local105 = this.anInt4132 + (this.anInt4123 * local24 + local65 + this.anInt4131 * local29 >> 15);
					if (local105 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local128 = this.anInt4132 + (this.anInt4123 * local24 + local65 + this.anInt4131 * local34 >> 15);
					if (local128 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local151 = this.anInt4132 + (this.anInt4123 * local19 + local65 + this.anInt4131 * local34 >> 15);
					if (local151 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
				} else {
					local151 = this.anInt4129;
					local128 = this.anInt4129;
					local105 = this.anInt4129;
					local82 = this.anInt4129;
				}
				if (this.aClass163_Sub1_6.aBoolean297) {
					local176 = local82 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local36 = local176;
						if (local176 > 255) {
							local36 = 255;
						}
					}
					local176 = local105 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local38 = local176;
						if (local176 > 255) {
							local38 = 255;
						}
					}
					local176 = local128 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local40 = local176;
						if (local176 > 255) {
							local40 = 255;
						}
					}
					local176 = local151 - this.aClass163_Sub1_6.anInt4212;
					if (local176 > 0) {
						local42 = local176;
						if (local176 > 255) {
							local42 = 255;
						}
					}
				}
				local65 = this.anInt4133 * local56;
				local240 = this.anInt4128 * local56;
				local257 = this.anInt4120 + (this.anInt4122 * local19 + local65 + this.anInt4127 * local29 >> 15);
				local268 = arg3.anInt2702 + local257 * this.aClass163_Sub1_6.anInt4209 / local82;
				local285 = this.anInt4124 + (this.anInt4130 * local19 + local240 + this.anInt4121 * local29 >> 15);
				local296 = arg3.anInt2701 + local285 * this.aClass163_Sub1_6.anInt4207 / local82;
				local313 = this.anInt4120 + (this.anInt4122 * local24 + local65 + this.anInt4127 * local29 >> 15);
				local324 = arg3.anInt2702 + local313 * this.aClass163_Sub1_6.anInt4209 / local105;
				local341 = this.anInt4124 + (this.anInt4130 * local24 + local240 + this.anInt4121 * local29 >> 15);
				local352 = arg3.anInt2701 + local341 * this.aClass163_Sub1_6.anInt4207 / local105;
				local369 = this.anInt4120 + (this.anInt4122 * local24 + local65 + this.anInt4127 * local34 >> 15);
				local380 = arg3.anInt2702 + local369 * this.aClass163_Sub1_6.anInt4209 / local128;
				local397 = this.anInt4124 + (this.anInt4130 * local24 + local240 + this.anInt4121 * local34 >> 15);
				local408 = arg3.anInt2701 + local397 * this.aClass163_Sub1_6.anInt4207 / local128;
				local425 = this.anInt4120 + (this.anInt4122 * local19 + local65 + this.anInt4127 * local34 >> 15);
				local436 = arg3.anInt2702 + local425 * this.aClass163_Sub1_6.anInt4209 / local151;
				local453 = this.anInt4124 + (this.anInt4130 * local19 + local240 + this.anInt4121 * local34 >> 15);
				local464 = arg3.anInt2701 + local453 * this.aClass163_Sub1_6.anInt4207 / local151;
			}
			@Pc(1064) boolean local1064 = local6.aShort64 != -1 && this.method3266(this.aClass163_Sub1_6.anInterface9_12.method1769(local6.aShort64).aByte43);
			local65 = local38 + local40 + local42;
			if ((local380 - local436) * (local352 - local464) - (local408 - local464) * (local324 - local436) > 0) {
				arg3.aBoolean173 = local380 < 0 || local436 < 0 || local324 < 0 || local380 > arg3.anInt2703 || local436 > arg3.anInt2703 || local324 > arg3.anInt2703;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt2704 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort64 >= 0) {
							arg3.method2221(local408, local464, local352, local380, local436, local324, this.aClass163_Sub1_6.anInt4205, local40, local42, local38, local6.anInt5723, local6.anInt5726, local6.anInt5722, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort64);
						} else {
							arg3.method2220(local408, local464, local352, local380, local436, local324, Static418.method5304(local6.anInt5723, local40 << 24 | this.aClass163_Sub1_6.anInt4205), Static418.method5304(local6.anInt5726, local42 << 24 | this.aClass163_Sub1_6.anInt4205), Static418.method5304(local6.anInt5722, local38 << 24 | this.aClass163_Sub1_6.anInt4205));
						}
					} else if (local6.aShort64 >= 0) {
						arg3.method2222(local408, local464, local352, local380, local436, local324, local6.anInt5723, local6.anInt5726, local6.anInt5722, local369, local425, local313, local397, local453, local341, local128, local151, local105, local6.aShort64);
					} else {
						arg3.method2220(local408, local464, local352, local380, local436, local324, local6.anInt5723, local6.anInt5726, local6.anInt5722);
					}
					arg3.anInt2704 = 0;
				} else {
					arg3.method2219(local408, local464, local352, local380, local436, local324, this.aClass163_Sub1_6.anInt4205);
				}
			}
			local65 = local36 + local38 + local42;
			if ((local268 - local324) * (local464 - local352) - (local296 - local352) * (local436 - local324) > 0) {
				arg3.aBoolean173 = local268 < 0 || local324 < 0 || local436 < 0 || local268 > arg3.anInt2703 || local324 > arg3.anInt2703 || local436 > arg3.anInt2703;
				if (local65 < 765) {
					if (local1064) {
						arg3.anInt2704 = 100;
					}
					if (local65 > 0) {
						if (local6.aShort64 >= 0) {
							arg3.method2221(local296, local352, local464, local268, local324, local436, this.aClass163_Sub1_6.anInt4205, local36, local38, local42, local6.anInt5724, local6.anInt5722, local6.anInt5726, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort64);
						} else {
							arg3.method2220(local296, local352, local464, local268, local324, local436, Static418.method5304(local6.anInt5724, local36 << 24 | this.aClass163_Sub1_6.anInt4205), Static418.method5304(local6.anInt5722, local38 << 24 | this.aClass163_Sub1_6.anInt4205), Static418.method5304(local6.anInt5726, local42 << 24 | this.aClass163_Sub1_6.anInt4205));
						}
					} else if (local6.aShort64 >= 0) {
						arg3.method2222(local296, local352, local464, local268, local324, local436, local6.anInt5724, local6.anInt5722, local6.anInt5726, local257, local313, local425, local285, local341, local453, local82, local105, local151, local6.aShort64);
					} else {
						arg3.method2220(local296, local352, local464, local268, local324, local436, local6.anInt5724, local6.anInt5722, local6.anInt5726);
					}
					arg3.anInt2704 = 0;
					return;
				}
				arg3.method2219(local296, local352, local464, local268, local324, local436, this.aClass163_Sub1_6.anInt4205);
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(III[[ZZ)V")
	@Override
	public void method3277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) Class31_Sub1 local3 = this.aClass163_Sub1_6.aClass31_Sub1_1;
		this.anInt4129 = -1;
		this.anInt4122 = local3.anInt2888;
		this.anInt4133 = local3.anInt2887;
		this.anInt4127 = local3.anInt2882;
		this.anInt4120 = local3.anInt2889;
		this.anInt4130 = local3.anInt2893;
		this.anInt4128 = local3.anInt2891;
		this.anInt4121 = local3.anInt2883;
		this.anInt4124 = local3.anInt2886;
		this.anInt4123 = local3.anInt2885;
		this.anInt4125 = local3.anInt2884;
		this.anInt4131 = local3.anInt2892;
		this.anInt4132 = local3.anInt2890;
	}

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "(Lclient!i;IIIIZ)V")
	@Override
	public void H(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Z")
	private boolean method3266(@OriginalArg(0) int arg0) {
		if ((this.anInt4126 & 0x8) == 0) {
			return false;
		} else if (arg0 == 4) {
			return true;
		} else if (arg0 == 8) {
			return true;
		} else {
			return arg0 == 9;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIII[[ZLclient!hp;[I[I)V")
	private void method3267(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class107 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean172 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(68) int local68;
					if (this.aClass210ArrayArray1[local22][local25] != null) {
						@Pc(50) Class210 local50 = this.aClass210ArrayArray1[local22][local25];
						if (local50.aShort64 != -1 && (local50.aByte74 & 0x2) == 0 && local50.anInt5725 == 0) {
							local68 = this.aClass163_Sub1_6.method3452(local50.aShort64);
							arg5.method2224(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static147.method2145(local68, local50.anInt5723), Static147.method2145(local68, local50.anInt5726), Static147.method2145(local68, local50.anInt5722));
							arg5.method2224(local20, local20, local20 - 4, local16, local16 + 4, local16, Static147.method2145(local68, local50.anInt5724), Static147.method2145(local68, local50.anInt5722), Static147.method2145(local68, local50.anInt5726));
						} else if (local50.anInt5725 == 0) {
							arg5.method2220(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.anInt5723, local50.anInt5726, local50.anInt5722);
							arg5.method2220(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.anInt5724, local50.anInt5722, local50.anInt5726);
						} else {
							local68 = local50.anInt5725;
							arg5.method2220(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static418.method5304(local68, local50.anInt5723 & 0xFF000000), Static418.method5304(local68, local50.anInt5726 & 0xFF000000), Static418.method5304(local68, local50.anInt5722 & 0xFF000000));
							arg5.method2220(local20, local20, local20 - 4, local16, local16 + 4, local16, Static418.method5304(local68, local50.anInt5724 & 0xFF000000), Static418.method5304(local68, local50.anInt5722 & 0xFF000000), Static418.method5304(local68, local50.anInt5726 & 0xFF000000));
						}
					} else if (this.aClass171ArrayArray1[local22][local25] != null) {
						@Pc(259) Class171 local259 = this.aClass171ArrayArray1[local22][local25];
						for (local68 = 0; local68 < local259.aShort39; local68++) {
							arg6[local68] = local16 + local259.aShortArray35[local68] * 4 / super.anInt4134;
							arg7[local68] = local20 - local259.aShortArray38[local68] * 4 / super.anInt4134;
						}
						for (@Pc(297) int local297 = 0; local297 < local259.aShort40; local297++) {
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
							if (local259.anIntArray376 != null && local259.anIntArray376[local297] != 0 && (local259.aShortArray37 == null || local259.aShortArray37 != null && local259.aShortArray37[local297] == -1)) {
								local359 = local259.anIntArray376[local297];
								arg5.method2220(local326, local330, local334, local314, local318, local322, Static418.method5304(local359, -(local259.anIntArray377[local302] & -16777216) - 16777216), Static418.method5304(local359, -(local259.anIntArray377[local306] & -16777216) - 16777216), Static418.method5304(local359, -(local259.anIntArray377[local310] & -16777216) - 16777216));
							} else if (local259.aShortArray37 == null || local259.aShortArray37[local297] == -1) {
								arg5.method2220(local326, local330, local334, local314, local318, local322, local259.anIntArray377[local302], local259.anIntArray377[local306], local259.anIntArray377[local310]);
							} else {
								local359 = this.aClass163_Sub1_6.method3452(local259.aShortArray37[local297]);
								arg5.method2224(local326, local330, local334, local314, local318, local322, local359, local359, local359);
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean172 = true;
	}

	@OriginalMember(owner = "client!mq", name = "aa", descriptor = "()V")
	@Override
	public void aa() {
		this.aByteArrayArray34 = null;
		this.aByteArrayArray33 = null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!sa;[I)V")
	@Override
	public void method3274(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int[] arg1) {
	}

	@OriginalMember(owner = "client!mq", name = "ca", descriptor = "(II)I")
	@Override
	public int ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0 >> super.anInt4139;
		@Pc(9) int local9 = arg1 >> super.anInt4139;
		if (local4 < 0 || local9 < 0 || local4 > super.anInt4138 - 1 || local9 > super.anInt4137 - 1) {
			return 0;
		}
		@Pc(34) int local34 = arg0 & super.anInt4134 - 1;
		@Pc(41) int local41 = arg1 & super.anInt4134 - 1;
		@Pc(67) int local67 = this.anIntArrayArray29[local4][local9] * (super.anInt4134 - local34) + this.anIntArrayArray29[local4 + 1][local9] * local34 >> super.anInt4139;
		@Pc(97) int local97 = this.anIntArrayArray29[local4][local9 + 1] * (super.anInt4134 - local34) + this.anIntArrayArray29[local4 + 1][local9 + 1] * local34 >> super.anInt4139;
		return local67 * (super.anInt4134 - local41) + local97 * local41 >> super.anInt4139;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void method3275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (this.aClass224ArrayArray1 == null) {
			this.aClass224ArrayArray1 = new Class224[super.anInt4138][super.anInt4137];
			this.aClass223ArrayArray1 = new Class223[super.anInt4138][super.anInt4137];
		} else if (this.aClass210ArrayArray1 != null) {
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
				if (local64 != 0 && local64 != super.anInt4134 || local70 != 0 && local70 != super.anInt4134) {
					local26 = false;
					break;
				}
			}
		}
		if (!local26) {
			@Pc(95) Class223 local95 = new Class223();
			@Pc(99) short local99 = (short) arg2.length;
			@Pc(103) short local103 = (short) arg9.length;
			local95.aShort76 = local99;
			local95.aShortArray81 = new short[local99];
			local95.aShortArray77 = new short[local99];
			local95.aShortArray82 = new short[local99];
			local95.aShortArray76 = new short[local99];
			@Pc(133) int local133;
			@Pc(288) int local288;
			@Pc(335) int local335;
			for (@Pc(124) int local124 = 0; local124 < local99; local124++) {
				@Pc(129) int local129 = arg2[local124];
				local133 = arg4[local124];
				if (local129 == 0 && local133 == 0) {
					local95.aShortArray81[local124] = (short) (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				} else if (local129 == 0 && local133 == super.anInt4134) {
					local95.aShortArray81[local124] = (short) (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]);
				} else if (local129 == super.anInt4134 && local133 == super.anInt4134) {
					local95.aShortArray81[local124] = (short) (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]);
				} else if (local129 == super.anInt4134 && local133 == 0) {
					local95.aShortArray81[local124] = (short) (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]);
				} else {
					local288 = (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]) * (super.anInt4134 - local129) + (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]) * local129;
					local335 = (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]) * (super.anInt4134 - local129) + (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]) * local129;
					local95.aShortArray81[local124] = (short) (local288 * (super.anInt4134 - local133) + local335 * local133 >> super.anInt4139 * 2);
				}
				local288 = (arg0 << super.anInt4139) + local129;
				local335 = (arg1 << super.anInt4139) + local133;
				local95.aShortArray77[local124] = (short) local129;
				local95.aShortArray76[local124] = (short) local133;
				local95.aShortArray82[local124] = (short) (this.ca(local288, local335) + (arg3 == null ? 0 : arg3[local124]));
				if (local95.aShortArray81[local124] < 2) {
					local95.aShortArray81[local124] = 2;
				}
			}
			@Pc(415) boolean local415 = false;
			local133 = 0;
			for (local288 = 0; local288 < local103; local288++) {
				if (arg9[local288] >= 0 || arg10 != null && arg10[local288] >= 0) {
					local133++;
				}
				if (arg11[local288] != -1 && !this.aClass163_Sub1_6.anInterface9_12.method1769(arg11[local288]).aBoolean284) {
					local415 = true;
				}
			}
			local95.anIntArray532 = new int[local133];
			if (arg10 != null) {
				local95.anIntArray531 = new int[local133];
			}
			local95.aShortArray74 = new short[local133];
			local95.aShortArray79 = new short[local133];
			local95.aShortArray78 = new short[local133];
			if (local415) {
				local95.aShortArray80 = new short[local133];
				local95.aShortArray75 = new short[local133];
			}
			for (local335 = 0; local335 < local103; local335++) {
				if (arg9[local335] >= 0 || arg10 != null && arg10[local335] >= 0) {
					if (arg9[local335] >= 0) {
						local95.anIntArray532[local95.aShort75] = Static362.method4761(arg9[local335]);
					} else {
						local95.anIntArray532[local95.aShort75] = -1;
					}
					if (arg10 != null) {
						if (arg10[local335] == -1) {
							local95.anIntArray531[local95.aShort75] = -1;
						} else {
							local95.anIntArray531[local95.aShort75] = Static362.method4761(arg10[local335]);
						}
					}
					local95.aShortArray74[local95.aShort75] = (short) arg6[local335];
					local95.aShortArray79[local95.aShort75] = (short) arg7[local335];
					local95.aShortArray78[local95.aShort75] = (short) arg8[local335];
					if (local415) {
						if (arg11[local335] == -1 || this.aClass163_Sub1_6.anInterface9_12.method1769(arg11[local335]).aBoolean284) {
							local95.aShortArray80[local95.aShort75] = -1;
						} else {
							local95.aShortArray80[local95.aShort75] = (short) arg11[local335];
							local95.aShortArray75[local95.aShort75] = (short) arg12[local335];
						}
					}
					local95.aShort75++;
				}
			}
			this.aClass223ArrayArray1[arg0][arg1] = local95;
		} else if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
			@Pc(644) Class224 local644 = new Class224();
			local64 = arg9[0];
			local70 = arg11[0];
			if (arg10 != null) {
				local644.anInt6175 = Static147.method2145(Static362.method4761(arg10[0]), this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				if (local64 == -1) {
					local644.aByte77 = (byte) (local644.aByte77 | 0x2);
				}
			}
			if (this.anIntArrayArray29[arg0][arg1] == this.anIntArrayArray29[arg0 + 1][arg1] && this.anIntArrayArray29[arg0][arg1] == this.anIntArrayArray29[arg0 + 1][arg1 + 1] && this.anIntArrayArray29[arg0][arg1] == this.anIntArrayArray29[arg0][arg1 + 1]) {
				local644.aByte77 = (byte) (local644.aByte77 | 0x1);
			}
			if (local70 == -1 || (local644.aByte77 & 0x2) != 0 || this.aClass163_Sub1_6.anInterface9_12.method1769(local70).aBoolean284) {
				@Pc(845) short local845 = Static362.method4761(local64);
				local644.aShort77 = (short) Static147.method2145(local845, this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				local644.aShort81 = (short) Static147.method2145(local845, this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]);
				local644.aShort80 = (short) Static147.method2145(local845, this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]);
				local644.aShort78 = (short) Static147.method2145(local845, this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]);
				local644.aShort79 = -1;
			} else {
				local644.aShort77 = (short) (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]);
				local644.aShort81 = (short) (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]);
				local644.aShort80 = (short) (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]);
				local644.aShort78 = (short) (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]);
				local644.aShort79 = (short) local70;
			}
			this.aClass224ArrayArray1[arg0][arg1] = local644;
		}
	}

	@OriginalMember(owner = "client!mq", name = "ua", descriptor = "(II)I")
	@Override
	public int ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anIntArrayArray29[arg0][arg1];
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!i;IIIIZ)Z")
	@Override
	public boolean method3273(@OriginalArg(0) Class2_Sub5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13) {
		if (this.aClass210ArrayArray1 == null) {
			this.aClass210ArrayArray1 = new Class210[super.anInt4138][super.anInt4137];
			this.aClass171ArrayArray1 = new Class171[super.anInt4138][super.anInt4137];
		} else if (this.aClass224ArrayArray1 != null) {
			throw new IllegalStateException();
		}
		if (arg2 == null || arg2.length == 0) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < arg6.length; local32++) {
			if (arg6[local32] == -1) {
				arg6[local32] = 0;
			} else {
				arg6[local32] = Static216.anIntArray305[Static362.method4761(arg6[local32]) & 0xFFFF] << 8 | 0xFF;
			}
		}
		if (arg7 != null) {
			for (@Pc(68) int local68 = 0; local68 < arg7.length; local68++) {
				if (arg7[local68] == -1) {
					arg7[local68] = 0;
				} else {
					arg7[local68] = Static216.anIntArray305[Static362.method4761(arg7[local68]) & 0xFFFF] << 8 | 0xFF;
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
				} else if (arg2[local116] == super.anInt4134 && arg4[local116] == 0) {
					if (local106 != -1 && arg6[local106] != arg6[local116]) {
						local102 = false;
						break;
					}
					local106 = local116;
				} else if (arg2[local116] == super.anInt4134 && arg4[local116] == super.anInt4134) {
					if (local108 != -1 && arg6[local108] != arg6[local116]) {
						local102 = false;
						break;
					}
					local108 = local116;
				} else if (arg2[local116] == 0 && arg4[local116] == super.anInt4134) {
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
						if (arg2[local244] != arg2[0] && arg2[local244] != arg2[0] + super.anInt4134 && arg2[local244] != arg2[0] - super.anInt4134) {
							local102 = false;
							break;
						}
						if (arg4[local244] != arg4[0] && arg4[local244] != arg4[0] + super.anInt4134 && arg4[local244] != arg4[0] - super.anInt4134) {
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
			@Pc(334) Class210 local334 = new Class210();
			local244 = arg6[0];
			local342 = arg8[0];
			if (arg7 != null) {
				local334.anInt5725 = arg7[0] >> 8;
				if (local244 == 0) {
					local334.aByte74 = (byte) (local334.aByte74 | 0x2);
				}
			} else if (local244 == 0) {
				return;
			}
			if (this.anIntArrayArray29[arg0][arg1] == this.anIntArrayArray29[arg0 + 1][arg1] && this.anIntArrayArray29[arg0][arg1] == this.anIntArrayArray29[arg0 + 1][arg1 + 1] && this.anIntArrayArray29[arg0][arg1] == this.anIntArrayArray29[arg0][arg1 + 1]) {
				local334.aByte74 = (byte) (local334.aByte74 | 0x1);
			}
			if (local342 == -1 || (local334.aByte74 & 0x2) != 0 || this.aClass163_Sub1_6.anInterface9_12.method1769(local342).aBoolean284) {
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
				local334.anInt5724 = Static438.method5488(local527, Static467.method3270(arg6[local104] >> 8, this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]), arg10);
				if (local334.anInt5725 != 0) {
					local334.anInt5724 |= this.aByteArrayArray33[arg0][arg1] + 255 - this.aByteArrayArray34[arg0][arg1] << 25;
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
				local334.anInt5722 = Static438.method5488(local527, Static467.method3270(arg6[local106] >> 8, this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]), arg10);
				if (local334.anInt5725 != 0) {
					local334.anInt5722 |= this.aByteArrayArray33[arg0 + 1][arg1] + 255 - this.aByteArrayArray34[arg0 + 1][arg1] << 25;
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
				local334.anInt5723 = Static438.method5488(local527, Static467.method3270(arg6[local108] >> 8, this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]), arg10);
				if (local334.anInt5725 != 0) {
					local334.anInt5723 |= this.aByteArrayArray33[arg0 + 1][arg1 + 1] + 255 - this.aByteArrayArray34[arg0 + 1][arg1 + 1] << 25;
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
				local334.anInt5726 = Static438.method5488(local527, Static467.method3270(arg6[local110] >> 8, this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]), arg10);
				if (local334.anInt5725 != 0) {
					local334.anInt5726 |= this.aByteArrayArray33[arg0][arg1 + 1] + 255 - this.aByteArrayArray34[arg0][arg1 + 1] << 25;
				}
				local334.aShort64 = -1;
			} else {
				local334.anInt5724 = this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1];
				local334.anInt5722 = this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1];
				local334.anInt5723 = this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1];
				local334.anInt5726 = this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1];
				local334.aShort64 = (short) local342;
			}
			if (arg5 != null) {
				local334.aShort68 = (short) arg5[local108];
				local334.aShort67 = (short) arg5[local110];
				local334.aShort66 = (short) arg5[local106];
				local334.aShort65 = (short) arg5[local104];
			}
			this.aClass210ArrayArray1[arg0][arg1] = local334;
			return;
		}
		@Pc(888) Class171 local888 = new Class171();
		local888.aShort39 = (short) arg2.length;
		local888.aShort40 = (short) (arg2.length / 3);
		local888.aShortArray35 = new short[local888.aShort39];
		local888.aShortArray33 = new short[local888.aShort39];
		local888.aShortArray38 = new short[local888.aShort39];
		local888.anIntArray377 = new int[local888.aShort39];
		if (arg5 != null) {
			local888.aShortArray34 = new short[local888.aShort39];
		}
		@Pc(958) int local958;
		@Pc(1079) int local1079;
		@Pc(1126) int local1126;
		@Pc(1226) int local1226;
		for (local244 = 0; local244 < local888.aShort39; local244++) {
			local342 = arg2[local244];
			local527 = arg4[local244];
			if (local342 == 0 && local527 == 0) {
				local958 = this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1];
			} else if (local342 == 0 && local527 == super.anInt4134) {
				local958 = this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1];
			} else if (local342 == super.anInt4134 && local527 == super.anInt4134) {
				local958 = this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1];
			} else if (local342 == super.anInt4134 && local527 == 0) {
				local958 = this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1];
			} else {
				local1079 = (this.aByteArrayArray34[arg0][arg1] - this.aByteArrayArray33[arg0][arg1]) * (super.anInt4134 - local342) + (this.aByteArrayArray34[arg0 + 1][arg1] - this.aByteArrayArray33[arg0 + 1][arg1]) * local342;
				local1126 = (this.aByteArrayArray34[arg0][arg1 + 1] - this.aByteArrayArray33[arg0][arg1 + 1]) * (super.anInt4134 - local342) + (this.aByteArrayArray34[arg0 + 1][arg1 + 1] - this.aByteArrayArray33[arg0 + 1][arg1 + 1]) * local342;
				local958 = local1079 * (super.anInt4134 - local527) + local1126 * local527 >> super.anInt4139 * 2;
			}
			local1079 = (arg0 << super.anInt4139) + local342;
			local1126 = (arg1 << super.anInt4139) + local527;
			local888.aShortArray35[local244] = (short) local342;
			local888.aShortArray38[local244] = (short) local527;
			local888.aShortArray33[local244] = (short) (this.ca(local1079, local1126) + (arg3 == null ? 0 : arg3[local244]));
			if (local958 < 0) {
				local958 = 0;
			}
			if (arg8[local244] != -1 && !this.aClass163_Sub1_6.anInterface9_12.method1769(arg8[local244]).aBoolean284) {
				local888.anIntArray377[local244] = local958;
			} else if (arg6[local244] != 0) {
				local1226 = 0;
				if (arg5 != null) {
					@Pc(1238) short local1238 = local888.aShortArray34[local244] = (short) arg5[local244];
					if (arg11 != 0) {
						local1226 = local1238 * 255 / arg11;
						if (local1226 < 0) {
							local1226 = 0;
						} else if (local1226 > 255) {
							local1226 = 255;
						}
					}
				}
				local888.anIntArray377[local244] = Static438.method5488(local1226, Static467.method3270(arg6[local244] >> 8, local958), arg10);
				if (arg7 != null) {
					local888.anIntArray377[local244] |= local958 << 25;
				}
			} else if (arg7 == null) {
				local888.anIntArray377[local244] = 0;
			} else {
				local888.anIntArray377[local244] = local958 << 25;
			}
		}
		@Pc(1296) boolean local1296 = false;
		for (local527 = 0; local527 < local888.aShort40; local527++) {
			if (arg8[local527 * 3] != -1 && !this.aClass163_Sub1_6.anInterface9_12.method1769(arg8[local527 * 3]).aBoolean284) {
				local1296 = true;
			}
		}
		if (arg7 != null) {
			local888.anIntArray376 = new int[local888.aShort40];
		}
		if (local1296) {
			local888.aShortArray37 = new short[local888.aShort40];
			local888.aShortArray36 = new short[local888.aShort40];
		}
		for (local958 = 0; local958 < local888.aShort40; local958++) {
			local1079 = local958 * 3;
			if (arg7 != null && arg7[local1079] != 0) {
				local888.anIntArray376[local958] = arg7[local1079] >> 8;
			}
			if (local1296) {
				local1126 = local1079 + 1;
				local1226 = local1126 + 1;
				@Pc(1378) boolean local1378 = false;
				@Pc(1380) boolean local1380 = true;
				@Pc(1384) int local1384 = arg8[local1079];
				if (local1384 == -1 || this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aBoolean284) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1126];
				if (local1384 == -1 || this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aBoolean284) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				local1384 = arg8[local1226];
				if (local1384 == -1 || this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aBoolean284) {
					local1380 = false;
				} else {
					local1378 = true;
				}
				if (local1380) {
					local888.aShortArray37[local958] = (short) local1384;
					local888.aShortArray36[local958] = (short) arg9[local1079];
				} else {
					if (local1378) {
						local1384 = arg8[local1079];
						if (local1384 != -1 && !this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aBoolean284) {
							local888.anIntArray377[local1079] = Static216.anIntArray305[Static362.method4761(this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aShort37 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1126];
						if (local1384 != -1 && !this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aBoolean284) {
							local888.anIntArray377[local1126] = Static216.anIntArray305[Static362.method4761(this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aShort37 & 0xFFFF) & 0xFFFF];
						}
						local1384 = arg8[local1226];
						if (local1384 != -1 && !this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aBoolean284) {
							local888.anIntArray377[local1226] = Static216.anIntArray305[Static362.method4761(this.aClass163_Sub1_6.anInterface9_12.method1769(local1384).aShort37 & 0xFFFF) & 0xFFFF];
						}
					}
					local888.aShortArray37[local958] = -1;
				}
			}
		}
		this.aClass171ArrayArray1[arg0][arg1] = local888;
	}

	@OriginalMember(owner = "client!mq", name = "qa", descriptor = "(III)V")
	@Override
	public void qa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aByteArrayArray33[arg0][arg1] < arg2) {
			this.aByteArrayArray33[arg0][arg1] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!hp;[I[I[I)V")
	private void method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class107 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5) {
		@Pc(6) Class224 local6 = this.aClass224ArrayArray1[arg0][arg1];
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
			@Pc(1022) Class223 local1022 = this.aClass223ArrayArray1[arg0][arg1];
			if (local1022 != null) {
				@Pc(1046) short local1046;
				if (this.anInt4129 == -1) {
					for (local362 = 0; local362 < local1022.aShort76; local362++) {
						local24 = local1022.aShortArray77[local362] + (arg0 << super.anInt4139);
						local1046 = local1022.aShortArray82[local362];
						local34 = local1022.aShortArray76[local362] + (arg1 << super.anInt4139);
						local306 = this.anInt4132 + (this.anInt4123 * local24 + this.anInt4125 * local1046 + this.anInt4131 * local34 >> 15);
						if (local306 <= this.aClass163_Sub1_6.anInt4221) {
							return;
						}
						local194 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local1046 + this.anInt4127 * local34 >> 15);
						local250 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local1046 + this.anInt4121 * local34 >> 15);
						arg3[local362] = arg2.anInt2702 + local194 * this.aClass163_Sub1_6.anInt4209 / local306;
						arg4[local362] = arg2.anInt2701 + local250 * this.aClass163_Sub1_6.anInt4207 / local306;
					}
				} else {
					for (local362 = 0; local362 < local1022.aShort76; local362++) {
						local24 = local1022.aShortArray77[local362] + (arg0 << super.anInt4139);
						local1046 = local1022.aShortArray82[local362];
						local34 = local1022.aShortArray76[local362] + (arg1 << super.anInt4139);
						local194 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local1046 + this.anInt4127 * local34 >> 15);
						local250 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local1046 + this.anInt4121 * local34 >> 15);
						arg3[local362] = arg2.anInt2702 + local194 * this.aClass163_Sub1_6.anInt4209 / this.anInt4129;
						arg4[local362] = arg2.anInt2701 + local250 * this.aClass163_Sub1_6.anInt4207 / this.anInt4129;
					}
				}
				if (local1022.aShortArray80 != null) {
					local362 = this.anIntArrayArray29[arg0][arg1];
					local222 = this.anIntArrayArray29[arg0 + 1][arg1];
					local278 = this.anIntArrayArray29[arg0][arg1 + 1];
					local334 = arg0 * super.anInt4134;
					local390 = local334 + super.anInt4134;
					local183 = arg1 * super.anInt4134;
					local239 = local183 + super.anInt4134;
					local295 = this.anInt4120 + (this.anInt4122 * local334 + this.anInt4133 * local362 + this.anInt4127 * local183 >> 15);
					local351 = this.anInt4124 + (this.anInt4130 * local334 + this.anInt4128 * local362 + this.anInt4121 * local183 >> 15);
					local211 = this.anInt4132 + (this.anInt4123 * local334 + this.anInt4125 * local362 + this.anInt4131 * local183 >> 15);
					local267 = this.anInt4120 + (this.anInt4122 * local390 + this.anInt4133 * local222 + this.anInt4127 * local183 >> 15);
					local323 = this.anInt4124 + (this.anInt4130 * local390 + this.anInt4128 * local222 + this.anInt4121 * local183 >> 15);
					local379 = this.anInt4132 + (this.anInt4123 * local390 + this.anInt4125 * local222 + this.anInt4131 * local183 >> 15);
					local72 = this.anInt4120 + (this.anInt4122 * local334 + this.anInt4133 * local278 + this.anInt4127 * local239 >> 15);
					local95 = this.anInt4124 + (this.anInt4130 * local334 + this.anInt4128 * local278 + this.anInt4121 * local239 >> 15);
					local118 = this.anInt4132 + (this.anInt4123 * local334 + this.anInt4125 * local278 + this.anInt4131 * local239 >> 15);
					for (local141 = 0; local141 < local1022.aShort75; local141++) {
						@Pc(1491) short local1491 = local1022.aShortArray74[local141];
						@Pc(1496) short local1496 = local1022.aShortArray79[local141];
						@Pc(1501) short local1501 = local1022.aShortArray78[local141];
						local427 = arg3[local1491];
						@Pc(1509) int local1509 = arg3[local1496];
						@Pc(1513) int local1513 = arg3[local1501];
						@Pc(1517) int local1517 = arg4[local1491];
						@Pc(1521) int local1521 = arg4[local1496];
						@Pc(1525) int local1525 = arg4[local1501];
						if ((local427 - local1509) * (local1525 - local1521) - (local1517 - local1521) * (local1513 - local1509) > 0) {
							arg2.aBoolean173 = local427 < 0 || local1509 < 0 || local1513 < 0 || local427 > arg2.anInt2703 || local1509 > arg2.anInt2703 || local1513 > arg2.anInt2703;
							@Pc(1569) short local1569 = local1022.aShortArray80[local141];
							if (local1569 == -1) {
								@Pc(1624) int local1624 = local1022.anIntArray532[local141];
								if (local1624 != -1) {
									arg2.method2224(local1517, local1521, local1525, local427, local1509, local1513, Static147.method2145(local1624, local1022.aShortArray81[local1491]), Static147.method2145(local1624, local1022.aShortArray81[local1496]), Static147.method2145(local1624, local1022.aShortArray81[local1501]));
								}
							} else {
								if (this.method3266(this.aClass163_Sub1_6.anInterface9_12.method1769(local1569).aByte43)) {
									arg2.anInt2704 = 100;
								}
								arg2.method2222(local1517, local1521, local1525, local427, local1509, local1513, local1022.aShortArray81[local1491], local1022.aShortArray81[local1496], local1022.aShortArray81[local1501], local295, local267, local72, local351, local323, local95, local211, local379, local118, local1569);
								arg2.anInt2704 = 0;
							}
						}
					}
					return;
				}
				for (local362 = 0; local362 < local1022.aShort75; local362++) {
					@Pc(1670) short local1670 = local1022.aShortArray74[local362];
					@Pc(1675) short local1675 = local1022.aShortArray79[local362];
					@Pc(1680) short local1680 = local1022.aShortArray78[local362];
					local390 = arg3[local1670];
					local183 = arg3[local1675];
					local239 = arg3[local1680];
					local295 = arg4[local1670];
					local351 = arg4[local1675];
					local211 = arg4[local1680];
					if ((local390 - local183) * (local211 - local351) - (local295 - local351) * (local239 - local183) > 0) {
						local267 = local1022.anIntArray532[local362];
						if (local267 != -1) {
							arg2.aBoolean173 = local390 < 0 || local183 < 0 || local239 < 0 || local390 > arg2.anInt2703 || local183 > arg2.anInt2703 || local239 > arg2.anInt2703;
							arg2.method2224(local295, local351, local211, local390, local183, local239, Static147.method2145(local267, local1022.aShortArray81[local1670]), Static147.method2145(local267, local1022.aShortArray81[local1675]), Static147.method2145(local267, local1022.aShortArray81[local1680]));
						}
					}
				}
			}
		} else if ((local6.aByte77 & 0x2) == 0) {
			@Pc(19) int local19 = arg0 * super.anInt4134;
			local24 = local19 + super.anInt4134;
			@Pc(29) int local29 = arg1 * super.anInt4134;
			local34 = local29 + super.anInt4134;
			@Pc(46) int local46;
			@Pc(55) int local55;
			@Pc(166) int local166;
			if ((local6.aByte77 & 0x1) == 0) {
				local46 = this.anIntArrayArray29[arg0][arg1];
				local55 = this.anIntArrayArray29[arg0 + 1][arg1];
				local166 = this.anIntArrayArray29[arg0 + 1][arg1 + 1];
				local427 = this.anIntArrayArray29[arg0][arg1 + 1];
				if (this.anInt4129 == -1) {
					local72 = this.anInt4132 + (this.anInt4123 * local19 + this.anInt4125 * local46 + this.anInt4131 * local29 >> 15);
					if (local72 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local95 = this.anInt4132 + (this.anInt4123 * local24 + this.anInt4125 * local55 + this.anInt4131 * local29 >> 15);
					if (local95 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local118 = this.anInt4132 + (this.anInt4123 * local24 + this.anInt4125 * local166 + this.anInt4131 * local34 >> 15);
					if (local118 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local141 = this.anInt4132 + (this.anInt4123 * local19 + this.anInt4125 * local427 + this.anInt4131 * local34 >> 15);
					if (local141 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
				} else {
					local141 = this.anInt4129;
					local118 = this.anInt4129;
					local95 = this.anInt4129;
					local72 = this.anInt4129;
				}
				local183 = this.anInt4120 + (this.anInt4122 * local19 + this.anInt4133 * local46 + this.anInt4127 * local29 >> 15);
				local194 = arg2.anInt2702 + local183 * this.aClass163_Sub1_6.anInt4209 / local72;
				local211 = this.anInt4124 + (this.anInt4130 * local19 + this.anInt4128 * local46 + this.anInt4121 * local29 >> 15);
				local222 = arg2.anInt2701 + local211 * this.aClass163_Sub1_6.anInt4207 / local72;
				local239 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local55 + this.anInt4127 * local29 >> 15);
				local250 = arg2.anInt2702 + local239 * this.aClass163_Sub1_6.anInt4209 / local95;
				local267 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local55 + this.anInt4121 * local29 >> 15);
				local278 = arg2.anInt2701 + local267 * this.aClass163_Sub1_6.anInt4207 / local95;
				local295 = this.anInt4120 + (this.anInt4122 * local24 + this.anInt4133 * local166 + this.anInt4127 * local34 >> 15);
				local306 = arg2.anInt2702 + local295 * this.aClass163_Sub1_6.anInt4209 / local118;
				local323 = this.anInt4124 + (this.anInt4130 * local24 + this.anInt4128 * local166 + this.anInt4121 * local34 >> 15);
				local334 = arg2.anInt2701 + local323 * this.aClass163_Sub1_6.anInt4207 / local118;
				local351 = this.anInt4120 + (this.anInt4122 * local19 + this.anInt4133 * local427 + this.anInt4127 * local34 >> 15);
				local362 = arg2.anInt2702 + local351 * this.aClass163_Sub1_6.anInt4209 / local141;
				local379 = this.anInt4124 + (this.anInt4130 * local19 + this.anInt4128 * local427 + this.anInt4121 * local34 >> 15);
				local390 = arg2.anInt2701 + local379 * this.aClass163_Sub1_6.anInt4207 / local141;
			} else {
				local46 = this.anIntArrayArray29[arg0][arg1];
				if (this.anInt4129 == -1) {
					local55 = this.anInt4125 * local46;
					local72 = this.anInt4132 + (this.anInt4123 * local19 + local55 + this.anInt4131 * local29 >> 15);
					if (local72 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local95 = this.anInt4132 + (this.anInt4123 * local24 + local55 + this.anInt4131 * local29 >> 15);
					if (local95 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local118 = this.anInt4132 + (this.anInt4123 * local24 + local55 + this.anInt4131 * local34 >> 15);
					if (local118 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
					local141 = this.anInt4132 + (this.anInt4123 * local19 + local55 + this.anInt4131 * local34 >> 15);
					if (local141 <= this.aClass163_Sub1_6.anInt4221) {
						return;
					}
				} else {
					local141 = this.anInt4129;
					local118 = this.anInt4129;
					local95 = this.anInt4129;
					local72 = this.anInt4129;
				}
				local55 = this.anInt4133 * local46;
				local166 = this.anInt4128 * local46;
				local183 = this.anInt4120 + (this.anInt4122 * local19 + local55 + this.anInt4127 * local29 >> 15);
				local194 = arg2.anInt2702 + local183 * this.aClass163_Sub1_6.anInt4209 / local72;
				local211 = this.anInt4124 + (this.anInt4130 * local19 + local166 + this.anInt4121 * local29 >> 15);
				local222 = arg2.anInt2701 + local211 * this.aClass163_Sub1_6.anInt4207 / local72;
				local239 = this.anInt4120 + (this.anInt4122 * local24 + local55 + this.anInt4127 * local29 >> 15);
				local250 = arg2.anInt2702 + local239 * this.aClass163_Sub1_6.anInt4209 / local95;
				local267 = this.anInt4124 + (this.anInt4130 * local24 + local166 + this.anInt4121 * local29 >> 15);
				local278 = arg2.anInt2701 + local267 * this.aClass163_Sub1_6.anInt4207 / local95;
				local295 = this.anInt4120 + (this.anInt4122 * local24 + local55 + this.anInt4127 * local34 >> 15);
				local306 = arg2.anInt2702 + local295 * this.aClass163_Sub1_6.anInt4209 / local118;
				local323 = this.anInt4124 + (this.anInt4130 * local24 + local166 + this.anInt4121 * local34 >> 15);
				local334 = arg2.anInt2701 + local323 * this.aClass163_Sub1_6.anInt4207 / local118;
				local351 = this.anInt4120 + (this.anInt4122 * local19 + local55 + this.anInt4127 * local34 >> 15);
				local362 = arg2.anInt2702 + local351 * this.aClass163_Sub1_6.anInt4209 / local141;
				local379 = this.anInt4124 + (this.anInt4130 * local19 + local166 + this.anInt4121 * local34 >> 15);
				local390 = arg2.anInt2701 + local379 * this.aClass163_Sub1_6.anInt4207 / local141;
			}
			if ((local306 - local362) * (local278 - local390) - (local334 - local390) * (local250 - local362) > 0) {
				arg2.aBoolean173 = local306 < 0 || local362 < 0 || local250 < 0 || local306 > arg2.anInt2703 || local362 > arg2.anInt2703 || local250 > arg2.anInt2703;
				if (local6.aShort79 >= 0) {
					if (this.method3266(this.aClass163_Sub1_6.anInterface9_12.method1769(local6.aShort79).aByte43)) {
						arg2.anInt2704 = 100;
					}
					arg2.method2222(local334, local390, local278, local306, local362, local250, local6.aShort80 & 0xFFFF, local6.aShort78 & 0xFFFF, local6.aShort81 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort79);
					arg2.anInt2704 = 0;
				} else {
					arg2.method2224(local334, local390, local278, local306, local362, local250, local6.aShort80 & 0xFFFF, local6.aShort78 & 0xFFFF, local6.aShort81 & 0xFFFF);
				}
			}
			if ((local194 - local250) * (local390 - local278) - (local222 - local278) * (local362 - local250) > 0) {
				arg2.aBoolean173 = local194 < 0 || local250 < 0 || local362 < 0 || local194 > arg2.anInt2703 || local250 > arg2.anInt2703 || local362 > arg2.anInt2703;
				if (local6.aShort79 >= 0) {
					if (this.method3266(this.aClass163_Sub1_6.anInterface9_12.method1769(local6.aShort79).aByte43)) {
						arg2.anInt2704 = 100;
					}
					arg2.method2222(local222, local278, local390, local194, local250, local362, local6.aShort77 & 0xFFFF, local6.aShort81 & 0xFFFF, local6.aShort78 & 0xFFFF, local183, local239, local351, local211, local267, local379, local72, local95, local141, local6.aShort79);
					arg2.anInt2704 = 0;
					return;
				}
				arg2.method2224(local222, local278, local390, local194, local250, local362, local6.aShort77 & 0xFFFF, local6.aShort81 & 0xFFFF, local6.aShort78 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(IIIIIII[[ZLclient!hp;[I[I)V")
	private void method3269(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4, @OriginalArg(8) Class107 arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) int[] arg7) {
		@Pc(7) int local7 = (arg3 - arg1) * 1024 / 256;
		arg5.aBoolean172 = false;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = local7;
		for (@Pc(22) int local22 = arg0; local22 < arg2; local22++) {
			for (@Pc(25) int local25 = arg1; local25 < arg3; local25++) {
				if (arg4[local22 - arg0][local25 - arg1]) {
					@Pc(69) int local69;
					if (this.aClass224ArrayArray1[local22][local25] != null) {
						@Pc(50) Class224 local50 = this.aClass224ArrayArray1[local22][local25];
						if (local50.aShort79 != -1 && (local50.aByte77 & 0x2) == 0 && local50.anInt6175 == -1) {
							local69 = this.aClass163_Sub1_6.method3452(local50.aShort79);
							arg5.method2224(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, Static147.method2145(local69, local50.aShort80 & 0xFFFF), Static147.method2145(local69, local50.aShort78 & 0xFFFF), Static147.method2145(local69, local50.aShort81 & 0xFFFF));
							arg5.method2224(local20, local20, local20 - 4, local16, local16 + 4, local16, Static147.method2145(local69, local50.aShort77 & 0xFFFF), Static147.method2145(local69, local50.aShort81 & 0xFFFF), Static147.method2145(local69, local50.aShort78 & 0xFFFF));
						} else if (local50.anInt6175 == -1) {
							arg5.method2224(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local50.aShort80 & 0xFFFF, local50.aShort78 & 0xFFFF, local50.aShort81 & 0xFFFF);
							arg5.method2224(local20, local20, local20 - 4, local16, local16 + 4, local16, local50.aShort77 & 0xFFFF, local50.aShort81 & 0xFFFF, local50.aShort78 & 0xFFFF);
						} else {
							local69 = local50.anInt6175;
							arg5.method2224(local20 - 4, local20 - 4, local20, local16 + 4, local16, local16 + 4, local69, local69, local69);
							arg5.method2224(local20, local20, local20 - 4, local16, local16 + 4, local16, local69, local69, local69);
						}
					} else if (this.aClass223ArrayArray1[local22][local25] != null) {
						@Pc(249) Class223 local249 = this.aClass223ArrayArray1[local22][local25];
						for (local69 = 0; local69 < local249.aShort76; local69++) {
							arg6[local69] = local16 + local249.aShortArray77[local69] * 4 / super.anInt4134;
							arg7[local69] = local20 - local249.aShortArray76[local69] * 4 / super.anInt4134;
						}
						for (@Pc(287) int local287 = 0; local287 < local249.aShort75; local287++) {
							@Pc(293) short local293 = local249.aShortArray74[local287];
							@Pc(298) short local298 = local249.aShortArray79[local287];
							@Pc(303) short local303 = local249.aShortArray78[local287];
							@Pc(307) int local307 = arg6[local293];
							@Pc(311) int local311 = arg6[local298];
							@Pc(315) int local315 = arg6[local303];
							@Pc(319) int local319 = arg7[local293];
							@Pc(323) int local323 = arg7[local298];
							@Pc(327) int local327 = arg7[local303];
							@Pc(341) int local341;
							if (local249.anIntArray531 != null && local249.anIntArray531[local287] != -1) {
								local341 = local249.anIntArray531[local287];
								arg5.method2224(local319, local323, local327, local307, local311, local315, Static147.method2145(local341, local249.aShortArray81[local293]), Static147.method2145(local341, local249.aShortArray81[local298]), Static147.method2145(local341, local249.aShortArray81[local303]));
							} else if (local249.aShortArray80 == null || local249.aShortArray80[local287] == -1) {
								local341 = local249.anIntArray532[local287];
								arg5.method2224(local319, local323, local327, local307, local311, local315, Static147.method2145(local341, local249.aShortArray81[local293]), Static147.method2145(local341, local249.aShortArray81[local298]), Static147.method2145(local341, local249.aShortArray81[local303]));
							} else {
								local341 = this.aClass163_Sub1_6.method3452(local249.aShortArray80[local287]);
								arg5.method2224(local319, local323, local327, local307, local311, local315, Static147.method2145(local341, local249.aShortArray81[local293]), Static147.method2145(local341, local249.aShortArray81[local298]), Static147.method2145(local341, local249.aShortArray81[local303]));
							}
						}
					}
				}
				local20 -= 4;
			}
			local20 = local7;
			local16 += 4;
		}
		arg5.aBoolean172 = true;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	@Override
	public void method3271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class195 local4 = this.aClass163_Sub1_6.method3442(Thread.currentThread());
		local4.aClass107_1.anInt2704 = 0;
		if (this.aClass210ArrayArray1 != null) {
			this.method3265(arg0, arg1, this.aClass163_Sub1_6.aBoolean296, local4.aClass107_1, local4.anIntArray459, local4.anIntArray451, local4.anIntArray454);
		} else if (this.aClass224ArrayArray1 != null) {
			this.method3268(arg0, arg1, local4.aClass107_1, local4.anIntArray459, local4.anIntArray451, local4.anIntArray454);
		}
	}
}
