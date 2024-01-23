import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class4_Sub1_Sub32 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
	private int anInt4899 = 6;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub32() {
		super(2, false);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4899 = arg0.method4666();
		} else if (arg1 == 1) {
			this.aBoolean398 = arg0.method4666() == 1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(22) int[] local22 = this.method4736(arg0, 0);
			@Pc(28) int[] local28 = this.method4736(arg0, 1);
			@Pc(31) int local31 = this.anInt4899;
			if (local31 == 1) {
				for (local31 = 0; local31 < Static73.anInt1626; local31++) {
					local11[local31] = local28[local31] + local22[local31];
				}
			} else if (local31 == 2) {
				for (local31 = 0; local31 < Static73.anInt1626; local31++) {
					local11[local31] = local22[local31] - local28[local31];
				}
			} else if (local31 == 3) {
				for (local31 = 0; local31 < Static73.anInt1626; local31++) {
					local11[local31] = local22[local31] * local28[local31] >> 12;
				}
			} else {
				@Pc(171) int local171;
				if (local31 == 4) {
					for (local31 = 0; local31 < Static73.anInt1626; local31++) {
						local171 = local28[local31];
						local11[local31] = local171 == 0 ? 4096 : (local22[local31] << 12) / local171;
					}
				} else if (local31 == 5) {
					for (local31 = 0; local31 < Static73.anInt1626; local31++) {
						local11[local31] = 4096 - ((4096 - local22[local31]) * (-local28[local31] + 4096) >> 12);
					}
				} else if (local31 == 6) {
					for (local31 = 0; local31 < Static73.anInt1626; local31++) {
						local171 = local28[local31];
						local11[local31] = local171 >= 2048 ? 4096 - ((4096 - local171) * (4096 - local22[local31]) >> 11) : local171 * local22[local31] >> 11;
					}
				} else {
					@Pc(278) int local278;
					if (local31 == 7) {
						for (local31 = 0; local31 < Static73.anInt1626; local31++) {
							local278 = local22[local31];
							local11[local31] = local278 == 4096 ? 4096 : (local28[local31] << 12) / (4096 - local278);
						}
					} else if (local31 == 8) {
						for (local31 = 0; local31 < Static73.anInt1626; local31++) {
							local278 = local22[local31];
							local11[local31] = local278 == 0 ? 0 : 4096 - (4096 - local28[local31] << 12) / local278;
						}
					} else if (local31 == 9) {
						for (local31 = 0; local31 < Static73.anInt1626; local31++) {
							local278 = local22[local31];
							local171 = local28[local31];
							local11[local31] = local278 < local171 ? local278 : local171;
						}
					} else if (local31 == 10) {
						for (local31 = 0; local31 < Static73.anInt1626; local31++) {
							local278 = local22[local31];
							local171 = local28[local31];
							local11[local31] = local278 <= local171 ? local171 : local278;
						}
					} else if (local31 == 11) {
						for (local31 = 0; local31 < Static73.anInt1626; local31++) {
							local171 = local28[local31];
							local278 = local22[local31];
							local11[local31] = local171 < local278 ? local278 - local171 : local171 + -local278;
						}
					} else if (local31 == 12) {
						for (local31 = 0; local31 < Static73.anInt1626; local31++) {
							local278 = local22[local31];
							local171 = local28[local31];
							local11[local31] = local278 + local171 - (local171 * local278 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(29) int[][] local29 = this.method4723(0, arg0);
			@Pc(35) int[][] local35 = this.method4723(1, arg0);
			@Pc(39) int[] local39 = local18[0];
			@Pc(43) int[] local43 = local18[1];
			@Pc(47) int[] local47 = local29[0];
			@Pc(51) int[] local51 = local18[2];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local35[2];
			@Pc(63) int[] local63 = local29[2];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[0];
			@Pc(74) int local74 = this.anInt4899;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static73.anInt1626; local74++) {
					local39[local74] = local47[local74] + local71[local74];
					local43[local74] = local55[local74] + local67[local74];
					local51[local74] = local63[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static73.anInt1626; local74++) {
					local39[local74] = local47[local74] - local71[local74];
					local43[local74] = local55[local74] - local67[local74];
					local51[local74] = local63[local74] - local59[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static73.anInt1626; local74++) {
					local39[local74] = local47[local74] * local71[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local51[local74] = local59[local74] * local63[local74] >> 12;
				}
			} else {
				@Pc(279) int local279;
				@Pc(275) int local275;
				@Pc(283) int local283;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static73.anInt1626; local74++) {
						local275 = local67[local74];
						local279 = local71[local74];
						local283 = local59[local74];
						local39[local74] = local279 == 0 ? 4096 : (local47[local74] << 12) / local279;
						local43[local74] = local275 == 0 ? 4096 : (local55[local74] << 12) / local275;
						local51[local74] = local283 == 0 ? 4096 : (local63[local74] << 12) / local283;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static73.anInt1626; local74++) {
						local39[local74] = 4096 - ((4096 - local47[local74]) * (4096 - local71[local74]) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local51[local74] = 4096 - ((4096 - local63[local74]) * (4096 - local59[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static73.anInt1626; local74++) {
						local275 = local67[local74];
						local279 = local71[local74];
						local283 = local59[local74];
						local39[local74] = local279 >= 2048 ? 4096 - ((4096 - local47[local74]) * (-local279 + 4096) >> 11) : local279 * local47[local74] >> 11;
						local43[local74] = local275 >= 2048 ? 4096 - ((4096 - local55[local74]) * (-local275 + 4096) >> 11) : local55[local74] * local275 >> 11;
						local51[local74] = local283 >= 2048 ? 4096 - ((4096 - local63[local74]) * (-local283 + 4096) >> 11) : local63[local74] * local283 >> 11;
					}
				} else {
					@Pc(543) int local543;
					@Pc(539) int local539;
					@Pc(535) int local535;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static73.anInt1626; local74++) {
							local535 = local63[local74];
							local539 = local55[local74];
							local543 = local47[local74];
							local39[local74] = local543 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local543);
							local43[local74] = local539 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local539);
							local51[local74] = local535 == 4096 ? 4096 : (local59[local74] << 12) / (4096 - local535);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static73.anInt1626; local74++) {
							local539 = local55[local74];
							local535 = local63[local74];
							local543 = local47[local74];
							local39[local74] = local543 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local543;
							local43[local74] = local539 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local539;
							local51[local74] = local535 == 0 ? 0 : 4096 - (4096 - local59[local74] << 12) / local535;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static73.anInt1626; local74++) {
							local535 = local63[local74];
							local283 = local59[local74];
							local275 = local67[local74];
							local279 = local71[local74];
							local543 = local47[local74];
							local539 = local55[local74];
							local39[local74] = local543 >= local279 ? local279 : local543;
							local43[local74] = local539 < local275 ? local539 : local275;
							local51[local74] = local283 <= local535 ? local283 : local535;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static73.anInt1626; local74++) {
							local543 = local47[local74];
							local535 = local63[local74];
							local283 = local59[local74];
							local279 = local71[local74];
							local275 = local67[local74];
							local539 = local55[local74];
							local39[local74] = local543 > local279 ? local543 : local279;
							local43[local74] = local539 > local275 ? local539 : local275;
							local51[local74] = local535 > local283 ? local535 : local283;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static73.anInt1626; local74++) {
							local279 = local71[local74];
							local275 = local67[local74];
							local535 = local63[local74];
							local283 = local59[local74];
							local543 = local47[local74];
							local539 = local55[local74];
							local39[local74] = local543 <= local279 ? local279 - local543 : -local279 + local543;
							local43[local74] = local539 <= local275 ? local275 - local539 : -local275 + local539;
							local51[local74] = local535 <= local283 ? local283 - local535 : -local283 + local535;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static73.anInt1626; local74++) {
							local539 = local55[local74];
							local535 = local63[local74];
							local279 = local71[local74];
							local283 = local59[local74];
							local543 = local47[local74];
							local275 = local67[local74];
							local39[local74] = local279 + local543 - (local279 * local543 >> 11);
							local43[local74] = local275 + local539 - (local539 * local275 >> 11);
							local51[local74] = local535 + local283 - (local283 * local535 >> 11);
						}
					}
				}
			}
		}
		return local18;
	}
}
