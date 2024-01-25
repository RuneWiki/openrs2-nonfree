import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class3_Sub1_Sub29 extends Class3_Sub1 {

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	private int anInt7996 = 6;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub29() {
		super(2, false);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt7996 = arg1.method6538();
		} else if (arg0 == 1) {
			super.aBoolean850 = arg1.method6538() == 1;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method8371(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5791(arg0);
		if (super.aClass220_41.aBoolean587) {
			@Pc(21) int[][] local21 = this.method8360(0, arg0);
			@Pc(27) int[][] local27 = this.method8360(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt7996;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static131.anInt2935; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static131.anInt2935; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static131.anInt2935; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local59[local66] * local47[local66] >> 12;
					local39[local66] = local63[local66] * local51[local66] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(269) int local269;
				@Pc(261) int local261;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static131.anInt2935; local66++) {
						local261 = local63[local66];
						local265 = local55[local66];
						local269 = local59[local66];
						local31[local66] = local265 == 0 ? 4096 : (local43[local66] << 12) / local265;
						local35[local66] = local269 == 0 ? 4096 : (local47[local66] << 12) / local269;
						local39[local66] = local261 == 0 ? 4096 : (local51[local66] << 12) / local261;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static131.anInt2935; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (4096 - local51[local66]) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static131.anInt2935; local66++) {
						local269 = local59[local66];
						local261 = local63[local66];
						local265 = local55[local66];
						local31[local66] = local265 < 2048 ? local265 * local43[local66] >> 11 : 4096 - ((4096 - local43[local66]) * (-local265 + 4096) >> 11);
						local35[local66] = local269 < 2048 ? local269 * local47[local66] >> 11 : 4096 - ((4096 - local269) * (-local47[local66] + 4096) >> 11);
						local39[local66] = local261 < 2048 ? local261 * local51[local66] >> 11 : 4096 - ((4096 - local261) * (-local51[local66] + 4096) >> 11);
					}
				} else {
					@Pc(526) int local526;
					@Pc(522) int local522;
					@Pc(518) int local518;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static131.anInt2935; local66++) {
							local518 = local51[local66];
							local522 = local47[local66];
							local526 = local43[local66];
							local31[local66] = local526 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local526);
							local35[local66] = local522 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local522);
							local39[local66] = local518 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local518);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static131.anInt2935; local66++) {
							local526 = local43[local66];
							local518 = local51[local66];
							local522 = local47[local66];
							local31[local66] = local526 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local526;
							local35[local66] = local522 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local522;
							local39[local66] = local518 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local518;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static131.anInt2935; local66++) {
							local518 = local51[local66];
							local526 = local43[local66];
							local522 = local47[local66];
							local265 = local55[local66];
							local269 = local59[local66];
							local261 = local63[local66];
							local31[local66] = local265 <= local526 ? local265 : local526;
							local35[local66] = local522 < local269 ? local522 : local269;
							local39[local66] = local261 > local518 ? local518 : local261;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static131.anInt2935; local66++) {
							local526 = local43[local66];
							local265 = local55[local66];
							local269 = local59[local66];
							local261 = local63[local66];
							local518 = local51[local66];
							local522 = local47[local66];
							local31[local66] = local526 > local265 ? local526 : local265;
							local35[local66] = local269 < local522 ? local522 : local269;
							local39[local66] = local261 < local518 ? local518 : local261;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static131.anInt2935; local66++) {
							local526 = local43[local66];
							local261 = local63[local66];
							local518 = local51[local66];
							local522 = local47[local66];
							local265 = local55[local66];
							local269 = local59[local66];
							local31[local66] = local526 <= local265 ? local265 - local526 : local526 - local265;
							local35[local66] = local522 <= local269 ? local269 - local522 : local522 + -local269;
							local39[local66] = local261 < local518 ? local518 - local261 : -local518 + local261;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static131.anInt2935; local66++) {
							local265 = local55[local66];
							local261 = local63[local66];
							local526 = local43[local66];
							local269 = local59[local66];
							local518 = local51[local66];
							local522 = local47[local66];
							local31[local66] = local526 + local265 - (local265 * local526 >> 11);
							local35[local66] = local522 + local269 - (local269 * local522 >> 11);
							local39[local66] = local261 + local518 - (local261 * local518 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(26) int[] local26 = this.method8362(arg0, 0);
			@Pc(32) int[] local32 = this.method8362(arg0, 1);
			@Pc(35) int local35 = this.anInt7996;
			if (local35 == 1) {
				for (local35 = 0; local35 < Static131.anInt2935; local35++) {
					local16[local35] = local26[local35] + local32[local35];
				}
			} else if (local35 == 2) {
				for (local35 = 0; local35 < Static131.anInt2935; local35++) {
					local16[local35] = local26[local35] - local32[local35];
				}
			} else if (local35 == 3) {
				for (local35 = 0; local35 < Static131.anInt2935; local35++) {
					local16[local35] = local26[local35] * local32[local35] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local35 == 4) {
					for (local35 = 0; local35 < Static131.anInt2935; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 == 0 ? 4096 : (local26[local35] << 12) / local160;
					}
				} else if (local35 == 5) {
					for (local35 = 0; local35 < Static131.anInt2935; local35++) {
						local16[local35] = 4096 - ((4096 - local32[local35]) * (-local26[local35] + 4096) >> 12);
					}
				} else if (local35 == 6) {
					for (local35 = 0; local35 < Static131.anInt2935; local35++) {
						local160 = local32[local35];
						local16[local35] = local160 < 2048 ? local160 * local26[local35] >> 11 : 4096 - ((4096 - local26[local35]) * (-local160 + 4096) >> 11);
					}
				} else {
					@Pc(270) int local270;
					if (local35 == 7) {
						for (local35 = 0; local35 < Static131.anInt2935; local35++) {
							local270 = local26[local35];
							local16[local35] = local270 == 4096 ? 4096 : (local32[local35] << 12) / (4096 - local270);
						}
					} else if (local35 == 8) {
						for (local35 = 0; local35 < Static131.anInt2935; local35++) {
							local270 = local26[local35];
							local16[local35] = local270 == 0 ? 0 : 4096 - (4096 - local32[local35] << 12) / local270;
						}
					} else if (local35 == 9) {
						for (local35 = 0; local35 < Static131.anInt2935; local35++) {
							local270 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local160 > local270 ? local270 : local160;
						}
					} else if (local35 == 10) {
						for (local35 = 0; local35 < Static131.anInt2935; local35++) {
							local270 = local26[local35];
							local160 = local32[local35];
							local16[local35] = local270 <= local160 ? local160 : local270;
						}
					} else if (local35 == 11) {
						for (local35 = 0; local35 < Static131.anInt2935; local35++) {
							local160 = local32[local35];
							local270 = local26[local35];
							local16[local35] = local160 < local270 ? local270 - local160 : local160 + -local270;
						}
					} else if (local35 == 12) {
						for (local35 = 0; local35 < Static131.anInt2935; local35++) {
							local160 = local32[local35];
							local270 = local26[local35];
							local16[local35] = local270 + local160 - (local270 * local160 >> 11);
						}
					}
				}
			}
		}
		return local16;
	}
}
