import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!dia", name = "D", descriptor = "[Lclient!dda;")
	public static final Class66[] aClass66Array1 = new Class66[5];

	@OriginalMember(owner = "client!dia", name = "I", descriptor = "I")
	private int anInt2283;

	@OriginalMember(owner = "client!dia", name = "B", descriptor = "Lclient!vj;")
	private final Class3_Sub16 aClass3_Sub16_2;

	@OriginalMember(owner = "client!dia", name = "u", descriptor = "Lclient!vr;")
	private final Class313_Sub3 aClass313_Sub3_1;

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_7;

	@OriginalMember(owner = "client!dia", name = "y", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!dia", name = "A", descriptor = "I")
	private final int anInt2289;

	@OriginalMember(owner = "client!dia", name = "z", descriptor = "I")
	private final int anInt2284;

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "I")
	private final int anInt2290;

	@OriginalMember(owner = "client!dia", name = "M", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!dia", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!dia", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!dia", name = "F", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "Lclient!rba;")
	private Class3_Sub28 aClass3_Sub28_2;

	@OriginalMember(owner = "client!dia", name = "H", descriptor = "Lclient!je;")
	private Class3_Sub28_Sub1 aClass3_Sub28_Sub1_1;

	@OriginalMember(owner = "client!dia", name = "s", descriptor = "Lclient!gn;")
	private Class136 aClass136_12;

	@OriginalMember(owner = "client!dia", name = "K", descriptor = "Lclient!ika;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "Lclient!rt;")
	private final Interface24 anInterface24_1;

	@OriginalMember(owner = "client!dia", name = "l", descriptor = "Lclient!li;")
	private final Class229 aClass229_1;

	@OriginalMember(owner = "client!dia", name = "G", descriptor = "Lclient!li;")
	private final Class229 aClass229_2;

	static {
		for (@Pc(79) int local79 = 0; local79 < aClass66Array1.length; local79++) {
			aClass66Array1[local79] = new Class66();
		}
	}

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!gia;Lclient!vr;Lclient!vj;[I)V")
	public Class3_Sub18(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) Class313_Sub3 arg1, @OriginalArg(2) Class3_Sub16 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub16_2 = arg2;
		this.aClass313_Sub3_1 = arg1;
		this.aClass67_Sub2_7 = arg0;
		@Pc(23) int local23 = this.aClass3_Sub16_2.method6324() - (arg1.anInt10871 >> 1);
		this.anInt2281 = this.aClass3_Sub16_2.method6323() - local23 >> arg1.anInt10873;
		this.anInt2289 = local23 + this.aClass3_Sub16_2.method6323() >> arg1.anInt10873;
		this.anInt2284 = this.aClass3_Sub16_2.method6320() - local23 >> arg1.anInt10873;
		this.anInt2290 = local23 + this.aClass3_Sub16_2.method6320() >> arg1.anInt10873;
		@Pc(76) int local76 = this.anInt2289 + 1 - this.anInt2281;
		@Pc(85) int local85 = this.anInt2290 + 1 - this.anInt2284;
		this.aFloatArrayArray8 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray7 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray6 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(172) int local172;
		@Pc(188) int local188;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt2284;
			if (local121 > 0 && local121 < this.aClass313_Sub3_1.anInt10872 - 1) {
				for (local137 = 0; local137 <= local76; local137++) {
					local144 = this.anInt2281 + local137;
					if (local144 > 0 && this.aClass313_Sub3_1.anInt10875 - 1 > local144) {
						local172 = arg1.method9095(local121, local144 + 1) - arg1.method9095(local121, local144 - 1);
						local188 = arg1.method9095(local121 + 1, local144) - arg1.method9095(local121 - 1, local144);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local172 * local172 + 65536)));
						this.aFloatArrayArray8[local137][local114] = (float) local172 * local203;
						this.aFloatArrayArray7[local137][local114] = local203 * -256.0F;
						this.aFloatArrayArray6[local137][local114] = (float) local188 * local203;
					}
				}
			}
		}
		local121 = 0;
		@Pc(313) int local313;
		for (local137 = this.anInt2284; local137 <= this.anInt2290; local137++) {
			if (local137 >= 0 && local137 < arg1.anInt10872) {
				for (local144 = this.anInt2281; local144 <= this.anInt2289; local144++) {
					if (local144 >= 0 && arg1.anInt10875 > local144) {
						local172 = arg3[local121];
						@Pc(298) int[] local298 = arg1.anIntArrayArrayArray17[local144][local137];
						if (local298 != null && local172 != 0) {
							if (local172 == 1) {
								local313 = 0;
								while (local298.length > local313) {
									if (local298[local313++] != -1 && local298[local313++] != -1 && local298[local313++] != -1) {
										this.anInt2286 += 3;
									}
								}
							} else {
								this.anInt2286 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt2289 - this.anInt2281;
			}
		}
		if (this.anInt2286 > 0) {
			this.aClass3_Sub28_2 = new Class3_Sub28(this.anInt2286 * 2);
			this.aClass3_Sub28_Sub1_1 = new Class3_Sub28_Sub1(this.anInt2286 * 16);
			this.aClass136_12 = new Class136(Static60.method735(this.anInt2286));
			local121 = 0;
			local144 = 0;
			for (local172 = this.anInt2284; local172 <= this.anInt2290; local172++) {
				if (local172 >= 0 && local172 < arg1.anInt10872) {
					local188 = 0;
					for (local313 = this.anInt2281; local313 <= this.anInt2289; local313++) {
						if (local313 >= 0 && arg1.anInt10875 > local313) {
							@Pc(474) int local474 = arg3[local121];
							@Pc(481) int[] local481 = arg1.anIntArrayArrayArray17[local313][local172];
							if (local481 != null && local474 != 0) {
								if (local474 == 1) {
									@Pc(661) int[] local661 = arg1.anIntArrayArrayArray16[local313][local172];
									@Pc(668) int[] local668 = arg1.anIntArrayArrayArray18[local313][local172];
									@Pc(670) int local670 = 0;
									label107: while (true) {
										while (true) {
											if (local481.length <= local670) {
												break label107;
											}
											if (local481[local670] == -1 || local481[local670 + 1] == -1 || local481[local670 + 2] == -1) {
												local670 += 3;
											} else {
												this.method2032(local668[local670], local188, local144, local313, local172, local661[local670]);
												local670++;
												this.method2032(local668[local670], local188, local144, local313, local172, local661[local670]);
												local670++;
												this.method2032(local668[local670], local188, local144, local313, local172, local661[local670]);
												local670++;
											}
										}
									}
								} else if (local474 == 3) {
									this.method2032(0, local188, local144, local313, local172, 0);
									this.method2032(0, local188, local144, local313, local172, arg1.anInt10871);
									this.method2032(arg1.anInt10871, local188, local144, local313, local172, 0);
								} else if (local474 == 2) {
									this.method2032(0, local188, local144, local313, local172, arg1.anInt10871);
									this.method2032(arg1.anInt10871, local188, local144, local313, local172, arg1.anInt10871);
									this.method2032(0, local188, local144, local313, local172, 0);
								} else if (local474 == 5) {
									this.method2032(arg1.anInt10871, local188, local144, local313, local172, arg1.anInt10871);
									this.method2032(arg1.anInt10871, local188, local144, local313, local172, 0);
									this.method2032(0, local188, local144, local313, local172, arg1.anInt10871);
								} else if (local474 == 4) {
									this.method2032(arg1.anInt10871, local188, local144, local313, local172, 0);
									this.method2032(0, local188, local144, local313, local172, 0);
									this.method2032(arg1.anInt10871, local188, local144, local313, local172, arg1.anInt10871);
								}
							}
						}
						local188++;
						local121++;
					}
				} else {
					local121 += this.anInt2289 - this.anInt2281;
				}
				local144++;
			}
			this.anInterface11_1 = this.aClass67_Sub2_7.method3274(this.aClass3_Sub28_2.aByteArray50, this.aClass3_Sub28_2.anInt6241, false);
			this.anInterface24_1 = this.aClass67_Sub2_7.method3273(this.aClass3_Sub28_Sub1_1.anInt6241, false, this.aClass3_Sub28_Sub1_1.aByteArray50, 16);
			this.aClass229_1 = new Class229(this.anInterface24_1, 5126, 3, 0);
			this.aClass229_2 = new Class229(this.anInterface24_1, 5121, 4, 12);
		} else {
			this.anInterface24_1 = null;
			this.aClass229_1 = null;
			this.anInterface11_1 = null;
			this.aClass229_2 = null;
		}
		this.aFloatArrayArray8 = this.aFloatArrayArray7 = this.aFloatArrayArray6 = null;
		this.aClass3_Sub28_Sub1_1 = null;
		this.aClass3_Sub28_2 = null;
		this.aClass136_12 = null;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIII[[Z)V")
	public void method2031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface11_1 == null || (this.anInt2281 > arg2 + arg0 || (this.anInt2289 < arg0 - arg2 || (this.anInt2284 > arg1 + arg2 || arg1 - arg2 > this.anInt2290)))) {
			return;
		}
		for (@Pc(60) int local60 = this.anInt2284; local60 <= this.anInt2290; local60++) {
			for (@Pc(67) int local67 = this.anInt2281; local67 <= this.anInt2289; local67++) {
				@Pc(73) int local73 = local67 - arg0;
				@Pc(78) int local78 = local60 - arg1;
				if (local73 > -arg2 && local73 < arg2 && -arg2 < local78 && local78 < arg2 && arg3[local73 + arg2][arg2 + local78]) {
					this.aClass67_Sub2_7.method3247((int) (this.aClass3_Sub16_2.method6326() * 255.0F) << 24);
					this.aClass67_Sub2_7.method3283((Class229) null, this.aClass229_2, this.aClass229_1, (Class229) null);
					this.aClass67_Sub2_7.method3232(this.anInterface11_1, 0, this.anInt2286);
					return;
				}
			}
		}
		if (-1646 != -1646) {
			this.anInt2281 = -46;
		}
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(IIIIIII)V")
	private void method2032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg3 << this.aClass313_Sub3_1.anInt10873) + arg5;
		@Pc(24) int local24 = arg0 + (arg4 << this.aClass313_Sub3_1.anInt10873);
		@Pc(31) int local31 = this.aClass313_Sub3_1.method9096(local15, local24);
		if ((arg5 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local15 & 0xFFFFL;
			@Pc(59) Class3 local59 = this.aClass136_12.method3503(local7);
			if (local59 != null) {
				this.method2037(((Class3_Sub40) local59).aShort116);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt2283++;
		if (local7 != -1L) {
			this.aClass136_12.method3508(local7, new Class3_Sub40(local78));
		}
		@Pc(123) float local123;
		@Pc(116) float local116;
		@Pc(109) float local109;
		@Pc(237) float local237;
		@Pc(245) float local245;
		@Pc(252) float local252;
		@Pc(259) float local259;
		@Pc(266) float local266;
		@Pc(275) float local275;
		@Pc(284) float local284;
		@Pc(373) float local373;
		if (arg5 == 0 && arg0 == 0) {
			local109 = this.aFloatArrayArray6[arg1][arg2];
			local116 = this.aFloatArrayArray7[arg1][arg2];
			local123 = this.aFloatArrayArray8[arg1][arg2];
		} else if (arg5 == this.aClass313_Sub3_1.anInt10871 && arg0 == 0) {
			local109 = this.aFloatArrayArray6[arg1 + 1][arg2];
			local116 = this.aFloatArrayArray7[arg1 + 1][arg2];
			local123 = this.aFloatArrayArray8[arg1 + 1][arg2];
		} else if (this.aClass313_Sub3_1.anInt10871 == arg5 && arg0 == this.aClass313_Sub3_1.anInt10871) {
			local116 = this.aFloatArrayArray7[arg1 + 1][arg2 + 1];
			local123 = this.aFloatArrayArray8[arg1 + 1][arg2 + 1];
			local109 = this.aFloatArrayArray6[arg1 + 1][arg2 + 1];
		} else if (arg5 == 0 && arg0 == this.aClass313_Sub3_1.anInt10871) {
			local116 = this.aFloatArrayArray7[arg1][arg2 + 1];
			local109 = this.aFloatArrayArray6[arg1][arg2 + 1];
			local123 = this.aFloatArrayArray8[arg1][arg2 + 1];
		} else {
			local237 = (float) arg5 / (float) this.aClass313_Sub3_1.anInt10871;
			local245 = (float) arg0 / (float) this.aClass313_Sub3_1.anInt10871;
			local252 = this.aFloatArrayArray8[arg1][arg2];
			local259 = this.aFloatArrayArray7[arg1][arg2];
			local266 = this.aFloatArrayArray6[arg1][arg2];
			local275 = this.aFloatArrayArray8[arg1 + 1][arg2];
			local284 = this.aFloatArrayArray7[arg1 + 1][arg2];
			@Pc(301) float local301 = local284 + (this.aFloatArrayArray7[arg1 + 1][arg2 + 1] - local284) * local237;
			@Pc(317) float local317 = local266 + (this.aFloatArrayArray6[arg1][arg2 + 1] - local266) * local237;
			@Pc(332) float local332 = local259 + local237 * (this.aFloatArrayArray7[arg1][arg2 + 1] - local259);
			@Pc(349) float local349 = local275 + local237 * (this.aFloatArrayArray8[arg1 + 1][arg2 + 1] - local275);
			@Pc(364) float local364 = local252 + (this.aFloatArrayArray8[arg1][arg2 + 1] - local252) * local237;
			local373 = this.aFloatArrayArray6[arg1 + 1][arg2];
			@Pc(391) float local391 = local373 + (this.aFloatArrayArray6[arg1 + 1][arg2 + 1] - local373) * local237;
			local116 = local332 + (local301 - local332) * local245;
			local123 = (local349 - local364) * local245 + local364;
			local109 = (local391 - local317) * local245 + local317;
		}
		local237 = (float) (this.aClass3_Sub16_2.method6323() - local15);
		local245 = (float) (this.aClass3_Sub16_2.method6322() - local31);
		local252 = (float) (this.aClass3_Sub16_2.method6320() - local24);
		local259 = (float) Math.sqrt((double) (local252 * local252 + local237 * local237 + local245 * local245));
		local266 = 1.0F / local259;
		local245 *= local266;
		local252 *= local266;
		local237 *= local266;
		local275 = local259 / (float) this.aClass3_Sub16_2.method6324();
		local284 = 1.0F - local275 * local275;
		if (local284 < 0.0F) {
			local284 = 0.0F;
		}
		local373 = local123 * local237 + local116 * local245 + local252 * local109;
		if (local373 < 0.0F) {
			local373 = 0.0F;
		}
		@Pc(555) float local555 = local284 * local373 * 2.0F;
		if (local555 > 1.0F) {
			local555 = 1.0F;
		}
		@Pc(568) int local568 = this.aClass3_Sub16_2.method6325();
		@Pc(578) int local578 = (int) ((float) (local568 >> 16 & 0xFF) * local555);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(595) int local595 = (int) ((float) (local568 >> 8 & 0xFF) * local555);
		if (local595 > 255) {
			local595 = 255;
		}
		@Pc(608) int local608 = (int) ((float) (local568 & 0xFF) * local555);
		if (local608 > 255) {
			local608 = 255;
		}
		if (this.aClass67_Sub2_7.aBoolean322) {
			this.aClass3_Sub28_Sub1_1.method4573((float) local15);
			this.aClass3_Sub28_Sub1_1.method4573((float) local31);
			this.aClass3_Sub28_Sub1_1.method4573((float) local24);
		} else {
			this.aClass3_Sub28_Sub1_1.method4574((float) local15);
			this.aClass3_Sub28_Sub1_1.method4574((float) local31);
			this.aClass3_Sub28_Sub1_1.method4574((float) local24);
		}
		this.aClass3_Sub28_Sub1_1.method5329(local578);
		this.aClass3_Sub28_Sub1_1.method5329(local595);
		this.aClass3_Sub28_Sub1_1.method5329(local608);
		this.aClass3_Sub28_Sub1_1.method5329(255);
		this.method2037(local78);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(SI)V")
	private void method2037(@OriginalArg(0) short arg0) {
		if (this.aClass67_Sub2_7.aBoolean322) {
			this.aClass3_Sub28_2.method5282(arg0);
		} else {
			this.aClass3_Sub28_2.method5280(arg0);
		}
	}
}
