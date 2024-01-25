import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class6_Sub4_Sub30 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
	private int anInt8076 = 6;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub30() {
		super(2, false);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(29) int[][] local29 = this.method7747(arg0, 0);
			@Pc(35) int[][] local35 = this.method7747(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt8076;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static408.anInt7209; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static408.anInt7209; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static408.anInt7209; local74++) {
					local39[local74] = local51[local74] * local63[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(274) int local274;
				@Pc(278) int local278;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static408.anInt7209; local74++) {
						local270 = local63[local74];
						local274 = local67[local74];
						local278 = local71[local74];
						local39[local74] = local270 == 0 ? 4096 : (local51[local74] << 12) / local270;
						local43[local74] = local274 == 0 ? 4096 : (local55[local74] << 12) / local274;
						local47[local74] = local278 == 0 ? 4096 : (local59[local74] << 12) / local278;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static408.anInt7209; local74++) {
						local39[local74] = 4096 - ((4096 - local63[local74]) * (-local51[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (-local55[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local59[local74]) * (-local71[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static408.anInt7209; local74++) {
						local270 = local63[local74];
						local278 = local71[local74];
						local274 = local67[local74];
						local39[local74] = local270 >= 2048 ? 4096 - ((4096 - local270) * (-local51[local74] + 4096) >> 11) : local270 * local51[local74] >> 11;
						local43[local74] = local274 < 2048 ? local274 * local55[local74] >> 11 : 4096 - ((4096 - local274) * (-local55[local74] + 4096) >> 11);
						local47[local74] = local278 >= 2048 ? 4096 - ((4096 - local278) * (-local59[local74] + 4096) >> 11) : local59[local74] * local278 >> 11;
					}
				} else {
					@Pc(528) int local528;
					@Pc(532) int local532;
					@Pc(536) int local536;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static408.anInt7209; local74++) {
							local528 = local51[local74];
							local532 = local55[local74];
							local536 = local59[local74];
							local39[local74] = local528 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local528);
							local43[local74] = local532 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local532);
							local47[local74] = local536 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local536);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static408.anInt7209; local74++) {
							local536 = local59[local74];
							local532 = local55[local74];
							local528 = local51[local74];
							local39[local74] = local528 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local528;
							local43[local74] = local532 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local532;
							local47[local74] = local536 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local536;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static408.anInt7209; local74++) {
							local270 = local63[local74];
							local528 = local51[local74];
							local536 = local59[local74];
							local278 = local71[local74];
							local274 = local67[local74];
							local532 = local55[local74];
							local39[local74] = local528 < local270 ? local528 : local270;
							local43[local74] = local532 < local274 ? local532 : local274;
							local47[local74] = local536 < local278 ? local536 : local278;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static408.anInt7209; local74++) {
							local274 = local67[local74];
							local536 = local59[local74];
							local278 = local71[local74];
							local270 = local63[local74];
							local528 = local51[local74];
							local532 = local55[local74];
							local39[local74] = local528 > local270 ? local528 : local270;
							local43[local74] = local274 >= local532 ? local274 : local532;
							local47[local74] = local536 > local278 ? local536 : local278;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static408.anInt7209; local74++) {
							local528 = local51[local74];
							local536 = local59[local74];
							local278 = local71[local74];
							local274 = local67[local74];
							local270 = local63[local74];
							local532 = local55[local74];
							local39[local74] = local528 <= local270 ? local270 - local528 : local528 - local270;
							local43[local74] = local274 < local532 ? local532 - local274 : -local532 + local274;
							local47[local74] = local278 >= local536 ? local278 - local536 : -local278 + local536;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static408.anInt7209; local74++) {
							local278 = local71[local74];
							local536 = local59[local74];
							local270 = local63[local74];
							local532 = local55[local74];
							local528 = local51[local74];
							local274 = local67[local74];
							local39[local74] = local528 + local270 - (local528 * local270 >> 11);
							local43[local74] = local532 + local274 - (local532 * local274 >> 11);
							local47[local74] = local278 + local536 - (local536 * local278 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt8076 = arg1.method6069();
		} else if (arg0 == 1) {
			super.aBoolean728 = arg1.method6069() == 1;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(29) int[] local29 = this.method7748(0, arg0);
			@Pc(35) int[] local35 = this.method7748(1, arg0);
			@Pc(38) int local38 = this.anInt8076;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static408.anInt7209; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static408.anInt7209; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static408.anInt7209; local38++) {
					local19[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(163) int local163;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static408.anInt7209; local38++) {
						local163 = local35[local38];
						local19[local38] = local163 == 0 ? 4096 : (local29[local38] << 12) / local163;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static408.anInt7209; local38++) {
						local19[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static408.anInt7209; local38++) {
						local163 = local35[local38];
						local19[local38] = local163 < 2048 ? local163 * local29[local38] >> 11 : 4096 - ((4096 - local163) * (4096 - local29[local38]) >> 11);
					}
				} else {
					@Pc(274) int local274;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static408.anInt7209; local38++) {
							local274 = local29[local38];
							local19[local38] = local274 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local274);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static408.anInt7209; local38++) {
							local274 = local29[local38];
							local19[local38] = local274 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local274;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static408.anInt7209; local38++) {
							local163 = local35[local38];
							local274 = local29[local38];
							local19[local38] = local163 <= local274 ? local163 : local274;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static408.anInt7209; local38++) {
							local163 = local35[local38];
							local274 = local29[local38];
							local19[local38] = local163 >= local274 ? local163 : local274;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static408.anInt7209; local38++) {
							local274 = local29[local38];
							local163 = local35[local38];
							local19[local38] = local163 < local274 ? local274 - local163 : -local274 + local163;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static408.anInt7209; local38++) {
							local163 = local35[local38];
							local274 = local29[local38];
							local19[local38] = local274 + local163 - (local274 * local163 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}
}
