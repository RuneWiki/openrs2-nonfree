import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class134 {

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
	private final int[] anIntArray324 = new int[8191];

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "[[Lclient!vh;")
	private final Class9_Sub8_Sub2[][] aClass9_Sub8_Sub2ArrayArray2 = new Class9_Sub8_Sub2[64][768];

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
	private int anInt4109 = 0;

	@OriginalMember(owner = "client!hp", name = "p", descriptor = "[I")
	private final int[] anIntArray325 = new int[1600];

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "[[Lclient!vh;")
	private final Class9_Sub8_Sub2[][] aClass9_Sub8_Sub2ArrayArray1 = new Class9_Sub8_Sub2[1600][64];

	@OriginalMember(owner = "client!hp", name = "r", descriptor = "[I")
	private final int[] anIntArray326 = new int[64];

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!kr;")
	private final Class48 aClass48_13;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!wl;")
	private final Interface24 anInterface24_8;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!wl;")
	private final Interface24 anInterface24_9;

	@OriginalMember(owner = "client!hp", name = "v", descriptor = "Lclient!or;")
	private final Interface17 anInterface17_4;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class134(@OriginalArg(0) Class43_Sub1 arg0) {
		this.aClass48_13 = arg0.method4290(new Class289[] { new Class289(new Class68[] { Static100.aClass68_1, Static100.aClass68_3, Static100.aClass68_5 }), new Class289(Static100.aClass68_2) });
		this.anInterface24_8 = arg0.method4188(true);
		this.anInterface24_9 = arg0.method4188(false);
		this.anInterface24_9.method4802(12, 393168);
		this.anInterface17_4 = arg0.method4258(false);
		this.anInterface17_4.method6942(49146);
		@Pc(98) Buffer local98 = this.anInterface17_4.method6938();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method4233(local98);
			@Pc(109) int local109;
			if (Stream.c()) {
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
					local105.f(local115);
					local105.f(local115 + 1);
					local105.f(local115 + 2);
					local105.f(local115 + 2);
					local105.f(local115 + 3);
					local105.f(local115);
				}
			}
			local105.a();
			this.anInterface17_4.method6941();
		}
		@Pc(200) Buffer local200 = this.anInterface24_9.method4803();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method4233(local200);
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
			this.anInterface24_9.method4801();
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!cf;)V")
	public void method3650(@OriginalArg(1) Class43_Sub1 arg0) {
		this.anInterface24_8.method4802(24, 786336);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!cf;I)V")
	private void method3651(@OriginalArg(0) Class43_Sub1 arg0) {
		Static259.aFloat181 = arg0.aFloat97;
		arg0.method4203();
		arg0.method4242(false);
		arg0.method4278(false);
		arg0.method4263();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!cf;IB)V")
	private void method3652(@OriginalArg(0) Class43_Sub1 arg0, @OriginalArg(1) int arg1) {
		Static259.aFloat181 = arg0.aFloat97;
		arg0.method4221((float) arg1);
		arg0.method4249();
		arg0.method4242(false);
		arg0.method4278(false);
		arg0.method4263();
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILclient!cf;Lclient!fi;)V")
	public void method3653(@OriginalArg(0) int arg0, @OriginalArg(2) Class43_Sub1 arg1, @OriginalArg(3) Class96 arg2) {
		if (arg1.aClass109_Sub3_16 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method3652(arg1, arg0);
		} else {
			this.method3651(arg1);
		}
		@Pc(29) float local29 = arg1.aClass109_Sub3_16.aFloat194;
		@Pc(33) float local33 = arg1.aClass109_Sub3_16.aFloat196;
		@Pc(37) float local37 = arg1.aClass109_Sub3_16.aFloat197;
		@Pc(41) float local41 = arg1.aClass109_Sub3_16.aFloat189;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class9_Sub8 local51 = arg2.aClass269_1.aClass9_Sub8_9;
			@Pc(54) Class9_Sub8 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass9_Sub8_8; local54 != local51; local54 = local54.aClass9_Sub8_8) {
				@Pc(59) Class9_Sub8_Sub2 local59 = (Class9_Sub8_Sub2) local54;
				local86 = (int) (local41 + (float) (local59.anInt6176 >> 12) * local29 + (float) (local59.anInt6177 >> 12) * local33 + local37 * (float) (local59.anInt6180 >> 12));
				this.anIntArray324[local43++] = local86;
				if (local86 > local47) {
					local47 = local86;
				}
				if (local45 > local86) {
					local45 = local86;
				}
			}
			@Pc(120) int local120 = local47 - local45;
			if (local120 + 2 > 1600) {
				local86 = Static328.method5090(local120) + 1 - Static380.anInt6547;
				local120 = (local120 >> local86) + 2;
			} else {
				local86 = 0;
				local120 += 2;
			}
			local43 = 0;
			local54 = local51.aClass9_Sub8_8;
			@Pc(155) int local155 = -2;
			@Pc(157) boolean local157 = true;
			@Pc(159) boolean local159 = true;
			while (local54 != local51) {
				this.anInt4109 = 0;
				for (@Pc(166) int local166 = 0; local166 < local120; local166++) {
					this.anIntArray325[local166] = 0;
				}
				for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
					this.anIntArray326[local183] = 0;
				}
				while (local54 != local51) {
					@Pc(201) Class9_Sub8_Sub2 local201 = (Class9_Sub8_Sub2) local54;
					if (local159) {
						local155 = local201.anInt6182;
						local159 = false;
						local157 = local201.aBoolean505;
					}
					if (local43 > 0 && (local155 != local201.anInt6182 || local201.aBoolean505 != local157)) {
						local159 = true;
						break;
					}
					@Pc(243) int local243 = this.anIntArray324[local43++] - local45 >> local86;
					if (local243 < 1600) {
						if (this.anIntArray325[local243] >= 64) {
							label102: {
								if (this.anIntArray325[local243] == 64) {
									if (this.anInt4109 == 64) {
										break label102;
									}
									this.anIntArray325[local243] += this.anInt4109++ + 1;
								}
								@Pc(298) Class9_Sub8_Sub2[] local298 = this.aClass9_Sub8_Sub2ArrayArray2[this.anIntArray325[local243] - 1 - 64];
								@Pc(308) int local308 = this.anIntArray325[local243] - 64 - 1;
								@Pc(310) int local310 = this.anIntArray326[this.anIntArray325[local243] - 64 - 1];
								this.anIntArray326[local308] = this.anIntArray326[this.anIntArray325[local243] - 64 - 1] + 1;
								local298[local310] = local201;
							}
						} else {
							this.aClass9_Sub8_Sub2ArrayArray1[local243][this.anIntArray325[local243]++] = local201;
						}
					}
					local54 = local54.aClass9_Sub8_8;
				}
				arg1.method4237(local155 < 0 ? -1 : local155, false, false);
				if (local157 && arg1.aFloat97 != Static259.aFloat181) {
					arg1.ra(Static259.aFloat181);
				} else if (arg1.aFloat97 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method3654(local120, arg1);
			}
		} catch (@Pc(379) Exception local379) {
		}
		this.method3656(arg1);
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BILclient!cf;)V")
	private void method3654(@OriginalArg(1) int arg0, @OriginalArg(2) Class43_Sub1 arg1) {
		@Pc(7) int local7 = 0;
		@Pc(19) Class109_Sub3 local19 = arg1.method4173();
		@Pc(22) float local22 = local19.aFloat193;
		@Pc(25) float local25 = local19.aFloat187;
		@Pc(28) float local28 = local19.aFloat195;
		@Pc(31) float local31 = local19.aFloat191;
		@Pc(34) float local34 = local19.aFloat186;
		@Pc(37) float local37 = local19.aFloat190;
		@Pc(41) float local41 = local22 + local31;
		@Pc(45) float local45 = local25 + local34;
		@Pc(49) float local49 = local37 + local28;
		@Pc(54) float local54 = local22 - local31;
		@Pc(58) float local58 = local25 - local34;
		@Pc(63) float local63 = local28 - local37;
		@Pc(67) float local67 = local31 - local22;
		@Pc(71) float local71 = local34 - local25;
		@Pc(75) float local75 = local37 - local28;
		@Pc(81) Buffer local81 = this.anInterface24_8.method4803();
		if (local81 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg1.method4233(local81);
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class9_Sub8_Sub2 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(449) float local449;
		@Pc(454) int local454;
		@Pc(394) int local394;
		@Pc(410) Class9_Sub8_Sub2 local410;
		@Pc(413) int local413;
		@Pc(426) byte local426;
		@Pc(431) byte local431;
		@Pc(443) float local443;
		if (Stream.c()) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray325[local95] <= 64 ? this.anIntArray325[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass9_Sub8_Sub2ArrayArray1[local95][local119];
						local131 = local128.anInt6178;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt6176 >> 12;
						local161 = local128.anInt6177 >> 12;
						local167 = local128.anInt6180 >> 12;
						local172 = local128.anInt6181 >> 12;
						local89.a(local155 + local41 * (float) -local172);
						local89.a(local161 + local45 * (float) -local172);
						local89.a(local167 + (float) -local172 * local49);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local155 + (float) local172 * local54);
						local89.a(local58 * (float) local172 + local161);
						local89.a(local63 * (float) local172 + local167);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a(local41 * (float) local172 + local155);
						local89.a((float) local172 * local45 + local161);
						local89.a((float) local172 * local49 + local167);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a(local155 + (float) local172 * local67);
						local89.a(local71 * (float) local172 + local161);
						local89.a(local167 + (float) local172 * local75);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.a(0.0F);
						local89.a(1.0F);
						local7++;
					}
					if (this.anIntArray325[local95] > 64) {
						local394 = this.anIntArray325[local95] - 1 - 64;
						for (local131 = this.anIntArray326[local394] - 1; local131 >= 0; local131--) {
							local410 = this.aClass9_Sub8_Sub2ArrayArray2[local394][local131];
							local413 = local410.anInt6178;
							local144 = (byte) (local413 >> 16);
							local149 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local167 = local410.anInt6176 >> 12;
							local443 = local410.anInt6177 >> 12;
							local449 = local410.anInt6180 >> 12;
							local454 = local410.anInt6181 >> 12;
							local89.a(local41 * (float) -local454 + local167);
							local89.a(local443 + local45 * (float) -local454);
							local89.a(local449 + (float) -local454 * local49);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a((float) local454 * local54 + local167);
							local89.a(local58 * (float) local454 + local443);
							local89.a(local449 + local63 * (float) local454);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a(local41 * (float) local454 + local167);
							local89.a(local443 + (float) local454 * local45);
							local89.a(local449 + (float) local454 * local49);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local167 + (float) local454 * local67);
							local89.a(local443 + local71 * (float) local454);
							local89.a((float) local454 * local75 + local449);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.a(0.0F);
							local7++;
							local89.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray325[local95] > 64 ? 64 : this.anIntArray325[local95];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass9_Sub8_Sub2ArrayArray1[local95][local119];
						local131 = local128.anInt6178;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt6176 >> 12;
						local161 = local128.anInt6177 >> 12;
						local167 = local128.anInt6180 >> 12;
						local172 = local128.anInt6181 >> 12;
						local89.b((float) -local172 * local41 + local155);
						local89.b(local161 + local45 * (float) -local172);
						local89.b((float) -local172 * local49 + local167);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b(local155 + local54 * (float) local172);
						local89.b(local161 + (float) local172 * local58);
						local89.b(local167 + (float) local172 * local63);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b(local155 + local41 * (float) local172);
						local89.b(local161 + local45 * (float) local172);
						local89.b(local167 + (float) local172 * local49);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b((float) local172 * local67 + local155);
						local89.b(local161 + local71 * (float) local172);
						local89.b(local75 * (float) local172 + local167);
						if (arg1.anInt4823 == 0) {
							local89.b(local136, local141, local144, local149);
						} else {
							local89.a(local136, local141, local144, local149);
						}
						local89.b(0.0F);
						local7++;
						local89.b(1.0F);
					}
					if (this.anIntArray325[local95] > 64) {
						local394 = this.anIntArray325[local95] - 64 - 1;
						for (local131 = this.anIntArray326[local394] - 1; local131 >= 0; local131--) {
							local410 = this.aClass9_Sub8_Sub2ArrayArray2[local394][local131];
							local413 = local410.anInt6178;
							local144 = (byte) (local413 >> 16);
							local149 = (byte) (local413 >> 8);
							local426 = (byte) local413;
							local431 = (byte) (local413 >>> 24);
							local167 = local410.anInt6176 >> 12;
							local443 = local410.anInt6177 >> 12;
							local449 = local410.anInt6180 >> 12;
							local454 = local410.anInt6181 >> 12;
							local89.b((float) -local454 * local41 + local167);
							local89.b(local443 + (float) -local454 * local45);
							local89.b(local449 + (float) -local454 * local49);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local54 * (float) local454 + local167);
							local89.b(local443 + local58 * (float) local454);
							local89.b((float) local454 * local63 + local449);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b(local167 + local41 * (float) local454);
							local89.b(local443 + (float) local454 * local45);
							local89.b(local449 + local49 * (float) local454);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
							}
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local67 * (float) local454 + local167);
							local89.b(local443 + (float) local454 * local71);
							local89.b(local449 + local75 * (float) local454);
							if (arg1.anInt4823 == 0) {
								local89.b(local144, local149, local426, local431);
							} else {
								local89.a(local144, local149, local426, local431);
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
		if (this.anInterface24_8.method4801()) {
			arg1.method4181(0, this.anInterface24_8);
			arg1.method4181(1, this.anInterface24_9);
			arg1.method4196(this.aClass48_13);
			arg1.method4232(Static534.aClass319_7, 0, local7 * 4, 0, local7 * 2, this.anInterface17_4);
		}
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Lclient!cf;I)V")
	private void method3656(@OriginalArg(0) Class43_Sub1 arg0) {
		arg0.method4278(true);
		arg0.method4242(true);
		if (Static259.aFloat181 != arg0.aFloat97) {
			arg0.ra(Static259.aFloat181);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
	public void method3658() {
		this.anInterface24_8.method6939();
	}
}
