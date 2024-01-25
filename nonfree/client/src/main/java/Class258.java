import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class258 {

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "Lclient!ce;")
	private Class45 aClass45_8;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Lclient!ce;")
	private Class45 aClass45_9;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "Lclient!ad;")
	private Interface1 anInterface1_6;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "Lclient!ce;")
	private Class45 aClass45_10;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[F")
	private final float[] aFloatArray55 = new float[16];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!gm;")
	private final Class6_Sub21_Sub1 aClass6_Sub21_Sub1_3 = new Class6_Sub21_Sub1(786336);

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	private final int anInt7207 = Static564.method7583(1600);

	@OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
	private int anInt7208 = 0;

	@OriginalMember(owner = "client!pt", name = "s", descriptor = "[[Lclient!fm;")
	private final Class98_Sub1_Sub1[][] aClass98_Sub1_Sub1ArrayArray2 = new Class98_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "[I")
	private final int[] anIntArray523 = new int[8191];

	@OriginalMember(owner = "client!pt", name = "r", descriptor = "[[Lclient!fm;")
	private final Class98_Sub1_Sub1[][] aClass98_Sub1_Sub1ArrayArray1 = new Class98_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "[I")
	private final int[] anIntArray524 = new int[1600];

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "[I")
	private final int[] anIntArray525 = new int[64];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!jaa;)V")
	private void method5943(@OriginalArg(1) Class14_Sub3 arg0) {
		arg0.method3965(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat90 != Static524.aFloat188) {
			arg0.ha(Static524.aFloat188);
		}
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(ILclient!jaa;)V")
	public void method5944(@OriginalArg(1) Class14_Sub3 arg0) {
		this.anInterface1_6 = arg0.method3927(null, 196584, 24, true);
		this.aClass45_9 = new Class45(this.anInterface1_6, 5126, 2, 0);
		this.aClass45_10 = new Class45(this.anInterface1_6, 5126, 3, 8);
		this.aClass45_8 = new Class45(this.anInterface1_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!jaa;I)V")
	private void method5945(@OriginalArg(0) Class14_Sub3 arg0) {
		Static524.aFloat188 = arg0.aFloat90;
		arg0.method3913();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3965(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!jaa;BLclient!ig;)V")
	public void method5948(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(2) Class144 arg1) {
		if (arg0.aClass54_Sub2_4 == null) {
			return;
		}
		this.method5945(arg0);
		@Pc(21) float local21 = arg0.aClass54_Sub2_4.aFloat123;
		@Pc(25) float local25 = arg0.aClass54_Sub2_4.aFloat122;
		@Pc(29) float local29 = arg0.aClass54_Sub2_4.aFloat127;
		@Pc(33) float local33 = arg0.aClass54_Sub2_4.aFloat121;
		try {
			@Pc(43) int local43;
			@Pc(53) int local53;
			@Pc(77) Class98_Sub1 local77;
			@Pc(90) int local90;
			@Pc(237) Class98_Sub1_Sub1[] local237;
			@Pc(184) int local184;
			@Pc(245) int local245;
			@Pc(247) int local247;
			if (arg1.aBoolean288) {
				local43 = arg1.anInt4175 - arg1.anInt4176;
				if (local43 + 2 <= 1600) {
					local43 += 2;
					local53 = 0;
				} else {
					local53 = Static564.method7583(local43) + 1 - this.anInt7207;
					local43 = (local43 >> local53) + 2;
				}
				@Pc(74) Class98_Sub1 local74 = arg1.aClass254_1.aClass98_Sub1_7;
				local77 = local74.aClass98_Sub1_10;
				@Pc(79) int local79 = -2;
				@Pc(81) boolean local81 = true;
				@Pc(83) boolean local83 = true;
				while (local74 != local77) {
					this.anInt7208 = 0;
					for (local90 = 0; local90 < local43; local90++) {
						this.anIntArray524[local90] = 0;
					}
					for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
						this.anIntArray525[local103] = 0;
					}
					while (local74 != local77) {
						@Pc(119) Class98_Sub1_Sub1 local119 = (Class98_Sub1_Sub1) local77;
						if (local83) {
							local83 = false;
							local81 = local119.aBoolean730;
							local79 = local119.anInt9524;
						} else if (local79 != local119.anInt9524 || local119.aBoolean730 != local81) {
							local83 = true;
							break;
						}
						local184 = (int) (local33 + (float) (local119.anInt9523 >> 12) * local25 + (float) (local119.anInt9517 >> 12) * local21 + local29 * (float) (local119.anInt9520 >> 12)) - arg1.anInt4176 >> local53;
						if (local184 < 1600) {
							if (this.anIntArray524[local184] >= 64) {
								label192: {
									if (this.anIntArray524[local184] == 64) {
										if (this.anInt7208 == 64) {
											break label192;
										}
										this.anIntArray524[local184] += this.anInt7208++ + 1;
									}
									local237 = this.aClass98_Sub1_Sub1ArrayArray1[this.anIntArray524[local184] - 64 - 1];
									local245 = this.anIntArray524[local184] - 65;
									local247 = this.anIntArray525[this.anIntArray524[local184] - 65];
									this.anIntArray525[local245] = this.anIntArray525[this.anIntArray524[local184] - 65] + 1;
									local237[local247] = local119;
								}
							} else {
								this.aClass98_Sub1_Sub1ArrayArray2[local184][this.anIntArray524[local184]++] = local119;
							}
						}
						local77 = local77.aClass98_Sub1_10;
					}
					if (local79 >= 0) {
						arg0.method3962(local79);
					} else {
						arg0.method3962(-1);
					}
					if (local81 && Static524.aFloat188 != arg0.aFloat90) {
						arg0.ha(Static524.aFloat188);
					} else if (arg0.aFloat90 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method5949(arg0, local43);
				}
			} else {
				local43 = 0;
				local53 = Integer.MAX_VALUE;
				@Pc(327) int local327 = 0;
				local77 = arg1.aClass254_1.aClass98_Sub1_7;
				@Pc(334) Class98_Sub1 local334;
				@Pc(366) int local366;
				for (local334 = local77.aClass98_Sub1_10; local334 != local77; local334 = local334.aClass98_Sub1_10) {
					@Pc(339) Class98_Sub1_Sub1 local339 = (Class98_Sub1_Sub1) local334;
					local366 = (int) (local25 * (float) (local339.anInt9523 >> 12) + local21 * (float) (local339.anInt9517 >> 12) + local29 * (float) (local339.anInt9520 >> 12) + local33);
					this.anIntArray523[local43++] = local366;
					if (local53 > local366) {
						local53 = local366;
					}
					if (local327 < local366) {
						local327 = local366;
					}
				}
				@Pc(400) int local400 = local327 - local53;
				if (local400 + 2 > 1600) {
					local366 = Static564.method7583(local400) + 1 - this.anInt7207;
					local400 = (local400 >> local366) + 2;
				} else {
					local366 = 0;
					local400 += 2;
				}
				local334 = local77.aClass98_Sub1_10;
				local43 = 0;
				local90 = -2;
				@Pc(438) boolean local438 = true;
				@Pc(440) boolean local440 = true;
				while (local77 != local334) {
					this.anInt7208 = 0;
					for (local184 = 0; local184 < local400; local184++) {
						this.anIntArray524[local184] = 0;
					}
					for (@Pc(464) int local464 = 0; local464 < 64; local464++) {
						this.anIntArray525[local464] = 0;
					}
					while (local334 != local77) {
						@Pc(480) Class98_Sub1_Sub1 local480 = (Class98_Sub1_Sub1) local334;
						if (local440) {
							local438 = local480.aBoolean730;
							local440 = false;
							local90 = local480.anInt9524;
						}
						if (local43 > 0 && (local90 != local480.anInt9524 || local438 != local480.aBoolean730)) {
							local440 = true;
							break;
						}
						@Pc(522) int local522 = this.anIntArray523[local43++] - local53 >> local366;
						if (local522 < 1600) {
							if (this.anIntArray524[local522] < 64) {
								this.aClass98_Sub1_Sub1ArrayArray2[local522][this.anIntArray524[local522]++] = local480;
							} else {
								label142: {
									if (this.anIntArray524[local522] == 64) {
										if (this.anInt7208 == 64) {
											break label142;
										}
										this.anIntArray524[local522] += this.anInt7208++ + 1;
									}
									local237 = this.aClass98_Sub1_Sub1ArrayArray1[this.anIntArray524[local522] - 1 - 64];
									local245 = this.anIntArray524[local522] - 64 - 1;
									local247 = this.anIntArray525[this.anIntArray524[local522] - 64 - 1];
									this.anIntArray525[local245] = this.anIntArray525[this.anIntArray524[local522] - 64 - 1] + 1;
									local237[local247] = local480;
								}
							}
						}
						local334 = local334.aClass98_Sub1_10;
					}
					if (local90 >= 0) {
						arg0.method3962(local90);
					} else {
						arg0.method3962(-1);
					}
					if (local438 && Static524.aFloat188 != arg0.aFloat90) {
						arg0.ha(Static524.aFloat188);
					} else if (arg0.aFloat90 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method5949(arg0, local400);
				}
			}
		} catch (@Pc(657) Exception local657) {
		}
		this.method5943(arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!jaa;II)V")
	private void method5949(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray55, 0);
		@Pc(15) float local15 = this.aFloatArray55[0];
		@Pc(20) float local20 = this.aFloatArray55[4];
		@Pc(25) float local25 = this.aFloatArray55[8];
		@Pc(30) float local30 = this.aFloatArray55[1];
		@Pc(35) float local35 = this.aFloatArray55[5];
		@Pc(40) float local40 = this.aFloatArray55[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(70) float local70 = local25 - local40;
		@Pc(75) float local75 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		this.aClass6_Sub21_Sub1_3.anInt7338 = 0;
		@Pc(88) float local88 = local40 - local25;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class98_Sub1_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(501) float local501;
		@Pc(506) int local506;
		@Pc(446) int local446;
		@Pc(462) Class98_Sub1_Sub1 local462;
		@Pc(465) int local465;
		@Pc(478) byte local478;
		@Pc(483) byte local483;
		@Pc(495) float local495;
		if (arg0.aBoolean298) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray524[local95] <= 64 ? this.anIntArray524[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass98_Sub1_Sub1ArrayArray2[local95][local119];
						local131 = local128.anInt9521;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt9517 >> 12;
						local161 = local128.anInt9523 >> 12;
						local167 = local128.anInt9520 >> 12;
						local172 = local128.anInt9516 >> 12;
						this.aClass6_Sub21_Sub1_3.method3128(0.0F);
						this.aClass6_Sub21_Sub1_3.method3128(0.0F);
						this.aClass6_Sub21_Sub1_3.method3128((float) -local172 * local44 + local155);
						this.aClass6_Sub21_Sub1_3.method3128((float) -local172 * local48 + local161);
						this.aClass6_Sub21_Sub1_3.method3128(local167 + (float) -local172 * local52);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
						this.aClass6_Sub21_Sub1_3.method3128(1.0F);
						this.aClass6_Sub21_Sub1_3.method3128(0.0F);
						this.aClass6_Sub21_Sub1_3.method3128(local155 + local56 * (float) local172);
						this.aClass6_Sub21_Sub1_3.method3128(local161 + (float) local172 * local60);
						this.aClass6_Sub21_Sub1_3.method3128(local167 + local70 * (float) local172);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
						this.aClass6_Sub21_Sub1_3.method3128(1.0F);
						this.aClass6_Sub21_Sub1_3.method3128(1.0F);
						this.aClass6_Sub21_Sub1_3.method3128(local155 + local44 * (float) local172);
						this.aClass6_Sub21_Sub1_3.method3128((float) local172 * local48 + local161);
						this.aClass6_Sub21_Sub1_3.method3128(local167 + local52 * (float) local172);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
						this.aClass6_Sub21_Sub1_3.method3128(0.0F);
						this.aClass6_Sub21_Sub1_3.method3128(1.0F);
						this.aClass6_Sub21_Sub1_3.method3128(local155 + (float) local172 * local75);
						this.aClass6_Sub21_Sub1_3.method3128(local80 * (float) local172 + local161);
						this.aClass6_Sub21_Sub1_3.method3128((float) local172 * local88 + local167);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
					}
					if (this.anIntArray524[local95] > 64) {
						local446 = this.anIntArray524[local95] - 64 - 1;
						for (local131 = this.anIntArray525[local446] - 1; local131 >= 0; local131--) {
							local462 = this.aClass98_Sub1_Sub1ArrayArray1[local446][local131];
							local465 = local462.anInt9521;
							local144 = (byte) (local465 >> 16);
							local149 = (byte) (local465 >> 8);
							local478 = (byte) local465;
							local483 = (byte) (local465 >>> 24);
							local167 = local462.anInt9517 >> 12;
							local495 = local462.anInt9523 >> 12;
							local501 = local462.anInt9520 >> 12;
							local506 = local462.anInt9516 >> 12;
							this.aClass6_Sub21_Sub1_3.method3128(0.0F);
							this.aClass6_Sub21_Sub1_3.method3128(0.0F);
							this.aClass6_Sub21_Sub1_3.method3128(local167 + (float) -local506 * local44);
							this.aClass6_Sub21_Sub1_3.method3128(local48 * (float) -local506 + local495);
							this.aClass6_Sub21_Sub1_3.method3128((float) -local506 * local52 + local501);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
							this.aClass6_Sub21_Sub1_3.method3128(1.0F);
							this.aClass6_Sub21_Sub1_3.method3128(0.0F);
							this.aClass6_Sub21_Sub1_3.method3128(local167 + local56 * (float) local506);
							this.aClass6_Sub21_Sub1_3.method3128(local60 * (float) local506 + local495);
							this.aClass6_Sub21_Sub1_3.method3128(local501 + local70 * (float) local506);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
							this.aClass6_Sub21_Sub1_3.method3128(1.0F);
							this.aClass6_Sub21_Sub1_3.method3128(1.0F);
							this.aClass6_Sub21_Sub1_3.method3128((float) local506 * local44 + local167);
							this.aClass6_Sub21_Sub1_3.method3128(local48 * (float) local506 + local495);
							this.aClass6_Sub21_Sub1_3.method3128((float) local506 * local52 + local501);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
							this.aClass6_Sub21_Sub1_3.method3128(0.0F);
							this.aClass6_Sub21_Sub1_3.method3128(1.0F);
							this.aClass6_Sub21_Sub1_3.method3128(local167 + (float) local506 * local75);
							this.aClass6_Sub21_Sub1_3.method3128(local80 * (float) local506 + local495);
							this.aClass6_Sub21_Sub1_3.method3128(local88 * (float) local506 + local501);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray524[local95] <= 64 ? this.anIntArray524[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass98_Sub1_Sub1ArrayArray2[local95][local119];
						local131 = local128.anInt9521;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt9517 >> 12;
						local161 = local128.anInt9523 >> 12;
						local167 = local128.anInt9520 >> 12;
						local172 = local128.anInt9516 >> 12;
						this.aClass6_Sub21_Sub1_3.method3126(0.0F);
						this.aClass6_Sub21_Sub1_3.method3126(0.0F);
						this.aClass6_Sub21_Sub1_3.method3126(local155 + (float) -local172 * local44);
						this.aClass6_Sub21_Sub1_3.method3126((float) -local172 * local48 + local161);
						this.aClass6_Sub21_Sub1_3.method3126((float) -local172 * local52 + local167);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
						this.aClass6_Sub21_Sub1_3.method3126(1.0F);
						this.aClass6_Sub21_Sub1_3.method3126(0.0F);
						this.aClass6_Sub21_Sub1_3.method3126(local155 + (float) local172 * local56);
						this.aClass6_Sub21_Sub1_3.method3126(local161 + (float) local172 * local60);
						this.aClass6_Sub21_Sub1_3.method3126(local70 * (float) local172 + local167);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
						this.aClass6_Sub21_Sub1_3.method3126(1.0F);
						this.aClass6_Sub21_Sub1_3.method3126(1.0F);
						this.aClass6_Sub21_Sub1_3.method3126((float) local172 * local44 + local155);
						this.aClass6_Sub21_Sub1_3.method3126(local161 + (float) local172 * local48);
						this.aClass6_Sub21_Sub1_3.method3126(local167 + local52 * (float) local172);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
						this.aClass6_Sub21_Sub1_3.method3126(0.0F);
						this.aClass6_Sub21_Sub1_3.method3126(1.0F);
						this.aClass6_Sub21_Sub1_3.method3126(local155 + (float) local172 * local75);
						this.aClass6_Sub21_Sub1_3.method3126(local161 + local80 * (float) local172);
						this.aClass6_Sub21_Sub1_3.method3126(local88 * (float) local172 + local167);
						this.aClass6_Sub21_Sub1_3.method6062(local136);
						this.aClass6_Sub21_Sub1_3.method6062(local141);
						this.aClass6_Sub21_Sub1_3.method6062(local144);
						this.aClass6_Sub21_Sub1_3.method6062(local149);
					}
					if (this.anIntArray524[local95] > 64) {
						local446 = this.anIntArray524[local95] - 1 - 64;
						for (local131 = this.anIntArray525[local446] - 1; local131 >= 0; local131--) {
							local462 = this.aClass98_Sub1_Sub1ArrayArray1[local446][local131];
							local465 = local462.anInt9521;
							local144 = (byte) (local465 >> 16);
							local149 = (byte) (local465 >> 8);
							local478 = (byte) local465;
							local483 = (byte) (local465 >>> 24);
							local167 = local462.anInt9517 >> 12;
							local495 = local462.anInt9523 >> 12;
							local501 = local462.anInt9520 >> 12;
							local506 = local462.anInt9516 >> 12;
							this.aClass6_Sub21_Sub1_3.method3126(0.0F);
							this.aClass6_Sub21_Sub1_3.method3126(0.0F);
							this.aClass6_Sub21_Sub1_3.method3126(local44 * (float) -local506 + local167);
							this.aClass6_Sub21_Sub1_3.method3126(local48 * (float) -local506 + local495);
							this.aClass6_Sub21_Sub1_3.method3126(local52 * (float) -local506 + local501);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
							this.aClass6_Sub21_Sub1_3.method3126(1.0F);
							this.aClass6_Sub21_Sub1_3.method3126(0.0F);
							this.aClass6_Sub21_Sub1_3.method3126(local56 * (float) local506 + local167);
							this.aClass6_Sub21_Sub1_3.method3126((float) local506 * local60 + local495);
							this.aClass6_Sub21_Sub1_3.method3126(local501 + (float) local506 * local70);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
							this.aClass6_Sub21_Sub1_3.method3126(1.0F);
							this.aClass6_Sub21_Sub1_3.method3126(1.0F);
							this.aClass6_Sub21_Sub1_3.method3126(local167 + (float) local506 * local44);
							this.aClass6_Sub21_Sub1_3.method3126((float) local506 * local48 + local495);
							this.aClass6_Sub21_Sub1_3.method3126(local501 + local52 * (float) local506);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
							this.aClass6_Sub21_Sub1_3.method3126(0.0F);
							this.aClass6_Sub21_Sub1_3.method3126(1.0F);
							this.aClass6_Sub21_Sub1_3.method3126(local75 * (float) local506 + local167);
							this.aClass6_Sub21_Sub1_3.method3126(local495 + local80 * (float) local506);
							this.aClass6_Sub21_Sub1_3.method3126(local501 + (float) local506 * local88);
							this.aClass6_Sub21_Sub1_3.method6062(local144);
							this.aClass6_Sub21_Sub1_3.method6062(local149);
							this.aClass6_Sub21_Sub1_3.method6062(local478);
							this.aClass6_Sub21_Sub1_3.method6062(local483);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub21_Sub1_3.anInt7338 != 0) {
			this.anInterface1_6.method5393(24, this.aClass6_Sub21_Sub1_3.anInt7338, this.aClass6_Sub21_Sub1_3.aByteArray93);
			arg0.method3981(this.aClass45_9, this.aClass45_8, this.aClass45_10, null);
			arg0.method3911(this.aClass6_Sub21_Sub1_3.anInt7338 / 24);
		}
	}
}
