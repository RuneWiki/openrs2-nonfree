import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class6_Sub3_Sub21 extends Class6_Sub3 {

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
	private int anInt5593 = 6;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub21() {
		super(2, false);
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(29) int[] local29 = this.method7824(0, arg0);
			@Pc(35) int[] local35 = this.method7824(1, arg0);
			@Pc(38) int local38 = this.anInt5593;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static447.anInt8568; local38++) {
					local11[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static447.anInt8568; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static447.anInt8568; local38++) {
					local11[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(173) int local173;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static447.anInt8568; local38++) {
						local173 = local35[local38];
						local11[local38] = local173 == 0 ? 4096 : (local29[local38] << 12) / local173;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static447.anInt8568; local38++) {
						local11[local38] = 4096 - ((4096 - local35[local38]) * (4096 - local29[local38]) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static447.anInt8568; local38++) {
						local173 = local35[local38];
						local11[local38] = local173 >= 2048 ? 4096 - ((4096 - local173) * (-local29[local38] + 4096) >> 11) : local173 * local29[local38] >> 11;
					}
				} else {
					@Pc(281) int local281;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static447.anInt8568; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local281);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static447.anInt8568; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local281;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static447.anInt8568; local38++) {
							local281 = local29[local38];
							local173 = local35[local38];
							local11[local38] = local173 > local281 ? local281 : local173;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static447.anInt8568; local38++) {
							local173 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local173 < local281 ? local281 : local173;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static447.anInt8568; local38++) {
							local173 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 <= local173 ? local173 - local281 : local281 - local173;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static447.anInt8568; local38++) {
							local173 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local173 + local281 - (local281 * local173 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5593 = arg1.method6041();
		} else if (arg0 == 1) {
			super.aBoolean668 = arg1.method6041() == 1;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(29) int[][] local29 = this.method7823(0, arg0);
			@Pc(35) int[][] local35 = this.method7823(1, arg0);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[1];
			@Pc(71) int[] local71 = local35[2];
			@Pc(74) int local74 = this.anInt5593;
			if (local74 == 1) {
				for (local74 = 0; local74 < Static447.anInt8568; local74++) {
					local39[local74] = local63[local74] + local51[local74];
					local43[local74] = local55[local74] + local67[local74];
					local47[local74] = local59[local74] + local71[local74];
				}
			} else if (local74 == 2) {
				for (local74 = 0; local74 < Static447.anInt8568; local74++) {
					local39[local74] = local51[local74] - local63[local74];
					local43[local74] = local55[local74] - local67[local74];
					local47[local74] = local59[local74] - local71[local74];
				}
			} else if (local74 == 3) {
				for (local74 = 0; local74 < Static447.anInt8568; local74++) {
					local39[local74] = local63[local74] * local51[local74] >> 12;
					local43[local74] = local67[local74] * local55[local74] >> 12;
					local47[local74] = local59[local74] * local71[local74] >> 12;
				}
			} else {
				@Pc(268) int local268;
				@Pc(264) int local264;
				@Pc(260) int local260;
				if (local74 == 4) {
					for (local74 = 0; local74 < Static447.anInt8568; local74++) {
						local260 = local71[local74];
						local264 = local67[local74];
						local268 = local63[local74];
						local39[local74] = local268 == 0 ? 4096 : (local51[local74] << 12) / local268;
						local43[local74] = local264 == 0 ? 4096 : (local55[local74] << 12) / local264;
						local47[local74] = local260 == 0 ? 4096 : (local59[local74] << 12) / local260;
					}
				} else if (local74 == 5) {
					for (local74 = 0; local74 < Static447.anInt8568; local74++) {
						local39[local74] = 4096 - ((4096 - local51[local74]) * (-local63[local74] + 4096) >> 12);
						local43[local74] = 4096 - ((4096 - local67[local74]) * (4096 - local55[local74]) >> 12);
						local47[local74] = 4096 - ((4096 - local71[local74]) * (4096 - local59[local74]) >> 12);
					}
				} else if (local74 == 6) {
					for (local74 = 0; local74 < Static447.anInt8568; local74++) {
						local268 = local63[local74];
						local264 = local67[local74];
						local260 = local71[local74];
						local39[local74] = local268 >= 2048 ? 4096 - ((4096 - local268) * (-local51[local74] + 4096) >> 11) : local51[local74] * local268 >> 11;
						local43[local74] = local264 < 2048 ? local55[local74] * local264 >> 11 : 4096 - ((4096 - local55[local74]) * (-local264 + 4096) >> 11);
						local47[local74] = local260 < 2048 ? local260 * local59[local74] >> 11 : 4096 - ((4096 - local59[local74]) * (4096 - local260) >> 11);
					}
				} else {
					@Pc(518) int local518;
					@Pc(522) int local522;
					@Pc(514) int local514;
					if (local74 == 7) {
						for (local74 = 0; local74 < Static447.anInt8568; local74++) {
							local514 = local59[local74];
							local518 = local51[local74];
							local522 = local55[local74];
							local39[local74] = local518 == 4096 ? 4096 : (local63[local74] << 12) / (4096 - local518);
							local43[local74] = local522 == 4096 ? 4096 : (local67[local74] << 12) / (4096 - local522);
							local47[local74] = local514 == 4096 ? 4096 : (local71[local74] << 12) / (4096 - local514);
						}
					} else if (local74 == 8) {
						for (local74 = 0; local74 < Static447.anInt8568; local74++) {
							local514 = local59[local74];
							local522 = local55[local74];
							local518 = local51[local74];
							local39[local74] = local518 == 0 ? 0 : 4096 - (4096 - local63[local74] << 12) / local518;
							local43[local74] = local522 == 0 ? 0 : 4096 - (4096 - local67[local74] << 12) / local522;
							local47[local74] = local514 == 0 ? 0 : 4096 - (4096 - local71[local74] << 12) / local514;
						}
					} else if (local74 == 9) {
						for (local74 = 0; local74 < Static447.anInt8568; local74++) {
							local522 = local55[local74];
							local260 = local71[local74];
							local264 = local67[local74];
							local518 = local51[local74];
							local514 = local59[local74];
							local268 = local63[local74];
							local39[local74] = local518 < local268 ? local518 : local268;
							local43[local74] = local264 > local522 ? local522 : local264;
							local47[local74] = local260 <= local514 ? local260 : local514;
						}
					} else if (local74 == 10) {
						for (local74 = 0; local74 < Static447.anInt8568; local74++) {
							local268 = local63[local74];
							local518 = local51[local74];
							local260 = local71[local74];
							local522 = local55[local74];
							local264 = local67[local74];
							local514 = local59[local74];
							local39[local74] = local518 <= local268 ? local268 : local518;
							local43[local74] = local264 >= local522 ? local264 : local522;
							local47[local74] = local260 >= local514 ? local260 : local514;
						}
					} else if (local74 == 11) {
						for (local74 = 0; local74 < Static447.anInt8568; local74++) {
							local518 = local51[local74];
							local268 = local63[local74];
							local264 = local67[local74];
							local514 = local59[local74];
							local522 = local55[local74];
							local260 = local71[local74];
							local39[local74] = local268 >= local518 ? local268 - local518 : -local268 + local518;
							local43[local74] = local522 > local264 ? local522 - local264 : -local522 + local264;
							local47[local74] = local514 > local260 ? local514 - local260 : local260 + -local514;
						}
					} else if (local74 == 12) {
						for (local74 = 0; local74 < Static447.anInt8568; local74++) {
							local260 = local71[local74];
							local268 = local63[local74];
							local518 = local51[local74];
							local522 = local55[local74];
							local264 = local67[local74];
							local514 = local59[local74];
							local39[local74] = local518 + local268 - (local268 * local518 >> 11);
							local43[local74] = local522 + local264 - (local522 * local264 >> 11);
							local47[local74] = local260 + local514 - (local260 * local514 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
