import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class213 {

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Lclient!qo;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!ro;")
	private Class258 aClass258_9;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Lclient!ro;")
	private Class258 aClass258_10;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "Lclient!ro;")
	private Class258 aClass258_11;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[F")
	private final float[] aFloatArray55 = new float[16];

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!gt;")
	private final Class1_Sub17_Sub1 aClass1_Sub17_Sub1_3 = new Class1_Sub17_Sub1(786336);

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	private final int anInt6338 = Static509.method7779(1600);

	@OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
	private final int[] anIntArray616 = new int[8191];

	@OriginalMember(owner = "client!og", name = "q", descriptor = "[[Lclient!saa;")
	private final Class46_Sub3_Sub1[][] aClass46_Sub3_Sub1ArrayArray3 = new Class46_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!og", name = "s", descriptor = "I")
	private int anInt6339 = 0;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "[[Lclient!saa;")
	private final Class46_Sub3_Sub1[][] aClass46_Sub3_Sub1ArrayArray4 = new Class46_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
	private final int[] anIntArray618 = new int[1600];

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[I")
	private final int[] anIntArray617 = new int[64];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!mh;B)V")
	public void method5748(@OriginalArg(0) Class4_Sub3 arg0) {
		this.anInterface15_5 = arg0.method5299(196584, 24, null, true);
		this.aClass258_10 = new Class258(this.anInterface15_5, 5126, 2, 0);
		this.aClass258_9 = new Class258(this.anInterface15_5, 5126, 3, 8);
		this.aClass258_11 = new Class258(this.anInterface15_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!mh;ZI)V")
	private void method5750(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray55, 0);
		@Pc(15) float local15 = this.aFloatArray55[0];
		@Pc(20) float local20 = this.aFloatArray55[4];
		@Pc(31) float local31 = this.aFloatArray55[8];
		@Pc(36) float local36 = this.aFloatArray55[1];
		@Pc(41) float local41 = this.aFloatArray55[5];
		@Pc(46) float local46 = this.aFloatArray55[9];
		@Pc(50) float local50 = local15 + local36;
		@Pc(54) float local54 = local20 + local41;
		@Pc(58) float local58 = local31 + local46;
		@Pc(63) float local63 = local15 - local36;
		@Pc(67) float local67 = local20 - local41;
		@Pc(72) float local72 = local31 - local46;
		@Pc(76) float local76 = local36 - local15;
		@Pc(80) float local80 = local41 - local20;
		this.aClass1_Sub17_Sub1_3.anInt4872 = 0;
		@Pc(88) float local88 = local46 - local31;
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(121) int local121;
		@Pc(130) Class46_Sub3_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(490) float local490;
		@Pc(495) int local495;
		@Pc(435) int local435;
		@Pc(451) Class46_Sub3_Sub1 local451;
		@Pc(454) int local454;
		@Pc(467) byte local467;
		@Pc(472) byte local472;
		@Pc(484) float local484;
		if (arg0.aBoolean421) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray618[local95] <= 64 ? this.anIntArray618[local95] : 64;
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass46_Sub3_Sub1ArrayArray4[local95][local121];
						local133 = local130.anInt4605;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt4593 >> 12;
						local163 = local130.anInt4601 >> 12;
						local169 = local130.anInt4597 >> 12;
						local174 = local130.anInt4604 >> 12;
						this.aClass1_Sub17_Sub1_3.method3096(0.0F);
						this.aClass1_Sub17_Sub1_3.method3096(0.0F);
						this.aClass1_Sub17_Sub1_3.method3096(local157 + (float) -local174 * local50);
						this.aClass1_Sub17_Sub1_3.method3096(local54 * (float) -local174 + local163);
						this.aClass1_Sub17_Sub1_3.method3096(local169 + local58 * (float) -local174);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
						this.aClass1_Sub17_Sub1_3.method3096(1.0F);
						this.aClass1_Sub17_Sub1_3.method3096(0.0F);
						this.aClass1_Sub17_Sub1_3.method3096(local63 * (float) local174 + local157);
						this.aClass1_Sub17_Sub1_3.method3096(local163 + local67 * (float) local174);
						this.aClass1_Sub17_Sub1_3.method3096(local72 * (float) local174 + local169);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
						this.aClass1_Sub17_Sub1_3.method3096(1.0F);
						this.aClass1_Sub17_Sub1_3.method3096(1.0F);
						this.aClass1_Sub17_Sub1_3.method3096(local157 + local50 * (float) local174);
						this.aClass1_Sub17_Sub1_3.method3096(local54 * (float) local174 + local163);
						this.aClass1_Sub17_Sub1_3.method3096(local169 + local58 * (float) local174);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
						this.aClass1_Sub17_Sub1_3.method3096(0.0F);
						this.aClass1_Sub17_Sub1_3.method3096(1.0F);
						this.aClass1_Sub17_Sub1_3.method3096(local76 * (float) local174 + local157);
						this.aClass1_Sub17_Sub1_3.method3096(local163 + (float) local174 * local80);
						this.aClass1_Sub17_Sub1_3.method3096(local88 * (float) local174 + local169);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
					}
					if (this.anIntArray618[local95] > 64) {
						local435 = this.anIntArray618[local95] - 65;
						for (local133 = this.anIntArray617[local435] - 1; local133 >= 0; local133--) {
							local451 = this.aClass46_Sub3_Sub1ArrayArray3[local435][local133];
							local454 = local451.anInt4605;
							local146 = (byte) (local454 >> 16);
							local151 = (byte) (local454 >> 8);
							local467 = (byte) local454;
							local472 = (byte) (local454 >>> 24);
							local169 = local451.anInt4593 >> 12;
							local484 = local451.anInt4601 >> 12;
							local490 = local451.anInt4597 >> 12;
							local495 = local451.anInt4604 >> 12;
							this.aClass1_Sub17_Sub1_3.method3096(0.0F);
							this.aClass1_Sub17_Sub1_3.method3096(0.0F);
							this.aClass1_Sub17_Sub1_3.method3096(local169 + (float) -local495 * local50);
							this.aClass1_Sub17_Sub1_3.method3096(local484 + (float) -local495 * local54);
							this.aClass1_Sub17_Sub1_3.method3096(local490 + (float) -local495 * local58);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
							this.aClass1_Sub17_Sub1_3.method3096(1.0F);
							this.aClass1_Sub17_Sub1_3.method3096(0.0F);
							this.aClass1_Sub17_Sub1_3.method3096(local169 + (float) local495 * local63);
							this.aClass1_Sub17_Sub1_3.method3096((float) local495 * local67 + local484);
							this.aClass1_Sub17_Sub1_3.method3096(local72 * (float) local495 + local490);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
							this.aClass1_Sub17_Sub1_3.method3096(1.0F);
							this.aClass1_Sub17_Sub1_3.method3096(1.0F);
							this.aClass1_Sub17_Sub1_3.method3096((float) local495 * local50 + local169);
							this.aClass1_Sub17_Sub1_3.method3096((float) local495 * local54 + local484);
							this.aClass1_Sub17_Sub1_3.method3096(local490 + (float) local495 * local58);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
							this.aClass1_Sub17_Sub1_3.method3096(0.0F);
							this.aClass1_Sub17_Sub1_3.method3096(1.0F);
							this.aClass1_Sub17_Sub1_3.method3096((float) local495 * local76 + local169);
							this.aClass1_Sub17_Sub1_3.method3096(local484 + local80 * (float) local495);
							this.aClass1_Sub17_Sub1_3.method3096(local88 * (float) local495 + local490);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray618[local95] > 64 ? 64 : this.anIntArray618[local95];
				if (local112 > 0) {
					for (local121 = local112 - 1; local121 >= 0; local121--) {
						local130 = this.aClass46_Sub3_Sub1ArrayArray4[local95][local121];
						local133 = local130.anInt4605;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt4593 >> 12;
						local163 = local130.anInt4601 >> 12;
						local169 = local130.anInt4597 >> 12;
						local174 = local130.anInt4604 >> 12;
						this.aClass1_Sub17_Sub1_3.method3095(0.0F);
						this.aClass1_Sub17_Sub1_3.method3095(0.0F);
						this.aClass1_Sub17_Sub1_3.method3095((float) -local174 * local50 + local157);
						this.aClass1_Sub17_Sub1_3.method3095(local163 + (float) -local174 * local54);
						this.aClass1_Sub17_Sub1_3.method3095(local58 * (float) -local174 + local169);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
						this.aClass1_Sub17_Sub1_3.method3095(1.0F);
						this.aClass1_Sub17_Sub1_3.method3095(0.0F);
						this.aClass1_Sub17_Sub1_3.method3095(local63 * (float) local174 + local157);
						this.aClass1_Sub17_Sub1_3.method3095(local163 + local67 * (float) local174);
						this.aClass1_Sub17_Sub1_3.method3095(local169 + local72 * (float) local174);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
						this.aClass1_Sub17_Sub1_3.method3095(1.0F);
						this.aClass1_Sub17_Sub1_3.method3095(1.0F);
						this.aClass1_Sub17_Sub1_3.method3095(local157 + local50 * (float) local174);
						this.aClass1_Sub17_Sub1_3.method3095(local163 + (float) local174 * local54);
						this.aClass1_Sub17_Sub1_3.method3095(local58 * (float) local174 + local169);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
						this.aClass1_Sub17_Sub1_3.method3095(0.0F);
						this.aClass1_Sub17_Sub1_3.method3095(1.0F);
						this.aClass1_Sub17_Sub1_3.method3095((float) local174 * local76 + local157);
						this.aClass1_Sub17_Sub1_3.method3095(local163 + (float) local174 * local80);
						this.aClass1_Sub17_Sub1_3.method3095(local88 * (float) local174 + local169);
						this.aClass1_Sub17_Sub1_3.method4451(local138);
						this.aClass1_Sub17_Sub1_3.method4451(local143);
						this.aClass1_Sub17_Sub1_3.method4451(local146);
						this.aClass1_Sub17_Sub1_3.method4451(local151);
					}
					if (this.anIntArray618[local95] > 64) {
						local435 = this.anIntArray618[local95] - 1 - 64;
						for (local133 = this.anIntArray617[local435] - 1; local133 >= 0; local133--) {
							local451 = this.aClass46_Sub3_Sub1ArrayArray3[local435][local133];
							local454 = local451.anInt4605;
							local146 = (byte) (local454 >> 16);
							local151 = (byte) (local454 >> 8);
							local467 = (byte) local454;
							local472 = (byte) (local454 >>> 24);
							local169 = local451.anInt4593 >> 12;
							local484 = local451.anInt4601 >> 12;
							local490 = local451.anInt4597 >> 12;
							local495 = local451.anInt4604 >> 12;
							this.aClass1_Sub17_Sub1_3.method3095(0.0F);
							this.aClass1_Sub17_Sub1_3.method3095(0.0F);
							this.aClass1_Sub17_Sub1_3.method3095(local50 * (float) -local495 + local169);
							this.aClass1_Sub17_Sub1_3.method3095(local484 + local54 * (float) -local495);
							this.aClass1_Sub17_Sub1_3.method3095(local490 + (float) -local495 * local58);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
							this.aClass1_Sub17_Sub1_3.method3095(1.0F);
							this.aClass1_Sub17_Sub1_3.method3095(0.0F);
							this.aClass1_Sub17_Sub1_3.method3095(local169 + local63 * (float) local495);
							this.aClass1_Sub17_Sub1_3.method3095((float) local495 * local67 + local484);
							this.aClass1_Sub17_Sub1_3.method3095(local490 + (float) local495 * local72);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
							this.aClass1_Sub17_Sub1_3.method3095(1.0F);
							this.aClass1_Sub17_Sub1_3.method3095(1.0F);
							this.aClass1_Sub17_Sub1_3.method3095((float) local495 * local50 + local169);
							this.aClass1_Sub17_Sub1_3.method3095(local484 + local54 * (float) local495);
							this.aClass1_Sub17_Sub1_3.method3095(local490 + (float) local495 * local58);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
							this.aClass1_Sub17_Sub1_3.method3095(0.0F);
							this.aClass1_Sub17_Sub1_3.method3095(1.0F);
							this.aClass1_Sub17_Sub1_3.method3095(local169 + local76 * (float) local495);
							this.aClass1_Sub17_Sub1_3.method3095(local80 * (float) local495 + local484);
							this.aClass1_Sub17_Sub1_3.method3095(local88 * (float) local495 + local490);
							this.aClass1_Sub17_Sub1_3.method4451(local146);
							this.aClass1_Sub17_Sub1_3.method4451(local151);
							this.aClass1_Sub17_Sub1_3.method4451(local467);
							this.aClass1_Sub17_Sub1_3.method4451(local472);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub17_Sub1_3.anInt4872 != 0) {
			this.anInterface15_5.method3792(this.aClass1_Sub17_Sub1_3.anInt4872, this.aClass1_Sub17_Sub1_3.aByteArray58, 24);
			arg0.method5298(this.aClass258_10, this.aClass258_11, this.aClass258_9, null);
			arg0.method5236(this.aClass1_Sub17_Sub1_3.anInt4872 / 24);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!mh;Lclient!ka;B)V")
	public void method5752(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) Class158 arg1) {
		if (arg0.aClass128_Sub2_3 == null) {
			return;
		}
		this.method5754(arg0);
		@Pc(17) float local17 = arg0.aClass128_Sub2_3.aFloat92;
		@Pc(21) float local21 = arg0.aClass128_Sub2_3.aFloat91;
		@Pc(25) float local25 = arg0.aClass128_Sub2_3.aFloat99;
		@Pc(29) float local29 = arg0.aClass128_Sub2_3.aFloat96;
		try {
			@Pc(34) int local34;
			@Pc(36) int local36;
			@Pc(42) Class46_Sub3 local42;
			@Pc(145) int local145;
			@Pc(302) Class46_Sub3_Sub1[] local302;
			@Pc(156) int local156;
			@Pc(312) int local312;
			@Pc(314) int local314;
			if (arg1.aBoolean355) {
				local34 = arg1.anInt4644 - arg1.anInt4643;
				if (local34 + 2 <= 1600) {
					local34 += 2;
					local36 = 0;
				} else {
					local36 = Static509.method7779(local34) + 1 - this.anInt6338;
					local34 = (local34 >> local36) + 2;
				}
				@Pc(410) Class46_Sub3 local410 = arg1.aClass185_1.aClass46_Sub3_7;
				local42 = local410.aClass46_Sub3_9;
				@Pc(415) int local415 = -2;
				@Pc(417) boolean local417 = true;
				@Pc(419) boolean local419 = true;
				while (local410 != local42) {
					this.anInt6339 = 0;
					for (local145 = 0; local145 < local34; local145++) {
						this.anIntArray618[local145] = 0;
					}
					for (@Pc(443) int local443 = 0; local443 < 64; local443++) {
						this.anIntArray617[local443] = 0;
					}
					while (local42 != local410) {
						@Pc(461) Class46_Sub3_Sub1 local461 = (Class46_Sub3_Sub1) local42;
						if (local419) {
							local419 = false;
							local415 = local461.anInt4600;
							local417 = local461.aBoolean349;
						} else if (local461.anInt4600 != local415 || local461.aBoolean349 != local417) {
							local419 = true;
							break;
						}
						local156 = (int) (local29 + local25 * (float) (local461.anInt4597 >> 12) + (float) (local461.anInt4601 >> 12) * local21 + (float) (local461.anInt4593 >> 12) * local17) - arg1.anInt4643 >> local36;
						if (local156 < 1600) {
							if (this.anIntArray618[local156] < 64) {
								this.aClass46_Sub3_Sub1ArrayArray4[local156][this.anIntArray618[local156]++] = local461;
							} else {
								label147: {
									if (this.anIntArray618[local156] == 64) {
										if (this.anInt6339 == 64) {
											break label147;
										}
										this.anIntArray618[local156] += this.anInt6339++ + 1;
									}
									local302 = this.aClass46_Sub3_Sub1ArrayArray3[this.anIntArray618[local156] - 64 - 1];
									local312 = this.anIntArray618[local156] - 1 - 64;
									local314 = this.anIntArray617[this.anIntArray618[local156] - 1 - 64];
									this.anIntArray617[local312] = this.anIntArray617[this.anIntArray618[local156] - 1 - 64] + 1;
									local302[local314] = local461;
								}
							}
						}
						local42 = local42.aClass46_Sub3_9;
					}
					if (local415 < 0) {
						arg0.method5238(-1);
					} else {
						arg0.method5238(local415);
					}
					if (local417 && arg0.aFloat121 != Static65.aFloat40) {
						arg0.M(Static65.aFloat40);
					} else if (arg0.aFloat121 != 1.0F) {
						arg0.M(1.0F);
					}
					this.method5750(arg0, local34);
				}
			} else {
				local34 = 0;
				local36 = Integer.MAX_VALUE;
				@Pc(38) int local38 = 0;
				local42 = arg1.aClass185_1.aClass46_Sub3_7;
				@Pc(45) Class46_Sub3 local45;
				@Pc(77) int local77;
				for (local45 = local42.aClass46_Sub3_9; local45 != local42; local45 = local45.aClass46_Sub3_9) {
					@Pc(50) Class46_Sub3_Sub1 local50 = (Class46_Sub3_Sub1) local45;
					local77 = (int) (local29 + local25 * (float) (local50.anInt4597 >> 12) + local17 * (float) (local50.anInt4593 >> 12) + local21 * (float) (local50.anInt4601 >> 12));
					if (local38 < local77) {
						local38 = local77;
					}
					this.anIntArray616[local34++] = local77;
					if (local36 > local77) {
						local36 = local77;
					}
				}
				@Pc(112) int local112 = local38 - local36;
				if (local112 + 2 <= 1600) {
					local112 += 2;
					local77 = 0;
				} else {
					local77 = Static509.method7779(local112) + 1 - this.anInt6338;
					local112 = (local112 >> local77) + 2;
				}
				local45 = local42.aClass46_Sub3_9;
				local34 = 0;
				local145 = -2;
				@Pc(147) boolean local147 = true;
				@Pc(149) boolean local149 = true;
				while (local42 != local45) {
					this.anInt6339 = 0;
					for (local156 = 0; local156 < local112; local156++) {
						this.anIntArray618[local156] = 0;
					}
					for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
						this.anIntArray617[local173] = 0;
					}
					while (local45 != local42) {
						@Pc(191) Class46_Sub3_Sub1 local191 = (Class46_Sub3_Sub1) local45;
						if (local149) {
							local149 = false;
							local147 = local191.aBoolean349;
							local145 = local191.anInt4600;
						}
						if (local34 > 0 && (local191.anInt4600 != local145 || local147 != local191.aBoolean349)) {
							local149 = true;
							break;
						}
						@Pc(237) int local237 = this.anIntArray616[local34++] - local36 >> local77;
						if (local237 < 1600) {
							if (this.anIntArray618[local237] < 64) {
								this.aClass46_Sub3_Sub1ArrayArray4[local237][this.anIntArray618[local237]++] = local191;
							} else {
								label192: {
									if (this.anIntArray618[local237] == 64) {
										if (this.anInt6339 == 64) {
											break label192;
										}
										this.anIntArray618[local237] += this.anInt6339++ + 1;
									}
									local302 = this.aClass46_Sub3_Sub1ArrayArray3[this.anIntArray618[local237] - 64 - 1];
									local312 = this.anIntArray618[local237] - 1 - 64;
									local314 = this.anIntArray617[this.anIntArray618[local237] - 1 - 64];
									this.anIntArray617[local312] = this.anIntArray617[this.anIntArray618[local237] - 1 - 64] + 1;
									local302[local314] = local191;
								}
							}
						}
						local45 = local45.aClass46_Sub3_9;
					}
					if (local145 < 0) {
						arg0.method5238(-1);
					} else {
						arg0.method5238(local145);
					}
					if (local147 && arg0.aFloat121 != Static65.aFloat40) {
						arg0.M(Static65.aFloat40);
					} else if (arg0.aFloat121 != 1.0F) {
						arg0.M(1.0F);
					}
					this.method5750(arg0, local112);
				}
			}
		} catch (@Pc(675) Exception local675) {
		}
		this.method5753(arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!mh;)V")
	private void method5753(@OriginalArg(1) Class4_Sub3 arg0) {
		arg0.method5268(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat121 != Static65.aFloat40) {
			arg0.M(Static65.aFloat40);
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Lclient!mh;B)V")
	private void method5754(@OriginalArg(0) Class4_Sub3 arg0) {
		Static65.aFloat40 = arg0.aFloat121;
		arg0.method5254();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5268(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
