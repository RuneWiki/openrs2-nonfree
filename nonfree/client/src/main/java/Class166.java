import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class166 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
	private final int[] anIntArray242 = new int[64];

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	private int anInt3984 = 0;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "[I")
	private final int[] anIntArray243 = new int[1600];

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "[[Lclient!qja;")
	private final Class41_Sub4_Sub1[][] aClass41_Sub4_Sub1ArrayArray1 = new Class41_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
	private final int[] anIntArray244 = new int[8191];

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "[[Lclient!qja;")
	private final Class41_Sub4_Sub1[][] aClass41_Sub4_Sub1ArrayArray2 = new Class41_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!bw;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "Lclient!fka;")
	private final Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "Lclient!fka;")
	private final Interface6 anInterface6_5;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "Lclient!mq;")
	private final Interface16 anInterface16_1;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lclient!wk;)V")
	public Class166(@OriginalArg(0) Class143_Sub1 arg0) {
		this.aClass48_1 = arg0.method6320(new Class284[] { new Class284(new Class137[] { Static199.aClass137_1, Static199.aClass137_3, Static199.aClass137_5 }), new Class284(Static199.aClass137_2) });
		this.anInterface6_4 = arg0.method6373(true);
		this.anInterface6_5 = arg0.method6373(false);
		this.anInterface6_5.method3123(393168, 12);
		this.anInterface16_1 = arg0.method6279(false);
		this.anInterface16_1.method7863(49146);
		@Pc(96) Buffer local96 = this.anInterface16_1.method7864();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method6361(local96);
			@Pc(107) int local107;
			if (Stream.a()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.b(local112);
					local103.b(local112 + 1);
					local103.b(local112 + 2);
					local103.b(local112 + 2);
					local103.b(local112 + 3);
					local103.b(local112);
				}
			} else {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.f(local112);
					local103.f(local112 + 1);
					local103.f(local112 + 2);
					local103.f(local112 + 2);
					local103.f(local112 + 3);
					local103.f(local112);
				}
			}
			local103.c();
			this.anInterface16_1.method7862();
		}
		@Pc(195) Buffer local195 = this.anInterface6_5.method3120();
		if (local195 != null) {
			@Pc(202) Stream local202 = arg0.method6361(local195);
			if (Stream.a()) {
				for (local112 = 0; local112 < 8191; local112++) {
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
					local202.b(0.0F);
					local202.b(-1.0F);
					local202.b(0.0F);
				}
			} else {
				for (local112 = 0; local112 < 8191; local112++) {
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
					local202.a(0.0F);
					local202.a(-1.0F);
					local202.a(0.0F);
				}
			}
			local202.c();
			this.anInterface6_5.method3121();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!wk;Lclient!hea;II)V")
	public void method3509(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass56_Sub2_16 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method3513(arg0);
		} else {
			this.method3510(arg0, arg2);
		}
		@Pc(26) float local26 = arg0.aClass56_Sub2_16.aFloat150;
		@Pc(30) float local30 = arg0.aClass56_Sub2_16.aFloat154;
		@Pc(34) float local34 = arg0.aClass56_Sub2_16.aFloat155;
		@Pc(38) float local38 = arg0.aClass56_Sub2_16.aFloat153;
		try {
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class41_Sub4 local56 = arg1.aClass382_1.aClass41_Sub4_9;
			@Pc(59) Class41_Sub4 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass41_Sub4_7; local59 != local56; local59 = local59.aClass41_Sub4_7) {
				@Pc(64) Class41_Sub4_Sub1 local64 = (Class41_Sub4_Sub1) local59;
				local91 = (int) (local26 * (float) (local64.anInt4483 >> 12) + local30 * (float) (local64.anInt4485 >> 12) + local34 * (float) (local64.anInt4484 >> 12) + local38);
				this.anIntArray244[local48++] = local91;
				if (local52 < local91) {
					local52 = local91;
				}
				if (local91 < local50) {
					local50 = local91;
				}
			}
			@Pc(122) int local122 = local52 - local50;
			if (local122 + 2 <= 1600) {
				local122 += 2;
				local91 = 0;
			} else {
				local91 = Static187.method2726(local122) + 1 - Static655.anInt10287;
				local122 = (local122 >> local91) + 2;
			}
			local59 = local56.aClass41_Sub4_7;
			local48 = 0;
			@Pc(154) int local154 = -2;
			@Pc(156) boolean local156 = true;
			@Pc(158) boolean local158 = true;
			while (local59 != local56) {
				this.anInt3984 = 0;
				for (@Pc(165) int local165 = 0; local165 < local122; local165++) {
					this.anIntArray243[local165] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray242[local178] = 0;
				}
				while (local59 != local56) {
					@Pc(196) Class41_Sub4_Sub1 local196 = (Class41_Sub4_Sub1) local59;
					if (local158) {
						local158 = false;
						local156 = local196.aBoolean298;
						local154 = local196.anInt4482;
					}
					if (local48 > 0 && (local154 != local196.anInt4482 || local196.aBoolean298 != local156)) {
						local158 = true;
						break;
					}
					@Pc(238) int local238 = this.anIntArray244[local48++] - local50 >> local91;
					if (local238 < 1600) {
						if (this.anIntArray243[local238] >= 64) {
							label102: {
								if (this.anIntArray243[local238] == 64) {
									if (this.anInt3984 == 64) {
										break label102;
									}
									this.anIntArray243[local238] += this.anInt3984++ + 1;
								}
								@Pc(287) Class41_Sub4_Sub1[] local287 = this.aClass41_Sub4_Sub1ArrayArray1[this.anIntArray243[local238] - 65];
								@Pc(297) int local297 = this.anIntArray243[local238] - 64 - 1;
								@Pc(299) int local299 = this.anIntArray242[this.anIntArray243[local238] - 64 - 1];
								this.anIntArray242[local297] = this.anIntArray242[this.anIntArray243[local238] - 64 - 1] + 1;
								local287[local299] = local196;
							}
						} else {
							this.aClass41_Sub4_Sub1ArrayArray2[local238][this.anIntArray243[local238]++] = local196;
						}
					}
					local59 = local59.aClass41_Sub4_7;
				}
				arg0.method6312(false, false, local154 >= 0 ? local154 : -1);
				if (local156 && Static542.aFloat167 != arg0.aFloat136) {
					arg0.xa(Static542.aFloat167);
				} else if (arg0.aFloat136 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method3517(arg0, local122);
			}
		} catch (@Pc(368) Exception local368) {
		}
		this.method3514(arg0);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!wk;IB)V")
	private void method3510(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static542.aFloat167 = arg0.aFloat136;
		arg0.method6354((float) arg1);
		arg0.method6347();
		arg0.method6314(false);
		arg0.method6405(false);
		arg0.method6313();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLclient!wk;)V")
	public void method3512(@OriginalArg(1) Class143_Sub1 arg0) {
		this.anInterface6_4.method3123(786336, 24);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILclient!wk;)V")
	private void method3513(@OriginalArg(1) Class143_Sub1 arg0) {
		Static542.aFloat167 = arg0.aFloat136;
		arg0.method6365();
		arg0.method6314(false);
		arg0.method6405(false);
		arg0.method6313();
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(BLclient!wk;)V")
	private void method3514(@OriginalArg(1) Class143_Sub1 arg0) {
		arg0.method6405(true);
		arg0.method6314(true);
		if (Static542.aFloat167 != arg0.aFloat136) {
			arg0.xa(Static542.aFloat167);
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	public void method3516() {
		this.anInterface6_4.method7866();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!wk;II)V")
	private void method3517(@OriginalArg(0) Class143_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class56_Sub2 local13 = arg0.method6402();
		@Pc(16) float local16 = local13.aFloat148;
		@Pc(19) float local19 = local13.aFloat158;
		@Pc(22) float local22 = local13.aFloat151;
		@Pc(32) float local32 = local13.aFloat156;
		@Pc(35) float local35 = local13.aFloat149;
		@Pc(38) float local38 = local13.aFloat157;
		@Pc(42) float local42 = local16 + local32;
		@Pc(46) float local46 = local35 + local19;
		@Pc(50) float local50 = local38 + local22;
		@Pc(54) float local54 = local16 - local32;
		@Pc(59) float local59 = local19 - local35;
		@Pc(63) float local63 = local22 - local38;
		@Pc(67) float local67 = local32 - local16;
		@Pc(72) float local72 = local35 - local19;
		@Pc(76) float local76 = local38 - local22;
		@Pc(82) Buffer local82 = this.anInterface6_4.method3120();
		if (local82 == null) {
			return;
		}
		@Pc(90) Stream local90 = arg0.method6361(local82);
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class41_Sub4_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class41_Sub4_Sub1 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.a()) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray243[local96] > 64 ? 64 : this.anIntArray243[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass41_Sub4_Sub1ArrayArray2[local96][local120];
						local132 = local129.anInt4489;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt4483 >> 12);
						local162 = (float) (local129.anInt4485 >> 12);
						local168 = (float) (local129.anInt4484 >> 12);
						local173 = local129.anInt4488 >> 12;
						local90.b(local156 + local42 * (float) -local173);
						local90.b(local162 + local46 * (float) -local173);
						local90.b(local168 + local50 * (float) -local173);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(0.0F);
						local90.b(0.0F);
						local90.b(local54 * (float) local173 + local156);
						local90.b((float) local173 * local59 + local162);
						local90.b(local168 + (float) local173 * local63);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(1.0F);
						local90.b(0.0F);
						local90.b(local42 * (float) local173 + local156);
						local90.b(local46 * (float) local173 + local162);
						local90.b((float) local173 * local50 + local168);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(1.0F);
						local90.b(1.0F);
						local90.b(local67 * (float) local173 + local156);
						local90.b(local162 + local72 * (float) local173);
						local90.b(local168 + local76 * (float) local173);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.b(0.0F);
						local90.b(1.0F);
						local7++;
					}
					if (this.anIntArray243[local96] > 64) {
						local391 = this.anIntArray243[local96] - 64 - 1;
						for (local132 = this.anIntArray242[local391] - 1; local132 >= 0; local132--) {
							local407 = this.aClass41_Sub4_Sub1ArrayArray1[local391][local132];
							local410 = local407.anInt4489;
							local145 = (byte) (local410 >> 16);
							local150 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local168 = (float) (local407.anInt4483 >> 12);
							local440 = (float) (local407.anInt4485 >> 12);
							local446 = (float) (local407.anInt4484 >> 12);
							local451 = local407.anInt4488 >> 12;
							local90.b(local168 + local42 * (float) -local451);
							local90.b(local440 + local46 * (float) -local451);
							local90.b(local50 * (float) -local451 + local446);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.b(0.0F);
							local90.b(0.0F);
							local90.b(local54 * (float) local451 + local168);
							local90.b((float) local451 * local59 + local440);
							local90.b(local63 * (float) local451 + local446);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.b(1.0F);
							local90.b(0.0F);
							local90.b(local168 + local42 * (float) local451);
							local90.b(local46 * (float) local451 + local440);
							local90.b(local446 + (float) local451 * local50);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.b(1.0F);
							local90.b(1.0F);
							local90.b(local67 * (float) local451 + local168);
							local90.b(local440 + (float) local451 * local72);
							local90.b((float) local451 * local76 + local446);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.b(0.0F);
							local90.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray243[local96] > 64 ? 64 : this.anIntArray243[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass41_Sub4_Sub1ArrayArray2[local96][local120];
						local132 = local129.anInt4489;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt4483 >> 12);
						local162 = (float) (local129.anInt4485 >> 12);
						local168 = (float) (local129.anInt4484 >> 12);
						local173 = local129.anInt4488 >> 12;
						local90.a((float) -local173 * local42 + local156);
						local90.a(local162 + (float) -local173 * local46);
						local90.a((float) -local173 * local50 + local168);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(0.0F);
						local90.a(0.0F);
						local90.a((float) local173 * local54 + local156);
						local90.a((float) local173 * local59 + local162);
						local90.a(local63 * (float) local173 + local168);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(1.0F);
						local90.a(0.0F);
						local90.a(local42 * (float) local173 + local156);
						local90.a((float) local173 * local46 + local162);
						local90.a(local168 + (float) local173 * local50);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(1.0F);
						local90.a(1.0F);
						local90.a((float) local173 * local67 + local156);
						local90.a(local72 * (float) local173 + local162);
						local90.a((float) local173 * local76 + local168);
						if (arg0.anInt7376 == 0) {
							local90.a(local137, local142, local145, local150);
						} else {
							local90.b(local137, local142, local145, local150);
						}
						local90.a(0.0F);
						local90.a(1.0F);
						local7++;
					}
					if (this.anIntArray243[local96] > 64) {
						local391 = this.anIntArray243[local96] - 65;
						for (local132 = this.anIntArray242[local391] - 1; local132 >= 0; local132--) {
							local407 = this.aClass41_Sub4_Sub1ArrayArray1[local391][local132];
							local410 = local407.anInt4489;
							local145 = (byte) (local410 >> 16);
							local150 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local168 = (float) (local407.anInt4483 >> 12);
							local440 = (float) (local407.anInt4485 >> 12);
							local446 = (float) (local407.anInt4484 >> 12);
							local451 = local407.anInt4488 >> 12;
							local90.a(local168 + (float) -local451 * local42);
							local90.a((float) -local451 * local46 + local440);
							local90.a((float) -local451 * local50 + local446);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.a(0.0F);
							local90.a(0.0F);
							local90.a((float) local451 * local54 + local168);
							local90.a((float) local451 * local59 + local440);
							local90.a(local446 + local63 * (float) local451);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.a(1.0F);
							local90.a(0.0F);
							local90.a((float) local451 * local42 + local168);
							local90.a((float) local451 * local46 + local440);
							local90.a(local446 + (float) local451 * local50);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.a(1.0F);
							local90.a(1.0F);
							local90.a(local168 + (float) local451 * local67);
							local90.a(local440 + (float) local451 * local72);
							local90.a((float) local451 * local76 + local446);
							if (arg0.anInt7376 == 0) {
								local90.a(local145, local150, local423, local428);
							} else {
								local90.b(local145, local150, local423, local428);
							}
							local90.a(0.0F);
							local7++;
							local90.a(1.0F);
						}
					}
				}
			}
		}
		local90.c();
		if (this.anInterface6_4.method3121()) {
			arg0.method6325(0, this.anInterface6_4);
			arg0.method6325(1, this.anInterface6_5);
			arg0.method6333(this.aClass48_1);
			arg0.method6367(Static536.aClass323_4, 0, this.anInterface16_1, 0, local7 * 4, local7 * 2);
		}
	}
}
