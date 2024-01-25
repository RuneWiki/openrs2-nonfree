import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class124 {

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!as;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!as;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!as;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!pi;")
	private Interface11 anInterface11_2;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "[F")
	private final float[] aFloatArray27 = new float[16];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!jv;")
	private final Class5_Sub3_Sub2 aClass5_Sub3_Sub2_1 = new Class5_Sub3_Sub2(786336);

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	private final int anInt3474 = Static344.method5361(1600);

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "[I")
	private final int[] anIntArray256 = new int[1600];

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
	private final int[] anIntArray258 = new int[8191];

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[[Lclient!tl;")
	private final Class30_Sub2_Sub1[][] aClass30_Sub2_Sub1ArrayArray3 = new Class30_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	private int anInt3475 = 0;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "[I")
	private final int[] anIntArray257 = new int[64];

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[[Lclient!tl;")
	private final Class30_Sub2_Sub1[][] aClass30_Sub2_Sub1ArrayArray4 = new Class30_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!jj;I)V")
	private void method3056(@OriginalArg(0) Class62_Sub3 arg0) {
		arg0.method3989(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static454.aFloat329 != arg0.aFloat191) {
			arg0.M(Static454.aFloat329);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!jj;Z)V")
	private void method3057(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray27, 0);
		@Pc(22) float local22 = this.aFloatArray27[0];
		@Pc(27) float local27 = this.aFloatArray27[4];
		@Pc(32) float local32 = this.aFloatArray27[8];
		@Pc(37) float local37 = this.aFloatArray27[1];
		@Pc(42) float local42 = this.aFloatArray27[5];
		@Pc(47) float local47 = this.aFloatArray27[9];
		@Pc(51) float local51 = local37 + local22;
		@Pc(55) float local55 = local42 + local27;
		@Pc(59) float local59 = local47 + local32;
		@Pc(64) float local64 = local22 - local37;
		@Pc(68) float local68 = local27 - local42;
		@Pc(72) float local72 = local32 - local47;
		@Pc(77) float local77 = local37 - local22;
		@Pc(82) float local82 = local42 - local27;
		this.aClass5_Sub3_Sub2_1.anInt4960 = 0;
		@Pc(91) float local91 = local47 - local32;
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(124) int local124;
		@Pc(133) Class30_Sub2_Sub1 local133;
		@Pc(136) int local136;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(149) byte local149;
		@Pc(154) byte local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(172) float local172;
		@Pc(177) int local177;
		@Pc(496) float local496;
		@Pc(501) int local501;
		@Pc(441) int local441;
		@Pc(457) Class30_Sub2_Sub1 local457;
		@Pc(460) int local460;
		@Pc(473) byte local473;
		@Pc(478) byte local478;
		@Pc(490) float local490;
		if (arg1.aBoolean278) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray256[local98] > 64 ? 64 : this.anIntArray256[local98];
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass30_Sub2_Sub1ArrayArray3[local98][local124];
						local136 = local133.anInt2962;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt2966 >> 12;
						local166 = local133.anInt2967 >> 12;
						local172 = local133.anInt2969 >> 12;
						local177 = local133.anInt2963 >> 12;
						this.aClass5_Sub3_Sub2_1.method4236(0.0F);
						this.aClass5_Sub3_Sub2_1.method4236(0.0F);
						this.aClass5_Sub3_Sub2_1.method4236(local160 + local51 * (float) -local177);
						this.aClass5_Sub3_Sub2_1.method4236(local166 + local55 * (float) -local177);
						this.aClass5_Sub3_Sub2_1.method4236(local59 * (float) -local177 + local172);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
						this.aClass5_Sub3_Sub2_1.method4236(1.0F);
						this.aClass5_Sub3_Sub2_1.method4236(0.0F);
						this.aClass5_Sub3_Sub2_1.method4236(local64 * (float) local177 + local160);
						this.aClass5_Sub3_Sub2_1.method4236(local68 * (float) local177 + local166);
						this.aClass5_Sub3_Sub2_1.method4236((float) local177 * local72 + local172);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
						this.aClass5_Sub3_Sub2_1.method4236(1.0F);
						this.aClass5_Sub3_Sub2_1.method4236(1.0F);
						this.aClass5_Sub3_Sub2_1.method4236(local51 * (float) local177 + local160);
						this.aClass5_Sub3_Sub2_1.method4236((float) local177 * local55 + local166);
						this.aClass5_Sub3_Sub2_1.method4236((float) local177 * local59 + local172);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
						this.aClass5_Sub3_Sub2_1.method4236(0.0F);
						this.aClass5_Sub3_Sub2_1.method4236(1.0F);
						this.aClass5_Sub3_Sub2_1.method4236(local160 + (float) local177 * local77);
						this.aClass5_Sub3_Sub2_1.method4236((float) local177 * local82 + local166);
						this.aClass5_Sub3_Sub2_1.method4236(local172 + local91 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
					}
					if (this.anIntArray256[local98] > 64) {
						local441 = this.anIntArray256[local98] - 64 - 1;
						for (local136 = this.anIntArray257[local441] - 1; local136 >= 0; local136--) {
							local457 = this.aClass30_Sub2_Sub1ArrayArray4[local441][local136];
							local460 = local457.anInt2962;
							local149 = (byte) (local460 >> 16);
							local154 = (byte) (local460 >> 8);
							local473 = (byte) local460;
							local478 = (byte) (local460 >>> 24);
							local172 = local457.anInt2966 >> 12;
							local490 = local457.anInt2967 >> 12;
							local496 = local457.anInt2969 >> 12;
							local501 = local457.anInt2963 >> 12;
							this.aClass5_Sub3_Sub2_1.method4236(0.0F);
							this.aClass5_Sub3_Sub2_1.method4236(0.0F);
							this.aClass5_Sub3_Sub2_1.method4236(local51 * (float) -local501 + local172);
							this.aClass5_Sub3_Sub2_1.method4236(local490 + (float) -local501 * local55);
							this.aClass5_Sub3_Sub2_1.method4236(local496 + local59 * (float) -local501);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
							this.aClass5_Sub3_Sub2_1.method4236(1.0F);
							this.aClass5_Sub3_Sub2_1.method4236(0.0F);
							this.aClass5_Sub3_Sub2_1.method4236(local172 + (float) local501 * local64);
							this.aClass5_Sub3_Sub2_1.method4236(local490 + local68 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4236(local496 + (float) local501 * local72);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
							this.aClass5_Sub3_Sub2_1.method4236(1.0F);
							this.aClass5_Sub3_Sub2_1.method4236(1.0F);
							this.aClass5_Sub3_Sub2_1.method4236((float) local501 * local51 + local172);
							this.aClass5_Sub3_Sub2_1.method4236(local490 + local55 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4236(local496 + local59 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
							this.aClass5_Sub3_Sub2_1.method4236(0.0F);
							this.aClass5_Sub3_Sub2_1.method4236(1.0F);
							this.aClass5_Sub3_Sub2_1.method4236(local172 + (float) local501 * local77);
							this.aClass5_Sub3_Sub2_1.method4236(local490 + local82 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4236(local91 * (float) local501 + local496);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray256[local98] <= 64 ? this.anIntArray256[local98] : 64;
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass30_Sub2_Sub1ArrayArray3[local98][local124];
						local136 = local133.anInt2962;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt2966 >> 12;
						local166 = local133.anInt2967 >> 12;
						local172 = local133.anInt2969 >> 12;
						local177 = local133.anInt2963 >> 12;
						this.aClass5_Sub3_Sub2_1.method4235(0.0F);
						this.aClass5_Sub3_Sub2_1.method4235(0.0F);
						this.aClass5_Sub3_Sub2_1.method4235(local160 + local51 * (float) -local177);
						this.aClass5_Sub3_Sub2_1.method4235(local166 + local55 * (float) -local177);
						this.aClass5_Sub3_Sub2_1.method4235(local59 * (float) -local177 + local172);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
						this.aClass5_Sub3_Sub2_1.method4235(1.0F);
						this.aClass5_Sub3_Sub2_1.method4235(0.0F);
						this.aClass5_Sub3_Sub2_1.method4235((float) local177 * local64 + local160);
						this.aClass5_Sub3_Sub2_1.method4235(local166 + local68 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4235(local172 + local72 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
						this.aClass5_Sub3_Sub2_1.method4235(1.0F);
						this.aClass5_Sub3_Sub2_1.method4235(1.0F);
						this.aClass5_Sub3_Sub2_1.method4235(local160 + local51 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4235((float) local177 * local55 + local166);
						this.aClass5_Sub3_Sub2_1.method4235(local172 + local59 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
						this.aClass5_Sub3_Sub2_1.method4235(0.0F);
						this.aClass5_Sub3_Sub2_1.method4235(1.0F);
						this.aClass5_Sub3_Sub2_1.method4235(local160 + local77 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4235(local166 + local82 * (float) local177);
						this.aClass5_Sub3_Sub2_1.method4235((float) local177 * local91 + local172);
						this.aClass5_Sub3_Sub2_1.method4192(local141);
						this.aClass5_Sub3_Sub2_1.method4192(local146);
						this.aClass5_Sub3_Sub2_1.method4192(local149);
						this.aClass5_Sub3_Sub2_1.method4192(local154);
					}
					if (this.anIntArray256[local98] > 64) {
						local441 = this.anIntArray256[local98] - 64 - 1;
						for (local136 = this.anIntArray257[local441] - 1; local136 >= 0; local136--) {
							local457 = this.aClass30_Sub2_Sub1ArrayArray4[local441][local136];
							local460 = local457.anInt2962;
							local149 = (byte) (local460 >> 16);
							local154 = (byte) (local460 >> 8);
							local473 = (byte) local460;
							local478 = (byte) (local460 >>> 24);
							local172 = local457.anInt2966 >> 12;
							local490 = local457.anInt2967 >> 12;
							local496 = local457.anInt2969 >> 12;
							local501 = local457.anInt2963 >> 12;
							this.aClass5_Sub3_Sub2_1.method4235(0.0F);
							this.aClass5_Sub3_Sub2_1.method4235(0.0F);
							this.aClass5_Sub3_Sub2_1.method4235((float) -local501 * local51 + local172);
							this.aClass5_Sub3_Sub2_1.method4235(local490 + local55 * (float) -local501);
							this.aClass5_Sub3_Sub2_1.method4235(local59 * (float) -local501 + local496);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
							this.aClass5_Sub3_Sub2_1.method4235(1.0F);
							this.aClass5_Sub3_Sub2_1.method4235(0.0F);
							this.aClass5_Sub3_Sub2_1.method4235(local172 + local64 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4235(local490 + (float) local501 * local68);
							this.aClass5_Sub3_Sub2_1.method4235(local496 + (float) local501 * local72);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
							this.aClass5_Sub3_Sub2_1.method4235(1.0F);
							this.aClass5_Sub3_Sub2_1.method4235(1.0F);
							this.aClass5_Sub3_Sub2_1.method4235(local51 * (float) local501 + local172);
							this.aClass5_Sub3_Sub2_1.method4235((float) local501 * local55 + local490);
							this.aClass5_Sub3_Sub2_1.method4235((float) local501 * local59 + local496);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
							this.aClass5_Sub3_Sub2_1.method4235(0.0F);
							this.aClass5_Sub3_Sub2_1.method4235(1.0F);
							this.aClass5_Sub3_Sub2_1.method4235(local172 + local77 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4235(local490 + (float) local501 * local82);
							this.aClass5_Sub3_Sub2_1.method4235(local496 + local91 * (float) local501);
							this.aClass5_Sub3_Sub2_1.method4192(local149);
							this.aClass5_Sub3_Sub2_1.method4192(local154);
							this.aClass5_Sub3_Sub2_1.method4192(local473);
							this.aClass5_Sub3_Sub2_1.method4192(local478);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub3_Sub2_1.anInt4960 != 0) {
			this.anInterface11_2.method5918(24, this.aClass5_Sub3_Sub2_1.aByteArray66, this.aClass5_Sub3_Sub2_1.anInt4960);
			arg1.method4000(this.aClass19_3, null, this.aClass19_1, this.aClass19_2);
			arg1.method3957(this.aClass5_Sub3_Sub2_1.anInt4960 / 24);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Lclient!jj;I)V")
	private void method3058(@OriginalArg(0) Class62_Sub3 arg0) {
		Static454.aFloat329 = arg0.aFloat191;
		arg0.method3967();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method3989(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!jj;)V")
	public void method3059(@OriginalArg(1) Class62_Sub3 arg0) {
		this.anInterface11_2 = arg0.method3964(null, true, 24, 196584);
		this.aClass19_3 = new Class19(this.anInterface11_2, 5126, 2, 0);
		this.aClass19_2 = new Class19(this.anInterface11_2, 5126, 3, 8);
		this.aClass19_1 = new Class19(this.anInterface11_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!sh;ILclient!jj;)V")
	public void method3061(@OriginalArg(0) Class267 arg0, @OriginalArg(2) Class62_Sub3 arg1) {
		if (arg1.aClass78_Sub3_4 == null) {
			return;
		}
		this.method3058(arg1);
		@Pc(17) float local17 = arg1.aClass78_Sub3_4.aFloat288;
		@Pc(21) float local21 = arg1.aClass78_Sub3_4.aFloat289;
		@Pc(32) float local32 = arg1.aClass78_Sub3_4.aFloat287;
		@Pc(36) float local36 = arg1.aClass78_Sub3_4.aFloat284;
		try {
			@Pc(45) int local45;
			@Pc(61) int local61;
			@Pc(79) Class30_Sub2 local79;
			@Pc(92) int local92;
			@Pc(240) Class30_Sub2_Sub1[] local240;
			@Pc(186) int local186;
			@Pc(250) int local250;
			@Pc(252) int local252;
			if (arg0.aBoolean555) {
				local45 = arg0.anInt7822 - arg0.anInt7821;
				if (local45 + 2 > 1600) {
					local61 = Static344.method5361(local45) + 1 - this.anInt3474;
					local45 = (local45 >> local61) + 2;
				} else {
					local61 = 0;
					local45 += 2;
				}
				@Pc(76) Class30_Sub2 local76 = arg0.aClass161_1.aClass30_Sub2_7;
				local79 = local76.aClass30_Sub2_9;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local79 != local76) {
					this.anInt3475 = 0;
					for (local92 = 0; local92 < local45; local92++) {
						this.anIntArray256[local92] = 0;
					}
					for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
						this.anIntArray257[local109] = 0;
					}
					while (local79 != local76) {
						@Pc(125) Class30_Sub2_Sub1 local125 = (Class30_Sub2_Sub1) local79;
						if (local85) {
							local85 = false;
							local83 = local125.aBoolean197;
							local81 = local125.anInt2968;
						} else if (local81 != local125.anInt2968 || local83 != local125.aBoolean197) {
							local85 = true;
							break;
						}
						local186 = (int) (local36 + (float) (local125.anInt2966 >> 12) * local17 + local21 * (float) (local125.anInt2967 >> 12) + local32 * (float) (local125.anInt2969 >> 12)) - arg0.anInt7821 >> local61;
						if (local186 < 1600) {
							if (this.anIntArray256[local186] >= 64) {
								label191: {
									if (this.anIntArray256[local186] == 64) {
										if (this.anInt3475 == 64) {
											break label191;
										}
										this.anIntArray256[local186] += this.anInt3475++ + 1;
									}
									local240 = this.aClass30_Sub2_Sub1ArrayArray4[this.anIntArray256[local186] - 64 - 1];
									local250 = this.anIntArray256[local186] - 64 - 1;
									local252 = this.anIntArray257[this.anIntArray256[local186] - 64 - 1];
									this.anIntArray257[local250] = this.anIntArray257[this.anIntArray256[local186] - 64 - 1] + 1;
									local240[local252] = local125;
								}
							} else {
								this.aClass30_Sub2_Sub1ArrayArray3[local186][this.anIntArray256[local186]++] = local125;
							}
						}
						local79 = local79.aClass30_Sub2_9;
					}
					if (local81 >= 0) {
						arg1.method3933(local81);
					} else {
						arg1.method3933(-1);
					}
					if (local83 && Static454.aFloat329 != arg1.aFloat191) {
						arg1.M(Static454.aFloat329);
					} else if (arg1.aFloat191 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method3057(local45, arg1);
				}
			} else {
				local45 = 0;
				local61 = Integer.MAX_VALUE;
				@Pc(332) int local332 = 0;
				local79 = arg0.aClass161_1.aClass30_Sub2_7;
				@Pc(339) Class30_Sub2 local339;
				@Pc(371) int local371;
				for (local339 = local79.aClass30_Sub2_9; local339 != local79; local339 = local339.aClass30_Sub2_9) {
					@Pc(344) Class30_Sub2_Sub1 local344 = (Class30_Sub2_Sub1) local339;
					local371 = (int) ((float) (local344.anInt2969 >> 12) * local32 + local17 * (float) (local344.anInt2966 >> 12) + (float) (local344.anInt2967 >> 12) * local21 + local36);
					if (local371 < local61) {
						local61 = local371;
					}
					this.anIntArray258[local45++] = local371;
					if (local371 > local332) {
						local332 = local371;
					}
				}
				@Pc(398) int local398 = local332 - local61;
				if (local398 + 2 > 1600) {
					local371 = Static344.method5361(local398) + 1 - this.anInt3474;
					local398 = (local398 >> local371) + 2;
				} else {
					local398 += 2;
					local371 = 0;
				}
				local45 = 0;
				local339 = local79.aClass30_Sub2_9;
				local92 = -2;
				@Pc(435) boolean local435 = true;
				@Pc(437) boolean local437 = true;
				while (local79 != local339) {
					this.anInt3475 = 0;
					for (local186 = 0; local186 < local398; local186++) {
						this.anIntArray256[local186] = 0;
					}
					for (@Pc(457) int local457 = 0; local457 < 64; local457++) {
						this.anIntArray257[local457] = 0;
					}
					while (local79 != local339) {
						@Pc(473) Class30_Sub2_Sub1 local473 = (Class30_Sub2_Sub1) local339;
						if (local437) {
							local437 = false;
							local92 = local473.anInt2968;
							local435 = local473.aBoolean197;
						}
						if (local45 > 0 && (local92 != local473.anInt2968 || local473.aBoolean197 != local435)) {
							local437 = true;
							break;
						}
						@Pc(523) int local523 = this.anIntArray258[local45++] - local61 >> local371;
						if (local523 < 1600) {
							if (this.anIntArray256[local523] < 64) {
								this.aClass30_Sub2_Sub1ArrayArray3[local523][this.anIntArray256[local523]++] = local473;
							} else {
								label142: {
									if (this.anIntArray256[local523] == 64) {
										if (this.anInt3475 == 64) {
											break label142;
										}
										this.anIntArray256[local523] += this.anInt3475++ + 1;
									}
									local240 = this.aClass30_Sub2_Sub1ArrayArray4[this.anIntArray256[local523] - 64 - 1];
									local250 = this.anIntArray256[local523] - 1 - 64;
									local252 = this.anIntArray257[this.anIntArray256[local523] - 1 - 64];
									this.anIntArray257[local250] = this.anIntArray257[this.anIntArray256[local523] - 1 - 64] + 1;
									local240[local252] = local473;
								}
							}
						}
						local339 = local339.aClass30_Sub2_9;
					}
					if (local92 < 0) {
						arg1.method3933(-1);
					} else {
						arg1.method3933(local92);
					}
					if (local435 && Static454.aFloat329 != arg1.aFloat191) {
						arg1.M(Static454.aFloat329);
					} else if (arg1.aFloat191 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method3057(local398, arg1);
				}
			}
		} catch (@Pc(662) Exception local662) {
		}
		this.method3056(arg1);
	}
}
