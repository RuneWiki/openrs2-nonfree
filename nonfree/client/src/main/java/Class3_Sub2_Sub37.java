import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class3_Sub2_Sub37 extends Class3_Sub2 {

	@OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
	private int anInt4072 = 6;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub37() {
		super(2, false);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(26) int[][] local26 = this.method3332(0, arg0);
			@Pc(32) int[][] local32 = this.method3332(1, arg0);
			@Pc(36) int[] local36 = local7[1];
			@Pc(40) int[] local40 = local7[0];
			@Pc(44) int[] local44 = local26[1];
			@Pc(48) int[] local48 = local7[2];
			@Pc(52) int[] local52 = local26[0];
			@Pc(56) int[] local56 = local26[2];
			@Pc(60) int[] local60 = local32[0];
			@Pc(64) int[] local64 = local32[2];
			@Pc(68) int[] local68 = local32[1];
			@Pc(71) int local71 = this.anInt4072;
			if (local71 == 1) {
				for (local71 = 0; local71 < Static190.anInt3865; local71++) {
					local40[local71] = local60[local71] + local52[local71];
					local36[local71] = local68[local71] + local44[local71];
					local48[local71] = local64[local71] + local56[local71];
				}
			} else if (local71 == 2) {
				for (local71 = 0; local71 < Static190.anInt3865; local71++) {
					local40[local71] = local52[local71] - local60[local71];
					local36[local71] = local44[local71] - local68[local71];
					local48[local71] = local56[local71] - local64[local71];
				}
			} else if (local71 == 3) {
				for (local71 = 0; local71 < Static190.anInt3865; local71++) {
					local40[local71] = local60[local71] * local52[local71] >> 12;
					local36[local71] = local68[local71] * local44[local71] >> 12;
					local48[local71] = local56[local71] * local64[local71] >> 12;
				}
			} else {
				@Pc(272) int local272;
				@Pc(268) int local268;
				@Pc(264) int local264;
				if (local71 == 4) {
					for (local71 = 0; local71 < Static190.anInt3865; local71++) {
						local264 = local64[local71];
						local268 = local68[local71];
						local272 = local60[local71];
						local40[local71] = local272 == 0 ? 4096 : (local52[local71] << 12) / local272;
						local36[local71] = local268 == 0 ? 4096 : (local44[local71] << 12) / local268;
						local48[local71] = local264 == 0 ? 4096 : (local56[local71] << 12) / local264;
					}
				} else if (local71 == 5) {
					for (local71 = 0; local71 < Static190.anInt3865; local71++) {
						local40[local71] = 4096 - ((4096 - local52[local71]) * (4096 - local60[local71]) >> 12);
						local36[local71] = 4096 - ((4096 - local68[local71]) * (-local44[local71] + 4096) >> 12);
						local48[local71] = 4096 - ((4096 - local56[local71]) * (-local64[local71] + 4096) >> 12);
					}
				} else if (local71 == 6) {
					for (local71 = 0; local71 < Static190.anInt3865; local71++) {
						local268 = local68[local71];
						local272 = local60[local71];
						local264 = local64[local71];
						local40[local71] = local272 >= 2048 ? 4096 - ((4096 - local272) * (-local52[local71] + 4096) >> 11) : local52[local71] * local272 >> 11;
						local36[local71] = local268 >= 2048 ? 4096 - ((4096 - local268) * (-local44[local71] + 4096) >> 11) : local44[local71] * local268 >> 11;
						local48[local71] = local264 >= 2048 ? 4096 - ((4096 - local264) * (4096 - local56[local71]) >> 11) : local56[local71] * local264 >> 11;
					}
				} else {
					@Pc(529) int local529;
					@Pc(525) int local525;
					@Pc(533) int local533;
					if (local71 == 7) {
						for (local71 = 0; local71 < Static190.anInt3865; local71++) {
							local525 = local44[local71];
							local529 = local52[local71];
							local533 = local56[local71];
							local40[local71] = local529 == 4096 ? 4096 : (local60[local71] << 12) / (4096 - local529);
							local36[local71] = local525 == 4096 ? 4096 : (local68[local71] << 12) / (4096 - local525);
							local48[local71] = local533 == 4096 ? 4096 : (local64[local71] << 12) / (4096 - local533);
						}
					} else if (local71 == 8) {
						for (local71 = 0; local71 < Static190.anInt3865; local71++) {
							local529 = local52[local71];
							local533 = local56[local71];
							local525 = local44[local71];
							local40[local71] = local529 == 0 ? 0 : 4096 - (4096 - local60[local71] << 12) / local529;
							local36[local71] = local525 == 0 ? 0 : 4096 - (4096 - local68[local71] << 12) / local525;
							local48[local71] = local533 == 0 ? 0 : 4096 - (4096 - local64[local71] << 12) / local533;
						}
					} else if (local71 == 9) {
						for (local71 = 0; local71 < Static190.anInt3865; local71++) {
							local268 = local68[local71];
							local525 = local44[local71];
							local529 = local52[local71];
							local264 = local64[local71];
							local272 = local60[local71];
							local533 = local56[local71];
							local40[local71] = local272 <= local529 ? local272 : local529;
							local36[local71] = local268 <= local525 ? local268 : local525;
							local48[local71] = local533 >= local264 ? local264 : local533;
						}
					} else if (local71 == 10) {
						for (local71 = 0; local71 < Static190.anInt3865; local71++) {
							local264 = local64[local71];
							local533 = local56[local71];
							local268 = local68[local71];
							local272 = local60[local71];
							local525 = local44[local71];
							local529 = local52[local71];
							local40[local71] = local272 < local529 ? local529 : local272;
							local36[local71] = local525 <= local268 ? local268 : local525;
							local48[local71] = local264 < local533 ? local533 : local264;
						}
					} else if (local71 == 11) {
						for (local71 = 0; local71 < Static190.anInt3865; local71++) {
							local525 = local44[local71];
							local272 = local60[local71];
							local533 = local56[local71];
							local264 = local64[local71];
							local529 = local52[local71];
							local268 = local68[local71];
							local40[local71] = local529 <= local272 ? local272 - local529 : local529 - local272;
							local36[local71] = local525 > local268 ? local525 - local268 : local268 + -local525;
							local48[local71] = local264 < local533 ? local533 - local264 : -local533 + local264;
						}
					} else if (local71 == 12) {
						for (local71 = 0; local71 < Static190.anInt3865; local71++) {
							local525 = local44[local71];
							local533 = local56[local71];
							local268 = local68[local71];
							local264 = local64[local71];
							local529 = local52[local71];
							local272 = local60[local71];
							local40[local71] = local529 + local272 - (local272 * local529 >> 11);
							local36[local71] = local268 + local525 - (local525 * local268 >> 11);
							local48[local71] = local264 + local533 - (local533 * local264 >> 11);
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, arg0);
			@Pc(35) int[] local35 = this.method3328(1, arg0);
			@Pc(38) int local38 = this.anInt4072;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static190.anInt3865; local38++) {
					local19[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static190.anInt3865; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static190.anInt3865; local38++) {
					local19[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static190.anInt3865; local38++) {
						local163 = local35[local38];
						local19[local38] = local163 == 0 ? 4096 : (local29[local38] << 12) / local163;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static190.anInt3865; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static190.anInt3865; local38++) {
						local163 = local35[local38];
						local19[local38] = local163 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local163 + 4096) >> 11) : local29[local38] * local163 >> 11;
					}
				} else {
					@Pc(278) int local278;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static190.anInt3865; local38++) {
							local278 = local29[local38];
							local19[local38] = local278 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local278);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static190.anInt3865; local38++) {
							local278 = local29[local38];
							local19[local38] = local278 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local278;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static190.anInt3865; local38++) {
							local163 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local278 >= local163 ? local163 : local278;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static190.anInt3865; local38++) {
							local278 = local29[local38];
							local163 = local35[local38];
							local19[local38] = local278 <= local163 ? local163 : local278;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static190.anInt3865; local38++) {
							local163 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local278 <= local163 ? local163 - local278 : -local163 + local278;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static190.anInt3865; local38++) {
							local163 = local35[local38];
							local278 = local29[local38];
							local19[local38] = local163 + local278 - (local163 * local278 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4072 = arg0.method1278();
		} else if (arg1 == 1) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}
}
