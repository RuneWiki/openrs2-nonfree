import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class4_Sub2_Sub32 extends Class4_Sub2 {

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	private int anInt6665 = 6;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub32() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(27) int[] local27 = this.method5847(0, arg0);
			@Pc(33) int[] local33 = this.method5847(1, arg0);
			@Pc(36) int local36 = this.anInt6665;
			if (local36 == 1) {
				for (local36 = 0; local36 < Static350.anInt6330; local36++) {
					local11[local36] = local27[local36] + local33[local36];
				}
			} else if (local36 == 2) {
				for (local36 = 0; local36 < Static350.anInt6330; local36++) {
					local11[local36] = local27[local36] - local33[local36];
				}
			} else if (local36 == 3) {
				for (local36 = 0; local36 < Static350.anInt6330; local36++) {
					local11[local36] = local27[local36] * local33[local36] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local36 == 4) {
					for (local36 = 0; local36 < Static350.anInt6330; local36++) {
						local159 = local33[local36];
						local11[local36] = local159 == 0 ? 4096 : (local27[local36] << 12) / local159;
					}
				} else if (local36 == 5) {
					for (local36 = 0; local36 < Static350.anInt6330; local36++) {
						local11[local36] = 4096 - ((4096 - local27[local36]) * (-local33[local36] + 4096) >> 12);
					}
				} else if (local36 == 6) {
					for (local36 = 0; local36 < Static350.anInt6330; local36++) {
						local159 = local33[local36];
						local11[local36] = local159 < 2048 ? local159 * local27[local36] >> 11 : 4096 - ((4096 - local27[local36]) * (-local159 + 4096) >> 11);
					}
				} else {
					@Pc(272) int local272;
					if (local36 == 7) {
						for (local36 = 0; local36 < Static350.anInt6330; local36++) {
							local272 = local27[local36];
							local11[local36] = local272 == 4096 ? 4096 : (local33[local36] << 12) / (4096 - local272);
						}
					} else if (local36 == 8) {
						for (local36 = 0; local36 < Static350.anInt6330; local36++) {
							local272 = local27[local36];
							local11[local36] = local272 == 0 ? 0 : 4096 - (4096 - local33[local36] << 12) / local272;
						}
					} else if (local36 == 9) {
						for (local36 = 0; local36 < Static350.anInt6330; local36++) {
							local272 = local27[local36];
							local159 = local33[local36];
							local11[local36] = local272 >= local159 ? local159 : local272;
						}
					} else if (local36 == 10) {
						for (local36 = 0; local36 < Static350.anInt6330; local36++) {
							local272 = local27[local36];
							local159 = local33[local36];
							local11[local36] = local272 <= local159 ? local159 : local272;
						}
					} else if (local36 == 11) {
						for (local36 = 0; local36 < Static350.anInt6330; local36++) {
							local159 = local33[local36];
							local272 = local27[local36];
							local11[local36] = local159 >= local272 ? local159 - local272 : -local159 + local272;
						}
					} else if (local36 == 12) {
						for (local36 = 0; local36 < Static350.anInt6330; local36++) {
							local272 = local27[local36];
							local159 = local33[local36];
							local11[local36] = local159 + local272 - (local272 * local159 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(26) int[][] local26 = this.method5848(0, arg0);
			@Pc(32) int[][] local32 = this.method5848(1, arg0);
			@Pc(36) int[] local36 = local16[0];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt6665;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static350.anInt6330; local71++) {
					local36[local71] = local48[local71] + local60[local71];
					local40[local71] = local64[local71] + local52[local71];
					local44[local71] = local68[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static350.anInt6330; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static350.anInt6330; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local64[local71] * local52[local71] >> 12;
					local44[local71] = local56[local71] * local68[local71] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(273) int local273;
				@Pc(277) int local277;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static350.anInt6330; local71++) {
						local269 = local60[local71];
						local273 = local64[local71];
						local277 = local68[local71];
						local36[local71] = local269 == 0 ? 4096 : (local48[local71] << 12) / local269;
						local40[local71] = local273 == 0 ? 4096 : (local52[local71] << 12) / local273;
						local44[local71] = local277 == 0 ? 4096 : (local56[local71] << 12) / local277;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static350.anInt6330; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (4096 - local52[local71]) >> 12);
						local44[local71] = 4096 - ((4096 - local56[local71]) * (-local68[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static350.anInt6330; local71++) {
						local269 = local60[local71];
						local277 = local68[local71];
						local273 = local64[local71];
						local36[local71] = local269 < 2048 ? local269 * local48[local71] >> 11 : 4096 - ((4096 - local48[local71]) * (-local269 + 4096) >> 11);
						local40[local71] = local273 >= 2048 ? 4096 - ((4096 - local273) * (-local52[local71] + 4096) >> 11) : local52[local71] * local273 >> 11;
						local44[local71] = local277 < 2048 ? local56[local71] * local277 >> 11 : 4096 - ((4096 - local56[local71]) * (-local277 + 4096) >> 11);
					}
				} else {
					@Pc(525) int local525;
					@Pc(529) int local529;
					@Pc(533) int local533;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static350.anInt6330; local71++) {
							local525 = local48[local71];
							local529 = local52[local71];
							local533 = local56[local71];
							local36[local71] = local525 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local525);
							local40[local71] = local529 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local529);
							local44[local71] = local533 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local533);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static350.anInt6330; local71++) {
							local525 = local48[local71];
							local533 = local56[local71];
							local529 = local52[local71];
							local36[local71] = local525 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local525;
							local40[local71] = local529 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local529;
							local44[local71] = local533 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local533;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static350.anInt6330; local71++) {
							local529 = local52[local71];
							local533 = local56[local71];
							local277 = local68[local71];
							local269 = local60[local71];
							local273 = local64[local71];
							local525 = local48[local71];
							local36[local71] = local269 > local525 ? local525 : local269;
							local40[local71] = local273 > local529 ? local529 : local273;
							local44[local71] = local533 < local277 ? local533 : local277;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static350.anInt6330; local71++) {
							local273 = local64[local71];
							local525 = local48[local71];
							local277 = local68[local71];
							local269 = local60[local71];
							local529 = local52[local71];
							local533 = local56[local71];
							local36[local71] = local525 <= local269 ? local269 : local525;
							local40[local71] = local529 <= local273 ? local273 : local529;
							local44[local71] = local533 > local277 ? local533 : local277;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static350.anInt6330; local71++) {
							local277 = local68[local71];
							local269 = local60[local71];
							local273 = local64[local71];
							local533 = local56[local71];
							local529 = local52[local71];
							local525 = local48[local71];
							local36[local71] = local525 <= local269 ? local269 - local525 : -local269 + local525;
							local40[local71] = local273 < local529 ? local529 - local273 : local273 - local529;
							local44[local71] = local533 <= local277 ? local277 - local533 : local533 + -local277;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static350.anInt6330; local71++) {
							local277 = local68[local71];
							local273 = local64[local71];
							local269 = local60[local71];
							local529 = local52[local71];
							local525 = local48[local71];
							local533 = local56[local71];
							local36[local71] = local269 + local525 - (local525 * local269 >> 11);
							local40[local71] = local529 + local273 - (local273 * local529 >> 11);
							local44[local71] = local533 + local277 - (local533 * local277 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt6665 = arg1.method4864();
		} else if (arg0 == 1) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}
}
