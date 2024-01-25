import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class176 {

	@OriginalMember(owner = "client!on", name = "i", descriptor = "Lclient!it;")
	private Class124 aClass124_14;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "Lclient!it;")
	private Class124 aClass124_15;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "Lclient!it;")
	private Class124 aClass124_16;

	@OriginalMember(owner = "client!on", name = "o", descriptor = "Lclient!gf;")
	private Interface6 anInterface6_7;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[F")
	private final float[] aFloatArray23 = new float[16];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Lclient!rp;")
	private final Class4_Sub30_Sub2 aClass4_Sub30_Sub2_2 = new Class4_Sub30_Sub2(786336);

	@OriginalMember(owner = "client!on", name = "m", descriptor = "I")
	private final int anInt5244 = Static51.method1041(1600);

	@OriginalMember(owner = "client!on", name = "p", descriptor = "[I")
	private final int[] anIntArray448 = new int[1600];

	@OriginalMember(owner = "client!on", name = "v", descriptor = "[I")
	private final int[] anIntArray450 = new int[64];

	@OriginalMember(owner = "client!on", name = "u", descriptor = "[[Lclient!sv;")
	private final Class41_Sub7_Sub1[][] aClass41_Sub7_Sub1ArrayArray2 = new Class41_Sub7_Sub1[64][768];

	@OriginalMember(owner = "client!on", name = "q", descriptor = "[I")
	private final int[] anIntArray449 = new int[8191];

	@OriginalMember(owner = "client!on", name = "t", descriptor = "[[Lclient!sv;")
	private final Class41_Sub7_Sub1[][] aClass41_Sub7_Sub1ArrayArray1 = new Class41_Sub7_Sub1[1600][64];

	@OriginalMember(owner = "client!on", name = "r", descriptor = "I")
	private int anInt5246 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!bv;B)V")
	public void method4029(@OriginalArg(0) Class30_Sub1 arg0) {
		this.anInterface6_7 = arg0.method941(24, null, 196584, true);
		this.aClass124_15 = new Class124(this.anInterface6_7, 5126, 2, 0);
		this.aClass124_14 = new Class124(this.anInterface6_7, 5126, 3, 8);
		this.aClass124_16 = new Class124(this.anInterface6_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Lclient!bv;B)V")
	private void method4030(@OriginalArg(0) Class30_Sub1 arg0) {
		Static389.aFloat197 = arg0.aFloat37;
		arg0.method911();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method956(false);
		arg0.method940(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!bv;BI)V")
	private void method4031(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray23, 0);
		@Pc(15) float local15 = this.aFloatArray23[0];
		@Pc(20) float local20 = this.aFloatArray23[4];
		@Pc(25) float local25 = this.aFloatArray23[8];
		@Pc(30) float local30 = this.aFloatArray23[1];
		@Pc(35) float local35 = this.aFloatArray23[5];
		@Pc(48) float local48 = this.aFloatArray23[9];
		@Pc(52) float local52 = local30 + local15;
		@Pc(56) float local56 = local20 + local35;
		@Pc(60) float local60 = local25 + local48;
		@Pc(64) float local64 = local15 - local30;
		@Pc(69) float local69 = local20 - local35;
		@Pc(73) float local73 = local25 - local48;
		@Pc(78) float local78 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		@Pc(87) float local87 = local48 - local25;
		this.aClass4_Sub30_Sub2_2.anInt6244 = 0;
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(121) int local121;
		@Pc(130) Class41_Sub7_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(495) float local495;
		@Pc(500) int local500;
		@Pc(440) int local440;
		@Pc(456) Class41_Sub7_Sub1 local456;
		@Pc(459) int local459;
		@Pc(472) byte local472;
		@Pc(477) byte local477;
		@Pc(489) float local489;
		if (arg0.aBoolean76) {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray448[local98] <= 64 ? this.anIntArray448[local98] : 64;
				if (local115 > 0) {
					for (local121 = local115 - 1; local121 >= 0; local121--) {
						local130 = this.aClass41_Sub7_Sub1ArrayArray1[local98][local121];
						local133 = local130.anInt7559;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt7561 >> Static201.anInt6625;
						local163 = local130.anInt7551 >> Static201.anInt6625;
						local169 = local130.anInt7552 >> Static201.anInt6625;
						local174 = local130.anInt7557 >> Static201.anInt6625;
						this.aClass4_Sub30_Sub2_2.method4896(0.0F);
						this.aClass4_Sub30_Sub2_2.method4896(0.0F);
						this.aClass4_Sub30_Sub2_2.method4896(local157 + local52 * (float) -local174);
						this.aClass4_Sub30_Sub2_2.method4896((float) -local174 * local56 + local163);
						this.aClass4_Sub30_Sub2_2.method4896(local169 + (float) -local174 * local60);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
						this.aClass4_Sub30_Sub2_2.method4896(1.0F);
						this.aClass4_Sub30_Sub2_2.method4896(0.0F);
						this.aClass4_Sub30_Sub2_2.method4896(local157 + (float) local174 * local64);
						this.aClass4_Sub30_Sub2_2.method4896(local69 * (float) local174 + local163);
						this.aClass4_Sub30_Sub2_2.method4896(local169 + local73 * (float) local174);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
						this.aClass4_Sub30_Sub2_2.method4896(1.0F);
						this.aClass4_Sub30_Sub2_2.method4896(1.0F);
						this.aClass4_Sub30_Sub2_2.method4896(local52 * (float) local174 + local157);
						this.aClass4_Sub30_Sub2_2.method4896((float) local174 * local56 + local163);
						this.aClass4_Sub30_Sub2_2.method4896(local60 * (float) local174 + local169);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
						this.aClass4_Sub30_Sub2_2.method4896(0.0F);
						this.aClass4_Sub30_Sub2_2.method4896(1.0F);
						this.aClass4_Sub30_Sub2_2.method4896(local157 + (float) local174 * local78);
						this.aClass4_Sub30_Sub2_2.method4896(local163 + (float) local174 * local82);
						this.aClass4_Sub30_Sub2_2.method4896(local169 + (float) local174 * local87);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
					}
					if (this.anIntArray448[local98] > 64) {
						local440 = this.anIntArray448[local98] - 64 - 1;
						for (local133 = this.anIntArray450[local440] - 1; local133 >= 0; local133--) {
							local456 = this.aClass41_Sub7_Sub1ArrayArray2[local440][local133];
							local459 = local456.anInt7559;
							local146 = (byte) (local459 >> 16);
							local151 = (byte) (local459 >> 8);
							local472 = (byte) local459;
							local477 = (byte) (local459 >>> 24);
							local169 = local456.anInt7561 >> Static201.anInt6625;
							local489 = local456.anInt7551 >> Static201.anInt6625;
							local495 = local456.anInt7552 >> Static201.anInt6625;
							local500 = local456.anInt7557 >> Static201.anInt6625;
							this.aClass4_Sub30_Sub2_2.method4896(0.0F);
							this.aClass4_Sub30_Sub2_2.method4896(0.0F);
							this.aClass4_Sub30_Sub2_2.method4896(local169 + (float) -local500 * local52);
							this.aClass4_Sub30_Sub2_2.method4896(local56 * (float) -local500 + local489);
							this.aClass4_Sub30_Sub2_2.method4896(local60 * (float) -local500 + local495);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
							this.aClass4_Sub30_Sub2_2.method4896(1.0F);
							this.aClass4_Sub30_Sub2_2.method4896(0.0F);
							this.aClass4_Sub30_Sub2_2.method4896(local169 + local64 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4896((float) local500 * local69 + local489);
							this.aClass4_Sub30_Sub2_2.method4896(local495 + local73 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
							this.aClass4_Sub30_Sub2_2.method4896(1.0F);
							this.aClass4_Sub30_Sub2_2.method4896(1.0F);
							this.aClass4_Sub30_Sub2_2.method4896(local52 * (float) local500 + local169);
							this.aClass4_Sub30_Sub2_2.method4896((float) local500 * local56 + local489);
							this.aClass4_Sub30_Sub2_2.method4896(local495 + local60 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
							this.aClass4_Sub30_Sub2_2.method4896(0.0F);
							this.aClass4_Sub30_Sub2_2.method4896(1.0F);
							this.aClass4_Sub30_Sub2_2.method4896((float) local500 * local78 + local169);
							this.aClass4_Sub30_Sub2_2.method4896(local489 + local82 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4896(local87 * (float) local500 + local495);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
						}
					}
				}
			}
		} else {
			for (local98 = arg1 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray448[local98] > 64 ? 64 : this.anIntArray448[local98];
				if (local115 > 0) {
					for (local121 = local115 - 1; local121 >= 0; local121--) {
						local130 = this.aClass41_Sub7_Sub1ArrayArray1[local98][local121];
						local133 = local130.anInt7559;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = local130.anInt7561 >> Static201.anInt6625;
						local163 = local130.anInt7551 >> Static201.anInt6625;
						local169 = local130.anInt7552 >> Static201.anInt6625;
						local174 = local130.anInt7557 >> Static201.anInt6625;
						this.aClass4_Sub30_Sub2_2.method4892(0.0F);
						this.aClass4_Sub30_Sub2_2.method4892(0.0F);
						this.aClass4_Sub30_Sub2_2.method4892((float) -local174 * local52 + local157);
						this.aClass4_Sub30_Sub2_2.method4892(local163 + (float) -local174 * local56);
						this.aClass4_Sub30_Sub2_2.method4892(local169 + (float) -local174 * local60);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
						this.aClass4_Sub30_Sub2_2.method4892(1.0F);
						this.aClass4_Sub30_Sub2_2.method4892(0.0F);
						this.aClass4_Sub30_Sub2_2.method4892(local64 * (float) local174 + local157);
						this.aClass4_Sub30_Sub2_2.method4892((float) local174 * local69 + local163);
						this.aClass4_Sub30_Sub2_2.method4892(local169 + (float) local174 * local73);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
						this.aClass4_Sub30_Sub2_2.method4892(1.0F);
						this.aClass4_Sub30_Sub2_2.method4892(1.0F);
						this.aClass4_Sub30_Sub2_2.method4892(local52 * (float) local174 + local157);
						this.aClass4_Sub30_Sub2_2.method4892(local163 + local56 * (float) local174);
						this.aClass4_Sub30_Sub2_2.method4892((float) local174 * local60 + local169);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
						this.aClass4_Sub30_Sub2_2.method4892(0.0F);
						this.aClass4_Sub30_Sub2_2.method4892(1.0F);
						this.aClass4_Sub30_Sub2_2.method4892(local157 + (float) local174 * local78);
						this.aClass4_Sub30_Sub2_2.method4892((float) local174 * local82 + local163);
						this.aClass4_Sub30_Sub2_2.method4892(local169 + local87 * (float) local174);
						this.aClass4_Sub30_Sub2_2.method4871(local138);
						this.aClass4_Sub30_Sub2_2.method4871(local143);
						this.aClass4_Sub30_Sub2_2.method4871(local146);
						this.aClass4_Sub30_Sub2_2.method4871(local151);
					}
					if (this.anIntArray448[local98] > 64) {
						local440 = this.anIntArray448[local98] - 64 - 1;
						for (local133 = this.anIntArray450[local440] - 1; local133 >= 0; local133--) {
							local456 = this.aClass41_Sub7_Sub1ArrayArray2[local440][local133];
							local459 = local456.anInt7559;
							local146 = (byte) (local459 >> 16);
							local151 = (byte) (local459 >> 8);
							local472 = (byte) local459;
							local477 = (byte) (local459 >>> 24);
							local169 = local456.anInt7561 >> Static201.anInt6625;
							local489 = local456.anInt7551 >> Static201.anInt6625;
							local495 = local456.anInt7552 >> Static201.anInt6625;
							local500 = local456.anInt7557 >> Static201.anInt6625;
							this.aClass4_Sub30_Sub2_2.method4892(0.0F);
							this.aClass4_Sub30_Sub2_2.method4892(0.0F);
							this.aClass4_Sub30_Sub2_2.method4892(local169 + (float) -local500 * local52);
							this.aClass4_Sub30_Sub2_2.method4892((float) -local500 * local56 + local489);
							this.aClass4_Sub30_Sub2_2.method4892(local495 + (float) -local500 * local60);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
							this.aClass4_Sub30_Sub2_2.method4892(1.0F);
							this.aClass4_Sub30_Sub2_2.method4892(0.0F);
							this.aClass4_Sub30_Sub2_2.method4892(local169 + local64 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4892(local69 * (float) local500 + local489);
							this.aClass4_Sub30_Sub2_2.method4892(local495 + local73 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
							this.aClass4_Sub30_Sub2_2.method4892(1.0F);
							this.aClass4_Sub30_Sub2_2.method4892(1.0F);
							this.aClass4_Sub30_Sub2_2.method4892(local52 * (float) local500 + local169);
							this.aClass4_Sub30_Sub2_2.method4892(local489 + local56 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4892(local495 + (float) local500 * local60);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
							this.aClass4_Sub30_Sub2_2.method4892(0.0F);
							this.aClass4_Sub30_Sub2_2.method4892(1.0F);
							this.aClass4_Sub30_Sub2_2.method4892(local169 + local78 * (float) local500);
							this.aClass4_Sub30_Sub2_2.method4892((float) local500 * local82 + local489);
							this.aClass4_Sub30_Sub2_2.method4892((float) local500 * local87 + local495);
							this.aClass4_Sub30_Sub2_2.method4871(local146);
							this.aClass4_Sub30_Sub2_2.method4871(local151);
							this.aClass4_Sub30_Sub2_2.method4871(local472);
							this.aClass4_Sub30_Sub2_2.method4871(local477);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub30_Sub2_2.anInt6244 != 0) {
			this.anInterface6_7.method2114(this.aClass4_Sub30_Sub2_2.aByteArray79, this.aClass4_Sub30_Sub2_2.anInt6244, 24);
			arg0.method919(this.aClass124_15, this.aClass124_14, null, this.aClass124_16);
			arg0.method926(this.aClass4_Sub30_Sub2_2.anInt6244 / 24);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!vo;Lclient!bv;I)V")
	public void method4032(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class30_Sub1 arg1) {
		if (arg1.aClass116_Sub2_4 == null) {
			return;
		}
		this.method4030(arg1);
		@Pc(21) float local21 = arg1.aClass116_Sub2_4.aFloat172;
		@Pc(25) float local25 = arg1.aClass116_Sub2_4.aFloat174;
		@Pc(29) float local29 = arg1.aClass116_Sub2_4.aFloat170;
		@Pc(33) float local33 = arg1.aClass116_Sub2_4.aFloat175;
		try {
			@Pc(43) int local43;
			@Pc(53) int local53;
			@Pc(79) Class41_Sub7 local79;
			@Pc(92) int local92;
			@Pc(258) Class41_Sub7_Sub1[] local258;
			@Pc(186) int local186;
			@Pc(266) int local266;
			@Pc(268) int local268;
			if (arg0.aBoolean479) {
				local43 = arg0.anInt7137 - arg0.anInt7138;
				if (local43 + 2 <= 1600) {
					local43 += 2;
					local53 = 0;
				} else {
					local53 = Static51.method1041(local43) + 1 - this.anInt5244;
					local43 = (local43 >> local53) + 2;
				}
				@Pc(76) Class41_Sub7 local76 = arg0.aClass91_1.aClass41_Sub7_1;
				local79 = local76.aClass41_Sub7_8;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local79 != local76) {
					this.anInt5246 = 0;
					for (local92 = 0; local92 < local43; local92++) {
						this.anIntArray448[local92] = 0;
					}
					for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
						this.anIntArray450[local105] = 0;
					}
					while (local79 != local76) {
						@Pc(123) Class41_Sub7_Sub1 local123 = (Class41_Sub7_Sub1) local79;
						if (local85) {
							local83 = local123.aBoolean500;
							local85 = false;
							local81 = local123.anInt7560;
						} else if (local81 != local123.anInt7560 || local83 != local123.aBoolean500) {
							local85 = true;
							break;
						}
						local186 = (int) (local33 + local21 * (float) (local123.anInt7561 >> Static201.anInt6625) + local25 * (float) (local123.anInt7551 >> Static201.anInt6625) + local29 * (float) (local123.anInt7552 >> Static201.anInt6625)) - arg0.anInt7138 >> local53;
						if (local186 < 1600) {
							if (this.anIntArray448[local186] < 64) {
								this.aClass41_Sub7_Sub1ArrayArray1[local186][this.anIntArray448[local186]++] = local123;
							} else {
								label197: {
									if (this.anIntArray448[local186] == 64) {
										if (this.anInt5246 == 64) {
											break label197;
										}
										this.anIntArray448[local186] += this.anInt5246++ + 1;
									}
									local258 = this.aClass41_Sub7_Sub1ArrayArray2[this.anIntArray448[local186] - 64 - 1];
									local266 = this.anIntArray448[local186] - 65;
									local268 = this.anIntArray450[this.anIntArray448[local186] - 65];
									this.anIntArray450[local266] = this.anIntArray450[this.anIntArray448[local186] - 65] + 1;
									local258[local268] = local123;
								}
							}
						}
						local79 = local79.aClass41_Sub7_8;
					}
					if (local81 >= 0) {
						arg1.method916(arg1.aClass63_1.method1552(local81));
						arg1.method923(arg1.anInterface10_7.method4241(local81).anInt3169);
					} else {
						arg1.method916(null);
					}
					if (local83 && Static389.aFloat197 != arg1.aFloat37) {
						arg1.ua(Static389.aFloat197);
					} else if (arg1.aFloat37 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method4031(arg1, local43);
				}
			} else {
				local43 = 0;
				local53 = Integer.MAX_VALUE;
				@Pc(344) int local344 = 0;
				local79 = arg0.aClass91_1.aClass41_Sub7_1;
				@Pc(351) Class41_Sub7 local351;
				@Pc(383) int local383;
				for (local351 = local79.aClass41_Sub7_8; local351 != local79; local351 = local351.aClass41_Sub7_8) {
					@Pc(356) Class41_Sub7_Sub1 local356 = (Class41_Sub7_Sub1) local351;
					local383 = (int) ((float) (local356.anInt7561 >> Static201.anInt6625) * local21 + (float) (local356.anInt7551 >> Static201.anInt6625) * local25 + (float) (local356.anInt7552 >> Static201.anInt6625) * local29 + local33);
					this.anIntArray449[local43++] = local383;
					if (local383 < local53) {
						local53 = local383;
					}
					if (local344 < local383) {
						local344 = local383;
					}
				}
				@Pc(414) int local414 = local344 - local53;
				if (local414 + 2 > 1600) {
					local383 = Static51.method1041(local414) + 1 - this.anInt5244;
					local414 = (local414 >> local383) + 2;
				} else {
					local414 += 2;
					local383 = 0;
				}
				local351 = local79.aClass41_Sub7_8;
				local43 = 0;
				local92 = -2;
				@Pc(448) boolean local448 = true;
				@Pc(450) boolean local450 = true;
				while (local79 != local351) {
					this.anInt5246 = 0;
					for (local186 = 0; local186 < local414; local186++) {
						this.anIntArray448[local186] = 0;
					}
					for (@Pc(474) int local474 = 0; local474 < 64; local474++) {
						this.anIntArray450[local474] = 0;
					}
					while (local79 != local351) {
						@Pc(490) Class41_Sub7_Sub1 local490 = (Class41_Sub7_Sub1) local351;
						if (local450) {
							local450 = false;
							local448 = local490.aBoolean500;
							local92 = local490.anInt7560;
						}
						if (local43 > 0 && (local490.anInt7560 != local92 || local448 != local490.aBoolean500)) {
							local450 = true;
							break;
						}
						@Pc(540) int local540 = this.anIntArray449[local43++] - local53 >> local383;
						if (local540 < 1600) {
							if (this.anIntArray448[local540] >= 64) {
								label147: {
									if (this.anIntArray448[local540] == 64) {
										if (this.anInt5246 == 64) {
											break label147;
										}
										this.anIntArray448[local540] += this.anInt5246++ + 1;
									}
									local258 = this.aClass41_Sub7_Sub1ArrayArray2[this.anIntArray448[local540] - 64 - 1];
									local266 = this.anIntArray448[local540] - 64 - 1;
									local268 = this.anIntArray450[this.anIntArray448[local540] - 64 - 1];
									this.anIntArray450[local266] = this.anIntArray450[this.anIntArray448[local540] - 64 - 1] + 1;
									local258[local268] = local490;
								}
							} else {
								this.aClass41_Sub7_Sub1ArrayArray1[local540][this.anIntArray448[local540]++] = local490;
							}
						}
						local351 = local351.aClass41_Sub7_8;
					}
					if (local92 >= 0) {
						arg1.method916(arg1.aClass63_1.method1552(local92));
						arg1.method923(arg1.anInterface10_7.method4241(local92).anInt3169);
					} else {
						arg1.method916(null);
					}
					if (local448 && Static389.aFloat197 != arg1.aFloat37) {
						arg1.ua(Static389.aFloat197);
					} else if (arg1.aFloat37 != 1.0F) {
						arg1.ua(1.0F);
					}
					this.method4031(arg1, local414);
				}
			}
		} catch (@Pc(688) Exception local688) {
		}
		this.method4033(arg1);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!bv;)V")
	private void method4033(@OriginalArg(1) Class30_Sub1 arg0) {
		arg0.method956(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat37 != Static389.aFloat197) {
			arg0.ua(Static389.aFloat197);
		}
	}
}
