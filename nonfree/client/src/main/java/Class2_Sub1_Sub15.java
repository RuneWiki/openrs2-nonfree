import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!l", name = "S", descriptor = "I")
	private int anInt2408 = 6;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub15() {
		super(2, false);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(26) int[][] local26 = this.method3259(arg0, 0);
			@Pc(32) int[][] local32 = this.method3259(arg0, 1);
			@Pc(36) int[] local36 = local7[0];
			@Pc(40) int[] local40 = local7[1];
			@Pc(44) int[] local44 = local7[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt2408;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static135.anInt2897; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static135.anInt2897; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static135.anInt2897; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(276) int local276;
				@Pc(268) int local268;
				@Pc(272) int local272;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static135.anInt2897; local71++) {
						local268 = local64[local71];
						local272 = local68[local71];
						local276 = local60[local71];
						local36[local71] = local276 == 0 ? 4096 : (local48[local71] << 12) / local276;
						local40[local71] = local268 == 0 ? 4096 : (local52[local71] << 12) / local268;
						local44[local71] = local272 == 0 ? 4096 : (local56[local71] << 12) / local272;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static135.anInt2897; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (4096 - local52[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (4096 - local56[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static135.anInt2897; local71++) {
						local268 = local64[local71];
						local272 = local68[local71];
						local276 = local60[local71];
						local36[local71] = local276 < 2048 ? local276 * local48[local71] >> 11 : 4096 - ((4096 - local276) * (-local48[local71] + 4096) >> 11);
						local40[local71] = local268 >= 2048 ? 4096 - ((4096 - local52[local71]) * (4096 - local268) >> 11) : local52[local71] * local268 >> 11;
						local44[local71] = local272 < 2048 ? local56[local71] * local272 >> 11 : 4096 - ((4096 - local56[local71]) * (-local272 + 4096) >> 11);
					}
				} else {
					@Pc(518) int local518;
					@Pc(522) int local522;
					@Pc(526) int local526;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static135.anInt2897; local71++) {
							local518 = local48[local71];
							local522 = local52[local71];
							local526 = local56[local71];
							local36[local71] = local518 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local518);
							local40[local71] = local522 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local522);
							local44[local71] = local526 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local526);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static135.anInt2897; local71++) {
							local522 = local52[local71];
							local518 = local48[local71];
							local526 = local56[local71];
							local36[local71] = local518 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local518;
							local40[local71] = local522 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local522;
							local44[local71] = local526 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local526;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static135.anInt2897; local71++) {
							local526 = local56[local71];
							local268 = local64[local71];
							local276 = local60[local71];
							local522 = local52[local71];
							local272 = local68[local71];
							local518 = local48[local71];
							local36[local71] = local518 < local276 ? local518 : local276;
							local40[local71] = local268 <= local522 ? local268 : local522;
							local44[local71] = local272 <= local526 ? local272 : local526;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static135.anInt2897; local71++) {
							local518 = local48[local71];
							local522 = local52[local71];
							local526 = local56[local71];
							local276 = local60[local71];
							local272 = local68[local71];
							local268 = local64[local71];
							local36[local71] = local518 <= local276 ? local276 : local518;
							local40[local71] = local522 <= local268 ? local268 : local522;
							local44[local71] = local272 >= local526 ? local272 : local526;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static135.anInt2897; local71++) {
							local268 = local64[local71];
							local522 = local52[local71];
							local272 = local68[local71];
							local518 = local48[local71];
							local526 = local56[local71];
							local276 = local60[local71];
							local36[local71] = local276 < local518 ? local518 - local276 : local276 - local518;
							local40[local71] = local522 <= local268 ? local268 - local522 : -local268 + local522;
							local44[local71] = local272 >= local526 ? local272 - local526 : -local272 + local526;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static135.anInt2897; local71++) {
							local518 = local48[local71];
							local272 = local68[local71];
							local526 = local56[local71];
							local268 = local64[local71];
							local276 = local60[local71];
							local522 = local52[local71];
							local36[local71] = local276 + local518 - (local518 * local276 >> 11);
							local40[local71] = local522 + local268 - (local522 * local268 >> 11);
							local44[local71] = local272 + local526 - (local526 * local272 >> 11);
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(31) int[] local31 = this.method3265(arg0, 0);
			@Pc(37) int[] local37 = this.method3265(arg0, 1);
			@Pc(40) int local40 = this.anInt2408;
			if (local40 == 1) {
				for (local40 = 0; local40 < Static135.anInt2897; local40++) {
					local17[local40] = local37[local40] + local31[local40];
				}
			} else if (local40 == 2) {
				for (local40 = 0; local40 < Static135.anInt2897; local40++) {
					local17[local40] = local31[local40] - local37[local40];
				}
			} else if (local40 == 3) {
				for (local40 = 0; local40 < Static135.anInt2897; local40++) {
					local17[local40] = local31[local40] * local37[local40] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local40 == 4) {
					for (local40 = 0; local40 < Static135.anInt2897; local40++) {
						local164 = local37[local40];
						local17[local40] = local164 == 0 ? 4096 : (local31[local40] << 12) / local164;
					}
				} else if (local40 == 5) {
					for (local40 = 0; local40 < Static135.anInt2897; local40++) {
						local17[local40] = 4096 - ((4096 - local37[local40]) * (-local31[local40] + 4096) >> 12);
					}
				} else if (local40 == 6) {
					for (local40 = 0; local40 < Static135.anInt2897; local40++) {
						local164 = local37[local40];
						local17[local40] = local164 >= 2048 ? 4096 - ((4096 - local164) * (-local31[local40] + 4096) >> 11) : local164 * local31[local40] >> 11;
					}
				} else {
					@Pc(274) int local274;
					if (local40 == 7) {
						for (local40 = 0; local40 < Static135.anInt2897; local40++) {
							local274 = local31[local40];
							local17[local40] = local274 == 4096 ? 4096 : (local37[local40] << 12) / (4096 - local274);
						}
					} else if (local40 == 8) {
						for (local40 = 0; local40 < Static135.anInt2897; local40++) {
							local274 = local31[local40];
							local17[local40] = local274 == 0 ? 0 : 4096 - (4096 - local37[local40] << 12) / local274;
						}
					} else if (local40 == 9) {
						for (local40 = 0; local40 < Static135.anInt2897; local40++) {
							local274 = local31[local40];
							local164 = local37[local40];
							local17[local40] = local164 <= local274 ? local164 : local274;
						}
					} else if (local40 == 10) {
						for (local40 = 0; local40 < Static135.anInt2897; local40++) {
							local274 = local31[local40];
							local164 = local37[local40];
							local17[local40] = local274 <= local164 ? local164 : local274;
						}
					} else if (local40 == 11) {
						for (local40 = 0; local40 < Static135.anInt2897; local40++) {
							local164 = local37[local40];
							local274 = local31[local40];
							local17[local40] = local164 >= local274 ? local164 - local274 : -local164 + local274;
						}
					} else if (local40 == 12) {
						for (local40 = 0; local40 < Static135.anInt2897; local40++) {
							local164 = local37[local40];
							local274 = local31[local40];
							local17[local40] = local164 + local274 - (local274 * local164 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2408 = arg0.method260();
		} else if (arg1 == 1) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}
}
