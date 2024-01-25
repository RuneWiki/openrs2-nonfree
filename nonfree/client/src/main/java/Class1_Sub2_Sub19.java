import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class1_Sub2_Sub19 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mw", name = "M", descriptor = "I")
	private int anInt4695 = 6;

	static {
		new Class142(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(26) int[][] local26 = this.method5968(0, arg0);
			@Pc(32) int[][] local32 = this.method5968(1, arg0);
			@Pc(36) int[] local36 = local11[0];
			@Pc(40) int[] local40 = local11[1];
			@Pc(44) int[] local44 = local11[2];
			@Pc(48) int[] local48 = local26[0];
			@Pc(52) int[] local52 = local26[1];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[1];
			@Pc(68) int[] local68 = local32[2];
			@Pc(71) int local71 = this.anInt4695;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static218.anInt3990; local71++) {
					local36[local71] = local60[local71] + local48[local71];
					local40[local71] = local52[local71] + local64[local71];
					local44[local71] = local56[local71] + local68[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static218.anInt3990; local71++) {
					local36[local71] = local48[local71] - local60[local71];
					local40[local71] = local52[local71] - local64[local71];
					local44[local71] = local56[local71] - local68[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static218.anInt3990; local71++) {
					local36[local71] = local60[local71] * local48[local71] >> 12;
					local40[local71] = local52[local71] * local64[local71] >> 12;
					local44[local71] = local68[local71] * local56[local71] >> 12;
				}
			} else {
				@Pc(261) int local261;
				@Pc(269) int local269;
				@Pc(265) int local265;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static218.anInt3990; local71++) {
						local261 = local60[local71];
						local265 = local68[local71];
						local269 = local64[local71];
						local36[local71] = local261 == 0 ? 4096 : (local48[local71] << 12) / local261;
						local40[local71] = local269 == 0 ? 4096 : (local52[local71] << 12) / local269;
						local44[local71] = local265 == 0 ? 4096 : (local56[local71] << 12) / local265;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static218.anInt3990; local71++) {
						local36[local71] = 4096 - ((4096 - local48[local71]) * (-local60[local71] + 4096) >> 12);
						local40[local71] = 4096 - ((4096 - local64[local71]) * (-local52[local71] + 4096) >> 12);
						local44[local71] = 4096 - ((4096 - local68[local71]) * (4096 - local56[local71]) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static218.anInt3990; local71++) {
						local265 = local68[local71];
						local261 = local60[local71];
						local269 = local64[local71];
						local36[local71] = local261 < 2048 ? local48[local71] * local261 >> 11 : 4096 - ((4096 - local48[local71]) * (4096 - local261) >> 11);
						local40[local71] = local269 >= 2048 ? 4096 - ((4096 - local269) * (-local52[local71] + 4096) >> 11) : local269 * local52[local71] >> 11;
						local44[local71] = local265 >= 2048 ? 4096 - ((4096 - local265) * (4096 - local56[local71]) >> 11) : local56[local71] * local265 >> 11;
					}
				} else {
					@Pc(529) int local529;
					@Pc(533) int local533;
					@Pc(525) int local525;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static218.anInt3990; local71++) {
							local525 = local56[local71];
							local529 = local48[local71];
							local533 = local52[local71];
							local36[local71] = local529 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local529);
							local40[local71] = local533 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local533);
							local44[local71] = local525 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local525);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static218.anInt3990; local71++) {
							local525 = local56[local71];
							local529 = local48[local71];
							local533 = local52[local71];
							local36[local71] = local529 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local529;
							local40[local71] = local533 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local533;
							local44[local71] = local525 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local525;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static218.anInt3990; local71++) {
							local529 = local48[local71];
							local533 = local52[local71];
							local525 = local56[local71];
							local269 = local64[local71];
							local261 = local60[local71];
							local265 = local68[local71];
							local36[local71] = local261 <= local529 ? local261 : local529;
							local40[local71] = local269 <= local533 ? local269 : local533;
							local44[local71] = local525 < local265 ? local525 : local265;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static218.anInt3990; local71++) {
							local529 = local48[local71];
							local261 = local60[local71];
							local525 = local56[local71];
							local265 = local68[local71];
							local533 = local52[local71];
							local269 = local64[local71];
							local36[local71] = local261 < local529 ? local529 : local261;
							local40[local71] = local269 >= local533 ? local269 : local533;
							local44[local71] = local265 >= local525 ? local265 : local525;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static218.anInt3990; local71++) {
							local261 = local60[local71];
							local533 = local52[local71];
							local265 = local68[local71];
							local269 = local64[local71];
							local529 = local48[local71];
							local525 = local56[local71];
							local36[local71] = local261 >= local529 ? local261 - local529 : -local261 + local529;
							local40[local71] = local269 >= local533 ? local269 - local533 : local533 + -local269;
							local44[local71] = local525 > local265 ? local525 - local265 : local265 + -local525;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static218.anInt3990; local71++) {
							local265 = local68[local71];
							local269 = local64[local71];
							local525 = local56[local71];
							local529 = local48[local71];
							local533 = local52[local71];
							local261 = local60[local71];
							local36[local71] = local261 + local529 - (local261 * local529 >> 11);
							local40[local71] = local269 + local533 - (local269 * local533 >> 11);
							local44[local71] = local525 + local265 - (local265 * local525 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4695 = arg0.method2915();
		} else if (arg1 == 1) {
			super.aBoolean650 = arg0.method2915() == 1;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(21) int[] local21 = this.method5964(arg0, 0);
			@Pc(27) int[] local27 = this.method5964(arg0, 1);
			@Pc(30) int local30 = this.anInt4695;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static218.anInt3990; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static218.anInt3990; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static218.anInt3990; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(157) int local157;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static218.anInt3990; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 == 0 ? 4096 : (local21[local30] << 12) / local157;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static218.anInt3990; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (4096 - local27[local30]) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static218.anInt3990; local30++) {
						local157 = local27[local30];
						local11[local30] = local157 >= 2048 ? 4096 - ((4096 - local157) * (4096 - local21[local30]) >> 11) : local157 * local21[local30] >> 11;
					}
				} else {
					@Pc(269) int local269;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static218.anInt3990; local30++) {
							local269 = local21[local30];
							local11[local30] = local269 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local269);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static218.anInt3990; local30++) {
							local269 = local21[local30];
							local11[local30] = local269 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local269;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static218.anInt3990; local30++) {
							local157 = local27[local30];
							local269 = local21[local30];
							local11[local30] = local269 < local157 ? local269 : local157;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static218.anInt3990; local30++) {
							local157 = local27[local30];
							local269 = local21[local30];
							local11[local30] = local269 <= local157 ? local157 : local269;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static218.anInt3990; local30++) {
							local157 = local27[local30];
							local269 = local21[local30];
							local11[local30] = local157 < local269 ? local269 - local157 : local157 - local269;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static218.anInt3990; local30++) {
							local157 = local27[local30];
							local269 = local21[local30];
							local11[local30] = local269 + local157 - (local269 * local157 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
