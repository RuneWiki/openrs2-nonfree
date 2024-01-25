import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class83 {

	@OriginalMember(owner = "client!en", name = "g", descriptor = "[[Lclient!is;")
	private final Class72_Sub1_Sub1[][] aClass72_Sub1_Sub1ArrayArray2 = new Class72_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!en", name = "p", descriptor = "I")
	private int anInt2357 = 0;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "[I")
	private final int[] anIntArray220 = new int[8191];

	@OriginalMember(owner = "client!en", name = "r", descriptor = "[I")
	private final int[] anIntArray221 = new int[64];

	@OriginalMember(owner = "client!en", name = "u", descriptor = "[I")
	private final int[] anIntArray222 = new int[1600];

	@OriginalMember(owner = "client!en", name = "b", descriptor = "[[Lclient!is;")
	private final Class72_Sub1_Sub1[][] aClass72_Sub1_Sub1ArrayArray1 = new Class72_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!en", name = "m", descriptor = "Lclient!kq;")
	private final Class170 aClass170_1;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!lca;")
	private final Interface5 anInterface5_1;

	@OriginalMember(owner = "client!en", name = "n", descriptor = "Lclient!lca;")
	private final Interface5 anInterface5_2;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!bd;")
	private final Interface1 anInterface1_1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class83(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass170_1 = arg0.method5674(new Class293[] { new Class293(new Class107[] { Static160.aClass107_1, Static160.aClass107_3, Static160.aClass107_5 }), new Class293(Static160.aClass107_2) });
		this.anInterface5_1 = arg0.method5671(true);
		this.anInterface5_2 = arg0.method5671(false);
		this.anInterface5_2.method5727(393168, 12);
		this.anInterface1_1 = arg0.method5660(false);
		this.anInterface1_1.method5227(49146);
		@Pc(98) Buffer local98 = this.anInterface1_1.method5729();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5555(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.a(local115);
					local105.a(local115 + 1);
					local105.a(local115 + 2);
					local105.a(local115 + 2);
					local105.a(local115 + 3);
					local105.a(local115);
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
			local105.b();
			this.anInterface1_1.method5730();
		}
		@Pc(200) Buffer local200 = this.anInterface5_2.method5729();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method5555(local200);
			if (Stream.c()) {
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
			local207.b();
			this.anInterface5_2.method5730();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!re;)V")
	private void method1966(@OriginalArg(1) Class122_Sub2 arg0) {
		Static430.aFloat121 = arg0.aFloat131;
		arg0.method5639();
		arg0.method5675(false);
		arg0.method5551(false);
		arg0.method5629();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	public void method1968() {
		this.anInterface5_1.method5728();
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!re;ZI)V")
	private void method1970(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class118_Sub3 local11 = arg0.method5597();
		@Pc(14) float local14 = local11.aFloat191;
		@Pc(17) float local17 = local11.aFloat193;
		@Pc(20) float local20 = local11.aFloat196;
		@Pc(23) float local23 = local11.aFloat195;
		@Pc(26) float local26 = local11.aFloat190;
		@Pc(29) float local29 = local11.aFloat188;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local29 + local20;
		@Pc(46) float local46 = local14 - local23;
		@Pc(57) float local57 = local17 - local26;
		@Pc(62) float local62 = local20 - local29;
		@Pc(67) float local67 = local23 - local14;
		@Pc(71) float local71 = local26 - local17;
		@Pc(76) float local76 = local29 - local20;
		@Pc(82) Buffer local82 = this.anInterface5_1.method5729();
		if (local82 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg0.method5555(local82);
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(131) Class72_Sub1_Sub1 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(423) float local423;
		@Pc(428) int local428;
		@Pc(368) int local368;
		@Pc(384) Class72_Sub1_Sub1 local384;
		@Pc(387) int local387;
		@Pc(400) byte local400;
		@Pc(405) byte local405;
		@Pc(417) float local417;
		if (Stream.c()) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray222[local96] <= 64 ? this.anIntArray222[local96] : 64;
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass72_Sub1_Sub1ArrayArray2[local96][local122];
						local134 = local131.anInt2182;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt2189 >> 12;
						local164 = local131.anInt2190 >> 12;
						local170 = local131.anInt2187 >> 12;
						local175 = local131.anInt2184 >> 12;
						local90.a(local158 + local33 * (float) -local175);
						local90.a(local164 + (float) -local175 * local37);
						local90.a(local170 + local41 * (float) -local175);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a(local158 + local46 * (float) local175);
						local90.a(local164 + local57 * (float) local175);
						local90.a(local62 * (float) local175 + local170);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a(local158 + (float) local175 * local33);
						local90.a(local164 + local37 * (float) local175);
						local90.a(local170 + (float) local175 * local41);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a(local158 + local67 * (float) local175);
						local90.a(local164 + local71 * (float) local175);
						local90.a(local170 + (float) local175 * local76);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.a(0.0F);
						local7++;
						local90.a(1.0F);
					}
					if (this.anIntArray222[local96] > 64) {
						local368 = this.anIntArray222[local96] - 64 - 1;
						for (local134 = this.anIntArray221[local368] - 1; local134 >= 0; local134--) {
							local384 = this.aClass72_Sub1_Sub1ArrayArray1[local368][local134];
							local387 = local384.anInt2182;
							local147 = (byte) (local387 >> 16);
							local152 = (byte) (local387 >> 8);
							local400 = (byte) local387;
							local405 = (byte) (local387 >>> 24);
							local170 = local384.anInt2189 >> 12;
							local417 = local384.anInt2190 >> 12;
							local423 = local384.anInt2187 >> 12;
							local428 = local384.anInt2184 >> 12;
							local90.a(local170 + (float) -local428 * local33);
							local90.a(local37 * (float) -local428 + local417);
							local90.a(local423 + local41 * (float) -local428);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a((float) local428 * local46 + local170);
							local90.a(local417 + local57 * (float) local428);
							local90.a(local423 + (float) local428 * local62);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a(local33 * (float) local428 + local170);
							local90.a(local37 * (float) local428 + local417);
							local90.a(local41 * (float) local428 + local423);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a((float) local428 * local67 + local170);
							local90.a(local417 + (float) local428 * local71);
							local90.a((float) local428 * local76 + local423);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.a(0.0F);
							local7++;
							local90.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray222[local96] > 64 ? 64 : this.anIntArray222[local96];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass72_Sub1_Sub1ArrayArray2[local96][local122];
						local134 = local131.anInt2182;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt2189 >> 12;
						local164 = local131.anInt2190 >> 12;
						local170 = local131.anInt2187 >> 12;
						local175 = local131.anInt2184 >> 12;
						local90.b(local158 + (float) -local175 * local33);
						local90.b((float) -local175 * local37 + local164);
						local90.b(local170 + local41 * (float) -local175);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local158 + local46 * (float) local175);
						local90.b(local57 * (float) local175 + local164);
						local90.b(local170 + (float) local175 * local62);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b((float) local175 * local33 + local158);
						local90.b((float) local175 * local37 + local164);
						local90.b(local170 + (float) local175 * local41);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b((float) local175 * local67 + local158);
						local90.b(local164 + (float) local175 * local71);
						local90.b(local170 + local76 * (float) local175);
						local90.f(local147);
						local90.f(local144);
						local90.f(local139);
						local90.f(local152);
						local90.b(0.0F);
						local90.b(1.0F);
						local7++;
					}
					if (this.anIntArray222[local96] > 64) {
						local368 = this.anIntArray222[local96] - 64 - 1;
						for (local134 = this.anIntArray221[local368] - 1; local134 >= 0; local134--) {
							local384 = this.aClass72_Sub1_Sub1ArrayArray1[local368][local134];
							local387 = local384.anInt2182;
							local147 = (byte) (local387 >> 16);
							local152 = (byte) (local387 >> 8);
							local400 = (byte) local387;
							local405 = (byte) (local387 >>> 24);
							local170 = local384.anInt2189 >> 12;
							local417 = local384.anInt2190 >> 12;
							local423 = local384.anInt2187 >> 12;
							local428 = local384.anInt2184 >> 12;
							local90.b(local170 + local33 * (float) -local428);
							local90.b(local37 * (float) -local428 + local417);
							local90.b(local41 * (float) -local428 + local423);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local170 + local46 * (float) local428);
							local90.b(local57 * (float) local428 + local417);
							local90.b(local423 + (float) local428 * local62);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local33 * (float) local428 + local170);
							local90.b(local417 + (float) local428 * local37);
							local90.b(local423 + local41 * (float) local428);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local170 + (float) local428 * local67);
							local90.b((float) local428 * local71 + local417);
							local90.b(local76 * (float) local428 + local423);
							local90.f(local400);
							local90.f(local152);
							local90.f(local147);
							local90.f(local405);
							local90.b(0.0F);
							local90.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local90.b();
		if (this.anInterface5_1.method5730()) {
			arg0.method5665(this.anInterface5_1, 0);
			arg0.method5665(this.anInterface5_2, 1);
			arg0.method5573(this.aClass170_1);
			arg0.method5669(Static354.aClass22_4, this.anInterface1_1, local7 * 4, 0, local7 * 2, 0);
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(ILclient!re;)V")
	private void method1971(@OriginalArg(1) Class122_Sub2 arg0) {
		arg0.method5551(true);
		arg0.method5675(true);
		if (arg0.aFloat131 != Static430.aFloat121) {
			arg0.M(Static430.aFloat121);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!re;I)V")
	public void method1972(@OriginalArg(0) Class122_Sub2 arg0) {
		this.anInterface5_1.method5727(786336, 24);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!re;Lclient!kw;Z)V")
	public void method1973(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class175 arg1) {
		if (arg0.aClass118_Sub3_16 == null) {
			return;
		}
		this.method1966(arg0);
		@Pc(17) float local17 = arg0.aClass118_Sub3_16.aFloat192;
		@Pc(21) float local21 = arg0.aClass118_Sub3_16.aFloat186;
		@Pc(32) float local32 = arg0.aClass118_Sub3_16.aFloat189;
		@Pc(36) float local36 = arg0.aClass118_Sub3_16.aFloat187;
		try {
			@Pc(46) int local46;
			@Pc(53) int local53;
			@Pc(78) Class72_Sub1 local78;
			@Pc(91) int local91;
			@Pc(235) Class72_Sub1_Sub1[] local235;
			@Pc(185) int local185;
			@Pc(243) int local243;
			@Pc(245) int local245;
			if (arg1.aBoolean357) {
				local46 = arg1.anInt5059 - arg1.anInt5060;
				if (local46 + 2 <= 1600) {
					local53 = 0;
					local46 += 2;
				} else {
					local53 = Static515.method7051(local46) + 1 - Static354.anInt6280;
					local46 = (local46 >> local53) + 2;
				}
				@Pc(75) Class72_Sub1 local75 = arg1.aClass193_1.aClass72_Sub1_7;
				local78 = local75.aClass72_Sub1_10;
				@Pc(80) int local80 = -2;
				@Pc(82) boolean local82 = true;
				@Pc(84) boolean local84 = true;
				while (local75 != local78) {
					this.anInt2357 = 0;
					for (local91 = 0; local91 < local46; local91++) {
						this.anIntArray222[local91] = 0;
					}
					for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
						this.anIntArray221[local104] = 0;
					}
					while (local75 != local78) {
						@Pc(120) Class72_Sub1_Sub1 local120 = (Class72_Sub1_Sub1) local78;
						if (local84) {
							local84 = false;
							local82 = local120.aBoolean136;
							local80 = local120.anInt2188;
						} else if (local120.anInt2188 != local80 || local82 != local120.aBoolean136) {
							local84 = true;
							break;
						}
						local185 = (int) ((float) (local120.anInt2187 >> 12) * local32 + (float) (local120.anInt2190 >> 12) * local21 + (float) (local120.anInt2189 >> 12) * local17 + local36) - arg1.anInt5060 >> local53;
						if (local185 < 1600) {
							if (this.anIntArray222[local185] >= 64) {
								label192: {
									if (this.anIntArray222[local185] == 64) {
										if (this.anInt2357 == 64) {
											break label192;
										}
										this.anIntArray222[local185] += this.anInt2357++ + 1;
									}
									local235 = this.aClass72_Sub1_Sub1ArrayArray1[this.anIntArray222[local185] - 64 - 1];
									local243 = this.anIntArray222[local185] - 65;
									local245 = this.anIntArray221[this.anIntArray222[local185] - 65];
									this.anIntArray221[local243] = this.anIntArray221[this.anIntArray222[local185] - 65] + 1;
									local235[local245] = local120;
								}
							} else {
								this.aClass72_Sub1_Sub1ArrayArray2[local185][this.anIntArray222[local185]++] = local120;
							}
						}
						local78 = local78.aClass72_Sub1_10;
					}
					arg0.method5622(false, false, local80 <= 0 ? -1 : local80);
					if (local82 && arg0.aFloat131 != Static430.aFloat121) {
						arg0.M(Static430.aFloat121);
					} else if (arg0.aFloat131 != 1.0F) {
						arg0.M(1.0F);
					}
					this.method1970(arg0, local46);
				}
			} else {
				local46 = 0;
				local53 = Integer.MAX_VALUE;
				@Pc(323) int local323 = 0;
				local78 = arg1.aClass193_1.aClass72_Sub1_7;
				@Pc(330) Class72_Sub1 local330;
				@Pc(362) int local362;
				for (local330 = local78.aClass72_Sub1_10; local330 != local78; local330 = local330.aClass72_Sub1_10) {
					@Pc(335) Class72_Sub1_Sub1 local335 = (Class72_Sub1_Sub1) local330;
					local362 = (int) (local17 * (float) (local335.anInt2189 >> 12) + local21 * (float) (local335.anInt2190 >> 12) + local32 * (float) (local335.anInt2187 >> 12) + local36);
					if (local362 < local53) {
						local53 = local362;
					}
					if (local323 < local362) {
						local323 = local362;
					}
					this.anIntArray220[local46++] = local362;
				}
				@Pc(396) int local396 = local323 - local53;
				if (local396 + 2 <= 1600) {
					local396 += 2;
					local362 = 0;
				} else {
					local362 = Static515.method7051(local396) + 1 - Static354.anInt6280;
					local396 = (local396 >> local362) + 2;
				}
				local330 = local78.aClass72_Sub1_10;
				local46 = 0;
				local91 = -2;
				@Pc(429) boolean local429 = true;
				@Pc(431) boolean local431 = true;
				while (local330 != local78) {
					this.anInt2357 = 0;
					for (local185 = 0; local185 < local396; local185++) {
						this.anIntArray222[local185] = 0;
					}
					for (@Pc(455) int local455 = 0; local455 < 64; local455++) {
						this.anIntArray221[local455] = 0;
					}
					while (local78 != local330) {
						@Pc(471) Class72_Sub1_Sub1 local471 = (Class72_Sub1_Sub1) local330;
						if (local431) {
							local431 = false;
							local429 = local471.aBoolean136;
							local91 = local471.anInt2188;
						}
						if (local46 > 0 && (local471.anInt2188 != local91 || local429 != local471.aBoolean136)) {
							local431 = true;
							break;
						}
						@Pc(513) int local513 = this.anIntArray220[local46++] - local53 >> local362;
						if (local513 < 1600) {
							if (this.anIntArray222[local513] < 64) {
								this.aClass72_Sub1_Sub1ArrayArray2[local513][this.anIntArray222[local513]++] = local471;
							} else {
								label142: {
									if (this.anIntArray222[local513] == 64) {
										if (this.anInt2357 == 64) {
											break label142;
										}
										this.anIntArray222[local513] += this.anInt2357++ + 1;
									}
									local235 = this.aClass72_Sub1_Sub1ArrayArray1[this.anIntArray222[local513] - 1 - 64];
									local243 = this.anIntArray222[local513] - 1 - 64;
									local245 = this.anIntArray221[this.anIntArray222[local513] - 1 - 64];
									this.anIntArray221[local243] = this.anIntArray221[this.anIntArray222[local513] - 1 - 64] + 1;
									local235[local245] = local471;
								}
							}
						}
						local330 = local330.aClass72_Sub1_10;
					}
					arg0.method5622(false, false, local91 >= 0 ? local91 : -1);
					if (local429 && arg0.aFloat131 != Static430.aFloat121) {
						arg0.M(Static430.aFloat121);
					} else if (arg0.aFloat131 != 1.0F) {
						arg0.M(1.0F);
					}
					this.method1970(arg0, local396);
				}
			}
		} catch (@Pc(645) Exception local645) {
		}
		this.method1971(arg0);
	}
}
