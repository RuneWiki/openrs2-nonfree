import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class239 {

	@OriginalMember(owner = "client!nv", name = "k", descriptor = "Lclient!dda;")
	private Class66 aClass66_8;

	@OriginalMember(owner = "client!nv", name = "m", descriptor = "Lclient!tda;")
	private Interface23 anInterface23_4;

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "Lclient!dda;")
	private Class66 aClass66_9;

	@OriginalMember(owner = "client!nv", name = "q", descriptor = "Lclient!dda;")
	private Class66 aClass66_10;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "[F")
	private final float[] aFloatArray56 = new float[16];

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Lclient!mea;")
	private final Class2_Sub34_Sub1 aClass2_Sub34_Sub1_2 = new Class2_Sub34_Sub1(786336);

	@OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
	private final int anInt7005 = Static420.method6395(1600);

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "[I")
	private final int[] anIntArray470 = new int[8191];

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
	private int anInt7007 = 0;

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "[I")
	private final int[] anIntArray471 = new int[64];

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "[[Lclient!fa;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray4 = new Class11_Sub5_Sub1[1600][64];

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "[I")
	private final int[] anIntArray472 = new int[1600];

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "[[Lclient!fa;")
	private final Class11_Sub5_Sub1[][] aClass11_Sub5_Sub1ArrayArray3 = new Class11_Sub5_Sub1[64][768];

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!oea;)V")
	public void method5849(@OriginalArg(1) Class87_Sub2 arg0) {
		this.anInterface23_4 = arg0.method6160(true, null, 24, 196584);
		this.aClass66_9 = new Class66(this.anInterface23_4, 5126, 2, 0);
		this.aClass66_10 = new Class66(this.anInterface23_4, 5126, 3, 8);
		this.aClass66_8 = new Class66(this.anInterface23_4, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Lclient!oea;ILclient!oo;I)V")
	public void method5850(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class247 arg2) {
		if (arg0.aClass6_Sub1_3 == null) {
			return;
		}
		if (arg1 < 0) {
			this.method5852(arg0);
		} else {
			this.method5856(arg1, arg0);
		}
		@Pc(25) float local25 = arg0.aClass6_Sub1_3.aFloat3;
		@Pc(29) float local29 = arg0.aClass6_Sub1_3.aFloat6;
		@Pc(33) float local33 = arg0.aClass6_Sub1_3.aFloat2;
		@Pc(37) float local37 = arg0.aClass6_Sub1_3.aFloat12;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(49) int local49 = 0;
			@Pc(53) Class11_Sub5 local53 = arg2.aClass34_1.aClass11_Sub5_1;
			@Pc(56) Class11_Sub5 local56;
			@Pc(87) int local87;
			for (local56 = local53.aClass11_Sub5_10; local56 != local53; local56 = local56.aClass11_Sub5_10) {
				@Pc(60) Class11_Sub5_Sub1 local60 = (Class11_Sub5_Sub1) local56;
				local87 = (int) (local29 * (float) (local60.anInt4041 >> 12) + (float) (local60.anInt4043 >> 12) * local25 + (float) (local60.anInt4044 >> 12) * local33 + local37);
				if (local87 > local49) {
					local49 = local87;
				}
				this.anIntArray470[local45++] = local87;
				if (local87 < local47) {
					local47 = local87;
				}
			}
			@Pc(122) int local122 = local49 - local47;
			if (local122 + 2 > 1600) {
				local87 = Static420.method6395(local122) + 1 - this.anInt7005;
				local122 = (local122 >> local87) + 2;
			} else {
				local87 = 0;
				local122 += 2;
			}
			local45 = 0;
			local56 = local53.aClass11_Sub5_10;
			@Pc(156) int local156 = -2;
			@Pc(158) boolean local158 = true;
			@Pc(160) boolean local160 = true;
			while (local53 != local56) {
				this.anInt7007 = 0;
				for (@Pc(166) int local166 = 0; local166 < local122; local166++) {
					this.anIntArray472[local166] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray471[local178] = 0;
				}
				while (local56 != local53) {
					@Pc(194) Class11_Sub5_Sub1 local194 = (Class11_Sub5_Sub1) local56;
					if (local160) {
						local160 = false;
						local158 = local194.aBoolean339;
						local156 = local194.anInt4046;
					}
					if (local45 > 0 && (local194.anInt4046 != local156 || local194.aBoolean339 != local158)) {
						local160 = true;
						break;
					}
					@Pc(231) int local231 = this.anIntArray470[local45++] - local47 >> local87;
					if (local231 < 1600) {
						if (this.anIntArray472[local231] < 64) {
							this.aClass11_Sub5_Sub1ArrayArray4[local231][this.anIntArray472[local231]++] = local194;
						} else {
							label101: {
								if (this.anIntArray472[local231] == 64) {
									if (this.anInt7007 == 64) {
										break label101;
									}
									this.anIntArray472[local231] += this.anInt7007++ + 1;
								}
								this.aClass11_Sub5_Sub1ArrayArray3[this.anIntArray472[local231] - 65][this.anIntArray471[this.anIntArray472[local231] - 64 - 1]++] = local194;
							}
						}
					}
					local56 = local56.aClass11_Sub5_10;
				}
				if (local156 < 0) {
					arg0.method6228(-1);
				} else {
					arg0.method6228(local156);
				}
				if (local158 && Static355.aFloat155 != arg0.aFloat174) {
					arg0.xa(Static355.aFloat155);
				} else if (arg0.aFloat174 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method5855(arg0, local122);
			}
		} catch (@Pc(364) Exception local364) {
		}
		this.method5851(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(ILclient!oea;)V")
	private void method5851(@OriginalArg(1) Class87_Sub2 arg0) {
		arg0.method6225(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static355.aFloat155 != arg0.aFloat174) {
			arg0.xa(Static355.aFloat155);
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(ILclient!oea;)V")
	private void method5852(@OriginalArg(1) Class87_Sub2 arg0) {
		Static355.aFloat155 = arg0.aFloat174;
		arg0.method6146();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method6225(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILclient!oea;I)V")
	private void method5855(@OriginalArg(1) Class87_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray56, 0);
		@Pc(13) float local13 = this.aFloatArray56[0];
		@Pc(18) float local18 = this.aFloatArray56[4];
		@Pc(23) float local23 = this.aFloatArray56[8];
		@Pc(28) float local28 = this.aFloatArray56[1];
		@Pc(33) float local33 = this.aFloatArray56[5];
		@Pc(38) float local38 = this.aFloatArray56[9];
		@Pc(46) float local46 = local28 + local13;
		@Pc(50) float local50 = local33 + local18;
		@Pc(54) float local54 = local38 + local23;
		@Pc(59) float local59 = local13 - local28;
		@Pc(63) float local63 = local18 - local33;
		@Pc(67) float local67 = local23 - local38;
		@Pc(72) float local72 = local28 - local13;
		@Pc(77) float local77 = local33 - local18;
		@Pc(81) float local81 = local38 - local23;
		this.aClass2_Sub34_Sub1_2.anInt8188 = 0;
		@Pc(92) int local92;
		@Pc(106) int local106;
		@Pc(112) int local112;
		@Pc(120) Class11_Sub5_Sub1 local120;
		@Pc(123) int local123;
		@Pc(128) byte local128;
		@Pc(133) byte local133;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(147) float local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(164) int local164;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(438) int local438;
		@Pc(453) Class11_Sub5_Sub1 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg0.aBoolean559) {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local106 = this.anIntArray472[local92] <= 64 ? this.anIntArray472[local92] : 64;
				if (local106 > 0) {
					for (local112 = local106 - 1; local112 >= 0; local112--) {
						local120 = this.aClass11_Sub5_Sub1ArrayArray4[local92][local112];
						local123 = local120.anInt4045;
						local128 = (byte) (local123 >> 16);
						local133 = (byte) (local123 >> 8);
						local136 = (byte) local123;
						local141 = (byte) (local123 >>> 24);
						local147 = local120.anInt4043 >> 12;
						local153 = local120.anInt4041 >> 12;
						local159 = local120.anInt4044 >> 12;
						local164 = local120.anInt4047 >> 12;
						this.aClass2_Sub34_Sub1_2.method5393(0.0F);
						this.aClass2_Sub34_Sub1_2.method5393(0.0F);
						this.aClass2_Sub34_Sub1_2.method5393(local147 + (float) -local164 * local46);
						this.aClass2_Sub34_Sub1_2.method5393((float) -local164 * local50 + local153);
						this.aClass2_Sub34_Sub1_2.method5393((float) -local164 * local54 + local159);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
						this.aClass2_Sub34_Sub1_2.method5393(1.0F);
						this.aClass2_Sub34_Sub1_2.method5393(0.0F);
						this.aClass2_Sub34_Sub1_2.method5393((float) local164 * local59 + local147);
						this.aClass2_Sub34_Sub1_2.method5393(local63 * (float) local164 + local153);
						this.aClass2_Sub34_Sub1_2.method5393(local67 * (float) local164 + local159);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
						this.aClass2_Sub34_Sub1_2.method5393(1.0F);
						this.aClass2_Sub34_Sub1_2.method5393(1.0F);
						this.aClass2_Sub34_Sub1_2.method5393(local147 + local46 * (float) local164);
						this.aClass2_Sub34_Sub1_2.method5393((float) local164 * local50 + local153);
						this.aClass2_Sub34_Sub1_2.method5393(local159 + local54 * (float) local164);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
						this.aClass2_Sub34_Sub1_2.method5393(0.0F);
						this.aClass2_Sub34_Sub1_2.method5393(1.0F);
						this.aClass2_Sub34_Sub1_2.method5393(local147 + local72 * (float) local164);
						this.aClass2_Sub34_Sub1_2.method5393(local153 + (float) local164 * local77);
						this.aClass2_Sub34_Sub1_2.method5393(local159 + (float) local164 * local81);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
					}
					if (this.anIntArray472[local92] > 64) {
						local438 = this.anIntArray472[local92] - 64 - 1;
						for (local123 = this.anIntArray471[local438] - 1; local123 >= 0; local123--) {
							local453 = this.aClass11_Sub5_Sub1ArrayArray3[local438][local123];
							local456 = local453.anInt4045;
							local136 = (byte) (local456 >> 16);
							local141 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local159 = local453.anInt4043 >> 12;
							local486 = local453.anInt4041 >> 12;
							local492 = local453.anInt4044 >> 12;
							local497 = local453.anInt4047 >> 12;
							this.aClass2_Sub34_Sub1_2.method5393(0.0F);
							this.aClass2_Sub34_Sub1_2.method5393(0.0F);
							this.aClass2_Sub34_Sub1_2.method5393(local159 + (float) -local497 * local46);
							this.aClass2_Sub34_Sub1_2.method5393(local486 + local50 * (float) -local497);
							this.aClass2_Sub34_Sub1_2.method5393((float) -local497 * local54 + local492);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
							this.aClass2_Sub34_Sub1_2.method5393(1.0F);
							this.aClass2_Sub34_Sub1_2.method5393(0.0F);
							this.aClass2_Sub34_Sub1_2.method5393(local59 * (float) local497 + local159);
							this.aClass2_Sub34_Sub1_2.method5393(local486 + (float) local497 * local63);
							this.aClass2_Sub34_Sub1_2.method5393((float) local497 * local67 + local492);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
							this.aClass2_Sub34_Sub1_2.method5393(1.0F);
							this.aClass2_Sub34_Sub1_2.method5393(1.0F);
							this.aClass2_Sub34_Sub1_2.method5393(local46 * (float) local497 + local159);
							this.aClass2_Sub34_Sub1_2.method5393(local486 + local50 * (float) local497);
							this.aClass2_Sub34_Sub1_2.method5393(local492 + (float) local497 * local54);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
							this.aClass2_Sub34_Sub1_2.method5393(0.0F);
							this.aClass2_Sub34_Sub1_2.method5393(1.0F);
							this.aClass2_Sub34_Sub1_2.method5393(local159 + local72 * (float) local497);
							this.aClass2_Sub34_Sub1_2.method5393((float) local497 * local77 + local486);
							this.aClass2_Sub34_Sub1_2.method5393(local492 + (float) local497 * local81);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
						}
					}
				}
			}
		} else {
			for (local92 = arg1 - 1; local92 >= 0; local92--) {
				local106 = this.anIntArray472[local92] > 64 ? 64 : this.anIntArray472[local92];
				if (local106 > 0) {
					for (local112 = local106 - 1; local112 >= 0; local112--) {
						local120 = this.aClass11_Sub5_Sub1ArrayArray4[local92][local112];
						local123 = local120.anInt4045;
						local128 = (byte) (local123 >> 16);
						local133 = (byte) (local123 >> 8);
						local136 = (byte) local123;
						local141 = (byte) (local123 >>> 24);
						local147 = local120.anInt4043 >> 12;
						local153 = local120.anInt4041 >> 12;
						local159 = local120.anInt4044 >> 12;
						local164 = local120.anInt4047 >> 12;
						this.aClass2_Sub34_Sub1_2.method5392(0.0F);
						this.aClass2_Sub34_Sub1_2.method5392(0.0F);
						this.aClass2_Sub34_Sub1_2.method5392((float) -local164 * local46 + local147);
						this.aClass2_Sub34_Sub1_2.method5392((float) -local164 * local50 + local153);
						this.aClass2_Sub34_Sub1_2.method5392(local159 + local54 * (float) -local164);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
						this.aClass2_Sub34_Sub1_2.method5392(1.0F);
						this.aClass2_Sub34_Sub1_2.method5392(0.0F);
						this.aClass2_Sub34_Sub1_2.method5392(local147 + (float) local164 * local59);
						this.aClass2_Sub34_Sub1_2.method5392(local63 * (float) local164 + local153);
						this.aClass2_Sub34_Sub1_2.method5392((float) local164 * local67 + local159);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
						this.aClass2_Sub34_Sub1_2.method5392(1.0F);
						this.aClass2_Sub34_Sub1_2.method5392(1.0F);
						this.aClass2_Sub34_Sub1_2.method5392(local147 + (float) local164 * local46);
						this.aClass2_Sub34_Sub1_2.method5392(local50 * (float) local164 + local153);
						this.aClass2_Sub34_Sub1_2.method5392((float) local164 * local54 + local159);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
						this.aClass2_Sub34_Sub1_2.method5392(0.0F);
						this.aClass2_Sub34_Sub1_2.method5392(1.0F);
						this.aClass2_Sub34_Sub1_2.method5392(local72 * (float) local164 + local147);
						this.aClass2_Sub34_Sub1_2.method5392(local153 + (float) local164 * local77);
						this.aClass2_Sub34_Sub1_2.method5392(local159 + (float) local164 * local81);
						this.aClass2_Sub34_Sub1_2.method6894(local128);
						this.aClass2_Sub34_Sub1_2.method6894(local133);
						this.aClass2_Sub34_Sub1_2.method6894(local136);
						this.aClass2_Sub34_Sub1_2.method6894(local141);
					}
					if (this.anIntArray472[local92] > 64) {
						local438 = this.anIntArray472[local92] - 65;
						for (local123 = this.anIntArray471[local438] - 1; local123 >= 0; local123--) {
							local453 = this.aClass11_Sub5_Sub1ArrayArray3[local438][local123];
							local456 = local453.anInt4045;
							local136 = (byte) (local456 >> 16);
							local141 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local159 = local453.anInt4043 >> 12;
							local486 = local453.anInt4041 >> 12;
							local492 = local453.anInt4044 >> 12;
							local497 = local453.anInt4047 >> 12;
							this.aClass2_Sub34_Sub1_2.method5392(0.0F);
							this.aClass2_Sub34_Sub1_2.method5392(0.0F);
							this.aClass2_Sub34_Sub1_2.method5392(local159 + local46 * (float) -local497);
							this.aClass2_Sub34_Sub1_2.method5392(local486 + local50 * (float) -local497);
							this.aClass2_Sub34_Sub1_2.method5392(local54 * (float) -local497 + local492);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
							this.aClass2_Sub34_Sub1_2.method5392(1.0F);
							this.aClass2_Sub34_Sub1_2.method5392(0.0F);
							this.aClass2_Sub34_Sub1_2.method5392(local159 + local59 * (float) local497);
							this.aClass2_Sub34_Sub1_2.method5392(local63 * (float) local497 + local486);
							this.aClass2_Sub34_Sub1_2.method5392(local492 + local67 * (float) local497);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
							this.aClass2_Sub34_Sub1_2.method5392(1.0F);
							this.aClass2_Sub34_Sub1_2.method5392(1.0F);
							this.aClass2_Sub34_Sub1_2.method5392(local159 + (float) local497 * local46);
							this.aClass2_Sub34_Sub1_2.method5392(local486 + local50 * (float) local497);
							this.aClass2_Sub34_Sub1_2.method5392(local54 * (float) local497 + local492);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
							this.aClass2_Sub34_Sub1_2.method5392(0.0F);
							this.aClass2_Sub34_Sub1_2.method5392(1.0F);
							this.aClass2_Sub34_Sub1_2.method5392(local159 + (float) local497 * local72);
							this.aClass2_Sub34_Sub1_2.method5392(local77 * (float) local497 + local486);
							this.aClass2_Sub34_Sub1_2.method5392(local492 + local81 * (float) local497);
							this.aClass2_Sub34_Sub1_2.method6894(local136);
							this.aClass2_Sub34_Sub1_2.method6894(local141);
							this.aClass2_Sub34_Sub1_2.method6894(local469);
							this.aClass2_Sub34_Sub1_2.method6894(local474);
						}
					}
				}
			}
		}
		if (this.aClass2_Sub34_Sub1_2.anInt8188 != 0) {
			this.anInterface23_4.method5652(24, this.aClass2_Sub34_Sub1_2.anInt8188, this.aClass2_Sub34_Sub1_2.aByteArray77);
			arg0.method6151(this.aClass66_10, null, this.aClass66_8, this.aClass66_9);
			arg0.method6212(this.aClass2_Sub34_Sub1_2.anInt8188 / 24);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBLclient!oea;)V")
	private void method5856(@OriginalArg(0) int arg0, @OriginalArg(2) Class87_Sub2 arg1) {
		Static355.aFloat155 = arg1.aFloat174;
		arg1.method6166((float) arg0);
		arg1.method6169();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method6225(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
