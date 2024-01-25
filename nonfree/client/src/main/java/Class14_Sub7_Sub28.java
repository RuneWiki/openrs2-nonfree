import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class14_Sub7_Sub28 extends Class14_Sub7 {

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
	private int anInt7371 = 6;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub28() {
		super(2, false);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(29) int[] local29 = this.method9379(0, arg0);
			@Pc(35) int[] local35 = this.method9379(1, arg0);
			@Pc(38) int local38 = this.anInt7371;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static613.anInt10114; local38++) {
					local19[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static613.anInt10114; local38++) {
					local19[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static613.anInt10114; local38++) {
					local19[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(207) int local207;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static613.anInt10114; local38++) {
						local207 = local35[local38];
						local19[local38] = local207 == 0 ? 4096 : (local29[local38] << 12) / local207;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static613.anInt10114; local38++) {
						local19[local38] = 4096 - ((4096 - local29[local38]) * (4096 - local35[local38]) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static613.anInt10114; local38++) {
						local207 = local35[local38];
						local19[local38] = local207 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local207 + 4096) >> 11) : local29[local38] * local207 >> 11;
					}
				} else {
					@Pc(330) int local330;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static613.anInt10114; local38++) {
							local330 = local29[local38];
							local19[local38] = local330 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local330);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static613.anInt10114; local38++) {
							local330 = local29[local38];
							local19[local38] = local330 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local330;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static613.anInt10114; local38++) {
							local207 = local35[local38];
							local330 = local29[local38];
							local19[local38] = local330 < local207 ? local330 : local207;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static613.anInt10114; local38++) {
							local330 = local29[local38];
							local207 = local35[local38];
							local19[local38] = local207 >= local330 ? local207 : local330;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static613.anInt10114; local38++) {
							local330 = local29[local38];
							local207 = local35[local38];
							local19[local38] = local207 < local330 ? local330 - local207 : local207 - local330;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static613.anInt10114; local38++) {
							local207 = local35[local38];
							local330 = local29[local38];
							local19[local38] = local207 + local330 - (local207 * local330 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(29) int[][] local29 = this.method9384(arg0, 0);
			@Pc(35) int[][] local35 = this.method9384(arg0, 1);
			@Pc(39) int[] local39 = local19[0];
			@Pc(43) int[] local43 = local19[1];
			@Pc(47) int[] local47 = local19[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt7371;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static613.anInt10114; local74++) {
					local39[local74] = local51[local74] + local63[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local71[local74] + local59[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static613.anInt10114; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static613.anInt10114; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(310) int local310;
				@Pc(306) int local306;
				@Pc(314) int local314;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static613.anInt10114; local74++) {
						local306 = local67[local74];
						local310 = local63[local74];
						local314 = local71[local74];
						local39[local74] = local310 == 0 ? 4096 : (local51[local74] << 12) / local310;
						local43[local74] = local306 == 0 ? 4096 : (local55[local74] << 12) / local306;
						local47[local74] = local314 == 0 ? 4096 : (local59[local74] << 12) / local314;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static613.anInt10114; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local55[local74]) * (-local67[local74] + 4096) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (-local59[local74] + 4096) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static613.anInt10114; local74++) {
						local306 = local67[local74];
						local314 = local71[local74];
						local310 = local63[local74];
						local39[local74] = local310 < 2048 ? local51[local74] * local310 >> 11 : 4096 - ((4096 - local310) * (-local51[local74] + 4096) >> 11);
						local43[local74] = local306 >= 2048 ? 4096 - ((4096 - local55[local74]) * (4096 - local306) >> 11) : local55[local74] * local306 >> 11;
						local47[local74] = local314 < 2048 ? local314 * local59[local74] >> 11 : 4096 - ((4096 - local59[local74]) * (-local314 + 4096) >> 11);
					}
				} else {
					@Pc(590) int local590;
					@Pc(594) int local594;
					@Pc(586) int local586;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static613.anInt10114; local74++) {
							local586 = local59[local74];
							local590 = local51[local74];
							local594 = local55[local74];
							local39[local74] = local590 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local590);
							local43[local74] = local594 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local594);
							local47[local74] = local586 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local586);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static613.anInt10114; local74++) {
							local586 = local59[local74];
							local590 = local51[local74];
							local594 = local55[local74];
							local39[local74] = local590 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local590;
							local43[local74] = local594 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local594;
							local47[local74] = local586 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local586;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static613.anInt10114; local74++) {
							local306 = local67[local74];
							local314 = local71[local74];
							local594 = local55[local74];
							local590 = local51[local74];
							local310 = local63[local74];
							local586 = local59[local74];
							local39[local74] = local310 > local590 ? local590 : local310;
							local43[local74] = local306 <= local594 ? local306 : local594;
							local47[local74] = local586 < local314 ? local586 : local314;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static613.anInt10114; local74++) {
							local590 = local51[local74];
							local310 = local63[local74];
							local314 = local71[local74];
							local594 = local55[local74];
							local586 = local59[local74];
							local306 = local67[local74];
							local39[local74] = local310 >= local590 ? local310 : local590;
							local43[local74] = local594 <= local306 ? local306 : local594;
							local47[local74] = local586 <= local314 ? local314 : local586;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static613.anInt10114; local74++) {
							local590 = local51[local74];
							local310 = local63[local74];
							local594 = local55[local74];
							local314 = local71[local74];
							local586 = local59[local74];
							local306 = local67[local74];
							local39[local74] = local590 <= local310 ? local310 - local590 : local590 - local310;
							local43[local74] = local594 > local306 ? local594 - local306 : local306 - local594;
							local47[local74] = local314 >= local586 ? local314 - local586 : local586 + -local314;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static613.anInt10114; local74++) {
							local310 = local63[local74];
							local586 = local59[local74];
							local314 = local71[local74];
							local306 = local67[local74];
							local594 = local55[local74];
							local590 = local51[local74];
							local39[local74] = local590 + local310 - (local310 * local590 >> 11);
							local43[local74] = local594 + local306 - (local306 * local594 >> 11);
							local47[local74] = local586 + local314 - (local314 * local586 >> 11);
						}
					}
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt7371 = arg1.method7695(98);
		} else if (arg0 == 1) {
			super.aBoolean773 = arg1.method7695(103) == 1;
		}
	}
}
