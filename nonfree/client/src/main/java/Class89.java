import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class89 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "Lclient!bb;")
	private Class19 aClass19_6;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "Lclient!bb;")
	private Class19 aClass19_7;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!bb;")
	private Class19 aClass19_8;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "Lclient!ip;")
	private Interface6 anInterface6_3;

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "[F")
	private final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Lclient!hn;")
	private final Class4_Sub7_Sub2 aClass4_Sub7_Sub2_1 = new Class4_Sub7_Sub2(786336);

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "[[Lclient!ra;")
	private final Class17_Sub7_Sub1[][] aClass17_Sub7_Sub1ArrayArray1 = new Class17_Sub7_Sub1[1600][64];

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
	private final int[] anIntArray239 = new int[1600];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
	private int anInt2474 = 0;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "[I")
	private final int[] anIntArray240 = new int[64];

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
	private final int[] anIntArray238 = new int[8191];

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "[[Lclient!ra;")
	private final Class17_Sub7_Sub1[][] aClass17_Sub7_Sub1ArrayArray2 = new Class17_Sub7_Sub1[64][768];

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ql;Lclient!hc;)V")
	public void method2082(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) Class88 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass23_Sub1_2 == null) {
			return;
		}
		this.method2085(arg0);
		@Pc(14) float local14 = arg0.aClass23_Sub1_2.aFloat7;
		@Pc(18) float local18 = arg0.aClass23_Sub1_2.aFloat13;
		@Pc(22) float local22 = arg0.aClass23_Sub1_2.aFloat6;
		@Pc(26) float local26 = arg0.aClass23_Sub1_2.aFloat10;
		try {
			@Pc(31) int local31;
			@Pc(48) Class17_Sub7_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean208) {
				local31 = arg1.anInt2457 - arg1.anInt2458;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class17_Sub7 local290 = arg1.aClass114_1.aClass17_Sub7_1;
				@Pc(293) Class17_Sub7 local293 = local290.aClass17_Sub7_8;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt2474 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray239[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray240[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class17_Sub7_Sub1) local293;
						if (local297) {
							local295 = local48.anInt6609;
							local297 = false;
						} else if (local295 != local48.anInt6609) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt6612 >> Static207.anInt4347) + local18 * (float) (local48.anInt6611 >> Static207.anInt4347) + local22 * (float) (local48.anInt6605 >> Static207.anInt4347) + local26) - arg1.anInt2458;
						if (local75 <= 1600) {
							if (this.anIntArray239[local75] < 64) {
								this.aClass17_Sub7_Sub1ArrayArray1[local75][this.anIntArray239[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray239[local75] == 64) {
										if (this.anInt2474 == 64) {
											break label188;
										}
										this.anIntArray239[local75] += this.anInt2474++ + 1;
									}
									this.aClass17_Sub7_Sub1ArrayArray2[this.anIntArray239[local75] - 64 - 1][this.anIntArray240[this.anIntArray239[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass17_Sub7_8;
					}
					arg0.method4548(local295 >= 0 ? arg0.aClass99_1.method2713(local295) : null);
					this.method2086(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class17_Sub7 local39 = arg1.aClass114_1.aClass17_Sub7_1;
				@Pc(42) Class17_Sub7 local42;
				for (local42 = local39.aClass17_Sub7_8; local42 != local39; local42 = local42.aClass17_Sub7_8) {
					local48 = (Class17_Sub7_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt6612 >> Static207.anInt4347) + local18 * (float) (local48.anInt6611 >> Static207.anInt4347) + local22 * (float) (local48.anInt6605 >> Static207.anInt4347) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray238[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass17_Sub7_8;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt2474 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray239[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray240[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class17_Sub7_Sub1 local149 = (Class17_Sub7_Sub1) local42;
						if (local113) {
							local75 = local149.anInt6609;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt6609) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray238[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray239[local173] < 64) {
								this.aClass17_Sub7_Sub1ArrayArray1[local173][this.anIntArray239[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray239[local173] == 64) {
										if (this.anInt2474 == 64) {
											break label186;
										}
										this.anIntArray239[local173] += this.anInt2474++ + 1;
									}
									this.aClass17_Sub7_Sub1ArrayArray2[this.anIntArray239[local173] - 64 - 1][this.anIntArray240[this.anIntArray239[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass17_Sub7_8;
					}
					arg0.method4548(local75 >= 0 ? arg0.aClass99_1.method2713(local75) : null);
					this.method2086(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method2083(arg0);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ql;)V")
	private void method2083(@OriginalArg(0) Class92_Sub2 arg0) {
		arg0.method4593(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Lclient!ql;)V")
	public void method2084(@OriginalArg(0) Class92_Sub2 arg0) {
		this.anInterface6_3 = arg0.method4550(24, null, 196584, true);
		this.aClass19_8 = new Class19(arg0, this.anInterface6_3, 5126, 2, 0);
		this.aClass19_7 = new Class19(arg0, this.anInterface6_3, 5126, 3, 8);
		this.aClass19_6 = new Class19(arg0, this.anInterface6_3, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(Lclient!ql;)V")
	private void method2085(@OriginalArg(0) Class92_Sub2 arg0) {
		arg0.method4551();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method4593(false);
		arg0.method4604();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!ql;I)V")
	private void method2086(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray6, 0);
		@Pc(11) float local11 = this.aFloatArray6[0];
		@Pc(16) float local16 = this.aFloatArray6[4];
		@Pc(21) float local21 = this.aFloatArray6[8];
		@Pc(26) float local26 = this.aFloatArray6[1];
		@Pc(31) float local31 = this.aFloatArray6[5];
		@Pc(36) float local36 = this.aFloatArray6[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass4_Sub7_Sub2_1.anInt2667 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class17_Sub7_Sub1 local113;
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
		@Pc(433) Class17_Sub7_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean459) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray239[local83] > 64 ? 64 : this.anIntArray239[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass17_Sub7_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt6614;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6612 >> Static207.anInt4347;
						local146 = local113.anInt6611 >> Static207.anInt4347;
						local152 = local113.anInt6605 >> Static207.anInt4347;
						local157 = local113.anInt6607 >> Static207.anInt4347;
						this.aClass4_Sub7_Sub2_1.method2423(0.0F);
						this.aClass4_Sub7_Sub2_1.method2423(0.0F);
						this.aClass4_Sub7_Sub2_1.method2423(local140 + local40 * (float) -local157);
						this.aClass4_Sub7_Sub2_1.method2423(local146 + local44 * (float) -local157);
						this.aClass4_Sub7_Sub2_1.method2423(local152 + local48 * (float) -local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
						this.aClass4_Sub7_Sub2_1.method2423(1.0F);
						this.aClass4_Sub7_Sub2_1.method2423(0.0F);
						this.aClass4_Sub7_Sub2_1.method2423(local140 + local52 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2423(local146 + local56 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2423(local152 + local60 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
						this.aClass4_Sub7_Sub2_1.method2423(1.0F);
						this.aClass4_Sub7_Sub2_1.method2423(1.0F);
						this.aClass4_Sub7_Sub2_1.method2423(local140 + local40 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2423(local146 + local44 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2423(local152 + local48 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
						this.aClass4_Sub7_Sub2_1.method2423(0.0F);
						this.aClass4_Sub7_Sub2_1.method2423(1.0F);
						this.aClass4_Sub7_Sub2_1.method2423(local140 + local64 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2423(local146 + local68 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2423(local152 + local72 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
					}
					if (this.anIntArray239[local83] > 64) {
						local104 = this.anIntArray239[local83] - 64 - 1;
						for (local424 = this.anIntArray240[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass17_Sub7_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt6614;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6612 >> Static207.anInt4347;
							local152 = local433.anInt6611 >> Static207.anInt4347;
							local472 = local433.anInt6605 >> Static207.anInt4347;
							local477 = local433.anInt6607 >> Static207.anInt4347;
							this.aClass4_Sub7_Sub2_1.method2423(0.0F);
							this.aClass4_Sub7_Sub2_1.method2423(0.0F);
							this.aClass4_Sub7_Sub2_1.method2423(local146 + local40 * (float) -local477);
							this.aClass4_Sub7_Sub2_1.method2423(local152 + local44 * (float) -local477);
							this.aClass4_Sub7_Sub2_1.method2423(local472 + local48 * (float) -local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
							this.aClass4_Sub7_Sub2_1.method2423(1.0F);
							this.aClass4_Sub7_Sub2_1.method2423(0.0F);
							this.aClass4_Sub7_Sub2_1.method2423(local146 + local52 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2423(local152 + local56 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2423(local472 + local60 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
							this.aClass4_Sub7_Sub2_1.method2423(1.0F);
							this.aClass4_Sub7_Sub2_1.method2423(1.0F);
							this.aClass4_Sub7_Sub2_1.method2423(local146 + local40 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2423(local152 + local44 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2423(local472 + local48 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
							this.aClass4_Sub7_Sub2_1.method2423(0.0F);
							this.aClass4_Sub7_Sub2_1.method2423(1.0F);
							this.aClass4_Sub7_Sub2_1.method2423(local146 + local64 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2423(local152 + local68 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2423(local472 + local72 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray239[local83] > 64 ? 64 : this.anIntArray239[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass17_Sub7_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt6614;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6612 >> Static207.anInt4347;
						local146 = local113.anInt6611 >> Static207.anInt4347;
						local152 = local113.anInt6605 >> Static207.anInt4347;
						local157 = local113.anInt6607 >> Static207.anInt4347;
						this.aClass4_Sub7_Sub2_1.method2422(0.0F);
						this.aClass4_Sub7_Sub2_1.method2422(0.0F);
						this.aClass4_Sub7_Sub2_1.method2422(local140 + local40 * (float) -local157);
						this.aClass4_Sub7_Sub2_1.method2422(local146 + local44 * (float) -local157);
						this.aClass4_Sub7_Sub2_1.method2422(local152 + local48 * (float) -local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
						this.aClass4_Sub7_Sub2_1.method2422(1.0F);
						this.aClass4_Sub7_Sub2_1.method2422(0.0F);
						this.aClass4_Sub7_Sub2_1.method2422(local140 + local52 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2422(local146 + local56 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2422(local152 + local60 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
						this.aClass4_Sub7_Sub2_1.method2422(1.0F);
						this.aClass4_Sub7_Sub2_1.method2422(1.0F);
						this.aClass4_Sub7_Sub2_1.method2422(local140 + local40 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2422(local146 + local44 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2422(local152 + local48 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
						this.aClass4_Sub7_Sub2_1.method2422(0.0F);
						this.aClass4_Sub7_Sub2_1.method2422(1.0F);
						this.aClass4_Sub7_Sub2_1.method2422(local140 + local64 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2422(local146 + local68 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2422(local152 + local72 * (float) local157);
						this.aClass4_Sub7_Sub2_1.method2416(local121);
						this.aClass4_Sub7_Sub2_1.method2416(local126);
						this.aClass4_Sub7_Sub2_1.method2416(local129);
						this.aClass4_Sub7_Sub2_1.method2416(local134);
					}
					if (this.anIntArray239[local83] > 64) {
						local104 = this.anIntArray239[local83] - 64 - 1;
						for (local424 = this.anIntArray240[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass17_Sub7_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt6614;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6612 >> Static207.anInt4347;
							local152 = local433.anInt6611 >> Static207.anInt4347;
							local472 = local433.anInt6605 >> Static207.anInt4347;
							local477 = local433.anInt6607 >> Static207.anInt4347;
							this.aClass4_Sub7_Sub2_1.method2422(0.0F);
							this.aClass4_Sub7_Sub2_1.method2422(0.0F);
							this.aClass4_Sub7_Sub2_1.method2422(local146 + local40 * (float) -local477);
							this.aClass4_Sub7_Sub2_1.method2422(local152 + local44 * (float) -local477);
							this.aClass4_Sub7_Sub2_1.method2422(local472 + local48 * (float) -local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
							this.aClass4_Sub7_Sub2_1.method2422(1.0F);
							this.aClass4_Sub7_Sub2_1.method2422(0.0F);
							this.aClass4_Sub7_Sub2_1.method2422(local146 + local52 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2422(local152 + local56 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2422(local472 + local60 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
							this.aClass4_Sub7_Sub2_1.method2422(1.0F);
							this.aClass4_Sub7_Sub2_1.method2422(1.0F);
							this.aClass4_Sub7_Sub2_1.method2422(local146 + local40 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2422(local152 + local44 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2422(local472 + local48 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
							this.aClass4_Sub7_Sub2_1.method2422(0.0F);
							this.aClass4_Sub7_Sub2_1.method2422(1.0F);
							this.aClass4_Sub7_Sub2_1.method2422(local146 + local64 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2422(local152 + local68 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2422(local472 + local72 * (float) local477);
							this.aClass4_Sub7_Sub2_1.method2416(local126);
							this.aClass4_Sub7_Sub2_1.method2416(local129);
							this.aClass4_Sub7_Sub2_1.method2416(local134);
							this.aClass4_Sub7_Sub2_1.method2416(local454);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub7_Sub2_1.anInt2667 == 0) {
			return;
		}
		this.anInterface6_3.method4304(24, this.aClass4_Sub7_Sub2_1.aByteArray42, this.aClass4_Sub7_Sub2_1.anInt2667);
		arg0.method4618(0, this.aClass19_8);
		arg0.method4553(this.aClass19_7);
		arg0.method4595(this.aClass19_6);
		arg0.method4601();
		arg0.method4561(this.aClass4_Sub7_Sub2_1.anInt2667 / 24);
	}
}
