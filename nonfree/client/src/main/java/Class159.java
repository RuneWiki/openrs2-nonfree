import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class159 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!uq;")
	private Interface8 anInterface8_3;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!jm;")
	private Class110 aClass110_4;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!jm;")
	private Class110 aClass110_5;

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!jm;")
	private Class110 aClass110_6;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "[F")
	private final float[] aFloatArray22 = new float[16];

	@OriginalMember(owner = "client!p", name = "c", descriptor = "Lclient!oi;")
	private final Class6_Sub10_Sub2 aClass6_Sub10_Sub2_1 = new Class6_Sub10_Sub2(786336);

	@OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
	private final int[] anIntArray491 = new int[1600];

	@OriginalMember(owner = "client!p", name = "e", descriptor = "I")
	private int anInt4353 = 0;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "[I")
	private final int[] anIntArray490 = new int[8191];

	@OriginalMember(owner = "client!p", name = "g", descriptor = "[[Lclient!ps;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray1 = new Class20_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!p", name = "j", descriptor = "[[Lclient!ps;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray2 = new Class20_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
	private final int[] anIntArray492 = new int[64];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ge;)V")
	public void method4148(@OriginalArg(0) Class81_Sub1 arg0) {
		this.anInterface8_3 = arg0.method1990(24, null, 196584, true);
		this.aClass110_6 = new Class110(arg0, this.anInterface8_3, 5126, 2, 0);
		this.aClass110_5 = new Class110(arg0, this.anInterface8_3, 5126, 3, 8);
		this.aClass110_4 = new Class110(arg0, this.anInterface8_3, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Lclient!ge;)V")
	private void method4149(@OriginalArg(0) Class81_Sub1 arg0) {
		arg0.method1959(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ge;I)V")
	private void method4150(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(2982, this.aFloatArray22, 0);
		@Pc(11) float local11 = this.aFloatArray22[0];
		@Pc(16) float local16 = this.aFloatArray22[4];
		@Pc(21) float local21 = this.aFloatArray22[8];
		@Pc(26) float local26 = this.aFloatArray22[1];
		@Pc(31) float local31 = this.aFloatArray22[5];
		@Pc(36) float local36 = this.aFloatArray22[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass6_Sub10_Sub2_1.anInt4188 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class20_Sub1_Sub1 local113;
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
		@Pc(433) Class20_Sub1_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean156) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray491[local83] > 64 ? 64 : this.anIntArray491[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass20_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt492;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt487 >> Static172.anInt3231;
						local146 = local113.anInt485 >> Static172.anInt3231;
						local152 = local113.anInt494 >> Static172.anInt3231;
						local157 = local113.anInt489 >> Static172.anInt3231;
						this.aClass6_Sub10_Sub2_1.method4026(0.0F);
						this.aClass6_Sub10_Sub2_1.method4026(0.0F);
						this.aClass6_Sub10_Sub2_1.method4026(local140 + local40 * (float) -local157);
						this.aClass6_Sub10_Sub2_1.method4026(local146 + local44 * (float) -local157);
						this.aClass6_Sub10_Sub2_1.method4026(local152 + local48 * (float) -local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
						this.aClass6_Sub10_Sub2_1.method4026(1.0F);
						this.aClass6_Sub10_Sub2_1.method4026(0.0F);
						this.aClass6_Sub10_Sub2_1.method4026(local140 + local52 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4026(local146 + local56 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4026(local152 + local60 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
						this.aClass6_Sub10_Sub2_1.method4026(1.0F);
						this.aClass6_Sub10_Sub2_1.method4026(1.0F);
						this.aClass6_Sub10_Sub2_1.method4026(local140 + local40 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4026(local146 + local44 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4026(local152 + local48 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
						this.aClass6_Sub10_Sub2_1.method4026(0.0F);
						this.aClass6_Sub10_Sub2_1.method4026(1.0F);
						this.aClass6_Sub10_Sub2_1.method4026(local140 + local64 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4026(local146 + local68 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4026(local152 + local72 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
					}
					if (this.anIntArray491[local83] > 64) {
						local104 = this.anIntArray491[local83] - 64 - 1;
						for (local424 = this.anIntArray492[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass20_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt492;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt487 >> Static172.anInt3231;
							local152 = local433.anInt485 >> Static172.anInt3231;
							local472 = local433.anInt494 >> Static172.anInt3231;
							local477 = local433.anInt489 >> Static172.anInt3231;
							this.aClass6_Sub10_Sub2_1.method4026(0.0F);
							this.aClass6_Sub10_Sub2_1.method4026(0.0F);
							this.aClass6_Sub10_Sub2_1.method4026(local146 + local40 * (float) -local477);
							this.aClass6_Sub10_Sub2_1.method4026(local152 + local44 * (float) -local477);
							this.aClass6_Sub10_Sub2_1.method4026(local472 + local48 * (float) -local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
							this.aClass6_Sub10_Sub2_1.method4026(1.0F);
							this.aClass6_Sub10_Sub2_1.method4026(0.0F);
							this.aClass6_Sub10_Sub2_1.method4026(local146 + local52 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4026(local152 + local56 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4026(local472 + local60 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
							this.aClass6_Sub10_Sub2_1.method4026(1.0F);
							this.aClass6_Sub10_Sub2_1.method4026(1.0F);
							this.aClass6_Sub10_Sub2_1.method4026(local146 + local40 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4026(local152 + local44 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4026(local472 + local48 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
							this.aClass6_Sub10_Sub2_1.method4026(0.0F);
							this.aClass6_Sub10_Sub2_1.method4026(1.0F);
							this.aClass6_Sub10_Sub2_1.method4026(local146 + local64 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4026(local152 + local68 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4026(local472 + local72 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray491[local83] > 64 ? 64 : this.anIntArray491[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass20_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt492;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt487 >> Static172.anInt3231;
						local146 = local113.anInt485 >> Static172.anInt3231;
						local152 = local113.anInt494 >> Static172.anInt3231;
						local157 = local113.anInt489 >> Static172.anInt3231;
						this.aClass6_Sub10_Sub2_1.method4027(0.0F);
						this.aClass6_Sub10_Sub2_1.method4027(0.0F);
						this.aClass6_Sub10_Sub2_1.method4027(local140 + local40 * (float) -local157);
						this.aClass6_Sub10_Sub2_1.method4027(local146 + local44 * (float) -local157);
						this.aClass6_Sub10_Sub2_1.method4027(local152 + local48 * (float) -local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
						this.aClass6_Sub10_Sub2_1.method4027(1.0F);
						this.aClass6_Sub10_Sub2_1.method4027(0.0F);
						this.aClass6_Sub10_Sub2_1.method4027(local140 + local52 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4027(local146 + local56 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4027(local152 + local60 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
						this.aClass6_Sub10_Sub2_1.method4027(1.0F);
						this.aClass6_Sub10_Sub2_1.method4027(1.0F);
						this.aClass6_Sub10_Sub2_1.method4027(local140 + local40 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4027(local146 + local44 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4027(local152 + local48 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
						this.aClass6_Sub10_Sub2_1.method4027(0.0F);
						this.aClass6_Sub10_Sub2_1.method4027(1.0F);
						this.aClass6_Sub10_Sub2_1.method4027(local140 + local64 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4027(local146 + local68 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method4027(local152 + local72 * (float) local157);
						this.aClass6_Sub10_Sub2_1.method3968(local121);
						this.aClass6_Sub10_Sub2_1.method3968(local126);
						this.aClass6_Sub10_Sub2_1.method3968(local129);
						this.aClass6_Sub10_Sub2_1.method3968(local134);
					}
					if (this.anIntArray491[local83] > 64) {
						local104 = this.anIntArray491[local83] - 64 - 1;
						for (local424 = this.anIntArray492[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass20_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt492;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt487 >> Static172.anInt3231;
							local152 = local433.anInt485 >> Static172.anInt3231;
							local472 = local433.anInt494 >> Static172.anInt3231;
							local477 = local433.anInt489 >> Static172.anInt3231;
							this.aClass6_Sub10_Sub2_1.method4027(0.0F);
							this.aClass6_Sub10_Sub2_1.method4027(0.0F);
							this.aClass6_Sub10_Sub2_1.method4027(local146 + local40 * (float) -local477);
							this.aClass6_Sub10_Sub2_1.method4027(local152 + local44 * (float) -local477);
							this.aClass6_Sub10_Sub2_1.method4027(local472 + local48 * (float) -local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
							this.aClass6_Sub10_Sub2_1.method4027(1.0F);
							this.aClass6_Sub10_Sub2_1.method4027(0.0F);
							this.aClass6_Sub10_Sub2_1.method4027(local146 + local52 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4027(local152 + local56 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4027(local472 + local60 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
							this.aClass6_Sub10_Sub2_1.method4027(1.0F);
							this.aClass6_Sub10_Sub2_1.method4027(1.0F);
							this.aClass6_Sub10_Sub2_1.method4027(local146 + local40 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4027(local152 + local44 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4027(local472 + local48 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
							this.aClass6_Sub10_Sub2_1.method4027(0.0F);
							this.aClass6_Sub10_Sub2_1.method4027(1.0F);
							this.aClass6_Sub10_Sub2_1.method4027(local146 + local64 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4027(local152 + local68 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method4027(local472 + local72 * (float) local477);
							this.aClass6_Sub10_Sub2_1.method3968(local126);
							this.aClass6_Sub10_Sub2_1.method3968(local129);
							this.aClass6_Sub10_Sub2_1.method3968(local134);
							this.aClass6_Sub10_Sub2_1.method3968(local454);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub10_Sub2_1.anInt4188 == 0) {
			return;
		}
		this.anInterface8_3.method5004(24, this.aClass6_Sub10_Sub2_1.aByteArray67, this.aClass6_Sub10_Sub2_1.anInt4188);
		arg0.method1998(0, this.aClass110_6);
		arg0.method1996(this.aClass110_5);
		arg0.method1950(this.aClass110_4);
		arg0.method1971();
		arg0.method1975(this.aClass6_Sub10_Sub2_1.anInt4188 / 24);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ge;Lclient!he;)V")
	public void method4151(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) Class90 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass72_Sub1_1 == null) {
			return;
		}
		this.method4152(arg0);
		@Pc(14) float local14 = arg0.aClass72_Sub1_1.aFloat27;
		@Pc(18) float local18 = arg0.aClass72_Sub1_1.aFloat26;
		@Pc(22) float local22 = arg0.aClass72_Sub1_1.aFloat29;
		@Pc(26) float local26 = arg0.aClass72_Sub1_1.aFloat23;
		try {
			@Pc(31) int local31;
			@Pc(48) Class20_Sub1_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean176) {
				local31 = arg1.anInt2095 - arg1.anInt2096;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class20_Sub1 local290 = arg1.aClass59_1.aClass20_Sub1_7;
				@Pc(293) Class20_Sub1 local293 = local290.aClass20_Sub1_5;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt4353 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray491[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray492[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class20_Sub1_Sub1) local293;
						if (local297) {
							local295 = local48.anInt488;
							local297 = false;
						} else if (local295 != local48.anInt488) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt487 >> Static172.anInt3231) + local18 * (float) (local48.anInt485 >> Static172.anInt3231) + local22 * (float) (local48.anInt494 >> Static172.anInt3231) + local26) - arg1.anInt2096;
						if (local75 <= 1600) {
							if (this.anIntArray491[local75] < 64) {
								this.aClass20_Sub1_Sub1ArrayArray1[local75][this.anIntArray491[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray491[local75] == 64) {
										if (this.anInt4353 == 64) {
											break label188;
										}
										this.anIntArray491[local75] += this.anInt4353++ + 1;
									}
									this.aClass20_Sub1_Sub1ArrayArray2[this.anIntArray491[local75] - 64 - 1][this.anIntArray492[this.anIntArray491[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass20_Sub1_5;
					}
					arg0.method2022(local295 >= 0 ? arg0.aClass217_1.method5732(local295) : null);
					this.method4150(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class20_Sub1 local39 = arg1.aClass59_1.aClass20_Sub1_7;
				@Pc(42) Class20_Sub1 local42;
				for (local42 = local39.aClass20_Sub1_5; local42 != local39; local42 = local42.aClass20_Sub1_5) {
					local48 = (Class20_Sub1_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt487 >> Static172.anInt3231) + local18 * (float) (local48.anInt485 >> Static172.anInt3231) + local22 * (float) (local48.anInt494 >> Static172.anInt3231) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray490[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass20_Sub1_5;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt4353 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray491[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray492[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class20_Sub1_Sub1 local149 = (Class20_Sub1_Sub1) local42;
						if (local113) {
							local75 = local149.anInt488;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt488) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray490[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray491[local173] < 64) {
								this.aClass20_Sub1_Sub1ArrayArray1[local173][this.anIntArray491[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray491[local173] == 64) {
										if (this.anInt4353 == 64) {
											break label186;
										}
										this.anIntArray491[local173] += this.anInt4353++ + 1;
									}
									this.aClass20_Sub1_Sub1ArrayArray2[this.anIntArray491[local173] - 64 - 1][this.anIntArray492[this.anIntArray491[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass20_Sub1_5;
					}
					arg0.method2022(local75 >= 0 ? arg0.aClass217_1.method5732(local75) : null);
					this.method4150(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method4149(arg0);
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(Lclient!ge;)V")
	private void method4152(@OriginalArg(0) Class81_Sub1 arg0) {
		arg0.method1982();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method1959(false);
		arg0.method1993();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
