import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class225 {

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Lclient!lq;")
	private Class213 aClass213_1;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "Lclient!lq;")
	private Class213 aClass213_2;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!cd;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "Lclient!lq;")
	private Class213 aClass213_3;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "[F")
	private final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "Lclient!pd;")
	private final Class1_Sub35_Sub1 aClass1_Sub35_Sub1_1 = new Class1_Sub35_Sub1(786336);

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
	private final int anInt5500 = Static139.method2103(1600);

	@OriginalMember(owner = "client!mi", name = "q", descriptor = "[[Lclient!ag;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray1 = new Class8_Sub2_Sub1[1600][64];

	@OriginalMember(owner = "client!mi", name = "t", descriptor = "[I")
	private final int[] anIntArray438 = new int[8191];

	@OriginalMember(owner = "client!mi", name = "r", descriptor = "[I")
	private final int[] anIntArray436 = new int[1600];

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "[I")
	private final int[] anIntArray437 = new int[64];

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "[[Lclient!ag;")
	private final Class8_Sub2_Sub1[][] aClass8_Sub2_Sub1ArrayArray2 = new Class8_Sub2_Sub1[64][768];

	@OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
	private int anInt5501 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!vi;Lclient!ok;II)V")
	public void method4483(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class134_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg1.aClass113_Sub2_3 == null) {
			return;
		}
		if (arg2 < 0) {
			this.method4484(arg1);
		} else {
			this.method4487(arg1, arg2);
		}
		@Pc(26) float local26 = arg1.aClass113_Sub2_3.aFloat63;
		@Pc(30) float local30 = arg1.aClass113_Sub2_3.aFloat71;
		@Pc(34) float local34 = arg1.aClass113_Sub2_3.aFloat64;
		@Pc(38) float local38 = arg1.aClass113_Sub2_3.aFloat69;
		try {
			@Pc(40) int local40 = 0;
			@Pc(42) int local42 = Integer.MAX_VALUE;
			@Pc(44) int local44 = 0;
			@Pc(48) Class8_Sub2 local48 = arg0.aClass355_1.aClass8_Sub2_9;
			@Pc(51) Class8_Sub2 local51;
			@Pc(83) int local83;
			for (local51 = local48.aClass8_Sub2_8; local51 != local48; local51 = local51.aClass8_Sub2_8) {
				@Pc(56) Class8_Sub2_Sub1 local56 = (Class8_Sub2_Sub1) local51;
				local83 = (int) (local34 * (float) (local56.anInt5210 >> 12) + (float) (local56.anInt5211 >> 12) * local30 + (float) (local56.anInt5208 >> 12) * local26 + local38);
				this.anIntArray438[local40++] = local83;
				if (local42 > local83) {
					local42 = local83;
				}
				if (local44 < local83) {
					local44 = local83;
				}
			}
			@Pc(117) int local117 = local44 - local42;
			if (local117 + 2 > 1600) {
				local83 = Static139.method2103(local117) + 1 - this.anInt5500;
				local117 = (local117 >> local83) + 2;
			} else {
				local83 = 0;
				local117 += 2;
			}
			local40 = 0;
			local51 = local48.aClass8_Sub2_8;
			@Pc(150) int local150 = -2;
			@Pc(152) boolean local152 = true;
			@Pc(154) boolean local154 = true;
			while (local48 != local51) {
				this.anInt5501 = 0;
				for (@Pc(161) int local161 = 0; local161 < local117; local161++) {
					this.anIntArray436[local161] = 0;
				}
				for (@Pc(178) int local178 = 0; local178 < 64; local178++) {
					this.anIntArray437[local178] = 0;
				}
				while (local51 != local48) {
					@Pc(194) Class8_Sub2_Sub1 local194 = (Class8_Sub2_Sub1) local51;
					if (local154) {
						local150 = local194.anInt5213;
						local154 = false;
						local152 = local194.aBoolean421;
					}
					if (local40 > 0 && (local194.anInt5213 != local150 || local152 != local194.aBoolean421)) {
						local154 = true;
						break;
					}
					@Pc(236) int local236 = this.anIntArray438[local40++] - local42 >> local83;
					if (local236 < 1600) {
						if (this.anIntArray436[local236] < 64) {
							this.aClass8_Sub2_Sub1ArrayArray1[local236][this.anIntArray436[local236]++] = local194;
						} else {
							label102: {
								if (this.anIntArray436[local236] == 64) {
									if (this.anInt5501 == 64) {
										break label102;
									}
									this.anIntArray436[local236] += this.anInt5501++ + 1;
								}
								@Pc(303) Class8_Sub2_Sub1[] local303 = this.aClass8_Sub2_Sub1ArrayArray2[this.anIntArray436[local236] - 64 - 1];
								@Pc(311) int local311 = this.anIntArray436[local236] - 65;
								@Pc(313) int local313 = this.anIntArray437[this.anIntArray436[local236] - 65];
								this.anIntArray437[local311] = this.anIntArray437[this.anIntArray436[local236] - 65] + 1;
								local303[local313] = local194;
							}
						}
					}
					local51 = local51.aClass8_Sub2_8;
				}
				if (local150 >= 0) {
					arg1.method5207(local150);
				} else {
					arg1.method5207(-1);
				}
				if (local152 && arg1.aFloat157 != Static299.aFloat120) {
					arg1.ra(Static299.aFloat120);
				} else if (arg1.aFloat157 != 1.0F) {
					arg1.ra(1.0F);
				}
				this.method4485(local117, arg1);
			}
		} catch (@Pc(370) Exception local370) {
		}
		this.method4486(arg1);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!ok;)V")
	private void method4484(@OriginalArg(1) Class134_Sub2 arg0) {
		Static299.aFloat120 = arg0.aFloat157;
		arg0.method5258();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5231(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!ok;Z)V")
	private void method4485(@OriginalArg(0) int arg0, @OriginalArg(1) Class134_Sub2 arg1) {
		OpenGL.glGetFloatv(2982, this.aFloatArray31, 0);
		@Pc(15) float local15 = this.aFloatArray31[0];
		@Pc(20) float local20 = this.aFloatArray31[4];
		@Pc(25) float local25 = this.aFloatArray31[8];
		@Pc(30) float local30 = this.aFloatArray31[1];
		@Pc(35) float local35 = this.aFloatArray31[5];
		@Pc(40) float local40 = this.aFloatArray31[9];
		@Pc(44) float local44 = local30 + local15;
		@Pc(48) float local48 = local20 + local35;
		@Pc(58) float local58 = local40 + local25;
		@Pc(63) float local63 = local15 - local30;
		@Pc(67) float local67 = local20 - local35;
		@Pc(71) float local71 = local25 - local40;
		@Pc(76) float local76 = local30 - local15;
		@Pc(81) float local81 = local35 - local20;
		this.aClass1_Sub35_Sub1_1.anInt7214 = 0;
		@Pc(90) float local90 = local40 - local25;
		@Pc(97) int local97;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(132) Class8_Sub2_Sub1 local132;
		@Pc(135) int local135;
		@Pc(140) byte local140;
		@Pc(145) byte local145;
		@Pc(148) byte local148;
		@Pc(153) byte local153;
		@Pc(159) float local159;
		@Pc(165) float local165;
		@Pc(171) float local171;
		@Pc(176) int local176;
		@Pc(497) float local497;
		@Pc(502) int local502;
		@Pc(442) int local442;
		@Pc(458) Class8_Sub2_Sub1 local458;
		@Pc(461) int local461;
		@Pc(474) byte local474;
		@Pc(479) byte local479;
		@Pc(491) float local491;
		if (arg1.aBoolean517) {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray436[local97] > 64 ? 64 : this.anIntArray436[local97];
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass8_Sub2_Sub1ArrayArray1[local97][local123];
						local135 = local132.anInt5209;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt5208 >> 12;
						local165 = local132.anInt5211 >> 12;
						local171 = local132.anInt5210 >> 12;
						local176 = local132.anInt5212 >> 12;
						this.aClass1_Sub35_Sub1_1.method5571(0.0F);
						this.aClass1_Sub35_Sub1_1.method5571(0.0F);
						this.aClass1_Sub35_Sub1_1.method5571((float) -local176 * local44 + local159);
						this.aClass1_Sub35_Sub1_1.method5571((float) -local176 * local48 + local165);
						this.aClass1_Sub35_Sub1_1.method5571(local171 + (float) -local176 * local58);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
						this.aClass1_Sub35_Sub1_1.method5571(1.0F);
						this.aClass1_Sub35_Sub1_1.method5571(0.0F);
						this.aClass1_Sub35_Sub1_1.method5571((float) local176 * local63 + local159);
						this.aClass1_Sub35_Sub1_1.method5571(local67 * (float) local176 + local165);
						this.aClass1_Sub35_Sub1_1.method5571(local171 + (float) local176 * local71);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
						this.aClass1_Sub35_Sub1_1.method5571(1.0F);
						this.aClass1_Sub35_Sub1_1.method5571(1.0F);
						this.aClass1_Sub35_Sub1_1.method5571((float) local176 * local44 + local159);
						this.aClass1_Sub35_Sub1_1.method5571(local165 + local48 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5571(local171 + local58 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
						this.aClass1_Sub35_Sub1_1.method5571(0.0F);
						this.aClass1_Sub35_Sub1_1.method5571(1.0F);
						this.aClass1_Sub35_Sub1_1.method5571((float) local176 * local76 + local159);
						this.aClass1_Sub35_Sub1_1.method5571(local165 + local81 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5571(local90 * (float) local176 + local171);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
					}
					if (this.anIntArray436[local97] > 64) {
						local442 = this.anIntArray436[local97] - 64 - 1;
						for (local135 = this.anIntArray437[local442] - 1; local135 >= 0; local135--) {
							local458 = this.aClass8_Sub2_Sub1ArrayArray2[local442][local135];
							local461 = local458.anInt5209;
							local148 = (byte) (local461 >> 16);
							local153 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local171 = local458.anInt5208 >> 12;
							local491 = local458.anInt5211 >> 12;
							local497 = local458.anInt5210 >> 12;
							local502 = local458.anInt5212 >> 12;
							this.aClass1_Sub35_Sub1_1.method5571(0.0F);
							this.aClass1_Sub35_Sub1_1.method5571(0.0F);
							this.aClass1_Sub35_Sub1_1.method5571(local171 + (float) -local502 * local44);
							this.aClass1_Sub35_Sub1_1.method5571(local491 + (float) -local502 * local48);
							this.aClass1_Sub35_Sub1_1.method5571((float) -local502 * local58 + local497);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
							this.aClass1_Sub35_Sub1_1.method5571(1.0F);
							this.aClass1_Sub35_Sub1_1.method5571(0.0F);
							this.aClass1_Sub35_Sub1_1.method5571(local63 * (float) local502 + local171);
							this.aClass1_Sub35_Sub1_1.method5571(local491 + local67 * (float) local502);
							this.aClass1_Sub35_Sub1_1.method5571(local497 + local71 * (float) local502);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
							this.aClass1_Sub35_Sub1_1.method5571(1.0F);
							this.aClass1_Sub35_Sub1_1.method5571(1.0F);
							this.aClass1_Sub35_Sub1_1.method5571((float) local502 * local44 + local171);
							this.aClass1_Sub35_Sub1_1.method5571((float) local502 * local48 + local491);
							this.aClass1_Sub35_Sub1_1.method5571(local497 + (float) local502 * local58);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
							this.aClass1_Sub35_Sub1_1.method5571(0.0F);
							this.aClass1_Sub35_Sub1_1.method5571(1.0F);
							this.aClass1_Sub35_Sub1_1.method5571(local171 + local76 * (float) local502);
							this.aClass1_Sub35_Sub1_1.method5571(local491 + (float) local502 * local81);
							this.aClass1_Sub35_Sub1_1.method5571(local497 + local90 * (float) local502);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
						}
					}
				}
			}
		} else {
			for (local97 = arg0 - 1; local97 >= 0; local97--) {
				local114 = this.anIntArray436[local97] <= 64 ? this.anIntArray436[local97] : 64;
				if (local114 > 0) {
					for (local123 = local114 - 1; local123 >= 0; local123--) {
						local132 = this.aClass8_Sub2_Sub1ArrayArray1[local97][local123];
						local135 = local132.anInt5209;
						local140 = (byte) (local135 >> 16);
						local145 = (byte) (local135 >> 8);
						local148 = (byte) local135;
						local153 = (byte) (local135 >>> 24);
						local159 = local132.anInt5208 >> 12;
						local165 = local132.anInt5211 >> 12;
						local171 = local132.anInt5210 >> 12;
						local176 = local132.anInt5212 >> 12;
						this.aClass1_Sub35_Sub1_1.method5572(0.0F);
						this.aClass1_Sub35_Sub1_1.method5572(0.0F);
						this.aClass1_Sub35_Sub1_1.method5572(local159 + local44 * (float) -local176);
						this.aClass1_Sub35_Sub1_1.method5572(local48 * (float) -local176 + local165);
						this.aClass1_Sub35_Sub1_1.method5572(local58 * (float) -local176 + local171);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
						this.aClass1_Sub35_Sub1_1.method5572(1.0F);
						this.aClass1_Sub35_Sub1_1.method5572(0.0F);
						this.aClass1_Sub35_Sub1_1.method5572(local159 + local63 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5572(local165 + local67 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5572(local171 + (float) local176 * local71);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
						this.aClass1_Sub35_Sub1_1.method5572(1.0F);
						this.aClass1_Sub35_Sub1_1.method5572(1.0F);
						this.aClass1_Sub35_Sub1_1.method5572(local44 * (float) local176 + local159);
						this.aClass1_Sub35_Sub1_1.method5572(local48 * (float) local176 + local165);
						this.aClass1_Sub35_Sub1_1.method5572(local171 + local58 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
						this.aClass1_Sub35_Sub1_1.method5572(0.0F);
						this.aClass1_Sub35_Sub1_1.method5572(1.0F);
						this.aClass1_Sub35_Sub1_1.method5572((float) local176 * local76 + local159);
						this.aClass1_Sub35_Sub1_1.method5572(local165 + (float) local176 * local81);
						this.aClass1_Sub35_Sub1_1.method5572(local171 + local90 * (float) local176);
						this.aClass1_Sub35_Sub1_1.method5777(local140);
						this.aClass1_Sub35_Sub1_1.method5777(local145);
						this.aClass1_Sub35_Sub1_1.method5777(local148);
						this.aClass1_Sub35_Sub1_1.method5777(local153);
					}
					if (this.anIntArray436[local97] > 64) {
						local442 = this.anIntArray436[local97] - 64 - 1;
						for (local135 = this.anIntArray437[local442] - 1; local135 >= 0; local135--) {
							local458 = this.aClass8_Sub2_Sub1ArrayArray2[local442][local135];
							local461 = local458.anInt5209;
							local148 = (byte) (local461 >> 16);
							local153 = (byte) (local461 >> 8);
							local474 = (byte) local461;
							local479 = (byte) (local461 >>> 24);
							local171 = local458.anInt5208 >> 12;
							local491 = local458.anInt5211 >> 12;
							local497 = local458.anInt5210 >> 12;
							local502 = local458.anInt5212 >> 12;
							this.aClass1_Sub35_Sub1_1.method5572(0.0F);
							this.aClass1_Sub35_Sub1_1.method5572(0.0F);
							this.aClass1_Sub35_Sub1_1.method5572(local171 + (float) -local502 * local44);
							this.aClass1_Sub35_Sub1_1.method5572(local48 * (float) -local502 + local491);
							this.aClass1_Sub35_Sub1_1.method5572(local58 * (float) -local502 + local497);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
							this.aClass1_Sub35_Sub1_1.method5572(1.0F);
							this.aClass1_Sub35_Sub1_1.method5572(0.0F);
							this.aClass1_Sub35_Sub1_1.method5572((float) local502 * local63 + local171);
							this.aClass1_Sub35_Sub1_1.method5572((float) local502 * local67 + local491);
							this.aClass1_Sub35_Sub1_1.method5572((float) local502 * local71 + local497);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
							this.aClass1_Sub35_Sub1_1.method5572(1.0F);
							this.aClass1_Sub35_Sub1_1.method5572(1.0F);
							this.aClass1_Sub35_Sub1_1.method5572(local44 * (float) local502 + local171);
							this.aClass1_Sub35_Sub1_1.method5572(local491 + local48 * (float) local502);
							this.aClass1_Sub35_Sub1_1.method5572(local497 + local58 * (float) local502);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
							this.aClass1_Sub35_Sub1_1.method5572(0.0F);
							this.aClass1_Sub35_Sub1_1.method5572(1.0F);
							this.aClass1_Sub35_Sub1_1.method5572(local76 * (float) local502 + local171);
							this.aClass1_Sub35_Sub1_1.method5572(local491 + (float) local502 * local81);
							this.aClass1_Sub35_Sub1_1.method5572(local90 * (float) local502 + local497);
							this.aClass1_Sub35_Sub1_1.method5777(local148);
							this.aClass1_Sub35_Sub1_1.method5777(local153);
							this.aClass1_Sub35_Sub1_1.method5777(local474);
							this.aClass1_Sub35_Sub1_1.method5777(local479);
						}
					}
				}
			}
		}
		if (this.aClass1_Sub35_Sub1_1.anInt7214 != 0) {
			this.anInterface5_2.method7484(this.aClass1_Sub35_Sub1_1.anInt7214, 24, this.aClass1_Sub35_Sub1_1.aByteArray85);
			arg1.method5259(this.aClass213_2, null, this.aClass213_3, this.aClass213_1);
			arg1.method5229(this.aClass1_Sub35_Sub1_1.anInt7214 / 24);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!ok;B)V")
	private void method4486(@OriginalArg(0) Class134_Sub2 arg0) {
		arg0.method5231(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		if (Static299.aFloat120 != arg0.aFloat157) {
			arg0.ra(Static299.aFloat120);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!ok;I)V")
	private void method4487(@OriginalArg(1) Class134_Sub2 arg0, @OriginalArg(2) int arg1) {
		Static299.aFloat120 = arg0.aFloat157;
		arg0.method5208((float) arg1);
		arg0.method5196();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		arg0.method5231(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!ok;)V")
	public void method4488(@OriginalArg(1) Class134_Sub2 arg0) {
		this.anInterface5_2 = arg0.method5270(true, 196584, 24, null);
		this.aClass213_2 = new Class213(this.anInterface5_2, 5126, 2, 0);
		this.aClass213_1 = new Class213(this.anInterface5_2, 5126, 3, 8);
		this.aClass213_3 = new Class213(this.anInterface5_2, 5121, 4, 20);
	}
}
