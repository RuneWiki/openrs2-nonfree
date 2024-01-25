import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class140 {

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!nn;")
	private Class179 aClass179_13;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Lclient!nn;")
	private Class179 aClass179_14;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!ig;")
	private Interface3 anInterface3_6;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!nn;")
	private Class179 aClass179_15;

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "[F")
	private final float[] aFloatArray21 = new float[16];

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "Lclient!ct;")
	private final Class1_Sub3_Sub2 aClass1_Sub3_Sub2_3 = new Class1_Sub3_Sub2(786336);

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private final int anInt4216 = Static256.method1622(1600);

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[[Lclient!ue;")
	private final Class41_Sub3_Sub2[][] aClass41_Sub3_Sub2ArrayArray1 = new Class41_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "[[Lclient!ue;")
	private final Class41_Sub3_Sub2[][] aClass41_Sub3_Sub2ArrayArray2 = new Class41_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	private int anInt4218 = 0;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "[I")
	private final int[] anIntArray402 = new int[8191];

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
	private final int[] anIntArray403 = new int[64];

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "[I")
	private final int[] anIntArray401 = new int[1600];

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!ih;Lclient!d;)V")
	public void method3259(@OriginalArg(1) Class106_Sub2 arg0, @OriginalArg(2) Class51 arg1) {
		if (arg0.aClass40_Sub2_4 == null) {
			return;
		}
		this.method3262(arg0);
		@Pc(23) float local23 = arg0.aClass40_Sub2_4.aFloat74;
		@Pc(27) float local27 = arg0.aClass40_Sub2_4.aFloat81;
		@Pc(31) float local31 = arg0.aClass40_Sub2_4.aFloat79;
		@Pc(35) float local35 = arg0.aClass40_Sub2_4.aFloat75;
		try {
			@Pc(44) int local44;
			@Pc(61) int local61;
			@Pc(79) Class41_Sub3 local79;
			@Pc(92) int local92;
			@Pc(253) Class41_Sub3_Sub2[] local253;
			@Pc(185) int local185;
			@Pc(263) int local263;
			@Pc(265) int local265;
			if (arg1.aBoolean116) {
				local44 = arg1.anInt1802 - arg1.anInt1803;
				if (local44 + 2 > 1600) {
					local61 = Static256.method1622(local44) + 1 - this.anInt4216;
					local44 = (local44 >> local61) + 2;
				} else {
					local44 += 2;
					local61 = 0;
				}
				@Pc(76) Class41_Sub3 local76 = arg1.aClass60_1.aClass41_Sub3_1;
				local79 = local76.aClass41_Sub3_9;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local76 != local79) {
					this.anInt4218 = 0;
					for (local92 = 0; local92 < local44; local92++) {
						this.anIntArray401[local92] = 0;
					}
					for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
						this.anIntArray403[local109] = 0;
					}
					while (local79 != local76) {
						@Pc(127) Class41_Sub3_Sub2 local127 = (Class41_Sub3_Sub2) local79;
						if (local85) {
							local81 = local127.anInt5609;
							local85 = false;
							local83 = local127.aBoolean348;
						} else if (local127.anInt5609 != local81 || local127.aBoolean348 != local83) {
							local85 = true;
							break;
						}
						local185 = (int) (local31 * (float) (local127.anInt5606 >> 12) + local27 * (float) (local127.anInt5610 >> 12) + (float) (local127.anInt5607 >> 12) * local23 + local35) - arg1.anInt1803 >> local61;
						if (local185 < 1600) {
							if (this.anIntArray401[local185] < 64) {
								this.aClass41_Sub3_Sub2ArrayArray2[local185][this.anIntArray401[local185]++] = local127;
							} else {
								label192: {
									if (this.anIntArray401[local185] == 64) {
										if (this.anInt4218 == 64) {
											break label192;
										}
										this.anIntArray401[local185] += this.anInt4218++ + 1;
									}
									local253 = this.aClass41_Sub3_Sub2ArrayArray1[this.anIntArray401[local185] - 64 - 1];
									local263 = this.anIntArray401[local185] - 64 - 1;
									local265 = this.anIntArray403[this.anIntArray401[local185] - 64 - 1];
									this.anIntArray403[local263] = this.anIntArray403[this.anIntArray401[local185] - 64 - 1] + 1;
									local253[local265] = local127;
								}
							}
						}
						local79 = local79.aClass41_Sub3_9;
					}
					if (local81 < 0) {
						arg0.method2912(null);
					} else {
						arg0.method2912(arg0.aClass107_1.method2628(local81));
						arg0.method2851(arg0.anInterface7_10.method78(local81).anInt4425);
					}
					if (local83 && arg0.aFloat56 != Static7.aFloat1) {
						arg0.JA(Static7.aFloat1);
					} else if (arg0.aFloat56 != 1.0F) {
						arg0.JA(1.0F);
					}
					this.method3263(local44, arg0);
				}
			} else {
				local44 = 0;
				local61 = Integer.MAX_VALUE;
				@Pc(343) int local343 = 0;
				local79 = arg1.aClass60_1.aClass41_Sub3_1;
				@Pc(350) Class41_Sub3 local350;
				@Pc(382) int local382;
				for (local350 = local79.aClass41_Sub3_9; local350 != local79; local350 = local350.aClass41_Sub3_9) {
					@Pc(355) Class41_Sub3_Sub2 local355 = (Class41_Sub3_Sub2) local350;
					local382 = (int) (local35 + local23 * (float) (local355.anInt5607 >> 12) + local27 * (float) (local355.anInt5610 >> 12) + local31 * (float) (local355.anInt5606 >> 12));
					this.anIntArray402[local44++] = local382;
					if (local382 > local343) {
						local343 = local382;
					}
					if (local382 < local61) {
						local61 = local382;
					}
				}
				@Pc(413) int local413 = local343 - local61;
				if (local413 + 2 > 1600) {
					local382 = Static256.method1622(local413) + 1 - this.anInt4216;
					local413 = (local413 >> local382) + 2;
				} else {
					local413 += 2;
					local382 = 0;
				}
				local44 = 0;
				local350 = local79.aClass41_Sub3_9;
				local92 = -2;
				@Pc(451) boolean local451 = true;
				@Pc(453) boolean local453 = true;
				while (local79 != local350) {
					this.anInt4218 = 0;
					for (local185 = 0; local185 < local413; local185++) {
						this.anIntArray401[local185] = 0;
					}
					for (@Pc(473) int local473 = 0; local473 < 64; local473++) {
						this.anIntArray403[local473] = 0;
					}
					while (local350 != local79) {
						@Pc(489) Class41_Sub3_Sub2 local489 = (Class41_Sub3_Sub2) local350;
						if (local453) {
							local453 = false;
							local451 = local489.aBoolean348;
							local92 = local489.anInt5609;
						}
						if (local44 > 0 && (local92 != local489.anInt5609 || local489.aBoolean348 != local451)) {
							local453 = true;
							break;
						}
						@Pc(534) int local534 = this.anIntArray402[local44++] - local61 >> local382;
						if (local534 < 1600) {
							if (this.anIntArray401[local534] >= 64) {
								label142: {
									if (this.anIntArray401[local534] == 64) {
										if (this.anInt4218 == 64) {
											break label142;
										}
										this.anIntArray401[local534] += this.anInt4218++ + 1;
									}
									local253 = this.aClass41_Sub3_Sub2ArrayArray1[this.anIntArray401[local534] - 64 - 1];
									local263 = this.anIntArray401[local534] - 65;
									local265 = this.anIntArray403[this.anIntArray401[local534] - 65];
									this.anIntArray403[local263] = this.anIntArray403[this.anIntArray401[local534] - 65] + 1;
									local253[local265] = local489;
								}
							} else {
								this.aClass41_Sub3_Sub2ArrayArray2[local534][this.anIntArray401[local534]++] = local489;
							}
						}
						local350 = local350.aClass41_Sub3_9;
					}
					if (local92 >= 0) {
						arg0.method2912(arg0.aClass107_1.method2628(local92));
						arg0.method2851(arg0.anInterface7_10.method78(local92).anInt4425);
					} else {
						arg0.method2912(null);
					}
					if (local451 && arg0.aFloat56 != Static7.aFloat1) {
						arg0.JA(Static7.aFloat1);
					} else if (arg0.aFloat56 != 1.0F) {
						arg0.JA(1.0F);
					}
					this.method3263(local413, arg0);
				}
			}
		} catch (@Pc(684) Exception local684) {
		}
		this.method3265(arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ih;I)V")
	private void method3262(@OriginalArg(0) Class106_Sub2 arg0) {
		Static7.aFloat1 = arg0.aFloat56;
		arg0.method2886();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2914(false);
		arg0.method2904(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ih;I)V")
	private void method3263(@OriginalArg(0) int arg0, @OriginalArg(1) Class106_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray21, 0);
		@Pc(15) float local15 = this.aFloatArray21[0];
		@Pc(20) float local20 = this.aFloatArray21[4];
		@Pc(25) float local25 = this.aFloatArray21[8];
		@Pc(30) float local30 = this.aFloatArray21[1];
		@Pc(35) float local35 = this.aFloatArray21[5];
		@Pc(40) float local40 = this.aFloatArray21[9];
		@Pc(49) float local49 = local30 + local15;
		@Pc(53) float local53 = local20 + local35;
		@Pc(57) float local57 = local40 + local25;
		@Pc(61) float local61 = local15 - local30;
		@Pc(65) float local65 = local20 - local35;
		@Pc(69) float local69 = local25 - local40;
		@Pc(74) float local74 = local30 - local15;
		@Pc(78) float local78 = local35 - local20;
		@Pc(82) float local82 = local40 - local25;
		this.aClass1_Sub3_Sub2_3.anInt1710 = 0;
		@Pc(93) int local93;
		@Pc(108) int local108;
		@Pc(117) int local117;
		@Pc(126) Class41_Sub3_Sub2 local126;
		@Pc(129) int local129;
		@Pc(134) byte local134;
		@Pc(139) byte local139;
		@Pc(142) byte local142;
		@Pc(147) byte local147;
		@Pc(153) float local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(170) int local170;
		@Pc(498) float local498;
		@Pc(503) int local503;
		@Pc(443) int local443;
		@Pc(459) Class41_Sub3_Sub2 local459;
		@Pc(462) int local462;
		@Pc(475) byte local475;
		@Pc(480) byte local480;
		@Pc(492) float local492;
		if (arg1.aBoolean227) {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray401[local93] <= 64 ? this.anIntArray401[local93] : 64;
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass41_Sub3_Sub2ArrayArray2[local93][local117];
						local129 = local126.anInt5608;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt5607 >> 12;
						local159 = local126.anInt5610 >> 12;
						local165 = local126.anInt5606 >> 12;
						local170 = local126.anInt5605 >> 12;
						this.aClass1_Sub3_Sub2_3.method1228(0.0F);
						this.aClass1_Sub3_Sub2_3.method1228(0.0F);
						this.aClass1_Sub3_Sub2_3.method1228((float) -local170 * local49 + local153);
						this.aClass1_Sub3_Sub2_3.method1228(local159 + (float) -local170 * local53);
						this.aClass1_Sub3_Sub2_3.method1228(local165 + local57 * (float) -local170);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
						this.aClass1_Sub3_Sub2_3.method1228(1.0F);
						this.aClass1_Sub3_Sub2_3.method1228(0.0F);
						this.aClass1_Sub3_Sub2_3.method1228(local61 * (float) local170 + local153);
						this.aClass1_Sub3_Sub2_3.method1228(local159 + (float) local170 * local65);
						this.aClass1_Sub3_Sub2_3.method1228(local69 * (float) local170 + local165);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
						this.aClass1_Sub3_Sub2_3.method1228(1.0F);
						this.aClass1_Sub3_Sub2_3.method1228(1.0F);
						this.aClass1_Sub3_Sub2_3.method1228((float) local170 * local49 + local153);
						this.aClass1_Sub3_Sub2_3.method1228((float) local170 * local53 + local159);
						this.aClass1_Sub3_Sub2_3.method1228(local57 * (float) local170 + local165);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
						this.aClass1_Sub3_Sub2_3.method1228(0.0F);
						this.aClass1_Sub3_Sub2_3.method1228(1.0F);
						this.aClass1_Sub3_Sub2_3.method1228(local153 + (float) local170 * local74);
						this.aClass1_Sub3_Sub2_3.method1228((float) local170 * local78 + local159);
						this.aClass1_Sub3_Sub2_3.method1228(local165 + local82 * (float) local170);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
					}
					if (this.anIntArray401[local93] > 64) {
						local443 = this.anIntArray401[local93] - 64 - 1;
						for (local129 = this.anIntArray403[local443] - 1; local129 >= 0; local129--) {
							local459 = this.aClass41_Sub3_Sub2ArrayArray1[local443][local129];
							local462 = local459.anInt5608;
							local142 = (byte) (local462 >> 16);
							local147 = (byte) (local462 >> 8);
							local475 = (byte) local462;
							local480 = (byte) (local462 >>> 24);
							local165 = local459.anInt5607 >> 12;
							local492 = local459.anInt5610 >> 12;
							local498 = local459.anInt5606 >> 12;
							local503 = local459.anInt5605 >> 12;
							this.aClass1_Sub3_Sub2_3.method1228(0.0F);
							this.aClass1_Sub3_Sub2_3.method1228(0.0F);
							this.aClass1_Sub3_Sub2_3.method1228((float) -local503 * local49 + local165);
							this.aClass1_Sub3_Sub2_3.method1228(local492 + local53 * (float) -local503);
							this.aClass1_Sub3_Sub2_3.method1228(local498 + (float) -local503 * local57);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
							this.aClass1_Sub3_Sub2_3.method1228(1.0F);
							this.aClass1_Sub3_Sub2_3.method1228(0.0F);
							this.aClass1_Sub3_Sub2_3.method1228(local165 + (float) local503 * local61);
							this.aClass1_Sub3_Sub2_3.method1228((float) local503 * local65 + local492);
							this.aClass1_Sub3_Sub2_3.method1228(local498 + local69 * (float) local503);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
							this.aClass1_Sub3_Sub2_3.method1228(1.0F);
							this.aClass1_Sub3_Sub2_3.method1228(1.0F);
							this.aClass1_Sub3_Sub2_3.method1228(local165 + (float) local503 * local49);
							this.aClass1_Sub3_Sub2_3.method1228(local492 + (float) local503 * local53);
							this.aClass1_Sub3_Sub2_3.method1228(local498 + (float) local503 * local57);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
							this.aClass1_Sub3_Sub2_3.method1228(0.0F);
							this.aClass1_Sub3_Sub2_3.method1228(1.0F);
							this.aClass1_Sub3_Sub2_3.method1228(local74 * (float) local503 + local165);
							this.aClass1_Sub3_Sub2_3.method1228(local492 + (float) local503 * local78);
							this.aClass1_Sub3_Sub2_3.method1228(local498 + (float) local503 * local82);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
						}
					}
				}
			}
		} else {
			for (local93 = arg0 - 1; local93 >= 0; local93--) {
				local108 = this.anIntArray401[local93] > 64 ? 64 : this.anIntArray401[local93];
				if (local108 > 0) {
					for (local117 = local108 - 1; local117 >= 0; local117--) {
						local126 = this.aClass41_Sub3_Sub2ArrayArray2[local93][local117];
						local129 = local126.anInt5608;
						local134 = (byte) (local129 >> 16);
						local139 = (byte) (local129 >> 8);
						local142 = (byte) local129;
						local147 = (byte) (local129 >>> 24);
						local153 = local126.anInt5607 >> 12;
						local159 = local126.anInt5610 >> 12;
						local165 = local126.anInt5606 >> 12;
						local170 = local126.anInt5605 >> 12;
						this.aClass1_Sub3_Sub2_3.method1232(0.0F);
						this.aClass1_Sub3_Sub2_3.method1232(0.0F);
						this.aClass1_Sub3_Sub2_3.method1232((float) -local170 * local49 + local153);
						this.aClass1_Sub3_Sub2_3.method1232((float) -local170 * local53 + local159);
						this.aClass1_Sub3_Sub2_3.method1232(local165 + (float) -local170 * local57);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
						this.aClass1_Sub3_Sub2_3.method1232(1.0F);
						this.aClass1_Sub3_Sub2_3.method1232(0.0F);
						this.aClass1_Sub3_Sub2_3.method1232((float) local170 * local61 + local153);
						this.aClass1_Sub3_Sub2_3.method1232((float) local170 * local65 + local159);
						this.aClass1_Sub3_Sub2_3.method1232(local165 + local69 * (float) local170);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
						this.aClass1_Sub3_Sub2_3.method1232(1.0F);
						this.aClass1_Sub3_Sub2_3.method1232(1.0F);
						this.aClass1_Sub3_Sub2_3.method1232(local153 + (float) local170 * local49);
						this.aClass1_Sub3_Sub2_3.method1232(local159 + (float) local170 * local53);
						this.aClass1_Sub3_Sub2_3.method1232(local57 * (float) local170 + local165);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
						this.aClass1_Sub3_Sub2_3.method1232(0.0F);
						this.aClass1_Sub3_Sub2_3.method1232(1.0F);
						this.aClass1_Sub3_Sub2_3.method1232(local74 * (float) local170 + local153);
						this.aClass1_Sub3_Sub2_3.method1232(local159 + (float) local170 * local78);
						this.aClass1_Sub3_Sub2_3.method1232(local165 + local82 * (float) local170);
						this.aClass1_Sub3_Sub2_3.method1208(local134);
						this.aClass1_Sub3_Sub2_3.method1208(local139);
						this.aClass1_Sub3_Sub2_3.method1208(local142);
						this.aClass1_Sub3_Sub2_3.method1208(local147);
					}
					if (this.anIntArray401[local93] > 64) {
						local443 = this.anIntArray401[local93] - 1 - 64;
						for (local129 = this.anIntArray403[local443] - 1; local129 >= 0; local129--) {
							local459 = this.aClass41_Sub3_Sub2ArrayArray1[local443][local129];
							local462 = local459.anInt5608;
							local142 = (byte) (local462 >> 16);
							local147 = (byte) (local462 >> 8);
							local475 = (byte) local462;
							local480 = (byte) (local462 >>> 24);
							local165 = local459.anInt5607 >> 12;
							local492 = local459.anInt5610 >> 12;
							local498 = local459.anInt5606 >> 12;
							local503 = local459.anInt5605 >> 12;
							this.aClass1_Sub3_Sub2_3.method1232(0.0F);
							this.aClass1_Sub3_Sub2_3.method1232(0.0F);
							this.aClass1_Sub3_Sub2_3.method1232(local165 + (float) -local503 * local49);
							this.aClass1_Sub3_Sub2_3.method1232(local492 + local53 * (float) -local503);
							this.aClass1_Sub3_Sub2_3.method1232(local57 * (float) -local503 + local498);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
							this.aClass1_Sub3_Sub2_3.method1232(1.0F);
							this.aClass1_Sub3_Sub2_3.method1232(0.0F);
							this.aClass1_Sub3_Sub2_3.method1232(local61 * (float) local503 + local165);
							this.aClass1_Sub3_Sub2_3.method1232(local492 + (float) local503 * local65);
							this.aClass1_Sub3_Sub2_3.method1232((float) local503 * local69 + local498);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
							this.aClass1_Sub3_Sub2_3.method1232(1.0F);
							this.aClass1_Sub3_Sub2_3.method1232(1.0F);
							this.aClass1_Sub3_Sub2_3.method1232((float) local503 * local49 + local165);
							this.aClass1_Sub3_Sub2_3.method1232(local492 + local53 * (float) local503);
							this.aClass1_Sub3_Sub2_3.method1232(local498 + (float) local503 * local57);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
							this.aClass1_Sub3_Sub2_3.method1232(0.0F);
							this.aClass1_Sub3_Sub2_3.method1232(1.0F);
							this.aClass1_Sub3_Sub2_3.method1232(local74 * (float) local503 + local165);
							this.aClass1_Sub3_Sub2_3.method1232((float) local503 * local78 + local492);
							this.aClass1_Sub3_Sub2_3.method1232(local498 + (float) local503 * local82);
							this.aClass1_Sub3_Sub2_3.method1208(local142);
							this.aClass1_Sub3_Sub2_3.method1208(local147);
							this.aClass1_Sub3_Sub2_3.method1208(local475);
							this.aClass1_Sub3_Sub2_3.method1208(local480);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub3_Sub2_3.anInt1710 != 0) {
			this.anInterface3_6.method5206(this.aClass1_Sub3_Sub2_3.aByteArray14, this.aClass1_Sub3_Sub2_3.anInt1710, 24);
			arg1.method2847(this.aClass179_15, null, this.aClass179_14, this.aClass179_13);
			arg1.method2874(this.aClass1_Sub3_Sub2_3.anInt1710 / 24);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!ih;)V")
	private void method3265(@OriginalArg(1) Class106_Sub2 arg0) {
		arg0.method2914(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat56 != Static7.aFloat1) {
			arg0.JA(Static7.aFloat1);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ih;Z)V")
	public void method3267(@OriginalArg(0) Class106_Sub2 arg0) {
		this.anInterface3_6 = arg0.method2883(true, 196584, null, 24);
		this.aClass179_15 = new Class179(this.anInterface3_6, 5126, 2, 0);
		this.aClass179_13 = new Class179(this.anInterface3_6, 5126, 3, 8);
		this.aClass179_14 = new Class179(this.anInterface3_6, 5121, 4, 20);
	}
}
