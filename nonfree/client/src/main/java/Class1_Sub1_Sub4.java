import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt1492 = 6;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub4() {
		super(2, false);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1492 = arg0.method5750();
		} else if (arg1 == 1) {
			super.aBoolean737 = arg0.method5750() == 1;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7705(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass46_41.method856(arg0);
		if (super.aClass46_41.aBoolean76) {
			@Pc(29) int[][] local29 = this.method7700(arg0, 0);
			@Pc(35) int[][] local35 = this.method7700(arg0, 1);
			@Pc(39) int[] local39 = local17[0];
			@Pc(43) int[] local43 = local17[1];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt1492;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static279.anInt4906; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static279.anInt4906; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static279.anInt4906; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(261) int local261;
				@Pc(265) int local265;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static279.anInt4906; local74++) {
						local261 = local67[local74];
						local265 = local71[local74];
						local269 = local63[local74];
						local39[local74] = local269 == 0 ? 4096 : (local51[local74] << 12) / local269;
						local43[local74] = local261 == 0 ? 4096 : (local55[local74] << 12) / local261;
						local47[local74] = local265 == 0 ? 4096 : (local59[local74] << 12) / local265;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static279.anInt4906; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local55[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static279.anInt4906; local74++) {
						local269 = local63[local74];
						local265 = local71[local74];
						local261 = local67[local74];
						local39[local74] = local269 >= 2048 ? 4096 - ((4096 - local51[local74]) * (-local269 + 4096) >> 11) : local51[local74] * local269 >> 11;
						local43[local74] = local261 < 2048 ? local55[local74] * local261 >> 11 : 4096 - ((4096 - local55[local74]) * (-local261 + 4096) >> 11);
						local47[local74] = local265 < 2048 ? local59[local74] * local265 >> 11 : 4096 - ((4096 - local59[local74]) * (-local265 + 4096) >> 11);
					}
				} else {
					@Pc(526) int local526;
					@Pc(522) int local522;
					@Pc(530) int local530;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static279.anInt4906; local74++) {
							local522 = local55[local74];
							local526 = local51[local74];
							local530 = local59[local74];
							local39[local74] = local526 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local526);
							local43[local74] = local522 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local522);
							local47[local74] = local530 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local530);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static279.anInt4906; local74++) {
							local530 = local59[local74];
							local526 = local51[local74];
							local522 = local55[local74];
							local39[local74] = local526 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local526;
							local43[local74] = local522 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local522;
							local47[local74] = local530 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local530;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static279.anInt4906; local74++) {
							local526 = local51[local74];
							local530 = local59[local74];
							local522 = local55[local74];
							local269 = local63[local74];
							local265 = local71[local74];
							local261 = local67[local74];
							local39[local74] = local269 > local526 ? local526 : local269;
							local43[local74] = local261 > local522 ? local522 : local261;
							local47[local74] = local530 >= local265 ? local265 : local530;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static279.anInt4906; local74++) {
							local261 = local67[local74];
							local265 = local71[local74];
							local522 = local55[local74];
							local269 = local63[local74];
							local526 = local51[local74];
							local530 = local59[local74];
							local39[local74] = local526 <= local269 ? local269 : local526;
							local43[local74] = local522 > local261 ? local522 : local261;
							local47[local74] = local265 >= local530 ? local265 : local530;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static279.anInt4906; local74++) {
							local530 = local59[local74];
							local261 = local67[local74];
							local269 = local63[local74];
							local265 = local71[local74];
							local526 = local51[local74];
							local522 = local55[local74];
							local39[local74] = local526 <= local269 ? local269 - local526 : -local269 + local526;
							local43[local74] = local522 <= local261 ? local261 - local522 : local522 - local261;
							local47[local74] = local530 <= local265 ? local265 - local530 : -local265 + local530;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static279.anInt4906; local74++) {
							local269 = local63[local74];
							local522 = local55[local74];
							local530 = local59[local74];
							local526 = local51[local74];
							local261 = local67[local74];
							local265 = local71[local74];
							local39[local74] = local269 + local526 - (local269 * local526 >> 11);
							local43[local74] = local261 + local522 - (local261 * local522 >> 11);
							local47[local74] = local265 + local530 - (local530 * local265 >> 11);
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(29) int[] local29 = this.method7709(arg0, 0);
			@Pc(35) int[] local35 = this.method7709(arg0, 1);
			@Pc(38) int local38 = this.anInt1492;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static279.anInt4906; local38++) {
					local11[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static279.anInt4906; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static279.anInt4906; local38++) {
					local11[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(166) int local166;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static279.anInt4906; local38++) {
						local166 = local35[local38];
						local11[local38] = local166 == 0 ? 4096 : (local29[local38] << 12) / local166;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static279.anInt4906; local38++) {
						local11[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static279.anInt4906; local38++) {
						local166 = local35[local38];
						local11[local38] = local166 < 2048 ? local29[local38] * local166 >> 11 : 4096 - ((4096 - local29[local38]) * (-local166 + 4096) >> 11);
					}
				} else {
					@Pc(281) int local281;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static279.anInt4906; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local281);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static279.anInt4906; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local281;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static279.anInt4906; local38++) {
							local281 = local29[local38];
							local166 = local35[local38];
							local11[local38] = local166 > local281 ? local281 : local166;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static279.anInt4906; local38++) {
							local166 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local166 < local281 ? local281 : local166;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static279.anInt4906; local38++) {
							local166 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 > local166 ? local281 - local166 : local166 + -local281;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static279.anInt4906; local38++) {
							local166 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 + local166 - (local166 * local281 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
