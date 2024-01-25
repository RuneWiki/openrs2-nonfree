import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class79 {

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "Lclient!sj;")
	private Interface16 anInterface16_1;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "Lclient!vv;")
	private Class346 aClass346_1;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "Lclient!vv;")
	private Class346 aClass346_2;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "Lclient!vv;")
	private Class346 aClass346_3;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[F")
	private final float[] aFloatArray4 = new float[16];

	@OriginalMember(owner = "client!ee", name = "j", descriptor = "Lclient!ph;")
	private final Class3_Sub7_Sub2 aClass3_Sub7_Sub2_1 = new Class3_Sub7_Sub2(786336);

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
	private final int anInt2604 = Static373.method6080(1600);

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "[[Lclient!fu;")
	private final Class55_Sub2_Sub1[][] aClass55_Sub2_Sub1ArrayArray1 = new Class55_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "[I")
	private final int[] anIntArray128 = new int[64];

	@OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
	private final int[] anIntArray127 = new int[1600];

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "[I")
	private final int[] anIntArray126 = new int[8191];

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	private int anInt2605 = 0;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "[[Lclient!fu;")
	private final Class55_Sub2_Sub1[][] aClass55_Sub2_Sub1ArrayArray2 = new Class55_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method2292(@OriginalArg(1) Class15_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray4, 0);
		@Pc(15) float local15 = this.aFloatArray4[0];
		@Pc(20) float local20 = this.aFloatArray4[4];
		@Pc(25) float local25 = this.aFloatArray4[8];
		@Pc(34) float local34 = this.aFloatArray4[1];
		@Pc(39) float local39 = this.aFloatArray4[5];
		@Pc(44) float local44 = this.aFloatArray4[9];
		@Pc(48) float local48 = local15 + local34;
		@Pc(52) float local52 = local20 + local39;
		@Pc(56) float local56 = local25 + local44;
		@Pc(60) float local60 = local15 - local34;
		@Pc(65) float local65 = local20 - local39;
		@Pc(69) float local69 = local25 - local44;
		@Pc(74) float local74 = local34 - local15;
		@Pc(78) float local78 = local39 - local20;
		@Pc(83) float local83 = local44 - local25;
		this.aClass3_Sub7_Sub2_1.anInt7869 = 0;
		@Pc(94) int local94;
		@Pc(109) int local109;
		@Pc(118) int local118;
		@Pc(127) Class55_Sub2_Sub1 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(500) float local500;
		@Pc(505) int local505;
		@Pc(445) int local445;
		@Pc(461) Class55_Sub2_Sub1 local461;
		@Pc(464) int local464;
		@Pc(477) byte local477;
		@Pc(482) byte local482;
		@Pc(494) float local494;
		if (arg0.aBoolean442) {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray127[local94] > 64 ? 64 : this.anIntArray127[local94];
				if (local109 > 0) {
					for (local118 = local109 - 1; local118 >= 0; local118--) {
						local127 = this.aClass55_Sub2_Sub1ArrayArray2[local94][local118];
						local130 = local127.anInt2864;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt2862 >> 12;
						local160 = local127.anInt2858 >> 12;
						local166 = local127.anInt2859 >> 12;
						local171 = local127.anInt2865 >> 12;
						this.aClass3_Sub7_Sub2_1.method6561(0.0F);
						this.aClass3_Sub7_Sub2_1.method6561(0.0F);
						this.aClass3_Sub7_Sub2_1.method6561((float) -local171 * local48 + local154);
						this.aClass3_Sub7_Sub2_1.method6561(local160 + local52 * (float) -local171);
						this.aClass3_Sub7_Sub2_1.method6561(local166 + local56 * (float) -local171);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
						this.aClass3_Sub7_Sub2_1.method6561(1.0F);
						this.aClass3_Sub7_Sub2_1.method6561(0.0F);
						this.aClass3_Sub7_Sub2_1.method6561(local154 + (float) local171 * local60);
						this.aClass3_Sub7_Sub2_1.method6561((float) local171 * local65 + local160);
						this.aClass3_Sub7_Sub2_1.method6561(local166 + (float) local171 * local69);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
						this.aClass3_Sub7_Sub2_1.method6561(1.0F);
						this.aClass3_Sub7_Sub2_1.method6561(1.0F);
						this.aClass3_Sub7_Sub2_1.method6561(local48 * (float) local171 + local154);
						this.aClass3_Sub7_Sub2_1.method6561(local160 + (float) local171 * local52);
						this.aClass3_Sub7_Sub2_1.method6561(local166 + (float) local171 * local56);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
						this.aClass3_Sub7_Sub2_1.method6561(0.0F);
						this.aClass3_Sub7_Sub2_1.method6561(1.0F);
						this.aClass3_Sub7_Sub2_1.method6561(local74 * (float) local171 + local154);
						this.aClass3_Sub7_Sub2_1.method6561(local160 + local78 * (float) local171);
						this.aClass3_Sub7_Sub2_1.method6561(local166 + (float) local171 * local83);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
					}
					if (this.anIntArray127[local94] > 64) {
						local445 = this.anIntArray127[local94] - 65;
						for (local130 = this.anIntArray128[local445] - 1; local130 >= 0; local130--) {
							local461 = this.aClass55_Sub2_Sub1ArrayArray1[local445][local130];
							local464 = local461.anInt2864;
							local143 = (byte) (local464 >> 16);
							local148 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local166 = local461.anInt2862 >> 12;
							local494 = local461.anInt2858 >> 12;
							local500 = local461.anInt2859 >> 12;
							local505 = local461.anInt2865 >> 12;
							this.aClass3_Sub7_Sub2_1.method6561(0.0F);
							this.aClass3_Sub7_Sub2_1.method6561(0.0F);
							this.aClass3_Sub7_Sub2_1.method6561(local166 + (float) -local505 * local48);
							this.aClass3_Sub7_Sub2_1.method6561(local52 * (float) -local505 + local494);
							this.aClass3_Sub7_Sub2_1.method6561(local500 + local56 * (float) -local505);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
							this.aClass3_Sub7_Sub2_1.method6561(1.0F);
							this.aClass3_Sub7_Sub2_1.method6561(0.0F);
							this.aClass3_Sub7_Sub2_1.method6561((float) local505 * local60 + local166);
							this.aClass3_Sub7_Sub2_1.method6561(local494 + local65 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6561(local69 * (float) local505 + local500);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
							this.aClass3_Sub7_Sub2_1.method6561(1.0F);
							this.aClass3_Sub7_Sub2_1.method6561(1.0F);
							this.aClass3_Sub7_Sub2_1.method6561(local48 * (float) local505 + local166);
							this.aClass3_Sub7_Sub2_1.method6561(local494 + local52 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6561(local500 + (float) local505 * local56);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
							this.aClass3_Sub7_Sub2_1.method6561(0.0F);
							this.aClass3_Sub7_Sub2_1.method6561(1.0F);
							this.aClass3_Sub7_Sub2_1.method6561(local166 + local74 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6561(local494 + (float) local505 * local78);
							this.aClass3_Sub7_Sub2_1.method6561(local500 + local83 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
						}
					}
				}
			}
		} else {
			for (local94 = arg1 - 1; local94 >= 0; local94--) {
				local109 = this.anIntArray127[local94] <= 64 ? this.anIntArray127[local94] : 64;
				if (local109 > 0) {
					for (local118 = local109 - 1; local118 >= 0; local118--) {
						local127 = this.aClass55_Sub2_Sub1ArrayArray2[local94][local118];
						local130 = local127.anInt2864;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt2862 >> 12;
						local160 = local127.anInt2858 >> 12;
						local166 = local127.anInt2859 >> 12;
						local171 = local127.anInt2865 >> 12;
						this.aClass3_Sub7_Sub2_1.method6560(0.0F);
						this.aClass3_Sub7_Sub2_1.method6560(0.0F);
						this.aClass3_Sub7_Sub2_1.method6560(local154 + local48 * (float) -local171);
						this.aClass3_Sub7_Sub2_1.method6560((float) -local171 * local52 + local160);
						this.aClass3_Sub7_Sub2_1.method6560(local56 * (float) -local171 + local166);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
						this.aClass3_Sub7_Sub2_1.method6560(1.0F);
						this.aClass3_Sub7_Sub2_1.method6560(0.0F);
						this.aClass3_Sub7_Sub2_1.method6560(local60 * (float) local171 + local154);
						this.aClass3_Sub7_Sub2_1.method6560(local160 + (float) local171 * local65);
						this.aClass3_Sub7_Sub2_1.method6560((float) local171 * local69 + local166);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
						this.aClass3_Sub7_Sub2_1.method6560(1.0F);
						this.aClass3_Sub7_Sub2_1.method6560(1.0F);
						this.aClass3_Sub7_Sub2_1.method6560(local154 + local48 * (float) local171);
						this.aClass3_Sub7_Sub2_1.method6560((float) local171 * local52 + local160);
						this.aClass3_Sub7_Sub2_1.method6560(local56 * (float) local171 + local166);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
						this.aClass3_Sub7_Sub2_1.method6560(0.0F);
						this.aClass3_Sub7_Sub2_1.method6560(1.0F);
						this.aClass3_Sub7_Sub2_1.method6560(local154 + local74 * (float) local171);
						this.aClass3_Sub7_Sub2_1.method6560(local160 + (float) local171 * local78);
						this.aClass3_Sub7_Sub2_1.method6560(local166 + (float) local171 * local83);
						this.aClass3_Sub7_Sub2_1.method6494(local135);
						this.aClass3_Sub7_Sub2_1.method6494(local140);
						this.aClass3_Sub7_Sub2_1.method6494(local143);
						this.aClass3_Sub7_Sub2_1.method6494(local148);
					}
					if (this.anIntArray127[local94] > 64) {
						local445 = this.anIntArray127[local94] - 64 - 1;
						for (local130 = this.anIntArray128[local445] - 1; local130 >= 0; local130--) {
							local461 = this.aClass55_Sub2_Sub1ArrayArray1[local445][local130];
							local464 = local461.anInt2864;
							local143 = (byte) (local464 >> 16);
							local148 = (byte) (local464 >> 8);
							local477 = (byte) local464;
							local482 = (byte) (local464 >>> 24);
							local166 = local461.anInt2862 >> 12;
							local494 = local461.anInt2858 >> 12;
							local500 = local461.anInt2859 >> 12;
							local505 = local461.anInt2865 >> 12;
							this.aClass3_Sub7_Sub2_1.method6560(0.0F);
							this.aClass3_Sub7_Sub2_1.method6560(0.0F);
							this.aClass3_Sub7_Sub2_1.method6560(local166 + local48 * (float) -local505);
							this.aClass3_Sub7_Sub2_1.method6560(local494 + local52 * (float) -local505);
							this.aClass3_Sub7_Sub2_1.method6560(local56 * (float) -local505 + local500);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
							this.aClass3_Sub7_Sub2_1.method6560(1.0F);
							this.aClass3_Sub7_Sub2_1.method6560(0.0F);
							this.aClass3_Sub7_Sub2_1.method6560(local166 + (float) local505 * local60);
							this.aClass3_Sub7_Sub2_1.method6560(local494 + local65 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6560((float) local505 * local69 + local500);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
							this.aClass3_Sub7_Sub2_1.method6560(1.0F);
							this.aClass3_Sub7_Sub2_1.method6560(1.0F);
							this.aClass3_Sub7_Sub2_1.method6560((float) local505 * local48 + local166);
							this.aClass3_Sub7_Sub2_1.method6560(local52 * (float) local505 + local494);
							this.aClass3_Sub7_Sub2_1.method6560((float) local505 * local56 + local500);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
							this.aClass3_Sub7_Sub2_1.method6560(0.0F);
							this.aClass3_Sub7_Sub2_1.method6560(1.0F);
							this.aClass3_Sub7_Sub2_1.method6560(local166 + (float) local505 * local74);
							this.aClass3_Sub7_Sub2_1.method6560(local494 + local78 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6560(local500 + local83 * (float) local505);
							this.aClass3_Sub7_Sub2_1.method6494(local143);
							this.aClass3_Sub7_Sub2_1.method6494(local148);
							this.aClass3_Sub7_Sub2_1.method6494(local477);
							this.aClass3_Sub7_Sub2_1.method6494(local482);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub7_Sub2_1.anInt7869 != 0) {
			this.anInterface16_1.method7026(this.aClass3_Sub7_Sub2_1.anInt7869, this.aClass3_Sub7_Sub2_1.aByteArray86, 24);
			arg0.method4409(this.aClass346_1, this.aClass346_2, null, this.aClass346_3);
			arg0.method4450(this.aClass3_Sub7_Sub2_1.anInt7869 / 24);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ji;)V")
	private void method2293(@OriginalArg(1) Class15_Sub3 arg0) {
		arg0.method4413(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static130.aFloat32 != arg0.aFloat109) {
			arg0.ha(Static130.aFloat32);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLclient!ji;)V")
	private void method2295(@OriginalArg(1) Class15_Sub3 arg0) {
		Static130.aFloat32 = arg0.aFloat109;
		arg0.method4423();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4413(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!qu;Lclient!ji;I)V")
	public void method2297(@OriginalArg(0) Class274 arg0, @OriginalArg(1) Class15_Sub3 arg1) {
		if (arg1.aClass255_Sub1_4 == null) {
			return;
		}
		this.method2295(arg1);
		@Pc(17) float local17 = arg1.aClass255_Sub1_4.aFloat160;
		@Pc(21) float local21 = arg1.aClass255_Sub1_4.aFloat168;
		@Pc(33) float local33 = arg1.aClass255_Sub1_4.aFloat164;
		@Pc(37) float local37 = arg1.aClass255_Sub1_4.aFloat161;
		try {
			@Pc(42) int local42;
			@Pc(44) int local44;
			@Pc(50) Class55_Sub2 local50;
			@Pc(149) int local149;
			@Pc(160) int local160;
			if (arg0.aBoolean690) {
				local42 = arg0.anInt8395 - arg0.anInt8396;
				if (local42 + 2 <= 1600) {
					local42 += 2;
					local44 = 0;
				} else {
					local44 = Static373.method6080(local42) + 1 - this.anInt2604;
					local42 = (local42 >> local44) + 2;
				}
				@Pc(403) Class55_Sub2 local403 = arg0.aClass22_1.aClass55_Sub2_1;
				local50 = local403.aClass55_Sub2_10;
				@Pc(408) int local408 = -2;
				@Pc(410) boolean local410 = true;
				@Pc(412) boolean local412 = true;
				while (local50 != local403) {
					this.anInt2605 = 0;
					for (local149 = 0; local149 < local42; local149++) {
						this.anIntArray127[local149] = 0;
					}
					for (@Pc(432) int local432 = 0; local432 < 64; local432++) {
						this.anIntArray128[local432] = 0;
					}
					while (local50 != local403) {
						@Pc(448) Class55_Sub2_Sub1 local448 = (Class55_Sub2_Sub1) local50;
						if (local412) {
							local410 = local448.aBoolean219;
							local412 = false;
							local408 = local448.anInt2867;
						} else if (local408 != local448.anInt2867 || local448.aBoolean219 != local410) {
							local412 = true;
							break;
						}
						local160 = (int) (local37 + (float) (local448.anInt2859 >> 12) * local33 + local21 * (float) (local448.anInt2858 >> 12) + local17 * (float) (local448.anInt2862 >> 12)) - arg0.anInt8396 >> local44;
						if (local160 < 1600) {
							if (this.anIntArray127[local160] < 64) {
								this.aClass55_Sub2_Sub1ArrayArray2[local160][this.anIntArray127[local160]++] = local448;
							} else {
								label140: {
									if (this.anIntArray127[local160] == 64) {
										if (this.anInt2605 == 64) {
											break label140;
										}
										this.anIntArray127[local160] += this.anInt2605++ + 1;
									}
									this.aClass55_Sub2_Sub1ArrayArray1[this.anIntArray127[local160] - 64 - 1][this.anIntArray128[this.anIntArray127[local160] - 64 - 1]++] = local448;
								}
							}
						}
						local50 = local50.aClass55_Sub2_10;
					}
					if (local408 < 0) {
						arg1.method4448(-1);
					} else {
						arg1.method4448(local408);
					}
					if (local410 && arg1.aFloat109 != Static130.aFloat32) {
						arg1.ha(Static130.aFloat32);
					} else if (arg1.aFloat109 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method2292(arg1, local42);
				}
			} else {
				local42 = 0;
				local44 = Integer.MAX_VALUE;
				@Pc(46) int local46 = 0;
				local50 = arg0.aClass22_1.aClass55_Sub2_1;
				@Pc(53) Class55_Sub2 local53;
				@Pc(85) int local85;
				for (local53 = local50.aClass55_Sub2_10; local53 != local50; local53 = local53.aClass55_Sub2_10) {
					@Pc(58) Class55_Sub2_Sub1 local58 = (Class55_Sub2_Sub1) local53;
					local85 = (int) ((float) (local58.anInt2859 >> 12) * local33 + (float) (local58.anInt2862 >> 12) * local17 + local21 * (float) (local58.anInt2858 >> 12) + local37);
					if (local44 > local85) {
						local44 = local85;
					}
					if (local46 < local85) {
						local46 = local85;
					}
					this.anIntArray126[local42++] = local85;
				}
				@Pc(116) int local116 = local46 - local44;
				if (local116 + 2 > 1600) {
					local85 = Static373.method6080(local116) + 1 - this.anInt2604;
					local116 = (local116 >> local85) + 2;
				} else {
					local85 = 0;
					local116 += 2;
				}
				local53 = local50.aClass55_Sub2_10;
				local42 = 0;
				local149 = -2;
				@Pc(151) boolean local151 = true;
				@Pc(153) boolean local153 = true;
				while (local50 != local53) {
					this.anInt2605 = 0;
					for (local160 = 0; local160 < local116; local160++) {
						this.anIntArray127[local160] = 0;
					}
					for (@Pc(173) int local173 = 0; local173 < 64; local173++) {
						this.anIntArray128[local173] = 0;
					}
					while (local53 != local50) {
						@Pc(189) Class55_Sub2_Sub1 local189 = (Class55_Sub2_Sub1) local53;
						if (local153) {
							local149 = local189.anInt2867;
							local153 = false;
							local151 = local189.aBoolean219;
						}
						if (local42 > 0 && (local149 != local189.anInt2867 || local151 != local189.aBoolean219)) {
							local153 = true;
							break;
						}
						@Pc(231) int local231 = this.anIntArray126[local42++] - local44 >> local85;
						if (local231 < 1600) {
							if (this.anIntArray127[local231] < 64) {
								this.aClass55_Sub2_Sub1ArrayArray2[local231][this.anIntArray127[local231]++] = local189;
							} else {
								label185: {
									if (this.anIntArray127[local231] == 64) {
										if (this.anInt2605 == 64) {
											break label185;
										}
										this.anIntArray127[local231] += this.anInt2605++ + 1;
									}
									@Pc(299) Class55_Sub2_Sub1[] local299 = this.aClass55_Sub2_Sub1ArrayArray1[this.anIntArray127[local231] - 64 - 1];
									@Pc(309) int local309 = this.anIntArray127[local231] - 64 - 1;
									@Pc(311) int local311 = this.anIntArray128[this.anIntArray127[local231] - 64 - 1];
									this.anIntArray128[local309] = this.anIntArray128[this.anIntArray127[local231] - 64 - 1] + 1;
									local299[local311] = local189;
								}
							}
						}
						local53 = local53.aClass55_Sub2_10;
					}
					if (local149 < 0) {
						arg1.method4448(-1);
					} else {
						arg1.method4448(local149);
					}
					if (local151 && Static130.aFloat32 != arg1.aFloat109) {
						arg1.ha(Static130.aFloat32);
					} else if (arg1.aFloat109 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method2292(arg1, local116);
				}
			}
		} catch (@Pc(645) Exception local645) {
		}
		this.method2293(arg1);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(ILclient!ji;)V")
	public void method2298(@OriginalArg(1) Class15_Sub3 arg0) {
		this.anInterface16_1 = arg0.method4422(196584, true, null, 24);
		this.aClass346_2 = new Class346(this.anInterface16_1, 5126, 2, 0);
		this.aClass346_3 = new Class346(this.anInterface16_1, 5126, 3, 8);
		this.aClass346_1 = new Class346(this.anInterface16_1, 5121, 4, 20);
	}
}
