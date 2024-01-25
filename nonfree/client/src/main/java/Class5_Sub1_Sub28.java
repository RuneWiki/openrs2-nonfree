import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class5_Sub1_Sub28 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
	private int anInt7129 = 6;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub28() {
		super(2, false);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method7163(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass249_41.method5989(arg0);
		if (super.aClass249_41.aBoolean520) {
			@Pc(29) int[][] local29 = this.method7154(0, arg0);
			@Pc(35) int[][] local35 = this.method7154(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt7129;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static147.anInt3075; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local67[local74] + local55[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static147.anInt3075; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static147.anInt3075; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local55[local74] * local67[local74] >> 12;
					local47[local74] = local71[local74] * local59[local74] >> 12;
				}
			} else {
				@Pc(274) int local274;
				@Pc(270) int local270;
				@Pc(266) int local266;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static147.anInt3075; local74++) {
						local266 = local71[local74];
						local270 = local67[local74];
						local274 = local63[local74];
						local39[local74] = local274 == 0 ? 4096 : (local51[local74] << 12) / local274;
						local43[local74] = local270 == 0 ? 4096 : (local55[local74] << 12) / local270;
						local47[local74] = local266 == 0 ? 4096 : (local59[local74] << 12) / local266;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static147.anInt3075; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (4096 - local71[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static147.anInt3075; local74++) {
						local274 = local63[local74];
						local266 = local71[local74];
						local270 = local67[local74];
						local39[local74] = local274 < 2048 ? local51[local74] * local274 >> 11 : 4096 - ((4096 - local274) * (-local51[local74] + 4096) >> 11);
						local43[local74] = local270 >= 2048 ? 4096 - ((4096 - local270) * (-local55[local74] + 4096) >> 11) : local55[local74] * local270 >> 11;
						local47[local74] = local266 < 2048 ? local266 * local59[local74] >> 11 : 4096 - ((4096 - local266) * (4096 - local59[local74]) >> 11);
					}
				} else {
					@Pc(524) int local524;
					@Pc(520) int local520;
					@Pc(528) int local528;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static147.anInt3075; local74++) {
							local520 = local55[local74];
							local524 = local51[local74];
							local528 = local59[local74];
							local39[local74] = local524 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local524);
							local43[local74] = local520 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local520);
							local47[local74] = local528 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local528);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static147.anInt3075; local74++) {
							local528 = local59[local74];
							local524 = local51[local74];
							local520 = local55[local74];
							local39[local74] = local524 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local524;
							local43[local74] = local520 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local520;
							local47[local74] = local528 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local528;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static147.anInt3075; local74++) {
							local524 = local51[local74];
							local520 = local55[local74];
							local266 = local71[local74];
							local528 = local59[local74];
							local274 = local63[local74];
							local270 = local67[local74];
							local39[local74] = local524 < local274 ? local524 : local274;
							local43[local74] = local270 <= local520 ? local270 : local520;
							local47[local74] = local266 <= local528 ? local266 : local528;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static147.anInt3075; local74++) {
							local520 = local55[local74];
							local274 = local63[local74];
							local524 = local51[local74];
							local528 = local59[local74];
							local270 = local67[local74];
							local266 = local71[local74];
							local39[local74] = local274 >= local524 ? local274 : local524;
							local43[local74] = local270 >= local520 ? local270 : local520;
							local47[local74] = local528 > local266 ? local528 : local266;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static147.anInt3075; local74++) {
							local528 = local59[local74];
							local270 = local67[local74];
							local524 = local51[local74];
							local266 = local71[local74];
							local274 = local63[local74];
							local520 = local55[local74];
							local39[local74] = local524 <= local274 ? local274 - local524 : -local274 + local524;
							local43[local74] = local520 <= local270 ? local270 - local520 : local520 - local270;
							local47[local74] = local266 < local528 ? local528 - local266 : -local528 + local266;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static147.anInt3075; local74++) {
							local270 = local67[local74];
							local524 = local51[local74];
							local528 = local59[local74];
							local520 = local55[local74];
							local274 = local63[local74];
							local266 = local71[local74];
							local39[local74] = local274 + local524 - (local524 * local274 >> 11);
							local43[local74] = local520 + local270 - (local520 * local270 >> 11);
							local47[local74] = local266 + local528 - (local528 * local266 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt7129 = arg1.method4220();
		} else if (arg0 == 1) {
			super.aBoolean642 = arg1.method4220() == 1;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(29) int[] local29 = this.method7160(0, arg0);
			@Pc(35) int[] local35 = this.method7160(1, arg0);
			@Pc(38) int local38 = this.anInt7129;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static147.anInt3075; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static147.anInt3075; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static147.anInt3075; local38++) {
					local19[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(164) int local164;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static147.anInt3075; local38++) {
						local164 = local35[local38];
						local19[local38] = local164 == 0 ? 4096 : (local29[local38] << 12) / local164;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static147.anInt3075; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static147.anInt3075; local38++) {
						local164 = local35[local38];
						local19[local38] = local164 < 2048 ? local29[local38] * local164 >> 11 : 4096 - ((4096 - local164) * (-local29[local38] + 4096) >> 11);
					}
				} else {
					@Pc(277) int local277;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static147.anInt3075; local38++) {
							local277 = local29[local38];
							local19[local38] = local277 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local277);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static147.anInt3075; local38++) {
							local277 = local29[local38];
							local19[local38] = local277 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local277;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static147.anInt3075; local38++) {
							local277 = local29[local38];
							local164 = local35[local38];
							local19[local38] = local277 >= local164 ? local164 : local277;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static147.anInt3075; local38++) {
							local164 = local35[local38];
							local277 = local29[local38];
							local19[local38] = local164 < local277 ? local277 : local164;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static147.anInt3075; local38++) {
							local277 = local29[local38];
							local164 = local35[local38];
							local19[local38] = local164 < local277 ? local277 - local164 : local164 + -local277;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static147.anInt3075; local38++) {
							local277 = local29[local38];
							local164 = local35[local38];
							local19[local38] = local277 + local164 - (local277 * local164 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
