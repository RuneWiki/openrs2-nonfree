import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class198 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!kd;")
	private Interface6 anInterface6_6;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Lclient!pa;")
	private Class161 aClass161_12;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "Lclient!pa;")
	private Class161 aClass161_13;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "Lclient!pa;")
	private Class161 aClass161_14;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "[F")
	private final float[] aFloatArray28 = new float[16];

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!bp;")
	private final Class1_Sub7_Sub1 aClass1_Sub7_Sub1_3 = new Class1_Sub7_Sub1(786336);

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "[[Lclient!w;")
	private final Class32_Sub3_Sub1[][] aClass32_Sub3_Sub1ArrayArray1 = new Class32_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
	private final int[] anIntArray460 = new int[64];

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "[I")
	private final int[] anIntArray461 = new int[8191];

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "[I")
	private final int[] anIntArray462 = new int[1600];

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "[[Lclient!w;")
	private final Class32_Sub3_Sub1[][] aClass32_Sub3_Sub1ArrayArray2 = new Class32_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
	private int anInt5978 = 0;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ks;I)V")
	private void method5373(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) int arg1) {
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
		this.aClass1_Sub7_Sub1_3.anInt2219 = 0;
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
		if (arg0.lb) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray462[local83] > 64 ? 64 : this.anIntArray462[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass32_Sub3_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt2687;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2685 >> Static48.anInt2957;
						local146 = local113.anInt2680 >> Static48.anInt2957;
						local152 = local113.anInt2682 >> Static48.anInt2957;
						local157 = local113.anInt2684 >> Static48.anInt2957;
						this.aClass1_Sub7_Sub1_3.method790(0.0F);
						this.aClass1_Sub7_Sub1_3.method790(0.0F);
						this.aClass1_Sub7_Sub1_3.method790(local140 + local40 * (float) -local157);
						this.aClass1_Sub7_Sub1_3.method790(local146 + local44 * (float) -local157);
						this.aClass1_Sub7_Sub1_3.method790(local152 + local48 * (float) -local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
						this.aClass1_Sub7_Sub1_3.method790(1.0F);
						this.aClass1_Sub7_Sub1_3.method790(0.0F);
						this.aClass1_Sub7_Sub1_3.method790(local140 + local52 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method790(local146 + local56 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method790(local152 + local60 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
						this.aClass1_Sub7_Sub1_3.method790(1.0F);
						this.aClass1_Sub7_Sub1_3.method790(1.0F);
						this.aClass1_Sub7_Sub1_3.method790(local140 + local40 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method790(local146 + local44 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method790(local152 + local48 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
						this.aClass1_Sub7_Sub1_3.method790(0.0F);
						this.aClass1_Sub7_Sub1_3.method790(1.0F);
						this.aClass1_Sub7_Sub1_3.method790(local140 + local64 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method790(local146 + local68 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method790(local152 + local72 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
					}
					if (this.anIntArray462[local83] > 64) {
						local104 = this.anIntArray462[local83] - 64 - 1;
						for (local424 = this.anIntArray460[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass32_Sub3_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt2687;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2685 >> Static48.anInt2957;
							local152 = local433.anInt2680 >> Static48.anInt2957;
							local472 = local433.anInt2682 >> Static48.anInt2957;
							local477 = local433.anInt2684 >> Static48.anInt2957;
							this.aClass1_Sub7_Sub1_3.method790(0.0F);
							this.aClass1_Sub7_Sub1_3.method790(0.0F);
							this.aClass1_Sub7_Sub1_3.method790(local146 + local40 * (float) -local477);
							this.aClass1_Sub7_Sub1_3.method790(local152 + local44 * (float) -local477);
							this.aClass1_Sub7_Sub1_3.method790(local472 + local48 * (float) -local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
							this.aClass1_Sub7_Sub1_3.method790(1.0F);
							this.aClass1_Sub7_Sub1_3.method790(0.0F);
							this.aClass1_Sub7_Sub1_3.method790(local146 + local52 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method790(local152 + local56 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method790(local472 + local60 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
							this.aClass1_Sub7_Sub1_3.method790(1.0F);
							this.aClass1_Sub7_Sub1_3.method790(1.0F);
							this.aClass1_Sub7_Sub1_3.method790(local146 + local40 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method790(local152 + local44 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method790(local472 + local48 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
							this.aClass1_Sub7_Sub1_3.method790(0.0F);
							this.aClass1_Sub7_Sub1_3.method790(1.0F);
							this.aClass1_Sub7_Sub1_3.method790(local146 + local64 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method790(local152 + local68 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method790(local472 + local72 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray462[local83] > 64 ? 64 : this.anIntArray462[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass32_Sub3_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt2687;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2685 >> Static48.anInt2957;
						local146 = local113.anInt2680 >> Static48.anInt2957;
						local152 = local113.anInt2682 >> Static48.anInt2957;
						local157 = local113.anInt2684 >> Static48.anInt2957;
						this.aClass1_Sub7_Sub1_3.method789(0.0F);
						this.aClass1_Sub7_Sub1_3.method789(0.0F);
						this.aClass1_Sub7_Sub1_3.method789(local140 + local40 * (float) -local157);
						this.aClass1_Sub7_Sub1_3.method789(local146 + local44 * (float) -local157);
						this.aClass1_Sub7_Sub1_3.method789(local152 + local48 * (float) -local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
						this.aClass1_Sub7_Sub1_3.method789(1.0F);
						this.aClass1_Sub7_Sub1_3.method789(0.0F);
						this.aClass1_Sub7_Sub1_3.method789(local140 + local52 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method789(local146 + local56 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method789(local152 + local60 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
						this.aClass1_Sub7_Sub1_3.method789(1.0F);
						this.aClass1_Sub7_Sub1_3.method789(1.0F);
						this.aClass1_Sub7_Sub1_3.method789(local140 + local40 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method789(local146 + local44 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method789(local152 + local48 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
						this.aClass1_Sub7_Sub1_3.method789(0.0F);
						this.aClass1_Sub7_Sub1_3.method789(1.0F);
						this.aClass1_Sub7_Sub1_3.method789(local140 + local64 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method789(local146 + local68 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method789(local152 + local72 * (float) local157);
						this.aClass1_Sub7_Sub1_3.method2121(local121);
						this.aClass1_Sub7_Sub1_3.method2121(local126);
						this.aClass1_Sub7_Sub1_3.method2121(local129);
						this.aClass1_Sub7_Sub1_3.method2121(local134);
					}
					if (this.anIntArray462[local83] > 64) {
						local104 = this.anIntArray462[local83] - 64 - 1;
						for (local424 = this.anIntArray460[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass32_Sub3_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt2687;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2685 >> Static48.anInt2957;
							local152 = local433.anInt2680 >> Static48.anInt2957;
							local472 = local433.anInt2682 >> Static48.anInt2957;
							local477 = local433.anInt2684 >> Static48.anInt2957;
							this.aClass1_Sub7_Sub1_3.method789(0.0F);
							this.aClass1_Sub7_Sub1_3.method789(0.0F);
							this.aClass1_Sub7_Sub1_3.method789(local146 + local40 * (float) -local477);
							this.aClass1_Sub7_Sub1_3.method789(local152 + local44 * (float) -local477);
							this.aClass1_Sub7_Sub1_3.method789(local472 + local48 * (float) -local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
							this.aClass1_Sub7_Sub1_3.method789(1.0F);
							this.aClass1_Sub7_Sub1_3.method789(0.0F);
							this.aClass1_Sub7_Sub1_3.method789(local146 + local52 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method789(local152 + local56 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method789(local472 + local60 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
							this.aClass1_Sub7_Sub1_3.method789(1.0F);
							this.aClass1_Sub7_Sub1_3.method789(1.0F);
							this.aClass1_Sub7_Sub1_3.method789(local146 + local40 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method789(local152 + local44 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method789(local472 + local48 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
							this.aClass1_Sub7_Sub1_3.method789(0.0F);
							this.aClass1_Sub7_Sub1_3.method789(1.0F);
							this.aClass1_Sub7_Sub1_3.method789(local146 + local64 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method789(local152 + local68 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method789(local472 + local72 * (float) local477);
							this.aClass1_Sub7_Sub1_3.method2121(local126);
							this.aClass1_Sub7_Sub1_3.method2121(local129);
							this.aClass1_Sub7_Sub1_3.method2121(local134);
							this.aClass1_Sub7_Sub1_3.method2121(local454);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub7_Sub1_3.anInt2219 != 0) {
			this.anInterface6_6.method5384(24, this.aClass1_Sub7_Sub1_3.aByteArray41, this.aClass1_Sub7_Sub1_3.anInt2219);
			arg0.method3387(this.aClass161_12, null, this.aClass161_13, this.aClass161_14);
			arg0.method3375(this.aClass1_Sub7_Sub1_3.anInt2219 / 24);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ks;)V")
	public void method5374(@OriginalArg(0) Class63_Sub1 arg0) {
		this.anInterface6_6 = arg0.method3360(24, null, 196584, true);
		this.aClass161_14 = new Class161(arg0, this.anInterface6_6, 5126, 2, 0);
		this.aClass161_12 = new Class161(arg0, this.anInterface6_6, 5126, 3, 8);
		this.aClass161_13 = new Class161(arg0, this.anInterface6_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Lclient!ks;)V")
	private void method5375(@OriginalArg(0) Class63_Sub1 arg0) {
		arg0.method3384(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!ks;Lclient!ci;)V")
	public void method5376(@OriginalArg(0) Class63_Sub1 arg0, @OriginalArg(1) Class26 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass129_Sub2_2 == null) {
			return;
		}
		this.method5377(arg0);
		@Pc(14) float local14 = arg0.aClass129_Sub2_2.aFloat73;
		@Pc(18) float local18 = arg0.aClass129_Sub2_2.aFloat75;
		@Pc(22) float local22 = arg0.aClass129_Sub2_2.aFloat74;
		@Pc(26) float local26 = arg0.aClass129_Sub2_2.aFloat66;
		try {
			@Pc(31) int local31;
			@Pc(48) Class32_Sub3_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean61) {
				local31 = arg1.anInt982 - arg1.anInt983;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class32_Sub3 local290 = arg1.aClass209_1.aClass32_Sub3_7;
				@Pc(293) Class32_Sub3 local293 = local290.aClass32_Sub3_5;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt5978 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray462[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray460[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class32_Sub3_Sub1) local293;
						if (local297) {
							local295 = local48.anInt2681;
							local297 = false;
						} else if (local295 != local48.anInt2681) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt2685 >> Static48.anInt2957) + local18 * (float) (local48.anInt2680 >> Static48.anInt2957) + local22 * (float) (local48.anInt2682 >> Static48.anInt2957) + local26) - arg1.anInt983;
						if (local75 <= 1600) {
							if (this.anIntArray462[local75] < 64) {
								this.aClass32_Sub3_Sub1ArrayArray1[local75][this.anIntArray462[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray462[local75] == 64) {
										if (this.anInt5978 == 64) {
											break label188;
										}
										this.anIntArray462[local75] += this.anInt5978++ + 1;
									}
									this.aClass32_Sub3_Sub1ArrayArray2[this.anIntArray462[local75] - 64 - 1][this.anIntArray460[this.anIntArray462[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass32_Sub3_5;
					}
					arg0.method3355(local295 >= 0 ? arg0.aClass35_1.method1409(local295) : null);
					this.method5373(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class32_Sub3 local39 = arg1.aClass209_1.aClass32_Sub3_7;
				@Pc(42) Class32_Sub3 local42;
				for (local42 = local39.aClass32_Sub3_5; local42 != local39; local42 = local42.aClass32_Sub3_5) {
					local48 = (Class32_Sub3_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt2685 >> Static48.anInt2957) + local18 * (float) (local48.anInt2680 >> Static48.anInt2957) + local22 * (float) (local48.anInt2682 >> Static48.anInt2957) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray461[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass32_Sub3_5;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt5978 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray462[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray460[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class32_Sub3_Sub1 local149 = (Class32_Sub3_Sub1) local42;
						if (local113) {
							local75 = local149.anInt2681;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt2681) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray461[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray462[local173] < 64) {
								this.aClass32_Sub3_Sub1ArrayArray1[local173][this.anIntArray462[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray462[local173] == 64) {
										if (this.anInt5978 == 64) {
											break label186;
										}
										this.anIntArray462[local173] += this.anInt5978++ + 1;
									}
									this.aClass32_Sub3_Sub1ArrayArray2[this.anIntArray462[local173] - 64 - 1][this.anIntArray460[this.anIntArray462[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass32_Sub3_5;
					}
					arg0.method3355(local75 >= 0 ? arg0.aClass35_1.method1409(local75) : null);
					this.method5373(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method5375(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "(Lclient!ks;)V")
	private void method5377(@OriginalArg(0) Class63_Sub1 arg0) {
		arg0.method3333();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method3384(false);
		arg0.method3331();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
