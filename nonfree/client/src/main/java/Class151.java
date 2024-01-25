import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class151 {

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "Lclient!jaa;")
	private Class164 aClass164_8;

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "Lclient!jaa;")
	private Class164 aClass164_9;

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "Lclient!jaa;")
	private Class164 aClass164_10;

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "Lclient!lca;")
	private Interface14 anInterface14_3;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "[F")
	private final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!ag;")
	private final Class3_Sub3_Sub1 aClass3_Sub3_Sub1_2 = new Class3_Sub3_Sub1(786336);

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "I")
	private final int anInt4428 = Static636.method8709(1600);

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "[[Lclient!nb;")
	private final Class4_Sub2_Sub2[][] aClass4_Sub2_Sub2ArrayArray3 = new Class4_Sub2_Sub2[64][768];

	@OriginalMember(owner = "client!ida", name = "t", descriptor = "[[Lclient!nb;")
	private final Class4_Sub2_Sub2[][] aClass4_Sub2_Sub2ArrayArray4 = new Class4_Sub2_Sub2[1600][64];

	@OriginalMember(owner = "client!ida", name = "s", descriptor = "[I")
	private final int[] anIntArray230 = new int[64];

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "[I")
	private final int[] anIntArray232 = new int[1600];

	@OriginalMember(owner = "client!ida", name = "v", descriptor = "I")
	private int anInt4430 = 0;

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "[I")
	private final int[] anIntArray231 = new int[8191];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!kw;B)V")
	public void method3911(@OriginalArg(0) Class5_Sub2 arg0) {
		this.anInterface14_3 = arg0.method5011(true, 196584, null, 24);
		this.aClass164_9 = new Class164(this.anInterface14_3, 5126, 2, 0);
		this.aClass164_8 = new Class164(this.anInterface14_3, 5126, 3, 8);
		this.aClass164_10 = new Class164(this.anInterface14_3, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLclient!kw;ILclient!eea;)V")
	public void method3913(@OriginalArg(1) Class5_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class85 arg2) {
		if (arg0.aClass39_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method3915(arg1, arg0);
		} else {
			this.method3918(arg0);
		}
		@Pc(29) float local29 = arg0.aClass39_Sub2_3.aFloat172;
		@Pc(33) float local33 = arg0.aClass39_Sub2_3.aFloat171;
		@Pc(37) float local37 = arg0.aClass39_Sub2_3.aFloat176;
		@Pc(41) float local41 = arg0.aClass39_Sub2_3.aFloat174;
		try {
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = Integer.MAX_VALUE;
			@Pc(51) int local51 = 0;
			@Pc(55) Class4_Sub2 local55 = arg2.aClass34_1.aClass4_Sub2_3;
			@Pc(58) Class4_Sub2 local58;
			@Pc(90) int local90;
			for (local58 = local55.aClass4_Sub2_10; local58 != local55; local58 = local58.aClass4_Sub2_10) {
				@Pc(63) Class4_Sub2_Sub2 local63 = (Class4_Sub2_Sub2) local58;
				local90 = (int) (local41 + local33 * (float) (local63.anInt7716 >> 12) + local29 * (float) (local63.anInt7719 >> 12) + local37 * (float) (local63.anInt7720 >> 12));
				this.anIntArray231[local47++] = local90;
				if (local49 > local90) {
					local49 = local90;
				}
				if (local51 < local90) {
					local51 = local90;
				}
			}
			@Pc(125) int local125 = local51 - local49;
			if (local125 + 2 > 1600) {
				local90 = Static636.method8709(local125) + 1 - this.anInt4428;
				local125 = (local125 >> local90) + 2;
			} else {
				local90 = 0;
				local125 += 2;
			}
			local58 = local55.aClass4_Sub2_10;
			local47 = 0;
			@Pc(160) int local160 = -2;
			@Pc(162) boolean local162 = true;
			@Pc(164) boolean local164 = true;
			while (local55 != local58) {
				this.anInt4430 = 0;
				for (@Pc(171) int local171 = 0; local171 < local125; local171++) {
					this.anIntArray232[local171] = 0;
				}
				for (@Pc(188) int local188 = 0; local188 < 64; local188++) {
					this.anIntArray230[local188] = 0;
				}
				while (local58 != local55) {
					@Pc(204) Class4_Sub2_Sub2 local204 = (Class4_Sub2_Sub2) local58;
					if (local164) {
						local164 = false;
						local162 = local204.aBoolean541;
						local160 = local204.anInt7718;
					}
					if (local47 > 0 && (local204.anInt7718 != local160 || local204.aBoolean541 != local162)) {
						local164 = true;
						break;
					}
					@Pc(250) int local250 = this.anIntArray231[local47++] - local49 >> local90;
					if (local250 < 1600) {
						if (this.anIntArray232[local250] >= 64) {
							label107: {
								if (this.anIntArray232[local250] == 64) {
									if (this.anInt4430 == 64) {
										break label107;
									}
									this.anIntArray232[local250] += this.anInt4430++ + 1;
								}
								@Pc(302) Class4_Sub2_Sub2[] local302 = this.aClass4_Sub2_Sub2ArrayArray3[this.anIntArray232[local250] - 64 - 1];
								@Pc(312) int local312 = this.anIntArray232[local250] - 64 - 1;
								@Pc(314) int local314 = this.anIntArray230[this.anIntArray232[local250] - 64 - 1];
								this.anIntArray230[local312] = this.anIntArray230[this.anIntArray232[local250] - 64 - 1] + 1;
								local302[local314] = local204;
							}
						} else {
							this.aClass4_Sub2_Sub2ArrayArray4[local250][this.anIntArray232[local250]++] = local204;
						}
					}
					local58 = local58.aClass4_Sub2_10;
				}
				if (local160 >= 0) {
					arg0.method5009(local160);
				} else {
					arg0.method5009(-1);
				}
				if (local162 && Static491.aFloat199 != arg0.aFloat118) {
					arg0.xa(Static491.aFloat199);
				} else if (arg0.aFloat118 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method3917(local125, arg0);
			}
		} catch (@Pc(388) Exception local388) {
		}
		this.method3914(arg0);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BLclient!kw;)V")
	private void method3914(@OriginalArg(1) Class5_Sub2 arg0) {
		arg0.method4993(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static491.aFloat199 != arg0.aFloat118) {
			arg0.xa(Static491.aFloat199);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IILclient!kw;)V")
	private void method3915(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		Static491.aFloat199 = arg1.aFloat118;
		arg1.method5022((float) arg0);
		arg1.method5020();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method4993(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IBLclient!kw;)V")
	private void method3917(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray30, 0);
		@Pc(15) float local15 = this.aFloatArray30[0];
		@Pc(20) float local20 = this.aFloatArray30[4];
		@Pc(25) float local25 = this.aFloatArray30[8];
		@Pc(30) float local30 = this.aFloatArray30[1];
		@Pc(35) float local35 = this.aFloatArray30[5];
		@Pc(40) float local40 = this.aFloatArray30[9];
		@Pc(48) float local48 = local15 + local30;
		@Pc(52) float local52 = local35 + local20;
		@Pc(56) float local56 = local40 + local25;
		@Pc(61) float local61 = local15 - local30;
		@Pc(65) float local65 = local20 - local35;
		@Pc(70) float local70 = local25 - local40;
		@Pc(75) float local75 = local30 - local15;
		@Pc(80) float local80 = local35 - local20;
		@Pc(84) float local84 = local40 - local25;
		this.aClass3_Sub3_Sub1_2.anInt4736 = 0;
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(116) int local116;
		@Pc(125) Class4_Sub2_Sub2 local125;
		@Pc(128) int local128;
		@Pc(133) byte local133;
		@Pc(138) byte local138;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(152) float local152;
		@Pc(158) float local158;
		@Pc(164) float local164;
		@Pc(169) int local169;
		@Pc(487) float local487;
		@Pc(492) int local492;
		@Pc(432) int local432;
		@Pc(448) Class4_Sub2_Sub2 local448;
		@Pc(451) int local451;
		@Pc(464) byte local464;
		@Pc(469) byte local469;
		@Pc(481) float local481;
		if (arg1.aBoolean387) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray232[local95] <= 64 ? this.anIntArray232[local95] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass4_Sub2_Sub2ArrayArray4[local95][local116];
						local128 = local125.anInt7717;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt7719 >> 12;
						local158 = local125.anInt7716 >> 12;
						local164 = local125.anInt7720 >> 12;
						local169 = local125.anInt7721 >> 12;
						this.aClass3_Sub3_Sub1_2.method834(0.0F);
						this.aClass3_Sub3_Sub1_2.method834(0.0F);
						this.aClass3_Sub3_Sub1_2.method834(local152 + local48 * (float) -local169);
						this.aClass3_Sub3_Sub1_2.method834(local158 + local52 * (float) -local169);
						this.aClass3_Sub3_Sub1_2.method834(local164 + (float) -local169 * local56);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
						this.aClass3_Sub3_Sub1_2.method834(1.0F);
						this.aClass3_Sub3_Sub1_2.method834(0.0F);
						this.aClass3_Sub3_Sub1_2.method834((float) local169 * local61 + local152);
						this.aClass3_Sub3_Sub1_2.method834((float) local169 * local65 + local158);
						this.aClass3_Sub3_Sub1_2.method834(local70 * (float) local169 + local164);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
						this.aClass3_Sub3_Sub1_2.method834(1.0F);
						this.aClass3_Sub3_Sub1_2.method834(1.0F);
						this.aClass3_Sub3_Sub1_2.method834((float) local169 * local48 + local152);
						this.aClass3_Sub3_Sub1_2.method834(local52 * (float) local169 + local158);
						this.aClass3_Sub3_Sub1_2.method834((float) local169 * local56 + local164);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
						this.aClass3_Sub3_Sub1_2.method834(0.0F);
						this.aClass3_Sub3_Sub1_2.method834(1.0F);
						this.aClass3_Sub3_Sub1_2.method834(local75 * (float) local169 + local152);
						this.aClass3_Sub3_Sub1_2.method834(local158 + local80 * (float) local169);
						this.aClass3_Sub3_Sub1_2.method834(local164 + local84 * (float) local169);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
					}
					if (this.anIntArray232[local95] > 64) {
						local432 = this.anIntArray232[local95] - 65;
						for (local128 = this.anIntArray230[local432] - 1; local128 >= 0; local128--) {
							local448 = this.aClass4_Sub2_Sub2ArrayArray3[local432][local128];
							local451 = local448.anInt7717;
							local141 = (byte) (local451 >> 16);
							local146 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local164 = local448.anInt7719 >> 12;
							local481 = local448.anInt7716 >> 12;
							local487 = local448.anInt7720 >> 12;
							local492 = local448.anInt7721 >> 12;
							this.aClass3_Sub3_Sub1_2.method834(0.0F);
							this.aClass3_Sub3_Sub1_2.method834(0.0F);
							this.aClass3_Sub3_Sub1_2.method834(local164 + (float) -local492 * local48);
							this.aClass3_Sub3_Sub1_2.method834(local481 + (float) -local492 * local52);
							this.aClass3_Sub3_Sub1_2.method834((float) -local492 * local56 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
							this.aClass3_Sub3_Sub1_2.method834(1.0F);
							this.aClass3_Sub3_Sub1_2.method834(0.0F);
							this.aClass3_Sub3_Sub1_2.method834(local164 + (float) local492 * local61);
							this.aClass3_Sub3_Sub1_2.method834(local481 + local65 * (float) local492);
							this.aClass3_Sub3_Sub1_2.method834(local487 + (float) local492 * local70);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
							this.aClass3_Sub3_Sub1_2.method834(1.0F);
							this.aClass3_Sub3_Sub1_2.method834(1.0F);
							this.aClass3_Sub3_Sub1_2.method834(local164 + (float) local492 * local48);
							this.aClass3_Sub3_Sub1_2.method834(local481 + local52 * (float) local492);
							this.aClass3_Sub3_Sub1_2.method834((float) local492 * local56 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
							this.aClass3_Sub3_Sub1_2.method834(0.0F);
							this.aClass3_Sub3_Sub1_2.method834(1.0F);
							this.aClass3_Sub3_Sub1_2.method834((float) local492 * local75 + local164);
							this.aClass3_Sub3_Sub1_2.method834(local481 + local80 * (float) local492);
							this.aClass3_Sub3_Sub1_2.method834((float) local492 * local84 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray232[local95] <= 64 ? this.anIntArray232[local95] : 64;
				if (local110 > 0) {
					for (local116 = local110 - 1; local116 >= 0; local116--) {
						local125 = this.aClass4_Sub2_Sub2ArrayArray4[local95][local116];
						local128 = local125.anInt7717;
						local133 = (byte) (local128 >> 16);
						local138 = (byte) (local128 >> 8);
						local141 = (byte) local128;
						local146 = (byte) (local128 >>> 24);
						local152 = local125.anInt7719 >> 12;
						local158 = local125.anInt7716 >> 12;
						local164 = local125.anInt7720 >> 12;
						local169 = local125.anInt7721 >> 12;
						this.aClass3_Sub3_Sub1_2.method833(0.0F);
						this.aClass3_Sub3_Sub1_2.method833(0.0F);
						this.aClass3_Sub3_Sub1_2.method833((float) -local169 * local48 + local152);
						this.aClass3_Sub3_Sub1_2.method833((float) -local169 * local52 + local158);
						this.aClass3_Sub3_Sub1_2.method833(local164 + local56 * (float) -local169);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
						this.aClass3_Sub3_Sub1_2.method833(1.0F);
						this.aClass3_Sub3_Sub1_2.method833(0.0F);
						this.aClass3_Sub3_Sub1_2.method833(local152 + (float) local169 * local61);
						this.aClass3_Sub3_Sub1_2.method833(local158 + local65 * (float) local169);
						this.aClass3_Sub3_Sub1_2.method833(local164 + (float) local169 * local70);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
						this.aClass3_Sub3_Sub1_2.method833(1.0F);
						this.aClass3_Sub3_Sub1_2.method833(1.0F);
						this.aClass3_Sub3_Sub1_2.method833((float) local169 * local48 + local152);
						this.aClass3_Sub3_Sub1_2.method833(local158 + local52 * (float) local169);
						this.aClass3_Sub3_Sub1_2.method833(local164 + (float) local169 * local56);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
						this.aClass3_Sub3_Sub1_2.method833(0.0F);
						this.aClass3_Sub3_Sub1_2.method833(1.0F);
						this.aClass3_Sub3_Sub1_2.method833(local152 + (float) local169 * local75);
						this.aClass3_Sub3_Sub1_2.method833((float) local169 * local80 + local158);
						this.aClass3_Sub3_Sub1_2.method833(local84 * (float) local169 + local164);
						this.aClass3_Sub3_Sub1_2.method4220(local133);
						this.aClass3_Sub3_Sub1_2.method4220(local138);
						this.aClass3_Sub3_Sub1_2.method4220(local141);
						this.aClass3_Sub3_Sub1_2.method4220(local146);
					}
					if (this.anIntArray232[local95] > 64) {
						local432 = this.anIntArray232[local95] - 64 - 1;
						for (local128 = this.anIntArray230[local432] - 1; local128 >= 0; local128--) {
							local448 = this.aClass4_Sub2_Sub2ArrayArray3[local432][local128];
							local451 = local448.anInt7717;
							local141 = (byte) (local451 >> 16);
							local146 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local164 = local448.anInt7719 >> 12;
							local481 = local448.anInt7716 >> 12;
							local487 = local448.anInt7720 >> 12;
							local492 = local448.anInt7721 >> 12;
							this.aClass3_Sub3_Sub1_2.method833(0.0F);
							this.aClass3_Sub3_Sub1_2.method833(0.0F);
							this.aClass3_Sub3_Sub1_2.method833(local164 + (float) -local492 * local48);
							this.aClass3_Sub3_Sub1_2.method833(local52 * (float) -local492 + local481);
							this.aClass3_Sub3_Sub1_2.method833((float) -local492 * local56 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
							this.aClass3_Sub3_Sub1_2.method833(1.0F);
							this.aClass3_Sub3_Sub1_2.method833(0.0F);
							this.aClass3_Sub3_Sub1_2.method833(local164 + local61 * (float) local492);
							this.aClass3_Sub3_Sub1_2.method833(local481 + local65 * (float) local492);
							this.aClass3_Sub3_Sub1_2.method833(local70 * (float) local492 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
							this.aClass3_Sub3_Sub1_2.method833(1.0F);
							this.aClass3_Sub3_Sub1_2.method833(1.0F);
							this.aClass3_Sub3_Sub1_2.method833(local164 + (float) local492 * local48);
							this.aClass3_Sub3_Sub1_2.method833((float) local492 * local52 + local481);
							this.aClass3_Sub3_Sub1_2.method833(local56 * (float) local492 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
							this.aClass3_Sub3_Sub1_2.method833(0.0F);
							this.aClass3_Sub3_Sub1_2.method833(1.0F);
							this.aClass3_Sub3_Sub1_2.method833(local164 + local75 * (float) local492);
							this.aClass3_Sub3_Sub1_2.method833(local80 * (float) local492 + local481);
							this.aClass3_Sub3_Sub1_2.method833(local84 * (float) local492 + local487);
							this.aClass3_Sub3_Sub1_2.method4220(local141);
							this.aClass3_Sub3_Sub1_2.method4220(local146);
							this.aClass3_Sub3_Sub1_2.method4220(local464);
							this.aClass3_Sub3_Sub1_2.method4220(local469);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub3_Sub1_2.anInt4736 != 0) {
			this.anInterface14_3.method3805(24, this.aClass3_Sub3_Sub1_2.anInt4736, this.aClass3_Sub3_Sub1_2.aByteArray54);
			arg1.method4967(this.aClass164_8, this.aClass164_10, this.aClass164_9, null);
			arg1.method4995(this.aClass3_Sub3_Sub1_2.anInt4736 / 24);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLclient!kw;)V")
	private void method3918(@OriginalArg(1) Class5_Sub2 arg0) {
		Static491.aFloat199 = arg0.aFloat118;
		arg0.method5012();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4993(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
