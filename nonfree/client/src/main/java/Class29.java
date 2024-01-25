import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class29 {

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Lclient!hk;")
	private Interface3 anInterface3_2;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!rs;")
	private Class181 aClass181_6;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Lclient!rs;")
	private Class181 aClass181_7;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "Lclient!rs;")
	private Class181 aClass181_8;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[F")
	private final float[] aFloatArray3 = new float[16];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!fb;")
	private final Class7_Sub3_Sub1 aClass7_Sub3_Sub1_1 = new Class7_Sub3_Sub1(786336);

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[I")
	private final int[] anIntArray88 = new int[64];

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	private int anInt623 = 0;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[[Lclient!eb;")
	private final Class36_Sub2_Sub1[][] aClass36_Sub2_Sub1ArrayArray1 = new Class36_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "[I")
	private final int[] anIntArray90 = new int[8191];

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "[I")
	private final int[] anIntArray89 = new int[1600];

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "[[Lclient!eb;")
	private final Class36_Sub2_Sub1[][] aClass36_Sub2_Sub1ArrayArray2 = new Class36_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!hd;I)V")
	private void method482(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray3, 0);
		@Pc(11) float local11 = this.aFloatArray3[0];
		@Pc(16) float local16 = this.aFloatArray3[4];
		@Pc(21) float local21 = this.aFloatArray3[8];
		@Pc(26) float local26 = this.aFloatArray3[1];
		@Pc(31) float local31 = this.aFloatArray3[5];
		@Pc(36) float local36 = this.aFloatArray3[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass7_Sub3_Sub1_1.anInt3005 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class36_Sub2_Sub1 local113;
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
		@Pc(433) Class36_Sub2_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean195) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray89[local83] > 64 ? 64 : this.anIntArray89[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass36_Sub2_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt6318;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6315 >> Static182.anInt3705;
						local146 = local113.anInt6312 >> Static182.anInt3705;
						local152 = local113.anInt6310 >> Static182.anInt3705;
						local157 = local113.anInt6316 >> Static182.anInt3705;
						this.aClass7_Sub3_Sub1_1.method1702(0.0F);
						this.aClass7_Sub3_Sub1_1.method1702(0.0F);
						this.aClass7_Sub3_Sub1_1.method1702(local140 + local40 * (float) -local157);
						this.aClass7_Sub3_Sub1_1.method1702(local146 + local44 * (float) -local157);
						this.aClass7_Sub3_Sub1_1.method1702(local152 + local48 * (float) -local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
						this.aClass7_Sub3_Sub1_1.method1702(1.0F);
						this.aClass7_Sub3_Sub1_1.method1702(0.0F);
						this.aClass7_Sub3_Sub1_1.method1702(local140 + local52 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1702(local146 + local56 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1702(local152 + local60 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
						this.aClass7_Sub3_Sub1_1.method1702(1.0F);
						this.aClass7_Sub3_Sub1_1.method1702(1.0F);
						this.aClass7_Sub3_Sub1_1.method1702(local140 + local40 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1702(local146 + local44 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1702(local152 + local48 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
						this.aClass7_Sub3_Sub1_1.method1702(0.0F);
						this.aClass7_Sub3_Sub1_1.method1702(1.0F);
						this.aClass7_Sub3_Sub1_1.method1702(local140 + local64 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1702(local146 + local68 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1702(local152 + local72 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
					}
					if (this.anIntArray89[local83] > 64) {
						local104 = this.anIntArray89[local83] - 64 - 1;
						for (local424 = this.anIntArray88[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass36_Sub2_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt6318;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6315 >> Static182.anInt3705;
							local152 = local433.anInt6312 >> Static182.anInt3705;
							local472 = local433.anInt6310 >> Static182.anInt3705;
							local477 = local433.anInt6316 >> Static182.anInt3705;
							this.aClass7_Sub3_Sub1_1.method1702(0.0F);
							this.aClass7_Sub3_Sub1_1.method1702(0.0F);
							this.aClass7_Sub3_Sub1_1.method1702(local146 + local40 * (float) -local477);
							this.aClass7_Sub3_Sub1_1.method1702(local152 + local44 * (float) -local477);
							this.aClass7_Sub3_Sub1_1.method1702(local472 + local48 * (float) -local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
							this.aClass7_Sub3_Sub1_1.method1702(1.0F);
							this.aClass7_Sub3_Sub1_1.method1702(0.0F);
							this.aClass7_Sub3_Sub1_1.method1702(local146 + local52 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1702(local152 + local56 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1702(local472 + local60 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
							this.aClass7_Sub3_Sub1_1.method1702(1.0F);
							this.aClass7_Sub3_Sub1_1.method1702(1.0F);
							this.aClass7_Sub3_Sub1_1.method1702(local146 + local40 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1702(local152 + local44 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1702(local472 + local48 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
							this.aClass7_Sub3_Sub1_1.method1702(0.0F);
							this.aClass7_Sub3_Sub1_1.method1702(1.0F);
							this.aClass7_Sub3_Sub1_1.method1702(local146 + local64 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1702(local152 + local68 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1702(local472 + local72 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray89[local83] > 64 ? 64 : this.anIntArray89[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass36_Sub2_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt6318;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6315 >> Static182.anInt3705;
						local146 = local113.anInt6312 >> Static182.anInt3705;
						local152 = local113.anInt6310 >> Static182.anInt3705;
						local157 = local113.anInt6316 >> Static182.anInt3705;
						this.aClass7_Sub3_Sub1_1.method1703(0.0F);
						this.aClass7_Sub3_Sub1_1.method1703(0.0F);
						this.aClass7_Sub3_Sub1_1.method1703(local140 + local40 * (float) -local157);
						this.aClass7_Sub3_Sub1_1.method1703(local146 + local44 * (float) -local157);
						this.aClass7_Sub3_Sub1_1.method1703(local152 + local48 * (float) -local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
						this.aClass7_Sub3_Sub1_1.method1703(1.0F);
						this.aClass7_Sub3_Sub1_1.method1703(0.0F);
						this.aClass7_Sub3_Sub1_1.method1703(local140 + local52 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1703(local146 + local56 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1703(local152 + local60 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
						this.aClass7_Sub3_Sub1_1.method1703(1.0F);
						this.aClass7_Sub3_Sub1_1.method1703(1.0F);
						this.aClass7_Sub3_Sub1_1.method1703(local140 + local40 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1703(local146 + local44 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1703(local152 + local48 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
						this.aClass7_Sub3_Sub1_1.method1703(0.0F);
						this.aClass7_Sub3_Sub1_1.method1703(1.0F);
						this.aClass7_Sub3_Sub1_1.method1703(local140 + local64 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1703(local146 + local68 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method1703(local152 + local72 * (float) local157);
						this.aClass7_Sub3_Sub1_1.method2735(local121);
						this.aClass7_Sub3_Sub1_1.method2735(local126);
						this.aClass7_Sub3_Sub1_1.method2735(local129);
						this.aClass7_Sub3_Sub1_1.method2735(local134);
					}
					if (this.anIntArray89[local83] > 64) {
						local104 = this.anIntArray89[local83] - 64 - 1;
						for (local424 = this.anIntArray88[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass36_Sub2_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt6318;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6315 >> Static182.anInt3705;
							local152 = local433.anInt6312 >> Static182.anInt3705;
							local472 = local433.anInt6310 >> Static182.anInt3705;
							local477 = local433.anInt6316 >> Static182.anInt3705;
							this.aClass7_Sub3_Sub1_1.method1703(0.0F);
							this.aClass7_Sub3_Sub1_1.method1703(0.0F);
							this.aClass7_Sub3_Sub1_1.method1703(local146 + local40 * (float) -local477);
							this.aClass7_Sub3_Sub1_1.method1703(local152 + local44 * (float) -local477);
							this.aClass7_Sub3_Sub1_1.method1703(local472 + local48 * (float) -local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
							this.aClass7_Sub3_Sub1_1.method1703(1.0F);
							this.aClass7_Sub3_Sub1_1.method1703(0.0F);
							this.aClass7_Sub3_Sub1_1.method1703(local146 + local52 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1703(local152 + local56 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1703(local472 + local60 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
							this.aClass7_Sub3_Sub1_1.method1703(1.0F);
							this.aClass7_Sub3_Sub1_1.method1703(1.0F);
							this.aClass7_Sub3_Sub1_1.method1703(local146 + local40 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1703(local152 + local44 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1703(local472 + local48 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
							this.aClass7_Sub3_Sub1_1.method1703(0.0F);
							this.aClass7_Sub3_Sub1_1.method1703(1.0F);
							this.aClass7_Sub3_Sub1_1.method1703(local146 + local64 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1703(local152 + local68 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method1703(local472 + local72 * (float) local477);
							this.aClass7_Sub3_Sub1_1.method2735(local126);
							this.aClass7_Sub3_Sub1_1.method2735(local129);
							this.aClass7_Sub3_Sub1_1.method2735(local134);
							this.aClass7_Sub3_Sub1_1.method2735(local454);
						}
					}
				}
			}
		}
		if (this.aClass7_Sub3_Sub1_1.anInt3005 == 0) {
			return;
		}
		this.anInterface3_2.method4547(24, this.aClass7_Sub3_Sub1_1.aByteArray33, this.aClass7_Sub3_Sub1_1.anInt3005);
		arg0.method2426(0, this.aClass181_8);
		arg0.method2427(this.aClass181_7);
		arg0.method2467(this.aClass181_6);
		arg0.method2435();
		arg0.method2396(this.aClass7_Sub3_Sub1_1.anInt3005 / 24);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!hd;)V")
	public void method483(@OriginalArg(0) Class89_Sub1 arg0) {
		this.anInterface3_2 = arg0.method2430(24, null, 196584, true);
		this.aClass181_8 = new Class181(arg0, this.anInterface3_2, 5126, 2, 0);
		this.aClass181_7 = new Class181(arg0, this.anInterface3_2, 5126, 3, 8);
		this.aClass181_6 = new Class181(arg0, this.anInterface3_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Lclient!hd;)V")
	private void method484(@OriginalArg(0) Class89_Sub1 arg0) {
		arg0.method2420();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method2424(false);
		arg0.method2438();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(Lclient!hd;)V")
	private void method485(@OriginalArg(0) Class89_Sub1 arg0) {
		arg0.method2424(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!hd;Lclient!bg;)V")
	public void method486(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) Class24 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass70_Sub2_2 == null) {
			return;
		}
		this.method484(arg0);
		@Pc(14) float local14 = arg0.aClass70_Sub2_2.aFloat65;
		@Pc(18) float local18 = arg0.aClass70_Sub2_2.aFloat64;
		@Pc(22) float local22 = arg0.aClass70_Sub2_2.aFloat67;
		@Pc(26) float local26 = arg0.aClass70_Sub2_2.aFloat62;
		try {
			@Pc(31) int local31;
			@Pc(48) Class36_Sub2_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean26) {
				local31 = arg1.anInt477 - arg1.anInt479;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class36_Sub2 local290 = arg1.aClass127_1.aClass36_Sub2_5;
				@Pc(293) Class36_Sub2 local293 = local290.aClass36_Sub2_8;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt623 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray89[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray88[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class36_Sub2_Sub1) local293;
						if (local297) {
							local295 = local48.anInt6313;
							local297 = false;
						} else if (local295 != local48.anInt6313) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt6315 >> Static182.anInt3705) + local18 * (float) (local48.anInt6312 >> Static182.anInt3705) + local22 * (float) (local48.anInt6310 >> Static182.anInt3705) + local26) - arg1.anInt479;
						if (local75 <= 1600) {
							if (this.anIntArray89[local75] < 64) {
								this.aClass36_Sub2_Sub1ArrayArray1[local75][this.anIntArray89[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray89[local75] == 64) {
										if (this.anInt623 == 64) {
											break label188;
										}
										this.anIntArray89[local75] += this.anInt623++ + 1;
									}
									this.aClass36_Sub2_Sub1ArrayArray2[this.anIntArray89[local75] - 64 - 1][this.anIntArray88[this.anIntArray89[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass36_Sub2_8;
					}
					arg0.method2445(local295 >= 0 ? arg0.aClass144_1.method3848(local295) : null);
					this.method482(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class36_Sub2 local39 = arg1.aClass127_1.aClass36_Sub2_5;
				@Pc(42) Class36_Sub2 local42;
				for (local42 = local39.aClass36_Sub2_8; local42 != local39; local42 = local42.aClass36_Sub2_8) {
					local48 = (Class36_Sub2_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt6315 >> Static182.anInt3705) + local18 * (float) (local48.anInt6312 >> Static182.anInt3705) + local22 * (float) (local48.anInt6310 >> Static182.anInt3705) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray90[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass36_Sub2_8;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt623 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray89[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray88[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class36_Sub2_Sub1 local149 = (Class36_Sub2_Sub1) local42;
						if (local113) {
							local75 = local149.anInt6313;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt6313) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray90[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray89[local173] < 64) {
								this.aClass36_Sub2_Sub1ArrayArray1[local173][this.anIntArray89[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray89[local173] == 64) {
										if (this.anInt623 == 64) {
											break label186;
										}
										this.anIntArray89[local173] += this.anInt623++ + 1;
									}
									this.aClass36_Sub2_Sub1ArrayArray2[this.anIntArray89[local173] - 64 - 1][this.anIntArray88[this.anIntArray89[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass36_Sub2_8;
					}
					arg0.method2445(local75 >= 0 ? arg0.aClass144_1.method3848(local75) : null);
					this.method482(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method485(arg0);
	}
}
