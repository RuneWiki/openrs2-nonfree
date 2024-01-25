import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class362 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
	private final int[] anIntArray625 = new int[64];

	@OriginalMember(owner = "client!um", name = "l", descriptor = "[[Lclient!ln;")
	private final Class23_Sub1_Sub2[][] aClass23_Sub1_Sub2ArrayArray4 = new Class23_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[I")
	private final int[] anIntArray626 = new int[1600];

	@OriginalMember(owner = "client!um", name = "r", descriptor = "I")
	private int anInt9540 = 0;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[I")
	private final int[] anIntArray624 = new int[8191];

	@OriginalMember(owner = "client!um", name = "e", descriptor = "[[Lclient!ln;")
	private final Class23_Sub1_Sub2[][] aClass23_Sub1_Sub2ArrayArray3 = new Class23_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!um", name = "s", descriptor = "Lclient!wp;")
	private final Class277 aClass277_23;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!mha;")
	private final Interface16 anInterface16_18;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "Lclient!mha;")
	private final Interface16 anInterface16_17;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "Lclient!ta;")
	private final Interface22 anInterface22_6;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class362(@OriginalArg(0) Class16_Sub1 arg0) {
		this.aClass277_23 = arg0.method6271(new Class355[] { new Class355(new Class37[] { Static45.aClass37_1, Static45.aClass37_3, Static45.aClass37_5 }), new Class355(Static45.aClass37_2) });
		this.anInterface16_18 = arg0.method6244(true);
		this.anInterface16_17 = arg0.method6244(false);
		this.anInterface16_17.method6040(393168, 12);
		this.anInterface22_6 = arg0.method6262(false);
		this.anInterface22_6.method7734(49146);
		@Pc(98) Buffer local98 = this.anInterface22_6.method7739();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method6328(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
				for (local109 = 0; local109 < 8191; local109++) {
					local115 = local109 * 4;
					local105.e(local115);
					local105.e(local115 + 1);
					local105.e(local115 + 2);
					local105.e(local115 + 2);
					local105.e(local115 + 3);
					local105.e(local115);
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
			local105.b();
			this.anInterface22_6.method7738();
		}
		@Pc(200) Buffer local200 = this.anInterface16_17.method6041();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method6328(local200);
			if (Stream.c()) {
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
			local207.b();
			this.anInterface16_17.method6039();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!sf;B)V")
	public void method8064(@OriginalArg(0) Class16_Sub1 arg0) {
		this.anInterface16_18.method6040(786336, 24);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!sf;ILclient!mf;)V")
	public void method8065(@OriginalArg(1) Class16_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class237 arg2) {
		if (arg0.aClass25_Sub3_16 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method8071(arg0);
		} else {
			this.method8066(arg1, arg0);
		}
		@Pc(31) float local31 = arg0.aClass25_Sub3_16.aFloat131;
		@Pc(35) float local35 = arg0.aClass25_Sub3_16.aFloat125;
		@Pc(39) float local39 = arg0.aClass25_Sub3_16.aFloat124;
		@Pc(43) float local43 = arg0.aClass25_Sub3_16.aFloat122;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(57) int local57 = 0;
			@Pc(61) Class23_Sub1 local61 = arg2.aClass125_1.aClass23_Sub1_5;
			@Pc(64) Class23_Sub1 local64;
			@Pc(96) int local96;
			for (local64 = local61.aClass23_Sub1_9; local64 != local61; local64 = local64.aClass23_Sub1_9) {
				@Pc(69) Class23_Sub1_Sub2 local69 = (Class23_Sub1_Sub2) local64;
				local96 = (int) ((float) (local69.anInt7850 >> 12) * local39 + (float) (local69.anInt7853 >> 12) * local35 + local31 * (float) (local69.anInt7855 >> 12) + local43);
				if (local96 < local47) {
					local47 = local96;
				}
				this.anIntArray624[local45++] = local96;
				if (local57 < local96) {
					local57 = local96;
				}
			}
			@Pc(127) int local127 = local57 - local47;
			if (local127 + 2 <= 1600) {
				local96 = 0;
				local127 += 2;
			} else {
				local96 = Static289.method7950(local127) + 1 - Static402.anInt6874;
				local127 = (local127 >> local96) + 2;
			}
			local64 = local61.aClass23_Sub1_9;
			local45 = 0;
			@Pc(158) int local158 = -2;
			@Pc(160) boolean local160 = true;
			@Pc(162) boolean local162 = true;
			while (local61 != local64) {
				this.anInt9540 = 0;
				for (@Pc(169) int local169 = 0; local169 < local127; local169++) {
					this.anIntArray626[local169] = 0;
				}
				for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
					this.anIntArray625[local186] = 0;
				}
				while (local64 != local61) {
					@Pc(202) Class23_Sub1_Sub2 local202 = (Class23_Sub1_Sub2) local64;
					if (local162) {
						local162 = false;
						local158 = local202.anInt7852;
						local160 = local202.aBoolean594;
					}
					if (local45 > 0 && (local158 != local202.anInt7852 || local160 != local202.aBoolean594)) {
						local162 = true;
						break;
					}
					@Pc(248) int local248 = this.anIntArray624[local45++] - local47 >> local96;
					if (local248 < 1600) {
						if (this.anIntArray626[local248] >= 64) {
							label106: {
								if (this.anIntArray626[local248] == 64) {
									if (this.anInt9540 == 64) {
										break label106;
									}
									this.anIntArray626[local248] += this.anInt9540++ + 1;
								}
								@Pc(293) Class23_Sub1_Sub2[] local293 = this.aClass23_Sub1_Sub2ArrayArray3[this.anIntArray626[local248] - 65];
								@Pc(303) int local303 = this.anIntArray626[local248] - 64 - 1;
								@Pc(305) int local305 = this.anIntArray625[this.anIntArray626[local248] - 64 - 1];
								this.anIntArray625[local303] = this.anIntArray625[this.anIntArray626[local248] - 64 - 1] + 1;
								local293[local305] = local202;
							}
						} else {
							this.aClass23_Sub1_Sub2ArrayArray4[local248][this.anIntArray626[local248]++] = local202;
						}
					}
					local64 = local64.aClass23_Sub1_9;
				}
				arg0.method6264(local158 >= 0 ? local158 : -1, false, false);
				if (local160 && arg0.aFloat157 != Static288.aFloat133) {
					arg0.xa(Static288.aFloat133);
				} else if (arg0.aFloat157 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method8070(local127, arg0);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method8072(arg0);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(BILclient!sf;)V")
	private void method8066(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1) {
		Static288.aFloat133 = arg1.aFloat157;
		arg1.method6286((float) arg0);
		arg1.method6290();
		arg1.method6259(false);
		arg1.method6232(false);
		arg1.method6279();
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	public void method8069() {
		this.anInterface16_18.method7731();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!sf;I)V")
	private void method8070(@OriginalArg(0) int arg0, @OriginalArg(1) Class16_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class25_Sub3 local11 = arg1.method6198();
		@Pc(14) float local14 = local11.aFloat121;
		@Pc(17) float local17 = local11.aFloat120;
		@Pc(20) float local20 = local11.aFloat126;
		@Pc(23) float local23 = local11.aFloat127;
		@Pc(26) float local26 = local11.aFloat130;
		@Pc(29) float local29 = local11.aFloat123;
		@Pc(33) float local33 = local23 + local14;
		@Pc(37) float local37 = local26 + local17;
		@Pc(46) float local46 = local29 + local20;
		@Pc(50) float local50 = local14 - local23;
		@Pc(55) float local55 = local17 - local26;
		@Pc(60) float local60 = local20 - local29;
		@Pc(64) float local64 = local23 - local14;
		@Pc(68) float local68 = local26 - local17;
		@Pc(73) float local73 = local29 - local20;
		@Pc(79) Buffer local79 = this.anInterface16_18.method6041();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg1.method6328(local79);
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(126) Class23_Sub1_Sub2 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(447) float local447;
		@Pc(452) int local452;
		@Pc(392) int local392;
		@Pc(408) Class23_Sub1_Sub2 local408;
		@Pc(411) int local411;
		@Pc(424) byte local424;
		@Pc(429) byte local429;
		@Pc(441) float local441;
		if (Stream.c()) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray626[local93] <= 64 ? this.anIntArray626[local93] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass23_Sub1_Sub2ArrayArray4[local93][local117];
						local129 = local126.anInt7856;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt7855 >> 12);
						local159 = (float) (local126.anInt7853 >> 12);
						local165 = (float) (local126.anInt7850 >> 12);
						local170 = local126.anInt7857 >> 12;
						local87.b((float) -local170 * local33 + local153);
						local87.b((float) -local170 * local37 + local159);
						local87.b(local46 * (float) -local170 + local165);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local153 + (float) local170 * local50);
						local87.b((float) local170 * local55 + local159);
						local87.b(local60 * (float) local170 + local165);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b((float) local170 * local33 + local153);
						local87.b(local159 + (float) local170 * local37);
						local87.b(local165 + (float) local170 * local46);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b((float) local170 * local64 + local153);
						local87.b(local159 + local68 * (float) local170);
						local87.b((float) local170 * local73 + local165);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.b(0.0F);
						local7++;
						local87.b(1.0F);
					}
					if (this.anIntArray626[local93] > 64) {
						local392 = this.anIntArray626[local93] - 64 - 1;
						for (local129 = this.anIntArray625[local392] - 1; local129 >= 0; local129--) {
							local408 = this.aClass23_Sub1_Sub2ArrayArray3[local392][local129];
							local411 = local408.anInt7856;
							local142 = (byte) (local411 >> 16);
							local147 = (byte) (local411 >> 8);
							local424 = (byte) local411;
							local429 = (byte) (local411 >>> 24);
							local165 = (float) (local408.anInt7855 >> 12);
							local441 = (float) (local408.anInt7853 >> 12);
							local447 = (float) (local408.anInt7850 >> 12);
							local452 = local408.anInt7857 >> 12;
							local87.b(local165 + local33 * (float) -local452);
							local87.b(local37 * (float) -local452 + local441);
							local87.b(local46 * (float) -local452 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b(local50 * (float) local452 + local165);
							local87.b(local441 + (float) local452 * local55);
							local87.b(local60 * (float) local452 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b(local33 * (float) local452 + local165);
							local87.b(local441 + (float) local452 * local37);
							local87.b((float) local452 * local46 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local165 + (float) local452 * local64);
							local87.b(local68 * (float) local452 + local441);
							local87.b(local73 * (float) local452 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.b(0.0F);
							local87.b(1.0F);
							local7++;
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray626[local93] <= 64 ? this.anIntArray626[local93] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass23_Sub1_Sub2ArrayArray4[local93][local117];
						local129 = local126.anInt7856;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = (float) (local126.anInt7855 >> 12);
						local159 = (float) (local126.anInt7853 >> 12);
						local165 = (float) (local126.anInt7850 >> 12);
						local170 = local126.anInt7857 >> 12;
						local87.a((float) -local170 * local33 + local153);
						local87.a(local159 + (float) -local170 * local37);
						local87.a(local165 + local46 * (float) -local170);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a(local50 * (float) local170 + local153);
						local87.a(local159 + local55 * (float) local170);
						local87.a(local165 + (float) local170 * local60);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a((float) local170 * local33 + local153);
						local87.a((float) local170 * local37 + local159);
						local87.a(local46 * (float) local170 + local165);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local64 * (float) local170 + local153);
						local87.a((float) local170 * local68 + local159);
						local87.a(local165 + (float) local170 * local73);
						if (arg1.anInt7441 == 0) {
							local87.a(local134, local139, local142, local147);
						} else {
							local87.b(local134, local139, local142, local147);
						}
						local87.a(0.0F);
						local7++;
						local87.a(1.0F);
					}
					if (this.anIntArray626[local93] > 64) {
						local392 = this.anIntArray626[local93] - 64 - 1;
						for (local129 = this.anIntArray625[local392] - 1; local129 >= 0; local129--) {
							local408 = this.aClass23_Sub1_Sub2ArrayArray3[local392][local129];
							local411 = local408.anInt7856;
							local142 = (byte) (local411 >> 16);
							local147 = (byte) (local411 >> 8);
							local424 = (byte) local411;
							local429 = (byte) (local411 >>> 24);
							local165 = (float) (local408.anInt7855 >> 12);
							local441 = (float) (local408.anInt7853 >> 12);
							local447 = (float) (local408.anInt7850 >> 12);
							local452 = local408.anInt7857 >> 12;
							local87.a((float) -local452 * local33 + local165);
							local87.a((float) -local452 * local37 + local441);
							local87.a(local46 * (float) -local452 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local165 + local50 * (float) local452);
							local87.a(local441 + local55 * (float) local452);
							local87.a(local447 + local60 * (float) local452);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a(local33 * (float) local452 + local165);
							local87.a((float) local452 * local37 + local441);
							local87.a((float) local452 * local46 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a(local165 + (float) local452 * local64);
							local87.a(local441 + (float) local452 * local68);
							local87.a((float) local452 * local73 + local447);
							if (arg1.anInt7441 == 0) {
								local87.a(local142, local147, local424, local429);
							} else {
								local87.b(local142, local147, local424, local429);
							}
							local87.a(0.0F);
							local87.a(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local87.b();
		if (this.anInterface16_18.method6039()) {
			arg1.method6257(0, this.anInterface16_18);
			arg1.method6257(1, this.anInterface16_17);
			arg1.method6287(this.aClass277_23);
			arg1.method6306(local7 * 4, this.anInterface22_6, Static425.aClass44_5, local7 * 2, 0, 0);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!sf;)V")
	private void method8071(@OriginalArg(1) Class16_Sub1 arg0) {
		Static288.aFloat133 = arg0.aFloat157;
		arg0.method6267();
		arg0.method6259(false);
		arg0.method6232(false);
		arg0.method6279();
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ILclient!sf;)V")
	private void method8072(@OriginalArg(1) Class16_Sub1 arg0) {
		arg0.method6232(true);
		arg0.method6259(true);
		if (arg0.aFloat157 != Static288.aFloat133) {
			arg0.xa(Static288.aFloat133);
		}
	}
}
