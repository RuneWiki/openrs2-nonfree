import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class2_Sub4_Sub13 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jfa", name = "G", descriptor = "I")
	private int anInt4138 = 6;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub13() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(28) int[] local28 = this.method7568(arg0, 0);
			@Pc(34) int[] local34 = this.method7568(arg0, 1);
			@Pc(37) int local37 = this.anInt4138;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static143.anInt7434; local37++) {
					local18[local37] = local34[local37] + local28[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static143.anInt7434; local37++) {
					local18[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static143.anInt7434; local37++) {
					local18[local37] = local34[local37] * local28[local37] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static143.anInt7434; local37++) {
						local168 = local34[local37];
						local18[local37] = local168 == 0 ? 4096 : (local28[local37] << 12) / local168;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static143.anInt7434; local37++) {
						local18[local37] = 4096 - ((4096 - local28[local37]) * (4096 - local34[local37]) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static143.anInt7434; local37++) {
						local168 = local34[local37];
						local18[local37] = local168 >= 2048 ? 4096 - ((4096 - local28[local37]) * (-local168 + 4096) >> 11) : local168 * local28[local37] >> 11;
					}
				} else {
					@Pc(273) int local273;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static143.anInt7434; local37++) {
							local273 = local28[local37];
							local18[local37] = local273 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local273);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static143.anInt7434; local37++) {
							local273 = local28[local37];
							local18[local37] = local273 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local273;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static143.anInt7434; local37++) {
							local273 = local28[local37];
							local168 = local34[local37];
							local18[local37] = local273 < local168 ? local273 : local168;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static143.anInt7434; local37++) {
							local168 = local34[local37];
							local273 = local28[local37];
							local18[local37] = local273 > local168 ? local273 : local168;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static143.anInt7434; local37++) {
							local273 = local28[local37];
							local168 = local34[local37];
							local18[local37] = local273 > local168 ? local273 - local168 : -local273 + local168;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static143.anInt7434; local37++) {
							local168 = local34[local37];
							local273 = local28[local37];
							local18[local37] = local168 + local273 - (local168 * local273 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt4138 = arg1.method4464();
		} else if (arg0 == 1) {
			super.aBoolean789 = arg1.method4464() == 1;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7561(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass143_41.method2531(arg0);
		if (super.aClass143_41.aBoolean214) {
			@Pc(26) int[][] local26 = this.method7567(arg0, 0);
			@Pc(32) int[][] local32 = this.method7567(arg0, 1);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt4138;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static143.anInt7434; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static143.anInt7434; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static143.anInt7434; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(273) int local273;
				@Pc(269) int local269;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static143.anInt7434; local71++) {
						local265 = local60[local71];
						local269 = local68[local71];
						local273 = local64[local71];
						local36[local71] = local265 == 0 ? 4096 : (local48[local71] << 12) / local265;
						local40[local71] = local273 == 0 ? 4096 : (local52[local71] << 12) / local273;
						local44[local71] = local269 == 0 ? 4096 : (local56[local71] << 12) / local269;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static143.anInt7434; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (-local56[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static143.anInt7434; local71++) {
						local273 = local64[local71];
						local269 = local68[local71];
						local265 = local60[local71];
						local36[local71] = local265 < 2048 ? local265 * local48[local71] >> 11 : 4096 - ((4096 - local48[local71]) * (-local265 + 4096) >> 11);
						local40[local71] = local273 >= 2048 ? 4096 - ((4096 - local273) * (4096 - local52[local71]) >> 11) : local273 * local52[local71] >> 11;
						local44[local71] = local269 >= 2048 ? 4096 - ((4096 - local269) * (4096 - local56[local71]) >> 11) : local56[local71] * local269 >> 11;
					}
				} else {
					@Pc(522) int local522;
					@Pc(526) int local526;
					@Pc(518) int local518;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static143.anInt7434; local71++) {
							local518 = local56[local71];
							local522 = local48[local71];
							local526 = local52[local71];
							local36[local71] = local522 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local522);
							local40[local71] = local526 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local526);
							local44[local71] = local518 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local518);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static143.anInt7434; local71++) {
							local522 = local48[local71];
							local526 = local52[local71];
							local518 = local56[local71];
							local36[local71] = local522 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local522;
							local40[local71] = local526 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local526;
							local44[local71] = local518 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local518;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static143.anInt7434; local71++) {
							local526 = local52[local71];
							local269 = local68[local71];
							local273 = local64[local71];
							local518 = local56[local71];
							local265 = local60[local71];
							local522 = local48[local71];
							local36[local71] = local522 >= local265 ? local265 : local522;
							local40[local71] = local273 <= local526 ? local273 : local526;
							local44[local71] = local269 <= local518 ? local269 : local518;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static143.anInt7434; local71++) {
							local526 = local52[local71];
							local273 = local64[local71];
							local265 = local60[local71];
							local269 = local68[local71];
							local518 = local56[local71];
							local522 = local48[local71];
							local36[local71] = local265 < local522 ? local522 : local265;
							local40[local71] = local526 <= local273 ? local273 : local526;
							local44[local71] = local518 > local269 ? local518 : local269;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static143.anInt7434; local71++) {
							local526 = local52[local71];
							local522 = local48[local71];
							local265 = local60[local71];
							local269 = local68[local71];
							local273 = local64[local71];
							local518 = local56[local71];
							local36[local71] = local265 < local522 ? local522 - local265 : local265 + -local522;
							local40[local71] = local273 < local526 ? local526 - local273 : local273 - local526;
							local44[local71] = local269 >= local518 ? local269 - local518 : -local269 + local518;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static143.anInt7434; local71++) {
							local518 = local56[local71];
							local265 = local60[local71];
							local269 = local68[local71];
							local526 = local52[local71];
							local273 = local64[local71];
							local522 = local48[local71];
							local36[local71] = local522 + local265 - (local265 * local522 >> 11);
							local40[local71] = local526 + local273 - (local273 * local526 >> 11);
							local44[local71] = local518 + local269 - (local269 * local518 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
