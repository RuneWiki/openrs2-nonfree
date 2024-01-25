import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class308 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
	private final int[] anIntArray488 = new int[64];

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[[Lclient!ia;")
	private final Class28_Sub3_Sub1[][] aClass28_Sub3_Sub1ArrayArray2 = new Class28_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "[[Lclient!ia;")
	private final Class28_Sub3_Sub1[][] aClass28_Sub3_Sub1ArrayArray1 = new Class28_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "[I")
	private final int[] anIntArray490 = new int[1600];

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	private int anInt8709 = 0;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "[I")
	private final int[] anIntArray489 = new int[8191];

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "Lclient!co;")
	private final Class69 aClass69_23;

	@OriginalMember(owner = "client!rt", name = "q", descriptor = "Lclient!cq;")
	private final Interface3 anInterface3_17;

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "Lclient!cq;")
	private final Interface3 anInterface3_16;

	@OriginalMember(owner = "client!rt", name = "o", descriptor = "Lclient!jj;")
	private final Interface12 anInterface12_6;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!gd;)V")
	public Class308(@OriginalArg(0) Class65_Sub2 arg0) {
		this.aClass69_23 = arg0.method4463(new Class219[] { new Class219(new Class281[] { Static456.aClass281_1, Static456.aClass281_3, Static456.aClass281_5 }), new Class219(Static456.aClass281_2) });
		this.anInterface3_17 = arg0.method4374(true);
		this.anInterface3_16 = arg0.method4374(false);
		this.anInterface3_16.method8244(393168, 12);
		this.anInterface12_6 = arg0.method4364(false);
		this.anInterface12_6.method8239(49146);
		@Pc(96) Buffer local96 = this.anInterface12_6.method900();
		@Pc(112) int local112;
		if (local96 != null) {
			@Pc(103) Stream local103 = arg0.method4457(local96);
			@Pc(107) int local107;
			if (Stream.c()) {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.e(local112);
					local103.e(local112 + 1);
					local103.e(local112 + 2);
					local103.e(local112 + 2);
					local103.e(local112 + 3);
					local103.e(local112);
				}
			} else {
				for (local107 = 0; local107 < 8191; local107++) {
					local112 = local107 * 4;
					local103.b(local112);
					local103.b(local112 + 1);
					local103.b(local112 + 2);
					local103.b(local112 + 2);
					local103.b(local112 + 3);
					local103.b(local112);
				}
			}
			local103.a();
			this.anInterface12_6.method903();
		}
		@Pc(197) Buffer local197 = this.anInterface3_16.method8245();
		if (local197 != null) {
			@Pc(204) Stream local204 = arg0.method4457(local197);
			if (Stream.c()) {
				for (local112 = 0; local112 < 8191; local112++) {
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
					local204.a(0.0F);
					local204.a(-1.0F);
					local204.a(0.0F);
				}
			} else {
				for (local112 = 0; local112 < 8191; local112++) {
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
					local204.b(0.0F);
					local204.b(-1.0F);
					local204.b(0.0F);
				}
			}
			local204.a();
			this.anInterface3_16.method8243();
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(BLclient!gd;)V")
	private void method7418(@OriginalArg(1) Class65_Sub2 arg0) {
		Static127.aFloat68 = arg0.aFloat99;
		arg0.method4412();
		arg0.method4377(false);
		arg0.method4445(false);
		arg0.method4443();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!gd;II)V")
	private void method7419(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class254_Sub2 local13 = arg0.method4410();
		@Pc(16) float local16 = local13.aFloat153;
		@Pc(19) float local19 = local13.aFloat144;
		@Pc(31) float local31 = local13.aFloat151;
		@Pc(34) float local34 = local13.aFloat149;
		@Pc(37) float local37 = local13.aFloat145;
		@Pc(40) float local40 = local13.aFloat150;
		@Pc(44) float local44 = local16 + local34;
		@Pc(48) float local48 = local19 + local37;
		@Pc(52) float local52 = local40 + local31;
		@Pc(57) float local57 = local16 - local34;
		@Pc(61) float local61 = local19 - local37;
		@Pc(66) float local66 = local31 - local40;
		@Pc(70) float local70 = local34 - local16;
		@Pc(75) float local75 = local37 - local19;
		@Pc(79) float local79 = local40 - local31;
		@Pc(85) Buffer local85 = this.anInterface3_17.method8245();
		if (local85 == null) {
			return;
		}
		@Pc(93) Stream local93 = arg0.method4457(local85);
		@Pc(99) int local99;
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(129) Class28_Sub3_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(450) float local450;
		@Pc(455) int local455;
		@Pc(395) int local395;
		@Pc(411) Class28_Sub3_Sub1 local411;
		@Pc(414) int local414;
		@Pc(427) byte local427;
		@Pc(432) byte local432;
		@Pc(444) float local444;
		if (Stream.c()) {
			for (local99 = arg1 - 1; local99 >= 0; local99--) {
				local114 = this.anIntArray490[local99] > 64 ? 64 : this.anIntArray490[local99];
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass28_Sub3_Sub1ArrayArray2[local99][local120];
						local132 = local129.anInt5585;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt5581 >> 12);
						local162 = (float) (local129.anInt5584 >> 12);
						local168 = (float) (local129.anInt5579 >> 12);
						local173 = local129.anInt5586 >> 12;
						local93.a(local44 * (float) -local173 + local156);
						local93.a(local162 + local48 * (float) -local173);
						local93.a(local168 + local52 * (float) -local173);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.a(0.0F);
						local93.a(0.0F);
						local93.a(local57 * (float) local173 + local156);
						local93.a(local162 + local61 * (float) local173);
						local93.a((float) local173 * local66 + local168);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.a(1.0F);
						local93.a(0.0F);
						local93.a((float) local173 * local44 + local156);
						local93.a((float) local173 * local48 + local162);
						local93.a((float) local173 * local52 + local168);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.a(1.0F);
						local93.a(1.0F);
						local93.a(local156 + local70 * (float) local173);
						local93.a(local162 + local75 * (float) local173);
						local93.a(local79 * (float) local173 + local168);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.a(0.0F);
						local93.a(1.0F);
						local7++;
					}
					if (this.anIntArray490[local99] > 64) {
						local395 = this.anIntArray490[local99] - 64 - 1;
						for (local132 = this.anIntArray488[local395] - 1; local132 >= 0; local132--) {
							local411 = this.aClass28_Sub3_Sub1ArrayArray1[local395][local132];
							local414 = local411.anInt5585;
							local145 = (byte) (local414 >> 16);
							local150 = (byte) (local414 >> 8);
							local427 = (byte) local414;
							local432 = (byte) (local414 >>> 24);
							local168 = (float) (local411.anInt5581 >> 12);
							local444 = (float) (local411.anInt5584 >> 12);
							local450 = (float) (local411.anInt5579 >> 12);
							local455 = local411.anInt5586 >> 12;
							local93.a(local168 + (float) -local455 * local44);
							local93.a(local444 + (float) -local455 * local48);
							local93.a(local52 * (float) -local455 + local450);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.a(0.0F);
							local93.a(0.0F);
							local93.a(local168 + (float) local455 * local57);
							local93.a(local444 + (float) local455 * local61);
							local93.a(local66 * (float) local455 + local450);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.a(1.0F);
							local93.a(0.0F);
							local93.a(local168 + local44 * (float) local455);
							local93.a((float) local455 * local48 + local444);
							local93.a(local52 * (float) local455 + local450);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.a(1.0F);
							local93.a(1.0F);
							local93.a(local168 + (float) local455 * local70);
							local93.a(local444 + (float) local455 * local75);
							local93.a(local450 + (float) local455 * local79);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.a(0.0F);
							local7++;
							local93.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local99 = arg1 - 1; local99 >= 0; local99--) {
				local114 = this.anIntArray490[local99] > 64 ? 64 : this.anIntArray490[local99];
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass28_Sub3_Sub1ArrayArray2[local99][local120];
						local132 = local129.anInt5585;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt5581 >> 12);
						local162 = (float) (local129.anInt5584 >> 12);
						local168 = (float) (local129.anInt5579 >> 12);
						local173 = local129.anInt5586 >> 12;
						local93.b(local156 + (float) -local173 * local44);
						local93.b(local48 * (float) -local173 + local162);
						local93.b(local52 * (float) -local173 + local168);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.b(0.0F);
						local93.b(0.0F);
						local93.b(local156 + (float) local173 * local57);
						local93.b((float) local173 * local61 + local162);
						local93.b(local66 * (float) local173 + local168);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.b(1.0F);
						local93.b(0.0F);
						local93.b(local156 + local44 * (float) local173);
						local93.b((float) local173 * local48 + local162);
						local93.b(local52 * (float) local173 + local168);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.b(1.0F);
						local93.b(1.0F);
						local93.b(local70 * (float) local173 + local156);
						local93.b(local75 * (float) local173 + local162);
						local93.b(local168 + (float) local173 * local79);
						if (arg0.anInt5253 == 0) {
							local93.a(local137, local142, local145, local150);
						} else {
							local93.b(local137, local142, local145, local150);
						}
						local93.b(0.0F);
						local93.b(1.0F);
						local7++;
					}
					if (this.anIntArray490[local99] > 64) {
						local395 = this.anIntArray490[local99] - 64 - 1;
						for (local132 = this.anIntArray488[local395] - 1; local132 >= 0; local132--) {
							local411 = this.aClass28_Sub3_Sub1ArrayArray1[local395][local132];
							local414 = local411.anInt5585;
							local145 = (byte) (local414 >> 16);
							local150 = (byte) (local414 >> 8);
							local427 = (byte) local414;
							local432 = (byte) (local414 >>> 24);
							local168 = (float) (local411.anInt5581 >> 12);
							local444 = (float) (local411.anInt5584 >> 12);
							local450 = (float) (local411.anInt5579 >> 12);
							local455 = local411.anInt5586 >> 12;
							local93.b((float) -local455 * local44 + local168);
							local93.b((float) -local455 * local48 + local444);
							local93.b((float) -local455 * local52 + local450);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.b(0.0F);
							local93.b(0.0F);
							local93.b(local168 + (float) local455 * local57);
							local93.b(local444 + (float) local455 * local61);
							local93.b(local450 + local66 * (float) local455);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.b(1.0F);
							local93.b(0.0F);
							local93.b(local168 + local44 * (float) local455);
							local93.b(local444 + (float) local455 * local48);
							local93.b(local52 * (float) local455 + local450);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.b(1.0F);
							local93.b(1.0F);
							local93.b(local168 + (float) local455 * local70);
							local93.b(local444 + (float) local455 * local75);
							local93.b(local79 * (float) local455 + local450);
							if (arg0.anInt5253 == 0) {
								local93.a(local145, local150, local427, local432);
							} else {
								local93.b(local145, local150, local427, local432);
							}
							local93.b(0.0F);
							local7++;
							local93.b(1.0F);
						}
					}
				}
			}
		}
		local93.a();
		if (this.anInterface3_17.method8243()) {
			arg0.method4427(0, this.anInterface3_17);
			arg0.method4427(1, this.anInterface3_16);
			arg0.method4447(this.aClass69_23);
			arg0.method4398(0, local7 * 4, 0, Static72.aClass155_1, this.anInterface12_6, local7 * 2);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!gd;B)V")
	public void method7420(@OriginalArg(0) Class65_Sub2 arg0) {
		this.anInterface3_17.method8244(786336, 24);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!wq;ILclient!gd;)V")
	public void method7421(@OriginalArg(0) int arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(3) Class65_Sub2 arg2) {
		if (arg2.aClass254_Sub2_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method7423(arg2, arg0);
		} else {
			this.method7418(arg2);
		}
		@Pc(26) float local26 = arg2.aClass254_Sub2_16.aFloat155;
		@Pc(30) float local30 = arg2.aClass254_Sub2_16.aFloat154;
		@Pc(34) float local34 = arg2.aClass254_Sub2_16.aFloat148;
		@Pc(38) float local38 = arg2.aClass254_Sub2_16.aFloat147;
		try {
			@Pc(40) int local40 = 0;
			@Pc(50) int local50 = Integer.MAX_VALUE;
			@Pc(52) int local52 = 0;
			@Pc(56) Class28_Sub3 local56 = arg1.aClass307_1.aClass28_Sub3_7;
			@Pc(59) Class28_Sub3 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass28_Sub3_9; local59 != local56; local59 = local59.aClass28_Sub3_9) {
				@Pc(64) Class28_Sub3_Sub1 local64 = (Class28_Sub3_Sub1) local59;
				local91 = (int) ((float) (local64.anInt5579 >> 12) * local34 + local30 * (float) (local64.anInt5584 >> 12) + local26 * (float) (local64.anInt5581 >> 12) + local38);
				if (local91 > local52) {
					local52 = local91;
				}
				this.anIntArray489[local40++] = local91;
				if (local50 > local91) {
					local50 = local91;
				}
			}
			@Pc(121) int local121 = local52 - local50;
			if (local121 + 2 <= 1600) {
				local121 += 2;
				local91 = 0;
			} else {
				local91 = Static139.method2419(local121) + 1 - Static418.anInt7400;
				local121 = (local121 >> local91) + 2;
			}
			local59 = local56.aClass28_Sub3_9;
			local40 = 0;
			@Pc(153) int local153 = -2;
			@Pc(155) boolean local155 = true;
			@Pc(157) boolean local157 = true;
			while (local59 != local56) {
				this.anInt8709 = 0;
				for (@Pc(164) int local164 = 0; local164 < local121; local164++) {
					this.anIntArray490[local164] = 0;
				}
				for (@Pc(181) int local181 = 0; local181 < 64; local181++) {
					this.anIntArray488[local181] = 0;
				}
				while (local59 != local56) {
					@Pc(197) Class28_Sub3_Sub1 local197 = (Class28_Sub3_Sub1) local59;
					if (local157) {
						local153 = local197.anInt5580;
						local155 = local197.aBoolean481;
						local157 = false;
					}
					if (local40 > 0 && (local197.anInt5580 != local153 || local197.aBoolean481 != local155)) {
						local157 = true;
						break;
					}
					@Pc(243) int local243 = this.anIntArray489[local40++] - local50 >> local91;
					if (local243 < 1600) {
						if (this.anIntArray490[local243] < 64) {
							this.aClass28_Sub3_Sub1ArrayArray2[local243][this.anIntArray490[local243]++] = local197;
						} else {
							label106: {
								if (this.anIntArray490[local243] == 64) {
									if (this.anInt8709 == 64) {
										break label106;
									}
									this.anIntArray490[local243] += this.anInt8709++ + 1;
								}
								this.aClass28_Sub3_Sub1ArrayArray1[this.anIntArray490[local243] - 64 - 1][this.anIntArray488[this.anIntArray490[local243] - 64 - 1]++] = local197;
							}
						}
					}
					local59 = local59.aClass28_Sub3_9;
				}
				arg2.method4446(false, local153 < 0 ? -1 : local153, false);
				if (local155 && Static127.aFloat68 != arg2.aFloat99) {
					arg2.xa(Static127.aFloat68);
				} else if (arg2.aFloat99 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method7419(arg2, local121);
			}
		} catch (@Pc(378) Exception local378) {
		}
		this.method7422(arg2);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!gd;)V")
	private void method7422(@OriginalArg(1) Class65_Sub2 arg0) {
		arg0.method4445(true);
		arg0.method4377(true);
		if (arg0.aFloat99 != Static127.aFloat68) {
			arg0.xa(Static127.aFloat68);
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!gd;IZ)V")
	private void method7423(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1) {
		Static127.aFloat68 = arg0.aFloat99;
		arg0.method4352((float) arg1);
		arg0.method4367();
		arg0.method4377(false);
		arg0.method4445(false);
		arg0.method4443();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)V")
	public void method7424() {
		this.anInterface3_17.method8235();
	}
}
