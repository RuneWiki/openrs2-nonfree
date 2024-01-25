import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class35 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "Lclient!fm;")
	private Class72 aClass72_3;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "Lclient!fm;")
	private Class72 aClass72_4;

	@OriginalMember(owner = "client!cm", name = "k", descriptor = "Lclient!pc;")
	private Interface6 anInterface6_2;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "Lclient!fm;")
	private Class72 aClass72_5;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "[F")
	private final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "Lclient!fi;")
	private final Class2_Sub16_Sub1 aClass2_Sub16_Sub1_2 = new Class2_Sub16_Sub1(786336);

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "[[Lclient!vm;")
	private final Class10_Sub8_Sub1[][] aClass10_Sub8_Sub1ArrayArray1 = new Class10_Sub8_Sub1[1600][64];

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "[[Lclient!vm;")
	private final Class10_Sub8_Sub1[][] aClass10_Sub8_Sub1ArrayArray2 = new Class10_Sub8_Sub1[64][768];

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "[I")
	private final int[] anIntArray188 = new int[1600];

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "[I")
	private final int[] anIntArray187 = new int[64];

	@OriginalMember(owner = "client!cm", name = "m", descriptor = "[I")
	private final int[] anIntArray189 = new int[8191];

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
	private int anInt950 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fu;I)V")
	private void method789(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray4, 0);
		@Pc(11) float local11 = this.aFloatArray4[0];
		@Pc(16) float local16 = this.aFloatArray4[4];
		@Pc(21) float local21 = this.aFloatArray4[8];
		@Pc(26) float local26 = this.aFloatArray4[1];
		@Pc(31) float local31 = this.aFloatArray4[5];
		@Pc(36) float local36 = this.aFloatArray4[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass2_Sub16_Sub1_2.anInt6145 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class10_Sub8_Sub1 local113;
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
		@Pc(433) Class10_Sub8_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean153) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray188[local83] > 64 ? 64 : this.anIntArray188[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass10_Sub8_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt5301;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt5294 >> Static168.anInt3227;
						local146 = local113.anInt5295 >> Static168.anInt3227;
						local152 = local113.anInt5296 >> Static168.anInt3227;
						local157 = local113.anInt5302 >> Static168.anInt3227;
						this.aClass2_Sub16_Sub1_2.method1835(0.0F);
						this.aClass2_Sub16_Sub1_2.method1835(0.0F);
						this.aClass2_Sub16_Sub1_2.method1835(local140 + local40 * (float) -local157);
						this.aClass2_Sub16_Sub1_2.method1835(local146 + local44 * (float) -local157);
						this.aClass2_Sub16_Sub1_2.method1835(local152 + local48 * (float) -local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
						this.aClass2_Sub16_Sub1_2.method1835(1.0F);
						this.aClass2_Sub16_Sub1_2.method1835(0.0F);
						this.aClass2_Sub16_Sub1_2.method1835(local140 + local52 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1835(local146 + local56 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1835(local152 + local60 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
						this.aClass2_Sub16_Sub1_2.method1835(1.0F);
						this.aClass2_Sub16_Sub1_2.method1835(1.0F);
						this.aClass2_Sub16_Sub1_2.method1835(local140 + local40 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1835(local146 + local44 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1835(local152 + local48 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
						this.aClass2_Sub16_Sub1_2.method1835(0.0F);
						this.aClass2_Sub16_Sub1_2.method1835(1.0F);
						this.aClass2_Sub16_Sub1_2.method1835(local140 + local64 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1835(local146 + local68 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1835(local152 + local72 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
					}
					if (this.anIntArray188[local83] > 64) {
						local104 = this.anIntArray188[local83] - 64 - 1;
						for (local424 = this.anIntArray187[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass10_Sub8_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt5301;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt5294 >> Static168.anInt3227;
							local152 = local433.anInt5295 >> Static168.anInt3227;
							local472 = local433.anInt5296 >> Static168.anInt3227;
							local477 = local433.anInt5302 >> Static168.anInt3227;
							this.aClass2_Sub16_Sub1_2.method1835(0.0F);
							this.aClass2_Sub16_Sub1_2.method1835(0.0F);
							this.aClass2_Sub16_Sub1_2.method1835(local146 + local40 * (float) -local477);
							this.aClass2_Sub16_Sub1_2.method1835(local152 + local44 * (float) -local477);
							this.aClass2_Sub16_Sub1_2.method1835(local472 + local48 * (float) -local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
							this.aClass2_Sub16_Sub1_2.method1835(1.0F);
							this.aClass2_Sub16_Sub1_2.method1835(0.0F);
							this.aClass2_Sub16_Sub1_2.method1835(local146 + local52 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1835(local152 + local56 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1835(local472 + local60 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
							this.aClass2_Sub16_Sub1_2.method1835(1.0F);
							this.aClass2_Sub16_Sub1_2.method1835(1.0F);
							this.aClass2_Sub16_Sub1_2.method1835(local146 + local40 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1835(local152 + local44 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1835(local472 + local48 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
							this.aClass2_Sub16_Sub1_2.method1835(0.0F);
							this.aClass2_Sub16_Sub1_2.method1835(1.0F);
							this.aClass2_Sub16_Sub1_2.method1835(local146 + local64 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1835(local152 + local68 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1835(local472 + local72 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray188[local83] > 64 ? 64 : this.anIntArray188[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass10_Sub8_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt5301;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt5294 >> Static168.anInt3227;
						local146 = local113.anInt5295 >> Static168.anInt3227;
						local152 = local113.anInt5296 >> Static168.anInt3227;
						local157 = local113.anInt5302 >> Static168.anInt3227;
						this.aClass2_Sub16_Sub1_2.method1836(0.0F);
						this.aClass2_Sub16_Sub1_2.method1836(0.0F);
						this.aClass2_Sub16_Sub1_2.method1836(local140 + local40 * (float) -local157);
						this.aClass2_Sub16_Sub1_2.method1836(local146 + local44 * (float) -local157);
						this.aClass2_Sub16_Sub1_2.method1836(local152 + local48 * (float) -local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
						this.aClass2_Sub16_Sub1_2.method1836(1.0F);
						this.aClass2_Sub16_Sub1_2.method1836(0.0F);
						this.aClass2_Sub16_Sub1_2.method1836(local140 + local52 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1836(local146 + local56 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1836(local152 + local60 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
						this.aClass2_Sub16_Sub1_2.method1836(1.0F);
						this.aClass2_Sub16_Sub1_2.method1836(1.0F);
						this.aClass2_Sub16_Sub1_2.method1836(local140 + local40 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1836(local146 + local44 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1836(local152 + local48 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
						this.aClass2_Sub16_Sub1_2.method1836(0.0F);
						this.aClass2_Sub16_Sub1_2.method1836(1.0F);
						this.aClass2_Sub16_Sub1_2.method1836(local140 + local64 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1836(local146 + local68 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method1836(local152 + local72 * (float) local157);
						this.aClass2_Sub16_Sub1_2.method5358(local121);
						this.aClass2_Sub16_Sub1_2.method5358(local126);
						this.aClass2_Sub16_Sub1_2.method5358(local129);
						this.aClass2_Sub16_Sub1_2.method5358(local134);
					}
					if (this.anIntArray188[local83] > 64) {
						local104 = this.anIntArray188[local83] - 64 - 1;
						for (local424 = this.anIntArray187[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass10_Sub8_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt5301;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt5294 >> Static168.anInt3227;
							local152 = local433.anInt5295 >> Static168.anInt3227;
							local472 = local433.anInt5296 >> Static168.anInt3227;
							local477 = local433.anInt5302 >> Static168.anInt3227;
							this.aClass2_Sub16_Sub1_2.method1836(0.0F);
							this.aClass2_Sub16_Sub1_2.method1836(0.0F);
							this.aClass2_Sub16_Sub1_2.method1836(local146 + local40 * (float) -local477);
							this.aClass2_Sub16_Sub1_2.method1836(local152 + local44 * (float) -local477);
							this.aClass2_Sub16_Sub1_2.method1836(local472 + local48 * (float) -local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
							this.aClass2_Sub16_Sub1_2.method1836(1.0F);
							this.aClass2_Sub16_Sub1_2.method1836(0.0F);
							this.aClass2_Sub16_Sub1_2.method1836(local146 + local52 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1836(local152 + local56 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1836(local472 + local60 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
							this.aClass2_Sub16_Sub1_2.method1836(1.0F);
							this.aClass2_Sub16_Sub1_2.method1836(1.0F);
							this.aClass2_Sub16_Sub1_2.method1836(local146 + local40 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1836(local152 + local44 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1836(local472 + local48 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
							this.aClass2_Sub16_Sub1_2.method1836(0.0F);
							this.aClass2_Sub16_Sub1_2.method1836(1.0F);
							this.aClass2_Sub16_Sub1_2.method1836(local146 + local64 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1836(local152 + local68 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method1836(local472 + local72 * (float) local477);
							this.aClass2_Sub16_Sub1_2.method5358(local126);
							this.aClass2_Sub16_Sub1_2.method5358(local129);
							this.aClass2_Sub16_Sub1_2.method5358(local134);
							this.aClass2_Sub16_Sub1_2.method5358(local454);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub16_Sub1_2.anInt6145 != 0) {
			this.anInterface6_2.method3368(24, this.aClass2_Sub16_Sub1_2.aByteArray112, this.aClass2_Sub16_Sub1_2.anInt6145);
			arg0.method2114(this.aClass72_3, null, this.aClass72_5, this.aClass72_4);
			arg0.method2133(this.aClass2_Sub16_Sub1_2.anInt6145 / 24);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fu;)V")
	public void method790(@OriginalArg(0) Class63_Sub2 arg0) {
		this.anInterface6_2 = arg0.method2112(24, null, 196584, true);
		this.aClass72_4 = new Class72(arg0, this.anInterface6_2, 5126, 2, 0);
		this.aClass72_3 = new Class72(arg0, this.anInterface6_2, 5126, 3, 8);
		this.aClass72_5 = new Class72(arg0, this.anInterface6_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Lclient!fu;)V")
	private void method791(@OriginalArg(0) Class63_Sub2 arg0) {
		arg0.method2065();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method2103(false);
		arg0.method2089();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!fu;Lclient!pa;)V")
	public void method792(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class186 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass44_Sub2_1 == null) {
			return;
		}
		this.method791(arg0);
		@Pc(14) float local14 = arg0.aClass44_Sub2_1.aFloat63;
		@Pc(18) float local18 = arg0.aClass44_Sub2_1.aFloat61;
		@Pc(22) float local22 = arg0.aClass44_Sub2_1.aFloat58;
		@Pc(26) float local26 = arg0.aClass44_Sub2_1.aFloat67;
		try {
			@Pc(31) int local31;
			@Pc(48) Class10_Sub8_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean338) {
				local31 = arg1.anInt4524 - arg1.anInt4523;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class10_Sub8 local290 = arg1.aClass148_1.aClass10_Sub8_1;
				@Pc(293) Class10_Sub8 local293 = local290.aClass10_Sub8_8;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt950 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray188[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray187[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class10_Sub8_Sub1) local293;
						if (local297) {
							local295 = local48.anInt5303;
							local297 = false;
						} else if (local295 != local48.anInt5303) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt5294 >> Static168.anInt3227) + local18 * (float) (local48.anInt5295 >> Static168.anInt3227) + local22 * (float) (local48.anInt5296 >> Static168.anInt3227) + local26) - arg1.anInt4523;
						if (local75 <= 1600) {
							if (this.anIntArray188[local75] < 64) {
								this.aClass10_Sub8_Sub1ArrayArray1[local75][this.anIntArray188[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray188[local75] == 64) {
										if (this.anInt950 == 64) {
											break label188;
										}
										this.anIntArray188[local75] += this.anInt950++ + 1;
									}
									this.aClass10_Sub8_Sub1ArrayArray2[this.anIntArray188[local75] - 64 - 1][this.anIntArray187[this.anIntArray188[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass10_Sub8_8;
					}
					arg0.method2068(local295 >= 0 ? arg0.aClass218_1.method4664(local295) : null);
					this.method789(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class10_Sub8 local39 = arg1.aClass148_1.aClass10_Sub8_1;
				@Pc(42) Class10_Sub8 local42;
				for (local42 = local39.aClass10_Sub8_8; local42 != local39; local42 = local42.aClass10_Sub8_8) {
					local48 = (Class10_Sub8_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt5294 >> Static168.anInt3227) + local18 * (float) (local48.anInt5295 >> Static168.anInt3227) + local22 * (float) (local48.anInt5296 >> Static168.anInt3227) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray189[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass10_Sub8_8;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt950 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray188[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray187[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class10_Sub8_Sub1 local149 = (Class10_Sub8_Sub1) local42;
						if (local113) {
							local75 = local149.anInt5303;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt5303) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray189[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray188[local173] < 64) {
								this.aClass10_Sub8_Sub1ArrayArray1[local173][this.anIntArray188[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray188[local173] == 64) {
										if (this.anInt950 == 64) {
											break label186;
										}
										this.anIntArray188[local173] += this.anInt950++ + 1;
									}
									this.aClass10_Sub8_Sub1ArrayArray2[this.anIntArray188[local173] - 64 - 1][this.anIntArray187[this.anIntArray188[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass10_Sub8_8;
					}
					arg0.method2068(local75 >= 0 ? arg0.aClass218_1.method4664(local75) : null);
					this.method789(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method793(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(Lclient!fu;)V")
	private void method793(@OriginalArg(0) Class63_Sub2 arg0) {
		arg0.method2103(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}
}
