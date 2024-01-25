import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class43 {

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "[[Lclient!kga;")
	private final Class20_Sub6_Sub1[][] aClass20_Sub6_Sub1ArrayArray1 = new Class20_Sub6_Sub1[64][768];

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
	private int anInt1264 = 0;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "[I")
	private final int[] anIntArray90 = new int[64];

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "[I")
	private final int[] anIntArray92 = new int[8191];

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "[[Lclient!kga;")
	private final Class20_Sub6_Sub1[][] aClass20_Sub6_Sub1ArrayArray2 = new Class20_Sub6_Sub1[1600][64];

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "[I")
	private final int[] anIntArray93 = new int[1600];

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "Lclient!sr;")
	private final Class293 aClass293_1;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "Lclient!ll;")
	private final Interface17 anInterface17_1;

	@OriginalMember(owner = "client!bv", name = "d", descriptor = "Lclient!ll;")
	private final Interface17 anInterface17_2;

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!jf;")
	private final Interface11 anInterface11_1;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!wu;)V")
	public Class43(@OriginalArg(0) Class100_Sub1 arg0) {
		this.aClass293_1 = arg0.method6041(new Class41[] { new Class41(new Class362[] { Static610.aClass362_1, Static610.aClass362_3, Static610.aClass362_5 }), new Class41(Static610.aClass362_2) });
		this.anInterface17_1 = arg0.method6123(true);
		this.anInterface17_2 = arg0.method6123(false);
		this.anInterface17_2.method8440(12, 393168);
		this.anInterface11_1 = arg0.method6101(false);
		this.anInterface11_1.method8437(49146);
		@Pc(98) Buffer local98 = this.anInterface11_1.method3077();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6131(local98);
			@Pc(109) int local109;
			if (Stream.b()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
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
			this.anInterface11_1.method3078();
		}
		@Pc(200) Buffer local200 = this.anInterface17_2.method8438();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6131(local200);
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
			this.anInterface17_2.method8439();
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!wu;)V")
	public void method1051(@OriginalArg(1) Class100_Sub1 arg0) {
		this.anInterface17_1.method8440(24, 786336);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(ILclient!wu;)V")
	private void method1053(@OriginalArg(1) Class100_Sub1 arg0) {
		Static395.aFloat141 = arg0.aFloat126;
		arg0.method6150();
		arg0.method6056(false);
		arg0.method6133(false);
		arg0.method6096();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	public void method1056() {
		this.anInterface17_1.method8431();
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ZLclient!wu;)V")
	private void method1057(@OriginalArg(1) Class100_Sub1 arg0) {
		arg0.method6133(true);
		arg0.method6056(true);
		if (arg0.aFloat126 != Static395.aFloat141) {
			arg0.xa(Static395.aFloat141);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!wu;B)V")
	private void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) Class100_Sub1 arg1) {
		@Pc(11) int local11 = 0;
		@Pc(17) Class154_Sub2 local17 = arg1.method6077();
		@Pc(20) float local20 = local17.aFloat98;
		@Pc(23) float local23 = local17.aFloat95;
		@Pc(26) float local26 = local17.aFloat99;
		@Pc(29) float local29 = local17.aFloat101;
		@Pc(32) float local32 = local17.aFloat100;
		@Pc(35) float local35 = local17.aFloat103;
		@Pc(39) float local39 = local20 + local29;
		@Pc(43) float local43 = local23 + local32;
		@Pc(47) float local47 = local35 + local26;
		@Pc(51) float local51 = local20 - local29;
		@Pc(55) float local55 = local23 - local32;
		@Pc(60) float local60 = local26 - local35;
		@Pc(64) float local64 = local29 - local20;
		@Pc(69) float local69 = local32 - local23;
		@Pc(73) float local73 = local35 - local26;
		@Pc(79) Buffer local79 = this.anInterface17_1.method8438();
		if (local79 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg1.method6131(local79);
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(118) int local118;
		@Pc(127) Class20_Sub6_Sub1 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(447) float local447;
		@Pc(452) int local452;
		@Pc(392) int local392;
		@Pc(408) Class20_Sub6_Sub1 local408;
		@Pc(411) int local411;
		@Pc(424) byte local424;
		@Pc(429) byte local429;
		@Pc(441) float local441;
		if (Stream.b()) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray93[local95] <= 64 ? this.anIntArray93[local95] : 64;
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass20_Sub6_Sub1ArrayArray2[local95][local118];
						local130 = local127.anInt8660;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = (float) (local127.anInt8658 >> 12);
						local160 = (float) (local127.anInt8662 >> 12);
						local166 = (float) (local127.anInt8661 >> 12);
						local171 = local127.anInt8657 >> 12;
						local89.a((float) -local171 * local39 + local154);
						local89.a(local160 + local43 * (float) -local171);
						local89.a(local47 * (float) -local171 + local166);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local154 + (float) local171 * local51);
						local89.a(local55 * (float) local171 + local160);
						local89.a(local166 + local60 * (float) local171);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local154 + local39 * (float) local171);
						local89.a(local43 * (float) local171 + local160);
						local89.a(local166 + local47 * (float) local171);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a(local64 * (float) local171 + local154);
						local89.a((float) local171 * local69 + local160);
						local89.a(local166 + (float) local171 * local73);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.a(0.0F);
						local89.a(1.0F);
						local11++;
					}
					if (this.anIntArray93[local95] > 64) {
						local392 = this.anIntArray93[local95] - 65;
						for (local130 = this.anIntArray90[local392] - 1; local130 >= 0; local130--) {
							local408 = this.aClass20_Sub6_Sub1ArrayArray1[local392][local130];
							local411 = local408.anInt8660;
							local143 = (byte) (local411 >> 16);
							local148 = (byte) (local411 >> 8);
							local424 = (byte) local411;
							local429 = (byte) (local411 >>> 24);
							local166 = (float) (local408.anInt8658 >> 12);
							local441 = (float) (local408.anInt8662 >> 12);
							local447 = (float) (local408.anInt8661 >> 12);
							local452 = local408.anInt8657 >> 12;
							local89.a(local166 + local39 * (float) -local452);
							local89.a(local43 * (float) -local452 + local441);
							local89.a(local447 + local47 * (float) -local452);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a(local51 * (float) local452 + local166);
							local89.a((float) local452 * local55 + local441);
							local89.a(local447 + (float) local452 * local60);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a((float) local452 * local39 + local166);
							local89.a(local441 + local43 * (float) local452);
							local89.a(local447 + local47 * (float) local452);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local166 + local64 * (float) local452);
							local89.a(local441 + (float) local452 * local69);
							local89.a(local447 + (float) local452 * local73);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.a(0.0F);
							local11++;
							local89.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray93[local95] <= 64 ? this.anIntArray93[local95] : 64;
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass20_Sub6_Sub1ArrayArray2[local95][local118];
						local130 = local127.anInt8660;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = (float) (local127.anInt8658 >> 12);
						local160 = (float) (local127.anInt8662 >> 12);
						local166 = (float) (local127.anInt8661 >> 12);
						local171 = local127.anInt8657 >> 12;
						local89.b(local39 * (float) -local171 + local154);
						local89.b(local43 * (float) -local171 + local160);
						local89.b(local166 + local47 * (float) -local171);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b(local154 + local51 * (float) local171);
						local89.b(local160 + local55 * (float) local171);
						local89.b(local166 + local60 * (float) local171);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b((float) local171 * local39 + local154);
						local89.b(local160 + (float) local171 * local43);
						local89.b(local166 + local47 * (float) local171);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b((float) local171 * local64 + local154);
						local89.b(local69 * (float) local171 + local160);
						local89.b(local73 * (float) local171 + local166);
						if (arg1.anInt7154 == 0) {
							local89.a(local135, local140, local143, local148);
						} else {
							local89.b(local135, local140, local143, local148);
						}
						local89.b(0.0F);
						local11++;
						local89.b(1.0F);
					}
					if (this.anIntArray93[local95] > 64) {
						local392 = this.anIntArray93[local95] - 64 - 1;
						for (local130 = this.anIntArray90[local392] - 1; local130 >= 0; local130--) {
							local408 = this.aClass20_Sub6_Sub1ArrayArray1[local392][local130];
							local411 = local408.anInt8660;
							local143 = (byte) (local411 >> 16);
							local148 = (byte) (local411 >> 8);
							local424 = (byte) local411;
							local429 = (byte) (local411 >>> 24);
							local166 = (float) (local408.anInt8658 >> 12);
							local441 = (float) (local408.anInt8662 >> 12);
							local447 = (float) (local408.anInt8661 >> 12);
							local452 = local408.anInt8657 >> 12;
							local89.b(local166 + local39 * (float) -local452);
							local89.b(local441 + local43 * (float) -local452);
							local89.b(local447 + local47 * (float) -local452);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local166 + (float) local452 * local51);
							local89.b(local441 + local55 * (float) local452);
							local89.b((float) local452 * local60 + local447);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b(local166 + (float) local452 * local39);
							local89.b(local43 * (float) local452 + local441);
							local89.b(local47 * (float) local452 + local447);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local166 + (float) local452 * local64);
							local89.b(local69 * (float) local452 + local441);
							local89.b(local447 + local73 * (float) local452);
							if (arg1.anInt7154 == 0) {
								local89.a(local143, local148, local424, local429);
							} else {
								local89.b(local143, local148, local424, local429);
							}
							local89.b(0.0F);
							local11++;
							local89.b(1.0F);
						}
					}
				}
			}
		}
		local89.c();
		if (this.anInterface17_1.method8439()) {
			arg1.method6128(0, this.anInterface17_1);
			arg1.method6128(1, this.anInterface17_2);
			arg1.method6107(this.aClass293_1);
			arg1.method6064(local11 * 2, 0, local11 * 4, 0, this.anInterface11_1, Static295.aClass77_2);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!wu;IBLclient!of;)V")
	public void method1060(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class236 arg2) {
		if (arg0.aClass154_Sub2_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method1053(arg0);
		} else {
			this.method1061(arg0, arg1);
		}
		@Pc(29) float local29 = arg0.aClass154_Sub2_16.aFloat105;
		@Pc(33) float local33 = arg0.aClass154_Sub2_16.aFloat97;
		@Pc(37) float local37 = arg0.aClass154_Sub2_16.aFloat102;
		@Pc(41) float local41 = arg0.aClass154_Sub2_16.aFloat94;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class20_Sub6 local51 = arg2.aClass157_1.aClass20_Sub6_1;
			@Pc(54) Class20_Sub6 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass20_Sub6_9; local54 != local51; local54 = local54.aClass20_Sub6_9) {
				@Pc(59) Class20_Sub6_Sub1 local59 = (Class20_Sub6_Sub1) local54;
				local86 = (int) (local41 + (float) (local59.anInt8661 >> 12) * local37 + (float) (local59.anInt8658 >> 12) * local29 + local33 * (float) (local59.anInt8662 >> 12));
				this.anIntArray92[local43++] = local86;
				if (local47 < local86) {
					local47 = local86;
				}
				if (local86 < local45) {
					local45 = local86;
				}
			}
			@Pc(120) int local120 = local47 - local45;
			if (local120 + 2 <= 1600) {
				local86 = 0;
				local120 += 2;
			} else {
				local86 = Static88.method1511(local120) + 1 - Static646.anInt7035;
				local120 = (local120 >> local86) + 2;
			}
			local43 = 0;
			local54 = local51.aClass20_Sub6_9;
			@Pc(154) int local154 = -2;
			@Pc(156) boolean local156 = true;
			@Pc(158) boolean local158 = true;
			while (local54 != local51) {
				this.anInt1264 = 0;
				for (@Pc(165) int local165 = 0; local165 < local120; local165++) {
					this.anIntArray93[local165] = 0;
				}
				for (@Pc(182) int local182 = 0; local182 < 64; local182++) {
					this.anIntArray90[local182] = 0;
				}
				while (local54 != local51) {
					@Pc(198) Class20_Sub6_Sub1 local198 = (Class20_Sub6_Sub1) local54;
					if (local158) {
						local156 = local198.aBoolean579;
						local154 = local198.anInt8663;
						local158 = false;
					}
					if (local43 > 0 && (local198.anInt8663 != local154 || local198.aBoolean579 != local156)) {
						local158 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray92[local43++] - local45 >> local86;
					if (local237 < 1600) {
						if (this.anIntArray93[local237] >= 64) {
							label101: {
								if (this.anIntArray93[local237] == 64) {
									if (this.anInt1264 == 64) {
										break label101;
									}
									this.anIntArray93[local237] += this.anInt1264++ + 1;
								}
								@Pc(288) Class20_Sub6_Sub1[] local288 = this.aClass20_Sub6_Sub1ArrayArray1[this.anIntArray93[local237] - 64 - 1];
								@Pc(298) int local298 = this.anIntArray93[local237] - 64 - 1;
								@Pc(300) int local300 = this.anIntArray90[this.anIntArray93[local237] - 64 - 1];
								this.anIntArray90[local298] = this.anIntArray90[this.anIntArray93[local237] - 64 - 1] + 1;
								local288[local300] = local198;
							}
						} else {
							this.aClass20_Sub6_Sub1ArrayArray2[local237][this.anIntArray93[local237]++] = local198;
						}
					}
					local54 = local54.aClass20_Sub6_9;
				}
				arg0.method6137(false, false, local154 < 0 ? -1 : local154);
				if (local156 && Static395.aFloat141 != arg0.aFloat126) {
					arg0.xa(Static395.aFloat141);
				} else if (arg0.aFloat126 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method1058(local120, arg0);
			}
		} catch (@Pc(376) Exception local376) {
		}
		this.method1057(arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!wu;II)V")
	private void method1061(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static395.aFloat141 = arg0.aFloat126;
		arg0.method6032((float) arg1);
		arg0.method6121();
		arg0.method6056(false);
		arg0.method6133(false);
		arg0.method6096();
	}
}
