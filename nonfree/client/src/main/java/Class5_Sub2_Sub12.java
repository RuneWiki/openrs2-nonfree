import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	private int anInt1800 = 6;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub12() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLclient!bk;I)V")
	@Override
	public void method5813(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1800 = arg0.method1832();
		} else if (arg1 == 1) {
			super.aBoolean488 = arg0.method1832() == 1;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5806(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass154_41.method4027(arg0);
		if (super.aClass154_41.aBoolean336) {
			@Pc(21) int[][] local21 = this.method5818(arg0, 0);
			@Pc(27) int[][] local27 = this.method5818(arg0, 1);
			@Pc(31) int[] local31 = local11[0];
			@Pc(35) int[] local35 = local11[1];
			@Pc(39) int[] local39 = local11[2];
			@Pc(43) int[] local43 = local21[0];
			@Pc(47) int[] local47 = local21[1];
			@Pc(51) int[] local51 = local21[2];
			@Pc(55) int[] local55 = local27[0];
			@Pc(59) int[] local59 = local27[1];
			@Pc(63) int[] local63 = local27[2];
			@Pc(66) int local66 = this.anInt1800;
			if (local66 == 1) {
				for (local66 = 0; local66 < Static15.anInt493; local66++) {
					local31[local66] = local55[local66] + local43[local66];
					local35[local66] = local47[local66] + local59[local66];
					local39[local66] = local63[local66] + local51[local66];
				}
			} else if (local66 == 2) {
				for (local66 = 0; local66 < Static15.anInt493; local66++) {
					local31[local66] = local43[local66] - local55[local66];
					local35[local66] = local47[local66] - local59[local66];
					local39[local66] = local51[local66] - local63[local66];
				}
			} else if (local66 == 3) {
				for (local66 = 0; local66 < Static15.anInt493; local66++) {
					local31[local66] = local43[local66] * local55[local66] >> 12;
					local35[local66] = local47[local66] * local59[local66] >> 12;
					local39[local66] = local51[local66] * local63[local66] >> 12;
				}
			} else {
				@Pc(269) int local269;
				@Pc(265) int local265;
				@Pc(261) int local261;
				if (local66 == 4) {
					for (local66 = 0; local66 < Static15.anInt493; local66++) {
						local261 = local63[local66];
						local265 = local59[local66];
						local269 = local55[local66];
						local31[local66] = local269 == 0 ? 4096 : (local43[local66] << 12) / local269;
						local35[local66] = local265 == 0 ? 4096 : (local47[local66] << 12) / local265;
						local39[local66] = local261 == 0 ? 4096 : (local51[local66] << 12) / local261;
					}
				} else if (local66 == 5) {
					for (local66 = 0; local66 < Static15.anInt493; local66++) {
						local31[local66] = 4096 - ((4096 - local55[local66]) * (4096 - local43[local66]) >> 12);
						local35[local66] = 4096 - ((4096 - local47[local66]) * (4096 - local59[local66]) >> 12);
						local39[local66] = 4096 - ((4096 - local51[local66]) * (-local63[local66] + 4096) >> 12);
					}
				} else if (local66 == 6) {
					for (local66 = 0; local66 < Static15.anInt493; local66++) {
						local265 = local59[local66];
						local261 = local63[local66];
						local269 = local55[local66];
						local31[local66] = local269 < 2048 ? local43[local66] * local269 >> 11 : 4096 - ((4096 - local43[local66]) * (-local269 + 4096) >> 11);
						local35[local66] = local265 >= 2048 ? 4096 - ((4096 - local265) * (-local47[local66] + 4096) >> 11) : local47[local66] * local265 >> 11;
						local39[local66] = local261 < 2048 ? local261 * local51[local66] >> 11 : 4096 - ((4096 - local51[local66]) * (-local261 + 4096) >> 11);
					}
				} else {
					@Pc(518) int local518;
					@Pc(522) int local522;
					@Pc(514) int local514;
					if (local66 == 7) {
						for (local66 = 0; local66 < Static15.anInt493; local66++) {
							local514 = local51[local66];
							local518 = local43[local66];
							local522 = local47[local66];
							local31[local66] = local518 == 4096 ? 4096 : (local55[local66] << 12) / (4096 - local518);
							local35[local66] = local522 == 4096 ? 4096 : (local59[local66] << 12) / (4096 - local522);
							local39[local66] = local514 == 4096 ? 4096 : (local63[local66] << 12) / (4096 - local514);
						}
					} else if (local66 == 8) {
						for (local66 = 0; local66 < Static15.anInt493; local66++) {
							local518 = local43[local66];
							local514 = local51[local66];
							local522 = local47[local66];
							local31[local66] = local518 == 0 ? 0 : 4096 - (4096 - local55[local66] << 12) / local518;
							local35[local66] = local522 == 0 ? 0 : 4096 - (4096 - local59[local66] << 12) / local522;
							local39[local66] = local514 == 0 ? 0 : 4096 - (4096 - local63[local66] << 12) / local514;
						}
					} else if (local66 == 9) {
						for (local66 = 0; local66 < Static15.anInt493; local66++) {
							local522 = local47[local66];
							local518 = local43[local66];
							local514 = local51[local66];
							local261 = local63[local66];
							local269 = local55[local66];
							local265 = local59[local66];
							local31[local66] = local518 < local269 ? local518 : local269;
							local35[local66] = local522 < local265 ? local522 : local265;
							local39[local66] = local261 > local514 ? local514 : local261;
						}
					} else if (local66 == 10) {
						for (local66 = 0; local66 < Static15.anInt493; local66++) {
							local265 = local59[local66];
							local518 = local43[local66];
							local269 = local55[local66];
							local514 = local51[local66];
							local261 = local63[local66];
							local522 = local47[local66];
							local31[local66] = local518 <= local269 ? local269 : local518;
							local35[local66] = local265 < local522 ? local522 : local265;
							local39[local66] = local514 > local261 ? local514 : local261;
						}
					} else if (local66 == 11) {
						for (local66 = 0; local66 < Static15.anInt493; local66++) {
							local269 = local55[local66];
							local522 = local47[local66];
							local265 = local59[local66];
							local518 = local43[local66];
							local514 = local51[local66];
							local261 = local63[local66];
							local31[local66] = local518 <= local269 ? local269 - local518 : -local269 + local518;
							local35[local66] = local265 < local522 ? local522 - local265 : -local522 + local265;
							local39[local66] = local261 >= local514 ? local261 - local514 : local514 + -local261;
						}
					} else if (local66 == 12) {
						for (local66 = 0; local66 < Static15.anInt493; local66++) {
							local265 = local59[local66];
							local261 = local63[local66];
							local514 = local51[local66];
							local522 = local47[local66];
							local269 = local55[local66];
							local518 = local43[local66];
							local31[local66] = local518 + local269 - (local269 * local518 >> 11);
							local35[local66] = local522 + local265 - (local265 * local522 >> 11);
							local39[local66] = local261 + local514 - (local261 * local514 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass52_41.method1260(arg0);
		if (super.aClass52_41.aBoolean95) {
			@Pc(25) int[] local25 = this.method5808(0, arg0);
			@Pc(31) int[] local31 = this.method5808(1, arg0);
			@Pc(34) int local34 = this.anInt1800;
			if (local34 == 1) {
				for (local34 = 0; local34 < Static15.anInt493; local34++) {
					local15[local34] = local31[local34] + local25[local34];
				}
			} else if (local34 == 2) {
				for (local34 = 0; local34 < Static15.anInt493; local34++) {
					local15[local34] = local25[local34] - local31[local34];
				}
			} else if (local34 == 3) {
				for (local34 = 0; local34 < Static15.anInt493; local34++) {
					local15[local34] = local31[local34] * local25[local34] >> 12;
				}
			} else {
				@Pc(160) int local160;
				if (local34 == 4) {
					for (local34 = 0; local34 < Static15.anInt493; local34++) {
						local160 = local31[local34];
						local15[local34] = local160 == 0 ? 4096 : (local25[local34] << 12) / local160;
					}
				} else if (local34 == 5) {
					for (local34 = 0; local34 < Static15.anInt493; local34++) {
						local15[local34] = 4096 - ((4096 - local25[local34]) * (-local31[local34] + 4096) >> 12);
					}
				} else if (local34 == 6) {
					for (local34 = 0; local34 < Static15.anInt493; local34++) {
						local160 = local31[local34];
						local15[local34] = local160 >= 2048 ? 4096 - ((4096 - local160) * (-local25[local34] + 4096) >> 11) : local25[local34] * local160 >> 11;
					}
				} else {
					@Pc(271) int local271;
					if (local34 == 7) {
						for (local34 = 0; local34 < Static15.anInt493; local34++) {
							local271 = local25[local34];
							local15[local34] = local271 == 4096 ? 4096 : (local31[local34] << 12) / (4096 - local271);
						}
					} else if (local34 == 8) {
						for (local34 = 0; local34 < Static15.anInt493; local34++) {
							local271 = local25[local34];
							local15[local34] = local271 == 0 ? 0 : 4096 - (4096 - local31[local34] << 12) / local271;
						}
					} else if (local34 == 9) {
						for (local34 = 0; local34 < Static15.anInt493; local34++) {
							local271 = local25[local34];
							local160 = local31[local34];
							local15[local34] = local271 >= local160 ? local160 : local271;
						}
					} else if (local34 == 10) {
						for (local34 = 0; local34 < Static15.anInt493; local34++) {
							local271 = local25[local34];
							local160 = local31[local34];
							local15[local34] = local160 >= local271 ? local160 : local271;
						}
					} else if (local34 == 11) {
						for (local34 = 0; local34 < Static15.anInt493; local34++) {
							local271 = local25[local34];
							local160 = local31[local34];
							local15[local34] = local271 <= local160 ? local160 - local271 : -local160 + local271;
						}
					} else if (local34 == 12) {
						for (local34 = 0; local34 < Static15.anInt493; local34++) {
							local271 = local25[local34];
							local160 = local31[local34];
							local15[local34] = local160 + local271 - (local160 * local271 >> 11);
						}
					}
				}
			}
		}
		return local15;
	}
}
