import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class308 {

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "[[Lclient!aca;")
	private final Class5_Sub1_Sub1[][] aClass5_Sub1_Sub1ArrayArray4 = new Class5_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "[I")
	private final int[] anIntArray783 = new int[64];

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "[[Lclient!aca;")
	private final Class5_Sub1_Sub1[][] aClass5_Sub1_Sub1ArrayArray3 = new Class5_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
	private int anInt8895 = 0;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "[I")
	private final int[] anIntArray782 = new int[8191];

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "[I")
	private final int[] anIntArray784 = new int[1600];

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!eh;")
	private final Class88 aClass88_20;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "Lclient!tfa;")
	private final Interface20 anInterface20_15;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "Lclient!tfa;")
	private final Interface20 anInterface20_14;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "Lclient!tj;")
	private final Interface21 anInterface21_8;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!fo;)V")
	public Class308(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass88_20 = arg0.method5510(new Class7[] { new Class7(new Class13[] { Static11.aClass13_1, Static11.aClass13_3, Static11.aClass13_5 }), new Class7(Static11.aClass13_2) });
		this.anInterface20_15 = arg0.method5528(true);
		this.anInterface20_14 = arg0.method5528(false);
		this.anInterface20_14.method6523(393168, 12);
		this.anInterface21_8 = arg0.method5550(false);
		this.anInterface21_8.method5022(49146);
		@Pc(98) Buffer local98 = this.anInterface21_8.method6521();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5524(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			}
			local105.a();
			this.anInterface21_8.method6524();
		}
		@Pc(202) Buffer local202 = this.anInterface20_14.method6521();
		if (local202 != null) {
			@Pc(209) Stream local209 = arg0.method5524(local202);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
					local209.a(0.0F);
					local209.a(-1.0F);
					local209.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
					local209.b(0.0F);
					local209.b(-1.0F);
					local209.b(0.0F);
				}
			}
			local209.a();
			this.anInterface20_14.method6524();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!fo;Z)V")
	private void method7460(@OriginalArg(0) Class9_Sub3 arg0) {
		Static452.aFloat180 = arg0.aFloat148;
		arg0.method5495();
		arg0.method5503(false);
		arg0.method5526(false);
		arg0.method5522();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLclient!fo;)V")
	public void method7462(@OriginalArg(1) Class9_Sub3 arg0) {
		this.anInterface20_15.method6523(786336, 24);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!fo;I)V")
	private void method7463(@OriginalArg(0) Class9_Sub3 arg0) {
		arg0.method5526(true);
		arg0.method5503(true);
		if (arg0.aFloat148 != Static452.aFloat180) {
			arg0.ha(Static452.aFloat180);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!fo;ILclient!tg;)V")
	public void method7464(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(2) Class299 arg1) {
		if (arg0.aClass8_Sub3_16 == null) {
			return;
		}
		this.method7460(arg0);
		@Pc(17) float local17 = arg0.aClass8_Sub3_16.aFloat214;
		@Pc(21) float local21 = arg0.aClass8_Sub3_16.aFloat215;
		@Pc(25) float local25 = arg0.aClass8_Sub3_16.aFloat216;
		@Pc(29) float local29 = arg0.aClass8_Sub3_16.aFloat211;
		try {
			@Pc(39) int local39;
			@Pc(55) int local55;
			@Pc(73) Class5_Sub1 local73;
			@Pc(86) int local86;
			@Pc(254) Class5_Sub1_Sub1[] local254;
			@Pc(184) int local184;
			@Pc(264) int local264;
			@Pc(266) int local266;
			if (arg1.aBoolean663) {
				local39 = arg1.anInt8805 - arg1.anInt8806;
				if (local39 + 2 > 1600) {
					local55 = Static330.method5267(local39) + 1 - Static358.anInt6874;
					local39 = (local39 >> local55) + 2;
				} else {
					local39 += 2;
					local55 = 0;
				}
				@Pc(70) Class5_Sub1 local70 = arg1.aClass272_1.aClass5_Sub1_9;
				local73 = local70.aClass5_Sub1_8;
				@Pc(75) int local75 = -2;
				@Pc(77) boolean local77 = true;
				@Pc(79) boolean local79 = true;
				while (local73 != local70) {
					this.anInt8895 = 0;
					for (local86 = 0; local86 < local39; local86++) {
						this.anIntArray784[local86] = 0;
					}
					for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
						this.anIntArray783[local103] = 0;
					}
					while (local73 != local70) {
						@Pc(121) Class5_Sub1_Sub1 local121 = (Class5_Sub1_Sub1) local73;
						if (local79) {
							local75 = local121.anInt6013;
							local79 = false;
							local77 = local121.aBoolean448;
						} else if (local121.anInt6013 != local75 || local121.aBoolean448 != local77) {
							local79 = true;
							break;
						}
						local184 = (int) (local29 + (float) (local121.anInt6009 >> 12) * local21 + local17 * (float) (local121.anInt6014 >> 12) + (float) (local121.anInt6011 >> 12) * local25) - arg1.anInt8806 >> local55;
						if (local184 < 1600) {
							if (this.anIntArray784[local184] < 64) {
								this.aClass5_Sub1_Sub1ArrayArray3[local184][this.anIntArray784[local184]++] = local121;
							} else {
								label192: {
									if (this.anIntArray784[local184] == 64) {
										if (this.anInt8895 == 64) {
											break label192;
										}
										this.anIntArray784[local184] += this.anInt8895++ + 1;
									}
									local254 = this.aClass5_Sub1_Sub1ArrayArray4[this.anIntArray784[local184] - 64 - 1];
									local264 = this.anIntArray784[local184] - 1 - 64;
									local266 = this.anIntArray783[this.anIntArray784[local184] - 1 - 64];
									this.anIntArray783[local264] = this.anIntArray783[this.anIntArray784[local184] - 1 - 64] + 1;
									local254[local266] = local121;
								}
							}
						}
						local73 = local73.aClass5_Sub1_8;
					}
					arg0.method5559(local75 > 0 ? local75 : -1, false, false);
					if (local77 && Static452.aFloat180 != arg0.aFloat148) {
						arg0.ha(Static452.aFloat180);
					} else if (arg0.aFloat148 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method7467(local39, arg0);
				}
			} else {
				local39 = 0;
				local55 = Integer.MAX_VALUE;
				@Pc(327) int local327 = 0;
				local73 = arg1.aClass272_1.aClass5_Sub1_9;
				@Pc(334) Class5_Sub1 local334;
				@Pc(366) int local366;
				for (local334 = local73.aClass5_Sub1_8; local334 != local73; local334 = local334.aClass5_Sub1_8) {
					@Pc(339) Class5_Sub1_Sub1 local339 = (Class5_Sub1_Sub1) local334;
					local366 = (int) (local25 * (float) (local339.anInt6011 >> 12) + (float) (local339.anInt6014 >> 12) * local17 + local21 * (float) (local339.anInt6009 >> 12) + local29);
					if (local366 > local327) {
						local327 = local366;
					}
					if (local55 > local366) {
						local55 = local366;
					}
					this.anIntArray782[local39++] = local366;
				}
				@Pc(400) int local400 = local327 - local55;
				if (local400 + 2 <= 1600) {
					local366 = 0;
					local400 += 2;
				} else {
					local366 = Static330.method5267(local400) + 1 - Static358.anInt6874;
					local400 = (local400 >> local366) + 2;
				}
				local334 = local73.aClass5_Sub1_8;
				local39 = 0;
				local86 = -2;
				@Pc(435) boolean local435 = true;
				@Pc(437) boolean local437 = true;
				while (local334 != local73) {
					this.anInt8895 = 0;
					for (local184 = 0; local184 < local400; local184++) {
						this.anIntArray784[local184] = 0;
					}
					for (@Pc(461) int local461 = 0; local461 < 64; local461++) {
						this.anIntArray783[local461] = 0;
					}
					while (local73 != local334) {
						@Pc(477) Class5_Sub1_Sub1 local477 = (Class5_Sub1_Sub1) local334;
						if (local437) {
							local435 = local477.aBoolean448;
							local437 = false;
							local86 = local477.anInt6013;
						}
						if (local39 > 0 && (local477.anInt6013 != local86 || local477.aBoolean448 != local435)) {
							local437 = true;
							break;
						}
						@Pc(516) int local516 = this.anIntArray782[local39++] - local55 >> local366;
						if (local516 < 1600) {
							if (this.anIntArray784[local516] >= 64) {
								label142: {
									if (this.anIntArray784[local516] == 64) {
										if (this.anInt8895 == 64) {
											break label142;
										}
										this.anIntArray784[local516] += this.anInt8895++ + 1;
									}
									local254 = this.aClass5_Sub1_Sub1ArrayArray4[this.anIntArray784[local516] - 64 - 1];
									local264 = this.anIntArray784[local516] - 65;
									local266 = this.anIntArray783[this.anIntArray784[local516] - 65];
									this.anIntArray783[local264] = this.anIntArray783[this.anIntArray784[local516] - 65] + 1;
									local254[local266] = local477;
								}
							} else {
								this.aClass5_Sub1_Sub1ArrayArray3[local516][this.anIntArray784[local516]++] = local477;
							}
						}
						local334 = local334.aClass5_Sub1_8;
					}
					arg0.method5559(local86 >= 0 ? local86 : -1, false, false);
					if (local435 && Static452.aFloat180 != arg0.aFloat148) {
						arg0.ha(Static452.aFloat180);
					} else if (arg0.aFloat148 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method7467(local400, arg0);
				}
			}
		} catch (@Pc(650) Exception local650) {
		}
		this.method7463(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
	public void method7466() {
		this.anInterface20_15.method6520();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!fo;B)V")
	private void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub3 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class8_Sub3 local11 = arg1.method5563();
		@Pc(14) float local14 = local11.aFloat207;
		@Pc(17) float local17 = local11.aFloat210;
		@Pc(20) float local20 = local11.aFloat208;
		@Pc(23) float local23 = local11.aFloat209;
		@Pc(26) float local26 = local11.aFloat205;
		@Pc(29) float local29 = local11.aFloat212;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(58) float local58 = local23 - local14;
		@Pc(62) float local62 = local26 - local17;
		@Pc(66) float local66 = local29 - local20;
		@Pc(72) Buffer local72 = this.anInterface20_15.method6521();
		if (local72 == null) {
			return;
		}
		@Pc(88) Stream local88 = arg1.method5524(local72);
		@Pc(94) int local94;
		@Pc(109) int local109;
		@Pc(118) int local118;
		@Pc(127) Class5_Sub1_Sub1 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(439) float local439;
		@Pc(444) int local444;
		@Pc(384) int local384;
		@Pc(400) Class5_Sub1_Sub1 local400;
		@Pc(403) int local403;
		@Pc(416) byte local416;
		@Pc(421) byte local421;
		@Pc(433) float local433;
		if (Stream.c()) {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray784[local94] > 64 ? 64 : this.anIntArray784[local94];
				if (local109 > 0) {
					for (local118 = local109 - 1; local118 >= 0; local118--) {
						local127 = this.aClass5_Sub1_Sub1ArrayArray3[local94][local118];
						local130 = local127.anInt6015;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt6014 >> 12;
						local160 = local127.anInt6009 >> 12;
						local166 = local127.anInt6011 >> 12;
						local171 = local127.anInt6007 >> 12;
						local88.a(local33 * (float) -local171 + local154);
						local88.a((float) -local171 * local37 + local160);
						local88.a((float) -local171 * local41 + local166);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.a(0.0F);
						local88.a(0.0F);
						local88.a((float) local171 * local46 + local154);
						local88.a(local50 * (float) local171 + local160);
						local88.a((float) local171 * local54 + local166);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.a(1.0F);
						local88.a(0.0F);
						local88.a(local33 * (float) local171 + local154);
						local88.a(local160 + local37 * (float) local171);
						local88.a(local166 + local41 * (float) local171);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.a(1.0F);
						local88.a(1.0F);
						local88.a((float) local171 * local58 + local154);
						local88.a((float) local171 * local62 + local160);
						local88.a((float) local171 * local66 + local166);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.a(0.0F);
						local7++;
						local88.a(1.0F);
					}
					if (this.anIntArray784[local94] > 64) {
						local384 = this.anIntArray784[local94] - 65;
						for (local130 = this.anIntArray783[local384] - 1; local130 >= 0; local130--) {
							local400 = this.aClass5_Sub1_Sub1ArrayArray4[local384][local130];
							local403 = local400.anInt6015;
							local143 = (byte) (local403 >> 16);
							local148 = (byte) (local403 >> 8);
							local416 = (byte) local403;
							local421 = (byte) (local403 >>> 24);
							local166 = local400.anInt6014 >> 12;
							local433 = local400.anInt6009 >> 12;
							local439 = local400.anInt6011 >> 12;
							local444 = local400.anInt6007 >> 12;
							local88.a(local33 * (float) -local444 + local166);
							local88.a(local433 + (float) -local444 * local37);
							local88.a(local41 * (float) -local444 + local439);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.a(0.0F);
							local88.a(0.0F);
							local88.a(local166 + local46 * (float) local444);
							local88.a(local433 + local50 * (float) local444);
							local88.a(local439 + local54 * (float) local444);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.a(1.0F);
							local88.a(0.0F);
							local88.a((float) local444 * local33 + local166);
							local88.a(local433 + local37 * (float) local444);
							local88.a(local41 * (float) local444 + local439);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.a(1.0F);
							local88.a(1.0F);
							local88.a(local166 + local58 * (float) local444);
							local88.a(local433 + local62 * (float) local444);
							local88.a(local439 + (float) local444 * local66);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.a(0.0F);
							local7++;
							local88.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray784[local94] > 64 ? 64 : this.anIntArray784[local94];
				if (local109 > 0) {
					for (local118 = local109 - 1; local118 >= 0; local118--) {
						local127 = this.aClass5_Sub1_Sub1ArrayArray3[local94][local118];
						local130 = local127.anInt6015;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt6014 >> 12;
						local160 = local127.anInt6009 >> 12;
						local166 = local127.anInt6011 >> 12;
						local171 = local127.anInt6007 >> 12;
						local88.b(local154 + (float) -local171 * local33);
						local88.b(local37 * (float) -local171 + local160);
						local88.b((float) -local171 * local41 + local166);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.b(0.0F);
						local88.b(0.0F);
						local88.b(local154 + local46 * (float) local171);
						local88.b(local160 + local50 * (float) local171);
						local88.b(local54 * (float) local171 + local166);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.b(1.0F);
						local88.b(0.0F);
						local88.b((float) local171 * local33 + local154);
						local88.b((float) local171 * local37 + local160);
						local88.b(local166 + local41 * (float) local171);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.b(1.0F);
						local88.b(1.0F);
						local88.b(local154 + local58 * (float) local171);
						local88.b(local160 + (float) local171 * local62);
						local88.b(local66 * (float) local171 + local166);
						if (arg1.anInt6542 == 0) {
							local88.b(local135, local140, local143, local148);
						} else {
							local88.a(local135, local140, local143, local148);
						}
						local88.b(0.0F);
						local88.b(1.0F);
						local7++;
					}
					if (this.anIntArray784[local94] > 64) {
						local384 = this.anIntArray784[local94] - 1 - 64;
						for (local130 = this.anIntArray783[local384] - 1; local130 >= 0; local130--) {
							local400 = this.aClass5_Sub1_Sub1ArrayArray4[local384][local130];
							local403 = local400.anInt6015;
							local143 = (byte) (local403 >> 16);
							local148 = (byte) (local403 >> 8);
							local416 = (byte) local403;
							local421 = (byte) (local403 >>> 24);
							local166 = local400.anInt6014 >> 12;
							local433 = local400.anInt6009 >> 12;
							local439 = local400.anInt6011 >> 12;
							local444 = local400.anInt6007 >> 12;
							local88.b(local33 * (float) -local444 + local166);
							local88.b((float) -local444 * local37 + local433);
							local88.b((float) -local444 * local41 + local439);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.b(0.0F);
							local88.b(0.0F);
							local88.b(local46 * (float) local444 + local166);
							local88.b((float) local444 * local50 + local433);
							local88.b((float) local444 * local54 + local439);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.b(1.0F);
							local88.b(0.0F);
							local88.b(local166 + (float) local444 * local33);
							local88.b(local433 + local37 * (float) local444);
							local88.b(local439 + local41 * (float) local444);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.b(1.0F);
							local88.b(1.0F);
							local88.b(local166 + local58 * (float) local444);
							local88.b(local433 + local62 * (float) local444);
							local88.b(local439 + local66 * (float) local444);
							if (arg1.anInt6542 == 0) {
								local88.b(local143, local148, local416, local421);
							} else {
								local88.a(local143, local148, local416, local421);
							}
							local88.b(0.0F);
							local7++;
							local88.b(1.0F);
						}
					}
				}
			}
		}
		local88.a();
		if (this.anInterface20_15.method6524()) {
			arg1.method5513(0, this.anInterface20_15);
			arg1.method5513(1, this.anInterface20_14);
			arg1.method5535(this.aClass88_20);
			arg1.method5539(0, 0, Static492.aClass328_6, this.anInterface21_8, local7 * 2, local7 * 4);
		}
	}
}
