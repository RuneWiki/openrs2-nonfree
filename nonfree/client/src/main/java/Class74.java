import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class74 {

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "Lclient!av;")
	private Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!cm;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!cm;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "Lclient!cm;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "[F")
	private final float[] aFloatArray8 = new float[16];

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "Lclient!kj;")
	private final Class6_Sub14_Sub1 aClass6_Sub14_Sub1_1 = new Class6_Sub14_Sub1(786336);

	@OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
	private final int anInt1594 = Static154.method2268(1600);

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
	private final int[] anIntArray181 = new int[8191];

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
	private int anInt1595 = 0;

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "[I")
	private final int[] anIntArray182 = new int[64];

	@OriginalMember(owner = "client!ds", name = "u", descriptor = "[[Lclient!pl;")
	private final Class102_Sub1_Sub1[][] aClass102_Sub1_Sub1ArrayArray1 = new Class102_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "[[Lclient!pl;")
	private final Class102_Sub1_Sub1[][] aClass102_Sub1_Sub1ArrayArray2 = new Class102_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!ds", name = "x", descriptor = "[I")
	private final int[] anIntArray183 = new int[1600];

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!pea;)V")
	private void method1493(@OriginalArg(1) int arg0, @OriginalArg(2) Class121_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray8, 0);
		@Pc(15) float local15 = this.aFloatArray8[0];
		@Pc(20) float local20 = this.aFloatArray8[4];
		@Pc(25) float local25 = this.aFloatArray8[8];
		@Pc(30) float local30 = this.aFloatArray8[1];
		@Pc(35) float local35 = this.aFloatArray8[5];
		@Pc(47) float local47 = this.aFloatArray8[9];
		@Pc(51) float local51 = local30 + local15;
		@Pc(55) float local55 = local20 + local35;
		@Pc(59) float local59 = local47 + local25;
		@Pc(64) float local64 = local15 - local30;
		@Pc(68) float local68 = local20 - local35;
		@Pc(73) float local73 = local25 - local47;
		@Pc(78) float local78 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		this.aClass6_Sub14_Sub1_1.anInt7244 = 0;
		@Pc(91) float local91 = local47 - local25;
		@Pc(98) int local98;
		@Pc(115) int local115;
		@Pc(124) int local124;
		@Pc(133) Class102_Sub1_Sub1 local133;
		@Pc(136) int local136;
		@Pc(141) byte local141;
		@Pc(146) byte local146;
		@Pc(149) byte local149;
		@Pc(154) byte local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(172) float local172;
		@Pc(177) int local177;
		@Pc(501) float local501;
		@Pc(506) int local506;
		@Pc(446) int local446;
		@Pc(462) Class102_Sub1_Sub1 local462;
		@Pc(465) int local465;
		@Pc(478) byte local478;
		@Pc(483) byte local483;
		@Pc(495) float local495;
		if (arg1.aBoolean458) {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray183[local98] > 64 ? 64 : this.anIntArray183[local98];
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass102_Sub1_Sub1ArrayArray2[local98][local124];
						local136 = local133.anInt2519;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt2516 >> 12;
						local166 = local133.anInt2521 >> 12;
						local172 = local133.anInt2518 >> 12;
						local177 = local133.anInt2520 >> 12;
						this.aClass6_Sub14_Sub1_1.method3726(0.0F);
						this.aClass6_Sub14_Sub1_1.method3726(0.0F);
						this.aClass6_Sub14_Sub1_1.method3726(local51 * (float) -local177 + local160);
						this.aClass6_Sub14_Sub1_1.method3726(local166 + local55 * (float) -local177);
						this.aClass6_Sub14_Sub1_1.method3726((float) -local177 * local59 + local172);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
						this.aClass6_Sub14_Sub1_1.method3726(1.0F);
						this.aClass6_Sub14_Sub1_1.method3726(0.0F);
						this.aClass6_Sub14_Sub1_1.method3726(local64 * (float) local177 + local160);
						this.aClass6_Sub14_Sub1_1.method3726(local166 + local68 * (float) local177);
						this.aClass6_Sub14_Sub1_1.method3726(local172 + (float) local177 * local73);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
						this.aClass6_Sub14_Sub1_1.method3726(1.0F);
						this.aClass6_Sub14_Sub1_1.method3726(1.0F);
						this.aClass6_Sub14_Sub1_1.method3726((float) local177 * local51 + local160);
						this.aClass6_Sub14_Sub1_1.method3726(local166 + local55 * (float) local177);
						this.aClass6_Sub14_Sub1_1.method3726((float) local177 * local59 + local172);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
						this.aClass6_Sub14_Sub1_1.method3726(0.0F);
						this.aClass6_Sub14_Sub1_1.method3726(1.0F);
						this.aClass6_Sub14_Sub1_1.method3726((float) local177 * local78 + local160);
						this.aClass6_Sub14_Sub1_1.method3726(local166 + (float) local177 * local82);
						this.aClass6_Sub14_Sub1_1.method3726((float) local177 * local91 + local172);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
					}
					if (this.anIntArray183[local98] > 64) {
						local446 = this.anIntArray183[local98] - 64 - 1;
						for (local136 = this.anIntArray182[local446] - 1; local136 >= 0; local136--) {
							local462 = this.aClass102_Sub1_Sub1ArrayArray1[local446][local136];
							local465 = local462.anInt2519;
							local149 = (byte) (local465 >> 16);
							local154 = (byte) (local465 >> 8);
							local478 = (byte) local465;
							local483 = (byte) (local465 >>> 24);
							local172 = local462.anInt2516 >> 12;
							local495 = local462.anInt2521 >> 12;
							local501 = local462.anInt2518 >> 12;
							local506 = local462.anInt2520 >> 12;
							this.aClass6_Sub14_Sub1_1.method3726(0.0F);
							this.aClass6_Sub14_Sub1_1.method3726(0.0F);
							this.aClass6_Sub14_Sub1_1.method3726(local51 * (float) -local506 + local172);
							this.aClass6_Sub14_Sub1_1.method3726(local55 * (float) -local506 + local495);
							this.aClass6_Sub14_Sub1_1.method3726(local59 * (float) -local506 + local501);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
							this.aClass6_Sub14_Sub1_1.method3726(1.0F);
							this.aClass6_Sub14_Sub1_1.method3726(0.0F);
							this.aClass6_Sub14_Sub1_1.method3726((float) local506 * local64 + local172);
							this.aClass6_Sub14_Sub1_1.method3726(local495 + local68 * (float) local506);
							this.aClass6_Sub14_Sub1_1.method3726(local73 * (float) local506 + local501);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
							this.aClass6_Sub14_Sub1_1.method3726(1.0F);
							this.aClass6_Sub14_Sub1_1.method3726(1.0F);
							this.aClass6_Sub14_Sub1_1.method3726((float) local506 * local51 + local172);
							this.aClass6_Sub14_Sub1_1.method3726(local495 + (float) local506 * local55);
							this.aClass6_Sub14_Sub1_1.method3726((float) local506 * local59 + local501);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
							this.aClass6_Sub14_Sub1_1.method3726(0.0F);
							this.aClass6_Sub14_Sub1_1.method3726(1.0F);
							this.aClass6_Sub14_Sub1_1.method3726((float) local506 * local78 + local172);
							this.aClass6_Sub14_Sub1_1.method3726(local82 * (float) local506 + local495);
							this.aClass6_Sub14_Sub1_1.method3726((float) local506 * local91 + local501);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
						}
					}
				}
			}
		} else {
			for (local98 = arg0 - 1; local98 >= 0; local98--) {
				local115 = this.anIntArray183[local98] <= 64 ? this.anIntArray183[local98] : 64;
				if (local115 > 0) {
					for (local124 = local115 - 1; local124 >= 0; local124--) {
						local133 = this.aClass102_Sub1_Sub1ArrayArray2[local98][local124];
						local136 = local133.anInt2519;
						local141 = (byte) (local136 >> 16);
						local146 = (byte) (local136 >> 8);
						local149 = (byte) local136;
						local154 = (byte) (local136 >>> 24);
						local160 = local133.anInt2516 >> 12;
						local166 = local133.anInt2521 >> 12;
						local172 = local133.anInt2518 >> 12;
						local177 = local133.anInt2520 >> 12;
						this.aClass6_Sub14_Sub1_1.method3725(0.0F);
						this.aClass6_Sub14_Sub1_1.method3725(0.0F);
						this.aClass6_Sub14_Sub1_1.method3725(local160 + (float) -local177 * local51);
						this.aClass6_Sub14_Sub1_1.method3725((float) -local177 * local55 + local166);
						this.aClass6_Sub14_Sub1_1.method3725((float) -local177 * local59 + local172);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
						this.aClass6_Sub14_Sub1_1.method3725(1.0F);
						this.aClass6_Sub14_Sub1_1.method3725(0.0F);
						this.aClass6_Sub14_Sub1_1.method3725(local160 + local64 * (float) local177);
						this.aClass6_Sub14_Sub1_1.method3725(local166 + local68 * (float) local177);
						this.aClass6_Sub14_Sub1_1.method3725(local172 + (float) local177 * local73);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
						this.aClass6_Sub14_Sub1_1.method3725(1.0F);
						this.aClass6_Sub14_Sub1_1.method3725(1.0F);
						this.aClass6_Sub14_Sub1_1.method3725(local51 * (float) local177 + local160);
						this.aClass6_Sub14_Sub1_1.method3725(local55 * (float) local177 + local166);
						this.aClass6_Sub14_Sub1_1.method3725((float) local177 * local59 + local172);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
						this.aClass6_Sub14_Sub1_1.method3725(0.0F);
						this.aClass6_Sub14_Sub1_1.method3725(1.0F);
						this.aClass6_Sub14_Sub1_1.method3725(local160 + local78 * (float) local177);
						this.aClass6_Sub14_Sub1_1.method3725(local166 + local82 * (float) local177);
						this.aClass6_Sub14_Sub1_1.method3725(local91 * (float) local177 + local172);
						this.aClass6_Sub14_Sub1_1.method6035(local141);
						this.aClass6_Sub14_Sub1_1.method6035(local146);
						this.aClass6_Sub14_Sub1_1.method6035(local149);
						this.aClass6_Sub14_Sub1_1.method6035(local154);
					}
					if (this.anIntArray183[local98] > 64) {
						local446 = this.anIntArray183[local98] - 1 - 64;
						for (local136 = this.anIntArray182[local446] - 1; local136 >= 0; local136--) {
							local462 = this.aClass102_Sub1_Sub1ArrayArray1[local446][local136];
							local465 = local462.anInt2519;
							local149 = (byte) (local465 >> 16);
							local154 = (byte) (local465 >> 8);
							local478 = (byte) local465;
							local483 = (byte) (local465 >>> 24);
							local172 = local462.anInt2516 >> 12;
							local495 = local462.anInt2521 >> 12;
							local501 = local462.anInt2518 >> 12;
							local506 = local462.anInt2520 >> 12;
							this.aClass6_Sub14_Sub1_1.method3725(0.0F);
							this.aClass6_Sub14_Sub1_1.method3725(0.0F);
							this.aClass6_Sub14_Sub1_1.method3725((float) -local506 * local51 + local172);
							this.aClass6_Sub14_Sub1_1.method3725((float) -local506 * local55 + local495);
							this.aClass6_Sub14_Sub1_1.method3725(local59 * (float) -local506 + local501);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
							this.aClass6_Sub14_Sub1_1.method3725(1.0F);
							this.aClass6_Sub14_Sub1_1.method3725(0.0F);
							this.aClass6_Sub14_Sub1_1.method3725((float) local506 * local64 + local172);
							this.aClass6_Sub14_Sub1_1.method3725((float) local506 * local68 + local495);
							this.aClass6_Sub14_Sub1_1.method3725(local501 + local73 * (float) local506);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
							this.aClass6_Sub14_Sub1_1.method3725(1.0F);
							this.aClass6_Sub14_Sub1_1.method3725(1.0F);
							this.aClass6_Sub14_Sub1_1.method3725(local172 + (float) local506 * local51);
							this.aClass6_Sub14_Sub1_1.method3725(local495 + (float) local506 * local55);
							this.aClass6_Sub14_Sub1_1.method3725(local501 + (float) local506 * local59);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
							this.aClass6_Sub14_Sub1_1.method3725(0.0F);
							this.aClass6_Sub14_Sub1_1.method3725(1.0F);
							this.aClass6_Sub14_Sub1_1.method3725(local172 + (float) local506 * local78);
							this.aClass6_Sub14_Sub1_1.method3725(local82 * (float) local506 + local495);
							this.aClass6_Sub14_Sub1_1.method3725(local91 * (float) local506 + local501);
							this.aClass6_Sub14_Sub1_1.method6035(local149);
							this.aClass6_Sub14_Sub1_1.method6035(local154);
							this.aClass6_Sub14_Sub1_1.method6035(local478);
							this.aClass6_Sub14_Sub1_1.method6035(local483);
						}
					}
				}
			}
		}
		if (this.aClass6_Sub14_Sub1_1.anInt7244 != 0) {
			this.anInterface2_2.method6952(this.aClass6_Sub14_Sub1_1.anInt7244, this.aClass6_Sub14_Sub1_1.aByteArray88, 24);
			arg1.method5727(null, this.aClass53_3, this.aClass53_1, this.aClass53_2);
			arg1.method5667(this.aClass6_Sub14_Sub1_1.anInt7244 / 24);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!ob;Lclient!pea;B)V")
	public void method1495(@OriginalArg(0) Class222 arg0, @OriginalArg(1) Class121_Sub3 arg1) {
		if (arg1.aClass34_Sub2_4 == null) {
			return;
		}
		this.method1497(arg1);
		@Pc(17) float local17 = arg1.aClass34_Sub2_4.aFloat34;
		@Pc(28) float local28 = arg1.aClass34_Sub2_4.aFloat27;
		@Pc(32) float local32 = arg1.aClass34_Sub2_4.aFloat32;
		@Pc(36) float local36 = arg1.aClass34_Sub2_4.aFloat36;
		try {
			@Pc(41) int local41;
			@Pc(43) int local43;
			@Pc(49) Class102_Sub1 local49;
			@Pc(148) int local148;
			@Pc(296) Class102_Sub1_Sub1[] local296;
			@Pc(159) int local159;
			@Pc(304) int local304;
			@Pc(306) int local306;
			if (arg0.aBoolean423) {
				local41 = arg0.anInt6172 - arg0.anInt6171;
				if (local41 + 2 > 1600) {
					local43 = Static154.method2268(local41) + 1 - this.anInt1594;
					local41 = (local41 >> local43) + 2;
				} else {
					local41 += 2;
					local43 = 0;
				}
				@Pc(399) Class102_Sub1 local399 = arg0.aClass118_1.aClass102_Sub1_7;
				local49 = local399.aClass102_Sub1_9;
				@Pc(404) int local404 = -2;
				@Pc(406) boolean local406 = true;
				@Pc(408) boolean local408 = true;
				while (local399 != local49) {
					this.anInt1595 = 0;
					for (local148 = 0; local148 < local41; local148++) {
						this.anIntArray183[local148] = 0;
					}
					for (@Pc(428) int local428 = 0; local428 < 64; local428++) {
						this.anIntArray182[local428] = 0;
					}
					while (local399 != local49) {
						@Pc(444) Class102_Sub1_Sub1 local444 = (Class102_Sub1_Sub1) local49;
						if (local408) {
							local406 = local444.aBoolean171;
							local408 = false;
							local404 = local444.anInt2522;
						} else if (local404 != local444.anInt2522 || local406 != local444.aBoolean171) {
							local408 = true;
							break;
						}
						local159 = (int) (local36 + (float) (local444.anInt2521 >> 12) * local28 + local17 * (float) (local444.anInt2516 >> 12) + (float) (local444.anInt2518 >> 12) * local32) - arg0.anInt6171 >> local43;
						if (local159 < 1600) {
							if (this.anIntArray183[local159] < 64) {
								this.aClass102_Sub1_Sub1ArrayArray2[local159][this.anIntArray183[local159]++] = local444;
							} else {
								label137: {
									if (this.anIntArray183[local159] == 64) {
										if (this.anInt1595 == 64) {
											break label137;
										}
										this.anIntArray183[local159] += this.anInt1595++ + 1;
									}
									local296 = this.aClass102_Sub1_Sub1ArrayArray1[this.anIntArray183[local159] - 64 - 1];
									local304 = this.anIntArray183[local159] - 65;
									local306 = this.anIntArray182[this.anIntArray183[local159] - 65];
									this.anIntArray182[local304] = this.anIntArray182[this.anIntArray183[local159] - 65] + 1;
									local296[local306] = local444;
								}
							}
						}
						local49 = local49.aClass102_Sub1_9;
					}
					if (local404 >= 0) {
						arg1.method5690(local404);
					} else {
						arg1.method5690(-1);
					}
					if (local406 && arg1.aFloat150 != Static148.aFloat25) {
						arg1.ha(Static148.aFloat25);
					} else if (arg1.aFloat150 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method1493(local41, arg1);
				}
			} else {
				local41 = 0;
				local43 = Integer.MAX_VALUE;
				@Pc(45) int local45 = 0;
				local49 = arg0.aClass118_1.aClass102_Sub1_7;
				@Pc(52) Class102_Sub1 local52;
				@Pc(84) int local84;
				for (local52 = local49.aClass102_Sub1_9; local52 != local49; local52 = local52.aClass102_Sub1_9) {
					@Pc(57) Class102_Sub1_Sub1 local57 = (Class102_Sub1_Sub1) local52;
					local84 = (int) ((float) (local57.anInt2518 >> 12) * local32 + (float) (local57.anInt2516 >> 12) * local17 + local28 * (float) (local57.anInt2521 >> 12) + local36);
					this.anIntArray181[local41++] = local84;
					if (local84 > local45) {
						local45 = local84;
					}
					if (local43 > local84) {
						local43 = local84;
					}
				}
				@Pc(111) int local111 = local45 - local43;
				if (local111 + 2 > 1600) {
					local84 = Static154.method2268(local111) + 1 - this.anInt1594;
					local111 = (local111 >> local84) + 2;
				} else {
					local111 += 2;
					local84 = 0;
				}
				local52 = local49.aClass102_Sub1_9;
				local41 = 0;
				local148 = -2;
				@Pc(150) boolean local150 = true;
				@Pc(152) boolean local152 = true;
				while (local49 != local52) {
					this.anInt1595 = 0;
					for (local159 = 0; local159 < local111; local159++) {
						this.anIntArray183[local159] = 0;
					}
					for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
						this.anIntArray182[local172] = 0;
					}
					while (local49 != local52) {
						@Pc(188) Class102_Sub1_Sub1 local188 = (Class102_Sub1_Sub1) local52;
						if (local152) {
							local150 = local188.aBoolean171;
							local152 = false;
							local148 = local188.anInt2522;
						}
						if (local41 > 0 && (local148 != local188.anInt2522 || local188.aBoolean171 != local150)) {
							local152 = true;
							break;
						}
						@Pc(226) int local226 = this.anIntArray181[local41++] - local43 >> local84;
						if (local226 < 1600) {
							if (this.anIntArray183[local226] < 64) {
								this.aClass102_Sub1_Sub1ArrayArray2[local226][this.anIntArray183[local226]++] = local188;
							} else {
								label181: {
									if (this.anIntArray183[local226] == 64) {
										if (this.anInt1595 == 64) {
											break label181;
										}
										this.anIntArray183[local226] += this.anInt1595++ + 1;
									}
									local296 = this.aClass102_Sub1_Sub1ArrayArray1[this.anIntArray183[local226] - 65];
									local304 = this.anIntArray183[local226] - 65;
									local306 = this.anIntArray182[this.anIntArray183[local226] - 65];
									this.anIntArray182[local304] = this.anIntArray182[this.anIntArray183[local226] - 65] + 1;
									local296[local306] = local188;
								}
							}
						}
						local52 = local52.aClass102_Sub1_9;
					}
					if (local148 >= 0) {
						arg1.method5690(local148);
					} else {
						arg1.method5690(-1);
					}
					if (local150 && Static148.aFloat25 != arg1.aFloat150) {
						arg1.ha(Static148.aFloat25);
					} else if (arg1.aFloat150 != 1.0F) {
						arg1.ha(1.0F);
					}
					this.method1493(local111, arg1);
				}
			}
		} catch (@Pc(640) Exception local640) {
		}
		this.method1499(arg1);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!pea;)V")
	private void method1497(@OriginalArg(1) Class121_Sub3 arg0) {
		Static148.aFloat25 = arg0.aFloat150;
		arg0.method5693();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5665(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!pea;Z)V")
	private void method1499(@OriginalArg(0) Class121_Sub3 arg0) {
		arg0.method5665(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat150 != Static148.aFloat25) {
			arg0.ha(Static148.aFloat25);
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(ILclient!pea;)V")
	public void method1500(@OriginalArg(1) Class121_Sub3 arg0) {
		this.anInterface2_2 = arg0.method5654(true, null, 24, 196584);
		this.aClass53_3 = new Class53(this.anInterface2_2, 5126, 2, 0);
		this.aClass53_1 = new Class53(this.anInterface2_2, 5126, 3, 8);
		this.aClass53_2 = new Class53(this.anInterface2_2, 5121, 4, 20);
	}
}
