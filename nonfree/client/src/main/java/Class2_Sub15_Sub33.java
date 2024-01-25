import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class2_Sub15_Sub33 extends Class2_Sub15 {

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
	private int anInt10136 = 6;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub33() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(26) int[][] local26 = this.method9727(0, arg0);
			@Pc(32) int[][] local32 = this.method9727(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt10136;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static329.anInt6017; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static329.anInt6017; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static329.anInt6017; local71++) {
					local36[local71] = local48[local71] * local60[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(275) int local275;
				@Pc(271) int local271;
				@Pc(267) int local267;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static329.anInt6017; local71++) {
						local267 = local68[local71];
						local271 = local64[local71];
						local275 = local60[local71];
						local36[local71] = local275 == 0 ? 4096 : (local48[local71] << 12) / local275;
						local40[local71] = local271 == 0 ? 4096 : (local52[local71] << 12) / local271;
						local44[local71] = local267 == 0 ? 4096 : (local56[local71] << 12) / local267;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static329.anInt6017; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static329.anInt6017; local71++) {
						local267 = local68[local71];
						local271 = local64[local71];
						local275 = local60[local71];
						local36[local71] = local275 >= 2048 ? 4096 - ((4096 - local48[local71]) * (-local275 + 4096) >> 11) : local48[local71] * local275 >> 11;
						local40[local71] = local271 < 2048 ? local271 * local52[local71] >> 11 : 4096 - ((4096 - local271) * (-local52[local71] + 4096) >> 11);
						local44[local71] = local267 >= 2048 ? 4096 - ((4096 - local56[local71]) * (-local267 + 4096) >> 11) : local56[local71] * local267 >> 11;
					}
				} else {
					@Pc(529) int local529;
					@Pc(525) int local525;
					@Pc(533) int local533;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static329.anInt6017; local71++) {
							local525 = local52[local71];
							local529 = local48[local71];
							local533 = local56[local71];
							local36[local71] = local529 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local529);
							local40[local71] = local525 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local525);
							local44[local71] = local533 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local533);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static329.anInt6017; local71++) {
							local529 = local48[local71];
							local525 = local52[local71];
							local533 = local56[local71];
							local36[local71] = local529 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local529;
							local40[local71] = local525 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local525;
							local44[local71] = local533 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local533;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static329.anInt6017; local71++) {
							local271 = local64[local71];
							local267 = local68[local71];
							local529 = local48[local71];
							local275 = local60[local71];
							local533 = local56[local71];
							local525 = local52[local71];
							local36[local71] = local275 > local529 ? local529 : local275;
							local40[local71] = local271 <= local525 ? local271 : local525;
							local44[local71] = local267 <= local533 ? local267 : local533;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static329.anInt6017; local71++) {
							local271 = local64[local71];
							local533 = local56[local71];
							local267 = local68[local71];
							local275 = local60[local71];
							local529 = local48[local71];
							local525 = local52[local71];
							local36[local71] = local529 > local275 ? local529 : local275;
							local40[local71] = local525 > local271 ? local525 : local271;
							local44[local71] = local533 > local267 ? local533 : local267;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static329.anInt6017; local71++) {
							local529 = local48[local71];
							local271 = local64[local71];
							local275 = local60[local71];
							local533 = local56[local71];
							local525 = local52[local71];
							local267 = local68[local71];
							local36[local71] = local529 > local275 ? local529 - local275 : -local529 + local275;
							local40[local71] = local271 >= local525 ? local271 - local525 : local525 - local271;
							local44[local71] = local267 < local533 ? local533 - local267 : local267 - local533;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static329.anInt6017; local71++) {
							local275 = local60[local71];
							local529 = local48[local71];
							local525 = local52[local71];
							local271 = local64[local71];
							local533 = local56[local71];
							local267 = local68[local71];
							local36[local71] = local529 + local275 - (local275 * local529 >> 11);
							local40[local71] = local525 + local271 - (local525 * local271 >> 11);
							local44[local71] = local533 + local267 - (local533 * local267 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(35) int[] local35 = this.method9725(0, arg0);
			@Pc(43) int[] local43 = this.method9725(1, arg0);
			@Pc(46) int local46 = this.anInt10136;
			if (local46 == 1) {
				for (local46 = 0; local46 < Static329.anInt6017; local46++) {
					local11[local46] = local43[local46] + local35[local46];
				}
			} else if (local46 == 2) {
				for (local46 = 0; local46 < Static329.anInt6017; local46++) {
					local11[local46] = local35[local46] - local43[local46];
				}
			} else if (local46 == 3) {
				for (local46 = 0; local46 < Static329.anInt6017; local46++) {
					local11[local46] = local43[local46] * local35[local46] >> 12;
				}
			} else {
				@Pc(178) int local178;
				if (local46 == 4) {
					for (local46 = 0; local46 < Static329.anInt6017; local46++) {
						local178 = local43[local46];
						local11[local46] = local178 == 0 ? 4096 : (local35[local46] << 12) / local178;
					}
				} else if (local46 == 5) {
					for (local46 = 0; local46 < Static329.anInt6017; local46++) {
						local11[local46] = 4096 - ((4096 - local43[local46]) * (-local35[local46] + 4096) >> 12);
					}
				} else if (local46 == 6) {
					for (local46 = 0; local46 < Static329.anInt6017; local46++) {
						local178 = local43[local46];
						local11[local46] = local178 >= 2048 ? 4096 - ((4096 - local35[local46]) * (-local178 + 4096) >> 11) : local35[local46] * local178 >> 11;
					}
				} else {
					@Pc(285) int local285;
					if (local46 == 7) {
						for (local46 = 0; local46 < Static329.anInt6017; local46++) {
							local285 = local35[local46];
							local11[local46] = local285 == 4096 ? 4096 : (local43[local46] << 12) / (4096 - local285);
						}
					} else if (local46 == 8) {
						for (local46 = 0; local46 < Static329.anInt6017; local46++) {
							local285 = local35[local46];
							local11[local46] = local285 == 0 ? 0 : 4096 - (4096 - local43[local46] << 12) / local285;
						}
					} else if (local46 == 9) {
						for (local46 = 0; local46 < Static329.anInt6017; local46++) {
							local285 = local35[local46];
							local178 = local43[local46];
							local11[local46] = local285 >= local178 ? local178 : local285;
						}
					} else if (local46 == 10) {
						for (local46 = 0; local46 < Static329.anInt6017; local46++) {
							local285 = local35[local46];
							local178 = local43[local46];
							local11[local46] = local178 >= local285 ? local178 : local285;
						}
					} else if (local46 == 11) {
						for (local46 = 0; local46 < Static329.anInt6017; local46++) {
							local178 = local43[local46];
							local285 = local35[local46];
							local11[local46] = local178 < local285 ? local285 - local178 : local178 + -local285;
						}
					} else if (local46 == 12) {
						for (local46 = 0; local46 < Static329.anInt6017; local46++) {
							local285 = local35[local46];
							local178 = local43[local46];
							local11[local46] = local285 + local178 - (local178 * local285 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10136 = arg1.method5203();
		} else if (arg0 == 1) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}
}
