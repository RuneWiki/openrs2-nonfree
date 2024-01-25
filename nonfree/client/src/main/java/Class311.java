import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rga")
public final class Class311 {

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "Lclient!ku;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!rga", name = "p", descriptor = "Lclient!vm;")
	private Class380 aClass380_13;

	@OriginalMember(owner = "client!rga", name = "t", descriptor = "Lclient!vm;")
	private Class380 aClass380_14;

	@OriginalMember(owner = "client!rga", name = "j", descriptor = "Lclient!vm;")
	private Class380 aClass380_15;

	@OriginalMember(owner = "client!rga", name = "m", descriptor = "[F")
	private final float[] aFloatArray70 = new float[16];

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "Lclient!pr;")
	private final Class14_Sub21_Sub1 aClass14_Sub21_Sub1_3 = new Class14_Sub21_Sub1(786336);

	@OriginalMember(owner = "client!rga", name = "k", descriptor = "I")
	private final int anInt9053 = Static220.method3803(1600);

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "I")
	private int anInt9054 = 0;

	@OriginalMember(owner = "client!rga", name = "r", descriptor = "[I")
	private final int[] anIntArray466 = new int[64];

	@OriginalMember(owner = "client!rga", name = "n", descriptor = "[[Lclient!lka;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray3 = new Class4_Sub4_Sub1[64][768];

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "[I")
	private final int[] anIntArray467 = new int[8191];

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "[I")
	private final int[] anIntArray468 = new int[1600];

	@OriginalMember(owner = "client!rga", name = "g", descriptor = "[[Lclient!lka;")
	private final Class4_Sub4_Sub1[][] aClass4_Sub4_Sub1ArrayArray4 = new Class4_Sub4_Sub1[1600][64];

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IILclient!qv;Lclient!pi;)V")
	public void method7808(@OriginalArg(1) int arg0, @OriginalArg(2) Class304 arg1, @OriginalArg(3) Class144_Sub3 arg2) {
		if (arg2.aClass263_Sub1_3 == null) {
			return;
		}
		if (arg0 >= 0) {
			this.method7813(arg2, arg0);
		} else {
			this.method7812(arg2);
		}
		@Pc(33) float local33 = arg2.aClass263_Sub1_3.aFloat123;
		@Pc(37) float local37 = arg2.aClass263_Sub1_3.aFloat125;
		@Pc(41) float local41 = arg2.aClass263_Sub1_3.aFloat124;
		@Pc(52) float local52 = arg2.aClass263_Sub1_3.aFloat127;
		try {
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = Integer.MAX_VALUE;
			@Pc(58) int local58 = 0;
			@Pc(62) Class4_Sub4 local62 = arg1.aClass324_1.aClass4_Sub4_7;
			@Pc(65) Class4_Sub4 local65;
			@Pc(97) int local97;
			for (local65 = local62.aClass4_Sub4_9; local65 != local62; local65 = local65.aClass4_Sub4_9) {
				@Pc(70) Class4_Sub4_Sub1 local70 = (Class4_Sub4_Sub1) local65;
				local97 = (int) (local41 * (float) (local70.anInt9662 >> 12) + local33 * (float) (local70.anInt9663 >> 12) + local37 * (float) (local70.anInt9665 >> 12) + local52);
				if (local56 > local97) {
					local56 = local97;
				}
				if (local58 < local97) {
					local58 = local97;
				}
				this.anIntArray467[local54++] = local97;
			}
			@Pc(124) int local124 = local58 - local56;
			if (local124 + 2 > 1600) {
				local97 = Static220.method3803(local124) + 1 - this.anInt9053;
				local124 = (local124 >> local97) + 2;
			} else {
				local97 = 0;
				local124 += 2;
			}
			local65 = local62.aClass4_Sub4_9;
			local54 = 0;
			@Pc(158) int local158 = -2;
			@Pc(160) boolean local160 = true;
			@Pc(162) boolean local162 = true;
			while (local65 != local62) {
				this.anInt9054 = 0;
				for (@Pc(171) int local171 = 0; local171 < local124; local171++) {
					this.anIntArray468[local171] = 0;
				}
				for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
					this.anIntArray466[local186] = 0;
				}
				while (local65 != local62) {
					@Pc(210) Class4_Sub4_Sub1 local210 = (Class4_Sub4_Sub1) local65;
					if (local162) {
						local158 = local210.anInt9660;
						local160 = local210.aBoolean666;
						local162 = false;
					}
					if (local54 > 0 && (local210.anInt9660 != local158 || local210.aBoolean666 != local160)) {
						local162 = true;
						break;
					}
					@Pc(252) int local252 = this.anIntArray467[local54++] - local56 >> local97;
					if (local252 < 1600) {
						if (this.anIntArray468[local252] >= 64) {
							label96: {
								if (this.anIntArray468[local252] == 64) {
									if (this.anInt9054 == 64) {
										break label96;
									}
									this.anIntArray468[local252] += this.anInt9054++ + 1;
								}
								this.aClass4_Sub4_Sub1ArrayArray3[this.anIntArray468[local252] - 64 - 1][this.anIntArray466[this.anIntArray468[local252] - 1 - 64]++] = local210;
							}
						} else {
							this.aClass4_Sub4_Sub1ArrayArray4[local252][this.anIntArray468[local252]++] = local210;
						}
					}
					local65 = local65.aClass4_Sub4_9;
				}
				if (local158 < 0) {
					arg2.method7053(-1);
				} else {
					arg2.method7053(local158);
				}
				if (local160 && Static603.aFloat204 != arg2.lb) {
					arg2.xa(Static603.aFloat204);
				} else if (arg2.lb != 1.0F) {
					arg2.xa(1.0F);
				}
				this.method7809(local124, arg2);
			}
		} catch (@Pc(415) Exception local415) {
		}
		this.method7815(arg2);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILclient!pi;I)V")
	private void method7809(@OriginalArg(0) int arg0, @OriginalArg(1) Class144_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray70, 0);
		@Pc(15) float local15 = this.aFloatArray70[0];
		@Pc(20) float local20 = this.aFloatArray70[4];
		@Pc(25) float local25 = this.aFloatArray70[8];
		@Pc(30) float local30 = this.aFloatArray70[1];
		@Pc(35) float local35 = this.aFloatArray70[5];
		@Pc(40) float local40 = this.aFloatArray70[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(60) float local60 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(70) float local70 = local30 - local15;
		@Pc(75) float local75 = local35 - local20;
		this.aClass14_Sub21_Sub1_3.anInt8936 = 0;
		@Pc(83) float local83 = local40 - local25;
		@Pc(90) int local90;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(130) Class4_Sub4_Sub1 local130;
		@Pc(133) int local133;
		@Pc(138) byte local138;
		@Pc(143) byte local143;
		@Pc(146) byte local146;
		@Pc(151) byte local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(169) float local169;
		@Pc(174) int local174;
		@Pc(515) float local515;
		@Pc(520) int local520;
		@Pc(460) int local460;
		@Pc(476) Class4_Sub4_Sub1 local476;
		@Pc(479) int local479;
		@Pc(492) byte local492;
		@Pc(497) byte local497;
		@Pc(509) float local509;
		if (arg1.aBoolean557) {
			for (local90 = arg0 - 1; local90 >= 0; local90--) {
				local110 = this.anIntArray468[local90] <= 64 ? this.anIntArray468[local90] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local130 = this.aClass4_Sub4_Sub1ArrayArray4[local90][local119];
						local133 = local130.anInt9661;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = (float) (local130.anInt9663 >> 12);
						local163 = (float) (local130.anInt9665 >> 12);
						local169 = (float) (local130.anInt9662 >> 12);
						local174 = local130.anInt9664 >> 12;
						this.aClass14_Sub21_Sub1_3.method7246(0.0F);
						this.aClass14_Sub21_Sub1_3.method7246(0.0F);
						this.aClass14_Sub21_Sub1_3.method7246(local157 + (float) -local174 * local44);
						this.aClass14_Sub21_Sub1_3.method7246((float) -local174 * local48 + local163);
						this.aClass14_Sub21_Sub1_3.method7246(local169 + (float) -local174 * local52);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
						this.aClass14_Sub21_Sub1_3.method7246(1.0F);
						this.aClass14_Sub21_Sub1_3.method7246(0.0F);
						this.aClass14_Sub21_Sub1_3.method7246(local157 + local56 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7246(local163 + (float) local174 * local60);
						this.aClass14_Sub21_Sub1_3.method7246(local169 + (float) local174 * local65);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
						this.aClass14_Sub21_Sub1_3.method7246(1.0F);
						this.aClass14_Sub21_Sub1_3.method7246(1.0F);
						this.aClass14_Sub21_Sub1_3.method7246((float) local174 * local44 + local157);
						this.aClass14_Sub21_Sub1_3.method7246(local163 + local48 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7246(local169 + local52 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
						this.aClass14_Sub21_Sub1_3.method7246(0.0F);
						this.aClass14_Sub21_Sub1_3.method7246(1.0F);
						this.aClass14_Sub21_Sub1_3.method7246(local157 + local70 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7246(local75 * (float) local174 + local163);
						this.aClass14_Sub21_Sub1_3.method7246(local83 * (float) local174 + local169);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
					}
					if (this.anIntArray468[local90] > 64) {
						local460 = this.anIntArray468[local90] - 65;
						for (local133 = this.anIntArray466[local460] - 1; local133 >= 0; local133--) {
							local476 = this.aClass4_Sub4_Sub1ArrayArray3[local460][local133];
							local479 = local476.anInt9661;
							local146 = (byte) (local479 >> 16);
							local151 = (byte) (local479 >> 8);
							local492 = (byte) local479;
							local497 = (byte) (local479 >>> 24);
							local169 = (float) (local476.anInt9663 >> 12);
							local509 = (float) (local476.anInt9665 >> 12);
							local515 = (float) (local476.anInt9662 >> 12);
							local520 = local476.anInt9664 >> 12;
							this.aClass14_Sub21_Sub1_3.method7246(0.0F);
							this.aClass14_Sub21_Sub1_3.method7246(0.0F);
							this.aClass14_Sub21_Sub1_3.method7246(local44 * (float) -local520 + local169);
							this.aClass14_Sub21_Sub1_3.method7246(local509 + (float) -local520 * local48);
							this.aClass14_Sub21_Sub1_3.method7246((float) -local520 * local52 + local515);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
							this.aClass14_Sub21_Sub1_3.method7246(1.0F);
							this.aClass14_Sub21_Sub1_3.method7246(0.0F);
							this.aClass14_Sub21_Sub1_3.method7246((float) local520 * local56 + local169);
							this.aClass14_Sub21_Sub1_3.method7246(local509 + local60 * (float) local520);
							this.aClass14_Sub21_Sub1_3.method7246(local515 + (float) local520 * local65);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
							this.aClass14_Sub21_Sub1_3.method7246(1.0F);
							this.aClass14_Sub21_Sub1_3.method7246(1.0F);
							this.aClass14_Sub21_Sub1_3.method7246(local44 * (float) local520 + local169);
							this.aClass14_Sub21_Sub1_3.method7246((float) local520 * local48 + local509);
							this.aClass14_Sub21_Sub1_3.method7246(local52 * (float) local520 + local515);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
							this.aClass14_Sub21_Sub1_3.method7246(0.0F);
							this.aClass14_Sub21_Sub1_3.method7246(1.0F);
							this.aClass14_Sub21_Sub1_3.method7246(local70 * (float) local520 + local169);
							this.aClass14_Sub21_Sub1_3.method7246(local509 + local75 * (float) local520);
							this.aClass14_Sub21_Sub1_3.method7246(local515 + local83 * (float) local520);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
						}
					}
				}
			}
		} else {
			for (local90 = arg0 - 1; local90 >= 0; local90--) {
				local110 = this.anIntArray468[local90] <= 64 ? this.anIntArray468[local90] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local130 = this.aClass4_Sub4_Sub1ArrayArray4[local90][local119];
						local133 = local130.anInt9661;
						local138 = (byte) (local133 >> 16);
						local143 = (byte) (local133 >> 8);
						local146 = (byte) local133;
						local151 = (byte) (local133 >>> 24);
						local157 = (float) (local130.anInt9663 >> 12);
						local163 = (float) (local130.anInt9665 >> 12);
						local169 = (float) (local130.anInt9662 >> 12);
						local174 = local130.anInt9664 >> 12;
						this.aClass14_Sub21_Sub1_3.method7248(0.0F);
						this.aClass14_Sub21_Sub1_3.method7248(0.0F);
						this.aClass14_Sub21_Sub1_3.method7248((float) -local174 * local44 + local157);
						this.aClass14_Sub21_Sub1_3.method7248((float) -local174 * local48 + local163);
						this.aClass14_Sub21_Sub1_3.method7248(local52 * (float) -local174 + local169);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
						this.aClass14_Sub21_Sub1_3.method7248(1.0F);
						this.aClass14_Sub21_Sub1_3.method7248(0.0F);
						this.aClass14_Sub21_Sub1_3.method7248(local157 + (float) local174 * local56);
						this.aClass14_Sub21_Sub1_3.method7248((float) local174 * local60 + local163);
						this.aClass14_Sub21_Sub1_3.method7248((float) local174 * local65 + local169);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
						this.aClass14_Sub21_Sub1_3.method7248(1.0F);
						this.aClass14_Sub21_Sub1_3.method7248(1.0F);
						this.aClass14_Sub21_Sub1_3.method7248(local157 + local44 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7248(local48 * (float) local174 + local163);
						this.aClass14_Sub21_Sub1_3.method7248((float) local174 * local52 + local169);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
						this.aClass14_Sub21_Sub1_3.method7248(0.0F);
						this.aClass14_Sub21_Sub1_3.method7248(1.0F);
						this.aClass14_Sub21_Sub1_3.method7248(local157 + local70 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7248(local163 + local75 * (float) local174);
						this.aClass14_Sub21_Sub1_3.method7248(local83 * (float) local174 + local169);
						this.aClass14_Sub21_Sub1_3.method7747(local138);
						this.aClass14_Sub21_Sub1_3.method7747(local143);
						this.aClass14_Sub21_Sub1_3.method7747(local146);
						this.aClass14_Sub21_Sub1_3.method7747(local151);
					}
					if (this.anIntArray468[local90] > 64) {
						local460 = this.anIntArray468[local90] - 64 - 1;
						for (local133 = this.anIntArray466[local460] - 1; local133 >= 0; local133--) {
							local476 = this.aClass4_Sub4_Sub1ArrayArray3[local460][local133];
							local479 = local476.anInt9661;
							local146 = (byte) (local479 >> 16);
							local151 = (byte) (local479 >> 8);
							local492 = (byte) local479;
							local497 = (byte) (local479 >>> 24);
							local169 = (float) (local476.anInt9663 >> 12);
							local509 = (float) (local476.anInt9665 >> 12);
							local515 = (float) (local476.anInt9662 >> 12);
							local520 = local476.anInt9664 >> 12;
							this.aClass14_Sub21_Sub1_3.method7248(0.0F);
							this.aClass14_Sub21_Sub1_3.method7248(0.0F);
							this.aClass14_Sub21_Sub1_3.method7248((float) -local520 * local44 + local169);
							this.aClass14_Sub21_Sub1_3.method7248(local48 * (float) -local520 + local509);
							this.aClass14_Sub21_Sub1_3.method7248(local52 * (float) -local520 + local515);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
							this.aClass14_Sub21_Sub1_3.method7248(1.0F);
							this.aClass14_Sub21_Sub1_3.method7248(0.0F);
							this.aClass14_Sub21_Sub1_3.method7248(local169 + (float) local520 * local56);
							this.aClass14_Sub21_Sub1_3.method7248((float) local520 * local60 + local509);
							this.aClass14_Sub21_Sub1_3.method7248(local515 + local65 * (float) local520);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
							this.aClass14_Sub21_Sub1_3.method7248(1.0F);
							this.aClass14_Sub21_Sub1_3.method7248(1.0F);
							this.aClass14_Sub21_Sub1_3.method7248(local169 + local44 * (float) local520);
							this.aClass14_Sub21_Sub1_3.method7248(local509 + (float) local520 * local48);
							this.aClass14_Sub21_Sub1_3.method7248((float) local520 * local52 + local515);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
							this.aClass14_Sub21_Sub1_3.method7248(0.0F);
							this.aClass14_Sub21_Sub1_3.method7248(1.0F);
							this.aClass14_Sub21_Sub1_3.method7248(local70 * (float) local520 + local169);
							this.aClass14_Sub21_Sub1_3.method7248((float) local520 * local75 + local509);
							this.aClass14_Sub21_Sub1_3.method7248((float) local520 * local83 + local515);
							this.aClass14_Sub21_Sub1_3.method7747(local146);
							this.aClass14_Sub21_Sub1_3.method7747(local151);
							this.aClass14_Sub21_Sub1_3.method7747(local492);
							this.aClass14_Sub21_Sub1_3.method7747(local497);
						}
					}
				}
			}
		}
		if (this.aClass14_Sub21_Sub1_3.anInt8936 != 0) {
			this.anInterface12_6.method5812(this.aClass14_Sub21_Sub1_3.aByteArray99, 24, this.aClass14_Sub21_Sub1_3.anInt8936);
			arg1.method6978(this.aClass380_15, this.aClass380_14, (Class380) null, this.aClass380_13);
			arg1.method6974(this.aClass14_Sub21_Sub1_3.anInt8936 / 24);
		}
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!pi;Z)V")
	public void method7810(@OriginalArg(0) Class144_Sub3 arg0) {
		this.anInterface12_6 = arg0.method7037(true, 24, (byte[]) null, 196584);
		this.aClass380_15 = new Class380(this.anInterface12_6, 5126, 2, 0);
		this.aClass380_14 = new Class380(this.anInterface12_6, 5126, 3, 8);
		this.aClass380_13 = new Class380(this.anInterface12_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!pi;I)V")
	private void method7812(@OriginalArg(0) Class144_Sub3 arg0) {
		Static603.aFloat204 = arg0.lb;
		arg0.method6976();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7040(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Lclient!pi;IB)V")
	private void method7813(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1) {
		Static603.aFloat204 = arg0.lb;
		arg0.method7003((float) arg1);
		arg0.method6989();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7040(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(Lclient!pi;I)V")
	private void method7815(@OriginalArg(0) Class144_Sub3 arg0) {
		arg0.method7040(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static603.aFloat204 != arg0.lb) {
			arg0.xa(Static603.aFloat204);
		}
	}
}
