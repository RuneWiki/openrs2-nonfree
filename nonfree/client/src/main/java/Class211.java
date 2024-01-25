import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class211 {

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl2;

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "Lclient!tf;")
	private Class190 aClass190_10;

	@OriginalMember(owner = "client!vr", name = "i", descriptor = "Lclient!tf;")
	private Class190 aClass190_11;

	@OriginalMember(owner = "client!vr", name = "j", descriptor = "Lclient!na;")
	private Interface7 anInterface7_5;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "Lclient!tf;")
	private Class190 aClass190_12;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "[F")
	private final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "Lclient!jj;")
	private final Class2_Sub12_Sub1 aClass2_Sub12_Sub1_2 = new Class2_Sub12_Sub1(786336);

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
	private final int[] anIntArray514 = new int[1600];

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "[I")
	private final int[] anIntArray515 = new int[8191];

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "[I")
	private final int[] anIntArray516 = new int[64];

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "[[Lclient!oo;")
	private final Class57_Sub1_Sub1[][] aClass57_Sub1_Sub1ArrayArray1 = new Class57_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
	private int anInt6751 = 0;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "[[Lclient!oo;")
	private final Class57_Sub1_Sub1[][] aClass57_Sub1_Sub1ArrayArray2 = new Class57_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!cg;)V")
	public void method5649(@OriginalArg(0) Class37_Sub1 arg0) {
		this.anInterface7_5 = arg0.method746(24, null, 196584, true);
		this.aClass190_12 = new Class190(arg0, this.anInterface7_5, 5126, 2, 0);
		this.aClass190_10 = new Class190(arg0, this.anInterface7_5, 5126, 3, 8);
		this.aClass190_11 = new Class190(arg0, this.anInterface7_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!cg;I)V")
	private void method5650(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl2.glGetFloatv(2982, this.aFloatArray30, 0);
		@Pc(11) float local11 = this.aFloatArray30[0];
		@Pc(16) float local16 = this.aFloatArray30[4];
		@Pc(21) float local21 = this.aFloatArray30[8];
		@Pc(26) float local26 = this.aFloatArray30[1];
		@Pc(31) float local31 = this.aFloatArray30[5];
		@Pc(36) float local36 = this.aFloatArray30[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass2_Sub12_Sub1_2.anInt3606 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class57_Sub1_Sub1 local113;
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
		@Pc(433) Class57_Sub1_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean72) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray514[local83] > 64 ? 64 : this.anIntArray514[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass57_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt2799;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2801 >> Static233.anInt5025;
						local146 = local113.anInt2802 >> Static233.anInt5025;
						local152 = local113.anInt2800 >> Static233.anInt5025;
						local157 = local113.anInt2797 >> Static233.anInt5025;
						this.aClass2_Sub12_Sub1_2.method3094(0.0F);
						this.aClass2_Sub12_Sub1_2.method3094(0.0F);
						this.aClass2_Sub12_Sub1_2.method3094(local140 + local40 * (float) -local157);
						this.aClass2_Sub12_Sub1_2.method3094(local146 + local44 * (float) -local157);
						this.aClass2_Sub12_Sub1_2.method3094(local152 + local48 * (float) -local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
						this.aClass2_Sub12_Sub1_2.method3094(1.0F);
						this.aClass2_Sub12_Sub1_2.method3094(0.0F);
						this.aClass2_Sub12_Sub1_2.method3094(local140 + local52 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3094(local146 + local56 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3094(local152 + local60 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
						this.aClass2_Sub12_Sub1_2.method3094(1.0F);
						this.aClass2_Sub12_Sub1_2.method3094(1.0F);
						this.aClass2_Sub12_Sub1_2.method3094(local140 + local40 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3094(local146 + local44 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3094(local152 + local48 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
						this.aClass2_Sub12_Sub1_2.method3094(0.0F);
						this.aClass2_Sub12_Sub1_2.method3094(1.0F);
						this.aClass2_Sub12_Sub1_2.method3094(local140 + local64 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3094(local146 + local68 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3094(local152 + local72 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
					}
					if (this.anIntArray514[local83] > 64) {
						local104 = this.anIntArray514[local83] - 64 - 1;
						for (local424 = this.anIntArray516[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass57_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt2799;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2801 >> Static233.anInt5025;
							local152 = local433.anInt2802 >> Static233.anInt5025;
							local472 = local433.anInt2800 >> Static233.anInt5025;
							local477 = local433.anInt2797 >> Static233.anInt5025;
							this.aClass2_Sub12_Sub1_2.method3094(0.0F);
							this.aClass2_Sub12_Sub1_2.method3094(0.0F);
							this.aClass2_Sub12_Sub1_2.method3094(local146 + local40 * (float) -local477);
							this.aClass2_Sub12_Sub1_2.method3094(local152 + local44 * (float) -local477);
							this.aClass2_Sub12_Sub1_2.method3094(local472 + local48 * (float) -local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
							this.aClass2_Sub12_Sub1_2.method3094(1.0F);
							this.aClass2_Sub12_Sub1_2.method3094(0.0F);
							this.aClass2_Sub12_Sub1_2.method3094(local146 + local52 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3094(local152 + local56 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3094(local472 + local60 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
							this.aClass2_Sub12_Sub1_2.method3094(1.0F);
							this.aClass2_Sub12_Sub1_2.method3094(1.0F);
							this.aClass2_Sub12_Sub1_2.method3094(local146 + local40 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3094(local152 + local44 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3094(local472 + local48 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
							this.aClass2_Sub12_Sub1_2.method3094(0.0F);
							this.aClass2_Sub12_Sub1_2.method3094(1.0F);
							this.aClass2_Sub12_Sub1_2.method3094(local146 + local64 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3094(local152 + local68 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3094(local472 + local72 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray514[local83] > 64 ? 64 : this.anIntArray514[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass57_Sub1_Sub1ArrayArray1[local83][local104];
						local116 = local113.anInt2799;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt2801 >> Static233.anInt5025;
						local146 = local113.anInt2802 >> Static233.anInt5025;
						local152 = local113.anInt2800 >> Static233.anInt5025;
						local157 = local113.anInt2797 >> Static233.anInt5025;
						this.aClass2_Sub12_Sub1_2.method3093(0.0F);
						this.aClass2_Sub12_Sub1_2.method3093(0.0F);
						this.aClass2_Sub12_Sub1_2.method3093(local140 + local40 * (float) -local157);
						this.aClass2_Sub12_Sub1_2.method3093(local146 + local44 * (float) -local157);
						this.aClass2_Sub12_Sub1_2.method3093(local152 + local48 * (float) -local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
						this.aClass2_Sub12_Sub1_2.method3093(1.0F);
						this.aClass2_Sub12_Sub1_2.method3093(0.0F);
						this.aClass2_Sub12_Sub1_2.method3093(local140 + local52 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3093(local146 + local56 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3093(local152 + local60 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
						this.aClass2_Sub12_Sub1_2.method3093(1.0F);
						this.aClass2_Sub12_Sub1_2.method3093(1.0F);
						this.aClass2_Sub12_Sub1_2.method3093(local140 + local40 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3093(local146 + local44 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3093(local152 + local48 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
						this.aClass2_Sub12_Sub1_2.method3093(0.0F);
						this.aClass2_Sub12_Sub1_2.method3093(1.0F);
						this.aClass2_Sub12_Sub1_2.method3093(local140 + local64 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3093(local146 + local68 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3093(local152 + local72 * (float) local157);
						this.aClass2_Sub12_Sub1_2.method3147(local121);
						this.aClass2_Sub12_Sub1_2.method3147(local126);
						this.aClass2_Sub12_Sub1_2.method3147(local129);
						this.aClass2_Sub12_Sub1_2.method3147(local134);
					}
					if (this.anIntArray514[local83] > 64) {
						local104 = this.anIntArray514[local83] - 64 - 1;
						for (local424 = this.anIntArray516[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass57_Sub1_Sub1ArrayArray2[local104][local424];
							local436 = local433.anInt2799;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt2801 >> Static233.anInt5025;
							local152 = local433.anInt2802 >> Static233.anInt5025;
							local472 = local433.anInt2800 >> Static233.anInt5025;
							local477 = local433.anInt2797 >> Static233.anInt5025;
							this.aClass2_Sub12_Sub1_2.method3093(0.0F);
							this.aClass2_Sub12_Sub1_2.method3093(0.0F);
							this.aClass2_Sub12_Sub1_2.method3093(local146 + local40 * (float) -local477);
							this.aClass2_Sub12_Sub1_2.method3093(local152 + local44 * (float) -local477);
							this.aClass2_Sub12_Sub1_2.method3093(local472 + local48 * (float) -local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
							this.aClass2_Sub12_Sub1_2.method3093(1.0F);
							this.aClass2_Sub12_Sub1_2.method3093(0.0F);
							this.aClass2_Sub12_Sub1_2.method3093(local146 + local52 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3093(local152 + local56 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3093(local472 + local60 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
							this.aClass2_Sub12_Sub1_2.method3093(1.0F);
							this.aClass2_Sub12_Sub1_2.method3093(1.0F);
							this.aClass2_Sub12_Sub1_2.method3093(local146 + local40 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3093(local152 + local44 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3093(local472 + local48 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
							this.aClass2_Sub12_Sub1_2.method3093(0.0F);
							this.aClass2_Sub12_Sub1_2.method3093(1.0F);
							this.aClass2_Sub12_Sub1_2.method3093(local146 + local64 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3093(local152 + local68 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3093(local472 + local72 * (float) local477);
							this.aClass2_Sub12_Sub1_2.method3147(local126);
							this.aClass2_Sub12_Sub1_2.method3147(local129);
							this.aClass2_Sub12_Sub1_2.method3147(local134);
							this.aClass2_Sub12_Sub1_2.method3147(local454);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub12_Sub1_2.anInt3606 != 0) {
			this.anInterface7_5.method5587(24, this.aClass2_Sub12_Sub1_2.aByteArray30, this.aClass2_Sub12_Sub1_2.anInt3606);
			arg0.method737(this.aClass190_10, null, this.aClass190_11, this.aClass190_12);
			arg0.method763(this.aClass2_Sub12_Sub1_2.anInt3606 / 24);
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lclient!cg;)V")
	private void method5651(@OriginalArg(0) Class37_Sub1 arg0) {
		arg0.method772(true);
		this.anOpengl2.glEnable(16384);
		this.anOpengl2.glEnable(16385);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!cg;Lclient!wa;)V")
	public void method5652(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) Class214 arg1) {
		this.anOpengl2 = arg0.anOpengl1;
		if (arg0.aClass38_Sub2_1 == null) {
			return;
		}
		this.method5653(arg0);
		@Pc(14) float local14 = arg0.aClass38_Sub2_1.aFloat54;
		@Pc(18) float local18 = arg0.aClass38_Sub2_1.aFloat53;
		@Pc(22) float local22 = arg0.aClass38_Sub2_1.aFloat55;
		@Pc(26) float local26 = arg0.aClass38_Sub2_1.aFloat52;
		try {
			@Pc(31) int local31;
			@Pc(48) Class57_Sub1_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean603) {
				local31 = arg1.anInt6764 - arg1.anInt6765;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class57_Sub1 local290 = arg1.aClass55_1.aClass57_Sub1_1;
				@Pc(293) Class57_Sub1 local293 = local290.aClass57_Sub1_7;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt6751 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray514[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray516[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class57_Sub1_Sub1) local293;
						if (local297) {
							local295 = local48.anInt2796;
							local297 = false;
						} else if (local295 != local48.anInt2796) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt2801 >> Static233.anInt5025) + local18 * (float) (local48.anInt2802 >> Static233.anInt5025) + local22 * (float) (local48.anInt2800 >> Static233.anInt5025) + local26) - arg1.anInt6765;
						if (local75 <= 1600) {
							if (this.anIntArray514[local75] < 64) {
								this.aClass57_Sub1_Sub1ArrayArray1[local75][this.anIntArray514[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray514[local75] == 64) {
										if (this.anInt6751 == 64) {
											break label188;
										}
										this.anIntArray514[local75] += this.anInt6751++ + 1;
									}
									this.aClass57_Sub1_Sub1ArrayArray2[this.anIntArray514[local75] - 64 - 1][this.anIntArray516[this.anIntArray514[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass57_Sub1_7;
					}
					arg0.method767(local295 >= 0 ? arg0.aClass171_1.method4777(local295) : null);
					this.method5650(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class57_Sub1 local39 = arg1.aClass55_1.aClass57_Sub1_1;
				@Pc(42) Class57_Sub1 local42;
				for (local42 = local39.aClass57_Sub1_7; local42 != local39; local42 = local42.aClass57_Sub1_7) {
					local48 = (Class57_Sub1_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt2801 >> Static233.anInt5025) + local18 * (float) (local48.anInt2802 >> Static233.anInt5025) + local22 * (float) (local48.anInt2800 >> Static233.anInt5025) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray515[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass57_Sub1_7;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt6751 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray514[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray516[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class57_Sub1_Sub1 local149 = (Class57_Sub1_Sub1) local42;
						if (local113) {
							local75 = local149.anInt2796;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt2796) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray515[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray514[local173] < 64) {
								this.aClass57_Sub1_Sub1ArrayArray1[local173][this.anIntArray514[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray514[local173] == 64) {
										if (this.anInt6751 == 64) {
											break label186;
										}
										this.anIntArray514[local173] += this.anInt6751++ + 1;
									}
									this.aClass57_Sub1_Sub1ArrayArray2[this.anIntArray514[local173] - 64 - 1][this.anIntArray516[this.anIntArray514[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass57_Sub1_7;
					}
					arg0.method767(local75 >= 0 ? arg0.aClass171_1.method4777(local75) : null);
					this.method5650(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method5651(arg0);
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(Lclient!cg;)V")
	private void method5653(@OriginalArg(0) Class37_Sub1 arg0) {
		arg0.method751();
		this.anOpengl2.glDisable(16384);
		this.anOpengl2.glDisable(16385);
		arg0.method772(false);
		arg0.method781();
		this.anOpengl2.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
