import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class311 {

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "[[Lclient!nba;")
	private final Class4_Sub3_Sub1[][] aClass4_Sub3_Sub1ArrayArray3 = new Class4_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "[I")
	private final int[] anIntArray763 = new int[64];

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "[I")
	private final int[] anIntArray764 = new int[8191];

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	private int anInt9121 = 0;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "[[Lclient!nba;")
	private final Class4_Sub3_Sub1[][] aClass4_Sub3_Sub1ArrayArray4 = new Class4_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "[I")
	private final int[] anIntArray765 = new int[1600];

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "Lclient!ep;")
	private final Class76 aClass76_20;

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "Lclient!cca;")
	private final Interface3 anInterface3_14;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "Lclient!cca;")
	private final Interface3 anInterface3_15;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!nq;")
	private final Interface14 anInterface14_8;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lclient!tu;)V")
	public Class311(@OriginalArg(0) Class5_Sub3 arg0) {
		this.aClass76_20 = arg0.method6361(new Class50[] { new Class50(new Class144[] { Static218.aClass144_1, Static218.aClass144_3, Static218.aClass144_5 }), new Class50(Static218.aClass144_2) });
		this.anInterface3_14 = arg0.method6422(true);
		this.anInterface3_15 = arg0.method6422(false);
		this.anInterface3_15.method2580(12, 393168);
		this.anInterface14_8 = arg0.method6325(false);
		this.anInterface14_8.method3137(49146);
		@Pc(98) Buffer local98 = this.anInterface14_8.method3136();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6352(local98);
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
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			}
			local105.a();
			this.anInterface14_8.method3135();
		}
		@Pc(200) Buffer local200 = this.anInterface3_15.method3136();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6352(local200);
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
			local207.a();
			this.anInterface3_15.method3135();
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!tu;I)V")
	private void method7522(@OriginalArg(0) Class5_Sub3 arg0) {
		arg0.method6311(true);
		arg0.method6339(true);
		if (arg0.aFloat228 != Static67.aFloat50) {
			arg0.ha(Static67.aFloat50);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public void method7523() {
		this.anInterface3_14.method3138();
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!be;ILclient!tu;)V")
	public void method7524(@OriginalArg(0) Class26 arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg1.aClass205_Sub1_16 == null) {
			return;
		}
		this.method7529(arg1);
		@Pc(17) float local17 = arg1.aClass205_Sub1_16.aFloat183;
		@Pc(21) float local21 = arg1.aClass205_Sub1_16.aFloat187;
		@Pc(25) float local25 = arg1.aClass205_Sub1_16.aFloat182;
		@Pc(29) float local29 = arg1.aClass205_Sub1_16.aFloat184;
		try {
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(42) Class4_Sub3 local42;
			@Pc(135) int local135;
			@Pc(146) int local146;
			if (arg0.aBoolean66) {
				local34 = arg0.anInt804 - arg0.anInt806;
				if (local34 + 2 <= 1600) {
					local34 += 2;
					local36 = 0;
				} else {
					local36 = Static192.method3681(local34) + 1 - Static376.anInt8891;
					local34 = (local34 >> local36) + 2;
				}
				@Pc(388) Class4_Sub3 local388 = arg0.aClass163_1.aClass4_Sub3_3;
				local42 = local388.aClass4_Sub3_10;
				@Pc(393) int local393 = -2;
				@Pc(395) boolean local395 = true;
				@Pc(397) boolean local397 = true;
				while (local42 != local388) {
					this.anInt9121 = 0;
					for (local135 = 0; local135 < local34; local135++) {
						this.anIntArray765[local135] = 0;
					}
					for (@Pc(417) int local417 = 0; local417 < 64; local417++) {
						this.anIntArray763[local417] = 0;
					}
					while (local42 != local388) {
						@Pc(435) Class4_Sub3_Sub1 local435 = (Class4_Sub3_Sub1) local42;
						if (local397) {
							local397 = false;
							local393 = local435.anInt5223;
							local395 = local435.aBoolean356;
						} else if (local435.anInt5223 != local393 || local395 != local435.aBoolean356) {
							local397 = true;
							break;
						}
						local146 = (int) (local29 + local25 * (float) (local435.anInt5221 >> 12) + local21 * (float) (local435.anInt5228 >> 12) + (float) (local435.anInt5229 >> 12) * local17) - arg0.anInt806 >> local36;
						if (local146 < 1600) {
							if (this.anIntArray765[local146] < 64) {
								this.aClass4_Sub3_Sub1ArrayArray3[local146][this.anIntArray765[local146]++] = local435;
							} else {
								label138: {
									if (this.anIntArray765[local146] == 64) {
										if (this.anInt9121 == 64) {
											break label138;
										}
										this.anIntArray765[local146] += this.anInt9121++ + 1;
									}
									this.aClass4_Sub3_Sub1ArrayArray4[this.anIntArray765[local146] - 64 - 1][this.anIntArray763[this.anIntArray765[local146] - 64 - 1]++] = local435;
								}
							}
						}
						local42 = local42.aClass4_Sub3_10;
					}
					arg1.method6299(false, local393 <= 0 ? -1 : local393, false);
					if (local395 && arg1.aFloat228 != Static67.aFloat50) {
						arg1.ha(Static67.aFloat50);
					} else if (arg1.aFloat228 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method7526(local34, arg1);
				}
			} else {
				local34 = 0;
				local36 = Integer.MAX_VALUE;
				@Pc(38) int local38 = 0;
				local42 = arg0.aClass163_1.aClass4_Sub3_3;
				@Pc(45) Class4_Sub3 local45;
				@Pc(77) int local77;
				for (local45 = local42.aClass4_Sub3_10; local45 != local42; local45 = local45.aClass4_Sub3_10) {
					@Pc(50) Class4_Sub3_Sub1 local50 = (Class4_Sub3_Sub1) local45;
					local77 = (int) (local17 * (float) (local50.anInt5229 >> 12) + local21 * (float) (local50.anInt5228 >> 12) + local25 * (float) (local50.anInt5221 >> 12) + local29);
					if (local77 < local36) {
						local36 = local77;
					}
					this.anIntArray764[local34++] = local77;
					if (local77 > local38) {
						local38 = local77;
					}
				}
				@Pc(103) int local103 = local38 - local36;
				if (local103 + 2 > 1600) {
					local77 = Static192.method3681(local103) + 1 - Static376.anInt8891;
					local103 = (local103 >> local77) + 2;
				} else {
					local77 = 0;
					local103 += 2;
				}
				local34 = 0;
				local45 = local42.aClass4_Sub3_10;
				local135 = -2;
				@Pc(137) boolean local137 = true;
				@Pc(139) boolean local139 = true;
				while (local42 != local45) {
					this.anInt9121 = 0;
					for (local146 = 0; local146 < local103; local146++) {
						this.anIntArray765[local146] = 0;
					}
					for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
						this.anIntArray763[local163] = 0;
					}
					while (local45 != local42) {
						@Pc(181) Class4_Sub3_Sub1 local181 = (Class4_Sub3_Sub1) local45;
						if (local139) {
							local137 = local181.aBoolean356;
							local139 = false;
							local135 = local181.anInt5223;
						}
						if (local34 > 0 && (local181.anInt5223 != local135 || local137 != local181.aBoolean356)) {
							local139 = true;
							break;
						}
						@Pc(220) int local220 = this.anIntArray764[local34++] - local36 >> local77;
						if (local220 < 1600) {
							if (this.anIntArray765[local220] >= 64) {
								label182: {
									if (this.anIntArray765[local220] == 64) {
										if (this.anInt9121 == 64) {
											break label182;
										}
										this.anIntArray765[local220] += this.anInt9121++ + 1;
									}
									this.aClass4_Sub3_Sub1ArrayArray4[this.anIntArray765[local220] - 1 - 64][this.anIntArray763[this.anIntArray765[local220] - 64 - 1]++] = local181;
								}
							} else {
								this.aClass4_Sub3_Sub1ArrayArray3[local220][this.anIntArray765[local220]++] = local181;
							}
						}
						local45 = local45.aClass4_Sub3_10;
					}
					arg1.method6299(false, local135 >= 0 ? local135 : -1, false);
					if (local137 && arg1.aFloat228 != Static67.aFloat50) {
						arg1.ha(Static67.aFloat50);
					} else if (arg1.aFloat228 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method7526(local103, arg1);
				}
			}
		} catch (@Pc(632) Exception local632) {
		}
		this.method7522(arg1);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZLclient!tu;)V")
	public void method7525(@OriginalArg(1) Class5_Sub3 arg0) {
		this.anInterface3_14.method2580(24, 786336);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILclient!tu;)V")
	private void method7526(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class205_Sub1 local11 = arg1.method6357();
		@Pc(14) float local14 = local11.aFloat192;
		@Pc(17) float local17 = local11.aFloat181;
		@Pc(20) float local20 = local11.aFloat185;
		@Pc(23) float local23 = local11.aFloat186;
		@Pc(26) float local26 = local11.aFloat189;
		@Pc(29) float local29 = local11.aFloat190;
		@Pc(33) float local33 = local14 + local23;
		@Pc(37) float local37 = local26 + local17;
		@Pc(41) float local41 = local20 + local29;
		@Pc(45) float local45 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(54) float local54 = local20 - local29;
		@Pc(64) float local64 = local23 - local14;
		@Pc(69) float local69 = local26 - local17;
		@Pc(74) float local74 = local29 - local20;
		@Pc(80) Buffer local80 = this.anInterface3_14.method3136();
		if (local80 == null) {
			return;
		}
		@Pc(88) Stream local88 = arg1.method6352(local80);
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class4_Sub3_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(421) float local421;
		@Pc(426) int local426;
		@Pc(366) int local366;
		@Pc(382) Class4_Sub3_Sub1 local382;
		@Pc(385) int local385;
		@Pc(398) byte local398;
		@Pc(403) byte local403;
		@Pc(415) float local415;
		if (Stream.c()) {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray765[local94] > 64 ? 64 : this.anIntArray765[local94];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass4_Sub3_Sub1ArrayArray3[local94][local120];
						local132 = local129.anInt5222;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt5229 >> 12;
						local162 = local129.anInt5228 >> 12;
						local168 = local129.anInt5221 >> 12;
						local173 = local129.anInt5219 >> 12;
						local88.a((float) -local173 * local33 + local156);
						local88.a(local162 + (float) -local173 * local37);
						local88.a(local168 + (float) -local173 * local41);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.a(0.0F);
						local88.a(0.0F);
						local88.a(local45 * (float) local173 + local156);
						local88.a((float) local173 * local50 + local162);
						local88.a(local168 + (float) local173 * local54);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.a(1.0F);
						local88.a(0.0F);
						local88.a(local33 * (float) local173 + local156);
						local88.a(local162 + local37 * (float) local173);
						local88.a((float) local173 * local41 + local168);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.a(1.0F);
						local88.a(1.0F);
						local88.a(local64 * (float) local173 + local156);
						local88.a(local162 + local69 * (float) local173);
						local88.a(local74 * (float) local173 + local168);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.a(0.0F);
						local88.a(1.0F);
						local7++;
					}
					if (this.anIntArray765[local94] > 64) {
						local366 = this.anIntArray765[local94] - 1 - 64;
						for (local132 = this.anIntArray763[local366] - 1; local132 >= 0; local132--) {
							local382 = this.aClass4_Sub3_Sub1ArrayArray4[local366][local132];
							local385 = local382.anInt5222;
							local145 = (byte) (local385 >> 16);
							local150 = (byte) (local385 >> 8);
							local398 = (byte) local385;
							local403 = (byte) (local385 >>> 24);
							local168 = local382.anInt5229 >> 12;
							local415 = local382.anInt5228 >> 12;
							local421 = local382.anInt5221 >> 12;
							local426 = local382.anInt5219 >> 12;
							local88.a(local168 + local33 * (float) -local426);
							local88.a((float) -local426 * local37 + local415);
							local88.a(local41 * (float) -local426 + local421);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.a(0.0F);
							local88.a(0.0F);
							local88.a(local168 + local45 * (float) local426);
							local88.a((float) local426 * local50 + local415);
							local88.a(local54 * (float) local426 + local421);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.a(1.0F);
							local88.a(0.0F);
							local88.a((float) local426 * local33 + local168);
							local88.a(local37 * (float) local426 + local415);
							local88.a(local421 + (float) local426 * local41);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.a(1.0F);
							local88.a(1.0F);
							local88.a((float) local426 * local64 + local168);
							local88.a(local69 * (float) local426 + local415);
							local88.a(local74 * (float) local426 + local421);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.a(0.0F);
							local88.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray765[local94] <= 64 ? this.anIntArray765[local94] : 64;
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass4_Sub3_Sub1ArrayArray3[local94][local120];
						local132 = local129.anInt5222;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt5229 >> 12;
						local162 = local129.anInt5228 >> 12;
						local168 = local129.anInt5221 >> 12;
						local173 = local129.anInt5219 >> 12;
						local88.b(local156 + (float) -local173 * local33);
						local88.b(local37 * (float) -local173 + local162);
						local88.b(local41 * (float) -local173 + local168);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.b(0.0F);
						local88.b(0.0F);
						local88.b(local45 * (float) local173 + local156);
						local88.b((float) local173 * local50 + local162);
						local88.b(local168 + local54 * (float) local173);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.b(1.0F);
						local88.b(0.0F);
						local88.b(local156 + local33 * (float) local173);
						local88.b(local162 + local37 * (float) local173);
						local88.b(local168 + local41 * (float) local173);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.b(1.0F);
						local88.b(1.0F);
						local88.b(local156 + (float) local173 * local64);
						local88.b((float) local173 * local69 + local162);
						local88.b(local168 + (float) local173 * local74);
						local88.a(local145);
						local88.a(local142);
						local88.a(local137);
						local88.a(local150);
						local88.b(0.0F);
						local7++;
						local88.b(1.0F);
					}
					if (this.anIntArray765[local94] > 64) {
						local366 = this.anIntArray765[local94] - 64 - 1;
						for (local132 = this.anIntArray763[local366] - 1; local132 >= 0; local132--) {
							local382 = this.aClass4_Sub3_Sub1ArrayArray4[local366][local132];
							local385 = local382.anInt5222;
							local145 = (byte) (local385 >> 16);
							local150 = (byte) (local385 >> 8);
							local398 = (byte) local385;
							local403 = (byte) (local385 >>> 24);
							local168 = local382.anInt5229 >> 12;
							local415 = local382.anInt5228 >> 12;
							local421 = local382.anInt5221 >> 12;
							local426 = local382.anInt5219 >> 12;
							local88.b(local168 + local33 * (float) -local426);
							local88.b(local37 * (float) -local426 + local415);
							local88.b(local41 * (float) -local426 + local421);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.b(0.0F);
							local88.b(0.0F);
							local88.b(local168 + (float) local426 * local45);
							local88.b(local415 + (float) local426 * local50);
							local88.b(local54 * (float) local426 + local421);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.b(1.0F);
							local88.b(0.0F);
							local88.b(local168 + local33 * (float) local426);
							local88.b(local37 * (float) local426 + local415);
							local88.b(local421 + local41 * (float) local426);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.b(1.0F);
							local88.b(1.0F);
							local88.b(local168 + (float) local426 * local64);
							local88.b(local415 + (float) local426 * local69);
							local88.b(local421 + local74 * (float) local426);
							local88.a(local398);
							local88.a(local150);
							local88.a(local145);
							local88.a(local403);
							local88.b(0.0F);
							local7++;
							local88.b(1.0F);
						}
					}
				}
			}
		}
		local88.a();
		if (this.anInterface3_14.method3135()) {
			arg1.method6382(this.anInterface3_14, 0);
			arg1.method6382(this.anInterface3_15, 1);
			arg1.method6333(this.aClass76_20);
			arg1.method6295(0, local7 * 2, local7 * 4, 0, Static524.aClass87_7, this.anInterface14_8);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!tu;)V")
	private void method7529(@OriginalArg(1) Class5_Sub3 arg0) {
		Static67.aFloat50 = arg0.aFloat228;
		arg0.method6375();
		arg0.method6339(false);
		arg0.method6311(false);
		arg0.method6370();
	}
}
