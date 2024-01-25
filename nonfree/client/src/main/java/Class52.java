import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class52 {

	@OriginalMember(owner = "client!cm", name = "n", descriptor = "Lclient!rba;")
	private Class284 aClass284_1;

	@OriginalMember(owner = "client!cm", name = "q", descriptor = "Lclient!ew;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!cm", name = "r", descriptor = "Lclient!rba;")
	private Class284 aClass284_2;

	@OriginalMember(owner = "client!cm", name = "s", descriptor = "Lclient!rba;")
	private Class284 aClass284_3;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "[F")
	private final float[] aFloatArray1 = new float[16];

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "Lclient!kw;")
	private final Class4_Sub11_Sub2 aClass4_Sub11_Sub2_1 = new Class4_Sub11_Sub2(786336);

	@OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
	private final int anInt1218 = Static244.method3930(1600);

	@OriginalMember(owner = "client!cm", name = "v", descriptor = "[[Lclient!mca;")
	private final Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray2 = new Class1_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
	private int anInt1219 = 0;

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
	private final int[] anIntArray45 = new int[64];

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "[I")
	private final int[] anIntArray44 = new int[8191];

	@OriginalMember(owner = "client!cm", name = "u", descriptor = "[[Lclient!mca;")
	private final Class1_Sub1_Sub1[][] aClass1_Sub1_Sub1ArrayArray1 = new Class1_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "[I")
	private final int[] anIntArray46 = new int[1600];

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!kga;)V")
	public void method1184(@OriginalArg(1) Class44_Sub3 arg0) {
		this.anInterface10_1 = arg0.method4636(null, true, 24, 196584);
		this.aClass284_2 = new Class284(this.anInterface10_1, 5126, 2, 0);
		this.aClass284_3 = new Class284(this.anInterface10_1, 5126, 3, 8);
		this.aClass284_1 = new Class284(this.anInterface10_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!kga;I)V")
	private void method1185(@OriginalArg(0) Class44_Sub3 arg0) {
		arg0.method4604(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (arg0.aFloat163 != Static560.aFloat224) {
			arg0.ra(Static560.aFloat224);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZLclient!kga;)V")
	private void method1186(@OriginalArg(0) int arg0, @OriginalArg(2) Class44_Sub3 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray1, 0);
		@Pc(15) float local15 = this.aFloatArray1[0];
		@Pc(20) float local20 = this.aFloatArray1[4];
		@Pc(25) float local25 = this.aFloatArray1[8];
		@Pc(30) float local30 = this.aFloatArray1[1];
		@Pc(35) float local35 = this.aFloatArray1[5];
		@Pc(40) float local40 = this.aFloatArray1[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local20 + local35;
		@Pc(52) float local52 = local25 + local40;
		@Pc(60) float local60 = local15 - local30;
		@Pc(65) float local65 = local20 - local35;
		@Pc(70) float local70 = local25 - local40;
		@Pc(75) float local75 = local30 - local15;
		@Pc(79) float local79 = local35 - local20;
		@Pc(84) float local84 = local40 - local25;
		this.aClass4_Sub11_Sub2_1.anInt5831 = 0;
		@Pc(95) int local95;
		@Pc(112) int local112;
		@Pc(118) int local118;
		@Pc(127) Class1_Sub1_Sub1 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(490) float local490;
		@Pc(495) int local495;
		@Pc(435) int local435;
		@Pc(451) Class1_Sub1_Sub1 local451;
		@Pc(454) int local454;
		@Pc(467) byte local467;
		@Pc(472) byte local472;
		@Pc(484) float local484;
		if (arg1.aBoolean399) {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray46[local95] > 64 ? 64 : this.anIntArray46[local95];
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass1_Sub1_Sub1ArrayArray1[local95][local118];
						local130 = local127.anInt69;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt72 >> 12;
						local160 = local127.anInt71 >> 12;
						local166 = local127.anInt73 >> 12;
						local171 = local127.anInt70 >> 12;
						this.aClass4_Sub11_Sub2_1.method4961(0.0F);
						this.aClass4_Sub11_Sub2_1.method4961(0.0F);
						this.aClass4_Sub11_Sub2_1.method4961(local154 + (float) -local171 * local44);
						this.aClass4_Sub11_Sub2_1.method4961(local48 * (float) -local171 + local160);
						this.aClass4_Sub11_Sub2_1.method4961(local52 * (float) -local171 + local166);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
						this.aClass4_Sub11_Sub2_1.method4961(1.0F);
						this.aClass4_Sub11_Sub2_1.method4961(0.0F);
						this.aClass4_Sub11_Sub2_1.method4961((float) local171 * local60 + local154);
						this.aClass4_Sub11_Sub2_1.method4961(local160 + local65 * (float) local171);
						this.aClass4_Sub11_Sub2_1.method4961(local166 + (float) local171 * local70);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
						this.aClass4_Sub11_Sub2_1.method4961(1.0F);
						this.aClass4_Sub11_Sub2_1.method4961(1.0F);
						this.aClass4_Sub11_Sub2_1.method4961((float) local171 * local44 + local154);
						this.aClass4_Sub11_Sub2_1.method4961(local160 + (float) local171 * local48);
						this.aClass4_Sub11_Sub2_1.method4961(local166 + (float) local171 * local52);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
						this.aClass4_Sub11_Sub2_1.method4961(0.0F);
						this.aClass4_Sub11_Sub2_1.method4961(1.0F);
						this.aClass4_Sub11_Sub2_1.method4961((float) local171 * local75 + local154);
						this.aClass4_Sub11_Sub2_1.method4961(local160 + local79 * (float) local171);
						this.aClass4_Sub11_Sub2_1.method4961(local166 + (float) local171 * local84);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
					}
					if (this.anIntArray46[local95] > 64) {
						local435 = this.anIntArray46[local95] - 65;
						for (local130 = this.anIntArray45[local435] - 1; local130 >= 0; local130--) {
							local451 = this.aClass1_Sub1_Sub1ArrayArray2[local435][local130];
							local454 = local451.anInt69;
							local143 = (byte) (local454 >> 16);
							local148 = (byte) (local454 >> 8);
							local467 = (byte) local454;
							local472 = (byte) (local454 >>> 24);
							local166 = local451.anInt72 >> 12;
							local484 = local451.anInt71 >> 12;
							local490 = local451.anInt73 >> 12;
							local495 = local451.anInt70 >> 12;
							this.aClass4_Sub11_Sub2_1.method4961(0.0F);
							this.aClass4_Sub11_Sub2_1.method4961(0.0F);
							this.aClass4_Sub11_Sub2_1.method4961(local44 * (float) -local495 + local166);
							this.aClass4_Sub11_Sub2_1.method4961((float) -local495 * local48 + local484);
							this.aClass4_Sub11_Sub2_1.method4961(local490 + (float) -local495 * local52);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
							this.aClass4_Sub11_Sub2_1.method4961(1.0F);
							this.aClass4_Sub11_Sub2_1.method4961(0.0F);
							this.aClass4_Sub11_Sub2_1.method4961((float) local495 * local60 + local166);
							this.aClass4_Sub11_Sub2_1.method4961((float) local495 * local65 + local484);
							this.aClass4_Sub11_Sub2_1.method4961((float) local495 * local70 + local490);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
							this.aClass4_Sub11_Sub2_1.method4961(1.0F);
							this.aClass4_Sub11_Sub2_1.method4961(1.0F);
							this.aClass4_Sub11_Sub2_1.method4961(local166 + (float) local495 * local44);
							this.aClass4_Sub11_Sub2_1.method4961((float) local495 * local48 + local484);
							this.aClass4_Sub11_Sub2_1.method4961(local490 + local52 * (float) local495);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
							this.aClass4_Sub11_Sub2_1.method4961(0.0F);
							this.aClass4_Sub11_Sub2_1.method4961(1.0F);
							this.aClass4_Sub11_Sub2_1.method4961(local166 + local75 * (float) local495);
							this.aClass4_Sub11_Sub2_1.method4961(local79 * (float) local495 + local484);
							this.aClass4_Sub11_Sub2_1.method4961(local490 + (float) local495 * local84);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
						}
					}
				}
			}
		} else {
			for (local95 = arg0 - 1; local95 >= 0; local95--) {
				local112 = this.anIntArray46[local95] <= 64 ? this.anIntArray46[local95] : 64;
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass1_Sub1_Sub1ArrayArray1[local95][local118];
						local130 = local127.anInt69;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = local127.anInt72 >> 12;
						local160 = local127.anInt71 >> 12;
						local166 = local127.anInt73 >> 12;
						local171 = local127.anInt70 >> 12;
						this.aClass4_Sub11_Sub2_1.method4960(0.0F);
						this.aClass4_Sub11_Sub2_1.method4960(0.0F);
						this.aClass4_Sub11_Sub2_1.method4960((float) -local171 * local44 + local154);
						this.aClass4_Sub11_Sub2_1.method4960(local160 + (float) -local171 * local48);
						this.aClass4_Sub11_Sub2_1.method4960((float) -local171 * local52 + local166);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
						this.aClass4_Sub11_Sub2_1.method4960(1.0F);
						this.aClass4_Sub11_Sub2_1.method4960(0.0F);
						this.aClass4_Sub11_Sub2_1.method4960(local60 * (float) local171 + local154);
						this.aClass4_Sub11_Sub2_1.method4960(local160 + local65 * (float) local171);
						this.aClass4_Sub11_Sub2_1.method4960(local70 * (float) local171 + local166);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
						this.aClass4_Sub11_Sub2_1.method4960(1.0F);
						this.aClass4_Sub11_Sub2_1.method4960(1.0F);
						this.aClass4_Sub11_Sub2_1.method4960(local44 * (float) local171 + local154);
						this.aClass4_Sub11_Sub2_1.method4960((float) local171 * local48 + local160);
						this.aClass4_Sub11_Sub2_1.method4960((float) local171 * local52 + local166);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
						this.aClass4_Sub11_Sub2_1.method4960(0.0F);
						this.aClass4_Sub11_Sub2_1.method4960(1.0F);
						this.aClass4_Sub11_Sub2_1.method4960(local154 + (float) local171 * local75);
						this.aClass4_Sub11_Sub2_1.method4960(local160 + (float) local171 * local79);
						this.aClass4_Sub11_Sub2_1.method4960((float) local171 * local84 + local166);
						this.aClass4_Sub11_Sub2_1.method4957(local135);
						this.aClass4_Sub11_Sub2_1.method4957(local140);
						this.aClass4_Sub11_Sub2_1.method4957(local143);
						this.aClass4_Sub11_Sub2_1.method4957(local148);
					}
					if (this.anIntArray46[local95] > 64) {
						local435 = this.anIntArray46[local95] - 65;
						for (local130 = this.anIntArray45[local435] - 1; local130 >= 0; local130--) {
							local451 = this.aClass1_Sub1_Sub1ArrayArray2[local435][local130];
							local454 = local451.anInt69;
							local143 = (byte) (local454 >> 16);
							local148 = (byte) (local454 >> 8);
							local467 = (byte) local454;
							local472 = (byte) (local454 >>> 24);
							local166 = local451.anInt72 >> 12;
							local484 = local451.anInt71 >> 12;
							local490 = local451.anInt73 >> 12;
							local495 = local451.anInt70 >> 12;
							this.aClass4_Sub11_Sub2_1.method4960(0.0F);
							this.aClass4_Sub11_Sub2_1.method4960(0.0F);
							this.aClass4_Sub11_Sub2_1.method4960(local166 + local44 * (float) -local495);
							this.aClass4_Sub11_Sub2_1.method4960(local484 + (float) -local495 * local48);
							this.aClass4_Sub11_Sub2_1.method4960(local490 + (float) -local495 * local52);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
							this.aClass4_Sub11_Sub2_1.method4960(1.0F);
							this.aClass4_Sub11_Sub2_1.method4960(0.0F);
							this.aClass4_Sub11_Sub2_1.method4960(local60 * (float) local495 + local166);
							this.aClass4_Sub11_Sub2_1.method4960((float) local495 * local65 + local484);
							this.aClass4_Sub11_Sub2_1.method4960((float) local495 * local70 + local490);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
							this.aClass4_Sub11_Sub2_1.method4960(1.0F);
							this.aClass4_Sub11_Sub2_1.method4960(1.0F);
							this.aClass4_Sub11_Sub2_1.method4960((float) local495 * local44 + local166);
							this.aClass4_Sub11_Sub2_1.method4960(local484 + local48 * (float) local495);
							this.aClass4_Sub11_Sub2_1.method4960(local52 * (float) local495 + local490);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
							this.aClass4_Sub11_Sub2_1.method4960(0.0F);
							this.aClass4_Sub11_Sub2_1.method4960(1.0F);
							this.aClass4_Sub11_Sub2_1.method4960(local166 + local75 * (float) local495);
							this.aClass4_Sub11_Sub2_1.method4960(local484 + (float) local495 * local79);
							this.aClass4_Sub11_Sub2_1.method4960(local490 + (float) local495 * local84);
							this.aClass4_Sub11_Sub2_1.method4957(local143);
							this.aClass4_Sub11_Sub2_1.method4957(local148);
							this.aClass4_Sub11_Sub2_1.method4957(local467);
							this.aClass4_Sub11_Sub2_1.method4957(local472);
						}
					}
				}
			}
		}
		if (this.aClass4_Sub11_Sub2_1.anInt5831 != 0) {
			this.anInterface10_1.method6468(this.aClass4_Sub11_Sub2_1.aByteArray68, this.aClass4_Sub11_Sub2_1.anInt5831, 24);
			arg1.method4633(null, this.aClass284_3, this.aClass284_2, this.aClass284_1);
			arg1.method4673(this.aClass4_Sub11_Sub2_1.anInt5831 / 24);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!kga;ILclient!so;I)V")
	public void method1187(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class305 arg2) {
		if (arg0.aClass8_Sub2_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method1190(arg1, arg0);
		} else {
			this.method1189(arg0);
		}
		@Pc(26) float local26 = arg0.aClass8_Sub2_3.aFloat21;
		@Pc(30) float local30 = arg0.aClass8_Sub2_3.aFloat22;
		@Pc(34) float local34 = arg0.aClass8_Sub2_3.aFloat27;
		@Pc(38) float local38 = arg0.aClass8_Sub2_3.aFloat32;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class1_Sub1 local48 = arg2.aClass224_1.aClass1_Sub1_7;
			@Pc(51) Class1_Sub1 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass1_Sub1_10; local51 != local48; local51 = local51.aClass1_Sub1_10) {
				@Pc(56) Class1_Sub1_Sub1 local56 = (Class1_Sub1_Sub1) local51;
				local83 = (int) ((float) (local56.anInt73 >> 12) * local34 + local26 * (float) (local56.anInt72 >> 12) + (float) (local56.anInt71 >> 12) * local30 + local38);
				this.anIntArray44[local40++] = local83;
				if (local83 < local42) {
					local42 = local83;
				}
				if (local44 < local83) {
					local44 = local83;
				}
			}
			@Pc(114) int local114 = local44 - local42;
			if (local114 + 2 <= 1600) {
				local83 = 0;
				local114 += 2;
			} else {
				local83 = Static244.method3930(local114) + 1 - this.anInt1218;
				local114 = (local114 >> local83) + 2;
			}
			local51 = local48.aClass1_Sub1_10;
			local40 = 0;
			@Pc(147) int local147 = -2;
			@Pc(149) boolean local149 = true;
			@Pc(151) boolean local151 = true;
			while (local51 != local48) {
				this.anInt1219 = 0;
				for (@Pc(158) int local158 = 0; local158 < local114; local158++) {
					this.anIntArray46[local158] = 0;
				}
				for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
					this.anIntArray45[local171] = 0;
				}
				while (local51 != local48) {
					@Pc(187) Class1_Sub1_Sub1 local187 = (Class1_Sub1_Sub1) local51;
					if (local151) {
						local149 = local187.aBoolean2;
						local147 = local187.anInt74;
						local151 = false;
					}
					if (local40 > 0 && (local147 != local187.anInt74 || local149 != local187.aBoolean2)) {
						local151 = true;
						break;
					}
					@Pc(229) int local229 = this.anIntArray44[local40++] - local42 >> local83;
					if (local229 < 1600) {
						if (this.anIntArray46[local229] >= 64) {
							label101: {
								if (this.anIntArray46[local229] == 64) {
									if (this.anInt1219 == 64) {
										break label101;
									}
									this.anIntArray46[local229] += this.anInt1219++ + 1;
								}
								this.aClass1_Sub1_Sub1ArrayArray2[this.anIntArray46[local229] - 65][this.anIntArray45[this.anIntArray46[local229] - 1 - 64]++] = local187;
							}
						} else {
							this.aClass1_Sub1_Sub1ArrayArray1[local229][this.anIntArray46[local229]++] = local187;
						}
					}
					local51 = local51.aClass1_Sub1_10;
				}
				if (local147 < 0) {
					arg0.method4661(-1);
				} else {
					arg0.method4661(local147);
				}
				if (local149 && Static560.aFloat224 != arg0.aFloat163) {
					arg0.ra(Static560.aFloat224);
				} else if (arg0.aFloat163 != 1.0F) {
					arg0.ra(1.0F);
				}
				this.method1186(local114, arg0);
			}
		} catch (@Pc(359) Exception local359) {
		}
		this.method1185(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!kga;)V")
	private void method1189(@OriginalArg(1) Class44_Sub3 arg0) {
		Static560.aFloat224 = arg0.aFloat163;
		arg0.method4615();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method4604(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(IZLclient!kga;)V")
	private void method1190(@OriginalArg(0) int arg0, @OriginalArg(2) Class44_Sub3 arg1) {
		Static560.aFloat224 = arg1.aFloat163;
		arg1.method4629((float) arg0);
		arg1.method4644();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method4604(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}
}
