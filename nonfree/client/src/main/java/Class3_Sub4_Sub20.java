import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class3_Sub4_Sub20 extends Class3_Sub4 {

	@OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
	private int anInt4633 = 6;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub20() {
		super(2, false);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt4633 = arg1.method6053();
		} else if (arg0 == 1) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			@Pc(21) int[] local21 = this.method5960(0, arg0);
			@Pc(27) int[] local27 = this.method5960(1, arg0);
			@Pc(30) int local30 = this.anInt4633;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static106.anInt2356; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static106.anInt2356; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static106.anInt2356; local30++) {
					local11[local30] = local27[local30] * local21[local30] >> 12;
				}
			} else {
				@Pc(159) int local159;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static106.anInt2356; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 == 0 ? 4096 : (local21[local30] << 12) / local159;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static106.anInt2356; local30++) {
						local11[local30] = 4096 - ((4096 - local21[local30]) * (-local27[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static106.anInt2356; local30++) {
						local159 = local27[local30];
						local11[local30] = local159 >= 2048 ? 4096 - ((4096 - local159) * (-local21[local30] + 4096) >> 11) : local21[local30] * local159 >> 11;
					}
				} else {
					@Pc(265) int local265;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static106.anInt2356; local30++) {
							local265 = local21[local30];
							local11[local30] = local265 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local265);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static106.anInt2356; local30++) {
							local265 = local21[local30];
							local11[local30] = local265 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local265;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static106.anInt2356; local30++) {
							local265 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local265 < local159 ? local265 : local159;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static106.anInt2356; local30++) {
							local265 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local159 < local265 ? local265 : local159;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static106.anInt2356; local30++) {
							local265 = local21[local30];
							local159 = local27[local30];
							local11[local30] = local159 >= local265 ? local159 - local265 : local265 + -local159;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static106.anInt2356; local30++) {
							local159 = local27[local30];
							local265 = local21[local30];
							local11[local30] = local159 + local265 - (local265 * local159 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(29) int[][] local29 = this.method5962(0, arg0);
			@Pc(35) int[][] local35 = this.method5962(1, arg0);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt4633;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static106.anInt2356; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static106.anInt2356; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static106.anInt2356; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(274) int local274;
				@Pc(266) int local266;
				@Pc(270) int local270;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static106.anInt2356; local74++) {
						local266 = local67[local74];
						local270 = local71[local74];
						local274 = local63[local74];
						local39[local74] = local274 == 0 ? 4096 : (local51[local74] << 12) / local274;
						local43[local74] = local266 == 0 ? 4096 : (local55[local74] << 12) / local266;
						local47[local74] = local270 == 0 ? 4096 : (local59[local74] << 12) / local270;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static106.anInt2356; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (4096 - local63[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static106.anInt2356; local74++) {
						local274 = local63[local74];
						local270 = local71[local74];
						local266 = local67[local74];
						local39[local74] = local274 >= 2048 ? 4096 - ((4096 - local51[local74]) * (4096 - local274) >> 11) : local51[local74] * local274 >> 11;
						local43[local74] = local266 >= 2048 ? 4096 - ((4096 - local266) * (4096 - local55[local74]) >> 11) : local266 * local55[local74] >> 11;
						local47[local74] = local270 < 2048 ? local59[local74] * local270 >> 11 : 4096 - ((4096 - local270) * (4096 - local59[local74]) >> 11);
					}
				} else {
					@Pc(521) int local521;
					@Pc(529) int local529;
					@Pc(525) int local525;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static106.anInt2356; local74++) {
							local521 = local51[local74];
							local525 = local59[local74];
							local529 = local55[local74];
							local39[local74] = local521 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local521);
							local43[local74] = local529 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local529);
							local47[local74] = local525 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local525);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static106.anInt2356; local74++) {
							local529 = local55[local74];
							local521 = local51[local74];
							local525 = local59[local74];
							local39[local74] = local521 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local521;
							local43[local74] = local529 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local529;
							local47[local74] = local525 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local525;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static106.anInt2356; local74++) {
							local525 = local59[local74];
							local266 = local67[local74];
							local521 = local51[local74];
							local529 = local55[local74];
							local274 = local63[local74];
							local270 = local71[local74];
							local39[local74] = local521 < local274 ? local521 : local274;
							local43[local74] = local529 >= local266 ? local266 : local529;
							local47[local74] = local525 < local270 ? local525 : local270;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static106.anInt2356; local74++) {
							local525 = local59[local74];
							local529 = local55[local74];
							local270 = local71[local74];
							local274 = local63[local74];
							local521 = local51[local74];
							local266 = local67[local74];
							local39[local74] = local521 > local274 ? local521 : local274;
							local43[local74] = local529 > local266 ? local529 : local266;
							local47[local74] = local525 > local270 ? local525 : local270;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static106.anInt2356; local74++) {
							local521 = local51[local74];
							local525 = local59[local74];
							local274 = local63[local74];
							local529 = local55[local74];
							local270 = local71[local74];
							local266 = local67[local74];
							local39[local74] = local274 < local521 ? local521 - local274 : local274 - local521;
							local43[local74] = local529 <= local266 ? local266 - local529 : local529 - local266;
							local47[local74] = local270 < local525 ? local525 - local270 : -local525 + local270;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static106.anInt2356; local74++) {
							local529 = local55[local74];
							local274 = local63[local74];
							local521 = local51[local74];
							local270 = local71[local74];
							local266 = local67[local74];
							local525 = local59[local74];
							local39[local74] = local274 + local521 - (local274 * local521 >> 11);
							local43[local74] = local529 + local266 - (local266 * local529 >> 11);
							local47[local74] = local270 + local525 - (local270 * local525 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
