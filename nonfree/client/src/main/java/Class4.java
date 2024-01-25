import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!q;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!qb;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!q;")
	private Class160 aClass160_2;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!q;")
	private Class160 aClass160_3;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "[F")
	private final float[] aFloatArray1 = new float[16];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!to;")
	private final Class11_Sub25_Sub2 aClass11_Sub25_Sub2_1 = new Class11_Sub25_Sub2(786336);

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "[[Lclient!ua;")
	private final Class10_Sub3_Sub1[][] aClass10_Sub3_Sub1ArrayArray1 = new Class10_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[[Lclient!ua;")
	private final Class10_Sub3_Sub1[][] aClass10_Sub3_Sub1ArrayArray2 = new Class10_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "[I")
	private final int[] anIntArray2 = new int[64];

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "[I")
	private final int[] anIntArray1 = new int[8191];

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt15 = 0;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "[I")
	private final int[] anIntArray3 = new int[1600];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!tb;)V")
	private void method9(@OriginalArg(0) Class129_Sub2 arg0) {
		arg0.method5044(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!tb;I)V")
	private void method10(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray1, 0);
		@Pc(11) float local11 = this.aFloatArray1[0];
		@Pc(16) float local16 = this.aFloatArray1[4];
		@Pc(21) float local21 = this.aFloatArray1[8];
		@Pc(26) float local26 = this.aFloatArray1[1];
		@Pc(31) float local31 = this.aFloatArray1[5];
		@Pc(36) float local36 = this.aFloatArray1[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass11_Sub25_Sub2_1.anInt6076 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class10_Sub3_Sub1 local113;
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
		@Pc(433) Class10_Sub3_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean377) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray3[local83] > 64 ? 64 : this.anIntArray3[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass10_Sub3_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt2113;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2111 >> Static6.anInt4020;
						local146 = local113.anInt2110 >> Static6.anInt4020;
						local152 = local113.anInt2119 >> Static6.anInt4020;
						local157 = local113.anInt2117 >> Static6.anInt4020;
						this.aClass11_Sub25_Sub2_1.method5228(0.0F);
						this.aClass11_Sub25_Sub2_1.method5228(0.0F);
						this.aClass11_Sub25_Sub2_1.method5228(local140 + local40 * (float) -local157);
						this.aClass11_Sub25_Sub2_1.method5228(local146 + local44 * (float) -local157);
						this.aClass11_Sub25_Sub2_1.method5228(local152 + local48 * (float) -local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
						this.aClass11_Sub25_Sub2_1.method5228(1.0F);
						this.aClass11_Sub25_Sub2_1.method5228(0.0F);
						this.aClass11_Sub25_Sub2_1.method5228(local140 + local52 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5228(local146 + local56 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5228(local152 + local60 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
						this.aClass11_Sub25_Sub2_1.method5228(1.0F);
						this.aClass11_Sub25_Sub2_1.method5228(1.0F);
						this.aClass11_Sub25_Sub2_1.method5228(local140 + local40 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5228(local146 + local44 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5228(local152 + local48 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
						this.aClass11_Sub25_Sub2_1.method5228(0.0F);
						this.aClass11_Sub25_Sub2_1.method5228(1.0F);
						this.aClass11_Sub25_Sub2_1.method5228(local140 + local64 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5228(local146 + local68 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5228(local152 + local72 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
					}
					if (this.anIntArray3[local83] > 64) {
						local104 = this.anIntArray3[local83] - 64 - 1;
						for (local424 = this.anIntArray2[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass10_Sub3_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt2113;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2111 >> Static6.anInt4020;
							local152 = local433.anInt2110 >> Static6.anInt4020;
							local472 = local433.anInt2119 >> Static6.anInt4020;
							local477 = local433.anInt2117 >> Static6.anInt4020;
							this.aClass11_Sub25_Sub2_1.method5228(0.0F);
							this.aClass11_Sub25_Sub2_1.method5228(0.0F);
							this.aClass11_Sub25_Sub2_1.method5228(local146 + local40 * (float) -local477);
							this.aClass11_Sub25_Sub2_1.method5228(local152 + local44 * (float) -local477);
							this.aClass11_Sub25_Sub2_1.method5228(local472 + local48 * (float) -local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
							this.aClass11_Sub25_Sub2_1.method5228(1.0F);
							this.aClass11_Sub25_Sub2_1.method5228(0.0F);
							this.aClass11_Sub25_Sub2_1.method5228(local146 + local52 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5228(local152 + local56 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5228(local472 + local60 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
							this.aClass11_Sub25_Sub2_1.method5228(1.0F);
							this.aClass11_Sub25_Sub2_1.method5228(1.0F);
							this.aClass11_Sub25_Sub2_1.method5228(local146 + local40 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5228(local152 + local44 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5228(local472 + local48 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
							this.aClass11_Sub25_Sub2_1.method5228(0.0F);
							this.aClass11_Sub25_Sub2_1.method5228(1.0F);
							this.aClass11_Sub25_Sub2_1.method5228(local146 + local64 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5228(local152 + local68 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5228(local472 + local72 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray3[local83] > 64 ? 64 : this.anIntArray3[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass10_Sub3_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt2113;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2111 >> Static6.anInt4020;
						local146 = local113.anInt2110 >> Static6.anInt4020;
						local152 = local113.anInt2119 >> Static6.anInt4020;
						local157 = local113.anInt2117 >> Static6.anInt4020;
						this.aClass11_Sub25_Sub2_1.method5229(0.0F);
						this.aClass11_Sub25_Sub2_1.method5229(0.0F);
						this.aClass11_Sub25_Sub2_1.method5229(local140 + local40 * (float) -local157);
						this.aClass11_Sub25_Sub2_1.method5229(local146 + local44 * (float) -local157);
						this.aClass11_Sub25_Sub2_1.method5229(local152 + local48 * (float) -local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
						this.aClass11_Sub25_Sub2_1.method5229(1.0F);
						this.aClass11_Sub25_Sub2_1.method5229(0.0F);
						this.aClass11_Sub25_Sub2_1.method5229(local140 + local52 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5229(local146 + local56 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5229(local152 + local60 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
						this.aClass11_Sub25_Sub2_1.method5229(1.0F);
						this.aClass11_Sub25_Sub2_1.method5229(1.0F);
						this.aClass11_Sub25_Sub2_1.method5229(local140 + local40 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5229(local146 + local44 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5229(local152 + local48 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
						this.aClass11_Sub25_Sub2_1.method5229(0.0F);
						this.aClass11_Sub25_Sub2_1.method5229(1.0F);
						this.aClass11_Sub25_Sub2_1.method5229(local140 + local64 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5229(local146 + local68 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5229(local152 + local72 * (float) local157);
						this.aClass11_Sub25_Sub2_1.method5186(local121);
						this.aClass11_Sub25_Sub2_1.method5186(local126);
						this.aClass11_Sub25_Sub2_1.method5186(local129);
						this.aClass11_Sub25_Sub2_1.method5186(local134);
					}
					if (this.anIntArray3[local83] > 64) {
						local104 = this.anIntArray3[local83] - 64 - 1;
						for (local424 = this.anIntArray2[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass10_Sub3_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt2113;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2111 >> Static6.anInt4020;
							local152 = local433.anInt2110 >> Static6.anInt4020;
							local472 = local433.anInt2119 >> Static6.anInt4020;
							local477 = local433.anInt2117 >> Static6.anInt4020;
							this.aClass11_Sub25_Sub2_1.method5229(0.0F);
							this.aClass11_Sub25_Sub2_1.method5229(0.0F);
							this.aClass11_Sub25_Sub2_1.method5229(local146 + local40 * (float) -local477);
							this.aClass11_Sub25_Sub2_1.method5229(local152 + local44 * (float) -local477);
							this.aClass11_Sub25_Sub2_1.method5229(local472 + local48 * (float) -local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
							this.aClass11_Sub25_Sub2_1.method5229(1.0F);
							this.aClass11_Sub25_Sub2_1.method5229(0.0F);
							this.aClass11_Sub25_Sub2_1.method5229(local146 + local52 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5229(local152 + local56 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5229(local472 + local60 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
							this.aClass11_Sub25_Sub2_1.method5229(1.0F);
							this.aClass11_Sub25_Sub2_1.method5229(1.0F);
							this.aClass11_Sub25_Sub2_1.method5229(local146 + local40 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5229(local152 + local44 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5229(local472 + local48 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
							this.aClass11_Sub25_Sub2_1.method5229(0.0F);
							this.aClass11_Sub25_Sub2_1.method5229(1.0F);
							this.aClass11_Sub25_Sub2_1.method5229(local146 + local64 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5229(local152 + local68 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5229(local472 + local72 * (float) local477);
							this.aClass11_Sub25_Sub2_1.method5186(local126);
							this.aClass11_Sub25_Sub2_1.method5186(local129);
							this.aClass11_Sub25_Sub2_1.method5186(local134);
							this.aClass11_Sub25_Sub2_1.method5186(local454);
						}
					}
				}
			}
		}
		if (this.aClass11_Sub25_Sub2_1.anInt6076 != 0) {
			this.anInterface6_1.method1924(24, this.aClass11_Sub25_Sub2_1.aByteArray93, this.aClass11_Sub25_Sub2_1.anInt6076);
			arg0.method5038(this.aClass160_3, null, this.aClass160_1, this.aClass160_2);
			arg0.method5029(this.aClass11_Sub25_Sub2_1.anInt6076 / 24);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!tb;Lclient!mr;)V")
	public void method11(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class136 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass61_Sub2_2 == null) {
			return;
		}
		this.method12(arg0);
		@Pc(14) float local14 = arg0.aClass61_Sub2_2.aFloat43;
		@Pc(18) float local18 = arg0.aClass61_Sub2_2.aFloat42;
		@Pc(22) float local22 = arg0.aClass61_Sub2_2.aFloat33;
		@Pc(26) float local26 = arg0.aClass61_Sub2_2.aFloat37;
		try {
			@Pc(31) int local31;
			@Pc(48) Class10_Sub3_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean261) {
				local31 = arg1.anInt4038 - arg1.anInt4040;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class10_Sub3 local290 = arg1.aClass104_1.aClass10_Sub3_7;
				@Pc(293) Class10_Sub3 local293 = local290.aClass10_Sub3_6;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt15 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray3[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray2[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class10_Sub3_Sub1) local293;
						if (local297) {
							local295 = local48.anInt2115;
							local297 = false;
						} else if (local295 != local48.anInt2115) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt2111 >> Static6.anInt4020) + local18 * (float) (local48.anInt2110 >> Static6.anInt4020) + local22 * (float) (local48.anInt2119 >> Static6.anInt4020) + local26) - arg1.anInt4040;
						if (local75 <= 1600) {
							if (this.anIntArray3[local75] < 64) {
								this.aClass10_Sub3_Sub1ArrayArray2[local75][this.anIntArray3[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray3[local75] == 64) {
										if (this.anInt15 == 64) {
											break label188;
										}
										this.anIntArray3[local75] += this.anInt15++ + 1;
									}
									this.aClass10_Sub3_Sub1ArrayArray1[this.anIntArray3[local75] - 64 - 1][this.anIntArray2[this.anIntArray3[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass10_Sub3_6;
					}
					arg0.method5084(local295 >= 0 ? arg0.aClass207_1.method5501(local295) : null);
					this.method10(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class10_Sub3 local39 = arg1.aClass104_1.aClass10_Sub3_7;
				@Pc(42) Class10_Sub3 local42;
				for (local42 = local39.aClass10_Sub3_6; local42 != local39; local42 = local42.aClass10_Sub3_6) {
					local48 = (Class10_Sub3_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt2111 >> Static6.anInt4020) + local18 * (float) (local48.anInt2110 >> Static6.anInt4020) + local22 * (float) (local48.anInt2119 >> Static6.anInt4020) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray1[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass10_Sub3_6;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt15 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray3[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray2[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class10_Sub3_Sub1 local149 = (Class10_Sub3_Sub1) local42;
						if (local113) {
							local75 = local149.anInt2115;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt2115) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray1[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray3[local173] < 64) {
								this.aClass10_Sub3_Sub1ArrayArray2[local173][this.anIntArray3[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray3[local173] == 64) {
										if (this.anInt15 == 64) {
											break label186;
										}
										this.anIntArray3[local173] += this.anInt15++ + 1;
									}
									this.aClass10_Sub3_Sub1ArrayArray1[this.anIntArray3[local173] - 64 - 1][this.anIntArray2[this.anIntArray3[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass10_Sub3_6;
					}
					arg0.method5084(local75 >= 0 ? arg0.aClass207_1.method5501(local75) : null);
					this.method10(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method9(arg0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!tb;)V")
	private void method12(@OriginalArg(0) Class129_Sub2 arg0) {
		arg0.method5053();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method5044(false);
		arg0.method5041();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lclient!tb;)V")
	public void method13(@OriginalArg(0) Class129_Sub2 arg0) {
		this.anInterface6_1 = arg0.method5079(24, null, 196584, true);
		this.aClass160_2 = new Class160(arg0, this.anInterface6_1, 5126, 2, 0);
		this.aClass160_3 = new Class160(arg0, this.anInterface6_1, 5126, 3, 8);
		this.aClass160_1 = new Class160(arg0, this.anInterface6_1, 5121, 4, 20);
	}
}
