import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class319 {

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!nh;")
	private Class223 aClass223_14;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!hca;")
	private Interface11 anInterface11_7;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "Lclient!nh;")
	private Class223 aClass223_15;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Lclient!nh;")
	private Class223 aClass223_16;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "[F")
	private final float[] aFloatArray82 = new float[16];

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "Lclient!gh;")
	private final Class2_Sub11_Sub1 aClass2_Sub11_Sub1_3 = new Class2_Sub11_Sub1(786336);

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
	private final int anInt9511 = Static627.method7088(1600);

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "[I")
	private final int[] anIntArray618 = new int[8191];

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "[[Lclient!jc;")
	private final Class3_Sub2_Sub2[][] aClass3_Sub2_Sub2ArrayArray2 = new Class3_Sub2_Sub2[1600][64];

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "[I")
	private final int[] anIntArray619 = new int[1600];

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	private int anInt9512 = 0;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "[[Lclient!jc;")
	private final Class3_Sub2_Sub2[][] aClass3_Sub2_Sub2ArrayArray1 = new Class3_Sub2_Sub2[64][768];

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "[I")
	private final int[] anIntArray620 = new int[64];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!qo;II)V")
	private void method7897(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static319.aFloat155 = arg0.aFloat175;
		arg0.method7376((float) arg1);
		arg0.method7347();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7335(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!qo;B)V")
	private void method7898(@OriginalArg(0) Class20_Sub3 arg0) {
		arg0.method7335(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static319.aFloat155 != arg0.aFloat175) {
			arg0.xa(Static319.aFloat155);
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!qo;BILclient!mda;)V")
	public void method7899(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class203 arg2) {
		if (arg0.aClass30_Sub3_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method7897(arg0, arg1);
		} else {
			this.method7900(arg0);
		}
		@Pc(26) float local26 = arg0.aClass30_Sub3_3.aFloat139;
		@Pc(30) float local30 = arg0.aClass30_Sub3_3.aFloat138;
		@Pc(34) float local34 = arg0.aClass30_Sub3_3.aFloat146;
		@Pc(38) float local38 = arg0.aClass30_Sub3_3.aFloat137;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class3_Sub2 local48 = arg2.aClass194_1.aClass3_Sub2_7;
			@Pc(51) Class3_Sub2 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass3_Sub2_10; local51 != local48; local51 = local51.aClass3_Sub2_10) {
				@Pc(56) Class3_Sub2_Sub2 local56 = (Class3_Sub2_Sub2) local51;
				local83 = (int) (local38 + (float) (local56.anInt8148 >> 12) * local30 + (float) (local56.anInt8145 >> 12) * local26 + (float) (local56.anInt8143 >> 12) * local34);
				if (local44 < local83) {
					local44 = local83;
				}
				if (local42 > local83) {
					local42 = local83;
				}
				this.anIntArray618[local40++] = local83;
			}
			@Pc(109) int local109 = local44 - local42;
			if (local109 + 2 > 1600) {
				local83 = Static627.method7088(local109) + 1 - this.anInt9511;
				local109 = (local109 >> local83) + 2;
			} else {
				local109 += 2;
				local83 = 0;
			}
			local40 = 0;
			local51 = local48.aClass3_Sub2_10;
			@Pc(144) int local144 = -2;
			@Pc(151) boolean local151 = true;
			@Pc(153) boolean local153 = true;
			while (local48 != local51) {
				this.anInt9512 = 0;
				for (@Pc(160) int local160 = 0; local160 < local109; local160++) {
					this.anIntArray619[local160] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray620[local177] = 0;
				}
				while (local48 != local51) {
					@Pc(195) Class3_Sub2_Sub2 local195 = (Class3_Sub2_Sub2) local51;
					if (local153) {
						local151 = local195.aBoolean576;
						local144 = local195.anInt8146;
						local153 = false;
					}
					if (local40 > 0 && (local195.anInt8146 != local144 || local195.aBoolean576 != local151)) {
						local153 = true;
						break;
					}
					@Pc(237) int local237 = this.anIntArray618[local40++] - local42 >> local83;
					if (local237 < 1600) {
						if (this.anIntArray619[local237] < 64) {
							this.aClass3_Sub2_Sub2ArrayArray2[local237][this.anIntArray619[local237]++] = local195;
						} else {
							label101: {
								if (this.anIntArray619[local237] == 64) {
									if (this.anInt9512 == 64) {
										break label101;
									}
									this.anIntArray619[local237] += this.anInt9512++ + 1;
								}
								this.aClass3_Sub2_Sub2ArrayArray1[this.anIntArray619[local237] - 64 - 1][this.anIntArray620[this.anIntArray619[local237] - 64 - 1]++] = local195;
							}
						}
					}
					local51 = local51.aClass3_Sub2_10;
				}
				if (local144 < 0) {
					arg0.method7344(-1);
				} else {
					arg0.method7344(local144);
				}
				if (local151 && Static319.aFloat155 != arg0.aFloat175) {
					arg0.xa(Static319.aFloat155);
				} else if (arg0.aFloat175 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method7903(arg0, local109);
			}
		} catch (@Pc(374) Exception local374) {
		}
		this.method7898(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLclient!qo;)V")
	private void method7900(@OriginalArg(1) Class20_Sub3 arg0) {
		Static319.aFloat155 = arg0.aFloat175;
		arg0.method7371();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7335(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ILclient!qo;)V")
	public void method7902(@OriginalArg(1) Class20_Sub3 arg0) {
		this.anInterface11_7 = arg0.method7318(true, 24, null, 196584);
		this.aClass223_14 = new Class223(this.anInterface11_7, 5126, 2, 0);
		this.aClass223_16 = new Class223(this.anInterface11_7, 5126, 3, 8);
		this.aClass223_15 = new Class223(this.anInterface11_7, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Lclient!qo;II)V")
	private void method7903(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray82, 0);
		@Pc(19) float local19 = this.aFloatArray82[0];
		@Pc(24) float local24 = this.aFloatArray82[4];
		@Pc(29) float local29 = this.aFloatArray82[8];
		@Pc(34) float local34 = this.aFloatArray82[1];
		@Pc(39) float local39 = this.aFloatArray82[5];
		@Pc(44) float local44 = this.aFloatArray82[9];
		@Pc(48) float local48 = local34 + local19;
		@Pc(52) float local52 = local39 + local24;
		@Pc(56) float local56 = local44 + local29;
		@Pc(60) float local60 = local19 - local34;
		@Pc(65) float local65 = local24 - local39;
		@Pc(70) float local70 = local29 - local44;
		@Pc(75) float local75 = local34 - local19;
		@Pc(80) float local80 = local39 - local24;
		this.aClass2_Sub11_Sub1_3.anInt10066 = 0;
		@Pc(89) float local89 = local44 - local29;
		@Pc(96) int local96;
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(128) Class3_Sub2_Sub2 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class3_Sub2_Sub2 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg0.aBoolean616) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray619[local96] > 64 ? 64 : this.anIntArray619[local96];
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass3_Sub2_Sub2ArrayArray2[local96][local119];
						local131 = local128.anInt8144;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt8145 >> 12;
						local161 = local128.anInt8148 >> 12;
						local167 = local128.anInt8143 >> 12;
						local172 = local128.anInt8147 >> 12;
						this.aClass2_Sub11_Sub1_3.method3862(0.0F);
						this.aClass2_Sub11_Sub1_3.method3862(0.0F);
						this.aClass2_Sub11_Sub1_3.method3862((float) -local172 * local48 + local155);
						this.aClass2_Sub11_Sub1_3.method3862(local161 + local52 * (float) -local172);
						this.aClass2_Sub11_Sub1_3.method3862(local167 + local56 * (float) -local172);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
						this.aClass2_Sub11_Sub1_3.method3862(1.0F);
						this.aClass2_Sub11_Sub1_3.method3862(0.0F);
						this.aClass2_Sub11_Sub1_3.method3862((float) local172 * local60 + local155);
						this.aClass2_Sub11_Sub1_3.method3862((float) local172 * local65 + local161);
						this.aClass2_Sub11_Sub1_3.method3862(local167 + (float) local172 * local70);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
						this.aClass2_Sub11_Sub1_3.method3862(1.0F);
						this.aClass2_Sub11_Sub1_3.method3862(1.0F);
						this.aClass2_Sub11_Sub1_3.method3862(local155 + local48 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method3862(local52 * (float) local172 + local161);
						this.aClass2_Sub11_Sub1_3.method3862(local167 + (float) local172 * local56);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
						this.aClass2_Sub11_Sub1_3.method3862(0.0F);
						this.aClass2_Sub11_Sub1_3.method3862(1.0F);
						this.aClass2_Sub11_Sub1_3.method3862(local75 * (float) local172 + local155);
						this.aClass2_Sub11_Sub1_3.method3862(local161 + local80 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method3862(local89 * (float) local172 + local167);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
					}
					if (this.anIntArray619[local96] > 64) {
						local442 = this.anIntArray619[local96] - 64 - 1;
						for (local131 = this.anIntArray620[local442] - 1; local131 >= 0; local131--) {
							local458 = this.aClass3_Sub2_Sub2ArrayArray1[local442][local131];
							local461 = local458.anInt8144;
							local144 = (byte) (local461 >> 16);
							local149 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local167 = local458.anInt8145 >> 12;
							local491 = local458.anInt8148 >> 12;
							local497 = local458.anInt8143 >> 12;
							local502 = local458.anInt8147 >> 12;
							this.aClass2_Sub11_Sub1_3.method3862(0.0F);
							this.aClass2_Sub11_Sub1_3.method3862(0.0F);
							this.aClass2_Sub11_Sub1_3.method3862((float) -local502 * local48 + local167);
							this.aClass2_Sub11_Sub1_3.method3862(local491 + local52 * (float) -local502);
							this.aClass2_Sub11_Sub1_3.method3862(local497 + local56 * (float) -local502);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
							this.aClass2_Sub11_Sub1_3.method3862(1.0F);
							this.aClass2_Sub11_Sub1_3.method3862(0.0F);
							this.aClass2_Sub11_Sub1_3.method3862((float) local502 * local60 + local167);
							this.aClass2_Sub11_Sub1_3.method3862(local491 + local65 * (float) local502);
							this.aClass2_Sub11_Sub1_3.method3862(local497 + (float) local502 * local70);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
							this.aClass2_Sub11_Sub1_3.method3862(1.0F);
							this.aClass2_Sub11_Sub1_3.method3862(1.0F);
							this.aClass2_Sub11_Sub1_3.method3862(local48 * (float) local502 + local167);
							this.aClass2_Sub11_Sub1_3.method3862(local52 * (float) local502 + local491);
							this.aClass2_Sub11_Sub1_3.method3862(local497 + (float) local502 * local56);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
							this.aClass2_Sub11_Sub1_3.method3862(0.0F);
							this.aClass2_Sub11_Sub1_3.method3862(1.0F);
							this.aClass2_Sub11_Sub1_3.method3862((float) local502 * local75 + local167);
							this.aClass2_Sub11_Sub1_3.method3862((float) local502 * local80 + local491);
							this.aClass2_Sub11_Sub1_3.method3862((float) local502 * local89 + local497);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local113 = this.anIntArray619[local96] <= 64 ? this.anIntArray619[local96] : 64;
				if (local113 > 0) {
					for (local119 = local113 - 1; local119 >= 0; local119--) {
						local128 = this.aClass3_Sub2_Sub2ArrayArray2[local96][local119];
						local131 = local128.anInt8144;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt8145 >> 12;
						local161 = local128.anInt8148 >> 12;
						local167 = local128.anInt8143 >> 12;
						local172 = local128.anInt8147 >> 12;
						this.aClass2_Sub11_Sub1_3.method3861(0.0F);
						this.aClass2_Sub11_Sub1_3.method3861(0.0F);
						this.aClass2_Sub11_Sub1_3.method3861((float) -local172 * local48 + local155);
						this.aClass2_Sub11_Sub1_3.method3861((float) -local172 * local52 + local161);
						this.aClass2_Sub11_Sub1_3.method3861(local56 * (float) -local172 + local167);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
						this.aClass2_Sub11_Sub1_3.method3861(1.0F);
						this.aClass2_Sub11_Sub1_3.method3861(0.0F);
						this.aClass2_Sub11_Sub1_3.method3861(local155 + local60 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method3861(local161 + local65 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method3861(local167 + local70 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
						this.aClass2_Sub11_Sub1_3.method3861(1.0F);
						this.aClass2_Sub11_Sub1_3.method3861(1.0F);
						this.aClass2_Sub11_Sub1_3.method3861((float) local172 * local48 + local155);
						this.aClass2_Sub11_Sub1_3.method3861(local161 + (float) local172 * local52);
						this.aClass2_Sub11_Sub1_3.method3861(local167 + local56 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
						this.aClass2_Sub11_Sub1_3.method3861(0.0F);
						this.aClass2_Sub11_Sub1_3.method3861(1.0F);
						this.aClass2_Sub11_Sub1_3.method3861(local155 + local75 * (float) local172);
						this.aClass2_Sub11_Sub1_3.method3861((float) local172 * local80 + local161);
						this.aClass2_Sub11_Sub1_3.method3861((float) local172 * local89 + local167);
						this.aClass2_Sub11_Sub1_3.method8374(local136);
						this.aClass2_Sub11_Sub1_3.method8374(local141);
						this.aClass2_Sub11_Sub1_3.method8374(local144);
						this.aClass2_Sub11_Sub1_3.method8374(local149);
					}
					if (this.anIntArray619[local96] > 64) {
						local442 = this.anIntArray619[local96] - 65;
						for (local131 = this.anIntArray620[local442] - 1; local131 >= 0; local131--) {
							local458 = this.aClass3_Sub2_Sub2ArrayArray1[local442][local131];
							local461 = local458.anInt8144;
							local144 = (byte) (local461 >> 16);
							local149 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local167 = local458.anInt8145 >> 12;
							local491 = local458.anInt8148 >> 12;
							local497 = local458.anInt8143 >> 12;
							local502 = local458.anInt8147 >> 12;
							this.aClass2_Sub11_Sub1_3.method3861(0.0F);
							this.aClass2_Sub11_Sub1_3.method3861(0.0F);
							this.aClass2_Sub11_Sub1_3.method3861(local167 + (float) -local502 * local48);
							this.aClass2_Sub11_Sub1_3.method3861(local491 + local52 * (float) -local502);
							this.aClass2_Sub11_Sub1_3.method3861(local497 + local56 * (float) -local502);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
							this.aClass2_Sub11_Sub1_3.method3861(1.0F);
							this.aClass2_Sub11_Sub1_3.method3861(0.0F);
							this.aClass2_Sub11_Sub1_3.method3861(local60 * (float) local502 + local167);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local65 + local491);
							this.aClass2_Sub11_Sub1_3.method3861(local70 * (float) local502 + local497);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
							this.aClass2_Sub11_Sub1_3.method3861(1.0F);
							this.aClass2_Sub11_Sub1_3.method3861(1.0F);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local48 + local167);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local52 + local491);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local56 + local497);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
							this.aClass2_Sub11_Sub1_3.method3861(0.0F);
							this.aClass2_Sub11_Sub1_3.method3861(1.0F);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local75 + local167);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local80 + local491);
							this.aClass2_Sub11_Sub1_3.method3861((float) local502 * local89 + local497);
							this.aClass2_Sub11_Sub1_3.method8374(local144);
							this.aClass2_Sub11_Sub1_3.method8374(local149);
							this.aClass2_Sub11_Sub1_3.method8374(local474);
							this.aClass2_Sub11_Sub1_3.method8374(local479);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub11_Sub1_3.anInt10066 != 0) {
			this.anInterface11_7.method5046(24, this.aClass2_Sub11_Sub1_3.anInt10066, this.aClass2_Sub11_Sub1_3.aByteArray128);
			arg0.method7381(this.aClass223_16, this.aClass223_15, this.aClass223_14, null);
			arg0.method7343(this.aClass2_Sub11_Sub1_3.anInt10066 / 24);
		}
	}
}
