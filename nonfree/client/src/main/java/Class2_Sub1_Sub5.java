import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!da", name = "U", descriptor = "I")
	private int anInt973 = 6;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		super(2, false);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(26) int[][] local26 = this.method4937(0, arg0);
			@Pc(32) int[][] local32 = this.method4937(1, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt973;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static114.anInt1359; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static114.anInt1359; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static114.anInt1359; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(296) int local296;
				@Pc(292) int local292;
				@Pc(300) int local300;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static114.anInt1359; local71++) {
						local292 = local64[local71];
						local296 = local60[local71];
						local300 = local68[local71];
						local36[local71] = local296 == 0 ? 4096 : (local48[local71] << 12) / local296;
						local40[local71] = local292 == 0 ? 4096 : (local52[local71] << 12) / local292;
						local44[local71] = local300 == 0 ? 4096 : (local56[local71] << 12) / local300;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static114.anInt1359; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local52[local71]) * (-local64[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (4096 - local68[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static114.anInt1359; local71++) {
						local292 = local64[local71];
						local296 = local60[local71];
						local300 = local68[local71];
						local36[local71] = local296 < 2048 ? local296 * local48[local71] >> 11 : 4096 - ((4096 - local296) * (4096 - local48[local71]) >> 11);
						local40[local71] = local292 >= 2048 ? 4096 - ((4096 - local292) * (-local52[local71] + 4096) >> 11) : local292 * local52[local71] >> 11;
						local44[local71] = local300 < 2048 ? local56[local71] * local300 >> 11 : 4096 - ((4096 - local56[local71]) * (-local300 + 4096) >> 11);
					}
				} else {
					@Pc(557) int local557;
					@Pc(549) int local549;
					@Pc(553) int local553;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static114.anInt1359; local71++) {
							local549 = local52[local71];
							local553 = local56[local71];
							local557 = local48[local71];
							local36[local71] = local557 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local557);
							local40[local71] = local549 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local549);
							local44[local71] = local553 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local553);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static114.anInt1359; local71++) {
							local557 = local48[local71];
							local549 = local52[local71];
							local553 = local56[local71];
							local36[local71] = local557 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local557;
							local40[local71] = local549 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local549;
							local44[local71] = local553 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local553;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static114.anInt1359; local71++) {
							local292 = local64[local71];
							local296 = local60[local71];
							local300 = local68[local71];
							local553 = local56[local71];
							local557 = local48[local71];
							local549 = local52[local71];
							local36[local71] = local296 <= local557 ? local296 : local557;
							local40[local71] = local292 > local549 ? local549 : local292;
							local44[local71] = local553 < local300 ? local553 : local300;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static114.anInt1359; local71++) {
							local292 = local64[local71];
							local549 = local52[local71];
							local553 = local56[local71];
							local300 = local68[local71];
							local557 = local48[local71];
							local296 = local60[local71];
							local36[local71] = local557 <= local296 ? local296 : local557;
							local40[local71] = local549 > local292 ? local549 : local292;
							local44[local71] = local300 < local553 ? local553 : local300;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static114.anInt1359; local71++) {
							local553 = local56[local71];
							local292 = local64[local71];
							local549 = local52[local71];
							local296 = local60[local71];
							local557 = local48[local71];
							local300 = local68[local71];
							local36[local71] = local557 > local296 ? local557 - local296 : local296 - local557;
							local40[local71] = local549 > local292 ? local549 - local292 : local292 + -local549;
							local44[local71] = local300 < local553 ? local553 - local300 : local300 - local553;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static114.anInt1359; local71++) {
							local557 = local48[local71];
							local553 = local56[local71];
							local292 = local64[local71];
							local300 = local68[local71];
							local549 = local52[local71];
							local296 = local60[local71];
							local36[local71] = local296 + local557 - (local296 * local557 >> 11);
							local40[local71] = local292 + local549 - (local292 * local549 >> 11);
							local44[local71] = local300 + local553 - (local553 * local300 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(28) int[] local28 = this.method4946(arg0, 0);
			@Pc(34) int[] local34 = this.method4946(arg0, 1);
			@Pc(37) int local37 = this.anInt973;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static114.anInt1359; local37++) {
					local17[local37] = local28[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static114.anInt1359; local37++) {
					local17[local37] = local28[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static114.anInt1359; local37++) {
					local17[local37] = local28[local37] * local34[local37] >> 12;
				}
			} else {
				@Pc(175) int local175;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static114.anInt1359; local37++) {
						local175 = local34[local37];
						local17[local37] = local175 == 0 ? 4096 : (local28[local37] << 12) / local175;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static114.anInt1359; local37++) {
						local17[local37] = 4096 - ((4096 - local28[local37]) * (4096 - local34[local37]) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static114.anInt1359; local37++) {
						local175 = local34[local37];
						local17[local37] = local175 < 2048 ? local175 * local28[local37] >> 11 : 4096 - ((4096 - local175) * (4096 - local28[local37]) >> 11);
					}
				} else {
					@Pc(285) int local285;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static114.anInt1359; local37++) {
							local285 = local28[local37];
							local17[local37] = local285 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local285);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static114.anInt1359; local37++) {
							local285 = local28[local37];
							local17[local37] = local285 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local285;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static114.anInt1359; local37++) {
							local175 = local34[local37];
							local285 = local28[local37];
							local17[local37] = local285 < local175 ? local285 : local175;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static114.anInt1359; local37++) {
							local285 = local28[local37];
							local175 = local34[local37];
							local17[local37] = local285 > local175 ? local285 : local175;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static114.anInt1359; local37++) {
							local175 = local34[local37];
							local285 = local28[local37];
							local17[local37] = local285 > local175 ? local285 - local175 : local175 - local285;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static114.anInt1359; local37++) {
							local285 = local28[local37];
							local175 = local34[local37];
							local17[local37] = local285 + local175 - (local175 * local285 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt973 = arg0.method4261();
		} else if (arg1 == 1) {
			this.aBoolean492 = arg0.method4261() == 1;
		}
	}
}
