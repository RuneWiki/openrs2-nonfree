import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class6_Sub1_Sub8 extends Class6_Sub1 {

	@OriginalMember(owner = "client!er", name = "J", descriptor = "I")
	private int anInt1446 = 6;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub8() {
		super(2, false);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(29) int[][] local29 = this.method5618(arg0, 0);
			@Pc(35) int[][] local35 = this.method5618(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt1446;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static299.anInt5659; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static299.anInt5659; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static299.anInt5659; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(277) int local277;
				@Pc(269) int local269;
				@Pc(273) int local273;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static299.anInt5659; local74++) {
						local269 = local67[local74];
						local273 = local71[local74];
						local277 = local63[local74];
						local39[local74] = local277 == 0 ? 4096 : (local51[local74] << 12) / local277;
						local43[local74] = local269 == 0 ? 4096 : (local55[local74] << 12) / local269;
						local47[local74] = local273 == 0 ? 4096 : (local59[local74] << 12) / local273;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static299.anInt5659; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local51[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local55[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static299.anInt5659; local74++) {
						local269 = local67[local74];
						local277 = local63[local74];
						local273 = local71[local74];
						local39[local74] = local277 < 2048 ? local51[local74] * local277 >> 11 : 4096 - ((4096 - local51[local74]) * (-local277 + 4096) >> 11);
						local43[local74] = local269 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local269 + 4096) >> 11) : local55[local74] * local269 >> 11;
						local47[local74] = local273 >= 2048 ? 4096 - ((4096 - local273) * (-local59[local74] + 4096) >> 11) : local273 * local59[local74] >> 11;
					}
				} else {
					@Pc(520) int local520;
					@Pc(524) int local524;
					@Pc(528) int local528;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static299.anInt5659; local74++) {
							local520 = local51[local74];
							local524 = local55[local74];
							local528 = local59[local74];
							local39[local74] = local520 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local520);
							local43[local74] = local524 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local524);
							local47[local74] = local528 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local528);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static299.anInt5659; local74++) {
							local520 = local51[local74];
							local528 = local59[local74];
							local524 = local55[local74];
							local39[local74] = local520 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local520;
							local43[local74] = local524 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local524;
							local47[local74] = local528 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local528;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static299.anInt5659; local74++) {
							local269 = local67[local74];
							local520 = local51[local74];
							local273 = local71[local74];
							local524 = local55[local74];
							local528 = local59[local74];
							local277 = local63[local74];
							local39[local74] = local520 >= local277 ? local277 : local520;
							local43[local74] = local269 <= local524 ? local269 : local524;
							local47[local74] = local273 <= local528 ? local273 : local528;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static299.anInt5659; local74++) {
							local520 = local51[local74];
							local524 = local55[local74];
							local528 = local59[local74];
							local277 = local63[local74];
							local273 = local71[local74];
							local269 = local67[local74];
							local39[local74] = local277 < local520 ? local520 : local277;
							local43[local74] = local524 <= local269 ? local269 : local524;
							local47[local74] = local528 > local273 ? local528 : local273;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static299.anInt5659; local74++) {
							local269 = local67[local74];
							local528 = local59[local74];
							local524 = local55[local74];
							local520 = local51[local74];
							local273 = local71[local74];
							local277 = local63[local74];
							local39[local74] = local277 >= local520 ? local277 - local520 : -local277 + local520;
							local43[local74] = local524 <= local269 ? local269 - local524 : -local269 + local524;
							local47[local74] = local528 > local273 ? local528 - local273 : local273 - local528;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static299.anInt5659; local74++) {
							local269 = local67[local74];
							local524 = local55[local74];
							local273 = local71[local74];
							local528 = local59[local74];
							local520 = local51[local74];
							local277 = local63[local74];
							local39[local74] = local520 + local277 - (local520 * local277 >> 11);
							local43[local74] = local269 + local524 - (local524 * local269 >> 11);
							local47[local74] = local528 + local273 - (local528 * local273 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(26) int[] local26 = this.method5609(0, arg0);
			@Pc(32) int[] local32 = this.method5609(1, arg0);
			@Pc(35) int local35 = this.anInt1446;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static299.anInt5659; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static299.anInt5659; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static299.anInt5659; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(153) int local153;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static299.anInt5659; local35++) {
						local153 = local32[local35];
						local16[local35] = local153 == 0 ? 4096 : (local26[local35] << 12) / local153;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static299.anInt5659; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static299.anInt5659; local35++) {
						local153 = local32[local35];
						local16[local35] = local153 < 2048 ? local153 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (-local153 + 4096) >> 11);
					}
				} else {
					@Pc(265) int local265;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static299.anInt5659; local35++) {
							local265 = local26[local35];
							local16[local35] = local265 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local265);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static299.anInt5659; local35++) {
							local265 = local26[local35];
							local16[local35] = local265 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local265;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static299.anInt5659; local35++) {
							local153 = local32[local35];
							local265 = local26[local35];
							local16[local35] = local265 < local153 ? local265 : local153;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static299.anInt5659; local35++) {
							local265 = local26[local35];
							local153 = local32[local35];
							local16[local35] = local265 <= local153 ? local153 : local265;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static299.anInt5659; local35++) {
							local153 = local32[local35];
							local265 = local26[local35];
							local16[local35] = local265 > local153 ? local265 - local153 : -local265 + local153;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static299.anInt5659; local35++) {
							local153 = local32[local35];
							local265 = local26[local35];
							local16[local35] = local265 + local153 - (local153 * local265 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1446 = arg0.method3972();
		} else if (arg1 == 1) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}
}
