import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
	private int anInt3580 = 6;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(29) int[][] local29 = this.method3205(0, arg0);
			@Pc(35) int[][] local35 = this.method3205(1, arg0);
			@Pc(39) int[] local39 = local29[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local19[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[1];
			@Pc(67) int[] local67 = local35[0];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt3580;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static62.anInt1675; local74++) {
					local51[local74] = local39[local74] + local67[local74];
					local43[local74] = local63[local74] + local55[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static62.anInt1675; local74++) {
					local51[local74] = local39[local74] - local67[local74];
					local43[local74] = local55[local74] - local63[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static62.anInt1675; local74++) {
					local51[local74] = local67[local74] * local39[local74] >> 12;
					local43[local74] = local55[local74] * local63[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(278) int local278;
				@Pc(274) int local274;
				@Pc(270) int local270;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static62.anInt1675; local74++) {
						local270 = local71[local74];
						local274 = local63[local74];
						local278 = local67[local74];
						local51[local74] = local278 == 0 ? 4096 : (local39[local74] << 12) / local278;
						local43[local74] = local274 == 0 ? 4096 : (local55[local74] << 12) / local274;
						local47[local74] = local270 == 0 ? 4096 : (local59[local74] << 12) / local270;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static62.anInt1675; local74++) {
						local51[local74] = 4096 - ((4096 - local39[local74]) * (4096 - local67[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local63[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static62.anInt1675; local74++) {
						local274 = local63[local74];
						local270 = local71[local74];
						local278 = local67[local74];
						local51[local74] = local278 >= 2048 ? 4096 - ((4096 - local39[local74]) * (-local278 + 4096) >> 11) : local39[local74] * local278 >> 11;
						local43[local74] = local274 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local274 + 4096) >> 11) : local55[local74] * local274 >> 11;
						local47[local74] = local270 >= 2048 ? 4096 - ((4096 - local270) * (-local59[local74] + 4096) >> 11) : local59[local74] * local270 >> 11;
					}
				} else {
					@Pc(533) int local533;
					@Pc(541) int local541;
					@Pc(537) int local537;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static62.anInt1675; local74++) {
							local533 = local39[local74];
							local537 = local59[local74];
							local541 = local55[local74];
							local51[local74] = local533 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local533);
							local43[local74] = local541 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local541);
							local47[local74] = local537 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local537);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static62.anInt1675; local74++) {
							local537 = local59[local74];
							local533 = local39[local74];
							local541 = local55[local74];
							local51[local74] = local533 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local533;
							local43[local74] = local541 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local541;
							local47[local74] = local537 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local537;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static62.anInt1675; local74++) {
							local537 = local59[local74];
							local533 = local39[local74];
							local541 = local55[local74];
							local270 = local71[local74];
							local274 = local63[local74];
							local278 = local67[local74];
							local51[local74] = local278 > local533 ? local533 : local278;
							local43[local74] = local274 > local541 ? local541 : local274;
							local47[local74] = local270 <= local537 ? local270 : local537;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static62.anInt1675; local74++) {
							local278 = local67[local74];
							local270 = local71[local74];
							local541 = local55[local74];
							local537 = local59[local74];
							local533 = local39[local74];
							local274 = local63[local74];
							local51[local74] = local533 > local278 ? local533 : local278;
							local43[local74] = local541 <= local274 ? local274 : local541;
							local47[local74] = local270 >= local537 ? local270 : local537;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static62.anInt1675; local74++) {
							local541 = local55[local74];
							local274 = local63[local74];
							local270 = local71[local74];
							local533 = local39[local74];
							local278 = local67[local74];
							local537 = local59[local74];
							local51[local74] = local533 > local278 ? local533 - local278 : -local533 + local278;
							local43[local74] = local274 >= local541 ? local274 - local541 : -local274 + local541;
							local47[local74] = local537 <= local270 ? local270 - local537 : local537 + -local270;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static62.anInt1675; local74++) {
							local274 = local63[local74];
							local278 = local67[local74];
							local533 = local39[local74];
							local541 = local55[local74];
							local270 = local71[local74];
							local537 = local59[local74];
							local51[local74] = local278 + local533 - (local278 * local533 >> 11);
							local43[local74] = local541 + local274 - (local541 * local274 >> 11);
							local47[local74] = local537 + local270 - (local270 * local537 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3580 = arg0.method209();
		} else if (arg1 == 1) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(26) int[] local26 = this.method3203(arg0, 0);
			@Pc(32) int[] local32 = this.method3203(arg0, 1);
			@Pc(35) int local35 = this.anInt3580;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static62.anInt1675; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static62.anInt1675; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static62.anInt1675; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static62.anInt1675; local35++) {
						local167 = local32[local35];
						local16[local35] = local167 == 0 ? 4096 : (local26[local35] << 12) / local167;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static62.anInt1675; local35++) {
						local16[local35] = 4096 - ((4096 - local26[local35]) * (-local32[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static62.anInt1675; local35++) {
						local167 = local32[local35];
						local16[local35] = local167 < 2048 ? local26[local35] * local167 >> 11 : 4096 - ((4096 - local167) * (-local26[local35] + 4096) >> 11);
					}
				} else {
					@Pc(277) int local277;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static62.anInt1675; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local277);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static62.anInt1675; local35++) {
							local277 = local26[local35];
							local16[local35] = local277 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local277;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static62.anInt1675; local35++) {
							local277 = local26[local35];
							local167 = local32[local35];
							local16[local35] = local167 > local277 ? local277 : local167;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static62.anInt1675; local35++) {
							local167 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local167 < local277 ? local277 : local167;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static62.anInt1675; local35++) {
							local167 = local32[local35];
							local277 = local26[local35];
							local16[local35] = local277 > local167 ? local277 - local167 : local167 - local277;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static62.anInt1675; local35++) {
							local277 = local26[local35];
							local167 = local32[local35];
							local16[local35] = local167 + local277 - (local277 * local167 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
