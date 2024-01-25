import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
	private int anInt8033;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_31;

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "Lclient!ok;")
	private final Class245_Sub1 aClass245_Sub1_3;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!cba;")
	private final Class6_Sub10 aClass6_Sub10_3;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
	private final int anInt8035;

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
	private final int anInt8028;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
	private final int anInt8030;

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
	private final int anInt8029;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
	private int anInt8027;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "Lclient!ji;")
	private Class6_Sub8 aClass6_Sub8_10;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Lclient!vda;")
	private Class6_Sub8_Sub2 aClass6_Sub8_Sub2_2;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!wr;")
	private Class380 aClass380_34;

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!dw;")
	private final Interface9 anInterface9_4;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "Lclient!ob;")
	private final Interface19 anInterface19_6;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "Lclient!gk;")
	private final Class121 aClass121_12;

	@OriginalMember(owner = "client!pp", name = "K", descriptor = "Lclient!gk;")
	private final Class121 aClass121_13;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ac;Lclient!ok;Lclient!cba;[I)V")
	public Class6_Sub40(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class245_Sub1 arg1, @OriginalArg(2) Class6_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass5_Sub1_31 = arg0;
		this.aClass245_Sub1_3 = arg1;
		this.aClass6_Sub10_3 = arg2;
		@Pc(22) int local22 = this.aClass6_Sub10_3.method5316() - (arg1.anInt9291 >> 1);
		this.anInt8035 = this.aClass6_Sub10_3.method5312() - local22 >> arg1.anInt9286;
		this.anInt8028 = this.aClass6_Sub10_3.method5312() + local22 >> arg1.anInt9286;
		this.anInt8030 = this.aClass6_Sub10_3.method5320() - local22 >> arg1.anInt9286;
		this.anInt8029 = local22 + this.aClass6_Sub10_3.method5320() >> arg1.anInt9286;
		@Pc(77) int local77 = this.anInt8028 + 1 - this.anInt8035;
		@Pc(86) int local86 = this.anInt8029 + 1 - this.anInt8030;
		this.aFloatArrayArray12 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray14 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(140) int local140;
		@Pc(147) int local147;
		@Pc(177) int local177;
		@Pc(194) int local194;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt8030 + local115;
			if (local122 > 0 && local122 < this.aClass245_Sub1_3.anInt9290 - 1) {
				for (local140 = 0; local140 <= local77; local140++) {
					local147 = local140 + this.anInt8035;
					if (local147 > 0 && this.aClass245_Sub1_3.anInt9289 - 1 > local147) {
						local177 = arg1.method7583(local122, local147 + 1) - arg1.method7583(local122, local147 - 1);
						local194 = arg1.method7583(local122 + 1, local147) - arg1.method7583(local122 - 1, local147);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local194 * local194 + local177 * local177 + 65536)));
						this.aFloatArrayArray12[local140][local115] = (float) local177 * local209;
						this.aFloatArrayArray13[local140][local115] = -256.0F * local209;
						this.aFloatArrayArray14[local140][local115] = (float) local194 * local209;
					}
				}
			}
		}
		local122 = 0;
		@Pc(314) int local314;
		for (local140 = this.anInt8030; local140 <= this.anInt8029; local140++) {
			if (local140 >= 0 && local140 < arg1.anInt9290) {
				for (local147 = this.anInt8035; local147 <= this.anInt8028; local147++) {
					if (local147 >= 0 && arg1.anInt9289 > local147) {
						local177 = arg3[local122];
						@Pc(300) int[] local300 = arg1.anIntArrayArrayArray13[local147][local140];
						if (local300 != null && local177 != 0) {
							if (local177 == 1) {
								local314 = 0;
								while (local300.length > local314) {
									if (local300[local314++] != -1 && local300[local314++] != -1 && local300[local314++] != -1) {
										this.anInt8027 += 3;
									}
								}
							} else {
								this.anInt8027 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt8028 - this.anInt8035;
			}
		}
		if (this.anInt8027 > 0) {
			this.aClass6_Sub8_10 = new Class6_Sub8(this.anInt8027 * 2);
			this.aClass6_Sub8_Sub2_2 = new Class6_Sub8_Sub2(this.anInt8027 * 16);
			this.aClass380_34 = new Class380(Static101.method2622(this.anInt8027));
			local122 = 0;
			local147 = 0;
			for (local177 = this.anInt8030; local177 <= this.anInt8029; local177++) {
				if (local177 >= 0 && arg1.anInt9290 > local177) {
					local194 = 0;
					for (local314 = this.anInt8035; local314 <= this.anInt8028; local314++) {
						if (local314 >= 0 && arg1.anInt9289 > local314) {
							@Pc(455) int local455 = arg3[local122];
							@Pc(462) int[] local462 = arg1.anIntArrayArrayArray13[local314][local177];
							if (local462 != null && local455 != 0) {
								if (local455 == 1) {
									@Pc(476) int[] local476 = arg1.anIntArrayArrayArray8[local314][local177];
									@Pc(483) int[] local483 = arg1.anIntArrayArrayArray10[local314][local177];
									@Pc(485) int local485 = 0;
									label108: while (true) {
										while (true) {
											if (local462.length <= local485) {
												break label108;
											}
											if (local462[local485] == -1 || local462[local485 + 1] == -1 || local462[local485 + 2] == -1) {
												local485 += 3;
											} else {
												this.method6758(local483[local485], local147, local177, local476[local485], local314, local194);
												local485++;
												this.method6758(local483[local485], local147, local177, local476[local485], local314, local194);
												local485++;
												this.method6758(local483[local485], local147, local177, local476[local485], local314, local194);
												local485++;
											}
										}
									}
								} else if (local455 == 3) {
									this.method6758(0, local147, local177, 0, local314, local194);
									this.method6758(0, local147, local177, arg1.anInt9291, local314, local194);
									this.method6758(arg1.anInt9291, local147, local177, 0, local314, local194);
								} else if (local455 == 2) {
									this.method6758(0, local147, local177, arg1.anInt9291, local314, local194);
									this.method6758(arg1.anInt9291, local147, local177, arg1.anInt9291, local314, local194);
									this.method6758(0, local147, local177, 0, local314, local194);
								} else if (local455 == 5) {
									this.method6758(arg1.anInt9291, local147, local177, arg1.anInt9291, local314, local194);
									this.method6758(arg1.anInt9291, local147, local177, 0, local314, local194);
									this.method6758(0, local147, local177, arg1.anInt9291, local314, local194);
								} else if (local455 == 4) {
									this.method6758(arg1.anInt9291, local147, local177, 0, local314, local194);
									this.method6758(0, local147, local177, 0, local314, local194);
									this.method6758(arg1.anInt9291, local147, local177, arg1.anInt9291, local314, local194);
								}
							}
						}
						local122++;
						local194++;
					}
				} else {
					local122 += this.anInt8028 - this.anInt8035;
				}
				local147++;
			}
			this.anInterface9_4 = this.aClass5_Sub1_31.method327(this.aClass6_Sub8_10.aByteArray102, false, this.aClass6_Sub8_10.anInt10061);
			this.anInterface19_6 = this.aClass5_Sub1_31.method367(this.aClass6_Sub8_Sub2_2.anInt10061, false, 16, this.aClass6_Sub8_Sub2_2.aByteArray102);
			this.aClass121_12 = new Class121(this.anInterface19_6, 5126, 3, 0);
			this.aClass121_13 = new Class121(this.anInterface19_6, 5121, 4, 12);
		} else {
			this.aClass121_13 = null;
			this.anInterface9_4 = null;
			this.aClass121_12 = null;
			this.anInterface19_6 = null;
		}
		this.aFloatArrayArray12 = this.aFloatArrayArray13 = this.aFloatArrayArray14 = null;
		this.aClass6_Sub8_Sub2_2 = null;
		this.aClass380_34 = null;
		this.aClass6_Sub8_10 = null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(III[[ZB)V")
	public void method6757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface9_4 == null || (arg2 + arg1 < this.anInt8035 || (arg2 - arg1 > this.anInt8028 || (arg1 + arg0 < this.anInt8030 || this.anInt8029 < arg0 - arg1)))) {
			return;
		}
		for (@Pc(49) int local49 = this.anInt8030; local49 <= this.anInt8029; local49++) {
			for (@Pc(54) int local54 = this.anInt8035; local54 <= this.anInt8028; local54++) {
				@Pc(61) int local61 = local54 - arg2;
				@Pc(66) int local66 = local49 - arg0;
				if (-arg1 < local61 && local61 < arg1 && -arg1 < local66 && local66 < arg1 && arg3[local61 + arg1][arg1 + local66]) {
					this.aClass5_Sub1_31.method371((int) (this.aClass6_Sub10_3.method5314() * 255.0F) << 24);
					this.aClass5_Sub1_31.method357(this.aClass121_13, (Class121) null, (Class121) null, this.aClass121_12);
					this.aClass5_Sub1_31.method354(this.anInt8027, this.anInterface9_4, 0);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIII)V")
	private void method6758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg3 + (arg4 << this.aClass245_Sub1_3.anInt9286);
		@Pc(24) int local24 = (arg2 << this.aClass245_Sub1_3.anInt9286) + arg0;
		@Pc(31) int local31 = this.aClass245_Sub1_3.method7580(local16, local24);
		if ((arg3 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = ((long) local24 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(60) Class6 local60 = this.aClass380_34.method8747(local7);
			if (local60 != null) {
				this.method6760(((Class6_Sub43) local60).aShort97);
				return;
			}
		}
		@Pc(78) short local78 = (short) this.anInt8033++;
		if (local7 != -1L) {
			this.aClass380_34.method8753(new Class6_Sub43(local78), local7);
		}
		@Pc(310) float local310;
		@Pc(301) float local301;
		@Pc(318) float local318;
		@Pc(137) float local137;
		@Pc(145) float local145;
		@Pc(152) float local152;
		@Pc(159) float local159;
		@Pc(166) float local166;
		@Pc(175) float local175;
		@Pc(184) float local184;
		@Pc(193) float local193;
		if (arg3 == 0 && arg0 == 0) {
			local310 = this.aFloatArrayArray12[arg5][arg1];
			local301 = this.aFloatArrayArray13[arg5][arg1];
			local318 = this.aFloatArrayArray14[arg5][arg1];
		} else if (this.aClass245_Sub1_3.anInt9291 == arg3 && arg0 == 0) {
			local301 = this.aFloatArrayArray13[arg5 + 1][arg1];
			local310 = this.aFloatArrayArray12[arg5 + 1][arg1];
			local318 = this.aFloatArrayArray14[arg5 + 1][arg1];
		} else if (arg3 == this.aClass245_Sub1_3.anInt9291 && arg0 == this.aClass245_Sub1_3.anInt9291) {
			local301 = this.aFloatArrayArray13[arg5 + 1][arg1 + 1];
			local310 = this.aFloatArrayArray12[arg5 + 1][arg1 + 1];
			local318 = this.aFloatArrayArray14[arg5 + 1][arg1 + 1];
		} else if (arg3 == 0 && this.aClass245_Sub1_3.anInt9291 == arg0) {
			local301 = this.aFloatArrayArray13[arg5][arg1 + 1];
			local318 = this.aFloatArrayArray14[arg5][arg1 + 1];
			local310 = this.aFloatArrayArray12[arg5][arg1 + 1];
		} else {
			local137 = (float) arg3 / (float) this.aClass245_Sub1_3.anInt9291;
			local145 = (float) arg0 / (float) this.aClass245_Sub1_3.anInt9291;
			local152 = this.aFloatArrayArray12[arg5][arg1];
			local159 = this.aFloatArrayArray13[arg5][arg1];
			local166 = this.aFloatArrayArray14[arg5][arg1];
			local175 = this.aFloatArrayArray12[arg5 + 1][arg1];
			local184 = this.aFloatArrayArray13[arg5 + 1][arg1];
			local193 = this.aFloatArrayArray14[arg5 + 1][arg1];
			@Pc(208) float local208 = local152 + (this.aFloatArrayArray12[arg5][arg1 + 1] - local152) * local137;
			@Pc(226) float local226 = local184 + local137 * (this.aFloatArrayArray13[arg5 + 1][arg1 + 1] - local184);
			@Pc(242) float local242 = local166 + (this.aFloatArrayArray14[arg5][arg1 + 1] - local166) * local137;
			@Pc(260) float local260 = local175 + local137 * (this.aFloatArrayArray12[arg5 + 1][arg1 + 1] - local175);
			@Pc(275) float local275 = local159 + local137 * (this.aFloatArrayArray13[arg5][arg1 + 1] - local159);
			@Pc(292) float local292 = local193 + local137 * (this.aFloatArrayArray14[arg5 + 1][arg1 + 1] - local193);
			local301 = (local226 - local275) * local145 + local275;
			local310 = local208 + (local260 - local208) * local145;
			local318 = local242 + local145 * (local292 - local242);
		}
		local137 = (float) (this.aClass6_Sub10_3.method5312() - local16);
		local145 = (float) (this.aClass6_Sub10_3.method5321() - local31);
		local152 = (float) (this.aClass6_Sub10_3.method5320() - local24);
		local159 = (float) Math.sqrt((double) (local137 * local137 + local145 * local145 + local152 * local152));
		local166 = 1.0F / local159;
		local145 *= local166;
		local152 *= local166;
		local137 *= local166;
		local175 = local159 / (float) this.aClass6_Sub10_3.method5316();
		local184 = 1.0F - local175 * local175;
		if (local184 < 0.0F) {
			local184 = 0.0F;
		}
		local193 = local318 * local152 + local301 * local145 + local310 * local137;
		if (local193 < 0.0F) {
			local193 = 0.0F;
		}
		@Pc(535) float local535 = local184 * 2.0F * local193;
		if (local535 > 1.0F) {
			local535 = 1.0F;
		}
		@Pc(546) int local546 = this.aClass6_Sub10_3.method5319();
		@Pc(556) int local556 = (int) ((float) (local546 >> 16 & 0xFF) * local535);
		if (local556 > 255) {
			local556 = 255;
		}
		@Pc(571) int local571 = (int) (local535 * (float) (local546 >> 8 & 0xFF));
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(586) int local586 = (int) (local535 * (float) (local546 & 0xFF));
		if (local586 > 255) {
			local586 = 255;
		}
		if (this.aClass5_Sub1_31.aBoolean24) {
			this.aClass6_Sub8_Sub2_2.method8270((float) local16);
			this.aClass6_Sub8_Sub2_2.method8270((float) local31);
			this.aClass6_Sub8_Sub2_2.method8270((float) local24);
		} else {
			this.aClass6_Sub8_Sub2_2.method8271((float) local16);
			this.aClass6_Sub8_Sub2_2.method8271((float) local31);
			this.aClass6_Sub8_Sub2_2.method8271((float) local24);
		}
		this.aClass6_Sub8_Sub2_2.method8211(local556);
		this.aClass6_Sub8_Sub2_2.method8211(local571);
		this.aClass6_Sub8_Sub2_2.method8211(local586);
		this.aClass6_Sub8_Sub2_2.method8211(255);
		this.method6760(local78);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IS)V")
	private void method6760(@OriginalArg(1) short arg0) {
		if (this.aClass5_Sub1_31.aBoolean24) {
			this.aClass6_Sub8_10.method8241(arg0);
		} else {
			this.aClass6_Sub8_10.method8264(arg0);
		}
	}
}
