import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class1_Sub8_Sub28 extends Class1_Sub8 {

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
	private int anInt6059 = 6;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub28() {
		super(2, false);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILclient!ia;)V")
	@Override
	public void method6038(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt6059 = arg1.method1171();
		} else if (arg0 == 1) {
			super.aBoolean508 = arg1.method1171() == 1;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			@Pc(29) int[] local29 = this.method6037(0, arg0);
			@Pc(35) int[] local35 = this.method6037(1, arg0);
			@Pc(38) int local38 = this.anInt6059;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static18.anInt439; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static18.anInt439; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static18.anInt439; local38++) {
					local19[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static18.anInt439; local38++) {
						local163 = local35[local38];
						local19[local38] = local163 == 0 ? 4096 : (local29[local38] << 12) / local163;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static18.anInt439; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static18.anInt439; local38++) {
						local163 = local35[local38];
						local19[local38] = local163 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local163 + 4096) >> 11) : local29[local38] * local163 >> 11;
					}
				} else {
					@Pc(270) int local270;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static18.anInt439; local38++) {
							local270 = local29[local38];
							local19[local38] = local270 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local270);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static18.anInt439; local38++) {
							local270 = local29[local38];
							local19[local38] = local270 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local270;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static18.anInt439; local38++) {
							local270 = local29[local38];
							local163 = local35[local38];
							local19[local38] = local163 > local270 ? local270 : local163;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static18.anInt439; local38++) {
							local163 = local35[local38];
							local270 = local29[local38];
							local19[local38] = local270 <= local163 ? local163 : local270;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static18.anInt439; local38++) {
							local270 = local29[local38];
							local163 = local35[local38];
							local19[local38] = local163 >= local270 ? local163 - local270 : local270 + -local163;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static18.anInt439; local38++) {
							local270 = local29[local38];
							local163 = local35[local38];
							local19[local38] = local270 + local163 - (local270 * local163 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method6030(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass130_41.method3108(arg0);
		if (super.aClass130_41.aBoolean246) {
			@Pc(29) int[][] local29 = this.method6035(arg0, 0);
			@Pc(35) int[][] local35 = this.method6035(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt6059;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static18.anInt439; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static18.anInt439; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static18.anInt439; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(261) int local261;
				@Pc(269) int local269;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static18.anInt439; local74++) {
						local261 = local67[local74];
						local265 = local63[local74];
						local269 = local71[local74];
						local39[local74] = local265 == 0 ? 4096 : (local51[local74] << 12) / local265;
						local43[local74] = local261 == 0 ? 4096 : (local55[local74] << 12) / local261;
						local47[local74] = local269 == 0 ? 4096 : (local59[local74] << 12) / local269;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static18.anInt439; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local55[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static18.anInt439; local74++) {
						local265 = local63[local74];
						local261 = local67[local74];
						local269 = local71[local74];
						local39[local74] = local265 >= 2048 ? 4096 - ((4096 - local265) * (4096 - local51[local74]) >> 11) : local265 * local51[local74] >> 11;
						local43[local74] = local261 < 2048 ? local261 * local55[local74] >> 11 : 4096 - ((4096 - local55[local74]) * (-local261 + 4096) >> 11);
						local47[local74] = local269 >= 2048 ? 4096 - ((4096 - local269) * (-local59[local74] + 4096) >> 11) : local269 * local59[local74] >> 11;
					}
				} else {
					@Pc(518) int local518;
					@Pc(522) int local522;
					@Pc(526) int local526;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static18.anInt439; local74++) {
							local518 = local51[local74];
							local522 = local55[local74];
							local526 = local59[local74];
							local39[local74] = local518 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local518);
							local43[local74] = local522 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local522);
							local47[local74] = local526 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local526);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static18.anInt439; local74++) {
							local518 = local51[local74];
							local526 = local59[local74];
							local522 = local55[local74];
							local39[local74] = local518 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local518;
							local43[local74] = local522 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local522;
							local47[local74] = local526 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local526;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static18.anInt439; local74++) {
							local269 = local71[local74];
							local522 = local55[local74];
							local518 = local51[local74];
							local526 = local59[local74];
							local265 = local63[local74];
							local261 = local67[local74];
							local39[local74] = local265 > local518 ? local518 : local265;
							local43[local74] = local522 >= local261 ? local261 : local522;
							local47[local74] = local269 <= local526 ? local269 : local526;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static18.anInt439; local74++) {
							local522 = local55[local74];
							local261 = local67[local74];
							local526 = local59[local74];
							local269 = local71[local74];
							local518 = local51[local74];
							local265 = local63[local74];
							local39[local74] = local265 >= local518 ? local265 : local518;
							local43[local74] = local261 >= local522 ? local261 : local522;
							local47[local74] = local526 <= local269 ? local269 : local526;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static18.anInt439; local74++) {
							local518 = local51[local74];
							local265 = local63[local74];
							local526 = local59[local74];
							local261 = local67[local74];
							local269 = local71[local74];
							local522 = local55[local74];
							local39[local74] = local518 <= local265 ? local265 - local518 : -local265 + local518;
							local43[local74] = local522 <= local261 ? local261 - local522 : local522 + -local261;
							local47[local74] = local269 < local526 ? local526 - local269 : local269 - local526;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static18.anInt439; local74++) {
							local526 = local59[local74];
							local269 = local71[local74];
							local518 = local51[local74];
							local522 = local55[local74];
							local265 = local63[local74];
							local261 = local67[local74];
							local39[local74] = local518 + local265 - (local518 * local265 >> 11);
							local43[local74] = local522 + local261 - (local522 * local261 >> 11);
							local47[local74] = local526 + local269 - (local526 * local269 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
