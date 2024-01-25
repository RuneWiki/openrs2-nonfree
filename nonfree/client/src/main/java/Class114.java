import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class114 {

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!im;")
	private Class159 aClass159_2;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Lclient!im;")
	private Class159 aClass159_3;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "Lclient!cs;")
	private Interface7 anInterface7_1;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Lclient!im;")
	private Class159 aClass159_4;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "[F")
	private final float[] aFloatArray7 = new float[16];

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Lclient!uf;")
	private final Class5_Sub12_Sub1 aClass5_Sub12_Sub1_1 = new Class5_Sub12_Sub1(786336);

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	private final int anInt2831 = Static407.method6237(1600);

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	private int anInt2832 = 0;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "[I")
	private final int[] anIntArray232 = new int[8191];

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "[[Lclient!di;")
	private final Class14_Sub2_Sub2[][] aClass14_Sub2_Sub2ArrayArray3 = new Class14_Sub2_Sub2[64][768];

	@OriginalMember(owner = "client!fn", name = "w", descriptor = "[[Lclient!di;")
	private final Class14_Sub2_Sub2[][] aClass14_Sub2_Sub2ArrayArray4 = new Class14_Sub2_Sub2[1600][64];

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "[I")
	private final int[] anIntArray234 = new int[64];

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "[I")
	private final int[] anIntArray233 = new int[1600];

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!rda;IB)V")
	private void method2429(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray7, 0);
		@Pc(20) float local20 = this.aFloatArray7[0];
		@Pc(25) float local25 = this.aFloatArray7[4];
		@Pc(30) float local30 = this.aFloatArray7[8];
		@Pc(35) float local35 = this.aFloatArray7[1];
		@Pc(40) float local40 = this.aFloatArray7[5];
		@Pc(45) float local45 = this.aFloatArray7[9];
		@Pc(49) float local49 = local35 + local20;
		@Pc(53) float local53 = local25 + local40;
		@Pc(57) float local57 = local45 + local30;
		@Pc(62) float local62 = local20 - local35;
		@Pc(67) float local67 = local25 - local40;
		@Pc(71) float local71 = local30 - local45;
		@Pc(76) float local76 = local35 - local20;
		@Pc(81) float local81 = local40 - local25;
		this.aClass5_Sub12_Sub1_1.anInt10154 = 0;
		@Pc(89) float local89 = local45 - local30;
		@Pc(96) int local96;
		@Pc(111) int local111;
		@Pc(120) int local120;
		@Pc(129) Class14_Sub2_Sub2 local129;
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
		@Pc(455) Class14_Sub2_Sub2 local455;
		@Pc(458) int local458;
		@Pc(471) byte local471;
		@Pc(476) byte local476;
		@Pc(488) float local488;
		if (arg0.aBoolean674) {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray233[local96] <= 64 ? this.anIntArray233[local96] : 64;
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass14_Sub2_Sub2ArrayArray4[local96][local120];
						local132 = local129.anInt4157;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt4154 >> 12);
						local162 = (float) (local129.anInt4151 >> 12);
						local168 = (float) (local129.anInt4155 >> 12);
						local173 = local129.anInt4156 >> 12;
						this.aClass5_Sub12_Sub1_1.method8130(0.0F);
						this.aClass5_Sub12_Sub1_1.method8130(0.0F);
						this.aClass5_Sub12_Sub1_1.method8130(local156 + (float) -local173 * local49);
						this.aClass5_Sub12_Sub1_1.method8130(local53 * (float) -local173 + local162);
						this.aClass5_Sub12_Sub1_1.method8130(local168 + (float) -local173 * local57);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
						this.aClass5_Sub12_Sub1_1.method8130(1.0F);
						this.aClass5_Sub12_Sub1_1.method8130(0.0F);
						this.aClass5_Sub12_Sub1_1.method8130(local62 * (float) local173 + local156);
						this.aClass5_Sub12_Sub1_1.method8130(local67 * (float) local173 + local162);
						this.aClass5_Sub12_Sub1_1.method8130(local71 * (float) local173 + local168);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
						this.aClass5_Sub12_Sub1_1.method8130(1.0F);
						this.aClass5_Sub12_Sub1_1.method8130(1.0F);
						this.aClass5_Sub12_Sub1_1.method8130((float) local173 * local49 + local156);
						this.aClass5_Sub12_Sub1_1.method8130((float) local173 * local53 + local162);
						this.aClass5_Sub12_Sub1_1.method8130((float) local173 * local57 + local168);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
						this.aClass5_Sub12_Sub1_1.method8130(0.0F);
						this.aClass5_Sub12_Sub1_1.method8130(1.0F);
						this.aClass5_Sub12_Sub1_1.method8130(local156 + local76 * (float) local173);
						this.aClass5_Sub12_Sub1_1.method8130((float) local173 * local81 + local162);
						this.aClass5_Sub12_Sub1_1.method8130(local89 * (float) local173 + local168);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
					}
					if (this.anIntArray233[local96] > 64) {
						local439 = this.anIntArray233[local96] - 64 - 1;
						for (local132 = this.anIntArray234[local439] - 1; local132 >= 0; local132--) {
							local455 = this.aClass14_Sub2_Sub2ArrayArray3[local439][local132];
							local458 = local455.anInt4157;
							local145 = (byte) (local458 >> 16);
							local150 = (byte) (local458 >> 8);
							local471 = (byte) local458;
							local476 = (byte) (local458 >>> 24);
							local168 = (float) (local455.anInt4154 >> 12);
							local488 = (float) (local455.anInt4151 >> 12);
							local494 = (float) (local455.anInt4155 >> 12);
							local499 = local455.anInt4156 >> 12;
							this.aClass5_Sub12_Sub1_1.method8130(0.0F);
							this.aClass5_Sub12_Sub1_1.method8130(0.0F);
							this.aClass5_Sub12_Sub1_1.method8130(local49 * (float) -local499 + local168);
							this.aClass5_Sub12_Sub1_1.method8130(local488 + (float) -local499 * local53);
							this.aClass5_Sub12_Sub1_1.method8130(local494 + local57 * (float) -local499);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
							this.aClass5_Sub12_Sub1_1.method8130(1.0F);
							this.aClass5_Sub12_Sub1_1.method8130(0.0F);
							this.aClass5_Sub12_Sub1_1.method8130(local168 + local62 * (float) local499);
							this.aClass5_Sub12_Sub1_1.method8130((float) local499 * local67 + local488);
							this.aClass5_Sub12_Sub1_1.method8130(local71 * (float) local499 + local494);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
							this.aClass5_Sub12_Sub1_1.method8130(1.0F);
							this.aClass5_Sub12_Sub1_1.method8130(1.0F);
							this.aClass5_Sub12_Sub1_1.method8130(local168 + local49 * (float) local499);
							this.aClass5_Sub12_Sub1_1.method8130((float) local499 * local53 + local488);
							this.aClass5_Sub12_Sub1_1.method8130(local494 + (float) local499 * local57);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
							this.aClass5_Sub12_Sub1_1.method8130(0.0F);
							this.aClass5_Sub12_Sub1_1.method8130(1.0F);
							this.aClass5_Sub12_Sub1_1.method8130(local168 + (float) local499 * local76);
							this.aClass5_Sub12_Sub1_1.method8130(local488 + (float) local499 * local81);
							this.aClass5_Sub12_Sub1_1.method8130((float) local499 * local89 + local494);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
						}
					}
				}
			}
		} else {
			for (local96 = arg1 - 1; local96 >= 0; local96--) {
				local111 = this.anIntArray233[local96] > 64 ? 64 : this.anIntArray233[local96];
				if (local111 > 0) {
					for (local120 = local111 - 1; local120 >= 0; local120--) {
						local129 = this.aClass14_Sub2_Sub2ArrayArray4[local96][local120];
						local132 = local129.anInt4157;
						local137 = (byte) (local132 >> 16);
						local142 = (byte) (local132 >> 8);
						local145 = (byte) local132;
						local150 = (byte) (local132 >>> 24);
						local156 = (float) (local129.anInt4154 >> 12);
						local162 = (float) (local129.anInt4151 >> 12);
						local168 = (float) (local129.anInt4155 >> 12);
						local173 = local129.anInt4156 >> 12;
						this.aClass5_Sub12_Sub1_1.method8129(0.0F);
						this.aClass5_Sub12_Sub1_1.method8129(0.0F);
						this.aClass5_Sub12_Sub1_1.method8129(local49 * (float) -local173 + local156);
						this.aClass5_Sub12_Sub1_1.method8129((float) -local173 * local53 + local162);
						this.aClass5_Sub12_Sub1_1.method8129(local168 + local57 * (float) -local173);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
						this.aClass5_Sub12_Sub1_1.method8129(1.0F);
						this.aClass5_Sub12_Sub1_1.method8129(0.0F);
						this.aClass5_Sub12_Sub1_1.method8129(local156 + (float) local173 * local62);
						this.aClass5_Sub12_Sub1_1.method8129(local162 + (float) local173 * local67);
						this.aClass5_Sub12_Sub1_1.method8129(local168 + local71 * (float) local173);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
						this.aClass5_Sub12_Sub1_1.method8129(1.0F);
						this.aClass5_Sub12_Sub1_1.method8129(1.0F);
						this.aClass5_Sub12_Sub1_1.method8129(local156 + (float) local173 * local49);
						this.aClass5_Sub12_Sub1_1.method8129(local53 * (float) local173 + local162);
						this.aClass5_Sub12_Sub1_1.method8129(local168 + (float) local173 * local57);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
						this.aClass5_Sub12_Sub1_1.method8129(0.0F);
						this.aClass5_Sub12_Sub1_1.method8129(1.0F);
						this.aClass5_Sub12_Sub1_1.method8129((float) local173 * local76 + local156);
						this.aClass5_Sub12_Sub1_1.method8129(local162 + (float) local173 * local81);
						this.aClass5_Sub12_Sub1_1.method8129(local168 + (float) local173 * local89);
						this.aClass5_Sub12_Sub1_1.method8647(local137);
						this.aClass5_Sub12_Sub1_1.method8647(local142);
						this.aClass5_Sub12_Sub1_1.method8647(local145);
						this.aClass5_Sub12_Sub1_1.method8647(local150);
					}
					if (this.anIntArray233[local96] > 64) {
						local439 = this.anIntArray233[local96] - 65;
						for (local132 = this.anIntArray234[local439] - 1; local132 >= 0; local132--) {
							local455 = this.aClass14_Sub2_Sub2ArrayArray3[local439][local132];
							local458 = local455.anInt4157;
							local145 = (byte) (local458 >> 16);
							local150 = (byte) (local458 >> 8);
							local471 = (byte) local458;
							local476 = (byte) (local458 >>> 24);
							local168 = (float) (local455.anInt4154 >> 12);
							local488 = (float) (local455.anInt4151 >> 12);
							local494 = (float) (local455.anInt4155 >> 12);
							local499 = local455.anInt4156 >> 12;
							this.aClass5_Sub12_Sub1_1.method8129(0.0F);
							this.aClass5_Sub12_Sub1_1.method8129(0.0F);
							this.aClass5_Sub12_Sub1_1.method8129(local168 + local49 * (float) -local499);
							this.aClass5_Sub12_Sub1_1.method8129(local53 * (float) -local499 + local488);
							this.aClass5_Sub12_Sub1_1.method8129(local494 + local57 * (float) -local499);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
							this.aClass5_Sub12_Sub1_1.method8129(1.0F);
							this.aClass5_Sub12_Sub1_1.method8129(0.0F);
							this.aClass5_Sub12_Sub1_1.method8129((float) local499 * local62 + local168);
							this.aClass5_Sub12_Sub1_1.method8129(local67 * (float) local499 + local488);
							this.aClass5_Sub12_Sub1_1.method8129(local494 + (float) local499 * local71);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
							this.aClass5_Sub12_Sub1_1.method8129(1.0F);
							this.aClass5_Sub12_Sub1_1.method8129(1.0F);
							this.aClass5_Sub12_Sub1_1.method8129(local168 + (float) local499 * local49);
							this.aClass5_Sub12_Sub1_1.method8129(local53 * (float) local499 + local488);
							this.aClass5_Sub12_Sub1_1.method8129((float) local499 * local57 + local494);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
							this.aClass5_Sub12_Sub1_1.method8129(0.0F);
							this.aClass5_Sub12_Sub1_1.method8129(1.0F);
							this.aClass5_Sub12_Sub1_1.method8129(local76 * (float) local499 + local168);
							this.aClass5_Sub12_Sub1_1.method8129(local488 + (float) local499 * local81);
							this.aClass5_Sub12_Sub1_1.method8129((float) local499 * local89 + local494);
							this.aClass5_Sub12_Sub1_1.method8647(local145);
							this.aClass5_Sub12_Sub1_1.method8647(local150);
							this.aClass5_Sub12_Sub1_1.method8647(local471);
							this.aClass5_Sub12_Sub1_1.method8647(local476);
						}
					}
				}
			}
		}
		if (this.aClass5_Sub12_Sub1_1.anInt10154 != 0) {
			this.anInterface7_1.method6378(this.aClass5_Sub12_Sub1_1.anInt10154, 24, this.aClass5_Sub12_Sub1_1.aByteArray104);
			arg0.method7067(this.aClass159_3, this.aClass159_2, (Class159) null, this.aClass159_4);
			arg0.method7100(this.aClass5_Sub12_Sub1_1.anInt10154 / 24);
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!rda;I)V")
	private void method2431(@OriginalArg(0) Class126_Sub3 arg0) {
		arg0.method7094(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat163 != Static591.aFloat199) {
			arg0.xa(Static591.aFloat199);
		}
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(Lclient!rda;I)V")
	private void method2433(@OriginalArg(0) Class126_Sub3 arg0) {
		Static591.aFloat199 = arg0.aFloat163;
		arg0.method7087();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7094(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(Lclient!rda;I)V")
	public void method2435(@OriginalArg(0) Class126_Sub3 arg0) {
		this.anInterface7_1 = arg0.method7093(196584, true, 24, (byte[]) null);
		this.aClass159_3 = new Class159(this.anInterface7_1, 5126, 2, 0);
		this.aClass159_2 = new Class159(this.anInterface7_1, 5126, 3, 8);
		this.aClass159_4 = new Class159(this.anInterface7_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!uj;ZLclient!rda;I)V")
	public void method2438(@OriginalArg(0) Class345 arg0, @OriginalArg(2) Class126_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aClass117_Sub3_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method2433(arg1);
		} else {
			this.method2439(arg1, arg2);
		}
		@Pc(29) float local29 = arg1.aClass117_Sub3_3.aFloat180;
		@Pc(33) float local33 = arg1.aClass117_Sub3_3.aFloat185;
		@Pc(37) float local37 = arg1.aClass117_Sub3_3.aFloat186;
		@Pc(41) float local41 = arg1.aClass117_Sub3_3.aFloat188;
		try {
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = Integer.MAX_VALUE;
			@Pc(47) int local47 = 0;
			@Pc(51) Class14_Sub2 local51 = arg0.aClass42_1.aClass14_Sub2_5;
			@Pc(54) Class14_Sub2 local54;
			@Pc(86) int local86;
			for (local54 = local51.aClass14_Sub2_9; local54 != local51; local54 = local54.aClass14_Sub2_9) {
				@Pc(59) Class14_Sub2_Sub2 local59 = (Class14_Sub2_Sub2) local54;
				local86 = (int) (local41 + (float) (local59.anInt4155 >> 12) * local37 + (float) (local59.anInt4151 >> 12) * local33 + local29 * (float) (local59.anInt4154 >> 12));
				if (local86 > local47) {
					local47 = local86;
				}
				if (local45 > local86) {
					local45 = local86;
				}
				this.anIntArray232[local43++] = local86;
			}
			@Pc(117) int local117 = local47 - local45;
			if (local117 + 2 > 1600) {
				local86 = Static407.method6237(local117) + 1 - this.anInt2831;
				local117 = (local117 >> local86) + 2;
			} else {
				local117 += 2;
				local86 = 0;
			}
			local43 = 0;
			local54 = local51.aClass14_Sub2_9;
			@Pc(150) int local150 = -2;
			@Pc(152) boolean local152 = true;
			@Pc(154) boolean local154 = true;
			while (local54 != local51) {
				this.anInt2832 = 0;
				for (@Pc(161) int local161 = 0; local161 < local117; local161++) {
					this.anIntArray233[local161] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray234[local178] = 0;
				}
				while (local54 != local51) {
					@Pc(196) Class14_Sub2_Sub2 local196 = (Class14_Sub2_Sub2) local54;
					if (local154) {
						local154 = false;
						local152 = local196.aBoolean341;
						local150 = local196.anInt4158;
					}
					if (local43 > 0 && (local150 != local196.anInt4158 || local196.aBoolean341 != local152)) {
						local154 = true;
						break;
					}
					@Pc(241) int local241 = this.anIntArray232[local43++] - local45 >> local86;
					if (local241 < 1600) {
						if (this.anIntArray233[local241] < 64) {
							this.aClass14_Sub2_Sub2ArrayArray4[local241][this.anIntArray233[local241]++] = local196;
						} else {
							label102: {
								if (this.anIntArray233[local241] == 64) {
									if (this.anInt2832 == 64) {
										break label102;
									}
									this.anIntArray233[local241] += this.anInt2832++ + 1;
								}
								@Pc(308) Class14_Sub2_Sub2[] local308 = this.aClass14_Sub2_Sub2ArrayArray3[this.anIntArray233[local241] - 65];
								@Pc(316) int local316 = this.anIntArray233[local241] - 65;
								@Pc(318) int local318 = this.anIntArray234[this.anIntArray233[local241] - 65];
								this.anIntArray234[local316] = this.anIntArray234[this.anIntArray233[local241] - 65] + 1;
								local308[local318] = local196;
							}
						}
					}
					local54 = local54.aClass14_Sub2_9;
				}
				if (local150 < 0) {
					arg1.method7106(-1);
				} else {
					arg1.method7106(local150);
				}
				if (local152 && Static591.aFloat199 != arg1.aFloat163) {
					arg1.xa(Static591.aFloat199);
				} else if (arg1.aFloat163 != 1.0F) {
					arg1.xa(1.0F);
				}
				this.method2429(arg1, local117);
			}
		} catch (@Pc(375) Exception local375) {
		}
		this.method2431(arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!rda;BI)V")
	private void method2439(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static591.aFloat199 = arg0.aFloat163;
		arg0.method7091((float) arg1);
		arg0.method7078();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method7094(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
