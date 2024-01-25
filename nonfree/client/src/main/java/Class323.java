import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class323 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "[[Lclient!lg;")
	private final Class2_Sub6_Sub1[][] aClass2_Sub6_Sub1ArrayArray3 = new Class2_Sub6_Sub1[64][768];

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
	private final int[] anIntArray619 = new int[1600];

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "[I")
	private final int[] anIntArray620 = new int[8191];

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "[[Lclient!lg;")
	private final Class2_Sub6_Sub1[][] aClass2_Sub6_Sub1ArrayArray4 = new Class2_Sub6_Sub1[1600][64];

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "[I")
	private final int[] anIntArray621 = new int[64];

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	private int anInt9154 = 0;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Lclient!bfa;")
	private final Class34 aClass34_23;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Lclient!fw;")
	private final Interface12 anInterface12_17;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "Lclient!fw;")
	private final Interface12 anInterface12_18;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!pm;")
	private final Interface21 anInterface21_8;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!lba;)V")
	public Class323(@OriginalArg(0) Class132_Sub1 arg0) {
		this.aClass34_23 = arg0.method7549(new Class168[] { new Class168(new Class116[] { Static174.aClass116_1, Static174.aClass116_3, Static174.aClass116_5 }), new Class168(Static174.aClass116_2) });
		this.anInterface12_17 = arg0.method7564(true);
		this.anInterface12_18 = arg0.method7564(false);
		this.anInterface12_18.method8889(393168, 12);
		this.anInterface21_8 = arg0.method7532(false);
		this.anInterface21_8.method5800(49146);
		@Pc(98) Buffer local98 = this.anInterface21_8.method5806();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method7592(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.b(local115);
					local105.b(local115 + 1);
					local105.b(local115 + 2);
					local105.b(local115 + 2);
					local105.b(local115 + 3);
					local105.b(local115);
				}
			} else {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.c(local115);
					local105.c(local115 + 1);
					local105.c(local115 + 2);
					local105.c(local115 + 2);
					local105.c(local115 + 3);
					local105.c(local115);
				}
			}
			local105.c();
			this.anInterface21_8.method5808();
		}
		@Pc(200) Buffer local200 = this.anInterface12_18.method8888();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method7592(local200);
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
			this.anInterface12_18.method8891();
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!hda;ILclient!lba;)V")
	public void method7720(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132_Sub1 arg2) {
		if (arg2.aClass207_Sub3_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method7725(arg2);
		} else {
			this.method7727(arg2, arg1);
		}
		@Pc(37) float local37 = arg2.aClass207_Sub3_16.aFloat191;
		@Pc(41) float local41 = arg2.aClass207_Sub3_16.aFloat192;
		@Pc(45) float local45 = arg2.aClass207_Sub3_16.aFloat183;
		@Pc(49) float local49 = arg2.aClass207_Sub3_16.aFloat188;
		try {
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = Integer.MAX_VALUE;
			@Pc(55) int local55 = 0;
			@Pc(59) Class2_Sub6 local59 = arg0.aClass333_1.aClass2_Sub6_9;
			@Pc(62) Class2_Sub6 local62;
			@Pc(94) int local94;
			for (local62 = local59.aClass2_Sub6_8; local62 != local59; local62 = local62.aClass2_Sub6_8) {
				@Pc(67) Class2_Sub6_Sub1 local67 = (Class2_Sub6_Sub1) local62;
				local94 = (int) (local49 + (float) (local67.anInt2694 >> 12) * local45 + (float) (local67.anInt2695 >> 12) * local37 + local41 * (float) (local67.anInt2698 >> 12));
				if (local94 < local53) {
					local53 = local94;
				}
				this.anIntArray620[local51++] = local94;
				if (local94 > local55) {
					local55 = local94;
				}
			}
			@Pc(128) int local128 = local55 - local53;
			if (local128 + 2 > 1600) {
				local94 = Static503.method6621(local128) + 1 - Static36.anInt867;
				local128 = (local128 >> local94) + 2;
			} else {
				local94 = 0;
				local128 += 2;
			}
			local62 = local59.aClass2_Sub6_8;
			local51 = 0;
			@Pc(160) int local160 = -2;
			@Pc(162) boolean local162 = true;
			@Pc(164) boolean local164 = true;
			while (local59 != local62) {
				this.anInt9154 = 0;
				for (@Pc(171) int local171 = 0; local171 < local128; local171++) {
					this.anIntArray619[local171] = 0;
				}
				for (@Pc(188) int local188 = 0; local188 < 64; local188++) {
					this.anIntArray621[local188] = 0;
				}
				while (local62 != local59) {
					@Pc(204) Class2_Sub6_Sub1 local204 = (Class2_Sub6_Sub1) local62;
					if (local164) {
						local164 = false;
						local162 = local204.aBoolean168;
						local160 = local204.anInt2693;
					}
					if (local51 > 0 && (local204.anInt2693 != local160 || local204.aBoolean168 != local162)) {
						local164 = true;
						break;
					}
					@Pc(242) int local242 = this.anIntArray620[local51++] - local53 >> local94;
					if (local242 < 1600) {
						if (this.anIntArray619[local242] < 64) {
							this.aClass2_Sub6_Sub1ArrayArray4[local242][this.anIntArray619[local242]++] = local204;
						} else {
							label97: {
								if (this.anIntArray619[local242] == 64) {
									if (this.anInt9154 == 64) {
										break label97;
									}
									this.anIntArray619[local242] += this.anInt9154++ + 1;
								}
								@Pc(315) Class2_Sub6_Sub1[] local315 = this.aClass2_Sub6_Sub1ArrayArray3[this.anIntArray619[local242] - 64 - 1];
								@Pc(325) int local325 = this.anIntArray619[local242] - 64 - 1;
								@Pc(327) int local327 = this.anIntArray621[this.anIntArray619[local242] - 64 - 1];
								this.anIntArray621[local325] = this.anIntArray621[this.anIntArray619[local242] - 64 - 1] + 1;
								local315[local327] = local204;
							}
						}
					}
					local62 = local62.aClass2_Sub6_8;
				}
				arg2.method7610(false, false, local160 < 0 ? -1 : local160);
				if (local162 && Static399.aFloat80 != arg2.aFloat177) {
					arg2.xa(Static399.aFloat80);
				} else if (arg2.aFloat177 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method7721(arg2, local128);
			}
		} catch (@Pc(382) Exception local382) {
		}
		this.method7728(arg2);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!lba;II)V")
	private void method7721(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class207_Sub3 local11 = arg0.method7566();
		@Pc(14) float local14 = local11.aFloat194;
		@Pc(17) float local17 = local11.aFloat184;
		@Pc(20) float local20 = local11.aFloat186;
		@Pc(23) float local23 = local11.aFloat190;
		@Pc(26) float local26 = local11.aFloat187;
		@Pc(29) float local29 = local11.aFloat185;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local17 + local26;
		@Pc(41) float local41 = local29 + local20;
		@Pc(45) float local45 = local14 - local23;
		@Pc(50) float local50 = local17 - local26;
		@Pc(60) float local60 = local20 - local29;
		@Pc(64) float local64 = local23 - local14;
		@Pc(69) float local69 = local26 - local17;
		@Pc(73) float local73 = local29 - local20;
		@Pc(79) Buffer local79 = this.anInterface12_17.method8888();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg0.method7592(local79);
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class2_Sub6_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(448) float local448;
		@Pc(453) int local453;
		@Pc(393) int local393;
		@Pc(409) Class2_Sub6_Sub1 local409;
		@Pc(412) int local412;
		@Pc(425) byte local425;
		@Pc(430) byte local430;
		@Pc(442) float local442;
		if (Stream.b()) {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray619[local93] <= 64 ? this.anIntArray619[local93] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass2_Sub6_Sub1ArrayArray4[local93][local119];
						local131 = local128.anInt2699;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt2695 >> 12);
						local161 = (float) (local128.anInt2698 >> 12);
						local167 = (float) (local128.anInt2694 >> 12);
						local172 = local128.anInt2692 >> 12;
						local87.a((float) -local172 * local33 + local155);
						local87.a(local161 + (float) -local172 * local37);
						local87.a(local167 + local41 * (float) -local172);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a((float) local172 * local45 + local155);
						local87.a((float) local172 * local50 + local161);
						local87.a(local167 + local60 * (float) local172);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a(local33 * (float) local172 + local155);
						local87.a(local37 * (float) local172 + local161);
						local87.a(local167 + (float) local172 * local41);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local155 + (float) local172 * local64);
						local87.a((float) local172 * local69 + local161);
						local87.a(local73 * (float) local172 + local167);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.a(0.0F);
						local7++;
						local87.a(1.0F);
					}
					if (this.anIntArray619[local93] > 64) {
						local393 = this.anIntArray619[local93] - 64 - 1;
						for (local131 = this.anIntArray621[local393] - 1; local131 >= 0; local131--) {
							local409 = this.aClass2_Sub6_Sub1ArrayArray3[local393][local131];
							local412 = local409.anInt2699;
							local144 = (byte) (local412 >> 16);
							local149 = (byte) (local412 >> 8);
							local425 = (byte) local412;
							local430 = (byte) (local412 >>> 24);
							local167 = (float) (local409.anInt2695 >> 12);
							local442 = (float) (local409.anInt2698 >> 12);
							local448 = (float) (local409.anInt2694 >> 12);
							local453 = local409.anInt2692 >> 12;
							local87.a(local167 + local33 * (float) -local453);
							local87.a(local442 + (float) -local453 * local37);
							local87.a(local41 * (float) -local453 + local448);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local167 + local45 * (float) local453);
							local87.a(local50 * (float) local453 + local442);
							local87.a(local448 + (float) local453 * local60);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a(local33 * (float) local453 + local167);
							local87.a(local37 * (float) local453 + local442);
							local87.a(local448 + (float) local453 * local41);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a(local167 + local64 * (float) local453);
							local87.a(local442 + local69 * (float) local453);
							local87.a(local448 + (float) local453 * local73);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.a(0.0F);
							local87.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray619[local93] > 64 ? 64 : this.anIntArray619[local93];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass2_Sub6_Sub1ArrayArray4[local93][local119];
						local131 = local128.anInt2699;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = (float) (local128.anInt2695 >> 12);
						local161 = (float) (local128.anInt2698 >> 12);
						local167 = (float) (local128.anInt2694 >> 12);
						local172 = local128.anInt2692 >> 12;
						local87.b(local33 * (float) -local172 + local155);
						local87.b(local161 + local37 * (float) -local172);
						local87.b(local41 * (float) -local172 + local167);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b((float) local172 * local45 + local155);
						local87.b(local161 + (float) local172 * local50);
						local87.b(local60 * (float) local172 + local167);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b(local155 + (float) local172 * local33);
						local87.b((float) local172 * local37 + local161);
						local87.b(local167 + local41 * (float) local172);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b(local155 + (float) local172 * local64);
						local87.b(local161 + local69 * (float) local172);
						local87.b(local73 * (float) local172 + local167);
						if (arg0.anInt8981 == 0) {
							local87.b(local136, local141, local144, local149);
						} else {
							local87.a(local136, local141, local144, local149);
						}
						local87.b(0.0F);
						local7++;
						local87.b(1.0F);
					}
					if (this.anIntArray619[local93] > 64) {
						local393 = this.anIntArray619[local93] - 1 - 64;
						for (local131 = this.anIntArray621[local393] - 1; local131 >= 0; local131--) {
							local409 = this.aClass2_Sub6_Sub1ArrayArray3[local393][local131];
							local412 = local409.anInt2699;
							local144 = (byte) (local412 >> 16);
							local149 = (byte) (local412 >> 8);
							local425 = (byte) local412;
							local430 = (byte) (local412 >>> 24);
							local167 = (float) (local409.anInt2695 >> 12);
							local442 = (float) (local409.anInt2698 >> 12);
							local448 = (float) (local409.anInt2694 >> 12);
							local453 = local409.anInt2692 >> 12;
							local87.b((float) -local453 * local33 + local167);
							local87.b(local442 + (float) -local453 * local37);
							local87.b(local41 * (float) -local453 + local448);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local167 + (float) local453 * local45);
							local87.b(local442 + local50 * (float) local453);
							local87.b(local448 + (float) local453 * local60);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b((float) local453 * local33 + local167);
							local87.b(local37 * (float) local453 + local442);
							local87.b(local448 + (float) local453 * local41);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local167 + (float) local453 * local64);
							local87.b((float) local453 * local69 + local442);
							local87.b((float) local453 * local73 + local448);
							if (arg0.anInt8981 == 0) {
								local87.b(local144, local149, local425, local430);
							} else {
								local87.a(local144, local149, local425, local430);
							}
							local87.b(0.0F);
							local87.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local87.c();
		if (this.anInterface12_17.method8891()) {
			arg0.method7529(this.anInterface12_17, 0);
			arg0.method7529(this.anInterface12_18, 1);
			arg0.method7628(this.aClass34_23);
			arg0.method7573(0, Static122.aClass60_1, this.anInterface21_8, local7 * 2, 0, local7 * 4);
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public void method7724() {
		this.anInterface12_17.method8887();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!lba;I)V")
	private void method7725(@OriginalArg(0) Class132_Sub1 arg0) {
		Static399.aFloat80 = arg0.aFloat177;
		arg0.method7531();
		arg0.method7551(false);
		arg0.method7622(false);
		arg0.method7641();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!lba;)V")
	public void method7726(@OriginalArg(1) Class132_Sub1 arg0) {
		this.anInterface12_17.method8889(786336, 24);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!lba;IB)V")
	private void method7727(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static399.aFloat80 = arg0.aFloat177;
		arg0.method7557((float) arg1);
		arg0.method7601();
		arg0.method7551(false);
		arg0.method7622(false);
		arg0.method7641();
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(ILclient!lba;)V")
	private void method7728(@OriginalArg(1) Class132_Sub1 arg0) {
		arg0.method7622(true);
		arg0.method7551(true);
		if (arg0.aFloat177 != Static399.aFloat80) {
			arg0.xa(Static399.aFloat80);
		}
	}
}
