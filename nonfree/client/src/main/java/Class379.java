import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vw")
public final class Class379 {

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "[[Lclient!qca;")
	private final Class34_Sub3_Sub2[][] aClass34_Sub3_Sub2ArrayArray3 = new Class34_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "[I")
	private final int[] anIntArray577 = new int[8191];

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "[[Lclient!qca;")
	private final Class34_Sub3_Sub2[][] aClass34_Sub3_Sub2ArrayArray4 = new Class34_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
	private int anInt10647 = 0;

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
	private final int[] anIntArray576 = new int[1600];

	@OriginalMember(owner = "client!vw", name = "q", descriptor = "[I")
	private final int[] anIntArray578 = new int[64];

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "Lclient!eda;")
	private final Class94 aClass94_23;

	@OriginalMember(owner = "client!vw", name = "p", descriptor = "Lclient!km;")
	private final Interface15 anInterface15_18;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "Lclient!km;")
	private final Interface15 anInterface15_17;

	@OriginalMember(owner = "client!vw", name = "j", descriptor = "Lclient!ra;")
	private final Interface22 anInterface22_8;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class379(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass94_23 = arg0.method8185(new Class306[] { new Class306(new Class356[] { Static610.aClass356_1, Static610.aClass356_3, Static610.aClass356_5 }), new Class306(Static610.aClass356_2) });
		this.anInterface15_18 = arg0.method8090(true);
		this.anInterface15_17 = arg0.method8090(false);
		this.anInterface15_17.method5530(393168, 12);
		this.anInterface22_8 = arg0.method8115(false);
		this.anInterface22_8.method7408(49146);
		@Pc(98) Buffer local98 = this.anInterface22_8.method7405();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method8157(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
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
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
				}
			}
			local105.a();
			this.anInterface22_8.method7407();
		}
		@Pc(200) Buffer local200 = this.anInterface15_17.method5529();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method8157(local200);
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
			local207.a();
			this.anInterface15_17.method5528();
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!ee;)V")
	private void method8728(@OriginalArg(1) Class95_Sub1 arg0) {
		arg0.method8095(true);
		arg0.method8150(true);
		if (Static225.aFloat73 != arg0.aFloat199) {
			arg0.xa(Static225.aFloat73);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!ee;I)V")
	private void method8729(@OriginalArg(0) int arg0, @OriginalArg(1) Class95_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class17_Sub2 local13 = arg1.method8081();
		@Pc(16) float local16 = local13.aFloat137;
		@Pc(19) float local19 = local13.aFloat128;
		@Pc(22) float local22 = local13.aFloat126;
		@Pc(25) float local25 = local13.aFloat133;
		@Pc(28) float local28 = local13.aFloat130;
		@Pc(31) float local31 = local13.aFloat135;
		@Pc(35) float local35 = local16 + local25;
		@Pc(39) float local39 = local28 + local19;
		@Pc(43) float local43 = local31 + local22;
		@Pc(47) float local47 = local16 - local25;
		@Pc(51) float local51 = local19 - local28;
		@Pc(55) float local55 = local22 - local31;
		@Pc(59) float local59 = local25 - local16;
		@Pc(64) float local64 = local28 - local19;
		@Pc(68) float local68 = local31 - local22;
		@Pc(74) Buffer local74 = this.anInterface15_18.method5529();
		if (local74 == null) {
			return;
		}
		@Pc(84) Stream local84 = arg1.method8157(local74);
		@Pc(90) int local90;
		@Pc(105) int local105;
		@Pc(114) int local114;
		@Pc(123) Class34_Sub3_Sub2 local123;
		@Pc(126) int local126;
		@Pc(131) byte local131;
		@Pc(136) byte local136;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(150) float local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(167) int local167;
		@Pc(446) float local446;
		@Pc(451) int local451;
		@Pc(391) int local391;
		@Pc(407) Class34_Sub3_Sub2 local407;
		@Pc(410) int local410;
		@Pc(423) byte local423;
		@Pc(428) byte local428;
		@Pc(440) float local440;
		if (Stream.b()) {
			for (local90 = arg0 - 1; local90 >= 0; local90--) {
				local105 = this.anIntArray576[local90] <= 64 ? this.anIntArray576[local90] : 64;
				if (local105 > 0) {
					for (local114 = local105 - 1; local114 >= 0; local114--) {
						local123 = this.aClass34_Sub3_Sub2ArrayArray4[local90][local114];
						local126 = local123.anInt10581;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt10579 >> 12);
						local156 = (float) (local123.anInt10582 >> 12);
						local162 = (float) (local123.anInt10583 >> 12);
						local167 = local123.anInt10580 >> 12;
						local84.a((float) -local167 * local35 + local150);
						local84.a(local156 + (float) -local167 * local39);
						local84.a(local162 + (float) -local167 * local43);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(0.0F);
						local84.a(0.0F);
						local84.a(local150 + local47 * (float) local167);
						local84.a(local156 + local51 * (float) local167);
						local84.a((float) local167 * local55 + local162);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(1.0F);
						local84.a(0.0F);
						local84.a(local150 + local35 * (float) local167);
						local84.a(local156 + local39 * (float) local167);
						local84.a(local43 * (float) local167 + local162);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(1.0F);
						local84.a(1.0F);
						local84.a(local150 + local59 * (float) local167);
						local84.a(local156 + local64 * (float) local167);
						local84.a(local162 + local68 * (float) local167);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.a(0.0F);
						local7++;
						local84.a(1.0F);
					}
					if (this.anIntArray576[local90] > 64) {
						local391 = this.anIntArray576[local90] - 64 - 1;
						for (local126 = this.anIntArray578[local391] - 1; local126 >= 0; local126--) {
							local407 = this.aClass34_Sub3_Sub2ArrayArray3[local391][local126];
							local410 = local407.anInt10581;
							local139 = (byte) (local410 >> 16);
							local144 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local162 = (float) (local407.anInt10579 >> 12);
							local440 = (float) (local407.anInt10582 >> 12);
							local446 = (float) (local407.anInt10583 >> 12);
							local451 = local407.anInt10580 >> 12;
							local84.a(local162 + local35 * (float) -local451);
							local84.a(local39 * (float) -local451 + local440);
							local84.a(local43 * (float) -local451 + local446);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(0.0F);
							local84.a(0.0F);
							local84.a(local162 + (float) local451 * local47);
							local84.a(local51 * (float) local451 + local440);
							local84.a(local446 + local55 * (float) local451);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(1.0F);
							local84.a(0.0F);
							local84.a((float) local451 * local35 + local162);
							local84.a((float) local451 * local39 + local440);
							local84.a((float) local451 * local43 + local446);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(1.0F);
							local84.a(1.0F);
							local84.a(local162 + (float) local451 * local59);
							local84.a((float) local451 * local64 + local440);
							local84.a(local68 * (float) local451 + local446);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.a(0.0F);
							local7++;
							local84.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local90 = arg0 - 1; local90 >= 0; local90--) {
				local105 = this.anIntArray576[local90] <= 64 ? this.anIntArray576[local90] : 64;
				if (local105 > 0) {
					for (local114 = local105 - 1; local114 >= 0; local114--) {
						local123 = this.aClass34_Sub3_Sub2ArrayArray4[local90][local114];
						local126 = local123.anInt10581;
						local131 = (byte) (local126 >> 16);
						local136 = (byte) (local126 >> 8);
						local139 = (byte) local126;
						local144 = (byte) (local126 >>> 24);
						local150 = (float) (local123.anInt10579 >> 12);
						local156 = (float) (local123.anInt10582 >> 12);
						local162 = (float) (local123.anInt10583 >> 12);
						local167 = local123.anInt10580 >> 12;
						local84.b(local150 + (float) -local167 * local35);
						local84.b(local156 + (float) -local167 * local39);
						local84.b(local162 + local43 * (float) -local167);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(0.0F);
						local84.b(0.0F);
						local84.b(local150 + local47 * (float) local167);
						local84.b((float) local167 * local51 + local156);
						local84.b(local55 * (float) local167 + local162);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(1.0F);
						local84.b(0.0F);
						local84.b(local150 + local35 * (float) local167);
						local84.b(local156 + local39 * (float) local167);
						local84.b((float) local167 * local43 + local162);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(1.0F);
						local84.b(1.0F);
						local84.b(local150 + (float) local167 * local59);
						local84.b((float) local167 * local64 + local156);
						local84.b(local162 + (float) local167 * local68);
						if (arg1.anInt10057 == 0) {
							local84.b(local131, local136, local139, local144);
						} else {
							local84.a(local131, local136, local139, local144);
						}
						local84.b(0.0F);
						local7++;
						local84.b(1.0F);
					}
					if (this.anIntArray576[local90] > 64) {
						local391 = this.anIntArray576[local90] - 1 - 64;
						for (local126 = this.anIntArray578[local391] - 1; local126 >= 0; local126--) {
							local407 = this.aClass34_Sub3_Sub2ArrayArray3[local391][local126];
							local410 = local407.anInt10581;
							local139 = (byte) (local410 >> 16);
							local144 = (byte) (local410 >> 8);
							local423 = (byte) local410;
							local428 = (byte) (local410 >>> 24);
							local162 = (float) (local407.anInt10579 >> 12);
							local440 = (float) (local407.anInt10582 >> 12);
							local446 = (float) (local407.anInt10583 >> 12);
							local451 = local407.anInt10580 >> 12;
							local84.b(local35 * (float) -local451 + local162);
							local84.b(local440 + local39 * (float) -local451);
							local84.b(local446 + local43 * (float) -local451);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(0.0F);
							local84.b(0.0F);
							local84.b((float) local451 * local47 + local162);
							local84.b((float) local451 * local51 + local440);
							local84.b(local55 * (float) local451 + local446);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(1.0F);
							local84.b(0.0F);
							local84.b(local35 * (float) local451 + local162);
							local84.b(local39 * (float) local451 + local440);
							local84.b(local446 + (float) local451 * local43);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(1.0F);
							local84.b(1.0F);
							local84.b(local59 * (float) local451 + local162);
							local84.b(local440 + (float) local451 * local64);
							local84.b(local446 + (float) local451 * local68);
							if (arg1.anInt10057 == 0) {
								local84.b(local139, local144, local423, local428);
							} else {
								local84.a(local139, local144, local423, local428);
							}
							local84.b(0.0F);
							local7++;
							local84.b(1.0F);
						}
					}
				}
			}
		}
		local84.a();
		if (this.anInterface15_18.method5528()) {
			arg1.method8133(this.anInterface15_18, 0);
			arg1.method8133(this.anInterface15_17, 1);
			arg1.method8166(this.aClass94_23);
			arg1.method8109(local7 * 2, 0, local7 * 4, Static649.aClass115_6, 0, this.anInterface22_8);
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!ee;BI)V")
	private void method8731(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static225.aFloat73 = arg0.aFloat199;
		arg0.method8083((float) arg1);
		arg0.method8181();
		arg0.method8150(false);
		arg0.method8095(false);
		arg0.method8144();
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(ILclient!ee;)V")
	private void method8732(@OriginalArg(1) Class95_Sub1 arg0) {
		Static225.aFloat73 = arg0.aFloat199;
		arg0.method8086();
		arg0.method8150(false);
		arg0.method8095(false);
		arg0.method8144();
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!ee;ILclient!tv;)V")
	public void method8733(@OriginalArg(0) int arg0, @OriginalArg(1) Class95_Sub1 arg1, @OriginalArg(3) Class347 arg2) {
		if (arg1.aClass17_Sub2_16 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method8732(arg1);
		} else {
			this.method8731(arg1, arg0);
		}
		@Pc(30) float local30 = arg1.aClass17_Sub2_16.aFloat132;
		@Pc(34) float local34 = arg1.aClass17_Sub2_16.aFloat129;
		@Pc(38) float local38 = arg1.aClass17_Sub2_16.aFloat134;
		@Pc(42) float local42 = arg1.aClass17_Sub2_16.aFloat131;
		try {
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = Integer.MAX_VALUE;
			@Pc(48) int local48 = 0;
			@Pc(52) Class34_Sub3 local52 = arg2.aClass61_1.aClass34_Sub3_1;
			@Pc(55) Class34_Sub3 local55;
			@Pc(87) int local87;
			for (local55 = local52.aClass34_Sub3_10; local55 != local52; local55 = local55.aClass34_Sub3_10) {
				@Pc(60) Class34_Sub3_Sub2 local60 = (Class34_Sub3_Sub2) local55;
				local87 = (int) (local42 + (float) (local60.anInt10582 >> 12) * local34 + (float) (local60.anInt10579 >> 12) * local30 + (float) (local60.anInt10583 >> 12) * local38);
				this.anIntArray577[local44++] = local87;
				if (local87 < local46) {
					local46 = local87;
				}
				if (local48 < local87) {
					local48 = local87;
				}
			}
			@Pc(118) int local118 = local48 - local46;
			if (local118 + 2 > 1600) {
				local87 = Static407.method5605(local118) + 1 - Static574.anInt9256;
				local118 = (local118 >> local87) + 2;
			} else {
				local87 = 0;
				local118 += 2;
			}
			local44 = 0;
			local55 = local52.aClass34_Sub3_10;
			@Pc(151) int local151 = -2;
			@Pc(153) boolean local153 = true;
			@Pc(155) boolean local155 = true;
			while (local55 != local52) {
				this.anInt10647 = 0;
				for (@Pc(162) int local162 = 0; local162 < local118; local162++) {
					this.anIntArray576[local162] = 0;
				}
				for (@Pc(179) int local179 = 0; local179 < 64; local179++) {
					this.anIntArray578[local179] = 0;
				}
				while (local55 != local52) {
					@Pc(195) Class34_Sub3_Sub2 local195 = (Class34_Sub3_Sub2) local55;
					if (local155) {
						local151 = local195.anInt10586;
						local155 = false;
						local153 = local195.aBoolean732;
					}
					if (local44 > 0 && (local151 != local195.anInt10586 || local195.aBoolean732 != local153)) {
						local155 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray577[local44++] - local46 >> local87;
					if (local237 < 1600) {
						if (this.anIntArray576[local237] >= 64) {
							label102: {
								if (this.anIntArray576[local237] == 64) {
									if (this.anInt10647 == 64) {
										break label102;
									}
									this.anIntArray576[local237] += this.anInt10647++ + 1;
								}
								@Pc(291) Class34_Sub3_Sub2[] local291 = this.aClass34_Sub3_Sub2ArrayArray3[this.anIntArray576[local237] - 64 - 1];
								@Pc(301) int local301 = this.anIntArray576[local237] - 64 - 1;
								@Pc(303) int local303 = this.anIntArray578[this.anIntArray576[local237] - 64 - 1];
								this.anIntArray578[local301] = this.anIntArray578[this.anIntArray576[local237] - 64 - 1] + 1;
								local291[local303] = local195;
							}
						} else {
							this.aClass34_Sub3_Sub2ArrayArray4[local237][this.anIntArray576[local237]++] = local195;
						}
					}
					local55 = local55.aClass34_Sub3_10;
				}
				arg1.method8118(false, local151 < 0 ? -1 : local151, false);
				if (local153 && arg1.aFloat199 != Static225.aFloat73) {
					arg1.xa(Static225.aFloat73);
				} else if (arg1.aFloat199 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method8729(local118, arg1);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method8728(arg1);
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(ILclient!ee;)V")
	public void method8734(@OriginalArg(1) Class95_Sub1 arg0) {
		this.anInterface15_18.method5530(786336, 24);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V")
	public void method8735() {
		this.anInterface15_18.method7409();
	}
}
