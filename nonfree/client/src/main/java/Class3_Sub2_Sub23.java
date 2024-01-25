import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
	private int anInt7028 = 6;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(28) int[] local28 = this.method8716(0, arg0);
			@Pc(34) int[] local34 = this.method8716(1, arg0);
			@Pc(37) int local37 = this.anInt7028;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static30.anInt908; local37++) {
					local11[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static30.anInt908; local37++) {
					local11[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static30.anInt908; local37++) {
					local11[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static30.anInt908; local37++) {
						local168 = local34[local37];
						local11[local37] = local168 == 0 ? 4096 : (local28[local37] << 12) / local168;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static30.anInt908; local37++) {
						local11[local37] = 4096 - ((4096 - local28[local37]) * (4096 - local34[local37]) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static30.anInt908; local37++) {
						local168 = local34[local37];
						local11[local37] = local168 < 2048 ? local28[local37] * local168 >> 11 : 4096 - ((4096 - local168) * (-local28[local37] + 4096) >> 11);
					}
				} else {
					@Pc(279) int local279;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static30.anInt908; local37++) {
							local279 = local28[local37];
							local11[local37] = local279 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local279);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static30.anInt908; local37++) {
							local279 = local28[local37];
							local11[local37] = local279 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local279;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static30.anInt908; local37++) {
							local279 = local28[local37];
							local168 = local34[local37];
							local11[local37] = local279 >= local168 ? local168 : local279;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static30.anInt908; local37++) {
							local168 = local34[local37];
							local279 = local28[local37];
							local11[local37] = local168 >= local279 ? local168 : local279;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static30.anInt908; local37++) {
							local168 = local34[local37];
							local279 = local28[local37];
							local11[local37] = local168 < local279 ? local279 - local168 : -local279 + local168;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static30.anInt908; local37++) {
							local279 = local28[local37];
							local168 = local34[local37];
							local11[local37] = local168 + local279 - (local168 * local279 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8711(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass115_41.method2722(arg0);
		if (super.aClass115_41.aBoolean233) {
			@Pc(26) int[][] local26 = this.method8718(0, arg0);
			@Pc(32) int[][] local32 = this.method8718(1, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt7028;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static30.anInt908; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static30.anInt908; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static30.anInt908; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(262) int local262;
				@Pc(258) int local258;
				@Pc(266) int local266;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static30.anInt908; local71++) {
						local258 = local64[local71];
						local262 = local60[local71];
						local266 = local68[local71];
						local36[local71] = local262 == 0 ? 4096 : (local48[local71] << 12) / local262;
						local40[local71] = local258 == 0 ? 4096 : (local52[local71] << 12) / local258;
						local44[local71] = local266 == 0 ? 4096 : (local56[local71] << 12) / local266;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static30.anInt908; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (4096 - local52[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static30.anInt908; local71++) {
						local262 = local60[local71];
						local258 = local64[local71];
						local266 = local68[local71];
						local36[local71] = local262 < 2048 ? local48[local71] * local262 >> 11 : 4096 - ((4096 - local262) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local258 >= 2048 ? 4096 - ((4096 - local258) * (-local52[local71] + 4096) >> 11) : local52[local71] * local258 >> 11;
						local44[local71] = local266 < 2048 ? local56[local71] * local266 >> 11 : 4096 - ((4096 - local56[local71]) * (4096 - local266) >> 11);
					}
				} else {
					@Pc(527) int local527;
					@Pc(531) int local531;
					@Pc(523) int local523;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static30.anInt908; local71++) {
							local523 = local56[local71];
							local527 = local48[local71];
							local531 = local52[local71];
							local36[local71] = local527 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local527);
							local40[local71] = local531 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local531);
							local44[local71] = local523 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local523);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static30.anInt908; local71++) {
							local523 = local56[local71];
							local531 = local52[local71];
							local527 = local48[local71];
							local36[local71] = local527 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local527;
							local40[local71] = local531 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local531;
							local44[local71] = local523 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local523;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static30.anInt908; local71++) {
							local527 = local48[local71];
							local523 = local56[local71];
							local258 = local64[local71];
							local262 = local60[local71];
							local266 = local68[local71];
							local531 = local52[local71];
							local36[local71] = local262 > local527 ? local527 : local262;
							local40[local71] = local258 <= local531 ? local258 : local531;
							local44[local71] = local266 > local523 ? local523 : local266;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static30.anInt908; local71++) {
							local266 = local68[local71];
							local531 = local52[local71];
							local262 = local60[local71];
							local527 = local48[local71];
							local258 = local64[local71];
							local523 = local56[local71];
							local36[local71] = local527 <= local262 ? local262 : local527;
							local40[local71] = local531 > local258 ? local531 : local258;
							local44[local71] = local266 < local523 ? local523 : local266;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static30.anInt908; local71++) {
							local523 = local56[local71];
							local266 = local68[local71];
							local531 = local52[local71];
							local527 = local48[local71];
							local258 = local64[local71];
							local262 = local60[local71];
							local36[local71] = local527 <= local262 ? local262 - local527 : local527 - local262;
							local40[local71] = local531 > local258 ? local531 - local258 : local258 + -local531;
							local44[local71] = local266 < local523 ? local523 - local266 : -local523 + local266;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static30.anInt908; local71++) {
							local523 = local56[local71];
							local258 = local64[local71];
							local531 = local52[local71];
							local527 = local48[local71];
							local266 = local68[local71];
							local262 = local60[local71];
							local36[local71] = local527 + local262 - (local262 * local527 >> 11);
							local40[local71] = local531 + local258 - (local531 * local258 >> 11);
							local44[local71] = local266 + local523 - (local266 * local523 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7028 = arg0.method4888();
		} else if (arg1 == 1) {
			super.aBoolean761 = arg0.method4888() == 1;
		}
	}
}
