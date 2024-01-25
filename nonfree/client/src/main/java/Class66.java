import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class66 {

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "[I")
	private final int[] anIntArray183 = new int[8191];

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "[[Lclient!tl;")
	private final Class30_Sub2_Sub1[][] aClass30_Sub2_Sub1ArrayArray1 = new Class30_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "[[Lclient!tl;")
	private final Class30_Sub2_Sub1[][] aClass30_Sub2_Sub1ArrayArray2 = new Class30_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "[I")
	private final int[] anIntArray182 = new int[1600];

	@OriginalMember(owner = "client!dl", name = "n", descriptor = "[I")
	private final int[] anIntArray184 = new int[64];

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
	private int anInt2149 = 0;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "Lclient!up;")
	private final Interface16 anInterface16_5;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "Lclient!ws;")
	private final Class318 aClass318_13;

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "Lclient!sp;")
	private final Interface13 anInterface13_6;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!nd;)V")
	public Class66(@OriginalArg(0) Class62_Sub1 arg0) {
		this.anInterface16_5 = arg0.method4702(true);
		this.aClass318_13 = arg0.method4782(new Class313[] { new Class313(new Class253[] { Static422.aClass253_1, Static422.aClass253_3, Static422.aClass253_5 }) });
		this.anInterface13_6 = arg0.method4657(false);
		this.anInterface13_6.method3488(49146);
		@Pc(78) Buffer local78 = this.anInterface13_6.method3487();
		if (local78 != null) {
			@Pc(85) Stream local85 = arg0.method4693(local78);
			@Pc(89) int local89;
			@Pc(95) int local95;
			if (Stream.c()) {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.e(local95);
					local85.e(local95 + 1);
					local85.e(local95 + 2);
					local85.e(local95 + 2);
					local85.e(local95 + 3);
					local85.e(local95);
				}
			} else {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.a(local95);
					local85.a(local95 + 1);
					local85.a(local95 + 2);
					local85.a(local95 + 2);
					local85.a(local95 + 3);
					local85.a(local95);
				}
			}
			local85.b();
			this.anInterface13_6.method3492();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!nd;)V")
	private void method1981(@OriginalArg(1) Class62_Sub1 arg0) {
		Static448.aFloat326 = arg0.aFloat241;
		arg0.method4704();
		arg0.method4672(false);
		arg0.method4752(false);
		arg0.method4750();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!nd;BI)V")
	private void method1982(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(13) Class78_Sub1 local13 = arg0.method4783();
		@Pc(16) float local16 = local13.aFloat130;
		@Pc(19) float local19 = local13.aFloat132;
		@Pc(22) float local22 = local13.aFloat131;
		@Pc(25) float local25 = local13.aFloat126;
		@Pc(28) float local28 = local13.aFloat125;
		@Pc(35) float local35 = local13.aFloat128;
		@Pc(39) float local39 = local25 + local16;
		@Pc(43) float local43 = local19 + local28;
		@Pc(47) float local47 = local35 + local22;
		@Pc(52) float local52 = local16 - local25;
		@Pc(56) float local56 = local19 - local28;
		@Pc(61) float local61 = local22 - local35;
		@Pc(65) float local65 = local25 - local16;
		@Pc(70) float local70 = local28 - local19;
		@Pc(74) float local74 = local35 - local22;
		@Pc(80) Buffer local80 = this.anInterface16_5.method3487();
		if (local80 == null) {
			return;
		}
		@Pc(88) Stream local88 = arg0.method4693(local80);
		@Pc(94) int local94;
		@Pc(109) int local109;
		@Pc(115) int local115;
		@Pc(124) Class30_Sub2_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(416) float local416;
		@Pc(421) int local421;
		@Pc(361) int local361;
		@Pc(377) Class30_Sub2_Sub1 local377;
		@Pc(380) int local380;
		@Pc(393) byte local393;
		@Pc(398) byte local398;
		@Pc(410) float local410;
		if (Stream.c()) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray182[local94] > 64 ? 64 : this.anIntArray182[local94];
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass30_Sub2_Sub1ArrayArray1[local94][local115];
						local127 = local124.anInt2962;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt2966 >> 12;
						local157 = local124.anInt2967 >> 12;
						local163 = local124.anInt2969 >> 12;
						local168 = local124.anInt2963 >> 12;
						local88.b((float) -local168 * local39 + local151);
						local88.b(local157 + local43 * (float) -local168);
						local88.b(local163 + (float) -local168 * local47);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.b(0.0F);
						local88.b(0.0F);
						local88.b((float) local168 * local52 + local151);
						local88.b(local157 + (float) local168 * local56);
						local88.b((float) local168 * local61 + local163);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.b(1.0F);
						local88.b(0.0F);
						local88.b(local151 + local39 * (float) local168);
						local88.b((float) local168 * local43 + local157);
						local88.b(local47 * (float) local168 + local163);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.b(1.0F);
						local88.b(1.0F);
						local88.b(local151 + (float) local168 * local65);
						local88.b(local70 * (float) local168 + local157);
						local88.b(local163 + local74 * (float) local168);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.b(0.0F);
						local88.b(1.0F);
						local7++;
					}
					if (this.anIntArray182[local94] > 64) {
						local361 = this.anIntArray182[local94] - 1 - 64;
						for (local127 = this.anIntArray184[local361] - 1; local127 >= 0; local127--) {
							local377 = this.aClass30_Sub2_Sub1ArrayArray2[local361][local127];
							local380 = local377.anInt2962;
							local140 = (byte) (local380 >> 16);
							local145 = (byte) (local380 >> 8);
							local393 = (byte) local380;
							local398 = (byte) (local380 >>> 24);
							local163 = local377.anInt2966 >> 12;
							local410 = local377.anInt2967 >> 12;
							local416 = local377.anInt2969 >> 12;
							local421 = local377.anInt2963 >> 12;
							local88.b(local39 * (float) -local421 + local163);
							local88.b(local410 + local43 * (float) -local421);
							local88.b((float) -local421 * local47 + local416);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.b(0.0F);
							local88.b(0.0F);
							local88.b((float) local421 * local52 + local163);
							local88.b(local56 * (float) local421 + local410);
							local88.b(local61 * (float) local421 + local416);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.b(1.0F);
							local88.b(0.0F);
							local88.b(local39 * (float) local421 + local163);
							local88.b(local410 + (float) local421 * local43);
							local88.b((float) local421 * local47 + local416);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.b(1.0F);
							local88.b(1.0F);
							local88.b((float) local421 * local65 + local163);
							local88.b((float) local421 * local70 + local410);
							local88.b(local74 * (float) local421 + local416);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.b(0.0F);
							local7++;
							local88.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray182[local94] <= 64 ? this.anIntArray182[local94] : 64;
				if (local109 > 0) {
					for (local115 = local109 - 1; local115 >= 0; local115--) {
						local124 = this.aClass30_Sub2_Sub1ArrayArray1[local94][local115];
						local127 = local124.anInt2962;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt2966 >> 12;
						local157 = local124.anInt2967 >> 12;
						local163 = local124.anInt2969 >> 12;
						local168 = local124.anInt2963 >> 12;
						local88.a(local151 + local39 * (float) -local168);
						local88.a(local157 + (float) -local168 * local43);
						local88.a((float) -local168 * local47 + local163);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.a(0.0F);
						local88.a(0.0F);
						local88.a(local151 + local52 * (float) local168);
						local88.a(local157 + local56 * (float) local168);
						local88.a((float) local168 * local61 + local163);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.a(1.0F);
						local88.a(0.0F);
						local88.a(local151 + (float) local168 * local39);
						local88.a(local157 + (float) local168 * local43);
						local88.a(local163 + local47 * (float) local168);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.a(1.0F);
						local88.a(1.0F);
						local88.a(local151 + local65 * (float) local168);
						local88.a((float) local168 * local70 + local157);
						local88.a(local74 * (float) local168 + local163);
						local88.d(local140);
						local88.d(local137);
						local88.d(local132);
						local88.d(local145);
						local88.a(0.0F);
						local7++;
						local88.a(1.0F);
					}
					if (this.anIntArray182[local94] > 64) {
						local361 = this.anIntArray182[local94] - 65;
						for (local127 = this.anIntArray184[local361] - 1; local127 >= 0; local127--) {
							local377 = this.aClass30_Sub2_Sub1ArrayArray2[local361][local127];
							local380 = local377.anInt2962;
							local140 = (byte) (local380 >> 16);
							local145 = (byte) (local380 >> 8);
							local393 = (byte) local380;
							local398 = (byte) (local380 >>> 24);
							local163 = local377.anInt2966 >> 12;
							local410 = local377.anInt2967 >> 12;
							local416 = local377.anInt2969 >> 12;
							local421 = local377.anInt2963 >> 12;
							local88.a(local163 + (float) -local421 * local39);
							local88.a((float) -local421 * local43 + local410);
							local88.a(local47 * (float) -local421 + local416);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.a(0.0F);
							local88.a(0.0F);
							local88.a((float) local421 * local52 + local163);
							local88.a(local410 + local56 * (float) local421);
							local88.a(local416 + local61 * (float) local421);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.a(1.0F);
							local88.a(0.0F);
							local88.a(local39 * (float) local421 + local163);
							local88.a((float) local421 * local43 + local410);
							local88.a(local47 * (float) local421 + local416);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.a(1.0F);
							local88.a(1.0F);
							local88.a((float) local421 * local65 + local163);
							local88.a(local410 + (float) local421 * local70);
							local88.a(local416 + (float) local421 * local74);
							local88.d(local393);
							local88.d(local145);
							local88.d(local140);
							local88.d(local398);
							local88.a(0.0F);
							local7++;
							local88.a(1.0F);
						}
					}
				}
			}
		}
		local88.b();
		if (this.anInterface16_5.method3492()) {
			arg0.method4713(this.aClass318_13);
			arg0.method4673(0, this.anInterface16_5);
			arg0.method4727(Static403.aClass228_7, 0, local7 * 4, local7 * 2, this.anInterface13_6, 0);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!sh;Lclient!nd;)V")
	public void method1984(@OriginalArg(1) Class267 arg0, @OriginalArg(2) Class62_Sub1 arg1) {
		if (arg1.aClass78_Sub1_16 == null) {
			return;
		}
		this.method1981(arg1);
		@Pc(17) float local17 = arg1.aClass78_Sub1_16.aFloat127;
		@Pc(29) float local29 = arg1.aClass78_Sub1_16.aFloat129;
		@Pc(33) float local33 = arg1.aClass78_Sub1_16.aFloat124;
		@Pc(37) float local37 = arg1.aClass78_Sub1_16.aFloat123;
		try {
			@Pc(47) int local47;
			@Pc(54) int local54;
			@Pc(79) Class30_Sub2 local79;
			@Pc(92) int local92;
			@Pc(186) int local186;
			if (arg0.aBoolean555) {
				local47 = arg0.anInt7822 - arg0.anInt7821;
				if (local47 + 2 <= 1600) {
					local54 = 0;
					local47 += 2;
				} else {
					local54 = Static344.method5361(local47) + 1 - Static329.anInt6275;
					local47 = (local47 >> local54) + 2;
				}
				@Pc(76) Class30_Sub2 local76 = arg0.aClass161_1.aClass30_Sub2_7;
				local79 = local76.aClass30_Sub2_9;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local79 != local76) {
					this.anInt2149 = 0;
					for (local92 = 0; local92 < local47; local92++) {
						this.anIntArray182[local92] = 0;
					}
					for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
						this.anIntArray184[local109] = 0;
					}
					while (local79 != local76) {
						@Pc(125) Class30_Sub2_Sub1 local125 = (Class30_Sub2_Sub1) local79;
						if (local85) {
							local85 = false;
							local83 = local125.aBoolean197;
							local81 = local125.anInt2968;
						} else if (local81 != local125.anInt2968 || local83 != local125.aBoolean197) {
							local85 = true;
							break;
						}
						local186 = (int) (local37 + local33 * (float) (local125.anInt2969 >> 12) + local29 * (float) (local125.anInt2967 >> 12) + (float) (local125.anInt2966 >> 12) * local17) - arg0.anInt7821 >> local54;
						if (local186 < 1600) {
							if (this.anIntArray182[local186] < 64) {
								this.aClass30_Sub2_Sub1ArrayArray1[local186][this.anIntArray182[local186]++] = local125;
							} else {
								label193: {
									if (this.anIntArray182[local186] == 64) {
										if (this.anInt2149 == 64) {
											break label193;
										}
										this.anIntArray182[local186] += this.anInt2149++ + 1;
									}
									this.aClass30_Sub2_Sub1ArrayArray2[this.anIntArray182[local186] - 65][this.anIntArray184[this.anIntArray182[local186] - 1 - 64]++] = local125;
								}
							}
						}
						local79 = local79.aClass30_Sub2_9;
					}
					arg1.method4656(local81, false, false);
					if (local83 && Static448.aFloat326 != arg1.aFloat241) {
						arg1.M(Static448.aFloat326);
					} else if (arg1.aFloat241 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method1982(arg1, local47);
				}
			} else {
				local47 = 0;
				local54 = Integer.MAX_VALUE;
				@Pc(319) int local319 = 0;
				local79 = arg0.aClass161_1.aClass30_Sub2_7;
				@Pc(326) Class30_Sub2 local326;
				@Pc(358) int local358;
				for (local326 = local79.aClass30_Sub2_9; local326 != local79; local326 = local326.aClass30_Sub2_9) {
					@Pc(331) Class30_Sub2_Sub1 local331 = (Class30_Sub2_Sub1) local326;
					local358 = (int) (local37 + local29 * (float) (local331.anInt2967 >> 12) + (float) (local331.anInt2966 >> 12) * local17 + local33 * (float) (local331.anInt2969 >> 12));
					if (local358 > local319) {
						local319 = local358;
					}
					if (local54 > local358) {
						local54 = local358;
					}
					this.anIntArray183[local47++] = local358;
				}
				@Pc(389) int local389 = local319 - local54;
				if (local389 + 2 > 1600) {
					local358 = Static344.method5361(local389) + 1 - Static329.anInt6275;
					local389 = (local389 >> local358) + 2;
				} else {
					local389 += 2;
					local358 = 0;
				}
				local326 = local79.aClass30_Sub2_9;
				local47 = 0;
				local92 = -2;
				@Pc(425) boolean local425 = true;
				@Pc(427) boolean local427 = true;
				while (local79 != local326) {
					this.anInt2149 = 0;
					for (local186 = 0; local186 < local389; local186++) {
						this.anIntArray182[local186] = 0;
					}
					for (@Pc(451) int local451 = 0; local451 < 64; local451++) {
						this.anIntArray184[local451] = 0;
					}
					while (local326 != local79) {
						@Pc(467) Class30_Sub2_Sub1 local467 = (Class30_Sub2_Sub1) local326;
						if (local427) {
							local92 = local467.anInt2968;
							local425 = local467.aBoolean197;
							local427 = false;
						}
						if (local47 > 0 && (local92 != local467.anInt2968 || local467.aBoolean197 != local425)) {
							local427 = true;
							break;
						}
						@Pc(514) int local514 = this.anIntArray183[local47++] - local54 >> local358;
						if (local514 < 1600) {
							if (this.anIntArray182[local514] < 64) {
								this.aClass30_Sub2_Sub1ArrayArray1[local514][this.anIntArray182[local514]++] = local467;
							} else {
								label143: {
									if (this.anIntArray182[local514] == 64) {
										if (this.anInt2149 == 64) {
											break label143;
										}
										this.anIntArray182[local514] += this.anInt2149++ + 1;
									}
									@Pc(581) Class30_Sub2_Sub1[] local581 = this.aClass30_Sub2_Sub1ArrayArray2[this.anIntArray182[local514] - 65];
									@Pc(591) int local591 = this.anIntArray182[local514] - 1 - 64;
									@Pc(593) int local593 = this.anIntArray184[this.anIntArray182[local514] - 1 - 64];
									this.anIntArray184[local591] = this.anIntArray184[this.anIntArray182[local514] - 1 - 64] + 1;
									local581[local593] = local467;
								}
							}
						}
						local326 = local326.aClass30_Sub2_9;
					}
					arg1.method4656(local92 >= 0 ? local92 : -1, false, false);
					if (local425 && Static448.aFloat326 != arg1.aFloat241) {
						arg1.M(Static448.aFloat326);
					} else if (arg1.aFloat241 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method1982(arg1, local389);
				}
			}
		} catch (@Pc(645) Exception local645) {
		}
		this.method1985(arg1);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BLclient!nd;)V")
	private void method1985(@OriginalArg(1) Class62_Sub1 arg0) {
		arg0.method4752(true);
		arg0.method4672(true);
		if (arg0.aFloat241 != Static448.aFloat326) {
			arg0.M(Static448.aFloat326);
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(ILclient!nd;)V")
	public void method1986(@OriginalArg(1) Class62_Sub1 arg0) {
		this.anInterface16_5.method3464(24, 196584);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public void method1987() {
		this.anInterface16_5.method3493();
	}
}
