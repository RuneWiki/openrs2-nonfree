import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
	private int anInt2712 = 6;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(2, false);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(29) int[][] local29 = this.method3737(0, arg0);
			@Pc(35) int[][] local35 = this.method3737(1, arg0);
			@Pc(39) int[] local39 = local19[1];
			@Pc(43) int[] local43 = local19[2];
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local35[0];
			@Pc(63) int[] local63 = local29[2];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local35[1];
			@Pc(74) int local74 = this.anInt2712;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static157.anInt3431; local74++) {
					local47[local74] = local51[local74] + local59[local74];
					local39[local74] = local55[local74] + local71[local74];
					local43[local74] = local63[local74] + local67[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static157.anInt3431; local74++) {
					local47[local74] = local51[local74] - local59[local74];
					local39[local74] = local55[local74] - local71[local74];
					local43[local74] = local63[local74] - local67[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static157.anInt3431; local74++) {
					local47[local74] = local51[local74] * local59[local74] >> 12;
					local39[local74] = local55[local74] * local71[local74] >> 12;
					local43[local74] = local63[local74] * local67[local74] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(266) int local266;
				@Pc(274) int local274;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static157.anInt3431; local74++) {
						local266 = local71[local74];
						local270 = local59[local74];
						local274 = local67[local74];
						local47[local74] = local270 == 0 ? 4096 : (local51[local74] << 12) / local270;
						local39[local74] = local266 == 0 ? 4096 : (local55[local74] << 12) / local266;
						local43[local74] = local274 == 0 ? 4096 : (local63[local74] << 12) / local274;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static157.anInt3431; local74++) {
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local51[local74] + 4096) >> 12);
						local39[local74] = 4096 - ((4096 - local55[local74]) * (-local71[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local63[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static157.anInt3431; local74++) {
						local274 = local67[local74];
						local270 = local59[local74];
						local266 = local71[local74];
						local47[local74] = local270 < 2048 ? local51[local74] * local270 >> 11 : 4096 - ((4096 - local270) * (-local51[local74] + 4096) >> 11);
						local39[local74] = local266 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local266 + 4096) >> 11) : local266 * local55[local74] >> 11;
						local43[local74] = local274 < 2048 ? local63[local74] * local274 >> 11 : 4096 - ((4096 - local63[local74]) * (-local274 + 4096) >> 11);
					}
				} else {
					@Pc(525) int local525;
					@Pc(529) int local529;
					@Pc(533) int local533;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static157.anInt3431; local74++) {
							local525 = local51[local74];
							local529 = local55[local74];
							local533 = local63[local74];
							local47[local74] = local525 == 4096 ? 4096 : (local59[local74] << 12) / (4096 - local525);
							local39[local74] = local529 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local529);
							local43[local74] = local533 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local533);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static157.anInt3431; local74++) {
							local525 = local51[local74];
							local529 = local55[local74];
							local533 = local63[local74];
							local47[local74] = local525 == 0 ? 0 : 4096 - (4096 - local59[local74] << 12) / local525;
							local39[local74] = local529 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local529;
							local43[local74] = local533 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local533;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static157.anInt3431; local74++) {
							local525 = local51[local74];
							local529 = local55[local74];
							local266 = local71[local74];
							local274 = local67[local74];
							local270 = local59[local74];
							local533 = local63[local74];
							local47[local74] = local270 > local525 ? local525 : local270;
							local39[local74] = local266 <= local529 ? local266 : local529;
							local43[local74] = local533 >= local274 ? local274 : local533;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static157.anInt3431; local74++) {
							local274 = local67[local74];
							local266 = local71[local74];
							local525 = local51[local74];
							local529 = local55[local74];
							local270 = local59[local74];
							local533 = local63[local74];
							local47[local74] = local525 <= local270 ? local270 : local525;
							local39[local74] = local529 <= local266 ? local266 : local529;
							local43[local74] = local533 <= local274 ? local274 : local533;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static157.anInt3431; local74++) {
							local529 = local55[local74];
							local270 = local59[local74];
							local525 = local51[local74];
							local274 = local67[local74];
							local266 = local71[local74];
							local533 = local63[local74];
							local47[local74] = local270 >= local525 ? local270 - local525 : -local270 + local525;
							local39[local74] = local266 < local529 ? local529 - local266 : -local529 + local266;
							local43[local74] = local533 > local274 ? local533 - local274 : -local533 + local274;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static157.anInt3431; local74++) {
							local266 = local71[local74];
							local525 = local51[local74];
							local274 = local67[local74];
							local270 = local59[local74];
							local529 = local55[local74];
							local533 = local63[local74];
							local47[local74] = local270 + local525 - (local525 * local270 >> 11);
							local39[local74] = local266 + local529 - (local529 * local266 >> 11);
							local43[local74] = local533 + local274 - (local533 * local274 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(26) int[] local26 = this.method3733(arg0, 0);
			@Pc(32) int[] local32 = this.method3733(arg0, 1);
			@Pc(35) int local35 = this.anInt2712;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static157.anInt3431; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static157.anInt3431; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static157.anInt3431; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static157.anInt3431; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 == 0 ? 4096 : (local26[local35] << 12) / local160;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static157.anInt3431; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static157.anInt3431; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 < 2048 ? local26[local35] * local160 >> 11 : 4096 - ((4096 - local160) * (4096 - local26[local35]) >> 11);
					}
				} else {
					@Pc(268) int local268;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static157.anInt3431; local35++) {
							local268 = local26[local35];
							local16[local35] = local268 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local268);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static157.anInt3431; local35++) {
							local268 = local26[local35];
							local16[local35] = local268 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local268;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static157.anInt3431; local35++) {
							local268 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local268 >= local160 ? local160 : local268;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static157.anInt3431; local35++) {
							local160 = local32[local35];
							local268 = local26[local35];
							local16[local35] = local268 > local160 ? local268 : local160;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static157.anInt3431; local35++) {
							local268 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local160 < local268 ? local268 - local160 : local160 - local268;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static157.anInt3431; local35++) {
							local160 = local32[local35];
							local268 = local26[local35];
							local16[local35] = local160 + local268 - (local160 * local268 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2712 = arg0.method3793();
		} else if (arg1 == 1) {
			super.aBoolean213 = arg0.method3793() == 1;
		}
	}
}
