import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class171 {

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "Lclient!og;")
	private Class190 aClass190_5;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!lc;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "Lclient!og;")
	private Class190 aClass190_6;

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "Lclient!og;")
	private Class190 aClass190_7;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "[F")
	private final float[] aFloatArray12 = new float[16];

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Lclient!dd;")
	private final Class4_Sub9_Sub1 aClass4_Sub9_Sub1_1 = new Class4_Sub9_Sub1(786336);

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	private final int anInt4065 = Static281.method3698(1600);

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
	private final int[] anIntArray340 = new int[1600];

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "[[Lclient!bd;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray2 = new Class20_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "[[Lclient!bd;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray1 = new Class20_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
	private int anInt4067 = 0;

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
	private final int[] anIntArray341 = new int[8191];

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "[I")
	private final int[] anIntArray342 = new int[64];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ug;Z)V")
	private void method3232(@OriginalArg(0) Class135_Sub2 arg0) {
		Static457.aFloat103 = arg0.aFloat92;
		arg0.method5470();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5473(false);
		arg0.method5485(-2);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ug;I)V")
	public void method3233(@OriginalArg(0) Class135_Sub2 arg0) {
		this.anInterface9_2 = arg0.method5405(true, 196584, 24, null);
		this.aClass190_6 = new Class190(this.anInterface9_2, 5126, 2, 0);
		this.aClass190_5 = new Class190(this.anInterface9_2, 5126, 3, 8);
		this.aClass190_7 = new Class190(this.anInterface9_2, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Lclient!ug;I)V")
	private void method3234(@OriginalArg(0) Class135_Sub2 arg0) {
		arg0.method5473(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat92 != Static457.aFloat103) {
			arg0.B(Static457.aFloat103);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ug;II)V")
	private void method3235(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray12, 0);
		@Pc(15) float local15 = this.aFloatArray12[0];
		@Pc(20) float local20 = this.aFloatArray12[4];
		@Pc(25) float local25 = this.aFloatArray12[8];
		@Pc(30) float local30 = this.aFloatArray12[1];
		@Pc(35) float local35 = this.aFloatArray12[5];
		@Pc(40) float local40 = this.aFloatArray12[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(71) float local71 = local30 - local15;
		@Pc(76) float local76 = local35 - local20;
		this.aClass4_Sub9_Sub1_1.anInt6207 = 0;
		@Pc(84) float local84 = local40 - local25;
		@Pc(91) int local91;
		@Pc(106) int local106;
		@Pc(115) int local115;
		@Pc(124) Class20_Sub1_Sub1 local124;
		@Pc(127) int local127;
		@Pc(132) byte local132;
		@Pc(137) byte local137;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(151) float local151;
		@Pc(157) float local157;
		@Pc(163) float local163;
		@Pc(168) int local168;
		@Pc(494) float local494;
		@Pc(499) int local499;
		@Pc(439) int local439;
		@Pc(455) Class20_Sub1_Sub1 local455;
		@Pc(458) int local458;
		@Pc(471) byte local471;
		@Pc(476) byte local476;
		@Pc(488) float local488;
		if (arg0.aBoolean474) {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local106 = this.anIntArray340[local91] > 64 ? 64 : this.anIntArray340[local91];
				if (local106 > 0) {
					for (local115 = local106 - 1; local115 >= 0; local115--) {
						local124 = this.aClass20_Sub1_Sub1ArrayArray2[local91][local115];
						local127 = local124.anInt628;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt633 >> Static453.anInt7580;
						local157 = local124.anInt632 >> Static453.anInt7580;
						local163 = local124.anInt629 >> Static453.anInt7580;
						local168 = local124.anInt631 >> Static453.anInt7580;
						this.aClass4_Sub9_Sub1_1.method1085(0.0F);
						this.aClass4_Sub9_Sub1_1.method1085(0.0F);
						this.aClass4_Sub9_Sub1_1.method1085(local151 + local44 * (float) -local168);
						this.aClass4_Sub9_Sub1_1.method1085(local48 * (float) -local168 + local157);
						this.aClass4_Sub9_Sub1_1.method1085(local163 + local52 * (float) -local168);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
						this.aClass4_Sub9_Sub1_1.method1085(1.0F);
						this.aClass4_Sub9_Sub1_1.method1085(0.0F);
						this.aClass4_Sub9_Sub1_1.method1085(local151 + local56 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method1085(local157 + (float) local168 * local61);
						this.aClass4_Sub9_Sub1_1.method1085((float) local168 * local66 + local163);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
						this.aClass4_Sub9_Sub1_1.method1085(1.0F);
						this.aClass4_Sub9_Sub1_1.method1085(1.0F);
						this.aClass4_Sub9_Sub1_1.method1085(local151 + local44 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method1085((float) local168 * local48 + local157);
						this.aClass4_Sub9_Sub1_1.method1085(local163 + local52 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
						this.aClass4_Sub9_Sub1_1.method1085(0.0F);
						this.aClass4_Sub9_Sub1_1.method1085(1.0F);
						this.aClass4_Sub9_Sub1_1.method1085((float) local168 * local71 + local151);
						this.aClass4_Sub9_Sub1_1.method1085((float) local168 * local76 + local157);
						this.aClass4_Sub9_Sub1_1.method1085(local163 + local84 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
					}
					if (this.anIntArray340[local91] > 64) {
						local439 = this.anIntArray340[local91] - 64 - 1;
						for (local127 = this.anIntArray342[local439] - 1; local127 >= 0; local127--) {
							local455 = this.aClass20_Sub1_Sub1ArrayArray1[local439][local127];
							local458 = local455.anInt628;
							local140 = (byte) (local458 >> 16);
							local145 = (byte) (local458 >> 8);
							local471 = (byte) local458;
							local476 = (byte) (local458 >>> 24);
							local163 = local455.anInt633 >> Static453.anInt7580;
							local488 = local455.anInt632 >> Static453.anInt7580;
							local494 = local455.anInt629 >> Static453.anInt7580;
							local499 = local455.anInt631 >> Static453.anInt7580;
							this.aClass4_Sub9_Sub1_1.method1085(0.0F);
							this.aClass4_Sub9_Sub1_1.method1085(0.0F);
							this.aClass4_Sub9_Sub1_1.method1085(local44 * (float) -local499 + local163);
							this.aClass4_Sub9_Sub1_1.method1085(local488 + (float) -local499 * local48);
							this.aClass4_Sub9_Sub1_1.method1085((float) -local499 * local52 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
							this.aClass4_Sub9_Sub1_1.method1085(1.0F);
							this.aClass4_Sub9_Sub1_1.method1085(0.0F);
							this.aClass4_Sub9_Sub1_1.method1085(local163 + (float) local499 * local56);
							this.aClass4_Sub9_Sub1_1.method1085(local61 * (float) local499 + local488);
							this.aClass4_Sub9_Sub1_1.method1085(local66 * (float) local499 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
							this.aClass4_Sub9_Sub1_1.method1085(1.0F);
							this.aClass4_Sub9_Sub1_1.method1085(1.0F);
							this.aClass4_Sub9_Sub1_1.method1085(local44 * (float) local499 + local163);
							this.aClass4_Sub9_Sub1_1.method1085(local48 * (float) local499 + local488);
							this.aClass4_Sub9_Sub1_1.method1085(local52 * (float) local499 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
							this.aClass4_Sub9_Sub1_1.method1085(0.0F);
							this.aClass4_Sub9_Sub1_1.method1085(1.0F);
							this.aClass4_Sub9_Sub1_1.method1085((float) local499 * local71 + local163);
							this.aClass4_Sub9_Sub1_1.method1085(local488 + (float) local499 * local76);
							this.aClass4_Sub9_Sub1_1.method1085((float) local499 * local84 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
						}
					}
				}
			}
		} else {
			for (local91 = arg1 - 1; local91 >= 0; local91--) {
				local106 = this.anIntArray340[local91] > 64 ? 64 : this.anIntArray340[local91];
				if (local106 > 0) {
					for (local115 = local106 - 1; local115 >= 0; local115--) {
						local124 = this.aClass20_Sub1_Sub1ArrayArray2[local91][local115];
						local127 = local124.anInt628;
						local132 = (byte) (local127 >> 16);
						local137 = (byte) (local127 >> 8);
						local140 = (byte) local127;
						local145 = (byte) (local127 >>> 24);
						local151 = local124.anInt633 >> Static453.anInt7580;
						local157 = local124.anInt632 >> Static453.anInt7580;
						local163 = local124.anInt629 >> Static453.anInt7580;
						local168 = local124.anInt631 >> Static453.anInt7580;
						this.aClass4_Sub9_Sub1_1.method1084(0.0F);
						this.aClass4_Sub9_Sub1_1.method1084(0.0F);
						this.aClass4_Sub9_Sub1_1.method1084(local44 * (float) -local168 + local151);
						this.aClass4_Sub9_Sub1_1.method1084(local157 + local48 * (float) -local168);
						this.aClass4_Sub9_Sub1_1.method1084(local52 * (float) -local168 + local163);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
						this.aClass4_Sub9_Sub1_1.method1084(1.0F);
						this.aClass4_Sub9_Sub1_1.method1084(0.0F);
						this.aClass4_Sub9_Sub1_1.method1084(local151 + (float) local168 * local56);
						this.aClass4_Sub9_Sub1_1.method1084(local61 * (float) local168 + local157);
						this.aClass4_Sub9_Sub1_1.method1084((float) local168 * local66 + local163);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
						this.aClass4_Sub9_Sub1_1.method1084(1.0F);
						this.aClass4_Sub9_Sub1_1.method1084(1.0F);
						this.aClass4_Sub9_Sub1_1.method1084(local151 + local44 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method1084(local157 + (float) local168 * local48);
						this.aClass4_Sub9_Sub1_1.method1084(local52 * (float) local168 + local163);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
						this.aClass4_Sub9_Sub1_1.method1084(0.0F);
						this.aClass4_Sub9_Sub1_1.method1084(1.0F);
						this.aClass4_Sub9_Sub1_1.method1084(local151 + local71 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method1084((float) local168 * local76 + local157);
						this.aClass4_Sub9_Sub1_1.method1084(local163 + local84 * (float) local168);
						this.aClass4_Sub9_Sub1_1.method4999(local132);
						this.aClass4_Sub9_Sub1_1.method4999(local137);
						this.aClass4_Sub9_Sub1_1.method4999(local140);
						this.aClass4_Sub9_Sub1_1.method4999(local145);
					}
					if (this.anIntArray340[local91] > 64) {
						local439 = this.anIntArray340[local91] - 65;
						for (local127 = this.anIntArray342[local439] - 1; local127 >= 0; local127--) {
							local455 = this.aClass20_Sub1_Sub1ArrayArray1[local439][local127];
							local458 = local455.anInt628;
							local140 = (byte) (local458 >> 16);
							local145 = (byte) (local458 >> 8);
							local471 = (byte) local458;
							local476 = (byte) (local458 >>> 24);
							local163 = local455.anInt633 >> Static453.anInt7580;
							local488 = local455.anInt632 >> Static453.anInt7580;
							local494 = local455.anInt629 >> Static453.anInt7580;
							local499 = local455.anInt631 >> Static453.anInt7580;
							this.aClass4_Sub9_Sub1_1.method1084(0.0F);
							this.aClass4_Sub9_Sub1_1.method1084(0.0F);
							this.aClass4_Sub9_Sub1_1.method1084((float) -local499 * local44 + local163);
							this.aClass4_Sub9_Sub1_1.method1084(local48 * (float) -local499 + local488);
							this.aClass4_Sub9_Sub1_1.method1084(local494 + local52 * (float) -local499);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
							this.aClass4_Sub9_Sub1_1.method1084(1.0F);
							this.aClass4_Sub9_Sub1_1.method1084(0.0F);
							this.aClass4_Sub9_Sub1_1.method1084(local163 + (float) local499 * local56);
							this.aClass4_Sub9_Sub1_1.method1084(local488 + (float) local499 * local61);
							this.aClass4_Sub9_Sub1_1.method1084((float) local499 * local66 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
							this.aClass4_Sub9_Sub1_1.method1084(1.0F);
							this.aClass4_Sub9_Sub1_1.method1084(1.0F);
							this.aClass4_Sub9_Sub1_1.method1084((float) local499 * local44 + local163);
							this.aClass4_Sub9_Sub1_1.method1084((float) local499 * local48 + local488);
							this.aClass4_Sub9_Sub1_1.method1084((float) local499 * local52 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
							this.aClass4_Sub9_Sub1_1.method1084(0.0F);
							this.aClass4_Sub9_Sub1_1.method1084(1.0F);
							this.aClass4_Sub9_Sub1_1.method1084((float) local499 * local71 + local163);
							this.aClass4_Sub9_Sub1_1.method1084(local76 * (float) local499 + local488);
							this.aClass4_Sub9_Sub1_1.method1084((float) local499 * local84 + local494);
							this.aClass4_Sub9_Sub1_1.method4999(local140);
							this.aClass4_Sub9_Sub1_1.method4999(local145);
							this.aClass4_Sub9_Sub1_1.method4999(local471);
							this.aClass4_Sub9_Sub1_1.method4999(local476);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub9_Sub1_1.anInt6207 != 0) {
			this.anInterface9_2.method2936(this.aClass4_Sub9_Sub1_1.aByteArray81, 24, this.aClass4_Sub9_Sub1_1.anInt6207);
			arg0.method5431(this.aClass190_6, this.aClass190_5, this.aClass190_7, null);
			arg0.method5452(this.aClass4_Sub9_Sub1_1.anInt6207 / 24);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ug;BLclient!fm;)V")
	public void method3237(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(2) Class83 arg1) {
		if (arg0.aClass35_Sub2_4 == null) {
			return;
		}
		this.method3232(arg0);
		@Pc(17) float local17 = arg0.aClass35_Sub2_4.aFloat41;
		@Pc(25) float local25 = arg0.aClass35_Sub2_4.aFloat39;
		@Pc(29) float local29 = arg0.aClass35_Sub2_4.aFloat33;
		@Pc(33) float local33 = arg0.aClass35_Sub2_4.aFloat35;
		try {
			@Pc(42) int local42;
			@Pc(61) int local61;
			@Pc(79) Class20_Sub1 local79;
			@Pc(92) int local92;
			@Pc(237) Class20_Sub1_Sub1[] local237;
			@Pc(185) int local185;
			@Pc(247) int local247;
			@Pc(249) int local249;
			if (arg1.aBoolean146) {
				local42 = arg1.anInt2110 - arg1.anInt2111;
				if (local42 + 2 > 1600) {
					local61 = Static281.method3698(local42) + 1 - this.anInt4065;
					local42 = (local42 >> local61) + 2;
				} else {
					local61 = 0;
					local42 += 2;
				}
				@Pc(76) Class20_Sub1 local76 = arg1.aClass203_1.aClass20_Sub1_7;
				local79 = local76.aClass20_Sub1_5;
				@Pc(81) int local81 = -2;
				@Pc(83) boolean local83 = true;
				@Pc(85) boolean local85 = true;
				while (local79 != local76) {
					this.anInt4067 = 0;
					for (local92 = 0; local92 < local42; local92++) {
						this.anIntArray340[local92] = 0;
					}
					for (@Pc(109) int local109 = 0; local109 < 64; local109++) {
						this.anIntArray342[local109] = 0;
					}
					while (local79 != local76) {
						@Pc(127) Class20_Sub1_Sub1 local127 = (Class20_Sub1_Sub1) local79;
						if (local85) {
							local81 = local127.anInt630;
							local85 = false;
							local83 = local127.aBoolean36;
						} else if (local81 != local127.anInt630 || local83 != local127.aBoolean36) {
							local85 = true;
							break;
						}
						local185 = (int) ((float) (local127.anInt633 >> Static453.anInt7580) * local17 + local25 * (float) (local127.anInt632 >> Static453.anInt7580) + (float) (local127.anInt629 >> Static453.anInt7580) * local29 + local33) - arg1.anInt2111 >> local61;
						if (local185 < 1600) {
							if (this.anIntArray340[local185] >= 64) {
								label188: {
									if (this.anIntArray340[local185] == 64) {
										if (this.anInt4067 == 64) {
											break label188;
										}
										this.anIntArray340[local185] += this.anInt4067++ + 1;
									}
									local237 = this.aClass20_Sub1_Sub1ArrayArray1[this.anIntArray340[local185] - 1 - 64];
									local247 = this.anIntArray340[local185] - 1 - 64;
									local249 = this.anIntArray342[this.anIntArray340[local185] - 1 - 64];
									this.anIntArray342[local247] = this.anIntArray342[this.anIntArray340[local185] - 1 - 64] + 1;
									local237[local249] = local127;
								}
							} else {
								this.aClass20_Sub1_Sub1ArrayArray2[local185][this.anIntArray340[local185]++] = local127;
							}
						}
						local79 = local79.aClass20_Sub1_5;
					}
					if (local81 >= 0) {
						arg0.method5458(arg0.aClass265_1.method5928(local81));
						arg0.method5441(arg0.anInterface5_7.method4079(local81).anInt2731);
					} else {
						arg0.method5458(null);
					}
					if (local83 && arg0.aFloat92 != Static457.aFloat103) {
						arg0.B(Static457.aFloat103);
					} else if (arg0.aFloat92 != 1.0F) {
						arg0.B(1.0F);
					}
					this.method3235(arg0, local42);
				}
			} else {
				local42 = 0;
				local61 = Integer.MAX_VALUE;
				@Pc(342) int local342 = 0;
				local79 = arg1.aClass203_1.aClass20_Sub1_7;
				@Pc(349) Class20_Sub1 local349;
				@Pc(381) int local381;
				for (local349 = local79.aClass20_Sub1_5; local349 != local79; local349 = local349.aClass20_Sub1_5) {
					@Pc(354) Class20_Sub1_Sub1 local354 = (Class20_Sub1_Sub1) local349;
					local381 = (int) (local17 * (float) (local354.anInt633 >> Static453.anInt7580) + (float) (local354.anInt632 >> Static453.anInt7580) * local25 + (float) (local354.anInt629 >> Static453.anInt7580) * local29 + local33);
					this.anIntArray341[local42++] = local381;
					if (local342 < local381) {
						local342 = local381;
					}
					if (local381 < local61) {
						local61 = local381;
					}
				}
				@Pc(416) int local416 = local342 - local61;
				if (local416 + 2 > 1600) {
					local381 = Static281.method3698(local416) + 1 - this.anInt4065;
					local416 = (local416 >> local381) + 2;
				} else {
					local416 += 2;
					local381 = 0;
				}
				local42 = 0;
				local349 = local79.aClass20_Sub1_5;
				local92 = -2;
				@Pc(452) boolean local452 = true;
				@Pc(454) boolean local454 = true;
				while (local79 != local349) {
					this.anInt4067 = 0;
					for (local185 = 0; local185 < local416; local185++) {
						this.anIntArray340[local185] = 0;
					}
					for (@Pc(478) int local478 = 0; local478 < 64; local478++) {
						this.anIntArray342[local478] = 0;
					}
					while (local79 != local349) {
						@Pc(494) Class20_Sub1_Sub1 local494 = (Class20_Sub1_Sub1) local349;
						if (local454) {
							local92 = local494.anInt630;
							local452 = local494.aBoolean36;
							local454 = false;
						}
						if (local42 > 0 && (local92 != local494.anInt630 || local452 != local494.aBoolean36)) {
							local454 = true;
							break;
						}
						@Pc(539) int local539 = this.anIntArray341[local42++] - local61 >> local381;
						if (local539 < 1600) {
							if (this.anIntArray340[local539] < 64) {
								this.aClass20_Sub1_Sub1ArrayArray2[local539][this.anIntArray340[local539]++] = local494;
							} else {
								label139: {
									if (this.anIntArray340[local539] == 64) {
										if (this.anInt4067 == 64) {
											break label139;
										}
										this.anIntArray340[local539] += this.anInt4067++ + 1;
									}
									local237 = this.aClass20_Sub1_Sub1ArrayArray1[this.anIntArray340[local539] - 64 - 1];
									local247 = this.anIntArray340[local539] - 1 - 64;
									local249 = this.anIntArray342[this.anIntArray340[local539] - 1 - 64];
									this.anIntArray342[local247] = this.anIntArray342[this.anIntArray340[local539] - 1 - 64] + 1;
									local237[local249] = local494;
								}
							}
						}
						local349 = local349.aClass20_Sub1_5;
					}
					if (local92 < 0) {
						arg0.method5458(null);
					} else {
						arg0.method5458(arg0.aClass265_1.method5928(local92));
						arg0.method5441(arg0.anInterface5_7.method4079(local92).anInt2731);
					}
					if (local452 && Static457.aFloat103 != arg0.aFloat92) {
						arg0.B(Static457.aFloat103);
					} else if (arg0.aFloat92 != 1.0F) {
						arg0.B(1.0F);
					}
					this.method3235(arg0, local416);
				}
			}
		} catch (@Pc(692) Exception local692) {
		}
		this.method3234(arg0);
	}
}
