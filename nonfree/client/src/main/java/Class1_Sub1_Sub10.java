import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
	private int anInt2032 = 6;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub10() {
		super(2, false);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method4714(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass45_41.method1139(arg0);
		if (this.aClass45_41.aBoolean95) {
			@Pc(27) int[][] local27 = this.method4715(arg0, 0);
			@Pc(33) int[][] local33 = this.method4715(arg0, 1);
			@Pc(37) int[] local37 = local17[0];
			@Pc(41) int[] local41 = local17[1];
			@Pc(45) int[] local45 = local17[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[2];
			@Pc(57) int[] local57 = local27[1];
			@Pc(61) int[] local61 = local33[2];
			@Pc(65) int[] local65 = local33[0];
			@Pc(69) int[] local69 = local33[1];
			@Pc(72) int local72 = this.anInt2032;
			if (local72 == 1) {
				for (local72 = 0; local72 < Static62.anInt1350; local72++) {
					local37[local72] = local49[local72] + local65[local72];
					local41[local72] = local57[local72] + local69[local72];
					local45[local72] = local61[local72] + local53[local72];
				}
			} else if (local72 == 2) {
				for (local72 = 0; local72 < Static62.anInt1350; local72++) {
					local37[local72] = local49[local72] - local65[local72];
					local41[local72] = local57[local72] - local69[local72];
					local45[local72] = local53[local72] - local61[local72];
				}
			} else if (local72 == 3) {
				for (local72 = 0; local72 < Static62.anInt1350; local72++) {
					local37[local72] = local49[local72] * local65[local72] >> 12;
					local41[local72] = local57[local72] * local69[local72] >> 12;
					local45[local72] = local61[local72] * local53[local72] >> 12;
				}
			} else {
				@Pc(279) int local279;
				@Pc(287) int local287;
				@Pc(283) int local283;
				if (local72 == 4) {
					for (local72 = 0; local72 < Static62.anInt1350; local72++) {
						local279 = local65[local72];
						local283 = local61[local72];
						local287 = local69[local72];
						local37[local72] = local279 == 0 ? 4096 : (local49[local72] << 12) / local279;
						local41[local72] = local287 == 0 ? 4096 : (local57[local72] << 12) / local287;
						local45[local72] = local283 == 0 ? 4096 : (local53[local72] << 12) / local283;
					}
				} else if (local72 == 5) {
					for (local72 = 0; local72 < Static62.anInt1350; local72++) {
						local37[local72] = 4096 - ((4096 - local65[local72]) * (-local49[local72] + 4096) >> 12);
						local41[local72] = 4096 - ((4096 - local69[local72]) * (-local57[local72] + 4096) >> 12);
						local45[local72] = 4096 - ((4096 - local61[local72]) * (4096 - local53[local72]) >> 12);
					}
				} else if (local72 == 6) {
					for (local72 = 0; local72 < Static62.anInt1350; local72++) {
						local287 = local69[local72];
						local279 = local65[local72];
						local283 = local61[local72];
						local37[local72] = local279 < 2048 ? local49[local72] * local279 >> 11 : 4096 - ((4096 - local279) * (4096 - local49[local72]) >> 11);
						local41[local72] = local287 >= 2048 ? 4096 - ((4096 - local57[local72]) * (4096 - local287) >> 11) : local287 * local57[local72] >> 11;
						local45[local72] = local283 < 2048 ? local283 * local53[local72] >> 11 : 4096 - ((4096 - local53[local72]) * (-local283 + 4096) >> 11);
					}
				} else {
					@Pc(544) int local544;
					@Pc(540) int local540;
					@Pc(536) int local536;
					if (local72 == 7) {
						for (local72 = 0; local72 < Static62.anInt1350; local72++) {
							local536 = local53[local72];
							local540 = local57[local72];
							local544 = local49[local72];
							local37[local72] = local544 == 4096 ? 4096 : (local65[local72] << 12) / (4096 - local544);
							local41[local72] = local540 == 4096 ? 4096 : (local69[local72] << 12) / (4096 - local540);
							local45[local72] = local536 == 4096 ? 4096 : (local61[local72] << 12) / (4096 - local536);
						}
					} else if (local72 == 8) {
						for (local72 = 0; local72 < Static62.anInt1350; local72++) {
							local544 = local49[local72];
							local540 = local57[local72];
							local536 = local53[local72];
							local37[local72] = local544 == 0 ? 0 : 4096 - (4096 - local65[local72] << 12) / local544;
							local41[local72] = local540 == 0 ? 0 : 4096 - (4096 - local69[local72] << 12) / local540;
							local45[local72] = local536 == 0 ? 0 : 4096 - (4096 - local61[local72] << 12) / local536;
						}
					} else if (local72 == 9) {
						for (local72 = 0; local72 < Static62.anInt1350; local72++) {
							local536 = local53[local72];
							local287 = local69[local72];
							local279 = local65[local72];
							local544 = local49[local72];
							local540 = local57[local72];
							local283 = local61[local72];
							local37[local72] = local279 <= local544 ? local279 : local544;
							local41[local72] = local287 <= local540 ? local287 : local540;
							local45[local72] = local536 >= local283 ? local283 : local536;
						}
					} else if (local72 == 10) {
						for (local72 = 0; local72 < Static62.anInt1350; local72++) {
							local287 = local69[local72];
							local536 = local53[local72];
							local544 = local49[local72];
							local283 = local61[local72];
							local540 = local57[local72];
							local279 = local65[local72];
							local37[local72] = local279 >= local544 ? local279 : local544;
							local41[local72] = local287 < local540 ? local540 : local287;
							local45[local72] = local283 >= local536 ? local283 : local536;
						}
					} else if (local72 == 11) {
						for (local72 = 0; local72 < Static62.anInt1350; local72++) {
							local536 = local53[local72];
							local287 = local69[local72];
							local279 = local65[local72];
							local540 = local57[local72];
							local283 = local61[local72];
							local544 = local49[local72];
							local37[local72] = local279 >= local544 ? local279 - local544 : -local279 + local544;
							local41[local72] = local287 < local540 ? local540 - local287 : local287 + -local540;
							local45[local72] = local536 <= local283 ? local283 - local536 : -local283 + local536;
						}
					} else if (local72 == 12) {
						for (local72 = 0; local72 < Static62.anInt1350; local72++) {
							local279 = local65[local72];
							local536 = local53[local72];
							local283 = local61[local72];
							local540 = local57[local72];
							local287 = local69[local72];
							local544 = local49[local72];
							local37[local72] = local279 + local544 - (local544 * local279 >> 11);
							local41[local72] = local287 + local540 - (local540 * local287 >> 11);
							local45[local72] = local283 + local536 - (local283 * local536 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2032 = arg0.method2199();
		} else if (arg1 == 1) {
			this.aBoolean410 = arg0.method2199() == 1;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(30) int[] local30 = this.method4716(0, arg0);
			@Pc(36) int[] local36 = this.method4716(1, arg0);
			@Pc(39) int local39 = this.anInt2032;
			if (local39 == 1) {
				for (local39 = 0; local39 < Static62.anInt1350; local39++) {
					local19[local39] = local36[local39] + local30[local39];
				}
			} else if (local39 == 2) {
				for (local39 = 0; local39 < Static62.anInt1350; local39++) {
					local19[local39] = local30[local39] - local36[local39];
				}
			} else if (local39 == 3) {
				for (local39 = 0; local39 < Static62.anInt1350; local39++) {
					local19[local39] = local30[local39] * local36[local39] >> 12;
				}
			} else {
				@Pc(175) int local175;
				if (local39 == 4) {
					for (local39 = 0; local39 < Static62.anInt1350; local39++) {
						local175 = local36[local39];
						local19[local39] = local175 == 0 ? 4096 : (local30[local39] << 12) / local175;
					}
				} else if (local39 == 5) {
					for (local39 = 0; local39 < Static62.anInt1350; local39++) {
						local19[local39] = 4096 - ((4096 - local36[local39]) * (4096 - local30[local39]) >> 12);
					}
				} else if (local39 == 6) {
					for (local39 = 0; local39 < Static62.anInt1350; local39++) {
						local175 = local36[local39];
						local19[local39] = local175 < 2048 ? local175 * local30[local39] >> 11 : 4096 - ((4096 - local30[local39]) * (4096 - local175) >> 11);
					}
				} else {
					@Pc(285) int local285;
					if (local39 == 7) {
						for (local39 = 0; local39 < Static62.anInt1350; local39++) {
							local285 = local30[local39];
							local19[local39] = local285 == 4096 ? 4096 : (local36[local39] << 12) / (4096 - local285);
						}
					} else if (local39 == 8) {
						for (local39 = 0; local39 < Static62.anInt1350; local39++) {
							local285 = local30[local39];
							local19[local39] = local285 == 0 ? 0 : 4096 - (4096 - local36[local39] << 12) / local285;
						}
					} else if (local39 == 9) {
						for (local39 = 0; local39 < Static62.anInt1350; local39++) {
							local285 = local30[local39];
							local175 = local36[local39];
							local19[local39] = local175 <= local285 ? local175 : local285;
						}
					} else if (local39 == 10) {
						for (local39 = 0; local39 < Static62.anInt1350; local39++) {
							local175 = local36[local39];
							local285 = local30[local39];
							local19[local39] = local175 < local285 ? local285 : local175;
						}
					} else if (local39 == 11) {
						for (local39 = 0; local39 < Static62.anInt1350; local39++) {
							local175 = local36[local39];
							local285 = local30[local39];
							local19[local39] = local175 < local285 ? local285 - local175 : -local285 + local175;
						}
					} else if (local39 == 12) {
						for (local39 = 0; local39 < Static62.anInt1350; local39++) {
							local175 = local36[local39];
							local285 = local30[local39];
							local19[local39] = local285 + local175 - (local285 * local175 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
