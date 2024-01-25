import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class1_Sub2_Sub38 extends Class1_Sub2 {

	@OriginalMember(owner = "client!un", name = "M", descriptor = "I")
	private int anInt6142 = 6;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub38() {
		super(2, false);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(28) int[] local28 = this.method5654(0, arg0);
			@Pc(34) int[] local34 = this.method5654(1, arg0);
			@Pc(37) int local37 = this.anInt6142;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static251.anInt6509; local37++) {
					local11[local37] = local34[local37] + local28[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static251.anInt6509; local37++) {
					local11[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static251.anInt6509; local37++) {
					local11[local37] = local28[local37] * local34[local37] >> 12;
				}
			} else {
				@Pc(170) int local170;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static251.anInt6509; local37++) {
						local170 = local34[local37];
						local11[local37] = local170 == 0 ? 4096 : (local28[local37] << 12) / local170;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static251.anInt6509; local37++) {
						local11[local37] = 4096 - ((4096 - local28[local37]) * (-local34[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static251.anInt6509; local37++) {
						local170 = local34[local37];
						local11[local37] = local170 >= 2048 ? 4096 - ((4096 - local170) * (-local28[local37] + 4096) >> 11) : local170 * local28[local37] >> 11;
					}
				} else {
					@Pc(275) int local275;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static251.anInt6509; local37++) {
							local275 = local28[local37];
							local11[local37] = local275 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local275);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static251.anInt6509; local37++) {
							local275 = local28[local37];
							local11[local37] = local275 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local275;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static251.anInt6509; local37++) {
							local170 = local34[local37];
							local275 = local28[local37];
							local11[local37] = local170 > local275 ? local275 : local170;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static251.anInt6509; local37++) {
							local170 = local34[local37];
							local275 = local28[local37];
							local11[local37] = local275 > local170 ? local275 : local170;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static251.anInt6509; local37++) {
							local170 = local34[local37];
							local275 = local28[local37];
							local11[local37] = local275 > local170 ? local275 - local170 : -local275 + local170;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static251.anInt6509; local37++) {
							local275 = local28[local37];
							local170 = local34[local37];
							local11[local37] = local170 + local275 - (local275 * local170 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6142 = arg1.method3141();
		} else if (arg0 == 1) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(26) int[][] local26 = this.method5659(arg0, 0);
			@Pc(32) int[][] local32 = this.method5659(arg0, 1);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6142;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static251.anInt6509; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static251.anInt6509; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static251.anInt6509; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(263) int local263;
				@Pc(267) int local267;
				@Pc(271) int local271;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static251.anInt6509; local71++) {
						local263 = local60[local71];
						local267 = local64[local71];
						local271 = local68[local71];
						local36[local71] = local263 == 0 ? 4096 : (local48[local71] << 12) / local263;
						local40[local71] = local267 == 0 ? 4096 : (local52[local71] << 12) / local267;
						local44[local71] = local271 == 0 ? 4096 : (local56[local71] << 12) / local271;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static251.anInt6509; local71++) {
						local36[local71] = 4096 - ((4096 - local60[local71]) * (-local48[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static251.anInt6509; local71++) {
						local263 = local60[local71];
						local271 = local68[local71];
						local267 = local64[local71];
						local36[local71] = local263 >= 2048 ? 4096 - ((4096 - local263) * (-local48[local71] + 4096) >> 11) : local263 * local48[local71] >> 11;
						local40[local71] = local267 >= 2048 ? 4096 - ((4096 - local267) * (-local52[local71] + 4096) >> 11) : local267 * local52[local71] >> 11;
						local44[local71] = local271 < 2048 ? local56[local71] * local271 >> 11 : 4096 - ((4096 - local56[local71]) * (-local271 + 4096) >> 11);
					}
				} else {
					@Pc(537) int local537;
					@Pc(533) int local533;
					@Pc(529) int local529;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static251.anInt6509; local71++) {
							local529 = local56[local71];
							local533 = local52[local71];
							local537 = local48[local71];
							local36[local71] = local537 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local537);
							local40[local71] = local533 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local533);
							local44[local71] = local529 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local529);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static251.anInt6509; local71++) {
							local533 = local52[local71];
							local529 = local56[local71];
							local537 = local48[local71];
							local36[local71] = local537 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local537;
							local40[local71] = local533 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local533;
							local44[local71] = local529 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local529;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static251.anInt6509; local71++) {
							local537 = local48[local71];
							local271 = local68[local71];
							local263 = local60[local71];
							local267 = local64[local71];
							local529 = local56[local71];
							local533 = local52[local71];
							local36[local71] = local263 > local537 ? local537 : local263;
							local40[local71] = local267 <= local533 ? local267 : local533;
							local44[local71] = local529 >= local271 ? local271 : local529;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static251.anInt6509; local71++) {
							local529 = local56[local71];
							local271 = local68[local71];
							local537 = local48[local71];
							local533 = local52[local71];
							local263 = local60[local71];
							local267 = local64[local71];
							local36[local71] = local263 >= local537 ? local263 : local537;
							local40[local71] = local533 <= local267 ? local267 : local533;
							local44[local71] = local271 < local529 ? local529 : local271;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static251.anInt6509; local71++) {
							local263 = local60[local71];
							local533 = local52[local71];
							local537 = local48[local71];
							local271 = local68[local71];
							local267 = local64[local71];
							local529 = local56[local71];
							local36[local71] = local263 >= local537 ? local263 - local537 : local537 - local263;
							local40[local71] = local267 >= local533 ? local267 - local533 : local533 - local267;
							local44[local71] = local529 <= local271 ? local271 - local529 : -local271 + local529;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static251.anInt6509; local71++) {
							local537 = local48[local71];
							local529 = local56[local71];
							local267 = local64[local71];
							local271 = local68[local71];
							local533 = local52[local71];
							local263 = local60[local71];
							local36[local71] = local537 + local263 - (local537 * local263 >> 11);
							local40[local71] = local267 + local533 - (local267 * local533 >> 11);
							local44[local71] = local271 + local529 - (local529 * local271 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
