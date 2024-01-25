import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wda")
public final class Class1_Sub51 extends Class1 {

	@OriginalMember(owner = "client!wda", name = "r", descriptor = "I")
	private int anInt9379;

	@OriginalMember(owner = "client!wda", name = "v", descriptor = "Lclient!qea;")
	private final Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!wda", name = "p", descriptor = "Lclient!al;")
	private final Class17_Sub1 aClass17_Sub1_3;

	@OriginalMember(owner = "client!wda", name = "y", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_40;

	@OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
	private final int anInt9380;

	@OriginalMember(owner = "client!wda", name = "z", descriptor = "I")
	private final int anInt9384;

	@OriginalMember(owner = "client!wda", name = "m", descriptor = "I")
	private final int anInt9378;

	@OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
	private final int anInt9382;

	@OriginalMember(owner = "client!wda", name = "n", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!wda", name = "B", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!wda", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!wda", name = "G", descriptor = "I")
	private int anInt9385;

	@OriginalMember(owner = "client!wda", name = "A", descriptor = "Lclient!cw;")
	private final Interface1 anInterface1_7;

	@OriginalMember(owner = "client!wda", name = "F", descriptor = "Lclient!fe;")
	private final Class97 aClass97_16;

	@OriginalMember(owner = "client!wda", name = "x", descriptor = "Lclient!fe;")
	private final Class97 aClass97_15;

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "Lclient!vh;")
	private final Interface23 anInterface23_5;

	@OriginalMember(owner = "client!wda", name = "q", descriptor = "Lclient!io;")
	private Class1_Sub20 aClass1_Sub20_7;

	@OriginalMember(owner = "client!wda", name = "D", descriptor = "Lclient!kv;")
	private Class1_Sub20_Sub2 aClass1_Sub20_Sub2_3;

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!wh;")
	private Class356 aClass356_42;

	@OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lclient!ag;Lclient!al;Lclient!qea;[I)V")
	public Class1_Sub51(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class17_Sub1 arg1, @OriginalArg(2) Class1_Sub5 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass1_Sub5_3 = arg2;
		this.aClass17_Sub1_3 = arg1;
		this.aClass12_Sub1_40 = arg0;
		@Pc(23) int local23 = this.aClass1_Sub5_3.method4162() - (arg1.anInt7986 >> 1);
		this.anInt9380 = this.aClass1_Sub5_3.method4159() - local23 >> arg1.anInt7988;
		this.anInt9384 = this.aClass1_Sub5_3.method4159() + local23 >> arg1.anInt7988;
		this.anInt9378 = this.aClass1_Sub5_3.method4158() - local23 >> arg1.anInt7988;
		this.anInt9382 = this.aClass1_Sub5_3.method4158() + local23 >> arg1.anInt7988;
		@Pc(76) int local76 = this.anInt9384 + 1 - this.anInt9380;
		@Pc(85) int local85 = this.anInt9382 + 1 - this.anInt9378;
		this.aFloatArrayArray13 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray14 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray15 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(139) int local139;
		@Pc(147) int local147;
		@Pc(173) int local173;
		@Pc(190) int local190;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt9378;
			if (local121 > 0 && local121 < this.aClass17_Sub1_3.anInt7984 - 1) {
				for (local139 = 0; local139 <= local76; local139++) {
					local147 = local139 + this.anInt9380;
					if (local147 > 0 && local147 < this.aClass17_Sub1_3.anInt7983 - 1) {
						local173 = arg1.method6642(local147 + 1, local121) - arg1.method6642(local147 - 1, local121);
						local190 = arg1.method6642(local147, local121 + 1) - arg1.method6642(local147, local121 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + local173 * local173 + 65536)));
						this.aFloatArrayArray13[local139][local114] = local205 * (float) local173;
						this.aFloatArrayArray15[local139][local114] = local205 * -256.0F;
						this.aFloatArrayArray14[local139][local114] = local205 * (float) local190;
					}
				}
			}
		}
		local121 = 0;
		@Pc(302) int local302;
		for (local139 = this.anInt9378; local139 <= this.anInt9382; local139++) {
			if (local139 >= 0 && arg1.anInt7984 > local139) {
				for (local147 = this.anInt9380; local147 <= this.anInt9384; local147++) {
					if (local147 >= 0 && local147 < arg1.anInt7983) {
						local173 = arg3[local121];
						@Pc(280) int[] local280 = arg1.anIntArrayArrayArray1[local147][local139];
						if (local280 != null && local173 != 0) {
							if (local173 == 1) {
								local302 = 0;
								while (local302 < local280.length) {
									if (local280[local302++] != -1 && local280[local302++] != -1 && local280[local302++] != -1) {
										this.anInt9385 += 3;
									}
								}
							} else {
								this.anInt9385 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt9384 - this.anInt9380;
			}
		}
		if (this.anInt9385 <= 0) {
			this.anInterface1_7 = null;
			this.aClass97_16 = null;
			this.aClass97_15 = null;
			this.anInterface23_5 = null;
		} else {
			this.aClass1_Sub20_7 = new Class1_Sub20(this.anInt9385 * 2);
			this.aClass1_Sub20_Sub2_3 = new Class1_Sub20_Sub2(this.anInt9385 * 16);
			this.aClass356_42 = new Class356(Static200.method3428(this.anInt9385));
			local121 = 0;
			local147 = 0;
			for (local173 = this.anInt9378; local173 <= this.anInt9382; local173++) {
				if (local173 >= 0 && arg1.anInt7984 > local173) {
					local190 = 0;
					for (local302 = this.anInt9380; local302 <= this.anInt9384; local302++) {
						if (local302 >= 0 && arg1.anInt7983 > local302) {
							@Pc(455) int local455 = arg3[local121];
							@Pc(462) int[] local462 = arg1.anIntArrayArrayArray1[local302][local173];
							if (local462 != null && local455 != 0) {
								if (local455 == 1) {
									@Pc(476) int[] local476 = arg1.anIntArrayArrayArray4[local302][local173];
									@Pc(483) int[] local483 = arg1.anIntArrayArrayArray6[local302][local173];
									@Pc(485) int local485 = 0;
									label107: while (true) {
										while (true) {
											if (local485 >= local462.length) {
												break label107;
											}
											if (local462[local485] == -1 || local462[local485 + 1] == -1 || local462[local485 + 2] == -1) {
												local485 += 3;
											} else {
												this.method7759(local476[local485], local190, local147, local483[local485], local173, local302);
												local485++;
												this.method7759(local476[local485], local190, local147, local483[local485], local173, local302);
												local485++;
												this.method7759(local476[local485], local190, local147, local483[local485], local173, local302);
												local485++;
											}
										}
									}
								} else if (local455 == 3) {
									this.method7759(0, local190, local147, 0, local173, local302);
									this.method7759(arg1.anInt7986, local190, local147, 0, local173, local302);
									this.method7759(0, local190, local147, arg1.anInt7986, local173, local302);
								} else if (local455 == 2) {
									this.method7759(arg1.anInt7986, local190, local147, 0, local173, local302);
									this.method7759(arg1.anInt7986, local190, local147, arg1.anInt7986, local173, local302);
									this.method7759(0, local190, local147, 0, local173, local302);
								} else if (local455 == 5) {
									this.method7759(arg1.anInt7986, local190, local147, arg1.anInt7986, local173, local302);
									this.method7759(0, local190, local147, arg1.anInt7986, local173, local302);
									this.method7759(arg1.anInt7986, local190, local147, 0, local173, local302);
								} else if (local455 == 4) {
									this.method7759(0, local190, local147, arg1.anInt7986, local173, local302);
									this.method7759(0, local190, local147, 0, local173, local302);
									this.method7759(arg1.anInt7986, local190, local147, arg1.anInt7986, local173, local302);
								}
							}
						}
						local190++;
						local121++;
					}
				} else {
					local121 += this.anInt9384 - this.anInt9380;
				}
				local147++;
			}
			this.anInterface23_5 = this.aClass12_Sub1_40.method405(false, this.aClass1_Sub20_7.anInt5238, this.aClass1_Sub20_7.aByteArray52);
			this.anInterface1_7 = this.aClass12_Sub1_40.method409(this.aClass1_Sub20_Sub2_3.aByteArray52, this.aClass1_Sub20_Sub2_3.anInt5238, false, 16);
			this.aClass97_15 = new Class97(this.anInterface1_7, 5126, 3, 0);
			this.aClass97_16 = new Class97(this.anInterface1_7, 5121, 4, 12);
		}
		this.aClass1_Sub20_7 = null;
		this.aClass356_42 = null;
		this.aClass1_Sub20_Sub2_3 = null;
		this.aFloatArrayArray13 = this.aFloatArrayArray15 = this.aFloatArrayArray14 = null;
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(SI)V")
	private void method7755(@OriginalArg(0) short arg0) {
		if (this.aClass12_Sub1_40.aBoolean23) {
			this.aClass1_Sub20_7.method4381(arg0);
		} else {
			this.aClass1_Sub20_7.method4376(arg0);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(BII[[ZI)V")
	public void method7757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface23_5 == null || (this.anInt9380 > arg0 + arg1 || (arg0 - arg1 > this.anInt9384 || (this.anInt9378 > arg3 + arg1 || this.anInt9382 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(58) int local58 = this.anInt9378; local58 <= this.anInt9382; local58++) {
			for (@Pc(63) int local63 = this.anInt9380; local63 <= this.anInt9384; local63++) {
				@Pc(70) int local70 = local63 - arg0;
				@Pc(74) int local74 = local58 - arg3;
				if (-arg1 < local70 && local70 < arg1 && local74 > -arg1 && local74 < arg1 && arg2[arg1 + local70][arg1 + local74]) {
					this.aClass12_Sub1_40.method375((int) (this.aClass1_Sub5_3.method4160() * 255.0F) << 24);
					this.aClass12_Sub1_40.method428(this.aClass97_15, null, this.aClass97_16, null);
					this.aClass12_Sub1_40.method425(0, this.anInterface23_5, this.anInt9385);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIII)V")
	private void method7759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg0 + (arg5 << this.aClass17_Sub1_3.anInt7988);
		@Pc(24) int local24 = arg3 + (arg4 << this.aClass17_Sub1_3.anInt7988);
		@Pc(31) int local31 = this.aClass17_Sub1_3.method6637(local15, local24);
		if ((arg0 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | ((long) local24 & 0xFFFFL) << 16;
			@Pc(60) Class1 local60 = this.aClass356_42.method7796(local7);
			if (local60 != null) {
				this.method7755(((Class1_Sub4) local60).aShort7);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt9379++;
		if (local7 != -1L) {
			this.aClass356_42.method7800(local7, new Class1_Sub4(local78));
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(102) float local102;
		@Pc(224) float local224;
		@Pc(232) float local232;
		@Pc(239) float local239;
		@Pc(246) float local246;
		@Pc(253) float local253;
		@Pc(262) float local262;
		@Pc(271) float local271;
		@Pc(280) float local280;
		if (arg0 == 0 && arg3 == 0) {
			local102 = this.aFloatArrayArray14[arg1][arg2];
			local109 = this.aFloatArrayArray13[arg1][arg2];
			local116 = this.aFloatArrayArray15[arg1][arg2];
		} else if (arg0 == this.aClass17_Sub1_3.anInt7986 && arg3 == 0) {
			local116 = this.aFloatArrayArray15[arg1 + 1][arg2];
			local102 = this.aFloatArrayArray14[arg1 + 1][arg2];
			local109 = this.aFloatArrayArray13[arg1 + 1][arg2];
		} else if (this.aClass17_Sub1_3.anInt7986 == arg0 && arg3 == this.aClass17_Sub1_3.anInt7986) {
			local102 = this.aFloatArrayArray14[arg1 + 1][arg2 + 1];
			local109 = this.aFloatArrayArray13[arg1 + 1][arg2 + 1];
			local116 = this.aFloatArrayArray15[arg1 + 1][arg2 + 1];
		} else if (arg0 == 0 && arg3 == this.aClass17_Sub1_3.anInt7986) {
			local116 = this.aFloatArrayArray15[arg1][arg2 + 1];
			local102 = this.aFloatArrayArray14[arg1][arg2 + 1];
			local109 = this.aFloatArrayArray13[arg1][arg2 + 1];
		} else {
			local224 = (float) arg0 / (float) this.aClass17_Sub1_3.anInt7986;
			local232 = (float) arg3 / (float) this.aClass17_Sub1_3.anInt7986;
			local239 = this.aFloatArrayArray13[arg1][arg2];
			local246 = this.aFloatArrayArray15[arg1][arg2];
			local253 = this.aFloatArrayArray14[arg1][arg2];
			local262 = this.aFloatArrayArray13[arg1 + 1][arg2];
			local271 = this.aFloatArrayArray15[arg1 + 1][arg2];
			local280 = this.aFloatArrayArray14[arg1 + 1][arg2];
			@Pc(295) float local295 = local239 + (this.aFloatArrayArray13[arg1][arg2 + 1] - local239) * local224;
			@Pc(311) float local311 = local253 + local224 * (this.aFloatArrayArray14[arg1][arg2 + 1] - local253);
			@Pc(329) float local329 = local262 + local224 * (this.aFloatArrayArray13[arg1 + 1][arg2 + 1] - local262);
			@Pc(346) float local346 = local271 + local224 * (this.aFloatArrayArray15[arg1 + 1][arg2 + 1] - local271);
			@Pc(362) float local362 = local246 + local224 * (this.aFloatArrayArray15[arg1][arg2 + 1] - local246);
			@Pc(379) float local379 = local280 + (this.aFloatArrayArray14[arg1 + 1][arg2 + 1] - local280) * local224;
			local109 = (local329 - local295) * local232 + local295;
			local116 = local362 + (local346 - local362) * local232;
			local102 = (local379 - local311) * local232 + local311;
		}
		local224 = this.aClass1_Sub5_3.method4159() - local15;
		local232 = this.aClass1_Sub5_3.method4163() - local31;
		local239 = this.aClass1_Sub5_3.method4158() - local24;
		local246 = (float) Math.sqrt((double) (local239 * local239 + local232 * local232 + local224 * local224));
		local253 = 1.0F / local246;
		local232 *= local253;
		local239 *= local253;
		local224 *= local253;
		local262 = local246 / (float) this.aClass1_Sub5_3.method4162();
		local271 = 1.0F - local262 * local262;
		if (local271 < 0.0F) {
			local271 = 0.0F;
		}
		local280 = local109 * local224 + local232 * local116 + local239 * local102;
		if (local280 < 0.0F) {
			local280 = 0.0F;
		}
		@Pc(542) float local542 = local271 * 2.0F * local280;
		if (local542 > 1.0F) {
			local542 = 1.0F;
		}
		@Pc(553) int local553 = this.aClass1_Sub5_3.method4165();
		@Pc(563) int local563 = (int) (local542 * (float) (local553 >> 16 & 0xFF));
		if (local563 > 255) {
			local563 = 255;
		}
		@Pc(578) int local578 = (int) ((float) (local553 >> 8 & 0xFF) * local542);
		if (local578 > 255) {
			local578 = 255;
		}
		@Pc(591) int local591 = (int) (local542 * (float) (local553 & 0xFF));
		if (this.aClass12_Sub1_40.aBoolean23) {
			this.aClass1_Sub20_Sub2_3.method4440((float) local15);
			this.aClass1_Sub20_Sub2_3.method4440((float) local31);
			this.aClass1_Sub20_Sub2_3.method4440((float) local24);
		} else {
			this.aClass1_Sub20_Sub2_3.method4438((float) local15);
			this.aClass1_Sub20_Sub2_3.method4438((float) local31);
			this.aClass1_Sub20_Sub2_3.method4438((float) local24);
		}
		if (local591 > 255) {
			local591 = 255;
		}
		this.aClass1_Sub20_Sub2_3.method4378(local563);
		this.aClass1_Sub20_Sub2_3.method4378(local578);
		this.aClass1_Sub20_Sub2_3.method4378(local591);
		this.aClass1_Sub20_Sub2_3.method4378(255);
		this.method7755(local78);
	}
}
