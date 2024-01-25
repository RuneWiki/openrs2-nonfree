import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class1_Sub4_Sub35 extends Class1_Sub4 {

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
	private int anInt6510 = 6;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub35() {
		super(2, false);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(33) int[] local33 = this.method5695(arg0, 0);
			@Pc(41) int[] local41 = this.method5695(arg0, 1);
			@Pc(44) int local44 = this.anInt6510;
			if (local44 == 1) {
				for (local44 = 0; local44 < Static395.anInt6592; local44++) {
					local11[local44] = local33[local44] + local41[local44];
				}
			} else if (local44 == 2) {
				for (local44 = 0; local44 < Static395.anInt6592; local44++) {
					local11[local44] = local33[local44] - local41[local44];
				}
			} else if (local44 == 3) {
				for (local44 = 0; local44 < Static395.anInt6592; local44++) {
					local11[local44] = local41[local44] * local33[local44] >> 12;
				}
			} else {
				@Pc(173) int local173;
				if (local44 == 4) {
					for (local44 = 0; local44 < Static395.anInt6592; local44++) {
						local173 = local41[local44];
						local11[local44] = local173 == 0 ? 4096 : (local33[local44] << 12) / local173;
					}
				} else if (local44 == 5) {
					for (local44 = 0; local44 < Static395.anInt6592; local44++) {
						local11[local44] = 4096 - ((4096 - local33[local44]) * (-local41[local44] + 4096) >> 12);
					}
				} else if (local44 == 6) {
					for (local44 = 0; local44 < Static395.anInt6592; local44++) {
						local173 = local41[local44];
						local11[local44] = local173 < 2048 ? local33[local44] * local173 >> 11 : 4096 - ((4096 - local173) * (-local33[local44] + 4096) >> 11);
					}
				} else {
					@Pc(286) int local286;
					if (local44 == 7) {
						for (local44 = 0; local44 < Static395.anInt6592; local44++) {
							local286 = local33[local44];
							local11[local44] = local286 == 4096 ? 4096 : (local41[local44] << 12) / (4096 - local286);
						}
					} else if (local44 == 8) {
						for (local44 = 0; local44 < Static395.anInt6592; local44++) {
							local286 = local33[local44];
							local11[local44] = local286 == 0 ? 0 : 4096 - (4096 - local41[local44] << 12) / local286;
						}
					} else if (local44 == 9) {
						for (local44 = 0; local44 < Static395.anInt6592; local44++) {
							local286 = local33[local44];
							local173 = local41[local44];
							local11[local44] = local286 < local173 ? local286 : local173;
						}
					} else if (local44 == 10) {
						for (local44 = 0; local44 < Static395.anInt6592; local44++) {
							local286 = local33[local44];
							local173 = local41[local44];
							local11[local44] = local286 > local173 ? local286 : local173;
						}
					} else if (local44 == 11) {
						for (local44 = 0; local44 < Static395.anInt6592; local44++) {
							local173 = local41[local44];
							local286 = local33[local44];
							local11[local44] = local173 < local286 ? local286 - local173 : local173 - local286;
						}
					} else if (local44 == 12) {
						for (local44 = 0; local44 < Static395.anInt6592; local44++) {
							local286 = local33[local44];
							local173 = local41[local44];
							local11[local44] = local286 + local173 - (local286 * local173 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(29) int[][] local29 = this.method5696(arg0, 0);
			@Pc(35) int[][] local35 = this.method5696(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt6510;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static395.anInt6592; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static395.anInt6592; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static395.anInt6592; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(275) int local275;
				@Pc(271) int local271;
				@Pc(267) int local267;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static395.anInt6592; local74++) {
						local267 = local71[local74];
						local271 = local67[local74];
						local275 = local63[local74];
						local39[local74] = local275 == 0 ? 4096 : (local51[local74] << 12) / local275;
						local43[local74] = local271 == 0 ? 4096 : (local55[local74] << 12) / local271;
						local47[local74] = local267 == 0 ? 4096 : (local59[local74] << 12) / local267;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static395.anInt6592; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (4096 - local63[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static395.anInt6592; local74++) {
						local275 = local63[local74];
						local271 = local67[local74];
						local267 = local71[local74];
						local39[local74] = local275 < 2048 ? local275 * local51[local74] >> 11 : 4096 - ((4096 - local275) * (-local51[local74] + 4096) >> 11);
						local43[local74] = local271 < 2048 ? local55[local74] * local271 >> 11 : 4096 - ((4096 - local271) * (-local55[local74] + 4096) >> 11);
						local47[local74] = local267 >= 2048 ? 4096 - ((4096 - local267) * (-local59[local74] + 4096) >> 11) : local59[local74] * local267 >> 11;
					}
				} else {
					@Pc(532) int local532;
					@Pc(528) int local528;
					@Pc(536) int local536;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static395.anInt6592; local74++) {
							local528 = local55[local74];
							local532 = local51[local74];
							local536 = local59[local74];
							local39[local74] = local532 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local532);
							local43[local74] = local528 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local528);
							local47[local74] = local536 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local536);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static395.anInt6592; local74++) {
							local532 = local51[local74];
							local536 = local59[local74];
							local528 = local55[local74];
							local39[local74] = local532 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local532;
							local43[local74] = local528 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local528;
							local47[local74] = local536 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local536;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static395.anInt6592; local74++) {
							local275 = local63[local74];
							local536 = local59[local74];
							local267 = local71[local74];
							local532 = local51[local74];
							local528 = local55[local74];
							local271 = local67[local74];
							local39[local74] = local275 > local532 ? local532 : local275;
							local43[local74] = local528 >= local271 ? local271 : local528;
							local47[local74] = local536 >= local267 ? local267 : local536;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static395.anInt6592; local74++) {
							local532 = local51[local74];
							local275 = local63[local74];
							local528 = local55[local74];
							local536 = local59[local74];
							local267 = local71[local74];
							local271 = local67[local74];
							local39[local74] = local275 >= local532 ? local275 : local532;
							local43[local74] = local271 < local528 ? local528 : local271;
							local47[local74] = local267 < local536 ? local536 : local267;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static395.anInt6592; local74++) {
							local532 = local51[local74];
							local267 = local71[local74];
							local271 = local67[local74];
							local275 = local63[local74];
							local528 = local55[local74];
							local536 = local59[local74];
							local39[local74] = local275 >= local532 ? local275 - local532 : local532 + -local275;
							local43[local74] = local271 < local528 ? local528 - local271 : local271 - local528;
							local47[local74] = local536 <= local267 ? local267 - local536 : local536 + -local267;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static395.anInt6592; local74++) {
							local532 = local51[local74];
							local275 = local63[local74];
							local528 = local55[local74];
							local536 = local59[local74];
							local271 = local67[local74];
							local267 = local71[local74];
							local39[local74] = local275 + local532 - (local275 * local532 >> 11);
							local43[local74] = local271 + local528 - (local271 * local528 >> 11);
							local47[local74] = local536 + local267 - (local536 * local267 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6510 = arg0.method5337();
		} else if (arg1 == 1) {
			super.aBoolean796 = arg0.method5337() == 1;
		}
	}
}
