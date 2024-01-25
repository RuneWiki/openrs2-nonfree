import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class21 {

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Lclient!ut;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!hea;")
	private Class126 aClass126_2;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!hea;")
	private Class126 aClass126_3;

	@OriginalMember(owner = "client!as", name = "r", descriptor = "Lclient!hea;")
	private Class126 aClass126_4;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "[F")
	private final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!as", name = "b", descriptor = "Lclient!nea;")
	private final Class3_Sub11_Sub2 aClass3_Sub11_Sub2_1 = new Class3_Sub11_Sub2(786336);

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	private final int anInt483 = Static565.method7622(1600);

	@OriginalMember(owner = "client!as", name = "s", descriptor = "I")
	private int anInt486 = 0;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "[I")
	private final int[] anIntArray21 = new int[8191];

	@OriginalMember(owner = "client!as", name = "v", descriptor = "[I")
	private final int[] anIntArray22 = new int[1600];

	@OriginalMember(owner = "client!as", name = "w", descriptor = "[I")
	private final int[] anIntArray23 = new int[64];

	@OriginalMember(owner = "client!as", name = "t", descriptor = "[[Lclient!ed;")
	private final Class41_Sub3_Sub1[][] aClass41_Sub3_Sub1ArrayArray1 = new Class41_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!as", name = "x", descriptor = "[[Lclient!ed;")
	private final Class41_Sub3_Sub1[][] aClass41_Sub3_Sub1ArrayArray2 = new Class41_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!vj;II)V")
	private void method428(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static335.aFloat119 = arg0.aFloat197;
		arg0.method7455((float) arg1);
		arg0.method7511();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7437(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IILclient!vj;)V")
	private void method430(@OriginalArg(0) int arg0, @OriginalArg(2) Class45_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray5, 0);
		@Pc(15) float local15 = this.aFloatArray5[0];
		@Pc(26) float local26 = this.aFloatArray5[4];
		@Pc(31) float local31 = this.aFloatArray5[8];
		@Pc(36) float local36 = this.aFloatArray5[1];
		@Pc(41) float local41 = this.aFloatArray5[5];
		@Pc(46) float local46 = this.aFloatArray5[9];
		@Pc(50) float local50 = local15 + local36;
		@Pc(54) float local54 = local26 + local41;
		@Pc(58) float local58 = local31 + local46;
		@Pc(62) float local62 = local15 - local36;
		@Pc(66) float local66 = local26 - local41;
		@Pc(70) float local70 = local31 - local46;
		@Pc(74) float local74 = local36 - local15;
		@Pc(78) float local78 = local41 - local26;
		this.aClass3_Sub11_Sub2_1.anInt6128 = 0;
		@Pc(87) float local87 = local46 - local31;
		@Pc(94) int local94;
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(126) Class41_Sub3_Sub1 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(495) float local495;
		@Pc(500) int local500;
		@Pc(440) int local440;
		@Pc(456) Class41_Sub3_Sub1 local456;
		@Pc(459) int local459;
		@Pc(472) byte local472;
		@Pc(477) byte local477;
		@Pc(489) float local489;
		if (arg1.aBoolean687) {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray22[local94] > 64 ? 64 : this.anIntArray22[local94];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass41_Sub3_Sub1ArrayArray2[local94][local117];
						local129 = local126.anInt6763;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt6767 >> 12;
						local159 = local126.anInt6761 >> 12;
						local165 = local126.anInt6766 >> 12;
						local170 = local126.anInt6765 >> 12;
						this.aClass3_Sub11_Sub2_1.method5233(0.0F);
						this.aClass3_Sub11_Sub2_1.method5233(0.0F);
						this.aClass3_Sub11_Sub2_1.method5233((float) -local170 * local50 + local153);
						this.aClass3_Sub11_Sub2_1.method5233(local159 + local54 * (float) -local170);
						this.aClass3_Sub11_Sub2_1.method5233(local58 * (float) -local170 + local165);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
						this.aClass3_Sub11_Sub2_1.method5233(1.0F);
						this.aClass3_Sub11_Sub2_1.method5233(0.0F);
						this.aClass3_Sub11_Sub2_1.method5233(local62 * (float) local170 + local153);
						this.aClass3_Sub11_Sub2_1.method5233(local66 * (float) local170 + local159);
						this.aClass3_Sub11_Sub2_1.method5233(local165 + (float) local170 * local70);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
						this.aClass3_Sub11_Sub2_1.method5233(1.0F);
						this.aClass3_Sub11_Sub2_1.method5233(1.0F);
						this.aClass3_Sub11_Sub2_1.method5233(local50 * (float) local170 + local153);
						this.aClass3_Sub11_Sub2_1.method5233(local159 + (float) local170 * local54);
						this.aClass3_Sub11_Sub2_1.method5233(local165 + local58 * (float) local170);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
						this.aClass3_Sub11_Sub2_1.method5233(0.0F);
						this.aClass3_Sub11_Sub2_1.method5233(1.0F);
						this.aClass3_Sub11_Sub2_1.method5233((float) local170 * local74 + local153);
						this.aClass3_Sub11_Sub2_1.method5233(local159 + (float) local170 * local78);
						this.aClass3_Sub11_Sub2_1.method5233((float) local170 * local87 + local165);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
					}
					if (this.anIntArray22[local94] > 64) {
						local440 = this.anIntArray22[local94] - 1 - 64;
						for (local129 = this.anIntArray23[local440] - 1; local129 >= 0; local129--) {
							local456 = this.aClass41_Sub3_Sub1ArrayArray1[local440][local129];
							local459 = local456.anInt6763;
							local142 = (byte) (local459 >> 16);
							local147 = (byte) (local459 >> 8);
							local472 = (byte) local459;
							local477 = (byte) (local459 >>> 24);
							local165 = local456.anInt6767 >> 12;
							local489 = local456.anInt6761 >> 12;
							local495 = local456.anInt6766 >> 12;
							local500 = local456.anInt6765 >> 12;
							this.aClass3_Sub11_Sub2_1.method5233(0.0F);
							this.aClass3_Sub11_Sub2_1.method5233(0.0F);
							this.aClass3_Sub11_Sub2_1.method5233(local50 * (float) -local500 + local165);
							this.aClass3_Sub11_Sub2_1.method5233(local489 + (float) -local500 * local54);
							this.aClass3_Sub11_Sub2_1.method5233(local58 * (float) -local500 + local495);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
							this.aClass3_Sub11_Sub2_1.method5233(1.0F);
							this.aClass3_Sub11_Sub2_1.method5233(0.0F);
							this.aClass3_Sub11_Sub2_1.method5233((float) local500 * local62 + local165);
							this.aClass3_Sub11_Sub2_1.method5233(local489 + (float) local500 * local66);
							this.aClass3_Sub11_Sub2_1.method5233(local495 + local70 * (float) local500);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
							this.aClass3_Sub11_Sub2_1.method5233(1.0F);
							this.aClass3_Sub11_Sub2_1.method5233(1.0F);
							this.aClass3_Sub11_Sub2_1.method5233(local165 + (float) local500 * local50);
							this.aClass3_Sub11_Sub2_1.method5233(local489 + local54 * (float) local500);
							this.aClass3_Sub11_Sub2_1.method5233(local495 + local58 * (float) local500);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
							this.aClass3_Sub11_Sub2_1.method5233(0.0F);
							this.aClass3_Sub11_Sub2_1.method5233(1.0F);
							this.aClass3_Sub11_Sub2_1.method5233((float) local500 * local74 + local165);
							this.aClass3_Sub11_Sub2_1.method5233(local489 + (float) local500 * local78);
							this.aClass3_Sub11_Sub2_1.method5233((float) local500 * local87 + local495);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
						}
					}
				}
			}
		} else {
			for (local94 = arg0 - 1; local94 >= 0; local94--) {
				local111 = this.anIntArray22[local94] > 64 ? 64 : this.anIntArray22[local94];
				if (local111 > 0) {
					for (local117 = local111 - 1; local117 >= 0; local117--) {
						local126 = this.aClass41_Sub3_Sub1ArrayArray2[local94][local117];
						local129 = local126.anInt6763;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt6767 >> 12;
						local159 = local126.anInt6761 >> 12;
						local165 = local126.anInt6766 >> 12;
						local170 = local126.anInt6765 >> 12;
						this.aClass3_Sub11_Sub2_1.method5234(0.0F);
						this.aClass3_Sub11_Sub2_1.method5234(0.0F);
						this.aClass3_Sub11_Sub2_1.method5234((float) -local170 * local50 + local153);
						this.aClass3_Sub11_Sub2_1.method5234(local159 + local54 * (float) -local170);
						this.aClass3_Sub11_Sub2_1.method5234(local165 + (float) -local170 * local58);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
						this.aClass3_Sub11_Sub2_1.method5234(1.0F);
						this.aClass3_Sub11_Sub2_1.method5234(0.0F);
						this.aClass3_Sub11_Sub2_1.method5234(local153 + (float) local170 * local62);
						this.aClass3_Sub11_Sub2_1.method5234(local159 + (float) local170 * local66);
						this.aClass3_Sub11_Sub2_1.method5234(local70 * (float) local170 + local165);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
						this.aClass3_Sub11_Sub2_1.method5234(1.0F);
						this.aClass3_Sub11_Sub2_1.method5234(1.0F);
						this.aClass3_Sub11_Sub2_1.method5234(local153 + local50 * (float) local170);
						this.aClass3_Sub11_Sub2_1.method5234(local159 + local54 * (float) local170);
						this.aClass3_Sub11_Sub2_1.method5234(local165 + (float) local170 * local58);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
						this.aClass3_Sub11_Sub2_1.method5234(0.0F);
						this.aClass3_Sub11_Sub2_1.method5234(1.0F);
						this.aClass3_Sub11_Sub2_1.method5234((float) local170 * local74 + local153);
						this.aClass3_Sub11_Sub2_1.method5234(local159 + (float) local170 * local78);
						this.aClass3_Sub11_Sub2_1.method5234(local165 + (float) local170 * local87);
						this.aClass3_Sub11_Sub2_1.method5213(local134);
						this.aClass3_Sub11_Sub2_1.method5213(local139);
						this.aClass3_Sub11_Sub2_1.method5213(local142);
						this.aClass3_Sub11_Sub2_1.method5213(local147);
					}
					if (this.anIntArray22[local94] > 64) {
						local440 = this.anIntArray22[local94] - 64 - 1;
						for (local129 = this.anIntArray23[local440] - 1; local129 >= 0; local129--) {
							local456 = this.aClass41_Sub3_Sub1ArrayArray1[local440][local129];
							local459 = local456.anInt6763;
							local142 = (byte) (local459 >> 16);
							local147 = (byte) (local459 >> 8);
							local472 = (byte) local459;
							local477 = (byte) (local459 >>> 24);
							local165 = local456.anInt6767 >> 12;
							local489 = local456.anInt6761 >> 12;
							local495 = local456.anInt6766 >> 12;
							local500 = local456.anInt6765 >> 12;
							this.aClass3_Sub11_Sub2_1.method5234(0.0F);
							this.aClass3_Sub11_Sub2_1.method5234(0.0F);
							this.aClass3_Sub11_Sub2_1.method5234((float) -local500 * local50 + local165);
							this.aClass3_Sub11_Sub2_1.method5234(local489 + local54 * (float) -local500);
							this.aClass3_Sub11_Sub2_1.method5234(local495 + local58 * (float) -local500);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
							this.aClass3_Sub11_Sub2_1.method5234(1.0F);
							this.aClass3_Sub11_Sub2_1.method5234(0.0F);
							this.aClass3_Sub11_Sub2_1.method5234(local62 * (float) local500 + local165);
							this.aClass3_Sub11_Sub2_1.method5234(local66 * (float) local500 + local489);
							this.aClass3_Sub11_Sub2_1.method5234(local70 * (float) local500 + local495);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
							this.aClass3_Sub11_Sub2_1.method5234(1.0F);
							this.aClass3_Sub11_Sub2_1.method5234(1.0F);
							this.aClass3_Sub11_Sub2_1.method5234(local165 + local50 * (float) local500);
							this.aClass3_Sub11_Sub2_1.method5234((float) local500 * local54 + local489);
							this.aClass3_Sub11_Sub2_1.method5234((float) local500 * local58 + local495);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
							this.aClass3_Sub11_Sub2_1.method5234(0.0F);
							this.aClass3_Sub11_Sub2_1.method5234(1.0F);
							this.aClass3_Sub11_Sub2_1.method5234((float) local500 * local74 + local165);
							this.aClass3_Sub11_Sub2_1.method5234(local489 + local78 * (float) local500);
							this.aClass3_Sub11_Sub2_1.method5234(local495 + (float) local500 * local87);
							this.aClass3_Sub11_Sub2_1.method5213(local142);
							this.aClass3_Sub11_Sub2_1.method5213(local147);
							this.aClass3_Sub11_Sub2_1.method5213(local472);
							this.aClass3_Sub11_Sub2_1.method5213(local477);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub11_Sub2_1.anInt6128 != 0) {
			this.anInterface21_1.method7596(this.aClass3_Sub11_Sub2_1.anInt6128, this.aClass3_Sub11_Sub2_1.aByteArray62, 24);
			arg1.method7498(this.aClass126_2, this.aClass126_3, this.aClass126_4, null);
			arg1.method7457(this.aClass3_Sub11_Sub2_1.anInt6128 / 24);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLclient!vj;)V")
	private void method433(@OriginalArg(1) Class45_Sub3 arg0) {
		Static335.aFloat119 = arg0.aFloat197;
		arg0.method7493();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7437(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!vj;)V")
	public void method434(@OriginalArg(1) Class45_Sub3 arg0) {
		this.anInterface21_1 = arg0.method7517(null, 24, true, 196584);
		this.aClass126_4 = new Class126(this.anInterface21_1, 5126, 2, 0);
		this.aClass126_2 = new Class126(this.anInterface21_1, 5126, 3, 8);
		this.aClass126_3 = new Class126(this.anInterface21_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!qw;ILclient!vj;I)V")
	public void method435(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45_Sub3 arg2) {
		if (arg2.aClass11_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method428(arg2, arg1);
		} else {
			this.method433(arg2);
		}
		@Pc(28) float local28 = arg2.aClass11_Sub2_3.aFloat111;
		@Pc(39) float local39 = arg2.aClass11_Sub2_3.aFloat112;
		@Pc(43) float local43 = arg2.aClass11_Sub2_3.aFloat110;
		@Pc(47) float local47 = arg2.aClass11_Sub2_3.aFloat103;
		try {
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = Integer.MAX_VALUE;
			@Pc(53) int local53 = 0;
			@Pc(57) Class41_Sub3 local57 = arg0.aClass206_1.aClass41_Sub3_5;
			@Pc(60) Class41_Sub3 local60;
			@Pc(92) int local92;
			for (local60 = local57.aClass41_Sub3_10; local60 != local57; local60 = local60.aClass41_Sub3_10) {
				@Pc(65) Class41_Sub3_Sub1 local65 = (Class41_Sub3_Sub1) local60;
				local92 = (int) (local47 + (float) (local65.anInt6766 >> 12) * local43 + (float) (local65.anInt6767 >> 12) * local28 + local39 * (float) (local65.anInt6761 >> 12));
				if (local92 < local51) {
					local51 = local92;
				}
				if (local53 < local92) {
					local53 = local92;
				}
				this.anIntArray21[local49++] = local92;
			}
			@Pc(123) int local123 = local53 - local51;
			if (local123 + 2 <= 1600) {
				local123 += 2;
				local92 = 0;
			} else {
				local92 = Static565.method7622(local123) + 1 - this.anInt483;
				local123 = (local123 >> local92) + 2;
			}
			local60 = local57.aClass41_Sub3_10;
			local49 = 0;
			@Pc(158) int local158 = -2;
			@Pc(160) boolean local160 = true;
			@Pc(162) boolean local162 = true;
			while (local60 != local57) {
				this.anInt486 = 0;
				for (@Pc(169) int local169 = 0; local169 < local123; local169++) {
					this.anIntArray22[local169] = 0;
				}
				for (@Pc(182) int local182 = 0; local182 < 64; local182++) {
					this.anIntArray23[local182] = 0;
				}
				while (local57 != local60) {
					@Pc(200) Class41_Sub3_Sub1 local200 = (Class41_Sub3_Sub1) local60;
					if (local162) {
						local160 = local200.aBoolean504;
						local162 = false;
						local158 = local200.anInt6764;
					}
					if (local49 > 0 && (local200.anInt6764 != local158 || local160 != local200.aBoolean504)) {
						local162 = true;
						break;
					}
					@Pc(246) int local246 = this.anIntArray21[local49++] - local51 >> local92;
					if (local246 < 1600) {
						if (this.anIntArray22[local246] >= 64) {
							label101: {
								if (this.anIntArray22[local246] == 64) {
									if (this.anInt486 == 64) {
										break label101;
									}
									this.anIntArray22[local246] += this.anInt486++ + 1;
								}
								@Pc(297) Class41_Sub3_Sub1[] local297 = this.aClass41_Sub3_Sub1ArrayArray1[this.anIntArray22[local246] - 1 - 64];
								@Pc(307) int local307 = this.anIntArray22[local246] - 64 - 1;
								@Pc(309) int local309 = this.anIntArray23[this.anIntArray22[local246] - 64 - 1];
								this.anIntArray23[local307] = this.anIntArray23[this.anIntArray22[local246] - 64 - 1] + 1;
								local297[local309] = local200;
							}
						} else {
							this.aClass41_Sub3_Sub1ArrayArray2[local246][this.anIntArray22[local246]++] = local200;
						}
					}
					local60 = local60.aClass41_Sub3_10;
				}
				if (local158 >= 0) {
					arg2.method7505(local158);
				} else {
					arg2.method7505(-1);
				}
				if (local160 && Static335.aFloat119 != arg2.aFloat197) {
					arg2.ra(Static335.aFloat119);
				} else if (arg2.aFloat197 != 1.0F) {
					arg2.ra(1.0F);
				}
				this.method430(local123, arg2);
			}
		} catch (@Pc(382) Exception local382) {
		}
		this.method436(arg2);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!vj;I)V")
	private void method436(@OriginalArg(0) Class45_Sub3 arg0) {
		arg0.method7437(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat197 != Static335.aFloat119) {
			arg0.ra(Static335.aFloat119);
		}
	}
}
