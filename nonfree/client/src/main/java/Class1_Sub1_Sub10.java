import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
	private int anInt1226 = 6;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(2, false);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(25) int[] local25 = this.method3393(arg0, 0);
			@Pc(31) int[] local31 = this.method3393(arg0, 1);
			@Pc(34) int local34 = this.anInt1226;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static107.anInt2321; local34++) {
					local15[local34] = local31[local34] + local25[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static107.anInt2321; local34++) {
					local15[local34] = local25[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static107.anInt2321; local34++) {
					local15[local34] = local31[local34] * local25[local34] >> 12;
				}
			} else {
				@Pc(165) int local165;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static107.anInt2321; local34++) {
						local165 = local31[local34];
						local15[local34] = local165 == 0 ? 4096 : (local25[local34] << 12) / local165;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static107.anInt2321; local34++) {
						local15[local34] = 4096 - ((4096 - local25[local34]) * (4096 - local31[local34]) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static107.anInt2321; local34++) {
						local165 = local31[local34];
						local15[local34] = local165 >= 2048 ? 4096 - ((4096 - local165) * (-local25[local34] + 4096) >> 11) : local165 * local25[local34] >> 11;
					}
				} else {
					@Pc(271) int local271;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static107.anInt2321; local34++) {
							local271 = local25[local34];
							local15[local34] = local271 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local271);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static107.anInt2321; local34++) {
							local271 = local25[local34];
							local15[local34] = local271 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local271;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static107.anInt2321; local34++) {
							local165 = local31[local34];
							local271 = local25[local34];
							local15[local34] = local271 < local165 ? local271 : local165;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static107.anInt2321; local34++) {
							local271 = local25[local34];
							local165 = local31[local34];
							local15[local34] = local271 <= local165 ? local165 : local271;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static107.anInt2321; local34++) {
							local271 = local25[local34];
							local165 = local31[local34];
							local15[local34] = local271 > local165 ? local271 - local165 : -local271 + local165;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static107.anInt2321; local34++) {
							local271 = local25[local34];
							local165 = local31[local34];
							local15[local34] = local271 + local165 - (local271 * local165 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(26) int[][] local26 = this.method3397(0, arg0);
			@Pc(32) int[][] local32 = this.method3397(1, arg0);
			@Pc(36) int[] local36 = local12[0];
			@Pc(40) int[] local40 = local12[2];
			@Pc(44) int[] local44 = local12[1];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local26[2];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt1226;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static107.anInt2321; local71++) {
					local36[local71] = local48[local71] + local56[local71];
					local44[local71] = local52[local71] + local64[local71];
					local40[local71] = local68[local71] + local60[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static107.anInt2321; local71++) {
					local36[local71] = local48[local71] - local56[local71];
					local44[local71] = local52[local71] - local64[local71];
					local40[local71] = local60[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static107.anInt2321; local71++) {
					local36[local71] = local48[local71] * local56[local71] >> 12;
					local44[local71] = local64[local71] * local52[local71] >> 12;
					local40[local71] = local60[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(268) int local268;
				@Pc(272) int local272;
				@Pc(276) int local276;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static107.anInt2321; local71++) {
						local268 = local56[local71];
						local272 = local64[local71];
						local276 = local68[local71];
						local36[local71] = local268 == 0 ? 4096 : (local48[local71] << 12) / local268;
						local44[local71] = local272 == 0 ? 4096 : (local52[local71] << 12) / local272;
						local40[local71] = local276 == 0 ? 4096 : (local60[local71] << 12) / local276;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static107.anInt2321; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local56[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local68[local71]) * (-local60[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static107.anInt2321; local71++) {
						local276 = local68[local71];
						local268 = local56[local71];
						local272 = local64[local71];
						local36[local71] = local268 < 2048 ? local48[local71] * local268 >> 11 : 4096 - ((4096 - local268) * (-local48[local71] + 4096) >> 11);
						local44[local71] = local272 >= 2048 ? 4096 - ((4096 - local52[local71]) * (4096 - local272) >> 11) : local272 * local52[local71] >> 11;
						local40[local71] = local276 < 2048 ? local60[local71] * local276 >> 11 : 4096 - ((4096 - local276) * (-local60[local71] + 4096) >> 11);
					}
				} else {
					@Pc(531) int local531;
					@Pc(535) int local535;
					@Pc(527) int local527;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static107.anInt2321; local71++) {
							local527 = local60[local71];
							local531 = local48[local71];
							local535 = local52[local71];
							local36[local71] = local531 == 4096 ? 4096 : (local56[local71] << 12) / (4096 - local531);
							local44[local71] = local535 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local535);
							local40[local71] = local527 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local527);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static107.anInt2321; local71++) {
							local531 = local48[local71];
							local527 = local60[local71];
							local535 = local52[local71];
							local36[local71] = local531 == 0 ? 0 : 4096 - (4096 - local56[local71] << 12) / local531;
							local44[local71] = local535 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local535;
							local40[local71] = local527 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local527;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static107.anInt2321; local71++) {
							local527 = local60[local71];
							local268 = local56[local71];
							local272 = local64[local71];
							local531 = local48[local71];
							local276 = local68[local71];
							local535 = local52[local71];
							local36[local71] = local531 >= local268 ? local268 : local531;
							local44[local71] = local272 > local535 ? local535 : local272;
							local40[local71] = local527 < local276 ? local527 : local276;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static107.anInt2321; local71++) {
							local268 = local56[local71];
							local535 = local52[local71];
							local276 = local68[local71];
							local527 = local60[local71];
							local272 = local64[local71];
							local531 = local48[local71];
							local36[local71] = local268 < local531 ? local531 : local268;
							local44[local71] = local535 > local272 ? local535 : local272;
							local40[local71] = local527 > local276 ? local527 : local276;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static107.anInt2321; local71++) {
							local527 = local60[local71];
							local535 = local52[local71];
							local268 = local56[local71];
							local276 = local68[local71];
							local272 = local64[local71];
							local531 = local48[local71];
							local36[local71] = local268 >= local531 ? local268 - local531 : local531 + -local268;
							local44[local71] = local272 < local535 ? local535 - local272 : local272 + -local535;
							local40[local71] = local527 <= local276 ? local276 - local527 : local527 + -local276;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static107.anInt2321; local71++) {
							local276 = local68[local71];
							local527 = local60[local71];
							local531 = local48[local71];
							local272 = local64[local71];
							local535 = local52[local71];
							local268 = local56[local71];
							local36[local71] = local531 + local268 - (local531 * local268 >> 11);
							local44[local71] = local535 + local272 - (local535 * local272 >> 11);
							local40[local71] = local527 + local276 - (local527 * local276 >> 11);
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1226 = arg0.method3010();
		} else if (arg1 == 1) {
			super.aBoolean241 = arg0.method3010() == 1;
		}
	}
}
