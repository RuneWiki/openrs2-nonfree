import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class1_Sub40 extends Class1 {

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
	private int anInt6623;

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
	private int anInt6626;

	@OriginalMember(owner = "client!sk", name = "H", descriptor = "Lclient!pp;")
	private final Class70_Sub2 aClass70_Sub2_3;

	@OriginalMember(owner = "client!sk", name = "w", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_32;

	@OriginalMember(owner = "client!sk", name = "y", descriptor = "Lclient!tj;")
	private final Class1_Sub12 aClass1_Sub12_1;

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
	private final int anInt6628;

	@OriginalMember(owner = "client!sk", name = "B", descriptor = "I")
	private final int anInt6624;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
	private final int anInt6621;

	@OriginalMember(owner = "client!sk", name = "C", descriptor = "I")
	private final int anInt6625;

	@OriginalMember(owner = "client!sk", name = "A", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!sk", name = "K", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!sk", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Lclient!ti;")
	private Class1_Sub14 aClass1_Sub14_5;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Lclient!el;")
	private Class1_Sub14_Sub1 aClass1_Sub14_Sub1_2;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Lclient!cv;")
	private Class51 aClass51_27;

	@OriginalMember(owner = "client!sk", name = "D", descriptor = "Lclient!ce;")
	private final Interface2 anInterface2_5;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "Lclient!uv;")
	private final Interface12 anInterface12_6;

	@OriginalMember(owner = "client!sk", name = "L", descriptor = "Lclient!wt;")
	private final Class267 aClass267_16;

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "Lclient!wt;")
	private final Class267 aClass267_15;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!qg;Lclient!pp;Lclient!tj;[I)V")
	public Class1_Sub40(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) Class70_Sub2 arg1, @OriginalArg(2) Class1_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass70_Sub2_3 = arg1;
		this.aClass121_Sub2_32 = arg0;
		this.aClass1_Sub12_1 = arg2;
		@Pc(22) int local22 = this.aClass1_Sub12_1.method3180() - (arg1.anInt5252 >> 1);
		this.anInt6628 = this.aClass1_Sub12_1.method3182() - local22 >> arg1.anInt5253;
		this.anInt6624 = local22 + this.aClass1_Sub12_1.method3182() >> arg1.anInt5253;
		this.anInt6621 = this.aClass1_Sub12_1.method3181() - local22 >> arg1.anInt5253;
		this.anInt6625 = local22 + this.aClass1_Sub12_1.method3181() >> arg1.anInt5253;
		@Pc(76) int local76 = this.anInt6624 + 1 - this.anInt6628;
		@Pc(85) int local85 = this.anInt6625 + 1 - this.anInt6621;
		this.aFloatArrayArray7 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray6 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(139) int local139;
		@Pc(146) int local146;
		@Pc(173) int local173;
		@Pc(188) int local188;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt6621 + local114;
			if (local121 > 0 && this.aClass70_Sub2_3.anInt5250 - 1 > local121) {
				for (local139 = 0; local139 <= local76; local139++) {
					local146 = this.anInt6628 + local139;
					if (local146 > 0 && this.aClass70_Sub2_3.anInt5251 - 1 > local146) {
						local173 = arg1.I(local146 + 1, local121) - arg1.I(local146 - 1, local121);
						local188 = arg1.I(local146, local121 + 1) - arg1.I(local146, local121 - 1);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local173 * local173 + local188 * local188 + 65536)));
						this.aFloatArrayArray7[local139][local114] = local204 * (float) local173;
						this.aFloatArrayArray8[local139][local114] = local204 * -256.0F;
						this.aFloatArrayArray6[local139][local114] = local204 * (float) local188;
					}
				}
			}
		}
		local121 = 0;
		local139 = 0;
		for (local146 = this.anInt6621; local146 <= this.anInt6625; local146++) {
			if (local146 >= 0 && local146 < arg1.anInt5250) {
				for (local173 = this.anInt6628; local173 <= this.anInt6624; local173++) {
					if (local173 >= 0 && arg1.anInt5251 > local173) {
						local188 = arg3[local139];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray96[local173][local146];
						if (local300 != null && local188 != 0) {
							if (local188 == 1) {
								local121 += local300.length;
							} else {
								local121 += 3;
							}
						}
					}
					local139++;
				}
			} else {
				local139 += this.anInt6624 - this.anInt6628;
			}
		}
		if (local121 > 0) {
			this.aClass1_Sub14_5 = new Class1_Sub14(local121 * 2);
			this.aClass1_Sub14_Sub1_2 = new Class1_Sub14_Sub1(local121 * 16);
			this.aClass51_27 = new Class51(Static30.method427(local121));
			local173 = 0;
			local139 = 0;
			for (local188 = this.anInt6621; local188 <= this.anInt6625; local188++) {
				if (local188 >= 0 && arg1.anInt5250 > local188) {
					@Pc(388) int local388 = 0;
					for (@Pc(391) int local391 = this.anInt6628; local391 <= this.anInt6624; local391++) {
						if (local391 >= 0 && local391 < arg1.anInt5251) {
							@Pc(407) int local407 = arg3[local139];
							@Pc(414) int[] local414 = arg1.anIntArrayArrayArray96[local391][local188];
							@Pc(421) int[] local421 = arg1.anIntArrayArrayArray100[local391][local188];
							if (local414 != null && local407 != 0) {
								if (local407 == 1) {
									for (@Pc(576) int local576 = 0; local576 < local414.length; local576++) {
										this.method5177(local414[local576], local173, local188, local391, local388, local421[local576]);
									}
								} else if (local407 == 3) {
									this.method5177(0, local173, local188, local391, local388, 0);
									this.method5177(arg1.anInt5252, local173, local188, local391, local388, 0);
									this.method5177(0, local173, local188, local391, local388, arg1.anInt5252);
								} else if (local407 == 2) {
									this.method5177(arg1.anInt5252, local173, local188, local391, local388, 0);
									this.method5177(arg1.anInt5252, local173, local188, local391, local388, arg1.anInt5252);
									this.method5177(0, local173, local188, local391, local388, 0);
								} else if (local407 == 5) {
									this.method5177(arg1.anInt5252, local173, local188, local391, local388, arg1.anInt5252);
									this.method5177(0, local173, local188, local391, local388, arg1.anInt5252);
									this.method5177(arg1.anInt5252, local173, local188, local391, local388, 0);
								} else if (local407 == 4) {
									this.method5177(0, local173, local188, local391, local388, arg1.anInt5252);
									this.method5177(0, local173, local188, local391, local388, 0);
									this.method5177(arg1.anInt5252, local173, local188, local391, local388, arg1.anInt5252);
								}
							}
						}
						local388++;
						local139++;
					}
				} else {
					local139 += this.anInt6624 - this.anInt6628;
				}
				local173++;
			}
			this.anInterface2_5 = this.aClass121_Sub2_32.method4651(this.aClass1_Sub14_5.anInt5695, false, this.aClass1_Sub14_5.aByteArray65);
			this.anInterface12_6 = this.aClass121_Sub2_32.method4652(this.aClass1_Sub14_Sub1_2.aByteArray65, false, 16, this.aClass1_Sub14_Sub1_2.anInt5695);
			this.aClass267_16 = new Class267(this.anInterface12_6, 5126, 3, 0);
			this.aClass267_15 = new Class267(this.anInterface12_6, 5121, 4, 12);
		} else {
			this.anInterface2_5 = null;
			this.aClass267_15 = null;
			this.aClass267_16 = null;
			this.anInterface12_6 = null;
		}
		this.aClass1_Sub14_Sub1_2 = null;
		this.aClass1_Sub14_5 = null;
		this.aFloatArrayArray7 = this.aFloatArrayArray8 = this.aFloatArrayArray6 = null;
		this.aClass51_27 = null;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[[ZIIB)V")
	public void method5175(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInterface2_5 == null || (this.anInt6628 > arg0 + arg3 || (arg3 - arg0 > this.anInt6624 || (arg0 + arg2 < this.anInt6621 || this.anInt6625 < arg2 - arg0)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt6621; local54 <= this.anInt6625; local54++) {
			for (@Pc(65) int local65 = this.anInt6628; local65 <= this.anInt6624; local65++) {
				@Pc(71) int local71 = local65 - arg3;
				@Pc(76) int local76 = local54 - arg2;
				if (-arg0 < local71 && arg0 > local71 && -arg0 < local76 && local76 < arg0 && arg1[local71 + arg0][arg0 + local76]) {
					this.aClass121_Sub2_32.method4648((int) (this.aClass1_Sub12_1.method3183() * 255.0F) << 24);
					this.aClass121_Sub2_32.method4724(this.aClass267_16, null, null, this.aClass267_15);
					this.aClass121_Sub2_32.method4725(this.anInt6623, this.anInterface2_5, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(SI)V")
	private void method5176(@OriginalArg(0) short arg0) {
		if (this.aClass121_Sub2_32.aBoolean471) {
			this.aClass1_Sub14_5.method4504(arg0);
		} else {
			this.aClass1_Sub14_5.method4493(arg0);
		}
		this.anInt6623++;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
	private void method5177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass70_Sub2_3.anInt5253) + arg0;
		@Pc(24) int local24 = arg5 + (arg2 << this.aClass70_Sub2_3.anInt5253);
		@Pc(30) int local30 = this.aClass70_Sub2_3.va(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg5 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(56) Class1 local56 = this.aClass51_27.method930(local7);
			if (local56 != null) {
				this.method5176(((Class1_Sub31) local56).aShort74);
				return;
			}
		}
		@Pc(74) short local74 = (short) this.anInt6626++;
		if (local7 != -1L) {
			this.aClass51_27.method931(new Class1_Sub31(local74), local7);
		}
		@Pc(121) float local121;
		@Pc(114) float local114;
		@Pc(107) float local107;
		@Pc(230) float local230;
		@Pc(238) float local238;
		@Pc(245) float local245;
		@Pc(252) float local252;
		@Pc(259) float local259;
		@Pc(268) float local268;
		@Pc(277) float local277;
		@Pc(336) float local336;
		if (arg0 == 0 && arg5 == 0) {
			local107 = this.aFloatArrayArray6[arg4][arg1];
			local114 = this.aFloatArrayArray8[arg4][arg1];
			local121 = this.aFloatArrayArray7[arg4][arg1];
		} else if (arg0 == this.aClass70_Sub2_3.anInt5252 && arg5 == 0) {
			local121 = this.aFloatArrayArray7[arg4 + 1][arg1];
			local107 = this.aFloatArrayArray6[arg4 + 1][arg1];
			local114 = this.aFloatArrayArray8[arg4 + 1][arg1];
		} else if (this.aClass70_Sub2_3.anInt5252 == arg0 && this.aClass70_Sub2_3.anInt5252 == arg5) {
			local121 = this.aFloatArrayArray7[arg4 + 1][arg1 + 1];
			local114 = this.aFloatArrayArray8[arg4 + 1][arg1 + 1];
			local107 = this.aFloatArrayArray6[arg4 + 1][arg1 + 1];
		} else if (arg0 == 0 && this.aClass70_Sub2_3.anInt5252 == arg5) {
			local114 = this.aFloatArrayArray8[arg4][arg1 + 1];
			local121 = this.aFloatArrayArray7[arg4][arg1 + 1];
			local107 = this.aFloatArrayArray6[arg4][arg1 + 1];
		} else {
			local230 = (float) arg0 / (float) this.aClass70_Sub2_3.anInt5252;
			local238 = (float) arg5 / (float) this.aClass70_Sub2_3.anInt5252;
			local245 = this.aFloatArrayArray7[arg4][arg1];
			local252 = this.aFloatArrayArray8[arg4][arg1];
			local259 = this.aFloatArrayArray6[arg4][arg1];
			local268 = this.aFloatArrayArray7[arg4 + 1][arg1];
			local277 = this.aFloatArrayArray8[arg4 + 1][arg1];
			@Pc(293) float local293 = local252 + local230 * (this.aFloatArrayArray8[arg4][arg1 + 1] - local252);
			@Pc(311) float local311 = local277 + local230 * (this.aFloatArrayArray8[arg4 + 1][arg1 + 1] - local277);
			@Pc(327) float local327 = local245 + local230 * (this.aFloatArrayArray7[arg4][arg1 + 1] - local245);
			local336 = this.aFloatArrayArray6[arg4 + 1][arg1];
			@Pc(354) float local354 = local268 + (this.aFloatArrayArray7[arg4 + 1][arg1 + 1] - local268) * local230;
			@Pc(370) float local370 = local259 + (this.aFloatArrayArray6[arg4][arg1 + 1] - local259) * local230;
			local114 = local293 + local238 * (local311 - local293);
			@Pc(396) float local396 = local336 + local230 * (this.aFloatArrayArray6[arg4 + 1][arg1 + 1] - local336);
			local121 = local327 + (local354 - local327) * local238;
			local107 = local238 * (local396 - local370) + local370;
		}
		local230 = this.aClass1_Sub12_1.method3182() - local15;
		local238 = this.aClass1_Sub12_1.method3186() - local30;
		local245 = this.aClass1_Sub12_1.method3181() - local24;
		local252 = (float) Math.sqrt((double) (local230 * local230 + local238 * local238 + local245 * local245));
		local259 = 1.0F / local252;
		local238 *= local259;
		local230 *= local259;
		local245 *= local259;
		local268 = local252 / (float) this.aClass1_Sub12_1.method3180();
		local277 = 1.0F - local268 * local268;
		if (local277 < 0.0F) {
			local277 = 0.0F;
		}
		local336 = local245 * local107 + local121 * local230 + local238 * local114;
		if (local336 < 0.0F) {
			local336 = 0.0F;
		}
		@Pc(542) float local542 = local277 * 2.0F * local336;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass1_Sub12_1.method3184();
		@Pc(563) int local563 = (int) (local542 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(580) int local580 = (int) ((float) (local553 >> 8 & 0xFF) * local542);
		if (local580 > 255) {
			local580 = 255;
		}
		@Pc(593) int local593 = (int) (local542 * (float) (local553 & 0xFF));
		if (local593 > 255) {
			local593 = 255;
		}
		if (this.aClass121_Sub2_32.aBoolean471) {
			this.aClass1_Sub14_Sub1_2.method1407((float) local15);
			this.aClass1_Sub14_Sub1_2.method1407((float) local30);
			this.aClass1_Sub14_Sub1_2.method1407((float) local24);
		} else {
			this.aClass1_Sub14_Sub1_2.method1406((float) local15);
			this.aClass1_Sub14_Sub1_2.method1406((float) local30);
			this.aClass1_Sub14_Sub1_2.method1406((float) local24);
		}
		this.aClass1_Sub14_Sub1_2.method4553(local563);
		this.aClass1_Sub14_Sub1_2.method4553(local580);
		this.aClass1_Sub14_Sub1_2.method4553(local593);
		this.aClass1_Sub14_Sub1_2.method4553(255);
		this.method5176(local74);
	}
}
