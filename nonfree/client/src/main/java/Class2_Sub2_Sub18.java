import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub2_Sub18 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
	private int anInt2582 = 6;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub18() {
		super(2, false);
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3568(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass90_41.method3443(arg0);
		if (super.aClass90_41.aBoolean177) {
			@Pc(29) int[][] local29 = this.method3557(arg0, 0);
			@Pc(35) int[][] local35 = this.method3557(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local29[0];
			@Pc(51) int[] local51 = local19[2];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local35[0];
			@Pc(63) int[] local63 = local35[1];
			@Pc(67) int[] local67 = local29[2];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt2582;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static106.anInt3045; local74++) {
					local39[local74] = local47[local74] + local59[local74];
					local43[local74] = local55[local74] + local63[local74];
					local51[local74] = local67[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static106.anInt3045; local74++) {
					local39[local74] = local47[local74] - local59[local74];
					local43[local74] = local55[local74] - local63[local74];
					local51[local74] = local67[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static106.anInt3045; local74++) {
					local39[local74] = local47[local74] * local59[local74] >> 12;
					local43[local74] = local55[local74] * local63[local74] >> 12;
					local51[local74] = local71[local74] * local67[local74] >> 12;
				}
			} else {
				@Pc(266) int local266;
				@Pc(270) int local270;
				@Pc(274) int local274;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static106.anInt3045; local74++) {
						local266 = local59[local74];
						local270 = local63[local74];
						local274 = local71[local74];
						local39[local74] = local266 == 0 ? 4096 : (local47[local74] << 12) / local266;
						local43[local74] = local270 == 0 ? 4096 : (local55[local74] << 12) / local270;
						local51[local74] = local274 == 0 ? 4096 : (local67[local74] << 12) / local274;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static106.anInt3045; local74++) {
						local39[local74] = 4096 - ((4096 - local47[local74]) * (4096 - local59[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local63[local74] + 4096) >> 12);
						local51[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local71[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static106.anInt3045; local74++) {
						local266 = local59[local74];
						local274 = local71[local74];
						local270 = local63[local74];
						local39[local74] = local266 >= 2048 ? 4096 - ((4096 - local266) * (-local47[local74] + 4096) >> 11) : local266 * local47[local74] >> 11;
						local43[local74] = local270 < 2048 ? local270 * local55[local74] >> 11 : 4096 - ((4096 - local270) * (-local55[local74] + 4096) >> 11);
						local51[local74] = local274 < 2048 ? local67[local74] * local274 >> 11 : 4096 - ((4096 - local67[local74]) * (-local274 + 4096) >> 11);
					}
				} else {
					@Pc(532) int local532;
					@Pc(524) int local524;
					@Pc(528) int local528;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static106.anInt3045; local74++) {
							local524 = local55[local74];
							local528 = local67[local74];
							local532 = local47[local74];
							local39[local74] = local532 == 4096 ? 4096 : (local59[local74] << 12) / (4096 - local532);
							local43[local74] = local524 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local524);
							local51[local74] = local528 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local528);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static106.anInt3045; local74++) {
							local532 = local47[local74];
							local528 = local67[local74];
							local524 = local55[local74];
							local39[local74] = local532 == 0 ? 0 : 4096 - (4096 - local59[local74] << 12) / local532;
							local43[local74] = local524 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local524;
							local51[local74] = local528 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local528;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static106.anInt3045; local74++) {
							local274 = local71[local74];
							local528 = local67[local74];
							local532 = local47[local74];
							local524 = local55[local74];
							local270 = local63[local74];
							local266 = local59[local74];
							local39[local74] = local532 < local266 ? local532 : local266;
							local43[local74] = local270 > local524 ? local524 : local270;
							local51[local74] = local274 > local528 ? local528 : local274;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static106.anInt3045; local74++) {
							local524 = local55[local74];
							local270 = local63[local74];
							local266 = local59[local74];
							local528 = local67[local74];
							local274 = local71[local74];
							local532 = local47[local74];
							local39[local74] = local266 < local532 ? local532 : local266;
							local43[local74] = local524 > local270 ? local524 : local270;
							local51[local74] = local274 < local528 ? local528 : local274;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static106.anInt3045; local74++) {
							local270 = local63[local74];
							local528 = local67[local74];
							local524 = local55[local74];
							local274 = local71[local74];
							local532 = local47[local74];
							local266 = local59[local74];
							local39[local74] = local266 < local532 ? local532 - local266 : local266 - local532;
							local43[local74] = local524 <= local270 ? local270 - local524 : -local270 + local524;
							local51[local74] = local274 < local528 ? local528 - local274 : -local528 + local274;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static106.anInt3045; local74++) {
							local524 = local55[local74];
							local532 = local47[local74];
							local274 = local71[local74];
							local266 = local59[local74];
							local528 = local67[local74];
							local270 = local63[local74];
							local39[local74] = local532 + local266 - (local266 * local532 >> 11);
							local43[local74] = local524 + local270 - (local270 * local524 >> 11);
							local51[local74] = local528 + local274 - (local528 * local274 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3562(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass57_41.method2569(arg0);
		if (super.aClass57_41.aBoolean122) {
			@Pc(26) int[] local26 = this.method3569(arg0, 0);
			@Pc(32) int[] local32 = this.method3569(arg0, 1);
			@Pc(35) int local35 = this.anInt2582;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static106.anInt3045; local35++) {
					local16[local35] = local32[local35] + local26[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static106.anInt3045; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static106.anInt3045; local35++) {
					local16[local35] = local32[local35] * local26[local35] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static106.anInt3045; local35++) {
						local164 = local32[local35];
						local16[local35] = local164 == 0 ? 4096 : (local26[local35] << 12) / local164;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static106.anInt3045; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (4096 - local32[local35]) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static106.anInt3045; local35++) {
						local164 = local32[local35];
						local16[local35] = local164 < 2048 ? local164 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (-local164 + 4096) >> 11);
					}
				} else {
					@Pc(274) int local274;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static106.anInt3045; local35++) {
							local274 = local26[local35];
							local16[local35] = local274 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local274);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static106.anInt3045; local35++) {
							local274 = local26[local35];
							local16[local35] = local274 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local274;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static106.anInt3045; local35++) {
							local164 = local32[local35];
							local274 = local26[local35];
							local16[local35] = local164 <= local274 ? local164 : local274;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static106.anInt3045; local35++) {
							local164 = local32[local35];
							local274 = local26[local35];
							local16[local35] = local274 > local164 ? local274 : local164;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static106.anInt3045; local35++) {
							local274 = local26[local35];
							local164 = local32[local35];
							local16[local35] = local164 >= local274 ? local164 - local274 : local274 - local164;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static106.anInt3045; local35++) {
							local164 = local32[local35];
							local274 = local26[local35];
							local16[local35] = local274 + local164 - (local164 * local274 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILclient!og;)V")
	@Override
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2582 = arg1.method218();
		} else if (arg0 == 1) {
			super.aBoolean183 = arg1.method218() == 1;
		}
	}
}
