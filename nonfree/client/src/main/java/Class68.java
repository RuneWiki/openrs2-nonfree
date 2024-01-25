import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class68 {

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "Lclient!wi;")
	private Class217 aClass217_9;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "Lclient!mp;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!fh", name = "i", descriptor = "Lclient!wi;")
	private Class217 aClass217_10;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "Lclient!wi;")
	private Class217 aClass217_11;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "[F")
	private final float[] aFloatArray7 = new float[16];

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!lb;")
	private final Class4_Sub11_Sub2 aClass4_Sub11_Sub2_2 = new Class4_Sub11_Sub2(786336);

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "[I")
	private final int[] anIntArray206 = new int[8191];

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "[[Lclient!ab;")
	private final Class2_Sub1_Sub1[][] aClass2_Sub1_Sub1ArrayArray1 = new Class2_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "[[Lclient!ab;")
	private final Class2_Sub1_Sub1[][] aClass2_Sub1_Sub1ArrayArray2 = new Class2_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!fh", name = "j", descriptor = "[I")
	private final int[] anIntArray207 = new int[64];

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "[I")
	private final int[] anIntArray208 = new int[1600];

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
	private int anInt2397 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ig;I)V")
	private void method2120(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray7, 0);
		@Pc(11) float local11 = this.aFloatArray7[0];
		@Pc(16) float local16 = this.aFloatArray7[4];
		@Pc(21) float local21 = this.aFloatArray7[8];
		@Pc(26) float local26 = this.aFloatArray7[1];
		@Pc(31) float local31 = this.aFloatArray7[5];
		@Pc(36) float local36 = this.aFloatArray7[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass4_Sub11_Sub2_2.anInt3768 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class2_Sub1_Sub1 local113;
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
		@Pc(433) Class2_Sub1_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean235) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray208[local83] > 64 ? 64 : this.anIntArray208[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass2_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt5235;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt5239 >> Static350.anInt6634;
						local146 = local113.anInt5231 >> Static350.anInt6634;
						local152 = local113.anInt5234 >> Static350.anInt6634;
						local157 = local113.anInt5237 >> Static350.anInt6634;
						this.aClass4_Sub11_Sub2_2.method3463(0.0F);
						this.aClass4_Sub11_Sub2_2.method3463(0.0F);
						this.aClass4_Sub11_Sub2_2.method3463(local140 + local40 * (float) -local157);
						this.aClass4_Sub11_Sub2_2.method3463(local146 + local44 * (float) -local157);
						this.aClass4_Sub11_Sub2_2.method3463(local152 + local48 * (float) -local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
						this.aClass4_Sub11_Sub2_2.method3463(1.0F);
						this.aClass4_Sub11_Sub2_2.method3463(0.0F);
						this.aClass4_Sub11_Sub2_2.method3463(local140 + local52 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3463(local146 + local56 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3463(local152 + local60 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
						this.aClass4_Sub11_Sub2_2.method3463(1.0F);
						this.aClass4_Sub11_Sub2_2.method3463(1.0F);
						this.aClass4_Sub11_Sub2_2.method3463(local140 + local40 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3463(local146 + local44 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3463(local152 + local48 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
						this.aClass4_Sub11_Sub2_2.method3463(0.0F);
						this.aClass4_Sub11_Sub2_2.method3463(1.0F);
						this.aClass4_Sub11_Sub2_2.method3463(local140 + local64 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3463(local146 + local68 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3463(local152 + local72 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
					}
					if (this.anIntArray208[local83] > 64) {
						local104 = this.anIntArray208[local83] - 64 - 1;
						for (local424 = this.anIntArray207[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass2_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt5235;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt5239 >> Static350.anInt6634;
							local152 = local433.anInt5231 >> Static350.anInt6634;
							local472 = local433.anInt5234 >> Static350.anInt6634;
							local477 = local433.anInt5237 >> Static350.anInt6634;
							this.aClass4_Sub11_Sub2_2.method3463(0.0F);
							this.aClass4_Sub11_Sub2_2.method3463(0.0F);
							this.aClass4_Sub11_Sub2_2.method3463(local146 + local40 * (float) -local477);
							this.aClass4_Sub11_Sub2_2.method3463(local152 + local44 * (float) -local477);
							this.aClass4_Sub11_Sub2_2.method3463(local472 + local48 * (float) -local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
							this.aClass4_Sub11_Sub2_2.method3463(1.0F);
							this.aClass4_Sub11_Sub2_2.method3463(0.0F);
							this.aClass4_Sub11_Sub2_2.method3463(local146 + local52 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3463(local152 + local56 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3463(local472 + local60 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
							this.aClass4_Sub11_Sub2_2.method3463(1.0F);
							this.aClass4_Sub11_Sub2_2.method3463(1.0F);
							this.aClass4_Sub11_Sub2_2.method3463(local146 + local40 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3463(local152 + local44 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3463(local472 + local48 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
							this.aClass4_Sub11_Sub2_2.method3463(0.0F);
							this.aClass4_Sub11_Sub2_2.method3463(1.0F);
							this.aClass4_Sub11_Sub2_2.method3463(local146 + local64 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3463(local152 + local68 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3463(local472 + local72 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray208[local83] > 64 ? 64 : this.anIntArray208[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass2_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt5235;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt5239 >> Static350.anInt6634;
						local146 = local113.anInt5231 >> Static350.anInt6634;
						local152 = local113.anInt5234 >> Static350.anInt6634;
						local157 = local113.anInt5237 >> Static350.anInt6634;
						this.aClass4_Sub11_Sub2_2.method3462(0.0F);
						this.aClass4_Sub11_Sub2_2.method3462(0.0F);
						this.aClass4_Sub11_Sub2_2.method3462(local140 + local40 * (float) -local157);
						this.aClass4_Sub11_Sub2_2.method3462(local146 + local44 * (float) -local157);
						this.aClass4_Sub11_Sub2_2.method3462(local152 + local48 * (float) -local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
						this.aClass4_Sub11_Sub2_2.method3462(1.0F);
						this.aClass4_Sub11_Sub2_2.method3462(0.0F);
						this.aClass4_Sub11_Sub2_2.method3462(local140 + local52 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3462(local146 + local56 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3462(local152 + local60 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
						this.aClass4_Sub11_Sub2_2.method3462(1.0F);
						this.aClass4_Sub11_Sub2_2.method3462(1.0F);
						this.aClass4_Sub11_Sub2_2.method3462(local140 + local40 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3462(local146 + local44 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3462(local152 + local48 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
						this.aClass4_Sub11_Sub2_2.method3462(0.0F);
						this.aClass4_Sub11_Sub2_2.method3462(1.0F);
						this.aClass4_Sub11_Sub2_2.method3462(local140 + local64 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3462(local146 + local68 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3462(local152 + local72 * (float) local157);
						this.aClass4_Sub11_Sub2_2.method3434(local121);
						this.aClass4_Sub11_Sub2_2.method3434(local126);
						this.aClass4_Sub11_Sub2_2.method3434(local129);
						this.aClass4_Sub11_Sub2_2.method3434(local134);
					}
					if (this.anIntArray208[local83] > 64) {
						local104 = this.anIntArray208[local83] - 64 - 1;
						for (local424 = this.anIntArray207[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass2_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt5235;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt5239 >> Static350.anInt6634;
							local152 = local433.anInt5231 >> Static350.anInt6634;
							local472 = local433.anInt5234 >> Static350.anInt6634;
							local477 = local433.anInt5237 >> Static350.anInt6634;
							this.aClass4_Sub11_Sub2_2.method3462(0.0F);
							this.aClass4_Sub11_Sub2_2.method3462(0.0F);
							this.aClass4_Sub11_Sub2_2.method3462(local146 + local40 * (float) -local477);
							this.aClass4_Sub11_Sub2_2.method3462(local152 + local44 * (float) -local477);
							this.aClass4_Sub11_Sub2_2.method3462(local472 + local48 * (float) -local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
							this.aClass4_Sub11_Sub2_2.method3462(1.0F);
							this.aClass4_Sub11_Sub2_2.method3462(0.0F);
							this.aClass4_Sub11_Sub2_2.method3462(local146 + local52 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3462(local152 + local56 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3462(local472 + local60 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
							this.aClass4_Sub11_Sub2_2.method3462(1.0F);
							this.aClass4_Sub11_Sub2_2.method3462(1.0F);
							this.aClass4_Sub11_Sub2_2.method3462(local146 + local40 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3462(local152 + local44 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3462(local472 + local48 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
							this.aClass4_Sub11_Sub2_2.method3462(0.0F);
							this.aClass4_Sub11_Sub2_2.method3462(1.0F);
							this.aClass4_Sub11_Sub2_2.method3462(local146 + local64 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3462(local152 + local68 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3462(local472 + local72 * (float) local477);
							this.aClass4_Sub11_Sub2_2.method3434(local126);
							this.aClass4_Sub11_Sub2_2.method3434(local129);
							this.aClass4_Sub11_Sub2_2.method3434(local134);
							this.aClass4_Sub11_Sub2_2.method3434(local454);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub11_Sub2_2.anInt3768 != 0) {
			this.anInterface8_3.method2114(24, this.aClass4_Sub11_Sub2_2.aByteArray55, this.aClass4_Sub11_Sub2_2.anInt3768);
			arg0.method2805(this.aClass217_10, null, this.aClass217_9, this.aClass217_11);
			arg0.method2834(this.aClass4_Sub11_Sub2_2.anInt3768 / 24);
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ig;)V")
	private void method2121(@OriginalArg(0) Class47_Sub2 arg0) {
		arg0.method2810(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!ig;Lclient!rm;)V")
	public void method2122(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class176 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass57_Sub2_2 == null) {
			return;
		}
		this.method2123(arg0);
		@Pc(14) float local14 = arg0.aClass57_Sub2_2.aFloat72;
		@Pc(18) float local18 = arg0.aClass57_Sub2_2.aFloat73;
		@Pc(22) float local22 = arg0.aClass57_Sub2_2.aFloat82;
		@Pc(26) float local26 = arg0.aClass57_Sub2_2.aFloat76;
		try {
			@Pc(31) int local31;
			@Pc(48) Class2_Sub1_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean404) {
				local31 = arg1.anInt5513 - arg1.anInt5514;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class2_Sub1 local290 = arg1.aClass195_1.aClass2_Sub1_7;
				@Pc(293) Class2_Sub1 local293 = local290.aClass2_Sub1_6;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt2397 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray208[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray207[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class2_Sub1_Sub1) local293;
						if (local297) {
							local295 = local48.anInt5233;
							local297 = false;
						} else if (local295 != local48.anInt5233) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt5239 >> Static350.anInt6634) + local18 * (float) (local48.anInt5231 >> Static350.anInt6634) + local22 * (float) (local48.anInt5234 >> Static350.anInt6634) + local26) - arg1.anInt5514;
						if (local75 <= 1600) {
							if (this.anIntArray208[local75] < 64) {
								this.aClass2_Sub1_Sub1ArrayArray1[local75][this.anIntArray208[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray208[local75] == 64) {
										if (this.anInt2397 == 64) {
											break label188;
										}
										this.anIntArray208[local75] += this.anInt2397++ + 1;
									}
									this.aClass2_Sub1_Sub1ArrayArray2[this.anIntArray208[local75] - 64 - 1][this.anIntArray207[this.anIntArray208[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass2_Sub1_6;
					}
					arg0.method2772(local295 >= 0 ? arg0.aClass206_1.method5381(local295) : null);
					this.method2120(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class2_Sub1 local39 = arg1.aClass195_1.aClass2_Sub1_7;
				@Pc(42) Class2_Sub1 local42;
				for (local42 = local39.aClass2_Sub1_6; local42 != local39; local42 = local42.aClass2_Sub1_6) {
					local48 = (Class2_Sub1_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt5239 >> Static350.anInt6634) + local18 * (float) (local48.anInt5231 >> Static350.anInt6634) + local22 * (float) (local48.anInt5234 >> Static350.anInt6634) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray206[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass2_Sub1_6;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt2397 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray208[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray207[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class2_Sub1_Sub1 local149 = (Class2_Sub1_Sub1) local42;
						if (local113) {
							local75 = local149.anInt5233;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt5233) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray206[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray208[local173] < 64) {
								this.aClass2_Sub1_Sub1ArrayArray1[local173][this.anIntArray208[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray208[local173] == 64) {
										if (this.anInt2397 == 64) {
											break label186;
										}
										this.anIntArray208[local173] += this.anInt2397++ + 1;
									}
									this.aClass2_Sub1_Sub1ArrayArray2[this.anIntArray208[local173] - 64 - 1][this.anIntArray207[this.anIntArray208[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass2_Sub1_6;
					}
					arg0.method2772(local75 >= 0 ? arg0.aClass206_1.method5381(local75) : null);
					this.method2120(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method2121(arg0);
	}

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Lclient!ig;)V")
	private void method2123(@OriginalArg(0) Class47_Sub2 arg0) {
		arg0.method2785();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method2810(false);
		arg0.method2814();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(Lclient!ig;)V")
	public void method2124(@OriginalArg(0) Class47_Sub2 arg0) {
		this.anInterface8_3 = arg0.method2783(24, null, 196584, true);
		this.aClass217_11 = new Class217(arg0, this.anInterface8_3, 5126, 2, 0);
		this.aClass217_10 = new Class217(arg0, this.anInterface8_3, 5126, 3, 8);
		this.aClass217_9 = new Class217(arg0, this.anInterface8_3, 5121, 4, 20);
	}
}
