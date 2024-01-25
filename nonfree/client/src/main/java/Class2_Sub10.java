import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!eu", name = "L", descriptor = "I")
	private int anInt2609;

	@OriginalMember(owner = "client!eu", name = "q", descriptor = "Lclient!kb;")
	private final Class2_Sub24 aClass2_Sub24_1;

	@OriginalMember(owner = "client!eu", name = "F", descriptor = "Lclient!dn;")
	private final Class76_Sub1 aClass76_Sub1_2;

	@OriginalMember(owner = "client!eu", name = "p", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_14;

	@OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
	private final int anInt2601;

	@OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
	private final int anInt2603;

	@OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
	private final int anInt2604;

	@OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
	private final int anInt2606;

	@OriginalMember(owner = "client!eu", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!eu", name = "u", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
	private int anInt2607;

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "Lclient!eca;")
	private final Class82 aClass82_7;

	@OriginalMember(owner = "client!eu", name = "G", descriptor = "Lclient!vi;")
	private final Interface26 anInterface26_2;

	@OriginalMember(owner = "client!eu", name = "B", descriptor = "Lclient!eca;")
	private final Class82 aClass82_8;

	@OriginalMember(owner = "client!eu", name = "t", descriptor = "Lclient!hu;")
	private final Interface12 anInterface12_5;

	@OriginalMember(owner = "client!eu", name = "y", descriptor = "Lclient!vj;")
	private Class2_Sub22 aClass2_Sub22_4;

	@OriginalMember(owner = "client!eu", name = "z", descriptor = "Lclient!jga;")
	private Class2_Sub22_Sub1 aClass2_Sub22_Sub1_2;

	@OriginalMember(owner = "client!eu", name = "x", descriptor = "Lclient!gca;")
	private Class118 aClass118_15;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lclient!ep;Lclient!dn;Lclient!kb;[I)V")
	public Class2_Sub10(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class76_Sub1 arg1, @OriginalArg(2) Class2_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub24_1 = arg2;
		this.aClass76_Sub1_2 = arg1;
		this.aClass95_Sub1_14 = arg0;
		@Pc(22) int local22 = this.aClass2_Sub24_1.method6302() - (arg1.anInt8792 >> 1);
		this.anInt2601 = this.aClass2_Sub24_1.method6299() - local22 >> arg1.anInt8795;
		this.anInt2603 = local22 + this.aClass2_Sub24_1.method6299() >> arg1.anInt8795;
		this.anInt2604 = this.aClass2_Sub24_1.method6301() - local22 >> arg1.anInt8795;
		this.anInt2606 = local22 + this.aClass2_Sub24_1.method6301() >> arg1.anInt8795;
		@Pc(77) int local77 = this.anInt2603 + 1 - this.anInt2601;
		@Pc(85) int local85 = this.anInt2606 + 1 - this.anInt2604;
		this.aFloatArrayArray6 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray5 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(144) int local144;
		@Pc(173) int local173;
		@Pc(189) int local189;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt2604 + local114;
			if (local121 > 0 && local121 < this.aClass76_Sub1_2.anInt8794 - 1) {
				for (local136 = 0; local136 <= local77; local136++) {
					local144 = local136 + this.anInt2601;
					if (local144 > 0 && this.aClass76_Sub1_2.anInt8791 - 1 > local144) {
						local173 = arg1.method7396(local121, local144 + 1) - arg1.method7396(local121, local144 - 1);
						local189 = arg1.method7396(local121 + 1, local144) - arg1.method7396(local121 - 1, local144);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local189 * local189 + local173 * local173 + 65536)));
						this.aFloatArrayArray4[local136][local114] = local204 * (float) local173;
						this.aFloatArrayArray6[local136][local114] = local204 * -256.0F;
						this.aFloatArrayArray5[local136][local114] = local204 * (float) local189;
					}
				}
			}
		}
		local121 = 0;
		@Pc(298) int local298;
		for (local136 = this.anInt2604; local136 <= this.anInt2606; local136++) {
			if (local136 >= 0 && arg1.anInt8794 > local136) {
				for (local144 = this.anInt2601; local144 <= this.anInt2603; local144++) {
					if (local144 >= 0 && local144 < arg1.anInt8791) {
						local173 = arg3[local121];
						@Pc(287) int[] local287 = arg1.anIntArrayArrayArray5[local144][local136];
						if (local287 != null && local173 != 0) {
							if (local173 == 1) {
								local298 = 0;
								while (local298 < local287.length) {
									if (local287[local298++] != -1 && local287[local298++] != -1 && local287[local298++] != -1) {
										this.anInt2607 += 3;
									}
								}
							} else {
								this.anInt2607 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt2603 - this.anInt2601;
			}
		}
		if (this.anInt2607 <= 0) {
			this.aClass82_7 = null;
			this.anInterface26_2 = null;
			this.aClass82_8 = null;
			this.anInterface12_5 = null;
		} else {
			this.aClass2_Sub22_4 = new Class2_Sub22(this.anInt2607 * 2);
			this.aClass2_Sub22_Sub1_2 = new Class2_Sub22_Sub1(this.anInt2607 * 16);
			this.aClass118_15 = new Class118(Static350.method4699(this.anInt2607));
			local121 = 0;
			local144 = 0;
			for (local173 = this.anInt2604; local173 <= this.anInt2606; local173++) {
				if (local173 >= 0 && local173 < arg1.anInt8794) {
					local189 = 0;
					for (local298 = this.anInt2601; local298 <= this.anInt2603; local298++) {
						if (local298 >= 0 && local298 < arg1.anInt8791) {
							@Pc(459) int local459 = arg3[local121];
							@Pc(466) int[] local466 = arg1.anIntArrayArrayArray5[local298][local173];
							if (local466 != null && local459 != 0) {
								if (local459 == 1) {
									@Pc(622) int[] local622 = arg1.anIntArrayArrayArray6[local298][local173];
									@Pc(629) int[] local629 = arg1.anIntArrayArrayArray7[local298][local173];
									@Pc(631) int local631 = 0;
									label106: while (true) {
										while (true) {
											if (local631 >= local466.length) {
												break label106;
											}
											if (local466[local631] == -1 || local466[local631 + 1] == -1 || local466[local631 + 2] == -1) {
												local631 += 3;
											} else {
												this.method2156(local629[local631], local173, local144, local189, local298, local622[local631]);
												local631++;
												this.method2156(local629[local631], local173, local144, local189, local298, local622[local631]);
												local631++;
												this.method2156(local629[local631], local173, local144, local189, local298, local622[local631]);
												local631++;
											}
										}
									}
								} else if (local459 == 3) {
									this.method2156(0, local173, local144, local189, local298, 0);
									this.method2156(0, local173, local144, local189, local298, arg1.anInt8792);
									this.method2156(arg1.anInt8792, local173, local144, local189, local298, 0);
								} else if (local459 == 2) {
									this.method2156(0, local173, local144, local189, local298, arg1.anInt8792);
									this.method2156(arg1.anInt8792, local173, local144, local189, local298, arg1.anInt8792);
									this.method2156(0, local173, local144, local189, local298, 0);
								} else if (local459 == 5) {
									this.method2156(arg1.anInt8792, local173, local144, local189, local298, arg1.anInt8792);
									this.method2156(arg1.anInt8792, local173, local144, local189, local298, 0);
									this.method2156(0, local173, local144, local189, local298, arg1.anInt8792);
								} else if (local459 == 4) {
									this.method2156(arg1.anInt8792, local173, local144, local189, local298, 0);
									this.method2156(0, local173, local144, local189, local298, 0);
									this.method2156(arg1.anInt8792, local173, local144, local189, local298, arg1.anInt8792);
								}
							}
						}
						local189++;
						local121++;
					}
				} else {
					local121 += this.anInt2603 - this.anInt2601;
				}
				local144++;
			}
			this.anInterface26_2 = this.aClass95_Sub1_14.method2107(this.aClass2_Sub22_4.anInt10247, this.aClass2_Sub22_4.aByteArray115, false);
			this.anInterface12_5 = this.aClass95_Sub1_14.method2071(this.aClass2_Sub22_Sub1_2.anInt10247, false, this.aClass2_Sub22_Sub1_2.aByteArray115, 16);
			this.aClass82_7 = new Class82(this.anInterface12_5, 5126, 3, 0);
			this.aClass82_8 = new Class82(this.anInterface12_5, 5121, 4, 12);
		}
		this.aClass2_Sub22_Sub1_2 = null;
		this.aClass118_15 = null;
		this.aFloatArrayArray4 = this.aFloatArrayArray6 = this.aFloatArrayArray5 = null;
		this.aClass2_Sub22_4 = null;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)V")
	private void method2156(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg4 << this.aClass76_Sub1_2.anInt8795);
		@Pc(23) int local23 = (arg1 << this.aClass76_Sub1_2.anInt8795) + arg0;
		@Pc(30) int local30 = this.aClass76_Sub1_2.method7398(local15, local23);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = ((long) local23 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class2 local59 = this.aClass118_15.method2595(local7);
			if (local59 != null) {
				this.method2157(((Class2_Sub16) local59).aShort33);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt2609++;
		if (local7 != -1L) {
			this.aClass118_15.method2601(new Class2_Sub16(local77), local7);
		}
		@Pc(163) float local163;
		@Pc(154) float local154;
		@Pc(145) float local145;
		@Pc(173) float local173;
		@Pc(181) float local181;
		@Pc(188) float local188;
		@Pc(195) float local195;
		@Pc(202) float local202;
		@Pc(211) float local211;
		@Pc(220) float local220;
		@Pc(292) float local292;
		if (arg5 == 0 && arg0 == 0) {
			local163 = this.aFloatArrayArray4[arg3][arg2];
			local145 = this.aFloatArrayArray5[arg3][arg2];
			local154 = this.aFloatArrayArray6[arg3][arg2];
		} else if (arg5 == this.aClass76_Sub1_2.anInt8792 && arg0 == 0) {
			local145 = this.aFloatArrayArray5[arg3 + 1][arg2];
			local154 = this.aFloatArrayArray6[arg3 + 1][arg2];
			local163 = this.aFloatArrayArray4[arg3 + 1][arg2];
		} else if (arg5 == this.aClass76_Sub1_2.anInt8792 && this.aClass76_Sub1_2.anInt8792 == arg0) {
			local163 = this.aFloatArrayArray4[arg3 + 1][arg2 + 1];
			local154 = this.aFloatArrayArray6[arg3 + 1][arg2 + 1];
			local145 = this.aFloatArrayArray5[arg3 + 1][arg2 + 1];
		} else if (arg5 == 0 && this.aClass76_Sub1_2.anInt8792 == arg0) {
			local145 = this.aFloatArrayArray5[arg3][arg2 + 1];
			local154 = this.aFloatArrayArray6[arg3][arg2 + 1];
			local163 = this.aFloatArrayArray4[arg3][arg2 + 1];
		} else {
			local173 = (float) arg5 / (float) this.aClass76_Sub1_2.anInt8792;
			local181 = (float) arg0 / (float) this.aClass76_Sub1_2.anInt8792;
			local188 = this.aFloatArrayArray4[arg3][arg2];
			local195 = this.aFloatArrayArray6[arg3][arg2];
			local202 = this.aFloatArrayArray5[arg3][arg2];
			local211 = this.aFloatArrayArray4[arg3 + 1][arg2];
			local220 = this.aFloatArrayArray6[arg3 + 1][arg2];
			@Pc(236) float local236 = local202 + (this.aFloatArrayArray5[arg3][arg2 + 1] - local202) * local173;
			@Pc(251) float local251 = local188 + (this.aFloatArrayArray4[arg3][arg2 + 1] - local188) * local173;
			@Pc(266) float local266 = local195 + local173 * (this.aFloatArrayArray6[arg3][arg2 + 1] - local195);
			@Pc(283) float local283 = local220 + (this.aFloatArrayArray6[arg3 + 1][arg2 + 1] - local220) * local173;
			local292 = this.aFloatArrayArray5[arg3 + 1][arg2];
			@Pc(309) float local309 = local211 + local173 * (this.aFloatArrayArray4[arg3 + 1][arg2 + 1] - local211);
			@Pc(326) float local326 = local292 + local173 * (this.aFloatArrayArray5[arg3 + 1][arg2 + 1] - local292);
			local163 = (local309 - local251) * local181 + local251;
			local154 = (local283 - local266) * local181 + local266;
			local145 = local236 + local181 * (local326 - local236);
		}
		local173 = this.aClass2_Sub24_1.method6299() - local15;
		local181 = this.aClass2_Sub24_1.method6308() - local30;
		local188 = this.aClass2_Sub24_1.method6301() - local23;
		local195 = (float) Math.sqrt((double) (local188 * local188 + local173 * local173 + local181 * local181));
		local202 = 1.0F / local195;
		local181 *= local202;
		local173 *= local202;
		local188 *= local202;
		local211 = local195 / (float) this.aClass2_Sub24_1.method6302();
		local220 = 1.0F - local211 * local211;
		if (local220 < 0.0F) {
			local220 = 0.0F;
		}
		local292 = local188 * local145 + local181 * local154 + local163 * local173;
		if (local292 < 0.0F) {
			local292 = 0.0F;
		}
		@Pc(542) float local542 = local292 * 2.0F * local220;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(558) int local558 = this.aClass2_Sub24_1.method6305();
		@Pc(568) int local568 = (int) (local542 * (float) (local558 >> 16 & 0xFF));
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(583) int local583 = (int) ((float) (local558 >> 8 & 0xFF) * local542);
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(596) int local596 = (int) (local542 * (float) (local558 & 0xFF));
		if (this.aClass95_Sub1_14.aBoolean174) {
			this.aClass2_Sub22_Sub1_2.method3702((float) local15);
			this.aClass2_Sub22_Sub1_2.method3702((float) local30);
			this.aClass2_Sub22_Sub1_2.method3702((float) local23);
		} else {
			this.aClass2_Sub22_Sub1_2.method3701((float) local15);
			this.aClass2_Sub22_Sub1_2.method3701((float) local30);
			this.aClass2_Sub22_Sub1_2.method3701((float) local23);
		}
		if (local596 > 255) {
			local596 = 255;
		}
		this.aClass2_Sub22_Sub1_2.method8537(local568);
		this.aClass2_Sub22_Sub1_2.method8537(local583);
		this.aClass2_Sub22_Sub1_2.method8537(local596);
		this.aClass2_Sub22_Sub1_2.method8537(255);
		this.method2157(local77);
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(SI)V")
	private void method2157(@OriginalArg(0) short arg0) {
		if (this.aClass95_Sub1_14.aBoolean174) {
			this.aClass2_Sub22_4.method8500(arg0);
		} else {
			this.aClass2_Sub22_4.method8492(arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([[ZIIII)V")
	public void method2160(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface26_2 == null || (arg2 + arg1 < this.anInt2601 || (this.anInt2603 < arg1 - arg2 || (arg2 + arg3 < this.anInt2604 || arg3 - arg2 > this.anInt2606)))) {
			return;
		}
		for (@Pc(46) int local46 = this.anInt2604; local46 <= this.anInt2606; local46++) {
			for (@Pc(51) int local51 = this.anInt2601; local51 <= this.anInt2603; local51++) {
				@Pc(58) int local58 = local51 - arg1;
				@Pc(63) int local63 = local46 - arg3;
				if (local58 > -arg2 && local58 < arg2 && local63 > -arg2 && local63 < arg2 && arg0[local58 + arg2][local63 + arg2]) {
					this.aClass95_Sub1_14.method2109((int) (this.aClass2_Sub24_1.method6307() * 255.0F) << 24);
					this.aClass95_Sub1_14.method2086(this.aClass82_8, this.aClass82_7, null, null);
					this.aClass95_Sub1_14.method2118(this.anInt2607, 0, this.anInterface26_2);
					return;
				}
			}
		}
	}
}
