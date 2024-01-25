import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class52 {

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "Lclient!ss;")
	private Class313 aClass313_1;

	@OriginalMember(owner = "client!ci", name = "n", descriptor = "Lclient!bia;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "Lclient!ss;")
	private Class313 aClass313_2;

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "Lclient!ss;")
	private Class313 aClass313_3;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "[F")
	private final float[] aFloatArray2 = new float[16];

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "Lclient!bga;")
	private final Class3_Sub9_Sub1 aClass3_Sub9_Sub1_1 = new Class3_Sub9_Sub1(786336);

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
	private final int anInt1429 = Static613.method8376(1600);

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "[I")
	private final int[] anIntArray101 = new int[1600];

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
	private int anInt1430 = 0;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "[[Lclient!gia;")
	private final Class9_Sub3_Sub2[][] aClass9_Sub3_Sub2ArrayArray1 = new Class9_Sub3_Sub2[64][768];

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "[[Lclient!gia;")
	private final Class9_Sub3_Sub2[][] aClass9_Sub3_Sub2ArrayArray2 = new Class9_Sub3_Sub2[1600][64];

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "[I")
	private final int[] anIntArray100 = new int[8191];

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "[I")
	private final int[] anIntArray102 = new int[64];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!dw;B)V")
	private void method1244(@OriginalArg(0) Class82_Sub1 arg0) {
		Static166.aFloat70 = arg0.aFloat36;
		arg0.method2048();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method2032(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILclient!dw;)V")
	private void method1246(@OriginalArg(1) int arg0, @OriginalArg(2) Class82_Sub1 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray2, 0);
		@Pc(15) float local15 = this.aFloatArray2[0];
		@Pc(20) float local20 = this.aFloatArray2[4];
		@Pc(25) float local25 = this.aFloatArray2[8];
		@Pc(36) float local36 = this.aFloatArray2[1];
		@Pc(41) float local41 = this.aFloatArray2[5];
		@Pc(46) float local46 = this.aFloatArray2[9];
		@Pc(50) float local50 = local15 + local36;
		@Pc(54) float local54 = local20 + local41;
		@Pc(58) float local58 = local46 + local25;
		@Pc(63) float local63 = local15 - local36;
		@Pc(68) float local68 = local20 - local41;
		@Pc(72) float local72 = local25 - local46;
		@Pc(77) float local77 = local36 - local15;
		@Pc(81) float local81 = local41 - local20;
		this.aClass3_Sub9_Sub1_1.anInt6453 = 0;
		@Pc(90) float local90 = local46 - local25;
		@Pc(97) int local97;
		@Pc(112) int local112;
		@Pc(118) int local118;
		@Pc(127) Class9_Sub3_Sub2 local127;
		@Pc(130) int local130;
		@Pc(135) byte local135;
		@Pc(140) byte local140;
		@Pc(143) byte local143;
		@Pc(148) byte local148;
		@Pc(154) float local154;
		@Pc(160) float local160;
		@Pc(166) float local166;
		@Pc(171) int local171;
		@Pc(487) float local487;
		@Pc(492) int local492;
		@Pc(432) int local432;
		@Pc(448) Class9_Sub3_Sub2 local448;
		@Pc(451) int local451;
		@Pc(464) byte local464;
		@Pc(469) byte local469;
		@Pc(481) float local481;
		if (arg1.aBoolean174) {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local112 = this.anIntArray101[local97] > 64 ? 64 : this.anIntArray101[local97];
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass9_Sub3_Sub2ArrayArray2[local97][local118];
						local130 = local127.anInt6756;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = (float) (local127.anInt6754 >> 12);
						local160 = (float) (local127.anInt6759 >> 12);
						local166 = (float) (local127.anInt6757 >> 12);
						local171 = local127.anInt6755 >> 12;
						this.aClass3_Sub9_Sub1_1.method706(0.0F);
						this.aClass3_Sub9_Sub1_1.method706(0.0F);
						this.aClass3_Sub9_Sub1_1.method706(local154 + local50 * (float) -local171);
						this.aClass3_Sub9_Sub1_1.method706((float) -local171 * local54 + local160);
						this.aClass3_Sub9_Sub1_1.method706((float) -local171 * local58 + local166);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
						this.aClass3_Sub9_Sub1_1.method706(1.0F);
						this.aClass3_Sub9_Sub1_1.method706(0.0F);
						this.aClass3_Sub9_Sub1_1.method706((float) local171 * local63 + local154);
						this.aClass3_Sub9_Sub1_1.method706(local160 + (float) local171 * local68);
						this.aClass3_Sub9_Sub1_1.method706(local166 + (float) local171 * local72);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
						this.aClass3_Sub9_Sub1_1.method706(1.0F);
						this.aClass3_Sub9_Sub1_1.method706(1.0F);
						this.aClass3_Sub9_Sub1_1.method706((float) local171 * local50 + local154);
						this.aClass3_Sub9_Sub1_1.method706((float) local171 * local54 + local160);
						this.aClass3_Sub9_Sub1_1.method706((float) local171 * local58 + local166);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
						this.aClass3_Sub9_Sub1_1.method706(0.0F);
						this.aClass3_Sub9_Sub1_1.method706(1.0F);
						this.aClass3_Sub9_Sub1_1.method706((float) local171 * local77 + local154);
						this.aClass3_Sub9_Sub1_1.method706((float) local171 * local81 + local160);
						this.aClass3_Sub9_Sub1_1.method706(local90 * (float) local171 + local166);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
					}
					if (this.anIntArray101[local97] > 64) {
						local432 = this.anIntArray101[local97] - 1 - 64;
						for (local130 = this.anIntArray102[local432] - 1; local130 >= 0; local130--) {
							local448 = this.aClass9_Sub3_Sub2ArrayArray1[local432][local130];
							local451 = local448.anInt6756;
							local143 = (byte) (local451 >> 16);
							local148 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local166 = (float) (local448.anInt6754 >> 12);
							local481 = (float) (local448.anInt6759 >> 12);
							local487 = (float) (local448.anInt6757 >> 12);
							local492 = local448.anInt6755 >> 12;
							this.aClass3_Sub9_Sub1_1.method706(0.0F);
							this.aClass3_Sub9_Sub1_1.method706(0.0F);
							this.aClass3_Sub9_Sub1_1.method706(local166 + local50 * (float) -local492);
							this.aClass3_Sub9_Sub1_1.method706(local481 + (float) -local492 * local54);
							this.aClass3_Sub9_Sub1_1.method706(local58 * (float) -local492 + local487);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
							this.aClass3_Sub9_Sub1_1.method706(1.0F);
							this.aClass3_Sub9_Sub1_1.method706(0.0F);
							this.aClass3_Sub9_Sub1_1.method706(local166 + (float) local492 * local63);
							this.aClass3_Sub9_Sub1_1.method706((float) local492 * local68 + local481);
							this.aClass3_Sub9_Sub1_1.method706(local487 + (float) local492 * local72);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
							this.aClass3_Sub9_Sub1_1.method706(1.0F);
							this.aClass3_Sub9_Sub1_1.method706(1.0F);
							this.aClass3_Sub9_Sub1_1.method706(local166 + (float) local492 * local50);
							this.aClass3_Sub9_Sub1_1.method706(local481 + (float) local492 * local54);
							this.aClass3_Sub9_Sub1_1.method706(local58 * (float) local492 + local487);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
							this.aClass3_Sub9_Sub1_1.method706(0.0F);
							this.aClass3_Sub9_Sub1_1.method706(1.0F);
							this.aClass3_Sub9_Sub1_1.method706((float) local492 * local77 + local166);
							this.aClass3_Sub9_Sub1_1.method706((float) local492 * local81 + local481);
							this.aClass3_Sub9_Sub1_1.method706(local487 + (float) local492 * local90);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
						}
					}
				}
			}
		} else {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local112 = this.anIntArray101[local97] <= 64 ? this.anIntArray101[local97] : 64;
				if (local112 > 0) {
					for (local118 = local112 - 1; local118 >= 0; local118--) {
						local127 = this.aClass9_Sub3_Sub2ArrayArray2[local97][local118];
						local130 = local127.anInt6756;
						local135 = (byte) (local130 >> 16);
						local140 = (byte) (local130 >> 8);
						local143 = (byte) local130;
						local148 = (byte) (local130 >>> 24);
						local154 = (float) (local127.anInt6754 >> 12);
						local160 = (float) (local127.anInt6759 >> 12);
						local166 = (float) (local127.anInt6757 >> 12);
						local171 = local127.anInt6755 >> 12;
						this.aClass3_Sub9_Sub1_1.method704(0.0F);
						this.aClass3_Sub9_Sub1_1.method704(0.0F);
						this.aClass3_Sub9_Sub1_1.method704((float) -local171 * local50 + local154);
						this.aClass3_Sub9_Sub1_1.method704(local54 * (float) -local171 + local160);
						this.aClass3_Sub9_Sub1_1.method704((float) -local171 * local58 + local166);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
						this.aClass3_Sub9_Sub1_1.method704(1.0F);
						this.aClass3_Sub9_Sub1_1.method704(0.0F);
						this.aClass3_Sub9_Sub1_1.method704((float) local171 * local63 + local154);
						this.aClass3_Sub9_Sub1_1.method704((float) local171 * local68 + local160);
						this.aClass3_Sub9_Sub1_1.method704(local72 * (float) local171 + local166);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
						this.aClass3_Sub9_Sub1_1.method704(1.0F);
						this.aClass3_Sub9_Sub1_1.method704(1.0F);
						this.aClass3_Sub9_Sub1_1.method704((float) local171 * local50 + local154);
						this.aClass3_Sub9_Sub1_1.method704(local160 + (float) local171 * local54);
						this.aClass3_Sub9_Sub1_1.method704(local166 + (float) local171 * local58);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
						this.aClass3_Sub9_Sub1_1.method704(0.0F);
						this.aClass3_Sub9_Sub1_1.method704(1.0F);
						this.aClass3_Sub9_Sub1_1.method704((float) local171 * local77 + local154);
						this.aClass3_Sub9_Sub1_1.method704(local81 * (float) local171 + local160);
						this.aClass3_Sub9_Sub1_1.method704(local166 + (float) local171 * local90);
						this.aClass3_Sub9_Sub1_1.method5572(local135);
						this.aClass3_Sub9_Sub1_1.method5572(local140);
						this.aClass3_Sub9_Sub1_1.method5572(local143);
						this.aClass3_Sub9_Sub1_1.method5572(local148);
					}
					if (this.anIntArray101[local97] > 64) {
						local432 = this.anIntArray101[local97] - 64 - 1;
						for (local130 = this.anIntArray102[local432] - 1; local130 >= 0; local130--) {
							local448 = this.aClass9_Sub3_Sub2ArrayArray1[local432][local130];
							local451 = local448.anInt6756;
							local143 = (byte) (local451 >> 16);
							local148 = (byte) (local451 >> 8);
							local464 = (byte) local451;
							local469 = (byte) (local451 >>> 24);
							local166 = (float) (local448.anInt6754 >> 12);
							local481 = (float) (local448.anInt6759 >> 12);
							local487 = (float) (local448.anInt6757 >> 12);
							local492 = local448.anInt6755 >> 12;
							this.aClass3_Sub9_Sub1_1.method704(0.0F);
							this.aClass3_Sub9_Sub1_1.method704(0.0F);
							this.aClass3_Sub9_Sub1_1.method704(local166 + (float) -local492 * local50);
							this.aClass3_Sub9_Sub1_1.method704((float) -local492 * local54 + local481);
							this.aClass3_Sub9_Sub1_1.method704((float) -local492 * local58 + local487);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
							this.aClass3_Sub9_Sub1_1.method704(1.0F);
							this.aClass3_Sub9_Sub1_1.method704(0.0F);
							this.aClass3_Sub9_Sub1_1.method704(local166 + local63 * (float) local492);
							this.aClass3_Sub9_Sub1_1.method704(local68 * (float) local492 + local481);
							this.aClass3_Sub9_Sub1_1.method704(local487 + (float) local492 * local72);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
							this.aClass3_Sub9_Sub1_1.method704(1.0F);
							this.aClass3_Sub9_Sub1_1.method704(1.0F);
							this.aClass3_Sub9_Sub1_1.method704(local166 + local50 * (float) local492);
							this.aClass3_Sub9_Sub1_1.method704(local54 * (float) local492 + local481);
							this.aClass3_Sub9_Sub1_1.method704(local487 + (float) local492 * local58);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
							this.aClass3_Sub9_Sub1_1.method704(0.0F);
							this.aClass3_Sub9_Sub1_1.method704(1.0F);
							this.aClass3_Sub9_Sub1_1.method704(local166 + (float) local492 * local77);
							this.aClass3_Sub9_Sub1_1.method704((float) local492 * local81 + local481);
							this.aClass3_Sub9_Sub1_1.method704((float) local492 * local90 + local487);
							this.aClass3_Sub9_Sub1_1.method5572(local143);
							this.aClass3_Sub9_Sub1_1.method5572(local148);
							this.aClass3_Sub9_Sub1_1.method5572(local464);
							this.aClass3_Sub9_Sub1_1.method5572(local469);
						}
					}
				}
			}
		}
		if (this.aClass3_Sub9_Sub1_1.anInt6453 != 0) {
			this.anInterface3_1.method8530(this.aClass3_Sub9_Sub1_1.anInt6453, 24, this.aClass3_Sub9_Sub1_1.aByteArray51);
			arg1.method2073(this.aClass313_3, this.aClass313_1, (Class313) null, this.aClass313_2);
			arg1.method2089(this.aClass3_Sub9_Sub1_1.anInt6453 / 24);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!dw;ILclient!ik;)V")
	public void method1247(@OriginalArg(1) Class82_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class162 arg2) {
		if (arg0.aClass31_Sub3_3 == null) {
			return;
		}
		if (arg1 >= 0) {
			this.method1249(arg1, arg0);
		} else {
			this.method1244(arg0);
		}
		@Pc(31) float local31 = arg0.aClass31_Sub3_3.aFloat185;
		@Pc(35) float local35 = arg0.aClass31_Sub3_3.aFloat181;
		@Pc(39) float local39 = arg0.aClass31_Sub3_3.aFloat182;
		@Pc(43) float local43 = arg0.aClass31_Sub3_3.aFloat188;
		try {
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = Integer.MAX_VALUE;
			@Pc(53) int local53 = 0;
			@Pc(57) Class9_Sub3 local57 = arg2.aClass347_1.aClass9_Sub3_9;
			@Pc(60) Class9_Sub3 local60;
			@Pc(92) int local92;
			for (local60 = local57.aClass9_Sub3_8; local60 != local57; local60 = local60.aClass9_Sub3_8) {
				@Pc(65) Class9_Sub3_Sub2 local65 = (Class9_Sub3_Sub2) local60;
				local92 = (int) (local43 + (float) (local65.anInt6757 >> 12) * local39 + (float) (local65.anInt6759 >> 12) * local35 + local31 * (float) (local65.anInt6754 >> 12));
				this.anIntArray100[local45++] = local92;
				if (local92 > local53) {
					local53 = local92;
				}
				if (local47 > local92) {
					local47 = local92;
				}
			}
			@Pc(123) int local123 = local53 - local47;
			if (local123 + 2 > 1600) {
				local92 = Static613.method8376(local123) + 1 - this.anInt1429;
				local123 = (local123 >> local92) + 2;
			} else {
				local123 += 2;
				local92 = 0;
			}
			local45 = 0;
			local60 = local57.aClass9_Sub3_8;
			@Pc(158) int local158 = -2;
			@Pc(160) boolean local160 = true;
			@Pc(162) boolean local162 = true;
			while (local60 != local57) {
				this.anInt1430 = 0;
				for (@Pc(169) int local169 = 0; local169 < local123; local169++) {
					this.anIntArray101[local169] = 0;
				}
				for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
					this.anIntArray102[local186] = 0;
				}
				while (local57 != local60) {
					@Pc(204) Class9_Sub3_Sub2 local204 = (Class9_Sub3_Sub2) local60;
					if (local162) {
						local162 = false;
						local158 = local204.anInt6758;
						local160 = local204.aBoolean490;
					}
					if (local45 > 0 && (local204.anInt6758 != local158 || local204.aBoolean490 != local160)) {
						local162 = true;
						break;
					}
					@Pc(243) int local243 = this.anIntArray100[local45++] - local47 >> local92;
					if (local243 < 1600) {
						if (this.anIntArray101[local243] < 64) {
							this.aClass9_Sub3_Sub2ArrayArray2[local243][this.anIntArray101[local243]++] = local204;
						} else {
							label97: {
								if (this.anIntArray101[local243] == 64) {
									if (this.anInt1430 == 64) {
										break label97;
									}
									this.anIntArray101[local243] += this.anInt1430++ + 1;
								}
								@Pc(311) Class9_Sub3_Sub2[] local311 = this.aClass9_Sub3_Sub2ArrayArray1[this.anIntArray101[local243] - 1 - 64];
								@Pc(321) int local321 = this.anIntArray101[local243] - 1 - 64;
								@Pc(323) int local323 = this.anIntArray102[this.anIntArray101[local243] - 1 - 64];
								this.anIntArray102[local321] = this.anIntArray102[this.anIntArray101[local243] - 1 - 64] + 1;
								local311[local323] = local204;
							}
						}
					}
					local60 = local60.aClass9_Sub3_8;
				}
				if (local158 < 0) {
					arg0.method2057(-1);
				} else {
					arg0.method2057(local158);
				}
				if (local160 && Static166.aFloat70 != arg0.aFloat36) {
					arg0.xa(Static166.aFloat70);
				} else if (arg0.aFloat36 != 1.0F) {
					arg0.xa(1.0F);
				}
				this.method1246(local123, arg0);
			}
		} catch (@Pc(377) Exception local377) {
		}
		this.method1251(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(Lclient!dw;B)V")
	public void method1248(@OriginalArg(0) Class82_Sub1 arg0) {
		this.anInterface3_1 = arg0.method2035(true, 24, (byte[]) null, 196584);
		this.aClass313_1 = new Class313(this.anInterface3_1, 5126, 2, 0);
		this.aClass313_2 = new Class313(this.anInterface3_1, 5126, 3, 8);
		this.aClass313_3 = new Class313(this.anInterface3_1, 5121, 4, 20);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!dw;)V")
	private void method1249(@OriginalArg(1) int arg0, @OriginalArg(2) Class82_Sub1 arg1) {
		Static166.aFloat70 = arg1.aFloat36;
		arg1.method2054((float) arg0);
		arg1.method2088();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg1.method2032(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(Lclient!dw;B)V")
	private void method1251(@OriginalArg(0) Class82_Sub1 arg0) {
		arg0.method2032(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static166.aFloat70 != arg0.aFloat36) {
			arg0.xa(Static166.aFloat70);
		}
	}
}
