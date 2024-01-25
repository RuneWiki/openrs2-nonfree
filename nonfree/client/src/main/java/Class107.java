import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class107 {

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!hh;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "Lclient!tp;")
	private Class225 aClass225_11;

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!tp;")
	private Class225 aClass225_12;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!tp;")
	private Class225 aClass225_13;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "[F")
	private final float[] aFloatArray30 = new float[16];

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!aj;")
	private final Class3_Sub2_Sub1 aClass3_Sub2_Sub1_3 = new Class3_Sub2_Sub1(786336);

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	private final int anInt3556 = Static345.method4948(1600);

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "[[Lclient!o;")
	private final Class13_Sub3_Sub1[][] aClass13_Sub3_Sub1ArrayArray2 = new Class13_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "[I")
	private final int[] anIntArray265 = new int[1600];

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
	private int anInt3557 = 0;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "[[Lclient!o;")
	private final Class13_Sub3_Sub1[][] aClass13_Sub3_Sub1ArrayArray1 = new Class13_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!ic", name = "z", descriptor = "[I")
	private final int[] anIntArray267 = new int[64];

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "[I")
	private final int[] anIntArray266 = new int[8191];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method2915(@OriginalArg(0) Class75_Sub2 arg0) {
		this.anInterface5_5 = arg0.method2435(196584, null, true, 24);
		this.aClass225_13 = new Class225(arg0, this.anInterface5_5, 5126, 2, 0);
		this.aClass225_11 = new Class225(arg0, this.anInterface5_5, 5126, 3, 8);
		this.aClass225_12 = new Class225(arg0, this.anInterface5_5, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLclient!gk;)V")
	private void method2918(@OriginalArg(1) Class75_Sub2 arg0) {
		Static433.aFloat95 = arg0.aFloat45;
		arg0.method2478();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2467(false);
		arg0.method2440(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!gk;BI)V")
	private void method2920(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray30, 0);
		@Pc(13) float local13 = this.aFloatArray30[0];
		@Pc(18) float local18 = this.aFloatArray30[4];
		@Pc(23) float local23 = this.aFloatArray30[8];
		@Pc(28) float local28 = this.aFloatArray30[1];
		@Pc(33) float local33 = this.aFloatArray30[5];
		@Pc(38) float local38 = this.aFloatArray30[9];
		@Pc(46) float local46 = local13 + local28;
		@Pc(50) float local50 = local18 + local33;
		@Pc(54) float local54 = local38 + local23;
		@Pc(58) float local58 = local13 - local28;
		@Pc(63) float local63 = local18 - local33;
		@Pc(68) float local68 = local23 - local38;
		@Pc(73) float local73 = local28 - local13;
		@Pc(78) float local78 = local33 - local18;
		@Pc(83) float local83 = local38 - local23;
		this.aClass3_Sub2_Sub1_3.anInt7620 = 0;
		@Pc(94) int local94;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(127) Class13_Sub3_Sub1 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(503) float local503;
		@Pc(508) int local508;
		@Pc(449) int local449;
		@Pc(464) Class13_Sub3_Sub1 local464;
		@Pc(467) int local467;
		@Pc(480) byte local480;
		@Pc(485) byte local485;
		@Pc(497) float local497;
		if (arg0.aBoolean228) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local110 = this.anIntArray265[local94] <= 64 ? this.anIntArray265[local94] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local127 = this.aClass13_Sub3_Sub1ArrayArray2[local94][local119];
						local130 = local127.anInt6870;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt6869 >> Static258.anInt7460;
						local160 = local127.anInt6863 >> Static258.anInt7460;
						local166 = local127.anInt6868 >> Static258.anInt7460;
						local171 = local127.anInt6864 >> Static258.anInt7460;
						this.aClass3_Sub2_Sub1_3.method400(0.0F);
						this.aClass3_Sub2_Sub1_3.method400(0.0F);
						this.aClass3_Sub2_Sub1_3.method400(local154 + (float) -local171 * local46);
						this.aClass3_Sub2_Sub1_3.method400(local160 + (float) -local171 * local50);
						this.aClass3_Sub2_Sub1_3.method400(local54 * (float) -local171 + local166);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
						this.aClass3_Sub2_Sub1_3.method400(1.0F);
						this.aClass3_Sub2_Sub1_3.method400(0.0F);
						this.aClass3_Sub2_Sub1_3.method400(local58 * (float) local171 + local154);
						this.aClass3_Sub2_Sub1_3.method400(local160 + local63 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method400(local166 + local68 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
						this.aClass3_Sub2_Sub1_3.method400(1.0F);
						this.aClass3_Sub2_Sub1_3.method400(1.0F);
						this.aClass3_Sub2_Sub1_3.method400(local154 + (float) local171 * local46);
						this.aClass3_Sub2_Sub1_3.method400((float) local171 * local50 + local160);
						this.aClass3_Sub2_Sub1_3.method400(local166 + (float) local171 * local54);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
						this.aClass3_Sub2_Sub1_3.method400(0.0F);
						this.aClass3_Sub2_Sub1_3.method400(1.0F);
						this.aClass3_Sub2_Sub1_3.method400(local154 + local73 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method400((float) local171 * local78 + local160);
						this.aClass3_Sub2_Sub1_3.method400(local166 + (float) local171 * local83);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
					}
					if (this.anIntArray265[local94] > 64) {
						local449 = this.anIntArray265[local94] - 65;
						for (local130 = this.anIntArray267[local449] - 1; local130 >= 0; local130--) {
							local464 = this.aClass13_Sub3_Sub1ArrayArray1[local449][local130];
							local467 = local464.anInt6870;
							local143 = (byte) (local467 >> 16);
							local148 = (byte) (local467 >> 8);
							local480 = (byte) local467;
							local485 = (byte) (local467 >>> 24);
							local166 = local464.anInt6869 >> Static258.anInt7460;
							local497 = local464.anInt6863 >> Static258.anInt7460;
							local503 = local464.anInt6868 >> Static258.anInt7460;
							local508 = local464.anInt6864 >> Static258.anInt7460;
							this.aClass3_Sub2_Sub1_3.method400(0.0F);
							this.aClass3_Sub2_Sub1_3.method400(0.0F);
							this.aClass3_Sub2_Sub1_3.method400((float) -local508 * local46 + local166);
							this.aClass3_Sub2_Sub1_3.method400((float) -local508 * local50 + local497);
							this.aClass3_Sub2_Sub1_3.method400(local54 * (float) -local508 + local503);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
							this.aClass3_Sub2_Sub1_3.method400(1.0F);
							this.aClass3_Sub2_Sub1_3.method400(0.0F);
							this.aClass3_Sub2_Sub1_3.method400((float) local508 * local58 + local166);
							this.aClass3_Sub2_Sub1_3.method400((float) local508 * local63 + local497);
							this.aClass3_Sub2_Sub1_3.method400((float) local508 * local68 + local503);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
							this.aClass3_Sub2_Sub1_3.method400(1.0F);
							this.aClass3_Sub2_Sub1_3.method400(1.0F);
							this.aClass3_Sub2_Sub1_3.method400(local166 + local46 * (float) local508);
							this.aClass3_Sub2_Sub1_3.method400((float) local508 * local50 + local497);
							this.aClass3_Sub2_Sub1_3.method400((float) local508 * local54 + local503);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
							this.aClass3_Sub2_Sub1_3.method400(0.0F);
							this.aClass3_Sub2_Sub1_3.method400(1.0F);
							this.aClass3_Sub2_Sub1_3.method400((float) local508 * local73 + local166);
							this.aClass3_Sub2_Sub1_3.method400(local497 + (float) local508 * local78);
							this.aClass3_Sub2_Sub1_3.method400(local503 + local83 * (float) local508);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local110 = this.anIntArray265[local94] <= 64 ? this.anIntArray265[local94] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local127 = this.aClass13_Sub3_Sub1ArrayArray2[local94][local119];
						local130 = local127.anInt6870;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt6869 >> Static258.anInt7460;
						local160 = local127.anInt6863 >> Static258.anInt7460;
						local166 = local127.anInt6868 >> Static258.anInt7460;
						local171 = local127.anInt6864 >> Static258.anInt7460;
						this.aClass3_Sub2_Sub1_3.method395(0.0F);
						this.aClass3_Sub2_Sub1_3.method395(0.0F);
						this.aClass3_Sub2_Sub1_3.method395(local46 * (float) -local171 + local154);
						this.aClass3_Sub2_Sub1_3.method395(local50 * (float) -local171 + local160);
						this.aClass3_Sub2_Sub1_3.method395(local166 + (float) -local171 * local54);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
						this.aClass3_Sub2_Sub1_3.method395(1.0F);
						this.aClass3_Sub2_Sub1_3.method395(0.0F);
						this.aClass3_Sub2_Sub1_3.method395(local154 + local58 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method395(local160 + local63 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method395(local166 + (float) local171 * local68);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
						this.aClass3_Sub2_Sub1_3.method395(1.0F);
						this.aClass3_Sub2_Sub1_3.method395(1.0F);
						this.aClass3_Sub2_Sub1_3.method395(local154 + local46 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method395((float) local171 * local50 + local160);
						this.aClass3_Sub2_Sub1_3.method395(local166 + local54 * (float) local171);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
						this.aClass3_Sub2_Sub1_3.method395(0.0F);
						this.aClass3_Sub2_Sub1_3.method395(1.0F);
						this.aClass3_Sub2_Sub1_3.method395((float) local171 * local73 + local154);
						this.aClass3_Sub2_Sub1_3.method395(local78 * (float) local171 + local160);
						this.aClass3_Sub2_Sub1_3.method395(local83 * (float) local171 + local166);
						this.aClass3_Sub2_Sub1_3.method6001(local135);
						this.aClass3_Sub2_Sub1_3.method6001(local140);
						this.aClass3_Sub2_Sub1_3.method6001(local143);
						this.aClass3_Sub2_Sub1_3.method6001(local148);
					}
					if (this.anIntArray265[local94] > 64) {
						local449 = this.anIntArray265[local94] - 64 - 1;
						for (local130 = this.anIntArray267[local449] - 1; local130 >= 0; local130--) {
							local464 = this.aClass13_Sub3_Sub1ArrayArray1[local449][local130];
							local467 = local464.anInt6870;
							local143 = (byte) (local467 >> 16);
							local148 = (byte) (local467 >> 8);
							local480 = (byte) local467;
							local485 = (byte) (local467 >>> 24);
							local166 = local464.anInt6869 >> Static258.anInt7460;
							local497 = local464.anInt6863 >> Static258.anInt7460;
							local503 = local464.anInt6868 >> Static258.anInt7460;
							local508 = local464.anInt6864 >> Static258.anInt7460;
							this.aClass3_Sub2_Sub1_3.method395(0.0F);
							this.aClass3_Sub2_Sub1_3.method395(0.0F);
							this.aClass3_Sub2_Sub1_3.method395((float) -local508 * local46 + local166);
							this.aClass3_Sub2_Sub1_3.method395(local50 * (float) -local508 + local497);
							this.aClass3_Sub2_Sub1_3.method395(local503 + (float) -local508 * local54);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
							this.aClass3_Sub2_Sub1_3.method395(1.0F);
							this.aClass3_Sub2_Sub1_3.method395(0.0F);
							this.aClass3_Sub2_Sub1_3.method395(local166 + (float) local508 * local58);
							this.aClass3_Sub2_Sub1_3.method395(local497 + (float) local508 * local63);
							this.aClass3_Sub2_Sub1_3.method395(local503 + local68 * (float) local508);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
							this.aClass3_Sub2_Sub1_3.method395(1.0F);
							this.aClass3_Sub2_Sub1_3.method395(1.0F);
							this.aClass3_Sub2_Sub1_3.method395(local166 + (float) local508 * local46);
							this.aClass3_Sub2_Sub1_3.method395(local497 + local50 * (float) local508);
							this.aClass3_Sub2_Sub1_3.method395(local54 * (float) local508 + local503);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
							this.aClass3_Sub2_Sub1_3.method395(0.0F);
							this.aClass3_Sub2_Sub1_3.method395(1.0F);
							this.aClass3_Sub2_Sub1_3.method395((float) local508 * local73 + local166);
							this.aClass3_Sub2_Sub1_3.method395((float) local508 * local78 + local497);
							this.aClass3_Sub2_Sub1_3.method395((float) local508 * local83 + local503);
							this.aClass3_Sub2_Sub1_3.method6001(local143);
							this.aClass3_Sub2_Sub1_3.method6001(local148);
							this.aClass3_Sub2_Sub1_3.method6001(local480);
							this.aClass3_Sub2_Sub1_3.method6001(local485);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub2_Sub1_3.anInt7620 != 0) {
			this.anInterface5_5.method4784(24, this.aClass3_Sub2_Sub1_3.aByteArray95, this.aClass3_Sub2_Sub1_3.anInt7620);
			arg0.method2473(null, this.aClass225_11, this.aClass225_12, this.aClass225_13);
			arg0.method2431(this.aClass3_Sub2_Sub1_3.anInt7620 / 24);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!gk;Z)V")
	private void method2921(@OriginalArg(0) Class75_Sub2 arg0) {
		arg0.method2467(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat45 != Static433.aFloat95) {
			arg0.ua(Static433.aFloat95);
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!gk;ILclient!iv;)V")
	public void method2922(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(2) Class116 arg1) {
		if (arg0.aClass106_Sub2_4 == null) {
			return;
		}
		this.method2918(arg0);
		@Pc(15) float local15 = arg0.aClass106_Sub2_4.aFloat81;
		@Pc(19) float local19 = arg0.aClass106_Sub2_4.aFloat77;
		@Pc(29) float local29 = arg0.aClass106_Sub2_4.aFloat80;
		@Pc(33) float local33 = arg0.aClass106_Sub2_4.aFloat76;
		try {
			@Pc(38) int local38;
			@Pc(40) int local40;
			@Pc(46) Class13_Sub3 local46;
			@Pc(139) int local139;
			@Pc(270) Class13_Sub3_Sub1[] local270;
			@Pc(149) int local149;
			@Pc(280) int local280;
			@Pc(282) int local282;
			if (arg1.aBoolean289) {
				local38 = arg1.anInt3718 - arg1.anInt3719;
				if (local38 + 2 > 1600) {
					local40 = Static345.method4948(local38) + 1 - this.anInt3556;
					local38 = (local38 >> local40) + 2;
				} else {
					local38 += 2;
					local40 = 0;
				}
				@Pc(401) Class13_Sub3 local401 = arg1.aClass236_1.aClass13_Sub3_7;
				local46 = local401.aClass13_Sub3_5;
				@Pc(406) int local406 = -2;
				@Pc(408) boolean local408 = true;
				@Pc(410) boolean local410 = true;
				while (local401 != local46) {
					this.anInt3557 = 0;
					for (local139 = 0; local139 < local38; local139++) {
						this.anIntArray265[local139] = 0;
					}
					for (@Pc(428) int local428 = 0; local428 < 64; local428++) {
						this.anIntArray267[local428] = 0;
					}
					while (local46 != local401) {
						@Pc(444) Class13_Sub3_Sub1 local444 = (Class13_Sub3_Sub1) local46;
						if (local410) {
							local408 = local444.aBoolean480;
							local406 = local444.anInt6867;
							local410 = false;
						} else if (local444.anInt6867 != local406 || local408 != local444.aBoolean480) {
							local410 = true;
							break;
						}
						local149 = (int) ((float) (local444.anInt6869 >> Static258.anInt7460) * local15 + local19 * (float) (local444.anInt6863 >> Static258.anInt7460) + (float) (local444.anInt6868 >> Static258.anInt7460) * local29 + local33) - arg1.anInt3719 >> local40;
						if (local149 < 1600) {
							if (this.anIntArray265[local149] >= 64) {
								label142: {
									if (this.anIntArray265[local149] == 64) {
										if (this.anInt3557 == 64) {
											break label142;
										}
										this.anIntArray265[local149] += this.anInt3557++ + 1;
									}
									local270 = this.aClass13_Sub3_Sub1ArrayArray1[this.anIntArray265[local149] - 64 - 1];
									local280 = this.anIntArray265[local149] - 65;
									local282 = this.anIntArray267[this.anIntArray265[local149] - 65];
									this.anIntArray267[local280] = this.anIntArray267[this.anIntArray265[local149] - 65] + 1;
									local270[local282] = local444;
								}
							} else {
								this.aClass13_Sub3_Sub1ArrayArray2[local149][this.anIntArray265[local149]++] = local444;
							}
						}
						local46 = local46.aClass13_Sub3_5;
					}
					if (local406 >= 0) {
						arg0.method2456(arg0.aClass35_1.method1065(local406));
						arg0.method2424(arg0.anInterface7_6.method2131(local406).anInt1810);
					} else {
						arg0.method2456(null);
					}
					if (local408 && Static433.aFloat95 != arg0.aFloat45) {
						arg0.ua(Static433.aFloat95);
					} else if (arg0.aFloat45 != 1.0F) {
						arg0.ua(1.0F);
					}
					this.method2920(arg0, local38);
				}
			} else {
				local38 = 0;
				local40 = Integer.MAX_VALUE;
				@Pc(42) int local42 = 0;
				local46 = arg1.aClass236_1.aClass13_Sub3_7;
				@Pc(49) Class13_Sub3 local49;
				@Pc(80) int local80;
				for (local49 = local46.aClass13_Sub3_5; local49 != local46; local49 = local49.aClass13_Sub3_5) {
					@Pc(53) Class13_Sub3_Sub1 local53 = (Class13_Sub3_Sub1) local49;
					local80 = (int) (local15 * (float) (local53.anInt6869 >> Static258.anInt7460) + local19 * (float) (local53.anInt6863 >> Static258.anInt7460) + (float) (local53.anInt6868 >> Static258.anInt7460) * local29 + local33);
					if (local40 > local80) {
						local40 = local80;
					}
					if (local80 > local42) {
						local42 = local80;
					}
					this.anIntArray266[local38++] = local80;
				}
				@Pc(107) int local107 = local42 - local40;
				if (local107 + 2 <= 1600) {
					local107 += 2;
					local80 = 0;
				} else {
					local80 = Static345.method4948(local107) + 1 - this.anInt3556;
					local107 = (local107 >> local80) + 2;
				}
				local38 = 0;
				local49 = local46.aClass13_Sub3_5;
				local139 = -2;
				@Pc(141) boolean local141 = true;
				@Pc(143) boolean local143 = true;
				while (local46 != local49) {
					this.anInt3557 = 0;
					for (local149 = 0; local149 < local107; local149++) {
						this.anIntArray265[local149] = 0;
					}
					for (@Pc(165) int local165 = 0; local165 < 64; local165++) {
						this.anIntArray267[local165] = 0;
					}
					while (local46 != local49) {
						@Pc(179) Class13_Sub3_Sub1 local179 = (Class13_Sub3_Sub1) local49;
						if (local143) {
							local139 = local179.anInt6867;
							local143 = false;
							local141 = local179.aBoolean480;
						}
						if (local38 > 0 && (local139 != local179.anInt6867 || local141 != local179.aBoolean480)) {
							local143 = true;
							break;
						}
						@Pc(219) int local219 = this.anIntArray266[local38++] - local40 >> local80;
						if (local219 < 1600) {
							if (this.anIntArray265[local219] >= 64) {
								label187: {
									if (this.anIntArray265[local219] == 64) {
										if (this.anInt3557 == 64) {
											break label187;
										}
										this.anIntArray265[local219] += this.anInt3557++ + 1;
									}
									local270 = this.aClass13_Sub3_Sub1ArrayArray1[this.anIntArray265[local219] - 1 - 64];
									local280 = this.anIntArray265[local219] - 1 - 64;
									local282 = this.anIntArray267[this.anIntArray265[local219] - 1 - 64];
									this.anIntArray267[local280] = this.anIntArray267[this.anIntArray265[local219] - 1 - 64] + 1;
									local270[local282] = local179;
								}
							} else {
								this.aClass13_Sub3_Sub1ArrayArray2[local219][this.anIntArray265[local219]++] = local179;
							}
						}
						local49 = local49.aClass13_Sub3_5;
					}
					if (local139 >= 0) {
						arg0.method2456(arg0.aClass35_1.method1065(local139));
						arg0.method2424(arg0.anInterface7_6.method2131(local139).anInt1810);
					} else {
						arg0.method2456(null);
					}
					if (local141 && arg0.aFloat45 != Static433.aFloat95) {
						arg0.ua(Static433.aFloat95);
					} else if (arg0.aFloat45 != 1.0F) {
						arg0.ua(1.0F);
					}
					this.method2920(arg0, local107);
				}
			}
		} catch (@Pc(652) Exception local652) {
		}
		this.method2921(arg0);
	}
}
