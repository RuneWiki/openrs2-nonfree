import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class2_Sub24 extends Class2 {

	@OriginalMember(owner = "client!eia", name = "x", descriptor = "I")
	private int anInt2578;

	@OriginalMember(owner = "client!eia", name = "z", descriptor = "Lclient!mfa;")
	private final Class2_Sub13 aClass2_Sub13_2;

	@OriginalMember(owner = "client!eia", name = "q", descriptor = "Lclient!al;")
	private final Class18_Sub1 aClass18_Sub1_2;

	@OriginalMember(owner = "client!eia", name = "M", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_11;

	@OriginalMember(owner = "client!eia", name = "n", descriptor = "I")
	private final int anInt2573;

	@OriginalMember(owner = "client!eia", name = "t", descriptor = "I")
	private final int anInt2576;

	@OriginalMember(owner = "client!eia", name = "C", descriptor = "I")
	private final int anInt2582;

	@OriginalMember(owner = "client!eia", name = "A", descriptor = "I")
	private final int anInt2580;

	@OriginalMember(owner = "client!eia", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!eia", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!eia", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!eia", name = "r", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!eia", name = "G", descriptor = "Lclient!ol;")
	private Class2_Sub8 aClass2_Sub8_3;

	@OriginalMember(owner = "client!eia", name = "E", descriptor = "Lclient!bca;")
	private Class2_Sub8_Sub1 aClass2_Sub8_Sub1_1;

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "Lclient!si;")
	private Class335 aClass335_9;

	@OriginalMember(owner = "client!eia", name = "F", descriptor = "Lclient!tj;")
	private final Interface20 anInterface20_1;

	@OriginalMember(owner = "client!eia", name = "L", descriptor = "Lclient!cq;")
	private final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!eia", name = "v", descriptor = "Lclient!pc;")
	private final Class274 aClass274_6;

	@OriginalMember(owner = "client!eia", name = "K", descriptor = "Lclient!pc;")
	private final Class274 aClass274_7;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(Lclient!lea;Lclient!al;Lclient!mfa;[I)V")
	public Class2_Sub24(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) Class18_Sub1 arg1, @OriginalArg(2) Class2_Sub13 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass2_Sub13_2 = arg2;
		this.aClass18_Sub1_2 = arg1;
		this.aClass101_Sub2_11 = arg0;
		@Pc(23) int local23 = this.aClass2_Sub13_2.method9407() - (arg1.anInt9739 >> 1);
		this.anInt2573 = this.aClass2_Sub13_2.method9411() - local23 >> arg1.anInt9740;
		this.anInt2576 = local23 + this.aClass2_Sub13_2.method9411() >> arg1.anInt9740;
		this.anInt2582 = this.aClass2_Sub13_2.method9406() - local23 >> arg1.anInt9740;
		this.anInt2580 = local23 + this.aClass2_Sub13_2.method9406() >> arg1.anInt9740;
		@Pc(78) int local78 = this.anInt2576 + 1 - this.anInt2573;
		@Pc(86) int local86 = this.anInt2580 + 1 - this.anInt2582;
		this.aFloatArrayArray6 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray8 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(166) int local166;
		@Pc(182) int local182;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = local115 + this.anInt2582;
			if (local122 > 0 && this.aClass18_Sub1_2.anInt9742 - 1 > local122) {
				for (local133 = 0; local133 <= local78; local133++) {
					local141 = local133 + this.anInt2573;
					if (local141 > 0 && this.aClass18_Sub1_2.anInt9741 - 1 > local141) {
						local166 = arg1.method8537(local122, local141 + 1) - arg1.method8537(local122, local141 - 1);
						local182 = arg1.method8537(local122 + 1, local141) - arg1.method8537(local122 - 1, local141);
						@Pc(197) float local197 = (float) (1.0D / Math.sqrt((double) (local166 * local166 + local182 * local182 + 65536)));
						this.aFloatArrayArray6[local133][local115] = (float) local166 * local197;
						this.aFloatArrayArray8[local133][local115] = local197 * -256.0F;
						this.aFloatArrayArray7[local133][local115] = (float) local182 * local197;
					}
				}
			}
		}
		local122 = 0;
		@Pc(302) int local302;
		for (local133 = this.anInt2582; local133 <= this.anInt2580; local133++) {
			if (local133 >= 0 && arg1.anInt9742 > local133) {
				for (local141 = this.anInt2573; local141 <= this.anInt2576; local141++) {
					if (local141 >= 0 && arg1.anInt9741 > local141) {
						local166 = arg3[local122];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray4[local141][local133];
						if (local291 != null && local166 != 0) {
							if (local166 == 1) {
								local302 = 0;
								while (local302 < local291.length) {
									if (local291[local302++] != -1 && local291[local302++] != -1 && local291[local302++] != -1) {
										this.anInt2575 += 3;
									}
								}
							} else {
								this.anInt2575 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt2576 - this.anInt2573;
			}
		}
		if (this.anInt2575 > 0) {
			this.aClass2_Sub8_3 = new Class2_Sub8(this.anInt2575 * 2);
			this.aClass2_Sub8_Sub1_1 = new Class2_Sub8_Sub1(this.anInt2575 * 16);
			this.aClass335_9 = new Class335(Static432.method7064(this.anInt2575));
			local122 = 0;
			local141 = 0;
			for (local166 = this.anInt2582; local166 <= this.anInt2580; local166++) {
				if (local166 >= 0 && local166 < arg1.anInt9742) {
					local182 = 0;
					for (local302 = this.anInt2573; local302 <= this.anInt2576; local302++) {
						if (local302 >= 0 && arg1.anInt9741 > local302) {
							@Pc(429) int local429 = arg3[local122];
							@Pc(436) int[] local436 = arg1.anIntArrayArrayArray4[local302][local166];
							if (local436 != null && local429 != 0) {
								if (local429 == 1) {
									@Pc(455) int[] local455 = arg1.anIntArrayArrayArray7[local302][local166];
									@Pc(462) int[] local462 = arg1.anIntArrayArrayArray3[local302][local166];
									@Pc(464) int local464 = 0;
									label107: while (true) {
										while (true) {
											if (local436.length <= local464) {
												break label107;
											}
											if (local436[local464] == -1 || local436[local464 + 1] == -1 || local436[local464 + 2] == -1) {
												local464 += 3;
											} else {
												this.method2390(local302, local182, local141, local462[local464], local166, local455[local464]);
												local464++;
												this.method2390(local302, local182, local141, local462[local464], local166, local455[local464]);
												local464++;
												this.method2390(local302, local182, local141, local462[local464], local166, local455[local464]);
												local464++;
											}
										}
									}
								} else if (local429 == 3) {
									this.method2390(local302, local182, local141, 0, local166, 0);
									this.method2390(local302, local182, local141, 0, local166, arg1.anInt9739);
									this.method2390(local302, local182, local141, arg1.anInt9739, local166, 0);
								} else if (local429 == 2) {
									this.method2390(local302, local182, local141, 0, local166, arg1.anInt9739);
									this.method2390(local302, local182, local141, arg1.anInt9739, local166, arg1.anInt9739);
									this.method2390(local302, local182, local141, 0, local166, 0);
								} else if (local429 == 5) {
									this.method2390(local302, local182, local141, arg1.anInt9739, local166, arg1.anInt9739);
									this.method2390(local302, local182, local141, arg1.anInt9739, local166, 0);
									this.method2390(local302, local182, local141, 0, local166, arg1.anInt9739);
								} else if (local429 == 4) {
									this.method2390(local302, local182, local141, arg1.anInt9739, local166, 0);
									this.method2390(local302, local182, local141, 0, local166, 0);
									this.method2390(local302, local182, local141, arg1.anInt9739, local166, arg1.anInt9739);
								}
							}
						}
						local182++;
						local122++;
					}
				} else {
					local122 += this.anInt2576 - this.anInt2573;
				}
				local141++;
			}
			this.anInterface20_1 = this.aClass101_Sub2_11.method5639(this.aClass2_Sub8_3.lb, false, this.aClass2_Sub8_3.anInt5725);
			this.anInterface2_2 = this.aClass101_Sub2_11.method5642(this.aClass2_Sub8_Sub1_1.lb, 16, this.aClass2_Sub8_Sub1_1.anInt5725, false);
			this.aClass274_6 = new Class274(this.anInterface2_2, 5126, 3, 0);
			this.aClass274_7 = new Class274(this.anInterface2_2, 5121, 4, 12);
		} else {
			this.aClass274_7 = null;
			this.aClass274_6 = null;
			this.anInterface20_1 = null;
			this.anInterface2_2 = null;
		}
		this.aClass2_Sub8_3 = null;
		this.aClass335_9 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.aClass2_Sub8_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIB[[Z)V")
	public void method2387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface20_1 == null || (this.anInt2573 > arg1 + arg2 || (this.anInt2576 < arg1 - arg2 || (this.anInt2582 > arg0 + arg2 || this.anInt2580 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(43) int local43 = this.anInt2582; local43 <= this.anInt2580; local43++) {
			for (@Pc(48) int local48 = this.anInt2573; local48 <= this.anInt2576; local48++) {
				@Pc(55) int local55 = local48 - arg1;
				@Pc(60) int local60 = local43 - arg0;
				if (local55 > -arg2 && local55 < arg2 && local60 > -arg2 && local60 < arg2 && arg3[arg2 + local55][arg2 + local60]) {
					this.aClass101_Sub2_11.method5649((int) (this.aClass2_Sub13_2.method9404() * 255.0F) << 24);
					this.aClass101_Sub2_11.method5650((Class274) null, this.aClass274_6, this.aClass274_7, (Class274) null);
					this.aClass101_Sub2_11.method5645(this.anInt2575, 0, this.anInterface20_1);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIIBI)V")
	private void method2390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg5 + (arg0 << this.aClass18_Sub1_2.anInt9740);
		@Pc(23) int local23 = (arg4 << this.aClass18_Sub1_2.anInt9740) + arg3;
		@Pc(30) int local30 = this.aClass18_Sub1_2.method8542(local23, local15);
		if ((arg5 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local15 & 0xFFFFL | (long) local23 << 16 & 0xFFFFL << 16;
			@Pc(63) Class2 local63 = this.aClass335_9.method8357(local7);
			if (local63 != null) {
				this.method2391(((Class2_Sub32) local63).aShort54);
				return;
			}
		}
		@Pc(85) short local85 = (short) this.anInt2578++;
		if (local7 != -1L) {
			this.aClass335_9.method8356(new Class2_Sub32(local85), local7);
		}
		@Pc(165) float local165;
		@Pc(154) float local154;
		@Pc(143) float local143;
		@Pc(214) float local214;
		@Pc(222) float local222;
		@Pc(229) float local229;
		@Pc(236) float local236;
		@Pc(243) float local243;
		@Pc(252) float local252;
		@Pc(261) float local261;
		@Pc(270) float local270;
		if (arg5 == 0 && arg3 == 0) {
			local165 = this.aFloatArrayArray6[arg1][arg2];
			local143 = this.aFloatArrayArray7[arg1][arg2];
			local154 = this.aFloatArrayArray8[arg1][arg2];
		} else if (this.aClass18_Sub1_2.anInt9739 == arg5 && arg3 == 0) {
			local143 = this.aFloatArrayArray7[arg1 + 1][arg2];
			local165 = this.aFloatArrayArray6[arg1 + 1][arg2];
			local154 = this.aFloatArrayArray8[arg1 + 1][arg2];
		} else if (arg5 == this.aClass18_Sub1_2.anInt9739 && this.aClass18_Sub1_2.anInt9739 == arg3) {
			local143 = this.aFloatArrayArray7[arg1 + 1][arg2 + 1];
			local154 = this.aFloatArrayArray8[arg1 + 1][arg2 + 1];
			local165 = this.aFloatArrayArray6[arg1 + 1][arg2 + 1];
		} else if (arg5 == 0 && this.aClass18_Sub1_2.anInt9739 == arg3) {
			local154 = this.aFloatArrayArray8[arg1][arg2 + 1];
			local143 = this.aFloatArrayArray7[arg1][arg2 + 1];
			local165 = this.aFloatArrayArray6[arg1][arg2 + 1];
		} else {
			local214 = (float) arg5 / (float) this.aClass18_Sub1_2.anInt9739;
			local222 = (float) arg3 / (float) this.aClass18_Sub1_2.anInt9739;
			local229 = this.aFloatArrayArray6[arg1][arg2];
			local236 = this.aFloatArrayArray8[arg1][arg2];
			local243 = this.aFloatArrayArray7[arg1][arg2];
			local252 = this.aFloatArrayArray6[arg1 + 1][arg2];
			local261 = this.aFloatArrayArray8[arg1 + 1][arg2];
			local270 = this.aFloatArrayArray7[arg1 + 1][arg2];
			@Pc(285) float local285 = local229 + local214 * (this.aFloatArrayArray6[arg1][arg2 + 1] - local229);
			@Pc(302) float local302 = local261 + local214 * (this.aFloatArrayArray8[arg1 + 1][arg2 + 1] - local261);
			@Pc(318) float local318 = local236 + (this.aFloatArrayArray8[arg1][arg2 + 1] - local236) * local214;
			@Pc(336) float local336 = local252 + (this.aFloatArrayArray6[arg1 + 1][arg2 + 1] - local252) * local214;
			@Pc(352) float local352 = local243 + local214 * (this.aFloatArrayArray7[arg1][arg2 + 1] - local243);
			local154 = local318 + (local302 - local318) * local222;
			local165 = local285 + local222 * (local336 - local285);
			@Pc(387) float local387 = local270 + local214 * (this.aFloatArrayArray7[arg1 + 1][arg2 + 1] - local270);
			local143 = local352 + local222 * (local387 - local352);
		}
		local214 = (float) (this.aClass2_Sub13_2.method9411() - local15);
		local222 = (float) (this.aClass2_Sub13_2.method9410() - local30);
		local229 = (float) (this.aClass2_Sub13_2.method9406() - local23);
		local236 = (float) Math.sqrt((double) (local222 * local222 + local214 * local214 + local229 * local229));
		local243 = 1.0F / local236;
		local214 *= local243;
		local222 *= local243;
		local229 *= local243;
		local252 = local236 / (float) this.aClass2_Sub13_2.method9407();
		local261 = 1.0F - local252 * local252;
		if (local261 < 0.0F) {
			local261 = 0.0F;
		}
		local270 = local229 * local143 + local222 * local154 + local165 * local214;
		if (local270 < 0.0F) {
			local270 = 0.0F;
		}
		@Pc(549) float local549 = local270 * local261 * 2.0F;
		if (local549 > 1.0F) {
			local549 = 1.0F;
		}
		@Pc(560) int local560 = this.aClass2_Sub13_2.method9405();
		@Pc(570) int local570 = (int) ((float) (local560 >> 16 & 0xFF) * local549);
		if (local570 > 255) {
			local570 = 255;
		}
		@Pc(587) int local587 = (int) (local549 * (float) (local560 >> 8 & 0xFF));
		if (local587 > 255) {
			local587 = 255;
		}
		@Pc(602) int local602 = (int) (local549 * (float) (local560 & 0xFF));
		if (this.aClass101_Sub2_11.aBoolean470) {
			this.aClass2_Sub8_Sub1_1.method789((float) local15);
			this.aClass2_Sub8_Sub1_1.method789((float) local30);
			this.aClass2_Sub8_Sub1_1.method789((float) local23);
		} else {
			this.aClass2_Sub8_Sub1_1.method788((float) local15);
			this.aClass2_Sub8_Sub1_1.method788((float) local30);
			this.aClass2_Sub8_Sub1_1.method788((float) local23);
		}
		if (local602 > 255) {
			local602 = 255;
		}
		this.aClass2_Sub8_Sub1_1.method5170(local570);
		this.aClass2_Sub8_Sub1_1.method5170(local587);
		this.aClass2_Sub8_Sub1_1.method5170(local602);
		this.aClass2_Sub8_Sub1_1.method5170(255);
		this.method2391(local85);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(SI)V")
	private void method2391(@OriginalArg(0) short arg0) {
		if (this.aClass101_Sub2_11.aBoolean470) {
			this.aClass2_Sub8_3.method5192(arg0);
		} else {
			this.aClass2_Sub8_3.method5228(arg0);
		}
	}
}
