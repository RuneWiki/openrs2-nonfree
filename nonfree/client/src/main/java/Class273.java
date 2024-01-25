import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class273 {

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "Lclient!gb;")
	private Interface10 anInterface10_6;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!gda;")
	private Class117 aClass117_10;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!gda;")
	private Class117 aClass117_11;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "Lclient!gda;")
	private Class117 aClass117_12;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "[F")
	private final float[] aFloatArray47 = new float[16];

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "Lclient!ps;")
	private final Class4_Sub9_Sub2 aClass4_Sub9_Sub2_3 = new Class4_Sub9_Sub2(786336);

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
	private final int anInt7188 = Static415.method5946(1600);

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "[[Lclient!di;")
	private final Class26_Sub1_Sub1[][] aClass26_Sub1_Sub1ArrayArray3 = new Class26_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "[I")
	private final int[] anIntArray599 = new int[1600];

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
	private int anInt7190 = 0;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "[[Lclient!di;")
	private final Class26_Sub1_Sub1[][] aClass26_Sub1_Sub1ArrayArray4 = new Class26_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "[I")
	private final int[] anIntArray598 = new int[64];

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "[I")
	private final int[] anIntArray600 = new int[8191];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!no;B)V")
	private void method5951(@OriginalArg(0) Class66_Sub3 arg0) {
		arg0.method5432(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static72.aFloat8 != arg0.aFloat128) {
			arg0.ha(Static72.aFloat8);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!no;I)V")
	public void method5952(@OriginalArg(0) Class66_Sub3 arg0) {
		this.anInterface10_6 = arg0.method5393(24, null, true, 196584);
		this.aClass117_10 = new Class117(this.anInterface10_6, 5126, 2, 0);
		this.aClass117_12 = new Class117(this.anInterface10_6, 5126, 3, 8);
		this.aClass117_11 = new Class117(this.anInterface10_6, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!no;II)V")
	private void method5953(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray47, 0);
		@Pc(15) float local15 = this.aFloatArray47[0];
		@Pc(20) float local20 = this.aFloatArray47[4];
		@Pc(25) float local25 = this.aFloatArray47[8];
		@Pc(30) float local30 = this.aFloatArray47[1];
		@Pc(42) float local42 = this.aFloatArray47[5];
		@Pc(47) float local47 = this.aFloatArray47[9];
		@Pc(51) float local51 = local15 + local30;
		@Pc(55) float local55 = local42 + local20;
		@Pc(59) float local59 = local47 + local25;
		@Pc(64) float local64 = local15 - local30;
		@Pc(68) float local68 = local20 - local42;
		@Pc(73) float local73 = local25 - local47;
		@Pc(77) float local77 = local30 - local15;
		@Pc(81) float local81 = local42 - local20;
		@Pc(85) float local85 = local47 - local25;
		this.aClass4_Sub9_Sub2_3.anInt7219 = 0;
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class26_Sub1_Sub1 local129;
		@Pc(132) int local132;
		@Pc(137) byte local137;
		@Pc(142) byte local142;
		@Pc(145) byte local145;
		@Pc(150) byte local150;
		@Pc(156) float local156;
		@Pc(162) float local162;
		@Pc(168) float local168;
		@Pc(173) int local173;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(437) int local437;
		@Pc(453) Class26_Sub1_Sub1 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg0.aBoolean476) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray599[local96] > 64 ? 64 : this.anIntArray599[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass26_Sub1_Sub1ArrayArray4[local96][local120];
						local132 = local129.anInt9219;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt9214 >> 12;
						local162 = local129.anInt9217 >> 12;
						local168 = local129.anInt9213 >> 12;
						local173 = local129.anInt9222 >> 12;
						this.aClass4_Sub9_Sub2_3.method6031(0.0F, 47);
						this.aClass4_Sub9_Sub2_3.method6031(0.0F, 80);
						this.aClass4_Sub9_Sub2_3.method6031((float) -local173 * local51 + local156, 28);
						this.aClass4_Sub9_Sub2_3.method6031(local55 * (float) -local173 + local162, 50);
						this.aClass4_Sub9_Sub2_3.method6031(local59 * (float) -local173 + local168, 97);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
						this.aClass4_Sub9_Sub2_3.method6031(1.0F, 84);
						this.aClass4_Sub9_Sub2_3.method6031(0.0F, 106);
						this.aClass4_Sub9_Sub2_3.method6031((float) local173 * local64 + local156, 107);
						this.aClass4_Sub9_Sub2_3.method6031(local162 + local68 * (float) local173, 127);
						this.aClass4_Sub9_Sub2_3.method6031(local168 + local73 * (float) local173, 111);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
						this.aClass4_Sub9_Sub2_3.method6031(1.0F, 68);
						this.aClass4_Sub9_Sub2_3.method6031(1.0F, 26);
						this.aClass4_Sub9_Sub2_3.method6031(local51 * (float) local173 + local156, 84);
						this.aClass4_Sub9_Sub2_3.method6031(local55 * (float) local173 + local162, 48);
						this.aClass4_Sub9_Sub2_3.method6031(local59 * (float) local173 + local168, 72);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
						this.aClass4_Sub9_Sub2_3.method6031(0.0F, 93);
						this.aClass4_Sub9_Sub2_3.method6031(1.0F, 75);
						this.aClass4_Sub9_Sub2_3.method6031((float) local173 * local77 + local156, 25);
						this.aClass4_Sub9_Sub2_3.method6031(local81 * (float) local173 + local162, 54);
						this.aClass4_Sub9_Sub2_3.method6031(local85 * (float) local173 + local168, 67);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
					}
					if (this.anIntArray599[local96] > 64) {
						local437 = this.anIntArray599[local96] - 65;
						for (local132 = this.anIntArray598[local437] - 1; local132 >= 0; local132--) {
							local453 = this.aClass26_Sub1_Sub1ArrayArray3[local437][local132];
							local456 = local453.anInt9219;
							local145 = (byte) (local456 >> 16);
							local150 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local168 = local453.anInt9214 >> 12;
							local486 = local453.anInt9217 >> 12;
							local492 = local453.anInt9213 >> 12;
							local497 = local453.anInt9222 >> 12;
							this.aClass4_Sub9_Sub2_3.method6031(0.0F, 31);
							this.aClass4_Sub9_Sub2_3.method6031(0.0F, 45);
							this.aClass4_Sub9_Sub2_3.method6031(local168 + local51 * (float) -local497, 67);
							this.aClass4_Sub9_Sub2_3.method6031(local486 + local55 * (float) -local497, 44);
							this.aClass4_Sub9_Sub2_3.method6031(local59 * (float) -local497 + local492, 54);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
							this.aClass4_Sub9_Sub2_3.method6031(1.0F, 103);
							this.aClass4_Sub9_Sub2_3.method6031(0.0F, 78);
							this.aClass4_Sub9_Sub2_3.method6031((float) local497 * local64 + local168, 49);
							this.aClass4_Sub9_Sub2_3.method6031(local486 + (float) local497 * local68, 119);
							this.aClass4_Sub9_Sub2_3.method6031(local73 * (float) local497 + local492, 59);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
							this.aClass4_Sub9_Sub2_3.method6031(1.0F, 61);
							this.aClass4_Sub9_Sub2_3.method6031(1.0F, 100);
							this.aClass4_Sub9_Sub2_3.method6031(local168 + (float) local497 * local51, 39);
							this.aClass4_Sub9_Sub2_3.method6031((float) local497 * local55 + local486, 88);
							this.aClass4_Sub9_Sub2_3.method6031(local492 + (float) local497 * local59, 38);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
							this.aClass4_Sub9_Sub2_3.method6031(0.0F, 34);
							this.aClass4_Sub9_Sub2_3.method6031(1.0F, 33);
							this.aClass4_Sub9_Sub2_3.method6031(local168 + (float) local497 * local77, 36);
							this.aClass4_Sub9_Sub2_3.method6031(local486 + (float) local497 * local81, 119);
							this.aClass4_Sub9_Sub2_3.method6031(local492 + local85 * (float) local497, 78);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray599[local96] > 64 ? 64 : this.anIntArray599[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass26_Sub1_Sub1ArrayArray4[local96][local120];
						local132 = local129.anInt9219;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = local129.anInt9214 >> 12;
						local162 = local129.anInt9217 >> 12;
						local168 = local129.anInt9213 >> 12;
						local173 = local129.anInt9222 >> 12;
						this.aClass4_Sub9_Sub2_3.method6030(0.0F);
						this.aClass4_Sub9_Sub2_3.method6030(0.0F);
						this.aClass4_Sub9_Sub2_3.method6030(local51 * (float) -local173 + local156);
						this.aClass4_Sub9_Sub2_3.method6030((float) -local173 * local55 + local162);
						this.aClass4_Sub9_Sub2_3.method6030((float) -local173 * local59 + local168);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
						this.aClass4_Sub9_Sub2_3.method6030(1.0F);
						this.aClass4_Sub9_Sub2_3.method6030(0.0F);
						this.aClass4_Sub9_Sub2_3.method6030(local156 + (float) local173 * local64);
						this.aClass4_Sub9_Sub2_3.method6030(local162 + local68 * (float) local173);
						this.aClass4_Sub9_Sub2_3.method6030(local73 * (float) local173 + local168);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
						this.aClass4_Sub9_Sub2_3.method6030(1.0F);
						this.aClass4_Sub9_Sub2_3.method6030(1.0F);
						this.aClass4_Sub9_Sub2_3.method6030((float) local173 * local51 + local156);
						this.aClass4_Sub9_Sub2_3.method6030(local55 * (float) local173 + local162);
						this.aClass4_Sub9_Sub2_3.method6030(local59 * (float) local173 + local168);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
						this.aClass4_Sub9_Sub2_3.method6030(0.0F);
						this.aClass4_Sub9_Sub2_3.method6030(1.0F);
						this.aClass4_Sub9_Sub2_3.method6030(local156 + (float) local173 * local77);
						this.aClass4_Sub9_Sub2_3.method6030(local162 + local81 * (float) local173);
						this.aClass4_Sub9_Sub2_3.method6030((float) local173 * local85 + local168);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local137);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local142);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
						this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
					}
					if (this.anIntArray599[local96] > 64) {
						local437 = this.anIntArray599[local96] - 65;
						for (local132 = this.anIntArray598[local437] - 1; local132 >= 0; local132--) {
							local453 = this.aClass26_Sub1_Sub1ArrayArray3[local437][local132];
							local456 = local453.anInt9219;
							local145 = (byte) (local456 >> 16);
							local150 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local168 = local453.anInt9214 >> 12;
							local486 = local453.anInt9217 >> 12;
							local492 = local453.anInt9213 >> 12;
							local497 = local453.anInt9222 >> 12;
							this.aClass4_Sub9_Sub2_3.method6030(0.0F);
							this.aClass4_Sub9_Sub2_3.method6030(0.0F);
							this.aClass4_Sub9_Sub2_3.method6030((float) -local497 * local51 + local168);
							this.aClass4_Sub9_Sub2_3.method6030(local486 + (float) -local497 * local55);
							this.aClass4_Sub9_Sub2_3.method6030(local492 + local59 * (float) -local497);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
							this.aClass4_Sub9_Sub2_3.method6030(1.0F);
							this.aClass4_Sub9_Sub2_3.method6030(0.0F);
							this.aClass4_Sub9_Sub2_3.method6030(local168 + (float) local497 * local64);
							this.aClass4_Sub9_Sub2_3.method6030(local486 + (float) local497 * local68);
							this.aClass4_Sub9_Sub2_3.method6030(local73 * (float) local497 + local492);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
							this.aClass4_Sub9_Sub2_3.method6030(1.0F);
							this.aClass4_Sub9_Sub2_3.method6030(1.0F);
							this.aClass4_Sub9_Sub2_3.method6030(local51 * (float) local497 + local168);
							this.aClass4_Sub9_Sub2_3.method6030(local486 + (float) local497 * local55);
							this.aClass4_Sub9_Sub2_3.method6030((float) local497 * local59 + local492);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
							this.aClass4_Sub9_Sub2_3.method6030(0.0F);
							this.aClass4_Sub9_Sub2_3.method6030(1.0F);
							this.aClass4_Sub9_Sub2_3.method6030(local168 + local77 * (float) local497);
							this.aClass4_Sub9_Sub2_3.method6030(local81 * (float) local497 + local486);
							this.aClass4_Sub9_Sub2_3.method6030((float) local497 * local85 + local492);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local145);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local150);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local469);
							this.aClass4_Sub9_Sub2_3.method5961(-345277664, local474);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub9_Sub2_3.anInt7219 != 0) {
			this.anInterface10_6.method5605(this.aClass4_Sub9_Sub2_3.aByteArray97, 24, this.aClass4_Sub9_Sub2_3.anInt7219);
			arg0.method5413(this.aClass117_11, this.aClass117_12, null, this.aClass117_10);
			arg0.method5367(this.aClass4_Sub9_Sub2_3.anInt7219 / 24);
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!no;Lclient!c;)V")
	public void method5954(@OriginalArg(1) Class66_Sub3 arg0, @OriginalArg(2) Class42 arg1) {
		if (arg0.aClass134_Sub2_4 == null) {
			return;
		}
		this.method5955(arg0);
		@Pc(21) float local21 = arg0.aClass134_Sub2_4.aFloat78;
		@Pc(25) float local25 = arg0.aClass134_Sub2_4.aFloat79;
		@Pc(29) float local29 = arg0.aClass134_Sub2_4.aFloat87;
		@Pc(33) float local33 = arg0.aClass134_Sub2_4.aFloat83;
		try {
			@Pc(43) int local43;
			@Pc(57) int local57;
			@Pc(75) Class26_Sub1 local75;
			@Pc(88) int local88;
			@Pc(184) int local184;
			if (arg1.aBoolean80) {
				local43 = arg1.anInt913 - arg1.anInt912;
				if (local43 + 2 > 1600) {
					local57 = Static415.method5946(local43) + 1 - this.anInt7188;
					local43 = (local43 >> local57) + 2;
				} else {
					local57 = 0;
					local43 += 2;
				}
				@Pc(72) Class26_Sub1 local72 = arg1.aClass212_1.aClass26_Sub1_5;
				local75 = local72.aClass26_Sub1_10;
				@Pc(77) int local77 = -2;
				@Pc(79) boolean local79 = true;
				@Pc(81) boolean local81 = true;
				while (local75 != local72) {
					this.anInt7190 = 0;
					for (local88 = 0; local88 < local43; local88++) {
						this.anIntArray599[local88] = 0;
					}
					for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
						this.anIntArray598[local105] = 0;
					}
					while (local75 != local72) {
						@Pc(121) Class26_Sub1_Sub1 local121 = (Class26_Sub1_Sub1) local75;
						if (local81) {
							local79 = local121.aBoolean637;
							local77 = local121.anInt9221;
							local81 = false;
						} else if (local77 != local121.anInt9221 || local79 != local121.aBoolean637) {
							local81 = true;
							break;
						}
						local184 = (int) (local33 + local29 * (float) (local121.anInt9213 >> 12) + local21 * (float) (local121.anInt9214 >> 12) + (float) (local121.anInt9217 >> 12) * local25) - arg1.anInt912 >> local57;
						if (local184 < 1600) {
							if (this.anIntArray599[local184] >= 64) {
								label192: {
									if (this.anIntArray599[local184] == 64) {
										if (this.anInt7190 == 64) {
											break label192;
										}
										this.anIntArray599[local184] += this.anInt7190++ + 1;
									}
									this.aClass26_Sub1_Sub1ArrayArray3[this.anIntArray599[local184] - 1 - 64][this.anIntArray598[this.anIntArray599[local184] - 64 - 1]++] = local121;
								}
							} else {
								this.aClass26_Sub1_Sub1ArrayArray4[local184][this.anIntArray599[local184]++] = local121;
							}
						}
						local75 = local75.aClass26_Sub1_10;
					}
					if (local77 < 0) {
						arg0.method5431(-1);
					} else {
						arg0.method5431(local77);
					}
					if (local79 && arg0.aFloat128 != Static72.aFloat8) {
						arg0.ha(Static72.aFloat8);
					} else if (arg0.aFloat128 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method5953(arg0, local43);
				}
			} else {
				local43 = 0;
				local57 = Integer.MAX_VALUE;
				@Pc(330) int local330 = 0;
				local75 = arg1.aClass212_1.aClass26_Sub1_5;
				@Pc(337) Class26_Sub1 local337;
				@Pc(369) int local369;
				for (local337 = local75.aClass26_Sub1_10; local337 != local75; local337 = local337.aClass26_Sub1_10) {
					@Pc(342) Class26_Sub1_Sub1 local342 = (Class26_Sub1_Sub1) local337;
					local369 = (int) ((float) (local342.anInt9213 >> 12) * local29 + local25 * (float) (local342.anInt9217 >> 12) + (float) (local342.anInt9214 >> 12) * local21 + local33);
					this.anIntArray600[local43++] = local369;
					if (local369 < local57) {
						local57 = local369;
					}
					if (local330 < local369) {
						local330 = local369;
					}
				}
				@Pc(404) int local404 = local330 - local57;
				if (local404 + 2 > 1600) {
					local369 = Static415.method5946(local404) + 1 - this.anInt7188;
					local404 = (local404 >> local369) + 2;
				} else {
					local369 = 0;
					local404 += 2;
				}
				local337 = local75.aClass26_Sub1_10;
				local43 = 0;
				local88 = -2;
				@Pc(439) boolean local439 = true;
				@Pc(441) boolean local441 = true;
				while (local337 != local75) {
					this.anInt7190 = 0;
					for (local184 = 0; local184 < local404; local184++) {
						this.anIntArray599[local184] = 0;
					}
					for (@Pc(465) int local465 = 0; local465 < 64; local465++) {
						this.anIntArray598[local465] = 0;
					}
					while (local75 != local337) {
						@Pc(483) Class26_Sub1_Sub1 local483 = (Class26_Sub1_Sub1) local337;
						if (local441) {
							local439 = local483.aBoolean637;
							local441 = false;
							local88 = local483.anInt9221;
						}
						if (local43 > 0 && (local88 != local483.anInt9221 || local439 != local483.aBoolean637)) {
							local441 = true;
							break;
						}
						@Pc(525) int local525 = this.anIntArray600[local43++] - local57 >> local369;
						if (local525 < 1600) {
							if (this.anIntArray599[local525] >= 64) {
								label142: {
									if (this.anIntArray599[local525] == 64) {
										if (this.anInt7190 == 64) {
											break label142;
										}
										this.anIntArray599[local525] += this.anInt7190++ + 1;
									}
									@Pc(575) Class26_Sub1_Sub1[] local575 = this.aClass26_Sub1_Sub1ArrayArray3[this.anIntArray599[local525] - 64 - 1];
									@Pc(585) int local585 = this.anIntArray599[local525] - 64 - 1;
									@Pc(587) int local587 = this.anIntArray598[this.anIntArray599[local525] - 64 - 1];
									this.anIntArray598[local585] = this.anIntArray598[this.anIntArray599[local525] - 64 - 1] + 1;
									local575[local587] = local483;
								}
							} else {
								this.aClass26_Sub1_Sub1ArrayArray4[local525][this.anIntArray599[local525]++] = local483;
							}
						}
						local337 = local337.aClass26_Sub1_10;
					}
					if (local88 >= 0) {
						arg0.method5431(local88);
					} else {
						arg0.method5431(-1);
					}
					if (local439 && arg0.aFloat128 != Static72.aFloat8) {
						arg0.ha(Static72.aFloat8);
					} else if (arg0.aFloat128 != 1.0F) {
						arg0.ha(1.0F);
					}
					this.method5953(arg0, local404);
				}
			}
		} catch (@Pc(658) Exception local658) {
		}
		this.method5951(arg0);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILclient!no;)V")
	private void method5955(@OriginalArg(1) Class66_Sub3 arg0) {
		Static72.aFloat8 = arg0.aFloat128;
		arg0.method5412();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5432(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
