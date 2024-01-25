import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class255 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[[Lclient!mca;")
	private final Class7_Sub1_Sub1[][] aClass7_Sub1_Sub1ArrayArray3 = new Class7_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "[[Lclient!mca;")
	private final Class7_Sub1_Sub1[][] aClass7_Sub1_Sub1ArrayArray4 = new Class7_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "[I")
	private final int[] anIntArray540 = new int[8191];

	@OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
	private int anInt7669 = 0;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "[I")
	private final int[] anIntArray541 = new int[1600];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "[I")
	private final int[] anIntArray539 = new int[64];

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "Lclient!lu;")
	private final Interface10 anInterface10_9;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Lclient!tq;")
	private final Class287 aClass287_19;

	@OriginalMember(owner = "client!qo", name = "o", descriptor = "Lclient!uj;")
	private final Interface18 anInterface18_8;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lclient!wr;)V")
	public Class255(@OriginalArg(0) Class42_Sub1 arg0) {
		this.anInterface10_9 = arg0.method5930(true);
		this.aClass287_19 = arg0.method5940(new Class75[] { new Class75(new Class262[] { Static427.aClass262_1, Static427.aClass262_3, Static427.aClass262_5 }) });
		this.anInterface18_8 = arg0.method5906(false);
		this.anInterface18_8.method7529(49146);
		@Pc(78) Buffer local78 = this.anInterface18_8.method7895();
		if (local78 != null) {
			@Pc(85) Stream local85 = arg0.method5871(local78);
			@Pc(89) int local89;
			@Pc(95) int local95;
			if (Stream.c()) {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.a(local95);
					local85.a(local95 + 1);
					local85.a(local95 + 2);
					local85.a(local95 + 2);
					local85.a(local95 + 3);
					local85.a(local95);
				}
			} else {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.d(local95);
					local85.d(local95 + 1);
					local85.d(local95 + 2);
					local85.d(local95 + 2);
					local85.d(local95 + 3);
					local85.d(local95);
				}
			}
			local85.a();
			this.anInterface18_8.method7899();
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!wr;B)V")
	private void method6378(@OriginalArg(0) Class42_Sub1 arg0) {
		Static283.aFloat193 = arg0.aFloat165;
		arg0.method5889();
		arg0.method5933(false);
		arg0.method5885(false);
		arg0.method5990();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!wr;I)V")
	public void method6379(@OriginalArg(0) Class42_Sub1 arg0) {
		this.anInterface10_9.method7897(24, 196584);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public void method6380() {
		this.anInterface10_9.method7898();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBLclient!wr;)V")
	private void method6381(@OriginalArg(0) int arg0, @OriginalArg(2) Class42_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class91_Sub2 local11 = arg1.method5916();
		@Pc(14) float local14 = local11.aFloat141;
		@Pc(23) float local23 = local11.aFloat143;
		@Pc(26) float local26 = local11.aFloat142;
		@Pc(29) float local29 = local11.aFloat137;
		@Pc(32) float local32 = local11.aFloat134;
		@Pc(35) float local35 = local11.aFloat139;
		@Pc(39) float local39 = local14 + local29;
		@Pc(43) float local43 = local23 + local32;
		@Pc(47) float local47 = local35 + local26;
		@Pc(51) float local51 = local14 - local29;
		@Pc(56) float local56 = local23 - local32;
		@Pc(60) float local60 = local26 - local35;
		@Pc(65) float local65 = local29 - local14;
		@Pc(70) float local70 = local32 - local23;
		@Pc(75) float local75 = local35 - local26;
		@Pc(81) Buffer local81 = this.anInterface10_9.method7895();
		if (local81 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg1.method5871(local81);
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(121) int local121;
		@Pc(130) Class7_Sub1_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(419) float local419;
		@Pc(424) int local424;
		@Pc(364) int local364;
		@Pc(380) Class7_Sub1_Sub1 local380;
		@Pc(383) int local383;
		@Pc(396) byte local396;
		@Pc(401) byte local401;
		@Pc(413) float local413;
		if (Stream.c()) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray541[local95] <= 64 ? this.anIntArray541[local95] : 64;
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass7_Sub1_Sub1ArrayArray3[local95][local121];
						local133 = local130.anInt3273;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt3263 >> 12;
						local163 = local130.anInt3271 >> 12;
						local169 = local130.anInt3272 >> 12;
						local174 = local130.anInt3268 >> 12;
						local89.a(local157 + (float) -local174 * local39);
						local89.a(local163 + local43 * (float) -local174);
						local89.a(local169 + local47 * (float) -local174);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local51 * (float) local174 + local157);
						local89.a((float) local174 * local56 + local163);
						local89.a(local169 + (float) local174 * local60);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local39 * (float) local174 + local157);
						local89.a(local163 + (float) local174 * local43);
						local89.a((float) local174 * local47 + local169);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a(local157 + (float) local174 * local65);
						local89.a(local163 + (float) local174 * local70);
						local89.a(local169 + (float) local174 * local75);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.a(0.0F);
						local7++;
						local89.a(1.0F);
					}
					if (this.anIntArray541[local95] > 64) {
						local364 = this.anIntArray541[local95] - 64 - 1;
						for (local133 = this.anIntArray539[local364] - 1; local133 >= 0; local133--) {
							local380 = this.aClass7_Sub1_Sub1ArrayArray4[local364][local133];
							local383 = local380.anInt3273;
							local146 = (byte) (local383 >> 16);
							local151 = (byte) (local383 >> 8);
							local396 = (byte) local383;
							local401 = (byte) (local383 >>> 24);
							local169 = local380.anInt3263 >> 12;
							local413 = local380.anInt3271 >> 12;
							local419 = local380.anInt3272 >> 12;
							local424 = local380.anInt3268 >> 12;
							local89.a(local169 + (float) -local424 * local39);
							local89.a(local43 * (float) -local424 + local413);
							local89.a(local419 + (float) -local424 * local47);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a((float) local424 * local51 + local169);
							local89.a((float) local424 * local56 + local413);
							local89.a(local60 * (float) local424 + local419);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a(local169 + local39 * (float) local424);
							local89.a(local43 * (float) local424 + local413);
							local89.a(local419 + local47 * (float) local424);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a((float) local424 * local65 + local169);
							local89.a((float) local424 * local70 + local413);
							local89.a((float) local424 * local75 + local419);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.a(0.0F);
							local89.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray541[local95] > 64 ? 64 : this.anIntArray541[local95];
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass7_Sub1_Sub1ArrayArray3[local95][local121];
						local133 = local130.anInt3273;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt3263 >> 12;
						local163 = local130.anInt3271 >> 12;
						local169 = local130.anInt3272 >> 12;
						local174 = local130.anInt3268 >> 12;
						local89.b(local39 * (float) -local174 + local157);
						local89.b(local163 + local43 * (float) -local174);
						local89.b((float) -local174 * local47 + local169);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b((float) local174 * local51 + local157);
						local89.b(local163 + local56 * (float) local174);
						local89.b(local60 * (float) local174 + local169);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b((float) local174 * local39 + local157);
						local89.b(local163 + local43 * (float) local174);
						local89.b(local169 + (float) local174 * local47);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b(local157 + local65 * (float) local174);
						local89.b((float) local174 * local70 + local163);
						local89.b(local75 * (float) local174 + local169);
						local89.c(local146);
						local89.c(local143);
						local89.c(local138);
						local89.c(local151);
						local89.b(0.0F);
						local7++;
						local89.b(1.0F);
					}
					if (this.anIntArray541[local95] > 64) {
						local364 = this.anIntArray541[local95] - 64 - 1;
						for (local133 = this.anIntArray539[local364] - 1; local133 >= 0; local133--) {
							local380 = this.aClass7_Sub1_Sub1ArrayArray4[local364][local133];
							local383 = local380.anInt3273;
							local146 = (byte) (local383 >> 16);
							local151 = (byte) (local383 >> 8);
							local396 = (byte) local383;
							local401 = (byte) (local383 >>> 24);
							local169 = local380.anInt3263 >> 12;
							local413 = local380.anInt3271 >> 12;
							local419 = local380.anInt3272 >> 12;
							local424 = local380.anInt3268 >> 12;
							local89.b(local169 + (float) -local424 * local39);
							local89.b((float) -local424 * local43 + local413);
							local89.b(local419 + (float) -local424 * local47);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local169 + local51 * (float) local424);
							local89.b((float) local424 * local56 + local413);
							local89.b(local60 * (float) local424 + local419);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b(local169 + (float) local424 * local39);
							local89.b(local413 + local43 * (float) local424);
							local89.b(local419 + (float) local424 * local47);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local169 + (float) local424 * local65);
							local89.b((float) local424 * local70 + local413);
							local89.b(local419 + local75 * (float) local424);
							local89.c(local396);
							local89.c(local151);
							local89.c(local146);
							local89.c(local401);
							local89.b(0.0F);
							local7++;
							local89.b(1.0F);
						}
					}
				}
			}
		}
		local89.a();
		if (this.anInterface10_9.method7899()) {
			arg1.method5999(this.aClass287_19);
			arg1.method5877(this.anInterface10_9, 0);
			arg1.method5986(local7 * 4, this.anInterface18_8, 0, local7 * 2, 0, Static480.aClass147_8);
		}
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(Lclient!wr;B)V")
	private void method6383(@OriginalArg(0) Class42_Sub1 arg0) {
		arg0.method5885(true);
		arg0.method5933(true);
		if (arg0.aFloat165 != Static283.aFloat193) {
			arg0.M(Static283.aFloat193);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!wr;BLclient!hp;)V")
	public void method6385(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(2) Class136 arg1) {
		if (arg0.aClass91_Sub2_16 == null) {
			return;
		}
		this.method6378(arg0);
		@Pc(17) float local17 = arg0.aClass91_Sub2_16.aFloat136;
		@Pc(21) float local21 = arg0.aClass91_Sub2_16.aFloat133;
		@Pc(25) float local25 = arg0.aClass91_Sub2_16.aFloat140;
		@Pc(29) float local29 = arg0.aClass91_Sub2_16.aFloat135;
		try {
			@Pc(39) int local39;
			@Pc(41) int local41;
			@Pc(47) Class7_Sub1 local47;
			@Pc(142) int local142;
			@Pc(276) Class7_Sub1_Sub1[] local276;
			@Pc(153) int local153;
			@Pc(286) int local286;
			@Pc(288) int local288;
			if (arg1.aBoolean340) {
				local39 = arg1.anInt4293 - arg1.anInt4294;
				if (local39 + 2 > 1600) {
					local41 = Static483.method7240(local39) + 1 - Static245.anInt9232;
					local39 = (local39 >> local41) + 2;
				} else {
					local41 = 0;
					local39 += 2;
				}
				@Pc(396) Class7_Sub1 local396 = arg1.aClass313_1.aClass7_Sub1_9;
				local47 = local396.aClass7_Sub1_8;
				@Pc(401) int local401 = -2;
				@Pc(403) boolean local403 = true;
				@Pc(405) boolean local405 = true;
				while (local396 != local47) {
					this.anInt7669 = 0;
					for (local142 = 0; local142 < local39; local142++) {
						this.anIntArray541[local142] = 0;
					}
					for (@Pc(429) int local429 = 0; local429 < 64; local429++) {
						this.anIntArray539[local429] = 0;
					}
					while (local47 != local396) {
						@Pc(447) Class7_Sub1_Sub1 local447 = (Class7_Sub1_Sub1) local47;
						if (local405) {
							local405 = false;
							local403 = local447.aBoolean266;
							local401 = local447.anInt3264;
						} else if (local401 != local447.anInt3264 || local447.aBoolean266 != local403) {
							local405 = true;
							break;
						}
						local153 = (int) (local25 * (float) (local447.anInt3272 >> 12) + (float) (local447.anInt3263 >> 12) * local17 + (float) (local447.anInt3271 >> 12) * local21 + local29) - arg1.anInt4294 >> local41;
						if (local153 < 1600) {
							if (this.anIntArray541[local153] < 64) {
								this.aClass7_Sub1_Sub1ArrayArray3[local153][this.anIntArray541[local153]++] = local447;
							} else {
								label146: {
									if (this.anIntArray541[local153] == 64) {
										if (this.anInt7669 == 64) {
											break label146;
										}
										this.anIntArray541[local153] += this.anInt7669++ + 1;
									}
									local276 = this.aClass7_Sub1_Sub1ArrayArray4[this.anIntArray541[local153] - 1 - 64];
									local286 = this.anIntArray541[local153] - 64 - 1;
									local288 = this.anIntArray539[this.anIntArray541[local153] - 64 - 1];
									this.anIntArray539[local286] = this.anIntArray539[this.anIntArray541[local153] - 64 - 1] + 1;
									local276[local288] = local447;
								}
							}
						}
						local47 = local47.aClass7_Sub1_8;
					}
					arg0.method5997(local401 < 0 ? -1 : local401, false, false);
					if (local403 && arg0.aFloat165 != Static283.aFloat193) {
						arg0.M(Static283.aFloat193);
					} else if (arg0.aFloat165 != 1.0F) {
						arg0.M(1.0F);
					}
					this.method6381(local39, arg0);
				}
			} else {
				local39 = 0;
				local41 = Integer.MAX_VALUE;
				@Pc(43) int local43 = 0;
				local47 = arg1.aClass313_1.aClass7_Sub1_9;
				@Pc(50) Class7_Sub1 local50;
				@Pc(82) int local82;
				for (local50 = local47.aClass7_Sub1_8; local50 != local47; local50 = local50.aClass7_Sub1_8) {
					@Pc(55) Class7_Sub1_Sub1 local55 = (Class7_Sub1_Sub1) local50;
					local82 = (int) (local29 + local25 * (float) (local55.anInt3272 >> 12) + local17 * (float) (local55.anInt3263 >> 12) + local21 * (float) (local55.anInt3271 >> 12));
					this.anIntArray540[local39++] = local82;
					if (local43 < local82) {
						local43 = local82;
					}
					if (local82 < local41) {
						local41 = local82;
					}
				}
				@Pc(109) int local109 = local43 - local41;
				if (local109 + 2 <= 1600) {
					local82 = 0;
					local109 += 2;
				} else {
					local82 = Static483.method7240(local109) + 1 - Static245.anInt9232;
					local109 = (local109 >> local82) + 2;
				}
				local39 = 0;
				local50 = local47.aClass7_Sub1_8;
				local142 = -2;
				@Pc(144) boolean local144 = true;
				@Pc(146) boolean local146 = true;
				while (local50 != local47) {
					this.anInt7669 = 0;
					for (local153 = 0; local153 < local109; local153++) {
						this.anIntArray541[local153] = 0;
					}
					for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
						this.anIntArray539[local166] = 0;
					}
					while (local47 != local50) {
						@Pc(182) Class7_Sub1_Sub1 local182 = (Class7_Sub1_Sub1) local50;
						if (local146) {
							local144 = local182.aBoolean266;
							local146 = false;
							local142 = local182.anInt3264;
						}
						if (local39 > 0 && (local142 != local182.anInt3264 || local144 != local182.aBoolean266)) {
							local146 = true;
							break;
						}
						@Pc(228) int local228 = this.anIntArray540[local39++] - local41 >> local82;
						if (local228 < 1600) {
							if (this.anIntArray541[local228] >= 64) {
								label191: {
									if (this.anIntArray541[local228] == 64) {
										if (this.anInt7669 == 64) {
											break label191;
										}
										this.anIntArray541[local228] += this.anInt7669++ + 1;
									}
									local276 = this.aClass7_Sub1_Sub1ArrayArray4[this.anIntArray541[local228] - 65];
									local286 = this.anIntArray541[local228] - 64 - 1;
									local288 = this.anIntArray539[this.anIntArray541[local228] - 64 - 1];
									this.anIntArray539[local286] = this.anIntArray539[this.anIntArray541[local228] - 64 - 1] + 1;
									local276[local288] = local182;
								}
							} else {
								this.aClass7_Sub1_Sub1ArrayArray3[local228][this.anIntArray541[local228]++] = local182;
							}
						}
						local50 = local50.aClass7_Sub1_8;
					}
					arg0.method5997(local142 >= 0 ? local142 : -1, false, false);
					if (local144 && arg0.aFloat165 != Static283.aFloat193) {
						arg0.M(Static283.aFloat193);
					} else if (arg0.aFloat165 != 1.0F) {
						arg0.M(1.0F);
					}
					this.method6381(local109, arg0);
				}
			}
		} catch (@Pc(643) Exception local643) {
		}
		this.method6383(arg0);
	}
}
