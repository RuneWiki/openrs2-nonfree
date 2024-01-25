import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class138 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Lclient!jaggl/opengl;")
	private opengl anOpengl1;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Lclient!uk;")
	private Class229 aClass229_7;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "Lclient!uk;")
	private Class229 aClass229_8;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Lclient!uk;")
	private Class229 aClass229_9;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "Lclient!la;")
	private Interface7 anInterface7_3;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "[F")
	private final float[] aFloatArray17 = new float[16];

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!fi;")
	private final Class2_Sub13_Sub1 aClass2_Sub13_Sub1_2 = new Class2_Sub13_Sub1(786336);

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "[I")
	private final int[] anIntArray373 = new int[1600];

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "[[Lclient!ee;")
	private final Class22_Sub4_Sub1[][] aClass22_Sub4_Sub1ArrayArray1 = new Class22_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
	private final int[] anIntArray374 = new int[64];

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "[I")
	private final int[] anIntArray375 = new int[8191];

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "[[Lclient!ee;")
	private final Class22_Sub4_Sub1[][] aClass22_Sub4_Sub1ArrayArray2 = new Class22_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
	private int anInt3334 = 0;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!qi;I)V")
	private void method3042(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anOpengl1.glGetFloatv(2982, this.aFloatArray17, 0);
		@Pc(11) float local11 = this.aFloatArray17[0];
		@Pc(16) float local16 = this.aFloatArray17[4];
		@Pc(21) float local21 = this.aFloatArray17[8];
		@Pc(26) float local26 = this.aFloatArray17[1];
		@Pc(31) float local31 = this.aFloatArray17[5];
		@Pc(36) float local36 = this.aFloatArray17[9];
		@Pc(40) float local40 = local11 + local26;
		@Pc(44) float local44 = local16 + local31;
		@Pc(48) float local48 = local21 + local36;
		@Pc(52) float local52 = local11 - local26;
		@Pc(56) float local56 = local16 - local31;
		@Pc(60) float local60 = local21 - local36;
		@Pc(64) float local64 = local26 - local11;
		@Pc(68) float local68 = local31 - local16;
		@Pc(72) float local72 = local36 - local21;
		this.aClass2_Sub13_Sub1_2.anInt4788 = 0;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(104) int local104;
		@Pc(113) Class22_Sub4_Sub1 local113;
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
		@Pc(433) Class22_Sub4_Sub1 local433;
		@Pc(436) int local436;
		@Pc(454) byte local454;
		@Pc(472) float local472;
		if (arg0.aBoolean403) {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray373[local83] > 64 ? 64 : this.anIntArray373[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass22_Sub4_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt4010;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt4005 >> Static311.anInt5504;
						local146 = local113.anInt4014 >> Static311.anInt5504;
						local152 = local113.anInt4015 >> Static311.anInt5504;
						local157 = local113.anInt4006 >> Static311.anInt5504;
						this.aClass2_Sub13_Sub1_2.method1757(0.0F);
						this.aClass2_Sub13_Sub1_2.method1757(0.0F);
						this.aClass2_Sub13_Sub1_2.method1757(local140 + local40 * (float) -local157);
						this.aClass2_Sub13_Sub1_2.method1757(local146 + local44 * (float) -local157);
						this.aClass2_Sub13_Sub1_2.method1757(local152 + local48 * (float) -local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
						this.aClass2_Sub13_Sub1_2.method1757(1.0F);
						this.aClass2_Sub13_Sub1_2.method1757(0.0F);
						this.aClass2_Sub13_Sub1_2.method1757(local140 + local52 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1757(local146 + local56 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1757(local152 + local60 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
						this.aClass2_Sub13_Sub1_2.method1757(1.0F);
						this.aClass2_Sub13_Sub1_2.method1757(1.0F);
						this.aClass2_Sub13_Sub1_2.method1757(local140 + local40 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1757(local146 + local44 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1757(local152 + local48 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
						this.aClass2_Sub13_Sub1_2.method1757(0.0F);
						this.aClass2_Sub13_Sub1_2.method1757(1.0F);
						this.aClass2_Sub13_Sub1_2.method1757(local140 + local64 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1757(local146 + local68 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1757(local152 + local72 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
					}
					if (this.anIntArray373[local83] > 64) {
						local104 = this.anIntArray373[local83] - 64 - 1;
						for (local424 = this.anIntArray374[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass22_Sub4_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt4010;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt4005 >> Static311.anInt5504;
							local152 = local433.anInt4014 >> Static311.anInt5504;
							local472 = local433.anInt4015 >> Static311.anInt5504;
							local477 = local433.anInt4006 >> Static311.anInt5504;
							this.aClass2_Sub13_Sub1_2.method1757(0.0F);
							this.aClass2_Sub13_Sub1_2.method1757(0.0F);
							this.aClass2_Sub13_Sub1_2.method1757(local146 + local40 * (float) -local477);
							this.aClass2_Sub13_Sub1_2.method1757(local152 + local44 * (float) -local477);
							this.aClass2_Sub13_Sub1_2.method1757(local472 + local48 * (float) -local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
							this.aClass2_Sub13_Sub1_2.method1757(1.0F);
							this.aClass2_Sub13_Sub1_2.method1757(0.0F);
							this.aClass2_Sub13_Sub1_2.method1757(local146 + local52 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1757(local152 + local56 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1757(local472 + local60 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
							this.aClass2_Sub13_Sub1_2.method1757(1.0F);
							this.aClass2_Sub13_Sub1_2.method1757(1.0F);
							this.aClass2_Sub13_Sub1_2.method1757(local146 + local40 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1757(local152 + local44 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1757(local472 + local48 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
							this.aClass2_Sub13_Sub1_2.method1757(0.0F);
							this.aClass2_Sub13_Sub1_2.method1757(1.0F);
							this.aClass2_Sub13_Sub1_2.method1757(local146 + local64 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1757(local152 + local68 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1757(local472 + local72 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
						}
					}
				}
			}
		} else {
			for (local83 = arg1 - 1; local83 >= 0; local83--) {
				local98 = this.anIntArray373[local83] > 64 ? 64 : this.anIntArray373[local83];
				if (local98 > 0) {
					for (local104 = local98 - 1; local104 >= 0; local104--) {
						local113 = this.aClass22_Sub4_Sub1ArrayArray2[local83][local104];
						local116 = local113.anInt4010;
						local121 = (byte) (local116 >> 16);
						local126 = (byte) (local116 >> 8);
						local129 = (byte) local116;
						local134 = (byte) (local116 >>> 24);
						local140 = local113.anInt4005 >> Static311.anInt5504;
						local146 = local113.anInt4014 >> Static311.anInt5504;
						local152 = local113.anInt4015 >> Static311.anInt5504;
						local157 = local113.anInt4006 >> Static311.anInt5504;
						this.aClass2_Sub13_Sub1_2.method1756(0.0F);
						this.aClass2_Sub13_Sub1_2.method1756(0.0F);
						this.aClass2_Sub13_Sub1_2.method1756(local140 + local40 * (float) -local157);
						this.aClass2_Sub13_Sub1_2.method1756(local146 + local44 * (float) -local157);
						this.aClass2_Sub13_Sub1_2.method1756(local152 + local48 * (float) -local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
						this.aClass2_Sub13_Sub1_2.method1756(1.0F);
						this.aClass2_Sub13_Sub1_2.method1756(0.0F);
						this.aClass2_Sub13_Sub1_2.method1756(local140 + local52 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1756(local146 + local56 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1756(local152 + local60 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
						this.aClass2_Sub13_Sub1_2.method1756(1.0F);
						this.aClass2_Sub13_Sub1_2.method1756(1.0F);
						this.aClass2_Sub13_Sub1_2.method1756(local140 + local40 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1756(local146 + local44 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1756(local152 + local48 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
						this.aClass2_Sub13_Sub1_2.method1756(0.0F);
						this.aClass2_Sub13_Sub1_2.method1756(1.0F);
						this.aClass2_Sub13_Sub1_2.method1756(local140 + local64 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1756(local146 + local68 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method1756(local152 + local72 * (float) local157);
						this.aClass2_Sub13_Sub1_2.method4207(local121);
						this.aClass2_Sub13_Sub1_2.method4207(local126);
						this.aClass2_Sub13_Sub1_2.method4207(local129);
						this.aClass2_Sub13_Sub1_2.method4207(local134);
					}
					if (this.anIntArray373[local83] > 64) {
						local104 = this.anIntArray373[local83] - 64 - 1;
						for (local424 = this.anIntArray374[local104] - 1; local424 >= 0; local424--) {
							local433 = this.aClass22_Sub4_Sub1ArrayArray1[local104][local424];
							local436 = local433.anInt4010;
							local126 = (byte) (local436 >> 16);
							local129 = (byte) (local436 >> 8);
							local134 = (byte) local436;
							local454 = (byte) (local436 >>> 24);
							local146 = local433.anInt4005 >> Static311.anInt5504;
							local152 = local433.anInt4014 >> Static311.anInt5504;
							local472 = local433.anInt4015 >> Static311.anInt5504;
							local477 = local433.anInt4006 >> Static311.anInt5504;
							this.aClass2_Sub13_Sub1_2.method1756(0.0F);
							this.aClass2_Sub13_Sub1_2.method1756(0.0F);
							this.aClass2_Sub13_Sub1_2.method1756(local146 + local40 * (float) -local477);
							this.aClass2_Sub13_Sub1_2.method1756(local152 + local44 * (float) -local477);
							this.aClass2_Sub13_Sub1_2.method1756(local472 + local48 * (float) -local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
							this.aClass2_Sub13_Sub1_2.method1756(1.0F);
							this.aClass2_Sub13_Sub1_2.method1756(0.0F);
							this.aClass2_Sub13_Sub1_2.method1756(local146 + local52 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1756(local152 + local56 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1756(local472 + local60 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
							this.aClass2_Sub13_Sub1_2.method1756(1.0F);
							this.aClass2_Sub13_Sub1_2.method1756(1.0F);
							this.aClass2_Sub13_Sub1_2.method1756(local146 + local40 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1756(local152 + local44 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1756(local472 + local48 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
							this.aClass2_Sub13_Sub1_2.method1756(0.0F);
							this.aClass2_Sub13_Sub1_2.method1756(1.0F);
							this.aClass2_Sub13_Sub1_2.method1756(local146 + local64 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1756(local152 + local68 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method1756(local472 + local72 * (float) local477);
							this.aClass2_Sub13_Sub1_2.method4207(local126);
							this.aClass2_Sub13_Sub1_2.method4207(local129);
							this.aClass2_Sub13_Sub1_2.method4207(local134);
							this.aClass2_Sub13_Sub1_2.method4207(local454);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub13_Sub1_2.anInt4788 != 0) {
			this.anInterface7_3.method5132(24, this.aClass2_Sub13_Sub1_2.aByteArray77, this.aClass2_Sub13_Sub1_2.anInt4788);
			arg0.method4580(this.aClass229_9, null, this.aClass229_7, this.aClass229_8);
			arg0.method4620(this.aClass2_Sub13_Sub1_2.anInt4788 / 24);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!qi;)V")
	private void method3043(@OriginalArg(0) Class82_Sub2 arg0) {
		arg0.method4573(true);
		this.anOpengl1.glEnable(16384);
		this.anOpengl1.glEnable(16385);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Lclient!qi;)V")
	private void method3044(@OriginalArg(0) Class82_Sub2 arg0) {
		arg0.method4564();
		this.anOpengl1.glDisable(16384);
		this.anOpengl1.glDisable(16385);
		arg0.method4573(false);
		arg0.method4569();
		this.anOpengl1.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(Lclient!qi;)V")
	public void method3045(@OriginalArg(0) Class82_Sub2 arg0) {
		this.anInterface7_3 = arg0.method4610(24, null, 196584, true);
		this.aClass229_8 = new Class229(arg0, this.anInterface7_3, 5126, 2, 0);
		this.aClass229_9 = new Class229(arg0, this.anInterface7_3, 5126, 3, 8);
		this.aClass229_7 = new Class229(arg0, this.anInterface7_3, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!qi;Lclient!nd;)V")
	public void method3046(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) Class157 arg1) {
		this.anOpengl1 = arg0.anOpengl2;
		if (arg0.aClass54_Sub2_2 == null) {
			return;
		}
		this.method3044(arg0);
		@Pc(14) float local14 = arg0.aClass54_Sub2_2.aFloat81;
		@Pc(18) float local18 = arg0.aClass54_Sub2_2.aFloat84;
		@Pc(22) float local22 = arg0.aClass54_Sub2_2.aFloat77;
		@Pc(26) float local26 = arg0.aClass54_Sub2_2.aFloat85;
		try {
			@Pc(31) int local31;
			@Pc(48) Class22_Sub4_Sub1 local48;
			@Pc(75) int local75;
			@Pc(99) int local99;
			if (arg1.aBoolean329) {
				local31 = arg1.anInt4264 - arg1.anInt4265;
				if (local31 > 1600) {
					local31 = 1600;
				}
				@Pc(290) Class22_Sub4 local290 = arg1.aClass228_1.aClass22_Sub4_7;
				@Pc(293) Class22_Sub4 local293 = local290.aClass22_Sub4_6;
				@Pc(295) int local295 = -2;
				@Pc(297) boolean local297 = true;
				while (local293 != local290) {
					this.anInt3334 = 0;
					for (local99 = 0; local99 < local31; local99++) {
						this.anIntArray373[local99] = 0;
					}
					for (local99 = 0; local99 < 64; local99++) {
						this.anIntArray374[local99] = 0;
					}
					while (local293 != local290) {
						local48 = (Class22_Sub4_Sub1) local293;
						if (local297) {
							local295 = local48.anInt4008;
							local297 = false;
						} else if (local295 != local48.anInt4008) {
							local297 = true;
							break;
						}
						local75 = (int) (local14 * (float) (local48.anInt4005 >> Static311.anInt5504) + local18 * (float) (local48.anInt4014 >> Static311.anInt5504) + local22 * (float) (local48.anInt4015 >> Static311.anInt5504) + local26) - arg1.anInt4265;
						if (local75 <= 1600) {
							if (this.anIntArray373[local75] < 64) {
								this.aClass22_Sub4_Sub1ArrayArray2[local75][this.anIntArray373[local75]++] = local48;
							} else {
								label188: {
									if (this.anIntArray373[local75] == 64) {
										if (this.anInt3334 == 64) {
											break label188;
										}
										this.anIntArray373[local75] += this.anInt3334++ + 1;
									}
									this.aClass22_Sub4_Sub1ArrayArray1[this.anIntArray373[local75] - 64 - 1][this.anIntArray374[this.anIntArray373[local75] - 64 - 1]++] = local48;
								}
							}
						}
						local293 = local293.aClass22_Sub4_6;
					}
					arg0.method4614(local295 >= 0 ? arg0.aClass219_1.method5200(local295) : null);
					this.method3042(arg0, local31);
				}
			} else {
				local31 = 0;
				@Pc(33) int local33 = Integer.MAX_VALUE;
				@Pc(35) int local35 = 0;
				@Pc(39) Class22_Sub4 local39 = arg1.aClass228_1.aClass22_Sub4_7;
				@Pc(42) Class22_Sub4 local42;
				for (local42 = local39.aClass22_Sub4_6; local42 != local39; local42 = local42.aClass22_Sub4_6) {
					local48 = (Class22_Sub4_Sub1) local42;
					local75 = (int) (local14 * (float) (local48.anInt4005 >> Static311.anInt5504) + local18 * (float) (local48.anInt4014 >> Static311.anInt5504) + local22 * (float) (local48.anInt4015 >> Static311.anInt5504) + local26);
					if (local75 > local35) {
						local35 = local75;
					}
					if (local75 < local33) {
						local33 = local75;
					}
					this.anIntArray375[local31++] = local75;
				}
				local99 = local35 - local33;
				if (local99 > 1600) {
					local99 = 1600;
				}
				local42 = local39.aClass22_Sub4_6;
				local31 = 0;
				local75 = -2;
				@Pc(113) boolean local113 = true;
				while (local42 != local39) {
					this.anInt3334 = 0;
					@Pc(121) int local121;
					for (local121 = 0; local121 < local99; local121++) {
						this.anIntArray373[local121] = 0;
					}
					for (local121 = 0; local121 < 64; local121++) {
						this.anIntArray374[local121] = 0;
					}
					while (local42 != local39) {
						@Pc(149) Class22_Sub4_Sub1 local149 = (Class22_Sub4_Sub1) local42;
						if (local113) {
							local75 = local149.anInt4008;
							local113 = false;
						}
						if (local31 > 0 && local75 != local149.anInt4008) {
							local113 = true;
							break;
						}
						@Pc(173) int local173 = this.anIntArray375[local31++] - local33;
						if (local173 <= 1600) {
							if (this.anIntArray373[local173] < 64) {
								this.aClass22_Sub4_Sub1ArrayArray2[local173][this.anIntArray373[local173]++] = local149;
							} else {
								label186: {
									if (this.anIntArray373[local173] == 64) {
										if (this.anInt3334 == 64) {
											break label186;
										}
										this.anIntArray373[local173] += this.anInt3334++ + 1;
									}
									this.aClass22_Sub4_Sub1ArrayArray1[this.anIntArray373[local173] - 64 - 1][this.anIntArray374[this.anIntArray373[local173] - 64 - 1]++] = local149;
								}
							}
						}
						local42 = local42.aClass22_Sub4_6;
					}
					arg0.method4614(local75 >= 0 ? arg0.aClass219_1.method5200(local75) : null);
					this.method3042(arg0, local99);
				}
			}
		} catch (@Pc(481) Exception local481) {
		}
		this.method3043(arg0);
	}
}
