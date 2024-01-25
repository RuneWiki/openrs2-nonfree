import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private int anInt33 = 0;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "[[Lclient!di;")
	private final Class26_Sub1_Sub1[][] aClass26_Sub1_Sub1ArrayArray1 = new Class26_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
	private final int[] anIntArray3 = new int[1600];

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
	private final int[] anIntArray4 = new int[8191];

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[[Lclient!di;")
	private final Class26_Sub1_Sub1[][] aClass26_Sub1_Sub1ArrayArray2 = new Class26_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
	private final int[] anIntArray2 = new int[64];

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!ts;")
	private final Class321 aClass321_1;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "Lclient!eu;")
	private final Interface4 anInterface4_2;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "Lclient!eu;")
	private final Interface4 anInterface4_1;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!ft;")
	private final Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!ej;)V")
	public Class3(@OriginalArg(0) Class66_Sub1 arg0) {
		this.aClass321_1 = arg0.method6903(new Class43[] { new Class43(new Class79[] { Static108.aClass79_1, Static108.aClass79_3, Static108.aClass79_5 }), new Class43(Static108.aClass79_2) });
		this.anInterface4_2 = arg0.method6931(true);
		this.anInterface4_1 = arg0.method6931(false);
		this.anInterface4_1.method3559(12, 393168);
		this.anInterface8_1 = arg0.method6859(false);
		this.anInterface8_1.method7148(49146);
		@Pc(98) Buffer local98 = this.anInterface8_1.method7149();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6978(local98);
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
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			}
			local105.c();
			this.anInterface8_1.method7150();
		}
		@Pc(200) Buffer local200 = this.anInterface4_1.method7149();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6978(local200);
			if (Stream.b()) {
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
			} else {
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
			}
			local207.c();
			this.anInterface4_1.method7150();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLclient!ej;)V")
	private void method54(@OriginalArg(1) Class66_Sub1 arg0) {
		Static398.aFloat141 = arg0.aFloat168;
		arg0.method6980();
		arg0.method6943(false);
		arg0.method6864(false);
		arg0.method6976();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ej;II)V")
	private void method55(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class134_Sub1 local13 = arg0.method6940();
		@Pc(16) float local16 = local13.aFloat68;
		@Pc(19) float local19 = local13.aFloat74;
		@Pc(22) float local22 = local13.aFloat70;
		@Pc(25) float local25 = local13.aFloat76;
		@Pc(28) float local28 = local13.aFloat73;
		@Pc(31) float local31 = local13.aFloat66;
		@Pc(35) float local35 = local25 + local16;
		@Pc(39) float local39 = local19 + local28;
		@Pc(49) float local49 = local22 + local31;
		@Pc(53) float local53 = local16 - local25;
		@Pc(57) float local57 = local19 - local28;
		@Pc(62) float local62 = local22 - local31;
		@Pc(67) float local67 = local25 - local16;
		@Pc(72) float local72 = local28 - local19;
		@Pc(76) float local76 = local31 - local22;
		@Pc(82) Buffer local82 = this.anInterface4_2.method7149();
		if (local82 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg0.method6978(local82);
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(131) Class26_Sub1_Sub1 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(443) float local443;
		@Pc(448) int local448;
		@Pc(388) int local388;
		@Pc(404) Class26_Sub1_Sub1 local404;
		@Pc(407) int local407;
		@Pc(420) byte local420;
		@Pc(425) byte local425;
		@Pc(437) float local437;
		if (Stream.b()) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray3[local96] > 64 ? 64 : this.anIntArray3[local96];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass26_Sub1_Sub1ArrayArray1[local96][local122];
						local134 = local131.anInt9219;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt9214 >> 12;
						local164 = local131.anInt9217 >> 12;
						local170 = local131.anInt9213 >> 12;
						local175 = local131.anInt9222 >> 12;
						local90.b((float) -local175 * local35 + local158);
						local90.b((float) -local175 * local39 + local164);
						local90.b(local170 + local49 * (float) -local175);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local158 + (float) local175 * local53);
						local90.b(local164 + local57 * (float) local175);
						local90.b(local170 + (float) local175 * local62);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b((float) local175 * local35 + local158);
						local90.b(local164 + (float) local175 * local39);
						local90.b(local170 + (float) local175 * local49);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b((float) local175 * local67 + local158);
						local90.b(local72 * (float) local175 + local164);
						local90.b(local170 + (float) local175 * local76);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.b(0.0F);
						local7++;
						local90.b(1.0F);
					}
					if (this.anIntArray3[local96] > 64) {
						local388 = this.anIntArray3[local96] - 1 - 64;
						for (local134 = this.anIntArray2[local388] - 1; local134 >= 0; local134--) {
							local404 = this.aClass26_Sub1_Sub1ArrayArray2[local388][local134];
							local407 = local404.anInt9219;
							local147 = (byte) (local407 >> 16);
							local152 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local170 = local404.anInt9214 >> 12;
							local437 = local404.anInt9217 >> 12;
							local443 = local404.anInt9213 >> 12;
							local448 = local404.anInt9222 >> 12;
							local90.b((float) -local448 * local35 + local170);
							local90.b(local39 * (float) -local448 + local437);
							local90.b((float) -local448 * local49 + local443);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local170 + local53 * (float) local448);
							local90.b((float) local448 * local57 + local437);
							local90.b(local443 + local62 * (float) local448);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local35 * (float) local448 + local170);
							local90.b((float) local448 * local39 + local437);
							local90.b(local443 + local49 * (float) local448);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local67 * (float) local448 + local170);
							local90.b(local437 + local72 * (float) local448);
							local90.b(local76 * (float) local448 + local443);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.b(0.0F);
							local7++;
							local90.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray3[local96] <= 64 ? this.anIntArray3[local96] : 64;
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass26_Sub1_Sub1ArrayArray1[local96][local122];
						local134 = local131.anInt9219;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt9214 >> 12;
						local164 = local131.anInt9217 >> 12;
						local170 = local131.anInt9213 >> 12;
						local175 = local131.anInt9222 >> 12;
						local90.a((float) -local175 * local35 + local158);
						local90.a((float) -local175 * local39 + local164);
						local90.a(local170 + (float) -local175 * local49);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a(local158 + local53 * (float) local175);
						local90.a(local164 + (float) local175 * local57);
						local90.a(local170 + local62 * (float) local175);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a((float) local175 * local35 + local158);
						local90.a((float) local175 * local39 + local164);
						local90.a(local49 * (float) local175 + local170);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a(local67 * (float) local175 + local158);
						local90.a(local164 + (float) local175 * local72);
						local90.a(local76 * (float) local175 + local170);
						if (arg0.anInt8418 == 0) {
							local90.a(local139, local144, local147, local152);
						} else {
							local90.b(local139, local144, local147, local152);
						}
						local90.a(0.0F);
						local90.a(1.0F);
						local7++;
					}
					if (this.anIntArray3[local96] > 64) {
						local388 = this.anIntArray3[local96] - 65;
						for (local134 = this.anIntArray2[local388] - 1; local134 >= 0; local134--) {
							local404 = this.aClass26_Sub1_Sub1ArrayArray2[local388][local134];
							local407 = local404.anInt9219;
							local147 = (byte) (local407 >> 16);
							local152 = (byte) (local407 >> 8);
							local420 = (byte) local407;
							local425 = (byte) (local407 >>> 24);
							local170 = local404.anInt9214 >> 12;
							local437 = local404.anInt9217 >> 12;
							local443 = local404.anInt9213 >> 12;
							local448 = local404.anInt9222 >> 12;
							local90.a((float) -local448 * local35 + local170);
							local90.a(local39 * (float) -local448 + local437);
							local90.a(local443 + local49 * (float) -local448);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a((float) local448 * local53 + local170);
							local90.a((float) local448 * local57 + local437);
							local90.a((float) local448 * local62 + local443);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a(local170 + (float) local448 * local35);
							local90.a(local437 + (float) local448 * local39);
							local90.a((float) local448 * local49 + local443);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a((float) local448 * local67 + local170);
							local90.a((float) local448 * local72 + local437);
							local90.a(local76 * (float) local448 + local443);
							if (arg0.anInt8418 == 0) {
								local90.a(local147, local152, local420, local425);
							} else {
								local90.b(local147, local152, local420, local425);
							}
							local90.a(0.0F);
							local90.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local90.c();
		if (this.anInterface4_2.method7150()) {
			arg0.method6941(this.anInterface4_2, 0);
			arg0.method6941(this.anInterface4_1, 1);
			arg0.method6890(this.aClass321_1);
			arg0.method6917(0, Static453.aClass247_5, this.anInterface8_1, 0, local7 * 4, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!c;Lclient!ej;I)V")
	public void method56(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class66_Sub1 arg1) {
		if (arg1.aClass134_Sub1_16 == null) {
			return;
		}
		this.method54(arg1);
		@Pc(20) float local20 = arg1.aClass134_Sub1_16.aFloat72;
		@Pc(24) float local24 = arg1.aClass134_Sub1_16.aFloat69;
		@Pc(28) float local28 = arg1.aClass134_Sub1_16.aFloat75;
		@Pc(32) float local32 = arg1.aClass134_Sub1_16.aFloat71;
		try {
			@Pc(42) int local42;
			@Pc(50) int local50;
			@Pc(74) Class26_Sub1 local74;
			@Pc(87) int local87;
			@Pc(191) int local191;
			if (arg0.aBoolean80) {
				local42 = arg0.anInt913 - arg0.anInt912;
				if (local42 + 2 <= 1600) {
					local42 += 2;
					local50 = 0;
				} else {
					local50 = Static415.method5946(local42) + 1 - Static74.anInt1555;
					local42 = (local42 >> local50) + 2;
				}
				@Pc(71) Class26_Sub1 local71 = arg0.aClass212_1.aClass26_Sub1_5;
				local74 = local71.aClass26_Sub1_10;
				@Pc(76) int local76 = -2;
				@Pc(78) boolean local78 = true;
				@Pc(80) boolean local80 = true;
				while (local71 != local74) {
					this.anInt33 = 0;
					for (local87 = 0; local87 < local42; local87++) {
						this.anIntArray3[local87] = 0;
					}
					for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
						this.anIntArray2[local104] = 0;
					}
					while (local71 != local74) {
						@Pc(122) Class26_Sub1_Sub1 local122 = (Class26_Sub1_Sub1) local74;
						if (local80) {
							local78 = local122.aBoolean637;
							local80 = false;
							local76 = local122.anInt9221;
						} else if (local76 != local122.anInt9221 || local122.aBoolean637 != local78) {
							local80 = true;
							break;
						}
						local191 = (int) (local32 + local20 * (float) (local122.anInt9214 >> 12) + (float) (local122.anInt9217 >> 12) * local24 + local28 * (float) (local122.anInt9213 >> 12)) - arg0.anInt912 >> local50;
						if (local191 < 1600) {
							if (this.anIntArray3[local191] < 64) {
								this.aClass26_Sub1_Sub1ArrayArray1[local191][this.anIntArray3[local191]++] = local122;
							} else {
								label196: {
									if (this.anIntArray3[local191] == 64) {
										if (this.anInt33 == 64) {
											break label196;
										}
										this.anIntArray3[local191] += this.anInt33++ + 1;
									}
									@Pc(255) Class26_Sub1_Sub1[] local255 = this.aClass26_Sub1_Sub1ArrayArray2[this.anIntArray3[local191] - 64 - 1];
									@Pc(265) int local265 = this.anIntArray3[local191] - 64 - 1;
									@Pc(267) int local267 = this.anIntArray2[this.anIntArray3[local191] - 64 - 1];
									this.anIntArray2[local265] = this.anIntArray2[this.anIntArray3[local191] - 64 - 1] + 1;
									local255[local267] = local122;
								}
							}
						}
						local74 = local74.aClass26_Sub1_10;
					}
					arg1.method6899(false, local76 > 0 ? local76 : -1, false);
					if (local78 && Static398.aFloat141 != arg1.aFloat168) {
						arg1.ha(Static398.aFloat141);
					} else if (arg1.aFloat168 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method55(arg1, local42);
				}
			} else {
				local42 = 0;
				local50 = Integer.MAX_VALUE;
				@Pc(330) int local330 = 0;
				local74 = arg0.aClass212_1.aClass26_Sub1_5;
				@Pc(337) Class26_Sub1 local337;
				@Pc(369) int local369;
				for (local337 = local74.aClass26_Sub1_10; local337 != local74; local337 = local337.aClass26_Sub1_10) {
					@Pc(342) Class26_Sub1_Sub1 local342 = (Class26_Sub1_Sub1) local337;
					local369 = (int) (local32 + local20 * (float) (local342.anInt9214 >> 12) + local24 * (float) (local342.anInt9217 >> 12) + (float) (local342.anInt9213 >> 12) * local28);
					if (local369 > local330) {
						local330 = local369;
					}
					if (local50 > local369) {
						local50 = local369;
					}
					this.anIntArray4[local42++] = local369;
				}
				@Pc(399) int local399 = local330 - local50;
				if (local399 + 2 > 1600) {
					local369 = Static415.method5946(local399) + 1 - Static74.anInt1555;
					local399 = (local399 >> local369) + 2;
				} else {
					local399 += 2;
					local369 = 0;
				}
				local337 = local74.aClass26_Sub1_10;
				local42 = 0;
				local87 = -2;
				@Pc(435) boolean local435 = true;
				@Pc(437) boolean local437 = true;
				while (local337 != local74) {
					this.anInt33 = 0;
					for (local191 = 0; local191 < local399; local191++) {
						this.anIntArray3[local191] = 0;
					}
					for (@Pc(457) int local457 = 0; local457 < 64; local457++) {
						this.anIntArray2[local457] = 0;
					}
					while (local74 != local337) {
						@Pc(475) Class26_Sub1_Sub1 local475 = (Class26_Sub1_Sub1) local337;
						if (local437) {
							local435 = local475.aBoolean637;
							local87 = local475.anInt9221;
							local437 = false;
						}
						if (local42 > 0 && (local87 != local475.anInt9221 || local475.aBoolean637 != local435)) {
							local437 = true;
							break;
						}
						@Pc(514) int local514 = this.anIntArray4[local42++] - local50 >> local369;
						if (local514 < 1600) {
							if (this.anIntArray3[local514] < 64) {
								this.aClass26_Sub1_Sub1ArrayArray1[local514][this.anIntArray3[local514]++] = local475;
							} else {
								label146: {
									if (this.anIntArray3[local514] == 64) {
										if (this.anInt33 == 64) {
											break label146;
										}
										this.anIntArray3[local514] += this.anInt33++ + 1;
									}
									this.aClass26_Sub1_Sub1ArrayArray2[this.anIntArray3[local514] - 1 - 64][this.anIntArray2[this.anIntArray3[local514] - 64 - 1]++] = local475;
								}
							}
						}
						local337 = local337.aClass26_Sub1_10;
					}
					arg1.method6899(false, local87 >= 0 ? local87 : -1, false);
					if (local435 && arg1.aFloat168 != Static398.aFloat141) {
						arg1.ha(Static398.aFloat141);
					} else if (arg1.aFloat168 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method55(arg1, local399);
				}
			}
		} catch (@Pc(650) Exception local650) {
		}
		this.method58(arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ej;)V")
	private void method58(@OriginalArg(1) Class66_Sub1 arg0) {
		arg0.method6864(true);
		arg0.method6943(true);
		if (Static398.aFloat141 != arg0.aFloat168) {
			arg0.ha(Static398.aFloat141);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method59() {
		this.anInterface4_2.method7146();
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILclient!ej;)V")
	public void method62(@OriginalArg(1) Class66_Sub1 arg0) {
		this.anInterface4_2.method3559(24, 786336);
	}
}
