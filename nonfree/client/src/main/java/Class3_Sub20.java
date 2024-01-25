import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iba")
public final class Class3_Sub20 extends Class3 {

	@OriginalMember(owner = "client!iba", name = "B", descriptor = "I")
	private int anInt4343;

	@OriginalMember(owner = "client!iba", name = "F", descriptor = "Lclient!pn;")
	private final Class3_Sub28 aClass3_Sub28_1;

	@OriginalMember(owner = "client!iba", name = "z", descriptor = "Lclient!wo;")
	private final Class4_Sub3 aClass4_Sub3_2;

	@OriginalMember(owner = "client!iba", name = "K", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_18;

	@OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
	private final int anInt4345;

	@OriginalMember(owner = "client!iba", name = "J", descriptor = "I")
	private final int anInt4348;

	@OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
	private final int anInt4347;

	@OriginalMember(owner = "client!iba", name = "v", descriptor = "I")
	private final int anInt4340;

	@OriginalMember(owner = "client!iba", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!iba", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!iba", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
	private int anInt4346;

	@OriginalMember(owner = "client!iba", name = "s", descriptor = "Lclient!fd;")
	private final Class3_Sub7 aClass3_Sub7_2;

	@OriginalMember(owner = "client!iba", name = "x", descriptor = "Lclient!ph;")
	private final Class3_Sub7_Sub2 aClass3_Sub7_Sub2_2;

	@OriginalMember(owner = "client!iba", name = "N", descriptor = "Lclient!bc;")
	private final Class25 aClass25_18;

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "Lclient!ul;")
	private final Interface21 anInterface21_1;

	@OriginalMember(owner = "client!iba", name = "t", descriptor = "Lclient!sj;")
	private final Interface16 anInterface16_2;

	@OriginalMember(owner = "client!iba", name = "r", descriptor = "Lclient!vv;")
	private final Class346 aClass346_5;

	@OriginalMember(owner = "client!iba", name = "H", descriptor = "Lclient!vv;")
	private Class346 aClass346_6;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Lclient!ji;Lclient!wo;Lclient!pn;[I)V")
	public Class3_Sub20(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) Class4_Sub3 arg1, @OriginalArg(2) Class3_Sub28 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub28_1 = arg2;
		this.aClass4_Sub3_2 = arg1;
		this.aClass15_Sub3_18 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub28_1.method8154() - (arg1.anInt10458 >> 1);
		this.anInt4345 = this.aClass3_Sub28_1.method8156() - local23 >> arg1.anInt10463;
		this.anInt4348 = this.aClass3_Sub28_1.method8156() + local23 >> arg1.anInt10463;
		this.anInt4347 = this.aClass3_Sub28_1.method8158() - local23 >> arg1.anInt10463;
		this.anInt4340 = local23 + this.aClass3_Sub28_1.method8158() >> arg1.anInt10463;
		@Pc(77) int local77 = this.anInt4348 + 1 - this.anInt4345;
		@Pc(85) int local85 = this.anInt4340 + 1 - this.anInt4347;
		this.aFloatArrayArray5 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local77 + 1][local85 + 1];
		this.aFloatArrayArray4 = new float[local77 + 1][local85 + 1];
		@Pc(132) int local132;
		@Pc(139) int local139;
		@Pc(165) int local165;
		@Pc(180) int local180;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			@Pc(121) int local121 = this.anInt4347 + local114;
			if (local121 > 0 && this.aClass4_Sub3_2.anInt10459 - 1 > local121) {
				for (local132 = 0; local132 <= local77; local132++) {
					local139 = this.anInt4345 + local132;
					if (local139 > 0 && local139 < this.aClass4_Sub3_2.anInt10461 - 1) {
						local165 = arg1.JA(local139 + 1, local121) - arg1.JA(local139 - 1, local121);
						local180 = arg1.JA(local139, local121 + 1) - arg1.JA(local139, local121 - 1);
						@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local165 * local165 + local180 * local180 + 65536)));
						this.aFloatArrayArray5[local132][local114] = (float) local165 * local196;
						this.aFloatArrayArray4[local132][local114] = -256.0F * local196;
						this.aFloatArrayArray3[local132][local114] = (float) local180 * local196;
					}
				}
			}
		}
		local132 = 0;
		for (local139 = this.anInt4347; local139 <= this.anInt4340; local139++) {
			if (local139 >= 0 && arg1.anInt10459 > local139) {
				for (local165 = this.anInt4345; local165 <= this.anInt4348; local165++) {
					if (local165 >= 0 && local165 < arg1.anInt10461) {
						local180 = arg3[local132];
						@Pc(277) int[] local277 = arg1.anIntArrayArrayArray16[local165][local139];
						if (local277 != null && local180 != 0) {
							if (local180 == 1) {
								@Pc(296) int local296 = 0;
								while (local296 < local277.length) {
									if (local277[local296++] != -1 && local277[local296++] != -1 && local277[local296++] != -1) {
										this.anInt4346 += 3;
									}
								}
							} else {
								this.anInt4346 += 3;
							}
						}
					}
					local132++;
				}
			} else {
				local132 += this.anInt4348 - this.anInt4345;
			}
		}
		this.aClass346_6 = null;
		this.anInterface21_1 = null;
		this.aClass346_5 = null;
		this.anInterface16_2 = null;
		this.aClass3_Sub7_2 = null;
		this.aClass25_18 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.aClass3_Sub7_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIIBIII)V")
	private void method3688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass4_Sub3_2.anInt10463) + arg6;
		@Pc(23) int local23 = (arg1 << this.aClass4_Sub3_2.anInt10463) + arg2;
		@Pc(29) int local29 = this.aClass4_Sub3_2.sa(local15, local23);
		if ((arg6 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local23 << 16 | (long) local15 & 0xFFFFL;
			@Pc(60) Class3 local60 = this.aClass25_18.method946(local7);
			if (local60 != null) {
				this.method3690(((Class3_Sub39) local60).aShort83, 1);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt4343++;
		if (local7 != -1L) {
			this.aClass25_18.method945(new Class3_Sub39(local78), local7);
		}
		@Pc(112) float local112;
		@Pc(119) float local119;
		@Pc(105) float local105;
		@Pc(186) float local186;
		@Pc(194) float local194;
		@Pc(201) float local201;
		@Pc(208) float local208;
		@Pc(215) float local215;
		@Pc(224) float local224;
		@Pc(233) float local233;
		@Pc(260) float local260;
		if (arg6 == 0 && arg2 == 0) {
			local105 = this.aFloatArrayArray3[arg4][arg5];
			local112 = this.aFloatArrayArray5[arg4][arg5];
			local119 = this.aFloatArrayArray4[arg4][arg5];
		} else if (arg6 == this.aClass4_Sub3_2.anInt10458 && arg2 == 0) {
			local119 = this.aFloatArrayArray4[arg4 + 1][arg5];
			local112 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local105 = this.aFloatArrayArray3[arg4 + 1][arg5];
		} else if (this.aClass4_Sub3_2.anInt10458 == arg6 && this.aClass4_Sub3_2.anInt10458 == arg2) {
			local119 = this.aFloatArrayArray4[arg4 + 1][arg5 + 1];
			local112 = this.aFloatArrayArray5[arg4 + 1][arg5 + 1];
			local105 = this.aFloatArrayArray3[arg4 + 1][arg5 + 1];
		} else if (arg6 == 0 && this.aClass4_Sub3_2.anInt10458 == arg2) {
			local112 = this.aFloatArrayArray5[arg4][arg5 + 1];
			local105 = this.aFloatArrayArray3[arg4][arg5 + 1];
			local119 = this.aFloatArrayArray4[arg4][arg5 + 1];
		} else {
			local186 = (float) arg6 / (float) this.aClass4_Sub3_2.anInt10458;
			local194 = (float) arg2 / (float) this.aClass4_Sub3_2.anInt10458;
			local201 = this.aFloatArrayArray5[arg4][arg5];
			local208 = this.aFloatArrayArray4[arg4][arg5];
			local215 = this.aFloatArrayArray3[arg4][arg5];
			local224 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local233 = this.aFloatArrayArray4[arg4 + 1][arg5];
			@Pc(251) float local251 = local224 + local186 * (this.aFloatArrayArray5[arg4 + 1][arg5 + 1] - local224);
			local260 = this.aFloatArrayArray3[arg4 + 1][arg5];
			@Pc(276) float local276 = local201 + local186 * (this.aFloatArrayArray5[arg4][arg5 + 1] - local201);
			@Pc(292) float local292 = local215 + (this.aFloatArrayArray3[arg4][arg5 + 1] - local215) * local186;
			@Pc(308) float local308 = local208 + local186 * (this.aFloatArrayArray4[arg4][arg5 + 1] - local208);
			@Pc(326) float local326 = local233 + local186 * (this.aFloatArrayArray4[arg4 + 1][arg5 + 1] - local233);
			local112 = local194 * (local251 - local276) + local276;
			@Pc(352) float local352 = local260 + (this.aFloatArrayArray3[arg4 + 1][arg5 + 1] - local260) * local186;
			local119 = local308 + local194 * (local326 - local308);
			local105 = local292 + local194 * (local352 - local292);
		}
		local186 = this.aClass3_Sub28_1.method8156() - local15;
		local194 = this.aClass3_Sub28_1.method8155() - local29;
		local201 = this.aClass3_Sub28_1.method8158() - local23;
		local208 = (float) Math.sqrt((double) (local201 * local201 + local186 * local186 + local194 * local194));
		local215 = 1.0F / local208;
		local194 *= local215;
		local186 *= local215;
		local201 *= local215;
		local224 = local208 / (float) this.aClass3_Sub28_1.method8154();
		local233 = 1.0F - local224 * local224;
		if (local233 < 0.0F) {
			local233 = 0.0F;
		}
		local260 = local186 * local112 + local119 * local194 + local105 * local201;
		if (local260 < 0.0F) {
			local260 = 0.0F;
		}
		if (arg3 >= -115) {
			this.aClass346_6 = null;
		}
		@Pc(543) float local543 = local260 * local233 * 2.0F;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass3_Sub28_1.method8153();
		@Pc(564) int local564 = (int) ((float) (local554 >> 16 & 0xFF) * local543);
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(579) int local579 = (int) (local543 * (float) (local554 >> 8 & 0xFF));
		if (local579 > 255) {
			local579 = 255;
		}
		@Pc(594) int local594 = (int) (local543 * (float) (local554 & 0xFF));
		if (local594 > 255) {
			local594 = 255;
		}
		if (this.aClass15_Sub3_18.aBoolean442) {
			this.aClass3_Sub7_Sub2_2.method6561((float) local15);
			this.aClass3_Sub7_Sub2_2.method6561((float) local29);
			this.aClass3_Sub7_Sub2_2.method6561((float) local23);
		} else {
			this.aClass3_Sub7_Sub2_2.method6560((float) local15);
			this.aClass3_Sub7_Sub2_2.method6560((float) local29);
			this.aClass3_Sub7_Sub2_2.method6560((float) local23);
		}
		this.aClass3_Sub7_Sub2_2.method6494(local564);
		this.aClass3_Sub7_Sub2_2.method6494(local579);
		this.aClass3_Sub7_Sub2_2.method6494(local594);
		this.aClass3_Sub7_Sub2_2.method6494(255);
		this.method3690(local78, 1);
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(SI)V")
	private void method3690(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1) {
		if (this.aClass15_Sub3_18.aBoolean442) {
			this.aClass3_Sub7_2.method6528(arg0);
		} else {
			this.aClass3_Sub7_2.method6498(arg0);
		}
		if (arg1 == 1) {
			this.anInt4346++;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III[[ZI)V")
	public void method3691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface21_1 == null || (this.anInt4345 > arg1 + arg3 || (arg1 - arg3 > this.anInt4348 || (arg3 + arg0 < this.anInt4347 || arg0 - arg3 > this.anInt4340)))) {
			return;
		}
		for (@Pc(56) int local56 = this.anInt4347; local56 <= this.anInt4340; local56++) {
			for (@Pc(61) int local61 = this.anInt4345; local61 <= this.anInt4348; local61++) {
				@Pc(67) int local67 = local61 - arg1;
				@Pc(72) int local72 = local56 - arg0;
				if (-arg3 < local67 && arg3 > local67 && local72 > -arg3 && local72 < arg3 && arg2[local67 + arg3][arg3 + local72]) {
					this.aClass15_Sub3_18.method4410((int) (this.aClass3_Sub28_1.method8159() * 255.0F) << 24);
					this.aClass15_Sub3_18.method4409(this.aClass346_6, null, null, this.aClass346_5);
					this.aClass15_Sub3_18.method4453(this.anInt4346, this.anInterface21_1, 0);
					return;
				}
			}
		}
	}
}
