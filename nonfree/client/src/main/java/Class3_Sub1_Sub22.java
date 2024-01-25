import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class3_Sub1_Sub22 extends Class3_Sub1 {

	@OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
	private int anInt5641 = 6;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass85_41.method2548(arg0);
		if (super.aClass85_41.aBoolean239) {
			@Pc(28) int[] local28 = this.method7765(0, arg0);
			@Pc(34) int[] local34 = this.method7765(1, arg0);
			@Pc(37) int local37 = this.anInt5641;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static206.anInt4182; local37++) {
					local11[local37] = local34[local37] + local28[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static206.anInt4182; local37++) {
					local11[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static206.anInt4182; local37++) {
					local11[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(170) int local170;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static206.anInt4182; local37++) {
						local170 = local34[local37];
						local11[local37] = local170 == 0 ? 4096 : (local28[local37] << 12) / local170;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static206.anInt4182; local37++) {
						local11[local37] = 4096 - ((4096 - local34[local37]) * (-local28[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static206.anInt4182; local37++) {
						local170 = local34[local37];
						local11[local37] = local170 < 2048 ? local28[local37] * local170 >> 11 : 4096 - ((4096 - local28[local37]) * (-local170 + 4096) >> 11);
					}
				} else {
					@Pc(282) int local282;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static206.anInt4182; local37++) {
							local282 = local28[local37];
							local11[local37] = local282 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local282);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static206.anInt4182; local37++) {
							local282 = local28[local37];
							local11[local37] = local282 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local282;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static206.anInt4182; local37++) {
							local282 = local28[local37];
							local170 = local34[local37];
							local11[local37] = local170 > local282 ? local282 : local170;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static206.anInt4182; local37++) {
							local170 = local34[local37];
							local282 = local28[local37];
							local11[local37] = local282 <= local170 ? local170 : local282;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static206.anInt4182; local37++) {
							local170 = local34[local37];
							local282 = local28[local37];
							local11[local37] = local282 > local170 ? local282 - local170 : -local282 + local170;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static206.anInt4182; local37++) {
							local282 = local28[local37];
							local170 = local34[local37];
							local11[local37] = local170 + local282 - (local282 * local170 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!qh;II)V")
	@Override
	public void method7761(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5641 = arg0.method3118();
		} else if (arg1 == 1) {
			super.aBoolean728 = arg0.method3118() == 1;
		}
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method7773(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass144_41.method3782(arg0);
		if (super.aClass144_41.aBoolean326) {
			@Pc(26) int[][] local26 = this.method7766(0, arg0);
			@Pc(32) int[][] local32 = this.method7766(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt5641;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static206.anInt4182; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static206.anInt4182; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static206.anInt4182; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(269) int local269;
				@Pc(261) int local261;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static206.anInt4182; local71++) {
						local261 = local68[local71];
						local265 = local60[local71];
						local269 = local64[local71];
						local36[local71] = local265 == 0 ? 4096 : (local48[local71] << 12) / local265;
						local40[local71] = local269 == 0 ? 4096 : (local52[local71] << 12) / local269;
						local44[local71] = local261 == 0 ? 4096 : (local56[local71] << 12) / local261;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static206.anInt4182; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static206.anInt4182; local71++) {
						local261 = local68[local71];
						local265 = local60[local71];
						local269 = local64[local71];
						local36[local71] = local265 >= 2048 ? 4096 - ((4096 - local48[local71]) * (4096 - local265) >> 11) : local265 * local48[local71] >> 11;
						local40[local71] = local269 < 2048 ? local269 * local52[local71] >> 11 : 4096 - ((4096 - local269) * (4096 - local52[local71]) >> 11);
						local44[local71] = local261 < 2048 ? local261 * local56[local71] >> 11 : 4096 - ((4096 - local261) * (4096 - local56[local71]) >> 11);
					}
				} else {
					@Pc(527) int local527;
					@Pc(523) int local523;
					@Pc(519) int local519;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static206.anInt4182; local71++) {
							local519 = local56[local71];
							local523 = local52[local71];
							local527 = local48[local71];
							local36[local71] = local527 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local527);
							local40[local71] = local523 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local523);
							local44[local71] = local519 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local519);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static206.anInt4182; local71++) {
							local523 = local52[local71];
							local527 = local48[local71];
							local519 = local56[local71];
							local36[local71] = local527 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local527;
							local40[local71] = local523 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local523;
							local44[local71] = local519 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local519;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static206.anInt4182; local71++) {
							local269 = local64[local71];
							local523 = local52[local71];
							local519 = local56[local71];
							local527 = local48[local71];
							local261 = local68[local71];
							local265 = local60[local71];
							local36[local71] = local265 <= local527 ? local265 : local527;
							local40[local71] = local269 > local523 ? local523 : local269;
							local44[local71] = local261 > local519 ? local519 : local261;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static206.anInt4182; local71++) {
							local527 = local48[local71];
							local265 = local60[local71];
							local523 = local52[local71];
							local261 = local68[local71];
							local519 = local56[local71];
							local269 = local64[local71];
							local36[local71] = local265 < local527 ? local527 : local265;
							local40[local71] = local269 >= local523 ? local269 : local523;
							local44[local71] = local519 > local261 ? local519 : local261;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static206.anInt4182; local71++) {
							local527 = local48[local71];
							local519 = local56[local71];
							local523 = local52[local71];
							local265 = local60[local71];
							local269 = local64[local71];
							local261 = local68[local71];
							local36[local71] = local265 >= local527 ? local265 - local527 : local527 + -local265;
							local40[local71] = local523 > local269 ? local523 - local269 : local269 - local523;
							local44[local71] = local519 > local261 ? local519 - local261 : -local519 + local261;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static206.anInt4182; local71++) {
							local523 = local52[local71];
							local527 = local48[local71];
							local269 = local64[local71];
							local261 = local68[local71];
							local519 = local56[local71];
							local265 = local60[local71];
							local36[local71] = local527 + local265 - (local527 * local265 >> 11);
							local40[local71] = local269 + local523 - (local523 * local269 >> 11);
							local44[local71] = local519 + local261 - (local519 * local261 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
