import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public final class Class182 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!vl;")
	private Class203 aClass203_10;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!vl;")
	private Class203 aClass203_11;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!vl;")
	private Class203 aClass203_12;

	@OriginalMember(owner = "client!s", name = "m", descriptor = "Lclient!q;")
	private Interface8 anInterface8_4;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "[F")
	private final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!ed;")
	private final Class5_Sub12_Sub1 aClass5_Sub12_Sub1_2 = new Class5_Sub12_Sub1(786336);

	@OriginalMember(owner = "client!s", name = "d", descriptor = "[[Lclient!hf;")
	private final Class32_Sub3_Sub1[][] aClass32_Sub3_Sub1ArrayArray1 = new Class32_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!s", name = "i", descriptor = "[I")
	private final int[] anIntArray546 = new int[1600];

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	private int anInt5614 = 0;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
	private final int[] anIntArray545 = new int[64];

	@OriginalMember(owner = "client!s", name = "l", descriptor = "[[Lclient!hf;")
	private final Class32_Sub3_Sub1[][] aClass32_Sub3_Sub1ArrayArray2 = new Class32_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
	private final int[] anIntArray547 = new int[8191];

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!mm;I)V")
	private void method4968(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1) {
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
		this.aClass5_Sub12_Sub1_2.anInt5731 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class32_Sub3_Sub1 local113;
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
		@Pc(433) Class32_Sub3_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean308) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray546[local83] > 64 ? 64 : this.anIntArray546[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass32_Sub3_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt3761;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt3760 >> Static53.anInt983;
						local146 = local113.anInt3755 >> Static53.anInt983;
						local152 = local113.anInt3756 >> Static53.anInt983;
						local157 = local113.anInt3759 >> Static53.anInt983;
						this.aClass5_Sub12_Sub1_2.method1300(0.0F);
						this.aClass5_Sub12_Sub1_2.method1300(0.0F);
						this.aClass5_Sub12_Sub1_2.method1300(local140 + local40 * (float) -local157);
						this.aClass5_Sub12_Sub1_2.method1300(local146 + local44 * (float) -local157);
						this.aClass5_Sub12_Sub1_2.method1300(local152 + local48 * (float) -local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
						this.aClass5_Sub12_Sub1_2.method1300(1.0F);
						this.aClass5_Sub12_Sub1_2.method1300(0.0F);
						this.aClass5_Sub12_Sub1_2.method1300(local140 + local52 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1300(local146 + local56 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1300(local152 + local60 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
						this.aClass5_Sub12_Sub1_2.method1300(1.0F);
						this.aClass5_Sub12_Sub1_2.method1300(1.0F);
						this.aClass5_Sub12_Sub1_2.method1300(local140 + local40 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1300(local146 + local44 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1300(local152 + local48 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
						this.aClass5_Sub12_Sub1_2.method1300(0.0F);
						this.aClass5_Sub12_Sub1_2.method1300(1.0F);
						this.aClass5_Sub12_Sub1_2.method1300(local140 + local64 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1300(local146 + local68 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1300(local152 + local72 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
					}
					if (this.anIntArray546[local83] > 64) {
						local104 = this.anIntArray546[local83] - 64 - 1;
						for (local424 = this.anIntArray545[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass32_Sub3_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt3761;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt3760 >> Static53.anInt983;
							local152 = local433.anInt3755 >> Static53.anInt983;
							local472 = local433.anInt3756 >> Static53.anInt983;
							local477 = local433.anInt3759 >> Static53.anInt983;
							this.aClass5_Sub12_Sub1_2.method1300(0.0F);
							this.aClass5_Sub12_Sub1_2.method1300(0.0F);
							this.aClass5_Sub12_Sub1_2.method1300(local146 + local40 * (float) -local477);
							this.aClass5_Sub12_Sub1_2.method1300(local152 + local44 * (float) -local477);
							this.aClass5_Sub12_Sub1_2.method1300(local472 + local48 * (float) -local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
							this.aClass5_Sub12_Sub1_2.method1300(1.0F);
							this.aClass5_Sub12_Sub1_2.method1300(0.0F);
							this.aClass5_Sub12_Sub1_2.method1300(local146 + local52 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1300(local152 + local56 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1300(local472 + local60 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
							this.aClass5_Sub12_Sub1_2.method1300(1.0F);
							this.aClass5_Sub12_Sub1_2.method1300(1.0F);
							this.aClass5_Sub12_Sub1_2.method1300(local146 + local40 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1300(local152 + local44 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1300(local472 + local48 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
							this.aClass5_Sub12_Sub1_2.method1300(0.0F);
							this.aClass5_Sub12_Sub1_2.method1300(1.0F);
							this.aClass5_Sub12_Sub1_2.method1300(local146 + local64 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1300(local152 + local68 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1300(local472 + local72 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray546[local83] > 64 ? 64 : this.anIntArray546[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass32_Sub3_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt3761;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt3760 >> Static53.anInt983;
						local146 = local113.anInt3755 >> Static53.anInt983;
						local152 = local113.anInt3756 >> Static53.anInt983;
						local157 = local113.anInt3759 >> Static53.anInt983;
						this.aClass5_Sub12_Sub1_2.method1301(0.0F);
						this.aClass5_Sub12_Sub1_2.method1301(0.0F);
						this.aClass5_Sub12_Sub1_2.method1301(local140 + local40 * (float) -local157);
						this.aClass5_Sub12_Sub1_2.method1301(local146 + local44 * (float) -local157);
						this.aClass5_Sub12_Sub1_2.method1301(local152 + local48 * (float) -local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
						this.aClass5_Sub12_Sub1_2.method1301(1.0F);
						this.aClass5_Sub12_Sub1_2.method1301(0.0F);
						this.aClass5_Sub12_Sub1_2.method1301(local140 + local52 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1301(local146 + local56 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1301(local152 + local60 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
						this.aClass5_Sub12_Sub1_2.method1301(1.0F);
						this.aClass5_Sub12_Sub1_2.method1301(1.0F);
						this.aClass5_Sub12_Sub1_2.method1301(local140 + local40 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1301(local146 + local44 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1301(local152 + local48 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
						this.aClass5_Sub12_Sub1_2.method1301(0.0F);
						this.aClass5_Sub12_Sub1_2.method1301(1.0F);
						this.aClass5_Sub12_Sub1_2.method1301(local140 + local64 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1301(local146 + local68 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method1301(local152 + local72 * (float) local157);
						this.aClass5_Sub12_Sub1_2.method5089(local121);
						this.aClass5_Sub12_Sub1_2.method5089(local126);
						this.aClass5_Sub12_Sub1_2.method5089(local129);
						this.aClass5_Sub12_Sub1_2.method5089(local134);
					}
					if (this.anIntArray546[local83] > 64) {
						local104 = this.anIntArray546[local83] - 64 - 1;
						for (local424 = this.anIntArray545[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass32_Sub3_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt3761;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt3760 >> Static53.anInt983;
							local152 = local433.anInt3755 >> Static53.anInt983;
							local472 = local433.anInt3756 >> Static53.anInt983;
							local477 = local433.anInt3759 >> Static53.anInt983;
							this.aClass5_Sub12_Sub1_2.method1301(0.0F);
							this.aClass5_Sub12_Sub1_2.method1301(0.0F);
							this.aClass5_Sub12_Sub1_2.method1301(local146 + local40 * (float) -local477);
							this.aClass5_Sub12_Sub1_2.method1301(local152 + local44 * (float) -local477);
							this.aClass5_Sub12_Sub1_2.method1301(local472 + local48 * (float) -local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
							this.aClass5_Sub12_Sub1_2.method1301(1.0F);
							this.aClass5_Sub12_Sub1_2.method1301(0.0F);
							this.aClass5_Sub12_Sub1_2.method1301(local146 + local52 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1301(local152 + local56 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1301(local472 + local60 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
							this.aClass5_Sub12_Sub1_2.method1301(1.0F);
							this.aClass5_Sub12_Sub1_2.method1301(1.0F);
							this.aClass5_Sub12_Sub1_2.method1301(local146 + local40 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1301(local152 + local44 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1301(local472 + local48 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
							this.aClass5_Sub12_Sub1_2.method1301(0.0F);
							this.aClass5_Sub12_Sub1_2.method1301(1.0F);
							this.aClass5_Sub12_Sub1_2.method1301(local146 + local64 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1301(local152 + local68 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method1301(local472 + local72 * (float) local477);
							this.aClass5_Sub12_Sub1_2.method5089(local126);
							this.aClass5_Sub12_Sub1_2.method5089(local129);
							this.aClass5_Sub12_Sub1_2.method5089(local134);
							this.aClass5_Sub12_Sub1_2.method5089(local454);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub12_Sub1_2.anInt5731 != 0) {
			this.anInterface8_4.method1363(24, this.aClass5_Sub12_Sub1_2.aByteArray90, this.aClass5_Sub12_Sub1_2.anInt5731);
			arg0.method3640(this.aClass203_10, null, this.aClass203_11, this.aClass203_12);
			arg0.method3663(this.aClass5_Sub12_Sub1_2.anInt5731 / 24);
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!mm;)V")
	public void method4969(@OriginalArg(0) Class55_Sub1 arg0) {
		this.anInterface8_4 = arg0.method3674(24, null, 196584, true);
		this.aClass203_12 = new Class203(arg0, this.anInterface8_4, 5126, 2, 0);
		this.aClass203_10 = new Class203(arg0, this.anInterface8_4, 5126, 3, 8);
		this.aClass203_11 = new Class203(arg0, this.anInterface8_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!mm;Lclient!ns;)V")
	public void method4970(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) Class146 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass66_Sub2_2 == null) {
			return;
		}
		this.method4971(arg0);
		@Pc(14) float local14 = arg0.aClass66_Sub2_2.aFloat66;
		@Pc(18) float local18 = arg0.aClass66_Sub2_2.aFloat74;
		@Pc(22) float local22 = arg0.aClass66_Sub2_2.aFloat72;
		@Pc(26) float local26 = arg0.aClass66_Sub2_2.aFloat73;
		try {
			@Pc(31) int local31;
			@Pc(48) Class32_Sub3_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean355) {
				local31 = arg1.anInt4362 - arg1.anInt4361;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class32_Sub3 local290 = arg1.aClass13_1.aClass32_Sub3_1;
				@Pc(293) Class32_Sub3 local293 = local290.aClass32_Sub3_8;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt5614 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray546[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray545[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class32_Sub3_Sub1) local293;
						if (local297) {
							local295 = local48.anInt3757;
							local297 = false;
						} else if (local295 != local48.anInt3757) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt3760 >> Static53.anInt983) + local18 * (float) (local48.anInt3755 >> Static53.anInt983) + local22 * (float) (local48.anInt3756 >> Static53.anInt983) + local26) - arg1.anInt4361;
						if (local75 <= 1600) {
							if (this.anIntArray546[local75] < 64) {
								this.aClass32_Sub3_Sub1ArrayArray2[local75][this.anIntArray546[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray546[local75] == 64) {
										if (this.anInt5614 == 64) {
											break label188;
										}
										this.anIntArray546[local75] += this.anInt5614++ + 1;
									}
									this.aClass32_Sub3_Sub1ArrayArray1[this.anIntArray546[local75] - 64 - 1][this.anIntArray545[this.anIntArray546[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass32_Sub3_8;
					}
					arg0.method3677(local295 >= 0 ? arg0.aClass117_1.method3128(local295) : null);
					this.method4968(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class32_Sub3 local39 = arg1.aClass13_1.aClass32_Sub3_1;
				@Pc(42) Class32_Sub3 local42;
				for (local42 = local39.aClass32_Sub3_8; local42 != local39; local42 = local42.aClass32_Sub3_8) {
					local48 = (Class32_Sub3_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt3760 >> Static53.anInt983) + local18 * (float) (local48.anInt3755 >> Static53.anInt983) + local22 * (float) (local48.anInt3756 >> Static53.anInt983) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray547[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass32_Sub3_8;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt5614 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray546[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray545[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class32_Sub3_Sub1 local149 = (Class32_Sub3_Sub1) local42;
						if (local113) {
							local75 = local149.anInt3757;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt3757) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray547[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray546[local173] < 64) {
								this.aClass32_Sub3_Sub1ArrayArray2[local173][this.anIntArray546[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray546[local173] == 64) {
										if (this.anInt5614 == 64) {
											break label186;
										}
										this.anIntArray546[local173] += this.anInt5614++ + 1;
									}
									this.aClass32_Sub3_Sub1ArrayArray1[this.anIntArray546[local173] - 64 - 1][this.anIntArray545[this.anIntArray546[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass32_Sub3_8;
					}
					arg0.method3677(local75 >= 0 ? arg0.aClass117_1.method3128(local75) : null);
					this.method4968(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method4972(arg0);
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(Lclient!mm;)V")
	private void method4971(@OriginalArg(0) Class55_Sub1 arg0) {
		arg0.method3707();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method3671(false);
		arg0.method3666();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(Lclient!mm;)V")
	private void method4972(@OriginalArg(0) Class55_Sub1 arg0) {
		arg0.method3671(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}
}
