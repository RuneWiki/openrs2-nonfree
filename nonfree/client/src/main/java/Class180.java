import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class180 {

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!gm;")
	private Class84 aClass84_13;

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!na;")
	private Interface9 anInterface9_6;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!gm;")
	private Class84 aClass84_14;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!gm;")
	private Class84 aClass84_15;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "[F")
	private final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!jm;")
	private final Class1_Sub21_Sub1 aClass1_Sub21_Sub1_3 = new Class1_Sub21_Sub1(786336);

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "[I")
	private final int[] anIntArray544 = new int[8191];

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[[Lclient!eo;")
	private final Class7_Sub2_Sub1[][] aClass7_Sub2_Sub1ArrayArray1 = new Class7_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "[[Lclient!eo;")
	private final Class7_Sub2_Sub1[][] aClass7_Sub2_Sub1ArrayArray2 = new Class7_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	private int anInt5611 = 0;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
	private final int[] anIntArray546 = new int[1600];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "[I")
	private final int[] anIntArray545 = new int[64];

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nf;)V")
	public void method4898(@OriginalArg(0) Class105_Sub1 arg0) {
		this.anInterface9_6 = arg0.method3615(24, null, 196584, true);
		this.aClass84_15 = new Class84(arg0, this.anInterface9_6, 5126, 2, 0);
		this.aClass84_14 = new Class84(arg0, this.anInterface9_6, 5126, 3, 8);
		this.aClass84_13 = new Class84(arg0, this.anInterface9_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Lclient!nf;)V")
	private void method4899(@OriginalArg(0) Class105_Sub1 arg0) {
		arg0.method3561();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method3589(false);
		arg0.method3613();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nf;Lclient!op;)V")
	public void method4900(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) Class153 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass31_Sub2_2 == null) {
			return;
		}
		this.method4899(arg0);
		@Pc(14) float local14 = arg0.aClass31_Sub2_2.aFloat31;
		@Pc(18) float local18 = arg0.aClass31_Sub2_2.aFloat30;
		@Pc(22) float local22 = arg0.aClass31_Sub2_2.aFloat26;
		@Pc(26) float local26 = arg0.aClass31_Sub2_2.aFloat33;
		try {
			@Pc(31) int local31;
			@Pc(48) Class7_Sub2_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean370) {
				local31 = arg1.anInt4686 - arg1.anInt4681;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class7_Sub2 local290 = arg1.aClass55_1.aClass7_Sub2_7;
				@Pc(293) Class7_Sub2 local293 = local290.aClass7_Sub2_5;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt5611 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray546[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray545[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class7_Sub2_Sub1) local293;
						if (local297) {
							local295 = local48.anInt958;
							local297 = false;
						} else if (local295 != local48.anInt958) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt955 >> Static142.anInt2785) + local18 * (float) (local48.anInt965 >> Static142.anInt2785) + local22 * (float) (local48.anInt963 >> Static142.anInt2785) + local26) - arg1.anInt4681;
						if (local75 <= 1600) {
							if (this.anIntArray546[local75] < 64) {
								this.aClass7_Sub2_Sub1ArrayArray1[local75][this.anIntArray546[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray546[local75] == 64) {
										if (this.anInt5611 == 64) {
											break label188;
										}
										this.anIntArray546[local75] += this.anInt5611++ + 1;
									}
									this.aClass7_Sub2_Sub1ArrayArray2[this.anIntArray546[local75] - 64 - 1][this.anIntArray545[this.anIntArray546[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass7_Sub2_5;
					}
					arg0.method3591(local295 >= 0 ? arg0.aClass191_1.method5102(local295) : null);
					this.method4901(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class7_Sub2 local39 = arg1.aClass55_1.aClass7_Sub2_7;
				@Pc(42) Class7_Sub2 local42;
				for (local42 = local39.aClass7_Sub2_5; local42 != local39; local42 = local42.aClass7_Sub2_5) {
					local48 = (Class7_Sub2_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt955 >> Static142.anInt2785) + local18 * (float) (local48.anInt965 >> Static142.anInt2785) + local22 * (float) (local48.anInt963 >> Static142.anInt2785) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray544[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass7_Sub2_5;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt5611 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray546[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray545[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class7_Sub2_Sub1 local149 = (Class7_Sub2_Sub1) local42;
						if (local113) {
							local75 = local149.anInt958;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt958) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray544[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray546[local173] < 64) {
								this.aClass7_Sub2_Sub1ArrayArray1[local173][this.anIntArray546[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray546[local173] == 64) {
										if (this.anInt5611 == 64) {
											break label186;
										}
										this.anIntArray546[local173] += this.anInt5611++ + 1;
									}
									this.aClass7_Sub2_Sub1ArrayArray2[this.anIntArray546[local173] - 64 - 1][this.anIntArray545[this.anIntArray546[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass7_Sub2_5;
					}
					arg0.method3591(local75 >= 0 ? arg0.aClass191_1.method5102(local75) : null);
					this.method4901(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method4902(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!nf;I)V")
	private void method4901(@OriginalArg(0) Class105_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(2982, this.aFloatArray27, 0);
		@Pc(11) float local11 = this.aFloatArray27[0];
		@Pc(16) float local16 = this.aFloatArray27[4];
		@Pc(21) float local21 = this.aFloatArray27[8];
		@Pc(26) float local26 = this.aFloatArray27[1];
		@Pc(31) float local31 = this.aFloatArray27[5];
		@Pc(36) float local36 = this.aFloatArray27[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass1_Sub21_Sub1_3.anInt6611 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class7_Sub2_Sub1 local113;
		@Pc(116) int local116;
		@Pc(121) byte local121;
		@Pc(126) byte local126;
		@Pc(129) byte local129;
		@Pc(134) byte local134;
		@Pc(140) float local140;
		@Pc(146) float local146;
		@Pc(152) float local152;
		@Pc(157) int local157;
		@Pc(477) int local477;
		@Pc(424) int local424;
		@Pc(433) Class7_Sub2_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean316) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray546[local83] > 64 ? 64 : this.anIntArray546[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass7_Sub2_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt959;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt955 >> Static142.anInt2785;
						local146 = local113.anInt965 >> Static142.anInt2785;
						local152 = local113.anInt963 >> Static142.anInt2785;
						local157 = local113.anInt964 >> Static142.anInt2785;
						this.aClass1_Sub21_Sub1_3.method2551(0.0F);
						this.aClass1_Sub21_Sub1_3.method2551(0.0F);
						this.aClass1_Sub21_Sub1_3.method2551(local140 + local40 * (float) -local157);
						this.aClass1_Sub21_Sub1_3.method2551(local146 + local44 * (float) -local157);
						this.aClass1_Sub21_Sub1_3.method2551(local152 + local48 * (float) -local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
						this.aClass1_Sub21_Sub1_3.method2551(1.0F);
						this.aClass1_Sub21_Sub1_3.method2551(0.0F);
						this.aClass1_Sub21_Sub1_3.method2551(local140 + local52 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2551(local146 + local56 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2551(local152 + local60 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
						this.aClass1_Sub21_Sub1_3.method2551(1.0F);
						this.aClass1_Sub21_Sub1_3.method2551(1.0F);
						this.aClass1_Sub21_Sub1_3.method2551(local140 + local40 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2551(local146 + local44 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2551(local152 + local48 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
						this.aClass1_Sub21_Sub1_3.method2551(0.0F);
						this.aClass1_Sub21_Sub1_3.method2551(1.0F);
						this.aClass1_Sub21_Sub1_3.method2551(local140 + local64 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2551(local146 + local68 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2551(local152 + local72 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
					}
					if (this.anIntArray546[local83] > 64) {
						local104 = this.anIntArray546[local83] - 64 - 1;
						for (local424 = this.anIntArray545[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass7_Sub2_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt959;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt955 >> Static142.anInt2785;
							local152 = local433.anInt965 >> Static142.anInt2785;
							local472 = local433.anInt963 >> Static142.anInt2785;
							local477 = local433.anInt964 >> Static142.anInt2785;
							this.aClass1_Sub21_Sub1_3.method2551(0.0F);
							this.aClass1_Sub21_Sub1_3.method2551(0.0F);
							this.aClass1_Sub21_Sub1_3.method2551(local146 + local40 * (float) -local477);
							this.aClass1_Sub21_Sub1_3.method2551(local152 + local44 * (float) -local477);
							this.aClass1_Sub21_Sub1_3.method2551(local472 + local48 * (float) -local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
							this.aClass1_Sub21_Sub1_3.method2551(1.0F);
							this.aClass1_Sub21_Sub1_3.method2551(0.0F);
							this.aClass1_Sub21_Sub1_3.method2551(local146 + local52 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2551(local152 + local56 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2551(local472 + local60 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
							this.aClass1_Sub21_Sub1_3.method2551(1.0F);
							this.aClass1_Sub21_Sub1_3.method2551(1.0F);
							this.aClass1_Sub21_Sub1_3.method2551(local146 + local40 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2551(local152 + local44 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2551(local472 + local48 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
							this.aClass1_Sub21_Sub1_3.method2551(0.0F);
							this.aClass1_Sub21_Sub1_3.method2551(1.0F);
							this.aClass1_Sub21_Sub1_3.method2551(local146 + local64 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2551(local152 + local68 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2551(local472 + local72 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray546[local83] > 64 ? 64 : this.anIntArray546[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass7_Sub2_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt959;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt955 >> Static142.anInt2785;
						local146 = local113.anInt965 >> Static142.anInt2785;
						local152 = local113.anInt963 >> Static142.anInt2785;
						local157 = local113.anInt964 >> Static142.anInt2785;
						this.aClass1_Sub21_Sub1_3.method2552(0.0F);
						this.aClass1_Sub21_Sub1_3.method2552(0.0F);
						this.aClass1_Sub21_Sub1_3.method2552(local140 + local40 * (float) -local157);
						this.aClass1_Sub21_Sub1_3.method2552(local146 + local44 * (float) -local157);
						this.aClass1_Sub21_Sub1_3.method2552(local152 + local48 * (float) -local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
						this.aClass1_Sub21_Sub1_3.method2552(1.0F);
						this.aClass1_Sub21_Sub1_3.method2552(0.0F);
						this.aClass1_Sub21_Sub1_3.method2552(local140 + local52 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2552(local146 + local56 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2552(local152 + local60 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
						this.aClass1_Sub21_Sub1_3.method2552(1.0F);
						this.aClass1_Sub21_Sub1_3.method2552(1.0F);
						this.aClass1_Sub21_Sub1_3.method2552(local140 + local40 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2552(local146 + local44 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2552(local152 + local48 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
						this.aClass1_Sub21_Sub1_3.method2552(0.0F);
						this.aClass1_Sub21_Sub1_3.method2552(1.0F);
						this.aClass1_Sub21_Sub1_3.method2552(local140 + local64 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2552(local146 + local68 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method2552(local152 + local72 * (float) local157);
						this.aClass1_Sub21_Sub1_3.method5718(local121);
						this.aClass1_Sub21_Sub1_3.method5718(local126);
						this.aClass1_Sub21_Sub1_3.method5718(local129);
						this.aClass1_Sub21_Sub1_3.method5718(local134);
					}
					if (this.anIntArray546[local83] > 64) {
						local104 = this.anIntArray546[local83] - 64 - 1;
						for (local424 = this.anIntArray545[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass7_Sub2_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt959;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt955 >> Static142.anInt2785;
							local152 = local433.anInt965 >> Static142.anInt2785;
							local472 = local433.anInt963 >> Static142.anInt2785;
							local477 = local433.anInt964 >> Static142.anInt2785;
							this.aClass1_Sub21_Sub1_3.method2552(0.0F);
							this.aClass1_Sub21_Sub1_3.method2552(0.0F);
							this.aClass1_Sub21_Sub1_3.method2552(local146 + local40 * (float) -local477);
							this.aClass1_Sub21_Sub1_3.method2552(local152 + local44 * (float) -local477);
							this.aClass1_Sub21_Sub1_3.method2552(local472 + local48 * (float) -local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
							this.aClass1_Sub21_Sub1_3.method2552(1.0F);
							this.aClass1_Sub21_Sub1_3.method2552(0.0F);
							this.aClass1_Sub21_Sub1_3.method2552(local146 + local52 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2552(local152 + local56 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2552(local472 + local60 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
							this.aClass1_Sub21_Sub1_3.method2552(1.0F);
							this.aClass1_Sub21_Sub1_3.method2552(1.0F);
							this.aClass1_Sub21_Sub1_3.method2552(local146 + local40 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2552(local152 + local44 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2552(local472 + local48 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
							this.aClass1_Sub21_Sub1_3.method2552(0.0F);
							this.aClass1_Sub21_Sub1_3.method2552(1.0F);
							this.aClass1_Sub21_Sub1_3.method2552(local146 + local64 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2552(local152 + local68 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method2552(local472 + local72 * (float) local477);
							this.aClass1_Sub21_Sub1_3.method5718(local126);
							this.aClass1_Sub21_Sub1_3.method5718(local129);
							this.aClass1_Sub21_Sub1_3.method5718(local134);
							this.aClass1_Sub21_Sub1_3.method5718(local454);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub21_Sub1_3.anInt6611 == 0) {
			return;
		}
		this.anInterface9_6.method4198(24, this.aClass1_Sub21_Sub1_3.aByteArray82, this.aClass1_Sub21_Sub1_3.anInt6611);
		arg0.method3611();
		arg0.method3625(0, this.aClass84_15);
		arg0.method3578(this.aClass84_14);
		arg0.method3569(this.aClass84_13);
		arg0.method3572(this.aClass1_Sub21_Sub1_3.anInt6611 / 24);
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(Lclient!nf;)V")
	private void method4902(@OriginalArg(0) Class105_Sub1 arg0) {
		arg0.method3589(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}
}
