import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class250 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!pp;")
	private Class195 aClass195_14;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "Lclient!ql;")
	private Interface12 anInterface12_7;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "Lclient!pp;")
	private Class195 aClass195_15;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!pp;")
	private Class195 aClass195_16;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "[F")
	private final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!sd;")
	private final Class5_Sub15_Sub1 aClass5_Sub15_Sub1_3 = new Class5_Sub15_Sub1(786336);

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
	private final int anInt7131 = Static160.method2271(1600);

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "[I")
	private final int[] anIntArray481 = new int[8191];

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
	private final int[] anIntArray480 = new int[64];

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "[[Lclient!ij;")
	private final Class88_Sub1_Sub1[][] aClass88_Sub1_Sub1ArrayArray1 = new Class88_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "[[Lclient!ij;")
	private final Class88_Sub1_Sub1[][] aClass88_Sub1_Sub1ArrayArray2 = new Class88_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	private int anInt7132 = 0;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
	private final int[] anIntArray482 = new int[1600];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!tt;Z)V")
	public void method5648(@OriginalArg(0) Class200_Sub2 arg0) {
		this.anInterface12_7 = arg0.method5298(null, true, 24, 196584);
		this.aClass195_16 = new Class195(this.anInterface12_7, 5126, 2, 0);
		this.aClass195_15 = new Class195(this.anInterface12_7, 5126, 3, 8);
		this.aClass195_14 = new Class195(this.anInterface12_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!vm;Lclient!tt;B)V")
	public void method5650(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class200_Sub2 arg1) {
		if (arg1.aClass29_Sub1_3 == null) {
			return;
		}
		this.method5653(arg1);
		@Pc(25) float local25 = arg1.aClass29_Sub1_3.aFloat51;
		@Pc(29) float local29 = arg1.aClass29_Sub1_3.aFloat53;
		@Pc(33) float local33 = arg1.aClass29_Sub1_3.aFloat60;
		@Pc(37) float local37 = arg1.aClass29_Sub1_3.aFloat54;
		try {
			@Pc(47) int local47;
			@Pc(61) int local61;
			@Pc(79) Class88_Sub1 local79;
			@Pc(92) int local92;
			@Pc(188) int local188;
			if (arg0.aBoolean484) {
				local47 = arg0.anInt7224 - arg0.anInt7225;
				if (local47 + 2 > 1600) {
					local61 = Static160.method2271(local47) + 1 - this.anInt7131;
					local47 = (local47 >> local61) + 2;
				} else {
					local47 += 2;
					local61 = 0;
				}
				@Pc(76) Class88_Sub1 local76 = arg0.aClass225_1.aClass88_Sub1_9;
				local79 = local76.aClass88_Sub1_7;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local79 != local76) {
					this.anInt7132 = 0;
					for (local92 = 0; local92 < local47; local92++) {
						this.anIntArray482[local92] = 0;
					}
					for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
						this.anIntArray480[local109] = 0;
					}
					while (local76 != local79) {
						@Pc(125) Class88_Sub1_Sub1 local125 = (Class88_Sub1_Sub1) local79;
						if (local85) {
							local85 = false;
							local83 = local125.aBoolean163;
							local81 = local125.anInt2371;
						} else if (local125.anInt2371 != local81 || local83 != local125.aBoolean163) {
							local85 = true;
							break;
						}
						local188 = (int) (local29 * (float) (local125.anInt2372 >> 12) + (float) (local125.anInt2368 >> 12) * local25 + (float) (local125.anInt2373 >> 12) * local33 + local37) - arg0.anInt7225 >> local61;
						if (local188 < 1600) {
							if (this.anIntArray482[local188] >= 64) {
								label192: {
									if (this.anIntArray482[local188] == 64) {
										if (this.anInt7132 == 64) {
											break label192;
										}
										this.anIntArray482[local188] += this.anInt7132++ + 1;
									}
									@Pc(242) Class88_Sub1_Sub1[] local242 = this.aClass88_Sub1_Sub1ArrayArray2[this.anIntArray482[local188] - 1 - 64];
									@Pc(252) int local252 = this.anIntArray482[local188] - 64 - 1;
									@Pc(254) int local254 = this.anIntArray480[this.anIntArray482[local188] - 64 - 1];
									this.anIntArray480[local252] = this.anIntArray480[this.anIntArray482[local188] - 64 - 1] + 1;
									local242[local254] = local125;
								}
							} else {
								this.aClass88_Sub1_Sub1ArrayArray1[local188][this.anIntArray482[local188]++] = local125;
							}
						}
						local79 = local79.aClass88_Sub1_7;
					}
					if (local81 >= 0) {
						arg1.method5312(arg1.aClass187_1.method3823(local81));
						arg1.method5297(arg1.anInterface8_134.method4125(local81).anInt4614);
					} else {
						arg1.method5312(null);
					}
					if (local83 && arg1.aFloat154 != Static449.aFloat180) {
						arg1.JA(Static449.aFloat180);
					} else if (arg1.aFloat154 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method5652(local47, arg1);
				}
			} else {
				local47 = 0;
				local61 = Integer.MAX_VALUE;
				@Pc(344) int local344 = 0;
				local79 = arg0.aClass225_1.aClass88_Sub1_9;
				@Pc(351) Class88_Sub1 local351;
				@Pc(383) int local383;
				for (local351 = local79.aClass88_Sub1_7; local351 != local79; local351 = local351.aClass88_Sub1_7) {
					@Pc(356) Class88_Sub1_Sub1 local356 = (Class88_Sub1_Sub1) local351;
					local383 = (int) ((float) (local356.anInt2373 >> 12) * local33 + (float) (local356.anInt2368 >> 12) * local25 + local29 * (float) (local356.anInt2372 >> 12) + local37);
					this.anIntArray481[local47++] = local383;
					if (local344 < local383) {
						local344 = local383;
					}
					if (local61 > local383) {
						local61 = local383;
					}
				}
				@Pc(413) int local413 = local344 - local61;
				if (local413 + 2 > 1600) {
					local383 = Static160.method2271(local413) + 1 - this.anInt7131;
					local413 = (local413 >> local383) + 2;
				} else {
					local413 += 2;
					local383 = 0;
				}
				local351 = local79.aClass88_Sub1_7;
				local47 = 0;
				local92 = -2;
				@Pc(449) boolean local449 = true;
				@Pc(451) boolean local451 = true;
				while (local79 != local351) {
					this.anInt7132 = 0;
					for (local188 = 0; local188 < local413; local188++) {
						this.anIntArray482[local188] = 0;
					}
					for (@Pc(475) int local475 = 0; local475 < 64; local475++) {
						this.anIntArray480[local475] = 0;
					}
					while (local79 != local351) {
						@Pc(491) Class88_Sub1_Sub1 local491 = (Class88_Sub1_Sub1) local351;
						if (local451) {
							local449 = local491.aBoolean163;
							local92 = local491.anInt2371;
							local451 = false;
						}
						if (local47 > 0 && (local92 != local491.anInt2371 || local449 != local491.aBoolean163)) {
							local451 = true;
							break;
						}
						@Pc(534) int local534 = this.anIntArray481[local47++] - local61 >> local383;
						if (local534 < 1600) {
							if (this.anIntArray482[local534] >= 64) {
								label142: {
									if (this.anIntArray482[local534] == 64) {
										if (this.anInt7132 == 64) {
											break label142;
										}
										this.anIntArray482[local534] += this.anInt7132++ + 1;
									}
									this.aClass88_Sub1_Sub1ArrayArray2[this.anIntArray482[local534] - 1 - 64][this.anIntArray480[this.anIntArray482[local534] - 1 - 64]++] = local491;
								}
							} else {
								this.aClass88_Sub1_Sub1ArrayArray1[local534][this.anIntArray482[local534]++] = local491;
							}
						}
						local351 = local351.aClass88_Sub1_7;
					}
					if (local92 < 0) {
						arg1.method5312(null);
					} else {
						arg1.method5312(arg1.aClass187_1.method3823(local92));
						arg1.method5297(arg1.anInterface8_134.method4125(local92).anInt4614);
					}
					if (local449 && Static449.aFloat180 != arg1.aFloat154) {
						arg1.JA(Static449.aFloat180);
					} else if (arg1.aFloat154 != 1.0F) {
						arg1.JA(1.0F);
					}
					this.method5652(local413, arg1);
				}
			}
		} catch (@Pc(677) Exception local677) {
		}
		this.method5651(arg1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!tt;I)V")
	private void method5651(@OriginalArg(0) Class200_Sub2 arg0) {
		arg0.method5269(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat154 != Static449.aFloat180) {
			arg0.JA(Static449.aFloat180);
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!tt;I)V")
	private void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) Class200_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray30, 0);
		@Pc(15) float local15 = this.aFloatArray30[0];
		@Pc(20) float local20 = this.aFloatArray30[4];
		@Pc(25) float local25 = this.aFloatArray30[8];
		@Pc(30) float local30 = this.aFloatArray30[1];
		@Pc(35) float local35 = this.aFloatArray30[5];
		@Pc(40) float local40 = this.aFloatArray30[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local25 + local40;
		@Pc(57) float local57 = local15 - local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(71) float local71 = local30 - local15;
		@Pc(75) float local75 = local35 - local20;
		@Pc(79) float local79 = local40 - local25;
		this.aClass5_Sub15_Sub1_3.anInt7013 = 0;
		@Pc(90) int local90;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class88_Sub1_Sub1 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(487) float local487;
		@Pc(492) int local492;
		@Pc(432) int local432;
		@Pc(448) Class88_Sub1_Sub1 local448;
		@Pc(451) int local451;
		@Pc(464) byte local464;
		@Pc(469) byte local469;
		@Pc(481) float local481;
		if (arg1.aBoolean433) {
			for (local90 = arg0 - 1; local90 >= 0; local90--) {
				local107 = this.anIntArray482[local90] > 64 ? 64 : this.anIntArray482[local90];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass88_Sub1_Sub1ArrayArray1[local90][local113];
						local125 = local122.anInt2366;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2368 >> 12;
						local155 = local122.anInt2372 >> 12;
						local161 = local122.anInt2373 >> 12;
						local166 = local122.anInt2367 >> 12;
						this.aClass5_Sub15_Sub1_3.method4831(0.0F);
						this.aClass5_Sub15_Sub1_3.method4831(0.0F);
						this.aClass5_Sub15_Sub1_3.method4831(local149 + (float) -local166 * local44);
						this.aClass5_Sub15_Sub1_3.method4831(local155 + (float) -local166 * local48);
						this.aClass5_Sub15_Sub1_3.method4831((float) -local166 * local52 + local161);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
						this.aClass5_Sub15_Sub1_3.method4831(1.0F);
						this.aClass5_Sub15_Sub1_3.method4831(0.0F);
						this.aClass5_Sub15_Sub1_3.method4831(local149 + (float) local166 * local57);
						this.aClass5_Sub15_Sub1_3.method4831(local62 * (float) local166 + local155);
						this.aClass5_Sub15_Sub1_3.method4831(local161 + (float) local166 * local66);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
						this.aClass5_Sub15_Sub1_3.method4831(1.0F);
						this.aClass5_Sub15_Sub1_3.method4831(1.0F);
						this.aClass5_Sub15_Sub1_3.method4831(local149 + local44 * (float) local166);
						this.aClass5_Sub15_Sub1_3.method4831(local155 + (float) local166 * local48);
						this.aClass5_Sub15_Sub1_3.method4831(local52 * (float) local166 + local161);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
						this.aClass5_Sub15_Sub1_3.method4831(0.0F);
						this.aClass5_Sub15_Sub1_3.method4831(1.0F);
						this.aClass5_Sub15_Sub1_3.method4831(local149 + local71 * (float) local166);
						this.aClass5_Sub15_Sub1_3.method4831(local155 + (float) local166 * local75);
						this.aClass5_Sub15_Sub1_3.method4831((float) local166 * local79 + local161);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
					}
					if (this.anIntArray482[local90] > 64) {
						local432 = this.anIntArray482[local90] - 64 - 1;
						for (local125 = this.anIntArray480[local432] - 1; local125 >= 0; local125--) {
							local448 = this.aClass88_Sub1_Sub1ArrayArray2[local432][local125];
							local451 = local448.anInt2366;
							local138 = (byte) (local451 >> 16);
							local143 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local161 = local448.anInt2368 >> 12;
							local481 = local448.anInt2372 >> 12;
							local487 = local448.anInt2373 >> 12;
							local492 = local448.anInt2367 >> 12;
							this.aClass5_Sub15_Sub1_3.method4831(0.0F);
							this.aClass5_Sub15_Sub1_3.method4831(0.0F);
							this.aClass5_Sub15_Sub1_3.method4831(local161 + local44 * (float) -local492);
							this.aClass5_Sub15_Sub1_3.method4831(local481 + local48 * (float) -local492);
							this.aClass5_Sub15_Sub1_3.method4831(local487 + local52 * (float) -local492);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
							this.aClass5_Sub15_Sub1_3.method4831(1.0F);
							this.aClass5_Sub15_Sub1_3.method4831(0.0F);
							this.aClass5_Sub15_Sub1_3.method4831(local57 * (float) local492 + local161);
							this.aClass5_Sub15_Sub1_3.method4831(local481 + (float) local492 * local62);
							this.aClass5_Sub15_Sub1_3.method4831(local487 + local66 * (float) local492);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
							this.aClass5_Sub15_Sub1_3.method4831(1.0F);
							this.aClass5_Sub15_Sub1_3.method4831(1.0F);
							this.aClass5_Sub15_Sub1_3.method4831(local44 * (float) local492 + local161);
							this.aClass5_Sub15_Sub1_3.method4831((float) local492 * local48 + local481);
							this.aClass5_Sub15_Sub1_3.method4831(local52 * (float) local492 + local487);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
							this.aClass5_Sub15_Sub1_3.method4831(0.0F);
							this.aClass5_Sub15_Sub1_3.method4831(1.0F);
							this.aClass5_Sub15_Sub1_3.method4831(local161 + local71 * (float) local492);
							this.aClass5_Sub15_Sub1_3.method4831(local481 + local75 * (float) local492);
							this.aClass5_Sub15_Sub1_3.method4831((float) local492 * local79 + local487);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
						}
					}
				}
			}
		} else {
			for (local90 = arg0 - 1; local90 >= 0; local90--) {
				local107 = this.anIntArray482[local90] > 64 ? 64 : this.anIntArray482[local90];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass88_Sub1_Sub1ArrayArray1[local90][local113];
						local125 = local122.anInt2366;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = local122.anInt2368 >> 12;
						local155 = local122.anInt2372 >> 12;
						local161 = local122.anInt2373 >> 12;
						local166 = local122.anInt2367 >> 12;
						this.aClass5_Sub15_Sub1_3.method4833(0.0F);
						this.aClass5_Sub15_Sub1_3.method4833(0.0F);
						this.aClass5_Sub15_Sub1_3.method4833((float) -local166 * local44 + local149);
						this.aClass5_Sub15_Sub1_3.method4833(local155 + (float) -local166 * local48);
						this.aClass5_Sub15_Sub1_3.method4833(local161 + local52 * (float) -local166);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
						this.aClass5_Sub15_Sub1_3.method4833(1.0F);
						this.aClass5_Sub15_Sub1_3.method4833(0.0F);
						this.aClass5_Sub15_Sub1_3.method4833(local57 * (float) local166 + local149);
						this.aClass5_Sub15_Sub1_3.method4833(local62 * (float) local166 + local155);
						this.aClass5_Sub15_Sub1_3.method4833(local161 + local66 * (float) local166);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
						this.aClass5_Sub15_Sub1_3.method4833(1.0F);
						this.aClass5_Sub15_Sub1_3.method4833(1.0F);
						this.aClass5_Sub15_Sub1_3.method4833((float) local166 * local44 + local149);
						this.aClass5_Sub15_Sub1_3.method4833((float) local166 * local48 + local155);
						this.aClass5_Sub15_Sub1_3.method4833((float) local166 * local52 + local161);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
						this.aClass5_Sub15_Sub1_3.method4833(0.0F);
						this.aClass5_Sub15_Sub1_3.method4833(1.0F);
						this.aClass5_Sub15_Sub1_3.method4833(local149 + (float) local166 * local71);
						this.aClass5_Sub15_Sub1_3.method4833(local155 + (float) local166 * local75);
						this.aClass5_Sub15_Sub1_3.method4833((float) local166 * local79 + local161);
						this.aClass5_Sub15_Sub1_3.method5583(local130);
						this.aClass5_Sub15_Sub1_3.method5583(local135);
						this.aClass5_Sub15_Sub1_3.method5583(local138);
						this.aClass5_Sub15_Sub1_3.method5583(local143);
					}
					if (this.anIntArray482[local90] > 64) {
						local432 = this.anIntArray482[local90] - 64 - 1;
						for (local125 = this.anIntArray480[local432] - 1; local125 >= 0; local125--) {
							local448 = this.aClass88_Sub1_Sub1ArrayArray2[local432][local125];
							local451 = local448.anInt2366;
							local138 = (byte) (local451 >> 16);
							local143 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local161 = local448.anInt2368 >> 12;
							local481 = local448.anInt2372 >> 12;
							local487 = local448.anInt2373 >> 12;
							local492 = local448.anInt2367 >> 12;
							this.aClass5_Sub15_Sub1_3.method4833(0.0F);
							this.aClass5_Sub15_Sub1_3.method4833(0.0F);
							this.aClass5_Sub15_Sub1_3.method4833((float) -local492 * local44 + local161);
							this.aClass5_Sub15_Sub1_3.method4833(local48 * (float) -local492 + local481);
							this.aClass5_Sub15_Sub1_3.method4833((float) -local492 * local52 + local487);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
							this.aClass5_Sub15_Sub1_3.method4833(1.0F);
							this.aClass5_Sub15_Sub1_3.method4833(0.0F);
							this.aClass5_Sub15_Sub1_3.method4833(local57 * (float) local492 + local161);
							this.aClass5_Sub15_Sub1_3.method4833(local481 + local62 * (float) local492);
							this.aClass5_Sub15_Sub1_3.method4833((float) local492 * local66 + local487);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
							this.aClass5_Sub15_Sub1_3.method4833(1.0F);
							this.aClass5_Sub15_Sub1_3.method4833(1.0F);
							this.aClass5_Sub15_Sub1_3.method4833(local161 + local44 * (float) local492);
							this.aClass5_Sub15_Sub1_3.method4833((float) local492 * local48 + local481);
							this.aClass5_Sub15_Sub1_3.method4833(local52 * (float) local492 + local487);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
							this.aClass5_Sub15_Sub1_3.method4833(0.0F);
							this.aClass5_Sub15_Sub1_3.method4833(1.0F);
							this.aClass5_Sub15_Sub1_3.method4833(local161 + (float) local492 * local71);
							this.aClass5_Sub15_Sub1_3.method4833(local481 + (float) local492 * local75);
							this.aClass5_Sub15_Sub1_3.method4833(local79 * (float) local492 + local487);
							this.aClass5_Sub15_Sub1_3.method5583(local138);
							this.aClass5_Sub15_Sub1_3.method5583(local143);
							this.aClass5_Sub15_Sub1_3.method5583(local464);
							this.aClass5_Sub15_Sub1_3.method5583(local469);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub15_Sub1_3.anInt7013 != 0) {
			this.anInterface12_7.method5507(this.aClass5_Sub15_Sub1_3.anInt7013, 24, this.aClass5_Sub15_Sub1_3.aByteArray93);
			arg1.method5311(this.aClass195_14, this.aClass195_16, null, this.aClass195_15);
			arg1.method5270(this.aClass5_Sub15_Sub1_3.anInt7013 / 24);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lclient!tt;I)V")
	private void method5653(@OriginalArg(0) Class200_Sub2 arg0) {
		Static449.aFloat180 = arg0.aFloat154;
		arg0.method5287();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5269(false);
		arg0.method5288(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
