import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class74 {

	@OriginalMember(owner = "client!go", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!go", name = "e", descriptor = "Lclient!pe;")
	private Class156 aClass156_2;

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!ti;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Lclient!pe;")
	private Class156 aClass156_3;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "Lclient!pe;")
	private Class156 aClass156_4;

	@OriginalMember(owner = "client!go", name = "c", descriptor = "[F")
	private final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!fe;")
	private final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_1 = new Class5_Sub1_Sub2(786336);

	@OriginalMember(owner = "client!go", name = "d", descriptor = "I")
	private int anInt2310 = 0;

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[[Lclient!fa;")
	private final Class63_Sub1_Sub1[][] aClass63_Sub1_Sub1ArrayArray1 = new Class63_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!go", name = "l", descriptor = "[I")
	private final int[] anIntArray138 = new int[1600];

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[I")
	private final int[] anIntArray137 = new int[8191];

	@OriginalMember(owner = "client!go", name = "i", descriptor = "[[Lclient!fa;")
	private final Class63_Sub1_Sub1[][] aClass63_Sub1_Sub1ArrayArray2 = new Class63_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!go", name = "h", descriptor = "[I")
	private final int[] anIntArray136 = new int[64];

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!po;)V")
	private void method2152(@OriginalArg(0) Class59_Sub1 arg0) {
		arg0.method4274(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!po;I)V")
	private void method2153(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray5, 0);
		@Pc(11) float local11 = this.aFloatArray5[0];
		@Pc(16) float local16 = this.aFloatArray5[4];
		@Pc(21) float local21 = this.aFloatArray5[8];
		@Pc(26) float local26 = this.aFloatArray5[1];
		@Pc(31) float local31 = this.aFloatArray5[5];
		@Pc(36) float local36 = this.aFloatArray5[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass5_Sub1_Sub2_1.anInt2029 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class63_Sub1_Sub1 local113;
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
		@Pc(433) Class63_Sub1_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean350) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray138[local83] > 64 ? 64 : this.anIntArray138[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass63_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt4817;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt4812 >> Static67.anInt1689;
						local146 = local113.anInt4814 >> Static67.anInt1689;
						local152 = local113.anInt4810 >> Static67.anInt1689;
						local157 = local113.anInt4816 >> Static67.anInt1689;
						this.aClass5_Sub1_Sub2_1.method1887(0.0F);
						this.aClass5_Sub1_Sub2_1.method1887(0.0F);
						this.aClass5_Sub1_Sub2_1.method1887(local140 + local40 * (float) -local157);
						this.aClass5_Sub1_Sub2_1.method1887(local146 + local44 * (float) -local157);
						this.aClass5_Sub1_Sub2_1.method1887(local152 + local48 * (float) -local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
						this.aClass5_Sub1_Sub2_1.method1887(1.0F);
						this.aClass5_Sub1_Sub2_1.method1887(0.0F);
						this.aClass5_Sub1_Sub2_1.method1887(local140 + local52 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1887(local146 + local56 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1887(local152 + local60 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
						this.aClass5_Sub1_Sub2_1.method1887(1.0F);
						this.aClass5_Sub1_Sub2_1.method1887(1.0F);
						this.aClass5_Sub1_Sub2_1.method1887(local140 + local40 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1887(local146 + local44 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1887(local152 + local48 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
						this.aClass5_Sub1_Sub2_1.method1887(0.0F);
						this.aClass5_Sub1_Sub2_1.method1887(1.0F);
						this.aClass5_Sub1_Sub2_1.method1887(local140 + local64 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1887(local146 + local68 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1887(local152 + local72 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
					}
					if (this.anIntArray138[local83] > 64) {
						local104 = this.anIntArray138[local83] - 64 - 1;
						for (local424 = this.anIntArray136[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass63_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt4817;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt4812 >> Static67.anInt1689;
							local152 = local433.anInt4814 >> Static67.anInt1689;
							local472 = local433.anInt4810 >> Static67.anInt1689;
							local477 = local433.anInt4816 >> Static67.anInt1689;
							this.aClass5_Sub1_Sub2_1.method1887(0.0F);
							this.aClass5_Sub1_Sub2_1.method1887(0.0F);
							this.aClass5_Sub1_Sub2_1.method1887(local146 + local40 * (float) -local477);
							this.aClass5_Sub1_Sub2_1.method1887(local152 + local44 * (float) -local477);
							this.aClass5_Sub1_Sub2_1.method1887(local472 + local48 * (float) -local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
							this.aClass5_Sub1_Sub2_1.method1887(1.0F);
							this.aClass5_Sub1_Sub2_1.method1887(0.0F);
							this.aClass5_Sub1_Sub2_1.method1887(local146 + local52 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1887(local152 + local56 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1887(local472 + local60 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
							this.aClass5_Sub1_Sub2_1.method1887(1.0F);
							this.aClass5_Sub1_Sub2_1.method1887(1.0F);
							this.aClass5_Sub1_Sub2_1.method1887(local146 + local40 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1887(local152 + local44 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1887(local472 + local48 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
							this.aClass5_Sub1_Sub2_1.method1887(0.0F);
							this.aClass5_Sub1_Sub2_1.method1887(1.0F);
							this.aClass5_Sub1_Sub2_1.method1887(local146 + local64 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1887(local152 + local68 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1887(local472 + local72 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray138[local83] > 64 ? 64 : this.anIntArray138[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass63_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt4817;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt4812 >> Static67.anInt1689;
						local146 = local113.anInt4814 >> Static67.anInt1689;
						local152 = local113.anInt4810 >> Static67.anInt1689;
						local157 = local113.anInt4816 >> Static67.anInt1689;
						this.aClass5_Sub1_Sub2_1.method1888(0.0F);
						this.aClass5_Sub1_Sub2_1.method1888(0.0F);
						this.aClass5_Sub1_Sub2_1.method1888(local140 + local40 * (float) -local157);
						this.aClass5_Sub1_Sub2_1.method1888(local146 + local44 * (float) -local157);
						this.aClass5_Sub1_Sub2_1.method1888(local152 + local48 * (float) -local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
						this.aClass5_Sub1_Sub2_1.method1888(1.0F);
						this.aClass5_Sub1_Sub2_1.method1888(0.0F);
						this.aClass5_Sub1_Sub2_1.method1888(local140 + local52 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1888(local146 + local56 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1888(local152 + local60 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
						this.aClass5_Sub1_Sub2_1.method1888(1.0F);
						this.aClass5_Sub1_Sub2_1.method1888(1.0F);
						this.aClass5_Sub1_Sub2_1.method1888(local140 + local40 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1888(local146 + local44 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1888(local152 + local48 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
						this.aClass5_Sub1_Sub2_1.method1888(0.0F);
						this.aClass5_Sub1_Sub2_1.method1888(1.0F);
						this.aClass5_Sub1_Sub2_1.method1888(local140 + local64 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1888(local146 + local68 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1888(local152 + local72 * (float) local157);
						this.aClass5_Sub1_Sub2_1.method1886(local121);
						this.aClass5_Sub1_Sub2_1.method1886(local126);
						this.aClass5_Sub1_Sub2_1.method1886(local129);
						this.aClass5_Sub1_Sub2_1.method1886(local134);
					}
					if (this.anIntArray138[local83] > 64) {
						local104 = this.anIntArray138[local83] - 64 - 1;
						for (local424 = this.anIntArray136[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass63_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt4817;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt4812 >> Static67.anInt1689;
							local152 = local433.anInt4814 >> Static67.anInt1689;
							local472 = local433.anInt4810 >> Static67.anInt1689;
							local477 = local433.anInt4816 >> Static67.anInt1689;
							this.aClass5_Sub1_Sub2_1.method1888(0.0F);
							this.aClass5_Sub1_Sub2_1.method1888(0.0F);
							this.aClass5_Sub1_Sub2_1.method1888(local146 + local40 * (float) -local477);
							this.aClass5_Sub1_Sub2_1.method1888(local152 + local44 * (float) -local477);
							this.aClass5_Sub1_Sub2_1.method1888(local472 + local48 * (float) -local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
							this.aClass5_Sub1_Sub2_1.method1888(1.0F);
							this.aClass5_Sub1_Sub2_1.method1888(0.0F);
							this.aClass5_Sub1_Sub2_1.method1888(local146 + local52 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1888(local152 + local56 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1888(local472 + local60 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
							this.aClass5_Sub1_Sub2_1.method1888(1.0F);
							this.aClass5_Sub1_Sub2_1.method1888(1.0F);
							this.aClass5_Sub1_Sub2_1.method1888(local146 + local40 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1888(local152 + local44 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1888(local472 + local48 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
							this.aClass5_Sub1_Sub2_1.method1888(0.0F);
							this.aClass5_Sub1_Sub2_1.method1888(1.0F);
							this.aClass5_Sub1_Sub2_1.method1888(local146 + local64 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1888(local152 + local68 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1888(local472 + local72 * (float) local477);
							this.aClass5_Sub1_Sub2_1.method1886(local126);
							this.aClass5_Sub1_Sub2_1.method1886(local129);
							this.aClass5_Sub1_Sub2_1.method1886(local134);
							this.aClass5_Sub1_Sub2_1.method1886(local454);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub1_Sub2_1.anInt2029 == 0) {
			return;
		}
		this.anInterface9_1.method5701(24, this.aClass5_Sub1_Sub2_1.aByteArray18, this.aClass5_Sub1_Sub2_1.anInt2029);
		arg0.method4275(0, this.aClass156_3);
		arg0.method4288(this.aClass156_2);
		arg0.method4322(this.aClass156_4);
		arg0.method4325();
		arg0.method4338(this.aClass5_Sub1_Sub2_1.anInt2029 / 24);
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Lclient!po;)V")
	private void method2154(@OriginalArg(0) Class59_Sub1 arg0) {
		arg0.method4285();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method4274(false);
		arg0.method4320();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(Lclient!po;)V")
	public void method2155(@OriginalArg(0) Class59_Sub1 arg0) {
		this.anInterface9_1 = arg0.method4317(24, null, 196584, true);
		this.aClass156_3 = new Class156(arg0, this.anInterface9_1, 5126, 2, 0);
		this.aClass156_2 = new Class156(arg0, this.anInterface9_1, 5126, 3, 8);
		this.aClass156_4 = new Class156(arg0, this.anInterface9_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!po;Lclient!bg;)V")
	public void method2156(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) Class21 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass112_Sub2_1 == null) {
			return;
		}
		this.method2154(arg0);
		@Pc(14) float local14 = arg0.aClass112_Sub2_1.aFloat57;
		@Pc(18) float local18 = arg0.aClass112_Sub2_1.aFloat55;
		@Pc(22) float local22 = arg0.aClass112_Sub2_1.aFloat54;
		@Pc(26) float local26 = arg0.aClass112_Sub2_1.aFloat62;
		try {
			@Pc(31) int local31;
			@Pc(48) Class63_Sub1_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean41) {
				local31 = arg1.anInt554 - arg1.anInt553;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class63_Sub1 local290 = arg1.aClass166_1.aClass63_Sub1_7;
				@Pc(293) Class63_Sub1 local293 = local290.aClass63_Sub1_6;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt2310 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray138[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray136[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class63_Sub1_Sub1) local293;
						if (local297) {
							local295 = local48.anInt4811;
							local297 = false;
						} else if (local295 != local48.anInt4811) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt4812 >> Static67.anInt1689) + local18 * (float) (local48.anInt4814 >> Static67.anInt1689) + local22 * (float) (local48.anInt4810 >> Static67.anInt1689) + local26) - arg1.anInt553;
						if (local75 <= 1600) {
							if (this.anIntArray138[local75] < 64) {
								this.aClass63_Sub1_Sub1ArrayArray1[local75][this.anIntArray138[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray138[local75] == 64) {
										if (this.anInt2310 == 64) {
											break label188;
										}
										this.anIntArray138[local75] += this.anInt2310++ + 1;
									}
									this.aClass63_Sub1_Sub1ArrayArray2[this.anIntArray138[local75] - 64 - 1][this.anIntArray136[this.anIntArray138[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass63_Sub1_6;
					}
					arg0.method4296(local295 >= 0 ? arg0.aClass204_1.method5431(local295) : null);
					this.method2153(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class63_Sub1 local39 = arg1.aClass166_1.aClass63_Sub1_7;
				@Pc(42) Class63_Sub1 local42;
				for (local42 = local39.aClass63_Sub1_6; local42 != local39; local42 = local42.aClass63_Sub1_6) {
					local48 = (Class63_Sub1_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt4812 >> Static67.anInt1689) + local18 * (float) (local48.anInt4814 >> Static67.anInt1689) + local22 * (float) (local48.anInt4810 >> Static67.anInt1689) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray137[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass63_Sub1_6;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt2310 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray138[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray136[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class63_Sub1_Sub1 local149 = (Class63_Sub1_Sub1) local42;
						if (local113) {
							local75 = local149.anInt4811;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt4811) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray137[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray138[local173] < 64) {
								this.aClass63_Sub1_Sub1ArrayArray1[local173][this.anIntArray138[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray138[local173] == 64) {
										if (this.anInt2310 == 64) {
											break label186;
										}
										this.anIntArray138[local173] += this.anInt2310++ + 1;
									}
									this.aClass63_Sub1_Sub1ArrayArray2[this.anIntArray138[local173] - 64 - 1][this.anIntArray136[this.anIntArray138[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass63_Sub1_6;
					}
					arg0.method4296(local75 >= 0 ? arg0.aClass204_1.method5431(local75) : null);
					this.method2153(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method2152(arg0);
	}
}
