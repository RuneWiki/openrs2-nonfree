import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class85 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "Lclient!um;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "Lclient!hf;")
	private Class81 aClass81_5;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "Lclient!hf;")
	private Class81 aClass81_6;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Lclient!hf;")
	private Class81 aClass81_7;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "[F")
	private final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "Lclient!pq;")
	private final Class2_Sub10_Sub2 aClass2_Sub10_Sub2_2 = new Class2_Sub10_Sub2(786336);

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
	private final int[] anIntArray234 = new int[1600];

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "[I")
	private final int[] anIntArray233 = new int[8191];

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
	private final int[] anIntArray235 = new int[64];

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "[[Lclient!tf;")
	private final Class55_Sub8_Sub1[][] aClass55_Sub8_Sub1ArrayArray1 = new Class55_Sub8_Sub1[1600][64];

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "[[Lclient!tf;")
	private final Class55_Sub8_Sub1[][] aClass55_Sub8_Sub1ArrayArray2 = new Class55_Sub8_Sub1[64][768];

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	private int anInt2606 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ao;Lclient!gm;)V")
	public void method2515(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) Class75 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass133_Sub2_1 == null) {
			return;
		}
		this.method2519(arg0);
		@Pc(14) float local14 = arg0.aClass133_Sub2_1.aFloat55;
		@Pc(18) float local18 = arg0.aClass133_Sub2_1.aFloat59;
		@Pc(22) float local22 = arg0.aClass133_Sub2_1.aFloat60;
		@Pc(26) float local26 = arg0.aClass133_Sub2_1.aFloat56;
		try {
			@Pc(31) int local31;
			@Pc(48) Class55_Sub8_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean207) {
				local31 = arg1.anInt2398 - arg1.anInt2397;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class55_Sub8 local290 = arg1.aClass155_1.aClass55_Sub8_1;
				@Pc(293) Class55_Sub8 local293 = local290.aClass55_Sub8_7;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt2606 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray234[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray235[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class55_Sub8_Sub1) local293;
						if (local297) {
							local295 = local48.anInt5008;
							local297 = false;
						} else if (local295 != local48.anInt5008) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt5005 >> Static110.anInt2450) + local18 * (float) (local48.anInt5013 >> Static110.anInt2450) + local22 * (float) (local48.anInt5014 >> Static110.anInt2450) + local26) - arg1.anInt2397;
						if (local75 <= 1600) {
							if (this.anIntArray234[local75] < 64) {
								this.aClass55_Sub8_Sub1ArrayArray1[local75][this.anIntArray234[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray234[local75] == 64) {
										if (this.anInt2606 == 64) {
											break label188;
										}
										this.anIntArray234[local75] += this.anInt2606++ + 1;
									}
									this.aClass55_Sub8_Sub1ArrayArray2[this.anIntArray234[local75] - 64 - 1][this.anIntArray235[this.anIntArray234[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass55_Sub8_7;
					}
					arg0.method602(local295 >= 0 ? arg0.aClass29_1.method863(local295) : null);
					this.method2516(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class55_Sub8 local39 = arg1.aClass155_1.aClass55_Sub8_1;
				@Pc(42) Class55_Sub8 local42;
				for (local42 = local39.aClass55_Sub8_7; local42 != local39; local42 = local42.aClass55_Sub8_7) {
					local48 = (Class55_Sub8_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt5005 >> Static110.anInt2450) + local18 * (float) (local48.anInt5013 >> Static110.anInt2450) + local22 * (float) (local48.anInt5014 >> Static110.anInt2450) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray233[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass55_Sub8_7;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt2606 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray234[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray235[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class55_Sub8_Sub1 local149 = (Class55_Sub8_Sub1) local42;
						if (local113) {
							local75 = local149.anInt5008;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt5008) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray233[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray234[local173] < 64) {
								this.aClass55_Sub8_Sub1ArrayArray1[local173][this.anIntArray234[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray234[local173] == 64) {
										if (this.anInt2606 == 64) {
											break label186;
										}
										this.anIntArray234[local173] += this.anInt2606++ + 1;
									}
									this.aClass55_Sub8_Sub1ArrayArray2[this.anIntArray234[local173] - 64 - 1][this.anIntArray235[this.anIntArray234[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass55_Sub8_7;
					}
					arg0.method602(local75 >= 0 ? arg0.aClass29_1.method863(local75) : null);
					this.method2516(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method2517(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ao;I)V")
	private void method2516(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(2982, this.aFloatArray11, 0);
		@Pc(11) float local11 = this.aFloatArray11[0];
		@Pc(16) float local16 = this.aFloatArray11[4];
		@Pc(21) float local21 = this.aFloatArray11[8];
		@Pc(26) float local26 = this.aFloatArray11[1];
		@Pc(31) float local31 = this.aFloatArray11[5];
		@Pc(36) float local36 = this.aFloatArray11[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass2_Sub10_Sub2_2.anInt4807 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class55_Sub8_Sub1 local113;
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
		@Pc(433) Class55_Sub8_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean32) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray234[local83] > 64 ? 64 : this.anIntArray234[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass55_Sub8_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt5006;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt5005 >> Static110.anInt2450;
						local146 = local113.anInt5013 >> Static110.anInt2450;
						local152 = local113.anInt5014 >> Static110.anInt2450;
						local157 = local113.anInt5011 >> Static110.anInt2450;
						this.aClass2_Sub10_Sub2_2.method4466(0.0F);
						this.aClass2_Sub10_Sub2_2.method4466(0.0F);
						this.aClass2_Sub10_Sub2_2.method4466(local140 + local40 * (float) -local157);
						this.aClass2_Sub10_Sub2_2.method4466(local146 + local44 * (float) -local157);
						this.aClass2_Sub10_Sub2_2.method4466(local152 + local48 * (float) -local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
						this.aClass2_Sub10_Sub2_2.method4466(1.0F);
						this.aClass2_Sub10_Sub2_2.method4466(0.0F);
						this.aClass2_Sub10_Sub2_2.method4466(local140 + local52 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4466(local146 + local56 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4466(local152 + local60 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
						this.aClass2_Sub10_Sub2_2.method4466(1.0F);
						this.aClass2_Sub10_Sub2_2.method4466(1.0F);
						this.aClass2_Sub10_Sub2_2.method4466(local140 + local40 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4466(local146 + local44 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4466(local152 + local48 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
						this.aClass2_Sub10_Sub2_2.method4466(0.0F);
						this.aClass2_Sub10_Sub2_2.method4466(1.0F);
						this.aClass2_Sub10_Sub2_2.method4466(local140 + local64 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4466(local146 + local68 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4466(local152 + local72 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
					}
					if (this.anIntArray234[local83] > 64) {
						local104 = this.anIntArray234[local83] - 64 - 1;
						for (local424 = this.anIntArray235[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass55_Sub8_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt5006;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt5005 >> Static110.anInt2450;
							local152 = local433.anInt5013 >> Static110.anInt2450;
							local472 = local433.anInt5014 >> Static110.anInt2450;
							local477 = local433.anInt5011 >> Static110.anInt2450;
							this.aClass2_Sub10_Sub2_2.method4466(0.0F);
							this.aClass2_Sub10_Sub2_2.method4466(0.0F);
							this.aClass2_Sub10_Sub2_2.method4466(local146 + local40 * (float) -local477);
							this.aClass2_Sub10_Sub2_2.method4466(local152 + local44 * (float) -local477);
							this.aClass2_Sub10_Sub2_2.method4466(local472 + local48 * (float) -local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
							this.aClass2_Sub10_Sub2_2.method4466(1.0F);
							this.aClass2_Sub10_Sub2_2.method4466(0.0F);
							this.aClass2_Sub10_Sub2_2.method4466(local146 + local52 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4466(local152 + local56 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4466(local472 + local60 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
							this.aClass2_Sub10_Sub2_2.method4466(1.0F);
							this.aClass2_Sub10_Sub2_2.method4466(1.0F);
							this.aClass2_Sub10_Sub2_2.method4466(local146 + local40 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4466(local152 + local44 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4466(local472 + local48 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
							this.aClass2_Sub10_Sub2_2.method4466(0.0F);
							this.aClass2_Sub10_Sub2_2.method4466(1.0F);
							this.aClass2_Sub10_Sub2_2.method4466(local146 + local64 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4466(local152 + local68 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4466(local472 + local72 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray234[local83] > 64 ? 64 : this.anIntArray234[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass55_Sub8_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt5006;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt5005 >> Static110.anInt2450;
						local146 = local113.anInt5013 >> Static110.anInt2450;
						local152 = local113.anInt5014 >> Static110.anInt2450;
						local157 = local113.anInt5011 >> Static110.anInt2450;
						this.aClass2_Sub10_Sub2_2.method4465(0.0F);
						this.aClass2_Sub10_Sub2_2.method4465(0.0F);
						this.aClass2_Sub10_Sub2_2.method4465(local140 + local40 * (float) -local157);
						this.aClass2_Sub10_Sub2_2.method4465(local146 + local44 * (float) -local157);
						this.aClass2_Sub10_Sub2_2.method4465(local152 + local48 * (float) -local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
						this.aClass2_Sub10_Sub2_2.method4465(1.0F);
						this.aClass2_Sub10_Sub2_2.method4465(0.0F);
						this.aClass2_Sub10_Sub2_2.method4465(local140 + local52 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4465(local146 + local56 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4465(local152 + local60 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
						this.aClass2_Sub10_Sub2_2.method4465(1.0F);
						this.aClass2_Sub10_Sub2_2.method4465(1.0F);
						this.aClass2_Sub10_Sub2_2.method4465(local140 + local40 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4465(local146 + local44 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4465(local152 + local48 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
						this.aClass2_Sub10_Sub2_2.method4465(0.0F);
						this.aClass2_Sub10_Sub2_2.method4465(1.0F);
						this.aClass2_Sub10_Sub2_2.method4465(local140 + local64 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4465(local146 + local68 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4465(local152 + local72 * (float) local157);
						this.aClass2_Sub10_Sub2_2.method4430(local121);
						this.aClass2_Sub10_Sub2_2.method4430(local126);
						this.aClass2_Sub10_Sub2_2.method4430(local129);
						this.aClass2_Sub10_Sub2_2.method4430(local134);
					}
					if (this.anIntArray234[local83] > 64) {
						local104 = this.anIntArray234[local83] - 64 - 1;
						for (local424 = this.anIntArray235[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass55_Sub8_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt5006;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt5005 >> Static110.anInt2450;
							local152 = local433.anInt5013 >> Static110.anInt2450;
							local472 = local433.anInt5014 >> Static110.anInt2450;
							local477 = local433.anInt5011 >> Static110.anInt2450;
							this.aClass2_Sub10_Sub2_2.method4465(0.0F);
							this.aClass2_Sub10_Sub2_2.method4465(0.0F);
							this.aClass2_Sub10_Sub2_2.method4465(local146 + local40 * (float) -local477);
							this.aClass2_Sub10_Sub2_2.method4465(local152 + local44 * (float) -local477);
							this.aClass2_Sub10_Sub2_2.method4465(local472 + local48 * (float) -local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
							this.aClass2_Sub10_Sub2_2.method4465(1.0F);
							this.aClass2_Sub10_Sub2_2.method4465(0.0F);
							this.aClass2_Sub10_Sub2_2.method4465(local146 + local52 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4465(local152 + local56 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4465(local472 + local60 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
							this.aClass2_Sub10_Sub2_2.method4465(1.0F);
							this.aClass2_Sub10_Sub2_2.method4465(1.0F);
							this.aClass2_Sub10_Sub2_2.method4465(local146 + local40 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4465(local152 + local44 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4465(local472 + local48 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
							this.aClass2_Sub10_Sub2_2.method4465(0.0F);
							this.aClass2_Sub10_Sub2_2.method4465(1.0F);
							this.aClass2_Sub10_Sub2_2.method4465(local146 + local64 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4465(local152 + local68 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4465(local472 + local72 * (float) local477);
							this.aClass2_Sub10_Sub2_2.method4430(local126);
							this.aClass2_Sub10_Sub2_2.method4430(local129);
							this.aClass2_Sub10_Sub2_2.method4430(local134);
							this.aClass2_Sub10_Sub2_2.method4430(local454);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub10_Sub2_2.anInt4807 != 0) {
			this.anInterface8_4.method4972(24, this.aClass2_Sub10_Sub2_2.aByteArray57, this.aClass2_Sub10_Sub2_2.anInt4807);
			arg0.method584(this.aClass81_7, null, this.aClass81_5, this.aClass81_6);
			arg0.method585(this.aClass2_Sub10_Sub2_2.anInt4807 / 24);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ao;)V")
	private void method2517(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.method558(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!ao;)V")
	public void method2518(@OriginalArg(0) Class4_Sub1 arg0) {
		this.anInterface8_4 = arg0.method551(24, null, 196584, true);
		this.aClass81_6 = new Class81(arg0, this.anInterface8_4, 5126, 2, 0);
		this.aClass81_7 = new Class81(arg0, this.anInterface8_4, 5126, 3, 8);
		this.aClass81_5 = new Class81(arg0, this.anInterface8_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(Lclient!ao;)V")
	private void method2519(@OriginalArg(0) Class4_Sub1 arg0) {
		arg0.method581();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method558(false);
		arg0.method578();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
