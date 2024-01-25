import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class212 {

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "Lclient!ut;")
	private Class364 aClass364_7;

	@OriginalMember(owner = "client!lk", name = "o", descriptor = "Lclient!ut;")
	private Class364 aClass364_8;

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "Lclient!ot;")
	private Interface21 anInterface21_4;

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "Lclient!ut;")
	private Class364 aClass364_9;

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "[F")
	private final float[] aFloatArray38 = new float[16];

	@OriginalMember(owner = "client!lk", name = "g", descriptor = "Lclient!uba;")
	private final Class3_Sub4_Sub2 aClass3_Sub4_Sub2_2 = new Class3_Sub4_Sub2(786336);

	@OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
	private final int anInt5887 = Static407.method5605(1600);

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "I")
	private int anInt5888 = 0;

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "[I")
	private final int[] anIntArray320 = new int[8191];

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "[I")
	private final int[] anIntArray319 = new int[64];

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "[I")
	private final int[] anIntArray318 = new int[1600];

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "[[Lclient!qca;")
	private final Class34_Sub3_Sub2[][] aClass34_Sub3_Sub2ArrayArray2 = new Class34_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!lk", name = "s", descriptor = "[[Lclient!qca;")
	private final Class34_Sub3_Sub2[][] aClass34_Sub3_Sub2ArrayArray1 = new Class34_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!lf;I)V")
	private void method4992(@OriginalArg(0) Class95_Sub3 arg0) {
		Static218.aFloat72 = arg0.aFloat84;
		arg0.method4873();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4841(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!lf;Lclient!tv;I)V")
	public void method4993(@OriginalArg(1) Class95_Sub3 arg0, @OriginalArg(2) Class347 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass17_Sub3_3 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method4994(arg2, arg0);
		} else {
			this.method4992(arg0);
		}
		@Pc(31) float local31 = arg0.aClass17_Sub3_3.aFloat148;
		@Pc(35) float local35 = arg0.aClass17_Sub3_3.aFloat151;
		@Pc(45) float local45 = arg0.aClass17_Sub3_3.aFloat149;
		@Pc(49) float local49 = arg0.aClass17_Sub3_3.aFloat150;
		try {
			@Pc(51) int local51 = 0;
			@Pc(53) int local53 = Integer.MAX_VALUE;
			@Pc(55) int local55 = 0;
			@Pc(59) Class34_Sub3 local59 = arg1.aClass61_1.aClass34_Sub3_1;
			@Pc(62) Class34_Sub3 local62;
			@Pc(94) int local94;
			for (local62 = local59.aClass34_Sub3_10; local62 != local59; local62 = local62.aClass34_Sub3_10) {
				@Pc(67) Class34_Sub3_Sub2 local67 = (Class34_Sub3_Sub2) local62;
				local94 = (int) (local49 + local45 * (float) (local67.anInt10583 >> 12) + local35 * (float) (local67.anInt10582 >> 12) + local31 * (float) (local67.anInt10579 >> 12));
				this.anIntArray320[local51++] = local94;
				if (local53 > local94) {
					local53 = local94;
				}
				if (local94 > local55) {
					local55 = local94;
				}
			}
			@Pc(129) int local129 = local55 - local53;
			if (local129 + 2 <= 1600) {
				local129 += 2;
				local94 = 0;
			} else {
				local94 = Static407.method5605(local129) + 1 - this.anInt5887;
				local129 = (local129 >> local94) + 2;
			}
			local51 = 0;
			local62 = local59.aClass34_Sub3_10;
			@Pc(163) int local163 = -2;
			@Pc(165) boolean local165 = true;
			@Pc(167) boolean local167 = true;
			while (local59 != local62) {
				this.anInt5888 = 0;
				for (@Pc(174) int local174 = 0; local174 < local129; local174++) {
					this.anIntArray318[local174] = 0;
				}
				for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
					this.anIntArray319[local191] = 0;
				}
				while (local62 != local59) {
					@Pc(209) Class34_Sub3_Sub2 local209 = (Class34_Sub3_Sub2) local62;
					if (local167) {
						local165 = local209.aBoolean732;
						local163 = local209.anInt10586;
						local167 = false;
					}
					if (local51 > 0 && (local209.anInt10586 != local163 || local209.aBoolean732 != local165)) {
						local167 = true;
						break;
					}
					@Pc(248) int local248 = this.anIntArray320[local51++] - local53 >> local94;
					if (local248 < 1600) {
						if (this.anIntArray318[local248] >= 64) {
							label97: {
								if (this.anIntArray318[local248] == 64) {
									if (this.anInt5888 == 64) {
										break label97;
									}
									this.anIntArray318[local248] += this.anInt5888++ + 1;
								}
								this.aClass34_Sub3_Sub2ArrayArray2[this.anIntArray318[local248] - 1 - 64][this.anIntArray319[this.anIntArray318[local248] - 64 - 1]++] = local209;
							}
						} else {
							this.aClass34_Sub3_Sub2ArrayArray1[local248][this.anIntArray318[local248]++] = local209;
						}
					}
					local62 = local62.aClass34_Sub3_10;
				}
				if (local163 < 0) {
					arg0.method4849(-1);
				} else {
					arg0.method4849(local163);
				}
				if (local165 && arg0.aFloat84 != Static218.aFloat72) {
					arg0.xa(Static218.aFloat72);
				} else if (arg0.aFloat84 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method4999(arg0, local129);
			}
		} catch (@Pc(383) Exception local383) {
		}
		this.method4998(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!lf;)V")
	private void method4994(@OriginalArg(1) int arg0, @OriginalArg(2) Class95_Sub3 arg1) {
		Static218.aFloat72 = arg1.aFloat84;
		arg1.method4891((float) arg0);
		arg1.method4881();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method4841(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Lclient!lf;I)V")
	public void method4996(@OriginalArg(0) Class95_Sub3 arg0) {
		this.anInterface21_4 = arg0.method4847(196584, true, (byte[]) null, 24);
		this.aClass364_9 = new Class364(this.anInterface21_4, 5126, 2, 0);
		this.aClass364_8 = new Class364(this.anInterface21_4, 5126, 3, 8);
		this.aClass364_7 = new Class364(this.anInterface21_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Lclient!lf;I)V")
	private void method4998(@OriginalArg(0) Class95_Sub3 arg0) {
		arg0.method4841(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static218.aFloat72 != arg0.aFloat84) {
			arg0.xa(Static218.aFloat72);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!lf;I)V")
	private void method4999(@OriginalArg(1) Class95_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray38, 0);
		@Pc(15) float local15 = this.aFloatArray38[0];
		@Pc(20) float local20 = this.aFloatArray38[4];
		@Pc(25) float local25 = this.aFloatArray38[8];
		@Pc(30) float local30 = this.aFloatArray38[1];
		@Pc(35) float local35 = this.aFloatArray38[5];
		@Pc(40) float local40 = this.aFloatArray38[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(57) float local57 = local15 - local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(70) float local70 = local30 - local15;
		@Pc(74) float local74 = local35 - local20;
		this.aClass3_Sub4_Sub2_2.anInt9739 = 0;
		@Pc(83) float local83 = local40 - local25;
		@Pc(90) int local90;
		@Pc(107) int local107;
		@Pc(113) int local113;
		@Pc(122) Class34_Sub3_Sub2 local122;
		@Pc(125) int local125;
		@Pc(130) byte local130;
		@Pc(135) byte local135;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(149) float local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(166) int local166;
		@Pc(500) float local500;
		@Pc(505) int local505;
		@Pc(445) int local445;
		@Pc(461) Class34_Sub3_Sub2 local461;
		@Pc(464) int local464;
		@Pc(477) byte local477;
		@Pc(482) byte local482;
		@Pc(494) float local494;
		if (arg0.aBoolean369) {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local107 = this.anIntArray318[local90] <= 64 ? this.anIntArray318[local90] : 64;
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass34_Sub3_Sub2ArrayArray1[local90][local113];
						local125 = local122.anInt10581;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = (float) (local122.anInt10579 >> 12);
						local155 = (float) (local122.anInt10582 >> 12);
						local161 = (float) (local122.anInt10583 >> 12);
						local166 = local122.anInt10580 >> 12;
						this.aClass3_Sub4_Sub2_2.method7962(0.0F);
						this.aClass3_Sub4_Sub2_2.method7962(0.0F);
						this.aClass3_Sub4_Sub2_2.method7962(local44 * (float) -local166 + local149);
						this.aClass3_Sub4_Sub2_2.method7962(local48 * (float) -local166 + local155);
						this.aClass3_Sub4_Sub2_2.method7962(local161 + local52 * (float) -local166);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
						this.aClass3_Sub4_Sub2_2.method7962(1.0F);
						this.aClass3_Sub4_Sub2_2.method7962(0.0F);
						this.aClass3_Sub4_Sub2_2.method7962(local57 * (float) local166 + local149);
						this.aClass3_Sub4_Sub2_2.method7962(local155 + local62 * (float) local166);
						this.aClass3_Sub4_Sub2_2.method7962(local66 * (float) local166 + local161);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
						this.aClass3_Sub4_Sub2_2.method7962(1.0F);
						this.aClass3_Sub4_Sub2_2.method7962(1.0F);
						this.aClass3_Sub4_Sub2_2.method7962(local149 + local44 * (float) local166);
						this.aClass3_Sub4_Sub2_2.method7962(local48 * (float) local166 + local155);
						this.aClass3_Sub4_Sub2_2.method7962(local52 * (float) local166 + local161);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
						this.aClass3_Sub4_Sub2_2.method7962(0.0F);
						this.aClass3_Sub4_Sub2_2.method7962(1.0F);
						this.aClass3_Sub4_Sub2_2.method7962(local149 + (float) local166 * local70);
						this.aClass3_Sub4_Sub2_2.method7962(local155 + (float) local166 * local74);
						this.aClass3_Sub4_Sub2_2.method7962(local161 + (float) local166 * local83);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
					}
					if (this.anIntArray318[local90] > 64) {
						local445 = this.anIntArray318[local90] - 64 - 1;
						for (local125 = this.anIntArray319[local445] - 1; local125 >= 0; local125--) {
							local461 = this.aClass34_Sub3_Sub2ArrayArray2[local445][local125];
							local464 = local461.anInt10581;
							local138 = (byte) (local464 >> 16);
							local143 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local161 = (float) (local461.anInt10579 >> 12);
							local494 = (float) (local461.anInt10582 >> 12);
							local500 = (float) (local461.anInt10583 >> 12);
							local505 = local461.anInt10580 >> 12;
							this.aClass3_Sub4_Sub2_2.method7962(0.0F);
							this.aClass3_Sub4_Sub2_2.method7962(0.0F);
							this.aClass3_Sub4_Sub2_2.method7962(local161 + (float) -local505 * local44);
							this.aClass3_Sub4_Sub2_2.method7962(local48 * (float) -local505 + local494);
							this.aClass3_Sub4_Sub2_2.method7962(local52 * (float) -local505 + local500);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
							this.aClass3_Sub4_Sub2_2.method7962(1.0F);
							this.aClass3_Sub4_Sub2_2.method7962(0.0F);
							this.aClass3_Sub4_Sub2_2.method7962((float) local505 * local57 + local161);
							this.aClass3_Sub4_Sub2_2.method7962(local62 * (float) local505 + local494);
							this.aClass3_Sub4_Sub2_2.method7962((float) local505 * local66 + local500);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
							this.aClass3_Sub4_Sub2_2.method7962(1.0F);
							this.aClass3_Sub4_Sub2_2.method7962(1.0F);
							this.aClass3_Sub4_Sub2_2.method7962((float) local505 * local44 + local161);
							this.aClass3_Sub4_Sub2_2.method7962(local48 * (float) local505 + local494);
							this.aClass3_Sub4_Sub2_2.method7962(local52 * (float) local505 + local500);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
							this.aClass3_Sub4_Sub2_2.method7962(0.0F);
							this.aClass3_Sub4_Sub2_2.method7962(1.0F);
							this.aClass3_Sub4_Sub2_2.method7962(local161 + (float) local505 * local70);
							this.aClass3_Sub4_Sub2_2.method7962(local74 * (float) local505 + local494);
							this.aClass3_Sub4_Sub2_2.method7962((float) local505 * local83 + local500);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
						}
					}
				}
			}
		} else {
			for (local90 = arg1 - 1; local90 >= 0; local90--) {
				local107 = this.anIntArray318[local90] > 64 ? 64 : this.anIntArray318[local90];
				if (local107 > 0) {
					for (local113 = local107 - 1; local113 >= 0; local113--) {
						local122 = this.aClass34_Sub3_Sub2ArrayArray1[local90][local113];
						local125 = local122.anInt10581;
						local130 = (byte) (local125 >> 16);
						local135 = (byte) (local125 >> 8);
						local138 = (byte) local125;
						local143 = (byte) (local125 >>> 24);
						local149 = (float) (local122.anInt10579 >> 12);
						local155 = (float) (local122.anInt10582 >> 12);
						local161 = (float) (local122.anInt10583 >> 12);
						local166 = local122.anInt10580 >> 12;
						this.aClass3_Sub4_Sub2_2.method7963(0.0F);
						this.aClass3_Sub4_Sub2_2.method7963(0.0F);
						this.aClass3_Sub4_Sub2_2.method7963(local149 + (float) -local166 * local44);
						this.aClass3_Sub4_Sub2_2.method7963(local48 * (float) -local166 + local155);
						this.aClass3_Sub4_Sub2_2.method7963((float) -local166 * local52 + local161);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
						this.aClass3_Sub4_Sub2_2.method7963(1.0F);
						this.aClass3_Sub4_Sub2_2.method7963(0.0F);
						this.aClass3_Sub4_Sub2_2.method7963(local149 + (float) local166 * local57);
						this.aClass3_Sub4_Sub2_2.method7963((float) local166 * local62 + local155);
						this.aClass3_Sub4_Sub2_2.method7963((float) local166 * local66 + local161);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
						this.aClass3_Sub4_Sub2_2.method7963(1.0F);
						this.aClass3_Sub4_Sub2_2.method7963(1.0F);
						this.aClass3_Sub4_Sub2_2.method7963(local44 * (float) local166 + local149);
						this.aClass3_Sub4_Sub2_2.method7963(local155 + (float) local166 * local48);
						this.aClass3_Sub4_Sub2_2.method7963(local161 + local52 * (float) local166);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
						this.aClass3_Sub4_Sub2_2.method7963(0.0F);
						this.aClass3_Sub4_Sub2_2.method7963(1.0F);
						this.aClass3_Sub4_Sub2_2.method7963((float) local166 * local70 + local149);
						this.aClass3_Sub4_Sub2_2.method7963(local155 + (float) local166 * local74);
						this.aClass3_Sub4_Sub2_2.method7963(local161 + (float) local166 * local83);
						this.aClass3_Sub4_Sub2_2.method7948(local130);
						this.aClass3_Sub4_Sub2_2.method7948(local135);
						this.aClass3_Sub4_Sub2_2.method7948(local138);
						this.aClass3_Sub4_Sub2_2.method7948(local143);
					}
					if (this.anIntArray318[local90] > 64) {
						local445 = this.anIntArray318[local90] - 64 - 1;
						for (local125 = this.anIntArray319[local445] - 1; local125 >= 0; local125--) {
							local461 = this.aClass34_Sub3_Sub2ArrayArray2[local445][local125];
							local464 = local461.anInt10581;
							local138 = (byte) (local464 >> 16);
							local143 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local161 = (float) (local461.anInt10579 >> 12);
							local494 = (float) (local461.anInt10582 >> 12);
							local500 = (float) (local461.anInt10583 >> 12);
							local505 = local461.anInt10580 >> 12;
							this.aClass3_Sub4_Sub2_2.method7963(0.0F);
							this.aClass3_Sub4_Sub2_2.method7963(0.0F);
							this.aClass3_Sub4_Sub2_2.method7963(local161 + (float) -local505 * local44);
							this.aClass3_Sub4_Sub2_2.method7963(local494 + local48 * (float) -local505);
							this.aClass3_Sub4_Sub2_2.method7963(local500 + local52 * (float) -local505);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
							this.aClass3_Sub4_Sub2_2.method7963(1.0F);
							this.aClass3_Sub4_Sub2_2.method7963(0.0F);
							this.aClass3_Sub4_Sub2_2.method7963((float) local505 * local57 + local161);
							this.aClass3_Sub4_Sub2_2.method7963(local494 + local62 * (float) local505);
							this.aClass3_Sub4_Sub2_2.method7963((float) local505 * local66 + local500);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
							this.aClass3_Sub4_Sub2_2.method7963(1.0F);
							this.aClass3_Sub4_Sub2_2.method7963(1.0F);
							this.aClass3_Sub4_Sub2_2.method7963(local161 + local44 * (float) local505);
							this.aClass3_Sub4_Sub2_2.method7963(local48 * (float) local505 + local494);
							this.aClass3_Sub4_Sub2_2.method7963(local52 * (float) local505 + local500);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
							this.aClass3_Sub4_Sub2_2.method7963(0.0F);
							this.aClass3_Sub4_Sub2_2.method7963(1.0F);
							this.aClass3_Sub4_Sub2_2.method7963(local70 * (float) local505 + local161);
							this.aClass3_Sub4_Sub2_2.method7963(local74 * (float) local505 + local494);
							this.aClass3_Sub4_Sub2_2.method7963(local500 + (float) local505 * local83);
							this.aClass3_Sub4_Sub2_2.method7948(local138);
							this.aClass3_Sub4_Sub2_2.method7948(local143);
							this.aClass3_Sub4_Sub2_2.method7948(local477);
							this.aClass3_Sub4_Sub2_2.method7948(local482);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub4_Sub2_2.anInt9739 != 0) {
			this.anInterface21_4.method8698(this.aClass3_Sub4_Sub2_2.aByteArray90, 24, this.aClass3_Sub4_Sub2_2.anInt9739);
			arg0.method4903(this.aClass364_9, this.aClass364_8, this.aClass364_7, (Class364) null);
			arg0.method4832(this.aClass3_Sub4_Sub2_2.anInt9739 / 24);
		}
	}
}
