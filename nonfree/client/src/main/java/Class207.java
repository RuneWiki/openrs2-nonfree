import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class207 {

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!cw;")
	private Interface1 anInterface1_5;

	@OriginalMember(owner = "client!lq", name = "o", descriptor = "Lclient!fe;")
	private Class97 aClass97_8;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!fe;")
	private Class97 aClass97_9;

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "Lclient!fe;")
	private Class97 aClass97_10;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "[F")
	private final float[] aFloatArray42 = new float[16];

	@OriginalMember(owner = "client!lq", name = "j", descriptor = "Lclient!kv;")
	private final Class1_Sub20_Sub2 aClass1_Sub20_Sub2_2 = new Class1_Sub20_Sub2(786336);

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
	private final int anInt5545 = Static267.method4195(1600);

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "[I")
	private final int[] anIntArray351 = new int[8191];

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "[I")
	private final int[] anIntArray353 = new int[1600];

	@OriginalMember(owner = "client!lq", name = "u", descriptor = "[I")
	private final int[] anIntArray352 = new int[64];

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "[[Lclient!bh;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray4 = new Class20_Sub1_Sub1[1600][64];

	@OriginalMember(owner = "client!lq", name = "t", descriptor = "[[Lclient!bh;")
	private final Class20_Sub1_Sub1[][] aClass20_Sub1_Sub1ArrayArray3 = new Class20_Sub1_Sub1[64][768];

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	private int anInt5546 = 0;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!ag;)V")
	private void method4722(@OriginalArg(1) Class12_Sub1 arg0) {
		Static158.aFloat63 = arg0.aFloat13;
		arg0.method416();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method404(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILclient!ag;)V")
	private void method4723(@OriginalArg(1) Class12_Sub1 arg0) {
		arg0.method404(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static158.aFloat63 != arg0.aFloat13) {
			arg0.ra(Static158.aFloat63);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ag;Lclient!ec;II)V")
	public void method4724(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(3) int arg2) {
		if (arg0.aClass209_Sub3_3 == null) {
			return;
		}
		if (arg2 >= 0) {
			this.method4725(arg0, arg2);
		} else {
			this.method4722(arg0);
		}
		@Pc(28) float local28 = arg0.aClass209_Sub3_3.aFloat169;
		@Pc(32) float local32 = arg0.aClass209_Sub3_3.aFloat166;
		@Pc(36) float local36 = arg0.aClass209_Sub3_3.aFloat172;
		@Pc(40) float local40 = arg0.aClass209_Sub3_3.aFloat170;
		try {
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = Integer.MAX_VALUE;
			@Pc(46) int local46 = 0;
			@Pc(56) Class20_Sub1 local56 = arg1.aClass127_1.aClass20_Sub1_7;
			@Pc(59) Class20_Sub1 local59;
			@Pc(91) int local91;
			for (local59 = local56.aClass20_Sub1_9; local59 != local56; local59 = local59.aClass20_Sub1_9) {
				@Pc(64) Class20_Sub1_Sub1 local64 = (Class20_Sub1_Sub1) local59;
				local91 = (int) (local32 * (float) (local64.anInt6324 >> 12) + local28 * (float) (local64.anInt6325 >> 12) + local36 * (float) (local64.anInt6329 >> 12) + local40);
				this.anIntArray351[local42++] = local91;
				if (local46 < local91) {
					local46 = local91;
				}
				if (local91 < local44) {
					local44 = local91;
				}
			}
			@Pc(118) int local118 = local46 - local44;
			if (local118 + 2 <= 1600) {
				local118 += 2;
				local91 = 0;
			} else {
				local91 = Static267.method4195(local118) + 1 - this.anInt5545;
				local118 = (local118 >> local91) + 2;
			}
			local42 = 0;
			local59 = local56.aClass20_Sub1_9;
			@Pc(150) int local150 = -2;
			@Pc(152) boolean local152 = true;
			@Pc(154) boolean local154 = true;
			while (local56 != local59) {
				this.anInt5546 = 0;
				for (@Pc(161) int local161 = 0; local161 < local118; local161++) {
					this.anIntArray353[local161] = 0;
				}
				for (@Pc(174) int local174 = 0; local174 < 64; local174++) {
					this.anIntArray352[local174] = 0;
				}
				while (local56 != local59) {
					@Pc(190) Class20_Sub1_Sub1 local190 = (Class20_Sub1_Sub1) local59;
					if (local154) {
						local152 = local190.aBoolean451;
						local154 = false;
						local150 = local190.anInt6322;
					}
					if (local42 > 0 && (local150 != local190.anInt6322 || local152 != local190.aBoolean451)) {
						local154 = true;
						break;
					}
					@Pc(235) int local235 = this.anIntArray351[local42++] - local44 >> local91;
					if (local235 < 1600) {
						if (this.anIntArray353[local235] < 64) {
							this.aClass20_Sub1_Sub1ArrayArray4[local235][this.anIntArray353[local235]++] = local190;
						} else {
							label101: {
								if (this.anIntArray353[local235] == 64) {
									if (this.anInt5546 == 64) {
										break label101;
									}
									this.anIntArray353[local235] += this.anInt5546++ + 1;
								}
								this.aClass20_Sub1_Sub1ArrayArray3[this.anIntArray353[local235] - 1 - 64][this.anIntArray352[this.anIntArray353[local235] - 64 - 1]++] = local190;
							}
						}
					}
					local59 = local59.aClass20_Sub1_9;
				}
				if (local150 < 0) {
					arg0.method444(-1);
				} else {
					arg0.method444(local150);
				}
				if (local152 && arg0.aFloat13 != Static158.aFloat63) {
					arg0.ra(Static158.aFloat63);
				} else if (arg0.aFloat13 != 1.0F) {
					arg0.ra(1.0F);
				}
				this.method4726(arg0, local118);
			}
		} catch (@Pc(369) Exception local369) {
		}
		this.method4723(arg0);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!ag;I)V")
	private void method4725(@OriginalArg(1) Class12_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static158.aFloat63 = arg0.aFloat13;
		arg0.method379((float) arg1);
		arg0.method411();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method404(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ag;II)V")
	private void method4726(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(2) int arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray42, 0);
		@Pc(15) float local15 = this.aFloatArray42[0];
		@Pc(20) float local20 = this.aFloatArray42[4];
		@Pc(25) float local25 = this.aFloatArray42[8];
		@Pc(30) float local30 = this.aFloatArray42[1];
		@Pc(35) float local35 = this.aFloatArray42[5];
		@Pc(40) float local40 = this.aFloatArray42[9];
		@Pc(44) float local44 = local15 + local30;
		@Pc(48) float local48 = local35 + local20;
		@Pc(52) float local52 = local40 + local25;
		@Pc(56) float local56 = local15 - local30;
		@Pc(61) float local61 = local20 - local35;
		@Pc(65) float local65 = local25 - local40;
		@Pc(76) float local76 = local30 - local15;
		@Pc(81) float local81 = local35 - local20;
		this.aClass1_Sub20_Sub2_2.anInt5238 = 0;
		@Pc(90) float local90 = local40 - local25;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(132) Class20_Sub1_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(492) float local492;
		@Pc(497) int local497;
		@Pc(437) int local437;
		@Pc(453) Class20_Sub1_Sub1 local453;
		@Pc(456) int local456;
		@Pc(469) byte local469;
		@Pc(474) byte local474;
		@Pc(486) float local486;
		if (arg0.aBoolean23) {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray353[local97] <= 64 ? this.anIntArray353[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass20_Sub1_Sub1ArrayArray4[local97][local123];
						local135 = local132.anInt6327;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt6325 >> 12;
						local165 = local132.anInt6324 >> 12;
						local171 = local132.anInt6329 >> 12;
						local176 = local132.anInt6323 >> 12;
						this.aClass1_Sub20_Sub2_2.method4440(0.0F);
						this.aClass1_Sub20_Sub2_2.method4440(0.0F);
						this.aClass1_Sub20_Sub2_2.method4440(local44 * (float) -local176 + local159);
						this.aClass1_Sub20_Sub2_2.method4440(local165 + local48 * (float) -local176);
						this.aClass1_Sub20_Sub2_2.method4440((float) -local176 * local52 + local171);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
						this.aClass1_Sub20_Sub2_2.method4440(1.0F);
						this.aClass1_Sub20_Sub2_2.method4440(0.0F);
						this.aClass1_Sub20_Sub2_2.method4440(local56 * (float) local176 + local159);
						this.aClass1_Sub20_Sub2_2.method4440(local61 * (float) local176 + local165);
						this.aClass1_Sub20_Sub2_2.method4440(local65 * (float) local176 + local171);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
						this.aClass1_Sub20_Sub2_2.method4440(1.0F);
						this.aClass1_Sub20_Sub2_2.method4440(1.0F);
						this.aClass1_Sub20_Sub2_2.method4440((float) local176 * local44 + local159);
						this.aClass1_Sub20_Sub2_2.method4440(local165 + (float) local176 * local48);
						this.aClass1_Sub20_Sub2_2.method4440(local171 + local52 * (float) local176);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
						this.aClass1_Sub20_Sub2_2.method4440(0.0F);
						this.aClass1_Sub20_Sub2_2.method4440(1.0F);
						this.aClass1_Sub20_Sub2_2.method4440(local159 + local76 * (float) local176);
						this.aClass1_Sub20_Sub2_2.method4440(local165 + (float) local176 * local81);
						this.aClass1_Sub20_Sub2_2.method4440(local171 + (float) local176 * local90);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
					}
					if (this.anIntArray353[local97] > 64) {
						local437 = this.anIntArray353[local97] - 65;
						for (local135 = this.anIntArray352[local437] - 1; local135 >= 0; local135--) {
							local453 = this.aClass20_Sub1_Sub1ArrayArray3[local437][local135];
							local456 = local453.anInt6327;
							local148 = (byte) (local456 >> 16);
							local153 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local171 = local453.anInt6325 >> 12;
							local486 = local453.anInt6324 >> 12;
							local492 = local453.anInt6329 >> 12;
							local497 = local453.anInt6323 >> 12;
							this.aClass1_Sub20_Sub2_2.method4440(0.0F);
							this.aClass1_Sub20_Sub2_2.method4440(0.0F);
							this.aClass1_Sub20_Sub2_2.method4440((float) -local497 * local44 + local171);
							this.aClass1_Sub20_Sub2_2.method4440((float) -local497 * local48 + local486);
							this.aClass1_Sub20_Sub2_2.method4440(local52 * (float) -local497 + local492);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
							this.aClass1_Sub20_Sub2_2.method4440(1.0F);
							this.aClass1_Sub20_Sub2_2.method4440(0.0F);
							this.aClass1_Sub20_Sub2_2.method4440(local171 + (float) local497 * local56);
							this.aClass1_Sub20_Sub2_2.method4440((float) local497 * local61 + local486);
							this.aClass1_Sub20_Sub2_2.method4440(local65 * (float) local497 + local492);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
							this.aClass1_Sub20_Sub2_2.method4440(1.0F);
							this.aClass1_Sub20_Sub2_2.method4440(1.0F);
							this.aClass1_Sub20_Sub2_2.method4440((float) local497 * local44 + local171);
							this.aClass1_Sub20_Sub2_2.method4440(local48 * (float) local497 + local486);
							this.aClass1_Sub20_Sub2_2.method4440((float) local497 * local52 + local492);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
							this.aClass1_Sub20_Sub2_2.method4440(0.0F);
							this.aClass1_Sub20_Sub2_2.method4440(1.0F);
							this.aClass1_Sub20_Sub2_2.method4440(local171 + (float) local497 * local76);
							this.aClass1_Sub20_Sub2_2.method4440(local81 * (float) local497 + local486);
							this.aClass1_Sub20_Sub2_2.method4440(local492 + local90 * (float) local497);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
						}
					}
				}
			}
		} else {
			for (local97 = arg1 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray353[local97] > 64 ? 64 : this.anIntArray353[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass20_Sub1_Sub1ArrayArray4[local97][local123];
						local135 = local132.anInt6327;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt6325 >> 12;
						local165 = local132.anInt6324 >> 12;
						local171 = local132.anInt6329 >> 12;
						local176 = local132.anInt6323 >> 12;
						this.aClass1_Sub20_Sub2_2.method4438(0.0F);
						this.aClass1_Sub20_Sub2_2.method4438(0.0F);
						this.aClass1_Sub20_Sub2_2.method4438(local159 + local44 * (float) -local176);
						this.aClass1_Sub20_Sub2_2.method4438(local165 + (float) -local176 * local48);
						this.aClass1_Sub20_Sub2_2.method4438(local171 + (float) -local176 * local52);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
						this.aClass1_Sub20_Sub2_2.method4438(1.0F);
						this.aClass1_Sub20_Sub2_2.method4438(0.0F);
						this.aClass1_Sub20_Sub2_2.method4438(local56 * (float) local176 + local159);
						this.aClass1_Sub20_Sub2_2.method4438(local165 + (float) local176 * local61);
						this.aClass1_Sub20_Sub2_2.method4438((float) local176 * local65 + local171);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
						this.aClass1_Sub20_Sub2_2.method4438(1.0F);
						this.aClass1_Sub20_Sub2_2.method4438(1.0F);
						this.aClass1_Sub20_Sub2_2.method4438(local44 * (float) local176 + local159);
						this.aClass1_Sub20_Sub2_2.method4438(local48 * (float) local176 + local165);
						this.aClass1_Sub20_Sub2_2.method4438(local52 * (float) local176 + local171);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
						this.aClass1_Sub20_Sub2_2.method4438(0.0F);
						this.aClass1_Sub20_Sub2_2.method4438(1.0F);
						this.aClass1_Sub20_Sub2_2.method4438((float) local176 * local76 + local159);
						this.aClass1_Sub20_Sub2_2.method4438(local81 * (float) local176 + local165);
						this.aClass1_Sub20_Sub2_2.method4438(local171 + local90 * (float) local176);
						this.aClass1_Sub20_Sub2_2.method4378(local140);
						this.aClass1_Sub20_Sub2_2.method4378(local145);
						this.aClass1_Sub20_Sub2_2.method4378(local148);
						this.aClass1_Sub20_Sub2_2.method4378(local153);
					}
					if (this.anIntArray353[local97] > 64) {
						local437 = this.anIntArray353[local97] - 64 - 1;
						for (local135 = this.anIntArray352[local437] - 1; local135 >= 0; local135--) {
							local453 = this.aClass20_Sub1_Sub1ArrayArray3[local437][local135];
							local456 = local453.anInt6327;
							local148 = (byte) (local456 >> 16);
							local153 = (byte) (local456 >> 8);
							local469 = (byte) local456;
							local474 = (byte) (local456 >>> 24);
							local171 = local453.anInt6325 >> 12;
							local486 = local453.anInt6324 >> 12;
							local492 = local453.anInt6329 >> 12;
							local497 = local453.anInt6323 >> 12;
							this.aClass1_Sub20_Sub2_2.method4438(0.0F);
							this.aClass1_Sub20_Sub2_2.method4438(0.0F);
							this.aClass1_Sub20_Sub2_2.method4438((float) -local497 * local44 + local171);
							this.aClass1_Sub20_Sub2_2.method4438(local486 + local48 * (float) -local497);
							this.aClass1_Sub20_Sub2_2.method4438(local492 + local52 * (float) -local497);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
							this.aClass1_Sub20_Sub2_2.method4438(1.0F);
							this.aClass1_Sub20_Sub2_2.method4438(0.0F);
							this.aClass1_Sub20_Sub2_2.method4438((float) local497 * local56 + local171);
							this.aClass1_Sub20_Sub2_2.method4438(local61 * (float) local497 + local486);
							this.aClass1_Sub20_Sub2_2.method4438((float) local497 * local65 + local492);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
							this.aClass1_Sub20_Sub2_2.method4438(1.0F);
							this.aClass1_Sub20_Sub2_2.method4438(1.0F);
							this.aClass1_Sub20_Sub2_2.method4438((float) local497 * local44 + local171);
							this.aClass1_Sub20_Sub2_2.method4438(local486 + (float) local497 * local48);
							this.aClass1_Sub20_Sub2_2.method4438((float) local497 * local52 + local492);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
							this.aClass1_Sub20_Sub2_2.method4438(0.0F);
							this.aClass1_Sub20_Sub2_2.method4438(1.0F);
							this.aClass1_Sub20_Sub2_2.method4438(local171 + local76 * (float) local497);
							this.aClass1_Sub20_Sub2_2.method4438(local81 * (float) local497 + local486);
							this.aClass1_Sub20_Sub2_2.method4438(local492 + (float) local497 * local90);
							this.aClass1_Sub20_Sub2_2.method4378(local148);
							this.aClass1_Sub20_Sub2_2.method4378(local153);
							this.aClass1_Sub20_Sub2_2.method4378(local469);
							this.aClass1_Sub20_Sub2_2.method4378(local474);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub20_Sub2_2.anInt5238 != 0) {
			this.anInterface1_5.method1699(this.aClass1_Sub20_Sub2_2.anInt5238, this.aClass1_Sub20_Sub2_2.aByteArray52, 24);
			arg0.method428(this.aClass97_8, null, this.aClass97_10, this.aClass97_9);
			arg0.method442(this.aClass1_Sub20_Sub2_2.anInt5238 / 24);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!ag;B)V")
	public void method4728(@OriginalArg(0) Class12_Sub1 arg0) {
		this.anInterface1_5 = arg0.method409(null, 196584, true, 24);
		this.aClass97_9 = new Class97(this.anInterface1_5, 5126, 2, 0);
		this.aClass97_8 = new Class97(this.anInterface1_5, 5126, 3, 8);
		this.aClass97_10 = new Class97(this.anInterface1_5, 5121, 4, 20);
	}
}
