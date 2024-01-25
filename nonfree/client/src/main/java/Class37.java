import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class37 {

	@OriginalMember(owner = "client!bn", name = "j", descriptor = "[[Lclient!nb;")
	private final Class4_Sub2_Sub2[][] aClass4_Sub2_Sub2ArrayArray2 = new Class4_Sub2_Sub2[64][768];

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "[I")
	private final int[] anIntArray41 = new int[64];

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "[[Lclient!nb;")
	private final Class4_Sub2_Sub2[][] aClass4_Sub2_Sub2ArrayArray1 = new Class4_Sub2_Sub2[1600][64];

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "[I")
	private final int[] anIntArray42 = new int[8191];

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[I")
	private final int[] anIntArray43 = new int[1600];

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private int anInt1376 = 0;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "Lclient!eu;")
	private final Class46 aClass46_15;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "Lclient!fg;")
	private final Interface11 anInterface11_7;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "Lclient!fg;")
	private final Interface11 anInterface11_8;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "Lclient!rr;")
	private final Interface19 anInterface19_3;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!ch;)V")
	public Class37(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass46_15 = arg0.method5652(new Class93[] { new Class93(new Class131[] { Static196.aClass131_1, Static196.aClass131_3, Static196.aClass131_5 }), new Class93(Static196.aClass131_2) });
		this.anInterface11_7 = arg0.method5649(true);
		this.anInterface11_8 = arg0.method5649(false);
		this.anInterface11_8.method6373(12, 393168);
		this.anInterface19_3 = arg0.method5671(false);
		this.anInterface19_3.method7981(49146);
		@Pc(98) Buffer local98 = this.anInterface19_3.method7984();
		@Pc(115) int local115;
		if (local98 != null) {
			@Pc(105) Stream local105 = arg0.method5647(local98);
			@Pc(109) int local109;
			if (Stream.a()) {
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
					local105.d(local115);
					local105.d(local115 + 1);
					local105.d(local115 + 2);
					local105.d(local115 + 2);
					local105.d(local115 + 3);
					local105.d(local115);
				}
			}
			local105.b();
			this.anInterface19_3.method7985();
		}
		@Pc(200) Buffer local200 = this.anInterface11_8.method6374();
		if (local200 != null) {
			@Pc(207) Stream local207 = arg0.method5647(local200);
			if (Stream.a()) {
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
			local207.b();
			this.anInterface11_8.method6375();
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZLclient!ch;)V")
	private void method1416(@OriginalArg(1) Class5_Sub1 arg0) {
		Static372.aFloat86 = arg0.aFloat141;
		arg0.method5597();
		arg0.method5686(false);
		arg0.method5636(false);
		arg0.method5625();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public void method1418() {
		this.anInterface11_7.method7982();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!ch;I)V")
	private void method1419(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		Static372.aFloat86 = arg1.aFloat141;
		arg1.method5638((float) arg0);
		arg1.method5593();
		arg1.method5686(false);
		arg1.method5636(false);
		arg1.method5625();
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILclient!eea;Lclient!ch;)V")
	public void method1420(@OriginalArg(1) int arg0, @OriginalArg(2) Class85 arg1, @OriginalArg(3) Class5_Sub1 arg2) {
		if (arg2.aClass39_Sub1_16 == null) {
			return;
		}
		if (arg0 < 0) {
			this.method1416(arg2);
		} else {
			this.method1419(arg0, arg2);
		}
		@Pc(26) float local26 = arg2.aClass39_Sub1_16.aFloat53;
		@Pc(30) float local30 = arg2.aClass39_Sub1_16.aFloat61;
		@Pc(34) float local34 = arg2.aClass39_Sub1_16.aFloat60;
		@Pc(38) float local38 = arg2.aClass39_Sub1_16.aFloat55;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class4_Sub2 local48 = arg1.aClass34_1.aClass4_Sub2_3;
			@Pc(51) Class4_Sub2 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass4_Sub2_10; local51 != local48; local51 = local51.aClass4_Sub2_10) {
				@Pc(56) Class4_Sub2_Sub2 local56 = (Class4_Sub2_Sub2) local51;
				local83 = (int) ((float) (local56.anInt7719 >> 12) * local26 + local30 * (float) (local56.anInt7716 >> 12) + (float) (local56.anInt7720 >> 12) * local34 + local38);
				if (local42 > local83) {
					local42 = local83;
				}
				if (local83 > local44) {
					local44 = local83;
				}
				this.anIntArray42[local40++] = local83;
			}
			@Pc(126) int local126 = local44 - local42;
			if (local126 + 2 > 1600) {
				local83 = Static636.method8709(local126) + 1 - Static159.anInt3132;
				local126 = (local126 >> local83) + 2;
			} else {
				local83 = 0;
				local126 += 2;
			}
			local40 = 0;
			local51 = local48.aClass4_Sub2_10;
			@Pc(159) int local159 = -2;
			@Pc(161) boolean local161 = true;
			@Pc(163) boolean local163 = true;
			while (local51 != local48) {
				this.anInt1376 = 0;
				for (@Pc(170) int local170 = 0; local170 < local126; local170++) {
					this.anIntArray43[local170] = 0;
				}
				for (@Pc(187) int local187 = 0; local187 < 64; local187++) {
					this.anIntArray41[local187] = 0;
				}
				while (local51 != local48) {
					@Pc(205) Class4_Sub2_Sub2 local205 = (Class4_Sub2_Sub2) local51;
					if (local163) {
						local159 = local205.anInt7718;
						local163 = false;
						local161 = local205.aBoolean541;
					}
					if (local40 > 0 && (local159 != local205.anInt7718 || local205.aBoolean541 != local161)) {
						local163 = true;
						break;
					}
					@Pc(251) int local251 = this.anIntArray42[local40++] - local42 >> local83;
					if (local251 < 1600) {
						if (this.anIntArray43[local251] < 64) {
							this.aClass4_Sub2_Sub2ArrayArray1[local251][this.anIntArray43[local251]++] = local205;
						} else {
							label101: {
								if (this.anIntArray43[local251] == 64) {
									if (this.anInt1376 == 64) {
										break label101;
									}
									this.anIntArray43[local251] += this.anInt1376++ + 1;
								}
								this.aClass4_Sub2_Sub2ArrayArray2[this.anIntArray43[local251] - 64 - 1][this.anIntArray41[this.anIntArray43[local251] - 1 - 64]++] = local205;
							}
						}
					}
					local51 = local51.aClass4_Sub2_10;
				}
				arg2.method5579(false, false, local159 >= 0 ? local159 : -1);
				if (local161 && arg2.aFloat141 != Static372.aFloat86) {
					arg2.xa(Static372.aFloat86);
				} else if (arg2.aFloat141 != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method1424(arg2, local126);
			}
		} catch (@Pc(388) Exception local388) {
		}
		this.method1423(arg2);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ch;B)V")
	private void method1423(@OriginalArg(0) Class5_Sub1 arg0) {
		arg0.method5636(true);
		arg0.method5686(true);
		if (Static372.aFloat86 != arg0.aFloat141) {
			arg0.xa(Static372.aFloat86);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ch;BI)V")
	private void method1424(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class39_Sub1 local11 = arg0.method5594();
		@Pc(14) float local14 = local11.aFloat57;
		@Pc(17) float local17 = local11.aFloat50;
		@Pc(26) float local26 = local11.aFloat51;
		@Pc(29) float local29 = local11.aFloat56;
		@Pc(32) float local32 = local11.aFloat54;
		@Pc(35) float local35 = local11.aFloat52;
		@Pc(39) float local39 = local29 + local14;
		@Pc(43) float local43 = local17 + local32;
		@Pc(47) float local47 = local35 + local26;
		@Pc(51) float local51 = local14 - local29;
		@Pc(56) float local56 = local17 - local32;
		@Pc(61) float local61 = local26 - local35;
		@Pc(65) float local65 = local29 - local14;
		@Pc(69) float local69 = local32 - local17;
		@Pc(73) float local73 = local35 - local26;
		@Pc(79) Buffer local79 = this.anInterface11_7.method6374();
		if (local79 == null) {
			return;
		}
		@Pc(87) Stream local87 = arg0.method5647(local79);
		@Pc(93) int local93;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class4_Sub2_Sub2 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(445) float local445;
		@Pc(450) int local450;
		@Pc(390) int local390;
		@Pc(406) Class4_Sub2_Sub2 local406;
		@Pc(409) int local409;
		@Pc(422) byte local422;
		@Pc(427) byte local427;
		@Pc(439) float local439;
		if (Stream.a()) {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray43[local93] > 64 ? 64 : this.anIntArray43[local93];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass4_Sub2_Sub2ArrayArray1[local93][local119];
						local131 = local128.anInt7717;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt7719 >> 12;
						local161 = local128.anInt7716 >> 12;
						local167 = local128.anInt7720 >> 12;
						local172 = local128.anInt7721 >> 12;
						local87.a(local155 + local39 * (float) -local172);
						local87.a(local43 * (float) -local172 + local161);
						local87.a((float) -local172 * local47 + local167);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.a(0.0F);
						local87.a(0.0F);
						local87.a(local155 + local51 * (float) local172);
						local87.a((float) local172 * local56 + local161);
						local87.a(local61 * (float) local172 + local167);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.a(1.0F);
						local87.a(0.0F);
						local87.a(local155 + (float) local172 * local39);
						local87.a(local161 + (float) local172 * local43);
						local87.a(local167 + (float) local172 * local47);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.a(1.0F);
						local87.a(1.0F);
						local87.a(local155 + (float) local172 * local65);
						local87.a(local161 + (float) local172 * local69);
						local87.a(local73 * (float) local172 + local167);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.a(0.0F);
						local87.a(1.0F);
						local7++;
					}
					if (this.anIntArray43[local93] > 64) {
						local390 = this.anIntArray43[local93] - 65;
						for (local131 = this.anIntArray41[local390] - 1; local131 >= 0; local131--) {
							local406 = this.aClass4_Sub2_Sub2ArrayArray2[local390][local131];
							local409 = local406.anInt7717;
							local144 = (byte) (local409 >> 16);
							local149 = (byte) (local409 >> 8);
							local422 = (byte) local409;
							local427 = (byte) (local409 >>> 24);
							local167 = local406.anInt7719 >> 12;
							local439 = local406.anInt7716 >> 12;
							local445 = local406.anInt7720 >> 12;
							local450 = local406.anInt7721 >> 12;
							local87.a(local167 + (float) -local450 * local39);
							local87.a(local439 + (float) -local450 * local43);
							local87.a(local445 + (float) -local450 * local47);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.a(0.0F);
							local87.a(0.0F);
							local87.a(local51 * (float) local450 + local167);
							local87.a((float) local450 * local56 + local439);
							local87.a(local445 + local61 * (float) local450);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.a(1.0F);
							local87.a(0.0F);
							local87.a(local167 + local39 * (float) local450);
							local87.a(local43 * (float) local450 + local439);
							local87.a((float) local450 * local47 + local445);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.a(1.0F);
							local87.a(1.0F);
							local87.a((float) local450 * local65 + local167);
							local87.a(local439 + (float) local450 * local69);
							local87.a(local445 + (float) local450 * local73);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.a(0.0F);
							local7++;
							local87.a(1.0F);
						}
					}
				}
			}
		} else {
			for (local93 = arg1 - 1; local93 >= 0; local93--) {
				local110 = this.anIntArray43[local93] > 64 ? 64 : this.anIntArray43[local93];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass4_Sub2_Sub2ArrayArray1[local93][local119];
						local131 = local128.anInt7717;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt7719 >> 12;
						local161 = local128.anInt7716 >> 12;
						local167 = local128.anInt7720 >> 12;
						local172 = local128.anInt7721 >> 12;
						local87.b((float) -local172 * local39 + local155);
						local87.b(local43 * (float) -local172 + local161);
						local87.b(local167 + (float) -local172 * local47);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.b(0.0F);
						local87.b(0.0F);
						local87.b(local51 * (float) local172 + local155);
						local87.b(local56 * (float) local172 + local161);
						local87.b(local167 + local61 * (float) local172);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.b(1.0F);
						local87.b(0.0F);
						local87.b(local39 * (float) local172 + local155);
						local87.b(local161 + local43 * (float) local172);
						local87.b(local47 * (float) local172 + local167);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.b(1.0F);
						local87.b(1.0F);
						local87.b((float) local172 * local65 + local155);
						local87.b((float) local172 * local69 + local161);
						local87.b(local167 + local73 * (float) local172);
						if (arg0.anInt6532 == 0) {
							local87.a(local136, local141, local144, local149);
						} else {
							local87.b(local136, local141, local144, local149);
						}
						local87.b(0.0F);
						local7++;
						local87.b(1.0F);
					}
					if (this.anIntArray43[local93] > 64) {
						local390 = this.anIntArray43[local93] - 1 - 64;
						for (local131 = this.anIntArray41[local390] - 1; local131 >= 0; local131--) {
							local406 = this.aClass4_Sub2_Sub2ArrayArray2[local390][local131];
							local409 = local406.anInt7717;
							local144 = (byte) (local409 >> 16);
							local149 = (byte) (local409 >> 8);
							local422 = (byte) local409;
							local427 = (byte) (local409 >>> 24);
							local167 = local406.anInt7719 >> 12;
							local439 = local406.anInt7716 >> 12;
							local445 = local406.anInt7720 >> 12;
							local450 = local406.anInt7721 >> 12;
							local87.b((float) -local450 * local39 + local167);
							local87.b(local439 + local43 * (float) -local450);
							local87.b(local47 * (float) -local450 + local445);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.b(0.0F);
							local87.b(0.0F);
							local87.b((float) local450 * local51 + local167);
							local87.b((float) local450 * local56 + local439);
							local87.b(local445 + local61 * (float) local450);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.b(1.0F);
							local87.b(0.0F);
							local87.b(local167 + (float) local450 * local39);
							local87.b(local439 + (float) local450 * local43);
							local87.b((float) local450 * local47 + local445);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.b(1.0F);
							local87.b(1.0F);
							local87.b(local65 * (float) local450 + local167);
							local87.b(local439 + local69 * (float) local450);
							local87.b(local73 * (float) local450 + local445);
							if (arg0.anInt6532 == 0) {
								local87.a(local144, local149, local422, local427);
							} else {
								local87.b(local144, local149, local422, local427);
							}
							local87.b(0.0F);
							local87.b(1.0F);
							local7++;
						}
					}
				}
			}
		}
		local87.b();
		if (this.anInterface11_7.method6375()) {
			arg0.method5692(this.anInterface11_7, 0);
			arg0.method5692(this.anInterface11_8, 1);
			arg0.method5610(this.aClass46_15);
			arg0.method5665(Static67.aClass292_2, 0, local7 * 4, this.anInterface19_3, local7 * 2, 0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!ch;)V")
	public void method1425(@OriginalArg(1) Class5_Sub1 arg0) {
		this.anInterface11_7.method6373(24, 786336);
	}
}
