import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class68 {

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "Lclient!va;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!ig;")
	private Class91 aClass91_6;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "Lclient!ig;")
	private Class91 aClass91_7;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "Lclient!ig;")
	private Class91 aClass91_8;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "[F")
	private final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "Lclient!qd;")
	private final Class1_Sub8_Sub2 aClass1_Sub8_Sub2_1 = new Class1_Sub8_Sub2(786336);

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
	private int anInt2113 = 0;

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "[I")
	private final int[] anIntArray204 = new int[64];

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "[[Lclient!bp;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray1 = new Class8_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "[I")
	private final int[] anIntArray206 = new int[8191];

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[[Lclient!bp;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray2 = new Class8_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "[I")
	private final int[] anIntArray205 = new int[1600];

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!h;)V")
	public void method1836(@OriginalArg(0) Class32_Sub2 arg0) {
		this.anInterface8_2 = arg0.method2305(24, null, 196584, true);
		this.aClass91_8 = new Class91(arg0, this.anInterface8_2, 5126, 2, 0);
		this.aClass91_6 = new Class91(arg0, this.anInterface8_2, 5126, 3, 8);
		this.aClass91_7 = new Class91(arg0, this.anInterface8_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!h;Lclient!sk;)V")
	public void method1837(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) Class191 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass109_Sub2_1 == null) {
			return;
		}
		this.method1839(arg0);
		@Pc(14) float local14 = arg0.aClass109_Sub2_1.aFloat62;
		@Pc(18) float local18 = arg0.aClass109_Sub2_1.aFloat58;
		@Pc(22) float local22 = arg0.aClass109_Sub2_1.aFloat56;
		@Pc(26) float local26 = arg0.aClass109_Sub2_1.aFloat57;
		try {
			@Pc(31) int local31;
			@Pc(48) Class8_Sub2_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean554) {
				local31 = arg1.anInt5766 - arg1.anInt5767;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class8_Sub2 local290 = arg1.aClass130_1.aClass8_Sub2_7;
				@Pc(293) Class8_Sub2 local293 = local290.aClass8_Sub2_5;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt2113 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray205[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray204[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class8_Sub2_Sub1) local293;
						if (local297) {
							local295 = local48.anInt1225;
							local297 = false;
						} else if (local295 != local48.anInt1225) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt1227 >> Static231.anInt4760) + local18 * (float) (local48.anInt1226 >> Static231.anInt4760) + local22 * (float) (local48.anInt1223 >> Static231.anInt4760) + local26) - arg1.anInt5767;
						if (local75 <= 1600) {
							if (this.anIntArray205[local75] < 64) {
								this.aClass8_Sub2_Sub1ArrayArray2[local75][this.anIntArray205[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray205[local75] == 64) {
										if (this.anInt2113 == 64) {
											break label188;
										}
										this.anIntArray205[local75] += this.anInt2113++ + 1;
									}
									this.aClass8_Sub2_Sub1ArrayArray1[this.anIntArray205[local75] - 64 - 1][this.anIntArray204[this.anIntArray205[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass8_Sub2_5;
					}
					arg0.method2287(local295 >= 0 ? arg0.aClass6_1.method198(local295) : null);
					this.method1838(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class8_Sub2 local39 = arg1.aClass130_1.aClass8_Sub2_7;
				@Pc(42) Class8_Sub2 local42;
				for (local42 = local39.aClass8_Sub2_5; local42 != local39; local42 = local42.aClass8_Sub2_5) {
					local48 = (Class8_Sub2_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt1227 >> Static231.anInt4760) + local18 * (float) (local48.anInt1226 >> Static231.anInt4760) + local22 * (float) (local48.anInt1223 >> Static231.anInt4760) + local26);
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
				local42 = local39.aClass8_Sub2_5;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt2113 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray205[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray204[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class8_Sub2_Sub1 local149 = (Class8_Sub2_Sub1) local42;
						if (local113) {
							local75 = local149.anInt1225;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt1225) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray206[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray205[local173] < 64) {
								this.aClass8_Sub2_Sub1ArrayArray2[local173][this.anIntArray205[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray205[local173] == 64) {
										if (this.anInt2113 == 64) {
											break label186;
										}
										this.anIntArray205[local173] += this.anInt2113++ + 1;
									}
									this.aClass8_Sub2_Sub1ArrayArray1[this.anIntArray205[local173] - 64 - 1][this.anIntArray204[this.anIntArray205[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass8_Sub2_5;
					}
					arg0.method2287(local75 >= 0 ? arg0.aClass6_1.method198(local75) : null);
					this.method1838(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method1840(arg0);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!h;I)V")
	private void method1838(@OriginalArg(0) Class32_Sub2 arg0, @OriginalArg(1) int arg1) {
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
		this.aClass1_Sub8_Sub2_1.anInt5182 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class8_Sub2_Sub1 local113;
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
		@Pc(433) Class8_Sub2_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean240) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray205[local83] > 64 ? 64 : this.anIntArray205[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass8_Sub2_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt1221;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt1227 >> Static231.anInt4760;
						local146 = local113.anInt1226 >> Static231.anInt4760;
						local152 = local113.anInt1223 >> Static231.anInt4760;
						local157 = local113.anInt1220 >> Static231.anInt4760;
						this.aClass1_Sub8_Sub2_1.method4567(0.0F);
						this.aClass1_Sub8_Sub2_1.method4567(0.0F);
						this.aClass1_Sub8_Sub2_1.method4567(local140 + local40 * (float) -local157);
						this.aClass1_Sub8_Sub2_1.method4567(local146 + local44 * (float) -local157);
						this.aClass1_Sub8_Sub2_1.method4567(local152 + local48 * (float) -local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
						this.aClass1_Sub8_Sub2_1.method4567(1.0F);
						this.aClass1_Sub8_Sub2_1.method4567(0.0F);
						this.aClass1_Sub8_Sub2_1.method4567(local140 + local52 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4567(local146 + local56 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4567(local152 + local60 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
						this.aClass1_Sub8_Sub2_1.method4567(1.0F);
						this.aClass1_Sub8_Sub2_1.method4567(1.0F);
						this.aClass1_Sub8_Sub2_1.method4567(local140 + local40 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4567(local146 + local44 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4567(local152 + local48 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
						this.aClass1_Sub8_Sub2_1.method4567(0.0F);
						this.aClass1_Sub8_Sub2_1.method4567(1.0F);
						this.aClass1_Sub8_Sub2_1.method4567(local140 + local64 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4567(local146 + local68 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4567(local152 + local72 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
					}
					if (this.anIntArray205[local83] > 64) {
						local104 = this.anIntArray205[local83] - 64 - 1;
						for (local424 = this.anIntArray204[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass8_Sub2_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt1221;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt1227 >> Static231.anInt4760;
							local152 = local433.anInt1226 >> Static231.anInt4760;
							local472 = local433.anInt1223 >> Static231.anInt4760;
							local477 = local433.anInt1220 >> Static231.anInt4760;
							this.aClass1_Sub8_Sub2_1.method4567(0.0F);
							this.aClass1_Sub8_Sub2_1.method4567(0.0F);
							this.aClass1_Sub8_Sub2_1.method4567(local146 + local40 * (float) -local477);
							this.aClass1_Sub8_Sub2_1.method4567(local152 + local44 * (float) -local477);
							this.aClass1_Sub8_Sub2_1.method4567(local472 + local48 * (float) -local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
							this.aClass1_Sub8_Sub2_1.method4567(1.0F);
							this.aClass1_Sub8_Sub2_1.method4567(0.0F);
							this.aClass1_Sub8_Sub2_1.method4567(local146 + local52 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4567(local152 + local56 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4567(local472 + local60 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
							this.aClass1_Sub8_Sub2_1.method4567(1.0F);
							this.aClass1_Sub8_Sub2_1.method4567(1.0F);
							this.aClass1_Sub8_Sub2_1.method4567(local146 + local40 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4567(local152 + local44 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4567(local472 + local48 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
							this.aClass1_Sub8_Sub2_1.method4567(0.0F);
							this.aClass1_Sub8_Sub2_1.method4567(1.0F);
							this.aClass1_Sub8_Sub2_1.method4567(local146 + local64 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4567(local152 + local68 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4567(local472 + local72 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray205[local83] > 64 ? 64 : this.anIntArray205[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass8_Sub2_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt1221;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt1227 >> Static231.anInt4760;
						local146 = local113.anInt1226 >> Static231.anInt4760;
						local152 = local113.anInt1223 >> Static231.anInt4760;
						local157 = local113.anInt1220 >> Static231.anInt4760;
						this.aClass1_Sub8_Sub2_1.method4568(0.0F);
						this.aClass1_Sub8_Sub2_1.method4568(0.0F);
						this.aClass1_Sub8_Sub2_1.method4568(local140 + local40 * (float) -local157);
						this.aClass1_Sub8_Sub2_1.method4568(local146 + local44 * (float) -local157);
						this.aClass1_Sub8_Sub2_1.method4568(local152 + local48 * (float) -local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
						this.aClass1_Sub8_Sub2_1.method4568(1.0F);
						this.aClass1_Sub8_Sub2_1.method4568(0.0F);
						this.aClass1_Sub8_Sub2_1.method4568(local140 + local52 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4568(local146 + local56 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4568(local152 + local60 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
						this.aClass1_Sub8_Sub2_1.method4568(1.0F);
						this.aClass1_Sub8_Sub2_1.method4568(1.0F);
						this.aClass1_Sub8_Sub2_1.method4568(local140 + local40 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4568(local146 + local44 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4568(local152 + local48 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
						this.aClass1_Sub8_Sub2_1.method4568(0.0F);
						this.aClass1_Sub8_Sub2_1.method4568(1.0F);
						this.aClass1_Sub8_Sub2_1.method4568(local140 + local64 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4568(local146 + local68 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4568(local152 + local72 * (float) local157);
						this.aClass1_Sub8_Sub2_1.method4562(local121);
						this.aClass1_Sub8_Sub2_1.method4562(local126);
						this.aClass1_Sub8_Sub2_1.method4562(local129);
						this.aClass1_Sub8_Sub2_1.method4562(local134);
					}
					if (this.anIntArray205[local83] > 64) {
						local104 = this.anIntArray205[local83] - 64 - 1;
						for (local424 = this.anIntArray204[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass8_Sub2_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt1221;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt1227 >> Static231.anInt4760;
							local152 = local433.anInt1226 >> Static231.anInt4760;
							local472 = local433.anInt1223 >> Static231.anInt4760;
							local477 = local433.anInt1220 >> Static231.anInt4760;
							this.aClass1_Sub8_Sub2_1.method4568(0.0F);
							this.aClass1_Sub8_Sub2_1.method4568(0.0F);
							this.aClass1_Sub8_Sub2_1.method4568(local146 + local40 * (float) -local477);
							this.aClass1_Sub8_Sub2_1.method4568(local152 + local44 * (float) -local477);
							this.aClass1_Sub8_Sub2_1.method4568(local472 + local48 * (float) -local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
							this.aClass1_Sub8_Sub2_1.method4568(1.0F);
							this.aClass1_Sub8_Sub2_1.method4568(0.0F);
							this.aClass1_Sub8_Sub2_1.method4568(local146 + local52 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4568(local152 + local56 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4568(local472 + local60 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
							this.aClass1_Sub8_Sub2_1.method4568(1.0F);
							this.aClass1_Sub8_Sub2_1.method4568(1.0F);
							this.aClass1_Sub8_Sub2_1.method4568(local146 + local40 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4568(local152 + local44 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4568(local472 + local48 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
							this.aClass1_Sub8_Sub2_1.method4568(0.0F);
							this.aClass1_Sub8_Sub2_1.method4568(1.0F);
							this.aClass1_Sub8_Sub2_1.method4568(local146 + local64 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4568(local152 + local68 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4568(local472 + local72 * (float) local477);
							this.aClass1_Sub8_Sub2_1.method4562(local126);
							this.aClass1_Sub8_Sub2_1.method4562(local129);
							this.aClass1_Sub8_Sub2_1.method4562(local134);
							this.aClass1_Sub8_Sub2_1.method4562(local454);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub8_Sub2_1.anInt5182 != 0) {
			this.anInterface8_2.method1847(24, this.aClass1_Sub8_Sub2_1.aByteArray81, this.aClass1_Sub8_Sub2_1.anInt5182);
			arg0.method2269(this.aClass91_6, null, this.aClass91_7, this.aClass91_8);
			arg0.method2310(this.aClass1_Sub8_Sub2_1.anInt5182 / 24);
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Lclient!h;)V")
	private void method1839(@OriginalArg(0) Class32_Sub2 arg0) {
		arg0.method2315();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method2281(false);
		arg0.method2258();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(Lclient!h;)V")
	private void method1840(@OriginalArg(0) Class32_Sub2 arg0) {
		arg0.method2281(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}
}
