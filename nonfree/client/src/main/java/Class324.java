import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class324 {

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
	private int anInt9270 = 0;

	@OriginalMember(owner = "client!rl", name = "r", descriptor = "[I")
	private final int[] anIntArray511 = new int[8191];

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[I")
	private final int[] anIntArray512 = new int[1600];

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "[[Lclient!u;")
	private final Class19_Sub4_Sub1[][] aClass19_Sub4_Sub1ArrayArray4 = new Class19_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "[[Lclient!u;")
	private final Class19_Sub4_Sub1[][] aClass19_Sub4_Sub1ArrayArray3 = new Class19_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!rl", name = "q", descriptor = "[I")
	private final int[] anIntArray510 = new int[64];

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "Lclient!kn;")
	private final Class212 aClass212_22;

	@OriginalMember(owner = "client!rl", name = "v", descriptor = "Lclient!lq;")
	private final Interface16 anInterface16_13;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "Lclient!lq;")
	private final Interface16 anInterface16_12;

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!fh;")
	private final Interface5 anInterface5_8;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!nb;)V")
	public Class324(@OriginalArg(0) Class67_Sub1 arg0) {
		this.aClass212_22 = arg0.method5570(new Class147[] { new Class147(new Class134[] { Static219.aClass134_1, Static219.aClass134_3, Static219.aClass134_5 }), new Class147(Static219.aClass134_2) });
		this.anInterface16_13 = arg0.method5649(true);
		this.anInterface16_12 = arg0.method5649(false);
		this.anInterface16_12.method7121(12, 393168);
		this.anInterface5_8 = arg0.method5684(false);
		this.anInterface5_8.method9248(49146);
		@Pc(98) Buffer local98 = this.anInterface5_8.method9252();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5616(local98);
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
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			}
			local105.a();
			this.anInterface5_8.method9250();
		}
		@Pc(206) Buffer local206 = this.anInterface16_12.method7122();
		if (local206 != null) {
			@Pc(213) Stream local213 = arg0.method5616(local206);
			if (Stream.b()) {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
					local213.a(0.0F);
					local213.a(-1.0F);
					local213.a(0.0F);
				}
			} else {
				for (local115 = 0; local115 < 8191; local115++) {
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
					local213.b(0.0F);
					local213.b(-1.0F);
					local213.b(0.0F);
				}
			}
			local213.a();
			this.anInterface16_12.method7124();
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	public void method7801() {
		this.anInterface16_13.method9249();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZLclient!nb;)V")
	private void method7803(@OriginalArg(0) int arg0, @OriginalArg(2) Class67_Sub1 arg1) {
		Static629.aFloat192 = arg1.aFloat121;
		arg1.method5615((float) arg0);
		arg1.method5653();
		arg1.method5628(false);
		arg1.method5652(false);
		arg1.method5650();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!nb;)V")
	private void method7804(@OriginalArg(1) Class67_Sub1 arg0) {
		Static629.aFloat192 = arg0.aFloat121;
		arg0.method5577();
		arg0.method5628(false);
		arg0.method5652(false);
		arg0.method5650();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!nb;I)V")
	private void method7806(@OriginalArg(0) Class67_Sub1 arg0) {
		arg0.method5652(true);
		arg0.method5628(true);
		if (Static629.aFloat192 != arg0.aFloat121) {
			arg0.xa(Static629.aFloat192);
		}
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lclient!nb;I)V")
	public void method7808(@OriginalArg(0) Class67_Sub1 arg0) {
		this.anInterface16_13.method7121(24, 786336);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!hu;ILclient!nb;)V")
	public void method7809(@OriginalArg(1) Class162 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class67_Sub1 arg2) {
		if (arg2.aClass181_Sub1_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method7804(arg2);
		} else {
			this.method7803(arg1, arg2);
		}
		@Pc(31) float local31 = arg2.aClass181_Sub1_16.aFloat105;
		@Pc(35) float local35 = arg2.aClass181_Sub1_16.aFloat101;
		@Pc(39) float local39 = arg2.aClass181_Sub1_16.aFloat107;
		@Pc(43) float local43 = arg2.aClass181_Sub1_16.aFloat106;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(54) int local54 = 0;
			@Pc(58) Class19_Sub4 local58 = arg0.aClass372_1.aClass19_Sub4_9;
			@Pc(61) Class19_Sub4 local61;
			@Pc(93) int local93;
			for (local61 = local58.aClass19_Sub4_7; local61 != local58; local61 = local61.aClass19_Sub4_7) {
				@Pc(66) Class19_Sub4_Sub1 local66 = (Class19_Sub4_Sub1) local61;
				local93 = (int) (local43 + (float) (local66.anInt3429 >> 12) * local39 + (float) (local66.anInt3427 >> 12) * local31 + (float) (local66.anInt3425 >> 12) * local35);
				if (local54 < local93) {
					local54 = local93;
				}
				if (local93 < local47) {
					local47 = local93;
				}
				this.anIntArray511[local45++] = local93;
			}
			@Pc(128) int local128 = local54 - local47;
			if (local128 + 2 > 1600) {
				local93 = Static700.method9156(local128) + 1 - Static551.anInt9229;
				local128 = (local128 >> local93) + 2;
			} else {
				local128 += 2;
				local93 = 0;
			}
			local61 = local58.aClass19_Sub4_7;
			local45 = 0;
			@Pc(159) int local159 = -2;
			@Pc(161) boolean local161 = true;
			@Pc(163) boolean local163 = true;
			while (local61 != local58) {
				this.anInt9270 = 0;
				for (@Pc(172) int local172 = 0; local172 < local128; local172++) {
					this.anIntArray512[local172] = 0;
				}
				for (@Pc(187) int local187 = 0; local187 < 64; local187++) {
					this.anIntArray510[local187] = 0;
				}
				while (local61 != local58) {
					@Pc(211) Class19_Sub4_Sub1 local211 = (Class19_Sub4_Sub1) local61;
					if (local163) {
						local159 = local211.anInt3422;
						local163 = false;
						local161 = local211.aBoolean279;
					}
					if (local45 > 0 && (local159 != local211.anInt3422 || local161 != local211.aBoolean279)) {
						local163 = true;
						break;
					}
					@Pc(250) int local250 = this.anIntArray511[local45++] - local47 >> local93;
					if (local250 < 1600) {
						if (this.anIntArray512[local250] >= 64) {
							label97: {
								if (this.anIntArray512[local250] == 64) {
									if (this.anInt9270 == 64) {
										break label97;
									}
									this.anIntArray512[local250] += this.anInt9270++ + 1;
								}
								this.aClass19_Sub4_Sub1ArrayArray3[this.anIntArray512[local250] - 65][this.anIntArray510[this.anIntArray512[local250] - 64 - 1]++] = local211;
							}
						} else {
							this.aClass19_Sub4_Sub1ArrayArray4[local250][this.anIntArray512[local250]++] = local211;
						}
					}
					local61 = local61.aClass19_Sub4_7;
				}
				arg2.method5575(false, false, local159 >= 0 ? local159 : -1);
				if (local161 && Static629.aFloat192 != arg2.aFloat121) {
					arg2.xa(Static629.aFloat192);
				} else if (arg2.aFloat121 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method7810(arg2, local128);
			}
		} catch (@Pc(408) Exception local408) {
		}
		this.method7806(arg2);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILclient!nb;I)V")
	private void method7810(@OriginalArg(1) Class67_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class181_Sub1 local11 = arg0.method5578();
		@Pc(19) float local19 = local11.aFloat100;
		@Pc(22) float local22 = local11.aFloat99;
		@Pc(25) float local25 = local11.aFloat108;
		@Pc(28) float local28 = local11.aFloat104;
		@Pc(31) float local31 = local11.aFloat98;
		@Pc(34) float local34 = local11.aFloat102;
		@Pc(38) float local38 = local28 + local19;
		@Pc(42) float local42 = local31 + local22;
		@Pc(46) float local46 = local34 + local25;
		@Pc(50) float local50 = local19 - local28;
		@Pc(54) float local54 = local22 - local31;
		@Pc(58) float local58 = local25 - local34;
		@Pc(63) float local63 = local28 - local19;
		@Pc(68) float local68 = local31 - local22;
		@Pc(72) float local72 = local34 - local25;
		@Pc(78) Buffer local78 = this.anInterface16_13.method7122();
		if (local78 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg0.method5616(local78);
		@Pc(95) int local95;
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(132) Class19_Sub4_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(469) float local469;
		@Pc(474) int local474;
		@Pc(414) int local414;
		@Pc(430) Class19_Sub4_Sub1 local430;
		@Pc(433) int local433;
		@Pc(446) byte local446;
		@Pc(451) byte local451;
		@Pc(463) float local463;
		if (Stream.b()) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local115 = this.anIntArray512[local95] <= 64 ? this.anIntArray512[local95] : 64;
				if (local115 > 0) {
					for (local121 = local115 - 1; local121 >= 0; local121--) {
						local132 = this.aClass19_Sub4_Sub1ArrayArray4[local95][local121];
						local135 = local132.anInt3423;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = (float) (local132.anInt3427 >> 12);
						local165 = (float) (local132.anInt3425 >> 12);
						local171 = (float) (local132.anInt3429 >> 12);
						local176 = local132.anInt3428 >> 12;
						local89.a(local159 + local38 * (float) -local176);
						local89.a((float) -local176 * local42 + local165);
						local89.a(local171 + (float) -local176 * local46);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local159 + (float) local176 * local50);
						local89.a(local165 + (float) local176 * local54);
						local89.a((float) local176 * local58 + local171);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local38 * (float) local176 + local159);
						local89.a(local165 + (float) local176 * local42);
						local89.a(local46 * (float) local176 + local171);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a(local159 + local63 * (float) local176);
						local89.a(local68 * (float) local176 + local165);
						local89.a((float) local176 * local72 + local171);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.a(0.0F);
						local7++;
						local89.a(1.0F);
					}
					if (this.anIntArray512[local95] > 64) {
						local414 = this.anIntArray512[local95] - 1 - 64;
						for (local135 = this.anIntArray510[local414] - 1; local135 >= 0; local135--) {
							local430 = this.aClass19_Sub4_Sub1ArrayArray3[local414][local135];
							local433 = local430.anInt3423;
							local148 = (byte) (local433 >> 16);
							local153 = (byte) (local433 >> 8);
							local446 = (byte) local433;
							local451 = (byte) (local433 >>> 24);
							local171 = (float) (local430.anInt3427 >> 12);
							local463 = (float) (local430.anInt3425 >> 12);
							local469 = (float) (local430.anInt3429 >> 12);
							local474 = local430.anInt3428 >> 12;
							local89.a(local38 * (float) -local474 + local171);
							local89.a(local42 * (float) -local474 + local463);
							local89.a(local46 * (float) -local474 + local469);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a(local171 + (float) local474 * local50);
							local89.a((float) local474 * local54 + local463);
							local89.a((float) local474 * local58 + local469);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a(local171 + (float) local474 * local38);
							local89.a(local42 * (float) local474 + local463);
							local89.a(local469 + (float) local474 * local46);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local171 + local63 * (float) local474);
							local89.a(local463 + (float) local474 * local68);
							local89.a((float) local474 * local72 + local469);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.a(0.0F);
							local89.a(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local115 = this.anIntArray512[local95] > 64 ? 64 : this.anIntArray512[local95];
				if (local115 > 0) {
					for (local121 = local115 - 1; local121 >= 0; local121--) {
						local132 = this.aClass19_Sub4_Sub1ArrayArray4[local95][local121];
						local135 = local132.anInt3423;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = (float) (local132.anInt3427 >> 12);
						local165 = (float) (local132.anInt3425 >> 12);
						local171 = (float) (local132.anInt3429 >> 12);
						local176 = local132.anInt3428 >> 12;
						local89.b((float) -local176 * local38 + local159);
						local89.b(local165 + local42 * (float) -local176);
						local89.b(local171 + local46 * (float) -local176);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b(local159 + local50 * (float) local176);
						local89.b((float) local176 * local54 + local165);
						local89.b(local171 + (float) local176 * local58);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b(local159 + local38 * (float) local176);
						local89.b((float) local176 * local42 + local165);
						local89.b((float) local176 * local46 + local171);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b(local63 * (float) local176 + local159);
						local89.b((float) local176 * local68 + local165);
						local89.b(local171 + (float) local176 * local72);
						if (arg0.anInt6670 == 0) {
							local89.b(local140, local145, local148, local153);
						} else {
							local89.a(local140, local145, local148, local153);
						}
						local89.b(0.0F);
						local7++;
						local89.b(1.0F);
					}
					if (this.anIntArray512[local95] > 64) {
						local414 = this.anIntArray512[local95] - 64 - 1;
						for (local135 = this.anIntArray510[local414] - 1; local135 >= 0; local135--) {
							local430 = this.aClass19_Sub4_Sub1ArrayArray3[local414][local135];
							local433 = local430.anInt3423;
							local148 = (byte) (local433 >> 16);
							local153 = (byte) (local433 >> 8);
							local446 = (byte) local433;
							local451 = (byte) (local433 >>> 24);
							local171 = (float) (local430.anInt3427 >> 12);
							local463 = (float) (local430.anInt3425 >> 12);
							local469 = (float) (local430.anInt3429 >> 12);
							local474 = local430.anInt3428 >> 12;
							local89.b(local171 + local38 * (float) -local474);
							local89.b((float) -local474 * local42 + local463);
							local89.b(local46 * (float) -local474 + local469);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local171 + (float) local474 * local50);
							local89.b(local54 * (float) local474 + local463);
							local89.b(local469 + local58 * (float) local474);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b((float) local474 * local38 + local171);
							local89.b(local42 * (float) local474 + local463);
							local89.b(local469 + local46 * (float) local474);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b((float) local474 * local63 + local171);
							local89.b(local463 + local68 * (float) local474);
							local89.b(local469 + local72 * (float) local474);
							if (arg0.anInt6670 == 0) {
								local89.b(local148, local153, local446, local451);
							} else {
								local89.a(local148, local153, local446, local451);
							}
							local89.b(0.0F);
							local7++;
							local89.b(1.0F);
						}
					}
				}
			}
		}
		local89.a();
		if (this.anInterface16_13.method7124()) {
			arg0.method5620(this.anInterface16_13, 0);
			arg0.method5620(this.anInterface16_12, 1);
			arg0.method5569(this.aClass212_22);
			arg0.method5659(this.anInterface5_8, 0, local7 * 4, local7 * 2, 0, Static508.aClass281_7);
		}
	}
}
