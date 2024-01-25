import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class230 {

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
	public static final int[] anIntArray444 = new int[32];

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!gs;")
	private Class100 aClass100_5;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!rg;")
	private Interface12 anInterface12_5;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Lclient!gs;")
	private Class100 aClass100_6;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Lclient!gs;")
	private Class100 aClass100_7;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "[F")
	private final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!mm;")
	private final Class2_Sub20_Sub2 aClass2_Sub20_Sub2_3 = new Class2_Sub20_Sub2(786336);

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
	private final int anInt6714 = Static184.method2920(1600);

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	private int anInt6715 = 0;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "[I")
	private final int[] anIntArray445 = new int[1600];

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[[Lclient!ep;")
	private final Class38_Sub2_Sub1[][] aClass38_Sub2_Sub1ArrayArray2 = new Class38_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "[[Lclient!ep;")
	private final Class38_Sub2_Sub1[][] aClass38_Sub2_Sub1ArrayArray1 = new Class38_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "[I")
	private final int[] anIntArray446 = new int[8191];

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "[I")
	private final int[] anIntArray447 = new int[64];

	static {
		@Pc(7) int local7 = 2;
		for (@Pc(9) int local9 = 0; local9 < 32; local9++) {
			anIntArray444[local9] = local7 - 1;
			local7 += local7;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!bo;I)V")
	public void method5268(@OriginalArg(0) Class26_Sub1 arg0) {
		this.anInterface12_5 = arg0.method692(24, true, 196584, null);
		this.aClass100_7 = new Class100(arg0, this.anInterface12_5, 5126, 2, 0);
		this.aClass100_5 = new Class100(arg0, this.anInterface12_5, 5126, 3, 8);
		this.aClass100_6 = new Class100(arg0, this.anInterface12_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!bo;Lclient!pm;I)V")
	public void method5269(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) Class192 arg1) {
		if (arg0.aClass102_Sub2_3 == null) {
			return;
		}
		this.method5272(arg0);
		@Pc(23) float local23 = arg0.aClass102_Sub2_3.aFloat113;
		@Pc(27) float local27 = arg0.aClass102_Sub2_3.aFloat108;
		@Pc(31) float local31 = arg0.aClass102_Sub2_3.aFloat103;
		@Pc(35) float local35 = arg0.aClass102_Sub2_3.aFloat111;
		try {
			@Pc(45) int local45;
			@Pc(53) int local53;
			@Pc(78) Class38_Sub2 local78;
			@Pc(91) int local91;
			@Pc(189) int local189;
			if (arg1.aBoolean468) {
				local45 = arg1.anInt5381 - arg1.anInt5384;
				if (local45 + 2 <= 1600) {
					local45 += 2;
					local53 = 0;
				} else {
					local53 = Static184.method2920(local45) + 1 - this.anInt6714;
					local45 = (local45 >> local53) + 2;
				}
				@Pc(75) Class38_Sub2 local75 = arg1.aClass114_1.aClass38_Sub2_7;
				local78 = local75.aClass38_Sub2_5;
				@Pc(80) int local80 = -2;
				@Pc(82) boolean local82 = true;
				@Pc(84) boolean local84 = true;
				while (local78 != local75) {
					this.anInt6715 = 0;
					for (local91 = 0; local91 < local45; local91++) {
						this.anIntArray445[local91] = 0;
					}
					for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
						this.anIntArray447[local108] = 0;
					}
					while (local75 != local78) {
						@Pc(124) Class38_Sub2_Sub1 local124 = (Class38_Sub2_Sub1) local78;
						if (local84) {
							local80 = local124.anInt1736;
							local84 = false;
							local82 = local124.aBoolean147;
						} else if (local80 != local124.anInt1736 || local124.aBoolean147 != local82) {
							local84 = true;
							break;
						}
						local189 = (int) ((float) (local124.anInt1739 >> Static330.anInt5888) * local23 + (float) (local124.anInt1737 >> Static330.anInt5888) * local27 + local31 * (float) (local124.anInt1734 >> Static330.anInt5888) + local35) - arg1.anInt5384 >> local53;
						if (local189 < 1600) {
							if (this.anIntArray445[local189] < 64) {
								this.aClass38_Sub2_Sub1ArrayArray2[local189][this.anIntArray445[local189]++] = local124;
							} else {
								label198: {
									if (this.anIntArray445[local189] == 64) {
										if (this.anInt6715 == 64) {
											break label198;
										}
										this.anIntArray445[local189] += this.anInt6715++ + 1;
									}
									@Pc(257) Class38_Sub2_Sub1[] local257 = this.aClass38_Sub2_Sub1ArrayArray1[this.anIntArray445[local189] - 64 - 1];
									@Pc(265) int local265 = this.anIntArray445[local189] - 65;
									@Pc(267) int local267 = this.anIntArray447[this.anIntArray445[local189] - 65];
									this.anIntArray447[local265] = this.anIntArray447[this.anIntArray445[local189] - 65] + 1;
									local257[local267] = local124;
								}
							}
						}
						local78 = local78.aClass38_Sub2_5;
					}
					if (local80 >= 0) {
						arg0.method673(arg0.aClass244_1.method5493(local80));
						arg0.method669(arg0.anInterface8_5.method3836(local80).anInt5078);
					} else {
						arg0.method673(null);
					}
					if (local82 && arg0.aFloat33 != Static334.aFloat181) {
						arg0.ua(Static334.aFloat181);
					} else if (arg0.aFloat33 != 1.0F) {
						arg0.ua(1.0F);
					}
					this.method5271(local45, arg0);
				}
			} else {
				local45 = 0;
				local53 = Integer.MAX_VALUE;
				@Pc(340) int local340 = 0;
				local78 = arg1.aClass114_1.aClass38_Sub2_7;
				@Pc(347) Class38_Sub2 local347;
				@Pc(379) int local379;
				for (local347 = local78.aClass38_Sub2_5; local347 != local78; local347 = local347.aClass38_Sub2_5) {
					@Pc(352) Class38_Sub2_Sub1 local352 = (Class38_Sub2_Sub1) local347;
					local379 = (int) (local35 + (float) (local352.anInt1739 >> Static330.anInt5888) * local23 + local27 * (float) (local352.anInt1737 >> Static330.anInt5888) + (float) (local352.anInt1734 >> Static330.anInt5888) * local31);
					if (local340 < local379) {
						local340 = local379;
					}
					this.anIntArray446[local45++] = local379;
					if (local53 > local379) {
						local53 = local379;
					}
				}
				@Pc(410) int local410 = local340 - local53;
				if (local410 + 2 > 1600) {
					local379 = Static184.method2920(local410) + 1 - this.anInt6714;
					local410 = (local410 >> local379) + 2;
				} else {
					local410 += 2;
					local379 = 0;
				}
				local347 = local78.aClass38_Sub2_5;
				local45 = 0;
				local91 = -2;
				@Pc(447) boolean local447 = true;
				@Pc(449) boolean local449 = true;
				while (local347 != local78) {
					this.anInt6715 = 0;
					for (local189 = 0; local189 < local410; local189++) {
						this.anIntArray445[local189] = 0;
					}
					for (@Pc(473) int local473 = 0; local473 < 64; local473++) {
						this.anIntArray447[local473] = 0;
					}
					while (local78 != local347) {
						@Pc(489) Class38_Sub2_Sub1 local489 = (Class38_Sub2_Sub1) local347;
						if (local449) {
							local449 = false;
							local91 = local489.anInt1736;
							local447 = local489.aBoolean147;
						}
						if (local45 > 0 && (local91 != local489.anInt1736 || local489.aBoolean147 != local447)) {
							local449 = true;
							break;
						}
						@Pc(539) int local539 = this.anIntArray446[local45++] - local53 >> local379;
						if (local539 < 1600) {
							if (this.anIntArray445[local539] >= 64) {
								label148: {
									if (this.anIntArray445[local539] == 64) {
										if (this.anInt6715 == 64) {
											break label148;
										}
										this.anIntArray445[local539] += this.anInt6715++ + 1;
									}
									this.aClass38_Sub2_Sub1ArrayArray1[this.anIntArray445[local539] - 64 - 1][this.anIntArray447[this.anIntArray445[local539] - 64 - 1]++] = local489;
								}
							} else {
								this.aClass38_Sub2_Sub1ArrayArray2[local539][this.anIntArray445[local539]++] = local489;
							}
						}
						local347 = local347.aClass38_Sub2_5;
					}
					if (local91 < 0) {
						arg0.method673(null);
					} else {
						arg0.method673(arg0.aClass244_1.method5493(local91));
						arg0.method669(arg0.anInterface8_5.method3836(local91).anInt5078);
					}
					if (local447 && arg0.aFloat33 != Static334.aFloat181) {
						arg0.ua(Static334.aFloat181);
					} else if (arg0.aFloat33 != 1.0F) {
						arg0.ua(1.0F);
					}
					this.method5271(local410, arg0);
				}
			}
		} catch (@Pc(685) Exception local685) {
		}
		this.method5275(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!bo;)V")
	private void method5271(@OriginalArg(1) int arg0, @OriginalArg(2) Class26_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray30, 0);
		@Pc(15) float local15 = this.aFloatArray30[0];
		@Pc(20) float local20 = this.aFloatArray30[4];
		@Pc(25) float local25 = this.aFloatArray30[8];
		@Pc(30) float local30 = this.aFloatArray30[1];
		@Pc(35) float local35 = this.aFloatArray30[5];
		@Pc(40) float local40 = this.aFloatArray30[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(69) float local69 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		@Pc(84) float local84 = local40 - local25;
		this.aClass2_Sub20_Sub2_3.anInt4608 = 0;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class38_Sub2_Sub1 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class38_Sub2_Sub1 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg1.aBoolean76) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray445[local95] <= 64 ? this.anIntArray445[local95] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass38_Sub2_Sub1ArrayArray2[local95][local116];
						local128 = local125.anInt1735;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt1739 >> Static330.anInt5888;
						local158 = local125.anInt1737 >> Static330.anInt5888;
						local164 = local125.anInt1734 >> Static330.anInt5888;
						local169 = local125.anInt1738 >> Static330.anInt5888;
						this.aClass2_Sub20_Sub2_3.method3750(0.0F);
						this.aClass2_Sub20_Sub2_3.method3750(0.0F);
						this.aClass2_Sub20_Sub2_3.method3750(local44 * (float) -local169 + local152);
						this.aClass2_Sub20_Sub2_3.method3750(local158 + local48 * (float) -local169);
						this.aClass2_Sub20_Sub2_3.method3750(local164 + (float) -local169 * local52);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
						this.aClass2_Sub20_Sub2_3.method3750(1.0F);
						this.aClass2_Sub20_Sub2_3.method3750(0.0F);
						this.aClass2_Sub20_Sub2_3.method3750((float) local169 * local56 + local152);
						this.aClass2_Sub20_Sub2_3.method3750((float) local169 * local60 + local158);
						this.aClass2_Sub20_Sub2_3.method3750(local164 + local65 * (float) local169);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
						this.aClass2_Sub20_Sub2_3.method3750(1.0F);
						this.aClass2_Sub20_Sub2_3.method3750(1.0F);
						this.aClass2_Sub20_Sub2_3.method3750(local152 + (float) local169 * local44);
						this.aClass2_Sub20_Sub2_3.method3750((float) local169 * local48 + local158);
						this.aClass2_Sub20_Sub2_3.method3750((float) local169 * local52 + local164);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
						this.aClass2_Sub20_Sub2_3.method3750(0.0F);
						this.aClass2_Sub20_Sub2_3.method3750(1.0F);
						this.aClass2_Sub20_Sub2_3.method3750(local69 * (float) local169 + local152);
						this.aClass2_Sub20_Sub2_3.method3750(local158 + local74 * (float) local169);
						this.aClass2_Sub20_Sub2_3.method3750(local84 * (float) local169 + local164);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
					}
					if (this.anIntArray445[local95] > 64) {
						local442 = this.anIntArray445[local95] - 1 - 64;
						for (local128 = this.anIntArray447[local442] - 1; local128 >= 0; local128--) {
							local458 = this.aClass38_Sub2_Sub1ArrayArray1[local442][local128];
							local461 = local458.anInt1735;
							local141 = (byte) (local461 >> 16);
							local146 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local164 = local458.anInt1739 >> Static330.anInt5888;
							local491 = local458.anInt1737 >> Static330.anInt5888;
							local497 = local458.anInt1734 >> Static330.anInt5888;
							local502 = local458.anInt1738 >> Static330.anInt5888;
							this.aClass2_Sub20_Sub2_3.method3750(0.0F);
							this.aClass2_Sub20_Sub2_3.method3750(0.0F);
							this.aClass2_Sub20_Sub2_3.method3750(local164 + local44 * (float) -local502);
							this.aClass2_Sub20_Sub2_3.method3750((float) -local502 * local48 + local491);
							this.aClass2_Sub20_Sub2_3.method3750(local497 + local52 * (float) -local502);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
							this.aClass2_Sub20_Sub2_3.method3750(1.0F);
							this.aClass2_Sub20_Sub2_3.method3750(0.0F);
							this.aClass2_Sub20_Sub2_3.method3750(local164 + (float) local502 * local56);
							this.aClass2_Sub20_Sub2_3.method3750(local491 + local60 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3750(local65 * (float) local502 + local497);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
							this.aClass2_Sub20_Sub2_3.method3750(1.0F);
							this.aClass2_Sub20_Sub2_3.method3750(1.0F);
							this.aClass2_Sub20_Sub2_3.method3750(local164 + local44 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3750((float) local502 * local48 + local491);
							this.aClass2_Sub20_Sub2_3.method3750((float) local502 * local52 + local497);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
							this.aClass2_Sub20_Sub2_3.method3750(0.0F);
							this.aClass2_Sub20_Sub2_3.method3750(1.0F);
							this.aClass2_Sub20_Sub2_3.method3750(local164 + (float) local502 * local69);
							this.aClass2_Sub20_Sub2_3.method3750(local491 + local74 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3750(local497 + local84 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray445[local95] > 64 ? 64 : this.anIntArray445[local95];
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass38_Sub2_Sub1ArrayArray2[local95][local116];
						local128 = local125.anInt1735;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt1739 >> Static330.anInt5888;
						local158 = local125.anInt1737 >> Static330.anInt5888;
						local164 = local125.anInt1734 >> Static330.anInt5888;
						local169 = local125.anInt1738 >> Static330.anInt5888;
						this.aClass2_Sub20_Sub2_3.method3753(0.0F);
						this.aClass2_Sub20_Sub2_3.method3753(0.0F);
						this.aClass2_Sub20_Sub2_3.method3753(local152 + (float) -local169 * local44);
						this.aClass2_Sub20_Sub2_3.method3753(local48 * (float) -local169 + local158);
						this.aClass2_Sub20_Sub2_3.method3753((float) -local169 * local52 + local164);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
						this.aClass2_Sub20_Sub2_3.method3753(1.0F);
						this.aClass2_Sub20_Sub2_3.method3753(0.0F);
						this.aClass2_Sub20_Sub2_3.method3753(local152 + local56 * (float) local169);
						this.aClass2_Sub20_Sub2_3.method3753(local158 + (float) local169 * local60);
						this.aClass2_Sub20_Sub2_3.method3753(local65 * (float) local169 + local164);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
						this.aClass2_Sub20_Sub2_3.method3753(1.0F);
						this.aClass2_Sub20_Sub2_3.method3753(1.0F);
						this.aClass2_Sub20_Sub2_3.method3753(local152 + local44 * (float) local169);
						this.aClass2_Sub20_Sub2_3.method3753(local158 + local48 * (float) local169);
						this.aClass2_Sub20_Sub2_3.method3753((float) local169 * local52 + local164);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
						this.aClass2_Sub20_Sub2_3.method3753(0.0F);
						this.aClass2_Sub20_Sub2_3.method3753(1.0F);
						this.aClass2_Sub20_Sub2_3.method3753(local69 * (float) local169 + local152);
						this.aClass2_Sub20_Sub2_3.method3753(local74 * (float) local169 + local158);
						this.aClass2_Sub20_Sub2_3.method3753(local164 + local84 * (float) local169);
						this.aClass2_Sub20_Sub2_3.method3699(local133);
						this.aClass2_Sub20_Sub2_3.method3699(local138);
						this.aClass2_Sub20_Sub2_3.method3699(local141);
						this.aClass2_Sub20_Sub2_3.method3699(local146);
					}
					if (this.anIntArray445[local95] > 64) {
						local442 = this.anIntArray445[local95] - 64 - 1;
						for (local128 = this.anIntArray447[local442] - 1; local128 >= 0; local128--) {
							local458 = this.aClass38_Sub2_Sub1ArrayArray1[local442][local128];
							local461 = local458.anInt1735;
							local141 = (byte) (local461 >> 16);
							local146 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local164 = local458.anInt1739 >> Static330.anInt5888;
							local491 = local458.anInt1737 >> Static330.anInt5888;
							local497 = local458.anInt1734 >> Static330.anInt5888;
							local502 = local458.anInt1738 >> Static330.anInt5888;
							this.aClass2_Sub20_Sub2_3.method3753(0.0F);
							this.aClass2_Sub20_Sub2_3.method3753(0.0F);
							this.aClass2_Sub20_Sub2_3.method3753(local164 + local44 * (float) -local502);
							this.aClass2_Sub20_Sub2_3.method3753(local491 + (float) -local502 * local48);
							this.aClass2_Sub20_Sub2_3.method3753(local497 + (float) -local502 * local52);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
							this.aClass2_Sub20_Sub2_3.method3753(1.0F);
							this.aClass2_Sub20_Sub2_3.method3753(0.0F);
							this.aClass2_Sub20_Sub2_3.method3753(local164 + local56 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3753(local491 + local60 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3753(local497 + local65 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
							this.aClass2_Sub20_Sub2_3.method3753(1.0F);
							this.aClass2_Sub20_Sub2_3.method3753(1.0F);
							this.aClass2_Sub20_Sub2_3.method3753(local164 + local44 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3753(local491 + local48 * (float) local502);
							this.aClass2_Sub20_Sub2_3.method3753((float) local502 * local52 + local497);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
							this.aClass2_Sub20_Sub2_3.method3753(0.0F);
							this.aClass2_Sub20_Sub2_3.method3753(1.0F);
							this.aClass2_Sub20_Sub2_3.method3753(local164 + (float) local502 * local69);
							this.aClass2_Sub20_Sub2_3.method3753((float) local502 * local74 + local491);
							this.aClass2_Sub20_Sub2_3.method3753(local497 + (float) local502 * local84);
							this.aClass2_Sub20_Sub2_3.method3699(local141);
							this.aClass2_Sub20_Sub2_3.method3699(local146);
							this.aClass2_Sub20_Sub2_3.method3699(local474);
							this.aClass2_Sub20_Sub2_3.method3699(local479);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub20_Sub2_3.anInt4608 != 0) {
			this.anInterface12_5.method3160(this.aClass2_Sub20_Sub2_3.aByteArray136, 24, this.aClass2_Sub20_Sub2_3.anInt4608);
			arg1.method668(this.aClass100_7, this.aClass100_5, null, this.aClass100_6);
			arg1.method707(this.aClass2_Sub20_Sub2_3.anInt4608 / 24);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!bo;)V")
	private void method5272(@OriginalArg(1) Class26_Sub1 arg0) {
		Static334.aFloat181 = arg0.aFloat33;
		arg0.method666();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method644(false);
		arg0.method628(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(Lclient!bo;I)V")
	private void method5275(@OriginalArg(0) Class26_Sub1 arg0) {
		arg0.method644(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static334.aFloat181 != arg0.aFloat33) {
			arg0.ua(Static334.aFloat181);
		}
	}
}
