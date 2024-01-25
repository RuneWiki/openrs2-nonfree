import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class191 {

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!qd;")
	private Class168 aClass168_11;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "Lclient!qd;")
	private Class168 aClass168_12;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!qd;")
	private Class168 aClass168_13;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!eb;")
	private Interface3 anInterface3_6;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[F")
	private final float[] aFloatArray28 = new float[16];

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!bh;")
	private final Class14_Sub4_Sub1 aClass14_Sub4_Sub1_3 = new Class14_Sub4_Sub1(786336);

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "[I")
	private final int[] anIntArray521 = new int[1600];

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "[I")
	private final int[] anIntArray522 = new int[64];

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "[[Lclient!aa;")
	private final Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray2 = new Class1_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[[Lclient!aa;")
	private final Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray1 = new Class1_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
	private final int[] anIntArray523 = new int[8191];

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	private int anInt5780 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sq;I)V")
	private void method5271(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(2982, this.aFloatArray28, 0);
		@Pc(11) float local11 = this.aFloatArray28[0];
		@Pc(16) float local16 = this.aFloatArray28[4];
		@Pc(21) float local21 = this.aFloatArray28[8];
		@Pc(26) float local26 = this.aFloatArray28[1];
		@Pc(31) float local31 = this.aFloatArray28[5];
		@Pc(36) float local36 = this.aFloatArray28[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass14_Sub4_Sub1_3.anInt2637 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class1_Sub1_Sub1 local113;
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
		@Pc(433) Class1_Sub1_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean397) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray521[local83] > 64 ? 64 : this.anIntArray521[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass1_Sub1_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt6412;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6421 >> Static190.anInt3903;
						local146 = local113.anInt6418 >> Static190.anInt3903;
						local152 = local113.anInt6410 >> Static190.anInt3903;
						local157 = local113.anInt6420 >> Static190.anInt3903;
						this.aClass14_Sub4_Sub1_3.method646(0.0F);
						this.aClass14_Sub4_Sub1_3.method646(0.0F);
						this.aClass14_Sub4_Sub1_3.method646(local140 + local40 * (float) -local157);
						this.aClass14_Sub4_Sub1_3.method646(local146 + local44 * (float) -local157);
						this.aClass14_Sub4_Sub1_3.method646(local152 + local48 * (float) -local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
						this.aClass14_Sub4_Sub1_3.method646(1.0F);
						this.aClass14_Sub4_Sub1_3.method646(0.0F);
						this.aClass14_Sub4_Sub1_3.method646(local140 + local52 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method646(local146 + local56 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method646(local152 + local60 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
						this.aClass14_Sub4_Sub1_3.method646(1.0F);
						this.aClass14_Sub4_Sub1_3.method646(1.0F);
						this.aClass14_Sub4_Sub1_3.method646(local140 + local40 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method646(local146 + local44 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method646(local152 + local48 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
						this.aClass14_Sub4_Sub1_3.method646(0.0F);
						this.aClass14_Sub4_Sub1_3.method646(1.0F);
						this.aClass14_Sub4_Sub1_3.method646(local140 + local64 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method646(local146 + local68 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method646(local152 + local72 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
					}
					if (this.anIntArray521[local83] > 64) {
						local104 = this.anIntArray521[local83] - 64 - 1;
						for (local424 = this.anIntArray522[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass1_Sub1_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt6412;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6421 >> Static190.anInt3903;
							local152 = local433.anInt6418 >> Static190.anInt3903;
							local472 = local433.anInt6410 >> Static190.anInt3903;
							local477 = local433.anInt6420 >> Static190.anInt3903;
							this.aClass14_Sub4_Sub1_3.method646(0.0F);
							this.aClass14_Sub4_Sub1_3.method646(0.0F);
							this.aClass14_Sub4_Sub1_3.method646(local146 + local40 * (float) -local477);
							this.aClass14_Sub4_Sub1_3.method646(local152 + local44 * (float) -local477);
							this.aClass14_Sub4_Sub1_3.method646(local472 + local48 * (float) -local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
							this.aClass14_Sub4_Sub1_3.method646(1.0F);
							this.aClass14_Sub4_Sub1_3.method646(0.0F);
							this.aClass14_Sub4_Sub1_3.method646(local146 + local52 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method646(local152 + local56 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method646(local472 + local60 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
							this.aClass14_Sub4_Sub1_3.method646(1.0F);
							this.aClass14_Sub4_Sub1_3.method646(1.0F);
							this.aClass14_Sub4_Sub1_3.method646(local146 + local40 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method646(local152 + local44 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method646(local472 + local48 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
							this.aClass14_Sub4_Sub1_3.method646(0.0F);
							this.aClass14_Sub4_Sub1_3.method646(1.0F);
							this.aClass14_Sub4_Sub1_3.method646(local146 + local64 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method646(local152 + local68 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method646(local472 + local72 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray521[local83] > 64 ? 64 : this.anIntArray521[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass1_Sub1_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt6412;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt6421 >> Static190.anInt3903;
						local146 = local113.anInt6418 >> Static190.anInt3903;
						local152 = local113.anInt6410 >> Static190.anInt3903;
						local157 = local113.anInt6420 >> Static190.anInt3903;
						this.aClass14_Sub4_Sub1_3.method647(0.0F);
						this.aClass14_Sub4_Sub1_3.method647(0.0F);
						this.aClass14_Sub4_Sub1_3.method647(local140 + local40 * (float) -local157);
						this.aClass14_Sub4_Sub1_3.method647(local146 + local44 * (float) -local157);
						this.aClass14_Sub4_Sub1_3.method647(local152 + local48 * (float) -local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
						this.aClass14_Sub4_Sub1_3.method647(1.0F);
						this.aClass14_Sub4_Sub1_3.method647(0.0F);
						this.aClass14_Sub4_Sub1_3.method647(local140 + local52 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method647(local146 + local56 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method647(local152 + local60 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
						this.aClass14_Sub4_Sub1_3.method647(1.0F);
						this.aClass14_Sub4_Sub1_3.method647(1.0F);
						this.aClass14_Sub4_Sub1_3.method647(local140 + local40 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method647(local146 + local44 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method647(local152 + local48 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
						this.aClass14_Sub4_Sub1_3.method647(0.0F);
						this.aClass14_Sub4_Sub1_3.method647(1.0F);
						this.aClass14_Sub4_Sub1_3.method647(local140 + local64 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method647(local146 + local68 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method647(local152 + local72 * (float) local157);
						this.aClass14_Sub4_Sub1_3.method2538(local121);
						this.aClass14_Sub4_Sub1_3.method2538(local126);
						this.aClass14_Sub4_Sub1_3.method2538(local129);
						this.aClass14_Sub4_Sub1_3.method2538(local134);
					}
					if (this.anIntArray521[local83] > 64) {
						local104 = this.anIntArray521[local83] - 64 - 1;
						for (local424 = this.anIntArray522[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass1_Sub1_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt6412;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt6421 >> Static190.anInt3903;
							local152 = local433.anInt6418 >> Static190.anInt3903;
							local472 = local433.anInt6410 >> Static190.anInt3903;
							local477 = local433.anInt6420 >> Static190.anInt3903;
							this.aClass14_Sub4_Sub1_3.method647(0.0F);
							this.aClass14_Sub4_Sub1_3.method647(0.0F);
							this.aClass14_Sub4_Sub1_3.method647(local146 + local40 * (float) -local477);
							this.aClass14_Sub4_Sub1_3.method647(local152 + local44 * (float) -local477);
							this.aClass14_Sub4_Sub1_3.method647(local472 + local48 * (float) -local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
							this.aClass14_Sub4_Sub1_3.method647(1.0F);
							this.aClass14_Sub4_Sub1_3.method647(0.0F);
							this.aClass14_Sub4_Sub1_3.method647(local146 + local52 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method647(local152 + local56 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method647(local472 + local60 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
							this.aClass14_Sub4_Sub1_3.method647(1.0F);
							this.aClass14_Sub4_Sub1_3.method647(1.0F);
							this.aClass14_Sub4_Sub1_3.method647(local146 + local40 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method647(local152 + local44 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method647(local472 + local48 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
							this.aClass14_Sub4_Sub1_3.method647(0.0F);
							this.aClass14_Sub4_Sub1_3.method647(1.0F);
							this.aClass14_Sub4_Sub1_3.method647(local146 + local64 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method647(local152 + local68 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method647(local472 + local72 * (float) local477);
							this.aClass14_Sub4_Sub1_3.method2538(local126);
							this.aClass14_Sub4_Sub1_3.method2538(local129);
							this.aClass14_Sub4_Sub1_3.method2538(local134);
							this.aClass14_Sub4_Sub1_3.method2538(local454);
						}
					}
				}
			}
		}
		if (this.aClass14_Sub4_Sub1_3.anInt2637 != 0) {
			this.anInterface3_6.method5386(24, this.aClass14_Sub4_Sub1_3.aByteArray74, this.aClass14_Sub4_Sub1_3.anInt2637);
			arg0.method5217(this.aClass168_11, null, this.aClass168_12, this.aClass168_13);
			arg0.method5201(this.aClass14_Sub4_Sub1_3.anInt2637 / 24);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sq;Lclient!jp;)V")
	public void method5272(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) Class109 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass51_Sub2_1 == null) {
			return;
		}
		this.method5273(arg0);
		@Pc(14) float local14 = arg0.aClass51_Sub2_1.aFloat68;
		@Pc(18) float local18 = arg0.aClass51_Sub2_1.aFloat71;
		@Pc(22) float local22 = arg0.aClass51_Sub2_1.aFloat77;
		@Pc(26) float local26 = arg0.aClass51_Sub2_1.aFloat70;
		try {
			@Pc(31) int local31;
			@Pc(48) Class1_Sub1_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean214) {
				local31 = arg1.anInt3273 - arg1.anInt3272;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class1_Sub1 local290 = arg1.aClass70_1.aClass1_Sub1_5;
				@Pc(293) Class1_Sub1 local293 = local290.aClass1_Sub1_7;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt5780 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray521[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray522[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class1_Sub1_Sub1) local293;
						if (local297) {
							local295 = local48.anInt6411;
							local297 = false;
						} else if (local295 != local48.anInt6411) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt6421 >> Static190.anInt3903) + local18 * (float) (local48.anInt6418 >> Static190.anInt3903) + local22 * (float) (local48.anInt6410 >> Static190.anInt3903) + local26) - arg1.anInt3272;
						if (local75 <= 1600) {
							if (this.anIntArray521[local75] < 64) {
								this.aClass1_Sub1_Sub1ArrayArray2[local75][this.anIntArray521[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray521[local75] == 64) {
										if (this.anInt5780 == 64) {
											break label188;
										}
										this.anIntArray521[local75] += this.anInt5780++ + 1;
									}
									this.aClass1_Sub1_Sub1ArrayArray1[this.anIntArray521[local75] - 64 - 1][this.anIntArray522[this.anIntArray521[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass1_Sub1_7;
					}
					arg0.method5251(local295 >= 0 ? arg0.aClass144_1.method3785(local295) : null);
					this.method5271(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class1_Sub1 local39 = arg1.aClass70_1.aClass1_Sub1_5;
				@Pc(42) Class1_Sub1 local42;
				for (local42 = local39.aClass1_Sub1_7; local42 != local39; local42 = local42.aClass1_Sub1_7) {
					local48 = (Class1_Sub1_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt6421 >> Static190.anInt3903) + local18 * (float) (local48.anInt6418 >> Static190.anInt3903) + local22 * (float) (local48.anInt6410 >> Static190.anInt3903) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray523[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass1_Sub1_7;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt5780 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray521[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray522[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class1_Sub1_Sub1 local149 = (Class1_Sub1_Sub1) local42;
						if (local113) {
							local75 = local149.anInt6411;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt6411) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray523[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray521[local173] < 64) {
								this.aClass1_Sub1_Sub1ArrayArray2[local173][this.anIntArray521[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray521[local173] == 64) {
										if (this.anInt5780 == 64) {
											break label186;
										}
										this.anIntArray521[local173] += this.anInt5780++ + 1;
									}
									this.aClass1_Sub1_Sub1ArrayArray1[this.anIntArray521[local173] - 64 - 1][this.anIntArray522[this.anIntArray521[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass1_Sub1_7;
					}
					arg0.method5251(local75 >= 0 ? arg0.aClass144_1.method3785(local75) : null);
					this.method5271(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method5275(arg0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!sq;)V")
	private void method5273(@OriginalArg(0) Class46_Sub2 arg0) {
		arg0.method5242();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method5208(false);
		arg0.method5226();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Lclient!sq;)V")
	public void method5274(@OriginalArg(0) Class46_Sub2 arg0) {
		this.anInterface3_6 = arg0.method5229(24, null, 196584, true);
		this.aClass168_13 = new Class168(arg0, this.anInterface3_6, 5126, 2, 0);
		this.aClass168_11 = new Class168(arg0, this.anInterface3_6, 5126, 3, 8);
		this.aClass168_12 = new Class168(arg0, this.anInterface3_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!sq;)V")
	private void method5275(@OriginalArg(0) Class46_Sub2 arg0) {
		arg0.method5208(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}
}
