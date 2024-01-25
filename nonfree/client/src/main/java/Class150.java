import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class150 {

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!ff;")
	private Class80 aClass80_6;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "Lclient!ff;")
	private Class80 aClass80_7;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "Lclient!ff;")
	private Class80 aClass80_8;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!tg;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "[F")
	private final float[] aFloatArray20 = new float[16];

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!hi;")
	private final Class1_Sub19_Sub1 aClass1_Sub19_Sub1_3 = new Class1_Sub19_Sub1(786336);

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	private final int anInt4362 = Static357.method4688(1600);

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "[I")
	private final int[] anIntArray320 = new int[1600];

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "[[Lclient!rl;")
	private final Class111_Sub1_Sub2[][] aClass111_Sub1_Sub2ArrayArray1 = new Class111_Sub1_Sub2[1600][64];

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "[[Lclient!rl;")
	private final Class111_Sub1_Sub2[][] aClass111_Sub1_Sub2ArrayArray2 = new Class111_Sub1_Sub2[64][768];

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "[I")
	private final int[] anIntArray321 = new int[64];

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "[I")
	private final int[] anIntArray322 = new int[8191];

	@OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
	private int anInt4363 = 0;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ih;)V")
	public void method3461(@OriginalArg(1) Class117_Sub1 arg0) {
		this.anInterface9_5 = arg0.method2459(24, true, 196584, null);
		this.aClass80_7 = new Class80(this.anInterface9_5, 5126, 2, 0);
		this.aClass80_6 = new Class80(this.anInterface9_5, 5126, 3, 8);
		this.aClass80_8 = new Class80(this.anInterface9_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!ih;)V")
	private void method3462(@OriginalArg(1) Class117_Sub1 arg0) {
		Static240.aFloat59 = arg0.aFloat31;
		arg0.method2522();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2469(false);
		arg0.method2531(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(ILclient!ih;)V")
	private void method3463(@OriginalArg(1) Class117_Sub1 arg0) {
		arg0.method2469(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat31 != Static240.aFloat59) {
			arg0.JA(Static240.aFloat59);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!sj;ILclient!ih;)V")
	public void method3465(@OriginalArg(0) Class232 arg0, @OriginalArg(2) Class117_Sub1 arg1) {
		if (arg1.aClass34_Sub2_3 == null) {
			return;
		}
		this.method3462(arg1);
		@Pc(23) float local23 = arg1.aClass34_Sub2_3.aFloat22;
		@Pc(27) float local27 = arg1.aClass34_Sub2_3.aFloat16;
		@Pc(31) float local31 = arg1.aClass34_Sub2_3.aFloat19;
		@Pc(35) float local35 = arg1.aClass34_Sub2_3.aFloat26;
		try {
			@Pc(40) int local40;
			@Pc(42) int local42;
			@Pc(48) Class111_Sub1 local48;
			@Pc(145) int local145;
			@Pc(156) int local156;
			@Pc(309) int local309;
			@Pc(311) int local311;
			@Pc(301) Class111_Sub1_Sub2[] local301;
			if (arg0.aBoolean536) {
				local40 = arg0.anInt6067 - arg0.anInt6068;
				if (local40 + 2 > 1600) {
					local42 = Static357.method4688(local40) + 1 - this.anInt4362;
					local40 = (local40 >> local42) + 2;
				} else {
					local42 = 0;
					local40 += 2;
				}
				@Pc(422) Class111_Sub1 local422 = arg0.aClass15_1.aClass111_Sub1_1;
				local48 = local422.aClass111_Sub1_10;
				@Pc(427) int local427 = -2;
				@Pc(429) boolean local429 = true;
				@Pc(431) boolean local431 = true;
				while (local422 != local48) {
					this.anInt4363 = 0;
					for (local145 = 0; local145 < local40; local145++) {
						this.anIntArray320[local145] = 0;
					}
					for (@Pc(451) int local451 = 0; local451 < 64; local451++) {
						this.anIntArray321[local451] = 0;
					}
					while (local48 != local422) {
						@Pc(469) Class111_Sub1_Sub2 local469 = (Class111_Sub1_Sub2) local48;
						if (local431) {
							local427 = local469.anInt6562;
							local431 = false;
							local429 = local469.aBoolean573;
						} else if (local427 != local469.anInt6562 || local429 != local469.aBoolean573) {
							local431 = true;
							break;
						}
						local156 = (int) (local31 * (float) (local469.anInt6565 >> 12) + (float) (local469.anInt6560 >> 12) * local23 + (float) (local469.anInt6566 >> 12) * local27 + local35) - arg0.anInt6068 >> local42;
						if (local156 < 1600) {
							if (this.anIntArray320[local156] >= 64) {
								label142: {
									if (this.anIntArray320[local156] == 64) {
										if (this.anInt4363 == 64) {
											break label142;
										}
										this.anIntArray320[local156] += this.anInt4363++ + 1;
									}
									local301 = this.aClass111_Sub1_Sub2ArrayArray2[this.anIntArray320[local156] - 64 - 1];
									local309 = this.anIntArray320[local156] - 65;
									local311 = this.anIntArray321[this.anIntArray320[local156] - 65];
									this.anIntArray321[local309] = this.anIntArray321[this.anIntArray320[local156] - 65] + 1;
									local301[local311] = local469;
								}
							} else {
								this.aClass111_Sub1_Sub2ArrayArray1[local156][this.anIntArray320[local156]++] = local469;
							}
						}
						local48 = local48.aClass111_Sub1_10;
					}
					if (local427 < 0) {
						arg1.method2504(null);
					} else {
						arg1.method2504(arg1.aClass141_1.method3098(local427));
						arg1.method2535(arg1.anInterface4_10.method5090(local427).anInt355);
					}
					if (local429 && arg1.aFloat31 != Static240.aFloat59) {
						arg1.JA(Static240.aFloat59);
					} else if (arg1.aFloat31 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method3466(local40, arg1);
				}
			} else {
				local40 = 0;
				local42 = Integer.MAX_VALUE;
				@Pc(44) int local44 = 0;
				local48 = arg0.aClass15_1.aClass111_Sub1_1;
				@Pc(51) Class111_Sub1 local51;
				@Pc(83) int local83;
				for (local51 = local48.aClass111_Sub1_10; local51 != local48; local51 = local51.aClass111_Sub1_10) {
					@Pc(56) Class111_Sub1_Sub2 local56 = (Class111_Sub1_Sub2) local51;
					local83 = (int) (local31 * (float) (local56.anInt6565 >> 12) + (float) (local56.anInt6566 >> 12) * local27 + (float) (local56.anInt6560 >> 12) * local23 + local35);
					if (local83 < local42) {
						local42 = local83;
					}
					this.anIntArray322[local40++] = local83;
					if (local44 < local83) {
						local44 = local83;
					}
				}
				@Pc(110) int local110 = local44 - local42;
				if (local110 + 2 > 1600) {
					local83 = Static357.method4688(local110) + 1 - this.anInt4362;
					local110 = (local110 >> local83) + 2;
				} else {
					local83 = 0;
					local110 += 2;
				}
				local51 = local48.aClass111_Sub1_10;
				local40 = 0;
				local145 = -2;
				@Pc(147) boolean local147 = true;
				@Pc(149) boolean local149 = true;
				while (local48 != local51) {
					this.anInt4363 = 0;
					for (local156 = 0; local156 < local110; local156++) {
						this.anIntArray320[local156] = 0;
					}
					for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
						this.anIntArray321[local173] = 0;
					}
					while (local48 != local51) {
						@Pc(191) Class111_Sub1_Sub2 local191 = (Class111_Sub1_Sub2) local51;
						if (local149) {
							local147 = local191.aBoolean573;
							local149 = false;
							local145 = local191.anInt6562;
						}
						if (local40 > 0 && (local191.anInt6562 != local145 || local191.aBoolean573 != local147)) {
							local149 = true;
							break;
						}
						@Pc(234) int local234 = this.anIntArray322[local40++] - local42 >> local83;
						if (local234 < 1600) {
							if (this.anIntArray320[local234] < 64) {
								this.aClass111_Sub1_Sub2ArrayArray1[local234][this.anIntArray320[local234]++] = local191;
							} else {
								label187: {
									if (this.anIntArray320[local234] == 64) {
										if (this.anInt4363 == 64) {
											break label187;
										}
										this.anIntArray320[local234] += this.anInt4363++ + 1;
									}
									local301 = this.aClass111_Sub1_Sub2ArrayArray2[this.anIntArray320[local234] - 64 - 1];
									local309 = this.anIntArray320[local234] - 65;
									local311 = this.anIntArray321[this.anIntArray320[local234] - 65];
									this.anIntArray321[local309] = this.anIntArray321[this.anIntArray320[local234] - 65] + 1;
									local301[local311] = local191;
								}
							}
						}
						local51 = local51.aClass111_Sub1_10;
					}
					if (local145 >= 0) {
						arg1.method2504(arg1.aClass141_1.method3098(local145));
						arg1.method2535(arg1.anInterface4_10.method5090(local145).anInt355);
					} else {
						arg1.method2504(null);
					}
					if (local147 && Static240.aFloat59 != arg1.aFloat31) {
						arg1.JA(Static240.aFloat59);
					} else if (arg1.aFloat31 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method3466(local110, arg1);
				}
			}
		} catch (@Pc(675) Exception local675) {
		}
		this.method3463(arg1);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ih;B)V")
	private void method3466(@OriginalArg(0) int arg0, @OriginalArg(1) Class117_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray20, 0);
		@Pc(15) float local15 = this.aFloatArray20[0];
		@Pc(20) float local20 = this.aFloatArray20[4];
		@Pc(25) float local25 = this.aFloatArray20[8];
		@Pc(30) float local30 = this.aFloatArray20[1];
		@Pc(35) float local35 = this.aFloatArray20[5];
		@Pc(40) float local40 = this.aFloatArray20[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(57) float local57 = local20 + local35;
		@Pc(61) float local61 = local25 + local40;
		@Pc(66) float local66 = local15 - local30;
		@Pc(70) float local70 = local20 - local35;
		@Pc(74) float local74 = local25 - local40;
		@Pc(78) float local78 = local30 - local15;
		@Pc(83) float local83 = local35 - local20;
		this.aClass1_Sub19_Sub1_3.anInt3698 = 0;
		@Pc(91) float local91 = local40 - local25;
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(124) int local124;
		@Pc(133) Class111_Sub1_Sub2 local133;
		@Pc(136) int local136;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(149) byte local149;
		@Pc(154) byte local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(172) float local172;
		@Pc(177) int local177;
		@Pc(498) float local498;
		@Pc(503) int local503;
		@Pc(443) int local443;
		@Pc(459) Class111_Sub1_Sub2 local459;
		@Pc(462) int local462;
		@Pc(475) byte local475;
		@Pc(480) byte local480;
		@Pc(492) float local492;
		if (arg1.aBoolean291) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray320[local98] <= 64 ? this.anIntArray320[local98] : 64;
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass111_Sub1_Sub2ArrayArray1[local98][local124];
						local136 = local133.anInt6561;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt6560 >> 12;
						local166 = local133.anInt6566 >> 12;
						local172 = local133.anInt6565 >> 12;
						local177 = local133.anInt6563 >> 12;
						this.aClass1_Sub19_Sub1_3.method2067(0.0F);
						this.aClass1_Sub19_Sub1_3.method2067(0.0F);
						this.aClass1_Sub19_Sub1_3.method2067(local160 + (float) -local177 * local44);
						this.aClass1_Sub19_Sub1_3.method2067(local166 + local57 * (float) -local177);
						this.aClass1_Sub19_Sub1_3.method2067(local61 * (float) -local177 + local172);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
						this.aClass1_Sub19_Sub1_3.method2067(1.0F);
						this.aClass1_Sub19_Sub1_3.method2067(0.0F);
						this.aClass1_Sub19_Sub1_3.method2067(local160 + local66 * (float) local177);
						this.aClass1_Sub19_Sub1_3.method2067(local70 * (float) local177 + local166);
						this.aClass1_Sub19_Sub1_3.method2067((float) local177 * local74 + local172);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
						this.aClass1_Sub19_Sub1_3.method2067(1.0F);
						this.aClass1_Sub19_Sub1_3.method2067(1.0F);
						this.aClass1_Sub19_Sub1_3.method2067(local160 + (float) local177 * local44);
						this.aClass1_Sub19_Sub1_3.method2067(local166 + (float) local177 * local57);
						this.aClass1_Sub19_Sub1_3.method2067(local172 + local61 * (float) local177);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
						this.aClass1_Sub19_Sub1_3.method2067(0.0F);
						this.aClass1_Sub19_Sub1_3.method2067(1.0F);
						this.aClass1_Sub19_Sub1_3.method2067(local160 + (float) local177 * local78);
						this.aClass1_Sub19_Sub1_3.method2067(local83 * (float) local177 + local166);
						this.aClass1_Sub19_Sub1_3.method2067(local91 * (float) local177 + local172);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
					}
					if (this.anIntArray320[local98] > 64) {
						local443 = this.anIntArray320[local98] - 1 - 64;
						for (local136 = this.anIntArray321[local443] - 1; local136 >= 0; local136--) {
							local459 = this.aClass111_Sub1_Sub2ArrayArray2[local443][local136];
							local462 = local459.anInt6561;
							local149 = (byte) (local462 >> 16);
							local154 = (byte) (local462 >> 8);
							local475 = (byte) local462;
							local480 = (byte) (local462 >>> 24);
							local172 = local459.anInt6560 >> 12;
							local492 = local459.anInt6566 >> 12;
							local498 = local459.anInt6565 >> 12;
							local503 = local459.anInt6563 >> 12;
							this.aClass1_Sub19_Sub1_3.method2067(0.0F);
							this.aClass1_Sub19_Sub1_3.method2067(0.0F);
							this.aClass1_Sub19_Sub1_3.method2067((float) -local503 * local44 + local172);
							this.aClass1_Sub19_Sub1_3.method2067((float) -local503 * local57 + local492);
							this.aClass1_Sub19_Sub1_3.method2067(local498 + local61 * (float) -local503);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
							this.aClass1_Sub19_Sub1_3.method2067(1.0F);
							this.aClass1_Sub19_Sub1_3.method2067(0.0F);
							this.aClass1_Sub19_Sub1_3.method2067((float) local503 * local66 + local172);
							this.aClass1_Sub19_Sub1_3.method2067((float) local503 * local70 + local492);
							this.aClass1_Sub19_Sub1_3.method2067(local498 + (float) local503 * local74);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
							this.aClass1_Sub19_Sub1_3.method2067(1.0F);
							this.aClass1_Sub19_Sub1_3.method2067(1.0F);
							this.aClass1_Sub19_Sub1_3.method2067(local172 + (float) local503 * local44);
							this.aClass1_Sub19_Sub1_3.method2067(local492 + local57 * (float) local503);
							this.aClass1_Sub19_Sub1_3.method2067(local61 * (float) local503 + local498);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
							this.aClass1_Sub19_Sub1_3.method2067(0.0F);
							this.aClass1_Sub19_Sub1_3.method2067(1.0F);
							this.aClass1_Sub19_Sub1_3.method2067(local172 + (float) local503 * local78);
							this.aClass1_Sub19_Sub1_3.method2067((float) local503 * local83 + local492);
							this.aClass1_Sub19_Sub1_3.method2067(local91 * (float) local503 + local498);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray320[local98] > 64 ? 64 : this.anIntArray320[local98];
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass111_Sub1_Sub2ArrayArray1[local98][local124];
						local136 = local133.anInt6561;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt6560 >> 12;
						local166 = local133.anInt6566 >> 12;
						local172 = local133.anInt6565 >> 12;
						local177 = local133.anInt6563 >> 12;
						this.aClass1_Sub19_Sub1_3.method2063(0.0F);
						this.aClass1_Sub19_Sub1_3.method2063(0.0F);
						this.aClass1_Sub19_Sub1_3.method2063((float) -local177 * local44 + local160);
						this.aClass1_Sub19_Sub1_3.method2063(local166 + local57 * (float) -local177);
						this.aClass1_Sub19_Sub1_3.method2063(local172 + local61 * (float) -local177);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
						this.aClass1_Sub19_Sub1_3.method2063(1.0F);
						this.aClass1_Sub19_Sub1_3.method2063(0.0F);
						this.aClass1_Sub19_Sub1_3.method2063(local160 + (float) local177 * local66);
						this.aClass1_Sub19_Sub1_3.method2063(local70 * (float) local177 + local166);
						this.aClass1_Sub19_Sub1_3.method2063((float) local177 * local74 + local172);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
						this.aClass1_Sub19_Sub1_3.method2063(1.0F);
						this.aClass1_Sub19_Sub1_3.method2063(1.0F);
						this.aClass1_Sub19_Sub1_3.method2063((float) local177 * local44 + local160);
						this.aClass1_Sub19_Sub1_3.method2063((float) local177 * local57 + local166);
						this.aClass1_Sub19_Sub1_3.method2063(local172 + (float) local177 * local61);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
						this.aClass1_Sub19_Sub1_3.method2063(0.0F);
						this.aClass1_Sub19_Sub1_3.method2063(1.0F);
						this.aClass1_Sub19_Sub1_3.method2063((float) local177 * local78 + local160);
						this.aClass1_Sub19_Sub1_3.method2063(local83 * (float) local177 + local166);
						this.aClass1_Sub19_Sub1_3.method2063(local172 + (float) local177 * local91);
						this.aClass1_Sub19_Sub1_3.method2934(local141);
						this.aClass1_Sub19_Sub1_3.method2934(local146);
						this.aClass1_Sub19_Sub1_3.method2934(local149);
						this.aClass1_Sub19_Sub1_3.method2934(local154);
					}
					if (this.anIntArray320[local98] > 64) {
						local443 = this.anIntArray320[local98] - 64 - 1;
						for (local136 = this.anIntArray321[local443] - 1; local136 >= 0; local136--) {
							local459 = this.aClass111_Sub1_Sub2ArrayArray2[local443][local136];
							local462 = local459.anInt6561;
							local149 = (byte) (local462 >> 16);
							local154 = (byte) (local462 >> 8);
							local475 = (byte) local462;
							local480 = (byte) (local462 >>> 24);
							local172 = local459.anInt6560 >> 12;
							local492 = local459.anInt6566 >> 12;
							local498 = local459.anInt6565 >> 12;
							local503 = local459.anInt6563 >> 12;
							this.aClass1_Sub19_Sub1_3.method2063(0.0F);
							this.aClass1_Sub19_Sub1_3.method2063(0.0F);
							this.aClass1_Sub19_Sub1_3.method2063(local172 + local44 * (float) -local503);
							this.aClass1_Sub19_Sub1_3.method2063((float) -local503 * local57 + local492);
							this.aClass1_Sub19_Sub1_3.method2063((float) -local503 * local61 + local498);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
							this.aClass1_Sub19_Sub1_3.method2063(1.0F);
							this.aClass1_Sub19_Sub1_3.method2063(0.0F);
							this.aClass1_Sub19_Sub1_3.method2063(local172 + (float) local503 * local66);
							this.aClass1_Sub19_Sub1_3.method2063((float) local503 * local70 + local492);
							this.aClass1_Sub19_Sub1_3.method2063(local74 * (float) local503 + local498);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
							this.aClass1_Sub19_Sub1_3.method2063(1.0F);
							this.aClass1_Sub19_Sub1_3.method2063(1.0F);
							this.aClass1_Sub19_Sub1_3.method2063(local172 + (float) local503 * local44);
							this.aClass1_Sub19_Sub1_3.method2063(local57 * (float) local503 + local492);
							this.aClass1_Sub19_Sub1_3.method2063(local61 * (float) local503 + local498);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
							this.aClass1_Sub19_Sub1_3.method2063(0.0F);
							this.aClass1_Sub19_Sub1_3.method2063(1.0F);
							this.aClass1_Sub19_Sub1_3.method2063(local172 + local78 * (float) local503);
							this.aClass1_Sub19_Sub1_3.method2063((float) local503 * local83 + local492);
							this.aClass1_Sub19_Sub1_3.method2063(local498 + (float) local503 * local91);
							this.aClass1_Sub19_Sub1_3.method2934(local149);
							this.aClass1_Sub19_Sub1_3.method2934(local154);
							this.aClass1_Sub19_Sub1_3.method2934(local475);
							this.aClass1_Sub19_Sub1_3.method2934(local480);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub19_Sub1_3.anInt3698 != 0) {
			this.anInterface9_5.method3689(24, this.aClass1_Sub19_Sub1_3.anInt3698, this.aClass1_Sub19_Sub1_3.aByteArray38);
			arg1.method2475(this.aClass80_7, null, this.aClass80_8, this.aClass80_6);
			arg1.method2452(this.aClass1_Sub19_Sub1_3.anInt3698 / 24);
		}
	}
}
