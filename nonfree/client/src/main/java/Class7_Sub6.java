import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class7_Sub6 extends Class7 {

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "[Lclient!ni;")
	public static final Class169[] aClass169Array1 = new Class169[5];

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
	private int anInt589;

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!bo", name = "q", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_7;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "Lclient!ne;")
	private final Class165_Sub2 aClass165_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Lclient!wr;")
	private final Class7_Sub30 aClass7_Sub30_1;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	private final int anInt599;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
	private final int anInt591;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
	private final int anInt596;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	private final int anInt595;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!bo", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!bo", name = "A", descriptor = "Lclient!gk;")
	private Class7_Sub14 aClass7_Sub14_1;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "Lclient!pb;")
	private Class7_Sub14_Sub2 aClass7_Sub14_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "Lclient!mt;")
	private Class164 aClass164_5;

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Lclient!oj;")
	private final Interface10 anInterface10_2;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "Lclient!lm;")
	private final Interface8 anInterface8_1;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Lclient!ft;")
	private final Class87 aClass87_2;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "Lclient!ft;")
	private final Class87 aClass87_1;

	static {
		for (@Pc(6) int local6 = 0; local6 < aClass169Array1.length; local6++) {
			aClass169Array1[local6] = new Class169();
		}
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!vd;Lclient!ne;Lclient!wr;[I)V")
	public Class7_Sub6(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) Class165_Sub2 arg1, @OriginalArg(2) Class7_Sub30 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass51_Sub2_7 = arg0;
		this.aClass165_Sub2_1 = arg1;
		this.aClass7_Sub30_1 = arg2;
		@Pc(23) int local23 = this.aClass7_Sub30_1.method5031() - (arg1.anInt4485 >> 1);
		this.anInt599 = this.aClass7_Sub30_1.method5032() - local23 >> arg1.anInt4488;
		this.anInt591 = this.aClass7_Sub30_1.method5032() + local23 >> arg1.anInt4488;
		this.anInt596 = this.aClass7_Sub30_1.method5023() - local23 >> arg1.anInt4488;
		this.anInt595 = this.aClass7_Sub30_1.method5023() + local23 >> arg1.anInt4488;
		@Pc(78) int local78 = this.anInt591 + 1 - this.anInt599;
		@Pc(87) int local87 = this.anInt595 + 1 - this.anInt596;
		this.aFloatArrayArray2 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray3 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray1 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(179) int local179;
		@Pc(194) int local194;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = local116 + this.anInt596;
			if (local123 > 0 && this.aClass165_Sub2_1.anInt4490 - 1 > local123) {
				for (local141 = 0; local141 <= local78; local141++) {
					local148 = this.anInt599 + local141;
					if (local148 > 0 && local148 < this.aClass165_Sub2_1.anInt4489 - 1) {
						local179 = arg1.l(local148 + 1, local123) - arg1.l(local148 - 1, local123);
						local194 = arg1.l(local148, local123 + 1) - arg1.l(local148, local123 - 1);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local194 * local194 + local179 * local179 + 65536)));
						this.aFloatArrayArray1[local141][local116] = local209 * (float) local179;
						this.aFloatArrayArray2[local141][local116] = -256.0F * local209;
						this.aFloatArrayArray3[local141][local116] = local209 * (float) local194;
					}
				}
			}
		}
		local123 = 0;
		local141 = 0;
		for (local148 = this.anInt596; local148 <= this.anInt595; local148++) {
			if (local148 >= 0 && local148 < arg1.anInt4490) {
				for (local179 = this.anInt599; local179 <= this.anInt591; local179++) {
					if (local179 >= 0 && local179 < arg1.anInt4489) {
						local194 = arg3[local141];
						@Pc(305) int[] local305 = arg1.anIntArrayArrayArray6[local179][local148];
						if (local305 != null && local194 != 0) {
							if (local194 == 1) {
								local123 += local305.length;
							} else {
								local123 += 3;
							}
						}
					}
					local141++;
				}
			} else {
				local141 += this.anInt591 - this.anInt599;
			}
		}
		if (local123 > 0) {
			this.aClass7_Sub14_1 = new Class7_Sub14(local123 * 2);
			this.aClass7_Sub14_Sub2_1 = new Class7_Sub14_Sub2(local123 * 16);
			this.aClass164_5 = new Class164(Static444.method5654(local123));
			local141 = 0;
			local179 = 0;
			for (local194 = this.anInt596; local194 <= this.anInt595; local194++) {
				if (local194 >= 0 && arg1.anInt4490 > local194) {
					@Pc(404) int local404 = 0;
					for (@Pc(407) int local407 = this.anInt599; local407 <= this.anInt591; local407++) {
						if (local407 >= 0 && arg1.anInt4489 > local407) {
							@Pc(426) int local426 = arg3[local141];
							@Pc(433) int[] local433 = arg1.anIntArrayArrayArray6[local407][local194];
							@Pc(440) int[] local440 = arg1.anIntArrayArrayArray7[local407][local194];
							if (local433 != null && local426 != 0) {
								if (local426 == 1) {
									for (@Pc(454) int local454 = 0; local454 < local433.length; local454++) {
										this.method470(local194, local404, local433[local454], local440[local454], local407, local179);
									}
								} else if (local426 == 3) {
									this.method470(local194, local404, 0, 0, local407, local179);
									this.method470(local194, local404, arg1.anInt4485, 0, local407, local179);
									this.method470(local194, local404, 0, arg1.anInt4485, local407, local179);
								} else if (local426 == 2) {
									this.method470(local194, local404, arg1.anInt4485, 0, local407, local179);
									this.method470(local194, local404, arg1.anInt4485, arg1.anInt4485, local407, local179);
									this.method470(local194, local404, 0, 0, local407, local179);
								} else if (local426 == 5) {
									this.method470(local194, local404, arg1.anInt4485, arg1.anInt4485, local407, local179);
									this.method470(local194, local404, 0, arg1.anInt4485, local407, local179);
									this.method470(local194, local404, arg1.anInt4485, 0, local407, local179);
								} else if (local426 == 4) {
									this.method470(local194, local404, 0, arg1.anInt4485, local407, local179);
									this.method470(local194, local404, 0, 0, local407, local179);
									this.method470(local194, local404, arg1.anInt4485, arg1.anInt4485, local407, local179);
								}
							}
						}
						local141++;
						local404++;
					}
				} else {
					local141 += this.anInt591 - this.anInt599;
				}
				local179++;
			}
			this.anInterface10_2 = this.aClass51_Sub2_7.method5383(this.aClass7_Sub14_1.aByteArray75, false, this.aClass7_Sub14_1.anInt4989);
			this.anInterface8_1 = this.aClass51_Sub2_7.method5433(this.aClass7_Sub14_Sub2_1.aByteArray75, false, 16, this.aClass7_Sub14_Sub2_1.anInt4989);
			this.aClass87_2 = new Class87(this.anInterface8_1, 5126, 3, 0);
			this.aClass87_1 = new Class87(this.anInterface8_1, 5121, 4, 12);
		} else {
			this.aClass87_1 = null;
			this.anInterface8_1 = null;
			this.aClass87_2 = null;
			this.anInterface10_2 = null;
		}
		this.aClass7_Sub14_1 = null;
		this.aClass7_Sub14_Sub2_1 = null;
		this.aFloatArrayArray1 = this.aFloatArrayArray2 = this.aFloatArrayArray3 = null;
		this.aClass164_5 = null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIIII)V")
	private void method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg2 + (arg4 << this.aClass165_Sub2_1.anInt4488);
		@Pc(25) int local25 = arg3 + (arg0 << this.aClass165_Sub2_1.anInt4488);
		@Pc(31) int local31 = this.aClass165_Sub2_1.a(local16, local25);
		if ((arg2 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | 0xFFFFL << 16 & (long) local25 << 16;
			@Pc(67) Class7 local67 = this.aClass164_5.method3512(local7);
			if (local67 != null) {
				this.method471(((Class7_Sub19) local67).aShort32);
				return;
			}
		}
		@Pc(87) short local87 = (short) this.anInt594++;
		if (local7 != -1L) {
			this.aClass164_5.method3508(local7, new Class7_Sub19(local87));
		}
		@Pc(125) float local125;
		@Pc(118) float local118;
		@Pc(132) float local132;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(330) float local330;
		if (arg2 == 0 && arg3 == 0) {
			local118 = this.aFloatArrayArray2[arg1][arg5];
			local125 = this.aFloatArrayArray1[arg1][arg5];
			local132 = this.aFloatArrayArray3[arg1][arg5];
		} else if (this.aClass165_Sub2_1.anInt4485 == arg2 && arg3 == 0) {
			local132 = this.aFloatArrayArray3[arg1 + 1][arg5];
			local125 = this.aFloatArrayArray1[arg1 + 1][arg5];
			local118 = this.aFloatArrayArray2[arg1 + 1][arg5];
		} else if (this.aClass165_Sub2_1.anInt4485 == arg2 && this.aClass165_Sub2_1.anInt4485 == arg3) {
			local132 = this.aFloatArrayArray3[arg1 + 1][arg5 + 1];
			local118 = this.aFloatArrayArray2[arg1 + 1][arg5 + 1];
			local125 = this.aFloatArrayArray1[arg1 + 1][arg5 + 1];
		} else if (arg2 == 0 && arg3 == this.aClass165_Sub2_1.anInt4485) {
			local132 = this.aFloatArrayArray3[arg1][arg5 + 1];
			local125 = this.aFloatArrayArray1[arg1][arg5 + 1];
			local118 = this.aFloatArrayArray2[arg1][arg5 + 1];
		} else {
			local209 = (float) arg2 / (float) this.aClass165_Sub2_1.anInt4485;
			local217 = (float) arg3 / (float) this.aClass165_Sub2_1.anInt4485;
			local224 = this.aFloatArrayArray1[arg1][arg5];
			local231 = this.aFloatArrayArray2[arg1][arg5];
			local238 = this.aFloatArrayArray3[arg1][arg5];
			local247 = this.aFloatArrayArray1[arg1 + 1][arg5];
			local256 = this.aFloatArrayArray2[arg1 + 1][arg5];
			@Pc(272) float local272 = local238 + (this.aFloatArrayArray3[arg1][arg5 + 1] - local238) * local209;
			@Pc(288) float local288 = local231 + (this.aFloatArrayArray2[arg1][arg5 + 1] - local231) * local209;
			@Pc(306) float local306 = local256 + local209 * (this.aFloatArrayArray2[arg1 + 1][arg5 + 1] - local256);
			@Pc(321) float local321 = local224 + (this.aFloatArrayArray1[arg1][arg5 + 1] - local224) * local209;
			local330 = this.aFloatArrayArray3[arg1 + 1][arg5];
			@Pc(348) float local348 = local247 + (this.aFloatArrayArray1[arg1 + 1][arg5 + 1] - local247) * local209;
			local118 = local288 + (local306 - local288) * local217;
			@Pc(374) float local374 = local330 + (this.aFloatArrayArray3[arg1 + 1][arg5 + 1] - local330) * local209;
			local125 = local321 + (local348 - local321) * local217;
			local132 = (local374 - local272) * local217 + local272;
		}
		local209 = this.aClass7_Sub30_1.method5032() - local16;
		local217 = this.aClass7_Sub30_1.method5029() - local31;
		local224 = this.aClass7_Sub30_1.method5023() - local25;
		local231 = (float) Math.sqrt((double) (local224 * local224 + local217 * local217 + local209 * local209));
		local238 = 1.0F / local231;
		local217 *= local238;
		local209 *= local238;
		local224 *= local238;
		local247 = local231 / (float) this.aClass7_Sub30_1.method5031();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local330 = local125 * local209 + local217 * local118 + local132 * local224;
		if (local330 < 0.0F) {
			local330 = 0.0F;
		}
		@Pc(556) float local556 = local330 * 2.0F * local256;
		if (local556 > 1.0F) {
			local556 = 1.0F;
		}
		@Pc(567) int local567 = this.aClass7_Sub30_1.method5025();
		@Pc(577) int local577 = (int) (local556 * (float) (local567 >> 16 & 0xFF));
		if (local577 > 255) {
			local577 = 255;
		}
		@Pc(594) int local594 = (int) (local556 * (float) (local567 >> 8 & 0xFF));
		if (local594 > 255) {
			local594 = 255;
		}
		@Pc(607) int local607 = (int) ((float) (local567 & 0xFF) * local556);
		if (local607 > 255) {
			local607 = 255;
		}
		if (this.aClass51_Sub2_7.aBoolean461) {
			this.aClass7_Sub14_Sub2_1.method3996((float) local16);
			this.aClass7_Sub14_Sub2_1.method3996((float) local31);
			this.aClass7_Sub14_Sub2_1.method3996((float) local25);
		} else {
			this.aClass7_Sub14_Sub2_1.method3994((float) local16);
			this.aClass7_Sub14_Sub2_1.method3994((float) local31);
			this.aClass7_Sub14_Sub2_1.method3994((float) local25);
		}
		this.aClass7_Sub14_Sub2_1.method3970(local577);
		this.aClass7_Sub14_Sub2_1.method3970(local594);
		this.aClass7_Sub14_Sub2_1.method3970(local607);
		this.aClass7_Sub14_Sub2_1.method3970(255);
		this.method471(local87);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IS)V")
	private void method471(@OriginalArg(1) short arg0) {
		if (this.aClass51_Sub2_7.aBoolean461) {
			this.aClass7_Sub14_1.method3993(arg0);
		} else {
			this.aClass7_Sub14_1.method3976(arg0);
		}
		this.anInt589++;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "([[ZIZII)V")
	public void method474(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface10_2 == null || (arg1 + arg2 < this.anInt599 || (this.anInt591 < arg2 - arg1 || (arg1 + arg3 < this.anInt596 || arg3 - arg1 > this.anInt595)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt596; local54 <= this.anInt595; local54++) {
			for (@Pc(59) int local59 = this.anInt599; local59 <= this.anInt591; local59++) {
				@Pc(66) int local66 = local59 - arg2;
				@Pc(71) int local71 = local54 - arg3;
				if (-arg1 < local66 && local66 < arg1 && -arg1 < local71 && arg1 > local71 && arg0[local66 + arg1][arg1 + local71]) {
					this.aClass51_Sub2_7.method5397((int) (this.aClass7_Sub30_1.method5024() * 255.0F) << 24);
					this.aClass51_Sub2_7.method5415(this.aClass87_2, this.aClass87_1, null, null);
					this.aClass51_Sub2_7.method5365(this.anInterface10_2, 0, this.anInt589);
					return;
				}
			}
		}
	}
}
