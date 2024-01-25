import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ed", name = "H", descriptor = "I")
	private int anInt2632 = 6;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2632 = arg0.method5633();
		} else if (arg1 == 1) {
			super.aBoolean778 = arg0.method5633() == 1;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(21) int[][] local21 = this.method8672(0, arg0);
			@Pc(27) int[][] local27 = this.method8672(1, arg0);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt2632;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static201.anInt3738; local66++) {
					local31[local66] = local43[local66] + local55[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local51[local66] + local63[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static201.anInt3738; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static201.anInt3738; local66++) {
					local31[local66] = local55[local66] * local43[local66] >> 12;
					local35[local66] = local47[local66] * local59[local66] >> 12;
					local39[local66] = local63[local66] * local51[local66] >> 12;
				}
			} else {
				@Pc(265) int local265;
				@Pc(261) int local261;
				@Pc(269) int local269;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static201.anInt3738; local66++) {
						local261 = local59[local66];
						local265 = local55[local66];
						local269 = local63[local66];
						local31[local66] = local265 == 0 ? 4096 : (local43[local66] << 12) / local265;
						local35[local66] = local261 == 0 ? 4096 : (local47[local66] << 12) / local261;
						local39[local66] = local269 == 0 ? 4096 : (local51[local66] << 12) / local269;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static201.anInt3738; local66++) {
						local31[local66] = 4096 - ((4096 - local43[local66]) * (-local55[local66] + 4096) >> 12);
						local35[local66] = 4096 - ((4096 - local59[local66]) * (-local47[local66] + 4096) >> 12);
						local39[local66] = 4096 - ((4096 - local63[local66]) * (4096 - local51[local66]) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static201.anInt3738; local66++) {
						local261 = local59[local66];
						local269 = local63[local66];
						local265 = local55[local66];
						local31[local66] = local265 >= 2048 ? 4096 - ((4096 - local265) * (-local43[local66] + 4096) >> 11) : local265 * local43[local66] >> 11;
						local35[local66] = local261 < 2048 ? local261 * local47[local66] >> 11 : 4096 - ((4096 - local47[local66]) * (4096 - local261) >> 11);
						local39[local66] = local269 >= 2048 ? 4096 - ((4096 - local51[local66]) * (-local269 + 4096) >> 11) : local269 * local51[local66] >> 11;
					}
				} else {
					@Pc(530) int local530;
					@Pc(522) int local522;
					@Pc(526) int local526;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static201.anInt3738; local66++) {
							local522 = local47[local66];
							local526 = local51[local66];
							local530 = local43[local66];
							local31[local66] = local530 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local530);
							local35[local66] = local522 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local522);
							local39[local66] = local526 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local526);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static201.anInt3738; local66++) {
							local530 = local43[local66];
							local526 = local51[local66];
							local522 = local47[local66];
							local31[local66] = local530 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local530;
							local35[local66] = local522 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local522;
							local39[local66] = local526 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local526;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static201.anInt3738; local66++) {
							local530 = local43[local66];
							local265 = local55[local66];
							local526 = local51[local66];
							local269 = local63[local66];
							local522 = local47[local66];
							local261 = local59[local66];
							local31[local66] = local265 <= local530 ? local265 : local530;
							local35[local66] = local261 <= local522 ? local261 : local522;
							local39[local66] = local269 <= local526 ? local269 : local526;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static201.anInt3738; local66++) {
							local269 = local63[local66];
							local530 = local43[local66];
							local261 = local59[local66];
							local526 = local51[local66];
							local265 = local55[local66];
							local522 = local47[local66];
							local31[local66] = local265 < local530 ? local530 : local265;
							local35[local66] = local522 <= local261 ? local261 : local522;
							local39[local66] = local269 < local526 ? local526 : local269;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static201.anInt3738; local66++) {
							local265 = local55[local66];
							local522 = local47[local66];
							local269 = local63[local66];
							local261 = local59[local66];
							local526 = local51[local66];
							local530 = local43[local66];
							local31[local66] = local530 > local265 ? local530 - local265 : local265 - local530;
							local35[local66] = local522 > local261 ? local522 - local261 : -local522 + local261;
							local39[local66] = local269 >= local526 ? local269 - local526 : local526 - local269;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static201.anInt3738; local66++) {
							local265 = local55[local66];
							local269 = local63[local66];
							local530 = local43[local66];
							local261 = local59[local66];
							local526 = local51[local66];
							local522 = local47[local66];
							local31[local66] = local265 + local530 - (local530 * local265 >> 11);
							local35[local66] = local522 + local261 - (local261 * local522 >> 11);
							local39[local66] = local269 + local526 - (local526 * local269 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(29) int[] local29 = this.method8669(arg0, 0);
			@Pc(35) int[] local35 = this.method8669(arg0, 1);
			@Pc(38) int local38 = this.anInt2632;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static201.anInt3738; local38++) {
					local11[local38] = local29[local38] + local35[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static201.anInt3738; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static201.anInt3738; local38++) {
					local11[local38] = local29[local38] * local35[local38] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static201.anInt3738; local38++) {
						local168 = local35[local38];
						local11[local38] = local168 == 0 ? 4096 : (local29[local38] << 12) / local168;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static201.anInt3738; local38++) {
						local11[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static201.anInt3738; local38++) {
						local168 = local35[local38];
						local11[local38] = local168 >= 2048 ? 4096 - ((4096 - local29[local38]) * (-local168 + 4096) >> 11) : local168 * local29[local38] >> 11;
					}
				} else {
					@Pc(281) int local281;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static201.anInt3738; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local281);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static201.anInt3738; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local281;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static201.anInt3738; local38++) {
							local168 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 >= local168 ? local168 : local281;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static201.anInt3738; local38++) {
							local168 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 > local168 ? local281 : local168;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static201.anInt3738; local38++) {
							local168 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local168 >= local281 ? local168 - local281 : -local168 + local281;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static201.anInt3738; local38++) {
							local168 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local168 + local281 - (local281 * local168 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
