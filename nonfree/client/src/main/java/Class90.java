import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class90 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	private int anInt2098 = 0;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "[I")
	private final int[] anIntArray279 = new int[8191];

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "[I")
	private final int[] anIntArray280 = new int[1600];

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "[I")
	private final int[] anIntArray281 = new int[64];

	@OriginalMember(owner = "client!ep", name = "g", descriptor = "[[Lclient!pl;")
	private final Class102_Sub1_Sub1[][] aClass102_Sub1_Sub1ArrayArray3 = new Class102_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "[[Lclient!pl;")
	private final Class102_Sub1_Sub1[][] aClass102_Sub1_Sub1ArrayArray4 = new Class102_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "Lclient!qca;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!vp;")
	private final Interface23 anInterface23_2;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!vp;")
	private final Interface23 anInterface23_3;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "Lclient!go;")
	private final Interface11 anInterface11_4;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class90(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass258_1 = arg0.method7285(new Class228[] { new Class228(new Class248[] { Static389.aClass248_1, Static389.aClass248_3, Static389.aClass248_5 }), new Class228(Static389.aClass248_2) });
		this.anInterface23_2 = arg0.method7201(true);
		this.anInterface23_3 = arg0.method7201(false);
		this.anInterface23_3.method7571(12, 393168);
		this.anInterface11_4 = arg0.method7204(false);
		this.anInterface11_4.method7560(49146);
		@Pc(98) Buffer local98 = this.anInterface11_4.method7569();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7200(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			}
			local105.c();
			this.anInterface11_4.method7563();
		}
		@Pc(198) Buffer local198 = this.anInterface23_3.method7569();
		if (local198 != null) {
			@Pc(205) Stream local205 = arg0.method7200(local198);
			if (Stream.a()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
					local205.b(0.0F);
					local205.b(-1.0F);
					local205.b(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
					local205.a(0.0F);
					local205.a(-1.0F);
					local205.a(0.0F);
				}
			}
			local205.c();
			this.anInterface23_3.method7563();
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLclient!sv;)V")
	private void method1821(@OriginalArg(1) Class121_Sub2 arg0) {
		arg0.method7228(true);
		arg0.method7273(true);
		if (arg0.aFloat199 != Static445.aFloat172) {
			arg0.ha(Static445.aFloat172);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!sv;Z)V")
	public void method1822(@OriginalArg(0) Class121_Sub2 arg0) {
		this.anInterface23_2.method7571(24, 786336);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!sv;I)V")
	private void method1823(@OriginalArg(0) Class121_Sub2 arg0) {
		Static445.aFloat172 = arg0.aFloat199;
		arg0.method7232();
		arg0.method7273(false);
		arg0.method7228(false);
		arg0.method7197();
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!sv;Lclient!ob;)V")
	public void method1824(@OriginalArg(1) Class121_Sub2 arg0, @OriginalArg(2) Class222 arg1) {
		if (arg0.aClass34_Sub3_16 == null) {
			return;
		}
		this.method1823(arg0);
		@Pc(22) float local22 = arg0.aClass34_Sub3_16.aFloat75;
		@Pc(26) float local26 = arg0.aClass34_Sub3_16.aFloat69;
		@Pc(30) float local30 = arg0.aClass34_Sub3_16.aFloat76;
		@Pc(34) float local34 = arg0.aClass34_Sub3_16.aFloat74;
		try {
			@Pc(39) int local39;
			@Pc(41) int local41;
			@Pc(47) Class102_Sub1 local47;
			@Pc(146) int local146;
			@Pc(284) Class102_Sub1_Sub1[] local284;
			@Pc(157) int local157;
			@Pc(294) int local294;
			@Pc(296) int local296;
			if (arg1.aBoolean423) {
				local39 = arg1.anInt6172 - arg1.anInt6171;
				if (local39 + 2 > 1600) {
					local41 = Static154.method2268(local39) + 1 - Static251.anInt4829;
					local39 = (local39 >> local41) + 2;
				} else {
					local39 += 2;
					local41 = 0;
				}
				@Pc(403) Class102_Sub1 local403 = arg1.aClass118_1.aClass102_Sub1_7;
				local47 = local403.aClass102_Sub1_9;
				@Pc(408) int local408 = -2;
				@Pc(410) boolean local410 = true;
				@Pc(412) boolean local412 = true;
				while (local403 != local47) {
					this.anInt2098 = 0;
					for (local146 = 0; local146 < local39; local146++) {
						this.anIntArray280[local146] = 0;
					}
					for (@Pc(432) int local432 = 0; local432 < 64; local432++) {
						this.anIntArray281[local432] = 0;
					}
					while (local47 != local403) {
						@Pc(450) Class102_Sub1_Sub1 local450 = (Class102_Sub1_Sub1) local47;
						if (local412) {
							local410 = local450.aBoolean171;
							local408 = local450.anInt2522;
							local412 = false;
						} else if (local408 != local450.anInt2522 || local450.aBoolean171 != local410) {
							local412 = true;
							break;
						}
						local157 = (int) ((float) (local450.anInt2518 >> 12) * local30 + (float) (local450.anInt2521 >> 12) * local26 + local22 * (float) (local450.anInt2516 >> 12) + local34) - arg1.anInt6171 >> local41;
						if (local157 < 1600) {
							if (this.anIntArray280[local157] >= 64) {
								label145: {
									if (this.anIntArray280[local157] == 64) {
										if (this.anInt2098 == 64) {
											break label145;
										}
										this.anIntArray280[local157] += this.anInt2098++ + 1;
									}
									local284 = this.aClass102_Sub1_Sub1ArrayArray3[this.anIntArray280[local157] - 64 - 1];
									local294 = this.anIntArray280[local157] - 65;
									local296 = this.anIntArray281[this.anIntArray280[local157] - 65];
									this.anIntArray281[local294] = this.anIntArray281[this.anIntArray280[local157] - 65] + 1;
									local284[local296] = local450;
								}
							} else {
								this.aClass102_Sub1_Sub1ArrayArray4[local157][this.anIntArray280[local157]++] = local450;
							}
						}
						local47 = local47.aClass102_Sub1_9;
					}
					arg0.method7290(local408 > 0 ? local408 : -1, false, false);
					if (local410 && arg0.aFloat199 != Static445.aFloat172) {
						arg0.ha(Static445.aFloat172);
					} else if (arg0.aFloat199 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method1825(arg0, local39);
				}
			} else {
				local39 = 0;
				local41 = Integer.MAX_VALUE;
				@Pc(43) int local43 = 0;
				local47 = arg1.aClass118_1.aClass102_Sub1_7;
				@Pc(50) Class102_Sub1 local50;
				@Pc(82) int local82;
				for (local50 = local47.aClass102_Sub1_9; local50 != local47; local50 = local50.aClass102_Sub1_9) {
					@Pc(55) Class102_Sub1_Sub1 local55 = (Class102_Sub1_Sub1) local50;
					local82 = (int) (local34 + local30 * (float) (local55.anInt2518 >> 12) + local26 * (float) (local55.anInt2521 >> 12) + (float) (local55.anInt2516 >> 12) * local22);
					if (local43 < local82) {
						local43 = local82;
					}
					if (local82 < local41) {
						local41 = local82;
					}
					this.anIntArray279[local39++] = local82;
				}
				@Pc(113) int local113 = local43 - local41;
				if (local113 + 2 <= 1600) {
					local82 = 0;
					local113 += 2;
				} else {
					local82 = Static154.method2268(local113) + 1 - Static251.anInt4829;
					local113 = (local113 >> local82) + 2;
				}
				local50 = local47.aClass102_Sub1_9;
				local39 = 0;
				local146 = -2;
				@Pc(148) boolean local148 = true;
				@Pc(150) boolean local150 = true;
				while (local47 != local50) {
					this.anInt2098 = 0;
					for (local157 = 0; local157 < local113; local157++) {
						this.anIntArray280[local157] = 0;
					}
					for (@Pc(170) int local170 = 0; local170 < 64; local170++) {
						this.anIntArray281[local170] = 0;
					}
					while (local50 != local47) {
						@Pc(186) Class102_Sub1_Sub1 local186 = (Class102_Sub1_Sub1) local50;
						if (local150) {
							local150 = false;
							local146 = local186.anInt2522;
							local148 = local186.aBoolean171;
						}
						if (local39 > 0 && (local186.anInt2522 != local146 || local148 != local186.aBoolean171)) {
							local150 = true;
							break;
						}
						@Pc(231) int local231 = this.anIntArray279[local39++] - local41 >> local82;
						if (local231 < 1600) {
							if (this.anIntArray280[local231] >= 64) {
								label190: {
									if (this.anIntArray280[local231] == 64) {
										if (this.anInt2098 == 64) {
											break label190;
										}
										this.anIntArray280[local231] += this.anInt2098++ + 1;
									}
									local284 = this.aClass102_Sub1_Sub1ArrayArray3[this.anIntArray280[local231] - 64 - 1];
									local294 = this.anIntArray280[local231] - 1 - 64;
									local296 = this.anIntArray281[this.anIntArray280[local231] - 1 - 64];
									this.anIntArray281[local294] = this.anIntArray281[this.anIntArray280[local231] - 1 - 64] + 1;
									local284[local296] = local186;
								}
							} else {
								this.aClass102_Sub1_Sub1ArrayArray4[local231][this.anIntArray280[local231]++] = local186;
							}
						}
						local50 = local50.aClass102_Sub1_9;
					}
					arg0.method7290(local146 >= 0 ? local146 : -1, false, false);
					if (local148 && arg0.aFloat199 != Static445.aFloat172) {
						arg0.ha(Static445.aFloat172);
					} else if (arg0.aFloat199 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method1825(arg0, local113);
				}
			}
		} catch (@Pc(641) Exception local641) {
		}
		this.method1821(arg0);
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!sv;I)V")
	private void method1825(@OriginalArg(1) Class121_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class34_Sub3 local11 = arg0.method7189();
		@Pc(14) float local14 = local11.aFloat77;
		@Pc(17) float local17 = local11.aFloat80;
		@Pc(20) float local20 = local11.aFloat71;
		@Pc(23) float local23 = local11.aFloat81;
		@Pc(26) float local26 = local11.aFloat78;
		@Pc(29) float local29 = local11.aFloat72;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(51) float local51 = local17 - local26;
		@Pc(56) float local56 = local20 - local29;
		@Pc(61) float local61 = local23 - local14;
		@Pc(65) float local65 = local26 - local17;
		@Pc(69) float local69 = local29 - local20;
		@Pc(75) Buffer local75 = this.anInterface23_2.method7569();
		if (local75 == null) {
			return;
		}
		@Pc(83) Stream local83 = arg0.method7200(local75);
		@Pc(89) int local89;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(121) Class102_Sub1_Sub1 local121;
		@Pc(124) int local124;
		@Pc(129) byte local129;
		@Pc(134) byte local134;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(148) float local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(165) int local165;
		@Pc(433) float local433;
		@Pc(438) int local438;
		@Pc(378) int local378;
		@Pc(394) Class102_Sub1_Sub1 local394;
		@Pc(397) int local397;
		@Pc(410) byte local410;
		@Pc(415) byte local415;
		@Pc(427) float local427;
		if (Stream.a()) {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local106 = this.anIntArray280[local89] <= 64 ? this.anIntArray280[local89] : 64;
				if (local106 > 0) {
					for (local112 = local106 - 1; local112 >= 0; local112--) {
						local121 = this.aClass102_Sub1_Sub1ArrayArray4[local89][local112];
						local124 = local121.anInt2519;
						local129 = (byte) (local124 >> 16);
						local134 = (byte) (local124 >> 8);
						local137 = (byte) local124;
						local142 = (byte) (local124 >>> 24);
						local148 = local121.anInt2516 >> 12;
						local154 = local121.anInt2521 >> 12;
						local160 = local121.anInt2518 >> 12;
						local165 = local121.anInt2520 >> 12;
						local83.b(local148 + local33 * (float) -local165);
						local83.b((float) -local165 * local37 + local154);
						local83.b(local160 + local41 * (float) -local165);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(0.0F);
						local83.b(0.0F);
						local83.b(local148 + local46 * (float) local165);
						local83.b(local154 + local51 * (float) local165);
						local83.b(local160 + (float) local165 * local56);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(1.0F);
						local83.b(0.0F);
						local83.b(local148 + local33 * (float) local165);
						local83.b((float) local165 * local37 + local154);
						local83.b(local41 * (float) local165 + local160);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(1.0F);
						local83.b(1.0F);
						local83.b((float) local165 * local61 + local148);
						local83.b(local65 * (float) local165 + local154);
						local83.b(local69 * (float) local165 + local160);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.b(0.0F);
						local83.b(1.0F);
						local7++;
					}
					if (this.anIntArray280[local89] > 64) {
						local378 = this.anIntArray280[local89] - 64 - 1;
						for (local124 = this.anIntArray281[local378] - 1; local124 >= 0; local124--) {
							local394 = this.aClass102_Sub1_Sub1ArrayArray3[local378][local124];
							local397 = local394.anInt2519;
							local137 = (byte) (local397 >> 16);
							local142 = (byte) (local397 >> 8);
							local410 = (byte) local397;
							local415 = (byte) (local397 >>> 24);
							local160 = local394.anInt2516 >> 12;
							local427 = local394.anInt2521 >> 12;
							local433 = local394.anInt2518 >> 12;
							local438 = local394.anInt2520 >> 12;
							local83.b((float) -local438 * local33 + local160);
							local83.b(local37 * (float) -local438 + local427);
							local83.b(local41 * (float) -local438 + local433);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.b(0.0F);
							local83.b(0.0F);
							local83.b(local160 + local46 * (float) local438);
							local83.b(local427 + local51 * (float) local438);
							local83.b(local56 * (float) local438 + local433);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.b(1.0F);
							local83.b(0.0F);
							local83.b(local33 * (float) local438 + local160);
							local83.b(local427 + local37 * (float) local438);
							local83.b(local433 + (float) local438 * local41);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.b(1.0F);
							local83.b(1.0F);
							local83.b(local160 + local61 * (float) local438);
							local83.b(local427 + (float) local438 * local65);
							local83.b((float) local438 * local69 + local433);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.b(0.0F);
							local83.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local89 = arg1 - 1; local89 >= 0; local89--) {
				local106 = this.anIntArray280[local89] > 64 ? 64 : this.anIntArray280[local89];
				if (local106 > 0) {
					for (local112 = local106 - 1; local112 >= 0; local112--) {
						local121 = this.aClass102_Sub1_Sub1ArrayArray4[local89][local112];
						local124 = local121.anInt2519;
						local129 = (byte) (local124 >> 16);
						local134 = (byte) (local124 >> 8);
						local137 = (byte) local124;
						local142 = (byte) (local124 >>> 24);
						local148 = local121.anInt2516 >> 12;
						local154 = local121.anInt2521 >> 12;
						local160 = local121.anInt2518 >> 12;
						local165 = local121.anInt2520 >> 12;
						local83.a(local148 + (float) -local165 * local33);
						local83.a(local37 * (float) -local165 + local154);
						local83.a((float) -local165 * local41 + local160);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(0.0F);
						local83.a(0.0F);
						local83.a((float) local165 * local46 + local148);
						local83.a(local154 + (float) local165 * local51);
						local83.a(local160 + (float) local165 * local56);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(1.0F);
						local83.a(0.0F);
						local83.a((float) local165 * local33 + local148);
						local83.a((float) local165 * local37 + local154);
						local83.a(local160 + (float) local165 * local41);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(1.0F);
						local83.a(1.0F);
						local83.a(local61 * (float) local165 + local148);
						local83.a(local154 + local65 * (float) local165);
						local83.a((float) local165 * local69 + local160);
						if (arg0.anInt8923 == 0) {
							local83.a(local129, local134, local137, local142);
						} else {
							local83.b(local129, local134, local137, local142);
						}
						local83.a(0.0F);
						local83.a(1.0F);
						local7++;
					}
					if (this.anIntArray280[local89] > 64) {
						local378 = this.anIntArray280[local89] - 64 - 1;
						for (local124 = this.anIntArray281[local378] - 1; local124 >= 0; local124--) {
							local394 = this.aClass102_Sub1_Sub1ArrayArray3[local378][local124];
							local397 = local394.anInt2519;
							local137 = (byte) (local397 >> 16);
							local142 = (byte) (local397 >> 8);
							local410 = (byte) local397;
							local415 = (byte) (local397 >>> 24);
							local160 = local394.anInt2516 >> 12;
							local427 = local394.anInt2521 >> 12;
							local433 = local394.anInt2518 >> 12;
							local438 = local394.anInt2520 >> 12;
							local83.a(local33 * (float) -local438 + local160);
							local83.a(local427 + (float) -local438 * local37);
							local83.a(local433 + local41 * (float) -local438);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.a(0.0F);
							local83.a(0.0F);
							local83.a(local160 + (float) local438 * local46);
							local83.a(local51 * (float) local438 + local427);
							local83.a(local56 * (float) local438 + local433);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.a(1.0F);
							local83.a(0.0F);
							local83.a((float) local438 * local33 + local160);
							local83.a((float) local438 * local37 + local427);
							local83.a(local41 * (float) local438 + local433);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.a(1.0F);
							local83.a(1.0F);
							local83.a((float) local438 * local61 + local160);
							local83.a(local65 * (float) local438 + local427);
							local83.a(local433 + (float) local438 * local69);
							if (arg0.anInt8923 == 0) {
								local83.a(local137, local142, local410, local415);
							} else {
								local83.b(local137, local142, local410, local415);
							}
							local83.a(0.0F);
							local83.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local83.c();
		if (this.anInterface23_2.method7563()) {
			arg0.method7297(0, this.anInterface23_2);
			arg0.method7297(1, this.anInterface23_3);
			arg0.method7263(this.aClass258_1);
			arg0.method7239(0, local7 * 4, this.anInterface11_4, local7 * 2, Static503.aClass107_2, 0);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
	public void method1826() {
		this.anInterface23_2.method7567();
	}
}
