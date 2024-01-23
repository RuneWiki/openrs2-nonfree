import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
	private int anInt2044 = 6;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(26) int[][] local26 = this.method3465(arg0, 0);
			@Pc(32) int[][] local32 = this.method3465(arg0, 1);
			@Pc(36) int[] local36 = local7[1];
			@Pc(40) int[] local40 = local26[0];
			@Pc(44) int[] local44 = local7[2];
			@Pc(48) int[] local48 = local7[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local32[0];
			@Pc(60) int[] local60 = local26[2];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt2044;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static76.anInt1531; local71++) {
					local48[local71] = local56[local71] + local40[local71];
					local36[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local60[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static76.anInt1531; local71++) {
					local48[local71] = local40[local71] - local56[local71];
					local36[local71] = local52[local71] - local64[local71];
					local44[local71] = local60[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static76.anInt1531; local71++) {
					local48[local71] = local56[local71] * local40[local71] >> 12;
					local36[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local60[local71] >> 12;
				}
			} else {
				@Pc(257) int local257;
				@Pc(261) int local261;
				@Pc(253) int local253;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static76.anInt1531; local71++) {
						local253 = local68[local71];
						local257 = local56[local71];
						local261 = local64[local71];
						local48[local71] = local257 == 0 ? 4096 : (local40[local71] << 12) / local257;
						local36[local71] = local261 == 0 ? 4096 : (local52[local71] << 12) / local261;
						local44[local71] = local253 == 0 ? 4096 : (local60[local71] << 12) / local253;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static76.anInt1531; local71++) {
						local48[local71] = 4096 - ((4096 - local40[local71]) * (-local56[local71] + 4096) >> 12);
						local36[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local60[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static76.anInt1531; local71++) {
						local253 = local68[local71];
						local257 = local56[local71];
						local261 = local64[local71];
						local48[local71] = local257 >= 2048 ? 4096 - ((4096 - local40[local71]) * (-local257 + 4096) >> 11) : local257 * local40[local71] >> 11;
						local36[local71] = local261 < 2048 ? local261 * local52[local71] >> 11 : 4096 - ((4096 - local261) * (4096 - local52[local71]) >> 11);
						local44[local71] = local253 >= 2048 ? 4096 - ((4096 - local253) * (4096 - local60[local71]) >> 11) : local60[local71] * local253 >> 11;
					}
				} else {
					@Pc(515) int local515;
					@Pc(511) int local511;
					@Pc(507) int local507;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static76.anInt1531; local71++) {
							local507 = local60[local71];
							local511 = local52[local71];
							local515 = local40[local71];
							local48[local71] = local515 == 4096 ? 4096 : (local56[local71] << 12) / (4096 - local515);
							local36[local71] = local511 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local511);
							local44[local71] = local507 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local507);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static76.anInt1531; local71++) {
							local507 = local60[local71];
							local511 = local52[local71];
							local515 = local40[local71];
							local48[local71] = local515 == 0 ? 0 : 4096 - (4096 - local56[local71] << 12) / local515;
							local36[local71] = local511 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local511;
							local44[local71] = local507 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local507;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static76.anInt1531; local71++) {
							local253 = local68[local71];
							local261 = local64[local71];
							local511 = local52[local71];
							local507 = local60[local71];
							local257 = local56[local71];
							local515 = local40[local71];
							local48[local71] = local257 > local515 ? local515 : local257;
							local36[local71] = local261 > local511 ? local511 : local261;
							local44[local71] = local507 >= local253 ? local253 : local507;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static76.anInt1531; local71++) {
							local511 = local52[local71];
							local515 = local40[local71];
							local261 = local64[local71];
							local507 = local60[local71];
							local253 = local68[local71];
							local257 = local56[local71];
							local48[local71] = local257 < local515 ? local515 : local257;
							local36[local71] = local261 >= local511 ? local261 : local511;
							local44[local71] = local507 <= local253 ? local253 : local507;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static76.anInt1531; local71++) {
							local253 = local68[local71];
							local261 = local64[local71];
							local511 = local52[local71];
							local515 = local40[local71];
							local507 = local60[local71];
							local257 = local56[local71];
							local48[local71] = local257 < local515 ? local515 - local257 : -local515 + local257;
							local36[local71] = local261 < local511 ? local511 - local261 : -local511 + local261;
							local44[local71] = local253 >= local507 ? local253 - local507 : local507 - local253;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static76.anInt1531; local71++) {
							local507 = local60[local71];
							local257 = local56[local71];
							local261 = local64[local71];
							local515 = local40[local71];
							local253 = local68[local71];
							local511 = local52[local71];
							local48[local71] = local257 + local515 - (local257 * local515 >> 11);
							local36[local71] = local261 + local511 - (local261 * local511 >> 11);
							local44[local71] = local507 + local253 - (local507 * local253 >> 11);
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2044 = arg1.method2142();
		} else if (arg0 == 1) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(23) int[] local23 = this.method3468(arg0, 0);
			@Pc(29) int[] local29 = this.method3468(arg0, 1);
			@Pc(32) int local32 = this.anInt2044;
			if (local32 == 1) {
				for (local32 = 0; local32 < Static76.anInt1531; local32++) {
					local9[local32] = local23[local32] + local29[local32];
				}
			} else if (local32 == 2) {
				for (local32 = 0; local32 < Static76.anInt1531; local32++) {
					local9[local32] = local23[local32] - local29[local32];
				}
			} else if (local32 == 3) {
				for (local32 = 0; local32 < Static76.anInt1531; local32++) {
					local9[local32] = local23[local32] * local29[local32] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local32 == 4) {
					for (local32 = 0; local32 < Static76.anInt1531; local32++) {
						local157 = local29[local32];
						local9[local32] = local157 == 0 ? 4096 : (local23[local32] << 12) / local157;
					}
				} else if (local32 == 5) {
					for (local32 = 0; local32 < Static76.anInt1531; local32++) {
						local9[local32] = 4096 - ((4096 - local23[local32]) * (-local29[local32] + 4096) >> 12);
					}
				} else if (local32 == 6) {
					for (local32 = 0; local32 < Static76.anInt1531; local32++) {
						local157 = local29[local32];
						local9[local32] = local157 < 2048 ? local157 * local23[local32] >> 11 : 4096 - ((4096 - local23[local32]) * (-local157 + 4096) >> 11);
					}
				} else {
					@Pc(263) int local263;
					if (local32 == 7) {
						for (local32 = 0; local32 < Static76.anInt1531; local32++) {
							local263 = local23[local32];
							local9[local32] = local263 == 4096 ? 4096 : (local29[local32] << 12) / (4096 - local263);
						}
					} else if (local32 == 8) {
						for (local32 = 0; local32 < Static76.anInt1531; local32++) {
							local263 = local23[local32];
							local9[local32] = local263 == 0 ? 0 : 4096 - (4096 - local29[local32] << 12) / local263;
						}
					} else if (local32 == 9) {
						for (local32 = 0; local32 < Static76.anInt1531; local32++) {
							local157 = local29[local32];
							local263 = local23[local32];
							local9[local32] = local157 <= local263 ? local157 : local263;
						}
					} else if (local32 == 10) {
						for (local32 = 0; local32 < Static76.anInt1531; local32++) {
							local263 = local23[local32];
							local157 = local29[local32];
							local9[local32] = local157 < local263 ? local263 : local157;
						}
					} else if (local32 == 11) {
						for (local32 = 0; local32 < Static76.anInt1531; local32++) {
							local157 = local29[local32];
							local263 = local23[local32];
							local9[local32] = local157 >= local263 ? local157 - local263 : local263 + -local157;
						}
					} else if (local32 == 12) {
						for (local32 = 0; local32 < Static76.anInt1531; local32++) {
							local157 = local29[local32];
							local263 = local23[local32];
							local9[local32] = local157 + local263 - (local263 * local157 >> 11);
						}
					}
				}
			}
		}
		return local9;
	}
}
