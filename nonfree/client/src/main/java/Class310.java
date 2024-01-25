import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qia")
public final class Class310 {

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "[I")
	private final int[] anIntArray595 = new int[64];

	@OriginalMember(owner = "client!qia", name = "s", descriptor = "[[Lclient!jma;")
	private final Class9_Sub2_Sub1[][] aClass9_Sub2_Sub1ArrayArray4 = new Class9_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!qia", name = "t", descriptor = "[I")
	private final int[] anIntArray597 = new int[1600];

	@OriginalMember(owner = "client!qia", name = "m", descriptor = "[I")
	private final int[] anIntArray596 = new int[8191];

	@OriginalMember(owner = "client!qia", name = "i", descriptor = "[[Lclient!jma;")
	private final Class9_Sub2_Sub1[][] aClass9_Sub2_Sub1ArrayArray3 = new Class9_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!qia", name = "r", descriptor = "I")
	private int anInt8240 = 0;

	@OriginalMember(owner = "client!qia", name = "g", descriptor = "Lclient!wh;")
	private final Class36 aClass36_9;

	@OriginalMember(owner = "client!qia", name = "l", descriptor = "Lclient!lq;")
	private final Interface14 anInterface14_11;

	@OriginalMember(owner = "client!qia", name = "v", descriptor = "Lclient!lq;")
	private final Interface14 anInterface14_10;

	@OriginalMember(owner = "client!qia", name = "p", descriptor = "Lclient!kl;")
	private final Interface11 anInterface11_6;

	@OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Lclient!jca;)V")
	public Class310(@OriginalArg(0) Class22_Sub2 arg0) {
		this.aClass36_9 = arg0.method8944(new Class95[] { new Class95(new Class278[] { Static469.aClass278_1, Static469.aClass278_3, Static469.aClass278_5 }), new Class95(Static469.aClass278_2) });
		this.anInterface14_11 = arg0.method8937(true);
		this.anInterface14_10 = arg0.method8937(false);
		this.anInterface14_10.method6767(12, 393168);
		this.anInterface11_6 = arg0.method8916(false);
		this.anInterface11_6.method6757(49146);
		@Pc(98) Buffer local98 = this.anInterface11_6.method5367();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method8918(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.b();
			this.anInterface11_6.method5366();
		}
		@Pc(208) Buffer local208 = this.anInterface14_10.method6764();
		if (local208 != null) {
			@Pc(215) Stream local215 = arg0.method8918(local208);
			if (Stream.c()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local215.a(0.0F);
					local215.a(-1.0F);
					local215.a(0.0F);
					local215.a(0.0F);
					local215.a(-1.0F);
					local215.a(0.0F);
					local215.a(0.0F);
					local215.a(-1.0F);
					local215.a(0.0F);
					local215.a(0.0F);
					local215.a(-1.0F);
					local215.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local215.b(0.0F);
					local215.b(-1.0F);
					local215.b(0.0F);
					local215.b(0.0F);
					local215.b(-1.0F);
					local215.b(0.0F);
					local215.b(0.0F);
					local215.b(-1.0F);
					local215.b(0.0F);
					local215.b(0.0F);
					local215.b(-1.0F);
					local215.b(0.0F);
				}
			}
			local215.b();
			this.anInterface14_10.method6766();
		}
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lclient!jca;B)V")
	private void method7043(@OriginalArg(0) Class22_Sub2 arg0) {
		Static683.aFloat195 = arg0.aFloat182;
		arg0.method8923();
		arg0.method8908(false);
		arg0.method8902(false);
		arg0.method8905();
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IBLclient!jca;Lclient!so;)V")
	public void method7044(@OriginalArg(0) int arg0, @OriginalArg(2) Class22_Sub2 arg1, @OriginalArg(3) Class346 arg2) {
		if (arg1.aClass58_Sub2_16 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method7043(arg1);
		} else {
			this.method7045(arg1, arg0);
		}
		@Pc(31) float local31 = arg1.aClass58_Sub2_16.aFloat115;
		@Pc(35) float local35 = arg1.aClass58_Sub2_16.aFloat113;
		@Pc(39) float local39 = arg1.aClass58_Sub2_16.aFloat114;
		@Pc(43) float local43 = arg1.aClass58_Sub2_16.aFloat111;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(53) Class9_Sub2 local53 = arg2.aClass357_1.aClass9_Sub2_9;
			@Pc(56) Class9_Sub2 local56;
			@Pc(88) int local88;
			for (local56 = local53.aClass9_Sub2_8; local56 != local53; local56 = local56.aClass9_Sub2_8) {
				@Pc(61) Class9_Sub2_Sub1 local61 = (Class9_Sub2_Sub1) local56;
				local88 = (int) (local43 + local35 * (float) (local61.anInt1772 >> 12) + (float) (local61.anInt1777 >> 12) * local31 + local39 * (float) (local61.anInt1776 >> 12));
				if (local88 > local49) {
					local49 = local88;
				}
				this.anIntArray596[local45++] = local88;
				if (local47 > local88) {
					local47 = local88;
				}
			}
			@Pc(119) int local119 = local49 - local47;
			if (local119 + 2 > 1600) {
				local88 = Static462.method6277(local119) + 1 - Static343.anInt5498;
				local119 = (local119 >> local88) + 2;
			} else {
				local88 = 0;
				local119 += 2;
			}
			local56 = local53.aClass9_Sub2_8;
			local45 = 0;
			@Pc(161) int local161 = -2;
			@Pc(163) boolean local163 = true;
			@Pc(165) boolean local165 = true;
			while (local56 != local53) {
				this.anInt8240 = 0;
				for (@Pc(174) int local174 = 0; local174 < local119; local174++) {
					this.anIntArray597[local174] = 0;
				}
				for (@Pc(193) int local193 = 0; local193 < 64; local193++) {
					this.anIntArray595[local193] = 0;
				}
				while (local56 != local53) {
					@Pc(217) Class9_Sub2_Sub1 local217 = (Class9_Sub2_Sub1) local56;
					if (local165) {
						local165 = false;
						local161 = local217.anInt1774;
						local163 = local217.aBoolean129;
					}
					if (local45 > 0 && (local217.anInt1774 != local161 || local217.aBoolean129 != local163)) {
						local165 = true;
						break;
					}
					@Pc(259) int local259 = this.anIntArray596[local45++] - local47 >> local88;
					if (local259 < 1600) {
						if (this.anIntArray597[local259] >= 64) {
							label97: {
								if (this.anIntArray597[local259] == 64) {
									if (this.anInt8240 == 64) {
										break label97;
									}
									this.anIntArray597[local259] += this.anInt8240++ + 1;
								}
								@Pc(323) Class9_Sub2_Sub1[] local323 = this.aClass9_Sub2_Sub1ArrayArray4[this.anIntArray597[local259] - 65];
								@Pc(333) int local333 = this.anIntArray597[local259] - 64 - 1;
								@Pc(335) int local335 = this.anIntArray595[this.anIntArray597[local259] - 64 - 1];
								this.anIntArray595[local333] = this.anIntArray595[this.anIntArray597[local259] - 64 - 1] + 1;
								local323[local335] = local217;
							}
						} else {
							this.aClass9_Sub2_Sub1ArrayArray3[local259][this.anIntArray597[local259]++] = local217;
						}
					}
					local56 = local56.aClass9_Sub2_8;
				}
				arg1.method8979(false, false, local161 < 0 ? -1 : local161);
				if (local163 && arg1.aFloat182 != Static683.aFloat195) {
					arg1.xa(Static683.aFloat195);
				} else if (arg1.aFloat182 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method7050(local119, arg1);
			}
		} catch (@Pc(419) Exception local419) {
		}
		this.method7048(arg1);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(ILclient!jca;I)V")
	private void method7045(@OriginalArg(1) Class22_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static683.aFloat195 = arg0.aFloat182;
		arg0.method8909((float) arg1);
		arg0.method8887();
		arg0.method8908(false);
		arg0.method8902(false);
		arg0.method8905();
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(I)V")
	public void method7047() {
		this.anInterface14_11.method6754();
	}

	@OriginalMember(owner = "client!qia", name = "c", descriptor = "(Lclient!jca;B)V")
	private void method7048(@OriginalArg(0) Class22_Sub2 arg0) {
		arg0.method8902(true);
		arg0.method8908(true);
		if (arg0.aFloat182 != Static683.aFloat195) {
			arg0.xa(Static683.aFloat195);
		}
	}

	@OriginalMember(owner = "client!qia", name = "b", descriptor = "(Lclient!jca;B)V")
	public void method7049(@OriginalArg(0) Class22_Sub2 arg0) {
		this.anInterface14_11.method6767(24, 786336);
	}

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IZLclient!jca;)V")
	private void method7050(@OriginalArg(0) int arg0, @OriginalArg(2) Class22_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class58_Sub2 local11 = arg1.method8942();
		@Pc(14) float local14 = local11.aFloat120;
		@Pc(17) float local17 = local11.aFloat112;
		@Pc(20) float local20 = local11.aFloat110;
		@Pc(23) float local23 = local11.aFloat117;
		@Pc(26) float local26 = local11.aFloat109;
		@Pc(29) float local29 = local11.aFloat119;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local20 + local29;
		@Pc(46) float local46 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(55) float local55 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(63) float local63 = local26 - local17;
		@Pc(77) float local77 = local29 - local20;
		@Pc(83) Buffer local83 = this.anInterface14_11.method6764();
		if (local83 == null) {
			return;
		}
		@Pc(92) Stream local92 = arg1.method8918(local83);
		@Pc(98) int local98;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(136) Class9_Sub2_Sub1 local136;
		@Pc(139) int local139;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(152) byte local152;
		@Pc(157) byte local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(175) float local175;
		@Pc(180) int local180;
		@Pc(471) float local471;
		@Pc(476) int local476;
		@Pc(416) int local416;
		@Pc(432) Class9_Sub2_Sub1 local432;
		@Pc(435) int local435;
		@Pc(448) byte local448;
		@Pc(453) byte local453;
		@Pc(465) float local465;
		if (Stream.c()) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local116 = this.anIntArray597[local98] > 64 ? 64 : this.anIntArray597[local98];
				if (local116 > 0) {
					for (local125 = local116 - 1; local125 >= 0; local125--) {
						local136 = this.aClass9_Sub2_Sub1ArrayArray3[local98][local125];
						local139 = local136.anInt1780;
						local144 = (byte) (local139 >> 16);
						local149 = (byte) (local139 >> 8);
						local152 = (byte) local139;
						local157 = (byte) (local139 >>> 24);
						local163 = (float) (local136.anInt1777 >> 12);
						local169 = (float) (local136.anInt1772 >> 12);
						local175 = (float) (local136.anInt1776 >> 12);
						local180 = local136.anInt1775 >> 12;
						local92.a((float) -local180 * local33 + local163);
						local92.a(local37 * (float) -local180 + local169);
						local92.a(local175 + local41 * (float) -local180);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.a(0.0F);
						local92.a(0.0F);
						local92.a(local163 + local46 * (float) local180);
						local92.a(local50 * (float) local180 + local169);
						local92.a((float) local180 * local55 + local175);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.a(1.0F);
						local92.a(0.0F);
						local92.a((float) local180 * local33 + local163);
						local92.a((float) local180 * local37 + local169);
						local92.a(local175 + (float) local180 * local41);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.a(1.0F);
						local92.a(1.0F);
						local92.a((float) local180 * local59 + local163);
						local92.a(local63 * (float) local180 + local169);
						local92.a(local175 + (float) local180 * local77);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.a(0.0F);
						local7++;
						local92.a(1.0F);
					}
					if (this.anIntArray597[local98] > 64) {
						local416 = this.anIntArray597[local98] - 64 - 1;
						for (local139 = this.anIntArray595[local416] - 1; local139 >= 0; local139--) {
							local432 = this.aClass9_Sub2_Sub1ArrayArray4[local416][local139];
							local435 = local432.anInt1780;
							local152 = (byte) (local435 >> 16);
							local157 = (byte) (local435 >> 8);
							local448 = (byte) local435;
							local453 = (byte) (local435 >>> 24);
							local175 = (float) (local432.anInt1777 >> 12);
							local465 = (float) (local432.anInt1772 >> 12);
							local471 = (float) (local432.anInt1776 >> 12);
							local476 = local432.anInt1775 >> 12;
							local92.a(local175 + (float) -local476 * local33);
							local92.a((float) -local476 * local37 + local465);
							local92.a(local471 + local41 * (float) -local476);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.a(0.0F);
							local92.a(0.0F);
							local92.a((float) local476 * local46 + local175);
							local92.a(local465 + (float) local476 * local50);
							local92.a((float) local476 * local55 + local471);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.a(1.0F);
							local92.a(0.0F);
							local92.a(local33 * (float) local476 + local175);
							local92.a(local465 + local37 * (float) local476);
							local92.a(local471 + local41 * (float) local476);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.a(1.0F);
							local92.a(1.0F);
							local92.a(local175 + (float) local476 * local59);
							local92.a(local465 + (float) local476 * local63);
							local92.a((float) local476 * local77 + local471);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.a(0.0F);
							local92.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local116 = this.anIntArray597[local98] > 64 ? 64 : this.anIntArray597[local98];
				if (local116 > 0) {
					for (local125 = local116 - 1; local125 >= 0; local125--) {
						local136 = this.aClass9_Sub2_Sub1ArrayArray3[local98][local125];
						local139 = local136.anInt1780;
						local144 = (byte) (local139 >> 16);
						local149 = (byte) (local139 >> 8);
						local152 = (byte) local139;
						local157 = (byte) (local139 >>> 24);
						local163 = (float) (local136.anInt1777 >> 12);
						local169 = (float) (local136.anInt1772 >> 12);
						local175 = (float) (local136.anInt1776 >> 12);
						local180 = local136.anInt1775 >> 12;
						local92.b(local33 * (float) -local180 + local163);
						local92.b((float) -local180 * local37 + local169);
						local92.b(local175 + local41 * (float) -local180);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.b(0.0F);
						local92.b(0.0F);
						local92.b(local46 * (float) local180 + local163);
						local92.b((float) local180 * local50 + local169);
						local92.b((float) local180 * local55 + local175);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.b(1.0F);
						local92.b(0.0F);
						local92.b(local163 + (float) local180 * local33);
						local92.b(local169 + local37 * (float) local180);
						local92.b(local175 + local41 * (float) local180);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.b(1.0F);
						local92.b(1.0F);
						local92.b(local59 * (float) local180 + local163);
						local92.b(local169 + (float) local180 * local63);
						local92.b(local175 + local77 * (float) local180);
						if (arg1.anInt10482 == 0) {
							local92.b(local144, local149, local152, local157);
						} else {
							local92.a(local144, local149, local152, local157);
						}
						local92.b(0.0F);
						local7++;
						local92.b(1.0F);
					}
					if (this.anIntArray597[local98] > 64) {
						local416 = this.anIntArray597[local98] - 64 - 1;
						for (local139 = this.anIntArray595[local416] - 1; local139 >= 0; local139--) {
							local432 = this.aClass9_Sub2_Sub1ArrayArray4[local416][local139];
							local435 = local432.anInt1780;
							local152 = (byte) (local435 >> 16);
							local157 = (byte) (local435 >> 8);
							local448 = (byte) local435;
							local453 = (byte) (local435 >>> 24);
							local175 = (float) (local432.anInt1777 >> 12);
							local465 = (float) (local432.anInt1772 >> 12);
							local471 = (float) (local432.anInt1776 >> 12);
							local476 = local432.anInt1775 >> 12;
							local92.b((float) -local476 * local33 + local175);
							local92.b(local465 + (float) -local476 * local37);
							local92.b(local471 + local41 * (float) -local476);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.b(0.0F);
							local92.b(0.0F);
							local92.b(local175 + local46 * (float) local476);
							local92.b(local465 + (float) local476 * local50);
							local92.b(local471 + (float) local476 * local55);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.b(1.0F);
							local92.b(0.0F);
							local92.b(local33 * (float) local476 + local175);
							local92.b(local465 + local37 * (float) local476);
							local92.b(local471 + local41 * (float) local476);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.b(1.0F);
							local92.b(1.0F);
							local92.b(local59 * (float) local476 + local175);
							local92.b(local465 + local63 * (float) local476);
							local92.b((float) local476 * local77 + local471);
							if (arg1.anInt10482 == 0) {
								local92.b(local152, local157, local448, local453);
							} else {
								local92.a(local152, local157, local448, local453);
							}
							local92.b(0.0F);
							local7++;
							local92.b(1.0F);
						}
					}
				}
			}
		}
		local92.b();
		if (this.anInterface14_11.method6766()) {
			arg1.method8912(this.anInterface14_11, 0);
			arg1.method8912(this.anInterface14_10, 1);
			arg1.method8894(this.aClass36_9);
			arg1.method8861(Static492.aClass234_6, 0, local7 * 2, local7 * 4, 0, this.anInterface11_6);
		}
	}
}
