import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class207 {

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "Lclient!rca;")
	private Class280 aClass280_2;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "Lclient!rca;")
	private Class280 aClass280_3;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "Lclient!rca;")
	private Class280 aClass280_4;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "Lclient!el;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "[F")
	private final float[] aFloatArray41 = new float[16];

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "Lclient!gt;")
	private final Class3_Sub11_Sub2 aClass3_Sub11_Sub2_1 = new Class3_Sub11_Sub2(786336);

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
	private final int anInt5620 = Static328.method5090(1600);

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
	private int anInt5622 = 0;

	@OriginalMember(owner = "client!lv", name = "B", descriptor = "[I")
	private final int[] anIntArray428 = new int[64];

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "[I")
	private final int[] anIntArray426 = new int[8191];

	@OriginalMember(owner = "client!lv", name = "z", descriptor = "[[Lclient!vh;")
	private final Class9_Sub8_Sub2[][] aClass9_Sub8_Sub2ArrayArray4 = new Class9_Sub8_Sub2[1600][64];

	@OriginalMember(owner = "client!lv", name = "y", descriptor = "[[Lclient!vh;")
	private final Class9_Sub8_Sub2[][] aClass9_Sub8_Sub2ArrayArray3 = new Class9_Sub8_Sub2[64][768];

	@OriginalMember(owner = "client!lv", name = "C", descriptor = "[I")
	private final int[] anIntArray429 = new int[1600];

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLclient!us;I)V")
	private void method4854(@OriginalArg(1) Class43_Sub3 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray41, 0);
		@Pc(15) float local15 = this.aFloatArray41[0];
		@Pc(20) float local20 = this.aFloatArray41[4];
		@Pc(25) float local25 = this.aFloatArray41[8];
		@Pc(30) float local30 = this.aFloatArray41[1];
		@Pc(35) float local35 = this.aFloatArray41[5];
		@Pc(40) float local40 = this.aFloatArray41[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local25 + local40;
		@Pc(57) float local57 = local15 - local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(66) float local66 = local25 - local40;
		@Pc(71) float local71 = local30 - local15;
		@Pc(82) float local82 = local35 - local20;
		@Pc(86) float local86 = local40 - local25;
		this.aClass3_Sub11_Sub2_1.anInt3520 = 0;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(129) Class9_Sub8_Sub2 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(494) float local494;
		@Pc(499) int local499;
		@Pc(439) int local439;
		@Pc(455) Class9_Sub8_Sub2 local455;
		@Pc(458) int local458;
		@Pc(471) byte local471;
		@Pc(476) byte local476;
		@Pc(488) float local488;
		if (arg0.aBoolean671) {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray429[local97] > 64 ? 64 : this.anIntArray429[local97];
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass9_Sub8_Sub2ArrayArray4[local97][local120];
						local132 = local129.anInt6178;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt6176 >> 12;
						local162 = local129.anInt6177 >> 12;
						local168 = local129.anInt6180 >> 12;
						local173 = local129.anInt6181 >> 12;
						this.aClass3_Sub11_Sub2_1.method3142(0.0F);
						this.aClass3_Sub11_Sub2_1.method3142(0.0F);
						this.aClass3_Sub11_Sub2_1.method3142(local156 + (float) -local173 * local44);
						this.aClass3_Sub11_Sub2_1.method3142(local162 + local48 * (float) -local173);
						this.aClass3_Sub11_Sub2_1.method3142(local52 * (float) -local173 + local168);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
						this.aClass3_Sub11_Sub2_1.method3142(1.0F);
						this.aClass3_Sub11_Sub2_1.method3142(0.0F);
						this.aClass3_Sub11_Sub2_1.method3142(local156 + (float) local173 * local57);
						this.aClass3_Sub11_Sub2_1.method3142(local62 * (float) local173 + local162);
						this.aClass3_Sub11_Sub2_1.method3142(local168 + local66 * (float) local173);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
						this.aClass3_Sub11_Sub2_1.method3142(1.0F);
						this.aClass3_Sub11_Sub2_1.method3142(1.0F);
						this.aClass3_Sub11_Sub2_1.method3142(local44 * (float) local173 + local156);
						this.aClass3_Sub11_Sub2_1.method3142(local162 + (float) local173 * local48);
						this.aClass3_Sub11_Sub2_1.method3142(local52 * (float) local173 + local168);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
						this.aClass3_Sub11_Sub2_1.method3142(0.0F);
						this.aClass3_Sub11_Sub2_1.method3142(1.0F);
						this.aClass3_Sub11_Sub2_1.method3142(local156 + (float) local173 * local71);
						this.aClass3_Sub11_Sub2_1.method3142((float) local173 * local82 + local162);
						this.aClass3_Sub11_Sub2_1.method3142(local86 * (float) local173 + local168);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
					}
					if (this.anIntArray429[local97] > 64) {
						local439 = this.anIntArray429[local97] - 64 - 1;
						for (local132 = this.anIntArray428[local439] - 1; local132 >= 0; local132--) {
							local455 = this.aClass9_Sub8_Sub2ArrayArray3[local439][local132];
							local458 = local455.anInt6178;
							local145 = (byte) (local458 >> 16);
							local150 = (byte) (local458 >> 8);
							local471 = (byte) local458;
							local476 = (byte) (local458 >>> 24);
							local168 = local455.anInt6176 >> 12;
							local488 = local455.anInt6177 >> 12;
							local494 = local455.anInt6180 >> 12;
							local499 = local455.anInt6181 >> 12;
							this.aClass3_Sub11_Sub2_1.method3142(0.0F);
							this.aClass3_Sub11_Sub2_1.method3142(0.0F);
							this.aClass3_Sub11_Sub2_1.method3142(local168 + (float) -local499 * local44);
							this.aClass3_Sub11_Sub2_1.method3142(local48 * (float) -local499 + local488);
							this.aClass3_Sub11_Sub2_1.method3142(local494 + (float) -local499 * local52);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
							this.aClass3_Sub11_Sub2_1.method3142(1.0F);
							this.aClass3_Sub11_Sub2_1.method3142(0.0F);
							this.aClass3_Sub11_Sub2_1.method3142(local168 + local57 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3142(local488 + local62 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3142(local66 * (float) local499 + local494);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
							this.aClass3_Sub11_Sub2_1.method3142(1.0F);
							this.aClass3_Sub11_Sub2_1.method3142(1.0F);
							this.aClass3_Sub11_Sub2_1.method3142(local44 * (float) local499 + local168);
							this.aClass3_Sub11_Sub2_1.method3142(local48 * (float) local499 + local488);
							this.aClass3_Sub11_Sub2_1.method3142(local494 + local52 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
							this.aClass3_Sub11_Sub2_1.method3142(0.0F);
							this.aClass3_Sub11_Sub2_1.method3142(1.0F);
							this.aClass3_Sub11_Sub2_1.method3142(local168 + local71 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3142(local488 + local82 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3142(local494 + local86 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
						}
					}
				}
			}
		} else {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray429[local97] <= 64 ? this.anIntArray429[local97] : 64;
				if (local114 > 0) {
					for (local120 = local114 - 1; local120 >= 0; local120--) {
						local129 = this.aClass9_Sub8_Sub2ArrayArray4[local97][local120];
						local132 = local129.anInt6178;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt6176 >> 12;
						local162 = local129.anInt6177 >> 12;
						local168 = local129.anInt6180 >> 12;
						local173 = local129.anInt6181 >> 12;
						this.aClass3_Sub11_Sub2_1.method3143(0.0F);
						this.aClass3_Sub11_Sub2_1.method3143(0.0F);
						this.aClass3_Sub11_Sub2_1.method3143(local156 + local44 * (float) -local173);
						this.aClass3_Sub11_Sub2_1.method3143(local48 * (float) -local173 + local162);
						this.aClass3_Sub11_Sub2_1.method3143(local168 + local52 * (float) -local173);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
						this.aClass3_Sub11_Sub2_1.method3143(1.0F);
						this.aClass3_Sub11_Sub2_1.method3143(0.0F);
						this.aClass3_Sub11_Sub2_1.method3143(local156 + local57 * (float) local173);
						this.aClass3_Sub11_Sub2_1.method3143(local162 + (float) local173 * local62);
						this.aClass3_Sub11_Sub2_1.method3143(local168 + local66 * (float) local173);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
						this.aClass3_Sub11_Sub2_1.method3143(1.0F);
						this.aClass3_Sub11_Sub2_1.method3143(1.0F);
						this.aClass3_Sub11_Sub2_1.method3143(local44 * (float) local173 + local156);
						this.aClass3_Sub11_Sub2_1.method3143((float) local173 * local48 + local162);
						this.aClass3_Sub11_Sub2_1.method3143(local52 * (float) local173 + local168);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
						this.aClass3_Sub11_Sub2_1.method3143(0.0F);
						this.aClass3_Sub11_Sub2_1.method3143(1.0F);
						this.aClass3_Sub11_Sub2_1.method3143(local71 * (float) local173 + local156);
						this.aClass3_Sub11_Sub2_1.method3143(local162 + (float) local173 * local82);
						this.aClass3_Sub11_Sub2_1.method3143(local168 + (float) local173 * local86);
						this.aClass3_Sub11_Sub2_1.method3079(local137);
						this.aClass3_Sub11_Sub2_1.method3079(local142);
						this.aClass3_Sub11_Sub2_1.method3079(local145);
						this.aClass3_Sub11_Sub2_1.method3079(local150);
					}
					if (this.anIntArray429[local97] > 64) {
						local439 = this.anIntArray429[local97] - 65;
						for (local132 = this.anIntArray428[local439] - 1; local132 >= 0; local132--) {
							local455 = this.aClass9_Sub8_Sub2ArrayArray3[local439][local132];
							local458 = local455.anInt6178;
							local145 = (byte) (local458 >> 16);
							local150 = (byte) (local458 >> 8);
							local471 = (byte) local458;
							local476 = (byte) (local458 >>> 24);
							local168 = local455.anInt6176 >> 12;
							local488 = local455.anInt6177 >> 12;
							local494 = local455.anInt6180 >> 12;
							local499 = local455.anInt6181 >> 12;
							this.aClass3_Sub11_Sub2_1.method3143(0.0F);
							this.aClass3_Sub11_Sub2_1.method3143(0.0F);
							this.aClass3_Sub11_Sub2_1.method3143(local168 + local44 * (float) -local499);
							this.aClass3_Sub11_Sub2_1.method3143(local488 + local48 * (float) -local499);
							this.aClass3_Sub11_Sub2_1.method3143(local494 + (float) -local499 * local52);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
							this.aClass3_Sub11_Sub2_1.method3143(1.0F);
							this.aClass3_Sub11_Sub2_1.method3143(0.0F);
							this.aClass3_Sub11_Sub2_1.method3143((float) local499 * local57 + local168);
							this.aClass3_Sub11_Sub2_1.method3143(local488 + (float) local499 * local62);
							this.aClass3_Sub11_Sub2_1.method3143((float) local499 * local66 + local494);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
							this.aClass3_Sub11_Sub2_1.method3143(1.0F);
							this.aClass3_Sub11_Sub2_1.method3143(1.0F);
							this.aClass3_Sub11_Sub2_1.method3143(local168 + local44 * (float) local499);
							this.aClass3_Sub11_Sub2_1.method3143(local488 + (float) local499 * local48);
							this.aClass3_Sub11_Sub2_1.method3143(local52 * (float) local499 + local494);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
							this.aClass3_Sub11_Sub2_1.method3143(0.0F);
							this.aClass3_Sub11_Sub2_1.method3143(1.0F);
							this.aClass3_Sub11_Sub2_1.method3143(local71 * (float) local499 + local168);
							this.aClass3_Sub11_Sub2_1.method3143(local488 + (float) local499 * local82);
							this.aClass3_Sub11_Sub2_1.method3143((float) local499 * local86 + local494);
							this.aClass3_Sub11_Sub2_1.method3079(local145);
							this.aClass3_Sub11_Sub2_1.method3079(local150);
							this.aClass3_Sub11_Sub2_1.method3079(local471);
							this.aClass3_Sub11_Sub2_1.method3079(local476);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub11_Sub2_1.anInt3520 != 0) {
			this.anInterface7_1.method6582(this.aClass3_Sub11_Sub2_1.aByteArray36, this.aClass3_Sub11_Sub2_1.anInt3520, 24);
			arg0.method7303(this.aClass280_4, this.aClass280_2, this.aClass280_3, null);
			arg0.method7263(this.aClass3_Sub11_Sub2_1.anInt3520 / 24);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!us;II)V")
	private void method4855(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static307.aFloat115 = arg0.aFloat208;
		arg0.method7256((float) arg1);
		arg0.method7219();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7239(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!us;I)V")
	public void method4858(@OriginalArg(0) Class43_Sub3 arg0) {
		this.anInterface7_1 = arg0.method7241(null, 24, 196584, true);
		this.aClass280_4 = new Class280(this.anInterface7_1, 5126, 2, 0);
		this.aClass280_2 = new Class280(this.anInterface7_1, 5126, 3, 8);
		this.aClass280_3 = new Class280(this.anInterface7_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BLclient!us;)V")
	private void method4859(@OriginalArg(1) Class43_Sub3 arg0) {
		arg0.method7239(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static307.aFloat115 != arg0.aFloat208) {
			arg0.ra(Static307.aFloat115);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ZLclient!us;)V")
	private void method4861(@OriginalArg(1) Class43_Sub3 arg0) {
		Static307.aFloat115 = arg0.aFloat208;
		arg0.method7223();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7239(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!us;Lclient!fi;BI)V")
	public void method4862(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass109_Sub2_3 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method4855(arg0, arg2);
		} else {
			this.method4861(arg0);
		}
		@Pc(26) float local26 = arg0.aClass109_Sub2_3.aFloat166;
		@Pc(30) float local30 = arg0.aClass109_Sub2_3.aFloat168;
		@Pc(34) float local34 = arg0.aClass109_Sub2_3.aFloat164;
		@Pc(47) float local47 = arg0.aClass109_Sub2_3.aFloat165;
		try {
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = Integer.MAX_VALUE;
			@Pc(53) int local53 = 0;
			@Pc(57) Class9_Sub8 local57 = arg1.aClass269_1.aClass9_Sub8_9;
			@Pc(60) Class9_Sub8 local60;
			@Pc(92) int local92;
			for (local60 = local57.aClass9_Sub8_8; local60 != local57; local60 = local60.aClass9_Sub8_8) {
				@Pc(65) Class9_Sub8_Sub2 local65 = (Class9_Sub8_Sub2) local60;
				local92 = (int) ((float) (local65.anInt6176 >> 12) * local26 + local30 * (float) (local65.anInt6177 >> 12) + local34 * (float) (local65.anInt6180 >> 12) + local47);
				if (local92 < local51) {
					local51 = local92;
				}
				this.anIntArray426[local49++] = local92;
				if (local53 < local92) {
					local53 = local92;
				}
			}
			@Pc(118) int local118 = local53 - local51;
			if (local118 + 2 <= 1600) {
				local92 = 0;
				local118 += 2;
			} else {
				local92 = Static328.method5090(local118) + 1 - this.anInt5620;
				local118 = (local118 >> local92) + 2;
			}
			local49 = 0;
			local60 = local57.aClass9_Sub8_8;
			@Pc(153) int local153 = -2;
			@Pc(155) boolean local155 = true;
			@Pc(157) boolean local157 = true;
			while (local57 != local60) {
				this.anInt5622 = 0;
				for (@Pc(164) int local164 = 0; local164 < local118; local164++) {
					this.anIntArray429[local164] = 0;
				}
				for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
					this.anIntArray428[local177] = 0;
				}
				while (local57 != local60) {
					@Pc(193) Class9_Sub8_Sub2 local193 = (Class9_Sub8_Sub2) local60;
					if (local157) {
						local157 = false;
						local155 = local193.aBoolean505;
						local153 = local193.anInt6182;
					}
					if (local49 > 0 && (local193.anInt6182 != local153 || local193.aBoolean505 != local155)) {
						local157 = true;
						break;
					}
					@Pc(235) int local235 = this.anIntArray426[local49++] - local51 >> local92;
					if (local235 < 1600) {
						if (this.anIntArray429[local235] < 64) {
							this.aClass9_Sub8_Sub2ArrayArray4[local235][this.anIntArray429[local235]++] = local193;
						} else {
							label101: {
								if (this.anIntArray429[local235] == 64) {
									if (this.anInt5622 == 64) {
										break label101;
									}
									this.anIntArray429[local235] += this.anInt5622++ + 1;
								}
								@Pc(303) Class9_Sub8_Sub2[] local303 = this.aClass9_Sub8_Sub2ArrayArray3[this.anIntArray429[local235] - 64 - 1];
								@Pc(311) int local311 = this.anIntArray429[local235] - 65;
								@Pc(313) int local313 = this.anIntArray428[this.anIntArray429[local235] - 65];
								this.anIntArray428[local311] = this.anIntArray428[this.anIntArray429[local235] - 65] + 1;
								local303[local313] = local193;
							}
						}
					}
					local60 = local60.aClass9_Sub8_8;
				}
				if (local153 >= 0) {
					arg0.method7294(local153);
				} else {
					arg0.method7294(-1);
				}
				if (local155 && Static307.aFloat115 != arg0.aFloat208) {
					arg0.ra(Static307.aFloat115);
				} else if (arg0.aFloat208 != 1.0F) {
					arg0.ra(1.0F);
				}
				this.method4854(arg0, local118);
			}
		} catch (@Pc(367) Exception local367) {
		}
		this.method4859(arg0);
	}
}
