import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
	private int anInt3727;

	@OriginalMember(owner = "client!gg", name = "z", descriptor = "Lclient!mh;")
	private final Class199_Sub2 aClass199_Sub2_2;

	@OriginalMember(owner = "client!gg", name = "s", descriptor = "Lclient!raa;")
	private final Class6_Sub1 aClass6_Sub1_2;

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_22;

	@OriginalMember(owner = "client!gg", name = "y", descriptor = "I")
	private final int anInt3731;

	@OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
	private final int anInt3729;

	@OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
	private final int anInt3726;

	@OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
	private final int anInt3728;

	@OriginalMember(owner = "client!gg", name = "J", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!gg", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!gg", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
	private int anInt3736;

	@OriginalMember(owner = "client!gg", name = "F", descriptor = "Lclient!cl;")
	private final Class55 aClass55_7;

	@OriginalMember(owner = "client!gg", name = "x", descriptor = "Lclient!wia;")
	private final Interface27 anInterface27_3;

	@OriginalMember(owner = "client!gg", name = "u", descriptor = "Lclient!cl;")
	private final Class55 aClass55_6;

	@OriginalMember(owner = "client!gg", name = "E", descriptor = "Lclient!gh;")
	private final Interface10 anInterface10_2;

	@OriginalMember(owner = "client!gg", name = "t", descriptor = "Lclient!rg;")
	private Class6_Sub40 aClass6_Sub40_2;

	@OriginalMember(owner = "client!gg", name = "n", descriptor = "Lclient!sea;")
	private Class6_Sub40_Sub1 aClass6_Sub40_Sub1_1;

	@OriginalMember(owner = "client!gg", name = "B", descriptor = "Lclient!he;")
	private Class128 aClass128_11;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!wh;Lclient!mh;Lclient!raa;[I)V")
	public Class6_Sub21(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) Class199_Sub2 arg1, @OriginalArg(2) Class6_Sub1 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass199_Sub2_2 = arg1;
		this.aClass6_Sub1_2 = arg2;
		this.aClass100_Sub3_22 = arg0;
		@Pc(22) int local22 = this.aClass6_Sub1_2.method8268() - (arg1.anInt10112 >> 1);
		this.anInt3731 = this.aClass6_Sub1_2.method8264() - local22 >> arg1.anInt10104;
		this.anInt3729 = this.aClass6_Sub1_2.method8264() + local22 >> arg1.anInt10104;
		this.anInt3726 = this.aClass6_Sub1_2.method8260() - local22 >> arg1.anInt10104;
		this.anInt3728 = this.aClass6_Sub1_2.method8260() + local22 >> arg1.anInt10104;
		@Pc(76) int local76 = this.anInt3729 + 1 - this.anInt3731;
		@Pc(85) int local85 = this.anInt3728 + 1 - this.anInt3726;
		this.aFloatArrayArray4 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray2 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(169) int local169;
		@Pc(185) int local185;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = local114 + this.anInt3726;
			if (local121 > 0 && this.aClass199_Sub2_2.anInt10110 - 1 > local121) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = local136 + this.anInt3731;
					if (local143 > 0 && this.aClass199_Sub2_2.anInt10111 - 1 > local143) {
						local169 = arg1.method8532(local143 + 1, local121) - arg1.method8532(local143 - 1, local121);
						local185 = arg1.method8532(local143, local121 + 1) - arg1.method8532(local143, local121 - 1);
						@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local185 * local185 + local169 * local169 + 65536)));
						this.aFloatArrayArray2[local136][local114] = (float) local169 * local200;
						this.aFloatArrayArray4[local136][local114] = -256.0F * local200;
						this.aFloatArrayArray3[local136][local114] = (float) local185 * local200;
					}
				}
			}
		}
		local121 = 0;
		@Pc(299) int local299;
		for (local136 = this.anInt3726; local136 <= this.anInt3728; local136++) {
			if (local136 >= 0 && arg1.anInt10110 > local136) {
				for (local143 = this.anInt3731; local143 <= this.anInt3729; local143++) {
					if (local143 >= 0 && local143 < arg1.anInt10111) {
						local169 = arg3[local121];
						@Pc(287) int[] local287 = arg1.anIntArrayArrayArray12[local143][local136];
						if (local287 != null && local169 != 0) {
							if (local169 == 1) {
								local299 = 0;
								while (local287.length > local299) {
									if (local287[local299++] != -1 && local287[local299++] != -1 && local287[local299++] != -1) {
										this.anInt3736 += 3;
									}
								}
							} else {
								this.anInt3736 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt3729 - this.anInt3731;
			}
		}
		if (this.anInt3736 <= 0) {
			this.aClass55_7 = null;
			this.anInterface27_3 = null;
			this.aClass55_6 = null;
			this.anInterface10_2 = null;
		} else {
			this.aClass6_Sub40_2 = new Class6_Sub40(this.anInt3736 * 2);
			this.aClass6_Sub40_Sub1_1 = new Class6_Sub40_Sub1(this.anInt3736 * 16);
			this.aClass128_11 = new Class128(Static567.method8129(this.anInt3736));
			local121 = 0;
			local143 = 0;
			for (local169 = this.anInt3726; local169 <= this.anInt3728; local169++) {
				if (local169 >= 0 && arg1.anInt10110 > local169) {
					local185 = 0;
					for (local299 = this.anInt3731; local299 <= this.anInt3729; local299++) {
						if (local299 >= 0 && arg1.anInt10111 > local299) {
							@Pc(450) int local450 = arg3[local121];
							@Pc(457) int[] local457 = arg1.anIntArrayArrayArray12[local299][local169];
							if (local457 != null && local450 != 0) {
								if (local450 == 1) {
									@Pc(471) int[] local471 = arg1.anIntArrayArrayArray10[local299][local169];
									@Pc(478) int[] local478 = arg1.anIntArrayArrayArray13[local299][local169];
									@Pc(480) int local480 = 0;
									label106: while (true) {
										while (true) {
											if (local480 >= local457.length) {
												break label106;
											}
											if (local457[local480] == -1 || local457[local480 + 1] == -1 || local457[local480 + 2] == -1) {
												local480 += 3;
											} else {
												this.method3303(local471[local480], local299, local185, local169, local478[local480], local143);
												local480++;
												this.method3303(local471[local480], local299, local185, local169, local478[local480], local143);
												local480++;
												this.method3303(local471[local480], local299, local185, local169, local478[local480], local143);
												local480++;
											}
										}
									}
								} else if (local450 == 3) {
									this.method3303(0, local299, local185, local169, 0, local143);
									this.method3303(arg1.anInt10112, local299, local185, local169, 0, local143);
									this.method3303(0, local299, local185, local169, arg1.anInt10112, local143);
								} else if (local450 == 2) {
									this.method3303(arg1.anInt10112, local299, local185, local169, 0, local143);
									this.method3303(arg1.anInt10112, local299, local185, local169, arg1.anInt10112, local143);
									this.method3303(0, local299, local185, local169, 0, local143);
								} else if (local450 == 5) {
									this.method3303(arg1.anInt10112, local299, local185, local169, arg1.anInt10112, local143);
									this.method3303(0, local299, local185, local169, arg1.anInt10112, local143);
									this.method3303(arg1.anInt10112, local299, local185, local169, 0, local143);
								} else if (local450 == 4) {
									this.method3303(0, local299, local185, local169, arg1.anInt10112, local143);
									this.method3303(0, local299, local185, local169, 0, local143);
									this.method3303(arg1.anInt10112, local299, local185, local169, arg1.anInt10112, local143);
								}
							}
						}
						local185++;
						local121++;
					}
				} else {
					local121 += this.anInt3729 - this.anInt3731;
				}
				local143++;
			}
			this.anInterface10_2 = this.aClass100_Sub3_22.method8916(false, this.aClass6_Sub40_2.aByteArray113, this.aClass6_Sub40_2.anInt10169);
			this.anInterface27_3 = this.aClass100_Sub3_22.method8883(false, this.aClass6_Sub40_Sub1_1.aByteArray113, this.aClass6_Sub40_Sub1_1.anInt10169, 16);
			this.aClass55_7 = new Class55(this.anInterface27_3, 5126, 3, 0);
			this.aClass55_6 = new Class55(this.anInterface27_3, 5121, 4, 12);
		}
		this.aClass6_Sub40_2 = null;
		this.aClass6_Sub40_Sub1_1 = null;
		this.aClass128_11 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIII)V")
	private void method3303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg1 << this.aClass199_Sub2_2.anInt10104) + arg0;
		@Pc(23) int local23 = (arg3 << this.aClass199_Sub2_2.anInt10104) + arg4;
		@Pc(30) int local30 = this.aClass199_Sub2_2.method8531(local23, local15);
		if ((arg0 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(58) Class6 local58 = this.aClass128_11.method3560(local7);
			if (local58 != null) {
				this.method3304(((Class6_Sub36) local58).aShort92);
				return;
			}
		}
		@Pc(76) short local76 = (short) this.anInt3727++;
		if (local7 != -1L) {
			this.aClass128_11.method3551(local7, new Class6_Sub36(local76));
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(198) float local198;
		@Pc(206) float local206;
		@Pc(213) float local213;
		@Pc(220) float local220;
		@Pc(227) float local227;
		@Pc(236) float local236;
		@Pc(245) float local245;
		@Pc(320) float local320;
		if (arg0 == 0 && arg4 == 0) {
			local109 = this.aFloatArrayArray2[arg2][arg5];
			local116 = this.aFloatArrayArray4[arg2][arg5];
			local123 = this.aFloatArrayArray3[arg2][arg5];
		} else if (arg0 == this.aClass199_Sub2_2.anInt10112 && arg4 == 0) {
			local123 = this.aFloatArrayArray3[arg2 + 1][arg5];
			local109 = this.aFloatArrayArray2[arg2 + 1][arg5];
			local116 = this.aFloatArrayArray4[arg2 + 1][arg5];
		} else if (this.aClass199_Sub2_2.anInt10112 == arg0 && arg4 == this.aClass199_Sub2_2.anInt10112) {
			local116 = this.aFloatArrayArray4[arg2 + 1][arg5 + 1];
			local109 = this.aFloatArrayArray2[arg2 + 1][arg5 + 1];
			local123 = this.aFloatArrayArray3[arg2 + 1][arg5 + 1];
		} else if (arg0 == 0 && this.aClass199_Sub2_2.anInt10112 == arg4) {
			local123 = this.aFloatArrayArray3[arg2][arg5 + 1];
			local116 = this.aFloatArrayArray4[arg2][arg5 + 1];
			local109 = this.aFloatArrayArray2[arg2][arg5 + 1];
		} else {
			local198 = (float) arg0 / (float) this.aClass199_Sub2_2.anInt10112;
			local206 = (float) arg4 / (float) this.aClass199_Sub2_2.anInt10112;
			local213 = this.aFloatArrayArray2[arg2][arg5];
			local220 = this.aFloatArrayArray4[arg2][arg5];
			local227 = this.aFloatArrayArray3[arg2][arg5];
			local236 = this.aFloatArrayArray2[arg2 + 1][arg5];
			local245 = this.aFloatArrayArray4[arg2 + 1][arg5];
			@Pc(261) float local261 = local213 + local198 * (this.aFloatArrayArray2[arg2][arg5 + 1] - local213);
			@Pc(276) float local276 = local227 + (this.aFloatArrayArray3[arg2][arg5 + 1] - local227) * local198;
			@Pc(294) float local294 = local236 + (this.aFloatArrayArray2[arg2 + 1][arg5 + 1] - local236) * local198;
			@Pc(311) float local311 = local245 + local198 * (this.aFloatArrayArray4[arg2 + 1][arg5 + 1] - local245);
			local320 = this.aFloatArrayArray3[arg2 + 1][arg5];
			@Pc(336) float local336 = local220 + local198 * (this.aFloatArrayArray4[arg2][arg5 + 1] - local220);
			local116 = (local311 - local336) * local206 + local336;
			local109 = local261 + local206 * (local294 - local261);
			@Pc(371) float local371 = local320 + (this.aFloatArrayArray3[arg2 + 1][arg5 + 1] - local320) * local198;
			local123 = (local371 - local276) * local206 + local276;
		}
		local198 = (float) (this.aClass6_Sub1_2.method8264() - local15);
		local206 = (float) (this.aClass6_Sub1_2.method8267() - local30);
		local213 = (float) (this.aClass6_Sub1_2.method8260() - local23);
		local220 = (float) Math.sqrt((double) (local206 * local206 + local198 * local198 + local213 * local213));
		local227 = 1.0F / local220;
		local198 *= local227;
		local213 *= local227;
		local206 *= local227;
		local236 = local220 / (float) this.aClass6_Sub1_2.method8268();
		local245 = 1.0F - local236 * local236;
		if (local245 < 0.0F) {
			local245 = 0.0F;
		}
		local320 = local123 * local213 + local109 * local198 + local116 * local206;
		if (local320 < 0.0F) {
			local320 = 0.0F;
		}
		@Pc(548) float local548 = local320 * local245 * 2.0F;
		if (local548 > 1.0F) {
			local548 = 1.0F;
		}
		@Pc(561) int local561 = this.aClass6_Sub1_2.method8265();
		@Pc(571) int local571 = (int) ((float) (local561 >> 16 & 0xFF) * local548);
		if (local571 > 255) {
			local571 = 255;
		}
		@Pc(588) int local588 = (int) ((float) (local561 >> 8 & 0xFF) * local548);
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(601) int local601 = (int) ((float) (local561 & 0xFF) * local548);
		if (this.aClass100_Sub3_22.aBoolean700) {
			this.aClass6_Sub40_Sub1_1.method7692((float) local15);
			this.aClass6_Sub40_Sub1_1.method7692((float) local30);
			this.aClass6_Sub40_Sub1_1.method7692((float) local23);
		} else {
			this.aClass6_Sub40_Sub1_1.method7691((float) local15);
			this.aClass6_Sub40_Sub1_1.method7691((float) local30);
			this.aClass6_Sub40_Sub1_1.method7691((float) local23);
		}
		if (local601 > 255) {
			local601 = 255;
		}
		this.aClass6_Sub40_Sub1_1.method8589(local571);
		this.aClass6_Sub40_Sub1_1.method8589(local588);
		this.aClass6_Sub40_Sub1_1.method8589(local601);
		this.aClass6_Sub40_Sub1_1.method8589(255);
		this.method3304(local76);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(SB)V")
	private void method3304(@OriginalArg(0) short arg0) {
		if (this.aClass100_Sub3_22.aBoolean700) {
			this.aClass6_Sub40_2.method8561(arg0);
		} else {
			this.aClass6_Sub40_2.method8617(arg0);
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II[[ZII)V")
	public void method3306(@OriginalArg(0) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface10_2 == null || (this.anInt3731 > arg2 + arg0 || (arg0 - arg2 > this.anInt3729 || (arg3 + arg2 < this.anInt3726 || arg3 - arg2 > this.anInt3728)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt3726; local55 <= this.anInt3728; local55++) {
			for (@Pc(60) int local60 = this.anInt3731; local60 <= this.anInt3729; local60++) {
				@Pc(66) int local66 = local60 - arg0;
				@Pc(71) int local71 = local55 - arg3;
				if (local66 > -arg2 && arg2 > local66 && local71 > -arg2 && arg2 > local71 && arg1[local66 + arg2][local71 + arg2]) {
					this.aClass100_Sub3_22.method8891((int) (this.aClass6_Sub1_2.method8266() * 255.0F) << 24);
					this.aClass100_Sub3_22.method8885(this.aClass55_7, this.aClass55_6, (Class55) null, (Class55) null);
					this.aClass100_Sub3_22.method8901(this.anInterface10_2, 0, this.anInt3736);
					return;
				}
			}
		}
	}
}
