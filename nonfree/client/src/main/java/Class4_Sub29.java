import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class4_Sub29 extends Class4 {

	@OriginalMember(owner = "client!np", name = "A", descriptor = "I")
	private int anInt6936;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "Lclient!ul;")
	private final Class4_Sub24 aClass4_Sub24_2;

	@OriginalMember(owner = "client!np", name = "G", descriptor = "Lclient!sm;")
	private final Class83_Sub3 aClass83_Sub3_2;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_27;

	@OriginalMember(owner = "client!np", name = "k", descriptor = "I")
	private final int anInt6929;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "I")
	private final int anInt6931;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	private final int anInt6935;

	@OriginalMember(owner = "client!np", name = "H", descriptor = "I")
	private final int anInt6939;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	private int anInt6933;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "Lclient!un;")
	private Class4_Sub11 aClass4_Sub11_4;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "Lclient!kw;")
	private Class4_Sub11_Sub2 aClass4_Sub11_Sub2_3;

	@OriginalMember(owner = "client!np", name = "x", descriptor = "Lclient!waa;")
	private Class350 aClass350_28;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Lclient!uq;")
	private final Interface22 anInterface22_4;

	@OriginalMember(owner = "client!np", name = "F", descriptor = "Lclient!ew;")
	private final Interface10 anInterface10_5;

	@OriginalMember(owner = "client!np", name = "B", descriptor = "Lclient!rba;")
	private final Class284 aClass284_11;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Lclient!rba;")
	private final Class284 aClass284_10;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!kga;Lclient!sm;Lclient!ul;[I)V")
	public Class4_Sub29(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) Class83_Sub3 arg1, @OriginalArg(2) Class4_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass4_Sub24_2 = arg2;
		this.aClass83_Sub3_2 = arg1;
		this.aClass44_Sub3_27 = arg0;
		@Pc(23) int local23 = this.aClass4_Sub24_2.method7151() - (arg1.anInt8824 >> 1);
		this.anInt6929 = this.aClass4_Sub24_2.method7145() - local23 >> arg1.anInt8825;
		this.anInt6931 = local23 + this.aClass4_Sub24_2.method7145() >> arg1.anInt8825;
		this.anInt6935 = this.aClass4_Sub24_2.method7142() - local23 >> arg1.anInt8825;
		this.anInt6939 = local23 + this.aClass4_Sub24_2.method7142() >> arg1.anInt8825;
		@Pc(78) int local78 = this.anInt6931 + 1 - this.anInt6929;
		@Pc(87) int local87 = this.anInt6939 + 1 - this.anInt6935;
		this.aFloatArrayArray8 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray7 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray6 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(137) int local137;
		@Pc(144) int local144;
		@Pc(177) int local177;
		@Pc(194) int local194;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt6935 + local116;
			if (local123 > 0 && this.aClass83_Sub3_2.anInt8830 - 1 > local123) {
				for (local137 = 0; local137 <= local78; local137++) {
					local144 = this.anInt6929 + local137;
					if (local144 > 0 && this.aClass83_Sub3_2.anInt8829 - 1 > local144) {
						local177 = arg1.method7217(local123, local144 + 1) - arg1.method7217(local123, local144 - 1);
						local194 = arg1.method7217(local123 + 1, local144) - arg1.method7217(local123 - 1, local144);
						@Pc(209) float local209 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local194 * local194 + 65536)));
						this.aFloatArrayArray6[local137][local116] = (float) local177 * local209;
						this.aFloatArrayArray8[local137][local116] = -256.0F * local209;
						this.aFloatArrayArray7[local137][local116] = (float) local194 * local209;
					}
				}
			}
		}
		local123 = 0;
		@Pc(313) int local313;
		for (local137 = this.anInt6935; local137 <= this.anInt6939; local137++) {
			if (local137 >= 0 && arg1.anInt8830 > local137) {
				for (local144 = this.anInt6929; local144 <= this.anInt6931; local144++) {
					if (local144 >= 0 && arg1.anInt8829 > local144) {
						local177 = arg3[local123];
						@Pc(291) int[] local291 = arg1.anIntArrayArrayArray15[local144][local137];
						if (local291 != null && local177 != 0) {
							if (local177 == 1) {
								local313 = 0;
								while (local291.length > local313) {
									if (local291[local313++] != -1 && local291[local313++] != -1 && local291[local313++] != -1) {
										this.anInt6933 += 3;
									}
								}
							} else {
								this.anInt6933 += 3;
							}
						}
					}
					local123++;
				}
			} else {
				local123 += this.anInt6931 - this.anInt6929;
			}
		}
		if (this.anInt6933 > 0) {
			this.aClass4_Sub11_4 = new Class4_Sub11(this.anInt6933 * 2);
			this.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2(this.anInt6933 * 16);
			this.aClass350_28 = new Class350(Static341.method5553(this.anInt6933));
			local144 = 0;
			local123 = 0;
			for (local177 = this.anInt6935; local177 <= this.anInt6939; local177++) {
				if (local177 >= 0 && arg1.anInt8830 > local177) {
					local194 = 0;
					for (local313 = this.anInt6929; local313 <= this.anInt6931; local313++) {
						if (local313 >= 0 && local313 < arg1.anInt8829) {
							@Pc(451) int local451 = arg3[local123];
							@Pc(458) int[] local458 = arg1.anIntArrayArrayArray15[local313][local177];
							if (local458 != null && local451 != 0) {
								if (local451 == 1) {
									@Pc(619) int[] local619 = arg1.anIntArrayArrayArray17[local313][local177];
									@Pc(626) int[] local626 = arg1.anIntArrayArrayArray18[local313][local177];
									@Pc(628) int local628 = 0;
									label105: while (true) {
										while (true) {
											if (local458.length <= local628) {
												break label105;
											}
											if (local458[local628] == -1 || local458[local628 + 1] == -1 || local458[local628 + 2] == -1) {
												local628 += 3;
											} else {
												this.method5762(local313, local626[local628], local177, local144, local619[local628], local194);
												local628++;
												this.method5762(local313, local626[local628], local177, local144, local619[local628], local194);
												local628++;
												this.method5762(local313, local626[local628], local177, local144, local619[local628], local194);
												local628++;
											}
										}
									}
								} else if (local451 == 3) {
									this.method5762(local313, 0, local177, local144, 0, local194);
									this.method5762(local313, 0, local177, local144, arg1.anInt8824, local194);
									this.method5762(local313, arg1.anInt8824, local177, local144, 0, local194);
								} else if (local451 == 2) {
									this.method5762(local313, 0, local177, local144, arg1.anInt8824, local194);
									this.method5762(local313, arg1.anInt8824, local177, local144, arg1.anInt8824, local194);
									this.method5762(local313, 0, local177, local144, 0, local194);
								} else if (local451 == 5) {
									this.method5762(local313, arg1.anInt8824, local177, local144, arg1.anInt8824, local194);
									this.method5762(local313, arg1.anInt8824, local177, local144, 0, local194);
									this.method5762(local313, 0, local177, local144, arg1.anInt8824, local194);
								} else if (local451 == 4) {
									this.method5762(local313, arg1.anInt8824, local177, local144, 0, local194);
									this.method5762(local313, 0, local177, local144, 0, local194);
									this.method5762(local313, arg1.anInt8824, local177, local144, arg1.anInt8824, local194);
								}
							}
						}
						local194++;
						local123++;
					}
				} else {
					local123 += this.anInt6931 - this.anInt6929;
				}
				local144++;
			}
			this.anInterface22_4 = this.aClass44_Sub3_27.method4653(this.aClass4_Sub11_4.aByteArray68, false, this.aClass4_Sub11_4.anInt5831);
			this.anInterface10_5 = this.aClass44_Sub3_27.method4636(this.aClass4_Sub11_Sub2_3.aByteArray68, false, 16, this.aClass4_Sub11_Sub2_3.anInt5831);
			this.aClass284_11 = new Class284(this.anInterface10_5, 5126, 3, 0);
			this.aClass284_10 = new Class284(this.anInterface10_5, 5121, 4, 12);
		} else {
			this.aClass284_10 = null;
			this.aClass284_11 = null;
			this.anInterface22_4 = null;
			this.anInterface10_5 = null;
		}
		this.aClass350_28 = null;
		this.aClass4_Sub11_4 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray8 = this.aFloatArrayArray7 = null;
		this.aClass4_Sub11_Sub2_3 = null;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(SI)V")
	private void method5758(@OriginalArg(0) short arg0) {
		if (this.aClass44_Sub3_27.aBoolean399) {
			this.aClass4_Sub11_4.method4937(arg0);
		} else {
			this.aClass4_Sub11_4.method4912(arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "([[ZIIZI)V")
	public void method5760(@OriginalArg(0) boolean[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface22_4 == null || (this.anInt6929 > arg2 + arg1 || (arg2 - arg1 > this.anInt6931 || (this.anInt6935 > arg3 + arg1 || this.anInt6939 < arg3 - arg1)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt6935; local55 <= this.anInt6939; local55++) {
			for (@Pc(60) int local60 = this.anInt6929; local60 <= this.anInt6931; local60++) {
				@Pc(67) int local67 = local60 - arg2;
				@Pc(71) int local71 = local55 - arg3;
				if (-arg1 < local67 && local67 < arg1 && local71 > -arg1 && local71 < arg1 && arg0[arg1 + local67][arg1 + local71]) {
					this.aClass44_Sub3_27.method4670((int) (this.aClass4_Sub24_2.method7144() * 255.0F) << 24);
					this.aClass44_Sub3_27.method4633(null, this.aClass284_11, null, this.aClass284_10);
					this.aClass44_Sub3_27.method4657(this.anInt6933, 0, this.anInterface22_4);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIII)V")
	private void method5762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg4 + (arg0 << this.aClass83_Sub3_2.anInt8825);
		@Pc(25) int local25 = arg1 + (arg2 << this.aClass83_Sub3_2.anInt8825);
		@Pc(32) int local32 = this.aClass83_Sub3_2.method7213(local16, local25);
		if ((arg4 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = ((long) local25 & 0xFFFFL) << 16 | (long) local16 & 0xFFFFL;
			@Pc(64) Class4 local64 = this.aClass350_28.method8207(local7);
			if (local64 != null) {
				this.method5758(((Class4_Sub30) local64).aShort82);
				return;
			}
		}
		@Pc(82) short local82 = (short) this.anInt6936++;
		if (local7 != -1L) {
			this.aClass350_28.method8199(local7, new Class4_Sub30(local82));
		}
		@Pc(109) float local109;
		@Pc(116) float local116;
		@Pc(123) float local123;
		@Pc(239) float local239;
		@Pc(247) float local247;
		@Pc(254) float local254;
		@Pc(261) float local261;
		@Pc(268) float local268;
		@Pc(277) float local277;
		@Pc(286) float local286;
		@Pc(362) float local362;
		if (arg4 == 0 && arg1 == 0) {
			local109 = this.aFloatArrayArray6[arg5][arg3];
			local116 = this.aFloatArrayArray8[arg5][arg3];
			local123 = this.aFloatArrayArray7[arg5][arg3];
		} else if (this.aClass83_Sub3_2.anInt8824 == arg4 && arg1 == 0) {
			local109 = this.aFloatArrayArray6[arg5 + 1][arg3];
			local123 = this.aFloatArrayArray7[arg5 + 1][arg3];
			local116 = this.aFloatArrayArray8[arg5 + 1][arg3];
		} else if (this.aClass83_Sub3_2.anInt8824 == arg4 && arg1 == this.aClass83_Sub3_2.anInt8824) {
			local116 = this.aFloatArrayArray8[arg5 + 1][arg3 + 1];
			local123 = this.aFloatArrayArray7[arg5 + 1][arg3 + 1];
			local109 = this.aFloatArrayArray6[arg5 + 1][arg3 + 1];
		} else if (arg4 == 0 && arg1 == this.aClass83_Sub3_2.anInt8824) {
			local109 = this.aFloatArrayArray6[arg5][arg3 + 1];
			local116 = this.aFloatArrayArray8[arg5][arg3 + 1];
			local123 = this.aFloatArrayArray7[arg5][arg3 + 1];
		} else {
			local239 = (float) arg4 / (float) this.aClass83_Sub3_2.anInt8824;
			local247 = (float) arg1 / (float) this.aClass83_Sub3_2.anInt8824;
			local254 = this.aFloatArrayArray6[arg5][arg3];
			local261 = this.aFloatArrayArray8[arg5][arg3];
			local268 = this.aFloatArrayArray7[arg5][arg3];
			local277 = this.aFloatArrayArray6[arg5 + 1][arg3];
			local286 = this.aFloatArrayArray8[arg5 + 1][arg3];
			@Pc(304) float local304 = local286 + local239 * (this.aFloatArrayArray8[arg5 + 1][arg3 + 1] - local286);
			@Pc(320) float local320 = local254 + local239 * (this.aFloatArrayArray6[arg5][arg3 + 1] - local254);
			@Pc(338) float local338 = local277 + local239 * (this.aFloatArrayArray6[arg5 + 1][arg3 + 1] - local277);
			@Pc(353) float local353 = local261 + local239 * (this.aFloatArrayArray8[arg5][arg3 + 1] - local261);
			local362 = this.aFloatArrayArray7[arg5 + 1][arg3];
			@Pc(377) float local377 = local268 + local239 * (this.aFloatArrayArray7[arg5][arg3 + 1] - local268);
			@Pc(395) float local395 = local362 + (this.aFloatArrayArray7[arg5 + 1][arg3 + 1] - local362) * local239;
			local109 = local320 + (local338 - local320) * local247;
			local116 = local353 + local247 * (local304 - local353);
			local123 = local377 + local247 * (local395 - local377);
		}
		local239 = this.aClass4_Sub24_2.method7145() - local16;
		local247 = this.aClass4_Sub24_2.method7147() - local32;
		local254 = this.aClass4_Sub24_2.method7142() - local25;
		local261 = (float) Math.sqrt((double) (local247 * local247 + local239 * local239 + local254 * local254));
		local268 = 1.0F / local261;
		local247 *= local268;
		local239 *= local268;
		local254 *= local268;
		local277 = local261 / (float) this.aClass4_Sub24_2.method7151();
		local286 = (float) 1 - local277 * local277;
		if (local286 < 0.0F) {
			local286 = 0.0F;
		}
		local362 = local116 * local247 + local109 * local239 + local123 * local254;
		if (local362 < 0.0F) {
			local362 = 0.0F;
		}
		@Pc(552) float local552 = local362 * local286 * 2.0F;
		if (local552 > 1.0F) {
			local552 = 1.0F;
		}
		@Pc(563) int local563 = this.aClass4_Sub24_2.method7149();
		@Pc(573) int local573 = (int) ((float) (local563 >> 16 & 0xFF) * local552);
		if (local573 > 255) {
			local573 = 255;
		}
		@Pc(588) int local588 = (int) (local552 * (float) (local563 >> 8 & 0xFF));
		if (local588 > 255) {
			local588 = 255;
		}
		@Pc(601) int local601 = (int) ((float) (local563 & 0xFF) * local552);
		if (this.aClass44_Sub3_27.aBoolean399) {
			this.aClass4_Sub11_Sub2_3.method4961((float) local16);
			this.aClass4_Sub11_Sub2_3.method4961((float) local32);
			this.aClass4_Sub11_Sub2_3.method4961((float) local25);
		} else {
			this.aClass4_Sub11_Sub2_3.method4960((float) local16);
			this.aClass4_Sub11_Sub2_3.method4960((float) local32);
			this.aClass4_Sub11_Sub2_3.method4960((float) local25);
		}
		if (local601 > 255) {
			local601 = 255;
		}
		this.aClass4_Sub11_Sub2_3.method4957(local573);
		this.aClass4_Sub11_Sub2_3.method4957(local588);
		this.aClass4_Sub11_Sub2_3.method4957(local601);
		this.aClass4_Sub11_Sub2_3.method4957(255);
		this.method5758(local82);
	}
}
