import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class278 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "[[Lclient!fm;")
	private final Class98_Sub1_Sub1[][] aClass98_Sub1_Sub1ArrayArray3 = new Class98_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "[I")
	private final int[] anIntArray545 = new int[8191];

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "[I")
	private final int[] anIntArray544 = new int[64];

	@OriginalMember(owner = "client!qu", name = "i", descriptor = "[I")
	private final int[] anIntArray546 = new int[1600];

	@OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
	private int anInt7547 = 0;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "[[Lclient!fm;")
	private final Class98_Sub1_Sub1[][] aClass98_Sub1_Sub1ArrayArray4 = new Class98_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!qu", name = "s", descriptor = "Lclient!bf;")
	private final Class28 aClass28_14;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "Lclient!ii;")
	private final Interface13 anInterface13_11;

	@OriginalMember(owner = "client!qu", name = "l", descriptor = "Lclient!ii;")
	private final Interface13 anInterface13_12;

	@OriginalMember(owner = "client!qu", name = "f", descriptor = "Lclient!vl;")
	private final Interface23 anInterface23_5;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(Lclient!kea;)V")
	public Class278(@OriginalArg(0) Class14_Sub2 arg0) {
		this.aClass28_14 = arg0.method7000(new Class231[] { new Class231(new Class210[] { Static321.aClass210_1, Static321.aClass210_3, Static321.aClass210_5 }), new Class231(Static321.aClass210_2) });
		this.anInterface13_11 = arg0.method7004(true);
		this.anInterface13_12 = arg0.method7004(false);
		this.anInterface13_12.method1884(12, 393168);
		this.anInterface23_5 = arg0.method7005(false);
		this.anInterface23_5.method4092(49146);
		@Pc(98) Buffer local98 = this.anInterface23_5.method4095();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6939(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
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
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
				}
			}
			local105.c();
			this.anInterface23_5.method4094();
		}
		@Pc(200) Buffer local200 = this.anInterface13_12.method4095();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6939(local200);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
					local207.a(0.0F);
					local207.a(-1.0F);
					local207.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
					local207.b(0.0F);
					local207.b(-1.0F);
					local207.b(0.0F);
				}
			}
			local207.c();
			this.anInterface13_12.method4094();
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZLclient!kea;)V")
	private void method6209(@OriginalArg(0) int arg0, @OriginalArg(2) Class14_Sub2 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class54_Sub3 local11 = arg1.method7022();
		@Pc(14) float local14 = local11.aFloat144;
		@Pc(17) float local17 = local11.aFloat143;
		@Pc(20) float local20 = local11.aFloat147;
		@Pc(23) float local23 = local11.aFloat151;
		@Pc(26) float local26 = local11.aFloat152;
		@Pc(29) float local29 = local11.aFloat153;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local20 + local29;
		@Pc(45) float local45 = local14 - local23;
		@Pc(49) float local49 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(64) float local64 = local26 - local17;
		@Pc(69) float local69 = local29 - local20;
		@Pc(75) Buffer local75 = this.anInterface13_11.method4095();
		if (local75 == null) {
			return;
		}
		@Pc(83) Stream local83 = arg1.method6939(local75);
		@Pc(89) int local89;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(121) Class98_Sub1_Sub1 local121;
		@Pc(124) int local124;
		@Pc(129) byte local129;
		@Pc(134) byte local134;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(148) float local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(165) int local165;
		@Pc(439) float local439;
		@Pc(444) int local444;
		@Pc(384) int local384;
		@Pc(400) Class98_Sub1_Sub1 local400;
		@Pc(403) int local403;
		@Pc(416) byte local416;
		@Pc(421) byte local421;
		@Pc(433) float local433;
		if (Stream.b()) {
			for (local89 = arg0 - 1; local89 >= 0; local89--) {
				local106 = this.anIntArray546[local89] > 64 ? 64 : this.anIntArray546[local89];
				if (local106 > 0) {
					for (local112 = local106 - 1; local112 >= 0; local112--) {
						local121 = this.aClass98_Sub1_Sub1ArrayArray4[local89][local112];
						local124 = local121.anInt9521;
						local129 = (byte) (local124 >> 16);
						local134 = (byte) (local124 >> 8);
						local137 = (byte) local124;
						local142 = (byte) (local124 >>> 24);
						local148 = local121.anInt9517 >> 12;
						local154 = local121.anInt9523 >> 12;
						local160 = local121.anInt9520 >> 12;
						local165 = local121.anInt9516 >> 12;
						local83.a(local148 + local33 * (float) -local165);
						local83.a(local37 * (float) -local165 + local154);
						local83.a(local160 + local41 * (float) -local165);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(0.0F);
						local83.a(0.0F);
						local83.a(local148 + (float) local165 * local45);
						local83.a(local154 + local49 * (float) local165);
						local83.a((float) local165 * local54 + local160);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(1.0F);
						local83.a(0.0F);
						local83.a(local148 + local33 * (float) local165);
						local83.a((float) local165 * local37 + local154);
						local83.a(local41 * (float) local165 + local160);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(1.0F);
						local83.a(1.0F);
						local83.a((float) local165 * local59 + local148);
						local83.a(local154 + (float) local165 * local64);
						local83.a(local160 + (float) local165 * local69);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(0.0F);
						local7++;
						local83.a(1.0F);
					}
					if (this.anIntArray546[local89] > 64) {
						local384 = this.anIntArray546[local89] - 65;
						for (local124 = this.anIntArray544[local384] - 1; local124 >= 0; local124--) {
							local400 = this.aClass98_Sub1_Sub1ArrayArray3[local384][local124];
							local403 = local400.anInt9521;
							local137 = (byte) (local403 >> 16);
							local142 = (byte) (local403 >> 8);
							local416 = (byte) local403;
							local421 = (byte) (local403 >>> 24);
							local160 = local400.anInt9517 >> 12;
							local433 = local400.anInt9523 >> 12;
							local439 = local400.anInt9520 >> 12;
							local444 = local400.anInt9516 >> 12;
							local83.a((float) -local444 * local33 + local160);
							local83.a(local37 * (float) -local444 + local433);
							local83.a((float) -local444 * local41 + local439);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.a(0.0F);
							local83.a(0.0F);
							local83.a(local45 * (float) local444 + local160);
							local83.a(local433 + (float) local444 * local49);
							local83.a(local54 * (float) local444 + local439);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.a(1.0F);
							local83.a(0.0F);
							local83.a(local160 + local33 * (float) local444);
							local83.a((float) local444 * local37 + local433);
							local83.a((float) local444 * local41 + local439);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.a(1.0F);
							local83.a(1.0F);
							local83.a(local59 * (float) local444 + local160);
							local83.a(local64 * (float) local444 + local433);
							local83.a(local439 + local69 * (float) local444);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.a(0.0F);
							local83.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local89 = arg0 - 1; local89 >= 0; local89--) {
				local106 = this.anIntArray546[local89] <= 64 ? this.anIntArray546[local89] : 64;
				if (local106 > 0) {
					for (local112 = local106 - 1; local112 >= 0; local112--) {
						local121 = this.aClass98_Sub1_Sub1ArrayArray4[local89][local112];
						local124 = local121.anInt9521;
						local129 = (byte) (local124 >> 16);
						local134 = (byte) (local124 >> 8);
						local137 = (byte) local124;
						local142 = (byte) (local124 >>> 24);
						local148 = local121.anInt9517 >> 12;
						local154 = local121.anInt9523 >> 12;
						local160 = local121.anInt9520 >> 12;
						local165 = local121.anInt9516 >> 12;
						local83.b(local148 + local33 * (float) -local165);
						local83.b(local154 + local37 * (float) -local165);
						local83.b((float) -local165 * local41 + local160);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(0.0F);
						local83.b(0.0F);
						local83.b(local148 + (float) local165 * local45);
						local83.b(local154 + local49 * (float) local165);
						local83.b(local160 + (float) local165 * local54);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(1.0F);
						local83.b(0.0F);
						local83.b(local33 * (float) local165 + local148);
						local83.b(local154 + (float) local165 * local37);
						local83.b(local160 + local41 * (float) local165);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(1.0F);
						local83.b(1.0F);
						local83.b(local59 * (float) local165 + local148);
						local83.b(local154 + (float) local165 * local64);
						local83.b(local160 + (float) local165 * local69);
						if (arg1.anInt8602 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(0.0F);
						local83.b(1.0F);
						local7++;
					}
					if (this.anIntArray546[local89] > 64) {
						local384 = this.anIntArray546[local89] - 64 - 1;
						for (local124 = this.anIntArray544[local384] - 1; local124 >= 0; local124--) {
							local400 = this.aClass98_Sub1_Sub1ArrayArray3[local384][local124];
							local403 = local400.anInt9521;
							local137 = (byte) (local403 >> 16);
							local142 = (byte) (local403 >> 8);
							local416 = (byte) local403;
							local421 = (byte) (local403 >>> 24);
							local160 = local400.anInt9517 >> 12;
							local433 = local400.anInt9523 >> 12;
							local439 = local400.anInt9520 >> 12;
							local444 = local400.anInt9516 >> 12;
							local83.b((float) -local444 * local33 + local160);
							local83.b((float) -local444 * local37 + local433);
							local83.b(local439 + local41 * (float) -local444);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.b(0.0F);
							local83.b(0.0F);
							local83.b(local160 + (float) local444 * local45);
							local83.b(local433 + local49 * (float) local444);
							local83.b(local54 * (float) local444 + local439);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.b(1.0F);
							local83.b(0.0F);
							local83.b(local160 + (float) local444 * local33);
							local83.b(local37 * (float) local444 + local433);
							local83.b((float) local444 * local41 + local439);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.b(1.0F);
							local83.b(1.0F);
							local83.b(local160 + local59 * (float) local444);
							local83.b(local64 * (float) local444 + local433);
							local83.b(local439 + (float) local444 * local69);
							if (arg1.anInt8602 == 0) {
								local83.a(local137, local142, local416, local421);
							} else {
								local83.b(local137, local142, local416, local421);
							}
							local83.b(0.0F);
							local7++;
							local83.b(1.0F);
						}
					}
				}
			}
		}
		local83.c();
		if (this.anInterface13_11.method4094()) {
			arg1.method6994(0, this.anInterface13_11);
			arg1.method6994(1, this.anInterface13_12);
			arg1.method6944(this.aClass28_14);
			arg1.method7026(0, 0, local7 * 4, local7 * 2, Static181.aClass311_4, this.anInterface23_5);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!kea;)V")
	public void method6210(@OriginalArg(1) Class14_Sub2 arg0) {
		this.anInterface13_11.method1884(24, 786336);
	}

	@OriginalMember(owner = "client!qu", name = "b", descriptor = "(I)V")
	public void method6212() {
		this.anInterface13_11.method4091();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!kea;Z)V")
	private void method6214(@OriginalArg(0) Class14_Sub2 arg0) {
		arg0.method6906(true);
		arg0.method6925(true);
		if (arg0.aFloat176 != Static243.aFloat114) {
			arg0.ha(Static243.aFloat114);
		}
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILclient!kea;Lclient!ig;)V")
	public void method6215(@OriginalArg(1) Class14_Sub2 arg0, @OriginalArg(2) Class144 arg1) {
		if (arg0.aClass54_Sub3_16 == null) {
			return;
		}
		this.method6216(arg0);
		@Pc(17) float local17 = arg0.aClass54_Sub3_16.aFloat146;
		@Pc(21) float local21 = arg0.aClass54_Sub3_16.aFloat150;
		@Pc(25) float local25 = arg0.aClass54_Sub3_16.aFloat148;
		@Pc(35) float local35 = arg0.aClass54_Sub3_16.aFloat154;
		try {
			@Pc(45) int local45;
			@Pc(55) int local55;
			@Pc(80) Class98_Sub1 local80;
			@Pc(93) int local93;
			@Pc(251) Class98_Sub1_Sub1[] local251;
			@Pc(183) int local183;
			@Pc(261) int local261;
			@Pc(263) int local263;
			if (arg1.aBoolean288) {
				local45 = arg1.anInt4175 - arg1.anInt4176;
				if (local45 + 2 <= 1600) {
					local45 += 2;
					local55 = 0;
				} else {
					local55 = Static564.method7583(local45) + 1 - Static464.anInt7985;
					local45 = (local45 >> local55) + 2;
				}
				@Pc(77) Class98_Sub1 local77 = arg1.aClass254_1.aClass98_Sub1_7;
				local80 = local77.aClass98_Sub1_10;
				@Pc(82) int local82 = -2;
				@Pc(84) boolean local84 = true;
				@Pc(86) boolean local86 = true;
				while (local80 != local77) {
					this.anInt7547 = 0;
					for (local93 = 0; local93 < local45; local93++) {
						this.anIntArray546[local93] = 0;
					}
					for (@Pc(106) int local106 = 0; local106 < 64; local106++) {
						this.anIntArray544[local106] = 0;
					}
					while (local80 != local77) {
						@Pc(122) Class98_Sub1_Sub1 local122 = (Class98_Sub1_Sub1) local80;
						if (local86) {
							local86 = false;
							local82 = local122.anInt9524;
							local84 = local122.aBoolean730;
						} else if (local82 != local122.anInt9524 || local84 != local122.aBoolean730) {
							local86 = true;
							break;
						}
						local183 = (int) (local35 + local25 * (float) (local122.anInt9520 >> 12) + (float) (local122.anInt9523 >> 12) * local21 + (float) (local122.anInt9517 >> 12) * local17) - arg1.anInt4176 >> local55;
						if (local183 < 1600) {
							if (this.anIntArray546[local183] < 64) {
								this.aClass98_Sub1_Sub1ArrayArray4[local183][this.anIntArray546[local183]++] = local122;
							} else {
								label191: {
									if (this.anIntArray546[local183] == 64) {
										if (this.anInt7547 == 64) {
											break label191;
										}
										this.anIntArray546[local183] += this.anInt7547++ + 1;
									}
									local251 = this.aClass98_Sub1_Sub1ArrayArray3[this.anIntArray546[local183] - 64 - 1];
									local261 = this.anIntArray546[local183] - 64 - 1;
									local263 = this.anIntArray544[this.anIntArray546[local183] - 64 - 1];
									this.anIntArray544[local261] = this.anIntArray544[this.anIntArray546[local183] - 64 - 1] + 1;
									local251[local263] = local122;
								}
							}
						}
						local80 = local80.aClass98_Sub1_10;
					}
					arg0.method6981(false, local82 > 0 ? local82 : -1, false);
					if (local84 && arg0.aFloat176 != Static243.aFloat114) {
						arg0.ha(Static243.aFloat114);
					} else if (arg0.aFloat176 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method6209(local45, arg0);
				}
			} else {
				local45 = 0;
				local55 = Integer.MAX_VALUE;
				@Pc(323) int local323 = 0;
				local80 = arg1.aClass254_1.aClass98_Sub1_7;
				@Pc(330) Class98_Sub1 local330;
				@Pc(362) int local362;
				for (local330 = local80.aClass98_Sub1_10; local330 != local80; local330 = local330.aClass98_Sub1_10) {
					@Pc(335) Class98_Sub1_Sub1 local335 = (Class98_Sub1_Sub1) local330;
					local362 = (int) (local35 + local17 * (float) (local335.anInt9517 >> 12) + local21 * (float) (local335.anInt9523 >> 12) + local25 * (float) (local335.anInt9520 >> 12));
					if (local323 < local362) {
						local323 = local362;
					}
					if (local362 < local55) {
						local55 = local362;
					}
					this.anIntArray545[local45++] = local362;
				}
				@Pc(397) int local397 = local323 - local55;
				if (local397 + 2 > 1600) {
					local362 = Static564.method7583(local397) + 1 - Static464.anInt7985;
					local397 = (local397 >> local362) + 2;
				} else {
					local397 += 2;
					local362 = 0;
				}
				local45 = 0;
				local330 = local80.aClass98_Sub1_10;
				local93 = -2;
				@Pc(433) boolean local433 = true;
				@Pc(435) boolean local435 = true;
				while (local330 != local80) {
					this.anInt7547 = 0;
					for (local183 = 0; local183 < local397; local183++) {
						this.anIntArray546[local183] = 0;
					}
					for (@Pc(459) int local459 = 0; local459 < 64; local459++) {
						this.anIntArray544[local459] = 0;
					}
					while (local330 != local80) {
						@Pc(477) Class98_Sub1_Sub1 local477 = (Class98_Sub1_Sub1) local330;
						if (local435) {
							local435 = false;
							local433 = local477.aBoolean730;
							local93 = local477.anInt9524;
						}
						if (local45 > 0 && (local477.anInt9524 != local93 || local477.aBoolean730 != local433)) {
							local435 = true;
							break;
						}
						@Pc(516) int local516 = this.anIntArray545[local45++] - local55 >> local362;
						if (local516 < 1600) {
							if (this.anIntArray546[local516] >= 64) {
								label141: {
									if (this.anIntArray546[local516] == 64) {
										if (this.anInt7547 == 64) {
											break label141;
										}
										this.anIntArray546[local516] += this.anInt7547++ + 1;
									}
									local251 = this.aClass98_Sub1_Sub1ArrayArray3[this.anIntArray546[local516] - 65];
									local261 = this.anIntArray546[local516] - 1 - 64;
									local263 = this.anIntArray544[this.anIntArray546[local516] - 1 - 64];
									this.anIntArray544[local261] = this.anIntArray544[this.anIntArray546[local516] - 1 - 64] + 1;
									local251[local263] = local477;
								}
							} else {
								this.aClass98_Sub1_Sub1ArrayArray4[local516][this.anIntArray546[local516]++] = local477;
							}
						}
						local330 = local330.aClass98_Sub1_10;
					}
					arg0.method6981(false, local93 < 0 ? -1 : local93, false);
					if (local433 && arg0.aFloat176 != Static243.aFloat114) {
						arg0.ha(Static243.aFloat114);
					} else if (arg0.aFloat176 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method6209(local397, arg0);
				}
			}
		} catch (@Pc(650) Exception local650) {
		}
		this.method6214(arg0);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(BLclient!kea;)V")
	private void method6216(@OriginalArg(1) Class14_Sub2 arg0) {
		Static243.aFloat114 = arg0.aFloat176;
		arg0.method7032();
		arg0.method6925(false);
		arg0.method6906(false);
		arg0.method6980();
	}
}
