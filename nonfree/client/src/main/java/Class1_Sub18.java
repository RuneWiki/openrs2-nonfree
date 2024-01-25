import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!ha", name = "s", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_15;

	@OriginalMember(owner = "client!ha", name = "F", descriptor = "Lclient!on;")
	private final Class163_Sub1 aClass163_Sub1_2;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "Lclient!kt;")
	private final Class1_Sub24 aClass1_Sub24_2;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	private final int anInt2493;

	@OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
	private final int anInt2491;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	private final int anInt2497;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	private final int anInt2492;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!ha", name = "D", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "Lclient!nc;")
	private final Interface10 anInterface10_3;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "Lclient!ap;")
	private final Interface2 anInterface2_2;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "Lclient!bg;")
	private final Class21 aClass21_4;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "Lclient!bg;")
	private final Class21 aClass21_5;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!dh;")
	private Class1_Sub11 aClass1_Sub11_4;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "Lclient!rk;")
	private Class1_Sub11_Sub2 aClass1_Sub11_Sub2_3;

	@OriginalMember(owner = "client!ha", name = "w", descriptor = "Lclient!wa;")
	private Class257 aClass257_12;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!od;Lclient!on;Lclient!kt;[I)V")
	public Class1_Sub18(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class163_Sub1 arg1, @OriginalArg(2) Class1_Sub24 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass128_Sub2_15 = arg0;
		this.aClass163_Sub1_2 = arg1;
		this.aClass1_Sub24_2 = arg2;
		@Pc(23) int local23 = this.aClass1_Sub24_2.method4374() - (arg1.anInt5792 >> 1);
		this.anInt2493 = this.aClass1_Sub24_2.method4367() - local23 >> arg1.anInt5797;
		this.anInt2491 = local23 + this.aClass1_Sub24_2.method4367() >> arg1.anInt5797;
		this.anInt2497 = this.aClass1_Sub24_2.method4369() - local23 >> arg1.anInt5797;
		this.anInt2492 = local23 + this.aClass1_Sub24_2.method4369() >> arg1.anInt5797;
		@Pc(76) int local76 = this.anInt2491 + 1 - this.anInt2493;
		@Pc(84) int local84 = this.anInt2492 + 1 - this.anInt2497;
		this.aFloatArrayArray5 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray7 = new float[local76 + 1][local84 + 1];
		this.aFloatArrayArray6 = new float[local76 + 1][local84 + 1];
		@Pc(120) int local120;
		@Pc(138) int local138;
		@Pc(145) int local145;
		@Pc(168) int local168;
		@Pc(182) int local182;
		for (@Pc(113) int local113 = 0; local113 <= local84; local113++) {
			local120 = this.anInt2497 + local113;
			if (local120 > 0 && this.aClass163_Sub1_2.anInt5795 - 1 > local120) {
				for (local138 = 0; local138 <= local76; local138++) {
					local145 = local138 + this.anInt2493;
					if (local145 > 0 && this.aClass163_Sub1_2.anInt5796 - 1 > local145) {
						local168 = arg1.I(local145 + 1, local120) - arg1.I(local145 - 1, local120);
						local182 = arg1.I(local145, local120 + 1) - arg1.I(local145, local120 - 1);
						@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local182 * local182 + 65536)));
						this.aFloatArrayArray6[local138][local113] = (float) local168 * local198;
						this.aFloatArrayArray5[local138][local113] = local198 * -256.0F;
						this.aFloatArrayArray7[local138][local113] = (float) local182 * local198;
					}
				}
			}
		}
		local120 = 0;
		local138 = 0;
		for (local145 = this.anInt2497; local145 <= this.anInt2492; local145++) {
			if (local145 >= 0 && arg1.anInt5795 > local145) {
				for (local168 = this.anInt2493; local168 <= this.anInt2491; local168++) {
					if (local168 >= 0 && local168 < arg1.anInt5796) {
						local182 = arg3[local138];
						@Pc(290) int[] local290 = arg1.anIntArrayArrayArray10[local168][local145];
						if (local290 != null && local182 != 0) {
							if (local182 == 1) {
								local120 += local290.length;
							} else {
								local120 += 3;
							}
						}
					}
					local138++;
				}
			} else {
				local138 += this.anInt2491 - this.anInt2493;
			}
		}
		if (local120 <= 0) {
			this.anInterface10_3 = null;
			this.anInterface2_2 = null;
			this.aClass21_4 = null;
			this.aClass21_5 = null;
		} else {
			this.aClass1_Sub11_4 = new Class1_Sub11(local120 * 2);
			this.aClass1_Sub11_Sub2_3 = new Class1_Sub11_Sub2(local120 * 16);
			this.aClass257_12 = new Class257(Static88.method1286(local120));
			local168 = 0;
			local138 = 0;
			for (local182 = this.anInt2497; local182 <= this.anInt2492; local182++) {
				if (local182 >= 0 && local182 < arg1.anInt5795) {
					@Pc(399) int local399 = 0;
					for (@Pc(402) int local402 = this.anInt2493; local402 <= this.anInt2491; local402++) {
						if (local402 >= 0 && local402 < arg1.anInt5796) {
							@Pc(417) int local417 = arg3[local138];
							@Pc(424) int[] local424 = arg1.anIntArrayArrayArray10[local402][local182];
							@Pc(431) int[] local431 = arg1.anIntArrayArrayArray7[local402][local182];
							if (local424 != null && local417 != 0) {
								if (local417 == 1) {
									for (@Pc(588) int local588 = 0; local588 < local424.length; local588++) {
										this.method2092(local402, local431[local588], local168, local399, local182, local424[local588]);
									}
								} else if (local417 == 3) {
									this.method2092(local402, 0, local168, local399, local182, 0);
									this.method2092(local402, 0, local168, local399, local182, arg1.anInt5792);
									this.method2092(local402, arg1.anInt5792, local168, local399, local182, 0);
								} else if (local417 == 2) {
									this.method2092(local402, 0, local168, local399, local182, arg1.anInt5792);
									this.method2092(local402, arg1.anInt5792, local168, local399, local182, arg1.anInt5792);
									this.method2092(local402, 0, local168, local399, local182, 0);
								} else if (local417 == 5) {
									this.method2092(local402, arg1.anInt5792, local168, local399, local182, arg1.anInt5792);
									this.method2092(local402, arg1.anInt5792, local168, local399, local182, 0);
									this.method2092(local402, 0, local168, local399, local182, arg1.anInt5792);
								} else if (local417 == 4) {
									this.method2092(local402, arg1.anInt5792, local168, local399, local182, 0);
									this.method2092(local402, 0, local168, local399, local182, 0);
									this.method2092(local402, arg1.anInt5792, local168, local399, local182, arg1.anInt5792);
								}
							}
						}
						local138++;
						local399++;
					}
				} else {
					local138 += this.anInt2491 - this.anInt2493;
				}
				local168++;
			}
			this.anInterface2_2 = this.aClass128_Sub2_15.method3618(this.aClass1_Sub11_4.anInt5766, false, this.aClass1_Sub11_4.aByteArray64);
			this.anInterface10_3 = this.aClass128_Sub2_15.method3657(16, this.aClass1_Sub11_Sub2_3.anInt5766, false, this.aClass1_Sub11_Sub2_3.aByteArray64);
			this.aClass21_4 = new Class21(this.anInterface10_3, 5126, 3, 0);
			this.aClass21_5 = new Class21(this.anInterface10_3, 5121, 4, 12);
		}
		this.aFloatArrayArray6 = this.aFloatArrayArray5 = this.aFloatArrayArray7 = null;
		this.aClass1_Sub11_Sub2_3 = null;
		this.aClass257_12 = null;
		this.aClass1_Sub11_4 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
	private void method2092(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = (arg0 << this.aClass163_Sub1_2.anInt5797) + arg5;
		@Pc(24) int local24 = arg1 + (arg4 << this.aClass163_Sub1_2.anInt5797);
		@Pc(30) int local30 = this.aClass163_Sub1_2.va(local15, local24);
		if ((arg5 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = 0xFFFFL << 16 & (long) local24 << 16 | (long) local15 & 0xFFFFL;
			@Pc(61) Class1 local61 = this.aClass257_12.method5503(local7);
			if (local61 != null) {
				this.method2093(((Class1_Sub39) local61).aShort75);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt2489++;
		if (local7 != -1L) {
			this.aClass257_12.method5504(new Class1_Sub39(local79), local7);
		}
		@Pc(116) float local116;
		@Pc(109) float local109;
		@Pc(123) float local123;
		@Pc(233) float local233;
		@Pc(241) float local241;
		@Pc(248) float local248;
		@Pc(255) float local255;
		@Pc(262) float local262;
		@Pc(271) float local271;
		@Pc(280) float local280;
		@Pc(323) float local323;
		if (arg5 == 0 && arg1 == 0) {
			local109 = this.aFloatArrayArray5[arg3][arg2];
			local116 = this.aFloatArrayArray6[arg3][arg2];
			local123 = this.aFloatArrayArray7[arg3][arg2];
		} else if (arg5 == this.aClass163_Sub1_2.anInt5792 && arg1 == 0) {
			local116 = this.aFloatArrayArray6[arg3 + 1][arg2];
			local109 = this.aFloatArrayArray5[arg3 + 1][arg2];
			local123 = this.aFloatArrayArray7[arg3 + 1][arg2];
		} else if (arg5 == this.aClass163_Sub1_2.anInt5792 && arg1 == this.aClass163_Sub1_2.anInt5792) {
			local116 = this.aFloatArrayArray6[arg3 + 1][arg2 + 1];
			local109 = this.aFloatArrayArray5[arg3 + 1][arg2 + 1];
			local123 = this.aFloatArrayArray7[arg3 + 1][arg2 + 1];
		} else if (arg5 == 0 && this.aClass163_Sub1_2.anInt5792 == arg1) {
			local123 = this.aFloatArrayArray7[arg3][arg2 + 1];
			local116 = this.aFloatArrayArray6[arg3][arg2 + 1];
			local109 = this.aFloatArrayArray5[arg3][arg2 + 1];
		} else {
			local233 = (float) arg5 / (float) this.aClass163_Sub1_2.anInt5792;
			local241 = (float) arg1 / (float) this.aClass163_Sub1_2.anInt5792;
			local248 = this.aFloatArrayArray6[arg3][arg2];
			local255 = this.aFloatArrayArray5[arg3][arg2];
			local262 = this.aFloatArrayArray7[arg3][arg2];
			local271 = this.aFloatArrayArray6[arg3 + 1][arg2];
			local280 = this.aFloatArrayArray5[arg3 + 1][arg2];
			@Pc(298) float local298 = local271 + (this.aFloatArrayArray6[arg3 + 1][arg2 + 1] - local271) * local233;
			@Pc(314) float local314 = local262 + local233 * (this.aFloatArrayArray7[arg3][arg2 + 1] - local262);
			local323 = this.aFloatArrayArray7[arg3 + 1][arg2];
			@Pc(339) float local339 = local248 + (this.aFloatArrayArray6[arg3][arg2 + 1] - local248) * local233;
			@Pc(356) float local356 = local280 + local233 * (this.aFloatArrayArray5[arg3 + 1][arg2 + 1] - local280);
			@Pc(372) float local372 = local255 + (this.aFloatArrayArray5[arg3][arg2 + 1] - local255) * local233;
			@Pc(390) float local390 = local323 + local233 * (this.aFloatArrayArray7[arg3 + 1][arg2 + 1] - local323);
			local116 = local241 * (local298 - local339) + local339;
			local109 = local372 + (local356 - local372) * local241;
			local123 = (local390 - local314) * local241 + local314;
		}
		local233 = this.aClass1_Sub24_2.method4367() - local15;
		local241 = this.aClass1_Sub24_2.method4376() - local30;
		local248 = this.aClass1_Sub24_2.method4369() - local24;
		local255 = (float) Math.sqrt((double) (local241 * local241 + local233 * local233 + local248 * local248));
		local262 = 1.0F / local255;
		local248 *= local262;
		local233 *= local262;
		local241 *= local262;
		local271 = local255 / (float) this.aClass1_Sub24_2.method4374();
		local280 = 1.0F - local271 * local271;
		if (local280 < 0.0F) {
			local280 = 0.0F;
		}
		local323 = local233 * local116 + local241 * local109 + local123 * local248;
		if (local323 < 0.0F) {
			local323 = 0.0F;
		}
		@Pc(553) float local553 = local323 * local280 * 2.0F;
		if (local553 > 1.0F) {
			local553 = 1.0F;
		}
		@Pc(566) int local566 = this.aClass1_Sub24_2.method4373();
		@Pc(576) int local576 = (int) ((float) (local566 >> 16 & 0xFF) * local553);
		if (local576 > 255) {
			local576 = 255;
		}
		@Pc(593) int local593 = (int) ((float) (local566 >> 8 & 0xFF) * local553);
		if (local593 > 255) {
			local593 = 255;
		}
		@Pc(606) int local606 = (int) (local553 * (float) (local566 & 0xFF));
		if (local606 > 255) {
			local606 = 255;
		}
		if (this.aClass128_Sub2_15.aBoolean360) {
			this.aClass1_Sub11_Sub2_3.method4507((float) local15);
			this.aClass1_Sub11_Sub2_3.method4507((float) local30);
			this.aClass1_Sub11_Sub2_3.method4507((float) local24);
		} else {
			this.aClass1_Sub11_Sub2_3.method4509((float) local15);
			this.aClass1_Sub11_Sub2_3.method4509((float) local30);
			this.aClass1_Sub11_Sub2_3.method4509((float) local24);
		}
		this.aClass1_Sub11_Sub2_3.method4445(local576);
		this.aClass1_Sub11_Sub2_3.method4445(local593);
		this.aClass1_Sub11_Sub2_3.method4445(local606);
		this.aClass1_Sub11_Sub2_3.method4445(255);
		this.method2093(local79);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(SB)V")
	private void method2093(@OriginalArg(0) short arg0) {
		if (this.aClass128_Sub2_15.aBoolean360) {
			this.aClass1_Sub11_4.method4448(arg0);
		} else {
			this.aClass1_Sub11_4.method4488(arg0);
		}
		this.anInt2494++;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[[ZIBI)V")
	public void method2094(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface2_2 == null || (arg0 + arg3 < this.anInt2493 || (this.anInt2491 < arg0 - arg3 || (this.anInt2497 > arg2 + arg3 || this.anInt2492 < arg2 - arg3)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt2497; local54 <= this.anInt2492; local54++) {
			for (@Pc(59) int local59 = this.anInt2493; local59 <= this.anInt2491; local59++) {
				@Pc(65) int local65 = local59 - arg0;
				@Pc(70) int local70 = local54 - arg2;
				if (local65 > -arg3 && local65 < arg3 && -arg3 < local70 && local70 < arg3 && arg1[arg3 + local65][local70 + arg3]) {
					this.aClass128_Sub2_15.method3646((int) (this.aClass1_Sub24_2.method4371() * 255.0F) << 24);
					this.aClass128_Sub2_15.method3664(null, this.aClass21_5, null, this.aClass21_4);
					this.aClass128_Sub2_15.method3627(this.anInt2494, 0, this.anInterface2_2);
					return;
				}
			}
		}
	}
}
