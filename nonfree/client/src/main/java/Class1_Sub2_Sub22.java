import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub2_Sub22 extends Class1_Sub2 {

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
	private int anInt2730 = 6;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub22() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3512(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass74_41.method2454(arg0);
		if (super.aClass74_41.aBoolean175) {
			@Pc(29) int[][] local29 = this.method3501(arg0, 0);
			@Pc(35) int[][] local35 = this.method3501(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[2];
			@Pc(59) int[] local59 = local29[1];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt2730;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static105.anInt2391; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local59[local74] + local67[local74];
					local47[local74] = local55[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static105.anInt2391; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local59[local74] - local67[local74];
					local47[local74] = local55[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static105.anInt2391; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local59[local74] >> 12;
					local47[local74] = local71[local74] * local55[local74] >> 12;
				}
			} else {
				@Pc(277) int local277;
				@Pc(269) int local269;
				@Pc(273) int local273;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static105.anInt2391; local74++) {
						local269 = local67[local74];
						local273 = local71[local74];
						local277 = local63[local74];
						local39[local74] = local277 == 0 ? 4096 : (local51[local74] << 12) / local277;
						local43[local74] = local269 == 0 ? 4096 : (local59[local74] << 12) / local269;
						local47[local74] = local273 == 0 ? 4096 : (local55[local74] << 12) / local273;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static105.anInt2391; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local59[local74]) * (4096 - local67[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local55[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static105.anInt2391; local74++) {
						local273 = local71[local74];
						local269 = local67[local74];
						local277 = local63[local74];
						local39[local74] = local277 >= 2048 ? 4096 - ((4096 - local277) * (-local51[local74] + 4096) >> 11) : local51[local74] * local277 >> 11;
						local43[local74] = local269 < 2048 ? local269 * local59[local74] >> 11 : 4096 - ((4096 - local59[local74]) * (-local269 + 4096) >> 11);
						local47[local74] = local273 < 2048 ? local273 * local55[local74] >> 11 : 4096 - ((4096 - local273) * (4096 - local55[local74]) >> 11);
					}
				} else {
					@Pc(528) int local528;
					@Pc(532) int local532;
					@Pc(536) int local536;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static105.anInt2391; local74++) {
							local528 = local51[local74];
							local532 = local59[local74];
							local536 = local55[local74];
							local39[local74] = local528 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local528);
							local43[local74] = local532 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local532);
							local47[local74] = local536 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local536);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static105.anInt2391; local74++) {
							local528 = local51[local74];
							local536 = local55[local74];
							local532 = local59[local74];
							local39[local74] = local528 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local528;
							local43[local74] = local532 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local532;
							local47[local74] = local536 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local536;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static105.anInt2391; local74++) {
							local532 = local59[local74];
							local536 = local55[local74];
							local269 = local67[local74];
							local277 = local63[local74];
							local528 = local51[local74];
							local273 = local71[local74];
							local39[local74] = local528 >= local277 ? local277 : local528;
							local43[local74] = local269 <= local532 ? local269 : local532;
							local47[local74] = local273 > local536 ? local536 : local273;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static105.anInt2391; local74++) {
							local528 = local51[local74];
							local532 = local59[local74];
							local269 = local67[local74];
							local536 = local55[local74];
							local277 = local63[local74];
							local273 = local71[local74];
							local39[local74] = local277 >= local528 ? local277 : local528;
							local43[local74] = local269 < local532 ? local532 : local269;
							local47[local74] = local536 > local273 ? local536 : local273;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static105.anInt2391; local74++) {
							local273 = local71[local74];
							local269 = local67[local74];
							local277 = local63[local74];
							local528 = local51[local74];
							local532 = local59[local74];
							local536 = local55[local74];
							local39[local74] = local528 <= local277 ? local277 - local528 : -local277 + local528;
							local43[local74] = local269 < local532 ? local532 - local269 : -local532 + local269;
							local47[local74] = local273 >= local536 ? local273 - local536 : -local273 + local536;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static105.anInt2391; local74++) {
							local536 = local55[local74];
							local532 = local59[local74];
							local273 = local71[local74];
							local269 = local67[local74];
							local277 = local63[local74];
							local528 = local51[local74];
							local39[local74] = local277 + local528 - (local528 * local277 >> 11);
							local43[local74] = local269 + local532 - (local532 * local269 >> 11);
							local47[local74] = local536 + local273 - (local273 * local536 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass102_41.method3129(arg0);
		if (super.aClass102_41.aBoolean239) {
			@Pc(26) int[] local26 = this.method3514(arg0, 0);
			@Pc(34) int[] local34 = this.method3514(arg0, 1);
			@Pc(37) int local37 = this.anInt2730;
			if (local37 == 1) {
				for (local37 = 0; local37 < Static105.anInt2391; local37++) {
					local12[local37] = local26[local37] + local34[local37];
				}
			} else if (local37 == 2) {
				for (local37 = 0; local37 < Static105.anInt2391; local37++) {
					local12[local37] = local26[local37] - local34[local37];
				}
			} else if (local37 == 3) {
				for (local37 = 0; local37 < Static105.anInt2391; local37++) {
					local12[local37] = local26[local37] * local34[local37] >> 12;
				}
			} else {
				@Pc(172) int local172;
				if (local37 == 4) {
					for (local37 = 0; local37 < Static105.anInt2391; local37++) {
						local172 = local34[local37];
						local12[local37] = local172 == 0 ? 4096 : (local26[local37] << 12) / local172;
					}
				} else if (local37 == 5) {
					for (local37 = 0; local37 < Static105.anInt2391; local37++) {
						local12[local37] = 4096 - ((4096 - local34[local37]) * (-local26[local37] + 4096) >> 12);
					}
				} else if (local37 == 6) {
					for (local37 = 0; local37 < Static105.anInt2391; local37++) {
						local172 = local34[local37];
						local12[local37] = local172 < 2048 ? local172 * local26[local37] >> 11 : 4096 - ((4096 - local172) * (4096 - local26[local37]) >> 11);
					}
				} else {
					@Pc(280) int local280;
					if (local37 == 7) {
						for (local37 = 0; local37 < Static105.anInt2391; local37++) {
							local280 = local26[local37];
							local12[local37] = local280 == 4096 ? 4096 : (local34[local37] << 12) / (4096 - local280);
						}
					} else if (local37 == 8) {
						for (local37 = 0; local37 < Static105.anInt2391; local37++) {
							local280 = local26[local37];
							local12[local37] = local280 == 0 ? 0 : 4096 - (4096 - local34[local37] << 12) / local280;
						}
					} else if (local37 == 9) {
						for (local37 = 0; local37 < Static105.anInt2391; local37++) {
							local172 = local34[local37];
							local280 = local26[local37];
							local12[local37] = local280 >= local172 ? local172 : local280;
						}
					} else if (local37 == 10) {
						for (local37 = 0; local37 < Static105.anInt2391; local37++) {
							local280 = local26[local37];
							local172 = local34[local37];
							local12[local37] = local172 >= local280 ? local172 : local280;
						}
					} else if (local37 == 11) {
						for (local37 = 0; local37 < Static105.anInt2391; local37++) {
							local172 = local34[local37];
							local280 = local26[local37];
							local12[local37] = local280 <= local172 ? local172 - local280 : -local172 + local280;
						}
					} else if (local37 == 12) {
						for (local37 = 0; local37 < Static105.anInt2391; local37++) {
							local172 = local34[local37];
							local280 = local26[local37];
							local12[local37] = local172 + local280 - (local280 * local172 >> 11);
						}
					}
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!nc;ZI)V")
	@Override
	public void method3513(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2730 = arg0.method895();
		} else if (arg1 == 1) {
			super.aBoolean265 = arg0.method895() == 1;
		}
	}
}
