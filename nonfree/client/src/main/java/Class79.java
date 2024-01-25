import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public final class Class79 {

	@OriginalMember(owner = "client!et", name = "a", descriptor = "[I")
	private final int[] anIntArray302 = new int[1600];

	@OriginalMember(owner = "client!et", name = "j", descriptor = "[[Lclient!gda;")
	private final Class6_Sub1_Sub2[][] aClass6_Sub1_Sub2ArrayArray3 = new Class6_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!et", name = "k", descriptor = "[[Lclient!gda;")
	private final Class6_Sub1_Sub2[][] aClass6_Sub1_Sub2ArrayArray4 = new Class6_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!et", name = "l", descriptor = "[I")
	private final int[] anIntArray304 = new int[64];

	@OriginalMember(owner = "client!et", name = "c", descriptor = "I")
	private int anInt2327 = 0;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "[I")
	private final int[] anIntArray303 = new int[8191];

	@OriginalMember(owner = "client!et", name = "e", descriptor = "Lclient!tq;")
	private final Interface19 anInterface19_2;

	@OriginalMember(owner = "client!et", name = "b", descriptor = "Lclient!vs;")
	private final Class304 aClass304_3;

	@OriginalMember(owner = "client!et", name = "p", descriptor = "Lclient!g;")
	private final Interface7 anInterface7_1;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class79(@OriginalArg(0) Class39_Sub2 arg0) {
		this.anInterface19_2 = arg0.method6100(true);
		this.aClass304_3 = arg0.method6090(new Class287[] { new Class287(new Class154[] { Static241.aClass154_1, Static241.aClass154_3, Static241.aClass154_5 }) });
		this.anInterface7_1 = arg0.method6204(false);
		this.anInterface7_1.method6949(49146);
		@Pc(78) Buffer local78 = this.anInterface7_1.method6952();
		if (local78 != null) {
			@Pc(85) Stream local85 = arg0.method6195(local78);
			@Pc(89) int local89;
			@Pc(95) int local95;
			if (Stream.a()) {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.f(local95);
					local85.f(local95 + 1);
					local85.f(local95 + 2);
					local85.f(local95 + 2);
					local85.f(local95 + 3);
					local85.f(local95);
				}
			} else {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.e(local95);
					local85.e(local95 + 1);
					local85.e(local95 + 2);
					local85.e(local95 + 2);
					local85.e(local95 + 3);
					local85.e(local95);
				}
			}
			local85.c();
			this.anInterface7_1.method6954();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	public void method2241() {
		this.anInterface19_2.method6953();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BLclient!oaa;Lclient!kw;)V")
	public void method2242(@OriginalArg(1) Class208 arg0, @OriginalArg(2) Class39_Sub2 arg1) {
		if (arg1.aClass181_Sub2_16 == null) {
			return;
		}
		this.method2244(arg1);
		@Pc(17) float local17 = arg1.aClass181_Sub2_16.aFloat133;
		@Pc(21) float local21 = arg1.aClass181_Sub2_16.aFloat129;
		@Pc(25) float local25 = arg1.aClass181_Sub2_16.aFloat134;
		@Pc(29) float local29 = arg1.aClass181_Sub2_16.aFloat138;
		try {
			@Pc(38) int local38;
			@Pc(46) int local46;
			@Pc(69) Class6_Sub1 local69;
			@Pc(82) int local82;
			@Pc(169) int local169;
			if (arg0.aBoolean470) {
				local38 = arg0.anInt6255 - arg0.anInt6256;
				if (local38 + 2 <= 1600) {
					local38 += 2;
					local46 = 0;
				} else {
					local46 = Static451.method6881(local38) + 1 - Static435.anInt7950;
					local38 = (local38 >> local46) + 2;
				}
				@Pc(66) Class6_Sub1 local66 = arg0.aClass210_1.aClass6_Sub1_7;
				local69 = local66.aClass6_Sub1_9;
				@Pc(71) int local71 = -2;
				@Pc(73) boolean local73 = true;
				@Pc(75) boolean local75 = true;
				while (local69 != local66) {
					this.anInt2327 = 0;
					for (local82 = 0; local82 < local38; local82++) {
						this.anIntArray302[local82] = 0;
					}
					for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
						this.anIntArray304[local99] = 0;
					}
					while (local66 != local69) {
						@Pc(115) Class6_Sub1_Sub2 local115 = (Class6_Sub1_Sub2) local69;
						if (local75) {
							local75 = false;
							local73 = local115.aBoolean597;
							local71 = local115.anInt8127;
						} else if (local115.anInt8127 != local71 || local73 != local115.aBoolean597) {
							local75 = true;
							break;
						}
						local169 = (int) (local29 + (float) (local115.anInt8124 >> 12) * local25 + local21 * (float) (local115.anInt8129 >> 12) + (float) (local115.anInt8123 >> 12) * local17) - arg0.anInt6256 >> local46;
						if (local169 < 1600) {
							if (this.anIntArray302[local169] >= 64) {
								label187: {
									if (this.anIntArray302[local169] == 64) {
										if (this.anInt2327 == 64) {
											break label187;
										}
										this.anIntArray302[local169] += this.anInt2327++ + 1;
									}
									@Pc(222) Class6_Sub1_Sub2[] local222 = this.aClass6_Sub1_Sub2ArrayArray3[this.anIntArray302[local169] - 65];
									@Pc(230) int local230 = this.anIntArray302[local169] - 65;
									@Pc(232) int local232 = this.anIntArray304[this.anIntArray302[local169] - 65];
									this.anIntArray304[local230] = this.anIntArray304[this.anIntArray302[local169] - 65] + 1;
									local222[local232] = local115;
								}
							} else {
								this.aClass6_Sub1_Sub2ArrayArray4[local169][this.anIntArray302[local169]++] = local115;
							}
						}
						local69 = local69.aClass6_Sub1_9;
					}
					arg1.method6208(false, local71 < 0 ? -1 : local71, false);
					if (local73 && Static262.aFloat184 != arg1.aFloat189) {
						arg1.M(Static262.aFloat184);
					} else if (arg1.aFloat189 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method2247(arg1, local38);
				}
			} else {
				local38 = 0;
				local46 = Integer.MAX_VALUE;
				@Pc(310) int local310 = 0;
				local69 = arg0.aClass210_1.aClass6_Sub1_7;
				@Pc(317) Class6_Sub1 local317;
				@Pc(349) int local349;
				for (local317 = local69.aClass6_Sub1_9; local317 != local69; local317 = local317.aClass6_Sub1_9) {
					@Pc(322) Class6_Sub1_Sub2 local322 = (Class6_Sub1_Sub2) local317;
					local349 = (int) (local29 + local21 * (float) (local322.anInt8129 >> 12) + local17 * (float) (local322.anInt8123 >> 12) + (float) (local322.anInt8124 >> 12) * local25);
					this.anIntArray303[local38++] = local349;
					if (local349 < local46) {
						local46 = local349;
					}
					if (local310 < local349) {
						local310 = local349;
					}
				}
				@Pc(380) int local380 = local310 - local46;
				if (local380 + 2 > 1600) {
					local349 = Static451.method6881(local380) + 1 - Static435.anInt7950;
					local380 = (local380 >> local349) + 2;
				} else {
					local349 = 0;
					local380 += 2;
				}
				local38 = 0;
				local317 = local69.aClass6_Sub1_9;
				local82 = -2;
				@Pc(414) boolean local414 = true;
				@Pc(416) boolean local416 = true;
				while (local317 != local69) {
					this.anInt2327 = 0;
					for (local169 = 0; local169 < local380; local169++) {
						this.anIntArray302[local169] = 0;
					}
					for (@Pc(440) int local440 = 0; local440 < 64; local440++) {
						this.anIntArray304[local440] = 0;
					}
					while (local69 != local317) {
						@Pc(458) Class6_Sub1_Sub2 local458 = (Class6_Sub1_Sub2) local317;
						if (local416) {
							local82 = local458.anInt8127;
							local414 = local458.aBoolean597;
							local416 = false;
						}
						if (local38 > 0 && (local458.anInt8127 != local82 || local458.aBoolean597 != local414)) {
							local416 = true;
							break;
						}
						@Pc(500) int local500 = this.anIntArray303[local38++] - local46 >> local349;
						if (local500 < 1600) {
							if (this.anIntArray302[local500] < 64) {
								this.aClass6_Sub1_Sub2ArrayArray4[local500][this.anIntArray302[local500]++] = local458;
							} else {
								label138: {
									if (this.anIntArray302[local500] == 64) {
										if (this.anInt2327 == 64) {
											break label138;
										}
										this.anIntArray302[local500] += this.anInt2327++ + 1;
									}
									this.aClass6_Sub1_Sub2ArrayArray3[this.anIntArray302[local500] - 64 - 1][this.anIntArray304[this.anIntArray302[local500] - 64 - 1]++] = local458;
								}
							}
						}
						local317 = local317.aClass6_Sub1_9;
					}
					arg1.method6208(false, local82 >= 0 ? local82 : -1, false);
					if (local414 && Static262.aFloat184 != arg1.aFloat189) {
						arg1.M(Static262.aFloat184);
					} else if (arg1.aFloat189 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method2247(arg1, local380);
				}
			}
		} catch (@Pc(630) Exception local630) {
		}
		this.method2243(arg1);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!kw;)V")
	private void method2243(@OriginalArg(1) Class39_Sub2 arg0) {
		arg0.method6171(true);
		arg0.method6194(true);
		if (Static262.aFloat184 != arg0.aFloat189) {
			arg0.M(Static262.aFloat184);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!kw;I)V")
	private void method2244(@OriginalArg(0) Class39_Sub2 arg0) {
		Static262.aFloat184 = arg0.aFloat189;
		arg0.method6146();
		arg0.method6194(false);
		arg0.method6171(false);
		arg0.method6159();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ZLclient!kw;)V")
	public void method2245(@OriginalArg(1) Class39_Sub2 arg0) {
		this.anInterface19_2.method6493(196584, 24);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!kw;II)V")
	private void method2247(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class181_Sub2 local11 = arg0.method6161();
		@Pc(14) float local14 = local11.aFloat137;
		@Pc(17) float local17 = local11.aFloat139;
		@Pc(20) float local20 = local11.aFloat131;
		@Pc(23) float local23 = local11.aFloat130;
		@Pc(26) float local26 = local11.aFloat132;
		@Pc(29) float local29 = local11.aFloat140;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(51) float local51 = local17 - local26;
		@Pc(55) float local55 = local20 - local29;
		@Pc(59) float local59 = local23 - local14;
		@Pc(63) float local63 = local26 - local17;
		@Pc(68) float local68 = local29 - local20;
		@Pc(74) Buffer local74 = this.anInterface19_2.method6952();
		if (local74 == null) {
			return;
		}
		@Pc(82) Stream local82 = arg0.method6195(local74);
		@Pc(88) int local88;
		@Pc(103) int local103;
		@Pc(112) int local112;
		@Pc(121) Class6_Sub1_Sub2 local121;
		@Pc(124) int local124;
		@Pc(129) byte local129;
		@Pc(134) byte local134;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(148) float local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(165) int local165;
		@Pc(408) float local408;
		@Pc(413) int local413;
		@Pc(353) int local353;
		@Pc(369) Class6_Sub1_Sub2 local369;
		@Pc(372) int local372;
		@Pc(385) byte local385;
		@Pc(390) byte local390;
		@Pc(402) float local402;
		if (Stream.a()) {
			for (local88 = arg1 - 1; local88 >= 0; local88--) {
				local103 = this.anIntArray302[local88] > 64 ? 64 : this.anIntArray302[local88];
				if (local103 > 0) {
					for (local112 = local103 - 1; local112 >= 0; local112--) {
						local121 = this.aClass6_Sub1_Sub2ArrayArray4[local88][local112];
						local124 = local121.anInt8125;
						local129 = (byte) (local124 >> 16);
						local134 = (byte) (local124 >> 8);
						local137 = (byte) local124;
						local142 = (byte) (local124 >>> 24);
						local148 = local121.anInt8123 >> 12;
						local154 = local121.anInt8129 >> 12;
						local160 = local121.anInt8124 >> 12;
						local165 = local121.anInt8122 >> 12;
						local82.a(local33 * (float) -local165 + local148);
						local82.a((float) -local165 * local37 + local154);
						local82.a(local41 * (float) -local165 + local160);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.a(0.0F);
						local82.a(0.0F);
						local82.a(local46 * (float) local165 + local148);
						local82.a((float) local165 * local51 + local154);
						local82.a(local160 + local55 * (float) local165);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.a(1.0F);
						local82.a(0.0F);
						local82.a(local148 + (float) local165 * local33);
						local82.a((float) local165 * local37 + local154);
						local82.a((float) local165 * local41 + local160);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.a(1.0F);
						local82.a(1.0F);
						local82.a(local59 * (float) local165 + local148);
						local82.a(local154 + local63 * (float) local165);
						local82.a(local160 + (float) local165 * local68);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.a(0.0F);
						local7++;
						local82.a(1.0F);
					}
					if (this.anIntArray302[local88] > 64) {
						local353 = this.anIntArray302[local88] - 64 - 1;
						for (local124 = this.anIntArray304[local353] - 1; local124 >= 0; local124--) {
							local369 = this.aClass6_Sub1_Sub2ArrayArray3[local353][local124];
							local372 = local369.anInt8125;
							local137 = (byte) (local372 >> 16);
							local142 = (byte) (local372 >> 8);
							local385 = (byte) local372;
							local390 = (byte) (local372 >>> 24);
							local160 = local369.anInt8123 >> 12;
							local402 = local369.anInt8129 >> 12;
							local408 = local369.anInt8124 >> 12;
							local413 = local369.anInt8122 >> 12;
							local82.a(local160 + local33 * (float) -local413);
							local82.a(local402 + (float) -local413 * local37);
							local82.a(local408 + (float) -local413 * local41);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.a(0.0F);
							local82.a(0.0F);
							local82.a(local160 + (float) local413 * local46);
							local82.a(local402 + local51 * (float) local413);
							local82.a((float) local413 * local55 + local408);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.a(1.0F);
							local82.a(0.0F);
							local82.a(local160 + (float) local413 * local33);
							local82.a(local402 + local37 * (float) local413);
							local82.a(local41 * (float) local413 + local408);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.a(1.0F);
							local82.a(1.0F);
							local82.a(local160 + local59 * (float) local413);
							local82.a(local63 * (float) local413 + local402);
							local82.a(local408 + local68 * (float) local413);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.a(0.0F);
							local82.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local88 = arg1 - 1; local88 >= 0; local88--) {
				local103 = this.anIntArray302[local88] > 64 ? 64 : this.anIntArray302[local88];
				if (local103 > 0) {
					for (local112 = local103 - 1; local112 >= 0; local112--) {
						local121 = this.aClass6_Sub1_Sub2ArrayArray4[local88][local112];
						local124 = local121.anInt8125;
						local129 = (byte) (local124 >> 16);
						local134 = (byte) (local124 >> 8);
						local137 = (byte) local124;
						local142 = (byte) (local124 >>> 24);
						local148 = local121.anInt8123 >> 12;
						local154 = local121.anInt8129 >> 12;
						local160 = local121.anInt8124 >> 12;
						local165 = local121.anInt8122 >> 12;
						local82.b((float) -local165 * local33 + local148);
						local82.b(local154 + local37 * (float) -local165);
						local82.b((float) -local165 * local41 + local160);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.b(0.0F);
						local82.b(0.0F);
						local82.b(local148 + local46 * (float) local165);
						local82.b(local51 * (float) local165 + local154);
						local82.b(local55 * (float) local165 + local160);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.b(1.0F);
						local82.b(0.0F);
						local82.b(local148 + local33 * (float) local165);
						local82.b(local154 + local37 * (float) local165);
						local82.b((float) local165 * local41 + local160);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.b(1.0F);
						local82.b(1.0F);
						local82.b(local59 * (float) local165 + local148);
						local82.b(local154 + (float) local165 * local63);
						local82.b(local160 + (float) local165 * local68);
						local82.b(local137);
						local82.b(local134);
						local82.b(local129);
						local82.b(local142);
						local82.b(0.0F);
						local82.b(1.0F);
						local7++;
					}
					if (this.anIntArray302[local88] > 64) {
						local353 = this.anIntArray302[local88] - 65;
						for (local124 = this.anIntArray304[local353] - 1; local124 >= 0; local124--) {
							local369 = this.aClass6_Sub1_Sub2ArrayArray3[local353][local124];
							local372 = local369.anInt8125;
							local137 = (byte) (local372 >> 16);
							local142 = (byte) (local372 >> 8);
							local385 = (byte) local372;
							local390 = (byte) (local372 >>> 24);
							local160 = local369.anInt8123 >> 12;
							local402 = local369.anInt8129 >> 12;
							local408 = local369.anInt8124 >> 12;
							local413 = local369.anInt8122 >> 12;
							local82.b(local160 + local33 * (float) -local413);
							local82.b(local402 + local37 * (float) -local413);
							local82.b(local408 + (float) -local413 * local41);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.b(0.0F);
							local82.b(0.0F);
							local82.b(local160 + local46 * (float) local413);
							local82.b(local402 + (float) local413 * local51);
							local82.b(local408 + local55 * (float) local413);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.b(1.0F);
							local82.b(0.0F);
							local82.b((float) local413 * local33 + local160);
							local82.b(local402 + local37 * (float) local413);
							local82.b(local41 * (float) local413 + local408);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.b(1.0F);
							local82.b(1.0F);
							local82.b(local160 + (float) local413 * local59);
							local82.b((float) local413 * local63 + local402);
							local82.b(local68 * (float) local413 + local408);
							local82.b(local385);
							local82.b(local142);
							local82.b(local137);
							local82.b(local390);
							local82.b(0.0F);
							local7++;
							local82.b(1.0F);
						}
					}
				}
			}
		}
		local82.c();
		if (this.anInterface19_2.method6954()) {
			arg0.method6200(this.aClass304_3);
			arg0.method6095(0, this.anInterface19_2);
			arg0.method6215(this.anInterface7_1, 0, Static514.aClass281_6, local7 * 2, 0, local7 * 4);
		}
	}
}
