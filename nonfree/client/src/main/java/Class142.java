import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class142 {

	@OriginalMember(owner = "client!ld", name = "o", descriptor = "Lclient!jd;")
	private Class118 aClass118_9;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!jd;")
	private Class118 aClass118_10;

	@OriginalMember(owner = "client!ld", name = "q", descriptor = "Lclient!jd;")
	private Class118 aClass118_11;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "Lclient!us;")
	private Interface9 anInterface9_6;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "[F")
	private final float[] aFloatArray18 = new float[16];

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Lclient!ow;")
	private final Class4_Sub20_Sub2 aClass4_Sub20_Sub2_3 = new Class4_Sub20_Sub2(786336);

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	private final int anInt4444 = Static58.method1271(1600);

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[I")
	private final int[] anIntArray350 = new int[1600];

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	private int anInt4445 = 0;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[I")
	private final int[] anIntArray351 = new int[64];

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[[Lclient!tr;")
	private final Class71_Sub1_Sub2[][] aClass71_Sub1_Sub2ArrayArray1 = new Class71_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "[[Lclient!tr;")
	private final Class71_Sub1_Sub2[][] aClass71_Sub1_Sub2ArrayArray2 = new Class71_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "[I")
	private final int[] anIntArray352 = new int[8191];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!bt;)V")
	public void method3812(@OriginalArg(1) Class30_Sub1 arg0) {
		this.anInterface9_6 = arg0.method686(true, 24, 196584, null);
		this.aClass118_11 = new Class118(this.anInterface9_6, 5126, 2, 0);
		this.aClass118_10 = new Class118(this.anInterface9_6, 5126, 3, 8);
		this.aClass118_9 = new Class118(this.anInterface9_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!bt;B)V")
	private void method3815(@OriginalArg(0) Class30_Sub1 arg0) {
		Static220.aFloat67 = arg0.aFloat22;
		arg0.method702();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method731(false);
		arg0.method693(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!bt;I)V")
	private void method3816(@OriginalArg(0) Class30_Sub1 arg0) {
		arg0.method731(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static220.aFloat67 != arg0.aFloat22) {
			arg0.MA(Static220.aFloat67);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!bt;BLclient!wg;)V")
	public void method3817(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(2) Class270 arg1) {
		if (arg0.aClass72_Sub2_3 == null) {
			return;
		}
		this.method3815(arg0);
		@Pc(21) float local21 = arg0.aClass72_Sub2_3.aFloat52;
		@Pc(25) float local25 = arg0.aClass72_Sub2_3.aFloat51;
		@Pc(29) float local29 = arg0.aClass72_Sub2_3.aFloat45;
		@Pc(33) float local33 = arg0.aClass72_Sub2_3.aFloat54;
		try {
			@Pc(43) int local43;
			@Pc(57) int local57;
			@Pc(75) Class71_Sub1 local75;
			@Pc(88) int local88;
			@Pc(226) Class71_Sub1_Sub2[] local226;
			@Pc(176) int local176;
			@Pc(236) int local236;
			@Pc(238) int local238;
			if (arg1.aBoolean567) {
				local43 = arg1.anInt7771 - arg1.anInt7770;
				if (local43 + 2 > 1600) {
					local57 = Static58.method1271(local43) + 1 - this.anInt4444;
					local43 = (local43 >> local57) + 2;
				} else {
					local43 += 2;
					local57 = 0;
				}
				@Pc(72) Class71_Sub1 local72 = arg1.aClass108_1.aClass71_Sub1_5;
				local75 = local72.aClass71_Sub1_9;
				@Pc(77) int local77 = -2;
				@Pc(79) boolean local79 = true;
				@Pc(81) boolean local81 = true;
				while (local75 != local72) {
					this.anInt4445 = 0;
					for (local88 = 0; local88 < local43; local88++) {
						this.anIntArray350[local88] = 0;
					}
					for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
						this.anIntArray351[local101] = 0;
					}
					while (local72 != local75) {
						@Pc(119) Class71_Sub1_Sub2 local119 = (Class71_Sub1_Sub2) local75;
						if (local81) {
							local81 = false;
							local77 = local119.anInt3402;
							local79 = local119.aBoolean228;
						} else if (local77 != local119.anInt3402 || local79 != local119.aBoolean228) {
							local81 = true;
							break;
						}
						local176 = (int) (local33 + (float) (local119.anInt3398 >> 12) * local21 + (float) (local119.anInt3404 >> 12) * local25 + (float) (local119.anInt3400 >> 12) * local29) - arg1.anInt7770 >> local57;
						if (local176 < 1600) {
							if (this.anIntArray350[local176] >= 64) {
								label188: {
									if (this.anIntArray350[local176] == 64) {
										if (this.anInt4445 == 64) {
											break label188;
										}
										this.anIntArray350[local176] += this.anInt4445++ + 1;
									}
									local226 = this.aClass71_Sub1_Sub2ArrayArray2[this.anIntArray350[local176] - 65];
									local236 = this.anIntArray350[local176] - 64 - 1;
									local238 = this.anIntArray351[this.anIntArray350[local176] - 64 - 1];
									this.anIntArray351[local236] = this.anIntArray351[this.anIntArray350[local176] - 64 - 1] + 1;
									local226[local238] = local119;
								}
							} else {
								this.aClass71_Sub1_Sub2ArrayArray1[local176][this.anIntArray350[local176]++] = local119;
							}
						}
						local75 = local75.aClass71_Sub1_9;
					}
					if (local77 >= 0) {
						arg0.method730(arg0.aClass144_1.method3825(local77));
						arg0.method713(arg0.anInterface4_5.method5685(local77).anInt4784);
					} else {
						arg0.method730(null);
					}
					if (local79 && Static220.aFloat67 != arg0.aFloat22) {
						arg0.MA(Static220.aFloat67);
					} else if (arg0.aFloat22 != 1.0F) {
						arg0.MA(1.0F);
					}
					this.method3818(local43, arg0);
				}
			} else {
				local43 = 0;
				local57 = Integer.MAX_VALUE;
				@Pc(328) int local328 = 0;
				local75 = arg1.aClass108_1.aClass71_Sub1_5;
				@Pc(335) Class71_Sub1 local335;
				@Pc(367) int local367;
				for (local335 = local75.aClass71_Sub1_9; local335 != local75; local335 = local335.aClass71_Sub1_9) {
					@Pc(340) Class71_Sub1_Sub2 local340 = (Class71_Sub1_Sub2) local335;
					local367 = (int) (local29 * (float) (local340.anInt3400 >> 12) + (float) (local340.anInt3398 >> 12) * local21 + (float) (local340.anInt3404 >> 12) * local25 + local33);
					if (local57 > local367) {
						local57 = local367;
					}
					if (local367 > local328) {
						local328 = local367;
					}
					this.anIntArray352[local43++] = local367;
				}
				@Pc(402) int local402 = local328 - local57;
				if (local402 + 2 > 1600) {
					local367 = Static58.method1271(local402) + 1 - this.anInt4444;
					local402 = (local402 >> local367) + 2;
				} else {
					local402 += 2;
					local367 = 0;
				}
				local43 = 0;
				local335 = local75.aClass71_Sub1_9;
				local88 = -2;
				@Pc(437) boolean local437 = true;
				@Pc(439) boolean local439 = true;
				while (local335 != local75) {
					this.anInt4445 = 0;
					for (local176 = 0; local176 < local402; local176++) {
						this.anIntArray350[local176] = 0;
					}
					for (@Pc(459) int local459 = 0; local459 < 64; local459++) {
						this.anIntArray351[local459] = 0;
					}
					while (local75 != local335) {
						@Pc(477) Class71_Sub1_Sub2 local477 = (Class71_Sub1_Sub2) local335;
						if (local439) {
							local88 = local477.anInt3402;
							local439 = false;
							local437 = local477.aBoolean228;
						}
						if (local43 > 0 && (local477.anInt3402 != local88 || local437 != local477.aBoolean228)) {
							local439 = true;
							break;
						}
						@Pc(520) int local520 = this.anIntArray352[local43++] - local57 >> local367;
						if (local520 < 1600) {
							if (this.anIntArray350[local520] < 64) {
								this.aClass71_Sub1_Sub2ArrayArray1[local520][this.anIntArray350[local520]++] = local477;
							} else {
								label139: {
									if (this.anIntArray350[local520] == 64) {
										if (this.anInt4445 == 64) {
											break label139;
										}
										this.anIntArray350[local520] += this.anInt4445++ + 1;
									}
									local226 = this.aClass71_Sub1_Sub2ArrayArray2[this.anIntArray350[local520] - 1 - 64];
									local236 = this.anIntArray350[local520] - 64 - 1;
									local238 = this.anIntArray351[this.anIntArray350[local520] - 64 - 1];
									this.anIntArray351[local236] = this.anIntArray351[this.anIntArray350[local520] - 64 - 1] + 1;
									local226[local238] = local477;
								}
							}
						}
						local335 = local335.aClass71_Sub1_9;
					}
					if (local88 >= 0) {
						arg0.method730(arg0.aClass144_1.method3825(local88));
						arg0.method713(arg0.anInterface4_5.method5685(local88).anInt4784);
					} else {
						arg0.method730(null);
					}
					if (local437 && arg0.aFloat22 != Static220.aFloat67) {
						arg0.MA(Static220.aFloat67);
					} else if (arg0.aFloat22 != 1.0F) {
						arg0.MA(1.0F);
					}
					this.method3818(local402, arg0);
				}
			}
		} catch (@Pc(673) Exception local673) {
		}
		this.method3816(arg0);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IILclient!bt;)V")
	private void method3818(@OriginalArg(1) int arg0, @OriginalArg(2) Class30_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray18, 0);
		@Pc(15) float local15 = this.aFloatArray18[0];
		@Pc(20) float local20 = this.aFloatArray18[4];
		@Pc(25) float local25 = this.aFloatArray18[8];
		@Pc(30) float local30 = this.aFloatArray18[1];
		@Pc(35) float local35 = this.aFloatArray18[5];
		@Pc(40) float local40 = this.aFloatArray18[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local25 + local40;
		@Pc(65) float local65 = local15 - local30;
		@Pc(69) float local69 = local20 - local35;
		@Pc(73) float local73 = local25 - local40;
		@Pc(77) float local77 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		this.aClass4_Sub20_Sub2_3.anInt5526 = 0;
		@Pc(91) float local91 = local40 - local25;
		@Pc(98) int local98;
		@Pc(113) int local113;
		@Pc(122) int local122;
		@Pc(131) Class71_Sub1_Sub2 local131;
		@Pc(134) int local134;
		@Pc(139) byte local139;
		@Pc(144) byte local144;
		@Pc(147) byte local147;
		@Pc(152) byte local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(170) float local170;
		@Pc(175) int local175;
		@Pc(496) float local496;
		@Pc(501) int local501;
		@Pc(441) int local441;
		@Pc(457) Class71_Sub1_Sub2 local457;
		@Pc(460) int local460;
		@Pc(473) byte local473;
		@Pc(478) byte local478;
		@Pc(490) float local490;
		if (arg1.aBoolean51) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local113 = this.anIntArray350[local98] > 64 ? 64 : this.anIntArray350[local98];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass71_Sub1_Sub2ArrayArray1[local98][local122];
						local134 = local131.anInt3399;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt3398 >> 12;
						local164 = local131.anInt3404 >> 12;
						local170 = local131.anInt3400 >> 12;
						local175 = local131.anInt3401 >> 12;
						this.aClass4_Sub20_Sub2_3.method4626(0.0F);
						this.aClass4_Sub20_Sub2_3.method4626(0.0F);
						this.aClass4_Sub20_Sub2_3.method4626(local44 * (float) -local175 + local158);
						this.aClass4_Sub20_Sub2_3.method4626(local164 + local48 * (float) -local175);
						this.aClass4_Sub20_Sub2_3.method4626(local170 + (float) -local175 * local52);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
						this.aClass4_Sub20_Sub2_3.method4626(1.0F);
						this.aClass4_Sub20_Sub2_3.method4626(0.0F);
						this.aClass4_Sub20_Sub2_3.method4626(local158 + local65 * (float) local175);
						this.aClass4_Sub20_Sub2_3.method4626(local69 * (float) local175 + local164);
						this.aClass4_Sub20_Sub2_3.method4626(local170 + (float) local175 * local73);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
						this.aClass4_Sub20_Sub2_3.method4626(1.0F);
						this.aClass4_Sub20_Sub2_3.method4626(1.0F);
						this.aClass4_Sub20_Sub2_3.method4626((float) local175 * local44 + local158);
						this.aClass4_Sub20_Sub2_3.method4626(local164 + local48 * (float) local175);
						this.aClass4_Sub20_Sub2_3.method4626(local170 + (float) local175 * local52);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
						this.aClass4_Sub20_Sub2_3.method4626(0.0F);
						this.aClass4_Sub20_Sub2_3.method4626(1.0F);
						this.aClass4_Sub20_Sub2_3.method4626(local158 + (float) local175 * local77);
						this.aClass4_Sub20_Sub2_3.method4626(local164 + local82 * (float) local175);
						this.aClass4_Sub20_Sub2_3.method4626(local170 + (float) local175 * local91);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
					}
					if (this.anIntArray350[local98] > 64) {
						local441 = this.anIntArray350[local98] - 65;
						for (local134 = this.anIntArray351[local441] - 1; local134 >= 0; local134--) {
							local457 = this.aClass71_Sub1_Sub2ArrayArray2[local441][local134];
							local460 = local457.anInt3399;
							local147 = (byte) (local460 >> 16);
							local152 = (byte) (local460 >> 8);
							local473 = (byte) local460;
							local478 = (byte) (local460 >>> 24);
							local170 = local457.anInt3398 >> 12;
							local490 = local457.anInt3404 >> 12;
							local496 = local457.anInt3400 >> 12;
							local501 = local457.anInt3401 >> 12;
							this.aClass4_Sub20_Sub2_3.method4626(0.0F);
							this.aClass4_Sub20_Sub2_3.method4626(0.0F);
							this.aClass4_Sub20_Sub2_3.method4626((float) -local501 * local44 + local170);
							this.aClass4_Sub20_Sub2_3.method4626(local48 * (float) -local501 + local490);
							this.aClass4_Sub20_Sub2_3.method4626(local496 + (float) -local501 * local52);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
							this.aClass4_Sub20_Sub2_3.method4626(1.0F);
							this.aClass4_Sub20_Sub2_3.method4626(0.0F);
							this.aClass4_Sub20_Sub2_3.method4626(local170 + (float) local501 * local65);
							this.aClass4_Sub20_Sub2_3.method4626(local490 + local69 * (float) local501);
							this.aClass4_Sub20_Sub2_3.method4626(local496 + local73 * (float) local501);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
							this.aClass4_Sub20_Sub2_3.method4626(1.0F);
							this.aClass4_Sub20_Sub2_3.method4626(1.0F);
							this.aClass4_Sub20_Sub2_3.method4626((float) local501 * local44 + local170);
							this.aClass4_Sub20_Sub2_3.method4626(local48 * (float) local501 + local490);
							this.aClass4_Sub20_Sub2_3.method4626(local496 + (float) local501 * local52);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
							this.aClass4_Sub20_Sub2_3.method4626(0.0F);
							this.aClass4_Sub20_Sub2_3.method4626(1.0F);
							this.aClass4_Sub20_Sub2_3.method4626(local170 + local77 * (float) local501);
							this.aClass4_Sub20_Sub2_3.method4626(local490 + (float) local501 * local82);
							this.aClass4_Sub20_Sub2_3.method4626(local496 + (float) local501 * local91);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local113 = this.anIntArray350[local98] > 64 ? 64 : this.anIntArray350[local98];
				if (local113 > 0) {
					for (local122 = local113 - 1; local122 >= 0; local122--) {
						local131 = this.aClass71_Sub1_Sub2ArrayArray1[local98][local122];
						local134 = local131.anInt3399;
						local139 = (byte) (local134 >> 16);
						local144 = (byte) (local134 >> 8);
						local147 = (byte) local134;
						local152 = (byte) (local134 >>> 24);
						local158 = local131.anInt3398 >> 12;
						local164 = local131.anInt3404 >> 12;
						local170 = local131.anInt3400 >> 12;
						local175 = local131.anInt3401 >> 12;
						this.aClass4_Sub20_Sub2_3.method4627(0.0F);
						this.aClass4_Sub20_Sub2_3.method4627(0.0F);
						this.aClass4_Sub20_Sub2_3.method4627(local158 + (float) -local175 * local44);
						this.aClass4_Sub20_Sub2_3.method4627((float) -local175 * local48 + local164);
						this.aClass4_Sub20_Sub2_3.method4627(local52 * (float) -local175 + local170);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
						this.aClass4_Sub20_Sub2_3.method4627(1.0F);
						this.aClass4_Sub20_Sub2_3.method4627(0.0F);
						this.aClass4_Sub20_Sub2_3.method4627(local65 * (float) local175 + local158);
						this.aClass4_Sub20_Sub2_3.method4627(local69 * (float) local175 + local164);
						this.aClass4_Sub20_Sub2_3.method4627(local170 + (float) local175 * local73);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
						this.aClass4_Sub20_Sub2_3.method4627(1.0F);
						this.aClass4_Sub20_Sub2_3.method4627(1.0F);
						this.aClass4_Sub20_Sub2_3.method4627((float) local175 * local44 + local158);
						this.aClass4_Sub20_Sub2_3.method4627((float) local175 * local48 + local164);
						this.aClass4_Sub20_Sub2_3.method4627((float) local175 * local52 + local170);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
						this.aClass4_Sub20_Sub2_3.method4627(0.0F);
						this.aClass4_Sub20_Sub2_3.method4627(1.0F);
						this.aClass4_Sub20_Sub2_3.method4627(local77 * (float) local175 + local158);
						this.aClass4_Sub20_Sub2_3.method4627((float) local175 * local82 + local164);
						this.aClass4_Sub20_Sub2_3.method4627((float) local175 * local91 + local170);
						this.aClass4_Sub20_Sub2_3.method4590(local139);
						this.aClass4_Sub20_Sub2_3.method4590(local144);
						this.aClass4_Sub20_Sub2_3.method4590(local147);
						this.aClass4_Sub20_Sub2_3.method4590(local152);
					}
					if (this.anIntArray350[local98] > 64) {
						local441 = this.anIntArray350[local98] - 1 - 64;
						for (local134 = this.anIntArray351[local441] - 1; local134 >= 0; local134--) {
							local457 = this.aClass71_Sub1_Sub2ArrayArray2[local441][local134];
							local460 = local457.anInt3399;
							local147 = (byte) (local460 >> 16);
							local152 = (byte) (local460 >> 8);
							local473 = (byte) local460;
							local478 = (byte) (local460 >>> 24);
							local170 = local457.anInt3398 >> 12;
							local490 = local457.anInt3404 >> 12;
							local496 = local457.anInt3400 >> 12;
							local501 = local457.anInt3401 >> 12;
							this.aClass4_Sub20_Sub2_3.method4627(0.0F);
							this.aClass4_Sub20_Sub2_3.method4627(0.0F);
							this.aClass4_Sub20_Sub2_3.method4627((float) -local501 * local44 + local170);
							this.aClass4_Sub20_Sub2_3.method4627(local48 * (float) -local501 + local490);
							this.aClass4_Sub20_Sub2_3.method4627(local496 + local52 * (float) -local501);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
							this.aClass4_Sub20_Sub2_3.method4627(1.0F);
							this.aClass4_Sub20_Sub2_3.method4627(0.0F);
							this.aClass4_Sub20_Sub2_3.method4627(local170 + (float) local501 * local65);
							this.aClass4_Sub20_Sub2_3.method4627((float) local501 * local69 + local490);
							this.aClass4_Sub20_Sub2_3.method4627((float) local501 * local73 + local496);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
							this.aClass4_Sub20_Sub2_3.method4627(1.0F);
							this.aClass4_Sub20_Sub2_3.method4627(1.0F);
							this.aClass4_Sub20_Sub2_3.method4627(local170 + (float) local501 * local44);
							this.aClass4_Sub20_Sub2_3.method4627(local48 * (float) local501 + local490);
							this.aClass4_Sub20_Sub2_3.method4627(local496 + local52 * (float) local501);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
							this.aClass4_Sub20_Sub2_3.method4627(0.0F);
							this.aClass4_Sub20_Sub2_3.method4627(1.0F);
							this.aClass4_Sub20_Sub2_3.method4627((float) local501 * local77 + local170);
							this.aClass4_Sub20_Sub2_3.method4627(local490 + (float) local501 * local82);
							this.aClass4_Sub20_Sub2_3.method4627((float) local501 * local91 + local496);
							this.aClass4_Sub20_Sub2_3.method4590(local147);
							this.aClass4_Sub20_Sub2_3.method4590(local152);
							this.aClass4_Sub20_Sub2_3.method4590(local473);
							this.aClass4_Sub20_Sub2_3.method4590(local478);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub20_Sub2_3.anInt5526 != 0) {
			this.anInterface9_6.method4493(24, this.aClass4_Sub20_Sub2_3.anInt5526, this.aClass4_Sub20_Sub2_3.aByteArray77);
			arg1.method748(this.aClass118_9, null, this.aClass118_11, this.aClass118_10);
			arg1.method757(this.aClass4_Sub20_Sub2_3.anInt5526 / 24);
		}
	}
}
